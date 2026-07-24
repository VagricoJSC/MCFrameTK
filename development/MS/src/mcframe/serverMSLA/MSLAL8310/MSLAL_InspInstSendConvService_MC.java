package mcframe.serverMSLA.MSLAL8310;

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
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
import mcframe.serverPFBZ.PFBZL9010.PFBZL_CodeConvert;
import mcframe.serverPFBZ.PFBZL9020.PFBZL_FileOutput;
import mcframe.commonMSLA.MSLAR1310.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_InspInstSendConvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_InspInstSendConvService_MC extends MSLAL_InspInstSendConvService_MC_A{
	//FMCB CUSTOM START

	/**
	 * InspInstSendConv_Conv01オペレーション.<p>
	 *
	 */
	public class InspInstSendConv_Conv01 extends MSLAL_InspInstSendConvService_MC_A.InspInstSendConv_Conv01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		@SuppressWarnings("unchecked")
		protected void crtIfDBC() {
			_ifDBC = PFBZL_CodeConvert.crtSendIfDBContainer(MST_INSP_INST_SEND_IF_R.class);
		}

		@Override
		protected void setCnvIfCols() {
			_ifDBC.addCnvItmCol("itm_cd", "itm_sub1", "itm_sub2", "itm_sub3");
			_ifDBC.addCnvCol("sppl_cd", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("maker_cd", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("mfg_loc_cd", MAC_IF_COL_TYP.SHIP_TO_ID);
			_ifDBC.addCnvCol("to_site_cd", MAC_IF_COL_TYP.SITE);
			_ifDBC.addCnvCol("pack_unit_cd", MAC_IF_COL_TYP.UNIT);
			_ifDBC.addCnvCol("base_unit_cd", MAC_IF_COL_TYP.UNIT);
			_ifDBC.addCnvCol("inst_dpt_cd", MAC_IF_COL_TYP.DPT);
			_ifDBC.addCnvCol("inst_usr_cd", MAC_IF_COL_TYP.USR);
			_ifDBC.addCnvCol("src_dpt_cd", MAC_IF_COL_TYP.DPT);
			_ifDBC.addCnvCol("src_usr_cd", MAC_IF_COL_TYP.USR);
			_ifDBC.addCnvCol("aprv_dpt_cd", MAC_IF_COL_TYP.DPT);
			_ifDBC.addCnvCol("aprv_usr_cd", MAC_IF_COL_TYP.USR);
			_ifDBC.addCnvCol("schd_loc_cd", MAC_IF_COL_TYP.SHIP_TO_ID);
			_ifDBC.addCnvCol("schd_str_ln_cd", MAC_IF_COL_TYP.STR_LN);
			_ifDBC.addCnvCol("schd_stk_arrv_bp_cd", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("schd_gd_cd", MAC_IF_COL_TYP.GD);
			_ifDBC.addCnvCol("schd_stk_bp_cd", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("schd_pack_unit_cd", MAC_IF_COL_TYP.UNIT);
			_ifDBC.addCnvCol("schd_base_unit_cd", MAC_IF_COL_TYP.UNIT);
			_ifDBC.addCnvCol("stk_loc_cd", MAC_IF_COL_TYP.SHIP_TO_ID);
			_ifDBC.addCnvCol("stk_str_ln_cd", MAC_IF_COL_TYP.STR_LN);
			_ifDBC.addCnvCol("stk_arrv_bp_cd", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("stk_pack_unit_cd", MAC_IF_COL_TYP.UNIT);
			_ifDBC.addCnvCol("stk_gd_cd", MAC_IF_COL_TYP.GD);
			_ifDBC.addCnvCol("stk_bp_cd", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("trd_cd", MAC_IF_COL_TYP.TRD);
			_ifDBC.addCnvCol("co_cd", MAC_IF_COL_TYP.CO);
		}
	}
	/**
	 * InspInstSendConv_Conv02オペレーション.<p>
	 *
	 */
	public class InspInstSendConv_Conv02 extends MSLAL_InspInstSendConvService_MC_A.InspInstSendConv_Conv02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		@SuppressWarnings({
				"unchecked", "rawtypes"
		})
		protected void crtRptSet() {
			_IfRptSet = PFBZL_FileOutput.createIfSendReportSet(DtlR.class, MST_INSP_INST_SEND_IF_R.class);
			_IfRptSet.setReportSet(MSLAR_InspInstSendPrnt.create());
			_IfRptSet.setRowMapper(new Map_DtlR_MST_INPT_INSY_SND_IF_R());
		}
	}

	public class Map_DtlR_MST_INPT_INSY_SND_IF_R<D extends DtlR, S extends MST_INSP_INST_SEND_IF_R> extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(DtlR.$data_lno, MST_INSP_INST_SEND_IF_R.$data_lno);
			addColumnPathMap(DtlR.$data_no, MST_INSP_INST_SEND_IF_R.$data_no);
			addColumnPathMap(DtlR.$data_crud_typ, MST_INSP_INST_SEND_IF_R.$data_crud_typ);
			addColumnPathMap(DtlR.$insp_no, MST_INSP_INST_SEND_IF_R.$insp_no);
			addColumnPathMap(DtlR.$insp_freq, MST_INSP_INST_SEND_IF_R.$insp_freq);
			addColumnPathMap(DtlR.$insp_typ, MST_INSP_INST_SEND_IF_R.$insp_typ);
			addColumnPathMap(DtlR.$insp_mtd_typ, MST_INSP_INST_SEND_IF_R.$insp_mtd_typ);
			addColumnPathMap(DtlR.$insp_sts_typ, MST_INSP_INST_SEND_IF_R.$insp_sts_typ);
			addColumnPathMap(DtlR.$insp_bind_typ, MST_INSP_INST_SEND_IF_R.$insp_bind_typ);
			addColumnPathMap(DtlR.$col_schd_flg, MST_INSP_INST_SEND_IF_R.$col_schd_flg);
			addColumnPathMap(DtlR.$insp_lst_prnt_flg, MST_INSP_INST_SEND_IF_R.$insp_lst_prnt_flg);
			addColumnPathMap(DtlR.$itm_nm, MST_INSP_INST_SEND_IF_R.$itm_nm);
			addColumnPathMap(DtlR.$lot_no, MST_INSP_INST_SEND_IF_R.$lot_no);
			addColumnPathMap(DtlR.$sublot_no, MST_INSP_INST_SEND_IF_R.$sublot_no);
			addColumnPathMap(DtlR.$po_no, MST_INSP_INST_SEND_IF_R.$po_no);
			addColumnPathMap(DtlR.$sppl_nm, MST_INSP_INST_SEND_IF_R.$sppl_nm);
			addColumnPathMap(DtlR.$maker_nm, MST_INSP_INST_SEND_IF_R.$maker_nm);
			addColumnPathMap(DtlR.$mfg_loc_nm, MST_INSP_INST_SEND_IF_R.$mfg_loc_nm);
			addColumnPathMap(DtlR.$to_site_nm, MST_INSP_INST_SEND_IF_R.$to_site_nm);
			addColumnPathMap(DtlR.$bp_lot_no, MST_INSP_INST_SEND_IF_R.$bp_lot_no);
			addColumnPathMap(DtlR.$pack_unit_qty, MST_INSP_INST_SEND_IF_R.$pack_unit_qty);
			addColumnPathMap(DtlR.$pack_unit_nm, MST_INSP_INST_SEND_IF_R.$pack_unit_nm);
			addColumnPathMap(DtlR.$base_unit_qty, MST_INSP_INST_SEND_IF_R.$base_unit_qty);
			addColumnPathMap(DtlR.$base_unit_nm, MST_INSP_INST_SEND_IF_R.$base_unit_nm);
			addColumnPathMap(DtlR.$insp_lst_no, MST_INSP_INST_SEND_IF_R.$insp_lst_no);
			addColumnPathMap(DtlR.$inst_dpt_nm, MST_INSP_INST_SEND_IF_R.$inst_dpt_nm);
			addColumnPathMap(DtlR.$inst_usr_nm, MST_INSP_INST_SEND_IF_R.$inst_usr_nm);
			addColumnPathMap(DtlR.$src_dpt_nm, MST_INSP_INST_SEND_IF_R.$src_dpt_nm);
			addColumnPathMap(DtlR.$src_usr_nm, MST_INSP_INST_SEND_IF_R.$src_usr_nm);
			addColumnPathMap(DtlR.$insp_ptn_cd, MST_INSP_INST_SEND_IF_R.$insp_ptn_cd);
			addColumnPathMap(DtlR.$insp_ptn_nm, MST_INSP_INST_SEND_IF_R.$insp_ptn_nm);
			addColumnPathMap(DtlR.$std_req_flg, MST_INSP_INST_SEND_IF_R.$std_req_flg);
			addColumnPathMap(DtlR.$std_cnf_req_flg, MST_INSP_INST_SEND_IF_R.$std_cnf_req_flg);
			addColumnPathMap(DtlR.$insp_std_no, MST_INSP_INST_SEND_IF_R.$insp_std_no);
			addColumnPathMap(DtlR.$plnt_aprv_flg, MST_INSP_INST_SEND_IF_R.$plnt_aprv_flg);
			addColumnPathMap(DtlR.$insp_rslt_prnt_flg, MST_INSP_INST_SEND_IF_R.$insp_rslt_prnt_flg);
			addColumnPathMap(DtlR.$seq, MST_INSP_INST_SEND_IF_R.$seq);
			addColumnPathMap(DtlR.$lmt_up_flg, MST_INSP_INST_SEND_IF_R.$lmt_up_flg);
			addColumnPathMap(DtlR.$insp_aprv_flg, MST_INSP_INST_SEND_IF_R.$insp_aprv_flg);
			addColumnPathMap(DtlR.$insp_aprv_sts_typ, MST_INSP_INST_SEND_IF_R.$insp_aprv_sts_typ);
			addColumnPathMap(DtlR.$insp_aprv_role_cd, MST_INSP_INST_SEND_IF_R.$insp_aprv_role_cd);
			addColumnPathMap(DtlR.$insp_aprv_role_nm, MST_INSP_INST_SEND_IF_R.$insp_aprv_role_nm);
			addColumnPathMap(DtlR.$aprv_dpt_nm, MST_INSP_INST_SEND_IF_R.$aprv_dpt_nm);
			addColumnPathMap(DtlR.$aprv_usr_nm, MST_INSP_INST_SEND_IF_R.$aprv_usr_nm);
			addColumnPathMap(DtlR.$aprv_rsn, MST_INSP_INST_SEND_IF_R.$aprv_rsn);
			addColumnPathMap(DtlR.$act_cont_fctr, MST_INSP_INST_SEND_IF_R.$act_cont_fctr);
			addColumnPathMap(DtlR.$intr_rmrks, MST_INSP_INST_SEND_IF_R.$intr_rmrks);
			addColumnPathMap(DtlR.$insp_schd_no, MST_INSP_INST_SEND_IF_R.$insp_schd_no);
			addColumnPathMap(DtlR.$src_no1, MST_INSP_INST_SEND_IF_R.$src_no1);
			addColumnPathMap(DtlR.$src_no2, MST_INSP_INST_SEND_IF_R.$src_no2);
			addColumnPathMap(DtlR.$src_no3, MST_INSP_INST_SEND_IF_R.$src_no3);
			addColumnPathMap(DtlR.$src_no4, MST_INSP_INST_SEND_IF_R.$src_no4);
			addColumnPathMap(DtlR.$schd_loc_nm, MST_INSP_INST_SEND_IF_R.$schd_loc_nm);
			addColumnPathMap(DtlR.$schd_str_ln_nm, MST_INSP_INST_SEND_IF_R.$schd_str_ln_nm);
			addColumnPathMap(DtlR.$schd_stk_arrv_bp_nm, MST_INSP_INST_SEND_IF_R.$schd_stk_arrv_bp_nm);
			addColumnPathMap(DtlR.$schd_sno1, MST_INSP_INST_SEND_IF_R.$schd_sno1);
			addColumnPathMap(DtlR.$schd_sno2, MST_INSP_INST_SEND_IF_R.$schd_sno2);
			addColumnPathMap(DtlR.$schd_sno3, MST_INSP_INST_SEND_IF_R.$schd_sno3);
			addColumnPathMap(DtlR.$schd_sno4, MST_INSP_INST_SEND_IF_R.$schd_sno4);
			addColumnPathMap(DtlR.$schd_gd_nm, MST_INSP_INST_SEND_IF_R.$schd_gd_nm);
			addColumnPathMap(DtlR.$schd_quality_typ, MST_INSP_INST_SEND_IF_R.$schd_quality_typ);
			addColumnPathMap(DtlR.$schd_stk_insp_typ, MST_INSP_INST_SEND_IF_R.$schd_stk_insp_typ);
			addColumnPathMap(DtlR.$schd_stk_id_typ, MST_INSP_INST_SEND_IF_R.$schd_stk_id_typ);
			addColumnPathMap(DtlR.$schd_stk_bp_nm, MST_INSP_INST_SEND_IF_R.$schd_stk_bp_nm);
			addColumnPathMap(DtlR.$schd_pack_unit_qty, MST_INSP_INST_SEND_IF_R.$schd_pack_unit_qty);
			addColumnPathMap(DtlR.$schd_pack_unit_nm, MST_INSP_INST_SEND_IF_R.$schd_pack_unit_nm);
			addColumnPathMap(DtlR.$schd_base_unit_qty, MST_INSP_INST_SEND_IF_R.$schd_base_unit_qty);
			addColumnPathMap(DtlR.$schd_base_unit_nm, MST_INSP_INST_SEND_IF_R.$schd_base_unit_nm);
			addColumnPathMap(DtlR.$stk_loc_nm, MST_INSP_INST_SEND_IF_R.$stk_loc_nm);
			addColumnPathMap(DtlR.$stk_str_ln_nm, MST_INSP_INST_SEND_IF_R.$stk_str_ln_nm);
			addColumnPathMap(DtlR.$stk_arrv_bp_nm, MST_INSP_INST_SEND_IF_R.$stk_arrv_bp_nm);
			addColumnPathMap(DtlR.$stk_sno1, MST_INSP_INST_SEND_IF_R.$stk_sno1);
			addColumnPathMap(DtlR.$stk_sno2, MST_INSP_INST_SEND_IF_R.$stk_sno2);
			addColumnPathMap(DtlR.$stk_sno3, MST_INSP_INST_SEND_IF_R.$stk_sno3);
			addColumnPathMap(DtlR.$stk_sno4, MST_INSP_INST_SEND_IF_R.$stk_sno4);
			addColumnPathMap(DtlR.$stk_fix_no_typ, MST_INSP_INST_SEND_IF_R.$stk_fix_no_typ);
			addColumnPathMap(DtlR.$stk_fix_no, MST_INSP_INST_SEND_IF_R.$stk_fix_no);
			addColumnPathMap(DtlR.$stk_pack_unit_nm, MST_INSP_INST_SEND_IF_R.$stk_pack_unit_nm);
			addColumnPathMap(DtlR.$stk_gd_nm, MST_INSP_INST_SEND_IF_R.$stk_gd_nm);
			addColumnPathMap(DtlR.$stk_quality_typ, MST_INSP_INST_SEND_IF_R.$stk_quality_typ);
			addColumnPathMap(DtlR.$stk_insp_typ, MST_INSP_INST_SEND_IF_R.$stk_insp_typ);
			addColumnPathMap(DtlR.$stk_id_typ, MST_INSP_INST_SEND_IF_R.$stk_id_typ);
			addColumnPathMap(DtlR.$stk_bp_nm, MST_INSP_INST_SEND_IF_R.$stk_bp_nm);
			addColumnPathMap(DtlR.$stk_pack_unit_qty, MST_INSP_INST_SEND_IF_R.$stk_pack_unit_qty);
			addColumnPathMap(DtlR.$stk_base_unit_qty, MST_INSP_INST_SEND_IF_R.$stk_base_unit_qty);
			addColumnPathMap(DtlR.$smpl_schd_qty, MST_INSP_INST_SEND_IF_R.$smpl_schd_qty);
			addColumnPathMap(DtlR.$smpl_inst_qty, MST_INSP_INST_SEND_IF_R.$smpl_inst_qty);
			addColumnPathMap(DtlR.$own_insp_no, MST_INSP_INST_SEND_IF_R.$own_insp_no);
			addColumnPathMap(DtlR.$own_insp_schd_no, MST_INSP_INST_SEND_IF_R.$own_insp_schd_no);
			addColumnPathMap(DtlR.$org_insp_schd_no, MST_INSP_INST_SEND_IF_R.$org_insp_schd_no);
			addColumnPathMap(DtlR.$itm_ord_no, MST_INSP_INST_SEND_IF_R.$itm_ord_no);
			addColumnPathMap(DtlR.$in_prmt_insp_flg, MST_INSP_INST_SEND_IF_R.$in_prmt_insp_flg);
			addColumnPathMap(DtlR.$trd_nm, MST_INSP_INST_SEND_IF_R.$trd_nm);
			addColumnPathMap(DtlR.$insp_lt, MST_INSP_INST_SEND_IF_R.$insp_lt);
			addColumnPathMap(DtlR.$insp_offst, MST_INSP_INST_SEND_IF_R.$insp_offst);
			addColumnPathMap(DtlR.$insp_cnt_rmrks, MST_INSP_INST_SEND_IF_R.$insp_cnt_rmrks);
			addColumnPathMap(DtlR.$co_nm, MST_INSP_INST_SEND_IF_R.$co_nm);
			addColumnPathMap(DtlR.$sub_char1, MST_INSP_INST_SEND_IF_R.$sub_char1);
			addColumnPathMap(DtlR.$sub_char2, MST_INSP_INST_SEND_IF_R.$sub_char2);
			addColumnPathMap(DtlR.$sub_char3, MST_INSP_INST_SEND_IF_R.$sub_char3);
			addColumnPathMap(DtlR.$sub_char4, MST_INSP_INST_SEND_IF_R.$sub_char4);
			addColumnPathMap(DtlR.$sub_char5, MST_INSP_INST_SEND_IF_R.$sub_char5);
			addColumnPathMap(DtlR.$sub_char6, MST_INSP_INST_SEND_IF_R.$sub_char6);
			addColumnPathMap(DtlR.$sub_char7, MST_INSP_INST_SEND_IF_R.$sub_char7);
			addColumnPathMap(DtlR.$sub_char8, MST_INSP_INST_SEND_IF_R.$sub_char8);
			addColumnPathMap(DtlR.$sub_char9, MST_INSP_INST_SEND_IF_R.$sub_char9);
			addColumnPathMap(DtlR.$sub_char10, MST_INSP_INST_SEND_IF_R.$sub_char10);
			addColumnPathMap(DtlR.$sub_char11, MST_INSP_INST_SEND_IF_R.$sub_char11);
			addColumnPathMap(DtlR.$sub_char12, MST_INSP_INST_SEND_IF_R.$sub_char12);
			addColumnPathMap(DtlR.$sub_char13, MST_INSP_INST_SEND_IF_R.$sub_char13);
			addColumnPathMap(DtlR.$sub_char14, MST_INSP_INST_SEND_IF_R.$sub_char14);
			addColumnPathMap(DtlR.$sub_char15, MST_INSP_INST_SEND_IF_R.$sub_char15);
			addColumnPathMap(DtlR.$sub_char16, MST_INSP_INST_SEND_IF_R.$sub_char16);
			addColumnPathMap(DtlR.$sub_char17, MST_INSP_INST_SEND_IF_R.$sub_char17);
			addColumnPathMap(DtlR.$sub_char18, MST_INSP_INST_SEND_IF_R.$sub_char18);
			addColumnPathMap(DtlR.$sub_char19, MST_INSP_INST_SEND_IF_R.$sub_char19);
			addColumnPathMap(DtlR.$sub_char20, MST_INSP_INST_SEND_IF_R.$sub_char20);
			addColumnPathMap(DtlR.$sub_char21, MST_INSP_INST_SEND_IF_R.$sub_char21);
			addColumnPathMap(DtlR.$sub_char22, MST_INSP_INST_SEND_IF_R.$sub_char22);
			addColumnPathMap(DtlR.$sub_char23, MST_INSP_INST_SEND_IF_R.$sub_char23);
			addColumnPathMap(DtlR.$sub_char24, MST_INSP_INST_SEND_IF_R.$sub_char24);
			addColumnPathMap(DtlR.$sub_char25, MST_INSP_INST_SEND_IF_R.$sub_char25);
			addColumnPathMap(DtlR.$sub_char26, MST_INSP_INST_SEND_IF_R.$sub_char26);
			addColumnPathMap(DtlR.$sub_char27, MST_INSP_INST_SEND_IF_R.$sub_char27);
			addColumnPathMap(DtlR.$sub_char28, MST_INSP_INST_SEND_IF_R.$sub_char28);
			addColumnPathMap(DtlR.$sub_char29, MST_INSP_INST_SEND_IF_R.$sub_char29);
			addColumnPathMap(DtlR.$sub_char30, MST_INSP_INST_SEND_IF_R.$sub_char30);
			addColumnPathMap(DtlR.$sub_num1, MST_INSP_INST_SEND_IF_R.$sub_num1);
			addColumnPathMap(DtlR.$sub_num2, MST_INSP_INST_SEND_IF_R.$sub_num2);
			addColumnPathMap(DtlR.$sub_num3, MST_INSP_INST_SEND_IF_R.$sub_num3);
			addColumnPathMap(DtlR.$sub_num4, MST_INSP_INST_SEND_IF_R.$sub_num4);
			addColumnPathMap(DtlR.$sub_num5, MST_INSP_INST_SEND_IF_R.$sub_num5);
			addColumnPathMap(DtlR.$sub_dt1, MST_INSP_INST_SEND_IF_R.$sub_dt1);
			addColumnPathMap(DtlR.$sub_dt2, MST_INSP_INST_SEND_IF_R.$sub_dt2);
			addColumnPathMap(DtlR.$sub_dt3, MST_INSP_INST_SEND_IF_R.$sub_dt3);
			addColumnPathMap(DtlR.$sub_dt4, MST_INSP_INST_SEND_IF_R.$sub_dt4);
			addColumnPathMap(DtlR.$sub_dt5, MST_INSP_INST_SEND_IF_R.$sub_dt5);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.trd_typ_cd(MAC_IF_TRD_TYP_CD.MES_INSP_INST_SEND.value());
			dest.data_make_dt(src.ins_ts().toMCDate());
			dest.insp_lst_prnt_dt(getDt(src.insp_lst_prnt_tm()));
			dest.insp_lst_prnt_hm(getHm(src.insp_lst_prnt_tm()));
			dest.itm_cd(src.if_itm_cd());
			dest.itm_sub1(src.if_itm_sub1());
			dest.itm_sub2(src.if_itm_sub2());
			dest.itm_sub3(src.if_itm_sub3());
			dest.arr_dt(getDt(src.arr_tm()));
			dest.arr_hm(getHm(src.arr_tm()));
			dest.first_gr_dt(getDt(src.first_gr_dt()));
			dest.vld_dt(getDt(src.vld_dt()));
			dest.lmt_dt(getDt(src.lmt_dt()));
			dest.lmt_dt_frm(getDt(src.lmt_dt_frm()));
			dest.sppl_cd(src.if_sppl_cd());
			dest.maker_cd(src.if_maker_cd());
			dest.mfg_loc_cd(src.if_mfg_loc_cd());
			dest.to_site_cd(src.if_to_site_cd());
			dest.pack_unit_cd(src.if_pack_unit_cd());
			dest.base_unit_cd(src.if_base_unit_cd());
			dest.inst_dt(getDt(src.inst_dt()));
			dest.inst_dpt_cd(src.if_inst_dpt_cd());
			dest.inst_usr_cd(src.if_inst_usr_cd());
			dest.src_dpt_cd(src.if_src_dpt_cd());
			dest.src_usr_cd(src.if_src_usr_cd());
			dest.master_dt(getDt(src.master_dt()));
			dest.mfg_st_schd_dt(getDt(src.mfg_st_schd_tm()));
			dest.mfg_st_schd_hm(getHm(src.mfg_st_schd_tm()));
			dest.mfg_end_schd_dt(getDt(src.mfg_end_schd_tm()));
			dest.mfg_end_schd_hm(getHm(src.mfg_end_schd_tm()));
			dest.insp_st_dt(getDt(src.insp_st_tm()));
			dest.insp_st_hm(getHm(src.insp_st_tm()));
			dest.insp_end_dt(getDt(src.insp_end_tm()));
			dest.insp_end_hm(getHm(src.insp_end_tm()));
			dest.insp_rslt_prnt_dt(getDt(src.insp_rslt_prnt_tm()));
			dest.insp_rslt_prnt_hm(getHm(src.insp_rslt_prnt_tm()));
			dest.aprv_dt(getDt(src.aprv_dt()));
			dest.aprv_dpt_cd(src.if_aprv_dpt_cd());
			dest.aprv_usr_cd(src.if_aprv_usr_cd());
			dest.schd_loc_cd(src.if_schd_loc_cd());
			dest.schd_str_ln_cd(src.if_schd_str_ln_cd());
			dest.schd_stk_arrv_bp_cd(src.if_schd_stk_arrv_bp_cd());
			dest.schd_gd_cd(src.if_schd_gd_cd());
			dest.schd_stk_bp_cd(src.if_schd_stk_bp_cd());
			dest.schd_pack_unit_cd(src.if_schd_pack_unit_cd());
			dest.schd_base_unit_cd(src.if_schd_base_unit_cd());
			dest.stk_loc_cd(src.if_stk_loc_cd());
			dest.stk_str_ln_cd(src.if_stk_str_ln_cd());
			dest.stk_arrv_bp_cd(src.if_stk_arrv_bp_cd());
			dest.stk_pack_unit_cd(src.if_stk_pack_unit_cd());
			dest.stk_gd_cd(src.if_stk_gd_cd());
			dest.stk_bp_cd(src.if_stk_bp_cd());
			dest.ac_dt(getDt(src.ac_dt()));
			dest.trd_cd(src.if_trd_cd());
			dest.co_cd(src.if_co_cd());
		}
	}

	//FMCB CUSTOM END
}