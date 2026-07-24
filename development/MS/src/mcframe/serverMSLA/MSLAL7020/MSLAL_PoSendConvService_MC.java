package mcframe.serverMSLA.MSLAL7020;

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
import mcframe.commonMSLA.MSLAR0020.*;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
import java.util.*;
import java.util.Map.Entry;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverCore.resource.MCConst;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_PoSendConvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_PoSendConvService_MC extends MSLAL_PoSendConvService_MC_A{
	//FMCB CUSTOM START

	/**
	 * PoSendConv_Conv01オペレーション.<p>
	 *
	 */
	public class PoSendConv_Conv01 extends MSLAL_PoSendConvService_MC_A.PoSendConv_Conv01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		@SuppressWarnings("unchecked")
		protected void crtIfDBC() {
			_ifDBC = PFBZL_CodeConvert.crtSendIfDBContainer(MST_PO_SEND_IF_R.class);
		}
		
		@Override
		protected void setCnvBpCol() {
			_cnvBpCol = "sppl_cd";
		}

		@Override
		protected void setCnvIfCols() {
			_ifDBC.addCnvCol("cntry_cd", MAC_IF_COL_TYP.CNTRY);
			_ifDBC.addCnvCol("purc_dpt_cd", MAC_IF_COL_TYP.DPT);
			_ifDBC.addCnvCol("purc_usr_cd", MAC_IF_COL_TYP.USR);
			_ifDBC.addCnvCol("sppl_cd", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("sppl_cntry_cd", MAC_IF_COL_TYP.CNTRY);
			_ifDBC.addCnvCol("in_to_id_cd", MAC_IF_COL_TYP.SHIP_TO_ID);
			_ifDBC.addCnvCol("in_to_cntry_cd", MAC_IF_COL_TYP.CNTRY);
			_ifDBC.addCnvCol("tdlv_cd", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("tdlv_cntry_cd", MAC_IF_COL_TYP.CNTRY);
			_ifDBC.addCnvCol("site_cd", MAC_IF_COL_TYP.SITE);
			_ifDBC.addCnvCol("drct_dlv_bp_cd", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("drct_dlv_cntry_cd", MAC_IF_COL_TYP.CNTRY);
			_ifDBC.addCnvCol("trd_cur_cd", MAC_IF_COL_TYP.CUR);
			_ifDBC.addCnvCol("dscnt_rsn_cd", MAC_IF_COL_TYP.BIZ_RSN);
			_ifDBC.addCnvCol("wrk_no", MAC_IF_COL_TYP.WRK_NO);
			_ifDBC.addCnvCol("tterm_cd1", MAC_IF_COL_TYP.TTERM1);
			_ifDBC.addCnvCol("tterm_cd2", MAC_IF_COL_TYP.TTERM2);
			_ifDBC.addCnvCol("tterm_cd3", MAC_IF_COL_TYP.TTERM3);
			_ifDBC.addCnvItmCol("itm_cd", "itm_sub1", "itm_sub2", "itm_sub3");
			_ifDBC.addCnvCol("maker_cd", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("trd_unit_cd", MAC_IF_COL_TYP.UNIT);
			_ifDBC.addCnvCol("tax_cd", MAC_IF_COL_TYP.TAX);
			_ifDBC.addCnvCol("co_cd", MAC_IF_COL_TYP.CO);
		}
		
		@Override
		protected void pushAlertMsg() {
			
			Map<List<String>, MCMessageList> map = new HashMap<List<String>, MCMessageList>();
			
			MCMessageList msgList = MCMessagePool.getMessageList();
			MCList<MST_PO_SEND_IF_R> ifL = MCList.create(MST_PO_SEND_IF_R.class);

			for (MCDBContainer row : _ifDBC.getExIfL()) {
				MST_PO_SEND_IF_R ifR = (MST_PO_SEND_IF_R)row;
				if (!isNull(ifR.sppl_cd())) {
					ifL.add(ifR);
				}
			}
			if (ifL.isEmpty()) {
				return;
			}
			
			for (MST_PO_SEND_IF_R ifR : ifL) {
				for (MCMessage msg : msgList) {
					if (msg.getCauseRow() == ifR) {
						
						List<String> keyList = new ArrayList<String>();
						keyList.add(ifR.sppl_cd());
						keyList.add(ifR.wg_cd());
						keyList.add(ifR.purc_usr_cd());
												
						if (map.containsKey(keyList)) {
							MCMessageList list = map.get(keyList);
							list.add(msg);
						}
						else {
							MCMessageList list = new MCMessageList();
							list.add(msg);
							map.put(keyList, list);
						}
					}
				}
			}
			for (Entry<List<String>, MCMessageList> entry : map.entrySet()) {
				String spplCd = entry.getKey().get(0);
				String wgCd = entry.getKey().get(1);
				String usrCd = entry.getKey().get(2);
				
				pushAlert(null, wgCd, spplCd, usrCd,
						MODULE_ID, LOGIC_ID, OPERATION_ID,
						entry.getValue(), FXBAL_BatchLogManager.getLogger(),
						MSLAL0206,
						MCConst.lgclbl.getLabel(MODULE_ID, LOGIC_ID, null),
						MCDate.sysnow().toString("yyyy/MM/dd HH:mm:ss"),
						getCo().co_cd(), wgCd, spplCd);
			}
		}
	}
	/**
	 * PoSendConv_Conv02オペレーション.<p>
	 *
	 */
	public class PoSendConv_Conv02 extends MSLAL_PoSendConvService_MC_A.PoSendConv_Conv02 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		@SuppressWarnings({
				"unchecked", "rawtypes"
		})
		protected void crtRptSet() {
			_IfRptSet = PFBZL_FileOutput.createIfSendReportSet(DtlR.class, MST_PO_SEND_IF_R.class);
			_IfRptSet.setReportSet(MSLAR_SloPoPrnt.create());
			_IfRptSet.setRowMapper(new Map_DtlR_MST_PO_SEND_IF_R());
		}
		public class Map_DtlR_MST_PO_SEND_IF_R<D extends DtlR, S extends MST_PO_SEND_IF_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
					addColumnPathMap(DtlR.$data_lno, MST_PO_SEND_IF_R.$data_lno);
					addColumnPathMap(DtlR.$data_no, MST_PO_SEND_IF_R.$data_no);
					addColumnPathMap(DtlR.$data_crud_typ, MST_PO_SEND_IF_R.$data_crud_typ);
					addColumnPathMap(DtlR.$po_crud_typ, MST_PO_SEND_IF_R.$po_crud_typ);
					addColumnPathMap(DtlR.$po_no, MST_PO_SEND_IF_R.$po_no);
					addColumnPathMap(DtlR.$po_rev, MST_PO_SEND_IF_R.$po_rev);
					addColumnPathMap(DtlR.$po_d_no, MST_PO_SEND_IF_R.$po_d_no);
					addColumnPathMap(DtlR.$po_dt, MST_PO_SEND_IF_R.$po_dt);
					addColumnPathMap(DtlR.$upd_po_print_schd_dt, MST_PO_SEND_IF_R.$upd_po_print_schd_dt);
					addColumnPathMap(DtlR.$po_print_txt, MST_PO_SEND_IF_R.$po_print_txt);
					addColumnPathMap(DtlR.$po_print_rmrks, MST_PO_SEND_IF_R.$po_print_rmrks);
					addColumnPathMap(DtlR.$po_print_d_rmrks, MST_PO_SEND_IF_R.$po_print_d_rmrks);
					addColumnPathMap(DtlR.$purc_dpt_cd, MST_PO_SEND_IF_R.$purc_dpt_cd);
					addColumnPathMap(DtlR.$purc_dpt_nm, MST_PO_SEND_IF_R.$purc_dpt_nm);
					addColumnPathMap(DtlR.$purc_usr_cd, MST_PO_SEND_IF_R.$purc_usr_cd);
					addColumnPathMap(DtlR.$purc_usr_nm, MST_PO_SEND_IF_R.$purc_usr_nm);
					addColumnPathMap(DtlR.$outsrc_flg, MST_PO_SEND_IF_R.$outsrc_flg);
					addColumnPathMap(DtlR.$drct_dlv_flg, MST_PO_SEND_IF_R.$drct_dlv_flg);
					addColumnPathMap(DtlR.$purc_id_typ, MST_PO_SEND_IF_R.$purc_id_typ);
					addColumnPathMap(DtlR.$in_to_id_typ, MST_PO_SEND_IF_R.$in_to_id_typ);
					addColumnPathMap(DtlR.$in_to_id_cd, MST_PO_SEND_IF_R.$in_to_id_cd);
					addColumnPathMap(DtlR.$in_to_nm, MST_PO_SEND_IF_R.$in_to_nm);
					addColumnPathMap(DtlR.$in_to_zip_cd, MST_PO_SEND_IF_R.$in_to_zip_cd);
					addColumnPathMap(DtlR.$in_to_addr1, MST_PO_SEND_IF_R.$in_to_addr1);
					addColumnPathMap(DtlR.$in_to_addr2, MST_PO_SEND_IF_R.$in_to_addr2);
					addColumnPathMap(DtlR.$in_to_addr3, MST_PO_SEND_IF_R.$in_to_addr3);
					addColumnPathMap(DtlR.$in_to_addr4, MST_PO_SEND_IF_R.$in_to_addr4);
					addColumnPathMap(DtlR.$in_to_cntct_dpt, MST_PO_SEND_IF_R.$in_to_cntct_dpt);
					addColumnPathMap(DtlR.$in_to_cntct_psn, MST_PO_SEND_IF_R.$in_to_cntct_psn);
					addColumnPathMap(DtlR.$in_to_tel, MST_PO_SEND_IF_R.$in_to_tel);
					addColumnPathMap(DtlR.$in_to_fax, MST_PO_SEND_IF_R.$in_to_fax);
					addColumnPathMap(DtlR.$in_to_sundry_flg, MST_PO_SEND_IF_R.$in_to_sundry_flg);
					addColumnPathMap(DtlR.$in_to_cntry_cd, MST_PO_SEND_IF_R.$in_to_cntry_cd);
					addColumnPathMap(DtlR.$site_cd, MST_PO_SEND_IF_R.$site_cd);
					addColumnPathMap(DtlR.$site_nm, MST_PO_SEND_IF_R.$site_nm);
					addColumnPathMap(DtlR.$drct_dlv_bp_cd, MST_PO_SEND_IF_R.$drct_dlv_bp_cd);
					addColumnPathMap(DtlR.$drct_dlv_bp_nm, MST_PO_SEND_IF_R.$drct_dlv_bp_nm);
					addColumnPathMap(DtlR.$drct_dlv_cntry_cd, MST_PO_SEND_IF_R.$drct_dlv_cntry_cd);
					addColumnPathMap(DtlR.$tdlv_cd, MST_PO_SEND_IF_R.$tdlv_cd);
					addColumnPathMap(DtlR.$tdlv_nm, MST_PO_SEND_IF_R.$tdlv_nm);
					addColumnPathMap(DtlR.$tdlv_zip_cd, MST_PO_SEND_IF_R.$tdlv_zip_cd);
					addColumnPathMap(DtlR.$tdlv_addr1, MST_PO_SEND_IF_R.$tdlv_addr1);
					addColumnPathMap(DtlR.$tdlv_addr2, MST_PO_SEND_IF_R.$tdlv_addr2);
					addColumnPathMap(DtlR.$tdlv_addr3, MST_PO_SEND_IF_R.$tdlv_addr3);
					addColumnPathMap(DtlR.$tdlv_addr4, MST_PO_SEND_IF_R.$tdlv_addr4);
					addColumnPathMap(DtlR.$tdlv_cntct_dpt, MST_PO_SEND_IF_R.$tdlv_cntct_dpt);
					addColumnPathMap(DtlR.$tdlv_cntct_psn, MST_PO_SEND_IF_R.$tdlv_cntct_psn);
					addColumnPathMap(DtlR.$tdlv_tel, MST_PO_SEND_IF_R.$tdlv_tel);
					addColumnPathMap(DtlR.$tdlv_fax, MST_PO_SEND_IF_R.$tdlv_fax);
					addColumnPathMap(DtlR.$tdlv_sundry_flg, MST_PO_SEND_IF_R.$tdlv_sundry_flg);
					addColumnPathMap(DtlR.$tdlv_cntry_cd, MST_PO_SEND_IF_R.$tdlv_cntry_cd);
					addColumnPathMap(DtlR.$dlv_slip_rmrks, MST_PO_SEND_IF_R.$dlv_slip_rmrks);
					addColumnPathMap(DtlR.$dlv_slip_d_rmrks, MST_PO_SEND_IF_R.$dlv_slip_d_rmrks);
					addColumnPathMap(DtlR.$wrk_no, MST_PO_SEND_IF_R.$wrk_no);
					addColumnPathMap(DtlR.$wrk_nm, MST_PO_SEND_IF_R.$wrk_nm);
					addColumnPathMap(DtlR.$tterm_cd1, MST_PO_SEND_IF_R.$tterm_cd1);
					addColumnPathMap(DtlR.$tterm_nm1, MST_PO_SEND_IF_R.$tterm_nm1);
					addColumnPathMap(DtlR.$tterm_rmrks1, MST_PO_SEND_IF_R.$tterm_rmrks1);
					addColumnPathMap(DtlR.$tterm_cd2, MST_PO_SEND_IF_R.$tterm_cd2);
					addColumnPathMap(DtlR.$tterm_nm2, MST_PO_SEND_IF_R.$tterm_nm2);
					addColumnPathMap(DtlR.$tterm_rmrks2, MST_PO_SEND_IF_R.$tterm_rmrks2);
					addColumnPathMap(DtlR.$tterm_cd3, MST_PO_SEND_IF_R.$tterm_cd3);
					addColumnPathMap(DtlR.$tterm_nm3, MST_PO_SEND_IF_R.$tterm_nm3);
					addColumnPathMap(DtlR.$tterm_rmrks3, MST_PO_SEND_IF_R.$tterm_rmrks3);
					addColumnPathMap(DtlR.$sno1, MST_PO_SEND_IF_R.$sno1);
					addColumnPathMap(DtlR.$sno2, MST_PO_SEND_IF_R.$sno2);
					addColumnPathMap(DtlR.$sno3, MST_PO_SEND_IF_R.$sno3);
					addColumnPathMap(DtlR.$sno4, MST_PO_SEND_IF_R.$sno4);
					addColumnPathMap(DtlR.$trd_unit_cd, MST_PO_SEND_IF_R.$trd_unit_cd);
					addColumnPathMap(DtlR.$trd_unit_nm, MST_PO_SEND_IF_R.$trd_unit_nm);
					addColumnPathMap(DtlR.$trd_unit_qty, MST_PO_SEND_IF_R.$trd_unit_qty);
					addColumnPathMap(DtlR.$trd_cur_cd, MST_PO_SEND_IF_R.$trd_cur_cd);
					addColumnPathMap(DtlR.$inc_tax_flg, MST_PO_SEND_IF_R.$inc_tax_flg);
					addColumnPathMap(DtlR.$interim_flg, MST_PO_SEND_IF_R.$interim_flg);
					addColumnPathMap(DtlR.$trd_cur_upri, MST_PO_SEND_IF_R.$trd_cur_upri);
					addColumnPathMap(DtlR.$trd_cur_amt, MST_PO_SEND_IF_R.$trd_cur_amt);
					addColumnPathMap(DtlR.$trd_cur_dscnt_amt, MST_PO_SEND_IF_R.$trd_cur_dscnt_amt);
					addColumnPathMap(DtlR.$dscnt_rsn_cd, MST_PO_SEND_IF_R.$dscnt_rsn_cd);
					addColumnPathMap(DtlR.$dscnt_rsn_nm, MST_PO_SEND_IF_R.$dscnt_rsn_nm);
					addColumnPathMap(DtlR.$tax_fix_flg, MST_PO_SEND_IF_R.$tax_fix_flg);
					addColumnPathMap(DtlR.$tax_cd, MST_PO_SEND_IF_R.$tax_cd);
					addColumnPathMap(DtlR.$tax_nm, MST_PO_SEND_IF_R.$tax_nm);
					addColumnPathMap(DtlR.$tax_rate, MST_PO_SEND_IF_R.$tax_rate);
					addColumnPathMap(DtlR.$tax_typ, MST_PO_SEND_IF_R.$tax_typ);
					addColumnPathMap(DtlR.$trd_cur_tax_amt, MST_PO_SEND_IF_R.$trd_cur_tax_amt);
					addColumnPathMap(DtlR.$abort_flg, MST_PO_SEND_IF_R.$abort_flg);
					addColumnPathMap(DtlR.$purc_schd_dt, MST_PO_SEND_IF_R.$purc_schd_dt);
					addColumnPathMap(DtlR.$maker_cd, MST_PO_SEND_IF_R.$maker_cd);
					addColumnPathMap(DtlR.$maker_nm, MST_PO_SEND_IF_R.$maker_nm);
					addColumnPathMap(DtlR.$ver_no, MST_PO_SEND_IF_R.$ver_no);
					addColumnPathMap(DtlR.$sub_char1, MST_PO_SEND_IF_R.$sub_char1);
					addColumnPathMap(DtlR.$sub_char2, MST_PO_SEND_IF_R.$sub_char2);
					addColumnPathMap(DtlR.$sub_char3, MST_PO_SEND_IF_R.$sub_char3);
					addColumnPathMap(DtlR.$sub_char4, MST_PO_SEND_IF_R.$sub_char4);
					addColumnPathMap(DtlR.$sub_char5, MST_PO_SEND_IF_R.$sub_char5);
					addColumnPathMap(DtlR.$sub_char6, MST_PO_SEND_IF_R.$sub_char6);
					addColumnPathMap(DtlR.$sub_char7, MST_PO_SEND_IF_R.$sub_char7);
					addColumnPathMap(DtlR.$sub_char8, MST_PO_SEND_IF_R.$sub_char8);
					addColumnPathMap(DtlR.$sub_char9, MST_PO_SEND_IF_R.$sub_char9);
					addColumnPathMap(DtlR.$sub_char10, MST_PO_SEND_IF_R.$sub_char10);
					addColumnPathMap(DtlR.$sub_char11, MST_PO_SEND_IF_R.$sub_char11);
					addColumnPathMap(DtlR.$sub_char12, MST_PO_SEND_IF_R.$sub_char12);
					addColumnPathMap(DtlR.$sub_char13, MST_PO_SEND_IF_R.$sub_char13);
					addColumnPathMap(DtlR.$sub_char14, MST_PO_SEND_IF_R.$sub_char14);
					addColumnPathMap(DtlR.$sub_char15, MST_PO_SEND_IF_R.$sub_char15);
					addColumnPathMap(DtlR.$sub_char16, MST_PO_SEND_IF_R.$sub_char16);
					addColumnPathMap(DtlR.$sub_char17, MST_PO_SEND_IF_R.$sub_char17);
					addColumnPathMap(DtlR.$sub_char18, MST_PO_SEND_IF_R.$sub_char18);
					addColumnPathMap(DtlR.$sub_char19, MST_PO_SEND_IF_R.$sub_char19);
					addColumnPathMap(DtlR.$sub_char20, MST_PO_SEND_IF_R.$sub_char20);
					addColumnPathMap(DtlR.$sub_char21, MST_PO_SEND_IF_R.$sub_char21);
					addColumnPathMap(DtlR.$sub_char22, MST_PO_SEND_IF_R.$sub_char22);
					addColumnPathMap(DtlR.$sub_char23, MST_PO_SEND_IF_R.$sub_char23);
					addColumnPathMap(DtlR.$sub_char24, MST_PO_SEND_IF_R.$sub_char24);
					addColumnPathMap(DtlR.$sub_char25, MST_PO_SEND_IF_R.$sub_char25);
					addColumnPathMap(DtlR.$sub_char26, MST_PO_SEND_IF_R.$sub_char26);
					addColumnPathMap(DtlR.$sub_char27, MST_PO_SEND_IF_R.$sub_char27);
					addColumnPathMap(DtlR.$sub_char28, MST_PO_SEND_IF_R.$sub_char28);
					addColumnPathMap(DtlR.$sub_char29, MST_PO_SEND_IF_R.$sub_char29);
					addColumnPathMap(DtlR.$sub_char30, MST_PO_SEND_IF_R.$sub_char30);
					addColumnPathMap(DtlR.$sub_num1, MST_PO_SEND_IF_R.$sub_num1);
					addColumnPathMap(DtlR.$sub_num2, MST_PO_SEND_IF_R.$sub_num2);
					addColumnPathMap(DtlR.$sub_num3, MST_PO_SEND_IF_R.$sub_num3);
					addColumnPathMap(DtlR.$sub_num4, MST_PO_SEND_IF_R.$sub_num4);
					addColumnPathMap(DtlR.$sub_num5, MST_PO_SEND_IF_R.$sub_num5);
					addColumnPathMap(DtlR.$sub_dt1, MST_PO_SEND_IF_R.$sub_dt1);
					addColumnPathMap(DtlR.$sub_dt2, MST_PO_SEND_IF_R.$sub_dt2);
					addColumnPathMap(DtlR.$sub_dt3, MST_PO_SEND_IF_R.$sub_dt3);
					addColumnPathMap(DtlR.$sub_dt4, MST_PO_SEND_IF_R.$sub_dt4);
					addColumnPathMap(DtlR.$sub_dt5, MST_PO_SEND_IF_R.$sub_dt5);
					addColumnPathMap(DtlR.$edi_sub_char1, MST_PO_SEND_IF_R.$edi_sub_char1);
					addColumnPathMap(DtlR.$edi_sub_char2, MST_PO_SEND_IF_R.$edi_sub_char2);
					addColumnPathMap(DtlR.$edi_sub_char3, MST_PO_SEND_IF_R.$edi_sub_char3);
					addColumnPathMap(DtlR.$edi_sub_char4, MST_PO_SEND_IF_R.$edi_sub_char4);
					addColumnPathMap(DtlR.$edi_sub_char5, MST_PO_SEND_IF_R.$edi_sub_char5);
					addColumnPathMap(DtlR.$edi_sub_num1, MST_PO_SEND_IF_R.$edi_sub_num1);
					addColumnPathMap(DtlR.$edi_sub_dt1, MST_PO_SEND_IF_R.$edi_sub_dt1);
					addColumnPathMap(DtlR.$edi_sub_d_char1, MST_PO_SEND_IF_R.$edi_sub_d_char1);
					addColumnPathMap(DtlR.$edi_sub_d_char2, MST_PO_SEND_IF_R.$edi_sub_d_char2);
					addColumnPathMap(DtlR.$edi_sub_d_char3, MST_PO_SEND_IF_R.$edi_sub_d_char3);
					addColumnPathMap(DtlR.$edi_sub_d_char4, MST_PO_SEND_IF_R.$edi_sub_d_char4);
					addColumnPathMap(DtlR.$edi_sub_d_char5, MST_PO_SEND_IF_R.$edi_sub_d_char5);
					addColumnPathMap(DtlR.$edi_sub_d_num1, MST_PO_SEND_IF_R.$edi_sub_d_num1);
					addColumnPathMap(DtlR.$edi_sub_d_dt1, MST_PO_SEND_IF_R.$edi_sub_d_dt1);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.po_co_cntry_cd(src.if_cntry_cd());
				dest.purc_dpt_cd(src.if_purc_dpt_cd());
				dest.purc_usr_cd(src.if_purc_usr_cd());
				dest.slo_co_cd(src.if_sppl_cd());
				dest.slo_co_nm(src.sppl_nm());
				dest.slo_co_cntry_cd(src.if_sppl_cntry_cd());
				dest.crct_rsn_nm(src.po_crct_rsn_nm());
				dest.crct_rsn_rmrks(src.po_crct_rsn_rmrks());
				dest.trd_cur_cd(src.if_trd_cur_cd());
				dest.wrk_no(src.if_wrk_no());
				dest.tterm_cd1(src.if_tterm_cd1());
				dest.tterm_cd2(src.if_tterm_cd2());
				dest.tterm_cd3(src.if_tterm_cd3());
				dest.in_to_id_cd(src.if_in_to_id_cd());
				dest.in_to_cntry_cd(src.if_in_to_cntry_cd());
				dest.tdlv_cd(src.if_tdlv_cd());
				dest.tdlv_cntry_cd(src.if_tdlv_cntry_cd());
				dest.site_cd(src.if_site_cd());
				dest.drct_dlv_bp_cd(src.if_drct_dlv_bp_cd());
				dest.drct_dlv_cntry_cd(src.if_drct_dlv_cntry_cd());
				dest.po_co_itm_cd(src.itm_cd());
				dest.po_co_itm_sub1(src.itm_sub1());
				dest.po_co_itm_sub2(src.itm_sub2());
				dest.po_co_itm_sub3(src.itm_sub3());
				dest.po_co_itm_nm(src.itm_nm());
				dest.po_co_iv_itm_nm(src.iv_itm_nm());
				dest.maker_cd(src.if_maker_cd());
				dest.lot_no(src.bp_lot_no());
				dest.trd_unit_cd(src.if_trd_unit_cd());
				dest.dscnt_rsn_cd(src.if_dscnt_rsn_cd());
				dest.tax_cd(src.if_tax_cd());
				dest.dlv_rqst_dt(getDt(src.dlv_rqst_tm()));
				dest.dlv_rqst_hm(getHm(src.dlv_rqst_tm()));
				dest.po_co_sundry_itm_flg(src.sundry_itm_flg());
				dest.pri_prnt_typ(MCBooleanUtil.booleanToDBString(src.pri_print_flg()));
				dest.po_co_cd(src.if_co_cd());
				dest.po_co_nm(src.co_nm());
				dest.trd_typ_cd(MAC_IF_TRD_TYP_CD.PO.value());
				dest.data_make_dt(src.ins_ts().toMCDate());
				if (isNull(src.sppl_itm_cd())) {
					dest.slo_co_itm_cd(src.if_itm_cd());
					dest.slo_co_itm_sub1(src.if_itm_sub1());
					dest.slo_co_itm_sub2(src.if_itm_sub2());
					dest.slo_co_itm_sub3(src.if_itm_sub3());
				}
				else {
					dest.slo_co_itm_cd(src.sppl_itm_cd());
				}
				dest.slo_co_itm_nm(src.sppl_itm_nm());
			}
		}
	}

	//FMCB CUSTOM END
}