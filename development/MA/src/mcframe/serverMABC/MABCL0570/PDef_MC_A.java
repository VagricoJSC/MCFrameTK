package mcframe.serverMABC.MABCL0570;

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
 * [MABCL_SpplReg]の入出力情報となる電文（上り・下り電文）と
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
		else if (id.equals("MA.MABCL0570.Bp_UpdChk01.UP.BLOCK0")){
			return MA_MABCL0570_Bp_UpdChk01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0570.Bp_Upd01.UP.BLOCK0")){
			return MA_MABCL0570_Bp_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0570.Srch01.UP.BLOCK0")){
			return MA_MABCL0570_Srch01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0570.Srch01.DOWN.BLOCK0")){
			return MA_MABCL0570_Srch01_DOWN_BLOCK0();
		}
		else if (id.equals("MA.MABCL0570.Srch01.DOWN.BLOCK1")){
			return MA_MABCL0570_Srch01_DOWN_BLOCK1();
		}
		else if (id.equals("MA.MABCL0570.Srch01.DOWN.BLOCK2")){
			return MA_MABCL0570_Srch01_DOWN_BLOCK2();
		}
		else if (id.equals("MA.MABCL0570.Srch01.DOWN.BLOCK3")){
			return MA_MABCL0570_Srch01_DOWN_BLOCK3();
		}
		else if (id.equals("MA.MABCL0570.Srch01.DOWN.BLOCK4")){
			return MA_MABCL0570_Srch01_DOWN_BLOCK4();
		}
		else if (id.equals("MA.MABCL0570.Srch01.DOWN.BLOCK5")){
			return MA_MABCL0570_Srch01_DOWN_BLOCK5();
		}
		else if (id.equals("MA.MABCL0570.Srch01.DOWN.BLOCK6")){
			return MA_MABCL0570_Srch01_DOWN_BLOCK6();
		}
		else if (id.equals("MA.MABCL0570.Upd01.UP.BLOCK0")){
			return MA_MABCL0570_Upd01_UP_BLOCK0();
		}
		else if (id.equals("MA.MABCL0570.Upd01.UP.BLOCK1")){
			return MA_MABCL0570_Upd01_UP_BLOCK1();
		}
		else if (id.equals("MA.MABCL0570.Upd01.UP.BLOCK2")){
			return MA_MABCL0570_Upd01_UP_BLOCK2();
		}
		else if (id.equals("MA.MABCL0570.Upd01.UP.BLOCK3")){
			return MA_MABCL0570_Upd01_UP_BLOCK3();
		}
		else if (id.equals("MA.MABCL0570.Upd01.UP.BLOCK4")){
			return MA_MABCL0570_Upd01_UP_BLOCK4();
		}
		else if (id.equals("MA.MABCL0570.Upd01.UP.BLOCK5")){
			return MA_MABCL0570_Upd01_UP_BLOCK5();
		}
		else if (id.equals("MA.MABCL0570.Upd01.UP.BLOCK6")){
			return MA_MABCL0570_Upd01_UP_BLOCK6();
		}
//FMCB GET_DEF END
		else {
			return null;
		}
	}
	//FMCB DEF_CLASSES START
				
	
	static final MCOperationInfo MA_MABCL0570_Bp_UpdChk01_INFO = new MCOperationInfo("MA", "MABCL0570", "Bp_UpdChk01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0570_Bp_UpdChk01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0570", "Bp_UpdChk01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("sppl_cntct_dpt", "sppl_cntct_dpt"),
				MCItemDef.create("sppl_cntct_psn", "sppl_cntct_psn"),
				MCItemDef.create("sppl_cntct_psn_title", "sppl_cntct_psn_title"),
				MCItemDef.create("subcon_flg", "subcon_flg"),
				MCItemDef.create("onr_prsppl_flg", "onr_prsppl_flg"),
				MCItemDef.create("repurc_obli_flg", "repurc_obli_flg"),
				MCItemDef.create("vmi_purc_dpt_cd", "vmi_purc_dpt_cd"),
				MCItemDef.create("check_vmi_purc_dpt_cd", "check_vmi_purc_dpt_cd"),
				MCItemDef.create("purc_upri_req_typ", "purc_upri_req_typ"),
				MCItemDef.create("purc_upri_cng_flg", "purc_upri_cng_flg"),
				MCItemDef.create("prms_recv_flg", "prms_recv_flg"),
				MCItemDef.create("purc_amt_rnd_typ", "purc_amt_rnd_typ"),
				MCItemDef.create("purc_tax_calc_typ", "purc_tax_calc_typ"),
				MCItemDef.create("purc_tax_rnd_typ", "purc_tax_rnd_typ"),
				MCItemDef.create("purc_tax_cd", "purc_tax_cd"),
				MCItemDef.create("purc_tax_cd_prio_flg", "purc_tax_cd_prio_flg"),
				MCItemDef.create("sppl_cal_cd", "sppl_cal_cd"),
				MCItemDef.create("po_print_cd", "po_print_cd"),
				MCItemDef.create("sppl_ship_form_cd", "sppl_ship_form_cd"),
				MCItemDef.create("po_dlv_slip_flg", "po_dlv_slip_flg"),
				MCItemDef.create("dlv_inst_dlv_slip_flg", "dlv_inst_dlv_slip_flg"),
				MCItemDef.create("prms_rcpt_dlv_slip_flg", "prms_rcpt_dlv_slip_flg"),
				MCItemDef.create("prov_rcv_typ", "prov_rcv_typ"),
				MCItemDef.create("purc_slip_each_lot_typ", "purc_slip_each_lot_typ"),
				MCItemDef.create("sppl_tterm_cd1", "sppl_tterm_cd1"),
				MCItemDef.create("sppl_tterm_cd2", "sppl_tterm_cd2"),
				MCItemDef.create("sppl_tterm_cd3", "sppl_tterm_cd3"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("wrk_po_flg", "wrk_po_flg"),
				MCItemDef.create("wrk_ap_flg", "wrk_ap_flg"),
				MCItemDef.create("sppl_iv_flg", "sppl_iv_flg"),
				MCItemDef.create("rcpt_iv_dup_flg", "rcpt_iv_dup_flg"),
				MCItemDef.create("outsrc_upri_typ", "outsrc_upri_typ"),
				MCItemDef.create("purc_basis_typ", "purc_basis_typ"),
				MCItemDef.create("prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("prov_upri_cng_flg", "prov_upri_cng_flg"),
				MCItemDef.create("prov_tax_cd", "prov_tax_cd"),
				MCItemDef.create("prov_tax_cd_prio_flg", "prov_tax_cd_prio_flg"),
				MCItemDef.create("prov_amt_rnd_typ", "prov_amt_rnd_typ"),
				MCItemDef.create("prov_tax_calc_typ", "prov_tax_calc_typ"),
				MCItemDef.create("prov_tax_rnd_typ", "prov_tax_rnd_typ"),
				MCItemDef.create("bsppl_flg", "bsppl_flg"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("check_ap_dpt_cd", "check_ap_dpt_cd"),
				MCItemDef.create("sppl_prnt_typ", "sppl_prnt_typ"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Bp_UpdChk01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0570_Bp_Upd01_INFO = new MCOperationInfo("MA", "MABCL0570", "Bp_Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0570_Bp_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0570", "Bp_Upd01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("vmi_purc_dpt_cd", "vmi_purc_dpt_cd"),
				MCItemDef.create("sppl_cntct_dpt", "sppl_cntct_dpt"),
				MCItemDef.create("sppl_cntct_psn", "sppl_cntct_psn"),
				MCItemDef.create("sppl_cntct_psn_title", "sppl_cntct_psn_title"),
				MCItemDef.create("subcon_flg", "subcon_flg"),
				MCItemDef.create("purc_upri_req_typ", "purc_upri_req_typ"),
				MCItemDef.create("purc_upri_cng_flg", "purc_upri_cng_flg"),
				MCItemDef.create("purc_amt_rnd_typ", "purc_amt_rnd_typ"),
				MCItemDef.create("purc_tax_calc_typ", "purc_tax_calc_typ"),
				MCItemDef.create("purc_tax_rnd_typ", "purc_tax_rnd_typ"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("sppl_cal_cd", "sppl_cal_cd"),
				MCItemDef.create("po_print_cd", "po_print_cd"),
				MCItemDef.create("sppl_ship_form_cd", "sppl_ship_form_cd"),
				MCItemDef.create("po_dlv_slip_flg", "po_dlv_slip_flg"),
				MCItemDef.create("dlv_inst_dlv_slip_flg", "dlv_inst_dlv_slip_flg"),
				MCItemDef.create("prms_rcpt_dlv_slip_flg", "prms_rcpt_dlv_slip_flg"),
				MCItemDef.create("prms_recv_flg", "prms_recv_flg"),
				MCItemDef.create("purc_tax_cd", "purc_tax_cd"),
				MCItemDef.create("purc_tax_cd_prio_flg", "purc_tax_cd_prio_flg"),
				MCItemDef.create("sppl_iv_flg", "sppl_iv_flg"),
				MCItemDef.create("rcpt_iv_dup_flg", "rcpt_iv_dup_flg"),
				MCItemDef.create("sppl_tterm_cd1", "sppl_tterm_cd1"),
				MCItemDef.create("sppl_tterm_cd2", "sppl_tterm_cd2"),
				MCItemDef.create("sppl_tterm_cd3", "sppl_tterm_cd3"),
				MCItemDef.create("wrk_po_flg", "wrk_po_flg"),
				MCItemDef.create("wrk_ap_flg", "wrk_ap_flg"),
				MCItemDef.create("purc_slip_each_lot_typ", "purc_slip_each_lot_typ"),
				MCItemDef.create("prov_rcv_typ", "prov_rcv_typ"),
				MCItemDef.create("onr_prsppl_flg", "onr_prsppl_flg"),
				MCItemDef.create("repurc_obli_flg", "repurc_obli_flg"),
				MCItemDef.create("outsrc_upri_typ", "outsrc_upri_typ"),
				MCItemDef.create("purc_basis_typ", "purc_basis_typ"),
				MCItemDef.create("prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("prov_upri_cng_flg", "prov_upri_cng_flg"),
				MCItemDef.create("prov_tax_cd", "prov_tax_cd"),
				MCItemDef.create("prov_tax_cd_prio_flg", "prov_tax_cd_prio_flg"),
				MCItemDef.create("prov_amt_rnd_typ", "prov_amt_rnd_typ"),
				MCItemDef.create("prov_tax_calc_typ", "prov_tax_calc_typ"),
				MCItemDef.create("prov_tax_rnd_typ", "prov_tax_rnd_typ"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("sppl_prnt_typ", "sppl_prnt_typ"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Bp_Upd01_Dtl")
		);
	}
	
	static final MCOperationInfo MA_MABCL0570_Srch01_INFO = new MCOperationInfo("MA", "MABCL0570", "Srch01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0570_Srch01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0570", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("st_dt_fr", "st_dt_fr"),
				MCItemDef.create("st_dt_to", "st_dt_to"),
				MCItemDef.create("end_dt_fr", "end_dt_fr"),
				MCItemDef.create("end_dt_to", "end_dt_to"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("bp_nm", "bp_nm"),
				MCItemDef.create("off_del_flg", "off_del_flg"),
				MCItemDef.create("on_del_flg", "on_del_flg")
			}
			,
			MCBlockDef.create("Srch01_Cnd")
		);
	}


	public static MCContainerDef MA_MABCL0570_Srch01_DOWN_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0570", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("asppl_flg", "asppl_flg"),
				MCItemDef.create("cntry_cd", "cntry_cd"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("asppl_nm", "asppl_nm"),
				MCItemDef.create("vmi_purc_dpt_cd", "vmi_purc_dpt_cd"),
				MCItemDef.create("vmi_purc_dpt_nm", "vmi_purc_dpt_nm"),
				MCItemDef.create("sppl_cntct_dpt", "sppl_cntct_dpt"),
				MCItemDef.create("sppl_cntct_psn", "sppl_cntct_psn"),
				MCItemDef.create("sppl_cntct_psn_title", "sppl_cntct_psn_title"),
				MCItemDef.create("subcon_flg", "subcon_flg"),
				MCItemDef.create("purc_upri_req_typ", "purc_upri_req_typ"),
				MCItemDef.create("purc_upri_req_typ_nm", "purc_upri_req_typ_nm"),
				MCItemDef.create("purc_upri_cng_flg", "purc_upri_cng_flg"),
				MCItemDef.create("purc_amt_rnd_typ", "purc_amt_rnd_typ"),
				MCItemDef.create("purc_amt_rnd_typ_nm", "purc_amt_rnd_typ_nm"),
				MCItemDef.create("purc_tax_calc_typ", "purc_tax_calc_typ"),
				MCItemDef.create("purc_tax_calc_typ_nm", "purc_tax_calc_typ_nm"),
				MCItemDef.create("purc_tax_rnd_typ", "purc_tax_rnd_typ"),
				MCItemDef.create("purc_tax_rnd_typ_nm", "purc_tax_rnd_typ_nm"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("sppl_cal_cd", "sppl_cal_cd"),
				MCItemDef.create("sppl_cal_nm", "sppl_cal_nm"),
				MCItemDef.create("po_print_cd", "po_print_cd"),
				MCItemDef.create("po_print_nm", "po_print_nm"),
				MCItemDef.create("sppl_ship_form_cd", "sppl_ship_form_cd"),
				MCItemDef.create("po_dlv_slip_flg", "po_dlv_slip_flg"),
				MCItemDef.create("dlv_inst_dlv_slip_flg", "dlv_inst_dlv_slip_flg"),
				MCItemDef.create("prms_rcpt_dlv_slip_flg", "prms_rcpt_dlv_slip_flg"),
				MCItemDef.create("sppl_ship_form_nm", "sppl_ship_form_nm"),
				MCItemDef.create("prms_recv_flg", "prms_recv_flg"),
				MCItemDef.create("purc_tax_cd", "purc_tax_cd"),
				MCItemDef.create("purc_tax_nm", "purc_tax_nm"),
				MCItemDef.create("purc_tax_cd_prio_flg", "purc_tax_cd_prio_flg"),
				MCItemDef.create("sppl_iv_flg", "sppl_iv_flg"),
				MCItemDef.create("rcpt_iv_dup_flg", "rcpt_iv_dup_flg"),
				MCItemDef.create("sppl_tterm_cd1", "sppl_tterm_cd1"),
				MCItemDef.create("sppl_tterm_nm1", "sppl_tterm_nm1"),
				MCItemDef.create("sppl_tterm_cd2", "sppl_tterm_cd2"),
				MCItemDef.create("sppl_tterm_nm2", "sppl_tterm_nm2"),
				MCItemDef.create("sppl_tterm_cd3", "sppl_tterm_cd3"),
				MCItemDef.create("sppl_tterm_nm3", "sppl_tterm_nm3"),
				MCItemDef.create("wrk_po_flg", "wrk_po_flg"),
				MCItemDef.create("wrk_ap_flg", "wrk_ap_flg"),
				MCItemDef.create("purc_slip_each_lot_typ", "purc_slip_each_lot_typ"),
				MCItemDef.create("purc_slip_each_lot_typ_nm", "purc_slip_each_lot_typ_nm"),
				MCItemDef.create("prov_rcv_typ", "prov_rcv_typ"),
				MCItemDef.create("prov_rcv_typ_nm", "prov_rcv_typ_nm"),
				MCItemDef.create("onr_prsppl_flg", "onr_prsppl_flg"),
				MCItemDef.create("repurc_obli_flg", "repurc_obli_flg"),
				MCItemDef.create("outsrc_upri_typ", "outsrc_upri_typ"),
				MCItemDef.create("outsrc_upri_typ_nm", "outsrc_upri_typ_nm"),
				MCItemDef.create("purc_basis_typ", "purc_basis_typ"),
				MCItemDef.create("purc_basis_typ_nm", "purc_basis_typ_nm"),
				MCItemDef.create("prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("prov_basis_typ_nm", "prov_basis_typ_nm"),
				MCItemDef.create("prov_upri_cng_flg", "prov_upri_cng_flg"),
				MCItemDef.create("prov_tax_cd", "prov_tax_cd"),
				MCItemDef.create("prov_tax_nm", "prov_tax_nm"),
				MCItemDef.create("prov_tax_cd_prio_flg", "prov_tax_cd_prio_flg"),
				MCItemDef.create("prov_amt_rnd_typ", "prov_amt_rnd_typ"),
				MCItemDef.create("prov_amt_rnd_typ_nm", "prov_amt_rnd_typ_nm"),
				MCItemDef.create("prov_tax_calc_typ", "prov_tax_calc_typ"),
				MCItemDef.create("prov_tax_calc_typ_nm", "prov_tax_calc_typ_nm"),
				MCItemDef.create("prov_tax_rnd_typ", "prov_tax_rnd_typ"),
				MCItemDef.create("prov_tax_rnd_typ_nm", "prov_tax_rnd_typ_nm"),
				MCItemDef.create("bsppl_flg", "bsppl_flg"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("bsppl_nm", "bsppl_nm"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("ap_dpt_nm", "ap_dpt_nm"),
				MCItemDef.create("sppl_prnt_typ", "sppl_prnt_typ"),
				MCItemDef.create("sppl_prnt_typ_nm", "sppl_prnt_typ_nm"),
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
	public static MCContainerDef MA_MABCL0570_Srch01_DOWN_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MABCL0570", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("wg_nm", "wg_nm"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("stk_mng_typ", "stk_mng_typ"),
				MCItemDef.create("sno1_mng_typ", "sno1_mng_typ"),
				MCItemDef.create("sno2_mng_typ", "sno2_mng_typ"),
				MCItemDef.create("sno3_mng_typ", "sno3_mng_typ"),
				MCItemDef.create("sno4_mng_typ", "sno4_mng_typ"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("purc_id_typ", "purc_id_typ"),
				MCItemDef.create("purc_id_typ_nm", "purc_id_typ_nm"),
				MCItemDef.create("purc_lt", "purc_lt"),
				MCItemDef.create("purc_lt_add_qty", "purc_lt_add_qty"),
				MCItemDef.create("accpt_insp_lt", "accpt_insp_lt"),
				MCItemDef.create("purc_basis_typ", "purc_basis_typ"),
				MCItemDef.create("purc_basis_typ_nm", "purc_basis_typ_nm"),
				MCItemDef.create("buf_lt", "buf_lt"),
				MCItemDef.create("ord_fix_pd", "ord_fix_pd"),
				MCItemDef.create("sz_day_week_typ", "sz_day_week_typ"),
				MCItemDef.create("sz_day_week_typ_nm", "sz_day_week_typ_nm"),
				MCItemDef.create("sz_week", "sz_week"),
				MCItemDef.create("lot_sz_pd", "lot_sz_pd"),
				MCItemDef.create("min_lot_qty", "min_lot_qty"),
				MCItemDef.create("batch_lot_qty", "batch_lot_qty"),
				MCItemDef.create("max_lot_qty", "max_lot_qty"),
				MCItemDef.create("max_order", "max_order"),
				MCItemDef.create("prio", "prio"),
				MCItemDef.create("order_ratio", "order_ratio"),
				MCItemDef.create("pre_po_tgt_flg", "pre_po_tgt_flg"),
				MCItemDef.create("rqst_wg_cd", "rqst_wg_cd"),
				MCItemDef.create("rqst_wg_nm", "rqst_wg_nm"),
				MCItemDef.create("po_batch_flg", "po_batch_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("not_mrp_flg", "not_mrp_flg"),
				MCItemDef.create("cost_ratio", "cost_ratio"),
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
	public static MCContainerDef MA_MABCL0570_Srch01_DOWN_BLOCK2() {

		return new MCGeneralContainerDef("MA", "MABCL0570", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
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
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("maker_nm", "maker_nm"),
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
			MCBlockDef.create("Srch01_Rslt3")
		);
	}
	public static MCContainerDef MA_MABCL0570_Srch01_DOWN_BLOCK3() {

		return new MCGeneralContainerDef("MA", "MABCL0570", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("unit_cd", "unit_cd"),
				MCItemDef.create("dec_place", "dec_place"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("lg_grp_nm", "lg_grp_nm"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("purc_lt", "purc_lt"),
				MCItemDef.create("purc_lt_add_qty", "purc_lt_add_qty"),
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
			MCBlockDef.create("Srch01_Rslt4")
		);
	}
	public static MCContainerDef MA_MABCL0570_Srch01_DOWN_BLOCK4() {

		return new MCGeneralContainerDef("MA", "MABCL0570", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("if_proc_typ_nm", "if_proc_typ_nm"),
				MCItemDef.create("not_onr_prov_flg", "not_onr_prov_flg"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("ext_sys_nm", "ext_sys_nm"),
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
			MCBlockDef.create("Srch01_Rslt5")
		);
	}
	public static MCContainerDef MA_MABCL0570_Srch01_DOWN_BLOCK5() {

		return new MCGeneralContainerDef("MA", "MABCL0570", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("itm_nm", "itm_nm"),
				MCItemDef.create("itm_typ", "itm_typ"),
				MCItemDef.create("itm_typ_nm", "itm_typ_nm"),
				MCItemDef.create("itm_typ_d_cd", "itm_typ_d_cd"),
				MCItemDef.create("itm_typ_d_nm", "itm_typ_d_nm"),
				MCItemDef.create("sundry_itm_flg", "sundry_itm_flg"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("bp_itm_cd", "bp_itm_cd"),
				MCItemDef.create("bp_itm_nm", "bp_itm_nm"),
				MCItemDef.create("def_flg", "def_flg"),
				MCItemDef.create("pf_grp_cd", "pf_grp_cd"),
				MCItemDef.create("pf_grp_nm", "pf_grp_nm"),
				MCItemDef.create("pf_fix_flg", "pf_fix_flg"),
				MCItemDef.create("purc_commit_flg", "purc_commit_flg"),
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
			MCBlockDef.create("Srch01_Rslt6")
		);
	}
	public static MCContainerDef MA_MABCL0570_Srch01_DOWN_BLOCK6() {

		return new MCGeneralContainerDef("MA", "MABCL0570", "Srch01",
			new MCItemDef[]{
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("purc_usr_nm", "purc_usr_nm"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("purc_dpt_nm", "purc_dpt_nm"),
				MCItemDef.create("outsrc_usr_cd", "outsrc_usr_cd"),
				MCItemDef.create("outsrc_usr_nm", "outsrc_usr_nm"),
				MCItemDef.create("outsrc_dpt_cd", "outsrc_dpt_cd"),
				MCItemDef.create("outsrc_dpt_nm", "outsrc_dpt_nm"),
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
			MCBlockDef.create("Srch01_Rslt7")
		);
	}
	
	static final MCOperationInfo MA_MABCL0570_Upd01_INFO = new MCOperationInfo("MA", "MABCL0570", "Upd01", "000000", new PDef());

	public static MCContainerDef MA_MABCL0570_Upd01_UP_BLOCK0() {

		return new MCGeneralContainerDef("MA", "MABCL0570", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("asppl_cd", "asppl_cd"),
				MCItemDef.create("vmi_purc_dpt_cd", "vmi_purc_dpt_cd"),
				MCItemDef.create("check_vmi_purc_dpt_cd", "check_vmi_purc_dpt_cd"),
				MCItemDef.create("sppl_cntct_dpt", "sppl_cntct_dpt"),
				MCItemDef.create("sppl_cntct_psn", "sppl_cntct_psn"),
				MCItemDef.create("sppl_cntct_psn_title", "sppl_cntct_psn_title"),
				MCItemDef.create("subcon_flg", "subcon_flg"),
				MCItemDef.create("purc_upri_req_typ", "purc_upri_req_typ"),
				MCItemDef.create("purc_upri_cng_flg", "purc_upri_cng_flg"),
				MCItemDef.create("purc_amt_rnd_typ", "purc_amt_rnd_typ"),
				MCItemDef.create("purc_tax_calc_typ", "purc_tax_calc_typ"),
				MCItemDef.create("purc_tax_rnd_typ", "purc_tax_rnd_typ"),
				MCItemDef.create("pay_crryovr_times", "pay_crryovr_times"),
				MCItemDef.create("sppl_cal_cd", "sppl_cal_cd"),
				MCItemDef.create("po_print_cd", "po_print_cd"),
				MCItemDef.create("sppl_ship_form_cd", "sppl_ship_form_cd"),
				MCItemDef.create("po_dlv_slip_flg", "po_dlv_slip_flg"),
				MCItemDef.create("dlv_inst_dlv_slip_flg", "dlv_inst_dlv_slip_flg"),
				MCItemDef.create("prms_rcpt_dlv_slip_flg", "prms_rcpt_dlv_slip_flg"),
				MCItemDef.create("prms_recv_flg", "prms_recv_flg"),
				MCItemDef.create("purc_tax_cd", "purc_tax_cd"),
				MCItemDef.create("purc_tax_cd_prio_flg", "purc_tax_cd_prio_flg"),
				MCItemDef.create("sppl_iv_flg", "sppl_iv_flg"),
				MCItemDef.create("rcpt_iv_dup_flg", "rcpt_iv_dup_flg"),
				MCItemDef.create("sppl_tterm_cd1", "sppl_tterm_cd1"),
				MCItemDef.create("sppl_tterm_cd2", "sppl_tterm_cd2"),
				MCItemDef.create("sppl_tterm_cd3", "sppl_tterm_cd3"),
				MCItemDef.create("wrk_po_flg", "wrk_po_flg"),
				MCItemDef.create("wrk_ap_flg", "wrk_ap_flg"),
				MCItemDef.create("purc_slip_each_lot_typ", "purc_slip_each_lot_typ"),
				MCItemDef.create("prov_rcv_typ", "prov_rcv_typ"),
				MCItemDef.create("onr_prsppl_flg", "onr_prsppl_flg"),
				MCItemDef.create("repurc_obli_flg", "repurc_obli_flg"),
				MCItemDef.create("outsrc_upri_typ", "outsrc_upri_typ"),
				MCItemDef.create("purc_basis_typ", "purc_basis_typ"),
				MCItemDef.create("prov_basis_typ", "prov_basis_typ"),
				MCItemDef.create("prov_upri_cng_flg", "prov_upri_cng_flg"),
				MCItemDef.create("prov_tax_cd", "prov_tax_cd"),
				MCItemDef.create("prov_tax_cd_prio_flg", "prov_tax_cd_prio_flg"),
				MCItemDef.create("prov_amt_rnd_typ", "prov_amt_rnd_typ"),
				MCItemDef.create("prov_tax_calc_typ", "prov_tax_calc_typ"),
				MCItemDef.create("prov_tax_rnd_typ", "prov_tax_rnd_typ"),
				MCItemDef.create("bsppl_flg", "bsppl_flg"),
				MCItemDef.create("bsppl_cd", "bsppl_cd"),
				MCItemDef.create("ap_dpt_cd", "ap_dpt_cd"),
				MCItemDef.create("check_ap_dpt_cd", "check_ap_dpt_cd"),
				MCItemDef.create("sppl_prnt_typ", "sppl_prnt_typ"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl1")
		);
	}

	public static MCContainerDef MA_MABCL0570_Upd01_UP_BLOCK1() {

		return new MCGeneralContainerDef("MA", "MABCL0570", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("wg_cd", "wg_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("maker_cd", "maker_cd"),
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("purc_id_typ", "purc_id_typ"),
				MCItemDef.create("purc_lt", "purc_lt"),
				MCItemDef.create("purc_lt_add_qty", "purc_lt_add_qty"),
				MCItemDef.create("purc_basis_typ", "purc_basis_typ"),
				MCItemDef.create("accpt_insp_lt", "accpt_insp_lt"),
				MCItemDef.create("buf_lt", "buf_lt"),
				MCItemDef.create("ord_fix_pd", "ord_fix_pd"),
				MCItemDef.create("sz_day_week_typ", "sz_day_week_typ"),
				MCItemDef.create("sz_week", "sz_week"),
				MCItemDef.create("lot_sz_pd", "lot_sz_pd"),
				MCItemDef.create("min_lot_qty", "min_lot_qty"),
				MCItemDef.create("batch_lot_qty", "batch_lot_qty"),
				MCItemDef.create("max_lot_qty", "max_lot_qty"),
				MCItemDef.create("max_order", "max_order"),
				MCItemDef.create("prio", "prio"),
				MCItemDef.create("order_ratio", "order_ratio"),
				MCItemDef.create("pre_po_tgt_flg", "pre_po_tgt_flg"),
				MCItemDef.create("rqst_wg_cd", "rqst_wg_cd"),
				MCItemDef.create("po_batch_flg", "po_batch_flg"),
				MCItemDef.create("sno1", "sno1"),
				MCItemDef.create("sno2", "sno2"),
				MCItemDef.create("sno3", "sno3"),
				MCItemDef.create("sno4", "sno4"),
				MCItemDef.create("not_mrp_flg", "not_mrp_flg"),
				MCItemDef.create("cost_ratio", "cost_ratio"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl2")
		);
	}

	public static MCContainerDef MA_MABCL0570_Upd01_UP_BLOCK2() {

		return new MCGeneralContainerDef("MA", "MABCL0570", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("maker_cd", "maker_cd"),
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
			MCBlockDef.create("Upd01_Dtl3")
		);
	}

	public static MCContainerDef MA_MABCL0570_Upd01_UP_BLOCK3() {

		return new MCGeneralContainerDef("MA", "MABCL0570", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("lg_grp_cd", "lg_grp_cd"),
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("purc_lt", "purc_lt"),
				MCItemDef.create("purc_lt_add_qty", "purc_lt_add_qty"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl4")
		);
	}

	public static MCContainerDef MA_MABCL0570_Upd01_UP_BLOCK4() {

		return new MCGeneralContainerDef("MA", "MABCL0570", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("if_proc_typ", "if_proc_typ"),
				MCItemDef.create("not_onr_prov_flg", "not_onr_prov_flg"),
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("ext_sys_cd", "ext_sys_cd"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl5")
		);
	}

	public static MCContainerDef MA_MABCL0570_Upd01_UP_BLOCK5() {

		return new MCGeneralContainerDef("MA", "MABCL0570", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("bp_cd", "bp_cd"),
				MCItemDef.create("itm_cd", "itm_cd"),
				MCItemDef.create("itm_sub1", "itm_sub1"),
				MCItemDef.create("itm_sub2", "itm_sub2"),
				MCItemDef.create("itm_sub3", "itm_sub3"),
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("bp_itm_cd", "bp_itm_cd"),
				MCItemDef.create("bp_itm_nm", "bp_itm_nm"),
				MCItemDef.create("def_flg", "def_flg"),
				MCItemDef.create("pf_grp_cd", "pf_grp_cd"),
				MCItemDef.create("pf_fix_flg", "pf_fix_flg"),
				MCItemDef.create("purc_commit_flg", "purc_commit_flg"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl6")
		);
	}

	public static MCContainerDef MA_MABCL0570_Upd01_UP_BLOCK6() {

		return new MCGeneralContainerDef("MA", "MABCL0570", "Upd01",
			new MCItemDef[]{
				MCItemDef.create("sppl_cd", "sppl_cd"),
				MCItemDef.create("st_dt_key", "st_dt_key"),
				MCItemDef.create("st_dt", "st_dt"),
				MCItemDef.create("end_dt", "end_dt"),
				MCItemDef.create("purc_usr_cd", "purc_usr_cd"),
				MCItemDef.create("purc_dpt_cd", "purc_dpt_cd"),
				MCItemDef.create("outsrc_usr_cd", "outsrc_usr_cd"),
				MCItemDef.create("outsrc_dpt_cd", "outsrc_dpt_cd"),
				MCItemDef.create("memo1", "memo1"),
				MCItemDef.create("memo2", "memo2"),
				MCItemDef.create("memo3", "memo3"),
				MCItemDef.create("del_flg", "del_flg"),
				MCItemDef.create("upd_cntr", "upd_cntr")
			}
			,
			MCBlockDef.create("Upd01_Dtl7")
		);
	}


	//FMCB DEF_CLASSES END
}

