package mcframe.serverMSLA.MSLAL7040;

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
import mcframe.commonMSLA.MSLAR0040.*;
import java.util.*;
import java.util.Map.Entry;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverCore.resource.MCConst;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_DlvInstSendConvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_DlvInstSendConvService_MC extends MSLAL_DlvInstSendConvService_MC_A{
	//FMCB CUSTOM START

	/**
	 * DlvInstSendConv_Conv01オペレーション.<p>
	 *
	 */
	public class DlvInstSendConv_Conv01 extends MSLAL_DlvInstSendConvService_MC_A.DlvInstSendConv_Conv01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		@SuppressWarnings("unchecked")
		protected void crtIfDBC() {
			_ifDBC = PFBZL_CodeConvert.crtSendIfDBContainer(MST_DLV_INST_SEND_IF_R.class);
		}
		
		@Override
		protected void setCnvBpCol() {
			_cnvBpCol = "sppl_cd";
		}
		
		@Override
		protected void setCnvIfCols() {
			_ifDBC.addCnvCol("cntry_cd", MAC_IF_COL_TYP.CNTRY);
			_ifDBC.addCnvCol("sppl_cd", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("sppl_cntry_cd", MAC_IF_COL_TYP.CNTRY);
			_ifDBC.addCnvCol("in_to_id_cd", MAC_IF_COL_TYP.SHIP_TO_ID);
			_ifDBC.addCnvCol("in_to_cntry_cd", MAC_IF_COL_TYP.CNTRY);
			_ifDBC.addCnvCol("tdlv_cd", MAC_IF_COL_TYP.BP);
			_ifDBC.addCnvCol("tdlv_cntry_cd", MAC_IF_COL_TYP.CNTRY);
			_ifDBC.addCnvItmCol("itm_cd", "itm_sub1", "itm_sub2", "itm_sub3");
			_ifDBC.addCnvCol("trd_unit_cd", MAC_IF_COL_TYP.UNIT);
			_ifDBC.addCnvCol("co_cd", MAC_IF_COL_TYP.CO);
		}
		
		@Override
		protected void pushAlertMsg() {
			
			Map<List<String>, MCMessageList> map = new HashMap<List<String>, MCMessageList>();
			
			MCMessageList msgList = MCMessagePool.getMessageList();
			MCList<MST_DLV_INST_SEND_IF_R> ifL = MCList.create(MST_DLV_INST_SEND_IF_R.class);

			for (MCDBContainer row : _ifDBC.getExIfL()) {
				MST_DLV_INST_SEND_IF_R ifR = (MST_DLV_INST_SEND_IF_R)row;
				if (!isNull(ifR.sppl_cd())) {
					ifL.add(ifR);
				}
			}
			if (ifL.isEmpty()) {
				return;
			}
			
			for (MST_DLV_INST_SEND_IF_R ifR : ifL) {
				for (MCMessage msg : msgList) {
					if (msg.getCauseRow() == ifR) {
						MST_PO_R poR = getPoR(ifR);
						
						List<String> keyList = new ArrayList<String>();
						keyList.add(ifR.sppl_cd());
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
		
		/**
		 * 発注情報取得
		 */
		protected MST_PO_R getPoR(MST_DLV_INST_SEND_IF_R ifR) {
			MCList<MST_PO_R> poL = MCList.create(MST_PO_R.class);
			MST_PO_R t = MST_PO_R.create("T");
			MCQueryApiBuilder po_bldr = MCQueryApiBuilder.create(t);
			MST_PO_R poR = MST_PO_R.create();
			
			po_bldr.addWhereWithAnd(t.po_no.eq(bind("1")), ifR.po_no());
			po_bldr.addWhereWithAnd(t.po_rev.eq(bind("1")), ifR.po_rev());
			
			dbSelect("MST_PO_S01", poL, po_bldr);
			if (!poL.isEmpty()) {
				poR = poL.get(0);
			}
			return poR;
		}
	}
	/**
	 * DlvInstSendConv_Conv02オペレーション.<p>
	 *
	 */
	public class DlvInstSendConv_Conv02 extends MSLAL_DlvInstSendConvService_MC_A.DlvInstSendConv_Conv02 {
		@Override
		protected void call() {
			super.call();
		}
		@SuppressWarnings({
			"unchecked", "rawtypes"
		})
		@Override
		protected void crtRptSet() {
			_IfRptSet = PFBZL_FileOutput.createIfSendReportSet(DtlR.class, MST_DLV_INST_SEND_IF_R.class);
			_IfRptSet.setReportSet(MSLAR_DlvInstPrnt.create());
			_IfRptSet.setRowMapper(new Map_DtlR_MST_DLV_INST_SEND_IF_R());
		}
		public class Map_DtlR_MST_DLV_INST_SEND_IF_R<D extends DtlR, S extends MST_DLV_INST_SEND_IF_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(DtlR.$data_lno, MST_DLV_INST_SEND_IF_R.$data_lno);
				addColumnPathMap(DtlR.$data_no, MST_DLV_INST_SEND_IF_R.$data_no);
				addColumnPathMap(DtlR.$data_crud_typ, MST_DLV_INST_SEND_IF_R.$data_crud_typ);
				addColumnPathMap(DtlR.$dlv_inst_no, MST_DLV_INST_SEND_IF_R.$dlv_inst_no);
				addColumnPathMap(DtlR.$dlv_inst_rev, MST_DLV_INST_SEND_IF_R.$dlv_inst_rev);
				addColumnPathMap(DtlR.$dlv_inst_d_no, MST_DLV_INST_SEND_IF_R.$dlv_inst_d_no);
				addColumnPathMap(DtlR.$dlv_inst_grp_no, MST_DLV_INST_SEND_IF_R.$dlv_inst_grp_no);
				addColumnPathMap(DtlR.$po_no, MST_DLV_INST_SEND_IF_R.$po_no);
				addColumnPathMap(DtlR.$po_rev, MST_DLV_INST_SEND_IF_R.$po_rev);
				addColumnPathMap(DtlR.$po_d_no, MST_DLV_INST_SEND_IF_R.$po_d_no);
				addColumnPathMap(DtlR.$dlv_inst_dt, MST_DLV_INST_SEND_IF_R.$dlv_inst_dt);
				addColumnPathMap(DtlR.$dlv_inst_print_rmrks, MST_DLV_INST_SEND_IF_R.$dlv_inst_print_rmrks);
				addColumnPathMap(DtlR.$dlv_inst_print_d_rmrks, MST_DLV_INST_SEND_IF_R.$dlv_inst_print_d_rmrks);
				addColumnPathMap(DtlR.$in_to_id_typ, MST_DLV_INST_SEND_IF_R.$in_to_id_typ);
				addColumnPathMap(DtlR.$in_to_nm, MST_DLV_INST_SEND_IF_R.$in_to_nm);
				addColumnPathMap(DtlR.$in_to_zip_cd, MST_DLV_INST_SEND_IF_R.$in_to_zip_cd);
				addColumnPathMap(DtlR.$in_to_addr1, MST_DLV_INST_SEND_IF_R.$in_to_addr1);
				addColumnPathMap(DtlR.$in_to_addr2, MST_DLV_INST_SEND_IF_R.$in_to_addr2);
				addColumnPathMap(DtlR.$in_to_addr3, MST_DLV_INST_SEND_IF_R.$in_to_addr3);
				addColumnPathMap(DtlR.$in_to_addr4, MST_DLV_INST_SEND_IF_R.$in_to_addr4);
				addColumnPathMap(DtlR.$in_to_cntct_dpt, MST_DLV_INST_SEND_IF_R.$in_to_cntct_dpt);
				addColumnPathMap(DtlR.$in_to_cntct_psn, MST_DLV_INST_SEND_IF_R.$in_to_cntct_psn);
				addColumnPathMap(DtlR.$in_to_tel, MST_DLV_INST_SEND_IF_R.$in_to_tel);
				addColumnPathMap(DtlR.$in_to_fax, MST_DLV_INST_SEND_IF_R.$in_to_fax);
				addColumnPathMap(DtlR.$in_to_sundry_flg, MST_DLV_INST_SEND_IF_R.$in_to_sundry_flg);
				addColumnPathMap(DtlR.$in_to_cntry_cd, MST_DLV_INST_SEND_IF_R.$in_to_cntry_cd);
				addColumnPathMap(DtlR.$tdlv_nm, MST_DLV_INST_SEND_IF_R.$tdlv_nm);
				addColumnPathMap(DtlR.$tdlv_zip_cd, MST_DLV_INST_SEND_IF_R.$tdlv_zip_cd);
				addColumnPathMap(DtlR.$tdlv_addr1, MST_DLV_INST_SEND_IF_R.$tdlv_addr1);
				addColumnPathMap(DtlR.$tdlv_addr2, MST_DLV_INST_SEND_IF_R.$tdlv_addr2);
				addColumnPathMap(DtlR.$tdlv_addr3, MST_DLV_INST_SEND_IF_R.$tdlv_addr3);
				addColumnPathMap(DtlR.$tdlv_addr4, MST_DLV_INST_SEND_IF_R.$tdlv_addr4);
				addColumnPathMap(DtlR.$tdlv_cntct_dpt, MST_DLV_INST_SEND_IF_R.$tdlv_cntct_dpt);
				addColumnPathMap(DtlR.$tdlv_cntct_psn, MST_DLV_INST_SEND_IF_R.$tdlv_cntct_psn);
				addColumnPathMap(DtlR.$tdlv_tel, MST_DLV_INST_SEND_IF_R.$tdlv_tel);
				addColumnPathMap(DtlR.$tdlv_fax, MST_DLV_INST_SEND_IF_R.$tdlv_fax);
				addColumnPathMap(DtlR.$tdlv_sundry_flg, MST_DLV_INST_SEND_IF_R.$tdlv_sundry_flg);
				addColumnPathMap(DtlR.$trd_unit_nm, MST_DLV_INST_SEND_IF_R.$trd_unit_nm);
				addColumnPathMap(DtlR.$trd_unit_qty, MST_DLV_INST_SEND_IF_R.$trd_unit_qty);
				addColumnPathMap(DtlR.$sub_char1, MST_DLV_INST_SEND_IF_R.$sub_char1);
				addColumnPathMap(DtlR.$sub_char2, MST_DLV_INST_SEND_IF_R.$sub_char2);
				addColumnPathMap(DtlR.$sub_char3, MST_DLV_INST_SEND_IF_R.$sub_char3);
				addColumnPathMap(DtlR.$sub_char4, MST_DLV_INST_SEND_IF_R.$sub_char4);
				addColumnPathMap(DtlR.$sub_char5, MST_DLV_INST_SEND_IF_R.$sub_char5);
				addColumnPathMap(DtlR.$sub_char6, MST_DLV_INST_SEND_IF_R.$sub_char6);
				addColumnPathMap(DtlR.$sub_char7, MST_DLV_INST_SEND_IF_R.$sub_char7);
				addColumnPathMap(DtlR.$sub_char8, MST_DLV_INST_SEND_IF_R.$sub_char8);
				addColumnPathMap(DtlR.$sub_char9, MST_DLV_INST_SEND_IF_R.$sub_char9);
				addColumnPathMap(DtlR.$sub_char10, MST_DLV_INST_SEND_IF_R.$sub_char10);
				addColumnPathMap(DtlR.$sub_char11, MST_DLV_INST_SEND_IF_R.$sub_char11);
				addColumnPathMap(DtlR.$sub_char12, MST_DLV_INST_SEND_IF_R.$sub_char12);
				addColumnPathMap(DtlR.$sub_char13, MST_DLV_INST_SEND_IF_R.$sub_char13);
				addColumnPathMap(DtlR.$sub_char14, MST_DLV_INST_SEND_IF_R.$sub_char14);
				addColumnPathMap(DtlR.$sub_char15, MST_DLV_INST_SEND_IF_R.$sub_char15);
				addColumnPathMap(DtlR.$sub_char16, MST_DLV_INST_SEND_IF_R.$sub_char16);
				addColumnPathMap(DtlR.$sub_char17, MST_DLV_INST_SEND_IF_R.$sub_char17);
				addColumnPathMap(DtlR.$sub_char18, MST_DLV_INST_SEND_IF_R.$sub_char18);
				addColumnPathMap(DtlR.$sub_char19, MST_DLV_INST_SEND_IF_R.$sub_char19);
				addColumnPathMap(DtlR.$sub_char20, MST_DLV_INST_SEND_IF_R.$sub_char20);
				addColumnPathMap(DtlR.$sub_char21, MST_DLV_INST_SEND_IF_R.$sub_char21);
				addColumnPathMap(DtlR.$sub_char22, MST_DLV_INST_SEND_IF_R.$sub_char22);
				addColumnPathMap(DtlR.$sub_char23, MST_DLV_INST_SEND_IF_R.$sub_char23);
				addColumnPathMap(DtlR.$sub_char24, MST_DLV_INST_SEND_IF_R.$sub_char24);
				addColumnPathMap(DtlR.$sub_char25, MST_DLV_INST_SEND_IF_R.$sub_char25);
				addColumnPathMap(DtlR.$sub_char26, MST_DLV_INST_SEND_IF_R.$sub_char26);
				addColumnPathMap(DtlR.$sub_char27, MST_DLV_INST_SEND_IF_R.$sub_char27);
				addColumnPathMap(DtlR.$sub_char28, MST_DLV_INST_SEND_IF_R.$sub_char28);
				addColumnPathMap(DtlR.$sub_char29, MST_DLV_INST_SEND_IF_R.$sub_char29);
				addColumnPathMap(DtlR.$sub_char30, MST_DLV_INST_SEND_IF_R.$sub_char30);
				addColumnPathMap(DtlR.$sub_num1, MST_DLV_INST_SEND_IF_R.$sub_num1);
				addColumnPathMap(DtlR.$sub_num2, MST_DLV_INST_SEND_IF_R.$sub_num2);
				addColumnPathMap(DtlR.$sub_num3, MST_DLV_INST_SEND_IF_R.$sub_num3);
				addColumnPathMap(DtlR.$sub_num4, MST_DLV_INST_SEND_IF_R.$sub_num4);
				addColumnPathMap(DtlR.$sub_num5, MST_DLV_INST_SEND_IF_R.$sub_num5);
				addColumnPathMap(DtlR.$sub_dt1, MST_DLV_INST_SEND_IF_R.$sub_dt1);
				addColumnPathMap(DtlR.$sub_dt2, MST_DLV_INST_SEND_IF_R.$sub_dt2);
				addColumnPathMap(DtlR.$sub_dt3, MST_DLV_INST_SEND_IF_R.$sub_dt3);
				addColumnPathMap(DtlR.$sub_dt4, MST_DLV_INST_SEND_IF_R.$sub_dt4);
				addColumnPathMap(DtlR.$sub_dt5, MST_DLV_INST_SEND_IF_R.$sub_dt5);

			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.trd_typ_cd(MAC_IF_TRD_TYP_CD.DLV_INST.value());
				dest.data_make_dt(src.ins_ts().toMCDate());
				dest.po_co_cd(src.if_co_cd());
				dest.po_co_nm(src.co_nm());
				dest.po_co_cntry_cd(src.if_cntry_cd());
				dest.slo_co_cd(src.if_sppl_cd());
				dest.slo_co_nm(src.sppl_nm());
				dest.slo_co_cntry_cd(src.if_sppl_cntry_cd());
				dest.in_to_id_cd(src.if_in_to_id_cd());
				dest.in_to_cntry_cd(src.if_in_to_cntry_cd());
				dest.tdlv_cd(src.if_tdlv_cd());
				dest.tdlv_cntry_cd(src.if_tdlv_cntry_cd());
				dest.pri_prnt_typ(MCBooleanUtil.booleanToDBString(src.pri_print_flg()));
				dest.po_co_itm_cd(src.itm_cd());
				dest.po_co_itm_sub1(src.itm_sub1());
				dest.po_co_itm_sub2(src.itm_sub2());
				dest.po_co_itm_sub3(src.itm_sub3());
				dest.po_co_sundry_itm_flg(src.sundry_itm_flg());
				dest.po_co_itm_nm(src.itm_nm());
				dest.po_co_iv_itm_nm(src.iv_itm_nm());
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
				dest.trd_unit_cd(src.if_trd_unit_cd());
				dest.dlv_rqst_dt(getDt(src.dlv_rqst_tm()));
				dest.dlv_rqst_hm(getHm(src.dlv_rqst_tm()));
			}
		}
	}

	//FMCB CUSTOM END
}