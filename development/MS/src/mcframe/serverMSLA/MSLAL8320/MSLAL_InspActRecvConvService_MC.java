package mcframe.serverMSLA.MSLAL8320;

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
import mcframe.commonMSLA.MSLAR1320.*;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
import mcframe.serverPF.dbc.PFT_SDRV_IF_R;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_InspActRecvConvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_InspActRecvConvService_MC extends MSLAL_InspActRecvConvService_MC_A{
	//FMCB CUSTOM START

	/**
	 * InspActRecvConv_Conv01オペレーション.<p>
	 *
	 */
	public class InspActRecvConv_Conv01 extends MSLAL_InspActRecvConvService_MC_A.InspActRecvConv_Conv01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		@SuppressWarnings("unchecked")
		protected void crtIfDBC() {
			_ifDBC = PFBZL_CodeConvert.crtRecvIfDBContainer(MST_INSP_ACT_RECV_IF_R.class);
		}

		@Override
		protected void setCnvIfCols() {
			_ifDBC.addCnvCol("IF_ACT_USR_CD", "ACT_USR_CD", MAC_IF_COL_TYP.USR);
			_ifDBC.addCnvCol("IF_ACT_DPT_CD", "ACT_DPT_CD", MAC_IF_COL_TYP.DPT);
			_ifDBC.addCnvCol("IF_SMPL_GD_CD", "SMPL_GD_CD", MAC_IF_COL_TYP.GD);
			_ifDBC.addCnvCol("IF_SMPL_DFCT_RSN_CD", "SMPL_DFCT_RSN_CD", MAC_IF_COL_TYP.BIZ_RSN);
			_ifDBC.addCnvCol("IF_JUDG_USR_CD", "JUDG_USR_CD", MAC_IF_COL_TYP.USR);
			_ifDBC.addCnvCol("IF_JUDG_DPT_CD", "JUDG_DPT_CD", MAC_IF_COL_TYP.DPT);
			_ifDBC.addCnvCol("IF_STK_LOC_CD", "STK_LOC_CD", MAC_IF_COL_TYP.SHIP_TO_ID);
			_ifDBC.addCnvCol("IF_STK_STR_LN_CD", "STK_STR_LN_CD", MAC_IF_COL_TYP.STR_LN);
			_ifDBC.addCnvCol("IF_TTL_GD_CD", "TTL_GD_CD", MAC_IF_COL_TYP.GD);
			_ifDBC.addCnvCol("IF_TTL_DFCT_RSN_CD", "TTL_DFCT_RSN_CD", MAC_IF_COL_TYP.BIZ_RSN);
			_ifDBC.addCnvCol("IF_PACK_UNIT_CD", "PACK_UNIT_CD", MAC_IF_COL_TYP.UNIT);
			_ifDBC.addCnvCol("IF_TTL_PACK_XFR_PACK_UNIT_CD", "TTL_PACK_XFR_PACK_UNIT_CD", MAC_IF_COL_TYP.UNIT);
			_ifDBC.addCnvCol("IF_SMPL_PACK_XFR_PACK_UNIT_CD", "SMPL_PACK_XFR_PACK_UNIT_CD", MAC_IF_COL_TYP.UNIT);
			_ifDBC.addCnvCol("IF_BD_DPT_CD", "BD_DPT_CD", MAC_IF_COL_TYP.DPT);
		}
	}
	/**
	 * InspActRecvConv_Conv02オペレーション.<p>
	 *
	 */
	public class InspActRecvConv_Conv02 extends MSLAL_InspActRecvConvService_MC_A.InspActRecvConv_Conv02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		@SuppressWarnings({
				"unchecked", "rawtypes"
		})
		protected void crtRptSet() {
			_IfRptSet = PFBZL_FileInput.createIfRecvReportSet(DtlR.class,MST_INSP_ACT_RECV_IF_R.class);
			_IfRptSet.setReportSet(MSLAR_InspActRecvPrnt.create());
			_IfRptSet.setRowMapper(new Map_MST_INSP_ACT_RECV_IF_R_DtlR());
		}

		public class Map_MST_INSP_ACT_RECV_IF_R_DtlR<D extends MST_INSP_ACT_RECV_IF_R, S extends DtlR, W extends PFT_SDRV_IF_R>
				extends MAUCC_RowMapperWith<D, S, W> {

			protected W _ifR;

			@Override
			public void setWith(W ifR) {
				this._ifR = ifR;
			}

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$data_make_dt, DtlR.$data_make_dt);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$data_crud_typ, DtlR.$data_crud_typ);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$act_usr_nm, DtlR.$act_usr_nm);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$act_dpt_nm, DtlR.$act_dpt_nm);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$smpl_quality_typ, DtlR.$smpl_quality_typ);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$smpl_gd_nm, DtlR.$smpl_gd_nm);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$smpl_dfct_rsn_nm, DtlR.$smpl_dfct_rsn_nm);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$act_cont_fctr, DtlR.$act_cont_fctr);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$vld_dt_upd_flg, DtlR.$vld_dt_upd_flg);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$smpl_intr_rmrks, DtlR.$smpl_intr_rmrks);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$base_flg, DtlR.$base_flg);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$bd_dpt_nm, DtlR.$bd_dpt_nm);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$ext_insp_act_d_no, DtlR.$ext_insp_act_d_no);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$ext_insp_act_no, DtlR.$ext_insp_act_no);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$ext_insp_smpl_act_no, DtlR.$ext_insp_smpl_act_no);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$imp_only_judg, DtlR.$imp_only_judg);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$insp_judg_rslt_typ, DtlR.$insp_judg_rslt_typ);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$insp_no, DtlR.$insp_no);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$insp_schd_no, DtlR.$insp_schd_no);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$intr_rmrks, DtlR.$intr_rmrks);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$judg_dpt_nm, DtlR.$judg_dpt_nm);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$judg_dt, DtlR.$judg_dt);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$judg_rsn, DtlR.$judg_rsn);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$judg_usr_nm, DtlR.$judg_usr_nm);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$lmt_dt, DtlR.$lmt_dt);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$lmt_dt_frm, DtlR.$lmt_dt_frm);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$lot_rmrks, DtlR.$lot_rmrks);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$pack_unit_nm, DtlR.$pack_unit_nm);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$pack_unit_qty, DtlR.$pack_unit_qty);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$smpl_pack_xfr_pack_unit_nm, DtlR.$smpl_pack_xfr_pack_unit_nm);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$smpl_pack_xfr_pack_unit_qty, DtlR.$smpl_pack_xfr_pack_unit_qty);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$smpl_qty, DtlR.$smpl_qty);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$so_qty, DtlR.$so_qty);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$stk_loc_nm, DtlR.$stk_loc_nm);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$stk_str_ln_nm, DtlR.$stk_str_ln_nm);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$trd_rmrks, DtlR.$trd_rmrks);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$ttl_dfct_rsn_nm, DtlR.$ttl_dfct_rsn_nm);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$ttl_gd_nm, DtlR.$ttl_gd_nm);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$ttl_intr_rmrks, DtlR.$ttl_intr_rmrks);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$ttl_pack_xfr_pack_unit_nm, DtlR.$ttl_pack_xfr_pack_unit_nm);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$ttl_pack_xfr_pack_unit_qty, DtlR.$ttl_pack_xfr_pack_unit_qty);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$ttl_quality_typ, DtlR.$ttl_quality_typ);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$vld_dt, DtlR.$vld_dt);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$sub_char1, DtlR.$sub_char1);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$sub_char2, DtlR.$sub_char2);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$sub_char3, DtlR.$sub_char3);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$sub_char4, DtlR.$sub_char4);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$sub_char5, DtlR.$sub_char5);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$sub_char6, DtlR.$sub_char6);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$sub_char7, DtlR.$sub_char7);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$sub_char8, DtlR.$sub_char8);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$sub_char9, DtlR.$sub_char9);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$sub_char10, DtlR.$sub_char10);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$sub_char11, DtlR.$sub_char11);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$sub_char12, DtlR.$sub_char12);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$sub_char13, DtlR.$sub_char13);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$sub_char14, DtlR.$sub_char14);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$sub_char15, DtlR.$sub_char15);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$sub_char16, DtlR.$sub_char16);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$sub_char17, DtlR.$sub_char17);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$sub_char18, DtlR.$sub_char18);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$sub_char19, DtlR.$sub_char19);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$sub_char20, DtlR.$sub_char20);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$sub_char21, DtlR.$sub_char21);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$sub_char22, DtlR.$sub_char22);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$sub_char23, DtlR.$sub_char23);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$sub_char24, DtlR.$sub_char24);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$sub_char25, DtlR.$sub_char25);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$sub_char26, DtlR.$sub_char26);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$sub_char27, DtlR.$sub_char27);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$sub_char28, DtlR.$sub_char28);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$sub_char29, DtlR.$sub_char29);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$sub_char30, DtlR.$sub_char30);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$sub_dt1, DtlR.$sub_dt1);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$sub_dt2, DtlR.$sub_dt2);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$sub_dt3, DtlR.$sub_dt3);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$sub_dt4, DtlR.$sub_dt4);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$sub_dt5, DtlR.$sub_dt5);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$sub_num1, DtlR.$sub_num1);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$sub_num2, DtlR.$sub_num2);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$sub_num3, DtlR.$sub_num3);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$sub_num4, DtlR.$sub_num4);
				addColumnPathMap(MST_INSP_ACT_RECV_IF_R.$sub_num5, DtlR.$sub_num5);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_lno(getSequence(MSC_NUM_SYS_TYP.INSPACTRECVIF.value()));
				dest.data_no(_ifR.data_no());
				dest.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
				dest.ext_sys_cd(_ifR.ext_sys_cd());
				dest.ext_data_lno(src.data_lno());
				dest.ext_data_no(src.data_no());
				dest.imp_flg(true);
				dest.recv_dt(getToday());
				dest.end_act_tm(getYmdHm(src.end_act_dt(), src.end_act_hm()));
				dest.smpl_act_tm(getYmdHm(src.smpl_act_dt(), src.smpl_act_hm()));
				dest.st_act_tm(getYmdHm(src.st_act_dt(), src.st_act_hm()));
				dest.ttl_act_tm(getYmdHm(src.ttl_act_dt(), src.ttl_act_hm()));
				dest.if_act_usr_cd(src.act_usr_cd());
				dest.if_act_dpt_cd(src.act_dpt_cd());
				dest.if_smpl_gd_cd(src.smpl_gd_cd());
				dest.if_smpl_dfct_rsn_cd(src.smpl_dfct_rsn_cd());
				dest.if_judg_usr_cd(src.judg_usr_cd());
				dest.if_judg_dpt_cd(src.judg_dpt_cd());
				dest.if_stk_loc_cd(src.stk_loc_cd());
				dest.if_stk_str_ln_cd(src.stk_str_ln_cd());
				dest.if_ttl_gd_cd(src.ttl_gd_cd());
				dest.if_ttl_dfct_rsn_cd(src.ttl_dfct_rsn_cd());
				dest.if_pack_unit_cd(src.pack_unit_cd());
				dest.if_ttl_pack_xfr_pack_unit_cd(src.ttl_pack_xfr_pack_unit_cd());
				dest.if_smpl_pack_xfr_pack_unit_cd(src.smpl_pack_xfr_pack_unit_cd());
				dest.if_bd_dpt_cd(src.bd_dpt_cd());
				dest.if_co_cd(src.co_cd());
				dest.if_co_nm(src.co_nm());
			}
		}
	}

	//FMCB CUSTOM END
}