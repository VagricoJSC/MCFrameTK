package mcframe.serverMABC.MABCL0700;

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
 * [MABCL_LocReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABCL0700.Loc_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0700_Loc_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0700.Loc_Upd01.UP.BLOCK0")){
			return MA_MABCL0700_Loc_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0700.StrLn_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0700_StrLn_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0700.StrLn_Upd01.UP.BLOCK0")){
			return MA_MABCL0700_StrLn_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0700.LocLcl_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0700_LocLcl_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0700.LocLcl_Upd01.UP.BLOCK0")){
			return MA_MABCL0700_LocLcl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0700.LclStrLn_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0700_LclStrLn_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0700.LclStrLn_Upd01.UP.BLOCK0")){
			return MA_MABCL0700_LclStrLn_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0700.Loc_DelChk01.UP.BLOCK0")){
			return MA_MABCL0700_Loc_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0700.Loc_Del01.UP.BLOCK0")){
			return MA_MABCL0700_Loc_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0700.Srch01.UP.BLOCK0")){
			return MA_MABCL0700_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0700.Srch01.DOWN.BLOCK0")){
			return MA_MABCL0700_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL0700.Srch01.DOWN.BLOCK1")){
			return MA_MABCL0700_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MA.MABCL0700.Srch01.DOWN.BLOCK2")){
			return MA_MABCL0700_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MA.MABCL0700.Srch01.DOWN.BLOCK3")){
			return MA_MABCL0700_Srch01_DOWN_BLOCK3();
		}
		else if (id.equals("MA.MABCL0700.Srch01.DOWN.BLOCK4")){
			return MA_MABCL0700_Srch01_DOWN_BLOCK4();
		}
		else if (id.equals("MA.MABCL0700.Upd01.UP.BLOCK0")){
			return MA_MABCL0700_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0700.Upd01.UP.BLOCK1")){
			return MA_MABCL0700_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MA.MABCL0700.Upd01.UP.BLOCK2")){
			return MA_MABCL0700_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MA.MABCL0700.Upd01.UP.BLOCK3")){
			return MA_MABCL0700_Upd01_UP_BLOCK3();
		}
		else if (id.equals("MA.MABCL0700.Upd01.UP.BLOCK4")){
			return MA_MABCL0700_Upd01_UP_BLOCK4();
		}
		else if (id.equals("MA.MABCL0700.Del01.UP.BLOCK0")){
			return MA_MABCL0700_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
													
	
	static final MCOperationInfo MA_MABCL0700_Loc_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0700", "Loc_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0700_Loc_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0700", "Loc_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("asst_dpt_cd", "asst_dpt_cd"),
				MCItemDef.create("check_asst_dpt_cd", "check_asst_dpt_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("check_sls_dpt_cd", "check_sls_dpt_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_def_flg", "lg_def_flg"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("pre_outsrc_act_flg", "pre_outsrc_act_flg"),
				MCItemDef.create("ddlv_prov_insp_flg", "ddlv_prov_insp_flg"),
				MCItemDef.create("cal_cd", "cal_cd"),
				MCItemDef.create("loc_mng_typ", "loc_mng_typ"),
				MCItemDef.create("num_id", "num_id"),
				MCItemDef.create("cntry_cd", "cntry_cd"),
				MCItemDef.create("prnt_lcl_cd", "prnt_lcl_cd"),
				MCItemDef.create("stktk_tgt_flg", "stktk_tgt_flg"),
				MCItemDef.create("stktk_tor_disp_flg", "stktk_tor_disp_flg"),
				MCItemDef.create("stktk_tor_ex_zero_flg", "stktk_tor_ex_zero_flg"),
				MCItemDef.create("stktk_act_ex_zero_flg", "stktk_act_ex_zero_flg"),
				MCItemDef.create("stktk_amt_flg", "stktk_amt_flg"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("alloc_lmt_flg", "alloc_lmt_flg"),
				MCItemDef.create("gi_pack_xfer_flg", "gi_pack_xfer_flg"),
				MCItemDef.create("gi_vmi_flg", "gi_vmi_flg"),
				MCItemDef.create("rsrc_cd1", "rsrc_cd1"),
				MCItemDef.create("rsrc_cd2", "rsrc_cd2"),
				MCItemDef.create("ext_sys_loc_typ", "ext_sys_loc_typ"),
				MCItemDef.create("loc_alc_grp", "loc_alc_grp"),
				MCItemDef.create("addr_flg", "addr_flg"),
				MCItemDef.create("zip_cd", "zip_cd"),
				MCItemDef.create("addr1", "addr1"),
				MCItemDef.create("addr2", "addr2"),
				MCItemDef.create("addr3", "addr3"),
				MCItemDef.create("addr4", "addr4"),
				MCItemDef.create("tel", "tel"),
				MCItemDef.create("fax", "fax"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Loc_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0700_Loc_Upd01_INFO = new MCOperationInfo("MA", "MABCL0700", "Loc_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0700_Loc_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0700", "Loc_Upd01",
			new MCItemDef[]{
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("asst_dpt_cd", "asst_dpt_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_def_flg", "lg_def_flg"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("pre_outsrc_act_flg", "pre_outsrc_act_flg"),
				MCItemDef.create("ddlv_prov_insp_flg", "ddlv_prov_insp_flg"),
				MCItemDef.create("cal_cd", "cal_cd"),
				MCItemDef.create("loc_mng_typ", "loc_mng_typ"),
				MCItemDef.create("num_id", "num_id"),
				MCItemDef.create("cntry_cd", "cntry_cd"),
				MCItemDef.create("prnt_lcl_cd", "prnt_lcl_cd"),
				MCItemDef.create("stktk_tgt_flg", "stktk_tgt_flg"),
				MCItemDef.create("stktk_tor_disp_flg", "stktk_tor_disp_flg"),
				MCItemDef.create("stktk_tor_ex_zero_flg", "stktk_tor_ex_zero_flg"),
				MCItemDef.create("stktk_act_ex_zero_flg", "stktk_act_ex_zero_flg"),
				MCItemDef.create("stktk_amt_flg", "stktk_amt_flg"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("alloc_lmt_flg", "alloc_lmt_flg"),
				MCItemDef.create("gi_pack_xfer_flg", "gi_pack_xfer_flg"),
				MCItemDef.create("gi_vmi_flg", "gi_vmi_flg"),
				MCItemDef.create("rsrc_cd1", "rsrc_cd1"),
				MCItemDef.create("rsrc_cd2", "rsrc_cd2"),
				MCItemDef.create("ext_sys_loc_typ", "ext_sys_loc_typ"),
				MCItemDef.create("loc_alc_grp", "loc_alc_grp"),
				MCItemDef.create("addr_flg", "addr_flg"),
				MCItemDef.create("zip_cd", "zip_cd"),
				MCItemDef.create("addr1", "addr1"),
				MCItemDef.create("addr2", "addr2"),
				MCItemDef.create("addr3", "addr3"),
				MCItemDef.create("addr4", "addr4"),
				MCItemDef.create("tel", "tel"),
				MCItemDef.create("fax", "fax"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Loc_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0700_StrLn_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0700", "StrLn_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0700_StrLn_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0700", "StrLn_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("ln_flg", "ln_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("StrLn_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0700_StrLn_Upd01_INFO = new MCOperationInfo("MA", "MABCL0700", "StrLn_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0700_StrLn_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0700", "StrLn_Upd01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("ln_flg", "ln_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("StrLn_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0700_LocLcl_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0700", "LocLcl_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0700_LocLcl_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0700", "LocLcl_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("zip_cd", "zip_cd"),
				MCItemDef.create("addr1", "addr1"),
				MCItemDef.create("addr2", "addr2"),
				MCItemDef.create("addr3", "addr3"),
				MCItemDef.create("addr4", "addr4"),
				MCItemDef.create("tel", "tel"),
				MCItemDef.create("fax", "fax"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("LocLcl_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0700_LocLcl_Upd01_INFO = new MCOperationInfo("MA", "MABCL0700", "LocLcl_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0700_LocLcl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0700", "LocLcl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("zip_cd", "zip_cd"),
				MCItemDef.create("addr1", "addr1"),
				MCItemDef.create("addr2", "addr2"),
				MCItemDef.create("addr3", "addr3"),
				MCItemDef.create("addr4", "addr4"),
				MCItemDef.create("tel", "tel"),
				MCItemDef.create("fax", "fax"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("LocLcl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0700_LclStrLn_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0700", "LclStrLn_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0700_LclStrLn_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0700", "LclStrLn_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("LclStrLn_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0700_LclStrLn_Upd01_INFO = new MCOperationInfo("MA", "MABCL0700", "LclStrLn_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0700_LclStrLn_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0700", "LclStrLn_Upd01",
			new MCItemDef[]{
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("LclStrLn_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0700_Loc_DelChk01_INFO = new MCOperationInfo("MA", "MABCL0700", "Loc_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0700_Loc_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0700", "Loc_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Loc_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0700_Loc_Del01_INFO = new MCOperationInfo("MA", "MABCL0700", "Loc_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0700_Loc_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0700", "Loc_Del01",
			new MCItemDef[]{
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Loc_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0700_Srch01_INFO = new MCOperationInfo("MA", "MABCL0700", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0700_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0700", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm_lcl", "loc_nm_lcl"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("no_sppl_flg", "no_sppl_flg"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MA_MABCL0700_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0700", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm_lcl", "loc_nm_lcl"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("asst_dpt_cd", "asst_dpt_cd"),
				MCItemDef.create("asst_dpt_nm", "asst_dpt_nm"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("lg_def_flg", "lg_def_flg"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("loc_grp_nm", "loc_grp_nm"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("alloc_grp_nm", "alloc_grp_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("pre_outsrc_act_flg", "pre_outsrc_act_flg"),
				MCItemDef.create("ddlv_prov_insp_flg", "ddlv_prov_insp_flg"),
				MCItemDef.create("cal_cd", "cal_cd"),
				MCItemDef.create("cal_nm", "cal_nm"),
				MCItemDef.create("loc_mng_typ", "loc_mng_typ"),
				MCItemDef.create("loc_mng_typ_nm", "loc_mng_typ_nm"),
				MCItemDef.create("num_id", "num_id"),
				MCItemDef.create("cntry_cd", "cntry_cd"),
				MCItemDef.create("cntry_nm", "cntry_nm"),
				MCItemDef.create("prnt_lcl_cd", "prnt_lcl_cd"),
				MCItemDef.create("prnt_lcl_nm", "prnt_lcl_nm"),
				MCItemDef.create("stktk_tgt_flg", "stktk_tgt_flg"),
				MCItemDef.create("stktk_tor_disp_flg", "stktk_tor_disp_flg"),
				MCItemDef.create("stktk_tor_ex_zero_flg", "stktk_tor_ex_zero_flg"),
				MCItemDef.create("stktk_act_ex_zero_flg", "stktk_act_ex_zero_flg"),
				MCItemDef.create("stktk_amt_flg", "stktk_amt_flg"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("alloc_lmt_flg", "alloc_lmt_flg"),
				MCItemDef.create("gi_pack_xfer_flg", "gi_pack_xfer_flg"),
				MCItemDef.create("gi_vmi_flg", "gi_vmi_flg"),
				MCItemDef.create("rsrc_cd1", "rsrc_cd1"),
				MCItemDef.create("rsrc_nm1", "rsrc_nm1"),
				MCItemDef.create("rsrc_cd2", "rsrc_cd2"),
				MCItemDef.create("rsrc_nm2", "rsrc_nm2"),
				MCItemDef.create("ext_sys_loc_typ", "ext_sys_loc_typ"),
				MCItemDef.create("ext_sys_loc_typ_nm", "ext_sys_loc_typ_nm"),
				MCItemDef.create("loc_alc_grp", "loc_alc_grp"),
				MCItemDef.create("addr_flg", "addr_flg"),
				MCItemDef.create("zip_cd", "zip_cd"),
				MCItemDef.create("addr1", "addr1"),
				MCItemDef.create("addr2", "addr2"),
				MCItemDef.create("addr3", "addr3"),
				MCItemDef.create("addr4", "addr4"),
				MCItemDef.create("tel", "tel"),
				MCItemDef.create("fax", "fax"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("del_usr_id", "del_usr_id"),
				MCItemDef.create("del_usr_nm", "del_usr_nm"),
				MCItemDef.create("del_ts", "del_ts")
			}
			,
			MCBlockDef.create("Srch01_Rslt1")
		);
	}
	public static MCContainerDef MA_MABCL0700_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MABCL0700", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("asst_dpt_cd", "asst_dpt_cd"),
				MCItemDef.create("asst_dpt_nm", "asst_dpt_nm"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("del_usr_id", "del_usr_id"),
				MCItemDef.create("del_usr_nm", "del_usr_nm"),
				MCItemDef.create("del_ts", "del_ts")
			}
			,
			MCBlockDef.create("Srch01_Rslt2")
		);
	}
	public static MCContainerDef MA_MABCL0700_Srch01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MA", "MABCL0700", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm_lcl", "str_ln_nm_lcl"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("ln_flg", "ln_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("del_usr_id", "del_usr_id"),
				MCItemDef.create("del_usr_nm", "del_usr_nm"),
				MCItemDef.create("del_ts", "del_ts")
			}
			,
			MCBlockDef.create("Srch01_Rslt3")
		);
	}
	public static MCContainerDef MA_MABCL0700_Srch01_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MA", "MABCL0700", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("lcl_nm", "lcl_nm"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("zip_cd", "zip_cd"),
				MCItemDef.create("addr1", "addr1"),
				MCItemDef.create("addr2", "addr2"),
				MCItemDef.create("addr3", "addr3"),
				MCItemDef.create("addr4", "addr4"),
				MCItemDef.create("tel", "tel"),
				MCItemDef.create("fax", "fax"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Srch01_Rslt4")
		);
	}
	public static MCContainerDef MA_MABCL0700_Srch01_DOWN_BLOCK4() {

		return new MCGeneralContainerDef("MA", "MABCL0700", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("lcl_nm", "lcl_nm"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Srch01_Rslt5")
		);
	}
	
	static final MCOperationInfo MA_MABCL0700_Upd01_INFO = new MCOperationInfo("MA", "MABCL0700", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0700_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0700", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("asst_dpt_cd", "asst_dpt_cd"),
				MCItemDef.create("check_asst_dpt_cd", "check_asst_dpt_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("check_sls_dpt_cd", "check_sls_dpt_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_def_flg", "lg_def_flg"),
				MCItemDef.create("loc_grp_cd", "loc_grp_cd"),
				MCItemDef.create("alloc_grp_cd", "alloc_grp_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("pre_outsrc_act_flg", "pre_outsrc_act_flg"),
				MCItemDef.create("ddlv_prov_insp_flg", "ddlv_prov_insp_flg"),
				MCItemDef.create("cal_cd", "cal_cd"),
				MCItemDef.create("loc_mng_typ", "loc_mng_typ"),
				MCItemDef.create("num_id", "num_id"),
				MCItemDef.create("cntry_cd", "cntry_cd"),
				MCItemDef.create("prnt_lcl_cd", "prnt_lcl_cd"),
				MCItemDef.create("stktk_tgt_flg", "stktk_tgt_flg"),
				MCItemDef.create("stktk_tor_disp_flg", "stktk_tor_disp_flg"),
				MCItemDef.create("stktk_tor_ex_zero_flg", "stktk_tor_ex_zero_flg"),
				MCItemDef.create("stktk_act_ex_zero_flg", "stktk_act_ex_zero_flg"),
				MCItemDef.create("stktk_amt_flg", "stktk_amt_flg"),
				MCItemDef.create("str_ln_tgt_flg", "str_ln_tgt_flg"),
				MCItemDef.create("alloc_lmt_flg", "alloc_lmt_flg"),
				MCItemDef.create("gi_pack_xfer_flg", "gi_pack_xfer_flg"),
				MCItemDef.create("gi_vmi_flg", "gi_vmi_flg"),
				MCItemDef.create("rsrc_cd1", "rsrc_cd1"),
				MCItemDef.create("rsrc_cd2", "rsrc_cd2"),
				MCItemDef.create("ext_sys_loc_typ", "ext_sys_loc_typ"),
				MCItemDef.create("loc_alc_grp", "loc_alc_grp"),
				MCItemDef.create("addr_flg", "addr_flg"),
				MCItemDef.create("zip_cd", "zip_cd"),
				MCItemDef.create("addr1", "addr1"),
				MCItemDef.create("addr2", "addr2"),
				MCItemDef.create("addr3", "addr3"),
				MCItemDef.create("addr4", "addr4"),
				MCItemDef.create("tel", "tel"),
				MCItemDef.create("fax", "fax"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl1")
		);
	}

	public static MCContainerDef MA_MABCL0700_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MABCL0700", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("ln_flg", "ln_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl2")
		);
	}

	public static MCContainerDef MA_MABCL0700_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MA", "MABCL0700", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("loc_nm", "loc_nm"),
				MCItemDef.create("zip_cd", "zip_cd"),
				MCItemDef.create("addr1", "addr1"),
				MCItemDef.create("addr2", "addr2"),
				MCItemDef.create("addr3", "addr3"),
				MCItemDef.create("addr4", "addr4"),
				MCItemDef.create("tel", "tel"),
				MCItemDef.create("fax", "fax"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl3")
		);
	}

	public static MCContainerDef MA_MABCL0700_Upd01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MA", "MABCL0700", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("asst_dpt_cd", "asst_dpt_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl4")
		);
	}

	public static MCContainerDef MA_MABCL0700_Upd01_UP_BLOCK4() {

		return new MCGeneralContainerDef("MA", "MABCL0700", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("str_ln_cd", "str_ln_cd"),
				MCItemDef.create("lcl_cd", "lcl_cd"),
				MCItemDef.create("str_ln_nm", "str_ln_nm"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl5")
		);
	}
	
	static final MCOperationInfo MA_MABCL0700_Del01_INFO = new MCOperationInfo("MA", "MABCL0700", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0700_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0700", "Del01",
			new MCItemDef[]{
				MCItemDef.create("loc_cd", "loc_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Dtl1")
		);
	}


	//FMCB DEF_CLASSES END
}

