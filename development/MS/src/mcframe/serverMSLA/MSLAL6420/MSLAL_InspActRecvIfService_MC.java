package mcframe.serverMSLA.MSLAL6420;

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
import mcframe.serverMSLA.MSLAL6420.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMBBE.MBBEL5010.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverPFUD.PFUDL0040.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMS.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.commonCore.container.MCRow.Status;
import mcframe.serverCore.requester.MCServerThreadManager;
import mcframe.serverCore.mcjdbc.MCSavepoint;
import mcframe.serverCore.resource.MCConst;
import mcframe.serverMSBF.MSBFL5010.InspSchd_Srch01_CndR;
import mcframe.serverMSBF.MSBFL5010.MSBFL_InspSchdService;
import mcframe.serverMSBF.MSBFL5070.MSBFL_InspActRcptIFService;
import mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_HdrR;
import mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_DtlR;
import mcframe.serverMSBF.MSBFL5070.InspActIF_Upd01_SmplR;
import mcframe.serverMSBF.MSBFL5070.InspActIF_Upd02_DtlR;
import mcframe.serverMSBF.MSBFL5070.InspActIF_Upd02_HdrR;
import mcframe.serverMSBF.MSBFL5070.InspActIF_Del01_CndR;
import mcframe.serverMSUC.MSUCL0090.*;
import mcframe.serverPF.dbc.*;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogger;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil;

import static mcframe.serverMSLA.MSLAL6420.Query.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import static mcframe.serverCore.requester.MCRequestObject.*;

import java.util.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_InspActRecvIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_InspActRecvIfService_MC extends MSLAL_InspActRecvIfService_MC_A{
	//FMCB CUSTOM START
	
	/**
	 * InspActRecvIf_Chk01オペレーション.<p>
	 *
	 * 検査実績受信ＩＦ取込を行う前のチェック処理<br>
	 */
	public class InspActRecvIf_Chk01 extends MSLAL_InspActRecvIfService_MC_A.InspActRecvIf_Chk01 {
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			
			// 外部検査実績明細ＮＯ・外部検査抜取実績ＮＯと、外部検査実績ＮＯに不整合がある場合を考慮し、外部検査実績ＮＯをキーとする通常のキャッシュは利用しない
			MCList<MST_INSP_ACT_D_R> inspActDL = fetchInspActDtlByExtDtlNo(up0());
			MCList<MST_INSP_SMPL_ACT_R> inspSmplL = fetchInspSmplActByExtSmplNo(up0());
			
			msgL.addAll(chkImportSpec(up0(), inspActDL, inspSmplL));
			msgL.addAll(chkIfKey(up0(), inspActDL, inspSmplL));
			msgL.addAll(chkInspSchdExists(up0()));
			
			MCList<InspActRecvIf_Chk01_DtlR> notErrL = getChkList(up0());
			if (notErrL.isEmpty()) {
				return msgL;
			}
			
			clearUnnecessaryColumns(up0());
			
			compl(up0());
		
			return msgL;
		}
		
		protected MCList<MST_INSP_ACT_D_R> fetchInspActDtlByExtDtlNo(MCList<InspActRecvIf_Chk01_DtlR> inspActRecvIfL) {
			MCList<MST_INSP_ACT_D_R> inspActDtlL = MCList.create(MST_INSP_ACT_D_R.class);
			MST_INSP_ACT_R inspAct = MST_INSP_ACT_R.create("INSPACT");
			MST_INSP_ACT_D_R inspActDtl = MST_INSP_ACT_D_R.create("INSPACTD");
			MCQueryApiBuilder inspActDtlL_bldr = MCQueryApiBuilder.create(inspActDtl);
			
			inspActDtlL_bldr.setSelect(inspActDtl.ext_insp_act_d_no);
			inspActDtlL_bldr.addSelect(inspAct.insp_no);
			inspActDtlL_bldr.setWhere(inspActDtl.ext_insp_act_d_no.eq(bind("ext_insp_act_d_no")));
			inspActDtlL_bldr.addWhereWithAnd(inspActDtl.ext_sys_cd.eq(bind("ext_sys_cd")));
			inspActDtlL_bldr.addInnerJoin(inspAct, inspActDtl.insp_act_no.eq(inspAct.insp_act_no));
			
			dbSelect("MSLAL6420_MST_INSP_ACT_D_S03", inspActDtlL, inspActDtlL_bldr, inspActRecvIfL);
			return inspActDtlL;
		}
		
		protected MCList<MST_INSP_SMPL_ACT_R> fetchInspSmplActByExtSmplNo(MCList<InspActRecvIf_Chk01_DtlR> inspActRecvIfL) {
			MCList<MST_INSP_SMPL_ACT_R> inspSmplActL = MCList.create(MST_INSP_SMPL_ACT_R.class);
			MST_INSP_ACT_R inspAct = MST_INSP_ACT_R.create("INSPACT");
			MST_INSP_SMPL_ACT_R inspSmplAct = MST_INSP_SMPL_ACT_R.create("INSPSMPLACT");
			MCQueryApiBuilder inspSmplActL_bldr = MCQueryApiBuilder.create(inspSmplAct);
			inspSmplActL.addStringColumn("insp_no");
			
			inspSmplActL_bldr.setSelect(inspSmplAct.ext_insp_smpl_act_no);
			inspSmplActL_bldr.addSelect(inspAct.insp_no);
			inspSmplActL_bldr.setWhere(inspSmplAct.ext_insp_smpl_act_no.eq(bind("ext_insp_smpl_act_no")));
			inspSmplActL_bldr.addWhereWithAnd(inspSmplAct.ext_sys_cd.eq(bind("ext_sys_cd")));
			inspSmplActL_bldr.addInnerJoin(inspAct, inspSmplAct.insp_act_no.eq(inspAct.insp_act_no));

			dbSelect("MSLAL6420_MST_INSP_SMPL_ACT_S02", inspSmplActL, inspSmplActL_bldr, inspActRecvIfL);
			
			return inspSmplActL;
		}
		
		protected void clearUnnecessaryColumns(MCList<InspActRecvIf_Chk01_DtlR> inspActRecvIfL) {
			for (InspActRecvIf_Chk01_DtlR inspActRecvIfR : inspActRecvIfL) {
				MST_INSP_INST_R inspInstR = getInspInstRCache(inspActRecvIfR.insp_no());
				
				if (MSC_INSP_TYP.isPRCD(inspInstR.insp_typ())) {
					clearDtlColumn(inspActRecvIfR);
				}
				else if (isTtlInsp(inspInstR)) {
					clearSmplColumn(inspActRecvIfR);
				}
				else {
					clearTtlColumn(inspActRecvIfR);
				}
				
				// 上記クリア後に、ヘッダーのキー項目のみとなった場合、再度クリア
				if(isHeaderOnly(inspActRecvIfR)) {
					clearDtlColumn(inspActRecvIfR);
				}
			}
		}

		protected MCMessageList chkImportSpec(MCList<InspActRecvIf_Chk01_DtlR> inspActRecvIfL, MCList<MST_INSP_ACT_D_R> inspActDL, MCList<MST_INSP_SMPL_ACT_R> inspSmplL) {
			MCMessageList msgL = new MCMessageList();
			MCMessageList rowMsgL= new MCMessageList();
			
			MCIndexKey inspActDIdx = inspActDL.createIndex(MST_INSP_ACT_D_R.$ext_insp_act_d_no);
			MCIndexKey inspSmplActIdx = inspSmplL.createIndex(MST_INSP_SMPL_ACT_R.$ext_insp_smpl_act_no);
			
			for (InspActRecvIf_Chk01_DtlR inspActRecvIfR : inspActRecvIfL) {
				boolean isExistInspAct = !isNull(inspActRecvIfR.ext_insp_act_no()) 
				&& !isNull(getInspActRCache(inspActRecvIfR.ext_insp_act_no()));
				boolean isExistInspActD = !isNull(inspActRecvIfR.ext_insp_act_d_no()) 
					&& !isNull(inspActDL.getFirst(inspActDIdx, inspActRecvIfR.ext_insp_act_d_no()));
				boolean isExistInspSmplAct = !isNull(inspActRecvIfR.ext_insp_smpl_act_no()) 
					&& !isNull(inspSmplL.getFirst(inspSmplActIdx, inspActRecvIfR.ext_insp_smpl_act_no()));
				boolean isExtInspActNoOnly = isNull(inspActRecvIfR.ext_insp_act_d_no()) && isNull(inspActRecvIfR.ext_insp_smpl_act_no());
				
				rowMsgL.clear();

				if (MAC_DATA_CRUD_TYP.isCRT(inspActRecvIfR.data_crud_typ()) && inspActRecvIfR.imp_only_judg()) {
					rowMsgL.add(new MCMessage(inspActRecvIfR, null, MSLAL1003, inspActRecvIfR.data_no(), inspActRecvIfR.data_lno(),inspActRecvIfR.insp_no()));
				}
				
				if (MAC_DATA_CRUD_TYP.isCRT(inspActRecvIfR.data_crud_typ()) && (isExistInspActD || isExistInspSmplAct)) {
					rowMsgL.add(new MCMessage(inspActRecvIfR, null, MSLAL1006, inspActRecvIfR.data_no(), inspActRecvIfR.data_lno(),
							inspActRecvIfR.ext_sys_cd(), inspActRecvIfR.ext_insp_act_d_no(), inspActRecvIfR.ext_insp_smpl_act_no()));
				}
				
				if (!isNull(inspActRecvIfR.ext_insp_act_d_no()) && !isNull(inspActRecvIfR.ext_insp_smpl_act_no())) {
					rowMsgL.add(new MCMessage(inspActRecvIfR, null, MSLAL1005, inspActRecvIfR.data_no(), inspActRecvIfR.data_lno(),
							inspActRecvIfR.ext_insp_act_d_no(), inspActRecvIfR.ext_insp_smpl_act_no()));
				}
				
				if (MAC_DATA_CRUD_TYP.isCRT(inspActRecvIfR.data_crud_typ()) && isExistInspAct && isExtInspActNoOnly) {
					rowMsgL.add(new MCMessage(inspActRecvIfR, null, MSLAL1007, inspActRecvIfR.data_no(), inspActRecvIfR.data_lno(),
							inspActRecvIfR.ext_sys_cd(), inspActRecvIfR.ext_insp_act_no(), inspActRecvIfR.ext_insp_act_d_no(), inspActRecvIfR.ext_insp_smpl_act_no()));
				}
				
				if ((MAC_DATA_CRUD_TYP.isUPD(inspActRecvIfR.data_crud_typ()) || MAC_DATA_CRUD_TYP.isDEL(inspActRecvIfR.data_crud_typ()))
						&& !isExistInspAct) {
					rowMsgL.add(new MCMessage(inspActRecvIfR, null, MSLAL1008, inspActRecvIfR.data_no(), inspActRecvIfR.data_lno(),
							inspActRecvIfR.ext_sys_cd(), inspActRecvIfR.ext_insp_act_no()));
				}
				
				if ((MAC_DATA_CRUD_TYP.isUPD(inspActRecvIfR.data_crud_typ()) || MAC_DATA_CRUD_TYP.isDEL(inspActRecvIfR.data_crud_typ()))
						&& !isExistInspActD && isDetailRecord(inspActRecvIfR)) {
					rowMsgL.add(new MCMessage(inspActRecvIfR, null, MSLAL1009, inspActRecvIfR.data_no(), inspActRecvIfR.data_lno(),
							inspActRecvIfR.ext_sys_cd(), inspActRecvIfR.ext_insp_act_d_no()));
				}
				
				if ((MAC_DATA_CRUD_TYP.isUPD(inspActRecvIfR.data_crud_typ()) || MAC_DATA_CRUD_TYP.isDEL(inspActRecvIfR.data_crud_typ()))
						&& !isExistInspSmplAct && isSmplActRecord(inspActRecvIfR)) {
					rowMsgL.add(new MCMessage(inspActRecvIfR, null, MSLAL1010, inspActRecvIfR.data_no(), inspActRecvIfR.data_lno(),
							inspActRecvIfR.ext_sys_cd(), inspActRecvIfR.ext_insp_smpl_act_no()));
				}
				
				if ((MAC_DATA_CRUD_TYP.isUPD(inspActRecvIfR.data_crud_typ()) || MAC_DATA_CRUD_TYP.isDEL(inspActRecvIfR.data_crud_typ()))
						&& !isExtInspActNoOnly
						&& inspActRecvIfR.imp_only_judg()) {
					rowMsgL.add(new MCMessage(inspActRecvIfR, null, MSLAL1004, inspActRecvIfR.data_crud_typ(), inspActRecvIfR.data_no(), inspActRecvIfR.data_lno(),
							inspActRecvIfR.ext_insp_act_no(), inspActRecvIfR.ext_insp_act_d_no(), inspActRecvIfR.ext_insp_smpl_act_no()));
				}
				if (rowMsgL.size() > 0) {
					inspActRecvIfR.err_flg(true);
					msgL.addAll(rowMsgL);
				}
			}
			
			return msgL;
		}

		protected MCMessageList chkIfKey(MCList<InspActRecvIf_Chk01_DtlR> inspActRecvIfL, MCList<MST_INSP_ACT_D_R> inspActDL, MCList<MST_INSP_SMPL_ACT_R> inspSmplL) {
			MCMessageList msgL = new MCMessageList();
			MCMessageList rowMsgL= new MCMessageList();
			
			MCIndexKey inspActDIdx = inspActDL.createIndex(MST_INSP_ACT_D_R.$ext_insp_act_d_no);
			MCIndexKey inspSmplActIdx = inspSmplL.createIndex(MST_INSP_SMPL_ACT_R.$ext_insp_smpl_act_no);
			
			for (InspActRecvIf_Chk01_DtlR inspActRecvIfR : inspActRecvIfL) {
			
				MST_INSP_INST_R inspInstR = !isNull(inspActRecvIfR.insp_no()) 
					? getInspInstRCache(inspActRecvIfR.insp_no()) : null;
				MST_INSP_ACT_R inspActR = !isNull(inspActRecvIfR.ext_insp_act_no()) 
					? getInspActRCache(inspActRecvIfR.ext_insp_act_no()) : null;
				MST_INSP_ACT_D_R inspActDR = !isNull(inspActRecvIfR.ext_insp_act_d_no()) 
					? inspActDL.getFirst(inspActDIdx, inspActRecvIfR.ext_insp_act_d_no()) : null;
				MST_INSP_SMPL_ACT_R inspSmplActR = !isNull(inspActRecvIfR.ext_insp_smpl_act_no()) 
					? inspSmplL.getFirst(inspSmplActIdx, inspActRecvIfR.ext_insp_smpl_act_no()) : null;
				
				rowMsgL.clear();
				
				if ((MAC_INSP_MTD_TYP.isTTL(inspInstR.insp_mtd_typ()) && !isNull(inspActRecvIfR.ext_insp_smpl_act_no()))
						|| (!MAC_INSP_MTD_TYP.isTTL(inspInstR.insp_mtd_typ()) && !isNull(inspActRecvIfR.ext_insp_act_d_no()))) {
					rowMsgL.add(new MCMessage(inspActRecvIfR, null, MSLAL1015, inspActRecvIfR.data_no(), inspActRecvIfR.data_lno(),
							inspActRecvIfR.insp_no(), inspInstR.insp_mtd_typ(), inspActRecvIfR.ext_insp_act_d_no(), inspActRecvIfR.ext_insp_smpl_act_no()));
				}
				
				
				if (!isNull(inspActR) && !isSame(inspActR.getStringNE("insp_no"), inspActRecvIfR.insp_no())) {
					rowMsgL.add(new MCMessage(inspActRecvIfR, null, MSLAL1011, inspActRecvIfR.data_no(), inspActRecvIfR.data_lno(),
							inspActRecvIfR.insp_no(), inspActRecvIfR.ext_insp_act_no(), inspActR.getStringNE("insp_no")));
				}
				
				if (!isNull(inspActDR) && !isSame(inspActDR.getStringNE("insp_no"), inspActRecvIfR.insp_no())) {
					rowMsgL.add(new MCMessage(inspActRecvIfR, null, MSLAL1012, inspActRecvIfR.data_no(), inspActRecvIfR.data_lno(),
							inspActRecvIfR.insp_no(), inspActRecvIfR.ext_insp_act_d_no(), inspActDR.getStringNE("insp_no")));
				}
				
				if (!isNull(inspSmplActR) && !isSame(inspSmplActR.getStringNE("insp_no"), inspActRecvIfR.insp_no())) {
					rowMsgL.add(new MCMessage(inspActRecvIfR, null, MSLAL1013, inspActRecvIfR.data_no(), inspActRecvIfR.data_lno(),
							inspActRecvIfR.insp_no(),inspActRecvIfR.ext_insp_smpl_act_no(), inspSmplActR.getStringNE("insp_no")));
				}
				
				if (MAC_DATA_CRUD_TYP.isCRT(inspActRecvIfR.data_crud_typ()) && (!isNull(inspActR) && !isSameHeaderValue(inspActRecvIfR, inspActR, inspInstR))) {
					rowMsgL.add(new MCMessage(inspActRecvIfR, null, MSLAL1014, inspActRecvIfR.data_no(), inspActRecvIfR.data_lno(),
							inspActRecvIfR.ext_insp_act_no()));
				}
				
				if (rowMsgL.size() > 0) {
					inspActRecvIfR.err_flg(true);
					msgL.addAll(rowMsgL);
				}
			}
			
			return msgL;
		}
		
		protected boolean isNotChkStk(InspActRecvIf_Chk01_DtlR inspActRecvIfR) {
			if (isHeaderOnly(inspActRecvIfR)) {
				return true;
			}
			
			MST_INSP_SCHD_R inspSchdR = getCacheInspSchd(inspActRecvIfR);
			if (inspSchdR.in_prmt_insp_flg()) {
				return true;
			}
			
			// 出来高実績計上前の検査は、在庫が存在しないため、チェックしない
			if (isNull(inspSchdR.src_no4()) && MSC_INSP_TYP.isPRDCT(inspSchdR.insp_typ())) {
				return true;
			}
			
			// 確定ＮＯに紐づく在庫が存在しない場合はチェックしない
			if (isNull(getStkLCache(inspActRecvIfR.insp_schd_no()))) {
				return true;
			}
			
			return false;
		}

		protected MCMessageList chkStkExists(MCList<InspActRecvIf_Chk01_DtlR> inspActRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			
			for (InspActRecvIf_Chk01_DtlR inspActRecvIfR : inspActRecvIfL) {
				if (MAC_DATA_CRUD_TYP.isDEL(inspActRecvIfR.data_crud_typ())) {
					continue;
				}
				
				if (isNotChkStk(inspActRecvIfR)) {
					continue;
				}
				
				MST_STK_R stkR = getStkRFromIfStkInfo(getStkLCache(inspActRecvIfR.insp_schd_no()), inspActRecvIfR);
				MST_INSP_INST_R inspInstR = getInspInstRCache(inspActRecvIfR.insp_no());
				
				if (isNull(stkR)) {
					inspActRecvIfR.err_flg(true);
					msgL.add(new MCMessage(inspActRecvIfR, null, MSLAL1019, 
						inspActRecvIfR.data_no(),
						inspActRecvIfR.data_lno(),
						inspActRecvIfR.insp_schd_no(),
						inspActRecvIfR.stk_loc_cd(),
						inspActRecvIfR.stk_str_ln_cd(),
						getEffectPackUnitCd(inspActRecvIfR),
						inspInstR.base_unit_cd()));
				}
			}
			return msgL;
		}

		protected MCMessageList chkMst(MCList<InspActRecvIf_Chk01_DtlR> inspActRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			for (InspActRecvIf_Chk01_DtlR inspActRecvIfR : inspActRecvIfL) {
				if (MAC_DATA_CRUD_TYP.isDEL(inspActRecvIfR.data_crud_typ())) {
					continue;
				}
				// 検査指図情報を取得
				MST_INSP_INST_R instR = getInspInstRCache(inspActRecvIfR.insp_no());
				if (isNull(instR)) {
					continue;
				}
				if (isDetailRecord(inspActRecvIfR)) {
					msgL.addAll(chkMstDtlTtl(inspActRecvIfR, instR));
				}
				else if (isSmplActRecord(inspActRecvIfR)) {
					msgL.addAll(chkMstSmplAct(inspActRecvIfR, instR));
				}
			}
			return msgL;

		}
		
		protected MCMessageList chkMstDtlTtl(InspActRecvIf_Chk01_DtlR inspActRecvIfR, MST_INSP_INST_R instR) {
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(chkUnitCdExist(inspActRecvIfR, instR, inspActRecvIfR.pack_unit_cd()));
			msgL.addAll(chkUnitCdExist(inspActRecvIfR, instR, inspActRecvIfR.ttl_pack_xfr_pack_unit_cd()));
			return msgL;
		}

		protected MCMessageList chkMstSmplAct(InspActRecvIf_Chk01_DtlR inspActRecvIfR, MST_INSP_INST_R instR) {
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(chkUnitCdExist(inspActRecvIfR, instR, inspActRecvIfR.smpl_pack_xfr_pack_unit_cd()));
			return msgL;
		}

		protected MCMessageList chkUnitCdExist(InspActRecvIf_Chk01_DtlR inspActRecvIfR, MST_INSP_INST_R instR, String unitCd) {
			MCMessageList msgL = new MCMessageList();
			if (isNull(unitCd)) {
				return msgL;
			}
			if (!isExistItmUnitCd(instR.itm_cd(), instR.itm_sub1(), instR.itm_sub2(), instR.itm_sub3(), unitCd)) {
				inspActRecvIfR.err_flg(true);
				msgL.add(new MCMessage(inspActRecvIfR, null, MSLAL0651, inspActRecvIfR.data_no(), inspActRecvIfR.data_lno(),
					toDispItm(instR.itm_cd(), instR.itm_sub1(), instR.itm_sub2(), instR.itm_sub3()),
					unitCd));
			}
			return msgL;
		}
		
		protected boolean isExistItmUnitCd(String itmCd, String itmSub1, String itmSub2, String itmSub3, String unitCd) {
			return !isNull(getItmUnitR(itmCd, itmSub1, itmSub2, itmSub3, unitCd)) && !getItmUnitR(itmCd, itmSub1, itmSub2, itmSub3, unitCd).isEmpty();
		}

		protected void compl(MCList<InspActRecvIf_Chk01_DtlR> inspActRecvIfL) {
			for (InspActRecvIf_Chk01_DtlR inspActRecvIfR : inspActRecvIfL) {
				MST_INSP_INST_R instR = getInspInstRCache(inspActRecvIfR.insp_no());
				if (isNull(instR)) {
					return;
				}
				MST_INSP_SCHD_R schdR = getCacheInspSchd(inspActRecvIfR);	
				if (isNull(schdR)) {
					return;
				}
				if (isHeaderOnly(inspActRecvIfR)) {
					complHdrInfo(inspActRecvIfR, instR);
				}
				else if (isDetailRecord(inspActRecvIfR)) {
					complHdrInfo(inspActRecvIfR, instR);
					complDtlCommonInfo(inspActRecvIfR, schdR);
					complTtlInsp(inspActRecvIfR, schdR);
				}
				else if (isSmplActRecord(inspActRecvIfR)) {
					complHdrInfo(inspActRecvIfR, instR);
					complDtlCommonInfo(inspActRecvIfR, schdR);
					complSmplInsp(inspActRecvIfR, instR, schdR);
				}
				
				if (MAC_DATA_CRUD_TYP.isDEL(inspActRecvIfR.data_crud_typ())) {
					inspActRecvIfR.setStatus(Status.DELETE);
				}
			}
		}

		protected void complHdrInfo(InspActRecvIf_Chk01_DtlR inspActRecvIfR, MST_INSP_INST_R instR) {
			if (isSmplOrSmplSpecInsp(instR) && isDefStkGdCdSet() && isNull(inspActRecvIfR.smpl_gd_cd())) {
				inspActRecvIfR.smpl_gd_cd(getDefStkGdCd());
			}
			
			compVldDtUpdFlg(inspActRecvIfR, instR);

		}
		
		protected void compVldDtUpdFlg(InspActRecvIf_Chk01_DtlR inspActRecvIfR, MST_INSP_INST_R instR) {
			boolean isTargetInspType = MSC_INSP_TYP.isLOT(instR.insp_typ())
										|| MSC_INSP_TYP.isPRDCT(instR.insp_typ())
										|| MSC_INSP_TYP.isACCPT(instR.insp_typ());
			if (!isTargetInspType) {
				inspActRecvIfR.vld_dt_upd_flg(false);
				return;
			}

			MAM_ITM_R itmR = getItmR(instR.itm_cd(), instR.itm_sub1(), instR.itm_sub2(), instR.itm_sub3());
			if (inspActRecvIfR.vld_dt_upd_flg() && !isNull(itmR) && !itmR.lmt_ctl_flg()) {
				inspActRecvIfR.vld_dt_upd_flg(false);
				return;
			}

			if (!isNull(inspActRecvIfR.smpl_quality_typ()) && !MAC_QUALITY_TYP.isGOOD(inspActRecvIfR.smpl_quality_typ())) {
				inspActRecvIfR.vld_dt_upd_flg(false);
				return;
			}

			if (!isJudgmentRequired(inspActRecvIfR) && isApprovalTarget(instR)) {
				inspActRecvIfR.vld_dt_upd_flg(false);
				return;
			}

			if (instR.lmt_up_flg()) {
				inspActRecvIfR.vld_dt_upd_flg(true);
				return;
			}

			MST_LOT_R lotR = getLotRCache( 
					instR.itm_cd(), 
					instR.itm_sub1(),
					instR.itm_sub2(), 
					instR.itm_sub3(), 
					instR.lot_no(),
					instR.sublot_no());
			if (!isNull(lotR) && isNull(lotR.vld_dt())) {
				inspActRecvIfR.vld_dt_upd_flg(true);
				return;
			}
		}
		
		protected void complDtlCommonInfo(InspActRecvIf_Chk01_DtlR inspActRecvIfR, MST_INSP_SCHD_R schdR) {
			if (isNull(inspActRecvIfR.insp_schd_no())) {
				inspActRecvIfR.insp_schd_no(schdR.insp_schd_no());
			}
			if (isNull(inspActRecvIfR.stk_loc_cd())) {
				inspActRecvIfR.stk_loc_cd(schdR.loc_cd());
			}
			if (isNull(inspActRecvIfR.stk_str_ln_cd())) {
				inspActRecvIfR.stk_str_ln_cd(schdR.str_ln_cd());
			}
		}

		protected void complTtlInsp(InspActRecvIf_Chk01_DtlR inspActRecvIfR, MST_INSP_SCHD_R schdR) {
			if (isDefStkGdCdSet() && isNull(inspActRecvIfR.ttl_gd_cd())) {
				inspActRecvIfR.ttl_gd_cd(getDefStkGdCd());
			}
			if (isNull(inspActRecvIfR.pack_unit_cd())) {
				if (inspActRecvIfR.base_flg()) {
					inspActRecvIfR.pack_unit_cd(schdR.base_unit_cd());
				}
				else {
					inspActRecvIfR.pack_unit_cd(schdR.pack_unit_cd());
				}
			}
			if (isNull(inspActRecvIfR.ttl_pack_xfr_pack_unit_cd())) {
				inspActRecvIfR.ttl_pack_xfr_pack_unit_cd(schdR.pack_unit_cd());
			}
		}

		protected void complSmplInsp(InspActRecvIf_Chk01_DtlR inspActRecvIfR,MST_INSP_INST_R instR,MST_INSP_SCHD_R schdR) {
			if (!isNull(inspActRecvIfR.end_act_tm()) && isNull(inspActRecvIfR.smpl_act_tm())) {
				inspActRecvIfR.smpl_act_tm(inspActRecvIfR.end_act_tm());
			}
			
			if (isNull(inspActRecvIfR.smpl_pack_xfr_pack_unit_cd())) {
				inspActRecvIfR.smpl_pack_xfr_pack_unit_cd(schdR.pack_unit_cd());
			}
		}
		
		protected void clearDtlColumn(InspActRecvIf_Chk01_DtlR upR) {
			upR.stk_loc_cd(null);
			upR.stk_str_ln_cd(null);
			upR.ttl_quality_typ(null);
			upR.ttl_gd_cd(null);
			upR.ttl_dfct_rsn_cd(null);
			upR.ttl_act_tm(null);
			upR.base_flg(false);
			upR.pack_unit_qty(null);
			upR.pack_unit_cd(null);
			upR.ttl_pack_xfr_pack_unit_qty(null);
			upR.ttl_pack_xfr_pack_unit_cd(null);
			upR.ttl_intr_rmrks(null);
			upR.ext_insp_act_d_no(null);
			upR.so_qty(null);
			upR.smpl_qty(null);
			upR.smpl_pack_xfr_pack_unit_qty(null);
			upR.smpl_pack_xfr_pack_unit_cd(null);
			upR.smpl_act_tm(null);
			upR.bd_dpt_cd(null);
			upR.trd_rmrks(null);
			upR.smpl_intr_rmrks(null);
			upR.ext_insp_smpl_act_no(null);
		}
		
		protected void clearSmplColumn(InspActRecvIf_Chk01_DtlR upR) {
			upR.smpl_quality_typ(null);
			upR.smpl_gd_cd(null);
			upR.smpl_dfct_rsn_cd(null);
			upR.so_qty(null);
			upR.smpl_qty(null);
			upR.smpl_pack_xfr_pack_unit_qty(null);
			upR.smpl_pack_xfr_pack_unit_cd(null);
			upR.smpl_act_tm(null);
			upR.bd_dpt_cd(null);
			upR.trd_rmrks(null);
			upR.smpl_intr_rmrks(null);
			upR.ext_insp_smpl_act_no(null);
		}
		
		protected void clearTtlColumn(InspActRecvIf_Chk01_DtlR upR) {
			upR.ttl_quality_typ(null);
			upR.ttl_gd_cd(null);
			upR.ttl_dfct_rsn_cd(null);
			upR.ttl_act_tm(null);
			upR.base_flg(false);
			upR.pack_unit_qty(null);
			upR.pack_unit_cd(null);
			upR.ttl_pack_xfr_pack_unit_qty(null);
			upR.ttl_pack_xfr_pack_unit_cd(null);
			upR.ttl_intr_rmrks(null);
			upR.ext_insp_act_d_no(null);
		}

		protected boolean isTtlInsp(MST_INSP_INST_R instR) {
			if (isNull(instR)) {
				return false;
			}
			String inspMtdTyp = instR.insp_mtd_typ();
			return inspMtdTyp != null && (MAC_INSP_MTD_TYP.isTTL(inspMtdTyp));
		}
		

		protected boolean isSmplInsp(MST_INSP_INST_R instR) {
			if (isNull(instR)) {
				return false;
			}
			String inspMtdTyp = instR.insp_mtd_typ();
			return inspMtdTyp != null && MAC_INSP_MTD_TYP.isSMPL(inspMtdTyp);
		}

		protected boolean isSmplOrSmplSpecInsp(MST_INSP_INST_R instR) {
			if (isNull(instR)) {
				return false;
			}
			String inspMtdTyp = instR.insp_mtd_typ();
			return inspMtdTyp != null && (MAC_INSP_MTD_TYP.isSMPL(inspMtdTyp)
					|| MAC_INSP_MTD_TYP.isSPEC(inspMtdTyp));
		}

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
		}
		
		@Override
		protected MCMessageList doServerCheck() {
			MCMessageList msgL = super.doServerCheck();
			
			MCList<InspActRecvIf_Chk01_DtlR> notErrL = getChkList(up0());
			if (notErrL.isEmpty()) {
				return msgL;
			}
			
			msgL.addAll(chkMst(up0()));
			msgL.addAll(chkReq(up0()));
			
			return msgL;
			
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<InspActRecvIf_Chk01_DtlR> notErrL = getChkList(up0());
			if (notErrL.isEmpty()) {
				return msgL;
			}
			
			msgL.addAll(chkSub(notErrL));
			
			return msgL;
		}
		
		protected MCMessageList chkSub(MCList<InspActRecvIf_Chk01_DtlR> inspActRecvIfL){
			MCMessageList msgL = new MCMessageList();
			
			msgL.addAll(chkStkExists(inspActRecvIfL));
			msgL.addAll(chkHdrMismatch(inspActRecvIfL));
			msgL.addAll(chkApproval(inspActRecvIfL));
			msgL.addAll(chkMixedAndDup(inspActRecvIfL));
			
			return msgL;	
		}

		protected MCMessageList chkReq(MCList<InspActRecvIf_Chk01_DtlR> inspActRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			
			for (InspActRecvIf_Chk01_DtlR inspActRecvIfR : inspActRecvIfL) {
				if (MAC_DATA_CRUD_TYP.isDEL(inspActRecvIfR.data_crud_typ())) {
					msgL.addAll(chkReqHdrDelJudgment(inspActRecvIfR));
					continue;
				}
				
				MST_INSP_INST_R instR = getInspInstRCache(inspActRecvIfR.insp_no());
				if (isNull(instR)) {
					continue;
				}

				msgL.addAll(chkReqHdr(inspActRecvIfR, instR));
				msgL.addAll(chkReqHdrJudgment(inspActRecvIfR));
				if (isDetailRecord(inspActRecvIfR) || isSmplActRecord(inspActRecvIfR)) {
					msgL.addAll(chkReqDtlCommon(inspActRecvIfR));
				}
				if (isDetailRecord(inspActRecvIfR)) {
					msgL.addAll(chkReqDtlTtl(inspActRecvIfR));
				}
				if (isSmplActRecord(inspActRecvIfR)){
					msgL.addAll(chkReqDtlSmpl(inspActRecvIfR));
				}
			}
			
			return msgL;
		}
		
		protected MCMessageList chkInspSchdExists(MCList<InspActRecvIf_Chk01_DtlR> inspActRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			
			for (InspActRecvIf_Chk01_DtlR inspActRecvIfR : inspActRecvIfL) {
				if (!isNull(inspActRecvIfR.insp_no())) {
					MST_INSP_SCHD_R inspSchdR = getCacheInspSchd(inspActRecvIfR);
					if (isNull(inspSchdR)) {
						msgL.add(new MCMessage(inspActRecvIfR, null, MSLAL1023, 
							inspActRecvIfR.data_no(),
							inspActRecvIfR.data_lno(),
							inspActRecvIfR.insp_no(),
							inspActRecvIfR.insp_schd_no()
						));
					}
				}
			}
			
			return msgL;
		}
		
		protected MCMessageList chkApproval(MCList<InspActRecvIf_Chk01_DtlR> inspActRecvIfL) {
			MCMessageList msgL = new MCMessageList();	
			for (InspActRecvIf_Chk01_DtlR inspActRecvIfR : inspActRecvIfL) {
				MST_INSP_INST_R instR = getInspInstRCache(inspActRecvIfR.insp_no());
				if (isNull(instR)) {
					return msgL;
				}

				if (isJudgmentRequired(inspActRecvIfR)) {
					if (!isProdAprvEnableFlg()) {
						msgL.add(new MCMessage(inspActRecvIfR, null, MSLAL1025));
						inspActRecvIfR.err_flg(true);
					}

					if (isApprovalTarget(instR)) {
						if (!isNull(inspActRecvIfR.judg_usr_cd()) && !isAprvUsrR(instR.insp_aprv_role_cd(), inspActRecvIfR.judg_usr_cd())) {
							msgL.add(new MCMessage(inspActRecvIfR, null, MSLAL1024,
									inspActRecvIfR.data_no(),
									inspActRecvIfR.data_lno(),
									inspActRecvIfR.judg_usr_cd()));
							inspActRecvIfR.err_flg(true);
						}
					}
					else {
						msgL.add(new MCMessage(inspActRecvIfR, null, MSLAL1026,
								inspActRecvIfR.data_no(),
								inspActRecvIfR.data_lno(),
								inspActRecvIfR.ext_sys_cd(),
								inspActRecvIfR.insp_no()
						));
						inspActRecvIfR.err_flg(true);
					}
				}
		}
			return msgL;
		}
		
		protected MCMessageList chkMixedAndDup(MCList<InspActRecvIf_Chk01_DtlR> inspActRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			if (inspActRecvIfL.isEmpty()) {
				return msgL;
			}
			MCList<InspActRecvIf_Chk01_DtlR>[] inspActRecvIfGroups = inspActRecvIfL.groupList(
				InspActRecvIf_Chk01_DtlR.$data_crud_typ,
				InspActRecvIf_Chk01_DtlR.$ext_sys_cd,
				InspActRecvIf_Chk01_DtlR.$ext_data_no,
				InspActRecvIf_Chk01_DtlR.$insp_no,
				InspActRecvIf_Chk01_DtlR.$ext_insp_act_no);

			for (MCList<InspActRecvIf_Chk01_DtlR> inspActRecvIfGroup : inspActRecvIfGroups) {
				msgL.addAll(chkJudgFlgMixed(inspActRecvIfGroup));
				msgL.addAll(chkInspActDtlNoMixed(inspActRecvIfGroup));
				msgL.addAll(chkInspSmplActDtlNoMixed(inspActRecvIfGroup));
				msgL.addAll(chkHdrDup(inspActRecvIfGroup));
				msgL.addAll(chkDtlDup(inspActRecvIfGroup));
				msgL.addAll(chkSmplDup(inspActRecvIfGroup));
			}
			return msgL;
		}

		protected MCMessageList chkJudgFlgMixed(MCList<InspActRecvIf_Chk01_DtlR> inspActRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			MCList<InspActRecvIf_Chk01_DtlR> tgtL = inspActRecvIfL.subList(inspActRecvIfR -> isHeaderOnly(inspActRecvIfR));
			if (tgtL.isEmpty()) {
				return msgL;
			}
			Boolean isMixed = false;
			InspActRecvIf_Chk01_DtlR firstR = tgtL.get(0);
			for (InspActRecvIf_Chk01_DtlR inspActRecvIfR : tgtL) {
				if (!isSame(inspActRecvIfR.imp_only_judg(), firstR.imp_only_judg())) {
					isMixed = true;
				}
			}
			if (isMixed) {
				for (InspActRecvIf_Chk01_DtlR inspActRecvIfR : tgtL) {
					inspActRecvIfR.err_flg(true);
					msgL.add(new MCMessage(inspActRecvIfR, null, MSLAL1020,
						inspActRecvIfR.data_no(),
						inspActRecvIfR.data_lno(),
						inspActRecvIfR.ext_sys_cd(),
						inspActRecvIfR.ext_data_no(),
						inspActRecvIfR.data_crud_typ(),
						inspActRecvIfR.insp_no()
					));
				}
			}
			return msgL;
		}
	
		protected MCMessageList chkInspSmplActDtlNoMixed(MCList<InspActRecvIf_Chk01_DtlR> inspActRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			MCList<InspActRecvIf_Chk01_DtlR> tgtL = inspActRecvIfL.subList(inspActRecvIfR -> isNull(inspActRecvIfR.ext_insp_act_d_no()));

			if (tgtL.isEmpty()) {
				return msgL;
			}
			
			Boolean isMixed = false;
			InspActRecvIf_Chk01_DtlR firstR = tgtL.get(0);
			for (InspActRecvIf_Chk01_DtlR inspActRecvIfR : tgtL) {
				if ((isNull(firstR.ext_insp_smpl_act_no()) && !isNull(inspActRecvIfR.ext_insp_smpl_act_no())) || 
					(!isNull(firstR.ext_insp_smpl_act_no()) && isNull(inspActRecvIfR.ext_insp_smpl_act_no()))) {
					isMixed = true;
				}
			}
			
			if (isMixed) {
				for (InspActRecvIf_Chk01_DtlR inspActRecvIfR : tgtL) {
					inspActRecvIfR.err_flg(true);
					msgL.add(new MCMessage(inspActRecvIfR, null, MSLAL1021,
						inspActRecvIfR.data_no(),
						inspActRecvIfR.data_lno(),
						inspActRecvIfR.ext_sys_cd(),
						inspActRecvIfR.ext_data_no(),
						inspActRecvIfR.data_crud_typ(),
						inspActRecvIfR.insp_no()
					));
				}
			}
				
			return msgL;
		}
		
		protected MCMessageList chkInspActDtlNoMixed(MCList<InspActRecvIf_Chk01_DtlR> inspActRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			MCList<InspActRecvIf_Chk01_DtlR> tgtL = inspActRecvIfL.subList(inspActRecvIfR -> isNull(inspActRecvIfR.ext_insp_smpl_act_no()));

			if (tgtL.isEmpty()) {
				return msgL;
			}
			
			Boolean isMixed = false;
			InspActRecvIf_Chk01_DtlR firstR = tgtL.get(0);
			for (InspActRecvIf_Chk01_DtlR inspActRecvIfR : tgtL) {
				if ((isNull(firstR.ext_insp_act_d_no()) && !isNull(inspActRecvIfR.ext_insp_act_d_no())) || 
					(!isNull(firstR.ext_insp_act_d_no()) && isNull(inspActRecvIfR.ext_insp_act_d_no()))) {
					isMixed = true;
				}
			}
			
			if (isMixed) {
				for (InspActRecvIf_Chk01_DtlR inspActRecvIfR : tgtL) {
					inspActRecvIfR.err_flg(true);
					msgL.add(new MCMessage(inspActRecvIfR, null, MSLAL1021,
					inspActRecvIfR.data_no(),
					inspActRecvIfR.data_lno(),
					inspActRecvIfR.ext_sys_cd(),
					inspActRecvIfR.ext_data_no(),
					inspActRecvIfR.data_crud_typ(),
					inspActRecvIfR.insp_no()
					));
				}
			}
			
			return msgL;
		}

		protected MCMessageList chkHdrDup(MCList<InspActRecvIf_Chk01_DtlR> inspActRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			
			MCList<InspActRecvIf_Chk01_DtlR> headerOnlyList = inspActRecvIfL.subList(inspActRecvIfR -> isHeaderOnly(inspActRecvIfR) && !inspActRecvIfR.imp_only_judg());
			
			if (headerOnlyList.size() > 1) {
				for (InspActRecvIf_Chk01_DtlR inspActRecvIfR : headerOnlyList) {
					inspActRecvIfR.err_flg(true);
					msgL.add(new MCMessage(inspActRecvIfR, null, MSLAL1028,
						inspActRecvIfR.data_no(),
						inspActRecvIfR.data_lno(),
						inspActRecvIfR.ext_sys_cd(),
						inspActRecvIfR.ext_data_no(),
						inspActRecvIfR.data_crud_typ(),
						inspActRecvIfR.insp_no(),
						inspActRecvIfR.ext_insp_act_no()
					));
				}
			}
			
			return msgL;
		}

		protected MCMessageList chkDtlDup(MCList<InspActRecvIf_Chk01_DtlR> inspActRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			
			MCList<InspActRecvIf_Chk01_DtlR> detailOnlyList = inspActRecvIfL.subList(inspActRecvIfR -> isDetailRecord(inspActRecvIfR) && !inspActRecvIfR.imp_only_judg());
			
			if (detailOnlyList.isEmpty()) {
				return msgL;
			}
			
			MCList<InspActRecvIf_Chk01_DtlR>[] detailGroups = detailOnlyList.groupList(
				new String[] { InspActRecvIf_Chk01_DtlR.$ext_insp_act_d_no });
			
			for (MCList<InspActRecvIf_Chk01_DtlR> detailGroup : detailGroups) {
				if (detailGroup.size() > 1) {
					for (InspActRecvIf_Chk01_DtlR inspActRecvIfR : detailGroup) {
						inspActRecvIfR.err_flg(true);
						msgL.add(new MCMessage(inspActRecvIfR, null, MSLAL1029,
							inspActRecvIfR.data_no(),
							inspActRecvIfR.data_lno(),
							inspActRecvIfR.ext_sys_cd(),
							inspActRecvIfR.ext_data_no(),
							inspActRecvIfR.data_crud_typ(),
							inspActRecvIfR.insp_no(),
							inspActRecvIfR.ext_insp_act_d_no()
						));
					}
				}
			}
			
			return msgL;
		}

		protected MCMessageList chkSmplDup(MCList<InspActRecvIf_Chk01_DtlR> inspActRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			
			MCList<InspActRecvIf_Chk01_DtlR> sampleOnlyList = inspActRecvIfL.subList(inspActRecvIfR -> isSmplActRecord(inspActRecvIfR) && !inspActRecvIfR.imp_only_judg());

			if (sampleOnlyList.isEmpty()) {
				return msgL;
			}

			MCList<InspActRecvIf_Chk01_DtlR>[] sampleGroups = sampleOnlyList.groupList(
				new String[] { InspActRecvIf_Chk01_DtlR.$ext_insp_smpl_act_no });
			
			for (MCList<InspActRecvIf_Chk01_DtlR> sampleGroup : sampleGroups) {
				if (sampleGroup.size() > 1) {
					for (InspActRecvIf_Chk01_DtlR inspActRecvIfR : sampleGroup) {
						inspActRecvIfR.err_flg(true);
						msgL.add(new MCMessage(inspActRecvIfR, null, MSLAL1030,
							inspActRecvIfR.data_no(),
							inspActRecvIfR.data_lno(),
							inspActRecvIfR.ext_sys_cd(),
							inspActRecvIfR.ext_data_no(),
							inspActRecvIfR.data_crud_typ(),
							inspActRecvIfR.insp_no(),
							inspActRecvIfR.ext_insp_smpl_act_no()
						));
					}
				}
			}
			
			return msgL;
		}

		protected MCMessageList chkHdrMismatch(MCList<InspActRecvIf_Chk01_DtlR> inspActRecvIfL) {
			MCMessageList msgL = new MCMessageList();

			MCList<InspActRecvIf_Chk01_DtlR>[] inspActNoGroups = inspActRecvIfL.groupList(
				InspActRecvIf_Chk01_DtlR.$data_crud_typ,
				InspActRecvIf_Chk01_DtlR.$ext_sys_cd,
				InspActRecvIf_Chk01_DtlR.$ext_data_no,
				InspActRecvIf_Chk01_DtlR.$ext_insp_act_no);

			for (MCList<InspActRecvIf_Chk01_DtlR> inspActNoGroup : inspActNoGroups) {
				if (hasHdrMismatch(inspActNoGroup)) {
					for (InspActRecvIf_Chk01_DtlR inspActRecvIfR : inspActNoGroup) {
						inspActRecvIfR.err_flg(true);
						msgL.add(new MCMessage(inspActRecvIfR, null, MSLAL1027,
							inspActRecvIfR.data_no(),
							inspActRecvIfR.data_lno(),
							inspActRecvIfR.ext_sys_cd(),
							inspActRecvIfR.ext_data_no(),
							inspActRecvIfR.data_crud_typ(),
							inspActRecvIfR.ext_insp_act_no()
						));
					}
				}		
			}
			return msgL;
		}
		
		protected MCMessageList chkReqDtlSmpl(InspActRecvIf_Chk01_DtlR inspActRecvIfR) {
			MCMessageList msgL = new MCMessageList();
			
			List<String> requiredCols = getDtlSmplRequiredCols(inspActRecvIfR);
			requiredCols.forEach(col -> msgL.addAll(check(inspActRecvIfR, col, new FXUCL_RequiredValidater())));
			
			return msgL;
		}
		
		protected MCMessageList chkReqDtlTtl(InspActRecvIf_Chk01_DtlR inspActRecvIfR) {
			MCMessageList msgL = new MCMessageList();
			
			List<String> requiredCols = getDtlTtlRequiredCols(inspActRecvIfR);
			requiredCols.forEach(col -> msgL.addAll(check(inspActRecvIfR, col, new FXUCL_RequiredValidater())));
			
			return msgL;
		}


		protected boolean hasHdrMismatch(MCList<InspActRecvIf_Chk01_DtlR> InspActRecvIfL) { 	
			 if (InspActRecvIfL.size() <= 1) {
				return false;
			}
			
			MCList<InspActRecvIf_Chk01_DtlR>[] headerGroups = InspActRecvIfL.groupList(getInspActRecvIfHdrKey());
			return headerGroups.length > 1;
		}
		
		protected String[] getInspActRecvIfHdrKey() {
			return new String[] {
				InspActRecvIf_Chk01_DtlR.$insp_no,
				InspActRecvIf_Chk01_DtlR.$st_act_tm,
				InspActRecvIf_Chk01_DtlR.$end_act_tm,
				InspActRecvIf_Chk01_DtlR.$act_usr_cd,
				InspActRecvIf_Chk01_DtlR.$act_dpt_cd,
				InspActRecvIf_Chk01_DtlR.$smpl_quality_typ,
				InspActRecvIf_Chk01_DtlR.$smpl_gd_cd,
				InspActRecvIf_Chk01_DtlR.$smpl_dfct_rsn_cd,
				InspActRecvIf_Chk01_DtlR.$act_cont_fctr,
				InspActRecvIf_Chk01_DtlR.$vld_dt_upd_flg,
				InspActRecvIf_Chk01_DtlR.$lmt_dt_frm,
				InspActRecvIf_Chk01_DtlR.$vld_dt,
				InspActRecvIf_Chk01_DtlR.$lmt_dt,
				InspActRecvIf_Chk01_DtlR.$intr_rmrks,
				InspActRecvIf_Chk01_DtlR.$lot_rmrks,
				InspActRecvIf_Chk01_DtlR.$imp_only_judg,
				InspActRecvIf_Chk01_DtlR.$insp_judg_rslt_typ,
				InspActRecvIf_Chk01_DtlR.$judg_dt,
				InspActRecvIf_Chk01_DtlR.$judg_usr_cd,
				InspActRecvIf_Chk01_DtlR.$judg_dpt_cd,
				InspActRecvIf_Chk01_DtlR.$judg_rsn,
				InspActRecvIf_Chk01_DtlR.$ext_insp_act_no
			};
		}

		protected MCMessageList chkReqHdr(InspActRecvIf_Chk01_DtlR inspActRecvIfR, MST_INSP_INST_R instR) {
			MCMessageList msgL = new MCMessageList();
			
			List<String> requiredCols = getRequiredCols(inspActRecvIfR, instR);
			requiredCols.forEach(col -> msgL.addAll(check(inspActRecvIfR, col, new FXUCL_RequiredValidater())));
			
			return msgL;
		}

		protected List<String> getRequiredCols(InspActRecvIf_Chk01_DtlR inspActRecvIfR, MST_INSP_INST_R instR) {
			List<String> requiredCols = new ArrayList<>();
			
			if (isSmplOrSmplSpecInsp(instR)) {
				boolean hasEndDt = !isNull(inspActRecvIfR.end_act_tm());
				boolean hasSmplGdCd = !isNull(inspActRecvIfR.smpl_gd_cd());
				boolean hasSmplQualityTyp = !isNull(inspActRecvIfR.smpl_quality_typ());
				
				if (isSmplQualityTypRequired(hasEndDt, hasSmplGdCd)) {
					requiredCols.add(InspActRecvIf_Chk01_DtlR.$smpl_quality_typ);
				}

				if (isGdCdRequired(hasEndDt, hasSmplQualityTyp)) {
					requiredCols.add(InspActRecvIf_Chk01_DtlR.$smpl_gd_cd);	
				}

				if (isEndActTmRequired(hasSmplGdCd, hasSmplQualityTyp)) {
					requiredCols.add(InspActRecvIf_Chk01_DtlR.$end_act_tm);
				}

				if (isSmplDfctRsnCdRequired(inspActRecvIfR.smpl_quality_typ())) {
					requiredCols.add(InspActRecvIf_Chk01_DtlR.$smpl_dfct_rsn_cd);
				}
			}
			
			if (isStActTmRequired(inspActRecvIfR)) {
				requiredCols.add(InspActRecvIf_Chk01_DtlR.$st_act_tm);
			}
			
			if (isManualDateInput(inspActRecvIfR)) {
				requiredCols.add(InspActRecvIf_Chk01_DtlR.$lmt_dt_frm);
				requiredCols.add(InspActRecvIf_Chk01_DtlR.$vld_dt);
				requiredCols.add(InspActRecvIf_Chk01_DtlR.$lmt_dt);
			}

			return requiredCols;
		}

		protected String getProdAprvEnable() {
			return getSysParmNE("MFG_APRV_ENABLE_FLG");
		}
		
		protected String getDefStkGdCd() {
			return getSysParmNE("DEF_STK_GD_CD");
		}

		protected boolean isDefStkGdCdSet() {
			return !isNull(getDefStkGdCd());
		}

		protected boolean isProdAprvEnableFlg() {
			return isSame(getProdAprvEnable(),"1");
		}

		/**
		 * 検査実績受信IF情報から検査予定情報を取得する
		 * 検査予定NOが設定されている場合は検査予定NOから検索
		 * 検査予定NOが未設定の場合は検査NOから検査予定を取得し、昇順1件目の検査予定NOを使用
		 */
		protected MST_INSP_SCHD_R getCacheInspSchd(InspActRecvIf_Chk01_DtlR inspActRecvIfR) {
			if (isNull(inspActRecvIfR)) {
				return null;
			}
			
			String inspSchdNo = inspActRecvIfR.insp_schd_no();	
			String inspNo = inspActRecvIfR.insp_no();

			if (!isNull(inspSchdNo)) {
				return getInspSchdRCache(inspSchdNo);
			}
			else if (isNull(inspSchdNo) && !isNull(inspNo)){
				MCList<MST_INSP_SCHD_R> schdList = getInspSchdLCache(inspNo);
				if (!schdList.isEmpty()) {
					return schdList.get(0);
				}
				
			}
			
			return null;
			
		}
		
		protected boolean isSmplQualityTypRequired(boolean hasEndDt, boolean hasSmplGdCd) {
			return hasEndDt || (isNull(getDefStkGdCd()) && hasSmplGdCd);
		}

		protected boolean isGdCdRequired(boolean hasEndDt, boolean hasSmplQualityTyp) {
			return isNull(getDefStkGdCd()) && (hasEndDt || hasSmplQualityTyp);
		}

		protected boolean isEndActTmRequired(boolean hasSmplGdCd, boolean hasSmplQualityTyp) {
			return (isNull(getDefStkGdCd()) && hasSmplGdCd) || hasSmplQualityTyp;
		}

		protected boolean isSmplDfctRsnCdRequired(String smplQualityTyp) {
			return MAC_QUALITY_TYP.isDFCT_INSP(smplQualityTyp);
		}

		protected boolean isStActTmRequired(InspActRecvIf_Chk01_DtlR inspActRecvIfR) {
			return MAC_DATA_CRUD_TYP.isCRT(inspActRecvIfR.data_crud_typ()) || 
				(MAC_DATA_CRUD_TYP.isUPD(inspActRecvIfR.data_crud_typ()) && !inspActRecvIfR.imp_only_judg());
		}

		protected boolean isSmplQualityTypRequired(boolean hasEndDt, boolean isDefStkGdCdSet, 
												boolean hasSmplQualityTyp, boolean hasSmplGdCd) {
			return hasEndDt || (isDefStkGdCdSet && hasSmplQualityTyp);
		}
		
		protected MCMessageList chkReqHdrDelJudgment(InspActRecvIf_Chk01_DtlR inspActRecvIfR) {
			MCMessageList msgL = new MCMessageList();
			
			List<String> requiredCols = getDelJudgmentRequiredCols(inspActRecvIfR);
			requiredCols.forEach(col -> msgL.addAll(check(inspActRecvIfR, col, new FXUCL_RequiredValidater())));
			
			return msgL;
		}

		protected List<String> getDelJudgmentRequiredCols(InspActRecvIf_Chk01_DtlR inspActRecvIfR) {
			List<String> requiredCols = new ArrayList<>();
			
			if (inspActRecvIfR.imp_only_judg()) {
				requiredCols.add(InspActRecvIf_Chk01_DtlR.$judg_rsn);
			}
			
			return requiredCols;
		}

		protected MCMessageList chkReqHdrJudgment(InspActRecvIf_Chk01_DtlR inspActRecvIfR) {
			MCMessageList msgL = new MCMessageList();
			
			List<String> requiredCols = getJudgmentRequiredCols(inspActRecvIfR);
			requiredCols.forEach(col -> msgL.addAll(check(inspActRecvIfR, col, new FXUCL_RequiredValidater())));
			
			return msgL;
		}

		protected List<String> getJudgmentRequiredCols(InspActRecvIf_Chk01_DtlR inspActRecvIfR) {
			List<String> requiredCols = new ArrayList<>();
			
			if (isJudgmentRequired(inspActRecvIfR)) {
				requiredCols.add(InspActRecvIf_Chk01_DtlR.$insp_judg_rslt_typ);
				requiredCols.add(InspActRecvIf_Chk01_DtlR.$judg_dt);
				requiredCols.add(InspActRecvIf_Chk01_DtlR.$judg_usr_cd);
				requiredCols.add(InspActRecvIf_Chk01_DtlR.$judg_dpt_cd);
				requiredCols.add(InspActRecvIf_Chk01_DtlR.$judg_rsn);
			}
			
			return requiredCols;
		}
		
		protected MCMessageList chkReqDtlCommon(InspActRecvIf_Chk01_DtlR inspActRecvIfR) {
			MCMessageList msgL = new MCMessageList();
			
			List<String> requiredCols = getDtlCommonRequiredCols(inspActRecvIfR);
			requiredCols.forEach(col -> msgL.addAll(check(inspActRecvIfR, col, new FXUCL_RequiredValidater())));
			
			return msgL;
		}

		protected List<String> getDtlCommonRequiredCols(InspActRecvIf_Chk01_DtlR inspActRecvIfR) {
			List<String> requiredCols = new ArrayList<>();
			
			if (hasDtlNo(inspActRecvIfR)) {
				requiredCols.add(InspActRecvIf_Chk01_DtlR.$stk_loc_cd);
			}
			
			return requiredCols;
		}

		protected boolean hasDtlNo(InspActRecvIf_Chk01_DtlR inspActRecvIfR) {
			return !isNull(inspActRecvIfR.ext_insp_act_d_no()) || 
				!isNull(inspActRecvIfR.ext_insp_smpl_act_no());
		}

		protected List<String> getDtlTtlRequiredCols(InspActRecvIf_Chk01_DtlR inspActRecvIfR) {
			List<String> requiredCols = new ArrayList<>();
			
			requiredCols.add(InspActRecvIf_Chk01_DtlR.$ttl_quality_typ);
			
			if (isNull(getDefStkGdCd())) {
				requiredCols.add(InspActRecvIf_Chk01_DtlR.$ttl_gd_cd);
			}
			
			if (isTtlDfctRsnCdRequired(inspActRecvIfR)) {
				requiredCols.add(InspActRecvIf_Chk01_DtlR.$ttl_dfct_rsn_cd);
			}
			
			requiredCols.add(InspActRecvIf_Chk01_DtlR.$ttl_act_tm);
			
			requiredCols.add(InspActRecvIf_Chk01_DtlR.$pack_unit_qty);
			
			if (isTtlPackXfrPackUnitQtyRequired(inspActRecvIfR)) {
				requiredCols.add(InspActRecvIf_Chk01_DtlR.$ttl_pack_xfr_pack_unit_qty);
			}
		
			return requiredCols;
		}

		protected boolean isTtlDfctRsnCdRequired(InspActRecvIf_Chk01_DtlR inspActRecvIfR) {
			return MAC_QUALITY_TYP.isDFCT_INSP(inspActRecvIfR.ttl_quality_typ());
		}

		protected boolean isTtlPackXfrPackUnitQtyRequired(InspActRecvIf_Chk01_DtlR inspActRecvIfR) {
			return inspActRecvIfR.base_flg();
		}
		
		protected boolean isSmplActTmRequired(InspActRecvIf_Chk01_DtlR inspActRecvIfR) {
			return isNull(inspActRecvIfR.end_act_tm());
		}

		protected boolean isBdDptCdRequired(InspActRecvIf_Chk01_DtlR inspActRecvIfR) {
			return !isNull(inspActRecvIfR.so_qty());
		}
		
		protected boolean isManualDateInput(InspActRecvIf_Chk01_DtlR inspActRecvIfR) {
			InspSchd_Srch01_CndR itmInspR = getItmInspRCache(inspActRecvIfR.peg_no());
			return !isNull(itmInspR) && MAC_LMT_DT_FRM_TYP.isMANUAL(itmInspR.lmt_dt_frm_typ());
		}

		protected boolean isSameHeaderValue(InspActRecvIf_Chk01_DtlR inspActRecvIfR, MST_INSP_ACT_R inspActR, MST_INSP_INST_R inspR) {
			MST_LOT_R lotR = getLotRCache(inspActR.itm_cd(), inspActR.itm_sub1(), inspActR.itm_sub2(), inspActR.itm_sub3(), inspActR.lot_no(), inspActR.sublot_no());
			boolean isSameLotRmrks = true;
			
			if (!isNull(lotR)) {
				isSameLotRmrks = isSame(inspActRecvIfR.lot_rmrks(),lotR.lot_rmrks());
			}
			
			boolean isSameCommonValues = isSame(inspActRecvIfR.st_act_tm(), inspActR.st_tm()) &&
					 isSame(inspActRecvIfR.end_act_tm(), inspActR.end_tm()) &&
					 isSame(inspActRecvIfR.act_usr_cd(), inspActR.act_usr_cd()) &&
					 isSame(inspActRecvIfR.act_dpt_cd(), inspActR.act_dpt_cd()) &&
					 isSame(inspActRecvIfR.act_cont_fctr(), inspR.act_cont_fctr()) &&
					 isSame(inspActRecvIfR.lmt_dt_frm(), inspActR.lmt_dt_frm()) &&
					 isSame(inspActRecvIfR.vld_dt(), inspActR.vld_dt()) &&
					 isSame(inspActRecvIfR.lmt_dt(), inspActR.lmt_dt()) &&
					 isSame(inspActRecvIfR.intr_rmrks(), inspActR.intr_rmrks()) &&
					 isSameLotRmrks;
			
			if (!isNull(inspActRecvIfR.ext_insp_act_d_no())) {
				return isSameCommonValues;
			}
			else {
				return isSameCommonValues &&
						isSame(inspActRecvIfR.smpl_quality_typ(), inspActR.quality_typ()) &&
						isSame(inspActRecvIfR.smpl_gd_cd(), inspActR.gd_cd()) &&
						isSame(inspActRecvIfR.smpl_dfct_rsn_cd(), inspActR.dfct_rsn_cd());
			}
		}

		protected boolean isAprvUsrR(String roleCd, String userCd) {
			if (isNull(roleCd)) {
				return false;
			}
			
			MAVM_APRV_USR_R t = MAVM_APRV_USR_R.create("T");
			int cnt = execDbCount("MSLAL6420_MAVM_APRV_USR_S01", t,
					t.aprv_role_cd.eq(bind("1"))
							.and(t.usr_cd.eq(bind("2")))
							.and(t.st_dt.lte(bind("3")))
							.and(t.end_dt.isNull().or(t.end_dt.gte(bind("3")))),
					roleCd, userCd, getToday());
			
			return cnt > 0;
		}

		protected boolean isSmplPackXfrPackUnitQtyRequired(InspActRecvIf_Chk01_DtlR inspActRecvIfR) {
			MST_INSP_INST_R inspInstR = getInspInstRCache(inspActRecvIfR.insp_no());
			return !isNull(inspActRecvIfR.so_qty()) && !isSame(inspActRecvIfR.smpl_pack_xfr_pack_unit_cd(), inspInstR.base_unit_cd());
		}


		protected MCList<InspActRecvIf_Chk01_DtlR> getInspActSmplOnlyList(
			MCList<InspActRecvIf_Chk01_DtlR> InspActRecvIfL) {
				return InspActRecvIfL.subList(inspActRecvIfR ->
						isSmplActRecord(inspActRecvIfR));
		}

		protected MCList<InspActRecvIf_Chk01_DtlR> getInspActList(
			MCList<InspActRecvIf_Chk01_DtlR> InspActRecvIfL) {
			return InspActRecvIfL.subList(inspActRecvIfR ->
						isHeaderOnly(inspActRecvIfR));
		}

		protected MCList<InspActRecvIf_Chk01_DtlR> getInspActDtlOnlyList(
			MCList<InspActRecvIf_Chk01_DtlR> InspActRecvIfL) {
			return InspActRecvIfL.subList(inspActRecvIfR ->
						isDetailRecord(inspActRecvIfR));
		}
		
		protected List<String> getDtlSmplRequiredCols(InspActRecvIf_Chk01_DtlR inspActRecvIfR) {
			List<String> requiredCols = new ArrayList<>();
			
			requiredCols.add(InspActRecvIf_Chk01_DtlR.$smpl_qty);
				
			if (isSmplActTmRequired(inspActRecvIfR)) {
					requiredCols.add(InspActRecvIf_Chk01_DtlR.$smpl_act_tm);
			}
				
			if (isBdDptCdRequired(inspActRecvIfR)) {
				requiredCols.add(InspActRecvIf_Chk01_DtlR.$bd_dpt_cd);
			}

			if (isSmplPackXfrPackUnitQtyRequired(inspActRecvIfR)) {
				requiredCols.add(InspActRecvIf_Chk01_DtlR.$smpl_pack_xfr_pack_unit_qty);
			}
			
			return requiredCols;
		}
	}
	
	/**
	 * InspActRecvIf_Upd01オペレーション.<p>
	 *
	 * 検査実績受信ＩＦ取込を行う。（ＥＳＢのリアルタイム取込から呼び出される）<br>
	 */
	public class InspActRecvIf_Upd01 extends MSLAL_InspActRecvIfService_MC_A.InspActRecvIf_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callInspActRecvIfUpd02();
		}

		protected void callInspActRecvIfUpd02() {
			MSLAL_InspActRecvIfService.InspActRecvIf_Upd02 ope = MSLAL_InspActRecvIfService
					.crtInspActRecvIf_Upd02();
			setAll(ope.up0(), up0(), createMapForUpd02());
			ope.exec();
		}

		protected MapForUpd02<IfDataImp_Upd01_DtlR, Upd01_DtlR> createMapForUpd02() {
			return new MapForUpd02<IfDataImp_Upd01_DtlR, Upd01_DtlR>();
		}

		public class MapForUpd02<D extends IfDataImp_Upd01_DtlR, S extends Upd01_DtlR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(IfDataImp_Upd01_DtlR.$data_no, Upd01_DtlR.$data_no);
				addColumnPathMap(IfDataImp_Upd01_DtlR.$ext_data_no,Upd01_DtlR.$ext_data_no);
				addColumnPathMap(IfDataImp_Upd01_DtlR.$ext_sys_cd,Upd01_DtlR.$ext_sys_cd);
			}
		}
	}
	/**
	 * InspActRecvIf_Upd02オペレーション.<p>
	 *
	 * 検査実績受信ＩＦ取込を行う。（ＩＦデータ確認、および検査実績受信ＩＦ取込バッチから呼び出される）<br>
	 */
	public class InspActRecvIf_Upd02 extends MSLAL_InspActRecvIfService_MC_A.InspActRecvIf_Upd02 {
		
		protected MCList<MST_INSP_ACT_RECV_IF_R> _inspActRecvIfL;

		protected MST_INSP_ACT_RECV_IF_R _inspActRecvIfR;

		protected MCQueryApiBuilder _inspActRecvIfL_bldr;

		protected int _totalNum = 0;
		protected int _okNum = 0;
		protected int _errNum = 0;
		protected int _skipNum = 0;

		protected boolean _exceptionFlg;

		protected boolean _crtNewLogger = false;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				initProc();
				writeStartLog();
				preSrch();
				callInspActRecvIfUpd03(fetchRecvTargetFromScmIfCtrl());
			}
			catch (Exception ex) {
				handleEx(ex);
			}
			finally {
				writeEndLog();
			}
		}
		
		protected void initProc() {
			// カレントLoggerがnullの場合（呼出元からLoggerを引き継がない場合）は新規
			if (loggerNE() == null) {
				_crtNewLogger = true;
			}
			// バッチログを初期化
			getConcurrentLogger();
			_inspActRecvIfL = MCList.create(MST_INSP_ACT_RECV_IF_R.class);
			_inspActRecvIfR = MST_INSP_ACT_RECV_IF_R.create("INSPACTRECVIF");
			_inspActRecvIfL_bldr = MCQueryApiBuilder.create(_inspActRecvIfR);
		}

		protected void writeStartLog() {
			logger().writeStartLog(MSLAL1001);
			pushStartLog(logger());
		}

		protected void preSrch() {
			MST_INSP_INST_R inspInstR = MST_INSP_INST_R.create("INSPINST");
			PFT_SDRV_IF_R sdrv = PFT_SDRV_IF_R.create("SDRV");
			
			_inspActRecvIfL_bldr.setSelect(_inspActRecvIfR.data_lno);
			_inspActRecvIfL_bldr.addSelect(_inspActRecvIfR.ext_sys_cd);
			_inspActRecvIfL_bldr.addSelect(_inspActRecvIfR.ext_data_no);
			_inspActRecvIfL_bldr.addSelect(_inspActRecvIfR.recv_dt);
			_inspActRecvIfL_bldr.addSelect(_inspActRecvIfR.insp_no);
			_inspActRecvIfL_bldr.addSelect(_inspActRecvIfR.insp_schd_no);
			// 検査指図からマルチスレッド実行のキー取得を取得
			_inspActRecvIfL_bldr.addSelect(inspInstR.mfg_loc_cd);
			_inspActRecvIfL_bldr.addSelect(inspInstR.sppl_cd);
			_inspActRecvIfL_bldr.addInnerJoin(inspInstR, _inspActRecvIfR.insp_no.eq(inspInstR.insp_no));
			_inspActRecvIfL_bldr.addLeftOuterJoin(sdrv, _inspActRecvIfR.data_no.eq(sdrv.data_no));
			_inspActRecvIfL_bldr.setWhere(value(0).eq(value(0)));
			_inspActRecvIfL_bldr.addWhereWithAnd(_inspActRecvIfR.imp_flg.eq(value(true)));
			_inspActRecvIfL_bldr.addWhereWithAnd(bracket(sdrv.sdrv_sts_typ.isNull().or(
					sdrv.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.RECV_CONV_OK.value())))));
			_inspActRecvIfL_bldr.addWhereWithAnd(_inspActRecvIfR.imp_flg.eq(value(true)));
			_inspActRecvIfL_bldr.addOrderByAsc(_inspActRecvIfR.ext_data_no,_inspActRecvIfR.ext_data_lno);
			//データＮＯが電文で渡された場合
			if (!up0().isEmpty()) {
				_inspActRecvIfL_bldr.addWhereWithCutOffAnd(
						bracket(_inspActRecvIfR.data_no.eq(bind("data_no"))));
				_inspActRecvIfL_bldr.addWhereWithCutOffAnd(
						bracket(_inspActRecvIfR.data_lno.eq(bind("data_lno"))));
				_inspActRecvIfL_bldr.addWhereWithCutOffAnd(
						bracket(_inspActRecvIfR.ext_data_no.eq(bind("ext_data_no"))));
				_inspActRecvIfL_bldr.addWhereWithCutOffAnd(
						bracket(_inspActRecvIfR.ext_sys_cd.eq(bind("ext_sys_cd"))));
				dbSelect("MSLAL6410_MST_INSP_ACT_RECV_IF_S01", _inspActRecvIfL, _inspActRecvIfL_bldr,
						up0());
			}
			else {
				dbSelect("MSLAL6420_MST_INSP_ACT_RECV_IF_S02", _inspActRecvIfL, _inspActRecvIfL_bldr);
			}
		}

		protected MCList<MST_INSP_ACT_RECV_IF_R> fetchRecvTargetFromScmIfCtrl() {
			if (_inspActRecvIfL.isEmpty()) {
				return _inspActRecvIfL;
			}
			MCList<MST_INSP_SCHD_R> inspSchdList = fetchInspSchd();
			MSUCL_SCMLinkUtil.SCMLinkUtil_Srch01 scmLinkUtil = MSUCL_SCMLinkUtil.crtSCMLinkUtil_Srch01();
			Map<MCNumber, MST_INSP_ACT_RECV_IF_R> recvIfKeyMap = new HashMap<>();
			createScmLinkUtilUp(_inspActRecvIfL, inspSchdList, scmLinkUtil, recvIfKeyMap);
			scmLinkUtil.exec();
			return createRecvTargetList(scmLinkUtil, recvIfKeyMap);
		}

		protected void createScmLinkUtilUp(
			MCList<MST_INSP_ACT_RECV_IF_R> recvIfList,
			MCList<MST_INSP_SCHD_R> schdList,
			MSUCL_SCMLinkUtil.SCMLinkUtil_Srch01 scmLinkUtil,
			Map<MCNumber, MST_INSP_ACT_RECV_IF_R> recvIfKeyMap
		) {
			MCIndexKey inspNoIdx = schdList.createIndex(MST_INSP_SCHD_R.$insp_no);
			MCNumber pegNo = MCNumber.ZERO;
			for (MST_INSP_ACT_RECV_IF_R recvIfR : recvIfList) {
				MCList<MST_INSP_SCHD_R> targetSchdList = schdList.subList(inspNoIdx, recvIfR.insp_no());
				// ＩＦレコードに紐づく検査予定が複数ある場合、各検査予定でＳＣＭＩＦ制御マスタの受信対象かどうかを判断する
				// 一つでも受信対象があれば、そのＩＦレコードは受信対象とする
				for (MST_INSP_SCHD_R schdR : targetSchdList) {
					SCMLinkUtil_Srch01_CndR condR = scmLinkUtil.up0().add();
					condR.peg_no(pegNo);
					condR.if_proc_typ(MAC_IF_PROC_TYP.MES_INSP_ACT_RECV.value());
					condR.loc_cd(MSC_INSP_TYP.isPRDCT(schdR.insp_typ()) ? schdR.mfg_loc_cd() : schdR.loc_cd());
					condR.itm_cd(schdR.itm_cd());
					condR.itm_sub1(schdR.itm_sub1());
					condR.itm_sub2(schdR.itm_sub2());
					condR.itm_sub3(schdR.itm_sub3());
					condR.master_dt(recvIfR.recv_dt());
					recvIfKeyMap.put(pegNo, recvIfR);
				}
				pegNo = pegNo.add(1);
			}
		}

		protected MCList<MST_INSP_ACT_RECV_IF_R> createRecvTargetList(
			MSUCL_SCMLinkUtil.SCMLinkUtil_Srch01 scmLinkUtil,
			Map<MCNumber, MST_INSP_ACT_RECV_IF_R> recvIfKeyMap
		) {
			MCList<MST_INSP_ACT_RECV_IF_R> recvTargetList = MCList.create(MST_INSP_ACT_RECV_IF_R.class);
			for (SCMLinkUtil_Srch01_CndR condR : scmLinkUtil.down0()) {
				if (isNull(condR.ext_sys_cd())) {
					continue;
				}
				if (recvIfKeyMap.containsKey(condR.peg_no())) {
					recvTargetList.add(recvIfKeyMap.get(condR.peg_no()));
				}
			}
			return recvTargetList;
		}
		
		protected MCList<MST_INSP_SCHD_R> fetchInspSchd() {
			MCList<MST_INSP_SCHD_R> inspSchdL = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R inspSchd = MST_INSP_SCHD_R.create("INSPSCHD");
			MCQueryApiBuilder inspSchdL_bldr = MCQueryApiBuilder.create(inspSchd);
			
			inspSchdL_bldr.addSelect(inspSchd.insp_no);
			inspSchdL_bldr.addSelect(inspSchd.insp_schd_no);
			inspSchdL_bldr.addSelect(inspSchd.mfg_loc_cd);
			inspSchdL_bldr.addSelect(inspSchd.loc_cd);
			inspSchdL_bldr.addSelect(inspSchd.itm_cd);
			inspSchdL_bldr.addSelect(inspSchd.itm_sub1);
			inspSchdL_bldr.addSelect(inspSchd.itm_sub2);
			inspSchdL_bldr.addSelect(inspSchd.itm_sub3);
			inspSchdL_bldr.addSelect(inspSchd.insp_typ);
			inspSchdL_bldr.setWhere(inspSchd.insp_no.eq(bind("insp_no")));
			
			dbSelect("MSLAL6420_MST_INSP_SCHD_S02", inspSchdL, inspSchdL_bldr, _inspActRecvIfL);
			
			return inspSchdL;
		}
		
		protected MCGroupByPolicy getRecvTgtGrpPolicy() {
			MCGroupByPolicy gbp = new MCGroupByPolicy(getRecvTgtKeyCols());

			return gbp;
		}

		protected String[] getRecvTgtKeyCols() {
			return new String[] {
					MST_INSP_ACT_RECV_IF_R.$recv_dt
					, MST_INSP_SCHD_R.$mfg_loc_cd
					, MST_INSP_SCHD_R.$itm_cd
					, MST_INSP_SCHD_R.$itm_sub1
					, MST_INSP_SCHD_R.$itm_sub2
					, MST_INSP_SCHD_R.$itm_sub3
			};
		}

		protected Comparable<?>[] getRecvTgtKeyVals(MST_INSP_ACT_RECV_IF_R inspActRecvIfR) {
			return new Comparable<?>[] {
					inspActRecvIfR.recv_dt(), 
					inspActRecvIfR.getStringNE("mfg_loc_cd"),
					inspActRecvIfR.getStringNE("loc_cd"),
					inspActRecvIfR.getStringNE("itm_cd"),
					inspActRecvIfR.getStringNE("itm_sub1"),
					inspActRecvIfR.getStringNE("itm_sub2"),
					inspActRecvIfR.getStringNE("itm_sub3")
			};
		}
		
		protected void callInspActRecvIfUpd03(MCList<MST_INSP_ACT_RECV_IF_R> recvTargetList) {
			if (recvTargetList.isEmpty()) {
				return;
			}
			List<MSLAL_InspActRecvIfService.InspActRecvIf_Upd03> operationList = createThreadSplitUpd03Operations(recvTargetList);
			executeUpd03OperationsByMultiThread(operationList);
			countUpd03Results(operationList);
		}

		protected List<MSLAL_InspActRecvIfService.InspActRecvIf_Upd03> createThreadSplitUpd03Operations(MCList<MST_INSP_ACT_RECV_IF_R> recvTargetList) {
			List<MSLAL_InspActRecvIfService.InspActRecvIf_Upd03> operationList = new ArrayList<>();
			int operationNo = 0;
			for (MCList<MST_INSP_ACT_RECV_IF_R> groupList : recvTargetList.groupList("ext_sys_cd", "sppl_cd", "mfg_loc_cd")) {
				MSLAL_InspActRecvIfService.InspActRecvIf_Upd03 upd03 = MSLAL_InspActRecvIfService.crtInspActRecvIf_Upd03();
				upd03._no = ++operationNo;
				setAll(upd03.up0(), groupList, createMapForUpd03());
				operationList.add(upd03);
			}
			return operationList;
		}
		
		protected MapForUpd03<InspActRecvIf_Upd03_DtlR, MST_INSP_ACT_RECV_IF_R> createMapForUpd03() {
			return new MapForUpd03<InspActRecvIf_Upd03_DtlR, MST_INSP_ACT_RECV_IF_R>();
		}

		public class MapForUpd03<D extends InspActRecvIf_Upd03_DtlR, S extends MST_INSP_ACT_RECV_IF_R>
				extends MCRowMapper<D, S> {
			@Override
			public void valueCopy(D dest, S src) {
				dest.insp_if(src);
			}
		}

		protected void executeUpd03OperationsByMultiThread(List<MSLAL_InspActRecvIfService.InspActRecvIf_Upd03> operationList) {
			if (operationList.isEmpty()) {
				return;
			}
			if (MCServerThreadManager.getLimitThreadSize() <= 1) {
				MCServerThreadManager.setUseMainDBTran(true);
				MCServerThreadManager.invokeAndWait(1, operationList, FXBAL_BatchLogManager.class);
			}
			else {
				MCServerThreadManager.setCommitAndRollback(true);
				Collections.sort(operationList,
					new Comparator<MSLAL_InspActRecvIfService.InspActRecvIf_Upd03>() {
						public int compare(
							MSLAL_InspActRecvIfService.InspActRecvIf_Upd03 o1,
							MSLAL_InspActRecvIfService.InspActRecvIf_Upd03 o2) {
							return (o1.up0().size() - o2.up0().size()) * -1; // 降順
						}
					});
				MCServerThreadManager.invokeAndWait(operationList, FXBAL_BatchLogManager.class);
			}
		}

		protected void countUpd03Results(List<MSLAL_InspActRecvIfService.InspActRecvIf_Upd03> operationList) {
			for (MSLAL_InspActRecvIfService.InspActRecvIf_Upd03 operation : operationList) {
				_totalNum += operation.down0().total_num().intValue();
				_okNum += operation.down0().ok_num().intValue();
				_errNum += operation.down0().err_num().intValue();
				_skipNum += operation.down0().skip_num().intValue();
			}
		}

		protected void handleEx(Exception ex) {
			MCException mcex;

			if (ex instanceof MCException) {
				mcex = (MCException) ex;
			}
			else {
				mcex = new MCException(ex);
			}

			logger().writeProcessLog(mcex);
			_exceptionFlg = true;

			throw mcex;
		}

		protected void writeEndLog() {
			if (_errNum > 0 || _exceptionFlg) {
				logger().writeProcessLog(MAUDL0009);
				MCMessagePool.add(MAUDL0009);
				pushErrorLog(logger());
			}
			else if (_totalNum == 0) {
				logger().writeProcessLog(MAUDL0008);
				MCMessagePool.add(MAUDL0008);
			}
			logger().writeEndLog(MSLAL1002, _totalNum, _okNum, _errNum, _skipNum);
			pushEndLog(logger());

			// Loggerを新規作成した場合（呼出元からLoggerを引き継がない場合）のみクローズ
			if (_crtNewLogger) {
				logger().close();
			}
		}
	}
	/**
	 * InspActRecvIf_Upd03オペレーション.<p>
	 *
	 * 検査実績受信ＩＦ取込を行う。（マルチスレッド実行用）<br>
	 */
	public class InspActRecvIf_Upd03 extends MSLAL_InspActRecvIfService_MC_A.InspActRecvIf_Upd03 {
		protected FXBAL_BatchLogger _logger = null;

		protected int _no = 0;

		protected int _loopCnt = MCConst.app.getInteger("MS.MSLAL6420.loopsize", 100);

		protected MSLAL_InspActRecvIfService.InspActRecvIf_Upd04 _ope = MSLAL_InspActRecvIfService.crtInspActRecvIf_Upd04();

		protected int _totalNum = 0;
		protected int _okNum = 0;
		protected int _errNum = 0;
		protected int _skipNum = 0;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				initProc();
				exe();
				setDown();
			}
			finally {
				closeLogger();
			}
		}

		protected void initProc() {
			if (MCServerThreadManager.isUseMainDBTran()) {
				_logger = logger();
			}
			else {
				_logger = logger().clone();
			}
		}

		protected void exe() {
			int cnt = 0;

			MCList<MST_INSP_ACT_RECV_IF_R> tgtL = MCList.create(MST_INSP_ACT_RECV_IF_R.class);
			MST_INSP_ACT_RECV_IF_R oldR = MST_INSP_ACT_RECV_IF_R.create();

			for (InspActRecvIf_Upd03_DtlR dtlR : up0()) {
				MST_INSP_ACT_RECV_IF_R keyR = dtlR.insp_if();
				if (isNextData(oldR, keyR)) {
					if (!tgtL.isEmpty() && _loopCnt <= cnt) {
						crtInspActRecvIfWk(tgtL);
						callInspActRecvIfUpd04(lockInspActRecvIf());
						delInspActRecvIfWk(tgtL);
						cnt = 0;
						tgtL.clear();
					}
				}
				oldR = keyR;
				cnt++;
				tgtL.add(keyR);
			}

			if (!tgtL.isEmpty()) {
				crtInspActRecvIfWk(tgtL);
				callInspActRecvIfUpd04(lockInspActRecvIf());
				delInspActRecvIfWk(tgtL);
			}
		}
		
		/**
		 * 引数の2つの行を比較し、処理対象となる次のデータかどうかを判定する。
		 * 外部システムデータＮＯと検査ＮＯが異なる場合に次のデータと判定し、trueを返す。
		 * それ以外の場合はfalseを返す。
		 */
		protected boolean isNextData(MST_INSP_ACT_RECV_IF_R r, MST_INSP_ACT_RECV_IF_R nextR) {
			return !(isSame(r.ext_data_no(), nextR.ext_data_no())
					&& isSame(r.insp_no(), nextR.insp_no()));
		}

		protected void callInspActRecvIfUpd04(MCList<MST_INSP_ACT_RECV_IF_R> exeL) {
			Set<List<String>> afterExtDataSet = srchAfterExtData(exeL);
			MCList<MST_INSP_ACT_RECV_IF_R> skipL = MCList.create(MST_INSP_ACT_RECV_IF_R.class);
			
			crtUpd04Up(exeL, afterExtDataSet, skipL, _ope);

			if (!_ope.up0().isEmpty()) {
				_ope.exec();
			}

			mergeExeRslt(skipL);

			afterCall(exeL);
		}
		
		protected void crtUpd04Up(MCList<MST_INSP_ACT_RECV_IF_R> recvIfL,Set<List<String>> afterExtDataSet,
				MCList<MST_INSP_ACT_RECV_IF_R> skipL, MSLAL_InspActRecvIfService.InspActRecvIf_Upd04 ope) {
			_ope.up0().clear();
			InspActRecvIf_Chk01_DtlR upR = null;
			
			for (MST_INSP_ACT_RECV_IF_R recvIfR : recvIfL) {
				// 同じ検査ＮＯで既にエラーが発生している場合、それより外部システムデータＮＯが大きいデータはスキップし処理しない
				if (isPrevErr(recvIfR)) {
					setErrSts(recvIfR);
					MCMessagePool.add(recvIfR, null, MSLAL1016, recvIfR.data_no(),
							recvIfR.data_lno(), recvIfR.insp_no());
					skipL.add(recvIfR);
				}
				// 同じ検査ＮＯで、外部システムデータＮＯが大きいデータを既に処理している場合はスキップ
				else if (isOkSkip(recvIfR, afterExtDataSet)) {
					setSkipSts(recvIfR);
					MCMessagePool.add(recvIfR, null, MSLAL1017, recvIfR.data_no(),
							recvIfR.data_lno(), recvIfR.insp_no());
					skipL.add(recvIfR);
				}
				else {
					upR = InspActRecvIf_Chk01_DtlR.create();
					upR.insp_if(recvIfR);
					upR.setParamIndex(recvIfR.getParamIndex());
					upR.setParamRowIndex(recvIfR.getParamRowIndex());
					ope.up0().add(upR);
				}
			}
		}

		/**
		 * 処理しなかったデータからダミーの下り電文を作成する
		 */
		protected void mergeExeRslt(MCList<MST_INSP_ACT_RECV_IF_R> skipL) {
			for (MST_INSP_ACT_RECV_IF_R skipR : skipL) {
				InspActRecvIf_Chk01_DtlR r = _ope.down0().createRow();
				r.insp_if(skipR);
				_ope.down0().add(r);
			}
		}

		/**
		 * 同一キーで取込対象より新しいかつ処理済みのデータを取得する。
		 * @param exeL 取込対象リスト
		 * @return 処理済みデータリスト
		 */
		protected Set<List<String>> srchAfterExtData(MCList<MST_INSP_ACT_RECV_IF_R> exeL) {
			MCList<MST_INSP_ACT_RECV_IF_R> afterL = MCList.create(MST_INSP_ACT_RECV_IF_R.class);
			MST_INSP_ACT_RECV_IF_R inspActRecvIf = MST_INSP_ACT_RECV_IF_R.create("INSPACTRECVIF");
			MST_INSP_ACT_RECV_IF_R subInspActRecvIf = MST_INSP_ACT_RECV_IF_R.create("SUBINSPACTRECVIF");
			MCQueryApiBuilder afterL_bldr = MCQueryApiBuilder.create(inspActRecvIf);

			afterL_bldr.setSelect(inspActRecvIf.insp_no);

			afterL_bldr.addConstWhereWithAnd(exists(subQuery().select(value("X"))
					.from(subInspActRecvIf)
					.where(inspActRecvIf.ext_data_no.lt(subInspActRecvIf.ext_data_no)
							.and(inspActRecvIf.insp_no.eq(subInspActRecvIf.insp_no))
							.and(subInspActRecvIf.exe_sts_typ.in(value(MAC_EXE_STS_TYP.OK.value()),
									value(MAC_EXE_STS_TYP.SKP.value()))))));
			dbSelectColumn("MSLAL6420_MST_INSP_ACT_RECV_IF_S03", afterL, afterL_bldr, exeL,
					MST_INSP_ACT_RECV_IF_R.$data_lno);

			Set<List<String>> set = new HashSet<List<String>>();
			for (MST_INSP_ACT_RECV_IF_R afterR : afterL) {
				List<String> list = createErrSetKey(afterR);
				if (!set.contains(list)) {
					set.add(list);
				}
			}
			return set;
		}

		protected void crtInspActRecvIfWk(MCList<MST_INSP_ACT_RECV_IF_R> inspActRecvIfL) {
			MCQueryApiBuilder inspActRecvIfL_bldr = MCQueryApiBuilder
					.create(MST_INSP_ACT_RECV_IF_R.create("INSPACTRECVIF_WK"));
			dbWkDelete("MSLAL6420_MSW_INSP_ACT_RECV_IF_D01", inspActRecvIfL_bldr.getBaseDbc());
			dbWkInsert("MSLAL6420_MSW_INSP_ACT_RECV_IF_I01", inspActRecvIfL,
					inspActRecvIfL_bldr.getBaseDbc());
		}
		
		protected MCList<MST_INSP_ACT_RECV_IF_R> lockInspActRecvIf() {
			MCList<MST_INSP_ACT_RECV_IF_R> resultL = MCList.create(MST_INSP_ACT_RECV_IF_R.class);
			MST_INSP_ACT_RECV_IF_R inspActRecvIf = MST_INSP_ACT_RECV_IF_R.create("INSPACTRECVIF");
			MCQueryApiBuilder inspActRecbIf_bldr = MCQueryApiBuilder.create(inspActRecvIf);
			MSW_INSP_ACT_RECV_IF_KEY_R inspActRecvIfWk = MSW_INSP_ACT_RECV_IF_KEY_R.create("INSPACTRECVIF_WK");
			PFT_SDRV_IF_R sdrv = PFT_SDRV_IF_R.create("SDRV");

			inspActRecbIf_bldr.addInnerJoin(inspActRecvIfWk, inspActRecvIf.data_lno.eq(inspActRecvIfWk.data_lno));
			inspActRecbIf_bldr.addLeftOuterJoin(sdrv, inspActRecvIf.data_no.eq(sdrv.data_no));
			inspActRecbIf_bldr.setWhere(value(0).eq(value(0)));
			inspActRecbIf_bldr.addWhereWithAnd(inspActRecvIf.imp_flg.eq(value(true)));
			inspActRecbIf_bldr.addWhereWithAnd(bracket(sdrv.sdrv_sts_typ.isNull().or(
					sdrv.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.RECV_CONV_OK.value())))));
			inspActRecbIf_bldr.addOrderByAsc(inspActRecvIf.data_lno);
			inspActRecbIf_bldr.setLockTable(inspActRecvIf.data_lno);

			dbSelectForUpdate("MSLAL6420_MST_INSP_ACT_RECV_IF_S04", resultL, inspActRecbIf_bldr);

			for (MST_INSP_ACT_RECV_IF_R resultR : resultL) {
				// log_sub_key1にスレッド間でユニークな値を設定
				resultR.setParamIndex(_no);
			}
			_logger.setLogKey(resultL, MST_INSP_ACT_RECV_IF_R.$batch_log_no,
					MST_INSP_ACT_RECV_IF_R.$log_sub_key1, MST_INSP_ACT_RECV_IF_R.$log_sub_key2);
			return resultL;
		}

		protected void afterCall(MCList<MST_INSP_ACT_RECV_IF_R> exeL) {
			rsltCnt(exeL);
			updIf(exeL);
			
			MCMessageList msgList = MCMessagePool.getMessageList();
			_logger.writeDataLog(msgList);
			dbTran().commit();
			msgList.clear();
		}

		/**
		 * 処理結果を集計する。
		 */
		protected void rsltCnt(MCList<MST_INSP_ACT_RECV_IF_R> exeL) {
			MCIndexKey idxkey = _ope.down0().createIndex(InspActRecvIf_Chk01_DtlR.$data_lno);

			for (MST_INSP_ACT_RECV_IF_R exeR : exeL) {
				InspActRecvIf_Chk01_DtlR exeRslt = _ope.down0().getFirst(idxkey,
						exeR.data_lno());

				if (MAC_EXE_STS_TYP.isOK(exeRslt.exe_sts_typ())) {
					exeR.imp_flg(false);
					exeR.exe_sts_typ(MAC_EXE_STS_TYP.OK.value());
					_okNum++;
					_totalNum++;
				}
				else if (MAC_EXE_STS_TYP.isERR(exeRslt.exe_sts_typ())) {
					exeR.imp_flg(true);
					exeR.exe_sts_typ(MAC_EXE_STS_TYP.ERR.value());
					_errNum++;
					_totalNum++;
				}
				else if (MAC_EXE_STS_TYP.isSKP(exeRslt.exe_sts_typ())) {
					exeR.imp_flg(false);
					exeR.exe_sts_typ(MAC_EXE_STS_TYP.SKP.value());
					_skipNum++;
					_totalNum++;
				}
			}
		}

		protected void updIf(MCList<MST_INSP_ACT_RECV_IF_R> exeL) {
			MST_INSP_ACT_RECV_IF_R inspActRecvIf = MST_INSP_ACT_RECV_IF_R.create("INSPACTIF");
			MCQueryApiBuilder inspActRecvIf_bldr = MCQueryApiBuilder.create(inspActRecvIf);
			inspActRecvIf_bldr.setSet(
					inspActRecvIf.imp_flg, 
					inspActRecvIf.exe_sts_typ, 
					inspActRecvIf.batch_log_no, 
					inspActRecvIf.log_sub_key1,
					inspActRecvIf.log_sub_key2
					);
			dbUpdateKey("MSLAL6420_MST_INSP_ACT_RECV_IF_U01", exeL, inspActRecvIf_bldr);
		}

		/**
		 * 同一キーで新しいデータが既に処理済みかどうか。
		 * 
		 * @param exeR 取込対象行
		 * @return 処理済みの場合はtrue
		 */
		protected boolean isOkSkip(MST_INSP_ACT_RECV_IF_R exeR,
				Set<List<String>> afterExtDataSet) {
			return afterExtDataSet.contains(createErrSetKey(exeR));
		}

		protected void setSkipSts(MST_INSP_ACT_RECV_IF_R exeR) {
			exeR.exe_sts_typ(MAC_EXE_STS_TYP.SKP.value());
		}

		protected void delInspActRecvIfWk(MCList<MST_INSP_ACT_RECV_IF_R> inspActRecvIfL) {
			MCQueryApiBuilder inspActRecvIfL_bldr = MCQueryApiBuilder
					.create(MST_INSP_ACT_RECV_IF_R.create("INSPACTRECVIF"));
			dbWkDelete("MSLAL6420_MSW_INSP_ACT_RECV_IF_D02", inspActRecvIfL_bldr.getBaseDbc());
		}

		protected void setDown() {
			down0().total_num(_totalNum);
			down0().ok_num(_okNum);
			down0().err_num(_errNum);
			down0().skip_num(_skipNum);
		}

		protected void closeLogger() {
			if (!MCServerThreadManager.isUseMainDBTran()) {
				if (_logger != null) {
					_logger.close();
				}
			}
		}
	}
	/**
	 * InspActRecvIf_Upd04オペレーション.<p>
	 *
	 * 検査実績受信ＩＦ取込を行う。<br>
	 */
	public class InspActRecvIf_Upd04 extends MSLAL_InspActRecvIfService_MC_A.InspActRecvIf_Upd04 {
		/** 検査実績受信ＩＦ取込チェックオペレーション **/
		protected MSLAL_InspActRecvIfService.InspActRecvIf_Chk01 _inspActRecvIfChk01 = null;
		/** 検査実績の登録・訂正オペレーション **/
		protected MSBFL_InspActRcptIFService.InspActIF_Upd01 _inspActRcptIfUpd01 = null;
		/** 検査実績の判定オペレーション **/
		protected MSBFL_InspActRcptIFService.InspActIF_Upd02 _inspActRcptIfUpd02 = null;
		/** 検査実績の取消オペレーション **/
		protected MSBFL_InspActRcptIFService.InspActIF_Del01 _inspActRcptIfDel01 = null;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			initProc();
			proc();
			setDown();
		}

		protected void initProc() {
			// ＰＧ実行状況区分は一旦すべて未処理に設定してから本処理の結果に応じてエラーや処理済に変更する
			up0().setString(InspActRecvIf_Chk01_DtlR.$exe_sts_typ,
					MAC_EXE_STS_TYP.NOT_EXE.value());
			up0().sort(getGrpKey());
			setPegNo(up0());
			
			initMasterCache(up0());
			
		}

		protected void proc() {
			MCSavepoint sp = null;
			MCMessageList msgList = new MCMessageList();
			msgList.addAll(MCMessagePool.getMessageList());
			MCMessagePool.clear();
			
			MCList<InspActRecvIf_Chk01_DtlR>[] grpLArr = getGrp();

			for (MCList<InspActRecvIf_Chk01_DtlR> inspActRecvIfL : grpLArr) {
				inspActRecvIfL = inspActRecvIfL.subList(r -> !isExeStsTypErr(r.insp_if()));
				if (inspActRecvIfL.size() == 0) {
					continue;
				}
				msgList.addAll(MCMessagePool.getMessageList());
				MCMessagePool.clear();
				
				try {
					initTranCache(inspActRecvIfL.innerRowList(InspActRecvIf_Chk01_DtlR.$insp_if, MST_INSP_ACT_RECV_IF_R.class));
					
					MCList<InspActRecvIf_Chk01_DtlR> _noErrL = null;
					callInspActRecvIfChk01(inspActRecvIfL);
					applyErrToGroup(inspActRecvIfL);
					skipOnPreviousError(inspActRecvIfL);
					_noErrL = inspActRecvIfL.subList(r -> !isErr(r.insp_if()));

					if (_noErrL.size() == 0) {
						continue;
					}
					msgList.addAll(MCMessagePool.getMessageList());
					MCMessagePool.clear();
					
					if (!isNull(_noErrL)) {
						sp = dbTran().setSavepoint();
						callInspActRcptIfService(inspActRecvIfL);
					}
				}
				catch (Exception ex) {
					handleEx(ex, sp, inspActRecvIfL);
				}
				finally {
					msgList.addAll(MCMessagePool.getMessageList());
					MCMessagePool.clear();
					sp = null;
				}
				setExeStsTypOK(inspActRecvIfL);
			}
			MCMessagePool.clear();
			MCMessagePool.addAll(msgList);
		}

		/**
		 * 同じ検査ＮＯにエラーが存在するかどうかチェックする。<br>
		 * 一部でもエラーがあった場合、全てエラーとする。
		 */
		protected void applyErrToGroup(MCList<InspActRecvIf_Chk01_DtlR> inspActRecvIfL) {
			Set<String> errInspNo = new HashSet<>();
			
			for (InspActRecvIf_Chk01_DtlR dtlR : inspActRecvIfL) {
				if (dtlR.err_flg()) {
					errInspNo.add(dtlR.insp_no());
				}
			}

			for (InspActRecvIf_Chk01_DtlR inspActRecvIfR : inspActRecvIfL) {
				if (!errInspNo.contains(inspActRecvIfR.insp_no())) {
					continue;
				}
				
				// 検査実績受信ＩＦサービスのチェック処理で発生したエラーを検査実績受信ＩＦリストに反映させる
				if (!inspActRecvIfR.err_flg()) {
					MCMessagePool.add(inspActRecvIfR, null, MSLAL1031, inspActRecvIfR.data_no(),
					inspActRecvIfR.data_lno(), inspActRecvIfR.insp_no());
					inspActRecvIfR.err_flg(true);
				}
				setErrSts(inspActRecvIfR);
			}
		}
		
		/**
		 * 同じ検査ＮＯで既にエラーが発生している場合、それより外部システムデータＮＯが大きいデータはスキップし処理しない
		 */
		protected void skipOnPreviousError(MCList<InspActRecvIf_Chk01_DtlR> inspActRecvIfL) {
			MCList<InspActRecvIf_Chk01_DtlR> noErrL = inspActRecvIfL.subList(r -> !isErr(r.insp_if()));
			
			for(InspActRecvIf_Chk01_DtlR noErrR : noErrL) {
					if (isPrevErr(noErrR)) {
					setErrSts(noErrR);
					MCMessagePool.add(noErrR, null, MSLAL1016, noErrR.data_no(),
							noErrR.data_lno(), noErrR.insp_no());
				}
			}
			
		}

		/**
		 * 取込単位で検査実績受信ＩＦ情報をグループ化する。
		 * @return 取込単位のグループ
		 */
		@SuppressWarnings("unchecked") // 総称配列の警告回避
		protected MCList<InspActRecvIf_Chk01_DtlR>[] getGrp() {
			List<MCList<InspActRecvIf_Chk01_DtlR>> arr = new ArrayList<>();
			InspActRecvIf_Chk01_DtlR row = null;
			MCList<InspActRecvIf_Chk01_DtlR> list = null;
			
			for (InspActRecvIf_Chk01_DtlR r : up0()) {
				if (isNull(row) || !r.equalColumns(row, getGrpKey())) {
					list = MCList.create(InspActRecvIf_Chk01_DtlR.class);
					arr.add(list);
				}
				list.add(r);
				row = r;
			}
			return arr.toArray(new MCList[arr.size()]);
		}

		protected void setExeStsTypOK(MCList<InspActRecvIf_Chk01_DtlR> list) {
			for (InspActRecvIf_Chk01_DtlR row : list) {
				if (!MAC_EXE_STS_TYP.isERR(row.exe_sts_typ())) {
					row.exe_sts_typ(MAC_EXE_STS_TYP.OK.value());
				}
			}
		}

		protected boolean isNewDtlOnly(MCList<InspActRecvIf_Chk01_DtlR> l) {
			for (InspActRecvIf_Chk01_DtlR r : l) {
				if (!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					return false;
				}
			}
			return true;
		}
		
		protected void callInspActRecvIfChk01(MCList<InspActRecvIf_Chk01_DtlR> chkL) {
			_inspActRecvIfChk01 = MSLAL_InspActRecvIfService.crtInspActRecvIf_Chk01();
			createInspActRecvIfChk01Up(chkL);
			_inspActRecvIfChk01.exec();
		}
		
		protected void createInspActRecvIfChk01Up(MCList<InspActRecvIf_Chk01_DtlR> chkL) {
			_inspActRecvIfChk01.up0().setAll(chkL);
		}
		
		/**
		 * MSBFL5070 検査実績受信ＩＦサービスを実行する。
		 */
		protected void callInspActRcptIfService(MCList<InspActRecvIf_Chk01_DtlR> notErrL) {
			if (notErrL.isEmpty()) {
				return;
			}
			
			// 登録・更新用リスト
			MCList<InspActRecvIf_Chk01_DtlR> upd01L = MCList.create(InspActRecvIf_Chk01_DtlR.class);
			// 判定登録用リスト
			MCList<InspActRecvIf_Chk01_DtlR> upd02L = MCList.create(InspActRecvIf_Chk01_DtlR.class);
			// 取消・判定取消用リスト
			MCList<InspActRecvIf_Chk01_DtlR> del01L = MCList.create(InspActRecvIf_Chk01_DtlR.class);

			for (InspActRecvIf_Chk01_DtlR notErrR : notErrL) {
				crtOperationList(notErrR, upd01L, upd02L, del01L);
			}
			
			if (!upd01L.isEmpty()) {
				execInspActRcptIfUpd01(upd01L);
			}
			
			if (!upd02L.isEmpty()) {
				execInspActRcptIfUpd02(upd02L);
			}
			
			if (!del01L.isEmpty()) {
				execInspActRcptIfDel01(del01L);
			}
		}
		
		/**
		 * 検査実績受信ＩＦのデータ更新区分に応じて、各オペレーション用リストを作成する
		 * @param notErrR 検査実績受信ＩＦ
		 * @param upd01L 登録・更新用リスト
		 * @param upd02L 判定登録用リスト
		 * @param del01L 取消・判定取消用リスト
		 */
		protected void crtOperationList(InspActRecvIf_Chk01_DtlR notErrR,MCList<InspActRecvIf_Chk01_DtlR> upd01L,
				MCList<InspActRecvIf_Chk01_DtlR> upd02L,MCList<InspActRecvIf_Chk01_DtlR> del01L) {
			if (MAC_DATA_CRUD_TYP.isCRT(notErrR.data_crud_typ())) {
				crtOperationListCreate(notErrR, upd01L, upd02L);
				return;
			}
			
			if (MAC_DATA_CRUD_TYP.isUPD(notErrR.data_crud_typ())) {
				crtOperationListUpdate(notErrR, upd01L, upd02L);
				return;
			}
			
			if (MAC_DATA_CRUD_TYP.isDEL(notErrR.data_crud_typ())) {
				crtOperationListDelete(notErrR, upd01L, del01L);
				return;
			}
		}
		
		protected void crtOperationListCreate(InspActRecvIf_Chk01_DtlR notErrR, MCList<InspActRecvIf_Chk01_DtlR> upd01L, MCList<InspActRecvIf_Chk01_DtlR> upd02L) {
			upd01L.add(notErrR);
			if (isJudgmentRequired(notErrR)) {
				upd02L.add(notErrR);
			}
		}
		
		protected void crtOperationListUpdate(InspActRecvIf_Chk01_DtlR notErrR, MCList<InspActRecvIf_Chk01_DtlR> upd01L, MCList<InspActRecvIf_Chk01_DtlR> upd02L) {
			if (notErrR.imp_only_judg()) {
				upd02L.add(notErrR);
				return;
			}
			
			upd01L.add(notErrR);
			if (isJudgmentRequired(notErrR)) {
				upd02L.add(notErrR);
			}
		}
		
		protected void crtOperationListDelete(InspActRecvIf_Chk01_DtlR notErrR, MCList<InspActRecvIf_Chk01_DtlR> upd01L,
				MCList<InspActRecvIf_Chk01_DtlR> del01L) {
			if (isHeaderOnly(notErrR) || isJudgmentRequired(notErrR)) {
				del01L.add(notErrR);
			}
			else {
				// 明細のみの削除は、更新オペレーションを利用する
				upd01L.add(notErrR);
			}
		}
		
		protected void execInspActRcptIfUpd01(MCList<InspActRecvIf_Chk01_DtlR> upd01L) {
			_inspActRcptIfUpd01 = MSBFL_InspActRcptIFService.crtInspActIF_Upd01();
			crtInspActRcptIfUpd01Up(upd01L);
			_inspActRcptIfUpd01.exec();
		}
		
		protected void execInspActRcptIfUpd02(MCList<InspActRecvIf_Chk01_DtlR> upd02L) {
			if (isJudgable(upd02L, fetchInspInstAfterUpd01(upd02L))) {
				_inspActRcptIfUpd02 = MSBFL_InspActRcptIFService.crtInspActIF_Upd02();
				crtInspActRcptIfUpd02Up(upd02L, fetchInspActAfterUpd01(upd02L), fetchInspActDAfterUpd01(upd02L));
				_inspActRcptIfUpd02.exec();
			};
		}
		
		protected MCList<MST_INSP_ACT_R> fetchInspActAfterUpd01(MCList<InspActRecvIf_Chk01_DtlR> upd02L) {
			MCList<MST_INSP_ACT_R> inspActL = MCList.create(MST_INSP_ACT_R.class);
			MST_INSP_ACT_R inspAct = MST_INSP_ACT_R.create("INSPACT");
			MCQueryApiBuilder inspActL_bldr = MCQueryApiBuilder.create(inspAct);
			inspActL_bldr.setSelect(inspAct.ext_insp_act_no);
			inspActL_bldr.addSelect(inspAct.insp_act_no);
			inspActL_bldr.setWhere(inspAct.ext_insp_act_no.eq(bind("ext_insp_act_no")));

			dbSelect("MSLAL6420_MST_INSP_ACT_S02", inspActL, inspActL_bldr, upd02L);
			
			return inspActL;
		}
		
		protected MCList<MST_INSP_ACT_D_R> fetchInspActDAfterUpd01(MCList<InspActRecvIf_Chk01_DtlR> upd02L) {
			MCList<MST_INSP_ACT_D_R> inspActDL = MCList.create(MST_INSP_ACT_D_R.class);
			MST_INSP_ACT_R inspAct = MST_INSP_ACT_R.create("INSPACT");
			MST_INSP_ACT_D_R inspActD = MST_INSP_ACT_D_R.create("INSPACTD");
			MCQueryApiBuilder inspActDL_bldr = MCQueryApiBuilder.create(inspActD);
			inspActDL_bldr.setSelect(inspActD.ext_insp_act_d_no);
			inspActDL_bldr.addSelect(inspActD.insp_act_no);
			inspActDL_bldr.addSelect(inspActD.insp_act_d_no);
			inspActDL_bldr.addSelect(inspAct.ext_insp_act_no);
			inspActDL_bldr.addInnerJoin(inspAct, inspActD.insp_act_no.eq(inspAct.insp_act_no));
			inspActDL_bldr.setWhere(inspAct.ext_insp_act_no.eq(bind("ext_insp_act_no")));

			dbSelect("MSLAL6420_MST_INSP_ACT_D_S02", inspActDL, inspActDL_bldr, upd02L);
			
			return inspActDL;
		}
		
		protected MCList<MST_INSP_INST_R> fetchInspInstAfterUpd01(MCList<InspActRecvIf_Chk01_DtlR> upd02L) {
			MCList<MST_INSP_INST_R> inspInstL = MCList.create(MST_INSP_INST_R.class);
			MST_INSP_INST_R inspInst = MST_INSP_INST_R.create("INSPINST");
			MCQueryApiBuilder inspInstL_bldr = MCQueryApiBuilder.create(inspInst);
			inspInstL_bldr.setSelect(inspInst.insp_no);
			inspInstL_bldr.addSelect(inspInst.insp_sts_typ);
			inspInstL_bldr.setWhere(inspInst.insp_no.eq(bind("insp_no")));

			dbSelect("MSLAL6420_MST_INSP_INST_S02", inspInstL, inspInstL_bldr, upd02L);
			
			return inspInstL;
		}
		
		/**
		 * 判定登録が可能かどうかを判定します。判定登録不可の場合、例外をスローします。
		 */
		protected boolean isJudgable(MCList<InspActRecvIf_Chk01_DtlR> upd02L, MCList<MST_INSP_INST_R> inspInstL) {
			MCIndexKey inspInstIdx = inspInstL.createIndex(MST_INSP_INST_R.$insp_no);
			
			for (InspActRecvIf_Chk01_DtlR upd02R : upd02L) {
				String inspStsTyp = inspInstL.getFirst(inspInstIdx, upd02R.insp_no()).insp_sts_typ();
				if (!MSC_INSP_STS_TYP.isJDG(inspStsTyp)) {
					// 判定登録不可の場合、例外を発生させて、同一取込単位の処理をロールバックする
					throw new MCAppException(new MCMessage(upd02R, null, MSLAL1018, upd02R.data_no(),upd02R.data_lno(),upd02R.insp_no()));
				}
			}
			
			return true;
		}
		
		protected void execInspActRcptIfDel01(MCList<InspActRecvIf_Chk01_DtlR> del01L) {
			MCList<InspActRecvIf_Chk01_DtlR> del01LRedo = MCList.create(InspActRecvIf_Chk01_DtlR.class);
			MCList<InspActRecvIf_Chk01_DtlR> upd01L = MCList.create(InspActRecvIf_Chk01_DtlR.class);
			splitDel01RedoAndUpd01TargetList(del01L, del01LRedo, upd01L);
			
			// 初回実行
			execInspActRcptIfDel01First(del01L);
			
			// 再実行
			if (!del01LRedo.isEmpty()) {
				execInspActRcptIfDel01Redo(del01LRedo);
			}
			
			// 明細削除実行
			if (!upd01L.isEmpty()) {
				execInspActRcptIfUpd01(upd01L);
			}
		}

		/**
		 * 判定取消と実績取消で、２回オペレーションの実行が必要なリストを作成する。
		 * 判定取消と検査実績ヘッダ取消の場合、Del01の実行後、再度Del01を実行する。
		 * 判定取消と検査実績（抜取）明細削除の場合、Del01の実行後、Upd01を実行する。
		 */
		protected void splitDel01RedoAndUpd01TargetList(MCList<InspActRecvIf_Chk01_DtlR> del01L,
				MCList<InspActRecvIf_Chk01_DtlR> del01RedoL, MCList<InspActRecvIf_Chk01_DtlR> upd01L) {
			for (InspActRecvIf_Chk01_DtlR del01R : del01L) {
				MST_INSP_ACT_R inspActR = getInspActRCache(del01R.ext_insp_act_no());
				if (del01R.imp_only_judg() || isNull(del01R.judg_rsn()) || isNull(inspActR.insp_judg_rslt_typ())) {
					continue;
				}
				if (isHeaderOnly(del01R)) {
					del01RedoL.add(del01R);
				}
				else {
					upd01L.add(del01R);
				}
			}
		}
		
		protected void execInspActRcptIfDel01First(MCList<InspActRecvIf_Chk01_DtlR> del01L) {
			_inspActRcptIfDel01 = MSBFL_InspActRcptIFService.crtInspActIF_Del01();
			crtInspActRcptIfDel01UpFirst(del01L);
			_inspActRcptIfDel01.exec();
		}
		
		protected void execInspActRcptIfDel01Redo(MCList<InspActRecvIf_Chk01_DtlR> del01LRedo) {
			_inspActRcptIfDel01 = MSBFL_InspActRcptIFService.crtInspActIF_Del01();
			crtInspActRcptIfDel01UpRedo(del01LRedo);
			_inspActRcptIfDel01.exec();
		}
		
		protected void crtInspActRcptIfUpd01Up(MCList<InspActRecvIf_Chk01_DtlR> upd01L) {
			_inspActRcptIfUpd01.up0().if_upd_typ(MAC_IF_UPD_TYP.SKIP_ERROR.value());
			_inspActRcptIfUpd01.up0().upd_cntr_chk_flg(false);
			
			crtInspActRcptIfUpd01Up1(upd01L);
			crtInspActRcptIfUpd01Up2(upd01L);
			crtInspActRcptIfUpd01Up3(upd01L);
		}
		
		protected void crtInspActRcptIfUpd01Up1(MCList<InspActRecvIf_Chk01_DtlR> up1L) {
			// 同一取込単位のヘッダ情報は共通のため、１件目のＩＦレコードをもとに電文を作成
			InspActRecvIf_Chk01_DtlR up1R = up1L.get(0);
			
			InspActIF_Upd01_HdrR hdrR = InspActIF_Upd01_HdrR.create();

			if (isDetailOnlyIns(up1R) || isDetailOnlyDel(up1R)) {
				// 明細のみの登録・削除の場合、ヘッダ情報は更新しない
				setHdrFromInspAct(hdrR, up1R);
				_inspActRcptIfUpd01.up1().add(hdrR);
				return;
			}

			if (MAC_DATA_CRUD_TYP.isCRT(up1R.data_crud_typ())) {
				setHdrForInsert(hdrR, up1R);
			}
			else if (MAC_DATA_CRUD_TYP.isUPD(up1R.data_crud_typ())) {
				setHdrForUpdate(hdrR, up1R);
			}

			copy(hdrR, up1R, createMap_InspActIF_Upd01_HdrR_InspActRecvIf_Chk01_DtlR());

			_inspActRcptIfUpd01.up1().add(hdrR);

			setPegNo(_inspActRcptIfUpd01.up1());
		}
		
		protected void setHdrForInsert(InspActIF_Upd01_HdrR hdrR, InspActRecvIf_Chk01_DtlR up1R) {
			InspSchd_Srch01_CndR itmInspR = getItmInspRCache(up1R.peg_no());
			MST_INSP_INST_R inspInstR = getInspInstRCache(up1R.insp_no());
			if (!isNull(itmInspR)) {
				if (MSC_INSP_TYP.isLOT(inspInstR.insp_typ())) {
					hdrR.lmt_dt_frm_typ(nvl(itmInspR.lot_insp_lmt_dt_frm_typ(), MAC_LMT_DT_FRM_TYP.INSP_JUDG.value()));
				}
				else {
					hdrR.lmt_dt_frm_typ(itmInspR.lmt_dt_frm_typ());
				}
			}
		}

		protected void setHdrFromInspAct(InspActIF_Upd01_HdrR hdrR, InspActRecvIf_Chk01_DtlR up1R) {
			MST_INSP_ACT_R inspActR = getInspActRCache(up1R.ext_insp_act_no());
			hdrR.insp_act_no(inspActR.insp_act_no());
			hdrR.insp_no(inspActR.insp_no());
		}
		
		protected void setHdrForUpdate(InspActIF_Upd01_HdrR hdrR, InspActRecvIf_Chk01_DtlR up1R) {
			setHdrFromInspAct(hdrR, up1R);
			
			hdrR.st_hm_upd_flg(true);
			hdrR.end_hm_upd_flg(true);
			hdrR.act_usr_cd_upd_flg(true);
			hdrR.act_dpt_cd_upd_flg(true);
			hdrR.intr_rmrks_upd_flg(true);
			hdrR.lot_rmrks_upd_flg(true);
			hdrR.sub_char1_upd_flg(true);
			hdrR.sub_char2_upd_flg(true);
			hdrR.sub_char3_upd_flg(true);
			
			MST_INSP_INST_R inspInstR = getInspInstRCache(up1R.insp_no());
			if (!MAC_INSP_MTD_TYP.isTTL(inspInstR.insp_mtd_typ())) {
				hdrR.quality_typ_upd_flg(true);
				hdrR.gd_cd_upd_flg(true);
				hdrR.dfct_rsn_cd_upd_flg(true);
			}
		}
		
		protected void crtInspActRcptIfUpd01Up2(MCList<InspActRecvIf_Chk01_DtlR> up2L) {
			boolean isSmplSet = false;
			
			for (InspActRecvIf_Chk01_DtlR up2R : up2L) {
				MST_INSP_INST_R inspInstR =  getInspInstRCache(up2R.insp_no());
				
				// 同一取込単位の抜取実績を取り込む場合、検査実績明細が重複しないよう、補完は一度だけ行う
				if (!MAC_INSP_MTD_TYP.isTTL(inspInstR.insp_mtd_typ())) {
					if (!isSmplSet) {
						MCList<MST_STK_R> stkL = fetchStkInfo(up2R);
						setDtlForSmpl(up2R, stkL, inspInstR);
						isSmplSet = true;
					}
				}
				else {
					setDtlForTtl(up2R);
				}
			}
			
			addExistInspActDtlsToUp2(up2L);
			
			setPegNo(_inspActRcptIfUpd01.up2());
		}
		
		protected void setDtlForSmpl(InspActRecvIf_Chk01_DtlR up2R, MCList<MST_STK_R> stkL, MST_INSP_INST_R inspInstR) {
			InspActIF_Upd01_DtlR dtlR = InspActIF_Upd01_DtlR.create();
			
			MCList<MST_INSP_SCHD_R> inspSchdL =  getInspSchdLCache(inspInstR.insp_no());
			
			boolean hasStk = !MSC_INSP_TYP.isPRCD(inspInstR.insp_typ())
					&& !inspInstR.lmt_up_flg()
					&& !inspSchdL.get(0).in_prmt_insp_flg()
					&& !MSC_INSP_STS_TYP.isJDG(inspInstR.insp_sts_typ());
			
			if (hasStk) {
				for (MST_STK_R stkR : stkL) {
					dtlR = InspActIF_Upd01_DtlR.create();
					dtlR.insp_no(up2R.insp_no());
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					dtlR.base_unit_cd(inspInstR.base_unit_cd());
					setDtlFromStk(dtlR, stkR);
					_inspActRcptIfUpd01.up2().add(dtlR);
				}
			}
			
			return;
		}
		
		protected void setDtlForTtl(InspActRecvIf_Chk01_DtlR up2R) {
			InspActIF_Upd01_DtlR dtlR = InspActIF_Upd01_DtlR.create();
			
			if (isHeaderOnly(up2R)){
				return;
			}
			
			if (MAC_DATA_CRUD_TYP.isCRT(up2R.data_crud_typ())) {
				setDtlForCreate(dtlR, up2R);
			}
			else if (MAC_DATA_CRUD_TYP.isUPD(up2R.data_crud_typ())) {
				setDtlForUpdate(dtlR, up2R);
			}
			// 明細削除
			else if (MAC_DATA_CRUD_TYP.isDEL(up2R.data_crud_typ())) {
				setDtlForDelete(dtlR, up2R);
			}
			
			copy(dtlR, up2R, createMap_InspActIF_Upd01_DtlR_InspActRecvIf_Chk01_DtlR());
			
			_inspActRcptIfUpd01.up2().add(dtlR);
			
			return;
		}
		
		protected void setDtlForCreate(InspActIF_Upd01_DtlR dtlR, InspActRecvIf_Chk01_DtlR up2R) {
			MCList<MST_STK_R> targetStkL = getStkLCache(up2R.insp_schd_no());
			setDtlFromStk(dtlR, getStkRFromIfStkInfo(targetStkL, up2R));
		}
		
		protected void setDtlForUpdate(InspActIF_Upd01_DtlR dtlR, InspActRecvIf_Chk01_DtlR up2R) {
			setDtlFromInspAct(dtlR, up2R);
			
			MST_INSP_INST_R inspInstR = getInspInstRCache(up2R.insp_no());
			if (MAC_INSP_MTD_TYP.isTTL(inspInstR.insp_mtd_typ())) {
				dtlR.gd_cd_upd_flg(true);
				dtlR.quality_typ_upd_flg(true);
				if (MAC_QUALITY_TYP.isDFCT_INSP(up2R.ttl_quality_typ())
						|| MAC_QUALITY_TYP.isDFCT_OPER(up2R.ttl_quality_typ())) {
					dtlR.dfct_rsn_cd_upd_flg(true);
				}
				dtlR.base_unit_qty_upd_flg(true);
				dtlR.pack_unit_qty_upd_flg(true);
				dtlR.pack_unit_cd_upd_flg(true);
				dtlR.pack_xfr_pack_unit_qty_upd_flg(true);
				dtlR.pack_xfr_pack_unit_cd_upd_flg(true);
				dtlR.pack_xfr_base_unit_qty_upd_flg(true);
				dtlR.pack_xfr_base_unit_cd_upd_flg(true);
				dtlR.ac_dt_upd_flg(true);
				dtlR.intr_rmrks_upd_flg(true);
			}
		}
		
		protected void setDtlForDelete(InspActIF_Upd01_DtlR dtlR, InspActRecvIf_Chk01_DtlR up2R) {
			setDtlFromInspAct(dtlR, up2R);
		}
		
		protected MCList<MST_STK_R> fetchStkInfo(InspActRecvIf_Chk01_DtlR dtlR) {
			MCList<MST_STK_R> stkL = MCList.create(MST_STK_R.class);
			for (MST_INSP_SCHD_R inspSchdR : getInspSchdLCache(dtlR.insp_no())) {
				stkL.addAll(getStkLCache(inspSchdR.insp_schd_no()));
			}
			return stkL;
		}

		protected void setDtlFromStk(InspActIF_Upd01_DtlR dtlR, MST_STK_R stkR) {
			copy(dtlR, stkR, createMap_InspActIF_Upd01_DtlR_MST_STK_R());
		}

		protected void setDtlFromInspAct(InspActIF_Upd01_DtlR dtlR, InspActRecvIf_Chk01_DtlR up2R) {
			MST_INSP_ACT_D_R inspActDtlR = getInspActDtlRCache(up2R.ext_insp_act_d_no());
			dtlR.insp_act_no(inspActDtlR.insp_act_no());
			dtlR.insp_act_d_no(inspActDtlR.insp_act_d_no());
		}
		
		protected void addExistInspActDtlsToUp2(MCList<InspActRecvIf_Chk01_DtlR> up2L) {
			// 同一取込単位で外部検査実績ＮＯは共通のため、１件目のＩＦレコードの値で補完する
			InspActRecvIf_Chk01_DtlR up2R = up2L.get(0);
			MCList<MST_INSP_ACT_D_R> inspActDtlL = getInspActDtlLCache(up2R.ext_insp_act_no());
			
			Set<String> recvTargetExtInspActDNo = new HashSet<String>();
			for (InspActRecvIf_Chk01_DtlR r : up2L) {
				recvTargetExtInspActDNo.add(r.ext_insp_act_d_no());
			}
			
			for (MST_INSP_ACT_D_R inspActDtlR : inspActDtlL) {
				boolean hasExtInspActDNo = !isNull(inspActDtlR.ext_insp_act_d_no()) && !isNull(up2R.ext_insp_act_d_no());
				boolean isRecvTargetExtInspActDNo = recvTargetExtInspActDNo.contains(inspActDtlR.ext_insp_act_d_no());
				
				if (hasExtInspActDNo && isRecvTargetExtInspActDNo) {
					continue;
				}
				
				InspActIF_Upd01_DtlR dtlR = InspActIF_Upd01_DtlR.create();
				dtlR.insp_no(up2R.insp_no());
				dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				dtlR.insp_act_no(inspActDtlR.insp_act_no());
				dtlR.insp_act_d_no(inspActDtlR.insp_act_d_no());
				_inspActRcptIfUpd01.up2().add(dtlR);
			}
		}
		
		protected void crtInspActRcptIfUpd01Up3(MCList<InspActRecvIf_Chk01_DtlR> up3L) {
			for (InspActRecvIf_Chk01_DtlR up3R : up3L) {
				InspActIF_Upd01_SmplR smplR = InspActIF_Upd01_SmplR.create();
				
				if (MAC_INSP_MTD_TYP.isTTL(getInspInstRCache(up3R.insp_no()).insp_mtd_typ())) {
					continue;
				}
				
				if (isHeaderOnly(up3R)){
					continue;
				}

				if (MAC_DATA_CRUD_TYP.isCRT(up3R.data_crud_typ())) {
					setSmplForCreate(smplR, up3R);
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(up3R.data_crud_typ())){
					setSmplForUpdate(smplR, up3R);
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(up3R.data_crud_typ())) {
					setSmplForDelete(smplR, up3R);
				}

				copy(smplR, up3R, createMap_InspActIF_Upd01_SmplR_InspActRecvIf_Chk01_DtlR());

				_inspActRcptIfUpd01.up3().add(smplR);
			}
			
			addExistInspActDtlsToUp3(up3L);
			
			setPegNo(_inspActRcptIfUpd01.up3());
		}

		protected void setSmplForCreate(InspActIF_Upd01_SmplR smplR, InspActRecvIf_Chk01_DtlR smplActDtlR) {
			MST_INSP_SCHD_R inspSchdR = getInspSchdRCache(smplActDtlR.insp_schd_no());
			
			copy(smplR, inspSchdR, createMap_InspActIF_Upd01_SmplR_MST_INSP_SCHD_R());
			
			editStkInfo(smplR, inspSchdR, smplActDtlR);
			
			// 検査予定ＮＯを設定するのは、検査中ロット使用許可品など、紐づく在庫が存在しない場合のみ
			boolean isExistStk = !getStkLCache(inspSchdR.insp_schd_no()).isEmpty();
			if (isExistStk) {
				smplR.insp_schd_no(null);
			}
		}
		
		protected void editStkInfo(InspActIF_Upd01_SmplR smplR, MST_INSP_SCHD_R schdR, InspActRecvIf_Chk01_DtlR smplActDtlR) {
			if (MSC_INSP_TYP.isACCPT(schdR.insp_typ())) {
				MST_STK_R stkR = getStkLCache(schdR.insp_schd_no()).get(0);
				if (isNull(stkR)) {
					// 現状在庫が存在しない場合は何もしない（検査予定の値がそのまま設定される）
					
					// 入荷実績で仕入同時計上している場合
					MCList<MST_ARR_ACT_R> arrL = fetchArrAct(schdR);
					MCIndexKey arrIdxkey = arrL.createIndex(MST_ARR_ACT_R.$arr_act_no);
					MST_ARR_ACT_R arrR = arrL.getFirst(arrIdxkey, schdR.src_no4());
					if (!isNull(arrR)) {
						smplR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
						smplR.stk_bp_cd(MAC_STR.NULL_VAL.value());
					}
					// 仕入実績登録後に、検査実績を登録していて、抜取実績を後から登録する場合
					MST_INSP_ACT_D_R actDR = getInspActDtlRCache(smplActDtlR.ext_insp_act_d_no());
					if (!isNull(actDR)) {
						smplR.stk_id_typ(actDR.stk_id_typ());
						smplR.stk_bp_cd(actDR.stk_bp_cd());
					}
				}
				else {
					smplR.stk_id_typ(stkR.stk_id_typ());
					smplR.stk_bp_cd(stkR.stk_bp_cd());
					smplR.stk_arrv_bp_cd(stkR.stk_arrv_bp_cd());
				}
				if (schdR.in_prmt_insp_flg()) {
					if (MSC_STK_ID_TYP.isPURC_PRE_ACCPT(schdR.stk_id_typ())) {
						smplR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
						smplR.stk_bp_cd(MAC_STR.NULL_VAL.value());
					}
					smplR.fix_no_typ(MSC_FIX_NO_TYP.NON.value());
					smplR.fix_no(MAC_STR.NULL_VAL.value());
					smplR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
				}
				else {
					smplR.fix_no_typ(MSC_FIX_NO_TYP.ARR_ACT_NO.value());
					smplR.fix_no(schdR.src_no4());
				}
			}
			else if (MSC_INSP_TYP.isPRDCT(schdR.insp_typ())) {
				if (schdR.in_prmt_insp_flg()) {
					smplR.fix_no_typ(MSC_FIX_NO_TYP.NON.value());
					smplR.fix_no(MAC_STR.NULL_VAL.value());
					smplR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
				}
				else {
					smplR.fix_no_typ(MSC_FIX_NO_TYP.YIELD_ACT_NO.value());
					smplR.fix_no(schdR.src_no4());
				}
			}
			else if (MSC_INSP_TYP.isLOT(schdR.insp_typ())) {
				if (getInspInstRCache(smplActDtlR.insp_no()).lmt_up_flg()) {
					smplR.fix_no_typ(MSC_FIX_NO_TYP.NON.value());
					smplR.fix_no(MAC_STR.NULL_VAL.value());
					smplR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
				}
				else {
					smplR.fix_no_typ(MSC_FIX_NO_TYP.INSP_SCHD_NO.value());
					smplR.fix_no(schdR.insp_schd_no());
				}
			}
		}
		
		protected MCList<MST_ARR_ACT_R> fetchArrAct(MST_INSP_SCHD_R inspSchdR) {
			MCList<MST_ARR_ACT_R> arrActL = MCList.create(MST_ARR_ACT_R.class);
			MST_ARR_ACT_R arrAct = MST_ARR_ACT_R.create("ARRACT");
			MCQueryApiBuilder arrL_bldr = MCQueryApiBuilder.create(arrAct);
			arrL_bldr.setSelect(arrAct.arr_act_no);
			arrL_bldr.setWhere(arrAct.arr_act_no.eq(bind("fix_no")));
			arrL_bldr.addWhereWithAnd(arrAct.sync_flg.eq(value(true)));
			dbSelect("MSLAL6420_MST_ARR_ACT_S01", arrActL, arrL_bldr, inspSchdR);
			return arrActL;
		}

		protected void setSmplFromInspAct(InspActIF_Upd01_SmplR smplR, InspActRecvIf_Chk01_DtlR smplActDtlR) {
			MST_INSP_SMPL_ACT_R inspSmplActR = getInspSmplActRCache(smplActDtlR.ext_insp_smpl_act_no());
			smplR.insp_act_no(inspSmplActR.insp_act_no());
			smplR.insp_smpl_act_no(inspSmplActR.insp_smpl_act_no());
			smplR.insp_schd_no(inspSmplActR.insp_schd_no());
		}
		
		protected void setSmplForUpdate(InspActIF_Upd01_SmplR smplR, InspActRecvIf_Chk01_DtlR up3R) {
			setSmplFromInspAct(smplR, up3R);
			
			smplR.so_qty_upd_flg(true);
			smplR.smpl_qty_upd_flg(true);
			smplR.base_unit_cd_upd_flg(true);
			smplR.pack_xfr_pack_unit_qty_upd_flg(true);
			smplR.pack_xfr_pack_unit_cd_upd_flg(true);
			smplR.pack_xfr_base_unit_qty_upd_flg(true);
			smplR.loc_cd_upd_flg(true);
			smplR.str_ln_cd_upd_flg(true);
			smplR.act_hm_upd_flg(true);
			smplR.ac_dt_upd_flg(true);
			smplR.bd_dpt_cd_upd_flg(true);
			smplR.trd_rmrks_upd_flg(true);
			smplR.intr_rmrks_upd_flg(true);
		}
		
		protected void setSmplForDelete(InspActIF_Upd01_SmplR smplR, InspActRecvIf_Chk01_DtlR up3R) {
			setSmplFromInspAct(smplR, up3R);
		}
		
		protected void addExistInspActDtlsToUp3(MCList<InspActRecvIf_Chk01_DtlR> up3L) {
			// 同一取込単位で外部検査実績ＮＯは共通のため、１件目のＩＦレコードの値で補完する
			InspActRecvIf_Chk01_DtlR up3R = up3L.get(0);
			MCList<MST_INSP_SMPL_ACT_R> inspSmplActL = getInspSmplActLCache(up3R.ext_insp_act_no());
			
			Set<String> recvTargetExtSmplActDNo = new HashSet<String>();
			for (InspActRecvIf_Chk01_DtlR r : up3L) {
				recvTargetExtSmplActDNo.add(r.ext_insp_smpl_act_no());
			}
			
			for(MST_INSP_SMPL_ACT_R inspSmplActR : inspSmplActL) {
				if (recvTargetExtSmplActDNo.contains(inspSmplActR.ext_insp_smpl_act_no())) {
					continue;
				}
				InspActIF_Upd01_SmplR smplR = InspActIF_Upd01_SmplR.create();
				smplR.insp_no(up3R.insp_no());
				smplR.insp_schd_no(inspSmplActR.insp_schd_no());
				smplR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				smplR.insp_act_no(inspSmplActR.insp_act_no());
				smplR.insp_smpl_act_no(inspSmplActR.insp_smpl_act_no());
				_inspActRcptIfUpd01.up3().add(smplR);
			}
		}
		
		protected void crtInspActRcptIfUpd02Up(MCList<InspActRecvIf_Chk01_DtlR> upd02L, MCList<MST_INSP_ACT_R> inspActL, MCList<MST_INSP_ACT_D_R> inspActDL) {
			_inspActRcptIfUpd02.up0().if_upd_typ(MAC_IF_UPD_TYP.SKIP_ERROR.value());
			_inspActRcptIfUpd02.up0().upd_cntr_chk_flg(false);

			// 検査実績ヘッダの設定
			crtInspActRcptIfUpd02Up1(upd02L, inspActL);
			// 検査実績明細の設定
			crtInspActRcptIfUpd02Up2(upd02L, inspActDL);
		}
		
		protected void crtInspActRcptIfUpd02Up1(MCList<InspActRecvIf_Chk01_DtlR> up1L, MCList<MST_INSP_ACT_R> inspActL) {
			// 同一取込単位のヘッダ情報は共通のため、１件目のＩＦレコードをもとに電文を作成する
			InspActRecvIf_Chk01_DtlR up1R = up1L.get(0);
			
			InspActIF_Upd02_HdrR hdrR = InspActIF_Upd02_HdrR.create();
			
			MCIndexKey inspActIdx = inspActL.createIndex(MST_INSP_ACT_R.$ext_insp_act_no);
			MST_INSP_ACT_R inspActR = inspActL.getFirst(inspActIdx, up1R.ext_insp_act_no());
			hdrR.insp_act_no(inspActR.insp_act_no());

			copy(hdrR, up1R, createMap_InspActIF_Upd02_HdrR_InspActRecvIf_Chk01_DtlR());

			_inspActRcptIfUpd02.up1().add(hdrR);
			
			setPegNo(_inspActRcptIfUpd02.up1());
		}
		
		protected void crtInspActRcptIfUpd02Up2(MCList<InspActRecvIf_Chk01_DtlR> up2L, MCList<MST_INSP_ACT_D_R> inspActDL) {
			// 同一取込単位の外部検査実績ＮＯは共通のため、１件目のＩＦレコードをもとに電文を作成する
			InspActRecvIf_Chk01_DtlR up2R = up2L.get(0);
			
			for(MST_INSP_ACT_D_R inspActDtlR : inspActDL) {
				InspActIF_Upd02_DtlR dtlR = InspActIF_Upd02_DtlR.create();
				dtlR.insp_no(up2R.insp_no());
				dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				dtlR.insp_act_no(inspActDtlR.insp_act_no());
				dtlR.insp_act_d_no(inspActDtlR.insp_act_d_no());
				dtlR.ac_dt(up2R.judg_dt());
				_inspActRcptIfUpd02.up2().add(dtlR);
			}
			
			setPegNo(_inspActRcptIfUpd02.up2());
		}
		
		protected void crtInspActRcptIfDel01UpFirst(MCList<InspActRecvIf_Chk01_DtlR> del01L) {
			_inspActRcptIfDel01.up0().if_upd_typ(MAC_IF_UPD_TYP.SKIP_ERROR.value());
			_inspActRcptIfDel01.up0().upd_cntr_chk_flg(false);

			// 検査実績ヘッダの設定
			crtInspActRcptIfDel01Up1First(del01L);
		}
		
		protected void crtInspActRcptIfDel01UpRedo(MCList<InspActRecvIf_Chk01_DtlR> del01L) {
			_inspActRcptIfDel01.up0().if_upd_typ(MAC_IF_UPD_TYP.SKIP_ERROR.value());
			_inspActRcptIfDel01.up0().upd_cntr_chk_flg(false);

			// 検査実績ヘッダの設定
			crtInspActRcptIfDel01Up1Redo(del01L);
		}
		
		protected void crtInspActRcptIfDel01Up1First(MCList<InspActRecvIf_Chk01_DtlR> up1L) {
			// 同一取込単位のヘッダ情報は共通のため、１件目のＩＦレコードをもとに電文を作成する
			InspActRecvIf_Chk01_DtlR up1R = up1L.get(0);
			
			InspActIF_Del01_CndR hdrR = InspActIF_Del01_CndR.create();
				
			MST_INSP_ACT_R inspActR = getInspActRCache(up1R.ext_insp_act_no());
			hdrR.insp_act_no(inspActR.insp_act_no());
			hdrR.insp_judg_rslt_typ(inspActR.insp_judg_rslt_typ());

			MST_INSP_INST_R inspInstR = getInspInstRCache(up1R.insp_no());
			hdrR.insp_sts_typ(inspInstR.insp_sts_typ());
			hdrR.insp_aprv_sts_typ(inspInstR.insp_aprv_sts_typ());
				
			copy(hdrR, up1R, createMap_InspActIF_Del01_CndR_InspActRecvIf_Chk01_DtlR());
				
			_inspActRcptIfDel01.up1().add(hdrR);
			
			setPegNo(_inspActRcptIfDel01.up1());
		}
		
		protected void crtInspActRcptIfDel01Up1Redo(MCList<InspActRecvIf_Chk01_DtlR> up1L) {
			// 同一取込単位のヘッダ情報は共通のため、１件目のＩＦレコードをもとに電文を作成する
			InspActRecvIf_Chk01_DtlR up1R = up1L.get(0);
			
			InspActIF_Del01_CndR hdrR = InspActIF_Del01_CndR.create();
				
			// 判定取消→実績取消で削除オペレーションを再実行する場合、判定取消後の検査情報を再取得する
			MST_INSP_ACT_R afterDelJudgInfoR = fetchAfterDelJudgInfo(up1R);

			hdrR.insp_act_no(afterDelJudgInfoR.insp_act_no());
			hdrR.insp_judg_rslt_typ(afterDelJudgInfoR.insp_judg_rslt_typ());
			hdrR.insp_sts_typ(afterDelJudgInfoR.getStringNE("insp_sts_typ"));
			hdrR.insp_aprv_sts_typ(afterDelJudgInfoR.getStringNE("insp_aprv_sts_typ"));
				
			copy(hdrR, up1R, createMap_InspActIF_Del01_CndR_InspActRecvIf_Chk01_DtlR());
				
			_inspActRcptIfDel01.up1().add(hdrR);
			
			setPegNo(_inspActRcptIfDel01.up1());
		}
		
		protected MST_INSP_ACT_R fetchAfterDelJudgInfo(InspActRecvIf_Chk01_DtlR dtlR) {
			MST_INSP_ACT_R inspActR = getInspActRCache(dtlR.ext_insp_act_no());
			MST_INSP_ACT_R afterDelJudgInfoR = MST_INSP_ACT_R.create();
			MST_INSP_INST_R inspInstR = MST_INSP_INST_R.create("INSPINST");
			MST_INSP_ACT_R inspAct = MST_INSP_ACT_R.create("INSPACT");
			MCQueryApiBuilder inspActL_bldr = MCQueryApiBuilder.create(inspAct);
			inspActL_bldr.setSelect(inspAct.insp_act_no);
			inspActL_bldr.addSelect(inspAct.insp_judg_rslt_typ);
			inspActL_bldr.addSelect(inspInstR.insp_sts_typ);
			inspActL_bldr.addSelect(inspInstR.insp_aprv_sts_typ);
			inspActL_bldr.addInnerJoin(inspInstR, inspInstR.insp_no.eq(inspAct.insp_no));

			dbSelectKey("MSLAL6420_MST_INSP_ACT_S03", afterDelJudgInfoR, inspActL_bldr, inspActR);

			return afterDelJudgInfoR;
		}

		/**
		 * 更新処理例外発生時の後処理を行う。
		 * @param ex 例外
		 * @param sp セーブポイント
		 * @param inspActRecvIfL 検査実績受信ＩＦリスト
		 */
		protected void handleEx(Exception ex, MCSavepoint sp,
				MCList<InspActRecvIf_Chk01_DtlR> inspActRecvIfL) {

			String msgId = null;
			String msg = null;
			MCMessageList causeMsgList = null;
			
			// 呼出先のthrowErr処理で例外が発生した場合、MessagePoolとExceptionのメッセージが二重で表示されるため、クリアする
			MCMessagePool.clear();

			if (ex instanceof MCException) {
				MCException mcex = (MCException) ex;
				msgId = mcex.getID();
				msg = mcex.getMCMessage().toString();
				causeMsgList = mcex.getCauseMessageList();
			}
			else {
				msgId = ex instanceof MCException ? ((MCException) ex).getID() : null;
				msg = ex.toString();
				causeMsgList = new MCMessageList();
			}

			for (InspActRecvIf_Chk01_DtlR opeRow : inspActRecvIfL) {
				MCMessagePool.add(opeRow, null, MSLAL1022, opeRow.data_no(),
						opeRow.data_lno(), msgId, msg);
				for (MCMessage causeMsg : causeMsgList) {
					MCMessage newMsg = new MCMessage(opeRow, null, causeMsg.getID(),
							(Object[]) causeMsg.getBindArray());
					MCMessagePool.add(newMsg);
				}
				setErrSts(opeRow.insp_if());
			}

			if (sp != null) {
				dbTran().rollback(sp);
			}
		}

		protected void setDown() {
			down0().setAll(up0());
		}
		
		protected Map_InspActIF_Upd01_HdrR_MST_INSP_ACT_R<InspActIF_Upd01_HdrR,MST_INSP_ACT_R> createMap_InspActIF_Upd01_HdrR_MST_INSP_ACT_R() {
			return new Map_InspActIF_Upd01_HdrR_MST_INSP_ACT_R<InspActIF_Upd01_HdrR, MST_INSP_ACT_R>();
		}

		public class Map_InspActIF_Upd01_HdrR_MST_INSP_ACT_R<D extends InspActIF_Upd01_HdrR, S extends MST_INSP_ACT_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspActIF_Upd01_HdrR.$insp_no, MST_INSP_ACT_R.$insp_no);
				addColumnPathMap(InspActIF_Upd01_HdrR.$insp_act_no, MST_INSP_ACT_R.$insp_act_no);
				addColumnPathMap(InspActIF_Upd01_HdrR.$insp_freq, MST_INSP_ACT_R.$insp_freq);
				addColumnPathMap(InspActIF_Upd01_HdrR.$src_no1, MST_INSP_ACT_R.$src_no1);
				addColumnPathMap(InspActIF_Upd01_HdrR.$src_no2, MST_INSP_ACT_R.$src_no2);
				addColumnPathMap(InspActIF_Upd01_HdrR.$insp_typ, MST_INSP_ACT_R.$insp_typ);
				addColumnPathMap(InspActIF_Upd01_HdrR.$insp_mtd_typ, MST_INSP_ACT_R.$insp_mtd_typ);
				addColumnPathMap(InspActIF_Upd01_HdrR.$itm_cd, MST_INSP_ACT_R.$itm_cd);
				addColumnPathMap(InspActIF_Upd01_HdrR.$itm_sub1, MST_INSP_ACT_R.$itm_sub1);
				addColumnPathMap(InspActIF_Upd01_HdrR.$itm_sub2, MST_INSP_ACT_R.$itm_sub2);
				addColumnPathMap(InspActIF_Upd01_HdrR.$itm_sub3, MST_INSP_ACT_R.$itm_sub3);
				addColumnPathMap(InspActIF_Upd01_HdrR.$lot_no, MST_INSP_ACT_R.$lot_no);
				addColumnPathMap(InspActIF_Upd01_HdrR.$sublot_no, MST_INSP_ACT_R.$sublot_no);
				addColumnPathMap(InspActIF_Upd01_HdrR.$quality_typ, MST_INSP_ACT_R.$quality_typ);
				addColumnPathMap(InspActIF_Upd01_HdrR.$gd_cd, MST_INSP_ACT_R.$gd_cd);
				addColumnPathMap(InspActIF_Upd01_HdrR.$dfct_rsn_cd, MST_INSP_ACT_R.$dfct_rsn_cd);
				addColumnPathMap(InspActIF_Upd01_HdrR.$sppl_cd, MST_INSP_ACT_R.$sppl_cd);
				addColumnPathMap(InspActIF_Upd01_HdrR.$maker_cd, MST_INSP_ACT_R.$maker_cd);
				addColumnPathMap(InspActIF_Upd01_HdrR.$mfg_loc_cd, MST_INSP_ACT_R.$mfg_loc_cd);
				addColumnPathMap(InspActIF_Upd01_HdrR.$from_site_cd, MST_INSP_ACT_R.$from_site_cd);
				addColumnPathMap(InspActIF_Upd01_HdrR.$base_unit_qty, MST_INSP_ACT_R.$base_unit_qty);
				addColumnPathMap(InspActIF_Upd01_HdrR.$base_unit_cd, MST_INSP_ACT_R.$base_unit_cd);
				addColumnPathMap(InspActIF_Upd01_HdrR.$act_usr_cd, MST_INSP_ACT_R.$act_usr_cd);
				addColumnPathMap(InspActIF_Upd01_HdrR.$act_dpt_cd, MST_INSP_ACT_R.$act_dpt_cd);
				addColumnPathMap(InspActIF_Upd01_HdrR.$lmt_dt_frm_typ, MST_INSP_ACT_R.$lmt_dt_frm_typ);
				addColumnPathMap(InspActIF_Upd01_HdrR.$lmt_dt_frm, MST_INSP_ACT_R.$lmt_dt_frm);
				addColumnPathMap(InspActIF_Upd01_HdrR.$vld_dt, MST_INSP_ACT_R.$vld_dt);
				addColumnPathMap(InspActIF_Upd01_HdrR.$lmt_dt, MST_INSP_ACT_R.$lmt_dt);
				addColumnPathMap(InspActIF_Upd01_HdrR.$intr_rmrks, MST_INSP_ACT_R.$intr_rmrks);
				addColumnPathMap(InspActIF_Upd01_HdrR.$sub_char1, MST_INSP_ACT_R.$sub_char1);
				addColumnPathMap(InspActIF_Upd01_HdrR.$sub_char2, MST_INSP_ACT_R.$sub_char2);
				addColumnPathMap(InspActIF_Upd01_HdrR.$sub_char3, MST_INSP_ACT_R.$sub_char3);
				addColumnPathMap(InspActIF_Upd01_HdrR.$lims_flg, MST_INSP_ACT_R.$lims_flg);
				addColumnPathMap(InspActIF_Upd01_HdrR.$ext_sys_cd, MST_INSP_ACT_R.$ext_sys_cd);
				addColumnPathMap(InspActIF_Upd01_HdrR.$ext_insp_act_no, MST_INSP_ACT_R.$ext_insp_act_no);

			}
		}
		
		protected Map_InspActIF_Upd01_HdrR_InspActRecvIf_Chk01_DtlR<InspActIF_Upd01_HdrR,InspActRecvIf_Chk01_DtlR> createMap_InspActIF_Upd01_HdrR_InspActRecvIf_Chk01_DtlR() {
			return new Map_InspActIF_Upd01_HdrR_InspActRecvIf_Chk01_DtlR<InspActIF_Upd01_HdrR, InspActRecvIf_Chk01_DtlR>();
		}

		public class Map_InspActIF_Upd01_HdrR_InspActRecvIf_Chk01_DtlR<D extends InspActIF_Upd01_HdrR, S extends InspActRecvIf_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspActIF_Upd01_HdrR.$peg_no, InspActRecvIf_Chk01_DtlR.$peg_no);
				addColumnPathMap(InspActIF_Upd01_HdrR.$insp_no, InspActRecvIf_Chk01_DtlR.$insp_no);
				addColumnPathMap(InspActIF_Upd01_HdrR.$st_dt, InspActRecvIf_Chk01_DtlR.$st_act_tm);
				addColumnPathMap(InspActIF_Upd01_HdrR.$end_dt, InspActRecvIf_Chk01_DtlR.$end_act_tm);
				addColumnPathMap(InspActIF_Upd01_HdrR.$quality_typ, InspActRecvIf_Chk01_DtlR.$smpl_quality_typ);
				addColumnPathMap(InspActIF_Upd01_HdrR.$dfct_rsn_cd, InspActRecvIf_Chk01_DtlR.$smpl_dfct_rsn_cd);
				addColumnPathMap(InspActIF_Upd01_HdrR.$act_usr_cd, InspActRecvIf_Chk01_DtlR.$act_usr_cd);
				addColumnPathMap(InspActIF_Upd01_HdrR.$act_dpt_cd, InspActRecvIf_Chk01_DtlR.$act_dpt_cd);
				addColumnPathMap(InspActIF_Upd01_HdrR.$intr_rmrks, InspActRecvIf_Chk01_DtlR.$intr_rmrks);
				addColumnPathMap(InspActIF_Upd01_HdrR.$lot_rmrks, InspActRecvIf_Chk01_DtlR.$lot_rmrks);
				addColumnPathMap(InspActIF_Upd01_HdrR.$ext_sys_cd, InspActRecvIf_Chk01_DtlR.$ext_sys_cd);
				addColumnPathMap(InspActIF_Upd01_HdrR.$ext_insp_act_no, InspActRecvIf_Chk01_DtlR.$ext_insp_act_no);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.lims_flg(true);
				
				if (!isNull(src.smpl_quality_typ())) {
					dest.gd_cd(src.smpl_gd_cd());
				}
				
				if (src.vld_dt_upd_flg()) {
					dest.lmt_dt_frm(src.lmt_dt_frm());
					dest.vld_dt(src.vld_dt());
					dest.lmt_dt(src.lmt_dt());
				}
				
				if (isActContFctrTarget(src)) {
					dest.act_cont_fctr(src.act_cont_fctr());
					dest.act_cont_fctr_upd_flg(true);
				}
			}
			
			protected boolean isActContFctrTarget(InspActRecvIf_Chk01_DtlR src) {
				MST_INSP_INST_R inspInst = getInspInstRCache(src.insp_no());
				MAM_ITM_R itm = getItmR(inspInst.itm_cd(),
						inspInst.itm_sub1(), inspInst.itm_sub2(), inspInst.itm_sub3());
				return itm.cont_fctr_flg();
			}
		}
		
		protected Map_InspActIF_Upd01_DtlR_MST_STK_R<InspActIF_Upd01_DtlR,MST_STK_R> createMap_InspActIF_Upd01_DtlR_MST_STK_R() {
			return new Map_InspActIF_Upd01_DtlR_MST_STK_R<InspActIF_Upd01_DtlR, MST_STK_R>();
		}

		public class Map_InspActIF_Upd01_DtlR_MST_STK_R<D extends InspActIF_Upd01_DtlR, S extends MST_STK_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspActIF_Upd01_DtlR.$itm_cd, MST_STK_R.$itm_cd);
				addColumnPathMap(InspActIF_Upd01_DtlR.$itm_sub1, MST_STK_R.$itm_sub1);
				addColumnPathMap(InspActIF_Upd01_DtlR.$itm_sub2, MST_STK_R.$itm_sub2);
				addColumnPathMap(InspActIF_Upd01_DtlR.$itm_sub3, MST_STK_R.$itm_sub3);
				addColumnPathMap(InspActIF_Upd01_DtlR.$loc_cd, MST_STK_R.$loc_cd);
				addColumnPathMap(InspActIF_Upd01_DtlR.$str_ln_cd, MST_STK_R.$str_ln_cd);
				addColumnPathMap(InspActIF_Upd01_DtlR.$quality_typ, MST_STK_R.$quality_typ);
				addColumnPathMap(InspActIF_Upd01_DtlR.$stk_insp_typ, MST_STK_R.$stk_insp_typ);
				addColumnPathMap(InspActIF_Upd01_DtlR.$stk_id_typ, MST_STK_R.$stk_id_typ);
				addColumnPathMap(InspActIF_Upd01_DtlR.$stk_bp_cd, MST_STK_R.$stk_bp_cd);
				addColumnPathMap(InspActIF_Upd01_DtlR.$gd_cd, MST_STK_R.$gd_cd);
				addColumnPathMap(InspActIF_Upd01_DtlR.$stk_arrv_bp_cd, MST_STK_R.$stk_arrv_bp_cd);
				addColumnPathMap(InspActIF_Upd01_DtlR.$lot_no, MST_STK_R.$lot_no);
				addColumnPathMap(InspActIF_Upd01_DtlR.$sublot_no, MST_STK_R.$sublot_no);
				addColumnPathMap(InspActIF_Upd01_DtlR.$sno1, MST_STK_R.$sno1);
				addColumnPathMap(InspActIF_Upd01_DtlR.$sno2, MST_STK_R.$sno2);
				addColumnPathMap(InspActIF_Upd01_DtlR.$sno3, MST_STK_R.$sno3);
				addColumnPathMap(InspActIF_Upd01_DtlR.$sno4, MST_STK_R.$sno4);
				addColumnPathMap(InspActIF_Upd01_DtlR.$fix_no_typ, MST_STK_R.$fix_no_typ);
				addColumnPathMap(InspActIF_Upd01_DtlR.$fix_no, MST_STK_R.$fix_no);
				addColumnPathMap(InspActIF_Upd01_DtlR.$pack_unit_qty, MST_STK_R.$pack_unit_qty);
				addColumnPathMap(InspActIF_Upd01_DtlR.$base_unit_qty, MST_STK_R.$base_unit_qty);
				addColumnPathMap(InspActIF_Upd01_DtlR.$pack_unit_cd, MST_STK_R.$pack_unit_cd);
				addColumnPathMap(InspActIF_Upd01_DtlR.$pack_xfr_pack_unit_cd, MST_STK_R.$pack_unit_cd);
			}
		}
		
		protected Map_InspActIF_Upd01_DtlR_InspActRecvIf_Chk01_DtlR<InspActIF_Upd01_DtlR,InspActRecvIf_Chk01_DtlR> createMap_InspActIF_Upd01_DtlR_InspActRecvIf_Chk01_DtlR() {
			return new Map_InspActIF_Upd01_DtlR_InspActRecvIf_Chk01_DtlR<InspActIF_Upd01_DtlR, InspActRecvIf_Chk01_DtlR>();
		}

		public class Map_InspActIF_Upd01_DtlR_InspActRecvIf_Chk01_DtlR<D extends InspActIF_Upd01_DtlR, S extends InspActRecvIf_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspActIF_Upd01_DtlR.$insp_no, InspActRecvIf_Chk01_DtlR.$insp_no);
				addColumnPathMap(InspActIF_Upd01_DtlR.$data_crud_typ, InspActRecvIf_Chk01_DtlR.$data_crud_typ);
				addColumnPathMap(InspActIF_Upd01_DtlR.$loc_cd, InspActRecvIf_Chk01_DtlR.$stk_loc_cd);
				addColumnPathMap(InspActIF_Upd01_DtlR.$str_ln_cd, InspActRecvIf_Chk01_DtlR.$stk_str_ln_cd);
				addColumnPathMap(InspActIF_Upd01_DtlR.$gd_cd, InspActRecvIf_Chk01_DtlR.$ttl_gd_cd);
				addColumnPathMap(InspActIF_Upd01_DtlR.$quality_typ, InspActRecvIf_Chk01_DtlR.$ttl_quality_typ);
				addColumnPathMap(InspActIF_Upd01_DtlR.$pack_unit_qty, InspActRecvIf_Chk01_DtlR.$pack_unit_qty);
				addColumnPathMap(InspActIF_Upd01_DtlR.$pack_unit_cd, InspActRecvIf_Chk01_DtlR.$pack_unit_cd);
				addColumnPathMap(InspActIF_Upd01_DtlR.$intr_rmrks, InspActRecvIf_Chk01_DtlR.$ttl_intr_rmrks);
				addColumnPathMap(InspActIF_Upd01_DtlR.$ext_sys_cd, InspActRecvIf_Chk01_DtlR.$ext_sys_cd);
				addColumnPathMap(InspActIF_Upd01_DtlR.$ext_insp_act_d_no, InspActRecvIf_Chk01_DtlR.$ext_insp_act_d_no);
				
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				setDataCrudTyp(dest, src);
				
				MST_INSP_INST_R inspInst = getInspInstRCache(src.insp_no());
				// 荷姿単位から基準単位に振替する場合
				if (src.base_flg() 
						&& isSame(inspInst.base_unit_cd(), src.pack_unit_cd())
						&& !isSame(inspInst.base_unit_cd(), src.ttl_pack_xfr_pack_unit_cd())) {
					dest.base_unit_qty(src.pack_unit_qty());
					dest.pack_unit_cd(inspInst.base_unit_cd());
					dest.pack_xfr_pack_unit_cd(src.ttl_pack_xfr_pack_unit_cd());
					dest.pack_xfr_pack_unit_qty(src.ttl_pack_xfr_pack_unit_qty());
					dest.pack_xfr_base_unit_qty(calcBaseUnitQty(src, src.ttl_pack_xfr_pack_unit_cd(), src.ttl_pack_xfr_pack_unit_qty()));
				}
				else {
					dest.base_unit_qty(calcBaseUnitQty(src, src.pack_unit_cd(), src.pack_unit_qty()));
					dest.pack_xfr_pack_unit_cd(src.pack_unit_cd());
				}
				
				if (MAC_QUALITY_TYP.isDFCT_INSP(src.ttl_quality_typ())) {
					dest.dfct_rsn_cd(src.ttl_dfct_rsn_cd());
				}
				dest.ac_dt(MAUCL_DateUtil.getAcDt(src.ttl_act_tm()));
				dest.lims_flg(true);
			}
			
			protected void setDataCrudTyp(InspActIF_Upd01_DtlR dest, InspActRecvIf_Chk01_DtlR src) {
				if (isDetailOnlyIns(src)) {
					// 明細のみ登録時のデータ更新区分は、検査実績登録画面の仕様と合わせる
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				else {
					dest.data_crud_typ(src.data_crud_typ());
				}
			}
		}
		
		protected Map_InspActIF_Upd01_SmplR_MST_INSP_SCHD_R<InspActIF_Upd01_SmplR,MST_INSP_SCHD_R> createMap_InspActIF_Upd01_SmplR_MST_INSP_SCHD_R() {
			return new Map_InspActIF_Upd01_SmplR_MST_INSP_SCHD_R<InspActIF_Upd01_SmplR, MST_INSP_SCHD_R>();
		}

		public class Map_InspActIF_Upd01_SmplR_MST_INSP_SCHD_R<D extends InspActIF_Upd01_SmplR, S extends MST_INSP_SCHD_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspActIF_Upd01_SmplR.$insp_no, MST_INSP_SCHD_R.$insp_no);
				addColumnPathMap(InspActIF_Upd01_SmplR.$insp_schd_no, MST_INSP_SCHD_R.$insp_schd_no);
				addColumnPathMap(InspActIF_Upd01_SmplR.$itm_cd, MST_INSP_SCHD_R.$itm_cd);
				addColumnPathMap(InspActIF_Upd01_SmplR.$itm_sub1, MST_INSP_SCHD_R.$itm_sub1);
				addColumnPathMap(InspActIF_Upd01_SmplR.$itm_sub2, MST_INSP_SCHD_R.$itm_sub2);
				addColumnPathMap(InspActIF_Upd01_SmplR.$itm_sub3, MST_INSP_SCHD_R.$itm_sub3);
				addColumnPathMap(InspActIF_Upd01_SmplR.$base_unit_cd, MST_INSP_SCHD_R.$base_unit_cd);
				addColumnPathMap(InspActIF_Upd01_SmplR.$pack_xfr_pack_unit_cd, MST_INSP_SCHD_R.$pack_unit_cd);
				addColumnPathMap(InspActIF_Upd01_SmplR.$loc_cd, MST_INSP_SCHD_R.$loc_cd);
				addColumnPathMap(InspActIF_Upd01_SmplR.$str_ln_cd, MST_INSP_SCHD_R.$str_ln_cd);
				addColumnPathMap(InspActIF_Upd01_SmplR.$quality_typ, MST_INSP_SCHD_R.$quality_typ);
				addColumnPathMap(InspActIF_Upd01_SmplR.$stk_insp_typ, MST_INSP_SCHD_R.$stk_insp_typ);
				addColumnPathMap(InspActIF_Upd01_SmplR.$stk_id_typ, MST_INSP_SCHD_R.$stk_id_typ);
				addColumnPathMap(InspActIF_Upd01_SmplR.$stk_bp_cd, MST_INSP_SCHD_R.$stk_bp_cd);
				addColumnPathMap(InspActIF_Upd01_SmplR.$gd_cd, MST_INSP_SCHD_R.$gd_cd);
				addColumnPathMap(InspActIF_Upd01_SmplR.$stk_arrv_bp_cd, MST_INSP_SCHD_R.$stk_arrv_bp_cd);
				addColumnPathMap(InspActIF_Upd01_SmplR.$lot_no, MST_INSP_SCHD_R.$lot_no);
				addColumnPathMap(InspActIF_Upd01_SmplR.$sublot_no, MST_INSP_SCHD_R.$sublot_no);
				addColumnPathMap(InspActIF_Upd01_SmplR.$sno1, MST_INSP_SCHD_R.$sno1);
				addColumnPathMap(InspActIF_Upd01_SmplR.$sno1_mng_typ, MST_INSP_SCHD_R.$sno1_mng_typ);
				addColumnPathMap(InspActIF_Upd01_SmplR.$sno2, MST_INSP_SCHD_R.$sno2);
				addColumnPathMap(InspActIF_Upd01_SmplR.$sno2_mng_typ, MST_INSP_SCHD_R.$sno2_mng_typ);
				addColumnPathMap(InspActIF_Upd01_SmplR.$sno3, MST_INSP_SCHD_R.$sno3);
				addColumnPathMap(InspActIF_Upd01_SmplR.$sno3_mng_typ, MST_INSP_SCHD_R.$sno3_mng_typ);
				addColumnPathMap(InspActIF_Upd01_SmplR.$sno4, MST_INSP_SCHD_R.$sno4);
				addColumnPathMap(InspActIF_Upd01_SmplR.$sno4_mng_typ, MST_INSP_SCHD_R.$sno4_mng_typ);
				addColumnPathMap(InspActIF_Upd01_SmplR.$ac_dt, MST_INSP_SCHD_R.$ac_dt);
				addColumnPathMap(InspActIF_Upd01_SmplR.$sub_char1, MST_INSP_SCHD_R.$sub_char1);
				addColumnPathMap(InspActIF_Upd01_SmplR.$sub_char2, MST_INSP_SCHD_R.$sub_char2);
				addColumnPathMap(InspActIF_Upd01_SmplR.$sub_char3, MST_INSP_SCHD_R.$sub_char3);
			}
		}
		
		protected Map_InspActIF_Upd01_SmplR_MST_STK_R<InspActIF_Upd01_SmplR,MST_STK_R> createMap_InspActIF_Upd01_SmplR_MST_STK_R() {
			return new Map_InspActIF_Upd01_SmplR_MST_STK_R<InspActIF_Upd01_SmplR, MST_STK_R>();
		}

		public class Map_InspActIF_Upd01_SmplR_MST_STK_R<D extends InspActIF_Upd01_SmplR, S extends MST_STK_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspActIF_Upd01_SmplR.$itm_cd, MST_STK_R.$itm_cd);
				addColumnPathMap(InspActIF_Upd01_SmplR.$itm_sub1, MST_STK_R.$itm_sub1);
				addColumnPathMap(InspActIF_Upd01_SmplR.$itm_sub2, MST_STK_R.$itm_sub2);
				addColumnPathMap(InspActIF_Upd01_SmplR.$itm_sub3, MST_STK_R.$itm_sub3);
				addColumnPathMap(InspActIF_Upd01_SmplR.$loc_cd, MST_STK_R.$loc_cd);
				addColumnPathMap(InspActIF_Upd01_SmplR.$str_ln_cd, MST_STK_R.$str_ln_cd);
				addColumnPathMap(InspActIF_Upd01_SmplR.$quality_typ, MST_STK_R.$quality_typ);
				addColumnPathMap(InspActIF_Upd01_SmplR.$stk_insp_typ, MST_STK_R.$stk_insp_typ);
				addColumnPathMap(InspActIF_Upd01_SmplR.$stk_id_typ, MST_STK_R.$stk_id_typ);
				addColumnPathMap(InspActIF_Upd01_SmplR.$stk_bp_cd, MST_STK_R.$stk_bp_cd);
				addColumnPathMap(InspActIF_Upd01_SmplR.$gd_cd, MST_STK_R.$gd_cd);
				addColumnPathMap(InspActIF_Upd01_SmplR.$stk_arrv_bp_cd, MST_STK_R.$stk_arrv_bp_cd);
				addColumnPathMap(InspActIF_Upd01_SmplR.$lot_no, MST_STK_R.$lot_no);
				addColumnPathMap(InspActIF_Upd01_SmplR.$sublot_no, MST_STK_R.$sublot_no);
				addColumnPathMap(InspActIF_Upd01_SmplR.$sno1, MST_STK_R.$sno1);
				addColumnPathMap(InspActIF_Upd01_SmplR.$sno2, MST_STK_R.$sno2);
				addColumnPathMap(InspActIF_Upd01_SmplR.$sno3, MST_STK_R.$sno3);
				addColumnPathMap(InspActIF_Upd01_SmplR.$sno4, MST_STK_R.$sno4);
				addColumnPathMap(InspActIF_Upd01_SmplR.$fix_no_typ, MST_STK_R.$fix_no_typ);
				addColumnPathMap(InspActIF_Upd01_SmplR.$fix_no, MST_STK_R.$fix_no);
				addColumnPathMap(InspActIF_Upd01_SmplR.$sub_char1, MST_STK_R.$sub_char1);
				addColumnPathMap(InspActIF_Upd01_SmplR.$sub_char2, MST_STK_R.$sub_char2);
				addColumnPathMap(InspActIF_Upd01_SmplR.$sub_char3, MST_STK_R.$sub_char3);

			}
		}
		
		protected Map_InspActIF_Upd01_SmplR_InspActRecvIf_Chk01_DtlR<InspActIF_Upd01_SmplR,InspActRecvIf_Chk01_DtlR> createMap_InspActIF_Upd01_SmplR_InspActRecvIf_Chk01_DtlR() {
			return new Map_InspActIF_Upd01_SmplR_InspActRecvIf_Chk01_DtlR<InspActIF_Upd01_SmplR, InspActRecvIf_Chk01_DtlR>();
		}

		public class Map_InspActIF_Upd01_SmplR_InspActRecvIf_Chk01_DtlR<D extends InspActIF_Upd01_SmplR, S extends InspActRecvIf_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspActIF_Upd01_SmplR.$insp_no, InspActRecvIf_Chk01_DtlR.$insp_no);
				addColumnPathMap(InspActIF_Upd01_SmplR.$data_crud_typ, InspActRecvIf_Chk01_DtlR.$data_crud_typ);
				addColumnPathMap(InspActIF_Upd01_SmplR.$so_qty, InspActRecvIf_Chk01_DtlR.$so_qty);
				addColumnPathMap(InspActIF_Upd01_SmplR.$smpl_qty, InspActRecvIf_Chk01_DtlR.$smpl_qty);
				addColumnPathMap(InspActIF_Upd01_SmplR.$pack_xfr_pack_unit_cd, InspActRecvIf_Chk01_DtlR.$smpl_pack_xfr_pack_unit_cd);
				addColumnPathMap(InspActIF_Upd01_SmplR.$loc_cd, InspActRecvIf_Chk01_DtlR.$stk_loc_cd);
				addColumnPathMap(InspActIF_Upd01_SmplR.$str_ln_cd, InspActRecvIf_Chk01_DtlR.$stk_str_ln_cd);
				addColumnPathMap(InspActIF_Upd01_SmplR.$act_hm, InspActRecvIf_Chk01_DtlR.$smpl_act_tm);
				addColumnPathMap(InspActIF_Upd01_SmplR.$bd_dpt_cd, InspActRecvIf_Chk01_DtlR.$bd_dpt_cd);
				addColumnPathMap(InspActIF_Upd01_SmplR.$trd_rmrks, InspActRecvIf_Chk01_DtlR.$trd_rmrks);
				addColumnPathMap(InspActIF_Upd01_SmplR.$intr_rmrks, InspActRecvIf_Chk01_DtlR.$smpl_intr_rmrks);
				addColumnPathMap(InspActIF_Upd01_SmplR.$ext_sys_cd, InspActRecvIf_Chk01_DtlR.$ext_sys_cd);
				addColumnPathMap(InspActIF_Upd01_SmplR.$ext_insp_smpl_act_no, InspActRecvIf_Chk01_DtlR.$ext_insp_smpl_act_no);

			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				if (!isNull(src.smpl_act_tm())) {
					dest.act_dt(src.smpl_act_tm().trunc(MCDateFieldType.DAY));
				}
				if (isNull(dest.sno1())) {
					dest.sno1(MAC_STR.NULL_VAL.value());
				}
				if (isNull(dest.sno2())) {
					dest.sno2(MAC_STR.NULL_VAL.value());
				}
				if (isNull(dest.sno3())) {
					dest.sno3(MAC_STR.NULL_VAL.value());
				}
				if (isNull(dest.sno4())) {
					dest.sno4(MAC_STR.NULL_VAL.value());
				}
				
				MST_INSP_INST_R inspInst = getInspInstRCache(src.insp_no());
				if (!isSame(inspInst.base_unit_cd(), src.smpl_pack_xfr_pack_unit_cd())) {
					dest.pack_xfr_pack_unit_qty(src.smpl_pack_xfr_pack_unit_qty());
					dest.pack_xfr_base_unit_qty(calcBaseUnitQty(src, src.smpl_pack_xfr_pack_unit_cd(), src.smpl_pack_xfr_pack_unit_qty()));
				}
				dest.ac_dt(MAUCL_DateUtil.getAcDt(src.smpl_act_tm()));
				dest.lims_flg(true);
			}
		}
		
		protected Map_InspActIF_Upd02_HdrR_InspActRecvIf_Chk01_DtlR<InspActIF_Upd02_HdrR,InspActRecvIf_Chk01_DtlR> createMap_InspActIF_Upd02_HdrR_InspActRecvIf_Chk01_DtlR() {
			return new Map_InspActIF_Upd02_HdrR_InspActRecvIf_Chk01_DtlR<InspActIF_Upd02_HdrR, InspActRecvIf_Chk01_DtlR>();
		}

		public class Map_InspActIF_Upd02_HdrR_InspActRecvIf_Chk01_DtlR<D extends InspActIF_Upd02_HdrR, S extends InspActRecvIf_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspActIF_Upd02_HdrR.$insp_no, InspActRecvIf_Chk01_DtlR.$insp_no);
				addColumnPathMap(InspActIF_Upd02_HdrR.$judg_dt, InspActRecvIf_Chk01_DtlR.$judg_dt);
				addColumnPathMap(InspActIF_Upd02_HdrR.$insp_judg_rslt_typ, InspActRecvIf_Chk01_DtlR.$insp_judg_rslt_typ);
				addColumnPathMap(InspActIF_Upd02_HdrR.$judg_dpt_cd, InspActRecvIf_Chk01_DtlR.$judg_dpt_cd);
				addColumnPathMap(InspActIF_Upd02_HdrR.$judg_usr_cd, InspActRecvIf_Chk01_DtlR.$judg_usr_cd);
				addColumnPathMap(InspActIF_Upd02_HdrR.$judg_rsn, InspActRecvIf_Chk01_DtlR.$judg_rsn);
				addColumnPathMap(InspActIF_Upd02_HdrR.$intr_rmrks, InspActRecvIf_Chk01_DtlR.$intr_rmrks);
				addColumnPathMap(InspActIF_Upd02_HdrR.$lot_rmrks, InspActRecvIf_Chk01_DtlR.$lot_rmrks);
				addColumnPathMap(InspActIF_Upd02_HdrR.$sub_char1, InspActRecvIf_Chk01_DtlR.$sub_char1);
				addColumnPathMap(InspActIF_Upd02_HdrR.$sub_char2, InspActRecvIf_Chk01_DtlR.$sub_char2);
				addColumnPathMap(InspActIF_Upd02_HdrR.$sub_char3, InspActRecvIf_Chk01_DtlR.$sub_char3);

			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (src.vld_dt_upd_flg()) {
					dest.lmt_dt_frm(src.lmt_dt_frm());
					dest.vld_dt(src.vld_dt());
					dest.lmt_dt(src.lmt_dt());
				}
			}
		}
		
		protected Map_InspActIF_Del01_CndR_InspActRecvIf_Chk01_DtlR<InspActIF_Del01_CndR,InspActRecvIf_Chk01_DtlR> createMap_InspActIF_Del01_CndR_InspActRecvIf_Chk01_DtlR() {
			return new Map_InspActIF_Del01_CndR_InspActRecvIf_Chk01_DtlR<InspActIF_Del01_CndR, InspActRecvIf_Chk01_DtlR>();
		}

		public class Map_InspActIF_Del01_CndR_InspActRecvIf_Chk01_DtlR<D extends InspActIF_Del01_CndR, S extends InspActRecvIf_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspActIF_Del01_CndR.$insp_no, InspActRecvIf_Chk01_DtlR.$insp_no);
				addColumnPathMap(InspActIF_Del01_CndR.$judg_rsn, InspActRecvIf_Chk01_DtlR.$judg_rsn);

			}
		}
	}
	
	protected static final Class<MSLAL_InspActRecvIfService> CLAZZ = MSLAL_InspActRecvIfService.class;
	
	/** エラーとなった検査ＮＯを保持する **/
	protected Set<List<String>> _errSet = new HashSet<List<String>>();
	
	protected MCList<MST_INSP_SCHD_R> _inspSchdLCache = null;
	protected MCList<MST_INSP_INST_R> _inspInstLCache = null;
	protected MCList<MST_STK_R> _stkLCache = null;
	protected MCList<MST_INSP_ACT_R> _inspActLCache = null;
	protected MCList<MST_INSP_ACT_D_R> _inspActDtlLCache = null;
	protected MCList<MST_INSP_SMPL_ACT_R> _inspSmplActLCache = null;
	protected MCList<MST_LOT_R> _lotLCache = null;
	protected MCList<InspSchd_Srch01_CndR> _itmInspLCache = null;
	protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache = null;
	protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _itmUnitCache = null;

	protected MCIndexKey _inspSchdIdxWithInspNo = null;
	protected MCIndexKey _inspSchdIdxWithInspSchdNo = null;
	protected MCIndexKey _inspInstIdxWithInspNo = null;
	protected MCIndexKey _stkIdxWithInspSchdNo = null;
	protected MCIndexKey _inspActIdxWithExtInspActNo = null;
	protected MCIndexKey _inspActDtlIdxWithExtInspActNo = null;
	protected MCIndexKey _inspActDtlIdxWithExtInspActDNo = null;
	protected MCIndexKey _inspSmplActIdxWithExtInspActNo = null;
	protected MCIndexKey _inspSmplActIdxWithExtSmplActNo = null;
	protected MCIndexKey _lotIdxKey = null;
	protected MCIndexKey _itmInspIdxWithPegNo = null;
	
	protected static MST_INSP_SCHD_R getInspSchdRCache(String inspSchdNo) {
		return object(CLAZZ)._inspSchdLCache.getFirst(getInspSchdIdxWithInspSchdNo(), inspSchdNo);
	}
	
	protected static MCList<MST_INSP_SCHD_R> getInspSchdLCache(String inspNo) {
		return object(CLAZZ)._inspSchdLCache.subList(getInspSchdIdxWithInspNo(), inspNo);
	}
	
	protected static void setInspSchdLCache(MCList<MST_INSP_SCHD_R> inspSchdL) {
		object(CLAZZ)._inspSchdLCache = inspSchdL;
		object(CLAZZ)._inspSchdIdxWithInspNo = object(CLAZZ)._inspSchdLCache.createIndex(MST_INSP_SCHD_R.$insp_no);
		object(CLAZZ)._inspSchdIdxWithInspSchdNo = object(CLAZZ)._inspSchdLCache.createIndex(MST_INSP_SCHD_R.$insp_schd_no);
		return;
	}

	protected static MST_INSP_INST_R getInspInstRCache(String inspNo) {
		return object(CLAZZ)._inspInstLCache.getFirst(getInspInstIdxWithInspNo(), inspNo);
	}

	protected static void setInspInstLCache(MCList<MST_INSP_INST_R> inspInstL) {
		object(CLAZZ)._inspInstLCache = inspInstL;
		object(CLAZZ)._inspInstIdxWithInspNo = object(CLAZZ)._inspInstLCache.createIndex(MST_INSP_INST_R.$insp_no);
		return;
	}
	
	protected static MCList<MST_STK_R> getStkLCache(String inspSchdNo) {
		return object(CLAZZ)._stkLCache.subList(getStkIdxWithInspSchdNo(), inspSchdNo);
	}

	protected static void setStkLCache(MCList<MST_STK_R> stkL) {
		object(CLAZZ)._stkLCache = stkL;
		object(CLAZZ)._stkIdxWithInspSchdNo = object(CLAZZ)._stkLCache.createIndex("insp_schd_no");
		return;
	}

	protected static MST_INSP_ACT_R getInspActRCache(String extInspActNo) {
		return object(CLAZZ)._inspActLCache.getFirst(getInspActIdxWithExtInspActNo(), extInspActNo);
	}

	protected static void setInspActLCache(MCList<MST_INSP_ACT_R> inspActL) {
		object(CLAZZ)._inspActLCache = inspActL;
		object(CLAZZ)._inspActIdxWithExtInspActNo = object(CLAZZ)._inspActLCache.createIndex(MST_INSP_ACT_R.$ext_insp_act_no);
		return;
	}

	protected static MCList<MST_INSP_ACT_D_R> getInspActDtlLCache(String extInspActNo) {
		return object(CLAZZ)._inspActDtlLCache.subList(getInspActDtlIdxWithExtInspActNo(), extInspActNo);
	}

	protected static MST_INSP_ACT_D_R getInspActDtlRCache(String extInspActDNo) {
		return object(CLAZZ)._inspActDtlLCache.getFirst(getInspActDIdxWithExtInspActDNo(), extInspActDNo);
	}
	
	protected static void setInspActDtlLCache(MCList<MST_INSP_ACT_D_R> inspActDtlL) {
		object(CLAZZ)._inspActDtlLCache = inspActDtlL;
		object(CLAZZ)._inspActDtlIdxWithExtInspActNo = object(CLAZZ)._inspActDtlLCache.createIndex(MST_INSP_ACT_R.$ext_insp_act_no);
		object(CLAZZ)._inspActDtlIdxWithExtInspActDNo = object(CLAZZ)._inspActDtlLCache.createIndex(MST_INSP_ACT_D_R.$ext_insp_act_d_no);
		return;
	}

	protected static MCList<MST_INSP_SMPL_ACT_R> getInspSmplActLCache(String extInspActNo) {
		return object(CLAZZ)._inspSmplActLCache.subList(getInspSmplActIdxWithExtInspActNo(), extInspActNo);
	}

	protected static MST_INSP_SMPL_ACT_R getInspSmplActRCache(String extSmplActNo) {
		return object(CLAZZ)._inspSmplActLCache.getFirst(getInspSmplActIdxWithExtSmplActNo(), extSmplActNo);
	}

	protected static void setInspSmplActLCache(MCList<MST_INSP_SMPL_ACT_R> inspSmplActL) {
		object(CLAZZ)._inspSmplActLCache = inspSmplActL;
		object(CLAZZ)._inspSmplActIdxWithExtInspActNo = object(CLAZZ)._inspSmplActLCache.createIndex(MST_INSP_ACT_R.$ext_insp_act_no);
		object(CLAZZ)._inspSmplActIdxWithExtSmplActNo = object(CLAZZ)._inspSmplActLCache.createIndex(MST_INSP_SMPL_ACT_R.$ext_insp_smpl_act_no);
		return;
	}

	protected static MST_LOT_R getLotRCache(String itmCd, String itmSub1, String itmSub2,String itmSub3, String lotNo, String sublotNo) {
		return object(CLAZZ)._lotLCache.getFirst(getLotIdxKey(), itmCd, itmSub1, itmSub2, itmSub3, lotNo, sublotNo);
	}

	protected static void setLotLCache(MCList<MST_LOT_R> lotL) {
		object(CLAZZ)._lotLCache = lotL;
		object(CLAZZ)._lotIdxKey = object(CLAZZ)._lotLCache.createIndex(MST_LOT_R.$itm_cd, MST_LOT_R.$itm_sub1, MST_LOT_R.$itm_sub2, 
				MST_LOT_R.$itm_sub3, MST_LOT_R.$lot_no, MST_LOT_R.$sublot_no);
		return;
	}
	
	protected static InspSchd_Srch01_CndR getItmInspRCache(MCNumber pegNo) {
		return object(CLAZZ)._itmInspLCache.getFirst(getItmInspIdxWithPegNo(), pegNo);
	}

	protected static void setItmInspLCache(MCList<InspSchd_Srch01_CndR> itmInspL) {
		object(CLAZZ)._itmInspLCache = itmInspL;
		object(CLAZZ)._itmInspIdxWithPegNo = object(CLAZZ)._itmInspLCache.createIndex(InspSchd_Srch01_CndR.$peg_no);
		return;
	}
	
	protected MAM_ITM_R getItmR(
			String itmCd, String itmSub1, String itmSub2, String itmSub3) {
		return object(CLAZZ)._itmCache.get(itmCd, itmSub1, itmSub2, itmSub3);
	}
	
	protected MAVM_ITM_UNIT_R getItmUnitR(
			String itmCd, String itmSub1, String itmSub2, String itmSub3, String unitCd) {
		return object(CLAZZ)._itmUnitCache.get(itmCd, itmSub1, itmSub2, itmSub3, unitCd);
	}
	
	protected static MCIndexKey getInspSchdIdxWithInspNo() {
		return object(CLAZZ)._inspSchdIdxWithInspNo;
	}
	
	protected static MCIndexKey getInspSchdIdxWithInspSchdNo() {
		return object(CLAZZ)._inspSchdIdxWithInspSchdNo;
	}
	
	protected static MCIndexKey getInspInstIdxWithInspNo() {
		return object(CLAZZ)._inspInstIdxWithInspNo;
	}
	
	protected static MCIndexKey getStkIdxWithInspSchdNo() {
		return object(CLAZZ)._stkIdxWithInspSchdNo;
	}
	
	protected static MCIndexKey getInspActIdxWithExtInspActNo() {
		return object(CLAZZ)._inspActIdxWithExtInspActNo;
	}
	
	protected static MCIndexKey getInspActDtlIdxWithExtInspActNo() {
		return object(CLAZZ)._inspActDtlIdxWithExtInspActNo;
	}
	
	protected static MCIndexKey getInspActDIdxWithExtInspActDNo() {
		return object(CLAZZ)._inspActDtlIdxWithExtInspActDNo;
	}
	
	protected static MCIndexKey getInspSmplActIdxWithExtInspActNo() {
		return object(CLAZZ)._inspSmplActIdxWithExtInspActNo;
	}
	
	protected static MCIndexKey getInspSmplActIdxWithExtSmplActNo() {
		return object(CLAZZ)._inspSmplActIdxWithExtSmplActNo;
	}
	
	protected static MCIndexKey getLotIdxKey() {
		return object(CLAZZ)._lotIdxKey;
	}
	
	protected static MCIndexKey getItmInspIdxWithPegNo() {
		return object(CLAZZ)._itmInspIdxWithPegNo;
	}
	
	protected void initTranCache(MCList<MST_INSP_ACT_RECV_IF_R> inspActRecvIfL) {
		initInspInstCache(inspActRecvIfL);
		initInspActCache(inspActRecvIfL);
		initInspActDtlCache(inspActRecvIfL);
		initInspSmplActCache(inspActRecvIfL);
		initInspSchdCache(inspActRecvIfL);
		initStkCache(inspActRecvIfL);
		initLotCache(inspActRecvIfL);
	}
	
	protected void initMasterCache(MCList<InspActRecvIf_Chk01_DtlR> up0) {
		MCList<MST_INSP_ACT_RECV_IF_R> inspActRecvIfL = up0.innerRowList(InspActRecvIf_Chk01_DtlR.$insp_if, MST_INSP_ACT_RECV_IF_R.class);
		MCList<MST_INSP_INST_R> inspInstL = fetchInspInst(inspActRecvIfL);
		
		initItmCache(inspActRecvIfL, inspInstL);
		initItmUnitCache(inspActRecvIfL, inspInstL);
		initItmInspCache(up0, inspInstL);
	}
	
	protected MCList<MST_INSP_INST_R> fetchInspInst(MCList<MST_INSP_ACT_RECV_IF_R> inspActRecvIfL) {
		MCList<MST_INSP_INST_R> inspInstL = MCList.create(MST_INSP_INST_R.class);
		MST_INSP_INST_R inspInst = MST_INSP_INST_R.create("INSPINST");
		MCQueryApiBuilder inspInstL_bldr = MCQueryApiBuilder.create(inspInst);
		
		inspInstL_bldr.setSelect(inspInst.insp_no);
		inspInstL_bldr.addSelect(inspInst.insp_typ);
		inspInstL_bldr.addSelect(inspInst.itm_cd);
		inspInstL_bldr.addSelect(inspInst.itm_sub1);
		inspInstL_bldr.addSelect(inspInst.itm_sub2);
		inspInstL_bldr.addSelect(inspInst.itm_sub3);
		inspInstL_bldr.addSelect(inspInst.sppl_cd);
		inspInstL_bldr.addSelect(inspInst.maker_cd);
		inspInstL_bldr.addSelect(inspInst.mfg_loc_cd);
		inspInstL_bldr.addSelect(inspInst.to_site_cd);
		inspInstL_bldr.addSelect(inspInst.pack_unit_cd);
		inspInstL_bldr.addSelect(inspInst.master_dt);
		inspInstL_bldr.addSelect(inspInst.insp_ptn_cd);
		inspInstL_bldr.setWhere(inspInst.insp_no.eq(bind("insp_no")));
		inspInstL_bldr.setOrderByAsc(inspInst.insp_no);

		dbSelect("MSLAL6420_MST_INSP_INST_S03", inspInstL, inspInstL_bldr, inspActRecvIfL);
		
		return inspInstL;
	}
	
	protected void initInspSchdCache(MCList<MST_INSP_ACT_RECV_IF_R> inspActRecvIfL) {
		object(CLAZZ)._inspSchdLCache = MCList.create(MST_INSP_SCHD_R.class);
		MST_INSP_SCHD_R inspSchd = MST_INSP_SCHD_R.create("INSPSCHD");
		MCQueryApiBuilder inspSchdL_bldr = MCQueryApiBuilder.create(inspSchd);

		inspSchdL_bldr.setWhere(inspSchd.insp_no.eq(bind("insp_no")));
		inspSchdL_bldr.setOrderByAsc(inspSchd.insp_schd_no);

		dbSelect("MSLAL6420_MST_INSP_SCHD_S01", object(CLAZZ)._inspSchdLCache, inspSchdL_bldr, inspActRecvIfL);
		
		setInspSchdLCache(object(CLAZZ)._inspSchdLCache);
	}
	
	protected void initInspInstCache(MCList<MST_INSP_ACT_RECV_IF_R> inspActRecvIfL) {
		object(CLAZZ)._inspInstLCache = MCList.create(MST_INSP_INST_R.class);
		MST_INSP_INST_R inspInst = MST_INSP_INST_R.create("INSPINST");
		MCQueryApiBuilder inspInstL_bldr = MCQueryApiBuilder.create(inspInst);

		inspInstL_bldr.setWhere(inspInst.insp_no.eq(bind("insp_no")));
		inspInstL_bldr.setOrderByAsc(inspInst.insp_no);

		dbSelectForUpdateNoWait("MSLAL6420_MST_INSP_INST_S01", object(CLAZZ)._inspInstLCache, inspInstL_bldr, inspActRecvIfL);
		
		setInspInstLCache(object(CLAZZ)._inspInstLCache);
	}
	
	protected void initStkCache(MCList<MST_INSP_ACT_RECV_IF_R> inspActRecvIfL) {
		object(CLAZZ)._stkLCache = MCList.create(MST_STK_R.class);
		object(CLAZZ)._stkLCache.addStringColumn("insp_no");
		object(CLAZZ)._stkLCache.addStringColumn("insp_schd_no");
		
		executeQuery(object(CLAZZ)._stkLCache, MSLAL6420_MST_STK_S01(), inspActRecvIfL);
		
		setStkLCache(object(CLAZZ)._stkLCache);
	}
	
	protected void initInspActCache(MCList<MST_INSP_ACT_RECV_IF_R> inspActRecvIfL) {
		object(CLAZZ)._inspActLCache = MCList.create(MST_INSP_ACT_R.class);
		MST_INSP_ACT_R inspAct = MST_INSP_ACT_R.create("INSPACT");
		MCQueryApiBuilder inspActL_bldr = MCQueryApiBuilder.create(inspAct);
		
		inspActL_bldr.setWhere(inspAct.ext_sys_cd.eq(bind("ext_sys_cd")));
		inspActL_bldr.addWhereWithAnd(inspAct.ext_insp_act_no.eq(bind("ext_insp_act_no")));
		inspActL_bldr.setOrderByAsc(inspAct.insp_act_no);

		dbSelectForUpdateNoWait("MSLAL6420_MST_INSP_ACT_S01", object(CLAZZ)._inspActLCache, inspActL_bldr, inspActRecvIfL);
		
		setInspActLCache(object(CLAZZ)._inspActLCache);
	}
	
	protected void initInspActDtlCache(MCList<MST_INSP_ACT_RECV_IF_R> inspActRecvIfL) {
		object(CLAZZ)._inspActDtlLCache = MCList.create(MST_INSP_ACT_D_R.class);
		MST_INSP_ACT_R inspAct = MST_INSP_ACT_R.create("INSPACT");
		MST_INSP_ACT_D_R inspActDtl = MST_INSP_ACT_D_R.create("INSPACTD");
		MCQueryApiBuilder inspActDtlL_bldr = MCQueryApiBuilder.create(inspActDtl);
		
		inspActDtlL_bldr.addSelect(inspAct.insp_no);
		inspActDtlL_bldr.addSelect(inspAct.ext_insp_act_no);
		inspActDtlL_bldr.setWhere(inspAct.ext_insp_act_no.eq(bind("ext_insp_act_no")));
		inspActDtlL_bldr.addWhereWithAnd(inspAct.ext_sys_cd.eq(bind("ext_sys_cd")));
		inspActDtlL_bldr.addInnerJoin(inspAct, inspActDtl.insp_act_no.eq(inspAct.insp_act_no));
		inspActDtlL_bldr.setOrderByAsc(inspActDtl.insp_act_d_no);
		dbSelect("MSLAL6420_MST_INSP_ACT_D_S01", object(CLAZZ)._inspActDtlLCache, inspActDtlL_bldr, inspActRecvIfL);
		
		setInspActDtlLCache(object(CLAZZ)._inspActDtlLCache);
	}
	
	protected void initInspSmplActCache(MCList<MST_INSP_ACT_RECV_IF_R> inspActRecvIfL) {
		object(CLAZZ)._inspSmplActLCache = MCList.create(MST_INSP_SMPL_ACT_R.class);
		MST_INSP_ACT_R inspAct = MST_INSP_ACT_R.create("INSPACT");
		MST_INSP_SMPL_ACT_R inspSmplAct = MST_INSP_SMPL_ACT_R.create("INSPSMPLACT");
		MCQueryApiBuilder inspSmplActL_bldr = MCQueryApiBuilder.create(inspSmplAct);

		inspSmplActL_bldr.addSelect(inspAct.insp_no);
		inspSmplActL_bldr.addSelect(inspAct.ext_insp_act_no);
		inspSmplActL_bldr.setWhere(inspAct.ext_insp_act_no.eq(bind("ext_insp_act_no")));
		inspSmplActL_bldr.addWhereWithAnd(inspAct.ext_sys_cd.eq(bind("ext_sys_cd")));
		inspSmplActL_bldr.addInnerJoin(inspAct, inspSmplAct.insp_act_no.eq(inspAct.insp_act_no));
		inspSmplActL_bldr.setOrderByAsc(inspSmplAct.insp_smpl_act_no);

		dbSelect("MSLAL6420_MST_INSP_SMPL_ACT_S01", object(CLAZZ)._inspSmplActLCache, inspSmplActL_bldr, inspActRecvIfL);
		
		setInspSmplActLCache(object(CLAZZ)._inspSmplActLCache);
	}
	
	protected void initLotCache(MCList<MST_INSP_ACT_RECV_IF_R> inspActRecvIfL) {
		object(CLAZZ)._lotLCache = MCList.create(MST_LOT_R.class);
		MST_LOT_R lot = MST_LOT_R.create("LOT");
		MST_INSP_INST_R inspInst = MST_INSP_INST_R.create("INSPINST");
		MCQueryApiBuilder lotL_bldr = MCQueryApiBuilder.create(lot);
		
		// 検査指図のロット情報と結合してロット管理データを取得
		lotL_bldr.addInnerJoin(inspInst, 
			lot.itm_cd.eq(inspInst.itm_cd)
			.and(lot.itm_sub1.eq(inspInst.itm_sub1))
			.and(lot.itm_sub2.eq(inspInst.itm_sub2))
			.and(lot.itm_sub3.eq(inspInst.itm_sub3))
			.and(lot.lot_no.eq(inspInst.lot_no))
			.and(lot.sublot_no.eq(inspInst.sublot_no)));
		
		lotL_bldr.setWhere(inspInst.insp_no.eq(bind("insp_no")));
		
		dbSelect("MSLAL6420_MST_LOT_S01", object(CLAZZ)._lotLCache, lotL_bldr, inspActRecvIfL);
		
		setLotLCache(object(CLAZZ)._lotLCache);
	}
	
	protected void initItmCache(MCList<MST_INSP_ACT_RECV_IF_R> inspActRecvIfL, MCList<MST_INSP_INST_R> inspInstL) {
		MCList<MAM_ITM_R> dbc = MCList.create(MAM_ITM_R.class);
		MAM_ITM_R itm = MAM_ITM_R.create("ITM");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(itm);
		
		inspInstL.forEach(r -> {
			MAM_ITM_R dbcR = dbc.add();
			dbcR.itm_cd(r.itm_cd());
			dbcR.itm_sub1(r.itm_sub1());
			dbcR.itm_sub2(r.itm_sub2());
			dbcR.itm_sub3(r.itm_sub3());
			dbc.add(dbcR);
		});
		object(CLAZZ)._itmCache = new FXUCL_MCDbcCache<>(
			dbc_bldr, dbc,
			MAM_ITM_R.$itm_cd,
			MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
	}
	
	protected void initItmUnitCache(MCList<MST_INSP_ACT_RECV_IF_R> inspActRecvIfL, MCList<MST_INSP_INST_R> inspInstL) {
		MCList<MAVM_ITM_UNIT_R> dbc = MCList.create(MAVM_ITM_UNIT_R.class);
		MAVM_ITM_UNIT_R t = MAVM_ITM_UNIT_R.create("ITMUNIT");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		inspInstL.forEach(r -> {
			MAVM_ITM_UNIT_R dbcR = dbc.add();
			dbcR.itm_cd(r.itm_cd());
			dbcR.itm_sub1(r.itm_sub1());
			dbcR.itm_sub2(r.itm_sub2());
			dbcR.itm_sub3(r.itm_sub3());
			dbcR.unit_cd(r.pack_unit_cd());
			dbc.add(dbcR);
		});
		object(CLAZZ)._itmUnitCache = new FXUCL_MCDbcCache<>(
			dbc_bldr, dbc,
			MAVM_ITM_UNIT_R.$itm_cd,
			MAVM_ITM_UNIT_R.$itm_sub1, MAVM_ITM_UNIT_R.$itm_sub2, MAVM_ITM_UNIT_R.$itm_sub3,
			MAVM_ITM_UNIT_R.$unit_cd);
	}
	
	protected void initItmInspCache(MCList<InspActRecvIf_Chk01_DtlR> inspActRecvIfL, MCList<MST_INSP_INST_R> inspInstL) {
		setItmInspLCache(callInspSchdServiceSrch01(inspActRecvIfL, inspInstL));
	}
	
	/**
	 * 品管関連マスタ取得処理を呼び出す
	 */
	protected MCList<InspSchd_Srch01_CndR> callInspSchdServiceSrch01(MCList<InspActRecvIf_Chk01_DtlR> inspActRecvIfL, MCList<MST_INSP_INST_R> inspInstL) {
		MSBFL_InspSchdService.InspSchd_Srch01 o = MSBFL_InspSchdService.crtInspSchd_Srch01();
		
		MCIndexKey inspInstIdx = inspInstL.createIndex(MST_INSP_INST_R.$insp_no);
		
		for (InspActRecvIf_Chk01_DtlR inspActRecvIfR : inspActRecvIfL) {
			MST_INSP_INST_R inspInstR = inspInstL.getFirst(inspInstIdx, inspActRecvIfR.insp_no());
			
			InspSchd_Srch01_CndR oR = InspSchd_Srch01_CndR.create();
			oR.peg_no(inspActRecvIfR.peg_no());
			oR.itm_cd(inspInstR.itm_cd());
			oR.itm_sub1(inspInstR.itm_sub1());
			oR.itm_sub2(inspInstR.itm_sub2());
			oR.itm_sub3(inspInstR.itm_sub3());
			oR.mfg_loc_cd(inspInstR.mfg_loc_cd());
			oR.sppl_cd(inspInstR.sppl_cd());
			oR.maker_cd(inspInstR.maker_cd());
			oR.base_dt(inspInstR.master_dt());
			oR.insp_typ(inspInstR.insp_typ());
			oR.insp_ptn_cd(inspInstR.insp_ptn_cd());
			oR.no_insp_srch_flg(true);
			oR.to_site_cd(inspInstR.to_site_cd());
			o.up0().add(oR);
		}

		o.exec();
		
		return o.down0();
	}
	
	/**
	 * 同一取込単位内で先に処理した同一キーのデータでエラーが発生したかどうか。
	 */
	protected boolean isPrevErr(MST_INSP_ACT_RECV_IF_R inspActRecvIfR) {
		return object(CLAZZ)._errSet.contains(createErrSetKey(inspActRecvIfR));
	}
	
	/**
	 * 同一取込単位内で先に処理した同一キーのデータでエラーが発生したかどうか。
	 */
	protected boolean isPrevErr(InspActRecvIf_Chk01_DtlR inspActRecvIfR) {
		return object(CLAZZ)._errSet.contains(createErrSetKey(inspActRecvIfR));
	}
	
	/**
	 * 取込単位のキーを取得する。
	 */
	protected String[] getGrpKey() {
		return new String[] {
				InspActRecvIf_Chk01_DtlR.$ext_sys_cd,
				InspActRecvIf_Chk01_DtlR.$ext_data_no,
				InspActRecvIf_Chk01_DtlR.$insp_no
				};
	}
	
	protected boolean isErr(MST_INSP_ACT_RECV_IF_R inspActRecvIfR) {
		return MAC_EXE_STS_TYP.isERR(inspActRecvIfR.exe_sts_typ());
	}
	
	protected void setErrSts(MST_INSP_ACT_RECV_IF_R exeR) {
		exeR.exe_sts_typ(MAC_EXE_STS_TYP.ERR.value());
		List<String> list = createErrSetKey(exeR);

		if (!object(CLAZZ)._errSet.contains(list)) {
			object(CLAZZ)._errSet.add(list);
		}
	}

	protected void setErrSts(InspActRecvIf_Chk01_DtlR exeR) {
		exeR.exe_sts_typ(MAC_EXE_STS_TYP.ERR.value());
		List<String> list = createErrSetKey(exeR);

		if (!object(CLAZZ)._errSet.contains(list)) {
			object(CLAZZ)._errSet.add(list);
		}
	}
	
	protected List<String> createErrSetKey(MST_INSP_ACT_RECV_IF_R r) {
		List<String> list = new ArrayList<>();

		if (!isNull(r)) {
			list.add(r.insp_no());
		}
		return list;
	}

	protected List<String> createErrSetKey(InspActRecvIf_Chk01_DtlR r) {
		List<String> list = new ArrayList<>();

		if (!isNull(r)) {
			list.add(r.insp_no());
		}
		return list;
	}
	
	/**
	 * PG実行状況区分がエラーの場合、falseを返す。
	 */
	protected boolean isExeStsTypErr(MST_INSP_ACT_RECV_IF_R inspActRecvIfR) {
		return MAC_EXE_STS_TYP.isERR(inspActRecvIfR.exe_sts_typ());
	}
	
	/**
	 * ヘッダのみを登録・更新・削除するかどうかを判定する。
	 */
	protected boolean isHeaderOnly(InspActRecvIf_Chk01_DtlR dtlR) {
		return !isNull(dtlR.ext_insp_act_no()) 
		&& isNull(dtlR.ext_insp_act_d_no()) && isNull(dtlR.ext_insp_smpl_act_no());
	}
	
	/**
	 * 検査実績明細を登録・更新・削除するかどうかを判定する。
	 */
	protected boolean isDetailRecord(InspActRecvIf_Chk01_DtlR inspActRecvIfR) {
		return !isNull(inspActRecvIfR.ext_insp_act_no()) 
		&& !isNull(inspActRecvIfR.ext_insp_act_d_no()) && isNull(inspActRecvIfR.ext_insp_smpl_act_no());
	}

	/**
	 * 検査抜取実績を登録・更新・削除するかどうかを判定する。
	 */
	protected boolean isSmplActRecord(InspActRecvIf_Chk01_DtlR inspActRecvIfR) {
		return !isNull(inspActRecvIfR.ext_insp_act_no()) 
		&& isNull(inspActRecvIfR.ext_insp_act_d_no()) && !isNull(inspActRecvIfR.ext_insp_smpl_act_no());
	}
	
	/**
	 * 明細のみを登録するかどうかを判定する。
	 */
	protected boolean isDetailOnlyIns(InspActRecvIf_Chk01_DtlR up1R) {
		Boolean isAlreadyRegist = !isNull(getInspActRCache(up1R.ext_insp_act_no()));
		return (MAC_DATA_CRUD_TYP.isCRT(up1R.data_crud_typ()) && !isHeaderOnly(up1R) && isAlreadyRegist);
	}
	
	/**
	 * 明細のみを削除するかどうかを判定する。
	 */
	protected boolean isDetailOnlyDel(InspActRecvIf_Chk01_DtlR up1R) {
		return (MAC_DATA_CRUD_TYP.isDEL(up1R.data_crud_typ()) && !isHeaderOnly(up1R));
	}
	
	protected boolean isJudgmentRequired(InspActRecvIf_Chk01_DtlR inspActRecvIfR) {
		boolean isJudgmentOnlyImport = inspActRecvIfR.imp_only_judg();

		boolean hasAnyJudgmentItem = !isNull(inspActRecvIfR.insp_judg_rslt_typ()) ||
										!isNull(inspActRecvIfR.judg_dt()) ||
										!isNull(inspActRecvIfR.judg_usr_cd()) ||
										!isNull(inspActRecvIfR.judg_dpt_cd()) ||
										!isNull(inspActRecvIfR.judg_rsn());
		
		return isJudgmentOnlyImport || hasAnyJudgmentItem;
	}
	
	protected boolean isApprovalTarget(MST_INSP_INST_R instR) {
		return instR.insp_aprv_flg();
	}
	protected MST_STK_R getStkRFromIfStkInfo(MCList<MST_STK_R> stkL, InspActRecvIf_Chk01_DtlR inspActRecvIfR) {
		String packUnitCd = getEffectPackUnitCd(inspActRecvIfR);
		
		MCIndexKey idxKey = stkL.createIndex(
				MST_STK_R.$loc_cd,
				MST_STK_R.$str_ln_cd,
				MST_STK_R.$pack_unit_cd);
	
		MST_STK_R stkR = stkL.getFirst(idxKey, 
			inspActRecvIfR.stk_loc_cd(), 
			inspActRecvIfR.stk_str_ln_cd(), 
			packUnitCd);
		
		return stkR;
	}
	
	protected String getEffectPackUnitCd(InspActRecvIf_Chk01_DtlR inspActRecvIfR) {
		String packUnitCd = "";
		
		if (isDetailRecord(inspActRecvIfR) && !inspActRecvIfR.base_flg()) {
			packUnitCd = inspActRecvIfR.pack_unit_cd();
		}
		else if (isDetailRecord(inspActRecvIfR) && inspActRecvIfR.base_flg()) {
			packUnitCd = inspActRecvIfR.ttl_pack_xfr_pack_unit_cd();
		}
		else if (isSmplActRecord(inspActRecvIfR)) {
			packUnitCd = inspActRecvIfR.smpl_pack_xfr_pack_unit_cd();
		}
		
		return packUnitCd;
	}
	
	protected MCNumber calcBaseUnitQty(InspActRecvIf_Chk01_DtlR src, String packUnitCd, MCNumber packUnitQty) {
		MST_INSP_INST_R inspInst = getInspInstRCache(src.insp_no());
		if (isSame(packUnitCd, inspInst.base_unit_cd())) {
			return packUnitQty;
		}
		else {
			MAVM_ITM_UNIT_R itmUnit = getItmUnitR(
				inspInst.itm_cd(),
				inspInst.itm_sub1(),
				inspInst.itm_sub2(),
				inspInst.itm_sub3(),
				packUnitCd
			);
			return convToBaseUnit(
				packUnitQty,
				itmUnit.conv_base_qty(),
				itmUnit.conv_qty(),
				itmUnit.dec_place(),
				itmUnit.rnd_typ()
			);
		}
	}

	//FMCB CUSTOM END
}