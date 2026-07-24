package mcframe.serverMSLA.MSLAL8030;

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
import mcframe.commonMSLA.MSLAR1030.*;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_ArrSchdSendConvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_ArrSchdSendConvService_MC extends MSLAL_ArrSchdSendConvService_MC_A{
	//FMCB CUSTOM START

	/**
	 * ArrSchdSendConv_Conv01オペレーション.<p>
	 *
	 */
	public class ArrSchdSendConv_Conv01 extends MSLAL_ArrSchdSendConvService_MC_A.ArrSchdSendConv_Conv01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		@SuppressWarnings("unchecked")
		protected void crtIfDBC() {
			_ifDBC = PFBZL_CodeConvert.crtSendIfDBContainer(MST_ARR_SCHD_SEND_IF_R.class);
		}


		@Override
		protected void setCnvIfCols() {
			_ifDBC.addCnvCol("co_cd", MAC_IF_COL_TYP.CO);
			_ifDBC.addCnvCol("trd_cd", MAC_IF_COL_TYP.TRD);
			_ifDBC.addCnvCol("site_co_cd", MAC_IF_COL_TYP.SITE_CO);
			_ifDBC.addCnvCol("arr_lg_grp_cd", MAC_IF_COL_TYP.LG_GRP);
			_ifDBC.addCnvCol("arr_loc_cd", MAC_IF_COL_TYP.SHIP_TO_ID);
			_ifDBC.addCnvCol("arr_str_ln_cd", MAC_IF_COL_TYP.STR_LN);
			_ifDBC.addCnvItmCol("itm_cd", "itm_sub1", "itm_sub2", "itm_sub3");
			_ifDBC.addCnvCol("gd_cd", MAC_IF_COL_TYP.GD);
			_ifDBC.addCnvCol("stk_bp_cd", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("trd_unit_cd", MAC_IF_COL_TYP.UNIT);
			_ifDBC.addCnvCol("wt_unit_cd", MAC_IF_COL_TYP.UNIT);
			_ifDBC.addCnvCol("dim_unit_cd", MAC_IF_COL_TYP.UNIT);
			_ifDBC.addCnvCol("base_unit_cd", MAC_IF_COL_TYP.UNIT);
			_ifDBC.addCnvCol("cst_cd", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("sppl_cd", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("ship_lg_grp_cd", MAC_IF_COL_TYP.LG_GRP);
			_ifDBC.addCnvCol("maker_cd", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("rsn_cd", MAC_IF_COL_TYP.BIZ_RSN);
		}

	}
	/**
	 * ArrSchdSendConv_Conv02オペレーション.<p>
	 *
	 */
	public class ArrSchdSendConv_Conv02 extends MSLAL_ArrSchdSendConvService_MC_A.ArrSchdSendConv_Conv02 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		@SuppressWarnings({
				"unchecked", "rawtypes"
		})
		protected void crtRptSet() {
			_IfRptSet = PFBZL_FileOutput.createIfSendReportSet(DtlR.class, MST_ARR_SCHD_SEND_IF_R.class);
			_IfRptSet.setReportSet(MSLAR_ArrSchdPrnt.create());
			_IfRptSet.setRowMapper(new Map_DtlR_MST_ARR_SCHD_SEND_IF_R());
		}
		public class Map_DtlR_MST_ARR_SCHD_SEND_IF_R<D extends DtlR, S extends MST_ARR_SCHD_SEND_IF_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(DtlR.$data_lno, MST_ARR_SCHD_SEND_IF_R.$data_lno);
				addColumnPathMap(DtlR.$data_no, MST_ARR_SCHD_SEND_IF_R.$data_no);
				addColumnPathMap(DtlR.$data_crud_typ, MST_ARR_SCHD_SEND_IF_R.$data_crud_typ);
				addColumnPathMap(DtlR.$site_co_nm, MST_ARR_SCHD_SEND_IF_R.$site_co_nm);
				addColumnPathMap(DtlR.$arr_lg_grp_nm, MST_ARR_SCHD_SEND_IF_R.$arr_lg_grp_nm);
				addColumnPathMap(DtlR.$arr_schd_no, MST_ARR_SCHD_SEND_IF_R.$arr_schd_no);
				addColumnPathMap(DtlR.$po_no, MST_ARR_SCHD_SEND_IF_R.$po_no);
				addColumnPathMap(DtlR.$po_d_no, MST_ARR_SCHD_SEND_IF_R.$po_d_no);
				addColumnPathMap(DtlR.$dlv_inst_no, MST_ARR_SCHD_SEND_IF_R.$dlv_inst_no);
				addColumnPathMap(DtlR.$dlv_inst_d_no, MST_ARR_SCHD_SEND_IF_R.$dlv_inst_d_no);
				addColumnPathMap(DtlR.$prms_rcpt_no, MST_ARR_SCHD_SEND_IF_R.$prms_rcpt_no);
				addColumnPathMap(DtlR.$prms_rcpt_d_no, MST_ARR_SCHD_SEND_IF_R.$prms_rcpt_d_no);
				addColumnPathMap(DtlR.$purc_act_no, MST_ARR_SCHD_SEND_IF_R.$purc_act_no);
				addColumnPathMap(DtlR.$purc_act_d_no, MST_ARR_SCHD_SEND_IF_R.$purc_act_d_no);
				addColumnPathMap(DtlR.$purc_act_io_no, MST_ARR_SCHD_SEND_IF_R.$purc_act_io_no);
				addColumnPathMap(DtlR.$rcpt_iv_no, MST_ARR_SCHD_SEND_IF_R.$rcpt_iv_no);
				addColumnPathMap(DtlR.$sls_ret_schd_no, MST_ARR_SCHD_SEND_IF_R.$sls_ret_schd_no);
				addColumnPathMap(DtlR.$sls_ret_schd_d_no, MST_ARR_SCHD_SEND_IF_R.$sls_ret_schd_d_no);
				addColumnPathMap(DtlR.$dlv_slip_no, MST_ARR_SCHD_SEND_IF_R.$dlv_slip_no);
				addColumnPathMap(DtlR.$dlv_slip_d_no, MST_ARR_SCHD_SEND_IF_R.$dlv_slip_d_no);
				addColumnPathMap(DtlR.$iv_no, MST_ARR_SCHD_SEND_IF_R.$iv_no);
				addColumnPathMap(DtlR.$iv_d_no, MST_ARR_SCHD_SEND_IF_R.$iv_d_no);
				addColumnPathMap(DtlR.$trd_nm, MST_ARR_SCHD_SEND_IF_R.$trd_nm);
				addColumnPathMap(DtlR.$trd_ptn_typ, MST_ARR_SCHD_SEND_IF_R.$trd_ptn_typ);
				addColumnPathMap(DtlR.$arr_loc_nm, MST_ARR_SCHD_SEND_IF_R.$arr_loc_nm);
				addColumnPathMap(DtlR.$arr_str_ln_nm, MST_ARR_SCHD_SEND_IF_R.$arr_str_ln_nm);
				addColumnPathMap(DtlR.$itm_nm, MST_ARR_SCHD_SEND_IF_R.$itm_nm);
				addColumnPathMap(DtlR.$lot_no, MST_ARR_SCHD_SEND_IF_R.$lot_no);
				addColumnPathMap(DtlR.$sublot_no, MST_ARR_SCHD_SEND_IF_R.$sublot_no);
				addColumnPathMap(DtlR.$ver_no, MST_ARR_SCHD_SEND_IF_R.$ver_no);
				addColumnPathMap(DtlR.$sno1, MST_ARR_SCHD_SEND_IF_R.$sno1);
				addColumnPathMap(DtlR.$sno2, MST_ARR_SCHD_SEND_IF_R.$sno2);
				addColumnPathMap(DtlR.$sno3, MST_ARR_SCHD_SEND_IF_R.$sno3);
				addColumnPathMap(DtlR.$sno4, MST_ARR_SCHD_SEND_IF_R.$sno4);
				addColumnPathMap(DtlR.$gd_nm, MST_ARR_SCHD_SEND_IF_R.$gd_nm);
				addColumnPathMap(DtlR.$quality_typ, MST_ARR_SCHD_SEND_IF_R.$quality_typ);
				addColumnPathMap(DtlR.$stk_insp_typ, MST_ARR_SCHD_SEND_IF_R.$stk_insp_typ);
				addColumnPathMap(DtlR.$stk_id_typ, MST_ARR_SCHD_SEND_IF_R.$stk_id_typ);
				addColumnPathMap(DtlR.$stk_bp_nm, MST_ARR_SCHD_SEND_IF_R.$stk_bp_nm);
				addColumnPathMap(DtlR.$trd_unit_qty, MST_ARR_SCHD_SEND_IF_R.$trd_unit_qty);
				addColumnPathMap(DtlR.$trd_unit_nm, MST_ARR_SCHD_SEND_IF_R.$trd_unit_nm);
				addColumnPathMap(DtlR.$trd_unit_bnum, MST_ARR_SCHD_SEND_IF_R.$trd_unit_bnum);
				addColumnPathMap(DtlR.$trd_unit_wt, MST_ARR_SCHD_SEND_IF_R.$trd_unit_wt);
				addColumnPathMap(DtlR.$trd_unit_dim, MST_ARR_SCHD_SEND_IF_R.$trd_unit_dim);
				addColumnPathMap(DtlR.$wt_unit_nm, MST_ARR_SCHD_SEND_IF_R.$wt_unit_nm);
				addColumnPathMap(DtlR.$dim_unit_nm, MST_ARR_SCHD_SEND_IF_R.$dim_unit_nm);
				addColumnPathMap(DtlR.$base_unit_qty, MST_ARR_SCHD_SEND_IF_R.$base_unit_qty);
				addColumnPathMap(DtlR.$base_unit_nm, MST_ARR_SCHD_SEND_IF_R.$base_unit_nm);
				addColumnPathMap(DtlR.$abort_flg, MST_ARR_SCHD_SEND_IF_R.$abort_flg);
				addColumnPathMap(DtlR.$vld_dt, MST_ARR_SCHD_SEND_IF_R.$vld_dt);
				addColumnPathMap(DtlR.$lmt_dt, MST_ARR_SCHD_SEND_IF_R.$lmt_dt);
				addColumnPathMap(DtlR.$sppl_nm, MST_ARR_SCHD_SEND_IF_R.$sppl_nm);
				addColumnPathMap(DtlR.$cst_nm, MST_ARR_SCHD_SEND_IF_R.$cst_nm);
				addColumnPathMap(DtlR.$ship_lg_grp_nm, MST_ARR_SCHD_SEND_IF_R.$ship_lg_grp_nm);
				addColumnPathMap(DtlR.$sppl_itm_cd, MST_ARR_SCHD_SEND_IF_R.$sppl_itm_cd);
				addColumnPathMap(DtlR.$sppl_itm_nm, MST_ARR_SCHD_SEND_IF_R.$sppl_itm_nm);
				addColumnPathMap(DtlR.$maker_nm, MST_ARR_SCHD_SEND_IF_R.$maker_nm);
				addColumnPathMap(DtlR.$bp_lot_no, MST_ARR_SCHD_SEND_IF_R.$bp_lot_no);
				addColumnPathMap(DtlR.$rsn_nm, MST_ARR_SCHD_SEND_IF_R.$rsn_nm);
				addColumnPathMap(DtlR.$arr_cnt_rmrks, MST_ARR_SCHD_SEND_IF_R.$arr_cnt_rmrks);
				addColumnPathMap(DtlR.$sub_char1, MST_ARR_SCHD_SEND_IF_R.$sub_char1);
				addColumnPathMap(DtlR.$sub_char2, MST_ARR_SCHD_SEND_IF_R.$sub_char2);
				addColumnPathMap(DtlR.$sub_char3, MST_ARR_SCHD_SEND_IF_R.$sub_char3);
				addColumnPathMap(DtlR.$sub_char4, MST_ARR_SCHD_SEND_IF_R.$sub_char4);
				addColumnPathMap(DtlR.$sub_char5, MST_ARR_SCHD_SEND_IF_R.$sub_char5);
				addColumnPathMap(DtlR.$sub_char6, MST_ARR_SCHD_SEND_IF_R.$sub_char6);
				addColumnPathMap(DtlR.$sub_char7, MST_ARR_SCHD_SEND_IF_R.$sub_char7);
				addColumnPathMap(DtlR.$sub_char8, MST_ARR_SCHD_SEND_IF_R.$sub_char8);
				addColumnPathMap(DtlR.$sub_char9, MST_ARR_SCHD_SEND_IF_R.$sub_char9);
				addColumnPathMap(DtlR.$sub_char10, MST_ARR_SCHD_SEND_IF_R.$sub_char10);
				addColumnPathMap(DtlR.$sub_char11, MST_ARR_SCHD_SEND_IF_R.$sub_char11);
				addColumnPathMap(DtlR.$sub_char12, MST_ARR_SCHD_SEND_IF_R.$sub_char12);
				addColumnPathMap(DtlR.$sub_char13, MST_ARR_SCHD_SEND_IF_R.$sub_char13);
				addColumnPathMap(DtlR.$sub_char14, MST_ARR_SCHD_SEND_IF_R.$sub_char14);
				addColumnPathMap(DtlR.$sub_char15, MST_ARR_SCHD_SEND_IF_R.$sub_char15);
				addColumnPathMap(DtlR.$sub_char16, MST_ARR_SCHD_SEND_IF_R.$sub_char16);
				addColumnPathMap(DtlR.$sub_char17, MST_ARR_SCHD_SEND_IF_R.$sub_char17);
				addColumnPathMap(DtlR.$sub_char18, MST_ARR_SCHD_SEND_IF_R.$sub_char18);
				addColumnPathMap(DtlR.$sub_char19, MST_ARR_SCHD_SEND_IF_R.$sub_char19);
				addColumnPathMap(DtlR.$sub_char20, MST_ARR_SCHD_SEND_IF_R.$sub_char20);
				addColumnPathMap(DtlR.$sub_char21, MST_ARR_SCHD_SEND_IF_R.$sub_char21);
				addColumnPathMap(DtlR.$sub_char22, MST_ARR_SCHD_SEND_IF_R.$sub_char22);
				addColumnPathMap(DtlR.$sub_char23, MST_ARR_SCHD_SEND_IF_R.$sub_char23);
				addColumnPathMap(DtlR.$sub_char24, MST_ARR_SCHD_SEND_IF_R.$sub_char24);
				addColumnPathMap(DtlR.$sub_char25, MST_ARR_SCHD_SEND_IF_R.$sub_char25);
				addColumnPathMap(DtlR.$sub_char26, MST_ARR_SCHD_SEND_IF_R.$sub_char26);
				addColumnPathMap(DtlR.$sub_char27, MST_ARR_SCHD_SEND_IF_R.$sub_char27);
				addColumnPathMap(DtlR.$sub_char28, MST_ARR_SCHD_SEND_IF_R.$sub_char28);
				addColumnPathMap(DtlR.$sub_char29, MST_ARR_SCHD_SEND_IF_R.$sub_char29);
				addColumnPathMap(DtlR.$sub_char30, MST_ARR_SCHD_SEND_IF_R.$sub_char30);
				addColumnPathMap(DtlR.$sub_num1, MST_ARR_SCHD_SEND_IF_R.$sub_num1);
				addColumnPathMap(DtlR.$sub_num2, MST_ARR_SCHD_SEND_IF_R.$sub_num2);
				addColumnPathMap(DtlR.$sub_num3, MST_ARR_SCHD_SEND_IF_R.$sub_num3);
				addColumnPathMap(DtlR.$sub_num4, MST_ARR_SCHD_SEND_IF_R.$sub_num4);
				addColumnPathMap(DtlR.$sub_num5, MST_ARR_SCHD_SEND_IF_R.$sub_num5);
				addColumnPathMap(DtlR.$sub_dt1, MST_ARR_SCHD_SEND_IF_R.$sub_dt1);
				addColumnPathMap(DtlR.$sub_dt2, MST_ARR_SCHD_SEND_IF_R.$sub_dt2);
				addColumnPathMap(DtlR.$sub_dt3, MST_ARR_SCHD_SEND_IF_R.$sub_dt3);
				addColumnPathMap(DtlR.$sub_dt4, MST_ARR_SCHD_SEND_IF_R.$sub_dt4);
				addColumnPathMap(DtlR.$sub_dt5, MST_ARR_SCHD_SEND_IF_R.$sub_dt5);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.trd_typ_cd(MAC_IF_TRD_TYP_CD.WMS_ARR_SCHD_SEND.value());
				dest.data_make_dt(src.ins_ts().toMCDate());
				dest.dpstr_cd(src.if_co_cd());
				dest.dpstr_nm(src.co_nm());
				dest.site_co_cd(src.if_site_co_cd());
				dest.arr_lg_grp_cd(src.if_arr_lg_grp_cd());
				dest.trd_cd(src.if_trd_cd());
				dest.arr_loc_cd(src.if_arr_loc_cd());
				dest.arr_schd_dt(getDt(src.arr_schd_tm()));
				dest.arr_schd_hm(getHm(src.arr_schd_tm()));
				dest.arr_str_ln_cd(src.if_arr_str_ln_cd());
				dest.itm_cd(src.if_itm_cd());
				dest.itm_sub1(src.if_itm_sub1());
				dest.itm_sub2(src.if_itm_sub2());
				dest.itm_sub3(src.if_itm_sub3());
				dest.gd_cd(src.if_gd_cd());
				dest.stk_bp_cd(src.if_stk_bp_cd());
				dest.trd_unit_cd(src.if_trd_unit_cd());
				dest.wt_unit_cd(src.if_wt_unit_cd());
				dest.dim_unit_cd(src.if_dim_unit_cd());
				dest.base_unit_cd(src.if_base_unit_cd());
				dest.sppl_cd(src.if_sppl_cd());
				dest.cst_cd(src.if_cst_cd());
				dest.ship_lg_grp_cd(src.if_ship_lg_grp_cd());
				dest.maker_cd(src.if_maker_cd());
				dest.rsn_cd(src.if_rsn_cd());

			}
		}
	}

	//FMCB CUSTOM END
}