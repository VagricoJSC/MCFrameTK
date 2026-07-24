package mcframe.serverMSLA.MSLAL5050;

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
import mcframe.serverMBBE.MBBEL5010.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverPFUD.PFUDL0040.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL6000.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSLA.MSLAL6040.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverPF.dbc.PFT_SDRV_IF_R;
import mcframe.serverCore.resource.MCConst;
import java.util.*;
import java.util.Map.Entry;
import mcframe.serverMS.dbc.MST_ARR_PR_R;
import mcframe.serverMS.dbc.MST_DLV_INST_D_R;
import mcframe.serverMS.dbc.MST_DLV_INST_R;
import mcframe.serverMS.dbc.MST_PO_D_R;
import mcframe.serverMS.dbc.MST_PO_R;
import static mcframe.serverMSLA.MSLAL5050.Query.*;
import mcframe.serverMBBC.MBBCL5020.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_ShipActRecvIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_ShipActRecvIfService_MC extends MSLAL_ShipActRecvIfService_MC_A{
	//FMCB CUSTOM START

	/**
	 * ShipActRecvIf_Chk01オペレーション.<p>
	 *
	 * 出荷実績受信ＩＦ取込前のチェックを行う。<br>
	 */
	public class ShipActRecvIf_Chk01 extends MSLAL_ShipActRecvIfService_MC_A.ShipActRecvIf_Chk01 {
		protected MCList<MST_PO_R> _poL;
		protected MST_PO_R _poL_t = MST_PO_R.create("T");
		protected MCQueryApiBuilder _poL_bldr = MCQueryApiBuilder.create(_poL_t);
		protected MCList<MST_PO_D_R> _poDL;
		protected MST_PO_D_R _poDL_t = MST_PO_D_R.create("T");
		protected MCQueryApiBuilder _poDL_bldr = MCQueryApiBuilder.create(_poDL_t);
		protected MCList<MST_DLV_INST_D_R> _dlvInstDL;
		protected MST_DLV_INST_D_R _dlvInstDL_t = MST_DLV_INST_D_R.create("T");
		protected MCQueryApiBuilder _dlvInstDL_bldr = MCQueryApiBuilder.create(_dlvInstDL_t);
		protected MCList<MST_DLV_INST_R> _dlvInstL;
		protected MST_DLV_INST_R _dlvInstL_t = MST_DLV_INST_R.create("T");
		protected MCQueryApiBuilder _dlvInstL_bldr = MCQueryApiBuilder.create(_dlvInstL_t);
		protected MCIndexKey _poKey;
		protected MCIndexKey _poDKey;
		protected MCIndexKey _dlvInstDKey;
		protected MCIndexKey _dlvInstKey;
		
		@Override
		protected void call() {
			super.call();
		}

		protected void complForPush() {

			for (ArrActRecvIf_Chk01_DtlR r : up0()) {
				MST_PO_D_R poDR = _poDL.getFirst(_poDKey, r.po_d_no());
				if (!isNull(poDR) && !poDR.isEmpty()) {
					MST_PO_R poR = _poL.getFirst(_poKey, poDR.po_no());
					if (!isNull(poR) && !poR.isEmpty()) {
						r.push_alert_wg_cd(poR.wg_cd());
						r.push_alert_usr_cd(poR.purc_usr_cd());
					}
				}
			}
		}

		@Override
		protected void initUpSub() {

			initVal();
			cacheTran(up0());
			complForPush();
			complItmInfo();
			super.initUpSub();
		}

		protected void complItmInfo() {
			for (ArrActRecvIf_Chk01_DtlR r : up0()) {
				MST_PO_D_R poDR = _poDL.getFirst(_poDKey, r.po_d_no());
				if (!isNull(poDR) && !poDR.isEmpty()) {
					if (!isNull(r.itm_cd())) {
						r.itm_sub1(nvl(r.itm_sub1(), poDR.itm_sub1()));
						r.itm_sub2(nvl(r.itm_sub2(), poDR.itm_sub2()));
						r.itm_sub3(nvl(r.itm_sub3(), poDR.itm_sub3()));
					}
				}
			}
		}
		
		@Override
		protected void chkTran(MCMessageList msgL, MCList<ArrActRecvIf_Chk01_DtlR> tgtL) {
			
			super.chkTran(msgL, tgtL);

			for (ArrActRecvIf_Chk01_DtlR r : tgtL) {

				MST_PO_D_R poDR = _poDL.getFirst(_poDKey, r.po_d_no());
				if (isNull(poDR)) {
					msgL.add(new MCMessage(r, null, MSLAL0176, r.data_no(), r.data_lno(), r.po_d_no()));
					r.err_flg(true);
					continue;
				}
				MST_PO_R poR = _poL.getFirst(_poKey, poDR.po_no());
				if (isNull(poR) || poR.isEmpty() || !isSame(r.if_po_no(), poR.po_no())) {
					r.err_flg(true);
					msgL.add(new MCMessage(r, null, MSLAL0034, r.data_no(), r.data_lno(), r.if_po_no()));
					continue;
				}
				if (poDR.can_flg()) {
					r.err_flg(true);
					msgL.add(new MCMessage(r, null, MSLAL0203, r.data_no(), r.data_lno(), r.po_d_no()));
					continue;
				}

				if (!isNull(poR) && !isSame(poR.sppl_cd(), r.sppl_cd())) {
					msgL.add(new MCMessage(r, null, MSLAL0177, r.data_no(), r.data_lno(), r.po_d_no(), poR.sppl_cd(), r.sppl_cd()));
					r.err_flg(true);
				}
				
				if (!isNull(r.itm_cd())) {
					if (!isSame(poDR.itm_cd(), r.itm_cd()) || !isSame(poDR.itm_sub1(), r.itm_sub1())
							|| !isSame(poDR.itm_sub2(), r.itm_sub2()) || !isSame(poDR.itm_sub3(), r.itm_sub3())) {

						msgL.add(new MCMessage(r, null, MSLAL0179, r.data_no(), r.data_lno(), r.po_d_no(),
								toDispItm(poDR.itm_cd(), poDR.itm_sub1(), poDR.itm_sub2(), poDR.itm_sub3()),
								toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3())));
						r.err_flg(true);
					}
				}

				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					continue;
				}
				
				if (!isNull(r.dlv_inst_d_no())) {
					if (isNull(_dlvInstDL) || _dlvInstDL.isEmpty()) {
						r.err_flg(true);
						msgL.add(new MCMessage(r, null, MSLAL0039, r.data_no(), r.data_lno(), poDR.po_no(), r.po_d_no(), r.dlv_inst_d_no()));
					}
					else {
						MST_DLV_INST_D_R instDR = _dlvInstDL.getFirst(_dlvInstDKey, r.dlv_inst_d_no());
						if (isNull(instDR)) {
							r.err_flg(true);
							msgL.add(new MCMessage(r, null, MSLAL0039, r.data_no(), r.data_lno(), poDR.po_no(), r.po_d_no(),
									r.dlv_inst_d_no()));
						}
						else if (instDR.can_flg()) {
							r.err_flg(true);
							msgL.add(new MCMessage(r, null, MSLAL0032, r.data_no(), r.data_lno(), poDR.po_no(), r.po_d_no(),
									r.dlv_inst_d_no()));
						}
						else if (!isNull(r.dlv_inst_no()) && !isSame(instDR.dlv_inst_no(), r.dlv_inst_no())) {
							r.err_flg(true);
							msgL.add(new MCMessage(r, null, MSLAL0221, r.data_no(), r.data_lno(), r.po_d_no(), r.dlv_inst_no(),
									r.dlv_inst_d_no()));
						}
					}
				}
				else if (!isNull(r.dlv_inst_no())) {
					MST_DLV_INST_R instR = _dlvInstL.getFirst(_dlvInstKey, r.dlv_inst_no());
					if (isNull(instR)) {
						r.err_flg(true);
						msgL.add(new MCMessage(r, null, MSLAL0180, r.data_no(), r.data_lno(), r.po_d_no(), r.dlv_inst_no()));
					}
				}
			}

		}

	
		protected void addSameExtArrActNoErrMsg(ArrActRecvIf_Chk01_DtlR r, MCMessageList msgL) {
			msgL.add(new MCMessage(r, null, MSLAL0183, r.data_no(), r.data_lno(), r.sppl_cd(), r.po_d_no(), r.bp_dlv_slip_no(),
					r.bp_dlv_slip_d_no()));
		}


		@Override
		protected void chkUpDtl(MCMessageList msgL, ArrActRecvIf_Chk01_DtlR r) {
			super.chkUpDtl(msgL, r);
			
			if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				return;
			}

			MAVM_ITM_UNIT_R itmUnitR = getItmUnitR(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.trd_unit_cd());
			if (isNull(itmUnitR) || itmUnitR.isEmpty()) {
				r.err_flg(true);
				msgL.add(new MCMessage(r, null, MSLAL0178, r.data_no(), r.data_lno(), r.po_d_no(), r.bp_dlv_slip_no(), r.bp_dlv_slip_d_no(),
						toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), r.trd_unit_cd()));
			}
		}
		
		@Override
		protected void chkValidCustom(ArrActRecvIf_Chk01_DtlR r, MST_ARR_SCHD_R asR, MCMessageList msgL) {
			super.chkValidCustom(r, asR, msgL);
			if (!isNull(asR)) {
				if (asR.abort_flg()) {
					msgL.add(new MCMessage(r, null, MSLAL0181, r.data_no(), r.data_lno(), r.po_d_no(), r.bp_dlv_slip_no(),
							r.bp_dlv_slip_d_no()));
				}
			}
		}
		
		protected void cacheTran(MCList<ArrActRecvIf_Chk01_DtlR> tgtL) {

			dbSelectKey("MSLAL5050_MST_PO_D_S01", _poDL, _poDL_bldr, tgtL);
			dbSelectKey("MSLAL5050_MST_PO_S01", _poL, _poL_bldr, _poDL);

			_dlvInstL_bldr.setWhere(_dlvInstL_t.po_d_no.eq(bind("po_d_no")));
			dbSelect("MSLAL5050_MST_DLV_INST_S01", _dlvInstL, _dlvInstL_bldr, up0().groupBy(ArrActRecvIf_Chk01_DtlR.$po_d_no));
			_dlvInstKey = _dlvInstL.createIndex(MST_DLV_INST_R.$dlv_inst_no); 

			if (!isNull(_dlvInstL)) {
				MST_DLV_INST_R inst = MST_DLV_INST_R.create("INST");
				MST_PO_D_R pod = MST_PO_D_R.create("POD");
				
				_dlvInstDL_bldr.addSelect(pod.po_d_no);
				_dlvInstDL_bldr.addInnerJoin(inst, bracket(_dlvInstDL_t.dlv_inst_no.eq(inst.dlv_inst_no)));
				_dlvInstDL_bldr.addInnerJoin(pod, bracket(inst.po_d_no.eq(pod.po_d_no)));
				_dlvInstDL_bldr.setWhere(_dlvInstDL_t.dlv_inst_no.eq(bind("dlv_inst_no")));
				dbSelect("MSLAL5050_MST_DLV_INST_D_S01", _dlvInstDL, _dlvInstDL_bldr, _dlvInstL);
				_dlvInstDKey = _dlvInstDL.createIndex(MST_DLV_INST_D_R.$dlv_inst_d_no);
			}
			
			_poKey = _poL.createIndex(MST_PO_R.$po_no);
			_poDKey = _poDL.createIndex(MST_PO_D_R.$po_d_no);
			
		}
		
		protected void initVal() {
			_poL = MCList.create(MST_PO_R.class);
			_poL_bldr = MCQueryApiBuilder.create(_poL_t);
			_poDL = MCList.create(MST_PO_D_R.class);
			_poDL_bldr = MCQueryApiBuilder.create(_poDL_t);
			_dlvInstDL = MCList.create(MST_DLV_INST_D_R.class);
			_dlvInstDL_bldr = MCQueryApiBuilder.create(_dlvInstDL_t);
			_dlvInstL = MCList.create(MST_DLV_INST_R.class);
			_dlvInstL_bldr = MCQueryApiBuilder.create(_dlvInstL_t);
		}
		
		@Override
		protected void cmpleAAIfR(ArrActRecvIf_Chk01_DtlR r, MSVT_ARR_ACT_RECV_IF_R recvIfR, ArrActIF_DtlR ifR) {
			super.cmpleAAIfR(r, recvIfR, ifR);
			
			ifR.wms_flg(false);
			ifR.edi_flg(true);
		}
	}
	/**
	 * ShipActRecvIf_Upd01オペレーション.<p>
	 *
	 * 出荷実績受信ＩＦ取込を行う。（ＥＳＢのリアルタイム取込から呼び出される）<br>
	 */
	public class ShipActRecvIf_Upd01 extends MSLAL_ShipActRecvIfService_MC_A.ShipActRecvIf_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		protected MSLAL_ArrActRecvIfService.ArrActRecvIf_Upd02 getOpe(){
			return MSLAL_ShipActRecvIfService.crtShipActRecvIf_Upd02();
		}
	}
	/**
	 * ShipActRecvIf_Upd02オペレーション.<p>
	 *
	 * 出荷実績受信ＩＦ取込を行う。（ＩＦデータ確認、および出荷実績ＩＦ取込バッチから呼び出される）<br>
	 */
	public class ShipActRecvIf_Upd02 extends MSLAL_ShipActRecvIfService_MC_A.ShipActRecvIf_Upd02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MSLAL_ArrActRecvIfService.ArrActRecvIf_Upd03 getOpe() {
			return MSLAL_ShipActRecvIfService.crtShipActRecvIf_Upd03();
		}

		/**
		 * 入荷実績受信ＩＦデータを取得する。
		 */
		@Override
		protected void preSrch() {

			MSVT_ARR_ACT_RECV_IF_R t = MSVT_ARR_ACT_RECV_IF_R.create("T");
			MST_PO_D_R pod = MST_PO_D_R.create("POD");
			MST_PO_R po = MST_PO_R.create("PO");
			MCTempView v1 = createTempView("V1");
			MSVT_ARR_ACT_RECV_IF_R S1T = MSVT_ARR_ACT_RECV_IF_R.create("T");
			MST_ARR_PR_R S1PR = MST_ARR_PR_R.create("PR");
			MST_ARR_SCHD_R S1SCHD = MST_ARR_SCHD_R.create("SCHD");
			MAM_BP_R S1SPPL = MAM_BP_R.create("SPPL");
			MST_ARR_SCHD_R schd = MST_ARR_SCHD_R.create("SCHD");
			MST_ARR_PR_R pr = MST_ARR_PR_R.create("PR");
			MAM_EDI_IF_CTL_R ifctl = MAM_EDI_IF_CTL_R.create("IFCTL");
			PFT_SDRV_IF_R sdrv = PFT_SDRV_IF_R.create("SDRV");
			MCQueryApiBuilder recvIfL_bldr = MCQueryApiBuilder.create(t);
			
			_recvIfL = MCList.create(MSVT_ARR_ACT_RECV_IF_R.class);
			recvIfL_bldr.addSelect(cases().when(v1.pr("rcpt_iv_mng_no").isNull())
					.then(pod.po_no).otherwise(nullValue()).as("po_no"));
			recvIfL_bldr.addSelect(v1.pr("rcpt_iv_mng_no"));
			
			recvIfL_bldr.addLeftOuterJoin(pod, t.po_d_no.eq(pod.po_d_no));
			recvIfL_bldr.addLeftOuterJoin(po, pod.po_no.eq(po.po_no));
			// 受領インボイス管理ＮＯを取得するためのJOIN
			recvIfL_bldr
					.addLeftOuterJoin(
							subQuery()
									.select(S1T.data_lno,
											max(S1SCHD.rcpt_iv_mng_no)
													.as("rcpt_iv_mng_no"))
									.from(S1T.leftOuterJoin(S1PR)
											.on(S1T.po_d_no.eq(S1PR.po_d_no))
											.leftOuterJoin(S1SCHD)
											.on(S1PR.arr_pr_no.eq(S1SCHD.arr_pr_no)
													.and(S1T.bp_dlv_slip_no
															.eq(S1SCHD.rcpt_iv_no)))
											.leftOuterJoin(S1SPPL)
											.on(S1T.sppl_cd.eq(S1SPPL.bp_cd)))
									.where(S1SPPL.sppl_iv_flg.eq(value(true))
											.and(S1T.if_proc_typ
													.eq(value(getIfProcTyp().value()))))
									.groupBy(S1T.data_lno).view(v1),
							t.data_lno.eq(v1.pr("data_lno")));
			recvIfL_bldr.addLeftOuterJoin(schd, t.dlv_inst_d_no.eq(schd.dlv_inst_d_no));
			recvIfL_bldr.addLeftOuterJoin(pr, t.po_d_no.eq(pr.po_d_no));
			
			recvIfL_bldr.addInnerJoin(ifctl,
					t.sppl_cd.eq(ifctl.bp_cd)
							.and(ifctl.if_proc_typ.eq(t.if_proc_typ))
							.and(ifctl.st_dt.lte(t.recv_dt))
							.and(ifctl.end_dt.gte(t.recv_dt)));
			recvIfL_bldr.addLeftOuterJoin(sdrv, t.data_no.eq(sdrv.data_no));
			
			recvIfL_bldr.setWhere(value(0).eq(value(0)));
			recvIfL_bldr.addWhereWithAnd(sdrv.sdrv_sts_typ.isNull().or(
					sdrv.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.RECV_CONV_OK.value()))));
			recvIfL_bldr.addWhereWithAnd(t.imp_flg.eq(value(true)));
			recvIfL_bldr.addWhereWithAnd(trunc(t.arr_tm, MCDateFmt.DD).lte(bind("1")), getToday());
			recvIfL_bldr.addWhereWithAnd(t.if_proc_typ.eq(value(getIfProcTyp().value())));

			if (!up0().isEmpty()) {
				recvIfL_bldr.addWhereWithCutOffAnd(t.data_no.eq(bind("data_no")));
				recvIfL_bldr.addWhereWithCutOffAnd(t.sppl_cd.eq(bind("bp_cd")));
				recvIfL_bldr.addWhereWithCutOffAnd(t.ext_data_no.eq(bind("ext_data_no")));
				recvIfL_bldr.addWhereWithCutOffAnd(t.ext_sys_cd.eq(bind("ext_sys_cd")));
				dbSelect("MSLAL5050_MSVT_ARR_ACT_RECV_IF_S01", _recvIfL, recvIfL_bldr, up0());
			}
			else {
				dbSelect("MSLAL5050_MSVT_ARR_ACT_RECV_IF_S02", _recvIfL, recvIfL_bldr);
			}
		}
	
		@Override
		protected String getStartLogMsg(){
			return MSLAL0174;
		}

		@Override
		protected String getEndLogMsg(){
			return MSLAL0175;
		}
		
		
	}
	/**
	 * ShipActRecvIf_Upd03オペレーション.<p>
	 *
	 * 出荷実績受信ＩＦ取込を行う。（マルチスレッド実行用）<br>
	 */
	public class ShipActRecvIf_Upd03 extends MSLAL_ShipActRecvIfService_MC_A.ShipActRecvIf_Upd03 {
		protected int _loopCnt = MCConst.app.getInteger("MS.MSLAL5050.loop_size", 100);
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void initProc() {
			super.initProc();
			super._loopCnt = this._loopCnt;
		}
		
		@Override
		protected MSLAL_ArrActRecvIfService.ArrActRecvIf_Upd04 getOpe() {
			return MSLAL_ShipActRecvIfService.crtShipActRecvIf_Upd04();
		}
		
		@Override
		protected MSLAL_ArrActRecvIfService.ArrActRecvIf_Upd03.Map_ArrActRecvIf_Upd04_DtlR_MSVT_ARR_ACT_RECV_IF_R<ArrActRecvIf_Upd04_DtlR, MSVT_ARR_ACT_RECV_IF_R, ArrActRecvIf_Upd03_DtlR> createMap_ArrActRecvIf_Upd04_DtlR_MSVT_ARR_ACT_RECV_IF_R() {
			return new MapUpd04<ArrActRecvIf_Upd04_DtlR, MSVT_ARR_ACT_RECV_IF_R, ArrActRecvIf_Upd03_DtlR>();
		}

		public class MapUpd04<D extends ArrActRecvIf_Upd04_DtlR, S extends MSVT_ARR_ACT_RECV_IF_R, W extends ArrActRecvIf_Upd03_DtlR>
				extends MSLAL_ArrActRecvIfService.ArrActRecvIf_Upd03.Map_ArrActRecvIf_Upd04_DtlR_MSVT_ARR_ACT_RECV_IF_R<D, S, W> {
			@Override
			public void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.aa().arr_lg_grp_cd(_recvIfR.arr_lg_grp_cd());
			}
		}

		protected MCList<MSVT_ARR_ACT_RECV_IF_R> _arrSkipL;
		protected MCIndexKey _arrSkipIdx;
		@Override
		protected boolean isOkSkipByArrSkip(MSVT_ARR_ACT_RECV_IF_R exeR) {

			if (isNull(_arrSkipL) || isNull(_arrSkipL.getFirst(_arrSkipIdx, exeR.data_lno()))) {
				// 発注明細ＮＯを利用して入荷予定.入荷不要フラグを取得する
				MSW_ARR_ACT_RECV_IF_KEY_R w = MSW_ARR_ACT_RECV_IF_KEY_R.create("W");
				MCTempView v1 = createTempView("V1");
				MSW_ARR_ACT_RECV_IF_KEY_R S1W1 = MSW_ARR_ACT_RECV_IF_KEY_R.create("W1");
				MSVT_ARR_ACT_RECV_IF_R S1T1 = MSVT_ARR_ACT_RECV_IF_R.create("T1");
				MST_ARR_PR_R S1T2 = MST_ARR_PR_R.create("T2");
				MST_ARR_SCHD_R S1T3 = MST_ARR_SCHD_R.create("T3");

				_arrSkipL = MCList.create(MSVT_ARR_ACT_RECV_IF_R.class);
				MSVT_ARR_ACT_RECV_IF_R t = MSVT_ARR_ACT_RECV_IF_R.create("T");
				MCQueryApiBuilder arrSkipL_bldr = MCQueryApiBuilder.create(t);
				_arrSkipL.addBooleanColumn("arr_skip_flg");
				arrSkipL_bldr.setSelect(t.data_lno,v1.pr("arr_skip_flg"));
				arrSkipL_bldr.addInnerJoin(w, w.data_lno.eq(t.data_lno));
				arrSkipL_bldr.addLeftOuterJoin(subQuery()
						.select(S1T1.data_lno, max(S1T3.arr_skip_flg).as("arr_skip_flg"))
						.from(S1W1.innerJoin(S1T1).on(S1T1.data_lno.eq(S1W1.data_lno))
								.innerJoin(S1T2).on(S1T2.po_d_no.eq(S1T1.po_d_no))
								.innerJoin(S1T3).on(S1T3.arr_pr_no.eq(S1T2.arr_pr_no)))
						.groupBy(S1T1.data_lno).view(v1),
						v1.pr("data_lno").eq(t.data_lno));
				dbSelect("MSLAL5050_MSVT_ARR_ACT_RECV_IF_S03", _arrSkipL, arrSkipL_bldr);
				_arrSkipIdx = _arrSkipL.createIndex(MSVT_ARR_ACT_RECV_IF_R.$data_lno);
			}

			MSVT_ARR_ACT_RECV_IF_R r = _arrSkipL.getFirst(_arrSkipIdx, exeR.data_lno());
			if (r.getBoolean("arr_skip_flg")) {
				// 処理対象外（PG実行状況区分は「処理済」とする）
				return true;
			}

			// 処理対象（ただし、後続処理でエラーとなる）
			return false;
		}

		/**
		 * エラーメッセージをプッシュ通知する
		 * 
		 * @param msgList
		 */
		protected void pushAlertMsg(MCMessageList msgList) {

			if (msgList.isEmpty()) {
				return;
			}

			Map<List<String>, MCMessageList> map = new HashMap<List<String>, MCMessageList>();

			MCIndexKey ik = _exeRslt.createIndex(ArrActRecvIf_Upd04_DtlR.$log_sub_key1, ArrActRecvIf_Upd04_DtlR.$log_sub_key2);

			for (MCMessage msg : msgList) {
				MCRow causeRow = msg.getCauseRow();
				if (causeRow == null) {
					continue;
				}

				ArrActRecvIf_Upd04_DtlR exeR;
				if (causeRow instanceof ArrActRecvIf_Upd04_DtlR) {
					exeR = (ArrActRecvIf_Upd04_DtlR) causeRow;
				}
				else {
					MCNumber paramIndex = MCNumber.valueOf(causeRow.getParamIndex());
					MCNumber paramRowIndex = MCNumber.valueOf(causeRow.getParamRowIndex());

					exeR = _exeRslt.getFirst(ik, paramIndex, paramRowIndex);
				}

				if (exeR != null && !isNull(exeR.sppl_cd())) {
					List<String> keyList = new ArrayList<String>();
					keyList.add(exeR.sppl_cd());
					keyList.add(exeR.push_alert_wg_cd());
					keyList.add(exeR.push_alert_usr_cd());

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

			for (Entry<List<String>, MCMessageList> entry : map.entrySet()) {
				String spplCd = entry.getKey().get(0);
				String wgCd = entry.getKey().get(1);
				String usrCd = entry.getKey().get(2);

				pushAlert(null, wgCd, spplCd, usrCd, MODULE_ID, LOGIC_ID, OPERATION_ID, entry.getValue(), _logger, MSLAL0206,
						MCConst.lgclbl.getLabel(MODULE_ID, LOGIC_ID, null), MCDate.sysnow().toString("yyyy/MM/dd HH:mm:ss"),
						getCo().co_cd(), wgCd, spplCd);
			}
		}
	}

	/**
	 * ShipActRecvIf_Upd04オペレーション.<p>
	 *
	 * 出荷実績受信ＩＦ取込を行う。（入荷実績受信ＩＦサービスを呼び出す本処理）<br>
	 */
	public class ShipActRecvIf_Upd04 extends MSLAL_ShipActRecvIfService_MC_A.ShipActRecvIf_Upd04 {
		/*
		 * 仕入実績データ（更新前）
		 */
		protected MCList<MST_PURC_ACT_R> _purcActBfL = null;
		protected MCIndexKey _idxPurcActBf = null;
		/*
		 * 仕入実績データ（更新後）
		 */
		protected MCList<MST_PURC_ACT_R> _purcActAfL = null;
		protected MCIndexKey _idxPurcActAf = null;
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MSLAL_ArrActRecvIfService.ArrActRecvIf_Chk01 getOpe() {
			return MSLAL_ShipActRecvIfService.crtShipActRecvIf_Chk01();
		}
		
		@Override
		protected void callArrActRcptIfService(MCList<ArrActRecvIf_Upd04_DtlR> list) {
			getPurcActBf(list);
			super.callArrActRcptIfService(list);
			
			MCList<ArrActRecvIf_Upd04_DtlR> tgtList = list.subList(ArrActRecvIf_Upd04_DtlR.$exe_sts_typ, MAC_EXE_STS_TYP.OK.value());
			getPurcActAf(tgtList);
			callAttachService(tgtList);
		}
		
		/**
		 * 変更前の仕入実績データを取得する
		 * @param list 受信ＩＦデータ
		 */
		protected void getPurcActBf(MCList<ArrActRecvIf_Upd04_DtlR> list) {
			_purcActBfL = getPurcAct(list);
			_idxPurcActBf = _purcActBfL.createIndex(MST_ARR_ACT_R.$ext_sys_cd, MST_ARR_ACT_R.$ext_arr_act_no);
		}
		
		/**
		 * 変更後の仕入実績データを取得する
		 * @param list 受信ＩＦデータ
		 */
		protected void getPurcActAf(MCList<ArrActRecvIf_Upd04_DtlR> list) {
			_purcActAfL = getPurcAct(list);
			_idxPurcActAf = _purcActAfL.createIndex(MST_ARR_ACT_R.$ext_sys_cd, MST_ARR_ACT_R.$ext_arr_act_no);
		}
		
		/**
		 * 仕入実績データを取得する
		 * @param list 受信ＩＦデータ
		 */
		protected MCList<MST_PURC_ACT_R> getPurcAct(MCList<ArrActRecvIf_Upd04_DtlR> list) {
			MCList<MST_PURC_ACT_R> purcActL = MCList.create(MST_PURC_ACT_R.class);
			purcActL.addNumberColumn("trd_cur_amt_inc_tax");
			purcActL.addStringColumn(MST_ARR_ACT_R.$ext_sys_cd);
			purcActL.addStringColumn(MST_ARR_ACT_R.$ext_arr_act_no);
			
			executeQuery(purcActL, MSLAL5050_MST_PURC_ACT_S01(), list);
			return purcActL;
		}
		
		/***
		 * 受信ＩＦデータを元に、添付帳票登録サービスを呼出。
		 * 
		 * @param list 受信ＩＦデータ
		 */
		protected void callAttachService(MCList<ArrActRecvIf_Upd04_DtlR> list) {
			MBBCL_AttachService.Attach_Upd01 opAttcUpd = MBBCL_AttachService.crtAttach_Upd01();
			MBBCL_AttachService.Attach_Del01 opAttcDel = MBBCL_AttachService.crtAttach_Del01();
			String[] up0Key = new String[]{Attach_Chk01_DtlR.$biz_key1, Attach_Chk01_DtlR.$biz_key2};
			
			// up1電文
			opAttcUpd.up1().upd_cntr_chk_flg(false);
			
			for (ArrActRecvIf_Upd04_DtlR r : list) {
				
				MST_PURC_ACT_R purcActR = _purcActAfL.getFirst(_idxPurcActAf, r.ext_sys_cd(), r.ext_arr_act_no());
				
				// 添付帳票登録サービスの削除データの設定
				if (isNull(purcActR)) {
					// 仕入実績データが取得できない場合は対象外
					purcActR = _purcActBfL.getFirst(_idxPurcActBf, r.ext_sys_cd(), r.ext_arr_act_no());
					if (isNull(purcActR)) {
						continue;
					}
					
					Attach_Chk02_DtlR up0 = Attach_Chk02_DtlR.create();
					up0.biz_typ(MAC_BIZ_TYP.ARR_EDI.value());
					up0.report_id("MSLAR0050");
					up0.biz_key1(purcActR.purc_act_no());
					up0.biz_key2(purcActR.purc_act_rev().toString());
					opAttcDel.up0().add(up0);
				}
				
				// 添付帳票登録サービスの更新データの設定
				// up2(List2)電文
				Attach_Upd01_Dtl2R up2 = Attach_Upd01_Dtl2R .create();
				up2.biz_typ(MAC_BIZ_TYP.ARR_EDI.value());
				up2.report_id("MSLAR0050");
				up2.biz_key1(purcActR.purc_act_no());
				up2.biz_key2(purcActR.purc_act_rev().toString());
				up2.data_lno(r.data_lno());
				opAttcUpd.up2().add(up2);
				
				// 仕入実績ＮＯ、仕入実績改訂番号で既に設定されている場合、up0は対象外とする
				if (isNull(opAttcUpd.up0().getFirst(up0Key, up2.toArray(up0Key)))) {
					// up0(List1)電文
					Attach_Chk01_DtlR up0 = Attach_Chk01_DtlR.create();
					up0.biz_typ(MAC_BIZ_TYP.ARR_EDI.value());
					up0.report_id("MSLAR0050");
					up0.biz_key1(purcActR.purc_act_no());
					up0.biz_key2(purcActR.purc_act_rev().toString());
					up0.dt(r.recv_dt());
					up0.bp_cd(purcActR.sppl_cd());
					up0.amt(purcActR.getNumberNE("trd_cur_amt_inc_tax"));
					up0.cur_cd(purcActR.trd_cur_cd());
					up0.wg_cd(purcActR.wg_cd());
					up0.if_proc_typ(MAC_IF_PROC_TYP.SHIP_ACT_RECV.value());
					opAttcUpd.up0().add(up0);
				}
			}
			
			if (opAttcUpd.up0().size() > 0) {
				opAttcUpd.exec();
			}
			if (opAttcDel.up0().size() > 0) {
				opAttcDel.exec();
			}
		}
	}

	protected MAC_IF_PROC_TYP getIfProcTyp() {
		return MAC_IF_PROC_TYP.SHIP_ACT_RECV;
	}

	//FMCB CUSTOM END
}