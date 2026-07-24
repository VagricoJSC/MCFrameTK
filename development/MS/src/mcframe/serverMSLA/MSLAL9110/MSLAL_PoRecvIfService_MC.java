package mcframe.serverMSLA.MSLAL9110;

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
import mcframe.serverMS.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSLA.MSLAL9110.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSUC.MSUCL0030.MSUCL_ProdUtil;
import mcframe.serverMBBE.MBBEL5010.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverPFUD.PFUDL0040.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import java.util.*;
import mcframe.serverCore.requester.MCServerThreadManager;
import mcframe.serverMSLA.MSLAL6320.MSLAL_SCMActRecvIfService;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogger;
import mcframe.serverFXUC.FXUCL0170.*;
import mcframe.serverFXUC.FXUCL0030.*;
import mcframe.serverCore.resource.MCConst;
import mcframe.serverCore.mcjdbc.MCSavepoint;
import mcframe.serverCore.sys.MCSys;
import mcframe.serverMSBD.MSBDL5100.*;
import mcframe.serverMSBF.MSBFL5210.*;
import mcframe.serverMSBD.MSBDL5040.*;
import static mcframe.serverMSBD.MSBDL5040.MSBDL_PurcUtil.*;
import static mcframe.commonCore.container.MCRow.*;
import mcframe.serverMAUC.MAUCL1060.MAUCL_TrdUtil;
import mcframe.serverMAUC.MAUCL5020.MAUCL_RevDataService;
import mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil;
import mcframe.serverMSUC.MSUCL0110.*;
import mcframe.serverPF.dbc.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_PoRecvIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_PoRecvIfService_MC extends MSLAL_PoRecvIfService_MC_A{
	//FMCB CUSTOM START
	/**
	 * エラーになったキーの組み合わせを保持する(Upd03, Upd04で共有)
	 */
	protected Set<List<String>> _errSet = new HashSet<>();

	/**
	 * キャッシュを管理するリクエストオブジェクト
	 */
	protected static final Class<MSLAL_PoRecvIfService> CLAZZ = MSLAL_PoRecvIfService.class;
	
	/**
	 * PoRecvIf_Upd01オペレーション.<p>
	 *
	 * 発注受信ＩＦ取込を行う。（ＥＳＢのリアルタイム取込から呼び出される）<br>
	 */
	public class PoRecvIf_Upd01 extends MSLAL_PoRecvIfService_MC_A.PoRecvIf_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			callPoRecvIfUpd02();
		}
		
		/**
		 * 発注受信ＩＦ取込２を実行する。
		 */
		protected void callPoRecvIfUpd02() {
			MSLAL_PoRecvIfService.PoRecvIf_Upd02 ope = MSLAL_PoRecvIfService.crtPoRecvIf_Upd02();
			
			setAll(ope.up0(), up0(), createMap_IfDataImp_Upd01_DtlR_Upd01_DtlR());
			
			ope.exec();
		}
		
		protected Map_IfDataImp_Upd01_DtlR_Upd01_DtlR<IfDataImp_Upd01_DtlR,Upd01_DtlR> createMap_IfDataImp_Upd01_DtlR_Upd01_DtlR() {
			return new Map_IfDataImp_Upd01_DtlR_Upd01_DtlR<IfDataImp_Upd01_DtlR, Upd01_DtlR>();
		}

		public class Map_IfDataImp_Upd01_DtlR_Upd01_DtlR<D extends IfDataImp_Upd01_DtlR, S extends Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(IfDataImp_Upd01_DtlR.$data_no, Upd01_DtlR.$data_no);
				addColumnPathMap(IfDataImp_Upd01_DtlR.$ext_data_no, Upd01_DtlR.$ext_data_no);
				addColumnPathMap(IfDataImp_Upd01_DtlR.$ext_sys_cd, Upd01_DtlR.$ext_sys_cd);
			}
		}
	}
	/**
	 * PoRecvIf_Upd02オペレーション.<p>
	 *
	 * 発注受信ＩＦ取込を行う。（ＩＦデータ確認、および発注受信ＩＦ取込バッチから呼び出される）<br>
	 */
	public class PoRecvIf_Upd02 extends MSLAL_PoRecvIfService_MC_A.PoRecvIf_Upd02 {
		
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
		 * 発注受信ＩＦリスト 
		 */
		MCList<MST_PO_RECV_IF_R> _poRecvIfL = null;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			try {
				initProc();
				
				writeStartLog();
				
				preSrchLockSdrvIf();
				
				exe();
				
				setDown();
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
			logger().writeStartLog(MSLAL0470);
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
			
			logger().writeEndLog(MSLAL0471, _totalNum, _okNum, _errNum, _skipNum);
			pushEndLog(logger());
			// Loggerを新規作成した場合（呼出元からLoggerを引き継がない場合）のみクローズ
			if (_crtNewLogger) {
				logger().close();
			}
		}
		
		/**
		 * 発注受信ＩＦデータを取得し、送受信ＩＦをロックする。
		 */		
		protected void preSrchLockSdrvIf() {

			_poRecvIfL = MCList.create(MST_PO_RECV_IF_R.class);
			_poRecvIfL.addNumberColumn("sdrv_if_data_no");
			_poRecvIfL.addStringColumn("ap_cred_cd");
			
			MST_PO_RECV_IF_R t1 = MST_PO_RECV_IF_R.create("T");
			MCQueryApiBuilder poRecvIfL_bldr = MCQueryApiBuilder.create(t1);
			PFT_SDRV_IF_R t2 = PFT_SDRV_IF_R.create("T2");
			
			poRecvIfL_bldr.addSelect(t2.data_no.as("sdrv_if_data_no"));
			poRecvIfL_bldr.addSelect(MAPA_BP$F_GET_CRED_OF_SPPL(t1.sppl_cd).as("ap_cred_cd"));

			poRecvIfL_bldr.addLeftOuterJoin(t2, t1.data_no.eq(t2.data_no));

			poRecvIfL_bldr.setWhere(value(0).eq(value(0)));
			poRecvIfL_bldr.addWhereWithAnd(bracket(t2.sdrv_sts_typ.isNull().or(
					t2.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.RECV_CONV_OK.value())))));
			poRecvIfL_bldr.addWhereWithAnd(t1.imp_flg.eq(value(true)));

			if (!up0().isEmpty()) {
				poRecvIfL_bldr.addWhereWithCutOffAnd(t1.data_lno.eq(bind("data_lno")));
				poRecvIfL_bldr.addWhereWithCutOffAnd(t1.data_no.eq(bind("data_no")));
				poRecvIfL_bldr
						.addWhereWithCutOffAnd(t1.ext_data_no.eq(bind("ext_data_no")));
				poRecvIfL_bldr
						.addWhereWithCutOffAnd(t1.ext_sys_cd.eq(bind("ext_sys_cd")));
				dbSelect("MSLAL9110_MST_PO_RECV_IF_S01", _poRecvIfL, poRecvIfL_bldr, up0());
			}
			else {
				dbSelect("MSLAL9110_MST_PO_RECV_IF_S02", _poRecvIfL, poRecvIfL_bldr);
			}
			
			if (!_poRecvIfL.isEmpty()) {
				
				MCList<MST_PO_RECV_IF_R> lockIfL = _poRecvIfL.subList(r->!isNull(r.getNumberNE("sdrv_if_data_no")));
				
				if (!lockIfL.isEmpty()) {
					
					MCQueryApiBuilder sdrvIfL_bldr = MCQueryApiBuilder.create(PFT_SDRV_IF_R.create("T"));
					sdrvIfL_bldr.setSelect(sdrvIfL_bldr.getBaseDbc().getKeyColumn$());
					
					dbSelectKeyForUpdate("MSLAL9110_PFT_SDRV_IF_S01", MCList.create(PFT_SDRV_IF_R.class), sdrvIfL_bldr, lockIfL);
				}
			}
		}
		
		protected void exe() {
			callPoRecvIfUpd03();
		}
		
		/**
		 * スレッドを分割し、各スレッドごとに発注受信ＩＦ取込３を実行する。
		 */
		protected void callPoRecvIfUpd03() {
			
			int no = 0;
			MSLAL_PoRecvIfService.PoRecvIf_Upd03 upd03;
			List<MSLAL_PoRecvIfService.PoRecvIf_Upd03> opeL = new ArrayList<>();
			
			for (MCList<MST_PO_RECV_IF_R> apCredGrpL : _poRecvIfL.groupList("ap_cred_cd")) {
				
				if(!isNull(apCredGrpL.get(0).getStringNE("ap_cred_cd"))) {
					
					upd03 = MSLAL_PoRecvIfService.crtPoRecvIf_Upd03();
					upd03._no = ++no;
					setAll(upd03.up0(), apCredGrpL, createMap_PoRecvIf_Upd03_DtlR_MST_PO_RECV_IF_R());
					
					opeL.add(upd03);
				}
				else {
					for (MCList<MST_PO_RECV_IF_R> spplGrpL : apCredGrpL.groupList(MST_PO_RECV_IF_R.$sppl_cd)) {
						
						upd03 = MSLAL_PoRecvIfService.crtPoRecvIf_Upd03();
						upd03._no = ++no;
						setAll(upd03.up0(), spplGrpL, createMap_PoRecvIf_Upd03_DtlR_MST_PO_RECV_IF_R());
						
						opeL.add(upd03);
					}
				}
			}
			if (!opeL.isEmpty()) {
				if (MCServerThreadManager.getLimitThreadSize() <= 1) {
					MCServerThreadManager.setUseMainDBTran(true);
					MCServerThreadManager.invokeAndWait(1, opeL, FXBAL_BatchLogManager.class);
				}
				else {
					MCServerThreadManager.setCommitAndRollback(true);
					// 件数の多いスレッドを優先に実行する。
					Collections.sort(opeL, new Comparator<MSLAL_PoRecvIfService.PoRecvIf_Upd03>() {
						public int compare(MSLAL_PoRecvIfService.PoRecvIf_Upd03 o1, MSLAL_PoRecvIfService.PoRecvIf_Upd03 o2) {
							return (o1.up0().size() - o2.up0().size()) * -1; // 降順
						}
					});
					MCServerThreadManager.invokeAndWait(opeL, FXBAL_BatchLogManager.class);
				}
				for (MSLAL_PoRecvIfService.PoRecvIf_Upd03 ope : opeL) {
					_totalNum += ope.down0().total_num().intValue();
					_okNum += ope.down0().ok_num().intValue();
					_errNum += ope.down0().err_num().intValue();
					_skipNum += ope.down0().skip_num().intValue();
				}
			}
		}
		
		protected void setDown() {
			down0().total_num(_totalNum);
			down0().ok_num(_okNum);
			down0().err_num(_errNum);
			down0().skip_num(_skipNum);
		}
		
		protected Map_PoRecvIf_Upd03_DtlR_MST_PO_RECV_IF_R<PoRecvIf_Upd03_DtlR,MST_PO_RECV_IF_R> createMap_PoRecvIf_Upd03_DtlR_MST_PO_RECV_IF_R() {
			return new Map_PoRecvIf_Upd03_DtlR_MST_PO_RECV_IF_R<PoRecvIf_Upd03_DtlR, MST_PO_RECV_IF_R>();
		}

		public class Map_PoRecvIf_Upd03_DtlR_MST_PO_RECV_IF_R<D extends PoRecvIf_Upd03_DtlR, S extends MST_PO_RECV_IF_R> extends MCRowMapper<D,S>{
			@Override
			public void valueCopy(D dest, S src) {
				dest.poif(src);
			}
		}
	}
	
	/**
	 * PoRecvIf_Upd03オペレーション.<p>
	 *
	 * 発注受信ＩＦ取込を行う。（マルチスレッド実行用）<br>
	 */
	public class PoRecvIf_Upd03 extends MSLAL_PoRecvIfService_MC_A.PoRecvIf_Upd03 {
		/**
		 * 発注受信ＩＦ取込４を呼び出す際にデータＮＯ、外部発注ＮＯの組み合わせを何件ずつ渡すかのパラメータ
		 */
		protected int _loopCnt = MCConst.app.getInteger("MS.MSLAL9110.loop_size", 100);
		
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
		 * PoRecvIf_Upd04バッチ呼び出しオペレーションから引き継ぐ
		 */
		protected FXBAL_BatchLogger _logger = null;
		
		/**
		 * インスタンス生成元（PoRecvIf_Upd03）でスレッド間でユニークな値を設定
		 */
		protected int _no = 0;
		
		/**
		 * PoRecvIf_Upd04の実行結果リスト
		 */
		protected MCList<PoRecvIf_Upd04_DtlR> _exeRslt = null;
				
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
		 * 発注受信ＩＦ取込処理を実行する。
		 */
		protected void exe() {
			int cnt = 0;
			
			MCList<MST_PO_RECV_IF_R> tgtL = MCList.create(MST_PO_RECV_IF_R.class);
			MST_PO_RECV_IF_R oldR = MST_PO_RECV_IF_R.create();
			
			for (PoRecvIf_Upd03_DtlR dtlR: up0()) {
				MST_PO_RECV_IF_R keyR = dtlR.poif();
				if(isNextData(oldR, keyR)) {
					if(!tgtL.isEmpty() && _loopCnt <= cnt) {
						callPoRecvUpd04(tgtL);
						cnt = 0;
						tgtL.clear();
					}
				}
				
				oldR = keyR;
				cnt++;
				tgtL.add(keyR);
			}
			
			if(!tgtL.isEmpty()) {
				callPoRecvUpd04(tgtL);
			}
		}
		
		protected void callPoRecvUpd04(MCList<MST_PO_RECV_IF_R> tgtL) {
			crtPoRecvIfWk(tgtL);
			
			MCList<MST_PO_RECV_IF_R> exeL = srchLockPoRecvIf();
			MCIndexKey idx = exeL.createIndex(MST_PO_RECV_IF_R.$data_lno);
			
			Set<List<String>> afterExtDataSet = srchAfterExtData(exeL);
			MSLAL_PoRecvIfService.PoRecvIf_Upd04 ope = MSLAL_PoRecvIfService.crtPoRecvIf_Upd04();
			PoRecvIf_Upd04_DtlR upR = null;
			
			MCList<MST_PO_RECV_IF_R> skipL = MCList.create(MST_PO_RECV_IF_R.class);
			for (MST_PO_RECV_IF_R recvIfR : tgtL) {
				MST_PO_RECV_IF_R exeR = exeL.getFirst(idx, recvIfR.data_lno());
				if (isNull(exeR)) {
					continue;
				}

				// 同一の処理グループでエラーが発生している場合、それ以降のデータは処理しない
				if (isPrevErr(exeR)) {
					setErrSts(exeR);
					MCMessagePool.add(exeR, null, MSLAL0474, exeR.data_no(), exeR.data_lno(), exeR.ext_sys_cd(), exeR.ext_po_no());
					skipL.add(exeR);
				}
				// 同一の処理グループで、新しいデータが既に処理されている場合、スキップする
				else if (isOkSkip(exeR, afterExtDataSet)) {
					setSkipSts(exeR);
					MCMessagePool.add(exeR, null, MSLAL0475, exeR.data_no(),exeR.data_lno(), exeR.ext_sys_cd(), exeR.ext_po_no());
					skipL.add(exeR);
				}
				else {
					upR = PoRecvIf_Upd04_DtlR.create();
					upR.poif(exeR);
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
			delPoRecvIfWk(tgtL);
		}
		
		/**
		 * 同一キーで新しいデータが既に処理済みかどうか。
		 * @param exeR 取込対象行
		 * @param afterExtDataSet 処理済みデータリスト
		 * @return 処理済みの場合はtrue
		 */
		protected boolean isOkSkip(MST_PO_RECV_IF_R exeR, Set<List<String>> afterExtDataSet) {
			
			return afterExtDataSet.contains(createErrSetKey(exeR));
		}

		/**
		 * 発注受信ＩＦテーブルをロックする
		 */
		protected MCList<MST_PO_RECV_IF_R> srchLockPoRecvIf() {
			MCList<MST_PO_RECV_IF_R> exeL = MCList.create(MST_PO_RECV_IF_R.class);
			MST_PO_RECV_IF_R t = MST_PO_RECV_IF_R.create("T");
			MCQueryApiBuilder exeL_bldr = MCQueryApiBuilder.create(t);
			MSW_PO_RECV_IF_KEY_R w1 = MSW_PO_RECV_IF_KEY_R.create("W1");
			PFT_SDRV_IF_R t2 = PFT_SDRV_IF_R.create("T2");
			
			exeL_bldr.addInnerJoin(w1, bracket( t.data_lno.eq(w1.data_lno)));
			exeL_bldr.addLeftOuterJoin(t2, t.data_no.eq(t2.data_no));
			
			exeL_bldr.setWhere(value(0).eq(value(0)));
			exeL_bldr.addWhereWithAnd(bracket( t2.sdrv_sts_typ.isNull()
					.or(t2.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.RECV_CONV_OK.value())))));
			exeL_bldr.addWhereWithAnd(t.imp_flg.eq(value(true)));
			exeL_bldr.addOrderByAsc(t.ext_data_no, t.ext_sys_cd, t.ext_po_no, t.data_lno);
			exeL_bldr.setLockTable(t.data_lno);
			
			dbSelectForUpdate("MSLAL9110_MST_PO_RECV_IF_S03", exeL, exeL_bldr);
			
			for (MST_PO_RECV_IF_R exeR : exeL) {
				
				// log_sub_key1にスレッド間でユニークな値を設定
				exeR.setParamIndex(_no);
			}
			
			_logger.setLogKey(exeL,
					MST_PO_RECV_IF_R.$batch_log_no,
					MST_PO_RECV_IF_R.$log_sub_key1,
					MST_PO_RECV_IF_R.$log_sub_key2);
			
			return exeL;
		}

		/**
		 * 同一キーで取込対象より新しいかつ処理済みのデータを取得する。
		 * @param exeL 取込対象リスト
		 * @return 処理済みデータリスト
		 */
		protected Set<List<String>> srchAfterExtData(MCList<MST_PO_RECV_IF_R> exeL) {
			MCList<MST_PO_RECV_IF_R> afterL = MCList.create(MST_PO_RECV_IF_R.class);
			MST_PO_RECV_IF_R t = MST_PO_RECV_IF_R.create("T");
			MCQueryApiBuilder afterL_bldr = MCQueryApiBuilder.create(t);
			MST_PO_RECV_IF_R S1ST = MST_PO_RECV_IF_R.create("ST");

			afterL_bldr.setSelect(t.ext_sys_cd, t.ext_po_no);
			afterL_bldr.addConstWhereWithAnd(exists(subQuery().select(value("X")).from(S1ST)
					.where(t.ext_data_no.lt(S1ST.ext_data_no)
							.and(t.ext_sys_cd.eq(S1ST.ext_sys_cd))
							.and(t.ext_po_no.eq(S1ST.ext_po_no))
							.and(S1ST.exe_sts_typ.in(value(MAC_EXE_STS_TYP.OK.value()),
									value(MAC_EXE_STS_TYP.SKP.value()))))));

			dbSelectColumn("MSLAL9110_MST_PO_RECV_IF_S04", afterL, afterL_bldr, exeL, MST_PO_RECV_IF_R.$data_lno);

			Set<List<String>> set = new HashSet<List<String>>();
			for (MST_PO_RECV_IF_R afterR : afterL) {

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
		 * @param downL PoRecvIf_Upd04の下り電文
		 */
		protected void mergeExeRslt(MCList<MST_PO_RECV_IF_R> skipL, MCList<PoRecvIf_Upd04_DtlR> downL) {
			
			_exeRslt = MCList.create(PoRecvIf_Upd04_DtlR.class);
			_exeRslt.setAll(downL);
			
			PoRecvIf_Upd04_DtlR dtlR = null;
			
			for (MST_PO_RECV_IF_R skipR : skipL) {
				
				dtlR = PoRecvIf_Upd04_DtlR.create();
				dtlR.data_lno(skipR.data_lno());
				dtlR.exe_sts_typ(skipR.exe_sts_typ());
				_exeRslt.add(dtlR);
			}
		}
		
		/**
		 * 発注受信ＩＦ取込の後処理。
		 * @param exeL 取込対象リスト
		 */
		protected void afterCall(MCList<MST_PO_RECV_IF_R> exeL) {
			
			rsltCnt(exeL);
			
			updIf(exeL);
			
			MCMessageList msgList = MCMessagePool.getMessageList();
			_logger.writeDataLog(msgList);
			
			dbTran().commit();
			
			msgList.clear();
		}
		
		/**
		 * 	発注受信ＩＦを更新する。
		 * @param exeL 取込対象リスト
		 */
		protected void updIf(MCList<MST_PO_RECV_IF_R> exeL) {
			MST_PO_RECV_IF_R t = MST_PO_RECV_IF_R.create("T");
			MCQueryApiBuilder exeL_bldr = MCQueryApiBuilder.create(t);
			exeL_bldr.setSet(t.imp_flg, t.exe_sts_typ, t.batch_log_no,
					t.log_sub_key1, t.log_sub_key2);

			dbUpdateKey("MSLAL9110_MST_PO_RECV_IF_U01", exeL, exeL_bldr);
		}

		/**
		 * 取込結果の件数を算出する。
		 * @param exeL 取込対象リスト
		 */
		protected void rsltCnt(MCList<MST_PO_RECV_IF_R> exeL) {
			
			MCIndexKey idxkey = _exeRslt.createIndex(PoRecvIf_Upd03_DtlR.$data_lno);
			
			for (MST_PO_RECV_IF_R exeR : exeL) {
				
				PoRecvIf_Upd04_DtlR exeRslt = _exeRslt.getFirst(idxkey, exeR.data_lno());
				if (isNull(exeRslt)) {
					// 「エラー行まで登録」によって後続データが対象外になる場合が該当する
					continue;
				}
				else if (MAC_EXE_STS_TYP.isOK(exeRslt.exe_sts_typ())) {
					
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
		protected void setSkipSts(MST_PO_RECV_IF_R exeR) {

			exeR.exe_sts_typ(MAC_EXE_STS_TYP.SKP.value());
		}
		
		/**
		 * 引数で渡された比較対象が同一取込単位かどうか。
		 * @param preR 前の取込対象
		 * @param exeR　取込対象
		 * @return 取込単位のいずれかが異なる場合はtrue
		 */
		protected boolean isNextData(MST_PO_RECV_IF_R preR, MST_PO_RECV_IF_R exeR) {
			return !(isSame(preR.ext_data_no(), exeR.ext_data_no())
					&& isSame(preR.ext_sys_cd(), exeR.ext_sys_cd())
					&& isSame(preR.ext_po_no(), exeR.ext_po_no()));
		}
		
		/**
		 * 同一取込単位で先に処理したデータでエラーが発生したかどうか。
		 * @param poRecvIfR 発注受信ＩＦ
		 * @return エラーが発生した場合はtrue
		 */
		protected boolean isPrevErr(MST_PO_RECV_IF_R poRecvIfR) {
			return object(CLAZZ)._errSet.contains(createErrSetKey(poRecvIfR));
		}
		
		/**
		発注受信ＩＦワークテーブルのデータを登録する。
		 * @param poRecvIfRL 発注受信ＩＦリスト
		 */
		protected void crtPoRecvIfWk(MCList<MST_PO_RECV_IF_R> poRecvIfRL) {
			MCQueryApiBuilder poRecvIfRL_bldr = MCQueryApiBuilder.create(MST_PO_RECV_IF_R.create("T"));
			dbWkDelete("MSLAL9110_MSW_PO_RECV_IF_D01", poRecvIfRL_bldr.getBaseDbc());
			dbWkInsert("MSLAL9110_MSW_PO_RECV_IF_I01", poRecvIfRL, poRecvIfRL_bldr.getBaseDbc());
		}
		
		/**
		発注受信ＩＦワークテーブルのデータを削除する。
		 * @param poRecvIfRL 発注受信ＩＦリスト
		 */
		protected void delPoRecvIfWk(MCList<MST_PO_RECV_IF_R> poRecvIfRL) {
			MCQueryApiBuilder poRecvIfRL_bldr = MCQueryApiBuilder.create(MST_PO_RECV_IF_R.create("T"));
			dbWkDelete("MSLAL9110_MSW_PO_RECV_IF_D02", poRecvIfRL_bldr.getBaseDbc());
		}
		
		protected void setDown() {
			down0().total_num(_totalNum);
			down0().ok_num(_okNum);
			down0().err_num(_errNum);
			down0().skip_num(_skipNum);
		}
	}
	
	/**
	 * PoRecvIf_Upd04オペレーション.<p>
	 *
	 * 発注受信ＩＦ取込を行う。(発注受信ＩＦサービスを呼び出す本処理）<br>
	 */
	public class PoRecvIf_Upd04 extends MSLAL_PoRecvIfService_MC_A.PoRecvIf_Upd04 {
		
		/**
		 * 発注受信ＩＦ取込チェック
		 */
		protected MSLAL_PoRecvIfService.PoRecvIf_Chk01 _poRecvIfChk;
		
		/**
		 * 発注登録サービスの登録チェック
		 */
		protected MSBDL_PoRegService.Po_Chk01 _chk01Serv;
		
		/**
		 * 発注ヘッダ削除リスト
		 */
		MCList<Po_Ins01_HdrR> _delHdrL = null;
		
		/**
		 * 発注明細削除リスト
		 */
		MCList<Po_Ins01_DtlR> _delDtlL = null;
		
		
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
			up0().setString(PoRecvIf_Upd04_DtlR.$exe_sts_typ, MAC_EXE_STS_TYP.NOT_EXE.value());
			up0().sort(getGrpKey());
		}
		
		protected void proc() {
			
			MCSavepoint sp = null;
			MCList<PoRecvIf_Upd04_DtlR>[] grpL = getGrp();
			
			MCMessageList msgList = new MCMessageList();
			msgList.addAll(MCMessagePool.getMessageList());
			
			for (MCList<PoRecvIf_Upd04_DtlR> poRecvIfL : grpL) {
				MCMessagePool.clear();
				
				if (isPrevErr(poRecvIfL)) {
					msgList.addAll(MCMessagePool.getMessageList());
					continue;
				}
				
				callThisChk01(poRecvIfL);
				msgList.addAll(MCMessagePool.getMessageList());
				
				poRecvIfL = poRecvIfL.subList(r -> !isErr(r.poif()));
				if (poRecvIfL.isEmpty()) {
					// 処理継続行がない場合
					continue;
				}
				
				MCMessagePool.clear();
				try {
					sp = setSavepoint();
					callPoRegService(poRecvIfL);
				}
				catch (Exception ex) {
					handleEx(ex, sp, poRecvIfL);
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
		 * 発注受信ＩＦ取込チェックを実行する。
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void callThisChk01(MCList<PoRecvIf_Upd04_DtlR> poRecvIfL) {
			
			_poRecvIfChk = MSLAL_PoRecvIfService.crtPoRecvIf_Chk01();

			setAll(_poRecvIfChk.up0(), poRecvIfL, createMap_PoRecvIf_Chk01_CndR_PoRecvIf_Upd04_DtlR());
			_poRecvIfChk.exec();
			
			MCIndexKey idxkey = _poRecvIfChk.down0().createIndex(PoRecvIf_Chk01_CndR.$data_lno);
			
			for (PoRecvIf_Upd04_DtlR dtlR : poRecvIfL) {
				PoRecvIf_Chk01_CndR chkRsltR = _poRecvIfChk.down0().getFirst(idxkey, dtlR.data_lno());
				
				if (chkRsltR.err_flg()) {
					setErrSts(dtlR.poif());
				}
			}
			for (MCList<PoRecvIf_Upd04_DtlR> l : poRecvIfL.groupList(getGrpKey())) {
				chkGrpErr(l);
			}
		}
		
		/**
		 * 発注登録サービスを実行する。
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void callPoRegService(MCList<PoRecvIf_Upd04_DtlR> poRecvIfL) {
			callPoServiceChk01(poRecvIfL);
			
			callPoServiceDel01(poRecvIfL);
			
			callPoServiceIns01(poRecvIfL);
				
			callPoServiceUpd01(poRecvIfL);
			
			setOk(poRecvIfL);
		}
		
		/**
		 * 発注登録サービスの登録チェックを実行する。
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void callPoServiceChk01(MCList<PoRecvIf_Upd04_DtlR> poRecvIfL) {

			_chk01Serv = MSBDL_PoRegService.crtPo_Chk01();
			
			if (_poRecvIfChk.down1().isEmpty()) {
				return;
			}
			
			_chk01Serv.up0().setAll(_poRecvIfChk.down1());
			_chk01Serv.up1().setAll(_poRecvIfChk.down2());
			_chk01Serv.up2().setAll(_poRecvIfChk.down3());
			_chk01Serv.exec();
			
			setPoServiceChk01Err(poRecvIfL);
		}
		
		/**
		 * 発注登録サービスの登録チェック結果を発注受信ＩＦに反映する。
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void setPoServiceChk01Err(MCList<PoRecvIf_Upd04_DtlR> poRecvIfL) {
			for (PoRecvIf_Upd04_DtlR dtlR : poRecvIfL) {
				MCList<Po_Ins01_HdrR> errHdrL = _chk01Serv.down0().subList(r -> r.getParamRowIndex() == dtlR.getParamRowIndex() && r.err_flg());
				if (!errHdrL.isEmpty()) {
					setErrSts(dtlR.poif());
				}
				
				MCList<Po_Ins01_DtlR> errDtlL = _chk01Serv.down1().subList(r -> r.getParamRowIndex() == dtlR.getParamRowIndex() && r.err_flg());
				if (!errDtlL.isEmpty()) {
					setErrSts(dtlR.poif());
				}
			}
			
			for (MCList<PoRecvIf_Upd04_DtlR> l : poRecvIfL.groupList(getGrpKey())) {
				chkGrpErr(l);
			}
		}
		
		/**
		 * 発注登録サービス　発注削除を実行する。
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void callPoServiceDel01(MCList<PoRecvIf_Upd04_DtlR> poRecvIfL) {
			if (isErr(poRecvIfL.get(0).poif())
					|| isNull(poRecvIfL.subList(r -> !MAC_EXE_STS_TYP.isERR(r.exe_sts_typ())))
					|| _chk01Serv.down0().isEmpty()) {
				return;
			}

			MSBDL_PoRegService.Po_Del01 del01Service = MSBDL_PoRegService.crtPo_Del01();
			MCIndexKey idxkey = _chk01Serv.down1().createIndex(Po_Ins01_DtlR.$hdr_peg_no);
			
			// 下り電文には存在しないため、上り電文から取得する
			MCIndexKey idxkey2 = _chk01Serv.up2().createIndex(Po_Ins01_Bndl_DtlR.$dtl_peg_no);

			for (Po_Ins01_HdrR hdrR : _chk01Serv.down0()) {
				if (hdrR.err_flg()) {
					continue;
				}
				
				if (MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
					MCList<Po_Ins01_DtlR> poDtlL = _chk01Serv.down1().subList(idxkey, hdrR.peg_no());
					if (!isNull(poDtlL.getFirst(Po_Ins01_DtlR.$err_flg, true))) {
						continue;
					}
					
					del01Service.up0().add(hdrR);
					del01Service.up1().setAll(_chk01Serv.down1().subList(idxkey, hdrR.peg_no()));
					
					for (Po_Ins01_DtlR dtlR : poDtlL) {
						Po_Ins01_Bndl_DtlR dtl2R = _chk01Serv.up2().getFirst(idxkey2, dtlR.peg_no());
						if (!isNull(dtl2R)) {
							del01Service.up2().add(dtl2R);
						}
					}
				}
			}
			
			if (!del01Service.up0().isEmpty()) {
				del01Service.exec();
			}
		}
		
		/**
		 * 発注登録サービス 発注の登録を実行する。
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void callPoServiceIns01(MCList<PoRecvIf_Upd04_DtlR> poRecvIfL) {
			if (isNull(poRecvIfL.subList(r -> !MAC_EXE_STS_TYP.isERR(r.exe_sts_typ())))
					|| _chk01Serv.down0().isEmpty()) {
				return;
			}
			
			MSBDL_PoRegService.Po_Ins01 ins01Serv = MSBDL_PoRegService.crtPo_Ins01();
			MCIndexKey idxkey = _chk01Serv.down1().createIndex(Po_Ins01_DtlR.$hdr_peg_no);
			
			// 下り電文には存在しないため、上り電文から取得する
			MCIndexKey idxkey2 = _chk01Serv.up2().createIndex(Po_Ins01_Bndl_DtlR.$dtl_peg_no);
			
			for (Po_Ins01_HdrR hdrR : _chk01Serv.down0()) {
				if (hdrR.err_flg()) {
					continue;
				}
				
				if (MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ())) {
					MCList<Po_Ins01_DtlR> poDtlL = _chk01Serv.down1().subList(idxkey, hdrR.peg_no());
					if (!isNull(poDtlL.getFirst(Po_Ins01_DtlR.$err_flg, true))) {
						continue;
					}
					
					ins01Serv.up0().add(hdrR);
					ins01Serv.up1().addAll(poDtlL);
					
					for (Po_Ins01_DtlR dtlR : poDtlL) {
						Po_Ins01_Bndl_DtlR dtl2R = _chk01Serv.up2().getFirst(idxkey2, dtlR.peg_no());
						if (!isNull(dtl2R)) {
							ins01Serv.up2().add(dtl2R);
						}
					}
				}
			}
			
			if (!ins01Serv.up0().isEmpty()) {
				ins01Serv.exec();
			}
		}
		
		/**
		 * 発注登録サービス　発注の訂正を実行する。
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void callPoServiceUpd01(MCList<PoRecvIf_Upd04_DtlR> poRecvIfL) {
			if (isErr(poRecvIfL.get(0).poif()) || _chk01Serv.down0().isEmpty()) {
				return;
			}
			
			MSBDL_PoRegService.Po_Upd01 upd01Serv = MSBDL_PoRegService.crtPo_Upd01();
			MCIndexKey idxkey = _chk01Serv.down1().createIndex(Po_Ins01_DtlR.$hdr_peg_no);
			
			// 下り電文には存在しないため、上り電文から取得する
			MCIndexKey idxkey2 = _chk01Serv.up2().createIndex(Po_Ins01_Bndl_DtlR.$dtl_peg_no);
			
			for (Po_Ins01_HdrR hdrR : _chk01Serv.down0()) {
				if (hdrR.err_flg()) {
					continue;
				}
				
				if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())) {
					MCList<Po_Ins01_DtlR> poDtlL = _chk01Serv.down1().subList(idxkey, hdrR.peg_no());
					if (!isNull(poDtlL.getFirst(Po_Ins01_DtlR.$err_flg, true))) {
						continue;
					}
					
					upd01Serv.up0().add(hdrR);
					upd01Serv.up1().addAll(poDtlL);
					
					for (Po_Ins01_DtlR dtlR : poDtlL) {
						Po_Ins01_Bndl_DtlR dtl2R = _chk01Serv.up2().getFirst(idxkey2, dtlR.peg_no());
						if (!isNull(dtl2R)) {
							upd01Serv.up2().add(dtl2R);
						}
					}
				}
			}
			
			if (!upd01Serv.up0().isEmpty()) {
				MAUCL_RevDataService.RevData_Upd02 revServ = MAUCL_RevDataService.crtRevData_Upd02();
				revServ.exec();
				upd01Serv.exec();
			}
		}
		
		/**
		 * 取込単位で発注受信ＩＦ情報をグループ化する。
		 * @return 取込単位のグループ
		 */
		@SuppressWarnings("unchecked")
		protected MCList<PoRecvIf_Upd04_DtlR>[] getGrp() {
			List<MCList<PoRecvIf_Upd04_DtlR>> arr = new ArrayList<>();
			PoRecvIf_Upd04_DtlR bkR = null;
			MCList<PoRecvIf_Upd04_DtlR> lst = null;

			for (PoRecvIf_Upd04_DtlR r : up0()) {
				if (isNull(bkR) || !r.equalColumns(bkR, getGrpKey())) {
					lst = MCList.create(PoRecvIf_Upd04_DtlR.class);
					arr.add(lst);
				}
				lst.add(r);
				bkR = r;
			}
			
			return arr.toArray(new MCList[arr.size()]);
			
		}
		
		/**
		 * 更新処理例外発生時の後処理を行う。
		 * @param ex 例外
		 * @param sp セーブポイント
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void handleEx(Exception ex, MCSavepoint sp, MCList<PoRecvIf_Upd04_DtlR> poRecvIfL) {

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

			for (PoRecvIf_Upd04_DtlR opeRow : poRecvIfL) {
				
				MCMessagePool.add(opeRow, null, MSLAL0472, opeRow.data_no(), opeRow.data_lno(), msgId, msg);
				for (MCMessage causeMsg : causeMsgList) {
					MCMessage newMsg = new MCMessage(opeRow, null, causeMsg.getID(), (Object[])causeMsg.getBindArray());
					MCMessagePool.add(newMsg);
				}
				
				setErr(opeRow.poif());
			}
			
			if (sp != null) {
				
				dbTran().rollback(sp);
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
		 * 同一取込単位のうち、エラーが存在するかどうかチェックする。<br>
		 * 一部でもエラーがあったら全てエラーとする。
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void chkGrpErr(MCList<PoRecvIf_Upd04_DtlR> poRecvIfL) {

			PoRecvIf_Upd04_DtlR errR = poRecvIfL.getFirst(PoRecvIf_Upd04_DtlR.$exe_sts_typ, MAC_EXE_STS_TYP.ERR.value());
			if (errR != null) {
				for (PoRecvIf_Upd04_DtlR poRecvIfR : poRecvIfL) {
					if (!isErr(poRecvIfR.poif())) {
						MCMessagePool.add(poRecvIfR, null, MSLAL0479, poRecvIfR.data_no(), poRecvIfR.data_lno(), poRecvIfR.ext_sys_cd(), poRecvIfR.ext_po_no());
						setErr(poRecvIfR.poif());
					}
				}
			}
		}
		
		/**
		 * 同一取込単位で先に処理したデータでエラーが発生したかどうか。
		 * @param checkL 発注受信ＩＦリスト
		 * @return エラーが発生した場合はtrue
		 */
		protected boolean isPrevErr(MCList<PoRecvIf_Upd04_DtlR> checkL) {
			if (checkL.isEmpty()) {
				return false;
			}

			boolean hasErr = false;
			for (MCList<PoRecvIf_Upd04_DtlR> subL : checkL.groupList(getGrpKey())) {
				if (object(CLAZZ)._errSet.contains(createErrSetKey(subL.get(0).poif()))) {
					hasErr = true;
					for (PoRecvIf_Upd04_DtlR r : subL) {
						setErrSts(r.poif());
						MCMessagePool.add(r, null, MSLAL0474, r.data_no(), r.data_lno(), r.ext_sys_cd(), r.ext_po_no());
					}
				}
			}
			return hasErr;
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			
			down0().setAll(up0());
		}

		/**
		 * 処理結果区分に処理済を設定する。
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void setOk(MCList<PoRecvIf_Upd04_DtlR> poRecvIfL) {
			
			for (PoRecvIf_Upd04_DtlR poRecvIfR : poRecvIfL) {
				
				if (!isErr(poRecvIfR.poif())) {
					poRecvIfR.exe_sts_typ(MAC_EXE_STS_TYP.OK.value());
				}
			}
		}
		
		/**
		 * 処理結果区分にエラーを設定する。
		 * @param poRecvIfR 発注受信ＩＦ
		 */
		protected void setErr(MST_PO_RECV_IF_R poRecvIfR) {
			setErrSts(poRecvIfR);
		}
		
		/**
		 * 発注受信ＩＦの処理結果区分がエラーかどうか。
		 * @param poRecvIfR 発注受信ＩＦ
		 * @return 処理結果区分がエラーの場合はtrue
		 */
		protected boolean isErr(MST_PO_RECV_IF_R poRecvIfR) {
			
			return MAC_EXE_STS_TYP.isERR(poRecvIfR.exe_sts_typ());
		}
		
		/**
		 * 取込単位となるキーを返す
		 * @return 同一取込グループのキー
		 */
		protected String[] getGrpKey() {
			
			return new String[] { 
					PoRecvIf_Upd04_DtlR.$ext_data_no,
					PoRecvIf_Upd04_DtlR.$ext_sys_cd,
					PoRecvIf_Upd04_DtlR.$ext_po_no};
		}

		protected Map_PoRecvIf_Chk01_CndR_PoRecvIf_Upd04_DtlR<PoRecvIf_Chk01_CndR, PoRecvIf_Upd04_DtlR> createMap_PoRecvIf_Chk01_CndR_PoRecvIf_Upd04_DtlR() {
			return new Map_PoRecvIf_Chk01_CndR_PoRecvIf_Upd04_DtlR<PoRecvIf_Chk01_CndR, PoRecvIf_Upd04_DtlR>();
		}

		public class Map_PoRecvIf_Chk01_CndR_PoRecvIf_Upd04_DtlR<D extends PoRecvIf_Chk01_CndR, S extends PoRecvIf_Upd04_DtlR>
				extends MCRowMapper<D, S> {
			@Override
			public void valueCopy(D dest, S src) {
				
				dest.poif(src.poif());
				dest.setParamIndex(src.poif().getParamIndex());
				dest.setParamRowIndex(src.poif().getParamRowIndex());
			}
		}
		
	}
	
	/**
	 * PoRecvIf_Chk01オペレーション.<p>
	 *
	 * 発注受信ＩＦ取込を行う前のチェック処理<br>
	 */
	public class PoRecvIf_Chk01 extends MSLAL_PoRecvIfService_MC_A.PoRecvIf_Chk01 {

		/**
		 * 発注ヘッダのインデックス
		 */
		protected MCIndexKey _idxPoKey = null;

		/**
		 * 発注ヘッダのキャッシュ
		 */
		protected MCList<MST_PO_R> _cachePo = null;

		/**
		 * 発注明細のキャッシュ
		 */
		protected MCList<MST_PO_D_R> _cachePoD = null;

		/**
		 * 取引先品目マスタのキャッシュ
		 */
		protected FXUCL_MCDbcCacheStEnd<MAM_BP_ITM_R> _cacheBpItm = null;

		/**
		 * 取引先禁止マスタのキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_BP_STOP_R> _cacheBpStop = null;

		/**
		 * ＥＤＩＩＦ制御マスタのキャッシュ
		 */
		protected FXUCL_MCDbcCacheStEnd<MAM_EDI_IF_CTL_R> _cacheEdiIfCtl = null;

		/**
		 * 品目マスタのキャッシュ 
		 */
		protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItm = null;

		/** 
		 * 品目詳細マスタのキャッシュ
		 */
		protected MCList<MAM_ITM_DTL_R> _cacheItmDtl = MCList.create(MAM_ITM_DTL_R.class);

		/** 
		 * 品目マスタ（ロケール） のキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_ITM_LCL_R> _cacheItmLcl = null;

		/**
		 * 品目禁止マスタのキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_ITM_STOP_R> _cacheItmStop = null;

		/**
		 * 品目単位マスタのキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _cacheItmUnit = null;

		/**
		 * 版マスタのキャッシュ
		 * */
		protected MCList<MAM_ITM_VER_R> _cacheItmVer = MCList.create(MAM_ITM_VER_R.class);

		/**
		 * 税マスタのキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_TAX_R> _cacheTax = null;

		/**
		 * 案件のキャッシュ
		 */
		protected MCList<MST_WRK_R> _cacheWrk = MCList.create(MST_WRK_R.class);

		/**
		 * 案件手配紐付情報のキャッシュ
		 */
		protected MCList<MST_WRK_SNO_R> _cacheWrkSno = MCList.create(MST_WRK_SNO_R.class);

		/**
		 * 取引先マスタ（発注先）のキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_BP_R> _cacheBp = null;

		/**
		 * 源泉税率のキャッシュ
		 */
		protected FXUCL_MCFuncCache<MCNumber> _cacheWtaxRate = null;

		/**
		 * 部門マスタのキャッシュ
		 */
		protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _cacheDpt = null;

		//----------------------------------
		// IndexKey
		//----------------------------------
		/**
		 * 発注明細のインデックス
		 */
		protected MCIndexKey _idxPoDKey = null;

		/**
		 * 発注受信ＩＦのインデックス
		 */
		protected MCIndexKey _idxPoRecvIfKey = null;

		/**
		 * 発注ヘッダ(外部発注ＮＯ)のインデックス
		 */
		protected MCIndexKey _idxExtPoNoKey = null;

		/**
		 * 発注明細(外部発注明細ＮＯ)のインデックス
		 */
		protected MCIndexKey _idxExtPoDNoKey = null;

		/**
		 * 発注明細(外部発注ＮＯ)のインデックス
		 */
		protected MCIndexKey _idxExtPoNoforDkey = null;

		/** 品目詳細のインデックス（品目CD・枝番・WGCD・製造場所・構成パタン） */
		MCIndexKey _idxItmDtl = null;
		
		/** 品目詳細のインデックス（品目CD・枝番・WGCD・発注先・メーカ・製造場所・構成パタン・基準日） */
		MCIndexKey _idxItmDtlKey = null;
		
		/**　版のインデックス */
		MCIndexKey _idxItmVer = null;
		
		/** 案件のインデックス */
		MCIndexKey _idxWrk = null;

		/** 案件手配紐付情報 のインデックス*/
		MCIndexKey _idxWrkSno = null;
		
		/**
		 * 補完およびチェック処理で使用するキャッシュ情報を作成する。
		 */
		protected void createCache() {
			createCacheItmStop();
			
			createCacheBpStop();
			
			createCacheItm();
			
			createCacheItmDtl();
			
			createCacheBpItm();
			
			createCacheItmVer();
			
			createCacheWrkSno();
			
			createCacheWrk();
			
			createCacheItmLcl();
			
			createCacheEdiIfCtl();
			
			createCacheBp();
			
			createCacheDpt();
		}

		/**
		 * キャッシュ作成（発注ヘッダ）
		 */
		protected void createCachePo() {
			_cachePo = MCList.create(MST_PO_R.class);
			MST_PO_R t = MST_PO_R.create("T");
			MCQueryApiBuilder cachePo_bldr = MCQueryApiBuilder.create(t);
			cachePo_bldr.setWhere(t.ext_sys_cd.eq(bind("ext_sys_cd")));
			cachePo_bldr.addWhereWithAnd(t.ext_po_no.eq(bind("ext_po_no")));
			cachePo_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			cachePo_bldr.setOrderByAsc(t.po_no);
			dbSelectForUpdate("MSLAL9110_MST_PO_S01",
					_cachePo, cachePo_bldr, up0().groupBy(MST_PO_R.$ext_sys_cd, MST_PO_R.$ext_po_no));
			
			_idxPoKey = _cachePo.createIndex(MST_PO_R.$po_no);
			_idxExtPoNoKey = _cachePo.createIndex(MST_PO_R.$ext_sys_cd, MST_PO_R.$ext_po_no);
		}

		/**
		 * キャッシュ作成（発注明細）
		 */
		protected void createCachePoD() {
			_cachePoD = MCList.create(MST_PO_D_R.class);
			MST_PO_D_R t1 = MST_PO_D_R.create("T");
			MCQueryApiBuilder cachePoD_bldr = MCQueryApiBuilder.create(t1);
			MST_PO_R t2 = MST_PO_R.create("T2");
			MST_ARR_PR_R t3 = MST_ARR_PR_R.create("T3");
			
			_cachePoD.addStringColumn(MST_PO_R.$ext_sys_cd);
			_cachePoD.addStringColumn(MST_PO_R.$ext_po_no);
			_cachePoD.addNumberColumn(MST_ARR_PR_R.$arr_qty);
			_cachePoD.addNumberColumn(MST_ARR_PR_R.$purc_qty);
			_cachePoD.addNumberColumn(MST_ARR_PR_R.$arr_schd_abort_qty);
			_cachePoD.addNumberColumn(MST_ARR_PR_R.$purc_schd_abort_qty);
			_cachePoD.addNumberColumn(MST_ARR_PR_R.$accpt_dfct_qty);
			_cachePoD.addNumberColumn(MST_ARR_PR_R.$rcpt_iv_qty);
			cachePoD_bldr.addSelect(t2.ext_sys_cd);
			cachePoD_bldr.addSelect(t2.ext_po_no);
			cachePoD_bldr.addSelect(t3.arr_qty);
			cachePoD_bldr.addSelect(t3.purc_qty);
			cachePoD_bldr.addSelect(t3.arr_schd_abort_qty);
			cachePoD_bldr.addSelect(t3.purc_schd_abort_qty);
			cachePoD_bldr.addSelect(t3.accpt_dfct_qty);
			cachePoD_bldr.addSelect(t3.rcpt_iv_qty);
			cachePoD_bldr.addInnerJoin(t2, t1.po_no.eq(t2.po_no));
			cachePoD_bldr.addInnerJoin(t3, t1.po_d_no.eq(t3.po_d_no));
			cachePoD_bldr.setWhere(t2.ext_sys_cd.eq(bind("ext_sys_cd")));
			cachePoD_bldr.addWhereWithAnd(t2.ext_po_no.eq(bind("ext_po_no")));
			cachePoD_bldr.addWhereWithAnd(t1.can_flg.eq(value(false)));
			dbSelectForUpdate("MSLAL9110_MST_PO_D_S01",
					_cachePoD, cachePoD_bldr, up0().groupBy(MST_PO_R.$ext_sys_cd, MST_PO_R.$ext_po_no));
			
			_idxPoDKey = _cachePoD.createIndex(MST_PO_D_R.$po_d_no);
			_idxExtPoDNoKey = _cachePoD.createIndex(MST_PO_R.$ext_sys_cd, MST_PO_D_R.$ext_po_d_no);
			_idxExtPoNoforDkey = _cachePoD.createIndex(MST_PO_R.$ext_sys_cd, MST_PO_R.$ext_po_no);
		}

		/**
		 * キャッシュ作成（取引先品目マスタ）
		 */
		protected void createCacheBpItm() {
			_cacheBpItm = new FXUCL_MCDbcCacheStEnd<MAM_BP_ITM_R>(
					MCQueryApiBuilder.create(MAM_BP_ITM_R.create("T")), up0(),
					PoRecvIf_Chk01_CndR.$sppl_cd, PoRecvIf_Chk01_CndR.$itm_cd,
					PoRecvIf_Chk01_CndR.$itm_sub1, PoRecvIf_Chk01_CndR.$itm_sub2,
					PoRecvIf_Chk01_CndR.$itm_sub3);
		}

		/**
		 * キャッシュ作成（取引先禁止マスタ）
		 */
		protected void createCacheBpStop() {
			// 取引先禁止マスタ取得
			_cacheBpStop = new FXUCL_MCDbcCache<MAM_BP_STOP_R>(
					MCQueryApiBuilder.create(MAM_BP_STOP_R.create("T")),
					up0().groupBy(PoRecvIf_Chk01_CndR.$sppl_cd), PoRecvIf_Chk01_CndR.$sppl_cd);
		}

		/**
		 * キャッシュ（ＥＤＩＩＦ制御マスタ）
		 */
		protected void createCacheEdiIfCtl() {
			_cacheEdiIfCtl = new FXUCL_MCDbcCacheStEnd<MAM_EDI_IF_CTL_R>(
					MCQueryApiBuilder.create(MAM_EDI_IF_CTL_R.create("T")),
					up0(), PoRecvIf_Chk01_CndR.$sppl_cd, "if_proc_typ");
		}

		/**
		 * キャッシュ作成（品目マスタ）
		 */
		protected void createCacheItm() {
			_cacheItm = new FXUCL_MCDbcCache<MAM_ITM_R>(
					MCQueryApiBuilder.create(MAM_ITM_R.create("T")),
					up0(), PoRecvIf_Chk01_CndR.$itm_cd, PoRecvIf_Chk01_CndR.$itm_sub1,
					PoRecvIf_Chk01_CndR.$itm_sub2, PoRecvIf_Chk01_CndR.$itm_sub3);
		}

		/**
		 * キャッシュ作成（品目詳細マスタ）
		 */
		protected void createCacheItmDtl() {
			_cacheItmDtl = MCList.create(MAM_ITM_DTL_R.class);
			MAM_ITM_DTL_R t = MAM_ITM_DTL_R.create("T");
			MCQueryApiBuilder cacheItmDtl_bldr = MCQueryApiBuilder.create(t);
			MAM_LOC_R m1 = MAM_LOC_R.create("M1");

			_cacheItmDtl.addStringColumn("mfg_loc_sppl_cd");
			_cacheItmDtl.addStringColumn("mfg_loc_maker_cd");

			cacheItmDtl_bldr.addSelect(m1.sppl_cd.as("mfg_loc_sppl_cd"));
			cacheItmDtl_bldr.addSelect(m1.maker_cd.as("mfg_loc_maker_cd"));
			cacheItmDtl_bldr.addSelect(m1.loc_nm.as("mfg_loc_nm"));
			cacheItmDtl_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			cacheItmDtl_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			cacheItmDtl_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			cacheItmDtl_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			cacheItmDtl_bldr.addWhereWithAnd(t.wg_cd.eq(bind("in_to_loc_wg_cd")));
			cacheItmDtl_bldr.addWhereWithAnd(t.rqst_loc_cd.eq(value(MAC_STR.NULL_VAL.value())));
			cacheItmDtl_bldr.addLeftOuterJoin(m1, bracket(t.mfg_loc_cd.eq(m1.loc_cd)));
			dbSelect("MSLAL9110_MAM_ITM_DTL_S01",
					_cacheItmDtl, cacheItmDtl_bldr,
					up0().groupBy(PoRecvIf_Chk01_CndR.$itm_cd,
							PoRecvIf_Chk01_CndR.$itm_sub1, PoRecvIf_Chk01_CndR.$itm_sub2,
							PoRecvIf_Chk01_CndR.$itm_sub3,
							PoRecvIf_Chk01_CndR.$in_to_loc_wg_cd));
			_idxItmDtl = _cacheItmDtl.createIndex(MAM_ITM_DTL_R.$itm_cd,
					MAM_ITM_DTL_R.$itm_sub1, MAM_ITM_DTL_R.$itm_sub2,
					MAM_ITM_DTL_R.$itm_sub3, MAM_ITM_DTL_R.$wg_cd);
			_idxItmDtlKey = _cacheItmDtl.createIndex(MAM_ITM_DTL_R.$itm_cd,
					MAM_ITM_DTL_R.$itm_sub1, MAM_ITM_DTL_R.$itm_sub2,
					MAM_ITM_DTL_R.$itm_sub3, MAM_ITM_DTL_R.$wg_cd, MAM_ITM_DTL_R.$sppl_cd,
					MAM_ITM_DTL_R.$maker_cd, MAM_ITM_DTL_R.$mfg_loc_cd,
					MAM_ITM_DTL_R.$bom_ptn);
		}

		/**
		 * キャッシュを作成（品目マスタ（ロケール別情報））
		 */
		protected void createCacheItmLcl() {
			_cacheItmLcl = new FXUCL_MCDbcCache<MAM_ITM_LCL_R>(
					MCQueryApiBuilder.create(MAM_ITM_LCL_R.create("T")),
					getNotErrL(), PoRecvIf_Chk01_CndR.$itm_cd,
					PoRecvIf_Chk01_CndR.$itm_sub1, PoRecvIf_Chk01_CndR.$itm_sub2,
					PoRecvIf_Chk01_CndR.$itm_sub3, PoRecvIf_Chk01_CndR.$prnt_lcl_cd);
		}

		/**
		 * キャッシュ作成（品目禁止マスタ）
		 */
		protected void createCacheItmStop() {
			_cacheItmStop = new FXUCL_MCDbcCache<MAM_ITM_STOP_R>(
					MCQueryApiBuilder.create(MAM_ITM_STOP_R.create("T")),
					up0().groupBy(PoRecvIf_Chk01_CndR.$itm_cd,
							PoRecvIf_Chk01_CndR.$itm_sub1, PoRecvIf_Chk01_CndR.$itm_sub2,
							PoRecvIf_Chk01_CndR.$itm_sub3),
					PoRecvIf_Chk01_CndR.$itm_cd, PoRecvIf_Chk01_CndR.$itm_sub1,
					PoRecvIf_Chk01_CndR.$itm_sub2, PoRecvIf_Chk01_CndR.$itm_sub3);
		}

		/**
		 * キャッシュ作成（品目単位マスタ）
		 */
		protected void createCacheItmUnit() {
			_cacheItmUnit = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(
					MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T")),
					up0(), PoRecvIf_Chk01_CndR.$itm_cd,
					PoRecvIf_Chk01_CndR.$itm_sub1, PoRecvIf_Chk01_CndR.$itm_sub2,
					PoRecvIf_Chk01_CndR.$itm_sub3, PoRecvIf_Chk01_CndR.$trd_unit_cd);
		}

		/**
		 * キャッシュ作成（版マスタ）
		 */
		protected void createCacheItmVer() {
			_cacheItmVer = MCList.create(MAM_ITM_VER_R.class);
			MAM_ITM_VER_R t = MAM_ITM_VER_R.create("T");
			MCQueryApiBuilder cacheItmVer_bldr = MCQueryApiBuilder.create(t);
			MCList<PoRecvIf_Chk01_CndR> bindL = up0().groupBy(PoRecvIf_Chk01_CndR.$itm_cd, PoRecvIf_Chk01_CndR.$itm_sub1,
					PoRecvIf_Chk01_CndR.$itm_sub2, PoRecvIf_Chk01_CndR.$itm_sub3, PoRecvIf_Chk01_CndR.$site_cd);
			cacheItmVer_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			cacheItmVer_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			cacheItmVer_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			cacheItmVer_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			cacheItmVer_bldr.addWhereWithAnd(t.site_cd.eq(bind("site_cd")));
			dbSelect("MSLAL9110_MAM_ITM_VER_S01",
					_cacheItmVer, cacheItmVer_bldr, bindL);
			_idxItmVer = _cacheItmVer.createIndex(MAM_ITM_VER_R.$itm_cd, MAM_ITM_VER_R.$itm_sub1,
					MAM_ITM_VER_R.$itm_sub2, MAM_ITM_VER_R.$itm_sub3, MAM_ITM_VER_R.$site_cd);
		}

		/**
		 * キャッシュ作成（税マスタ）
		 */
		protected void createCacheTax() {
			_cacheTax = new FXUCL_MCDbcCache<MAM_TAX_R>(
					MCQueryApiBuilder.create(MAM_TAX_R.create("T")),
					up0(), PoRecvIf_Chk01_CndR.$tax_cd);
		}

		/**
		 * キャッシュ作成（案件）
		 */
		protected void createCacheWrk() {
			MCList<MST_WRK_R> bindL = MCList.create(MST_WRK_R.class);
			for (MST_WRK_SNO_R wrkSnoR : _cacheWrkSno.groupBy(MST_WRK_SNO_R.$wrk_no)) {
				MST_WRK_R bindR = MST_WRK_R.create();
				bindR.wrk_no(wrkSnoR.wrk_no());
				bindL.add(bindR);
			}
			for (MST_PO_R poR : _cachePo) {
				MST_WRK_R bindR = MST_WRK_R.create();
				bindR.wrk_no(poR.wrk_no());
				bindL.add(bindR);
			}
			
			_cacheWrk = MCList.create(MST_WRK_R.class);
			MST_WRK_R t = MST_WRK_R.create("T");
			MCQueryApiBuilder cacheWrk_bldr = MCQueryApiBuilder.create(t);
			cacheWrk_bldr.setWhere(t.wrk_no.eq(bind("wrk_no")));
			dbSelect("MSLAL9110_MST_WRK_S01",
					_cacheWrk, cacheWrk_bldr, bindL.groupBy(MST_WRK_R.$wrk_no));
			
			_idxWrk = _cacheWrk.createIndex(MST_WRK_R.$wrk_no);
		}

		/**
		 * キャッシュ作成（案件手配紐付情報）
		 */
		protected void createCacheWrkSno() {
			_cacheWrkSno = MCList.create(MST_WRK_SNO_R.class);
			MST_WRK_SNO_R t = MST_WRK_SNO_R.create("T");
			MCQueryApiBuilder cacheWrkSno_bldr = MCQueryApiBuilder.create(t);
			cacheWrkSno_bldr.setWhere(t.sno1.eq(bind("sno1")));
			dbSelect("MSLAL9110_MST_WRK_SNO_S01",
					_cacheWrkSno, cacheWrkSno_bldr, up0());
			_idxWrkSno = _cacheWrkSno.createIndex(MST_WRK_SNO_R.$sno1);
		}

		/**
		 * キャッシュ作成（取引先マスタ）
		 */
		protected void createCacheBp() {
			// 取引先マスタ取得
			_cacheBp = new FXUCL_MCDbcCache<MAM_BP_R>(
					MCQueryApiBuilder.create(MAM_BP_R.create("T")),
					up0().groupBy(PoRecvIf_Chk01_CndR.$sppl_cd), PoRecvIf_Chk01_CndR.$sppl_cd);
		}

		/**
		 * キャッシュ作成（部門マスタ）
		 */
		protected void createCacheDpt() {
			_cacheDpt = new FXUCL_MCDbcCacheStEnd<>(
					MCQueryApiBuilder.create(MAM_DPT_R.create("T")),
					up0().groupBy(PoRecvIf_Chk01_CndR.$purc_dpt_cd), PoRecvIf_Chk01_CndR.$purc_dpt_cd);
		}

		/**
		 * キャッシュ取得（発注ヘッダ）
		 * @param poNo 発注ＮＯ
		 * @return 発注ヘッダ
		 */
		protected MST_PO_R getCachePo(String poNo) {
			return _cachePo.getFirst(_idxPoKey, poNo);
		}

		/**
		 * キャッシュ取得（発注明細）
		 * @param poDNo 発注明細ＮＯ
		 * @return 発注明細
		 */
		protected MST_PO_D_R getCachePoD(String poDNo) {
			 return _cachePoD.getFirst(_idxPoDKey, poDNo);
		}

		/**
		 * キャッシュ取得（取引先品目マスタ）
		 * @param poDt 発注日
		 * @param bpCd 発注先
		 * @param itmCd 品目
		 * @param itmSub1 枝番1
		 * @param itmSub2 枝番2
		 * @param itmSub3 枝番3
		 * @return 取引先品目マスタ
		 */
		protected MAM_BP_ITM_R getCacheBpItm(MCDate poDt, String bpCd, String itmCd, String itmSub1, String itmSub2, String itmSub3) {
			return _cacheBpItm.get(poDt, bpCd, itmCd, itmSub1, itmSub2, itmSub3);
		}

		/**
		 * キャッシュ取得（品目マスタ）
		 * @param itmCd 品目
		 * @param itmSub1 枝番1
		 * @param itmSub2 枝番2
		 * @param itmSub3 枝番3
		 * @return 品目マスタ
		 */
		protected MAM_ITM_R getCacheItm(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
			return _cacheItm.get(itmCd, itmSub1, itmSub2, itmSub3);
		}

		/**
		 * キャッシュ取得（品目詳細マスタ）
		 * @param poRecvIfR 発注受信ＩＦ
		 * @return 品目詳細マスタ
		 */
		protected MCList<MAM_ITM_DTL_R> getCacheItmDtl(PoRecvIf_Chk01_CndR poRecvIfR){
			MCList<MAM_ITM_DTL_R> itmDtlL = _cacheItmDtl.subList(_idxItmDtl, 
					poRecvIfR.itm_cd(), poRecvIfR.itm_sub1(), poRecvIfR.itm_sub2(), poRecvIfR.itm_sub3(), poRecvIfR.in_to_loc_wg_cd());
			
			MCList<MAM_ITM_DTL_R> tmpL = MCList.create(MAM_ITM_DTL_R.class);
			
			// 発注先が合致するレコードを取得
			tmpL = itmDtlL.subList(r -> isSame(r.sppl_cd(), poRecvIfR.sppl_cd()));
			
			// 外注先が合致するレコードを取得
			MCList<MAM_ITM_DTL_R> outsrcL = MCList.create(MAM_ITM_DTL_R.class);
			outsrcL = itmDtlL.subList(r -> isSame(r.getStringNE("mfg_loc_sppl_cd"), poRecvIfR.sppl_cd()));
			
			if (!isNullOrNullVal(poRecvIfR.maker_cd())) {
				tmpL = tmpL.subList(r -> isSame(r.maker_cd(), poRecvIfR.maker_cd()));
				outsrcL = outsrcL.subList(r -> isSame(r.getStringNE("mfg_loc_maker_cd"), poRecvIfR.maker_cd()));
				
			}
			tmpL.addAll(outsrcL);
			
			if (!isNullOrNullVal(poRecvIfR.mfg_loc_cd())) {
				tmpL = tmpL.subList((r -> isSame(r.mfg_loc_cd(), poRecvIfR.mfg_loc_cd())));
			}
			if (!isNullOrNullVal(poRecvIfR.bom_ptn())) {
				tmpL = tmpL.subList((r -> isSame(r.bom_ptn(), poRecvIfR.bom_ptn())));
			}
			
			MCList<MAM_ITM_DTL_R> rsltL = MCList.create(MAM_ITM_DTL_R.class);
			for (MAM_ITM_DTL_R r : tmpL) {
				if (poRecvIfR.po_dt().lte(r.end_dt())
						&& poRecvIfR.po_dt().gte(r.st_dt())) {
					rsltL.add(r);
				}
			}
			return rsltL;
		}

		/**
		 * キャッシュ取得（品目詳細マスタ）
		 * @param itmCd
		 * @param itmSub1
		 * @param itmSub2
		 * @param itmSub3
		 * @param wgCd
		 * @param spplCd
		 * @param makerCd
		 * @param mfgLocCd
		 * @param bomPtn
		 * @param baseDt
		 * @return 品目詳細マスタ
		 */
		protected MAM_ITM_DTL_R getCacheItmDtl(
				String itmCd, String itmSub1, String itmSub2, String itmSub3, String wgCd
				, String spplCd, String makerCd
				, String mfgLocCd, String bomPtn
				, MCDate baseDt){
			MCList<MAM_ITM_DTL_R> itmDtlL = _cacheItmDtl.subList(
										_idxItmDtlKey
										, itmCd, itmSub1, itmSub2, itmSub3, wgCd
										, spplCd, makerCd
										, mfgLocCd, bomPtn);
			MAM_ITM_DTL_R itmDtlR = MAM_ITM_DTL_R.create();
			for (MAM_ITM_DTL_R r : itmDtlL) {
				if (baseDt.lte(r.end_dt())
						&& baseDt.gte(r.st_dt())) {
					itmDtlR = r;
					break;
				}
			}
			
			return itmDtlR;
		}

		/**
		 * キャッシュ取得（品目単位マスタ）
		 * @param itmCd
		 * @param itmSub1
		 * @param itmSub2
		 * @param itmSub3
		 * @param trdUnitCd
		 * @return 品目単位マスタ
		 */
		protected MAVM_ITM_UNIT_R getCacheItmUnit(String itmCd, String itmSub1, String itmSub2, String itmSub3, String trdUnitCd) {
			return _cacheItmUnit.get(itmCd, itmSub1, itmSub2, itmSub3, trdUnitCd);
		}

		/**
		 * キャッシュ取得（版マスタ）
		 * @param poRecvIfR 発注受信ＩＦ
		 * @return 版マスタ
		 */
		protected MCList<MAM_ITM_VER_R> getCacheItmVer(PoRecvIf_Chk01_CndR poRecvIfR){
			MCList<MAM_ITM_VER_R> itmVerL = _cacheItmVer.subList(_idxItmVer, poRecvIfR.itm_cd(), poRecvIfR.itm_sub1(), poRecvIfR.itm_sub2(), poRecvIfR.itm_sub3(), poRecvIfR.site_cd());
			return itmVerL;
		}

		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void initUpSub() {
			super.initUpSub();
			
			addTmpCol();
			
			setPegNo(up0());
			
			getPoInfo();
			
			setItmSub(up0());
			
			setNullVal(up0());
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			compl();
			
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			
			msgL.addAll(chkDuplicate(up0()));
			
			setHdrDataCrudTyp(up0());

			msgL.addAll(chkPoAndCompl(up0()));
			
			setPoDt(up0());
			
			msgL.addAll(chkReq());
			
			msgL.addAll(setTrd(up0()));
			
			setAmtBaseInfo(up0());
			
			setPurcDptUser(up0());
			
			setStrLn(up0());
			
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheck() {
			MCMessageList msgL = super.doServerCheck();

			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			// doServerCheckでエラーがない取込グループのみ後続のチェックを行う
			MCList<PoRecvIf_Chk01_CndR> notErrL = getNotErrL();
			if (notErrL.isEmpty()) {
				return msgL;
			}
			
			beforeChkCompl(notErrL);
			
			msgL.addAll(chkReq(notErrL));
			
			msgL.addAll(chkUpdCrctRsn(notErrL));
			
			msgL.addAll(chkWrkNo(notErrL));
			
			msgL.addAll(chkStop(notErrL));
			
			msgL.addAll(chkAprv(notErrL));
			
			msgL.addAll(chkArr(notErrL));
			
			msgL.addAll(checkExistItmDtl(notErrL));
			
			msgL.addAll(chkQty(notErrL));
			
			msgL.addAll(chkIvItmNm(notErrL));
			
			msgL.addAll(chkVerNo(notErrL));
			
			msgL.addAll(chkOutsrc(notErrL));
			
			msgL.addAll(chkPurcIdTyp(notErrL));
			
			msgL.addAll(chkAmt(notErrL));
			
			msgL.addAll(chkXpnsPurc(notErrL));
			
			msgL.addAll(chkDt(notErrL));
			
			msgL.addAll(chkUpdPoPrintSchdDt(notErrL));
			
			msgL.addAll(existBdCheck(notErrL));
			
			msgL.addAll(chkDtlL(notErrL));
			
			return msgL;
		}
		
		protected void addTmpCol() {
			up0().addStringColumn("if_proc_typ", MAC_IF_PROC_TYP.PO_SEND.value());
		}

		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			down0().setAll(up0());
			
			MCList<PoRecvIf_Chk01_CndR> poRecvIfL = getNotErrL();
			for (MCList<PoRecvIf_Chk01_CndR> upGroupList : poRecvIfL.groupList(getPoRecvIfHdrKey())) {
				upGroupList.sort((PoRecvIf_Chk01_CndR.$data_lno));
				setDownSub(upGroupList);
			}
		}

		protected void getPoInfo() {
			createCachePo();
			createCachePoD();
		}
		
		/**
		 * 発注明細に紐付く発注受信ＩＦを取得する。
		 * @param poDR 発注明細
		 * @return 発注受信ＩＦ
		 */
		protected PoRecvIf_Chk01_CndR getPoRecvIfR(MST_PO_D_R poDR) {
			if (_idxPoRecvIfKey == null) {
				_idxPoRecvIfKey = up0().createIndex(MST_PO_R.$ext_sys_cd, MST_PO_D_R.$ext_po_d_no);
			}
			
			return up0().getFirst(_idxPoRecvIfKey, poDR.getString("ext_sys_cd"), poDR.ext_po_d_no());
		}
		
		/**
		 * 引数に指定された取引パタン区分でデフォルト取引ＣＤを取得する。
		 * @param poRecvIfR 発注受信ＩＦ
		 * @return デフォルト取引ＣＤ
		 */
		protected String getDefaultTrd(PoRecvIf_Chk01_CndR poRecvIfR) {
			if(MAC_TRD_PTN_TYP.isPURC_XPNS(poRecvIfR.trd_ptn_typ())) {
				return MAUCL_TrdUtil.getDefaultTrdCd(MAC_TRD_PTN_TYP.PURC_XPNS.value());
			}
			return MAUCL_TrdUtil.getDefaultTrdCd(MAC_TRD_PTN_TYP.PURC.value());
		}
		
		/**
		 * 取引の設定
		 * @param poRecvIfL 発注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList setTrd(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			MCMessageList msgL = new MCMessageList();

			MCList<MAM_TRD_R> trdL = MCList.create(MAM_TRD_R.class);
			MAM_TRD_R t = MAM_TRD_R.create("T");
			MCQueryApiBuilder trdL_bldr = MCQueryApiBuilder.create(t);
			trdL_bldr.setWhere(t.trd_ptn_typ.in(value(MAC_TRD_PTN_TYP.PURC.value()),
					value(MAC_TRD_PTN_TYP.PURC_XPNS.value())));
			dbSelect("MSLAL9110_MAM_TRD_S01", trdL, trdL_bldr);
			MCIndexKey idxTrdL = trdL.createIndex(MAM_TRD_R.$trd_cd,
					MAM_TRD_R.$trd_ptn_typ);

			for (PoRecvIf_Chk01_CndR poRecvIfR : poRecvIfL) {
				String hdrDataCrudTyp = poRecvIfR.hdr_data_crud_typ();
				if (MAC_DATA_CRUD_TYP.isCRT(hdrDataCrudTyp)) {
					poRecvIfR.trd_cd(nvl(poRecvIfR.trd_cd(), getDefaultTrd(poRecvIfR)));
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(hdrDataCrudTyp)) {
					MST_PO_R poR = _cachePo.getFirst(_idxExtPoNoKey,
							poRecvIfR.ext_sys_cd(), poRecvIfR.ext_po_no());
					poRecvIfR.trd_cd(poR.trd_cd());
				}

				if (!isNull(poRecvIfR.trd_ptn_typ())) {
					if (MAC_DATA_CRUD_TYP.isDEL(hdrDataCrudTyp)) {
						continue;
					}
					MAM_TRD_R trdR = trdL.getFirst(idxTrdL, poRecvIfR.trd_cd(),
							poRecvIfR.trd_ptn_typ());
					if (isNull(trdR)) {
						msgL.add(new MCMessage(poRecvIfR, null, MSLAL0501,
								poRecvIfR.data_no(), poRecvIfR.data_lno(),
								poRecvIfR.ext_sys_cd(), poRecvIfR.ext_po_no(),
								poRecvIfR.ext_po_d_no(), poRecvIfR.trd_cd()));
						poRecvIfR.err_flg(true);
					}
				}
			}
			return msgL;
		}
		
		/**
		 * リストロジックチェックを行う前に、金額基本情報を設定する。
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void setAmtBaseInfo(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			poRecvIfL.setString("base_cur_cd", getCo().base_cur_cd());
			poRecvIfL.setString("ptax_cur_cd", getCo().ptax_cur_cd());
			poRecvIfL.setString("wtax_rnd_typ", getCo().wtax_rnd_typ());
		}
		
		/**
		 * リストロジックチェックを行う前に、品目の枝番を設定する。
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void setItmSub(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			for (PoRecvIf_Chk01_CndR poRecvIfR : poRecvIfL) {
				if (!isNull(poRecvIfR.itm_cd())) {
					poRecvIfR.itm_sub1(nvl(poRecvIfR.itm_sub1(), MAC_STR.NULL_VAL.value()));
					poRecvIfR.itm_sub2(nvl(poRecvIfR.itm_sub2(), MAC_STR.NULL_VAL.value()));
					poRecvIfR.itm_sub3(nvl(poRecvIfR.itm_sub3(), MAC_STR.NULL_VAL.value()));
				}
				if (!isNull(poRecvIfR.bd_itm_cd())) {
					poRecvIfR.bd_itm_sub1(nvl(poRecvIfR.bd_itm_sub1(), MAC_STR.NULL_VAL.value()));
					poRecvIfR.bd_itm_sub2(nvl(poRecvIfR.bd_itm_sub2(), MAC_STR.NULL_VAL.value()));
					poRecvIfR.bd_itm_sub3(nvl(poRecvIfR.bd_itm_sub3(), MAC_STR.NULL_VAL.value()));
				}
			}
		}
		
		/**
		 * ＮＵＬＬ文字を補完する
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void setNullVal(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			for (PoRecvIf_Chk01_CndR poRecvIfR : poRecvIfL) {
				poRecvIfR.sno1(nvl(poRecvIfR.sno1(), MAC_STR.NULL_VAL.value()));
				poRecvIfR.sno2(nvl(poRecvIfR.sno2(), MAC_STR.NULL_VAL.value()));
				poRecvIfR.sno3(nvl(poRecvIfR.sno3(), MAC_STR.NULL_VAL.value()));
				poRecvIfR.sno4(nvl(poRecvIfR.sno4(), MAC_STR.NULL_VAL.value()));
			}
		}
		
		/**
		 * リストロジックチェックを行う前に、発注日を設定する。
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void setPoDt(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			for (MCList<PoRecvIf_Chk01_CndR> upGroupList : poRecvIfL.groupList(getPoRecvIfHdrKey())) {
				PoRecvIf_Chk01_CndR hdrR = upGroupList.get(0);
				if (MAC_DATA_CRUD_TYP.isDEL(hdrR.hdr_data_crud_typ())) {
					continue;
				}
				
				MCDate poDt = nvl(hdrR.po_dt(), getToday());
				
				// 同一ヘッダの全明細に発注日を設定する。
				upGroupList.setDate(PoRecvIf_Chk01_CndR.$po_dt, poDt);
			}
		}
		
		/**
		 * リストロジックチェックを行う前に、購買部門と購買担当者を設定する。
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void setPurcDptUser(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			MCList<PoRecvIf_Chk01_CndR> subL = poRecvIfL.subList(
					r -> !MAC_DATA_CRUD_TYP.isDEL(r.hdr_data_crud_typ()));
			
			// 発注先担当マスタ取得
			MCList<MAM_SPPL_USR_R> spplUsrL = MCList.create(MAM_SPPL_USR_R.class);
			FXUCL_MCDbcCacheStEnd<MAM_SPPL_USR_R> cacheSpplUsr = new FXUCL_MCDbcCacheStEnd<>(
					spplUsrL, MCQueryApiBuilder.create(MAM_SPPL_USR_R.create("T")),
					subL, PoRecvIf_Chk01_CndR.$sppl_cd);
			
			// 担当者権限マスタ取得
			MCList<MAM_USR_ACL_R> bindL = MCList.create(MAM_USR_ACL_R.class);
			for (MAM_SPPL_USR_R r : spplUsrL.groupBy(MAM_SPPL_USR_R.$purc_usr_cd)) {
				MAM_USR_ACL_R bindR = MAM_USR_ACL_R.create();
				bindR.usr_cd(r.purc_usr_cd());
				bindL.add(bindR);
			}
			MCList<PoRecvIf_Chk01_CndR> tmpL = subL.subList(r -> isNull(r.purc_dpt_cd()) && !isNull(r.purc_usr_cd()));
			for (PoRecvIf_Chk01_CndR r : tmpL.groupBy(PoRecvIf_Chk01_CndR.$purc_usr_cd)) {
				MAM_USR_ACL_R bindR = MAM_USR_ACL_R.create();
				bindR.usr_cd(r.purc_usr_cd());
				bindL.add(bindR);
			}
			MCList<MAM_USR_ACL_R> usrAclL = MCList.create(MAM_USR_ACL_R.class);
			FXUCL_MCDbcCacheStEnd<MAM_USR_ACL_R> cacheUsrAcl = new  FXUCL_MCDbcCacheStEnd<>(
					usrAclL, MCQueryApiBuilder.create(MAM_USR_ACL_R.create("T")),
					bindL, MAM_USR_ACL_R.$usr_cd);
			
			// 部門マスタ取得
			FXUCL_MCDbcCacheStEnd<MAM_DPT_R> cacheDptL = new FXUCL_MCDbcCacheStEnd<>(
					MCQueryApiBuilder.create(MAM_DPT_R.create("T")),
					usrAclL, MAM_USR_ACL_R.$dpt_cd);
			
			for (MCList<PoRecvIf_Chk01_CndR> upGroupList : subL.groupList(getPoRecvIfHdrKey())) {
				for (PoRecvIf_Chk01_CndR poRecvIfR : upGroupList) {
					if (!isNull(poRecvIfR.purc_dpt_cd())) {
						continue;
					}
					if (!isNull(poRecvIfR.purc_usr_cd())) {
						MAM_USR_ACL_R usrAclR = cacheUsrAcl.get(poRecvIfR.po_dt(), poRecvIfR.purc_usr_cd());
						MAM_DPT_R dptR = cacheDptL.get(poRecvIfR.po_dt(), usrAclR.dpt_cd());
						if (dptR.purc_dpt_flg()) {
							poRecvIfR.purc_dpt_cd(dptR.dpt_cd());
						}
					}
					else {
						MAM_SPPL_USR_R spplUsrR = cacheSpplUsr.get(poRecvIfR.po_dt(), poRecvIfR.sppl_cd());
						if (!isNull(spplUsrR.purc_dpt_cd())) {
							poRecvIfR.purc_dpt_cd(spplUsrR.purc_dpt_cd());
						}
						else if (!isNull(spplUsrR.purc_usr_cd())) {
							poRecvIfR.purc_usr_cd(spplUsrR.purc_usr_cd());
							MAM_USR_ACL_R usrAclR = cacheUsrAcl.get(poRecvIfR.po_dt(), spplUsrR.purc_usr_cd());
							MAM_DPT_R dptR = cacheDptL.get(poRecvIfR.po_dt(), usrAclR.dpt_cd());
							if (dptR.purc_dpt_flg()) {
								poRecvIfR.purc_dpt_cd(dptR.dpt_cd());
							}
						}
					}
				}
			}
		}
		
		/**
		 * リストロジックチェックを行う前に、棚・ラインを設定する。
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void setStrLn(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			// 削除以外、かつNULLの場合だけ補完する（NULL文字の場合は補完しない）
			MCList<PoRecvIf_Chk01_CndR> tgtList = poRecvIfL.subList(r -> !isDel(r) && isNull(r.str_ln_cd()));
			if (tgtList.isEmpty()) {
				return;
			}
			
			MSUCL_StrLnUtil.StrLnUtil_Srch01 strLnUtilSrch01 = MSUCL_StrLnUtil.crtStrLnUtil_Srch01();
			addAll(strLnUtilSrch01.up0(), tgtList, createMap_StrLnUtil_Srch01_CndR_PoRecvIf_Chk01_CndR());
			strLnUtilSrch01.exec();
			String[] destCols = {PoRecvIf_Chk01_CndR.$str_ln_cd};
			String[] srcCols = {StrLnUtil_Srch01_CndR.$str_ln_cd};
			copyByPegNo(tgtList, destCols, strLnUtilSrch01.down0(), srcCols);
		}
		
		/**
		 * 必須チェック
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkReq() {
			MCMessageList msgL = new MCMessageList();
			for (PoRecvIf_Chk01_CndR poRecvIfR : up0()) {
				if (isDel(poRecvIfR)) {
					continue;
				}
				msgL.addAll(check(poRecvIfR, PoRecvIf_Chk01_CndR.$trd_ptn_typ, new FXUCL_RequiredValidater()));
				msgL.addAll(check(poRecvIfR, PoRecvIf_Chk01_CndR.$sppl_cd, new FXUCL_RequiredValidater()));
				msgL.addAll(check(poRecvIfR, PoRecvIf_Chk01_CndR.$itm_cd, new FXUCL_RequiredValidater()));
				msgL.addAll(check(poRecvIfR, PoRecvIf_Chk01_CndR.$trd_unit_qty, new FXUCL_RequiredValidater()));
				msgL.addAll(check(poRecvIfR, PoRecvIf_Chk01_CndR.$in_to_loc_cd, new FXUCL_RequiredValidater()));
				msgL.addAll(check(poRecvIfR, PoRecvIf_Chk01_CndR.$dlv_rqst_tm, new FXUCL_RequiredValidater()));
			}
			return msgL;
		}
		
		/**
		 * 条件付き必須チェックを行う。
		 * @param poRecvIfL 発注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkReq(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			
			for (PoRecvIf_Chk01_CndR poRecvIfR : poRecvIfL) {
				if (isDel(poRecvIfR)) {
					continue;
				}
				msgL.addAll(check(poRecvIfR, PoRecvIf_Chk01_CndR.$purc_dpt_cd, new FXUCL_RequiredValidater()));
				msgL.addAll(check(poRecvIfR, PoRecvIf_Chk01_CndR.$ap_dpt_cd, new FXUCL_RequiredValidater()));
				msgL.addAll(check(poRecvIfR, PoRecvIf_Chk01_CndR.$trd_cur_cd, new FXUCL_RequiredValidater()));
				
				if (poRecvIfR.xrate_inpt_flg()) {
					// 為替レート指定の場合為替レート必須
					msgL.addAll(check(poRecvIfR, PoRecvIf_Chk01_CndR.$xrate, new FXUCL_RequiredValidater()));
				}
				
				if (poRecvIfR.ptax_xrate_inpt_flg() && !isNull(getCo().ptax_cur_cd())) {
					// 納税為替レート指定の場合納税為替レート必須
					msgL.addAll(check(poRecvIfR, PoRecvIf_Chk01_CndR.$ptax_xrate, new FXUCL_RequiredValidater()));
				}
				
				if (!isNull(poRecvIfR.trd_cur_dscnt_amt()) && poRecvIfR.trd_cur_dscnt_amt().gt(MCNumber.ZERO)) {
					//値引額が指定されている場合値引理由必須
					msgL.addAll(check(poRecvIfR, PoRecvIf_Chk01_CndR.$dscnt_rsn_cd, new FXUCL_RequiredValidater()));
				}
				
			}
			return msgL;
		}
		
		/**
		 * 外部発注明細ＮＯが重複しているかをチェックする。
		 * @param poRecvIfL 発注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkDuplicate(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			List<MCNumber> errL = new ArrayList<MCNumber>();
			PoRecvIf_Chk01_CndR prev = null;
			for (PoRecvIf_Chk01_CndR poRecvIfR : poRecvIfL) {
				if (prev == null) {
					prev = poRecvIfR;
					continue;
				}
				
				if (isSame(poRecvIfR.ext_sys_cd(), prev.ext_sys_cd()) && isSame(poRecvIfR.ext_po_no(), prev.ext_po_no())
						&& isSame(poRecvIfR.ext_po_d_no(), prev.ext_po_d_no())) {
					if (!errL.contains(prev.data_lno())) {
						msgL.add(new MCMessage(prev, null, MSLAL0480, prev.data_no(), prev.data_lno(),
								prev.ext_sys_cd(), prev.ext_po_no(), prev.ext_po_d_no()));
						errL.add(prev.data_lno());
					}
					
					msgL.add(new MCMessage(poRecvIfR, null, MSLAL0480, poRecvIfR.data_no(), poRecvIfR.data_lno(),
							poRecvIfR.ext_sys_cd(), poRecvIfR.ext_po_no(), poRecvIfR.ext_po_d_no()));
					errL.add(poRecvIfR.data_lno());
				}
				
				prev = poRecvIfR;
			}
			return msgL;
		}
		
		/**
		 * 対応する発注情報を取込みできるかチェックし、補完する。
		 * @param poRecvIfL 発注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkPoAndCompl(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			for (MCList<PoRecvIf_Chk01_CndR> upGroupList : poRecvIfL.groupList(getPoRecvIfHdrKey())) {
				upGroupList.sort((PoRecvIf_Chk01_CndR.$data_lno));
				PoRecvIf_Chk01_CndR hdrIfR = upGroupList.get(0);
				MST_PO_R poR = null;
				boolean hdrErrFlg = false;
				
				if (!chkExistExtPoD(hdrIfR)) {
					upGroupList.forEach(r -> {
						msgL.add(new MCMessage(r, null, MSLAL0498, r.data_no(), r.data_lno(), r.ext_sys_cd(), r.ext_po_no()));
					});
					hdrErrFlg = true;
				}
				
				if (!MAC_DATA_CRUD_TYP.isCRT(hdrIfR.hdr_data_crud_typ())) {
					MCList<MST_PO_R> poL = _cachePo.subList(_idxExtPoNoKey, hdrIfR.ext_sys_cd(), hdrIfR.ext_po_no());
					
					if (poL.size() == 1) {
						poR = poL.get(0);
					}
					else if (poL.size() > 1) {
						upGroupList.forEach(r -> {
							msgL.add(new MCMessage(r, null, MSLAL0478, r.data_no(), r.data_lno()));
						});
						hdrErrFlg = true;
					}
				}
				
				// ヘッダ項目のデータ補完
				if (!isNull(poR) && !hdrErrFlg) {
					for (PoRecvIf_Chk01_CndR up : upGroupList) {
						up.po_no(poR.po_no());
						up.po_rev(poR.po_rev());
						up.bef_po_rev(poR.po_rev());
						up.trd_cd(poR.trd_cd());
						up.trd_ptn_typ(poR.trd_ptn_typ());
						up.sppl_cd(poR.sppl_cd());
						
						if (MAC_DATA_CRUD_TYP.isDEL(up.hdr_data_crud_typ())) {
							up.po_dt(poR.po_dt());
						}
					}
				}
				
				msgL.addAll(chkPoDAndCompl(upGroupList));
			}
			return msgL;
		}
		
		/**
		 * 対応する発注明細情報を取込みできるかチェックし、補完する。
		 * @param upGroupList 外部システムデータＮＯ・外部システムデータ行ＮＯ・外部発注ＮＯが同一である発注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkPoDAndCompl(MCList<PoRecvIf_Chk01_CndR> upGroupList) {
			MCMessageList msgL = new MCMessageList();
			for (PoRecvIf_Chk01_CndR poRecvIfR : upGroupList) {
				MCList<MST_PO_D_R> poDL = _cachePoD.subList(_idxExtPoDNoKey, poRecvIfR.ext_sys_cd(), poRecvIfR.ext_po_d_no());
				boolean dtlErrFlg = false;
				
				if (isCrt(poRecvIfR)) {
					if (poDL.size() > 0) {
						msgL.add(new MCMessage(poRecvIfR, null, MSLAL0476, poRecvIfR.data_no(), poRecvIfR.data_lno(),
								poRecvIfR.ext_sys_cd(), poRecvIfR.ext_po_no(), poRecvIfR.ext_po_d_no()));
						dtlErrFlg = true;
					}
				}
				else {
					if (poDL.size() > 1) {
						msgL.add(new MCMessage(poRecvIfR, null, MSLAL0499, poRecvIfR.data_no(), poRecvIfR.data_lno()));
						dtlErrFlg = true;
					}
					else if (poDL.size() == 0) {
						msgL.add(new MCMessage(poRecvIfR, null, MSLAL0477, poRecvIfR.data_no(), poRecvIfR.data_lno()));
						dtlErrFlg = true;
					}
				}
				
				// 明細項目のデータ補完
				if ((!isNull(poDL)) && !dtlErrFlg) {
					MST_PO_D_R podR = poDL.get(0);
					poRecvIfR.po_d_no(podR.po_d_no());
					poRecvIfR.disp_seq(podR.disp_seq());
					poRecvIfR.io_schd_pr_no(podR.io_schd_pr_no());
					poRecvIfR.outsrc_itm_ord_no(podR.outsrc_itm_ord_no());
					poRecvIfR.itm_cd(podR.itm_cd());
					poRecvIfR.itm_sub1(podR.itm_sub1());
					poRecvIfR.itm_sub2(podR.itm_sub2());
					poRecvIfR.itm_sub3(podR.itm_sub3());
					
					if (isDel(poRecvIfR)) {
						poRecvIfR.rqst_avl_rqst_dt(podR.rqst_avl_rqst_dt());
						poRecvIfR.dlv_rqst_tm(podR.dlv_rqst_tm());
						poRecvIfR.rqst_dlv_rqst_tm(podR.rqst_dlv_rqst_tm());
						poRecvIfR.purc_schd_dt(podR.purc_schd_dt());
						poRecvIfR.outsrc_flg(podR.outsrc_flg());
					}
				}
			}
			return msgL;
		}
		
		/**
		 * 発注明細に対応する外部発注明細ＮＯが全て存在するかをチェックする。
		 * @param hdrIfR 発注受信ＩＦ
		 * @return 全て存在する場合はtrue
		 */
		protected boolean chkExistExtPoD(PoRecvIf_Chk01_CndR hdrIfR) {
			MCList<MST_PO_D_R> poDL = _cachePoD.subList(_idxExtPoNoforDkey, hdrIfR.ext_sys_cd(), hdrIfR.ext_po_no());
			for (MST_PO_D_R poDR : poDL) {
				PoRecvIf_Chk01_CndR poRecvIfR = getPoRecvIfR(poDR);
				if (isNull(poRecvIfR)) {
					return false;
				}
			}
			return true;
		}
		
		/**
		 * 発注禁止かどうかチェックする。
		 * @param poRecvIfL 発注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkStop(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			for (PoRecvIf_Chk01_CndR poRecvIfR : poRecvIfL) {
				if (isDel(poRecvIfR)) {
					continue;
				}
				// 発注禁止でないか(取引先)
				MAM_BP_STOP_R bpStopR = _cacheBpStop.get(poRecvIfR.sppl_cd());
				if (!isNull(bpStopR.po_stop_dt()) && bpStopR.po_stop_dt().lte(poRecvIfR.po_dt())) {
					msgL.add(new MCMessage(poRecvIfR, null , MSLAL0484, poRecvIfR.data_no(), poRecvIfR.data_lno(), poRecvIfR.sppl_cd(), toYMDString(poRecvIfR.po_dt())));
				}
				// 発注禁止でないか(品目)
				MAM_ITM_STOP_R itmStopR =_cacheItmStop.get(poRecvIfR.itm_cd(), poRecvIfR.itm_sub1(), poRecvIfR.itm_sub2(), poRecvIfR.itm_sub3());
				if (!isNull(itmStopR.po_stop_dt()) && itmStopR.po_stop_dt().lte(poRecvIfR.po_dt())) {
					msgL.add(new MCMessage(poRecvIfR, null , MSLAL0485, poRecvIfR.data_no(), poRecvIfR.data_lno(), toDispItm(poRecvIfR.itm_cd(), poRecvIfR.itm_sub1(), poRecvIfR.itm_sub2(), poRecvIfR.itm_sub3()), toYMDString(poRecvIfR.po_dt()), toYMDString(itmStopR.po_stop_dt())));
				}
			}
			return msgL;
		}
		
		/**
		 * 承認済かどうかチェック
		 * @param poRecvIfL 発注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkAprv(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			for (PoRecvIf_Chk01_CndR poRecvIfR : poRecvIfL) {
				MST_PO_R poR = getCachePo(poRecvIfR.po_no());
				if (!isNull(poR) && (MAC_APRV_STS_TYP.isFIX(poR.aprv_sts_typ())
						|| MAC_APRV_STS_TYP.isACPT(poR.aprv_sts_typ()))) {
					msgL.add(new MCMessage(poRecvIfR, null, MSLAL0482, poRecvIfR.data_no(), poRecvIfR.data_lno(),
							poRecvIfR.ext_po_no(), poR.po_no()));
				}
			}
			return msgL;
		}
		
		/**
		 * 品目詳細マスタの存在チェック
		 * @param poRecvIfL 発注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList checkExistItmDtl(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			MCList<MAM_ITM_DTL_R> itmDtlL = MCList.create(MAM_ITM_DTL_R.class);
			for (PoRecvIf_Chk01_CndR porecvIfR : poRecvIfL) {
				if (isDel(porecvIfR)) {
					continue;
				}
				// 品目詳細マスタの存在チェックを行う
				MAM_ITM_DTL_R itmDtlR = MAM_ITM_DTL_R.create();
				itmDtlR.setAttributes(porecvIfR);
				itmDtlR.itm_cd(porecvIfR.itm_cd());
				itmDtlR.itm_sub1(porecvIfR.itm_sub1());
				itmDtlR.itm_sub2(porecvIfR.itm_sub2());
				itmDtlR.itm_sub3(porecvIfR.itm_sub3());
				itmDtlR.mfg_loc_cd(porecvIfR.mfg_loc_cd());
				// 内製の場合は、発注先、メーカにNULL文字を設定せず、品目詳細マスタの存在チェックエラーにする。
				if (isNullOrNullVal(porecvIfR.mfg_loc_cd()) || !porecvIfR.outsrc_flg()) {
					itmDtlR.sppl_cd(porecvIfR.sppl_cd());
					itmDtlR.maker_cd(porecvIfR.maker_cd());
				}
				else {
					itmDtlR.sppl_cd(MAC_STR.NULL_VAL.value());
					itmDtlR.maker_cd(MAC_STR.NULL_VAL.value());
				}
				itmDtlR.rqst_loc_cd(MAC_STR.NULL_VAL.value());
				itmDtlR.wg_cd(porecvIfR.in_to_loc_wg_cd());
				itmDtlR.bom_ptn(porecvIfR.bom_ptn());
				itmDtlR.st_dt(porecvIfR.po_dt());
				itmDtlL.add(itmDtlR);
			}
			return MSUCL_ProdUtil.chkItmDtlKey(itmDtlL);
		}
		
		/**
		 * 取引単位数量に関連するチェック処理を行う。
		 * @param poRecvIfL 発注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkQty(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			for (PoRecvIf_Chk01_CndR poRecvIfR : poRecvIfL) {
				if (isDel(poRecvIfR)) {
					continue;
				}
				
				if (isNull(poRecvIfR.trd_unit_qty())) {
					continue;
				}
				
				MCNumber decPlace = null;
				
				if (!isNull(poRecvIfR.trd_unit_dec_place())) {
					decPlace = poRecvIfR.trd_unit_dec_place();
				}
				else {
					decPlace = getCacheItmUnit(poRecvIfR.itm_cd(), poRecvIfR.itm_sub1(), poRecvIfR.itm_sub2(), poRecvIfR.itm_sub3(), poRecvIfR.trd_unit_cd()).dec_place();
				}
				
				if (poRecvIfR.trd_unit_qty().scale() > decPlace.intValue()) {
					msgL.add(new MCMessage(poRecvIfR, null, MSLAL0012, poRecvIfR.data_no(), poRecvIfR.data_lno(), poRecvIfR.trd_unit_qty(), decPlace));
				}
			}
			return msgL;
		}
		
		/**
		 * IV表記品名の条件付き必須チェック
		 * @param poRecvIfL 発注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkIvItmNm(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			for (PoRecvIf_Chk01_CndR poRecvIfR : poRecvIfL) {
				if (isDel(poRecvIfR)) {
					continue;
				}
				if(poRecvIfR.sundry_itm_flg() && poRecvIfR.sppl_iv_flg()) {
					msgL.addAll(check(poRecvIfR, PoRecvIf_Chk01_CndR.$iv_itm_nm, new FXUCL_RequiredValidater()));
				}
			}
			return msgL;
		}
		
		/**
		 * 版ＮＯの条件付き必須チェック
		 * @param poRecvIfL 発注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkVerNo(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			for (PoRecvIf_Chk01_CndR poRecvIfR : poRecvIfL) {
				if (isDel(poRecvIfR)) {
					continue;
				}
				if(poRecvIfR.ver_flg() ) {
					if (isNull(poRecvIfR.ver_no())) {
						msgL.addAll(check(poRecvIfR, PoRecvIf_Chk01_CndR.$ver_no, new FXUCL_RequiredValidater()));
					}
					else {
						MAM_ITM_VER_R itmVerR = getCacheItmVer(poRecvIfR).getFirst(MAM_ITM_VER_R.$ver_no, poRecvIfR.ver_no());
						if (isNull(itmVerR)) {
							msgL.add(new MCMessage(poRecvIfR, null , MAUAL0051,
									toDispItm(poRecvIfR.itm_cd(), poRecvIfR.itm_sub1(), poRecvIfR.itm_sub2(), poRecvIfR.itm_sub3()),
									poRecvIfR.site_cd(),
									getKeyInfoMsgLabel(poRecvIfR, PoRecvIf_Chk01_CndR.$ver_no)));
						}
					}
				}
				else {
					poRecvIfR.ver_no(null);
				}
			}
			return msgL;
		}

		/**
		 * 外注に関連するチェック
		 * @param poRecvIfL 発注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkOutsrc(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			MCList<PoRecvIf_Chk01_CndR> subL = poRecvIfL.subList(PoRecvIf_Chk01_CndR.$outsrc_flg, true);
			for (PoRecvIf_Chk01_CndR poRecvIfR : subL) {
				if (isDel(poRecvIfR)) {
					continue;
				}
				msgL.addAll(check(poRecvIfR, PoRecvIf_Chk01_CndR.$bom_ptn, new FXUCL_RequiredValidater()));
				// 外注品のＶＭＩ・無償受給での発注はできない
				if (isNonPurc(poRecvIfR)) {
					msgL.add(new MCMessage(poRecvIfR, null , MSLAL0486, poRecvIfR.data_no(), poRecvIfR.data_lno(),
							poRecvIfR.ext_sys_cd(), poRecvIfR.ext_po_no(), poRecvIfR.ext_po_d_no()));
				}
				// 外注品の経費購買はできない
				if (isXpnsPurc(poRecvIfR)) {
					msgL.add(new MCMessage(poRecvIfR, null , MSLAL0487, poRecvIfR.data_no(), poRecvIfR.data_lno(),
							poRecvIfR.ext_sys_cd(), poRecvIfR.ext_po_no(), poRecvIfR.ext_po_d_no()));
				}
			}
			return msgL;
		}
		
		/**
		 * 購買識別区分に関連するチェック
		 * @param poRecvIfL 発注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkPurcIdTyp(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			for (PoRecvIf_Chk01_CndR poRecvIfR : poRecvIfL) {
				if (isDel(poRecvIfR)) {
					continue;
				}
				//無償受給・ＶＭＩ以外の場合必須
				if(!isNonPurc(poRecvIfR)) {
					msgL.addAll(check(poRecvIfR, PoRecvIf_Chk01_CndR.$purc_schd_dt, new FXUCL_RequiredValidater()));
					if (!poRecvIfR.itm_purc_upri_cng_flg() && !poRecvIfR.sppl_purc_upri_cng_flg() && poRecvIfR.upri_not_tgt_flg()) {
						msgL.add(new MCMessage(poRecvIfR, null, MSLAL0506, poRecvIfR.data_no(), poRecvIfR.data_lno()));
					}
					else {
						msgL.addAll(check(poRecvIfR, PoRecvIf_Chk01_CndR.$trd_cur_upri, new FXUCL_RequiredValidater()));
					}
					msgL.addAll(check(poRecvIfR, PoRecvIf_Chk01_CndR.$tax_cd, new FXUCL_RequiredValidater()));
					msgL.addAll(check(poRecvIfR, PoRecvIf_Chk01_CndR.$purc_upri_req_typ, new FXUCL_RequiredValidater()));
					msgL.addAll(check(poRecvIfR, PoRecvIf_Chk01_CndR.$pay_crryovr_times, new FXUCL_RequiredValidater()));
				}
				
				if (poRecvIfR.dscnt_itm_flg() && !MAC_PURC_ID_TYP.isPURC(poRecvIfR.purc_id_typ())) {
					msgL.add(new MCMessage(poRecvIfR, null, MSLAL0488, poRecvIfR.data_no(), poRecvIfR.data_lno(),
							poRecvIfR.ext_sys_cd(), poRecvIfR.ext_po_no(), poRecvIfR.ext_po_d_no()));
				}
				else {
					if (MAC_PURC_ID_TYP.isVMI(poRecvIfR.purc_id_typ())) {
						if (MAC_ASSET_MNG_TYP.isNOT_MNG(poRecvIfR.asset_mng_typ())) {
							// 資産管理しない品目のＶＭＩ発注は不可
							msgL.add(new MCMessage(poRecvIfR, null, MSLAL0489, poRecvIfR.data_no(), poRecvIfR.data_lno(),
									poRecvIfR.ext_sys_cd(), poRecvIfR.ext_po_no(), poRecvIfR.ext_po_d_no()));
						}
						if (!isNull(poRecvIfR.outsrc_sppl_cd())) {
							// VMI品の直送支給は不可
							msgL.add(new MCMessage(poRecvIfR, null, MSLAL0500, poRecvIfR.data_no(), poRecvIfR.data_lno(),
									poRecvIfR.ext_sys_cd(), poRecvIfR.ext_po_no(), poRecvIfR.ext_po_d_no()));
						}
					}
					if (poRecvIfR.arr_skip_flg() && MAC_PURC_ID_TYP.isFFR_RCV(poRecvIfR.purc_id_typ())) {
						msgL.add(new MCMessage(poRecvIfR, null, MSLAL0490, poRecvIfR.data_no(), poRecvIfR.data_lno(),
								poRecvIfR.ext_sys_cd(), poRecvIfR.ext_po_no(), poRecvIfR.ext_po_d_no()));
					}
				}
			}
			return  msgL;
		}
		
		/**
		 * 金額に関連するチェック
		 * @param poRecvIfL 発注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkAmt(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			for (PoRecvIf_Chk01_CndR poRecvIfR : poRecvIfL) {
				if (isDel(poRecvIfR)) {
					continue;
				}
				
				if (!isNull(poRecvIfR.trd_cur_upri()) && poRecvIfR.trd_cur_upri().scale() > poRecvIfR.trd_cur_upri_dec_place().intValue()) {
					msgL.add(new MCMessage(poRecvIfR, null, MSLAL0016, poRecvIfR.data_no(), poRecvIfR.data_lno(), poRecvIfR.trd_cur_upri(), poRecvIfR.trd_cur_upri_dec_place()));
				}
				if (!isNull(poRecvIfR.trd_cur_proc_upri()) && poRecvIfR.trd_cur_proc_upri().scale() > poRecvIfR.trd_cur_upri_dec_place().intValue()) {
					msgL.add(new MCMessage(poRecvIfR, null, MSLAL0504, poRecvIfR.data_no(), poRecvIfR.data_lno(), poRecvIfR.trd_cur_proc_upri(), poRecvIfR.trd_cur_upri_dec_place()));
				}
				if (!isNull(poRecvIfR.trd_cur_onr_prov_upri()) && poRecvIfR.trd_cur_onr_prov_upri().scale() > poRecvIfR.trd_cur_upri_dec_place().intValue()) {
					msgL.add(new MCMessage(poRecvIfR, null, MSLAL0505, poRecvIfR.data_no(), poRecvIfR.data_lno(), poRecvIfR.trd_cur_onr_prov_upri(), poRecvIfR.trd_cur_upri_dec_place()));
				}
				if (!isNull(poRecvIfR.trd_cur_dscnt_amt()) && poRecvIfR.trd_cur_dscnt_amt().scale() > poRecvIfR.trd_cur_amt_dec_place().intValue()) {
					msgL.add(new MCMessage(poRecvIfR, null, MSLAL0508, poRecvIfR.data_no(), poRecvIfR.data_lno(), poRecvIfR.trd_cur_dscnt_amt(), poRecvIfR.trd_cur_upri_dec_place()));
				}
				
				// 単価「0」指定で、値引額が入力されていないか
				msgL.addAll(checkDscntAmt(poRecvIfR, PoRecvIf_Chk01_CndR.$trd_cur_upri, PoRecvIf_Chk01_CndR.$trd_cur_dscnt_amt));
				
				if (!isNonPurc(poRecvIfR)) {
					// 値引額が大きすぎて金額が負の値になってはいけない
					msgL.addAll(check(poRecvIfR, PoRecvIf_Chk01_CndR.$trd_cur_amt, new FXUCL_SmallLargeValidater(null, MCNumber.ZERO, null)));
					msgL.addAll(check(poRecvIfR, PoRecvIf_Chk01_CndR.$trd_cur_dscnt_amt, new FXUCL_PositiveValidater()));
					if(!isNull(poRecvIfR.trd_cur_proc_amt())) {
						msgL.addAll(check(poRecvIfR, PoRecvIf_Chk01_CndR.$trd_cur_proc_amt, new FXUCL_SmallLargeValidater(null, MCNumber.ZERO, null)));
					}
				}
			}
			return  msgL;
		}
		
		/**
		 * 経費購買に関連するチェック
		 * @param poRecvIfL 発注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkXpnsPurc(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			for (PoRecvIf_Chk01_CndR poRecvIfR : poRecvIfL) {
				if (isDel(poRecvIfR)) {
					continue;
				}
				boolean xpnsErrFlg = false; 
				// 経費購買の場合、資産管理しない品目しか登録できない
				if (MAC_TRD_PTN_TYP.isPURC_XPNS(poRecvIfR.trd_ptn_typ()) && MAC_ASSET_MNG_TYP.isMNG(poRecvIfR.asset_mng_typ())) {
					msgL.add(new MCMessage(poRecvIfR, null, MSLAL0491, poRecvIfR.data_no(), poRecvIfR.data_lno(),
							poRecvIfR.ext_sys_cd(), poRecvIfR.ext_po_no(), poRecvIfR.ext_po_d_no(), toDispItm(poRecvIfR.itm_cd(), poRecvIfR.itm_sub1(), poRecvIfR.itm_sub2(), poRecvIfR.itm_sub3())));
					xpnsErrFlg = true;
				}
				// 資産管理する品目に経費理由を設定できない
				if (MAC_ASSET_MNG_TYP.isMNG(poRecvIfR.asset_mng_typ()) && poRecvIfR.xpns_purc_flg()) {
					msgL.add(new MCMessage(poRecvIfR, null, MSLAL0492,poRecvIfR.data_no(), poRecvIfR.data_lno(),
							poRecvIfR.ext_sys_cd(), poRecvIfR.ext_po_no(), poRecvIfR.ext_po_d_no(), toDispItm(poRecvIfR.itm_cd(), poRecvIfR.itm_sub1(), poRecvIfR.itm_sub2(), poRecvIfR.itm_sub3()),
							poRecvIfR.purc_rsn_cd()));
					xpnsErrFlg = true;
				}
				// 資産管理しない品目には経費理由しか設定できない
				if (MAC_ASSET_MNG_TYP.isNOT_MNG(poRecvIfR.asset_mng_typ()) && !poRecvIfR.xpns_purc_flg()) {
					msgL.add(new MCMessage(poRecvIfR, null, MSLAL0493, poRecvIfR.data_no(), poRecvIfR.data_lno(),
							poRecvIfR.ext_sys_cd(), poRecvIfR.ext_po_no(), poRecvIfR.ext_po_d_no(), toDispItm(poRecvIfR.itm_cd(), poRecvIfR.itm_sub1(), poRecvIfR.itm_sub2(), poRecvIfR.itm_sub3()),
							poRecvIfR.purc_rsn_cd()));
					xpnsErrFlg = true;
				}
				
				if (!xpnsErrFlg && isXpnsPurc(poRecvIfR) && !isNonPurc(poRecvIfR)) {
					msgL.addAll(check(poRecvIfR, PoRecvIf_Chk01_CndR.$bd_dpt_cd, new FXUCL_RequiredValidater()));
				}
			}
			return  msgL;
		}
		/**
		 * 日付に関連するチェック
		 * @param poRecvIfL 発注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkDt(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			for (PoRecvIf_Chk01_CndR poRecvIfR : poRecvIfL) {
				if (isDel(poRecvIfR)) {
					continue;
				}
				
				FXUCL_BeforeAfterValidater validator = new FXUCL_BeforeAfterValidater();
				validator.setBefore(poRecvIfR, PoRecvIf_Chk01_CndR.$po_dt);
				msgL.addAll(check(poRecvIfR, new String[] {PoRecvIf_Chk01_CndR.$dlv_rqst_tm}, validator));
				msgL.addAll(check(poRecvIfR, new String[] {PoRecvIf_Chk01_CndR.$purc_schd_dt}, validator));
				
				if (poRecvIfR.subcon_flg() && !isNonPurc(poRecvIfR)) {
					if (!poRecvIfR.dlv_rqst_tm().eqDate(poRecvIfR.purc_schd_dt())) {
						msgL.add(new MCMessage(poRecvIfR, null, MSLAL0494, poRecvIfR.data_no(), poRecvIfR.data_lno(),
								poRecvIfR.ext_sys_cd(), poRecvIfR.ext_po_no(), poRecvIfR.ext_po_d_no()));
					}
				}
			}
			return msgL;
		}
		
		/**
		 * 変更注文書発行予定日チェック
		 * @param poRecvIfL 発注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkUpdPoPrintSchdDt(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			for (PoRecvIf_Chk01_CndR poRecvIfR : poRecvIfL) {
				if (isDel(poRecvIfR)) {
					continue;
				}
				
				if(poRecvIfR.subcon_flg() && poRecvIfR.interim_flg()) {
					msgL.addAll(check(poRecvIfR, PoRecvIf_Chk01_CndR.$upd_po_print_schd_dt, new FXUCL_RequiredValidater()));
				}
				
				if (!isNull(poRecvIfR.upd_po_print_schd_dt())) {
					msgL.addAll(check(poRecvIfR, PoRecvIf_Chk01_CndR.$upd_po_print_schd_dt, new FXUCL_AfterTodayValidater()));
				}
			}
			return msgL;
		}
		
		/** 訂正理由チェック
		 * @param poRecvIfL 発注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkUpdCrctRsn(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			MCList<PoRecvIf_Chk01_CndR>[] upGroupList = poRecvIfL.groupList(getPoRecvIfHdrKey());
			
			for (MCList<PoRecvIf_Chk01_CndR> tmpL : upGroupList) {
				PoRecvIf_Chk01_CndR poRecvIfR = tmpL.get(0);
				String hdrDataCrudTyp = poRecvIfR.hdr_data_crud_typ();
				
				if (MAC_DATA_CRUD_TYP.isUPD(hdrDataCrudTyp) || MAC_DATA_CRUD_TYP.isDEL(hdrDataCrudTyp)) {
					MST_PO_R poR = getCachePo(poRecvIfR.po_no());
					if(poRecvIfR.subcon_flg() && 
							(!isSame(poR.po_rev(), MCNumber.ONE) || poR.po_print_flg() || poR.edi_flg())) {
						msgL.addAll(check(tmpL, PoRecvIf_Chk01_CndR.$crct_rsn_cd, new FXUCL_RequiredValidater()));
					}
				}
				else {
					tmpL.setStringNE(PoRecvIf_Chk01_CndR.$crct_rsn_cd, null);
				}
			}
			return msgL;
		}
		
		/**
		 * 負担項目の各種ＮＯの存在チェックを行います。
		 * @param poRecvIfL 発注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList existBdCheck(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			MCList<PoRecvIf_Chk01_CndR> bdLotChkTgtL = MCList.create(PoRecvIf_Chk01_CndR.class);
			
			MCList<PoRecvIf_Chk01_CndR> bdChkTrgtL = up0().subList(r -> !isDel(r));
			getDataForExistChk(bdChkTrgtL);	
			for (PoRecvIf_Chk01_CndR poRecvIfR : bdChkTrgtL) {
				if (!isNull(poRecvIfR.bd_po_no())) {
					if (!existsPoNo(poRecvIfR.bd_po_no())) {
						msgL.add(new MCMessage(poRecvIfR, PoRecvIf_Chk01_CndR.$bd_po_no, MSLAL0495,poRecvIfR.data_no(), poRecvIfR.data_lno(),
								poRecvIfR.ext_sys_cd(), poRecvIfR.ext_po_no(), poRecvIfR.ext_po_d_no(), poRecvIfR.bd_po_no()));
					}
				}
				if (!isNull(poRecvIfR.bd_slo_no())) {
					if (!existsSloNo(poRecvIfR.bd_slo_no())) {
						msgL.add(new MCMessage(poRecvIfR, PoRecvIf_Chk01_CndR.$bd_slo_no, MSLAL0496,poRecvIfR.data_no(), poRecvIfR.data_lno(),
								poRecvIfR.ext_sys_cd(), poRecvIfR.ext_po_no(), poRecvIfR.ext_po_d_no(), poRecvIfR.bd_slo_no()));
					}
				}
				if (!isNull(poRecvIfR.bd_lot_no()) && !isNull(poRecvIfR.bd_itm_cd())) {
					bdLotChkTgtL.add(poRecvIfR);
				}				
				if (!isNull(poRecvIfR.bd_iv_no())) {
					if (!existsBdIvNo(poRecvIfR.bd_iv_no())) {
						msgL.add(new MCMessage(poRecvIfR, PoRecvIf_Chk01_CndR.$bd_iv_no, MSLAL0497, poRecvIfR.data_no(), poRecvIfR.data_lno(),
								poRecvIfR.ext_sys_cd(), poRecvIfR.ext_po_no(), poRecvIfR.ext_po_d_no(),poRecvIfR.bd_iv_no()));
					}
				}
			}
			callLotServiceChkBdItm(bdLotChkTgtL);
			
			return msgL;
		}
		
		/**
		 * ロット存在チェックサービスを呼出し、負担ロットの存在チェックを行います。
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void callLotServiceChkBdItm(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			if (poRecvIfL.isEmpty()) {
				return;
			}
			MSBFL_LotService.Lot_Chk03 ope = MSBFL_LotService.crtLot_Chk03();
			addAll(ope.up0(), poRecvIfL, createMap_Lot_Chk03_CndR_PoRecvIf_Chk01_CndR());
			ope.exec();
			copyErrFlg(poRecvIfL, ope.up0());
		}
		
		/**
		 * 次処理が行われているかどうかのチェック
		 * @param poRecvIfL 発注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkArr(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			MCList<PoRecvIf_Chk01_CndR>[] upGroupList = poRecvIfL.groupList(getPoRecvIfHdrKey());
			for (MCList<PoRecvIf_Chk01_CndR> grpL : upGroupList) {
				
				PoRecvIf_Chk01_CndR poRecvIfHdrR = grpL.get(0);
				if (MAC_DATA_CRUD_TYP.isCRT(poRecvIfHdrR.hdr_data_crud_typ())) {
					continue;
				}
				
				boolean nextOprFlg = false;
				boolean abortFlg = false;
				
				for (PoRecvIf_Chk01_CndR poRecvIfR : grpL) {
					if (isCrt(poRecvIfR)) {
						continue;
					}
					MST_PO_D_R poDR = getCachePoD(poRecvIfR.po_d_no());
					MST_ARR_PR_R prR = MST_ARR_PR_R.create();
					prR.arr_schd_abort_qty(poDR.getNumberNE(MST_ARR_PR_R.$arr_schd_abort_qty));
					prR.purc_schd_abort_qty(poDR.getNumberNE(MST_ARR_PR_R.$purc_schd_abort_qty));
					prR.rcpt_iv_qty(poDR.getNumberNE(MST_ARR_PR_R.$rcpt_iv_qty));
					prR.purc_qty(poDR.getNumberNE(MST_ARR_PR_R.$purc_qty));
					prR.arr_qty(poDR.getNumberNE(MST_ARR_PR_R.$arr_qty));
					prR.accpt_dfct_qty(poDR.getNumberNE(MST_ARR_PR_R.$accpt_dfct_qty));
					
					if (MSBDL_PurcUtil.chkPoNotUpd(prR, false)) {
						nextOprFlg = true;
					}
					else if ((!isNull(prR.arr_schd_abort_qty())
								&& !isSame(MCNumber.ZERO, prR.arr_schd_abort_qty()))
								|| (!isNull(prR.purc_schd_abort_qty())
									&& !isSame(MCNumber.ZERO, prR.purc_schd_abort_qty()))) {
						abortFlg = true;
					}
				}
				if (nextOprFlg) {
					for (PoRecvIf_Chk01_CndR poRecvIfR : grpL) {
						msgL.add(new MCMessage(poRecvIfR, null, MSLAL0483, poRecvIfR.data_no(), poRecvIfR.data_lno(),
								poRecvIfR.ext_sys_cd(), poRecvIfR.ext_po_no()));
					}
				}
				if (abortFlg) {
					for (PoRecvIf_Chk01_CndR poRecvIfR : grpL) {
						msgL.add(new MCMessage(poRecvIfR, null, MSLAL0507, poRecvIfR.data_no(), poRecvIfR.data_lno(),
								poRecvIfR.ext_sys_cd(), poRecvIfR.ext_po_no()));
					}
				}
			}
			return msgL;
		}
		
		protected MCMessageList chkDtlL(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			MCList<PoRecvIf_Chk01_CndR> tgtList = poRecvIfL.subList(r -> !isDel(r));
			MCList<PoRecvIf_Chk01_CndR>[] upGroupList = tgtList.groupList(getPoRecvIfHdrKey());
			for (MCList<PoRecvIf_Chk01_CndR> tmpL : upGroupList) {
				// 値引品のみの登録は不可
				MCList<PoRecvIf_Chk01_CndR> subL = tmpL.subList(PoRecvIf_Chk01_CndR.$dscnt_itm_flg, true);
				if (isSame(tmpL.size(), subL.size())) {
					// ヘッダ単位のtempLに同じメッセージをセット
					for (PoRecvIf_Chk01_CndR r : tmpL) {
						msgL.add(new MCMessage(r, null, MSLAL0481, r.data_no(), r.data_lno(),
								r.ext_sys_cd(), r.ext_po_no(), r.ext_po_d_no()));
					}
				}
			}
			return msgL;
		}
		
		/**
		 * チェック時に、使われる項目を先に補完する。
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void beforeChkCompl(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			createCache();
			
			setItmDtl(poRecvIfL);
			
			setTrdUnit(poRecvIfL);
			
			setDscntQty(poRecvIfL);
			
			setBaseUnitQty(poRecvIfL);
			
			setSchdDt(poRecvIfL);
			
			setApDpt(poRecvIfL);
			
			setIvItmNm(poRecvIfL);
			
			setTrdCur(poRecvIfL);
			
			setXrate(poRecvIfL);
			
			setVerNo(poRecvIfL);
			
			setSno(poRecvIfL);
			
			setPurcIdTyp(poRecvIfL);
			
			setPurcUpriReqTyp(poRecvIfL);
			
			setPurcUpriReqBaseDt(poRecvIfL);
			
			setTaxCd(poRecvIfL);
			
			setPayCrryovrTimes(poRecvIfL);
			
			setUpriInfo(poRecvIfL);
			
			setWtaxRate(poRecvIfL);
			
			setNonPurcDtl(poRecvIfL);
			
			clearDscnt(poRecvIfL);
			
			clearBdDtl(poRecvIfL);
			
			setAmt(poRecvIfL);
		}
		
		/**
		 * 購買ユーティリティで予定日を計算する
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void setSchdDt(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			MCList<PoRecvIf_Chk01_CndR> tgtList = poRecvIfL.subList(r -> !isDel(r));
			if (tgtList.isEmpty()) {
				return;
			}
			
			MSBDL_PurcUtil.PurcUtil_Srch01 purcUtilSrch01 = MSBDL_PurcUtil.crtPurcUtil_Srch01();
			addAll(purcUtilSrch01.up0(), tgtList, createMap_PurcUtil_Srch01_DtlR_PoRecvIf_Chk01_CndR());
			purcUtilSrch01.exec();
			MCIndexKey idxkey = purcUtilSrch01.down0().createIndex(PurcUtil_Srch01_DtlR.$peg_no);
			for(PoRecvIf_Chk01_CndR r: tgtList) {
				PurcUtil_Srch01_DtlR downR = purcUtilSrch01.down0().getFirst(idxkey, r.peg_no());
				// エラーフラグがオンでもエラーにしない（資産管理対象外品に対応するため）
				r.rqst_avl_rqst_dt(nvl(r.rqst_avl_rqst_dt(), downR.rqst_dlv_rqst_dt()));
				
				if (r.subcon_flg()) {
					r.purc_schd_dt(nvl(r.purc_schd_dt(), r.dlv_rqst_tm().trunc(MCDateFieldType.DAY)));
				}
				else {
					r.purc_schd_dt(nvl(r.purc_schd_dt(), downR.purc_schd_dt()));
				}
				
				// 依頼元納入希望日時は納入希望日時と一致させる
				r.rqst_dlv_rqst_tm(r.dlv_rqst_tm());
			}
		}
		
		/**
		 * 品目詳細マスタの関連項目を設定する
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void setItmDtl(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			for (PoRecvIf_Chk01_CndR poRecvIfR : poRecvIfL) {
				if (isDel(poRecvIfR)) {
					continue;
				}
				MCList<MAM_ITM_DTL_R> itmDtlL = getCacheItmDtl(poRecvIfR);
				itmDtlL.sort(MAM_ITM_DTL_R.$prio, MAM_ITM_DTL_R.$st_dt);
				if (isNull(itmDtlL)) {
					poRecvIfR.maker_cd(nvl(poRecvIfR.maker_cd(), MAC_STR.NULL_VAL.value()));
					poRecvIfR.bom_ptn(nvl(poRecvIfR.bom_ptn(), MAC_STR.NULL_VAL.value()));
					poRecvIfR.mfg_loc_cd(nvl(poRecvIfR.mfg_loc_cd(), MAC_STR.NULL_VAL.value()));
					continue;
				}
				MAM_ITM_DTL_R itmDtlR = itmDtlL.get(0);
				poRecvIfR.mfg_loc_cd(nvl(poRecvIfR.mfg_loc_cd(), itmDtlR.mfg_loc_cd()));
				poRecvIfR.bom_ptn(nvl(poRecvIfR.bom_ptn(), itmDtlR.bom_ptn()));
				if (!isNullOrNullVal(itmDtlR.mfg_loc_cd())) {
					// 外注の場合
					poRecvIfR.maker_cd(nvl(poRecvIfR.maker_cd(), itmDtlR.getStringNE("mfg_loc_maker_cd")));
				}
				else {
					poRecvIfR.maker_cd(nvl(poRecvIfR.maker_cd(), itmDtlR.maker_cd()));
				}
				
				poRecvIfR.maker_cd(nvl(poRecvIfR.maker_cd(), MAC_STR.NULL_VAL.value()));
				
				if (!isNullOrNullStr(poRecvIfR.mfg_loc_cd())) {
					poRecvIfR.outsrc_flg(true);
				}
				else {
					poRecvIfR.outsrc_flg(false);
				}
			}
		}
		
		/**
		 * 債務部門を設定する
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void setApDpt(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			for (PoRecvIf_Chk01_CndR poRecvIfR : poRecvIfL) {
				if(!isNull(poRecvIfR.ap_dpt_cd())) {
					continue;
				}
				else if (!isNull(poRecvIfR.sppl_ap_dpt_cd())) {
					poRecvIfR.ap_dpt_cd(poRecvIfR.sppl_ap_dpt_cd());
				}
				else {
					MAM_DPT_R purcDpt = _cacheDpt.get(poRecvIfR.po_dt(), poRecvIfR.purc_dpt_cd());
					if(purcDpt.ap_dpt_flg()) {
						poRecvIfR.ap_dpt_cd(poRecvIfR.purc_dpt_cd());
					}
				}
			}
		}
		
		/**
		 * 取引単位の関連項目を設定する。
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void setTrdUnit(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			for (PoRecvIf_Chk01_CndR poRecvIfR : poRecvIfL) {
				MAM_ITM_R itmR = getCacheItm(poRecvIfR.itm_cd(), poRecvIfR.itm_sub1(), poRecvIfR.itm_sub2(), poRecvIfR.itm_sub3());
				MST_PO_D_R poDR = getCachePoD(poRecvIfR.po_d_no());
				if (!isNull(itmR)) {
					if (isUpd(poRecvIfR) && !isNull(poDR)&& isSameItm(poRecvIfR, poDR)) {
						poRecvIfR.trd_unit_cd(nvl(poRecvIfR.trd_unit_cd(), poDR.trd_unit_cd()));
					}
					else {
						if (itmR.dscnt_itm_flg()) {
							poRecvIfR.trd_unit_cd(itmR.unit_cd());
						}
						else {
							poRecvIfR.trd_unit_cd(nvl(poRecvIfR.trd_unit_cd(), nvl(itmR.purc_unit_cd(), itmR.unit_cd())));
						}
					}
				}
			}
			
			createCacheItmUnit();
		}
		
		/**
		 * 値引品の関連項目を設定する。
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void setDscntQty(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			for (PoRecvIf_Chk01_CndR poRecvIfR : poRecvIfL) {
				if (poRecvIfR.dscnt_itm_flg()) {
					poRecvIfR.trd_unit_qty(MCNumber.ONE);
					poRecvIfR.trd_unit_cd(poRecvIfR.base_unit_cd());
				}
			}
		}
		
		/**
		 * 基準単位数量を設定する。
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void setBaseUnitQty(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			for (PoRecvIf_Chk01_CndR r : poRecvIfL) {
				MAVM_ITM_UNIT_R itmUnitR = getCacheItmUnit(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.trd_unit_cd());
				r.trd_unit_dec_place(itmUnitR.dec_place());
				r.trd_unit_rnd_typ(itmUnitR.rnd_typ());
				r.trd_unit_conv_base_qty(itmUnitR.conv_base_qty());
				r.trd_unit_conv_qty(itmUnitR.conv_qty());
				r.base_unit_qty(convToBaseUnit(r.trd_unit_qty(), r.trd_unit_conv_base_qty(), r.trd_unit_conv_qty(),
						r.base_unit_dec_place(), r.base_unit_rnd_typ()));
			}
		}
		
		/**
		 * Ｉ／Ｖ表記品名を設定する。
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void setIvItmNm(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			for (PoRecvIf_Chk01_CndR poRecvIfR : poRecvIfL) {
				if (isDel(poRecvIfR)) {
					continue;
				}
				MAM_ITM_LCL_R itmLclR = getCacheItmLcl(poRecvIfR);
				if (poRecvIfR.sundry_itm_flg() && poRecvIfR.sppl_iv_flg()) {
					String ivItmNm = null;
					if (!isNull(poRecvIfR.iv_itm_nm())) {
						ivItmNm = poRecvIfR.iv_itm_nm();
					}
					else if (!isNull(itmLclR.itm_nm())) {
						ivItmNm = itmLclR.itm_nm();
					}
					else {
						MAM_ITM_R itmR = getCacheItm(poRecvIfR.itm_cd(), poRecvIfR.itm_sub1(), poRecvIfR.itm_sub2(), poRecvIfR.itm_sub3());
						ivItmNm = itmR.itm_nm();
					}
					poRecvIfR.iv_itm_nm(ivItmNm);
				}
				else {
					poRecvIfR.iv_itm_nm(null);
				}
			}
		}
		
		/**
		 * 取引通貨の関連項目を補完する。
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void setTrdCur(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			for (PoRecvIf_Chk01_CndR poRecvIfR : poRecvIfL) {
				if (isNull(poRecvIfR.trd_cur_cd())) {
					poRecvIfR.trd_cur_cd(poRecvIfR.sppl_trd_cur_cd());
					poRecvIfR.trd_cur_upri_dec_place(poRecvIfR.sppl_upri_dec_place());
					poRecvIfR.trd_cur_amt_dec_place(poRecvIfR.sppl_amt_dec_place());
				}
			}
		}
		
		/**
		 * 版ＮＯを補完する
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void setVerNo(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			for (PoRecvIf_Chk01_CndR poRecvIfR : poRecvIfL) {
				if (poRecvIfR.ver_flg()) {
					if (isCrt(poRecvIfR) || isUpd(poRecvIfR)) {
						if (isNull(poRecvIfR.ver_no())) {
							MCList<MAM_ITM_VER_R> itmVerL = getCacheItmVer(poRecvIfR);
							if (isNull(itmVerL)) {
								continue;
							}
							itmVerL.sort(mcframe.commonCore.container.MCList.SortType.DESC, MAM_ITM_VER_R.$purc_st_dt);
							
							for (MAM_ITM_VER_R itmVerR : itmVerL) {
								if (poRecvIfR.rqst_avl_rqst_dt().gte(itmVerR.purc_st_dt())) {
									poRecvIfR.ver_no(itmVerR.ver_no());
									break;
								}
							}
						}
					}
				}
			}
		}
		
		/**
		 * 手配ＮＯの関連項目を補完する
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void setSno(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			for (PoRecvIf_Chk01_CndR poRecvIfR : poRecvIfL) {
				// 手配ＮＯ１
				if (MAC_SNO_MNG_TYP.isNOT_MNG(poRecvIfR.sno1_mng_typ())) {
					poRecvIfR.sno1(MAC_STR.NULL_VAL.value());
				}
				else if (MAC_SNO_MNG_TYP.isMNG_REQ(poRecvIfR.sno1_mng_typ())) {
					poRecvIfR.sno1(nullValToNull(poRecvIfR.sno1()));
				}
				// 手配ＮＯ２
				if (MAC_SNO_MNG_TYP.isNOT_MNG(poRecvIfR.sno2_mng_typ())) {
					poRecvIfR.sno2(MAC_STR.NULL_VAL.value());
				}
				else if (MAC_SNO_MNG_TYP.isMNG_REQ(poRecvIfR.sno2_mng_typ())) {
					poRecvIfR.sno2(nullValToNull(poRecvIfR.sno2()));
				}
				// 手配ＮＯ３
				if (MAC_SNO_MNG_TYP.isNOT_MNG(poRecvIfR.sno3_mng_typ())) {
					poRecvIfR.sno3(MAC_STR.NULL_VAL.value());
				}
				else if (MAC_SNO_MNG_TYP.isMNG_REQ(poRecvIfR.sno3_mng_typ())) {
					poRecvIfR.sno3(nullValToNull(poRecvIfR.sno3()));
				}
				// 手配ＮＯ４
				if (MAC_SNO_MNG_TYP.isNOT_MNG(poRecvIfR.sno4_mng_typ())) {
					poRecvIfR.sno4(MAC_STR.NULL_VAL.value());
				}
				else if (MAC_SNO_MNG_TYP.isMNG_REQ(poRecvIfR.sno4_mng_typ())) {
					poRecvIfR.sno4(nullValToNull(poRecvIfR.sno4()));
				}
			}
		}
		
		/**
		 * 購買識別区分を補完する
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void setPurcIdTyp(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			
			for (PoRecvIf_Chk01_CndR poRecvIfR : poRecvIfL) {
				if (isCrt(poRecvIfR) || isUpd(poRecvIfR)) {
					if (!isNull(poRecvIfR.purc_id_typ())) {
						continue;
					}
					
					if (MAC_STK_MNG_TYP.isNOT_MNG(poRecvIfR.stk_mng_typ())) {
						// 値引品目も含め、在庫管理しない品目は通常購買
						poRecvIfR.purc_id_typ(MAC_PURC_ID_TYP.PURC.value());
						continue;
					}
					
					if (!poRecvIfR.outsrc_flg()) {
						MAM_ITM_DTL_R itmDtlR = getCacheItmDtl(poRecvIfR.itm_cd(), poRecvIfR.itm_sub1(),
								poRecvIfR.itm_sub2(), poRecvIfR.itm_sub3(), poRecvIfR.in_to_loc_wg_cd(),
								poRecvIfR.sppl_cd(), poRecvIfR.maker_cd(), MAC_STR.NULL_VAL.value(),
								MAC_STR.NULL_VAL.value(), poRecvIfR.po_dt());
						poRecvIfR.purc_id_typ(itmDtlR.purc_id_typ());
					}
					else {
						MAM_ITM_DTL_R itmDtlR = getCacheItmDtl(poRecvIfR.itm_cd(), poRecvIfR.itm_sub1(),
								poRecvIfR.itm_sub2(), poRecvIfR.itm_sub3(), poRecvIfR.in_to_loc_wg_cd(),
								MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(), poRecvIfR.mfg_loc_cd(),
								poRecvIfR.bom_ptn(), poRecvIfR.po_dt());
						poRecvIfR.purc_id_typ(itmDtlR.purc_id_typ());
					}
					
					if (isNull(poRecvIfR.purc_id_typ())) {
						// 品目詳細マスタが設定されていない場合は通常購買とする
						poRecvIfR.purc_id_typ(MAC_PURC_ID_TYP.PURC.value());
					}
				}
			}
		}
		
		/**
		 * 購買単価取得区分を補完する
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		
		protected void setPurcUpriReqTyp(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			for (PoRecvIf_Chk01_CndR poRecvIfR : poRecvIfL) {
				if (isNonPurc(poRecvIfR)) {
					poRecvIfR.purc_upri_req_typ(null);
				}
				else {
					MST_PO_D_R poDR = getCachePoD(poRecvIfR.po_d_no());
					if (isUpd(poRecvIfR) && !isNull(poDR) && isSameItm(poRecvIfR, poDR)) {
						poRecvIfR.purc_upri_req_typ(nvl(poRecvIfR.purc_upri_req_typ(), poDR.purc_upri_req_typ()));
					}
					if (isCrt(poRecvIfR)) {
						if (isNull(poRecvIfR.purc_upri_req_typ())){
							poRecvIfR.purc_upri_req_typ(nvl(poRecvIfR.sppl_purc_upri_req_typ(), getCo().purc_upri_req_typ()));
						}
					}
				}
			}
		}
		
		/**
		 * 購買単価取得基準日の取得
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void setPurcUpriReqBaseDt(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			for (PoRecvIf_Chk01_CndR poRecvIfR : poRecvIfL) {
				if (MAC_PURC_UPRI_REQ_TYP.isPO_DT(poRecvIfR.purc_upri_req_typ())) {
					poRecvIfR.purc_upri_req_base_dt(poRecvIfR.po_dt());
				}
				else if (MAC_PURC_UPRI_REQ_TYP.isSCHD_DLV_DT(poRecvIfR.purc_upri_req_typ())) {
					poRecvIfR.purc_upri_req_base_dt(poRecvIfR.dlv_rqst_tm().trunc(MCDateFieldType.DAY));
				}
				else if (MAC_PURC_UPRI_REQ_TYP.isSCHD_PURC_DT(poRecvIfR.purc_upri_req_typ())) {
					poRecvIfR.purc_upri_req_base_dt(poRecvIfR.purc_schd_dt());
				}
			}
		}
		
		/**
		 * 税の設定
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void setTaxCd(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			MCList<PoRecvIf_Chk01_CndR> taxL = MCList.create(PoRecvIf_Chk01_CndR.class);
			for (PoRecvIf_Chk01_CndR poRecvIfR : poRecvIfL) {
				
				if(!poRecvIfR.tax_fix_flg() && !isNonPurc(poRecvIfR)) {
					taxL.add(poRecvIfR);
				}
			}
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_TAX$F_GET_PURC_TAX_CD", "01"),
					MABCFunction.getFunctionExecuter("MAPA_TAX$F_GET_PURC_TAX_CD"),
					PoRecvIf_Chk01_CndR.$tax_cd, taxL, PoRecvIf_Chk01_CndR.$itm_cd,
					PoRecvIf_Chk01_CndR.$itm_sub1, PoRecvIf_Chk01_CndR.$itm_sub2,
					PoRecvIf_Chk01_CndR.$itm_sub3, PoRecvIf_Chk01_CndR.$sppl_cd,
					PoRecvIf_Chk01_CndR.$purc_upri_req_base_dt);
			
			createCacheTax();
			for (PoRecvIf_Chk01_CndR poRecvIfR : poRecvIfL) {
				MAM_TAX_R taxR = _cacheTax.get(poRecvIfR.tax_cd());
				if (!isNull(taxR)) {
					poRecvIfR.tax_typ(taxR.tax_typ());
					poRecvIfR.tax_rate(taxR.tax_rate());
					poRecvIfR.inc_tax_flg(taxR.inc_tax_flg());
				}
			}
		}
		
		/**
		 * 支払繰越回数を補完する。
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void setPayCrryovrTimes(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			for (PoRecvIf_Chk01_CndR poRecvIfR : poRecvIfL) {
				if (!isNonPurc(poRecvIfR)) {
					MST_PO_D_R poDR = getCachePoD(poRecvIfR.po_d_no());
					if (isUpd(poRecvIfR) && !isNull(poDR) && isSameItm(poRecvIfR, poDR)) {
						poRecvIfR.pay_crryovr_times(nvl(poRecvIfR.pay_crryovr_times(), poDR.pay_crryovr_times()));
					}
					if (isCrt(poRecvIfR)) {
						if (isNull(poRecvIfR.pay_crryovr_times())) {
							if (isNull(poRecvIfR.itm_pay_crryovr_times())) {
								poRecvIfR.pay_crryovr_times(poRecvIfR.sppl_pay_crryovr_times());
							}
							else {
								poRecvIfR.pay_crryovr_times(poRecvIfR.itm_pay_crryovr_times());
							}
						}
					}
				}
			}
		}
		
		/**
		 * 単価情報の取得
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void setUpriInfo(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			for (PoRecvIf_Chk01_CndR r : poRecvIfL) {
				if (!r.upri_not_tgt_flg()) {
					r.trd_cur_upri(null);
					r.trd_cur_proc_upri(null);
					r.trd_cur_onr_prov_upri(null);
				}
				if (!r.outsrc_flg()) {
					r.trd_cur_proc_upri(null);
					r.trd_cur_onr_prov_upri(null);
				}
				if(MAC_OUTSRC_UPRI_TYP.isPROC(r.outsrc_upri_typ())) {
					r.trd_cur_onr_prov_upri(MCNumber.ZERO);
				}
				if (isNull(r.trd_cur_dscnt_amt())) {
					r.dscnt_rsn_cd(null);
				}
			}
			
			MSBDL_PurcUtil.PurcUtil_Srch02 purcUtilSrch02 = MSBDL_PurcUtil.crtPurcUtil_Srch02();
			Map_PurcUtil_Srch02_DtlR_PoRecvIf_Chk01_CndR<PurcUtil_Srch02_DtlR, PoRecvIf_Chk01_CndR> mpr = createMap_PurcUtil_Srch02_DtlR_PoRecvIf_Chk01_CndR();
			
			MCList<PoRecvIf_Chk01_CndR> tgtList = poRecvIfL.subList(new MCRowMatcher<PoRecvIf_Chk01_CndR>() {
				@Override
				public boolean match(PoRecvIf_Chk01_CndR poRecvIfR) {
					if (isDel(poRecvIfR)) {
						return false;
					}
					if (isNonPurc(poRecvIfR)) {
						return false;
					}
					if (poRecvIfR.upri_not_tgt_flg()) {
						return false;
					}
					return true;
				}
			});
			
			MCList<PoRecvIf_Chk01_CndR>[] upGroupList = tgtList.groupList(getPoRecvIfHdrKey());
			
			int grpNo = 1;
			for (MCList<PoRecvIf_Chk01_CndR> list : upGroupList) {
				MCList<PurcUtil_Srch02_DtlR> tmpL = MCList.create(PurcUtil_Srch02_DtlR.class);
				addAll(tmpL, list, mpr);
				tmpL.setStringNE(PurcUtil_Srch02_DtlR.$grp_no, String.valueOf(grpNo++));
				purcUtilSrch02.up0().addAll(tmpL);
			}
			if (purcUtilSrch02.up0().size() > 0) {
				purcUtilSrch02.exec();
				String[] destCols = {PoRecvIf_Chk01_CndR.$trd_cur_upri, PoRecvIf_Chk01_CndR.$trd_cur_proc_upri, PoRecvIf_Chk01_CndR.$trd_cur_onr_prov_upri, PoRecvIf_Chk01_CndR.$interim_flg};
				String[] srcCols = {PurcUtil_Srch02_DtlR.$trd_cur_upri, PurcUtil_Srch02_DtlR.$trd_cur_proc_upri, PurcUtil_Srch02_DtlR.$trd_cur_onr_prov_upri, PurcUtil_Srch02_DtlR.$interim_flg};
				copyByPegNo(up0(), destCols, purcUtilSrch02.down0(), srcCols);
			}
		}
		
		/**
		 * 同一取込グループにエラーのないリストを返す
		 * @return エラーのないリスト
		 */
		protected MCList<PoRecvIf_Chk01_CndR> getNotErrL() {
			if (hasErrFlgOn(up0())) {
				MCList<PoRecvIf_Chk01_CndR> notErrL = up0().createInstance();
				for (MCList<PoRecvIf_Chk01_CndR> list : up0().groupList(getPoRecvIfHdrKey())) {
					if (!hasErrFlgOn(list)) {
						notErrL.addAll(list);
					}
				}
				return notErrL;
			}
			else {
				return up0();
			}
		}

		/**
		 * 源泉税率を取得する。
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void getWtaxRate(MCList<PoRecvIf_Chk01_CndR> poRecvIfL){
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_TAX$F_GET_WTAX_RATE", "01"),
					MABCFunction.getFunctionExecuter("MAPA_TAX$F_GET_WTAX_RATE"),
					PoRecvIf_Chk01_CndR.$wtax_rate, poRecvIfL,
					PoRecvIf_Chk01_CndR.$itm_cd, PoRecvIf_Chk01_CndR.$itm_sub1,
					PoRecvIf_Chk01_CndR.$itm_sub2, PoRecvIf_Chk01_CndR.$itm_sub3,
					PoRecvIf_Chk01_CndR.$purc_upri_req_base_dt);
		}

		/**
		 * キャッシュ取得（品目マスタ（ロケール別情報））
		 * @param poRecvIfR 発注受信ＩＦ
		 * @return　品目マスタ（ロケール別情報）
		 */
		protected MAM_ITM_LCL_R getCacheItmLcl(PoRecvIf_Chk01_CndR poRecvIfR) {
			return _cacheItmLcl.get(poRecvIfR.itm_cd(), poRecvIfR.itm_sub1(), poRecvIfR.itm_sub2(),
					poRecvIfR.itm_sub3(), poRecvIfR.prnt_lcl_cd());
		}
		
		/**
		 * 発注受信ＩＦの補完を行う。
		 */
		protected void compl() {
			complHdr();
			complDtl();
		}
		
		/**
		 * 発注受信ＩＦのヘッダ項目の補完を行う。
		 */
		protected void complHdr() {
			for (PoRecvIf_Chk01_CndR poRecvIfHdrR : getNotErrL()) {
				
				MST_PO_R poR = getCachePo(poRecvIfHdrR.po_no());
				
				setPrntDlvFlg(poRecvIfHdrR);
				
				setPoPrint(poRecvIfHdrR);
				
				setEdiFlg(poRecvIfHdrR, poR);
				
				if (MAC_DATA_CRUD_TYP.isDEL(poRecvIfHdrR.hdr_data_crud_typ())) {
					continue;
				}
				
				setTtermCd(poRecvIfHdrR, poR);
			}
		}
		
		/**
		 * 発注受信ＩＦの明細項目の補完を行う。
		 */
		protected void complDtl() {
			for (PoRecvIf_Chk01_CndR poRecvIfR : getNotErrL()) {
				if (isDel(poRecvIfR)) {
					continue;
				}
				
				MST_PO_R poR = getCachePo(poRecvIfR.po_no());
				
				setItmNm(poRecvIfR);
				
				setSpplItm(poRecvIfR,poR);
				
				setDrctDlvTyp(poRecvIfR);
				
				setPriPrntFlg(poRecvIfR);

				setPurcBasisTyp(poRecvIfR);
				
				setSyncFlg(poRecvIfR);
				
				clearPoConfRcptDt(poRecvIfR);
			}
		}
		
		/**
		 * 金額計算
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void setAmt(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			for (PoRecvIf_Chk01_CndR poRecvIfR : poRecvIfL) {
				if(!isNonPurc(poRecvIfR)) {
					// 取引通貨金額の計算
					MSBDL_PurcUtil.setTrdCurInfo(poRecvIfR);
					if(!isNullOrNullVal(poRecvIfR.mfg_loc_cd())) {
						poRecvIfR.trd_cur_proc_upri(nvl(poRecvIfR.trd_cur_proc_upri(), MCNumber.ZERO));
						poRecvIfR.trd_cur_onr_prov_upri(nvl(poRecvIfR.trd_cur_onr_prov_upri(), MCNumber.ZERO));
						poRecvIfR.trd_cur_proc_amt(nvl(poRecvIfR.trd_cur_proc_amt(), MCNumber.ZERO));
						poRecvIfR.trd_cur_onr_prov_amt(nvl(poRecvIfR.trd_cur_onr_prov_amt(), MCNumber.ZERO));
						MAM_BP_R spplR = _cacheBp.get(poRecvIfR.sppl_cd());
						// 買戻し義務がオンの場合、加工金額を元に税額を再計算する
						if(spplR.repurc_obli_flg()) {
							MCNumber amt = MAUCL_AmtUtil.getAmt(poRecvIfR.trd_cur_upri(),
									poRecvIfR.trd_unit_qty(),
									poRecvIfR.trd_cur_amt_dec_place(),
									poRecvIfR.purc_amt_rnd_typ(),
									poRecvIfR.trd_cur_dscnt_amt());
							if(poRecvIfR.inc_tax_flg()) {
								// 内税の場合、有償支給単価を税額に含めないために、一旦加工単価×数量で導出し、後続処理で税額を差し引く
								MCNumber proc_inc_tax_amt = MAUCL_AmtUtil.getAmt(poRecvIfR.trd_cur_proc_upri(),
										poRecvIfR.trd_unit_qty(),
										poRecvIfR.trd_cur_amt_dec_place(),
										poRecvIfR.purc_amt_rnd_typ(),
										poRecvIfR.trd_cur_dscnt_amt());
								poRecvIfR.trd_cur_proc_amt(proc_inc_tax_amt);
								// 有償支給金額は金額-加工金額
								poRecvIfR.trd_cur_onr_prov_amt(!isNull(amt) ? amt.subtract(proc_inc_tax_amt) : null);
							}
							MCNumber trdCurTaxAmt = MAUCL_AmtUtil.getTaxAmt(
									poRecvIfR.trd_cur_proc_amt(),
									poRecvIfR.tax_rate(),
									poRecvIfR.trd_cur_amt_dec_place(),
									poRecvIfR.purc_tax_rnd_typ(),
									poRecvIfR.inc_tax_flg()
									);
							poRecvIfR.trd_cur_tax_amt(trdCurTaxAmt);
							if(poRecvIfR.inc_tax_flg()) {
								amt = (amt != null) ? amt.subtract(trdCurTaxAmt) : null;
								MCNumber proc_amt = !isNull(poRecvIfR.trd_cur_proc_amt()) ? poRecvIfR.trd_cur_proc_amt().subtract(trdCurTaxAmt) : MCNumber.ZERO;
								poRecvIfR.trd_cur_amt(amt);
								poRecvIfR.trd_cur_proc_amt(proc_amt);
							}
						}
					}
					
					// 源泉税額の計算
					if (!isNull(poRecvIfR.wtax_rate())) {
						MSBDL_PurcUtil.setWtaxInfo(poRecvIfR);
					}
				}
			}
		}
		
		/**
		 * 案件ＮＯチェック
		 * @param poRecvIfL 発注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkWrkNo(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			
			MCList<PoRecvIf_Chk01_CndR>[] upGroupList = poRecvIfL.groupList(getPoRecvIfHdrKey());
			for (MCList<PoRecvIf_Chk01_CndR> grpL : upGroupList) {
				PoRecvIf_Chk01_CndR poRecvIfHdrR = grpL.get(0);
				if (MAC_DATA_CRUD_TYP.isDEL(poRecvIfHdrR.hdr_data_crud_typ())) {
					continue;
				}
				
				// 補完
				MCList<PoRecvIf_Chk01_CndR> subL = grpL.subList(r -> !isDel(r));
				for (PoRecvIf_Chk01_CndR poRecvIfR : subL) {
					MST_WRK_SNO_R wrkSnoR = _cacheWrkSno.getFirst(_idxWrkSno, poRecvIfR.sno1());
					if (!isNull(wrkSnoR)) {
						poRecvIfR.wrk_no(wrkSnoR.wrk_no());
					}
				}
				
				if (MAC_DATA_CRUD_TYP.isCRT(poRecvIfHdrR.hdr_data_crud_typ())) {
					// 同一伝票内で別々の案件が指定されていたり、案件ＮＯがnullの行とnot nullの行が混合している場合は登録不可
					if(subL.groupBy(PoRecvIf_Chk01_CndR.$wrk_no).size() > 1) {
						for (PoRecvIf_Chk01_CndR wrkNoErrR : subL) {
							String wrkNm = null;
							MST_WRK_R wrkR = _cacheWrk.getFirst(_idxWrk, wrkNoErrR.wrk_no());
							if (!isNull(wrkR)) {
								wrkNm = wrkR.wrk_nm();
							}
							msgL.add(new MCMessage(wrkNoErrR, null, MSLAL0502
									, wrkNoErrR.data_no(), wrkNoErrR.data_lno(), wrkNoErrR.ext_sys_cd()
									, wrkNoErrR.ext_po_no(), wrkNoErrR.ext_po_d_no()
									, wrkNoErrR.sno1(), wrkNoErrR.wrk_no(), wrkNm));
						}
					}
				}
				else {
					String poWrkNo = null;
					MST_PO_R poR = _cachePo.getFirst(_idxExtPoNoKey, poRecvIfHdrR.ext_sys_cd(), poRecvIfHdrR.ext_po_no());
					if (!isNull(poR)) {
						poWrkNo = poR.wrk_no();
					}
					
					for (PoRecvIf_Chk01_CndR poRecvIfR : subL) {
						if (!isSame(poWrkNo, poRecvIfR.wrk_no())) {
							String wrkNm = null;
							MST_WRK_R wrkR = _cacheWrk.getFirst(_idxWrk, poRecvIfR.wrk_no());
							if (!isNull(wrkR)) {
								wrkNm = wrkR.wrk_nm();
							}
							String poWrkNm = _cacheWrk.getFirst(_idxWrk, poWrkNo).wrk_nm();
							msgL.add(new MCMessage(poRecvIfR, null, MSLAL0503
									, poRecvIfR.data_no(), poRecvIfR.data_lno(), poRecvIfR.ext_sys_cd()
									, poRecvIfR.ext_po_no(), poRecvIfR.ext_po_d_no()
									, poRecvIfR.sno1(), poRecvIfR.wrk_no(), wrkNm
									, poWrkNo, poWrkNm));
						}
					}
				}
			}
			return msgL;
		}
		
		/**
		 * 納品書発行フラグを設定する。
		 * @param poRecvIfHdrR 発注受信ＩＦ
		 */
		protected void setPrntDlvFlg(PoRecvIf_Chk01_CndR poRecvIfHdrR) {
			if (MAC_DATA_CRUD_TYP.isDEL(poRecvIfHdrR.hdr_data_crud_typ())
					|| isNull(poRecvIfHdrR.sppl_ship_form_cd())) {
				poRecvIfHdrR.prnt_dlv_flg(false);
			}
		}
		
		/**
		 * 注文書に関連する項目を設定する。
		 * @param poRecvIfHdrR 発注受信ＩＦ
		 */
		protected void setPoPrint(PoRecvIf_Chk01_CndR poRecvIfHdrR) {
			String poPrintCd = null;
			if (!isNull(poRecvIfHdrR.po_print_cd())) {
				poPrintCd = poRecvIfHdrR.po_print_cd();
			}
			else if (!isNull(poRecvIfHdrR.sppl_po_print_cd())) {
				poPrintCd = poRecvIfHdrR.sppl_po_print_cd();
			}
			else {
				poPrintCd = getCo().po_print_cd();
			}
			poRecvIfHdrR.po_print_cd(poPrintCd);
		}
		
		/**
		 * ＥＤＩフラグを設定する。
		 * @param poRecvIfHdrR 発注受信ＩＦ
		 * @param poR 発注明細
		 */
		protected void setEdiFlg(PoRecvIf_Chk01_CndR poRecvIfHdrR, MST_PO_R poR) {
			String spplCd = null;
			if (isUpd(poRecvIfHdrR) && !isNull(poR) && isSame(poRecvIfHdrR.sppl_cd(),poR.sppl_cd())){
				spplCd = poR.sppl_cd();
			}
			else {
				spplCd = poRecvIfHdrR.sppl_cd();
			}
			MAM_EDI_IF_CTL_R ediIfR = _cacheEdiIfCtl.get(poRecvIfHdrR.po_dt(), spplCd, MAC_IF_PROC_TYP.PO_SEND.value());
			if (!ediIfR.isEmpty()) {
				poRecvIfHdrR.edi_flg(true);
			}
		}
		
		/**
		 * 為替に関連する項目を設定する。
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void setXrate(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			for (PoRecvIf_Chk01_CndR poRecvIfR : poRecvIfL) {
				if (isSame(poRecvIfR.trd_cur_cd(), getCo().base_cur_cd())) {
					poRecvIfR.xrate_inpt_flg(false);
					poRecvIfR.xrate(MCNumber.ONE);
				}
				else if (!poRecvIfR.xrate_inpt_flg()) {
					try {
						poRecvIfR.xrate(MAUCL_AmtUtil.getDefXrate(poRecvIfR.trd_cur_cd(), getCo().base_cur_cd(), getCo().purc_xrate_cd(), poRecvIfR.po_dt()));
					} catch (MCAppException e) {
						MCMessage msg = e.getMCMessage();
						msg.setCauseRow(poRecvIfR, null);
						MCMessagePool.add(msg);
						poRecvIfR.err_flg(true);
					}
				}
				
				//納税通貨ＣＤが設定されていない場合は納税為替レートをクリアする
				if (isNull(getCo().ptax_cur_cd())) {
					poRecvIfR.ptax_xrate_inpt_flg(false);
					poRecvIfR.ptax_xrate(null);
				}
				else if (isSame(poRecvIfR.trd_cur_cd(), getCo().ptax_cur_cd())) {
					poRecvIfR.ptax_xrate_inpt_flg(false);
					poRecvIfR.ptax_xrate(MCNumber.ONE);
				}
				else if (!poRecvIfR.ptax_xrate_inpt_flg()) {
					try {
						poRecvIfR.ptax_xrate(MAUCL_AmtUtil.getDefXrate(poRecvIfR.trd_cur_cd(), getCo().ptax_cur_cd(), getCo().purc_xrate_cd(), poRecvIfR.po_dt()));
					} catch (MCAppException e) {
						MCMessage msg = e.getMCMessage();
						msg.setCauseRow(poRecvIfR, null);
						MCMessagePool.add(msg);
						poRecvIfR.err_flg(true);
					}
				}
			}
		}
		
		/**
		 * 取引条件を設定する。
		 * @param poRecvIfHdrR 発注受信ＩＦ
		 * @param poR 発注ヘッダ
		 */
		protected void setTtermCd(PoRecvIf_Chk01_CndR poRecvIfHdrR, MST_PO_R poR) {
			if (isUpd(poRecvIfHdrR) && !isNull(poR) && isSame(poRecvIfHdrR.sppl_cd(),poR.sppl_cd())){
				poRecvIfHdrR.tterm_cd1(nvl(poRecvIfHdrR.tterm_cd1(), poR.tterm_cd1()));
				poRecvIfHdrR.tterm_cd2(nvl(poRecvIfHdrR.tterm_cd2(), poR.tterm_cd2()));
				poRecvIfHdrR.tterm_cd3(nvl(poRecvIfHdrR.tterm_cd3(), poR.tterm_cd3()));
			}
			else {
				poRecvIfHdrR.tterm_cd1(nvl(poRecvIfHdrR.tterm_cd1(), poRecvIfHdrR.sppl_tterm_cd1()));
				poRecvIfHdrR.tterm_cd2(nvl(poRecvIfHdrR.tterm_cd2(), poRecvIfHdrR.sppl_tterm_cd2()));
				poRecvIfHdrR.tterm_cd3(nvl(poRecvIfHdrR.tterm_cd3(), poRecvIfHdrR.sppl_tterm_cd3()));
			}
		}
		
		/**
		 * 品名を設定する。
		 * @param poRecvIfHdrR 発注受信ＩＦ
		 */
		protected void setItmNm(PoRecvIf_Chk01_CndR poRecvIfR) {
			if (!poRecvIfR.sundry_itm_flg()) {
				poRecvIfR.itm_nm(null);
			}
			else {
				poRecvIfR.itm_nm(nvl(poRecvIfR.itm_nm(),poRecvIfR.mst_itm_nm()));
			}
		}
		
		/**
		 * 発注先品目を設定する。
		 * @param poRecvIfHdrR 発注受信ＩＦ
		 * @param poR 発注ヘッダ
		 */
		protected void setSpplItm(PoRecvIf_Chk01_CndR poRecvIfR, MST_PO_R poR) {
			if (isCrt(poRecvIfR) || isUpd(poRecvIfR) ){
				MAM_BP_ITM_R bpItmR = getCacheBpItm(poRecvIfR.po_dt(), poRecvIfR.sppl_cd()
						, poRecvIfR.itm_cd(), poRecvIfR.itm_sub1(), poRecvIfR.itm_sub2(), poRecvIfR.itm_sub3());
				poRecvIfR.sppl_itm_cd(nvl(poRecvIfR.sppl_itm_cd(),bpItmR.bp_itm_cd()));
				poRecvIfR.sppl_itm_nm(nvl(poRecvIfR.sppl_itm_nm(),bpItmR.bp_itm_nm()));
			}
		}
		
		/**
		 * 直納区分を設定する。
		 * @param poRecvIfR 発注受信ＩＦ
		 */
		protected void setDrctDlvTyp(PoRecvIf_Chk01_CndR poRecvIfR) {
			if (isNull(poRecvIfR.outsrc_sppl_cd())) {
				poRecvIfR.drct_dlv_typ(MSC_DRCT_DLV_TYP.VIA.value());
			}
			else {
				poRecvIfR.drct_dlv_typ(MSC_DRCT_DLV_TYP.DDLV.value());
			}
		}
		
		/**
		 * 価格印字ＦＬＧを設定する。
		 * @param poRecvIfR 発注受信ＩＦ
		 */
		protected void setPriPrntFlg(PoRecvIf_Chk01_CndR poRecvIfR) {
			if (isNull(poRecvIfR.sppl_ship_form_cd())) {
				poRecvIfR.pri_print_flg(false);
			}
		}
		
		/**
		 * 源泉税率を設定する。
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void setWtaxRate(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			MCList<PoRecvIf_Chk01_CndR> trgtL = MCList.create(PoRecvIf_Chk01_CndR.class);
			for (PoRecvIf_Chk01_CndR poRecvIfR : poRecvIfL) {
				if (isSame(poRecvIfR.trd_cur_cd(), getCo().base_cur_cd()) 
						&& (isSame(poRecvIfR.trd_cur_cd(), getCo().ptax_cur_cd()) || isNull(getCo().ptax_cur_cd()))) {
					// 取引通貨＝基準通貨＝納税通貨、または「取引通貨＝基準通貨かつ納税通貨が未設定の場合のみ設定する
					if (isNull(poRecvIfR.wtax_rate())) {
						trgtL.add(poRecvIfR);
					}
				}
				else {
					poRecvIfR.wtax_rate(null);
				}
			}
			getWtaxRate(trgtL);
		}

		/**
		 * 仕入計上区分の設定
		 * @param poRecvIfR 発注受信ＩＦ
		 */
		protected void setPurcBasisTyp(PoRecvIf_Chk01_CndR poRecvIfR) {
			MAM_ITM_DTL_R itmDtlR = null;
			if (!poRecvIfR.outsrc_flg()) {
				itmDtlR = getCacheItmDtl(poRecvIfR.itm_cd(), poRecvIfR.itm_sub1(),
						poRecvIfR.itm_sub2(), poRecvIfR.itm_sub3(),
						poRecvIfR.in_to_loc_wg_cd(), poRecvIfR.sppl_cd(),
						poRecvIfR.maker_cd(), MAC_STR.NULL_VAL.value(),
						MAC_STR.NULL_VAL.value(), poRecvIfR.po_dt());
			}
			else {
				itmDtlR = getCacheItmDtl(poRecvIfR.itm_cd(), poRecvIfR.itm_sub1(),
						poRecvIfR.itm_sub2(), poRecvIfR.itm_sub3(),
						poRecvIfR.in_to_loc_wg_cd(), MAC_STR.NULL_VAL.value(),
						MAC_STR.NULL_VAL.value(), poRecvIfR.mfg_loc_cd(),
						poRecvIfR.bom_ptn(), poRecvIfR.po_dt());
			}
			MAM_BP_R bpR = _cacheBp.get(poRecvIfR.sppl_cd());
			
			if (poRecvIfR.arr_skip_flg()) {
				poRecvIfR.purc_basis_typ(MAC_PURC_BASIS_TYP.IN_BASIS.value());
			}
			else if (MAC_PURC_ID_TYP.isVMI(poRecvIfR.purc_id_typ()) || MAC_PURC_ID_TYP.isFFR_RCV(poRecvIfR.purc_id_typ())) {
				poRecvIfR.purc_basis_typ(MAC_PURC_BASIS_TYP.IN_BASIS.value());
			}
			else if (poRecvIfR.subcon_flg()) {
				poRecvIfR.purc_basis_typ(MAC_PURC_BASIS_TYP.ARR_BASIS.value());
			}
			else if (!isNull(itmDtlR.purc_basis_typ())) {
				poRecvIfR.purc_basis_typ(itmDtlR.purc_basis_typ());
			}
			else if (!isNull(bpR.purc_basis_typ())) {
				poRecvIfR.purc_basis_typ(bpR.purc_basis_typ());
			}
			else {
				poRecvIfR.purc_basis_typ(MAC_PURC_BASIS_TYP.ANY_BASIS.value());
			}
		}
		
		/**
		 * 同時計上の設定
		 * @param poRecvIfR 発注受信ＩＦ
		 */
		protected void setSyncFlg(PoRecvIf_Chk01_CndR poRecvIfR) {
			if (MAC_PURC_BASIS_TYP.isARR_BASIS(poRecvIfR.purc_basis_typ())) {
				if (!isNull(poRecvIfR.dlv_rqst_tm()) && !poRecvIfR.dlv_rqst_tm().eqDate(poRecvIfR.purc_schd_dt())) {
					poRecvIfR.purc_schd_dt(poRecvIfR.dlv_rqst_tm().trunc(MCDateFieldType.DAY));
				}
				poRecvIfR.sync_flg(true);
			}
			else if (MAC_PURC_BASIS_TYP.isIN_BASIS(poRecvIfR.purc_basis_typ())) {
				if (isNonPurc(poRecvIfR) && !isNull(poRecvIfR.purc_schd_dt())) {
					poRecvIfR.purc_schd_dt(null);
				}
				poRecvIfR.sync_flg(false);
			}
			else if (isNull(poRecvIfR.dlv_rqst_tm()) || isNull(poRecvIfR.purc_schd_dt())) {
				poRecvIfR.sync_flg(false);
			}
			else if (!poRecvIfR.dlv_rqst_tm().eqDate(poRecvIfR.purc_schd_dt())) {
				poRecvIfR.sync_flg(false);
			}
		}
		
		/**
		 * 請書受領日のクリア
		 * @param poRecvIfR 発注受信ＩＦ
		 */
		protected void clearPoConfRcptDt(PoRecvIf_Chk01_CndR poRecvIfR) {
			if (!poRecvIfR.po_conf_rcpt_flg()) {
				poRecvIfR.po_conf_rcpt_dt(null);
			}
		}
		
		/**
		 * 負担項目のクリア
		 * @param poRecvIfR 発注受信ＩＦ
		 */
		protected void clearBdCol(PoRecvIf_Chk01_CndR poRecvIfR) {
			poRecvIfR.bd_dpt_cd(null);
			poRecvIfR.bd_itm_cd(null);
			poRecvIfR.bd_itm_sub1(null);
			poRecvIfR.bd_itm_sub2(null);
			poRecvIfR.bd_itm_sub3(null);
			poRecvIfR.bd_sno1(null);
			poRecvIfR.bd_sno2(null);
			poRecvIfR.bd_sno3(null);
			poRecvIfR.bd_sno4(null);
			poRecvIfR.bd_loc_cd(null);
			poRecvIfR.bd_lot_no(null);
			poRecvIfR.bd_sublot_no(null);
			poRecvIfR.bd_ctg_cd(null);
			poRecvIfR.bd_oper_cd(null);
			poRecvIfR.bd_slo_no(null);
			poRecvIfR.bd_iv_no(null);
			poRecvIfR.bd_po_no(null);
		}
		
		/**
		 * 値引項目のクリア
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void clearDscnt(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			for (PoRecvIf_Chk01_CndR poRecvIfR : poRecvIfL) {
				if (poRecvIfR.dscnt_itm_flg()) {
					poRecvIfR.trd_cur_dscnt_amt(null);
					poRecvIfR.dscnt_rsn_cd(null);
				}
			}
		}
		
		/**
		 * 負担項目のクリア
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void clearBdDtl(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			for (PoRecvIf_Chk01_CndR poRecvIfR : poRecvIfL) {
				if (MAC_ASSET_MNG_TYP.isMNG(poRecvIfR.asset_mng_typ())) {
					clearBdCol(poRecvIfR);
					continue;
				}
				
				if (!isNull(poRecvIfR.bd_itm_cd())) {
					if (MAC_LOT_MNG_TYP.isNOT_MNG(poRecvIfR.bd_lot_mng_typ())) {
						poRecvIfR.bd_lot_no(MAC_STR.NULL_VAL.value());
					}
					if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(poRecvIfR.bd_sublot_mng_typ())) {
						poRecvIfR.bd_sublot_no(MAC_STR.NULL_VAL.value());
					}
					if (MAC_SNO_MNG_TYP.isNOT_MNG(poRecvIfR.bd_sno1_mng_typ())) {
						poRecvIfR.bd_sno1(MAC_STR.NULL_VAL.value());
					}
					if (MAC_SNO_MNG_TYP.isNOT_MNG(poRecvIfR.bd_sno2_mng_typ())) {
						poRecvIfR.bd_sno2(MAC_STR.NULL_VAL.value());
					}
					if (MAC_SNO_MNG_TYP.isNOT_MNG(poRecvIfR.bd_sno3_mng_typ())) {
						poRecvIfR.bd_sno3(MAC_STR.NULL_VAL.value());
					}
					if (MAC_SNO_MNG_TYP.isNOT_MNG(poRecvIfR.bd_sno4_mng_typ())) {
						poRecvIfR.bd_sno4(MAC_STR.NULL_VAL.value());
					}
					
					// 負担品群、負担工程は同時に設定不可
					poRecvIfR.bd_ctg_cd(null);
					poRecvIfR.bd_oper_cd(null);
				}
				else {
					poRecvIfR.bd_itm_sub1(null);
					poRecvIfR.bd_itm_sub2(null);
					poRecvIfR.bd_itm_sub3(null);
				}
			}
		}
		
		/**
		 * 無償支給・VMIの場合の明細項目の設定
		 * @param poRecvIfL
		 */
		protected void setNonPurcDtl(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			for (PoRecvIf_Chk01_CndR poRecvIfR : poRecvIfL) {
				if(isNonPurc(poRecvIfR)) {
					poRecvIfR.purc_upri_req_typ(null);
					poRecvIfR.trd_cur_upri(null);
					poRecvIfR.trd_cur_proc_upri(null);
					poRecvIfR.trd_cur_onr_prov_upri(null);
					poRecvIfR.interim_flg(false);
					poRecvIfR.trd_cur_dscnt_amt(null);
					poRecvIfR.dscnt_rsn_cd(null);
					poRecvIfR.tax_cd(null);
					poRecvIfR.tax_fix_flg(false);
					poRecvIfR.upri_not_tgt_flg(false);
					poRecvIfR.wtax_rate(null);
					poRecvIfR.purc_schd_dt(null);
					poRecvIfR.pay_crryovr_times(null);
					
					clearBdCol(poRecvIfR);
				}
			}
		}

		/**
		 * ヘッダのデータ更新区分を設定する。
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void setHdrDataCrudTyp(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			for (MCList<PoRecvIf_Chk01_CndR> upGroupList : poRecvIfL.groupList(getPoRecvIfHdrKey())) {
				if (isHdrDataCrudTypIns(upGroupList)) {
					upGroupList.setString(PoRecvIf_Chk01_CndR.$hdr_data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
				}
				else if (isHdrDataCrudTypDel(upGroupList)) {
					upGroupList.setString(PoRecvIf_Chk01_CndR.$hdr_data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value());
				}
				else {
					upGroupList.setString(PoRecvIf_Chk01_CndR.$hdr_data_crud_typ, MAC_DATA_CRUD_TYP.UPD.value());
				}
			}
		}
		
		/**
		 * ヘッダのデータ更新区分が新規か
		 * @param poRecvIfL 発注受信ＩＦリスト
		 * @return 新規の場合はtrue
		 */
		protected boolean isHdrDataCrudTypIns(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			PoRecvIf_Chk01_CndR hdrR = poRecvIfL.get(0);
			MST_PO_R poR = _cachePo.getFirst(_idxExtPoNoKey, hdrR.ext_sys_cd(), hdrR.ext_po_no());
			if (isNull(poR)) {
				return true;
			}
			return false;
		}
		
		/**
		 * ヘッダのデータ更新区分が削除か
		 * @param poRecvIfL 発注受信ＩＦリスト
		 * @return 削除の場合はtrue
		 */
		protected boolean isHdrDataCrudTypDel(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			PoRecvIf_Chk01_CndR hdrR = poRecvIfL.get(0);
			MCList<MST_PO_D_R> poDL = _cachePoD.subList(_idxExtPoNoforDkey, hdrR.ext_sys_cd(), hdrR.ext_po_no());
			if (!isSame(poDL.size(), poRecvIfL.size())) {
				return false;
			}
			
			int ifDelSize = 0;
			
			for (MST_PO_D_R poDR : poDL) {
				PoRecvIf_Chk01_CndR poRecvIfR = getPoRecvIfR(poDR);
				if (!isNull(poRecvIfR) && isDel(poRecvIfR)) {
					ifDelSize++;
				}
			}
			
			if (isSame(poDL.size(), ifDelSize)) {
				return true;
			}
			return false;
		}
		
		/**
		 * 下り電文を設定します
		 * @param poRecvIfL 発注受信ＩＦリスト
		 */
		protected void setDownSub(MCList<PoRecvIf_Chk01_CndR> poRecvIfL) {
			PoRecvIf_Chk01_CndR hdrIfR = poRecvIfL.get(0);
			Po_Ins01_HdrR hdrR = Po_Ins01_HdrR.create();
			setPoHdr(hdrR, hdrIfR);
			
			MCList<Po_Ins01_DtlR> dtlL = MCList.create(Po_Ins01_DtlR.class);
			MCList<Po_Ins01_Bndl_DtlR> dtl2L = MCList.create(Po_Ins01_Bndl_DtlR.class);
			for (PoRecvIf_Chk01_CndR poRecvIfR : poRecvIfL) {
				Po_Ins01_DtlR dtlR = Po_Ins01_DtlR.create();
				Po_Ins01_Bndl_DtlR dtl2R = Po_Ins01_Bndl_DtlR.create();
				setPoDtl(dtlR, poRecvIfR, hdrR);
				dtlL.add(dtlR);
				
				setPoDtl2(dtl2R, poRecvIfR, hdrR);
				dtl2L.add(dtl2R);
			}
			
			if (!MAC_DATA_CRUD_TYP.isDEL(hdrIfR.hdr_data_crud_typ())) {
				setDispSeqForCrud(dtlL);
			}
			
			down1().add(hdrR);
			down2().addAll(dtlL);
			down3().addAll(dtl2L);
		}
		
		/**
		 * データ更新区分に応じた表示順を設定します。
		 * @param poDL 発注明細行
		 */
		protected void setDispSeqForCrud(MCList<Po_Ins01_DtlR> poDL) {
			String col = MST_PO_D_R.$disp_seq;
			int dispSeq = 1;
			for (Po_Ins01_DtlR r : poDL) {
				if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					r.setNumber(col, dispSeq++);
				}
				else {
					r.setNumber(col, null);
				}
			}
		}
		
		/**
		 * 発注登録サービスコール用の電文を作成します（ヘッダ部）
		 */
		protected void setPoHdr(Po_Ins01_HdrR hdrR, PoRecvIf_Chk01_CndR poRecvIfR) {
			copy(hdrR, poRecvIfR, createMap_Po_Ins01_HdrR_PoRecvIf_Chk01_CndR());
			
			// 1行目のpeg_noをヘッダのpeg_noにセットする
			hdrR.peg_no(poRecvIfR.peg_no());
			
			hdrR.setParamIndex(poRecvIfR.poif().getParamIndex());
			hdrR.setParamRowIndex(poRecvIfR.poif().getParamRowIndex());
		}
		
		/**
		 * 発注登録サービスコール用の電文を作成します（明細部）
		 */
		protected void setPoDtl(Po_Ins01_DtlR dtlR, PoRecvIf_Chk01_CndR poRecvIfR, Po_Ins01_HdrR hdrR) {
			copy(dtlR, poRecvIfR, createMap_Po_Ins01_DtlR_PoRecvIf_Chk01_CndR());
			MST_PO_D_R podR = getCachePoD(dtlR.po_d_no());
			if (!isNull(podR)) {
				dtlR.po_schd_no(podR.po_schd_no());
			}

			dtlR.hdr_peg_no(hdrR.peg_no());

			dtlR.setParamIndex(poRecvIfR.poif().getParamIndex());
			dtlR.setParamRowIndex(poRecvIfR.poif().getParamRowIndex());
		}
		
		/**
		 * 発注登録サービスコール用の電文を作成します（明細補足部）
		 */
		protected void setPoDtl2(Po_Ins01_Bndl_DtlR dtlR, PoRecvIf_Chk01_CndR poRecvIfR, Po_Ins01_HdrR hdrR) {
			copy(dtlR, poRecvIfR, createMap_Po_Ins01_Bndl_DtlR_PoRecvIf_Chk01_CndR());
			MST_PO_D_R podR = getCachePoD(dtlR.po_d_no());
			if (!isNull(podR)) {
				dtlR.po_schd_no(podR.po_schd_no());
			}
			dtlR.setParamIndex(poRecvIfR.poif().getParamIndex());
			dtlR.setParamRowIndex(poRecvIfR.poif().getParamRowIndex());
		}
		
		/**
		 * 発注受信ＩＦのヘッダ項目を返す。
		 * @return ヘッダ項目
		 */
		protected String[] getPoRecvIfHdrKey() {
			return new String[] {
					PoRecvIf_Chk01_CndR.$ext_data_no,
					PoRecvIf_Chk01_CndR.$ext_sys_cd,
					PoRecvIf_Chk01_CndR.$ext_po_no
					};
		}
		
		/**
		 * 発注受信ＩＦの品目と発注明細の品目が同一品目かどうか。
		 * @param poRecvIfR 発注受信ＩＦ
		 * @param poDR 発注明細
		 * @return 同一品目の場合はtrue
		 */
		protected boolean isSameItm(PoRecvIf_Chk01_CndR poRecvIfR, MST_PO_D_R poDR) {
			return isSame(poRecvIfR.itm_cd(), poDR.itm_cd()) && isSame(poRecvIfR.itm_sub1(), poDR.itm_sub1())
					&& isSame(poRecvIfR.itm_sub2(), poDR.itm_sub2()) && isSame(poRecvIfR.itm_sub3(), poDR.itm_sub3());
		}
		
		/**
		 * 指定された発注受信ＩＦの購買識別区分が無償支給・VMIかどうか。
		 * @param poRecvIfR 発注受信ＩＦ
		 * @return　無償支給・VMIの場合はtrue
		 */
		protected boolean isNonPurc(PoRecvIf_Chk01_CndR poRecvIfR) {
			return MAC_PURC_ID_TYP.isVMI(poRecvIfR.purc_id_typ()) || MAC_PURC_ID_TYP.isFFR_RCV(poRecvIfR.purc_id_typ());
		}
		
		/**
		 * 経費購買かどうか
		 * 取引パタンが経費購買であるか、資産管理しない品目を発注する場合は経費購買とする。
		 * @param poRecvIfR 発注受信ＩＦ
		 * @return 経費購買の場合はtrue
		 */
		protected boolean isXpnsPurc(PoRecvIf_Chk01_CndR poRecvIfR){
			if (MAC_TRD_PTN_TYP.isPURC_XPNS(poRecvIfR.trd_ptn_typ()) || MAC_ASSET_MNG_TYP.isNOT_MNG(poRecvIfR.asset_mng_typ())) {
				return true;
			} 
			else {
				return false;
			}
		}
		
		/**
		 * 指定された発注受信ＩＦが新規かどうか。
		 * @param poRecvIfR 発注受信ＩＦ
		 * @return　新規の場合はtrue
		 */
		protected boolean isCrt(PoRecvIf_Chk01_CndR poRecvIfR) {
			return MAC_DATA_CRUD_TYP.isCRT(poRecvIfR.data_crud_typ());
		}
		
		/**
		 * 指定された発注受信ＩＦが更新かどうか。
		 * @param poRecvIfR 発注受信ＩＦ
		 * @return　更新の場合はtrue
		 */
		protected boolean isUpd(PoRecvIf_Chk01_CndR poRecvIfR) {
			return MAC_DATA_CRUD_TYP.isUPD(poRecvIfR.data_crud_typ());
		}
		
		/**
		 * 指定された発注受信ＩＦが削除かどうか。
		 * @param poRecvIfR 発注受信ＩＦ
		 * @return　削除の場合はtrue
		 */
		protected boolean isDel(PoRecvIf_Chk01_CndR poRecvIfR) {
			return MAC_DATA_CRUD_TYP.isDEL(poRecvIfR.data_crud_typ());
		}
		
		protected Map_Po_Ins01_HdrR_PoRecvIf_Chk01_CndR<Po_Ins01_HdrR,PoRecvIf_Chk01_CndR> createMap_Po_Ins01_HdrR_PoRecvIf_Chk01_CndR() {
			return new Map_Po_Ins01_HdrR_PoRecvIf_Chk01_CndR<Po_Ins01_HdrR, PoRecvIf_Chk01_CndR>();
		}

		public class Map_Po_Ins01_HdrR_PoRecvIf_Chk01_CndR<D extends Po_Ins01_HdrR, S extends PoRecvIf_Chk01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Po_Ins01_HdrR.$err_flg, PoRecvIf_Chk01_CndR.$err_flg);
				addColumnPathMap(Po_Ins01_HdrR.$prnt_po_flg, PoRecvIf_Chk01_CndR.$prnt_po_flg);
				addColumnPathMap(Po_Ins01_HdrR.$prnt_dlv_flg, PoRecvIf_Chk01_CndR.$prnt_dlv_flg);
				addColumnPathMap(Po_Ins01_HdrR.$po_no, PoRecvIf_Chk01_CndR.$po_no);
				addColumnPathMap(Po_Ins01_HdrR.$po_rev, PoRecvIf_Chk01_CndR.$po_rev);
				addColumnPathMap(Po_Ins01_HdrR.$trd_cd, PoRecvIf_Chk01_CndR.$trd_cd);
				addColumnPathMap(Po_Ins01_HdrR.$trd_ptn_typ, PoRecvIf_Chk01_CndR.$trd_ptn_typ);
				addColumnPathMap(Po_Ins01_HdrR.$purc_dpt_cd, PoRecvIf_Chk01_CndR.$purc_dpt_cd);
				addColumnPathMap(Po_Ins01_HdrR.$wg_cd, PoRecvIf_Chk01_CndR.$purc_dpt_wg_cd);
				addColumnPathMap(Po_Ins01_HdrR.$purc_usr_cd, PoRecvIf_Chk01_CndR.$purc_usr_cd);
				addColumnPathMap(Po_Ins01_HdrR.$sppl_cd, PoRecvIf_Chk01_CndR.$sppl_cd);
				addColumnPathMap(Po_Ins01_HdrR.$sppl_cntct_dpt, PoRecvIf_Chk01_CndR.$sppl_cntct_dpt);
				addColumnPathMap(Po_Ins01_HdrR.$sppl_cntct_psn, PoRecvIf_Chk01_CndR.$sppl_cntct_psn);
				addColumnPathMap(Po_Ins01_HdrR.$sppl_zip_cd, PoRecvIf_Chk01_CndR.$sppl_zip_cd);
				addColumnPathMap(Po_Ins01_HdrR.$sppl_addr1, PoRecvIf_Chk01_CndR.$sppl_addr1);
				addColumnPathMap(Po_Ins01_HdrR.$sppl_addr2, PoRecvIf_Chk01_CndR.$sppl_addr2);
				addColumnPathMap(Po_Ins01_HdrR.$sppl_addr3, PoRecvIf_Chk01_CndR.$sppl_addr3);
				addColumnPathMap(Po_Ins01_HdrR.$sppl_addr4, PoRecvIf_Chk01_CndR.$sppl_addr4);
				addColumnPathMap(Po_Ins01_HdrR.$sppl_tel, PoRecvIf_Chk01_CndR.$sppl_tel);
				addColumnPathMap(Po_Ins01_HdrR.$sppl_fax, PoRecvIf_Chk01_CndR.$sppl_fax);
				addColumnPathMap(Po_Ins01_HdrR.$po_dt, PoRecvIf_Chk01_CndR.$po_dt);
				addColumnPathMap(Po_Ins01_HdrR.$upd_po_print_schd_dt, PoRecvIf_Chk01_CndR.$upd_po_print_schd_dt);
				addColumnPathMap(Po_Ins01_HdrR.$trd_cur_cd, PoRecvIf_Chk01_CndR.$trd_cur_cd);
				addColumnPathMap(Po_Ins01_HdrR.$xrate, PoRecvIf_Chk01_CndR.$xrate);
				addColumnPathMap(Po_Ins01_HdrR.$xrate_inpt_flg, PoRecvIf_Chk01_CndR.$xrate_inpt_flg);
				addColumnPathMap(Po_Ins01_HdrR.$ptax_xrate, PoRecvIf_Chk01_CndR.$ptax_xrate);
				addColumnPathMap(Po_Ins01_HdrR.$ptax_xrate_inpt_flg, PoRecvIf_Chk01_CndR.$ptax_xrate_inpt_flg);
				addColumnPathMap(Po_Ins01_HdrR.$crct_rsn_cd, PoRecvIf_Chk01_CndR.$crct_rsn_cd);
				addColumnPathMap(Po_Ins01_HdrR.$po_print_cd, PoRecvIf_Chk01_CndR.$po_print_cd);
				addColumnPathMap(Po_Ins01_HdrR.$wrk_no, PoRecvIf_Chk01_CndR.$wrk_no);
				addColumnPathMap(Po_Ins01_HdrR.$tterm_cd1, PoRecvIf_Chk01_CndR.$tterm_cd1);
				addColumnPathMap(Po_Ins01_HdrR.$tterm_rmrks1, PoRecvIf_Chk01_CndR.$tterm_rmrks1);
				addColumnPathMap(Po_Ins01_HdrR.$tterm_cd2, PoRecvIf_Chk01_CndR.$tterm_cd2);
				addColumnPathMap(Po_Ins01_HdrR.$tterm_rmrks2, PoRecvIf_Chk01_CndR.$tterm_rmrks2);
				addColumnPathMap(Po_Ins01_HdrR.$tterm_cd3, PoRecvIf_Chk01_CndR.$tterm_cd3);
				addColumnPathMap(Po_Ins01_HdrR.$tterm_rmrks3, PoRecvIf_Chk01_CndR.$tterm_rmrks3);
				addColumnPathMap(Po_Ins01_HdrR.$edi_flg, PoRecvIf_Chk01_CndR.$edi_flg);
				addColumnPathMap(Po_Ins01_HdrR.$trd_rmrks, PoRecvIf_Chk01_CndR.$trd_rmrks);
				addColumnPathMap(Po_Ins01_HdrR.$intr_rmrks, PoRecvIf_Chk01_CndR.$intr_rmrks);
				addColumnPathMap(Po_Ins01_HdrR.$po_print_rmrks, PoRecvIf_Chk01_CndR.$po_print_rmrks);
				addColumnPathMap(Po_Ins01_HdrR.$dlv_slip_rmrks, PoRecvIf_Chk01_CndR.$dlv_slip_rmrks);
//				addColumnPathMap(Po_Ins01_HdrR.$sub_char1, PoRecvIf_Chk01_CndR.$sub_char1);
//				addColumnPathMap(Po_Ins01_HdrR.$sub_char2, PoRecvIf_Chk01_CndR.$sub_char2);
//				addColumnPathMap(Po_Ins01_HdrR.$sub_char3, PoRecvIf_Chk01_CndR.$sub_char3);
				addColumnPathMap(Po_Ins01_HdrR.$edi_sub_char1, PoRecvIf_Chk01_CndR.$edi_sub_char1);
				addColumnPathMap(Po_Ins01_HdrR.$edi_sub_char2, PoRecvIf_Chk01_CndR.$edi_sub_char2);
				addColumnPathMap(Po_Ins01_HdrR.$edi_sub_char3, PoRecvIf_Chk01_CndR.$edi_sub_char3);
				addColumnPathMap(Po_Ins01_HdrR.$edi_sub_char4, PoRecvIf_Chk01_CndR.$edi_sub_char4);
				addColumnPathMap(Po_Ins01_HdrR.$edi_sub_char5, PoRecvIf_Chk01_CndR.$edi_sub_char5);
				addColumnPathMap(Po_Ins01_HdrR.$edi_sub_num1, PoRecvIf_Chk01_CndR.$edi_sub_num1);
				addColumnPathMap(Po_Ins01_HdrR.$edi_sub_dt1, PoRecvIf_Chk01_CndR.$edi_sub_dt1);
				addColumnPathMap(Po_Ins01_HdrR.$ext_sys_cd, PoRecvIf_Chk01_CndR.$ext_sys_cd);
				addColumnPathMap(Po_Ins01_HdrR.$ext_po_no, PoRecvIf_Chk01_CndR.$ext_po_no);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.purc_if_flg(true);
				dest.data_crud_typ(src.hdr_data_crud_typ());
			}
		}
		
		protected Map_Po_Ins01_DtlR_PoRecvIf_Chk01_CndR<Po_Ins01_DtlR,PoRecvIf_Chk01_CndR> createMap_Po_Ins01_DtlR_PoRecvIf_Chk01_CndR() {
			return new Map_Po_Ins01_DtlR_PoRecvIf_Chk01_CndR<Po_Ins01_DtlR, PoRecvIf_Chk01_CndR>();
		}

		public class Map_Po_Ins01_DtlR_PoRecvIf_Chk01_CndR<D extends Po_Ins01_DtlR, S extends PoRecvIf_Chk01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Po_Ins01_DtlR.$peg_no, PoRecvIf_Chk01_CndR.$peg_no);
				addColumnPathMap(Po_Ins01_DtlR.$data_crud_typ, PoRecvIf_Chk01_CndR.$data_crud_typ);
				addColumnPathMap(Po_Ins01_DtlR.$arr_cnt_rmrks, PoRecvIf_Chk01_CndR.$arr_cnt_rmrks);
				addColumnPathMap(Po_Ins01_DtlR.$po_d_no, PoRecvIf_Chk01_CndR.$po_d_no);
				addColumnPathMap(Po_Ins01_DtlR.$po_no, PoRecvIf_Chk01_CndR.$po_no);
				addColumnPathMap(Po_Ins01_DtlR.$po_rev, PoRecvIf_Chk01_CndR.$po_rev);
//				addColumnPathMap(Po_Ins01_DtlR.$disp_seq, PoRecvIf_Chk01_CndR.$disp_seq);
				addColumnPathMap(Po_Ins01_DtlR.$itm_cd, PoRecvIf_Chk01_CndR.$itm_cd);
				addColumnPathMap(Po_Ins01_DtlR.$itm_sub1, PoRecvIf_Chk01_CndR.$itm_sub1);
				addColumnPathMap(Po_Ins01_DtlR.$itm_sub2, PoRecvIf_Chk01_CndR.$itm_sub2);
				addColumnPathMap(Po_Ins01_DtlR.$itm_sub3, PoRecvIf_Chk01_CndR.$itm_sub3);
				addColumnPathMap(Po_Ins01_DtlR.$ver_no, PoRecvIf_Chk01_CndR.$ver_no);
				addColumnPathMap(Po_Ins01_DtlR.$itm_nm, PoRecvIf_Chk01_CndR.$itm_nm);
				addColumnPathMap(Po_Ins01_DtlR.$iv_itm_nm, PoRecvIf_Chk01_CndR.$iv_itm_nm);
				addColumnPathMap(Po_Ins01_DtlR.$sno1, PoRecvIf_Chk01_CndR.$sno1);
				addColumnPathMap(Po_Ins01_DtlR.$sno2, PoRecvIf_Chk01_CndR.$sno2);
				addColumnPathMap(Po_Ins01_DtlR.$sno3, PoRecvIf_Chk01_CndR.$sno3);
				addColumnPathMap(Po_Ins01_DtlR.$sno4, PoRecvIf_Chk01_CndR.$sno4);
				addColumnPathMap(Po_Ins01_DtlR.$purc_rsn_cd, PoRecvIf_Chk01_CndR.$purc_rsn_cd);
				addColumnPathMap(Po_Ins01_DtlR.$purc_id_typ, PoRecvIf_Chk01_CndR.$purc_id_typ);
				addColumnPathMap(Po_Ins01_DtlR.$sundry_itm_flg, PoRecvIf_Chk01_CndR.$sundry_itm_flg);
				addColumnPathMap(Po_Ins01_DtlR.$sppl_itm_cd, PoRecvIf_Chk01_CndR.$sppl_itm_cd);
				addColumnPathMap(Po_Ins01_DtlR.$sppl_itm_nm, PoRecvIf_Chk01_CndR.$sppl_itm_nm);
				addColumnPathMap(Po_Ins01_DtlR.$ap_dpt_cd, PoRecvIf_Chk01_CndR.$ap_dpt_cd);
				addColumnPathMap(Po_Ins01_DtlR.$maker_cd, PoRecvIf_Chk01_CndR.$maker_cd);
				addColumnPathMap(Po_Ins01_DtlR.$bp_lot_no, PoRecvIf_Chk01_CndR.$bp_lot_no);
				addColumnPathMap(Po_Ins01_DtlR.$in_to_loc_cd, PoRecvIf_Chk01_CndR.$in_to_loc_cd);
				addColumnPathMap(Po_Ins01_DtlR.$str_ln_cd, PoRecvIf_Chk01_CndR.$str_ln_cd);
				addColumnPathMap(Po_Ins01_DtlR.$dlv_rqst_tm, PoRecvIf_Chk01_CndR.$dlv_rqst_tm);
//				addColumnPathMap(Po_Ins01_DtlR.$purc_lt, PoRecvIf_Chk01_CndR.$purc_lt);
				addColumnPathMap(Po_Ins01_DtlR.$rqst_dlv_rqst_tm, PoRecvIf_Chk01_CndR.$rqst_dlv_rqst_tm);
				addColumnPathMap(Po_Ins01_DtlR.$rqst_avl_rqst_dt, PoRecvIf_Chk01_CndR.$rqst_avl_rqst_dt);
				addColumnPathMap(Po_Ins01_DtlR.$purc_schd_dt, PoRecvIf_Chk01_CndR.$purc_schd_dt);
				addColumnPathMap(Po_Ins01_DtlR.$sync_flg, PoRecvIf_Chk01_CndR.$sync_flg);
				addColumnPathMap(Po_Ins01_DtlR.$purc_upri_req_typ, PoRecvIf_Chk01_CndR.$purc_upri_req_typ);
				addColumnPathMap(Po_Ins01_DtlR.$trd_unit_qty, PoRecvIf_Chk01_CndR.$trd_unit_qty);
				addColumnPathMap(Po_Ins01_DtlR.$trd_unit_cd, PoRecvIf_Chk01_CndR.$trd_unit_cd);
				addColumnPathMap(Po_Ins01_DtlR.$base_unit_qty, PoRecvIf_Chk01_CndR.$base_unit_qty);
				addColumnPathMap(Po_Ins01_DtlR.$base_unit_cd, PoRecvIf_Chk01_CndR.$base_unit_cd);
				addColumnPathMap(Po_Ins01_DtlR.$interim_flg, PoRecvIf_Chk01_CndR.$interim_flg);
				addColumnPathMap(Po_Ins01_DtlR.$upri_not_tgt_flg, PoRecvIf_Chk01_CndR.$upri_not_tgt_flg);
				addColumnPathMap(Po_Ins01_DtlR.$trd_cur_upri, PoRecvIf_Chk01_CndR.$trd_cur_upri);
				addColumnPathMap(Po_Ins01_DtlR.$trd_cur_proc_upri, PoRecvIf_Chk01_CndR.$trd_cur_proc_upri);
				addColumnPathMap(Po_Ins01_DtlR.$trd_cur_onr_prov_upri, PoRecvIf_Chk01_CndR.$trd_cur_onr_prov_upri);
				addColumnPathMap(Po_Ins01_DtlR.$trd_cur_amt, PoRecvIf_Chk01_CndR.$trd_cur_amt);
				addColumnPathMap(Po_Ins01_DtlR.$trd_cur_proc_amt, PoRecvIf_Chk01_CndR.$trd_cur_proc_amt);
				addColumnPathMap(Po_Ins01_DtlR.$trd_cur_onr_prov_amt, PoRecvIf_Chk01_CndR.$trd_cur_onr_prov_amt);
				addColumnPathMap(Po_Ins01_DtlR.$trd_cur_tax_amt, PoRecvIf_Chk01_CndR.$trd_cur_tax_amt);
				addColumnPathMap(Po_Ins01_DtlR.$trd_cur_dscnt_amt, PoRecvIf_Chk01_CndR.$trd_cur_dscnt_amt);
				addColumnPathMap(Po_Ins01_DtlR.$dscnt_rsn_cd, PoRecvIf_Chk01_CndR.$dscnt_rsn_cd);
				addColumnPathMap(Po_Ins01_DtlR.$tax_fix_flg, PoRecvIf_Chk01_CndR.$tax_fix_flg);
				addColumnPathMap(Po_Ins01_DtlR.$tax_cd, PoRecvIf_Chk01_CndR.$tax_cd);
				addColumnPathMap(Po_Ins01_DtlR.$inc_tax_flg, PoRecvIf_Chk01_CndR.$inc_tax_flg);
				addColumnPathMap(Po_Ins01_DtlR.$wtax_rate, PoRecvIf_Chk01_CndR.$wtax_rate);
				addColumnPathMap(Po_Ins01_DtlR.$wtax_amt, PoRecvIf_Chk01_CndR.$wtax_amt);
				addColumnPathMap(Po_Ins01_DtlR.$drct_dlv_typ, PoRecvIf_Chk01_CndR.$drct_dlv_typ);
				addColumnPathMap(Po_Ins01_DtlR.$mfg_loc_cd, PoRecvIf_Chk01_CndR.$mfg_loc_cd);
				addColumnPathMap(Po_Ins01_DtlR.$bom_ptn, PoRecvIf_Chk01_CndR.$bom_ptn);
//				addColumnPathMap(Po_Ins01_DtlR.$bndl_flg, PoRecvIf_Chk01_CndR.$bndl_flg);
				addColumnPathMap(Po_Ins01_DtlR.$outsrc_itm_ord_no, PoRecvIf_Chk01_CndR.$outsrc_itm_ord_no);
				addColumnPathMap(Po_Ins01_DtlR.$outsrc_flg, PoRecvIf_Chk01_CndR.$outsrc_flg);
//				addColumnPathMap(Po_Ins01_DtlR.$uplnd_flg, PoRecvIf_Chk01_CndR.$uplnd_flg);
//				addColumnPathMap(Po_Ins01_DtlR.$schd_chg_flg, PoRecvIf_Chk01_CndR.$schd_chg_flg);
				addColumnPathMap(Po_Ins01_DtlR.$po_conf_rcpt_flg, PoRecvIf_Chk01_CndR.$po_conf_rcpt_flg);
				addColumnPathMap(Po_Ins01_DtlR.$po_conf_rcpt_dt, PoRecvIf_Chk01_CndR.$po_conf_rcpt_dt);
				addColumnPathMap(Po_Ins01_DtlR.$pri_print_flg, PoRecvIf_Chk01_CndR.$pri_print_flg);
				addColumnPathMap(Po_Ins01_DtlR.$pay_crryovr_times, PoRecvIf_Chk01_CndR.$pay_crryovr_times);
//				addColumnPathMap(Po_Ins01_DtlR.$slo_no, PoRecvIf_Chk01_CndR.$slo_no);
//				addColumnPathMap(Po_Ins01_DtlR.$slo_d_no, PoRecvIf_Chk01_CndR.$slo_d_no);
				addColumnPathMap(Po_Ins01_DtlR.$io_schd_pr_no, PoRecvIf_Chk01_CndR.$io_schd_pr_no);
				addColumnPathMap(Po_Ins01_DtlR.$bd_itm_cd, PoRecvIf_Chk01_CndR.$bd_itm_cd);
				addColumnPathMap(Po_Ins01_DtlR.$bd_itm_sub1, PoRecvIf_Chk01_CndR.$bd_itm_sub1);
				addColumnPathMap(Po_Ins01_DtlR.$bd_itm_sub2, PoRecvIf_Chk01_CndR.$bd_itm_sub2);
				addColumnPathMap(Po_Ins01_DtlR.$bd_itm_sub3, PoRecvIf_Chk01_CndR.$bd_itm_sub3);
				addColumnPathMap(Po_Ins01_DtlR.$bd_sno1, PoRecvIf_Chk01_CndR.$bd_sno1);
				addColumnPathMap(Po_Ins01_DtlR.$bd_sno2, PoRecvIf_Chk01_CndR.$bd_sno2);
				addColumnPathMap(Po_Ins01_DtlR.$bd_sno3, PoRecvIf_Chk01_CndR.$bd_sno3);
				addColumnPathMap(Po_Ins01_DtlR.$bd_sno4, PoRecvIf_Chk01_CndR.$bd_sno4);
				addColumnPathMap(Po_Ins01_DtlR.$bd_loc_cd, PoRecvIf_Chk01_CndR.$bd_loc_cd);
				addColumnPathMap(Po_Ins01_DtlR.$bd_lot_no, PoRecvIf_Chk01_CndR.$bd_lot_no);
				addColumnPathMap(Po_Ins01_DtlR.$bd_sublot_no, PoRecvIf_Chk01_CndR.$bd_sublot_no);
				addColumnPathMap(Po_Ins01_DtlR.$bd_dpt_cd, PoRecvIf_Chk01_CndR.$bd_dpt_cd);
				addColumnPathMap(Po_Ins01_DtlR.$bd_ctg_cd, PoRecvIf_Chk01_CndR.$bd_ctg_cd);
				addColumnPathMap(Po_Ins01_DtlR.$bd_oper_cd, PoRecvIf_Chk01_CndR.$bd_oper_cd);
				addColumnPathMap(Po_Ins01_DtlR.$bd_slo_no, PoRecvIf_Chk01_CndR.$bd_slo_no);
				addColumnPathMap(Po_Ins01_DtlR.$bd_iv_no, PoRecvIf_Chk01_CndR.$bd_iv_no);
				addColumnPathMap(Po_Ins01_DtlR.$bd_po_no, PoRecvIf_Chk01_CndR.$bd_po_no);
//				addColumnPathMap(Po_Ins01_DtlR.$bd_bp_cd, PoRecvIf_Chk01_CndR.$bd_bp_cd);
				addColumnPathMap(Po_Ins01_DtlR.$intr_rmrks, PoRecvIf_Chk01_CndR.$intr_d_rmrks);
				addColumnPathMap(Po_Ins01_DtlR.$trd_d_rmrks, PoRecvIf_Chk01_CndR.$trd_d_rmrks);
				addColumnPathMap(Po_Ins01_DtlR.$po_print_d_rmrks, PoRecvIf_Chk01_CndR.$po_print_d_rmrks);
				addColumnPathMap(Po_Ins01_DtlR.$dlv_slip_d_rmrks, PoRecvIf_Chk01_CndR.$dlv_slip_d_rmrks);
//				addColumnPathMap(Po_Ins01_DtlR.$sub_char1, PoRecvIf_Chk01_CndR.$sub_char1);
//				addColumnPathMap(Po_Ins01_DtlR.$sub_char2, PoRecvIf_Chk01_CndR.$sub_char2);
//				addColumnPathMap(Po_Ins01_DtlR.$sub_char3, PoRecvIf_Chk01_CndR.$sub_char3);
				addColumnPathMap(Po_Ins01_DtlR.$edi_sub_d_char1, PoRecvIf_Chk01_CndR.$edi_sub_d_char1);
				addColumnPathMap(Po_Ins01_DtlR.$edi_sub_d_char2, PoRecvIf_Chk01_CndR.$edi_sub_d_char2);
				addColumnPathMap(Po_Ins01_DtlR.$edi_sub_d_char3, PoRecvIf_Chk01_CndR.$edi_sub_d_char3);
				addColumnPathMap(Po_Ins01_DtlR.$edi_sub_d_char4, PoRecvIf_Chk01_CndR.$edi_sub_d_char4);
				addColumnPathMap(Po_Ins01_DtlR.$edi_sub_d_char5, PoRecvIf_Chk01_CndR.$edi_sub_d_char5);
				addColumnPathMap(Po_Ins01_DtlR.$edi_sub_d_num1, PoRecvIf_Chk01_CndR.$edi_sub_d_num1);
				addColumnPathMap(Po_Ins01_DtlR.$edi_sub_d_dt1, PoRecvIf_Chk01_CndR.$edi_sub_d_dt1);
				addColumnPathMap(Po_Ins01_DtlR.$ext_po_d_no, PoRecvIf_Chk01_CndR.$ext_po_d_no);
				addColumnPathMap(Po_Ins01_DtlR.$purc_basis_typ, PoRecvIf_Chk01_CndR.$purc_basis_typ);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.uplnd_flg(true);
				dest.schd_chg_flg(true);
			}
		}
		
		protected Map_Po_Ins01_Bndl_DtlR_PoRecvIf_Chk01_CndR<Po_Ins01_Bndl_DtlR,PoRecvIf_Chk01_CndR> createMap_Po_Ins01_Bndl_DtlR_PoRecvIf_Chk01_CndR() {
			return new Map_Po_Ins01_Bndl_DtlR_PoRecvIf_Chk01_CndR<Po_Ins01_Bndl_DtlR, PoRecvIf_Chk01_CndR>();
		}

		public class Map_Po_Ins01_Bndl_DtlR_PoRecvIf_Chk01_CndR<D extends Po_Ins01_Bndl_DtlR, S extends PoRecvIf_Chk01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Po_Ins01_Bndl_DtlR.$peg_no, PoRecvIf_Chk01_CndR.$peg_no);
				addColumnPathMap(Po_Ins01_Bndl_DtlR.$po_no, PoRecvIf_Chk01_CndR.$po_no);
				addColumnPathMap(Po_Ins01_Bndl_DtlR.$po_d_no, PoRecvIf_Chk01_CndR.$po_d_no);
				addColumnPathMap(Po_Ins01_Bndl_DtlR.$outsrc_itm_ord_no, PoRecvIf_Chk01_CndR.$outsrc_itm_ord_no);
				addColumnPathMap(Po_Ins01_Bndl_DtlR.$base_unit_qty, PoRecvIf_Chk01_CndR.$base_unit_qty);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.dtl_peg_no(src.peg_no());
			}
		}
		
		protected Map_PurcUtil_Srch02_DtlR_PoRecvIf_Chk01_CndR<PurcUtil_Srch02_DtlR,PoRecvIf_Chk01_CndR> createMap_PurcUtil_Srch02_DtlR_PoRecvIf_Chk01_CndR() {
			return new Map_PurcUtil_Srch02_DtlR_PoRecvIf_Chk01_CndR<PurcUtil_Srch02_DtlR, PoRecvIf_Chk01_CndR>();
		}

		public class Map_PurcUtil_Srch02_DtlR_PoRecvIf_Chk01_CndR<D extends PurcUtil_Srch02_DtlR, S extends PoRecvIf_Chk01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcUtil_Srch02_DtlR.$peg_no, PoRecvIf_Chk01_CndR.$peg_no);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_cd, PoRecvIf_Chk01_CndR.$itm_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_sub1, PoRecvIf_Chk01_CndR.$itm_sub1);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_sub2, PoRecvIf_Chk01_CndR.$itm_sub2);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itm_sub3, PoRecvIf_Chk01_CndR.$itm_sub3);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sppl_cd, PoRecvIf_Chk01_CndR.$sppl_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$maker_cd, PoRecvIf_Chk01_CndR.$maker_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$trd_unit_cd, PoRecvIf_Chk01_CndR.$trd_unit_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$trd_unit_qty, PoRecvIf_Chk01_CndR.$trd_unit_qty);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$base_unit_qty, PoRecvIf_Chk01_CndR.$base_unit_qty);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$cur_cd, PoRecvIf_Chk01_CndR.$trd_cur_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$wg_cd, PoRecvIf_Chk01_CndR.$in_to_loc_wg_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$in_to_loc_cd, PoRecvIf_Chk01_CndR.$in_to_loc_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$tax_cd, PoRecvIf_Chk01_CndR.$tax_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$mfg_loc_cd, PoRecvIf_Chk01_CndR.$mfg_loc_cd);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$bom_ptn, PoRecvIf_Chk01_CndR.$bom_ptn);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno1, PoRecvIf_Chk01_CndR.$sno1);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno2, PoRecvIf_Chk01_CndR.$sno2);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno3, PoRecvIf_Chk01_CndR.$sno3);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$sno4, PoRecvIf_Chk01_CndR.$sno4);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$base_unit_qty, PoRecvIf_Chk01_CndR.$base_unit_qty);
				addColumnPathMap(PurcUtil_Srch02_DtlR.$itmdtl_base_dt, PoRecvIf_Chk01_CndR.$po_dt);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.base_dt(src.purc_upri_req_base_dt());
				dest.rqst_dlv_rqst_dt(src.dlv_rqst_tm().trunc(MCDateFieldType.DAY));
			}
		}
		
		protected Map_PurcUtil_Srch01_DtlR_PoRecvIf_Chk01_CndR<PurcUtil_Srch01_DtlR,PoRecvIf_Chk01_CndR> createMap_PurcUtil_Srch01_DtlR_PoRecvIf_Chk01_CndR() {
			return new Map_PurcUtil_Srch01_DtlR_PoRecvIf_Chk01_CndR<PurcUtil_Srch01_DtlR, PoRecvIf_Chk01_CndR>();
		}

		public class Map_PurcUtil_Srch01_DtlR_PoRecvIf_Chk01_CndR<D extends PurcUtil_Srch01_DtlR, S extends PoRecvIf_Chk01_CndR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcUtil_Srch01_DtlR.$peg_no, PoRecvIf_Chk01_CndR.$peg_no);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$sppl_cd, PoRecvIf_Chk01_CndR.$sppl_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$itm_cd, PoRecvIf_Chk01_CndR.$itm_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$itm_sub1, PoRecvIf_Chk01_CndR.$itm_sub1);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$itm_sub2, PoRecvIf_Chk01_CndR.$itm_sub2);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$itm_sub3, PoRecvIf_Chk01_CndR.$itm_sub3);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$mfg_loc_cd, PoRecvIf_Chk01_CndR.$mfg_loc_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$maker_cd, PoRecvIf_Chk01_CndR.$maker_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$bom_ptn, PoRecvIf_Chk01_CndR.$bom_ptn);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$in_to_loc_cd, PoRecvIf_Chk01_CndR.$in_to_loc_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$site_cd, PoRecvIf_Chk01_CndR.$site_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$sppl_cal_cd, PoRecvIf_Chk01_CndR.$sppl_cal_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$in_to_loc_cal_cd, PoRecvIf_Chk01_CndR.$in_to_loc_cal_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$lg_grp_cd, PoRecvIf_Chk01_CndR.$lg_grp_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$base_unit_qty, PoRecvIf_Chk01_CndR.$base_unit_qty);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$wg_cd, PoRecvIf_Chk01_CndR.$in_to_loc_wg_cd);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.dlv_rqst_dt(src.dlv_rqst_tm().trunc(MCDateFieldType.DAY));
			}
		}
		
		protected Map_Lot_Chk03_CndR_PoRecvIf_Chk01_CndR<Lot_Chk03_CndR, PoRecvIf_Chk01_CndR> createMap_Lot_Chk03_CndR_PoRecvIf_Chk01_CndR() {
			return new Map_Lot_Chk03_CndR_PoRecvIf_Chk01_CndR<Lot_Chk03_CndR, PoRecvIf_Chk01_CndR>();
		}
		
		public class Map_Lot_Chk03_CndR_PoRecvIf_Chk01_CndR<D extends Lot_Chk03_CndR, S extends PoRecvIf_Chk01_CndR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Chk03_CndR.$peg_no, PoRecvIf_Chk01_CndR.$peg_no);
				addColumnPathMap(Lot_Chk03_CndR.$itm_cd, PoRecvIf_Chk01_CndR.$bd_itm_cd);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub1, PoRecvIf_Chk01_CndR.$bd_itm_sub1);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub2, PoRecvIf_Chk01_CndR.$bd_itm_sub2);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub3, PoRecvIf_Chk01_CndR.$bd_itm_sub3);
				addColumnPathMap(Lot_Chk03_CndR.$lot_no, PoRecvIf_Chk01_CndR.$bd_lot_no);
				addColumnPathMap(Lot_Chk03_CndR.$sublot_no, PoRecvIf_Chk01_CndR.$bd_sublot_no);
				addColumnPathMap(Lot_Chk03_CndR.$err_flg, PoRecvIf_Chk01_CndR.$err_flg);
			}
		}
		
		protected Map_StrLnUtil_Srch01_CndR_PoRecvIf_Chk01_CndR<StrLnUtil_Srch01_CndR,PoRecvIf_Chk01_CndR> createMap_StrLnUtil_Srch01_CndR_PoRecvIf_Chk01_CndR() {
			return new Map_StrLnUtil_Srch01_CndR_PoRecvIf_Chk01_CndR<StrLnUtil_Srch01_CndR, PoRecvIf_Chk01_CndR>();
		}

		public class Map_StrLnUtil_Srch01_CndR_PoRecvIf_Chk01_CndR<D extends StrLnUtil_Srch01_CndR, S extends PoRecvIf_Chk01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(StrLnUtil_Srch01_CndR.$peg_no, PoRecvIf_Chk01_CndR.$peg_no);
				addColumnPathMap(StrLnUtil_Srch01_CndR.$itm_cd, PoRecvIf_Chk01_CndR.$itm_cd);
				addColumnPathMap(StrLnUtil_Srch01_CndR.$itm_sub1, PoRecvIf_Chk01_CndR.$itm_sub1);
				addColumnPathMap(StrLnUtil_Srch01_CndR.$itm_sub2, PoRecvIf_Chk01_CndR.$itm_sub2);
				addColumnPathMap(StrLnUtil_Srch01_CndR.$itm_sub3, PoRecvIf_Chk01_CndR.$itm_sub3);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.loc_cd(src.in_to_loc_cd());
			}
		}
	}
	
	/**
	 * 処理結果区分にエラーを設定
	 * @param poRecvIfR 発注受信ＩＦ
	 */
	protected void setErrSts(MST_PO_RECV_IF_R poRecvIfR) {
		poRecvIfR.exe_sts_typ(MAC_EXE_STS_TYP.ERR.value());
		setErrSet(poRecvIfR);
	}
	
	/**
	 * 同一取込グループでエラーが発生した場合に、エラーリスト設定に追加する。
	 * @param poRecvIfR 発注受信ＩＦ
	 */
	protected void setErrSet(MST_PO_RECV_IF_R poRecvIfR) {
		List<String> lst = createErrSetKey(poRecvIfR);
		if (!object(CLAZZ)._errSet.contains(lst)) {
			object(CLAZZ)._errSet.add(lst);
		}
	}
	
	/**
	 * 同一取込グループのキー項目のリストを作成する。
	 * @param poRecvIfR 発注受信ＩＦ
	 * @return エラーキー項目のリスト
	 */
	protected List<String> createErrSetKey(MST_PO_RECV_IF_R poRecvIfR) {
		List<String> lst = new ArrayList<String>();
		if (!isNull(poRecvIfR)) {
			lst.add(poRecvIfR.ext_sys_cd());
			lst.add(poRecvIfR.ext_po_no());
		}
		return lst;
	}

	//FMCB CUSTOM END
}