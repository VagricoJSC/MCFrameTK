package mcframe.serverMBBB.MBBBL5030;

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
 * [MBBBL_AutoJnlService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MB.MBBBL5030.AutoJnl_Chk01.UP.BLOCK0")){
			return MB_MBBBL5030_AutoJnl_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBBL5030.AutoJnl_Chk01.DOWN.BLOCK0")){
			return MB_MBBBL5030_AutoJnl_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MB.MBBBL5030.AutoJnl_Upd01.UP.BLOCK0")){
			return MB_MBBBL5030_AutoJnl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBBL5030.AutoJnl_Upd01.DOWN.BLOCK0")){
			return MB_MBBBL5030_AutoJnl_Upd01_DOWN_BLOCK0();
		}
		else if (id.equals("MB.MBBBL5030.AutoJnl_Upd02.UP.BLOCK0")){
			return MB_MBBBL5030_AutoJnl_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MB.MBBBL5030.AutoJnl_Upd02.UP.BLOCK1")){
			return MB_MBBBL5030_AutoJnl_Upd02_UP_BLOCK1();
		}
		else if (id.equals("MB.MBBBL5030.AutoJnl_Upd02.DOWN.BLOCK0")){
			return MB_MBBBL5030_AutoJnl_Upd02_DOWN_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
			
	
	static final MCOperationInfo MB_MBBBL5030_AutoJnl_Chk01_INFO = new MCOperationInfo("MB", "MBBBL5030", "AutoJnl_Chk01", "000000", new PDef());

	public static MCContainerDef MB_MBBBL5030_AutoJnl_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBBL5030", "AutoJnl_Chk01",
			new MCItemDef[]{
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("dt_fr", "dt_fr"),
				MCItemDef.create("dt_to", "dt_to"),
				MCItemDef.create("ac_slip_dt", "ac_slip_dt"),
				MCItemDef.create("jnl_act_cd", "jnl_act_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("rerun_flg", "rerun_flg"),
				MCItemDef.create("jnl_rmrks", "jnl_rmrks")
			}
			,
			MCBlockDef.create("AutoJnl_Chk01_Cnd")
		);
	}


	public static MCContainerDef MB_MBBBL5030_AutoJnl_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBBL5030", "AutoJnl_Chk01",
			new MCItemDef[]{
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("dt_fr", "dt_fr"),
				MCItemDef.create("dt_to", "dt_to"),
				MCItemDef.create("ac_slip_dt", "ac_slip_dt"),
				MCItemDef.create("jnl_act_cd", "jnl_act_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("rerun_flg", "rerun_flg"),
				MCItemDef.create("jnl_rmrks", "jnl_rmrks"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("AutoJnl_Chk01_Cnd")
		);
	}
	
	static final MCOperationInfo MB_MBBBL5030_AutoJnl_Upd01_INFO = new MCOperationInfo("MB", "MBBBL5030", "AutoJnl_Upd01", "000000", new PDef());

	public static MCContainerDef MB_MBBBL5030_AutoJnl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBBL5030", "AutoJnl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("dt_fr", "dt_fr"),
				MCItemDef.create("dt_to", "dt_to"),
				MCItemDef.create("ac_slip_dt", "ac_slip_dt"),
				MCItemDef.create("jnl_act_cd", "jnl_act_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("rerun_flg", "rerun_flg"),
				MCItemDef.create("jnl_rmrks", "jnl_rmrks")
			}
			,
			MCBlockDef.create("AutoJnl_Upd01_Cnd")
		);
	}


	public static MCContainerDef MB_MBBBL5030_AutoJnl_Upd01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBBL5030", "AutoJnl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("AutoJnl_Upd01_Cnd")
		);
	}
	
	static final MCOperationInfo MB_MBBBL5030_AutoJnl_Upd02_INFO = new MCOperationInfo("MB", "MBBBL5030", "AutoJnl_Upd02", "000000", new PDef());

	public static MCContainerDef MB_MBBBL5030_AutoJnl_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBBL5030", "AutoJnl_Upd02",
			new MCItemDef[]{
				MCItemDef.create("jnl_grp_no", "jnl_grp_no"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("ac_ym_next", "ac_ym_next"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("mon", "mon")
			}
			,
			MCBlockDef.create("AutoJnl_Upd02_Cnd")
		);
	}

	public static MCContainerDef MB_MBBBL5030_AutoJnl_Upd02_UP_BLOCK1() {

		return new MCGeneralContainerDef("MB", "MBBBL5030", "AutoJnl_Upd02",
			new MCItemDef[]{
				MCItemDef.create("jnl_grp_no", "jnl_grp_no"),
				MCItemDef.create("ac_ym", "ac_ym"),
				MCItemDef.create("pre_jnl_seq", "pre_jnl_seq"),
				MCItemDef.create("jnl_unit", "jnl_unit"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("ac_slip_dt", "ac_slip_dt"),
				MCItemDef.create("ac_dt", "ac_dt"),
				MCItemDef.create("slip_no", "slip_no"),
				MCItemDef.create("slip_seq_no", "slip_seq_no"),
				MCItemDef.create("ac_slip_typ", "ac_slip_typ"),
				MCItemDef.create("ac_rsn_cd", "ac_rsn_cd"),
				MCItemDef.create("itm_jnl_cd", "itm_jnl_cd"),
				MCItemDef.create("can_flg", "can_flg"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("sls_dpt_cd", "sls_dpt_cd"),
				MCItemDef.create("ar_dpt_cd", "ar_dpt_cd"),
				MCItemDef.create("gi_dpt_cd", "gi_dpt_cd"),
				MCItemDef.create("gr_dpt_cd", "gr_dpt_cd"),
				MCItemDef.create("bd_dpt_cd", "bd_dpt_cd"),
				MCItemDef.create("rcv_dpt_cd", "rcv_dpt_cd"),
				MCItemDef.create("so_dpt_cd", "so_dpt_cd"),
				MCItemDef.create("sub_dpt_cd1", "sub_dpt_cd1"),
				MCItemDef.create("sub_dpt_cd2", "sub_dpt_cd2"),
				MCItemDef.create("sub_dpt_cd3", "sub_dpt_cd3"),
				MCItemDef.create("usr_cd", "usr_cd"),
				MCItemDef.create("purc_typ", "purc_typ"),
				MCItemDef.create("un_fix_flg", "un_fix_flg"),
				MCItemDef.create("temp_ap_flg", "temp_ap_flg"),
				MCItemDef.create("foreign_flg", "foreign_flg"),
				MCItemDef.create("asst_typ", "asst_typ"),
				MCItemDef.create("ac_itm_grp_cd", "ac_itm_grp_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("base_unit_qty", "base_unit_qty"),
				MCItemDef.create("base_unit_cd", "base_unit_cd"),
				MCItemDef.create("trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("base_cur_cd", "base_cur_cd"),
				MCItemDef.create("base_cur_amt", "base_cur_amt"),
				MCItemDef.create("base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("ptax_cur_cd", "ptax_cur_cd"),
				MCItemDef.create("ptax_cur_amt", "ptax_cur_amt"),
				MCItemDef.create("ptax_cur_tax_amt", "ptax_cur_tax_amt"),
				MCItemDef.create("tax_cd", "tax_cd"),
				MCItemDef.create("xrate_cd", "xrate_cd"),
				MCItemDef.create("xrate", "xrate"),
				MCItemDef.create("ptax_xrate_cd", "ptax_xrate_cd"),
				MCItemDef.create("ptax_xrate", "ptax_xrate"),
				MCItemDef.create("iv_no", "iv_no"),
				MCItemDef.create("wrk_no", "wrk_no"),
				MCItemDef.create("bill_no", "bill_no"),
				MCItemDef.create("acst_cd", "acst_cd"),
				MCItemDef.create("cst_cd", "cst_cd"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("inv_loc_typ", "inv_loc_typ"),
				MCItemDef.create("rcst_cd", "rcst_cd"),
				MCItemDef.create("setoff_cd", "setoff_cd"),
				MCItemDef.create("setoff_nm", "setoff_nm"),
				MCItemDef.create("quality_typ", "quality_typ"),
				MCItemDef.create("spot_flg", "spot_flg"),
				MCItemDef.create("sttl_schd_dt", "sttl_schd_dt"),
				MCItemDef.create("sttl_cd", "sttl_cd"),
				MCItemDef.create("cst_itm_cd", "cst_itm_cd"),
				MCItemDef.create("cst_itm_nm", "cst_itm_nm"),
				MCItemDef.create("sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("slo_no", "slo_no"),
				MCItemDef.create("po_no", "po_no"),
				MCItemDef.create("bank_ac_cd", "bank_ac_cd"),
				MCItemDef.create("xfr_psn", "xfr_psn"),
				MCItemDef.create("project_cd", "project_cd"),
				MCItemDef.create("summary_cd0", "summary_cd0"),
				MCItemDef.create("summary_cd1", "summary_cd1"),
				MCItemDef.create("summary_cd2", "summary_cd2"),
				MCItemDef.create("summary_cd3", "summary_cd3"),
				MCItemDef.create("summary_cd4", "summary_cd4"),
				MCItemDef.create("summary_cd5", "summary_cd5"),
				MCItemDef.create("trd_itm_cd", "trd_itm_cd"),
				MCItemDef.create("trd_itm_sub1", "trd_itm_sub1"),
				MCItemDef.create("trd_itm_sub2", "trd_itm_sub2"),
				MCItemDef.create("trd_itm_sub3", "trd_itm_sub3"),
				MCItemDef.create("trd_itm_nm", "trd_itm_nm"),
				MCItemDef.create("trd_project_cd", "trd_project_cd"),
				MCItemDef.create("trd_summary_cd0", "trd_summary_cd0"),
				MCItemDef.create("trd_summary_cd1", "trd_summary_cd1"),
				MCItemDef.create("trd_summary_cd2", "trd_summary_cd2"),
				MCItemDef.create("trd_summary_cd3", "trd_summary_cd3"),
				MCItemDef.create("trd_summary_cd4", "trd_summary_cd4"),
				MCItemDef.create("trd_summary_cd5", "trd_summary_cd5"),
				MCItemDef.create("trd_rmrks", "trd_rmrks"),
				MCItemDef.create("trd_d_rmrks", "trd_d_rmrks"),
				MCItemDef.create("jnl_key1", "jnl_key1"),
				MCItemDef.create("jnl_key2", "jnl_key2"),
				MCItemDef.create("jnl_key3", "jnl_key3"),
				MCItemDef.create("jnl_key4", "jnl_key4"),
				MCItemDef.create("jnl_key5", "jnl_key5"),
				MCItemDef.create("jnl_key6", "jnl_key6"),
				MCItemDef.create("jnl_key7", "jnl_key7"),
				MCItemDef.create("jnl_key8", "jnl_key8"),
				MCItemDef.create("jnl_key9", "jnl_key9"),
				MCItemDef.create("jnl_key10", "jnl_key10"),
				MCItemDef.create("sub_char1", "sub_char1"),
				MCItemDef.create("sub_char2", "sub_char2"),
				MCItemDef.create("sub_char3", "sub_char3"),
				MCItemDef.create("sub_char4", "sub_char4"),
				MCItemDef.create("sub_char5", "sub_char5"),
				MCItemDef.create("sub_char6", "sub_char6"),
				MCItemDef.create("sub_char7", "sub_char7"),
				MCItemDef.create("sub_char8", "sub_char8"),
				MCItemDef.create("sub_char9", "sub_char9"),
				MCItemDef.create("sub_char10", "sub_char10"),
				MCItemDef.create("sub_num1", "sub_num1"),
				MCItemDef.create("sub_num2", "sub_num2"),
				MCItemDef.create("sub_num3", "sub_num3"),
				MCItemDef.create("sub_dt1", "sub_dt1"),
				MCItemDef.create("sub_dt2", "sub_dt2"),
				MCItemDef.create("sub_dt3", "sub_dt3"),
				MCItemDef.create("tmp_num", "tmp_num"),
				MCItemDef.create("auto_jnl_key_cd", "auto_jnl_key_cd"),
				MCItemDef.create("repurc_obli_flg", "repurc_obli_flg"),
				MCItemDef.create("trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("base_cur_proc_amt", "base_cur_proc_amt"),
				MCItemDef.create("base_cur_onr_prov_amt", "base_cur_onr_prov_amt"),
				MCItemDef.create("ptax_cur_proc_amt", "ptax_cur_proc_amt"),
				MCItemDef.create("ptax_cur_onr_prov_amt", "ptax_cur_onr_prov_amt"),
				MCItemDef.create("table_typ", "table_typ"),
				MCItemDef.create("data_no", "data_no")
			}
			,
			MCBlockDef.create("AutoJnl_Upd02_Dtl")
		);
	}


	public static MCContainerDef MB_MBBBL5030_AutoJnl_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MB", "MBBBL5030", "AutoJnl_Upd02",
			new MCItemDef[]{
				MCItemDef.create("rc", "rc")
			}
			,
			MCBlockDef.create("AutoJnl_Upd02_Cnd")
		);
	}
	//FMCB DEF_CLASSES END
}

