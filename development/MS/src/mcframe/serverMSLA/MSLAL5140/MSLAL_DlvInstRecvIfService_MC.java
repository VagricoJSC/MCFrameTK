package mcframe.serverMSLA.MSLAL5140;

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
import mcframe.serverMSBB.MSBBL6230.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMS.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMBBE.MBBEL5010.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverPFUD.PFUDL0040.*;	// このimportはFrameManagerの自動生成で追加されました。
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverPF.dbc.PFT_SDRV_IF_R;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogger;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.serverFXUC.FXUCL0170.*;
import mcframe.serverCore.mcjdbc.MCSavepoint;
import mcframe.serverCore.requester.MCServerThreadManager;
import mcframe.serverCore.resource.MCConst;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_DlvInstRecvIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_DlvInstRecvIfService_MC extends MSLAL_DlvInstRecvIfService_MC_A{
	//FMCB CUSTOM START
	/**
	 * エラーになったキーの組み合わせを保持する
	 */
	protected Set<List<String>> _errSet = new HashSet<List<String>>();

	/**
	 * キャッシュを管理するリクエストオブジェクト
	 */
	protected static final Class<MSLAL_DlvInstRecvIfService> CLAZZ = MSLAL_DlvInstRecvIfService.class;

	/**
	 * DlvInstRecvIf_Upd01オペレーション.<p>
	 *
	 * 納入指示受信ＩＦ取込を行う。（ＥＳＢのリアルタイム取込から呼び出される）<br>
	 */
	public class DlvInstRecvIf_Upd01 extends MSLAL_DlvInstRecvIfService_MC_A.DlvInstRecvIf_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			callDlvInstRecvIfUpd02();
		}

		/**
		 * 納入指示受信ＩＦ取込２を実行する。
		 */
		protected void callDlvInstRecvIfUpd02() {

			MSLAL_DlvInstRecvIfService.DlvInstRecvIf_Upd02 ope = MSLAL_DlvInstRecvIfService.crtDlvInstRecvIf_Upd02();

			setAll(ope.up0(), up0(), createMap_IfDataImp_Upd01_DtlR_Upd01_DtlR());

			ope.exec();
		}

		protected Map_IfDataImp_Upd01_DtlR_Upd01_DtlR<IfDataImp_Upd01_DtlR, Upd01_DtlR> createMap_IfDataImp_Upd01_DtlR_Upd01_DtlR() {
			return new Map_IfDataImp_Upd01_DtlR_Upd01_DtlR<IfDataImp_Upd01_DtlR, Upd01_DtlR>();
		}

		public class Map_IfDataImp_Upd01_DtlR_Upd01_DtlR<D extends IfDataImp_Upd01_DtlR, S extends Upd01_DtlR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(IfDataImp_Upd01_DtlR.$data_no, Upd01_DtlR.$data_no);
				addColumnPathMap(IfDataImp_Upd01_DtlR.$ext_data_no, Upd01_DtlR.$ext_data_no);
				addColumnPathMap(IfDataImp_Upd01_DtlR.$ext_sys_cd, Upd01_DtlR.$ext_sys_cd);
				addColumnPathMap(IfDataImp_Upd01_DtlR.$bp_cd, Upd01_DtlR.$bp_cd);
			}
		}
	}
	/**
	 * DlvInstRecvIf_Upd02オペレーション.<p>
	 *
	 * 納入指示受信ＩＦ取込を行う。（ＩＦデータ確認、および納入指示受信ＩＦ取込バッチから呼び出される）<br>
	 */
	public class DlvInstRecvIf_Upd02 extends MSLAL_DlvInstRecvIfService_MC_A.DlvInstRecvIf_Upd02 {

		/**
		 * 処理対象件数 
		 */
		protected int _totalNum = 0;

		/**
		 * 登録件数（正常終了件数）
		 */
		protected int _okNum = 0;

		/**
		 * エラー件数
		 */
		protected int _errNum = 0;

		/**
		 * スキップ件数
		 */
		protected int _skipNum = 0;

		/**
		 * 例外発生フラグ
		 */
		protected boolean _exceptionFlg = false;

		/** ロガー作成ＦＬＧ **/
		protected boolean _crtNewLogger = false;

		/**
		 * 納入指示受信ＩＦリスト 
		 */
		MCList<MST_DLV_INST_RECV_IF_R> _dlvInstRecvIfL = null;

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

				exe();
			}
			catch (Exception ex) {

				handleEx(ex);
			}
			finally {

				writeEndLog();
			}
		}

		/**
		 * 初期処理
		 */
		protected void initProc() {

			initLogger();
		}

		/**
		 * バッチログを初期化する。
		 */
		protected void initLogger() {

			// カレントLoggerがnullの場合（呼出元からLoggerを引き継がない場合）は新規
			if (loggerNE() == null) {
				_crtNewLogger = true;
			}
			getConcurrentLogger();
		}

		/**
		 * 開始ログを出力する。
		 */
		protected void writeStartLog() {

			logger().writeStartLog(MSLAL0730);
			pushStartLog(logger());
		}

		/**
		 * 例外処理
		 * @param ex 例外
		 */
		protected void handleEx(Exception ex) {

			MCException mcEx;
			if (ex instanceof MCException) {
				mcEx = (MCException) ex;
			}
			else {
				mcEx = new MCException(ex);
			}
			logger().writeProcessLog(mcEx);

			_exceptionFlg = true;

			throw mcEx;
		}

		/**
		 * 終了ログを出力する。
		*/
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

			logger().writeEndLog(MSLAL0731, _totalNum, _okNum, _errNum, _skipNum);
			pushEndLog(logger());
			// Loggerを新規作成した場合（呼出元からLoggerを引き継がない場合）のみクローズ
			if (_crtNewLogger) {
				logger().close();
			}
		}

		/**
		 * 納入指示受信ＩＦデータを取得する。
		 */
		protected void preSrch() {

			MAM_EDI_IF_CTL_R IFCTL = MAM_EDI_IF_CTL_R.create("IFCTL");
			PFT_SDRV_IF_R SDRVIF = PFT_SDRV_IF_R.create("SDRVIF");
			_dlvInstRecvIfL = MCList.create(MST_DLV_INST_RECV_IF_R.class);
			MST_DLV_INST_RECV_IF_R RECVIF = MST_DLV_INST_RECV_IF_R.create("RECVIF");
			MCQueryApiBuilder dlvInstRecvIfBldr = MCQueryApiBuilder.create(RECVIF);

			dlvInstRecvIfBldr.addInnerJoin(IFCTL, RECVIF.cst_cd.eq(IFCTL.bp_cd)
					.and(IFCTL.if_proc_typ.eq(value(MAC_IF_PROC_TYP.DLV_INST_RECV.value())))
					.and(IFCTL.st_dt.lte(RECVIF.recv_dt)).and(IFCTL.end_dt.gte(RECVIF.recv_dt)));
			dlvInstRecvIfBldr.addLeftOuterJoin(SDRVIF, RECVIF.data_no.eq(SDRVIF.data_no));

			dlvInstRecvIfBldr.setWhere(value(0).eq(value(0)));
			dlvInstRecvIfBldr.addWhereWithAnd(SDRVIF.sdrv_sts_typ.isNull()
					.or(SDRVIF.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.RECV_CONV_OK.value()))));
			dlvInstRecvIfBldr.addWhereWithAnd(RECVIF.imp_flg.eq(value(true)));

			if (!up0().isEmpty()) {

				dlvInstRecvIfBldr.addWhereWithCutOffAnd(RECVIF.data_no.eq(bind("data_no")));
				dlvInstRecvIfBldr.addWhereWithCutOffAnd(RECVIF.ext_data_no.eq(bind("ext_data_no")));
				dlvInstRecvIfBldr.addWhereWithCutOffAnd(RECVIF.ext_sys_cd.eq(bind("ext_sys_cd")));
				dlvInstRecvIfBldr.addWhereWithCutOffAnd(RECVIF.cst_cd.eq(bind("bp_cd")));
				dbSelect("MSLAL5140_MST_DLV_INST_RECV_IF_S01", _dlvInstRecvIfL, dlvInstRecvIfBldr, up0());
			}
			else {
				dbSelect("MSLAL5140_MST_DLV_INST_RECV_IF_S02", _dlvInstRecvIfL, dlvInstRecvIfBldr);
			}
		}

		/**
		 * バッチ用のメイン処理
		 */
		protected void exe() {

			callDlvInstRecvIfUpd03();
		}

		/**
		 * スレッドを分割し、各スレッドごとに納入指示受信ＩＦ取込３を実行する。
		 */
		protected void callDlvInstRecvIfUpd03() {

			int no = 0;

			MSLAL_DlvInstRecvIfService.DlvInstRecvIf_Upd03 upd03 = null;

			List<MSLAL_DlvInstRecvIfService.DlvInstRecvIf_Upd03> opeL = new ArrayList<MSLAL_DlvInstRecvIfService.DlvInstRecvIf_Upd03>();

			for (MCList<MST_DLV_INST_RECV_IF_R> cstGrpL : _dlvInstRecvIfL.groupList(MST_DLV_INST_RECV_IF_R.$cst_cd)) {

				upd03 = MSLAL_DlvInstRecvIfService.crtDlvInstRecvIf_Upd03();
				upd03._no = ++no;
				setAll(upd03.up0(), cstGrpL, createMap_DlvInstRecvIf_Upd03_DtlR_MST_DLV_INST_RECV_IF_R());

				opeL.add(upd03);
			}

			if (!opeL.isEmpty()) {

				if (MCServerThreadManager.getLimitThreadSize() <= 1) {

					MCServerThreadManager.setUseMainDBTran(true);
					MCServerThreadManager.invokeAndWait(1, opeL,
							FXBAL_BatchLogManager.class);
				}
				else {

					MCServerThreadManager.setCommitAndRollback(true);

					// 件数の多いスレッドを優先に実行する。
					Collections.sort(opeL,
							new Comparator<MSLAL_DlvInstRecvIfService.DlvInstRecvIf_Upd03>() {

								public int compare(
										MSLAL_DlvInstRecvIfService.DlvInstRecvIf_Upd03 o1,
										MSLAL_DlvInstRecvIfService.DlvInstRecvIf_Upd03 o2) {
									return (o1.up0().size() - o2.up0().size()) * -1; // 降順
								}
							});

					MCServerThreadManager.invokeAndWait(opeL, FXBAL_BatchLogManager.class);
				}

				for (MSLAL_DlvInstRecvIfService.DlvInstRecvIf_Upd03 ope : opeL) {

					_totalNum += ope.down0().total_num().intValue();
					_okNum += ope.down0().ok_num().intValue();
					_errNum += ope.down0().err_num().intValue();
					_skipNum += ope.down0().skip_num().intValue();
				}
			}
		}

		protected Map_DlvInstRecvIf_Upd03_DtlR_MST_DLV_INST_RECV_IF_R<DlvInstRecvIf_Upd03_DtlR, MST_DLV_INST_RECV_IF_R> createMap_DlvInstRecvIf_Upd03_DtlR_MST_DLV_INST_RECV_IF_R() {
			return new Map_DlvInstRecvIf_Upd03_DtlR_MST_DLV_INST_RECV_IF_R<DlvInstRecvIf_Upd03_DtlR, MST_DLV_INST_RECV_IF_R>();
		}

		public class Map_DlvInstRecvIf_Upd03_DtlR_MST_DLV_INST_RECV_IF_R<D extends DlvInstRecvIf_Upd03_DtlR, S extends MST_DLV_INST_RECV_IF_R>
				extends MCRowMapper<D, S> {
			@Override
			public void valueCopy(D dest, S src) {
				dest.dlvInst(src);
			}
		}
	}
	/**
	 * DlvInstRecvIf_Upd03オペレーション.<p>
	 *
	 * 納入指示受信ＩＦ取込を行う。（マルチスレッド実行用）<br>
	 */
	public class DlvInstRecvIf_Upd03 extends MSLAL_DlvInstRecvIfService_MC_A.DlvInstRecvIf_Upd03 {

		/**
		 * 納入指示受信ＩＦ取込４を呼び出す際にデータＮＯ、得意先、得意先注文ＮＯ、得意先明細注文ＮＯの組み合わせを何件ずつ渡すかのパラメータ
		 */
		protected int _loopCnt = MCConst.app.getInteger("MS.MSLAL5140.loop_size", 100);

		/**
		 * 処理対象件数
		 */
		protected int _totalNum = 0;

		/**
		 * 登録件数（正常終了件数）
		 */
		protected int _okNum = 0;

		/**
		 * エラー件数
		 */
		protected int _errNum = 0;

		/**
		 * スキップ件数
		 */
		protected int _skipNum = 0;

		/**
		 * バッチログのlogger<br>
		 * DlvInstRecvIf_Upd04バッチ呼び出しオペレーションから引き継ぐ
		 */
		protected FXBAL_BatchLogger _logger = null;

		/**
		 * インスタンス生成元（DlvInstRecvIf_Upd03）でスレッド間でユニークな値を設定
		 */
		protected int _no = 0;

		/**
		 * DlvInstRecvIf_Upd04の実行結果リスト
		 */
		protected MCList<DlvInstRecvIf_Upd04_DtlR> _exeRslt = null;

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

		/**
		 * 初期化処理
		 */
		protected void initProc() {

			initLogger();
		}

		/**
		 * バッチログのインスタンスを取得する。
		 */
		protected void initLogger() {

			if (MCServerThreadManager.isUseMainDBTran()) {
				_logger = logger();
			}
			else {
				_logger = logger().clone();
			}
		}

		/**
		 * バッチログをクローズする。
		 */
		protected void closeLogger() {

			if (!MCServerThreadManager.isUseMainDBTran()) {

				if (_logger != null) {
					_logger.close();
				}
			}
		}

		/**
		 * 納入指示受信ＩＦ取込処理を実行する。
		 */
		protected void exe() {

			int cnt = 0;

			MCList<MST_DLV_INST_RECV_IF_R> tgtL = MCList.create(MST_DLV_INST_RECV_IF_R.class);
			MST_DLV_INST_RECV_IF_R oldR = MST_DLV_INST_RECV_IF_R.create();

			for (DlvInstRecvIf_Upd03_DtlR dtlR : up0()) {

				MST_DLV_INST_RECV_IF_R keyR = dtlR.dlvInst();

				if (isNextData(oldR, keyR)) {

					if (!tgtL.isEmpty() && _loopCnt <= cnt) {

						callDlvInstRecvIfUpd04(tgtL);
						cnt = 0;
						tgtL.clear();
					}
				}

				oldR = keyR;
				cnt++;
				tgtL.add(keyR);
			}

			if (!tgtL.isEmpty()) {

				callDlvInstRecvIfUpd04(tgtL);
			}
		}

		/**
		 * 納入指示受信ＩＦを実行する。
		 * @param dlvInstRecvIfL 納入指示受信ＩＦリスト
		 */
		protected void callDlvInstRecvIfUpd04(MCList<MST_DLV_INST_RECV_IF_R> dlvInstRecvIfL) {

			crtDlvInstRecvIfWk(dlvInstRecvIfL);

			MCList<MST_DLV_INST_RECV_IF_R> exeL = srchLockDlvInstRecvIf();

			Set<List<String>> afterExtDataSet = srchAfterExtData(exeL);

			MSLAL_DlvInstRecvIfService.DlvInstRecvIf_Upd04 ope = MSLAL_DlvInstRecvIfService.crtDlvInstRecvIf_Upd04();

			DlvInstRecvIf_Upd04_DtlR upR = null;

			MCList<MST_DLV_INST_RECV_IF_R> skipL = MCList.create(MST_DLV_INST_RECV_IF_R.class);
			for (MST_DLV_INST_RECV_IF_R exeR : exeL) {

				// 同一の得意先、得意先注文ＮＯ、得意先明細注文ＮＯでエラーが発生している場合、それ以降のデータは処理しない
				if (isPrevErr(exeR)) {

					setErrSts(exeR);
					MCMessagePool.add(exeR, null, MSLAL0742, exeR.data_no(),
							exeR.data_lno(), exeR.cst_cd(), exeR.cst_po_no(), exeR.cst_po_d_no());
					skipL.add(exeR);
				}
				// 同一の得意先、得意先注文ＮＯ、得意先明細注文ＮＯで、新しいデータが既に処理されている場合、スキップする
				else if (isOkSkip(exeR, afterExtDataSet)) {

					setSkipSts(exeR);
					MCMessagePool.add(exeR, null, MSLAL0743, exeR.data_no(),
							exeR.data_lno(), exeR.cst_cd(), exeR.cst_po_no(), exeR.cst_po_d_no());
					skipL.add(exeR);
				}
				else {

					upR = DlvInstRecvIf_Upd04_DtlR.create();
					upR.dlvInst(exeR);
					upR.setParamIndex(exeR.getParamIndex());
					upR.setParamRowIndex(exeR.getParamRowIndex());
					ope.up0().add(upR);
				}
			}
			if (!ope.up0().isEmpty()) {
				ope.exec();
			}

			mergeExeRslt(skipL, ope.down0());

			afterCall(exeL);

			delDlvInstRecvIfWk(dlvInstRecvIfL);
		}

		/**
		 * 同一キーで新しいデータが既に処理済みかどうか。
		 * @param exeR 取込対象行
		 * @return 処理済みの場合はtrue
		 */
		protected boolean isOkSkip(MST_DLV_INST_RECV_IF_R exeR, Set<List<String>> afterExtDataSet) {

			return afterExtDataSet.contains(createErrSetKey(exeR));
		}

		/**
		 * 納入指示受信ＩＦのワークテーブルにデータを登録する。
		 * @param dlvInstRecvIfL 納入指示受信ＩＦ
		 */
		protected void crtDlvInstRecvIfWk(MCList<MST_DLV_INST_RECV_IF_R> dlvInstRecvIfL) {

			dbWkDelete("MSLAL5140_MSW_DLV_INST_RECV_IF_D01", MCQueryApiBuilder.create(MST_DLV_INST_RECV_IF_R.create("T")).getBaseDbc());
			dbWkInsert("MSLAL5140_MSW_DLV_INST_RECV_IF_I01", dlvInstRecvIfL, MCQueryApiBuilder.create(MST_DLV_INST_RECV_IF_R.create("T")).getBaseDbc());
		}

		/**
		 * 納入指示受信ＩＦをロックする。
		 */
		protected MCList<MST_DLV_INST_RECV_IF_R> srchLockDlvInstRecvIf() {

			MSW_DLV_INST_RECV_IF_KEY_R IFKEY = MSW_DLV_INST_RECV_IF_KEY_R.create("IFKEY");
			PFT_SDRV_IF_R SDRVIF = PFT_SDRV_IF_R.create("SDRVIF");

			MCList<MST_DLV_INST_RECV_IF_R> exeL = MCList.create(MST_DLV_INST_RECV_IF_R.class);
			MST_DLV_INST_RECV_IF_R IF = MST_DLV_INST_RECV_IF_R.create("IF");
			MCQueryApiBuilder exeLBldr = MCQueryApiBuilder.create(IF);

			exeLBldr.addInnerJoin(IFKEY, IF.data_lno.eq(IFKEY.data_lno));
			exeLBldr.addLeftOuterJoin(SDRVIF, IF.data_no.eq(SDRVIF.data_no));

			exeLBldr.setWhere(value(0).eq(value(0)));
			exeLBldr.addWhereWithAnd(SDRVIF.sdrv_sts_typ.isNull()
					.or(SDRVIF.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.RECV_CONV_OK.value()))));
			exeLBldr.addWhereWithAnd(IF.imp_flg.eq(value(true)));
			exeLBldr.addOrderByAsc(IF.ext_data_no, IF.cst_cd, IF.cst_po_no, IF.cst_po_d_no);
			exeLBldr.setLockTable(IF.data_lno);

			dbSelectForUpdate("MSLAL5140_MST_DLV_INST_RECV_IF_S03", exeL, exeLBldr);

			for (MST_DLV_INST_RECV_IF_R exeR : exeL) {

				// log_sub_key1にスレッド間でユニークな値を設定
				exeR.setParamIndex(_no);
			}

			_logger.setLogKey(exeL, MST_DLV_INST_RECV_IF_R.$batch_log_no,
					MST_DLV_INST_RECV_IF_R.$log_sub_key1,
					MST_DLV_INST_RECV_IF_R.$log_sub_key2);

			return exeL;
		}

		/**
		 * 同一キーで取込対象より新しいかつ処理済みのデータを取得する。
		 * @param exeL 取込対象リスト
		 * @return 処理済みデータリスト
		 */
		protected Set<List<String>> srchAfterExtData(MCList<MST_DLV_INST_RECV_IF_R> exeL) {

			MST_DLV_INST_RECV_IF_R IF = MST_DLV_INST_RECV_IF_R.create("IF");
			MST_DLV_INST_RECV_IF_R RECVIF = MST_DLV_INST_RECV_IF_R.create("RECVIF");

			MCList<MST_DLV_INST_RECV_IF_R> afterL = MCList.create(MST_DLV_INST_RECV_IF_R.class);
			MCQueryApiBuilder afterLBldr = MCQueryApiBuilder.create(IF);

			afterLBldr.setSelect(IF.cst_cd, IF.cst_po_no, IF.cst_po_d_no);

			afterLBldr.addConstWhereWithAnd(exists(subQuery().select(value("X")).from(RECVIF)
							.where(IF.ext_data_no.lt(RECVIF.ext_data_no)
									.and(IF.cst_cd.eq(RECVIF.cst_cd))
									.and(IF.cst_po_no.eq(RECVIF.cst_po_no))
									.and(bracket(IF.cst_po_d_no.isNotNull().and(IF.cst_po_d_no.eq(RECVIF.cst_po_d_no))).or(IF.cst_po_d_no.isNull()))
									.and(RECVIF.exe_sts_typ.in(
											value(MAC_EXE_STS_TYP.OK.value()),
											value(MAC_EXE_STS_TYP.SKP.value()))))));

			dbSelectColumn("MSLAL5140_MST_DLV_INST_RECV_IF_S04", afterL, afterLBldr, exeL,
					MST_DLV_INST_RECV_IF_R.$data_lno);

			Set<List<String>> set = new HashSet<List<String>>();
			for (MST_DLV_INST_RECV_IF_R afterR : afterL) {

				List<String> l = createErrSetKey(afterR);
				if (!set.contains(l)) {
					set.add(l);
				}
			}
			return set;
		}

		/**
		 * 取込結果をマージする。
		 * @param skipL スキップリスト
		 * @param downL dlvInstRecvIf_Upd04の下り電文
		 */
		protected void mergeExeRslt(MCList<MST_DLV_INST_RECV_IF_R> skipL, MCList<DlvInstRecvIf_Upd04_DtlR> downL) {

			_exeRslt = MCList.create(DlvInstRecvIf_Upd04_DtlR.class);
			_exeRslt.setAll(downL);

			DlvInstRecvIf_Upd04_DtlR dtlR = null;

			for (MST_DLV_INST_RECV_IF_R skipR : skipL) {

				dtlR = DlvInstRecvIf_Upd04_DtlR.create();
				dtlR.data_lno(skipR.data_lno());
				dtlR.exe_sts_typ(skipR.exe_sts_typ());
				_exeRslt.add(dtlR);
			}
		}

		/**
		 * 納入指示受信ＩＦ取込の後処理。
		 * @param exeL 取込対象リスト
		 */
		protected void afterCall(MCList<MST_DLV_INST_RECV_IF_R> exeL) {

			rsltCnt(exeL);

			updIf(exeL);

			MCMessageList msgList = MCMessagePool.getMessageList();
			_logger.writeDataLog(msgList);
			pushAlertMsg(msgList);

			dbTran().commit();

			msgList.clear();
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

			MCIndexKey ik = _exeRslt.createIndex(MST_DLV_INST_RECV_IF_R.$log_sub_key1,
					MST_DLV_INST_RECV_IF_R.$log_sub_key2);

			for (MCMessage msg : msgList) {
				MCRow causeRow = msg.getCauseRow();
				if (causeRow == null) {
					continue;
				}

				DlvInstRecvIf_Upd04_DtlR exeR;
				if (causeRow instanceof DlvInstRecvIf_Upd04_DtlR) {
					exeR = (DlvInstRecvIf_Upd04_DtlR) causeRow;
				}
				else {
					MCNumber paramIndex = MCNumber.valueOf(causeRow.getParamIndex());
					MCNumber paramRowIndex = MCNumber
							.valueOf(causeRow.getParamRowIndex());

					exeR = _exeRslt.getFirst(ik, paramIndex, paramRowIndex);
				}

				if (exeR != null && !isNull(exeR.cst_cd())) {
					List<String> keyList = new ArrayList<String>();
					keyList.add(exeR.cst_cd());
					keyList.add(exeR.wg_cd());
					keyList.add(exeR.sls_usr_cd());

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
				String cstCd = entry.getKey().get(0);
				String wgCd = entry.getKey().get(1);
				String usrCd = entry.getKey().get(2);

				pushAlert(null, wgCd, cstCd, usrCd, 
						MODULE_ID, LOGIC_ID, OPERATION_ID,
						entry.getValue(), _logger, 
						MSLAL0205,
						MCConst.lgclbl.getLabel(MODULE_ID, LOGIC_ID, null),
						MCDate.sysnow().toString("yyyy/MM/dd HH:mm:ss"), 
						getCo().co_cd(), wgCd, cstCd);
			}
		}

		/**
		 * 納入指示受信ＩＦを更新する。
		 * @param exeL 取込対象リスト
		 */
		protected void updIf(MCList<MST_DLV_INST_RECV_IF_R> exeL) {

			MST_DLV_INST_RECV_IF_R IF = MST_DLV_INST_RECV_IF_R.create("IF");
			MCQueryApiBuilder exeLBldr = MCQueryApiBuilder.create(IF);

			exeLBldr.setSet(IF.imp_flg, IF.exe_sts_typ, IF.batch_log_no, IF.log_sub_key1, IF.log_sub_key2);
			dbUpdateKey("MSLAL5140_MST_DLV_INST_RECV_IF_U01", exeL, exeLBldr);
		}

		/**
		 * 取込結果の件数を算出する。
		 * @param exeL 取込対象リスト
		 */
		protected void rsltCnt(MCList<MST_DLV_INST_RECV_IF_R> exeL) {

			MCIndexKey idxkey = _exeRslt.createIndex(DlvInstRecvIf_Upd03_DtlR.$data_lno);

			for (MST_DLV_INST_RECV_IF_R exeR : exeL) {

				DlvInstRecvIf_Upd04_DtlR exeRslt = _exeRslt.getFirst(idxkey, exeR.data_lno());

				if (MAC_EXE_STS_TYP.isOK(exeRslt.exe_sts_typ())) {

					exeR.imp_flg(false);
					exeR.exe_sts_typ(MAC_EXE_STS_TYP.OK.value());
					_okNum++;
					_totalNum++;
				}
				else if (MAC_EXE_STS_TYP.isERR(exeRslt.exe_sts_typ())) {

					exeR.imp_flg(true);
					setErrSts(exeR);
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

		/**
		 * 処理結果区分にスキップを設定する。
		 * 
		 * @param exeR 取込対象行
		 */
		protected void setSkipSts(MST_DLV_INST_RECV_IF_R exeR) {

			exeR.exe_sts_typ(MAC_EXE_STS_TYP.SKP.value());
		}

		/**
		 * 処理結果区分にエラーを設定する。
		 * 
		 * @param exeR 取込対象行
		 */
		protected void setErrSts(MST_DLV_INST_RECV_IF_R exeR) {

			exeR.exe_sts_typ(MAC_EXE_STS_TYP.ERR.value());
			setErrSet(exeR);
		}

		/**
		 * 引数で渡された比較対象が同一取込単位かどうか。
		 * @param preR 前の取込対象
		 * @param exeR 取込対象
		 * @return 取込単位のいずれかが異なる場合はtrue
		 */
		protected boolean isNextData(MST_DLV_INST_RECV_IF_R preR, MST_DLV_INST_RECV_IF_R exeR) {

			return !(isSame(preR.ext_data_no(), exeR.ext_data_no())
					&& isSame(preR.cst_cd(), exeR.cst_cd())
					&& isSame(preR.cst_po_no(), exeR.cst_po_no())
					&& isSame(preR.cst_po_d_no(), exeR.cst_po_d_no()));
		}

		/**
		 * 納入指示受信ＩＦワークテーブルのデータを削除する。
		 * @param dlvInstRecvIfL 納入指示受信ＩＦリスト
		 */
		protected void delDlvInstRecvIfWk(MCList<MST_DLV_INST_RECV_IF_R> dlvInstRecvIfL) {
			dbWkDelete("MSLAL5140_MSW_DLV_INST_RECV_IF_D02", MCQueryApiBuilder
					.create(MST_DLV_INST_RECV_IF_R.create("T")).getBaseDbc());
		}

		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {

			down0().total_num(_totalNum);
			down0().ok_num(_okNum);
			down0().err_num(_errNum);
			down0().skip_num(_skipNum);
		}
	}
	/**
	 * DlvInstRecvIf_Upd04オペレーション.<p>
	 *
	 * 納入指示受信ＩＦ取込を行う。（納入指示登録サービスを呼び出す本処理）<br>
	 */
	public class DlvInstRecvIf_Upd04 extends MSLAL_DlvInstRecvIfService_MC_A.DlvInstRecvIf_Upd04 {

		/**
		 * 納入指示受信ＩＦ取込チェックオペレーション
		 */
		protected MSLAL_DlvInstRecvIfService.DlvInstRecvIf_Chk01 _dlvInstRecvIfChk = null;

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

		/**
		 * 初期化処理
		 */
		protected void initProc() {

			// ＰＧ実行状況区分は一旦すべて未処理に設定してから本処理の結果に応じてエラーや処理済に変更する
			up0().setString(DlvInstRecvIf_Upd04_DtlR.$exe_sts_typ, MAC_EXE_STS_TYP.NOT_EXE.value());
			up0().sort(getGrpKey());
		}

		/**
		 * 登録処理
		 */
		protected void proc() {

			MCSavepoint sp = null;
			MCList<DlvInstRecvIf_Upd04_DtlR>[] grp = getGrp();

			MCMessageList msgList = new MCMessageList();
			msgList.addAll(MCMessagePool.getMessageList());

			for (MCList<DlvInstRecvIf_Upd04_DtlR> dlvInstRecvIfL : grp) {

				// 異なる納入指示の間に影響が発生しないように、メッセージプールをクリアする
				MCMessagePool.clear();

				callThisChk01(dlvInstRecvIfL);

				int errRowCnt = dlvInstRecvIfL.subList(r -> isErr(r.dlvInst())).size();
				if (dlvInstRecvIfL.size() == errRowCnt) {
					msgList.addAll(MCMessagePool.getMessageList());
					continue;
				}
				else if (errRowCnt != 0) {
					dlvInstRecvIfL = dlvInstRecvIfL.subList(r -> !isErr(r.dlvInst()));

					// callThisChk01で発生したエラーが、納入指示登録サービスのチェックに
					// 影響しないようにメッセージプールをクリアする
					msgList.addAll(MCMessagePool.getMessageList());
					MCMessagePool.clear();
				}

				try {
					sp = setSavepoint();
					callDlvInstRcptUpdSrv(dlvInstRecvIfL);
				}
				catch (Exception ex) {
					handleEx(ex, sp, dlvInstRecvIfL);
				}
				finally {
					sp = null;
					msgList.addAll(MCMessagePool.getMessageList());
				}
			}

			MCMessagePool.clear();
			MCMessagePool.addAll(msgList);
		}

		/**
		 * 納入指示受信ＩＦ取込チェックを実行する。
		 * @param dlvInstRecvIfL 納入指示受信ＩＦリスト
		 */
		protected void callThisChk01(MCList<DlvInstRecvIf_Upd04_DtlR> dlvInstRecvIfL) {

			_dlvInstRecvIfChk = MSLAL_DlvInstRecvIfService.crtDlvInstRecvIf_Chk01();
			setAll(_dlvInstRecvIfChk.up0(), dlvInstRecvIfL, createMap_DlvInstRecvIf_Chk01_DtlR_DlvInstRecvIf_Upd04_DtlR());
			_dlvInstRecvIfChk.exec();

			MCIndexKey idxkey = _dlvInstRecvIfChk.down0().createIndex(DlvInstRecvIf_Chk01_DtlR.$data_lno);

			for (DlvInstRecvIf_Upd04_DtlR dtlR : dlvInstRecvIfL) {
				DlvInstRecvIf_Chk01_DtlR chkRsltR = _dlvInstRecvIfChk.down0().getFirst(idxkey, dtlR.data_lno());

				if (chkRsltR.err_flg()) {
					setErrSts(dtlR.dlvInst());
				}
				// プッシュ通知用
				dtlR.sls_usr_cd(chkRsltR.sls_usr_cd());
				dtlR.wg_cd(chkRsltR.dpt_wg_cd());
			}

			chkGrpErr(dlvInstRecvIfL);
		}

		/**
		 * 納入指示登録サービスの納入指示登録を実行する。
		 * @param dlvInstRecvIfL 納入指示受信ＩＦリスト
		 */
		protected void callDlvInstRcptUpdSrv(MCList<DlvInstRecvIf_Upd04_DtlR> dlvInstRecvIfL) {
			
			if (isNull(dlvInstRecvIfL.subList(r -> !MAC_EXE_STS_TYP.isERR(r.exe_sts_typ())))) {
				
				return;
			}
			
			MSBBL_DlvInstRcptService.DlvInstRcv_Upd01 upd01Serv = MSBBL_DlvInstRcptService.crtDlvInstRcv_Upd01();
			
			for (DlvInstRcv_Upd01_DtlR dtlR : _dlvInstRecvIfChk.down1()) {
				
				if (dtlR.err_flg()) {
					continue;
				}
				upd01Serv.up0().add(dtlR);
			}
			
			if (!upd01Serv.up0().isEmpty()) {
				upd01Serv.exec();
			}
			
			setOk(dlvInstRecvIfL);
		}
		
		/**
		 * 更新処理例外発生時の後処理を行う。
		 * @param ex 例外
		 * @param sp セーブポイント
		 * @param dlvInstRecvIfL 納入指示受信ＩＦリスト
		 */
		protected void handleEx(Exception ex, MCSavepoint sp, MCList<DlvInstRecvIf_Upd04_DtlR> dlvInstRecvIfL) {

			String msgId = null;
			String msg = null;
			MCMessageList causeMsgList = null;

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

			for (DlvInstRecvIf_Upd04_DtlR opeRow : dlvInstRecvIfL) {

				MCMessagePool.add(opeRow, null, MSLAL0732, opeRow.data_no(),
						opeRow.data_lno(), msgId, msg);
				for (MCMessage causeMsg : causeMsgList) {
					MCMessage newMsg = new MCMessage(opeRow, null, causeMsg.getID(),
							(Object[]) causeMsg.getBindArray());
					MCMessagePool.add(newMsg);
				}

				setErr(opeRow.dlvInst());
			}

			if (sp != null) {

				dbTran().rollback(sp);
			}
		}

		/**
		 * 同一取込単位のうち、エラーが存在するかどうかチェックする。<br>
		 * 一部でもエラーがあったら全てエラーとする。
		 * @param dlvInstRecvIfL 納入指示受信ＩＦリスト
		 */
		protected void chkGrpErr(MCList<DlvInstRecvIf_Upd04_DtlR> dlvInstRecvIfL) {

			MCList<DlvInstRecvIf_Upd04_DtlR>[] grp = groupList(dlvInstRecvIfL, getGrpKey());
			for (MCList<DlvInstRecvIf_Upd04_DtlR> grpL : grp) {
				DlvInstRecvIf_Upd04_DtlR errR = grpL.getFirst(DlvInstRecvIf_Upd04_DtlR.$exe_sts_typ, MAC_EXE_STS_TYP.ERR.value());
				if (errR != null) {
					for (DlvInstRecvIf_Upd04_DtlR dlvInstRecvIfR : grpL) {
						if (!isErr(dlvInstRecvIfR.dlvInst())) {
							MCMessagePool.add(dlvInstRecvIfR, null, MSLAL0733, dlvInstRecvIfR.data_no(), dlvInstRecvIfR.data_lno(), dlvInstRecvIfR.cst_cd(), dlvInstRecvIfR.cst_po_no(), dlvInstRecvIfR.cst_po_d_no());
							setErr(dlvInstRecvIfR.dlvInst());
						}
					}
				}
			}
		}

		/**
		 * セーブポイントを作成する。
		 * @return セーブポイント
		 */
		protected MCSavepoint setSavepoint() {

			return dbTran().setSavepoint();
		}

		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {

			down0().setAll(up0());
		}

		/**
		 * 取込単位で納入指示受信ＩＦ情報をグループ化する。
		 * @return 取込単位のグループ
		 */
		protected MCList<DlvInstRecvIf_Upd04_DtlR>[] getGrp() {

			MCList<DlvInstRecvIf_Upd04_DtlR>[] arr = groupList(up0(), getGrpKey());
			List<MCList<DlvInstRecvIf_Upd04_DtlR>> ret = mergeNewDtlL(arr);
			return ret.toArray(new MCList[ret.size()]);
		}

		/**
		 * 新規取り込みデータが連続している場合は更にまとめる。
		 * @param dtlListArray {@link #getGrpKey()}でグループ化したリスト
		 * @return ret 新規取り込みデータをマージしたリスト
		 */
		protected List<MCList<DlvInstRecvIf_Upd04_DtlR>> mergeNewDtlL(MCList<DlvInstRecvIf_Upd04_DtlR>[] dtlListArr) {
			List<MCList<DlvInstRecvIf_Upd04_DtlR>> ret = new ArrayList<>();
			MCList<DlvInstRecvIf_Upd04_DtlR> mergeDestL = MCList.create(DlvInstRecvIf_Upd04_DtlR.class);
			boolean isMerging = false;

			for (MCList<DlvInstRecvIf_Upd04_DtlR> dtlL : dtlListArr) {
				if (isMergeGrp(dtlL, mergeDestL) && isNewDtlOnly(dtlL)) {
					mergeDestL.addAll(dtlL);
					isMerging = true;
				}
				else {
					if (isMerging) {
						ret.add(mergeDestL);
						isMerging = false;
						mergeDestL = MCList.create(DlvInstRecvIf_Upd04_DtlR.class);
					}
					ret.add(dtlL);
				}
			}

			if (isMerging) {
				ret.add(mergeDestL);// IFデータが全て新規の場合
			}
			return ret;
		}

		protected boolean isMergeGrp(MCList<DlvInstRecvIf_Upd04_DtlR> tgtL, MCList<DlvInstRecvIf_Upd04_DtlR> mergeDestL) {
			if (mergeDestL.isEmpty()) {
				return true;
			}
			
			for (DlvInstRecvIf_Upd04_DtlR tgtR : tgtL) {
				for (DlvInstRecvIf_Upd04_DtlR mergrDestR : mergeDestL) {
					if (!isSame(mergrDestR.dlvInst().ext_sys_cd(), tgtR.dlvInst().ext_sys_cd())) {
						return false;
					}
					
					if (isSame(mergrDestR.cst_cd(), tgtR.cst_cd()) &&
						isSame(mergrDestR.cst_po_no(), tgtR.cst_po_no()) &&
						isSame(mergrDestR.cst_po_rev(), tgtR.cst_po_rev()) &&
						isSame(mergrDestR.cst_po_d_no(), tgtR.cst_po_d_no())) {
						return false;
					}
				}
			}
			
			return true;
		}

		protected boolean isNewDtlOnly(MCList<DlvInstRecvIf_Upd04_DtlR> dtlL) {
			for (DlvInstRecvIf_Upd04_DtlR r : dtlL) {
				if (!MAC_DATA_CRUD_TYP.isCRT(r.dlvInst().data_crud_typ())) {
					return false;
				}
			}
			return true;
		}

		/**
		 * 引数のキーの順番を意識したグループリストを取得する。
		 * @param dlvInstRecvIfL 納入指示受信ＩＦリスト
		 * @param key グループ化の基準カラム名
		 * @return 取込単位のグループ
		 */
		protected MCList<DlvInstRecvIf_Upd04_DtlR>[] groupList(
				MCList<DlvInstRecvIf_Upd04_DtlR> dlvInstRecvIfL, String[] key) {

			MCList<DlvInstRecvIf_Upd04_DtlR>[] arr = dlvInstRecvIfL.groupList(key);

			Arrays.sort(arr, new Comparator<MCList<DlvInstRecvIf_Upd04_DtlR>>() {

				public int compare(MCList<DlvInstRecvIf_Upd04_DtlR> o1,
						MCList<DlvInstRecvIf_Upd04_DtlR> o2) {

					DlvInstRecvIf_Upd04_DtlR r1 = o1.get(0), r2 = o2.get(0);

					int val = r1.ext_data_no().compareTo(r2.ext_data_no());

					if (val == 0) {

						val = r1.cst_cd().compareTo(r2.cst_cd());

						if (val == 0) {
							if (!isNull(r1.cst_po_no()) && !isNull(r2.cst_po_no())) {
								val = r1.cst_po_no().compareTo(r2.cst_po_no());
							}
							else {
								val = 1;
							}

							if (val == 0) {

								if (!isNull(r1.cst_po_rev()) && !isNull(r2.cst_po_rev())) {
									val = r1.cst_po_rev().compareTo(r2.cst_po_rev());
								}
								else if (isNull(r1.cst_po_rev()) && isNull(r2.cst_po_rev())) {
									val = 0;
								}
								else {
									val = 1;
								}
								
								if (val == 0) {
									if (!isNull(r1.cst_po_d_no()) && !isNull(r2.cst_po_d_no())) {
										val = r1.cst_po_d_no().compareTo(r2.cst_po_d_no());
									}
									else if (isNull(r1.cst_po_d_no()) && isNull(r2.cst_po_d_no())) {
										val = 0;
									}
									else {
										val = 1;
									}
								}
							}
						}
					}

					return val;
				}
			});

			return arr;
		}

		/**
		 * 処理結果区分に処理済を設定する。
		 * @param dlvInstRecvIfL 納入指示受信ＩＦリスト
		 */
		protected void setOk(MCList<DlvInstRecvIf_Upd04_DtlR> dlvInstRecvIfL) {

			for (DlvInstRecvIf_Upd04_DtlR dlvInstRecvIfR : dlvInstRecvIfL) {

				if (!isErr(dlvInstRecvIfR.dlvInst())) {
					dlvInstRecvIfR.exe_sts_typ(MAC_EXE_STS_TYP.OK.value());
				}
			}
		}

		/**
		 * 処理結果区分にエラーを設定する。
		 * @param dlvInstRecvIfL 納入指示受信ＩＦ
		 */
		protected void setErr(MST_DLV_INST_RECV_IF_R dlvInstRecvIfR) {
			setErrSts(dlvInstRecvIfR);
		}

		/**
		 * 納入指示受信ＩＦの処理結果区分がエラーかどうか。
		 * @param dlvInstRecvIfR 納入指示受信ＩＦ
		 * @return 処理結果区分がエラーはtrue
		 */
		protected boolean isErr(MST_DLV_INST_RECV_IF_R dlvInstRecvIfR) {

			return MAC_EXE_STS_TYP.isERR(dlvInstRecvIfR.exe_sts_typ());
		}

		/**
		 * 同一取込グループのキーを返す。
		 * @return 同一取込グループのキー
		 */
		protected String[] getGrpKey() {

			return new String[] {
					MST_DLV_INST_RECV_IF_R.$ext_data_no, MST_DLV_INST_RECV_IF_R.$cst_cd,
					MST_DLV_INST_RECV_IF_R.$cst_po_no, MST_DLV_INST_RECV_IF_R.$cst_po_rev, MST_DLV_INST_RECV_IF_R.$cst_po_d_no
			};
		}

		protected Map_DlvInstRecvIf_Chk01_DtlR_DlvInstRecvIf_Upd04_DtlR<DlvInstRecvIf_Chk01_DtlR, DlvInstRecvIf_Upd04_DtlR> createMap_DlvInstRecvIf_Chk01_DtlR_DlvInstRecvIf_Upd04_DtlR() {
			return new Map_DlvInstRecvIf_Chk01_DtlR_DlvInstRecvIf_Upd04_DtlR<DlvInstRecvIf_Chk01_DtlR, DlvInstRecvIf_Upd04_DtlR>();
		}

		public class Map_DlvInstRecvIf_Chk01_DtlR_DlvInstRecvIf_Upd04_DtlR<D extends DlvInstRecvIf_Chk01_DtlR, S extends DlvInstRecvIf_Upd04_DtlR>
				extends MCRowMapper<D, S> {
			@Override
			public void valueCopy(D dest, S src) {

				dest.dlvInst(src.dlvInst());
				dest.setParamIndex(src.dlvInst().getParamIndex());
				dest.setParamRowIndex(src.dlvInst().getParamRowIndex());
			}
		}
	}

	/**
	 * 処理結果区分にエラーを設定
	 * @param dlvInstRecvIfR 納入指示受信ＩＦ
	 */
	protected void setErrSts(MST_DLV_INST_RECV_IF_R dlvInstRecvIfR) {

		dlvInstRecvIfR.exe_sts_typ(MAC_EXE_STS_TYP.ERR.value());
		setErrSet(dlvInstRecvIfR);
	}

	/**
	 * 同一取込グループでエラーが発生した場合に、エラーリスト設定に追加する。
	 * @param dlvInstRecvIfR 納入指示受信ＩＦ
	 */
	protected void setErrSet(MST_DLV_INST_RECV_IF_R dlvInstRecvIfR) {

		List<String> lst = createErrSetKey(dlvInstRecvIfR);
		if (!object(CLAZZ)._errSet.contains(lst)) {
			object(CLAZZ)._errSet.add(lst);
		}
	}

	/**
	 * 同一取込単位で先に処理したデータでエラーが発生したかどうか。
	 * @param dlvInstRecvIfR 納入指示受信ＩＦ
	 * @return エラーが発生した場合はtrue
	 */
	protected boolean isPrevErr(MST_DLV_INST_RECV_IF_R dlvInstRecvIfR) {

		return object(CLAZZ)._errSet.contains(createErrSetKey(dlvInstRecvIfR));
	}

	/**
	 * 同一取込グループのキー項目のリストを作成する。
	 * @param dlvInstRecvIfR 納入指示受信ＩＦ
	 * @return エラーキー項目のリスト
	 */
	protected List<String> createErrSetKey(MST_DLV_INST_RECV_IF_R dlvInstRecvIfR) {

		List<String> lst = new ArrayList<String>();
		if (!isNull(dlvInstRecvIfR)) {
			lst.add(dlvInstRecvIfR.cst_cd());
			lst.add(dlvInstRecvIfR.cst_po_no());
			lst.add(dlvInstRecvIfR.cst_po_d_no());
		}
		return lst;
	}

	/**
	 * DlvInstRecvIf_Chk01オペレーション.<p>
	 *
	 * 納入指示受信ＩＦ取込を行う前のチェック処理<br>
	 */
	public class DlvInstRecvIf_Chk01 extends MSLAL_DlvInstRecvIfService_MC_A.DlvInstRecvIf_Chk01 {
		
		/**
		 * 納入指示受領リスト
		 */
		protected MCList<DlvInstRcv_Upd01_DtlR> _down1L = null;
		protected MCList<DlvInstRecvIf_Chk01_DtlR> _dlvInstRcptL = null;
		MCIndexKey _dlvInstShipSchdKey;
		
		/**
		 * 品目単位のキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _itmUnitCache = null;
		
		protected void initItmUnitCache(MCList<DlvInstRecvIf_Chk01_DtlR> dtlL) {
			_itmUnitCache = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(
					MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T")),
					dtlL.groupBy(DlvInstRecvIf_Chk01_DtlR.$itm_cd,
							DlvInstRecvIf_Chk01_DtlR.$itm_sub1,
							DlvInstRecvIf_Chk01_DtlR.$itm_sub2,
							DlvInstRecvIf_Chk01_DtlR.$itm_sub3,
							DlvInstRecvIf_Chk01_DtlR.$trd_unit_cd),
					"itm_cd", "itm_sub1", "itm_sub2", "itm_sub3", "trd_unit_cd");
		}
		protected MAVM_ITM_UNIT_R getItmUnitR(String itmCd, String itmSub1, String itmSub2, String itmSub3, String unitCd) {
			return _itmUnitCache.get(itmCd, itmSub1, itmSub2, itmSub3, unitCd);
		}
		
		/**
		 * 納入指示受領のキャッシュ
		 */
		protected MCList<DlvInstRecvIf_Chk01_DtlR> _cacheDlvInstRcptL = null;
		
		protected void initDlvInstRcptDCache(MCList<DlvInstRecvIf_Chk01_DtlR> dtlL) {
			_cacheDlvInstRcptL = MCList.create(DlvInstRecvIf_Chk01_DtlR.class);
			MST_SLO_D_R SLOD = MST_SLO_D_R.create("SLOD");
			MST_SLO_R SLO = MST_SLO_R.create("SLO");
			MST_SHIP_PR_R SHIPPR = MST_SHIP_PR_R.create("SHIPPR");
			MST_DLV_INST_RCPT_R DIR = MST_DLV_INST_RCPT_R.create("DIR");
			MCQueryApiBuilder dlvInstRcptBldr = MCQueryApiBuilder.create(DIR);
			
			dlvInstRcptBldr.addSelect(SLO.cst_cd);
			dlvInstRcptBldr.addSelect(SLO.cst_po_no);
			dlvInstRcptBldr.addSelect(SLOD.cst_po_d_no);
			dlvInstRcptBldr.addSelect(SHIPPR.ship_pr_no);
			dlvInstRcptBldr.addInnerJoin(SLOD, SLOD.slo_d_no.eq(DIR.slo_d_no));
			dlvInstRcptBldr.addInnerJoin(SLO, SLO.slo_no.eq(SLOD.slo_no));
			dlvInstRcptBldr.addInnerJoin(SHIPPR, SHIPPR.slo_d_no.eq(SLOD.slo_d_no));
			dlvInstRcptBldr.setWhere(SLOD.slo_no.eq(bind("slo_no")));
			dlvInstRcptBldr.addWhereWithAnd(SLOD.slo_d_no.eq(bind("slo_d_no")));
			dlvInstRcptBldr.addWhereWithAnd(DIR.can_flg.eq(value(false)));
			dbSelect("MSLAL5140_MST_DLV_INST_RCPT_S01", _cacheDlvInstRcptL, dlvInstRcptBldr, 
					dtlL.distinctNE(DlvInstRecvIf_Chk01_DtlR.$slo_no, DlvInstRecvIf_Chk01_DtlR.$slo_d_no));
		}
		
		/**
		 * 出荷予定のキャッシュ
		 */
		protected MCList<MST_SHIP_SCHD_R> _cacheShipSchdL = null;
		
		protected void initShipSchdCache(MCList<DlvInstRecvIf_Chk01_DtlR> dtlL) {
			_cacheShipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
			MST_SLO_D_R SLOD = MST_SLO_D_R.create("SLOD");
			MST_SLO_R SLO = MST_SLO_R.create("SLO");
			MST_SHIP_SCHD_R SCHD = MST_SHIP_SCHD_R.create("SCHD");
			MCQueryApiBuilder cacheShipSchdBldr = MCQueryApiBuilder.create(SCHD);
			MST_SHIP_PR_R SHIPPR = MST_SHIP_PR_R.create("SHIPPR");
			MST_DLV_INST_RCPT_R DIR = MST_DLV_INST_RCPT_R.create("DIR");
			
			_cacheShipSchdL.addStringColumn("cst_dlv_inst_no");
			cacheShipSchdBldr.addSelect(DIR.cst_dlv_inst_no);
			cacheShipSchdBldr.addInnerJoin(SHIPPR, SHIPPR.ship_pr_no.eq(SCHD.ship_pr_no));
			cacheShipSchdBldr.addInnerJoin(SLOD, SLOD.slo_d_no.eq(SHIPPR.slo_d_no));
			cacheShipSchdBldr.addInnerJoin(SLO, SLO.slo_no.eq(SLOD.slo_no));
			cacheShipSchdBldr.addLeftOuterJoin(DIR, DIR.dlv_inst_rcpt_no.eq(SCHD.dlv_inst_rcpt_no));
			cacheShipSchdBldr.setWhere(SLOD.slo_no.eq(bind("slo_no")));
			cacheShipSchdBldr.addWhereWithAnd(SLOD.slo_d_no.eq(bind("slo_d_no")));
			dbSelect("MSLAL5140_MST_SHIP_SCHD_S01", _cacheShipSchdL, cacheShipSchdBldr, 
					dtlL.distinctNE(DlvInstRecvIf_Chk01_DtlR.$slo_no, DlvInstRecvIf_Chk01_DtlR.$slo_d_no));
		}
		
		/**
		 * 受注明細のキャッシュ
		 */
		protected MCList<MST_SLO_D_R> _cacheSloDL = null;
		
		protected void initSloDCache(MCList<DlvInstRecvIf_Chk01_DtlR> dtlL) {
			_cacheSloDL = MCList.create(MST_SLO_D_R.class);
			MST_SLO_D_R SLOD = MST_SLO_D_R.create("SLOD");
			MST_SLO_R SLO = MST_SLO_R.create("SLO");
			MST_SHIP_PR_R SHIPPR = MST_SHIP_PR_R.create("SHIPPR");
			MCQueryApiBuilder sloDBldr = MCQueryApiBuilder.create(SLOD);
			
			_cacheSloDL.addStringColumn("trd_ptn_typ");
			_cacheSloDL.addDateColumn("slo_dt");
			_cacheSloDL.addStringColumn("cst_cd");
			_cacheSloDL.addStringColumn("cst_po_no");
			_cacheSloDL.addStringColumn("sls_dpt_cd");
			_cacheSloDL.addStringColumn("sls_usr_cd");
			_cacheSloDL.addStringColumn("assort_typ");
			_cacheSloDL.addNumberColumn("ship_pr_upd_cntr");
			_cacheSloDL.addNumberColumn("slo_upd_cntr");
			_cacheSloDL.addStringColumn("ship_pr_no");
			sloDBldr.addSelect(SLO.trd_ptn_typ);
			sloDBldr.addSelect(SLO.slo_dt);
			sloDBldr.addSelect(SLO.cst_cd);
			sloDBldr.addSelect(SLO.cst_po_no);
			sloDBldr.addSelect(SLO.sls_dpt_cd);
			sloDBldr.addSelect(SLO.sls_usr_cd);
			sloDBldr.addSelect(SLO.assort_typ);
			sloDBldr.addSelect(SLO.upd_cntr.as("slo_upd_cntr"));
			sloDBldr.addSelect(SHIPPR.upd_cntr.as("ship_pr_upd_cntr"));
			sloDBldr.addSelect(SHIPPR.ship_pr_no);
			sloDBldr.addInnerJoin(SLO, SLOD.slo_no.eq(SLO.slo_no));
			sloDBldr.addLeftOuterJoin(SHIPPR, SLOD.slo_d_no.eq(SHIPPR.slo_d_no));
			sloDBldr.setWhere(SLO.cst_cd.eq(bind("cst_cd")));
			sloDBldr.addWhereWithAnd(SLO.cst_po_no.eq(bind("cst_po_no")));
			sloDBldr.addWhereWithAnd(SLO.can_flg.eq(value(false)));
			sloDBldr.addWhereWithAnd(SLOD.can_flg.eq(value(false)));
			dbSelect("MSLAL5140_MST_SLO_D_S01", _cacheSloDL, sloDBldr,
					dtlL.distinctNE(DlvInstRecvIf_Chk01_DtlR.$cst_cd, DlvInstRecvIf_Chk01_DtlR.$cst_po_no));
		}
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void initUpSub() {
			super.initUpSub();
			
			initSloDCache(up0());
			initItmUnitCache(up0());
			setItmSub(up0());
			
			sortDtl();
			setPegNo(up0());
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheck() {
			MCMessageList msgL = new MCMessageList();
			
			msgL.addAll(chkSloDNo());
			
			msgL.addAll(super.doServerCheck());
			
			msgL.addAll(chkReq());
			
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			MCList<DlvInstRecvIf_Chk01_DtlR> notErrL = getNotErrL(up0());
			if (notErrL.isEmpty()) {
				return msgL;
			}
			
			msgL.addAll(chkPrevErr(notErrL));
			
			msgL.addAll(chkItm(notErrL));
			
			msgL.addAll(chkItmUnit(notErrL));
			
			msgL.addAll(chkDlv(notErrL));
			
			msgL.addAll(chkTdlv(notErrL));
			
			msgL.addAll(chkCrtData(notErrL));
			
			compl(notErrL);
			
			
			setErrFlg(msgL);
			
			MCList<DlvInstRecvIf_Chk01_DtlR> upL = getNotErrL(notErrL);
			if (upL.isEmpty()) {
				return msgL;
			}
			
			callDlvInstRcptChkSrv(upL);
			
			return msgL;
		}
		
		protected MCMessageList chkReq() {
			
			MCMessageList msgL = new MCMessageList();
			
			for (DlvInstRecvIf_Chk01_DtlR dtlR : up0()) {
				
				if (isCrt(dtlR) || isUpd(dtlR)) {
					
					msgL.addAll(check(dtlR, new String[] {DlvInstRecvIf_Chk01_DtlR.$itm_cd, DlvInstRecvIf_Chk01_DtlR.$cst_itm_cd}, new FXUCL_AtLeastOneValidater()));
					msgL.addAll(check(dtlR, DlvInstRecvIf_Chk01_DtlR.$trd_unit_qty, new FXUCL_RequiredValidater()));
				}
			}
			
			return msgL;
		}
		
		/**
		 * リストロジックチェックを行う前に、品目の枝番を設定する。
		 * @param dtlL 納入指示受信ＩＦリスト
		 */
		protected void setItmSub(MCList<DlvInstRecvIf_Chk01_DtlR> dtlL) {
			
			for (DlvInstRecvIf_Chk01_DtlR dtlR : dtlL) {
				
				if (!isNull(dtlR.itm_cd())) {
					
					dtlR.itm_sub1(nvl(dtlR.itm_sub1(), MAC_STR.NULL_VAL.value()));
					dtlR.itm_sub2(nvl(dtlR.itm_sub2(), MAC_STR.NULL_VAL.value()));
					dtlR.itm_sub3(nvl(dtlR.itm_sub3(), MAC_STR.NULL_VAL.value()));
				}
			}
		}
		
		/**
		 * 処理対象の明細をソートする。
		 * @param dtlL 納入指示受信ＩＦリスト
		 */
		protected void sortDtl() {
			
			up0().sort(DlvInstRecvIf_Chk01_DtlR.$cst_cd,
					DlvInstRecvIf_Chk01_DtlR.$cst_po_no,
					DlvInstRecvIf_Chk01_DtlR.$cst_po_d_no,
					DlvInstRecvIf_Chk01_DtlR.$cst_dlv_inst_no,
					DlvInstRecvIf_Chk01_DtlR.$cst_dlv_inst_d_no,
					DlvInstRecvIf_Chk01_DtlR.$data_no,
					DlvInstRecvIf_Chk01_DtlR.$data_lno);
		}
		
		/**
		 * 同一取込グループにエラーのないリストを返す
		 * @return
		 */
		protected MCList<DlvInstRecvIf_Chk01_DtlR> getNotErrL(MCList<DlvInstRecvIf_Chk01_DtlR> upL) {
			
			if (hasErrFlgOn(upL)) {
				MCList<DlvInstRecvIf_Chk01_DtlR> notErrL = upL.createInstance();
				for (MCList<DlvInstRecvIf_Chk01_DtlR> list : upL.groupList(getGrpKey())) {
					if (!hasErrFlgOn(list)) {
						notErrL.addAll(list);
					}
				}
				return notErrL;
			}
			else {
				return upL;
			}
		}
		
		/**
		 * 同一取込グループのキーを返す。
		 * @return 同一取込グループのキー
		 */
		protected String[] getGrpKey() {
			
			return new String[] { 
					DlvInstRecvIf_Chk01_DtlR.$ext_data_no,
					DlvInstRecvIf_Chk01_DtlR.$cst_cd,
					DlvInstRecvIf_Chk01_DtlR.$cst_po_no,
					DlvInstRecvIf_Chk01_DtlR.$cst_po_rev,
					DlvInstRecvIf_Chk01_DtlR.$cst_po_d_no};
		}
		
		/**
		 * 先に処理した注文でエラーが発生しかどうかチェックする。
		 * @param dtlL 納入指示受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkPrevErr(MCList<DlvInstRecvIf_Chk01_DtlR> dtlL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (DlvInstRecvIf_Chk01_DtlR dtlR : dtlL) {
				
				if (isPrevErr(dtlR.dlvInst())) {
					
					msgL.add(new MCMessage(dtlR, null, MSLAL0742, dtlR.data_no(), dtlR.data_lno(), dtlR.cst_cd(), dtlR.cst_po_no(), dtlR.cst_po_d_no()));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 納品先に関連するチェック処理を行う。
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkDlv(MCList<DlvInstRecvIf_Chk01_DtlR> notErrL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (DlvInstRecvIf_Chk01_DtlR dtlR : notErrL) {
				
				if (isDel(dtlR)) {
					continue;
				}
				
				setDlv(dtlR);
				
				if (dtlR.dlv_sundry_flg() && isNull(dtlR.dlv_nm())) {
					
					msgL.add(new MCMessage(dtlR, null, MSLAL0027, dtlR.data_no(), dtlR.data_lno(), dtlR.dlv_cd()));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 配送先に関連するチェック処理を行う。
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkTdlv(MCList<DlvInstRecvIf_Chk01_DtlR> notErrL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (DlvInstRecvIf_Chk01_DtlR dtlR : notErrL) {
				
				if (isDel(dtlR)) {
					continue;
				}
				
				setTdlv(dtlR);
				
				if (dtlR.tdlv_sundry_flg() && isNull(dtlR.tdlv_nm())) {
					
					msgL.add(new MCMessage(dtlR, null, MSLAL0028, dtlR.data_no(), dtlR.data_lno(), dtlR.tdlv_cd()));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 同一受注明細NOで上り電文にわたってない納入指示受領を追加する。(削除)
		 */
		protected void addDlvInstRcpt(MCList<DlvInstRecvIf_Chk01_DtlR> notErrL) {
			_dlvInstRcptL = MCList.create(DlvInstRecvIf_Chk01_DtlR.class);
			MCIndexKey idxkey = _cacheDlvInstRcptL.createIndex(DlvInstRecvIf_Chk01_DtlR.$slo_d_no);
			int i = ((MCNumber)notErrL.max(DlvInstRcv_Upd01_DtlR.$peg_no)).intValue();
			MCIndexKey idxSloDkey = notErrL.createIndex(DlvInstRecvIf_Chk01_DtlR.$slo_d_no, DlvInstRecvIf_Chk01_DtlR.$data_crud_typ);
			MCIndexKey idxPrkey = _cacheShipSchdL.createIndex(MST_SHIP_SCHD_R.$ship_pr_no);
			
			for (MCList<DlvInstRecvIf_Chk01_DtlR> upL : notErrL.groupList(DlvInstRecvIf_Chk01_DtlR.$slo_d_no)) {
				MCList<DlvInstRecvIf_Chk01_DtlR> dlvInstRcptL = MCList.create(DlvInstRecvIf_Chk01_DtlR.class);
				DlvInstRecvIf_Chk01_DtlR upR = upL.get(0);
				MCList<DlvInstRecvIf_Chk01_DtlR> oldDlvInstRcptL = _cacheDlvInstRcptL.subList(idxkey, upR.slo_d_no());
				MCList<MST_SHIP_SCHD_R> oldShipSchdL = _cacheShipSchdL.subList(idxPrkey, upR.ship_pr_no());
				DlvInstRecvIf_Chk01_DtlR delSloDR = notErrL.getFirst(idxSloDkey, new Comparable<?>[] {upR.slo_d_no(), MAC_DATA_CRUD_TYP.DEL.value()});
				MCList<DlvInstRecvIf_Chk01_DtlR> sloDL = MCList.create(DlvInstRecvIf_Chk01_DtlR.class);
				sloDL.addAll(notErrL.subList(idxSloDkey, new Comparable<?>[] {upR.slo_d_no(), MAC_DATA_CRUD_TYP.CRT.value()}));
				sloDL.addAll(notErrL.subList(idxSloDkey, new Comparable<?>[] {upR.slo_d_no(), MAC_DATA_CRUD_TYP.UPD.value()}));
				MCNumber dlvInspQty = nvl(sloDL.sum(DlvInstRecvIf_Chk01_DtlR.$trd_unit_qty), MCNumber.ZERO);
				MCNumber baseQty = nvl(oldShipSchdL.sum(MST_SHIP_SCHD_R.$base_unit_qty), MCNumber.ZERO);
				MCNumber actQty = MCNumber.ZERO;
				
				for (DlvInstRecvIf_Chk01_DtlR oldDlvInstRcptR : oldDlvInstRcptL) {
					MCList<MST_SHIP_SCHD_R> oldDlvInstShipSchdL = _cacheShipSchdL.subList(_dlvInstShipSchdKey, oldDlvInstRcptR.dlv_inst_rcpt_no());
					boolean afterExeFlg = false;
					
					if (!isNull(delSloDR) 
							&& isSame(delSloDR.dlv_inst_rcpt_no(), oldDlvInstRcptR.dlv_inst_rcpt_no()) 
							&& isSame(delSloDR.dlv_inst_rcpt_rev(), oldDlvInstRcptR.dlv_inst_rcpt_rev())) {
						continue;
					}
					
					for(MST_SHIP_SCHD_R shipSchdR : oldDlvInstShipSchdL) {
						if (isTrnst(shipSchdR)) {
							afterExeFlg = true;
						}
					}
					
					DlvInstRecvIf_Chk01_DtlR tmpR = DlvInstRecvIf_Chk01_DtlR.create();
					MCRow.copyall(tmpR, oldDlvInstRcptR);
					if (!afterExeFlg) {
						tmpR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					}
					tmpR.peg_no(++i);
					tmpR.ship_pr_upd_cntr(upR.ship_pr_upd_cntr());
					tmpR.slo_upd_cntr(upR.slo_upd_cntr());
					dlvInstRcptL.add(tmpR);
				}
				
				actQty = getQty(oldShipSchdL);
				
				if (dlvInspQty.gt(baseQty.subtract(actQty)) && !MAC_SLO_PROC_TYP.isPURC_DDLV(upR.proc_typ())) {
					dlvInstRcptL.setString(DlvInstRecvIf_Chk01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value());
				}
				_dlvInstRcptL.addAll(dlvInstRcptL);
			}
		}
		/**
		 * 実績数を取得
		 */
		protected MCNumber getQty(MCList<MST_SHIP_SCHD_R> oldShipSchdL) {
			MCList<MST_SHIP_SCHD_R> shipSchdLNullL = oldShipSchdL.subList(r -> isNull(r.dlv_inst_rcpt_no()));
			MCList<MST_SHIP_SCHD_R> shipSchdLNotNullL = oldShipSchdL.subList(r -> !isNull(r.dlv_inst_rcpt_no()));
			MCNumber actQty = MCNumber.ZERO;
			
			for (MCList<MST_SHIP_SCHD_R> shipSchdL : shipSchdLNotNullL.groupList(MST_SHIP_SCHD_R.$dlv_inst_rcpt_no)) {
				boolean exeFlg = false;
				
				if (shipSchdL.subList(r -> r.abort_qty().isPositive()).size() > 0
						|| shipSchdL.subList(r -> r.ship_inst_qty().isPositive()).size() > 0
						|| shipSchdL.subList(r -> r.ship_act_qty().isPositive()).size() > 0
						|| shipSchdL.subList(r -> r.iv_schd_qty().isPositive()).size() > 0
						|| shipSchdL.subList(MST_SHIP_SCHD_R.$fix_flg, true).size() > 0) {
					exeFlg = true;
				}
				
				if (exeFlg) {
					actQty = actQty.add(shipSchdL.sum(MST_SHIP_SCHD_R.$base_unit_qty));
				}
			}
			
			for (MST_SHIP_SCHD_R shipSchdR : shipSchdLNullL) {
				boolean exeFlg = false;
				
				if (isTrnst(shipSchdR)) {
					exeFlg = true;
				}
				
				if (exeFlg) {
					actQty = actQty.add(shipSchdR.base_unit_qty());
				}
			}
			
			return actQty;
		}

		/**
		 * 削除の納入指示を取得
		 */
		protected DlvInstRecvIf_Chk01_DtlR getDelDlvInstRcptL(MCList<DlvInstRecvIf_Chk01_DtlR> oldDlvInstRcptL) {
			MCList<DlvInstRecvIf_Chk01_DtlR> dlvInstRcptL = MCList.create(DlvInstRecvIf_Chk01_DtlR.class);
			
			for (DlvInstRecvIf_Chk01_DtlR oldDlvInstRcptR : oldDlvInstRcptL) {
				MCList<MST_SHIP_SCHD_R> oldDlvInstShipSchdL = _cacheShipSchdL.subList(_dlvInstShipSchdKey, oldDlvInstRcptR.dlv_inst_rcpt_no());
				boolean afterExeFlg = false;
				for(MST_SHIP_SCHD_R shipSchdR : oldDlvInstShipSchdL) {
					if (isTrnst(shipSchdR)) {
						afterExeFlg = true;
					}
				}
				
				DlvInstRecvIf_Chk01_DtlR tmpR = DlvInstRecvIf_Chk01_DtlR.create();
				MCRow.copyall(tmpR, oldDlvInstRcptR);
				if (!afterExeFlg) {
					tmpR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				dlvInstRcptL.add(tmpR);
			}
			
			dlvInstRcptL.sort(SortType.DESC, DlvInstRecvIf_Chk01_DtlR.$data_crud_typ);
			return dlvInstRcptL.get(0);
		}
		
		/**
		 * 後続処理が実行済みかどうか。
		 * @return 後続処理が実行済みの場合はtrue
		 */
		protected boolean isTrnst(MST_SHIP_SCHD_R shipSchdR) {
			
			if (shipSchdR.ship_inst_qty().isPositive() || 
					shipSchdR.ship_act_qty().isPositive() || 
					shipSchdR.iv_schd_qty().isPositive() || 
					shipSchdR.abort_qty().isPositive() || 
					shipSchdR.fix_flg()) {
				return true;
			}
			
			return false;
		}
		
		/**
		 * 納入指示明細の配送先を保持する。
		 * @param dtlR 納入指示受信ＩＦ
		 */
		protected void setTdlv(DlvInstRecvIf_Chk01_DtlR dtlR) {
			
			if (!dtlR.tdlv_sundry_flg()) {
				
				dtlR.tdlv_nm(dtlR.mst_tdlv_nm());
				dtlR.tdlv_cntct_dpt(dtlR.mst_tdlv_cntct_dpt());
				dtlR.tdlv_cntct_psn(dtlR.mst_tdlv_cntct_psn());
				dtlR.tdlv_zip_cd(dtlR.mst_tdlv_zip_cd());
				dtlR.tdlv_addr1(dtlR.mst_tdlv_addr1());
				dtlR.tdlv_addr2(dtlR.mst_tdlv_addr2());
				dtlR.tdlv_addr3(dtlR.mst_tdlv_addr3());
				dtlR.tdlv_addr4(dtlR.mst_tdlv_addr4());
				dtlR.tdlv_tel(dtlR.mst_tdlv_tel());
				dtlR.tdlv_fax(dtlR.mst_tdlv_fax());
			}
			
			if (isNull(dtlR.tdlv_cd())) {
				
				dtlR.via_dlv_typ(null);
			}
			else {
				if( !dtlR.cst_iv_flg() || MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())) {
					
					dtlR.via_dlv_typ(MAC_VIA_DLV_TYP.NOT_VIA.value());
				}
			}
		}
		
		/**
		 * 着曜日を設定する。
		 * @param dtlR 納入指示受信ＩＦ
		 */
		protected void setDlvDayWeekTyp(DlvInstRecvIf_Chk01_DtlR dtlR) {
			
			if (MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ()) || MAC_VIA_DLV_TYP.isVIA(dtlR.via_dlv_typ()) 
					|| (isNull(dtlR.via_dlv_typ()) && MAC_VIA_DLV_TYP.isVIA(dtlR.slo_via_dlv_typ()))) {
				
				dtlR.dlv_day_week_typ(null);
			}
		}
		
		/**
		 * 品目チェックを行う。
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkItm(MCList<DlvInstRecvIf_Chk01_DtlR> notErrL) {
			
			MCIndexKey idxkey = _cacheSloDL.createIndex(MST_SLO_D_R.$slo_d_no);
			MCMessageList msgL = new MCMessageList();
			
			for (DlvInstRecvIf_Chk01_DtlR dtlR : notErrL) {
				
				if (isDel(dtlR)) {
					continue;
				}
				
				MST_SLO_D_R sloDR = _cacheSloDL.getFirst(idxkey, dtlR.slo_d_no());
				if (!isNull(dtlR.itm_cd())) {
					if (isSameItm(dtlR, sloDR)) {
						
						msgL.add(new MCMessage(dtlR, null, MSLAL0738, dtlR.data_no(), dtlR.data_lno(), dtlR.cst_cd(), dtlR.cst_po_no(), dtlR.cst_po_d_no(),
								toDispItm(sloDR.itm_cd(), sloDR.itm_sub1(), sloDR.itm_sub2(), sloDR.itm_sub3()),
								toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3())));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 品目単位チェックを行う。
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkItmUnit(MCList<DlvInstRecvIf_Chk01_DtlR> notErrL) {
			
			MCIndexKey idxkey = _cacheSloDL.createIndex(MST_SLO_D_R.$slo_d_no);
			MCMessageList msgL = new MCMessageList();
			
			for (DlvInstRecvIf_Chk01_DtlR dtlR : notErrL) {
				
				if (isDel(dtlR)) {
					continue;
				}
				
				MST_SLO_D_R sloDR = _cacheSloDL.getFirst(idxkey, dtlR.slo_d_no());
				if (!isNull(dtlR.trd_unit_cd())) {
					if (!dtlR.dscnt_itm_flg() && !isSame(dtlR.trd_unit_cd(), sloDR.trd_unit_cd())) {
						
						msgL.add(new MCMessage(dtlR, null, MSLAL0744, dtlR.data_no(), dtlR.data_lno(), dtlR.cst_cd(), dtlR.cst_po_no(), dtlR.cst_po_d_no(),
								sloDR.trd_unit_cd(), dtlR.trd_unit_cd()));
					}
				}
				else {
					dtlR.trd_unit_cd(sloDR.trd_unit_cd());
				}
				
				MAVM_ITM_UNIT_R itmUnitR = getItmUnitR(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), dtlR.trd_unit_cd());
				if (!isNull(itmUnitR.itm_cd()) && (dtlR.trd_unit_qty().scale() > itmUnitR.dec_place().intValue())) {
					msgL.add(new MCMessage(dtlR, null, MSLAL0745, dtlR.data_no(), dtlR.data_lno(), dtlR.cst_cd(), dtlR.cst_po_no(), dtlR.cst_po_d_no(),
							dtlR.trd_unit_cd(), dtlR.trd_unit_qty(), itmUnitR.dec_place().intValue()));
				}
				else {
					MCNumber baseUnitQty = convToBaseUnit(dtlR.trd_unit_qty(), 
							dtlR.trd_unit_conv_base_qty(), 
							dtlR.trd_unit_conv_qty(), 
							dtlR.base_unit_dec_place(), 
							dtlR.base_unit_rnd_typ());
					
					dtlR.base_unit_qty(baseUnitQty);
				}
			}
			
			return msgL;
		}
		
		/**
		 * 注文改訂番号チェックを行う。
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkPoRev() {
			
			MCMessageList msgL = new MCMessageList();
			
			for (MCList<DlvInstRecvIf_Chk01_DtlR> dtlL : up0().groupList(DlvInstRecvIf_Chk01_DtlR.$slo_d_no)) {
				
				if (dtlL.groupBy(DlvInstRecvIf_Chk01_DtlR.$cst_po_rev).size() > 1) {
					
					for (DlvInstRecvIf_Chk01_DtlR r : dtlL) {
						
						msgL.add(new MCMessage(r, null, MSLAL0737, r.data_no(), r.data_lno(), r.cst_cd(), r.cst_po_no(), r.cst_po_d_no(), r.cst_po_rev()));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 得意先注文NOと得意先注文明細NOを元に、受注明細NOを補完する。
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkSloDNo() {
			
			MCMessageList msgL = new MCMessageList();
			MCIndexKey idxkey = _cacheSloDL.createIndex("cst_cd", "cst_po_no");
			
			for (DlvInstRecvIf_Chk01_DtlR dtlR : up0()) {
				
				if(isNullOr(dtlR.cst_cd(), dtlR.cst_po_no())) {
					
					continue;
				}
				
				boolean errFlg = false;
				MCList<MST_SLO_D_R> dL = _cacheSloDL.subList(idxkey, dtlR.cst_cd(), dtlR.cst_po_no());
				MCList<MST_SLO_D_R> sloDL = MCList.create(MST_SLO_D_R.class);
				MST_SLO_D_R sloDR = null;
				
				if(!isNull(dtlR.cst_po_d_no())) {
					
					sloDL = dL.subList(MST_SLO_D_R.$cst_po_d_no, dtlR.cst_po_d_no());
				}
				else {
					
					sloDL = dL.subList(r -> isNull(r.cst_po_d_no()));
				}
				
				if(sloDL.isEmpty()) {
					
					msgL.add(new MCMessage(dtlR, null, MSLAL0735, dtlR.data_no(), dtlR.data_lno()));
					errFlg = true;
				}
				else {
					
					if(sloDL.size() > 1) {
						
						msgL.add(new MCMessage(dtlR, null, MSLAL0734, dtlR.data_no(), dtlR.data_lno()));
						errFlg = true;
					}
					else {
						
						sloDR = sloDL.get(0);
						if(sloDR.can_flg()) {
							
							msgL.add(new MCMessage(dtlR, null, MSLAL0736, dtlR.data_no(), dtlR.data_lno(), 
									dtlR.cst_cd(), dtlR.cst_po_no(), dtlR.cst_po_d_no()));
							errFlg = true;
						}
						
						if(sloDR.abort_flg()) {
							
							msgL.add(new MCMessage(dtlR, null, MSLAL0747, dtlR.data_no(), dtlR.data_lno(), 
									dtlR.cst_cd(), dtlR.cst_po_no(), dtlR.cst_po_d_no()));
							errFlg = true;
						}
						
						if(MAC_SHIP_INST_TYP.isNO_PICK(sloDR.ship_inst_typ())){
							
							msgL.add(new MCMessage(dtlR, null, MSLAL0741, dtlR.data_no(), dtlR.data_lno(), 
									dtlR.cst_cd(), dtlR.cst_po_no(), dtlR.cst_po_d_no()));
							errFlg = true;
						}
					}
				}
				
				if (!errFlg) {
					
					dtlR.slo_d_no(sloDR.slo_d_no());
					dtlR.slo_no(sloDR.slo_no());
					dtlR.slo_dt(sloDR.getDate("slo_dt"));
					dtlR.trd_ptn_typ(sloDR.getString("trd_ptn_typ"));
					dtlR.cst_po_d_no(sloDR.cst_po_d_no());
					dtlR.sls_dpt_cd(sloDR.getString("sls_dpt_cd"));
					dtlR.sls_usr_cd(sloDR.getString("sls_usr_cd"));
					dtlR.assort_typ(sloDR.getString("assort_typ"));
					dtlR.set_itm_grp_no(sloDR.set_itm_grp_no());
					dtlR.proc_typ(sloDR.proc_typ());
					dtlR.slo_via_dlv_typ(sloDR.via_dlv_typ());
					dtlR.ship_pr_no(sloDR.getString("ship_pr_no"));
					dtlR.ship_pr_upd_cntr(sloDR.getNumber("ship_pr_upd_cntr"));
					dtlR.slo_upd_cntr(sloDR.getNumber("slo_upd_cntr"));
				}
				
				if(isNull(dtlR.trd_ptn_typ())) {
					dtlR.trd_ptn_typ(MAC_TRD_PTN_TYP.SLS.value());
				}
			}
			
			msgL.addAll(chkPoRev());
			setSlsDptItm();
			initDlvInstRcptDCache(up0());
			initShipSchdCache(up0());
			
			return msgL;
		}
		
		/**
		 * 納品先に関連する項目を設定する。
		 * @param dtlR 納入指示受信ＩＦ
		 */
		protected void setDlv(DlvInstRecvIf_Chk01_DtlR dtlR) {
			
			if (!dtlR.dlv_sundry_flg()) {
				
				dtlR.dlv_nm(dtlR.mst_dlv_nm());
				dtlR.dlv_cntct_dpt(dtlR.mst_dlv_cntct_dpt());
				dtlR.dlv_cntct_psn(dtlR.mst_dlv_cntct_psn());
				dtlR.dlv_zip_cd(dtlR.mst_dlv_zip_cd());
				dtlR.dlv_addr1(dtlR.mst_dlv_addr1());
				dtlR.dlv_addr2(dtlR.mst_dlv_addr2());
				dtlR.dlv_addr3(dtlR.mst_dlv_addr3());
				dtlR.dlv_addr4(dtlR.mst_dlv_addr4());
				dtlR.dlv_tel(dtlR.mst_dlv_tel());
				dtlR.dlv_fax(dtlR.mst_dlv_fax());
			}
		}
		
		/**
		 * 価格印字を設定する。
		 * @param dtlR 納入指示受信ＩＦ
		 */
		protected void setPriPrntFlg(DlvInstRecvIf_Chk01_DtlR dtlR) {
			
			if(isNull(dtlR.dlv_cd())) {
				
				dtlR.pri_prnt_typ(null);
			}
			
			if (!isNull(dtlR.pri_prnt_typ()) && MAC_PRI_PRNT_TYP.contains(dtlR.pri_prnt_typ())) {
				
				if (MAC_PRI_PRNT_TYP.isNOT_PRNT(dtlR.pri_prnt_typ())) {
					dtlR.pri_prnt_flg(false);
				}
				else if (MAC_PRI_PRNT_TYP.isPRNT(dtlR.pri_prnt_typ())) {
					dtlR.pri_prnt_flg(true);
				}
			}
		}
		
		/**
		 * 売上部門に関連する項目を設定する。
		 */
		protected void setSlsDptItm() {
			MAM_DPT_R DPT = MAM_DPT_R.create("DPT");
			MCQueryApiBuilder dptBldr = MCQueryApiBuilder.create(DPT);
			dptBldr.setSelect(DPT.wg_cd);
			FXUCL_MCDbcCacheStEnd<MAM_DPT_R> dptCache = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(dptBldr, up0(), DlvInstRecvIf_Chk01_DtlR.$sls_dpt_cd);
			
			for (DlvInstRecvIf_Chk01_DtlR dtlR : up0()) {
				
				if (!isNull(dtlR.sls_dpt_cd())) {
					
					MAM_DPT_R dtpR = dptCache.get(dtlR.slo_dt(), dtlR.sls_dpt_cd());
					
					if (!isNull(dtpR)) {
						
						dtlR.dpt_wg_cd(dtpR.wg_cd());
					}
				}
			}
		}
		
		/**
		 * 納入指示受領サービスの更新前チェック処理を呼び出す。
		 */
		protected void callDlvInstRcptChkSrv(MCList<DlvInstRecvIf_Chk01_DtlR> upL) {
			
			addDlvInstRcpt(upL);
			MSBBL_DlvInstRcptService.DlvInstRcv_Chk01 chkOpe = MSBBL_DlvInstRcptService.crtDlvInstRcv_Chk01();
			
			addAll(chkOpe.up0(), upL, createMap_DlvInstRcv_Upd01_DtlR_DlvInstRecvIf_Chk01_DtlR());
			
			addAll(chkOpe.up0(), _dlvInstRcptL, createMap_DlvInstRcv_Upd01_DtlR_DlvInstRecvIf_Chk01_DtlR());
			
			chkOpe.exec();
			
			if (!chkOpe.down0().isEmpty()) {
				
				MCList<DlvInstRcv_Upd01_DtlR> down0L = chkOpe.down0().clone();
				_down1L = MCList.create(DlvInstRcv_Upd01_DtlR.class);
				MCIndexKey idxkey = upL.createIndex(DlvInstRecvIf_Chk01_DtlR.$peg_no);
				MCList<DlvInstRcv_Upd01_DtlR> noUp0L = down0L.subList(r -> !upL.contains(idxkey, r.peg_no()));
				MCList<DlvInstRcv_Upd01_DtlR> up0L = down0L.subList(r -> upL.contains(idxkey, r.peg_no()));
				MCIndexKey idxkey1 = noUp0L.createIndex(DlvInstRcv_Upd01_DtlR.$slo_d_no);
				MCIndexKey idxkey2 = up0L.createIndex(DlvInstRcv_Upd01_DtlR.$slo_d_no);
				
				for(MCList<DlvInstRcv_Upd01_DtlR> d0L : down0L.groupList(DlvInstRcv_Upd01_DtlR.$slo_d_no)) {
					
					if(d0L.subList(DlvInstRcv_Upd01_DtlR.$err_flg, true).size() == 0) {
						_down1L.addAll(d0L);
						continue;
					}
					
					MCList<DlvInstRcv_Upd01_DtlR> dtlL1 = up0L.subList(idxkey2, d0L.get(0).slo_d_no());
					MCList<DlvInstRcv_Upd01_DtlR> dtlL2 = noUp0L.subList(idxkey1, d0L.get(0).slo_d_no());
					DlvInstRcv_Upd01_DtlR errR1 = dtlL1.getFirst(DlvInstRecvIf_Chk01_DtlR.$err_flg, true);
					DlvInstRcv_Upd01_DtlR errR2 = dtlL2.getFirst(DlvInstRecvIf_Chk01_DtlR.$err_flg, true);
					MCList<DlvInstRcv_Upd01_DtlR> errL = dtlL2.subList(DlvInstRecvIf_Chk01_DtlR.$err_flg, true);
					boolean errFlg = false;
					
					if(isNull(errR1) && !isNull(errR2)) {
						dtlL1.get(0).err_flg(true);
						
						for (MCMessage msgRow : MCMessagePool.getMessageList()) {
							MCRow causerow = msgRow.getCauseRow();
							MCNumber pegNo = causerow.getNumberNE("peg_no");
							if(!isNull(errL.subList(r -> isSame(r.peg_no(), pegNo))) && !errFlg) {
								msgRow.setCauseRow(dtlL1.get(0), null);
								errFlg = true;
							}
						}
					}
				}
				
				copyErrFlg(upL, down0L);
				// メッセージ編集
				MCMessageList msgL = MCMessagePool.getMessageList();
				MCMessageList addmsgl = new MCMessageList();
				MCMessageList removemsgl = new MCMessageList();
				for (MCMessage msg : msgL) {
					MCRow causerow = msg.getCauseRow();
					MCNumber pegNo = causerow.getNumberNE("peg_no");
					DlvInstRecvIf_Chk01_DtlR dtlR = upL.getFirst(idxkey, pegNo);
					if(!isNull(dtlR)) {
						addmsgl.add(new MCMessage(causerow, null, MSLAL0739, dtlR.data_no(), dtlR.data_lno(), 
								msg.getID(), msg));
						removemsgl.add(msg);
					}
				}
				msgL.removeAll(removemsgl);
				msgL.addAll(addmsgl);
			}
		}
		
		/**
		 * 新規データチェック処理を行う。
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkCrtData(MCList<DlvInstRecvIf_Chk01_DtlR> notErrL) {
			
			MCMessageList msgL = new MCMessageList();
			MCIndexKey idxkey = _cacheDlvInstRcptL.createIndex(
					DlvInstRecvIf_Chk01_DtlR.$slo_d_no,
					DlvInstRecvIf_Chk01_DtlR.$cst_dlv_inst_no);
			MCIndexKey idxSloDkey = _cacheDlvInstRcptL.createIndex(DlvInstRecvIf_Chk01_DtlR.$slo_d_no);
			_dlvInstShipSchdKey = _cacheShipSchdL.createIndex(MST_DLV_INST_RCPT_R.$dlv_inst_rcpt_no);
			
			for (DlvInstRecvIf_Chk01_DtlR dtlR : notErrL) {
				
				DlvInstRecvIf_Chk01_DtlR dlvInstRcptR = _cacheDlvInstRcptL.getFirst(idxkey, dtlR.slo_d_no(), dtlR.cst_dlv_inst_no());
				MCList<DlvInstRecvIf_Chk01_DtlR> oldDlvInstRcptL = _cacheDlvInstRcptL.subList(idxSloDkey, dtlR.slo_d_no());
				
				if (isCrt(dtlR) && !isNull(dlvInstRcptR)) {
					
					msgL.add(new MCMessage(dtlR, null, MSLAL0748, 
							dtlR.data_no(), dtlR.data_lno(), dtlR.cst_cd(), 
							dtlR.cst_po_no(), dtlR.cst_po_d_no(), dtlR.cst_dlv_inst_no()));
					
					continue;
				}
				
				if (!isNull(dlvInstRcptR)) {
					
					dtlR.dlv_inst_rcpt_no(dlvInstRcptR.dlv_inst_rcpt_no());
					dtlR.dlv_inst_rcpt_rev(dlvInstRcptR.dlv_inst_rcpt_rev());
				}
				
				if (isUpd(dtlR)) {
					
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				
				if (isDel(dtlR)) {
					
					DlvInstRecvIf_Chk01_DtlR delDlvInstRcptR = getDelDlvInstRcptL(oldDlvInstRcptL);
					dtlR.cst_dlv_inst_no(delDlvInstRcptR.cst_dlv_inst_no());
					dtlR.cst_dlv_inst_rev(delDlvInstRcptR.cst_dlv_inst_rev());
					dtlR.cst_dlv_inst_d_no(delDlvInstRcptR.cst_dlv_inst_d_no());
					dtlR.dlv_inst_rcpt_no(delDlvInstRcptR.dlv_inst_rcpt_no());
					dtlR.dlv_inst_rcpt_rev(delDlvInstRcptR.dlv_inst_rcpt_rev());
				}
			}
			
			return msgL;
		}
		
		/**
		 * 納入指示受信ＩＦの補完を行う。
		 */
		protected void compl(MCList<DlvInstRecvIf_Chk01_DtlR> notErrL) {
			
			for (DlvInstRecvIf_Chk01_DtlR dtlR : notErrL) {
				
				setPriPrntFlg(dtlR);
				setDlvDayWeekTyp(dtlR);
				
			}
			
			clear(notErrL);
		}
		
		/**
		 * 出荷品揃区分：品揃するまたは品揃グループＮＯが設定されている場合、設定不要の項目をクリアする。
		 * @param dtlR 納入指示CSVファイル
		 */
		protected void clear(MCList<DlvInstRecvIf_Chk01_DtlR> notErrL) {
			
			for (DlvInstRecvIf_Chk01_DtlR dtlR : notErrL) {
				
				if (MSC_SHIP_ASSORT_TYP.isAST(dtlR.assort_typ())
						|| !isNull(dtlR.set_itm_grp_no())) {
					
					dtlR.dlv_cd(null);
					dtlR.dlv_nm(null);
					dtlR.dlv_cntry_cd(null);
					dtlR.pri_prnt_flg(false);
					dtlR.dlv_sundry_flg(false);
					dtlR.dlv_lg_grp_cd(null);
					dtlR.dlv_zip_cd(null);
					dtlR.dlv_addr1(null);
					dtlR.dlv_addr2(null);
					dtlR.dlv_addr3(null);
					dtlR.dlv_addr4(null);
					dtlR.dlv_tel(null);
					dtlR.dlv_fax(null);
					dtlR.dlv_cntct_dpt(null);
					dtlR.dlv_cntct_psn(null);
					dtlR.tdlv_cd(null);
					dtlR.tdlv_nm(null);
					dtlR.tdlv_cntry_cd(null);
					dtlR.tdlv_sundry_flg(false);
					dtlR.tdlv_lg_grp_cd(null);
					dtlR.tdlv_zip_cd(null);
					dtlR.tdlv_addr1(null);
					dtlR.tdlv_addr2(null);
					dtlR.tdlv_addr3(null);
					dtlR.tdlv_addr4(null);
					dtlR.tdlv_tel(null);
					dtlR.tdlv_fax(null);
					dtlR.tdlv_cntct_dpt(null);
					dtlR.tdlv_cntct_psn(null);
					dtlR.via_dlv_typ(null);
					dtlR.dlv_day_week_typ(null);
				}
			}
		}
		
		protected boolean isSameItm(DlvInstRecvIf_Chk01_DtlR dlvInstRecvIfR, MST_SLO_D_R sloDR) {
			
			return !isSame(sloDR.itm_cd(), dlvInstRecvIfR.itm_cd()) || !isSame(sloDR.itm_sub1(), dlvInstRecvIfR.itm_sub1())
					|| !isSame(sloDR.itm_sub2(), dlvInstRecvIfR.itm_sub2()) || !isSame(sloDR.itm_sub3(), dlvInstRecvIfR.itm_sub3());
		}
		
		/**
		 * 指定された納入指示受信ＩＦが新規かどうか。
		 * @param dlvInstRecvIfR 納入指示受信ＩＦ
		 * @return 新規の場合はtrue
		 */
		protected boolean isCrt(DlvInstRecvIf_Chk01_DtlR dlvInstRecvIfR) {
			
			return MAC_DATA_CRUD_TYP.isCRT(dlvInstRecvIfR.data_crud_typ());
		}
		
		/**
		 * 指定された納入指示受信ＩＦが更新かどうか。
		 * @param dlvInstRecvIfR 納入指示受信ＩＦ
		 * @return 新規の場合はtrue
		 */
		protected boolean isUpd(DlvInstRecvIf_Chk01_DtlR dlvInstRecvIfR) {
			
			return MAC_DATA_CRUD_TYP.isUPD(dlvInstRecvIfR.data_crud_typ());
		}
		
		/**
		 * 指定された納入指示受信ＩＦが更新かどうか。
		 * @param dlvInstRecvIfR 納入指示受信ＩＦ
		 * @return 削除の場合はtrue
		 */
		protected boolean isDel(DlvInstRecvIf_Chk01_DtlR dlvInstRecvIfR) {
			
			return MAC_DATA_CRUD_TYP.isDEL(dlvInstRecvIfR.data_crud_typ());
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			down0().setAll(up0());
			down1().addAll(_down1L);
		}
	}

	protected Map_DlvInstRcv_Upd01_DtlR_DlvInstRecvIf_Chk01_DtlR<DlvInstRcv_Upd01_DtlR, DlvInstRecvIf_Chk01_DtlR> createMap_DlvInstRcv_Upd01_DtlR_DlvInstRecvIf_Chk01_DtlR() {
		return new Map_DlvInstRcv_Upd01_DtlR_DlvInstRecvIf_Chk01_DtlR<DlvInstRcv_Upd01_DtlR, DlvInstRecvIf_Chk01_DtlR>();
	}

	public class Map_DlvInstRcv_Upd01_DtlR_DlvInstRecvIf_Chk01_DtlR<D extends DlvInstRcv_Upd01_DtlR, S extends DlvInstRecvIf_Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$data_crud_typ, DlvInstRecvIf_Chk01_DtlR.$data_crud_typ);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_inst_rcpt_no, DlvInstRecvIf_Chk01_DtlR.$dlv_inst_rcpt_no);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_inst_rcpt_rev, DlvInstRecvIf_Chk01_DtlR.$dlv_inst_rcpt_rev);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$slo_d_no, DlvInstRecvIf_Chk01_DtlR.$slo_d_no);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$cst_dlv_inst_no, DlvInstRecvIf_Chk01_DtlR.$cst_dlv_inst_no);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$cst_dlv_inst_rev, DlvInstRecvIf_Chk01_DtlR.$cst_dlv_inst_rev);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$cst_dlv_inst_d_no, DlvInstRecvIf_Chk01_DtlR.$cst_dlv_inst_d_no);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_rqst_tm, DlvInstRecvIf_Chk01_DtlR.$dlv_rqst_tm);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$trd_unit_qty, DlvInstRecvIf_Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$cst_dlv_inst_rmrks, DlvInstRecvIf_Chk01_DtlR.$cst_dlv_inst_rmrks);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$cst_dlv_inst_d_rmrks, DlvInstRecvIf_Chk01_DtlR.$cst_dlv_inst_d_rmrks);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$intr_rmrks, DlvInstRecvIf_Chk01_DtlR.$intr_rmrks);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_cd, DlvInstRecvIf_Chk01_DtlR.$dlv_cd);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_sundry_flg, DlvInstRecvIf_Chk01_DtlR.$dlv_sundry_flg);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_nm, DlvInstRecvIf_Chk01_DtlR.$dlv_nm);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_cntct_dpt, DlvInstRecvIf_Chk01_DtlR.$dlv_cntct_dpt);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_cntct_psn, DlvInstRecvIf_Chk01_DtlR.$dlv_cntct_psn);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_zip_cd, DlvInstRecvIf_Chk01_DtlR.$dlv_zip_cd);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_addr1, DlvInstRecvIf_Chk01_DtlR.$dlv_addr1);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_addr2, DlvInstRecvIf_Chk01_DtlR.$dlv_addr2);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_addr3, DlvInstRecvIf_Chk01_DtlR.$dlv_addr3);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_addr4, DlvInstRecvIf_Chk01_DtlR.$dlv_addr4);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_tel, DlvInstRecvIf_Chk01_DtlR.$dlv_tel);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_fax, DlvInstRecvIf_Chk01_DtlR.$dlv_fax);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_lg_grp_cd, DlvInstRecvIf_Chk01_DtlR.$dlv_lg_grp_cd);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$pri_prnt_flg, DlvInstRecvIf_Chk01_DtlR.$pri_prnt_flg);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$tdlv_cd, DlvInstRecvIf_Chk01_DtlR.$tdlv_cd);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$tdlv_sundry_flg, DlvInstRecvIf_Chk01_DtlR.$tdlv_sundry_flg);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$tdlv_nm, DlvInstRecvIf_Chk01_DtlR.$tdlv_nm);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$via_dlv_typ, DlvInstRecvIf_Chk01_DtlR.$via_dlv_typ);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$tdlv_cntct_dpt, DlvInstRecvIf_Chk01_DtlR.$tdlv_cntct_dpt);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$tdlv_cntct_psn, DlvInstRecvIf_Chk01_DtlR.$tdlv_cntct_psn);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$tdlv_zip_cd, DlvInstRecvIf_Chk01_DtlR.$tdlv_zip_cd);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$tdlv_addr1, DlvInstRecvIf_Chk01_DtlR.$tdlv_addr1);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$tdlv_addr2, DlvInstRecvIf_Chk01_DtlR.$tdlv_addr2);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$tdlv_addr3, DlvInstRecvIf_Chk01_DtlR.$tdlv_addr3);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$tdlv_addr4, DlvInstRecvIf_Chk01_DtlR.$tdlv_addr4);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$tdlv_tel, DlvInstRecvIf_Chk01_DtlR.$tdlv_tel);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$tdlv_fax, DlvInstRecvIf_Chk01_DtlR.$tdlv_fax);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$tdlv_lg_grp_cd, DlvInstRecvIf_Chk01_DtlR.$tdlv_lg_grp_cd);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$dlv_day_week_typ, DlvInstRecvIf_Chk01_DtlR.$dlv_day_week_typ);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$ship_pr_upd_cntr, DlvInstRecvIf_Chk01_DtlR.$ship_pr_upd_cntr);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$slo_upd_cntr, DlvInstRecvIf_Chk01_DtlR.$slo_upd_cntr);
			addColumnPathMap(DlvInstRcv_Upd01_DtlR.$peg_no, DlvInstRecvIf_Chk01_DtlR.$peg_no);

		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			dest.edi_flg(true);
			dest.is_src_batch_flg(true);
		}
	}

	//FMCB CUSTOM END
}