package mcframe.serverMSLA.MSLAL8230;

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
import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import mcframe.commonCore.util.MCDataConvUtil;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
import mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys;
import mcframe.serverPFBZ.PFBZL9010.PFBZL_CodeConvert;
import mcframe.serverPFBZ.PFBZL9020.PFBZL_FileOutput;
import mcframe.commonMSLA.MSLAR1230.*;
import mcframe.serverMSUC.MSUCL0090.MSUCL_SCMLinkUtil;
import mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch01_CndR;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_OperInstSendConvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_OperInstSendConvService_MC extends MSLAL_OperInstSendConvService_MC_A{
	//FMCB CUSTOM START

	/**
	 * OperInstSendConv_Conv01オペレーション.<p>
	 *
	 */
	public class OperInstSendConv_Conv01 extends MSLAL_OperInstSendConvService_MC_A.OperInstSendConv_Conv01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		@SuppressWarnings("unchecked")
		protected void crtIfDBC() {
			_ifDBC = PFBZL_CodeConvert.crtSendIfDBContainer(MST_OPER_INST_SEND_IF_R.class);
		}

		@Override
		protected void setCnvIfCols() {
			_ifDBC.addCnvCol("mfg_loc_cd", MAC_IF_COL_TYP.SHIP_TO_ID);
			_ifDBC.addCnvItmCol("mfg_itm_cd", "mfg_itm_sub1", "mfg_itm_sub2", "mfg_itm_sub3");
			_ifDBC.addCnvCol("oper_cd", MAC_IF_COL_TYP.OPER);
			_ifDBC.addCnvCol("oper_loc_cd", MAC_IF_COL_TYP.SHIP_TO_ID);
			_ifDBC.addCnvCol("oper_str_ln_cd", MAC_IF_COL_TYP.STR_LN);
			_ifDBC.addCnvCol("oper_unit_cd", MAC_IF_COL_TYP.UNIT);
			_ifDBC.addCnvCol("usr_cd", MAC_IF_COL_TYP.USR);
			_ifDBC.addCnvCol("strg_loc_cd", MAC_IF_COL_TYP.SHIP_TO_ID);
			_ifDBC.addCnvCol("strg_str_ln_cd", MAC_IF_COL_TYP.STR_LN);
			_ifDBC.addCnvCol("mfg_str_ln_cd", MAC_IF_COL_TYP.STR_LN);
			_ifDBC.addCnvCol("wg_cd", MAC_IF_COL_TYP.WG);
			_ifDBC.addCnvCol("site_cd", MAC_IF_COL_TYP.SITE);
			_ifDBC.addCnvCol("base_unit_cd", MAC_IF_COL_TYP.UNIT);
			_ifDBC.addCnvCol("aprv_dpt_cd", MAC_IF_COL_TYP.DPT);
			_ifDBC.addCnvCol("aprv_usr_cd", MAC_IF_COL_TYP.USR);
			_ifDBC.addCnvCol("inst_dpt_cd", MAC_IF_COL_TYP.DPT);
			_ifDBC.addCnvCol("inst_usr_cd", MAC_IF_COL_TYP.USR);
			_ifDBC.addCnvCol("co_cd", MAC_IF_COL_TYP.CO);
		}

	}

	/**
	 * OperInstSendConv_Conv02オペレーション.<p>
	 *
	 */
	public class OperInstSendConv_Conv02 extends MSLAL_OperInstSendConvService_MC_A.OperInstSendConv_Conv02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		@SuppressWarnings({
				"unchecked", "rawtypes"
		})
		protected void crtRptSet() {
			_IfRptSet = PFBZL_FileOutput.createIfSendReportSet(DtlR.class, MST_OPER_INST_SEND_IF_R.class);
			_IfRptSet.setReportSet(MSLAR_OperInstPrnt.create());
			_IfRptSet.setRowMapper(new Map_DtlR_MST_OPER_INST_SEND_IF_R());
		}
	}

	public class Map_DtlR_MST_OPER_INST_SEND_IF_R<D extends DtlR, S extends MST_OPER_INST_SEND_IF_R> extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(DtlR.$data_lno, MST_OPER_INST_SEND_IF_R.$data_lno);
			addColumnPathMap(DtlR.$data_no, MST_OPER_INST_SEND_IF_R.$data_no);
			addColumnPathMap(DtlR.$data_crud_typ, MST_OPER_INST_SEND_IF_R.$data_crud_typ);
			addColumnPathMap(DtlR.$oper_inst_no, MST_OPER_INST_SEND_IF_R.$oper_inst_no);
			addColumnPathMap(DtlR.$mfg_inst_no, MST_OPER_INST_SEND_IF_R.$mfg_inst_no);
			addColumnPathMap(DtlR.$mfg_inst_rev, MST_OPER_INST_SEND_IF_R.$mfg_inst_rev);
			addColumnPathMap(DtlR.$mfg_loc_nm, MST_OPER_INST_SEND_IF_R.$mfg_loc_nm);
			addColumnPathMap(DtlR.$mfg_itm_nm, MST_OPER_INST_SEND_IF_R.$mfg_itm_nm);
			addColumnPathMap(DtlR.$oper_nm, MST_OPER_INST_SEND_IF_R.$oper_nm);
			addColumnPathMap(DtlR.$oper_seq, MST_OPER_INST_SEND_IF_R.$oper_seq);
			addColumnPathMap(DtlR.$disp_seq, MST_OPER_INST_SEND_IF_R.$disp_seq);
			addColumnPathMap(DtlR.$oper_loc_nm, MST_OPER_INST_SEND_IF_R.$oper_loc_nm);
			addColumnPathMap(DtlR.$oper_str_ln_nm, MST_OPER_INST_SEND_IF_R.$oper_str_ln_nm);
			addColumnPathMap(DtlR.$base_unit_qty, MST_OPER_INST_SEND_IF_R.$base_unit_qty);
			addColumnPathMap(DtlR.$oper_std_qty, MST_OPER_INST_SEND_IF_R.$oper_std_qty);
			addColumnPathMap(DtlR.$oper_conv_qty, MST_OPER_INST_SEND_IF_R.$oper_conv_qty);
			addColumnPathMap(DtlR.$oper_unit_qty, MST_OPER_INST_SEND_IF_R.$oper_unit_qty);
			addColumnPathMap(DtlR.$oper_unit_nm, MST_OPER_INST_SEND_IF_R.$oper_unit_nm);
			addColumnPathMap(DtlR.$oper_unit_conv_rnd_typ, MST_OPER_INST_SEND_IF_R.$oper_unit_conv_rnd_typ);
			addColumnPathMap(DtlR.$oper_unit_dec_place, MST_OPER_INST_SEND_IF_R.$oper_unit_dec_place);
			addColumnPathMap(DtlR.$bkf_flg, MST_OPER_INST_SEND_IF_R.$bkf_flg);
			addColumnPathMap(DtlR.$wk_cost_calc_flg, MST_OPER_INST_SEND_IF_R.$wk_cost_calc_flg);
			addColumnPathMap(DtlR.$usr_nm, MST_OPER_INST_SEND_IF_R.$usr_nm);
			addColumnPathMap(DtlR.$oper_lower_yield, MST_OPER_INST_SEND_IF_R.$oper_lower_yield);
			addColumnPathMap(DtlR.$oper_std_yield, MST_OPER_INST_SEND_IF_R.$oper_std_yield);
			addColumnPathMap(DtlR.$oper_upper_yield, MST_OPER_INST_SEND_IF_R.$oper_upper_yield);
			addColumnPathMap(DtlR.$wip_rate, MST_OPER_INST_SEND_IF_R.$wip_rate);
			addColumnPathMap(DtlR.$yield_oper_flg, MST_OPER_INST_SEND_IF_R.$yield_oper_flg);
			addColumnPathMap(DtlR.$oper_rsrc, MST_OPER_INST_SEND_IF_R.$oper_rsrc);
			addColumnPathMap(DtlR.$intr_rmrks, MST_OPER_INST_SEND_IF_R.$intr_rmrks);
			addColumnPathMap(DtlR.$inst_rpt_rmrks, MST_OPER_INST_SEND_IF_R.$inst_rpt_rmrks);
			addColumnPathMap(DtlR.$mfg_sts_typ, MST_OPER_INST_SEND_IF_R.$mfg_sts_typ);
			addColumnPathMap(DtlR.$mfg_mtd_typ, MST_OPER_INST_SEND_IF_R.$mfg_mtd_typ);
			addColumnPathMap(DtlR.$oper_ptn, MST_OPER_INST_SEND_IF_R.$oper_ptn);
			addColumnPathMap(DtlR.$bom_ptn, MST_OPER_INST_SEND_IF_R.$bom_ptn);
			addColumnPathMap(DtlR.$lot_no, MST_OPER_INST_SEND_IF_R.$lot_no);
			addColumnPathMap(DtlR.$sublot_no, MST_OPER_INST_SEND_IF_R.$sublot_no);
			addColumnPathMap(DtlR.$sno1, MST_OPER_INST_SEND_IF_R.$sno1);
			addColumnPathMap(DtlR.$sno2, MST_OPER_INST_SEND_IF_R.$sno2);
			addColumnPathMap(DtlR.$sno3, MST_OPER_INST_SEND_IF_R.$sno3);
			addColumnPathMap(DtlR.$sno4, MST_OPER_INST_SEND_IF_R.$sno4);
			addColumnPathMap(DtlR.$strg_loc_nm, MST_OPER_INST_SEND_IF_R.$strg_loc_nm);
			addColumnPathMap(DtlR.$strg_str_ln_nm, MST_OPER_INST_SEND_IF_R.$strg_str_ln_nm);
			addColumnPathMap(DtlR.$mfg_str_ln_nm, MST_OPER_INST_SEND_IF_R.$mfg_str_ln_nm);
			addColumnPathMap(DtlR.$wg_nm, MST_OPER_INST_SEND_IF_R.$wg_nm);
			addColumnPathMap(DtlR.$site_nm, MST_OPER_INST_SEND_IF_R.$site_nm);
			addColumnPathMap(DtlR.$itm_lower_yield, MST_OPER_INST_SEND_IF_R.$itm_lower_yield);
			addColumnPathMap(DtlR.$itm_std_yield, MST_OPER_INST_SEND_IF_R.$itm_std_yield);
			addColumnPathMap(DtlR.$itm_upper_yield, MST_OPER_INST_SEND_IF_R.$itm_upper_yield);
			addColumnPathMap(DtlR.$base_unit_yield_qty, MST_OPER_INST_SEND_IF_R.$base_unit_yield_qty);
			addColumnPathMap(DtlR.$base_unit_inst_qty, MST_OPER_INST_SEND_IF_R.$base_unit_inst_qty);
			addColumnPathMap(DtlR.$base_unit_nm, MST_OPER_INST_SEND_IF_R.$base_unit_nm);
			addColumnPathMap(DtlR.$inst_dt, MST_OPER_INST_SEND_IF_R.$inst_dt);
			addColumnPathMap(DtlR.$inst_prnt_flg, MST_OPER_INST_SEND_IF_R.$inst_prnt_flg);
			addColumnPathMap(DtlR.$aprv_flg, MST_OPER_INST_SEND_IF_R.$aprv_flg);
			addColumnPathMap(DtlR.$mfg_aprv_sts_typ, MST_OPER_INST_SEND_IF_R.$mfg_aprv_sts_typ);
			addColumnPathMap(DtlR.$aprv_dt, MST_OPER_INST_SEND_IF_R.$aprv_dt);
			addColumnPathMap(DtlR.$aprv_dpt_nm, MST_OPER_INST_SEND_IF_R.$aprv_dpt_nm);
			addColumnPathMap(DtlR.$aprv_usr_nm, MST_OPER_INST_SEND_IF_R.$aprv_usr_nm);
			addColumnPathMap(DtlR.$aprv_rsn, MST_OPER_INST_SEND_IF_R.$aprv_rsn);
			addColumnPathMap(DtlR.$disp_pd, MST_OPER_INST_SEND_IF_R.$disp_pd);
			addColumnPathMap(DtlR.$inst_dpt_nm, MST_OPER_INST_SEND_IF_R.$inst_dpt_nm);
			addColumnPathMap(DtlR.$inst_usr_nm, MST_OPER_INST_SEND_IF_R.$inst_usr_nm);
			addColumnPathMap(DtlR.$abort_flg, MST_OPER_INST_SEND_IF_R.$abort_flg);
			addColumnPathMap(DtlR.$schd_chg_flg, MST_OPER_INST_SEND_IF_R.$schd_chg_flg);
			addColumnPathMap(DtlR.$mfg_inst_unit_typ, MST_OPER_INST_SEND_IF_R.$mfg_inst_unit_typ);
			addColumnPathMap(DtlR.$mfg_intr_rmrks, MST_OPER_INST_SEND_IF_R.$mfg_intr_rmrks);
			addColumnPathMap(DtlR.$mfg_inst_rpt_rmrks, MST_OPER_INST_SEND_IF_R.$mfg_inst_rpt_rmrks);
			addColumnPathMap(DtlR.$inst_po_cnt_rmrks, MST_OPER_INST_SEND_IF_R.$inst_po_cnt_rmrks);
			addColumnPathMap(DtlR.$co_nm, MST_OPER_INST_SEND_IF_R.$co_nm);
			addColumnPathMap(DtlR.$sub_char1, MST_OPER_INST_SEND_IF_R.$sub_char1);
			addColumnPathMap(DtlR.$sub_char2, MST_OPER_INST_SEND_IF_R.$sub_char2);
			addColumnPathMap(DtlR.$sub_char3, MST_OPER_INST_SEND_IF_R.$sub_char3);
			addColumnPathMap(DtlR.$sub_char4, MST_OPER_INST_SEND_IF_R.$sub_char4);
			addColumnPathMap(DtlR.$sub_char5, MST_OPER_INST_SEND_IF_R.$sub_char5);
			addColumnPathMap(DtlR.$sub_char6, MST_OPER_INST_SEND_IF_R.$sub_char6);
			addColumnPathMap(DtlR.$sub_char7, MST_OPER_INST_SEND_IF_R.$sub_char7);
			addColumnPathMap(DtlR.$sub_char8, MST_OPER_INST_SEND_IF_R.$sub_char8);
			addColumnPathMap(DtlR.$sub_char9, MST_OPER_INST_SEND_IF_R.$sub_char9);
			addColumnPathMap(DtlR.$sub_char10, MST_OPER_INST_SEND_IF_R.$sub_char10);
			addColumnPathMap(DtlR.$sub_char11, MST_OPER_INST_SEND_IF_R.$sub_char11);
			addColumnPathMap(DtlR.$sub_char12, MST_OPER_INST_SEND_IF_R.$sub_char12);
			addColumnPathMap(DtlR.$sub_char13, MST_OPER_INST_SEND_IF_R.$sub_char13);
			addColumnPathMap(DtlR.$sub_char14, MST_OPER_INST_SEND_IF_R.$sub_char14);
			addColumnPathMap(DtlR.$sub_char15, MST_OPER_INST_SEND_IF_R.$sub_char15);
			addColumnPathMap(DtlR.$sub_char16, MST_OPER_INST_SEND_IF_R.$sub_char16);
			addColumnPathMap(DtlR.$sub_char17, MST_OPER_INST_SEND_IF_R.$sub_char17);
			addColumnPathMap(DtlR.$sub_char18, MST_OPER_INST_SEND_IF_R.$sub_char18);
			addColumnPathMap(DtlR.$sub_char19, MST_OPER_INST_SEND_IF_R.$sub_char19);
			addColumnPathMap(DtlR.$sub_char20, MST_OPER_INST_SEND_IF_R.$sub_char20);
			addColumnPathMap(DtlR.$sub_char21, MST_OPER_INST_SEND_IF_R.$sub_char21);
			addColumnPathMap(DtlR.$sub_char22, MST_OPER_INST_SEND_IF_R.$sub_char22);
			addColumnPathMap(DtlR.$sub_char23, MST_OPER_INST_SEND_IF_R.$sub_char23);
			addColumnPathMap(DtlR.$sub_char24, MST_OPER_INST_SEND_IF_R.$sub_char24);
			addColumnPathMap(DtlR.$sub_char25, MST_OPER_INST_SEND_IF_R.$sub_char25);
			addColumnPathMap(DtlR.$sub_char26, MST_OPER_INST_SEND_IF_R.$sub_char26);
			addColumnPathMap(DtlR.$sub_char27, MST_OPER_INST_SEND_IF_R.$sub_char27);
			addColumnPathMap(DtlR.$sub_char28, MST_OPER_INST_SEND_IF_R.$sub_char28);
			addColumnPathMap(DtlR.$sub_char29, MST_OPER_INST_SEND_IF_R.$sub_char29);
			addColumnPathMap(DtlR.$sub_char30, MST_OPER_INST_SEND_IF_R.$sub_char30);
			addColumnPathMap(DtlR.$sub_num1, MST_OPER_INST_SEND_IF_R.$sub_num1);
			addColumnPathMap(DtlR.$sub_num2, MST_OPER_INST_SEND_IF_R.$sub_num2);
			addColumnPathMap(DtlR.$sub_num3, MST_OPER_INST_SEND_IF_R.$sub_num3);
			addColumnPathMap(DtlR.$sub_num4, MST_OPER_INST_SEND_IF_R.$sub_num4);
			addColumnPathMap(DtlR.$sub_num5, MST_OPER_INST_SEND_IF_R.$sub_num5);
			addColumnPathMap(DtlR.$sub_dt1, MST_OPER_INST_SEND_IF_R.$sub_dt1);
			addColumnPathMap(DtlR.$sub_dt2, MST_OPER_INST_SEND_IF_R.$sub_dt2);
			addColumnPathMap(DtlR.$sub_dt3, MST_OPER_INST_SEND_IF_R.$sub_dt3);
			addColumnPathMap(DtlR.$sub_dt4, MST_OPER_INST_SEND_IF_R.$sub_dt4);
			addColumnPathMap(DtlR.$sub_dt5, MST_OPER_INST_SEND_IF_R.$sub_dt5);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.trd_typ_cd(MAC_IF_TRD_TYP_CD.MES_OPER_INST_SEND.value());
			dest.data_make_dt(src.ins_ts().toMCDate());
			dest.mfg_loc_cd(src.if_mfg_loc_cd());
			dest.mfg_itm_cd(src.if_mfg_itm_cd());
			dest.mfg_itm_sub1(src.if_mfg_itm_sub1());
			dest.mfg_itm_sub2(src.if_mfg_itm_sub2());
			dest.mfg_itm_sub3(src.if_mfg_itm_sub3());
			dest.oper_cd(src.if_oper_cd());
			dest.st_schd_dt(getDt(src.st_schd_tm()));
			dest.st_schd_hm(getHm(src.st_schd_tm()));
			dest.end_schd_dt(getDt(src.end_schd_tm()));
			dest.end_schd_hm(getHm(src.end_schd_tm()));
			dest.oper_loc_cd(src.if_oper_loc_cd());
			dest.oper_str_ln_cd(src.if_oper_str_ln_cd());
			dest.oper_unit_cd(src.if_oper_unit_cd());
			dest.usr_cd(src.if_usr_cd());
			dest.strg_loc_cd(src.if_strg_loc_cd());
			dest.strg_str_ln_cd(src.if_strg_str_ln_cd());
			dest.mfg_str_ln_cd(src.if_mfg_str_ln_cd());
			dest.wg_cd(src.if_wg_cd());
			dest.site_cd(src.if_site_cd());
			dest.base_unit_cd(src.if_base_unit_cd());
			dest.mfg_st_schd_dt(getDt(src.mfg_st_schd_tm()));
			dest.mfg_st_schd_hm(getHm(src.mfg_st_schd_tm()));
			dest.mfg_end_schd_dt(getDt(src.mfg_end_schd_tm()));
			dest.mfg_end_schd_hm(getHm(src.mfg_end_schd_tm()));
			dest.inst_prnt_dt(getDt(src.inst_prnt_tm()));
			dest.inst_prnt_hm(getHm(src.inst_prnt_tm()));
			dest.aprv_dpt_cd(src.if_aprv_dpt_cd());
			dest.aprv_usr_cd(src.if_aprv_usr_cd());
			dest.inst_dpt_cd(src.if_inst_dpt_cd());
			dest.inst_usr_cd(src.if_inst_usr_cd());
			dest.co_cd(src.if_co_cd());
		}

	}

	/**
	 * OperInstSendConv_Conv03オペレーション.<p>
	 *
	 */
	public class OperInstSendConv_Conv03 extends MSLAL_OperInstSendConvService_MC_A.OperInstSendConv_Conv03 {
		protected final String _IOT_PF_COMPANY_KEY = "company";

		protected final String _IOT_PF_ORGANIZATION_KEY = "organization";

		protected final String _IOT_PF_DEVICE_ID_KEY = "device_id";

		protected final String _IOT_PF_DEVICE_ID_VALUE = "mcframe";

		protected final String _IOT_PF_DOCUMENT_TYPE_KEY = "documentType";

		protected final String _IOT_PF_DOCUMENT_TYPE_VALUE = "OperInstDoc";

		protected final String _IOT_PF_DOCUMENT_TYPE_VALUE2 = "OperInstDoc2";

		protected final String _IOT_PF_DOCUMENT_KEY = "document";

		protected final String _IOT_PF_OPER_INST_KEY = "oper_inst";

		protected final String _SYS_PARM_COMPANY_KEY = "IOT_PF_COMPANY";

		protected final String _SYS_PARM_ORGANIZATION_KEY = "IOT_PF_ORGANIZATION";

		protected final String _SYS_PARM_DATA_RECV_PATTERN_KEY = "IOT_PF_DATA_RECV_PATTERN";

		protected final String _SYS_PARM_ORGANIZATION_SEPARATOR = ",";

		protected final String _DB_PARAM_IOT_PF_DATA_RECV_PATTERN_KEY = "Iotpf-Data-Recv-Pattern";

		protected final String _DB_PARAM_IOT_PF_ORGANIZATION_KEY = "Iotpf-Organization";

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void setIfDBC() {
			_ifDBC = PFBZL_CodeConvert.crtSendIfDBContainer(MST_OPER_INST_SEND_IF_R.class);
		}

		@Override
		protected String convertMCDBtoJson(MCList<?> ifL) {
			MCList<DtlR> dtlL = MCList.create(DtlR.class);
			addAll(dtlL, ifL, new Map_DtlR_MST_OPER_INST_SEND_IF_R());
			String jsonStr = PFUCL_AppSys.createJsonObj(MAC_IF_PROC_TYP.MES_OPER_INST_SEND.value()).toJson(new HashMap<String, Object>() {
				{
					put(_IOT_PF_COMPANY_KEY, getSysParm(_SYS_PARM_COMPANY_KEY));
					// SCMIF制御マスタから紐づけたHTTPヘッダマスタを検索する
					MCList<MAM_SCM_IF_CTL_R> dbc = getHttpHeader();
					// 外部システムCDの取得・設定
					setExtSysCd(dbc, (MCList<MST_OPER_INST_SEND_IF_R>)ifL);

					// SCMIF制御マスタから紐づけたHTTPヘッダマスタに該当するデータが登録されていた場合はそちらのデータを設定する。登録されていない場合はシステムパラメータの値を使用する。
					put(_IOT_PF_ORGANIZATION_KEY, Arrays.asList(getOrganizationValue(dbc, ifL).split(_SYS_PARM_ORGANIZATION_SEPARATOR)));
					put(_IOT_PF_DEVICE_ID_KEY, _IOT_PF_DEVICE_ID_VALUE);

					String dataRcvPtn = getIotpfDataRecvPatternValue(dbc, ifL);

					if(isNull(dataRcvPtn) || dataRcvPtn.equals("1")) {
						put(_IOT_PF_DOCUMENT_TYPE_KEY, _IOT_PF_DOCUMENT_TYPE_VALUE2);
					}
					else if (dataRcvPtn.equals("0")) {
						put(_IOT_PF_DOCUMENT_TYPE_KEY, _IOT_PF_DOCUMENT_TYPE_VALUE);
					}
					else {
						put(_IOT_PF_DOCUMENT_TYPE_KEY, _IOT_PF_DOCUMENT_TYPE_VALUE2);
					}
					put(_IOT_PF_DOCUMENT_KEY, new HashMap<String, Object>() {
						{
							put(_IOT_PF_OPER_INST_KEY, MCDataConvUtil.toMap(dtlL));
						}
					});
				}
			});
			return jsonStr;
		}

		protected MCList<MAM_SCM_IF_CTL_R> getHttpHeader() {
			// SCMIF制御マスタとHTTPヘッダマスタを結合し、外部システムコードとインターフェース処理区分が一致する、論理削除されていないデータを取得する

			MCList<MAM_SCM_IF_CTL_R> dbc = MCList.create(MAM_SCM_IF_CTL_R.class);
			MAM_SCM_IF_CTL_R m1 = MAM_SCM_IF_CTL_R.create("M1");
			MAM_HTTP_HEADER_R m2 = MAM_HTTP_HEADER_R.create("M2");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(m2);
			dbc_bldr.addSelect(m1.if_proc_typ);
			dbc_bldr.addSelect(m1.loc_cd);
			dbc.addStringColumn("http_header_nm");
			dbc.addStringColumn("http_header_val");
			dbc_bldr.addInnerJoin(m1, bracket( m2.ext_sys_cd.eq(m1.ext_sys_cd)
					.and(m2.if_proc_typ.eq(m1.if_proc_typ))));
			dbc_bldr.setWhere(m1.del_flg.eq(value(false))
					.and(m2.del_flg.eq(value(false))));

			dbSelect("MSLAL8230_MAM_SCM_IF_CTL_S01", dbc, dbc_bldr);
			
			return dbc;
		}

		protected String getOrganizationValue(MCList<MAM_SCM_IF_CTL_R> scmIfCtlL,
				MCList<?> ifL) {

			for (MST_OPER_INST_SEND_IF_R r : (MCList<MST_OPER_INST_SEND_IF_R>) ifL) {
				for (MAM_SCM_IF_CTL_R tempScmIfCtlR : scmIfCtlL) {
					if (r.ext_sys_cd().equals(tempScmIfCtlR.ext_sys_cd())
							&& r.if_mfg_loc_cd().equals(tempScmIfCtlR.loc_cd())
							&& r.getStringNE("IF_PROC_TYP").equals(tempScmIfCtlR.if_proc_typ())
							&& tempScmIfCtlR.getStringNE("http_header_nm").equals(_DB_PARAM_IOT_PF_ORGANIZATION_KEY)) {
						return tempScmIfCtlR.getStringNE("http_header_val");
					}
				}
			}

			// SCMIF制御マスタから紐づけたHTTPヘッダマスタに該当するデータが登録されていない場合は既存のシステムパラメータを設定する。
			return getSysParm(_SYS_PARM_ORGANIZATION_KEY);
		}

		protected String getIotpfDataRecvPatternValue(MCList<MAM_SCM_IF_CTL_R> scmIfCtlL,
				MCList<?> ifL) {

			for (MST_OPER_INST_SEND_IF_R r : (MCList<MST_OPER_INST_SEND_IF_R>) ifL) {
				for (MAM_SCM_IF_CTL_R tempScmIfCtlR : scmIfCtlL) {
					if (r.ext_sys_cd().equals(tempScmIfCtlR.ext_sys_cd())
							&& r.if_mfg_loc_cd().equals(tempScmIfCtlR.loc_cd())
							&& r.getStringNE("IF_PROC_TYP").equals(tempScmIfCtlR.if_proc_typ())
							&& tempScmIfCtlR.getStringNE("http_header_nm").equals(_DB_PARAM_IOT_PF_DATA_RECV_PATTERN_KEY)) {
						return tempScmIfCtlR.getStringNE("http_header_val");
					}
				}
			}

			// SCMIF制御マスタから紐づけたHTTPヘッダマスタに該当するデータが登録されていない場合は既存のシステムパラメータを設定する。
			return getSysParm(_SYS_PARM_DATA_RECV_PATTERN_KEY);
		}

		/**
		 * 外部システムCDを取得・設定する
		 */
		protected void setExtSysCd(MCList<MAM_SCM_IF_CTL_R> scmIfCtlL, MCList<MST_OPER_INST_SEND_IF_R> sendL) {

			MSUCL_SCMLinkUtil.SCMLinkUtil_Srch01 o = MSUCL_SCMLinkUtil.crtSCMLinkUtil_Srch01();

			HashMap<MCNumber, MST_OPER_INST_SEND_IF_R> map = new HashMap<>();
			MCNumber peg = MCNumber.ZERO;
			for (MST_OPER_INST_SEND_IF_R operInstSendIfR : sendL) {

				SCMLinkUtil_Srch01_CndR r = o.up0().add();
				r.peg_no(peg);
				r.if_proc_typ(MAC_IF_PROC_TYP.MES_OPER_INST_SEND.value());
				r.loc_cd(operInstSendIfR.mfg_loc_cd());
				r.itm_cd(operInstSendIfR.mfg_itm_cd());
				r.itm_sub1(operInstSendIfR.mfg_itm_sub1());
				r.itm_sub2(operInstSendIfR.mfg_itm_sub2());
				r.itm_sub3(operInstSendIfR.mfg_itm_sub3());
				r.oper_cd(operInstSendIfR.oper_cd());
				r.ext_sys_cd(operInstSendIfR.ext_sys_cd());
				r.master_dt(getToday());

				map.put(peg, operInstSendIfR);
				peg = peg.add(1);
			}
			if (!o.up0().isEmpty()) {
				o.exec();
				for (SCMLinkUtil_Srch01_CndR row : o.down0()) {
					if (map.containsKey(row.peg_no())) {
						MST_OPER_INST_SEND_IF_R ssR = map.get(row.peg_no());
						ssR.ext_sys_cd(row.ext_sys_cd());
					}
				}
			}
		}
	}

	//FMCB CUSTOM END
}