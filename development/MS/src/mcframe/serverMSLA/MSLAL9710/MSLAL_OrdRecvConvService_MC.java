package mcframe.serverMSLA.MSLAL9710;

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
import mcframe.commonMSLA.MSLAR2210.*;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
import mcframe.serverPF.dbc.PFT_SDRV_IF_R;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_OrdRecvConvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_OrdRecvConvService_MC extends MSLAL_OrdRecvConvService_MC_A{
	//FMCB CUSTOM START

	/**
	 * OrdRecvConv_Conv01オペレーション.<p>
	 *
	 */
	public class OrdRecvConv_Conv01 extends MSLAL_OrdRecvConvService_MC_A.OrdRecvConv_Conv01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		@SuppressWarnings("unchecked")
		protected void crtIfDBC() {
			_ifDBC = PFBZL_CodeConvert.crtRecvIfDBContainer(MST_ORDER_RECV_IF_R.class);
		}
		
		@Override
		protected void setCnvIfCols() {
			_ifDBC.addCnvItmCol("if_itm_cd", "if_itm_sub1", "if_itm_sub2", "if_itm_sub3", "itm_cd", "itm_sub1", "itm_sub2", "itm_sub3");
			_ifDBC.addCnvCol("if_strg_loc_cd", "strg_loc_cd", MAC_IF_COL_TYP.SHIP_TO_ID);
			_ifDBC.addCnvCol("if_mfg_loc_cd", "mfg_loc_cd", MAC_IF_COL_TYP.SHIP_TO_ID);
			_ifDBC.addCnvCol("if_oper_cd", "oper_cd", MAC_IF_COL_TYP.OPER);
			_ifDBC.addCnvCol("if_loc_cd", "loc_cd", MAC_IF_COL_TYP.SHIP_TO_ID);
		}
	}
	/**
	 * OrdRecvConv_Conv02オペレーション.<p>
	 *
	 */
	public class OrdRecvConv_Conv02 extends MSLAL_OrdRecvConvService_MC_A.OrdRecvConv_Conv02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		@SuppressWarnings({
				"unchecked", "rawtypes"
		})
		protected void crtRptSet() {
			_IfRptSet = PFBZL_FileInput.createIfRecvReportSet(DtlR.class, MST_ORDER_RECV_IF_R.class);
			_IfRptSet.setReportSet(MSLAR_OrdPrnt.create());
			_IfRptSet.setRowMapper(new Map_MST_ORDER_RECV_IF_R_DtlR());
		}
		
		public class Map_MST_ORDER_RECV_IF_R_DtlR<D extends MST_ORDER_RECV_IF_R, S extends DtlR, W extends PFT_SDRV_IF_R>
				extends MAUCC_RowMapperWith<D, S, W> {
					
			protected W _ifR;
			
			@Override
			public void setWith(W ifR) {
				this._ifR = ifR;
			}
			
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_ORDER_RECV_IF_R.$data_crud_typ, DtlR.$data_crud_typ);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$data_make_dt, DtlR.$data_make_dt);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$ext_itm_ord_no, DtlR.$ext_itm_ord_no);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$ext_oper_ord_no, DtlR.$ext_oper_ord_no);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$itm_ord_typ, DtlR.$itm_ord_typ);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$itm_nm, DtlR.$itm_nm);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$ver_no, DtlR.$ver_no);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$bom_ptn, DtlR.$bom_ptn);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$oper_ptn, DtlR.$oper_ptn);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$inst_qty, DtlR.$inst_qty);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$yield_schd_qty, DtlR.$yield_schd_qty);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$po_schd_dt, DtlR.$po_schd_dt);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$mfg_st_schd_dt, DtlR.$mfg_st_schd_dt);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$mfg_end_schd_dt, DtlR.$mfg_end_schd_dt);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$strg_schd_dt, DtlR.$strg_schd_dt);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$accpt_schd_dt, DtlR.$accpt_schd_dt);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$insp_st_schd_dt, DtlR.$insp_st_schd_dt);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$insp_end_schd_dt, DtlR.$insp_end_schd_dt);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$avl_schd_dt, DtlR.$avl_schd_dt);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$master_dt, DtlR.$master_dt);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sno1, DtlR.$sno1);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sno2, DtlR.$sno2);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sno3, DtlR.$sno3);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sno4, DtlR.$sno4);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$inst_po_cnt_rmrks, DtlR.$inst_po_cnt_rmrks);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$itm_ord_intr_rmrks, DtlR.$itm_ord_intr_rmrks);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$itm_ord_sub_char1, DtlR.$itm_ord_sub_char1);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$itm_ord_sub_char2, DtlR.$itm_ord_sub_char2);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$itm_ord_sub_char3, DtlR.$itm_ord_sub_char3);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$st_schd_tm, DtlR.$st_schd_tm);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$end_schd_tm, DtlR.$end_schd_tm);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$oper_schd_qty, DtlR.$oper_schd_qty);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$disp_seq, DtlR.$disp_seq);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$oper_seq, DtlR.$oper_seq);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$oper_rsrc, DtlR.$oper_rsrc);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$oper_ord_intr_rmrks, DtlR.$oper_ord_intr_rmrks);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$oper_ord_sub_char1, DtlR.$oper_ord_sub_char1);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$oper_ord_sub_char2, DtlR.$oper_ord_sub_char2);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$oper_ord_sub_char3, DtlR.$oper_ord_sub_char3);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sub_char1, DtlR.$sub_char1);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sub_char2, DtlR.$sub_char2);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sub_char3, DtlR.$sub_char3);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sub_char4, DtlR.$sub_char4);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sub_char5, DtlR.$sub_char5);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sub_char6, DtlR.$sub_char6);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sub_char7, DtlR.$sub_char7);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sub_char8, DtlR.$sub_char8);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sub_char9, DtlR.$sub_char9);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sub_char10, DtlR.$sub_char10);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sub_char11, DtlR.$sub_char11);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sub_char12, DtlR.$sub_char12);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sub_char13, DtlR.$sub_char13);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sub_char14, DtlR.$sub_char14);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sub_char15, DtlR.$sub_char15);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sub_char16, DtlR.$sub_char16);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sub_char17, DtlR.$sub_char17);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sub_char18, DtlR.$sub_char18);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sub_char19, DtlR.$sub_char19);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sub_char20, DtlR.$sub_char20);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sub_char21, DtlR.$sub_char21);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sub_char22, DtlR.$sub_char22);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sub_char23, DtlR.$sub_char23);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sub_char24, DtlR.$sub_char24);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sub_char25, DtlR.$sub_char25);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sub_char26, DtlR.$sub_char26);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sub_char27, DtlR.$sub_char27);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sub_char28, DtlR.$sub_char28);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sub_char29, DtlR.$sub_char29);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sub_char30, DtlR.$sub_char30);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sub_num1, DtlR.$sub_num1);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sub_num2, DtlR.$sub_num2);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sub_num3, DtlR.$sub_num3);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sub_num4, DtlR.$sub_num4);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sub_num5, DtlR.$sub_num5);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sub_dt1, DtlR.$sub_dt1);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sub_dt2, DtlR.$sub_dt2);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sub_dt3, DtlR.$sub_dt3);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sub_dt4, DtlR.$sub_dt4);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$sub_dt5, DtlR.$sub_dt5);
				addColumnPathMap(MST_ORDER_RECV_IF_R.$scheduler_frozen_flg, DtlR.$scheduler_frozen_flg);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_lno(getSequence(MSC_NUM_SYS_TYP.ORDRECVIF.value()));
				dest.data_no(_ifR.data_no());
				dest.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
				dest.ext_sys_cd(_ifR.ext_sys_cd());
				dest.ext_data_lno(src.data_lno());
				dest.ext_data_no(src.data_no());
				dest.imp_flg(true);
				dest.recv_dt(getToday());
				dest.if_itm_cd(src.itm_cd());
				dest.if_itm_sub1(src.itm_sub1());
				dest.if_itm_sub2(src.itm_sub2());
				dest.if_itm_sub3(src.itm_sub3());
				dest.if_itm_nm(src.itm_nm());
				dest.if_strg_loc_cd(src.strg_loc_cd());
				dest.if_strg_loc_nm(src.strg_loc_nm());
				dest.if_mfg_loc_cd(src.mfg_loc_cd());
				dest.if_mfg_loc_nm(src.mfg_loc_nm());
				dest.if_oper_cd(src.oper_cd());
				dest.if_oper_nm(src.oper_nm());
				dest.if_loc_cd(src.loc_cd());
				dest.if_loc_nm(src.loc_nm());
				dest.if_co_cd(src.co_cd());
				dest.if_co_nm(src.co_nm());
			}
		}
	}

	//FMCB CUSTOM END
}