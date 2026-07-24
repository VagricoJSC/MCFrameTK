package mcframe.serverMSBH.MSBHL5020;

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
 * [MSBHL_ApDtlRegService]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MS.MSBHL5020.ApDtl_Chk01.UP.BLOCK0")){
			return MS_MSBHL5020_ApDtl_Chk01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5020.ApDtl_Chk01.DOWN.BLOCK0")){
			return MS_MSBHL5020_ApDtl_Chk01_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5020.ApDtl_Chk03.UP.BLOCK0")){
			return MS_MSBHL5020_ApDtl_Chk03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5020.ApDtl_Chk03.DOWN.BLOCK0")){
			return MS_MSBHL5020_ApDtl_Chk03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5020.ApDtl_Upd01.UP.BLOCK0")){
			return MS_MSBHL5020_ApDtl_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5020.ApDtl_Upd02.UP.BLOCK0")){
			return MS_MSBHL5020_ApDtl_Upd02_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5020.ApDtl_Upd02.DOWN.BLOCK0")){
			return MS_MSBHL5020_ApDtl_Upd02_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5020.ApDtl_Upd03.UP.BLOCK0")){
			return MS_MSBHL5020_ApDtl_Upd03_UP_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5020.ApDtl_Upd03.DOWN.BLOCK0")){
			return MS_MSBHL5020_ApDtl_Upd03_DOWN_BLOCK0();
		}
		else if (id.equals("MS.MSBHL5020.ApDtl_Del01.UP.BLOCK0")){
			return MS_MSBHL5020_ApDtl_Del01_UP_BLOCK0();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
						
	
	static final MCOperationInfo MS_MSBHL5020_ApDtl_Chk01_INFO = new MCOperationInfo("MS", "MSBHL5020", "ApDtl_Chk01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL5020_ApDtl_Chk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5020", "ApDtl_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("old_purc_act_d_seq", "old_purc_act_d_seq"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("can_ac_ym", "can_ac_ym"),
				MCItemDef.create("can_pay_basis_dt", "can_pay_basis_dt"),
				MCItemDef.create("ncv_flg", "ncv_flg"),
				MCItemDef.create("accpt_dfct_flg", "accpt_dfct_flg"),
				MCItemDef.create("apd" + ".purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("apd" + ".purc_act_no", "purc_act_no"),
				MCItemDef.create("apd" + ".rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("apd" + ".bsppl_cd", "bsppl_cd"),
				MCItemDef.create("apd" + ".purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("apd" + ".purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("apd" + ".ac_dt", "ac_dt"),
				MCItemDef.create("apd" + ".ac_ym", "ac_ym"),
				MCItemDef.create("apd" + ".pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("apd" + ".pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("apd" + ".pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("apd" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("apd" + ".interim_flg", "interim_flg")
			}
			,
			MCBlockDef.create("ApDtl_Chk01_Dtl")
		);
	}


	public static MCContainerDef MS_MSBHL5020_ApDtl_Chk01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5020", "ApDtl_Chk01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("old_purc_act_d_seq", "old_purc_act_d_seq"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("can_ac_ym", "can_ac_ym"),
				MCItemDef.create("can_pay_basis_dt", "can_pay_basis_dt"),
				MCItemDef.create("ncv_flg", "ncv_flg"),
				MCItemDef.create("accpt_dfct_flg", "accpt_dfct_flg"),
				MCItemDef.create("apd" + ".purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("apd" + ".purc_act_no", "purc_act_no"),
				MCItemDef.create("apd" + ".rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("apd" + ".bsppl_cd", "bsppl_cd"),
				MCItemDef.create("apd" + ".purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("apd" + ".purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("apd" + ".ac_dt", "ac_dt"),
				MCItemDef.create("apd" + ".ac_ym", "ac_ym"),
				MCItemDef.create("apd" + ".pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("apd" + ".pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("apd" + ".pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("apd" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("apd" + ".interim_flg", "interim_flg")
			}
			,
			MCBlockDef.create("ApDtl_Chk01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBHL5020_ApDtl_Chk03_INFO = new MCOperationInfo("MS", "MSBHL5020", "ApDtl_Chk03", "000000", new PDef());

	public static MCContainerDef MS_MSBHL5020_ApDtl_Chk03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5020", "ApDtl_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("apd" + ".bsppl_cd", "bsppl_cd"),
				MCItemDef.create("apd" + ".pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("apd" + ".pay_basis_dt", "pay_basis_dt")
			}
			,
			MCBlockDef.create("ApDtl_Chk03_Dtl")
		);
	}


	public static MCContainerDef MS_MSBHL5020_ApDtl_Chk03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5020", "ApDtl_Chk03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("err_flg", "err_flg")
			}
			,
			MCBlockDef.create("ApDtl_Chk03_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBHL5020_ApDtl_Upd01_INFO = new MCOperationInfo("MS", "MSBHL5020", "ApDtl_Upd01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL5020_ApDtl_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5020", "ApDtl_Upd01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("data_crud_typ", "data_crud_typ"),
				MCItemDef.create("can_purc_act_d_seq", "can_purc_act_d_seq"),
				MCItemDef.create("can_purc_act_seq", "can_purc_act_seq"),
				MCItemDef.create("old_purc_act_d_seq", "old_purc_act_d_seq"),
				MCItemDef.create("can_ap_dpt_cd", "can_ap_dpt_cd"),
				MCItemDef.create("can_ac_dt", "can_ac_dt"),
				MCItemDef.create("can_ac_ym", "can_ac_ym"),
				MCItemDef.create("can_pay_basis_dt", "can_pay_basis_dt"),
				MCItemDef.create("ncv_flg", "ncv_flg"),
				MCItemDef.create("accpt_dfct_flg", "accpt_dfct_flg"),
				MCItemDef.create("apd" + ".po_no", "po_no"),
				MCItemDef.create("apd" + ".po_d_no", "po_d_no"),
				MCItemDef.create("apd" + ".purc_act_d_no", "purc_act_d_no"),
				MCItemDef.create("apd" + ".purc_act_d_seq", "purc_act_d_seq"),
				MCItemDef.create("apd" + ".purc_act_no", "purc_act_no"),
				MCItemDef.create("apd" + ".purc_act_seq", "purc_act_seq"),
				MCItemDef.create("apd" + ".purc_act_rev", "purc_act_rev"),
				MCItemDef.create("apd" + ".bp_dlv_slip_no", "bp_dlv_slip_no"),
				MCItemDef.create("apd" + ".bp_dlv_slip_d_no", "bp_dlv_slip_d_no"),
				MCItemDef.create("apd" + ".rcpt_iv_no", "rcpt_iv_no"),
				MCItemDef.create("apd" + ".rcpt_iv_mng_no", "rcpt_iv_mng_no"),
				MCItemDef.create("apd" + ".ap_typ", "ap_typ"),
				MCItemDef.create("apd" + ".trd_cd", "trd_cd"),
				MCItemDef.create("apd" + ".trd_ptn_typ", "trd_ptn_typ"),
				MCItemDef.create("apd" + ".sppl_cd", "sppl_cd"),
				MCItemDef.create("apd" + ".asppl_cd", "asppl_cd"),
				MCItemDef.create("apd" + ".bsppl_cd", "bsppl_cd"),
				MCItemDef.create("apd" + ".ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("apd" + ".purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("apd" + ".purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("apd" + ".sno1", "sno1"),
				MCItemDef.create("apd" + ".sno2", "sno2"),
				MCItemDef.create("apd" + ".sno3", "sno3"),
				MCItemDef.create("apd" + ".sno4", "sno4"),
				MCItemDef.create("apd" + ".act_dt", "act_dt"),
				MCItemDef.create("apd" + ".ac_dt", "ac_dt"),
				MCItemDef.create("apd" + ".ac_ym", "ac_ym"),
				MCItemDef.create("apd" + ".pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("apd" + ".pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("apd" + ".pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("apd" + ".itm_cd", "itm_cd"),
				MCItemDef.create("apd" + ".itm_sub1", "itm_sub1"),
				MCItemDef.create("apd" + ".itm_sub2", "itm_sub2"),
				MCItemDef.create("apd" + ".itm_sub3", "itm_sub3"),
				MCItemDef.create("apd" + ".itm_nm", "itm_nm"),
				MCItemDef.create("apd" + ".sppl_itm_cd", "sppl_itm_cd"),
				MCItemDef.create("apd" + ".sppl_itm_nm", "sppl_itm_nm"),
				MCItemDef.create("apd" + ".sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("apd" + ".trd_unit_cd", "trd_unit_cd"),
				MCItemDef.create("apd" + ".trd_unit_qty", "trd_unit_qty"),
				MCItemDef.create("apd" + ".base_unit_cd", "base_unit_cd"),
				MCItemDef.create("apd" + ".base_unit_qty", "base_unit_qty"),
				MCItemDef.create("apd" + ".tax_cd", "tax_cd"),
				MCItemDef.create("apd" + ".interim_flg", "interim_flg"),
				MCItemDef.create("apd" + ".xrate", "xrate"),
				MCItemDef.create("apd" + ".trd_cur_cd", "trd_cur_cd"),
				MCItemDef.create("apd" + ".trd_cur_upri", "trd_cur_upri"),
				MCItemDef.create("apd" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("apd" + ".trd_cur_tax_amt", "trd_cur_tax_amt"),
				MCItemDef.create("apd" + ".trd_cur_dscnt_amt", "trd_cur_dscnt_amt"),
				MCItemDef.create("apd" + ".base_cur_upri", "base_cur_upri"),
				MCItemDef.create("apd" + ".base_cur_amt", "base_cur_amt"),
				MCItemDef.create("apd" + ".base_cur_tax_amt", "base_cur_tax_amt"),
				MCItemDef.create("apd" + ".base_cur_dscnt_amt", "base_cur_dscnt_amt"),
				MCItemDef.create("apd" + ".wtax_rate", "wtax_rate"),
				MCItemDef.create("apd" + ".wtax_amt", "wtax_amt"),
				MCItemDef.create("apd" + ".base_purc_ac_dt", "base_purc_ac_dt"),
				MCItemDef.create("apd" + ".trd_cur_proc_upri", "trd_cur_proc_upri"),
				MCItemDef.create("apd" + ".trd_cur_proc_amt", "trd_cur_proc_amt"),
				MCItemDef.create("apd" + ".trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri"),
				MCItemDef.create("apd" + ".trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt"),
				MCItemDef.create("apd" + ".base_cur_proc_upri", "base_cur_proc_upri"),
				MCItemDef.create("apd" + ".base_cur_proc_amt", "base_cur_proc_amt"),
				MCItemDef.create("apd" + ".base_cur_onr_prov_upri", "base_cur_onr_prov_upri"),
				MCItemDef.create("apd" + ".base_cur_onr_prov_amt", "base_cur_onr_prov_amt"),
				MCItemDef.create("apd" + ".repurc_obli_flg", "repurc_obli_flg"),
				MCItemDef.create("apd" + ".outsrc_flg", "outsrc_flg")
			}
			,
			MCBlockDef.create("ApDtl_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBHL5020_ApDtl_Upd02_INFO = new MCOperationInfo("MS", "MSBHL5020", "ApDtl_Upd02", "000000", new PDef());

	public static MCContainerDef MS_MSBHL5020_ApDtl_Upd02_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5020", "ApDtl_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("crryovr_src_ap_d_no", "crryovr_src_ap_d_no"),
				MCItemDef.create("pay_mtd_typ", "pay_mtd_typ"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("co_bsppl_cl_day", "co_bsppl_cl_day"),
				MCItemDef.create("co_bsppl_cl_dt", "co_bsppl_cl_dt"),
				MCItemDef.create("co_bsppl_dpt_cd", "co_bsppl_dpt_cd"),
				MCItemDef.create("pay_amt", "pay_amt"),
				MCItemDef.create("pay_tax_amt", "pay_tax_amt"),
				MCItemDef.create("pay_wtax_amt", "pay_wtax_amt"),
				MCItemDef.create("pay_chk_no", "pay_chk_no"),
				MCItemDef.create("pay_chk_mng_no", "pay_chk_mng_no"),
				MCItemDef.create("pay_proc_amt", "pay_proc_amt"),
				MCItemDef.create("pay_onr_prov_amt", "pay_onr_prov_amt")
			}
			,
			MCBlockDef.create("ApDtl_Upd02_Dtl")
		);
	}


	public static MCContainerDef MS_MSBHL5020_ApDtl_Upd02_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5020", "ApDtl_Upd02",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("pay_ap_d_no", "pay_ap_d_no")
			}
			,
			MCBlockDef.create("ApDtl_Upd02_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBHL5020_ApDtl_Upd03_INFO = new MCOperationInfo("MS", "MSBHL5020", "ApDtl_Upd03", "000000", new PDef());

	public static MCContainerDef MS_MSBHL5020_ApDtl_Upd03_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5020", "ApDtl_Upd03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ap_appl_schd_no", "ap_appl_schd_no"),
				MCItemDef.create("apd" + ".ap_d_no", "ap_d_no"),
				MCItemDef.create("apd" + ".asppl_cd", "asppl_cd"),
				MCItemDef.create("apd" + ".bsppl_cd", "bsppl_cd"),
				MCItemDef.create("apd" + ".bsppl_dpt_cd", "bsppl_dpt_cd"),
				MCItemDef.create("apd" + ".ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("apd" + ".wrk_no", "wrk_no"),
				MCItemDef.create("apd" + ".act_dt", "act_dt"),
				MCItemDef.create("apd" + ".ac_dt", "ac_dt"),
				MCItemDef.create("apd" + ".pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("apd" + ".pay_basis_dt", "pay_basis_dt"),
				MCItemDef.create("apd" + ".pay_schd_dt", "pay_schd_dt"),
				MCItemDef.create("apd" + ".xrate", "xrate"),
				MCItemDef.create("apd" + ".trd_cur_amt", "trd_cur_amt"),
				MCItemDef.create("apd" + ".base_cur_amt", "base_cur_amt")
			}
			,
			MCBlockDef.create("ApDtl_Upd03_Dtl")
		);
	}


	public static MCContainerDef MS_MSBHL5020_ApDtl_Upd03_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5020", "ApDtl_Upd03",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ap_appl_schd_no", "ap_appl_schd_no"),
				MCItemDef.create("to_ap_d_no", "to_ap_d_no"),
				MCItemDef.create("apd" + ".ap_d_no", "ap_d_no")
			}
			,
			MCBlockDef.create("ApDtl_Upd03_Dtl")
		);
	}
	
	static final MCOperationInfo MS_MSBHL5020_ApDtl_Del01_INFO = new MCOperationInfo("MS", "MSBHL5020", "ApDtl_Del01", "000000", new PDef());

	public static MCContainerDef MS_MSBHL5020_ApDtl_Del01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MS", "MSBHL5020", "ApDtl_Del01",
			new MCItemDef[]{
				MCItemDef.create("peg_no", "peg_no"),
				MCItemDef.create("ap_d_no", "ap_d_no")
			}
			,
			MCBlockDef.create("ApDtl_Del01_Dtl")
		);
	}


	//FMCB DEF_CLASSES END
}

