package mcframe.serverMSLA.MSLAL5030;

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
import mcframe.serverMSLA.MSLAL5030.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSLA.MSLAL5120.SloRecvIf_Upd04_DtlR;
import mcframe.serverPF.dbc.PFT_SDRV_IF_R;
import mcframe.serverMBBE.MBBEL5010.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverPFUD.PFUDL0040.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBD.MSBDL0120.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.commonFXUC.FXUCC0090.FXUCC_RowMapperWith;
import java.util.*;
import java.util.Map.Entry;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.serverCore.mcjdbc.MCSavepoint;
import mcframe.serverCore.resource.MCConst;
import mcframe.serverCore.requester.MCServerThreadManager;
import mcframe.serverFXBA.FXBAL0120.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverMSBD.MSBDL5040.*;
import mcframe.serverMSBD.MSBDL5120.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_PoPrmsRecvIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_PoPrmsRecvIfService_MC extends MSLAL_PoPrmsRecvIfService_MC_A{
	//FMCB CUSTOM START

	// エラーになった発注ＮＯ、発注明細ＮＯの組み合わせを保持する。
	protected Set<List<String>> _errSet = new HashSet<List<String>>();

	// PrmsRecvIf_Chk01の上り電文と、下り電文（down1）のマッピング
	// Map<下り電文のpeg_no, IFデータのpeg_no>
	protected Map<MCNumber, MCNumber> _upMap = new HashMap<MCNumber, MCNumber>();

	protected static final Class<MSLAL_PoPrmsRecvIfService> CLAZZ = MSLAL_PoPrmsRecvIfService.class;
	
	/**
	 * PoPrmsRecvIf_Upd01オペレーション.<p>
	 *
	 * 納期回答受信ＩＦ取込を行う。（ＥＳＢのリアルタイム取込から呼び出される）<br>
	 */
	public class PoPrmsRecvIf_Upd01 extends MSLAL_PoPrmsRecvIfService_MC_A.PoPrmsRecvIf_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			callPrmsRecvIfUpd02();
		}

		protected void callPrmsRecvIfUpd02() {

			MSLAL_PoPrmsRecvIfService.PoPrmsRecvIf_Upd02 ope = MSLAL_PoPrmsRecvIfService.crtPoPrmsRecvIf_Upd02();

			setAll(ope.up0(), up0(), createMapUpd02());

			ope.exec();
		}

		protected MapUpd02<IfDataImp_Upd01_DtlR, Upd01_DtlR> createMapUpd02() {
			return new MapUpd02<IfDataImp_Upd01_DtlR, Upd01_DtlR>();
		}

		public class MapUpd02<D extends IfDataImp_Upd01_DtlR, S extends Upd01_DtlR> extends MCRowMapper<D, S> {
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
	 * PoPrmsRecvIf_Upd02オペレーション.<p>
	 *
	 * 納期回答受信ＩＦ取込を行う。（ＩＦデータ確認、および納期回答受信ＩＦ取込バッチから呼び出される）<br>
	 */
	public class PoPrmsRecvIf_Upd02 extends MSLAL_PoPrmsRecvIfService_MC_A.PoPrmsRecvIf_Upd02 {

		protected MCList<MST_PRMS_RECV_IF_R> _srchKeyL;
		protected MST_PRMS_RECV_IF_R _srchKeyL_t = MST_PRMS_RECV_IF_R.create("T");
		protected MCQueryApiBuilder _srchKeyL_bldr = MCQueryApiBuilder.create(_srchKeyL_t);

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

			_srchKeyL = MCList.create(MST_PRMS_RECV_IF_R.class);
		}

		/**
		 * 開始ログを出力する。
		 */
		protected void writeStartLog() {
			logger().writeStartLog(MSLAL0023);
			pushStartLog(logger());
		}

		/**
		 * Upd03の呼び出しを制御するため、対象データのキー項目のみSelectしておく
		 */
		protected void preSrch() {
			MAM_EDI_IF_CTL_R ifctl = MAM_EDI_IF_CTL_R.create("IFCTL");
			PFT_SDRV_IF_R sdrv = PFT_SDRV_IF_R.create("SDRV");

			_srchKeyL_bldr.setSelect(_srchKeyL_t.ext_data_no);
			_srchKeyL_bldr.addSelect(_srchKeyL_t.data_lno);
			_srchKeyL_bldr.addSelect(_srchKeyL_t.po_no);
			_srchKeyL_bldr.addSelect(_srchKeyL_t.po_d_no);
			_srchKeyL_bldr.addSelect(_srchKeyL_t.sppl_cd);

			_srchKeyL_bldr.addInnerJoin(ifctl,
					bracket(_srchKeyL_t.sppl_cd.eq(ifctl.bp_cd)
							.and(ifctl.if_proc_typ.eq(value(MAC_IF_PROC_TYP.PO_PRMS_RECV.value())))
							.and(ifctl.st_dt.lte(_srchKeyL_t.recv_dt))
							.and(ifctl.end_dt.gte(_srchKeyL_t.recv_dt))));
			_srchKeyL_bldr.addLeftOuterJoin(sdrv, _srchKeyL_t.data_no.eq(sdrv.data_no));

			_srchKeyL_bldr.setWhere(value(0).eq(value(0)));
			_srchKeyL_bldr.addWhereWithAnd(bracket( sdrv.sdrv_sts_typ.isNull() 
							.or(sdrv.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.RECV_CONV_OK.value())))));
			_srchKeyL_bldr.addWhereWithAnd(_srchKeyL_t.imp_flg.eq(value(true)));
			setOrderBy();
			// データＮＯが電文で渡された場合
			if (!up0().isEmpty()) {
				_srchKeyL_bldr.addWhereWithCutOffAnd(_srchKeyL_t.data_no.eq(bind("data_no")));
				_srchKeyL_bldr.addWhereWithCutOffAnd(_srchKeyL_t.sppl_cd.eq(bind("bp_cd")));
				_srchKeyL_bldr.addWhereWithCutOffAnd(_srchKeyL_t.ext_data_no.eq(bind("ext_data_no")));
				_srchKeyL_bldr.addWhereWithCutOffAnd(_srchKeyL_t.ext_sys_cd.eq(bind("ext_sys_cd")));
				dbSelect("MSLAL5030_MST_PRMS_RECV_IF_S01", _srchKeyL, _srchKeyL_bldr, up0());
			}
			else {
				dbSelect("MSLAL5030_MST_PRMS_RECV_IF_S02", _srchKeyL, _srchKeyL_bldr);
			}
		}

		/**
		 * 発注先が異なればext_data_noが同じ可能性があるので、ソート順の最初に発注先を指定する。
		 * （po_noだけでも発注先毎になるが、ソートの最初に持ってくるとext_data_noの順で処理できない）
		 */
		protected void setOrderBy() {
			_srchKeyL_bldr.addOrderByAsc(_srchKeyL_t.sppl_cd, _srchKeyL_t.ext_data_no, _srchKeyL_t.po_no, _srchKeyL_t.po_d_no);
		}

		/**
		 * スレッドを分割し、各スレッドごとにPrmsRecvIf_Upd03を実行する。
		 */
		protected void exe() {

			int no = 0;

			MSLAL_PoPrmsRecvIfService.PoPrmsRecvIf_Upd03 upd03 = null;

			List<MSLAL_PoPrmsRecvIfService.PoPrmsRecvIf_Upd03> opeL = new ArrayList<MSLAL_PoPrmsRecvIfService.PoPrmsRecvIf_Upd03>();

			for (MCList<MST_PRMS_RECV_IF_R> grpL : _srchKeyL.groupList("sppl_cd")) {
				upd03 = MSLAL_PoPrmsRecvIfService.crtPoPrmsRecvIf_Upd03();
				upd03._no = ++no;
				setAll(upd03.up0(), grpL, createMapUpd03());

				opeL.add(upd03);
			}

			if (!opeL.isEmpty()) {

				if (MCServerThreadManager.getLimitThreadSize() <= 1) {

					MCServerThreadManager.setUseMainDBTran(true);
					MCServerThreadManager.invokeAndWait(1, opeL, FXBAL_BatchLogManager.class);
				}
				else {

					MCServerThreadManager.setCommitAndRollback(true);

					// 件数の多いスレッドを優先に実行する。
					Collections.sort(opeL, new Comparator<MSLAL_PoPrmsRecvIfService.PoPrmsRecvIf_Upd03>() {

						public int compare(MSLAL_PoPrmsRecvIfService.PoPrmsRecvIf_Upd03 o1, MSLAL_PoPrmsRecvIfService.PoPrmsRecvIf_Upd03 o2) {
							return (o1.up0().size() - o2.up0().size()) * -1; // 降順
						}
					});

					MCServerThreadManager.invokeAndWait(opeL, FXBAL_BatchLogManager.class);
				}

				for (MSLAL_PoPrmsRecvIfService.PoPrmsRecvIf_Upd03 ope : opeL) {

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
			}
			else {
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
			}
			else if (_totalNum == 0) {

				logger().writeProcessLog(MAUDL0008);
				MCMessagePool.add(MAUDL0008);
			}

			logger().writeEndLog(MSLAL0024, _totalNum, _okNum, _errNum, _skipNum);
			pushEndLog(logger());
			// Loggerを新規作成した場合（呼出元からLoggerを引き継がない場合）のみクローズ
			if (_crtNewLogger) {
				logger().close();
			}
		}

		protected MapUpd03<PoPrmsRecvIf_Upd03_DtlR, MST_PRMS_RECV_IF_R> createMapUpd03() {
			return new MapUpd03<PoPrmsRecvIf_Upd03_DtlR, MST_PRMS_RECV_IF_R>();
		}

		public class MapUpd03<D extends PoPrmsRecvIf_Upd03_DtlR, S extends MST_PRMS_RECV_IF_R> extends MCRowMapper<D, S> {
			@Override
			public void valueCopy(D dest, S src) {
				dest.prms(src);
			}
		}
	}
		
	/**
	 * PoPrmsRecvIf_Upd03オペレーション.<p>
	 *
	 * 納期回答受信ＩＦ取込を行う。（マルチスレッド実行用）<br>
	 */
	public class PoPrmsRecvIf_Upd03 extends MSLAL_PoPrmsRecvIfService_MC_A.PoPrmsRecvIf_Upd03 {

		/** PrmsRecvIf_Upd04を呼び出す際に外部システムデータＮＯ、発注明細ＮＯの組み合わせを何件ずつ渡すかのパラメータ **/
		protected int _loopCnt = MCConst.app.getInteger("MS.MSLAL5030.loop_size", 100);

		protected int _totalNum = 0;

		protected int _okNum = 0;

		protected int _errNum = 0;

		protected int _skipNum = 0;

		protected MSLAL_PoPrmsRecvIfService.PoPrmsRecvIf_Upd04 _ope = MSLAL_PoPrmsRecvIfService.crtPoPrmsRecvIf_Upd04();

		/**
		 * バッチログのlogger<br>
		 * PrmsRecvIf_Upd04バッチ呼び出しオペレーションから引き継ぐ
		 */
		protected FXBAL_BatchLogger _logger = null;

		/**
		 * インスタンス生成元（PrmsRecvIf_Upd03）でスレッド間でユニークな値を設定
		 */
		protected int _no = 0;

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

		protected void exe() {

			int cnt = 0;

			MCList<MST_PRMS_RECV_IF_R> tgtL = MCList.create(MST_PRMS_RECV_IF_R.class);
			MCQueryApiBuilder tgtL_bldr = MCQueryApiBuilder.create(MST_PRMS_RECV_IF_R.create("T"));
			MST_PRMS_RECV_IF_R oldR = MST_PRMS_RECV_IF_R.create();

			for (PoPrmsRecvIf_Upd03_DtlR dtlR : up0()) {

				MST_PRMS_RECV_IF_R keyR = dtlR.prms();
				if (isNextPoD(oldR, keyR)) {
					if (!tgtL.isEmpty() && _loopCnt <= cnt) {
						callPrmsRecvIfUpd04(tgtL, tgtL_bldr);
						cnt = 0;
						tgtL.clear();
					}
				}
				oldR = keyR;
				cnt++;
				tgtL.add(keyR);
			}

			if (!tgtL.isEmpty()) {
				callPrmsRecvIfUpd04(tgtL, tgtL_bldr);
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

		protected void closeLogger() {

			if (!MCServerThreadManager.isUseMainDBTran()) {

				if (_logger != null) {
					_logger.close();
				}
			}
		}

		protected void setDown() {

			down0().total_num(_totalNum);
			down0().ok_num(_okNum);
			down0().err_num(_errNum);
			down0().skip_num(_skipNum);
		}

		protected void callPrmsRecvIfUpd04(MCList<MST_PRMS_RECV_IF_R> prmsRecvIfL, MCQueryApiBuilder prmsRecvIfL_bldr) {

			crtPrmsRecvIfWk(prmsRecvIfL, prmsRecvIfL_bldr);
			MCList<MST_PRMS_RECV_IF_R> exeL = srchLockPrmsRecvIf();
			Set<List<String>> afterExtDataSet = srchAfterExtData(exeL);
			_ope = MSLAL_PoPrmsRecvIfService.crtPoPrmsRecvIf_Upd04();

			MCList<MST_PRMS_RECV_IF_R> skipL = MCList.create(MST_PRMS_RECV_IF_R.class);
			for (MST_PRMS_RECV_IF_R exeR : exeL) {

				// 同一の発注ＮＯ、発注明細ＮＯでエラーが発生している場合、それ以降のデータは処理しない
				if (isPrevErr(exeR)) {

					setErrSts(exeR);
					MCMessagePool.add(exeR, null, MSLAL0025, exeR.data_no(), exeR.data_lno(), exeR.po_no(), exeR.po_d_no());
					skipL.add(exeR);
				}
				// 同一の発注ＮＯ、発注明細ＮＯで、外部システムデータＮＯが当該行の値より大きいデータが既に処理されている場合、スキップする
				else if (isOkSkip(exeR, afterExtDataSet)) {

					setSkipSts(exeR);
					MCMessagePool.add(exeR, null, MSLAL0026, exeR.data_no(), exeR.data_lno(), exeR.po_no(), exeR.po_d_no());
					skipL.add(exeR);
				}
				else {
					PoPrmsRecvIf_Chk01_DtlR upR = _ope.up0().createRow();

					copy(upR, exeR, createMapUpd04());
					upR.setAttributes(exeR);
					_ope.up0().add(upR);
				}
			}
			if (!_ope.up0().isEmpty()) {
				_ope.exec();
			}

			mergeExeRslt(skipL);

			afterCall(exeL);

			delPrmsRecvIfWk(prmsRecvIfL, prmsRecvIfL_bldr);
		}

		protected MCList<MST_PRMS_RECV_IF_R> srchLockPrmsRecvIf() {
			MSW_PRMS_RECV_IF_KEY_R w1 = MSW_PRMS_RECV_IF_KEY_R.create("W1");
			PFT_SDRV_IF_R sdrv = PFT_SDRV_IF_R.create("SDRV");


			MCList<MST_PRMS_RECV_IF_R> exeL = MCList.create(MST_PRMS_RECV_IF_R.class);
			MST_PRMS_RECV_IF_R t = MST_PRMS_RECV_IF_R.create("T");
			MCQueryApiBuilder exeL_bldr = MCQueryApiBuilder.create(t);

			exeL_bldr.addInnerJoin(w1, bracket( t.data_lno.eq(w1.data_lno)));
			exeL_bldr.addLeftOuterJoin(sdrv, t.data_no.eq(sdrv.data_no));

			exeL_bldr.setWhere(value(0).eq(value(0)));
			exeL_bldr.addWhereWithAnd(bracket( sdrv.sdrv_sts_typ.isNull() 
							.or(sdrv.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.RECV_CONV_OK.value())))));
			exeL_bldr.addWhereWithAnd(t.imp_flg.eq(value(true)));
			exeL_bldr.addOrderByAsc(t.data_lno);
			exeL_bldr.setLockTable(t.data_lno);

			dbSelectForUpdate("MSLAL5030_MST_PRMS_RECV_IF_S03", exeL, exeL_bldr);

			for (MST_PRMS_RECV_IF_R exeR : exeL) {

				// log_sub_key1にスレッド間でユニークな値を設定
				exeR.setParamIndex(_no);
			}

			_logger.setLogKey(exeL, MST_PRMS_RECV_IF_R.$batch_log_no, MST_PRMS_RECV_IF_R.$log_sub_key1, MST_PRMS_RECV_IF_R.$log_sub_key2);

			return exeL;
		}

		/**
		 * 処理しなかったデータからダミーの下り電文を作成する
		 */
		protected void mergeExeRslt(MCList<MST_PRMS_RECV_IF_R> skipL) {
			for (MST_PRMS_RECV_IF_R skipR : skipL) {
				PoPrmsRecvIf_Chk01_DtlR r = _ope.down0().createRow();
				r.prms(skipR);
				_ope.down0().add(r);
			}
		}

		/**
		 * 同一キーで取込対象より新しいかつ処理済みのデータを取得する。
		 * 
		 * @param exeL 取込対象リスト
		 * @return 処理済みデータリスト
		 */
		protected Set<List<String>> srchAfterExtData(MCList<MST_PRMS_RECV_IF_R> exeL) {

			MST_PRMS_RECV_IF_R S1ST = MST_PRMS_RECV_IF_R.create("ST");

			MCList<MST_PRMS_RECV_IF_R> afterL = MCList.create(MST_PRMS_RECV_IF_R.class);
			MST_PRMS_RECV_IF_R t = MST_PRMS_RECV_IF_R.create("T");
			MCQueryApiBuilder afterL_bldr = MCQueryApiBuilder.create(t);

			afterL_bldr.setSelect(t.po_no);
			afterL_bldr.addSelect(t.po_d_no);

			afterL_bldr.addConstWhereWithAnd(exists( subQuery() .select(value("X"))
					.from(S1ST)
					.where( t.ext_data_no.lt(S1ST.ext_data_no)
							.and(t.po_no.eq(S1ST.po_no))
							.and(t.po_d_no.eq(S1ST.po_d_no))
							.and( S1ST.exe_sts_typ.in( value(MAC_EXE_STS_TYP.OK.value()), value(MAC_EXE_STS_TYP.SKP.value()) ) ) )));

			dbSelectColumn("MSLAL5030_MST_PRMS_RECV_IF_S04", afterL, afterL_bldr, exeL, MST_PRMS_RECV_IF_R.$data_lno);

			Set<List<String>> set = new HashSet<List<String>>();
			for (MST_PRMS_RECV_IF_R afterR : afterL) {

				List<String> l = createErrSetKey(afterR);
				if (!set.contains(l)) {
					set.add(l);
				}
			}
			return set;
		}

		protected void afterCall(MCList<MST_PRMS_RECV_IF_R> exeL) {

			rsltCnt(exeL);

			updIf(exeL);

			MCMessageList msgList = MCMessagePool.getMessageList();
			_logger.writeDataLog(msgList);
			pushAlertMsg(msgList);
			
			dbTran().commit();

			msgList.clear();
		}

		protected void updIf(MCList<MST_PRMS_RECV_IF_R> exeL) {
			MST_PRMS_RECV_IF_R t = MST_PRMS_RECV_IF_R.create("T");
			MCQueryApiBuilder exeL_bldr = MCQueryApiBuilder.create(t);
			exeL_bldr.setSet(t.imp_flg, t.exe_sts_typ, t.batch_log_no, t.log_sub_key1, t.log_sub_key2);
			dbUpdateKey("MSLAL5030_MST_PRMS_RECV_IF_U01", exeL, exeL_bldr);
		}

		protected void rsltCnt(MCList<MST_PRMS_RECV_IF_R> exeL) {

			MCIndexKey idxkey = _ope.down0().createIndex(PoPrmsRecvIf_Chk01_DtlR.$data_lno);

			for (MST_PRMS_RECV_IF_R exeR : exeL) {

				PoPrmsRecvIf_Chk01_DtlR exeRslt = _ope.down0().getFirst(idxkey, exeR.data_lno());

				if (exeRslt.err_flg()) {
					exeRslt.exe_sts_typ(MAC_EXE_STS_TYP.ERR.value());
				}

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

		protected void delPrmsRecvIfWk(MCList<MST_PRMS_RECV_IF_R> prmsRecvIfL, MCQueryApiBuilder prmsRecvIfL_bldr) {

			dbWkDelete("MSLAL5030_MSW_PRMS_RECV_IF_D01", prmsRecvIfL_bldr.getBaseDbc());
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

			MCIndexKey ik = _ope.down0().createIndex(PoPrmsRecvIf_Chk01_DtlR.$log_sub_key1, PoPrmsRecvIf_Chk01_DtlR.$log_sub_key2);

			for (MCMessage msg : msgList) {
				MCRow causeRow = msg.getCauseRow();
				if (causeRow == null) {
					continue;
				}

				PoPrmsRecvIf_Chk01_DtlR exeR;
				if (causeRow instanceof PoPrmsRecvIf_Chk01_DtlR) {
					exeR = (PoPrmsRecvIf_Chk01_DtlR) causeRow;
				}
				else {
					MCNumber paramIndex = MCNumber.valueOf(causeRow.getParamIndex());
					MCNumber paramRowIndex = MCNumber.valueOf(causeRow.getParamRowIndex());

					exeR = _ope.down0().getFirst(ik, paramIndex, paramRowIndex);
				}

				if (exeR != null && !isNull(exeR.sppl_cd())) {
					List<String> keyList = new ArrayList<String>();
					keyList.add(exeR.sppl_cd());
					keyList.add(exeR.wg_cd());
					keyList.add(exeR.purc_usr_cd());

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
		
		/**
		 * 同一取込単位で先に処理したデータでエラーが発生したかどうか。
		 * 
		 * @param exeR 取込対象行
		 * @return エラーが発生した場合はtrue
		 */
		protected boolean isPrevErr(MST_PRMS_RECV_IF_R exeR) {
			return object(CLAZZ)._errSet.contains(createErrSetKey(exeR));
		}

		/**
		 * 同一キーで新しいデータが既に処理済みかどうか。
		 * 
		 * @param exeR 取込対象行
		 * @return 処理済みの場合はtrue
		 */
		protected boolean isOkSkip(MST_PRMS_RECV_IF_R exeR, Set<List<String>> afterExtDataSet) {

			return afterExtDataSet.contains(createErrSetKey(exeR));
		}

		/**
		 * 処理結果区分にスキップを設定する。
		 * 
		 * @param exeR 取込対象行
		 */
		protected void setSkipSts(MST_PRMS_RECV_IF_R exeR) {

			exeR.exe_sts_typ(MAC_EXE_STS_TYP.SKP.value());
		}

		protected void crtPrmsRecvIfWk(MCList<MST_PRMS_RECV_IF_R> prmsRecvIfL, MCQueryApiBuilder prmsRecvIfL_bldr) {

			dbWkDelete("MSLAL5030_MSW_PRMS_RECV_IF_D02", prmsRecvIfL_bldr.getBaseDbc());
			dbWkInsert("MSLAL5030_MSW_PRMS_RECV_IF_I01", prmsRecvIfL, prmsRecvIfL_bldr.getBaseDbc());
		}

		protected MapUpd04<PoPrmsRecvIf_Chk01_DtlR, MST_PRMS_RECV_IF_R> createMapUpd04() {
			return new MapUpd04<PoPrmsRecvIf_Chk01_DtlR, MST_PRMS_RECV_IF_R>();
		}

		public class MapUpd04<D extends PoPrmsRecvIf_Chk01_DtlR, S extends MST_PRMS_RECV_IF_R> extends MCRowMapper<D, S> {
			@Override
			public void valueCopy(D dest, S src) {
				dest.prms(src);
			}
		}
	}

	/**
	 * PoPrmsRecvIf_Chk01オペレーション.<p>
	 *
	 * 納期回答受信ＩＦ取込前のチェックを行う。<br>
	 */
	public class PoPrmsRecvIf_Chk01 extends MSLAL_PoPrmsRecvIfService_MC_A.PoPrmsRecvIf_Chk01 {

		// MSBDL0120.Chk02の上り電文（＝本処理の下り電文）
		protected MCList<Chk02_HdrR> _down1L;

		protected MCList<Chk02_DtlR> _down2L;

		// データキャッシュ
		protected MCList<MST_PRMS_RCPT_R> _prmsL;

		protected MCList<MST_PRMS_RCPT_D_R> _prmsDL;

		protected MST_PO_D_R _poDR;

		protected MCList<MST_DLV_INST_R> _dlvInstL;

		protected MCList<MST_DLV_INST_D_R> _dlvInstDL;

		protected MST_ARR_PR_R _prR;

		protected MCList<MST_ARR_SCHD_R> _arrSchdL;

		protected MCList<MST_PURC_SCHD_R> _purcSchdL;

		protected MCList<MAVM_ITM_UNIT_R> _itmUnit;

		protected MCList<MST_MFG_INST_R> _mfgInstL;

		protected MCList<MST_PURC_ACT_D_R> _purcActDL;

		protected MCList<MST_PO_R> _poL;

		protected MCList<MST_PO_D_R> _poDL;

		protected MCList<MST_ARR_PR_R> _prL;

		// キャッシュのインデックス
		// 納入指示明細NO
		protected MCIndexKey _dlvInstDKey;
		
		// 納入指示NO、納入指示改訂番号
		protected MCIndexKey _dlvInstKey;
		
		// 納入指示NO
		protected MCIndexKey _dlvInstPK;

		// 単位CD
		protected MCIndexKey _itmUnitKey;

		// 納入指示明細NO
		protected MCIndexKey _arrSchdDlvKey;

		// 納期回答受領明細NO
		protected MCIndexKey _arrSchdPrmsKey;

		// 納期回答受領NO
		protected MCIndexKey _prmsKey;

		// 入荷予定NO
		protected MCIndexKey _purcSchdKey;

		// 製造指図NO
		protected MCIndexKey _mfgInstKey;

		// 仕入実績明細NO
		protected MCIndexKey _purcActDKey;

		// 入荷進捗NO
		protected MCIndexKey _prKey;
		// 発注NO
		protected MCIndexKey _poKey;
		// 発注明細NO
		protected MCIndexKey _poDKey;
		// 入荷予定の入荷進捗NO
		protected MCIndexKey _arrPrKey;
		// 仕入実績の入荷進捗NO
		protected MCIndexKey _purcPrKey;
		protected int _hdrPegNo;

		protected int _dtlPegNo;

		protected final String SCHD_ACT_QTY = "actQty";

		protected final String SCHD_REM_QTY = "remQty";

		protected final String SCHD_AVAIL_QTY = "availQty";

		protected final String INST_REM_QTY = "remQty";

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			initProc();
			cacheLockArrPr();
			cachePo();
			complUp();
			return msgL;
		}

		protected void complUp() {
			if (!isNull(_poL) && !_poL.isEmpty()) {				
				for (MST_PO_R r : _poL) {
					up0().stream().filter(dtlR -> dtlR.po_no().equals(r.po_no()))
					.forEach(dtlR -> {
						dtlR.setStringNE(PoPrmsRecvIf_Chk01_DtlR.$wg_cd, r.wg_cd());
						dtlR.setStringNE(PoPrmsRecvIf_Chk01_DtlR.$purc_usr_cd, r.purc_usr_cd());
					});
				}
			}
			// データ更新区分が「削除」の行はステータスを「DELETE」に変更する
			for (PoPrmsRecvIf_Chk01_DtlR r : up0()) {
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					r.setStatus(Status.DELETE);
				}
			}
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			if (getNotErrL().isEmpty()) {
				setHdrErr(msgL);
				return msgL;
			}
			cache();
			for (MCList<PoPrmsRecvIf_Chk01_DtlR> l : 
				getNotErrL().groupList(PoPrmsRecvIf_Chk01_DtlR.$po_d_no)) {
				check(msgL, l);
				setHdrErr(msgL, l);
			}
			if (getNotErrL().isEmpty()) {
				setHdrErr(msgL);
				return msgL;
			}
			compl();
			return msgL;
		}

		@Override
		protected void doIt() {

			super.doIt();

			if (!getNotErrL().isEmpty()) {
				callPrmsChk01();
			}
			setDown();
		}

		protected void initProc() {
			_down1L = MCList.create(Chk02_HdrR.class);
			_down2L = MCList.create(Chk02_DtlR.class);

			_prmsL = MCList.create(MST_PRMS_RCPT_R.class);
			_prmsDL = MCList.create(MST_PRMS_RCPT_D_R.class);
			_poDR = MST_PO_D_R.create();
			_dlvInstL = MCList.create(MST_DLV_INST_R.class);
			_dlvInstDL = MCList.create(MST_DLV_INST_D_R.class);
			_prR = MST_ARR_PR_R.create();
			_arrSchdL = MCList.create(MST_ARR_SCHD_R.class);
			_purcSchdL = MCList.create(MST_PURC_SCHD_R.class);
			_itmUnit = MCList.create(MAVM_ITM_UNIT_R.class);
			_mfgInstL = MCList.create(MST_MFG_INST_R.class);
			_purcActDL = MCList.create(MST_PURC_ACT_D_R.class);
			_dlvInstDKey = null;
			_dlvInstKey = null;
			_dlvInstPK = null;
			_itmUnitKey = null;
			_arrSchdDlvKey = null;
			_arrSchdPrmsKey = null;
			_prmsKey = null;
			_purcSchdKey = null;
			_mfgInstKey = null;
			_purcActDKey = null;
			_hdrPegNo = 0;
			_dtlPegNo = 0;
			_poL = MCList.create(MST_PO_R.class);
			_poDL = MCList.create(MST_PO_D_R.class);
			_prL = MCList.create(MST_ARR_PR_R.class);
			_poKey = null;
			_poDKey = null;
			_prKey = null;
			_arrPrKey = null;
			_purcPrKey = null;
			setPegNo(up0());
		}

		protected void cache() {

			cachePrms();
			cacheDlvInst();
			cacheArrPurcSchd();
			cacheItmUnit();
			cacheMfgInst();
		}

		protected void cachePrms() {
			MST_PRMS_RCPT_R prmsL_t = MST_PRMS_RCPT_R.create("T");
			MCQueryApiBuilder prmsL_bldr = MCQueryApiBuilder.create(prmsL_t);
			prmsL_bldr.setWhere(prmsL_t.po_d_no.eq(bind("po_d_no")));
			dbSelect("MSLAL5030_MST_PRMS_RCPT_S01", _prmsL, prmsL_bldr, getNotErrL());
			_prmsKey = _prmsL.createIndex(MST_PRMS_RCPT_R.$prms_rcpt_no);

			if (!isNull(_prmsL)) {
				MST_PRMS_RCPT_D_R prmsDL_t = MST_PRMS_RCPT_D_R.create("T");
				MCQueryApiBuilder prmsDL_bldr = MCQueryApiBuilder.create(prmsDL_t);
				prmsDL_bldr.setWhere(prmsDL_t.prms_rcpt_no.eq(bind("prms_rcpt_no")));
				dbSelect("MSLAL5030_MST_PRMS_RCPT_D_S01", _prmsDL, prmsDL_bldr, _prmsL);
			}
		}

		protected void cachePo() {
			MAM_ITM_R itm = MAM_ITM_R.create("ITM");
			MAM_LOC_R loc = MAM_LOC_R.create("LOC");
			MAM_BP_R bp = MAM_BP_R.create("BP");
			
			MST_PO_D_R poDL_t = MST_PO_D_R.create("T");
			MCQueryApiBuilder poDL_bldr = MCQueryApiBuilder.create(poDL_t);
			poDL_bldr.addSelect(itm.dec_place.as("base_unit_dec_place"));
			poDL_bldr.addSelect(itm.rnd_typ.as("base_unit_rnd_typ"));
			poDL_bldr.addSelect(loc.wg_cd.as("in_to_loc_wg_cd"));
			poDL_bldr.addSelect(loc.sppl_cd.as("outsrc_sppl_cd"));
			poDL_bldr.addSelect(loc.site_cd);
			poDL_bldr.addSelect(loc.cal_cd.as("in_to_loc_cal_cd"));
			poDL_bldr.addSelect(loc.lg_grp_cd);
			poDL_bldr.addSelect(bp.dlv_cal_cd);
			poDL_bldr.addLeftOuterJoin(itm,
					bracket( poDL_t.itm_cd.eq(itm.itm_cd)
							.and(poDL_t.itm_sub1.eq(itm.itm_sub1))
							.and(poDL_t.itm_sub2.eq(itm.itm_sub2))
							.and(poDL_t.itm_sub3.eq(itm.itm_sub3))));
			poDL_bldr.addLeftOuterJoin(loc, bracket( poDL_t.in_to_loc_cd.eq(loc.loc_cd)));
			poDL_bldr.addLeftOuterJoin(bp, bracket( poDL_t.dlv_cd.eq(bp.bp_cd)));
			poDL_bldr.setWhere(poDL_t.po_d_no.eq(bind("po_d_no")));
			dbSelect("MSLAL5030_MST_PO_D_S01", _poDL, poDL_bldr, up0());
			_poDKey = _poDL.createIndex(MST_PO_D_R.$po_d_no);

			MCQueryApiBuilder poL_bldr = MCQueryApiBuilder.create(MST_PO_R.create("T"));
			dbSelectKey("MSLAL5030_MST_PO_S01", _poL, poL_bldr, _poDL);
			_poKey = _poL.createIndex(MST_PO_R.$po_no);
		}

		protected void cacheDlvInst() {
			MAM_LOC_R loc = MAM_LOC_R.create("LOC");

			MST_DLV_INST_R dlvInstL_t = MST_DLV_INST_R.create("T");
			MCQueryApiBuilder dlvInstL_bldr = MCQueryApiBuilder.create(dlvInstL_t);
			dlvInstL_bldr.setWhere(dlvInstL_t.po_d_no.eq(bind("po_d_no")));
			dbSelect("MSLAL5030_MST_DLV_INST_S01", _dlvInstL, dlvInstL_bldr, getNotErrL());
			_dlvInstKey = _dlvInstL.createIndex(MST_DLV_INST_R.$dlv_inst_no, MST_DLV_INST_R.$dlv_inst_rev);
			_dlvInstPK = _dlvInstL.createIndex(MST_DLV_INST_R.$dlv_inst_no);

			if (!isNull(_dlvInstL)) {
				MST_DLV_INST_D_R dlvInstDL_t = MST_DLV_INST_D_R.create("T");
				MCQueryApiBuilder dlvInstDL_bldr = MCQueryApiBuilder.create(dlvInstDL_t);
				dlvInstDL_bldr.addSelect(loc.wg_cd.as("in_to_loc_wg_cd"));
				dlvInstDL_bldr.addSelect(loc.sppl_cd.as("outsrc_sppl_cd"));
				dlvInstDL_bldr.addSelect(loc.site_cd);
				dlvInstDL_bldr.addSelect(loc.cal_cd.as("in_to_loc_cal_cd"));
				dlvInstDL_bldr.addSelect(loc.lg_grp_cd);
				dlvInstDL_bldr.setWhere(dlvInstDL_t.dlv_inst_no.eq(bind("dlv_inst_no")));
				dlvInstDL_bldr.addLeftOuterJoin(loc, bracket(dlvInstDL_t.in_to_loc_cd.eq(loc.loc_cd)));
				dbSelect("MSLAL5030_MST_DLV_INST_D_S01", _dlvInstDL, dlvInstDL_bldr, _dlvInstL);
				_dlvInstDKey = _dlvInstDL.createIndex(MST_DLV_INST_D_R.$dlv_inst_d_no);
			}

		}

		protected void cacheLockArrPr() {
			MST_ARR_PR_R prL_t = MST_ARR_PR_R.create("T");
			MCQueryApiBuilder prL_bldr = MCQueryApiBuilder.create(prL_t);
			prL_bldr.setWhere(prL_t.po_d_no.eq(bind("po_d_no")));
			dbSelectForUpdateNoWait("MSLAL5030_MST_ARR_PR_S01", _prL, prL_bldr, up0());

			_prKey = _prL.createIndex(MST_ARR_PR_R.$po_d_no);
		}

		protected void cacheArrPurcSchd() {

			if (!isNull(_prL)) {
				// 回答可能数量（外注品の場合を除く）
				_arrSchdL.addNumberColumn(SCHD_AVAIL_QTY);
				// 実績（実績・打切）数量
				_arrSchdL.addNumberColumn(SCHD_ACT_QTY);
				// 割当可能数量の初期値
				_arrSchdL.addNumberColumn(SCHD_REM_QTY);
				
				MST_ARR_SCHD_R arrSchdL_t = MST_ARR_SCHD_R.create("T");
				MCQueryApiBuilder arrSchdL_bldr = MCQueryApiBuilder.create(arrSchdL_t);
				MST_ARR_PR_R t2 = MST_ARR_PR_R.create("T2");
				_arrSchdL.addStringColumn(MST_PO_D_R.$po_d_no);
				arrSchdL_bldr.addSelect(t2.po_d_no);
				arrSchdL_bldr.addInnerJoin(t2, arrSchdL_t.arr_pr_no.eq(t2.arr_pr_no));
				arrSchdL_bldr.setWhere(arrSchdL_t.arr_pr_no.eq(bind("arr_pr_no")));
				dbSelect("MSLAL5030_MST_ARR_SCHD_S01", _arrSchdL, arrSchdL_bldr, _prL);
				_arrPrKey = _arrSchdL.createIndex(MST_ARR_SCHD_R.$arr_pr_no);
				_arrSchdDlvKey = _arrSchdL.createIndex(MST_ARR_SCHD_R.$dlv_inst_d_no);
				_arrSchdPrmsKey = _arrSchdL.createIndex(MST_ARR_SCHD_R.$prms_rcpt_d_no);

				MST_PURC_SCHD_R purcSchdL_t = MST_PURC_SCHD_R.create("T");
				MCQueryApiBuilder purcSchdL_bldr = MCQueryApiBuilder.create(purcSchdL_t);
				purcSchdL_bldr.setWhere(purcSchdL_t.arr_pr_no.eq(bind("arr_pr_no")));
				dbSelect("MSLAL5030_MST_PURC_SCHD_S01", _purcSchdL, purcSchdL_bldr, _prL);
				_purcPrKey = _purcSchdL.createIndex(MST_PURC_SCHD_R.$arr_pr_no);
				_purcSchdKey = _purcSchdL.createIndex(MST_PURC_SCHD_R.$arr_schd_no);
			}
		}

		protected void cacheItmUnit() {
			MAVM_ITM_UNIT_R itmUnit_t = MAVM_ITM_UNIT_R.create("T");
			MCQueryApiBuilder itmUnit_bldr = MCQueryApiBuilder.create(itmUnit_t);
			itmUnit_bldr.setWhere(itmUnit_t.itm_cd.eq(bind("itm_cd"))
					.and(itmUnit_t.itm_sub1.eq(bind("itm_sub1")))
					.and(itmUnit_t.itm_sub2.eq(bind("itm_sub2")))
					.and(itmUnit_t.itm_sub3.eq(bind("itm_sub3"))));
			dbSelect("MSLAL5030_MAVM_ITM_UNIT_S01", _itmUnit, itmUnit_bldr, _poDL);
			// 品目は全行で同じなので単位CDだけのインデックス
			_itmUnitKey = _itmUnit.createIndex(MAVM_ITM_UNIT_R.$unit_cd, MAVM_ITM_UNIT_R.$itm_cd,
					MAVM_ITM_UNIT_R.$itm_sub1, MAVM_ITM_UNIT_R.$itm_sub2, MAVM_ITM_UNIT_R.$itm_sub3);
		}

		protected void cacheMfgInst() {

			
			MCList<MST_PO_D_R> l = MCList.create(MST_PO_D_R.class);
			_poDL.stream().filter(r -> r.outsrc_flg()).forEach(r -> l.add(r));
			
			_mfgInstL.addNumberColumn(INST_REM_QTY);
			// 割当可能残数の初期値
			MST_MFG_INST_R mfgInstL_t = MST_MFG_INST_R.create("T");
			MCQueryApiBuilder mfgInstL_bldr = MCQueryApiBuilder.create(mfgInstL_t);
			mfgInstL_bldr.addSelect(mfgInstL_t.base_unit_inst_qty.as("remqty"));
			mfgInstL_bldr.setWhere(mfgInstL_t.po_d_no.eq(bind("po_d_no")));
			mfgInstL_bldr.addWhereWithAnd(mfgInstL_t.can_flg.eq(value(false)));
			mfgInstL_bldr.addWhereWithAnd(mfgInstL_t.abort_flg.eq(value(false)));
			mfgInstL_bldr.addOrderByAsc(mfgInstL_t.rqst_dlv_rqst_tm);
			dbSelect("MSLAL5030_MST_MFG_INST_S01", _mfgInstL, mfgInstL_bldr, l);
			_mfgInstKey = _mfgInstL.createIndex(MST_MFG_INST_R.$mfg_inst_no);
		}

		/**
		 * マスタ、トランザクションから補完する
		 */
		protected void complMasterTran() {
			for (PoPrmsRecvIf_Chk01_DtlR r : getNotErrL()) {	
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) continue;
				MST_PO_D_R poDR = _poDL.getFirst(_poDKey, r.po_d_no());
				r.base_unit_qty(getBaseUnitQty(r.trd_unit_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(),
						r.itm_sub3(), r.trd_unit_qty(), poDR));
			}
			// 仕入予定日を計算
			callPurcUtilSrch01();
		}

		protected MCNumber getBaseUnitQty(String trdUnitCd, String itm_cd, String itm_sub1, String itm_sub2,
				String itm_sub3, MCNumber trdUnitQty, MST_PO_D_R poDR) {
			// 基準単位数量を設定
			MAVM_ITM_UNIT_R trdUnitR = _itmUnit.getFirst(_itmUnitKey, trdUnitCd, itm_cd, itm_sub1, itm_sub2, itm_sub3);
			MCNumber baseUnitQty = convToBaseUnit(trdUnitQty, trdUnitR.conv_base_qty(), trdUnitR.conv_qty(),
					poDR.getNumberNE("base_unit_dec_place"), poDR.getStringNE("base_unit_rnd_typ"));
			return nvl(baseUnitQty, MCNumber.ZERO);
			
		}

		protected MCNumber getTrdUnitQty(String trdUnitCd, String itm_cd, String itm_sub1, String itm_sub2,
				String itm_sub3, MCNumber baseUnitQty) {
			MAVM_ITM_UNIT_R itmUnitR = _itmUnit.getFirst(_itmUnitKey, trdUnitCd, itm_cd, itm_sub1, itm_sub2, itm_sub3);
			MCNumber trdUnitQty = rvrsBaseUnitConv(baseUnitQty, itmUnitR.conv_base_qty(), itmUnitR.conv_qty(), itmUnitR.dec_place(),
					itmUnitR.rnd_typ(), false);
			return trdUnitQty;
		}

		protected void callPurcUtilSrch01() {

			MSBDL_PurcUtil.PurcUtil_Srch01 purcUtilSrch01 = MSBDL_PurcUtil.crtPurcUtil_Srch01();
			MCList<PoPrmsRecvIf_Chk01_DtlR> tgtL = MCList.create(PoPrmsRecvIf_Chk01_DtlR.class);

			for (PoPrmsRecvIf_Chk01_DtlR upR : getNotErrL()) {
				if (MAC_DATA_CRUD_TYP.isDEL(upR.data_crud_typ())) continue;
				MST_PO_D_R poDR = _poDL.getFirst(_poDKey, upR.po_d_no());
				if (upR.subcon_flg() || MAC_PURC_BASIS_TYP.isARR_BASIS(poDR.purc_basis_typ())) {
					// 下請対象発注先または仕入計上区分が入荷基準の場合、回答納入日を仕入予定日に設定する
					upR.purc_schd_dt(upR.prms_dlv_tm().trunc(MCDateFieldType.DAY));
				}
				else {
					tgtL.add(upR);
				}
			}
			if (!tgtL.isEmpty()) {
				MapPurcUtil<PurcUtil_Srch01_DtlR, PoPrmsRecvIf_Chk01_DtlR> mapper = createMapPurcUtil();
				tgtL.forEach(tgtR -> {
					MST_PO_D_R poDR = _poDL.getFirst(_poDKey, tgtR.po_d_no());
					mapper.setPoDR(poDR);
					PurcUtil_Srch01_DtlR r = PurcUtil_Srch01_DtlR.create();
					copy(r, tgtR, mapper);
					purcUtilSrch01.up0().add(r);
				});
				purcUtilSrch01.exec();
				String[] srcCols = { PurcUtil_Srch01_DtlR.$purc_schd_dt };
				String[] destCols = { PoPrmsRecvIf_Chk01_DtlR.$purc_schd_dt };
				copyByPegNo(tgtL, destCols, purcUtilSrch01.down0(), srcCols);
			}
		}

		protected void compl() {
			complMasterTran();
			complChk02Up();
		}

		protected void sortUp() {
			// 納入指示明細NOが指定されている場合は、納入指示明細NOに紐づく入荷予定に回答数量を割り当てる
			// 納入指示明細NOが指定されている場合は、回答納入日時の昇順で入荷予定に割り当てる
			up0().sort(PoPrmsRecvIf_Chk01_DtlR.$dlv_inst_d_no, PoPrmsRecvIf_Chk01_DtlR.$prms_dlv_tm);
		}
		
		/**
		 * MSBDL0120.Chk02を実行するための電文を作成する
		 */
		protected void complChk02Up() {

			_down1L = MCList.create(Chk02_HdrR.class);
			_down2L = MCList.create(Chk02_DtlR.class);

			MCList<PoPrmsRecvIf_Chk01_DtlR> upL = getNotErrL();
			upL.sort(PoPrmsRecvIf_Chk01_DtlR.$dlv_inst_d_no, PoPrmsRecvIf_Chk01_DtlR.$prms_dlv_tm);
			// 発注明細単位に処理する
			for (MCList<PoPrmsRecvIf_Chk01_DtlR> dtlL : upL.groupList(
					PoPrmsRecvIf_Chk01_DtlR.$po_d_no)) {
				MCIndexKey key = dtlL.createIndex(PoPrmsRecvIf_Chk01_DtlR.$data_crud_typ);
				MCList<PoPrmsRecvIf_Chk01_DtlR> delL = dtlL.subList(key, MAC_DATA_CRUD_TYP.DEL.value());
				MCList<PoPrmsRecvIf_Chk01_DtlR> insL = dtlL.subList(key, MAC_DATA_CRUD_TYP.CRT.value());
				MCList<PoPrmsRecvIf_Chk01_DtlR> updL = dtlL.subList(key, MAC_DATA_CRUD_TYP.UPD.value());
				
				// 新規・訂正は区別しないので、一つのリストにまとめる
				MCList<PoPrmsRecvIf_Chk01_DtlR> insUpdL = MCList.create(PoPrmsRecvIf_Chk01_DtlR.class);
				insUpdL.addAll(insL);
				insUpdL.addAll(updL);
				
				// 全削除
				// 削除対象が無い場合は処理しないで終了させる
				if (dtlL.size() == delL.size()) {
					delPrms(true, delL);
				}
				// 新規
				// ※MST_PRMS_RCPTのデータが存在しない場合は、新規の納期回答受領情報を作成
				// ※MST_PRMS_RCPTのデータが存在する場合は、削除可能な回答を削除してから新規の納期回答受領情報を作成（更新の分岐）
				else if (isNull(_prmsL.subList(
						r -> r.po_d_no().equals(dtlL.get(0).po_d_no())))) {
					crtPrms(insUpdL);
				}
				// 更新
				else {
					updPrms(insUpdL);
				}
			}
		}

		protected void updPrms(MCList<PoPrmsRecvIf_Chk01_DtlR> insUpdL) {
			PoPrmsRecvIf_Chk01_DtlR upR = insUpdL.get(0);
			// 「入荷予定反映」がオンの納期回答を登録する場合のみ、既存の納期回答を削除
			if (!upR.prms_recv_flg()) {
				delPrms(false, insUpdL);
			}
			crtPrms(insUpdL);
		}

		protected void crtPrms(MCList<PoPrmsRecvIf_Chk01_DtlR> insUpdL) {
			setChk02UpForCrt(insUpdL);
		}

		/**
		 * 削除可能な回答を全て削除ステータスにする。
		 */
		protected void delPrms(boolean isAllDel, MCList<PoPrmsRecvIf_Chk01_DtlR> dtlL) {
			MapChk02HdrForDel<Chk02_HdrR, MST_PRMS_RCPT_R, MST_ARR_PR_R> mpr = createMapChk02HdrForDel();
			// 登録データがあるか
			// 完了の入荷予定に紐づく回答の場合は削除できないので登録対象にならない。それ以外のデータが含まれるかを表す。
			boolean hasRegData = false;
			
			MCList<MST_PRMS_RCPT_D_R> prmsDL = MCList.create(MST_PRMS_RCPT_D_R.class);
			MCIndexKey prmsDKey = _prmsDL.createIndex(MST_PRMS_RCPT_D_R.$prms_rcpt_no);
			for (MST_PRMS_RCPT_R row : _prmsL.subList("po_d_no", dtlL.get(0).po_d_no())) {
				prmsDL.addAll(_prmsDL.subList(prmsDKey,row.prms_rcpt_no()));
			}
			
			for (MCList<MST_PRMS_RCPT_D_R> dL : prmsDL.groupList(MST_PRMS_RCPT_D_R.$prms_rcpt_no)) {
				_hdrPegNo++;
				// ヘッダを取り消すか
				boolean isHdrDel = true;

				// 更新対象があるか（納期回答受領ヘッダ単位）
				boolean hasRegDataForHdr = false;
				MST_PRMS_RCPT_R hR = _prmsL.getFirst(_prmsKey, dL.get(0).prms_rcpt_no());

				_poDR = _poDL.getFirst(_poDKey, hR.po_d_no());
				MST_ARR_PR_R prR = _prL.getFirst(_prKey, hR.po_d_no());
				mpr.setWith(prR);
				// 入荷予定未反映の場合は、ヘッダ・明細を全て削除
				if (!hR.arr_schd_refl_flg()) {
					mpr.setDataCrudTyp(MAC_DATA_CRUD_TYP.DEL.value());
					delPrmsHdrDtl(hR, dL, mpr, _hdrPegNo);
					hasRegData = true;
					hasRegDataForHdr = true;
					continue;
				}
				for (MST_PRMS_RCPT_D_R dr : dL) {

					MST_ARR_SCHD_R arrSchdR = _arrSchdL.getFirst(_arrSchdPrmsKey, dr.prms_rcpt_d_no());
					// 入荷予定に紐づかない回答を削除
					if (isNull(arrSchdR)) {
						delPrmsDtl(dr, _hdrPegNo);
						hasRegData = true;
						hasRegDataForHdr = true;
						continue;
					}

					// 入荷予定に紐づく回答は、削除可能かを判定（実績が発生しているかどうか）する。
					// ・実績が発生していない場合
					// 回答を削除する。
					// ・実績が発生している場合
					// 実績数分を残して回答を更新する。実績が発生していない場合は回答を削除する。
					MST_PURC_SCHD_R purcSchdR = _purcSchdL.getFirst(_purcSchdKey, arrSchdR.arr_schd_no());
					if (canDelSchd(arrSchdR, purcSchdR)) {
						delPrmsDtl(dr, _hdrPegNo);
						hasRegData = true;
						hasRegDataForHdr = true;
						continue;
					}
					else if (isNull(arrSchdR.rcpt_iv_mng_no())) {
						MCNumber[] qtys = getActAvailQty(arrSchdR);
						// 完了（回答可能数量が0以下）の入荷予定は上り電文に含めないようにする
						if (!qtys[1].isPositive()) {
							isHdrDel = false;
							continue;
						}
						// 実績数分を残して更新する。過入荷の場合は「納期回答受領明細トランの数量＜実績数」となるので
						// 残す数量をmin(実績数量、納期回答受領明細トランの数量）としている。
						updPrmsDtl(dr, _hdrPegNo, MCNumber.min(qtys[0], dr.base_unit_qty()));
						hasRegData = true;
						hasRegDataForHdr = true;
					}
					else {
						isHdrDel = false;
						continue;
					}
					isHdrDel = false;

				}

				if (isHdrDel) {
					mpr.setDataCrudTyp(MAC_DATA_CRUD_TYP.DEL.value());
					delPrmsHdr(hR, mpr, _hdrPegNo);
				}
				else if (hasRegDataForHdr) {
					mpr.setDataCrudTyp(MAC_DATA_CRUD_TYP.UPD.value());
					delPrmsHdr(hR, mpr, _hdrPegNo);
				}
			}
			// isAllDel：全削除の場合にtrue。更新（全削除してから新規の回答を登録）の場合はfalse。
			if (isAllDel && !hasRegData) {
				for (PoPrmsRecvIf_Chk01_DtlR r : dtlL) {
					r.err_flg(true);
					setErrSts(r.prms());
					MCMessagePool.add(new MCMessage(r, null, MSLAL0208, r.data_no(), r.data_lno(), r.po_d_no()));
				}
			}
		}

		protected void delPrmsHdr(MST_PRMS_RCPT_R hR, MapChk02HdrForDel<Chk02_HdrR, MST_PRMS_RCPT_R, MST_ARR_PR_R> mpr, int hdrPegNo) {
			Chk02_HdrR addR = Chk02_HdrR.create();
			copy(addR, hR, mpr);
			addR.peg_no(hdrPegNo);
			addR.is_src_batch_flg(true);
			addR.setAttributes(up0().getFirst("po_d_no", hR.po_d_no()));
			_down1L.add(addR);
		}

		protected void delPrmsDtl(MCList<MST_PRMS_RCPT_D_R> dL, int hdrPegNo) {
			MCList<Chk02_DtlR> addL = MCList.create(Chk02_DtlR.class);
			MapChk02DtlForDel<Chk02_DtlR, MST_PRMS_RCPT_D_R> mpr = createMapChk02DtlForDel();
			mpr.setPoDR(_poDR);
			addAll(addL, dL, mpr);
			MST_PRMS_RCPT_R row = _prmsL.getFirst(_prmsKey, dL.get(0).prms_rcpt_no());
			addL.setAttributes(up0().getFirst("po_d_no", row.po_d_no()));
			addL.setNumber(Chk02_DtlR.$hdr_peg_no, hdrPegNo);
			_down2L.addAll(addL);
		}

		protected void delPrmsDtl(MST_PRMS_RCPT_D_R dR, int hdrPegNo) {
			Chk02_DtlR addR = Chk02_DtlR.create();
			MapChk02DtlForDel<Chk02_DtlR, MST_PRMS_RCPT_D_R> mpr = createMapChk02DtlForDel();
			mpr.setPoDR(_poDR);
			copy(addR, dR, mpr);
			addR.setNumber(Chk02_DtlR.$hdr_peg_no, hdrPegNo);
			MST_PRMS_RCPT_R row = _prmsL.getFirst(_prmsKey, dR.prms_rcpt_no());
			addR.setAttributes(up0().getFirst("po_d_no", row.po_d_no()));
			_down2L.add(addR);
		}

		protected void updPrmsDtl(MST_PRMS_RCPT_D_R dR, int hdrPegNo, MCNumber baseUnitQty) {
			Chk02_DtlR addR = Chk02_DtlR.create();
			MapChk02DtlForDel<Chk02_DtlR, MST_PRMS_RCPT_D_R> mpr = createMapChk02DtlForDel();
			mpr.setPoDR(_poDR);
			copy(addR, dR, mpr);
			// 数量とデータ更新区分を更新用に再設定
			addR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			MCNumber trdUnitQty = getTrdUnitQty(addR.trd_unit_cd(), addR.itm_cd(),
					addR.itm_sub1(), addR.itm_sub2(), addR.itm_sub3(), baseUnitQty);
			addR.base_unit_qty(baseUnitQty);
			addR.trd_unit_qty(trdUnitQty);
			addR.setNumber(Chk02_DtlR.$hdr_peg_no, hdrPegNo);
			MST_PRMS_RCPT_R row = _prmsL.getFirst(_prmsKey, dR.prms_rcpt_no());
			addR.setAttributes(up0().getFirst("po_d_no", row.po_d_no()));
			_down2L.add(addR);
		}

		protected void delPrmsHdrDtl(MST_PRMS_RCPT_R hR, MCList<MST_PRMS_RCPT_D_R> dL,
				MapChk02HdrForDel<Chk02_HdrR, MST_PRMS_RCPT_R, MST_ARR_PR_R> mpr, int hdrPegNo) {
			delPrmsHdr(hR, mpr, hdrPegNo);
			delPrmsDtl(dL, hdrPegNo);
		}

		/**
		 * 入荷予定、仕入予定を削除できるか。 実績が発生していない場合に入荷予定を削除できる。
		 */
		protected boolean canDelSchd(MST_ARR_SCHD_R arrSchdR, MST_PURC_SCHD_R purcSchdR) {
			return arrSchdR.arr_qty().isZero() && arrSchdR.abort_qty().isZero() && purcSchdR.base_unit_purc_qty().isZero()
					&& purcSchdR.base_unit_abort_qty().isZero() && purcSchdR.base_unit_accpt_dfct_qty().isZero()
					&& isNull(arrSchdR.rcpt_iv_mng_no());
		}

		protected void check(MCMessageList msgL, MCList<PoPrmsRecvIf_Chk01_DtlR> dtlL) {
			PoPrmsRecvIf_Chk01_DtlR upR = dtlL.get(0);
			MST_PO_R poR = _poL.getFirst(_poKey, upR.po_no());
			MST_PO_D_R poDR = _poDL.getFirst(_poDKey, upR.po_d_no());
			if (dtlL.groupBy(PoPrmsRecvIf_Chk01_DtlR.$po_rev).size() > 1) {
				for (PoPrmsRecvIf_Chk01_DtlR r : dtlL) {
					r.err_flg(true);
					setErrSts(r.prms());
					msgL.add(new MCMessage(r, null, MSLAL0218, r.data_no(), r.data_lno(), r.po_no(), r.po_d_no(), r.po_rev()));
				}
				return;
			}
			if (isNull(poDR) || poDR.isEmpty()) {
				for (PoPrmsRecvIf_Chk01_DtlR r : dtlL) {
					r.err_flg(true);
					setErrSts(r.prms());
					msgL.add(new MCMessage(r, null, MSLAL0176, r.data_no(), r.data_lno(), r.po_d_no()));
				}
				return;
			}
			// この時点ではどの行でも発注NO、発注明細NO、発注改訂番号は同じなので、0番目をチェックに使用する
			if (isNull(poR) || poR.isEmpty() || isNull(upR.po_rev()) && !isSame(upR.po_no(), poR.po_no())) {
				for (PoPrmsRecvIf_Chk01_DtlR r : dtlL) {
					r.err_flg(true);
					setErrSts(r.prms());
					msgL.add(new MCMessage(r, null, MSLAL0034, r.data_no(), r.data_lno(), r.po_no()));
				}
				return;
			}
			if (!isNull(upR.po_rev()) && (!isSame(upR.po_rev(), poR.po_rev()) || !isSame(upR.po_no(), poR.po_no()))) {
				for (PoPrmsRecvIf_Chk01_DtlR r : dtlL) {
					r.err_flg(true);
					setErrSts(r.prms());
					msgL.add(new MCMessage(r, null, MSLAL0033, r.data_no(), r.data_lno(), r.po_no(), r.po_rev()));
				}
				return;
			}
			if (poDR.can_flg()) {
				for (PoPrmsRecvIf_Chk01_DtlR r : dtlL) {
					r.err_flg(true);
					setErrSts(r.prms());
					msgL.add(new MCMessage(r, null, MSLAL0203, r.data_no(), r.data_lno(), r.po_d_no()));
				}
				return;
			}
			
			boolean hasErrFlg = false;
			for (PoPrmsRecvIf_Chk01_DtlR r : dtlL) {

				MST_ARR_PR_R prR = _prL.getFirst(_prKey, r.po_d_no());
				MCList<MST_ARR_SCHD_R> arrSchdSubL = _arrSchdL.subList(_arrPrKey, prR.arr_pr_no());
				
				boolean isCompl = true;
				for (MST_ARR_SCHD_R arrSchdR : arrSchdSubL) {
					MST_PURC_SCHD_R purcSchdR = _purcSchdL.getFirst(_purcSchdKey, arrSchdR.arr_schd_no());

					if ((!arrSchdR.arr_skip_flg() && arrSchdR.cmpl_flg()) 
							|| (!purcSchdR.non_purc_flg() && purcSchdR.cmpl_flg())
							|| !isNull(arrSchdR.rcpt_iv_no())) {
						continue;
					}
					isCompl = false;
				}
				if (isCompl) {
					hasErrFlg = true;
					r.err_flg(true);
					setErrSts(r.prms());
					msgL.add(new MCMessage(r, null, MSLAL0063, r.data_no(), r.data_lno(), r.po_no(), r.po_d_no()));
				}
			}
			if (hasErrFlg) {
				return;
			}

			for (PoPrmsRecvIf_Chk01_DtlR r : dtlL) {
				if (!isSame(poR.sppl_cd(), r.sppl_cd())) {
					r.err_flg(true);
					setErrSts(r.prms());
					msgL.add(new MCMessage(r, null, MSLAL0035, r.data_no(), r.data_lno(),
							r.po_no(), poR.sppl_cd(), r.sppl_cd()));
				}
				
				if (!isNull(r.itm_cd())) {
					if (!isSame(poDR.itm_cd(), r.itm_cd()) || !isSame(poDR.itm_sub1(), r.itm_sub1())
							|| !isSame(poDR.itm_sub2(), r.itm_sub2()) || !isSame(poDR.itm_sub3(), r.itm_sub3())) {
						r.err_flg(true);
						setErrSts(r.prms());
						msgL.add(new MCMessage(r, null, MSLAL0037, r.data_no(), r.data_lno(), r.po_no(), r.po_d_no(),
								toDispItm(poDR.itm_cd(), poDR.itm_sub1(), poDR.itm_sub2(), poDR.itm_sub3()),
								toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3())));
					}
				}
				
				chkCustomDtlInsUpd(r, msgL);
				
				if (isNull(r.itm_cd()) && isNullOrNullVal(r.itm_sub1()) && isNullOrNullVal(r.itm_sub2()) && isNullOrNullVal(r.itm_sub3())) {
					MST_PO_D_R poDitmR = _poDL.getFirst(_poDKey, r.po_d_no());
					r.itm_cd(poDitmR.itm_cd());
					r.itm_sub1(poDitmR.itm_sub1());
					r.itm_sub2(poDitmR.itm_sub2());
					r.itm_sub3(poDitmR.itm_sub3());
				}
				
				MAVM_ITM_UNIT_R itmUnitR = _itmUnit.getFirst(_itmUnitKey, r.trd_unit_cd(),
						r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				if (isNull(itmUnitR)) {
					r.err_flg(true);
					setErrSts(r.prms());
					msgL.add(new MCMessage(r, null, MSLAL0044, r.data_no(), r.data_lno(), r.po_no(), r.po_d_no(),
							toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), r.trd_unit_cd()));
				}
				
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					continue;
				}
				
				if (!isNull(itmUnitR) && itmUnitR.dec_place().intValue() < r.trd_unit_qty().scale()) {
					r.err_flg(true);
					setErrSts(r.prms());
					msgL.add(new MCMessage(r, null, MSLAL0038, r.data_no(), r.data_lno(), r.po_no(), r.po_d_no(), r.trd_unit_qty(),
							r.trd_unit_cd(), itmUnitR.dec_place()));
				}
				
				if (!isNull(r.dlv_inst_d_no())) {
					if (isNull(_dlvInstDL) || _dlvInstDL.isEmpty()) {
						r.err_flg(true);
						setErrSts(r.prms());
						msgL.add(new MCMessage(r, null, MSLAL0039, r.data_no(), r.data_lno(), r.po_no(), r.po_d_no(), r.dlv_inst_d_no()));
					}
					else {
						MST_DLV_INST_D_R instDR = _dlvInstDL.getFirst(_dlvInstDKey, r.dlv_inst_d_no());
						if (isNull(instDR)) {
							r.err_flg(true);
							setErrSts(r.prms());
							msgL.add(new MCMessage(r, null, MSLAL0039, r.data_no(), r.data_lno(), r.po_no(), r.po_d_no(),
									r.dlv_inst_d_no()));
						}
						else if (instDR.can_flg()) {
							r.err_flg(true);
							setErrSts(r.prms());
							msgL.add(new MCMessage(r, null, MSLAL0040, r.data_no(), r.data_lno(), r.po_no(), r.po_d_no(),
									r.dlv_inst_d_no()));
						}
						else if (!isNull(r.dlv_inst_no()) && !isSame(instDR.dlv_inst_no(), r.dlv_inst_no())) {
							r.err_flg(true);
							setErrSts(r.prms());
							msgL.add(new MCMessage(r, null, MSLAL0221, r.data_no(), r.data_lno(), r.po_d_no(), r.dlv_inst_no(),
									r.dlv_inst_d_no()));
						}
						else if (!isNull(r.dlv_inst_no()) && !isNull(r.dlv_inst_rev())) {
							MST_DLV_INST_R instR = _dlvInstL.getFirst(_dlvInstKey, r.dlv_inst_no(), r.dlv_inst_rev());
							if (isNull(instR)) {
								r.err_flg(true);
								setErrSts(r.prms());
								msgL.add(new MCMessage(r, null, MSLAL0202, r.data_no(), r.data_lno(), r.po_no(), r.po_d_no(),
										r.dlv_inst_no(), r.dlv_inst_rev()));
							}
						}
					}
				}
				else if (!isNull(r.dlv_inst_no()) && isNull(r.dlv_inst_rev())) {
					MST_DLV_INST_R instR = _dlvInstL.getFirst(_dlvInstPK, r.dlv_inst_no());
					if (isNull(instR)) {
						r.err_flg(true);
						setErrSts(r.prms());
						msgL.add(new MCMessage(r, null, MSLAL0180, r.data_no(), r.data_lno(), r.po_d_no(), r.dlv_inst_no()));
					}
				}
				else if (!isNull(r.dlv_inst_no()) && !isNull(r.dlv_inst_rev())) {
					MST_DLV_INST_R instR = _dlvInstL.getFirst(_dlvInstKey, r.dlv_inst_no(), r.dlv_inst_rev());
					if (isNull(instR)) {
						r.err_flg(true);
						setErrSts(r.prms());
						msgL.add(new MCMessage(r, null, MSLAL0202, r.data_no(), r.data_lno(), r.po_no(), r.po_d_no(),
								r.dlv_inst_no(), r.dlv_inst_rev()));
					}
				}

				// 日付チェック
				if (poR.po_dt().gt(r.prms_dlv_tm().trunc(MCDateFieldType.DAY))) {
					r.err_flg(true);
					setErrSts(r.prms());
					msgL.add(new MCMessage(r, null, MSLAL0060, r.data_no(), r.data_lno(),
							r.po_no(), r.po_d_no(), toYMDString(poR.po_dt()),
							toYMDString(r.prms_dlv_tm().trunc(MCDateFieldType.DAY))));
				}
			
				chkCustomDtlDel(r, msgL);
			}

		}

		//新規・更新行のチェック（カスタマイズ用）
		protected void chkCustomDtlInsUpd(PoPrmsRecvIf_Chk01_DtlR r, MCMessageList msgL) {
		}
		//削除行のチェック（カスタマイズ用）
		protected void chkCustomDtlDel(PoPrmsRecvIf_Chk01_DtlR r, MCMessageList msgL) {
		}

		protected void callPrmsChk01() {
			MSBDL_PurcDlvDtAdjstReg.Chk02 chk02 = MSBDL_PurcDlvDtAdjstReg.crtChk02();
			chk02.up0().setAll(_down1L);
			chk02.up1().setAll(_down2L);
			chk02.exec();

			setDown1up0Err(chk02.down0(), chk02.down1());

			// 他のオペレーションでエラーが発生した場合、本処理の上り電文にエラー情報を設定する
			MCList<Chk02_HdrR> hdrErrL = chk02.down0().subList(Chk02_HdrR.$err_flg, true);
			MCList<Chk02_DtlR> dtlErrL = chk02.down1().subList(Chk02_DtlR.$err_flg, true);
			MCIndexKey dtlKey = up0().createIndex(PoPrmsRecvIf_Chk01_DtlR.$dtl_peg_no);
			MCIndexKey hdrKey = up0().createIndex(PoPrmsRecvIf_Chk01_DtlR.$hdr_peg_no);
			MCIndexKey down1Key = chk02.down1().createIndex(Chk02_DtlR.$po_d_no);
			MCMessageList msgL = MCMessagePool.getMessageList();
			for (Chk02_DtlR r : dtlErrL) {
				MCNumber upPegNo = _upMap.get(r.peg_no());
				if (!isNull(upPegNo)) {
					PoPrmsRecvIf_Chk01_DtlR upR = up0().getFirst(dtlKey, r.peg_no());
					if (!isNull(upR)) {
						setUp0ErrMsg(upR, msgL);
						upR.err_flg(true);
					}
				}
				else {
					// 削除データなど上り電文と対応させられないデータでエラーが発生した場合、発注明細NOが同一の全行をエラーにする
					MCList<Chk02_DtlR> dtlPoDL = chk02.down1().subList(down1Key, r.po_d_no());
					for (Chk02_DtlR rr : dtlPoDL) {
						MCNumber upPegNo2 = _upMap.get(rr.peg_no());
						if (!isNull(upPegNo2)) {
							PoPrmsRecvIf_Chk01_DtlR upR = up0().getFirst(dtlKey, rr.peg_no());
							if (!isNull(upR)) {
								setUp0ErrMsg(upR, msgL);
								upR.err_flg(true);
							}
						}
					}
				}
			}
			for (Chk02_HdrR r : hdrErrL) {
				MCList<PoPrmsRecvIf_Chk01_DtlR> upL = up0().subList(hdrKey, r.peg_no());
				for (PoPrmsRecvIf_Chk01_DtlR upR : upL) {
					setUp0ErrMsg(upR, msgL);
					upR.err_flg(true);
				}
			}
			if (!hdrErrL.isEmpty() || !dtlErrL.isEmpty()) {
				setErrSts(up0());
			}
		}

		protected void setDown1up0Err(MCList<Chk02_HdrR> chk02hdr, MCList<Chk02_DtlR> chk02dtl) {
			MCIndexKey hdrKey = chk02dtl.createIndex(Chk02_DtlR.$hdr_peg_no);
			MCIndexKey dtlKey = up0().createIndex(PoPrmsRecvIf_Chk01_DtlR.$hdr_peg_no );
			
			for (Chk02_HdrR hdr : chk02hdr.subList(hdr -> hdr.err_flg())) {
				MCList<Chk02_DtlR> chk02DL = chk02dtl.subList(hdrKey, hdr.peg_no());
				chk02DL.setBooleanNE("err_flg", true);
				
				PoPrmsRecvIf_Chk01_DtlR upR = up0().getFirst(dtlKey, hdr.peg_no());
				if(!isNull(upR)) {
					upR.err_flg(true);
				}
			}
		}
		
		protected void setUp0ErrMsg(PoPrmsRecvIf_Chk01_DtlR up0R, MCMessageList msgL) {
			if(up0R.err_flg()) return;
			
			msgL.add(new MCMessage(up0R, null, MSLAL0030, up0R.data_no(), up0R.data_lno(), up0R.po_no(), up0R.po_d_no()));	
		}

		/**
		 * エラーが発生した場合に実行され、外部システムデータＮＯ、発注ＮＯ、発注明細ＮＯの単位で エラー情報を設定する。
		 */
		protected void setHdrErr(MCMessageList msgL) {
			for (PoPrmsRecvIf_Chk01_DtlR r : up0()) {
				if (!r.err_flg()) {
					msgL.add(new MCMessage(r, null, MSLAL0030, r.data_no(), r.data_lno(), r.po_no(), r.po_d_no()));
					r.err_flg(true);
					setErrSts(r.prms());
				}
			}
		}

		/**
		 * 発注明細ＮＯの単位で エラー情報を設定する。
		 * @param list
		 */
		protected void setHdrErr(MCMessageList msgL, MCList<PoPrmsRecvIf_Chk01_DtlR> list) {
			for (MCList<PoPrmsRecvIf_Chk01_DtlR> l : list
					.groupList(PoPrmsRecvIf_Chk01_DtlR.$po_d_no)) {
				if (hasErrFlgOn(l)) {
					l.stream().filter(r -> !r.err_flg()).forEach(r -> {
						msgL.add(new MCMessage(r, null, MSLAL0030, r.data_no(), r.data_lno(), r.po_no(), r.po_d_no()));
						r.err_flg(true);
						setErrSts(r.prms());
					});
				}
			}
		}

		/**
		 * 同一取込グループにエラーのないリストを返す
		 * @return 
		 */
		protected MCList<PoPrmsRecvIf_Chk01_DtlR> getNotErrL() {
			if (isErrFlgOn()) {
				MCList<PoPrmsRecvIf_Chk01_DtlR> notErrL = up0().createInstance();
				for (MCList<PoPrmsRecvIf_Chk01_DtlR> list : up0().groupList(getGrpKey())) {
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
		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(_down1L);
			down2().setAll(_down2L);
		}

		protected MapPurcUtil<PurcUtil_Srch01_DtlR, PoPrmsRecvIf_Chk01_DtlR> createMapPurcUtil() {
			return new MapPurcUtil<PurcUtil_Srch01_DtlR, PoPrmsRecvIf_Chk01_DtlR>();
		}

		public class MapPurcUtil<D extends PurcUtil_Srch01_DtlR, S extends PoPrmsRecvIf_Chk01_DtlR> extends MCRowMapper<D, S> {
			protected MST_PO_D_R _poDR;
			
			protected void setPoDR(MST_PO_D_R _poDR) {
				this._poDR = _poDR;
			}
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcUtil_Srch01_DtlR.$peg_no, PoPrmsRecvIf_Chk01_DtlR.$peg_no);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$sppl_cd, PoPrmsRecvIf_Chk01_DtlR.$sppl_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$base_unit_qty, PoPrmsRecvIf_Chk01_DtlR.$base_unit_qty);

			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.dlv_rqst_dt(src.prms_dlv_tm().trunc(MCDateFieldType.DAY));
				dest.itm_cd(_poDR.itm_cd());
				dest.itm_sub1(_poDR.itm_sub1());
				dest.itm_sub2(_poDR.itm_sub2());
				dest.itm_sub3(_poDR.itm_sub3());
				dest.mfg_loc_cd(_poDR.mfg_loc_cd());
				dest.maker_cd(_poDR.maker_cd());

				MST_DLV_INST_D_R instDR = null;
				if (_dlvInstDKey != null) {
					instDR = _dlvInstDL.getFirst(_dlvInstDKey, src.dlv_inst_d_no());
				}
				if (!isNull(instDR)) {
					dest.wg_cd(instDR.getStringNE("in_to_loc_wg_cd"));
					dest.in_to_loc_cd(instDR.in_to_loc_cd());
					dest.prov_ddlv_flg(isNull(instDR.getStringNE("outsrc_sppl_cd")) ? false : true);
					dest.site_cd(instDR.getStringNE("site_cd"));
					dest.in_to_loc_cal_cd(instDR.getStringNE("in_to_loc_cal_cd"));
					dest.lg_grp_cd(instDR.getStringNE("lg_grp_cd"));
				}
				else {
					dest.wg_cd(_poDR.getStringNE("in_to_loc_wg_cd"));
					dest.in_to_loc_cd(_poDR.in_to_loc_cd());
					dest.prov_ddlv_flg(isNull(_poDR.getStringNE("outsrc_sppl_cd")) ? false : true);
					dest.site_cd(_poDR.getStringNE("site_cd"));
					dest.in_to_loc_cal_cd(_poDR.getStringNE("in_to_loc_cal_cd"));
					dest.lg_grp_cd(_poDR.getStringNE("lg_grp_cd"));
				}
				dest.bom_ptn(_poDR.bom_ptn());
				dest.dlv_cd(_poDR.dlv_cd());
				dest.sppl_cal_cd(src.sppl_cal_cd());
				dest.dlv_cal_cd(_poDR.getStringNE("dlv_cal_cd"));

			}
		}

		protected void setChk02UpForCrt(MCList<PoPrmsRecvIf_Chk01_DtlR> insUpdL) {

			PoPrmsRecvIf_Chk01_DtlR upR = insUpdL.get(0);
			MST_ARR_PR_R prR = _prL.getFirst(_prKey, upR.po_d_no());
			Chk02_HdrR r = Chk02_HdrR.create();
			_hdrPegNo++;
			r.peg_no(_hdrPegNo);
			r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			r.po_d_no(upR.po_d_no());
			r.arr_pr_no(prR.arr_pr_no());
			r.arr_schd_refl_flg(!upR.prms_recv_flg());
			r.arr_schd_refl_dt(upR.prms_recv_flg() ? null : getToday());
			r.prms_rcpt_dt(getToday());
			r.arr_pr_upd_cntr(prR.upd_cntr());
			r.setAttributes(upR);
			r.is_src_batch_flg(true);
			_down1L.add(r);

			_poDR = _poDL.getFirst(_poDKey, upR.po_d_no());

			setChk02Up1ForCrt(insUpdL, _hdrPegNo, crtAvailPrmsInfo());

		}

		protected MCList<MST_ARR_SCHD_R> crtAvailPrmsInfo() {
			setAvailArrQty();
			// 再入荷以外
			MCList<MST_ARR_SCHD_R> schdL = MCList.create(MST_ARR_SCHD_R.class);
			// 再入荷
			MCList<MST_ARR_SCHD_R> reArrSchdL = MCList.create(MST_ARR_SCHD_R.class);
			// 全部
			MCList<MST_ARR_SCHD_R> allSchdL = MCList.create(MST_ARR_SCHD_R.class);
			for (MST_ARR_SCHD_R schdR : _arrSchdL.groupBy(getPolicy())) {
				if (isNull(schdR.purc_act_d_no())) {
					schdL.add(schdR);
				}
				else {
					reArrSchdL.add(schdR);
				}
			}
			allSchdL.addAll(schdL);

			// 再入荷は再入荷納入希望日時を補完してから、再入荷納入希望日時の昇順で追加する
			setReArrRqstDlvDt(reArrSchdL);
			allSchdL.addAll(reArrSchdL);
			crtAvailPrmsInfoForMfgInst(allSchdL);

			return allSchdL;
		}

		/**
		 * 再入荷の入荷予定に紐づく仕入実績明細を取得
		 * 
		 * @param schdL 再入荷の入荷予定
		 */
		protected void setReArrRqstDlvDt(MCList<MST_ARR_SCHD_R> schdL) {
			schdL.addDateColumn("re_arr_rqst_tm");
			schdL.addBooleanColumn("re_arr_sync_flg");
			MST_PURC_ACT_R act = MST_PURC_ACT_R.create("ACT");
			MST_PURC_ACT_D_R purcActDL_t = MST_PURC_ACT_D_R.create("T");
			MCQueryApiBuilder purcActDL_bldr = MCQueryApiBuilder.create(purcActDL_t);
			purcActDL_bldr.setSelect(purcActDL_t.purc_act_d_no);
			purcActDL_bldr.addSelect(purcActDL_t.re_arr_rqst_tm);
			purcActDL_bldr.addSelect(purcActDL_t.re_arr_sync_flg);
			purcActDL_bldr.addInnerJoin(act, bracket( purcActDL_t.purc_act_no.eq(act.purc_act_no)
					.and(purcActDL_t.purc_act_seq.eq(act.purc_act_seq))));
			purcActDL_bldr.setWhere(act.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			purcActDL_bldr.addWhereWithAnd(purcActDL_t.purc_act_d_no.eq(bind("purc_act_d_no")));
			dbSelect("MSLAL5030_MST_PURC_ACT_D_S01", _purcActDL, purcActDL_bldr, schdL);
			_purcActDKey = _purcActDL.createIndex(MST_PURC_ACT_D_R.$purc_act_d_no);

			for (MST_ARR_SCHD_R schdR : schdL) {
				MST_PURC_ACT_D_R actR = _purcActDL.getFirst(_purcActDKey, schdR.purc_act_d_no());
				if (!isNull(actR)) {
					schdR.setDate("re_arr_rqst_tm", actR.re_arr_rqst_tm());
					schdR.setBoolean("re_arr_sync_flg", actR.re_arr_sync_flg());
				}
			}
			schdL.sort("re_arr_rqst_tm");
		}

		/**
		 * 製造指図NOごとに、回答可能な数量（再入荷除く）を設定
		 * 
		 * @param schdL 再入荷以外の入荷予定
		 */
		protected void crtAvailPrmsInfoForMfgInst(MCList<MST_ARR_SCHD_R> schdL) {

			if (_poDR.outsrc_flg()) {
				MCList<MST_ARR_SCHD_R> l = schdL.subList(dr -> dr.getStringNE("po_d_no").equals(_poDR.po_d_no()));
				for (MST_ARR_SCHD_R r : l) {
					if (!isNull(r.mfg_inst_no())) {
						MST_MFG_INST_R instR = _mfgInstL.getFirst(_mfgInstKey, r.mfg_inst_no());
						instR.setNumber(INST_REM_QTY, instR.getNumber(INST_REM_QTY).subtract(r.getNumber(SCHD_ACT_QTY)));
					}
				}
			}
		}

		protected void setChk02Up1ForCrt(MCList<PoPrmsRecvIf_Chk01_DtlR> insUpdL, int hdrPegNo, MCList<MST_ARR_SCHD_R> schdL) {

			for (PoPrmsRecvIf_Chk01_DtlR upR : insUpdL) {
				_poDR = _poDL.getFirst(_poDKey, upR.po_d_no());
				Chk02_DtlR r = Chk02_DtlR.create();
				// 上り電文と、Chk02_HdrRの紐づけ
				upR.hdr_peg_no(_hdrPegNo);
				// 上り電文と、Chk02_DtlRの紐づけ
				upR.dtl_peg_no(_dtlPegNo);
				r.peg_no(_dtlPegNo);
				r.hdr_peg_no(hdrPegNo);
				r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				r.po_d_no(upR.po_d_no());
				r.dlv_inst_d_no(upR.dlv_inst_d_no());

				MST_DLV_INST_D_R instDR = null;
				if (_dlvInstDKey != null) {
					instDR = _dlvInstDL.getFirst(_dlvInstDKey, upR.dlv_inst_d_no());
				}
				r.prms_dlv_tm(upR.prms_dlv_tm());
				r.purc_schd_dt(upR.purc_schd_dt());

				if (!isNull(instDR)) {
					r.purc_act_d_no(instDR.purc_act_d_no());
					r.mfg_inst_no(instDR.mfg_inst_no());
					// 製造指図に対して回答数量を割り当てる場合に、割当可能な残数を設定する
					if (_poDR.outsrc_flg()) {
						MST_MFG_INST_R instR = _mfgInstL.getFirst(_mfgInstKey, r.mfg_inst_no());
						instR.setNumber(INST_REM_QTY, instR.getNumber(INST_REM_QTY).subtract(upR.base_unit_qty()));
					}
					if (!isSame(r.prms_dlv_tm().trunc(MCDateFieldType.DAY), r.purc_schd_dt())) {
						r.sync_flg(false);
					}
					else {
						r.sync_flg(instDR.sync_flg());
					}
				}
				else {
					if (!isSame(r.prms_dlv_tm().trunc(MCDateFieldType.DAY), r.purc_schd_dt())) {
						r.sync_flg(false);
					}
					else {
						r.sync_flg(_poDR.sync_flg());
					}
				}

				r.itm_cd(_poDR.itm_cd());
				r.itm_sub1(_poDR.itm_sub1());
				r.itm_sub2(_poDR.itm_sub2());
				r.itm_sub3(_poDR.itm_sub3());
				r.trd_unit_cd(upR.trd_unit_cd());
				r.trd_unit_qty(upR.trd_unit_qty());
				r.prms_rmrks(upR.prms_rmrks());
				r.setAttributes(upR);

				// 受信した回答の数量を分割する
				// 仕入実績NO、製造指図NOごとに回答を作成する場合に分割される
				// ただし、納入指示明細NOが指定されている場合は分割しない
				if (isNull(instDR)) {
					divPrms(r, upR, schdL);
				}
				else {
					r.peg_no(_dtlPegNo);
					_upMap.put(MCNumber.valueOf(_dtlPegNo), upR.peg_no());
					_down2L.add(r);
					_dtlPegNo++;
				}
			}
		}

		/**
		 * 上り電文1行を、複数の納期回答情報に分割する。<BR>
		 * 分割が行われるのは、入荷予定に設定するキー項目を補完する以下のケース。<BR>
		 * １．外注品の発注：製造指図NOごとに分割 ２．再入荷：仕入実績明細NOごとに分割
		 */
		protected void divPrms(Chk02_DtlR r, PoPrmsRecvIf_Chk01_DtlR upR, MCList<MST_ARR_SCHD_R> schdL) {
			upR.rem_base_unit_qty(upR.base_unit_qty());
			if (_poDR.outsrc_flg()) {
				divPrmsOutSrc(r, upR, schdL);
			}
			else {
				divPrmsPurc(r, upR, schdL);
			}
		}

		protected void divPrmsPurc(Chk02_DtlR r, PoPrmsRecvIf_Chk01_DtlR upR, MCList<MST_ARR_SCHD_R> schdL) {
			MCList<Chk02_DtlR> tempL = MCList.create(Chk02_DtlR.class);

			MCList<MST_ARR_SCHD_R> l = schdL.subList(dr -> dr.getStringNE("po_d_no").equals(_poDR.po_d_no()));

			// 仕入実績明細NOが1件もない場合
			if (l.subList(row -> !isNull(row.purc_act_d_no())).size() == 0) {
				Chk02_DtlR addR = r.clone();
				addTempPrmsR(addR, tempL, upR.peg_no());
				_down2L.addAll(tempL);
				return;
			}

			for (MST_ARR_SCHD_R schdR : l) {
				if (upR.rem_base_unit_qty().isZero()) {
					// 割当残数なし
					break;
				}

				// 当該仕入実績明細NOに割り当て可能な数量
				MCNumber allotAblQty = schdR.getNumber(SCHD_REM_QTY);
				if (allotAblQty.isZero()) {
					continue;
				}
				Chk02_DtlR addR = r.clone();

				// 割り当てる数量
				MCNumber allotQty = MCNumber.min(upR.rem_base_unit_qty(), allotAblQty);
				upR.rem_base_unit_qty(upR.rem_base_unit_qty().subtract(allotQty));
				schdR.setNumber(SCHD_REM_QTY, schdR.getNumber(SCHD_REM_QTY).subtract(allotQty));

				addR.base_unit_qty(allotQty);
				addR.trd_unit_qty(getTrdUnitQty(addR.trd_unit_cd(), addR.itm_cd(), addR.itm_sub1(),
								addR.itm_sub2(), addR.itm_sub3(), addR.base_unit_qty()));
				// 再入荷の場合の補完
				// 再入荷の場合は発注時の同時FLGではなく仕入実績明細に指定されている再入荷同時FLGをセット
				if (!isNull(schdR.purc_act_d_no())) {
					if (isSame(r.prms_dlv_tm().trunc(MCDateFieldType.DAY), r.purc_schd_dt())) {
						MST_PURC_ACT_D_R actR = _purcActDL.getFirst(_purcActDKey, schdR.purc_act_d_no());
						if (!isNull(actR)) {
							addR.sync_flg(actR.re_arr_sync_flg());
						}
					}
					addR.purc_act_d_no(schdR.purc_act_d_no());
				}
				addTempPrmsR(addR, tempL, upR.peg_no());
			}

			if (upR.rem_base_unit_qty().isPositive()) {
				Chk02_DtlR addR;
				if (tempL.isEmpty()) {
					addR = r.clone();
					addR.base_unit_qty(MCNumber.ZERO);
					addTempPrmsR(addR, tempL, upR.peg_no());
				}
				else {
					addR = tempL.get(0);
				}
				addR.base_unit_qty(addR.base_unit_qty().add(upR.rem_base_unit_qty()));
				upR.rem_base_unit_qty(MCNumber.ZERO);
				addR.trd_unit_qty(getTrdUnitQty(addR.trd_unit_cd(), addR.itm_cd(), addR.itm_sub1(),
						addR.itm_sub2(), addR.itm_sub3(), addR.base_unit_qty()));
			}

			_down2L.addAll(tempL);
		}

		protected void divPrmsOutSrc(Chk02_DtlR r, PoPrmsRecvIf_Chk01_DtlR upR, MCList<MST_ARR_SCHD_R> schdL) {
			MCList<Chk02_DtlR> tempL = MCList.create(Chk02_DtlR.class);
			MCIndexKey schdMfgInstKey = schdL.createIndex(MST_ARR_SCHD_R.$mfg_inst_no);

			MCList<MST_MFG_INST_R> l = _mfgInstL.subList(dr -> dr.po_d_no().equals(_poDR.po_d_no()));

			// 製造指図NOが同一の場合
			if (l.groupBy(MST_MFG_INST_R.$mfg_inst_no).size() <=1) {
				Chk02_DtlR addR = r.clone();
				addR.mfg_inst_no(l.get(0).mfg_inst_no());
				addTempPrmsR(addR, tempL, upR.peg_no());
				_down2L.addAll(tempL);
				return;
			}

			for (MST_MFG_INST_R mfgInstR : l) {
				if (upR.rem_base_unit_qty().isZero()) {
					// 割当残数なし
					break;
				}

				// 割り当て可能な数量
				// 製造指図NOの設定された入荷予定があれば、そこから実績数量を取得
				// 割当可能な数量は、「製造指図の基準単位製造指図数量 － 入荷予定の実績数量」（＝INST_REM_QTYに設定されている）
				MCNumber allotAblQty = mfgInstR.getNumber(INST_REM_QTY);
				if (allotAblQty.isZero()) {
					continue;
				}
				Chk02_DtlR addR = r.clone();
				// 割り当てる数量
				MCNumber allotQty = MCNumber.min(upR.rem_base_unit_qty(), allotAblQty);
				upR.rem_base_unit_qty(upR.rem_base_unit_qty().subtract(allotQty));
				mfgInstR.setNumber(INST_REM_QTY, mfgInstR.getNumber(INST_REM_QTY).subtract(allotQty));

				addR.base_unit_qty(allotQty);
				addR.trd_unit_qty(getTrdUnitQty(addR.trd_unit_cd(), addR.itm_cd(), addR.itm_sub1(),
						addR.itm_sub2(), addR.itm_sub3(), addR.base_unit_qty()));
				addR.mfg_inst_no(mfgInstR.mfg_inst_no());
				// 再入荷の場合の仕入実績明細NOを取得する
				MST_ARR_SCHD_R tgtReTempR = schdL.getFirst(schdMfgInstKey, mfgInstR.mfg_inst_no());
				if (!isNull(tgtReTempR) && !isNull(tgtReTempR.purc_act_d_no())) {
					addR.purc_act_d_no(tgtReTempR.purc_act_d_no());
					if (isSame(addR.prms_dlv_tm().trunc(MCDateFieldType.DAY), addR.purc_schd_dt())) {
						MST_PURC_ACT_D_R actR = _purcActDL.getFirst(_purcActDKey, tgtReTempR.purc_act_d_no());
						if (!isNull(actR)) {
							addR.sync_flg(actR.re_arr_sync_flg());
						}
					}
				}

				addTempPrmsR(addR, tempL, upR.peg_no());

			}

			if (upR.rem_base_unit_qty().isPositive()) {
				Chk02_DtlR addR;
				if (tempL.isEmpty()) {
					addR = r.clone();
					addR.base_unit_qty(MCNumber.ZERO);
				}
				else {
					addR = tempL.get(0);
				}
				addR.base_unit_qty(addR.base_unit_qty().add(upR.rem_base_unit_qty()));
				upR.rem_base_unit_qty(MCNumber.ZERO);
				addR.trd_unit_qty(getTrdUnitQty(addR.trd_unit_cd(), addR.itm_cd(), addR.itm_sub1(),
						addR.itm_sub2(), addR.itm_sub3(),addR.base_unit_qty()));
			}
			_down2L.addAll(tempL);
		}

		protected void addTempPrmsR(Chk02_DtlR addR, MCList<Chk02_DtlR> tempL, MCNumber upPegNo) {
			addR.peg_no(_dtlPegNo);
			_upMap.put(MCNumber.valueOf(_dtlPegNo), upPegNo);
			tempL.add(addR);
			_dtlPegNo++;
		}
	
		/**
		 * 入荷予定のレコードに未入荷数（回答可能な数量）を設定する（外注品除く）。<BR>
		 * 外注品の場合、入荷予定に製造指図NOが設定されていない分の数量があるので、ここでは
		 * 実績数量のみ保持しておく。あとから製造指図情報も考慮して回答可能数量を求める。
		 */
		protected void setAvailArrQty() {
			for (MST_ARR_SCHD_R schdR : _arrSchdL) {
				MCNumber[] qtys = getActAvailQty(schdR);
				MCNumber actQty = qtys[0];
				MCNumber availArrQty = qtys[1];
				// 過入荷の場合に数量がマイナスになるので、残数ゼロとして扱う
				if (availArrQty.isNegative()) {
					availArrQty = MCNumber.ZERO;
				}
				schdR.setNumber(SCHD_AVAIL_QTY, availArrQty);
				schdR.setNumber(SCHD_ACT_QTY, actQty);
				schdR.setNumber(SCHD_REM_QTY, availArrQty);
			}
		}

		/**
		 * 入荷予定に対する実績数量、回答可能数量を返す。<BR>
		 * 
		 * @return MCNumber[]{実績数量、回答可能数量}
		 */
		protected MCNumber[] getActAvailQty(MST_ARR_SCHD_R schdR) {
			MCNumber maxSchdQty;
			MCNumber maxActQty;
			MCNumber maxAbortQty;
			MST_PURC_SCHD_R purcSchdR = _purcSchdL.getFirst(_purcSchdKey, schdR.arr_schd_no());
			maxSchdQty = MCNumber.max(schdR.base_unit_qty(), purcSchdR.base_unit_schd_qty());
			maxActQty = MCNumber.max(schdR.arr_qty(), purcSchdR.base_unit_purc_qty());
			if (!isNull(schdR.rcpt_iv_mng_no())) {
				maxActQty = maxSchdQty;
			}
			maxAbortQty = MCNumber.max(schdR.abort_qty(), purcSchdR.base_unit_abort_qty());

			MCNumber actQty = maxActQty.add(maxAbortQty);
			MCNumber availArrQty = maxSchdQty.subtract(actQty);

			return new MCNumber[] { actQty, availArrQty };
		}

		/**
		 * 仕入実績明細NO、製造指図NOごとの回答可能数量・実績数量を集計
		 * 
		 * @return
		 */
		protected MCGroupByPolicy getPolicy() {
			MCGroupByPolicy gp = new MCGroupByPolicy();
			gp.addKey(MST_ARR_SCHD_R.$purc_act_d_no, MST_ARR_SCHD_R.$mfg_inst_no, MST_PO_D_R.$po_d_no);
			gp.sum(SCHD_AVAIL_QTY, SCHD_ACT_QTY, SCHD_REM_QTY);
			return gp;
		}

		protected MapChk02HdrForDel<Chk02_HdrR, MST_PRMS_RCPT_R, MST_ARR_PR_R> createMapChk02HdrForDel() {
			return new MapChk02HdrForDel<Chk02_HdrR, MST_PRMS_RCPT_R, MST_ARR_PR_R>();
		}

		public class MapChk02HdrForDel<D extends Chk02_HdrR, S extends MST_PRMS_RCPT_R, W extends MST_ARR_PR_R>
				extends FXUCC_RowMapperWith<D, S, W> {
			protected W _mST_ARR_PR_R;

			protected String _dataCrudTyp;

			@Override
			public void setWith(W _mST_ARR_PR_R) {
				this._mST_ARR_PR_R = _mST_ARR_PR_R;
			}

			public void setDataCrudTyp(String dataCrudTyp) {
				_dataCrudTyp = dataCrudTyp;
			}

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk02_HdrR.$prms_rcpt_no, MST_PRMS_RCPT_R.$prms_rcpt_no);
				addColumnPathMap(Chk02_HdrR.$po_d_no, MST_PRMS_RCPT_R.$po_d_no);
				addColumnPathMap(Chk02_HdrR.$arr_schd_refl_flg, MST_PRMS_RCPT_R.$arr_schd_refl_flg);
				addColumnPathMap(Chk02_HdrR.$arr_schd_refl_dt, MST_PRMS_RCPT_R.$arr_schd_refl_dt);
				addColumnPathMap(Chk02_HdrR.$prms_rcpt_dt, MST_PRMS_RCPT_R.$prms_rcpt_dt);
				addColumnPathMap(Chk02_HdrR.$intr_rmrks, MST_PRMS_RCPT_R.$intr_rmrks);
				addColumnPathMap(Chk02_HdrR.$sub_char1, MST_PRMS_RCPT_R.$sub_char1);
				addColumnPathMap(Chk02_HdrR.$sub_char2, MST_PRMS_RCPT_R.$sub_char2);
				addColumnPathMap(Chk02_HdrR.$sub_char3, MST_PRMS_RCPT_R.$sub_char3);

			}

			@Override
			protected void valueCopy(D dest, S src) {

				super.valueCopy(dest, src);
				dest.data_crud_typ(_dataCrudTyp);
				dest.arr_pr_no(_mST_ARR_PR_R.arr_pr_no());
				dest.arr_pr_upd_cntr(_mST_ARR_PR_R.upd_cntr());
			}
		}

		/**
		 * 納期回答受領明細の削除情報を作成する。
		 */
		protected MapChk02DtlForDel<Chk02_DtlR, MST_PRMS_RCPT_D_R> createMapChk02DtlForDel() {
			return new MapChk02DtlForDel<Chk02_DtlR, MST_PRMS_RCPT_D_R>();
		}

		public class MapChk02DtlForDel<D extends Chk02_DtlR, S extends MST_PRMS_RCPT_D_R> extends MCRowMapper<D, S> {
			protected MST_PO_D_R _poDR;
			
			protected void setPoDR(MST_PO_D_R _poDR) {
				this._poDR = _poDR;
			}
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk02_DtlR.$prms_rcpt_no, MST_PRMS_RCPT_D_R.$prms_rcpt_no);
				addColumnPathMap(Chk02_DtlR.$prms_rcpt_d_no, MST_PRMS_RCPT_D_R.$prms_rcpt_d_no);
				addColumnPathMap(Chk02_DtlR.$dlv_inst_d_no, MST_PRMS_RCPT_D_R.$dlv_inst_d_no);
				addColumnPathMap(Chk02_DtlR.$purc_act_d_no, MST_PRMS_RCPT_D_R.$purc_act_d_no);
				addColumnPathMap(Chk02_DtlR.$mfg_inst_no, MST_PRMS_RCPT_D_R.$mfg_inst_no);
				addColumnPathMap(Chk02_DtlR.$prms_dlv_tm, MST_PRMS_RCPT_D_R.$prms_dlv_tm);
				addColumnPathMap(Chk02_DtlR.$purc_schd_dt, MST_PRMS_RCPT_D_R.$purc_schd_dt);
				addColumnPathMap(Chk02_DtlR.$sync_flg, MST_PRMS_RCPT_D_R.$sync_flg);
				addColumnPathMap(Chk02_DtlR.$trd_unit_cd, MST_PRMS_RCPT_D_R.$trd_unit_cd);
				addColumnPathMap(Chk02_DtlR.$trd_unit_qty, MST_PRMS_RCPT_D_R.$trd_unit_qty);
				addColumnPathMap(Chk02_DtlR.$base_unit_cd, MST_PRMS_RCPT_D_R.$base_unit_cd);
				addColumnPathMap(Chk02_DtlR.$base_unit_qty, MST_PRMS_RCPT_D_R.$base_unit_qty);
				addColumnPathMap(Chk02_DtlR.$prms_rmrks, MST_PRMS_RCPT_D_R.$prms_rmrks);
				addColumnPathMap(Chk02_DtlR.$sub_char1, MST_PRMS_RCPT_D_R.$sub_char1);
				addColumnPathMap(Chk02_DtlR.$sub_char2, MST_PRMS_RCPT_D_R.$sub_char2);
				addColumnPathMap(Chk02_DtlR.$sub_char3, MST_PRMS_RCPT_D_R.$sub_char3);

			}

			@Override
			protected void valueCopy(D dest, S src) {

				super.valueCopy(dest, src);
				dest.peg_no(_dtlPegNo++);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				dest.po_d_no(_poDR.po_d_no());
				dest.itm_cd(_poDR.itm_cd());
				dest.itm_sub1(_poDR.itm_sub1());
				dest.itm_sub2(_poDR.itm_sub2());
				dest.itm_sub3(_poDR.itm_sub3());
			}
		}

		/**
		 * 上り電文にエラー行（エラーＦＬＧがオン）があるか。
		 * ※hasErr()はメッセージプールにエラーがあるかどうかで判断されるため、ＩＦデータの処理単位ごとに判定できない。
		 */
		protected boolean isErrFlgOn() {
			MCList<PoPrmsRecvIf_Chk01_DtlR> errL = up0().subList(PoPrmsRecvIf_Chk01_DtlR.$err_flg, true);
			return errL.isEmpty() ? false : true;
		}
	}

	/**
	 * PoPrmsRecvIf_Upd04オペレーション.<p>
	 *
	 * 納期回答受信ＩＦ取込を行う。<br>
	 */
	public class PoPrmsRecvIf_Upd04 extends MSLAL_PoPrmsRecvIfService_MC_A.PoPrmsRecvIf_Upd04 {

		protected MSLAL_PoPrmsRecvIfService.PoPrmsRecvIf_Chk01 _chk01 = MSLAL_PoPrmsRecvIfService.crtPoPrmsRecvIf_Chk01();

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
			up0().setString(PoPrmsRecvIf_Chk01_DtlR.$exe_sts_typ, MAC_EXE_STS_TYP.NOT_EXE.value());
			up0().sort(getGrpKey());
		}

		protected void proc() {
			MCSavepoint sp = null;
			MCMessageList msgList = new MCMessageList();
			msgList.addAll(MCMessagePool.getMessageList());
			
			// 同一発注明細のデータが連続する場合（新規、訂正・・・など）を考慮し、外部システムデータＮＯの順で
			// 「チェック→更新→チェック→更新・・」と実行する
			MCMessagePool.clear();
			MCList<PoPrmsRecvIf_Chk01_DtlR>[] grpLArr = getGrp();
			for (MCList<PoPrmsRecvIf_Chk01_DtlR> grpL : grpLArr) {
				if (isPrevErr(grpL)) {
					int errRowCnt = grpL.subList(r -> isErr(r.prms())).size();
					if (grpL.size() == errRowCnt) {
						continue;
					}
					else {
						grpL = grpL.subList(r -> !isErr(r.prms()));
					}
				}
				msgList.addAll(MCMessagePool.getMessageList());
				// 前に処理したデータのメッセージプールが残っていると、チェック処理が正しく行われない。
				// メッセージプールはチェックを呼び出す度にクリアする。
				MCMessagePool.clear();
				
				try {
					// 排他エラーなどチェック処理の例外をキャッチする
					if (!check(grpL)) {
						int errRowCnt = grpL.subList(r -> isErr(r.prms())).size();
						if (grpL.size() == errRowCnt) {
							continue;
						}
					}
					msgList.addAll(MCMessagePool.getMessageList());
					MCMessagePool.clear();
					sp = dbTran().setSavepoint();
					callPurcDlvDtAdjstRegSrv();
				}
				catch (Exception ex) {
					handleEx(ex, sp, grpL);
				}
				finally {
					msgList.addAll(MCMessagePool.getMessageList());
					MCMessagePool.clear();
					sp = null;
				}
				setOK(grpL);
			}
			MCMessagePool.clear();
			MCMessagePool.addAll(msgList);
		}

		/**
		 * 上り電文をグループ化したリストの配列を返します。<p>
		 * 同一発注明細に対する取り込み順（外部システムデータＮＯ）を維持しつつグループ化します。
		 * @return ret マージしたリスト
		 */
		@SuppressWarnings("unchecked")	// 総称配列の警告回避
		protected MCList<PoPrmsRecvIf_Chk01_DtlR>[] getGrp() {
			List<MCList<PoPrmsRecvIf_Chk01_DtlR>> ret = new ArrayList<>();
			MCList<PoPrmsRecvIf_Chk01_DtlR>[] arr = up0().groupList(
					PoPrmsRecvIf_Chk01_DtlR.$po_no, PoPrmsRecvIf_Chk01_DtlR.$po_d_no);
			int emptySize = 0;

			while (arr.length > emptySize) {
				emptySize = 0;
				MCList<PoPrmsRecvIf_Chk01_DtlR> mergeDestL = MCList.create(up0().get(0));

				for (MCList<PoPrmsRecvIf_Chk01_DtlR> dtlL : arr) {
					if (dtlL.isEmpty()) {
						emptySize++;
						continue;
					}
					else {
						MCList<PoPrmsRecvIf_Chk01_DtlR> l = dtlL.subList(
								e -> e.ext_data_no().eq(dtlL.get(0).ext_data_no()));
						mergeDestL.addAll(l);
						dtlL.removeAll(l);
					}
				}

				if (mergeDestL.size() != 0) {
					ret.add(mergeDestL);
				}
			}
			return ret.toArray(new MCList[ret.size()]);
		}

		protected boolean isErr(MST_PRMS_RECV_IF_R prmsRecvIfR) {
			return MAC_EXE_STS_TYP.isERR(prmsRecvIfR.exe_sts_typ());
		}
		protected void setOK(MCList<PoPrmsRecvIf_Chk01_DtlR> list) {

			for (PoPrmsRecvIf_Chk01_DtlR row : list) {

				if (!MAC_EXE_STS_TYP.isERR(row.exe_sts_typ())) {
					row.exe_sts_typ(MAC_EXE_STS_TYP.OK.value());
				}
			}
		}

		/**
		 * PrmsRecvIf_Chk01を実行する
		 * 
		 * @return エラー有り：false、エラーなし：true
		 */
		protected boolean check(MCList<PoPrmsRecvIf_Chk01_DtlR> chkL) {

			_chk01.up0().setAll(chkL);
			_chk01.exec();

			MCList<PoPrmsRecvIf_Chk01_DtlR> errL = _chk01.down0().subList(PoPrmsRecvIf_Chk01_DtlR.$err_flg, true);

			if (!errL.isEmpty()) {
				return false;
			}
			return true;
		}

		/**
		 * 同一の発注ＮＯ、発注明細ＮＯですでにエラーが発生しているかをチェックする。
		 */
		protected boolean isPrevErr(MCList<PoPrmsRecvIf_Chk01_DtlR> checkL) {
			if (checkL.isEmpty()) {
				return false;
			}

			boolean hasErr = false;
			for (MCList<PoPrmsRecvIf_Chk01_DtlR> subL : checkL.groupList(
					PoPrmsRecvIf_Chk01_DtlR.$po_no, PoPrmsRecvIf_Chk01_DtlR.$po_d_no)) {
				if (object(CLAZZ)._errSet.contains(createErrSetKey(subL.get(0).prms()))) {
					hasErr = true;
					for (PoPrmsRecvIf_Chk01_DtlR r : subL) {
						setErrSts(r.prms());
						MCMessagePool.add(r, null, MSLAL0025, r.data_no(), r.data_lno(),
								r.po_no(), r.po_d_no());
					}
				}
			}
			return hasErr;
		}

		protected void callPurcDlvDtAdjstRegSrv() {
			MSBDL_PurcDlvDtAdjstRegService.Prms_Upd01 ope = MSBDL_PurcDlvDtAdjstRegService.crtPrms_Upd01();
			// Chk01でエラーになった明細を取り除いて実行
			for (Chk02_HdrR r : _chk01.down1().subList(r -> !r.err_flg())) {
				Prms_Chk01_HdrR prmsChk01HdrR = Prms_Chk01_HdrR.create();
				copy(prmsChk01HdrR, r, createMapMSBD5120_Upd01_Hdr());
				ope.up0().add(prmsChk01HdrR);
			}

			for (Chk02_DtlR r : _chk01.down2().subList(r -> !r.err_flg())) {
				Prms_Chk01_DtlR prmsChk01DtlR = Prms_Chk01_DtlR.create();
				copy(prmsChk01DtlR, r, createMapMSBD5120_Upd01_Dtl());
				ope.up1().add(prmsChk01DtlR);
			}

			if (!ope.up0().isEmpty()) {
				ope.exec();
			}
		}

		protected void setDown() {
			down0().setAll(up0());
		}

		protected MapMSBD5120_Upd01_Hdr<Prms_Chk01_HdrR, Chk02_HdrR> createMapMSBD5120_Upd01_Hdr() {
			return new MapMSBD5120_Upd01_Hdr<Prms_Chk01_HdrR, Chk02_HdrR>();
		}

		public class MapMSBD5120_Upd01_Hdr<D extends Prms_Chk01_HdrR, S extends Chk02_HdrR> extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Prms_Chk01_HdrR.$data_crud_typ, Chk02_HdrR.$data_crud_typ);
				addColumnPathMap(Prms_Chk01_HdrR.$peg_no, Chk02_HdrR.$peg_no);
				addColumnPathMap(Prms_Chk01_HdrR.$err_flg, Chk02_HdrR.$err_flg);
				addColumnPathMap(Prms_Chk01_HdrR.$prms_rcpt_no, Chk02_HdrR.$prms_rcpt_no);
				addColumnPathMap(Prms_Chk01_HdrR.$po_d_no, Chk02_HdrR.$po_d_no);
				addColumnPathMap(Prms_Chk01_HdrR.$arr_schd_refl_flg, Chk02_HdrR.$arr_schd_refl_flg);
				addColumnPathMap(Prms_Chk01_HdrR.$arr_schd_refl_dt, Chk02_HdrR.$arr_schd_refl_dt);
				addColumnPathMap(Prms_Chk01_HdrR.$prms_rcpt_dt, Chk02_HdrR.$prms_rcpt_dt);
				addColumnPathMap(Prms_Chk01_HdrR.$intr_rmrks, Chk02_HdrR.$intr_rmrks);
				addColumnPathMap(Prms_Chk01_HdrR.$sub_char1, Chk02_HdrR.$sub_char1);
				addColumnPathMap(Prms_Chk01_HdrR.$sub_char2, Chk02_HdrR.$sub_char2);
				addColumnPathMap(Prms_Chk01_HdrR.$sub_char3, Chk02_HdrR.$sub_char3);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				dest.edi_flg(true);
				super.valueCopy(dest, src);
			}
		}

		protected MapMSBD5120_Upd01_Dtl<Prms_Chk01_DtlR, Chk02_DtlR> createMapMSBD5120_Upd01_Dtl() {
			return new MapMSBD5120_Upd01_Dtl<Prms_Chk01_DtlR, Chk02_DtlR>();
		}

		public class MapMSBD5120_Upd01_Dtl<D extends Prms_Chk01_DtlR, S extends Chk02_DtlR> extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Prms_Chk01_DtlR.$data_crud_typ, Chk02_DtlR.$data_crud_typ);
				addColumnPathMap(Prms_Chk01_DtlR.$peg_no, Chk02_DtlR.$peg_no);
				addColumnPathMap(Prms_Chk01_DtlR.$hdr_peg_no, Chk02_DtlR.$hdr_peg_no);
				addColumnPathMap(Prms_Chk01_DtlR.$err_flg, Chk02_DtlR.$err_flg);
				addColumnPathMap(Prms_Chk01_DtlR.$prms_rcpt_no, Chk02_DtlR.$prms_rcpt_no);
				addColumnPathMap(Prms_Chk01_DtlR.$prms_rcpt_d_no, Chk02_DtlR.$prms_rcpt_d_no);
				addColumnPathMap(Prms_Chk01_DtlR.$dlv_inst_d_no, Chk02_DtlR.$dlv_inst_d_no);
				addColumnPathMap(Prms_Chk01_DtlR.$purc_act_d_no, Chk02_DtlR.$purc_act_d_no);
				addColumnPathMap(Prms_Chk01_DtlR.$mfg_inst_no, Chk02_DtlR.$mfg_inst_no);
				addColumnPathMap(Prms_Chk01_DtlR.$prms_dlv_tm, Chk02_DtlR.$prms_dlv_tm);
				addColumnPathMap(Prms_Chk01_DtlR.$purc_schd_dt, Chk02_DtlR.$purc_schd_dt);
				addColumnPathMap(Prms_Chk01_DtlR.$sync_flg, Chk02_DtlR.$sync_flg);
				addColumnPathMap(Prms_Chk01_DtlR.$trd_unit_cd, Chk02_DtlR.$trd_unit_cd);
				addColumnPathMap(Prms_Chk01_DtlR.$trd_unit_qty, Chk02_DtlR.$trd_unit_qty);
				addColumnPathMap(Prms_Chk01_DtlR.$base_unit_cd, Chk02_DtlR.$base_unit_cd);
				addColumnPathMap(Prms_Chk01_DtlR.$base_unit_qty, Chk02_DtlR.$base_unit_qty);
				addColumnPathMap(Prms_Chk01_DtlR.$prms_rmrks, Chk02_DtlR.$prms_rmrks);
				addColumnPathMap(Prms_Chk01_DtlR.$sub_char1, Chk02_DtlR.$sub_char1);
				addColumnPathMap(Prms_Chk01_DtlR.$sub_char2, Chk02_DtlR.$sub_char2);
				addColumnPathMap(Prms_Chk01_DtlR.$sub_char3, Chk02_DtlR.$sub_char3);

			}
		}

		protected void handleEx(Exception ex, MCSavepoint sp, MCList<PoPrmsRecvIf_Chk01_DtlR> list) {

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

			for (PoPrmsRecvIf_Chk01_DtlR opeRow : list) {

				setErrSts(opeRow.prms());
				MCMessagePool.add(opeRow, null, MSLAL0031, opeRow.data_no(), opeRow.data_lno(), opeRow.po_no(), opeRow.po_d_no(), msgId,
						msg);
				for (MCMessage causeMsg : causeMsgList) {
					MCMessage newMsg = new MCMessage(opeRow, null, causeMsg.getID(), (Object[]) causeMsg.getBindArray());
					MCMessagePool.add(newMsg);
				}
			}

			if (sp != null) {

				dbTran().rollback(sp);
			}
		}

	}

	/**
	 * 引数の2つの行が異なる発注明細の場合にtrue、同一の場合にfalseを返す。 外部システムデータＮＯ、発注ＮＯ、発注明細ＮＯのすべてが同じ場合に同一と判定する。
	 */
	protected boolean isNextPoD(MST_PRMS_RECV_IF_R r, MST_PRMS_RECV_IF_R nextR) {
		return !(isSame(r.po_no(), nextR.po_no()) && isSame(r.po_d_no(), nextR.po_d_no()) && isSame(r.ext_data_no(), nextR.ext_data_no()));
	}

	protected List<String> createErrSetKey(MST_PRMS_RECV_IF_R r) {
		List<String> l = new ArrayList<String>();
		if (!isNull(r)) {
			l.add(r.po_no());
			l.add(r.po_d_no());
		}
		return l;
	}

	protected String[] getGrpKey() {
		return new String[] { PoPrmsRecvIf_Chk01_DtlR.$ext_data_no, PoPrmsRecvIf_Chk01_DtlR.$po_no, PoPrmsRecvIf_Chk01_DtlR.$po_d_no };
	}

	protected void setErrSts(MCList<PoPrmsRecvIf_Chk01_DtlR> upL) {
		upL.forEach(r -> {
			if (r.err_flg()) setErrSts(r.prms());
		});
	}
	
	protected void setErrSts(MST_PRMS_RECV_IF_R exeR) {
		exeR.exe_sts_typ(MAC_EXE_STS_TYP.ERR.value());
		setErrSet(exeR);
	}

	protected void setErrSet(MST_PRMS_RECV_IF_R prmsRecvR) {

		List<String> l = createErrSetKey(prmsRecvR);
		if (!object(CLAZZ)._errSet.contains(l)) {
			object(CLAZZ)._errSet.add(l);
		}
	}

	//FMCB CUSTOM END
}