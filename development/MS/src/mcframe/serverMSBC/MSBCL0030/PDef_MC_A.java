package mcframe.serverMSBC.MSBCL0030;

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
 * [MSBCL_MlyRqmtReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBCL0030.Srch01.UP.BLOCK0")){
			return MS_MSBCL0030_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0030.Srch01.DOWN.BLOCK0")){
			return MS_MSBCL0030_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0030.Chk01.UP.BLOCK0")){
			return MS_MSBCL0030_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0030.Chk01.UP.BLOCK1")){
			return MS_MSBCL0030_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBCL0030.Chk01.DOWN.BLOCK0")){
			return MS_MSBCL0030_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0030.Chk02.UP.BLOCK0")){
			return MS_MSBCL0030_Chk02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0030.Chk02.DOWN.BLOCK0")){
			return MS_MSBCL0030_Chk02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0030.Chk03.UP.BLOCK0")){
			return MS_MSBCL0030_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0030.Chk03.DOWN.BLOCK0")){
			return MS_MSBCL0030_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0030.Upd01.UP.BLOCK0")){
			return MS_MSBCL0030_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0030.Upd01.DOWN.BLOCK0")){
			return MS_MSBCL0030_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0030.Del01.UP.BLOCK0")){
			return MS_MSBCL0030_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0030.Del01.DOWN.BLOCK0")){
			return MS_MSBCL0030_Del01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0030.Imp01.UP.BLOCK0")){
			return MS_MSBCL0030_Imp01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0030.Imp01.DOWN.BLOCK0")){
			return MS_MSBCL0030_Imp01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBCL0030.Upd02.UP.BLOCK0")){
			return MS_MSBCL0030_Upd02_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
								
	
	static final MCOperationInfo MS_MSBCL0030_Srch01_INFO = new MCOperationInfo("MS", "MSBCL0030", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0030_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0030", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ope", "ope"),
				MCItemDef.create("ym_fr", "ym_fr"),
				MCItemDef.create("ym_to", "ym_to"),
				MCItemDef.create("prod_ym_fr", "prod_ym_fr"),
				MCItemDef.create("prod_ym_to", "prod_ym_to"),
				MCItemDef.create("mps_grp_cd", "mps_grp_cd"),
				MCItemDef.create("mps_grp_nm", "mps_grp_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("strg_loc_grp_cd", "strg_loc_grp_cd"),
				MCItemDef.create("strg_loc_grp_nm", "strg_loc_grp_nm"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("itm_grp_flg1", "itm_grp_flg1"),
				MCItemDef.create("itm_grp_cd1", "itm_grp_cd1"),
				MCItemDef.create("itm_grp_nm1", "itm_grp_nm1"),
				MCItemDef.create("itm_grp_flg2", "itm_grp_flg2"),
				MCItemDef.create("itm_grp_cd2", "itm_grp_cd2"),
				MCItemDef.create("itm_grp_nm2", "itm_grp_nm2"),
				MCItemDef.create("itm_grp_flg3", "itm_grp_flg3"),
				MCItemDef.create("itm_grp_cd3", "itm_grp_cd3"),
				MCItemDef.create("itm_grp_nm3", "itm_grp_nm3"),
				MCItemDef.create("itm_grp_flg4", "itm_grp_flg4"),
				MCItemDef.create("itm_grp_cd4", "itm_grp_cd4"),
				MCItemDef.create("itm_grp_nm4", "itm_grp_nm4"),
				MCItemDef.create("itm_grp_flg5", "itm_grp_flg5"),
				MCItemDef.create("itm_grp_cd5", "itm_grp_cd5"),
				MCItemDef.create("itm_grp_nm5", "itm_grp_nm5"),
				MCItemDef.create("itm_grp_flg6", "itm_grp_flg6"),
				MCItemDef.create("itm_grp_cd6", "itm_grp_cd6"),
				MCItemDef.create("itm_grp_nm6", "itm_grp_nm6"),
				MCItemDef.create("itm_grp_flg7", "itm_grp_flg7"),
				MCItemDef.create("itm_grp_cd7", "itm_grp_cd7"),
				MCItemDef.create("itm_grp_nm7", "itm_grp_nm7"),
				MCItemDef.create("itm_grp_flg8", "itm_grp_flg8"),
				MCItemDef.create("itm_grp_cd8", "itm_grp_cd8"),
				MCItemDef.create("itm_grp_nm8", "itm_grp_nm8"),
				MCItemDef.create("itm_grp_flg9", "itm_grp_flg9"),
				MCItemDef.create("itm_grp_cd9", "itm_grp_cd9"),
				MCItemDef.create("itm_grp_nm9", "itm_grp_nm9"),
				MCItemDef.create("itm_grp_flg10", "itm_grp_flg10"),
				MCItemDef.create("itm_grp_cd10", "itm_grp_cd10"),
				MCItemDef.create("itm_grp_nm10", "itm_grp_nm10")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBCL0030_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0030", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("mps_grp_cd", "mps_grp_cd"),
				MCItemDef.create("mps_grp_nm", "mps_grp_nm"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("rqst_loc_nm", "rqst_loc_nm"),
				MCItemDef.create("prod_ym", "prod_ym"),
				MCItemDef.create("qty", "qty"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("rnd_typ", "rnd_typ"),
				MCItemDef.create("strg_loc_grp_cd", "strg_loc_grp_cd"),
				MCItemDef.create("strg_loc_grp_nm", "strg_loc_grp_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
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
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("ym_key", "ym_key"),
				MCItemDef.create("prod_ym_key", "prod_ym_key"),
				MCItemDef.create("mps_grp_cd_key", "mps_grp_cd_key"),
				MCItemDef.create("itm_cd_key", "itm_cd_key"),
				MCItemDef.create("itm_sub1_key", "itm_sub1_key"),
				MCItemDef.create("itm_sub2_key", "itm_sub2_key"),
				MCItemDef.create("itm_sub3_key", "itm_sub3_key")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0030_Chk01_INFO = new MCOperationInfo("MS", "MSBCL0030", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0030_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0030", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("ym_key", "ym_key"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_cd_key", "itm_cd_key"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub1_key", "itm_sub1_key"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub2_key", "itm_sub2_key"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_sub3_key", "itm_sub3_key"),
				MCItemDef.create("mps_grp_cd", "mps_grp_cd"),
				MCItemDef.create("mps_grp_cd_key", "mps_grp_cd_key"),
				MCItemDef.create("prod_ym", "prod_ym"),
				MCItemDef.create("prod_ym_key", "prod_ym_key"),
				MCItemDef.create("qty", "qty"),
				MCItemDef.create("wg_cd", "wg_cd"),
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

	public static MCContainerDef MS_MSBCL0030_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBCL0030", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("file_imp_flg", "file_imp_flg")
			}
			,
			MCBlockDef.create("Chk01_Crtl")
		);
	}


	public static MCContainerDef MS_MSBCL0030_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0030", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("ym_key", "ym_key"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_cd_key", "itm_cd_key"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub1_key", "itm_sub1_key"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub2_key", "itm_sub2_key"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_sub3_key", "itm_sub3_key"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("mps_grp_cd", "mps_grp_cd"),
				MCItemDef.create("mps_grp_cd_key", "mps_grp_cd_key"),
				MCItemDef.create("mps_grp_nm", "mps_grp_nm"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("strg_loc_grp_cd", "strg_loc_grp_cd"),
				MCItemDef.create("strg_loc_grp_nm", "strg_loc_grp_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("rqst_loc_nm", "rqst_loc_nm"),
				MCItemDef.create("prod_ym", "prod_ym"),
				MCItemDef.create("prod_ym_key", "prod_ym_key"),
				MCItemDef.create("qty", "qty"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("rnd_typ", "rnd_typ"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
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
	
	static final MCOperationInfo MS_MSBCL0030_Chk02_INFO = new MCOperationInfo("MS", "MSBCL0030", "Chk02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0030_Chk02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0030", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("mps_grp_cd", "mps_grp_cd"),
				MCItemDef.create("prod_ym", "prod_ym"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}


	public static MCContainerDef MS_MSBCL0030_Chk02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0030", "Chk02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("mps_grp_cd", "mps_grp_cd"),
				MCItemDef.create("prod_ym", "prod_ym")
			}
			,
			MCBlockDef.create("Chk02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0030_Chk03_INFO = new MCOperationInfo("MS", "MSBCL0030", "Chk03", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0030_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0030", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("mps_grp_cd", "mps_grp_cd"),
				MCItemDef.create("ym", "ym")
			}
			,
			MCBlockDef.create("Chk03_Cnd")
		);
	}


	public static MCContainerDef MS_MSBCL0030_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0030", "Chk03",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Chk03_Cnd")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0030_Upd01_INFO = new MCOperationInfo("MS", "MSBCL0030", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0030_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0030", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("ym_key", "ym_key"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_cd_key", "itm_cd_key"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub1_key", "itm_sub1_key"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub2_key", "itm_sub2_key"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_sub3_key", "itm_sub3_key"),
				MCItemDef.create("mps_grp_cd", "mps_grp_cd"),
				MCItemDef.create("mps_grp_cd_key", "mps_grp_cd_key"),
				MCItemDef.create("prod_ym", "prod_ym"),
				MCItemDef.create("prod_ym_key", "prod_ym_key"),
				MCItemDef.create("wg_cd", "wg_cd"),
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


	public static MCContainerDef MS_MSBCL0030_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0030", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("mps_grp_cd", "mps_grp_cd"),
				MCItemDef.create("prod_ym", "prod_ym")
			}
			,
			MCBlockDef.create("Upd01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0030_Del01_INFO = new MCOperationInfo("MS", "MSBCL0030", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0030_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0030", "Del01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("mps_grp_cd", "mps_grp_cd"),
				MCItemDef.create("prod_ym", "prod_ym"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}


	public static MCContainerDef MS_MSBCL0030_Del01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0030", "Del01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("mps_grp_cd", "mps_grp_cd"),
				MCItemDef.create("prod_ym", "prod_ym")
			}
			,
			MCBlockDef.create("Del01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0030_Imp01_INFO = new MCOperationInfo("MS", "MSBCL0030", "Imp01", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0030_Imp01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0030", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("ym_key", "ym_key"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_cd_key", "itm_cd_key"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub1_key", "itm_sub1_key"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub2_key", "itm_sub2_key"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_sub3_key", "itm_sub3_key"),
				MCItemDef.create("mps_grp_cd", "mps_grp_cd"),
				MCItemDef.create("mps_grp_cd_key", "mps_grp_cd_key"),
				MCItemDef.create("prod_ym", "prod_ym"),
				MCItemDef.create("prod_ym_key", "prod_ym_key"),
				MCItemDef.create("qty", "qty"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Imp01_Rslt")
		);
	}


	public static MCContainerDef MS_MSBCL0030_Imp01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0030", "Imp01",
			new MCItemDef[]{
				MCItemDef.create("rtn_sts_typ", "rtn_sts_typ"),
				MCItemDef.create("ym", "ym"),
				MCItemDef.create("ym_key", "ym_key"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_cd_key", "itm_cd_key"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub1_key", "itm_sub1_key"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub2_key", "itm_sub2_key"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_sub3_key", "itm_sub3_key"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("mps_grp_cd", "mps_grp_cd"),
				MCItemDef.create("mps_grp_cd_key", "mps_grp_cd_key"),
				MCItemDef.create("mps_grp_nm", "mps_grp_nm"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_loc_nm", "strg_loc_nm"),
				MCItemDef.create("strg_loc_grp_cd", "strg_loc_grp_cd"),
				MCItemDef.create("strg_loc_grp_nm", "strg_loc_grp_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("rqst_loc_nm", "rqst_loc_nm"),
				MCItemDef.create("prod_ym", "prod_ym"),
				MCItemDef.create("prod_ym_key", "prod_ym_key"),
				MCItemDef.create("qty", "qty"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("rnd_typ", "rnd_typ"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Imp01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBCL0030_Upd02_INFO = new MCOperationInfo("MS", "MSBCL0030", "Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBCL0030_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBCL0030", "Upd02",
			new MCItemDef[]{
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("mps_grp_cd", "mps_grp_cd"),
				MCItemDef.create("ym", "ym")
			}
			,
			MCBlockDef.create("Upd02_Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

