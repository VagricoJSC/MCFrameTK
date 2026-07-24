package mcframe.clientMSBH.MSBHP0040;

import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCTimestamp;

public interface IfPayRqstBaseRow_MC {
	
	public MCTimestamp getRefTime();
	
	public String bsppl_cd();
	
	public String bsppl_nm();
	
	public String bsppl_dpt_cd();
	
	public String bsppl_dpt_nm();
	
	public String itm_cd();
	
	public String itm_sub2();
	
	public String itm_sub3();
	
	public String itm_sub1();
	
	public String itm_nm();
	
	public boolean sundry_itm_flg();
	
	public String pay_mtd_typ();
	
	public String pay_mtd_typ_nm();
	
	public MCNumber trd_cur_amt();
	
	public MCNumber trd_cur_tax_amt();
	
	public MCNumber trd_cur_dscnt_amt();
	
	public MCNumber trd_cur_inc_tax_amt();
	
	public boolean inc_tax_flg();
	
	public MCNumber trd_cur_upri();
	
	public String trd_cur_cd();
	
	public String trd_cur_nm();
	
	public MCNumber trd_cur_amt_dec_place();
	
	public MCNumber trd_cur_upri_dec_place();
	
	public String tax_cd();
	
	public String tax_nm();
	
	public MCNumber tax_rate();
	
	public boolean interim_flg();
	
	public MCNumber xrate();
	
	public MCNumber base_cur_amt();
	
	public MCNumber base_cur_tax_amt();
	
	public MCNumber base_cur_dscnt_amt();
	
	public MCNumber base_cur_inc_tax_amt();
	
	public MCNumber base_cur_upri();
	
	public String base_cur_cd();
	
	public String base_cur_nm();
	
	public MCNumber base_cur_amt_dec_place();
	
	public MCNumber base_cur_upri_dec_place();
	
	public MCNumber wtax_rate();
	
	public MCNumber wtax_amt();
	
	public MCNumber bsppl_cl_day();
	
	public MCDate bsppl_cl_dt();
	
	public MCNumber pay_crryovr_times();
	
	public MCDate pay_basis_dt();

	public MCDate pay_schd_dt();
	
	public String sppl_cd();
	
	public String sppl_nm();
	
	public String sno1();
	
	public String sno2();
	
	public String sno3();
	
	public String sno4();
	
	public String wrk_no();
	
	public String wrk_nm();
	
	public String sppl_itm_cd();
	
	public String sppl_itm_nm();
	
	public String trd_unit_cd();
	
	public String trd_unit_nm();
	
	public MCNumber trd_unit_dec_place();
	
	public MCNumber trd_unit_qty();
	
	public String base_unit_cd();
	
	public String base_unit_nm();
	
	public MCNumber base_unit_dec_place();
	
	public MCNumber base_unit_qty();
	
	public String bp_dlv_slip_no();
	
	public String bp_dlv_slip_d_no();
	
	public MCDate act_dt();
	
	public MCDate ac_dt();
	
	public String asppl_cd();
	
	public String asppl_nm();
	
	public String ap_dpt_cd();
	
	public String ap_dpt_nm();
	
	public boolean crryovr_flg();
	
	public String ap_typ();
	
	public String ap_typ_nm();
	
	public String trd_cd();
	
	public String trd_nm();
	
	public String trd_ptn_typ();
	
	public String slip_sts_typ();
	
	public String slip_sts_typ_nm();
	
	public String ap_d_no();
	
	public String po_no();
	
	public String po_d_no();
	
	public String purc_act_no();
	
	public String purc_act_d_no();
	
	public String rcpt_iv_no();
	
	public String rcpt_iv_mng_no();
	
	public String org_ap_d_no();
	
	public String crryovr_ap_d_no();
	
	public String crryovr_src_ap_d_no();
	
	public String sw_src_pay_schd_no();

	public String sw_src_rcv_bill_no(); 
	
	public MCDate base_purc_ac_dt();

	public String pay_ntc_d_print_rmrks();
	
	public MCNumber pay_xrate();
	
	public String pay_schd_d_print_rmrks();
	
	public String intr_rmrks();
	
	public String sub_char1();
	
	public String sub_char2();
	
	public String sub_char3();
	
	public boolean add_flg();
	
	public String purc_tax_rnd_typ();
	
	public String trd_unit_rnd_typ();
	
	public String base_unit_rnd_typ();
	
	public MCNumber ap_d_upd_cntr();
	
	public String ref_ap_d_no();
	
	public MCNumber amt_disp_pm();
	
	public boolean pay_spot_flg();

	public MCNumber trd_cur_proc_upri();
	
	public MCNumber trd_cur_proc_amt();
	
	public MCNumber trd_cur_onr_prov_upri();
	
	public MCNumber trd_cur_onr_prov_amt();
	
	public MCNumber base_cur_proc_upri();
	
	public MCNumber base_cur_proc_amt();
	
	public MCNumber base_cur_onr_prov_upri();
	
	public MCNumber base_cur_onr_prov_amt();
	
	public boolean repurc_obli_flg();
	
	public boolean outsrc_flg();

}
