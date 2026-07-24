package mcframe.serverMSBD.MSBDL5040;

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
 * [MSBDL_PurcUtil]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBDL5040.PurcUtil_Srch01.UP.BLOCK0")){
			return MS_MSBDL5040_PurcUtil_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5040.PurcUtil_Srch01.DOWN.BLOCK0")){
			return MS_MSBDL5040_PurcUtil_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5040.PurcUtil_Srch02.UP.BLOCK0")){
			return MS_MSBDL5040_PurcUtil_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5040.PurcUtil_Srch02.DOWN.BLOCK0")){
			return MS_MSBDL5040_PurcUtil_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5040.PurcUtil_Srch03.UP.BLOCK0")){
			return MS_MSBDL5040_PurcUtil_Srch03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5040.PurcUtil_Srch03.DOWN.BLOCK0")){
			return MS_MSBDL5040_PurcUtil_Srch03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5040.PurcUtil_Srch04.UP.BLOCK0")){
			return MS_MSBDL5040_PurcUtil_Srch04_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBDL5040.PurcUtil_Srch04.DOWN.BLOCK0")){
			return MS_MSBDL5040_PurcUtil_Srch04_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MS_MSBDL5040_PurcUtil_Srch01_INFO = new MCOperationInfo("MS", "MSBDL5040", "PurcUtil_Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5040_PurcUtil_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5040", "PurcUtil_Srch01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("rqst_dlv_rqst_dt", "rqst_dlv_rqst_dt"),
				MCItemDef.create("dlv_rqst_dt", "dlv_rqst_dt"),
				MCItemDef.create("po_schd_dt", "po_schd_dt"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("prov_ddlv_flg", "prov_ddlv_flg"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("sppl_cal_cd", "sppl_cal_cd"),
				MCItemDef.create("in_to_loc_cal_cd", "in_to_loc_cal_cd"),
				MCItemDef.create("dlv_cal_cd", "dlv_cal_cd"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_dt", "base_dt")
			}
			,
			MCBlockDef.create("PurcUtil_Srch01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL5040_PurcUtil_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5040", "PurcUtil_Srch01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("rqst_dlv_rqst_dt", "rqst_dlv_rqst_dt"),
				MCItemDef.create("dlv_rqst_dt", "dlv_rqst_dt"),
				MCItemDef.create("po_schd_dt", "po_schd_dt"),
				MCItemDef.create("purc_schd_dt", "purc_schd_dt"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("PurcUtil_Srch01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5040_PurcUtil_Srch02_INFO = new MCOperationInfo("MS", "MSBDL5040", "PurcUtil_Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5040_PurcUtil_Srch02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5040", "PurcUtil_Srch02",
			new MCItemDef[]{
				MCItemDef.create("grp_no", "grp_no"),
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("cur_cd", "cur_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("base_dt", "base_dt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("mfg_inst_no", "mfg_inst_no"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("bom_ptn", "bom_ptn"),
				MCItemDef.create("outsrc_itm_ord_no", "outsrc_itm_ord_no"),
				MCItemDef.create("purc_typ", "purc_typ"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("rqst_dlv_rqst_dt", "rqst_dlv_rqst_dt"),
				MCItemDef.create("itmdtl_base_dt", "itmdtl_base_dt"),
				MCItemDef.create("not_add_up_qty_flg", "not_add_up_qty_flg")
			}
			,
			MCBlockDef.create("PurcUtil_Srch02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL5040_PurcUtil_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5040", "PurcUtil_Srch02",
			new MCItemDef[]{
				MCItemDef.create("trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("interim_flg", "interim_flg")
			}
			,
			MCBlockDef.create("PurcUtil_Srch02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5040_PurcUtil_Srch03_INFO = new MCOperationInfo("MS", "MSBDL5040", "PurcUtil_Srch03", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5040_PurcUtil_Srch03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5040", "PurcUtil_Srch03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("slo_d_no", "slo_d_no")
			}
			,
			MCBlockDef.create("PurcUtil_Srch03_Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL5040_PurcUtil_Srch03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5040", "PurcUtil_Srch03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("in_to_loc_cd", "in_to_loc_cd"),
				MCItemDef.create("in_to_loc_nm", "in_to_loc_nm"),
				MCItemDef.create("outsrc_sppl_cd", "outsrc_sppl_cd"),
				MCItemDef.create("pri_prnt_flg", "pri_prnt_flg"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("loc_mng_typ", "loc_mng_typ"),
				MCItemDef.create("in_to_loc_cal_cd", "in_to_loc_cal_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("str_ln_cd_none_flg", "str_ln_cd_none_flg"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_sundry_flg", "dlv_sundry_flg"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("dlv_cntct_dpt", "dlv_cntct_dpt"),
				MCItemDef.create("dlv_cntct_psn", "dlv_cntct_psn"),
				MCItemDef.create("dlv_zip_cd", "dlv_zip_cd"),
				MCItemDef.create("dlv_addr1", "dlv_addr1"),
				MCItemDef.create("dlv_addr2", "dlv_addr2"),
				MCItemDef.create("dlv_addr3", "dlv_addr3"),
				MCItemDef.create("dlv_addr4", "dlv_addr4"),
				MCItemDef.create("dlv_tel", "dlv_tel"),
				MCItemDef.create("dlv_fax", "dlv_fax"),
				MCItemDef.create("dlv_cal_cd", "dlv_cal_cd"),
				MCItemDef.create("dlv_lg_grp_cd", "dlv_lg_grp_cd"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_sundry_flg", "tdlv_sundry_flg"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("tdlv_cntct_dpt", "tdlv_cntct_dpt"),
				MCItemDef.create("tdlv_cntct_psn", "tdlv_cntct_psn"),
				MCItemDef.create("tdlv_zip_cd", "tdlv_zip_cd"),
				MCItemDef.create("tdlv_addr1", "tdlv_addr1"),
				MCItemDef.create("tdlv_addr2", "tdlv_addr2"),
				MCItemDef.create("tdlv_addr3", "tdlv_addr3"),
				MCItemDef.create("tdlv_addr4", "tdlv_addr4"),
				MCItemDef.create("tdlv_tel", "tdlv_tel"),
				MCItemDef.create("tdlv_fax", "tdlv_fax"),
				MCItemDef.create("tdlv_lg_grp_cd", "tdlv_lg_grp_cd")
			}
			,
			MCBlockDef.create("PurcUtil_Srch03_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBDL5040_PurcUtil_Srch04_INFO = new MCOperationInfo("MS", "MSBDL5040", "PurcUtil_Srch04", "000000", new PDef());

	public static MCContainerDef MS_MSBDL5040_PurcUtil_Srch04_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5040", "PurcUtil_Srch04",
			new MCItemDef[]{
				MCItemDef.create("po_d_no", "po_d_no")
			}
			,
			MCBlockDef.create("PurcUtil_Srch04_Dtl")
		);
	}


	public static MCContainerDef MS_MSBDL5040_PurcUtil_Srch04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBDL5040", "PurcUtil_Srch04",
			new MCItemDef[]{
				MCItemDef.create("purc_sts_typ", "purc_sts_typ")
			}
			,
			MCBlockDef.create("PurcUtil_Srch04_Dtl")
		);
	}
	//FMCB DEF_CLASSES END
}

