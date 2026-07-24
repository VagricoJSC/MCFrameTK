package mcframe.serverMSLA.MSLAL8040;

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
import mcframe.commonMSLA.MSLAR1040.*;
import mcframe.serverMS.dbc.MST_ARR_ACT_RECV_IF_R;
import mcframe.serverPF.dbc.PFT_SDRV_IF_R;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_ArrActRecvConvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_ArrActRecvConvService_MC extends MSLAL_ArrActRecvConvService_MC_A{
	//FMCB CUSTOM START

	/**
	 * ArrActRecvConv_Conv01オペレーション.<p>
	 *
	 */
	public class ArrActRecvConv_Conv01 extends MSLAL_ArrActRecvConvService_MC_A.ArrActRecvConv_Conv01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		@SuppressWarnings("unchecked")
		protected void crtIfDBC() {
			_ifDBC = PFBZL_CodeConvert.crtRecvIfDBContainer(MST_ARR_ACT_RECV_IF_R.class);
		}
		@Override
		protected void setCnvIfCols() {
			_ifDBC.addCnvCol("if_arr_dpt_cd", "arr_dpt_cd", MAC_IF_COL_TYP.DPT);
			_ifDBC.addCnvCol("if_arr_usr_cd", "arr_usr_cd", MAC_IF_COL_TYP.USR);
			_ifDBC.addCnvCol("if_site_co_cd", "site_co_cd", MAC_IF_COL_TYP.SITE_CO);
			_ifDBC.addCnvCol("if_arr_lg_grp_cd", "arr_lg_grp_cd", MAC_IF_COL_TYP.LG_GRP);
			_ifDBC.addCnvCol("if_arr_loc_cd", "arr_loc_cd", MAC_IF_COL_TYP.SHIP_TO_ID);
			_ifDBC.addCnvCol("if_arr_str_ln_cd", "arr_str_ln_cd", MAC_IF_COL_TYP.STR_LN);
			_ifDBC.addCnvCol("if_gd_cd", "gd_cd", MAC_IF_COL_TYP.GD);
			_ifDBC.addCnvCol("if_trd_unit_cd", "trd_unit_cd", MAC_IF_COL_TYP.UNIT);
			_ifDBC.addCnvItmCol("if_itm_cd", "if_itm_sub1", "if_itm_sub2", "if_itm_sub3", "itm_cd", "itm_sub1", "itm_sub2", "itm_sub3");
		}
	}
	/**
	 * ArrActRecvConv_Conv02オペレーション.<p>
	 *
	 */
	public class ArrActRecvConv_Conv02 extends MSLAL_ArrActRecvConvService_MC_A.ArrActRecvConv_Conv02 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		@SuppressWarnings({
			"unchecked", "rawtypes"
		})
		protected void crtRptSet() {
			_IfRptSet = PFBZL_FileInput.createIfRecvReportSet(DtlR.class, MST_ARR_ACT_RECV_IF_R.class);
			_IfRptSet.setReportSet(MSLAR_ArrActPrnt.create());
			_IfRptSet.setRowMapper(new Map_MST_ARR_ACT_RECV_IF_R_DtlR());
		}
		
		public class Map_MST_ARR_ACT_RECV_IF_R_DtlR<D extends MST_ARR_ACT_RECV_IF_R, S extends DtlR, W extends PFT_SDRV_IF_R>  
			extends MAUCC_RowMapperWith<D, S, W> {
			
			protected W _ifR;
			@Override
			public void setWith(W ifR){
				this._ifR = ifR;
			}
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$data_crud_typ, DtlR.$data_crud_typ);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$data_make_dt, DtlR.$data_make_dt);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$arr_schd_no, DtlR.$arr_schd_no);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$po_d_no, DtlR.$po_d_no);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$prms_rcpt_d_no, DtlR.$prms_rcpt_d_no);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$dlv_inst_d_no, DtlR.$dlv_inst_d_no);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sls_ret_schd_d_no, DtlR.$sls_ret_schd_d_no);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$dlv_slip_d_no, DtlR.$dlv_slip_d_no);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$iv_d_no, DtlR.$iv_d_no);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$ext_arr_act_no, DtlR.$ext_arr_act_no);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$lot_no, DtlR.$lot_no);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sublot_no, DtlR.$sublot_no);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$ver_no, DtlR.$ver_no);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$trd_unit_qty, DtlR.$trd_unit_qty);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$abort_flg, DtlR.$abort_flg);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$bp_lot_no, DtlR.$bp_lot_no);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$bp_dlv_slip_no, DtlR.$bp_dlv_slip_no);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$bp_dlv_slip_d_no, DtlR.$bp_dlv_slip_d_no);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$ship_fr_valid_dt, DtlR.$ship_fr_valid_dt);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$insp_cnt_rmrks, DtlR.$insp_cnt_rmrks);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$intr_rmrks, DtlR.$intr_rmrks);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sub_char1, DtlR.$sub_char1);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sub_char2, DtlR.$sub_char2);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sub_char3, DtlR.$sub_char3);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sub_char4, DtlR.$sub_char4);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sub_char5, DtlR.$sub_char5);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sub_char6, DtlR.$sub_char6);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sub_char7, DtlR.$sub_char7);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sub_char8, DtlR.$sub_char8);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sub_char9, DtlR.$sub_char9);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sub_char10, DtlR.$sub_char10);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sub_char11, DtlR.$sub_char11);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sub_char12, DtlR.$sub_char12);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sub_char13, DtlR.$sub_char13);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sub_char14, DtlR.$sub_char14);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sub_char15, DtlR.$sub_char15);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sub_char16, DtlR.$sub_char16);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sub_char17, DtlR.$sub_char17);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sub_char18, DtlR.$sub_char18);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sub_char19, DtlR.$sub_char19);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sub_char20, DtlR.$sub_char20);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sub_char21, DtlR.$sub_char21);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sub_char22, DtlR.$sub_char22);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sub_char23, DtlR.$sub_char23);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sub_char24, DtlR.$sub_char24);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sub_char25, DtlR.$sub_char25);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sub_char26, DtlR.$sub_char26);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sub_char27, DtlR.$sub_char27);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sub_char28, DtlR.$sub_char28);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sub_char29, DtlR.$sub_char29);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sub_char30, DtlR.$sub_char30);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sub_num1, DtlR.$sub_num1);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sub_num2, DtlR.$sub_num2);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sub_num3, DtlR.$sub_num3);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sub_num4, DtlR.$sub_num4);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sub_num5, DtlR.$sub_num5);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sub_dt1, DtlR.$sub_dt1);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sub_dt2, DtlR.$sub_dt2);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sub_dt3, DtlR.$sub_dt3);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sub_dt4, DtlR.$sub_dt4);
				addColumnPathMap(MST_ARR_ACT_RECV_IF_R.$sub_dt5, DtlR.$sub_dt5);

			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_lno(getSequence(MSC_NUM_SYS_TYP.ARRACTRECVIF.value()));
				dest.data_no(_ifR.data_no());
				dest.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
				dest.ext_sys_cd(_ifR.ext_sys_cd());
				dest.imp_flg(true);
				dest.recv_dt(getToday());
				dest.ext_data_lno(src.data_lno());
				dest.ext_data_no(src.data_no());
				dest.arr_tm(getYmdHm(src.arr_dt(), src.arr_hm()));
				dest.if_arr_dpt_cd(src.arr_dpt_cd());
				dest.if_arr_dpt_nm(src.arr_dpt_nm());
				dest.if_arr_usr_cd(src.arr_usr_cd());
				dest.if_arr_usr_nm(src.arr_usr_nm());
				dest.if_site_co_cd(src.site_co_cd());
				dest.if_site_co_nm(src.site_co_nm());
				dest.if_arr_lg_grp_cd(src.arr_lg_grp_cd());
				dest.if_arr_lg_grp_nm(src.arr_lg_grp_nm());
				dest.if_arr_loc_cd(src.arr_loc_cd());
				dest.if_arr_loc_nm(src.arr_loc_nm());
				dest.if_arr_str_ln_cd(src.arr_str_ln_cd());
				dest.if_arr_str_ln_nm(src.arr_str_ln_nm());
				dest.if_itm_cd(src.itm_cd());
				dest.if_itm_sub1(src.itm_sub1());
				dest.if_itm_sub2(src.itm_sub2());
				dest.if_itm_sub3(src.itm_sub3());
				dest.if_itm_nm(src.itm_nm());
				dest.if_gd_cd(src.gd_cd());
				dest.if_gd_nm(src.gd_nm());
				dest.if_trd_unit_cd(src.trd_unit_cd());
				dest.if_trd_unit_nm(src.trd_unit_nm());
				dest.if_co_cd(src.dpstr_cd());
				dest.if_co_nm(src.dpstr_nm());
			}
		}
	}

	//FMCB CUSTOM END
}