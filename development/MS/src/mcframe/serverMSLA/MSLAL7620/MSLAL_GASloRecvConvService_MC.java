package mcframe.serverMSLA.MSLAL7620;

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
import mcframe.commonMSLA.MSLAR0020.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverPFBZ.PFBZL9010.PFBZL_CodeConvert;
import mcframe.serverPFBZ.PFBZL9030.PFBZL_FileInput;
import mcframe.serverPF.dbc.PFT_SDRV_IF_R;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
import mcframe.serverFXBA.FXBAL0120.*;
import mcframe.serverFXUC.FXUCL0030.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_GASloRecvConvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_GASloRecvConvService_MC extends MSLAL_GASloRecvConvService_MC_A{
	//FMCB CUSTOM START
	
	/**
	 * GASloRecvConv_Conv01オペレーション.<p>
	 *
	 */
	public class GASloRecvConv_Conv01 extends MSLAL_GASloRecvConvService_MC_A.GASloRecvConv_Conv01 {
		
		/** 受注受信ＩＦ */
		protected MCList<MST_SLO_RECV_IF_R> _sloRecvIfL;
		
		/** バッチログ */
		protected MCList<BatchLogMsgR> _batchLogMsgL;
		protected MCIndexKey _batchLogMsgIdx;
		
		@Override
		protected void call() {
			editUp();
			super.call();
			getSloRecvIf();
			getBatchLogMsg();
			setDown();
		}
		
		protected void editUp() {
			up0().forEach(row -> {
				PFT_SDRV_IF_R sdrvIf = row.sdrvIf();
				if (isNull(sdrvIf.if_proc_typ())) sdrvIf.if_proc_typ(MAC_IF_PROC_TYP.SLO_RECV.value());
			});
		}
		
		/**
		 * 受注受信ＩＦから、バッチログＮＯを取得する
		 */
		protected void getSloRecvIf() {
			_sloRecvIfL = MCList.create(MST_SLO_RECV_IF_R.class);
			MST_SLO_RECV_IF_R t = MST_SLO_RECV_IF_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
			builder.setWhere(t.data_no.eq(bind("data_no")));
			builder.setOrderByAsc(t.data_no, t.data_lno);
			dbSelect("MSLAL7620_MST_SLO_RECV_IF_S01", _sloRecvIfL, builder, down0());
		}
		
		/**
		 * バッチログＮＯから、バッチログを取得する
		 */
		protected void getBatchLogMsg() {
			BatchLog_FW.Srch01 logSrch = BatchLog.crtSrch01();
			addAll(logSrch.up0(), _sloRecvIfL, createMap_CndR_MST_SLO_RECV_IF_R());
			logSrch.exec();
			
			_batchLogMsgL = MCList.create(BatchLogMsgR.class);
			_batchLogMsgL.addAll(logSrch.down1().subList(BatchLogMsgR.$batch_log_typ, MAC_BATCH_LOG_TYP.DATA_LOG.value()));
			_batchLogMsgIdx = _batchLogMsgL.createIndex(BatchLogMsgR.$batch_log_no, BatchLogMsgR.$log_sub_key1, BatchLogMsgR.$log_sub_key2);
		}
		
		protected void setDown() {
			for (MST_SLO_RECV_IF_R sloRecvIfR : _sloRecvIfL) {
				MCList<BatchLogMsgR> batchLogMsgL = _batchLogMsgL.subList(_batchLogMsgIdx, sloRecvIfR.batch_log_no(), sloRecvIfR.log_sub_key1(), sloRecvIfR.log_sub_key2());
				if (batchLogMsgL != null && !batchLogMsgL.isEmpty()) {
					addAll(down1(), batchLogMsgL, sloRecvIfR, createMap_RsltR_BatchLogMsgR());
				}
				else {
					RsltR downR = RsltR.create();
					downR.data_lno(sloRecvIfR.ext_data_lno());
					downR.data_no(sloRecvIfR.ext_data_no());
					downR.err_flg(MAC_EXE_STS_TYP.isERR(sloRecvIfR.exe_sts_typ()));
					downR.po_no(sloRecvIfR.cst_po_no());
					downR.po_rev(sloRecvIfR.cst_po_rev());
					downR.po_d_no(sloRecvIfR.cst_po_d_no());
					
					down1().add(downR);
				}
			}
		}
		
		@Override
		@SuppressWarnings({
			"unchecked", "rawtypes"
		})
		protected void crtRptSet() {
			_IfRptSet = PFBZL_FileInput.createIfRecvReportSet(DtlR.class, MST_SLO_RECV_IF_R.class);
			_IfRptSet.setReportSet(MSLAR_SloPoPrnt.create());
			_IfRptSet.setRowMapper(new Map_MST_SLO_RECV_IF_R_DtlR());
		}
		
		@Override
		protected void setRptSetData() {
			_IfRptSet.getReportSet().addAll(up1());
		}
	}
	
	public class Map_MST_SLO_RECV_IF_R_DtlR<D extends MST_SLO_RECV_IF_R, S extends DtlR, W extends PFT_SDRV_IF_R> extends MAUCC_RowMapperWith<D, S, W> {
		protected W _ifR;
		
		@Override
		public void setWith(W ifR) {
			this._ifR = ifR;
		}
		
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_SLO_RECV_IF_R.$data_crud_typ, DtlR.$data_crud_typ);
			addColumnPathMap(MST_SLO_RECV_IF_R.$data_make_dt, DtlR.$data_make_dt);
			addColumnPathMap(MST_SLO_RECV_IF_R.$po_dt, DtlR.$po_dt);
			addColumnPathMap(MST_SLO_RECV_IF_R.$purc_id_typ, DtlR.$purc_id_typ);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sls_cststk_flg, DtlR.$sls_cststk_flg);
			addColumnPathMap(MST_SLO_RECV_IF_R.$slo_typ, DtlR.$slo_typ);
			addColumnPathMap(MST_SLO_RECV_IF_R.$tdlv_nm, DtlR.$tdlv_nm);
			addColumnPathMap(MST_SLO_RECV_IF_R.$tdlv_cntct_dpt, DtlR.$tdlv_cntct_dpt);
			addColumnPathMap(MST_SLO_RECV_IF_R.$tdlv_cntct_psn, DtlR.$tdlv_cntct_psn);
			addColumnPathMap(MST_SLO_RECV_IF_R.$tdlv_zip_cd, DtlR.$tdlv_zip_cd);
			addColumnPathMap(MST_SLO_RECV_IF_R.$tdlv_addr1, DtlR.$tdlv_addr1);
			addColumnPathMap(MST_SLO_RECV_IF_R.$tdlv_addr2, DtlR.$tdlv_addr2);
			addColumnPathMap(MST_SLO_RECV_IF_R.$tdlv_addr3, DtlR.$tdlv_addr3);
			addColumnPathMap(MST_SLO_RECV_IF_R.$tdlv_addr4, DtlR.$tdlv_addr4);
			addColumnPathMap(MST_SLO_RECV_IF_R.$tdlv_tel, DtlR.$tdlv_tel);
			addColumnPathMap(MST_SLO_RECV_IF_R.$tdlv_fax, DtlR.$tdlv_fax);
			addColumnPathMap(MST_SLO_RECV_IF_R.$dlv_day_week_typ, DtlR.$dlv_day_week_typ);
			addColumnPathMap(MST_SLO_RECV_IF_R.$pri_prnt_typ, DtlR.$pri_prnt_typ);
			addColumnPathMap(MST_SLO_RECV_IF_R.$tterm_rmrks1, DtlR.$tterm_rmrks1);
			addColumnPathMap(MST_SLO_RECV_IF_R.$tterm_rmrks2, DtlR.$tterm_rmrks2);
			addColumnPathMap(MST_SLO_RECV_IF_R.$tterm_rmrks3, DtlR.$tterm_rmrks3);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sno1, DtlR.$sno1);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sno2, DtlR.$sno2);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sno3, DtlR.$sno3);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sno4, DtlR.$sno4);
			addColumnPathMap(MST_SLO_RECV_IF_R.$trd_unit_qty, DtlR.$trd_unit_qty);
			addColumnPathMap(MST_SLO_RECV_IF_R.$inc_tax_flg, DtlR.$inc_tax_flg);
			addColumnPathMap(MST_SLO_RECV_IF_R.$interim_flg, DtlR.$interim_flg);
			addColumnPathMap(MST_SLO_RECV_IF_R.$trd_cur_upri, DtlR.$trd_cur_upri);
			addColumnPathMap(MST_SLO_RECV_IF_R.$trd_cur_amt, DtlR.$trd_cur_amt);
			addColumnPathMap(MST_SLO_RECV_IF_R.$tax_fix_flg, DtlR.$tax_fix_flg);
			addColumnPathMap(MST_SLO_RECV_IF_R.$tax_rate, DtlR.$tax_rate);
			addColumnPathMap(MST_SLO_RECV_IF_R.$tax_typ, DtlR.$tax_typ);
			addColumnPathMap(MST_SLO_RECV_IF_R.$trd_cur_tax_amt, DtlR.$trd_cur_tax_amt);
			addColumnPathMap(MST_SLO_RECV_IF_R.$trd_cur_dscnt_amt, DtlR.$trd_cur_dscnt_amt);
			addColumnPathMap(MST_SLO_RECV_IF_R.$ship_block_flg, DtlR.$ship_block_flg);
			addColumnPathMap(MST_SLO_RECV_IF_R.$abort_flg, DtlR.$abort_flg);
			addColumnPathMap(MST_SLO_RECV_IF_R.$set_itm_grp_no, DtlR.$set_itm_grp_no);
			addColumnPathMap(MST_SLO_RECV_IF_R.$ver_no, DtlR.$ver_no);
			addColumnPathMap(MST_SLO_RECV_IF_R.$lot_no, DtlR.$lot_no);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sublot_no, DtlR.$sublot_no);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char1, DtlR.$sub_char1);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char2, DtlR.$sub_char2);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char3, DtlR.$sub_char3);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char4, DtlR.$sub_char4);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char5, DtlR.$sub_char5);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char6, DtlR.$sub_char6);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char7, DtlR.$sub_char7);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char8, DtlR.$sub_char8);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char9, DtlR.$sub_char9);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char10, DtlR.$sub_char10);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char11, DtlR.$sub_char11);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char12, DtlR.$sub_char12);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char13, DtlR.$sub_char13);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char14, DtlR.$sub_char14);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char15, DtlR.$sub_char15);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char16, DtlR.$sub_char16);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char17, DtlR.$sub_char17);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char18, DtlR.$sub_char18);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char19, DtlR.$sub_char19);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char20, DtlR.$sub_char20);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char21, DtlR.$sub_char21);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char22, DtlR.$sub_char22);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char23, DtlR.$sub_char23);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char24, DtlR.$sub_char24);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char25, DtlR.$sub_char25);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char26, DtlR.$sub_char26);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char27, DtlR.$sub_char27);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char28, DtlR.$sub_char28);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char29, DtlR.$sub_char29);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_char30, DtlR.$sub_char30);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_num1, DtlR.$sub_num1);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_num2, DtlR.$sub_num2);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_num3, DtlR.$sub_num3);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_num4, DtlR.$sub_num4);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_num5, DtlR.$sub_num5);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_dt1, DtlR.$sub_dt1);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_dt2, DtlR.$sub_dt2);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_dt3, DtlR.$sub_dt3);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_dt4, DtlR.$sub_dt4);
			addColumnPathMap(MST_SLO_RECV_IF_R.$sub_dt5, DtlR.$sub_dt5);
			addColumnPathMap(MST_SLO_RECV_IF_R.$edi_sub_char1, DtlR.$edi_sub_char1);
			addColumnPathMap(MST_SLO_RECV_IF_R.$edi_sub_char2, DtlR.$edi_sub_char2);
			addColumnPathMap(MST_SLO_RECV_IF_R.$edi_sub_char3, DtlR.$edi_sub_char3);
			addColumnPathMap(MST_SLO_RECV_IF_R.$edi_sub_char4, DtlR.$edi_sub_char4);
			addColumnPathMap(MST_SLO_RECV_IF_R.$edi_sub_char5, DtlR.$edi_sub_char5);
			addColumnPathMap(MST_SLO_RECV_IF_R.$edi_sub_num1, DtlR.$edi_sub_num1);
			addColumnPathMap(MST_SLO_RECV_IF_R.$edi_sub_dt1, DtlR.$edi_sub_dt1);
			addColumnPathMap(MST_SLO_RECV_IF_R.$edi_sub_d_char1, DtlR.$edi_sub_d_char1);
			addColumnPathMap(MST_SLO_RECV_IF_R.$edi_sub_d_char2, DtlR.$edi_sub_d_char2);
			addColumnPathMap(MST_SLO_RECV_IF_R.$edi_sub_d_char3, DtlR.$edi_sub_d_char3);
			addColumnPathMap(MST_SLO_RECV_IF_R.$edi_sub_d_char4, DtlR.$edi_sub_d_char4);
			addColumnPathMap(MST_SLO_RECV_IF_R.$edi_sub_d_char5, DtlR.$edi_sub_d_char5);
			addColumnPathMap(MST_SLO_RECV_IF_R.$edi_sub_d_num1, DtlR.$edi_sub_d_num1);
			addColumnPathMap(MST_SLO_RECV_IF_R.$edi_sub_d_dt1, DtlR.$edi_sub_d_dt1);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			dest.data_lno(getSequence(MSC_NUM_SYS_TYP.SLORECVIF.value()));
			dest.data_no(_ifR.data_no());
			dest.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
			dest.ext_sys_cd(_ifR.ext_sys_cd());
			dest.ext_data_no(src.data_no());
			dest.ext_data_lno(src.data_lno());
			dest.imp_flg(true);
			dest.recv_dt(getToday());
			dest.cst_po_no(src.po_no());
			dest.cst_po_rev(src.po_rev());
			dest.cst_po_d_no(src.po_d_no());
			dest.if_cst_cd(src.po_co_cd());
			dest.if_cst_nm(src.po_co_nm());
			dest.if_dest_cd1(src.dest_cd1());
			dest.if_dest_nm1(src.dest_nm1());
			dest.if_dest_cd2(src.dest_cd2());
			dest.if_dest_nm2(src.dest_nm2());
			dest.if_dest_cd3(src.dest_cd3());
			dest.if_dest_nm3(src.dest_nm3());
			dest.if_cur_cd(src.trd_cur_cd());
			dest.if_sls_dpt_cd(src.sls_dpt_cd());
			dest.if_sls_dpt_nm(src.sls_dpt_nm());
			dest.if_sls_usr_cd(src.sls_usr_cd());
			dest.if_sls_usr_nm(src.sls_usr_nm());
			dest.if_dlv_cd(src.in_to_id_cd());
			dest.dlv_nm(src.in_to_nm());
			dest.dlv_cntct_dpt(src.in_to_cntct_dpt());
			dest.dlv_cntct_psn(src.in_to_cntct_psn());
			dest.dlv_zip_cd(src.in_to_zip_cd());
			dest.dlv_addr1(src.in_to_addr1());
			dest.dlv_addr2(src.in_to_addr2());
			dest.dlv_addr3(src.in_to_addr3());
			dest.dlv_addr4(src.in_to_addr4());
			dest.dlv_tel(src.in_to_tel());
			dest.dlv_fax(src.in_to_fax());
			dest.if_dlv_cntry_cd(src.in_to_cntry_cd());
			dest.if_tdlv_cd(src.tdlv_cd());
			dest.if_tdlv_cntry_cd(src.tdlv_cntry_cd());
			dest.if_wrk_no(src.wrk_no());
			dest.if_wrk_nm(src.wrk_nm());
			dest.if_tterm_cd1(src.tterm_cd1());
			dest.if_tterm_nm1(src.tterm_nm1());
			dest.if_tterm_cd2(src.tterm_cd2());
			dest.if_tterm_nm2(src.tterm_nm2());
			dest.if_tterm_cd3(src.tterm_cd3());
			dest.if_tterm_nm3(src.tterm_nm3());
			dest.if_trnspt_cd(src.trnspt_cd());
			dest.if_trnspt_nm(src.trnspt_nm());
			dest.if_load_port_cd(src.load_port_cd());
			dest.if_load_port_nm(src.load_port_nm());
			dest.if_dschrg_port_cd(src.dschrg_port_cd());
			dest.if_dschrg_port_nm(src.dschrg_port_nm());
			dest.if_via_port_cd(src.via_port_cd());
			dest.if_via_port_nm(src.via_port_nm());
			dest.cst_itm_cd(src.po_co_itm_cd());
			dest.cst_itm_nm(src.po_co_itm_nm());
			dest.itm_nm(nvl(src.slo_co_itm_nm(), src.po_co_itm_nm()));
			dest.if_itm_cd(nvl(src.slo_co_itm_cd(), src.po_co_itm_cd()));
			dest.if_itm_sub1(nvl(src.slo_co_itm_sub1(), src.po_co_itm_sub1()));
			dest.if_itm_sub2(nvl(src.slo_co_itm_sub2(), src.po_co_itm_sub2()));
			dest.if_itm_sub3(nvl(src.slo_co_itm_sub3(), src.po_co_itm_sub3()));
			dest.if_itm_nm(src.po_co_itm_nm());
			dest.if_cntry_org_cd(src.cntry_org_cd());
			dest.if_gd_cd(src.gd_cd());
			dest.if_gd_nm(src.gd_nm());
			dest.if_trd_unit_cd(src.trd_unit_cd());
			dest.if_trd_unit_nm(src.trd_unit_nm());
			dest.if_dscnt_rsn_cd(src.dscnt_rsn_cd());
			dest.if_dscnt_rsn_nm(src.dscnt_rsn_nm());
			dest.if_ship_wh_cd(src.ship_wh_cd());
			dest.if_ship_wh_nm(src.ship_wh_nm());
			dest.dlv_rqst_tm(getYmdHm(src.dlv_rqst_dt(), src.dlv_rqst_hm()));
			dest.accpt_schd_dt(src.purc_schd_dt());
			dest.if_maker_cd(src.maker_cd());
			dest.if_maker_nm(src.maker_nm());
			dest.trd_rmrks(src.dlv_slip_rmrks());
			dest.trd_d_rmrks(src.dlv_slip_d_rmrks());
			dest.cst_po_rmrks(src.po_print_rmrks());
			dest.cst_po_d_rmrks(src.po_print_d_rmrks());
			dest.if_co_cd(src.slo_co_cd());
			dest.if_co_nm(src.slo_co_nm());
			
			MAM_EXT_SYS_R extSysR = getExtSysR(dest.ext_sys_cd());
			dest.upri_not_chk_flg(extSysR.upri_not_chk_flg());
			dest.amt_not_chk_flg(extSysR.amt_not_chk_flg());
			dest.tax_not_chk_flg(extSysR.tax_not_chk_flg());
		}
	}
	
	protected FXUCL_MCDbcCache<MAM_EXT_SYS_R> _extSys;
	protected MAM_EXT_SYS_R getExtSysR(String extSysCd) {
		if (_extSys == null) {
			MAM_EXT_SYS_R t = MAM_EXT_SYS_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.ext_sys_cd);
			dbc_bldr.addSelect(t.upri_not_chk_flg);
			dbc_bldr.addSelect(t.amt_not_chk_flg);
			dbc_bldr.addSelect(t.tax_not_chk_flg);
			
			_extSys = new FXUCL_MCDbcCache<MAM_EXT_SYS_R>(dbc_bldr);
		}
		return _extSys.get(extSysCd);
	}
	
	protected Map_RsltR_BatchLogMsgR<RsltR,BatchLogMsgR, MST_SLO_RECV_IF_R> createMap_RsltR_BatchLogMsgR() {
		return new Map_RsltR_BatchLogMsgR<RsltR, BatchLogMsgR, MST_SLO_RECV_IF_R>();
	}
	public class Map_RsltR_BatchLogMsgR<D extends RsltR, S extends BatchLogMsgR, W extends MST_SLO_RECV_IF_R> extends MAUCC_RowMapperWith<D, S, W> {
		protected W _ifR;
		
		@Override
		public void setWith(W ifR) {
			this._ifR = ifR;
		}
		
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(RsltR.$id, BatchLogMsgR.$msg_id);
			addColumnPathMap(RsltR.$lv, BatchLogMsgR.$msg_lvl);
			addColumnPathMap(RsltR.$msg, BatchLogMsgR.$msg_txt);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_lno(_ifR.ext_data_lno());
			dest.data_no(_ifR.ext_data_no());
			dest.err_flg(MAC_EXE_STS_TYP.isERR(_ifR.exe_sts_typ()));
			dest.po_no(_ifR.cst_po_no());
			dest.po_rev(_ifR.cst_po_rev());
			dest.po_d_no(_ifR.cst_po_d_no());
		}
	}
	
	protected Map_CndR_MST_SLO_RECV_IF_R<CndR,MST_SLO_RECV_IF_R> createMap_CndR_MST_SLO_RECV_IF_R() {
		return new Map_CndR_MST_SLO_RECV_IF_R<CndR, MST_SLO_RECV_IF_R>();
	}
	public class Map_CndR_MST_SLO_RECV_IF_R<D extends CndR, S extends MST_SLO_RECV_IF_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(CndR.$batch_log_no, MST_SLO_RECV_IF_R.$batch_log_no);
			addColumnPathMap(CndR.$log_sub_key1, MST_SLO_RECV_IF_R.$log_sub_key1);
			addColumnPathMap(CndR.$log_sub_key2, MST_SLO_RECV_IF_R.$log_sub_key2);

		}
	}

	//FMCB CUSTOM END
}