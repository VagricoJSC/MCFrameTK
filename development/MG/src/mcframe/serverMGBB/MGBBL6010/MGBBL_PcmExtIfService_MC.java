package mcframe.serverMGBB.MGBBL6010;

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
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import static mcframe.serverMGUC.MGUCL0020.MGUCL_AppSys.*;
import mcframe.commonMG.constant.*;
import mcframe.serverMG.dbc.*;
import static mcframe.commonMG.notice.MG_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMG.dbc.MGFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMG.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMGBB.MGBBL6010.*;	// このimportはFrameManagerの自動生成で追加されました。

import mcframe.serverCore.mcjdbc.MCDBTransaction;
import mcframe.serverCore.mcjdbc.MCSavepoint;
import mcframe.serverCore.mcjdbc.MCTransactionManager;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import static mcframe.commonCore.lang.MCStringUtil.arrayValueJoin;

import static mcframe.commonFX.notice.FX_Msg.*;
import mcframe.serverCore.mcjdbc.MCCursor;
import mcframe.serverCore.resource.MCConst;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBBL_PcmExtIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBBL_PcmExtIfService_MC extends MGBBL_PcmExtIfService_MC_A{
	//FMCB CUSTOM START

	protected static final String EXE_STS_TYP = "exe_sts_typ";
	protected static final String DATA_NO = "data_no";
	protected static final String DATA_LNO = "data_lno";
	protected static final String BATCH_LOG_NO = "batch_log_no";
	protected static final String LOG_SUB_KEY1 = "log_sub_key1";
	protected static final String LOG_SUB_KEY2 = "log_sub_key2";

	/**
	 * PcmExtIf_Chk01オペレーション.<p>
	 *
	 * 原価外部ＩＦデータ取込前チェック<br>
	 */
	public class PcmExtIf_Chk01 extends MGBBL_PcmExtIfService_MC_A.PcmExtIf_Chk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			setDown();
		}

		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}
	}
	/**
	 * PcmExtIf_Upd01オペレーション.<p>
	 *
	 * 原価外部ＩＦデータを取り込む。<br>
	 */
	public class PcmExtIf_Upd01 extends MGBBL_PcmExtIfService_MC_A.PcmExtIf_Upd01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				initBatchLogger(dbTran());
				writeStartLogWithLogger(null);
				execMain();
			}
			catch (Exception ex) {
				handleExWithLogger(ex);
			}
			finally {
				writeEndLogWithLogger(null);
			}
		}

		protected void execMain() {
			callThisChk01();
			throwUpdErr();
			main();
		}

		protected void callThisChk01() {
			MGBBL_PcmExtIfService.PcmExtIf_Chk01 o = MGBBL_PcmExtIfService.crtPcmExtIf_Chk01();
			MCRow.copyall(o.up0(), up0());
			o.exec();
			MCRow.copyall(up0(), o.down0());
		}

		protected void main() {
			if (up0().io_flg()) {
				MGBBL_PcmExtIfService.PcmExtIf_Upd02 ope = MGBBL_PcmExtIfService.crtPcmExtIf_Upd02();
				MCRow.copyall(ope.up0(), up0());
				ope.exec();
				if (hasErrMsg()) return;
			}
			if (up0().wk_flg()) {
				MGBBL_PcmExtIfService.PcmExtIf_Upd03 ope = MGBBL_PcmExtIfService.crtPcmExtIf_Upd03();
				MCRow.copyall(ope.up0(), up0());
				ope.exec();
				if (hasErrMsg()) return;
			}
			if (up0().wip_flg()) {
				MGBBL_PcmExtIfService.PcmExtIf_Upd04 ope = MGBBL_PcmExtIfService.crtPcmExtIf_Upd04();
				MCRow.copyall(ope.up0(), up0());
				ope.exec();
				if (hasErrMsg()) return;
			}
			if (up0().stk_flg()) {
				MGBBL_PcmExtIfService.PcmExtIf_Upd05 ope = MGBBL_PcmExtIfService.crtPcmExtIf_Upd05();
				MCRow.copyall(ope.up0(), up0());
				ope.exec();
				if (hasErrMsg()) return;
			}
		}
	}
	/**
	 * PcmExtIf_Upd02オペレーション.<p>
	 *
	 * 原価受払実績ＩＦを取り込む。<br>
	 */
	public class PcmExtIf_Upd02 extends MGBBL_PcmExtIfService_MC_A.PcmExtIf_Upd02 {

		protected MCDBTransaction _mainTran = null;
		protected MCDBTransaction _rcvTran = null;

		protected MCList<MGT_IO_ACT_RCV_R> _rcvL = null;
		protected MGT_IO_ACT_RCV_R _rcvL_t = null;
		protected MCQueryApiBuilder _rcvL_bldr = null;
		protected MCList<MCRow> _noRcvL = null;
		protected int _processedRcvCount = 0;

		protected static final String MFG = "MFG";
		protected static final String PURC = "PURC";
		protected static final String INPT = "INPT";
		protected static final String IO = "IO";
		protected static final String SLS = "SLS";
		protected static final String ITM_MFG_INST = "ITM_MFG_INST";
		protected static final String INST_OPER = "INST_OPER";
		protected final String[] ACT_IF_KEY_ARRAY = {MFG, PURC, INPT, IO, SLS, ITM_MFG_INST, INST_OPER};
		protected HashMap<String, MCList<MCRow>> _ifLMap = null; // ACT_IF_KEY_ARRAYごとにifLをもつ
		protected HashMap<String, MCRow> _itmMfgInstMap = null; // 重複チェック用（品目製造指図）
		protected HashMap<String, MCRow> _instOperMap = null; // 重複チェック用（指図工程）

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				createIfTran();
				initBatchLogger(dbTran());
				writeStartLogWithLogger(MGBBD0037);
				execMain();
			}
			catch (Exception ex) {
				logger().writeProcessLog(ex instanceof MCException ? (MCException) ex
						: new MCException(ex));
			}
			finally {
				MCTransactionManager.setCurrentDBTran(_mainTran);
				MCTransactionManager.releaseDBTran(_rcvTran);
				writeEndLogWithLogger(MGBXD0003);
			}
		}

		protected void createIfTran() {
			_mainTran = dbTran();
			_rcvTran = MCTransactionManager.createDBTran();
			MCTransactionManager.setCurrentDBTran(_mainTran);
		}

		protected void execMain() {
			setRcvDbc();

			for (MCRow r : getDataNoL()) {
				delIf();

				MCSavepoint sp = dbTran().setSavepoint();

				MCQueryApiBuilder bldr = lockAndGetBuilder(r.getNumber(DATA_NO));
				MCCursor<MGT_IO_ACT_RCV_R> cur = bldr.buildSelect("MGBBL6010_MGT_IO_ACT_RCV_S03").openCursor(_rcvTran, up0(), null, MGT_IO_ACT_RCV_R.class, getFetchSize());

				try {
					while (cur.dbFetch() > 0) {
						reset();
						_rcvL = cur.getList();
						editRcvList();
						editDBCList();
						chkData();
						throwUpdErr();
						insIf();
						updRcvData();
					}
				}
				catch (MCAppException ex) {
					dbTran().rollback(sp);
					updRcvData();
					throw ex;
				}
				finally {
					cur.dbCloseCur();
					commitRcvData(r.getNumber(DATA_NO));
				}
				dbTran().commit();
			}
		}

		protected void setRcvDbc() {
			_rcvL = MCList.create(MGT_IO_ACT_RCV_R.class);
			_rcvL_t = MGT_IO_ACT_RCV_R.create("T");
			_rcvL_bldr = MCQueryApiBuilder.create(_rcvL_t);
		}

		/**
		 * 再取込時、データＮＯ毎の処理の最初に削除処理を行う<BR>
		 */
		protected void delIf() {
			if (up0().rerun_flg()) {

				// 製造実績ＩＦ
				MGT_ACT_MFG_IF_R mfg = MGT_ACT_MFG_IF_R.create("T");
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(mfg);
				dbc_bldr.setWhere(mfg.ym.eq(bind("ym")));
				if (!isNull(up0().calc_ctg_cd())) {
					dbc_bldr.addWhereWithAnd(mfg.calc_ctg_cd.eq(bind("calc_ctg_cd")));
				}
				if (!isNull(up0().wg_cd())) {
					dbc_bldr.addWhereWithAnd(mfg.wg_cd.eq(bind("wg_cd")));
				}
				dbc_bldr.buildDelete("MGBBL6010_MGT_ACT_MFG_IF_D01").executeUpdate(up0());

				// 購買実績ＩＦ
				MGT_ACT_PURC_IF_R purc = MGT_ACT_PURC_IF_R.create("T");
				dbc_bldr = MCQueryApiBuilder.create(purc);
				dbc_bldr.setWhere(purc.ym.eq(bind("ym")));
				if (!isNull(up0().calc_ctg_cd())) {
					dbc_bldr.addWhereWithAnd(purc.calc_ctg_cd.eq(bind("calc_ctg_cd")));
				}
				if (!isNull(up0().wg_cd())) {
					dbc_bldr.addWhereWithAnd(purc.wg_cd.eq(bind("wg_cd")));
				}
				dbc_bldr.buildDelete("MGBBL6010_MGT_ACT_PURC_IF_D01").executeUpdate(up0());

				// 投入実績ＩＦ
				MGT_ACT_INPT_IF_R inpt = MGT_ACT_INPT_IF_R.create("T");
				dbc_bldr = MCQueryApiBuilder.create(inpt);
				dbc_bldr.setWhere(inpt.ym.eq(bind("ym")));
				if (!isNull(up0().calc_ctg_cd())) {
					dbc_bldr.addWhereWithAnd(inpt.calc_ctg_cd.eq(bind("calc_ctg_cd")));
				}
				if (!isNull(up0().wg_cd())) {
					dbc_bldr.addWhereWithAnd(inpt.wg_cd.eq(bind("wg_cd")));
				}
				dbc_bldr.buildDelete("MGBBL6010_MGT_ACT_INPT_IF_D01").executeUpdate(up0());

				// 入出庫実績ＩＦ
				MGT_ACT_IO_IF_R io = MGT_ACT_IO_IF_R.create("T");
				dbc_bldr = MCQueryApiBuilder.create(io);
				dbc_bldr.setWhere(io.ym.eq(bind("ym")));
				if (!isNull(up0().calc_ctg_cd())) {
					dbc_bldr.addWhereWithAnd(io.calc_ctg_cd.eq(bind("calc_ctg_cd")));
				}
				if (!isNull(up0().wg_cd())) {
					dbc_bldr.addWhereWithAnd(io.wg_cd.eq(bind("wg_cd")));
				}
				dbc_bldr.buildDelete("MGBBL6010_MGT_ACT_IO_IF_D01").executeUpdate(up0());

				// 売上実績ＩＦ
				MGT_ACT_SLS_IF_R sls = MGT_ACT_SLS_IF_R.create("T");
				dbc_bldr = MCQueryApiBuilder.create(sls);
				dbc_bldr.setWhere(sls.ym.eq(bind("ym")));
				if (!isNull(up0().calc_ctg_cd())) {
					dbc_bldr.addWhereWithAnd(sls.calc_ctg_cd.eq(bind("calc_ctg_cd")));
				}
				if (!isNull(up0().wg_cd())) {
					dbc_bldr.addWhereWithAnd(sls.wg_cd.eq(bind("wg_cd")));
				}
				dbc_bldr.buildDelete("MGBBL6010_MGT_ACT_IO_IF_D01").executeUpdate(up0());

				dbTran().commit();
			}
		}

		protected MCList<MGT_IO_ACT_RCV_R> getDataNoL() {
			MCList<MGT_IO_ACT_RCV_R> dbc = _rcvL.createInstance();
			MGT_IO_ACT_RCV_R t = MGT_IO_ACT_RCV_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setDistinct();
			dbc_bldr.setSelect(t.data_no);
			dbc_bldr.setOrderByAsc(t.data_no);
			setWhere(dbc, t, dbc_bldr, null);
			dbSelect("MGBBL6010_MGT_IO_ACT_RCV_S01", dbc, dbc_bldr, up0());
			return dbc;
		}

		protected void setWhere(MCList<MGT_IO_ACT_RCV_R> dbc,
				MGT_IO_ACT_RCV_R t, MCQueryApiBuilder dbc_bldr, MCNumber dataNo) {
			dbc_bldr.setWhere(t.imp_flg.eq(value(true)));

			// 再取込時、ＰＧ実行状況区分「1：未処理」「3：エラー」による絞り込みはなし
			if (!up0().rerun_flg()) {
				dbc_bldr.addWhereWithAnd(
						t.exe_sts_typ.in(value(MAC_EXE_STS_TYP.NOT_EXE.value()),
								value(MAC_EXE_STS_TYP.ERR.value())));
			}

			dbc_bldr.addWhereWithAnd(t.ym.eq(bind("ym")));
			if (!isNull(up0().calc_ctg_cd())) {
				up0().addStringColumn("def_calc_ctg_cd", getCoParm().def_calc_ctg_cd());
				dbc_bldr.addWhereWithAnd(nvl(t.calc_ctg_cd, bind("def_calc_ctg_cd")).eq(bind("calc_ctg_cd")));
			}
			if (!isNull(up0().wg_cd())) {
				dbc_bldr.addWhereWithAnd(t.wg_cd.eq(bind("wg_cd")));
			}
			if (!isNull(dataNo)) {
				up0().addNumberColumn("data_no", dataNo);
				dbc_bldr.addWhereWithAnd(t.data_no.eq(bind("data_no")));
			}
		}

		protected void reset() {
			_rcvL = _rcvL.createInstance();
			_noRcvL = MCList.create(MCRow.class);
		}

		protected MCQueryApiBuilder lockAndGetBuilder(MCNumber dataNo) {
			// 検索条件の設定
			setWhere(_rcvL, _rcvL_t, _rcvL_bldr, dataNo);
			// ロック
			MCTransactionManager.setCurrentDBTran(_rcvTran);
			dbSelectForUpdateNoWaitNoFetch("MGBBL6010_MGT_IO_ACT_RCV_S02", _rcvL_bldr, up0());
			MCTransactionManager.returnedCurrentDBTran();
			return _rcvL_bldr;
		}

		protected void editRcvList() {
			_rcvL.sort(MGT_IO_ACT_RCV_R.$data_lno);
			// ＰＧ実行状況区分初期値は「未処理」
			_rcvL.setString(EXE_STS_TYP, MAC_EXE_STS_TYP.NOT_EXE.value());
			for (MGT_IO_ACT_RCV_R r : _rcvL) {
				if (isNull(r.getString(MGT_IO_ACT_RCV_R.$calc_ctg_cd))) {
					r.setString(MGT_IO_ACT_RCV_R.$calc_ctg_cd, getCoParm().def_calc_ctg_cd());
				}
			}
		}

		protected int _paramRowIndex;

		protected void editDBCList() {
			// チェックＯＫの受信レコード
			MCList<MGT_IO_ACT_RCV_R> rcvOkL = _rcvL.subList(EXE_STS_TYP, MAC_EXE_STS_TYP.NOT_EXE.value());

			// 編集処理で追加される行
			initMap();

			_paramRowIndex = 0;
			for (MGT_IO_ACT_RCV_R rcvRow : rcvOkL) {
				createNewIfRow(rcvRow);
				createInstNewRow(rcvRow);
				_paramRowIndex++;
			}
		}
		
		protected void initMap() {
			_ifLMap = new HashMap<String, MCList<MCRow>>();
			for (String actIfKey : ACT_IF_KEY_ARRAY) {
				_ifLMap.put(actIfKey, MCList.create(MCRow.class));
			}
			_itmMfgInstMap = new HashMap<String, MCRow>();
			_instOperMap = new HashMap<String, MCRow>();
		}

		protected void createNewIfRow(MGT_IO_ACT_RCV_R srcRow) {
			String costIoActTyp = srcRow.cost_io_act_typ();
			if (MGC_COST_IO_ACT_TYP.isMFG(costIoActTyp)
					|| MGC_COST_IO_ACT_TYP.isOUTSRC(costIoActTyp)) {
				// 製造実績ＩＦ
				MGT_ACT_MFG_IF_R newRow = MGT_ACT_MFG_IF_R.create();
				newRow.setStatus(MCRow.Status.CREATE);
				if (!isNull(srcRow)) {
					newRow.setValuesByName(srcRow);
					setAcSlipTyp(newRow, costIoActTyp);

					// 個別設定
					if (isNull(newRow.mfg_per())) {
						newRow.mfg_per(100);
					}
				}
				nullToNullVal(newRow, "itm_sub1", "itm_sub2", "itm_sub3", "mfg_act_no",
						"oper_act_no", "lot_no", "sublot_no", "sno1", "sno2", "sno3",
						"sno4", "str_ln_cd");
				newRow.setParamIndex(0);
				newRow.setParamRowIndex(_paramRowIndex);
				_ifLMap.get(MFG).add(newRow);
			}
			else if (MGC_COST_IO_ACT_TYP.isPURC(costIoActTyp)
					|| MGC_COST_IO_ACT_TYP.isXPNS_PURC(costIoActTyp)) {
						// 購買実績ＩＦ
						MGT_ACT_PURC_IF_R newRow = MGT_ACT_PURC_IF_R.create();
						newRow.setStatus(MCRow.Status.CREATE);
						if (!isNull(srcRow)) {
							newRow.setValuesByName(srcRow);
							setAcSlipTyp(newRow, costIoActTyp);

							// 個別設定
							newRow.alc_dpt_cd(srcRow.bd_dpt_cd());

							if (MGC_COST_IO_ACT_TYP.isXPNS_PURC(costIoActTyp)) {
								newRow.lot_no(nvl(srcRow.bd_lot_no(), srcRow.lot_no()));
								newRow.sublot_no(
										nvl(srcRow.bd_sublot_no(), srcRow.sublot_no()));
								newRow.sno1(nvl(srcRow.bd_sno1(), srcRow.sno1()));
								newRow.sno2(nvl(srcRow.bd_sno2(), srcRow.sno2()));
								newRow.sno3(nvl(srcRow.bd_sno3(), srcRow.sno3()));
								newRow.sno4(nvl(srcRow.bd_sno4(), srcRow.sno4()));
								newRow.alc_loc_cd(srcRow.bd_loc_cd());
								newRow.alc_oper_cd(srcRow.bd_oper_cd());
								newRow.alc_ctg_cd(srcRow.bd_ctg_cd());
							}
						}
						nullToNullVal(newRow, "itm_sub1", "itm_sub2", "itm_sub3",
								"lot_no", "sublot_no", "sno1", "sno2", "sno3", "sno4");
						newRow.setParamIndex(0);
						newRow.setParamRowIndex(_paramRowIndex);
						_ifLMap.get(PURC).add(newRow);
					}
			else if (MGC_COST_IO_ACT_TYP.isINPUT(costIoActTyp)
					|| MGC_COST_IO_ACT_TYP.isIN_ONR(costIoActTyp)
					|| MGC_COST_IO_ACT_TYP.isIN_SS(costIoActTyp)
					|| MGC_COST_IO_ACT_TYP.isBYPROD(costIoActTyp)) {
						// 投入実績ＩＦ
						MGT_ACT_INPT_IF_R newRow = MGT_ACT_INPT_IF_R.create();
						newRow.setStatus(MCRow.Status.CREATE);
						if (!isNull(srcRow)) {
							newRow.setValuesByName(srcRow);
							setAcSlipTyp(newRow, costIoActTyp);

							// 個別設定
							newRow.par_itm_cd(srcRow.bd_itm_cd());
							newRow.par_itm_sub1(srcRow.bd_itm_sub1());
							newRow.par_itm_sub2(srcRow.bd_itm_sub2());
							newRow.par_itm_sub3(srcRow.bd_itm_sub3());
							newRow.stk_bp_cd(srcRow.sppl_cd());

							if (MGC_COST_IO_ACT_TYP.isBYPROD(costIoActTyp)) {
								newRow.qty(newRow.qty().negate());
								newRow.amt(newRow.amt().negate());
								newRow.trd_cur_amt(newRow.trd_cur_amt().negate());
							}
						}
						nullToNullVal(newRow, "par_itm_sub1", "par_itm_sub2",
								"par_itm_sub3", "mfg_act_no", "oper_act_no", "str_ln_cd",
								"itm_sub1", "itm_sub2", "itm_sub3", "lot_no", "sublot_no",
								"sno1", "sno2", "sno3", "sno4");
						newRow.setParamIndex(0);
						newRow.setParamRowIndex(_paramRowIndex);
						_ifLMap.get(INPT).add(newRow);
					}
			else if (MGC_COST_IO_ACT_TYP.isFFR_PROV(costIoActTyp)
					|| MGC_COST_IO_ACT_TYP.isONR_PROV(costIoActTyp)
					|| MGC_COST_IO_ACT_TYP.isSTK_XFR(costIoActTyp)
					|| MGC_COST_IO_ACT_TYP.isOTH_CCN(costIoActTyp)
					|| MGC_COST_IO_ACT_TYP.isSTK_SW_SO(costIoActTyp)
					|| MGC_COST_IO_ACT_TYP.isSTK_SW_GR(costIoActTyp)) {
						// 入出庫実績ＩＦ
						MGT_ACT_IO_IF_R newRow = MGT_ACT_IO_IF_R.create();
						newRow.setStatus(MCRow.Status.CREATE);
						if (!isNull(srcRow)) {
							newRow.setValuesByName(srcRow);
							setAcSlipTyp(newRow, costIoActTyp);

							// 個別設定
							if (MGC_COST_IO_ACT_TYP.isFFR_PROV(costIoActTyp)
									|| MGC_COST_IO_ACT_TYP.isONR_PROV(costIoActTyp)) {
								newRow.bp_cd(srcRow.sppl_cd());
								newRow.other_wg_cd(null);
								newRow.other_dpt_cd(srcRow.mng_dpt_cd());
							}
							else {
								newRow.bp_cd(null);
								newRow.other_wg_cd(srcRow.bd_wg_cd());
								newRow.other_dpt_cd(srcRow.bd_dpt_cd());
							}
							if (MGC_COST_IO_ACT_TYP.isOTH_CCN(costIoActTyp)) {
								newRow.alc_wg_cd(srcRow.bd_wg_cd());
								newRow.alc_dpt_cd(srcRow.bd_dpt_cd());
								newRow.alc_loc_cd(srcRow.bd_loc_cd());
								newRow.alc_oper_cd(srcRow.bd_oper_cd());
								newRow.alc_bp_cd(srcRow.bd_bp_cd());
								newRow.alc_ctg_cd(srcRow.bd_ctg_cd());
								newRow.alc_itm_cd(srcRow.bd_itm_cd());
								newRow.alc_itm_sub1(srcRow.bd_itm_sub1());
								newRow.alc_itm_sub2(srcRow.bd_itm_sub2());
								newRow.alc_itm_sub3(srcRow.bd_itm_sub3());
								newRow.alc_lot_no(srcRow.bd_lot_no());
								newRow.alc_sublot_no(srcRow.bd_sublot_no());
								newRow.alc_sno1(srcRow.bd_sno1());
								newRow.alc_sno2(srcRow.bd_sno2());
								newRow.alc_sno3(srcRow.bd_sno3());
								newRow.alc_sno4(srcRow.bd_sno4());
								newRow.alc_itm_mfg_inst_no(srcRow.itm_mfg_inst_no());
							}
						}
						nullToNullVal(newRow, "itm_sub1", "itm_sub2", "itm_sub3", "lot_no", "sublot_no",
								"sno1", "sno2", "sno3", "sno4");
						newRow.setParamIndex(0);
						newRow.setParamRowIndex(_paramRowIndex);
						_ifLMap.get(IO).add(newRow);
					}
			else if (MGC_COST_IO_ACT_TYP.isSLS(costIoActTyp)) {
				// 売上実績ＩＦ
				MGT_ACT_SLS_IF_R newRow = MGT_ACT_SLS_IF_R.create();
				newRow.setStatus(MCRow.Status.CREATE);
				if (!isNull(srcRow)) {
					newRow.setValuesByName(srcRow);
					setAcSlipTyp(newRow, costIoActTyp);

					// 個別設定
					newRow.sls_usr_cd(srcRow.usr_cd());
					newRow.alc_dpt_cd(srcRow.sls_dpt_cd());
				}
				nullToNullVal(newRow, "itm_sub1", "itm_sub2", "itm_sub3", "lot_no", "sublot_no",
						"sno1", "sno2", "sno3", "sno4");
				newRow.setParamIndex(0);
				newRow.setParamRowIndex(_paramRowIndex);
				_ifLMap.get(SLS).add(newRow);
			}
		}

		protected void setAcSlipTyp(MCRow newRow, String costIoActTyp) {
			if (!isNull(newRow.getString("ac_slip_typ"))) {
				return;
			}

			if (MGC_COST_IO_ACT_TYP.isMFG(costIoActTyp)) {
				newRow.setString("ac_slip_typ", MAC_AC_SLIP_TYP.MFG.value());
			}
			else if (MGC_COST_IO_ACT_TYP.isPURC(costIoActTyp) || MGC_COST_IO_ACT_TYP.isOUTSRC(costIoActTyp)) {
				newRow.setString("ac_slip_typ", MAC_AC_SLIP_TYP.PURC.value());
			}
			else if (MGC_COST_IO_ACT_TYP.isXPNS_PURC(costIoActTyp)) {
				newRow.setString("ac_slip_typ", MAC_AC_SLIP_TYP.PURC_XPNS.value());
			}
			else if (MGC_COST_IO_ACT_TYP.isINPUT(costIoActTyp)) {
				newRow.setString("ac_slip_typ", MAC_AC_SLIP_TYP.INPUT.value());
			}
			else if (MGC_COST_IO_ACT_TYP.isIN_ONR(costIoActTyp)) {
				newRow.setString("ac_slip_typ", MAC_AC_SLIP_TYP.IN_ONR.value());
			}
			else if (MGC_COST_IO_ACT_TYP.isIN_SS(costIoActTyp)) {
				newRow.setString("ac_slip_typ", MAC_AC_SLIP_TYP.IN_SS.value());
			}
			else if (MGC_COST_IO_ACT_TYP.isBYPROD(costIoActTyp)) {
				newRow.setString("ac_slip_typ", MAC_AC_SLIP_TYP.BYPROD.value());
			}
			else if (MGC_COST_IO_ACT_TYP.isFFR_PROV(costIoActTyp)) {
				newRow.setString("ac_slip_typ", MAC_AC_SLIP_TYP.FFR_PROV.value());
			}
			else if (MGC_COST_IO_ACT_TYP.isONR_PROV(costIoActTyp)) {
				newRow.setString("ac_slip_typ", MAC_AC_SLIP_TYP.ONR_PROV.value());
			}
			else if (MGC_COST_IO_ACT_TYP.isSTK_XFR(costIoActTyp)) {
				newRow.setString("ac_slip_typ", MAC_AC_SLIP_TYP.DPT_XFR_SO.value());
			}
			else if (MGC_COST_IO_ACT_TYP.isOTH_CCN(costIoActTyp)) {
				newRow.setString("ac_slip_typ", MAC_AC_SLIP_TYP.OTH_CCN_SO.value());
			}
			else if (MGC_COST_IO_ACT_TYP.isSTK_SW_SO(costIoActTyp)) {
				newRow.setString("ac_slip_typ", MAC_AC_SLIP_TYP.STK_SW_SO.value());
			}
			else if (MGC_COST_IO_ACT_TYP.isSTK_SW_GR(costIoActTyp)) {
				newRow.setString("ac_slip_typ", MAC_AC_SLIP_TYP.STK_SW_GR.value());
			}
			else if (MGC_COST_IO_ACT_TYP.isSLS(costIoActTyp)) {
				newRow.setString("ac_slip_typ", MAC_AC_SLIP_TYP.SLS.value());
			}
		}
		
		/**
		 * 品目製造指図・指図工程の登録データを作成する
		 * @param srcRow
		 */
		protected void createInstNewRow(MGT_IO_ACT_RCV_R srcRow) {
			if(isNull(srcRow.itm_mfg_inst_no())) {
				return;
			}

			String costIoActTyp = srcRow.cost_io_act_typ();
			if (MGC_COST_IO_ACT_TYP.isMFG(costIoActTyp)
					|| MGC_COST_IO_ACT_TYP.isOUTSRC(costIoActTyp)) {
				// 製造・外注購入

				// 品目製造指図
				if(!containsKey(_itmMfgInstMap, srcRow, ITM_MFG_INST_KEYS)) {
					MGT_ITM_MFG_INST_R newRow = MGT_ITM_MFG_INST_R.create();
					newRow.setStatus(MCRow.Status.CREATE);
					newRow.addNumberColumn(DATA_LNO, srcRow.data_lno());
					newRow.setValuesByName(srcRow);
					newRow.qty(null);
					nullToNullVal(newRow, "itm_sub1", "itm_sub2", "itm_sub3", "mfg_act_no", "lot_no", "sublot_no",
							"sno1", "sno2", "sno3", "sno4");
					newRow.setParamIndex(0);
					newRow.setParamRowIndex(_paramRowIndex);
					_ifLMap.get(ITM_MFG_INST).add(newRow);
	
					// 指図工程
					if (!isNullOrNullVal(srcRow.oper_cd())) {
						if(!containsKey(_instOperMap, srcRow, INST_OPER_KEYS)) {
							MGT_INST_OPER_R newOperRow = MGT_INST_OPER_R.create();
							newOperRow.setStatus(MCRow.Status.CREATE);
							newOperRow.addNumberColumn(DATA_LNO, srcRow.data_lno());
							newOperRow.setValuesByName(srcRow);
							newOperRow.qty(null);
							nullToNullVal(newRow, "itm_sub1", "itm_sub2", "itm_sub3", "mfg_act_no", "oper_act_no");
							newOperRow.setParamIndex(0);
							newOperRow.setParamRowIndex(_paramRowIndex);
							_ifLMap.get(INST_OPER).add(newOperRow);
						}
					}
				}
			} else if(MGC_COST_IO_ACT_TYP.isINPUT(costIoActTyp)
					|| MGC_COST_IO_ACT_TYP.isIN_ONR(costIoActTyp)
					|| MGC_COST_IO_ACT_TYP.isIN_SS(costIoActTyp)
					|| MGC_COST_IO_ACT_TYP.isBYPROD(costIoActTyp)
					|| MGC_COST_IO_ACT_TYP.isXPNS_PURC(costIoActTyp)) {
				// 投入・投入（有償）・投入（自給）・副産物製造・経費購入

				// 品目製造指図
				if(!containsKey(_itmMfgInstMap, srcRow, ITM_MFG_INST_KEYS_P)) {
					MGT_ITM_MFG_INST_R newRow = MGT_ITM_MFG_INST_R.create();
					newRow.setStatus(MCRow.Status.CREATE);
					newRow.addNumberColumn(DATA_LNO, srcRow.data_lno());
					newRow.setValuesByName(srcRow);
					newRow.itm_cd(srcRow.bd_itm_cd());
					newRow.itm_sub1(srcRow.bd_itm_sub1());
					newRow.itm_sub2(srcRow.bd_itm_sub2());
					newRow.itm_sub3(srcRow.bd_itm_sub3());
					newRow.qty(null);
					nullToNullVal(newRow, "itm_sub1", "itm_sub2", "itm_sub3", "mfg_act_no", "lot_no", "sublot_no",
							"sno1", "sno2", "sno3", "sno4");
					newRow.setParamIndex(0);
					newRow.setParamRowIndex(_paramRowIndex);
					_ifLMap.get(ITM_MFG_INST).add(newRow);
	
					// 指図工程
					if (!isNullOrNullVal(srcRow.oper_cd())) {
						if(!containsKey(_instOperMap, srcRow, INST_OPER_KEYS_P)) {
							MGT_INST_OPER_R newOperRow = MGT_INST_OPER_R.create();
							newOperRow.setStatus(MCRow.Status.CREATE);
							newOperRow.addNumberColumn(DATA_LNO, srcRow.data_lno());
							newOperRow.setValuesByName(srcRow);
							newOperRow.itm_cd(srcRow.bd_itm_cd());
							newOperRow.itm_sub1(srcRow.bd_itm_sub1());
							newOperRow.itm_sub2(srcRow.bd_itm_sub2());
							newOperRow.itm_sub3(srcRow.bd_itm_sub3());
							newOperRow.qty(null);
							nullToNullVal(newRow, "itm_sub1", "itm_sub2", "itm_sub3", "mfg_act_no", "oper_act_no");
							newOperRow.setParamIndex(0);
							newOperRow.setParamRowIndex(_paramRowIndex);
							_ifLMap.get(INST_OPER).add(newOperRow);
						}
					}
				}
			}
		}
		
		protected void chkData() {
			chkReq(_ifLMap.get(MFG), "calc_ctg_cd","wg_cd","ym","ac_dt","itm_cd","itm_sub1","itm_sub2","itm_sub3","itm_mfg_inst_no","mfg_act_no","oper_act_no","lot_no","sublot_no","sno1","sno2","sno3","sno4","loc_cd","str_ln_cd","ac_slip_typ","qty","mfg_per","no_pln_flg","no_itm_info_flg");
			chkReq(_ifLMap.get(PURC), "calc_ctg_cd","wg_cd","ym","ac_dt","mng_dpt_cd","itm_cd","itm_sub1","itm_sub2","itm_sub3","lot_no","sublot_no","sno1","sno2","sno3","sno4","sppl_cd","alc_dpt_cd","ac_slip_typ","asst_typ","qty","amt","no_pln_flg","no_itm_info_flg","no_eval_flg");
			chkReq(_ifLMap.get(INPT), "calc_ctg_cd","wg_cd","ym","ac_dt","par_itm_cd","par_itm_sub1","par_itm_sub2","par_itm_sub3","itm_mfg_inst_no","mfg_act_no","oper_act_no","loc_cd","str_ln_cd","mng_dpt_cd","itm_cd","itm_sub1","itm_sub2","itm_sub3","lot_no","sublot_no","sno1","sno2","sno3","sno4","ac_slip_typ","asst_typ","qty","no_pln_flg","no_itm_info_flg","zero_effect_flg");
			chkReq(_ifLMap.get(IO), "calc_ctg_cd","wg_cd","ym","ac_dt","mng_dpt_cd","itm_cd","itm_sub1","itm_sub2","itm_sub3","lot_no","sublot_no","sno1","sno2","sno3","sno4","ac_slip_typ","asst_typ","qty","alc_amt_flg","no_pln_flg","no_itm_info_flg","zero_effect_flg");
			chkReq(_ifLMap.get(SLS), "calc_ctg_cd","wg_cd","ym","ac_dt","mng_dpt_cd","itm_cd","itm_sub1","itm_sub2","itm_sub3","lot_no","sublot_no","sno1","sno2","sno3","sno4","ac_slip_typ","asst_typ","qty","amt","no_pln_flg","no_itm_info_flg","no_eval_flg","zero_effect_flg");
			chkReq(_ifLMap.get(ITM_MFG_INST), "calc_ctg_cd","itm_cd","itm_sub1","itm_sub2","itm_sub3","itm_mfg_inst_no","mfg_act_no","wg_cd","mng_dpt_cd","lot_no","sublot_no","sno1","sno2","sno3","sno4");
			chkReq(_ifLMap.get(INST_OPER), "calc_ctg_cd","itm_cd","itm_sub1","itm_sub2","itm_sub3","itm_mfg_inst_no","mfg_act_no","oper_act_no","wg_cd","mng_dpt_cd","oper_cd","oper_seq","disp_seq");

			MCIndexKey idxIf = _rcvL.createIndex(DATA_LNO);
			for (MCMessage msgRow : MCMessagePool.getMessageList()) {
				Comparable<?>[] bind = msgRow.getCauseRow().toArray(DATA_LNO);
				MGT_IO_ACT_RCV_R errIfRow = _rcvL.getFirst(idxIf, bind);
				// ＩＦレコードをエラーにする
				errIfRow.setString(EXE_STS_TYP, MAC_EXE_STS_TYP.ERR.value());
			}
		}
		
		protected void insIf() {
			setDataLNo();

			// 製造実績ＩＦ
			MCList<MGT_ACT_MFG_IF_R> mfgL = MCList.create(MGT_ACT_MFG_IF_R.class);
			_ifLMap.get(MFG).forEach(r -> mfgL.add((MGT_ACT_MFG_IF_R)r));
			dbUpdByStatus(mfgL);

			// 購買実績ＩＦ
			MCList<MGT_ACT_PURC_IF_R> purcL = MCList.create(MGT_ACT_PURC_IF_R.class);
			_ifLMap.get(PURC).forEach(r -> purcL.add((MGT_ACT_PURC_IF_R)r));
			dbUpdByStatus(purcL);

			// 投入実績ＩＦ
			MCList<MGT_ACT_INPT_IF_R> inptL = MCList.create(MGT_ACT_INPT_IF_R.class);
			_ifLMap.get(INPT).forEach(r -> inptL.add((MGT_ACT_INPT_IF_R)r));
			dbUpdByStatus(inptL);

			// 入出庫実績ＩＦ
			MCList<MGT_ACT_IO_IF_R> ioL = MCList.create(MGT_ACT_IO_IF_R.class);
			_ifLMap.get(IO).forEach(r -> ioL.add((MGT_ACT_IO_IF_R)r));
			dbUpdByStatus(ioL);

			// 売上実績ＩＦ
			MCList<MGT_ACT_SLS_IF_R> slsL = MCList.create(MGT_ACT_SLS_IF_R.class);
			_ifLMap.get(SLS).forEach(r -> slsL.add((MGT_ACT_SLS_IF_R)r));
			dbUpdByStatus(slsL);

			MCQueryApiBuilder bldr;

			// 品目製造指図（削除→登録）
			MGT_ITM_MFG_INST_R itmMfgInst = MGT_ITM_MFG_INST_R.create("T");
			bldr = MCQueryApiBuilder.create(itmMfgInst);
			bldr.addWhereWithAnd(itmMfgInst.calc_ctg_cd.eq(bind("calc_ctg_cd")));
			bldr.addWhereWithAnd(itmMfgInst.itm_cd.eq(bind("itm_cd")));
			bldr.addWhereWithAnd(itmMfgInst.itm_sub1.eq(bind("itm_sub1")));
			bldr.addWhereWithAnd(itmMfgInst.itm_sub2.eq(bind("itm_sub2")));
			bldr.addWhereWithAnd(itmMfgInst.itm_sub3.eq(bind("itm_sub3")));
			bldr.addWhereWithAnd(itmMfgInst.itm_mfg_inst_no.eq(bind("itm_mfg_inst_no")));
			bldr.addWhereWithAnd(itmMfgInst.mfg_act_no.eq(bind("mfg_act_no")));
			bldr.buildDelete("MGBBL6010_MGT_ITM_MFG_INST_D01").executeBatchUpdate(_ifLMap.get(ITM_MFG_INST));
			bldr.buildInsert("MGBBL6010_MGT_ITM_MFG_INST_I01").executeBatchUpdate(_ifLMap.get(ITM_MFG_INST));

			// 指図工程（削除→登録）
			MGT_INST_OPER_R instOper = MGT_INST_OPER_R.create("T");
			bldr = MCQueryApiBuilder.create(instOper);
			bldr.addWhereWithAnd(instOper.calc_ctg_cd.eq(bind("calc_ctg_cd")));
			bldr.addWhereWithAnd(instOper.itm_cd.eq(bind("itm_cd")));
			bldr.addWhereWithAnd(instOper.itm_sub1.eq(bind("itm_sub1")));
			bldr.addWhereWithAnd(instOper.itm_sub2.eq(bind("itm_sub2")));
			bldr.addWhereWithAnd(instOper.itm_sub3.eq(bind("itm_sub3")));
			bldr.addWhereWithAnd(instOper.itm_mfg_inst_no.eq(bind("itm_mfg_inst_no")));
			bldr.addWhereWithAnd(instOper.mfg_act_no.eq(bind("mfg_act_no")));
			bldr.addWhereWithAnd(instOper.oper_act_no.eq(bind("oper_act_no")));
			bldr.buildDelete("MGBBL6010_MGT_INST_OPER_D01").executeBatchUpdate(_ifLMap.get(INST_OPER));
			bldr.buildInsert("MGBBL6010_MGT_INST_OPER_I01").executeBatchUpdate(_ifLMap.get(INST_OPER));
			
			MCList<MGT_IO_ACT_RCV_R> l = _rcvL.subList(EXE_STS_TYP, MAC_EXE_STS_TYP.NOT_EXE.value());
			for (MGT_IO_ACT_RCV_R r : l) {
				r.setString(EXE_STS_TYP, MAC_EXE_STS_TYP.OK.value());
			}
		}
		
		protected void setDataLNo() {
			for (String actIfKey : ACT_IF_KEY_ARRAY) {
				if (isSame(actIfKey, ITM_MFG_INST) || isSame(actIfKey, INST_OPER)) {
					continue;
				}
				// data_lno発番
				String seqStr = getSeqString(actIfKey);
				if (!isNull(seqStr)) {
					doSeqCache(seqStr, _ifLMap.get(actIfKey).size());
					for(MCRow r : _ifLMap.get(actIfKey)) {
						r.setNumberNE("data_lno", getSequence(seqStr));
					}
				}
			}
		}
		
		protected String getSeqString(String actIfKey) {
			switch(actIfKey) {
				case MFG:
					return MGC_NUM_SYS_TYP.ACT_MFG_IF_DATA_LNO.value();
				case PURC:
					return MGC_NUM_SYS_TYP.ACT_PURC_IF_DATA_LNO.value();
				case INPT:
					return MGC_NUM_SYS_TYP.ACT_INPT_IF_DATA_LNO.value();
				case IO:
					return MGC_NUM_SYS_TYP.ACT_IO_IF_DATA_LNO.value();
				case SLS:
					return MGC_NUM_SYS_TYP.ACT_SLS_IF_DATA_LNO.value();
			}
			return null;
		}

		protected void updRcvData() {
			MCTransactionManager.setCurrentDBTran(_rcvTran);
			updateRcvData();
			MCTransactionManager.returnedCurrentDBTran();
			if (_rcvL.size() > 0) {
				_processedRcvCount = _processedRcvCount + _rcvL.size();
			}
		}

		protected void updateRcvData() {
			_rcvL.removeAll(_noRcvL);
			writeBatchLog();
			// 受信テーブルの更新
			_rcvL_bldr.setSet(
					_rcvL_t.exe_sts_typ, 
					_rcvL_t.batch_log_no,
					_rcvL_t.log_sub_key1,
					_rcvL_t.log_sub_key2);
			dbUpdateKey("MGBBL6010_MGT_IO_ACT_RCV_U01", _rcvL, _rcvL_bldr);
		}

		protected void writeBatchLog() {
			logger().setLogKey(_rcvL, BATCH_LOG_NO, LOG_SUB_KEY1, LOG_SUB_KEY2);
		}

		protected void commitRcvData(MCNumber dataNo) {
			MCTransactionManager.setCurrentDBTran(_rcvTran);
			_rcvTran.commit();
			MCTransactionManager.returnedCurrentDBTran();
			if (_processedRcvCount > 0 && !hasErrMsg()) {
				logger().writeProcessLog(MGBGL0004, dataNo, _processedRcvCount);
			}
		}
	}
	/**
	 * PcmExtIf_Upd03オペレーション.<p>
	 *
	 * 原価工数情報ＩＦを取り込む。<br>
	 */
	public class PcmExtIf_Upd03 extends MGBBL_PcmExtIfService_MC_A.PcmExtIf_Upd03 {

		protected MCDBTransaction _mainTran = null;
		protected MCDBTransaction _rcvTran = null;

		protected MCList<MGT_ACT_WK_RCV_R> _rcvL = null;
		protected MGT_ACT_WK_RCV_R _rcvL_t = null;
		protected MCQueryApiBuilder _rcvL_bldr = null;
		protected MCList<MCRow> _noRcvL = null;
		protected int _processedRcvCount = 0;

		protected static final String INST_WK = "INST_WK";
		protected static final String OTHER_WK = "OTHER_WK";
		protected static final String ITM_MFG_INST = "ITM_MFG_INST";
		protected static final String INST_OPER = "INST_OPER";		
		protected final String[] ACT_IF_KEY_ARRAY = {INST_WK, OTHER_WK, ITM_MFG_INST, INST_OPER};
		protected HashMap<String, MCList<MCRow>> _ifLMap = null; // ACT_IF_KEY_ARRAYごとにifLをもつ
		protected HashMap<String, MCRow> _itmMfgInstMap = null; // 重複チェック用（品目製造指図）
		protected HashMap<String, MCRow> _instOperMap = null; // 重複チェック用（指図工程）

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				createIfTran();
				initBatchLogger(dbTran());
				writeStartLogWithLogger(MGBBD0038);
				execMain();
			}
			catch (Exception ex) {
				logger().writeProcessLog(ex instanceof MCException ? (MCException) ex
						: new MCException(ex));
			}
			finally {
				MCTransactionManager.setCurrentDBTran(_mainTran);
				MCTransactionManager.releaseDBTran(_rcvTran);
				writeEndLogWithLogger(MGBXD0003);
			}
		}

		protected void createIfTran() {
			_mainTran = dbTran();
			_rcvTran = MCTransactionManager.createDBTran();
			MCTransactionManager.setCurrentDBTran(_mainTran);
		}

		protected void execMain() {
			setRcvDbc();

			for (MCRow r : getDataNoL()) {
				delIf();

				MCSavepoint sp = dbTran().setSavepoint();

				MCQueryApiBuilder bldr = lockAndGetBuilder(r.getNumber(DATA_NO));
				MCCursor<MGT_ACT_WK_RCV_R> cur = bldr.buildSelect("MGBBL6010_MGT_ACT_WK_RCV_S03").openCursor(_rcvTran, up0(), null, MGT_ACT_WK_RCV_R.class, getFetchSize());

				try {
					while (cur.dbFetch() > 0) {
						reset();
						_rcvL = cur.getList();
						editRcvList();
						editDBCList();
						chkData();
						throwUpdErr();
						insIf();
						updRcvData();
					}
				}
				catch (MCAppException ex) {
					dbTran().rollback(sp);
					updRcvData();
					throw ex;
				}
				finally {
					cur.dbCloseCur();
					commitRcvData(r.getNumber(DATA_NO));
				}
				dbTran().commit();
			}
		}

		protected void setRcvDbc() {
			_rcvL = MCList.create(MGT_ACT_WK_RCV_R.class);
			_rcvL_t = MGT_ACT_WK_RCV_R.create("T");
			_rcvL_bldr = MCQueryApiBuilder.create(_rcvL_t);
		}

		/**
		 * 再取込時、データＮＯ毎の処理の最初に削除処理を行う<BR>
		 */
		protected void delIf() {
			if (up0().rerun_flg()) {
				// 指図工数実績ＩＦ
				MGT_ACT_INST_WK_IF_R instWk = MGT_ACT_INST_WK_IF_R.create("T");
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(instWk);
				dbc_bldr.setWhere(instWk.ym.eq(bind("ym")));
				if (!isNull(up0().calc_ctg_cd())) {
					dbc_bldr.addWhereWithAnd(instWk.calc_ctg_cd.eq(bind("calc_ctg_cd")));
				}
				if (!isNull(up0().wg_cd())) {
					dbc_bldr.addWhereWithAnd(instWk.wg_cd.eq(bind("wg_cd")));
				}
				dbc_bldr.buildDelete("MGBBL6010_MGT_ACT_INST_WK_IF_D01").executeUpdate(up0());

				// 指図外工数実績ＩＦ
				MGT_ACT_OTHER_WK_IF_R otherWk = MGT_ACT_OTHER_WK_IF_R.create("T");
				dbc_bldr = MCQueryApiBuilder.create(otherWk);
				dbc_bldr.setWhere(otherWk.ym.eq(bind("ym")));
				if (!isNull(up0().calc_ctg_cd())) {
					dbc_bldr.addWhereWithAnd(otherWk.calc_ctg_cd.eq(bind("calc_ctg_cd")));
				}
				if (!isNull(up0().wg_cd())) {
					dbc_bldr.addWhereWithAnd(otherWk.wg_cd.eq(bind("wg_cd")));
				}
				dbc_bldr.buildDelete("MGBBL6010_MGT_ACT_OTHER_WK_IF_D01").executeUpdate(up0());

				dbTran().commit();
			}
		}

		protected MCList<MGT_ACT_WK_RCV_R> getDataNoL() {
			MCList<MGT_ACT_WK_RCV_R> dbc = _rcvL.createInstance();
			MGT_ACT_WK_RCV_R t = MGT_ACT_WK_RCV_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setDistinct();
			dbc_bldr.setSelect(t.data_no);
			dbc_bldr.setOrderByAsc(t.data_no);
			setWhere(dbc, t, dbc_bldr, null);
			dbSelect("MGBBL6010_MGT_ACT_WK_RCV_S01", dbc, dbc_bldr, up0());
			return dbc;
		}

		protected void setWhere(MCList<MGT_ACT_WK_RCV_R> dbc,
				MGT_ACT_WK_RCV_R t, MCQueryApiBuilder dbc_bldr, MCNumber dataNo) {
			dbc_bldr.setWhere(t.imp_flg.eq(value(true)));

			// 再取込時、ＰＧ実行状況区分「1：未処理」「3：エラー」による絞り込みはなし
			if (!up0().rerun_flg()) {
				dbc_bldr.addWhereWithAnd(
						t.exe_sts_typ.in(value(MAC_EXE_STS_TYP.NOT_EXE.value()),
								value(MAC_EXE_STS_TYP.ERR.value())));
			}

			dbc_bldr.addWhereWithAnd(t.ym.eq(bind("ym")));
			if (!isNull(up0().calc_ctg_cd())) {
				up0().addStringColumn("def_calc_ctg_cd", getCoParm().def_calc_ctg_cd());
				dbc_bldr.addWhereWithAnd(nvl(t.calc_ctg_cd, bind("def_calc_ctg_cd")).eq(bind("calc_ctg_cd")));
			}
			if (!isNull(up0().wg_cd())) {
				dbc_bldr.addWhereWithAnd(t.wg_cd.eq(bind("wg_cd")));
			}
			if (!isNull(dataNo)) {
				up0().addNumberColumn("data_no", dataNo);
				dbc_bldr.addWhereWithAnd(t.data_no.eq(bind("data_no")));
			}
		}

		protected void reset() {
			_rcvL = _rcvL.createInstance();
			_noRcvL = MCList.create(MCRow.class);
		}

		protected MCQueryApiBuilder lockAndGetBuilder(MCNumber dataNo) {
			// 検索条件の設定
			setWhere(_rcvL, _rcvL_t, _rcvL_bldr, dataNo);
			// ロック
			MCTransactionManager.setCurrentDBTran(_rcvTran);
			dbSelectForUpdateNoWaitNoFetch("MGBBL6010_MGT_ACT_WK_RCV_S02", _rcvL_bldr, up0());
			MCTransactionManager.returnedCurrentDBTran();
			return _rcvL_bldr;
		}

		protected void editRcvList() {
			_rcvL.sort(MGT_ACT_WK_RCV_R.$data_lno);
			// ＰＧ実行状況区分初期値は「未処理」
			_rcvL.setString(EXE_STS_TYP, MAC_EXE_STS_TYP.NOT_EXE.value());
			for (MGT_ACT_WK_RCV_R r : _rcvL) {
				if (isNull(r.getString(MGT_ACT_WK_RCV_R.$calc_ctg_cd))) {
					r.setString(MGT_ACT_WK_RCV_R.$calc_ctg_cd, getCoParm().def_calc_ctg_cd());
				}
			}
		}

		protected int _paramRowIndex;
		protected MCList<MAM_LOC_R> _locCache;
		protected MCIndexKey _locCacheIdx;

		protected void editDBCList() {
			// チェックＯＫの受信レコード
			MCList<MGT_ACT_WK_RCV_R> rcvOkL = _rcvL.subList(EXE_STS_TYP, MAC_EXE_STS_TYP.NOT_EXE.value());

			// 編集処理で追加される行
			initMap();
			initLocCache(rcvOkL);

			_paramRowIndex = 0;
			for (MGT_ACT_WK_RCV_R rcvRow : rcvOkL) {
				createNewIfRow(rcvRow);
				createInstNewRow(rcvRow);
				_paramRowIndex++;
			}
		}
		
		protected void initMap() {
			_ifLMap = new HashMap<String, MCList<MCRow>>();
			for (String actIfKey : ACT_IF_KEY_ARRAY) {
				_ifLMap.put(actIfKey, MCList.create(MCRow.class));
			}
			_itmMfgInstMap = new HashMap<String, MCRow>();
			_instOperMap = new HashMap<String, MCRow>();
		}


		protected void initLocCache(MCList<MGT_ACT_WK_RCV_R> rcvL) {
			_locCache = MCList.create(MAM_LOC_R.class);
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(t.loc_cd);
			bldr.addSelect(t.sppl_cd);
			bldr.setWhere(t.loc_cd.eq(bind("loc_cd")));
			MCList<MGT_ACT_WK_RCV_R> bindL = rcvL.groupBy(MGT_ACT_WK_RCV_R.$loc_cd);
			dbSelect(createSqlId(LOGIC_ID, t, "S01"), _locCache, bldr, bindL);
			_locCacheIdx = _locCache.createIndex(MGT_ACT_WK_RCV_R.$loc_cd);
		}
		protected String getSpplCd(String locCd) {
			MAM_LOC_R locR = _locCache.getFirst(_locCacheIdx, locCd);
			return isNull(locR) ? null : locR.sppl_cd();
		}

		protected void createNewIfRow(MGT_ACT_WK_RCV_R srcRow) {
			if(!isNull(srcRow.itm_mfg_inst_no())) {
				// 指図工数実績ＩＦ
				MGT_ACT_INST_WK_IF_R newRow = MGT_ACT_INST_WK_IF_R.create();
				newRow.setStatus(MCRow.Status.CREATE);
				if (!isNull(srcRow)) {
					newRow.setValuesByName(srcRow);
				}
				nullToNullVal(newRow, "itm_sub1", "itm_sub2", "itm_sub3", "mfg_act_no", "oper_act_no", "str_ln_cd");
				newRow.setParamIndex(0);
				newRow.setParamRowIndex(_paramRowIndex);
				_ifLMap.get(INST_WK).add(newRow);
			} else {
				// 指図外工数実績ＩＦ
				MGT_ACT_OTHER_WK_IF_R newRow = MGT_ACT_OTHER_WK_IF_R.create();
				newRow.setStatus(MCRow.Status.CREATE);
				if (!isNull(srcRow)) {
					newRow.setValuesByName(srcRow);
				}
				newRow.setParamIndex(0);
				newRow.setParamRowIndex(_paramRowIndex);
				_ifLMap.get(OTHER_WK).add(newRow);
			}
		}
		
		/**
		 * 品目製造指図・指図工程の登録データを作成する
		 * @param srcRow
		 */
		protected void createInstNewRow(MGT_ACT_WK_RCV_R srcRow) {

			if(isNull(srcRow.itm_mfg_inst_no())) {
				return;
			}

			// 品目製造指図
			if(!containsKey(_itmMfgInstMap, srcRow, ITM_MFG_INST_KEYS)) {
				MGT_ITM_MFG_INST_R newRow = MGT_ITM_MFG_INST_R.create();
				newRow.setStatus(MCRow.Status.CREATE);
				newRow.addNumberColumn(DATA_LNO, srcRow.data_lno());
				newRow.setValuesByName(srcRow);
				newRow.mng_dpt_cd(srcRow.dpt_cd());
				newRow.qty(null);
				newRow.sppl_cd(getSpplCd(srcRow.loc_cd()));

				nullToNullVal(newRow, "itm_sub1", "itm_sub2", "itm_sub3", "mfg_act_no", "lot_no", "sublot_no",
						"sno1", "sno2", "sno3", "sno4");
				newRow.setParamIndex(0);
				newRow.setParamRowIndex(_paramRowIndex);
				_ifLMap.get(ITM_MFG_INST).add(newRow);

				// 指図工程
				if (!isNullOrNullVal(srcRow.oper_cd())) {
					if(!containsKey(_instOperMap, srcRow, INST_OPER_KEYS)) {
						MGT_INST_OPER_R newOperRow = MGT_INST_OPER_R.create();
						newOperRow.setStatus(MCRow.Status.CREATE);
						newOperRow.addNumberColumn(DATA_LNO, srcRow.data_lno());
						newOperRow.setValuesByName(srcRow);
						newOperRow.qty(null);
						newOperRow.mng_dpt_cd(srcRow.dpt_cd());

						nullToNullVal(newRow, "itm_sub1", "itm_sub2", "itm_sub3", "mfg_act_no", "oper_act_no");
						newOperRow.setParamIndex(0);
						newOperRow.setParamRowIndex(_paramRowIndex);
						_ifLMap.get(INST_OPER).add(newOperRow);
					}
				}
			}
		}

		protected void chkData() {
			chkReq(_ifLMap.get(INST_WK), "calc_ctg_cd","wg_cd","ym","ac_dt","itm_cd","itm_sub1","itm_sub2","itm_sub3","itm_mfg_inst_no","mfg_act_no","oper_act_no","loc_cd","str_ln_cd","wk_cost_cd","wk_cost","no_pln_flg","no_itm_info_flg","scm_if_flg");
			chkReq(_ifLMap.get(OTHER_WK), "calc_ctg_cd","wg_cd","ym","ac_dt","wk_cost_cd","wk_cost","no_pln_flg","scm_if_flg");
			chkReq(_ifLMap.get(ITM_MFG_INST), "calc_ctg_cd","itm_cd","itm_sub1","itm_sub2","itm_sub3","itm_mfg_inst_no","mfg_act_no","wg_cd","mng_dpt_cd","lot_no","sublot_no","sno1","sno2","sno3","sno4");
			chkReq(_ifLMap.get(INST_OPER), "calc_ctg_cd","itm_cd","itm_sub1","itm_sub2","itm_sub3","itm_mfg_inst_no","mfg_act_no","oper_act_no","wg_cd","mng_dpt_cd","oper_cd","oper_seq","disp_seq");

			MCIndexKey idxIf = _rcvL.createIndex(DATA_LNO);
			for (MCMessage msgRow : MCMessagePool.getMessageList()) {
				Comparable<?>[] bind = msgRow.getCauseRow().toArray(DATA_LNO);
				MGT_ACT_WK_RCV_R errIfRow = _rcvL.getFirst(idxIf, bind);
				// ＩＦレコードをエラーにする
				errIfRow.setString(EXE_STS_TYP, MAC_EXE_STS_TYP.ERR.value());
			}
		}

		protected void insIf() {
			setDataLNo();

			// 指図工数実績ＩＦ
			MCList<MGT_ACT_INST_WK_IF_R> instWkL = MCList.create(MGT_ACT_INST_WK_IF_R.class);
			_ifLMap.get(INST_WK).forEach(r -> instWkL.add((MGT_ACT_INST_WK_IF_R)r));
			dbUpdByStatus(instWkL);

			// 指図外工数実績ＩＦ
			MCList<MGT_ACT_OTHER_WK_IF_R> otherWkL = MCList.create(MGT_ACT_OTHER_WK_IF_R.class);
			_ifLMap.get(OTHER_WK).forEach(r -> otherWkL.add((MGT_ACT_OTHER_WK_IF_R)r));
			dbUpdByStatus(otherWkL);

			MCQueryApiBuilder bldr;

			// 品目製造指図（削除→登録）
			MGT_ITM_MFG_INST_R itmMfgInst = MGT_ITM_MFG_INST_R.create("T");
			bldr = MCQueryApiBuilder.create(itmMfgInst);
			bldr.addWhereWithAnd(itmMfgInst.calc_ctg_cd.eq(bind("calc_ctg_cd")));
			bldr.addWhereWithAnd(itmMfgInst.itm_cd.eq(bind("itm_cd")));
			bldr.addWhereWithAnd(itmMfgInst.itm_sub1.eq(bind("itm_sub1")));
			bldr.addWhereWithAnd(itmMfgInst.itm_sub2.eq(bind("itm_sub2")));
			bldr.addWhereWithAnd(itmMfgInst.itm_sub3.eq(bind("itm_sub3")));
			bldr.addWhereWithAnd(itmMfgInst.itm_mfg_inst_no.eq(bind("itm_mfg_inst_no")));
			bldr.addWhereWithAnd(itmMfgInst.mfg_act_no.eq(bind("mfg_act_no")));
			bldr.buildDelete("MGBBL6010_MGT_ITM_MFG_INST_D02").executeBatchUpdate(_ifLMap.get(ITM_MFG_INST));
			bldr.buildInsert("MGBBL6010_MGT_ITM_MFG_INST_I02").executeBatchUpdate(_ifLMap.get(ITM_MFG_INST));

			// 指図工程（削除→登録）
			MGT_INST_OPER_R instOper = MGT_INST_OPER_R.create("T");
			bldr = MCQueryApiBuilder.create(instOper);
			bldr.addWhereWithAnd(instOper.calc_ctg_cd.eq(bind("calc_ctg_cd")));
			bldr.addWhereWithAnd(instOper.itm_cd.eq(bind("itm_cd")));
			bldr.addWhereWithAnd(instOper.itm_sub1.eq(bind("itm_sub1")));
			bldr.addWhereWithAnd(instOper.itm_sub2.eq(bind("itm_sub2")));
			bldr.addWhereWithAnd(instOper.itm_sub3.eq(bind("itm_sub3")));
			bldr.addWhereWithAnd(instOper.itm_mfg_inst_no.eq(bind("itm_mfg_inst_no")));
			bldr.addWhereWithAnd(instOper.mfg_act_no.eq(bind("mfg_act_no")));
			bldr.addWhereWithAnd(instOper.oper_act_no.eq(bind("oper_act_no")));
			bldr.buildDelete("MGBBL6010_MGT_INST_OPER_D02").executeBatchUpdate(_ifLMap.get(INST_OPER));
			bldr.buildInsert("MGBBL6010_MGT_INST_OPER_I02").executeBatchUpdate(_ifLMap.get(INST_OPER));

			MCList<MGT_ACT_WK_RCV_R> l = _rcvL.subList(EXE_STS_TYP, MAC_EXE_STS_TYP.NOT_EXE.value());
			for (MGT_ACT_WK_RCV_R r : l) {
				r.setString(EXE_STS_TYP, MAC_EXE_STS_TYP.OK.value());
			}
		}
		
		protected void setDataLNo() {
			for (String actIfKey : ACT_IF_KEY_ARRAY) {
				if (isSame(actIfKey, ITM_MFG_INST) || isSame(actIfKey, INST_OPER)) {
					continue;
				}
				// data_lno発番
				String seqStr = getSeqString(actIfKey);
				if (!isNull(seqStr)) {
					doSeqCache(seqStr, _ifLMap.get(actIfKey).size());
					for(MCRow r : _ifLMap.get(actIfKey)) {
						r.setNumberNE("data_lno", getSequence(seqStr));
					}
				}
			}
		}
		
		protected String getSeqString(String actIfKey) {
			switch(actIfKey) {
				case INST_WK:
					return MGC_NUM_SYS_TYP.ACT_INST_WK_IF_DATA_LNO.value();
				case OTHER_WK:
					return MGC_NUM_SYS_TYP.ACT_OTHER_WK_IF_DATA_LNO.value();
			}
			return null;
		}

		protected void updRcvData() {
			MCTransactionManager.setCurrentDBTran(_rcvTran);
			updateRcvData();
			MCTransactionManager.returnedCurrentDBTran();
			if (_rcvL.size() > 0) {
				_processedRcvCount = _processedRcvCount + _rcvL.size();
			}
		}

		protected void updateRcvData() {
			_rcvL.removeAll(_noRcvL);
			writeBatchLog();
			// 受信テーブルの更新
			_rcvL_bldr.setSet(
					_rcvL_t.exe_sts_typ, 
					_rcvL_t.batch_log_no,
					_rcvL_t.log_sub_key1,
					_rcvL_t.log_sub_key2);
			dbUpdateKey("MGBBL6010_MGT_ACT_WK_RCV_U01", _rcvL, _rcvL_bldr);
		}

		protected void writeBatchLog() {
			logger().setLogKey(_rcvL, BATCH_LOG_NO, LOG_SUB_KEY1, LOG_SUB_KEY2);
		}

		protected void commitRcvData(MCNumber dataNo) {
			MCTransactionManager.setCurrentDBTran(_rcvTran);
			_rcvTran.commit();
			MCTransactionManager.returnedCurrentDBTran();
			if (_processedRcvCount > 0 && !hasErrMsg()) {
				logger().writeProcessLog(MGBGL0004, dataNo, _processedRcvCount);
			}
		}
	}
	/**
	 * PcmExtIf_Upd04オペレーション.<p>
	 *
	 * 原価指図仕掛情報ＩＦを取り込む。<br>
	 */
	public class PcmExtIf_Upd04 extends MGBBL_PcmExtIfService_MC_A.PcmExtIf_Upd04 {

		protected MCDBTransaction _mainTran = null;
		protected MCDBTransaction _rcvTran = null;

		protected MCList<MGT_ACT_INST_WIP_RCV_R> _rcvL = null;
		protected MGT_ACT_INST_WIP_RCV_R _rcvL_t = null;
		protected MCQueryApiBuilder _rcvL_bldr = null;
		protected MCList<MCRow> _noRcvL = null;
		protected int _processedRcvCount = 0;

		protected static final String INST_WIP = "INST_WIP";
		protected static final String ITM_MFG_INST = "ITM_MFG_INST";
		protected static final String INST_OPER = "INST_OPER";		
		protected final String[] ACT_IF_KEY_ARRAY = {INST_WIP, ITM_MFG_INST, INST_OPER};
		protected HashMap<String, MCList<MCRow>> _ifLMap = null; // ACT_IF_KEY_ARRAYごとにifLをもつ
		protected HashMap<String, MCRow> _itmMfgInstMap = null; // 重複チェック用（品目製造指図）
		protected HashMap<String, MCRow> _instOperMap = null; // 重複チェック用（指図工程）
		

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				createIfTran();
				initBatchLogger(dbTran());
				writeStartLogWithLogger(MGBBD0039);
				execMain();
			}
			catch (Exception ex) {
				logger().writeProcessLog(ex instanceof MCException ? (MCException) ex
						: new MCException(ex));
			}
			finally {
				MCTransactionManager.setCurrentDBTran(_mainTran);
				MCTransactionManager.releaseDBTran(_rcvTran);
				writeEndLogWithLogger(MGBXD0003);
			}
		}

		protected void createIfTran() {
			_mainTran = dbTran();
			_rcvTran = MCTransactionManager.createDBTran();
			MCTransactionManager.setCurrentDBTran(_mainTran);
		}

		protected void execMain() {
			setRcvDbc();

			for (MCRow r : getDataNoL()) {
				delIf();

				MCSavepoint sp = dbTran().setSavepoint();

				MCQueryApiBuilder bldr = lockAndGetBuilder(r.getNumber(DATA_NO));
				MCCursor<MGT_ACT_INST_WIP_RCV_R> cur = bldr.buildSelect("MGBBL6010_MGT_ACT_INST_WIP_RCV_S03").openCursor(_rcvTran, up0(), null, MGT_ACT_INST_WIP_RCV_R.class, getFetchSize());

				try {
					while (cur.dbFetch() > 0) {
						reset();
						_rcvL = cur.getList();
						editRcvList();
						editDBCList();
						chkData();
						throwUpdErr();
						insIf();
						updRcvData();
					}
				}
				catch (MCAppException ex) {
					dbTran().rollback(sp);
					updRcvData();
					throw ex;
				}
				finally {
					cur.dbCloseCur();
					commitRcvData(r.getNumber(DATA_NO));
				}
				dbTran().commit();
			}
		}

		protected void setRcvDbc() {
			_rcvL = MCList.create(MGT_ACT_INST_WIP_RCV_R.class);
			_rcvL_t = MGT_ACT_INST_WIP_RCV_R.create("T");
			_rcvL_bldr = MCQueryApiBuilder.create(_rcvL_t);
		}

		/**
		 * 再取込時、データＮＯ毎の処理の最初に削除処理を行う<BR>
		 */
		protected void delIf() {
			if (up0().rerun_flg()) {
				MGT_ACT_INST_WIP_IF_R t = MGT_ACT_INST_WIP_IF_R.create("T");
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
				dbc_bldr.setWhere(t.ym.eq(bind("ym")));
				if (!isNull(up0().calc_ctg_cd())) {
					dbc_bldr.addWhereWithAnd(t.calc_ctg_cd.eq(bind("calc_ctg_cd")));
				}
				if (!isNull(up0().wg_cd())) {
					dbc_bldr.addWhereWithAnd(t.wg_cd.eq(bind("wg_cd")));
				}
				dbc_bldr.buildDelete("MGBBL6010_MGT_ACT_INST_WIP_IF_D01").executeUpdate(up0());
				
				dbTran().commit();
			}
		}

		protected MCList<MGT_ACT_INST_WIP_RCV_R> getDataNoL() {
			MCList<MGT_ACT_INST_WIP_RCV_R> dbc = _rcvL.createInstance();
			MGT_ACT_INST_WIP_RCV_R t = MGT_ACT_INST_WIP_RCV_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setDistinct();
			dbc_bldr.setSelect(t.data_no);
			dbc_bldr.setOrderByAsc(t.data_no);
			setWhere(dbc, t, dbc_bldr, null);
			dbSelect("MGBBL6010_MGT_ACT_INST_WIP_RCV_S01", dbc, dbc_bldr, up0());
			return dbc;
		}

		protected void setWhere(MCList<MGT_ACT_INST_WIP_RCV_R> dbc,
				MGT_ACT_INST_WIP_RCV_R t, MCQueryApiBuilder dbc_bldr, MCNumber dataNo) {
			dbc_bldr.setWhere(t.imp_flg.eq(value(true)));

			// 再取込時、ＰＧ実行状況区分「1：未処理」「3：エラー」による絞り込みはなし
			if (!up0().rerun_flg()) {
				dbc_bldr.addWhereWithAnd(
						t.exe_sts_typ.in(value(MAC_EXE_STS_TYP.NOT_EXE.value()),
								value(MAC_EXE_STS_TYP.ERR.value())));
			}

			dbc_bldr.addWhereWithAnd(t.ym.eq(bind("ym")));
			if (!isNull(up0().calc_ctg_cd())) {
				up0().addStringColumn("def_calc_ctg_cd", getCoParm().def_calc_ctg_cd());
				dbc_bldr.addWhereWithAnd(nvl(t.calc_ctg_cd, bind("def_calc_ctg_cd")).eq(bind("calc_ctg_cd")));
			}
			if (!isNull(up0().wg_cd())) {
				dbc_bldr.addWhereWithAnd(t.wg_cd.eq(bind("wg_cd")));
			}
			if (!isNull(dataNo)) {
				up0().addNumberColumn("data_no", dataNo);
				dbc_bldr.addWhereWithAnd(t.data_no.eq(bind("data_no")));
			}
		}

		protected void reset() {
			_rcvL = _rcvL.createInstance();
			_noRcvL = MCList.create(MCRow.class);
		}

		protected MCQueryApiBuilder lockAndGetBuilder(MCNumber dataNo) {
			// 検索条件の設定
			setWhere(_rcvL, _rcvL_t, _rcvL_bldr, dataNo);
			// ロック
			MCTransactionManager.setCurrentDBTran(_rcvTran);
			dbSelectForUpdateNoWaitNoFetch("MGBBL6010_MGT_ACT_INST_WIP_RCV_S02", _rcvL_bldr, up0());
			MCTransactionManager.returnedCurrentDBTran();
			return _rcvL_bldr;
		}

		protected void editRcvList() {
			_rcvL.sort(MGT_ACT_INST_WIP_RCV_R.$data_lno);
			// ＰＧ実行状況区分初期値は「未処理」
			_rcvL.setString(EXE_STS_TYP, MAC_EXE_STS_TYP.NOT_EXE.value());
			for (MGT_ACT_INST_WIP_RCV_R r : _rcvL) {
				if (isNull(r.getString(MGT_ACT_INST_WIP_RCV_R.$calc_ctg_cd))) {
					r.setString(MGT_ACT_INST_WIP_RCV_R.$calc_ctg_cd, getCoParm().def_calc_ctg_cd());
				}
			}
		}

		protected int _paramRowIndex;
		protected MCList<MAM_LOC_R> _locCache;
		protected MCIndexKey _locCacheIdx;

		protected void editDBCList() {
			// チェックＯＫの受信レコード
			MCList<MGT_ACT_INST_WIP_RCV_R> rcvOkL = _rcvL.subList(EXE_STS_TYP, MAC_EXE_STS_TYP.NOT_EXE.value());

			// 編集処理で追加される行
			initMap();
			initLocCache(rcvOkL);

			_paramRowIndex = 0;
			for (MGT_ACT_INST_WIP_RCV_R rcvRow : rcvOkL) {
				createNewIfRow(rcvRow);
				createInstNewRow(rcvRow);
				_paramRowIndex++;
			}
		}
		
		protected void initMap() {
			_ifLMap = new HashMap<String, MCList<MCRow>>();
			for (String actIfKey : ACT_IF_KEY_ARRAY) {
				_ifLMap.put(actIfKey, MCList.create(MCRow.class));
			}
			_itmMfgInstMap = new HashMap<String, MCRow>();
			_instOperMap = new HashMap<String, MCRow>();
		}


		protected void initLocCache(MCList<MGT_ACT_INST_WIP_RCV_R> rcvL) {
			_locCache = MCList.create(MAM_LOC_R.class);
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(t.loc_cd);
			bldr.addSelect(t.sppl_cd);
			bldr.setWhere(t.loc_cd.eq(bind("loc_cd")));
			MCList<MGT_ACT_INST_WIP_RCV_R> bindL = rcvL.groupBy(MGT_ACT_INST_WIP_RCV_R.$loc_cd);
			dbSelect(createSqlId(LOGIC_ID, t, "S01"), _locCache, bldr, bindL);
			_locCacheIdx = _locCache.createIndex(MGT_ACT_INST_WIP_RCV_R.$loc_cd);
		}
		protected String getSpplCd(String locCd) {
			MAM_LOC_R locR = _locCache.getFirst(_locCacheIdx, locCd);
			return isNull(locR) ? null : locR.sppl_cd();
		}

		protected void createNewIfRow(MGT_ACT_INST_WIP_RCV_R srcRow) {
			MGT_ACT_INST_WIP_IF_R newRow = MGT_ACT_INST_WIP_IF_R.create();
			newRow.setStatus(MCRow.Status.CREATE);
			if (!isNull(srcRow)) {
				newRow.setValuesByName(srcRow);
			}
			nullToNullVal(newRow, "itm_sub1", "itm_sub2", "itm_sub3", "mfg_act_no", "oper_act_no", "str_ln_cd");
			newRow.setParamIndex(0);
			newRow.setParamRowIndex(_paramRowIndex);
			_ifLMap.get(INST_WIP).add(newRow);
		}
		
		/**
		 * 品目製造指図・指図工程の登録データを作成する
		 * @param srcRow
		 */
		protected void createInstNewRow(MGT_ACT_INST_WIP_RCV_R srcRow) {

			if(isNull(srcRow.itm_mfg_inst_no())) {
				return;
			}

			// 品目製造指図
			if(!containsKey(_itmMfgInstMap, srcRow, ITM_MFG_INST_KEYS)) {
				MGT_ITM_MFG_INST_R newRow = MGT_ITM_MFG_INST_R.create();
				newRow.setStatus(MCRow.Status.CREATE);
				newRow.setValuesByName(srcRow);
				newRow.addNumberColumn(DATA_LNO, srcRow.data_lno());
				newRow.qty(null);
				newRow.sppl_cd(getSpplCd(srcRow.loc_cd()));

				nullToNullVal(newRow, "itm_sub1", "itm_sub2", "itm_sub3", "mfg_act_no", "lot_no", "sublot_no",
						"sno1", "sno2", "sno3", "sno4");
				newRow.setParamIndex(0);
				newRow.setParamRowIndex(_paramRowIndex);
				_ifLMap.get(ITM_MFG_INST).add(newRow);
	
				// 指図工程
				if (!isNullOrNullVal(srcRow.oper_cd())) {
					if(!containsKey(_instOperMap, srcRow, INST_OPER_KEYS)) {
						MGT_INST_OPER_R newOperRow = MGT_INST_OPER_R.create();
						newOperRow.setStatus(MCRow.Status.CREATE);
						newOperRow.addNumberColumn(DATA_LNO, srcRow.data_lno());
						newOperRow.setValuesByName(srcRow);
						newOperRow.qty(null);
						nullToNullVal(newRow, "itm_sub1", "itm_sub2", "itm_sub3", "mfg_act_no", "oper_act_no");
						newOperRow.setParamIndex(0);
						newOperRow.setParamRowIndex(_paramRowIndex);
						_ifLMap.get(INST_OPER).add(newOperRow);
					}
				}
			}
		}

		protected void chkData() {
			chkReq(_ifLMap.get(INST_WIP), "calc_ctg_cd","wg_cd","ym","itm_cd","itm_sub1","itm_sub2","itm_sub3","itm_mfg_inst_no","mfg_act_no","oper_act_no","loc_cd","str_ln_cd","wip_qty","wip_per","scm_if_flg");
			chkReq(_ifLMap.get(ITM_MFG_INST), "calc_ctg_cd","itm_cd","itm_sub1","itm_sub2","itm_sub3","itm_mfg_inst_no","mfg_act_no","wg_cd","mng_dpt_cd","lot_no","sublot_no","sno1","sno2","sno3","sno4");
			chkReq(_ifLMap.get(INST_OPER), "calc_ctg_cd","itm_cd","itm_sub1","itm_sub2","itm_sub3","itm_mfg_inst_no","mfg_act_no","oper_act_no","wg_cd","mng_dpt_cd","oper_cd","oper_seq","disp_seq");

			MCIndexKey idxIf = _rcvL.createIndex(DATA_LNO);
			for (MCMessage msgRow : MCMessagePool.getMessageList()) {
				Comparable<?>[] bind = msgRow.getCauseRow().toArray(DATA_LNO);
				MGT_ACT_INST_WIP_RCV_R errIfRow = _rcvL.getFirst(idxIf, bind);
				// ＩＦレコードをエラーにする
				errIfRow.setString(EXE_STS_TYP, MAC_EXE_STS_TYP.ERR.value());
			}
		}

		protected void insIf() {
			setDataLNo();

			// 指図仕掛実績ＩＦ
			MCList<MGT_ACT_INST_WIP_IF_R> instWipL = MCList.create(MGT_ACT_INST_WIP_IF_R.class);
			_ifLMap.get(INST_WIP).forEach(r -> instWipL.add((MGT_ACT_INST_WIP_IF_R)r));
			dbUpdByStatus(instWipL);

			MCQueryApiBuilder bldr;

			// 品目製造指図（削除→登録）
			MGT_ITM_MFG_INST_R itmMfgInst = MGT_ITM_MFG_INST_R.create("T");
			bldr = MCQueryApiBuilder.create(itmMfgInst);
			bldr.addWhereWithAnd(itmMfgInst.calc_ctg_cd.eq(bind("calc_ctg_cd")));
			bldr.addWhereWithAnd(itmMfgInst.itm_cd.eq(bind("itm_cd")));
			bldr.addWhereWithAnd(itmMfgInst.itm_sub1.eq(bind("itm_sub1")));
			bldr.addWhereWithAnd(itmMfgInst.itm_sub2.eq(bind("itm_sub2")));
			bldr.addWhereWithAnd(itmMfgInst.itm_sub3.eq(bind("itm_sub3")));
			bldr.addWhereWithAnd(itmMfgInst.itm_mfg_inst_no.eq(bind("itm_mfg_inst_no")));
			bldr.addWhereWithAnd(itmMfgInst.mfg_act_no.eq(bind("mfg_act_no")));
			bldr.buildDelete("MGBBL6010_MGT_ITM_MFG_INST_D03").executeBatchUpdate(_ifLMap.get(ITM_MFG_INST));
			bldr.buildInsert("MGBBL6010_MGT_ITM_MFG_INST_I03").executeBatchUpdate(_ifLMap.get(ITM_MFG_INST));

			// 指図工程（削除→登録）
			MGT_INST_OPER_R instOper = MGT_INST_OPER_R.create("T");
			bldr = MCQueryApiBuilder.create(instOper);
			bldr.addWhereWithAnd(instOper.calc_ctg_cd.eq(bind("calc_ctg_cd")));
			bldr.addWhereWithAnd(instOper.itm_cd.eq(bind("itm_cd")));
			bldr.addWhereWithAnd(instOper.itm_sub1.eq(bind("itm_sub1")));
			bldr.addWhereWithAnd(instOper.itm_sub2.eq(bind("itm_sub2")));
			bldr.addWhereWithAnd(instOper.itm_sub3.eq(bind("itm_sub3")));
			bldr.addWhereWithAnd(instOper.itm_mfg_inst_no.eq(bind("itm_mfg_inst_no")));
			bldr.addWhereWithAnd(instOper.mfg_act_no.eq(bind("mfg_act_no")));
			bldr.addWhereWithAnd(instOper.oper_act_no.eq(bind("oper_act_no")));
			bldr.buildDelete("MGBBL6010_MGT_INST_OPER_D03").executeBatchUpdate(_ifLMap.get(INST_OPER));
			bldr.buildInsert("MGBBL6010_MGT_INST_OPER_I03").executeBatchUpdate(_ifLMap.get(INST_OPER));

			MCList<MGT_ACT_INST_WIP_RCV_R> l = _rcvL.subList(EXE_STS_TYP, MAC_EXE_STS_TYP.NOT_EXE.value());
			for (MGT_ACT_INST_WIP_RCV_R r : l) {
				r.setString(EXE_STS_TYP, MAC_EXE_STS_TYP.OK.value());
			}
		}
		
		protected void setDataLNo() {
			for (String actIfKey : ACT_IF_KEY_ARRAY) {
				if (isSame(actIfKey, ITM_MFG_INST) || isSame(actIfKey, INST_OPER)) {
					continue;
				}
				// data_lno発番
				String seqStr = getSeqString(actIfKey);
				if (!isNull(seqStr)) {
					doSeqCache(seqStr, _ifLMap.get(actIfKey).size());
					for(MCRow r : _ifLMap.get(actIfKey)) {
						r.setNumberNE("data_lno", getSequence(seqStr));
					}
				}
			}
		}
		
		protected String getSeqString(String actIfKey) {
			switch(actIfKey) {
				case INST_WIP:
					return MGC_NUM_SYS_TYP.ACT_INST_WIP_IF_DATA_LNO.value();
			}
			return null;
		}

		protected void updRcvData() {
			MCTransactionManager.setCurrentDBTran(_rcvTran);
			updateRcvData();
			MCTransactionManager.returnedCurrentDBTran();
			if (_rcvL.size() > 0) {
				_processedRcvCount = _processedRcvCount + _rcvL.size();
			}
		}

		protected void updateRcvData() {
			_rcvL.removeAll(_noRcvL);
			writeBatchLog();
			// 受信テーブルの更新
			_rcvL_bldr.setSet(
					_rcvL_t.exe_sts_typ, 
					_rcvL_t.batch_log_no,
					_rcvL_t.log_sub_key1,
					_rcvL_t.log_sub_key2);
			dbUpdateKey("MGBBL6010_MGT_ACT_INST_WIP_RCV_U01", _rcvL, _rcvL_bldr);
		}

		protected void writeBatchLog() {
			logger().setLogKey(_rcvL, BATCH_LOG_NO, LOG_SUB_KEY1, LOG_SUB_KEY2);
		}

		protected void commitRcvData(MCNumber dataNo) {
			MCTransactionManager.setCurrentDBTran(_rcvTran);
			_rcvTran.commit();
			MCTransactionManager.returnedCurrentDBTran();
			if (_processedRcvCount > 0 && !hasErrMsg()) {
				logger().writeProcessLog(MGBGL0004, dataNo, _processedRcvCount);
			}
		}
	
	}
	/**
	 * PcmExtIf_Upd05オペレーション.<p>
	 *
	 * 原価在庫情報ＩＦを取り込む。<br>
	 */
	public class PcmExtIf_Upd05 extends MGBBL_PcmExtIfService_MC_A.PcmExtIf_Upd05 {

		protected MCDBTransaction _mainTran = null;
		protected MCDBTransaction _rcvTran = null;

		protected MCList<MGT_ACT_STK_RCV_R> _rcvL = null;
		protected MGT_ACT_STK_RCV_R _rcvL_t = null;
		protected MCQueryApiBuilder _rcvL_bldr = null;
		protected MCList<MCRow> _noRcvL = null;
		protected int _processedRcvCount = 0;
		protected MCList<MCRow> _ifL = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				createIfTran();
				initBatchLogger(dbTran());
				writeStartLogWithLogger(MGBBD0040);
				execMain();
			}
			catch (Exception ex) {
				logger().writeProcessLog(ex instanceof MCException ? (MCException) ex
						: new MCException(ex));
			}
			finally {
				MCTransactionManager.setCurrentDBTran(_mainTran);
				MCTransactionManager.releaseDBTran(_rcvTran);
				writeEndLogWithLogger(MGBXD0003);
			}
		}

		protected void createIfTran() {
			_mainTran = dbTran();
			_rcvTran = MCTransactionManager.createDBTran();
			MCTransactionManager.setCurrentDBTran(_mainTran);
		}

		protected void execMain() {
			setRcvDbc();

			for (MCRow r : getDataNoL()) {
				delIf();

				MCSavepoint sp = dbTran().setSavepoint();

				MCQueryApiBuilder bldr = lockAndGetBuilder(r.getNumber(DATA_NO));
				MCCursor<MGT_ACT_STK_RCV_R> cur = bldr.buildSelect("MGBBL6010_MGT_ACT_STK_RCV_S03").openCursor(_rcvTran, up0(), null, MGT_ACT_STK_RCV_R.class, getFetchSize());

				try {
					while (cur.dbFetch() > 0) {
						reset();
						_rcvL = cur.getList();
						editRcvList();
						editDBCList();
						chkData();
						throwUpdErr();
						insIf();
						updRcvData();
					}
				}
				catch (MCAppException ex) {
					dbTran().rollback(sp);
					updRcvData();
					throw ex;
				}
				finally {
					cur.dbCloseCur();
					commitRcvData(r.getNumber(DATA_NO));
				}
				dbTran().commit();
			}
		}

		protected void setRcvDbc() {
			_rcvL = MCList.create(MGT_ACT_STK_RCV_R.class);
			_rcvL_t = MGT_ACT_STK_RCV_R.create("T");
			_rcvL_bldr = MCQueryApiBuilder.create(_rcvL_t);
		}

		/**
		 * 再取込時、データＮＯ毎の処理の最初に削除処理を行う<BR>
		 */
		protected void delIf() {
			if (up0().rerun_flg()) {
				MGT_ACT_STK_IF_R t = MGT_ACT_STK_IF_R.create("T");
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
				dbc_bldr.setWhere(t.ym.eq(bind("ym")));
				if (!isNull(up0().calc_ctg_cd())) {
					dbc_bldr.addWhereWithAnd(t.calc_ctg_cd.eq(bind("calc_ctg_cd")));
				}
				if (!isNull(up0().wg_cd())) {
					dbc_bldr.addWhereWithAnd(t.wg_cd.eq(bind("wg_cd")));
				}
				dbc_bldr.buildDelete("MGBBL6010_MGT_ACT_STK_IF_D01").executeUpdate(up0());
				
				dbTran().commit();
			}
		}

		protected MCList<MGT_ACT_STK_RCV_R> getDataNoL() {
			MCList<MGT_ACT_STK_RCV_R> dbc = _rcvL.createInstance();
			MGT_ACT_STK_RCV_R t = MGT_ACT_STK_RCV_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setDistinct();
			dbc_bldr.setSelect(t.data_no);
			dbc_bldr.setOrderByAsc(t.data_no);
			setWhere(dbc, t, dbc_bldr, null);
			dbSelect("MGBBL6010_MGT_ACT_STK_RCV_S01", dbc, dbc_bldr, up0());
			return dbc;
		}

		protected void setWhere(MCList<MGT_ACT_STK_RCV_R> dbc,
				MGT_ACT_STK_RCV_R t, MCQueryApiBuilder dbc_bldr, MCNumber dataNo) {
			dbc_bldr.setWhere(t.imp_flg.eq(value(true)));

			// 再取込時、ＰＧ実行状況区分「1：未処理」「3：エラー」による絞り込みはなし
			if (!up0().rerun_flg()) {
				dbc_bldr.addWhereWithAnd(
						t.exe_sts_typ.in(value(MAC_EXE_STS_TYP.NOT_EXE.value()),
								value(MAC_EXE_STS_TYP.ERR.value())));
			}

			dbc_bldr.addWhereWithAnd(t.ym.eq(bind("ym")));
			if (!isNull(up0().calc_ctg_cd())) {
				up0().addStringColumn("def_calc_ctg_cd", getCoParm().def_calc_ctg_cd());
				dbc_bldr.addWhereWithAnd(nvl(t.calc_ctg_cd, bind("def_calc_ctg_cd")).eq(bind("calc_ctg_cd")));
			}
			if (!isNull(up0().wg_cd())) {
				dbc_bldr.addWhereWithAnd(t.wg_cd.eq(bind("wg_cd")));
			}
			if (!isNull(dataNo)) {
				up0().addNumberColumn("data_no", dataNo);
				dbc_bldr.addWhereWithAnd(t.data_no.eq(bind("data_no")));
			}
		}

		protected void reset() {
			_rcvL = _rcvL.createInstance();
			_noRcvL = MCList.create(MCRow.class);
		}

		protected MCQueryApiBuilder lockAndGetBuilder(MCNumber dataNo) {
			// 検索条件の設定
			setWhere(_rcvL, _rcvL_t, _rcvL_bldr, dataNo);
			// ロック
			MCTransactionManager.setCurrentDBTran(_rcvTran);
			dbSelectForUpdateNoWaitNoFetch("MGBBL6010_MGT_ACT_STK_RCV_S02", _rcvL_bldr, up0());
			MCTransactionManager.returnedCurrentDBTran();
			return _rcvL_bldr;
		}

		protected void editRcvList() {
			_rcvL.sort(MGT_ACT_STK_RCV_R.$data_lno);
			// ＰＧ実行状況区分初期値は「未処理」
			_rcvL.setString(EXE_STS_TYP, MAC_EXE_STS_TYP.NOT_EXE.value());
			for (MGT_ACT_STK_RCV_R r : _rcvL) {
				if (isNull(r.getString(MGT_ACT_STK_RCV_R.$calc_ctg_cd))) {
					r.setString(MGT_ACT_STK_RCV_R.$calc_ctg_cd, getCoParm().def_calc_ctg_cd());
				}
			}
		}

		protected void editDBCList() {
			// チェックＯＫの受信レコード
			MCList<MGT_ACT_STK_RCV_R> rcvOkL = _rcvL.subList(EXE_STS_TYP, MAC_EXE_STS_TYP.NOT_EXE.value());

			// 編集処理で追加される行
			_ifL = MCList.create(MCRow.class);

			for (MGT_ACT_STK_RCV_R rcvRow : rcvOkL) {
				MCRow tmpRow = createNewIfRow(rcvRow);
				_ifL.add(tmpRow);
			}

			int paramRowIndex = 0;
			for (MCRow r : _ifL) {
				r.setParamIndex(0);
				r.setParamRowIndex(paramRowIndex);
				paramRowIndex++;
			}
		}

		protected MCRow createNewIfRow(MGT_ACT_STK_RCV_R srcRow) {
			MGT_ACT_STK_IF_R newRow = MGT_ACT_STK_IF_R.create();
			newRow.setStatus(MCRow.Status.CREATE);
			if (!isNull(srcRow)) {
				newRow.setValuesByName(srcRow);
			}
			nullToNullVal(newRow, "itm_sub1", "itm_sub2", "itm_sub3", "lot_no", "sublot_no", "sno1", "sno2", "sno3", "sno4");
			return newRow;
		}

		protected void chkData() {
			chkReq(_ifL, "calc_ctg_cd","wg_cd","ym","mng_dpt_cd","itm_cd","itm_sub1","itm_sub2","itm_sub3","lot_no","sublot_no","sno1","sno2","sno3","sno4","asst_typ","qty","scm_if_flg");

			MCIndexKey idxIf = _rcvL.createIndex(DATA_LNO);
			for (MCMessage msgRow : MCMessagePool.getMessageList()) {
				Comparable<?>[] bind = msgRow.getCauseRow().toArray(DATA_LNO);
				MGT_ACT_STK_RCV_R errIfRow = _rcvL.getFirst(idxIf, bind);
				// ＩＦレコードをエラーにする
				errIfRow.setString(EXE_STS_TYP, MAC_EXE_STS_TYP.ERR.value());
			}
		}

		protected void insIf() {
			setDataLNo();

			// 在庫実績ＩＦ
			MCList<MGT_ACT_STK_IF_R> dbcL = MCList.create(MGT_ACT_STK_IF_R.class);
			_ifL.forEach(r -> dbcL.add((MGT_ACT_STK_IF_R)r));
			dbUpdByStatus(dbcL);

			MCList<MGT_ACT_STK_RCV_R> l = _rcvL.subList(EXE_STS_TYP, MAC_EXE_STS_TYP.NOT_EXE.value());
			for (MGT_ACT_STK_RCV_R r : l) {
				r.setString(EXE_STS_TYP, MAC_EXE_STS_TYP.OK.value());
			}
		}
		
		protected void setDataLNo() {
			// data_lno発番
			String seqStr = getSeqString();
			doSeqCache(seqStr, _ifL.size());
			for(MCRow r : _ifL) {
				r.setNumberNE("data_lno", getSequence(seqStr));
			}
		}
		
		protected String getSeqString() {
			return MGC_NUM_SYS_TYP.ACT_STK_IF_DATA_LNO.value();
		}

		protected void updRcvData() {
			MCTransactionManager.setCurrentDBTran(_rcvTran);
			updateRcvData();
			MCTransactionManager.returnedCurrentDBTran();
			if (_rcvL.size() > 0) {
				_processedRcvCount = _processedRcvCount + _rcvL.size();
			}
		}

		protected void updateRcvData() {
			_rcvL.removeAll(_noRcvL);
			writeBatchLog();
			// 受信テーブルの更新
			_rcvL_bldr.setSet(
					_rcvL_t.exe_sts_typ, 
					_rcvL_t.batch_log_no,
					_rcvL_t.log_sub_key1,
					_rcvL_t.log_sub_key2);
			dbUpdateKey("MGBBL6010_MGT_ACT_STK_RCV_U01", _rcvL, _rcvL_bldr);
		}

		protected void writeBatchLog() {
			logger().setLogKey(_rcvL, BATCH_LOG_NO, LOG_SUB_KEY1, LOG_SUB_KEY2);
		}

		protected void commitRcvData(MCNumber dataNo) {
			MCTransactionManager.setCurrentDBTran(_rcvTran);
			_rcvTran.commit();
			MCTransactionManager.returnedCurrentDBTran();
			if (_processedRcvCount > 0 && !hasErrMsg()) {
				logger().writeProcessLog(MGBGL0004, dataNo, _processedRcvCount);
			}
		}
	}

	/** 
	 * RCVデータ取得時のフェッチサイズ
	 * */
	protected int getFetchSize() {
		return MCConst.app.getInteger("MG.MGBBL6010.fetch_size", 5000);
	}

	///////////////////////////////////////////////////////////////////
	// 重複チェック

	protected static final String[] ITM_MFG_INST_KEYS = {
			"calc_ctg_cd", "itm_cd", "itm_sub1", "itm_sub2", "itm_sub3",
			"itm_mfg_inst_no", "mfg_act_no"
	};

	protected static final String[] ITM_MFG_INST_KEYS_P = {
			"calc_ctg_cd", "bd_itm_cd", "bd_itm_sub1", "bd_itm_sub2", "bd_itm_sub3",
			"itm_mfg_inst_no", "mfg_act_no"
	};

	protected static final String[] INST_OPER_KEYS = {
			"calc_ctg_cd", "itm_cd", "itm_sub1", "itm_sub2", "itm_sub3",
			"itm_mfg_inst_no", "mfg_act_no", "oper_act_no"
	};

	protected static final String[] INST_OPER_KEYS_P = {
			"calc_ctg_cd", "bd_itm_cd", "bd_itm_sub1", "bd_itm_sub2", "bd_itm_sub3",
			"itm_mfg_inst_no", "mfg_act_no", "oper_act_no"
	};

	/**
	 * 複数のStringを結合して一意なキーを生成
	 */
	protected String createCombinedKey(MCRow row, String... columns) {
		List<String> keys = new ArrayList<String>();
		for (String column : columns) {
			keys.add(nvl(row.getStringNE(column), MAC_STR.NULL_VAL.value()));
		}
		return arrayValueJoin(keys.toArray(new String[] {}));
	}

	/**
	 * mapにキーが存在するかチェック
	 */
	protected boolean containsKey(HashMap<String, MCRow> map, MCRow row,
			String... keyColumns) {
		String key = createCombinedKey(row, keyColumns);
		if (map.containsKey(key)) return true;
		map.put(key, row);
		return false;
	}

	/**
	 * NULL文字補完
	 */
	protected void nullToNullVal(MCRow row, String... columns) {
		for (String column : columns) {
			if (isNull(row.getValueNE(column))) {
				row.setStringNE(column, MAC_STR.NULL_VAL.value());
			}
		}
	}
	
	protected void chkReq(MCList<MCRow> l, String... columns) {
		MCMessageList msgList = new MCMessageList();
		for (MCRow r : l) {
			for (String column : columns) {
				if (isNull(r.getValueNE(column))) {
					msgList.add(new MCMessage(r, column, FXUCC0047, 
							r.getParamRowIndex(), getLabel(r, column)));
				}
			}
		}
		MCMessagePool.addAll(msgList);
	}

	//FMCB CUSTOM END
}