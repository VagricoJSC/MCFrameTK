package mcframe.serverMSLA.MSLAL6060;

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
import mcframe.serverMSLA.MSLAL6060.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMBBE.MBBEL5010.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import java.util.*;
import mcframe.serverCore.requester.MCServerThreadManager;
import mcframe.serverMSLA.MSLAL6320.MSLAL_SCMActRecvIfService;
import mcframe.serverPF.dbc.PFT_SDRV_IF_R;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogger;
import mcframe.serverCore.resource.MCConst;
import mcframe.serverCore.mcjdbc.MCSavepoint;
import mcframe.serverCore.sys.MCSys;
import mcframe.serverMSBE.MSBEL5300.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverMAUC.MAUCL1060.MAUCL_TrdUtil;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.commonMSUA.MSUAC0060.MSUAC_List.*;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_XfrActRecvIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_XfrActRecvIfService_MC extends MSLAL_XfrActRecvIfService_MC_A{
	//FMCB CUSTOM START

	/**
	 * エラーになったキーの組み合わせを保持する(Upd03, Upd04で共有)
	 */
	protected Set<List<String>> _errSet = new HashSet<>();

	/**
	 * エラーになった外部システムCDを保持する(Upd03, Upd04で共有)
	 */
	protected Set<String> _stopErrSet = new HashSet<String>();

	/**
	 * キャッシュを管理するリクエストオブジェクト
	 */
	protected static final Class<MSLAL_XfrActRecvIfService> CLAZZ = MSLAL_XfrActRecvIfService.class;

	/**
	 * XfrActRecvIf_Upd01オペレーション.<p>
	 *
	 * 移動実績受信ＩＦ取込を行う。（ＥＳＢのリアルタイム取込から呼び出される）<br>
	 */
	public class XfrActRecvIf_Upd01 extends MSLAL_XfrActRecvIfService_MC_A.XfrActRecvIf_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			MSLAL_XfrActRecvIfService.XfrActRecvIf_Upd02 ope = MSLAL_XfrActRecvIfService.crtXfrActRecvIf_Upd02();
			setAll(ope.up0(), up0(), createMap_IfDataImp_Upd01_DtlR_Upd01_DtlR());
			ope.exec();
		}
		
//		mcframe.serverMBBE.MBBEL5010.IfDataImp_Upd01_DtlR
//		mcframe.serverPFUD.PFUDL0040.Upd01_DtlR
		protected Map_IfDataImp_Upd01_DtlR_Upd01_DtlR<IfDataImp_Upd01_DtlR,Upd01_DtlR> createMap_IfDataImp_Upd01_DtlR_Upd01_DtlR() {
			return new Map_IfDataImp_Upd01_DtlR_Upd01_DtlR<IfDataImp_Upd01_DtlR, Upd01_DtlR>();
		}

		public class Map_IfDataImp_Upd01_DtlR_Upd01_DtlR<D extends IfDataImp_Upd01_DtlR, S extends Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(IfDataImp_Upd01_DtlR.$data_no, Upd01_DtlR.$data_no);
				addColumnPathMap(IfDataImp_Upd01_DtlR.$if_proc_typ, Upd01_DtlR.$if_proc_typ);
				addColumnPathMap(IfDataImp_Upd01_DtlR.$ext_data_no, Upd01_DtlR.$ext_data_no);
				addColumnPathMap(IfDataImp_Upd01_DtlR.$ext_sys_cd, Upd01_DtlR.$ext_sys_cd);
				addColumnPathMap(IfDataImp_Upd01_DtlR.$bp_cd, Upd01_DtlR.$bp_cd);

			}
		}
	}
	/**
	 * XfrActRecvIf_Upd02オペレーション.<p>
	 *
	 * 移動実績受信ＩＦ取込を行う。（ＩＦデータ確認、および移動実績ＩＦ取込バッチから呼び出される）<br>
	 */
	public class XfrActRecvIf_Upd02 extends MSLAL_XfrActRecvIfService_MC_A.XfrActRecvIf_Upd02 {
		
		/** 処理対象件数 **/
		protected int _totalNum = 0;

		/** 登録件数（正常終了件数） **/
		protected int _okNum = 0;

		/** エラー件数 **/
		protected int _errNum = 0;

		/** スキップ **/
		protected int _skipNum = 0;

		/** 例外発生ＦＬＧ **/
		protected boolean _exceptionFlg = false;
		/** ロガー作成ＦＬＧ **/
		protected boolean _crtNewLogger = false;

		/** 移動実績受信ＩＦ **/
		protected MCList<MST_XFR_ACT_RECV_IF_R> _recvIfL = null;
		
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
			if (up1().src_actlumprecv_flg()) {
				return;
			}
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
			if (up1().src_actlumprecv_flg()) {
				return;
			}
			logger().writeStartLog(MSLAL0171);
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
			if (!up1().src_actlumprecv_flg()) {
				logger().writeProcessLog(mcEx);
			}

			_exceptionFlg = true;

			throw mcEx;
		}

		/**
		 * 終了ログを出力する。
		*/
		protected void writeEndLog() {
			if (up1().src_actlumprecv_flg()) {
				return;
			}
			if (_errNum > 0 || _exceptionFlg) {

				logger().writeProcessLog(MAUDL0009);
				MCMessagePool.add(MAUDL0009);
				pushErrorLog(logger());
			}
			else if (_totalNum == 0) {

				logger().writeProcessLog(MAUDL0008);
				MCMessagePool.add(MAUDL0008);
			}

			logger().writeEndLog(MSLAL0172, _totalNum, _okNum, _errNum, _skipNum);
			pushEndLog(logger());
			// Loggerを新規作成した場合（呼出元からLoggerを引き継がない場合）のみクローズ
			if (_crtNewLogger) {
				logger().close();
			}
		}

		/**
		 * 移動実績受信ＩＦデータを取得する。
		 */
		protected void preSrch() {
			_recvIfL = MCList.create(MST_XFR_ACT_RECV_IF_R.class);
			MST_XFR_ACT_RECV_IF_R t = MST_XFR_ACT_RECV_IF_R.create("T");
			MCQueryApiBuilder recvIfL_bldr = MCQueryApiBuilder.create(t);
			
			makeDml(recvIfL_bldr);
			if(!up0().isEmpty()) {
				dbSelect("MSLAL6060_MST_XFR_ACT_RECV_IF_S01", _recvIfL, recvIfL_bldr, up0(), null);
			}
			else {
				dbSelect("MSLAL6060_MST_XFR_ACT_RECV_IF_S02", _recvIfL, recvIfL_bldr);
			}
			
			if(up1().src_actlumprecv_flg() && !up1().exe_unit_lump_flg() && !_recvIfL.isEmpty()) {
				
				MCList<MST_XFR_ACT_RECV_IF_R> dbc = MCList.create(MST_XFR_ACT_RECV_IF_R.class);
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
				
				makeDml(dbc_bldr);
				
				dbc_bldr.setWhere(t.ext_data_no.eq(bind("ext_data_no")));
				dbc_bldr.addWhereWithAnd(t.ext_sys_cd.eq(bind("ext_sys_cd")));
				dbSelect("MSLAL6060_MST_XFR_ACT_RECV_IF_S03", dbc, dbc_bldr, _recvIfL.groupBy(MST_XFR_ACT_RECV_IF_R.$ext_data_no, MST_XFR_ACT_RECV_IF_R.$ext_sys_cd));
				
				if(!dbc.isEmpty()) {
					_recvIfL.merge(dbc, dbc.createRow().getKeyColumn());
				}
			}
		}
		
		protected void makeDml(MCQueryApiBuilder builder) {
			PFT_SDRV_IF_R t2 = PFT_SDRV_IF_R.create("T2");
			MAM_LOC_R m1 = MAM_LOC_R.create("M1");
			MAM_SCM_IF_CTL_R S1X = MAM_SCM_IF_CTL_R.create("X");
			MST_XFR_ACT_RECV_IF_R t = MST_XFR_ACT_RECV_IF_R.create(builder.getBaseDbcAlias());
			
			builder.addLeftOuterJoin(t2, t.data_no.eq(t2.data_no));
			builder.addLeftOuterJoin(m1, t.gi_loc_cd.eq(m1.loc_cd));
			builder.removeSelect(MST_XFR_ACT_RECV_IF_R.$lg_grp_cd);
			builder.addSelect(nvl( t.lg_grp_cd, m1.lg_grp_cd).as("lg_grp_cd"));
			builder.setWhere(value(0).eq(value(0)));

			
			if(!up0().isEmpty()) {
				builder.addWhereWithCutOffAnd(t.data_lno.eq(bind("data_lno")));
				builder.addWhereWithCutOffAnd(t.data_no.eq(bind("data_no")));
				builder.addWhereWithCutOffAnd(t.ext_data_no.eq(bind("ext_data_no")));
				builder.addWhereWithCutOffAnd(t.ext_sys_cd.eq(bind("ext_sys_cd")));
				builder.addWhereWithCutOffAnd(nvl( t.lg_grp_cd, m1.lg_grp_cd).eq(bind("lg_grp_cd")));
				builder.addConstWhereWithAnd(bracket( t2.sdrv_sts_typ.isNull()
								.or(t2.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.RECV_CONV_OK.value()))))
								.and(t.imp_flg.eq(value(true)))
								.and( exists( subQuery() .select(value("X"))
											.from(S1X) 
											.where( bracket( S1X.loc_cd.eq(t.gi_loc_cd)
													.or(S1X.loc_cd.isNull()) )
								.and( S1X.lg_grp_cd.eq(nvl( t.lg_grp_cd, m1.lg_grp_cd ) )
										.or(S1X.lg_grp_cd.isNull()) )
								.and(S1X.if_proc_typ.eq(value(MAC_IF_PROC_TYP.WMS_XFR_ACT_RECV.value())))
								.and(S1X.st_dt.lte(t.recv_dt))
								.and(S1X.end_dt.gte(t.recv_dt)) ) )));
			}
			else {
				builder.addWhereWithAnd(bracket( t2.sdrv_sts_typ.isNull()
								.or(t2.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.RECV_CONV_OK.value()))))
								.and(t.imp_flg.eq(value(true)))
								.and( exists( subQuery()
										.select(value("X"))
											.from(S1X)
												.where( bracket( S1X.loc_cd.eq(t.gi_loc_cd)
														.or(S1X.loc_cd.isNull()) )
								.and( S1X.lg_grp_cd.eq(nvl( t.lg_grp_cd, m1.lg_grp_cd ) )
										.or(S1X.lg_grp_cd.isNull()) )
								.and(S1X.if_proc_typ.eq(value(MAC_IF_PROC_TYP.WMS_XFR_ACT_RECV.value())))
								.and(S1X.st_dt.lte(t.recv_dt))
								.and(S1X.end_dt.gte(t.recv_dt)) ) )));
			}
		}


		/**
		 * 入荷実績受信ＩＦ処理のメイン処理
		 */
		protected void exe() {

			callXfrActRecvIfUpd03();
		}

		/**
		 * スレッドを分割し、各スレッドごとにXfrActRecvIf_Upd03を実行する。
		 */
		protected void callXfrActRecvIfUpd03() {

			// 呼出元のサービス実行番号を取得
			int no = object(MSLAL_SCMActRecvIfService.class)._execNo;

			MSLAL_XfrActRecvIfService.XfrActRecvIf_Upd03 upd03;
			
			List<MSLAL_XfrActRecvIfService.XfrActRecvIf_Upd03> opeL = new ArrayList<>();
			
			if (MCServerThreadManager.getLimitThreadSize() <= 1
					|| up1().src_actlumprecv_flg() && !MAC_IF_UPD_TYP.isSKIP_ERROR(up1().if_upd_typ())) {
				sort();

				upd03 = MSLAL_XfrActRecvIfService.crtXfrActRecvIf_Upd03();
				upd03._no = no;
				setAll(upd03.up0(), _recvIfL, createMap_XfrActRecvIf_Upd03_DtlR_MST_XFR_ACT_RECV_IF_R());
				upd03.up1().if_upd_typ(up1().if_upd_typ());
				upd03.up1().src_actlumprecv_flg(up1().src_actlumprecv_flg());
				opeL.add(upd03);

				MCServerThreadManager.setUseMainDBTran(true);
				MCServerThreadManager.invokeAndWait(1, opeL, FXBAL_BatchLogManager.class, MSLAL_SCMActRecvIfService.class);
			}
			else {
				for (MCList<MST_XFR_ACT_RECV_IF_R> grpL: _recvIfL.groupList(MST_XFR_ACT_RECV_IF_R.$lg_grp_cd)) {

					upd03 = MSLAL_XfrActRecvIfService.crtXfrActRecvIf_Upd03();
					upd03._no = no++;
					setAll(upd03.up0(), grpL, createMap_XfrActRecvIf_Upd03_DtlR_MST_XFR_ACT_RECV_IF_R());
					upd03.up1().if_upd_typ(up1().if_upd_typ());
					upd03.up1().src_actlumprecv_flg(up1().src_actlumprecv_flg());

					opeL.add(upd03);
				}
				if (!opeL.isEmpty()) {
					Collections.sort(opeL, new Comparator<MSLAL_XfrActRecvIfService.XfrActRecvIf_Upd03>() {
						@Override
						public int compare(MSLAL_XfrActRecvIfService.XfrActRecvIf_Upd03 o1, MSLAL_XfrActRecvIfService.XfrActRecvIf_Upd03 o2) {
							return (o1.up0().size() - o2.up0().size()) * -1;
						}
					});
					
					MCServerThreadManager.setCommitAndRollback(true);
					MCServerThreadManager.invokeAndWait(opeL, FXBAL_BatchLogManager.class, MSLAL_SCMActRecvIfService.class);
				}
			}
			for (MSLAL_XfrActRecvIfService.XfrActRecvIf_Upd03 ope: opeL) {
				_totalNum += ope.down0().total_num().intValue();
				_okNum += ope.down0().ok_num().intValue();
				_errNum += ope.down0().err_num().intValue();
				_skipNum += ope.down0().skip_num().intValue();
			}

			// 呼出元のサービス実行番号に戻す
			object(MSLAL_SCMActRecvIfService.class)._execNo = no;
		}

		/**
		 * 並び替え
		 */
		protected void sort() {
			// 並び順はＳＣＭ実績受信ＩＦ一括取込と合わせる
			_recvIfL.sort(
				MSVT_MES_IF_R.$data_make_dt,
				MSVT_MES_IF_R.$ext_sys_cd,
				MSVT_MES_IF_R.$ext_data_no,
				MSVT_MES_IF_R.$ext_data_lno
			);
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
		

		protected Map_XfrActRecvIf_Upd03_DtlR_MST_XFR_ACT_RECV_IF_R<XfrActRecvIf_Upd03_DtlR,MST_XFR_ACT_RECV_IF_R> createMap_XfrActRecvIf_Upd03_DtlR_MST_XFR_ACT_RECV_IF_R() {
			return new Map_XfrActRecvIf_Upd03_DtlR_MST_XFR_ACT_RECV_IF_R<XfrActRecvIf_Upd03_DtlR, MST_XFR_ACT_RECV_IF_R>();
		}

		public class Map_XfrActRecvIf_Upd03_DtlR_MST_XFR_ACT_RECV_IF_R<D extends XfrActRecvIf_Upd03_DtlR, S extends MST_XFR_ACT_RECV_IF_R> extends MCRowMapper<D,S>{
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.xa(src);
			}
		}
	}
	/**
	 * XfrActRecvIf_Upd03オペレーション.<p>
	 *
	 * 移動実績受信ＩＦ取込を行う。（マルチスレッド実行用）<br>
	 */
	public class XfrActRecvIf_Upd03 extends MSLAL_XfrActRecvIfService_MC_A.XfrActRecvIf_Upd03 {

		protected int _loopCnt = MCConst.app.getInteger("MS.MSLAL6060.loop_size", 100);

		/** 処理対象件数 **/
		protected int _totalNum = 0;

		/** 登録件数（正常終了件数） **/
		protected int _okNum = 0;

		/** エラー件数 **/
		protected int _errNum = 0;

		/** スキップ **/
		protected int _skipNum = 0;

		/**
		 * バッチログのlogger<br>
		 */
		protected FXBAL_BatchLogger _logger = null;

		/**
		 * インスタンス生成元（XfrActRecvIf_Upd03）でスレッド間でユニークな値を設定
		 */
		protected int _no = 0;

		/**
		 * MSLAL_XfrActRecvIfService.XfrActRecvIf_Upd04の実行結果リスト
		 */
		protected MCList<XfrActRecvIf_Upd04_DtlR> _exeRslt = null;

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
		 *  移動実績受信ＩＦ取込処理を実行する。
		 */
		protected void exe() {
			
			int cnt = 0;
			
			MCList<MST_XFR_ACT_RECV_IF_R> tgtL = MCList.create(MST_XFR_ACT_RECV_IF_R.class);
			MST_XFR_ACT_RECV_IF_R tgtL_t= MST_XFR_ACT_RECV_IF_R.create("T");
			MCQueryApiBuilder tgtL_bldr = MCQueryApiBuilder.create(tgtL_t);
			MST_XFR_ACT_RECV_IF_R oldR = MST_XFR_ACT_RECV_IF_R.create();
			
			for (XfrActRecvIf_Upd03_DtlR dtlR: up0()) {
				
				MST_XFR_ACT_RECV_IF_R keyR = dtlR.xa();
				
				if(isNextData(oldR, keyR)) {
					
					if(!tgtL.isEmpty() && _loopCnt <= cnt) {

						callXfrRecvUpd04(tgtL, tgtL_t, tgtL_bldr);
						cnt = 0;
						tgtL.clear();
					}
				}
				
				oldR = keyR;
				cnt++;
				tgtL.add(keyR);
			}
			
			if(!tgtL.isEmpty()) {
				callXfrRecvUpd04(tgtL, tgtL_t, tgtL_bldr);
			}
		}
		
		/**
		 * XfrActRecvIf_Upd04を実行する。
		 * @param xfrRecvIfL 移動実績受信ＩＦリスト
		 */
		protected void callXfrRecvUpd04(MCList<MST_XFR_ACT_RECV_IF_R> xfrRecvIfL, MST_XFR_ACT_RECV_IF_R tgtL_t, MCQueryApiBuilder xfrRecvIfL_bldr) {
			dbWkDelete("MSLAL6060_MSW_XFR_ACT_RECV_IF_D01", xfrRecvIfL_bldr.getBaseDbc());
			dbWkInsert("MSLAL6060_MSW_XFR_ACT_RECV_IF_I01", xfrRecvIfL, xfrRecvIfL_bldr.getBaseDbc());
			MCList<MST_XFR_ACT_RECV_IF_R> exeL = srchLockXfrRecvIf();
			MCIndexKey idx = exeL.createIndex(MST_XFR_ACT_RECV_IF_R.$data_lno);
			Set<List<String>> afterExtDataSet = srchAfterExtData(exeL);
			MSLAL_XfrActRecvIfService.XfrActRecvIf_Upd04 ope = MSLAL_XfrActRecvIfService.crtXfrActRecvIf_Upd04();
			XfrActRecvIf_Upd04_DtlR upR = null;
			
			MCList<MST_XFR_ACT_RECV_IF_R> skipL = MCList.create(MST_XFR_ACT_RECV_IF_R.class);
			for (MST_XFR_ACT_RECV_IF_R recvIfR : xfrRecvIfL) {
				MST_XFR_ACT_RECV_IF_R exeR = exeL.getFirst(idx, recvIfR.data_lno());

				if (isNull(exeR) || isStopErr(exeR) || isChkUpdCntr(exeR)) {
					continue;
				}
				else if(isErrSkip(exeR)) {
					
					setErrSts(exeR);
					MCMessagePool.add(exeR, null, MSLAL0185, exeR.data_no(), exeR.data_lno(), exeR.lg_grp_cd(), exeR.ext_sys_cd(), exeR.ext_xfr_act_no());
					skipL.add(exeR);

				}
				else if(isOkSkip(exeR, afterExtDataSet)) {

					setSkipSts(exeR);
					MCMessagePool.add(exeR, null, MSLAL0186, exeR.data_no(), exeR.data_lno(), exeR.lg_grp_cd(), exeR.ext_sys_cd(), exeR.ext_xfr_act_no());
					skipL.add(exeR);

				}
				else {
				
					upR = XfrActRecvIf_Upd04_DtlR.create();
					upR.xa(exeR);
					upR.setParamIndex(exeR.getParamIndex());
					upR.setParamRowIndex(exeR.getParamRowIndex());
					ope.up0().add(upR);
				}
			}
			if(!ope.up0().isEmpty()) {
				ope.up1().if_upd_typ(up1().if_upd_typ());
				ope.up1().src_actlumprecv_flg(up1().src_actlumprecv_flg());
				ope.exec();
			}
			mergeExeRslt(skipL, ope.down0());
			afterCall(exeL, tgtL_t, xfrRecvIfL_bldr);
			dbWkDelete("MSLAL6060_MSW_XFR_ACT_RECV_IF_D02", xfrRecvIfL_bldr.getBaseDbc());
		}

		/**
		 * 「エラー行まで登録」の状態となっているか
		 */
		protected boolean isStopErr(MST_XFR_ACT_RECV_IF_R r) {
			if (MAC_IF_UPD_TYP.isSTOP_ERROR(up1().if_upd_typ())
				&& object(CLAZZ)._stopErrSet.contains(r.ext_sys_cd())) {
				return true;
			}
			return false;
		}

		/**
		 * 同一キーで先に処理したデータでエラーが発生したかどうか。
		 * @param exeR 取込対象行
		 * @return エラーが発生した場合はtrue
		 */
		protected boolean isErrSkip(MST_XFR_ACT_RECV_IF_R exeR) {

			return object(CLAZZ)._errSet.contains(createErrSetKey(exeR));
		}

		/**
		 * ＳＣＭ実績受信ＩＦ一括取込で取得したデータが更新されていないか
		 * 
		 * @param exeR 取込対象行
		 * @return 更新されている場合はtrue
		 */
		protected boolean isChkUpdCntr(MST_XFR_ACT_RECV_IF_R exeR) {
			if (!up1().src_actlumprecv_flg()) {
				return false;
			}
			// ＳＣＭ実績受信ＩＦ一括取込で取得したMESIF情報を取得する
			if (!isSame(exeR.upd_srv_req_no(), MCSys.request.serverRequestNo())) {
				MCMessageList msgL = new MCMessageList();
				msgL.addAll(checkUpdCntrNE(exeR, MSVT_MES_IF_R.$upd_cntr, MSLAL_SCMActRecvIfService.getMesIfR(exeR.data_lno(), exeR.data_no())));
				if (!msgL.isEmpty()) {
					MCMessagePool.addAll(msgL);
					// ＰＧ実行状況区分はエラーにしないが、エラー情報は積み上げる
					setErrSet(exeR);
					return true;
				}
			}
			
			return false;
		}

		/**
		 * 同一キーで新しいデータが既に処理済みかどうか。
		 * @param exeR 取込対象行
		 * @return 処理済みの場合はtrue
		 */
		protected boolean isOkSkip(MST_XFR_ACT_RECV_IF_R exeR, Set<List<String>> afterExtDataSet) {

			return afterExtDataSet.contains(createErrSetKey(exeR));
		}

		/**
		 * 受信IFテーブルをロックする
		 */
		protected MCList<MST_XFR_ACT_RECV_IF_R> srchLockXfrRecvIf () {
			MSW_XFR_ACT_RECV_IF_KEY_R w1 = MSW_XFR_ACT_RECV_IF_KEY_R.create("W1");
			PFT_SDRV_IF_R t2 = PFT_SDRV_IF_R.create("T2");
			MAM_LOC_R m1 = MAM_LOC_R.create("M1");

			MCList<MST_XFR_ACT_RECV_IF_R> exeL = MCList.create(MST_XFR_ACT_RECV_IF_R.class);
			MST_XFR_ACT_RECV_IF_R t = MST_XFR_ACT_RECV_IF_R.create("T");
			MCQueryApiBuilder exeL_bldr = MCQueryApiBuilder.create(t);
			
			exeL_bldr.addInnerJoin(w1, w1.data_lno.eq(t.data_lno));
			exeL_bldr.addLeftOuterJoin(t2, t.data_no.eq(t2.data_no));
			exeL_bldr.addLeftOuterJoin(m1, t.gi_loc_cd.eq(m1.loc_cd));
			exeL_bldr.removeSelect(MST_XFR_ACT_RECV_IF_R.$lg_grp_cd);
			exeL_bldr.addSelect(nvl( t.lg_grp_cd, m1.lg_grp_cd).as("lg_grp_cd"));
			exeL_bldr.setWhere(value(0).eq(value(0)));
			exeL_bldr.addWhereWithAnd(bracket( t2.sdrv_sts_typ.isNull()
							.or(t2.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.RECV_CONV_OK.value())))));
			exeL_bldr.addWhereWithAnd(t.imp_flg.eq(value(true)));
			exeL_bldr.setLockTable(t.data_lno);
			exeL_bldr.addOrderByAsc(t.data_lno);
			
			dbSelectForUpdate("MSLAL6060_MST_XFR_ACT_RECV_IF_S04", exeL, exeL_bldr);

			for (MST_XFR_ACT_RECV_IF_R exeR : exeL) {
				// log_sub_key1にスレッド間でユニークな値を設定
				exeR.setParamIndex(_no);
			}

			_logger.setLogKey(exeL,
					MST_XFR_ACT_RECV_IF_R.$batch_log_no,
					MST_XFR_ACT_RECV_IF_R.$log_sub_key1,
					MST_XFR_ACT_RECV_IF_R.$log_sub_key2);
			
			return exeL;
		}

		/**
		 * 同一キーで取込対象より新しいかつ処理済みのデータを取得する。
		 * @param exeL 取込対象リスト
		 * @return 処理済みデータリスト
		 */
		protected Set<List<String>> srchAfterExtData(MCList<MST_XFR_ACT_RECV_IF_R> exeL) {
			
			MST_XFR_ACT_RECV_IF_R t = MST_XFR_ACT_RECV_IF_R.create("T");
			MAM_LOC_R m1 = MAM_LOC_R.create("M1");
			MST_XFR_ACT_RECV_IF_R S1ST = MST_XFR_ACT_RECV_IF_R.create("ST");

			MCList<MST_XFR_ACT_RECV_IF_R> afterL = MCList.create(MST_XFR_ACT_RECV_IF_R.class);
			MCQueryApiBuilder afterL_bldr = MCQueryApiBuilder.create(t);
			
			afterL_bldr.setSelect(nvl( t.lg_grp_cd, m1.lg_grp_cd).as("lg_grp_cd"));
			afterL_bldr.addSelect(t.ext_sys_cd);
			afterL_bldr.addSelect(t.ext_xfr_act_no);
			afterL_bldr.addLeftOuterJoin(m1, t.gi_loc_cd.eq(m1.loc_cd));
			afterL_bldr.addConstWhereWithAnd(exists(subQuery().select(value("X")).from(S1ST)
							.where(t.ext_data_no.lt(S1ST.ext_data_no)
									.and(t.ext_sys_cd.eq(S1ST.ext_sys_cd))
									.and(t.ext_xfr_act_no.eq(S1ST.ext_xfr_act_no))
									.and(S1ST.exe_sts_typ.in(
											value(MAC_EXE_STS_TYP.OK.value()),
											value(MAC_EXE_STS_TYP.SKP.value()))))));
			dbSelectColumn("MSLAL6060_MST_XFR_ACT_RECV_IF_S05", afterL, afterL_bldr, exeL, MST_XFR_ACT_RECV_IF_R.$data_lno);
			Set<List<String>> set = new HashSet<>();
			for(MST_XFR_ACT_RECV_IF_R afterR: afterL) {
				
				List<String> l = createErrSetKey(afterR);
				if(!set.contains(l)) {
					set.add(l);
				}
			}
			return set;
		}
		
		/**
		 * 取込結果をマージする。
		 * @param skipL スキップリスト
		 * @param downL MSLAL_XfrActRecvIfService.XfrActRecvIf_Upd04の下り電文
		 */
		protected void mergeExeRslt(MCList<MST_XFR_ACT_RECV_IF_R> skipL, MCList<XfrActRecvIf_Upd04_DtlR> downL) {

			_exeRslt = MCList.create(XfrActRecvIf_Upd04_DtlR.class);
			_exeRslt.setAll(downL);

			XfrActRecvIf_Upd04_DtlR dtlR = null;

			for (MST_XFR_ACT_RECV_IF_R skipR : skipL) {

				dtlR = XfrActRecvIf_Upd04_DtlR.create();
				dtlR.data_lno(skipR.data_lno());
				dtlR.exe_sts_typ(skipR.exe_sts_typ());
				_exeRslt.add(dtlR);
			}
		}
		
		/**
		 * 移動実績IF取込の後処理
		 * @param exeL 取込対象リスト
		 */
		protected void afterCall(MCList<MST_XFR_ACT_RECV_IF_R> exeL, MST_XFR_ACT_RECV_IF_R exeL_t , MCQueryApiBuilder xfrRecvIfL_bldr) {

			rsltCnt(exeL);

			updIf(exeL, exeL_t, xfrRecvIfL_bldr);

			MCMessageList msgList = MCMessagePool.getMessageList();
			_logger.writeDataLog(msgList);

			dbTran().commit();

			msgList.clear();
		}

		/**
		 * 移動実績受信IFを更新する
		 * @param exeL 取込対象リスト
		 */

		protected void updIf(MCList<MST_XFR_ACT_RECV_IF_R> exeL, MST_XFR_ACT_RECV_IF_R t, MCQueryApiBuilder exeL_bldr) {

			exeL_bldr.setSet(t.imp_flg, t.exe_sts_typ, t.batch_log_no, t.log_sub_key1, t.log_sub_key2);
			dbUpdateKey("MSLAL6060_MST_XFR_ACT_RECV_IF_U01", exeL, exeL_bldr);
		}
		
		/**
		 * 取込結果の件数を算出する。
		 * @param exeL 取込対象リスト
		 */
		protected void rsltCnt(MCList<MST_XFR_ACT_RECV_IF_R> exeL) {
			MCIndexKey idxKey = _exeRslt.createIndex(XfrActRecvIf_Upd03_DtlR.$data_lno);
			for(MST_XFR_ACT_RECV_IF_R exeR: exeL) {
				XfrActRecvIf_Upd04_DtlR exeRslt = _exeRslt.getFirst(idxKey, exeR.data_lno());
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
		protected void setSkipSts(MST_XFR_ACT_RECV_IF_R exeR) {

			exeR.exe_sts_typ(MAC_EXE_STS_TYP.SKP.value());
		}

		/**
		 * 引数で渡された比較対象が同一取込単位かどうか。
		 * @param preR 前の取込対象
		 * @param exeR　取込対象
		 * @return 取込単位のいずれかが異なる場合はtrue
		 */
		protected boolean isNextData(MST_XFR_ACT_RECV_IF_R preR, MST_XFR_ACT_RECV_IF_R exeR) {
			return !(isSame(preR.ext_data_no(), exeR.ext_data_no())) && isSame(preR.lg_grp_cd(), exeR.lg_grp_cd()) && isSame(preR.xfr_inst_no(), exeR.xfr_inst_no());
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
	 * XfrActRecvIf_Upd04オペレーション.<p>
	 *
	 * 移動実績受信ＩＦ取込を行う。（移動実績受信ＩＦサービスを呼び出す本処理）<br>
	 */
	public class XfrActRecvIf_Upd04 extends MSLAL_XfrActRecvIfService_MC_A.XfrActRecvIf_Upd04 {
		
		/**
		 * チェック処理(Chk01)の下り電文<br>
		 * 移動実績受信IFサービス(MSBEL6060)の上り電文にもなる
		 */
		protected MCList<XfrActRecvIf_Chk01_HdrDtlR> _chkRsltL;
		protected MCIndexKey _chkIdxKey;
		
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
			up0().setString(XfrActRecvIf_Upd04_DtlR.$exe_sts_typ, MAC_EXE_STS_TYP.NOT_EXE.value());
			sort();
		}

		/**
		 * 並び替え
		 */
		protected void sort() {
			if ( !(up1().src_actlumprecv_flg()
				&& MAC_IF_UPD_TYP.isSTOP_ERROR(up1().if_upd_typ())) ) {

				// 並び替えた方が後続の取込処理の効率が良いが、
				// 実績一括取込から「エラー行まで登録」で呼び出された場合は、取込順を優先するため並び替えない
				up0().sort(getGrpKey());
			}
		}
		
		/**
		 * 登録処理
		 */
		protected void proc() {
			MCSavepoint sp = null;

			for(MCList<XfrActRecvIf_Upd04_DtlR> xfrActRecvIfL: getGrp()) {

				try {
					if (isStopErr(xfrActRecvIfL.get(0))) {
						continue;
					}
					sp = setSavpoint(xfrActRecvIfL);
					callThisChk01(xfrActRecvIfL);
					callXfrActRecpIfService(xfrActRecvIfL);
				}
				catch (Exception ex) {
					handleEx(ex, sp, xfrActRecvIfL);
				}
				finally {
					sp = null;
				}
			}
		}

		/**
		 * チェック処理
		 */
		protected void callThisChk01(MCList<XfrActRecvIf_Upd04_DtlR> xfrActRecvIfL) {
			
			MSLAL_XfrActRecvIfService.XfrActRecvIf_Chk01 chk = MSLAL_XfrActRecvIfService.crtXfrActRecvIf_Chk01();
			setAll(chk.up0(), xfrActRecvIfL, createMap_XfrActRecvIf_Chk01_DtlR_XfrActRecvIf_Upd04_DtlR());
			chk.exec();
			
			_chkRsltL = chk.down1();
			_chkIdxKey = chk.down1().createIndex(XfrActRecvIf_Chk01_HdrDtlR.$data_lno);
			MCIndexKey idxKey = chk.down0().createIndex(XfrActRecvIf_Chk01_HdrDtlR.$data_lno);
			
			for(XfrActRecvIf_Upd04_DtlR dtlR: xfrActRecvIfL) {
				MCList<XfrActRecvIf_Chk01_DtlR> chkL = chk.down0().subList(idxKey, dtlR.data_lno());
				for(XfrActRecvIf_Chk01_DtlR chkR: chkL) {
					if(chkR.err_flg()) {
						setErr(dtlR);
						break;
					}
				}
			}
			
			chkGrpErr(xfrActRecvIfL);
			
			chkPrevErr(xfrActRecvIfL);
		}
		

		/**
		 * 移動実績受信IFサービスの呼出
		 */
		protected void callXfrActRecpIfService(MCList<XfrActRecvIf_Upd04_DtlR> list) {
			MSBEL_XfrActRcptIFService.XfrActIF_Upd01 ope = MSBEL_XfrActRcptIFService.crtXfrActIF_Upd01();
			
			ope.up0().if_upd_typ(MAC_IF_UPD_TYP.SKIP_ERROR.value());
			ope.up0().upd_cntr_chk_flg(false);
			ope.up0().agg_gi_loc_flg(false);
			ope.up0().is_src_batch_flg(true);
			
			MCNumber peg = MCNumber.ZERO;
			Map<MCNumber, XfrActRecvIf_Upd04_DtlR> map = new HashMap<>();
			
			for(XfrActRecvIf_Upd04_DtlR row: list) {
				if (isErr(row)) {
					if (MAC_IF_UPD_TYP.isSTOP_ERROR(up1().if_upd_typ())) {
						break;
					}
					continue;
				}
				
				MCList<XfrActRecvIf_Chk01_HdrDtlR> chkL = _chkRsltL.subList(_chkIdxKey, row.data_lno());
				if(isNull(chkL)) continue;
				
				for(XfrActRecvIf_Chk01_HdrDtlR chkR: chkL) {
					XfrActIF_HdrDtlR upR = XfrActIF_HdrDtlR.create();
					upR.peg_no(peg);
					upR.data_crud_typ(chkR.data_crud_typ());
					upR.can_ac_dt(chkR.can_ac_dt());
					upR.abort_flg(chkR.abort_flg());
					upR.immd_dlv_prnt_flg(false);
					upR.act_usr_cd_upd_flg(true);
					upR.act_dpt_cd_upd_flg(true);
					upR.intr_rmrks_upd_flg(true);
					upR.trd_rmrks_upd_flg(true);
					upR.sub_char1_upd_flg(true);
					upR.sub_char2_upd_flg(true);
					upR.sub_char3_upd_flg(true);
					upR.intr_d_rmrks_upd_flg(true);
					upR.trd_d_rmrks_upd_flg(true);
					upR.sub_char1_dtl_upd_flg(true);
					upR.sub_char2_dtl_upd_flg(true);
					upR.sub_char3_dtl_upd_flg(true);
					upR.xah(chkR.xah());
					upR.xad(chkR.xad());
					upR.setParamIndex(chkR.getParamIndex());
					upR.setParamRowIndex(chkR.getParamRowIndex());
					ope.up1().add(upR);
					map.put(peg, row);
					peg = peg.add(1);
				}
			}
			
			if (!ope.up1().isEmpty()) {
				ope.exec();

				for (XfrActIF_HdrDtlR ifR : ope.down0()) {
					XfrActRecvIf_Upd04_DtlR r = map.get(ifR.peg_no());
					if (!isErr(r)) {
						if (MAC_RTN_STS_TYP.isOK(ifR.rtn_sts_typ())) {
							setOk(r);
						}
						else if (MAC_RTN_STS_TYP.isERR(ifR.rtn_sts_typ())) {
							setErr(r);
						}
					}
				}
			}
		}

		/**
		 * 移動実績登録処理でエラーが発生した場合の処理。
		 */
		protected void handleEx(Exception ex, MCSavepoint sp, MCList<XfrActRecvIf_Upd04_DtlR> list) {
			
			String msgId = null;
			String msg;
			MCMessageList causeMsgList;
			
			if(ex instanceof MCException) {
				
				MCException mcex = (MCException) ex;
				msgId = mcex.getID();
				msg = mcex.getMCMessage().toString();
				causeMsgList = mcex.getCauseMessageList();
			}
			else {
				
				msg = ex.toString();
				causeMsgList = new MCMessageList();
			}
			
			for(XfrActRecvIf_Upd04_DtlR row: list) {
				MCMessagePool.add(row, null, MSLAL0187, row.data_no(), row.data_lno(), msgId, msg);
				for(MCMessage causeMsg: causeMsgList) {
					MCMessage newMsg = new MCMessage(row, null, causeMsg.getID(), (Object[])causeMsg.getBindArray());
					MCMessagePool.add(newMsg);
				}
				setErrSts(row.xa());
			}
			if(sp != null) {
				dbTran().rollback(sp);
			}
		}

		/**
		 * 取込単位のうち、一部でもエラーがあったら全てエラーとする
		 */
		protected void chkGrpErr (MCList<XfrActRecvIf_Upd04_DtlR> list) {

// 明細単位の取込のため、グルーピングによるエラーはしない。
//			XfrActRecvIf_Upd04_DtlR errR = list.getFirst(XfrActRecvIf_Upd04_DtlR.$exe_sts_typ, MAC_EXE_STS_TYP.ERR.value());
//			if (errR != null) {
//				for (XfrActRecvIf_Upd04_DtlR row : list) {
//					if (!isErr(row)) {
//						MCMessagePool.add(row, null, MSLAL0198, row.data_no(), row.data_lno(), row.lg_grp_cd(), row.ext_sys_cd());
//						setErr(row);
//					}
//				}
//			}
		}

		/**
		 * 同一の物流グループＣＤ、外部システムＣＤ、外部移動実績ＮＯですでにエラーが発生しているかをチェックする
		 */
		protected void chkPrevErr(MCList<XfrActRecvIf_Upd04_DtlR> list) {

			for (XfrActRecvIf_Upd04_DtlR row : list) {
				if (!isErr(row)) {
					if (object(CLAZZ)._errSet.contains(createErrSetKey(row.xa()))) {
						setErrSts(row.xa());
						MCMessagePool.add(row, null, MSLAL0185, row.data_no(), row.data_lno(), row.lg_grp_cd(), row.ext_sys_cd(), row.ext_xfr_act_no());
					}
				}
			}
		}

		/**
		 * 「エラー行まで登録」の状態となっているか
		 */
		protected boolean isStopErr(XfrActRecvIf_Upd04_DtlR r) {
			if (MAC_IF_UPD_TYP.isSTOP_ERROR(up1().if_upd_typ())
				&& object(CLAZZ)._stopErrSet.contains(r.ext_sys_cd())) {
				return true;
			}
			return false;
		}

		/**
		 * 取込単位ごとのセーブポイントを作成する
		 */
		protected MCSavepoint setSavpoint(MCList<XfrActRecvIf_Upd04_DtlR> list) {
			return dbTran().setSavepoint();
		}

		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * 取込単位となるキーを返す
		 */
		protected String[] getGrpKey() {
			return new String[] {MST_XFR_ACT_RECV_IF_R.$ext_data_no, MST_XFR_ACT_RECV_IF_R.$ext_sys_cd, MST_XFR_ACT_RECV_IF_R.$lg_grp_cd};
		}

		/**
		 * 取込単位でグループ化する
		 * 
		 * @return
		 */
		@SuppressWarnings("unchecked")	// 総称配列の警告回避
		protected MCList<XfrActRecvIf_Upd04_DtlR>[] getGrp() {
			
			List<MCList<XfrActRecvIf_Upd04_DtlR>> arr = new ArrayList<>();
			XfrActRecvIf_Upd04_DtlR bkR = null;
			MCList<XfrActRecvIf_Upd04_DtlR> lst = null;

			for (XfrActRecvIf_Upd04_DtlR r : up0()) {
				if (isNull(bkR) || !r.equalColumns(bkR, getGrpKey())) {
					lst = MCList.create(XfrActRecvIf_Upd04_DtlR.class);
					arr.add(lst);
				}
				lst.add(r);
				bkR = r;
			}
			
			return arr.toArray(new MCList[arr.size()]);
		}

		/**
		 * 処理結果区分がエラーか
		 */
		protected boolean isErr(XfrActRecvIf_Upd04_DtlR row) {
			return MAC_EXE_STS_TYP.isERR(row.exe_sts_typ());
		}

		/**
		 * 処理結果区分にエラーを設定
		 */
		protected void setErr(XfrActRecvIf_Upd04_DtlR row) {
			setErrSts(row.xa());
		}

		/**
		 * 処理結果区分にエラーを設定
		 */
		protected void setErr(MCList<XfrActRecvIf_Upd04_DtlR> list) {
			for (XfrActRecvIf_Upd04_DtlR row : list) {
				setErr(row);
			}
		}

		/**
		 * 処理結果区分に処理済を設定
		 */
		protected void setOk(XfrActRecvIf_Upd04_DtlR row) {
			row.exe_sts_typ(MAC_EXE_STS_TYP.OK.value());
		}
		protected void setOk(MCList<XfrActRecvIf_Upd04_DtlR> list) {
			for (XfrActRecvIf_Upd04_DtlR row : list) {
				setOk(row);
			}
		}

//		mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Chk01_DtlR
//		mcframe.serverMSLA.MSLAL6060.XfrActRecvIf_Upd04_DtlR
		protected Map_XfrActRecvIf_Chk01_DtlR_XfrActRecvIf_Upd04_DtlR<XfrActRecvIf_Chk01_DtlR,XfrActRecvIf_Upd04_DtlR> createMap_XfrActRecvIf_Chk01_DtlR_XfrActRecvIf_Upd04_DtlR() {
			return new Map_XfrActRecvIf_Chk01_DtlR_XfrActRecvIf_Upd04_DtlR<XfrActRecvIf_Chk01_DtlR, XfrActRecvIf_Upd04_DtlR>();
		}

		public class Map_XfrActRecvIf_Chk01_DtlR_XfrActRecvIf_Upd04_DtlR<D extends XfrActRecvIf_Chk01_DtlR, S extends XfrActRecvIf_Upd04_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(XfrActRecvIf_Chk01_DtlR.$xa, XfrActRecvIf_Upd04_DtlR.$xa);

			}
		}		
	}
	/**
	 * XfrActRecvIf_Chk01オペレーション.<p>
	 *
	 * 移動実績受信ＩＦ取込を行う前のチェック処理<br>
	 */
	public class XfrActRecvIf_Chk01 extends MSLAL_XfrActRecvIfService_MC_A.XfrActRecvIf_Chk01 {

		protected MCList<MST_XFR_ACT_R> _xfrActL;
		protected MCIndexKey _xfrActIdxKey;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			for(XfrActRecvIf_Chk01_DtlR r: up0()) {
				if(!isNull(r.itm_cd())) {
					r.itm_sub1(nvl(r.itm_sub1(), MAC_STR.NULL_VAL.value()));
					r.itm_sub2(nvl(r.itm_sub2(), MAC_STR.NULL_VAL.value()));
					r.itm_sub3(nvl(r.itm_sub3(), MAC_STR.NULL_VAL.value()));
				}
			}
			
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			chkUp(msgL, getChkList(up0()));

			MCList<XfrActRecvIf_Chk01_DtlR> up = getChkList(up0());
			if(up.isEmpty()) return msgL;
						
			doCache(up);
			
			cmpleItm(up);
			
			msgL.addAll(chkValid(up));

			up = getChkList(up);
			if(up.isEmpty()) return msgL;
			
			cmple(up);
			
			splitUpdRow(up);
			
			up0().setAll(up0().subList(XfrActRecvIf_Chk01_DtlR.$err_flg, true));
			up0().addAll(up);
			
			return msgL;
		}
		
		protected void chkUp(MCMessageList msgL, MCList<XfrActRecvIf_Chk01_DtlR> upL) {
			chkUpHdr(msgL, upL);
		}
		protected void chkUpHdr(MCMessageList msgL, MCList<XfrActRecvIf_Chk01_DtlR> upL) {
			chkSameExtXfrActNo(msgL, upL);
		}
		protected void chkSameExtXfrActNo(MCMessageList msgL, MCList<XfrActRecvIf_Chk01_DtlR> tgtL) {
			for (MCList<XfrActRecvIf_Chk01_DtlR> grpL : tgtL.groupList(
					XfrActRecvIf_Chk01_DtlR.$ext_sys_cd, XfrActRecvIf_Chk01_DtlR.$ext_xfr_act_no)) {
				if (1 < grpL.size()) {
					for (XfrActRecvIf_Chk01_DtlR r : grpL) {
						r.err_flg(true);
						addSameExtXfrActNoErrMsg(r, msgL);
					}
				}
			}
		}
		protected void addSameExtXfrActNoErrMsg(XfrActRecvIf_Chk01_DtlR r, MCMessageList msgL) {
			msgL.add(new MCMessage(r, null, MSLAL0512, r.data_no(), r.data_lno(), r.ext_sys_cd(), r.ext_xfr_act_no()));
		}

		protected void doCache(MCList<XfrActRecvIf_Chk01_DtlR> up) {
			initXfrAllocStsL(up);
			initXfrInstL(up);
			initXfrActDL(up);
			getXfrAct(up);
		}

		protected MCMessageList chkValid(MCList<XfrActRecvIf_Chk01_DtlR> up) {
			MCMessageList msgL = new MCMessageList();
			
			for(XfrActRecvIf_Chk01_DtlR r: up) {
				
				if (!isNull(r.trd_cd())) {
					if(!(MAC_TRD_PTN_TYP.isXFR(MAUCL_TrdUtil.getTrd(r.trd_cd()).trd_ptn_typ())
							|| MAC_TRD_PTN_TYP.isXFR_RTN(MAUCL_TrdUtil.getTrd(r.trd_cd()).trd_ptn_typ())
							|| MAC_TRD_PTN_TYP.isPROV(MAUCL_TrdUtil.getTrd(r.trd_cd()).trd_ptn_typ())
							|| MAC_TRD_PTN_TYP.isPROV_RTN(MAUCL_TrdUtil.getTrd(r.trd_cd()).trd_ptn_typ()))) {
						msgL.add(new MCMessage(r, null, MSLAL0192, r.data_no(), r.data_lno(), r.trd_cd(), MAUCL_TrdUtil.getTrd(r.trd_cd()).trd_ptn_typ()));
						r.err_flg(true);
					}
				}
				
				MST_XFR_ALLOC_STS_R allocStsR = getXfrAllocSts(r);
				
				if(!isNull(r.xfr_inst_no())) {
					MST_XFR_INST_R instR = getXfrInst(r.xfr_inst_no());
					if(isNull(instR)) {
						msgL.add(new MCMessage(r, null, MSLAL0196, r.data_no(), r.data_lno(), r.xfr_inst_no()));
						r.err_flg(true);
					}
					
					if(isNull(allocStsR)) {
						msgL.add(new MCMessage(r, null, MSLAL0193, r.data_no(), r.data_lno()));
						r.err_flg(true);
					}
					else {
						r.xfr_alloc_sts_no(allocStsR.xfr_alloc_sts_no());
					}
				}
				
				if (!isNull(allocStsR) && MAC_SHIP_INST_TYP.isNON(allocStsR.ship_inst_typ())) {
					msgL.add(new MCMessage(r, null, MSLAL0217, r.data_no(), r.data_lno()));
					r.err_flg(true);
				}
				
				//重複チェック
				//外部システムＣＤと外部移動実績ＮＯで移動実績明細テーブルに置いて外部移動実績ＮＯが一意になるように
				//(計画外移動実績を更新する際にキーとなるのが外部システムＣＤ＋外部移動実績ＮＯとなるため)
				
				if(MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					MST_XFR_ACT_D_R actDR = getXfrActD(r.ext_sys_cd(), r.ext_xfr_act_no());
					if(!isNull(actDR)) {
						msgL.add(new MCMessage(r, null, MSLAL0197, r.data_no(), r.data_lno(), r.ext_xfr_act_no(), r.ext_sys_cd()));
						r.err_flg(true);
					}
					
					if(!isNull(r.xfr_inst_no())) {
						MAM_EXT_SYS_R extSysR = getExtSysR(r.ext_sys_cd());
						if (extSysR.not_dup_imp_flg()) {
							if (allocStsR.act_qty().isPositive()) {
								msgL.add(new MCMessage(r, null, MSLAL0194, r.data_no(), r.data_lno(), r.ext_xfr_act_no(), r.ext_sys_cd()));
								r.err_flg(true);
							}
						}
					}
					if (MAC_TRD_PTN_TYP.isPROV_RTN(MAUCL_TrdUtil.getTrd(r.trd_cd()).trd_ptn_typ()) 
							&& !isNull(r.gi_loc_cd()) 
							&& !isNull(allocStsR)
							&& !isSame(r.gi_loc_cd(), allocStsR.gi_loc_cd())) {
						msgL.add(new MCMessage(r, null, MSLAL0215, r.data_no(), r.data_lno(), allocStsR.gi_loc_cd(), r.gi_loc_cd()));
						r.err_flg(true);
					}
					if (!isNull(r.gi_site_cd()) 
							&& !isNull(r.gr_site_cd())
							&& !isSame(r.gi_site_cd(), r.gr_site_cd())
							&& !isNull(r.stk_insp_typ())
							&& !MSC_STK_INSP_TYP.isFIN(r.stk_insp_typ())) {
						msgL.add(new MCMessage(r, null, MSLAL0216, r.data_no(), r.data_lno(), r.gr_site_cd(), r.gi_site_cd(), r.stk_insp_typ()));
						r.err_flg(true);
					}
					else {
						//計画外
					}
					
					if (!isNull(allocStsR)) {
						if (allocStsR.cmpl_flg()) {
							msgL.add(new MCMessage(r, null, MSLAL1032, r.data_no(), r.data_lno(), r.xfr_inst_no(), r.xfr_alloc_sts_no()));
							r.err_flg(true);
						}
					}
				}
				else {
					
					MST_XFR_ACT_D_R actDR = null;
					if(!isNull(r.xfr_inst_no())) {
						
						actDR = getXfrActD(r.ext_sys_cd(), r.ext_xfr_act_no(), r.xfr_alloc_sts_no());
						if(isNull(actDR)) {
							msgL.add(new MCMessage(r, null, MSLAL0195, r.data_no(), r.data_lno(), r.ext_xfr_act_no(), r.ext_sys_cd()));
							r.err_flg(true);
						}
					} 
					else {
						//計画外訂正・取消
						actDR = getXfrActD(r.ext_sys_cd(), r.ext_xfr_act_no());
						if(isNull(actDR)) {
							msgL.add(new MCMessage(r, null, MSLAL0195, r.data_no(), r.data_lno(), r.ext_xfr_act_no(), r.ext_sys_cd()));
							r.err_flg(true);
						}
					}
					
					if(MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ()) && !isNull(actDR)) {
						
						MST_XFR_ACT_R actR = _xfrActL.getFirst(_xfrActIdxKey, actDR.xfr_act_no());
						
						if (!isNull(r.gr_loc_cd()) 
								&& !isNull(actR)
								&& !isSame(r.gr_loc_cd(), actR.gr_loc_cd())) {
							msgL.add(new MCMessage(r, null, MSLAL0214, r.data_no(), r.data_lno(), actR.gr_loc_cd(), r.gr_loc_cd()));
							r.err_flg(true);
						}
						
						if (!isNull(r.itm_cd()) 
								&& !isNull(actDR)
								&& !isSameItm(r, actDR) && isNull(r.xfr_inst_no())) {
							msgL.add(new MCMessage(r, null, MSLAL0209, 
									r.data_no(), 
									r.data_lno(), 
									toDispItm(actDR.itm_cd(), actDR.itm_sub1(), actDR.itm_sub2(), actDR.itm_sub3()),
									toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3())));
							r.err_flg(true);
						}
						
						if (MAC_TRD_PTN_TYP.isPROV_RTN(MAUCL_TrdUtil.getTrd(r.trd_cd()).trd_ptn_typ()) 
								&& !isNull(r.gi_loc_cd()) 
								&& !isNull(actDR)
								&& !isSame(r.gi_loc_cd(), actDR.gi_loc_cd())) {
							msgL.add(new MCMessage(r, null, MSLAL0215, r.data_no(), r.data_lno(), actDR.gi_loc_cd(), r.gi_loc_cd()));
							r.err_flg(true);
						}
						if (!isNull(r.gi_site_cd()) 
								&& !isNull(r.gr_site_cd())
								&& !isSame(r.gi_site_cd(), r.gr_site_cd())
								&& !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())
								&& !MSC_STK_INSP_TYP.isFIN(nvl(r.stk_insp_typ(), actDR.stk_insp_typ()))) {
							msgL.add(new MCMessage(r, null, MSLAL0216, r.data_no(), r.data_lno(), r.gr_site_cd(), r.gi_site_cd(), r.stk_insp_typ()));
							r.err_flg(true);
						}
					}
				}
			}

			return msgL;
		}

		protected void cmple(MCList<XfrActRecvIf_Chk01_DtlR> upL) {
			setUpXfrAllocSts(upL);
			cmpleUpXfrAct(upL);
			
			for(XfrActRecvIf_Chk01_DtlR row: upL) {
				
				cmpleXfrInst(row);
				cmpleXfrAct(row);
				cmpleTrd(row);
				cmpleRsn(row);
				
				cmpleFixedValues(row);
				cmpleXIfR(row);
			}
		}

		protected void setUpXfrAllocSts(MCList<XfrActRecvIf_Chk01_DtlR> upL) {
			for(XfrActRecvIf_Chk01_DtlR row: upL) {

				if(isNull(row.xfr_inst_no())) continue;
				if(!MAC_DATA_CRUD_TYP.isCRT(row.data_crud_typ())) continue;

				MST_XFR_ALLOC_STS_R allocStsR = getXfrAllocSts(row);
				if(isNull(allocStsR)) continue;
				
				row.xfr_alloc_sts_no(allocStsR.xfr_alloc_sts_no());
				
				row.xah().gr_stk_arrv_bp_cd(allocStsR.gr_stk_arrv_bp_cd());

				row.xad().xfr_inst_d_no(allocStsR.xfr_inst_d_no());
				row.xad().gi_stk_arrv_bp_cd(allocStsR.gi_stk_arrv_bp_cd());
				row.xad().io_schd_pr_no(allocStsR.io_schd_pr_no());
				
				if (allocStsR.abort_flg()) row.abort_flg(true);
			}
		}
		protected void cmpleXfrInst(XfrActRecvIf_Chk01_DtlR row) {
				
			if(isNull(row.xfr_inst_no())) return;
			if(!isNull(row.trd_cd())) return;
			
			MST_XFR_INST_R xfrInst = getXfrInst(row.xfr_inst_no());
			row.xah().trd_cd(xfrInst.trd_cd());
		}
		protected void cmpleUpXfrAct(MCList<XfrActRecvIf_Chk01_DtlR> upL) {
			MST_XFR_ACT_D_R t = MST_XFR_ACT_D_R.create("T");
			MCList<MST_XFR_ACT_D_R> xfrActL = MCList.create(MST_XFR_ACT_D_R.class);
			MCQueryApiBuilder xfrActL_bldr = MCQueryApiBuilder.create(t);
			
			xfrActL.addNumberColumn("cnt");
			xfrActL_bldr.setWhere(t.xfr_act_no.eq(bind("xfr_act_no")));
			xfrActL_bldr.addGroupBy(t.xfr_act_no);
			xfrActL_bldr.addGroupFunc(countAll(), "cnt");
			dbSelect("MSLAL6060_MST_XFR_ACT_S02", xfrActL, xfrActL_bldr, _xfrActL);
			xfrActL.setNumberNE("delcnt", 0);
			
			MCIndexKey xfrActIdx = xfrActL.createIndex(MST_XFR_ACT_R.$xfr_act_no);
			for(XfrActRecvIf_Chk01_DtlR row: upL) {
				if(MAC_DATA_CRUD_TYP.isCRT(row.data_crud_typ())) return;
				
				MST_XFR_ACT_D_R actDR = isNull(row.xfr_inst_no())? getXfrActD(row.ext_sys_cd(), row.ext_xfr_act_no()): getXfrActD(row.ext_sys_cd(), row.ext_xfr_act_no(), row.xfr_alloc_sts_no());

				if(isNull(actDR)) return;

				//移動実績ＮＯのみ後続の移動実績明細の検索で必要になるのでrowにも格納
				row.xfr_act_no(actDR.xfr_act_no());
				
				row.xah().xfr_act_no(actDR.xfr_act_no());

				if (isNotdelXfrAct(upL, row, xfrActL, xfrActIdx)) {
					row.xad().xfr_act_d_no(actDR.xfr_act_d_no());
				}
				
				row.xad().gi_stk_arrv_bp_cd(actDR.gi_stk_arrv_bp_cd());
				row.xad().skip_chk_ship_flg(actDR.skip_chk_ship_flg());
				row.xad().io_schd_pr_no(actDR.io_schd_pr_no());
				row.xad().ext_sys_cd(actDR.ext_sys_cd());
				row.xad().ext_xfr_act_no(actDR.ext_xfr_act_no());
			}
		}
		
		/**
		 * 移動実績ヘッダ削除しないかどうか
		 * 移動実績明細全削除でない及び削除対象最終レコードでなければ対象
		 */
		protected boolean isNotdelXfrAct(MCList<XfrActRecvIf_Chk01_DtlR> upL,
				XfrActRecvIf_Chk01_DtlR row, MCList<MST_XFR_ACT_D_R> xfrActL, MCIndexKey xfrActIdx) {
			if (MAC_DATA_CRUD_TYP.isDEL(row.data_crud_typ())) {
				MST_XFR_ACT_D_R xfrActR = xfrActL.getFirst(xfrActIdx, row.xfr_act_no());
				xfrActR.setNumber("delcnt", xfrActR.getNumber("delcnt").add(1));
				return !isSame(xfrActR.getNumber("cnt"), xfrActR.getNumber("delcnt"));
			}
			return true;
		}
		
		protected void getXfrAct(MCList<XfrActRecvIf_Chk01_DtlR> upL) {
			
			MST_XFR_ACT_D_R t2 = MST_XFR_ACT_D_R.create("T2");
			_xfrActL = MCList.create(MST_XFR_ACT_R.class);
			MST_XFR_ACT_R t = MST_XFR_ACT_R.create("T");
			MCQueryApiBuilder xfrActL_bldr = MCQueryApiBuilder.create(t);
					
			xfrActL_bldr.addInnerJoin(t2, t2.xfr_act_no.eq(t.xfr_act_no));
			xfrActL_bldr.setWhere(value(0).eq(value(0)));
			xfrActL_bldr.addWhereWithAnd(t2.ext_sys_cd.eq(bind("ext_sys_cd")));
			xfrActL_bldr.addWhereWithAnd(t2.ext_xfr_act_no.eq(bind("ext_xfr_act_no")));
				
			xfrActL_bldr.setOrderByAsc(t.xfr_act_no);
			xfrActL_bldr.setLockTable(t.xfr_act_no);
			dbSelectForUpdate("MSLAL6060_MST_XFR_ACT_S01", _xfrActL, xfrActL_bldr, upL.groupBy(MST_XFR_ACT_D_R.$ext_sys_cd, MST_XFR_ACT_D_R.$ext_xfr_act_no));
			_xfrActIdxKey = _xfrActL.createIndex(MST_XFR_ACT_R.$xfr_act_no);
		}
		protected void cmpleXfrAct(XfrActRecvIf_Chk01_DtlR row) {
			if(MAC_DATA_CRUD_TYP.isCRT(row.data_crud_typ())) return;
			MST_XFR_ACT_R actR = _xfrActL.getFirst(_xfrActIdxKey, row.xfr_act_no());

			if(isNull(actR)) return;
			row.xah().gr_stk_arrv_bp_cd(actR.gr_stk_arrv_bp_cd());
		}
		protected void cmpleTrd(XfrActRecvIf_Chk01_DtlR row) {
			if(!isNull(row.xfr_inst_no())) return;
			if(!isNull(row.trd_cd())) return;
			
			MAM_LOC_R giLocR = getGiLocR(row.gi_loc_cd());
			String giSpplCd = giLocR.sppl_cd();
			
			MAM_LOC_R grLocR = getGrLocR(row.gr_loc_cd());
			String grSpplCd = grLocR.sppl_cd();
			
			if(isXfr(giSpplCd, grSpplCd)) {
				row.xah().trd_cd(MAUCL_TrdUtil.getDefaultTrdCd(MAC_TRD_PTN_TYP.XFR.value()));

			}
			else if(isProv(giSpplCd, grSpplCd)) {
				row.xah().trd_cd(MAUCL_TrdUtil.getDefaultTrdCd(MAC_TRD_PTN_TYP.PROV.value()));
				
			}
			else if(isProvRtn(giSpplCd, grSpplCd)) {
				row.xah().trd_cd(MAUCL_TrdUtil.getDefaultTrdCd(MAC_TRD_PTN_TYP.PROV_RTN.value()));

			}
		}
		protected void cmpleItm(MCList<XfrActRecvIf_Chk01_DtlR> up) {
			for(XfrActRecvIf_Chk01_DtlR row: up) {
				MAM_ITM_R itmR = getItmR(row.itm_cd(), row.itm_sub1(), row.itm_sub2(), row.itm_sub3());

				//取引単位ＣＤに値が設定されていない場合、以下のいずれかが設定される
				//移動引当状況ＮＯが設定されていない：基準単位ＣＤ
				//移動引当状況ＮＯが設定されている：移動引当状況と同値
				if(isNull(row.trd_unit_cd())) {
					if(isNull(row.xa().xfr_alloc_sts_no())) {
						row.trd_unit_cd(itmR.unit_cd());
						row.xad().trd_unit_cd(itmR.unit_cd());
					}
					else {
						MST_XFR_ALLOC_STS_R allocStsR = getXfrAllocSts(row);
						if(isNull(allocStsR)) {
							row.trd_unit_cd(itmR.unit_cd());
							row.xad().trd_unit_cd(itmR.unit_cd());
						}else {
							row.trd_unit_cd(allocStsR.trd_unit_cd());
							row.xad().trd_unit_cd(allocStsR.trd_unit_cd());
						}
					}
				}
				
				if(MAC_DATA_CRUD_TYP.isCRT(row.data_crud_typ())) {
					row.xad().skip_chk_ship_flg(itmR.skip_chk_ship_flg());
				}
			}
		}
		protected void cmpleRsn(XfrActRecvIf_Chk01_DtlR row) {
			if(!isNull(row.xfr_inst_no())) {
				MST_XFR_ALLOC_STS_R allocStsR = getXfrAllocSts(row);
				row.xad().rsn_cd(allocStsR.rsn_cd());
				
				if (allocStsR.getBooleanNE("acxfr_gi_flg")) {
					if (isNull(row.bd_dpt_cd())) {
						row.xad().bd_dpt_cd(allocStsR.bd_dpt_cd());
					}
					else {
						row.xad().bd_dpt_cd(row.bd_dpt_cd());
					}
				}
			}
			else {
				row.xad().rsn_cd(row.rsn_cd());
				if (row.acxfr_gi_flg()) {
					if (isNull(row.bd_dpt_cd())) {
						String asstDptCd = execFuncString(createSqlId(LOGIC_ID, "MAPA_LOC$F_GET_ASST_DPT_CD", "01"), MAPA_LOC$F_GET_ASST_DPT_CD( value(row.gi_loc_cd()), value(row.xfr_dt())));
						row.xad().bd_dpt_cd(asstDptCd);
					}
					else {
						row.xad().bd_dpt_cd(row.bd_dpt_cd());
					}
				}
			}
		}
		protected void cmpleFixedValues(XfrActRecvIf_Chk01_DtlR row) {
			row.xah().intr_rmrks(null);
			row.xah().trd_rmrks(null);
			row.xah().sub_char1(null);
			row.xah().sub_char2(null);
			row.xah().sub_char3(null);

			row.xad().trd_d_rmrks(null);
			row.xad().sub_char1(null);
			row.xad().sub_char2(null);
			row.xad().sub_char3(null);
			
			row.xad().wms_flg(true);
		}
		protected void cmpleXIfR(XfrActRecvIf_Chk01_DtlR row) {
			if(MAC_DATA_CRUD_TYP.isCRT(row.data_crud_typ())) {
				row.xad().ext_sys_cd(row.ext_sys_cd());
				row.xad().ext_xfr_act_no(row.ext_xfr_act_no());
			}
			
			//指図がある場合は事前に指図から補完されている
			//取引ＣＤが設定されていない場合は事前に場所マスタの値を見て、補完されている
			//補完がない場合はIFテーブルの値を設定する
			if(isNull(row.xah().trd_cd())) {
				row.xah().trd_cd(row.trd_cd());
			}
			
			if(!isNull(row.trd_unit_cd())) {
				row.xad().trd_unit_cd(row.trd_unit_cd());
			}

			row.xah().xfr_inst_no(row.xfr_inst_no());
			row.xah().lg_grp_cd(row.lg_grp_cd());
			row.xah().gr_loc_cd(row.gr_loc_cd());
			row.xah().xfr_dt(row.xfr_dt());
			row.xah().ac_dt(row.xfr_dt());
			row.xah().act_usr_cd(row.act_usr_cd());
			row.xah().act_dpt_cd(row.act_dpt_cd());

			row.xad().xfr_alloc_sts_no(row.xfr_alloc_sts_no());
			row.xad().gi_loc_cd(row.gi_loc_cd());
			row.xad().gi_str_ln_cd(row.gi_str_ln_cd());
			row.xad().gr_str_ln_cd(row.gr_str_ln_cd());
			row.xad().itm_cd(row.itm_cd());
			row.xad().itm_sub1(row.itm_sub1());
			row.xad().itm_sub2(row.itm_sub2());
			row.xad().itm_sub3(row.itm_sub3());
			row.xad().lot_no(row.lot_no());
			row.xad().sublot_no(row.sublot_no());
			row.xad().sno1(row.sno1());
			row.xad().sno2(row.sno2());
			row.xad().sno3(row.sno3());
			row.xad().sno4(row.sno4());
			row.xad().gd_cd(row.gd_cd());
			row.xad().quality_typ(row.quality_typ());
			row.xad().stk_insp_typ(row.stk_insp_typ());
			row.xad().stk_id_typ(row.stk_id_typ());
			row.xad().stk_bp_cd(row.stk_bp_cd());
			row.xad().trd_unit_qty(row.trd_unit_qty());
			row.xad().base_dlv_slip_no(row.base_dlv_slip_no());
			row.xad().base_prov_act_no(row.base_prov_act_no());
			row.xad().base_ac_dt(row.base_ac_dt());
			row.xad().intr_d_rmrks(row.intr_d_rmrks());
		}
		protected void splitUpdRow(MCList<XfrActRecvIf_Chk01_DtlR> upL) {
			MCList<XfrActRecvIf_Chk01_DtlR> updL = upL.subList(XfrActRecvIf_Chk01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.UPD.value());
			if(updL.size() < 1) return ;
			
			for(MCList<XfrActRecvIf_Chk01_DtlR>actL: updL.groupList(XfrActRecvIf_Chk01_DtlR.$xfr_act_no)) {
				if(actL.size() < 2) continue;

				XfrActRecvIf_Chk01_DtlR firstActR = actL.get(0);
				for(int i = 1; i < actL.size(); i++) {
					XfrActRecvIf_Chk01_DtlR actR = actL.get(i);
					if(isSameAct(firstActR, actR)) continue;
					
					actR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					XfrActRecvIf_Chk01_DtlR newR = actR.clone();
					newR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					upL.add(newR);
				}
			}
		}
		protected boolean isSameAct(XfrActRecvIf_Chk01_DtlR r1, XfrActRecvIf_Chk01_DtlR r2) {
			return isSame(r1.xfr_act_no(), r2.xfr_act_no()) &&
					isSame(r1.xfr_inst_no(), r2.xfr_inst_no()) &&
					isSame(r1.trd_cd(), r2.trd_cd()) &&
					isSame(r1.lg_grp_cd(), r2.lg_grp_cd()) &&
					isSame(r1.gr_loc_cd(), r2.gr_loc_cd()) &&
					isSame(r1.xfr_dt(), r2.xfr_dt()) &&
					isSame(r1.act_dpt_cd(), r2.act_dpt_cd()) &&
					isSame(r1.act_usr_cd(), r2.act_usr_cd());
		}
	
		protected boolean isSameItm(XfrActRecvIf_Chk01_DtlR xfrActRecvIfR, MST_XFR_ACT_D_R xfrActDR) {
			
			return isSame(xfrActRecvIfR.itm_cd(), xfrActDR.itm_cd())
					&& isSame(xfrActRecvIfR.itm_sub1(), xfrActDR.itm_sub1())
					&& isSame(xfrActRecvIfR.itm_sub2(), xfrActDR.itm_sub2())
					&& isSame(xfrActRecvIfR.itm_sub3(), xfrActDR.itm_sub3());
		}
		
		protected void setDown() {
			down0().setAll(up0().groupBy(XfrActRecvIf_Chk01_DtlR.$data_lno, XfrActRecvIf_Chk01_DtlR.$err_flg));
			up0().forEach(row -> {
				XfrActRecvIf_Chk01_HdrDtlR hdR = down1().add();
				hdR.data_lno(row.data_lno());
				hdR.data_crud_typ(row.data_crud_typ());
				hdR.abort_flg(row.abort_flg());
				if(MAC_DATA_CRUD_TYP.isUPD(hdR.data_crud_typ()) || MAC_DATA_CRUD_TYP.isDEL(hdR.data_crud_typ())) {
					if (_xfrActIdxKey != null) {
						MST_XFR_ACT_R xfrAct = _xfrActL.getFirst(_xfrActIdxKey, row.xfr_act_no());
						if (!isNull(xfrAct)) {
							hdR.can_ac_dt(xfrAct.ac_dt());
						}
					}
				}
				hdR.xah(row.xah());
				hdR.xad(row.xad());
				hdR.setParamIndex(row.getParamIndex());
				hdR.setParamRowIndex(row.getParamRowIndex());
			});
		}

		/**
		 * 移動・移送かどうか
		 * 社内場所から社内場所、または同一発注先間の移動なら移動。
		 */
		protected boolean isXfr(String giSpplCd, String grSpplCd) {
			return (isNullOrNullVal(giSpplCd) && isNullOrNullVal(grSpplCd)) || isSame(giSpplCd, grSpplCd);
		}
		
		/**
		 * 支給かどうか
		 * 社内場所から社外場所への移動なら支給。
		 */
		protected boolean isProv(String giSpplCd, String grSpplCd) {
			return isNullOrNullVal(giSpplCd) && !isNullOrNullVal(grSpplCd);
		}

		/**
		 * 支給返品かどうか
		 * 社外場所から社内場所への移動なら支給返品。
		 */
		protected boolean isProvRtn(String giSpplCd, String grSpplCd) {
			return !isNullOrNullVal(giSpplCd) && isNullOrNullVal(grSpplCd);
		}
		
		/**
		 * 移動引当状況キャッシュ
		 */
		protected XfrAllocStsCache _xfrAllocStsL;
		protected void initXfrAllocStsL(MCList<XfrActRecvIf_Chk01_DtlR> up) {
			_xfrAllocStsL = new XfrAllocStsCache(up);
		}
		protected MST_XFR_ALLOC_STS_R getXfrAllocSts(XfrActRecvIf_Chk01_DtlR upR) {
			return _xfrAllocStsL.get(upR);
		}
		public class XfrAllocStsCache {
			protected MCList<MST_XFR_ALLOC_STS_R> _dbc;
			protected List<MCIndexKey> _idx = new ArrayList<MCIndexKey>();
			protected String[][] _priorityKeys = {
					{
							MST_XFR_ALLOC_STS_R.$xfr_alloc_sts_no
					},

					{
							MST_XFR_INST_R.$xfr_inst_no, MST_XFR_INST_D_R.$itm_cd,
							MST_XFR_INST_D_R.$itm_sub1, MST_XFR_INST_D_R.$itm_sub2, MST_XFR_INST_D_R.$itm_sub3,
							MST_XFR_ALLOC_STS_R.$gi_loc_cd,
							MST_XFR_ALLOC_STS_R.$gi_str_ln_cd,
							MST_XFR_ALLOC_STS_R.$lot_no, MST_XFR_ALLOC_STS_R.$sublot_no,
							MST_XFR_ALLOC_STS_R.$sno1, MST_XFR_ALLOC_STS_R.$sno2,
							MST_XFR_ALLOC_STS_R.$sno3, MST_XFR_ALLOC_STS_R.$sno4
					},

					{
							MST_XFR_INST_R.$xfr_inst_no, MST_XFR_INST_D_R.$itm_cd,
							MST_XFR_INST_D_R.$itm_sub1, MST_XFR_INST_D_R.$itm_sub2, MST_XFR_INST_D_R.$itm_sub3,
							MST_XFR_ALLOC_STS_R.$gi_loc_cd,
							MST_XFR_ALLOC_STS_R.$gi_str_ln_cd,
							MST_XFR_ALLOC_STS_R.$lot_no, MST_XFR_ALLOC_STS_R.$sublot_no
					},

					{
							MST_XFR_INST_R.$xfr_inst_no, MST_XFR_INST_D_R.$itm_cd,
							MST_XFR_INST_D_R.$itm_sub1, MST_XFR_INST_D_R.$itm_sub2, MST_XFR_INST_D_R.$itm_sub3,
							MST_XFR_ALLOC_STS_R.$gi_loc_cd,
							MST_XFR_ALLOC_STS_R.$gi_str_ln_cd
					},

					{
							MST_XFR_INST_R.$xfr_inst_no, MST_XFR_INST_D_R.$itm_cd,
							MST_XFR_INST_D_R.$itm_sub1, MST_XFR_INST_D_R.$itm_sub2, MST_XFR_INST_D_R.$itm_sub3,
							MST_XFR_ALLOC_STS_R.$gi_loc_cd
					},

					{
							MST_XFR_INST_R.$xfr_inst_no, MST_XFR_INST_D_R.$itm_cd,
							MST_XFR_INST_D_R.$itm_sub1, MST_XFR_INST_D_R.$itm_sub2, MST_XFR_INST_D_R.$itm_sub3
					}
			};
			
			protected MCIndexKey _dbcIdx;
			protected MCList<MST_XFR_ACT_D_R> _xfrActDL;
			protected MCIndexKey _xfrActDIdx;
			
			protected XfrAllocStsCache(MCList<XfrActRecvIf_Chk01_DtlR> up) {
				init(up);
			}
			protected void init(MCList<XfrActRecvIf_Chk01_DtlR> up) {
				_dbc = MCList.create(MST_XFR_ALLOC_STS_R.class);
				MCList<MST_XFR_ALLOC_STS_R> l = MCList.create(MST_XFR_ALLOC_STS_R.class);
				MST_XFR_ALLOC_STS_R t = MST_XFR_ALLOC_STS_R.create("T");
				MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
				setDbcBldr(t, l_bldr);

				// ＩＦデータを振り分ける
				MCList<MST_XFR_ALLOC_STS_R> xfrAllocStsL = MCList.create(MST_XFR_ALLOC_STS_R.class);
				MCList<MST_XFR_INST_R> xfrInstL = MCList.create(MST_XFR_INST_R.class);
				
				for (XfrActRecvIf_Chk01_DtlR r : up
						.groupBy(XfrActRecvIf_Chk01_DtlR.$xfr_alloc_sts_no,
								XfrActRecvIf_Chk01_DtlR.$xfr_inst_no)) {
					if (!isNull(r.xfr_alloc_sts_no())) {
						MST_XFR_ALLOC_STS_R row = MST_XFR_ALLOC_STS_R.create();
						row.xfr_alloc_sts_no(r.xfr_alloc_sts_no());
						xfrAllocStsL.add(row);
					}
					else if (!isNull(r.xfr_inst_no())) {
						MST_XFR_INST_R row = MST_XFR_INST_R.create();
						row.xfr_inst_no(r.xfr_inst_no());
						xfrInstL.add(row);
					}
				}
				
				// 振り分けたリストごとに移動引当状況を取得し、その結果をリストに追加する

				MCQueryApiBuilder xfrAllocStsL_bldr = MCQueryApiBuilder.create(MST_XFR_ALLOC_STS_R.create("T1"));
				MCQueryApiBuilder xfrInstL_bldr = MCQueryApiBuilder.create(MST_XFR_INST_R.create("T2"));
				
				if (xfrAllocStsL.size() != 0) {
					dbWkDelete("MSLAL6060_MSW_XFR_ALLOC_STS_D01", xfrAllocStsL_bldr.getBaseDbc());
					dbWkInsert("MSLAL6060_MSW_XFR_ALLOC_STS_I01", xfrAllocStsL, xfrAllocStsL_bldr.getBaseDbc());
					addToXfrAllocStsL_Alloc(l, l_bldr, t);
					dbWkDelete("MSLAL6060_MSW_XFR_ALLOC_STS_D02", xfrAllocStsL_bldr.getBaseDbc());
				}
				if (xfrInstL.size() != 0) {
					dbWkDelete("MSLAL6060_MSW_XFR_INST_D01", xfrInstL_bldr.getBaseDbc());
					dbWkInsert("MSLAL6060_MSW_XFR_INST_I01", xfrInstL, xfrInstL_bldr.getBaseDbc());
					addToXfrAllocStsL_Inst(l, l_bldr, t);
					addToXfrActDL_Inst(up);	// 後続で引当状況NOから指図NOを補完しているが、引当状況NOがあれば実績明細は不要
					dbWkDelete("MSLAL6060_MSW_XFR_INST_D02", xfrInstL_bldr.getBaseDbc());
				}
				//移動指図ＮＯを補完する
				MCIndexKey idx = l.createIndex(MST_XFR_ALLOC_STS_R.$xfr_alloc_sts_no);
				for (XfrActRecvIf_Chk01_DtlR upR : up) {
					if (isNull(upR.xfr_inst_no()) && !isNull((upR.xfr_alloc_sts_no()))) {
						upR.xfr_inst_no(l.getFirst(idx, upR.xfr_alloc_sts_no()).getString("xfr_inst_no"));
					}
				}
				
				for(int i = 0; i < _priorityKeys.length; i++) {
					_idx.add(_dbc.createIndex(_priorityKeys[i]));
				}
				_dbcIdx = _idx.get(0);
			}
			
			protected MST_XFR_ALLOC_STS_R get(XfrActRecvIf_Chk01_DtlR upR) {
				
				MCList<MST_XFR_ALLOC_STS_R> allocStsL = MCList.create(MST_XFR_ALLOC_STS_R.class);
				
				MST_XFR_ALLOC_STS_R allocStsR = null;
				for(int i = 0; i < _priorityKeys.length; i++) {
					
					// 移動引当状況を特定する際のみ、ＮＵＬＬ文字を補完する
					XfrActRecvIf_Chk01_DtlR vals  = upR.clone();
					vals.lot_no(nvl(vals.lot_no(), MAC_STR.NULL_VAL.value()));
					vals.sublot_no(nvl(vals.sublot_no(), MAC_STR.NULL_VAL.value()));
					
					vals.sno1(nvl(vals.sno1(), MAC_STR.NULL_VAL.value()));
					vals.sno2(nvl(vals.sno2(), MAC_STR.NULL_VAL.value()));
					vals.sno3(nvl(vals.sno3(), MAC_STR.NULL_VAL.value()));
					vals.sno4(nvl(vals.sno4(), MAC_STR.NULL_VAL.value()));

					allocStsL = _dbc.subList(_idx.get(i), vals.toArray(_priorityKeys[i]));
					if(!allocStsL.isEmpty()) return setXfrAllocSts(upR, allocStsL);
					
				}
				return allocStsR;
			}
			
			protected MST_XFR_ALLOC_STS_R setXfrAllocSts(XfrActRecvIf_Chk01_DtlR upR,
					MCList<MST_XFR_ALLOC_STS_R> allocStsL) {
				if (isNull(_xfrActDL)) {
					// 全ての上り電文に移動引当状況NOが設定されているためallocStsLへの数量加算・打切フラグの置換は不要
					return allocStsL.get(0);
				}
				MST_XFR_ALLOC_STS_R allocStsR = MST_XFR_ALLOC_STS_R.create();
				
				if (MAC_DATA_CRUD_TYP.isCRT(upR.data_crud_typ())) {
					MCList<MST_XFR_ALLOC_STS_R> tmpAllocStsL = MCList.create(MST_XFR_ALLOC_STS_R.class);
					MCList<MST_XFR_ALLOC_STS_R> tmpCmplAllocStsL = MCList.create(MST_XFR_ALLOC_STS_R.class);
					
					for (MST_XFR_ALLOC_STS_R r : allocStsL) {
						if (!r.cmpl_flg()) {
							if (!r.abort_flg() && !r.act_qty().gte(r.base_unit_qty())) {
								tmpAllocStsL.add(r);
							}
							else {
								tmpCmplAllocStsL.add(r);
							}
						}
					}
					
					if (!tmpAllocStsL.isEmpty()) {
						allocStsR = tmpAllocStsL.get(0);
					}
					else if (!tmpCmplAllocStsL.isEmpty()) {
						allocStsR = tmpCmplAllocStsL.get(tmpCmplAllocStsL.size() - 1);
					}
					else {
						allocStsR = allocStsL.get(allocStsL.size() - 1);
					}
					
					MST_XFR_ACT_D_R actDR = _xfrActDL.getFirst(_xfrActDIdx, upR.ext_sys_cd(), upR.ext_xfr_act_no());
					if (isNull(actDR.xfr_alloc_sts_no())) {
						MCNumber baseUnitQty = getBaseUnitQty(upR);
						
						actDR.xfr_alloc_sts_no(allocStsR.xfr_alloc_sts_no());
						actDR.base_unit_qty(baseUnitQty);
						
						allocStsR.act_qty(allocStsR.act_qty().add(baseUnitQty));
						if (upR.abort_flg()) allocStsR.abort_flg(true);
					}
				}
				else {
					MST_XFR_ACT_D_R actDR = _xfrActDL.getFirst(_xfrActDIdx, upR.ext_sys_cd(), upR.ext_xfr_act_no());
					if (isNull(actDR)){
						allocStsR = _dbc.getFirst(_dbcIdx, upR.xfr_alloc_sts_no());
						return allocStsR;
					}
					allocStsR = _dbc.getFirst(_dbcIdx, actDR.xfr_alloc_sts_no());
					
					MCNumber baseUnitQty =MCNumber.ZERO;
					if(MAC_DATA_CRUD_TYP.isUPD(upR.data_crud_typ())) {
						baseUnitQty = getBaseUnitQty(upR);
					}
					
					if (!isSame(baseUnitQty, actDR.base_unit_qty())) {
						MCNumber diffQty = baseUnitQty.subtract(actDR.base_unit_qty());
						actDR.base_unit_qty(baseUnitQty);
						allocStsR.act_qty(allocStsR.act_qty().add(diffQty));
					}
					allocStsR.abort_flg(upR.abort_flg());
				}
				return allocStsR;
			}
			
			/**
			 * 基準単位数量<br>
			 * ※事前に品目が補完されていること
			 */
			protected MCNumber getBaseUnitQty(XfrActRecvIf_Chk01_DtlR ifR) {
				MAM_ITM_R itmR = getItmR(ifR.itm_cd(), ifR.itm_sub1(), ifR.itm_sub2(), ifR.itm_sub3());
				if (isSame(itmR.unit_cd(), ifR.trd_unit_cd())) {
					return ifR.trd_unit_qty();
				}
				MAVM_ITM_UNIT_R unitR = getItmUnitR(
					ifR.itm_cd(), ifR.itm_sub1(), ifR.itm_sub2(), ifR.itm_sub3(), ifR.trd_unit_cd());
				return
					convToBaseUnit(
						ifR.trd_unit_qty(), unitR.conv_base_qty() , unitR.conv_qty(),
						itmR.dec_place(), itmR.rnd_typ());
			}
			
			/**
			 * 品目単位マスタキャッシュ
			 */
			protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _itmUnitCache;
			protected MAVM_ITM_UNIT_R getItmUnitR(
					String itmCd, String itmSub1, String itmSub2, String itmSub3, String unitCd) {
				if (_itmUnitCache == null) {
					MAVM_ITM_UNIT_R t = MAVM_ITM_UNIT_R.create("T");
					MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
					_itmUnitCache = new FXUCL_MCDbcCache<>(dbc_bldr);
				}
				return _itmUnitCache.get(itmCd, itmSub1, itmSub2, itmSub3, unitCd);
			}
			
			protected boolean addToXfrAllocStsL_Alloc(MCList<MST_XFR_ALLOC_STS_R> l, MCQueryApiBuilder l_bldr, MST_XFR_ALLOC_STS_R t) {
				
				MSW_XFR_ALLOC_STS_KEY_R t5 = MSW_XFR_ALLOC_STS_KEY_R.create("T5");
				l.addBooleanColumn("acxfr_gi_flg");
				l_bldr.addInnerJoin(t5, t.xfr_alloc_sts_no.eq(t5.xfr_alloc_sts_no));
				dbSelectForUpdate("MSLAL6060_MST_XFR_ALLOC_STS_S01", l, l_bldr);
				return _dbc.addAll(l);
			}
			
			protected boolean addToXfrAllocStsL_Inst(MCList<MST_XFR_ALLOC_STS_R> l, MCQueryApiBuilder l_bldr, MST_XFR_ALLOC_STS_R t) {

				MSW_XFR_INST_KEY_R t6 = MSW_XFR_INST_KEY_R.create("T6");
				MST_XFR_INST_R t4 = MST_XFR_INST_R.create("T4");
				l.addBooleanColumn("acxfr_gi_flg");
				l_bldr.addInnerJoin(t6, t4.xfr_inst_no.eq(t6.xfr_inst_no));
				dbSelectForUpdate("MSLAL6060_MST_XFR_ALLOC_STS_S02", l, l_bldr);
				return _dbc.addAll(l);
			}
			
			protected void addToXfrActDL_Inst(MCList<XfrActRecvIf_Chk01_DtlR> up) {
				_xfrActDL = MCList.create(MST_XFR_ACT_D_R.class);
				
				MST_XFR_ACT_D_R actD = MST_XFR_ACT_D_R.create("ACT_D");
				MCQueryApiBuilder actDL_bldr = MCQueryApiBuilder.create(actD);
				MST_XFR_ACT_R act = MST_XFR_ACT_R.create("ACT");
				MSW_XFR_INST_KEY_R instWk = MSW_XFR_INST_KEY_R.create("INST_WK");
				actDL_bldr.setSelect(actD.xfr_alloc_sts_no,		// 移動引当状況
						actD.ext_sys_cd, actD.ext_xfr_act_no,		// 外部システムCD、外部移動実績
						actD.base_unit_qty);									// 基準単位数量
				actDL_bldr.addInnerJoin(act, act.xfr_act_no.eq(actD.xfr_act_no));
				actDL_bldr.addInnerJoin(instWk, act.xfr_inst_no.eq(instWk.xfr_inst_no));
				dbSelect("MSLAL6060_MST_XFR_ACT_D_S02", _xfrActDL, actDL_bldr);
				
				MCList<XfrActRecvIf_Chk01_DtlR> insUpL = up.subList(XfrActRecvIf_Chk01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
				for (XfrActRecvIf_Chk01_DtlR insUpR : insUpL) {
					MST_XFR_ACT_D_R insActDR = MST_XFR_ACT_D_R.create();
					insActDR.ext_sys_cd(insUpR.ext_sys_cd());
					insActDR.ext_xfr_act_no(insUpR.ext_xfr_act_no());
					_xfrActDL.add(insActDR);
				}
				_xfrActDIdx = _xfrActDL.createIndex(MST_XFR_ACT_D_R.$ext_sys_cd, MST_XFR_ACT_D_R.$ext_xfr_act_no);
			}
			
			protected void setDbcBldr(MST_XFR_ALLOC_STS_R t, MCQueryApiBuilder dbc_bldr) {
				
				MST_XFR_INST_D_R t3 = MST_XFR_INST_D_R.create("T3");
				MST_XFR_INST_R t4 = MST_XFR_INST_R.create("T4");
				MAM_BIZ_RSN_R m1 = MAM_BIZ_RSN_R.create("M1");
				
				_dbc.addStringColumn("itm_cd");
				_dbc.addStringColumn("itm_sub1");
				_dbc.addStringColumn("itm_sub2");
				_dbc.addStringColumn("itm_sub3");
				_dbc.addStringColumn("xfr_inst_no");
				_dbc.addBooleanColumn("acxfr_gi_flg");
				dbc_bldr.addSelect(t3.itm_cd, t3.itm_sub1, t3.itm_sub2, t3.itm_sub3, t4.xfr_inst_no);
				dbc_bldr.addSelect(m1.acxfr_gi_flg);
				dbc_bldr.addLeftOuterJoin(t3, t3.xfr_inst_d_no.eq(t.xfr_inst_d_no));
				dbc_bldr.addLeftOuterJoin(t4, t4.xfr_inst_no.eq(t3.xfr_inst_no));
				dbc_bldr.addLeftOuterJoin(m1, t.rsn_cd.eq(m1.biz_rsn_cd));
				dbc_bldr.setOrderByAsc(t.xfr_alloc_sts_no);
				dbc_bldr.setLockTable(t.xfr_alloc_sts_no);
			}
		}
		
		/**
		 * 移動指図キャッシュ
		 */
		protected XfrInstCache _xfrInstL;
		protected void initXfrInstL(MCList<XfrActRecvIf_Chk01_DtlR> up) {
			_xfrInstL = new XfrInstCache(up);
		}
		protected MST_XFR_INST_R getXfrInst(String xfrInstNo) {
			return _xfrInstL.get(xfrInstNo);
		}
		public class XfrInstCache {
			protected MCList<MST_XFR_INST_R> _dbc;
			protected MCIndexKey _idx;
			protected XfrInstCache(MCList<XfrActRecvIf_Chk01_DtlR> up) {
				init(up);
			}
			protected void init(MCList<XfrActRecvIf_Chk01_DtlR> up) {
				_dbc = MCList.create(MST_XFR_INST_R.class);
				MST_XFR_INST_R t = MST_XFR_INST_R.create("T");
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);

				dbc_bldr.setWhere(t.xfr_inst_no.eq(bind("xfr_inst_no")));
				dbc_bldr.setOrderByAsc(t.xfr_inst_no);
				dbc_bldr.setLockTable(t.xfr_inst_no);
				dbSelectForUpdate("MSLAL6060_MST_XFR_INST_S01", _dbc, dbc_bldr, up.groupBy(MST_XFR_INST_R.$xfr_inst_no));
				_idx = _dbc.createIndex(MST_XFR_INST_R.$xfr_inst_no);
			}
			protected MST_XFR_INST_R get(String xfrInstNo) {
				return _dbc.getFirst(_idx, xfrInstNo);
			}
		}
		
		/**
		 * 移動実績明細キャッシュ
		 */
		protected XfrActDCache _xfrActDL;
		protected void initXfrActDL(MCList<XfrActRecvIf_Chk01_DtlR> up) {
			_xfrActDL = new XfrActDCache(up);
		}
		protected MST_XFR_ACT_D_R getXfrActD(String extSysCd, String extXfrActNo) {
			return _xfrActDL.get(extSysCd, extXfrActNo);
		}
		protected MST_XFR_ACT_D_R getXfrActD(String extSysCd, String extXfrActNo, String xfrAllocStsNo) {
			return _xfrActDL.get(extSysCd, extXfrActNo, xfrAllocStsNo);
		}
		public class XfrActDCache {
			protected MCList<MST_XFR_ACT_D_R> _dbc;
			protected MCIndexKey _idx1, _idx2, _idx3;
			protected XfrActDCache(MCList<XfrActRecvIf_Chk01_DtlR> up) {
				init(up);
			}
			protected void init(MCList<XfrActRecvIf_Chk01_DtlR> up) {
				MST_XFR_ACT_R t2 = MST_XFR_ACT_R.create("T2");

				_dbc = MCList.create(MST_XFR_ACT_D_R.class);
				MST_XFR_ACT_D_R t = MST_XFR_ACT_D_R.create("T");
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
				_dbc.addStringColumn("lg_grp_cd");
				dbc_bldr.addSelect(t2.lg_grp_cd);
				dbc_bldr.addLeftOuterJoin(t2, t2.xfr_act_no.eq(t.xfr_act_no));
				if(!up.isEmpty()) {
					dbc_bldr.setWhere(value(0).eq(value(0)));
					dbc_bldr.addWhereWithAnd(t.ext_sys_cd.eq(bind("ext_sys_cd")));
					dbc_bldr.addWhereWithAnd(t.ext_xfr_act_no.eq(bind("ext_xfr_act_no")));
					dbc_bldr.addWhereWithCutOffAnd(t.xfr_alloc_sts_no.eq(bind("xfr_alloc_sts_no")));
					dbc_bldr.setOrderByAsc(t.xfr_act_d_no);
					dbc_bldr.setLockTable(t.xfr_act_d_no);
					dbSelectForUpdate("MSLAL6060_MST_XFR_ACT_D_S01", _dbc, dbc_bldr, up.groupBy(MST_XFR_ACT_RECV_IF_R.$ext_sys_cd, MST_XFR_ACT_RECV_IF_R.$ext_xfr_act_no, MST_XFR_ACT_RECV_IF_R.$xfr_alloc_sts_no));
				}
				_idx1 = _dbc.createIndex(MST_XFR_ACT_D_R.$ext_sys_cd, MST_XFR_ACT_D_R.$ext_xfr_act_no);
				_idx2 = _dbc.createIndex(MST_XFR_ACT_D_R.$ext_sys_cd, MST_XFR_ACT_D_R.$ext_xfr_act_no, MST_XFR_ACT_D_R.$xfr_alloc_sts_no);
				_idx3 = _dbc.createIndex(MST_XFR_ACT_D_R.$xfr_act_no);
			}
			protected MST_XFR_ACT_D_R get(String extSysCd, String extXfrActNo) {
				return _dbc.getFirst(_idx1, extSysCd, extXfrActNo);
			}
			protected MST_XFR_ACT_D_R get(String extSysCd, String extXfrActNO, String xfrALlocStsNo) {
				return _dbc.getFirst(_idx2, extSysCd, extXfrActNO, xfrALlocStsNo);
			}
		}

		/**
		 * 品目マスタキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache;
		protected void initItmL(MCList<XfrActRecvIf_Chk01_DtlR> up) {
			MCList<MAM_ITM_R> dbc = MCList.create(MAM_ITM_R.class);
			up.forEach(r -> {
				MAM_ITM_R dbcR = dbc.add();
				dbcR.itm_cd(r.xad().itm_cd());
				dbcR.itm_sub1(r.xad().itm_sub1());
				dbcR.itm_sub2(r.xad().itm_sub2());
				dbcR.itm_sub3(r.xad().itm_sub3());
			});
			_itmCache = new FXUCL_MCDbcCache<>(
					MCQueryApiBuilder.create(MAM_ITM_R.create("T")), dbc,
				MAM_ITM_R.$itm_cd,
				MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
		}
		protected MAM_ITM_R getItmR(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
			if (_itmCache == null) {
				_itmCache = new FXUCL_MCDbcCache<>(MCQueryApiBuilder.create(MAM_ITM_R.create("T")));
			}
			return _itmCache.get(itmCd, itmSub1, itmSub2, itmSub3);
		}

		/**
		 * 場所マスタキャッシュ（出庫場所）
		 */
		protected FXUCL_MCDbcCache<MAM_LOC_R> _giLocCache = null;
		protected void initGiLocL(MCList<XfrActRecvIf_Chk01_DtlR> up) {
			MCList<MAM_LOC_R> dbc = MCList.create(MAM_LOC_R.class);
			up.forEach(r -> {
				MAM_LOC_R dbcR = dbc.add();
				dbcR.loc_cd(r.gi_loc_cd());
			});
			_giLocCache = new FXUCL_MCDbcCache<>(MCQueryApiBuilder.create(MAM_LOC_R.create("T")), dbc, XfrActRecvIf_Chk01_DtlR.$gi_loc_cd);
		}
		protected MAM_LOC_R getGiLocR(String locCd) {
			if (_giLocCache == null) {
				_giLocCache = new FXUCL_MCDbcCache<>(MCQueryApiBuilder.create(MAM_LOC_R.create("T")));
			}
			return _giLocCache.get(locCd);
		}

		/**
		 * 場所マスタキャッシュ（入庫場所）
		 */
		protected FXUCL_MCDbcCache<MAM_LOC_R> _grLocCache = null;
		protected void _initGrLocCache(MCList<XfrActRecvIf_Chk01_DtlR> up) {
			MCList<MAM_LOC_R> dbc = MCList.create(MAM_LOC_R.class);
			up.forEach(r -> {
				MAM_LOC_R dbcR = dbc.add();
				dbcR.loc_cd(r.gr_loc_cd());
			});
			_grLocCache = new FXUCL_MCDbcCache<MAM_LOC_R>(MCQueryApiBuilder.create(MAM_LOC_R.create("T")), dbc, XfrActRecvIf_Chk01_DtlR.$gr_loc_cd);
		}
		protected MAM_LOC_R getGrLocR(String locCd) {
			if (_grLocCache == null) {
				_grLocCache = new FXUCL_MCDbcCache<>(MCQueryApiBuilder.create(MAM_LOC_R.create("T")));
			}
			return _grLocCache.get(locCd);
		}
		
		/**
		 * 外部システムマスタキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_EXT_SYS_R> _extSysCache;
		protected void initExtSysL(MCList<XfrActRecvIf_Chk01_DtlR> up) {
			MCList<MAM_EXT_SYS_R> dbc = MCList.create(MAM_EXT_SYS_R.class);
			up.forEach(r -> {
				dbc.add().ext_sys_cd(r.xa().ext_sys_cd());
			});
			_extSysCache = new FXUCL_MCDbcCache<>(
					MCQueryApiBuilder.create(MAM_EXT_SYS_R.create("T")), dbc,
				MAM_EXT_SYS_R.$ext_sys_cd);
		}
		protected MAM_EXT_SYS_R getExtSysR(String extSysCd) {
			if (_extSysCache == null) {
				_extSysCache = new FXUCL_MCDbcCache<>(MCQueryApiBuilder.create(MAM_EXT_SYS_R.create("T")));
			}
			return _extSysCache.get(extSysCd);
		}
		
		@Override
		protected void customListLogicCnd(String column, MCNumber paramIndex, MCConstRow data, Map<String, Comparable<?>> cnd) {
			super.customListLogicCnd(column, paramIndex, data, cnd);
			
			if(isSame(paramIndex, MCNumber.ZERO)) {
				XfrActRecvIf_Chk01_DtlR r = (XfrActRecvIf_Chk01_DtlR)data;
				
				if(isSame(column, XfrActRecvIf_Chk01_DtlR.$gr_loc_cd)) {

					if(MAC_TRD_PTN_TYP.isPROV(MAUCL_TrdUtil.getTrd(r.trd_cd()).trd_ptn_typ())) {
						cnd.put(LocCols.$i_loc_is_srch_typ, MAC_LOC_IS_SRCH_TYP.OUTSIDE.value());

					}
					else {
						cnd.put(LocCols.$i_loc_is_srch_typ, MAC_LOC_IS_SRCH_TYP.HOUSE.value());						
						
					}
				}

				if(isSame(column, XfrActRecvIf_Chk01_DtlR.$gi_loc_cd)) {
					MAM_LOC_R giLocR = getGiLocR(r.gi_loc_cd());

					if(MAC_TRD_PTN_TYP.isPROV_RTN(MAUCL_TrdUtil.getTrd(r.trd_cd()).trd_ptn_typ())) {
						cnd.put(LocCols.$i_loc_is_srch_typ, MAC_LOC_IS_SRCH_TYP.LG_GRP_OUTSIDE.value());

					}
					else {
						cnd.put(LocCols.$i_loc_is_srch_typ, MAC_LOC_IS_SRCH_TYP.LG_GRP_HOUSE.value());						
						
					}
					cnd.put(LocCols.$i_lg_grp_cd, giLocR.lg_grp_cd());
					
				}
				
				if(isSame(column, XfrActRecvIf_Chk01_DtlR.$stk_id_typ)) {
					MAM_LOC_R locR = getGrLocR(r.gr_loc_cd());
					cnd.put(StkIdTypCols.$i_gr_sppl_cd, locR.sppl_cd());
					cnd.put(StkIdTypCols.$i_xfr_flg, true);
				}
			}
		}
	}

	protected void setErrSts(MST_XFR_ACT_RECV_IF_R exeR) {

		exeR.exe_sts_typ(MAC_EXE_STS_TYP.ERR.value());
		setErrSet(exeR);
	}
	
	protected void setErrSet(MST_XFR_ACT_RECV_IF_R xfrRecvIfR) {
		
		List<String> lst = createErrSetKey(xfrRecvIfR);
		if (!object(CLAZZ)._errSet.contains(lst)) {
			object(CLAZZ)._errSet.add(lst);
		}

		if (!object(CLAZZ)._stopErrSet.contains(xfrRecvIfR.ext_sys_cd())) {
			object(CLAZZ)._stopErrSet.add(xfrRecvIfR.ext_sys_cd());
		}
	}

	protected List<String> createErrSetKey(MST_XFR_ACT_RECV_IF_R xfrRecvIfR) {
		
		List<String> list = new ArrayList<String>();
		if (!isNull(xfrRecvIfR)) {
			list.add(xfrRecvIfR.lg_grp_cd());
			list.add(xfrRecvIfR.ext_sys_cd());
			list.add(xfrRecvIfR.ext_xfr_act_no());
		}
		return list;
	}

	//FMCB CUSTOM END
}