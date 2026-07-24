package mcframe.serverMSLA.MSLAL7220;

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
import mcframe.serverPF.dbc.PFT_SDRV_IF_R;
import mcframe.commonMSLA.MSLAR2410.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.serverCore.resource.MCConst;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_BillRecvConvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_BillRecvConvService_MC extends MSLAL_BillRecvConvService_MC_A{
	//FMCB CUSTOM START

	/**
	 * BillRecvConv_Conv01オペレーション.<p>
	 *
	 */
	public class BillRecvConv_Conv01 extends MSLAL_BillRecvConvService_MC_A.BillRecvConv_Conv01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		@SuppressWarnings("unchecked")
		protected void crtIfDBC() {
			_ifDBC = PFBZL_CodeConvert.crtRecvIfDBContainer(MST_BILL_RECV_IF_R.class);
		}
		
		@Override
		protected void setCnvBpCol() {
			_cnvBpCol = "if_bill_src_cd";
		}
		@Override
		protected void setCnvIfCols() {
			_ifDBC.addCnvCol("if_bill_src_cd", "bill_src_cd", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("if_trd_cur_cd", "trd_cur_cd", MAC_IF_COL_TYP.CUR);
			_ifDBC.addCnvCol("if_pay_mtd_cd1", "pay_mtd_cd1", MAC_IF_COL_TYP.RCV_MTD);
			_ifDBC.addCnvCol("if_pay_mtd_cd2", "pay_mtd_cd2", MAC_IF_COL_TYP.RCV_MTD);
			_ifDBC.addCnvCol("if_pay_mtd_cd3", "pay_mtd_cd3", MAC_IF_COL_TYP.RCV_MTD);
			_ifDBC.addCnvCol("if_pay_mtd_cd4", "pay_mtd_cd4", MAC_IF_COL_TYP.RCV_MTD);
			_ifDBC.addCnvCol("if_pay_mtd_cd5", "pay_mtd_cd5", MAC_IF_COL_TYP.RCV_MTD);
			_ifDBC.addCnvCol("if_pay_mtd_cd6", "pay_mtd_cd6", MAC_IF_COL_TYP.RCV_MTD);
			_ifDBC.addCnvCol("if_pay_mtd_cd7", "pay_mtd_cd7", MAC_IF_COL_TYP.RCV_MTD);
			_ifDBC.addCnvCol("if_pay_mtd_cd8", "pay_mtd_cd8", MAC_IF_COL_TYP.RCV_MTD);
			_ifDBC.addCnvCol("if_pay_mtd_cd9", "pay_mtd_cd9", MAC_IF_COL_TYP.RCV_MTD);
			_ifDBC.addCnvCol("if_pay_mtd_cd10", "pay_mtd_cd10", MAC_IF_COL_TYP.RCV_MTD);
			_ifDBC.addCnvCol("if_bank_ac_cd", "bank_ac_cd", MAC_IF_COL_TYP.BANK_AC);
			_ifDBC.addCnvCol("if_trd_cd", "trd_cd", MAC_IF_COL_TYP.TRD);
			_ifDBC.addCnvItmCol("if_itm_cd", "if_itm_sub1", "if_itm_sub2", "if_itm_sub3","itm_cd", "itm_sub1", "itm_sub2", "itm_sub3");
			_ifDBC.addCnvCol("if_trd_unit_cd", "trd_unit_cd", MAC_IF_COL_TYP.UNIT);
			_ifDBC.addCnvCol("if_tax_cd", "tax_cd", MAC_IF_COL_TYP.TAX);
		}
		
		@Override
		protected void pushAlertMsg() {
			Map<List<String>, MCMessageList> map = new HashMap<List<String>, MCMessageList>();
			
			MCMessageList msgList = MCMessagePool.getMessageList();
			MCList<MST_BILL_RECV_IF_R> ifL = MCList.create(MST_BILL_RECV_IF_R.class);

			for (MCContainer row : _ifDBC.getExIfL()) {
				MST_BILL_RECV_IF_R ifR = (MST_BILL_RECV_IF_R)row;
				if (!isNull(ifR.bill_src_cd())) {
					ifL.add(ifR);
				}
			}
			if (ifL.isEmpty()) {
				return;
			}
			
			for (MST_BILL_RECV_IF_R ifR : ifL) {
				for (MCMessage msg : msgList) {
					if (msg.getCauseRow() == ifR) {
						
						List<String> keyList = new ArrayList<String>();
						keyList.add(ifR.bill_src_cd());
						
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
				String billSrcCd = entry.getKey().get(0);

				pushAlert(null, null,billSrcCd,null, MODULE_ID, LOGIC_ID, OPERATION_ID,
						entry.getValue(), FXBAL_BatchLogManager.getLogger(),MSLAL0759,
						MCConst.lgclbl.getLabel(MODULE_ID, LOGIC_ID, null),
						MCDate.sysnow().toString("yyyy/MM/dd HH:mm:ss"),
						getCo().co_cd(),billSrcCd);
			}
		}
	}
	/**
	 * BillRecvConv_Conv02オペレーション.<p>
	 *
	 */
	public class BillRecvConv_Conv02 extends MSLAL_BillRecvConvService_MC_A.BillRecvConv_Conv02 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		@SuppressWarnings({
			"unchecked", "rawtypes"
		})
		
		protected void crtRptSet() {
			_IfRptSet = PFBZL_FileInput.createIfRecvReportSet(BillHdrRowR.class, MST_BILL_RECV_IF_R.class);
			_IfRptSet.setReportSet(MSLAR_BillPrnt.create());
			_IfRptSet.setRowMapper(new Map_MST_BILL_RECV_IF_R_DtlR());
		}
	}
	/**
	 * BillRecvConv_Conv03オペレーション.<p>
	 *
	 */
	public class BillRecvConv_Conv03 extends MSLAL_BillRecvConvService_MC_A.BillRecvConv_Conv03 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		@SuppressWarnings({
			"unchecked", "rawtypes"
		})
		
		protected void crtRptSet() {
			_IfRptSet = PFBZL_FileInput.createIfRecvReportSet(BillHdrRowR.class, MST_BILL_RECV_IF_R.class);
			_IfRptSet.setReportSet(MSLAR_BillPrnt.create());
			_IfRptSet.setRowMapper(new Map_MST_BILL_RECV_IF_R_DtlR());
		}
		
		@Override
		protected void setRptSetData() {
			_IfRptSet.getReportSet().addAll(up1());
		}
	}
	
	public class Map_MST_BILL_RECV_IF_R_DtlR<D extends MST_BILL_RECV_IF_R, S extends BillHdrRowR, W extends PFT_SDRV_IF_R> 
	extends MAUCC_RowMapperWith<D, S, W>{
		
		protected W _ifR;
		
		@Override
		public void setWith(W ifR){
			this._ifR = ifR;
		}
		
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_BILL_RECV_IF_R.$data_crud_typ, BillHdrRowR.$data_crud_typ);
			addColumnPathMap(MST_BILL_RECV_IF_R.$data_make_dt, BillHdrRowR.$data_make_dt);
			addColumnPathMap(MST_BILL_RECV_IF_R.$bill_cl_dt, BillHdrRowR.$bill_cl_dt);
			addColumnPathMap(MST_BILL_RECV_IF_R.$bill_dt, BillHdrRowR.$bill_dt);
			addColumnPathMap(MST_BILL_RECV_IF_R.$bill_no, BillHdrRowR.$bill_no);
			addColumnPathMap(MST_BILL_RECV_IF_R.$bill_d_no, BillHdrRowR.$bill_d_no);
			addColumnPathMap(MST_BILL_RECV_IF_R.$pre_bill_no, BillHdrRowR.$pre_bill_no);
			addColumnPathMap(MST_BILL_RECV_IF_R.$pre_bill_dt, BillHdrRowR.$pre_bill_dt);
			addColumnPathMap(MST_BILL_RECV_IF_R.$bill_st_dt, BillHdrRowR.$bill_st_dt);
			addColumnPathMap(MST_BILL_RECV_IF_R.$bill_end_dt, BillHdrRowR.$bill_end_dt);
			addColumnPathMap(MST_BILL_RECV_IF_R.$iv_no, BillHdrRowR.$iv_no);
			addColumnPathMap(MST_BILL_RECV_IF_R.$wrk_no, BillHdrRowR.$wrk_no);
			addColumnPathMap(MST_BILL_RECV_IF_R.$wrk_nm, BillHdrRowR.$wrk_nm);
			addColumnPathMap(MST_BILL_RECV_IF_R.$bill_src_ein, BillHdrRowR.$bill_co_ein);
			addColumnPathMap(MST_BILL_RECV_IF_R.$bill_src_biz_co_no, BillHdrRowR.$bill_co_biz_co_no);
			addColumnPathMap(MST_BILL_RECV_IF_R.$bill_src_zip_cd, BillHdrRowR.$bill_co_zip_cd);
			addColumnPathMap(MST_BILL_RECV_IF_R.$bill_src_addr1, BillHdrRowR.$bill_co_addr1);
			addColumnPathMap(MST_BILL_RECV_IF_R.$bill_src_addr2, BillHdrRowR.$bill_co_addr2);
			addColumnPathMap(MST_BILL_RECV_IF_R.$bill_src_addr3, BillHdrRowR.$bill_co_addr3);
			addColumnPathMap(MST_BILL_RECV_IF_R.$bill_src_addr4, BillHdrRowR.$bill_co_addr4);
			addColumnPathMap(MST_BILL_RECV_IF_R.$bill_src_dpt, BillHdrRowR.$bill_co_dpt);
			addColumnPathMap(MST_BILL_RECV_IF_R.$bill_src_tel, BillHdrRowR.$bill_co_tel);
			addColumnPathMap(MST_BILL_RECV_IF_R.$bill_xrate, BillHdrRowR.$bill_xrate);
			addColumnPathMap(MST_BILL_RECV_IF_R.$last_bill_amt, BillHdrRowR.$last_bill_amt);
			addColumnPathMap(MST_BILL_RECV_IF_R.$rcv_amt, BillHdrRowR.$rcv_amt);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sw_amt, BillHdrRowR.$sw_amt);
			addColumnPathMap(MST_BILL_RECV_IF_R.$setoff_amt, BillHdrRowR.$setoff_amt);
			addColumnPathMap(MST_BILL_RECV_IF_R.$bfw_amt, BillHdrRowR.$bfw_amt);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sls_amt, BillHdrRowR.$sls_amt);
			addColumnPathMap(MST_BILL_RECV_IF_R.$dscnt_amt, BillHdrRowR.$dscnt_amt);
			addColumnPathMap(MST_BILL_RECV_IF_R.$ret_amt, BillHdrRowR.$ret_amt);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_amt, BillHdrRowR.$tax_amt);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sw_to_amt, BillHdrRowR.$sw_to_amt);
			addColumnPathMap(MST_BILL_RECV_IF_R.$bill_amt, BillHdrRowR.$bill_amt);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate1, BillHdrRowR.$tax_rate1);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate_sls_amt1, BillHdrRowR.$tax_rate_sls_amt1);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate_tax_amt1, BillHdrRowR.$tax_rate_tax_amt1);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate_base_tax_amt1, BillHdrRowR.$tax_rate_base_tax_amt1);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate2, BillHdrRowR.$tax_rate2);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate_sls_amt2, BillHdrRowR.$tax_rate_sls_amt2);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate_tax_amt2, BillHdrRowR.$tax_rate_tax_amt2);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate_base_tax_amt2, BillHdrRowR.$tax_rate_base_tax_amt2);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate3, BillHdrRowR.$tax_rate3);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate_sls_amt3, BillHdrRowR.$tax_rate_sls_amt3);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate_tax_amt3, BillHdrRowR.$tax_rate_tax_amt3);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate_base_tax_amt3, BillHdrRowR.$tax_rate_base_tax_amt3);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate4, BillHdrRowR.$tax_rate4);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate_sls_amt4, BillHdrRowR.$tax_rate_sls_amt4);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate_tax_amt4, BillHdrRowR.$tax_rate_tax_amt4);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate_base_tax_amt4, BillHdrRowR.$tax_rate_base_tax_amt4);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate5, BillHdrRowR.$tax_rate5);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate_sls_amt5, BillHdrRowR.$tax_rate_sls_amt5);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate_tax_amt5, BillHdrRowR.$tax_rate_tax_amt5);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate_base_tax_amt5, BillHdrRowR.$tax_rate_base_tax_amt5);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate6, BillHdrRowR.$tax_rate6);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate_sls_amt6, BillHdrRowR.$tax_rate_sls_amt6);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate_tax_amt6, BillHdrRowR.$tax_rate_tax_amt6);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate_base_tax_amt6, BillHdrRowR.$tax_rate_base_tax_amt6);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate7, BillHdrRowR.$tax_rate7);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate_sls_amt7, BillHdrRowR.$tax_rate_sls_amt7);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate_tax_amt7, BillHdrRowR.$tax_rate_tax_amt7);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate_base_tax_amt7, BillHdrRowR.$tax_rate_base_tax_amt7);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate8, BillHdrRowR.$tax_rate8);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate_sls_amt8, BillHdrRowR.$tax_rate_sls_amt8);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate_tax_amt8, BillHdrRowR.$tax_rate_tax_amt8);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate_base_tax_amt8, BillHdrRowR.$tax_rate_base_tax_amt8);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate9, BillHdrRowR.$tax_rate9);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate_sls_amt9, BillHdrRowR.$tax_rate_sls_amt9);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate_tax_amt9, BillHdrRowR.$tax_rate_tax_amt9);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate_base_tax_amt9, BillHdrRowR.$tax_rate_base_tax_amt9);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate10, BillHdrRowR.$tax_rate10);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate_sls_amt10, BillHdrRowR.$tax_rate_sls_amt10);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate_tax_amt10, BillHdrRowR.$tax_rate_tax_amt10);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate_base_tax_amt10, BillHdrRowR.$tax_rate_base_tax_amt10);
			addColumnPathMap(MST_BILL_RECV_IF_R.$adv_amt_bal, BillHdrRowR.$adv_amt_bal);
			addColumnPathMap(MST_BILL_RECV_IF_R.$adv_amt, BillHdrRowR.$adv_amt);
			addColumnPathMap(MST_BILL_RECV_IF_R.$adv_setoff_amt, BillHdrRowR.$adv_setoff_amt);
			addColumnPathMap(MST_BILL_RECV_IF_R.$adv_setoff_tax_amt, BillHdrRowR.$adv_setoff_tax_amt);
			addColumnPathMap(MST_BILL_RECV_IF_R.$pay_schd_amt1, BillHdrRowR.$rcv_schd_amt1);
			addColumnPathMap(MST_BILL_RECV_IF_R.$pay_schd_dt2, BillHdrRowR.$rcv_schd_dt2);
			addColumnPathMap(MST_BILL_RECV_IF_R.$pay_schd_amt2, BillHdrRowR.$rcv_schd_amt2);
			addColumnPathMap(MST_BILL_RECV_IF_R.$pay_schd_dt3, BillHdrRowR.$rcv_schd_dt3);
			addColumnPathMap(MST_BILL_RECV_IF_R.$pay_schd_amt3, BillHdrRowR.$rcv_schd_amt3);
			addColumnPathMap(MST_BILL_RECV_IF_R.$pay_schd_dt4, BillHdrRowR.$rcv_schd_dt4);
			addColumnPathMap(MST_BILL_RECV_IF_R.$pay_schd_amt4, BillHdrRowR.$rcv_schd_amt4);
			addColumnPathMap(MST_BILL_RECV_IF_R.$pay_schd_dt5, BillHdrRowR.$rcv_schd_dt5);
			addColumnPathMap(MST_BILL_RECV_IF_R.$pay_schd_amt5, BillHdrRowR.$rcv_schd_amt5);
			addColumnPathMap(MST_BILL_RECV_IF_R.$pay_schd_dt6, BillHdrRowR.$rcv_schd_dt6);
			addColumnPathMap(MST_BILL_RECV_IF_R.$pay_schd_amt6, BillHdrRowR.$rcv_schd_amt6);
			addColumnPathMap(MST_BILL_RECV_IF_R.$pay_schd_dt7, BillHdrRowR.$rcv_schd_dt7);
			addColumnPathMap(MST_BILL_RECV_IF_R.$pay_schd_amt7, BillHdrRowR.$rcv_schd_amt7);
			addColumnPathMap(MST_BILL_RECV_IF_R.$pay_schd_dt8, BillHdrRowR.$rcv_schd_dt8);
			addColumnPathMap(MST_BILL_RECV_IF_R.$pay_schd_amt8, BillHdrRowR.$rcv_schd_amt8);
			addColumnPathMap(MST_BILL_RECV_IF_R.$pay_schd_dt9, BillHdrRowR.$rcv_schd_dt9);
			addColumnPathMap(MST_BILL_RECV_IF_R.$pay_schd_amt9, BillHdrRowR.$rcv_schd_amt9);
			addColumnPathMap(MST_BILL_RECV_IF_R.$pay_schd_dt10, BillHdrRowR.$rcv_schd_dt10);
			addColumnPathMap(MST_BILL_RECV_IF_R.$pay_schd_amt10, BillHdrRowR.$rcv_schd_amt10);
			addColumnPathMap(MST_BILL_RECV_IF_R.$pay_schd_dt1, BillHdrRowR.$rcv_schd_dt1);
			addColumnPathMap(MST_BILL_RECV_IF_R.$bank_ac_typ, BillHdrRowR.$bank_ac_typ);
			addColumnPathMap(MST_BILL_RECV_IF_R.$bank_ac_no, BillHdrRowR.$bank_ac_no);
			addColumnPathMap(MST_BILL_RECV_IF_R.$bank_ac_holder, BillHdrRowR.$bank_ac_holder);
			addColumnPathMap(MST_BILL_RECV_IF_R.$bank_ac_holder_sub, BillHdrRowR.$bank_ac_holder_sub);
			addColumnPathMap(MST_BILL_RECV_IF_R.$bank_cd, BillHdrRowR.$bank_cd);
			addColumnPathMap(MST_BILL_RECV_IF_R.$bank_nm, BillHdrRowR.$bank_nm);
			addColumnPathMap(MST_BILL_RECV_IF_R.$branch_cd, BillHdrRowR.$branch_cd);
			addColumnPathMap(MST_BILL_RECV_IF_R.$branch_nm, BillHdrRowR.$branch_nm);
			addColumnPathMap(MST_BILL_RECV_IF_R.$trd_ptn_typ, BillHdrRowR.$trd_ptn_typ);
			addColumnPathMap(MST_BILL_RECV_IF_R.$slip_sts_typ, BillHdrRowR.$slip_sts_typ);
			addColumnPathMap(MST_BILL_RECV_IF_R.$dlv_slip_no, BillHdrRowR.$dlv_slip_no);
			addColumnPathMap(MST_BILL_RECV_IF_R.$dlv_slip_d_no, BillHdrRowR.$dlv_slip_d_no);
			addColumnPathMap(MST_BILL_RECV_IF_R.$ship_dlv_slip_no, BillHdrRowR.$ship_dlv_slip_no);
			addColumnPathMap(MST_BILL_RECV_IF_R.$ship_dlv_slip_d_no, BillHdrRowR.$ship_dlv_slip_d_no);
			addColumnPathMap(MST_BILL_RECV_IF_R.$act_no, BillHdrRowR.$act_no);
			addColumnPathMap(MST_BILL_RECV_IF_R.$act_rev, BillHdrRowR.$act_rev);
			addColumnPathMap(MST_BILL_RECV_IF_R.$act_d_no, BillHdrRowR.$act_d_no);
			addColumnPathMap(MST_BILL_RECV_IF_R.$po_no, BillHdrRowR.$cst_po_no);
			addColumnPathMap(MST_BILL_RECV_IF_R.$po_d_no, BillHdrRowR.$cst_po_d_no);
			addColumnPathMap(MST_BILL_RECV_IF_R.$ac_dt, BillHdrRowR.$ac_dt);
			addColumnPathMap(MST_BILL_RECV_IF_R.$dlv_dt, BillHdrRowR.$dlv_dt);
			addColumnPathMap(MST_BILL_RECV_IF_R.$rcv_dt, BillHdrRowR.$rcv_dt);
			addColumnPathMap(MST_BILL_RECV_IF_R.$bill_basis_dt, BillHdrRowR.$bill_basis_dt);
			addColumnPathMap(MST_BILL_RECV_IF_R.$base_ac_dt, BillHdrRowR.$base_ac_dt);
			addColumnPathMap(MST_BILL_RECV_IF_R.$itm_alt_nm1, BillHdrRowR.$itm_alt_nm1);
			addColumnPathMap(MST_BILL_RECV_IF_R.$itm_alt_nm2, BillHdrRowR.$itm_alt_nm2);
			addColumnPathMap(MST_BILL_RECV_IF_R.$itm_alt_nm3, BillHdrRowR.$itm_alt_nm3);
			addColumnPathMap(MST_BILL_RECV_IF_R.$itm_alt_nm4, BillHdrRowR.$itm_alt_nm4);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sno1, BillHdrRowR.$sno1);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sno2, BillHdrRowR.$sno2);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sno3, BillHdrRowR.$sno3);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sno4, BillHdrRowR.$sno4);
			addColumnPathMap(MST_BILL_RECV_IF_R.$trd_unit_qty, BillHdrRowR.$trd_unit_qty);
			addColumnPathMap(MST_BILL_RECV_IF_R.$interim_flg, BillHdrRowR.$interim_flg);
			addColumnPathMap(MST_BILL_RECV_IF_R.$trd_cur_upri, BillHdrRowR.$trd_cur_upri);
			addColumnPathMap(MST_BILL_RECV_IF_R.$trd_cur_amt, BillHdrRowR.$trd_cur_amt);
			addColumnPathMap(MST_BILL_RECV_IF_R.$trd_cur_dscnt_amt, BillHdrRowR.$trd_cur_dscnt_amt);
			addColumnPathMap(MST_BILL_RECV_IF_R.$tax_rate, BillHdrRowR.$tax_rate);
			addColumnPathMap(MST_BILL_RECV_IF_R.$inc_tax_flg, BillHdrRowR.$inc_tax_flg);
			addColumnPathMap(MST_BILL_RECV_IF_R.$trd_cur_tax_amt, BillHdrRowR.$trd_cur_tax_amt);
			addColumnPathMap(MST_BILL_RECV_IF_R.$trd_d_rmrks, BillHdrRowR.$trd_d_rmrks);
			addColumnPathMap(MST_BILL_RECV_IF_R.$bill_bcst_nm, BillHdrRowR.$bill_bcst_nm);
			addColumnPathMap(MST_BILL_RECV_IF_R.$bill_ein, BillHdrRowR.$bill_rcpt_co_ein);
			addColumnPathMap(MST_BILL_RECV_IF_R.$bill_biz_co_no, BillHdrRowR.$bill_rcpt_co_biz_co_no);
			addColumnPathMap(MST_BILL_RECV_IF_R.$bill_zip_cd, BillHdrRowR.$bill_rcpt_co_zip_cd);
			addColumnPathMap(MST_BILL_RECV_IF_R.$bill_addr1, BillHdrRowR.$bill_rcpt_co_addr1);
			addColumnPathMap(MST_BILL_RECV_IF_R.$bill_addr2, BillHdrRowR.$bill_rcpt_co_addr2);
			addColumnPathMap(MST_BILL_RECV_IF_R.$bill_addr3, BillHdrRowR.$bill_rcpt_co_addr3);
			addColumnPathMap(MST_BILL_RECV_IF_R.$bill_addr4, BillHdrRowR.$bill_rcpt_co_addr4);
			addColumnPathMap(MST_BILL_RECV_IF_R.$bill_bcst_dpt, BillHdrRowR.$bill_bcst_dpt);
			addColumnPathMap(MST_BILL_RECV_IF_R.$bill_tel, BillHdrRowR.$bill_tel);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sub_char1, BillHdrRowR.$sub_char1);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sub_char2, BillHdrRowR.$sub_char2);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sub_char3, BillHdrRowR.$sub_char3);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sub_char4, BillHdrRowR.$sub_char4);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sub_char5, BillHdrRowR.$sub_char5);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sub_char6, BillHdrRowR.$sub_char6);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sub_char7, BillHdrRowR.$sub_char7);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sub_char8, BillHdrRowR.$sub_char8);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sub_char9, BillHdrRowR.$sub_char9);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sub_char10, BillHdrRowR.$sub_char10);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sub_char11, BillHdrRowR.$sub_char11);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sub_char12, BillHdrRowR.$sub_char12);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sub_char13, BillHdrRowR.$sub_char13);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sub_char14, BillHdrRowR.$sub_char14);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sub_char15, BillHdrRowR.$sub_char15);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sub_char16, BillHdrRowR.$sub_char16);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sub_char17, BillHdrRowR.$sub_char17);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sub_char18, BillHdrRowR.$sub_char18);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sub_char19, BillHdrRowR.$sub_char19);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sub_char20, BillHdrRowR.$sub_char20);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sub_char21, BillHdrRowR.$sub_char21);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sub_char22, BillHdrRowR.$sub_char22);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sub_char23, BillHdrRowR.$sub_char23);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sub_char24, BillHdrRowR.$sub_char24);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sub_char25, BillHdrRowR.$sub_char25);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sub_char26, BillHdrRowR.$sub_char26);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sub_char27, BillHdrRowR.$sub_char27);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sub_char28, BillHdrRowR.$sub_char28);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sub_char29, BillHdrRowR.$sub_char29);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sub_char30, BillHdrRowR.$sub_char30);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sub_num1, BillHdrRowR.$sub_num1);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sub_num2, BillHdrRowR.$sub_num2);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sub_num3, BillHdrRowR.$sub_num3);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sub_num4, BillHdrRowR.$sub_num4);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sub_num5, BillHdrRowR.$sub_num5);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sub_dt1, BillHdrRowR.$sub_dt1);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sub_dt2, BillHdrRowR.$sub_dt2);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sub_dt3, BillHdrRowR.$sub_dt3);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sub_dt4, BillHdrRowR.$sub_dt4);
			addColumnPathMap(MST_BILL_RECV_IF_R.$sub_dt5, BillHdrRowR.$sub_dt5);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_lno(getSequence(MSC_NUM_SYS_TYP.BILLRECVIF.value()));
			dest.data_no(_ifR.data_no());
			dest.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
			dest.ext_sys_cd(_ifR.ext_sys_cd());
			dest.ext_data_lno(src.data_lno());
			dest.ext_data_no(src.data_no());
			dest.imp_flg(true);
			dest.recv_dt(getToday());
			dest.if_bill_src_cd(src.bill_co_cd());
			dest.if_bill_src_nm(src.bill_co_nm());
			dest.if_trd_cur_cd(src.trd_cur_cd());
			dest.if_pay_mtd_cd1(src.rcv_mtd_cd1());
			dest.if_pay_mtd_nm1(src.rcv_mtd_nm1());
			dest.if_pay_mtd_cd2(src.rcv_mtd_cd2());
			dest.if_pay_mtd_nm2(src.rcv_mtd_nm2());
			dest.if_pay_mtd_cd3(src.rcv_mtd_cd3());
			dest.if_pay_mtd_nm3(src.rcv_mtd_nm3());
			dest.if_pay_mtd_cd4(src.rcv_mtd_cd4());
			dest.if_pay_mtd_nm4(src.rcv_mtd_nm4());
			dest.if_pay_mtd_cd5(src.rcv_mtd_cd5());
			dest.if_pay_mtd_nm5(src.rcv_mtd_nm5());
			dest.if_pay_mtd_cd6(src.rcv_mtd_cd6());
			dest.if_pay_mtd_nm6(src.rcv_mtd_nm6());
			dest.if_pay_mtd_cd7(src.rcv_mtd_cd7());
			dest.if_pay_mtd_nm7(src.rcv_mtd_nm7());
			dest.if_pay_mtd_cd8(src.rcv_mtd_cd8());
			dest.if_pay_mtd_nm8(src.rcv_mtd_nm8());
			dest.if_pay_mtd_cd9(src.rcv_mtd_cd9());
			dest.if_pay_mtd_nm9(src.rcv_mtd_nm9());
			dest.if_pay_mtd_cd10(src.rcv_mtd_cd10());
			dest.if_pay_mtd_nm10(src.rcv_mtd_nm10());
			dest.if_bank_ac_cd(src.bank_ac_cd());
			dest.if_trd_cd(src.trd_cd());
			dest.if_trd_nm(src.trd_nm());
			dest.if_itm_cd(src.itm_cd());
			dest.if_itm_sub1(src.itm_sub1());
			dest.if_itm_sub2(src.itm_sub2());
			dest.if_itm_sub3(src.itm_sub3());
			dest.if_itm_nm(src.itm_nm());
			dest.if_trd_unit_cd(src.trd_unit_cd());
			dest.if_trd_unit_nm(src.trd_unit_nm());
			dest.if_tax_cd(src.tax_cd());
			dest.if_tax_nm(src.tax_nm());
			dest.if_co_cd(src.bill_rcpt_co_cd());
			dest.if_co_nm(src.bill_rcpt_co_nm());
		}
	}

	//FMCB CUSTOM END
}