package mcframe.serverMSBE.MSBEL5070;

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
 * [MSBEL_OPStkRplService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL5070.OPRqst_Srch01.UP.BLOCK0")){
			return MS_MSBEL5070_OPRqst_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5070.OPRqst_Srch01.DOWN.BLOCK0")){
			return MS_MSBEL5070_OPRqst_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5070.OPRqst_Srch02.UP.BLOCK0")){
			return MS_MSBEL5070_OPRqst_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5070.OPRqst_Srch02.DOWN.BLOCK0")){
			return MS_MSBEL5070_OPRqst_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5070.OPRqst_Chk01.UP.BLOCK0")){
			return MS_MSBEL5070_OPRqst_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5070.OPRqst_Chk01.DOWN.BLOCK0")){
			return MS_MSBEL5070_OPRqst_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5070.OPRqst_Ins01.UP.BLOCK0")){
			return MS_MSBEL5070_OPRqst_Ins01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL5070.OPRqst_Ins01.DOWN.BLOCK0")){
			return MS_MSBEL5070_OPRqst_Ins01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MS_MSBEL5070_OPRqst_Srch01_INFO = new MCOperationInfo("MS", "MSBEL5070", "OPRqst_Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5070_OPRqst_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5070", "OPRqst_Srch01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("rord_stk_qty", "rord_stk_qty"),
				MCItemDef.create("rord_rqst_qty", "rord_rqst_qty"),
				MCItemDef.create("gi_schd_flg", "gi_schd_flg"),
				MCItemDef.create("gi_loc_cd", "gi_loc_cd"),
				MCItemDef.create("gr_schd_dt_to", "gr_schd_dt_to"),
				MCItemDef.create("gi_schd_dt_to", "gi_schd_dt_to"),
				MCItemDef.create("master_dt", "master_dt")
			}
			,
			MCBlockDef.create("OPRqst_Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL5070_OPRqst_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5070", "OPRqst_Srch01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("rqst_qty", "rqst_qty"),
				MCItemDef.create("gr_schd_qty", "gr_schd_qty"),
				MCItemDef.create("stk_qty", "stk_qty"),
				MCItemDef.create("gi_schd_qty", "gi_schd_qty"),
				MCItemDef.create("shortage_qty", "shortage_qty"),
				MCItemDef.create("gr_schd_cont_qty", "gr_schd_cont_qty"),
				MCItemDef.create("stk_cont_qty", "stk_cont_qty"),
				MCItemDef.create("gi_schd_cont_qty", "gi_schd_cont_qty"),
				MCItemDef.create("shortage_cont_qty", "shortage_cont_qty"),
				MCItemDef.create("shortage_flg", "shortage_flg")
			}
			,
			MCBlockDef.create("OPRqst_Srch01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5070_OPRqst_Srch02_INFO = new MCOperationInfo("MS", "MSBEL5070", "OPRqst_Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5070_OPRqst_Srch02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5070", "OPRqst_Srch02",
			new MCItemDef[]{
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("rqst_qty", "rqst_qty"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("rqst_str_ln_tgt_flg", "rqst_str_ln_tgt_flg"),
				MCItemDef.create("rqst_str_ln_cd", "rqst_str_ln_cd"),
				MCItemDef.create("rqst_wg_cd", "rqst_wg_cd")
			}
			,
			MCBlockDef.create("OPRqst_Srch02_Rslt")
		);
	}


	public static MCContainerDef MS_MSBEL5070_OPRqst_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5070", "OPRqst_Srch02",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("rqst_qty", "rqst_qty"),
				MCItemDef.create("op_rpl_mtd_typ", "op_rpl_mtd_typ"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("mfg_loc_sppl_cd", "mfg_loc_sppl_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("rqst_loc_nm", "rqst_loc_nm"),
				MCItemDef.create("rqst_str_ln_tgt_flg", "rqst_str_ln_tgt_flg"),
				MCItemDef.create("rqst_str_ln_cd", "rqst_str_ln_cd"),
				MCItemDef.create("rqst_str_ln_nm", "rqst_str_ln_nm"),
				MCItemDef.create("rqst_wg_cd", "rqst_wg_cd"),
				MCItemDef.create("rqst_wg_nm", "rqst_wg_nm")
			}
			,
			MCBlockDef.create("OPRqst_Srch02_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5070_OPRqst_Chk01_INFO = new MCOperationInfo("MS", "MSBEL5070", "OPRqst_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5070_OPRqst_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5070", "OPRqst_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("op_rpl_mtd_typ", "op_rpl_mtd_typ"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("rqst_str_ln_cd", "rqst_str_ln_cd"),
				MCItemDef.create("rqst_wg_cd", "rqst_wg_cd"),
				MCItemDef.create("rqst_qty", "rqst_qty"),
				MCItemDef.create("st_schd_dt", "st_schd_dt"),
				MCItemDef.create("end_schd_dt", "end_schd_dt"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("inst_po_cnt_rmrks", "inst_po_cnt_rmrks")
			}
			,
			MCBlockDef.create("OPRqst_Chk01_Rslt")
		);
	}


	public static MCContainerDef MS_MSBEL5070_OPRqst_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5070", "OPRqst_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_wg_cd", "strg_wg_cd"),
				MCItemDef.create("strg_site_cd", "strg_site_cd"),
				MCItemDef.create("op_rpl_mtd_typ", "op_rpl_mtd_typ"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("rqst_str_ln_cd", "rqst_str_ln_cd"),
				MCItemDef.create("rqst_wg_cd", "rqst_wg_cd"),
				MCItemDef.create("rqst_qty", "rqst_qty"),
				MCItemDef.create("st_schd_dt", "st_schd_dt"),
				MCItemDef.create("end_schd_dt", "end_schd_dt"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("inst_po_cnt_rmrks", "inst_po_cnt_rmrks"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("OPRqst_Chk01_Rslt")
		);
	}
	
	static final MCOperationInfo MS_MSBEL5070_OPRqst_Ins01_INFO = new MCOperationInfo("MS", "MSBEL5070", "OPRqst_Ins01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL5070_OPRqst_Ins01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5070", "OPRqst_Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("master_dt", "master_dt"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("ver_flg", "ver_flg"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("strg_loc_cd", "strg_loc_cd"),
				MCItemDef.create("strg_wg_cd", "strg_wg_cd"),
				MCItemDef.create("strg_site_cd", "strg_site_cd"),
				MCItemDef.create("op_rpl_mtd_typ", "op_rpl_mtd_typ"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("rqst_loc_cd", "rqst_loc_cd"),
				MCItemDef.create("rqst_str_ln_cd", "rqst_str_ln_cd"),
				MCItemDef.create("rqst_wg_cd", "rqst_wg_cd"),
				MCItemDef.create("rqst_qty", "rqst_qty"),
				MCItemDef.create("st_schd_dt", "st_schd_dt"),
				MCItemDef.create("end_schd_dt", "end_schd_dt"),
				MCItemDef.create("ver_no", "ver_no"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("screen_crct_flg", "screen_crct_flg"),
				MCItemDef.create("inst_po_cnt_rmrks", "inst_po_cnt_rmrks")
			}
			,
			MCBlockDef.create("OPRqst_Ins01_Rslt")
		);
	}


	public static MCContainerDef MS_MSBEL5070_OPRqst_Ins01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL5070", "OPRqst_Ins01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("OPRqst_Ins01_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

