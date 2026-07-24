package mcframe.serverMSLA.MSLAB5010;

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
import java.util.*;
import java.util.stream.Stream;
import mcframe.serverPFBZ.PFBZL9050.PFBZL_SendRecvIfCtrl;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverPFUD.PFUDL0030.DtlR;
import mcframe.serverFXUC.FXUCL0170.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAB_SchedulerSendBatchBase"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAB_SchedulerSendBatchBase_MC extends MSLAB_SchedulerSendBatchBase_MC_A{
	//FMCB CUSTOM START

	
	protected MCNumber _dataNo = null;

	protected boolean _errFlg = false;

	protected MCList<? extends MCRow> _srchDownL = null;

	protected static final String BATCH_LOG_NO_STR = "batch_log_no";

	protected static final String LOG_SUB_KEY1_STR = "log_sub_key1";

	protected static final String LOG_SUB_KEY2_STR = "log_sub_key2";
	

	
	/**
	 * サブクラスでoverrideが必要
	 * 
	 * @return 送信IFの作成元となるデータを検索する処理の検索結果が格納されるクラス（下り電文）のインスタンス<BR>
	 * 例：MCList.create(OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.class)
	 */
	protected MCList<? extends MCRow> getSrchDowListClass() {
		return MCList.create(MCRow.class);
	}

	/**
	 * サブクラスでoverrideが必要
	 * @return IFテーブルの型のMCRow<BR>
	 * 例：MST_ORDSND_ITM_DTL_BOM_IF_R.create("ORDSND_ITM_BOM")
	 */
	protected MCDBContainer getIFDbc() {
		return null;
	};
	
	protected MCList<? extends MCDBContainer> _sndIfL = null;

	protected MCDBContainer _sendIfR = null;

	protected MCQueryApiBuilder _sndIfBldr = null;

	/**
	 * サブクラスでoverrideが必要
	 * @return IFデータのdata_lnoに使用するシーケンス 例：MSC_NUM_SYS_TYP.ORDERSENDITMDTLBOMIF
	 */
	protected MSC_NUM_SYS_TYP getIfNumSysTyp() {
		return null;
	}

	/**
	 * サブクラスでoverrideが必要
	 * @return サブクラスのロジックID 例：getLogicID()
	 */
	protected String getLogicIdSub() {
		return null;
	}
	
	/**
	 * サブクラスでoverrideが必要
	 * @return サブクラスが処理対象とするIF処理区分<BR>
	 * 例：MAC_IF_PROC_TYP.MES_ORDER_SEND_ITM_DTL.value()
	 */
	protected String getIfProcTyp() {
		return null;
	}

	/**
	 * SchedulerBatchBase_Upd01オペレーション.<p>
	 *
	 * スケジューラ連携用の品目マスタデータをＩＦテーブルに登録する。<br>
	 */
	public class SchedulerSendBatchBase_Upd01 extends MSLAB_SchedulerSendBatchBase_MC_A.SchedulerSendBatchBase_Upd01 {
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {

				initLogger();
				writeStartLog();

				chk();

				if (!_errFlg) {

					getMstData();

					if (!_srchDownL.isEmpty()) {
						crtSndIfData();

						insSndIfData();

						insSdrvIfData();
					}

				}
			}
			catch (Exception ex) {
				handleEx(ex);
			}
			finally {
				writeEndLog();
			}
		}

		protected void initLogger() {

			FXBAL_BatchLogManager.getLogger();
		}


		protected void writeStartLog() {

			writeStartLogSub();
			pushStartLog(FXBAL_BatchLogManager.logger());
		}

		protected void writeStartLogSub() {
		}

		protected void chk() {

			MCMessageList msgList = new MCMessageList();
			chkSub(msgList);

			if (msgList.size() > 0) {
				FXBAL_BatchLogManager.logger().writeProcessLog(msgList);
				_errFlg = true;
			}
		}

		protected MCMessageList chkSub(MCMessageList msgList) {

			checkReq(msgList);
			checkValidIfSchdTyp(msgList);
			checkReqWgOrMfgLocCd(msgList);
			checkBfAfTermFromTo(msgList);

			return msgList;
		}

		protected void checkBfAfTermFromTo(MCMessageList msgList) {

			if (MSC_IF_SCHEDULER_TYP.isFLEXSCHE(up0().getStringNE(SchedulerSendBatchBase_Upd01_CndR.$if_scheduler_typ))) {
				msgList.addAll(check(up0(), getTermCols(), new FXUCL_BeforeAfterValidater()));
			}
		}

		protected void checkValidIfSchdTyp(MCMessageList msgList) {
			msgList.addAll(check(up0(), SchedulerSendBatchBase_Upd01_CndR.$if_scheduler_typ, new FXUCL_ConstValidater(MSC_IF_SCHEDULER_TYP.array())));
			if (MSC_IF_SCHEDULER_TYP.isGP(up0().getStringNE(SchedulerSendBatchBase_Upd01_CndR.$if_scheduler_typ))) {
				msgList.add(new MCMessage(MSLAL0909, MSC_IF_SCHEDULER_TYP.GP.value()));
			}
		}

		protected String[] getTermCols() {
			return new String[] {
					SchedulerSendBatchBase_Upd01_CndR.$term_from, SchedulerSendBatchBase_Upd01_CndR.$term_to
			};
		}

		protected String[] getRequiredCols() {

			String[] comCols = new String[] {
					SchedulerSendBatchBase_Upd01_CndR.$ext_sys_cd, SchedulerSendBatchBase_Upd01_CndR.$if_scheduler_typ
			};

			return Stream.concat(Stream.of(comCols), Stream.of(getRequiredColsSub())).toArray(String[]::new);
		}

		protected String[] getRequiredColsTerm() {

			if (MSC_IF_SCHEDULER_TYP.isFLEXSCHE(up0().getStringNE(SchedulerSendBatchBase_Upd01_CndR.$if_scheduler_typ))) {
				return getTermCols();
			}
			else {
				return new String[] {};
			}
		}

		/**
		 * 必要に応じてサブクラスでoverrideする<BR>
		 * 本クラスでは{@link #getRequiredCols()}が返す項目が必須チェックの対象となる
		 * @return 必須チェックを行いたいup0の項目
		 */
		protected String[] getRequiredColsSub() {
			return new String[] {};
		}

		protected void checkReq(MCMessageList msgList) {

			Arrays.stream(getRequiredCols()).forEach(r -> msgList.addAll(check(up0(), r, new FXUCL_RequiredValidater())));
		}

		protected void checkReqWgOrMfgLocCd(MCMessageList msgList) {
			if (MSC_IF_SCHEDULER_TYP.isFLEXSCHE(up0().if_scheduler_typ())) {
				msgList.addAll(check(up0(), new String[] {
						SchedulerSendBatchBase_Upd01_CndR.$wg_cd, SchedulerSendBatchBase_Upd01_CndR.$mfg_loc_grp_cd
				}, new FXUCL_TooManyInputsValidater()));
				msgList.addAll(check(up0(), new String[] {
						SchedulerSendBatchBase_Upd01_CndR.$wg_cd, SchedulerSendBatchBase_Upd01_CndR.$mfg_loc_grp_cd
				}, new FXUCL_AtLeastOneValidater()));
			}
		}

		protected void getMstData() {
			MCOperation srchOpe = getSrchOpe();
			setSrchOpeUpCnd(srchOpe);
			srchOpe.exec();
			_srchDownL = getSrchDowListClass();

			if (srchOpe.down(0) instanceof MCList) {
				_srchDownL.addAll((MCList) srchOpe.down(0));
			}
		}

		/**
		 *  サブクラスでoverrideが必要
		 * @return IFデータを作成するための基データを検索するオペレーション 例：MSLAL_OrdSendIfService.crtOrdSendIf_Itm_Dtl_Bom_Srch01()
		 */
		protected MCOperation getSrchOpe() {
			return null;
		}

		protected void setSrchOpeUpCnd(MCOperation srchOpe) {
			if (srchOpe.up(0) instanceof MCRow) {
				((MCRow) srchOpe.up(0)).setValuesByName(up0());
			}
		}

		protected void crtSndIfData() {
			_sendIfR = getIFDbc();
			_sndIfL = MCList.create(_sendIfR.getClass());
			_dataNo = getSequence(MAC_NUM_SYS_TYP.ESB_DATA_NO.value());

			doSeqCache(getIfNumSysTyp(), _srchDownL.size());
			setAll(_sndIfL, _srchDownL, getMprSrcToSendIf());

			clearParamRowIndex();
			writeBatchLog();
		}

		protected <DR extends MCRow, SR extends MCRow> MCRowMapper<DR, SR> getMprSrcToSendIf(){
			return null;
		}

		protected void insSndIfData() {

			_sndIfBldr = MCQueryApiBuilder.create(_sendIfR);
			dbInsertEx(createSqlId(getLogicIdSub() + "_", _sendIfR, "I01"), _sndIfL, _sndIfBldr);

		}

		/**
		 * 行インデックスをクリアする。<br>
		 * バッチログのサブキーを自動発番させるため、行インデックスをクリアする。
		 */
		protected void clearParamRowIndex() {

			for (MCRow sndR : _sndIfL) {
				sndR.setParamIndex(-1);
				sndR.setParamRowIndex(-1);
			}
		}

		protected void writeBatchLog() {
			MCMessageList msgList = MCMessagePool.getMessageList();
			FXBAL_BatchLogManager.logger().setLogKey(_sndIfL, BATCH_LOG_NO_STR, LOG_SUB_KEY1_STR, LOG_SUB_KEY2_STR);
			FXBAL_BatchLogManager.logger().writeDataLog(msgList);
		}

		protected void insSdrvIfData() {
			PFBZL_SendRecvIfCtrl.Ins01 ope = PFBZL_SendRecvIfCtrl.crtIns01();
			DtlR r = createSdrvIfUpRow();
			ope.up0().add(r);
			ope.exec();
		}

		protected DtlR createSdrvIfUpRow() {
			DtlR r = DtlR.create();
			r.data_no(_dataNo);
			r.ext_sys_cd(up0().ext_sys_cd());
			r.if_proc_typ(getIfProcTyp());

			return r;
		}

		protected void handleEx(Exception ex) {
			MCException mcex;
			if (ex instanceof MCException) {
				mcex = (MCException) ex;
			}
			else {
				mcex = new MCException(ex);
			}
			FXBAL_BatchLogManager.logger().writeProcessLog(mcex);

			_errFlg = true;

			throw mcex;
		}

		protected void writeEndLog() {

			if (_errFlg) {
				writeErrLog();
				pushErrorLog(FXBAL_BatchLogManager.logger());
			}
			else if (isNull(_sndIfL)) {
				writeEmptyLog();
			}

			writeRsltLog();
			pushEndLog(FXBAL_BatchLogManager.logger());
		}

		protected void writeErrLog() {

			FXBAL_BatchLogManager.logger().writeProcessLog(MAUDL0009);
			MCMessagePool.add(MAUDL0009);
		}

		protected void writeEmptyLog() {

			FXBAL_BatchLogManager.logger().writeProcessLog(MAUDL0008);
			MCMessagePool.add(MAUDL0008);
		}

		protected void writeRsltLog() {

			FXBAL_BatchLogManager.logger().writeEndLog(getRsltLogMsgId(),
					up0().ext_sys_cd(), !isNull(_sndIfL) ? _sndIfL.size() : 0);
		}

		protected String getRsltLogMsgId() {
			return null;
		}
	}

	//FMCB CUSTOM END
}