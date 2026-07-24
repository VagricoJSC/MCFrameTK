package mcframe.serverMSLA.MSLAL8020;

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
import mcframe.commonMSLA.MSLAR1020.*;
import mcframe.serverMS.dbc.MST_SHIP_ACT_RECV_IF_R;
import mcframe.serverPF.dbc.PFT_SDRV_IF_R;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_ShipActRecvConvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_ShipActRecvConvService_MC extends MSLAL_ShipActRecvConvService_MC_A{
	//FMCB CUSTOM START

	/**
	 * ShipActRecvConv_Conv01オペレーション.<p>
	 *
	 */
	public class ShipActRecvConv_Conv01 extends MSLAL_ShipActRecvConvService_MC_A.ShipActRecvConv_Conv01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		@SuppressWarnings("unchecked")
		protected void crtIfDBC() {
			_ifDBC = PFBZL_CodeConvert.crtRecvIfDBContainer(MST_SHIP_ACT_RECV_IF_R.class);
		}
		@Override
		protected void setCnvIfCols() {
			_ifDBC.addCnvCol("if_site_co_cd", "site_co_cd", MAC_IF_COL_TYP.SITE_CO);
			_ifDBC.addCnvCol("if_ship_fr_lg_grp_cd", "ship_fr_lg_grp_cd", MAC_IF_COL_TYP.LG_GRP);
			_ifDBC.addCnvCol("if_trd_cd", "trd_cd", MAC_IF_COL_TYP.TRD);
			_ifDBC.addCnvCol("if_cst_cd", "cst_cd", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("if_ship_to_id_cd", "ship_to_id_cd", MAC_IF_COL_TYP.SHIP_TO_ID);
			_ifDBC.addCnvCol("if_dlv_id_cd", "dlv_id_cd", MAC_IF_COL_TYP.SHIP_TO_ID);
			_ifDBC.addCnvCol("if_dlv_str_ln_cd", "dlv_str_ln_cd", MAC_IF_COL_TYP.STR_LN);
			_ifDBC.addCnvCol("if_rqst_dpt_cd", "rqst_dpt_cd", MAC_IF_COL_TYP.DPT);
			_ifDBC.addCnvCol("if_rqst_usr_cd", "rqst_usr_cd", MAC_IF_COL_TYP.USR);
			_ifDBC.addCnvCol("if_ship_dpt_cd", "ship_dpt_cd", MAC_IF_COL_TYP.DPT);
			_ifDBC.addCnvCol("if_ship_usr_cd", "ship_usr_cd", MAC_IF_COL_TYP.USR);
			_ifDBC.addCnvCol("if_ship_loc_cd", "ship_loc_cd", MAC_IF_COL_TYP.SHIP_TO_ID);
			_ifDBC.addCnvCol("if_ship_str_ln_cd", "ship_str_ln_cd", MAC_IF_COL_TYP.STR_LN);
			_ifDBC.addCnvCol("if_ent_unit_cd", "ent_unit_cd", MAC_IF_COL_TYP.UNIT);
			_ifDBC.addCnvCol("if_stk_arrv_bp_cd", "stk_arrv_bp_cd", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("if_gd_cd", "gd_cd", MAC_IF_COL_TYP.GD);
			_ifDBC.addCnvCol("if_stk_bp_cd", "stk_bp_cd", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("if_rsn_cd", "rsn_cd", MAC_IF_COL_TYP.BIZ_RSN);
			_ifDBC.addCnvCol("if_bd_dpt_cd", "bd_dpt_cd", MAC_IF_COL_TYP.DPT);
			_ifDBC.addCnvItmCol("if_itm_cd", "if_itm_sub1", "if_itm_sub2", "if_itm_sub3", "itm_cd", "itm_sub1", "itm_sub2", "itm_sub3");
		}
	}
	/**	
	 * ShipActRecvConv_Conv02オペレーション.<p>
	 *
	 */
	public class ShipActRecvConv_Conv02 extends MSLAL_ShipActRecvConvService_MC_A.ShipActRecvConv_Conv02 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		@SuppressWarnings({
			"unchecked", "rawtypes"
		})
		protected void crtRptSet() {
			_IfRptSet = PFBZL_FileInput.createIfRecvReportSet(DtlR.class, MST_SHIP_ACT_RECV_IF_R.class);
			_IfRptSet.setReportSet(MSLAR_ShipActPrnt.create());
			_IfRptSet.setRowMapper(new Map_MST_SHIP_ACT_RECV_IF_R_DtlR());
		}
		
		public class Map_MST_SHIP_ACT_RECV_IF_R_DtlR<D extends MST_SHIP_ACT_RECV_IF_R, S extends DtlR, W extends PFT_SDRV_IF_R>  
			extends MAUCC_RowMapperWith<D, S, W> {
			
			protected W _ifR;
			@Override
			public void setWith(W ifR){
				this._ifR = ifR;
			}
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$data_crud_typ, DtlR.$data_crud_typ);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$data_make_dt, DtlR.$data_make_dt);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$ship_inst_no, DtlR.$ship_inst_no);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$trd_ptn_typ, DtlR.$trd_ptn_typ);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$ship_to_id_typ, DtlR.$ship_to_id_typ);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$ship_to_id_nm, DtlR.$ship_to_id_nm);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$ship_to_zip_cd, DtlR.$ship_to_zip_cd);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$ship_to_addr1, DtlR.$ship_to_addr1);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$ship_to_addr2, DtlR.$ship_to_addr2);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$ship_to_addr3, DtlR.$ship_to_addr3);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$ship_to_addr4, DtlR.$ship_to_addr4);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$ship_to_cntct_dpt, DtlR.$ship_to_cntct_dpt);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$ship_to_cntct_psn, DtlR.$ship_to_cntct_psn);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$ship_to_tel, DtlR.$ship_to_tel);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$ship_to_fax, DtlR.$ship_to_fax);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$dlv_id_typ, DtlR.$dlv_id_typ);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$dlv_id_nm, DtlR.$dlv_id_nm);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$dlv_zip_cd, DtlR.$dlv_zip_cd);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$dlv_addr1, DtlR.$dlv_addr1);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$dlv_addr2, DtlR.$dlv_addr2);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$dlv_addr3, DtlR.$dlv_addr3);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$dlv_addr4, DtlR.$dlv_addr4);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$dlv_cntct_dpt, DtlR.$dlv_cntct_dpt);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$dlv_cntct_psn, DtlR.$dlv_cntct_psn);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$dlv_tel, DtlR.$dlv_tel);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$dlv_fax, DtlR.$dlv_fax);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$pri_prnt_typ, DtlR.$pri_prnt_typ);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$ship_inst_d_no, DtlR.$ship_inst_d_no);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$ship_alloc_sts_no, DtlR.$ship_alloc_sts_no);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$iv_no, DtlR.$iv_no);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$iv_d_no, DtlR.$iv_d_no);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$dlv_slip_no, DtlR.$dlv_slip_no);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$dlv_slip_d_no, DtlR.$dlv_slip_d_no);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$ext_ship_act_no, DtlR.$ext_ship_act_no);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$lot_no, DtlR.$lot_no);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sublot_no, DtlR.$sublot_no);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sno1, DtlR.$sno1);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sno2, DtlR.$sno2);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sno3, DtlR.$sno3);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sno4, DtlR.$sno4);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$ent_unit_qty, DtlR.$ent_unit_qty);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$abort_flg, DtlR.$abort_flg);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$cst_itm_cd, DtlR.$cst_itm_cd);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$cst_itm_nm, DtlR.$cst_itm_nm);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$quality_typ, DtlR.$quality_typ);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$stk_id_typ, DtlR.$stk_id_typ);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$cst_po_no, DtlR.$cst_po_no);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$cst_po_d_no, DtlR.$cst_po_d_no);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$cst_dlv_inst_no, DtlR.$cst_dlv_inst_no);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$cst_dlv_inst_d_no, DtlR.$cst_dlv_inst_d_no);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$base_dlv_slip_no, DtlR.$base_dlv_slip_no);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$base_prov_act_no, DtlR.$base_prov_act_no);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$base_ac_dt, DtlR.$base_ac_dt);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$trd_rmrks, DtlR.$trd_rmrks);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$trd_d_rmrks, DtlR.$trd_d_rmrks);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$arr_cnt_rmrks, DtlR.$arr_cnt_rmrks);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$intr_d_rmrks, DtlR.$intr_d_rmrks);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sub_char1, DtlR.$sub_char1);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sub_char2, DtlR.$sub_char2);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sub_char3, DtlR.$sub_char3);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sub_char4, DtlR.$sub_char4);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sub_char5, DtlR.$sub_char5);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sub_char6, DtlR.$sub_char6);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sub_char7, DtlR.$sub_char7);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sub_char8, DtlR.$sub_char8);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sub_char9, DtlR.$sub_char9);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sub_char10, DtlR.$sub_char10);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sub_char11, DtlR.$sub_char11);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sub_char12, DtlR.$sub_char12);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sub_char13, DtlR.$sub_char13);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sub_char14, DtlR.$sub_char14);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sub_char15, DtlR.$sub_char15);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sub_char16, DtlR.$sub_char16);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sub_char17, DtlR.$sub_char17);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sub_char18, DtlR.$sub_char18);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sub_char19, DtlR.$sub_char19);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sub_char20, DtlR.$sub_char20);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sub_char21, DtlR.$sub_char21);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sub_char22, DtlR.$sub_char22);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sub_char23, DtlR.$sub_char23);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sub_char24, DtlR.$sub_char24);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sub_char25, DtlR.$sub_char25);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sub_char26, DtlR.$sub_char26);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sub_char27, DtlR.$sub_char27);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sub_char28, DtlR.$sub_char28);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sub_char29, DtlR.$sub_char29);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sub_char30, DtlR.$sub_char30);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sub_num1, DtlR.$sub_num1);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sub_num2, DtlR.$sub_num2);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sub_num3, DtlR.$sub_num3);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sub_num4, DtlR.$sub_num4);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sub_num5, DtlR.$sub_num5);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sub_dt1, DtlR.$sub_dt1);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sub_dt2, DtlR.$sub_dt2);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sub_dt3, DtlR.$sub_dt3);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sub_dt4, DtlR.$sub_dt4);
				addColumnPathMap(MST_SHIP_ACT_RECV_IF_R.$sub_dt5, DtlR.$sub_dt5);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_lno(getSequence(MSC_NUM_SYS_TYP.SHIPACTRECVIF.value()));
				dest.data_no(_ifR.data_no());
				dest.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
				dest.ext_sys_cd(_ifR.ext_sys_cd());
				dest.imp_flg(true);
				dest.recv_dt(getToday());
				dest.ext_data_lno(src.data_lno());
				dest.ext_data_no(src.data_no());
				dest.if_site_co_cd(src.site_co_cd());
				dest.if_site_co_nm(src.site_co_nm());
				dest.if_ship_fr_lg_grp_cd(src.ship_fr_lg_grp_cd());
				dest.if_ship_fr_lg_grp_nm(src.ship_fr_lg_grp_nm());
				dest.if_trd_cd(src.trd_cd());
				dest.if_trd_nm(src.trd_nm());
				dest.ship_tm(getYmdHm(src.ship_dt(), src.ship_hm()));
				dest.dlv_tm(getYmdHm(src.dlv_dt(), src.dlv_hm()));
				dest.if_cst_cd(src.cst_cd());
				dest.if_cst_nm(src.cst_nm());
				dest.if_ship_to_id_cd(src.ship_to_id_cd());
				dest.if_dlv_id_cd(src.dlv_id_cd());
				dest.if_dlv_str_ln_cd(src.dlv_str_ln_cd());
				dest.if_dlv_str_ln_nm(src.dlv_str_ln_nm());
				dest.if_rqst_dpt_cd(src.rqst_dpt_cd());
				dest.if_rqst_dpt_nm(src.rqst_dpt_nm());
				dest.if_rqst_usr_cd(src.rqst_usr_cd());
				dest.if_rqst_usr_nm(src.rqst_usr_nm());
				dest.if_ship_dpt_cd(src.ship_dpt_cd());
				dest.if_ship_dpt_nm(src.ship_dpt_nm());
				dest.if_ship_usr_cd(src.ship_usr_cd());
				dest.if_ship_usr_nm(src.ship_usr_nm());
				dest.if_ship_loc_cd(src.ship_loc_cd());
				dest.if_ship_loc_nm(src.ship_loc_nm());
				dest.if_ship_str_ln_cd(src.ship_str_ln_cd());
				dest.if_ship_str_ln_nm(src.ship_str_ln_nm());
				dest.if_itm_cd(src.itm_cd());
				dest.if_itm_sub1(src.itm_sub1());
				dest.if_itm_sub2(src.itm_sub2());
				dest.if_itm_sub3(src.itm_sub3());
				dest.if_itm_nm(src.itm_nm());
				dest.if_ent_unit_cd(src.ent_unit_cd());
				dest.if_ent_unit_nm(src.ent_unit_nm());
				dest.if_stk_arrv_bp_cd(src.stk_arrv_bp_cd());
				dest.if_stk_arrv_bp_nm(src.stk_arrv_bp_nm());
				dest.if_gd_cd(src.gd_cd());
				dest.if_gd_nm(src.gd_nm());
				dest.if_stk_bp_cd(src.stk_bp_cd());
				dest.if_stk_bp_nm(src.stk_bp_nm());
				dest.if_rsn_cd(src.rsn_cd());
				dest.if_rsn_nm(src.rsn_nm());
				dest.if_bd_dpt_cd(src.bd_dpt_cd());
				dest.if_bd_dpt_nm(src.bd_dpt_nm());
				dest.if_co_cd(src.dpstr_cd());
				dest.if_co_nm(src.dpstr_nm());
			}
		}
	}

	//FMCB CUSTOM END
}