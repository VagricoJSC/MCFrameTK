package mcframe.serverMSLA.MSLAL7210;

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
import mcframe.serverCore.resource.MCConst;
import mcframe.commonMSLA.MSLAR2410.*;
import mcframe.serverPFBZ.PFBZL9010.PFBZL_CodeConvert;
import mcframe.serverPFBZ.PFBZL9020.PFBZL_FileOutput;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_BillSendConvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_BillSendConvService_MC extends MSLAL_BillSendConvService_MC_A{
	//FMCB CUSTOM START

	/**
	 * BillSendConv_Conv01オペレーション.<p>
	 *
	 */
	public class BillSendConv_Conv01 extends MSLAL_BillSendConvService_MC_A.BillSendConv_Conv01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		@SuppressWarnings("unchecked")
		protected void crtIfDBC() {
			_ifDBC = PFBZL_CodeConvert.crtSendIfDBContainer(MST_BILL_SEND_IF_R.class);
		}
		
		@Override
		protected void setCnvBpCol() {
			_cnvBpCol = "bcst_cd";
		}
		
		@Override
		protected void setCnvIfCols() {
			_ifDBC.addCnvCol("co_cd", MAC_IF_COL_TYP.CO);
			_ifDBC.addCnvCol("cntry_cd", MAC_IF_COL_TYP.CNTRY);
			_ifDBC.addCnvCol("bcst_cd", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("bcst_cntry_cd", MAC_IF_COL_TYP.CNTRY);
			_ifDBC.addCnvCol("trd_cur_cd", MAC_IF_COL_TYP.CUR);
			_ifDBC.addCnvCol("rcv_mtd_cd1", MAC_IF_COL_TYP.RCV_MTD);
			_ifDBC.addCnvCol("rcv_mtd_cd2", MAC_IF_COL_TYP.RCV_MTD);
			_ifDBC.addCnvCol("rcv_mtd_cd3", MAC_IF_COL_TYP.RCV_MTD);
			_ifDBC.addCnvCol("rcv_mtd_cd4", MAC_IF_COL_TYP.RCV_MTD);
			_ifDBC.addCnvCol("rcv_mtd_cd5", MAC_IF_COL_TYP.RCV_MTD);
			_ifDBC.addCnvCol("rcv_mtd_cd6", MAC_IF_COL_TYP.RCV_MTD);
			_ifDBC.addCnvCol("rcv_mtd_cd7", MAC_IF_COL_TYP.RCV_MTD);
			_ifDBC.addCnvCol("rcv_mtd_cd8", MAC_IF_COL_TYP.RCV_MTD);
			_ifDBC.addCnvCol("rcv_mtd_cd9", MAC_IF_COL_TYP.RCV_MTD);
			_ifDBC.addCnvCol("rcv_mtd_cd10", MAC_IF_COL_TYP.RCV_MTD);
			_ifDBC.addCnvCol("bank_ac_cd", MAC_IF_COL_TYP.BANK_AC);
			_ifDBC.addCnvCol("trd_cd", MAC_IF_COL_TYP.TRD);
			_ifDBC.addCnvItmCol("itm_cd", "itm_sub1", "itm_sub2", "itm_sub3");
			_ifDBC.addCnvCol("trd_unit_cd", MAC_IF_COL_TYP.UNIT);
			_ifDBC.addCnvCol("tax_cd", MAC_IF_COL_TYP.TAX);
		}
		
		@Override
		protected void pushAlertMsg() {
			
			Map<List<String>, MCMessageList> map = new HashMap<List<String>, MCMessageList>();
			
			MCMessageList msgList = MCMessagePool.getMessageList();
			MCList<MST_BILL_SEND_IF_R> ifL = MCList.create(MST_BILL_SEND_IF_R.class);

			for (MCContainer row : _ifDBC.getExIfL()) {
				MST_BILL_SEND_IF_R ifR = (MST_BILL_SEND_IF_R)row;
				if (!isNull(ifR.bcst_cd())) {
					ifL.add(ifR);
				}
			}
			if (ifL.isEmpty()) {
				return;
			}
			
			for (MST_BILL_SEND_IF_R ifR : ifL) {
				for (MCMessage msg : msgList) {
					if (msg.getCauseRow() == ifR) {
						
						List<String> keyList = new ArrayList<String>();
						keyList.add(ifR.bcst_cd());
						keyList.add(ifR.bill_no());
												
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
				String bcstCd = entry.getKey().get(0);
				String billNo = entry.getKey().get(1);

				pushAlert(null, null,bcstCd,null,
						MODULE_ID, LOGIC_ID, OPERATION_ID,
						entry.getValue(), FXBAL_BatchLogManager.getLogger(),
						MSLAL0762,
						MCConst.lgclbl.getLabel(MODULE_ID, LOGIC_ID, null),
						MCDate.sysnow().toString("yyyy/MM/dd HH:mm:ss"),
						getCo().co_cd(), bcstCd, billNo);
			}
		}
	}
	/**
	 * BillSendConv_Conv02オペレーション.<p>
	 *
	 */
	public class BillSendConv_Conv02 extends MSLAL_BillSendConvService_MC_A.BillSendConv_Conv02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		@SuppressWarnings({
				"unchecked", "rawtypes"
		})
		
		protected void crtRptSet() {
			_IfRptSet = PFBZL_FileOutput.createIfSendReportSet(BillHdrRowR.class, MST_BILL_SEND_IF_R.class);
			_IfRptSet.setReportSet(MSLAR_BillPrnt.create());
			_IfRptSet.setRowMapper(new Map_DtlR_MST_BILL_SEND_IF_R());
		}
		
		public class Map_DtlR_MST_BILL_SEND_IF_R<D extends BillHdrRowR, S extends MST_BILL_SEND_IF_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(BillHdrRowR.$data_lno, MST_BILL_SEND_IF_R.$data_lno);
				addColumnPathMap(BillHdrRowR.$data_no, MST_BILL_SEND_IF_R.$data_no);
				addColumnPathMap(BillHdrRowR.$data_crud_typ, MST_BILL_SEND_IF_R.$data_crud_typ);
				addColumnPathMap(BillHdrRowR.$bill_cl_dt, MST_BILL_SEND_IF_R.$bill_cl_dt);
				addColumnPathMap(BillHdrRowR.$bill_dt, MST_BILL_SEND_IF_R.$bill_dt);
				addColumnPathMap(BillHdrRowR.$bill_no, MST_BILL_SEND_IF_R.$bill_no);
				addColumnPathMap(BillHdrRowR.$bill_d_no, MST_BILL_SEND_IF_R.$bill_d_no);
				addColumnPathMap(BillHdrRowR.$pre_bill_no, MST_BILL_SEND_IF_R.$pre_bill_no);
				addColumnPathMap(BillHdrRowR.$pre_bill_dt, MST_BILL_SEND_IF_R.$pre_bill_dt);
				addColumnPathMap(BillHdrRowR.$bill_st_dt, MST_BILL_SEND_IF_R.$bill_st_dt);
				addColumnPathMap(BillHdrRowR.$bill_end_dt, MST_BILL_SEND_IF_R.$bill_end_dt);
				addColumnPathMap(BillHdrRowR.$iv_no, MST_BILL_SEND_IF_R.$iv_no);
				addColumnPathMap(BillHdrRowR.$wrk_no, MST_BILL_SEND_IF_R.$wrk_no);
				addColumnPathMap(BillHdrRowR.$wrk_nm, MST_BILL_SEND_IF_R.$wrk_nm);
				addColumnPathMap(BillHdrRowR.$bill_co_cd, MST_BILL_SEND_IF_R.$if_co_cd);
				addColumnPathMap(BillHdrRowR.$bill_co_nm, MST_BILL_SEND_IF_R.$co_nm);
				addColumnPathMap(BillHdrRowR.$bill_co_ein, MST_BILL_SEND_IF_R.$ein);
				addColumnPathMap(BillHdrRowR.$bill_co_biz_co_no, MST_BILL_SEND_IF_R.$biz_co_no);
				addColumnPathMap(BillHdrRowR.$bill_co_zip_cd, MST_BILL_SEND_IF_R.$zip_cd);
				addColumnPathMap(BillHdrRowR.$bill_co_addr1, MST_BILL_SEND_IF_R.$addr1);
				addColumnPathMap(BillHdrRowR.$bill_co_addr2, MST_BILL_SEND_IF_R.$addr2);
				addColumnPathMap(BillHdrRowR.$bill_co_addr3, MST_BILL_SEND_IF_R.$addr3);
				addColumnPathMap(BillHdrRowR.$bill_co_addr4, MST_BILL_SEND_IF_R.$addr4);
				addColumnPathMap(BillHdrRowR.$bill_co_dpt, MST_BILL_SEND_IF_R.$bill_dpt);
				addColumnPathMap(BillHdrRowR.$bill_co_tel, MST_BILL_SEND_IF_R.$tel);
				addColumnPathMap(BillHdrRowR.$bill_co_cntry_cd, MST_BILL_SEND_IF_R.$if_cntry_cd);
				addColumnPathMap(BillHdrRowR.$bill_rcpt_co_cd, MST_BILL_SEND_IF_R.$if_bcst_cd);
				addColumnPathMap(BillHdrRowR.$bill_rcpt_co_nm, MST_BILL_SEND_IF_R.$bcst_nm);
				addColumnPathMap(BillHdrRowR.$bill_bcst_nm, MST_BILL_SEND_IF_R.$bill_bcst_nm);
				addColumnPathMap(BillHdrRowR.$bill_rcpt_co_ein, MST_BILL_SEND_IF_R.$bcst_ein);
				addColumnPathMap(BillHdrRowR.$bill_rcpt_co_biz_co_no, MST_BILL_SEND_IF_R.$bcst_biz_co_no);
				addColumnPathMap(BillHdrRowR.$bill_rcpt_co_zip_cd, MST_BILL_SEND_IF_R.$bcst_zip_cd);
				addColumnPathMap(BillHdrRowR.$bill_rcpt_co_addr1, MST_BILL_SEND_IF_R.$bcst_addr1);
				addColumnPathMap(BillHdrRowR.$bill_rcpt_co_addr2, MST_BILL_SEND_IF_R.$bcst_addr2);
				addColumnPathMap(BillHdrRowR.$bill_rcpt_co_addr3, MST_BILL_SEND_IF_R.$bcst_addr3);
				addColumnPathMap(BillHdrRowR.$bill_rcpt_co_addr4, MST_BILL_SEND_IF_R.$bcst_addr4);
				addColumnPathMap(BillHdrRowR.$bill_bcst_dpt, MST_BILL_SEND_IF_R.$bill_bcst_dpt);
				addColumnPathMap(BillHdrRowR.$bill_tel, MST_BILL_SEND_IF_R.$bill_tel);
				addColumnPathMap(BillHdrRowR.$bill_rcpt_co_cntry_cd, MST_BILL_SEND_IF_R.$if_bcst_cntry_cd);
				addColumnPathMap(BillHdrRowR.$trd_cur_cd, MST_BILL_SEND_IF_R.$if_trd_cur_cd);
				addColumnPathMap(BillHdrRowR.$bill_xrate, MST_BILL_SEND_IF_R.$bill_xrate);
				addColumnPathMap(BillHdrRowR.$last_bill_amt, MST_BILL_SEND_IF_R.$last_bill_amt);
				addColumnPathMap(BillHdrRowR.$rcv_amt, MST_BILL_SEND_IF_R.$rcv_amt);
				addColumnPathMap(BillHdrRowR.$sw_amt, MST_BILL_SEND_IF_R.$sw_amt);
				addColumnPathMap(BillHdrRowR.$setoff_amt, MST_BILL_SEND_IF_R.$setoff_amt);
				addColumnPathMap(BillHdrRowR.$bfw_amt, MST_BILL_SEND_IF_R.$bfw_amt);
				addColumnPathMap(BillHdrRowR.$sls_amt, MST_BILL_SEND_IF_R.$sls_amt);
				addColumnPathMap(BillHdrRowR.$dscnt_amt, MST_BILL_SEND_IF_R.$dscnt_amt);
				addColumnPathMap(BillHdrRowR.$ret_amt, MST_BILL_SEND_IF_R.$ret_amt);
				addColumnPathMap(BillHdrRowR.$tax_amt, MST_BILL_SEND_IF_R.$tax_amt);
				addColumnPathMap(BillHdrRowR.$sw_to_amt, MST_BILL_SEND_IF_R.$sw_to_amt);
				addColumnPathMap(BillHdrRowR.$bill_amt, MST_BILL_SEND_IF_R.$bill_amt);
				addColumnPathMap(BillHdrRowR.$tax_rate1, MST_BILL_SEND_IF_R.$tax_rate1);
				addColumnPathMap(BillHdrRowR.$tax_rate_sls_amt1, MST_BILL_SEND_IF_R.$tax_rate_sls_amt1);
				addColumnPathMap(BillHdrRowR.$tax_rate_tax_amt1, MST_BILL_SEND_IF_R.$tax_rate_tax_amt1);
				addColumnPathMap(BillHdrRowR.$tax_rate_base_tax_amt1, MST_BILL_SEND_IF_R.$tax_rate_base_tax_amt1);
				addColumnPathMap(BillHdrRowR.$tax_rate2, MST_BILL_SEND_IF_R.$tax_rate2);
				addColumnPathMap(BillHdrRowR.$tax_rate_sls_amt2, MST_BILL_SEND_IF_R.$tax_rate_sls_amt2);
				addColumnPathMap(BillHdrRowR.$tax_rate_tax_amt2, MST_BILL_SEND_IF_R.$tax_rate_tax_amt2);
				addColumnPathMap(BillHdrRowR.$tax_rate_base_tax_amt2, MST_BILL_SEND_IF_R.$tax_rate_base_tax_amt2);
				addColumnPathMap(BillHdrRowR.$tax_rate3, MST_BILL_SEND_IF_R.$tax_rate3);
				addColumnPathMap(BillHdrRowR.$tax_rate_sls_amt3, MST_BILL_SEND_IF_R.$tax_rate_sls_amt3);
				addColumnPathMap(BillHdrRowR.$tax_rate_tax_amt3, MST_BILL_SEND_IF_R.$tax_rate_tax_amt3);
				addColumnPathMap(BillHdrRowR.$tax_rate_base_tax_amt3, MST_BILL_SEND_IF_R.$tax_rate_base_tax_amt3);
				addColumnPathMap(BillHdrRowR.$tax_rate4, MST_BILL_SEND_IF_R.$tax_rate4);
				addColumnPathMap(BillHdrRowR.$tax_rate_sls_amt4, MST_BILL_SEND_IF_R.$tax_rate_sls_amt4);
				addColumnPathMap(BillHdrRowR.$tax_rate_tax_amt4, MST_BILL_SEND_IF_R.$tax_rate_tax_amt4);
				addColumnPathMap(BillHdrRowR.$tax_rate_base_tax_amt4, MST_BILL_SEND_IF_R.$tax_rate_base_tax_amt4);
				addColumnPathMap(BillHdrRowR.$tax_rate5, MST_BILL_SEND_IF_R.$tax_rate5);
				addColumnPathMap(BillHdrRowR.$tax_rate_sls_amt5, MST_BILL_SEND_IF_R.$tax_rate_sls_amt5);
				addColumnPathMap(BillHdrRowR.$tax_rate_tax_amt5, MST_BILL_SEND_IF_R.$tax_rate_tax_amt5);
				addColumnPathMap(BillHdrRowR.$tax_rate_base_tax_amt5, MST_BILL_SEND_IF_R.$tax_rate_base_tax_amt5);
				addColumnPathMap(BillHdrRowR.$tax_rate6, MST_BILL_SEND_IF_R.$tax_rate6);
				addColumnPathMap(BillHdrRowR.$tax_rate_sls_amt6, MST_BILL_SEND_IF_R.$tax_rate_sls_amt6);
				addColumnPathMap(BillHdrRowR.$tax_rate_tax_amt6, MST_BILL_SEND_IF_R.$tax_rate_tax_amt6);
				addColumnPathMap(BillHdrRowR.$tax_rate_base_tax_amt6, MST_BILL_SEND_IF_R.$tax_rate_base_tax_amt6);
				addColumnPathMap(BillHdrRowR.$tax_rate7, MST_BILL_SEND_IF_R.$tax_rate7);
				addColumnPathMap(BillHdrRowR.$tax_rate_sls_amt7, MST_BILL_SEND_IF_R.$tax_rate_sls_amt7);
				addColumnPathMap(BillHdrRowR.$tax_rate_tax_amt7, MST_BILL_SEND_IF_R.$tax_rate_tax_amt7);
				addColumnPathMap(BillHdrRowR.$tax_rate_base_tax_amt7, MST_BILL_SEND_IF_R.$tax_rate_base_tax_amt7);
				addColumnPathMap(BillHdrRowR.$tax_rate8, MST_BILL_SEND_IF_R.$tax_rate8);
				addColumnPathMap(BillHdrRowR.$tax_rate_sls_amt8, MST_BILL_SEND_IF_R.$tax_rate_sls_amt8);
				addColumnPathMap(BillHdrRowR.$tax_rate_tax_amt8, MST_BILL_SEND_IF_R.$tax_rate_tax_amt8);
				addColumnPathMap(BillHdrRowR.$tax_rate_base_tax_amt8, MST_BILL_SEND_IF_R.$tax_rate_base_tax_amt8);
				addColumnPathMap(BillHdrRowR.$tax_rate9, MST_BILL_SEND_IF_R.$tax_rate9);
				addColumnPathMap(BillHdrRowR.$tax_rate_sls_amt9, MST_BILL_SEND_IF_R.$tax_rate_sls_amt9);
				addColumnPathMap(BillHdrRowR.$tax_rate_tax_amt9, MST_BILL_SEND_IF_R.$tax_rate_tax_amt9);
				addColumnPathMap(BillHdrRowR.$tax_rate_base_tax_amt9, MST_BILL_SEND_IF_R.$tax_rate_base_tax_amt9);
				addColumnPathMap(BillHdrRowR.$tax_rate10, MST_BILL_SEND_IF_R.$tax_rate10);
				addColumnPathMap(BillHdrRowR.$tax_rate_sls_amt10, MST_BILL_SEND_IF_R.$tax_rate_sls_amt10);
				addColumnPathMap(BillHdrRowR.$tax_rate_tax_amt10, MST_BILL_SEND_IF_R.$tax_rate_tax_amt10);
				addColumnPathMap(BillHdrRowR.$tax_rate_base_tax_amt10, MST_BILL_SEND_IF_R.$tax_rate_base_tax_amt10);
				addColumnPathMap(BillHdrRowR.$adv_amt_bal, MST_BILL_SEND_IF_R.$adv_amt_bal);
				addColumnPathMap(BillHdrRowR.$adv_amt, MST_BILL_SEND_IF_R.$adv_amt);
				addColumnPathMap(BillHdrRowR.$adv_setoff_amt, MST_BILL_SEND_IF_R.$adv_setoff_amt);
				addColumnPathMap(BillHdrRowR.$adv_setoff_tax_amt, MST_BILL_SEND_IF_R.$adv_setoff_tax_amt);
				addColumnPathMap(BillHdrRowR.$rcv_schd_dt1, MST_BILL_SEND_IF_R.$rcv_schd_dt1);
				addColumnPathMap(BillHdrRowR.$rcv_schd_amt1, MST_BILL_SEND_IF_R.$rcv_schd_amt1);
				addColumnPathMap(BillHdrRowR.$rcv_mtd_cd1, MST_BILL_SEND_IF_R.$if_rcv_mtd_cd1);
				addColumnPathMap(BillHdrRowR.$rcv_mtd_nm1, MST_BILL_SEND_IF_R.$rcv_mtd_nm1);
				addColumnPathMap(BillHdrRowR.$rcv_schd_dt2, MST_BILL_SEND_IF_R.$rcv_schd_dt2);
				addColumnPathMap(BillHdrRowR.$rcv_schd_amt2, MST_BILL_SEND_IF_R.$rcv_schd_amt2);
				addColumnPathMap(BillHdrRowR.$rcv_mtd_cd2, MST_BILL_SEND_IF_R.$if_rcv_mtd_cd2);
				addColumnPathMap(BillHdrRowR.$rcv_mtd_nm2, MST_BILL_SEND_IF_R.$rcv_mtd_nm2);
				addColumnPathMap(BillHdrRowR.$rcv_schd_dt3, MST_BILL_SEND_IF_R.$rcv_schd_dt3);
				addColumnPathMap(BillHdrRowR.$rcv_schd_amt3, MST_BILL_SEND_IF_R.$rcv_schd_amt3);
				addColumnPathMap(BillHdrRowR.$rcv_mtd_cd3, MST_BILL_SEND_IF_R.$if_rcv_mtd_cd3);
				addColumnPathMap(BillHdrRowR.$rcv_mtd_nm3, MST_BILL_SEND_IF_R.$rcv_mtd_nm3);
				addColumnPathMap(BillHdrRowR.$rcv_schd_dt4, MST_BILL_SEND_IF_R.$rcv_schd_dt4);
				addColumnPathMap(BillHdrRowR.$rcv_schd_amt4, MST_BILL_SEND_IF_R.$rcv_schd_amt4);
				addColumnPathMap(BillHdrRowR.$rcv_mtd_cd4, MST_BILL_SEND_IF_R.$if_rcv_mtd_cd4);
				addColumnPathMap(BillHdrRowR.$rcv_mtd_nm4, MST_BILL_SEND_IF_R.$rcv_mtd_nm4);
				addColumnPathMap(BillHdrRowR.$rcv_schd_dt5, MST_BILL_SEND_IF_R.$rcv_schd_dt5);
				addColumnPathMap(BillHdrRowR.$rcv_schd_amt5, MST_BILL_SEND_IF_R.$rcv_schd_amt5);
				addColumnPathMap(BillHdrRowR.$rcv_mtd_cd5, MST_BILL_SEND_IF_R.$if_rcv_mtd_cd5);
				addColumnPathMap(BillHdrRowR.$rcv_mtd_nm5, MST_BILL_SEND_IF_R.$rcv_mtd_nm5);
				addColumnPathMap(BillHdrRowR.$rcv_schd_dt6, MST_BILL_SEND_IF_R.$rcv_schd_dt6);
				addColumnPathMap(BillHdrRowR.$rcv_schd_amt6, MST_BILL_SEND_IF_R.$rcv_schd_amt6);
				addColumnPathMap(BillHdrRowR.$rcv_mtd_cd6, MST_BILL_SEND_IF_R.$if_rcv_mtd_cd6);
				addColumnPathMap(BillHdrRowR.$rcv_mtd_nm6, MST_BILL_SEND_IF_R.$rcv_mtd_nm6);
				addColumnPathMap(BillHdrRowR.$rcv_schd_dt7, MST_BILL_SEND_IF_R.$rcv_schd_dt7);
				addColumnPathMap(BillHdrRowR.$rcv_schd_amt7, MST_BILL_SEND_IF_R.$rcv_schd_amt7);
				addColumnPathMap(BillHdrRowR.$rcv_mtd_cd7, MST_BILL_SEND_IF_R.$if_rcv_mtd_cd7);
				addColumnPathMap(BillHdrRowR.$rcv_mtd_nm7, MST_BILL_SEND_IF_R.$rcv_mtd_nm7);
				addColumnPathMap(BillHdrRowR.$rcv_schd_dt8, MST_BILL_SEND_IF_R.$rcv_schd_dt8);
				addColumnPathMap(BillHdrRowR.$rcv_schd_amt8, MST_BILL_SEND_IF_R.$rcv_schd_amt8);
				addColumnPathMap(BillHdrRowR.$rcv_mtd_cd8, MST_BILL_SEND_IF_R.$if_rcv_mtd_cd8);
				addColumnPathMap(BillHdrRowR.$rcv_mtd_nm8, MST_BILL_SEND_IF_R.$rcv_mtd_nm8);
				addColumnPathMap(BillHdrRowR.$rcv_schd_dt9, MST_BILL_SEND_IF_R.$rcv_schd_dt9);
				addColumnPathMap(BillHdrRowR.$rcv_schd_amt9, MST_BILL_SEND_IF_R.$rcv_schd_amt9);
				addColumnPathMap(BillHdrRowR.$rcv_mtd_cd9, MST_BILL_SEND_IF_R.$if_rcv_mtd_cd9);
				addColumnPathMap(BillHdrRowR.$rcv_mtd_nm9, MST_BILL_SEND_IF_R.$rcv_mtd_nm9);
				addColumnPathMap(BillHdrRowR.$rcv_schd_dt10, MST_BILL_SEND_IF_R.$rcv_schd_dt10);
				addColumnPathMap(BillHdrRowR.$rcv_schd_amt10, MST_BILL_SEND_IF_R.$rcv_schd_amt10);
				addColumnPathMap(BillHdrRowR.$rcv_mtd_cd10, MST_BILL_SEND_IF_R.$if_rcv_mtd_cd10);
				addColumnPathMap(BillHdrRowR.$rcv_mtd_nm10, MST_BILL_SEND_IF_R.$rcv_mtd_nm10);
				addColumnPathMap(BillHdrRowR.$bank_ac_cd, MST_BILL_SEND_IF_R.$if_bank_ac_cd);
				addColumnPathMap(BillHdrRowR.$bank_ac_typ, MST_BILL_SEND_IF_R.$bank_ac_typ);
				addColumnPathMap(BillHdrRowR.$bank_ac_no, MST_BILL_SEND_IF_R.$bank_ac_no);
				addColumnPathMap(BillHdrRowR.$bank_ac_holder, MST_BILL_SEND_IF_R.$bank_ac_holder);
				addColumnPathMap(BillHdrRowR.$bank_ac_holder_sub, MST_BILL_SEND_IF_R.$bank_ac_holder_sub);
				addColumnPathMap(BillHdrRowR.$bank_nm, MST_BILL_SEND_IF_R.$bank_nm);
				addColumnPathMap(BillHdrRowR.$bank_cd, MST_BILL_SEND_IF_R.$bank_cd);
				addColumnPathMap(BillHdrRowR.$branch_nm, MST_BILL_SEND_IF_R.$branch_nm);
				addColumnPathMap(BillHdrRowR.$branch_cd, MST_BILL_SEND_IF_R.$branch_cd);
				addColumnPathMap(BillHdrRowR.$trd_cd, MST_BILL_SEND_IF_R.$if_trd_cd);
				addColumnPathMap(BillHdrRowR.$trd_nm, MST_BILL_SEND_IF_R.$trd_nm);
				addColumnPathMap(BillHdrRowR.$trd_ptn_typ, MST_BILL_SEND_IF_R.$trd_ptn_typ);
				addColumnPathMap(BillHdrRowR.$slip_sts_typ, MST_BILL_SEND_IF_R.$slip_sts_typ);
				addColumnPathMap(BillHdrRowR.$dlv_slip_no, MST_BILL_SEND_IF_R.$dlv_slip_no);
				addColumnPathMap(BillHdrRowR.$dlv_slip_d_no, MST_BILL_SEND_IF_R.$dlv_slip_d_no);
				addColumnPathMap(BillHdrRowR.$ship_dlv_slip_no, MST_BILL_SEND_IF_R.$ship_dlv_slip_no);
				addColumnPathMap(BillHdrRowR.$ship_dlv_slip_d_no, MST_BILL_SEND_IF_R.$ship_dlv_slip_d_no);
				addColumnPathMap(BillHdrRowR.$act_no, MST_BILL_SEND_IF_R.$act_no);
				addColumnPathMap(BillHdrRowR.$act_rev, MST_BILL_SEND_IF_R.$act_rev);
				addColumnPathMap(BillHdrRowR.$act_d_no, MST_BILL_SEND_IF_R.$act_d_no);
				addColumnPathMap(BillHdrRowR.$cst_po_no, MST_BILL_SEND_IF_R.$cst_po_no);
				addColumnPathMap(BillHdrRowR.$cst_po_d_no, MST_BILL_SEND_IF_R.$cst_po_d_no);
				addColumnPathMap(BillHdrRowR.$ac_dt, MST_BILL_SEND_IF_R.$ac_dt);
				addColumnPathMap(BillHdrRowR.$dlv_dt, MST_BILL_SEND_IF_R.$dlv_dt);
				addColumnPathMap(BillHdrRowR.$rcv_dt, MST_BILL_SEND_IF_R.$rcv_dt);
				addColumnPathMap(BillHdrRowR.$bill_basis_dt, MST_BILL_SEND_IF_R.$bill_basis_dt);
				addColumnPathMap(BillHdrRowR.$base_ac_dt, MST_BILL_SEND_IF_R.$base_ac_dt);
				addColumnPathMap(BillHdrRowR.$itm_cd, MST_BILL_SEND_IF_R.$if_itm_cd);
				addColumnPathMap(BillHdrRowR.$itm_sub1, MST_BILL_SEND_IF_R.$if_itm_sub1);
				addColumnPathMap(BillHdrRowR.$itm_sub2, MST_BILL_SEND_IF_R.$if_itm_sub2);
				addColumnPathMap(BillHdrRowR.$itm_sub3, MST_BILL_SEND_IF_R.$if_itm_sub3);
				addColumnPathMap(BillHdrRowR.$itm_nm, MST_BILL_SEND_IF_R.$itm_nm);
				addColumnPathMap(BillHdrRowR.$itm_alt_nm1, MST_BILL_SEND_IF_R.$itm_alt_nm1);
				addColumnPathMap(BillHdrRowR.$itm_alt_nm2, MST_BILL_SEND_IF_R.$itm_alt_nm2);
				addColumnPathMap(BillHdrRowR.$itm_alt_nm3, MST_BILL_SEND_IF_R.$itm_alt_nm3);
				addColumnPathMap(BillHdrRowR.$itm_alt_nm4, MST_BILL_SEND_IF_R.$itm_alt_nm4);
				addColumnPathMap(BillHdrRowR.$sno1, MST_BILL_SEND_IF_R.$sno1);
				addColumnPathMap(BillHdrRowR.$sno2, MST_BILL_SEND_IF_R.$sno2);
				addColumnPathMap(BillHdrRowR.$sno3, MST_BILL_SEND_IF_R.$sno3);
				addColumnPathMap(BillHdrRowR.$sno4, MST_BILL_SEND_IF_R.$sno4);
				addColumnPathMap(BillHdrRowR.$trd_unit_cd, MST_BILL_SEND_IF_R.$if_trd_unit_cd);
				addColumnPathMap(BillHdrRowR.$trd_unit_nm, MST_BILL_SEND_IF_R.$trd_unit_nm);
				addColumnPathMap(BillHdrRowR.$trd_unit_qty, MST_BILL_SEND_IF_R.$trd_unit_qty);
				addColumnPathMap(BillHdrRowR.$interim_flg, MST_BILL_SEND_IF_R.$interim_flg);
				addColumnPathMap(BillHdrRowR.$trd_cur_upri, MST_BILL_SEND_IF_R.$trd_cur_upri);
				addColumnPathMap(BillHdrRowR.$trd_cur_amt, MST_BILL_SEND_IF_R.$trd_cur_amt);
				addColumnPathMap(BillHdrRowR.$trd_cur_dscnt_amt, MST_BILL_SEND_IF_R.$trd_cur_dscnt_amt);
				addColumnPathMap(BillHdrRowR.$tax_cd, MST_BILL_SEND_IF_R.$if_tax_cd);
				addColumnPathMap(BillHdrRowR.$tax_nm, MST_BILL_SEND_IF_R.$tax_nm);
				addColumnPathMap(BillHdrRowR.$tax_rate, MST_BILL_SEND_IF_R.$tax_rate);
				addColumnPathMap(BillHdrRowR.$inc_tax_flg, MST_BILL_SEND_IF_R.$inc_tax_flg);
				addColumnPathMap(BillHdrRowR.$trd_cur_tax_amt, MST_BILL_SEND_IF_R.$trd_cur_tax_amt);
				addColumnPathMap(BillHdrRowR.$trd_d_rmrks, MST_BILL_SEND_IF_R.$trd_d_rmrks);
				addColumnPathMap(BillHdrRowR.$sub_char1, MST_BILL_SEND_IF_R.$sub_char1);
				addColumnPathMap(BillHdrRowR.$sub_char2, MST_BILL_SEND_IF_R.$sub_char2);
				addColumnPathMap(BillHdrRowR.$sub_char3, MST_BILL_SEND_IF_R.$sub_char3);
				addColumnPathMap(BillHdrRowR.$sub_char4, MST_BILL_SEND_IF_R.$sub_char4);
				addColumnPathMap(BillHdrRowR.$sub_char5, MST_BILL_SEND_IF_R.$sub_char5);
				addColumnPathMap(BillHdrRowR.$sub_char6, MST_BILL_SEND_IF_R.$sub_char6);
				addColumnPathMap(BillHdrRowR.$sub_char7, MST_BILL_SEND_IF_R.$sub_char7);
				addColumnPathMap(BillHdrRowR.$sub_char8, MST_BILL_SEND_IF_R.$sub_char8);
				addColumnPathMap(BillHdrRowR.$sub_char9, MST_BILL_SEND_IF_R.$sub_char9);
				addColumnPathMap(BillHdrRowR.$sub_char10, MST_BILL_SEND_IF_R.$sub_char10);
				addColumnPathMap(BillHdrRowR.$sub_char11, MST_BILL_SEND_IF_R.$sub_char11);
				addColumnPathMap(BillHdrRowR.$sub_char12, MST_BILL_SEND_IF_R.$sub_char12);
				addColumnPathMap(BillHdrRowR.$sub_char13, MST_BILL_SEND_IF_R.$sub_char13);
				addColumnPathMap(BillHdrRowR.$sub_char14, MST_BILL_SEND_IF_R.$sub_char14);
				addColumnPathMap(BillHdrRowR.$sub_char15, MST_BILL_SEND_IF_R.$sub_char15);
				addColumnPathMap(BillHdrRowR.$sub_char16, MST_BILL_SEND_IF_R.$sub_char16);
				addColumnPathMap(BillHdrRowR.$sub_char17, MST_BILL_SEND_IF_R.$sub_char17);
				addColumnPathMap(BillHdrRowR.$sub_char18, MST_BILL_SEND_IF_R.$sub_char18);
				addColumnPathMap(BillHdrRowR.$sub_char19, MST_BILL_SEND_IF_R.$sub_char19);
				addColumnPathMap(BillHdrRowR.$sub_char20, MST_BILL_SEND_IF_R.$sub_char20);
				addColumnPathMap(BillHdrRowR.$sub_char21, MST_BILL_SEND_IF_R.$sub_char21);
				addColumnPathMap(BillHdrRowR.$sub_char22, MST_BILL_SEND_IF_R.$sub_char22);
				addColumnPathMap(BillHdrRowR.$sub_char23, MST_BILL_SEND_IF_R.$sub_char23);
				addColumnPathMap(BillHdrRowR.$sub_char24, MST_BILL_SEND_IF_R.$sub_char24);
				addColumnPathMap(BillHdrRowR.$sub_char25, MST_BILL_SEND_IF_R.$sub_char25);
				addColumnPathMap(BillHdrRowR.$sub_char26, MST_BILL_SEND_IF_R.$sub_char26);
				addColumnPathMap(BillHdrRowR.$sub_char27, MST_BILL_SEND_IF_R.$sub_char27);
				addColumnPathMap(BillHdrRowR.$sub_char28, MST_BILL_SEND_IF_R.$sub_char28);
				addColumnPathMap(BillHdrRowR.$sub_char29, MST_BILL_SEND_IF_R.$sub_char29);
				addColumnPathMap(BillHdrRowR.$sub_char30, MST_BILL_SEND_IF_R.$sub_char30);
				addColumnPathMap(BillHdrRowR.$sub_num1, MST_BILL_SEND_IF_R.$sub_num1);
				addColumnPathMap(BillHdrRowR.$sub_num2, MST_BILL_SEND_IF_R.$sub_num2);
				addColumnPathMap(BillHdrRowR.$sub_num3, MST_BILL_SEND_IF_R.$sub_num3);
				addColumnPathMap(BillHdrRowR.$sub_num4, MST_BILL_SEND_IF_R.$sub_num4);
				addColumnPathMap(BillHdrRowR.$sub_num5, MST_BILL_SEND_IF_R.$sub_num5);
				addColumnPathMap(BillHdrRowR.$sub_dt1, MST_BILL_SEND_IF_R.$sub_dt1);
				addColumnPathMap(BillHdrRowR.$sub_dt2, MST_BILL_SEND_IF_R.$sub_dt2);
				addColumnPathMap(BillHdrRowR.$sub_dt3, MST_BILL_SEND_IF_R.$sub_dt3);
				addColumnPathMap(BillHdrRowR.$sub_dt4, MST_BILL_SEND_IF_R.$sub_dt4);
				addColumnPathMap(BillHdrRowR.$sub_dt5, MST_BILL_SEND_IF_R.$sub_dt5);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.trd_typ_cd(MAC_IF_TRD_TYP_CD.BILL.value());
				dest.data_make_dt(src.ins_ts().toMCDate());
				
				dest.bill_co_cd(src.if_co_cd());
				dest.bill_co_cntry_cd(src.if_cntry_cd());
				dest.bill_rcpt_co_cd(src.if_bcst_cd());
				dest.bill_rcpt_co_cntry_cd(src.if_bcst_cntry_cd());
				dest.trd_cur_cd(src.if_trd_cur_cd());
				dest.rcv_mtd_cd1(src.if_rcv_mtd_cd1());
				dest.rcv_mtd_cd2(src.if_rcv_mtd_cd2());
				dest.rcv_mtd_cd3(src.if_rcv_mtd_cd3());
				dest.rcv_mtd_cd4(src.if_rcv_mtd_cd4());
				dest.rcv_mtd_cd5(src.if_rcv_mtd_cd5());
				dest.rcv_mtd_cd6(src.if_rcv_mtd_cd6());
				dest.rcv_mtd_cd7(src.if_rcv_mtd_cd7());
				dest.rcv_mtd_cd8(src.if_rcv_mtd_cd8());
				dest.rcv_mtd_cd9(src.if_rcv_mtd_cd9());
				dest.rcv_mtd_cd10(src.if_rcv_mtd_cd10());
				dest.bank_ac_cd(src.if_bank_ac_cd());
				dest.trd_cd(src.if_trd_cd());
				dest.itm_cd(src.if_itm_cd());
				dest.itm_sub1(src.if_itm_sub1());
				dest.itm_sub2(src.if_itm_sub2());
				dest.itm_sub3(src.if_itm_sub3());
				dest.trd_unit_cd(src.if_trd_unit_cd());
				dest.tax_cd(src.if_tax_cd());
			}
		}
	}
	
	/**
	 * BillSendConv_Conv03オペレーション.<p>
	 *
	 */
	public class BillSendConv_Conv03 extends MSLAL_BillSendConvService_MC_A.BillSendConv_Conv03 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}