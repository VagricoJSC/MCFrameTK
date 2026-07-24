package mcframe.serverMSBC.MSBCL5020;

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
 * [MSBCL_RqmtRegService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBCL5020.Rqmt_Sprt01.UP.BLOCK0")){
			return MS_MSBCL5020_Rqmt_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL5020.Rqmt_Sprt01.UP.BLOCK1")){
			return MS_MSBCL5020_Rqmt_Sprt01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL5020.Rqmt_Sprt01.DOWN.BLOCK0")){
			return MS_MSBCL5020_Rqmt_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL5020.Rqmt_Chk01.UP.BLOCK0")){
			return MS_MSBCL5020_Rqmt_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL5020.Rqmt_Chk01.UP.BLOCK1")){
			return MS_MSBCL5020_Rqmt_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL5020.Rqmt_Chk01.DOWN.BLOCK0")){
			return MS_MSBCL5020_Rqmt_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL5020.Rqmt_Upd01.UP.BLOCK0")){
			return MS_MSBCL5020_Rqmt_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL5020.Rqmt_Upd01.DOWN.BLOCK0")){
			return MS_MSBCL5020_Rqmt_Upd01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MS_MSBCL5020_Rqmt_Sprt01_INFO = new MCOperationInfo("MS", "MSBCL5020", "Rqmt_Sprt01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL5020_Rqmt_Sprt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL5020", "Rqmt_Sprt01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno1_keep_flg", "sno1_keep_flg"),
				MCItemDef.create("sno2_keep_flg", "sno2_keep_flg"),
				MCItemDef.create("sno3_keep_flg", "sno3_keep_flg"),
				MCItemDef.create("sno4_keep_flg", "sno4_keep_flg"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm")
			}
			,
			MCBlockDef.create("Rqmt_Sprt01_Rslt")
		);
	}

	public static MCContainerDef MS_MSBCL5020_Rqmt_Sprt01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL5020", "Rqmt_Sprt01",
			new MCItemDef[]{
				MCItemDef.create("screen_flg", "screen_flg")
			}
			,
			MCBlockDef.create("Rqmt_Sprt01_Ctrl")
		);
	}


	public static MCContainerDef MS_MSBCL5020_Rqmt_Sprt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL5020", "Rqmt_Sprt01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("sno1_keep_flg", "sno1_keep_flg"),
				MCItemDef.create("sno2_keep_flg", "sno2_keep_flg"),
				MCItemDef.create("sno3_keep_flg", "sno3_keep_flg"),
				MCItemDef.create("sno4_keep_flg", "sno4_keep_flg"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm")
			}
			,
			MCBlockDef.create("Rqmt_Sprt01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL5020_Rqmt_Chk01_INFO = new MCOperationInfo("MS", "MSBCL5020", "Rqmt_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL5020_Rqmt_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL5020", "Rqmt_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("rqmt_no", "rqmt_no"),
				MCItemDef.create("mrp_typ", "mrp_typ"),
				MCItemDef.create("sim_mrp_no", "sim_mrp_no"),
				MCItemDef.create("sim_mrp_typ", "sim_mrp_typ"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("rqmt_qty", "rqmt_qty"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("rqmt_gnrt_typ", "rqmt_gnrt_typ"),
				MCItemDef.create("rqmt_typ", "rqmt_typ"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Rqmt_Chk01_Rslt")
		);
	}

	public static MCContainerDef MS_MSBCL5020_Rqmt_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL5020", "Rqmt_Chk01",
			new MCItemDef[]{
				MCItemDef.create("file_imp_flg", "file_imp_flg"),
				MCItemDef.create("no_dac_flg", "no_dac_flg")
			}
			,
			MCBlockDef.create("Rqmt_Chk01_Ctrl")
		);
	}


	public static MCContainerDef MS_MSBCL5020_Rqmt_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL5020", "Rqmt_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("rqmt_no", "rqmt_no"),
				MCItemDef.create("mrp_typ", "mrp_typ"),
				MCItemDef.create("sim_mrp_no", "sim_mrp_no"),
				MCItemDef.create("sim_mrp_typ", "sim_mrp_typ"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("strg_loc_grp_cd", "strg_loc_grp_cd"),
				MCItemDef.create("strg_loc_grp_nm", "strg_loc_grp_nm"),
				MCItemDef.create("rqmt_qty", "rqmt_qty"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("rqst_loc_nm", "rqst_loc_nm"),
				MCItemDef.create("rqst_wg_cd", "rqst_wg_cd"),
				MCItemDef.create("rqst_wg_nm", "rqst_wg_nm"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("rqmt_sno1_flg", "rqmt_sno1_flg"),
				MCItemDef.create("rqmt_sno2_flg", "rqmt_sno2_flg"),
				MCItemDef.create("rqmt_sno3_flg", "rqmt_sno3_flg"),
				MCItemDef.create("rqmt_sno4_flg", "rqmt_sno4_flg"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("sno1_num_typ", "sno1_num_typ"),
				MCItemDef.create("sno2_num_typ", "sno2_num_typ"),
				MCItemDef.create("sno3_num_typ", "sno3_num_typ"),
				MCItemDef.create("sno4_num_typ", "sno4_num_typ"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("rqmt_gnrt_typ", "rqmt_gnrt_typ"),
				MCItemDef.create("rqmt_gnrt_typ_nm", "rqmt_gnrt_typ_nm"),
				MCItemDef.create("rqmt_typ", "rqmt_typ"),
				MCItemDef.create("rqmt_typ_nm", "rqmt_typ_nm"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Rqmt_Chk01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL5020_Rqmt_Upd01_INFO = new MCOperationInfo("MS", "MSBCL5020", "Rqmt_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL5020_Rqmt_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL5020", "Rqmt_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("rqmt_no", "rqmt_no"),
				MCItemDef.create("mrp_typ", "mrp_typ"),
				MCItemDef.create("sim_mrp_no", "sim_mrp_no"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("rqmt_qty", "rqmt_qty"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("fix_flg", "fix_flg"),
				MCItemDef.create("rqmt_gnrt_typ", "rqmt_gnrt_typ"),
				MCItemDef.create("rqmt_typ", "rqmt_typ"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Rqmt_Upd01_Rslt")
		);
	}


	public static MCContainerDef MS_MSBCL5020_Rqmt_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL5020", "Rqmt_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("rqmt_no", "rqmt_no"),
				MCItemDef.create("mrp_typ", "mrp_typ"),
				MCItemDef.create("sim_mrp_no", "sim_mrp_no"),
				MCItemDef.create("due_dt", "due_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("rqmt_qty", "rqmt_qty"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("rqmt_gnrt_typ", "rqmt_gnrt_typ"),
				MCItemDef.create("rqmt_typ", "rqmt_typ"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Rqmt_Upd01_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

