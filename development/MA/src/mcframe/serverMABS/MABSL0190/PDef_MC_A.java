package mcframe.serverMABS.MABSL0190;

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
 * [MABSL_ItmInspReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABSL0190.ItmInsp_UpdChk01.UP.BLOCK0")){
			return MA_MABSL0190_ItmInsp_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0190.ItmInsp_Upd01.UP.BLOCK0")){
			return MA_MABSL0190_ItmInsp_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0190.ItmInsp_DelChk01.UP.BLOCK0")){
			return MA_MABSL0190_ItmInsp_DelChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0190.ItmInsp_Del01.UP.BLOCK0")){
			return MA_MABSL0190_ItmInsp_Del01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0190.Srch01.UP.BLOCK0")){
			return MA_MABSL0190_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0190.Srch01.DOWN.BLOCK0")){
			return MA_MABSL0190_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABSL0190.Sprt01.UP.BLOCK0")){
			return MA_MABSL0190_Sprt01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0190.Sprt01.DOWN.BLOCK0")){
			return MA_MABSL0190_Sprt01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABSL0190.Upd01.UP.BLOCK0")){
			return MA_MABSL0190_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABSL0190.Del01.UP.BLOCK0")){
			return MA_MABSL0190_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
								
	
	static final MCOperationInfo MA_MABSL0190_ItmInsp_UpdChk01_INFO = new MCOperationInfo("MA", "MABSL0190", "ItmInsp_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0190_ItmInsp_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0190", "ItmInsp_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("from_site_cd", "from_site_cd"),
				MCItemDef.create("to_site_cd", "to_site_cd"),
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
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
			MCBlockDef.create("ItmInsp_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0190_ItmInsp_Upd01_INFO = new MCOperationInfo("MA", "MABSL0190", "ItmInsp_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0190_ItmInsp_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0190", "ItmInsp_Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("from_site_cd", "from_site_cd"),
				MCItemDef.create("to_site_cd", "to_site_cd"),
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
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
			MCBlockDef.create("ItmInsp_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0190_ItmInsp_DelChk01_INFO = new MCOperationInfo("MA", "MABSL0190", "ItmInsp_DelChk01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0190_ItmInsp_DelChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0190", "ItmInsp_DelChk01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("from_site_cd", "from_site_cd"),
				MCItemDef.create("to_site_cd", "to_site_cd"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ItmInsp_DelChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0190_ItmInsp_Del01_INFO = new MCOperationInfo("MA", "MABSL0190", "ItmInsp_Del01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0190_ItmInsp_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0190", "ItmInsp_Del01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("from_site_cd", "from_site_cd"),
				MCItemDef.create("to_site_cd", "to_site_cd"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("ItmInsp_Del01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0190_Srch01_INFO = new MCOperationInfo("MA", "MABSL0190", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0190_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0190", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("st_dt_fr", "st_dt_fr"),
				MCItemDef.create("st_dt_to", "st_dt_to"),
				MCItemDef.create("end_dt_fr", "end_dt_fr"),
				MCItemDef.create("end_dt_to", "end_dt_to"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
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
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("insp_ptn_nm", "insp_ptn_nm"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
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
				MCItemDef.create("itm_grp_nm10", "itm_grp_nm10")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MA_MABSL0190_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0190", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("lmt_ctl_flg", "lmt_ctl_flg"),
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
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
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
			MCBlockDef.create("Srch01_Rslt1")
		);
	}
	
	static final MCOperationInfo MA_MABSL0190_Sprt01_INFO = new MCOperationInfo("MA", "MABSL0190", "Sprt01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0190_Sprt01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0190", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("lmt_ctl_flg", "lmt_ctl_flg"),
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
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("no_insp_flg", "no_insp_flg"),
				MCItemDef.create("insp_ptn_cd", "insp_ptn_cd"),
				MCItemDef.create("insp_ptn_nm", "insp_ptn_nm"),
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
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Sprt01_Dtl")
		);
	}


	public static MCContainerDef MA_MABSL0190_Sprt01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0190", "Sprt01",
			new MCItemDef[]{
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("lmt_ctl_flg", "lmt_ctl_flg"),
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
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
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
			MCBlockDef.create("Sprt01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABSL0190_Upd01_INFO = new MCOperationInfo("MA", "MABSL0190", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0190_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0190", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("from_site_cd", "from_site_cd"),
				MCItemDef.create("to_site_cd", "to_site_cd"),
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
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
			MCBlockDef.create("Upd01_Dtl1")
		);
	}
	
	static final MCOperationInfo MA_MABSL0190_Del01_INFO = new MCOperationInfo("MA", "MABSL0190", "Del01", "000000", new PDef());

	public static MCContainerDef MA_MABSL0190_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABSL0190", "Del01",
			new MCItemDef[]{
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("mfg_loc_cd", "mfg_loc_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("from_site_cd", "from_site_cd"),
				MCItemDef.create("to_site_cd", "to_site_cd"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Del01_Dtl1")
		);
	}


	//FMCB DEF_CLASSES END
}

