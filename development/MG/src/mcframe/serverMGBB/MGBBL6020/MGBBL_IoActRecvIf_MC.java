package mcframe.serverMGBB.MGBBL6020;

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
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import static mcframe.serverMGUC.MGUCL0020.MGUCL_AppSys.*;
import mcframe.commonMG.constant.*;
import mcframe.serverMG.dbc.*;
import static mcframe.commonMG.notice.MG_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMG.dbc.MGFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverPF.dbc.*;
import mcframe.serverPFBZ.PFBZL9030.*;
import mcframe.commonMGBB.MGBBR6020.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBBL_IoActRecvIf"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBBL_IoActRecvIf_MC extends MGBBL_IoActRecvIf_MC_A{
	//FMCB CUSTOM START

	/**
	 * IoActIf_Conv01オペレーション.<p>
	 *
	 */
	public class IoActIf_Conv01 extends MGBBL_IoActRecvIf_MC_A.IoActIf_Conv01 {
		@Override
		protected void call() {
			super.call();
		}

		/**
		 * 送受信IFのレポートセットのインスタンスを生成します
		 * 
		 */
		@Override
		@SuppressWarnings("unchecked")
		protected void crtRptSet() {
			_IfRptSet = PFBZL_FileInput.createIfRecvReportSet(DtlR.class,
					MGT_IO_ACT_RCV_R.class);
			_IfRptSet.setReportSet(MGBBR_IoActPrnt.create());
			_IfRptSet.setRowMapper(new MGT_IO_ACT_RCV_R_DtlR());
			_IfRptSet.setReqColumns(_reqColumns);
		}

		/**
		 * 必須項目のカラムを指定します。
		 */
		protected String[] _reqColumns = {
				DtlR.$calc_ctg_cd, 
				DtlR.$wg_cd, 
				DtlR.$ym, 
				DtlR.$ac_dt, 
				DtlR.$mng_dpt_cd, 
				DtlR.$itm_cd, 
				DtlR.$itm_sub1,
				DtlR.$itm_sub2,
				DtlR.$itm_sub3,
				DtlR.$cost_io_act_typ,
				DtlR.$lot_no,
				DtlR.$sublot_no,
				DtlR.$sno1,
				DtlR.$sno2,
				DtlR.$sno3,
				DtlR.$sno4,
				DtlR.$asst_typ,
				DtlR.$qty,
				DtlR.$alc_amt_flg,
				DtlR.$no_pln_flg,
				DtlR.$no_itm_info_flg,
				DtlR.$no_eval_flg,
				DtlR.$zero_effect_flg
		};

		public class MGT_IO_ACT_RCV_R_DtlR<D extends MGT_IO_ACT_RCV_R, S extends DtlR, W extends PFT_SDRV_IF_R>
				extends MAUCC_RowMapperWith<D, S, W> {

			protected W _ifR;

			@Override
			public void setWith(W ifR) {
				this._ifR = ifR;
			}

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MGT_IO_ACT_RCV_R.$ext_data_no, DtlR.$ext_data_no);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$ext_data_lno, DtlR.$ext_data_lno);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$data_make_dt, DtlR.$data_make_dt);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$calc_ctg_cd, DtlR.$calc_ctg_cd);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$wg_cd, DtlR.$wg_cd);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$ym, DtlR.$ym);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$ac_dt, DtlR.$ac_dt);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$mng_dpt_cd, DtlR.$mng_dpt_cd);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$sls_dpt_cd, DtlR.$sls_dpt_cd);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$itm_cd, DtlR.$itm_cd);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$itm_sub1, DtlR.$itm_sub1);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$itm_sub2, DtlR.$itm_sub2);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$itm_sub3, DtlR.$itm_sub3);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$cost_io_act_typ, DtlR.$cost_io_act_typ);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$itm_mfg_inst_no, DtlR.$itm_mfg_inst_no);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$mfg_act_no, DtlR.$mfg_act_no);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$oper_act_no, DtlR.$oper_act_no);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$lot_no, DtlR.$lot_no);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$sublot_no, DtlR.$sublot_no);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$sno1, DtlR.$sno1);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$sno2, DtlR.$sno2);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$sno3, DtlR.$sno3);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$sno4, DtlR.$sno4);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$loc_cd, DtlR.$loc_cd);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$str_ln_cd, DtlR.$str_ln_cd);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$oper_cd, DtlR.$oper_cd);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$oper_seq, DtlR.$oper_seq);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$disp_seq, DtlR.$disp_seq);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$po_no, DtlR.$po_no);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$slo_no, DtlR.$slo_no);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$iv_no, DtlR.$iv_no);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$asst_typ, DtlR.$asst_typ);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$ac_slip_typ, DtlR.$ac_slip_typ);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$ac_rsn_cd, DtlR.$ac_rsn_cd);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$qty, DtlR.$qty);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$amt, DtlR.$amt);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$trd_cur_cd, DtlR.$trd_cur_cd);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$trd_cur_amt, DtlR.$trd_cur_amt);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$xrate, DtlR.$xrate);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$sppl_cd, DtlR.$sppl_cd);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$cst_cd, DtlR.$cst_cd);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$dlv_cd, DtlR.$dlv_cd);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$dest_cd1, DtlR.$dest_cd1);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$dest_cd2, DtlR.$dest_cd2);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$dest_cd3, DtlR.$dest_cd3);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$stk_bp_cd, DtlR.$stk_bp_cd);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$usr_cd, DtlR.$usr_cd);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$mfg_per, DtlR.$mfg_per);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$mfg_cost_ratio, DtlR.$mfg_cost_ratio);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$trd_grp, DtlR.$trd_grp);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$trd_ratio, DtlR.$trd_ratio);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$alc_ac_cd, DtlR.$alc_ac_cd);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$alc_amt_flg, DtlR.$alc_amt_flg);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$bd_wg_cd, DtlR.$bd_wg_cd);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$bd_dpt_cd, DtlR.$bd_dpt_cd);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$bd_loc_cd, DtlR.$bd_loc_cd);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$bd_oper_cd, DtlR.$bd_oper_cd);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$bd_bp_cd, DtlR.$bd_bp_cd);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$bd_ctg_cd, DtlR.$bd_ctg_cd);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$bd_lot_no, DtlR.$bd_lot_no);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$bd_sublot_no, DtlR.$bd_sublot_no);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$bd_sno1, DtlR.$bd_sno1);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$bd_sno2, DtlR.$bd_sno2);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$bd_sno3, DtlR.$bd_sno3);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$bd_sno4, DtlR.$bd_sno4);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$bd_itm_cd, DtlR.$bd_itm_cd);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$bd_itm_sub1, DtlR.$bd_itm_sub1);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$bd_itm_sub2, DtlR.$bd_itm_sub2);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$bd_itm_sub3, DtlR.$bd_itm_sub3);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$cost_sls_cd1, DtlR.$cost_sls_cd1);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$cost_sls_cd2, DtlR.$cost_sls_cd2);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$cost_sls_cd3, DtlR.$cost_sls_cd3);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$cost_sls_cd4, DtlR.$cost_sls_cd4);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$cost_sls_cd5, DtlR.$cost_sls_cd5);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$alc_val1, DtlR.$alc_val1);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$alc_val2, DtlR.$alc_val2);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$alc_val3, DtlR.$alc_val3);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$alc_val4, DtlR.$alc_val4);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$alc_val5, DtlR.$alc_val5);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$rec_eval_typ, DtlR.$rec_eval_typ);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$expns_cd, DtlR.$expns_cd);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$mfg_act_grp, DtlR.$mfg_act_grp);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$bom_ptn, DtlR.$bom_ptn);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$oper_ptn, DtlR.$oper_ptn);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$no_pln_flg, DtlR.$no_pln_flg);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$no_itm_info_flg, DtlR.$no_itm_info_flg);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$no_eval_flg, DtlR.$no_eval_flg);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$zero_effect_flg, DtlR.$zero_effect_flg);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$slip_no, DtlR.$slip_no);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$slip_seq_no, DtlR.$slip_seq_no);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$if_sub_char1, DtlR.$if_sub_char1);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$if_sub_char2, DtlR.$if_sub_char2);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$if_sub_char3, DtlR.$if_sub_char3);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$if_sub_char4, DtlR.$if_sub_char4);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$if_sub_char5, DtlR.$if_sub_char5);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$if_sub_char6, DtlR.$if_sub_char6);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$if_sub_char7, DtlR.$if_sub_char7);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$if_sub_char8, DtlR.$if_sub_char8);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$if_sub_char9, DtlR.$if_sub_char9);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$if_sub_char10, DtlR.$if_sub_char10);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$if_sub_char11, DtlR.$if_sub_char11);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$if_sub_char12, DtlR.$if_sub_char12);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$if_sub_char13, DtlR.$if_sub_char13);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$if_sub_char14, DtlR.$if_sub_char14);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$if_sub_char15, DtlR.$if_sub_char15);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$if_sub_char16, DtlR.$if_sub_char16);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$if_sub_char17, DtlR.$if_sub_char17);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$if_sub_char18, DtlR.$if_sub_char18);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$if_sub_char19, DtlR.$if_sub_char19);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$if_sub_char20, DtlR.$if_sub_char20);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$if_sub_char21, DtlR.$if_sub_char21);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$if_sub_char22, DtlR.$if_sub_char22);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$if_sub_char23, DtlR.$if_sub_char23);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$if_sub_char24, DtlR.$if_sub_char24);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$if_sub_char25, DtlR.$if_sub_char25);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$if_sub_char26, DtlR.$if_sub_char26);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$if_sub_char27, DtlR.$if_sub_char27);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$if_sub_char28, DtlR.$if_sub_char28);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$if_sub_char29, DtlR.$if_sub_char29);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$if_sub_char30, DtlR.$if_sub_char30);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$if_sub_num1, DtlR.$if_sub_num1);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$if_sub_num2, DtlR.$if_sub_num2);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$if_sub_num3, DtlR.$if_sub_num3);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$if_sub_num4, DtlR.$if_sub_num4);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$if_sub_num5, DtlR.$if_sub_num5);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$if_sub_dt1, DtlR.$if_sub_dt1);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$if_sub_dt2, DtlR.$if_sub_dt2);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$if_sub_dt3, DtlR.$if_sub_dt3);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$if_sub_dt4, DtlR.$if_sub_dt4);
				addColumnPathMap(MGT_IO_ACT_RCV_R.$if_sub_dt5, DtlR.$if_sub_dt5);
			}
			
			@Override
			public void valueCopy(D dest, S src) {
				dest.data_lno(getSequence(MGC_NUM_SYS_TYP.IO_ACT_RCV_DATA_LNO.value()));

				dest.data_no(_ifR.data_no());
				dest.ext_sys_cd(_ifR.ext_sys_cd());
				dest.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
				dest.imp_flg(true);
			}
		}
	}

	//FMCB CUSTOM END
}