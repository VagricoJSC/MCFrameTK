package mcframe.serverPFBE.PFBEL5260;

import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.notice.*;
import mcframe.serverCore.logic.*;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.serverMA.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.serverPF.dbc.*;
import static mcframe.commonPF.notice.PF_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverPF.dbc.PFFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverPFBZ.PFBZL9010.PFBZL_CodeConvert;
import mcframe.serverPFBZ.PFBZL9030.*;
import mcframe.commonPFBE.PFBER5260.*;
//FMCB CUSTOM_IMPORT END

/**
 * "PFBEL_BpIf"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class PFBEL_BpIf_MC extends PFBEL_BpIf_MC_A{
	//FMCB CUSTOM START

	/**
	 * BpIf_Conv01オペレーション.<p>
	 *
	 */
	public class BpIf_Conv01 extends PFBEL_BpIf_MC_A.BpIf_Conv01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void crtIfDBC() {
			_ifDBC = PFBZL_CodeConvert.crtRecvIfDBContainer(MBT_BP_IF_R.class);
		}
	}
	/**
	 * BpIf_Conv02オペレーション.<p>
	 *
	 */
	public class BpIf_Conv02 extends PFBEL_BpIf_MC_A.BpIf_Conv02 {
		@Override
		protected void call() {
			super.call();
		}
		/**
		 * 送受信IFのレポートセットのインスタンスを生成します
		 * 
		 */
		@Override
		@SuppressWarnings({
				"unchecked", "rawtypes"
		})
		protected void crtRptSet() {
			_IfRptSet = PFBZL_FileInput.createIfRecvReportSet(DtlR.class, MBT_BP_IF_R.class);
			_IfRptSet.setReportSet(PFBER_BpPrnt.create());
			_IfRptSet.setRowMapper(new MBT_BP_IF_R_DtlR());
			_IfRptSet.setReqColumns(_reqColumns);
		}
		
		protected String[] _reqColumns = {
				DtlR.$bp_cd, DtlR.$bp_nm, DtlR.$cntry_cd, DtlR.$cur_cd,
		};
		
		public class MBT_BP_IF_R_DtlR<D extends MBT_BP_IF_R, S extends DtlR, W extends PFT_SDRV_IF_R>
		extends MAUCC_RowMapperWith<D, S, W> {

			protected W _ifR;

			@Override
			public void setWith(W ifR) {
				this._ifR = ifR;
			}

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MBT_BP_IF_R.$data_crud_typ, DtlR.$data_crud_typ);
				addColumnPathMap(MBT_BP_IF_R.$data_make_dt, DtlR.$data_make_dt);
				addColumnPathMap(MBT_BP_IF_R.$bp_cd, DtlR.$bp_cd);
				addColumnPathMap(MBT_BP_IF_R.$del_flg, DtlR.$del_flg);
				addColumnPathMap(MBT_BP_IF_R.$bp_nm, DtlR.$bp_nm);
				addColumnPathMap(MBT_BP_IF_R.$bp_alt_nm1, DtlR.$bp_alt_nm1);
				addColumnPathMap(MBT_BP_IF_R.$bp_alt_nm2, DtlR.$bp_alt_nm2);
				addColumnPathMap(MBT_BP_IF_R.$bp_alt_nm3, DtlR.$bp_alt_nm3);
				addColumnPathMap(MBT_BP_IF_R.$bp_alt_nm4, DtlR.$bp_alt_nm4);
				addColumnPathMap(MBT_BP_IF_R.$zip_cd, DtlR.$zip_cd);
				addColumnPathMap(MBT_BP_IF_R.$addr1, DtlR.$addr1);
				addColumnPathMap(MBT_BP_IF_R.$addr2, DtlR.$addr2);
				addColumnPathMap(MBT_BP_IF_R.$addr3, DtlR.$addr3);
				addColumnPathMap(MBT_BP_IF_R.$addr4, DtlR.$addr4);
				addColumnPathMap(MBT_BP_IF_R.$tel, DtlR.$tel);
				addColumnPathMap(MBT_BP_IF_R.$fax, DtlR.$fax);
				addColumnPathMap(MBT_BP_IF_R.$ein, DtlR.$ein);
				addColumnPathMap(MBT_BP_IF_R.$std_co_cd, DtlR.$std_co_cd);
				addColumnPathMap(MBT_BP_IF_R.$cntry_cd, DtlR.$cntry_cd);
				addColumnPathMap(MBT_BP_IF_R.$area_cd, DtlR.$area_cd);
				addColumnPathMap(MBT_BP_IF_R.$cur_cd, DtlR.$cur_cd);
				addColumnPathMap(MBT_BP_IF_R.$prnt_lcl_cd, DtlR.$prnt_lcl_cd);
				addColumnPathMap(MBT_BP_IF_R.$bp_grp_cd1, DtlR.$bp_grp_cd1);
				addColumnPathMap(MBT_BP_IF_R.$bp_grp_cd2, DtlR.$bp_grp_cd2);
				addColumnPathMap(MBT_BP_IF_R.$bp_grp_cd3, DtlR.$bp_grp_cd3);
				addColumnPathMap(MBT_BP_IF_R.$bp_grp_cd4, DtlR.$bp_grp_cd4);
				addColumnPathMap(MBT_BP_IF_R.$bp_grp_cd5, DtlR.$bp_grp_cd5);
				addColumnPathMap(MBT_BP_IF_R.$bp_grp_cd6, DtlR.$bp_grp_cd6);
				addColumnPathMap(MBT_BP_IF_R.$bp_grp_cd7, DtlR.$bp_grp_cd7);
				addColumnPathMap(MBT_BP_IF_R.$bp_grp_cd8, DtlR.$bp_grp_cd8);
				addColumnPathMap(MBT_BP_IF_R.$bp_grp_cd9, DtlR.$bp_grp_cd9);
				addColumnPathMap(MBT_BP_IF_R.$bp_grp_cd10, DtlR.$bp_grp_cd10);
				addColumnPathMap(MBT_BP_IF_R.$bp_alc_grp, DtlR.$bp_alc_grp);
				addColumnPathMap(MBT_BP_IF_R.$cst_flg, DtlR.$cst_flg);
				addColumnPathMap(MBT_BP_IF_R.$acst_flg, DtlR.$acst_flg);
				addColumnPathMap(MBT_BP_IF_R.$bcst_flg, DtlR.$bcst_flg);
				addColumnPathMap(MBT_BP_IF_R.$rcst_flg, DtlR.$rcst_flg);
				addColumnPathMap(MBT_BP_IF_R.$sppl_flg, DtlR.$sppl_flg);
				addColumnPathMap(MBT_BP_IF_R.$asppl_flg, DtlR.$asppl_flg);
				addColumnPathMap(MBT_BP_IF_R.$bsppl_flg, DtlR.$bsppl_flg);
				addColumnPathMap(MBT_BP_IF_R.$psppl_flg, DtlR.$psppl_flg);
				addColumnPathMap(MBT_BP_IF_R.$cred_flg, DtlR.$cred_flg);
				addColumnPathMap(MBT_BP_IF_R.$dlv_flg, DtlR.$dlv_flg);
				addColumnPathMap(MBT_BP_IF_R.$maker_flg, DtlR.$maker_flg);
				addColumnPathMap(MBT_BP_IF_R.$dest_flg, DtlR.$dest_flg);
				addColumnPathMap(MBT_BP_IF_R.$all_com_flg, DtlR.$all_com_flg);
				addColumnPathMap(MBT_BP_IF_R.$acst_cd, DtlR.$acst_cd);
				addColumnPathMap(MBT_BP_IF_R.$ar_dpt_typ, DtlR.$ar_dpt_typ);
				addColumnPathMap(MBT_BP_IF_R.$ar_dpt_cd, DtlR.$ar_dpt_cd);
				addColumnPathMap(MBT_BP_IF_R.$cst_cntct_dpt, DtlR.$cst_cntct_dpt);
				addColumnPathMap(MBT_BP_IF_R.$cst_cntct_psn, DtlR.$cst_cntct_psn);
				addColumnPathMap(MBT_BP_IF_R.$cst_cntct_psn_title, DtlR.$cst_cntct_psn_title);
				addColumnPathMap(MBT_BP_IF_R.$cst_sundry_flg, DtlR.$cst_sundry_flg);
				addColumnPathMap(MBT_BP_IF_R.$sls_upri_req_typ, DtlR.$sls_upri_req_typ);
				addColumnPathMap(MBT_BP_IF_R.$sls_upri_cng_flg, DtlR.$sls_upri_cng_flg);
				addColumnPathMap(MBT_BP_IF_R.$sls_upri_rnd_typ, DtlR.$sls_upri_rnd_typ);
				addColumnPathMap(MBT_BP_IF_R.$sls_amt_rnd_typ, DtlR.$sls_amt_rnd_typ);
				addColumnPathMap(MBT_BP_IF_R.$sls_tax_calc_typ, DtlR.$sls_tax_calc_typ);
				addColumnPathMap(MBT_BP_IF_R.$sls_tax_rnd_typ, DtlR.$sls_tax_rnd_typ);
				addColumnPathMap(MBT_BP_IF_R.$sls_basis_typ, DtlR.$sls_basis_typ);
				addColumnPathMap(MBT_BP_IF_R.$bill_basis_typ, DtlR.$bill_basis_typ);
				addColumnPathMap(MBT_BP_IF_R.$ship_schd_split_typ, DtlR.$ship_schd_split_typ);
				addColumnPathMap(MBT_BP_IF_R.$bill_crryovr_times, DtlR.$bill_crryovr_times);
				addColumnPathMap(MBT_BP_IF_R.$lot_back_stop_typ, DtlR.$lot_back_stop_typ);
				addColumnPathMap(MBT_BP_IF_R.$slip_each_lot_typ, DtlR.$slip_each_lot_typ);
				addColumnPathMap(MBT_BP_IF_R.$cst_ship_form_cd, DtlR.$cst_ship_form_cd);
				addColumnPathMap(MBT_BP_IF_R.$stk_lst_issue_flg, DtlR.$stk_lst_issue_flg);
				addColumnPathMap(MBT_BP_IF_R.$stk_lst_form_cd, DtlR.$stk_lst_form_cd);
				addColumnPathMap(MBT_BP_IF_R.$sls_tax_cd, DtlR.$sls_tax_cd);
				addColumnPathMap(MBT_BP_IF_R.$sls_tax_cd_prio_flg, DtlR.$sls_tax_cd_prio_flg);
				addColumnPathMap(MBT_BP_IF_R.$wrk_ar_flg, DtlR.$wrk_ar_flg);
				addColumnPathMap(MBT_BP_IF_R.$cst_iv_flg, DtlR.$cst_iv_flg);
				addColumnPathMap(MBT_BP_IF_R.$ship_lt, DtlR.$ship_lt);
				addColumnPathMap(MBT_BP_IF_R.$cst_tterm_cd1, DtlR.$cst_tterm_cd1);
				addColumnPathMap(MBT_BP_IF_R.$cst_tterm_cd2, DtlR.$cst_tterm_cd2);
				addColumnPathMap(MBT_BP_IF_R.$cst_tterm_cd3, DtlR.$cst_tterm_cd3);
				addColumnPathMap(MBT_BP_IF_R.$sls_anly_cd1, DtlR.$sls_anly_cd1);
				addColumnPathMap(MBT_BP_IF_R.$sls_anly_cd2, DtlR.$sls_anly_cd2);
				addColumnPathMap(MBT_BP_IF_R.$sls_anly_cd3, DtlR.$sls_anly_cd3);
				addColumnPathMap(MBT_BP_IF_R.$not_lg_mix_flg, DtlR.$not_lg_mix_flg);
				addColumnPathMap(MBT_BP_IF_R.$not_lot_mix_flg, DtlR.$not_lot_mix_flg);
				addColumnPathMap(MBT_BP_IF_R.$not_sublot_mix_flg, DtlR.$not_sublot_mix_flg);
				addColumnPathMap(MBT_BP_IF_R.$bcst_cd, DtlR.$bcst_cd);
				addColumnPathMap(MBT_BP_IF_R.$rcst_cd, DtlR.$rcst_cd);
				addColumnPathMap(MBT_BP_IF_R.$ar_cred_cd, DtlR.$ar_cred_cd);
				addColumnPathMap(MBT_BP_IF_R.$bill_dpt_typ, DtlR.$bill_dpt_typ);
				addColumnPathMap(MBT_BP_IF_R.$bcst_dpt_cd, DtlR.$bcst_dpt_cd);
				addColumnPathMap(MBT_BP_IF_R.$bill_cl_typ, DtlR.$bill_cl_typ);
				addColumnPathMap(MBT_BP_IF_R.$bill_cl_day1, DtlR.$bill_cl_day1);
				addColumnPathMap(MBT_BP_IF_R.$bill_cl_day2, DtlR.$bill_cl_day2);
				addColumnPathMap(MBT_BP_IF_R.$bill_cl_day3, DtlR.$bill_cl_day3);
				addColumnPathMap(MBT_BP_IF_R.$bill_cl_day4, DtlR.$bill_cl_day4);
				addColumnPathMap(MBT_BP_IF_R.$bill_cl_day5, DtlR.$bill_cl_day5);
				addColumnPathMap(MBT_BP_IF_R.$tax_on_bill_flg, DtlR.$tax_on_bill_flg);
				addColumnPathMap(MBT_BP_IF_R.$bill_tax_rnd_typ, DtlR.$bill_tax_rnd_typ);
				addColumnPathMap(MBT_BP_IF_R.$bill_cl_delay_days, DtlR.$bill_cl_delay_days);
				addColumnPathMap(MBT_BP_IF_R.$bill_cl_ba_typ, DtlR.$bill_cl_ba_typ);
				addColumnPathMap(MBT_BP_IF_R.$sls_interim_cl_flg, DtlR.$sls_interim_cl_flg);
				addColumnPathMap(MBT_BP_IF_R.$bill_cal_cd, DtlR.$bill_cal_cd);
				addColumnPathMap(MBT_BP_IF_R.$rcv_ba_typ, DtlR.$rcv_ba_typ);
				addColumnPathMap(MBT_BP_IF_R.$bill_zip_cd, DtlR.$bill_zip_cd);
				addColumnPathMap(MBT_BP_IF_R.$bill_addr1, DtlR.$bill_addr1);
				addColumnPathMap(MBT_BP_IF_R.$bill_addr2, DtlR.$bill_addr2);
				addColumnPathMap(MBT_BP_IF_R.$bill_addr3, DtlR.$bill_addr3);
				addColumnPathMap(MBT_BP_IF_R.$bill_addr4, DtlR.$bill_addr4);
				addColumnPathMap(MBT_BP_IF_R.$bill_tel, DtlR.$bill_tel);
				addColumnPathMap(MBT_BP_IF_R.$bill_bcst_nm, DtlR.$bill_bcst_nm);
				addColumnPathMap(MBT_BP_IF_R.$bill_bcst_dpt, DtlR.$bill_bcst_dpt);
				addColumnPathMap(MBT_BP_IF_R.$bill_bcst_psn, DtlR.$bill_bcst_psn);
				addColumnPathMap(MBT_BP_IF_R.$bill_bcst_psn_title, DtlR.$bill_bcst_psn_title);
				addColumnPathMap(MBT_BP_IF_R.$bfw_bal_disp_flg, DtlR.$bfw_bal_disp_flg);
				addColumnPathMap(MBT_BP_IF_R.$sls_dtl_outp_typ, DtlR.$sls_dtl_outp_typ);
				addColumnPathMap(MBT_BP_IF_R.$bill_prnt_typ, DtlR.$bill_prnt_typ);
				addColumnPathMap(MBT_BP_IF_R.$bill_dtl_outp_flg, DtlR.$bill_dtl_outp_flg);
				addColumnPathMap(MBT_BP_IF_R.$bill_dtl_adv_flg, DtlR.$bill_dtl_adv_flg);
				addColumnPathMap(MBT_BP_IF_R.$bill_dtl_rcv_flg, DtlR.$bill_dtl_rcv_flg);
				addColumnPathMap(MBT_BP_IF_R.$bill_dtl_subttl_typ, DtlR.$bill_dtl_subttl_typ);
				addColumnPathMap(MBT_BP_IF_R.$bill_dtl_brk_typ, DtlR.$bill_dtl_brk_typ);
				addColumnPathMap(MBT_BP_IF_R.$bill_dtl_sort_typ, DtlR.$bill_dtl_sort_typ);
				addColumnPathMap(MBT_BP_IF_R.$bill_can_slip_typ, DtlR.$bill_can_slip_typ);
				addColumnPathMap(MBT_BP_IF_R.$auto_line_appl_flg, DtlR.$auto_line_appl_flg);
				addColumnPathMap(MBT_BP_IF_R.$ar_setoff_grp_cd, DtlR.$ar_setoff_grp_cd);
				addColumnPathMap(MBT_BP_IF_R.$xfr_psn, DtlR.$xfr_psn);
				addColumnPathMap(MBT_BP_IF_R.$rcv_auto_appl_tgt_flg, DtlR.$rcv_auto_appl_tgt_flg);
				addColumnPathMap(MBT_BP_IF_R.$rcv_amt_match_flg, DtlR.$rcv_amt_match_flg);
				addColumnPathMap(MBT_BP_IF_R.$ar_sttl_typ_match_flg, DtlR.$ar_sttl_typ_match_flg);
				addColumnPathMap(MBT_BP_IF_R.$calc_com_paid_flg, DtlR.$calc_com_paid_flg);
				addColumnPathMap(MBT_BP_IF_R.$auto_appl_delay_days, DtlR.$auto_appl_delay_days);
				addColumnPathMap(MBT_BP_IF_R.$asppl_cd, DtlR.$asppl_cd);
				addColumnPathMap(MBT_BP_IF_R.$vmi_purc_dpt_cd, DtlR.$vmi_purc_dpt_cd);
				addColumnPathMap(MBT_BP_IF_R.$subcon_flg, DtlR.$subcon_flg);
				addColumnPathMap(MBT_BP_IF_R.$po_print_cd, DtlR.$po_print_cd);
				addColumnPathMap(MBT_BP_IF_R.$sppl_ship_form_cd, DtlR.$sppl_ship_form_cd);
				addColumnPathMap(MBT_BP_IF_R.$po_dlv_slip_flg, DtlR.$po_dlv_slip_flg);
				addColumnPathMap(MBT_BP_IF_R.$dlv_inst_dlv_slip_flg, DtlR.$dlv_inst_dlv_slip_flg);
				addColumnPathMap(MBT_BP_IF_R.$prms_rcpt_dlv_slip_flg, DtlR.$prms_rcpt_dlv_slip_flg);
				addColumnPathMap(MBT_BP_IF_R.$pay_crryovr_times, DtlR.$pay_crryovr_times);
				addColumnPathMap(MBT_BP_IF_R.$sppl_cntct_dpt, DtlR.$sppl_cntct_dpt);
				addColumnPathMap(MBT_BP_IF_R.$sppl_cntct_psn, DtlR.$sppl_cntct_psn);
				addColumnPathMap(MBT_BP_IF_R.$sppl_cntct_psn_title, DtlR.$sppl_cntct_psn_title);
				addColumnPathMap(MBT_BP_IF_R.$purc_upri_req_typ, DtlR.$purc_upri_req_typ);
				addColumnPathMap(MBT_BP_IF_R.$purc_upri_cng_flg, DtlR.$purc_upri_cng_flg);
				addColumnPathMap(MBT_BP_IF_R.$purc_amt_rnd_typ, DtlR.$purc_amt_rnd_typ);
				addColumnPathMap(MBT_BP_IF_R.$purc_tax_rnd_typ, DtlR.$purc_tax_rnd_typ);
				addColumnPathMap(MBT_BP_IF_R.$purc_tax_calc_typ, DtlR.$purc_tax_calc_typ);
				addColumnPathMap(MBT_BP_IF_R.$purc_tax_cd, DtlR.$purc_tax_cd);
				addColumnPathMap(MBT_BP_IF_R.$purc_tax_cd_prio_flg, DtlR.$purc_tax_cd_prio_flg);
				addColumnPathMap(MBT_BP_IF_R.$wrk_po_flg, DtlR.$wrk_po_flg);
				addColumnPathMap(MBT_BP_IF_R.$wrk_ap_flg, DtlR.$wrk_ap_flg);
				addColumnPathMap(MBT_BP_IF_R.$purc_slip_each_lot_typ, DtlR.$purc_slip_each_lot_typ);
				addColumnPathMap(MBT_BP_IF_R.$prov_rcv_typ, DtlR.$prov_rcv_typ);
				addColumnPathMap(MBT_BP_IF_R.$onr_prsppl_flg, DtlR.$onr_prsppl_flg);
				addColumnPathMap(MBT_BP_IF_R.$outsrc_upri_typ, DtlR.$outsrc_upri_typ);
				addColumnPathMap(MBT_BP_IF_R.$prov_basis_typ, DtlR.$prov_basis_typ);
				addColumnPathMap(MBT_BP_IF_R.$prov_upri_cng_flg, DtlR.$prov_upri_cng_flg);
				addColumnPathMap(MBT_BP_IF_R.$prov_amt_rnd_typ, DtlR.$prov_amt_rnd_typ);
				addColumnPathMap(MBT_BP_IF_R.$prov_tax_rnd_typ, DtlR.$prov_tax_rnd_typ);
				addColumnPathMap(MBT_BP_IF_R.$prov_tax_calc_typ, DtlR.$prov_tax_calc_typ);
				addColumnPathMap(MBT_BP_IF_R.$prov_tax_cd, DtlR.$prov_tax_cd);
				addColumnPathMap(MBT_BP_IF_R.$prov_tax_cd_prio_flg, DtlR.$prov_tax_cd_prio_flg);
				addColumnPathMap(MBT_BP_IF_R.$sppl_cal_cd, DtlR.$sppl_cal_cd);
				addColumnPathMap(MBT_BP_IF_R.$sppl_iv_flg, DtlR.$sppl_iv_flg);
				addColumnPathMap(MBT_BP_IF_R.$rcpt_iv_dup_flg, DtlR.$rcpt_iv_dup_flg);
				addColumnPathMap(MBT_BP_IF_R.$prms_recv_flg, DtlR.$prms_recv_flg);
				addColumnPathMap(MBT_BP_IF_R.$sppl_tterm_cd1, DtlR.$sppl_tterm_cd1);
				addColumnPathMap(MBT_BP_IF_R.$sppl_tterm_cd2, DtlR.$sppl_tterm_cd2);
				addColumnPathMap(MBT_BP_IF_R.$sppl_tterm_cd3, DtlR.$sppl_tterm_cd3);
				addColumnPathMap(MBT_BP_IF_R.$purc_basis_typ, DtlR.$purc_basis_typ);
				addColumnPathMap(MBT_BP_IF_R.$repurc_obli_flg, DtlR.$repurc_obli_flg);
				addColumnPathMap(MBT_BP_IF_R.$bsppl_cd, DtlR.$bsppl_cd);
				addColumnPathMap(MBT_BP_IF_R.$ap_dpt_cd, DtlR.$ap_dpt_cd);
				addColumnPathMap(MBT_BP_IF_R.$psppl_cd, DtlR.$psppl_cd);
				addColumnPathMap(MBT_BP_IF_R.$ap_cred_cd, DtlR.$ap_cred_cd);
				addColumnPathMap(MBT_BP_IF_R.$bsppl_dpt_cd, DtlR.$bsppl_dpt_cd);
				addColumnPathMap(MBT_BP_IF_R.$pay_spot_flg, DtlR.$pay_spot_flg);
				addColumnPathMap(MBT_BP_IF_R.$psppl_cl_day1, DtlR.$psppl_cl_day1);
				addColumnPathMap(MBT_BP_IF_R.$psppl_cl_day2, DtlR.$psppl_cl_day2);
				addColumnPathMap(MBT_BP_IF_R.$psppl_cl_day3, DtlR.$psppl_cl_day3);
				addColumnPathMap(MBT_BP_IF_R.$psppl_cl_day4, DtlR.$psppl_cl_day4);
				addColumnPathMap(MBT_BP_IF_R.$psppl_cl_day5, DtlR.$psppl_cl_day5);
				addColumnPathMap(MBT_BP_IF_R.$purc_interim_cl_flg, DtlR.$purc_interim_cl_flg);
				addColumnPathMap(MBT_BP_IF_R.$ap_setoff_grp_cd, DtlR.$ap_setoff_grp_cd);
				addColumnPathMap(MBT_BP_IF_R.$pay_bank_ac_cd, DtlR.$pay_bank_ac_cd);
				addColumnPathMap(MBT_BP_IF_R.$pay_schd_ba_typ, DtlR.$pay_schd_ba_typ);
				addColumnPathMap(MBT_BP_IF_R.$tax_on_pay_flg, DtlR.$tax_on_pay_flg);
				addColumnPathMap(MBT_BP_IF_R.$pay_tax_rnd_typ, DtlR.$pay_tax_rnd_typ);
				addColumnPathMap(MBT_BP_IF_R.$batch_pay_schd_cl_flg, DtlR.$batch_pay_schd_cl_flg);
				addColumnPathMap(MBT_BP_IF_R.$pay_schd_cl_delay_days, DtlR.$pay_schd_cl_delay_days);
				addColumnPathMap(MBT_BP_IF_R.$pay_schd_cl_ba_typ, DtlR.$pay_schd_cl_ba_typ);
				addColumnPathMap(MBT_BP_IF_R.$biz_co_no, DtlR.$biz_co_no);
				addColumnPathMap(MBT_BP_IF_R.$pay_ntc_prnt_flg, DtlR.$pay_ntc_prnt_flg);
				addColumnPathMap(MBT_BP_IF_R.$pay_ntc_zip_cd, DtlR.$pay_ntc_zip_cd);
				addColumnPathMap(MBT_BP_IF_R.$pay_ntc_addr1, DtlR.$pay_ntc_addr1);
				addColumnPathMap(MBT_BP_IF_R.$pay_ntc_addr2, DtlR.$pay_ntc_addr2);
				addColumnPathMap(MBT_BP_IF_R.$pay_ntc_addr3, DtlR.$pay_ntc_addr3);
				addColumnPathMap(MBT_BP_IF_R.$pay_ntc_addr4, DtlR.$pay_ntc_addr4);
				addColumnPathMap(MBT_BP_IF_R.$pay_ntc_bsppl_nm, DtlR.$pay_ntc_bsppl_nm);
				addColumnPathMap(MBT_BP_IF_R.$pay_ntc_bsppl_dpt, DtlR.$pay_ntc_bsppl_dpt);
				addColumnPathMap(MBT_BP_IF_R.$pay_ntc_bsppl_psn, DtlR.$pay_ntc_bsppl_psn);
				addColumnPathMap(MBT_BP_IF_R.$pay_ntc_bsppl_psn_title, DtlR.$pay_ntc_bsppl_psn_title);
				addColumnPathMap(MBT_BP_IF_R.$pay_ntc_tel, DtlR.$pay_ntc_tel);
				addColumnPathMap(MBT_BP_IF_R.$pay_ntc_dtl_outp_flg, DtlR.$pay_ntc_dtl_outp_flg);
				addColumnPathMap(MBT_BP_IF_R.$pay_ntc_bfw_bal_disp_flg, DtlR.$pay_ntc_bfw_bal_disp_flg);
				addColumnPathMap(MBT_BP_IF_R.$pay_ntc_adv_pay_flg, DtlR.$pay_ntc_adv_pay_flg);
				addColumnPathMap(MBT_BP_IF_R.$pay_ntc_dtl_pay_flg, DtlR.$pay_ntc_dtl_pay_flg);
				addColumnPathMap(MBT_BP_IF_R.$pay_ntc_dtl_subttl_typ, DtlR.$pay_ntc_dtl_subttl_typ);
				addColumnPathMap(MBT_BP_IF_R.$pay_ntc_dtl_brk_typ, DtlR.$pay_ntc_dtl_brk_typ);
				addColumnPathMap(MBT_BP_IF_R.$pay_ntc_dtl_sort_typ, DtlR.$pay_ntc_dtl_sort_typ);
				addColumnPathMap(MBT_BP_IF_R.$pay_ntc_can_slip_typ, DtlR.$pay_ntc_can_slip_typ);
				addColumnPathMap(MBT_BP_IF_R.$psppl_rmrks, DtlR.$psppl_rmrks);
				addColumnPathMap(MBT_BP_IF_R.$note_days, DtlR.$note_days);
				addColumnPathMap(MBT_BP_IF_R.$pay_dpt_cd, DtlR.$pay_dpt_cd);
				addColumnPathMap(MBT_BP_IF_R.$dlv_sundry_flg, DtlR.$dlv_sundry_flg);
				addColumnPathMap(MBT_BP_IF_R.$dlv_cntct_dpt, DtlR.$dlv_cntct_dpt);
				addColumnPathMap(MBT_BP_IF_R.$dlv_cntct_psn, DtlR.$dlv_cntct_psn);
				addColumnPathMap(MBT_BP_IF_R.$dlv_cntct_psn_title, DtlR.$dlv_cntct_psn_title);
				addColumnPathMap(MBT_BP_IF_R.$pri_prnt_flg, DtlR.$pri_prnt_flg);
				addColumnPathMap(MBT_BP_IF_R.$cnsgn_stktk_flg, DtlR.$cnsgn_stktk_flg);
				addColumnPathMap(MBT_BP_IF_R.$tdlv_flg, DtlR.$tdlv_flg);
				addColumnPathMap(MBT_BP_IF_R.$via_dlv_typ, DtlR.$via_dlv_typ);
				addColumnPathMap(MBT_BP_IF_R.$tdlv_req_flg, DtlR.$tdlv_req_flg);
				addColumnPathMap(MBT_BP_IF_R.$lg_grp_cd, DtlR.$lg_grp_cd);
				addColumnPathMap(MBT_BP_IF_R.$dlv_cal_cd, DtlR.$dlv_cal_cd);
				addColumnPathMap(MBT_BP_IF_R.$dlv_chnnl1, DtlR.$dlv_chnnl1);
				addColumnPathMap(MBT_BP_IF_R.$dlv_chnnl2, DtlR.$dlv_chnnl2);
				addColumnPathMap(MBT_BP_IF_R.$dlv_chnnl3, DtlR.$dlv_chnnl3);
				addColumnPathMap(MBT_BP_IF_R.$cst_prnt_typ, DtlR.$cst_prnt_typ);
				addColumnPathMap(MBT_BP_IF_R.$acst_prnt_typ, DtlR.$acst_prnt_typ);
				addColumnPathMap(MBT_BP_IF_R.$bcst_prnt_typ, DtlR.$bcst_prnt_typ);
				addColumnPathMap(MBT_BP_IF_R.$rcst_prnt_typ, DtlR.$rcst_prnt_typ);
				addColumnPathMap(MBT_BP_IF_R.$sppl_prnt_typ, DtlR.$sppl_prnt_typ);
				addColumnPathMap(MBT_BP_IF_R.$asppl_prnt_typ, DtlR.$asppl_prnt_typ);
				addColumnPathMap(MBT_BP_IF_R.$bsppl_prnt_typ, DtlR.$bsppl_prnt_typ);
				addColumnPathMap(MBT_BP_IF_R.$psppl_prnt_typ, DtlR.$psppl_prnt_typ);
				addColumnPathMap(MBT_BP_IF_R.$dlv_prnt_typ, DtlR.$dlv_prnt_typ);
				addColumnPathMap(MBT_BP_IF_R.$memo1, DtlR.$memo1);
				addColumnPathMap(MBT_BP_IF_R.$memo2, DtlR.$memo2);
				addColumnPathMap(MBT_BP_IF_R.$memo3, DtlR.$memo3);
				addColumnPathMap(MBT_BP_IF_R.$memo4, DtlR.$memo4);
				addColumnPathMap(MBT_BP_IF_R.$memo5, DtlR.$memo5);
				addColumnPathMap(MBT_BP_IF_R.$memo6, DtlR.$memo6);
				addColumnPathMap(MBT_BP_IF_R.$memo7, DtlR.$memo7);
				addColumnPathMap(MBT_BP_IF_R.$memo8, DtlR.$memo8);
				addColumnPathMap(MBT_BP_IF_R.$memo9, DtlR.$memo9);
				addColumnPathMap(MBT_BP_IF_R.$memo10, DtlR.$memo10);
				addColumnPathMap(MBT_BP_IF_R.$memo11, DtlR.$memo11);
				addColumnPathMap(MBT_BP_IF_R.$memo12, DtlR.$memo12);
				addColumnPathMap(MBT_BP_IF_R.$memo13, DtlR.$memo13);
				addColumnPathMap(MBT_BP_IF_R.$memo14, DtlR.$memo14);
				addColumnPathMap(MBT_BP_IF_R.$memo15, DtlR.$memo15);
				addColumnPathMap(MBT_BP_IF_R.$memo16, DtlR.$memo16);
				addColumnPathMap(MBT_BP_IF_R.$memo17, DtlR.$memo17);
				addColumnPathMap(MBT_BP_IF_R.$memo18, DtlR.$memo18);
				addColumnPathMap(MBT_BP_IF_R.$memo19, DtlR.$memo19);
				addColumnPathMap(MBT_BP_IF_R.$memo20, DtlR.$memo20);
				addColumnPathMap(MBT_BP_IF_R.$if_sub_char1, DtlR.$if_sub_char1);
				addColumnPathMap(MBT_BP_IF_R.$if_sub_char2, DtlR.$if_sub_char2);
				addColumnPathMap(MBT_BP_IF_R.$if_sub_char3, DtlR.$if_sub_char3);
				addColumnPathMap(MBT_BP_IF_R.$if_sub_char4, DtlR.$if_sub_char4);
				addColumnPathMap(MBT_BP_IF_R.$if_sub_char5, DtlR.$if_sub_char5);
				addColumnPathMap(MBT_BP_IF_R.$if_sub_char6, DtlR.$if_sub_char6);
				addColumnPathMap(MBT_BP_IF_R.$if_sub_char7, DtlR.$if_sub_char7);
				addColumnPathMap(MBT_BP_IF_R.$if_sub_char8, DtlR.$if_sub_char8);
				addColumnPathMap(MBT_BP_IF_R.$if_sub_char9, DtlR.$if_sub_char9);
				addColumnPathMap(MBT_BP_IF_R.$if_sub_char10, DtlR.$if_sub_char10);
				addColumnPathMap(MBT_BP_IF_R.$if_sub_char11, DtlR.$if_sub_char11);
				addColumnPathMap(MBT_BP_IF_R.$if_sub_char12, DtlR.$if_sub_char12);
				addColumnPathMap(MBT_BP_IF_R.$if_sub_char13, DtlR.$if_sub_char13);
				addColumnPathMap(MBT_BP_IF_R.$if_sub_char14, DtlR.$if_sub_char14);
				addColumnPathMap(MBT_BP_IF_R.$if_sub_char15, DtlR.$if_sub_char15);
				addColumnPathMap(MBT_BP_IF_R.$if_sub_char16, DtlR.$if_sub_char16);
				addColumnPathMap(MBT_BP_IF_R.$if_sub_char17, DtlR.$if_sub_char17);
				addColumnPathMap(MBT_BP_IF_R.$if_sub_char18, DtlR.$if_sub_char18);
				addColumnPathMap(MBT_BP_IF_R.$if_sub_char19, DtlR.$if_sub_char19);
				addColumnPathMap(MBT_BP_IF_R.$if_sub_char20, DtlR.$if_sub_char20);
				addColumnPathMap(MBT_BP_IF_R.$if_sub_char21, DtlR.$if_sub_char21);
				addColumnPathMap(MBT_BP_IF_R.$if_sub_char22, DtlR.$if_sub_char22);
				addColumnPathMap(MBT_BP_IF_R.$if_sub_char23, DtlR.$if_sub_char23);
				addColumnPathMap(MBT_BP_IF_R.$if_sub_char24, DtlR.$if_sub_char24);
				addColumnPathMap(MBT_BP_IF_R.$if_sub_char25, DtlR.$if_sub_char25);
				addColumnPathMap(MBT_BP_IF_R.$if_sub_char26, DtlR.$if_sub_char26);
				addColumnPathMap(MBT_BP_IF_R.$if_sub_char27, DtlR.$if_sub_char27);
				addColumnPathMap(MBT_BP_IF_R.$if_sub_char28, DtlR.$if_sub_char28);
				addColumnPathMap(MBT_BP_IF_R.$if_sub_char29, DtlR.$if_sub_char29);
				addColumnPathMap(MBT_BP_IF_R.$if_sub_char30, DtlR.$if_sub_char30);
				addColumnPathMap(MBT_BP_IF_R.$if_sub_num1, DtlR.$if_sub_num1);
				addColumnPathMap(MBT_BP_IF_R.$if_sub_num2, DtlR.$if_sub_num2);
				addColumnPathMap(MBT_BP_IF_R.$if_sub_num3, DtlR.$if_sub_num3);
				addColumnPathMap(MBT_BP_IF_R.$if_sub_num4, DtlR.$if_sub_num4);
				addColumnPathMap(MBT_BP_IF_R.$if_sub_num5, DtlR.$if_sub_num5);
				addColumnPathMap(MBT_BP_IF_R.$if_sub_dt1, DtlR.$if_sub_dt1);
				addColumnPathMap(MBT_BP_IF_R.$if_sub_dt2, DtlR.$if_sub_dt2);
				addColumnPathMap(MBT_BP_IF_R.$if_sub_dt3, DtlR.$if_sub_dt3);
				addColumnPathMap(MBT_BP_IF_R.$if_sub_dt4, DtlR.$if_sub_dt4);
				addColumnPathMap(MBT_BP_IF_R.$if_sub_dt5, DtlR.$if_sub_dt5);
			}
			@Override
			public void valueCopy(D dest, S src) {
				dest.data_lno(getSequence(MAC_NUM_SYS_TYP.BP_IF_DATA_LNO.value()));
				dest.data_no(_ifR.data_no());
				dest.ext_sys_cd(_ifR.ext_sys_cd());
				dest.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
				dest.imp_flg(true);
			}
		}
	}

	//FMCB CUSTOM END
}