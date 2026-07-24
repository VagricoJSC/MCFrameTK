package mcframe.serverMSLC.MSLCB0010;

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
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;

import java.util.List;
import java.util.ArrayList;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLCB_ScmDataSendIfBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLCB_ScmDataSendIfBatch_MC extends MSLCB_ScmDataSendIfBatch_MC_A{
	//FMCB CUSTOM START

	/**
	 * SendIf_Upd01オペレーション.<p>
	 *
	 * BI LinkのＩＦテーブルへデータ登録を行う処理を実行する。<br>
	 */
	public class SendIf_Upd01 extends MSLCB_ScmDataSendIfBatch_MC_A.SendIf_Upd01 {
	
		/** 例外発生フラグ. */
		protected boolean _exceptionFlg;
		/** バッチを実行した結果、エラーメッセージが出力されているかどうかのフラグ */
		protected boolean _hasBatErrorMsgFlg;
		/** サービスを実行した結果、エラーメッセージが出力されているかどうかのフラグ */
		protected boolean _hasSrvErrorMsgFlg;
		/** バッチ実行時のパラメータで指定されたＩＦ処理区分 */
		protected MAC_IF_PROC_TYP _ifProcTyp;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			try {
				initLogger();
				writeStartLog();
				execMain();
			}
			catch (Exception ex) {
				handleEx(ex);
			}
			finally {
				writeEndLog();
			}
		}
		
		/**
		 * バッチのメイン処理を実行
		 */
		protected void execMain() {
			
			// 入力チェック
			chkUpItems();
			if (hasErrMsg()) {
				_hasBatErrorMsgFlg = true;
				return;
			}
			
			// 処理対象のＩＦ処理区分を取得
			List<MAC_IF_PROC_TYP> tgtIfProcTypLst = new ArrayList<MAC_IF_PROC_TYP>();
			if (_ifProcTyp == null) {
				for (MAC_IF_PROC_TYP typ : MAC_IF_PROC_TYP.array()) {
					if (isExecTgt(typ)) {
						tgtIfProcTypLst.add(typ);
					}
				}
			}
			else {
				// 入力チェックにて、実行対象のＩＦ処理区分であることをチェック済み
				tgtIfProcTypLst.add(_ifProcTyp);
			}
			
			// オペレーションの実行
			MCMessageList serviceMsgLst = new MCMessageList();
			for (MAC_IF_PROC_TYP typ : tgtIfProcTypLst) {
				String opePath = typ.bi_ope();
				
				// オペレーションのインスタンスを作成し、実行する
				MCOperation ope = crtOpe(opePath, typ);
				MCRow up0Row = (MCRow)ope.up(0);
				copy(up0Row, up0(), createMap_Operation_Up0_SendIf_Upd01_Dtl_CndR());
				
				// IF処理区分がブランクの場合は、セットする
				if (isNull(up0Row.getStringNE("if_proc_typ"))) {
					up0Row.setStringNE("if_proc_typ", typ.value());
				}
				
				// サービスを実行
				ope.exec();
				
				if (hasErrMsg()) {
					_hasSrvErrorMsgFlg = true;
				}
				
				if (!MCMessagePool.getMessageList().isEmpty()) {
					serviceMsgLst.addAll(MCMessagePool.getMessageList());
					MCMessagePool.clear();
				}
			}
			MCMessagePool.addAll(serviceMsgLst);
		}
		
		/**
		 * 指定したＩＦ処理区分は、実行対象のものであるかどうかを判定
		 * @param typ ＩＦ処理区分
		 * @return true  : 実行対象
		 *         false : 実行対象外
		 */
		protected boolean isExecTgt(MAC_IF_PROC_TYP typ) {
			if ("MSLCB0010".equals(typ.bi_bat())) {
				return true;
			}
			return false;
		}
		
		/**
		 * オペレーションのインスタンスを作成.
		 * @param opePath オペレーションの「モジュールＩＤ」「ロジックＩＤ」「オペレーションＩＤ」を「.」で連結した文字列
		 * @param typ IF処理区分
		 * @return オペレーションのインスタンス
		 */
		protected MCOperation crtOpe(String opePath, MAC_IF_PROC_TYP typ) {
			if (isNull(opePath)) {
				throw new MCAppException(new MCMessage(MSLCB0001, typ.value()));
			}
			
			// opePathは「モジュールID.ロジックID.オペレーションID」の文字列
			String[] splitStr = opePath.split("\\.");
			if (splitStr.length != 3) {
				throw new MCAppException(new MCMessage(MSLCB0002, typ.value()));
			}
			
			return createOperation(splitStr[0], splitStr[1], splitStr[2], MCOperation.class);
		}
		
		/**
		 * バッチパラメータのチェック
		 */
		protected void chkUpItems() {
			
			// 外部システムＣＤの必須チェック
			MCMessageList requiredErrMsgL = check(up0(), SendIf_Upd01_Dtl_CndR.$ext_sys_cd, new FXUCL_RequiredValidater());
			if (!requiredErrMsgL.isEmpty()) {
				MCMessagePool.addAll(requiredErrMsgL);
			}
			
			// IF処理区分の区分値チェック(値が指定されている場合のみ)
			if (up0().if_proc_typ() != null) {
				_ifProcTyp = MAC_IF_PROC_TYP.getNE(up0().if_proc_typ());
				if (_ifProcTyp == null) {
					MCMessagePool.add(new MCMessage(MSLCB0003, up0().if_proc_typ()));
				}
				else {
					// 実行対象であるかをチェック
					if (!isExecTgt(_ifProcTyp)) {
						MCMessagePool.add(new MCMessage(MSLCB0004, up0().if_proc_typ()));
					}
				}
			}
		}
		
		/**
		 * ログの初期化
		 */
		protected void initLogger() {
			getConcurrentLogger();
		}
		
		/**
		 * 開始ログを出力
		 */
		protected void writeStartLog() {
			logger().writeStartLog(MSLCB0005,
					up0().if_proc_typ(),
					up0().ext_sys_cd(),
					up0().dt_fr(),
					up0().dt_to(),
					up0().non_mov_cmp_dt(),
					up0().non_mov_base_days(),
					up0().co_cd());
			pushStartLog(logger());
		}
		
		/**
		 * 終了ログを出力
		 */
		protected void writeEndLog() {
			
			boolean errMsgFlg = false;
			if (_exceptionFlg || _hasBatErrorMsgFlg || _hasSrvErrorMsgFlg) {
				MCMessagePool.add(MAUDL0009);
				errMsgFlg = true;
			}
			
			if (!MCMessagePool.isEmpty()) {
				logger().writeProcessLog(MCMessagePool.getMessageList());
			}
			
			if (errMsgFlg) {
				pushErrorLog(logger());
			}
			
			MCMessagePool.clear();
			if (errMsgFlg) {
				// エラーが発生している場合は、サーバ処理確認画面用にメッセージを追加する
				MCMessagePool.add(MAUDL0009);
			}
			
			logger().writeEndLog(MSLCB0006);
			pushEndLog(logger());
			logger().close();
		}
		
		/**
		 * エラーハンドリング
		 * @param ex 発生した例外
		 */
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
		
		/**
		 * バッチパラメータから上り電文（IFテーブルへのデータ登録を行うサービス）への、マッピングを行うRowMapperのインスタンス作成
		 * @return RowMapperのインスタンス
		 */
		protected Operation_Up0_SendIf_Upd01_Dtl_CndR <MCRow, SendIf_Upd01_Dtl_CndR> createMap_Operation_Up0_SendIf_Upd01_Dtl_CndR () {
			return new Operation_Up0_SendIf_Upd01_Dtl_CndR <MCRow, SendIf_Upd01_Dtl_CndR>();
		}
		
		/**
		 * バッチパラメータから上り電文（IFテーブルへのデータ登録を行うサービス）への、マッピングを行うRowMapper
		 * @param <D> サービスの上り電文
		 * @param <S> バッチ起動時のパラメータ
		 */
		public class Operation_Up0_SendIf_Upd01_Dtl_CndR <D extends MCRow, S extends SendIf_Upd01_Dtl_CndR> extends MCRowMapper<D,S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("if_proc_typ", SendIf_Upd01_Dtl_CndR.$if_proc_typ);
				addColumnPathMap("ext_sys_cd", SendIf_Upd01_Dtl_CndR.$ext_sys_cd);
				addColumnPathMap("dt_fr", SendIf_Upd01_Dtl_CndR.$dt_fr);
				addColumnPathMap("dt_to", SendIf_Upd01_Dtl_CndR.$dt_to);
				addColumnPathMap("non_mov_cmp_dt", SendIf_Upd01_Dtl_CndR.$non_mov_cmp_dt);
				addColumnPathMap("non_mov_base_days", SendIf_Upd01_Dtl_CndR.$non_mov_base_days);
				addColumnPathMap("co_cd", SendIf_Upd01_Dtl_CndR.$co_cd);
			}
		}
	}

	//FMCB CUSTOM END
}