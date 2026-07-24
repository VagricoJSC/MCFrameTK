package mcframe.serverMSLA.MSLAL8050;

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
import mcframe.serverPFBZ.PFBZL9020.PFBZL_FileOutput;
import mcframe.commonMSLA.MSLAR1050.*;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_XfrInstSendConvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_XfrInstSendConvService_MC extends MSLAL_XfrInstSendConvService_MC_A{
	//FMCB CUSTOM START

	/**
	 * XfrInstSendConv_Conv01オペレーション.<p>
	 *
	 */
	public class XfrInstSendConv_Conv01 extends MSLAL_XfrInstSendConvService_MC_A.XfrInstSendConv_Conv01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		@SuppressWarnings("unchecked")
		protected void crtIfDBC() {
			_ifDBC = PFBZL_CodeConvert.crtSendIfDBContainer(MST_XFR_INST_SEND_IF_R.class);
		}

		@Override
		protected void setCnvIfCols() {
			_ifDBC.addCnvCol("co_cd", MAC_IF_COL_TYP.CO);
			_ifDBC.addCnvCol("trd_cd", MAC_IF_COL_TYP.TRD);
			_ifDBC.addCnvCol("inst_dpt_cd", MAC_IF_COL_TYP.DPT);
			_ifDBC.addCnvCol("inst_usr_cd", MAC_IF_COL_TYP.USR);
			_ifDBC.addCnvCol("lg_grp_cd", MAC_IF_COL_TYP.LG_GRP);
			_ifDBC.addCnvCol("gi_loc_cd", MAC_IF_COL_TYP.SHIP_TO_ID);
			_ifDBC.addCnvCol("gi_str_ln_cd", MAC_IF_COL_TYP.STR_LN);
			_ifDBC.addCnvCol("gr_loc_cd", MAC_IF_COL_TYP.SHIP_TO_ID);
			_ifDBC.addCnvCol("gr_str_ln_cd", MAC_IF_COL_TYP.STR_LN);
			_ifDBC.addCnvCol("gd_cd", MAC_IF_COL_TYP.GD);
			_ifDBC.addCnvCol("stk_bp_cd", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("trd_unit_cd", MAC_IF_COL_TYP.UNIT);
			_ifDBC.addCnvCol("base_unit_cd", MAC_IF_COL_TYP.UNIT);
			_ifDBC.addCnvCol("rsn_cd", MAC_IF_COL_TYP.BIZ_RSN);
			_ifDBC.addCnvCol("site_co_cd", MAC_IF_COL_TYP.SITE_CO);
			_ifDBC.addCnvCol("bd_dpt_cd", MAC_IF_COL_TYP.DPT);
			_ifDBC.addCnvItmCol("itm_cd", "itm_sub1", "itm_sub2", "itm_sub3");
		}
	}
	/**
	 * XfrInstSendConv_Conv02オペレーション.<p>
	 *
	 */
	public class XfrInstSendConv_Conv02 extends MSLAL_XfrInstSendConvService_MC_A.XfrInstSendConv_Conv02 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		@SuppressWarnings({
				"unchecked", "rawtypes"
		})
		protected void crtRptSet() {
			_IfRptSet = PFBZL_FileOutput.createIfSendReportSet(DtlR.class, MST_XFR_INST_SEND_IF_R.class);
			_IfRptSet.setReportSet(MSLAR_XfrInstPrnt.create());
			_IfRptSet.setRowMapper(new Map_DtlR_MST_XFR_INST_SEND_IF_R());
		}
		public class Map_DtlR_MST_XFR_INST_SEND_IF_R<D extends DtlR, S extends MST_XFR_INST_SEND_IF_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(DtlR.$data_lno, MST_XFR_INST_SEND_IF_R.$data_lno);
				addColumnPathMap(DtlR.$data_no, MST_XFR_INST_SEND_IF_R.$data_no);
				addColumnPathMap(DtlR.$data_crud_typ, MST_XFR_INST_SEND_IF_R.$data_crud_typ);
				addColumnPathMap(DtlR.$xfr_inst_no, MST_XFR_INST_SEND_IF_R.$xfr_inst_no);
				addColumnPathMap(DtlR.$trd_nm, MST_XFR_INST_SEND_IF_R.$trd_nm);
				addColumnPathMap(DtlR.$trd_ptn_typ, MST_XFR_INST_SEND_IF_R.$trd_ptn_typ);
				addColumnPathMap(DtlR.$xfr_schd_dt, MST_XFR_INST_SEND_IF_R.$xfr_schd_dt);
				addColumnPathMap(DtlR.$xfr_inst_dt, MST_XFR_INST_SEND_IF_R.$xfr_inst_dt);
				addColumnPathMap(DtlR.$inst_dpt_nm, MST_XFR_INST_SEND_IF_R.$inst_dpt_nm);
				addColumnPathMap(DtlR.$inst_usr_nm, MST_XFR_INST_SEND_IF_R.$inst_usr_nm);
				addColumnPathMap(DtlR.$xfr_schd_no, MST_XFR_INST_SEND_IF_R.$xfr_schd_no);
				addColumnPathMap(DtlR.$xfr_src_typ, MST_XFR_INST_SEND_IF_R.$xfr_src_typ);
				addColumnPathMap(DtlR.$xfr_src_no, MST_XFR_INST_SEND_IF_R.$xfr_src_no);
				addColumnPathMap(DtlR.$xfr_inst_d_no, MST_XFR_INST_SEND_IF_R.$xfr_inst_d_no);
				addColumnPathMap(DtlR.$xfr_alloc_sts_no, MST_XFR_INST_SEND_IF_R.$xfr_alloc_sts_no);
				addColumnPathMap(DtlR.$dlv_slip_no, MST_XFR_INST_SEND_IF_R.$dlv_slip_no);
				addColumnPathMap(DtlR.$dlv_slip_d_no, MST_XFR_INST_SEND_IF_R.$dlv_slip_d_no);
				addColumnPathMap(DtlR.$lg_grp_nm, MST_XFR_INST_SEND_IF_R.$lg_grp_nm);
				addColumnPathMap(DtlR.$gi_loc_nm, MST_XFR_INST_SEND_IF_R.$gi_loc_nm);
				addColumnPathMap(DtlR.$gi_str_ln_nm, MST_XFR_INST_SEND_IF_R.$gi_str_ln_nm);
				addColumnPathMap(DtlR.$gi_loc_tel, MST_XFR_INST_SEND_IF_R.$gi_loc_tel);
				addColumnPathMap(DtlR.$gi_loc_fax, MST_XFR_INST_SEND_IF_R.$gi_loc_fax);
				addColumnPathMap(DtlR.$gr_loc_nm, MST_XFR_INST_SEND_IF_R.$gr_loc_nm);
				addColumnPathMap(DtlR.$gr_str_ln_nm, MST_XFR_INST_SEND_IF_R.$gr_str_ln_nm);
				addColumnPathMap(DtlR.$gr_loc_tel, MST_XFR_INST_SEND_IF_R.$gr_loc_tel);
				addColumnPathMap(DtlR.$gr_loc_fax, MST_XFR_INST_SEND_IF_R.$gr_loc_fax);
				addColumnPathMap(DtlR.$itm_nm, MST_XFR_INST_SEND_IF_R.$itm_nm);
				addColumnPathMap(DtlR.$lot_no, MST_XFR_INST_SEND_IF_R.$lot_no);
				addColumnPathMap(DtlR.$sublot_no, MST_XFR_INST_SEND_IF_R.$sublot_no);
				addColumnPathMap(DtlR.$ver_no, MST_XFR_INST_SEND_IF_R.$ver_no);
				addColumnPathMap(DtlR.$sno1, MST_XFR_INST_SEND_IF_R.$sno1);
				addColumnPathMap(DtlR.$sno1_null_flg, MST_XFR_INST_SEND_IF_R.$sno1_null_flg);
				addColumnPathMap(DtlR.$sno2, MST_XFR_INST_SEND_IF_R.$sno2);
				addColumnPathMap(DtlR.$sno2_null_flg, MST_XFR_INST_SEND_IF_R.$sno2_null_flg);
				addColumnPathMap(DtlR.$sno3, MST_XFR_INST_SEND_IF_R.$sno3);
				addColumnPathMap(DtlR.$sno3_null_flg, MST_XFR_INST_SEND_IF_R.$sno3_null_flg);
				addColumnPathMap(DtlR.$sno4, MST_XFR_INST_SEND_IF_R.$sno4);
				addColumnPathMap(DtlR.$sno4_null_flg, MST_XFR_INST_SEND_IF_R.$sno4_null_flg);
				addColumnPathMap(DtlR.$gd_nm, MST_XFR_INST_SEND_IF_R.$gd_nm);
				addColumnPathMap(DtlR.$quality_typ, MST_XFR_INST_SEND_IF_R.$quality_typ);
				addColumnPathMap(DtlR.$stk_insp_typ, MST_XFR_INST_SEND_IF_R.$stk_insp_typ);
				addColumnPathMap(DtlR.$stk_id_typ, MST_XFR_INST_SEND_IF_R.$stk_id_typ);
				addColumnPathMap(DtlR.$stk_bp_nm, MST_XFR_INST_SEND_IF_R.$stk_bp_nm);
				addColumnPathMap(DtlR.$trd_unit_qty, MST_XFR_INST_SEND_IF_R.$trd_unit_qty);
				addColumnPathMap(DtlR.$trd_unit_nm, MST_XFR_INST_SEND_IF_R.$trd_unit_nm);
				addColumnPathMap(DtlR.$base_unit_qty, MST_XFR_INST_SEND_IF_R.$base_unit_qty);
				addColumnPathMap(DtlR.$base_unit_nm, MST_XFR_INST_SEND_IF_R.$base_unit_nm);
				addColumnPathMap(DtlR.$alloc_flg, MST_XFR_INST_SEND_IF_R.$alloc_flg);
				addColumnPathMap(DtlR.$abort_flg, MST_XFR_INST_SEND_IF_R.$abort_flg);
				addColumnPathMap(DtlR.$vld_dt, MST_XFR_INST_SEND_IF_R.$vld_dt);
				addColumnPathMap(DtlR.$lmt_dt, MST_XFR_INST_SEND_IF_R.$lmt_dt);
				addColumnPathMap(DtlR.$first_gr_dt, MST_XFR_INST_SEND_IF_R.$first_gr_dt);
				addColumnPathMap(DtlR.$prov_typ, MST_XFR_INST_SEND_IF_R.$prov_typ);
				addColumnPathMap(DtlR.$prov_basis_typ, MST_XFR_INST_SEND_IF_R.$prov_basis_typ);
				addColumnPathMap(DtlR.$ret_prov_typ, MST_XFR_INST_SEND_IF_R.$ret_prov_typ);
				addColumnPathMap(DtlR.$ret_prov_basis_typ, MST_XFR_INST_SEND_IF_R.$ret_prov_basis_typ);
				addColumnPathMap(DtlR.$rsn_nm, MST_XFR_INST_SEND_IF_R.$rsn_nm);
				addColumnPathMap(DtlR.$bd_dpt_nm, MST_XFR_INST_SEND_IF_R.$bd_dpt_nm);
				addColumnPathMap(DtlR.$inst_rmrks, MST_XFR_INST_SEND_IF_R.$inst_rmrks);
				addColumnPathMap(DtlR.$inst_d_rmrks, MST_XFR_INST_SEND_IF_R.$inst_d_rmrks);
				addColumnPathMap(DtlR.$sub_char1, MST_XFR_INST_SEND_IF_R.$sub_char1);
				addColumnPathMap(DtlR.$sub_char2, MST_XFR_INST_SEND_IF_R.$sub_char2);
				addColumnPathMap(DtlR.$sub_char3, MST_XFR_INST_SEND_IF_R.$sub_char3);
				addColumnPathMap(DtlR.$sub_char4, MST_XFR_INST_SEND_IF_R.$sub_char4);
				addColumnPathMap(DtlR.$sub_char5, MST_XFR_INST_SEND_IF_R.$sub_char5);
				addColumnPathMap(DtlR.$sub_char6, MST_XFR_INST_SEND_IF_R.$sub_char6);
				addColumnPathMap(DtlR.$sub_char7, MST_XFR_INST_SEND_IF_R.$sub_char7);
				addColumnPathMap(DtlR.$sub_char8, MST_XFR_INST_SEND_IF_R.$sub_char8);
				addColumnPathMap(DtlR.$sub_char9, MST_XFR_INST_SEND_IF_R.$sub_char9);
				addColumnPathMap(DtlR.$sub_char10, MST_XFR_INST_SEND_IF_R.$sub_char10);
				addColumnPathMap(DtlR.$sub_char11, MST_XFR_INST_SEND_IF_R.$sub_char11);
				addColumnPathMap(DtlR.$sub_char12, MST_XFR_INST_SEND_IF_R.$sub_char12);
				addColumnPathMap(DtlR.$sub_char13, MST_XFR_INST_SEND_IF_R.$sub_char13);
				addColumnPathMap(DtlR.$sub_char14, MST_XFR_INST_SEND_IF_R.$sub_char14);
				addColumnPathMap(DtlR.$sub_char15, MST_XFR_INST_SEND_IF_R.$sub_char15);
				addColumnPathMap(DtlR.$sub_char16, MST_XFR_INST_SEND_IF_R.$sub_char16);
				addColumnPathMap(DtlR.$sub_char17, MST_XFR_INST_SEND_IF_R.$sub_char17);
				addColumnPathMap(DtlR.$sub_char18, MST_XFR_INST_SEND_IF_R.$sub_char18);
				addColumnPathMap(DtlR.$sub_char19, MST_XFR_INST_SEND_IF_R.$sub_char19);
				addColumnPathMap(DtlR.$sub_char20, MST_XFR_INST_SEND_IF_R.$sub_char20);
				addColumnPathMap(DtlR.$sub_char21, MST_XFR_INST_SEND_IF_R.$sub_char21);
				addColumnPathMap(DtlR.$sub_char22, MST_XFR_INST_SEND_IF_R.$sub_char22);
				addColumnPathMap(DtlR.$sub_char23, MST_XFR_INST_SEND_IF_R.$sub_char23);
				addColumnPathMap(DtlR.$sub_char24, MST_XFR_INST_SEND_IF_R.$sub_char24);
				addColumnPathMap(DtlR.$sub_char25, MST_XFR_INST_SEND_IF_R.$sub_char25);
				addColumnPathMap(DtlR.$sub_char26, MST_XFR_INST_SEND_IF_R.$sub_char26);
				addColumnPathMap(DtlR.$sub_char27, MST_XFR_INST_SEND_IF_R.$sub_char27);
				addColumnPathMap(DtlR.$sub_char28, MST_XFR_INST_SEND_IF_R.$sub_char28);
				addColumnPathMap(DtlR.$sub_char29, MST_XFR_INST_SEND_IF_R.$sub_char29);
				addColumnPathMap(DtlR.$sub_char30, MST_XFR_INST_SEND_IF_R.$sub_char30);
				addColumnPathMap(DtlR.$sub_num1, MST_XFR_INST_SEND_IF_R.$sub_num1);
				addColumnPathMap(DtlR.$sub_num2, MST_XFR_INST_SEND_IF_R.$sub_num2);
				addColumnPathMap(DtlR.$sub_num3, MST_XFR_INST_SEND_IF_R.$sub_num3);
				addColumnPathMap(DtlR.$sub_num4, MST_XFR_INST_SEND_IF_R.$sub_num4);
				addColumnPathMap(DtlR.$sub_num5, MST_XFR_INST_SEND_IF_R.$sub_num5);
				addColumnPathMap(DtlR.$sub_dt1, MST_XFR_INST_SEND_IF_R.$sub_dt1);
				addColumnPathMap(DtlR.$sub_dt2, MST_XFR_INST_SEND_IF_R.$sub_dt2);
				addColumnPathMap(DtlR.$sub_dt3, MST_XFR_INST_SEND_IF_R.$sub_dt3);
				addColumnPathMap(DtlR.$sub_dt4, MST_XFR_INST_SEND_IF_R.$sub_dt4);
				addColumnPathMap(DtlR.$sub_dt5, MST_XFR_INST_SEND_IF_R.$sub_dt5);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.trd_typ_cd(MAC_IF_TRD_TYP_CD.WMS_XFR_INST_SEND.value());
				dest.data_make_dt(src.ins_ts().toMCDate());
				dest.dpstr_cd(src.if_co_cd());
				dest.dpstr_nm(src.co_nm());
				dest.site_co_cd(src.if_site_co_cd());
				dest.site_co_nm(src.site_co_nm());
				dest.trd_cd(src.if_trd_cd());
				dest.inst_dpt_cd(src.if_inst_dpt_cd());
				dest.inst_usr_cd(src.if_inst_usr_cd());
				dest.lg_grp_cd(src.if_lg_grp_cd());
				dest.gi_loc_cd(src.if_gi_loc_cd());
				dest.gi_str_ln_cd(src.if_gi_str_ln_cd());
				dest.gr_loc_cd(src.if_gr_loc_cd());
				dest.gr_str_ln_cd(src.if_gr_str_ln_cd());
				dest.itm_cd(src.if_itm_cd());
				dest.itm_sub1(src.if_itm_sub1());
				dest.itm_sub2(src.if_itm_sub2());
				dest.itm_sub3(src.if_itm_sub3());
				dest.gd_cd(src.if_gd_cd());
				dest.stk_bp_cd(src.if_stk_bp_cd());
				dest.trd_unit_cd(src.if_trd_unit_cd());
				dest.base_unit_cd(src.if_base_unit_cd());
				dest.rsn_cd(src.if_rsn_cd());
				dest.bd_dpt_cd(src.if_bd_dpt_cd());
			}
		}
	}

	//FMCB CUSTOM END
}