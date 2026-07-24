package mcframe.serverMSLA.MSLAL9010;

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
import mcframe.serverPFUD.PFUDL0040.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMBBE.MBBEL5010.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSLA.MSLAL9010.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBG.MSBGL5180.*;
import mcframe.serverFXBA.FXBAL0120.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.serverFXUC.FXUCL0170.FXUCL_BeforeAfterValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;

import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import java.util.*;
import java.util.Map.Entry;
import mcframe.serverCore.requester.MCServerThreadManager;
import mcframe.serverCore.resource.MCConst;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverCore.mcjdbc.MCSavepoint;
import mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil;
import mcframe.serverPF.dbc.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_RcvRecvIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_RcvRecvIfService_MC extends MSLAL_RcvRecvIfService_MC_A{
	//FMCB CUSTOM START
	protected static final Class<MSLAL_RcvRecvIfService> CLAZZ = MSLAL_RcvRecvIfService.class;
	
	// エラーになった外部入金ＮОを保持する。
	protected Set<List<String>> _errSet = new HashSet<List<String>>();
	
	/**
	 * 入金登録サービスのチェック01オペレーション
	 */
	protected MSBGL_RcvRegService.Rcv_Chk01 _chk01Serv = MSBGL_RcvRegService.crtRcv_Chk01();
	
	/**
	 * 入金登録サービスのチェック02オペレーション
	 */
	protected MSBGL_RcvRegService.Rcv_Chk02 _chk02Serv = MSBGL_RcvRegService.crtRcv_Chk02();
	
	
	/**
	 * RcvRecvIf_Upd01オペレーション.<p>
	 *
	 * 入金受信ＩＦ取込を行う（リアルタイム取込から呼び出される）。<br>
	 */
	public class RcvRecvIf_Upd01 extends MSLAL_RcvRecvIfService_MC_A.RcvRecvIf_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			callRcvRecvIfUpd02();
		}
		
		/**
		 * RcvRecvIf_Upd02を実行する。
		 */
		protected void callRcvRecvIfUpd02() {
			MSLAL_RcvRecvIfService.RcvRecvIf_Upd02 ope = MSLAL_RcvRecvIfService.crtRcvRecvIf_Upd02();
			setAll(ope.up0(), up0(), createMapForUpd02());
			ope.exec();
		}
		
		protected MapForUpd02<IfDataImp_Upd01_DtlR, Upd01_DtlR> createMapForUpd02() {
			return new MapForUpd02<IfDataImp_Upd01_DtlR, Upd01_DtlR>();
		}
		
		public class MapForUpd02<D extends IfDataImp_Upd01_DtlR, S extends Upd01_DtlR> extends MCRowMapper<D,S>{
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
	 * RcvRecvIf_Upd02オペレーション.<p>
	 *
	 * 入金受信ＩＦ取込を行う（ＩＦデータ確認、および入金受信ＩＦ取込バッチから呼び出される）。<br>
	 */
	public class RcvRecvIf_Upd02 extends MSLAL_RcvRecvIfService_MC_A.RcvRecvIf_Upd02 {
		
		protected MCList<MST_RCV_RECV_IF_R> _srchKeyL;
		protected MST_RCV_RECV_IF_R _srchKeyL_t;
		protected MCQueryApiBuilder _srchKeyL_bldr;
		
		/** 対象件数 **/
		protected int _totalNum = 0;
		
		/** 正常終了件数 **/
		protected int _okNum = 0;
		
		/** エラー件数 **/
		protected int _errNum = 0;
		
		/** スキップ件数 **/
		protected int _skipNum = 0;
		
		/** 例外発生ＦＬＧ **/
		protected boolean _exceptionFlg;
		
		/** ロガー作成ＦＬＧ **/
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
				exe();
			} catch (Exception ex) {
				handleEx(ex);
			} finally {
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
			_srchKeyL = MCList.create(MST_RCV_RECV_IF_R.class);
			_srchKeyL_t = MST_RCV_RECV_IF_R.create("T");
			_srchKeyL_bldr = MCQueryApiBuilder.create(_srchKeyL_t);
		}
		
		/**
		 * 開始ログを出力する。
		 */
		protected void writeStartLog() {
			logger().writeStartLog(MSLAL0600);
			pushStartLog(logger());
		}
		
		/**
		 * 入金受信ＩＦデータを取得する。
		 */
		protected void preSrch() {
			PFT_SDRV_IF_R sdrv = PFT_SDRV_IF_R.create("SDRV");
			MAM_FB_IF_CTL_R S1IFCTL = MAM_FB_IF_CTL_R.create("IFCTL");

			_srchKeyL_bldr.setSelect(_srchKeyL_t.ext_data_no);
			_srchKeyL_bldr.addSelect(_srchKeyL_t.rcst_cd);
			_srchKeyL_bldr.addSelect(_srchKeyL_t.ext_rcv_no);
			_srchKeyL_bldr.addSelect(_srchKeyL_t.data_lno);

			_srchKeyL_bldr.addLeftOuterJoin(sdrv, _srchKeyL_t.data_no.eq(sdrv.data_no));
			_srchKeyL_bldr.setWhere(value(0).eq(value(0)));
			_srchKeyL_bldr.addWhereWithAnd(_srchKeyL_t.imp_flg.eq(value(true)));
			_srchKeyL_bldr.addWhereWithAnd(bracket(sdrv.sdrv_sts_typ.isNull()
					.or(sdrv.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.RECV_CONV_OK.value()))))); //送受信ＩＦ
			_srchKeyL_bldr.addWhereWithAnd(exists(subQuery()
					.select(value("X"))
					.from(S1IFCTL)
					.where(S1IFCTL.if_proc_typ.eq(value(MAC_IF_PROC_TYP.RCV_RECV.value()))
							.and(bracket(_srchKeyL_t.rcst_cd.isNotNull()
									.and(_srchKeyL_t.rcst_cd.eq(S1IFCTL.bp_cd)
											.or(S1IFCTL.bp_cd.isNull()
													.and(S1IFCTL.bp_cd_null_flg.eq(value(false))))))
									.or(_srchKeyL_t.rcst_cd.isNull()
											.and(S1IFCTL.bp_cd.isNull())
											.and(S1IFCTL.bp_cd_null_flg.eq(value(true)))))
							.and(S1IFCTL.ar_sttl_typ.eq(_srchKeyL_t.ar_sttl_typ)
									.or(S1IFCTL.ar_sttl_typ.isNull()))
							.and(S1IFCTL.bank_cd.eq(_srchKeyL_t.bank_cd)
									.or(S1IFCTL.bank_cd.isNull()))
							.and(S1IFCTL.bank_ac_cd.eq(_srchKeyL_t.bank_ac_cd)
									.or(S1IFCTL.bank_ac_cd.isNull()))
							.and(S1IFCTL.st_dt.lte(_srchKeyL_t.recv_dt))
							.and(S1IFCTL.end_dt.gte(_srchKeyL_t.recv_dt)))));
			setOrderBy();
			// データＮＯが電文で渡された場合
			if (!up0().isEmpty()) {
				_srchKeyL_bldr.addWhereWithCutOffAnd(
						bracket(_srchKeyL_t.data_no.eq(bind("data_no"))));
				_srchKeyL_bldr.addWhereWithCutOffAnd(
						bracket(_srchKeyL_t.ext_data_no.eq(bind("ext_data_no"))));
				_srchKeyL_bldr.addWhereWithCutOffAnd(
						bracket(_srchKeyL_t.ext_data_lno.eq(bind("ext_data_lno"))));
				_srchKeyL_bldr.addWhereWithCutOffAnd(
						bracket(_srchKeyL_t.ext_sys_cd.eq(bind("ext_sys_cd"))));
				_srchKeyL_bldr.addWhereWithCutOffAnd(
						bracket(_srchKeyL_t.rcst_cd.eq(bind("bp_cd"))));
				dbSelect("MSLAL9010_MST_RCV_RECV_IF_S01", _srchKeyL, _srchKeyL_bldr, up0());
			}
			else {
				dbSelect("MSLAL9010_MST_RCV_RECV_IF_S02", _srchKeyL, _srchKeyL_bldr);
			}
		}
		
		/**
		 * 外部システムＣＤが異なればext_data_noが同じ可能性があるので、ソート順の最初に外部システムＣＤを指定する。
		 */
		protected void setOrderBy() {
			_srchKeyL_bldr.addOrderByAsc(_srchKeyL_t.ext_sys_cd, _srchKeyL_t.ext_data_no);
		}
		
		/**
		 * スレッドを分割し、各スレッドごとにRcvRecvIf_Upd03を実行する。
		 */
		protected void exe() {
			int no = 0;
			MSLAL_RcvRecvIfService.RcvRecvIf_Upd03 upd03 = null;
			List<MSLAL_RcvRecvIfService.RcvRecvIf_Upd03> opeL = new ArrayList<MSLAL_RcvRecvIfService.RcvRecvIf_Upd03>();

			for (MCList<MST_RCV_RECV_IF_R> grpL : _srchKeyL.groupList("rcst_cd")) {
				upd03 = MSLAL_RcvRecvIfService.crtRcvRecvIf_Upd03();
				upd03._no = ++no;
				setAll(upd03.up0(), grpL, createMapForUpd03());
				
				opeL.add(upd03);
			}
			
			if (!opeL.isEmpty()) {
				if (MCServerThreadManager.getLimitThreadSize() <= 1) {
					MCServerThreadManager.setUseMainDBTran(true);
					MCServerThreadManager.invokeAndWait(1, opeL, FXBAL_BatchLogManager.class);
				} else {
					MCServerThreadManager.setCommitAndRollback(true);
					// 件数の多いスレッドを優先に実行する。
					Collections.sort(opeL, new Comparator<MSLAL_RcvRecvIfService.RcvRecvIf_Upd03>() {
						public int compare(MSLAL_RcvRecvIfService.RcvRecvIf_Upd03 o1, MSLAL_RcvRecvIfService.RcvRecvIf_Upd03 o2) {
							return (o1.up0().size() - o2.up0().size()) * -1; // 降順
						}
					});
					MCServerThreadManager.invokeAndWait(opeL, FXBAL_BatchLogManager.class);
				}
				
				for (MSLAL_RcvRecvIfService.RcvRecvIf_Upd03 ope : opeL) {
					_totalNum += ope.down0().total_num().intValue();
					_okNum += ope.down0().ok_num().intValue();
					_errNum += ope.down0().err_num().intValue();
					_skipNum += ope.down0().skip_num().intValue();
				}
			}
		}
		
		/**
		 * 例外処理
		 */
		protected void handleEx(Exception ex) {
			MCException mcex;
			
			if (ex instanceof MCException) {
				mcex = (MCException) ex;
			} else {
				mcex = new MCException(ex);
			}
			
			logger().writeProcessLog(mcex);
			_exceptionFlg = true;
			
			throw mcex;
		}
		
		/**
		 * 終了ログを出力する。
		 */
		protected void writeEndLog() {
			if (_errNum > 0 || _exceptionFlg) {
				logger().writeProcessLog(MAUDL0009);
				MCMessagePool.add(MAUDL0009);
				pushErrorLog(logger());
			} else if (_totalNum == 0) {
				logger().writeProcessLog(MAUDL0008);
				MCMessagePool.add(MAUDL0008);
			}
			
			logger().writeEndLog(MSLAL0601, _totalNum, _okNum, _errNum, _skipNum);
			pushEndLog(logger());
			
			// Loggerを新規作成した場合（呼出元からLoggerを引き継がない場合）のみクローズ
			if (_crtNewLogger) {
				logger().close();
			}
		}
		
		protected MapForUpd03<RcvRecvIf_Upd03_DtlR, MST_RCV_RECV_IF_R> createMapForUpd03() {
			return new MapForUpd03<RcvRecvIf_Upd03_DtlR, MST_RCV_RECV_IF_R>();
		}
		
		public class MapForUpd03<D extends RcvRecvIf_Upd03_DtlR, S extends MST_RCV_RECV_IF_R> extends MCRowMapper<D, S> {
			@Override
			public void valueCopy(D dest, S src) {
				dest.rcv(src);
			}
		}
	}
	
	/**
	 * RcvRecvIf_Upd03オペレーション.<p>
	 *
	 * 入金受信ＩＦ取込を行う（マルチスレッド実行用）。<br>
	 */
	public class RcvRecvIf_Upd03 extends MSLAL_RcvRecvIfService_MC_A.RcvRecvIf_Upd03 {
		
		protected FXBAL_BatchLogger _logger = null;
		
		protected int _no = 0;
		
		protected int _loopCnt = MCConst.app.getInteger("MS.MSLAL9010.loop_size", 100);
		
		protected MSLAL_RcvRecvIfService.RcvRecvIf_Upd04 _ope = MSLAL_RcvRecvIfService.crtRcvRecvIf_Upd04();
		
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
			
			MCList<MST_RCV_RECV_IF_R> tgtL = MCList.create(MST_RCV_RECV_IF_R.class);
			MST_RCV_RECV_IF_R oldR = MST_RCV_RECV_IF_R.create();
			
			for (RcvRecvIf_Upd03_DtlR dtlR : up0()) {
				MST_RCV_RECV_IF_R keyR = dtlR.rcv();
				if (isNextData(oldR, keyR)) {
					if (!tgtL.isEmpty() && _loopCnt <= cnt) {
						callRcvRecvIfUpd04(tgtL);
						cnt = 0;
						tgtL.clear();
					}
				}
				oldR = keyR;
				cnt++;
				tgtL.add(keyR);
			}
			
			if (!tgtL.isEmpty()) {
				callRcvRecvIfUpd04(tgtL);
			}
		}
		
		/**
		 * RcvRecvIf_Upd04を実行する。
		 * @param rcvRecvIfL 入金受信ＩＦ
		 */
		protected void callRcvRecvIfUpd04(MCList<MST_RCV_RECV_IF_R> rcvRecvIfL) {
			crtRcvRecvIfWk(rcvRecvIfL);
			_ope.up0().clear();
			
			MCList<MST_RCV_RECV_IF_R> exeL = srchLockRcvRecvIf();
			Set<List<String>> afterExtDataSet = srchAfterExtData(exeL);
			MCList<MST_RCV_RECV_IF_R> skipL = MCList.create(MST_RCV_RECV_IF_R.class);
			
			RcvRecvIf_Chk01_CndR upR = null;
			
			for (MST_RCV_RECV_IF_R exeR : exeL) {
				
				// 同一の外部システムＣＤ、外部入金ＮＯでエラーが発生している場合、それ以降のデータは処理しない
				if (isPrevErr(exeR)) {
					setErrSts(exeR);
					MCMessagePool.add(exeR, null, MSLAL0604, exeR.data_no(), exeR.data_lno(), exeR.ext_sys_cd(), exeR.ext_rcv_no());
					skipL.add(exeR);
				}
				// 同一の外部システムＣＤ、外部入金ＮＯで、外部システムデータＮＯが当該行の値より大きいデータが既に処理されている場合、スキップする
				else if (isOkSkip(exeR, afterExtDataSet)) {
					setSkipSts(exeR);
					MCMessagePool.add(exeR, null, MSLAL0605, exeR.data_no(), exeR.data_lno(),  exeR.ext_sys_cd(), exeR.ext_rcv_no());
					skipL.add(exeR);
				}
				else {
					upR = RcvRecvIf_Chk01_CndR.create();
					upR.rcv(exeR);
					upR.setParamIndex(exeR.getParamIndex());
					upR.setParamRowIndex(exeR.getParamRowIndex());
					_ope.up0().add(upR);
				}
				
			}
			
			if (!_ope.up0().isEmpty()) {
				_ope.exec();
			}
			
			mergeExeRslt(skipL);
			
			afterCall(exeL);
			delRcvRecvIfWk(rcvRecvIfL);
		}
		
		/**
		 * 処理しなかったデータからダミーの下り電文を作成する
		 */
		protected void mergeExeRslt(MCList<MST_RCV_RECV_IF_R> skipL) {
			for (MST_RCV_RECV_IF_R skipR : skipL) {
				RcvRecvIf_Chk01_CndR r = _ope.down0().createRow();
				r.rcv(skipR);
				_ope.down0().add(r);
			}
		}
		
		/**
		 * 同一キーで取込対象より新しいかつ処理済みのデータを取得する。
		 * @param exeL 取込対象リスト
		 * @return 処理済みデータリスト
		 */
		protected Set<List<String>> srchAfterExtData(MCList<MST_RCV_RECV_IF_R> exeL) {
			MCList<MST_RCV_RECV_IF_R> afterL = MCList.create(MST_RCV_RECV_IF_R.class);
			MST_RCV_RECV_IF_R t = MST_RCV_RECV_IF_R.create("T");
			MCQueryApiBuilder afterL_bldr = MCQueryApiBuilder.create(t);
			MST_RCV_RECV_IF_R S1ST = MST_RCV_RECV_IF_R.create("ST");

			afterL_bldr.setSelect(t.ext_sys_cd, t.ext_rcv_no);

			afterL_bldr.addConstWhereWithAnd(exists(subQuery()
					.select(value("X"))
					.from(S1ST)
					.where(t.ext_data_no.lt(S1ST.ext_data_no)
							.and(t.ext_rcv_no.eq(S1ST.ext_rcv_no))
							.and(t.ext_sys_cd.eq(S1ST.ext_sys_cd))
							.and(S1ST.exe_sts_typ.in(value(MAC_EXE_STS_TYP.OK.value()),
									value(MAC_EXE_STS_TYP.SKP.value()))))));
			dbSelectColumn("MSLAL9010_MST_RCV_RECV_IF_S03", afterL, afterL_bldr, exeL,
					MST_RCV_RECV_IF_R.$data_lno);

			Set<List<String>> set = new HashSet<List<String>>();
			for (MST_RCV_RECV_IF_R afterR : afterL) {
				List<String> list = createErrSetKey(afterR);
				if (!set.contains(list)) {
					set.add(list);
				}
			}
			return set;
		}
		
		/**
		 * ワークテーブルにデータを登録する。
		 * @param rcvRecvIfL
		 */
		protected void crtRcvRecvIfWk(MCList<MST_RCV_RECV_IF_R> rcvRecvIfL) {
			MCQueryApiBuilder rcvRecvIfL_bldr = MCQueryApiBuilder.create(MST_RCV_RECV_IF_R.create("T"));
			dbWkDelete("MSLAL9010_MSW_RCV_RECV_IF_D01", rcvRecvIfL_bldr.getBaseDbc());
			dbWkInsert("MSLAL9010_MSW_RCV_RECV_IF_I01", rcvRecvIfL, rcvRecvIfL_bldr.getBaseDbc());
		}
		
		protected MCList<MST_RCV_RECV_IF_R> srchLockRcvRecvIf() {
			MCList<MST_RCV_RECV_IF_R> exeL = MCList.create(MST_RCV_RECV_IF_R.class);
			MST_RCV_RECV_IF_R t = MST_RCV_RECV_IF_R.create("T");
			MCQueryApiBuilder exeL_bldr = MCQueryApiBuilder.create(t);
			MSW_RCV_RECV_IF_KEY_R w1 = MSW_RCV_RECV_IF_KEY_R.create("W1");
			PFT_SDRV_IF_R sdrv = PFT_SDRV_IF_R.create("SDRV");
			
			exeL_bldr.addInnerJoin(w1, bracket(t.data_lno.eq(w1.data_lno)));
			exeL_bldr.addLeftOuterJoin(sdrv, t.data_no.eq(sdrv.data_no));
			exeL_bldr.setWhere(value(0).eq(value(0)));
			exeL_bldr.addWhereWithAnd(t.imp_flg.eq(value(true)));
			exeL_bldr.addWhereWithAnd(bracket( sdrv.sdrv_sts_typ.isNull()
					.or(sdrv.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.RECV_CONV_OK.value())))));
			exeL_bldr.addOrderByAsc(t.ext_data_no, t.ext_sys_cd, t.ext_rcv_no);
			exeL_bldr.setLockTable(t.data_lno);
			
			dbSelectForUpdate("MSLAL9010_MST_RCV_RECV_IF_S04", exeL, exeL_bldr);
			
			for (MST_RCV_RECV_IF_R exeR : exeL) {
				// log_sub_key1にスレッド間でユニークな値を設定
				exeR.setParamIndex(_no);
			}
			_logger.setLogKey(exeL, MST_RCV_RECV_IF_R.$batch_log_no, MST_RCV_RECV_IF_R.$log_sub_key1, MST_RCV_RECV_IF_R.$log_sub_key2);
			return exeL;
		}
		
		protected void afterCall(MCList<MST_RCV_RECV_IF_R> exeL) {
			rsltCnt(exeL);
			updIf(exeL);
			
			MCMessageList msgList = MCMessagePool.getMessageList();
			_logger.writeDataLog(msgList);
			pushAlertMsg(msgList);
			
			dbTran().commit();
			
			msgList.clear();
		}
		
		/**
		 * 処理結果を集計する。
		 * @param exeL 入金受信ＩＦ
		 */
		protected void rsltCnt(MCList<MST_RCV_RECV_IF_R> exeL) {
			MCIndexKey idxkey = _ope.down0().createIndex(RcvRecvIf_Chk01_CndR.$data_lno);
			
			for (MST_RCV_RECV_IF_R exeR : exeL) {
				RcvRecvIf_Chk01_CndR exeRslt = _ope.down0().getFirst(idxkey, exeR.data_lno());
				
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
		
		protected void updIf(MCList<MST_RCV_RECV_IF_R> exeL) {
			MST_RCV_RECV_IF_R t = MST_RCV_RECV_IF_R.create("T");
			MCQueryApiBuilder exeL_bldr = MCQueryApiBuilder.create(t);
			exeL_bldr.setSet(t.imp_flg, t.exe_sts_typ, t.batch_log_no, t.log_sub_key1,
					t.log_sub_key2);

			dbUpdateKey("MSLAL9010_MST_RCV_RECV_IF_U01", exeL, exeL_bldr);
		}
		
		/**
		 * エラーメッセージをプッシュ通知する
		 * @param msgList
		 */
		protected void pushAlertMsg(MCMessageList msgList) {
			if (msgList.isEmpty()) {
				return;
			}
			
			Map<List<String>, MCMessageList> map = new HashMap<List<String>, MCMessageList>();
			MCIndexKey ik = _ope.down0().createIndex(RcvRecvIf_Chk01_CndR.$log_sub_key1, RcvRecvIf_Chk01_CndR.$log_sub_key2);
			
			for (MCMessage msg : msgList) {
				MCRow causeRow = msg.getCauseRow();
				if (causeRow == null) {
					continue;
				}
				
				RcvRecvIf_Chk01_CndR exeR;
				
				if (causeRow instanceof RcvRecvIf_Chk01_CndR) {
					exeR = (RcvRecvIf_Chk01_CndR) causeRow;
				} else {
					MCNumber paramIndex = MCNumber.valueOf(causeRow.getParamIndex());
					MCNumber paramRowIndex = MCNumber.valueOf(causeRow.getParamRowIndex());
					exeR = _ope.down0().getFirst(ik, paramIndex, paramRowIndex);
				}
				
				if (exeR != null) {
					List<String> keyList = new ArrayList<String>();
					keyList.add(exeR.rcst_cd());
					keyList.add(exeR.wg_cd());
					keyList.add(exeR.rcv_usr_cd());
					
					if (map.containsKey(keyList)) {
						MCMessageList list = map.get(keyList);
						list.add(msg);
					} else {
						MCMessageList list = new MCMessageList();
						list.add(msg);
						map.put(keyList, list);
					}
				}
			}
			
			for (Entry<List<String>, MCMessageList> entry : map.entrySet()) {
				String rcstCd = entry.getKey().get(0);
				String wgCd = entry.getKey().get(1);
				String usrCd = entry.getKey().get(2);
				
				pushAlert(null, wgCd, rcstCd, usrCd, MODULE_ID, LOGIC_ID, OPERATION_ID, entry.getValue(), _logger, MSLAL0603,
						MCConst.lgclbl.getLabel(MODULE_ID, LOGIC_ID, null), MCDate.sysnow().toString("yyyy/MM/dd HH:mm:ss"),
						getCo().co_cd(), wgCd, rcstCd);
			}
		}
		
		/**
		 * 同一キーで新しいデータが既に処理済みかどうか。
		 * 
		 * @param exeR 取込対象行
		 * @return 処理済みの場合はtrue
		 */
		protected boolean isOkSkip(MST_RCV_RECV_IF_R exeR, Set<List<String>> afterExtDataSet) {
			return afterExtDataSet.contains(createErrSetKey(exeR));
		}
		
		/**
		 * 処理結果区分にスキップを設定する。
		 * @param exeR 取込対象行
		 */
		protected void setSkipSts(MST_RCV_RECV_IF_R exeR) {
			exeR.exe_sts_typ(MAC_EXE_STS_TYP.SKP.value());
		}
		
		/**
		 * ワークテーブルに含まれるデータを全て削除する。
		 * @param rcvRecvIfL
		 */
		protected void delRcvRecvIfWk(MCList<MST_RCV_RECV_IF_R> rcvRecvIfL) {
			MCQueryApiBuilder rcvRecvIfL_bldr = MCQueryApiBuilder.create(MST_RCV_RECV_IF_R.create("T"));
			dbWkDelete("MSLAL9010_MSW_RCV_RECV_IF_D02", rcvRecvIfL_bldr.getBaseDbc());
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
	 * RcvRecvIf_Upd04オペレーション.<p>
	 *
	 * 入金受信ＩＦ取込を行う（入金受信ＩＦサービスを呼び出す本処理）。<br>
	 */
	public class RcvRecvIf_Upd04 extends MSLAL_RcvRecvIfService_MC_A.RcvRecvIf_Upd04 {
		
		/**
		 * 入金受信ＩＦ取込チェックオペレーション
		 */
		protected MSLAL_RcvRecvIfService.RcvRecvIf_Chk01 _rcvRecvIfChk = MSLAL_RcvRecvIfService.crtRcvRecvIf_Chk01();
		
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
			up0().setString(RcvRecvIf_Chk01_CndR.$exe_sts_typ, MAC_EXE_STS_TYP.NOT_EXE.value());
			up0().sort(getGrpKey());
			setPegNo(up0());
		}
		
		protected void proc() {
			MCSavepoint sp = null;
			MCMessageList msgList = new MCMessageList();
			msgList.addAll(MCMessagePool.getMessageList());
			
			// 同一入金ＮＯのデータが連続する場合（新規、訂正・・・など）を考慮し、外部システムデータＮＯの順で
			// 「チェック→更新→チェック→更新・・」と実行する
			MCMessagePool.clear();
			MCList<RcvRecvIf_Chk01_CndR>[] grpLArr = getGrp();
			
			for (MCList<RcvRecvIf_Chk01_CndR> rcvRecvIfL : grpLArr) {
				rcvRecvIfL = rcvRecvIfL.subList(r -> !isErr(r.rcv()));
				if (rcvRecvIfL.size() == 0) {
					continue;
				}
				msgList.addAll(MCMessagePool.getMessageList());
				
				// 前に処理したデータのメッセージプールが残っていると、チェック処理が正しく行われない。
				// メッセージプールはチェックを呼び出す度にクリアする。
				MCMessagePool.clear();
				
				try { // 排他エラーなどチェック処理の例外をキャッチする
					MCList<RcvRecvIf_Chk01_CndR> _noErrL = null;
					check(rcvRecvIfL);
					_noErrL = rcvRecvIfL.subList(r -> !isErr(r.rcv()));
					
					//全件がエラーの場合はcontinue
					if (_noErrL.size() == 0) {
						continue;
					}
					msgList.addAll(MCMessagePool.getMessageList());
					MCMessagePool.clear();
					
					if (!isNull(_noErrL)) {
						sp = dbTran().setSavepoint();
						execRcvRegServ(_noErrL);
					}
				} catch (Exception ex) {
					handleEx(ex, sp, rcvRecvIfL);
				} finally {
					msgList.addAll(MCMessagePool.getMessageList());
					MCMessagePool.clear();
					sp = null;
				}
				setOK(rcvRecvIfL);
			}
			MCMessagePool.clear();
			MCMessagePool.addAll(msgList);
		}
		
		/**
		 * 取込単位で入金受信ＩＦ情報をグループ化する。
		 * @return 取込単位のグループ
		 */
		@SuppressWarnings("unchecked")	// 総称配列の警告回避
		protected MCList<RcvRecvIf_Chk01_CndR>[] getGrp() {
			List<MCList<RcvRecvIf_Chk01_CndR>> arr = new ArrayList<>();
			RcvRecvIf_Chk01_CndR row = null;
			MCList<RcvRecvIf_Chk01_CndR> list = null;

			for (RcvRecvIf_Chk01_CndR r : up0()) {
				if (isNull(row) || !r.equalColumns(row, getGrpKey())) {
					list = MCList.create(RcvRecvIf_Chk01_CndR.class);
					arr.add(list);
				}
				list.add(r);
				row = r;
			}
			
			List<MCList<RcvRecvIf_Chk01_CndR>> ret = mergeNewDtlL(arr);
			return ret.toArray(new MCList[ret.size()]);
		}
		
		protected void setOK(MCList<RcvRecvIf_Chk01_CndR> list) {
			for (RcvRecvIf_Chk01_CndR row : list) {
				if (!MAC_EXE_STS_TYP.isERR(row.exe_sts_typ())) {
					row.exe_sts_typ(MAC_EXE_STS_TYP.OK.value());
				}
			}
		}
		
		/**
		 * #getGrp()の結果を基に、新規取り込みデータが連続している場合は更にまとめる
		 * @see #getGrp()
		 * @param arr {@link #getGrpKey()}でグループ化したもの
		 * @return ret 新規取り込みデータをマージしたリスト
		 */
		protected List<MCList<RcvRecvIf_Chk01_CndR>> mergeNewDtlL(List<MCList<RcvRecvIf_Chk01_CndR>> arr) {
			List<MCList<RcvRecvIf_Chk01_CndR>> ret = new ArrayList<>();
			MCList<RcvRecvIf_Chk01_CndR> mergeDestL = MCList.create(RcvRecvIf_Chk01_CndR.class);
			boolean isMerging = false;
			
			for (MCList<RcvRecvIf_Chk01_CndR> l : arr) {
				if (isNewDtlOnly(l)) {
					mergeDestL.addAll(l);
					isMerging = true;
				}
				else {
					if (isMerging) {
						ret.add(mergeDestL);
						isMerging = false;
						mergeDestL = MCList.create(RcvRecvIf_Chk01_CndR.class);
					}
					ret.add(l);
				}
			}
			if (isMerging) {
				ret.add(mergeDestL);// IFデータが全て新規の場合
			}
			return ret;
		}
		
		protected boolean isNewDtlOnly(MCList<RcvRecvIf_Chk01_CndR> l) {
			for (RcvRecvIf_Chk01_CndR r : l) {
				if (!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					return false;
				}
			}
			return true;
		}
		
		/**
		 * RcvRecvIf_Chk01を実行する
		 * @param chkL
		 * @return チェック処理によって1行でもエラーが発生していればfalse
		 */

		protected void check(MCList<RcvRecvIf_Chk01_CndR> chkL) {
			_rcvRecvIfChk.up0().setAll(chkL);
			_rcvRecvIfChk.exec();
		}
		
		/**
		 * 更新処理例外発生時の後処理を行う。
		 * @param ex 例外
		 * @param sp セーブポイント
		 * @param rcvRecvIfL 入金受信ＩＦリスト
		 */
		protected void handleEx(Exception ex, MCSavepoint sp, MCList<RcvRecvIf_Chk01_CndR> rcvRecvIfL) {
			
			String msgId = null;
			String msg = null;
			MCMessageList causeMsgList = null;
			
			if (ex instanceof MCException) {
				MCException mcex = (MCException) ex;
				msgId = mcex.getID();
				msg = mcex.getMCMessage().toString();
				causeMsgList = mcex.getCauseMessageList();
			} else {
				msgId = ex instanceof MCException ? ((MCException) ex).getID() : null;
				msg = ex.toString();
				causeMsgList = new MCMessageList();
			}
			
			for (RcvRecvIf_Chk01_CndR opeRow : rcvRecvIfL) {
				MCMessagePool.add(opeRow, null, MSLAL0602, opeRow.data_no(), opeRow.data_lno(), msgId, msg);
				for (MCMessage causeMsg : causeMsgList) {
					MCMessage newMsg = new MCMessage(opeRow, null, causeMsg.getID(), (Object[])causeMsg.getBindArray());
					MCMessagePool.add(newMsg);
				}
				setErrSts(opeRow.rcv());
			}
			
			if (sp != null) {
				dbTran().rollback(sp);
			}
		}
		
		/**
		 * MSBGL5180 入金登録サービスを実行する。
		 * @param rcvRecvIfL 入金受信ＩＦリスト
		 */
		protected void execRcvRegServ(MCList<RcvRecvIf_Chk01_CndR> rcvRecvIfL) {
			MSBGL_RcvRegService.Rcv_Ins01 insServ = MSBGL_RcvRegService.crtRcv_Ins01();
			MSBGL_RcvRegService.Rcv_Upd01 updServ = MSBGL_RcvRegService.crtRcv_Upd01();
			MSBGL_RcvRegService.Rcv_Del01 delServ = MSBGL_RcvRegService.crtRcv_Del01();
			
			//新規・更新
			for(Chk01_HdrR r :  _rcvRecvIfChk.down1()) {
				if (r.err_flg()) {
					continue;
				}
				RcvRecvIf_Chk01_CndR insUpdR = rcvRecvIfL.getFirst(RcvRecvIf_Chk01_CndR.$peg_no, r.peg_no());
				
				if (!isNull(insUpdR)) {
					if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
						insServ.up0().add(r);
					}
					else {
						updServ.up0().add(r);
					}
				}
			}
			
			//削除
			for(Chk02_HdrR r :  _rcvRecvIfChk.down2()) {
				RcvRecvIf_Chk01_CndR delR = rcvRecvIfL.getFirst(RcvRecvIf_Chk01_CndR.$peg_no, r.peg_no());
				if (r.err_flg()) {
					continue;
				}
				if (!isNull(delR)) {
					delServ.up0().add(r);
				}
			}
			
			if (!insServ.up0().isEmpty()) {
				insServ.exec();
			}
			if (!updServ.up0().isEmpty()) {
				updServ.exec();
			}
			if (!delServ.up0().isEmpty()) {
				delServ.exec();
			}
		}
		
		/**
		 * RcvRecvIf_Upd03への下り電文を設定する。
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	
	
	/**
	 * RcvRecvIf_Chk01オペレーション.<p>
	 *
	 * 入金受信ＩＦ取込を行う前のチェック処理<br>
	 */
	public class RcvRecvIf_Chk01 extends MSLAL_RcvRecvIfService_MC_A.RcvRecvIf_Chk01 {
		
		/**
		 * 入金情報リスト
		 */
		protected MCList<MST_RCV_R> _rcvL = null;
		
		/**
		 * 入金情報のインデックス
		 */
		protected MCIndexKey _rcvIdxkey = null;
		
		/**
		 * 決済方法マスタのキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_STTL_R> _sttlCache = null;
		
		/** 
		 * 口座マスタ のキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_BANK_AC_R> _acCache = null;
		
		/** 
		 * 部門マスタ のキャッシュ
		 */
		protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _dptCache = null;
		
		/** 
		 * 取引先マスタ のキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_BP_R> _bpCache = null;
		
		/** 
		 * 外部システムマスタ のキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_EXT_SYS_R> _extSysCache = null;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			doCompl();
			callRcvRegServChk();
			setErr();
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheck() {
			MCMessageList msgL = super.doServerCheck();
			msgL.addAll(chkReq(up0()));
			msgL.addAll(chkDate(up0()));
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			MCList<RcvRecvIf_Chk01_CndR> _noErrL = getChkList(up0());
			
			if (_noErrL.isEmpty()) {
				return msgL;
			}
			msgL.addAll(chkDecPlace(_noErrL));
			
			getRcvInfo();
			msgL.addAll(chkRcv(_noErrL));
			
			//キャッシュの作成
			crtSttlCache(_noErrL);
			crtBankAcCache(_noErrL);
			crtExtSysCache(_noErrL);
			
			//口座ＣＤの補完
			complBankAc(_noErrL);
			
			msgL.addAll(chkExtSys(_noErrL));
			msgL.addAll(chkArSttlTyp(_noErrL));
			msgL.addAll(chkBankAcCd(_noErrL));
			msgL.addAll(chkPrevErr(_noErrL));
			
			return msgL;
		}
		
		//エラー行に対してＰＧ実行状況区分をセットする
		protected void setErr() {
			for (RcvRecvIf_Chk01_CndR r : up0()) {
				if (r.err_flg()) {
					setErrSts(r);
				}
			}
		}
		
		/**
		 * 条件付き必須チェックを行う。
		 * @param rcvRecvIfL 入金受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkReq(MCList<RcvRecvIf_Chk01_CndR> rcvRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			
			for (RcvRecvIf_Chk01_CndR r : rcvRecvIfL) {
				if (isCrt(r) || isUpd(r)) {
					msgL.addAll(check(r, RcvRecvIf_Chk01_CndR.$rcv_dpt_cd, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, RcvRecvIf_Chk01_CndR.$rcv_dt, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, RcvRecvIf_Chk01_CndR.$rcv_mtd_cd, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, RcvRecvIf_Chk01_CndR.$ar_sttl_typ, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, RcvRecvIf_Chk01_CndR.$rcv_amt, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, RcvRecvIf_Chk01_CndR.$trd_cur_cd, new FXUCL_RequiredValidater()));
				}
			}
			return msgL;
		}
		
		/**
		 * 日付と数値に関するチェックを行う。
		 * @param rcvRecvIfL 入金受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkDate(MCList<RcvRecvIf_Chk01_CndR> rcvRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			
			for (RcvRecvIf_Chk01_CndR r : rcvRecvIfL) {
				if (isCrt(r) || isUpd(r)) {
					msgL.addAll(check(r, RcvRecvIf_Chk01_CndR.$rcv_dt, getBeforeTodayValidater(RcvRecvIf_Chk01_CndR.$rcv_dt)));
					msgL.addAll(check(r, RcvRecvIf_Chk01_CndR.$rcv_amt, getPositiveValidater(RcvRecvIf_Chk01_CndR.$rcv_amt)));
					msgL.addAll(check(r, RcvRecvIf_Chk01_CndR.$xrate, getPositiveValidater(RcvRecvIf_Chk01_CndR.$xrate)));
				}
			}
			return msgL;
		}
		
		/**
		 * 金額小数部有効桁数チェック
		 * @param r
		 * @return 
		 * @return
		 */
		protected MCMessageList chkDecPlace(MCList<RcvRecvIf_Chk01_CndR> rcvRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			
			for (RcvRecvIf_Chk01_CndR r : rcvRecvIfL) {
				if (isCrt(r) || isUpd(r)) {
					msgL.addAll(checkDecPlace(r, RcvRecvIf_Chk01_CndR.$amt_dec_place, RcvRecvIf_Chk01_CndR.$rcv_amt));
					msgL.addAll(checkDecPlace(r, RcvRecvIf_Chk01_CndR.$amt_dec_place, RcvRecvIf_Chk01_CndR.$com_paid));
				}
			}
			return msgL;
		}
		
		/**
		 * 項目の補完を行う。
		 */
		protected void doCompl() {
			MCList<RcvRecvIf_Chk01_CndR> _noErrL = getChkList(up0());
			crtBpCache(_noErrL);
			
			for (RcvRecvIf_Chk01_CndR r : _noErrL) {
				//削除の場合は補完処理を実行しない
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					continue;
				}
				
				complApplTgtFlg(r);
				complApplBasisDt(r);
				complXrate(r);
			}
		}
		
		/**
		 * 口座ＣＤを補完する
		 * @param _noErrL 
		 */
		protected void complBankAc(MCList<RcvRecvIf_Chk01_CndR> _noErrL) {
			crtDptCache(_noErrL);
			
			for (RcvRecvIf_Chk01_CndR r : _noErrL) {
				MAM_DPT_R dptCache = getDpt(r);
				r.rcv_typ(getSttl(r).ar_sttl_typ());
				
				if (!isNull(r.bank_ac_cd()) || !MAC_AR_STTL_TYP.isBANK(r.rcv_typ())) {
					return;
				}
				
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					r.bank_ac_cd(dptCache.rcv_bank_ac_cd());
				}
				
				if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					if (isSame(r.rcv_dpt_cd(), _rcvL.getFirst(_rcvIdxkey, r.ext_sys_cd(), r.ext_rcv_no()).rcv_dpt_cd())) {
						r.bank_ac_cd(_rcvL.getFirst(_rcvIdxkey, r.ext_sys_cd(), r.ext_rcv_no()).bank_ac_cd());
					} else {
						r.bank_ac_cd(dptCache.rcv_bank_ac_cd());
					}
				}
			}
		}
		
		/**
		 * 入金自動消込対象フラグを補完する
		 * @param r 
		 */
		protected void complApplTgtFlg(RcvRecvIf_Chk01_CndR r) {
			MAM_BP_R bpCache = getBp(r);
			
			if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ()) 
					&& isSame(r.rcst_cd(), _rcvL.getFirst(_rcvIdxkey, r.ext_sys_cd(), r.ext_rcv_no()).rcst_cd())) {
				r.rcv_auto_appl_tgt_flg(_rcvL.getFirst(_rcvIdxkey, r.ext_sys_cd(), r.ext_rcv_no()).rcv_auto_appl_tgt_flg());
			} else {
				r.rcv_auto_appl_tgt_flg(bpCache.rcv_auto_appl_tgt_flg());
			}
		}
		
		/**
		 * 自動消込基準日を補完する
		 * @param r 
		 */
		protected void complApplBasisDt(RcvRecvIf_Chk01_CndR r) {
			MCNumber delayDays = nvl(getBp(r).auto_appl_delay_days(), MCNumber.ZERO);
			if (!r.rcv_auto_appl_tgt_flg()) {
				return;
			}
			
			if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
				r.auto_appl_basis_dt(r.rcv_dt().addDay(delayDays));
			}
			
			if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
				if (!isNull(_rcvL.getFirst(_rcvIdxkey, r.ext_sys_cd(), r.ext_rcv_no()).auto_appl_basis_dt()) 
						&& isSame(r.rcst_cd(), _rcvL.getFirst(_rcvIdxkey, r.ext_sys_cd(), r.ext_rcv_no()).rcst_cd()) 
						&& isSame(r.rcv_dt(),  _rcvL.getFirst(_rcvIdxkey, r.ext_sys_cd(), r.ext_rcv_no()).rcv_dt())) {
					r.auto_appl_basis_dt(_rcvL.getFirst(_rcvIdxkey, r.ext_sys_cd(), r.ext_rcv_no()).auto_appl_basis_dt());
				} else {
					r.auto_appl_basis_dt(r.rcv_dt().addDay(delayDays));
				}
			}
		}
		
		/**
		 * 為替レートを補完する
		 * @param r 
		 */
		protected void complXrate(RcvRecvIf_Chk01_CndR r) {
			if (!isNull(r.xrate())) {
				return;
			}
			//取引通貨が基準通貨で、為替レートがNULL
			if (isSame(r.trd_cur_cd(), getCo().base_cur_cd())) {
				r.xrate(MCNumber.ONE);
			} 
			//取引通貨が外貨で、更新前後で通貨が変わらない
			if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ()) && !isSame(r.trd_cur_cd(), getCo().base_cur_cd())
				&& isSame(r.trd_cur_cd(), _rcvL.getFirst(_rcvIdxkey, r.ext_sys_cd(), r.ext_rcv_no()).trd_cur_cd())
				&& isSame(r.rcv_dt(), _rcvL.getFirst(_rcvIdxkey, r.ext_sys_cd(), r.ext_rcv_no()).rcv_dt())) {
					r.xrate(_rcvL.getFirst(_rcvIdxkey, r.ext_sys_cd(), r.ext_rcv_no()).xrate()); 
			} else {
				r.xrate(MAUCL_AmtUtil.getDefXrateNE(r.trd_cur_cd(), getCo().base_cur_cd(), getCo().sls_xrate_cd(), r.rcv_dt()));
			} 
		}
		
		/**
		 * 入金登録サービスのチェック処理を実行する。
		 */
		protected void callRcvRegServChk() {
			MCList<RcvRecvIf_Chk01_CndR> noErr01 = MCList.create(RcvRecvIf_Chk01_CndR.class);
			MCList<RcvRecvIf_Chk01_CndR> noErr02 = MCList.create(RcvRecvIf_Chk01_CndR.class);
			
			MCList<RcvRecvIf_Chk01_CndR> _noErrL = getChkList(up0());
			
			for (RcvRecvIf_Chk01_CndR r : _noErrL) {
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					noErr01.add(r);
				} 
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					noErr02.add(r);
				}
			}
			
			if (!noErr01.isEmpty()) {
				setAll(_chk01Serv.up0(), noErr01, createMap_Chk01_HdrR_RcvRecvIf_Chk01_CndR());
				_chk01Serv.exec();
				down1().setAll(_chk01Serv.down0());
				
				copyErrFlg(up0(), down1());
			}
			
			if (!noErr02.isEmpty()) {
				setAll(_chk02Serv.up0(), noErr02, createMap_Chk02_HdrR_RcvRecvIf_Chk01_CndR());
				_chk02Serv.exec();
				down2().setAll(_chk02Serv.down0());
				
				copyErrFlg(up0(), down2());
			}
		}
		
		/**
		 * RcvRecvIf_Upd04への下り電文を設定する。
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		
		/**
		 * 入金関連情報を取得する。
		 */
		protected void getRcvInfo() {
			_rcvL = MCList.create(MST_RCV_R.class);
			MST_RCV_R t = MST_RCV_R.create("T");
			MCQueryApiBuilder rcvL_bldr = MCQueryApiBuilder.create(t);

			rcvL_bldr.setWhere(t.ext_rcv_no.eq(bind("ext_rcv_no")));
			rcvL_bldr.addWhereWithAnd(t.ext_sys_cd.eq(bind("ext_sys_cd")));

			rcvL_bldr.setOrderByAsc(t.ext_rcv_no);
			dbSelectForUpdate("MSLAL9010_MST_RCV_S01", _rcvL, rcvL_bldr, up0().groupBy(
					RcvRecvIf_Chk01_CndR.$ext_sys_cd, RcvRecvIf_Chk01_CndR.$ext_rcv_no));

			_rcvIdxkey = _rcvL.createIndex(MST_RCV_R.$ext_sys_cd, MST_RCV_R.$ext_rcv_no);
		}
		
		/**
		 * 対応する入金情報を取込みできるかチェックする。
		 * @param _noErrL 入金受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkRcv(MCList<RcvRecvIf_Chk01_CndR> _noErrL) {
			
			MCMessageList msgL = new MCMessageList();
			boolean errFlg = false;
			
			msgL.addAll(chkDuplicate(_noErrL));
			
			for (RcvRecvIf_Chk01_CndR rcvR : _noErrL) {
				errFlg = false;
				MCList<MST_RCV_R> rcvL = _rcvL.subList(_rcvIdxkey, rcvR.ext_sys_cd(), rcvR.ext_rcv_no());
				
				if (isCrt(rcvR)) {
					if (rcvL.size() >= 1) {
						msgL.add(new MCMessage(rcvR, null, MSLAL0608,
							rcvR.data_no(), 
							rcvR.data_lno(), 
							rcvR.ext_sys_cd(), 
							rcvR.ext_rcv_no())
						);
						errFlg = true;
					}
				} else {
					if (rcvL.size() > 1) {
						msgL.add(new MCMessage(rcvR, null, MSLAL0609, rcvR.data_no(), rcvR.data_lno(), rcvR.ext_sys_cd(), rcvR.ext_rcv_no()));
						errFlg = true;
					} else if (rcvL.size() == 0) {
						msgL.add(new MCMessage(rcvR, null, MSLAL0610, rcvR.data_no(), rcvR.data_lno(), rcvR.ext_sys_cd(), rcvR.ext_rcv_no()));
						errFlg = true;
					}
				}
				
				if ((isUpd(rcvR) || isDel(rcvR)) && !errFlg) {
					// 更新/削除行の対応する入金ＮＯを設定する
					rcvR.rcv_no(rcvL.get(0).rcv_no());
				}
			}
			return msgL;
		}
		
		/**
		 * 先に処理したデータでエラーが発生したかどうかチェックする。
		 * @param rcvRecvIfL 入金受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkPrevErr(MCList<RcvRecvIf_Chk01_CndR> rcvRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			
			for (RcvRecvIf_Chk01_CndR rcvRecvIfR : rcvRecvIfL) {
				if (isPrevErr(rcvRecvIfR.rcv())) {
					msgL.add(new MCMessage(rcvRecvIfR, null, MSLAL0604, rcvRecvIfR.data_no(), rcvRecvIfR.data_lno(), rcvRecvIfR.ext_sys_cd(), rcvRecvIfR.ext_rcv_no()));
				}
			}
			return msgL;
		}
		
		/**
		 * 取込対象内で、外部システムＣＤと外部入金ＮＯの組み合わせが重複していないかチェックする。
		 * @param rcvRecvIfL 入金受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkDuplicate(MCList<RcvRecvIf_Chk01_CndR> rcvRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			
			for (MCList<RcvRecvIf_Chk01_CndR> grpL : rcvRecvIfL.groupList(
				RcvRecvIf_Chk01_CndR.$ext_rcv_no, RcvRecvIf_Chk01_CndR.$ext_sys_cd)) {
				if (1 < grpL.size()) {
					for (RcvRecvIf_Chk01_CndR r : grpL) {
						msgL.add(new MCMessage(r, null, MSLAL0633, r.data_no(), r.data_lno(), r.ext_sys_cd(), r.ext_rcv_no()));
					}
				}
			}
			return msgL;
		}
		
		/**
		 * 外部システム区分に関連するチェックを行う。
		 * @param rcvRecvIfL 入金受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkExtSys(MCList<RcvRecvIf_Chk01_CndR> rcvRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			
			for (RcvRecvIf_Chk01_CndR rcvIfR : rcvRecvIfL) {
				//外部システムマスタから外部システム区分を取得する
				MAM_EXT_SYS_R extSysCache = getExtSys(rcvIfR);
				
				if (!MAC_EXT_SYS_TYP.isFB(extSysCache.ext_sys_typ())) {
					msgL.add(new MCMessage(rcvIfR, RcvRecvIf_Chk01_CndR.$ext_sys_cd, MSLAL0634, rcvIfR.data_no(), rcvIfR.data_lno(), rcvIfR.ext_sys_cd()));
				}
			}
			return msgL;
		}
		
		/**
		 * 債権決済区分に関連するチェックを行う。
		 * @param rcvRecvIfL 入金受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkArSttlTyp(MCList<RcvRecvIf_Chk01_CndR> rcvRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			
			for (RcvRecvIf_Chk01_CndR rcvIfR : rcvRecvIfL) {
				if (MAC_DATA_CRUD_TYP.isDEL(rcvIfR.data_crud_typ())) {
					continue;
				}
				//決済方法マスタから債権決済区分を取得する
				MAM_STTL_R sttlCache = getSttl(rcvIfR);
				
				if (MAC_RCV_REG_TYP.isNON(sttlCache.rcv_reg_typ())) {
					msgL.add(new MCMessage(rcvIfR, RcvRecvIf_Chk01_CndR.$rcv_mtd_cd, MSLAL0632, rcvIfR.data_no(), rcvIfR.data_lno(), rcvIfR.rcv_mtd_cd()));
				}
				if (!(isSame(sttlCache.ar_sttl_typ(), rcvIfR.ar_sttl_typ()))) {
					msgL.add(new MCMessage(rcvIfR, null, MSLAL0607, rcvIfR.data_no(), rcvIfR.data_lno(), rcvIfR.ar_sttl_typ(), rcvIfR.rcv_mtd_cd()));
				}
			}
			return msgL;
		}
		
		/**
		 * 銀行ＣＤに関連するチェックを行う。
		 * @param rcvRecvIfL 入金受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkBankAcCd(MCList<RcvRecvIf_Chk01_CndR> rcvRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			
			for (RcvRecvIf_Chk01_CndR r : rcvRecvIfL) {
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					continue;
				}
				r.rcv_typ(getSttl(r).ar_sttl_typ());
				//債権決済区分が「振込」ではないとき、または銀行ＣＤがNULLのときは以降のチェックを行わない
				if (!MAC_AR_STTL_TYP.isBANK(r.rcv_typ()) || isNull(r.bank_cd())) {
					continue;
				}
				//口座マスタから銀行ＣＤを取得する
				MAM_BANK_AC_R acCache = getBankAc(r);
				
				if (!(isSame(acCache.bank_cd(), r.bank_cd()))) {
					msgL.add(new MCMessage(r, null, MSLAL0606, r.data_no(), r.data_lno(), r.bank_ac_cd(), r.bank_cd()));
				}
			}
			return msgL;
		}
		
		/**
		 * 取引先マスタのキャッシュを作成する。
		 * @param _noErrL 入金受信ＩＦリスト
		 */
		protected void crtBpCache(MCList<RcvRecvIf_Chk01_CndR> up0) {
			_bpCache = new FXUCL_MCDbcCache<MAM_BP_R>(
				MCQueryApiBuilder.create(MAM_BP_R.create("T")), 
				up0, 
				RcvRecvIf_Chk01_CndR.$rcst_cd
			);
		}
		
		/**
		 * キャッシュから取引先マスタを取得する。
		 * @param rcvRecvIfR 入金受信ＩＦ
		 * @return 
		 */
		protected MAM_BP_R getBp(RcvRecvIf_Chk01_CndR rcvIfR) {
			return _bpCache.get(rcvIfR.rcst_cd());
		}
		
		
		/**
		 * 部門マスタのキャッシュを作成する。
		 * @param up0
		 */
		protected void crtDptCache(MCList<RcvRecvIf_Chk01_CndR> up0) {
			_dptCache = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(
				MCQueryApiBuilder.create(MAM_DPT_R.create("T")), 
				up0, 
				RcvRecvIf_Chk01_CndR.$rcv_dpt_cd
			);
		}
		
		/**
		 * キャッシュから部門マスタを取得する。
		 * @param rcvRecvIfR 入金受信ＩＦ
		 * @return 
		 */
		protected MAM_DPT_R getDpt(RcvRecvIf_Chk01_CndR rcvIfR) {
			return _dptCache.get(rcvIfR.rcv_dt(), rcvIfR.rcv_dpt_cd());
		}
		
		/**
		 * 決済方法マスタのキャッシュを作成する。
		 * @param _noErrL 入金受信ＩＦリスト
		 */
		protected void crtSttlCache(MCList<RcvRecvIf_Chk01_CndR> _noErrL) {
			_sttlCache = new FXUCL_MCDbcCache<MAM_STTL_R>(
				MCQueryApiBuilder.create(MAM_STTL_R.create("T")), 
				_noErrL, 
				RcvRecvIf_Chk01_CndR.$rcv_mtd_cd
			);
		}
		
		/**
		 * キャッシュから決済方法マスタを取得する。
		 * @param rcvIfR 入金受信ＩＦ
		 * @return 債権決済区分
		 */
		protected MAM_STTL_R getSttl(RcvRecvIf_Chk01_CndR rcvIfR) {
			return _sttlCache.get(rcvIfR.rcv_mtd_cd());
		}
		
		/**
		 * 口座マスタのキャッシュを作成する。
		 * @param _noErrL 入金受信ＩＦリスト
		 */
		protected void crtBankAcCache(MCList<RcvRecvIf_Chk01_CndR> _noErrL) {
			_acCache = new FXUCL_MCDbcCache<MAM_BANK_AC_R>(
				MCQueryApiBuilder.create(MAM_BANK_AC_R.create("T")), 
				_noErrL, 
				RcvRecvIf_Chk01_CndR.$bank_ac_cd
			);
		}
		
		/**
		 * キャッシュから口座マスタを取得する。
		 * @param rcvIfR 入金受信ＩＦ
		 */
		protected MAM_BANK_AC_R getBankAc(RcvRecvIf_Chk01_CndR rcvIfR) {
			return _acCache.get(rcvIfR.bank_ac_cd());
		}
		
		/**
		 * 外部システムマスタのキャッシュを作成する。
		 * @param _noErrL 入金受信ＩＦリスト
		 */
		protected void crtExtSysCache(MCList<RcvRecvIf_Chk01_CndR> _noErrL) {
			_extSysCache = new FXUCL_MCDbcCache<MAM_EXT_SYS_R>(
				MCQueryApiBuilder.create(MAM_EXT_SYS_R.create("T")), 
				_noErrL, 
				RcvRecvIf_Chk01_CndR.$ext_sys_cd
			);
		}
		
		/**
		 * キャッシュから外部システムマスタを取得する。
		 * @param rcvIfR 入金受信ＩＦ
		 */
		protected MAM_EXT_SYS_R getExtSys(RcvRecvIf_Chk01_CndR rcvIfR) {
			return _extSysCache.get(rcvIfR.ext_sys_cd());
		}
		
		/**
		 * 指定された入金受信ＩＦが新規かどうか。
		 * @param rcvRecvIfR 入金受信ＩＦ
		 * @return 新規の場合はtrue
		 */
		protected boolean isCrt(RcvRecvIf_Chk01_CndR rcvRecvIfR) {
			return MAC_DATA_CRUD_TYP.isCRT(rcvRecvIfR.data_crud_typ());
		}
		
		/**
		 * 指定された入金受信ＩＦが更新かどうか。
		 * @param rcvRecvIfR 入金受信ＩＦ
		 * @return 更新の場合はtrue
		 */
		protected boolean isUpd(RcvRecvIf_Chk01_CndR rcvRecvIfR) {
			return MAC_DATA_CRUD_TYP.isUPD(rcvRecvIfR.data_crud_typ());
		}
		
		/**
		 * 指定された入金受信ＩＦが削除かどうか。
		 * @param rcvRecvIfR 入金受信ＩＦ
		 * @return 削除の場合はtrue
		 */
		protected boolean isDel(RcvRecvIf_Chk01_CndR rcvRecvIfR) {
			return MAC_DATA_CRUD_TYP.isDEL(rcvRecvIfR.data_crud_typ());
		}
		
		//以下でマッピング
		protected Map_Chk01_HdrR_RcvRecvIf_Chk01_CndR<Chk01_HdrR,RcvRecvIf_Chk01_CndR> createMap_Chk01_HdrR_RcvRecvIf_Chk01_CndR() {
			return new Map_Chk01_HdrR_RcvRecvIf_Chk01_CndR<Chk01_HdrR, RcvRecvIf_Chk01_CndR>();
		}
		
		public class Map_Chk01_HdrR_RcvRecvIf_Chk01_CndR<D extends Chk01_HdrR, S extends RcvRecvIf_Chk01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk01_HdrR.$peg_no, RcvRecvIf_Chk01_CndR.$peg_no);
				addColumnPathMap(Chk01_HdrR.$data_crud_typ, RcvRecvIf_Chk01_CndR.$data_crud_typ);
				addColumnPathMap(Chk01_HdrR.$err_flg, RcvRecvIf_Chk01_CndR.$err_flg);
				addColumnPathMap(Chk01_HdrR.$rcv_no, RcvRecvIf_Chk01_CndR.$rcv_no);
				addColumnPathMap(Chk01_HdrR.$rcv_dt, RcvRecvIf_Chk01_CndR.$rcv_dt);
				addColumnPathMap(Chk01_HdrR.$rcv_usr_cd, RcvRecvIf_Chk01_CndR.$rcv_usr_cd);
				addColumnPathMap(Chk01_HdrR.$rcv_dpt_cd, RcvRecvIf_Chk01_CndR.$rcv_dpt_cd);
				addColumnPathMap(Chk01_HdrR.$wg_cd, RcvRecvIf_Chk01_CndR.$wg_cd);
				addColumnPathMap(Chk01_HdrR.$rcst_cd, RcvRecvIf_Chk01_CndR.$rcst_cd);
				addColumnPathMap(Chk01_HdrR.$bcst_cd, RcvRecvIf_Chk01_CndR.$bcst_cd);
				addColumnPathMap(Chk01_HdrR.$bill_dpt_cd, RcvRecvIf_Chk01_CndR.$bill_dpt_cd);
				addColumnPathMap(Chk01_HdrR.$trd_cur_cd, RcvRecvIf_Chk01_CndR.$trd_cur_cd);
				addColumnPathMap(Chk01_HdrR.$xrate, RcvRecvIf_Chk01_CndR.$xrate);
				addColumnPathMap(Chk01_HdrR.$rcv_amt, RcvRecvIf_Chk01_CndR.$rcv_amt);
				addColumnPathMap(Chk01_HdrR.$rcv_mtd_cd, RcvRecvIf_Chk01_CndR.$rcv_mtd_cd);
				addColumnPathMap(Chk01_HdrR.$bank_ac_cd, RcvRecvIf_Chk01_CndR.$bank_ac_cd);
				addColumnPathMap(Chk01_HdrR.$xfr_psn, RcvRecvIf_Chk01_CndR.$xfr_psn);
				addColumnPathMap(Chk01_HdrR.$rcv_rmrks, RcvRecvIf_Chk01_CndR.$rcv_rmrks);
				addColumnPathMap(Chk01_HdrR.$com_paid, RcvRecvIf_Chk01_CndR.$com_paid);
				addColumnPathMap(Chk01_HdrR.$note_no, RcvRecvIf_Chk01_CndR.$note_no);
				addColumnPathMap(Chk01_HdrR.$note_typ, RcvRecvIf_Chk01_CndR.$note_typ);
				addColumnPathMap(Chk01_HdrR.$draw_dt, RcvRecvIf_Chk01_CndR.$draw_dt);
				addColumnPathMap(Chk01_HdrR.$due_dt, RcvRecvIf_Chk01_CndR.$due_dt);
				addColumnPathMap(Chk01_HdrR.$drawer_nm, RcvRecvIf_Chk01_CndR.$drawer_nm);
				addColumnPathMap(Chk01_HdrR.$endrsr, RcvRecvIf_Chk01_CndR.$endrsr);
				addColumnPathMap(Chk01_HdrR.$accptr, RcvRecvIf_Chk01_CndR.$accptr);
				addColumnPathMap(Chk01_HdrR.$draw_bank_cd, RcvRecvIf_Chk01_CndR.$draw_bank_cd);
				addColumnPathMap(Chk01_HdrR.$draw_branch_cd, RcvRecvIf_Chk01_CndR.$draw_branch_cd);
				addColumnPathMap(Chk01_HdrR.$note_rsn_cd, RcvRecvIf_Chk01_CndR.$note_rsn_cd);
				addColumnPathMap(Chk01_HdrR.$ext_sys_cd, RcvRecvIf_Chk01_CndR.$ext_sys_cd);
				addColumnPathMap(Chk01_HdrR.$ext_rcv_no, RcvRecvIf_Chk01_CndR.$ext_rcv_no);
				addColumnPathMap(Chk01_HdrR.$rcv_typ, RcvRecvIf_Chk01_CndR.$rcv_typ);
				addColumnPathMap(Chk01_HdrR.$rcv_auto_appl_tgt_flg, RcvRecvIf_Chk01_CndR.$rcv_auto_appl_tgt_flg);
				addColumnPathMap(Chk01_HdrR.$auto_appl_basis_dt, RcvRecvIf_Chk01_CndR.$auto_appl_basis_dt);
			}
			
			@Override
			public void valueCopy(D dest, S src) {
				dest.fb_flg(true);
				dest.setParamIndex(src.rcv().getParamIndex());
				dest.setParamRowIndex(src.rcv().getParamRowIndex());
			}
		}
		
		protected Map_Chk02_HdrR_RcvRecvIf_Chk01_CndR<Chk02_HdrR,RcvRecvIf_Chk01_CndR> createMap_Chk02_HdrR_RcvRecvIf_Chk01_CndR() {
			return new Map_Chk02_HdrR_RcvRecvIf_Chk01_CndR<Chk02_HdrR, RcvRecvIf_Chk01_CndR>();
		}
		
		public class Map_Chk02_HdrR_RcvRecvIf_Chk01_CndR<D extends Chk02_HdrR, S extends RcvRecvIf_Chk01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk02_HdrR.$peg_no, RcvRecvIf_Chk01_CndR.$peg_no);
				addColumnPathMap(Chk02_HdrR.$rcv_no, RcvRecvIf_Chk01_CndR.$rcv_no);
				addColumnPathMap(Chk02_HdrR.$rcv_dpt_cd, RcvRecvIf_Chk01_CndR.$rcv_dpt_cd);
			}
			
			@Override
			public void valueCopy(D dest, S src) {
				dest.setParamIndex(src.rcv().getParamIndex());
				dest.setParamRowIndex(src.rcv().getParamRowIndex());
			}
		}
	}
	
	/**
	 * 引数の2つの行が異なる入金データの場合にtrue、同一の場合にfalseを返す。
	 * 外部システムＣＤ, 外部システムデータＮＯ, 外部入金ＮОが同じ場合に同一と判定する。 
	 * @param r
	 * @param nextR
	 * @return
	 */
	protected boolean isNextData(MST_RCV_RECV_IF_R r, MST_RCV_RECV_IF_R nextR) {
		return !(isSame(r.ext_sys_cd(), nextR.ext_sys_cd()) && isSame(r.ext_data_no(), nextR.ext_data_no()) && isSame(r.ext_rcv_no(), nextR.ext_rcv_no()));
	}

	protected void setErrSts(MST_RCV_RECV_IF_R exeR) {
		exeR.exe_sts_typ(MAC_EXE_STS_TYP.ERR.value());
		List<String> list = createErrSetKey(exeR);
		
		if (!object(CLAZZ)._errSet.contains(list)) {
			object(CLAZZ)._errSet.add(list);
		}
	}
	
	protected void setErrSts(RcvRecvIf_Chk01_CndR exeR) {
		exeR.exe_sts_typ(MAC_EXE_STS_TYP.ERR.value());
		List<String> list = createErrSetKey(exeR);
		
		if (!object(CLAZZ)._errSet.contains(list)) {
			object(CLAZZ)._errSet.add(list);
		}
	}
	
	protected List<String> createErrSetKey(MST_RCV_RECV_IF_R r) {
		List<String> list = new ArrayList<>();
		
		if (!isNull(r)) {
			list.add(r.ext_sys_cd());
			list.add(r.ext_rcv_no());
		}
		return list;
	}
	
	protected List<String> createErrSetKey(RcvRecvIf_Chk01_CndR r) {
		List<String> list = new ArrayList<>();
		
		if (!isNull(r)) {
			list.add(r.ext_sys_cd());
			list.add(r.ext_rcv_no());
		}
		return list;
	}
	
	/**
	 * 同一取込単位内で先に処理した同一キーのデータでエラーが発生したかどうか。
	 * @param rcvRecvIfR 入金受信ＩＦ
	 * @return 同一キーのデータで既にエラーが発生している場合はtrue
	 */
	protected boolean isPrevErr(MST_RCV_RECV_IF_R rcvRecvIfR) {
		return object(CLAZZ)._errSet.contains(createErrSetKey(rcvRecvIfR));
	}
	
	protected String[] getGrpKey() {
		return new String[] {RcvRecvIf_Chk01_CndR.$ext_data_no, RcvRecvIf_Chk01_CndR.$ext_sys_cd, RcvRecvIf_Chk01_CndR.$ext_rcv_no};
	}
	
	protected boolean isErr(MST_RCV_RECV_IF_R rcvRecvIfR) {
		return MAC_EXE_STS_TYP.isERR(rcvRecvIfR.exe_sts_typ());
	}

	//FMCB CUSTOM END
}