package mcframe.serverMAUC.MAUCL0020;

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
 * [MAUCL_AppSys]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MAUCL0020.Srch01.DOWN.BLOCK0")){
			return MA_MAUCL0020_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MAUCL0020.Srch02.DOWN.BLOCK0")){
			return MA_MAUCL0020_Srch02_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MAUCL0020.Srch03.DOWN.BLOCK0")){
			return MA_MAUCL0020_Srch03_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MAUCL0020.Srch04.DOWN.BLOCK0")){
			return MA_MAUCL0020_Srch04_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MAUCL0020.Srch05.DOWN.BLOCK0")){
			return MA_MAUCL0020_Srch05_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MAUCL0020.Srch06.DOWN.BLOCK0")){
			return MA_MAUCL0020_Srch06_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MAUCL0020.Srch07.DOWN.BLOCK0")){
			return MA_MAUCL0020_Srch07_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MAUCL0020.Srch08.DOWN.BLOCK0")){
			return MA_MAUCL0020_Srch08_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MAUCL0020.Srch09.DOWN.BLOCK0")){
			return MA_MAUCL0020_Srch09_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MAUCL0020.Srch10.DOWN.BLOCK0")){
			return MA_MAUCL0020_Srch10_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
										
	
	static final MCOperationInfo MA_MAUCL0020_Srch01_INFO = new MCOperationInfo("MA", "MAUCL0020", "Srch01", "000000", new PDef());


	public static MCContainerDef MA_MAUCL0020_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUCL0020", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("co" + ".co_cd", "co_cd"),
				MCItemDef.create("co" + ".co_nm", "co_nm"),
				MCItemDef.create("co" + ".co_alt_nm1", "co_alt_nm1"),
				MCItemDef.create("co" + ".co_alt_nm2", "co_alt_nm2"),
				MCItemDef.create("co" + ".co_alt_nm3", "co_alt_nm3"),
				MCItemDef.create("co" + ".co_alt_nm4", "co_alt_nm4"),
				MCItemDef.create("co" + ".zip_cd", "zip_cd"),
				MCItemDef.create("co" + ".addr1", "addr1"),
				MCItemDef.create("co" + ".addr2", "addr2"),
				MCItemDef.create("co" + ".addr3", "addr3"),
				MCItemDef.create("co" + ".addr4", "addr4"),
				MCItemDef.create("co" + ".tel", "tel"),
				MCItemDef.create("co" + ".fax", "fax"),
				MCItemDef.create("co" + ".co_repl_nm", "co_repl_nm"),
				MCItemDef.create("co" + ".ein", "ein"),
				MCItemDef.create("co" + ".biz_co_no", "biz_co_no"),
				MCItemDef.create("co" + ".std_co_cd", "std_co_cd"),
				MCItemDef.create("co" + ".cntry_cd", "cntry_cd"),
				MCItemDef.create("co" + ".area_cd", "area_cd"),
				MCItemDef.create("co" + ".base_cur_cd", "base_cur_cd"),
				MCItemDef.create("co" + ".ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("co" + ".st_mon", "st_mon"),
				MCItemDef.create("co" + ".ac_cl_day", "ac_cl_day"),
				MCItemDef.create("co" + ".ac_cl_mon_base", "ac_cl_mon_base"),
				MCItemDef.create("co" + ".ar_no_use_flg", "ar_no_use_flg"),
				MCItemDef.create("co" + ".ap_no_use_flg", "ap_no_use_flg"),
				MCItemDef.create("co" + ".temp_ap_use_flg", "temp_ap_use_flg"),
				MCItemDef.create("co" + ".std_cal_cd", "std_cal_cd"),
				MCItemDef.create("co" + ".bill_cl_cal_cd", "bill_cl_cal_cd"),
				MCItemDef.create("co" + ".sls_cl_flg", "sls_cl_flg"),
				MCItemDef.create("co" + ".rcv_cl_flg", "rcv_cl_flg"),
				MCItemDef.create("co" + ".purc_cl_flg", "purc_cl_flg"),
				MCItemDef.create("co" + ".pay_cl_flg", "pay_cl_flg"),
				MCItemDef.create("co" + ".sls_cl_cal_cd", "sls_cl_cal_cd"),
				MCItemDef.create("co" + ".rcv_cl_cal_cd", "rcv_cl_cal_cd"),
				MCItemDef.create("co" + ".purc_cl_cal_cd", "purc_cl_cal_cd"),
				MCItemDef.create("co" + ".pay_cl_cal_cd", "pay_cl_cal_cd"),
				MCItemDef.create("co" + ".stk_cl_cal_cd", "stk_cl_cal_cd"),
				MCItemDef.create("co" + ".sls_cl_delay_days", "sls_cl_delay_days"),
				MCItemDef.create("co" + ".sls_cl_ba_typ", "sls_cl_ba_typ"),
				MCItemDef.create("co" + ".rcv_cl_delay_days", "rcv_cl_delay_days"),
				MCItemDef.create("co" + ".rcv_cl_ba_typ", "rcv_cl_ba_typ"),
				MCItemDef.create("co" + ".purc_cl_delay_days", "purc_cl_delay_days"),
				MCItemDef.create("co" + ".purc_cl_ba_typ", "purc_cl_ba_typ"),
				MCItemDef.create("co" + ".pay_cl_delay_days", "pay_cl_delay_days"),
				MCItemDef.create("co" + ".pay_cl_ba_typ", "pay_cl_ba_typ"),
				MCItemDef.create("co" + ".stk_cl_delay_days", "stk_cl_delay_days"),
				MCItemDef.create("co" + ".stk_cl_ba_typ", "stk_cl_ba_typ"),
				MCItemDef.create("co" + ".sls_xrate_cd", "sls_xrate_cd"),
				MCItemDef.create("co" + ".purc_xrate_cd", "purc_xrate_cd"),
				MCItemDef.create("co" + ".prov_xrate_cd", "prov_xrate_cd"),
				MCItemDef.create("co" + ".bill_xrate_conv_flg", "bill_xrate_conv_flg"),
				MCItemDef.create("co" + ".bill_xrate_cd", "bill_xrate_cd"),
				MCItemDef.create("co" + ".pay_xrate_conv_flg", "pay_xrate_conv_flg"),
				MCItemDef.create("co" + ".pay_xrate_cd", "pay_xrate_cd"),
				MCItemDef.create("co" + ".mon01_xrate_rev_flg", "mon01_xrate_rev_flg"),
				MCItemDef.create("co" + ".mon02_xrate_rev_flg", "mon02_xrate_rev_flg"),
				MCItemDef.create("co" + ".mon03_xrate_rev_flg", "mon03_xrate_rev_flg"),
				MCItemDef.create("co" + ".mon04_xrate_rev_flg", "mon04_xrate_rev_flg"),
				MCItemDef.create("co" + ".mon05_xrate_rev_flg", "mon05_xrate_rev_flg"),
				MCItemDef.create("co" + ".mon06_xrate_rev_flg", "mon06_xrate_rev_flg"),
				MCItemDef.create("co" + ".mon07_xrate_rev_flg", "mon07_xrate_rev_flg"),
				MCItemDef.create("co" + ".mon08_xrate_rev_flg", "mon08_xrate_rev_flg"),
				MCItemDef.create("co" + ".mon09_xrate_rev_flg", "mon09_xrate_rev_flg"),
				MCItemDef.create("co" + ".mon10_xrate_rev_flg", "mon10_xrate_rev_flg"),
				MCItemDef.create("co" + ".mon11_xrate_rev_flg", "mon11_xrate_rev_flg"),
				MCItemDef.create("co" + ".mon12_xrate_rev_flg", "mon12_xrate_rev_flg"),
				MCItemDef.create("co" + ".sls_upri_req_typ", "sls_upri_req_typ"),
				MCItemDef.create("co" + ".purc_upri_req_typ", "purc_upri_req_typ"),
				MCItemDef.create("co" + ".outsrc_upri_typ", "outsrc_upri_typ"),
				MCItemDef.create("co" + ".xrate_rnd_typ", "xrate_rnd_typ"),
				MCItemDef.create("co" + ".sls_basis_typ", "sls_basis_typ"),
				MCItemDef.create("co" + ".bill_basis_typ", "bill_basis_typ"),
				MCItemDef.create("co" + ".ship_schd_split_typ", "ship_schd_split_typ"),
				MCItemDef.create("co" + ".xfr_stk_mng_typ", "xfr_stk_mng_typ"),
				MCItemDef.create("co" + ".setoff_tax_rnd_typ", "setoff_tax_rnd_typ"),
				MCItemDef.create("co" + ".com_paid_tax_rnd_typ", "com_paid_tax_rnd_typ"),
				MCItemDef.create("co" + ".wtax_rnd_typ", "wtax_rnd_typ"),
				MCItemDef.create("co" + ".stk_amt_rnd_typ", "stk_amt_rnd_typ"),
				MCItemDef.create("co" + ".stk_amt_dec_place", "stk_amt_dec_place"),
				MCItemDef.create("co" + ".sls_bdj_rnd_typ", "sls_bdj_rnd_typ"),
				MCItemDef.create("co" + ".po_print_cd", "po_print_cd"),
				MCItemDef.create("co" + ".stk_lst_cnf_num", "stk_lst_cnf_num"),
				MCItemDef.create("co" + ".stk_lst_limit_num", "stk_lst_limit_num"),
				MCItemDef.create("co" + ".gm_std_upri_typ", "gm_std_upri_typ"),
				MCItemDef.create("co" + ".stk_std_upri_typ", "stk_std_upri_typ"),
				MCItemDef.create("co" + ".early_ship_dt_add_days", "early_ship_dt_add_days"),
				MCItemDef.create("co" + ".ac_slip_digit", "ac_slip_digit"),
				MCItemDef.create("co" + ".ac_slip_seq_flg", "ac_slip_seq_flg"),
				MCItemDef.create("co" + ".rpt_strg_ext_sys_cd", "rpt_strg_ext_sys_cd"),
				MCItemDef.create("co" + ".memo1", "memo1"),
				MCItemDef.create("co" + ".memo2", "memo2"),
				MCItemDef.create("co" + ".memo3", "memo3"),
				MCItemDef.create("co" + ".dt_switch_time", "dt_switch_time"),
				MCItemDef.create("co" + ".pay_schd_cl_cal_cd", "pay_schd_cl_cal_cd")
			}
			,
			MCBlockDef.create("Co")
		);
	}
	
	static final MCOperationInfo MA_MAUCL0020_Srch02_INFO = new MCOperationInfo("MA", "MAUCL0020", "Srch02", "000000", new PDef());


	public static MCContainerDef MA_MAUCL0020_Srch02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUCL0020", "Srch02",
			new MCItemDef[]{
				MCItemDef.create("sp" + ".parm_key", "parm_key"),
				MCItemDef.create("sp" + ".parm_val", "parm_val")
			}
			,
			MCBlockDef.create("SysParm")
		);
	}
	
	static final MCOperationInfo MA_MAUCL0020_Srch03_INFO = new MCOperationInfo("MA", "MAUCL0020", "Srch03", "000000", new PDef());


	public static MCContainerDef MA_MAUCL0020_Srch03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUCL0020", "Srch03",
			new MCItemDef[]{
				MCItemDef.create("term", "term"),
				MCItemDef.create("term_end_ym", "term_end_ym"),
				MCItemDef.create("term_nm", "term_nm")
			}
			,
			MCBlockDef.create("Term")
		);
	}
	
	static final MCOperationInfo MA_MAUCL0020_Srch04_INFO = new MCOperationInfo("MA", "MAUCL0020", "Srch04", "000000", new PDef());


	public static MCContainerDef MA_MAUCL0020_Srch04_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUCL0020", "Srch04",
			new MCItemDef[]{
				MCItemDef.create("bc" + ".cur_cd", "cur_cd"),
				MCItemDef.create("bc" + ".cur_nm", "cur_nm"),
				MCItemDef.create("bc" + ".amt_dec_place", "amt_dec_place"),
				MCItemDef.create("bc" + ".upri_dec_place", "upri_dec_place")
			}
			,
			MCBlockDef.create("BaseCur")
		);
	}
	
	static final MCOperationInfo MA_MAUCL0020_Srch05_INFO = new MCOperationInfo("MA", "MAUCL0020", "Srch05", "000000", new PDef());


	public static MCContainerDef MA_MAUCL0020_Srch05_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUCL0020", "Srch05",
			new MCItemDef[]{
				MCItemDef.create("pc" + ".cur_cd", "cur_cd"),
				MCItemDef.create("pc" + ".cur_nm", "cur_nm"),
				MCItemDef.create("pc" + ".amt_dec_place", "amt_dec_place"),
				MCItemDef.create("pc" + ".upri_dec_place", "upri_dec_place")
			}
			,
			MCBlockDef.create("PtaxCur")
		);
	}
	
	static final MCOperationInfo MA_MAUCL0020_Srch06_INFO = new MCOperationInfo("MA", "MAUCL0020", "Srch06", "000000", new PDef());


	public static MCContainerDef MA_MAUCL0020_Srch06_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUCL0020", "Srch06",
			new MCItemDef[]{
				MCItemDef.create("gd" + ".gd_cd", "gd_cd"),
				MCItemDef.create("gd" + ".gd_nm", "gd_nm")
			}
			,
			MCBlockDef.create("Gd")
		);
	}
	
	static final MCOperationInfo MA_MAUCL0020_Srch07_INFO = new MCOperationInfo("MA", "MAUCL0020", "Srch07", "000000", new PDef());


	public static MCContainerDef MA_MAUCL0020_Srch07_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUCL0020", "Srch07",
			new MCItemDef[]{
				MCItemDef.create("medicine_enable_flg", "medicine_enable_flg"),
				MCItemDef.create("plmlink_enable_flg", "plmlink_enable_flg")
			}
			,
			MCBlockDef.create("Licence")
		);
	}
	
	static final MCOperationInfo MA_MAUCL0020_Srch08_INFO = new MCOperationInfo("MA", "MAUCL0020", "Srch08", "000000", new PDef());


	public static MCContainerDef MA_MAUCL0020_Srch08_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUCL0020", "Srch08",
			new MCItemDef[]{
				MCItemDef.create("db" + ".dblink_nm", "dblink_nm")
			}
			,
			MCBlockDef.create("Dblink")
		);
	}
	
	static final MCOperationInfo MA_MAUCL0020_Srch09_INFO = new MCOperationInfo("MA", "MAUCL0020", "Srch09", "000000", new PDef());


	public static MCContainerDef MA_MAUCL0020_Srch09_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUCL0020", "Srch09",
			new MCItemDef[]{
				MCItemDef.create("co" + ".std_rnd_typ", "std_rnd_typ"),
				MCItemDef.create("co" + ".std_dec_place", "std_dec_place"),
				MCItemDef.create("co" + ".amt_rnd_typ", "amt_rnd_typ"),
				MCItemDef.create("co" + ".amt_dec_place", "amt_dec_place"),
				MCItemDef.create("co" + ".ave_rnd_typ", "ave_rnd_typ"),
				MCItemDef.create("co" + ".ave_dec_place", "ave_dec_place"),
				MCItemDef.create("co" + ".adj_typ", "adj_typ"),
				MCItemDef.create("co" + ".mrgn_expns_cd", "mrgn_expns_cd"),
				MCItemDef.create("co" + ".purc_expns_cd", "purc_expns_cd"),
				MCItemDef.create("co" + ".out_expns_cd", "out_expns_cd"),
				MCItemDef.create("co" + ".inpt_expns_cd", "inpt_expns_cd"),
				MCItemDef.create("co" + ".ss_expns_cd", "ss_expns_cd"),
				MCItemDef.create("co" + ".prov_expns_cd", "prov_expns_cd"),
				MCItemDef.create("co" + ".diff_use_typ", "diff_use_typ"),
				MCItemDef.create("co" + ".def_calc_ctg_cd", "def_calc_ctg_cd"),
				MCItemDef.create("co" + ".amt_disp_digit", "amt_disp_digit"),
				MCItemDef.create("co" + ".unit_disp_digit", "unit_disp_digit"),
				MCItemDef.create("co" + ".std_disp_digit", "std_disp_digit"),
				MCItemDef.create("co" + ".rate_disp_digit", "rate_disp_digit"),
				MCItemDef.create("co" + ".excel_pln_flg", "excel_pln_flg"),
				MCItemDef.create("co" + ".excel_act_flg", "excel_act_flg"),
				MCItemDef.create("co" + ".excel_alc_flg", "excel_alc_flg")
			}
			,
			MCBlockDef.create("CoParm")
		);
	}
	
	static final MCOperationInfo MA_MAUCL0020_Srch10_INFO = new MCOperationInfo("MA", "MAUCL0020", "Srch10", "000000", new PDef());


	public static MCContainerDef MA_MAUCL0020_Srch10_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MAUCL0020", "Srch10",
			new MCItemDef[]{
				MCItemDef.create("usr" + ".usr_cd", "usr_cd"),
				MCItemDef.create("usr" + ".st_dt", "st_dt"),
				MCItemDef.create("usr" + ".end_dt", "end_dt"),
				MCItemDef.create("usr" + ".da_cd", "da_cd"),
				MCItemDef.create("usr" + ".pre_cl_usr_flg", "pre_cl_usr_flg"),
				MCItemDef.create("usr" + ".dpt_cd", "dpt_cd"),
				MCItemDef.create("usr" + ".add_dpt_cd1", "add_dpt_cd1"),
				MCItemDef.create("usr" + ".add_dpt_cd2", "add_dpt_cd2"),
				MCItemDef.create("usr" + ".add_dpt_cd3", "add_dpt_cd3"),
				MCItemDef.create("usr" + ".add_dpt_cd4", "add_dpt_cd4"),
				MCItemDef.create("usr" + ".add_dpt_cd5", "add_dpt_cd5"),
				MCItemDef.create("usr" + ".add_dpt_cd6", "add_dpt_cd6"),
				MCItemDef.create("usr" + ".add_dpt_cd7", "add_dpt_cd7"),
				MCItemDef.create("usr" + ".add_dpt_cd8", "add_dpt_cd8"),
				MCItemDef.create("usr" + ".add_dpt_cd9", "add_dpt_cd9"),
				MCItemDef.create("usr" + ".aprv_role_cd", "aprv_role_cd"),
				MCItemDef.create("usr" + ".aprv_role_cd1", "aprv_role_cd1"),
				MCItemDef.create("usr" + ".aprv_role_cd2", "aprv_role_cd2"),
				MCItemDef.create("usr" + ".aprv_role_cd3", "aprv_role_cd3"),
				MCItemDef.create("usr" + ".aprv_role_cd4", "aprv_role_cd4"),
				MCItemDef.create("usr" + ".aprv_role_cd5", "aprv_role_cd5"),
				MCItemDef.create("usr" + ".aprv_role_cd6", "aprv_role_cd6"),
				MCItemDef.create("usr" + ".aprv_role_cd7", "aprv_role_cd7"),
				MCItemDef.create("usr" + ".aprv_role_cd8", "aprv_role_cd8"),
				MCItemDef.create("usr" + ".aprv_role_cd9", "aprv_role_cd9"),
				MCItemDef.create("usr" + ".sub_aprv_role_cd", "sub_aprv_role_cd"),
				MCItemDef.create("usr" + ".sub_aprv_role_cd1", "sub_aprv_role_cd1"),
				MCItemDef.create("usr" + ".sub_aprv_role_cd2", "sub_aprv_role_cd2"),
				MCItemDef.create("usr" + ".sub_aprv_role_cd3", "sub_aprv_role_cd3"),
				MCItemDef.create("usr" + ".sub_aprv_role_cd4", "sub_aprv_role_cd4"),
				MCItemDef.create("usr" + ".sub_aprv_role_cd5", "sub_aprv_role_cd5"),
				MCItemDef.create("usr" + ".sub_aprv_role_cd6", "sub_aprv_role_cd6"),
				MCItemDef.create("usr" + ".sub_aprv_role_cd7", "sub_aprv_role_cd7"),
				MCItemDef.create("usr" + ".sub_aprv_role_cd8", "sub_aprv_role_cd8"),
				MCItemDef.create("usr" + ".sub_aprv_role_cd9", "sub_aprv_role_cd9"),
				MCItemDef.create("usr" + ".cl_usr_flg", "cl_usr_flg")
			}
			,
			MCBlockDef.create("UsrAcl")
		);
	}
	//FMCB DEF_CLASSES END
}

