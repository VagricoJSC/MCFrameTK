package mcframe.serverMSLA.MSLAL7140;

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
import mcframe.commonMSLA.MSLAR0040.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverPFBZ.PFBZL9010.PFBZL_CodeConvert;
import mcframe.serverPFBZ.PFBZL9030.PFBZL_FileInput;
import mcframe.serverPF.dbc.PFT_SDRV_IF_R;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
import mcframe.serverFXUC.FXUCL0030.*;
import java.util.*;
import java.util.Map.Entry;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverCore.resource.MCConst;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_DlvInstRecvConvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_DlvInstRecvConvService_MC extends MSLAL_DlvInstRecvConvService_MC_A{
	//FMCB CUSTOM START

	/**
	 * DlvInstRecvConv_Conv01オペレーション.<p>
	 *
	 */
	public class DlvInstRecvConv_Conv01 extends MSLAL_DlvInstRecvConvService_MC_A.DlvInstRecvConv_Conv01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		@SuppressWarnings("unchecked")
		protected void crtIfDBC() {
			_ifDBC = PFBZL_CodeConvert.crtRecvIfDBContainer(MST_DLV_INST_RECV_IF_R.class);
		}
		@Override
		protected void setCnvBpCol() {
			_cnvBpCol = "if_cst_cd";
		}
		@Override
		protected void setCnvIfCols() {
			_ifDBC.addCnvCol("if_cst_cd", "cst_cd", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("if_dlv_cd", "dlv_cd", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("if_dlv_cntry_cd", "dlv_cntry_cd", MAC_IF_COL_TYP.CNTRY);
			_ifDBC.addCnvCol("if_tdlv_cd", "tdlv_cd", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("if_tdlv_cntry_cd", "tdlv_cntry_cd", MAC_IF_COL_TYP.CNTRY);
			_ifDBC.addCnvItmCol("if_itm_cd", "if_itm_sub1", "if_itm_sub2", "if_itm_sub3", "itm_cd", "itm_sub1", "itm_sub2", "itm_sub3");
			_ifDBC.addCnvCol("if_trd_unit_cd", "trd_unit_cd", MAC_IF_COL_TYP.UNIT);
		}
		
		@Override
		protected void pushAlertMsg() {
			Map<List<String>, MCMessageList> map = new HashMap<List<String>, MCMessageList>();
			
			MCMessageList msgList = MCMessagePool.getMessageList();
			MCList<MST_DLV_INST_RECV_IF_R> ifL = MCList.create(MST_DLV_INST_RECV_IF_R.class);

			for (MCContainer row : _ifDBC.getExIfL()) {
				MST_DLV_INST_RECV_IF_R ifR = (MST_DLV_INST_RECV_IF_R)row;
				if (!isNull(ifR.cst_cd())) {
					ifL.add(ifR);
				}
			}
			if (ifL.isEmpty()) {
				return;
			}
			
			for (MST_DLV_INST_RECV_IF_R ifR : ifL) {
				for (MCMessage msg : msgList) {
					if (msg.getCauseRow() == ifR) {
						List<String> keyList = new ArrayList<String>();
						keyList.add(ifR.cst_cd());
						
						MST_SLO_R sloR = getSloR(ifR);
						keyList.add(sloR.wg_cd());
						keyList.add(sloR.sls_usr_cd());
						
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
				String cstCd = entry.getKey().get(0);
				String wgCd = entry.getKey().get(1);
				String usrCd = entry.getKey().get(2);
				
				pushAlert(null, wgCd, cstCd, usrCd,
						MODULE_ID, LOGIC_ID, OPERATION_ID,
						entry.getValue(), FXBAL_BatchLogManager.getLogger(),
						MSLAL0205,
						MCConst.lgclbl.getLabel(MODULE_ID, LOGIC_ID, null),
						MCDate.sysnow().toString("yyyy/MM/dd HH:mm:ss"),
						getCo().co_cd(), wgCd, cstCd);
			}
		}
		
		protected MST_SLO_R getSloR(MST_DLV_INST_RECV_IF_R ifR) {
			MCList<MST_SLO_R> sloL = MCList.create(MST_SLO_R.class);
			MST_SLO_R t = MST_SLO_R.create("T");
			MCQueryApiBuilder sloL_bldr = MCQueryApiBuilder.create(t);
			MST_SLO_R sloR = MST_SLO_R.create();
			MST_SLO_D_R t2 = MST_SLO_D_R.create("T2");
			
			sloL_bldr.addInnerJoin(t2, bracket(t.slo_no.eq(t2.slo_no)));
			sloL_bldr.addWhereWithAnd(t.cst_cd.eq(bind("1")), ifR.cst_cd());
			sloL_bldr.addWhereWithAnd(t.cst_po_no.eq(bind("1")), ifR.cst_po_no());
			sloL_bldr.addWhereWithAnd(
					bracket(t2.cst_po_d_no.isNull().or(t2.cst_po_d_no.eq(bind("1")))),
					ifR.cst_po_d_no());
			sloL_bldr.addWhereWithAnd(t2.can_flg.eq(value(false)));
			
			dbSelect("MSLAL7140_MST_SLO_S01", sloL, sloL_bldr);
			
			if (!sloL.isEmpty()) {
				sloR = sloL.get(0);
			}
			return sloR;
		}
	}
	/**
	 * DlvInstRecvConv_Conv02オペレーション.<p>
	 *
	 */
	public class DlvInstRecvConv_Conv02 extends MSLAL_DlvInstRecvConvService_MC_A.DlvInstRecvConv_Conv02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		@SuppressWarnings({
			"unchecked", "rawtypes"
		})
		protected void crtRptSet() {
			_IfRptSet = PFBZL_FileInput.createIfRecvReportSet(DtlR.class, MST_DLV_INST_RECV_IF_R.class);
			_IfRptSet.setReportSet(MSLAR_DlvInstPrnt.create());
			_IfRptSet.setRowMapper(new Map_MST_DLV_INST_RECV_IF_R_DtlR());
		}
	}
	/**
	 * DlvInstRecvConv_Conv03オペレーション.<p>
	 *
	 */
	public class DlvInstRecvConv_Conv03 extends MSLAL_DlvInstRecvConvService_MC_A.DlvInstRecvConv_Conv03 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		@SuppressWarnings({
			"unchecked", "rawtypes"
		})
		protected void crtRptSet() {
			_IfRptSet = PFBZL_FileInput.createIfRecvReportSet(DtlR.class, MST_DLV_INST_RECV_IF_R.class);
			_IfRptSet.setReportSet(MSLAR_DlvInstPrnt.create());
			_IfRptSet.setRowMapper(new Map_MST_DLV_INST_RECV_IF_R_DtlR());
		}
		@Override
		protected void setRptSetData() {
			_IfRptSet.getReportSet().addAll(up1());
		}
	}

	public class Map_MST_DLV_INST_RECV_IF_R_DtlR<D extends MST_DLV_INST_RECV_IF_R, S extends DtlR, W extends PFT_SDRV_IF_R>
			extends MAUCC_RowMapperWith<D, S, W> {

		protected W _ifR;

		@Override
		public void setWith(W ifR) {
			this._ifR = ifR;
		}

		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$data_crud_typ, DtlR.$data_crud_typ);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$data_make_dt, DtlR.$data_make_dt);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$dlv_inst_dt, DtlR.$dlv_inst_dt);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$dlv_day_week_typ, DtlR.$dlv_day_week_typ);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$pri_prnt_typ, DtlR.$pri_prnt_typ);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$trd_unit_qty, DtlR.$trd_unit_qty);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$sub_char1, DtlR.$sub_char1);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$sub_char2, DtlR.$sub_char2);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$sub_char3, DtlR.$sub_char3);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$sub_char4, DtlR.$sub_char4);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$sub_char5, DtlR.$sub_char5);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$sub_char6, DtlR.$sub_char6);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$sub_char7, DtlR.$sub_char7);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$sub_char8, DtlR.$sub_char8);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$sub_char9, DtlR.$sub_char9);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$sub_char10, DtlR.$sub_char10);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$sub_char11, DtlR.$sub_char11);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$sub_char12, DtlR.$sub_char12);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$sub_char13, DtlR.$sub_char13);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$sub_char14, DtlR.$sub_char14);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$sub_char15, DtlR.$sub_char15);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$sub_char16, DtlR.$sub_char16);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$sub_char17, DtlR.$sub_char17);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$sub_char18, DtlR.$sub_char18);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$sub_char19, DtlR.$sub_char19);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$sub_char20, DtlR.$sub_char20);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$sub_char21, DtlR.$sub_char21);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$sub_char22, DtlR.$sub_char22);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$sub_char23, DtlR.$sub_char23);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$sub_char24, DtlR.$sub_char24);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$sub_char25, DtlR.$sub_char25);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$sub_char26, DtlR.$sub_char26);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$sub_char27, DtlR.$sub_char27);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$sub_char28, DtlR.$sub_char28);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$sub_char29, DtlR.$sub_char29);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$sub_char30, DtlR.$sub_char30);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$sub_num1, DtlR.$sub_num1);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$sub_num2, DtlR.$sub_num2);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$sub_num3, DtlR.$sub_num3);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$sub_num4, DtlR.$sub_num4);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$sub_num5, DtlR.$sub_num5);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$sub_dt1, DtlR.$sub_dt1);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$sub_dt2, DtlR.$sub_dt2);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$sub_dt3, DtlR.$sub_dt3);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$sub_dt4, DtlR.$sub_dt4);
			addColumnPathMap(MST_DLV_INST_RECV_IF_R.$sub_dt5, DtlR.$sub_dt5);

		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_lno(getSequence(MSC_NUM_SYS_TYP.DLVINSTRECVIF.value()));
			dest.data_no(_ifR.data_no());
			dest.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
			dest.ext_sys_cd(_ifR.ext_sys_cd());
			dest.ext_data_lno(src.data_lno());
			dest.ext_data_no(src.data_no());
			dest.imp_flg(true);
			dest.recv_dt(getToday());
			dest.cst_dlv_inst_no(src.dlv_inst_no());
			dest.cst_dlv_inst_rev(src.dlv_inst_rev());
			dest.cst_dlv_inst_d_no(src.dlv_inst_d_no());
			dest.cst_po_no(src.po_no());
			dest.cst_po_rev(src.po_rev());
			dest.cst_po_d_no(src.po_d_no());
			dest.if_cst_cd(src.po_co_cd());
			dest.if_cst_nm(src.po_co_nm());
			dest.if_dlv_cd(src.in_to_id_cd());
			dest.dlv_nm(src.in_to_nm());
			dest.dlv_cntct_dpt(src.in_to_cntct_dpt());
			dest.dlv_cntct_psn(src.in_to_cntct_psn());
			dest.dlv_zip_cd(src.in_to_zip_cd());
			dest.dlv_addr1(src.in_to_addr1());
			dest.dlv_addr2(src.in_to_addr2());
			dest.dlv_addr3(src.in_to_addr3());
			dest.dlv_addr4(src.in_to_addr4());
			dest.dlv_tel(src.in_to_tel());
			dest.dlv_fax(src.in_to_fax());
			dest.if_dlv_cntry_cd(src.in_to_cntry_cd());
			dest.if_tdlv_cd(src.tdlv_cd());
			dest.tdlv_nm(src.tdlv_nm());
			dest.tdlv_cntct_dpt(src.tdlv_cntct_dpt());
			dest.tdlv_cntct_psn(src.tdlv_cntct_psn());
			dest.tdlv_zip_cd(src.tdlv_zip_cd());
			dest.tdlv_addr1(src.tdlv_addr1());
			dest.tdlv_addr2(src.tdlv_addr2());
			dest.tdlv_addr3(src.tdlv_addr3());
			dest.tdlv_addr4(src.tdlv_addr4());
			dest.tdlv_tel(src.tdlv_tel());
			dest.tdlv_fax(src.tdlv_fax());
			dest.if_tdlv_cntry_cd(src.tdlv_cntry_cd());
			dest.cst_itm_cd(src.po_co_itm_cd());
			dest.cst_itm_nm(src.po_co_itm_nm());
			dest.itm_nm(nvl(src.slo_co_itm_nm(), src.po_co_itm_nm()));
			dest.if_itm_cd(nvl(src.slo_co_itm_cd(), src.po_co_itm_cd()));
			dest.if_itm_sub1(nvl(src.slo_co_itm_sub1(), src.po_co_itm_sub1()));
			dest.if_itm_sub2(nvl(src.slo_co_itm_sub2(), src.po_co_itm_sub2()));
			dest.if_itm_sub3(nvl(src.slo_co_itm_sub3(), src.po_co_itm_sub3()));
			dest.if_itm_nm(src.po_co_itm_nm());
			dest.if_trd_unit_cd(src.trd_unit_cd());
			dest.if_trd_unit_nm(src.trd_unit_nm());
			dest.dlv_rqst_tm(getYmdHm(src.dlv_rqst_dt(), src.dlv_rqst_hm()));
			dest.cst_dlv_inst_rmrks(src.dlv_inst_print_rmrks());
			dest.cst_dlv_inst_d_rmrks(src.dlv_inst_print_d_rmrks());
			dest.if_co_cd(src.slo_co_cd());
			dest.if_co_nm(src.slo_co_nm());
		}
	}

	//FMCB CUSTOM END
}