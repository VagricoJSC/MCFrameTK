package mcframe.serverMSBE.MSBEL1750;

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
 * [MSBEL_PlReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBEL1750.Srch01.UP.BLOCK0")){
			return MS_MSBEL1750_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1750.Srch01.DOWN.BLOCK0")){
			return MS_MSBEL1750_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1750.Srch01.DOWN.BLOCK1")){
			return MS_MSBEL1750_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1750.Srch02.UP.BLOCK0")){
			return MS_MSBEL1750_Srch02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1750.Srch02.DOWN.BLOCK0")){
			return MS_MSBEL1750_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1750.Srch02.DOWN.BLOCK1")){
			return MS_MSBEL1750_Srch02_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1750.Srch03.UP.BLOCK0")){
			return MS_MSBEL1750_Srch03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1750.Srch03.DOWN.BLOCK0")){
			return MS_MSBEL1750_Srch03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1750.Chk01.UP.BLOCK0")){
			return MS_MSBEL1750_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1750.Chk01.UP.BLOCK1")){
			return MS_MSBEL1750_Chk01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1750.Chk01.DOWN.BLOCK0")){
			return MS_MSBEL1750_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1750.Chk01.DOWN.BLOCK1")){
			return MS_MSBEL1750_Chk01_DOWN_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1750.Upd01.UP.BLOCK0")){
			return MS_MSBEL1750_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1750.Upd01.UP.BLOCK1")){
			return MS_MSBEL1750_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MS.MSBEL1750.Del01.UP.BLOCK0")){
			return MS_MSBEL1750_Del01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBEL1750.Prnt01.UP.BLOCK0")){
			return MS_MSBEL1750_Prnt01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
							
	
	static final MCOperationInfo MS_MSBEL1750_Srch01_INFO = new MCOperationInfo("MS", "MSBEL1750", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1750_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1750", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("iv_no", "iv_no")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL1750_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1750", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("non_cmpl_flg", "non_cmpl_flg"),
				MCItemDef.create("cmpl_flg", "cmpl_flg"),
				MCItemDef.create("pl_prnt_flg", "pl_prnt_flg"),
				MCItemDef.create("dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("dlv_id_typ_nm", "dlv_id_typ_nm"),
				MCItemDef.create("dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("dlv_id_nm", "dlv_id_nm"),
				MCItemDef.create("dlv_cntry_cd", "dlv_cntry_cd"),
				MCItemDef.create("dlv_cntry_nm", "dlv_cntry_nm"),
				MCItemDef.create("ship_rqst_id_typ", "ship_rqst_id_typ"),
				MCItemDef.create("ship_rqst_id_typ_nm", "ship_rqst_id_typ_nm"),
				MCItemDef.create("ship_rqst_id_cd", "ship_rqst_id_cd"),
				MCItemDef.create("ship_rqst_id_nm", "ship_rqst_id_nm"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("trnspt_cd", "trnspt_cd"),
				MCItemDef.create("trnspt_nm", "trnspt_nm"),
				MCItemDef.create("pl_rmrks", "pl_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("ttl_net_wt", "ttl_net_wt"),
				MCItemDef.create("ttl_grss_wt", "ttl_grss_wt"),
				MCItemDef.create("ttl_dim", "ttl_dim"),
				MCItemDef.create("iv_src_typ", "iv_src_typ")
			}
			,
			MCBlockDef.create("Srch01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL1750_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1750", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("sim_cnd_grp_no", "sim_cnd_grp_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("cntry_org_nm", "cntry_org_nm"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("cntnr_cd", "cntnr_cd"),
				MCItemDef.create("cntnr_nm", "cntnr_nm"),
				MCItemDef.create("cntnr_no_fr", "cntnr_no_fr"),
				MCItemDef.create("cntnr_no_to", "cntnr_no_to"),
				MCItemDef.create("net_wt", "net_wt"),
				MCItemDef.create("grss_wt", "grss_wt"),
				MCItemDef.create("dim", "dim"),
				MCItemDef.create("sum_qty", "sum_qty"),
				MCItemDef.create("pl_d_rmrks", "pl_d_rmrks"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place")
			}
			,
			MCBlockDef.create("Srch01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1750_Srch02_INFO = new MCOperationInfo("MS", "MSBEL1750", "Srch02", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1750_Srch02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1750", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("iv_no", "iv_no")
			}
			,
			MCBlockDef.create("Srch02_Cnd")
		);
	}


	public static MCContainerDef MS_MSBEL1750_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1750", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("non_cmpl_flg", "non_cmpl_flg"),
				MCItemDef.create("cmpl_flg", "cmpl_flg"),
				MCItemDef.create("pl_prnt_flg", "pl_prnt_flg"),
				MCItemDef.create("dlv_id_typ", "dlv_id_typ"),
				MCItemDef.create("dlv_id_typ_nm", "dlv_id_typ_nm"),
				MCItemDef.create("dlv_id_cd", "dlv_id_cd"),
				MCItemDef.create("dlv_id_nm", "dlv_id_nm"),
				MCItemDef.create("dlv_cntry_cd", "dlv_cntry_cd"),
				MCItemDef.create("dlv_cntry_nm", "dlv_cntry_nm"),
				MCItemDef.create("ship_rqst_id_typ", "ship_rqst_id_typ"),
				MCItemDef.create("ship_rqst_id_typ_nm", "ship_rqst_id_typ_nm"),
				MCItemDef.create("ship_rqst_id_cd", "ship_rqst_id_cd"),
				MCItemDef.create("ship_rqst_id_nm", "ship_rqst_id_nm"),
				MCItemDef.create("tdlv_cd", "tdlv_cd"),
				MCItemDef.create("tdlv_nm", "tdlv_nm"),
				MCItemDef.create("trnspt_cd", "trnspt_cd"),
				MCItemDef.create("trnspt_nm", "trnspt_nm"),
				MCItemDef.create("pl_rmrks", "pl_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("ins_usr_id", "ins_usr_id"),
				MCItemDef.create("ins_usr_nm", "ins_usr_nm"),
				MCItemDef.create("ins_func_id", "ins_func_id"),
				MCItemDef.create("ins_func_nm", "ins_func_nm"),
				MCItemDef.create("ins_ts", "ins_ts"),
				MCItemDef.create("upd_usr_id", "upd_usr_id"),
				MCItemDef.create("upd_usr_nm", "upd_usr_nm"),
				MCItemDef.create("upd_func_id", "upd_func_id"),
				MCItemDef.create("upd_func_nm", "upd_func_nm"),
				MCItemDef.create("upd_ts", "upd_ts"),
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("ttl_net_wt", "ttl_net_wt"),
				MCItemDef.create("ttl_grss_wt", "ttl_grss_wt"),
				MCItemDef.create("ttl_dim", "ttl_dim"),
				MCItemDef.create("iv_src_typ", "iv_src_typ")
			}
			,
			MCBlockDef.create("Srch02_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL1750_Srch02_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1750", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("sim_cnd_grp_no", "sim_cnd_grp_no"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("cntry_org_nm", "cntry_org_nm"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_nm", "trd_unit_nm"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("cntnr_cd", "cntnr_cd"),
				MCItemDef.create("cntnr_nm", "cntnr_nm"),
				MCItemDef.create("cntnr_no_fr", "cntnr_no_fr"),
				MCItemDef.create("cntnr_no_to", "cntnr_no_to"),
				MCItemDef.create("net_wt", "net_wt"),
				MCItemDef.create("grss_wt", "grss_wt"),
				MCItemDef.create("dim", "dim"),
				MCItemDef.create("sum_qty", "sum_qty"),
				MCItemDef.create("pl_d_rmrks", "pl_d_rmrks"),
				MCItemDef.create("cst_po_no", "cst_po_no"),
				MCItemDef.create("cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("disp_seq", "disp_seq"),
				MCItemDef.create("trd_unit_dec_place", "trd_unit_dec_place")
			}
			,
			MCBlockDef.create("Srch02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1750_Srch03_INFO = new MCOperationInfo("MS", "MSBEL1750", "Srch03", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1750_Srch03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1750", "Srch03",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty")
			}
			,
			MCBlockDef.create("Srch03_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL1750_Srch03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1750", "Srch03",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("net_wt", "net_wt"),
				MCItemDef.create("dim", "dim")
			}
			,
			MCBlockDef.create("Srch03_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1750_Chk01_INFO = new MCOperationInfo("MS", "MSBEL1750", "Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1750_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1750", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("pl_immed_prnt_flg", "pl_immed_prnt_flg"),
				MCItemDef.create("pl_rmrks", "pl_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Chk01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL1750_Chk01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1750", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("PL_d" + ".itm_cd", "itm_cd"),
				MCItemDef.create("PL_d" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("PL_d" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("PL_d" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("PL_d" + ".sundry_itm_flg", "sundry_flg"),
				MCItemDef.create("PL_d" + ".itm_nm", "itm_nm"),
				MCItemDef.create("PL_d" + ".sno1", "sno1"),
				MCItemDef.create("PL_d" + ".sno2", "sno2"),
				MCItemDef.create("PL_d" + ".sno3", "sno3"),
				MCItemDef.create("PL_d" + ".sno4", "sno4"),
				MCItemDef.create("PL_d" + ".iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("PL_d" + ".cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("PL_d" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("PL_d" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("PL_d" + ".cntnr_cd", "cntnr_cd"),
				MCItemDef.create("PL_d" + ".cntnr_no_fr", "cntnr_no_fr"),
				MCItemDef.create("PL_d" + ".cntnr_no_to", "cntnr_no_to"),
				MCItemDef.create("PL_d" + ".net_wt", "net_wt"),
				MCItemDef.create("PL_d" + ".grss_wt", "grss_wt"),
				MCItemDef.create("PL_d" + ".dim", "dim"),
				MCItemDef.create("PL_d" + ".pl_d_rmrks", "pl_d_rmrks"),
				MCItemDef.create("PL_d" + ".cst_po_no", "cst_po_no"),
				MCItemDef.create("PL_d" + ".cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("PL_d" + ".cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("PL_d" + ".cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("PL_d" + ".intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("PL_d" + ".sub_char1", "sub_char1"),
				MCItemDef.create("PL_d" + ".sub_char2", "sub_char2"),
				MCItemDef.create("PL_d" + ".sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBEL1750_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1750", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("pl_immed_prnt_flg", "pl_immed_prnt_flg"),
				MCItemDef.create("ship_rqst_id_typ", "ship_rqst_id_typ"),
				MCItemDef.create("ship_rqst_id_typ_nm", "ship_rqst_id_typ_nm"),
				MCItemDef.create("pl_rmrks", "pl_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr"),
				MCItemDef.create("iv_mng_no", "iv_mng_no"),
				MCItemDef.create("iv_rev", "iv_rev"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Chk01_Hdr")
		);
	}
	public static MCContainerDef MS_MSBEL1750_Chk01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1750", "Chk01",
			new MCItemDef[]{
				MCItemDef.create("PL_d" + ".itm_cd", "itm_cd"),
				MCItemDef.create("PL_d" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("PL_d" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("PL_d" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("PL_d" + ".sundry_itm_flg", "sundry_flg"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("PL_d" + ".itm_nm", "itm_nm"),
				MCItemDef.create("PL_d" + ".sno1", "sno1"),
				MCItemDef.create("PL_d" + ".sno2", "sno2"),
				MCItemDef.create("PL_d" + ".sno3", "sno3"),
				MCItemDef.create("PL_d" + ".sno4", "sno4"),
				MCItemDef.create("PL_d" + ".iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("PL_d" + ".cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("PL_d" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("PL_d" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("PL_d" + ".cntnr_cd", "cntnr_cd"),
				MCItemDef.create("PL_d" + ".cntnr_no_fr", "cntnr_no_fr"),
				MCItemDef.create("PL_d" + ".cntnr_no_to", "cntnr_no_to"),
				MCItemDef.create("PL_d" + ".net_wt", "net_wt"),
				MCItemDef.create("PL_d" + ".grss_wt", "grss_wt"),
				MCItemDef.create("PL_d" + ".dim", "dim"),
				MCItemDef.create("PL_d" + ".pl_d_rmrks", "pl_d_rmrks"),
				MCItemDef.create("PL_d" + ".cst_po_no", "cst_po_no"),
				MCItemDef.create("PL_d" + ".cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("PL_d" + ".cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("PL_d" + ".cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("PL_d" + ".intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("PL_d" + ".sub_char1", "sub_char1"),
				MCItemDef.create("PL_d" + ".sub_char2", "sub_char2"),
				MCItemDef.create("PL_d" + ".sub_char3", "sub_char3"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1750_Upd01_INFO = new MCOperationInfo("MS", "MSBEL1750", "Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1750_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1750", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("pl_immed_prnt_flg", "pl_immed_prnt_flg"),
				MCItemDef.create("pl_rmrks", "pl_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Hdr")
		);
	}

	public static MCContainerDef MS_MSBEL1750_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MS", "MSBEL1750", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("PL_d" + ".itm_cd", "itm_cd"),
				MCItemDef.create("PL_d" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("PL_d" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("PL_d" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("PL_d" + ".sundry_itm_flg", "sundry_flg"),
				MCItemDef.create("PL_d" + ".itm_nm", "itm_nm"),
				MCItemDef.create("PL_d" + ".sno1", "sno1"),
				MCItemDef.create("PL_d" + ".sno2", "sno2"),
				MCItemDef.create("PL_d" + ".sno3", "sno3"),
				MCItemDef.create("PL_d" + ".sno4", "sno4"),
				MCItemDef.create("PL_d" + ".iv_itm_nm", "iv_itm_nm"),
				MCItemDef.create("PL_d" + ".cntry_org_cd", "cntry_org_cd"),
				MCItemDef.create("PL_d" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("PL_d" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("PL_d" + ".cntnr_cd", "cntnr_cd"),
				MCItemDef.create("PL_d" + ".cntnr_no_fr", "cntnr_no_fr"),
				MCItemDef.create("PL_d" + ".cntnr_no_to", "cntnr_no_to"),
				MCItemDef.create("PL_d" + ".net_wt", "net_wt"),
				MCItemDef.create("PL_d" + ".grss_wt", "grss_wt"),
				MCItemDef.create("PL_d" + ".dim", "dim"),
				MCItemDef.create("PL_d" + ".pl_d_rmrks", "pl_d_rmrks"),
				MCItemDef.create("PL_d" + ".cst_po_no", "cst_po_no"),
				MCItemDef.create("PL_d" + ".cst_po_d_no", "cst_po_d_no"),
				MCItemDef.create("PL_d" + ".cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("PL_d" + ".cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("PL_d" + ".intr_d_rmrks", "intr_d_rmrks"),
				MCItemDef.create("PL_d" + ".sub_char1", "sub_char1"),
				MCItemDef.create("PL_d" + ".sub_char2", "sub_char2"),
				MCItemDef.create("PL_d" + ".sub_char3", "sub_char3")
			}
			,
			MCBlockDef.create("Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1750_Del01_INFO = new MCOperationInfo("MS", "MSBEL1750", "Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1750_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1750", "Del01",
			new MCItemDef[]{
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Hdr")
		);
	}
	
	static final MCOperationInfo MS_MSBEL1750_Prnt01_INFO = new MCOperationInfo("MS", "MSBEL1750", "Prnt01", "000000", new PDef());

	public static MCContainerDef MS_MSBEL1750_Prnt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBEL1750", "Prnt01",
			new MCItemDef[]{
				MCItemDef.create("iv_no", "iv_no")
			}
			,
			MCBlockDef.create("Prnt01_Cnd")
		);
	}


	//FMCB DEF_CLASSES END
}

