package mcframe.serverMSLA.MSLAL8010;

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
import mcframe.commonMSLA.MSLAR1010.*;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_ShipInstSendConvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_ShipInstSendConvService_MC extends MSLAL_ShipInstSendConvService_MC_A{
	//FMCB CUSTOM START

	/**
	 * ShipInstSendConv_Conv01オペレーション.<p>
	 *
	 */
	public class ShipInstSendConv_Conv01 extends MSLAL_ShipInstSendConvService_MC_A.ShipInstSendConv_Conv01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		@SuppressWarnings("unchecked")
		protected void crtIfDBC() {
			_ifDBC = PFBZL_CodeConvert.crtSendIfDBContainer(MST_SHIP_INST_SEND_IF_R.class);
		}
		
		@Override
		protected void setCnvIfCols() {
			_ifDBC.addCnvCol("co_cd", MAC_IF_COL_TYP.CO);
			_ifDBC.addCnvCol("ship_fr_lg_grp_cd", MAC_IF_COL_TYP.LG_GRP);
			_ifDBC.addCnvCol("ship_wk_cd", MAC_IF_COL_TYP.SHIP_WK);
			_ifDBC.addCnvCol("ship_term_cd", MAC_IF_COL_TYP.SHIP_TERM);
			_ifDBC.addCnvCol("ship_to_lg_grp_cd", MAC_IF_COL_TYP.LG_GRP);
			_ifDBC.addCnvCol("ship_to_id_cd", MAC_IF_COL_TYP.SHIP_TO_ID);
			_ifDBC.addCnvCol("dlv_id_cd", MAC_IF_COL_TYP.SHIP_TO_ID);
			_ifDBC.addCnvCol("cst_cd", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("dest_cd1", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("dest_cd2", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("dest_cd3", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("inst_dpt_cd", MAC_IF_COL_TYP.DPT);
			_ifDBC.addCnvCol("inst_usr_cd", MAC_IF_COL_TYP.USR);
			_ifDBC.addCnvCol("trd_cd", MAC_IF_COL_TYP.TRD);
			_ifDBC.addCnvCol("ship_loc_cd", MAC_IF_COL_TYP.SHIP_TO_ID);
			_ifDBC.addCnvCol("ship_str_ln_cd", MAC_IF_COL_TYP.STR_LN);
			_ifDBC.addCnvItmCol("itm_cd", "itm_sub1", "itm_sub2", "itm_sub3");
			_ifDBC.addCnvCol("gd_cd", MAC_IF_COL_TYP.GD);
			_ifDBC.addCnvCol("stk_bp_cd", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("ent_unit_cd", MAC_IF_COL_TYP.UNIT);
			_ifDBC.addCnvCol("wt_unit_cd", MAC_IF_COL_TYP.UNIT);
			_ifDBC.addCnvCol("dim_unit_cd", MAC_IF_COL_TYP.UNIT);
			_ifDBC.addCnvCol("trd_unit_cd", MAC_IF_COL_TYP.UNIT);
			_ifDBC.addCnvCol("base_unit_cd", MAC_IF_COL_TYP.UNIT);
			_ifDBC.addCnvCol("pack_unit_cd", MAC_IF_COL_TYP.UNIT);
			_ifDBC.addCnvCol("site_co_cd", MAC_IF_COL_TYP.SITE_CO);
			_ifDBC.addCnvCol("rsn_cd", MAC_IF_COL_TYP.BIZ_RSN);
		}

	}
	/**
	 * ShipInstSendConv_Conv02オペレーション.<p>
	 *
	 */
	public class ShipInstSendConv_Conv02 extends MSLAL_ShipInstSendConvService_MC_A.ShipInstSendConv_Conv02 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		@SuppressWarnings({
				"unchecked", "rawtypes"
		})
		protected void crtRptSet() {
			_IfRptSet = PFBZL_FileOutput.createIfSendReportSet(DtlR.class, MST_SHIP_INST_SEND_IF_R.class);
			_IfRptSet.setReportSet(MSLAR_ShipInstPrnt.create());
			_IfRptSet.setRowMapper(new Map_DtlR_MST_SHIP_INST_SEND_IF_R());
		}
		public class Map_DtlR_MST_SHIP_INST_SEND_IF_R<D extends DtlR, S extends MST_SHIP_INST_SEND_IF_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(DtlR.$data_lno, MST_SHIP_INST_SEND_IF_R.$data_lno);
				addColumnPathMap(DtlR.$data_no, MST_SHIP_INST_SEND_IF_R.$data_no);
				addColumnPathMap(DtlR.$data_crud_typ, MST_SHIP_INST_SEND_IF_R.$data_crud_typ);
				addColumnPathMap(DtlR.$ship_inst_no, MST_SHIP_INST_SEND_IF_R.$ship_inst_no);
				addColumnPathMap(DtlR.$ship_inst_rev, MST_SHIP_INST_SEND_IF_R.$ship_inst_rev);
				addColumnPathMap(DtlR.$ship_fr_lg_grp_nm, MST_SHIP_INST_SEND_IF_R.$ship_fr_lg_grp_nm);
				addColumnPathMap(DtlR.$ship_wk_nm, MST_SHIP_INST_SEND_IF_R.$ship_wk_nm);
				addColumnPathMap(DtlR.$ship_term_nm, MST_SHIP_INST_SEND_IF_R.$ship_term_nm);
				addColumnPathMap(DtlR.$ship_to_lg_grp_nm, MST_SHIP_INST_SEND_IF_R.$ship_to_lg_grp_nm);
				addColumnPathMap(DtlR.$ship_to_id_typ, MST_SHIP_INST_SEND_IF_R.$ship_to_id_typ);
				addColumnPathMap(DtlR.$ship_to_id_nm, MST_SHIP_INST_SEND_IF_R.$ship_to_id_nm);
				addColumnPathMap(DtlR.$ship_to_zip_cd, MST_SHIP_INST_SEND_IF_R.$ship_to_zip_cd);
				addColumnPathMap(DtlR.$ship_to_addr1, MST_SHIP_INST_SEND_IF_R.$ship_to_addr1);
				addColumnPathMap(DtlR.$ship_to_addr2, MST_SHIP_INST_SEND_IF_R.$ship_to_addr2);
				addColumnPathMap(DtlR.$ship_to_addr3, MST_SHIP_INST_SEND_IF_R.$ship_to_addr3);
				addColumnPathMap(DtlR.$ship_to_addr4, MST_SHIP_INST_SEND_IF_R.$ship_to_addr4);
				addColumnPathMap(DtlR.$ship_to_cntct_psn, MST_SHIP_INST_SEND_IF_R.$ship_to_cntct_psn);
				addColumnPathMap(DtlR.$ship_to_tel, MST_SHIP_INST_SEND_IF_R.$ship_to_tel);
				addColumnPathMap(DtlR.$ship_to_fax, MST_SHIP_INST_SEND_IF_R.$ship_to_fax);
				addColumnPathMap(DtlR.$ship_to_sundry_flg, MST_SHIP_INST_SEND_IF_R.$ship_to_sundry_flg);
				addColumnPathMap(DtlR.$dlv_id_typ, MST_SHIP_INST_SEND_IF_R.$dlv_id_typ);
				addColumnPathMap(DtlR.$dlv_id_nm, MST_SHIP_INST_SEND_IF_R.$dlv_id_nm);
				addColumnPathMap(DtlR.$cst_nm, MST_SHIP_INST_SEND_IF_R.$cst_nm);
				addColumnPathMap(DtlR.$dest_nm1, MST_SHIP_INST_SEND_IF_R.$dest_nm1);
				addColumnPathMap(DtlR.$dest_nm2, MST_SHIP_INST_SEND_IF_R.$dest_nm2);
				addColumnPathMap(DtlR.$dest_nm3, MST_SHIP_INST_SEND_IF_R.$dest_nm3);
				addColumnPathMap(DtlR.$inst_dpt_nm, MST_SHIP_INST_SEND_IF_R.$inst_dpt_nm);
				addColumnPathMap(DtlR.$inst_usr_nm, MST_SHIP_INST_SEND_IF_R.$inst_usr_nm);
				addColumnPathMap(DtlR.$ship_inst_d_no, MST_SHIP_INST_SEND_IF_R.$ship_inst_d_no);
				addColumnPathMap(DtlR.$ship_alloc_sts_no, MST_SHIP_INST_SEND_IF_R.$ship_alloc_sts_no);
				addColumnPathMap(DtlR.$iv_no, MST_SHIP_INST_SEND_IF_R.$iv_no);
				addColumnPathMap(DtlR.$iv_d_no, MST_SHIP_INST_SEND_IF_R.$iv_d_no);
				addColumnPathMap(DtlR.$dlv_slip_no, MST_SHIP_INST_SEND_IF_R.$dlv_slip_no);
				addColumnPathMap(DtlR.$dlv_slip_d_no, MST_SHIP_INST_SEND_IF_R.$dlv_slip_d_no);
				addColumnPathMap(DtlR.$trd_nm, MST_SHIP_INST_SEND_IF_R.$trd_nm);
				addColumnPathMap(DtlR.$trd_ptn_typ, MST_SHIP_INST_SEND_IF_R.$trd_ptn_typ);
				addColumnPathMap(DtlR.$ship_loc_nm, MST_SHIP_INST_SEND_IF_R.$ship_loc_nm);
				addColumnPathMap(DtlR.$ship_str_ln_nm, MST_SHIP_INST_SEND_IF_R.$ship_str_ln_nm);
				addColumnPathMap(DtlR.$ship_loc_tel, MST_SHIP_INST_SEND_IF_R.$ship_loc_tel);
				addColumnPathMap(DtlR.$ship_loc_fax, MST_SHIP_INST_SEND_IF_R.$ship_loc_fax);
				addColumnPathMap(DtlR.$assort_flg, MST_SHIP_INST_SEND_IF_R.$assort_flg);
				addColumnPathMap(DtlR.$set_itm_grp_no, MST_SHIP_INST_SEND_IF_R.$set_itm_grp_no);
				addColumnPathMap(DtlR.$itm_nm, MST_SHIP_INST_SEND_IF_R.$itm_nm);
				addColumnPathMap(DtlR.$lot_no, MST_SHIP_INST_SEND_IF_R.$lot_no);
				addColumnPathMap(DtlR.$sublot_no, MST_SHIP_INST_SEND_IF_R.$sublot_no);
				addColumnPathMap(DtlR.$ver_no, MST_SHIP_INST_SEND_IF_R.$ver_no);
				addColumnPathMap(DtlR.$sno1, MST_SHIP_INST_SEND_IF_R.$sno1);
				addColumnPathMap(DtlR.$sno1_null_flg, MST_SHIP_INST_SEND_IF_R.$sno1_null_flg);
				addColumnPathMap(DtlR.$sno2, MST_SHIP_INST_SEND_IF_R.$sno2);
				addColumnPathMap(DtlR.$sno2_null_flg, MST_SHIP_INST_SEND_IF_R.$sno2_null_flg);
				addColumnPathMap(DtlR.$sno3, MST_SHIP_INST_SEND_IF_R.$sno3);
				addColumnPathMap(DtlR.$sno3_null_flg, MST_SHIP_INST_SEND_IF_R.$sno3_null_flg);
				addColumnPathMap(DtlR.$sno4, MST_SHIP_INST_SEND_IF_R.$sno4);
				addColumnPathMap(DtlR.$sno4_null_flg, MST_SHIP_INST_SEND_IF_R.$sno4_null_flg);
				addColumnPathMap(DtlR.$gd_nm, MST_SHIP_INST_SEND_IF_R.$gd_nm);
				addColumnPathMap(DtlR.$quality_typ, MST_SHIP_INST_SEND_IF_R.$quality_typ);
				addColumnPathMap(DtlR.$stk_insp_typ, MST_SHIP_INST_SEND_IF_R.$stk_insp_typ);
				addColumnPathMap(DtlR.$stk_id_typ, MST_SHIP_INST_SEND_IF_R.$stk_id_typ);
				addColumnPathMap(DtlR.$stk_bp_nm, MST_SHIP_INST_SEND_IF_R.$stk_bp_nm);
				addColumnPathMap(DtlR.$ent_unit_qty, MST_SHIP_INST_SEND_IF_R.$ent_unit_qty);
				addColumnPathMap(DtlR.$ent_unit_nm, MST_SHIP_INST_SEND_IF_R.$ent_unit_nm);
				addColumnPathMap(DtlR.$ent_unit_bnum, MST_SHIP_INST_SEND_IF_R.$ent_unit_bnum);
				addColumnPathMap(DtlR.$ent_unit_wt, MST_SHIP_INST_SEND_IF_R.$ent_unit_wt);
				addColumnPathMap(DtlR.$ent_unit_dim, MST_SHIP_INST_SEND_IF_R.$ent_unit_dim);
				addColumnPathMap(DtlR.$wt_unit_nm, MST_SHIP_INST_SEND_IF_R.$wt_unit_nm);
				addColumnPathMap(DtlR.$dim_unit_nm, MST_SHIP_INST_SEND_IF_R.$dim_unit_nm);
				addColumnPathMap(DtlR.$trd_unit_qty, MST_SHIP_INST_SEND_IF_R.$trd_unit_qty);
				addColumnPathMap(DtlR.$trd_unit_nm, MST_SHIP_INST_SEND_IF_R.$trd_unit_nm);
				addColumnPathMap(DtlR.$base_unit_qty, MST_SHIP_INST_SEND_IF_R.$base_unit_qty);
				addColumnPathMap(DtlR.$base_unit_nm, MST_SHIP_INST_SEND_IF_R.$base_unit_nm);
				addColumnPathMap(DtlR.$pack_unit_qty, MST_SHIP_INST_SEND_IF_R.$pack_unit_qty);
				addColumnPathMap(DtlR.$pack_unit_nm, MST_SHIP_INST_SEND_IF_R.$pack_unit_nm);
				addColumnPathMap(DtlR.$alloc_flg, MST_SHIP_INST_SEND_IF_R.$alloc_flg);
				addColumnPathMap(DtlR.$abort_flg, MST_SHIP_INST_SEND_IF_R.$abort_flg);
				addColumnPathMap(DtlR.$sls_acxfr_flg, MST_SHIP_INST_SEND_IF_R.$sls_acxfr_flg);
				addColumnPathMap(DtlR.$sls_cststk_flg, MST_SHIP_INST_SEND_IF_R.$sls_cststk_flg);
				addColumnPathMap(DtlR.$vmi_flg, MST_SHIP_INST_SEND_IF_R.$vmi_flg);
				addColumnPathMap(DtlR.$vld_dt, MST_SHIP_INST_SEND_IF_R.$vld_dt);
				addColumnPathMap(DtlR.$lmt_dt, MST_SHIP_INST_SEND_IF_R.$lmt_dt);
				addColumnPathMap(DtlR.$first_gr_dt, MST_SHIP_INST_SEND_IF_R.$first_gr_dt);
				addColumnPathMap(DtlR.$cst_itm_cd, MST_SHIP_INST_SEND_IF_R.$cst_itm_cd);
				addColumnPathMap(DtlR.$cst_itm_nm, MST_SHIP_INST_SEND_IF_R.$cst_itm_nm);
				addColumnPathMap(DtlR.$prov_typ, MST_SHIP_INST_SEND_IF_R.$prov_typ);
				addColumnPathMap(DtlR.$prov_basis_typ, MST_SHIP_INST_SEND_IF_R.$prov_basis_typ);
				addColumnPathMap(DtlR.$ret_prov_typ, MST_SHIP_INST_SEND_IF_R.$ret_prov_typ);
				addColumnPathMap(DtlR.$ret_prov_basis_typ, MST_SHIP_INST_SEND_IF_R.$ret_prov_basis_typ);
				addColumnPathMap(DtlR.$rsn_nm, MST_SHIP_INST_SEND_IF_R.$rsn_nm);
				addColumnPathMap(DtlR.$inst_rmrks, MST_SHIP_INST_SEND_IF_R.$inst_rmrks);
				addColumnPathMap(DtlR.$inst_d_rmrks, MST_SHIP_INST_SEND_IF_R.$inst_d_rmrks);
				addColumnPathMap(DtlR.$ship_cnt_rmrks, MST_SHIP_INST_SEND_IF_R.$ship_cnt_rmrks);
				addColumnPathMap(DtlR.$sub_char1, MST_SHIP_INST_SEND_IF_R.$sub_char1);
				addColumnPathMap(DtlR.$sub_char2, MST_SHIP_INST_SEND_IF_R.$sub_char2);
				addColumnPathMap(DtlR.$sub_char3, MST_SHIP_INST_SEND_IF_R.$sub_char3);
				addColumnPathMap(DtlR.$sub_char4, MST_SHIP_INST_SEND_IF_R.$sub_char4);
				addColumnPathMap(DtlR.$sub_char5, MST_SHIP_INST_SEND_IF_R.$sub_char5);
				addColumnPathMap(DtlR.$sub_char6, MST_SHIP_INST_SEND_IF_R.$sub_char6);
				addColumnPathMap(DtlR.$sub_char7, MST_SHIP_INST_SEND_IF_R.$sub_char7);
				addColumnPathMap(DtlR.$sub_char8, MST_SHIP_INST_SEND_IF_R.$sub_char8);
				addColumnPathMap(DtlR.$sub_char9, MST_SHIP_INST_SEND_IF_R.$sub_char9);
				addColumnPathMap(DtlR.$sub_char10, MST_SHIP_INST_SEND_IF_R.$sub_char10);
				addColumnPathMap(DtlR.$sub_char11, MST_SHIP_INST_SEND_IF_R.$sub_char11);
				addColumnPathMap(DtlR.$sub_char12, MST_SHIP_INST_SEND_IF_R.$sub_char12);
				addColumnPathMap(DtlR.$sub_char13, MST_SHIP_INST_SEND_IF_R.$sub_char13);
				addColumnPathMap(DtlR.$sub_char14, MST_SHIP_INST_SEND_IF_R.$sub_char14);
				addColumnPathMap(DtlR.$sub_char15, MST_SHIP_INST_SEND_IF_R.$sub_char15);
				addColumnPathMap(DtlR.$sub_char16, MST_SHIP_INST_SEND_IF_R.$sub_char16);
				addColumnPathMap(DtlR.$sub_char17, MST_SHIP_INST_SEND_IF_R.$sub_char17);
				addColumnPathMap(DtlR.$sub_char18, MST_SHIP_INST_SEND_IF_R.$sub_char18);
				addColumnPathMap(DtlR.$sub_char19, MST_SHIP_INST_SEND_IF_R.$sub_char19);
				addColumnPathMap(DtlR.$sub_char20, MST_SHIP_INST_SEND_IF_R.$sub_char20);
				addColumnPathMap(DtlR.$sub_char21, MST_SHIP_INST_SEND_IF_R.$sub_char21);
				addColumnPathMap(DtlR.$sub_char22, MST_SHIP_INST_SEND_IF_R.$sub_char22);
				addColumnPathMap(DtlR.$sub_char23, MST_SHIP_INST_SEND_IF_R.$sub_char23);
				addColumnPathMap(DtlR.$sub_char24, MST_SHIP_INST_SEND_IF_R.$sub_char24);
				addColumnPathMap(DtlR.$sub_char25, MST_SHIP_INST_SEND_IF_R.$sub_char25);
				addColumnPathMap(DtlR.$sub_char26, MST_SHIP_INST_SEND_IF_R.$sub_char26);
				addColumnPathMap(DtlR.$sub_char27, MST_SHIP_INST_SEND_IF_R.$sub_char27);
				addColumnPathMap(DtlR.$sub_char28, MST_SHIP_INST_SEND_IF_R.$sub_char28);
				addColumnPathMap(DtlR.$sub_char29, MST_SHIP_INST_SEND_IF_R.$sub_char29);
				addColumnPathMap(DtlR.$sub_char30, MST_SHIP_INST_SEND_IF_R.$sub_char30);
				addColumnPathMap(DtlR.$sub_num1, MST_SHIP_INST_SEND_IF_R.$sub_num1);
				addColumnPathMap(DtlR.$sub_num2, MST_SHIP_INST_SEND_IF_R.$sub_num2);
				addColumnPathMap(DtlR.$sub_num3, MST_SHIP_INST_SEND_IF_R.$sub_num3);
				addColumnPathMap(DtlR.$sub_num4, MST_SHIP_INST_SEND_IF_R.$sub_num4);
				addColumnPathMap(DtlR.$sub_num5, MST_SHIP_INST_SEND_IF_R.$sub_num5);
				addColumnPathMap(DtlR.$sub_dt1, MST_SHIP_INST_SEND_IF_R.$sub_dt1);
				addColumnPathMap(DtlR.$sub_dt2, MST_SHIP_INST_SEND_IF_R.$sub_dt2);
				addColumnPathMap(DtlR.$sub_dt3, MST_SHIP_INST_SEND_IF_R.$sub_dt3);
				addColumnPathMap(DtlR.$sub_dt4, MST_SHIP_INST_SEND_IF_R.$sub_dt4);
				addColumnPathMap(DtlR.$sub_dt5, MST_SHIP_INST_SEND_IF_R.$sub_dt5);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.trd_typ_cd(MAC_IF_TRD_TYP_CD.WMS_SHIP_INST_SEND.value());
				dest.data_make_dt(src.ins_ts().toMCDate());
				dest.dpstr_cd(src.if_co_cd());
				dest.dpstr_nm(src.co_nm());
				dest.site_co_cd(src.if_ship_fr_lg_grp_cd());
				dest.site_co_nm(src.ship_fr_lg_grp_nm());
				dest.ship_fr_lg_grp_cd(src.if_ship_fr_lg_grp_cd());
				dest.ship_inst_dt(getDt(src.ship_inst_tm()));
				dest.ship_inst_hm(getHm(src.ship_inst_tm()));
				dest.ship_schd_dt(getDt(src.ship_schd_tm()));
				dest.ship_schd_hm(getHm(src.ship_schd_tm()));
				dest.dlv_schd_dt(getDt(src.dlv_schd_tm()));
				dest.dlv_schd_hm(getHm(src.dlv_schd_tm()));
				dest.ship_wk_cd(src.if_ship_wk_cd());
				dest.ship_term_cd(src.if_ship_term_cd());
				dest.ship_to_lg_grp_cd(src.if_ship_to_lg_grp_cd());
				dest.ship_to_id_cd(src.if_ship_to_id_cd());
				dest.ship_to_cntct_dpt(src.ship_to_cntct_dpt());
				dest.dlv_id_cd(src.if_dlv_id_cd());
				dest.cst_cd(src.if_cst_cd());
				dest.dest_cd1(src.if_dest_cd1());
				dest.dest_cd2(src.if_dest_cd2());
				dest.dest_cd3(src.if_dest_cd3());
				dest.inst_dpt_cd(src.if_inst_dpt_cd());
				dest.inst_usr_cd(src.if_inst_usr_cd());
				dest.trd_cd(src.if_trd_cd());
				dest.ship_loc_cd(src.if_ship_loc_cd());
				dest.ship_str_ln_cd(src.if_ship_str_ln_cd());
				dest.dlv_rqst_dt(getDt(src.dlv_rqst_tm()));
				dest.dlv_rqst_hm(getHm(src.dlv_rqst_tm()));
				dest.pd_inst_dlv_dt(getDt(src.pd_inst_dlv_tm()));
				dest.pd_inst_dlv_hm(getHm(src.pd_inst_dlv_tm()));
				dest.ship_rqst_dt(getDt(src.ship_rqst_tm()));
				dest.ship_rqst_hm(getHm(src.ship_rqst_tm()));
				dest.itm_cd(src.if_itm_cd());
				dest.itm_sub1(src.if_itm_sub1());
				dest.itm_sub2(src.if_itm_sub2());
				dest.itm_sub3(src.if_itm_sub3());
				dest.gd_cd(src.if_gd_cd());
				dest.stk_bp_cd(src.if_stk_bp_cd());
				dest.ent_unit_cd(src.if_ent_unit_cd());
				dest.wt_unit_cd(src.if_wt_unit_cd());
				dest.dim_unit_cd(src.if_dim_unit_cd());
				dest.trd_unit_cd(src.if_trd_unit_cd());
				dest.base_unit_cd(src.if_base_unit_cd());
				dest.pack_unit_cd(src.if_pack_unit_cd());
				dest.rsn_cd(src.if_rsn_cd());
			}
		}

	}

	//FMCB CUSTOM END
}