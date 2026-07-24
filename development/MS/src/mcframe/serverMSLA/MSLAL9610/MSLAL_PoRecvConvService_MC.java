package mcframe.serverMSLA.MSLAL9610;

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
import mcframe.serverMB.dbc.*;
import mcframe.serverMS.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMS.dbc.MSBAFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverPFBZ.PFBZL9010.PFBZL_CodeConvert;
import mcframe.serverPFBZ.PFBZL9030.PFBZL_FileInput;
import mcframe.commonMSLA.MSLAR2110.*;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
import mcframe.serverPF.dbc.PFT_SDRV_IF_R;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_PoRecvConvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_PoRecvConvService_MC extends MSLAL_PoRecvConvService_MC_A{
	//FMCB CUSTOM START

	/**
	 * PoRecvConv_Conv01オペレーション.<p>
	 *
	 */
	public class PoRecvConv_Conv01 extends MSLAL_PoRecvConvService_MC_A.PoRecvConv_Conv01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		@SuppressWarnings("unchecked")
		protected void crtIfDBC() {
			_ifDBC = PFBZL_CodeConvert.crtRecvIfDBContainer(MST_PO_RECV_IF_R.class);
		}
		
		@Override
		protected void setCnvBpCol() {
			_cnvBpCol = "if_sppl_cd";
		}
		
		@Override
		protected void setCnvIfCols() {
			_ifDBC.addCnvCol("if_trd_cd", "trd_cd", MAC_IF_COL_TYP.TRD);
			_ifDBC.addCnvCol("if_sppl_cd", "sppl_cd", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("if_purc_dpt_cd", "purc_dpt_cd", MAC_IF_COL_TYP.DPT);
			_ifDBC.addCnvCol("if_purc_usr_cd", "purc_usr_cd", MAC_IF_COL_TYP.USR);
			_ifDBC.addCnvCol("if_trd_cur_cd", "trd_cur_cd", MAC_IF_COL_TYP.CUR);
			_ifDBC.addCnvCol("if_po_print_cd", "po_print_cd", MAC_IF_COL_TYP.PO_PRINT);
			_ifDBC.addCnvCol("if_crct_rsn_cd", "crct_rsn_cd", MAC_IF_COL_TYP.CRCT_RSN);
			_ifDBC.addCnvCol("if_tterm_cd1", "tterm_cd1", MAC_IF_COL_TYP.TTERM1);
			_ifDBC.addCnvCol("if_tterm_cd2", "tterm_cd2", MAC_IF_COL_TYP.TTERM2);
			_ifDBC.addCnvCol("if_tterm_cd3", "tterm_cd3", MAC_IF_COL_TYP.TTERM3);
			_ifDBC.addCnvItmCol("if_itm_cd", "if_itm_sub1", "if_itm_sub2", "if_itm_sub3", "itm_cd", "itm_sub1", "itm_sub2", "itm_sub3");
			_ifDBC.addCnvCol("if_maker_cd", "maker_cd", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("if_in_to_loc_cd", "in_to_loc_cd", MAC_IF_COL_TYP.SHIP_TO_ID);
			_ifDBC.addCnvCol("if_str_ln_cd", "str_ln_cd", MAC_IF_COL_TYP.STR_LN);
			_ifDBC.addCnvCol("if_mfg_loc_cd", "mfg_loc_cd", MAC_IF_COL_TYP.SHIP_TO_ID);
			_ifDBC.addCnvCol("if_trd_unit_cd", "trd_unit_cd", MAC_IF_COL_TYP.UNIT);
			_ifDBC.addCnvCol("if_tax_cd", "tax_cd", MAC_IF_COL_TYP.TAX);
			_ifDBC.addCnvCol("if_dscnt_rsn_cd", "dscnt_rsn_cd", MAC_IF_COL_TYP.BIZ_RSN);
			_ifDBC.addCnvCol("if_purc_rsn_cd", "purc_rsn_cd", MAC_IF_COL_TYP.BIZ_RSN);
			_ifDBC.addCnvCol("if_ap_dpt_cd", "ap_dpt_cd", MAC_IF_COL_TYP.DPT);
			_ifDBC.addCnvCol("if_bd_dpt_cd", "bd_dpt_cd", MAC_IF_COL_TYP.DPT);
			_ifDBC.addCnvItmCol("if_bd_itm_cd", "if_bd_itm_sub1", "if_bd_itm_sub2", "if_bd_itm_sub3", "bd_itm_cd", "bd_itm_sub1", "bd_itm_sub2", "bd_itm_sub3");
			_ifDBC.addCnvCol("if_bd_loc_cd", "bd_loc_cd", MAC_IF_COL_TYP.SHIP_TO_ID);
			_ifDBC.addCnvCol("if_bd_ctg_cd", "bd_ctg_cd", MAC_IF_COL_TYP.CTG);
			_ifDBC.addCnvCol("if_bd_oper_cd", "bd_oper_cd", MAC_IF_COL_TYP.OPER);
		}
	}

	/**
	 * PoRecvConv_Conv02オペレーション.<p>
	 *
	 */
	public class PoRecvConv_Conv02 extends MSLAL_PoRecvConvService_MC_A.PoRecvConv_Conv02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		@SuppressWarnings({
				"unchecked", "rawtypes"
		})
		protected void crtRptSet() {
			_IfRptSet = PFBZL_FileInput.createIfRecvReportSet(DtlR.class, MST_PO_RECV_IF_R.class);
			_IfRptSet.setReportSet(MSLAR_PoPrnt.create());
			_IfRptSet.setRowMapper(new Map_MST_PO_RECV_IF_R_DtlR());
		}

		public class Map_MST_PO_RECV_IF_R_DtlR<D extends MST_PO_RECV_IF_R, S extends DtlR, W extends PFT_SDRV_IF_R>
				extends MAUCC_RowMapperWith<D, S, W> {

			protected W _ifR;

			@Override
			public void setWith(W ifR) {
				this._ifR = ifR;
			}

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_PO_RECV_IF_R.$data_crud_typ, DtlR.$data_crud_typ);
				addColumnPathMap(MST_PO_RECV_IF_R.$data_make_dt, DtlR.$data_make_dt);
				addColumnPathMap(MST_PO_RECV_IF_R.$ext_po_no, DtlR.$ext_po_no);
				addColumnPathMap(MST_PO_RECV_IF_R.$ext_po_d_no, DtlR.$ext_po_d_no);
				addColumnPathMap(MST_PO_RECV_IF_R.$po_dt, DtlR.$po_dt);
				addColumnPathMap(MST_PO_RECV_IF_R.$prnt_po_flg, DtlR.$prnt_po_flg);
				addColumnPathMap(MST_PO_RECV_IF_R.$prnt_dlv_flg, DtlR.$prnt_dlv_flg);
				addColumnPathMap(MST_PO_RECV_IF_R.$trd_ptn_typ, DtlR.$trd_ptn_typ);
				addColumnPathMap(MST_PO_RECV_IF_R.$xrate, DtlR.$xrate);
				addColumnPathMap(MST_PO_RECV_IF_R.$xrate_inpt_flg, DtlR.$xrate_inpt_flg);
				addColumnPathMap(MST_PO_RECV_IF_R.$ptax_xrate, DtlR.$ptax_xrate);
				addColumnPathMap(MST_PO_RECV_IF_R.$ptax_xrate_inpt_flg, DtlR.$ptax_xrate_inpt_flg);
				addColumnPathMap(MST_PO_RECV_IF_R.$upd_po_print_schd_dt, DtlR.$upd_po_print_schd_dt);
				addColumnPathMap(MST_PO_RECV_IF_R.$tterm_rmrks1, DtlR.$tterm_rmrks1);
				addColumnPathMap(MST_PO_RECV_IF_R.$tterm_rmrks2, DtlR.$tterm_rmrks2);
				addColumnPathMap(MST_PO_RECV_IF_R.$tterm_rmrks3, DtlR.$tterm_rmrks3);
				addColumnPathMap(MST_PO_RECV_IF_R.$trd_rmrks, DtlR.$trd_rmrks);
				addColumnPathMap(MST_PO_RECV_IF_R.$intr_rmrks, DtlR.$intr_rmrks);
				addColumnPathMap(MST_PO_RECV_IF_R.$po_print_rmrks, DtlR.$po_print_rmrks);
				addColumnPathMap(MST_PO_RECV_IF_R.$dlv_slip_rmrks, DtlR.$dlv_slip_rmrks);
				addColumnPathMap(MST_PO_RECV_IF_R.$edi_sub_char1, DtlR.$edi_sub_char1);
				addColumnPathMap(MST_PO_RECV_IF_R.$edi_sub_char2, DtlR.$edi_sub_char2);
				addColumnPathMap(MST_PO_RECV_IF_R.$edi_sub_char3, DtlR.$edi_sub_char3);
				addColumnPathMap(MST_PO_RECV_IF_R.$edi_sub_char4, DtlR.$edi_sub_char4);
				addColumnPathMap(MST_PO_RECV_IF_R.$edi_sub_char5, DtlR.$edi_sub_char5);
				addColumnPathMap(MST_PO_RECV_IF_R.$edi_sub_num1, DtlR.$edi_sub_num1);
				addColumnPathMap(MST_PO_RECV_IF_R.$edi_sub_dt1, DtlR.$edi_sub_dt1);
				addColumnPathMap(MST_PO_RECV_IF_R.$itm_nm, DtlR.$itm_nm);
				addColumnPathMap(MST_PO_RECV_IF_R.$iv_itm_nm, DtlR.$iv_itm_nm);
				addColumnPathMap(MST_PO_RECV_IF_R.$ver_no, DtlR.$ver_no);
				addColumnPathMap(MST_PO_RECV_IF_R.$sno1, DtlR.$sno1);
				addColumnPathMap(MST_PO_RECV_IF_R.$sno2, DtlR.$sno2);
				addColumnPathMap(MST_PO_RECV_IF_R.$sno3, DtlR.$sno3);
				addColumnPathMap(MST_PO_RECV_IF_R.$sno4, DtlR.$sno4);
				addColumnPathMap(MST_PO_RECV_IF_R.$purc_id_typ, DtlR.$purc_id_typ);
				addColumnPathMap(MST_PO_RECV_IF_R.$sppl_itm_cd, DtlR.$sppl_itm_cd);
				addColumnPathMap(MST_PO_RECV_IF_R.$sppl_itm_nm, DtlR.$sppl_itm_nm);
				addColumnPathMap(MST_PO_RECV_IF_R.$bp_lot_no, DtlR.$bp_lot_no);
				addColumnPathMap(MST_PO_RECV_IF_R.$bom_ptn, DtlR.$bom_ptn);
				addColumnPathMap(MST_PO_RECV_IF_R.$rqst_avl_rqst_dt, DtlR.$rqst_avl_rqst_dt);
				addColumnPathMap(MST_PO_RECV_IF_R.$purc_schd_dt, DtlR.$purc_schd_dt);
				addColumnPathMap(MST_PO_RECV_IF_R.$sync_flg, DtlR.$sync_flg);
				addColumnPathMap(MST_PO_RECV_IF_R.$purc_upri_req_typ, DtlR.$purc_upri_req_typ);
				addColumnPathMap(MST_PO_RECV_IF_R.$upri_not_tgt_flg, DtlR.$upri_not_tgt_flg);
				addColumnPathMap(MST_PO_RECV_IF_R.$trd_unit_qty, DtlR.$trd_unit_qty);
				addColumnPathMap(MST_PO_RECV_IF_R.$trd_cur_upri, DtlR.$trd_cur_upri);
				addColumnPathMap(MST_PO_RECV_IF_R.$interim_flg, DtlR.$interim_flg);
				addColumnPathMap(MST_PO_RECV_IF_R.$tax_fix_flg, DtlR.$tax_fix_flg);
				addColumnPathMap(MST_PO_RECV_IF_R.$trd_cur_dscnt_amt, DtlR.$trd_cur_dscnt_amt);
				addColumnPathMap(MST_PO_RECV_IF_R.$trd_cur_proc_upri, DtlR.$trd_cur_proc_upri);
				addColumnPathMap(MST_PO_RECV_IF_R.$trd_cur_onr_prov_upri, DtlR.$trd_cur_onr_prov_upri);
				addColumnPathMap(MST_PO_RECV_IF_R.$wtax_rate, DtlR.$wtax_rate);
				addColumnPathMap(MST_PO_RECV_IF_R.$pri_print_flg, DtlR.$pri_print_flg);
				addColumnPathMap(MST_PO_RECV_IF_R.$po_conf_rcpt_flg, DtlR.$po_conf_rcpt_flg);
				addColumnPathMap(MST_PO_RECV_IF_R.$po_conf_rcpt_dt, DtlR.$po_conf_rcpt_dt);
				addColumnPathMap(MST_PO_RECV_IF_R.$pay_crryovr_times, DtlR.$pay_crryovr_times);
				addColumnPathMap(MST_PO_RECV_IF_R.$bd_sno1, DtlR.$bd_sno1);
				addColumnPathMap(MST_PO_RECV_IF_R.$bd_sno2, DtlR.$bd_sno2);
				addColumnPathMap(MST_PO_RECV_IF_R.$bd_sno3, DtlR.$bd_sno3);
				addColumnPathMap(MST_PO_RECV_IF_R.$bd_sno4, DtlR.$bd_sno4);
				addColumnPathMap(MST_PO_RECV_IF_R.$bd_lot_no, DtlR.$bd_lot_no);
				addColumnPathMap(MST_PO_RECV_IF_R.$bd_sublot_no, DtlR.$bd_sublot_no);
				addColumnPathMap(MST_PO_RECV_IF_R.$bd_slo_no, DtlR.$bd_slo_no);
				addColumnPathMap(MST_PO_RECV_IF_R.$bd_iv_no, DtlR.$bd_iv_no);
				addColumnPathMap(MST_PO_RECV_IF_R.$bd_po_no, DtlR.$bd_po_no);
				addColumnPathMap(MST_PO_RECV_IF_R.$trd_d_rmrks, DtlR.$trd_d_rmrks);
				addColumnPathMap(MST_PO_RECV_IF_R.$intr_d_rmrks, DtlR.$intr_d_rmrks);
				addColumnPathMap(MST_PO_RECV_IF_R.$po_print_d_rmrks, DtlR.$po_print_d_rmrks);
				addColumnPathMap(MST_PO_RECV_IF_R.$arr_cnt_rmrks, DtlR.$arr_cnt_rmrks);
				addColumnPathMap(MST_PO_RECV_IF_R.$dlv_slip_d_rmrks, DtlR.$dlv_slip_d_rmrks);
				addColumnPathMap(MST_PO_RECV_IF_R.$edi_sub_d_char1, DtlR.$edi_sub_d_char1);
				addColumnPathMap(MST_PO_RECV_IF_R.$edi_sub_d_char2, DtlR.$edi_sub_d_char2);
				addColumnPathMap(MST_PO_RECV_IF_R.$edi_sub_d_char3, DtlR.$edi_sub_d_char3);
				addColumnPathMap(MST_PO_RECV_IF_R.$edi_sub_d_char4, DtlR.$edi_sub_d_char4);
				addColumnPathMap(MST_PO_RECV_IF_R.$edi_sub_d_char5, DtlR.$edi_sub_d_char5);
				addColumnPathMap(MST_PO_RECV_IF_R.$edi_sub_d_num1, DtlR.$edi_sub_d_num1);
				addColumnPathMap(MST_PO_RECV_IF_R.$edi_sub_d_dt1, DtlR.$edi_sub_d_dt1);
				addColumnPathMap(MST_PO_RECV_IF_R.$sub_char1, DtlR.$sub_char1);
				addColumnPathMap(MST_PO_RECV_IF_R.$sub_char2, DtlR.$sub_char2);
				addColumnPathMap(MST_PO_RECV_IF_R.$sub_char3, DtlR.$sub_char3);
				addColumnPathMap(MST_PO_RECV_IF_R.$sub_char4, DtlR.$sub_char4);
				addColumnPathMap(MST_PO_RECV_IF_R.$sub_char5, DtlR.$sub_char5);
				addColumnPathMap(MST_PO_RECV_IF_R.$sub_char6, DtlR.$sub_char6);
				addColumnPathMap(MST_PO_RECV_IF_R.$sub_char7, DtlR.$sub_char7);
				addColumnPathMap(MST_PO_RECV_IF_R.$sub_char8, DtlR.$sub_char8);
				addColumnPathMap(MST_PO_RECV_IF_R.$sub_char9, DtlR.$sub_char9);
				addColumnPathMap(MST_PO_RECV_IF_R.$sub_char10, DtlR.$sub_char10);
				addColumnPathMap(MST_PO_RECV_IF_R.$sub_char11, DtlR.$sub_char11);
				addColumnPathMap(MST_PO_RECV_IF_R.$sub_char12, DtlR.$sub_char12);
				addColumnPathMap(MST_PO_RECV_IF_R.$sub_char13, DtlR.$sub_char13);
				addColumnPathMap(MST_PO_RECV_IF_R.$sub_char14, DtlR.$sub_char14);
				addColumnPathMap(MST_PO_RECV_IF_R.$sub_char15, DtlR.$sub_char15);
				addColumnPathMap(MST_PO_RECV_IF_R.$sub_char16, DtlR.$sub_char16);
				addColumnPathMap(MST_PO_RECV_IF_R.$sub_char17, DtlR.$sub_char17);
				addColumnPathMap(MST_PO_RECV_IF_R.$sub_char18, DtlR.$sub_char18);
				addColumnPathMap(MST_PO_RECV_IF_R.$sub_char19, DtlR.$sub_char19);
				addColumnPathMap(MST_PO_RECV_IF_R.$sub_char20, DtlR.$sub_char20);
				addColumnPathMap(MST_PO_RECV_IF_R.$sub_char21, DtlR.$sub_char21);
				addColumnPathMap(MST_PO_RECV_IF_R.$sub_char22, DtlR.$sub_char22);
				addColumnPathMap(MST_PO_RECV_IF_R.$sub_char23, DtlR.$sub_char23);
				addColumnPathMap(MST_PO_RECV_IF_R.$sub_char24, DtlR.$sub_char24);
				addColumnPathMap(MST_PO_RECV_IF_R.$sub_char25, DtlR.$sub_char25);
				addColumnPathMap(MST_PO_RECV_IF_R.$sub_char26, DtlR.$sub_char26);
				addColumnPathMap(MST_PO_RECV_IF_R.$sub_char27, DtlR.$sub_char27);
				addColumnPathMap(MST_PO_RECV_IF_R.$sub_char28, DtlR.$sub_char28);
				addColumnPathMap(MST_PO_RECV_IF_R.$sub_char29, DtlR.$sub_char29);
				addColumnPathMap(MST_PO_RECV_IF_R.$sub_char30, DtlR.$sub_char30);
				addColumnPathMap(MST_PO_RECV_IF_R.$sub_num1, DtlR.$sub_num1);
				addColumnPathMap(MST_PO_RECV_IF_R.$sub_num2, DtlR.$sub_num2);
				addColumnPathMap(MST_PO_RECV_IF_R.$sub_num3, DtlR.$sub_num3);
				addColumnPathMap(MST_PO_RECV_IF_R.$sub_num4, DtlR.$sub_num4);
				addColumnPathMap(MST_PO_RECV_IF_R.$sub_num5, DtlR.$sub_num5);
				addColumnPathMap(MST_PO_RECV_IF_R.$sub_dt1, DtlR.$sub_dt1);
				addColumnPathMap(MST_PO_RECV_IF_R.$sub_dt2, DtlR.$sub_dt2);
				addColumnPathMap(MST_PO_RECV_IF_R.$sub_dt3, DtlR.$sub_dt3);
				addColumnPathMap(MST_PO_RECV_IF_R.$sub_dt4, DtlR.$sub_dt4);
				addColumnPathMap(MST_PO_RECV_IF_R.$sub_dt5, DtlR.$sub_dt5);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_lno(getSequence(MSC_NUM_SYS_TYP.PORECVIF.value()));
				dest.data_no(_ifR.data_no());
				dest.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
				dest.ext_sys_cd(_ifR.ext_sys_cd());
				dest.ext_data_lno(src.data_lno());
				dest.ext_data_no(src.data_no());
				dest.imp_flg(true);
				dest.recv_dt(getToday());
				dest.if_trd_cd(src.trd_cd());
				dest.if_trd_nm(src.trd_nm());
				dest.if_sppl_cd(src.sppl_cd());
				dest.if_sppl_nm(src.sppl_nm());
				dest.if_purc_dpt_cd(src.purc_dpt_cd());
				dest.if_purc_dpt_nm(src.purc_dpt_nm());
				dest.if_purc_usr_cd(src.purc_usr_cd());
				dest.if_purc_usr_nm(src.purc_usr_nm());
				dest.if_trd_cur_cd(src.trd_cur_cd());
				dest.if_trd_cur_nm(src.trd_cur_nm());
				dest.if_po_print_cd(src.po_print_cd());
				dest.if_po_print_nm(src.po_print_nm());
				dest.if_crct_rsn_cd(src.crct_rsn_cd());
				dest.if_crct_rsn_nm(src.crct_rsn_nm());
				dest.if_tterm_cd1(src.tterm_cd1());
				dest.if_tterm_nm1(src.tterm_nm1());
				dest.if_tterm_cd2(src.tterm_cd2());
				dest.if_tterm_nm2(src.tterm_nm2());
				dest.if_tterm_cd3(src.tterm_cd3());
				dest.if_tterm_nm3(src.tterm_nm3());
				dest.if_itm_cd(src.itm_cd());
				dest.if_itm_sub1(src.itm_sub1());
				dest.if_itm_sub2(src.itm_sub2());
				dest.if_itm_sub3(src.itm_sub3());
				dest.if_itm_nm(src.itm_nm());
				dest.if_maker_cd(src.maker_cd());
				dest.if_maker_nm(src.maker_nm());
				dest.if_in_to_loc_cd(src.in_to_loc_cd());
				dest.if_in_to_loc_nm(src.in_to_loc_nm());
				dest.if_str_ln_cd(src.str_ln_cd());
				dest.if_str_ln_nm(src.str_ln_nm());
				dest.if_mfg_loc_cd(src.mfg_loc_cd());
				dest.if_mfg_loc_nm(src.mfg_loc_nm());
				dest.dlv_rqst_tm(getYmdHm(src.dlv_rqst_dt(), src.dlv_rqst_hm()));
				dest.if_trd_unit_cd(src.trd_unit_cd());
				dest.if_trd_unit_nm(src.trd_unit_nm());
				dest.if_tax_cd(src.tax_cd());
				dest.if_tax_nm(src.tax_nm());
				dest.if_dscnt_rsn_cd(src.dscnt_rsn_cd());
				dest.if_dscnt_rsn_nm(src.dscnt_rsn_nm());
				dest.if_purc_rsn_cd(src.purc_rsn_cd());
				dest.if_purc_rsn_nm(src.purc_rsn_nm());
				dest.if_ap_dpt_cd(src.ap_dpt_cd());
				dest.if_ap_dpt_nm(src.ap_dpt_nm());
				dest.if_bd_dpt_cd(src.bd_dpt_cd());
				dest.if_bd_dpt_nm(src.bd_dpt_nm());
				dest.if_bd_itm_cd(src.bd_itm_cd());
				dest.if_bd_itm_sub1(src.bd_itm_sub1());
				dest.if_bd_itm_sub2(src.bd_itm_sub2());
				dest.if_bd_itm_sub3(src.bd_itm_sub3());
				dest.if_bd_itm_nm(src.bd_itm_nm());
				dest.if_bd_loc_cd(src.bd_loc_cd());
				dest.if_bd_loc_nm(src.bd_loc_nm());
				dest.if_bd_ctg_cd(src.bd_ctg_cd());
				dest.if_bd_ctg_nm(src.bd_ctg_nm());
				dest.if_bd_oper_cd(src.bd_oper_cd());
				dest.if_bd_oper_nm(src.bd_oper_nm());
				dest.if_co_cd(src.co_cd());
				dest.if_co_nm(src.co_nm());
			}
		}

	}

	//FMCB CUSTOM END
}