package mcframe.serverMGLA.MGLAB0010;

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
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogger;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import java.util.List;
import java.util.ArrayList;
//FMCB CUSTOM_IMPORT END

/**
 * "MGLAB_CalcRsltSendIfBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGLAB_CalcRsltSendIfBatch_MC extends MGLAB_CalcRsltSendIfBatch_MC_A{
	//FMCB CUSTOM START

	/**
	 * SendIf_Upd01オペレーション.<p>
	 *
	 * ＩＦテーブルのデータ登録処理を実行する。<br>
	 */
	public class SendIf_Upd01 extends MGLAB_CalcRsltSendIfBatch_MC_A.SendIf_Upd01 {

		/** サービス内でのカレントログ切り替えに備えて保持しておく */
		protected FXBAL_BatchLogger _logger;

		/** 例外発生フラグ. */
		protected boolean _exceptionFlg;
		/** バッチの処理内部でエラーが発生したかどうか */
		protected boolean _isBtcErr;
		/** サービスの処理内部でエラーが発生したかどうか */
		protected boolean _isSvcErr;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			initLogger();
			writeStartLog();
			try {
				checkUp();
				execMain();
			}
			catch (MCAppException ex) {
				handleEx(ex);
			}
			finally {
				writeEndLog();
			}
		}

		protected void checkUp() {
			MCMessageList msgL = new MCMessageList();

			msgL.addAll(check(up0(), SendIf_Upd01_CndR.$ext_sys_cd, new FXUCL_RequiredValidater()));

			if (!isNull(up0().if_proc_typ())) {
				MAC_IF_PROC_TYP ifProcTyp = MAC_IF_PROC_TYP.getNE(up0().if_proc_typ());
				if (ifProcTyp == null) {
					msgL.add(new MCMessage(MGLAB0003, up0().if_proc_typ()));
				}
				else if (!isExecTgt(ifProcTyp)) {
					msgL.add(new MCMessage(MGLAB0004, up0().if_proc_typ()));
				}
			}

			if (!msgL.isEmpty()) {
				MCMessagePool.addAll(msgL);
			}
		}

		protected void execMain() {
			if (hasErrMsg()) {
				_isBtcErr = true;
				return;
			}

			List<MAC_IF_PROC_TYP> tgtIfProcTypList = new ArrayList<>();
			if (isNull(up0().if_proc_typ())) {
				for (MAC_IF_PROC_TYP typ : MAC_IF_PROC_TYP.array()) {
					if (up0().cfp_flg()) {
						if (isExecTgt(typ) && typ.is_cfp()) {
							tgtIfProcTypList.add(typ);
						}
					}
					else {
						if (isExecTgt(typ) && !typ.is_cfp()) {
							tgtIfProcTypList.add(typ);
						}
					}
				}
			}
			else {
				tgtIfProcTypList.add(MAC_IF_PROC_TYP.getNE(up0().if_proc_typ()));
			}

			MCMessageList msgL = new MCMessageList();
			for (MAC_IF_PROC_TYP typ : tgtIfProcTypList) {
				MCOperation ope = createOpe(typ.bi_ope(), typ);
				MCRow up0Row = (MCRow) ope.up(0);
				copy(up0Row, up0(), createMap_Operation_Up0_SendIf_Upd01_CndR());
				up0Row.setStringNE(SendIf_Upd01_CndR.$if_proc_typ, typ.value());
				ope.exec();
				_isSvcErr |= hasErrMsg();
				if (MCMessagePool.size() > 0) {
					msgL.addAll(MCMessagePool.getMessageList());
				}
				MCMessagePool.clear();
			}
			MCMessagePool.addAll(msgL);
		}

		/**
		 * 指定されたＩＦ処理区分が実行対象かどうかを判定します。
		 * 
		 * @param typ ＩＦ処理区分
		 * @return true : 実行対象, false : 実行対象外
		 */
		protected boolean isExecTgt(MAC_IF_PROC_TYP typ) {
			return isSame(typ.bi_bat(), "MGLAB0010");
		}

		/**
		 * オペレーションのインスタンスを作成します。
		 * 
		 * @param opePath オペレーションの「モジュールＩＤ」「ロジックＩＤ」「オペレーションＩＤ」を「.」で連結した文字列
		 * @param typ IF処理区分
		 * @return オペレーションのインスタンス
		 */
		protected MCOperation createOpe(String opePath, MAC_IF_PROC_TYP typ) {
			if (isNull(opePath)) {
				throw new MCAppException(new MCMessage(MGLAB0001, typ.value()));
			}
			String[] splitStr = opePath.split("\\.");
			if (splitStr.length != 3) {
				throw new MCAppException(new MCMessage(MGLAB0002, typ.value()));
			}

			return createOperation(splitStr[0], splitStr[1], splitStr[2], MCOperation.class);
		}

		protected void initLogger() {
			_logger = getConcurrentLogger();
		}

		protected void writeStartLog() {
			_logger.writeStartLog(MGLAB0005, up0().if_proc_typ(), up0().ext_sys_cd(),
					up0().ym(), up0().calc_grp_cd(), up0().calc_no(), up0().fix_flg(),
					up0().co_cd());
			pushStartLog(_logger);
		}

		protected void writeEndLog() {
			boolean errMsgFlg = _exceptionFlg || _isBtcErr || _isSvcErr;

			if (errMsgFlg) {
				MCMessagePool.add(MAUDL0009);
			}
			if (MCMessagePool.size() > 0) {
				_logger.writeProcessLog(MCMessagePool.getMessageList());
			}
			if (errMsgFlg) {
				pushErrorLog(_logger);
			}
			MCMessagePool.clear();
			if (errMsgFlg) {
				MCMessagePool.add(MAUDL0009);
			}
			_logger.writeEndLog(MGLAB0006);
			pushEndLog(_logger);

			_logger.close();
		}

		protected void handleEx(MCAppException ex) {
			MCMessagePool.add(ex.getMCMessage());
			_exceptionFlg = true;
		}

		protected Operation_Up0_SendIf_Upd01_CndR<MCRow, SendIf_Upd01_CndR> createMap_Operation_Up0_SendIf_Upd01_CndR() {
			return new Operation_Up0_SendIf_Upd01_CndR<MCRow, SendIf_Upd01_CndR>();
		}

		public class Operation_Up0_SendIf_Upd01_CndR<D extends MCRow, S extends SendIf_Upd01_CndR> extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				// 項目名は合わせる
				addColumnPathMap(SendIf_Upd01_CndR.$if_proc_typ, SendIf_Upd01_CndR.$if_proc_typ);
				addColumnPathMap(SendIf_Upd01_CndR.$ext_sys_cd, SendIf_Upd01_CndR.$ext_sys_cd);
				addColumnPathMap(SendIf_Upd01_CndR.$ym, SendIf_Upd01_CndR.$ym);
				addColumnPathMap(SendIf_Upd01_CndR.$calc_grp_cd, SendIf_Upd01_CndR.$calc_grp_cd);
				addColumnPathMap(SendIf_Upd01_CndR.$calc_no, SendIf_Upd01_CndR.$calc_no);
				addColumnPathMap(SendIf_Upd01_CndR.$fix_flg, SendIf_Upd01_CndR.$fix_flg);
				addColumnPathMap(SendIf_Upd01_CndR.$co_cd, SendIf_Upd01_CndR.$co_cd);
			}
		}
	}

	//FMCB CUSTOM END
}