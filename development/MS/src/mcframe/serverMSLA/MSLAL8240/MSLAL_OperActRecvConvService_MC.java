package mcframe.serverMSLA.MSLAL8240;

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
import mcframe.commonMSLA.MSLAR1240.*;
import mcframe.serverMS.dbc.MST_OPER_ACT_RECV_IF_R;
import mcframe.serverPF.dbc.PFT_SDRV_IF_R;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_OperActRecvConvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_OperActRecvConvService_MC extends MSLAL_OperActRecvConvService_MC_A{
	//FMCB CUSTOM START

	/**
	 * OperActRecvConv_Conv01オペレーション.<p>
	 *
	 */
	public class OperActRecvConv_Conv01 extends MSLAL_OperActRecvConvService_MC_A.OperActRecvConv_Conv01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		@SuppressWarnings("unchecked")
		protected void crtIfDBC() {
			_ifDBC = PFBZL_CodeConvert.crtRecvIfDBContainer(MST_OPER_ACT_RECV_IF_R.class);
		}

		@Override
		protected void setCnvIfCols() {
			_ifDBC.addCnvCol("if_mfg_loc_cd", "mfg_loc_cd", MAC_IF_COL_TYP.SHIP_TO_ID);
			_ifDBC.addCnvItmCol("if_mfg_itm_cd", "if_mfg_itm_sub1", "if_mfg_itm_sub2", "if_mfg_itm_sub3", "mfg_itm_cd", "mfg_itm_sub1", "mfg_itm_sub2", "mfg_itm_sub3");
			_ifDBC.addCnvCol("if_oper_cd", "oper_cd", MAC_IF_COL_TYP.OPER);
		}
	}

	/**
	 * OperActRecvConv_Conv02オペレーション.<p>
	 *
	 */
	public class OperActRecvConv_Conv02 extends MSLAL_OperActRecvConvService_MC_A.OperActRecvConv_Conv02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		@SuppressWarnings({
				"unchecked", "rawtypes"
		})
		protected void crtRptSet() {
			_IfRptSet = PFBZL_FileInput.createIfRecvReportSet(DtlR.class, MST_OPER_ACT_RECV_IF_R.class);
			_IfRptSet.setReportSet(MSLAR_OperActPrnt.create());
			_IfRptSet.setRowMapper(new Map_MST_OPER_ACT_RECV_IF_R_DtlR());
		}
	}

	/**
	 * OperActRecvConv_Conv03オペレーション.<p>
	 *
	 */
	public class OperActRecvConv_Conv03 extends MSLAL_OperActRecvConvService_MC_A.OperActRecvConv_Conv03 {
		@Override
		protected void call() {
			editUp();
			super.call();
		}

		protected void editUp() {
			up0().forEach(row -> {
				PFT_SDRV_IF_R sdrvIf = row.sdrvIf();
				if (isNull(sdrvIf.if_proc_typ())) sdrvIf.if_proc_typ(MAC_IF_PROC_TYP.MES_OPER_ACT_RECV.value());
			});
		}

		@Override
		@SuppressWarnings({
				"unchecked", "rawtypes"
		})
		protected void crtRptSet() {
			_IfRptSet = PFBZL_FileInput.createIfRecvReportSet(DtlR.class, MST_OPER_ACT_RECV_IF_R.class);
			_IfRptSet.setReportSet(MSLAR_OperActPrnt.create());
			_IfRptSet.setRowMapper(new Map_MST_OPER_ACT_RECV_IF_R_DtlR());
		}

		@Override
		protected void setRptSetData() {
			_IfRptSet.getReportSet().addAll(up1());
		}
	}

	public class Map_MST_OPER_ACT_RECV_IF_R_DtlR<D extends MST_OPER_ACT_RECV_IF_R, S extends DtlR, W extends PFT_SDRV_IF_R> extends MAUCC_RowMapperWith<D, S, W> {

		protected W _ifR;

		@Override
		public void setWith(W ifR) {
			this._ifR = ifR;
		}

		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$data_crud_typ, DtlR.$data_crud_typ);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$oper_inst_no, DtlR.$oper_inst_no);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$mfg_inst_no, DtlR.$mfg_inst_no);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$mfg_inst_rev, DtlR.$mfg_inst_rev);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$oper_seq, DtlR.$oper_seq);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$oper_unit_qty, DtlR.$oper_unit_qty);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$bkf_ctl_flg, DtlR.$bkf_ctl_flg);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$wk_cost_calc_ctl_flg, DtlR.$wk_cost_calc_ctl_flg);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$oper_yield, DtlR.$oper_yield);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$intr_rmrks, DtlR.$intr_rmrks);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$act_rpt_rmrks, DtlR.$act_rpt_rmrks);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$not_cmpl_flg, DtlR.$not_cmpl_flg);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$ext_oper_act_no, DtlR.$ext_oper_act_no);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$sub_char1, DtlR.$sub_char1);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$sub_char2, DtlR.$sub_char2);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$sub_char3, DtlR.$sub_char3);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$sub_char4, DtlR.$sub_char4);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$sub_char5, DtlR.$sub_char5);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$sub_char6, DtlR.$sub_char6);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$sub_char7, DtlR.$sub_char7);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$sub_char8, DtlR.$sub_char8);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$sub_char9, DtlR.$sub_char9);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$sub_char10, DtlR.$sub_char10);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$sub_char11, DtlR.$sub_char11);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$sub_char12, DtlR.$sub_char12);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$sub_char13, DtlR.$sub_char13);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$sub_char14, DtlR.$sub_char14);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$sub_char15, DtlR.$sub_char15);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$sub_char16, DtlR.$sub_char16);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$sub_char17, DtlR.$sub_char17);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$sub_char18, DtlR.$sub_char18);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$sub_char19, DtlR.$sub_char19);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$sub_char20, DtlR.$sub_char20);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$sub_char21, DtlR.$sub_char21);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$sub_char22, DtlR.$sub_char22);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$sub_char23, DtlR.$sub_char23);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$sub_char24, DtlR.$sub_char24);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$sub_char25, DtlR.$sub_char25);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$sub_char26, DtlR.$sub_char26);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$sub_char27, DtlR.$sub_char27);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$sub_char28, DtlR.$sub_char28);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$sub_char29, DtlR.$sub_char29);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$sub_char30, DtlR.$sub_char30);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$sub_num1, DtlR.$sub_num1);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$sub_num2, DtlR.$sub_num2);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$sub_num3, DtlR.$sub_num3);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$sub_num4, DtlR.$sub_num4);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$sub_num5, DtlR.$sub_num5);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$sub_dt1, DtlR.$sub_dt1);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$sub_dt2, DtlR.$sub_dt2);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$sub_dt3, DtlR.$sub_dt3);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$sub_dt4, DtlR.$sub_dt4);
			addColumnPathMap(MST_OPER_ACT_RECV_IF_R.$sub_dt5, DtlR.$sub_dt5);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			MCNumber dataLno = getSequence(MSC_NUM_SYS_TYP.OPERACTRECVIF.value());
			dest.data_lno(dataLno);
			dest.data_no(_ifR.data_no());
			dest.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
			dest.ext_sys_cd(_ifR.ext_sys_cd());
			dest.imp_flg(true);
			dest.recv_dt(getToday());
			dest.ext_data_lno(isNull(src.data_lno()) ? dataLno : src.data_lno());
			dest.ext_data_no(isNull(src.data_no()) ? getSequence(MAC_NUM_SYS_TYP.ESB_DATA_NO.value()) : src.data_no());
			dest.data_make_dt(isNull(src.data_make_dt()) ? MCDate.sysnow() : src.data_make_dt());
			dest.if_mfg_loc_cd(src.mfg_loc_cd());
			dest.if_mfg_loc_nm(src.mfg_loc_nm());
			dest.if_mfg_itm_cd(src.mfg_itm_cd());
			dest.if_mfg_itm_sub1(src.mfg_itm_sub1());
			dest.if_mfg_itm_sub2(src.mfg_itm_sub2());
			dest.if_mfg_itm_sub3(src.mfg_itm_sub3());
			dest.if_mfg_itm_nm(src.mfg_itm_nm());
			dest.if_oper_cd(src.oper_cd());
			dest.if_oper_nm(src.oper_nm());
			dest.st_act_tm(getYmdHm(src.st_act_dt(), src.st_act_hm()));
			dest.end_act_tm(getYmdHm(src.end_act_dt(), src.end_act_hm()));
			dest.if_co_cd(src.co_cd());
			dest.if_co_nm(src.co_nm());
		}
	}

	//FMCB CUSTOM END
}