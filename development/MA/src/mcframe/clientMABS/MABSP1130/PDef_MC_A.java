package mcframe.clientMABS.MABSP1130;

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;

/**
 * [MABSP_InspItmReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABSL1130.Srch01.UP.BLOCK0")){
			return MA_MABSL1130_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL1130.Srch01.DOWN.BLOCK0")){
			return MA_MABSL1130_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABSL1130.Srch01.DOWN.BLOCK1")){
			return MA_MABSL1130_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MA.MABSL1130.Srch01.DOWN.BLOCK2")){
			return MA_MABSL1130_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MA.MABSL1130.Srch01.DOWN.BLOCK3")){
			return MA_MABSL1130_Srch01_DOWN_BLOCK3();
		}
		else if (id.equals("MA.MABSL1130.Srch01.DOWN.BLOCK4")){
			return MA_MABSL1130_Srch01_DOWN_BLOCK4();
		}
		else if (id.equals("MA.MABSL1130.Upd01.UP.BLOCK0")){
			return MA_MABSL1130_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL1130.Upd01.UP.BLOCK1")){
			return MA_MABSL1130_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MA.MABSL1130.Upd01.UP.BLOCK2")){
			return MA_MABSL1130_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MA.MABSL1130.Upd01.UP.BLOCK3")){
			return MA_MABSL1130_Upd01_UP_BLOCK3();
		}
		else if (id.equals("MA.MABSL1130.Upd01.UP.BLOCK4")){
			return MA_MABSL1130_Upd01_UP_BLOCK4();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
		
	
	static final MCOperationInfo MA_MABSL1130_Srch01_INFO = new MCOperationInfo("MA", "MABSL1130", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABSL1130_Srch01_UP_BLOCK0() {
		/** Ope.のBlock [Srch01_Cnd] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1130", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("dt" + ".st_dt_fr", "st_dt_fr"),
				MCItemDef.create("dt" + ".st_dt_to", "st_dt_to"),
				MCItemDef.create("dt" + ".end_dt_fr", "end_dt_fr"),
				MCItemDef.create("dt" + ".end_dt_to", "end_dt_to"),
				MCItemDef.create("itm" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg")
			}
			,
			MCBlockDef.create("Cnd")
		);
	}


	public static MCContainerDef MA_MABSL1130_Srch01_DOWN_BLOCK0() {
	/** Ope.のBlock [Srch01_Rslt1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1130", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_p" + ".itm_nm", "itm_nm"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("lmt_ctl_flg", "lmt_ctl_flg"),
				MCItemDef.create("lmt_ctl_categ", "lmt_ctl_categ"),
				MCItemDef.create("asset_mng_typ", "asset_mng_typ"),
				MCItemDef.create("asset_mng_typ_nm", "asset_mng_typ_nm"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("insp_flg", "insp_flg"),
				MCItemDef.create("insp_input_flg", "insp_input_flg"),
				MCItemDef.create("lot_mng_typ", "lot_mng_typ"),
				MCItemDef.create("sublot_mng_typ", "sublot_mng_typ"),
				MCItemDef.create("def_insp_aprv_flg", "def_insp_aprv_flg"),
				MCItemDef.create("def_insp_aprv_role_cd", "def_insp_aprv_role_cd"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("HdrAll")
		);
	}
	public static MCContainerDef MA_MABSL1130_Srch01_DOWN_BLOCK1() {
	/** Ope.のBlock [Srch01_Rslt2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1130", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("insp_ptn_nm", "insp_ptn_nm"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("insp_mtd_typ", "insp_mtd_typ"),
				MCItemDef.create("insp_mtd_typ_nm", "insp_mtd_typ_nm"),
				MCItemDef.create("insp_lt", "insp_lt"),
				MCItemDef.create("insp_std_no", "insp_std_no"),
				MCItemDef.create("qty_p" + ".qty", "spl_qty"),
				MCItemDef.create("std_req_flg", "std_req_flg"),
				MCItemDef.create("std_cnf_req_flg", "std_cnf_req_flg"),
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
			MCBlockDef.create("Wrk11Dtl")
		);
	}
	public static MCContainerDef MA_MABSL1130_Srch01_DOWN_BLOCK2() {
	/** Ope.のBlock [Srch01_Rslt3] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1130", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("insp_seq", "insp_seq"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("insp_point_cd", "insp_point_cd"),
				MCItemDef.create("insp_point_nm", "insp_point_nm"),
				MCItemDef.create("pre_insp_inf_typ", "pre_insp_inf_typ"),
				MCItemDef.create("pre_insp_inf_typ_nm", "pre_insp_inf_typ_nm"),
				MCItemDef.create("insp_qlqn_typ", "insp_qlqn_typ"),
				MCItemDef.create("insp_qlqn_typ_nm", "insp_qlqn_typ_nm"),
				MCItemDef.create("ql_std_val", "ql_std_val"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("unit_nm", "unit_nm"),
				MCItemDef.create("qn_int_digit", "qn_int_digit"),
				MCItemDef.create("qn_int_frac", "qn_int_frac"),
				MCItemDef.create("qn_out_min_p" + ".qn_insp_val", "qn_out_min"),
				MCItemDef.create("sign_out_min_typ", "sign_out_min_typ"),
				MCItemDef.create("sign_out_min_typ_nm", "sign_out_min_typ_nm"),
				MCItemDef.create("sign_out_max_typ", "sign_out_max_typ"),
				MCItemDef.create("sign_out_max_typ_nm", "sign_out_max_typ_nm"),
				MCItemDef.create("qn_out_max_p" + ".qn_insp_val", "qn_out_max"),
				MCItemDef.create("qn_in_min_p" + ".qn_insp_val", "qn_in_min"),
				MCItemDef.create("sign_in_min_typ", "sign_in_min_typ"),
				MCItemDef.create("sign_in_min_typ_nm", "sign_in_min_typ_nm"),
				MCItemDef.create("sign_in_max_typ", "sign_in_max_typ"),
				MCItemDef.create("sign_in_max_typ_nm", "sign_in_max_typ_nm"),
				MCItemDef.create("qn_in_max_p" + ".qn_insp_val", "qn_in_max"),
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
			MCBlockDef.create("Wrk12DtlAll")
		);
	}
	public static MCContainerDef MA_MABSL1130_Srch01_DOWN_BLOCK3() {
	/** Ope.のBlock [Srch01_Rslt4] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1130", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("mfg_loc_nm", "mfg_loc_nm"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("sppl_nm", "sppl_nm"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("from_site_cd", "from_site_cd"),
				MCItemDef.create("from_site_nm", "from_site_nm"),
				MCItemDef.create("to_site_cd", "to_site_cd"),
				MCItemDef.create("to_site_nm", "to_site_nm"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("no_insp_flg", "no_insp_flg"),
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("insp_ptn_nm", "insp_ptn_nm"),
				MCItemDef.create("no_mrkt_judg_flg", "no_mrkt_judg_flg"),
				MCItemDef.create("no_plnt_aprv_flg", "no_plnt_aprv_flg"),
				MCItemDef.create("no_insp_aprv_flg", "no_insp_aprv_flg"),
				MCItemDef.create("lmt_dt_frm_typ", "lmt_dt_frm_typ"),
				MCItemDef.create("lmt_dt_frm_typ_nm", "lmt_dt_frm_typ_nm"),
				MCItemDef.create("vld_pd", "vld_pd"),
				MCItemDef.create("lmt_pd", "lmt_pd"),
				MCItemDef.create("lot_insp_vld_pd", "lot_insp_vld_pd"),
				MCItemDef.create("calc_pd_typ", "calc_pd_typ"),
				MCItemDef.create("calc_pd_typ_nm", "calc_pd_typ_nm"),
				MCItemDef.create("lot_insp_lmt_dt_frm_typ", "lot_insp_lmt_dt_frm_typ"),
				MCItemDef.create("lot_insp_lmt_dt_frm_typ_nm", "lot_insp_lmt_dt_frm_typ_nm"),
				MCItemDef.create("insp_inst_issue_typ", "insp_inst_issue_typ"),
				MCItemDef.create("insp_inst_issue_typ_nm", "insp_inst_issue_typ_nm"),
				MCItemDef.create("insp_offst", "insp_offst"),
				MCItemDef.create("inst_rslt_issue_flg", "inst_rslt_issue_flg"),
				MCItemDef.create("pre_insp_valid_flg", "pre_insp_valid_flg"),
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
			MCBlockDef.create("Wrk2Dtl")
		);
	}
	public static MCContainerDef MA_MABSL1130_Srch01_DOWN_BLOCK4() {
	/** Ope.のBlock [Srch01_Rslt5] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1130", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("site_nm", "site_nm"),
				MCItemDef.create("ntfy_nm", "ntfy_nm"),
				MCItemDef.create("num_id", "num_id"),
				MCItemDef.create("plnt_aprv_flg", "plnt_aprv_flg"),
				MCItemDef.create("plnt_aprv_role_cd", "plnt_aprv_role_cd"),
				MCItemDef.create("plnt_aprv_role_nm", "plnt_aprv_role_nm"),
				MCItemDef.create("insp_aprv_flg", "insp_aprv_flg"),
				MCItemDef.create("insp_aprv_role_cd", "insp_aprv_role_cd"),
				MCItemDef.create("insp_aprv_role_nm", "insp_aprv_role_nm"),
				MCItemDef.create("mfg_aprv_flg", "mfg_aprv_flg"),
				MCItemDef.create("mfg_aprv_role_cd", "mfg_aprv_role_cd"),
				MCItemDef.create("mfg_aprv_role_nm", "mfg_aprv_role_nm"),
				MCItemDef.create("xfr_lot_flg", "xfr_lot_flg"),
				MCItemDef.create("so_prmt_insp_flg", "so_prmt_insp_flg"),
				MCItemDef.create("in_prmt_insp_flg", "in_prmt_insp_flg"),
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
			MCBlockDef.create("Wrk3Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL1130_Upd01_INFO = new MCOperationInfo("MA", "MABSL1130", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABSL1130_Upd01_UP_BLOCK0() {
		/** Ope.のBlock [Upd01_Dtl1] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1130", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("insp_input_flg", "insp_input_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("HdrAll")
		);
	}

	public static MCContainerDef MA_MABSL1130_Upd01_UP_BLOCK1() {
		/** Ope.のBlock [Upd01_Dtl2] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1130", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("dt_p" + ".st_dt_key", "st_dt_key"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("insp_mtd_typ", "insp_mtd_typ"),
				MCItemDef.create("insp_lt", "insp_lt"),
				MCItemDef.create("insp_std_no", "insp_std_no"),
				MCItemDef.create("qty_p" + ".qty", "spl_qty"),
				MCItemDef.create("std_req_flg", "std_req_flg"),
				MCItemDef.create("std_cnf_req_flg", "std_cnf_req_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Wrk11Dtl")
		);
	}

	public static MCContainerDef MA_MABSL1130_Upd01_UP_BLOCK2() {
		/** Ope.のBlock [Upd01_Dtl3] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1130", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("insp_seq", "insp_seq"),
				MCItemDef.create("dt_p" + ".st_dt_key", "st_dt_key"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("insp_point_cd", "insp_point_cd"),
				MCItemDef.create("pre_insp_inf_typ", "pre_insp_inf_typ"),
				MCItemDef.create("insp_qlqn_typ", "insp_qlqn_typ"),
				MCItemDef.create("ql_std_val", "ql_std_val"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("qn_int_digit", "qn_int_digit"),
				MCItemDef.create("qn_int_frac", "qn_int_frac"),
				MCItemDef.create("qn_out_min_p" + ".qn_insp_val", "qn_out_min"),
				MCItemDef.create("sign_out_min_typ", "sign_out_min_typ"),
				MCItemDef.create("sign_out_max_typ", "sign_out_max_typ"),
				MCItemDef.create("qn_out_max_p" + ".qn_insp_val", "qn_out_max"),
				MCItemDef.create("qn_in_min_p" + ".qn_insp_val", "qn_in_min"),
				MCItemDef.create("sign_in_min_typ", "sign_in_min_typ"),
				MCItemDef.create("sign_in_max_typ", "sign_in_max_typ"),
				MCItemDef.create("qn_in_max_p" + ".qn_insp_val", "qn_in_max"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Wrk12DtlAll")
		);
	}

	public static MCContainerDef MA_MABSL1130_Upd01_UP_BLOCK3() {
		/** Ope.のBlock [Upd01_Dtl4] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1130", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("from_site_cd", "from_site_cd"),
				MCItemDef.create("to_site_cd", "to_site_cd"),
				MCItemDef.create("dt_p" + ".st_dt_key", "st_dt_key"),
				MCItemDef.create("dt_p" + ".st_dt", "st_dt"),
				MCItemDef.create("dt_p" + ".end_dt", "end_dt"),
				MCItemDef.create("no_insp_flg", "no_insp_flg"),
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("no_mrkt_judg_flg", "no_mrkt_judg_flg"),
				MCItemDef.create("no_plnt_aprv_flg", "no_plnt_aprv_flg"),
				MCItemDef.create("no_insp_aprv_flg", "no_insp_aprv_flg"),
				MCItemDef.create("lmt_dt_frm_typ", "lmt_dt_frm_typ"),
				MCItemDef.create("vld_pd", "vld_pd"),
				MCItemDef.create("lmt_pd", "lmt_pd"),
				MCItemDef.create("lot_insp_vld_pd", "lot_insp_vld_pd"),
				MCItemDef.create("calc_pd_typ", "calc_pd_typ"),
				MCItemDef.create("lot_insp_lmt_dt_frm_typ", "lot_insp_lmt_dt_frm_typ"),
				MCItemDef.create("insp_inst_issue_typ", "insp_inst_issue_typ"),
				MCItemDef.create("insp_offst", "insp_offst"),
				MCItemDef.create("inst_rslt_issue_flg", "inst_rslt_issue_flg"),
				MCItemDef.create("pre_insp_valid_flg", "pre_insp_valid_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Wrk2Dtl")
		);
	}

	public static MCContainerDef MA_MABSL1130_Upd01_UP_BLOCK4() {
		/** Ope.のBlock [Upd01_Dtl5] に対する電文項目定義 */
		return new MCGeneralContainerDef("MA", "MABSL1130", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_p" + ".itm_cd", "itm_cd"),
				MCItemDef.create("itm_p" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_p" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_p" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("site_cd", "site_cd"),
				MCItemDef.create("ntfy_nm", "ntfy_nm"),
				MCItemDef.create("plnt_aprv_flg", "plnt_aprv_flg"),
				MCItemDef.create("plnt_aprv_role_cd", "plnt_aprv_role_cd"),
				MCItemDef.create("insp_aprv_flg", "insp_aprv_flg"),
				MCItemDef.create("insp_aprv_role_cd", "insp_aprv_role_cd"),
				MCItemDef.create("mfg_aprv_flg", "mfg_aprv_flg"),
				MCItemDef.create("mfg_aprv_role_cd", "mfg_aprv_role_cd"),
				MCItemDef.create("xfr_lot_flg", "xfr_lot_flg"),
				MCItemDef.create("so_prmt_insp_flg", "so_prmt_insp_flg"),
				MCItemDef.create("in_prmt_insp_flg", "in_prmt_insp_flg"),
				MCItemDef.create("num_id", "num_id"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Wrk3Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

