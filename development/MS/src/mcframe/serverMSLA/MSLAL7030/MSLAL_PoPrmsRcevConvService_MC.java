package mcframe.serverMSLA.MSLAL7030;

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
import mcframe.commonMSLA.MSLAR0030.*;
import mcframe.serverMS.dbc.MST_PRMS_RECV_IF_R;
import mcframe.serverPF.dbc.PFT_SDRV_IF_R;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
import mcframe.serverFXUC.FXUCL0030.*;
import java.util.*;
import java.util.Map.Entry;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverCore.resource.MCConst;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_PoPrmsRcevConvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_PoPrmsRcevConvService_MC extends MSLAL_PoPrmsRcevConvService_MC_A{
	//FMCB CUSTOM START

	/**
	 * PoPrmsRecvConv_Conv01オペレーション.<p>
	 *
	 */
	public class PoPrmsRecvConv_Conv01 extends MSLAL_PoPrmsRcevConvService_MC_A.PoPrmsRecvConv_Conv01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		@SuppressWarnings("unchecked")
		protected void crtIfDBC() {
			_ifDBC = PFBZL_CodeConvert.crtRecvIfDBContainer(MST_PRMS_RECV_IF_R.class);
		}
		@Override
		protected void setCnvBpCol() {
			_cnvBpCol = "if_sppl_cd";
		}
		@Override
		protected void setCnvIfCols() {
			_ifDBC.addCnvCol("if_trd_unit_cd", "trd_unit_cd", MAC_IF_COL_TYP.UNIT);
			_ifDBC.addCnvCol("if_sppl_cd", "sppl_cd", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvItmCol("if_itm_cd", "if_itm_sub1", "if_itm_sub2", "if_itm_sub3", "itm_cd", "itm_sub1", "itm_sub2", "itm_sub3");
			_ifDBC.addCnvItmCol("sppl_itm_cd", "sppl_itm_sub1", "sppl_itm_sub2", "sppl_itm_sub3", "itm_cd", "itm_sub1", "itm_sub2", "itm_sub3",true);
		}
		@Override
		protected void pushAlertMsg() {
			
			Map<List<String>, MCMessageList> map = new HashMap<List<String>, MCMessageList>();
			
			MCMessageList msgList = MCMessagePool.getMessageList();
			MCList<MST_PRMS_RECV_IF_R> ifL = MCList.create(MST_PRMS_RECV_IF_R.class);

			for (MCContainer row : _ifDBC.getExIfL()) {
				MST_PRMS_RECV_IF_R ifR = (MST_PRMS_RECV_IF_R)row;
				ifL.add(ifR);
			}
			if (ifL.isEmpty()) {
				return;
			}
						
			for (MST_PRMS_RECV_IF_R ifR : ifL) {
				for (MCMessage msg : msgList) {
					if (msg.getCauseRow() == ifR) {
						
						List<String> keyList = new ArrayList<String>();
						keyList.add(ifR.sppl_cd());
						
						MST_PO_R poR = getPoR(ifR);
						keyList.add(poR.wg_cd());
						keyList.add(poR.purc_usr_cd());
						
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
		
		protected MST_PO_R getPoR(MST_PRMS_RECV_IF_R ifR) {
			MST_PO_R poR = MST_PO_R.create("T");
			MCQueryApiBuilder poR_bldr = MCQueryApiBuilder.create(poR);
			poR_bldr.setWhere(poR.po_no.eq(bind("1")), ifR.po_no());
			poR_bldr.addWhereWithAnd(poR.can_flg.eq(value(false)));
			dbSelect("MSLAL6210_MST_PO_S01", poR, poR_bldr);

			return poR;
		}
	}
	/**
	 * PoPrmsRecvConv_Conv02オペレーション.<p>
	 *
	 */
	public class PoPrmsRecvConv_Conv02 extends MSLAL_PoPrmsRcevConvService_MC_A.PoPrmsRecvConv_Conv02 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		@SuppressWarnings({
			"unchecked", "rawtypes"
		})
		protected void crtRptSet() {
			_IfRptSet = PFBZL_FileInput.createIfRecvReportSet(DtlR.class, MST_PRMS_RECV_IF_R.class);
			_IfRptSet.setReportSet(MSLAR_PrmsPrnt.create());
			_IfRptSet.setRowMapper(new Map_MST_PRMS_RECV_IF_R_DtlR());
		}
	}
	/**
	 * PoPrmsRecvConv_Conv03オペレーション.<p>
	 *
	 */
	public class PoPrmsRecvConv_Conv03 extends MSLAL_PoPrmsRcevConvService_MC_A.PoPrmsRecvConv_Conv03 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		@SuppressWarnings({
			"unchecked", "rawtypes"
		})
		protected void crtRptSet() {
			_IfRptSet = PFBZL_FileInput.createIfRecvReportSet(DtlR.class, MST_PRMS_RECV_IF_R.class);
			_IfRptSet.setReportSet(MSLAR_PrmsPrnt.create());
			_IfRptSet.setRowMapper(new Map_MST_PRMS_RECV_IF_R_DtlR());
		}
		
		@Override
		protected void setRptSetData() {
			_IfRptSet.getReportSet().addAll(up1());
		}
	}
	
	public class Map_MST_PRMS_RECV_IF_R_DtlR<D extends MST_PRMS_RECV_IF_R, S extends DtlR, W extends PFT_SDRV_IF_R>  
	extends MAUCC_RowMapperWith<D, S, W> {
	
	protected W _ifR;
	@Override
	public void setWith(W ifR){
		this._ifR = ifR;
	}
	@Override
	protected void setupColumnPathMap() {
		addColumnPathMap(MST_PRMS_RECV_IF_R.$data_crud_typ, DtlR.$data_crud_typ);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$po_no, DtlR.$po_no);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$po_rev, DtlR.$po_rev);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$po_d_no, DtlR.$po_d_no);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$trd_unit_qty, DtlR.$trd_unit_qty);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$prms_rmrks, DtlR.$prms_rmrks);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$dlv_inst_no, DtlR.$dlv_inst_no);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$dlv_inst_rev, DtlR.$dlv_inst_rev);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$dlv_inst_d_no, DtlR.$dlv_inst_d_no);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$data_make_dt, DtlR.$data_make_dt);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$sub_char1, DtlR.$sub_char1);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$sub_char2, DtlR.$sub_char2);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$sub_char3, DtlR.$sub_char3);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$sub_char4, DtlR.$sub_char4);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$sub_char5, DtlR.$sub_char5);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$sub_char6, DtlR.$sub_char6);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$sub_char7, DtlR.$sub_char7);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$sub_char8, DtlR.$sub_char8);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$sub_char9, DtlR.$sub_char9);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$sub_char10, DtlR.$sub_char10);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$sub_char11, DtlR.$sub_char11);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$sub_char12, DtlR.$sub_char12);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$sub_char13, DtlR.$sub_char13);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$sub_char14, DtlR.$sub_char14);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$sub_char15, DtlR.$sub_char15);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$sub_char16, DtlR.$sub_char16);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$sub_char17, DtlR.$sub_char17);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$sub_char18, DtlR.$sub_char18);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$sub_char19, DtlR.$sub_char19);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$sub_char20, DtlR.$sub_char20);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$sub_char21, DtlR.$sub_char21);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$sub_char22, DtlR.$sub_char22);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$sub_char23, DtlR.$sub_char23);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$sub_char24, DtlR.$sub_char24);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$sub_char25, DtlR.$sub_char25);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$sub_char26, DtlR.$sub_char26);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$sub_char27, DtlR.$sub_char27);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$sub_char28, DtlR.$sub_char28);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$sub_char29, DtlR.$sub_char29);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$sub_char30, DtlR.$sub_char30);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$sub_num1, DtlR.$sub_num1);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$sub_num2, DtlR.$sub_num2);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$sub_num3, DtlR.$sub_num3);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$sub_num4, DtlR.$sub_num4);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$sub_num5, DtlR.$sub_num5);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$sub_dt1, DtlR.$sub_dt1);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$sub_dt2, DtlR.$sub_dt2);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$sub_dt3, DtlR.$sub_dt3);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$sub_dt4, DtlR.$sub_dt4);
		addColumnPathMap(MST_PRMS_RECV_IF_R.$sub_dt5, DtlR.$sub_dt5);

	}
	@Override
	protected void valueCopy(D dest, S src) {
		super.valueCopy(dest, src);
		dest.data_lno(getSequence(MSC_NUM_SYS_TYP.POPRMSRECVIF.value()));
		dest.data_no(_ifR.data_no());
		dest.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
		dest.ext_sys_cd(_ifR.ext_sys_cd());
		dest.imp_flg(true);
		dest.recv_dt(getToday());
		dest.if_sppl_cd(src.slo_co_cd());
		dest.if_sppl_nm(src.slo_co_nm());
		dest.if_itm_cd(src.po_co_itm_cd());
		dest.if_itm_sub1(src.po_co_itm_sub1());
		dest.if_itm_sub2(src.po_co_itm_sub2());
		dest.if_itm_sub3(src.po_co_itm_sub3());
		dest.if_itm_nm(src.po_co_itm_nm());
		dest.sppl_itm_cd(src.slo_co_itm_cd());
		dest.sppl_itm_sub1(src.slo_co_itm_sub1());
		dest.sppl_itm_sub2(src.slo_co_itm_sub2());
		dest.sppl_itm_sub3(src.slo_co_itm_sub3());
		dest.sppl_itm_nm(src.slo_co_itm_nm());
		dest.if_trd_unit_cd(src.trd_unit_cd());
		dest.if_trd_unit_nm(src.trd_unit_nm());
		dest.if_co_cd(src.po_co_cd());
		dest.if_co_nm(src.po_co_nm());
		dest.ext_data_no(src.data_no());
		dest.ext_data_lno(src.data_lno());
		dest.prms_dlv_tm(getYmdHm(src.prms_dlv_dt(), src.prms_dlv_hm()));
		dest.imp_flg(true);
		dest.recv_dt(getToday());
	}
}

	//FMCB CUSTOM END
}