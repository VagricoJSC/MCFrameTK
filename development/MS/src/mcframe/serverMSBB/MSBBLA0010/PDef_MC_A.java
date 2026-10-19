package mcframe.serverMSBB.MSBBLA0010;

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
 * [MSBBLA_SlsSchdSrch]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBBLA0010.Srch01.UP.BLOCK0")){
			return MS_MSBBLA0010_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBBLA0010.Srch01.DOWN.BLOCK0")){
			return MS_MSBBLA0010_Srch01_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
	
	
	static final MCOperationInfo MS_MSBBLA0010_Srch01_INFO = new MCOperationInfo("MS", "MSBBLA0010", "Srch01", "000000", new PDef());

	public static MCContainerDef MS_MSBBLA0010_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBLA0010", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("mode", "mode"),
				MCItemDef.create("fix_f_flg", "fix_f_flg"),
				MCItemDef.create("fix_t_flg", "fix_t_flg"),
				MCItemDef.create("except_frcst_stop_flg", "except_frcst_stop_flg"),
				MCItemDef.create("cst_frcst_prnt_dt_fr", "cst_frcst_prnt_dt_fr"),
				MCItemDef.create("cst_frcst_prnt_dt_to", "cst_frcst_prnt_dt_to"),
				MCItemDef.create("rcpt_dt_fr", "rcpt_dt_fr"),
				MCItemDef.create("rcpt_dt_to", "rcpt_dt_to"),
				MCItemDef.create("frcst_st_dt_fr", "frcst_st_dt_fr"),
				MCItemDef.create("frcst_st_dt_to", "frcst_st_dt_to"),
				MCItemDef.create("frcst_end_dt_fr", "frcst_end_dt_fr"),
				MCItemDef.create("frcst_end_dt_to", "frcst_end_dt_to"),
				MCItemDef.create("frcst_dt_fr", "frcst_dt_fr"),
				MCItemDef.create("frcst_dt_to", "frcst_dt_to"),
				MCItemDef.create("latest_flg", "latest_flg"),
				MCItemDef.create("zoho_sls_schd_no", "zoho_sls_schd_no"),
				MCItemDef.create("deal_cd", "deal_cd"),
				MCItemDef.create("deal_nm", "deal_nm"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("can_rsn_cd", "can_rsn_cd"),
				MCItemDef.create("can_rsn_nm", "can_rsn_nm"),
				MCItemDef.create("dlv_cd", "dlv_cd"),
				MCItemDef.create("dlv_nm", "dlv_nm"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("pj_usr_cd", "pj_usr_cd"),
				MCItemDef.create("pj_usr_nm", "pj_usr_nm"),
				MCItemDef.create("market_cd", "market_cd"),
				MCItemDef.create("market_nm", "market_nm"),
				MCItemDef.create("frcst_usr_cd", "frcst_usr_cd"),
				MCItemDef.create("frcst_usr_nm", "frcst_usr_nm"),
				MCItemDef.create("frcst_dpt_cd", "frcst_dpt_cd"),
				MCItemDef.create("frcst_dpt_nm", "frcst_dpt_nm"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("can_rmrks", "can_rmrks"),
				MCItemDef.create("intr_rmrks", "intr_rmrks"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("frcst_period_typ", "frcst_period_typ"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("prd_itm_cd", "prd_itm_cd"),
				MCItemDef.create("prd_itm_sub1", "prd_itm_sub1"),
				MCItemDef.create("prd_itm_sub2", "prd_itm_sub2"),
				MCItemDef.create("prd_itm_sub3", "prd_itm_sub3"),
				MCItemDef.create("prd_itm_nm", "prd_itm_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("cst_frcst_slip_no", "cst_frcst_slip_no"),
				MCItemDef.create("cst_frcst_d_no", "cst_frcst_d_no"),
				MCItemDef.create("cst_frcst_slip_d_no", "cst_frcst_slip_d_no"),
				MCItemDef.create("dtl_intr_rmrks", "dtl_intr_rmrks"),
				MCItemDef.create("dtl_sub_char1", "dtl_sub_char1"),
				MCItemDef.create("dtl_sub_char2", "dtl_sub_char2"),
				MCItemDef.create("dtl_sub_char3", "dtl_sub_char3"),
				MCItemDef.create("inc_can_flg", "inc_can_flg"),
				MCItemDef.create("dlv_grp_flg1", "dlv_grp_flg1"),
				MCItemDef.create("dlv_grp_cd1", "dlv_grp_cd1"),
				MCItemDef.create("dlv_grp_nm1", "dlv_grp_nm1"),
				MCItemDef.create("dlv_grp_flg2", "dlv_grp_flg2"),
				MCItemDef.create("dlv_grp_cd2", "dlv_grp_cd2"),
				MCItemDef.create("dlv_grp_nm2", "dlv_grp_nm2"),
				MCItemDef.create("dlv_grp_flg3", "dlv_grp_flg3"),
				MCItemDef.create("dlv_grp_cd3", "dlv_grp_cd3"),
				MCItemDef.create("dlv_grp_nm3", "dlv_grp_nm3"),
				MCItemDef.create("dlv_grp_flg4", "dlv_grp_flg4"),
				MCItemDef.create("dlv_grp_cd4", "dlv_grp_cd4"),
				MCItemDef.create("dlv_grp_nm4", "dlv_grp_nm4"),
				MCItemDef.create("dlv_grp_flg5", "dlv_grp_flg5"),
				MCItemDef.create("dlv_grp_cd5", "dlv_grp_cd5"),
				MCItemDef.create("dlv_grp_nm5", "dlv_grp_nm5"),
				MCItemDef.create("dlv_grp_flg6", "dlv_grp_flg6"),
				MCItemDef.create("dlv_grp_cd6", "dlv_grp_cd6"),
				MCItemDef.create("dlv_grp_nm6", "dlv_grp_nm6"),
				MCItemDef.create("dlv_grp_flg7", "dlv_grp_flg7"),
				MCItemDef.create("dlv_grp_cd7", "dlv_grp_cd7"),
				MCItemDef.create("dlv_grp_nm7", "dlv_grp_nm7"),
				MCItemDef.create("dlv_grp_flg8", "dlv_grp_flg8"),
				MCItemDef.create("dlv_grp_cd8", "dlv_grp_cd8"),
				MCItemDef.create("dlv_grp_nm8", "dlv_grp_nm8"),
				MCItemDef.create("dlv_grp_flg9", "dlv_grp_flg9"),
				MCItemDef.create("dlv_grp_cd9", "dlv_grp_cd9"),
				MCItemDef.create("dlv_grp_nm9", "dlv_grp_nm9"),
				MCItemDef.create("dlv_grp_flg10", "dlv_grp_flg10"),
				MCItemDef.create("dlv_grp_cd10", "dlv_grp_cd10"),
				MCItemDef.create("dlv_grp_nm10", "dlv_grp_nm10"),
				MCItemDef.create("cst_grp_flg1", "cst_grp_flg1"),
				MCItemDef.create("cst_grp_cd1", "cst_grp_cd1"),
				MCItemDef.create("cst_grp_nm1", "cst_grp_nm1"),
				MCItemDef.create("cst_grp_flg2", "cst_grp_flg2"),
				MCItemDef.create("cst_grp_cd2", "cst_grp_cd2"),
				MCItemDef.create("cst_grp_nm2", "cst_grp_nm2"),
				MCItemDef.create("cst_grp_flg3", "cst_grp_flg3"),
				MCItemDef.create("cst_grp_cd3", "cst_grp_cd3"),
				MCItemDef.create("cst_grp_nm3", "cst_grp_nm3"),
				MCItemDef.create("cst_grp_flg4", "cst_grp_flg4"),
				MCItemDef.create("cst_grp_cd4", "cst_grp_cd4"),
				MCItemDef.create("cst_grp_nm4", "cst_grp_nm4"),
				MCItemDef.create("cst_grp_flg5", "cst_grp_flg5"),
				MCItemDef.create("cst_grp_cd5", "cst_grp_cd5"),
				MCItemDef.create("cst_grp_nm5", "cst_grp_nm5"),
				MCItemDef.create("cst_grp_flg6", "cst_grp_flg6"),
				MCItemDef.create("cst_grp_cd6", "cst_grp_cd6"),
				MCItemDef.create("cst_grp_nm6", "cst_grp_nm6"),
				MCItemDef.create("cst_grp_flg7", "cst_grp_flg7"),
				MCItemDef.create("cst_grp_cd7", "cst_grp_cd7"),
				MCItemDef.create("cst_grp_nm7", "cst_grp_nm7"),
				MCItemDef.create("cst_grp_flg8", "cst_grp_flg8"),
				MCItemDef.create("cst_grp_cd8", "cst_grp_cd8"),
				MCItemDef.create("cst_grp_nm8", "cst_grp_nm8"),
				MCItemDef.create("cst_grp_flg9", "cst_grp_flg9"),
				MCItemDef.create("cst_grp_cd9", "cst_grp_cd9"),
				MCItemDef.create("cst_grp_nm9", "cst_grp_nm9"),
				MCItemDef.create("cst_grp_flg10", "cst_grp_flg10"),
				MCItemDef.create("cst_grp_cd10", "cst_grp_cd10"),
				MCItemDef.create("cst_grp_nm10", "cst_grp_nm10"),
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


	public static MCContainerDef MS_MSBBLA0010_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBBLA0010", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("zoho_sls_schd_no", "zoho_sls_schd_no"),
				MCItemDef.create("deal_cd", "deal_cd"),
				MCItemDef.create("deal_nm", "deal_nm"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("cst_nm", "cst_nm"),
				MCItemDef.create("bill_cst_cd", "bill_cst_cd"),
				MCItemDef.create("bill_cst_nm", "bill_cst_nm"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("sls_dpt_nm", "sls_dpt_nm"),
				MCItemDef.create("frcst_dpt_cd", "frcst_dpt_cd"),
				MCItemDef.create("frcst_dpt_nm", "frcst_dpt_nm"),
				MCItemDef.create("frcst_usr_cd", "frcst_usr_cd"),
				MCItemDef.create("frcst_usr_nm", "frcst_usr_nm"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("wrk_nm", "wrk_nm"),
				MCItemDef.create("prd_itm_cd", "prd_itm_cd"),
				MCItemDef.create("prd_itm_nm", "prd_itm_nm"),
				MCItemDef.create("order_dlv_dt", "order_dlv_dt"),
				MCItemDef.create("pst_inst_sls_dt", "pst_inst_sls_dt"),
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
				MCItemDef.create("upd_srv_req_no", "upd_srv_req_no")
			}
			,
			MCBlockDef.create("Srch01_Rslt")
		);
	}
	//FMCB DEF_CLASSES END
}

