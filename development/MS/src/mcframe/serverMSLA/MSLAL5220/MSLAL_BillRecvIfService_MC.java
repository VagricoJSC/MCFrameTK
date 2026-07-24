package mcframe.serverMSLA.MSLAL5220;

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
import mcframe.serverMSLA.MSLAL5220.*; // このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMBBE.MBBEL5010.*; // このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverPFUD.PFUDL0040.*; // このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMS.dbc.*; // このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBH.MSBHL5140.*; // このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXBA.FXBAL0120.*;

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
import mcframe.serverMBBC.MBBCL5020.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_BillRecvIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_BillRecvIfService_MC extends MSLAL_BillRecvIfService_MC_A{
	//FMCB CUSTOM START
	protected static final Class<MSLAL_BillRecvIfService> CLAZZ = MSLAL_BillRecvIfService.class;

	//エラーになった請求元ＣＤと請求書ＮＯを保持する
	protected Set<List<String>> _errSet = new HashSet<List<String>>();

	/***
	 * 請求受信登録サービスのチェック01オペレーション
	 */
	protected MSBHL_BillRecvReg.BillRcpt_Chk01 _chk01Serv = MSBHL_BillRecvReg
			.crtBillRcpt_Chk01();

	/**
	 * BillRecvIf_Upd01オペレーション.<p>
	 *
	 * 請求受信ＩＦ取込を行う。（ＥＳＢのリアルタイム取込から呼び出される）<br>
	 */
	public class BillRecvIf_Upd01 extends MSLAL_BillRecvIfService_MC_A.BillRecvIf_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callBillRecvIfUpd02();

		}

		/**
		 * BillRecvIf_Upd02を実行する。
		 */
		protected void callBillRecvIfUpd02() {
			MSLAL_BillRecvIfService.BillRecvIf_Upd02 ope = MSLAL_BillRecvIfService
					.crtBillRecvIf_Upd02();
			setAll(ope.up0(), up0(), createMapForUpd02());
			ope.exec();
		}

		protected MapForUpd02<IfDataImp_Upd01_DtlR, Upd01_DtlR> createMapForUpd02() {
			return new MapForUpd02<IfDataImp_Upd01_DtlR, Upd01_DtlR>();
		}

		public class MapForUpd02<D extends IfDataImp_Upd01_DtlR, S extends Upd01_DtlR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(IfDataImp_Upd01_DtlR.$data_no, Upd01_DtlR.$data_no);
				addColumnPathMap(IfDataImp_Upd01_DtlR.$ext_data_no,
						Upd01_DtlR.$ext_data_no);
				addColumnPathMap(IfDataImp_Upd01_DtlR.$ext_sys_cd,
						Upd01_DtlR.$ext_sys_cd);
				addColumnPathMap(IfDataImp_Upd01_DtlR.$bp_cd, Upd01_DtlR.$bp_cd);
			}
		}
	}

	/**
	 * BillRecvIf_Upd02オペレーション.<p>
	 *
	 * 請求受信ＩＦ取込を行う。（ＩＦデータ確認、および請求受信ＩＦ取込バッチから呼び出される）<br>
	 */
	public class BillRecvIf_Upd02 extends MSLAL_BillRecvIfService_MC_A.BillRecvIf_Upd02 {

		protected MCList<MST_BILL_RECV_IF_R> _srchKeyL;

		protected MST_BILL_RECV_IF_R _srchKeyL_t;

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
			_srchKeyL = MCList.create(MST_BILL_RECV_IF_R.class);
			_srchKeyL_t = MST_BILL_RECV_IF_R.create("T");
			_srchKeyL_bldr = MCQueryApiBuilder.create(_srchKeyL_t);
		}

		protected void writeStartLog() {
			logger().writeStartLog(MSLAL0750);
			pushStartLog(logger());
		}

		protected void preSrch() {
			PFT_SDRV_IF_R sdrv = PFT_SDRV_IF_R.create("SDRV");
			MAM_EDI_IF_CTL_R S1 = MAM_EDI_IF_CTL_R.create("IFCTL");

			_srchKeyL_bldr.setSelect(_srchKeyL_t.ext_data_no);
			_srchKeyL_bldr.addSelect(_srchKeyL_t.data_lno);
			_srchKeyL_bldr.addSelect(_srchKeyL_t.bill_src_cd);
			_srchKeyL_bldr.addSelect(_srchKeyL_t.bill_no);
			_srchKeyL_bldr.addSelect(_srchKeyL_t.bill_d_no);

			_srchKeyL_bldr.addLeftOuterJoin(sdrv, _srchKeyL_t.data_no.eq(sdrv.data_no));
			_srchKeyL_bldr.setWhere(value(0).eq(value(0)));
			_srchKeyL_bldr.addWhereWithAnd(_srchKeyL_t.imp_flg.eq(value(true)));
			_srchKeyL_bldr.addWhereWithAnd(bracket(sdrv.sdrv_sts_typ.isNull().or(
					sdrv.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.RECV_CONV_OK.value())))));
			_srchKeyL_bldr.addWhereWithAnd(exists(subQuery().select(value("X")).from(S1)
					.where(S1.if_proc_typ.eq(value(MAC_IF_PROC_TYP.BILL_RECV.value()))

							.and(bracket(_srchKeyL_t.bill_src_cd.isNotNull()
									.and(_srchKeyL_t.bill_src_cd.eq(S1.bp_cd)
											.or(S1.bp_cd.isNull()))).and(
													S1.st_dt.lte(_srchKeyL_t.recv_dt))
													.and(S1.end_dt.gte(
															_srchKeyL_t.recv_dt))))));
			setOrderBy();
			//データＮＯが電文で渡された場合
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
						bracket(_srchKeyL_t.bill_src_cd.eq(bind("bp_cd"))));
				dbSelect("MSLAL5220_MST_BILL_RECV_IF_S01", _srchKeyL, _srchKeyL_bldr,
						up0());
			}
			else {
				dbSelect("MSLAL5220_MST_BILL_RECV_IF_S02", _srchKeyL, _srchKeyL_bldr);
			}
		}

		/**
		 * 請求元が異なればext_data_noが同じ可能性があるので、ソート順の最初に請求元を指定する
		 */
		protected void setOrderBy() {
			_srchKeyL_bldr.addOrderByAsc(_srchKeyL_t.bill_src_cd, _srchKeyL_t.ext_data_no,
					_srchKeyL_t.bill_no, _srchKeyL_t.bill_d_no);
		}

		/**
		 * スレッドを分割し、各スレッドごとにbillRecvIf_Upd03を実行する
		 */
		protected void exe() {
			int no = 0;
			MSLAL_BillRecvIfService.BillRecvIf_Upd03 upd03 = null;
			List<MSLAL_BillRecvIfService.BillRecvIf_Upd03> opeL = new ArrayList<MSLAL_BillRecvIfService.BillRecvIf_Upd03>();
			for (MCList<MST_BILL_RECV_IF_R> grpL : _srchKeyL.groupList("bill_src_cd")) {
				upd03 = MSLAL_BillRecvIfService.crtBillRecvIf_Upd03();
				upd03._no = ++no;
				setAll(upd03.up0(), grpL, createMapForUpd03());

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
							new Comparator<MSLAL_BillRecvIfService.BillRecvIf_Upd03>() {
								public int compare(
										MSLAL_BillRecvIfService.BillRecvIf_Upd03 o1,
										MSLAL_BillRecvIfService.BillRecvIf_Upd03 o2) {
									return (o1.up0().size() - o2.up0().size()) * -1; // 降順
								}
							});
					MCServerThreadManager.invokeAndWait(opeL,
							FXBAL_BatchLogManager.class);
				}

				for (MSLAL_BillRecvIfService.BillRecvIf_Upd03 ope : opeL) {
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
			logger().writeEndLog(MSLAL0751, _totalNum, _okNum, _errNum, _skipNum);
			pushEndLog(logger());

			// Loggerを新規作成した場合（呼出元からLoggerを引き継がない場合）のみクローズ
			if (_crtNewLogger) {
				logger().close();
			}
		}

		protected MapForUpd03<BillRecvIf_Upd03_DtlR, MST_BILL_RECV_IF_R> createMapForUpd03() {
			return new MapForUpd03<BillRecvIf_Upd03_DtlR, MST_BILL_RECV_IF_R>();
		}

		public class MapForUpd03<D extends BillRecvIf_Upd03_DtlR, S extends MST_BILL_RECV_IF_R>
				extends MCRowMapper<D, S> {
			@Override
			public void valueCopy(D dest, S src) {
				dest.bill(src);
			}
		}

	}

	/**
	 * BillRecvIf_Upd03オペレーション.<p>
	 *
	 * 請求受信ＩＦ取込を行う。（マルチスレッド実行用）<br>
	 */
	public class BillRecvIf_Upd03 extends MSLAL_BillRecvIfService_MC_A.BillRecvIf_Upd03 {

		protected FXBAL_BatchLogger _logger = null;

		protected int _no = 0;

		protected int _loopCnt = MCConst.app.getInteger("MS.MSLAL5220.loopsize", 100);

		protected MSLAL_BillRecvIfService.BillRecvIf_Upd04 _ope = MSLAL_BillRecvIfService
				.crtBillRecvIf_Upd04();

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

			MCList<MST_BILL_RECV_IF_R> tgtL = MCList.create(MST_BILL_RECV_IF_R.class);
			MST_BILL_RECV_IF_R oldR = MST_BILL_RECV_IF_R.create();

			for (BillRecvIf_Upd03_DtlR dtlR : up0()) {
				MST_BILL_RECV_IF_R keyR = dtlR.bill();
				if (isNextData(oldR, keyR)) {
					if (!tgtL.isEmpty() && _loopCnt <= cnt) {
						callBillRecvIfUpd04(tgtL);
						cnt = 0;
						tgtL.clear();
					}
				}
				oldR = keyR;
				cnt++;
				tgtL.add(keyR);
			}

			if (!tgtL.isEmpty()) {
				callBillRecvIfUpd04(tgtL);
			}
		}

		/**
		 * BillRecvIf_Upd04を実行する。
		 * @param billRecvIfL 請求受信ＩＦ
		 */
		protected void callBillRecvIfUpd04(MCList<MST_BILL_RECV_IF_R> billRecvIfL) {
			crtBillRecvIfWk(billRecvIfL);
			_ope.up0().clear();

			MCList<MST_BILL_RECV_IF_R> exeL = srchLockBillRecvIf();
			Set<List<String>> afterExtDataSet = srchAfterExtData(exeL);
			MCList<MST_BILL_RECV_IF_R> skipL = MCList.create(MST_BILL_RECV_IF_R.class);
			BillRecvIf_Chk01_DtlR upR = null;

			for (MST_BILL_RECV_IF_R exeR : exeL) {

				//同じ請求元、請求書ＮＯで既にエラーが発生している場合、それより外部システムデータＮＯが大きいデータはスキップし処理しない
				if (isPrevErr(exeR)) {
					setErrSts(exeR);
					MCMessagePool.add(exeR, null, MSLAL0752, exeR.data_no(),
							exeR.data_lno(), exeR.bill_src_cd(), exeR.bill_no());
					skipL.add(exeR);
				}
				//同じ請求元、請求書ＮＯで、外部システムデータＮＯが大きいデータを既に処理している場合はスキップ
				else if (isOkSkip(exeR, afterExtDataSet)) {
					setSkipSts(exeR);
					MCMessagePool.add(exeR, null, MSLAL0753, exeR.data_no(),
							exeR.data_lno(), exeR.bill_src_cd(), exeR.bill_no());
					skipL.add(exeR);
				}
				else {
					upR = BillRecvIf_Chk01_DtlR.create();
					upR.bill(exeR);
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
			delBillRecvIfWk(billRecvIfL);
		}

		/**
		 * 処理しなかったデータからダミーの下り電文を作成する
		 */
		protected void mergeExeRslt(MCList<MST_BILL_RECV_IF_R> skipL) {
			for (MST_BILL_RECV_IF_R skipR : skipL) {
				BillRecvIf_Chk01_DtlR r = _ope.down0().createRow();
				r.bill(skipR);
				_ope.down0().add(r);
			}
		}

		/**
		 * 同一キーで取込対象より新しいかつ処理済みのデータを取得する。
		 * @param exeL 取込対象リスト
		 * @return 処理済みデータリスト
		 */
		protected Set<List<String>> srchAfterExtData(MCList<MST_BILL_RECV_IF_R> exeL) {
			MCList<MST_BILL_RECV_IF_R> afterL = MCList.create(MST_BILL_RECV_IF_R.class);
			MST_BILL_RECV_IF_R S1ST = MST_BILL_RECV_IF_R.create("ST");
			MST_BILL_RECV_IF_R t = MST_BILL_RECV_IF_R.create("T");
			MCQueryApiBuilder afterL_bldr = MCQueryApiBuilder.create(t);

			afterL_bldr.setSelect(t.bill_src_cd, t.bill_no);

			afterL_bldr.addConstWhereWithAnd(exists(subQuery().select(value("X"))
					.from(S1ST)
					.where(t.ext_data_no.lt(S1ST.ext_data_no)
							.and(t.bill_src_cd.eq(S1ST.bill_src_cd)
									.and(t.bill_no.eq(S1ST.bill_no)))
							.and(S1ST.exe_sts_typ.in(value(MAC_EXE_STS_TYP.OK.value()),
									value(MAC_EXE_STS_TYP.SKP.value()))))));
			dbSelectColumn("MSLAL5220_MST_BILL_RECV_IF_S03", afterL, afterL_bldr, exeL,
					MST_BILL_RECV_IF_R.$data_lno);

			Set<List<String>> set = new HashSet<List<String>>();
			for (MST_BILL_RECV_IF_R afterR : afterL) {
				List<String> list = createErrSetKey(afterR);
				if (!set.contains(list)) {
					set.add(list);
				}
			}
			return set;
		}

		protected void crtBillRecvIfWk(MCList<MST_BILL_RECV_IF_R> billRecvIfL) {
			MCQueryApiBuilder billRecvIfL_bldr = MCQueryApiBuilder
					.create(MST_BILL_RECV_IF_R.create("T"));
			dbWkDelete("MSLAL5220_MSW_BILL_RECV_IF_D01", billRecvIfL_bldr.getBaseDbc());
			dbWkInsert("MSLAL5220_MSW_BILL_RECV_IF_I01", billRecvIfL,
					billRecvIfL_bldr.getBaseDbc());
		}

		/**
		 * ワークテーブルにデータを登録する。
		 * @return billRecvIfL
		 */
		protected MCList<MST_BILL_RECV_IF_R> srchLockBillRecvIf() {
			MCList<MST_BILL_RECV_IF_R> exeL = MCList.create(MST_BILL_RECV_IF_R.class);
			MST_BILL_RECV_IF_R t = MST_BILL_RECV_IF_R.create("T");
			MCQueryApiBuilder exeL_bldr = MCQueryApiBuilder.create(t);
			MSW_BILL_RECV_IF_KEY_R w1 = MSW_BILL_RECV_IF_KEY_R.create("W1");
			PFT_SDRV_IF_R sdrv = PFT_SDRV_IF_R.create("SDRV");

			exeL_bldr.addInnerJoin(w1, bracket(t.data_lno.eq(w1.data_lno)));
			exeL_bldr.addLeftOuterJoin(sdrv, t.data_no.eq(sdrv.data_no));
			exeL_bldr.setWhere(value(0).eq(value(0)));
			exeL_bldr.addWhereWithAnd(t.imp_flg.eq(value(true)));
			exeL_bldr.addWhereWithAnd(bracket(sdrv.sdrv_sts_typ.isNull().or(
					sdrv.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.RECV_CONV_OK.value())))));
			exeL_bldr.addOrderByAsc(t.bill_src_cd, t.ext_data_no, t.bill_no, t.bill_d_no);
			exeL_bldr.setLockTable(t.bill_src_cd, t.ext_data_no);

			dbSelectForUpdate("MSLAL5220_MST_BILL_RECV_IF_S04", exeL, exeL_bldr);

			for (MST_BILL_RECV_IF_R exeR : exeL) {
				// log_sub_key1にスレッド間でユニークな値を設定
				exeR.setParamIndex(_no);
			}
			_logger.setLogKey(exeL, MST_BILL_RECV_IF_R.$batch_log_no,
					MST_BILL_RECV_IF_R.$log_sub_key1, MST_BILL_RECV_IF_R.$log_sub_key2);
			return exeL;
		}

		protected void afterCall(MCList<MST_BILL_RECV_IF_R> exeL) {
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
		 * @param exeL 請求受信ＩＦ
		 */
		protected void rsltCnt(MCList<MST_BILL_RECV_IF_R> exeL) {
			MCIndexKey idxkey = _ope.down0().createIndex(BillRecvIf_Chk01_DtlR.$data_lno);

			for (MST_BILL_RECV_IF_R exeR : exeL) {
				BillRecvIf_Chk01_DtlR exeRslt = _ope.down0().getFirst(idxkey,
						exeR.data_lno());

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

		protected void updIf(MCList<MST_BILL_RECV_IF_R> exeL) {
			MST_BILL_RECV_IF_R t = MST_BILL_RECV_IF_R.create("T");
			MCQueryApiBuilder exeL_bldr = MCQueryApiBuilder.create(t);
			exeL_bldr.setSet(t.imp_flg, t.exe_sts_typ, t.batch_log_no, t.log_sub_key1,
					t.log_sub_key2);

			dbUpdateKey("MSLAL5220_MST_BILL_RECV_IF_U01", exeL, exeL_bldr);
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
			MCIndexKey ik = _ope.down0().createIndex(BillRecvIf_Chk01_DtlR.$log_sub_key1,
					BillRecvIf_Chk01_DtlR.$log_sub_key2);

			for (MCMessage msg : msgList) {
				MCRow causeRow = msg.getCauseRow();
				if (causeRow == null) {
					continue;
				}

				BillRecvIf_Chk01_DtlR exeR;

				if (causeRow instanceof BillRecvIf_Chk01_DtlR) {
					exeR = (BillRecvIf_Chk01_DtlR) causeRow;
				}
				else {
					MCNumber paramIndex = MCNumber.valueOf(causeRow.getParamIndex());
					MCNumber paramRowIndex = MCNumber
							.valueOf(causeRow.getParamRowIndex());
					exeR = _ope.down0().getFirst(ik, paramIndex, paramRowIndex);
				}

				if (exeR != null) {
					List<String> keyList = new ArrayList<String>();
					keyList.add(exeR.bill_src_cd());
					
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
				String billSrcCd = entry.getKey().get(0);
				pushAlert(null, null, billSrcCd, null, MODULE_ID, LOGIC_ID, OPERATION_ID,
						entry.getValue(), _logger, MSLAL0759,
						MCConst.lgclbl.getLabel(MODULE_ID, LOGIC_ID, null),
						MCDate.sysnow().toString("yyyy/MM/dd HH:mm:ss"), getCo().co_cd(), billSrcCd);
			}
		}

		/**
		 * 同一キーで新しいデータが既に処理済みかどうか。
		 * 
		 * @param exeR 取込対象行
		 * @return 処理済みの場合はtrue
		 */
		protected boolean isOkSkip(MST_BILL_RECV_IF_R exeR,
				Set<List<String>> afterExtDataSet) {
			return afterExtDataSet.contains(createErrSetKey(exeR));
		}

		/**
		 * 処理結果区分にスキップを設定する。
		 * @param exeR 取込対象行
		 */
		protected void setSkipSts(MST_BILL_RECV_IF_R exeR) {
			exeR.exe_sts_typ(MAC_EXE_STS_TYP.SKP.value());
		}

		/**
		 * ワークテーブルに含まれるデータを全て削除する。
		 * @param billRecvIfL
		 */
		protected void delBillRecvIfWk(MCList<MST_BILL_RECV_IF_R> billRecvIfL) {
			MCQueryApiBuilder billRecvIfL_bldr = MCQueryApiBuilder
					.create(MST_BILL_RECV_IF_R.create("T"));
			dbWkDelete("MSLAL5220_MSW_BILL_RECV_IF_D02", billRecvIfL_bldr.getBaseDbc());
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
	 * BillRecvIf_Upd04オペレーション.<p>
	 *
	 * 請求受信ＩＦ取込を行う。<br>
	 */
	public class BillRecvIf_Upd04 extends MSLAL_BillRecvIfService_MC_A.BillRecvIf_Upd04 {

		/**
		 * 請求受信ＩＦ取込チェックオペレーション
		 */
		protected MSLAL_BillRecvIfService.BillRecvIf_Chk01 _billRecvIfChk = MSLAL_BillRecvIfService
				.crtBillRecvIf_Chk01();

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
			up0().setString(BillRecvIf_Chk01_DtlR.$exe_sts_typ,
					MAC_EXE_STS_TYP.NOT_EXE.value());
			up0().sort(getGrpKey());
			setPegNo(up0());
		}

		protected void proc() {
			MCSavepoint sp = null;
			MCMessageList msgList = new MCMessageList();
			msgList.addAll(MCMessagePool.getMessageList());

			// 同一請求書ＮＯのデータが連続する場合（新規、訂正・・・など）を考慮し、外部システムデータＮＯの順で
			// 「チェック→更新→チェック→更新・・」と実行する
			// 請求受信では新規のみが取込対象であるが、区分値に関するチェックはBillRcpt_Chk01で実施するため実行順序は上記とする。
			MCMessagePool.clear();
			MCList<BillRecvIf_Chk01_DtlR>[] grpLArr = getGrp();

			for (MCList<BillRecvIf_Chk01_DtlR> billRecvIfL : grpLArr) {
				billRecvIfL = billRecvIfL.subList(r -> !isErr(r.bill()));
				if (billRecvIfL.size() == 0) {
					continue;
				}
				msgList.addAll(MCMessagePool.getMessageList());

				// 前に処理したデータのメッセージプールが残っていると、チェック処理が正しく行われない。
				// メッセージプールはチェックを呼び出す度にクリアする。
				MCMessagePool.clear();

				try { // 排他エラーなどチェック処理の例外をキャッチする
					MCList<BillRecvIf_Chk01_DtlR> _noErrL = null;
					callBillRecvIfChk01(billRecvIfL);
					chkGrpErr(billRecvIfL);
					chkPrevErr(billRecvIfL);
					_noErrL = billRecvIfL.subList(r -> !isErr(r.bill()));

					//全件がエラーの場合はcontinue
					if (_noErrL.size() == 0) {
						continue;
					}
					msgList.addAll(MCMessagePool.getMessageList());
					MCMessagePool.clear();

					if (!isNull(_noErrL)) {
						sp = dbTran().setSavepoint();
						execBillRegServ();
					}
				}
				catch (Exception ex) {
					handleEx(ex, sp, billRecvIfL);
				}
				finally {
					msgList.addAll(MCMessagePool.getMessageList());
					mapHdrErr(msgList);
					MCMessagePool.clear();
					sp = null;
				}
				setOK(billRecvIfL);
			}
			MCMessagePool.clear();
			MCMessagePool.addAll(msgList);
		}
		
		/**
		 * 請求受領サービス.Chk01で発生したヘッダ項目のエラーをＩＦテーブルのレコードに紐づける
		 * @param msgList 
		 */
		protected void mapHdrErr(MCMessageList msgList) {
			MCList<Chk01_DtlR> dtlL = _billRecvIfChk.down2();
			MCMessageList duplicatedMsgList = new MCMessageList();
			for (MCMessage r : msgList) {
				if (r.getCauseRow().getParamRowIndex() == -2) {
					boolean isMapped = false;
					for(Chk01_DtlR dtlR : dtlL) {
						if (!isMapped) {
							r.getCauseRow().setParamRowIndex(dtlR.getParamRowIndex());
							isMapped = true;
						}else {
							duplicatedMsgList.add(new MCMessage(dtlR,null,r.getID(),(Object[])r.getBindArray()));
						}
					}
					
				}
			}
			
			msgList.addAll(duplicatedMsgList);
		}

		/**
		 * 同一取込単位（同じ請求元ＣＤと請求書ＮＯの組み合わせ）に、エラーが存在するかどうかチェックする。<br>
		 * 一部でもエラーがあった場合、全てエラーとする。
		 * @param billRecvIfL 請求受信ＩＦリスト
		 */
		protected void chkGrpErr(MCList<BillRecvIf_Chk01_DtlR> billRecvIfL) {
			//請求受信ＩＦリストへのエラーフラグ反映用
			Set<MCNumber> errHdrPegNo = new HashSet<>();
			//同一取込単位エラーメッセージの出力用
			Set<MCNumber> errHdrPegNoForMsg = new HashSet<>();
			Set<MCNumber> errDtlPegNoForMsg = new HashSet<>();
			
			MCList<Chk01_DtlR> dtlL = _billRecvIfChk.down2();
			MCIndexKey errIdKey = dtlL.createIndex(Chk01_DtlR.$err_flg);
			
			for (Chk01_HdrR hdrR : _billRecvIfChk.down1()) {
				MCList<Chk01_DtlR> errDtlL = dtlL.subList(errIdKey, false);
				if (hdrR.err_flg()) {
					errHdrPegNo.add(hdrR.peg_no());
				}
				//ヘッダのエラー有無によらず、紐づく明細にひとつでもエラーがあればヘッダおよび全ての明細をエラーにする
				if (!isNull(dtlL.subList(errIdKey, true))) {
					hdrR.err_flg(true);
					errHdrPegNo.add(hdrR.peg_no());
					setDtlErrFlg(errDtlL,errHdrPegNoForMsg,errDtlPegNoForMsg);
				}
			}

			for (BillRecvIf_Chk01_DtlR billRecvIfR : billRecvIfL) {
				//同一取込グループ内でのエラー発生
				if (errHdrPegNoForMsg.contains(billRecvIfR.hdr_peg_no())
						&& errDtlPegNoForMsg.contains(billRecvIfR.dtl_peg_no())) {
					MCMessagePool.add(billRecvIfR, null, MSLAL0754, billRecvIfR.data_no(),
							billRecvIfR.data_lno(), billRecvIfR.bill_src_cd(),
							billRecvIfR.bill_no());
				}
				//請求受信登録サービスのチェック処理で発生したエラーを請求受信ＩＦリストに反映させる
				if (errHdrPegNo.contains(billRecvIfR.hdr_peg_no())) {
					billRecvIfR.err_flg(true);
					setErrSts(billRecvIfR);
				}
			}
			
		}
		/**
		 * 同じ請求元、請求書ＮＯで既にエラーが発生している場合、それより外部システムデータＮＯが大きいデータはスキップし処理しない
		 * 
		 * @param billRecvIfL
		 */
		protected void chkPrevErr(MCList<BillRecvIf_Chk01_DtlR> billRecvIfL) {
			MCList<BillRecvIf_Chk01_DtlR> noErrL = billRecvIfL.subList(r -> !isErr(r.bill()));
			
			for(BillRecvIf_Chk01_DtlR noErrR : noErrL) {
					if (isPrevErr(noErrR)) {
					setErrSts(noErrR);
					MCMessagePool.add(noErrR, null, MSLAL0752, noErrR.data_no(),
							noErrR.data_lno(), noErrR.bill_src_cd(), noErrR.bill_no());
				}
			}
			
		}
		
		/**
		 * エラーフラグがオフの明細のエラーフラグをオンにセットする
		 * @param targetDtlL エラーフラグがオフの明細のリスト
		 * @param errHdrPegNoForMsg エラーメッセージ表示対象のヘッダ紐づけＮＯを保持するセット
		 * @param errDtlPegNoForMsg エラーメッセージ表示対象の明細紐づけＮＯを保持するセット
		 */
		protected void setDtlErrFlg(MCList<Chk01_DtlR> targetDtlL, Set<MCNumber> errHdrPegNoForMsg, Set<MCNumber> errDtlPegNoForMsg) {
			if (!isNull(targetDtlL)) {
				for (Chk01_DtlR errDtlGrpR : targetDtlL) {
					errDtlGrpR.err_flg(true);
					if (!errHdrPegNoForMsg
							.contains(errDtlGrpR.hdr_peg_no())) {
						errHdrPegNoForMsg.add(errDtlGrpR.hdr_peg_no());
					}
					if (!errDtlPegNoForMsg.contains(errDtlGrpR.peg_no())) {
						errDtlPegNoForMsg.add(errDtlGrpR.peg_no());
					}
				}
			}
		}

		/**
		 * 取込単位で請求受信ＩＦ情報をグループ化する。
		 * @return 取込単位のグループ
		 */
		@SuppressWarnings("unchecked") // 総称配列の警告回避
		protected MCList<BillRecvIf_Chk01_DtlR>[] getGrp() {
			List<MCList<BillRecvIf_Chk01_DtlR>> arr = new ArrayList<>();
			BillRecvIf_Chk01_DtlR row = null;
			MCList<BillRecvIf_Chk01_DtlR> list = null;

			for (BillRecvIf_Chk01_DtlR r : up0()) {
				if (isNull(row) || !r.equalColumns(row, getGrpKey())) {
					list = MCList.create(BillRecvIf_Chk01_DtlR.class);
					arr.add(list);
				}
				list.add(r);
				row = r;
			}
			return arr.toArray(new MCList[arr.size()]);
		}

		protected void setOK(MCList<BillRecvIf_Chk01_DtlR> list) {
			for (BillRecvIf_Chk01_DtlR row : list) {
				if (!MAC_EXE_STS_TYP.isERR(row.exe_sts_typ())) {
					row.exe_sts_typ(MAC_EXE_STS_TYP.OK.value());
				}
			}
		}

		protected boolean isNewDtlOnly(MCList<BillRecvIf_Chk01_DtlR> l) {
			for (BillRecvIf_Chk01_DtlR r : l) {
				if (!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					return false;
				}
			}
			return true;
		}

		/**
		 * billRecvIf_Chk01を実行する
		 * @param chkL
		 * @return チェック処理によって1行でもエラーが発生していればfalse
		 */

		protected void callBillRecvIfChk01(MCList<BillRecvIf_Chk01_DtlR> chkL) {
			_billRecvIfChk.up0().setAll(chkL);
			_billRecvIfChk.exec();
		}

		/**
		 * 更新処理例外発生時の後処理を行う。
		 * @param ex 例外
		 * @param sp セーブポイント
		 * @param billRecvIfL 請求受信ＩＦリスト
		 */
		protected void handleEx(Exception ex, MCSavepoint sp,
				MCList<BillRecvIf_Chk01_DtlR> billRecvIfL) {

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

			for (BillRecvIf_Chk01_DtlR opeRow : billRecvIfL) {
				MCMessagePool.add(opeRow, null, MSLAL0755, opeRow.data_no(),
						opeRow.data_lno(), msgId, msg);
				for (MCMessage causeMsg : causeMsgList) {
					MCMessage newMsg = new MCMessage(opeRow, null, causeMsg.getID(),
							(Object[]) causeMsg.getBindArray());
					MCMessagePool.add(newMsg);
				}
				setErrSts(opeRow.bill());
			}

			if (sp != null) {
				dbTran().rollback(sp);
			}
		}

		/**
		 * MSBHL5140 請求受信登録サービスを実行する。
		 * @param billRecvIfL 請求受信ＩＦリスト
		 */
		protected void execBillRegServ() {
			MSBHL_BillRecvReg.BillRcpt_Ins01 insServ = MSBHL_BillRecvReg
					.crtBillRcpt_Ins01();

			for (Chk01_HdrR r : _billRecvIfChk.down1().subList(r -> !r.err_flg())) {
				insServ.up0().add(r);
			}
			for (Chk01_DtlR r : _billRecvIfChk.down2().subList(r -> !r.err_flg())) {
				insServ.up1().add(r);
			}
			if (!insServ.up0().isEmpty()) {
				insServ.exec();
				callAttachService(insServ.down0(), insServ.down1(), _billRecvIfChk.down0());
			}
		}

		/**
		 * billRecvIf_Upd03への下り電文を設定する。
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}

	/**
	 * BillRecvIf_Chk01オペレーション.<p>
	 *
	 * 請求受信ＩＦ取込を行う前のチェック処理<br>
	 */
	public class BillRecvIf_Chk01 extends MSLAL_BillRecvIfService_MC_A.BillRecvIf_Chk01 {

		protected int _hdrPegNo;

		protected int _dtlPegNo;

		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void initUpSub() {
			super.initUpSub();
			setItmSub(up0());
		}

		@Override
		protected void doIt() {
			super.doIt();
			initProc();
			chkGrpErr();
			callBillRegServChk();
			setErr();
			setDown();
		}

		@Override
		protected MCMessageList doServerCheck() {
			MCMessageList msgL = super.doServerCheck();
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<BillRecvIf_Chk01_DtlR> _noErrL = getChkList(up0());

			if (_noErrL.isEmpty()) {
				return msgL;
			}
			msgL.addAll(chkDataCrudTyp(_noErrL));
			msgL.addAll(chkDuplicate(_noErrL));
			msgL.addAll(chkHdrItm(_noErrL));

			return msgL;
		}

		/**
		 * データ更新区分が新規かどうかチェックする。新規以外の場合はエラーとする。
		 * @param billRecvIfL 請求受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkDataCrudTyp(
				MCList<BillRecvIf_Chk01_DtlR> billRecvIfL) {
			MCMessageList msgL = new MCMessageList();

			for (BillRecvIf_Chk01_DtlR r : billRecvIfL) {
				if (!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					msgL.add(new MCMessage(r, null, MSLAL0756, r.data_no(), r.data_lno(),
							r.bill_src_cd(), r.bill_no()));
				}
			}
			return msgL;
		}
		
		/**
		 * リストロジックチェックを行う前に、品目の枝番、手配ＮＯを設定する。
		 * @param billRecvIfL 請求受信ＩＦリスト
		 */
		protected void setItmSub(MCList<BillRecvIf_Chk01_DtlR> billRecvIfL) {
			
			for (BillRecvIf_Chk01_DtlR billRecvIfR : billRecvIfL) {
				
				if (!isNull(billRecvIfR.itm_cd())) {
					billRecvIfR.itm_sub1(nvl(billRecvIfR.itm_sub1(), MAC_STR.NULL_VAL.value()));
					billRecvIfR.itm_sub2(nvl(billRecvIfR.itm_sub2(), MAC_STR.NULL_VAL.value()));
					billRecvIfR.itm_sub3(nvl(billRecvIfR.itm_sub3(), MAC_STR.NULL_VAL.value()));
					
					billRecvIfR.sno1(nvl(billRecvIfR.sno1(), MAC_STR.NULL_VAL.value()));
					billRecvIfR.sno2(nvl(billRecvIfR.sno2(), MAC_STR.NULL_VAL.value()));
					billRecvIfR.sno3(nvl(billRecvIfR.sno3(), MAC_STR.NULL_VAL.value()));
					billRecvIfR.sno4(nvl(billRecvIfR.sno4(), MAC_STR.NULL_VAL.value()));
				}
			}
		}

		/**
		 * 取込対象内で、外部システムデータNO-請求元-請求書NO-請求明細NOの組み合わせが重複していないかチェックする。
		 * @param billRecvIfL 請求受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkDuplicate(MCList<BillRecvIf_Chk01_DtlR> billRecvIfL) {
			MCMessageList msgL = new MCMessageList();

			for (MCList<BillRecvIf_Chk01_DtlR> grpL : billRecvIfL
					.groupList(BillRecvIf_Chk01_DtlR.$bill_d_no)) {
				if (1 < grpL.size()) {
					for (BillRecvIf_Chk01_DtlR r : grpL) {
						msgL.add(new MCMessage(r, null, MSLAL0757, r.data_no(),
								r.data_lno(), r.bill_src_cd(), r.bill_no(), r.bill_d_no()));
					}
				}
			}
			return msgL;
		}

		/**
		 * 取込対象内（同一外部システムデータNO-請求元-請求書NO）に、異なるヘッダ項目があればエラー
		 * @param billRecvIfL 請求受信ＩＦリスト
		 * @return メッセージリスト
		 */
		protected MCMessageList chkHdrItm(MCList<BillRecvIf_Chk01_DtlR> billRecvIfL) {
			MCMessageList msgL = new MCMessageList();
			if (!isSameHdr(billRecvIfL)) {
				for (BillRecvIf_Chk01_DtlR r : billRecvIfL) {
					msgL.add(new MCMessage(r, null, MSLAL0758, r.data_no(), r.data_lno(),
							r.bill_src_cd(), r.bill_no()));
				}
			}
			return msgL;
		}

		/**
		 * 同一取込単位のうち、エラーが存在するかどうかチェックする。
		 * @param billRecvIfL 請求受信ＩＦリスト
		 * @return メッセージリスト
		 */
		protected void chkGrpErr() {
			MCIndexKey errFlgKey = up0().createIndex(BillRecvIf_Chk01_DtlR.$err_flg);
			if (up0().contains(errFlgKey, true)) {
				for (BillRecvIf_Chk01_DtlR billRecvIfR : up0()) {
					if (!billRecvIfR.err_flg()) {
						billRecvIfR.err_flg(true);
						MCMessagePool.add(billRecvIfR, null, MSLAL0754,
								billRecvIfR.data_no(), billRecvIfR.data_lno(),
								billRecvIfR.bill_src_cd(), billRecvIfR.bill_no());
					}
				}
			}
		}

		/**
		 *引数のリストが、全て同じヘッダ情報であればtrue、そうでなければfalseを返す
		 * @param billRecvIfL 請求受信ＩＦリスト
		 * @return 同じヘッダ情報であればtrue、そうでなければfalse
		 */
		protected Boolean isSameHdr(MCList<BillRecvIf_Chk01_DtlR> billRecvIfL) {
			MCList<BillRecvIf_Chk01_DtlR> grpLL[] = billRecvIfL
					.groupList(getBillRecvIfHdrKey());
			if (grpLL.length > 1) {
				return false;
			}
			return true;
		}

		/**
		 * 請求受信登録サービスのチェック処理を実行する。
		 */
		protected void callBillRegServChk() {
			MCList<Chk01_HdrR> upHdrL = MCList.create(Chk01_HdrR.class);
			MCList<Chk01_DtlR> upDtlL = MCList.create(Chk01_DtlR.class);
			MCList<BillRecvIf_Chk01_DtlR> noErrIfL = getChkList(up0());
			if (!noErrIfL.isEmpty()) {
				//電文を作成する
				setChk01Up(noErrIfL, upHdrL, upDtlL);

				_chk01Serv.up0().setAll(upHdrL);
				_chk01Serv.up1().setAll(upDtlL);

				List<MCContainer> upCL = new ArrayList<MCContainer>();
				upCL.add(_chk01Serv.up0());
				upCL.add(_chk01Serv.up1());
				setParamRowIndexBody(upCL);
				_chk01Serv.exec();

				down1().setAll(_chk01Serv.down0());
				down2().setAll(_chk01Serv.down1());
			}
		}

		/**
		 * paramIndex/paramRowIndex設定処理本体
		 * ヘッダの上り電文up0については、行インデックスを常に-2に設定する
		 * @param upCL
		 */
		protected void setParamRowIndexBody(List<MCContainer> upCL) {
			int idx = 0;
			for (MCContainer upC : upCL) {
				if (upC instanceof MCList) {
					for (Object o : (MCList<?>) upC) {
						if (o instanceof MCRow) {
							MCRow upR = (MCRow) o;
							if (idx == 0) {
								upR.setParamRowIndex(-2);
							}
						}
					}
				}
				idx++;
			}
		}

		protected void initProc() {
			_hdrPegNo = 0;
			_dtlPegNo = 0;
			setPegNo(up0());
		}

		/**
		 * 請求登録サービスのチェック01オペレーションへの上り電文を作成する
		 */
		protected void setChk01Up(MCList<BillRecvIf_Chk01_DtlR> noErrIfL,
				MCList<Chk01_HdrR> upHdrL, MCList<Chk01_DtlR> upDtlL) {
			Chk01_HdrR upHdrPrevR = _chk01Serv.up0().createRow();
			Chk01_HdrR upHdrR = _chk01Serv.up0().createRow();
			Chk01_DtlR upDtlR = _chk01Serv.up1().createRow();

			for (BillRecvIf_Chk01_DtlR noErrIfR : noErrIfL) {
				copy(upHdrR, noErrIfR, createMap_Chk01_HdrR_BillRecvIf_Chk01_DtlR());
				//複数の明細をもつヘッダは１つにまとめる
				if (upHdrPrevR.isEmpty()
						|| !(isSame(upHdrPrevR.bill_src_cd(), upHdrR.bill_src_cd())
								&& isSame(upHdrPrevR.bill_no(), upHdrR.bill_no()))) {
					_hdrPegNo++;
					upHdrR.peg_no(_hdrPegNo);
					//相殺額の符号を反転させる
					upHdrR.setoff_amt(upHdrR.setoff_amt().multiply(-1));
					upHdrL.add(upHdrR.clone());
					MCRow.copyall(upHdrPrevR, upHdrR);
				}

				//ヘッダ紐づけNOを明細に紐づける
				copy(upDtlR, noErrIfR, createMap_Chk01_DtlR_BillRecvIf_Chk01_DtlR());
				_dtlPegNo++;
				upDtlR.hdr_peg_no(_hdrPegNo);
				upDtlR.peg_no(_dtlPegNo);
				upDtlL.add(upDtlR.clone());

				//IfLにもページＮＯを紐づける
				noErrIfR.hdr_peg_no(_hdrPegNo);
				noErrIfR.dtl_peg_no(_dtlPegNo);

			}
		}

		/**
		 * 請求受信ＩＦのヘッダ項目を返す。
		 * @return ヘッダ項目
		 */
		protected String[] getBillRecvIfHdrKey() {

			return new String[] {
					BillRecvIf_Chk01_DtlR.$bill_cl_dt, BillRecvIf_Chk01_DtlR.$bill_dt,
					BillRecvIf_Chk01_DtlR.$bill_no, BillRecvIf_Chk01_DtlR.$pre_bill_no,
					BillRecvIf_Chk01_DtlR.$pre_bill_dt, BillRecvIf_Chk01_DtlR.$bill_st_dt,
					BillRecvIf_Chk01_DtlR.$bill_end_dt, BillRecvIf_Chk01_DtlR.$iv_no,
					BillRecvIf_Chk01_DtlR.$wrk_no, BillRecvIf_Chk01_DtlR.$wrk_nm,
					BillRecvIf_Chk01_DtlR.$bill_src_cd,
					BillRecvIf_Chk01_DtlR.$bill_src_ein,
					BillRecvIf_Chk01_DtlR.$bill_src_biz_co_no,
					BillRecvIf_Chk01_DtlR.$bill_src_zip_cd,
					BillRecvIf_Chk01_DtlR.$bill_src_addr1,
					BillRecvIf_Chk01_DtlR.$bill_src_addr2,
					BillRecvIf_Chk01_DtlR.$bill_src_addr3,
					BillRecvIf_Chk01_DtlR.$bill_src_addr4,
					BillRecvIf_Chk01_DtlR.$bill_src_dpt,
					BillRecvIf_Chk01_DtlR.$bill_src_tel,
					BillRecvIf_Chk01_DtlR.$trd_cur_cd, BillRecvIf_Chk01_DtlR.$bill_xrate,
					BillRecvIf_Chk01_DtlR.$last_bill_amt, BillRecvIf_Chk01_DtlR.$rcv_amt,
					BillRecvIf_Chk01_DtlR.$sw_amt, BillRecvIf_Chk01_DtlR.$setoff_amt,
					BillRecvIf_Chk01_DtlR.$bfw_amt, BillRecvIf_Chk01_DtlR.$sls_amt,
					BillRecvIf_Chk01_DtlR.$dscnt_amt, BillRecvIf_Chk01_DtlR.$ret_amt,
					BillRecvIf_Chk01_DtlR.$tax_amt, BillRecvIf_Chk01_DtlR.$sw_to_amt,
					BillRecvIf_Chk01_DtlR.$bill_amt,
					BillRecvIf_Chk01_DtlR.$tax_rate1,
					BillRecvIf_Chk01_DtlR.$tax_rate_sls_amt1,
					BillRecvIf_Chk01_DtlR.$tax_rate_tax_amt1,
					BillRecvIf_Chk01_DtlR.$tax_rate_base_tax_amt1,
					BillRecvIf_Chk01_DtlR.$tax_rate2,
					BillRecvIf_Chk01_DtlR.$tax_rate_sls_amt2,
					BillRecvIf_Chk01_DtlR.$tax_rate_tax_amt2,
					BillRecvIf_Chk01_DtlR.$tax_rate_base_tax_amt2,
					BillRecvIf_Chk01_DtlR.$tax_rate3,
					BillRecvIf_Chk01_DtlR.$tax_rate_sls_amt3,
					BillRecvIf_Chk01_DtlR.$tax_rate_tax_amt3,
					BillRecvIf_Chk01_DtlR.$tax_rate_base_tax_amt3,
					BillRecvIf_Chk01_DtlR.$tax_rate4,
					BillRecvIf_Chk01_DtlR.$tax_rate_sls_amt4,
					BillRecvIf_Chk01_DtlR.$tax_rate_tax_amt4,
					BillRecvIf_Chk01_DtlR.$tax_rate_base_tax_amt4,
					BillRecvIf_Chk01_DtlR.$tax_rate5,
					BillRecvIf_Chk01_DtlR.$tax_rate_sls_amt5,
					BillRecvIf_Chk01_DtlR.$tax_rate_tax_amt5,
					BillRecvIf_Chk01_DtlR.$tax_rate_base_tax_amt5,
					BillRecvIf_Chk01_DtlR.$tax_rate6,
					BillRecvIf_Chk01_DtlR.$tax_rate_sls_amt6,
					BillRecvIf_Chk01_DtlR.$tax_rate_tax_amt6,
					BillRecvIf_Chk01_DtlR.$tax_rate_base_tax_amt6,
					BillRecvIf_Chk01_DtlR.$tax_rate7,
					BillRecvIf_Chk01_DtlR.$tax_rate_sls_amt7,
					BillRecvIf_Chk01_DtlR.$tax_rate_tax_amt7,
					BillRecvIf_Chk01_DtlR.$tax_rate_base_tax_amt7,
					BillRecvIf_Chk01_DtlR.$tax_rate8,
					BillRecvIf_Chk01_DtlR.$tax_rate_sls_amt8,
					BillRecvIf_Chk01_DtlR.$tax_rate_tax_amt8,
					BillRecvIf_Chk01_DtlR.$tax_rate_base_tax_amt8,
					BillRecvIf_Chk01_DtlR.$tax_rate9,
					BillRecvIf_Chk01_DtlR.$tax_rate_sls_amt9,
					BillRecvIf_Chk01_DtlR.$tax_rate_tax_amt9,
					BillRecvIf_Chk01_DtlR.$tax_rate_base_tax_amt9,
					BillRecvIf_Chk01_DtlR.$tax_rate10,
					BillRecvIf_Chk01_DtlR.$tax_rate_sls_amt10,
					BillRecvIf_Chk01_DtlR.$tax_rate_tax_amt10,
					BillRecvIf_Chk01_DtlR.$tax_rate_base_tax_amt10,
					BillRecvIf_Chk01_DtlR.$adv_amt_bal,
					BillRecvIf_Chk01_DtlR.$adv_amt,
					BillRecvIf_Chk01_DtlR.$adv_setoff_amt,
					BillRecvIf_Chk01_DtlR.$adv_setoff_tax_amt,
					BillRecvIf_Chk01_DtlR.$pay_schd_dt1,
					BillRecvIf_Chk01_DtlR.$pay_schd_amt1,
					BillRecvIf_Chk01_DtlR.$pay_mtd_cd1,
					BillRecvIf_Chk01_DtlR.$pay_schd_dt2,
					BillRecvIf_Chk01_DtlR.$pay_schd_amt2,
					BillRecvIf_Chk01_DtlR.$pay_mtd_cd2,
					BillRecvIf_Chk01_DtlR.$pay_schd_dt3,
					BillRecvIf_Chk01_DtlR.$pay_schd_amt3,
					BillRecvIf_Chk01_DtlR.$pay_mtd_cd3,
					BillRecvIf_Chk01_DtlR.$pay_schd_dt4,
					BillRecvIf_Chk01_DtlR.$pay_schd_amt4,
					BillRecvIf_Chk01_DtlR.$pay_mtd_cd4,
					BillRecvIf_Chk01_DtlR.$pay_schd_dt5,
					BillRecvIf_Chk01_DtlR.$pay_schd_amt5,
					BillRecvIf_Chk01_DtlR.$pay_mtd_cd5,
					BillRecvIf_Chk01_DtlR.$pay_schd_dt6,
					BillRecvIf_Chk01_DtlR.$pay_schd_amt6,
					BillRecvIf_Chk01_DtlR.$pay_mtd_cd6,
					BillRecvIf_Chk01_DtlR.$pay_schd_dt7,
					BillRecvIf_Chk01_DtlR.$pay_schd_amt7,
					BillRecvIf_Chk01_DtlR.$pay_mtd_cd7,
					BillRecvIf_Chk01_DtlR.$pay_schd_dt8,
					BillRecvIf_Chk01_DtlR.$pay_schd_amt8,
					BillRecvIf_Chk01_DtlR.$pay_mtd_cd8,
					BillRecvIf_Chk01_DtlR.$pay_schd_dt9,
					BillRecvIf_Chk01_DtlR.$pay_schd_amt9,
					BillRecvIf_Chk01_DtlR.$pay_mtd_cd9,
					BillRecvIf_Chk01_DtlR.$pay_schd_dt10,
					BillRecvIf_Chk01_DtlR.$pay_schd_amt10,
					BillRecvIf_Chk01_DtlR.$pay_mtd_cd10,
					BillRecvIf_Chk01_DtlR.$bank_ac_cd,
					BillRecvIf_Chk01_DtlR.$bill_bcst_nm, BillRecvIf_Chk01_DtlR.$bill_ein,
					BillRecvIf_Chk01_DtlR.$bill_biz_co_no,
					BillRecvIf_Chk01_DtlR.$bill_zip_cd, BillRecvIf_Chk01_DtlR.$bill_addr1,
					BillRecvIf_Chk01_DtlR.$bill_addr2, BillRecvIf_Chk01_DtlR.$bill_addr3,
					BillRecvIf_Chk01_DtlR.$bill_addr4,
					BillRecvIf_Chk01_DtlR.$bill_bcst_dpt, BillRecvIf_Chk01_DtlR.$bill_tel
			};
		}

		/**
		 * エラー行に対してPG実行状況区分をセットする
		 */
		protected void setErr() {
			for (BillRecvIf_Chk01_DtlR r : up0()) {
				if (r.err_flg()) {
					setErrSts(r);
				}
			}
		}

		/**
		 * BillRecvIf_Upd04への下り電文を設定する
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		protected Map_Chk01_HdrR_BillRecvIf_Chk01_DtlR<Chk01_HdrR, BillRecvIf_Chk01_DtlR> createMap_Chk01_HdrR_BillRecvIf_Chk01_DtlR() {
			return new Map_Chk01_HdrR_BillRecvIf_Chk01_DtlR<Chk01_HdrR, BillRecvIf_Chk01_DtlR>();
		}

		protected Map_Chk01_DtlR_BillRecvIf_Chk01_DtlR<Chk01_DtlR, BillRecvIf_Chk01_DtlR> createMap_Chk01_DtlR_BillRecvIf_Chk01_DtlR() {
			return new Map_Chk01_DtlR_BillRecvIf_Chk01_DtlR<Chk01_DtlR, BillRecvIf_Chk01_DtlR>();
		}

		public class Map_Chk01_HdrR_BillRecvIf_Chk01_DtlR<D extends Chk01_HdrR, S extends BillRecvIf_Chk01_DtlR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk01_HdrR.$peg_no, BillRecvIf_Chk01_DtlR.$hdr_peg_no);
				addColumnPathMap(Chk01_HdrR.$err_flg, BillRecvIf_Chk01_DtlR.$err_flg);
				addColumnPathMap(Chk01_HdrR.$data_crud_typ,
						BillRecvIf_Chk01_DtlR.$data_crud_typ);
				addColumnPathMap(Chk01_HdrR.$bill_cl_dt,
						BillRecvIf_Chk01_DtlR.$bill_cl_dt);
				addColumnPathMap(Chk01_HdrR.$bill_dt, BillRecvIf_Chk01_DtlR.$bill_dt);
				addColumnPathMap(Chk01_HdrR.$bill_no, BillRecvIf_Chk01_DtlR.$bill_no);
				addColumnPathMap(Chk01_HdrR.$pre_bill_no,
						BillRecvIf_Chk01_DtlR.$pre_bill_no);
				addColumnPathMap(Chk01_HdrR.$pre_bill_dt,
						BillRecvIf_Chk01_DtlR.$pre_bill_dt);
				addColumnPathMap(Chk01_HdrR.$bill_st_dt,
						BillRecvIf_Chk01_DtlR.$bill_st_dt);
				addColumnPathMap(Chk01_HdrR.$bill_end_dt,
						BillRecvIf_Chk01_DtlR.$bill_end_dt);
				addColumnPathMap(Chk01_HdrR.$iv_no, BillRecvIf_Chk01_DtlR.$iv_no);
				addColumnPathMap(Chk01_HdrR.$wrk_no, BillRecvIf_Chk01_DtlR.$wrk_no);
				addColumnPathMap(Chk01_HdrR.$wrk_nm, BillRecvIf_Chk01_DtlR.$wrk_nm);
				addColumnPathMap(Chk01_HdrR.$bill_src_cd,
						BillRecvIf_Chk01_DtlR.$bill_src_cd);
				addColumnPathMap(Chk01_HdrR.$bill_src_ein,
						BillRecvIf_Chk01_DtlR.$bill_src_ein);
				addColumnPathMap(Chk01_HdrR.$bill_src_biz_co_no,
						BillRecvIf_Chk01_DtlR.$bill_src_biz_co_no);
				addColumnPathMap(Chk01_HdrR.$bill_src_zip_cd,
						BillRecvIf_Chk01_DtlR.$bill_src_zip_cd);
				addColumnPathMap(Chk01_HdrR.$bill_src_addr1,
						BillRecvIf_Chk01_DtlR.$bill_src_addr1);
				addColumnPathMap(Chk01_HdrR.$bill_src_addr2,
						BillRecvIf_Chk01_DtlR.$bill_src_addr2);
				addColumnPathMap(Chk01_HdrR.$bill_src_addr3,
						BillRecvIf_Chk01_DtlR.$bill_src_addr3);
				addColumnPathMap(Chk01_HdrR.$bill_src_addr4,
						BillRecvIf_Chk01_DtlR.$bill_src_addr4);
				addColumnPathMap(Chk01_HdrR.$bill_src_dpt,
						BillRecvIf_Chk01_DtlR.$bill_src_dpt);
				addColumnPathMap(Chk01_HdrR.$bill_src_tel,
						BillRecvIf_Chk01_DtlR.$bill_src_tel);
				addColumnPathMap(Chk01_HdrR.$trd_cur_cd,
						BillRecvIf_Chk01_DtlR.$trd_cur_cd);
				addColumnPathMap(Chk01_HdrR.$bill_xrate,
						BillRecvIf_Chk01_DtlR.$bill_xrate);
				addColumnPathMap(Chk01_HdrR.$last_bill_amt,
						BillRecvIf_Chk01_DtlR.$last_bill_amt);
				addColumnPathMap(Chk01_HdrR.$rcv_amt, BillRecvIf_Chk01_DtlR.$rcv_amt);
				addColumnPathMap(Chk01_HdrR.$sw_amt, BillRecvIf_Chk01_DtlR.$sw_amt);
				addColumnPathMap(Chk01_HdrR.$setoff_amt,
						BillRecvIf_Chk01_DtlR.$setoff_amt);
				addColumnPathMap(Chk01_HdrR.$bfw_amt, BillRecvIf_Chk01_DtlR.$bfw_amt);
				addColumnPathMap(Chk01_HdrR.$sls_amt, BillRecvIf_Chk01_DtlR.$sls_amt);
				addColumnPathMap(Chk01_HdrR.$dscnt_amt, BillRecvIf_Chk01_DtlR.$dscnt_amt);
				addColumnPathMap(Chk01_HdrR.$ret_amt, BillRecvIf_Chk01_DtlR.$ret_amt);
				addColumnPathMap(Chk01_HdrR.$tax_amt, BillRecvIf_Chk01_DtlR.$tax_amt);
				addColumnPathMap(Chk01_HdrR.$sw_to_amt, BillRecvIf_Chk01_DtlR.$sw_to_amt);
				addColumnPathMap(Chk01_HdrR.$bill_amt, BillRecvIf_Chk01_DtlR.$bill_amt);
				addColumnPathMap(Chk01_HdrR.$tax_rate1, BillRecvIf_Chk01_DtlR.$tax_rate1);
				addColumnPathMap(Chk01_HdrR.$tax_rate_sls_amt1,
						BillRecvIf_Chk01_DtlR.$tax_rate_sls_amt1);
				addColumnPathMap(Chk01_HdrR.$tax_rate_tax_amt1,
						BillRecvIf_Chk01_DtlR.$tax_rate_tax_amt1);
				addColumnPathMap(Chk01_HdrR.$tax_rate_base_tax_amt1,
						BillRecvIf_Chk01_DtlR.$tax_rate_base_tax_amt1);
				addColumnPathMap(Chk01_HdrR.$tax_rate2, BillRecvIf_Chk01_DtlR.$tax_rate2);
				addColumnPathMap(Chk01_HdrR.$tax_rate_sls_amt2,
						BillRecvIf_Chk01_DtlR.$tax_rate_sls_amt2);
				addColumnPathMap(Chk01_HdrR.$tax_rate_tax_amt2,
						BillRecvIf_Chk01_DtlR.$tax_rate_tax_amt2);
				addColumnPathMap(Chk01_HdrR.$tax_rate_base_tax_amt2,
						BillRecvIf_Chk01_DtlR.$tax_rate_base_tax_amt2);
				addColumnPathMap(Chk01_HdrR.$tax_rate3, BillRecvIf_Chk01_DtlR.$tax_rate3);
				addColumnPathMap(Chk01_HdrR.$tax_rate_sls_amt3,
						BillRecvIf_Chk01_DtlR.$tax_rate_sls_amt3);
				addColumnPathMap(Chk01_HdrR.$tax_rate_tax_amt3,
						BillRecvIf_Chk01_DtlR.$tax_rate_tax_amt3);
				addColumnPathMap(Chk01_HdrR.$tax_rate_base_tax_amt3,
						BillRecvIf_Chk01_DtlR.$tax_rate_base_tax_amt3);
				addColumnPathMap(Chk01_HdrR.$tax_rate4, BillRecvIf_Chk01_DtlR.$tax_rate4);
				addColumnPathMap(Chk01_HdrR.$tax_rate_sls_amt4,
						BillRecvIf_Chk01_DtlR.$tax_rate_sls_amt4);
				addColumnPathMap(Chk01_HdrR.$tax_rate_tax_amt4,
						BillRecvIf_Chk01_DtlR.$tax_rate_tax_amt4);
				addColumnPathMap(Chk01_HdrR.$tax_rate_base_tax_amt4,
						BillRecvIf_Chk01_DtlR.$tax_rate_base_tax_amt4);
				addColumnPathMap(Chk01_HdrR.$tax_rate5, BillRecvIf_Chk01_DtlR.$tax_rate5);
				addColumnPathMap(Chk01_HdrR.$tax_rate_sls_amt5,
						BillRecvIf_Chk01_DtlR.$tax_rate_sls_amt5);
				addColumnPathMap(Chk01_HdrR.$tax_rate_tax_amt5,
						BillRecvIf_Chk01_DtlR.$tax_rate_tax_amt5);
				addColumnPathMap(Chk01_HdrR.$tax_rate_base_tax_amt5,
						BillRecvIf_Chk01_DtlR.$tax_rate_base_tax_amt5);
				addColumnPathMap(Chk01_HdrR.$tax_rate6, BillRecvIf_Chk01_DtlR.$tax_rate6);
				addColumnPathMap(Chk01_HdrR.$tax_rate_sls_amt6,
						BillRecvIf_Chk01_DtlR.$tax_rate_sls_amt6);
				addColumnPathMap(Chk01_HdrR.$tax_rate_tax_amt6,
						BillRecvIf_Chk01_DtlR.$tax_rate_tax_amt6);
				addColumnPathMap(Chk01_HdrR.$tax_rate_base_tax_amt6,
						BillRecvIf_Chk01_DtlR.$tax_rate_base_tax_amt6);
				addColumnPathMap(Chk01_HdrR.$tax_rate7, BillRecvIf_Chk01_DtlR.$tax_rate7);
				addColumnPathMap(Chk01_HdrR.$tax_rate_sls_amt7,
						BillRecvIf_Chk01_DtlR.$tax_rate_sls_amt7);
				addColumnPathMap(Chk01_HdrR.$tax_rate_tax_amt7,
						BillRecvIf_Chk01_DtlR.$tax_rate_tax_amt7);
				addColumnPathMap(Chk01_HdrR.$tax_rate_base_tax_amt7,
						BillRecvIf_Chk01_DtlR.$tax_rate_base_tax_amt7);
				addColumnPathMap(Chk01_HdrR.$tax_rate8, BillRecvIf_Chk01_DtlR.$tax_rate8);
				addColumnPathMap(Chk01_HdrR.$tax_rate_sls_amt8,
						BillRecvIf_Chk01_DtlR.$tax_rate_sls_amt8);
				addColumnPathMap(Chk01_HdrR.$tax_rate_tax_amt8,
						BillRecvIf_Chk01_DtlR.$tax_rate_tax_amt8);
				addColumnPathMap(Chk01_HdrR.$tax_rate_base_tax_amt8,
						BillRecvIf_Chk01_DtlR.$tax_rate_base_tax_amt8);
				addColumnPathMap(Chk01_HdrR.$tax_rate9, BillRecvIf_Chk01_DtlR.$tax_rate9);
				addColumnPathMap(Chk01_HdrR.$tax_rate_sls_amt9,
						BillRecvIf_Chk01_DtlR.$tax_rate_sls_amt9);
				addColumnPathMap(Chk01_HdrR.$tax_rate_tax_amt9,
						BillRecvIf_Chk01_DtlR.$tax_rate_tax_amt9);
				addColumnPathMap(Chk01_HdrR.$tax_rate_base_tax_amt9,
						BillRecvIf_Chk01_DtlR.$tax_rate_base_tax_amt9);
				addColumnPathMap(Chk01_HdrR.$tax_rate10, BillRecvIf_Chk01_DtlR.$tax_rate10);
				addColumnPathMap(Chk01_HdrR.$tax_rate_sls_amt10,
						BillRecvIf_Chk01_DtlR.$tax_rate_sls_amt10);
				addColumnPathMap(Chk01_HdrR.$tax_rate_tax_amt10,
						BillRecvIf_Chk01_DtlR.$tax_rate_tax_amt10);
				addColumnPathMap(Chk01_HdrR.$tax_rate_base_tax_amt10,
						BillRecvIf_Chk01_DtlR.$tax_rate_base_tax_amt10);
				addColumnPathMap(Chk01_HdrR.$adv_amt_bal,
						BillRecvIf_Chk01_DtlR.$adv_amt_bal);
				addColumnPathMap(Chk01_HdrR.$adv_amt,
						BillRecvIf_Chk01_DtlR.$adv_amt);
				addColumnPathMap(Chk01_HdrR.$adv_setoff_amt,
						BillRecvIf_Chk01_DtlR.$adv_setoff_amt);
				addColumnPathMap(Chk01_HdrR.$adv_setoff_tax_amt,
						BillRecvIf_Chk01_DtlR.$adv_setoff_tax_amt);
				addColumnPathMap(Chk01_HdrR.$pay_schd_dt1,
						BillRecvIf_Chk01_DtlR.$pay_schd_dt1);
				addColumnPathMap(Chk01_HdrR.$pay_schd_amt1,
						BillRecvIf_Chk01_DtlR.$pay_schd_amt1);
				addColumnPathMap(Chk01_HdrR.$pay_mtd_cd1,
						BillRecvIf_Chk01_DtlR.$pay_mtd_cd1);
				addColumnPathMap(Chk01_HdrR.$pay_schd_dt2,
						BillRecvIf_Chk01_DtlR.$pay_schd_dt2);
				addColumnPathMap(Chk01_HdrR.$pay_schd_amt2,
						BillRecvIf_Chk01_DtlR.$pay_schd_amt2);
				addColumnPathMap(Chk01_HdrR.$pay_mtd_cd2,
						BillRecvIf_Chk01_DtlR.$pay_mtd_cd2);
				addColumnPathMap(Chk01_HdrR.$pay_schd_dt3,
						BillRecvIf_Chk01_DtlR.$pay_schd_dt3);
				addColumnPathMap(Chk01_HdrR.$pay_schd_amt3,
						BillRecvIf_Chk01_DtlR.$pay_schd_amt3);
				addColumnPathMap(Chk01_HdrR.$pay_mtd_cd3,
						BillRecvIf_Chk01_DtlR.$pay_mtd_cd3);
				addColumnPathMap(Chk01_HdrR.$pay_schd_dt4,
						BillRecvIf_Chk01_DtlR.$pay_schd_dt4);
				addColumnPathMap(Chk01_HdrR.$pay_schd_amt4,
						BillRecvIf_Chk01_DtlR.$pay_schd_amt4);
				addColumnPathMap(Chk01_HdrR.$pay_mtd_cd4,
						BillRecvIf_Chk01_DtlR.$pay_mtd_cd4);
				addColumnPathMap(Chk01_HdrR.$pay_schd_dt5,
						BillRecvIf_Chk01_DtlR.$pay_schd_dt5);
				addColumnPathMap(Chk01_HdrR.$pay_schd_amt5,
						BillRecvIf_Chk01_DtlR.$pay_schd_amt5);
				addColumnPathMap(Chk01_HdrR.$pay_mtd_cd5,
						BillRecvIf_Chk01_DtlR.$pay_mtd_cd5);
				addColumnPathMap(Chk01_HdrR.$pay_schd_dt6,
						BillRecvIf_Chk01_DtlR.$pay_schd_dt6);
				addColumnPathMap(Chk01_HdrR.$pay_schd_amt6,
						BillRecvIf_Chk01_DtlR.$pay_schd_amt6);
				addColumnPathMap(Chk01_HdrR.$pay_mtd_cd6,
						BillRecvIf_Chk01_DtlR.$pay_mtd_cd6);
				addColumnPathMap(Chk01_HdrR.$pay_schd_dt7,
						BillRecvIf_Chk01_DtlR.$pay_schd_dt7);
				addColumnPathMap(Chk01_HdrR.$pay_schd_amt7,
						BillRecvIf_Chk01_DtlR.$pay_schd_amt7);
				addColumnPathMap(Chk01_HdrR.$pay_mtd_cd7,
						BillRecvIf_Chk01_DtlR.$pay_mtd_cd7);
				addColumnPathMap(Chk01_HdrR.$pay_schd_dt8,
						BillRecvIf_Chk01_DtlR.$pay_schd_dt8);
				addColumnPathMap(Chk01_HdrR.$pay_schd_amt8,
						BillRecvIf_Chk01_DtlR.$pay_schd_amt8);
				addColumnPathMap(Chk01_HdrR.$pay_mtd_cd8,
						BillRecvIf_Chk01_DtlR.$pay_mtd_cd8);
				addColumnPathMap(Chk01_HdrR.$pay_schd_dt9,
						BillRecvIf_Chk01_DtlR.$pay_schd_dt9);
				addColumnPathMap(Chk01_HdrR.$pay_schd_amt9,
						BillRecvIf_Chk01_DtlR.$pay_schd_amt9);
				addColumnPathMap(Chk01_HdrR.$pay_mtd_cd9,
						BillRecvIf_Chk01_DtlR.$pay_mtd_cd9);
				addColumnPathMap(Chk01_HdrR.$pay_schd_dt10,
						BillRecvIf_Chk01_DtlR.$pay_schd_dt10);
				addColumnPathMap(Chk01_HdrR.$pay_schd_amt10,
						BillRecvIf_Chk01_DtlR.$pay_schd_amt10);
				addColumnPathMap(Chk01_HdrR.$pay_mtd_cd10,
						BillRecvIf_Chk01_DtlR.$pay_mtd_cd10);
				addColumnPathMap(Chk01_HdrR.$bank_ac_cd,
						BillRecvIf_Chk01_DtlR.$bank_ac_cd);
				addColumnPathMap(Chk01_HdrR.$bill_bcst_nm,
						BillRecvIf_Chk01_DtlR.$bill_bcst_nm);
				addColumnPathMap(Chk01_HdrR.$bill_ein, BillRecvIf_Chk01_DtlR.$bill_ein);
				addColumnPathMap(Chk01_HdrR.$bill_biz_co_no,
						BillRecvIf_Chk01_DtlR.$bill_biz_co_no);
				addColumnPathMap(Chk01_HdrR.$bill_zip_cd,
						BillRecvIf_Chk01_DtlR.$bill_zip_cd);
				addColumnPathMap(Chk01_HdrR.$bill_addr1,
						BillRecvIf_Chk01_DtlR.$bill_addr1);
				addColumnPathMap(Chk01_HdrR.$bill_addr2,
						BillRecvIf_Chk01_DtlR.$bill_addr2);
				addColumnPathMap(Chk01_HdrR.$bill_addr3,
						BillRecvIf_Chk01_DtlR.$bill_addr3);
				addColumnPathMap(Chk01_HdrR.$bill_addr4,
						BillRecvIf_Chk01_DtlR.$bill_addr4);
				addColumnPathMap(Chk01_HdrR.$bill_bcst_dpt,
						BillRecvIf_Chk01_DtlR.$bill_bcst_dpt);
				addColumnPathMap(Chk01_HdrR.$bill_tel, BillRecvIf_Chk01_DtlR.$bill_tel);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				dest.setParamIndex(src.bill().getParamIndex());
				dest.setParamRowIndex(src.bill().getParamRowIndex());
			}
		}

		public class Map_Chk01_DtlR_BillRecvIf_Chk01_DtlR<D extends Chk01_DtlR, S extends BillRecvIf_Chk01_DtlR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk01_DtlR.$peg_no, BillRecvIf_Chk01_DtlR.$dtl_peg_no);
				addColumnPathMap(Chk01_DtlR.$err_flg, BillRecvIf_Chk01_DtlR.$err_flg);
				addColumnPathMap(Chk01_DtlR.$hdr_peg_no,
						BillRecvIf_Chk01_DtlR.$hdr_peg_no);
				addColumnPathMap(Chk01_DtlR.$data_crud_typ,
						BillRecvIf_Chk01_DtlR.$data_crud_typ);
				addColumnPathMap(Chk01_DtlR.$bill_d_no, BillRecvIf_Chk01_DtlR.$bill_d_no);
				addColumnPathMap(Chk01_DtlR.$trd_cd, BillRecvIf_Chk01_DtlR.$trd_cd);
				addColumnPathMap(Chk01_DtlR.$dlv_slip_no,
						BillRecvIf_Chk01_DtlR.$dlv_slip_no);
				addColumnPathMap(Chk01_DtlR.$dlv_slip_d_no,
						BillRecvIf_Chk01_DtlR.$dlv_slip_d_no);
				addColumnPathMap(Chk01_DtlR.$ship_dlv_slip_no,
						BillRecvIf_Chk01_DtlR.$ship_dlv_slip_no);
				addColumnPathMap(Chk01_DtlR.$ship_dlv_slip_d_no,
						BillRecvIf_Chk01_DtlR.$ship_dlv_slip_d_no);
				addColumnPathMap(Chk01_DtlR.$act_no, BillRecvIf_Chk01_DtlR.$act_no);
				addColumnPathMap(Chk01_DtlR.$act_rev, BillRecvIf_Chk01_DtlR.$act_rev);
				addColumnPathMap(Chk01_DtlR.$act_d_no, BillRecvIf_Chk01_DtlR.$act_d_no);
				addColumnPathMap(Chk01_DtlR.$po_no, BillRecvIf_Chk01_DtlR.$po_no);
				addColumnPathMap(Chk01_DtlR.$po_d_no, BillRecvIf_Chk01_DtlR.$po_d_no);
				addColumnPathMap(Chk01_DtlR.$ac_dt, BillRecvIf_Chk01_DtlR.$ac_dt);
				addColumnPathMap(Chk01_DtlR.$dlv_dt, BillRecvIf_Chk01_DtlR.$dlv_dt);
				addColumnPathMap(Chk01_DtlR.$rcv_dt, BillRecvIf_Chk01_DtlR.$rcv_dt);
				addColumnPathMap(Chk01_DtlR.$bill_basis_dt,
						BillRecvIf_Chk01_DtlR.$bill_basis_dt);
				addColumnPathMap(Chk01_DtlR.$base_ac_dt,
						BillRecvIf_Chk01_DtlR.$base_ac_dt);
				addColumnPathMap(Chk01_DtlR.$itm_cd, BillRecvIf_Chk01_DtlR.$itm_cd);
				addColumnPathMap(Chk01_DtlR.$itm_sub1, BillRecvIf_Chk01_DtlR.$itm_sub1);
				addColumnPathMap(Chk01_DtlR.$itm_sub2, BillRecvIf_Chk01_DtlR.$itm_sub2);
				addColumnPathMap(Chk01_DtlR.$itm_sub3, BillRecvIf_Chk01_DtlR.$itm_sub3);
				addColumnPathMap(Chk01_DtlR.$sno1, BillRecvIf_Chk01_DtlR.$sno1);
				addColumnPathMap(Chk01_DtlR.$sno2, BillRecvIf_Chk01_DtlR.$sno2);
				addColumnPathMap(Chk01_DtlR.$sno3, BillRecvIf_Chk01_DtlR.$sno3);
				addColumnPathMap(Chk01_DtlR.$sno4, BillRecvIf_Chk01_DtlR.$sno4);
				addColumnPathMap(Chk01_DtlR.$trd_unit_cd,
						BillRecvIf_Chk01_DtlR.$trd_unit_cd);
				addColumnPathMap(Chk01_DtlR.$trd_unit_qty,
						BillRecvIf_Chk01_DtlR.$trd_unit_qty);
				addColumnPathMap(Chk01_DtlR.$interim_flg,
						BillRecvIf_Chk01_DtlR.$interim_flg);
				addColumnPathMap(Chk01_DtlR.$trd_cur_upri,
						BillRecvIf_Chk01_DtlR.$trd_cur_upri);
				addColumnPathMap(Chk01_DtlR.$trd_cur_amt,
						BillRecvIf_Chk01_DtlR.$trd_cur_amt);
				addColumnPathMap(Chk01_DtlR.$trd_cur_dscnt_amt,
						BillRecvIf_Chk01_DtlR.$trd_cur_dscnt_amt);
				addColumnPathMap(Chk01_DtlR.$tax_cd, BillRecvIf_Chk01_DtlR.$tax_cd);
				addColumnPathMap(Chk01_DtlR.$tax_rate, BillRecvIf_Chk01_DtlR.$tax_rate);
				addColumnPathMap(Chk01_DtlR.$inc_tax_flg,
						BillRecvIf_Chk01_DtlR.$inc_tax_flg);
				addColumnPathMap(Chk01_DtlR.$trd_cur_tax_amt,
						BillRecvIf_Chk01_DtlR.$trd_cur_tax_amt);
				addColumnPathMap(Chk01_DtlR.$trd_d_rmrks,
						BillRecvIf_Chk01_DtlR.$trd_d_rmrks);
				addColumnPathMap(Chk01_DtlR.$data_lno, BillRecvIf_Chk01_DtlR.$data_lno);
			}

			@Override
			public void valueCopy(D dest, S src) {
				dest.setParamIndex(src.bill().getParamIndex());
				dest.setParamRowIndex(src.bill().getParamRowIndex());
			}
		}

	}

	/**
	 * 引数の2つの行が異なる請求書ＮＯの場合にtrue、同一の場合にfalseを返す。
	 * 外部システムデータＮＯ, 請求書ＮＯが同じ場合に同一と判定する。 
	 * @param r
	 * @param nextR
	 * @return 
	 */
	protected boolean isNextData(MST_BILL_RECV_IF_R r, MST_BILL_RECV_IF_R nextR) {
		return !(isSame(r.ext_data_no(), nextR.ext_data_no())
				&& isSame(r.bill_no(), nextR.bill_no()));
	}

	protected void setErrSts(MST_BILL_RECV_IF_R exeR) {
		exeR.exe_sts_typ(MAC_EXE_STS_TYP.ERR.value());
		List<String> list = createErrSetKey(exeR);

		if (!object(CLAZZ)._errSet.contains(list)) {
			object(CLAZZ)._errSet.add(list);
		}
	}

	protected void setErrSts(BillRecvIf_Chk01_DtlR exeR) {
		exeR.exe_sts_typ(MAC_EXE_STS_TYP.ERR.value());
		List<String> list = createErrSetKey(exeR);

		if (!object(CLAZZ)._errSet.contains(list)) {
			object(CLAZZ)._errSet.add(list);
		}
	}

	protected List<String> createErrSetKey(MST_BILL_RECV_IF_R r) {
		List<String> list = new ArrayList<>();

		if (!isNull(r)) {
			list.add(r.bill_src_cd());
			list.add(r.bill_no());
		}
		return list;
	}

	protected List<String> createErrSetKey(BillRecvIf_Chk01_DtlR r) {
		List<String> list = new ArrayList<>();

		if (!isNull(r)) {
			list.add(r.bill_src_cd());
			list.add(r.bill_no());
		}
		return list;
	}

	/**
	 * 同一取込単位内で先に処理した同一キーのデータでエラーが発生したかどうか。
	 * @param billRecvIfR 請求受信ＩＦ
	 * @return 同一キーのデータで既にエラーが発生している場合はtrue
	 */
	protected boolean isPrevErr(MST_BILL_RECV_IF_R billRecvIfR) {
		return object(CLAZZ)._errSet.contains(createErrSetKey(billRecvIfR));
	}
	
	protected boolean isPrevErr(BillRecvIf_Chk01_DtlR billRecvIfR) {
		return object(CLAZZ)._errSet.contains(createErrSetKey(billRecvIfR));
	}

	protected String[] getGrpKey() {
		return new String[] {
				BillRecvIf_Chk01_DtlR.$ext_data_no, BillRecvIf_Chk01_DtlR.$bill_src_cd, BillRecvIf_Chk01_DtlR.$bill_no
		};
	}

	protected boolean isErr(MST_BILL_RECV_IF_R billRecvIfR) {
		return MAC_EXE_STS_TYP.isERR(billRecvIfR.exe_sts_typ());
	}

	/***
	 * 添付帳票登録サービスを呼び出す。
	 * 
	 * @param regDataHdrL 請求受信登録サービスの下り電文(ヘッダ)
	 * @param regDataDtlL 請求受信登録サービスの下り電文(明細)
	 * @param recvIfDataL 取込している請求受信ＩＦデータ
	 */
	protected void callAttachService(
			MCList<Chk01_HdrR> regDataHdrL, MCList<Chk01_DtlR> regDataDtlL, MCList<BillRecvIf_Chk01_DtlR> recvIfDataL) {

		MCIndexKey idxkey1 = regDataDtlL.createIndex(Chk01_DtlR.$bill_rcpt_no);
		MCIndexKey idxkey2 = recvIfDataL.createIndex(BillRecvIf_Chk01_DtlR.$data_lno);
		MBBCL_AttachService.Attach_Upd01 opAttc = MBBCL_AttachService.crtAttach_Upd01();
		
		// up1電文
		opAttc.up1().upd_cntr_chk_flg(false);

		MCGroupByPolicy policy = new MCGroupByPolicy(Chk01_HdrR.$bill_rcpt_no, Chk01_HdrR.$bill_src_cd, Chk01_HdrR.$trd_cur_cd);
		policy.sum(Chk01_HdrR.$bill_amt);
		MCList<Chk01_HdrR> regGrpL = regDataHdrL.groupBy(policy);

		for (Chk01_HdrR r : regGrpL) {
			
			MCDate recvDt = new MCDate();
			
			// up2(List2)電文
			MCList<Chk01_DtlR> dL = regDataDtlL.subList(idxkey1, r.bill_rcpt_no());
			for (Chk01_DtlR d : dL) {
				Attach_Upd01_Dtl2R  up2 = Attach_Upd01_Dtl2R .create();
				up2.biz_typ(MAC_BIZ_TYP.BILL_RCPT_EDI.value());
				up2.report_id("MSLAR2410");
				up2.biz_key1(r.bill_rcpt_no());
				up2.data_lno(d.data_lno());
				opAttc.up2().add(up2);
				
				BillRecvIf_Chk01_DtlR rcvData = recvIfDataL.getFirst(idxkey2, d.data_lno());
				recvDt = rcvData.bill().recv_dt();
			}

			// up(List1)電文
			Attach_Chk01_DtlR up = Attach_Chk01_DtlR.create();
			up.biz_typ(MAC_BIZ_TYP.BILL_RCPT_EDI.value());
			up.report_id("MSLAR2410");
			up.biz_key1(r.bill_rcpt_no());
			up.dt(recvDt);
			up.amt(r.bill_amt());
			up.bp_cd(r.bill_src_cd());
			up.cur_cd(r.trd_cur_cd());
			up.if_proc_typ(MAC_IF_PROC_TYP.BILL_RECV.value());
			opAttc.up0().add(up);
		}
		if (opAttc.up0().size() > 0) {
			opAttc.exec();
		}

	}

	//FMCB CUSTOM END
}