package mcframe.serverMSLA.MSLAL5120;

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
import mcframe.serverMSBB.MSBBL6020.*;	// このimportはFrameManagerの自動生成で追加されました。
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
import static mcframe.commonCore.container.MCRow.*;
import mcframe.serverMABS.MABSL5010.MABSL_SlsUpriService;
import mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR;
import mcframe.serverMAUC.MAUCL0080.MAUCL_StdUpriUtil;
import mcframe.serverMAUC.MAUCL5020.MAUCL_RevDataService;
import mcframe.serverMSBB.MSBBL6020.MSBBL_SloRegService;
import mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR;
import mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR;
import mcframe.serverMSBE.MSBEL5510.*;
import mcframe.serverMSUC.MSUCL0080.MSUCL_SlsUtil;
import mcframe.serverPF.dbc.PFT_SDRV_IF_R;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogger;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCFuncCache;
import mcframe.serverFXUC.FXUCL0170.*;
import mcframe.serverCore.mcjdbc.MCSavepoint;
import mcframe.serverCore.requester.MCServerThreadManager;
import mcframe.serverCore.resource.MCConst;
import mcframe.serverMAUC.MAUCL1060.MAUCL_TrdUtil;
import mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverMBBC.MBBCL5020.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_SloRecvIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_SloRecvIfService_MC extends MSLAL_SloRecvIfService_MC_A{
	//FMCB CUSTOM START
	/**
	 * エラーになったキーの組み合わせを保持する
	 */
	protected Set<List<String>> _errSet = new HashSet<List<String>>();
	
	/**
	 * キャッシュを管理するリクエストオブジェクト
	 */
	protected static final Class<MSLAL_SloRecvIfService> CLAZZ = MSLAL_SloRecvIfService.class;

	protected FXUCL_MCDbcCache<MAM_BP_R> _bpCache;

	protected static MAM_BP_R getBp(SloRecvIf_Chk01_DtlR sloRecvIfR) {
		return object(CLAZZ)._getBp(sloRecvIfR);
	}

	protected MAM_BP_R _getBp(SloRecvIf_Chk01_DtlR sloRecvIfR) {
		
		if (_bpCache == null) {
			_bpCache = new FXUCL_MCDbcCache<MAM_BP_R>(MCQueryApiBuilder.create(MAM_BP_R.create("BP")));
		}
		Comparable<?>[] in = new Comparable[]{sloRecvIfR.cst_cd()};
		return _bpCache.get(in);
	}

	/** 
	 * 税マスタキャッシュ 
	 */
	protected FXUCL_MCDbcCache<MAM_TAX_R> _slsTaxCache = null;
	
	/**
	 * 税率、税区分から税を取得する。
	 * 
	 * @param sloRecvIfR 取込み対象行
	 * @return 税ＣＤ
	 */
	protected String _getSlsTaxCd(SloRecvIf_Chk01_DtlR sloRecvIfR) {
		MAM_TAX_R t = MAM_TAX_R.create("T");

		MCList<MAM_TAX_R> ctaxL = MCList.create(MAM_TAX_R.class);
		MCQueryApiBuilder ctaxL_bldr = MCQueryApiBuilder.create(t);
		
		if (_slsTaxCache == null) {
			_slsTaxCache = new FXUCL_MCDbcCache<MAM_TAX_R>(ctaxL_bldr);
		}
		Comparable<?>[] in = new Comparable[]{sloRecvIfR.tax_rate(), sloRecvIfR.tax_typ(), sloRecvIfR.inc_tax_flg()};
		
		MAM_TAX_R cache = _slsTaxCache.getCache(in);
		if (cache == null) {
			
			ctaxL_bldr.setSelect(t.tax_cd);
			ctaxL_bldr.addWhereWithAnd(t.tax_rate.eq(bind("1")), sloRecvIfR.tax_rate());
			ctaxL_bldr.addWhereWithAnd(t.tax_typ.eq(bind("1")), sloRecvIfR.tax_typ());
			ctaxL_bldr.addWhereWithAnd(t.inc_tax_flg.eq(bind("1")), MCBooleanUtil.booleanToDBString(sloRecvIfR.inc_tax_flg()));
			ctaxL_bldr.addWhereWithAnd(t.sls_flg.eq(value(true)));
			int cnt = dbSelect("MSLAL5120_MAM_TAX_S01", ctaxL, ctaxL_bldr);
			
			if (cnt == 1) {
				cache = ctaxL.get(0);
			}
			else {
				cache = MAM_TAX_R.create();
				if (cnt > 1) {
					cache.tax_rate(sloRecvIfR.tax_rate());
					cache.tax_typ(sloRecvIfR.tax_typ());
					cache.inc_tax_flg(sloRecvIfR.inc_tax_flg());
				}
			}
			
			cache.addNumberColumn("cnt", MCNumber.valueOf(cnt));
			_slsTaxCache.putCache(in, cache);
		}
		
		if (MCNumber.ONE.lt(cache.getNumber("cnt"))) {
			return sloRecvIfR.getStringNE("mst_tax_cd");
		}
		else {
			return cache.tax_cd();
		}
	}
	
	/**
	 * 税率、税区分から税を取得する。
	 * 
	 * @param sloRecvIfR 取込み対象行
	 * @return 税ＣＤ
	 */
	public static String getSlsTaxCd(SloRecvIf_Chk01_DtlR sloRecvIfR) {
		
		return object(CLAZZ)._getSlsTaxCd(sloRecvIfR);
	}
	
	/**
	 * SloRecvIf_Upd01オペレーション.<p>
	 *
	 * 受注受信ＩＦ取込を行う。（ＥＳＢのリアルタイム取込から呼び出される）<br>
	 */
	public class SloRecvIf_Upd01 extends MSLAL_SloRecvIfService_MC_A.SloRecvIf_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			callSloRecvIfUpd02();
		}
		
		/**
		 * 受注受信ＩＦ取込２を実行する。
		 */
		protected void callSloRecvIfUpd02() {
			
			MSLAL_SloRecvIfService.SloRecvIf_Upd02 ope = MSLAL_SloRecvIfService.crtSloRecvIf_Upd02();
			
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
				addColumnPathMap(IfDataImp_Upd01_DtlR.$bp_cd, Upd01_DtlR.$bp_cd);

			}
		}
	}
	
	/**
	 * SloRecvIf_Upd02オペレーション.<p>
	 *
	 * 受注受信ＩＦ取込を行う。（ＩＦデータ確認、および受注ＩＦ取込バッチから呼び出される）<br>
	 */
	public class SloRecvIf_Upd02 extends MSLAL_SloRecvIfService_MC_A.SloRecvIf_Upd02 {
		
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
		 * 受注受信ＩＦリスト 
		 */
		MCList<MST_SLO_RECV_IF_R> _sloRecvIfL = null;
		
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
			
			logger().writeStartLog(MSLAL0001);
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
			
			logger().writeEndLog(MSLAL0002, _totalNum, _okNum, _errNum, _skipNum);
			pushEndLog(logger());
			// Loggerを新規作成した場合（呼出元からLoggerを引き継がない場合）のみクローズ
			if (_crtNewLogger) {
				logger().close();
			}
		}
		
		/**
		 * 受注受信ＩＦデータを取得する。
		 */
		protected void preSrch() {
			
			MAM_EDI_IF_CTL_R m1 = MAM_EDI_IF_CTL_R.create("M1");
			PFT_SDRV_IF_R t2 = PFT_SDRV_IF_R.create("T2");

			_sloRecvIfL = MCList.create(MST_SLO_RECV_IF_R.class);
			MST_SLO_RECV_IF_R t = MST_SLO_RECV_IF_R.create("T");
			MCQueryApiBuilder sloRecvIfL_bldr = MCQueryApiBuilder.create(t);
			_sloRecvIfL.addStringColumn("cred_cd");
			
			sloRecvIfL_bldr.addSelect(MAPA_BP$F_GET_CRED_OF_CST(t.cst_cd).as("cred_cd"));
			
			sloRecvIfL_bldr.addInnerJoin(m1, t.cst_cd.eq(m1.bp_cd).and(m1.if_proc_typ.eq(value(MAC_IF_PROC_TYP.SLO_RECV.value()))).and(m1.st_dt.lte(t.recv_dt)).and(m1.end_dt.gte(t.recv_dt)));
			sloRecvIfL_bldr.addLeftOuterJoin(t2, t.data_no.eq(t2.data_no));
			
			sloRecvIfL_bldr.setWhere(value(0).eq(value(0)));
			sloRecvIfL_bldr.addWhereWithAnd(t2.sdrv_sts_typ.isNull()
							.or(t2.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.RECV_CONV_OK.value()))));
			sloRecvIfL_bldr.addWhereWithAnd(t.imp_flg.eq(value(true)));
			
			if (!up0().isEmpty()) {
				
				sloRecvIfL_bldr.addWhereWithCutOffAnd(t.data_no.eq(bind("data_no")));
				sloRecvIfL_bldr.addWhereWithCutOffAnd(t.ext_data_no.eq(bind("ext_data_no")));
				sloRecvIfL_bldr.addWhereWithCutOffAnd(t.ext_sys_cd.eq(bind("ext_sys_cd")));
				sloRecvIfL_bldr.addWhereWithCutOffAnd(t.cst_cd.eq(bind("bp_cd")));
				dbSelect("MSLAL5120_MST_SLO_RECV_IF_S01", _sloRecvIfL, sloRecvIfL_bldr, up0());
			}
			else {
				dbSelect("MSLAL5120_MST_SLO_RECV_IF_S02", _sloRecvIfL, sloRecvIfL_bldr);
			}
		}

		/**
		 * バッチ用の再引当処理のメイン処理
		 */
		protected void exe() {
		
			callSloRecvIfUpd03();
		}
		
		/**
		 * スレッドを分割し、各スレッドごとに受注受信ＩＦ取込３を実行する。
		 */
		protected void callSloRecvIfUpd03() {
			
			int no = 0;
			
			MSLAL_SloRecvIfService.SloRecvIf_Upd03 upd03 = null;
			
			List<MSLAL_SloRecvIfService.SloRecvIf_Upd03> opeL = new ArrayList<MSLAL_SloRecvIfService.SloRecvIf_Upd03>();
			
			for (MCList<MST_SLO_RECV_IF_R> credGrpL : _sloRecvIfL.groupList("cred_cd")) {
				
				// 与信管理先がある場合は、与信管理先でスレッドを分ける。
				if(!isNull(credGrpL.get(0).getStringNE("cred_cd"))) {
					
					upd03 = MSLAL_SloRecvIfService.crtSloRecvIf_Upd03();
					upd03._no = ++no;
					setAll(upd03.up0(), credGrpL, createMap_SloRecvIf_Upd03_DtlR_MST_SLO_RECV_IF_R());
					
					opeL.add(upd03);
				}
				// 与信管理先がない場合は、得意先でスレッドを分ける。
				else {
					for (MCList<MST_SLO_RECV_IF_R> cstGrpL : credGrpL.groupList(MST_SLO_RECV_IF_R.$cst_cd)) {
						
						upd03 = MSLAL_SloRecvIfService.crtSloRecvIf_Upd03();
						upd03._no = ++no;
						setAll(upd03.up0(), cstGrpL, createMap_SloRecvIf_Upd03_DtlR_MST_SLO_RECV_IF_R());
						
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
					Collections.sort(opeL, new Comparator<MSLAL_SloRecvIfService.SloRecvIf_Upd03>() {
						
						public int compare(MSLAL_SloRecvIfService.SloRecvIf_Upd03 o1, MSLAL_SloRecvIfService.SloRecvIf_Upd03 o2) {
							return (o1.up0().size() - o2.up0().size()) * -1;	// 降順
						}
					});
					
					MCServerThreadManager.invokeAndWait(opeL, FXBAL_BatchLogManager.class);
				}
				
				for (MSLAL_SloRecvIfService.SloRecvIf_Upd03 ope : opeL) {
						
					_totalNum += ope.down0().total_num().intValue();
					_okNum += ope.down0().ok_num().intValue();
					_errNum += ope.down0().err_num().intValue();
					_skipNum += ope.down0().skip_num().intValue();
				}
			}
		}
		
		protected Map_SloRecvIf_Upd03_DtlR_MST_SLO_RECV_IF_R<SloRecvIf_Upd03_DtlR,MST_SLO_RECV_IF_R> createMap_SloRecvIf_Upd03_DtlR_MST_SLO_RECV_IF_R() {
			return new Map_SloRecvIf_Upd03_DtlR_MST_SLO_RECV_IF_R<SloRecvIf_Upd03_DtlR, MST_SLO_RECV_IF_R>();
		}

		public class Map_SloRecvIf_Upd03_DtlR_MST_SLO_RECV_IF_R<D extends SloRecvIf_Upd03_DtlR, S extends MST_SLO_RECV_IF_R> extends MCRowMapper<D,S>{
			@Override
			public void valueCopy(D dest, S src) {
				dest.slo(src);
			}
		}
	}
	
	/**
	 * SloRecvIf_Upd03オペレーション.<p>
	 *
	 * 受注受信ＩＦ取込を行う。（マルチスレッド実行用）<br>
	 */
	public class SloRecvIf_Upd03 extends MSLAL_SloRecvIfService_MC_A.SloRecvIf_Upd03 {
		
		/**
		 * 受注受信ＩＦ取込４4を呼び出す際にデータＮＯ、得意先、得意先注文ＮＯの組み合わせを何件ずつ渡すかのパラメータ
		 */
		protected int _loopCnt = MCConst.app.getInteger("MS.MSLAL5120.loop_size", 100);
		
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
		 * SloRecvIf_Upd04バッチ呼び出しオペレーションから引き継ぐ
		 */
		protected FXBAL_BatchLogger _logger = null;
		
		/**
		 * インスタンス生成元（SloRecvIf_Upd03）でスレッド間でユニークな値を設定
		 */
		protected int _no = 0;
		
		/**
		 * SloRecvIf_Upd04の実行結果リスト
		 */
		protected MCList<SloRecvIf_Upd04_DtlR> _exeRslt = null;
		
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
		 * 受注受信ＩＦ取込処理を実行する。
		 */
		protected void exe() {

			int cnt = 0;
			
			MCList<MST_SLO_RECV_IF_R> tgtL = MCList.create(MST_SLO_RECV_IF_R.class);
			MST_SLO_RECV_IF_R oldR = MST_SLO_RECV_IF_R.create();
			
			for (SloRecvIf_Upd03_DtlR dtlR : up0()) {
				
				MST_SLO_RECV_IF_R keyR = dtlR.slo();
				
				if (isNextData(oldR, keyR)) {
					
					if (!tgtL.isEmpty() && _loopCnt <= cnt) {
						
						callSloRecvIfUpd04(tgtL);
						cnt = 0;
						tgtL.clear();
					}
				}
				
				oldR = keyR;
				cnt++;
				tgtL.add(keyR);
			}
			
			if (!tgtL.isEmpty()) {
				
				callSloRecvIfUpd04(tgtL);
			}
		}
		
		/**
		 * 受注受信ＩＦを実行する。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 */
		protected void callSloRecvIfUpd04(MCList<MST_SLO_RECV_IF_R> sloRecvIfL) {
			
			crtSloRecvIfWk(sloRecvIfL);
			
			MCList<MST_SLO_RECV_IF_R> exeL = srchLockSloRecvIf();
			
			Set<List<String>> afterExtDataSet = srchAfterExtData(exeL);
			
			MSLAL_SloRecvIfService.SloRecvIf_Upd04 ope = MSLAL_SloRecvIfService.crtSloRecvIf_Upd04();
			
			SloRecvIf_Upd04_DtlR upR = null;
			
			MCList<MST_SLO_RECV_IF_R> skipL = MCList.create(MST_SLO_RECV_IF_R.class);
			for (MST_SLO_RECV_IF_R exeR : exeL) {
				
				// 同一の得意先、得意先注文ＮＯでエラーが発生している場合、それ以降のデータは処理しない
				if (isPrevErr(exeR)) {
					
					setErrSts(exeR);
					MCMessagePool.add(exeR, null, MSLAL0003, exeR.data_no(), exeR.data_lno(), exeR.cst_cd(), exeR.cst_po_no());
					skipL.add(exeR);
				}
				// 同一の得意先、得意先注文ＮＯで、新しいデータが既に処理されている場合、スキップする
				else if (isOkSkip(exeR, afterExtDataSet)) {
					
					setSkipSts(exeR);
					MCMessagePool.add(exeR, null, MSLAL0004, exeR.data_no(),exeR.data_lno(), exeR.cst_cd(), exeR.cst_po_no());
					skipL.add(exeR);
				}
				else {
					
					upR = SloRecvIf_Upd04_DtlR.create();
					upR.slo(exeR);
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
			
			delSloRecvIfWk(sloRecvIfL);
		}
		
		/**
		 * 同一キーで新しいデータが既に処理済みかどうか。
		 * @param exeR 取込対象行
		 * @return 処理済みの場合はtrue
		 */
		protected boolean isOkSkip(MST_SLO_RECV_IF_R exeR, Set<List<String>> afterExtDataSet) {
			
			return afterExtDataSet.contains(createErrSetKey(exeR));
		}
		
		/**
		 * 受注受信ＩＦのワークテーブルにデータを登録する。
		 * @param sloRecvIfL 受注受信ＩＦ
		 */
		protected void crtSloRecvIfWk(MCList<MST_SLO_RECV_IF_R> sloRecvIfL) {
			
			dbWkDelete("MSLAL5120_MSW_SLO_RECV_IF_D01", MCQueryApiBuilder.create(MST_SLO_RECV_IF_R.create("T")).getBaseDbc());
			dbWkInsert("MSLAL5120_MSW_SLO_RECV_IF_I01", sloRecvIfL, MCQueryApiBuilder.create(MST_SLO_RECV_IF_R.create("T")).getBaseDbc());
		}
		
		/**
		 * 受注受信ＩＦをロックする。
		 */
		protected MCList<MST_SLO_RECV_IF_R> srchLockSloRecvIf() {

			MSW_SLO_RECV_IF_KEY_R w1 = MSW_SLO_RECV_IF_KEY_R.create("W1");
			PFT_SDRV_IF_R t2 = PFT_SDRV_IF_R.create("T2");

			MCList<MST_SLO_RECV_IF_R> exeL = MCList.create(MST_SLO_RECV_IF_R.class);
			MST_SLO_RECV_IF_R t = MST_SLO_RECV_IF_R.create("T");
			MCQueryApiBuilder exeL_bldr = MCQueryApiBuilder.create(t);
			
			exeL_bldr.addInnerJoin(w1, t.data_lno.eq(w1.data_lno));
			exeL_bldr.addLeftOuterJoin(t2, t.data_no.eq(t2.data_no));
			
			exeL_bldr.setWhere(value(0).eq(value(0)));
			exeL_bldr.addWhereWithAnd(t2.sdrv_sts_typ.isNull()
							.or(t2.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.RECV_CONV_OK.value()))));
			exeL_bldr.addWhereWithAnd(t.imp_flg.eq(value(true)));
			exeL_bldr.addOrderByAsc(t.ext_data_no, t.cst_cd, t.cst_po_no, t.cst_po_d_no);
			exeL_bldr.setLockTable(t.data_lno);
			
			dbSelectForUpdate("MSLAL5120_MST_SLO_RECV_IF_S03", exeL, exeL_bldr);
			
			for (MST_SLO_RECV_IF_R exeR : exeL) {
				
				// log_sub_key1にスレッド間でユニークな値を設定
				exeR.setParamIndex(_no);
			}
			
			_logger.setLogKey(exeL,
					MST_SLO_RECV_IF_R.$batch_log_no,
					MST_SLO_RECV_IF_R.$log_sub_key1,
					MST_SLO_RECV_IF_R.$log_sub_key2);
			
			return exeL;
		}
		
		/**
		 * 同一キーで取込対象より新しいかつ処理済みのデータを取得する。
		 * @param exeL 取込対象リスト
		 * @return 処理済みデータリスト
		 */
		protected Set<List<String>> srchAfterExtData(MCList<MST_SLO_RECV_IF_R> exeL) {
			
			MST_SLO_RECV_IF_R t = MST_SLO_RECV_IF_R.create("T");
			MST_SLO_RECV_IF_R S1ST = MST_SLO_RECV_IF_R.create("ST");

			MCList<MST_SLO_RECV_IF_R> afterL = MCList.create(MST_SLO_RECV_IF_R.class);
			MCQueryApiBuilder afterL_bldr = MCQueryApiBuilder.create(t);
			
			afterL_bldr.setSelect(t.cst_cd, t.cst_po_no);

			afterL_bldr
					.addConstWhereWithAnd(exists(subQuery().select(value("X")).from(S1ST)
							.where(t.ext_data_no.lt(S1ST.ext_data_no)
									.and(t.cst_cd.eq(S1ST.cst_cd))
									.and(t.cst_po_no.eq(S1ST.cst_po_no))
									.and(S1ST.exe_sts_typ.in(
											value(MAC_EXE_STS_TYP.OK.value()),
											value(MAC_EXE_STS_TYP.SKP.value()))))));
			
			dbSelectColumn("MSLAL5120_MST_SLO_RECV_IF_S04", afterL, afterL_bldr, exeL, MST_SLO_RECV_IF_R.$data_lno);

			Set<List<String>> set = new HashSet<List<String>>();
			for (MST_SLO_RECV_IF_R afterR : afterL) {
				
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
		 * @param downL SloRecvIf_Upd04の下り電文
		 */
		protected void mergeExeRslt(MCList<MST_SLO_RECV_IF_R> skipL, MCList<SloRecvIf_Upd04_DtlR> downL) {
			
			_exeRslt = MCList.create(SloRecvIf_Upd04_DtlR.class);
			_exeRslt.setAll(downL);
			
			SloRecvIf_Upd04_DtlR dtlR = null;
			
			for (MST_SLO_RECV_IF_R skipR : skipL) {
				
				dtlR = SloRecvIf_Upd04_DtlR.create();
				dtlR.data_lno(skipR.data_lno());
				dtlR.exe_sts_typ(skipR.exe_sts_typ());
				_exeRslt.add(dtlR);
			}
		}
		
		/**
		 * 受注受信ＩＦ取込の後処理。
		 * @param exeL 取込対象リスト
		 */
		protected void afterCall(MCList<MST_SLO_RECV_IF_R> exeL) {
			
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
			
			MCIndexKey ik = _exeRslt.createIndex(MST_SLO_RECV_IF_R.$log_sub_key1, MST_SLO_RECV_IF_R.$log_sub_key2);

			for (MCMessage msg : msgList) {
				MCRow causeRow = msg.getCauseRow();
				if (causeRow == null) {
					continue;
				}
				
				SloRecvIf_Upd04_DtlR exeR;
				if (causeRow instanceof SloRecvIf_Upd04_DtlR) {
					exeR = (SloRecvIf_Upd04_DtlR)causeRow;
				}
				else {
					MCNumber paramIndex = MCNumber.valueOf(causeRow.getParamIndex());
					MCNumber paramRowIndex = MCNumber.valueOf(causeRow.getParamRowIndex());
					
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
		 * 受注受信ＩＦを更新する。
		 * @param exeL 取込対象リスト
		 */
		protected void updIf(MCList<MST_SLO_RECV_IF_R> exeL) {
			
			MST_SLO_RECV_IF_R t = MST_SLO_RECV_IF_R.create("T");
			MCQueryApiBuilder exeL_bldr = MCQueryApiBuilder.create(t);
			

			exeL_bldr.setSet(t.imp_flg, t.exe_sts_typ, t.batch_log_no, t.log_sub_key1, t.log_sub_key2);
			dbUpdateKey("MSLAL5120_MST_SLO_RECV_IF_U01", exeL, exeL_bldr);
		}

		/**
		 * 取込結果の件数を算出する。
		 * @param exeL 取込対象リスト
		 */
		protected void rsltCnt(MCList<MST_SLO_RECV_IF_R> exeL) {
			
			MCIndexKey idxkey = _exeRslt.createIndex(SloRecvIf_Upd03_DtlR.$data_lno);
			
			for (MST_SLO_RECV_IF_R exeR : exeL) {
				
				SloRecvIf_Upd04_DtlR exeRslt = _exeRslt.getFirst(idxkey, exeR.data_lno());

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
		protected void setSkipSts(MST_SLO_RECV_IF_R exeR) {

			exeR.exe_sts_typ(MAC_EXE_STS_TYP.SKP.value());
		}
		
		/**
		 * 処理結果区分にエラーを設定する。
		 * 
		 * @param exeR 取込対象行
		 */
		protected void setErrSts(MST_SLO_RECV_IF_R exeR) {

			exeR.exe_sts_typ(MAC_EXE_STS_TYP.ERR.value());
			setErrSet(exeR);
		}
		
		/**
		 * 引数で渡された比較対象が同一取込単位かどうか。
		 * @param preR 前の取込対象
		 * @param exeR　取込対象
		 * @return 取込単位のいずれかが異なる場合はtrue
		 */
		protected boolean isNextData(MST_SLO_RECV_IF_R preR, MST_SLO_RECV_IF_R exeR) {
			
			return !(isSame(preR.ext_data_no(), exeR.ext_data_no())
					&& isSame(preR.cst_cd(), exeR.cst_cd())
					&& isSame(preR.cst_po_no(), exeR.cst_po_no()));


		}
		
		/**
		 * 受注受信ＩＦワークテーブルのデータを削除する。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 */
		protected void delSloRecvIfWk(MCList<MST_SLO_RECV_IF_R> sloRecvIfL) {
			dbWkDelete("MSLAL5120_MSW_SLO_RECV_IF_D02", MCQueryApiBuilder.create(MST_SLO_RECV_IF_R.create("T")).getBaseDbc());
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
	 * SloRecvIf_Upd04オペレーション.<p>
	 *
	 * 受注受信ＩＦ取込を行う。（受注登録サービスを呼び出す本処理）<br>
	 */
	public class SloRecvIf_Upd04 extends MSLAL_SloRecvIfService_MC_A.SloRecvIf_Upd04 {
		
		/**
		 * 受注受信ＩＦ取込チェックオペレーション
		 */
		protected MSLAL_SloRecvIfService.SloRecvIf_Chk01 _sloRecvIfChk = null;
		
		/**
		 * 受注登録サービスの登録チェックオペレーション
		 */
		protected MSBBL_SloRegService.Slo_Chk01 _chk01Serv = null;
		
		/**
		 * 受注ヘッダ削除リスト
		 */
		MCList<Slo_Del01_HdrR> _delHdrL = null;
		
		/**
		 * 受注明細削除リスト
		 */
		MCList<Slo_Del01_DtlR> _delDtlL = null;
		
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
			up0().setString(SloRecvIf_Upd04_DtlR.$exe_sts_typ, MAC_EXE_STS_TYP.NOT_EXE.value());
			up0().sort(getGrpKey());
		}
		
		/**
		 * 登録処理
		 */
		protected void proc() {

			MCSavepoint sp = null;
			MCList<SloRecvIf_Upd04_DtlR>[] grp = getGrp();

			MCMessageList msgList = new MCMessageList();
			msgList.addAll(MCMessagePool.getMessageList());
			
			for (MCList<SloRecvIf_Upd04_DtlR> sloRecvIfL : grp) {
				
				// 異なる受注の間に影響が発生しないように、メッセージプールをクリアする
				MCMessagePool.clear();
				
				try {
					callThisChk01(sloRecvIfL);
					
					int errRowCnt = sloRecvIfL.subList(r -> isErr(r.slo())).size();
					if (sloRecvIfL.size() == errRowCnt) {
						continue;
					}
					else if (errRowCnt != 0) {
						sloRecvIfL = sloRecvIfL.subList(r -> !isErr(r.slo()));
						
						// callThisChk01で発生したエラーが、受注登録サービスのチェックに
						// 影響しないようにメッセージプールをクリアする
						msgList.addAll(MCMessagePool.getMessageList());
						MCMessagePool.clear();
					}
					
					sp = setSavepoint();
					callSloRegService(sloRecvIfL);
				}
				catch (Exception ex) {
					handleEx(ex, sp, sloRecvIfL);
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
		 * 受注受信ＩＦ取込チェックを実行する。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 */
		protected void callThisChk01(MCList<SloRecvIf_Upd04_DtlR> sloRecvIfL) {
			
			_sloRecvIfChk = MSLAL_SloRecvIfService.crtSloRecvIf_Chk01();
			setAll(_sloRecvIfChk.up0(), sloRecvIfL, createMap_SloRecvIf_Chk01_DtlR_SloRecvIf_Upd04_DtlR());
			_sloRecvIfChk.exec();
			
			MCIndexKey idxkey = _sloRecvIfChk.down0().createIndex(SloRecvIf_Chk01_DtlR.$data_lno);
			
			for (SloRecvIf_Upd04_DtlR dtlR : sloRecvIfL) {
				SloRecvIf_Chk01_DtlR chkRsltR = _sloRecvIfChk.down0().getFirst(idxkey, dtlR.data_lno());
				
				if (chkRsltR.err_flg()) {
					setErrSts(dtlR.slo());
				}
				// プッシュ通知用
				dtlR.sls_usr_cd(chkRsltR.sls_usr_cd());
				dtlR.wg_cd(chkRsltR.dpt_wg_cd());
			}
			
			chkGrpErr(sloRecvIfL);
		}
		
		/**
		 * 受注登録サービスを実行する。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 */
		protected void callSloRegService(MCList<SloRecvIf_Upd04_DtlR> sloRecvIfL) {
			
			callSloServiceDel(sloRecvIfL);
			
			callSloServiceChk01(sloRecvIfL);
			
			MCMessageList msgList = new MCMessageList();
			msgList.addAll(MCMessagePool.getMessageList());
			MCMessagePool.clear();
			try {
				callSloServiceIns01(sloRecvIfL);
				
				callSloServiceUpd01(sloRecvIfL);
			}
			finally {
				MCMessagePool.addAll(msgList);
				if (!isNull(_delHdrL) && !isNull(_delDtlL)) {
					_delHdrL.clear();
					_delDtlL.clear();
				}
			}
			
			setOk(sloRecvIfL);
		}
		
		/**
		 * 受注登録サービスの削除前チェックと受注削除を実行する。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 */
		protected void callSloServiceDel(MCList<SloRecvIf_Upd04_DtlR> sloRecvIfL) {
			
			if (_sloRecvIfChk.down3().isEmpty()) {
				
				return;
			}
			
			_delHdrL = MCList.create(Slo_Del01_HdrR.class);
			
			_delDtlL = MCList.create(Slo_Del01_DtlR.class);
			_delDtlL.addStringColumn("slo_no");
			
			MCIndexKey idxkey = _sloRecvIfChk.down4().createIndex("slo_no");
			
			MCSavepoint sp = setSavepoint();
			boolean errFlg = false;
			
			for (Slo_Del01_HdrR delHdrR : _sloRecvIfChk.down3()) {
				// 受注登録サービスの削除前チェックを実行する。
				MSBBL_SloRegService.Slo_Chk03 chk03Serv = MSBBL_SloRegService.crtSlo_Chk03();
				copyall(chk03Serv.up0(), delHdrR);
				chk03Serv.up1().setAll(_sloRecvIfChk.down4().subList(idxkey, delHdrR.slo_no()));
				chk03Serv.exec();
				
				// チェック結果を格納する
				_delHdrL.add(chk03Serv.down0().clone());
				MCList<Slo_Del01_DtlR> dtlL = chk03Serv.down1().clone();
				dtlL.setValueNE("slo_no", delHdrR.slo_no());
				_delDtlL.addAll(dtlL);
				
				errFlg = isErrChk03(chk03Serv) ? true : errFlg;
				if (errFlg) {
					continue;
				}
				
				// 受注登録サービスの受注削除を実行する。
				MSBBL_SloRegService.Slo_Del01 del01Serv = MSBBL_SloRegService.crtSlo_Del01();
				copyall(del01Serv.up0(), chk03Serv.down0());
				del01Serv.up1().setAll(dtlL);
				del01Serv.exec();
			}
			
			callAttachServiceDel();
			setSloServiceChk03Err(sloRecvIfL);
			
			if (errFlg) {
				dbTran().rollback(sp);
			}
		}
		
		/**
		 * 受注登録サービスの削除前チェックがエラーかどうか。
		 * @param chk03Serv 受注登録サービスの削除前チェック結果
		 * @return 削除前チェック結果がエラーはtrue
		 */
		protected boolean isErrChk03(MSBBL_SloRegService.Slo_Chk03 chk03Serv) {
			
			MCList<Slo_Del01_DtlR> errDtlL = chk03Serv.down1().subList(Slo_Del01_DtlR.$err_flg, true);
			
			return chk03Serv.down0().err_flg() || !errDtlL.isEmpty();
		}
		
		/**
		 * 受注登録サービスの削除前チェック結果を受注受信ＩＦに反映する。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 */
		protected void setSloServiceChk03Err(MCList<SloRecvIf_Upd04_DtlR> sloRecvIfL) {
			
			for (SloRecvIf_Upd04_DtlR dtlR : sloRecvIfL) {
				
				MCList<Slo_Del01_HdrR> errHdrL = _delHdrL.subList(r -> r.getParamRowIndex() == dtlR.getParamRowIndex() && r.err_flg());
				
				if (!errHdrL.isEmpty()) {
					setErrSts(dtlR.slo());
				}
				
				MCList<Slo_Del01_DtlR> errDtlL = _delDtlL.subList(r -> r.getParamRowIndex() == dtlR.getParamRowIndex()&& r.err_flg());
				
				if (!errDtlL.isEmpty()) {
					setErrSts(dtlR.slo());
				}
			}
			
			chkGrpErr(sloRecvIfL);
		}
		
		/**
		 * 受注登録サービスの登録チェックを実行する。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 */
		protected void callSloServiceChk01(MCList<SloRecvIf_Upd04_DtlR> sloRecvIfL) {
			
			_chk01Serv = MSBBL_SloRegService.crtSlo_Chk01();
			
			if (_sloRecvIfChk.down1().isEmpty()) {
				
				return;
			}
			
			_chk01Serv.up0().setAll(_sloRecvIfChk.down1().subList(Slo_Upd01_HdrR.$err_flg ,false));
			_chk01Serv.up1().setAll(_sloRecvIfChk.down2().subList(Slo_Upd01_DtlR.$err_flg ,false));
			
			_chk01Serv.exec();
			
			setSloServiceChk01Err(sloRecvIfL);
		}
		
		/**
		 * 受注登録サービスの登録チェック結果を受注受信ＩＦに反映する。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 */
		protected void setSloServiceChk01Err(MCList<SloRecvIf_Upd04_DtlR> sloRecvIfL) {
			
			for (SloRecvIf_Upd04_DtlR dtlR : sloRecvIfL) {
				
				MCList<Slo_Upd01_HdrR> errHdrL = _chk01Serv.down0().subList(r -> r.getParamRowIndex() == dtlR.getParamRowIndex() && r.err_flg());
				
				if (!errHdrL.isEmpty()) {
					setErrSts(dtlR.slo());
				}
				
				MCList<Slo_Upd01_DtlR> errDtlL = _chk01Serv.down1().subList(r -> r.getParamRowIndex() == dtlR.getParamRowIndex() && r.err_flg());
				
				if (!errDtlL.isEmpty()) {
					setErrSts(dtlR.slo());
				}
			}
			
			chkGrpErr(sloRecvIfL);
		}
		
		/**
		 * 受注登録サービスの受注登録を実行する。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 */
		protected void callSloServiceIns01(MCList<SloRecvIf_Upd04_DtlR> sloRecvIfL) {
			
			if (isNull(sloRecvIfL.subList(r -> !MAC_EXE_STS_TYP.isERR(r.exe_sts_typ())))
					|| _chk01Serv.down0().isEmpty()) {
				
				return;
			}
			
			MSBBL_SloRegService.Slo_Ins01 ins01Serv = MSBBL_SloRegService.crtSlo_Ins01();
			MCIndexKey idxkey = _chk01Serv.down1().createIndex(Slo_Upd01_DtlR.$hdr_peg_no);
			
			for (Slo_Upd01_HdrR hdrR : _chk01Serv.down0()) {
				
				if (hdrR.err_flg()) {
					continue;
				}
				if (MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ())) {
					
					MCList<Slo_Upd01_DtlR> sloDtlL = _chk01Serv.down1().subList(idxkey, hdrR.peg_no());
					MCList<Slo_Upd01_DtlR> notErrSloDtlL = sloDtlL.subList(Slo_Upd01_DtlR.$err_flg, false);
					if (notErrSloDtlL.size() != 0) {
						ins01Serv.up0().add(hdrR);
						ins01Serv.up1().addAll(notErrSloDtlL);
					}
				}
			}
			
			if (!ins01Serv.up0().isEmpty()) {
				ins01Serv.exec();
				callAttachServiceUpd(ins01Serv.down0(), ins01Serv.down1());
			}
		}
		
		/**
		 * 受注登録サービスの受注更新を実行する。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 */
		protected void callSloServiceUpd01(MCList<SloRecvIf_Upd04_DtlR> sloRecvIfL) {
			
			if (isNull(sloRecvIfL.subList(r -> !MAC_EXE_STS_TYP.isERR(r.exe_sts_typ())))
					|| _chk01Serv.down0().isEmpty()) {
				
				return;
			}
			
			MSBBL_SloRegService.Slo_Upd01 upd01Serv = MSBBL_SloRegService.crtSlo_Upd01();
			
			MCIndexKey idxkey = _chk01Serv.down1().createIndex(Slo_Upd01_DtlR.$hdr_peg_no);
			
			for (Slo_Upd01_HdrR hdrR : _chk01Serv.down0()) {
				
				if (hdrR.err_flg()) {
					continue;
				}
				if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())) {
					
					MCList<Slo_Upd01_DtlR> sloDtlL = _chk01Serv.down1().subList(idxkey, hdrR.peg_no());
					if (!isNull(sloDtlL.getFirst(Slo_Upd01_DtlR.$err_flg, true))) {
						continue;
					}
					upd01Serv.up0().add(hdrR);
					
					upd01Serv.up1().addAll(sloDtlL);
				}
			}
			
			if (!upd01Serv.up0().isEmpty()) {
				MAUCL_RevDataService.RevData_Upd02 revServ = MAUCL_RevDataService.crtRevData_Upd02();
				revServ.exec();
				
				upd01Serv.exec();
				callAttachServiceUpd(upd01Serv.down0(), upd01Serv.down1());
			}
		}

		/**
		 * 更新処理例外発生時の後処理を行う。
		 * @param ex 例外
		 * @param sp セーブポイント
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 */
		protected void handleEx(Exception ex, MCSavepoint sp, MCList<SloRecvIf_Upd04_DtlR> sloRecvIfL) {

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

			for (SloRecvIf_Upd04_DtlR opeRow : sloRecvIfL) {
				
				MCMessagePool.add(opeRow, null, MSLAL0005, opeRow.data_no(), opeRow.data_lno(), msgId, msg);
				for (MCMessage causeMsg : causeMsgList) {
					MCMessage newMsg = new MCMessage(opeRow, null, causeMsg.getID(), (Object[])causeMsg.getBindArray());
					MCMessagePool.add(newMsg);
				}
				
				setErr(opeRow.slo());
			}
			
			if (sp != null) {
				
				dbTran().rollback(sp);
			}
		}
		
		protected MCIndexKey _idxkeyDown1;
		protected MCIndexKey _idxkeyDown2;
		protected MCIndexKey _idxkeyDown2ByHdr;
		protected MCIndexKey _idxkeyDown2ByHdrlno;
		
		/**
		 * 同一取込単位のうち、エラーが存在するかどうかチェックする。<br>
		 * 一部でもエラーがあったら全てエラーとする。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 */
		protected void chkGrpErr(MCList<SloRecvIf_Upd04_DtlR> sloRecvIfL) {
			_idxkeyDown1 = _sloRecvIfChk.down1().createIndex(Slo_Upd01_HdrR.$peg_no);
			_idxkeyDown2 = _sloRecvIfChk.down2().createIndex(Slo_Upd01_DtlR.$data_lno);
			_idxkeyDown2ByHdr = _sloRecvIfChk.down2().createIndex(Slo_Upd01_DtlR.$hdr_peg_no);
			_idxkeyDown2ByHdrlno = _sloRecvIfChk.down2().createIndex(Slo_Upd01_DtlR.$hdr_peg_no, Slo_Upd01_DtlR.$data_lno);
			
			for (MCList<SloRecvIf_Upd04_DtlR> l : sloRecvIfL.groupList(MST_SLO_RECV_IF_R.$cst_cd, MST_SLO_RECV_IF_R.$cst_po_no)) {
				l.sort(SloRecvIf_Upd04_DtlR.$ext_data_no);
				SloRecvIf_Upd04_DtlR errR1 = l.getFirst(SloRecvIf_Upd04_DtlR.$exe_sts_typ, MAC_EXE_STS_TYP.ERR.value());
				if (errR1 != null) {
					setListErrFlgBySloD(l);
					setListErrFlgBySloRecvIf(l, l.getFirst(SloRecvIf_Upd04_DtlR.$exe_sts_typ, MAC_EXE_STS_TYP.ERR.value()));
					setListErrFlgBySlo(l, errR1);
				}
				else {
					MCList<SloRecvIf_Upd04_DtlR> errSloRecvIfL = setListErrFlgBySloD(l);
					if (!isNull(errSloRecvIfL)) {
						errSloRecvIfL.sort(SloRecvIf_Upd04_DtlR.$ext_data_no);
						setListErrFlgBySloRecvIf(l, errSloRecvIfL.get(0));
						
					}
				}
			}
		}

		protected MCList<SloRecvIf_Upd04_DtlR> setListErrFlgBySloD(MCList<SloRecvIf_Upd04_DtlR> l) {
			if (isNull(_sloRecvIfChk.down2()) || _sloRecvIfChk.down2().isEmpty()) {
				return null;
			}
			MCList<SloRecvIf_Upd04_DtlR> errSloRecvIfL = MCList.create(SloRecvIf_Upd04_DtlR.class);
			for (SloRecvIf_Upd04_DtlR sloRecvIfR : l) {
				errSloRecvIfL.add(setRowErrFlgBySloD(sloRecvIfR));
			}
			return errSloRecvIfL;
		}

		protected SloRecvIf_Upd04_DtlR setRowErrFlgBySloD(SloRecvIf_Upd04_DtlR sloRecvIfR) {
			if (isNull(_sloRecvIfChk.down2()) || _sloRecvIfChk.down2().isEmpty()) {
				return null;
			}
			Slo_Upd01_DtlR sloDR = _sloRecvIfChk.down2().getFirst(_idxkeyDown2, sloRecvIfR.data_lno());
			
			if (isNull(sloDR)) {
				return null;
			}
			MCList<Slo_Upd01_DtlR> sloDL = _sloRecvIfChk.down2().subList(_idxkeyDown2ByHdrlno, sloDR.hdr_peg_no(), null);
			if (!isNull(sloDL.getFirst(Slo_Upd01_DtlR.$err_flg, true))) {
				MCMessagePool.add(sloRecvIfR, null, MSLAL0650,
						sloRecvIfR.data_no(), sloRecvIfR.data_lno(), sloRecvIfR.slo().cst_cd(),
						sloRecvIfR.slo().cst_po_no(),sloRecvIfR.slo().cst_po_d_no(), _sloRecvIfChk.down1().getFirst(_idxkeyDown1, sloDR.hdr_peg_no()).slo_no());
				setErr(sloRecvIfR.slo());
				
				_sloRecvIfChk.down2().subList(_idxkeyDown2ByHdr, sloDR.hdr_peg_no()).setBoolean("err_flg", true);
				_sloRecvIfChk.down1().getFirst(_idxkeyDown1, sloDR.hdr_peg_no()).setBoolean("err_flg", true);
				return sloRecvIfR;
			}
			return null;
		}

		protected void setListErrFlgBySlo(MCList<SloRecvIf_Upd04_DtlR> l, SloRecvIf_Upd04_DtlR errR1) {
			MCIndexKey idxkey_down1 = _sloRecvIfChk.down1().createIndex(Slo_Upd01_HdrR.$cst_cd, Slo_Upd01_HdrR.$cst_po_no, Slo_Upd01_HdrR.$cst_po_rev);
			//down2はレコードにない既存の受注明細も含まれているため、対応する明細が全明細エラーの場合、ヘッダごとエラーにする必要がある
			int errDtlRowCnt = l.subList(r -> isErr(r.slo())).size();
			if (!isNull(_sloRecvIfChk.down1()) && l.size() == errDtlRowCnt) {
				if (_sloRecvIfChk.down1().contains(idxkey_down1, errR1.cst_cd(), errR1.cst_po_no(), errR1.cst_po_rev())) {
					_sloRecvIfChk.down1()
							.getFirst(idxkey_down1, errR1.cst_cd(), errR1.cst_po_no(), errR1.cst_po_rev())
							.setBoolean("err_flg", true);
					MCNumber hdr_peg_no = _sloRecvIfChk.down1()
							.getFirst(idxkey_down1, errR1.cst_cd(), errR1.cst_po_no(), errR1.cst_po_rev())
							.getNumber(Slo_Upd01_HdrR.$peg_no);
					_sloRecvIfChk.down2()
							.subList(Slo_Upd01_DtlR.$hdr_peg_no, hdr_peg_no)
							.setBoolean("err_flg", true);
				}
			}
		}

		protected void setListErrFlgBySloRecvIf(MCList<SloRecvIf_Upd04_DtlR> l, SloRecvIf_Upd04_DtlR errR1) {
			for (SloRecvIf_Upd04_DtlR sloRecvIfR : l) {
				if (errR1.ext_data_no().lte(sloRecvIfR.ext_data_no())) {
					if (!isErr(sloRecvIfR.slo())) {
						MCMessagePool.add(sloRecvIfR, null, MSLAL0006, sloRecvIfR.data_no(), sloRecvIfR.data_lno(), sloRecvIfR.cst_cd(), sloRecvIfR.cst_po_no());
						setErr(sloRecvIfR.slo());
						if (!isNull(_sloRecvIfChk.down2())) {
							Slo_Upd01_DtlR cstPoDR = _sloRecvIfChk.down2().getFirst(_idxkeyDown2, sloRecvIfR.data_lno());
							if (!isNull(cstPoDR)) {
								cstPoDR.setBoolean(Slo_Upd01_DtlR.$err_flg, true);
							}
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
		 * 取込単位で受注受信ＩＦ情報をグループ化する。
		 * @return 取込単位のグループ
		 */
		protected MCList<SloRecvIf_Upd04_DtlR>[] getGrp() {
			
			MCList<SloRecvIf_Upd04_DtlR>[] arr = groupList(up0(), getGrpKey());
			List<MCList<SloRecvIf_Upd04_DtlR>> ret = mergeNewDtlL(arr);
			return ret.toArray(new MCList[ret.size()]);
		}

		/**
		 * 新規取り込みデータが連続している場合は更にまとめる。
		 * @param dtlListArray {@link #getGrpKey()}でグループ化したリスト
		 * @return ret 新規取り込みデータをマージしたリスト
		 */
		protected List<MCList<SloRecvIf_Upd04_DtlR>> mergeNewDtlL(
				MCList<SloRecvIf_Upd04_DtlR>[] dtlListArr) {
			List<MCList<SloRecvIf_Upd04_DtlR>> ret = new ArrayList<>();
			MCList<SloRecvIf_Upd04_DtlR> mergeDestL = MCList
					.create(SloRecvIf_Upd04_DtlR.class);
			boolean isMerging = false;

			for (MCList<SloRecvIf_Upd04_DtlR> dtlL : dtlListArr) {
				if (isNewDtlOnly(dtlL)) {
					mergeDestL.addAll(dtlL);
					isMerging = true;
				}
				else {
					if (isMerging) {
						ret.add(mergeDestL);
						isMerging = false;
						mergeDestL = MCList.create(SloRecvIf_Upd04_DtlR.class);
					}
					ret.add(dtlL);
				}
			}

			if (isMerging) {
				ret.add(mergeDestL);// IFデータが全て新規の場合
			}
			return ret;
		}

		protected boolean isNewDtlOnly(MCList<SloRecvIf_Upd04_DtlR> dtlL) {
			for (SloRecvIf_Upd04_DtlR r : dtlL) {
				if (!MAC_DATA_CRUD_TYP.isCRT(r.slo().data_crud_typ())) {
					return false;
				}
			}
			return true;
		}
		/**
		 * 引数のキーの順番を意識したグループリストを取得する。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 * @param key グループ化の基準カラム名
		 * @return　取込単位のグループ
		 */
		protected MCList<SloRecvIf_Upd04_DtlR>[] groupList(MCList<SloRecvIf_Upd04_DtlR> sloRecvIfL, String[] key) {
			
			MCList<SloRecvIf_Upd04_DtlR>[] arr = sloRecvIfL.groupList(key);

			Arrays.sort(arr, new Comparator<MCList<SloRecvIf_Upd04_DtlR>>() {
				
				public int compare(MCList<SloRecvIf_Upd04_DtlR> o1, MCList<SloRecvIf_Upd04_DtlR> o2) {
					
					SloRecvIf_Upd04_DtlR r1 = o1.get(0), r2 = o2.get(0);
					
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
									val = r1.cst_po_no().compareTo(r2.cst_po_no());
								}
								else if (isNull(r1.cst_po_rev()) && isNull(r2.cst_po_rev())) {
									val = 0;
								}
								else {
									val = 1;
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
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 */
		protected void setOk(MCList<SloRecvIf_Upd04_DtlR> sloRecvIfL) {
			
			for (SloRecvIf_Upd04_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (!isErr(sloRecvIfR.slo())) {
					sloRecvIfR.exe_sts_typ(MAC_EXE_STS_TYP.OK.value());
				}
			}
		}
		
		/**
		 * 処理結果区分にエラーを設定する。
		 * @param sloRecvIfR 受注受信ＩＦ
		 */
		protected void setErr(MST_SLO_RECV_IF_R sloRecvIfR) {
			setErrSts(sloRecvIfR);
		}
		
		/**
		 * 受注受信ＩＦの処理結果区分がエラーかどうか。
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @return 処理結果区分がエラーはtrue
		 */
		protected boolean isErr(MST_SLO_RECV_IF_R sloRecvIfR) {
			
			return MAC_EXE_STS_TYP.isERR(sloRecvIfR.exe_sts_typ());
		}
		

		/**
		 * 同一取込グループのキーを返す。
		 * @return 同一取込グループのキー
		 */
		protected String[] getGrpKey() {
			
			return new String[] { 
					MST_SLO_RECV_IF_R.$ext_data_no,
					MST_SLO_RECV_IF_R.$cst_cd,
					MST_SLO_RECV_IF_R.$cst_po_no,
					MST_SLO_RECV_IF_R.$cst_po_rev};
		}
		
		protected Map_SloRecvIf_Chk01_DtlR_SloRecvIf_Upd04_DtlR<SloRecvIf_Chk01_DtlR,SloRecvIf_Upd04_DtlR> createMap_SloRecvIf_Chk01_DtlR_SloRecvIf_Upd04_DtlR() {
			return new Map_SloRecvIf_Chk01_DtlR_SloRecvIf_Upd04_DtlR<SloRecvIf_Chk01_DtlR, SloRecvIf_Upd04_DtlR>();
		}

		public class Map_SloRecvIf_Chk01_DtlR_SloRecvIf_Upd04_DtlR<D extends SloRecvIf_Chk01_DtlR, S extends SloRecvIf_Upd04_DtlR> extends MCRowMapper<D,S>{
			@Override
			public void valueCopy(D dest, S src) {
				
				dest.slo(src.slo());
				dest.setParamIndex(src.slo().getParamIndex());
				dest.setParamRowIndex(src.slo().getParamRowIndex());
			}
		}
		
		/***
		 * 受注の削除リストを元に、添付帳票登録サービスを呼出（削除）。
		 */
		protected void callAttachServiceDel() {
			MCIndexKey idxkey1 = _delDtlL.createIndex("slo_no");
			MBBCL_AttachService.Attach_Upd01 opAttcUpd= MBBCL_AttachService.crtAttach_Upd01();
			MBBCL_AttachService.Attach_Del01 opAttcDel = MBBCL_AttachService.crtAttach_Del01();
			
			// up1電文
			opAttcUpd.up1().upd_cntr_chk_flg(false);
			
			for (Slo_Del01_HdrR delHdrR : _delHdrL) {
				MCNumber amtSum = new MCNumber(0);
				MCDate recvDt = new MCDate();
				boolean isRecvDateGet = false;
				
				// 添付帳票登録サービス（削除）の電文作成
				Attach_Chk02_DtlR attcDelUp = Attach_Chk02_DtlR.create();
				attcDelUp.biz_typ(MAC_BIZ_TYP.SLO_EDI.value());
				attcDelUp.biz_key1(delHdrR.slo_no());
				attcDelUp.biz_key2(delHdrR.slo_rev().toString());
				attcDelUp.report_id("MSLAR0020");
				opAttcDel.up0().add(attcDelUp);
				
				MCList<Slo_Del01_DtlR> dL = _delDtlL.subList(idxkey1, delHdrR.slo_no());
				for (Slo_Del01_DtlR d : dL) {
					
					// up2(List2)電文作成
					Attach_Upd01_Dtl2R up2 = Attach_Upd01_Dtl2R.create();
					if (!isNull(d.data_lno())) {
						up2.biz_typ(MAC_BIZ_TYP.SLO_EDI.value());
						up2.report_id("MSLAR0020");
						up2.biz_key1(delHdrR.slo_no());
						up2.biz_key2(delHdrR.slo_rev().toString());
						up2.data_lno(d.data_lno());
						opAttcUpd.up2().add(up2);
					}
					
					if (!isRecvDateGet && !isNull(d.recv_dt())) {
						recvDt = d.recv_dt();
						isRecvDateGet = true;
					}
					
					amtSum = amtSum.add(nvl(d.trd_cur_amt(), MCNumber.ZERO));
					amtSum = amtSum.add(nvl(d.trd_cur_tax_amt(), MCNumber.ZERO));
				}
				
				// up(List1)電文作成
				Attach_Chk01_DtlR attcUp = Attach_Chk01_DtlR.create();
				attcUp.biz_typ(MAC_BIZ_TYP.SLO_EDI.value());
				attcUp.report_id("MSLAR0020");
				attcUp.biz_key1(delHdrR.slo_no());
				attcUp.biz_key2(delHdrR.slo_rev().toString());
				attcUp.dt(recvDt);
				attcUp.bp_cd(delHdrR.cst_cd());
				attcUp.amt(amtSum);
				attcUp.cur_cd(delHdrR.trd_cur_cd());
				attcUp.wg_cd(delHdrR.wg_cd());
				attcUp.sls_dpt_cd(delHdrR.sls_dpt_cd());
				attcUp.wrk_no(delHdrR.wrk_no());
				attcUp.tterm_cd1(delHdrR.tterm_cd1());
				attcUp.tterm_cd2(delHdrR.tterm_cd2());
				attcUp.tterm_cd3(delHdrR.tterm_cd3());
				attcUp.edi_sub_char1(delHdrR.edi_sub_char1());
				attcUp.edi_sub_char2(delHdrR.edi_sub_char2());
				attcUp.edi_sub_char3(delHdrR.edi_sub_char3());
				attcUp.edi_sub_char4(delHdrR.edi_sub_char4());
				attcUp.edi_sub_char5(delHdrR.edi_sub_char5());
				attcUp.if_proc_typ(MAC_IF_PROC_TYP.SLO_RECV.value());
				
				opAttcUpd.up0().add(attcUp);
			}
			
			if (opAttcUpd.up0().size() > 0) {
				opAttcUpd.exec();
			}
			if (opAttcDel.up0().size() > 0) {
				opAttcDel.exec();
			}
		}
		
		/***
		 * 受注登録サービスの実行結果（下り電文）を元に、添付帳票登録サービスを呼出（登録、更新）
		 * 
		 * @param hdrL
		 * @param dtlL
		 */
		protected void callAttachServiceUpd(MCList<Slo_Ins01_Rslt_HdrR> hdrL, MCList<Slo_Ins01_Rslt_DtlR> dtlL) {
			MCIndexKey idxkey1 = dtlL.createIndex(Slo_Ins01_Rslt_DtlR.$hdr_peg_no);
			MBBCL_AttachService.Attach_Upd01 opAttc = MBBCL_AttachService.crtAttach_Upd01();
			
			// up1電文
			opAttc.up1().upd_cntr_chk_flg(false);
			
			MCNumber cntHdrRow = new MCNumber(0);
			
			for (Slo_Ins01_Rslt_HdrR hdrR : hdrL) {
				MCNumber amtSum = new MCNumber(0);
				MCDate recvDt = new MCDate();
				boolean isRecvDateGet = false;
				
				MCList<Slo_Ins01_Rslt_DtlR> dL = dtlL.subList(idxkey1, cntHdrRow);
				for (Slo_Ins01_Rslt_DtlR d : dL) {
					
					// up2(List2)電文作成
					Attach_Upd01_Dtl2R up2 = Attach_Upd01_Dtl2R.create();
					if (!isNull(d.data_lno())) {
						up2.biz_typ(MAC_BIZ_TYP.SLO_EDI.value());
						up2.report_id("MSLAR0020");
						up2.biz_key1(hdrR.slo_no());
						up2.biz_key2(hdrR.slo_rev().toString());
						up2.data_lno(d.data_lno());
						opAttc.up2().add(up2);
					}
					
					if (!isRecvDateGet && !isNull(d.recv_dt())) {
						recvDt = d.recv_dt();
						isRecvDateGet = true;
					}
					
					if (!d.isStatusDelete()) {
						amtSum = amtSum.add(nvl(d.trd_cur_amt(), MCNumber.ZERO));
						amtSum = amtSum.add(nvl(d.trd_cur_tax_amt(), MCNumber.ZERO));
					}
				}
				
				// up(List1)電文作成
				Attach_Chk01_DtlR attcUp = Attach_Chk01_DtlR.create();
				attcUp.biz_typ(MAC_BIZ_TYP.SLO_EDI.value());
				attcUp.report_id("MSLAR0020");
				attcUp.biz_key1(hdrR.slo_no());
				attcUp.biz_key2(hdrR.slo_rev().toString());
				attcUp.dt(recvDt);
				attcUp.bp_cd(hdrR.cst_cd());
				attcUp.amt(amtSum);
				attcUp.cur_cd(hdrR.trd_cur_cd());
				attcUp.wg_cd(hdrR.wg_cd());
				attcUp.sls_dpt_cd(hdrR.sls_dpt_cd());
				attcUp.wrk_no(hdrR.wrk_no());
				attcUp.tterm_cd1(hdrR.tterm_cd1());
				attcUp.tterm_cd2(hdrR.tterm_cd2());
				attcUp.tterm_cd3(hdrR.tterm_cd3());
				attcUp.edi_sub_char1(hdrR.edi_sub_char1());
				attcUp.edi_sub_char2(hdrR.edi_sub_char2());
				attcUp.edi_sub_char3(hdrR.edi_sub_char3());
				attcUp.edi_sub_char4(hdrR.edi_sub_char4());
				attcUp.edi_sub_char5(hdrR.edi_sub_char5());
				attcUp.if_proc_typ(MAC_IF_PROC_TYP.SLO_RECV.value());
				
				opAttc.up0().add(attcUp);
				
				cntHdrRow = cntHdrRow.add(1);
			}
			if (opAttc.up0().size() > 0) {
				opAttc.exec();
			}
		}
	}
	
	/**
	 * SloRecvIf_Chk01オペレーション.<p>
	 *
	 * 受注受信ＩＦ取込を行う前のチェック処理<br>
	 */
	public class SloRecvIf_Chk01 extends MSLAL_SloRecvIfService_MC_A.SloRecvIf_Chk01 {
		
		/**
		 * 受注ヘッダリスト
		 */
		protected MCList<MST_SLO_R> _sloL = null;
		
		/**
		 * 受注明細リスト
		 */
		protected MCList<MST_SLO_D_R> _sloDL = null;
		
		/**
		 * 受注ヘッダのインデックス
		 */
		protected MCIndexKey _sloIdxkey = null;
		
		/**
		 * 受注ヘッダの(得意先注文ＮＯ)インデックス
		 */
		protected MCIndexKey _cstPoIdxkey = null;
		
		/**
		 * 受注明細のインデックス
		 */
		protected MCIndexKey _sloDIdxkey = null;
		
		/**
		 * 受注明細の(得意先注文明細ＮＯ)インデックス
		 */
		protected MCIndexKey _cstPoDIdxkey = null;
		
		/**
		 * 売上担当者と売上部門マップ
		 */
		protected Map<String, String> _slsUsrDptMap = null;
		
		/**
		 * 受注が分割されたことにより、新規登録用の受注受信ＩＦを格納するリスト
		 */
		protected MCList<SloRecvIf_Chk01_DtlR> _sloSplitInsIfL = null;
		
		/**
		 * 税ＣＤのリスト（マスタから算出）
		 */
		protected MCList<SloRecvIf_Chk01_DtlR> _slsTax = null;
		/**
		 * 税ＣＤのインデックス
		 */
		protected MCIndexKey _slsTaxIdx = null;
		
		/**
		 * 源泉税率のリスト
		 */
		protected MCList<MCRow> _wtaxRate = null;
		/**
		 * 源泉税率のインデックス
		 */
		protected MCIndexKey _wtaxRateIdx = null;
		
		/**
		 * 税マスタのキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_TAX_R> _taxCache = null;
		
		/**
		 * 品目単位マスタのキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _itmUnitCache = null;
		
		/** 
		 * 品目マスタ（ロケール） のキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_ITM_LCL_R> _itmLclCache = null;
		
		/**
		 * 受注受信ＩＦのインデックス
		 */
		protected MCIndexKey _sloRecvIfIdxkey = null;
		
		/**
		 * 受注引当マス
		 */
		protected MCList<MAM_SLO_ALLOC_R> _sloAllocL = null;
		
		/**
		 * 受注引当マスのインデックス(場所を特定するため)
		 */
		protected MCIndexKey _sloAllocLocIdxkey = null;
		
		/**
		 * 受注引当マスのインデックス
		 */
		protected MCIndexKey _sloAllocIdxkey = null;
		
		/**
		 * 受注詳細マスタ
		 */
		protected MCList<MAM_ITM_DTL_R> _itmDtlL = null;
		
		/**
		 * 受注詳細マスタのインデックス
		 */
		protected MCIndexKey _itmDtlIdxkey = null;
		
		protected MCList<MAVM_USR_DPT_R> _usrDptCache = null;
		
		protected MCIndexKey _usrDptIdx = null;
		
		/**
		 * ヘッダ紐付けＮＯ
		 */
		protected long _hdrPegNo = 0;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void initUpSub() {
			super.initUpSub();
			
			getSloInfo();
			
			setSloDt(up0());
			
			setItmSub(up0());
			
			setPegNo(up0());
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			crtCache();
			
			compl();
			
			setDown();
			
			sort();
		}
		
		@Override
		protected MCMessageList doServerCheck() {
			
			MCMessageList msgL = super.doServerCheck();
			
			sortDtl(up0());
			
			msgL.addAll(chkPurcIdTyp(up0()));
			
			msgL.addAll(chkReq(up0()));
			
			msgL.addAll(chkDuplicate(up0()));
			
			msgL.addAll(chkSlo(up0()));
			
			// プッシュ通知用に早めに部門は補完する
			msgL.addAll(chkSlsDpt(up0()));
			
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			
			MCMessageList msgL = super.doServerCheckSub();
			
			
			// doServerCheckでエラーがない取込グループのみ後続のチェックを行う
			MCList<SloRecvIf_Chk01_DtlR> notErrL = getNotErrL();
			if (notErrL.isEmpty()) {
				return msgL;
			}
			
			beforeChkCompl(notErrL);
			
			msgL.addAll(chkAprv(notErrL));
			
			msgL.addAll(chkPrevErr(notErrL));
			
			msgL.addAll(chkItm(notErrL));
			
			msgL.addAll(chkGd(notErrL));
			
			msgL.addAll(chkQty(notErrL));
			
			msgL.addAll(chkDlv(notErrL));
			
			msgL.addAll(chkTdlv(notErrL));
			
			msgL.addAll(chkLoc(notErrL));
			
			setSlsSchdDt(notErrL);
			
			setDlvRqstTm(notErrL);
			
			msgL.addAll(chkTax(notErrL));
			
			msgL.addAll(chkUpri(notErrL));
			
			msgL.addAll(chkIvUpri(notErrL));
			
			msgL.addAll(chkAmt(notErrL));
			
			msgL.addAll(chkDscntRsn(notErrL));
			
			msgL.addAll(chkSlsRsn(notErrL));
			
			msgL.addAll(chkBdDpt(notErrL));
			
			msgL.addAll(chkSppl(notErrL));
			
			msgL.addAll(chkTrnst(notErrL));
			
			msgL.addAll(chkAbort(notErrL));
			
			return msgL;
		}
		/**
		 * 同一取込グループにエラーのないリストを返す
		 * @return
		 */
		protected MCList<SloRecvIf_Chk01_DtlR> getNotErrL() {
			
			if (hasErrFlgOn(up0())) {
				MCList<SloRecvIf_Chk01_DtlR> notErrL = up0().createInstance();
				for (MCList<SloRecvIf_Chk01_DtlR> list : up0().groupList(getGrpKey())) {
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
		 * 同一取込グループのキーを返す。
		 * @return 同一取込グループのキー
		 */
		protected String[] getGrpKey() {
			
			return new String[] { 
					SloRecvIf_Chk01_DtlR.$ext_data_no,
					SloRecvIf_Chk01_DtlR.$cst_cd,
					SloRecvIf_Chk01_DtlR.$cst_po_no,
					SloRecvIf_Chk01_DtlR.$cst_po_rev};
		}
		
		/**
		 * 受注関連情報を取得する。
		 */
		protected void getSloInfo() {
			
			getSlo();
			
			getSloD();
		}
		
		/**
		 * 受注ヘッダを取得する。
		 */
		protected void getSlo() {
			
			_sloL = MCList.create(MST_SLO_R.class);
			MST_SLO_R t = MST_SLO_R.create("T");
			MCQueryApiBuilder sloL_bldr = MCQueryApiBuilder.create(t);
			
			sloL_bldr.setWhere(t.cst_cd.eq(bind("cst_cd")));
			sloL_bldr.addWhereWithAnd(t.cst_po_no.eq(bind("cst_po_no")));
			sloL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			
			sloL_bldr.setOrderByAsc(t.slo_no);
			
			dbSelectForUpdate("MSLAL5120_MST_SLO_S01", _sloL, sloL_bldr, up0().groupBy(SloRecvIf_Chk01_DtlR.$cst_cd, SloRecvIf_Chk01_DtlR.$cst_po_no));
			
			_sloIdxkey = _sloL.createIndex(MST_SLO_R.$slo_no);
			
			_cstPoIdxkey = _sloL.createIndex(MST_SLO_R.$cst_cd, MST_SLO_R.$cst_po_no);
		}
		
		/**
		 * 引数に指定された受注ＮＯで受注ヘッダを取得する。
		 * @param sloNo 受注ＮＯ
		 * @return 受注ヘッダ
		 */
		protected MST_SLO_R getSlo(String sloNo) {
			
			return _sloL.getFirst(_sloIdxkey, sloNo);
		}
		
		/**
		 * 引数に指定された得意先ＣＤ、得意先注文ＮＯで受注ヘッダを取得する。
		 * @param cst_cd 得意先ＣＤ
		 * @param cst_po_no 得意先注文ＮＯ
		 * @return 受注ヘッダ
		 */
		protected MCList<MST_SLO_R> getSlo(String cst_cd, String cst_po_no) {
			
			return _sloL.subList(_cstPoIdxkey, cst_cd, cst_po_no);
		}
		
		/**
		 * 受注明細を取得する。
		 */
		protected void getSloD() {
			
			_sloDL = MCList.create(MST_SLO_D_R.class);
			
			_sloDL.addStringColumn(MST_SLO_R.$cst_cd);
			_sloDL.addStringColumn(MST_SLO_R.$cst_po_no);
			_sloDL.addStringColumn(MST_SLO_R.$cst_po_rev);
			_sloDL.addStringColumn(MST_SHIP_PR_R.$ship_pr_no);
			_sloDL.addDateColumn(MST_SHIP_PR_R.$ship_schd_tm);
			_sloDL.addDateColumn(MST_SHIP_PR_R.$dlv_schd_tm);
			_sloDL.addNumberColumn(MST_SHIP_PR_R.$ship_inst_qty);
			_sloDL.addNumberColumn(MST_SHIP_PR_R.$ship_act_qty);
			_sloDL.addNumberColumn(MST_SHIP_PR_R.$sls_qty);
			_sloDL.addNumberColumn(MST_SHIP_PR_R.$iv_schd_qty);
			_sloDL.addNumberColumn(MST_SHIP_PR_R.$iv_act_qty);
			_sloDL.addBooleanColumn(MST_SHIP_SCHD_R.$ship_block_flg);
			_sloDL.addBooleanColumn(MST_SHIP_SCHD_R.$not_dt_calc_flg);
			_sloDL.addStringColumn(MAM_BP_R.$prnt_lcl_cd);
			_sloDL.addStringColumn(MAM_LOC_R.$wg_cd);
			_sloDL.addBooleanColumn(MAM_BIZ_RSN_R.$sls_acxfr_flg);

			MST_SLO_R t2 = MST_SLO_R.create("T2");
			MST_SHIP_PR_R t3 = MST_SHIP_PR_R.create("T3");
			MST_SHIP_SCHD_R S1ST4 = MST_SHIP_SCHD_R.create("ST4");
			MAM_BP_R m1 = MAM_BP_R.create("M1");
			MAM_LOC_R m2 = MAM_LOC_R.create("M2");
			MAM_LOC_R m3 = MAM_LOC_R.create("M3");
			MAM_BIZ_RSN_R m4 = MAM_BIZ_RSN_R.create("M4");
			MST_SLO_D_R t = MST_SLO_D_R.create("T");
			MCQueryApiBuilder sloDL_bldr = MCQueryApiBuilder.create(t);
	
			sloDL_bldr.addSelect(t2.cst_cd);
			sloDL_bldr.addSelect(t2.cst_po_no);
			sloDL_bldr.addSelect(t2.cst_po_rev);
			sloDL_bldr.addSelect(t3.ship_pr_no);
			sloDL_bldr.addSelect(t3.ship_schd_tm);
			sloDL_bldr.addSelect(t3.dlv_schd_tm);
			sloDL_bldr.addSelect(t3.ship_inst_qty);
			sloDL_bldr.addSelect(t3.ship_act_qty);
			sloDL_bldr.addSelect(t3.sls_qty);
			sloDL_bldr.addSelect(t3.iv_schd_qty);
			sloDL_bldr.addSelect(t3.iv_act_qty);
			sloDL_bldr.addSelect(subQuery().select(max(S1ST4.ship_block_flg))
					.from(S1ST4)
					.where(S1ST4.ship_pr_no.eq(t3.ship_pr_no))
					.as("ship_block_flg"));
			sloDL_bldr.addSelect(subQuery().select(max(S1ST4.not_dt_calc_flg))
					.from(S1ST4)
					.where(S1ST4.ship_pr_no.eq(t3.ship_pr_no))
					.as("not_dt_calc_flg"));
			sloDL_bldr.addSelect(m1.prnt_lcl_cd);
			sloDL_bldr.addSelect(nvl( m3.wg_cd, m2.wg_cd).as("wg_cd"));
			sloDL_bldr.addSelect(m4.sls_acxfr_flg);
			
			sloDL_bldr.addInnerJoin(t2, t.slo_no.eq(t2.slo_no));
			sloDL_bldr.addInnerJoin(t3, t.slo_d_no.eq(t3.slo_d_no));
			sloDL_bldr.addLeftOuterJoin(m1, t.dlv_cd.eq(m1.bp_cd));
			sloDL_bldr.addLeftOuterJoin(m2, t.loc_cd.eq(m2.loc_cd));
			sloDL_bldr.addLeftOuterJoin(m3, t.proc_typ.eq(value(MAC_SLO_PROC_TYP.PURC_DDLV.value())).and( MAPA_LOC$F_GET_SLS_DPT_LOC_CD( t2.sls_dpt_cd, t2.slo_dt ).eq(m3.loc_cd)));
			sloDL_bldr.addLeftOuterJoin(m4, t.sls_rsn_cd.eq(m4.biz_rsn_cd));
			
			sloDL_bldr.setWhere(t2.cst_cd.eq(bind("cst_cd")));
			sloDL_bldr.addWhereWithAnd(t2.cst_po_no.eq(bind("cst_po_no")));
			sloDL_bldr.addWhereWithAnd(t2.can_flg.eq(value(false)));
			sloDL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			
			sloDL_bldr.addLockTable(t.slo_d_no);
			sloDL_bldr.setOrderByAsc(t.slo_d_no, t3.ship_pr_no);
			dbSelectForUpdate("MSLAL5120_MST_SLO_D_S01", _sloDL, sloDL_bldr, up0().groupBy(SloRecvIf_Chk01_DtlR.$cst_cd, SloRecvIf_Chk01_DtlR.$cst_po_no));
						
			_sloDIdxkey = _sloDL.createIndex(MST_SLO_D_R.$slo_d_no);
			
			_cstPoDIdxkey = _sloDL.createIndex(MST_SLO_R.$cst_cd, MST_SLO_R.$cst_po_no, MST_SLO_D_R.$cst_po_d_no);
		}
		
		/**
		 * 引数に指定された受注明細ＮＯで受注明細を取得する。
		 * @param sloDNo 受注明細ＮＯ
		 * @return 受注明細
		 */
		protected MST_SLO_D_R getSloD(String sloDNo) {
			
			 return _sloDL.getFirst(_sloDIdxkey, sloDNo);
		}
		
		/**
		 * リストロジックチェックを行う前に、品目の枝番を設定する。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 */
		protected void setItmSub(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {
			
			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (!isNull(sloRecvIfR.itm_cd())) {
					
					sloRecvIfR.itm_sub1(nvl(sloRecvIfR.itm_sub1(), MAC_STR.NULL_VAL.value()));
					sloRecvIfR.itm_sub2(nvl(sloRecvIfR.itm_sub2(), MAC_STR.NULL_VAL.value()));
					sloRecvIfR.itm_sub3(nvl(sloRecvIfR.itm_sub3(), MAC_STR.NULL_VAL.value()));
				}
			}
		}
		
		/**
		 * リストロジックチェックを行う前に、受注日を設定する。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 */
		protected void setSloDt(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {
			
			boolean setPoDtFlg = isSame(getSysParm("SLO_IF_PO_DT_TO_SLO_DT_FLG"), "1");
			
			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				MCDate sloDt = null;
				if (setPoDtFlg && !isNull(sloRecvIfR.po_dt()) && !isDel(sloRecvIfR)) {
					sloDt = sloRecvIfR.po_dt();
				}
				else if (isUpd(sloRecvIfR) || isDel(sloRecvIfR)) {
					
					MCList<MST_SLO_D_R> sloDL = _sloDL.subList(_cstPoDIdxkey, sloRecvIfR.cst_cd(), sloRecvIfR.cst_po_no(), sloRecvIfR.cst_po_d_no());
					if (!sloDL.isEmpty()) {
						
						MST_SLO_R sloR = getSlo(sloDL.get(0).slo_no());
						sloDt = sloR.slo_dt();
					}
				}
				else if (isCrt(sloRecvIfR)) {
					
					MCList<MST_SLO_R> sloL = getSlo(sloRecvIfR.cst_cd(), sloRecvIfR.cst_po_no());
					if (!sloL.isEmpty()) {
						
						sloDt = (MCDate)sloL.max(MST_SLO_R.$slo_dt);
					}
				}
				
				sloRecvIfR.slo_dt(nvl(sloDt, getToday()));
			}
		}
		
		/**
		 * 処理対象の明細をソートする。
		 * 
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 */
		protected void sortDtl(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {
			
			sloRecvIfL.sort(SloRecvIf_Chk01_DtlR.$cst_cd, SloRecvIf_Chk01_DtlR.$cst_po_no, SloRecvIf_Chk01_DtlR.$cst_po_d_no);
		}
		
		/**
		 * 購買識別区分のチェックを行う。<br>
		 * 購買識別区分が無償受給または有償受給の場合、エラーにする。<br>
		 * 購買識別区分がＶＭＩの場合、vmi_flgをtrueに設定する。（後続の処理で使われる）。<br>
		 * 購買識別区分が通常購買または未設定の場合、vmi_flgをfalseに設定する。
		 */
		protected MCMessageList chkPurcIdTyp(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (isCrt(sloRecvIfR) || isUpd(sloRecvIfR)) {
					
					if (MAC_PURC_ID_TYP.isFFR_RCV(sloRecvIfR.purc_id_typ()) 
							|| MAC_PURC_ID_TYP.isONR_RCV(sloRecvIfR.purc_id_typ())) {
						
						// 購買識別区分が「2：無償受給」または「3：有償受給」のデータは取り込めません。
						msgL.add(new MCMessage(sloRecvIfR, null, MSLAL0220, sloRecvIfR.data_no(),
								sloRecvIfR.data_lno(), sloRecvIfR.purc_id_typ()));
					}
					else if (MAC_PURC_ID_TYP.isVMI(sloRecvIfR.purc_id_typ())) {
						sloRecvIfR.vmi_flg(true);
					}
					else {
						sloRecvIfR.vmi_flg(false);
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 条件付き必須チェックを行う。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkReq(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (isCrt(sloRecvIfR) || isUpd(sloRecvIfR)) {
					
					msgL.addAll(check(sloRecvIfR, SloRecvIf_Chk01_DtlR.$itm_cd, new FXUCL_RequiredValidater()));
					msgL.addAll(check(sloRecvIfR, SloRecvIf_Chk01_DtlR.$dlv_cd, new FXUCL_RequiredValidater()));
					msgL.addAll(check(sloRecvIfR, SloRecvIf_Chk01_DtlR.$trd_unit_qty, new FXUCL_RequiredValidater()));
					
					if (!MAC_PURC_ID_TYP.isFFR_RCV(sloRecvIfR.purc_id_typ()) 
							&& !MAC_PURC_ID_TYP.isONR_RCV(sloRecvIfR.purc_id_typ()) 
							&& !MAC_PURC_ID_TYP.isVMI(sloRecvIfR.purc_id_typ())) {
						
						msgL.addAll(check(sloRecvIfR, SloRecvIf_Chk01_DtlR.$trd_cur_upri, new FXUCL_RequiredValidater()));
						msgL.addAll(check(sloRecvIfR, SloRecvIf_Chk01_DtlR.$tax_rate, new FXUCL_RequiredValidater()));
						msgL.addAll(check(sloRecvIfR, SloRecvIf_Chk01_DtlR.$tax_typ, new FXUCL_RequiredValidater()));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 得意先注文明細ＮＯが重複しているかをチェックする。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkDuplicate(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			List<MCNumber> errL = new ArrayList<MCNumber>();
			SloRecvIf_Chk01_DtlR prev = null;
			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (prev == null) {
					prev = sloRecvIfR;
					continue;
				}
				
				if (isSame(sloRecvIfR.cst_cd(), prev.cst_cd()) 
						&& isSame(sloRecvIfR.cst_po_no(), prev.cst_po_no()) 
						&& isSame(sloRecvIfR.cst_po_d_no(), prev.cst_po_d_no())) {
					
					if (!errL.contains(prev.data_lno())) {
						msgL.add(new MCMessage(prev, null, MSLAL0007, prev.data_no(),
								prev.data_lno(), prev.cst_cd(), prev.cst_po_no(), prev.cst_po_d_no()));
						
						errL.add(prev.data_lno());
					}
					
					msgL.add(new MCMessage(sloRecvIfR, null, MSLAL0007, sloRecvIfR.data_no(),
							sloRecvIfR.data_lno(), sloRecvIfR.cst_cd(), sloRecvIfR.cst_po_no(), sloRecvIfR.cst_po_d_no()));
					
					errL.add(sloRecvIfR.data_lno());
				}
				
				prev = sloRecvIfR;
			}	
			
			return msgL;
		}
		
		/**
		 * 対応する受注情報を取込みできるかチェックする。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkSlo(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			boolean errFlg = false;
			
			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				errFlg = false;
				
				MCList<MST_SLO_D_R> sloDL = _sloDL.subList(_cstPoDIdxkey, sloRecvIfR.cst_cd(), sloRecvIfR.cst_po_no(), sloRecvIfR.cst_po_d_no());
				
				if (isCrt(sloRecvIfR)) {
					
					for (MST_SLO_D_R sloDR : sloDL) {
						
						msgL.add(new MCMessage(sloRecvIfR, null, MSLAL0020, 
								sloRecvIfR.data_no(), 
								sloRecvIfR.data_lno(), 
								sloRecvIfR.cst_cd(), 
								sloRecvIfR.cst_po_no(), 
								sloDR.cst_po_d_no()));
						
						errFlg = true;
					}
				}
				else {
					
					if (sloDL.size() > 1) {
						
						msgL.add(new MCMessage(sloRecvIfR, null, MSLAL0021, sloRecvIfR.data_no(), sloRecvIfR.data_lno()));
						errFlg = true;
					}
					else if (sloDL.size() == 0) {
						
						msgL.add(new MCMessage(sloRecvIfR, null, MSLAL0022, sloRecvIfR.data_no(), sloRecvIfR.data_lno()));
						errFlg = true;
					}
					else if (isUpd(sloRecvIfR)) {
						
						MST_SLO_D_R sloDR = sloDL.get(0);
						MST_SLO_R sloR = getSlo(sloDR.slo_no());
						
						String defTrdCd = getDefaultTrd();
						if (!isNull(sloR) && !isSame(sloR.trd_cd(), defTrdCd)) {
							
							msgL.add(new MCMessage(sloRecvIfR, null, MSLAL0029, 
									sloRecvIfR.data_no(), sloRecvIfR.data_lno(), 
									sloR.slo_no(), sloDR.slo_d_no(), sloR.trd_cd(), defTrdCd));
							errFlg = true;
						}
					}
				}
				
				if ((isUpd(sloRecvIfR) || isDel(sloRecvIfR)) && !errFlg) {
					// 更新/削除行の対応する受注ＮＯ、受注明細ＮＯを設定する
					sloRecvIfR.slo_no(sloDL.get(0).slo_no());
					sloRecvIfR.slo_d_no(sloDL.get(0).slo_d_no());
				}
			}
			
			return msgL;
		}
		
		protected MCMessageList chkAbort(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				if (isCrt(sloRecvIfR) && sloRecvIfR.abort_flg()) {
					msgL.add(new MCMessage(sloRecvIfR, null, MSLAL0929, sloRecvIfR.data_no(), sloRecvIfR.data_lno()));
				}
			}
			
			return msgL;
		}
		
		/**
		 * チェック時に、使われる項目を先に補完する。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 */
		protected void beforeChkCompl(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {
			
			setSloType(sloRecvIfL);
			
			setProcTyp(sloRecvIfL);
			
			setSlsBasisTyp(sloRecvIfL);
			
			setSlsUpriReqTyp(sloRecvIfL);
			
			setShipRqstTm(sloRecvIfL);
			
			setDlvLgGrpCd(sloRecvIfL);
			
			setShipInstTyp(sloRecvIfL);
			
			setDtCalc(sloRecvIfL);
		}
		
		/**
		 * 受注区分を設定する。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 */
		protected void setSloType(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {
			
			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (isDel(sloRecvIfR)) {
					continue;
				}
				
				MST_SLO_R sloR = getSlo(sloRecvIfR.slo_no());
						
				if (isNull(sloRecvIfR.slo_typ())) {
					
					if (isUpd(sloRecvIfR)) {
						
						sloRecvIfR.slo_typ(sloR.slo_typ());
					}
					else {
						
						sloRecvIfR.slo_typ(MSC_SLO_TYP.SLO.value());
					}
				}
				else {
					if (!MSC_SLO_TYP.contains(sloRecvIfR.slo_typ())) {
						
						sloRecvIfR.slo_typ(MSC_SLO_TYP.SLO.value());
					}
				}
			}
		}
		
		/**
		 * 手配区分を設定する。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 */
		protected void setProcTyp(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {

			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (isDel(sloRecvIfR)) {
					continue;
				}
				
				MST_SLO_D_R sloDR = getSloD(sloRecvIfR.slo_d_no());
				
				if (isUpd(sloRecvIfR) 
						&& !isNull(sloDR) 
						&& !isNull(sloDR.proc_typ()) 
						&& isSameItm(sloRecvIfR, sloDR) 
						&& (!sloRecvIfR.vmi_flg() || !MAC_SLO_PROC_TYP.isPURC_DDLV(sloDR.proc_typ()))) {
					
					sloRecvIfR.proc_typ(sloDR.proc_typ());
				}
				else if (MAC_STK_MNG_TYP.isMNG(sloRecvIfR.stk_mng_typ())) {
					// 在庫管理品
					if (!sloRecvIfR.slo_proc_flg()
							|| (sloRecvIfR.slo_proc_flg() && isNull(sloRecvIfR.proc_typ()))
							|| (sloRecvIfR.vmi_flg() && MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ()))
							|| (sloRecvIfR.sls_cststk_flg() && MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ()))) {
					
						if (sloRecvIfR.vmi_flg() && MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ())) {
							// ＩＦテーブルの貸出ＦＬＧがオン　かつ　品目マスタの手配区分が「仕入直送」の場合は、品目マスタの出荷指図区分を参照しない（後続の処理で「ピッキングあり」に補完される）
							sloRecvIfR.ship_inst_typ(null);
						}
						sloRecvIfR.proc_typ(MAC_SLO_PROC_TYP.ALLOC.value());
					}
				}
				else if (MAC_STK_MNG_TYP.isNOT_MNG(sloRecvIfR.stk_mng_typ())) {
					// 非在庫品
					if (!sloRecvIfR.slo_proc_flg() || sloRecvIfR.vmi_flg()) {
						// 受注手配品ではない　または　貸出出荷の場合、手配区分をクリア
						sloRecvIfR.proc_typ(null);
					}
				}
			}
		}
		
		/**
		 * 売上計上区分を設定する。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 */
		protected void setSlsBasisTyp(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {

			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (isDel(sloRecvIfR)) {
					continue;
				}
				
				if (isUpd(sloRecvIfR)) {
					
					MST_SLO_R sloR = getSlo(sloRecvIfR.slo_no());
					sloRecvIfR.sls_basis_typ(sloR.sls_basis_typ());
				}
				else {

					if (isNull(sloRecvIfR.sls_basis_typ())) {
						sloRecvIfR.sls_basis_typ(getCo().sls_basis_typ());
					}
				}
			}
		}
		
		/**
		 * 販売単価取得区分を設定する。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 */
		protected void setSlsUpriReqTyp(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {

			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				MST_SLO_D_R sloDR = getSloD(sloRecvIfR.slo_d_no());
				
				if (isDel(sloRecvIfR)) {
					continue;
				}
				
				if (sloRecvIfR.vmi_flg()) {
					sloRecvIfR.sls_upri_req_typ(null);
				}
				else if (isUpd(sloRecvIfR) && !isNull(sloDR) && !isNull(sloDR.sls_upri_req_typ())) {
					
					sloRecvIfR.sls_upri_req_typ(sloDR.sls_upri_req_typ());
				}
				else {

					if (isNull(sloRecvIfR.sls_upri_req_typ())) {
						sloRecvIfR.sls_upri_req_typ(getCo().sls_upri_req_typ());
					}
				}
			}
		}
		
		/**
		 * 売上予定日を設定する。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 */
		protected void setSlsSchdDt(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {

			createShipSchdDtCalServiceUp(sloRecvIfL);
			callShipSchdDtCalService(sloRecvIfL);
			
			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (isDel(sloRecvIfR)) {
					continue;
				}
				
				MST_SLO_D_R sloDR = getSloD(sloRecvIfR.slo_d_no());
				
				if (sloRecvIfR.vmi_flg()) {
					sloRecvIfR.sls_schd_dt(null);
				}
				else if (!isSloDChanged(sloRecvIfR, sloDR)) {
					
					sloRecvIfR.sls_schd_dt(sloDR.sls_schd_dt());
				}
				else {
					if (sloRecvIfR.sls_cststk_flg()) {
						sloRecvIfR.sls_schd_dt(getToday());
					}
					
					if (MAC_SLS_UPRI_REQ_TYP.isSCHD_SLS_DT(sloRecvIfR.sls_upri_req_typ())) {
						
						if (MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ()) || MAC_SHIP_INST_TYP.isNO_PICK(sloRecvIfR.ship_inst_typ())) {
							if (MAC_SLS_BASIS_TYP.isIN_BASIS(sloRecvIfR.sls_basis_typ())) {
								if (!isNull(sloRecvIfR.accpt_schd_dt())) {
									sloRecvIfR.sls_schd_dt(sloRecvIfR.accpt_schd_dt());
								}
								else if (!isNull(sloRecvIfR.dlv_rqst_tm())) {
									sloRecvIfR.sls_schd_dt(sloRecvIfR.dlv_rqst_tm().startTimeOfDay());
								}
								else {
									sloRecvIfR.sls_schd_dt(getToday());
								}
							}
							else {
								if (!isNull(sloRecvIfR.dlv_rqst_tm())) {
									sloRecvIfR.sls_schd_dt(sloRecvIfR.dlv_rqst_tm().startTimeOfDay());
								}
								else if (!isNull(sloRecvIfR.accpt_schd_dt())) {
									sloRecvIfR.sls_schd_dt(sloRecvIfR.accpt_schd_dt());
								}
								else {
									sloRecvIfR.sls_schd_dt(getToday());
								}
							}
						}
						else {
							if (MAC_SLS_BASIS_TYP.isIN_BASIS(sloRecvIfR.sls_basis_typ())) {
								if (!isNull(sloRecvIfR.accpt_schd_dt())) {
									sloRecvIfR.sls_schd_dt(sloRecvIfR.accpt_schd_dt());
								}
								else if (!isNull(sloRecvIfR.dlv_rqst_tm())) {
									sloRecvIfR.sls_schd_dt(sloRecvIfR.dlv_rqst_tm().startTimeOfDay());
								}
								else if (!isNull(sloRecvIfR.getDate("dt_cal_dlv_schd_tm"))) {
									sloRecvIfR.sls_schd_dt(sloRecvIfR.getDate("dt_cal_dlv_schd_tm").startTimeOfDay());
								}
							}
							else if (MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(sloRecvIfR.sls_basis_typ())) {
								if (!isNull(sloRecvIfR.dlv_rqst_tm())) {
									sloRecvIfR.sls_schd_dt(sloRecvIfR.dlv_rqst_tm().startTimeOfDay());
								}
								else if (!isNull(sloRecvIfR.getDate("dt_cal_dlv_schd_tm"))) {
									sloRecvIfR.sls_schd_dt(sloRecvIfR.getDate("dt_cal_dlv_schd_tm").startTimeOfDay());
								}
							}
							else if (MAC_SLS_BASIS_TYP.isSHIP_BASIS(sloRecvIfR.sls_basis_typ())) {
								if (!isNull(sloRecvIfR.getDate("dt_cal_ship_schd_tm"))) {
									sloRecvIfR.sls_schd_dt(sloRecvIfR.getDate("dt_cal_ship_schd_tm").startTimeOfDay());
								}
							}
						}
					}
				}
			}
		}
		
		MCList<MSW_SHIP_SCHD_DT_CALC_R> _ShipSchdDtCalUp0L = null;
		protected void callShipSchdDtCalService(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {
			MSBEL_ShipSchdDtCalcService.ShipSchdDt_Srch01 op = MSBEL_ShipSchdDtCalcService.crtShipSchdDt_Srch01();
			if (_ShipSchdDtCalUp0L.isEmpty()) return;
			
			op.up0().addAll(_ShipSchdDtCalUp0L);
			op.exec();
			
			MCList<MSW_SHIP_SCHD_DT_CALC_R> dnL = op.down0();
			if (!dnL.isEmpty()){
				MCIndexKey idx = sloRecvIfL.createIndex(SloRecvIf_Chk01_DtlR.$peg_no);
				for (MSW_SHIP_SCHD_DT_CALC_R dnR : dnL) {
					SloRecvIf_Chk01_DtlR sloRecvIfR = sloRecvIfL.getFirst(idx, dnR.peg_no());
					sloRecvIfR.setDateNE("dt_cal_ship_schd_tm", dnR.ship_schd_tm());
					sloRecvIfR.setDateNE("dt_cal_dlv_schd_tm", dnR.dlv_schd_tm());
				}
			}
		}
		
		protected void createShipSchdDtCalServiceUp(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {
			
			_ShipSchdDtCalUp0L = MCList.create(MSW_SHIP_SCHD_DT_CALC_R.class);
			sloRecvIfL.addDateColumn("dt_cal_ship_schd_tm");
			sloRecvIfL.addDateColumn("dt_cal_dlv_schd_tm");
			
			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				MST_SLO_D_R sloDR = getSloD(sloRecvIfR.slo_d_no());
				if (isNotShipSchdDtCalTgt(sloRecvIfR, sloDR)) {
					continue;
				}
				
				String frLgGrpCd = getFrLgGrpCd(sloRecvIfR);
				if (isNull(frLgGrpCd)) continue;
				
				MSW_SHIP_SCHD_DT_CALC_R cndR = MSW_SHIP_SCHD_DT_CALC_R.create();
				copy(cndR, sloRecvIfR, createMap_MSW_SHIP_SCHD_DT_CALC_R_SloRecvIf_Chk01_DtlR());
				cndR.ship_fr_lg_grp_cd(frLgGrpCd);
				_ShipSchdDtCalUp0L.add(cndR);
			}
		}
		
		protected boolean isNotShipSchdDtCalTgt(SloRecvIf_Chk01_DtlR sloRecvIfR, MST_SLO_D_R sloDR) {
			
			return isDel(sloRecvIfR)
					|| !MAC_SLS_UPRI_REQ_TYP.isSCHD_SLS_DT(sloRecvIfR.sls_upri_req_typ())
					|| (MAC_SLS_BASIS_TYP.isIN_BASIS(sloRecvIfR.sls_basis_typ()) && (!isNull(sloRecvIfR.accpt_schd_dt()) || !isNull(sloRecvIfR.dlv_rqst_tm())))
					|| (MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(sloRecvIfR.sls_basis_typ()) && !isNull(sloRecvIfR.dlv_rqst_tm()))
					|| sloRecvIfR.not_dt_calc_flg()
					|| MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ())
					|| MAC_SHIP_INST_TYP.isNO_PICK(sloRecvIfR.ship_inst_typ())
					|| !isSloDChanged(sloRecvIfR, sloDR);
		}
		
		protected boolean isSloDChanged(SloRecvIf_Chk01_DtlR sloRecvIfR, MST_SLO_D_R sloDR) {
			
			if (!isUpd(sloRecvIfR) || isNull(sloDR) || isNull(sloDR.sls_schd_dt())) {
				return true;
			}
			
			if (MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ()) || MAC_SHIP_INST_TYP.isNO_PICK(sloRecvIfR.ship_inst_typ())) {
				if (MAC_SLS_BASIS_TYP.isIN_BASIS(sloRecvIfR.sls_basis_typ())) {
					if (!isNull(sloRecvIfR.accpt_schd_dt())) {
						if (!isSame(sloRecvIfR.accpt_schd_dt(), sloDR.sls_schd_dt())) {
							return true;
						}
					}
					else if (!isNull(sloRecvIfR.dlv_rqst_tm())) {
						if (!isSame(sloRecvIfR.dlv_rqst_tm().startTimeOfDay(), sloDR.sls_schd_dt())) {
							return true;
						}
					}
				}
				else {
					if (!isNull(sloRecvIfR.dlv_rqst_tm())) {
						if (!isSame(sloRecvIfR.dlv_rqst_tm().startTimeOfDay(), sloDR.sls_schd_dt())) {
							return true;
						}
					}
					else if (!isNull(sloRecvIfR.accpt_schd_dt())) {
						if (!isSame(sloRecvIfR.accpt_schd_dt(), sloDR.sls_schd_dt())) {
							return true;
						}
					}
				}
			}
			else {
				if (MAC_SLS_BASIS_TYP.isIN_BASIS(sloRecvIfR.sls_basis_typ())) {
					if (!isNull(sloRecvIfR.accpt_schd_dt())) {
						if (!isSame(sloRecvIfR.accpt_schd_dt(), sloDR.sls_schd_dt())) {
							return true;
						}
					}
					else if (!isNull(sloRecvIfR.dlv_rqst_tm())) {
						if (!isSame(sloRecvIfR.dlv_rqst_tm().startTimeOfDay(), sloDR.sls_schd_dt())) {
							return true;
						}
					}
					else if (isReShipSchdDtCal(sloRecvIfR, sloDR)) {
						return true;
					}
				}
				else if (MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(sloRecvIfR.sls_basis_typ())) {
					if (!isNull(sloRecvIfR.dlv_rqst_tm())) {
						if (!isSame(sloRecvIfR.dlv_rqst_tm().startTimeOfDay(), sloDR.sls_schd_dt())) {
							return true;
						}
					}
					else if (isReShipSchdDtCal(sloRecvIfR, sloDR)) {
						return true;
					}
				}
				else if (MAC_SLS_BASIS_TYP.isSHIP_BASIS(sloRecvIfR.sls_basis_typ())) {
					if (isReShipSchdDtCal(sloRecvIfR, sloDR)) {
						return true;
					}
				}
			}
			
			return false;
		}
		
		protected boolean isReShipSchdDtCal(SloRecvIf_Chk01_DtlR sloRecvIfR, MST_SLO_D_R sloDR) {
			
			MST_SLO_R sloR = getSlo(sloRecvIfR.slo_no());
			if (isNull(sloR)) return true;
			if (sloRecvIfR.not_dt_calc_flg()) return false;
			
			String toLgGrpCd = MAC_VIA_DLV_TYP.isVIA(sloRecvIfR.via_dlv_typ()) ? sloRecvIfR.tdlv_lg_grp_cd() : sloRecvIfR.dlv_lg_grp_cd();
			String sloToLgGrpCd = MAC_VIA_DLV_TYP.isVIA(sloDR.via_dlv_typ()) ? sloDR.tdlv_lg_grp_cd() : sloDR.dlv_lg_grp_cd();
			
			if (!isSame(sloRecvIfR.dpt_wg_cd(), sloR.wg_cd())
					|| !isSame(toLgGrpCd, sloToLgGrpCd)
					|| !isSameItm(sloRecvIfR, sloDR)) {
				return true;
			}
			
			return false;
		}
		
		/**
		 * 出荷希望日時を設定する。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 */
		protected void setShipRqstTm(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {

			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (isDel(sloRecvIfR)) {
					continue;
				}
				
				if (MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ()) 
						|| MAC_SHIP_INST_TYP.isNO_PICK(sloRecvIfR.ship_inst_typ())) {
					sloRecvIfR.ship_rqst_tm(null);
				}
				else if (isUpd(sloRecvIfR)) {
					
					MST_SLO_D_R sloDR = getSloD(sloRecvIfR.slo_d_no());
					
					sloRecvIfR.ship_rqst_tm(sloDR.ship_rqst_tm());
				}
			}
		}
		
		/**
		 * 納入希望日時を設定する。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 */
		protected void setDlvRqstTm(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {

			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (isDel(sloRecvIfR) || !isNull(sloRecvIfR.dlv_rqst_tm())) {
					continue;
				}
				
				if (MAC_SLS_UPRI_REQ_TYP.isRQST_DLV_DT(sloRecvIfR.sls_upri_req_typ()) 
						|| MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ())) {
					
					MST_SLO_D_R sloDR = getSloD(sloRecvIfR.slo_d_no());
					
					if (isUpd(sloRecvIfR) && !isNull(sloDR) && !isNull(sloDR.dlv_rqst_tm())) {
						
						sloRecvIfR.dlv_rqst_tm(sloDR.dlv_rqst_tm());
					}
					else {
							
						sloRecvIfR.dlv_rqst_tm(getToday());
					}
				}
			}
		}
		
		/**
		 * 納品先物流グループを設定する。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 */
		protected void setDlvLgGrpCd(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {
			
			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (isDel(sloRecvIfR)) {
					continue;
				}
				
				MST_SLO_D_R sloDR = getSloD(sloRecvIfR.slo_d_no());
				
				if (isUpd(sloRecvIfR) && !isNull(sloDR) && isSame(sloRecvIfR.dlv_cd(), sloDR.dlv_cd())) {
					
					sloRecvIfR.dlv_lg_grp_cd(sloDR.dlv_lg_grp_cd());
				}
			}
		}
		
		/**
		 * 出荷指図区分を設定する。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 */
		protected void setShipInstTyp(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {
			
			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (isDel(sloRecvIfR)) {
					continue;
				}
				
				MST_SLO_D_R sloDR = getSloD(sloRecvIfR.slo_d_no());
				
				if (isUpd(sloRecvIfR) && !isNull(sloDR) && isSameItm(sloRecvIfR, sloDR)) {
					
					sloRecvIfR.ship_inst_typ(sloDR.ship_inst_typ());
				}
				else {
					if (isNull(sloRecvIfR.ship_inst_typ())) {
						sloRecvIfR.ship_inst_typ(MAC_SHIP_INST_TYP.PICK.value());
					}
					// 仕入直送の場合、品目マスタの出荷指図区分が必ず「対象外」になるため、実装不要
				}
			}
		}
		
		/**
		 * 後続処理が実行済みの明細存在するかどうかチェックする。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkTrnst(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {

			MCMessageList msgL = new MCMessageList();
			
			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (isUpd(sloRecvIfR)) {
					
					MST_SLO_R sloR = getSlo(sloRecvIfR.slo_no());
					if (!isNull(sloR)) {
						
						MCIndexKey idxKey = _sloDL.createIndex(MST_SLO_D_R.$slo_no);
						MCList<MST_SLO_D_R> sloDL = _sloDL.subList(idxKey, sloR.slo_no());
						
						if (!isSameChkSloHdr(sloRecvIfR, sloR) && hasTrnst(sloDL)) {
							msgL.add(new MCMessage(sloRecvIfR, null, MSLAL0015, sloRecvIfR.data_no(), sloRecvIfR.data_lno()));
						}
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 承認済かどうかチェックする。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkAprv(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				MST_SLO_R sloR = null;
				if (isCrt(sloRecvIfR)) {
					MCList<MST_SLO_R> sloL = getSlo(sloRecvIfR.cst_cd(), sloRecvIfR.cst_po_no());
					for (MST_SLO_R r : sloL) {
						if (isSameSloHdr(sloRecvIfR, r)) {
							sloR = r;
							break;
						}
					}
				}
				else {
					sloR = getSlo(sloRecvIfR.slo_no());
				}
				
				if (!isNull(sloR) 
						&& (MAC_APRV_STS_TYP.isFIX(sloR.aprv_sts_typ()) || MAC_APRV_STS_TYP.isACPT(sloR.aprv_sts_typ()))) {
					
					msgL.add(new MCMessage(sloRecvIfR, null, MSLAL0201, sloRecvIfR.data_no(), sloRecvIfR.data_lno(), sloRecvIfR.cst_po_no(), sloR.slo_no()));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 先に処理した注文でエラーが発生しかどうかチェックする。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkPrevErr(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (isPrevErr(sloRecvIfR.slo())) {
					
					msgL.add(new MCMessage(sloRecvIfR, null, MSLAL0003, sloRecvIfR.data_no(), sloRecvIfR.data_lno(), sloRecvIfR.cst_cd(), sloRecvIfR.cst_po_no()));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 売上部門に関連するチェック処理を行う。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkSlsDpt(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
		
			setSlsUsr(sloRecvIfL);
			
			initUsrDptCache(sloRecvIfL);
			
			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (isDel(sloRecvIfR)) {
					continue;
				}
				
				String slsDptCd = null;
				MST_SLO_R sloR = getSlo(sloRecvIfR.slo_no());
				if (!isNull(sloRecvIfR.sls_dpt_cd())) {
					// 受注受信ＩＦの売上部門を優先に設定する。
					slsDptCd = sloRecvIfR.sls_dpt_cd();
				}
				else {
					
					if (isUpd(sloRecvIfR) 
							&& !isNull(sloR) 
							&& (isNull(sloRecvIfR.sls_usr_cd()) || isSame(sloRecvIfR.sls_usr_cd(), sloR.sls_usr_cd()))) {
						// 更新の場合、売上担当者が変わってない場合は、受注の売上担当部門を設定する。
						slsDptCd = sloR.sls_dpt_cd();
					}
					else {
						
						if (!isNull(sloRecvIfR.sls_usr_cd())) {	
							// 売上担当者を元に、売上部門を取得し設定する。
							slsDptCd = getSlsDptBySlsUsr(sloRecvIfR);

						}
						else if (!isNull(sloRecvIfR.cst_sls_dpt_cd())) {
							// 得意先担当マスタの売上部門を設定する。
							slsDptCd = sloRecvIfR.cst_sls_dpt_cd();
						}
					}
				}
				
				if (isNull(slsDptCd)) {
					
					if(!isNullAnd(sloRecvIfR.sls_usr_cd(), sloRecvIfR.cst_sls_usr_cd())) {
						
						msgL.add(new MCMessage(sloRecvIfR, null, MSLAL0009, sloRecvIfR.data_no(),
								sloRecvIfR.data_lno(), nvl(sloRecvIfR.sls_usr_cd(), sloRecvIfR.cst_sls_usr_cd()), toYMDString(sloRecvIfR.slo_dt())));
					}
					else {
						msgL.add(new MCMessage(sloRecvIfR, null, MSLAL0008, sloRecvIfR.data_no(),
								sloRecvIfR.data_lno(), sloRecvIfR.cst_cd(), toYMDString(sloRecvIfR.slo_dt())));
						
					}
				}
				else {
					
					sloRecvIfR.sls_dpt_cd(slsDptCd);
					
					// 後続のチェック処理では、売上部門の関連項目を使用するため、補完する。
					setSlsDptItm(sloRecvIfL);
				}
			}
			
			return msgL;
		}
		
		protected void setSlsUsr(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {
			String slsUsrCd = null;
			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (isDel(sloRecvIfR)) {
					continue;
				}
				
				MST_SLO_R sloR = getSlo(sloRecvIfR.slo_no());
				
				if (isUpd(sloRecvIfR) 
						&& !isNull(sloR) 
						&& (isNull(sloRecvIfR.sls_usr_cd()))) {
					slsUsrCd = sloR.sls_usr_cd();
				}
				
				if (isNull(sloRecvIfR.sls_usr_cd())) {
					sloRecvIfR.sls_usr_cd(nvl(slsUsrCd, sloRecvIfR.cst_sls_usr_cd()));
				}
			}
		}
		
		protected MCList<MAVM_USR_DPT_R> getUsrDptL(String usrCd) {
			if (!isNull(_usrDptCache)) {
				return _usrDptCache.subList(_usrDptIdx, usrCd);
			}
			else {
				return null;
			}
		}
		protected void initUsrDptCache(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {
			MAVM_USR_DPT_R usrDptT = MAVM_USR_DPT_R.create("usrDptT");
			MAM_DPT_R dptM = MAM_DPT_R.create("dptM");
			
			MCList<MAVM_USR_DPT_R> usrDptL = MCList.create(MAVM_USR_DPT_R.class);
			usrDptL.addDateColumn("dpt_st_dt");
			usrDptL.addDateColumn("dpt_end_dt");
			MCQueryApiBuilder usrDptLBldr = MCQueryApiBuilder.create(usrDptT);
			
			usrDptLBldr.setSelect(usrDptT.usr_cd, usrDptT.dpt_cd, usrDptT.main_flg, usrDptT.st_dt, usrDptT.end_dt,
					dptM.st_dt.as("dpt_st_dt"), dptM.end_dt.as("dpt_end_dt"));
			
			usrDptLBldr.addInnerJoin(dptM, usrDptT.dpt_cd.eq(dptM.dpt_cd).and(dptM.sls_dpt_flg.eq(value(true))));
			usrDptLBldr.setWhere(usrDptT.usr_cd.eq(bind(Slo_BulkImp_Chk01_DtlR.$sls_usr_cd)));
			usrDptLBldr.addWhereWithAnd(usrDptT.st_dt.lte(bind(Slo_BulkImp_Chk01_DtlR.$slo_dt)));
			usrDptLBldr.addWhereWithAnd(usrDptT.end_dt.gte(bind(Slo_BulkImp_Chk01_DtlR.$slo_dt)));
			usrDptLBldr.addWhereWithAnd(dptM.st_dt.lte(bind(Slo_BulkImp_Chk01_DtlR.$slo_dt)));
			usrDptLBldr.addWhereWithAnd(dptM.end_dt.gte(bind(Slo_BulkImp_Chk01_DtlR.$slo_dt)));
			dbSelect("MSLAL5120_MAVM_USR_DPT_S01", usrDptL, usrDptLBldr, sloRecvIfL);
			if (!isNull(usrDptL)) {
				_usrDptCache = usrDptL;
				_usrDptIdx = _usrDptCache.createIndex(MAVM_USR_DPT_R.$usr_cd);
			}
		}
		
		/**
		 * 品目に関連するチェックを行う。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkItm(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (isDel(sloRecvIfR)) {
					continue;
				}
				
				if (sloRecvIfR.sundry_itm_flg() && isNull(sloRecvIfR.itm_nm())) {
					
					msgL.add(new MCMessage(sloRecvIfR, null, MSLAL0010, 
							sloRecvIfR.data_no(), sloRecvIfR.data_lno(), toDispItm(sloRecvIfR.itm_cd(), sloRecvIfR.itm_sub1(), sloRecvIfR.itm_sub2(), sloRecvIfR.itm_sub3())));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 格付に関連するチェック処理を行う。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkGd(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (isDel(sloRecvIfR)) {
					continue;
				}
				
				if (isNull(sloRecvIfR.gd_cd()) && MAC_STK_MNG_TYP.isMNG(sloRecvIfR.stk_mng_typ())) {
					
					MST_SLO_D_R sloDR = getSloD(sloRecvIfR.slo_d_no());
					
					if (isUpd(sloRecvIfR) && !isNull(sloDR) && !isNull(sloDR.gd_cd())) {
						sloRecvIfR.gd_cd(sloDR.gd_cd());
					}
					else {
						// 在庫管理品かつ格付ＣＤが未指定の場合、デフォルト格付ＣＤが取得できるかチェックする。
						
						try {
							if (isNull(getDefaultFeedStkGd().gd_cd())) {
								msgL.add(new MCMessage(sloRecvIfR, null, MSLAL0011, sloRecvIfR.data_no(), sloRecvIfR.data_lno()));
							}
							else {
								sloRecvIfR.gd_cd(getDefaultFeedStkGd().gd_cd());
							}
						}
						catch (Exception e) {
							msgL.add(new MCMessage(sloRecvIfR, null, MSLAL0011, sloRecvIfR.data_no(), sloRecvIfR.data_lno()));
						}
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 取引単位数量に関連するチェック処理を行う。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkQty(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (isDel(sloRecvIfR)) {
					continue;
				}
				
				if (isNull(sloRecvIfR.trd_unit_qty())) {
					continue;
				}
				
				MCNumber decPlace = null;
				
				if (!isNull(sloRecvIfR.trd_unit_cd())) {
					decPlace = sloRecvIfR.trd_unit_dec_place();
				}
				else {
					decPlace = getItmUnit(sloRecvIfR.itm_cd(), sloRecvIfR.itm_sub1(), sloRecvIfR.itm_sub2(), sloRecvIfR.itm_sub3(), sloRecvIfR.itm_trd_unit_cd()).dec_place();
					sloRecvIfR.trd_unit_cd(sloRecvIfR.itm_trd_unit_cd());
				}
				
				if (sloRecvIfR.trd_unit_qty().scale() > decPlace.intValue()) {
					
					msgL.add(new MCMessage(sloRecvIfR, null, MSLAL0012, sloRecvIfR.data_no(), sloRecvIfR.data_lno(), sloRecvIfR.trd_unit_qty(), decPlace));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 納品先に関連するチェック処理を行う。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkDlv(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (isDel(sloRecvIfR)) {
					continue;
				}
				
				if (sloRecvIfR.dlv_sundry_flg() && isNull(sloRecvIfR.dlv_nm())) {
					
					msgL.add(new MCMessage(sloRecvIfR, null, MSLAL0027, sloRecvIfR.data_no(), sloRecvIfR.data_lno(), sloRecvIfR.dlv_cd()));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 配送先に関連するチェック処理を行う。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkTdlv(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			setTdlv(sloRecvIfL);
			
			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (isDel(sloRecvIfR)) {
					continue;
				}
				
				if (sloRecvIfR.tdlv_sundry_flg() && isNull(sloRecvIfR.tdlv_nm())) {
					
					msgL.add(new MCMessage(sloRecvIfR, null, MSLAL0028, sloRecvIfR.data_no(), sloRecvIfR.data_lno(), sloRecvIfR.tdlv_cd()));
				}
				
				if (sloRecvIfR.tdlv_req_flg() && isNull(sloRecvIfR.tdlv_cd())) {
					if(isCrt(sloRecvIfR) || (isUpd(sloRecvIfR) && !isTrnst(getSloD(sloRecvIfR.slo_d_no())))) {
						msgL.add(new MCMessage(sloRecvIfR, null, MSLAL0189, sloRecvIfR.data_no(), sloRecvIfR.data_lno(), sloRecvIfR.dlv_cd()));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 税に関連するチェック処理を行う。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkTax(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			String taxCd = null;
			
			MCList<SloRecvIf_Chk01_DtlR> taxChkL = MCList.create(SloRecvIf_Chk01_DtlR.class);
			taxChkL.addStringColumn("mst_tax_cd");
			
			getSlsTax(sloRecvIfL);
			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				taxCd = null;
				
				String mstTaxCd = getDefSlsTax(sloRecvIfR); 
				sloRecvIfR.addStringColumn("mst_tax_cd", mstTaxCd);
				
				if (isDel(sloRecvIfR) || sloRecvIfR.vmi_flg()) {
					continue;
				}
			
				if (MAC_TAX_TYP.isTAX_ABL(sloRecvIfR.tax_typ())) {
					
					// 課税の場合、税区分と税率で税ＣＤを取得する。
					taxCd = getSlsTaxCdByIf(sloRecvIfR);
					
					if (isNull(taxCd)) {
						msgL.add(new MCMessage(sloRecvIfR, null, MSLAL0013, sloRecvIfR.data_no(), sloRecvIfR.data_lno(), 
								sloRecvIfR.tax_rate(), sloRecvIfR.tax_typ(), sloRecvIfR.inc_tax_flg()));
					}
					else {
						if (sloRecvIfR.inc_tax_flg() || !isSame(taxCd, mstTaxCd)) {
							// 内税、または　マスタと異なる場合に税指定とする
							sloRecvIfR.tax_fix_flg(true);
						}
					}
				}
				else {
					taxCd = mstTaxCd;
				}
				
				sloRecvIfR.tax_cd(taxCd);
				
				if (!sloRecvIfR.tax_not_chk_flg()) { 
					
					if (!isNull(taxCd)) {
						taxChkL.add(sloRecvIfR);
					}
				}
			}
			
			if (!isNull(taxChkL)) {
				MAM_TAX_R t = MAM_TAX_R.create("T");

				MCList<MAM_TAX_R> taxL = MCList.create(MAM_TAX_R.class);
				MCQueryApiBuilder taxL_bldr = MCQueryApiBuilder.create(t);
				taxL_bldr.setSelect(t.tax_cd);
				taxL_bldr.addSelect(t.tax_rate);
				taxL_bldr.addSelect(t.tax_typ);
				taxL_bldr.addSelect(t.inc_tax_flg);
				taxL_bldr.addWhereWithAnd(t.tax_cd.eq(bind("mst_tax_cd")));
				dbSelect("MSLAL5120_MAM_TAX_S02", taxL, taxL_bldr, taxChkL.distinctNE("mst_tax_cd"));

				MCIndexKey idx = taxL.createIndex(MAM_TAX_R.$tax_cd);

				for (SloRecvIf_Chk01_DtlR taxChkR : taxChkL) {
					MAM_TAX_R mstR = taxL.getFirst(idx, taxChkR.getString("mst_tax_cd"));
					if (mstR == null) {
						msgL.add(new MCMessage(taxChkR, null, MSLAL0013, taxChkR.data_no(), taxChkR.data_lno(),
								taxChkR.tax_rate(), taxChkR.tax_typ(), taxChkR.inc_tax_flg()));
					}
					else {
						if (!isSame(taxChkR.tax_rate(), mstR.tax_rate())
								|| !isSame(taxChkR.tax_typ(), mstR.tax_typ())
								|| !isSame(taxChkR.inc_tax_flg(), mstR.inc_tax_flg())) {
							msgL.add(new MCMessage(taxChkR, null, MSLAL0464, taxChkR.data_no(), taxChkR.data_lno(),
									taxChkR.tax_rate(), taxChkR.tax_typ(), taxChkR.inc_tax_flg(),
									mstR.tax_cd(), mstR.tax_rate(), mstR.tax_typ(), mstR.inc_tax_flg()));
						}
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 単価に関連するチェック処理を行う。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkUpri(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			setTrdCur(sloRecvIfL);
			
			setMstTrdCurUpri(sloRecvIfL);
			
			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (isDel(sloRecvIfR) 
						|| sloRecvIfR.vmi_flg() 
						|| sloRecvIfR.abort_flg()) {
					continue;
				}
				
				msgL.addAll(check(sloRecvIfR, SloRecvIf_Chk01_DtlR.$trd_cur_upri, new FXUCL_RequiredValidater()));
				
				if (isNull(sloRecvIfR.trd_cur_upri())) {
					continue;
				}
				
				if (sloRecvIfR.trd_cur_upri().scale() > sloRecvIfR.upri_dec_place().intValue()) {
					
					msgL.add(new MCMessage(sloRecvIfR, null, MSLAL0016, sloRecvIfR.data_no(), sloRecvIfR.data_lno(), sloRecvIfR.trd_cur_upri(), sloRecvIfR.upri_dec_place()));
				}
				//値の正負チェック
				if(sloRecvIfR.dscnt_itm_flg()) {
					//値引き品の場合、単価に絶対値をセットしなおす
					sloRecvIfR.trd_cur_upri(sloRecvIfR.trd_cur_upri().abs());
					if (!isNull(sloRecvIfR.trd_cur_amt())) {
						sloRecvIfR.trd_cur_amt(sloRecvIfR.trd_cur_amt().abs());
					}
					if (!isNull(sloRecvIfR.trd_cur_tax_amt())) {
						sloRecvIfR.trd_cur_tax_amt(sloRecvIfR.trd_cur_tax_amt().abs());
					}
				}
				else {
					msgL.addAll(check(sloRecvIfR, SloRecvIf_Chk01_DtlR.$trd_cur_upri, new FXUCL_SmallLargeValidater(null, MCNumber.ZERO, null)));
				}
				
				// 単価チェック
				if (!sloRecvIfR.upri_not_chk_flg() 
						&& (!isUpd(sloRecvIfR) || !isTrnst(getSloD(sloRecvIfR.slo_d_no())))) {
					
					if (!isSame(sloRecvIfR.trd_cur_upri(), sloRecvIfR.mst_trd_cur_upri()) && sloRecvIfR.trd_unit_qty().isPositive()) {
						msgL.add(new MCMessage(sloRecvIfR, null, MSLAL0017, sloRecvIfR.data_no(), sloRecvIfR.data_lno(), sloRecvIfR.trd_cur_upri(), sloRecvIfR.mst_trd_cur_upri()));
					}
					
					if (!isSame(sloRecvIfR.interim_flg(), sloRecvIfR.mst_interim_flg())) {
						msgL.add(new MCMessage(sloRecvIfR, null, MSLAL0191, sloRecvIfR.data_no(), sloRecvIfR.data_lno(), sloRecvIfR.interim_flg(), sloRecvIfR.mst_interim_flg()));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * インボイス単価に関連するチェックを行う。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkIvUpri(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (isDel(sloRecvIfR) || sloRecvIfR.vmi_flg()) {
					continue;
				}
				
				if (sloRecvIfR.cst_iv_flg()) {
					
					if (!sloRecvIfR.trd_cur_upri().isZero()) {
						sloRecvIfR.iv_upri(sloRecvIfR.trd_cur_upri());
					}
					else {
						if (isNull(sloRecvIfR.mst_trd_cur_upri())) {
							msgL.add(new MCMessage(sloRecvIfR, null, MSLAL0200, sloRecvIfR.data_no(), sloRecvIfR.data_lno(), 
									toDispItm(sloRecvIfR.itm_cd(), sloRecvIfR.itm_sub1(), sloRecvIfR.itm_sub2(), sloRecvIfR.itm_sub3())));
						}
						else {
						
							sloRecvIfR.iv_upri(sloRecvIfR.mst_trd_cur_upri());
						}
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 金額に関連するチェック処理を行う。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkAmt(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (isDel(sloRecvIfR) || sloRecvIfR.vmi_flg()) {
					continue;
				}
				
				if (!sloRecvIfR.amt_not_chk_flg() || !sloRecvIfR.tax_not_chk_flg()) {
					
					MCRow amtR = MAUCL_AmtUtil.getAmtAndTax(sloRecvIfR.trd_cur_upri(), sloRecvIfR.trd_unit_qty(),
							sloRecvIfR.tax_rate(), sloRecvIfR.inc_tax_flg(), sloRecvIfR.amt_dec_place(), sloRecvIfR.sls_amt_rnd_typ(), sloRecvIfR.sls_tax_rnd_typ(),
							sloRecvIfR.trd_cur_dscnt_amt());
					
					// 金額チェック
					if (!sloRecvIfR.amt_not_chk_flg() && !isNull(sloRecvIfR.trd_cur_amt())) {
						
						MCNumber mstAmt = amtR.getNumberNE("amt");
						
						if (!isSame(sloRecvIfR.trd_cur_amt(), mstAmt)) {
							
							msgL.add(new MCMessage(sloRecvIfR, null, MSLAL0018, sloRecvIfR.data_no(), sloRecvIfR.data_lno(), sloRecvIfR.trd_cur_amt(), mstAmt));
						}
					}
					
					// 税額チェック
					if (!sloRecvIfR.tax_not_chk_flg() && !isNull(sloRecvIfR.trd_cur_tax_amt())) {
						MCNumber mstTaxAmt = amtR.getNumberNE("tax_amt");
						if (!isSame(sloRecvIfR.trd_cur_tax_amt(), mstTaxAmt)) {
							
							msgL.add(new MCMessage(sloRecvIfR, null, MSLAL0019, sloRecvIfR.data_no(), sloRecvIfR.data_lno(), sloRecvIfR.trd_cur_tax_amt(), mstTaxAmt));
						}
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 値引理由に関連するチェックを行う。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkDscntRsn(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			MCList<SloRecvIf_Chk01_DtlR> chkL = sloRecvIfL.subList(r -> !r.vmi_flg() && !isNull(r.trd_cur_dscnt_amt()) && isNull(r.dscnt_rsn_cd()));
			
			String defDscntRsnCd = null;
			
			if (!chkL.isEmpty()) {
				
				MAM_BIZ_RSN_R bizRsnR = getDefDscntRsnCd();
				
				if (!isNull(bizRsnR)) {
					defDscntRsnCd = bizRsnR.biz_rsn_cd();
				}
			}
			
			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (isDel(sloRecvIfR) || sloRecvIfR.vmi_flg()) {
					continue;
				}
			
				if (!isNull(sloRecvIfR.trd_cur_dscnt_amt()) && isNull(sloRecvIfR.dscnt_rsn_cd())) {
					
					if (isNull(defDscntRsnCd)) {
						msgL.add(new MCMessage(sloRecvIfR, null, MSLAL0041, sloRecvIfR.data_no(), sloRecvIfR.data_lno()));
					}
					else {
						MST_SLO_D_R sloDR = getSloD(sloRecvIfR.slo_d_no());
						
						if (isUpd(sloRecvIfR) && !isNull(sloDR) && !isNull(sloDR.dscnt_rsn_cd())) {
							sloRecvIfR.dscnt_rsn_cd(sloDR.dscnt_rsn_cd());
						}
						else {
							sloRecvIfR.dscnt_rsn_cd(defDscntRsnCd);
						}
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 0単価の場合、売上理由に関連するチェックを行う。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkSlsRsn(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			MCList<SloRecvIf_Chk01_DtlR> chkL = sloRecvIfL.subList(r -> !r.vmi_flg() && !isNull(r.trd_cur_upri()) && r.trd_cur_upri().isZero());
			
			MCList<MAM_BIZ_RSN_R> slsRsnL = null;
			MCIndexKey idxkey = null;
			
			if (!chkL.isEmpty()) {
				
				slsRsnL = getDefSlsRsn();
				idxkey = slsRsnL.createIndex(MAM_BIZ_RSN_R.$sls_acxfr_flg);
			}
			
			boolean slsAcxfrFlg = false;
			MCList<MAM_BIZ_RSN_R> subSlsRsnL = null;
			
			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
			
				slsAcxfrFlg = false;
				subSlsRsnL = null;
				
				if (isDel(sloRecvIfR) || sloRecvIfR.vmi_flg()) {
					continue;
				}
			
				if (!isNull(sloRecvIfR.trd_cur_upri()) && sloRecvIfR.trd_cur_upri().isZero()) {
					
					if (MAC_ASSET_MNG_TYP.isMNG(sloRecvIfR.asset_mng_typ())) {
						// 資産管理する場合は、販売他勘定がオンの業務理由を取得する。
						slsAcxfrFlg = true;
					}
					else if (MAC_ASSET_MNG_TYP.isNOT_MNG(sloRecvIfR.asset_mng_typ())) {
						// 資産管理する場合は、販売他勘定がオフの業務理由を取得する。
						slsAcxfrFlg = false;
					}
					
					MST_SLO_D_R sloDR = getSloD(sloRecvIfR.slo_d_no());
					if (isUpd(sloRecvIfR) 
							&& !isNull(sloDR) 
							&& !isNull(sloDR.sls_rsn_cd()) 
							&& isSame(slsAcxfrFlg, sloDR.getBooleanNE(MAM_BIZ_RSN_R.$sls_acxfr_flg))) {
						
						sloRecvIfR.sls_rsn_cd(sloDR.sls_rsn_cd());
					}
					else {
						
						subSlsRsnL = slsRsnL.subList(idxkey, slsAcxfrFlg);
						
						if (subSlsRsnL.isEmpty()) {
							
							if (slsAcxfrFlg) {
								msgL.add(new MCMessage(sloRecvIfR, null, MSLAL0042, sloRecvIfR.data_no(), sloRecvIfR.data_lno(),
										toDispItm(sloRecvIfR.itm_cd(), sloRecvIfR.itm_sub1(), sloRecvIfR.itm_sub2(), sloRecvIfR.itm_sub3())));
							}
							else {
								
								msgL.add(new MCMessage(sloRecvIfR, null, MSLAL0061, sloRecvIfR.data_no(), sloRecvIfR.data_lno(),
										toDispItm(sloRecvIfR.itm_cd(), sloRecvIfR.itm_sub1(), sloRecvIfR.itm_sub2(), sloRecvIfR.itm_sub3())));
							}

						}
						else {
							subSlsRsnL.sort(SortType.ASC, MAM_BIZ_RSN_R.$sls_sort_seq, MAM_BIZ_RSN_R.$biz_rsn_cd);
							sloRecvIfR.sls_rsn_cd(subSlsRsnL.get(0).biz_rsn_cd());
							sloRecvIfR.sls_acxfr_flg(slsAcxfrFlg);
						}
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 販売他勘定の場合、負担部門に関連するチェックを行う。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkBdDpt(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (isDel(sloRecvIfR) || sloRecvIfR.vmi_flg()) {
					continue;
				}
					
				MST_SLO_D_R sloDR = getSloD(sloRecvIfR.slo_d_no());
				if (isUpd(sloRecvIfR) && !isNull(sloDR) && !isNull(sloDR.bd_dpt_cd()) && isSame(sloRecvIfR.sls_rsn_cd(), sloDR.sls_rsn_cd())) {
					sloRecvIfR.bd_dpt_cd(sloDR.bd_dpt_cd());
				}
				else {
					if (sloRecvIfR.sls_acxfr_flg()) {
						
						if (!sloRecvIfR.bd_dpt_flg()) {
							msgL.add(new MCMessage(sloRecvIfR, 
									null, MSLAL0062, sloRecvIfR.data_no(), sloRecvIfR.data_lno(),
									toDispItm(sloRecvIfR.itm_cd(), sloRecvIfR.itm_sub1(), sloRecvIfR.itm_sub2(), sloRecvIfR.itm_sub3()),
									sloRecvIfR.sls_dpt_cd()));
						}
						else {
							sloRecvIfR.bd_dpt_cd(sloRecvIfR.sls_dpt_cd());
						}
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 場所に関連するチェックを行う。（メーカが設定された場合のみ）
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkLoc(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {

			MCMessageList msgL = new MCMessageList();
		
			setSloAllocLoc(sloRecvIfL);
			
			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (isDel(sloRecvIfR)) {
					continue;
				}
				
				if (!isNull(sloRecvIfR.maker_cd()) && !MAC_STR.isNULL_VAL(sloRecvIfR.maker_cd())) {
					
					if ((MAC_SLO_PROC_TYP.isPROC(sloRecvIfR.proc_typ()) || MAC_SLO_PROC_TYP.isALLOC_PROC(sloRecvIfR.proc_typ())) && isNull(sloRecvIfR.loc_cd())) {
						// メーカが指定されている場合、発注先を特定する為に、受注引当マスタに引当場所を登録する必要があります。
						msgL.add(new MCMessage(sloRecvIfR, null, MSLAL0045, sloRecvIfR.data_no(), sloRecvIfR.data_lno(), sloRecvIfR.maker_cd()));
					}
					
					if (MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ()) && isNull(sloRecvIfR.mid_loc_cd())) {

						// 手配区分が仕入直送、かつメーカが指定されている場合、発注先を特定する為に、仕入直送中継場所を設定する必要があります。
						msgL.add(new MCMessage(sloRecvIfR, null, MSLAL0046, sloRecvIfR.data_no(), sloRecvIfR.data_lno(), sloRecvIfR.maker_cd()));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 発注先に関連するチェックを行う。（メーカが設定された場合のみ）
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkSppl(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {

			MCMessageList msgL = new MCMessageList();
			
			setSppl(sloRecvIfL);
			
			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (isDel(sloRecvIfR)) {
					continue;
				}
				
				if (!isNull(sloRecvIfR.maker_cd()) && !MAC_STR.isNULL_VAL(sloRecvIfR.maker_cd())) {
					
					if ((MAC_SLO_PROC_TYP.isPROC(sloRecvIfR.proc_typ()) 
							|| MAC_SLO_PROC_TYP.isALLOC_PROC(sloRecvIfR.proc_typ())
							|| MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ())) 
							&& isNull(sloRecvIfR.sppl_cd())) {

						msgL.add(new MCMessage(sloRecvIfR, null, MSLAL0047, sloRecvIfR.data_no(), sloRecvIfR.data_lno(), sloRecvIfR.maker_cd()));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 補完処理で使用するキャッシュ情報を作成する。
		 */
		protected void crtCache() {

				
				crtItmLclCache();
		}
		
		/**
		 * 品目マスタ(ロケール別情報)のキャッシューを作成する。
		 */
		protected void crtItmLclCache() {
			
			MCList<SloRecvIf_Chk01_DtlR> tgtL = MCList.create(SloRecvIf_Chk01_DtlR.create());
			
			for (SloRecvIf_Chk01_DtlR sloRecvIfR : getNotErrL()) {
				
				MST_SLO_D_R sloDR = getSloD(sloRecvIfR.slo_d_no());
				
				if (sloRecvIfR.cst_iv_flg() 
						&& (isCrt(sloRecvIfR) 
								|| (isUpd(sloRecvIfR) && !isNull(sloDR) && 
										(!isSameItm(sloRecvIfR, sloDR) || !isSame(
												sloRecvIfR.prnt_lcl_cd(),
												sloDR.getStringNE(
														MAM_BP_R.$prnt_lcl_cd)))))) {
					
					tgtL.add(sloRecvIfR);
				}
			}
				
			if (!tgtL.isEmpty()) {
				
				MCQueryApiBuilder itmLclL_bldr = MCQueryApiBuilder.create(MAM_ITM_LCL_R.create("T"));
				
				_itmLclCache = new FXUCL_MCDbcCache<MAM_ITM_LCL_R>(
						itmLclL_bldr, 
						tgtL, 
						SloRecvIf_Chk01_DtlR.$itm_cd, 
						SloRecvIf_Chk01_DtlR.$itm_sub1,
						SloRecvIf_Chk01_DtlR.$itm_sub2, 
						SloRecvIf_Chk01_DtlR.$itm_sub3, 
						SloRecvIf_Chk01_DtlR.$prnt_lcl_cd);
			}
		}
		
		/**
		 * キャッシューから品目マスタ(ロケール別情報)を取得する。
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @return　品目マスタ(ロケール別情報)マスタ
		 */
		protected MAM_ITM_LCL_R getItmLcl(SloRecvIf_Chk01_DtlR sloRecvIfR) {
			
			return _itmLclCache.get(sloRecvIfR.itm_cd(), sloRecvIfR.itm_sub1(), sloRecvIfR.itm_sub2(), sloRecvIfR.itm_sub3(), sloRecvIfR.prnt_lcl_cd());
		}
		
		/**
		 * 受注受信ＩＦの補完を行う。
		 */
		protected void compl() {
			
			
				complHdr();
			
				complDtl();
		}
		
		/**
		 * 受注受信ＩＦのヘッダ項目の補完を行う。
		 */
		protected void complHdr() {

			for (SloRecvIf_Chk01_DtlR sloRecvIfR : getNotErrL()) {
				
				if (isDel(sloRecvIfR)) {
					continue;
				}
				
				MST_SLO_R sloR = getSlo(sloRecvIfR.slo_no());
				
				setAssortTyp(sloRecvIfR, sloR);
				
				setXrate(sloRecvIfR, sloR);
				
				setAdv(sloRecvIfR, sloR);
				
				setArDpt(sloRecvIfR, sloR);
				
				setTrdRmrks(sloRecvIfR, sloR);
				
				setTtermCd(sloRecvIfR, sloR);
			}
		}
		
		/**
		 * 受注受信ＩＦの明細項目の補完を行う。
		 */
		protected void complDtl() {

			getWtaxRateSub(getNotErrL());
			for (SloRecvIf_Chk01_DtlR sloRecvIfR : getNotErrL()) {
				
				if (isDel(sloRecvIfR)) {
					continue;
				}
				
				MST_SLO_R sloR = getSlo(sloRecvIfR.slo_no());
				
				MST_SLO_D_R sloDR = getSloD(sloRecvIfR.slo_d_no());
				
				setItmNm(sloRecvIfR, sloDR);
				
				setIvItmNm(sloRecvIfR, sloDR);
				
				setUpriNotTgtFlg(sloRecvIfR);
				
				setCostUpri(sloRecvIfR, sloDR, sloR);
				
				setWtaxRate(sloRecvIfR, sloDR, sloR);
				
				setBillCrryovrTimes(sloRecvIfR, sloDR);
				
				setSloSno(sloRecvIfR, sloDR);
				
				setDlv(sloRecvIfR, sloDR);
				
				setPriPrntFlg(sloRecvIfR, sloDR);
				
				setShipSchdSplitTyp(sloRecvIfR, sloDR);
				
				setAllocTyp(sloRecvIfR, sloDR);
				
				setShipTermCd(sloRecvIfR, sloDR);
				
				setShipBlockFlg(sloRecvIfR);
				
				setSubLotNo(sloRecvIfR);
				
				setVerNo(sloRecvIfR);
				
				setMakerCd(sloRecvIfR);
				
				setDlvDayWeekTyp(sloRecvIfR);
				setRemAbortAbl(sloRecvIfR, sloDR);
				
				setNotMixFlg(sloRecvIfR, sloDR, sloR);
				
				clearVmi(sloRecvIfR);
			}
		}
		
		/**
		 * 売上部門に関連する項目を設定する。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 */
		protected void setSlsDptItm(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {
			MAM_DPT_R t = MAM_DPT_R.create("T");

			MCQueryApiBuilder dptL_bldr = MCQueryApiBuilder.create(t);
			dptL_bldr.setSelect(t.wg_cd, t.bd_dpt_flg);
			FXUCL_MCDbcCacheStEnd<MAM_DPT_R> dptCache = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(dptL_bldr, sloRecvIfL, SloRecvIf_Chk01_DtlR.$sls_dpt_cd);
			
			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (!isNull(sloRecvIfR.sls_dpt_cd())) {
					
					MAM_DPT_R dtpR = dptCache.get(sloRecvIfR.slo_dt(), sloRecvIfR.sls_dpt_cd());
					
					if (!isNull(dtpR)) {
						
						sloRecvIfR.dpt_wg_cd(dtpR.wg_cd());
						sloRecvIfR.bd_dpt_flg(dtpR.bd_dpt_flg());
					}
				}
			}
		}
		
		/**
		 * 売上担当者で売上部門を取得する。
		 * @param sloRecvIfR　取込対象行
		 * @return 売上部門ＣＤ
		 */
		protected String getSlsDptBySlsUsr(SloRecvIf_Chk01_DtlR sloRecvIfR) {
			
			String slsDptCd = null;
			
			MCList<MAVM_USR_DPT_R> usrDptAllL = getUsrDptL(sloRecvIfR.sls_usr_cd());
			if (isNull(usrDptAllL)) {
				return null;
			}
			MCList<MAVM_USR_DPT_R> usrDptL = MCList.create(MAVM_USR_DPT_R.class);
			for (MAVM_USR_DPT_R usrDptR : usrDptAllL) {
				if (usrDptR.st_dt().lte(sloRecvIfR.slo_dt()) && sloRecvIfR.slo_dt().lte(usrDptR.end_dt())
						&& usrDptR.getDateNE("dpt_st_dt").lte(sloRecvIfR.slo_dt()) && sloRecvIfR.slo_dt().lte(usrDptR.getDateNE("dpt_end_dt"))) {
					usrDptL.add(usrDptR);
				}
			}
			
			MCIndexKey dptIdxkey = usrDptL.createIndex(MAVM_USR_DPT_R.$dpt_cd);
			MCIndexKey mainIdxkey = usrDptL.createIndex(MAVM_USR_DPT_R.$main_flg);
			
			if (!usrDptL.isEmpty()) {
				
				if (usrDptL.contains(dptIdxkey, sloRecvIfR.cst_sls_dpt_cd())) {
					
					slsDptCd = sloRecvIfR.cst_sls_dpt_cd();
				}
				else if (usrDptL.contains(mainIdxkey, true)) {
					
					slsDptCd = usrDptL.getFirst(mainIdxkey, true).dpt_cd();
				}
				else {
					usrDptL.sort(SortType.ASC, MAVM_USR_DPT_R.$dpt_cd);
					
					slsDptCd = usrDptL.get(0).dpt_cd();
				}
			}
			
			return slsDptCd;
		}
		
		/**
		 * 配送先に関連する項目を設定する。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 */
		protected void setTdlv(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {
			
			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (isDel(sloRecvIfR)) {
					continue;
				}
				
				MST_SLO_R sloR = getSlo(sloRecvIfR.slo_no());
				MST_SLO_D_R sloDR = getSloD(sloRecvIfR.slo_d_no());
				
				if (isNull(sloRecvIfR.tdlv_cd())) {
					
					if (sloRecvIfR.tdlv_req_flg()) {
						
						if (isUpd(sloRecvIfR) 
								&& !isNull(sloR)
								&& !isNull(sloDR) 
								&& !isNull(sloDR.tdlv_cd()) 
								&& isSame(sloRecvIfR.dpt_wg_cd(), sloR.wg_cd()) 
								&& isSame(sloRecvIfR.dlv_cd(), sloDR.dlv_cd()) 
								&& isSameItm(sloRecvIfR, sloDR)) {
								
								sloRecvIfR.tdlv_cd(sloDR.tdlv_cd());
								setSloTdlv(sloRecvIfR, sloDR);
						}
						else {
							MAM_LG_CTL_R t = MAM_LG_CTL_R.create("T");
							MAM_BP_R m1 = MAM_BP_R.create("M1");

								
								MAM_LG_CTL_R lgCtlR = MAM_LG_CTL_R.create();
								MCQueryApiBuilder lgCtlR_bldr = MCQueryApiBuilder.create(t);
								lgCtlR_bldr.setSelect(t.def_tdlv_cd);
								lgCtlR_bldr.addSelect(m1.bp_nm);
								lgCtlR_bldr.addSelect(m1.via_dlv_typ);
								lgCtlR_bldr.addSelect(m1.lg_grp_cd);
								lgCtlR_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR( m1.bp_cd, bind("today"), value(MAC_BP_ADDR_TYP.DLV_CNTCT_DPT.value())).as("cntct_dpt"));
								lgCtlR_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR( m1.bp_cd, bind("today"), value(MAC_BP_ADDR_TYP.DLV_CNTCT_PSN.value())).as("cntct_psn"));
								lgCtlR_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR( m1.bp_cd, bind("today"), value(MAC_BP_ADDR_TYP.ZIP_CD.value())).as("zip_cd"));
								lgCtlR_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR( m1.bp_cd, bind("today"), value(MAC_BP_ADDR_TYP.ADDR1.value())).as("addr1"));
								lgCtlR_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR( m1.bp_cd, bind("today"), value(MAC_BP_ADDR_TYP.ADDR2.value())).as("addr2"));
								lgCtlR_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR( m1.bp_cd, bind("today"), value(MAC_BP_ADDR_TYP.ADDR3.value())).as("addr3"));
								lgCtlR_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR( m1.bp_cd, bind("today"), value(MAC_BP_ADDR_TYP.ADDR4.value())).as("addr4"));
								lgCtlR_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR( m1.bp_cd, bind("today"), value(MAC_BP_ADDR_TYP.TEL.value())).as("tel"));
								lgCtlR_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR( m1.bp_cd, bind("today"), value(MAC_BP_ADDR_TYP.FAX.value())).as("fax"));
								lgCtlR_bldr.addInnerJoin(m1, t.def_tdlv_cd.eq(m1.bp_cd));
								
								MAM_LG_CTL_R bindR = MAM_LG_CTL_R.create();
								bindR.fr_lg_grp_cd(getFrLgGrpCd(sloRecvIfR));
								bindR.to_lg_grp_cd(sloRecvIfR.dlv_lg_grp_cd());
								bindR.ship_term_cd(MAC_STR.NULL_VAL.value());
								bindR.addDateColumn("today", getToday());
								
								dbSelectKey("MSLAL5120_MAM_LG_CTL_S01", lgCtlR, lgCtlR_bldr, bindR);
								
							if (!isNull(lgCtlR)) {
								
								sloRecvIfR.tdlv_cd(lgCtlR.def_tdlv_cd());
								sloRecvIfR.tdlv_nm(lgCtlR.getStringNE("bp_nm"));
								sloRecvIfR.via_dlv_typ(lgCtlR.getStringNE("via_dlv_typ"));
								sloRecvIfR.tdlv_cntct_dpt(lgCtlR.getStringNE("cntct_dpt"));
								sloRecvIfR.tdlv_cntct_psn(lgCtlR.getStringNE("cntct_psn"));
								sloRecvIfR.tdlv_zip_cd(lgCtlR.getStringNE("zip_cd"));
								sloRecvIfR.tdlv_addr1(lgCtlR.getStringNE("addr1"));
								sloRecvIfR.tdlv_addr2(lgCtlR.getStringNE("addr2"));
								sloRecvIfR.tdlv_addr3(lgCtlR.getStringNE("addr3"));
								sloRecvIfR.tdlv_addr4(lgCtlR.getStringNE("addr4"));
								sloRecvIfR.tdlv_tel(lgCtlR.getStringNE("tel"));
								sloRecvIfR.tdlv_fax(lgCtlR.getStringNE("fax"));
								sloRecvIfR.tdlv_lg_grp_cd(lgCtlR.getStringNE("lg_grp_cd"));
							}
						}
					}
				}
				else {
					
					if (!sloRecvIfR.tdlv_sundry_flg()) {
						
						if (isUpd(sloRecvIfR) && !isNull(sloDR) && isSame(sloRecvIfR.tdlv_cd(), sloDR.tdlv_cd())) {
									
							setSloTdlv(sloRecvIfR, sloDR);
						}
						else {
							sloRecvIfR.tdlv_nm(sloRecvIfR.mst_tdlv_nm());
							sloRecvIfR.tdlv_cntct_dpt(sloRecvIfR.mst_tdlv_cntct_dpt());
							sloRecvIfR.tdlv_cntct_psn(sloRecvIfR.mst_tdlv_cntct_psn());
							sloRecvIfR.tdlv_zip_cd(sloRecvIfR.mst_tdlv_zip_cd());
							sloRecvIfR.tdlv_addr1(sloRecvIfR.mst_tdlv_addr1());
							sloRecvIfR.tdlv_addr2(sloRecvIfR.mst_tdlv_addr2());
							sloRecvIfR.tdlv_addr3(sloRecvIfR.mst_tdlv_addr3());
							sloRecvIfR.tdlv_addr4(sloRecvIfR.mst_tdlv_addr4());
							sloRecvIfR.tdlv_tel(sloRecvIfR.mst_tdlv_tel());
							sloRecvIfR.tdlv_fax(sloRecvIfR.mst_tdlv_fax());
						}
					}
				}
				
				if (isNull(sloRecvIfR.tdlv_cd()) || !sloRecvIfR.cst_iv_flg() || MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ())) {
					sloRecvIfR.via_dlv_typ(MAC_VIA_DLV_TYP.NOT_VIA.value());
				}
			}
		}
		
		/**
		 * 受注明細の配送先を保持する。
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @param sloDR 受注明細
		 */
		protected void setSloTdlv(SloRecvIf_Chk01_DtlR sloRecvIfR, MST_SLO_D_R sloDR) {
			
			sloRecvIfR.tdlv_nm(sloDR.tdlv_nm());
			sloRecvIfR.via_dlv_typ(sloDR.via_dlv_typ());
			sloRecvIfR.tdlv_cntct_dpt(sloDR.tdlv_cntct_dpt());
			sloRecvIfR.tdlv_cntct_psn(sloDR.tdlv_cntct_psn());
			sloRecvIfR.tdlv_zip_cd(sloDR.tdlv_zip_cd());
			sloRecvIfR.tdlv_addr1(sloDR.tdlv_addr1());
			sloRecvIfR.tdlv_addr2(sloDR.tdlv_addr2());
			sloRecvIfR.tdlv_addr3(sloDR.tdlv_addr3());
			sloRecvIfR.tdlv_addr4(sloDR.tdlv_addr4());
			sloRecvIfR.tdlv_tel(sloDR.tdlv_tel());
			sloRecvIfR.tdlv_fax(sloDR.tdlv_fax());
			sloRecvIfR.tdlv_lg_grp_cd(sloDR.tdlv_lg_grp_cd());
		}
		
		/**
		 * 業務理由マスタからデフォルト売上理由を取得する。
		 * @return 業務理由マスタリスト
		 */
		protected MCList<MAM_BIZ_RSN_R> getDefSlsRsn() {
			
			MCList<MAM_BIZ_RSN_R> bizRsnL = MCList.create(MAM_BIZ_RSN_R.class);
			MAM_BIZ_RSN_R t = MAM_BIZ_RSN_R.create("T");
			MCQueryApiBuilder bizRsnL_bldr = MCQueryApiBuilder.create(t);
			bizRsnL_bldr.setWhere(t.sls_flg.eq(value(true)));
			
			dbSelect("MSLAL5120_MAM_BIZ_RSN_S01", bizRsnL, bizRsnL_bldr);
			
			return bizRsnL;
		}
		
		/**
		 * 業務理由マスタからデフォルト値引理由を取得する。
		 * @return 業務理由マスタ
		 */
		protected MAM_BIZ_RSN_R getDefDscntRsnCd() {
			
			MAM_BIZ_RSN_R t = MAM_BIZ_RSN_R.create("T");

			MCList<MAM_BIZ_RSN_R> bizRsnL = MCList.create(MAM_BIZ_RSN_R.class);
			MCQueryApiBuilder bizRsnL_bldr = MCQueryApiBuilder.create(t);
			bizRsnL_bldr.setWhere(t.sls_dscnt_flg.eq(value(true)));
			bizRsnL_bldr.setOrderByAsc(t.sls_dscnt_sort_seq, t.biz_rsn_cd);
			
			dbSelect("MSLAL5120_MAM_BIZ_RSN_S02", bizRsnL, bizRsnL_bldr);
			
			if (!bizRsnL.isEmpty()) {
				return bizRsnL.get(0);
			}
			
			return null;
		}
		
		/**
		 * 取引通貨に関連する項目を補完する。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 */
		protected void setTrdCur(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {

			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (isNull(sloRecvIfR.trd_cur_cd())) {
					
					sloRecvIfR.trd_cur_cd(sloRecvIfR.cst_trd_cur_cd());
					sloRecvIfR.upri_dec_place(sloRecvIfR.cst_upri_dec_place());
					sloRecvIfR.amt_dec_place(sloRecvIfR.cst_amt_dec_place());
				}
			}
		}
		
		/**
		 * 発注先を設定する。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 */
		protected void setSppl(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {

			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (isDel(sloRecvIfR)) {
					continue;
				}
				
				if (MAC_SLO_PROC_TYP.isPROC(sloRecvIfR.proc_typ()) 
								|| MAC_SLO_PROC_TYP.isALLOC_PROC(sloRecvIfR.proc_typ())
								|| MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ())) {
					
					MST_SLO_D_R sloDR = getSloD(sloRecvIfR.slo_d_no());
					
					if (isUpd(sloRecvIfR) 
							&& !isNull(sloDR) 
							&& !isNull(sloDR.sppl_cd())
							&& isSame(nullValToNull(sloRecvIfR.maker_cd()), nullValToNull(sloDR.maker_cd()))
							&& (isSame(sloRecvIfR.loc_wg_cd(), sloDR.getStringNE(MAM_LOC_R.$wg_cd)))
							&& isSameItm(sloRecvIfR, sloDR)) {
						
						sloRecvIfR.sppl_cd(sloDR.sppl_cd());
						sloRecvIfR.maker_cd(sloDR.maker_cd());
					}
					
					if (!isNull(sloRecvIfR.maker_cd()) && isNull(sloRecvIfR.sppl_cd())) {
						
						MAM_ITM_DTL_R itmDtlR = getItmDtl(sloRecvIfR);
						if (!isNull(itmDtlR)) {
							sloRecvIfR.sppl_cd(itmDtlR.sppl_cd());
						}
					}
				}
			}
		}
		
		/**
		 * 品目詳細マスタを取得する。
		 */
		protected void getItmDtl() {
			
			MAM_ITM_DTL_R t = MAM_ITM_DTL_R.create("T");

			_itmDtlL = MCList.create(MAM_ITM_DTL_R.class);
			MCQueryApiBuilder itmDtlL_bldr = MCQueryApiBuilder.create(t);
			
			itmDtlL_bldr.setSelect(t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3, t.sppl_cd, t.maker_cd, t.wg_cd, t.prio);
			
			itmDtlL_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			itmDtlL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			itmDtlL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			itmDtlL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));				
			itmDtlL_bldr.addWhereWithAnd(t.maker_cd.eq(bind("maker_cd")));
			itmDtlL_bldr.addWhereWithAnd(t.wg_cd.eq(bind("loc_wg_cd")));
			itmDtlL_bldr.addWhereWithAnd(bind("slo_dt").between(t.st_dt, t.end_dt));
			
			dbSelect("MSLAL5120_MAM_ITM_DTL_S01", _itmDtlL, itmDtlL_bldr, getNotErrL().groupBy(SloRecvIf_Chk01_DtlR.$itm_cd, SloRecvIf_Chk01_DtlR.$itm_sub1, SloRecvIf_Chk01_DtlR.$itm_sub2, SloRecvIf_Chk01_DtlR.$itm_sub3, SloRecvIf_Chk01_DtlR.$maker_cd, SloRecvIf_Chk01_DtlR.$loc_wg_cd, SloRecvIf_Chk01_DtlR.$slo_dt));
			
			_itmDtlIdxkey = _itmDtlL.createIndex(MAM_ITM_DTL_R.$itm_cd,
					MAM_ITM_DTL_R.$itm_sub1,
					MAM_ITM_DTL_R.$itm_sub2,
					MAM_ITM_DTL_R.$itm_sub3,
					MAM_ITM_DTL_R.$maker_cd, 
					MAM_ITM_DTL_R.$wg_cd);
		}
		
		/**
		 * 引数で指定された受注受信ＩＦのメーカに紐付く品目詳細マスタを返す。
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @return 品目詳細マスタ
		 */
		protected MAM_ITM_DTL_R getItmDtl(SloRecvIf_Chk01_DtlR sloRecvIfR) {
			
			if (isNull(_itmDtlL)) {
				
				getItmDtl();
			}
			
			Comparable<?>[] vals = new Comparable[]{
					sloRecvIfR.itm_cd(), 
					sloRecvIfR.itm_sub1(), 
					sloRecvIfR.itm_sub2(),
					sloRecvIfR.itm_sub3(),
					sloRecvIfR.maker_cd(),
					sloRecvIfR.loc_wg_cd()};
			
			MCList<MAM_ITM_DTL_R> imtDtlL = _itmDtlL.subList(_itmDtlIdxkey, vals);
			
			if (!imtDtlL.isEmpty()) {
				
				imtDtlL.sort(MAM_ITM_DTL_R.$prio, MAM_ITM_DTL_R.$sppl_cd);
			    return imtDtlL.get(0);
			}
			
			return null;
		}
		
		/**
		 * 引当に関連する項目を設定する。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 */
		protected void setSloAllocLoc(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {

			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (isDel(sloRecvIfR)) {
					continue;
				}
				
				sloRecvIfR.ship_lg_grp_cd(sloRecvIfR.ship_wh_cd());
						
				if (isUpd(sloRecvIfR)) {
					
					MST_SLO_R sloR = getSlo(sloRecvIfR.slo_no());
					MST_SLO_D_R sloDR = getSloD(sloRecvIfR.slo_d_no());
					
					String toLgGrpCd = MAC_VIA_DLV_TYP.isVIA(sloRecvIfR.via_dlv_typ()) ? sloRecvIfR.tdlv_lg_grp_cd() : sloRecvIfR.dlv_lg_grp_cd();
					String sloToLgGrpCd = MAC_VIA_DLV_TYP.isVIA(sloDR.via_dlv_typ()) ? sloDR.tdlv_lg_grp_cd() : sloDR.dlv_lg_grp_cd();
					
					if (!isNull(sloR) 
							&& !isNull(sloDR) 
							&& !MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ())
							&& !MAC_SHIP_INST_TYP.isNO_PICK(sloRecvIfR.ship_inst_typ())
							&& isSame(sloRecvIfR.dpt_wg_cd(), sloR.wg_cd())
							&& isSame(toLgGrpCd, sloToLgGrpCd)
							&& isSameItm(sloRecvIfR, sloDR)) {
						
						// 受注引当情報を保持する
						sloRecvIfR.alloc_scope_typ(sloDR.alloc_scope_typ());
						sloRecvIfR.alloc_grp_cd(sloDR.alloc_grp_cd());
						if (isNull(sloRecvIfR.ship_wh_cd())) {
							sloRecvIfR.ship_lg_grp_cd(sloDR.ship_lg_grp_cd());
						}
						sloRecvIfR.loc_cd(sloDR.loc_cd());
						sloRecvIfR.str_ln_cd(sloDR.str_ln_cd());
					}
				}
				
				if (!isNull(sloRecvIfR.maker_cd())) {
					
					sloRecvIfR.alloc_grp_cd(null);
					sloRecvIfR.ship_lg_grp_cd(null);
					
					if (isNull(sloRecvIfR.loc_cd())) {
						
						if (MAC_SLO_PROC_TYP.isPROC(sloRecvIfR.proc_typ()) 
								|| MAC_SLO_PROC_TYP.isALLOC_PROC(sloRecvIfR.proc_typ())) {
							
							MAM_SLO_ALLOC_R sloAllocR = getSloAllocLoc(sloRecvIfR);
							if (!isNull(sloAllocR)) {
								sloRecvIfR.loc_cd(sloAllocR.loc_cd());
							}
						}
					}
				}
				
				if (MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ())) {
					
					sloRecvIfR.alloc_grp_cd(null);
					sloRecvIfR.ship_lg_grp_cd(null);
					
					String midLocCd = null;
					try {
						midLocCd = MSUCL_SlsUtil.getMidLocCd(sloRecvIfR.sls_dpt_cd(), sloRecvIfR.slo_dt());
					}
					catch (Exception ex) {
						midLocCd = null;
					}
					
					if (!isNull(midLocCd)) {
						sloRecvIfR.mid_loc_cd(midLocCd);
					}
				}
			}
			
			setLocWgCd(sloRecvIfL);
		}
		
		/**
		 * 場所のワーキンググループを設定する。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 */
		protected void setLocWgCd(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {
			
			MCList<MAM_LOC_R> bindL = MCList.create(MAM_LOC_R.class);
			MAM_LOC_R bindR = null;
			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (isDel(sloRecvIfR) || isNullAnd(sloRecvIfR.loc_cd(), sloRecvIfR.mid_loc_cd())) {
					continue;
				}
				
				bindR = MAM_LOC_R.create();
				bindR.loc_cd(nvl(sloRecvIfR.loc_cd(), sloRecvIfR.mid_loc_cd()));
				
				bindL.add(bindR);
			}
			
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder locL_bldr = MCQueryApiBuilder.create(t);

			locL_bldr.setSelect(t.wg_cd);
			FXUCL_MCDbcCache<MAM_LOC_R> dptCache = new FXUCL_MCDbcCache<MAM_LOC_R>(locL_bldr, sloRecvIfL, SloRecvIf_Chk01_DtlR.$loc_cd);
			
			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (isDel(sloRecvIfR) || isNullAnd(sloRecvIfR.loc_cd(), sloRecvIfR.mid_loc_cd())) {
					continue;
				}
				
				if (!isNull(sloRecvIfR.loc_cd())) {
					
					MAM_LOC_R locR = dptCache.get(sloRecvIfR.loc_cd());
					
					if (!isNull(locR)) {
						
						sloRecvIfR.loc_wg_cd(locR.wg_cd());
					}
				}
				
				if (!isNull(sloRecvIfR.mid_loc_cd())) {
					
					MAM_LOC_R locR = dptCache.get(sloRecvIfR.mid_loc_cd());
					
					if (!isNull(locR)) {
						
						sloRecvIfR.loc_wg_cd(locR.wg_cd());
					}
				}
			}
		}
		
		/**
		 * 受注引当マスタを取得する。
		 */
		protected void getSloAlloc() {
			
			MAM_LOC_R m1 = MAM_LOC_R.create("M1");

			_sloAllocL = MCList.create(MAM_SLO_ALLOC_R.class);
			MAM_SLO_ALLOC_R t = MAM_SLO_ALLOC_R.create("T");
			MCQueryApiBuilder sloAllocL_bldr = MCQueryApiBuilder.create(t);
			sloAllocL_bldr.addSelect(m1.wg_cd.as("loc_wg_cd"));
			sloAllocL_bldr.addSelect(m1.lg_grp_cd.as("loc_lg_grp_cd"));
			sloAllocL_bldr.addLeftOuterJoin(m1, nvl( t.loc_cd, t.ship_loc_cd).eq(m1.loc_cd));
			dbSelectColumn("MSLAL5120_MAM_SLO_ALLOC_S01", _sloAllocL, sloAllocL_bldr, MAM_SLO_ALLOC_R.$wg_cd, getNotErrL(), SloRecvIf_Chk01_DtlR.$dpt_wg_cd);
		}
		
		/**
		 * 引数で指定された受注受信ＩＦに紐付く受注引当マスタを返す。
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @return 受注引当マスタ
		 */
		protected MAM_SLO_ALLOC_R getSloAllocLoc(SloRecvIf_Chk01_DtlR sloRecvIfR) {
			
			if (isNull(_sloAllocL)) {
				
				getSloAlloc();
				
				_sloAllocLocIdxkey = _sloAllocL.createIndex(
						MAM_SLO_ALLOC_R.$to_lg_grp_cd, 
						MAM_SLO_ALLOC_R.$itm_ship_grp_cd,
						MAM_SLO_ALLOC_R.$wg_cd,
						MAM_SLO_ALLOC_R.$lg_grp_cd,
						MAM_SLO_ALLOC_R.$alloc_grp_cd,
						MAM_SLO_ALLOC_R.$def_flg);
			}
			
			String toLgGrpCd = MAC_VIA_DLV_TYP.isVIA(sloRecvIfR.via_dlv_typ()) ? sloRecvIfR.tdlv_lg_grp_cd() : sloRecvIfR.dlv_lg_grp_cd();
			
			Comparable<?>[] vals = new Comparable[]{toLgGrpCd, sloRecvIfR.itm_ship_grp_cd(), sloRecvIfR.dpt_wg_cd(), null, null, true};
			
			MCList<MAM_SLO_ALLOC_R> subsloAllocL = _sloAllocL.subList(_sloAllocLocIdxkey, vals);
			
			if (subsloAllocL.isEmpty()) {
				vals[0] = MAC_STR.NULL_VAL.value();
				vals[1] = sloRecvIfR.itm_ship_grp_cd();
				subsloAllocL = _sloAllocL.subList(_sloAllocLocIdxkey, vals);
			}
			
			if (subsloAllocL.isEmpty()) {
				vals[0] = toLgGrpCd;
				vals[1] = MAC_STR.NULL_VAL.value();
				subsloAllocL = _sloAllocL.subList(_sloAllocLocIdxkey, vals);
			}
			
			if (subsloAllocL.isEmpty()) {
				vals[0] = MAC_STR.NULL_VAL.value();
				vals[1] = MAC_STR.NULL_VAL.value();
				subsloAllocL = _sloAllocL.subList(_sloAllocLocIdxkey, vals);
			}
			
			if (!subsloAllocL.isEmpty()) {
				
				return subsloAllocL.get(0);
			}
			
			return null;
		}
		
		/**
		 * 出荷元物流グループを取得する。
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @return 出荷元物流グループ
		 */
		protected String getFrLgGrpCd(SloRecvIf_Chk01_DtlR sloRecvIfR) {
			
			String frLgGrpCd = null;
			
			if (!isNull(sloRecvIfR.ship_wh_cd())) {
				frLgGrpCd = sloRecvIfR.ship_wh_cd();
			}
			else {
				MAM_SLO_ALLOC_R sloAllocR = getSloAlloc(sloRecvIfR);
				if (!isNull(sloAllocR)) {
					frLgGrpCd = nvl(sloAllocR.lg_grp_cd(), sloAllocR.getString("loc_lg_grp_cd"));
				}
			}
			return frLgGrpCd;
		}
		
		/**
		 * 引数で指定された受注受信ＩＦに紐付く受注引当マスタを返す。
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @return 受注引当マスタ
		 */
		protected MAM_SLO_ALLOC_R getSloAlloc(SloRecvIf_Chk01_DtlR sloRecvIfR) {
			
			if (isNull(_sloAllocL)) {
				
				getSloAlloc();
				
				_sloAllocIdxkey = _sloAllocL.createIndex(
						MAM_SLO_ALLOC_R.$to_lg_grp_cd, 
						MAM_SLO_ALLOC_R.$itm_ship_grp_cd,
						MAM_SLO_ALLOC_R.$wg_cd,
						MAM_SLO_ALLOC_R.$def_flg);
			}
			
			String toLgGrpCd = sloRecvIfR.dlv_lg_grp_cd();
			if (MAC_VIA_DLV_TYP.isVIA(sloRecvIfR.via_dlv_typ()) && !isNull(sloRecvIfR.tdlv_cd())) {
				toLgGrpCd = sloRecvIfR.tdlv_lg_grp_cd();
			}
			
			Comparable<?>[] vals = new Comparable[]{toLgGrpCd, sloRecvIfR.itm_ship_grp_cd(), sloRecvIfR.dpt_wg_cd(), true};
			
			MCList<MAM_SLO_ALLOC_R> subsloAllocL = _sloAllocL.subList(_sloAllocIdxkey, vals);
			
			if (subsloAllocL.isEmpty()) {
				vals[0] = MAC_STR.NULL_VAL.value();
				vals[1] = sloRecvIfR.itm_ship_grp_cd();
				subsloAllocL = _sloAllocL.subList(_sloAllocIdxkey, vals);
			}
			
			if (subsloAllocL.isEmpty()) {
				vals[0] = toLgGrpCd;
				vals[1] = MAC_STR.NULL_VAL.value();
				subsloAllocL = _sloAllocL.subList(_sloAllocIdxkey, vals);
			}
			
			if (subsloAllocL.isEmpty()) {
				vals[0] = MAC_STR.NULL_VAL.value();
				vals[1] = MAC_STR.NULL_VAL.value();
				subsloAllocL = _sloAllocL.subList(_sloAllocIdxkey, vals);
			}
			
			if (!subsloAllocL.isEmpty()) {
				
			    return subsloAllocL.get(0);
			}
			
			return null;
		}
		
		/**
		 * マスタから取引通貨単価を算出する。
		 * @param sloRecvIfL 受注受信ＩＦリスト
		 */
		protected void setMstTrdCurUpri(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {

			MABSL_SlsUpriService.SlsUpri_Sprt01 ope = MABSL_SlsUpriService.crtSlsUpri_Sprt01();
			MCList<SlsUpri_Sprt01_DtlR> slsUpriSprt01up0L = MCList.create(SlsUpri_Sprt01_DtlR.class);
			
			setGrpNo(sloRecvIfL);
			setAll(slsUpriSprt01up0L, sloRecvIfL.subList(r -> 
								!isDel(r) 
							 && !r.abort_flg() 
							 && (isCrt(r) || (isUpd(r) && !isTrnst(getSloD(r.slo_d_no())))) 
							 && !r.vmi_flg()
							 && !isNull(r.dpt_wg_cd()) 
							 && !isNull(r.trd_unit_cd()) 
							 && !isNull(r.trd_cur_cd())
							 && (!r.upri_not_chk_flg() || (r.cst_iv_flg() && r.trd_cur_upri().isZero()))), createMap_SlsUpri_Sprt01_DtlR_SloRecvIf_Chk01_DtlR());
			for (SlsUpri_Sprt01_DtlR dtlR : slsUpriSprt01up0L) {
				if (isNull(dtlR.dt())) {
					continue;
				}
				ope.up0().add(dtlR);
			}
			if (ope.up0().isEmpty()) {
				return;
			}
			ope.exec();

			copyByPegNo(up0(), new String[] {
					SloRecvIf_Chk01_DtlR.$mst_trd_cur_upri, SloRecvIf_Chk01_DtlR.$mst_interim_flg}, 
					ope.down0(), 
					new String[] {SlsUpri_Sprt01_DtlR.$sls_upri, SlsUpri_Sprt01_DtlR.$interim_flg});
		}
		
		protected void setGrpNo(MCList<SloRecvIf_Chk01_DtlR> ifL) {
			ifL.addStringColumn("grp_no");
			int grpNo = 0;
			for (MCList<SloRecvIf_Chk01_DtlR> ifGrL : ifL.groupList(getGrpKey())) {
				ifGrL.setStringNE("grp_no", Integer.toString(grpNo++));
			}
		}
		
		/**
		 * 品目と得意先を元に税ＣＤを算出する。
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @return 税ＣＤ
		 */
		protected String getDefSlsTax(SloRecvIf_Chk01_DtlR sloRecvIfR){
			
			String taxCd = null;
			
			SloRecvIf_Chk01_DtlR slsTaxR = _slsTax.getFirst(_slsTaxIdx, sloRecvIfR.toArray(_slsTaxIdx.getKeys()));
			if (!isNull(slsTaxR)) {
				taxCd = slsTaxR.tax_cd();
			}
			
			return taxCd;
		}
		protected void getSlsTax(MCList<SloRecvIf_Chk01_DtlR> taxL) {
			String[] key = new String[]{
					SloRecvIf_Chk01_DtlR.$itm_cd,
					SloRecvIf_Chk01_DtlR.$itm_sub1,
					SloRecvIf_Chk01_DtlR.$itm_sub2,
					SloRecvIf_Chk01_DtlR.$itm_sub3,
					SloRecvIf_Chk01_DtlR.$cst_cd,
					"baseDt"};

			taxL.addDateColumn("baseDt");
			for (SloRecvIf_Chk01_DtlR taxR : taxL) {
				taxR.setDate("baseDt", getBaseDt(taxR));
			}

			_slsTax = MCList.create(SloRecvIf_Chk01_DtlR.class);
			MCList<SloRecvIf_Chk01_DtlR> grpL = taxL.groupBy(key);
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_TAX$F_GET_SLS_TAX_CD", "01"),
					MABCFunction.getFunctionExecuter("MAPA_TAX$F_GET_SLS_TAX_CD"),
					SloRecvIf_Chk01_DtlR.$tax_cd, grpL, key);
			_slsTax.addAll(grpL);
			_slsTaxIdx = _slsTax.createIndex(key);
		}

		protected MCDate getBaseDt(SloRecvIf_Chk01_DtlR sloRecvIfR) {
			MCDate baseDt = null;
			
			if (MAC_SLS_BASIS_TYP.isSHIP_BASIS(sloRecvIfR.sls_basis_typ())) {
				baseDt = nvl(sloRecvIfR.sls_schd_dt(), nvl(sloRecvIfR.ship_rqst_tm(), sloRecvIfR.slo_dt()));
			}
			else if(MAC_SLS_BASIS_TYP.isIN_BASIS(sloRecvIfR.sls_basis_typ()) || MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(sloRecvIfR.sls_basis_typ())) {
				baseDt = nvl(sloRecvIfR.sls_schd_dt(), nvl(sloRecvIfR.dlv_rqst_tm(), sloRecvIfR.slo_dt()));
			}
			return baseDt;
		}
		
		/**
		 * 源泉税率を取得する。
		 * @param itmCd　品目ＣＤ
		 * @param itmSub1 枝番１
		 * @param itmSub2 枝番２
		 * @param itmSub3 枝番３
		 * @param sloDt 受注日
		 * @return 源泉税率
		 */
		protected MCNumber getWtaxRate(String itmCd, String itmSub1, String itmSub2, String itmSub3, MCDate sloDt){
			
			MCNumber wtaxRate = null;
			
			MCRow wtaxRateR = _wtaxRate.getFirst(_wtaxRateIdx, itmCd, itmSub1, itmSub2, itmSub3, sloDt);
			if (!isNull(wtaxRateR)) {
				wtaxRate = wtaxRateR.getNumber("wtaxRate");
			}
			
			return wtaxRate;
		}

		protected void getWtaxRateSloD(MCList<MST_SLO_R> sloL, MCIndexKey sloIdx, MCList<MST_SLO_D_R> sloDL) {
			sloDL.addDateColumn(MST_SLO_R.$slo_dt);
			for (MCList<MST_SLO_D_R> grpL : sloDL.groupList(MST_SLO_D_R.$slo_no)) {
				MST_SLO_R sloR = sloL.getFirst(sloIdx, grpL.get(0).slo_no());
				grpL.setDate(MST_SLO_R.$slo_dt, sloR.slo_dt());
			}
			getWtaxRateSub(sloDL);
		}
		protected void getWtaxRateSub(MCList<?> wtaxL) {
			String[] key = new String[]{
					"itm_cd",
					"itm_sub1",
					"itm_sub2",
					"itm_sub3",
					"slo_dt"};
			if (isNull(_wtaxRate)) {
				_wtaxRate = MCList.create(MCRow.class);
			}
			MCList<?> grpL = wtaxL.groupBy(key);
			grpL.addNumberColumn("wtaxRate");
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_TAX$F_GET_WTAX_RATE", "01"),
					MABCFunction.getFunctionExecuter("MAPA_TAX$F_GET_WTAX_RATE"),
					"wtaxRate", grpL, key);
			_wtaxRate.addAll(grpL);
			_wtaxRateIdx = _wtaxRate.createIndex(key);
		}
		
		/**
		 * デフォルト取引ＣＤを取得する。
		 * @return デフォルト取引ＣＤ
		 */
		protected String getDefaultTrd() {
			
			return MAUCL_TrdUtil.getDefaultTrdCd(MAC_TRD_PTN_TYP.SLS.value());
		}
		
		/**
		 * 税マスタを取得する。
		 * @param taxCd 税ＣＤ
		 * @return 税マスタ
		 */
		protected MAM_TAX_R getTax(String taxCd) {
			if (_taxCache == null) {
				_taxCache = new FXUCL_MCDbcCache<MAM_TAX_R>(MCQueryApiBuilder.create(MAM_TAX_R.create("T")));
			}
				
			return _taxCache.get(taxCd);
		}
		
		/**
		 * 品目単位マスタを取得する。
		 * @param taxCd 税ＣＤ
		 * @return 品目単位マスタ
		 */
		protected MAVM_ITM_UNIT_R getItmUnit(String itmCd, String itmSub1, String itmSub2, String itmSub3, String unitCd) {
			if (_itmUnitCache == null) {
				_itmUnitCache = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T")));
			}
				
			return _itmUnitCache.get(itmCd, itmSub1, itmSub2, itmSub3, unitCd);
		}
		
		/**
		 * ＩＦデータの税率、税区分から売上税ＣＤを取得する。
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @return 税ＣＤ
		 */
		protected String getSlsTaxCdByIf(SloRecvIf_Chk01_DtlR sloRecvIfR) {
			
			return getSlsTaxCd(sloRecvIfR);
		}
		
		/**
		 * 後続処理が実行済みの明細が存在するかどうか。
		 * @param sloDL 受注明細リスト
		 * @return 後続処理が実行済みの明細が存在する場合はtrue
		 */
		protected boolean hasTrnst(MCList<MST_SLO_D_R> sloDL) {
			
			for (MST_SLO_D_R sloDR : sloDL) {
				
				if (isTrnst(sloDR)) {
					return true;
				}
			}
			
			return false;
		}
		
		/**
		 * 後続処理が実行済みかどうか。<br>
		 * 指図数量 > 0 OR 出荷数量 > 0 OR 売上数量 > 0 OR Ｉ／Ｖ出荷予定数量 > 0 OR Ｉ／Ｖ出荷実績数量 > 0
		 * @param sloDR 受注明細
		 * @return 後続処理が実行済みの場合はtrue
		 */
		protected boolean isTrnst(MST_SLO_D_R sloDR) {
			
			return (!isNull(sloDR.getNumberNE(MST_SHIP_PR_R.$ship_inst_qty)) && sloDR.getNumberNE(MST_SHIP_PR_R.$ship_inst_qty).gt(0))
					|| (!isNull(sloDR.getNumberNE(MST_SHIP_PR_R.$ship_act_qty)) && sloDR.getNumberNE(MST_SHIP_PR_R.$ship_act_qty).gt(0))
					|| (!isNull(sloDR.getNumberNE(MST_SHIP_PR_R.$sls_qty)) && sloDR.getNumberNE(MST_SHIP_PR_R.$sls_qty).gt(0))
					|| (!isNull(sloDR.getNumberNE(MST_SHIP_PR_R.$iv_schd_qty)) && sloDR.getNumberNE(MST_SHIP_PR_R.$iv_schd_qty).gt(0))
					|| (!isNull(sloDR.getNumberNE(MST_SHIP_PR_R.$iv_act_qty)) && sloDR.getNumberNE(MST_SHIP_PR_R.$iv_act_qty).gt(0));
		}
		
		/**
		 * 品揃区分を設定する。
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @param sloR 受注明細
		 */
		protected void setAssortTyp(SloRecvIf_Chk01_DtlR sloRecvIfR, MST_SLO_R sloR) {
			
			if (isUpd(sloRecvIfR)) {
				
				sloRecvIfR.assort_typ(sloR.assort_typ());
			}
			else {
				
				sloRecvIfR.assort_typ(MSC_SHIP_ASSORT_TYP.NON.value());
			}
		}
		
		/**
		 * 為替に関連する項目を設定する。
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @param sloR 受注明細
		 */
		protected void setXrate(SloRecvIf_Chk01_DtlR sloRecvIfR, MST_SLO_R sloR) {
			
			if (isUpd(sloRecvIfR) && !isNull(sloR) && isSame(sloRecvIfR.trd_cur_cd(), sloR.trd_cur_cd())) {
					
				sloRecvIfR.xrate_inpt_flg(sloR.xrate_inpt_flg());
				sloRecvIfR.xrate(sloR.xrate());
				sloRecvIfR.ptax_xrate_inpt_flg(sloR.ptax_xrate_inpt_flg());
				sloRecvIfR.ptax_xrate(sloR.ptax_xrate());
			}
			else {
				
				sloRecvIfR.xrate_inpt_flg(false);
				sloRecvIfR.xrate(MAUCL_AmtUtil.getDefXrateNE(sloRecvIfR.trd_cur_cd(), getCo().base_cur_cd(), getCo().sls_xrate_cd(), sloRecvIfR.slo_dt()));
				sloRecvIfR.ptax_xrate_inpt_flg(false);
				sloRecvIfR.ptax_xrate(MAUCL_AmtUtil.getDefXrateNE(sloRecvIfR.trd_cur_cd(), getCo().ptax_cur_cd(), getCo().sls_xrate_cd(), sloRecvIfR.slo_dt()));
			}
		}
		
		/**
		 * 前受金に関連する項目を設定する。
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @param sloR 受注明細
		 */
		protected void setAdv(SloRecvIf_Chk01_DtlR sloRecvIfR, MST_SLO_R sloR) {
			
			if (isUpd(sloRecvIfR) && !isNull(sloR)) {
					
				sloRecvIfR.adv_ship_ctrl_typ(sloR.adv_ship_ctrl_typ());
				sloRecvIfR.adv_bill_amt(sloR.adv_bill_amt());
			}
			else {
				
				sloRecvIfR.adv_ship_ctrl_typ(MSC_ADV_SHIP_CTRL_TYP.SHIP_ABL.value());
			}
		}
		
		/**
		 * 債権部門を設定する。
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @param sloR 受注明細
		 */
		protected void setArDpt(SloRecvIf_Chk01_DtlR sloRecvIfR, MST_SLO_R sloR) {
			
			if (isUpd(sloRecvIfR) 
					&& !isNull(sloR) 
					&& (MAC_AR_DPT_TYP.isAR(sloRecvIfR.ar_dpt_typ()) 
							|| (MAC_AR_DPT_TYP.isSLS(sloRecvIfR.ar_dpt_typ()) && isSame(sloRecvIfR.sls_dpt_cd(), sloR.sls_dpt_cd())))) {
				
				sloRecvIfR.ar_dpt_cd(sloR.ar_dpt_cd());
			}
			
			else {
				if (MAC_AR_DPT_TYP.isAR(sloRecvIfR.ar_dpt_typ())) {
					sloRecvIfR.ar_dpt_cd(sloRecvIfR.cst_ar_dpt_cd());
				}
				else if (MAC_AR_DPT_TYP.isSLS(sloRecvIfR.ar_dpt_typ())) {
					sloRecvIfR.ar_dpt_cd(sloRecvIfR.sls_dpt_cd());
				}
			}
		}
		
		/**
		 * 取引備考を設定する。
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @param sloR 受注ヘッダ
		 */
		protected void setTrdRmrks(SloRecvIf_Chk01_DtlR sloRecvIfR, MST_SLO_R sloR) {
			
			if (isUpd(sloRecvIfR) 
					&& !isNull(sloR) 
					&& isNull(sloRecvIfR.trd_rmrks())) {
				
				sloRecvIfR.trd_rmrks(sloR.trd_rmrks());
			}
		}
		
		protected void setTtermCd(SloRecvIf_Chk01_DtlR sloRecvIfR, MST_SLO_R sloR) {
			
			if (isCrt(sloRecvIfR) && isNull(sloRecvIfR.tterm_cd1())) {
				sloRecvIfR.tterm_cd1(sloRecvIfR.cst_tterm_cd1());
			}
			else if (isUpd(sloRecvIfR) && !isNull(sloR) && isNull(sloRecvIfR.tterm_cd1())) {
				sloRecvIfR.tterm_cd1(sloR.tterm_cd1());
			}
			
			if (isCrt(sloRecvIfR) && isNull(sloRecvIfR.tterm_cd2())) {
				sloRecvIfR.tterm_cd2(sloRecvIfR.cst_tterm_cd2());
			}
			else if(isUpd(sloRecvIfR) && !isNull(sloR) && isNull(sloRecvIfR.tterm_cd2())) {
				sloRecvIfR.tterm_cd2(sloR.tterm_cd2());
			}
			
			if (isCrt(sloRecvIfR) && isNull(sloRecvIfR.tterm_cd3())) {
				sloRecvIfR.tterm_cd3(sloRecvIfR.cst_tterm_cd3());
			}
			else if(isUpd(sloRecvIfR) && !isNull(sloR) && isNull(sloRecvIfR.tterm_cd3())) {
				sloRecvIfR.tterm_cd3(sloR.tterm_cd3());
			}
		}
		
		/**
		 * 品名を設定する。
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @param sloDR 受注明細
		 */
		protected void setItmNm(SloRecvIf_Chk01_DtlR sloRecvIfR, MST_SLO_D_R sloDR) {
			
			if (!sloRecvIfR.sundry_itm_flg()) {
				
				sloRecvIfR.itm_nm(null);
			}
		}
		
		/**
		 * Ｉ／Ｖ表記品名を設定する。
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @param sloDR 受注明細
		 */
		protected void setIvItmNm(SloRecvIf_Chk01_DtlR sloRecvIfR, MST_SLO_D_R sloDR) {
			
			if (sloRecvIfR.cst_iv_flg())  {
				
				if (sloRecvIfR.sundry_itm_flg()) {
					sloRecvIfR.iv_itm_nm(sloRecvIfR.itm_nm());
				}
			}
		}
		
		/**
		 * 単価再取得対象外を設定する。
		 * @param sloRecvIfR 受注受信ＩＦ
		 */
		protected void setUpriNotTgtFlg(SloRecvIf_Chk01_DtlR sloRecvIfR) {
			
			if (sloRecvIfR.vmi_flg()) {
				return;
			}
			
			sloRecvIfR.upri_not_tgt_flg(sloRecvIfR.upri_not_chk_flg());
		}
		
		/**
		 * 原価単価を設定する。
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @param sloDR 受注明細
		 * @param sloR 受注ヘッダ
		 */
		protected void setCostUpri(SloRecvIf_Chk01_DtlR sloRecvIfR, MST_SLO_D_R sloDR, MST_SLO_R sloR) {
			
			if (sloRecvIfR.vmi_flg()) {
				return;
			}
			
			if (isUpd(sloRecvIfR) 
					&& !isNull(sloDR) && isSameItm(sloRecvIfR, sloDR) && isSame(sloRecvIfR.dpt_wg_cd(), sloR.wg_cd())) {
				
				sloRecvIfR.cost_upri(sloDR.cost_upri());
			}
			else {
				sloRecvIfR.cost_upri(MAUCL_StdUpriUtil.getStdCost(
						sloRecvIfR.itm_cd(), 
						sloRecvIfR.itm_sub1(), 
						sloRecvIfR.itm_sub2(), 
						sloRecvIfR.itm_sub3(), 
						sloRecvIfR.slo_dt(), 
						sloRecvIfR.dpt_wg_cd(), 
						getCo().gm_std_upri_typ()));
			}
		}
		
		/**
		 * 源泉税率を設定する。
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @param sloDR 受注明細
		 * @param sloR 受注ヘッダ
		 */
		protected void setWtaxRate(SloRecvIf_Chk01_DtlR sloRecvIfR, MST_SLO_D_R sloDR, MST_SLO_R sloR) {
			
			if (sloRecvIfR.vmi_flg()) {
				return;
			}
	
			if (isUpd(sloRecvIfR) 
					&& !isNull(sloDR) 
					&& !isNull(sloDR.wtax_rate())
					&& isSameItm(sloRecvIfR, sloDR) 
					&& isSame(sloRecvIfR.trd_cur_cd(), sloR.trd_cur_cd())) {
				sloRecvIfR.wtax_rate(sloDR.wtax_rate());
			}
			else {
				if (isSame(sloRecvIfR.trd_cur_cd(), getCo().base_cur_cd()) 
						&& (isSame(sloRecvIfR.trd_cur_cd(), getCo().ptax_cur_cd()) || isNull(getCo().ptax_cur_cd()))) {
					// 取引通貨＝基準通貨＝納税通貨、または「取引通貨＝基準通貨かつ納税通貨が未設定の場合のみ設定する
					sloRecvIfR.wtax_rate(getWtaxRate(sloRecvIfR.itm_cd(), sloRecvIfR.itm_sub1(), sloRecvIfR.itm_sub2(),
							sloRecvIfR.itm_sub3(), sloRecvIfR.slo_dt()));
				}
			}
		}
		
		/**
		 * 請求繰越回数を設定する。
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @param sloDR 受注明細
		 */
		protected void setBillCrryovrTimes(SloRecvIf_Chk01_DtlR sloRecvIfR, MST_SLO_D_R sloDR) {

			if (sloRecvIfR.vmi_flg()) {
				return;
			}
	
			if (isUpd(sloRecvIfR) && !isNull(sloDR) && isSameItm(sloRecvIfR, sloDR) && !isNull(sloDR.bill_crryovr_times())) {
				sloRecvIfR.bill_crryovr_times(sloDR.bill_crryovr_times());
			}
			else {
				sloRecvIfR.bill_crryovr_times(nvl(sloRecvIfR.itm_bill_crryovr_times(), sloRecvIfR.cst_bill_crryovr_times()));
			}
		}
		
		/**
		 * 手配ＮＯに関連する項目を設定する。
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @param sloDR 受注明細
		 */
		protected void setSloSno(SloRecvIf_Chk01_DtlR sloRecvIfR, MST_SLO_D_R sloDR) {
	
			if (MAC_SNO_NO_TYP.isAUTO(sloRecvIfR.sno1_num_typ()) || isNull(sloRecvIfR.sno1_num_typ())) {
				sloRecvIfR.sno1(null);
			}
			if (MAC_SNO_NO_TYP.isAUTO(sloRecvIfR.sno2_num_typ()) || isNull(sloRecvIfR.sno2_num_typ())) {
				sloRecvIfR.sno2(null);
			}
			if (MAC_SNO_NO_TYP.isAUTO(sloRecvIfR.sno3_num_typ()) || isNull(sloRecvIfR.sno3_num_typ())) {
				sloRecvIfR.sno3(null);
			}
			if (MAC_SNO_NO_TYP.isAUTO(sloRecvIfR.sno4_num_typ()) || isNull(sloRecvIfR.sno4_num_typ())) {
				sloRecvIfR.sno4(null);
			}
			
			setSnoNumFlg(sloRecvIfR, sloDR);
			
			if (isUpd(sloRecvIfR) && !isNull(sloDR) && isSameItm(sloRecvIfR, sloDR)) {

				sloRecvIfR.sno1_null_flg(sloDR.sno1_null_flg());
				sloRecvIfR.sno2_null_flg(sloDR.sno2_null_flg());
				sloRecvIfR.sno3_null_flg(sloDR.sno3_null_flg());
				sloRecvIfR.sno4_null_flg(sloDR.sno4_null_flg());
				
				boolean isNotSnoPrior = isSame(getSysParm("SLO_IF_SNO_PRIOR_FLG"),"1");
				if (isNull(sloRecvIfR.sno1()) && !isSnoNum(sloRecvIfR.sno1_num_typ(), sloRecvIfR.sno1(), sloDR.sno1(), sloRecvIfR.slo_sno1_flg(), false)) {
					if ((isNotSnoPrior && sloRecvIfR.slo_sno1_flg() && MAC_SNO_NO_TYP.isAUTO(sloRecvIfR.sno1_num_typ())) 
							|| !isNotSnoPrior) {
						sloRecvIfR.sno1(sloDR.sno1());
					}
				}
				if (isNull(sloRecvIfR.sno2()) && !isSnoNum(sloRecvIfR.sno2_num_typ(), sloRecvIfR.sno2(), sloDR.sno2(), sloRecvIfR.slo_sno2_flg(), false)) {
					if ((isNotSnoPrior && sloRecvIfR.slo_sno2_flg() && MAC_SNO_NO_TYP.isAUTO(sloRecvIfR.sno2_num_typ())) 
							|| !isNotSnoPrior) {
						sloRecvIfR.sno2(sloDR.sno2());
					}
				}
				if (isNull(sloRecvIfR.sno3()) && !isSnoNum(sloRecvIfR.sno3_num_typ(), sloRecvIfR.sno3(), sloDR.sno3(), sloRecvIfR.slo_sno3_flg(), false)) {
					if ((isNotSnoPrior && sloRecvIfR.slo_sno3_flg() && MAC_SNO_NO_TYP.isAUTO(sloRecvIfR.sno3_num_typ())) 
							|| !isNotSnoPrior) {
						sloRecvIfR.sno3(sloDR.sno3());
					}
				}
				if (isNull(sloRecvIfR.sno4()) && !isSnoNum(sloRecvIfR.sno4_num_typ(), sloRecvIfR.sno4(), sloDR.sno4(), sloRecvIfR.slo_sno4_flg(), false)) {
					if ((isNotSnoPrior && sloRecvIfR.slo_sno4_flg() && MAC_SNO_NO_TYP.isAUTO(sloRecvIfR.sno4_num_typ())) 
							|| !isNotSnoPrior) {
						sloRecvIfR.sno4(sloDR.sno4());
					}
				}
			}
		}
		
		/**
		 * 手配ＮＯ発番を設定する。
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @param sloDR 受注明細
		 */
		protected void setSnoNumFlg(SloRecvIf_Chk01_DtlR sloRecvIfR, MST_SLO_D_R sloDR) {
			
			sloRecvIfR.sno_num_flg(false);
			if (isCrt(sloRecvIfR)) {
				if (isSnoNum(sloRecvIfR.sno1_num_typ(), sloRecvIfR.sno1(), null, sloRecvIfR.slo_sno1_flg(), true) 
						|| isSnoNum(sloRecvIfR.sno2_num_typ(), sloRecvIfR.sno2(), null, sloRecvIfR.slo_sno2_flg(), true) 
						|| isSnoNum(sloRecvIfR.sno3_num_typ(), sloRecvIfR.sno3(), null, sloRecvIfR.slo_sno3_flg(), true) 
						|| isSnoNum(sloRecvIfR.sno4_num_typ(), sloRecvIfR.sno4(), null, sloRecvIfR.slo_sno4_flg(), true)) {
					sloRecvIfR.sno_num_flg(true);
				}
			}
			else if (isUpd(sloRecvIfR)) {
				if (!isSameItm(sloRecvIfR, sloDR)) {
					if (isSnoNum(sloRecvIfR.sno1_num_typ(), sloRecvIfR.sno1(), sloDR.sno1(), sloRecvIfR.slo_sno1_flg(), true) 
							|| isSnoNum(sloRecvIfR.sno2_num_typ(), sloRecvIfR.sno2(), sloDR.sno2(), sloRecvIfR.slo_sno2_flg(), true) 
							|| isSnoNum(sloRecvIfR.sno3_num_typ(), sloRecvIfR.sno3(), sloDR.sno3(), sloRecvIfR.slo_sno3_flg(), true) 
							|| isSnoNum(sloRecvIfR.sno4_num_typ(), sloRecvIfR.sno4(), sloDR.sno4(), sloRecvIfR.slo_sno4_flg(), true)) {
						sloRecvIfR.sno_num_flg(true);
					}
				}
				else {
					if (isSnoNumNotSnoPrior(sloRecvIfR.sno1_num_typ(), sloRecvIfR.sno1(), sloDR.sno1(), sloRecvIfR.slo_sno1_flg()) 
							|| isSnoNumNotSnoPrior(sloRecvIfR.sno2_num_typ(), sloRecvIfR.sno2(), sloDR.sno2(), sloRecvIfR.slo_sno2_flg()) 
							|| isSnoNumNotSnoPrior(sloRecvIfR.sno3_num_typ(), sloRecvIfR.sno3(), sloDR.sno3(), sloRecvIfR.slo_sno3_flg()) 
							|| isSnoNumNotSnoPrior(sloRecvIfR.sno4_num_typ(), sloRecvIfR.sno4(), sloDR.sno4(), sloRecvIfR.slo_sno4_flg())) {
						sloRecvIfR.sno_num_flg(true);
					}
				}
			}
		}
		
		protected boolean isAuto(String snoNumTyp, String sno, String sloSno) {
			return MAC_SNO_NO_TYP.isAUTO(snoNumTyp) && isNullOrNullVal(sno) && isNullOrNullVal(sloSno);
		}
		protected boolean isAutoManu(String snoNumTyp, String sno, String sloSno) {
			return MAC_SNO_NO_TYP.isAUTO_MANU(snoNumTyp) && isNullOrNullVal(sno) && isNullOrNullVal(sloSno);
		}
		protected boolean isAutoManuNotSnoPrior(String snoNumTyp, String sno) {
			return MAC_SNO_NO_TYP.isAUTO_MANU(snoNumTyp) && isNullOrNullVal(sno);
		}
		protected boolean isSnoNum(String snoNumTyp, String sno, String sloSno, boolean sloSnoFlg, boolean snoNumFlg) {
			if(snoNumFlg) {
				return sloSnoFlg && (MAC_SNO_NO_TYP.isAUTO(snoNumTyp) || isAutoManuNotSnoPrior(snoNumTyp, sno));
			}
			else {
				return sloSnoFlg && (isAuto(snoNumTyp, sno, sloSno) || isAutoManu(snoNumTyp, sno, sloSno));
			}
		}
		protected boolean isSnoNumNotSnoPrior(String snoNumTyp, String sno, String sloSno, boolean sloSnoFlg) {
			boolean isNotSnoPrior = isSame(getSysParm("SLO_IF_SNO_PRIOR_FLG"), "1");
			return (sloSnoFlg && isAutoManuNotSnoPrior(snoNumTyp, sno) && isNotSnoPrior) || isSnoNum(snoNumTyp, sno, sloSno, sloSnoFlg, false);
		}
		
		/**
		 * 納品先に関連する項目を設定する。
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @param sloDR 受注明細
		 */
		protected void setDlv(SloRecvIf_Chk01_DtlR sloRecvIfR, MST_SLO_D_R sloDR) {
			
			if (!sloRecvIfR.dlv_sundry_flg()) {
				
				if (isUpd(sloRecvIfR) && !isNull(sloDR) && isSame(sloRecvIfR.dlv_cd(), sloDR.dlv_cd())) {
							
					sloRecvIfR.dlv_nm(sloDR.dlv_nm());
					sloRecvIfR.dlv_cntct_dpt(sloDR.dlv_cntct_dpt());
					sloRecvIfR.dlv_cntct_psn(sloDR.dlv_cntct_psn());
					sloRecvIfR.dlv_zip_cd(sloDR.dlv_zip_cd());
					sloRecvIfR.dlv_addr1(sloDR.dlv_addr1());
					sloRecvIfR.dlv_addr2(sloDR.dlv_addr2());
					sloRecvIfR.dlv_addr3(sloDR.dlv_addr3());
					sloRecvIfR.dlv_addr4(sloDR.dlv_addr4());
					sloRecvIfR.dlv_tel(sloDR.dlv_tel());
					sloRecvIfR.dlv_fax(sloDR.dlv_fax());
				}
				else {
					
					sloRecvIfR.dlv_nm(sloRecvIfR.mst_dlv_nm());
					sloRecvIfR.dlv_cntct_dpt(sloRecvIfR.mst_dlv_cntct_dpt());
					sloRecvIfR.dlv_cntct_psn(sloRecvIfR.mst_dlv_cntct_psn());
					sloRecvIfR.dlv_zip_cd(sloRecvIfR.mst_dlv_zip_cd());
					sloRecvIfR.dlv_addr1(sloRecvIfR.mst_dlv_addr1());
					sloRecvIfR.dlv_addr2(sloRecvIfR.mst_dlv_addr2());
					sloRecvIfR.dlv_addr3(sloRecvIfR.mst_dlv_addr3());
					sloRecvIfR.dlv_addr4(sloRecvIfR.mst_dlv_addr4());
					sloRecvIfR.dlv_tel(sloRecvIfR.mst_dlv_tel());
					sloRecvIfR.dlv_fax(sloRecvIfR.mst_dlv_fax());
				}
			}
		}
		
		/**
		 * 価格印字を設定する。
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @param sloDR 受注明細
		 */
		protected void setPriPrntFlg(SloRecvIf_Chk01_DtlR sloRecvIfR, MST_SLO_D_R sloDR) {
			
			if (isNull(sloRecvIfR.pri_prnt_typ())) {
				
				if (isUpd(sloRecvIfR) && !isNull(sloDR) && isSame(sloRecvIfR.dlv_cd(), sloDR.dlv_cd())) {
					sloRecvIfR.pri_prnt_flg(sloDR.pri_prnt_flg());
				}
			}
			else {
				
				if (MAC_PRI_PRNT_TYP.contains(sloRecvIfR.pri_prnt_typ())) {
					
					if (MAC_PRI_PRNT_TYP.isNOT_PRNT(sloRecvIfR.pri_prnt_typ())) {
						sloRecvIfR.pri_prnt_flg(false);
					}
					else if (MAC_PRI_PRNT_TYP.isPRNT(sloRecvIfR.pri_prnt_typ())) {
						sloRecvIfR.pri_prnt_flg(true);
					}
				}
			}
		}
		
		/**
		 * 出荷予定分割区分を設定する。
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @param sloDR 受注明細
		 */
		protected void setShipSchdSplitTyp(SloRecvIf_Chk01_DtlR sloRecvIfR, MST_SLO_D_R sloDR) {

			if (MAC_STK_MNG_TYP.isNOT_MNG(sloRecvIfR.stk_mng_typ()) 
					|| MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ()) 
					|| !isNull(sloRecvIfR.set_itm_grp_no())) {
				
				sloRecvIfR.ship_schd_split_typ(MAC_SHIP_SCHD_SPLIT_TYP.NON.value());
			}
			else {
				
				if (isUpd(sloRecvIfR) && !isNull(sloDR) && isSameItm(sloRecvIfR, sloDR)) {
					sloRecvIfR.ship_schd_split_typ(sloDR.ship_schd_split_typ());
				}
				else if (isNull(sloRecvIfR.ship_schd_split_typ())) {
					sloRecvIfR.ship_schd_split_typ(getCo().ship_schd_split_typ());
				}
			}
		}
		
		/**
		 * 引当区分を設定する。
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @param sloDR 受注明細
		 */
		protected void setAllocTyp(SloRecvIf_Chk01_DtlR sloRecvIfR, MST_SLO_D_R sloDR) {

			if (MAC_SLO_PROC_TYP.isPROC(sloRecvIfR.proc_typ()) || MAC_SLO_PROC_TYP.isALLOC_PROC(sloRecvIfR.proc_typ())) {
				sloRecvIfR.alloc_typ(MAC_ALLOC_TYP.IMMED.value());
			}
			else {
				
				if (isUpd(sloRecvIfR) 
						&& !isNull(sloDR)
						&& isSameItm(sloRecvIfR, sloDR) 
						&& !MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ())) {
					
					sloRecvIfR.alloc_typ(sloDR.alloc_typ());
				}
			}
		}
		
		/**
		 * 出荷条件ＣＤを設定する。
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @param sloDR 受注明細
		 */
		protected void setShipTermCd(SloRecvIf_Chk01_DtlR sloRecvIfR, MST_SLO_D_R sloDR) {

			if (MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ()) 
					|| MAC_SHIP_INST_TYP.isNO_PICK(sloRecvIfR.ship_inst_typ())) {
				
				sloRecvIfR.ship_term_cd(null);
			}
			else {
				if (isUpd(sloRecvIfR) 
						&& !isNull(sloDR) 
						&& isSameItm(sloRecvIfR, sloDR) 
						&& !isNull(sloDR.ship_term_cd())) {
					
					sloRecvIfR.ship_term_cd(sloDR.ship_term_cd());
				}
			}
		}
		
		/**
		 * 出荷留めを設定する。
		 * @param sloRecvIfR 受注受信ＩＦ
		 */
		protected void setShipBlockFlg(SloRecvIf_Chk01_DtlR sloRecvIfR) {

			if (MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ()) 
					|| MAC_SHIP_INST_TYP.isNO_PICK(sloRecvIfR.ship_inst_typ())) {
				
				sloRecvIfR.ship_block_flg(false);
			}
		}
		
		/**
		 * 日付自動計算の関連する項目を設定する。
		 * @param sloRecvIfL 受注受信ＩＦ
		 *
		 */
		protected void setDtCalc(MCList<SloRecvIf_Chk01_DtlR> sloRecvIfL) {
			
			for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloRecvIfL) {
				
				if (isDel(sloRecvIfR)) {
					continue;
				}
				
				MST_SLO_D_R sloDR = getSloD(sloRecvIfR.slo_d_no());
				
				if (isUpd(sloRecvIfR) 
						&& !isNull(sloDR) 
						&& !MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ()) 
						&& !MAC_SHIP_INST_TYP.isNO_PICK(sloRecvIfR.ship_inst_typ())
						&& isSameItm(sloRecvIfR, sloDR)) {
					
					sloRecvIfR.not_dt_calc_flg(sloDR.getBooleanNE(MST_SHIP_SCHD_R.$not_dt_calc_flg));
				}
				else {
					sloRecvIfR.not_dt_calc_flg(false);
				}
			}
		}
		
		/**
		 * サブロットNOの補完を行う。
		 * @param sloRecvIfR 受注受信ＩＦ
		 */
		protected void setSubLotNo(SloRecvIf_Chk01_DtlR sloRecvIfR) {

			if (!isNull(sloRecvIfR.lot_no()) 
					&& MAC_SUBLOT_MNG_TYP.isNOT_MNG(sloRecvIfR.sublot_mng_typ()) 
					&& isNull(sloRecvIfR.sublot_no())) {
				
				sloRecvIfR.sublot_no(MAC_STR.NULL_VAL.value());
			}
		}
		
		/**
		 * 版NOを設定する。
		 * @param sloRecvIfR 受注受信ＩＦ
		 */
		protected void setVerNo(SloRecvIf_Chk01_DtlR sloRecvIfR) {

			if (!sloRecvIfR.ver_flg()) {
				
				sloRecvIfR.ver_no(null);
			}
		}
		
		/**
		 * メーカCDを設定する。
		 * @param sloRecvIfR 受注受信ＩＦ
		 */
		protected void setMakerCd(SloRecvIf_Chk01_DtlR sloRecvIfR) {

			if (MAC_SLO_PROC_TYP.isALLOC(sloRecvIfR.proc_typ()) ) {
				
				sloRecvIfR.maker_cd(null);
			}
		}
		
		/**
		 * 着曜日を設定する。
		 * @param sloRecvIfR 受注受信ＩＦ
		 */
		protected void setDlvDayWeekTyp(SloRecvIf_Chk01_DtlR sloRecvIfR) {
			
			if (MAC_SLO_PROC_TYP.isPURC_DDLV(sloRecvIfR.proc_typ()) 
					|| MAC_SHIP_INST_TYP.isNO_PICK(sloRecvIfR.ship_inst_typ())) {
				
				sloRecvIfR.dlv_day_week_typ(null);
			}
		}
		protected void setRemAbortAbl(SloRecvIf_Chk01_DtlR sloRecvIfR, MST_SLO_D_R sloDR) {
			
			MCList<SloRecvIf_Chk01_DtlR> rsltL = MCList.create(SloRecvIf_Chk01_DtlR.class);
			rsltL.addNumberColumn("ship_pr_ship_inst_qty");
			rsltL.addNumberColumn("ship_pr_ship_act_qty");
			rsltL.addNumberColumn("ship_pr_sls_qty");
			rsltL.addNumberColumn("ship_pr_iv_schd_qty");
			rsltL.addNumberColumn("ship_pr_ship_schd_abort_qty");
			rsltL.addNumberColumn("ship_pr_sls_schd_abort_qty");
			rsltL.addNumberColumn("ship_schd_base_unit_qty");
			rsltL.addNumberColumn("ship_schd_ship_inst_qty");
			rsltL.addNumberColumn("ship_schd_ship_act_qty");
			rsltL.addNumberColumn("ship_schd_sls_qty");
			rsltL.addNumberColumn("ship_schd_iv_schd_qty");
			rsltL.addStringColumn("sls_act_d_no");
			MCMainQuery q = get_MST_SHIP_SCHD_S01_sql();
			q.executeQuery(sloDR, rsltL);
			
			MCList<SloRecvIf_Chk01_DtlR> schdL = MCList.create(SloRecvIf_Chk01_DtlR.class);
			if (rsltL.isEmpty() || isNull(sloRecvIfR.slo_d_no())) {
				return;
			}
			schdL = getRemAbortList(sloRecvIfR, rsltL);
			
			if (schdL.size() > 0) {
				sloRecvIfR.rem_abort_flg(true);
				sloRecvIfR.rem_abort_qty(schdL.sum(SloRecvIf_Chk01_DtlR.$rem_abort_qty));
			}
		}

		protected void setNotMixFlg(SloRecvIf_Chk01_DtlR sloRecvIfR, MST_SLO_D_R sloDR, MST_SLO_R sloR) {
			
			if (isUpd(sloRecvIfR) && !isNull(sloDR)) {
				sloRecvIfR.not_lg_mix_flg(sloDR.not_lg_mix_flg());
				sloRecvIfR.not_lot_mix_flg(sloDR.not_lot_mix_flg());
				sloRecvIfR.not_sublot_mix_flg(sloDR.not_sublot_mix_flg());
			}
			else {
				MAM_BP_R tgtBpR = getBp(sloRecvIfR);
				if (!isNull(tgtBpR)) {
					sloRecvIfR.not_lg_mix_flg(tgtBpR.not_lg_mix_flg());
					
					if (MAC_LOT_MNG_TYP.isNOT_MNG(sloRecvIfR.lot_mng_typ())) {
						sloRecvIfR.not_lot_mix_flg(false);
					}
					else {
						sloRecvIfR.not_lot_mix_flg(tgtBpR.not_lot_mix_flg());
					}
					
					if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(sloRecvIfR.sublot_mng_typ())) {
						sloRecvIfR.not_sublot_mix_flg(false);
					}
					else {
						sloRecvIfR.not_sublot_mix_flg(tgtBpR.not_sublot_mix_flg());
					}
				}
			}
		}

		protected MCList<SloRecvIf_Chk01_DtlR> getRemAbortList(SloRecvIf_Chk01_DtlR sloRecvIfR, MCList<SloRecvIf_Chk01_DtlR> shipSchdL) {
			
			MCList<SloRecvIf_Chk01_DtlR> schdL = MCList.create(SloRecvIf_Chk01_DtlR.class);
			
			for (SloRecvIf_Chk01_DtlR shipSchdR : shipSchdL) {
				
				if (isNotTrns(shipSchdR)) {
					continue;
				}
				if (isAbortRet(shipSchdR)) {
					continue;
				}
				
				if (isRemAbortNotEnable(shipSchdR)) {
					continue;
				}
				
				shipSchdR.rem_abort_qty(shipSchdR.getNumber("ship_schd_base_unit_qty").subtract(shipSchdR.getNumber("ship_schd_sls_qty")));
				schdL.add(shipSchdR);
			}
			
			return schdL;
		}
		
		protected boolean isNotTrns(SloRecvIf_Chk01_DtlR shipSchdR) {
			
			return isSame(shipSchdR.getNumber("ship_pr_ship_inst_qty"), MCNumber.ZERO) && isSame(shipSchdR.getNumber("ship_pr_ship_act_qty"), MCNumber.ZERO) 
					&& isSame(shipSchdR.getNumber("ship_pr_sls_qty"), MCNumber.ZERO) && isSame(shipSchdR.getNumber("ship_pr_iv_schd_qty"), MCNumber.ZERO)
					&& isSame(shipSchdR.getNumber("ship_pr_ship_schd_abort_qty"), MCNumber.ZERO) && isSame(shipSchdR.getNumber("ship_pr_sls_schd_abort_qty"), MCNumber.ZERO);

		}
		
		protected boolean isAbortRet(SloRecvIf_Chk01_DtlR shipSchdR) {
			
			return isSame(shipSchdR.getNumber("ship_pr_ship_schd_abort_qty"), shipSchdR.getNumber("ship_pr_base_unit_qty"))
					&& isSame(shipSchdR.getNumber("ship_pr_sls_schd_abort_qty"), shipSchdR.getNumber("ship_pr_base_unit_qty"));
		}
		
		protected boolean isRemAbortNotEnable(SloRecvIf_Chk01_DtlR shipSchdR) {
			
			return  (!isNull(shipSchdR.getNumber("ship_schd_ship_inst_qty")) && shipSchdR.getNumber("ship_schd_ship_inst_qty").gt(0))
					|| (!isNull(shipSchdR.getNumber("ship_schd_ship_act_qty")) && shipSchdR.getNumber("ship_schd_ship_act_qty").gt(0))
					|| (((!isNull(shipSchdR.getNumber("ship_schd_sls_qty")) && shipSchdR.getNumber("ship_schd_sls_qty").gt(0))
							|| (!isNull(shipSchdR.getNumber("ship_schd_ship_inst_qty")) && shipSchdR.getNumber("ship_schd_ship_inst_qty").gt(0)))
									&& (!isNull(shipSchdR.getNumber("ship_schd_ship_act_qty")) && shipSchdR.getNumber("ship_schd_ship_act_qty").gt(0))
									&& !isNull(shipSchdR.getString("sls_act_d_no")))
					|| (!isNull(shipSchdR.getNumber("ship_schd_iv_schd_qty")) && shipSchdR.getNumber("ship_schd_iv_schd_qty").gt(0));

		}
		
		public MCMainQuery get_MST_SHIP_SCHD_S01_sql() {
			MST_SHIP_SCHD_R S0_SHIPSCHD = MST_SHIP_SCHD_R.create("SHIPSCHD");
			MST_SHIP_PR_R S0_SHIPPR = MST_SHIP_PR_R.create("SHIPPR");
			MST_SLO_D_R S0_SLOD = MST_SLO_D_R.create("SLOD");

			MCMainQuery q = sql("MSLAL5120_MST_SHIP_SCHD_S01")
				.mainQuery()
				.select(
					S0_SHIPPR.slo_d_no,
					S0_SHIPPR.ship_inst_qty.as("ship_pr_ship_inst_qty"),
					S0_SHIPPR.ship_act_qty.as("ship_pr_ship_act_qty"),
					S0_SHIPPR.sls_qty.as("ship_pr_sls_qty"),
					S0_SHIPPR.iv_schd_qty.as("ship_pr_iv_schd_qty"),
					S0_SHIPPR.ship_schd_abort_qty.as("ship_pr_ship_schd_abort_qty"),
					S0_SHIPPR.sls_schd_abort_qty.as("ship_pr_sls_schd_abort_qty"),
					S0_SHIPPR.base_unit_qty.as("ship_pr_base_unit_qty"),
					S0_SHIPSCHD.base_unit_qty.as("ship_schd_base_unit_qty"),
					S0_SHIPSCHD.ship_inst_qty.as("ship_schd_ship_inst_qty"),
					S0_SHIPSCHD.ship_act_qty.as("ship_schd_ship_act_qty"),
					S0_SHIPSCHD.sls_qty.as("ship_schd_sls_qty"),
					S0_SHIPSCHD.sls_act_d_no,
					S0_SHIPSCHD.iv_schd_qty.as("ship_schd_iv_schd_qty")
				)
				.from(
					S0_SHIPSCHD
					.innerJoin(S0_SHIPPR).on(S0_SHIPPR.ship_pr_no.eq(S0_SHIPSCHD.ship_pr_no))
					.innerJoin(S0_SLOD).on(S0_SHIPPR.slo_d_no.eq(S0_SLOD.slo_d_no))
				)
				.where(
					value(0).eq(value(0))
					.and(S0_SHIPPR.ship_inst_typ.neq(value(MAC_SHIP_INST_TYP.NO_PICK.value())))
					.and(S0_SHIPPR.purc_ddlv_flg.eq(value(false)))
					.and(S0_SLOD.slo_d_no.eq(bind("slo_d_no")))
				);

			return q;
		}
		
		/**
		 * 貸出の場合、設定不要の項目をクリアする。
		 * @param sloRecvIfR 受注受信ＩＦ
		 */
		protected void clearVmi(SloRecvIf_Chk01_DtlR sloRecvIfR) {
			
			if (sloRecvIfR.vmi_flg()) {
				
				sloRecvIfR.trd_cur_upri(null);
				sloRecvIfR.interim_flg(false);
				sloRecvIfR.upri_not_tgt_flg(false);
				sloRecvIfR.trd_cur_dscnt_amt(null);
				sloRecvIfR.dscnt_rsn_cd(null);
				sloRecvIfR.iv_upri(null);
				sloRecvIfR.cost_upri(null);
				sloRecvIfR.tax_fix_flg(false);
				sloRecvIfR.tax_cd(null);
				sloRecvIfR.wtax_rate(null);
				sloRecvIfR.bill_crryovr_times(null);
				sloRecvIfR.sls_schd_dt(null);
				sloRecvIfR.pri_prnt_flg(false);
				sloRecvIfR.sls_rsn_cd(null);
				sloRecvIfR.sls_upri_req_typ(null);
				sloRecvIfR.sls_cststk_flg(false);
			}
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			
			down0().setAll(up0());
			
			if (up0().getFirst("err_flg",  false) != null) {
				
				setDownSloDel();
				
				setDownSloUpd();
				
				setDownSloIns();
				
				setDownSloNone();
				
				setPegNo(down1());
				
				setPegNo(down2());
				
				setPegNo(down4());
				
				resetDown2ParamRowIndex();
			}
		}
		
		protected void resetDown2ParamRowIndex() {
			if (isNull(down2()) || down2().isEmpty()) {
				return;
			}
			int paramRowIndex = down2().get(0).getParamRowIndex();
			for (Slo_Upd01_DtlR sloD : down2()) {
				if (sloD.getParamRowIndex() < paramRowIndex) {
					paramRowIndex = sloD.getParamRowIndex();
				}
			}
			paramRowIndex = paramRowIndex - 1;
			for (Slo_Upd01_DtlR sloD : down2()) {
				if (sloD.getParamIndex() == -1) {
					sloD.setParamRowIndex(paramRowIndex);
					paramRowIndex --;
				}
			}
			
		}
		
		/**
		 * ソート順を設定する。
		 */
		protected void sort() {
			
			down2().sort(SortType.ASC, Slo_Upd01_DtlR.$slo_no, Slo_Upd01_DtlR.$disp_seq);
			down2().clear(Slo_Upd01_DtlR.$disp_seq);
		}
		
		/**
		 * 受注削除用の下り電文を設定する。
		 */
		protected void setDownSloDel() {
			
			Slo_Del01_HdrR delHdrR = null;
			Slo_Del01_DtlR delDtlR = null;
			MCList<Slo_Del01_DtlR> delDtlL = null;
			MCList<SloRecvIf_Chk01_DtlR> notErrL = getNotErrL();
			
			for (MCList<MST_SLO_D_R> sloDL : _sloDL.groupList(MST_SLO_D_R.$slo_no)) {
				
				MST_SLO_R sloR = getSlo(sloDL.get(0).slo_no());
				
				int ifDelSize = 0;
				
				for (MST_SLO_D_R sloDR : sloDL) {
				
					SloRecvIf_Chk01_DtlR sloRecvIfR = getSloRecvIfR(sloDR);
					
					if (!isNull(sloRecvIfR) && isDel(sloRecvIfR)) {
						ifDelSize++;
					}
				}
				
				MCList<SloRecvIf_Chk01_DtlR> tmpL = notErrL.subList(r -> isSameChkSloHdr(r, sloR) && !isDel(r));
				if (isSame(sloDL.size(), ifDelSize) && tmpL.isEmpty()) {
					// 削除件数が受注明細の件数が一致する場合、受注を取り消すとする。
					delHdrR = Slo_Del01_HdrR.create();
					
					sloDL.sort(MST_SLO_D_R.$cst_po_d_no);
					SloRecvIf_Chk01_DtlR hdrSloIfR = getSloRecvIfR(sloDL.get(0));
					
					setSloHdrDel(delHdrR, hdrSloIfR, sloR);
					
					delDtlL = MCList.create(Slo_Del01_DtlR.class);
					delDtlL.addStringColumn("slo_no");
					
					for (MST_SLO_D_R sloDR : sloDL) {
						
						SloRecvIf_Chk01_DtlR sloRecvIfR = getSloRecvIfR(sloDR);
						
						delDtlR = Slo_Del01_DtlR.create();

						setSloDtlDel(delDtlR, sloRecvIfR, sloDR, delHdrR);
						delDtlL.add(delDtlR);
					}
					
					down3().add(delHdrR);
					down4().addAll(delDtlL);
				}
			}
		}
		
		/**
		 * 受注登録サービスの削除前チェック用の受注ヘッダ情報を設定する。
		 * @param hdrR 削除前チェックヘッダ
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @param sloR 受注ヘッダ
		 */
		protected void setSloHdrDel(Slo_Del01_HdrR hdrR, SloRecvIf_Chk01_DtlR sloRecvIfR, MST_SLO_R sloR) {
			
			hdrR.slo_no(sloR.slo_no());
			
			hdrR.upd_cntr_not_chk_flg(true);
			hdrR.is_src_batch_flg(true);
			
			hdrR.setParamIndex(sloRecvIfR.slo().getParamIndex());
			hdrR.setParamRowIndex(sloRecvIfR.slo().getParamRowIndex());
		}
		
		/**
		 * 受注登録サービスの削除前チェック用の受注明細情報を設定する。
		 * @param dtlR 削除前チェック明細
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @param sloDR 受注明細
		 * @param hdrR 削除前チェックヘッダ
		 */
		protected void setSloDtlDel(Slo_Del01_DtlR dtlR, SloRecvIf_Chk01_DtlR sloRecvIfR, MST_SLO_D_R sloDR, Slo_Del01_HdrR hdrR) {
			
			dtlR.disp_seq(sloDR.disp_seq());
			dtlR.slo_d_no(sloDR.slo_d_no());
			dtlR.ship_pr_no(sloDR.getStringNE(MST_SHIP_PR_R.$ship_pr_no));
			dtlR.setValueNE("slo_no", hdrR.slo_no());
			dtlR.data_lno(sloRecvIfR.data_lno());
			dtlR.recv_dt(sloRecvIfR.recv_dt());
			
			dtlR.upd_cntr_not_chk_flg(true);
			
			dtlR.setParamIndex(sloRecvIfR.slo().getParamIndex());
			dtlR.setParamRowIndex(sloRecvIfR.slo().getParamRowIndex());
		}
		
		/**
		 * 受注新規登録用の下り電文を設定する。
		 */
		protected void setDownSloIns() {
			
			MCList<SloRecvIf_Chk01_DtlR> insSloIfL = MCList.create(SloRecvIf_Chk01_DtlR.class);
			
			insSloIfL.addAll(getNotErrL().subList(SloRecvIf_Chk01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value()));
			insSloIfL.addAll(_sloSplitInsIfL);
			
			MCList<Slo_Upd01_HdrR> hdrL = down1().clone();
			MCIndexKey idxkey = hdrL.createIndex(Slo_Upd01_HdrR.$slo_no);
			MCList<Slo_Upd01_DtlR> dtlL = null;
			Slo_Upd01_DtlR dtlR = null;
			
			for (MCList<SloRecvIf_Chk01_DtlR> insL : insSloIfL.groupList(getSloRecvIfHdrKey())) {
				
				dtlL = MCList.create(Slo_Upd01_DtlR.class);
				
				SloRecvIf_Chk01_DtlR hdrIfR = insL.get(0);
				
				Slo_Upd01_HdrR hdrR = getSameIfHdr(hdrIfR);
				
				if (isNull(hdrR) && !hdrL.contains(idxkey, hdrIfR.slo_no())) {
					
					hdrR = getSameSloHdr(hdrIfR);
					if (!isNull(hdrR)) {
						//　同一受注ヘッダが存在する場合、更新とする
						down1().add(hdrR);
					}
				}
				
				if (isNull(hdrR)) {
					// 同一受注ヘッダが存在しない場合、新規登録とする
					hdrR = Slo_Upd01_HdrR.create();
					setSloHdrIns(hdrR, hdrIfR);
					
					down1().add(hdrR);
				}

				for (SloRecvIf_Chk01_DtlR insIfR : insL) {
					
					dtlR = Slo_Upd01_DtlR.create();
					
					setSloDtlIns(dtlR, insIfR, hdrR);
					dtlL.add(dtlR);
				}
				
				down2().addAll(dtlL);
			}
		}
		
		/**
		 * 電文から同一受注ヘッダを取得する。
		 * @param sloRecvIfR 取込対象行
		 * @return 受注ヘッダ
		 */
		protected Slo_Upd01_HdrR getSameIfHdr(SloRecvIf_Chk01_DtlR sloRecvIfR) {
			
			for (Slo_Upd01_HdrR hdrR : down1()) {
				
				if (isSameSloHdr(sloRecvIfR, hdrR)) {
					return hdrR;
				}
			}
			
			return null;
		}
		
		/**
		 * 既に登録された受注から同一受注ヘッダを取得する。
		 * @param sloRecvIfR 取込対象行
		 * @return 受注ヘッダ
		 */
		protected Slo_Upd01_HdrR getSameSloHdr(SloRecvIf_Chk01_DtlR sloRecvIfR) {

			for (MST_SLO_R sloR : _sloL) {
				
				if (isSameSloHdr(sloRecvIfR, sloR)) {
					
					Slo_Upd01_HdrR hdrR = Slo_Upd01_HdrR.create();
					setSloHdrUpd(hdrR, sloRecvIfR, sloR);
					
					return hdrR;
				}
			}
			
			return null;
		}
		
		/**
		 * 電文から同一受注ヘッダを取得する。
		 * @param sloDR 受注明細
		 * @return 受注ヘッダ
		 */
		protected Slo_Upd01_HdrR getSameNoneHdr(MST_SLO_D_R sloDR) {
			
			for (Slo_Upd01_HdrR hdrR : down1()) {
				
				if (isSame(sloDR.slo_no(), hdrR.slo_no())) {
					return hdrR;
				}
			}
			
			return null;
		}
		
		/**
		 * 受注更新用の下り電文を設定する。
		 */
		protected void setDownSloUpd() {
			
			MCIndexKey idxkey = _sloL.createIndex(MST_SLO_D_R.$slo_no);
			
			MCIndexKey delIdxkey = down3().createIndex(Slo_Del01_HdrR.$slo_no);
			
			MCList<SloRecvIf_Chk01_DtlR> sloUpdIfL = null;
			MCList<SloRecvIf_Chk01_DtlR> sloDelIfL = null;
			
			for (MCList<MST_SLO_D_R> sloDL : _sloDL.groupList(MST_SLO_D_R.$slo_no)) {
				
				MST_SLO_R sloR = _sloL.getFirst(idxkey, sloDL.get(0).slo_no());
				
				sloUpdIfL = MCList.create(SloRecvIf_Chk01_DtlR.class);
				sloDelIfL = MCList.create(SloRecvIf_Chk01_DtlR.class);
				
				for (MST_SLO_D_R sloDR : sloDL) {
				
					SloRecvIf_Chk01_DtlR sloRecvIfR = getSloRecvIfR(sloDR);
					
					if (!isNull(sloRecvIfR)) {
						if (isDel(sloRecvIfR))  {
							if (!down3().contains(delIdxkey, sloR.slo_no())) {
								sloDelIfL.add(sloRecvIfR);
							}
						}
						else {
							sloUpdIfL.add(sloRecvIfR);
						}
					}
				}
				
				int hdrSize = sloUpdIfL.groupBy(getSloRecvIfHdrKey()).size();
				
				Slo_Upd01_HdrR hdrR = null;
				MCList<Slo_Upd01_DtlR> dtlL = MCList.create(Slo_Upd01_DtlR.class);
				Slo_Upd01_DtlR dtlR = null;
				
				if (hdrSize == 1) {
					
					SloRecvIf_Chk01_DtlR hdrIfR = sloUpdIfL.get(0);
					
					hdrR = Slo_Upd01_HdrR.create();
					setSloHdrUpd(hdrR, hdrIfR, sloR);
					
					for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloUpdIfL) {
						
						MST_SLO_D_R sloDR = getSloD(sloRecvIfR.slo_d_no());
						
						dtlR = Slo_Upd01_DtlR.create();
						setSloDtlUpd(dtlR, sloRecvIfR, sloDR, hdrR, sloR);
						dtlL.add(dtlR);
					}
				}
				else if (hdrSize > 1) {
					
					_sloSplitInsIfL = MCList.create(SloRecvIf_Chk01_DtlR.class);
					
					boolean isFirst = false;
					for (MCList<SloRecvIf_Chk01_DtlR> subSloIfL : sloUpdIfL.groupList(getSloRecvIfHdrKey())) {
						
						isFirst = false;
						
						if (isNull(hdrR)) {
							
							SloRecvIf_Chk01_DtlR hdrIfR = subSloIfL.get(0);
							
							hdrR = Slo_Upd01_HdrR.create();
							setSloHdrUpd(hdrR, hdrIfR, sloR);
							
							isFirst = true;
						}
						
						for (SloRecvIf_Chk01_DtlR sloRecvIfR : subSloIfL) {
							
							MST_SLO_D_R sloDR = getSloD(sloRecvIfR.slo_d_no());
							
							dtlR = Slo_Upd01_DtlR.create();
							
							setSloDtlUpd(dtlR, sloRecvIfR, sloDR, hdrR, sloR);
							
							if (!isFirst) {
								// 削除⇒新規
								dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
								dtlR.setStatus(Status.DELETE);
								
								SloRecvIf_Chk01_DtlR splitIfR = sloRecvIfR.clone();
								splitIfR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
								_sloSplitInsIfL.add(splitIfR);
							}
						
							dtlL.add(dtlR);
						}
					}
				}
				
				for (SloRecvIf_Chk01_DtlR sloRecvIfR : sloDelIfL) {
					
					if (isNull(hdrR)) {
						
						hdrR = Slo_Upd01_HdrR.create();
						
						setSloHdrNone(hdrR, sloRecvIfR, sloR);
					}
					
					MST_SLO_D_R sloDR = getSloD(sloRecvIfR.slo_d_no());
					
					dtlR = Slo_Upd01_DtlR.create();
					
					setSloDtlUpd(dtlR, sloRecvIfR, sloDR, hdrR, sloR);
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					dtlR.setStatus(Status.DELETE);
					
					dtlL.add(dtlR);
				}
				
				down1().add(hdrR);
				down2().addAll(dtlL);
			}
		}
		
		/**
		 * 受注削除用の下り電文を設定する。
		 */
		protected void setDownSloNone() {
			
			MCIndexKey idxkey = _sloL.createIndex(MST_SLO_R.$slo_no);
			
			MCList<MST_SLO_D_R> sloDNoneL = null;
			
			getWtaxRateSloD(_sloL, idxkey, _sloDL);
			for (MCList<MST_SLO_D_R> sloDL : _sloDL.groupList(MST_SLO_D_R.$slo_no)) {
				
				MST_SLO_R sloR = _sloL.getFirst(idxkey, sloDL.get(0).slo_no());
				
				sloDNoneL = MCList.create(MST_SLO_D_R.class);
				
				for (MST_SLO_D_R sloDR : sloDL) {
				
					SloRecvIf_Chk01_DtlR sloRecvIfR = getSloRecvIfR(sloDR);
					
					if (isNull(sloRecvIfR)) {
						sloDNoneL.add(sloDR.clone());
					}
				}
				
				MCList<Slo_Upd01_DtlR> dtlL = MCList.create(Slo_Upd01_DtlR.class);
				Slo_Upd01_DtlR dtlR = null;
				
				for (MST_SLO_D_R sloDR : sloDNoneL) {
					
					Slo_Upd01_HdrR hdrR = getSameNoneHdr(sloDR);
					
					if (!isNull(hdrR)) {
						
						dtlR = Slo_Upd01_DtlR.create();
						
						setSloDtlNone(dtlR, sloDR, hdrR, sloR);
						
						dtlL.add(dtlR);
					}
				}
				
				down2().addAll(dtlL);
			}
		}
		
		/**
		 * 受注受信ＩＦと受注が同一受注ヘッダかどうか。
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @param hdrR 受注ヘッダ
		 * @return 同一受注ヘッダの場合はtrue
		 */
		protected boolean isSameSloHdr(SloRecvIf_Chk01_DtlR sloRecvIfR, Slo_Upd01_HdrR hdrR) {
			
			return isSameValue(getCmpHdr(sloRecvIfR, hdrR));
		}
		
		/**
		 * 同一受注ヘッダかを比較する項目を返す。
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @param hdrR 受注ヘッダ
		 * @return 比較項目の配列
		 */
		protected Comparable<?>[][] getCmpHdr(SloRecvIf_Chk01_DtlR sloRecvIfR, Slo_Upd01_HdrR hdrR) {
			
			Comparable<?>[][] cmp = new Comparable[][] {
					
					{sloRecvIfR.cst_cd(), hdrR.cst_cd()},
					{sloRecvIfR.cst_po_no(), hdrR.cst_po_no()},
					{sloRecvIfR.cst_po_rev(), hdrR.cst_po_rev()},
					{sloRecvIfR.slo_typ(), hdrR.slo_typ()},
					{sloRecvIfR.slo_dt(), hdrR.slo_dt()},
					{sloRecvIfR.trd_cur_cd(), hdrR.trd_cur_cd()},
					{sloRecvIfR.sls_dpt_cd(), hdrR.sls_dpt_cd()},
					{sloRecvIfR.sls_usr_cd(), hdrR.sls_usr_cd()},
					{sloRecvIfR.wrk_no(), hdrR.wrk_no()},
					{sloRecvIfR.tterm_cd1(), hdrR.tterm_cd1()},
					{sloRecvIfR.tterm_cd2(), hdrR.tterm_cd2()},
					{sloRecvIfR.tterm_cd3(), hdrR.tterm_cd3()},
					{sloRecvIfR.tterm_rmrks1(), hdrR.tterm_rmrks1()},
					{sloRecvIfR.tterm_rmrks2(), hdrR.tterm_rmrks2()},
					{sloRecvIfR.tterm_rmrks3(), hdrR.tterm_rmrks3()},
					{sloRecvIfR.trnspt_cd(), hdrR.trnspt_cd()},
					{sloRecvIfR.load_port_cd(), hdrR.load_port_cd()},
					{sloRecvIfR.dschrg_port_cd(), hdrR.dschrg_port_cd()},
					{sloRecvIfR.via_port_cd(), hdrR.via_port_cd()},
					{sloRecvIfR.trd_rmrks(), hdrR.trd_rmrks()},
					{sloRecvIfR.cst_po_rmrks(), hdrR.cst_po_rmrks()},
					{sloRecvIfR.edi_sub_char1(), hdrR.edi_sub_char1()},
					{sloRecvIfR.edi_sub_char2(), hdrR.edi_sub_char2()},
					{sloRecvIfR.edi_sub_char3(), hdrR.edi_sub_char3()},
					{sloRecvIfR.edi_sub_char4(), hdrR.edi_sub_char4()},
					{sloRecvIfR.edi_sub_char5(), hdrR.edi_sub_char5()},
					{sloRecvIfR.edi_sub_num1(), hdrR.edi_sub_num1()},
					{sloRecvIfR.edi_sub_dt1(), hdrR.edi_sub_dt1()}
			};

			return cmp;
		}
		
		/**
		 * 受注受信ＩＦと登録済み受注が同一受注ヘッダかどうか。（後続処理チェック用）
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @param sloR 受注ヘッダ
		 * @return 同一受注ヘッダの場合はtrue
		 */
		protected boolean isSameChkSloHdr(SloRecvIf_Chk01_DtlR sloRecvIfR, MST_SLO_R sloR) {
			
			return isSameValue(getCmpChkHdr(sloRecvIfR, sloR));
		}
		
		/**
		 * 同一受注ヘッダかを比較する項目を返す。（後続処理チェック用）
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @param sloR 受注ヘッダ
		 * @return 比較項目の配列
		 */
		protected Comparable<?>[][] getCmpChkHdr(SloRecvIf_Chk01_DtlR sloRecvIfR, MST_SLO_R sloR) {
			
			Comparable<?>[][] cmp = new Comparable[][] {
					
					{sloRecvIfR.cst_cd(), sloR.cst_cd()},
					{sloRecvIfR.cst_po_no(), sloR.cst_po_no()},
					{sloRecvIfR.slo_typ(), sloR.slo_typ()},
					{sloRecvIfR.slo_dt(), sloR.slo_dt()},
					{sloRecvIfR.trd_cur_cd(), sloR.trd_cur_cd()},
					{sloRecvIfR.sls_dpt_cd(), sloR.sls_dpt_cd()},
					{sloRecvIfR.sls_usr_cd(), sloR.sls_usr_cd()},
					{sloRecvIfR.wrk_no(), sloR.wrk_no()},
					{sloRecvIfR.tterm_cd1(), sloR.tterm_cd1()},
					{sloRecvIfR.tterm_cd2(), sloR.tterm_cd2()},
					{sloRecvIfR.tterm_cd3(), sloR.tterm_cd3()},
					{sloRecvIfR.tterm_rmrks1(), sloR.tterm_rmrks1()},
					{sloRecvIfR.tterm_rmrks2(), sloR.tterm_rmrks2()},
					{sloRecvIfR.tterm_rmrks3(), sloR.tterm_rmrks3()},
					{sloRecvIfR.trnspt_cd(), sloR.trnspt_cd()},
					{sloRecvIfR.load_port_cd(), sloR.load_port_cd()},
					{sloRecvIfR.dschrg_port_cd(), sloR.dschrg_port_cd()},
					{sloRecvIfR.via_port_cd(), sloR.via_port_cd()},
					{sloRecvIfR.trd_rmrks(), sloR.trd_rmrks()},
					{sloRecvIfR.cst_po_rmrks(), sloR.cst_po_rmrks()},
					{sloRecvIfR.edi_sub_char1(), sloR.edi_sub_char1()},
					{sloRecvIfR.edi_sub_char2(), sloR.edi_sub_char2()},
					{sloRecvIfR.edi_sub_char3(), sloR.edi_sub_char3()},
					{sloRecvIfR.edi_sub_char4(), sloR.edi_sub_char4()},
					{sloRecvIfR.edi_sub_char5(), sloR.edi_sub_char5()},
					{sloRecvIfR.edi_sub_num1(), sloR.edi_sub_num1()},
					{sloRecvIfR.edi_sub_dt1(), sloR.edi_sub_dt1()}
			};

			return cmp;
		}
		
		/**
		 * 受注受信ＩＦと登録済み受注が同一受注ヘッダかどうか。
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @param sloR 受注ヘッダ
		 * @return 同一受注ヘッダの場合はtrue
		 */
		protected boolean isSameSloHdr(SloRecvIf_Chk01_DtlR sloRecvIfR, MST_SLO_R sloR) {
			
			return isSameValue(getCmpHdr(sloRecvIfR, sloR));
		}
		
		/**
		 * 同一受注ヘッダかを比較する項目を返す。
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @param sloR 受注ヘッダ
		 * @return 比較項目の配列
		 */
		protected Comparable<?>[][] getCmpHdr(SloRecvIf_Chk01_DtlR sloRecvIfR, MST_SLO_R sloR) {
			
			Comparable<?>[][] cmp = new Comparable[][] {
					
					{sloRecvIfR.cst_cd(), sloR.cst_cd()},
					{sloRecvIfR.cst_po_no(), sloR.cst_po_no()},
					{sloRecvIfR.cst_po_rev(), sloR.cst_po_rev()},
					{sloRecvIfR.slo_typ(), sloR.slo_typ()},
					{sloRecvIfR.slo_dt(), sloR.slo_dt()},
					{sloRecvIfR.trd_cur_cd(), sloR.trd_cur_cd()},
					{sloRecvIfR.sls_dpt_cd(), sloR.sls_dpt_cd()},
					{sloRecvIfR.sls_usr_cd(), sloR.sls_usr_cd()},
					{sloRecvIfR.wrk_no(), sloR.wrk_no()},
					{sloRecvIfR.tterm_cd1(), sloR.tterm_cd1()},
					{sloRecvIfR.tterm_cd2(), sloR.tterm_cd2()},
					{sloRecvIfR.tterm_cd3(), sloR.tterm_cd3()},
					{sloRecvIfR.tterm_rmrks1(), sloR.tterm_rmrks1()},
					{sloRecvIfR.tterm_rmrks2(), sloR.tterm_rmrks2()},
					{sloRecvIfR.tterm_rmrks3(), sloR.tterm_rmrks3()},
					{sloRecvIfR.trnspt_cd(), sloR.trnspt_cd()},
					{sloRecvIfR.load_port_cd(), sloR.load_port_cd()},
					{sloRecvIfR.dschrg_port_cd(), sloR.dschrg_port_cd()},
					{sloRecvIfR.via_port_cd(), sloR.via_port_cd()},
					{sloRecvIfR.trd_rmrks(), sloR.trd_rmrks()},
					{sloRecvIfR.cst_po_rmrks(), sloR.cst_po_rmrks()},
					{sloRecvIfR.edi_sub_char1(), sloR.edi_sub_char1()},
					{sloRecvIfR.edi_sub_char2(), sloR.edi_sub_char2()},
					{sloRecvIfR.edi_sub_char3(), sloR.edi_sub_char3()},
					{sloRecvIfR.edi_sub_char4(), sloR.edi_sub_char4()},
					{sloRecvIfR.edi_sub_char5(), sloR.edi_sub_char5()},
					{sloRecvIfR.edi_sub_num1(), sloR.edi_sub_num1()},
					{sloRecvIfR.edi_sub_dt1(), sloR.edi_sub_dt1()}
			};

			return cmp;
		}
		
		/**
		 * 受注受信ＩＦと登録済み受注の値が同じかどうか。
		 * @param dtlR 補完後の受注明細
		 * @param sloDR 受注明細
		 * @return 同一受注ヘッダの場合はtrue
		 */
		protected boolean isSameSloDtl(Slo_Upd01_DtlR dtlR, MST_SLO_D_R sloDR) {
			
			return isSameValue(getCmpDtl(dtlR, sloDR));
		}
		
		/**
		 * 同一受注明細かを比較する項目を返す。
		 * @param dtlR 補完後の受注明細
		 * @param sloDR 受注明細
		 * @return 比較項目の配列
		 */
		protected Comparable<?>[][] getCmpDtl(Slo_Upd01_DtlR dtlR, MST_SLO_D_R sloDR) {
			
			Comparable<?>[][] cmp = new Comparable[][] {
					
					{dtlR.dest_cd1(), sloDR.dest_cd1()},
					{dtlR.dest_cd2(), sloDR.dest_cd2()},
					{dtlR.dest_cd3(), sloDR.dest_cd3()},
					{dtlR.vmi_flg(), sloDR.vmi_flg()},
					{dtlR.sls_cststk_flg(), sloDR.sls_cststk_flg()},
					{dtlR.dlv_cd(), sloDR.dlv_cd()},
					{dtlR.dlv_nm(), sloDR.dlv_nm()},
					{dtlR.dlv_cntct_dpt(), sloDR.dlv_cntct_dpt()},
					{dtlR.dlv_cntct_psn(), sloDR.dlv_cntct_psn()},
					{dtlR.dlv_zip_cd(), sloDR.dlv_zip_cd()},
					{dtlR.dlv_addr1(), sloDR.dlv_addr1()},
					{dtlR.dlv_addr2(), sloDR.dlv_addr2()},
					{dtlR.dlv_addr3(), sloDR.dlv_addr3()},
					{dtlR.dlv_addr4(), sloDR.dlv_addr4()},
					{dtlR.dlv_tel(), sloDR.dlv_tel()},
					{dtlR.dlv_fax(), sloDR.dlv_fax()},
					{dtlR.tdlv_cd(), sloDR.tdlv_cd()},
					{dtlR.tdlv_nm(), sloDR.tdlv_nm()},
					{dtlR.tdlv_cntct_dpt(), sloDR.tdlv_cntct_dpt()},
					{dtlR.tdlv_cntct_psn(), sloDR.tdlv_cntct_psn()},
					{dtlR.tdlv_zip_cd(), sloDR.tdlv_zip_cd()},
					{dtlR.tdlv_addr1(), sloDR.tdlv_addr1()},
					{dtlR.tdlv_addr2(), sloDR.tdlv_addr2()},
					{dtlR.tdlv_addr3(), sloDR.tdlv_addr3()},
					{dtlR.tdlv_addr4(), sloDR.tdlv_addr4()},
					{dtlR.tdlv_tel(), sloDR.tdlv_tel()},
					{dtlR.tdlv_fax(), sloDR.tdlv_fax()},
					{dtlR.dlv_day_week_typ(), sloDR.dlv_day_week_typ()},
					{dtlR.pri_prnt_flg(), sloDR.pri_prnt_flg()},
					{dtlR.cst_itm_cd(), sloDR.cst_itm_cd()},
					{dtlR.cst_itm_nm(), sloDR.cst_itm_nm()},
					{dtlR.itm_cd(), sloDR.itm_cd()},
					{dtlR.itm_sub1(), sloDR.itm_sub1()},
					{dtlR.itm_sub2(), sloDR.itm_sub2()},
					{dtlR.itm_sub3(), sloDR.itm_sub3()},
					{dtlR.itm_nm(), sloDR.itm_nm()},
					{dtlR.cntry_org_cd(), sloDR.cntry_org_cd()},
					{nullValToNull(dtlR.sno1()), nullValToNull(sloDR.sno1())},
					{nullValToNull(dtlR.sno2()), nullValToNull(sloDR.sno2())},
					{nullValToNull(dtlR.sno3()), nullValToNull(sloDR.sno3())},
					{nullValToNull(dtlR.sno4()), nullValToNull(sloDR.sno4())},
					{dtlR.gd_cd(), sloDR.gd_cd()},
					{dtlR.trd_unit_cd(), sloDR.trd_unit_cd()},
					{dtlR.trd_unit_qty(), sloDR.trd_unit_qty()},
					{dtlR.interim_flg(), sloDR.interim_flg()},
					{dtlR.trd_cur_upri(), sloDR.trd_cur_upri()},
					{dtlR.tax_fix_flg(), sloDR.tax_fix_flg()},
					{dtlR.tax_cd(), sloDR.tax_cd()},
					{dtlR.trd_cur_dscnt_amt(), sloDR.trd_cur_dscnt_amt()},
					{dtlR.dscnt_rsn_cd(), sloDR.dscnt_rsn_cd()},
					{dtlR.alloc_grp_cd(), sloDR.alloc_grp_cd()},
					{dtlR.ship_lg_grp_cd(), sloDR.ship_lg_grp_cd()},
					{dtlR.loc_cd(), sloDR.loc_cd()},
					{dtlR.ship_block_flg(), sloDR.getBooleanNE(MST_SHIP_SCHD_R.$ship_block_flg)},
					{dtlR.abort_flg(), sloDR.abort_flg()},
					{dtlR.set_itm_grp_no(), sloDR.set_itm_grp_no()},
					{dtlR.ver_no(), sloDR.ver_no()},
					{nullValToNull(dtlR.lot_no()), nullValToNull(sloDR.lot_no())},
					{nullValToNull(dtlR.sublot_no()), nullValToNull(sloDR.sublot_no())},
					{dtlR.dlv_rqst_tm(), sloDR.dlv_rqst_tm()},
					{dtlR.accpt_schd_dt(), sloDR.accpt_schd_dt()},
					{nullValToNull(dtlR.maker_cd()), nullValToNull(sloDR.maker_cd())},
					{dtlR.sppl_cd(), sloDR.sppl_cd()},
					{dtlR.trd_d_rmrks(), sloDR.trd_d_rmrks()},
					{dtlR.cst_po_d_rmrks(), sloDR.cst_po_d_rmrks()},
					{dtlR.edi_sub_d_char1(), sloDR.edi_sub_d_char1()},
					{dtlR.edi_sub_d_char2(), sloDR.edi_sub_d_char2()},
					{dtlR.edi_sub_d_char3(), sloDR.edi_sub_d_char3()},
					{dtlR.edi_sub_d_char4(), sloDR.edi_sub_d_char4()},
					{dtlR.edi_sub_d_char5(), sloDR.edi_sub_d_char5()},
					{dtlR.edi_sub_d_num1(), sloDR.edi_sub_d_num1()},
					{dtlR.edi_sub_d_dt1(), sloDR.edi_sub_d_dt1()}
					
			};

			return cmp;
		}
		
		/**
		 * 指定された比較配列が同値かどうか。
		 * @param cmp 比較配列
		 * @return 同値の場合はtrue
		 */
		protected boolean isSameValue(Comparable<?>[][] cmp) {
			
			for (Comparable<?>[] c : cmp) {
				if (!isSame(c[0], c[1])) {
					return false;
				}
			}
			return true;
		}
		
		/**
		 * 受注登録サービスの登録前チェック用（新規）の受注ヘッダ情報を設定する。
		 * @param hdrR 登録前チェックヘッダ
		 * @param sloRecvIfR 受注受信ＩＦ
		 */
		protected void setSloHdrIns(Slo_Upd01_HdrR hdrR, SloRecvIf_Chk01_DtlR sloRecvIfR) {
			
			copy(hdrR, sloRecvIfR, createMap_Slo_Upd01_HdrR_SloRecvIf_Chk01_DtlR());
			
			hdrR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			
			hdrR.peg_no(_hdrPegNo);
			_hdrPegNo++;
			
			hdrR.setParamIndex(sloRecvIfR.slo().getParamIndex());
			hdrR.setParamRowIndex(sloRecvIfR.slo().getParamRowIndex());
		}
		
		/**
		 * 受注登録サービスの登録前チェック用（新規）の受注明細情報を設定する。
		 * @param dtlR 登録前チェック明細
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @param hdrR 登録前チェックヘッダ
		 */
		protected void setSloDtlIns(Slo_Upd01_DtlR dtlR, SloRecvIf_Chk01_DtlR sloRecvIfR, Slo_Upd01_HdrR hdrR) {
			
			copy(dtlR, sloRecvIfR, createMap_Slo_Upd01_DtlR_SloRecvIf_Chk01_DtlR());
			
			dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());

			dtlR.hdr_peg_no(hdrR.peg_no());
			
			dtlR.setParamIndex(sloRecvIfR.slo().getParamIndex());
			dtlR.setParamRowIndex(sloRecvIfR.slo().getParamRowIndex());
			dtlR.setStatus(Status.CREATE);
		}
		
		/**
		 * 受注登録サービスの登録前チェック用（更新）の受注ヘッダ情報を設定する。
		 * @param hdrR 登録前チェックヘッダ
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @param sloR　受注ヘッダ
		 */
		protected void setSloHdrUpd(Slo_Upd01_HdrR hdrR, SloRecvIf_Chk01_DtlR sloRecvIfR, MST_SLO_R sloR) {
			
			copy(hdrR, sloRecvIfR, createMap_Slo_Upd01_HdrR_SloRecvIf_Chk01_DtlR());
			
			hdrR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			
			hdrR.slo_no(sloR.slo_no());
			
			hdrR.qtn_no(sloR.qtn_no());
			hdrR.qtn_rev(sloR.qtn_rev());
			
			if (sloRecvIfR.cst_iv_flg()) {
				
				hdrR.vssl_flght(sloR.vssl_flght());
				hdrR.etd_dt(sloR.etd_dt());
				hdrR.eta_dt(sloR.eta_dt());
				hdrR.via_schd_dt(sloR.via_schd_dt());
				hdrR.iv_no(sloR.iv_no());
			}
			
			hdrR.rcpt_dt(sloR.rcpt_dt());
			hdrR.rcpt_usr_cd(sloR.rcpt_usr_cd());
			hdrR.intr_rmrks(sloR.intr_rmrks());
			hdrR.sub_char1(sloR.sub_char1());
			hdrR.sub_char2(sloR.sub_char2());
			hdrR.sub_char3(sloR.sub_char3());
			
			hdrR.peg_no(_hdrPegNo);
			_hdrPegNo++;
			
			hdrR.setParamIndex(sloRecvIfR.slo().getParamIndex());
			hdrR.setParamRowIndex(sloRecvIfR.slo().getParamRowIndex());
		}
		
		/**
		 *  受注登録サービスの登録前チェック用（更新）の受注明細情報を設定する。
		 * @param dtlR 登録前チェック明細
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @param sloDR 受注明細
		 * @param hdrR 登録前チェックヘッダ
		 * @param sloR 受注ヘッダ
		 */
		protected void setSloDtlUpd(Slo_Upd01_DtlR dtlR, SloRecvIf_Chk01_DtlR sloRecvIfR, MST_SLO_D_R sloDR, Slo_Upd01_HdrR hdrR, MST_SLO_R sloR) {
			
			copy(dtlR, sloRecvIfR, createMap_Slo_Upd01_DtlR_SloRecvIf_Chk01_DtlR());
			
			if (!isNull(sloDR) 
					&& !isNull(sloDR.rqst_to_loc_cd())
					&& !MAC_SLO_PROC_TYP.isALLOC(dtlR.proc_typ())
					&& !MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())
					&& (isSame(sloRecvIfR.loc_wg_cd(), sloDR.getStringNE(MAM_LOC_R.$wg_cd)))
					&& isSameItm(sloRecvIfR, sloDR)) {
				
				dtlR.rqst_to_loc_cd(sloDR.rqst_to_loc_cd());
			}
			
			if (MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ())
					|| MAC_SLO_PROC_TYP.isPROC(dtlR.proc_typ())
					|| MAC_SLO_PROC_TYP.isALLOC_PROC(dtlR.proc_typ())) {
				dtlR.wg_rqst_cnt_rmrks(sloDR.wg_rqst_cnt_rmrks());
			}
			
			if (!MAC_SLO_PROC_TYP.isPURC_DDLV(dtlR.proc_typ()) 
					&& !MAC_SHIP_INST_TYP.isNO_PICK(dtlR.ship_inst_typ())
					&& isSameItm(sloRecvIfR, sloDR)) {
				
				dtlR.ship_cnt_rmrks(sloDR.ship_cnt_rmrks());
			}
			
			if (isNull(dtlR.trd_d_rmrks())) {
				dtlR.trd_d_rmrks(sloDR.trd_d_rmrks());
			}
			
			dtlR.intr_rmrks(sloDR.intr_rmrks());
			dtlR.sub_char1(sloDR.sub_char1());
			dtlR.sub_char2(sloDR.sub_char2());
			dtlR.sub_char3(sloDR.sub_char3());
			dtlR.qtn_d_no(sloDR.qtn_d_no());
			
			dtlR.ship_schd_tm(sloDR.getDateNE(MST_SHIP_PR_R.$ship_schd_tm));
			dtlR.dlv_schd_tm(sloDR.getDateNE(MST_SHIP_PR_R.$dlv_schd_tm));
			
			dtlR.ship_pr_no(sloDR.getStringNE(MST_SHIP_PR_R.$ship_pr_no));
			dtlR.org_ship_block_flg(sloDR.getBooleanNE(MST_SHIP_SCHD_R.$ship_block_flg));
			
			dtlR.disp_seq(sloDR.disp_seq());
			
			dtlR.hdr_peg_no(hdrR.peg_no());
			
			dtlR.setParamIndex(sloRecvIfR.slo().getParamIndex());
			dtlR.setParamRowIndex(sloRecvIfR.slo().getParamRowIndex());
			
			if (isTrnst(sloDR) && isSameSloDtl(dtlR, sloDR)) {
				dtlR.data_crud_typ(null);
				dtlR.setStatus(Status.NONE);
			}
			else {
				dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				dtlR.setStatus(Status.MODIFY);
			}
		}
		
		/**
		 * 受注受信ＩＦの品目と受注明細の品目が同一品目かどうか。
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @param sloDR 受注明細
		 * @return 同一品目の場合はtrue
		 */
		protected boolean isSameItm(SloRecvIf_Chk01_DtlR sloRecvIfR, MST_SLO_D_R sloDR) {
			
			return isSame(sloRecvIfR.itm_cd(), sloDR.itm_cd())
					&& isSame(sloRecvIfR.itm_sub1(), sloDR.itm_sub1())
					&& isSame(sloRecvIfR.itm_sub2(), sloDR.itm_sub2())
					&& isSame(sloRecvIfR.itm_sub3(), sloDR.itm_sub3());
		}
		
		/**
		 * 受注登録サービスの登録前チェック用（ヘッダ変更なし）の受注ヘッダ情報を設定する。<br>
		 * 受注受信ＩＦに削除のみ設定されている場合に使用する。
		 * @param hdrR 登録前チェックヘッダ
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @param sloR 受注ヘッダ
		 */
		protected void setSloHdrNone(Slo_Upd01_HdrR hdrR, SloRecvIf_Chk01_DtlR sloRecvIfR, MST_SLO_R sloR) {
			
			copy(hdrR, sloR, createMap_Slo_Upd01_HdrR_MST_SLO_R());
			
			hdrR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
		
			hdrR.peg_no(_hdrPegNo);
			_hdrPegNo++;
	
			hdrR.setParamIndex(sloRecvIfR.slo().getParamIndex());
			hdrR.setParamRowIndex(sloRecvIfR.slo().getParamRowIndex());
			hdrR.cst_po_rev(sloRecvIfR.slo().cst_po_rev());
		}
		
		/**
		 * 受注登録サービスの登録前チェック用（明細変更なし）の受注ヘッダ情報を設定する。<br>
		 * ヘッダの項目が変更された場合、対応する明細項目のデフォルト値を設定する。
		 * @param dtlR 登録前チェック明細
		 * @param sloDR　受注明細
		 * @param hdrR 登録前チェックヘッダ
		 * @param sloR　受注ヘッダ
		 */
		protected void setSloDtlNone(Slo_Upd01_DtlR dtlR, MST_SLO_D_R sloDR, Slo_Upd01_HdrR hdrR, MST_SLO_R sloR) {
			
			copy(dtlR, sloDR, createMap_Slo_Upd01_DtlR_MST_SLO_D_R());
			
			boolean updFlg = false;
			
			if (!isTrnst(sloDR)) {
				
				if (!isSame(hdrR.wg_cd(), sloR.wg_cd()) && !sloDR.vmi_flg()) {
					
					// 売上部門のワーキンググループが変わった場合、原価単価を再設定する。
					dtlR.cost_upri(MAUCL_StdUpriUtil.getStdCost(
							sloDR.itm_cd(), 
							sloDR.itm_sub1(), 
							sloDR.itm_sub2(), 
							sloDR.itm_sub3(), 
							sloR.slo_dt(), 
							hdrR.wg_cd(), 
							getCo().gm_std_upri_typ()));
					
					updFlg = true;
				}
				
				if (!isSame(hdrR.trd_cur_cd(), sloR.trd_cur_cd())) {
					
					if (isSame(sloR.trd_cur_cd(), getCo().base_cur_cd()) 
							&& (isSame(sloR.trd_cur_cd(), getCo().ptax_cur_cd()) || isNull(getCo().ptax_cur_cd()))) {
						
						dtlR.wtax_rate(getWtaxRate(sloDR.itm_cd(), sloDR.itm_sub1(), sloDR.itm_sub2(),
								sloDR.itm_sub3(), sloR.slo_dt()));
					}
					else {
						dtlR.wtax_rate(null);
					}
					
					updFlg = true;
				}
				
				if (!isSame(hdrR.wg_cd(), sloR.wg_cd())) {
					// 売上部門のワーキンググループが変わった場合、引当情報をチェックされるため
					updFlg = true;
				}
			}
			
			dtlR.ship_schd_tm(sloDR.getDateNE(MST_SHIP_PR_R.$ship_schd_tm));
			dtlR.dlv_schd_tm(sloDR.getDateNE(MST_SHIP_PR_R.$dlv_schd_tm));
			dtlR.ship_pr_no(sloDR.getStringNE(MST_SHIP_PR_R.$ship_pr_no));
			dtlR.org_ship_block_flg(sloDR.getBooleanNE(MST_SHIP_SCHD_R.$ship_block_flg));
			dtlR.not_dt_calc_flg(sloDR.getBooleanNE(MST_SHIP_SCHD_R.$not_dt_calc_flg));
			
			dtlR.hdr_peg_no(hdrR.peg_no());
			// 紐付く受注受信ＩＦが存在しないため、ParamIndexとParamRowIndexを設定しない
			
			if (updFlg) {
				dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				dtlR.setStatus(Status.MODIFY);
			}
			else {
				dtlR.setStatus(Status.NONE);
			}
		}
		
		/**
		 * 受注明細に紐付く受注受信ＩＦを取得する。
		 * @param sloDR 受注明細
		 * @return 受注受信ＩＦ
		 */
		protected SloRecvIf_Chk01_DtlR getSloRecvIfR(MST_SLO_D_R sloDR) {
			
			if (_sloRecvIfIdxkey == null) {
				_sloRecvIfIdxkey = up0().createIndex(SloRecvIf_Chk01_DtlR.$cst_cd,
						SloRecvIf_Chk01_DtlR.$cst_po_no, SloRecvIf_Chk01_DtlR.$cst_po_d_no, SloRecvIf_Chk01_DtlR.$err_flg);
			}
			
			return up0().getFirst(_sloRecvIfIdxkey, sloDR.getString("cst_cd"),
					sloDR.getString("cst_po_no"), sloDR.cst_po_d_no(), false);
		}
		
		/**
		 * 受注受信ＩＦのヘッダ項目を返す。
		 * @return ヘッダ項目
		 */
		protected String[] getSloRecvIfHdrKey() {

			return new String[] {
					
					SloRecvIf_Chk01_DtlR.$cst_cd,
					SloRecvIf_Chk01_DtlR.$cst_po_no,
					SloRecvIf_Chk01_DtlR.$cst_po_rev,
					SloRecvIf_Chk01_DtlR.$slo_typ,
					SloRecvIf_Chk01_DtlR.$slo_dt,
					SloRecvIf_Chk01_DtlR.$trd_cur_cd,
					SloRecvIf_Chk01_DtlR.$sls_dpt_cd,
					SloRecvIf_Chk01_DtlR.$sls_usr_cd,
					SloRecvIf_Chk01_DtlR.$wrk_no,
					SloRecvIf_Chk01_DtlR.$tterm_cd1,
					SloRecvIf_Chk01_DtlR.$tterm_cd2,
					SloRecvIf_Chk01_DtlR.$tterm_cd3,
					SloRecvIf_Chk01_DtlR.$tterm_rmrks1,
					SloRecvIf_Chk01_DtlR.$tterm_rmrks2,
					SloRecvIf_Chk01_DtlR.$tterm_rmrks3,
					SloRecvIf_Chk01_DtlR.$trnspt_cd,
					SloRecvIf_Chk01_DtlR.$load_port_cd,
					SloRecvIf_Chk01_DtlR.$dschrg_port_cd,
					SloRecvIf_Chk01_DtlR.$via_port_cd,
					SloRecvIf_Chk01_DtlR.$trd_rmrks,
					SloRecvIf_Chk01_DtlR.$cst_po_rmrks,
					SloRecvIf_Chk01_DtlR.$edi_sub_char1,
					SloRecvIf_Chk01_DtlR.$edi_sub_char2,
					SloRecvIf_Chk01_DtlR.$edi_sub_char3,
					SloRecvIf_Chk01_DtlR.$edi_sub_char4,
					SloRecvIf_Chk01_DtlR.$edi_sub_char5,
					SloRecvIf_Chk01_DtlR.$edi_sub_num1,
					SloRecvIf_Chk01_DtlR.$edi_sub_dt1};
		}
		
		/**
		 * 指定された受注受信ＩＦが新規かどうか。
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @return　新規の場合はtrue
		 */
		protected boolean isCrt(SloRecvIf_Chk01_DtlR sloRecvIfR) {
			
			return MAC_DATA_CRUD_TYP.isCRT(sloRecvIfR.data_crud_typ());
		}
		
		/**
		 * 指定された受注受信ＩＦが更新かどうか。
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @return　新規の場合はtrue
		 */
		protected boolean isUpd(SloRecvIf_Chk01_DtlR sloRecvIfR) {
			
			return MAC_DATA_CRUD_TYP.isUPD(sloRecvIfR.data_crud_typ());
		}
		
		/**
		 * 指定された受注受信ＩＦが更新かどうか。
		 * @param sloRecvIfR 受注受信ＩＦ
		 * @return　削除の場合はtrue
		 */
		protected boolean isDel(SloRecvIf_Chk01_DtlR sloRecvIfR) {
			
			return MAC_DATA_CRUD_TYP.isDEL(sloRecvIfR.data_crud_typ());
		}
		
		protected Map_Slo_Upd01_HdrR_SloRecvIf_Chk01_DtlR<Slo_Upd01_HdrR,SloRecvIf_Chk01_DtlR> createMap_Slo_Upd01_HdrR_SloRecvIf_Chk01_DtlR() {
			return new Map_Slo_Upd01_HdrR_SloRecvIf_Chk01_DtlR<Slo_Upd01_HdrR, SloRecvIf_Chk01_DtlR>();
		}

		public class Map_Slo_Upd01_HdrR_SloRecvIf_Chk01_DtlR<D extends Slo_Upd01_HdrR, S extends SloRecvIf_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Slo_Upd01_HdrR.$slo_no, SloRecvIf_Chk01_DtlR.$slo_no);
				addColumnPathMap(Slo_Upd01_HdrR.$slo_typ, SloRecvIf_Chk01_DtlR.$slo_typ);
				addColumnPathMap(Slo_Upd01_HdrR.$slo_dt, SloRecvIf_Chk01_DtlR.$slo_dt);
				addColumnPathMap(Slo_Upd01_HdrR.$cst_cd, SloRecvIf_Chk01_DtlR.$cst_cd);
				addColumnPathMap(Slo_Upd01_HdrR.$sls_basis_typ, SloRecvIf_Chk01_DtlR.$sls_basis_typ);
				addColumnPathMap(Slo_Upd01_HdrR.$sls_usr_cd, SloRecvIf_Chk01_DtlR.$sls_usr_cd);
				addColumnPathMap(Slo_Upd01_HdrR.$sls_dpt_cd, SloRecvIf_Chk01_DtlR.$sls_dpt_cd);
				addColumnPathMap(Slo_Upd01_HdrR.$assort_typ, SloRecvIf_Chk01_DtlR.$assort_typ);
				addColumnPathMap(Slo_Upd01_HdrR.$trd_cur_cd, SloRecvIf_Chk01_DtlR.$trd_cur_cd);
				addColumnPathMap(Slo_Upd01_HdrR.$xrate_inpt_flg, SloRecvIf_Chk01_DtlR.$xrate_inpt_flg);
				addColumnPathMap(Slo_Upd01_HdrR.$xrate, SloRecvIf_Chk01_DtlR.$xrate);
				addColumnPathMap(Slo_Upd01_HdrR.$ptax_xrate_inpt_flg, SloRecvIf_Chk01_DtlR.$ptax_xrate_inpt_flg);
				addColumnPathMap(Slo_Upd01_HdrR.$ptax_xrate, SloRecvIf_Chk01_DtlR.$ptax_xrate);
				addColumnPathMap(Slo_Upd01_HdrR.$wrk_no, SloRecvIf_Chk01_DtlR.$wrk_no);
				addColumnPathMap(Slo_Upd01_HdrR.$trnspt_cd, SloRecvIf_Chk01_DtlR.$trnspt_cd);
				addColumnPathMap(Slo_Upd01_HdrR.$load_port_cd, SloRecvIf_Chk01_DtlR.$load_port_cd);
				addColumnPathMap(Slo_Upd01_HdrR.$dschrg_port_cd, SloRecvIf_Chk01_DtlR.$dschrg_port_cd);
				addColumnPathMap(Slo_Upd01_HdrR.$via_port_cd, SloRecvIf_Chk01_DtlR.$via_port_cd);
				addColumnPathMap(Slo_Upd01_HdrR.$adv_ship_ctrl_typ, SloRecvIf_Chk01_DtlR.$adv_ship_ctrl_typ);
				addColumnPathMap(Slo_Upd01_HdrR.$adv_bill_amt, SloRecvIf_Chk01_DtlR.$adv_bill_amt);
				addColumnPathMap(Slo_Upd01_HdrR.$tterm_cd1, SloRecvIf_Chk01_DtlR.$tterm_cd1);
				addColumnPathMap(Slo_Upd01_HdrR.$tterm_rmrks1, SloRecvIf_Chk01_DtlR.$tterm_rmrks1);
				addColumnPathMap(Slo_Upd01_HdrR.$tterm_cd2, SloRecvIf_Chk01_DtlR.$tterm_cd2);
				addColumnPathMap(Slo_Upd01_HdrR.$tterm_rmrks2, SloRecvIf_Chk01_DtlR.$tterm_rmrks2);
				addColumnPathMap(Slo_Upd01_HdrR.$tterm_cd3, SloRecvIf_Chk01_DtlR.$tterm_cd3);
				addColumnPathMap(Slo_Upd01_HdrR.$tterm_rmrks3, SloRecvIf_Chk01_DtlR.$tterm_rmrks3);
				addColumnPathMap(Slo_Upd01_HdrR.$cst_po_no, SloRecvIf_Chk01_DtlR.$cst_po_no);
				addColumnPathMap(Slo_Upd01_HdrR.$cst_po_rev, SloRecvIf_Chk01_DtlR.$cst_po_rev);
				addColumnPathMap(Slo_Upd01_HdrR.$ar_dpt_cd, SloRecvIf_Chk01_DtlR.$ar_dpt_cd);
				addColumnPathMap(Slo_Upd01_HdrR.$cst_po_rmrks, SloRecvIf_Chk01_DtlR.$cst_po_rmrks);
				addColumnPathMap(Slo_Upd01_HdrR.$trd_rmrks, SloRecvIf_Chk01_DtlR.$trd_rmrks);
				addColumnPathMap(Slo_Upd01_HdrR.$edi_sub_char1, SloRecvIf_Chk01_DtlR.$edi_sub_char1);
				addColumnPathMap(Slo_Upd01_HdrR.$edi_sub_char2, SloRecvIf_Chk01_DtlR.$edi_sub_char2);
				addColumnPathMap(Slo_Upd01_HdrR.$edi_sub_char3, SloRecvIf_Chk01_DtlR.$edi_sub_char3);
				addColumnPathMap(Slo_Upd01_HdrR.$edi_sub_char4, SloRecvIf_Chk01_DtlR.$edi_sub_char4);
				addColumnPathMap(Slo_Upd01_HdrR.$edi_sub_char5, SloRecvIf_Chk01_DtlR.$edi_sub_char5);
				addColumnPathMap(Slo_Upd01_HdrR.$edi_sub_num1, SloRecvIf_Chk01_DtlR.$edi_sub_num1);
				addColumnPathMap(Slo_Upd01_HdrR.$edi_sub_dt1, SloRecvIf_Chk01_DtlR.$edi_sub_dt1);
				addColumnPathMap(Slo_Upd01_HdrR.$wg_cd, SloRecvIf_Chk01_DtlR.$dpt_wg_cd);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.trd_cd(getDefaultTrd());
				dest.aprv_back_flg(false);
				dest.iv_num_flg(false);
				dest.edi_flg(true);
				dest.upd_cntr_not_chk_flg(true);
				dest.is_src_batch_flg(true);
			}
		}
		
		protected Map_Slo_Upd01_DtlR_SloRecvIf_Chk01_DtlR<Slo_Upd01_DtlR,SloRecvIf_Chk01_DtlR> createMap_Slo_Upd01_DtlR_SloRecvIf_Chk01_DtlR() {
			return new Map_Slo_Upd01_DtlR_SloRecvIf_Chk01_DtlR<Slo_Upd01_DtlR, SloRecvIf_Chk01_DtlR>();
		}

		public class Map_Slo_Upd01_DtlR_SloRecvIf_Chk01_DtlR<D extends Slo_Upd01_DtlR, S extends SloRecvIf_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				
				addColumnPathMap(Slo_Upd01_DtlR.$abort_flg, SloRecvIf_Chk01_DtlR.$abort_flg);
				addColumnPathMap(Slo_Upd01_DtlR.$slo_d_no, SloRecvIf_Chk01_DtlR.$slo_d_no);
				addColumnPathMap(Slo_Upd01_DtlR.$itm_cd, SloRecvIf_Chk01_DtlR.$itm_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$itm_sub1, SloRecvIf_Chk01_DtlR.$itm_sub1);
				addColumnPathMap(Slo_Upd01_DtlR.$itm_sub2, SloRecvIf_Chk01_DtlR.$itm_sub2);
				addColumnPathMap(Slo_Upd01_DtlR.$itm_sub3, SloRecvIf_Chk01_DtlR.$itm_sub3);
				addColumnPathMap(Slo_Upd01_DtlR.$itm_nm, SloRecvIf_Chk01_DtlR.$itm_nm);
				addColumnPathMap(Slo_Upd01_DtlR.$iv_itm_nm, SloRecvIf_Chk01_DtlR.$iv_itm_nm);
				addColumnPathMap(Slo_Upd01_DtlR.$cntry_org_cd, SloRecvIf_Chk01_DtlR.$cntry_org_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$vmi_flg, SloRecvIf_Chk01_DtlR.$vmi_flg);
				addColumnPathMap(Slo_Upd01_DtlR.$trd_unit_cd, SloRecvIf_Chk01_DtlR.$trd_unit_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$trd_unit_qty, SloRecvIf_Chk01_DtlR.$trd_unit_qty);
				addColumnPathMap(Slo_Upd01_DtlR.$trd_cur_upri, SloRecvIf_Chk01_DtlR.$trd_cur_upri);
				addColumnPathMap(Slo_Upd01_DtlR.$interim_flg, SloRecvIf_Chk01_DtlR.$interim_flg);
				addColumnPathMap(Slo_Upd01_DtlR.$upri_not_tgt_flg, SloRecvIf_Chk01_DtlR.$upri_not_tgt_flg);
				addColumnPathMap(Slo_Upd01_DtlR.$cost_upri, SloRecvIf_Chk01_DtlR.$cost_upri);
				addColumnPathMap(Slo_Upd01_DtlR.$trd_cur_dscnt_amt, SloRecvIf_Chk01_DtlR.$trd_cur_dscnt_amt);
				addColumnPathMap(Slo_Upd01_DtlR.$dscnt_rsn_cd, SloRecvIf_Chk01_DtlR.$dscnt_rsn_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$iv_upri, SloRecvIf_Chk01_DtlR.$iv_upri);
				addColumnPathMap(Slo_Upd01_DtlR.$tax_fix_flg, SloRecvIf_Chk01_DtlR.$tax_fix_flg);
				addColumnPathMap(Slo_Upd01_DtlR.$tax_cd, SloRecvIf_Chk01_DtlR.$tax_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$wtax_rate, SloRecvIf_Chk01_DtlR.$wtax_rate);
				addColumnPathMap(Slo_Upd01_DtlR.$bill_crryovr_times, SloRecvIf_Chk01_DtlR.$bill_crryovr_times);
				addColumnPathMap(Slo_Upd01_DtlR.$gd_cd, SloRecvIf_Chk01_DtlR.$gd_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$sno_num_flg, SloRecvIf_Chk01_DtlR.$sno_num_flg);
				addColumnPathMap(Slo_Upd01_DtlR.$sno1, SloRecvIf_Chk01_DtlR.$sno1);
				addColumnPathMap(Slo_Upd01_DtlR.$sno1_null_flg, SloRecvIf_Chk01_DtlR.$sno1_null_flg);
				addColumnPathMap(Slo_Upd01_DtlR.$sno2, SloRecvIf_Chk01_DtlR.$sno2);
				addColumnPathMap(Slo_Upd01_DtlR.$sno2_null_flg, SloRecvIf_Chk01_DtlR.$sno2_null_flg);
				addColumnPathMap(Slo_Upd01_DtlR.$sno3, SloRecvIf_Chk01_DtlR.$sno3);
				addColumnPathMap(Slo_Upd01_DtlR.$sno3_null_flg, SloRecvIf_Chk01_DtlR.$sno3_null_flg);
				addColumnPathMap(Slo_Upd01_DtlR.$sno4, SloRecvIf_Chk01_DtlR.$sno4);
				addColumnPathMap(Slo_Upd01_DtlR.$sno4_null_flg, SloRecvIf_Chk01_DtlR.$sno4_null_flg);
				addColumnPathMap(Slo_Upd01_DtlR.$set_itm_grp_no, SloRecvIf_Chk01_DtlR.$set_itm_grp_no);
				addColumnPathMap(Slo_Upd01_DtlR.$ship_rqst_tm, SloRecvIf_Chk01_DtlR.$ship_rqst_tm);
				addColumnPathMap(Slo_Upd01_DtlR.$dlv_rqst_tm, SloRecvIf_Chk01_DtlR.$dlv_rqst_tm);
				addColumnPathMap(Slo_Upd01_DtlR.$sls_schd_dt, SloRecvIf_Chk01_DtlR.$sls_schd_dt);
				addColumnPathMap(Slo_Upd01_DtlR.$accpt_schd_dt, SloRecvIf_Chk01_DtlR.$accpt_schd_dt);
				addColumnPathMap(Slo_Upd01_DtlR.$ship_schd_tm, SloRecvIf_Chk01_DtlR.$ship_schd_tm);
				addColumnPathMap(Slo_Upd01_DtlR.$dlv_schd_tm, SloRecvIf_Chk01_DtlR.$dlv_schd_tm);
				addColumnPathMap(Slo_Upd01_DtlR.$dlv_cd, SloRecvIf_Chk01_DtlR.$dlv_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$dlv_nm, SloRecvIf_Chk01_DtlR.$dlv_nm);
				addColumnPathMap(Slo_Upd01_DtlR.$dlv_cntct_dpt, SloRecvIf_Chk01_DtlR.$dlv_cntct_dpt);
				addColumnPathMap(Slo_Upd01_DtlR.$dlv_cntct_psn, SloRecvIf_Chk01_DtlR.$dlv_cntct_psn);
				addColumnPathMap(Slo_Upd01_DtlR.$dlv_zip_cd, SloRecvIf_Chk01_DtlR.$dlv_zip_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$dlv_addr1, SloRecvIf_Chk01_DtlR.$dlv_addr1);
				addColumnPathMap(Slo_Upd01_DtlR.$dlv_addr2, SloRecvIf_Chk01_DtlR.$dlv_addr2);
				addColumnPathMap(Slo_Upd01_DtlR.$dlv_addr3, SloRecvIf_Chk01_DtlR.$dlv_addr3);
				addColumnPathMap(Slo_Upd01_DtlR.$dlv_addr4, SloRecvIf_Chk01_DtlR.$dlv_addr4);
				addColumnPathMap(Slo_Upd01_DtlR.$dlv_tel, SloRecvIf_Chk01_DtlR.$dlv_tel);
				addColumnPathMap(Slo_Upd01_DtlR.$dlv_fax, SloRecvIf_Chk01_DtlR.$dlv_fax);
				addColumnPathMap(Slo_Upd01_DtlR.$dlv_lg_grp_cd, SloRecvIf_Chk01_DtlR.$dlv_lg_grp_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$pri_prnt_flg, SloRecvIf_Chk01_DtlR.$pri_prnt_flg);
				addColumnPathMap(Slo_Upd01_DtlR.$dest_cd1, SloRecvIf_Chk01_DtlR.$dest_cd1);
				addColumnPathMap(Slo_Upd01_DtlR.$dest_cd2, SloRecvIf_Chk01_DtlR.$dest_cd2);
				addColumnPathMap(Slo_Upd01_DtlR.$dest_cd3, SloRecvIf_Chk01_DtlR.$dest_cd3);
				addColumnPathMap(Slo_Upd01_DtlR.$tdlv_cd, SloRecvIf_Chk01_DtlR.$tdlv_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$tdlv_nm, SloRecvIf_Chk01_DtlR.$tdlv_nm);
				addColumnPathMap(Slo_Upd01_DtlR.$via_dlv_typ, SloRecvIf_Chk01_DtlR.$via_dlv_typ);
				addColumnPathMap(Slo_Upd01_DtlR.$tdlv_cntct_dpt, SloRecvIf_Chk01_DtlR.$tdlv_cntct_dpt);
				addColumnPathMap(Slo_Upd01_DtlR.$tdlv_cntct_psn, SloRecvIf_Chk01_DtlR.$tdlv_cntct_psn);
				addColumnPathMap(Slo_Upd01_DtlR.$tdlv_zip_cd, SloRecvIf_Chk01_DtlR.$tdlv_zip_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$tdlv_addr1, SloRecvIf_Chk01_DtlR.$tdlv_addr1);
				addColumnPathMap(Slo_Upd01_DtlR.$tdlv_addr2, SloRecvIf_Chk01_DtlR.$tdlv_addr2);
				addColumnPathMap(Slo_Upd01_DtlR.$tdlv_addr3, SloRecvIf_Chk01_DtlR.$tdlv_addr3);
				addColumnPathMap(Slo_Upd01_DtlR.$tdlv_addr4, SloRecvIf_Chk01_DtlR.$tdlv_addr4);
				addColumnPathMap(Slo_Upd01_DtlR.$tdlv_tel, SloRecvIf_Chk01_DtlR.$tdlv_tel);
				addColumnPathMap(Slo_Upd01_DtlR.$tdlv_fax, SloRecvIf_Chk01_DtlR.$tdlv_fax);
				addColumnPathMap(Slo_Upd01_DtlR.$tdlv_lg_grp_cd, SloRecvIf_Chk01_DtlR.$tdlv_lg_grp_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$dlv_day_week_typ, SloRecvIf_Chk01_DtlR.$dlv_day_week_typ);
				addColumnPathMap(Slo_Upd01_DtlR.$sls_cststk_flg, SloRecvIf_Chk01_DtlR.$sls_cststk_flg);
				addColumnPathMap(Slo_Upd01_DtlR.$proc_typ, SloRecvIf_Chk01_DtlR.$proc_typ);
				addColumnPathMap(Slo_Upd01_DtlR.$ship_inst_typ, SloRecvIf_Chk01_DtlR.$ship_inst_typ);
				addColumnPathMap(Slo_Upd01_DtlR.$ship_schd_split_typ, SloRecvIf_Chk01_DtlR.$ship_schd_split_typ);
				addColumnPathMap(Slo_Upd01_DtlR.$alloc_scope_typ, SloRecvIf_Chk01_DtlR.$alloc_scope_typ);
				addColumnPathMap(Slo_Upd01_DtlR.$alloc_typ, SloRecvIf_Chk01_DtlR.$alloc_typ);
				addColumnPathMap(Slo_Upd01_DtlR.$not_lg_mix_flg, SloRecvIf_Chk01_DtlR.$not_lg_mix_flg);
				addColumnPathMap(Slo_Upd01_DtlR.$sppl_cd, SloRecvIf_Chk01_DtlR.$sppl_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$maker_cd, SloRecvIf_Chk01_DtlR.$maker_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$alloc_grp_cd, SloRecvIf_Chk01_DtlR.$alloc_grp_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$ship_lg_grp_cd, SloRecvIf_Chk01_DtlR.$ship_lg_grp_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$loc_cd, SloRecvIf_Chk01_DtlR.$loc_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$str_ln_cd, SloRecvIf_Chk01_DtlR.$str_ln_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$lot_no, SloRecvIf_Chk01_DtlR.$lot_no);
				addColumnPathMap(Slo_Upd01_DtlR.$sublot_no, SloRecvIf_Chk01_DtlR.$sublot_no);
				addColumnPathMap(Slo_Upd01_DtlR.$not_lot_mix_flg, SloRecvIf_Chk01_DtlR.$not_lot_mix_flg);
				addColumnPathMap(Slo_Upd01_DtlR.$not_sublot_mix_flg, SloRecvIf_Chk01_DtlR.$not_sublot_mix_flg);
				addColumnPathMap(Slo_Upd01_DtlR.$ver_no, SloRecvIf_Chk01_DtlR.$ver_no);
				addColumnPathMap(Slo_Upd01_DtlR.$ship_term_cd, SloRecvIf_Chk01_DtlR.$ship_term_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$ship_block_flg, SloRecvIf_Chk01_DtlR.$ship_block_flg);
				addColumnPathMap(Slo_Upd01_DtlR.$cst_po_d_no, SloRecvIf_Chk01_DtlR.$cst_po_d_no);
				addColumnPathMap(Slo_Upd01_DtlR.$cst_itm_cd, SloRecvIf_Chk01_DtlR.$cst_itm_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$cst_itm_nm, SloRecvIf_Chk01_DtlR.$cst_itm_nm);
				addColumnPathMap(Slo_Upd01_DtlR.$cst_po_d_rmrks, SloRecvIf_Chk01_DtlR.$cst_po_d_rmrks);
				addColumnPathMap(Slo_Upd01_DtlR.$sls_rsn_cd, SloRecvIf_Chk01_DtlR.$sls_rsn_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$bd_dpt_cd, SloRecvIf_Chk01_DtlR.$bd_dpt_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$sls_upri_req_typ, SloRecvIf_Chk01_DtlR.$sls_upri_req_typ);
				addColumnPathMap(Slo_Upd01_DtlR.$trd_d_rmrks, SloRecvIf_Chk01_DtlR.$trd_d_rmrks);
				addColumnPathMap(Slo_Upd01_DtlR.$not_dt_calc_flg, SloRecvIf_Chk01_DtlR.$not_dt_calc_flg);
				addColumnPathMap(Slo_Upd01_DtlR.$edi_sub_d_char1, SloRecvIf_Chk01_DtlR.$edi_sub_d_char1);
				addColumnPathMap(Slo_Upd01_DtlR.$edi_sub_d_char2, SloRecvIf_Chk01_DtlR.$edi_sub_d_char2);
				addColumnPathMap(Slo_Upd01_DtlR.$edi_sub_d_char3, SloRecvIf_Chk01_DtlR.$edi_sub_d_char3);
				addColumnPathMap(Slo_Upd01_DtlR.$edi_sub_d_char4, SloRecvIf_Chk01_DtlR.$edi_sub_d_char4);
				addColumnPathMap(Slo_Upd01_DtlR.$edi_sub_d_char5, SloRecvIf_Chk01_DtlR.$edi_sub_d_char5);
				addColumnPathMap(Slo_Upd01_DtlR.$edi_sub_d_num1, SloRecvIf_Chk01_DtlR.$edi_sub_d_num1);
				addColumnPathMap(Slo_Upd01_DtlR.$edi_sub_d_dt1, SloRecvIf_Chk01_DtlR.$edi_sub_d_dt1);
				addColumnPathMap(Slo_Upd01_DtlR.$rem_abort_qty , SloRecvIf_Chk01_DtlR.$rem_abort_qty);
				addColumnPathMap(Slo_Upd01_DtlR.$rem_abort_flg , SloRecvIf_Chk01_DtlR.$rem_abort_flg);
				addColumnPathMap(Slo_Upd01_DtlR.$data_lno , SloRecvIf_Chk01_DtlR.$data_lno);
				addColumnPathMap(Slo_Upd01_DtlR.$recv_dt , SloRecvIf_Chk01_DtlR.$recv_dt);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.upd_cntr_not_chk_flg(true);
			}
		}
		
		protected Map_Slo_Upd01_HdrR_MST_SLO_R<Slo_Upd01_HdrR,MST_SLO_R> createMap_Slo_Upd01_HdrR_MST_SLO_R() {
			return new Map_Slo_Upd01_HdrR_MST_SLO_R<Slo_Upd01_HdrR, MST_SLO_R>();
		}

		public class Map_Slo_Upd01_HdrR_MST_SLO_R<D extends Slo_Upd01_HdrR, S extends MST_SLO_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Slo_Upd01_HdrR.$slo_no, MST_SLO_R.$slo_no);
				addColumnPathMap(Slo_Upd01_HdrR.$trd_cd, MST_SLO_R.$trd_cd);
				addColumnPathMap(Slo_Upd01_HdrR.$slo_typ, MST_SLO_R.$slo_typ);
				addColumnPathMap(Slo_Upd01_HdrR.$slo_dt, MST_SLO_R.$slo_dt);
				addColumnPathMap(Slo_Upd01_HdrR.$qtn_no, MST_SLO_R.$qtn_no);
				addColumnPathMap(Slo_Upd01_HdrR.$qtn_rev, MST_SLO_R.$qtn_rev);
				addColumnPathMap(Slo_Upd01_HdrR.$cst_cd, MST_SLO_R.$cst_cd);
				addColumnPathMap(Slo_Upd01_HdrR.$sls_basis_typ, MST_SLO_R.$sls_basis_typ);
				addColumnPathMap(Slo_Upd01_HdrR.$sls_usr_cd, MST_SLO_R.$sls_usr_cd);
				addColumnPathMap(Slo_Upd01_HdrR.$sls_dpt_cd, MST_SLO_R.$sls_dpt_cd);
				addColumnPathMap(Slo_Upd01_HdrR.$assort_typ, MST_SLO_R.$assort_typ);
				addColumnPathMap(Slo_Upd01_HdrR.$trd_cur_cd, MST_SLO_R.$trd_cur_cd);
				addColumnPathMap(Slo_Upd01_HdrR.$xrate_inpt_flg, MST_SLO_R.$xrate_inpt_flg);
				addColumnPathMap(Slo_Upd01_HdrR.$xrate, MST_SLO_R.$xrate);
				addColumnPathMap(Slo_Upd01_HdrR.$ptax_xrate_inpt_flg, MST_SLO_R.$ptax_xrate_inpt_flg);
				addColumnPathMap(Slo_Upd01_HdrR.$ptax_xrate, MST_SLO_R.$ptax_xrate);
				addColumnPathMap(Slo_Upd01_HdrR.$wrk_no, MST_SLO_R.$wrk_no);
				addColumnPathMap(Slo_Upd01_HdrR.$trnspt_cd, MST_SLO_R.$trnspt_cd);
				addColumnPathMap(Slo_Upd01_HdrR.$vssl_flght, MST_SLO_R.$vssl_flght);
				addColumnPathMap(Slo_Upd01_HdrR.$load_port_cd, MST_SLO_R.$load_port_cd);
				addColumnPathMap(Slo_Upd01_HdrR.$etd_dt, MST_SLO_R.$etd_dt);
				addColumnPathMap(Slo_Upd01_HdrR.$dschrg_port_cd, MST_SLO_R.$dschrg_port_cd);
				addColumnPathMap(Slo_Upd01_HdrR.$eta_dt, MST_SLO_R.$eta_dt);
				addColumnPathMap(Slo_Upd01_HdrR.$via_port_cd, MST_SLO_R.$via_port_cd);
				addColumnPathMap(Slo_Upd01_HdrR.$via_schd_dt, MST_SLO_R.$via_schd_dt);
				addColumnPathMap(Slo_Upd01_HdrR.$iv_no, MST_SLO_R.$iv_no);
				addColumnPathMap(Slo_Upd01_HdrR.$adv_ship_ctrl_typ, MST_SLO_R.$adv_ship_ctrl_typ);
				addColumnPathMap(Slo_Upd01_HdrR.$adv_bill_amt, MST_SLO_R.$adv_bill_amt);
				addColumnPathMap(Slo_Upd01_HdrR.$tterm_cd1, MST_SLO_R.$tterm_cd1);
				addColumnPathMap(Slo_Upd01_HdrR.$tterm_rmrks1, MST_SLO_R.$tterm_rmrks1);
				addColumnPathMap(Slo_Upd01_HdrR.$tterm_cd2, MST_SLO_R.$tterm_cd2);
				addColumnPathMap(Slo_Upd01_HdrR.$tterm_rmrks2, MST_SLO_R.$tterm_rmrks2);
				addColumnPathMap(Slo_Upd01_HdrR.$tterm_cd3, MST_SLO_R.$tterm_cd3);
				addColumnPathMap(Slo_Upd01_HdrR.$tterm_rmrks3, MST_SLO_R.$tterm_rmrks3);
				addColumnPathMap(Slo_Upd01_HdrR.$cst_po_no, MST_SLO_R.$cst_po_no);
				addColumnPathMap(Slo_Upd01_HdrR.$ar_dpt_cd, MST_SLO_R.$ar_dpt_cd);
				addColumnPathMap(Slo_Upd01_HdrR.$rcpt_dt, MST_SLO_R.$rcpt_dt);
				addColumnPathMap(Slo_Upd01_HdrR.$rcpt_usr_cd, MST_SLO_R.$rcpt_usr_cd);
				addColumnPathMap(Slo_Upd01_HdrR.$cst_po_rmrks, MST_SLO_R.$cst_po_rmrks);
				addColumnPathMap(Slo_Upd01_HdrR.$trd_rmrks, MST_SLO_R.$trd_rmrks);
				addColumnPathMap(Slo_Upd01_HdrR.$intr_rmrks, MST_SLO_R.$intr_rmrks);
				addColumnPathMap(Slo_Upd01_HdrR.$sub_char1, MST_SLO_R.$sub_char1);
				addColumnPathMap(Slo_Upd01_HdrR.$sub_char2, MST_SLO_R.$sub_char2);
				addColumnPathMap(Slo_Upd01_HdrR.$sub_char3, MST_SLO_R.$sub_char3);
				addColumnPathMap(Slo_Upd01_HdrR.$edi_sub_char1, MST_SLO_R.$edi_sub_char1);
				addColumnPathMap(Slo_Upd01_HdrR.$edi_sub_char2, MST_SLO_R.$edi_sub_char2);
				addColumnPathMap(Slo_Upd01_HdrR.$edi_sub_char3, MST_SLO_R.$edi_sub_char3);
				addColumnPathMap(Slo_Upd01_HdrR.$edi_sub_char4, MST_SLO_R.$edi_sub_char4);
				addColumnPathMap(Slo_Upd01_HdrR.$edi_sub_char5, MST_SLO_R.$edi_sub_char5);
				addColumnPathMap(Slo_Upd01_HdrR.$edi_sub_num1, MST_SLO_R.$edi_sub_num1);
				addColumnPathMap(Slo_Upd01_HdrR.$edi_sub_dt1, MST_SLO_R.$edi_sub_dt1);
				addColumnPathMap(Slo_Upd01_HdrR.$wg_cd, MST_SLO_R.$wg_cd);

			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.aprv_back_flg(false);
				dest.iv_num_flg(false);
				dest.edi_flg(true);
				dest.upd_cntr_not_chk_flg(true);
				dest.is_src_batch_flg(true);
			}
		}
		
		protected Map_Slo_Upd01_DtlR_MST_SLO_D_R<Slo_Upd01_DtlR,MST_SLO_D_R> createMap_Slo_Upd01_DtlR_MST_SLO_D_R() {
			return new Map_Slo_Upd01_DtlR_MST_SLO_D_R<Slo_Upd01_DtlR, MST_SLO_D_R>();
		}

		public class Map_Slo_Upd01_DtlR_MST_SLO_D_R<D extends Slo_Upd01_DtlR, S extends MST_SLO_D_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				
				addColumnPathMap(Slo_Upd01_DtlR.$disp_seq, MST_SLO_D_R.$disp_seq);
				addColumnPathMap(Slo_Upd01_DtlR.$abort_flg, MST_SLO_D_R.$abort_flg);
				addColumnPathMap(Slo_Upd01_DtlR.$slo_d_no, MST_SLO_D_R.$slo_d_no);
				addColumnPathMap(Slo_Upd01_DtlR.$itm_cd, MST_SLO_D_R.$itm_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$itm_sub1, MST_SLO_D_R.$itm_sub1);
				addColumnPathMap(Slo_Upd01_DtlR.$itm_sub2, MST_SLO_D_R.$itm_sub2);
				addColumnPathMap(Slo_Upd01_DtlR.$itm_sub3, MST_SLO_D_R.$itm_sub3);
				addColumnPathMap(Slo_Upd01_DtlR.$itm_nm, MST_SLO_D_R.$itm_nm);
				addColumnPathMap(Slo_Upd01_DtlR.$iv_itm_nm, MST_SLO_D_R.$iv_itm_nm);
				addColumnPathMap(Slo_Upd01_DtlR.$cntry_org_cd, MST_SLO_D_R.$cntry_org_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$vmi_flg, MST_SLO_D_R.$vmi_flg);
				addColumnPathMap(Slo_Upd01_DtlR.$trd_unit_cd, MST_SLO_D_R.$trd_unit_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$trd_unit_qty, MST_SLO_D_R.$trd_unit_qty);
				addColumnPathMap(Slo_Upd01_DtlR.$trd_cur_upri, MST_SLO_D_R.$trd_cur_upri);
				addColumnPathMap(Slo_Upd01_DtlR.$interim_flg, MST_SLO_D_R.$interim_flg);
				addColumnPathMap(Slo_Upd01_DtlR.$upri_not_tgt_flg, MST_SLO_D_R.$upri_not_tgt_flg);
				addColumnPathMap(Slo_Upd01_DtlR.$cost_upri, MST_SLO_D_R.$cost_upri);
				addColumnPathMap(Slo_Upd01_DtlR.$trd_cur_dscnt_amt, MST_SLO_D_R.$trd_cur_dscnt_amt);
				addColumnPathMap(Slo_Upd01_DtlR.$dscnt_rsn_cd, MST_SLO_D_R.$dscnt_rsn_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$iv_upri, MST_SLO_D_R.$iv_upri);
				addColumnPathMap(Slo_Upd01_DtlR.$tax_fix_flg, MST_SLO_D_R.$tax_fix_flg);
				addColumnPathMap(Slo_Upd01_DtlR.$tax_cd, MST_SLO_D_R.$tax_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$wtax_rate, MST_SLO_D_R.$wtax_rate);
				addColumnPathMap(Slo_Upd01_DtlR.$bill_crryovr_times, MST_SLO_D_R.$bill_crryovr_times);
				addColumnPathMap(Slo_Upd01_DtlR.$gd_cd, MST_SLO_D_R.$gd_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$sno1, MST_SLO_D_R.$sno1);
				addColumnPathMap(Slo_Upd01_DtlR.$sno1_null_flg, MST_SLO_D_R.$sno1_null_flg);
				addColumnPathMap(Slo_Upd01_DtlR.$sno2, MST_SLO_D_R.$sno2);
				addColumnPathMap(Slo_Upd01_DtlR.$sno2_null_flg, MST_SLO_D_R.$sno2_null_flg);
				addColumnPathMap(Slo_Upd01_DtlR.$sno3, MST_SLO_D_R.$sno3);
				addColumnPathMap(Slo_Upd01_DtlR.$sno3_null_flg, MST_SLO_D_R.$sno3_null_flg);
				addColumnPathMap(Slo_Upd01_DtlR.$sno4, MST_SLO_D_R.$sno4);
				addColumnPathMap(Slo_Upd01_DtlR.$sno4_null_flg, MST_SLO_D_R.$sno4_null_flg);
				addColumnPathMap(Slo_Upd01_DtlR.$set_itm_grp_no, MST_SLO_D_R.$set_itm_grp_no);
				addColumnPathMap(Slo_Upd01_DtlR.$ship_rqst_tm, MST_SLO_D_R.$ship_rqst_tm);
				addColumnPathMap(Slo_Upd01_DtlR.$dlv_rqst_tm, MST_SLO_D_R.$dlv_rqst_tm);
				addColumnPathMap(Slo_Upd01_DtlR.$sls_schd_dt, MST_SLO_D_R.$sls_schd_dt);
				addColumnPathMap(Slo_Upd01_DtlR.$accpt_schd_dt, MST_SLO_D_R.$accpt_schd_dt);
				addColumnPathMap(Slo_Upd01_DtlR.$dlv_cd, MST_SLO_D_R.$dlv_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$dlv_nm, MST_SLO_D_R.$dlv_nm);
				addColumnPathMap(Slo_Upd01_DtlR.$dlv_cntct_dpt, MST_SLO_D_R.$dlv_cntct_dpt);
				addColumnPathMap(Slo_Upd01_DtlR.$dlv_cntct_psn, MST_SLO_D_R.$dlv_cntct_psn);
				addColumnPathMap(Slo_Upd01_DtlR.$dlv_zip_cd, MST_SLO_D_R.$dlv_zip_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$dlv_addr1, MST_SLO_D_R.$dlv_addr1);
				addColumnPathMap(Slo_Upd01_DtlR.$dlv_addr2, MST_SLO_D_R.$dlv_addr2);
				addColumnPathMap(Slo_Upd01_DtlR.$dlv_addr3, MST_SLO_D_R.$dlv_addr3);
				addColumnPathMap(Slo_Upd01_DtlR.$dlv_addr4, MST_SLO_D_R.$dlv_addr4);
				addColumnPathMap(Slo_Upd01_DtlR.$dlv_tel, MST_SLO_D_R.$dlv_tel);
				addColumnPathMap(Slo_Upd01_DtlR.$dlv_fax, MST_SLO_D_R.$dlv_fax);
				addColumnPathMap(Slo_Upd01_DtlR.$dlv_lg_grp_cd, MST_SLO_D_R.$dlv_lg_grp_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$pri_prnt_flg, MST_SLO_D_R.$pri_prnt_flg);
				addColumnPathMap(Slo_Upd01_DtlR.$dest_cd1, MST_SLO_D_R.$dest_cd1);
				addColumnPathMap(Slo_Upd01_DtlR.$dest_cd2, MST_SLO_D_R.$dest_cd2);
				addColumnPathMap(Slo_Upd01_DtlR.$dest_cd3, MST_SLO_D_R.$dest_cd3);
				addColumnPathMap(Slo_Upd01_DtlR.$tdlv_cd, MST_SLO_D_R.$tdlv_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$tdlv_nm, MST_SLO_D_R.$tdlv_nm);
				addColumnPathMap(Slo_Upd01_DtlR.$via_dlv_typ, MST_SLO_D_R.$via_dlv_typ);
				addColumnPathMap(Slo_Upd01_DtlR.$tdlv_cntct_dpt, MST_SLO_D_R.$tdlv_cntct_dpt);
				addColumnPathMap(Slo_Upd01_DtlR.$tdlv_cntct_psn, MST_SLO_D_R.$tdlv_cntct_psn);
				addColumnPathMap(Slo_Upd01_DtlR.$tdlv_zip_cd, MST_SLO_D_R.$tdlv_zip_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$tdlv_addr1, MST_SLO_D_R.$tdlv_addr1);
				addColumnPathMap(Slo_Upd01_DtlR.$tdlv_addr2, MST_SLO_D_R.$tdlv_addr2);
				addColumnPathMap(Slo_Upd01_DtlR.$tdlv_addr3, MST_SLO_D_R.$tdlv_addr3);
				addColumnPathMap(Slo_Upd01_DtlR.$tdlv_addr4, MST_SLO_D_R.$tdlv_addr4);
				addColumnPathMap(Slo_Upd01_DtlR.$tdlv_tel, MST_SLO_D_R.$tdlv_tel);
				addColumnPathMap(Slo_Upd01_DtlR.$tdlv_fax, MST_SLO_D_R.$tdlv_fax);
				addColumnPathMap(Slo_Upd01_DtlR.$tdlv_lg_grp_cd, MST_SLO_D_R.$tdlv_lg_grp_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$dlv_day_week_typ, MST_SLO_D_R.$dlv_day_week_typ);
				addColumnPathMap(Slo_Upd01_DtlR.$sls_cststk_flg, MST_SLO_D_R.$sls_cststk_flg);
				addColumnPathMap(Slo_Upd01_DtlR.$proc_typ, MST_SLO_D_R.$proc_typ);
				addColumnPathMap(Slo_Upd01_DtlR.$ship_inst_typ, MST_SLO_D_R.$ship_inst_typ);
				addColumnPathMap(Slo_Upd01_DtlR.$ship_schd_split_typ, MST_SLO_D_R.$ship_schd_split_typ);
				addColumnPathMap(Slo_Upd01_DtlR.$alloc_scope_typ, MST_SLO_D_R.$alloc_scope_typ);
				addColumnPathMap(Slo_Upd01_DtlR.$alloc_typ, MST_SLO_D_R.$alloc_typ);
				addColumnPathMap(Slo_Upd01_DtlR.$rqst_to_loc_cd, MST_SLO_D_R.$rqst_to_loc_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$sppl_cd, MST_SLO_D_R.$sppl_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$maker_cd, MST_SLO_D_R.$maker_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$wg_rqst_cnt_rmrks, MST_SLO_D_R.$wg_rqst_cnt_rmrks);
				addColumnPathMap(Slo_Upd01_DtlR.$alloc_grp_cd, MST_SLO_D_R.$alloc_grp_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$ship_lg_grp_cd, MST_SLO_D_R.$ship_lg_grp_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$loc_cd, MST_SLO_D_R.$loc_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$str_ln_cd, MST_SLO_D_R.$str_ln_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$lot_no, MST_SLO_D_R.$lot_no);
				addColumnPathMap(Slo_Upd01_DtlR.$sublot_no, MST_SLO_D_R.$sublot_no);
				addColumnPathMap(Slo_Upd01_DtlR.$ver_no, MST_SLO_D_R.$ver_no);
				addColumnPathMap(Slo_Upd01_DtlR.$ship_term_cd, MST_SLO_D_R.$ship_term_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$ship_cnt_rmrks, MST_SLO_D_R.$ship_cnt_rmrks);
				addColumnPathMap(Slo_Upd01_DtlR.$cst_po_d_no, MST_SLO_D_R.$cst_po_d_no);
				addColumnPathMap(Slo_Upd01_DtlR.$cst_itm_cd, MST_SLO_D_R.$cst_itm_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$cst_itm_nm, MST_SLO_D_R.$cst_itm_nm);
				addColumnPathMap(Slo_Upd01_DtlR.$cst_po_d_rmrks, MST_SLO_D_R.$cst_po_d_rmrks);
				addColumnPathMap(Slo_Upd01_DtlR.$sls_rsn_cd, MST_SLO_D_R.$sls_rsn_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$bd_dpt_cd, MST_SLO_D_R.$bd_dpt_cd);
				addColumnPathMap(Slo_Upd01_DtlR.$sls_upri_req_typ, MST_SLO_D_R.$sls_upri_req_typ);
				addColumnPathMap(Slo_Upd01_DtlR.$trd_d_rmrks, MST_SLO_D_R.$trd_d_rmrks);
				addColumnPathMap(Slo_Upd01_DtlR.$intr_rmrks, MST_SLO_D_R.$intr_rmrks);
				addColumnPathMap(Slo_Upd01_DtlR.$sub_char1, MST_SLO_D_R.$sub_char1);
				addColumnPathMap(Slo_Upd01_DtlR.$sub_char2, MST_SLO_D_R.$sub_char2);
				addColumnPathMap(Slo_Upd01_DtlR.$sub_char3, MST_SLO_D_R.$sub_char3);
				addColumnPathMap(Slo_Upd01_DtlR.$qtn_d_no, MST_SLO_D_R.$qtn_d_no);
				addColumnPathMap(Slo_Upd01_DtlR.$edi_sub_d_char1, MST_SLO_D_R.$edi_sub_d_char1);
				addColumnPathMap(Slo_Upd01_DtlR.$edi_sub_d_char2, MST_SLO_D_R.$edi_sub_d_char2);
				addColumnPathMap(Slo_Upd01_DtlR.$edi_sub_d_char3, MST_SLO_D_R.$edi_sub_d_char3);
				addColumnPathMap(Slo_Upd01_DtlR.$edi_sub_d_char4, MST_SLO_D_R.$edi_sub_d_char4);
				addColumnPathMap(Slo_Upd01_DtlR.$edi_sub_d_char5, MST_SLO_D_R.$edi_sub_d_char5);
				addColumnPathMap(Slo_Upd01_DtlR.$edi_sub_d_num1, MST_SLO_D_R.$edi_sub_d_num1);
				addColumnPathMap(Slo_Upd01_DtlR.$edi_sub_d_dt1, MST_SLO_D_R.$edi_sub_d_dt1);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.upd_cntr_not_chk_flg(true);
			}
		}
		
		protected Map_SlsUpri_Sprt01_DtlR_SloRecvIf_Chk01_DtlR<SlsUpri_Sprt01_DtlR,SloRecvIf_Chk01_DtlR> createMap_SlsUpri_Sprt01_DtlR_SloRecvIf_Chk01_DtlR() {
			return new Map_SlsUpri_Sprt01_DtlR_SloRecvIf_Chk01_DtlR<SlsUpri_Sprt01_DtlR, SloRecvIf_Chk01_DtlR>();
		}

		public class Map_SlsUpri_Sprt01_DtlR_SloRecvIf_Chk01_DtlR<D extends SlsUpri_Sprt01_DtlR, S extends SloRecvIf_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$peg_no, SloRecvIf_Chk01_DtlR.$peg_no);
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$wg_cd, SloRecvIf_Chk01_DtlR.$dpt_wg_cd);
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$itm_cd, SloRecvIf_Chk01_DtlR.$itm_cd);
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$itm_sub1, SloRecvIf_Chk01_DtlR.$itm_sub1);
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$itm_sub2, SloRecvIf_Chk01_DtlR.$itm_sub2);
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$itm_sub3, SloRecvIf_Chk01_DtlR.$itm_sub3);
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$cst_cd, SloRecvIf_Chk01_DtlR.$cst_cd);
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$dlv_cd, SloRecvIf_Chk01_DtlR.$dlv_cd);
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$unit_cd, SloRecvIf_Chk01_DtlR.$trd_unit_cd);
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$qty, SloRecvIf_Chk01_DtlR.$trd_unit_qty);
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$cur_cd, SloRecvIf_Chk01_DtlR.$trd_cur_cd);
				addColumnPathMap(SlsUpri_Sprt01_DtlR.$dt, SloRecvIf_Chk01_DtlR.$slo_dt);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.sls_upri_flg(true);
				dest.dest_cd1(src.slo().dest_cd1());
				dest.dest_cd2(src.slo().dest_cd2());
				dest.dest_cd3(src.slo().dest_cd3());
				
				if (MAC_SLS_UPRI_REQ_TYP.isSLO_DT(src.sls_upri_req_typ())) {
					dest.dt(src.slo_dt());
				}
				else if (MAC_SLS_UPRI_REQ_TYP.isRQST_DLV_DT(src.sls_upri_req_typ())) {
					dest.dt(src.dlv_rqst_tm());
				}
				else if (MAC_SLS_UPRI_REQ_TYP.isSCHD_SLS_DT(src.sls_upri_req_typ())) {
					dest.dt(src.sls_schd_dt());
				}
				dest.not_err_flg(true);
				dest.grp_no(src.getStringNE("grp_no"));
			}
		}
	}
	
	protected Map_MSW_SHIP_SCHD_DT_CALC_R_SloRecvIf_Chk01_DtlR<MSW_SHIP_SCHD_DT_CALC_R, SloRecvIf_Chk01_DtlR> createMap_MSW_SHIP_SCHD_DT_CALC_R_SloRecvIf_Chk01_DtlR() {
		return new Map_MSW_SHIP_SCHD_DT_CALC_R_SloRecvIf_Chk01_DtlR<MSW_SHIP_SCHD_DT_CALC_R, SloRecvIf_Chk01_DtlR>();
	}

	public class Map_MSW_SHIP_SCHD_DT_CALC_R_SloRecvIf_Chk01_DtlR<D extends MSW_SHIP_SCHD_DT_CALC_R, S extends SloRecvIf_Chk01_DtlR>
			extends MCRowMapper<D, S> {
		
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_term_cd, SloRecvIf_Chk01_DtlR.$ship_term_cd);
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$dlv_day_week_typ, SloRecvIf_Chk01_DtlR.$dlv_day_week_typ);
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_rqst_tm, SloRecvIf_Chk01_DtlR.$ship_rqst_tm);
			addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_inst_typ, SloRecvIf_Chk01_DtlR.$ship_inst_typ);
		}
		
		@Override
		public void valueCopy(D dest, S src) {
			dest.peg_no(src.peg_no());
			if (isNull(src.tdlv_cd())){
				dest.ship_to_id_typ(MSC_SHIP_TO_ID_TYP.DLV.value());
				dest.ship_to_id_cd(src.dlv_cd());
				dest.ship_to_lg_grp_cd(src.dlv_lg_grp_cd());
			}else{
				dest.ship_to_id_typ(MSC_SHIP_TO_ID_TYP.TDLV.value());
				dest.ship_to_id_cd(src.tdlv_cd());
				dest.ship_to_lg_grp_cd(src.tdlv_lg_grp_cd());
			}
			
			if (MAC_VIA_DLV_TYP.isVIA(src.via_dlv_typ())){
				dest.dlv_rqst_tm(null);
			}
			else {
				dest.dlv_rqst_tm(src.dlv_rqst_tm());
			}
			dest.cl_time_chk_flg(true);
			dest.ship_dt_chk_flg(true);
			dest.base_dt(src.slo_dt());
			dest.ship_cal_cd_chk_flg(true);
			dest.early_ship_dt_add_days_chk_flg(true);
		}
	}
	
	/**
	 * 処理結果区分にエラーを設定
	 * @param sloRecvIfR 受注受信ＩＦ
	 */
	protected void setErrSts(MST_SLO_RECV_IF_R sloRecvIfR) {

		sloRecvIfR.exe_sts_typ(MAC_EXE_STS_TYP.ERR.value());
		setErrSet(sloRecvIfR);
	}
	
	/**
	 * 同一取込グループでエラーが発生した場合に、エラーリスト設定に追加する。
	 * @param sloRecvIfR 受注受信ＩＦ
	 */
	protected void setErrSet(MST_SLO_RECV_IF_R sloRecvIfR) {
		
		List<String> lst = createErrSetKey(sloRecvIfR);
		if (!object(CLAZZ)._errSet.contains(lst)) {
			object(CLAZZ)._errSet.add(lst);
		}
	}
	
	/**
	 * 同一取込単位で先に処理したデータでエラーが発生したかどうか。
	 * @param sloRecvIfR 受注受信ＩＦ
	 * @return エラーが発生した場合はtrue
	 */
	protected boolean isPrevErr(MST_SLO_RECV_IF_R sloRecvIfR) {
		
		return object(CLAZZ)._errSet.contains(createErrSetKey(sloRecvIfR));
	}
	
	/**
	 * 同一取込グループのキー項目のリストを作成する。
	 * @param sloRecvIfR 受注受信ＩＦ
	 * @return エラーキー項目のリスト
	 */
	protected List<String> createErrSetKey(MST_SLO_RECV_IF_R sloRecvIfR) {
		
		List<String> lst = new ArrayList<String>();
		if (!isNull(sloRecvIfR)) {
			lst.add(sloRecvIfR.cst_cd());
			lst.add(sloRecvIfR.cst_po_no());
		}
		return lst;
	}

	//FMCB CUSTOM END
}