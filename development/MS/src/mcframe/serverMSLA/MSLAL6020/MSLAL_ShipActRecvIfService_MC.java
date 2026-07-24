package mcframe.serverMSLA.MSLAL6020;

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
import mcframe.serverMSLA.MSLAL6020.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL5630.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMBBE.MBBEL5010.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverPFUD.PFUDL0040.*;	// このimportはFrameManagerの自動生成で追加されました。

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.function.Function;

import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.commonCore.container.MCRow.*;
import mcframe.serverMSLA.MSLAL6320.MSLAL_SCMActRecvIfService;
import mcframe.serverPF.dbc.PFT_SDRV_IF_R;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogger;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCFuncCache;
import mcframe.serverCore.mcjdbc.MCSavepoint;
import mcframe.serverCore.requester.MCServerThreadManager;
import mcframe.serverCore.resource.MCConst;
import mcframe.serverCore.sys.MCSys;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverMAUC.MAUCL5020.MAUCL_RevDataService;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_ShipActRecvIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_ShipActRecvIfService_MC extends MSLAL_ShipActRecvIfService_MC_A{
	//FMCB CUSTOM START
	/**
	 * エラーになったキーの組み合わせを保持する
	 */
	protected Set<List<String>> _errSet = new HashSet<List<String>>();

	/**
	 * エラーになった外部システムCDを保持する(Upd03, Upd04で共有)
	 */
	protected Set<String> _stopErrSet = new HashSet<String>();
	
	/**
	 * キャッシュを管理するリクエストオブジェクト
	 */
	protected static final Class<MSLAL_ShipActRecvIfService> CLAZZ = MSLAL_ShipActRecvIfService.class;
		
	/**
	 * ShipActRecvIf_Upd01オペレーション.<p>
	 *
	 * 出荷実績受信ＩＦ取込を行う。（ＥＳＢのリアルタイム取込から呼び出される）<br>
	 */
	public class ShipActRecvIf_Upd01 extends MSLAL_ShipActRecvIfService_MC_A.ShipActRecvIf_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			callShipActRecvIfUpd02();
		}
		
		/**
		 * 出荷実績受信ＩＦ取込２を実行する。
		 */
		protected void callShipActRecvIfUpd02() {
			
			MSLAL_ShipActRecvIfService.ShipActRecvIf_Upd02 ope = MSLAL_ShipActRecvIfService.crtShipActRecvIf_Upd02();
			
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
	 * ShipActRecvIf_Upd02オペレーション.<p>
	 *
	 * 出荷実績受信ＩＦ取込を行う。（ＩＦデータ確認、および出荷実績ＩＦ取込バッチから呼び出される）<br>
	 */
	public class ShipActRecvIf_Upd02 extends MSLAL_ShipActRecvIfService_MC_A.ShipActRecvIf_Upd02 {
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
		 * 出荷実績受信ＩＦリスト 
		 */
		MCList<MST_SHIP_ACT_RECV_IF_R> _shipActRecvIfL = null;
		
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
			
			logger().writeStartLog(MSLAL0159);
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
			
			logger().writeEndLog(MSLAL0160, _totalNum, _okNum, _errNum, _skipNum);
			pushEndLog(logger());
			// Loggerを新規作成した場合（呼出元からLoggerを引き継がない場合）のみクローズ
			if (_crtNewLogger) {
				logger().close();
			}
		}
		
		/**
		 * 出荷実績受信ＩＦデータを取得する。
		 */
		protected void preSrch() {
			_shipActRecvIfL = MCList.create(MST_SHIP_ACT_RECV_IF_R.class);
			MST_SHIP_ACT_RECV_IF_R t = MST_SHIP_ACT_RECV_IF_R.create("T");
			MCQueryApiBuilder shipActRecvIfL_bldr = MCQueryApiBuilder.create(t);
			
			srchDmlBuild(shipActRecvIfL_bldr);
			if (!up0().isEmpty()) {
				dbSelect("MSLAL6020_MST_SHIP_ACT_RECV_IF_S01", _shipActRecvIfL, shipActRecvIfL_bldr, up0());
			}
			else {
				dbSelect("MSLAL6020_MST_SHIP_ACT_RECV_IF_S02", _shipActRecvIfL, shipActRecvIfL_bldr);
			}
			
			if (up1().src_actlumprecv_flg()
					&& !up1().exe_unit_lump_flg()
					&& !_shipActRecvIfL.isEmpty()) {
		
				// 実績一括受信バッチから処理単位区分「まとめない」で実行されてきた場合のみ
				// 同一外部システムデータNOのレコードをまとめて処理する
				MCList<MST_SHIP_ACT_RECV_IF_R> dbc = MCList.create(MST_SHIP_ACT_RECV_IF_R.class);
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
				
				srchDmlBuild(dbc_bldr);
				
				dbc_bldr.setWhere(t.ext_data_no.eq(bind("ext_data_no")));
				dbc_bldr.addWhereWithAnd(t.ext_sys_cd.eq(bind("ext_sys_cd")));
				dbSelect("MSLAL6020_MST_SHIP_ACT_RECV_IF_S03", dbc, dbc_bldr, _shipActRecvIfL.groupBy( MST_ARR_ACT_RECV_IF_R.$ext_data_no, MST_ARR_ACT_RECV_IF_R.$ext_sys_cd));
		
				if (!dbc.isEmpty()) {
					_shipActRecvIfL.merge(dbc, dbc_bldr.getBaseDbc().getKeyColumn());
				}
			}
		}

		protected void srchDmlBuild(MCQueryApiBuilder builder) {
			MAM_SCM_IF_CTL_R m1 = MAM_SCM_IF_CTL_R.create("M1");
			PFT_SDRV_IF_R t2 = PFT_SDRV_IF_R.create("T2");
			MST_SHIP_ACT_RECV_IF_R t = MST_SHIP_ACT_RECV_IF_R.create(builder.getBaseDbcAlias());
		
			builder.addInnerJoin(m1, bracket( bracket( t.ship_loc_cd.eq(m1.loc_cd) .or(t.ship_fr_lg_grp_cd.eq(m1.lg_grp_cd)) ) .and(m1.if_proc_typ.eq(value(MAC_IF_PROC_TYP.WMS_SHIP_ACT_RECV.value()))) .and(m1.st_dt.lte(t.recv_dt)) .and(m1.end_dt.gte(t.recv_dt))));
			builder.addLeftOuterJoin(t2, t.data_no.eq(t2.data_no));
			
			builder.setWhere(value(0).eq(value(0)));
			builder.addWhereWithAnd(bracket( t2.sdrv_sts_typ.isNull()
							.or(t2.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.RECV_CONV_OK.value())))));
			builder.addWhereWithAnd(t.imp_flg.eq(value(true)));
			
			if (!up0().isEmpty()) {
				builder.addWhereWithCutOffAnd(t.data_lno.eq(bind("data_lno")));
				builder.addWhereWithCutOffAnd(t.data_no.eq(bind("data_no")));
				builder.addWhereWithCutOffAnd(t.ext_data_no.eq(bind("ext_data_no")));
				builder.addWhereWithCutOffAnd(t.ext_sys_cd.eq(bind("ext_sys_cd")));
			}
		}

		/**
		 * バッチ用の再引当処理のメイン処理
		 */
		protected void exe() {
		
			callShipActRecvIfUpd03();
		}
		
		/**
		 * スレッドを分割し、各スレッドごとに出荷実績受信ＩＦ取込３を実行する。
		 */
		protected void callShipActRecvIfUpd03() {

			// 呼出元のサービス実行番号を取得
			int no = object(MSLAL_SCMActRecvIfService.class)._execNo;

			MSLAL_ShipActRecvIfService.ShipActRecvIf_Upd03 upd03;

			List<MSLAL_ShipActRecvIfService.ShipActRecvIf_Upd03> opeL = new ArrayList<>();
			
			if (MCServerThreadManager.getLimitThreadSize() <= 1
					|| up1().src_actlumprecv_flg() && !MAC_IF_UPD_TYP.isSKIP_ERROR(up1().if_upd_typ())) {
				sort();

				upd03 = MSLAL_ShipActRecvIfService.crtShipActRecvIf_Upd03();
				upd03._no = no;
				setAll(upd03.up0(), _shipActRecvIfL, createMap_ShipActRecvIf_Upd03_DtlR_MST_SHIP_ACT_RECV_IF_R());
				upd03.up1().if_upd_typ(up1().if_upd_typ());
				upd03.up1().src_actlumprecv_flg(up1().src_actlumprecv_flg());
				opeL.add(upd03);

				MCServerThreadManager.setUseMainDBTran(true);
				MCServerThreadManager.invokeAndWait(1, opeL, FXBAL_BatchLogManager.class, MSLAL_SCMActRecvIfService.class);
			}
			else {
				for (MCList<MST_SHIP_ACT_RECV_IF_R> credGrpL : _shipActRecvIfL.groupList(MST_SHIP_ACT_RECV_IF_R.$ship_fr_lg_grp_cd)) {

					upd03 = MSLAL_ShipActRecvIfService.crtShipActRecvIf_Upd03();
					upd03._no = no++;
					setAll(upd03.up0(), credGrpL, createMap_ShipActRecvIf_Upd03_DtlR_MST_SHIP_ACT_RECV_IF_R());
					upd03.up1().if_upd_typ(up1().if_upd_typ());
					upd03.up1().src_actlumprecv_flg(up1().src_actlumprecv_flg());

					opeL.add(upd03);
				}
				if (!opeL.isEmpty()) {
					Collections.sort(opeL, new Comparator<MSLAL_ShipActRecvIfService.ShipActRecvIf_Upd03>() {
						@Override
						public int compare(MSLAL_ShipActRecvIfService.ShipActRecvIf_Upd03 o1, MSLAL_ShipActRecvIfService.ShipActRecvIf_Upd03 o2) {
							return (o1.up0().size() - o2.up0().size()) * -1;
						}
					});
					
					MCServerThreadManager.setCommitAndRollback(true);
					MCServerThreadManager.invokeAndWait(opeL, FXBAL_BatchLogManager.class, MSLAL_SCMActRecvIfService.class);
				}
			}
			for (MSLAL_ShipActRecvIfService.ShipActRecvIf_Upd03 ope: opeL) {
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
			_shipActRecvIfL.sort(
				MST_SHIP_ACT_RECV_IF_R.$data_make_dt,
				MST_SHIP_ACT_RECV_IF_R.$ext_sys_cd,
				MST_SHIP_ACT_RECV_IF_R.$ext_data_no,
				MST_SHIP_ACT_RECV_IF_R.$ext_data_lno
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
		
		protected Map_ShipActRecvIf_Upd03_DtlR_MST_SHIP_ACT_RECV_IF_R<ShipActRecvIf_Upd03_DtlR,MST_SHIP_ACT_RECV_IF_R> createMap_ShipActRecvIf_Upd03_DtlR_MST_SHIP_ACT_RECV_IF_R() {
			return new Map_ShipActRecvIf_Upd03_DtlR_MST_SHIP_ACT_RECV_IF_R<ShipActRecvIf_Upd03_DtlR, MST_SHIP_ACT_RECV_IF_R>();
		}

		public class Map_ShipActRecvIf_Upd03_DtlR_MST_SHIP_ACT_RECV_IF_R<D extends ShipActRecvIf_Upd03_DtlR, S extends MST_SHIP_ACT_RECV_IF_R> extends MCRowMapper<D,S>{
			@Override
			public void valueCopy(D dest, S src) {
				dest.sa(src);
			}
		}
	}
	/**
	 * ShipActRecvIf_Upd03オペレーション.<p>
	 *
	 * 出荷実績受信ＩＦ取込を行う。（マルチスレッド実行用）<br>
	 */
	public class ShipActRecvIf_Upd03 extends MSLAL_ShipActRecvIfService_MC_A.ShipActRecvIf_Upd03 {
		/**
		 * 出荷実績受信ＩＦ取込４を呼び出す際にデータＮＯ、出荷元物流グループの組み合わせを何件ずつ渡すかのパラメータ
		 */
		protected int _loopCnt = MCConst.app.getInteger("MS.MSLAL6020.loop_size", 100);
		
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
		 * ShipActRecvIf_Upd04バッチ呼び出しオペレーションから引き継ぐ
		 */
		protected FXBAL_BatchLogger _logger = null;
		
		/**
		 * インスタンス生成元（ShipActRecvIf_Upd03）でスレッド間でユニークな値を設定
		 */
		protected int _no = 0;
		
		/**
		 * ShipActRecvIf_Upd04の実行結果リスト
		 */
		protected MCList<ShipActRecvIf_Upd04_DtlR> _exeRslt = null;
		
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
		 * 出荷実績受信ＩＦ取込処理を実行する。
		 */
		protected void exe() {
			sort();

			int cnt = 0;
			
			MCList<MST_SHIP_ACT_RECV_IF_R> tgtL = MCList.create(MST_SHIP_ACT_RECV_IF_R.class);
			MST_SHIP_ACT_RECV_IF_R tgtL_t = MST_SHIP_ACT_RECV_IF_R.create("T");
			MCQueryApiBuilder tgtL_bldr = MCQueryApiBuilder.create(tgtL_t);
			MST_SHIP_ACT_RECV_IF_R oldR = MST_SHIP_ACT_RECV_IF_R.create();
			
			for (ShipActRecvIf_Upd03_DtlR dtlR : up0()) {
				
				MST_SHIP_ACT_RECV_IF_R keyR = dtlR.sa();
				
				if (isNextData(oldR, keyR)) {
					
					if (!tgtL.isEmpty() && _loopCnt <= cnt) {
						
						callShipActRecvIfUpd04(tgtL, tgtL_t, tgtL_bldr);
						cnt = 0;
						tgtL.clear();
					}
				}
				
				oldR = keyR;
				cnt++;
				tgtL.add(keyR);
			}
			
			if (!tgtL.isEmpty()) {
				
				callShipActRecvIfUpd04(tgtL, tgtL_t, tgtL_bldr);
			}
		}
		/**
		 * 上り電文をソートする。
		 */
		protected void sort() {
			up0().sort(
					ShipActRecvIf_Upd03_DtlR.$data_make_dt,
					ShipActRecvIf_Upd03_DtlR.$ext_sys_cd,
					ShipActRecvIf_Upd03_DtlR.$ext_data_no,
					ShipActRecvIf_Upd03_DtlR.$ship_inst_no,
					ShipActRecvIf_Upd03_DtlR.$ext_data_lno
			);
		}
		
		/**
		 * 出荷実績受信ＩＦを実行する。
		 * @param shipActRecvIfL 出荷実績受信ＩＦリスト
		 */
		protected void callShipActRecvIfUpd04(MCList<MST_SHIP_ACT_RECV_IF_R> shipActRecvIfL, MST_SHIP_ACT_RECV_IF_R list, MCQueryApiBuilder builder) {
			
			crtShipActRecvIfWk(shipActRecvIfL, list, builder);
			
			MCList<MST_SHIP_ACT_RECV_IF_R> exeL = srchLockShipActRecvIf();
			MCIndexKey idx = exeL.createIndex(MST_SHIP_ACT_RECV_IF_R.$data_lno);

			Set<List<String>> afterExtDataSet = srchAfterExtData(exeL);
			
			MSLAL_ShipActRecvIfService.ShipActRecvIf_Upd04 ope = MSLAL_ShipActRecvIfService.crtShipActRecvIf_Upd04();
			
			ShipActRecvIf_Upd04_DtlR upR = null;
			
			MCList<MST_SHIP_ACT_RECV_IF_R> skipL = MCList.create(MST_SHIP_ACT_RECV_IF_R.class);
			for (MST_SHIP_ACT_RECV_IF_R recvIfR : shipActRecvIfL) {
				MST_SHIP_ACT_RECV_IF_R exeR = exeL.getFirst(idx, recvIfR.data_lno());

				if (isNull(exeR) || isStopErr(exeR) || isChkUpdCntr(exeR)) {
					continue;
				}
				// 同一の処理グループでエラーが発生している場合、それ以降のデータは処理しない
				else if (isPrevErr(exeR)) {
					
					setErrSts(exeR);
					if (!isNull(exeR.ship_inst_no())) {
						MCMessagePool.add(exeR, null, MSLAL0161, exeR.data_no(), exeR.data_lno(), exeR.ship_fr_lg_grp_cd(), exeR.ship_inst_no());
					}
					else {
						MCMessagePool.add(exeR, null, MSLAL0652, exeR.data_no(), exeR.data_lno(), exeR.ship_fr_lg_grp_cd(), exeR.ext_sys_cd(), exeR.ext_ship_act_no());
					}
					skipL.add(exeR);
				}
				// 同一の処理グループで、新しいデータが既に処理されている場合、スキップする
				else if (isOkSkip(exeR, afterExtDataSet)) {
					
					setSkipSts(exeR);
					MCMessagePool.add(exeR, null, MSLAL0162, exeR.data_no(),exeR.data_lno(), exeR.ship_fr_lg_grp_cd(), exeR.ext_sys_cd(), exeR.ext_ship_act_no());
					skipL.add(exeR);
				}
				else {
					
					upR = ShipActRecvIf_Upd04_DtlR.create();
					upR.sa(exeR);
					upR.setParamIndex(exeR.getParamIndex());
					upR.setParamRowIndex(exeR.getParamRowIndex());
					ope.up0().add(upR);
				}
			}
			if (!ope.up0().isEmpty()) {
				ope.up1().if_upd_typ(up1().if_upd_typ());
				ope.exec();
			}
			
			mergeExeRslt(skipL, ope.down0());
			
			afterCall(exeL);
			
			delShipActRecvIfWk(shipActRecvIfL);
		}

		/**
		 * 「エラー行まで登録」の状態となっているか
		 */
		protected boolean isStopErr(MST_SHIP_ACT_RECV_IF_R r) {
			if (MAC_IF_UPD_TYP.isSTOP_ERROR(up1().if_upd_typ())
				&& object(CLAZZ)._stopErrSet.contains(r.ext_sys_cd())) {
				return true;
			}
			return false;
		}

		/**
		 * ＳＣＭ実績受信ＩＦ一括取込で取得したデータが更新されていないか
		 * 
		 * @param exeR 取込対象行
		 * @return 更新されている場合はtrue
		 */
		protected boolean isChkUpdCntr(MST_SHIP_ACT_RECV_IF_R exeR) {
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
		protected boolean isOkSkip(MST_SHIP_ACT_RECV_IF_R exeR, Set<List<String>> afterExtDataSet) {
			
			return afterExtDataSet.contains(createErrSetKey(exeR));
		}
		
		/**
		 * 出荷実績受信ＩＦのワークテーブルにデータを登録する。
		 * @param shipActRecvIfL 出荷実績受信ＩＦ
		 */
		protected void crtShipActRecvIfWk(MCList<MST_SHIP_ACT_RECV_IF_R> shipActRecvIfL, MST_SHIP_ACT_RECV_IF_R list, MCQueryApiBuilder builder) {
			
			dbWkDelete("MSLAL6020_MSW_SHIP_ACT_RECV_IF_D01", builder.getBaseDbc());
			dbWkInsert("MSLAL6020_MSW_SHIP_ACT_RECV_IF_I01", shipActRecvIfL, builder.getBaseDbc());
		}
		
		/**
		 * 出荷実績受信ＩＦをロックする。
		 */
		protected MCList<MST_SHIP_ACT_RECV_IF_R> srchLockShipActRecvIf() {
			MSW_SHIP_ACT_RECV_IF_KEY_R w1 = MSW_SHIP_ACT_RECV_IF_KEY_R.create("W1");
			PFT_SDRV_IF_R t2 = PFT_SDRV_IF_R.create("T2");
			MCList<MST_SHIP_ACT_RECV_IF_R> exeL = MCList.create(MST_SHIP_ACT_RECV_IF_R.class);
			MST_SHIP_ACT_RECV_IF_R t = MST_SHIP_ACT_RECV_IF_R.create("T");
			MCQueryApiBuilder exeL_bldr = MCQueryApiBuilder.create(t);
			
			exeL_bldr.addInnerJoin(w1, bracket( t.data_lno.eq(w1.data_lno)));
			exeL_bldr.addLeftOuterJoin(t2, t.data_no.eq(t2.data_no));
			
			exeL_bldr.setWhere(value(0).eq(value(0)));
			exeL_bldr.addWhereWithAnd(bracket( t2.sdrv_sts_typ.isNull()
							.or(t2.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.RECV_CONV_OK.value())))));
			exeL_bldr.addWhereWithAnd(t.imp_flg.eq(value(true)));
			exeL_bldr.addOrderByAsc(t.ext_data_no, t.ship_inst_no, t.ext_sys_cd, t.ext_ship_act_no);
			exeL_bldr.setLockTable(t.data_lno);
			
			dbSelectForUpdate("MSLAL6020_MST_SHIP_ACT_RECV_IF_S04", exeL, exeL_bldr);
			for (MST_SHIP_ACT_RECV_IF_R exeR : exeL) {
				
				// log_sub_key1にスレッド間でユニークな値を設定
				exeR.setParamIndex(_no);
			}
			
			_logger.setLogKey(exeL,
					MST_SHIP_ACT_RECV_IF_R.$batch_log_no,
					MST_SHIP_ACT_RECV_IF_R.$log_sub_key1,
					MST_SHIP_ACT_RECV_IF_R.$log_sub_key2);
			
			return exeL;
		}
		
		/**
		 * 同一キーで取込対象より新しいかつ処理済みのデータを取得する。
		 * @param exeL 取込対象リスト
		 * @return 処理済みデータリスト
		 */
		protected Set<List<String>> srchAfterExtData(MCList<MST_SHIP_ACT_RECV_IF_R> exeL) {
			MCList<MST_SHIP_ACT_RECV_IF_R> afterL = MCList.create(MST_SHIP_ACT_RECV_IF_R.class);
			MST_SHIP_ACT_RECV_IF_R t = MST_SHIP_ACT_RECV_IF_R.create("T");
			MCQueryApiBuilder afterL_bldr = MCQueryApiBuilder.create(t);
			MST_SHIP_ACT_RECV_IF_R S1ST = MST_SHIP_ACT_RECV_IF_R.create("ST");
			
			afterL_bldr.setSelect(t.ship_fr_lg_grp_cd, t.ship_inst_no, t.ext_sys_cd, t.ext_ship_act_no);
			afterL_bldr
					.addConstWhereWithAnd(exists(subQuery().select(value("X")).from(S1ST)
							.where(t.ext_data_no.lt(S1ST.ext_data_no)
									.and(t.ship_fr_lg_grp_cd.eq(S1ST.ship_fr_lg_grp_cd))
									.and(t.ext_sys_cd.eq(S1ST.ext_sys_cd))
									.and(t.ext_ship_act_no.eq(S1ST.ext_ship_act_no))
									.and(S1ST.exe_sts_typ.in(
											value(MAC_EXE_STS_TYP.OK.value()),
											value(MAC_EXE_STS_TYP.SKP.value()))))));
			dbSelectColumn("MSLAL6020_MST_SHIP_ACT_RECV_IF_S05", afterL, afterL_bldr, exeL, MST_SHIP_ACT_RECV_IF_R.$data_lno);

			Set<List<String>> set = new HashSet<List<String>>();
			for (MST_SHIP_ACT_RECV_IF_R afterR : afterL) {
				
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
		 * @param downL ShipActRecvIf_Upd04の下り電文
		 */
		protected void mergeExeRslt(MCList<MST_SHIP_ACT_RECV_IF_R> skipL, MCList<ShipActRecvIf_Upd04_DtlR> downL) {
			
			_exeRslt = MCList.create(ShipActRecvIf_Upd04_DtlR.class);
			_exeRslt.setAll(downL);
			
			ShipActRecvIf_Upd04_DtlR dtlR = null;
			
			for (MST_SHIP_ACT_RECV_IF_R skipR : skipL) {
				
				dtlR = ShipActRecvIf_Upd04_DtlR.create();
				dtlR.data_lno(skipR.data_lno());
				dtlR.exe_sts_typ(skipR.exe_sts_typ());
				_exeRslt.add(dtlR);
			}
		}
		
		/**
		 * 出荷実績受信ＩＦ取込の後処理。
		 * @param exeL 取込対象リスト
		 */
		protected void afterCall(MCList<MST_SHIP_ACT_RECV_IF_R> exeL) {
			
			rsltCnt(exeL);
			
			updIf(exeL);
			
			MCMessageList msgList = MCMessagePool.getMessageList();
			_logger.writeDataLog(msgList);
			
			dbTran().commit();
			
			msgList.clear();
		}

		/**
		 * 出荷実績受信ＩＦを更新する。
		 * @param exeL 取込対象リスト
		 */
		protected void updIf(MCList<MST_SHIP_ACT_RECV_IF_R> exeL) {
			
			MST_SHIP_ACT_RECV_IF_R t = MST_SHIP_ACT_RECV_IF_R.create("T");
			MCQueryApiBuilder exeL_bldr = MCQueryApiBuilder.create(t);
			exeL_bldr.setSet(t.imp_flg, t.exe_sts_typ, t.batch_log_no, t.log_sub_key1, t.log_sub_key2);
			
			dbUpdateKey("MSLAL6020_MST_SHIP_ACT_RECV_IF_U01", exeL, exeL_bldr);
		}

		/**
		 * 取込結果の件数を算出する。
		 * @param exeL 取込対象リスト
		 */
		protected void rsltCnt(MCList<MST_SHIP_ACT_RECV_IF_R> exeL) {
			
			MCIndexKey idxkey = _exeRslt.createIndex(ShipActRecvIf_Upd03_DtlR.$data_lno);
			
			for (MST_SHIP_ACT_RECV_IF_R exeR : exeL) {
				
				ShipActRecvIf_Upd04_DtlR exeRslt = _exeRslt.getFirst(idxkey, exeR.data_lno());
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
		protected void setSkipSts(MST_SHIP_ACT_RECV_IF_R exeR) {

			exeR.exe_sts_typ(MAC_EXE_STS_TYP.SKP.value());
		}
		
		/**
		 * 処理結果区分にエラーを設定する。
		 * 
		 * @param exeR 取込対象行
		 */
		protected void setErrSts(MST_SHIP_ACT_RECV_IF_R exeR) {

			exeR.exe_sts_typ(MAC_EXE_STS_TYP.ERR.value());
			setErrSet(exeR);
		}
		
		/**
		 * 引数で渡された比較対象が同一取込単位かどうか。
		 * @param preR 前の取込対象
		 * @param exeR　取込対象
		 * @return 取込単位のいずれかが異なる場合はtrue
		 */
		protected boolean isNextData(MST_SHIP_ACT_RECV_IF_R preR, MST_SHIP_ACT_RECV_IF_R exeR) {
			
			return !(isSame(preR.ext_data_no(), exeR.ext_data_no())
					&& isSame(preR.ship_fr_lg_grp_cd(), exeR.ship_fr_lg_grp_cd())
					&& isSame(preR.ship_inst_no(), exeR.ship_inst_no())
					&& (isNull(preR.ship_inst_no()) || isSame(preR.ext_ship_act_no(), exeR.ext_ship_act_no())));
		}
		
		/**
		 * 出荷実績受信ＩＦワークテーブルのデータを削除する。
		 * @param shipActRecvIfL 出荷実績受信ＩＦリスト
		 */
		protected void delShipActRecvIfWk(MCList<MST_SHIP_ACT_RECV_IF_R> shipActRecvIfL) {
			MST_SHIP_ACT_RECV_IF_R t = MST_SHIP_ACT_RECV_IF_R.create("T");
			MCQueryApiBuilder shipActRecvIfL_bldr = MCQueryApiBuilder.create(t);

			dbWkDelete("MSLAL6020_MSW_SHIP_ACT_RECV_IF_D02", shipActRecvIfL_bldr.getBaseDbc());
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
	 * ShipActRecvIf_Upd04オペレーション.<p>
	 *
	 * 出荷実績受信ＩＦ取込を行う。（MSBEL5630_出荷実績受信ＩＦサービスを呼び出す本処理）<br>
	 */
	public class ShipActRecvIf_Upd04 extends MSLAL_ShipActRecvIfService_MC_A.ShipActRecvIf_Upd04 {
		/**
		 * 出荷実績受信ＩＦ取込チェックオペレーション
		 */
		protected MSLAL_ShipActRecvIfService.ShipActRecvIf_Chk01 _shipActRecvIfChk = null;
		
		/**
		 * MSBEL5630_出荷実績受信ＩＦサービスの登録オペレーション
		 */
		protected MSBEL_ShipActRcptIFService.ShipActIF_Upd01 _upd01Serv = null;
		
		/**
		 * MSBEL5630_出荷実績受信ＩＦサービスの実行前のメッセージリスト
		 */
		protected MCMessageList _beforeCallServMsgList = null;
		
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
			up0().setString(ShipActRecvIf_Upd04_DtlR.$exe_sts_typ, MAC_EXE_STS_TYP.NOT_EXE.value());
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
			MCList<ShipActRecvIf_Upd04_DtlR>[] grp = getGrp();
			
			MCMessageList msgList = new MCMessageList();
			msgList.addAll(MCMessagePool.getMessageList());

			for (MCList<ShipActRecvIf_Upd04_DtlR> shipActRecvIfL : grp) {

				shipActRecvIfL = shipActRecvIfL.subList(r -> !isStopErr(r));
				if (shipActRecvIfL.isEmpty()) {
					continue;
				}
				
				// 異なる受注の間に影響が発生しないように、メッセージプールをクリアする
				MCMessagePool.clear();
				
				callThisChk01(shipActRecvIfL);
				
				msgList.addAll(MCMessagePool.getMessageList());
				
				if (_shipActRecvIfChk.down1().isEmpty()) {
					continue;
				}
				// 計画外でエラーではないレコードを取込するので、メッセージプールをクリアする
				// （メッセージプールをクリアしないと、後続処理でエラーが発生するため）
				MCMessagePool.clear();
				
				try {
					sp = setSavepoint();
					callShipActRcptIFService(shipActRecvIfL);
				}
				catch (Exception ex) {
					handleEx(ex, sp, shipActRecvIfL);
				}
				finally {
					sp = null;
					msgList.addAll(lnkCredMsgToIf(MCMessagePool.getMessageList(), shipActRecvIfL));
				}
			}
			
			MCMessagePool.clear();
			MCMessagePool.addAll(msgList);
		}

		/**
		 * 出荷実績受信ＩＦ取込チェックを実行する。
		 * @param shipActRecvIfL 出荷実績受信ＩＦリスト
		 */
		protected void callThisChk01(MCList<ShipActRecvIf_Upd04_DtlR> shipActRecvIfL) {
			
			_shipActRecvIfChk = MSLAL_ShipActRecvIfService.crtShipActRecvIf_Chk01();
			setAll(_shipActRecvIfChk.up0(), shipActRecvIfL, createMap_ShipActRecvIf_Chk01_DtlR_ShipActRecvIf_Upd04_DtlR());
			_shipActRecvIfChk.exec();
			
			MCIndexKey idxkey = _shipActRecvIfChk.down0().createIndex(ShipActRecvIf_Chk01_DtlR.$data_lno);
			
			for (ShipActRecvIf_Upd04_DtlR dtlR : shipActRecvIfL) {
				ShipActRecvIf_Chk01_DtlR chkRsltR = _shipActRecvIfChk.down0().getFirst(idxkey, dtlR.data_lno());
				
				dtlR.uplnd_flg(chkRsltR.uplnd_flg());
				dtlR.hdr_dtl_peg_no(chkRsltR.hdr_dtl_peg_no());
				
				if (chkRsltR.err_flg()) {
					setErrSts(dtlR.sa());
				}
			}
			chkPrevErr(shipActRecvIfL);
		}
		
		/**
		 * MSBEL5630_出荷実績受信ＩＦサービスを実行する。
		 * @param shipActRecvIfL 出荷実績受信ＩＦリスト
		 */
		protected void callShipActRcptIFService(MCList<ShipActRecvIf_Upd04_DtlR> shipActRecvIfL) {
			
			callShipActRcptIFServiceUpd01(shipActRecvIfL);
			
			setOk(shipActRecvIfL);
		}
		
		/**
		 * MSBEL5630_出荷実績受信ＩＦサービスの登録を実行する。
		 * @param shipActRecvIfL 出荷実績受信ＩＦリスト
		 */
		protected void callShipActRcptIFServiceUpd01(MCList<ShipActRecvIf_Upd04_DtlR> shipActRecvIfL) {
			
			_beforeCallServMsgList = (MCMessageList)MCMessagePool.getMessageList().clone();
			
			_upd01Serv = MSBEL_ShipActRcptIFService.crtShipActIF_Upd01();
			
			copyall(_upd01Serv.up0(), _shipActRecvIfChk.down1());
			_upd01Serv.up1().setAll(_shipActRecvIfChk.down2());
			_upd01Serv.up2().setAll(_shipActRecvIfChk.down3());
			_upd01Serv.up3().setAll(_shipActRecvIfChk.down4());

			_upd01Serv.exec();
			
			setShipActRcptIFServiceChk01Err(shipActRecvIfL);
			MAUCL_RevDataService.RevData_Upd02 revServ = MAUCL_RevDataService.crtRevData_Upd02();
			revServ.exec();
		}
		
		/**
		 * MSBEL5630_出荷実績受信ＩＦサービスの登録チェック結果を出荷実績受信ＩＦに反映する。
		 * @param shipActRecvIfL 出荷実績受信ＩＦリスト
		 */
		protected void setShipActRcptIFServiceChk01Err(MCList<ShipActRecvIf_Upd04_DtlR> shipActRecvIfL) {
			
			MCMessageList msgL = MCMessagePool.getMessageList();
			
			for (MCMessage msg :msgL) {
				
				if (!_beforeCallServMsgList.contains(msg) && isErrMsg(msg)) {
					// 出荷実績受信ＩＦサービスの実行前のリストに存在しないかつエラーメッセージの場合、処理結果をエラーに設定する
					
					MCRow causeRow = msg.getCauseRow();
					
					for (ShipActRecvIf_Upd04_DtlR dtlR : shipActRecvIfL) {
						
						if (isNull(causeRow) 
								|| (causeRow.getParamIndex() == dtlR.getParamIndex()
									&& causeRow.getParamRowIndex() == dtlR.getParamRowIndex())) {
							
							setErrSts(dtlR.sa());
						}
					}
				}
			}
			
			chkGrpErr(shipActRecvIfL);
		}

		/**
		 * 更新処理例外発生時の後処理を行う。
		 * @param ex 例外
		 * @param sp セーブポイント
		 * @param shipActRecvIfL 出荷実績受信ＩＦリスト
		 */
		protected void handleEx(Exception ex, MCSavepoint sp, MCList<ShipActRecvIf_Upd04_DtlR> shipActRecvIfL) {

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

			for (ShipActRecvIf_Upd04_DtlR opeRow : shipActRecvIfL) {
				
				MCMessagePool.add(opeRow, null, MSLAL0163, opeRow.data_no(), opeRow.data_lno(), msgId, msg);
				for (MCMessage causeMsg : causeMsgList) {
					MCMessage newMsg = new MCMessage(opeRow, null, causeMsg.getID(), (Object[])causeMsg.getBindArray());
					MCMessagePool.add(newMsg);
				}
				
				setErr(opeRow.sa());
			}
			
			if (sp != null) {
				
				dbTran().rollback(sp);
			}
		}
		protected MCMessageList lnkCredMsgToIf(MCMessageList msgPool, MCList<ShipActRecvIf_Upd04_DtlR> shipActRecvIfL) {
			// メッセージを紐付ける対象はエラーが発生していないＩＦデータのみ
			MCList<ShipActRecvIf_Upd04_DtlR> ifL = shipActRecvIfL.subList(r -> !isErr(r.sa()));
			if (ifL.isEmpty()) {
				return msgPool;
			}
			
			// 与信管理先ごとにグループ分けしたIFデータ
			java.util.Map<String, MCList<ShipActRecvIf_Upd04_DtlR>> credMap = getCredMap(ifL);
			
			// 与信サービスで発生したメッセージをＩＦデータに紐付ける
			MCMessageList msgL = new MCMessageList();
			for (MCMessage msg : msgPool) {
				if (isCredMsg(msg)
						&& !isNull(msg.getCauseRow())
						&& !isNull(credMap.get(msg.getCauseRow().getStringNE("cred_cd")))) {
					credMap.get(msg.getCauseRow().getStringNE("cred_cd")).forEach(ifR -> {
						msgL.add(new MCMessage(ifR, null, msg.getID(), (Object[])msg.getBindArray()));
					});
				}
				else {
					msgL.add(msg);
				}
			}
			return msgL;
		}
		protected boolean isCredMsg(MCMessage msg) {
			return isSame(msg.getID(), MSBGL0026);
		}
		protected java.util.Map<String, MCList<ShipActRecvIf_Upd04_DtlR>> getCredMap(MCList<ShipActRecvIf_Upd04_DtlR> shipActRecvIfL) {
			// 納品書ヘッダの持つ取引先CDを取得
			MCList<MST_DLV_SLIP_R> rsltL = getDlvList();
			MCIndexKey dlvIdx = rsltL.createIndex(MST_DLV_SLIP_R.$dlv_slip_no);
			
			// 出荷実績ＩＦサービスの電文からＩＦデータに対応する明細を取得する
			Function<ShipActRecvIf_Upd04_DtlR, MCRow> upd01DwnR = ifR -> {
				for (MCRow r : _upd01Serv.v2_down1) {
					if (r.getParamIndex() == ifR.getParamIndex()
						&& r.getParamRowIndex() == ifR.getParamRowIndex()) {
						return r;
					}
				}
				return null;
			};
			
			// 与信管理先ごとにメッセージに紐付けるＩＦデータのリストを作成する
			Map<String, MCList<ShipActRecvIf_Upd04_DtlR>> credMap = new HashMap<>(); 
			for (ShipActRecvIf_Upd04_DtlR ifR : shipActRecvIfL) {
				MCRow downR = upd01DwnR.apply(ifR);
				if (!isNull(downR)) {
					MST_DLV_SLIP_R dlvR = rsltL.getFirst(dlvIdx, downR.getStringNE("dlv_slip_no"));
					
					String credCd = getCredCd(dlvR.bp_cd());
					if (!credMap.containsKey(credCd)) {
						credMap.put(credCd, MCList.create(ShipActRecvIf_Upd04_DtlR.class));
					}
					credMap.get(credCd).add(ifR);
				}
			}
			
			return credMap;
		}
		protected MCList<MST_DLV_SLIP_R> getDlvList() {
			MST_DLV_SLIP_R t = MST_DLV_SLIP_R.create("T");
			MST_DLV_SLIP_R w = MST_DLV_SLIP_R.create("W");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(t.dlv_slip_no, t.bp_cd);
			bldr.setWhere(t.dlv_slip_no.eq(bind("dlv_slip_no")));
			bldr.addConstWhereWithAnd(
				t.dlv_slip_seq.eq(subQuery().select(max(w.dlv_slip_seq)).from(w).where(w.dlv_slip_no.eq(t.dlv_slip_no)))
			);
			MCList<MST_DLV_SLIP_R> rsltL = MCList.create(MST_DLV_SLIP_R.class);
			dbSelect("MSLAL6020_MST_DLV_SLIP_S01", rsltL, bldr, _upd01Serv.v2_down1.groupBy("dlv_slip_no"));
			return rsltL;
		}
		protected FXUCL_MCFuncCache<String> _credCache;
		protected String getCredCd(String cstCd) {
			if (_credCache == null) {
				_credCache = new FXUCL_MCFuncCache<>(in -> {
					return MAPA_BP$F_GET_CRED_OF_CST(value((String) in[0]));
				});
			}
			return _credCache.get(cstCd);
		}
		
		/**
		 * 同一取込単位のうち、エラーが存在するかどうかチェックする。<br>
		 * 一部でもエラーがあったら全てエラーとする。
		 * @param shipActRecvIfL 出荷実績受信ＩＦリスト
		 */
		protected void chkGrpErr(MCList<ShipActRecvIf_Upd04_DtlR> shipActRecvIfL) {

			// ヘッダ単位でグループエラー
			for (MCList<ShipActRecvIf_Upd04_DtlR> uplndL : shipActRecvIfL.groupList(ShipActRecvIf_Upd04_DtlR.$hdr_dtl_peg_no)) {
				
				MCIndexKey exeStsTypIdxkey = uplndL.createIndex(ShipActRecvIf_Upd04_DtlR.$exe_sts_typ);
				
				if (uplndL.contains(exeStsTypIdxkey, MAC_EXE_STS_TYP.ERR.value())) {
					
					for (ShipActRecvIf_Upd04_DtlR shipActRecvIfR : uplndL) {
					
						if (!isErr(shipActRecvIfR.sa())) {
							
							MCMessagePool.add(shipActRecvIfR, null, MSLAL0204, 
									shipActRecvIfR.data_no(), 
									shipActRecvIfR.data_lno(), 
									shipActRecvIfR.ship_fr_lg_grp_cd(), 
									toYMDHMString(shipActRecvIfR.sa().ship_tm()),
									toYMDHMString(shipActRecvIfR.sa().dlv_tm()),
									shipActRecvIfR.sa().cst_cd(),
									shipActRecvIfR.sa().rqst_dpt_cd(),
									shipActRecvIfR.sa().rqst_usr_cd(),
									shipActRecvIfR.sa().ship_dpt_cd(),
									shipActRecvIfR.sa().ship_usr_cd(),
									shipActRecvIfR.sa().ship_to_id_typ(),
									shipActRecvIfR.sa().ship_to_id_cd());
							
							setErr(shipActRecvIfR.sa());
						}
					}
				}
			}
		}

		protected void chkPrevErr(MCList<ShipActRecvIf_Upd04_DtlR> shipActRecvIfL) {

			for (ShipActRecvIf_Upd04_DtlR shipActRecvIfR : shipActRecvIfL) {
				if (!isErr(shipActRecvIfR.sa())) {
					if (isPrevErr(shipActRecvIfR.sa())) {
						setErrSts(shipActRecvIfR.sa());
						MCMessagePool.add(shipActRecvIfR, null, MSLAL0652, shipActRecvIfR.data_no(), shipActRecvIfR.data_lno(), 
								shipActRecvIfR.ship_fr_lg_grp_cd(), shipActRecvIfR.sa().ext_sys_cd(), shipActRecvIfR.sa().ext_ship_act_no());
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
		 * 「エラー行まで登録」の状態となっているか
		 */
		protected boolean isStopErr(ShipActRecvIf_Upd04_DtlR r) {
			if (MAC_IF_UPD_TYP.isSTOP_ERROR(up1().if_upd_typ())
				&& object(CLAZZ)._stopErrSet.contains(r.sa().ext_sys_cd())) {
				return true;
			}
			return false;
		}

		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			
			down0().setAll(up0());
		}

		/**
		 * 取込単位で出荷実績受信ＩＦ情報をグループ化する。
		 * @return 取込単位のグループ
		 */
		@SuppressWarnings("unchecked")	// 総称配列の警告回避
		protected MCList<ShipActRecvIf_Upd04_DtlR>[] getGrp() {
			
			List<MCList<ShipActRecvIf_Upd04_DtlR>> arr = new ArrayList<>();
			ShipActRecvIf_Upd04_DtlR bkR = null;
			MCList<ShipActRecvIf_Upd04_DtlR> lst = null;

			for (ShipActRecvIf_Upd04_DtlR r : up0()) {
				if (isNull(bkR) || !r.equalColumns(bkR, getGrpKey())) {
					lst = MCList.create(ShipActRecvIf_Upd04_DtlR.class);
					arr.add(lst);
				}
				lst.add(r);
				bkR = r;
			}
			
			return arr.toArray(new MCList[arr.size()]);
		}

		/**
		 * 処理結果区分に処理済を設定する。
		 * @param shipActRecvIfL 出荷実績受信ＩＦリスト
		 */
		protected void setOk(MCList<ShipActRecvIf_Upd04_DtlR> shipActRecvIfL) {
			
			for (ShipActRecvIf_Upd04_DtlR shipActRecvIfR : shipActRecvIfL) {
				
				if (!isErr(shipActRecvIfR.sa())) {
					shipActRecvIfR.exe_sts_typ(MAC_EXE_STS_TYP.OK.value());
				}
			}
		}
		
		/**
		 * 処理結果区分にエラーを設定する。
		 * @param shipActRecvIfR 出荷実績受信ＩＦ
		 */
		protected void setErr(MST_SHIP_ACT_RECV_IF_R shipActRecvIfR) {
			setErrSts(shipActRecvIfR);
		}
		
		/**
		 * 出荷実績受信ＩＦの処理結果区分がエラーかどうか。
		 * @param shipActRecvIfR 出荷実績受信ＩＦ
		 * @return 処理結果区分がエラーはtrue
		 */
		protected boolean isErr(MST_SHIP_ACT_RECV_IF_R shipActRecvIfR) {
			
			return MAC_EXE_STS_TYP.isERR(shipActRecvIfR.exe_sts_typ());
		}
		
		/**
		 * 同一取込グループのキーを返す。
		 * @return 同一取込グループのキー
		 */
		protected String[] getGrpKey() {
			
			return new String[] { 
					ShipActRecvIf_Upd04_DtlR.$ext_data_no,
					"sa.ext_sys_cd",
					ShipActRecvIf_Upd04_DtlR.$ship_fr_lg_grp_cd,
					ShipActRecvIf_Upd04_DtlR.$ship_inst_no};
		}
		
		protected Map_ShipActRecvIf_Chk01_DtlR_ShipActRecvIf_Upd04_DtlR<ShipActRecvIf_Chk01_DtlR,ShipActRecvIf_Upd04_DtlR> createMap_ShipActRecvIf_Chk01_DtlR_ShipActRecvIf_Upd04_DtlR() {
			return new Map_ShipActRecvIf_Chk01_DtlR_ShipActRecvIf_Upd04_DtlR<ShipActRecvIf_Chk01_DtlR, ShipActRecvIf_Upd04_DtlR>();
		}

		public class Map_ShipActRecvIf_Chk01_DtlR_ShipActRecvIf_Upd04_DtlR<D extends ShipActRecvIf_Chk01_DtlR, S extends ShipActRecvIf_Upd04_DtlR> extends MCRowMapper<D,S>{
			@Override
			public void valueCopy(D dest, S src) {
				
				dest.sa(src.sa());
				dest.setParamIndex(src.sa().getParamIndex());
				dest.setParamRowIndex(src.sa().getParamRowIndex());
			}
		}
	}
	/**
	 * ShipActRecvIf_Chk01オペレーション.<p>
	 *
	 * 出荷実績受信ＩＦ取込を行う前のチェック処理<br>
	 */
	public class ShipActRecvIf_Chk01 extends MSLAL_ShipActRecvIfService_MC_A.ShipActRecvIf_Chk01 {
		
		/**
		 * 出荷実績ヘッダリスト
		 */
		protected MCList<MST_SHIP_ACT_R> _shipActL = null;
		
		/**
		 * 出荷実績明細リスト
		 */
		protected MCList<MST_SHIP_ACT_D_R> _shipActDL = null;
		
		/**
		 * 出荷指図ヘッダリスト
		 */
		protected MCList<MST_SHIP_INST_R> _shipInstL = null;
		
		/**
		 * 出荷指図明細リスト
		 */
		protected MCList<MST_SHIP_INST_D_R> _shipInstDL = null;
		
		/**
		 * 出荷引当状況リスト
		 */
		protected MCList<MST_SHIP_ALLOC_STS_R> _shipAllocStsL = null;
		
		/**
		 * 出荷実績ヘッダのインデックス
		 */
		protected MCIndexKey _shipActIdxkey = null;
		
		/**
		 * 出荷実績明細のインデックス
		 */
		protected MCIndexKey _shipActDIdxkey = null;
		
		/**
		 * 出荷実績明細の(外部出荷実績ＮＯ)インデックス
		 */
		protected MCIndexKey _extShipActNoIdxkey = null;
		
		/**
		 * 出荷実績受信ＩＦのインデックス
		 */
		protected MCIndexKey _shipActRecvIfIdxkey = null;
		
		/**
		 * 出荷指図ヘッダのインデックス
		 */
		protected MCIndexKey _shipInstIdxkey = null;
		
		/**
		 * 出荷指図明細のインデックス
		 */
		protected MCIndexKey _shipInstDIdxkey = null;
		
		/**
		 * 出荷引当状況のインデックス
		 */
		protected MCIndexKey _shipAllocStsIdxkey = null;
		
		/**
		 * 外部システムマスタのキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_EXT_SYS_R> _extSysCache = null;
		
		/** 
		 * 品目マスタ のキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache = null;
		
		/**
		 * 業務理由マスタ のキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_BIZ_RSN_R> _bizRsnCache = null;
		
		/**
		 * 納品先のキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_BP_R> _dlvCache = null;
		
		/** 
		 * ロット・サブロットリスト のキャッシュ
		 */
		protected FXUCL_MCDbcCache<MSVT_LOT_LIST_R> _lotListCache = null;
		
		/**
		 * 出荷実績が分割されたことにより、新規登録用の出荷実績受信ＩＦを格納するリスト
		 */
		protected MCList<ShipActRecvIf_Chk01_DtlR> _shipActSplitInsIfL = null;
		
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
			
			setPegNo(up0());
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			chkPrevErr();
			
			chkGrpErr();
			
			preCompl();
			
			crtCache();
			
			compl();
			
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheck() {
			
			MCMessageList msgL = super.doServerCheck();
			
			getShipInstInfo();
			
			getShipActInfo();
			
			getShipAllocSts();
			
			sortDtl(up0());
			
			setUplndFlg(up0());
			
			msgL.addAll(chkReq(up0()));
			
			msgL.addAll(chkDuplicate(up0()));
			
			msgL.addAll(chkShipInst(up0()));
			
			msgL.addAll(chkShipAct(up0()));
			
			msgL.addAll(chkItm(up0()));
			
			msgL.addAll(chkIv(up0()));
			
			msgL.addAll(chkShipAllocSts(up0()));
			
			msgL.addAll(chkShipInstD(up0()));
			
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			
			MCMessageList msgL = super.doServerCheckSub();
			
			MCList<ShipActRecvIf_Chk01_DtlR> chkList = getChkList(up0());
			
			if (!isNull(chkList)) {
				
				beforeChkCompl(chkList);
				
				msgL.addAll(chkShipTo(chkList));
				
				msgL.addAll(chkLoc(chkList));
				
				msgL.addAll(chkStrLn(chkList));
			}
			
			return msgL;
		}
		
		/**
		 * 出荷指図関連情報を取得する。
		 */
		protected void getShipInstInfo() {
			
			getShipInst();
			
			getShipInstD();
		}
		
		/**
		 * 出荷指図ヘッダを取得する。
		 */
		protected void getShipInst() {
			MST_IV_R t2 = MST_IV_R.create("T2");
			
			_shipInstL = MCList.create(MST_SHIP_INST_R.class);
			MST_SHIP_INST_R t = MST_SHIP_INST_R.create("T");
			MCQueryApiBuilder shipInstL_bldr = MCQueryApiBuilder.create(t);
			
			_shipInstL.addBooleanColumn(MST_IV_R.$iv_ship_flg);
			shipInstL_bldr.addSelect(t2.iv_ship_flg, t2.iv_mng_no);
			
			shipInstL_bldr.addLeftOuterJoin(t2, t.iv_no.eq(t2.iv_no));
			shipInstL_bldr.setWhere(t.ship_inst_no.eq(bind("ship_inst_no")));
			shipInstL_bldr.setWhere(t.ship_inst_no.eq(bind("ship_inst_no")));
			
			shipInstL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			shipInstL_bldr.setOrderByAsc(t.ship_inst_no);
			shipInstL_bldr.setLockTable(t.ship_inst_no);
			
			dbSelectForUpdate("MSLAL6020_MST_SHIP_INST_S01", _shipInstL, shipInstL_bldr, up0().groupBy(ShipActRecvIf_Chk01_DtlR.$ship_inst_no));
			
			lockIv();
			
			_shipInstIdxkey = _shipInstL.createIndex(MST_SHIP_INST_R.$ship_inst_no);
		}
		
		protected void lockIv() {
			MCList<MST_IV_R> ivBindL = MCList.create(MST_IV_R.class);
			for (MST_SHIP_INST_R selR : _shipInstL) {
				String ivMngNo = selR.getStringNE(MST_IV_R.$iv_mng_no);
				if (!isNull(ivMngNo)) {
					MST_IV_R tmp = MST_IV_R.create();
					tmp.iv_mng_no(ivMngNo);
					ivBindL.add(tmp);
				}
			}
			if (!ivBindL.isEmpty()) {
				MST_IV_R t = MST_IV_R.create("T");
				MCQueryApiBuilder ivBuilder = MCQueryApiBuilder.create(t);
				ivBuilder.setSelect(t.iv_mng_no);
				ivBuilder.setOrderByAsc(t.iv_mng_no);
				dbSelectKeyForUpdateNoFetch("MSLAL6020_MST_IV_S01", ivBuilder, ivBindL);
			}
		}
		
		/**
		 * 引数に指定された出荷指図ＮＯで出荷指図ヘッダを取得する。
		 * @param shipInstNo 出荷指図ＮＯ
		 * @return 出荷指図ヘッダ
		 */
		protected MST_SHIP_INST_R getShipInst(String shipInstNo) {
			
			return _shipInstL.getFirst(_shipInstIdxkey, shipInstNo);
		}
		
		/**
		 * 出荷指図明細を取得する。
		 */
		protected void getShipInstD() {
			
			MST_SHIP_INST_R t2 = MST_SHIP_INST_R.create("T2");
			_shipInstDL = MCList.create(MST_SHIP_INST_D_R.class);
			MST_SHIP_INST_D_R t = MST_SHIP_INST_D_R.create("T");
			MCQueryApiBuilder shipInstDL_bldr = MCQueryApiBuilder.create(t);
			
			shipInstDL_bldr.addInnerJoin(t2, t.ship_inst_no.eq(t2.ship_inst_no));
			shipInstDL_bldr.setWhere(t.ship_inst_no.eq(bind("ship_inst_no")));
			shipInstDL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			
			shipInstDL_bldr.setLockTable(t.ship_inst_no);
			dbSelectForUpdate("MSLAL6020_MST_SHIP_INST_D_S01", _shipInstDL, shipInstDL_bldr, _shipInstL.groupBy(MST_SHIP_INST_R.$ship_inst_no));
			
			_shipInstDIdxkey = _shipInstDL.createIndex(MST_SHIP_INST_D_R.$ship_inst_d_no);
		}
		
		/**
		 * 引数に指定された出荷指図明細ＮＯで出荷指図明細を取得する。
		 * @param shipInstDNo 出荷指図明細ＮＯ
		 * @return 出荷指図明細
		 */
		protected MST_SHIP_INST_D_R getShipInstD(String shipInstDNo) {
			
			 return _shipInstDL.getFirst(_shipInstDIdxkey, shipInstDNo);
		}
		
		/**
		 * 出荷実績関連情報を取得する。
		 */
		protected void getShipActInfo() {
			
			getShipAct();
			
			getShipActD();
		}
		
		/**
		 * 出荷実績ヘッダを取得する。
		 */
		protected void getShipAct() {
			
			MST_SHIP_ACT_D_R t2 = MST_SHIP_ACT_D_R.create("T2");

			_shipActL = MCList.create(MST_SHIP_ACT_R.class);
			MST_SHIP_ACT_R t = MST_SHIP_ACT_R.create("T");
			MCQueryApiBuilder shipActL_bldr = MCQueryApiBuilder.create(t);
			
			shipActL_bldr.addInnerJoin(t2, t.ship_act_no.eq(t2.ship_act_no));
			
			shipActL_bldr.setWhere(t2.ext_sys_cd.eq(bind("ext_sys_cd")));
			shipActL_bldr.setWhere(t2.ext_ship_act_no.eq(bind("ext_ship_act_no")));
			shipActL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			shipActL_bldr.addWhereWithAnd(t2.can_flg.eq(value(false)));
			shipActL_bldr.setLockTable(t.ship_act_no);
			
			dbSelectForUpdate("MSLAL6020_MST_SHIP_ACT_S01", _shipActL, shipActL_bldr, up0().groupBy( ShipActRecvIf_Chk01_DtlR.$ext_sys_cd, ShipActRecvIf_Chk01_DtlR.$ext_ship_act_no));
			
			_shipActIdxkey = _shipActL.createIndex(MST_SHIP_ACT_R.$ship_act_no);
		}
		
		/**
		 * 引数に指定された出荷実績ＮＯで出荷実績ヘッダを取得する。
		 * @param shipActNo 出荷実績ＮＯ
		 * @return 出荷実績ヘッダ
		 */
		protected MST_SHIP_ACT_R getShipAct(String shipActNo) {
			
			return _shipActL.getFirst(_shipActIdxkey, shipActNo);
		}
		
		/**
		 * 出荷実績明細を取得する。
		 */
		protected void getShipActD() {
			
			_shipActDL = MCList.create(MST_SHIP_ACT_D_R.class);
			_shipActDL.addStringColumn(MST_SHIP_ALLOC_STS_R.$ship_inst_d_no);
			_shipActDL.addBooleanColumn(MST_SHIP_SCHD_R.$abort_flg);
			_shipActDL.addStringColumn(MST_SHIP_PR_R.$ship_pr_no);
			_shipActDL.addStringColumn(MST_IV_D_R.$iv_d_no);
			_shipActDL.addStringColumn(MST_IV_R.$iv_no);
			
			MST_SHIP_ALLOC_STS_R t2 = MST_SHIP_ALLOC_STS_R.create("T2");
			MST_SHIP_SCHD_R t3 = MST_SHIP_SCHD_R.create("T3");
			MST_SHIP_PR_R t4 = MST_SHIP_PR_R.create("T4");
			MST_SHIP_ACT_R shipAct = MST_SHIP_ACT_R.create("SHIPACT");
			MST_IV_SHIP_ACT_MAP_R ivShipActMap = MST_IV_SHIP_ACT_MAP_R.create("ISAM");
			MST_IV_D_R ivD = MST_IV_D_R.create("IVD");
			MST_IV_R iv = MST_IV_R.create("IV");
			
			MST_SHIP_ACT_D_R t = MST_SHIP_ACT_D_R.create("T");
			MCQueryApiBuilder shipActDL_bldr = MCQueryApiBuilder.create(t);
			
			shipActDL_bldr.addSelect(t2.ship_inst_d_no);
			shipActDL_bldr.addSelect(t3.abort_flg);
			shipActDL_bldr.addSelect(t4.ship_pr_no);
			shipActDL_bldr.addSelect(ivD.iv_d_no);
			shipActDL_bldr.addSelect(iv.iv_no);
			
			shipActDL_bldr.setWhere(t.ship_act_no.eq(bind("ship_act_no")));
			shipActDL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			
			shipActDL_bldr.addInnerJoin(shipAct, t.ship_act_no.eq(shipAct.ship_act_no));
			shipActDL_bldr.addLeftOuterJoin(t2, t.ship_alloc_sts_no.eq(t2.ship_alloc_sts_no));
			shipActDL_bldr.addLeftOuterJoin(t3, t2.ship_schd_no.eq(t3.ship_schd_no));
			shipActDL_bldr.addLeftOuterJoin(t4, t3.ship_pr_no.eq(t4.ship_pr_no));
			shipActDL_bldr.addLeftOuterJoin(ivShipActMap,
				t.ship_act_d_no.eq(ivShipActMap.ship_act_d_no)
				.and(ivShipActMap.ship_act_fix_flg.eq(value(true)))
				.and(shipAct.iv_no.isNull())
				.and(shipAct.via_dlv_typ.eq(value(MAC_VIA_DLV_TYP.NOT_VIA.value())))
			);
			shipActDL_bldr.addLeftOuterJoin(ivD, ivShipActMap.iv_d_no.eq(ivD.iv_d_no));
			shipActDL_bldr.addLeftOuterJoin(iv, ivD.iv_mng_no.eq(iv.iv_mng_no));
			
			shipActDL_bldr.setLockTable(t.ship_act_d_no);
			dbSelectForUpdate("MSLAL6020_MST_SHIP_ACT_D_S01", _shipActDL, shipActDL_bldr, _shipActL.groupBy(MST_SHIP_ACT_R.$ship_act_no));
			
			_shipActDIdxkey = _shipActDL.createIndex(MST_SHIP_ACT_D_R.$ship_act_d_no);
			
			_extShipActNoIdxkey = _shipActDL.createIndex(MST_SHIP_ACT_D_R.$ext_sys_cd, MST_SHIP_ACT_D_R.$ext_ship_act_no);
		}
		
		/**
		 * 引数に指定された出荷実績明細ＮＯで出荷実績明細を取得する。
		 * @param shipActDNo 出荷実績明細ＮＯ
		 * @return 出荷実績明細
		 */
		protected MST_SHIP_ACT_D_R getShipActD(String shipActDNo) {
			
			 return _shipActDL.getFirst(_shipActDIdxkey, shipActDNo);
		}
		
		/**
		 * 出荷引当状況を取得する。
		 */
		protected void getShipAllocSts() {

			_shipAllocStsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			MCList<MST_SHIP_ALLOC_STS_R> l = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			l.addBooleanColumn(MST_SHIP_INST_D_R.$abort_flg);
			MST_SHIP_ALLOC_STS_R l_t = MST_SHIP_ALLOC_STS_R.create("T");
			MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(l_t);
			
			shipAllDmlBuilder(l_bldr);
			
			// ＩＦデータを振り分ける
			MCList<MST_SHIP_ALLOC_STS_R> shipAllocStsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			MCList<MST_SHIP_INST_D_R> shipInstDtlL = MCList.create(MST_SHIP_INST_D_R.class);
			MCList<MST_IV_D_R> ivDtlL = MCList.create(MST_IV_D_R.class);
			MCList<MST_IV_NO_R> ivNoL = MCList.create(MST_IV_NO_R.class);
			MCList<MST_DLV_SLIP_D_R> dlvSlipDtlL = MCList.create(MST_DLV_SLIP_D_R.class);
			MCList<MST_DLV_SLIP_R> dlvSlipL = MCList.create(MST_DLV_SLIP_R.class);

			for (ShipActRecvIf_Chk01_DtlR r : up0().groupByNE(
					ShipActRecvIf_Chk01_DtlR.$ship_alloc_sts_no,
					ShipActRecvIf_Chk01_DtlR.$ship_inst_d_no,
					ShipActRecvIf_Chk01_DtlR.$iv_d_no,
					ShipActRecvIf_Chk01_DtlR.$iv_no,
					ShipActRecvIf_Chk01_DtlR.$dlv_slip_d_no,
					ShipActRecvIf_Chk01_DtlR.$dlv_slip_no)) {
				if (!isNull(r.ship_alloc_sts_no())) {
					MST_SHIP_ALLOC_STS_R row = MST_SHIP_ALLOC_STS_R.create();
					row.ship_alloc_sts_no(r.ship_alloc_sts_no());
					shipAllocStsL.add(row);
				}
				else if (!isNull(r.ship_inst_d_no())) {
					MST_SHIP_INST_D_R row = MST_SHIP_INST_D_R.create();
					row.ship_inst_d_no(r.ship_inst_d_no());
					shipInstDtlL.add(row);
				}
				else if (!isNull(r.iv_d_no())) {
					MST_IV_D_R row = MST_IV_D_R.create();
					row.iv_d_no(r.iv_d_no());
					ivDtlL.add(row);
				}
				else if (!isNull(r.iv_no())) {
					MST_IV_NO_R row = MST_IV_NO_R.create();
					row.iv_no(r.iv_no());
					ivNoL.add(row);
				}
				else if (!isNull(r.dlv_slip_d_no())) {
					MST_DLV_SLIP_D_R row = MST_DLV_SLIP_D_R.create();
					row.dlv_slip_d_no(r.dlv_slip_d_no());
					dlvSlipDtlL.add(row);
				}
				else if (!isNull(r.dlv_slip_no())) {
					MST_DLV_SLIP_R row = MST_DLV_SLIP_R.create();
					row.dlv_slip_no(r.dlv_slip_no());
					dlvSlipL.add(row);
				}
			}

			// 振り分けたリストごとに出荷引当状況を取得し、その結果を出荷引当状況リストに追加する
			MST_SHIP_ALLOC_STS_R shipAllocStsL_t = MST_SHIP_ALLOC_STS_R.create("SAS");
			MCQueryApiBuilder shipAllocStsL_bldr = MCQueryApiBuilder.create(shipAllocStsL_t);
			MST_SHIP_INST_D_R shipInstDtlL_t = MST_SHIP_INST_D_R.create("SID");
			MCQueryApiBuilder shipInstDtlL_bldr = MCQueryApiBuilder.create(shipInstDtlL_t);
			MST_IV_D_R ivDtlL_t = MST_IV_D_R.create("ID");
			MCQueryApiBuilder ivDtlL_bldr = MCQueryApiBuilder.create(ivDtlL_t);
			MST_IV_NO_R ivNoL_t = MST_IV_NO_R.create("IN");
			MCQueryApiBuilder ivNoL_bldr = MCQueryApiBuilder.create(ivNoL_t);
			MST_DLV_SLIP_D_R dlvSlipDtlL_t = MST_DLV_SLIP_D_R.create("DSD");
			MCQueryApiBuilder dlvSlipDtlL_bldr = MCQueryApiBuilder.create(dlvSlipDtlL_t);
			MST_DLV_SLIP_R dlvSlipL_t = MST_DLV_SLIP_R.create("DS");
			MCQueryApiBuilder dlvSlipL_bldr = MCQueryApiBuilder.create(dlvSlipL_t);
			
			if (shipAllocStsL.size() != 0) {
				dbWkDelete("MSLAL6020_MSW_SHIP_ALLOC_STS_D01", shipAllocStsL_bldr.getBaseDbc());
				dbWkInsert("MSLAL6020_MSW_SHIP_ALLOC_STS_I01", shipAllocStsL, shipAllocStsL_bldr.getBaseDbc());
				addToShipAllocStsL1(l, l_bldr, l_t);
				dbWkDelete("MSLAL6020_MSW_SHIP_ALLOC_STS_D02", shipAllocStsL_bldr.getBaseDbc());
			}
			if (shipInstDtlL.size() != 0) {
				dbWkDelete("MSLAL6020_MSW_SHIP_INST_D_D01", shipInstDtlL_bldr.getBaseDbc());
				dbWkInsert("MSLAL6020_MSW_SHIP_INST_D_I01", shipInstDtlL, shipInstDtlL_bldr.getBaseDbc());
				addToShipAllocStsL2(l, l_bldr, l_t);
				dbWkDelete("MSLAL6020_MSW_SHIP_INST_D_D02", shipInstDtlL_bldr.getBaseDbc());
			}
			if (ivDtlL.size() != 0) {
				dbWkDelete("MSLAL6020_MSW_IV_D_D01", ivDtlL_bldr.getBaseDbc());
				dbWkInsert("MSLAL6020_MSW_IV_D_I01", ivDtlL, ivDtlL_bldr.getBaseDbc());
				addToShipAllocStsL3(l, l_bldr, l_t);
				dbWkDelete("MSLAL6020_MSW_IV_D_D02", ivDtlL_bldr.getBaseDbc());
			}
			if (ivNoL.size() != 0) {
				dbWkDelete("MSLAL6020_MSW_IV_NO_D01", ivNoL_bldr.getBaseDbc());
				dbWkInsert("MSLAL6020_MSW_IV_NO_I01", ivNoL, ivNoL_bldr.getBaseDbc());
				addToShipAllocStsL4(l, l_bldr, l_t);
				dbWkDelete("MSLAL6020_MSW_IV_NO_D02", ivNoL_bldr.getBaseDbc());
			}
			if (dlvSlipDtlL.size() != 0) {
				dbWkDelete("MSLAL6020_MSW_DLV_SLIP_D_D01", dlvSlipDtlL_bldr.getBaseDbc());
				dbWkInsert("MSLAL6020_MSW_DLV_SLIP_D_I01", dlvSlipDtlL, dlvSlipDtlL_bldr.getBaseDbc());
				addToShipAllocStsL5(l, l_bldr, l_t);
				dbWkDelete("MSLAL6020_MSW_DLV_SLIP_D_D02", dlvSlipDtlL_bldr.getBaseDbc());
			}
			if (dlvSlipL.size() != 0) {
				dbWkDelete("MSLAL6020_MSW_DLV_SLIP_D01", dlvSlipL_bldr.getBaseDbc());
				dbWkInsert("MSLAL6020_MSW_DLV_SLIP_I01", dlvSlipL, dlvSlipL_bldr.getBaseDbc());
				addToShipAllocStsL6(l, l_bldr, l_t);
				dbWkDelete("MSLAL6020_MSW_DLV_SLIP_D02", dlvSlipL_bldr.getBaseDbc());
			}
			
			_shipAllocStsL.addBooleanColumn("cmpl_flg", false);
			for (MST_SHIP_ALLOC_STS_R r : _shipAllocStsL) {
				if (r.getBoolean("abort_flg") || r.ship_act_qty().gte(r.base_unit_qty())) {
					r.setBoolean("cmpl_flg", true);
				}
			}
			
			_shipAllocStsIdxkey = _shipAllocStsL.createIndex(MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no);
		}
		
		
		
		protected void shipAllDmlBuilder(MCQueryApiBuilder builder){
					
			MST_SHIP_SCHD_R t2 = MST_SHIP_SCHD_R.create("T2");
			MST_SHIP_PR_R t3 = MST_SHIP_PR_R.create("T3");
			MST_SLO_D_R t4 = MST_SLO_D_R.create("T4");
			MST_IV_MAP_R t5 = MST_IV_MAP_R.create("T5");
			MST_IV_D_R t6 = MST_IV_D_R.create("T6");
			MST_IV_R t7 = MST_IV_R.create("T7");
			MST_SHIP_INST_D_R shipInstD = MST_SHIP_INST_D_R.create("shipInstD");

			_shipAllocStsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			MST_SHIP_ALLOC_STS_R t = MST_SHIP_ALLOC_STS_R.create(builder.getBaseDbcAlias());
			
			_shipAllocStsL.addBooleanColumn(MST_SLO_D_R.$pri_prnt_flg);
			_shipAllocStsL.addBooleanColumn(MST_SHIP_INST_D_R.$abort_flg);
			
			builder.setSelectAll();
			
			builder.addSelect(t2.itm_cd);
			builder.addSelect(t2.itm_sub1);
			builder.addSelect(t2.itm_sub2);
			builder.addSelect(t2.itm_sub3);
			builder.addSelect(t3.ship_pr_no);
			builder.addSelect(t4.pri_prnt_flg);
			builder.addSelect(t7.iv_no);
			builder.addSelect(decode(t7.iv_mng_no, nullValue(), nullValue(), t5.iv_d_no).as("iv_d_no"));
			builder.addSelect(shipInstD.abort_flg);
			
			builder.addInnerJoin(shipInstD, t.ship_inst_d_no.eq(shipInstD.ship_inst_d_no));
			builder.addInnerJoin(t2, shipInstD.ship_inst_d_no.eq(t2.ship_inst_d_no));
			builder.addInnerJoin(t3, t2.ship_pr_no.eq(t3.ship_pr_no));
			builder.addLeftOuterJoin(t4, t3.slo_d_no.eq(t4.slo_d_no));
			builder.addLeftOuterJoin(t5, t2.ship_schd_no.eq(t5.ship_schd_no));
			builder.addLeftOuterJoin(t6, t5.iv_d_no.eq(t6.iv_d_no));
			builder.addLeftOuterJoin(t7, t6.iv_mng_no.eq(t7.iv_mng_no)
				.and((t7.iv_ship_flg.eq(value(true)).or(t7.via_dlv_typ.eq(value(MAC_VIA_DLV_TYP.NOT_VIA.value()))))));
			builder.setOrderByAsc(t.ship_alloc_sts_no);
		}
		
		/**
		 * 出荷引当状況テーブルとワークテーブルを結合して得た検索結果を、出荷引当状況リストに追加します。
		 * @param agent
		 * @param join　ワークテーブルと結合するためのJOIN句
		 */
		protected boolean addToShipAllocStsL1(MCList<MST_SHIP_ALLOC_STS_R> l, MCQueryApiBuilder l_bldr, MST_SHIP_ALLOC_STS_R l_t) {
			MSW_SHIP_ALLOC_STS_KEY_R t8 = MSW_SHIP_ALLOC_STS_KEY_R.create("T8");

			l.addBooleanColumn(MST_SLO_D_R.$pri_prnt_flg);
			l_bldr.addInnerJoin(t8, l_t.ship_alloc_sts_no.eq(t8.ship_alloc_sts_no));
			dbSelect("MSLAL6020_MST_SHIP_ALLOC_STS_S01", l, l_bldr);
			return _shipAllocStsL.addAll(l);
		}
		
		protected boolean addToShipAllocStsL2(MCList<MST_SHIP_ALLOC_STS_R> l, MCQueryApiBuilder l_bldr, MST_SHIP_ALLOC_STS_R l_t) {
			MSW_SHIP_INST_D_KEY_R t9 = MSW_SHIP_INST_D_KEY_R.create("T9");

			l.addBooleanColumn(MST_SLO_D_R.$pri_prnt_flg);
			l_bldr.addInnerJoin(t9, l_t.ship_inst_d_no.eq(t9.ship_inst_d_no));
			dbSelect("MSLAL6020_MST_SHIP_ALLOC_STS_S02", l, l_bldr);
			return _shipAllocStsL.addAll(l);
		}
		
		protected boolean addToShipAllocStsL3(MCList<MST_SHIP_ALLOC_STS_R> l, MCQueryApiBuilder l_bldr, MST_SHIP_ALLOC_STS_R l_t) {
			MSW_IV_D_KEY_R t10 = MSW_IV_D_KEY_R.create("T10");
			MST_IV_MAP_R t5 = MST_IV_MAP_R.create("T5");

			l.addBooleanColumn(MST_SLO_D_R.$pri_prnt_flg);
			l_bldr.addInnerJoin(t10, t5.iv_d_no.eq(t10.iv_d_no));
			dbSelect("MSLAL6020_MST_SHIP_ALLOC_STS_S03", l, l_bldr);
			return _shipAllocStsL.addAll(l);
		}
		
		protected boolean addToShipAllocStsL4(MCList<MST_SHIP_ALLOC_STS_R> l, MCQueryApiBuilder l_bldr, MST_SHIP_ALLOC_STS_R l_t) {
			MSW_IV_NO_KEY_R t11 = MSW_IV_NO_KEY_R.create("T11");
			MST_IV_R t7 = MST_IV_R.create("T7");

			l.addBooleanColumn(MST_SLO_D_R.$pri_prnt_flg);
			l_bldr.addInnerJoin(t11, t7.iv_no.eq(t11.iv_no));
			dbSelect("MSLAL6020_MST_SHIP_ALLOC_STS_S04", l, l_bldr);
			return _shipAllocStsL.addAll(l);
		}
		
		protected boolean addToShipAllocStsL5(MCList<MST_SHIP_ALLOC_STS_R> l, MCQueryApiBuilder l_bldr, MST_SHIP_ALLOC_STS_R l_t) {
			MSW_DLV_SLIP_D_KEY_R t12 = MSW_DLV_SLIP_D_KEY_R.create("T12");

			l.addBooleanColumn(MST_SLO_D_R.$pri_prnt_flg);
			l_bldr.addInnerJoin(t12, l_t.dlv_slip_d_no.eq(t12.dlv_slip_d_no));
			dbSelect("MSLAL6020_MST_SHIP_ALLOC_STS_S05", l, l_bldr);
			return _shipAllocStsL.addAll(l);
		}
		
		protected boolean addToShipAllocStsL6(MCList<MST_SHIP_ALLOC_STS_R> l, MCQueryApiBuilder l_bldr, MST_SHIP_ALLOC_STS_R l_t) {
			MSW_DLV_SLIP_KEY_R t13 = MSW_DLV_SLIP_KEY_R.create("T13");

			l.addBooleanColumn(MST_SLO_D_R.$pri_prnt_flg);
			l_bldr.addInnerJoin(t13, l_t.dlv_slip_no.eq(t13.dlv_slip_no));
			dbSelect("MSLAL6020_MST_SHIP_ALLOC_STS_S06", l, l_bldr);
			return _shipAllocStsL.addAll(l);
		}
		/**
		 * 引数に指定された出荷引当状況ＮＯで出荷引当状況を取得する。
		 * @param shipAllocStsNo 出荷引当状況ＮＯ
		 * @return 出荷引当状況
		 */
		protected MST_SHIP_ALLOC_STS_R getShipAllocSts(String shipAllocStsNo) {
			
			 return _shipAllocStsL.getFirst(_shipAllocStsIdxkey, shipAllocStsNo);
		}
		
		/**
		 * 出荷引当状況を特定するためのキー項目を返す。<br>
		 * 優先順位１．出荷引当状況ＮＯ
		 * @return キー項目配列
		 */
		protected String[] getShipAllocStsKey1() {
			
			return new String[] {MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no};
		}
		
		/**
		 * 出荷引当状況を特定するためのキー項目を返す。<br>
		 * 優先順位２．出荷指図明細ＮＯ＋場所＋棚＋ロットＮＯ＋サブロットＮＯ＋手配ＮＯ１～４（４つとも一致）
		 * @return キー項目配列
		 */
		protected String[] getShipAllocStsKey2() {
			
			return new String[] {
					MST_SHIP_ALLOC_STS_R.$ship_inst_d_no, 
					MST_SHIP_ALLOC_STS_R.$ship_loc_cd,
					MST_SHIP_ALLOC_STS_R.$ship_str_ln_cd,
					MST_SHIP_ALLOC_STS_R.$lot_no,
					MST_SHIP_ALLOC_STS_R.$sublot_no,
					MST_SHIP_ALLOC_STS_R.$sno1,
					MST_SHIP_ALLOC_STS_R.$sno2,
					MST_SHIP_ALLOC_STS_R.$sno3,
					MST_SHIP_ALLOC_STS_R.$sno4};
		}
		
		/**
		 * 出荷引当状況を特定するためのキー項目を返す。<br>
		 * 優先順位３．出荷指図明細ＮＯ＋場所＋棚＋ロットＮＯ＋サブロットＮＯ
		 * @return キー項目配列
		 */
		protected String[] getShipAllocStsKey3() {
			
			return new String[] {
					MST_SHIP_ALLOC_STS_R.$ship_inst_d_no, 
					MST_SHIP_ALLOC_STS_R.$ship_loc_cd,
					MST_SHIP_ALLOC_STS_R.$ship_str_ln_cd,
					MST_SHIP_ALLOC_STS_R.$lot_no,
					MST_SHIP_ALLOC_STS_R.$sublot_no};
		}
		
		/**
		 * 出荷引当状況を特定するためのキー項目を返す。<br>
		 * 優先順位４．出荷指図明細ＮＯ＋場所＋棚
		 * @return キー項目配列
		 */
		protected String[] getShipAllocStsKey4() {
			
			return new String[] {
					MST_SHIP_ALLOC_STS_R.$ship_inst_d_no, 
					MST_SHIP_ALLOC_STS_R.$ship_loc_cd,
					MST_SHIP_ALLOC_STS_R.$ship_str_ln_cd};
		}
		
		/**
		 * 出荷引当状況を特定するためのキー項目を返す。<br>
		 * 優先順位５．出荷指図明細ＮＯ＋場所
		 * @return キー項目配列
		 */
		protected String[] getShipAllocStsKey5() {
			
			return new String[] {
					MST_SHIP_ALLOC_STS_R.$ship_inst_d_no, 
					MST_SHIP_ALLOC_STS_R.$ship_loc_cd};
		}
		
		/**
		 * 出荷引当状況を特定するためのキー項目を返す。<br>
		 * 優先順位６．出荷指図明細ＮＯ
		 * @return キー項目配列
		 */
		protected String[] getShipAllocStsKey6() {
			
			return new String[] {
					MST_SHIP_ALLOC_STS_R.$ship_inst_d_no};
		}
		
		/**
		 * 出荷引当状況を特定するためのキー項目を返す。<br>
		 * 優先順位７．インボイス明細ＮＯ＋場所＋棚＋ロットＮＯ＋サブロットＮＯ＋手配ＮＯ１～４（４つとも一致）
		 * @return キー項目配列
		 */
		protected String[] getShipAllocStsKey7() {
			
			return new String[] {MST_IV_D_R.$iv_d_no, 
					MST_SHIP_ALLOC_STS_R.$ship_loc_cd,
					MST_SHIP_ALLOC_STS_R.$ship_str_ln_cd,
					MST_SHIP_ALLOC_STS_R.$lot_no,
					MST_SHIP_ALLOC_STS_R.$sublot_no,
					MST_SHIP_ALLOC_STS_R.$sno1,
					MST_SHIP_ALLOC_STS_R.$sno2,
					MST_SHIP_ALLOC_STS_R.$sno3,
					MST_SHIP_ALLOC_STS_R.$sno4};
		}
		
		/**
		 * 出荷引当状況を特定するためのキー項目を返す。<br>
		 * 優先順位８．インボイス明細ＮＯ＋場所＋棚＋ロットＮＯ＋サブロットＮＯ
		 * @return キー項目配列
		 */
		protected String[] getShipAllocStsKey8() {
			
			return new String[] {
					MST_IV_D_R.$iv_d_no, 
					MST_SHIP_ALLOC_STS_R.$ship_loc_cd,
					MST_SHIP_ALLOC_STS_R.$ship_str_ln_cd,
					MST_SHIP_ALLOC_STS_R.$lot_no,
					MST_SHIP_ALLOC_STS_R.$sublot_no};
		}
		
		/**
		 * 出荷引当状況を特定するためのキー項目を返す。<br>
		 * 優先順位９．インボイス明細ＮＯ＋場所＋棚
		 * @return キー項目配列
		 */
		protected String[] getShipAllocStsKey9() {
			
			return new String[] {
					MST_IV_D_R.$iv_d_no, 
					MST_SHIP_ALLOC_STS_R.$ship_loc_cd,
					MST_SHIP_ALLOC_STS_R.$ship_str_ln_cd};
		}
		
		/**
		 * 出荷引当状況を特定するためのキー項目を返す。<br>
		 * 優先順位１０．インボイス明細ＮＯ＋場所
		 * @return キー項目配列
		 */
		protected String[] getShipAllocStsKey10() {
			
			return new String[] {
					MST_IV_D_R.$iv_d_no, 
					MST_SHIP_ALLOC_STS_R.$ship_loc_cd};
		}
		
		/**
		 * 出荷引当状況を特定するためのキー項目を返す。<br>
		 * 優先順位１１．インボイス明細ＮＯ
		 * @return キー項目配列
		 */
		protected String[] getShipAllocStsKey11() {
			
			return new String[] {MST_IV_D_R.$iv_d_no};
		}
		
		/**
		 * 出荷引当状況を特定するためのキー項目を返す。<br>
		 * 優先順位１２．インボイスＮＯ＋品目＋場所＋棚＋ロットＮＯ＋サブロットＮＯ＋手配ＮＯ１～４（４つとも一致）
		 * @return キー項目配列
		 */
		protected String[] getShipAllocStsKey12() {
			
			return new String[] {
					MST_IV_R.$iv_no, 
					MST_SHIP_SCHD_R.$itm_cd,
					MST_SHIP_SCHD_R.$itm_sub1,
					MST_SHIP_SCHD_R.$itm_sub2,
					MST_SHIP_SCHD_R.$itm_sub3,
					MST_SHIP_ALLOC_STS_R.$ship_loc_cd,
					MST_SHIP_ALLOC_STS_R.$ship_str_ln_cd,
					MST_SHIP_ALLOC_STS_R.$lot_no,
					MST_SHIP_ALLOC_STS_R.$sublot_no,
					MST_SHIP_ALLOC_STS_R.$sno1,
					MST_SHIP_ALLOC_STS_R.$sno2,
					MST_SHIP_ALLOC_STS_R.$sno3,
					MST_SHIP_ALLOC_STS_R.$sno4};
		}
		
		/**
		 * 出荷引当状況を特定するためのキー項目を返す。<br>
		 * 優先順位１３．インボイスＮＯ＋品目＋場所＋棚＋ロットＮＯ＋サブロットＮＯ
		 * @return キー項目配列
		 */
		protected String[] getShipAllocStsKey13() {
			
			return new String[] {
					MST_IV_R.$iv_no, 
					MST_SHIP_SCHD_R.$itm_cd,
					MST_SHIP_SCHD_R.$itm_sub1,
					MST_SHIP_SCHD_R.$itm_sub2,
					MST_SHIP_SCHD_R.$itm_sub3,
					MST_SHIP_ALLOC_STS_R.$ship_loc_cd,
					MST_SHIP_ALLOC_STS_R.$ship_str_ln_cd,
					MST_SHIP_ALLOC_STS_R.$lot_no,
					MST_SHIP_ALLOC_STS_R.$sublot_no};
		}
		
		/**
		 * 出荷引当状況を特定するためのキー項目を返す。<br>
		 * 優先順位１４．インボイスＮＯ＋品目＋場所＋棚
		 * @return キー項目配列
		 */
		protected String[] getShipAllocStsKey14() {
			
			return new String[] {
					MST_IV_R.$iv_no, 
					MST_SHIP_SCHD_R.$itm_cd,
					MST_SHIP_SCHD_R.$itm_sub1,
					MST_SHIP_SCHD_R.$itm_sub2,
					MST_SHIP_SCHD_R.$itm_sub3,
					MST_SHIP_ALLOC_STS_R.$ship_loc_cd,
					MST_SHIP_ALLOC_STS_R.$ship_str_ln_cd};
		}
		
		/**
		 * 出荷引当状況を特定するためのキー項目を返す。<br>
		 * 優先順位１５．インボイスＮＯ＋品目＋場所
		 * @return キー項目配列
		 */
		protected String[] getShipAllocStsKey15() {
			
			return new String[] {
					MST_IV_R.$iv_no, 
					MST_SHIP_SCHD_R.$itm_cd,
					MST_SHIP_SCHD_R.$itm_sub1,
					MST_SHIP_SCHD_R.$itm_sub2,
					MST_SHIP_SCHD_R.$itm_sub3,
					MST_SHIP_ALLOC_STS_R.$ship_loc_cd};
		}
		
		/**
		 * 出荷引当状況を特定するためのキー項目を返す。<br>
		 * 優先順位１６．インボイスＮＯ＋品目
		 * @return キー項目配列
		 */
		protected String[] getShipAllocStsKey16() {
			
			return new String[] {
					MST_IV_R.$iv_no,
					MST_SHIP_SCHD_R.$itm_cd,
					MST_SHIP_SCHD_R.$itm_sub1,
					MST_SHIP_SCHD_R.$itm_sub2,
					MST_SHIP_SCHD_R.$itm_sub3};
		}
		
		/**
		 * 出荷引当状況を特定するためのキー項目を返す。<br>
		 * 優先順位７．納品書明細ＮＯ＋場所＋棚＋ロットＮＯ＋サブロットＮＯ＋手配ＮＯ１～４（４つとも一致）
		 * @return キー項目配列
		 */
		protected String[] getShipAllocStsKey17() {
			
			return new String[] {MST_SHIP_ALLOC_STS_R.$dlv_slip_d_no, 
					MST_SHIP_ALLOC_STS_R.$ship_loc_cd,
					MST_SHIP_ALLOC_STS_R.$ship_str_ln_cd,
					MST_SHIP_ALLOC_STS_R.$lot_no,
					MST_SHIP_ALLOC_STS_R.$sublot_no,
					MST_SHIP_ALLOC_STS_R.$sno1,
					MST_SHIP_ALLOC_STS_R.$sno2,
					MST_SHIP_ALLOC_STS_R.$sno3,
					MST_SHIP_ALLOC_STS_R.$sno4};
		}
		
		/**
		 * 出荷引当状況を特定するためのキー項目を返す。<br>
		 * 優先順位８．納品書明細ＮＯ＋場所＋棚＋ロットＮＯ＋サブロットＮＯ
		 * @return キー項目配列
		 */
		protected String[] getShipAllocStsKey18() {
			
			return new String[] {
					MST_SHIP_ALLOC_STS_R.$dlv_slip_d_no, 
					MST_SHIP_ALLOC_STS_R.$ship_loc_cd,
					MST_SHIP_ALLOC_STS_R.$ship_str_ln_cd,
					MST_SHIP_ALLOC_STS_R.$lot_no,
					MST_SHIP_ALLOC_STS_R.$sublot_no};
		}
		
		/**
		 * 出荷引当状況を特定するためのキー項目を返す。<br>
		 * 優先順位９．納品書明細ＮＯ＋場所＋棚
		 * @return キー項目配列
		 */
		protected String[] getShipAllocStsKey19() {
			
			return new String[] {
					MST_SHIP_ALLOC_STS_R.$dlv_slip_d_no, 
					MST_SHIP_ALLOC_STS_R.$ship_loc_cd,
					MST_SHIP_ALLOC_STS_R.$ship_str_ln_cd};
		}
		
		/**
		 * 出荷引当状況を特定するためのキー項目を返す。<br>
		 * 優先順位１０．納品書明細ＮＯ＋場所
		 * @return キー項目配列
		 */
		protected String[] getShipAllocStsKey20() {
			
			return new String[] {
					MST_SHIP_ALLOC_STS_R.$dlv_slip_d_no, 
					MST_SHIP_ALLOC_STS_R.$ship_loc_cd};
		}
		
		/**
		 * 出荷引当状況を特定するためのキー項目を返す。<br>
		 * 優先順位１１．納品書明細ＮＯ
		 * @return キー項目配列
		 */
		protected String[] getShipAllocStsKey21() {
			
			return new String[] {MST_SHIP_ALLOC_STS_R.$dlv_slip_d_no};
		}
		
		/**
		 * 出荷引当状況を特定するためのキー項目を返す。<br>
		 * 優先順位１２．納品書ＮＯ＋品目＋場所＋棚＋ロットＮＯ＋サブロットＮＯ＋手配ＮＯ１～４（４つとも一致）
		 * @return キー項目配列
		 */
		protected String[] getShipAllocStsKey22() {
			
			return new String[] {
					MST_SHIP_ALLOC_STS_R.$dlv_slip_no, 
					MST_SHIP_SCHD_R.$itm_cd,
					MST_SHIP_SCHD_R.$itm_sub1,
					MST_SHIP_SCHD_R.$itm_sub2,
					MST_SHIP_SCHD_R.$itm_sub3,
					MST_SHIP_ALLOC_STS_R.$ship_loc_cd,
					MST_SHIP_ALLOC_STS_R.$ship_str_ln_cd,
					MST_SHIP_ALLOC_STS_R.$lot_no,
					MST_SHIP_ALLOC_STS_R.$sublot_no,
					MST_SHIP_ALLOC_STS_R.$sno1,
					MST_SHIP_ALLOC_STS_R.$sno2,
					MST_SHIP_ALLOC_STS_R.$sno3,
					MST_SHIP_ALLOC_STS_R.$sno4};
		}
		
		/**
		 * 出荷引当状況を特定するためのキー項目を返す。<br>
		 * 優先順位１３．納品書ＮＯ＋品目＋場所＋棚＋ロットＮＯ＋サブロットＮＯ
		 * @return キー項目配列
		 */
		protected String[] getShipAllocStsKey23() {
			
			return new String[] {
					MST_SHIP_ALLOC_STS_R.$dlv_slip_no, 
					MST_SHIP_SCHD_R.$itm_cd,
					MST_SHIP_SCHD_R.$itm_sub1,
					MST_SHIP_SCHD_R.$itm_sub2,
					MST_SHIP_SCHD_R.$itm_sub3,
					MST_SHIP_ALLOC_STS_R.$ship_loc_cd,
					MST_SHIP_ALLOC_STS_R.$ship_str_ln_cd,
					MST_SHIP_ALLOC_STS_R.$lot_no,
					MST_SHIP_ALLOC_STS_R.$sublot_no};
		}
		
		/**
		 * 出荷引当状況を特定するためのキー項目を返す。<br>
		 * 優先順位１４．納品書ＮＯ＋品目＋場所＋棚
		 * @return キー項目配列
		 */
		protected String[] getShipAllocStsKey24() {
			
			return new String[] {
					MST_SHIP_ALLOC_STS_R.$dlv_slip_no, 
					MST_SHIP_SCHD_R.$itm_cd,
					MST_SHIP_SCHD_R.$itm_sub1,
					MST_SHIP_SCHD_R.$itm_sub2,
					MST_SHIP_SCHD_R.$itm_sub3,
					MST_SHIP_ALLOC_STS_R.$ship_loc_cd,
					MST_SHIP_ALLOC_STS_R.$ship_str_ln_cd};
		}
		
		/**
		 * 出荷引当状況を特定するためのキー項目を返す。<br>
		 * 優先順位１５．納品書ＮＯ＋品目＋場所
		 * @return キー項目配列
		 */
		protected String[] getShipAllocStsKey25() {
			
			return new String[] {
					MST_SHIP_ALLOC_STS_R.$dlv_slip_no, 
					MST_SHIP_SCHD_R.$itm_cd,
					MST_SHIP_SCHD_R.$itm_sub1,
					MST_SHIP_SCHD_R.$itm_sub2,
					MST_SHIP_SCHD_R.$itm_sub3,
					MST_SHIP_ALLOC_STS_R.$ship_loc_cd};
		}
		
		/**
		 * 出荷引当状況を特定するためのキー項目を返す。<br>
		 * 優先順位１６．納品書ＮＯ＋品目
		 * @return キー項目配列
		 */
		protected String[] getShipAllocStsKey26() {
			
			return new String[] {
					MST_SHIP_ALLOC_STS_R.$dlv_slip_no,
					MST_SHIP_SCHD_R.$itm_cd,
					MST_SHIP_SCHD_R.$itm_sub1,
					MST_SHIP_SCHD_R.$itm_sub2,
					MST_SHIP_SCHD_R.$itm_sub3};
		}
		
		/**
		 * 出荷引当状況を特定するためのキー項目を返す。<br>
		 * 優先順位２７．出荷引当状況＋インボイスＮＯ＋インボイス明細ＮＯ
		 * @return キー項目配列
		 */
		protected String[] getShipAllocStsKey27() {
			
			return new String[] {
					MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no,
					MST_IV_R.$iv_no,
					MST_IV_D_R.$iv_d_no};
		}
		
		/**
		 * 出荷引当状況を特定するためのキー項目を返す。<br>
		 * 優先順位２８．出荷引当状況＋インボイス明細ＮＯ
		 * @return キー項目配列
		 */
		protected String[] getShipAllocStsKey28() {
			
			return new String[] {
					MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no,
					MST_IV_D_R.$iv_d_no};
		}
		
		/**
		 * 出荷引当状況を特定するためのキー項目を返す。<br>
		 * 優先順位２９．出荷引当状況＋インボイスＮＯ
		 * @return キー項目配列
		 */
		protected String[] getShipAllocStsKey29() {
			
			return new String[] {
					MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no,
					MST_IV_R.$iv_no};
		}
		
		/**
		 * 処理対象の明細をソートする。
		 * 
		 * @param shipActRecvIfL 出荷実績受信ＩＦリスト
		 */
		protected void sortDtl(MCList<ShipActRecvIf_Chk01_DtlR> shipActRecvIfL) {
			
			shipActRecvIfL.sort(ShipActRecvIf_Chk01_DtlR.$ext_sys_cd, ShipActRecvIf_Chk01_DtlR.$ext_ship_act_no);
		}
		
		/**
		 * 計画外FLGを設定する。（出荷引当状況NO、出荷指図NO、納品書明細NO、納品書NOがすべて未設定の場合に、計画外とする）
		 * @param shipActRecvIfL 出荷実績受信ＩＦリスト
		 */
		protected void setUplndFlg(MCList<ShipActRecvIf_Chk01_DtlR> shipActRecvIfL) {
			
			for (ShipActRecvIf_Chk01_DtlR shipActRecvIfR : shipActRecvIfL) {
				
				if (isCrt(shipActRecvIfR) || isUpd(shipActRecvIfR)) {
					
					if (isNullAnd(shipActRecvIfR.ship_inst_no(),
							shipActRecvIfR.ship_alloc_sts_no(), 
							shipActRecvIfR.ship_inst_d_no(), 
							shipActRecvIfR.iv_d_no(), 
							shipActRecvIfR.iv_no(), 
							shipActRecvIfR.dlv_slip_d_no(), 
							shipActRecvIfR.dlv_slip_no())) {
						
						shipActRecvIfR.uplnd_flg(true);
					}
				}
			}
		}
		
		/**
		 * 条件付き必須チェックを行う。
		 * @param shipActRecvIfL 出荷実績受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkReq(MCList<ShipActRecvIf_Chk01_DtlR> shipActRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (ShipActRecvIf_Chk01_DtlR shipActRecvIfR : shipActRecvIfL) {
				
				if (isCrt(shipActRecvIfR) || isUpd(shipActRecvIfR)) {
					
					// 計画と計画外の共通必須チェックのみ行う。（条件付き必須チェックは後続処理に任せる）
					msgL.addAll(check(shipActRecvIfR, ShipActRecvIf_Chk01_DtlR.$ship_tm, new FXUCL_RequiredValidater()));
					msgL.addAll(check(shipActRecvIfR, ShipActRecvIf_Chk01_DtlR.$dlv_tm, new FXUCL_RequiredValidater()));
					msgL.addAll(check(shipActRecvIfR, ShipActRecvIf_Chk01_DtlR.$ent_unit_qty, new FXUCL_RequiredValidater()));
					
					if (!shipActRecvIfR.uplnd_flg()) {
						
						msgL.addAll(check(shipActRecvIfR, ShipActRecvIf_Chk01_DtlR.$ship_inst_no, new FXUCL_RequiredValidater()));
						
						if (isNullAnd(shipActRecvIfR.ship_alloc_sts_no(), 
								shipActRecvIfR.ship_inst_d_no(), 
								shipActRecvIfR.iv_d_no(), 
								shipActRecvIfR.iv_no(), 
								shipActRecvIfR.dlv_slip_d_no(), 
								shipActRecvIfR.dlv_slip_no())) {

							msgL.add(new MCMessage(shipActRecvIfR, null, MSLAL0169, shipActRecvIfR.data_no(), shipActRecvIfR.data_lno()));
						}
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 外部出荷実績ＮＯが重複しているかをチェックする。
		 * @param shipActRecvIfL 出荷実績受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkDuplicate(MCList<ShipActRecvIf_Chk01_DtlR> shipActRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			List<MCNumber> errL = new ArrayList<MCNumber>();
			ShipActRecvIf_Chk01_DtlR prev = null;
			for (ShipActRecvIf_Chk01_DtlR shipActRecvIfR : shipActRecvIfL) {
				
				if (prev == null) {
					prev = shipActRecvIfR;
					continue;
				}
				
				if (isSame(shipActRecvIfR.ext_sys_cd(), prev.ext_sys_cd()) 
						&& isSame(shipActRecvIfR.ext_ship_act_no(), prev.ext_ship_act_no())) {
					
					if (!errL.contains(prev.data_lno())) {
						
						msgL.add(new MCMessage(prev, null, MSLAL0165, prev.data_no(),
								prev.data_lno(), 
								prev.ext_sys_cd(), 
								prev.ext_ship_act_no()));
						
						errL.add(prev.data_lno());
					}
					
					msgL.add(new MCMessage(shipActRecvIfR, null, MSLAL0165, shipActRecvIfR.data_no(),
							shipActRecvIfR.data_lno(), 
							shipActRecvIfR.ext_sys_cd(), 
							shipActRecvIfR.ext_ship_act_no()));
					
					errL.add(shipActRecvIfR.data_lno());
				}
				
				prev = shipActRecvIfR;
			}	
			
			return msgL;
		}
		
		/**
		 * 出荷指図が存在するかどうかチェックする。
		 * @param shipActRecvIfL 出荷実績受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkShipInst(MCList<ShipActRecvIf_Chk01_DtlR> shipActRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (ShipActRecvIf_Chk01_DtlR shipActRecvIfR : shipActRecvIfL) {
				
				if (!shipActRecvIfR.uplnd_flg() && !isNull(shipActRecvIfR.ship_inst_no())) {
					
					MST_SHIP_INST_R shipInstR = getShipInst(shipActRecvIfR.ship_inst_no());
					
					if (isNull(shipInstR) || shipInstR.isEmpty()) {
						msgL.add(new MCMessage(shipActRecvIfR, null, MSBEL1049, shipActRecvIfR.data_no(),
								shipActRecvIfR.data_lno(), 
								shipActRecvIfR.ship_inst_no()));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 出荷指図明細が存在するかどうかチェックする。
		 * @param shipActRecvIfL 出荷実績受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkShipInstD(MCList<ShipActRecvIf_Chk01_DtlR> shipActRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (ShipActRecvIf_Chk01_DtlR shipActRecvIfR : shipActRecvIfL) {
				
				if (!shipActRecvIfR.uplnd_flg()) {
					
					if (!isNull(shipActRecvIfR.ship_inst_d_no())) {
						MST_SHIP_INST_D_R shipInstDR = getShipInstD(shipActRecvIfR.ship_inst_d_no());
						if (isNull(shipInstDR) || shipInstDR.isEmpty()) {
							msgL.add(new MCMessage(shipActRecvIfR, null, MSLAL0510, shipActRecvIfR.data_no(),
									shipActRecvIfR.data_lno(), 
									shipActRecvIfR.ship_inst_d_no()));
						}
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 対応する出荷実績情報を取込みできるかチェックする。
		 * @param shipActRecvIfL 出荷実績受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkShipAct(MCList<ShipActRecvIf_Chk01_DtlR> shipActRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			boolean errFlg = false;
			
			for (ShipActRecvIf_Chk01_DtlR shipActRecvIfR : shipActRecvIfL) {
				
				errFlg = false;
				
				MCList<MST_SHIP_ACT_D_R> shipActDL = _shipActDL.subList(
						_extShipActNoIdxkey, shipActRecvIfR.ext_sys_cd(), shipActRecvIfR.ext_ship_act_no());
				
				if (isCrt(shipActRecvIfR)) {
					
					for (MST_SHIP_ACT_D_R shipActDR : shipActDL) {
						
						msgL.add(new MCMessage(shipActRecvIfR, null, MSLAL0166, 
								shipActRecvIfR.data_no(), shipActRecvIfR.data_lno(), shipActDR.ext_sys_cd(), shipActDR.ext_ship_act_no()));
						errFlg = true;
					}
				}
				else {
					
					if (shipActDL.size() > 1) {
						
						msgL.add(new MCMessage(shipActRecvIfR, null, MSLAL0167, shipActRecvIfR.data_no(), shipActRecvIfR.data_lno()));
						errFlg = true;
					}
					else if (shipActDL.size() == 0) {
						
						msgL.add(new MCMessage(shipActRecvIfR, null, MSLAL0168, shipActRecvIfR.data_no(), shipActRecvIfR.data_lno()));
						errFlg = true;
					}
				}
				
				if ((isUpd(shipActRecvIfR) || isDel(shipActRecvIfR)) && !errFlg) {
					
					MST_SHIP_ACT_D_R shipActDR = shipActDL.get(0);
					
					// 更新/削除行の対応する出荷実績ＮＯ、出荷実績明細ＮＯを設定する
					shipActRecvIfR.ship_act_no(shipActDR.ship_act_no());
					shipActRecvIfR.ship_act_d_no(shipActDR.ship_act_d_no());
					
					if (isDel(shipActRecvIfR)) {
						
						shipActRecvIfR.ship_inst_d_no(nvl(shipActRecvIfR.ship_inst_d_no(), shipActDR.getStringNE(MST_SHIP_INST_D_R.$ship_inst_d_no)));
						shipActRecvIfR.ship_alloc_sts_no(nvl(shipActRecvIfR.ship_alloc_sts_no(), shipActDR.ship_alloc_sts_no()));
						shipActRecvIfR.ship_pr_no(shipActDR.getStringNE(MST_SHIP_PR_R.$ship_pr_no));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * インボイスに関連するチェックを行う。
		 * @param shipActRecvIfL  出荷実績受信ＩＦリスト
		 * @return  エラーメッセージリスト
		 */
		protected MCMessageList chkItm(MCList<ShipActRecvIf_Chk01_DtlR> shipActRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (ShipActRecvIf_Chk01_DtlR shipActRecvIfR : shipActRecvIfL) {
				
				shipActRecvIfR.itm_sub1(nvl(shipActRecvIfR.itm_sub1(), MAC_STR.NULL_VAL.value()));
				shipActRecvIfR.itm_sub2(nvl(shipActRecvIfR.itm_sub2(), MAC_STR.NULL_VAL.value()));
				shipActRecvIfR.itm_sub3(nvl(shipActRecvIfR.itm_sub3(), MAC_STR.NULL_VAL.value()));
				
				if (isUpd(shipActRecvIfR)) {
					
					MST_SHIP_ACT_D_R shipActDR = getShipActD(shipActRecvIfR.ship_act_d_no());
					
					if (!isNull(shipActDR) && shipActRecvIfR.uplnd_flg()) {
						
						if (!isNull(shipActRecvIfR.itm_cd())) {
							
							if (!isSameItm(shipActRecvIfR, shipActDR) && shipActRecvIfR.uplnd_flg()) {
								
								msgL.add(new MCMessage(shipActRecvIfR, null, MSLAL0209, 
										shipActRecvIfR.data_no(), 
										shipActRecvIfR.data_lno(), 
										toDispItm(shipActDR.itm_cd(), shipActDR.itm_sub1(), shipActDR.itm_sub2(), shipActDR.itm_sub3()),
										toDispItm(shipActRecvIfR.itm_cd(), shipActRecvIfR.itm_sub1(), shipActRecvIfR.itm_sub2(), shipActRecvIfR.itm_sub3())));
							}
						}
						else {
							shipActRecvIfR.itm_cd(shipActDR.itm_cd());
							shipActRecvIfR.itm_sub1(shipActDR.itm_sub1());
							shipActRecvIfR.itm_sub2(shipActDR.itm_sub2());
							shipActRecvIfR.itm_sub3(shipActDR.itm_sub3());
						}
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * インボイスに関連するチェックを行う。
		 * @param shipActRecvIfL  出荷実績受信ＩＦリスト
		 * @return  エラーメッセージリスト
		 */
		protected MCMessageList chkIv(MCList<ShipActRecvIf_Chk01_DtlR> shipActRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (ShipActRecvIf_Chk01_DtlR shipActRecvIfR : shipActRecvIfL) {
				
				if (!shipActRecvIfR.uplnd_flg() && !isNull(shipActRecvIfR.ship_inst_no())) {
					
					MST_SHIP_INST_R shipInstR = getShipInst(shipActRecvIfR.ship_inst_no());
					
					if (!isNull(shipInstR)) {
						
						if (!isNull(shipActRecvIfR.iv_no()) 
								&& shipInstR.getBooleanNE(MST_IV_R.$iv_ship_flg) 
								&& !isSame(shipActRecvIfR.iv_no(), shipInstR.iv_no())) {
							
							msgL.add(new MCMessage(shipActRecvIfR, null, MSLAL0210, 
									shipActRecvIfR.data_no(), shipActRecvIfR.data_lno(), shipActRecvIfR.iv_no(), shipInstR.iv_no()));
						}
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 出荷実績受信ＩＦ情報に対応する出荷引当状況を特定できるかチェックする。
		 * @param shipActRecvIfL 出荷実績受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkShipAllocSts(MCList<ShipActRecvIf_Chk01_DtlR> shipActRecvIfL) {
			
			crtExtSysCache();
			
			MCMessageList msgL = new MCMessageList();
			
			MCIndexKey idxkey1 = _shipAllocStsL.createIndex(getShipAllocStsKey1());
			MCIndexKey idxkey2 = _shipAllocStsL.createIndex(getShipAllocStsKey2());
			MCIndexKey idxkey3 = _shipAllocStsL.createIndex(getShipAllocStsKey3());
			MCIndexKey idxkey4 = _shipAllocStsL.createIndex(getShipAllocStsKey4());
			MCIndexKey idxkey5 = _shipAllocStsL.createIndex(getShipAllocStsKey5());
			MCIndexKey idxkey6 = _shipAllocStsL.createIndex(getShipAllocStsKey6());
			MCIndexKey idxkey7 = _shipAllocStsL.createIndex(getShipAllocStsKey7());
			MCIndexKey idxkey8 = _shipAllocStsL.createIndex(getShipAllocStsKey8());
			MCIndexKey idxkey9 = _shipAllocStsL.createIndex(getShipAllocStsKey9());
			MCIndexKey idxkey10 = _shipAllocStsL.createIndex(getShipAllocStsKey10());
			MCIndexKey idxkey11 = _shipAllocStsL.createIndex(getShipAllocStsKey11());
			MCIndexKey idxkey12 = _shipAllocStsL.createIndex(getShipAllocStsKey12());
			MCIndexKey idxkey13 = _shipAllocStsL.createIndex(getShipAllocStsKey13());
			MCIndexKey idxkey14 = _shipAllocStsL.createIndex(getShipAllocStsKey14());
			MCIndexKey idxkey15 = _shipAllocStsL.createIndex(getShipAllocStsKey15());
			MCIndexKey idxkey16 = _shipAllocStsL.createIndex(getShipAllocStsKey16());
			MCIndexKey idxkey17 = _shipAllocStsL.createIndex(getShipAllocStsKey17());
			MCIndexKey idxkey18 = _shipAllocStsL.createIndex(getShipAllocStsKey18());
			MCIndexKey idxkey19 = _shipAllocStsL.createIndex(getShipAllocStsKey19());
			MCIndexKey idxkey20 = _shipAllocStsL.createIndex(getShipAllocStsKey20());
			MCIndexKey idxkey21 = _shipAllocStsL.createIndex(getShipAllocStsKey21());
			MCIndexKey idxkey22 = _shipAllocStsL.createIndex(getShipAllocStsKey22());
			MCIndexKey idxkey23 = _shipAllocStsL.createIndex(getShipAllocStsKey23());
			MCIndexKey idxkey24 = _shipAllocStsL.createIndex(getShipAllocStsKey24());
			MCIndexKey idxkey25 = _shipAllocStsL.createIndex(getShipAllocStsKey25());
			MCIndexKey idxkey26 = _shipAllocStsL.createIndex(getShipAllocStsKey26());
			MCIndexKey idxkey27 = _shipAllocStsL.createIndex(getShipAllocStsKey27());
			MCIndexKey idxkey28 = _shipAllocStsL.createIndex(getShipAllocStsKey28());
			MCIndexKey idxkey29 = _shipAllocStsL.createIndex(getShipAllocStsKey29());
			
			boolean ivDNoChecked = false;
			boolean ivNoChecked = false;
			for (ShipActRecvIf_Chk01_DtlR shipActRecvIfR : shipActRecvIfL) {
				
				if (isDel(shipActRecvIfR) 
						|| shipActRecvIfR.uplnd_flg()
						|| isNullAnd(shipActRecvIfR.ship_alloc_sts_no(),
								shipActRecvIfR.ship_inst_d_no(),
								shipActRecvIfR.iv_d_no(),
								shipActRecvIfR.iv_no(),
								shipActRecvIfR.dlv_slip_d_no(),
								shipActRecvIfR.dlv_slip_no())) {
					continue;
				}
				
				MST_SHIP_INST_R shipInstR = getShipInst(shipActRecvIfR.ship_inst_no());
				
				MCList<MST_SHIP_ALLOC_STS_R> shipAllocStsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
					
				MST_SHIP_ALLOC_STS_R shipAllocStsR = _shipAllocStsL.getFirst(idxkey1, shipActRecvIfR.toArray(getShipAllocStsKey1()));
				
				if (isNull(shipAllocStsR) && isNull(shipAllocStsL)) {
					shipAllocStsL = _shipAllocStsL.subList(idxkey2, shipActRecvIfR.toArray(getShipAllocStsKey2()));
				}
				if (isNull(shipAllocStsR) && isNull(shipAllocStsL)) {
					shipAllocStsL = _shipAllocStsL.subList(idxkey3, shipActRecvIfR.toArray(getShipAllocStsKey3()));
				}
				if (isNull(shipAllocStsR) && isNull(shipAllocStsL)) {
					shipAllocStsL = _shipAllocStsL.subList(idxkey4, shipActRecvIfR.toArray(getShipAllocStsKey4()));
				}
				if (isNull(shipAllocStsR) && isNull(shipAllocStsL)) {
					shipAllocStsL = _shipAllocStsL.subList(idxkey5, shipActRecvIfR.toArray(getShipAllocStsKey5()));
				}
				if (isNull(shipAllocStsR) && isNull(shipAllocStsL)) {
					shipAllocStsL = _shipAllocStsL.subList(idxkey6, shipActRecvIfR.toArray(getShipAllocStsKey6()));
				}
				
				if (!isNull(shipActRecvIfR.iv_d_no()) && isIvNoTgt(shipInstR)) {
					
					if (!isNull(shipAllocStsR) || !isNull(shipAllocStsL)) {
						ivDNoChecked = false;
					}
					else {
						ivDNoChecked = true;
					}
					// インボイス単位出荷または配送先経由しないの場合、インボイス明細で出荷引当状況を特定する
					if (isNull(shipAllocStsR) && isNull(shipAllocStsL)) {
						shipAllocStsL = _shipAllocStsL.subList(idxkey7, shipActRecvIfR.toArray(getShipAllocStsKey7()));
					}
					if (isNull(shipAllocStsR) && isNull(shipAllocStsL)) {
						shipAllocStsL = _shipAllocStsL.subList(idxkey8, shipActRecvIfR.toArray(getShipAllocStsKey8()));
					}
					if (isNull(shipAllocStsR) && isNull(shipAllocStsL)) {
						shipAllocStsL = _shipAllocStsL.subList(idxkey9, shipActRecvIfR.toArray(getShipAllocStsKey9()));
					}
					if (isNull(shipAllocStsR) && isNull(shipAllocStsL)) {
						shipAllocStsL = _shipAllocStsL.subList(idxkey10, shipActRecvIfR.toArray(getShipAllocStsKey10()));
					}
					if (isNull(shipAllocStsR) && isNull(shipAllocStsL)) {
						shipAllocStsL = _shipAllocStsL.subList(idxkey11, shipActRecvIfR.toArray(getShipAllocStsKey11()));
					}
				}
				
				if (isNull(shipAllocStsR) && isNull(shipAllocStsL)) {
					shipAllocStsL = _shipAllocStsL.subList(idxkey17, shipActRecvIfR.toArray(getShipAllocStsKey17()));
				}
				if (isNull(shipAllocStsR) && isNull(shipAllocStsL)) {
					shipAllocStsL = _shipAllocStsL.subList(idxkey18, shipActRecvIfR.toArray(getShipAllocStsKey18()));
				}
				if (isNull(shipAllocStsR) && isNull(shipAllocStsL)) {
					shipAllocStsL = _shipAllocStsL.subList(idxkey19, shipActRecvIfR.toArray(getShipAllocStsKey19()));
				}
				if (isNull(shipAllocStsR) && isNull(shipAllocStsL)) {
					shipAllocStsL = _shipAllocStsL.subList(idxkey20, shipActRecvIfR.toArray(getShipAllocStsKey20()));
				}
				if (isNull(shipAllocStsR) && isNull(shipAllocStsL)) {
					shipAllocStsL = _shipAllocStsL.subList(idxkey21, shipActRecvIfR.toArray(getShipAllocStsKey21()));
				}
				if (!isNull(shipActRecvIfR.iv_no()) && isIvNoTgt(shipInstR)) {
					
					if (!isNull(shipAllocStsR) || !isNull(shipAllocStsL)) {
						ivNoChecked = false;
					}
					else {
						ivNoChecked = true;
					}
					// インボイス単位出荷または配送先経由しないの場合、インボイスＮＯで出荷引当状況を特定する
					if (isNull(shipAllocStsR) && isNull(shipAllocStsL)) {
						shipAllocStsL = _shipAllocStsL.subList(idxkey12, shipActRecvIfR.toArray(getShipAllocStsKey12()));
					}
					if (isNull(shipAllocStsR) && isNull(shipAllocStsL)) {
						shipAllocStsL = _shipAllocStsL.subList(idxkey13, shipActRecvIfR.toArray(getShipAllocStsKey13()));
					}
					if (isNull(shipAllocStsR) && isNull(shipAllocStsL)) {
						shipAllocStsL = _shipAllocStsL.subList(idxkey14, shipActRecvIfR.toArray(getShipAllocStsKey14()));
					}
					if (isNull(shipAllocStsR) && isNull(shipAllocStsL)) {
						shipAllocStsL = _shipAllocStsL.subList(idxkey15, shipActRecvIfR.toArray(getShipAllocStsKey15()));
					}
					if (isNull(shipAllocStsR) && isNull(shipAllocStsL)) {
						shipAllocStsL = _shipAllocStsL.subList(idxkey16, shipActRecvIfR.toArray(getShipAllocStsKey16()));
					}
				}
				if (isNull(shipAllocStsR) && isNull(shipAllocStsL)) {
					shipAllocStsL = _shipAllocStsL.subList(idxkey22, shipActRecvIfR.toArray(getShipAllocStsKey22()));
				}
				if (isNull(shipAllocStsR) && isNull(shipAllocStsL)) {
					shipAllocStsL = _shipAllocStsL.subList(idxkey23, shipActRecvIfR.toArray(getShipAllocStsKey23()));
				}
				if (isNull(shipAllocStsR) && isNull(shipAllocStsL)) {
					shipAllocStsL = _shipAllocStsL.subList(idxkey24, shipActRecvIfR.toArray(getShipAllocStsKey24()));
				}
				if (isNull(shipAllocStsR) && isNull(shipAllocStsL)) {
					shipAllocStsL = _shipAllocStsL.subList(idxkey25, shipActRecvIfR.toArray(getShipAllocStsKey25()));
				}
				if (isNull(shipAllocStsR) && isNull(shipAllocStsL)) {
					shipAllocStsL = _shipAllocStsL.subList(idxkey26, shipActRecvIfR.toArray(getShipAllocStsKey26()));
				}
				
				if (isNull(shipAllocStsR) && !isNull(shipAllocStsL)) {
					shipAllocStsR = setShipAllocSts(shipActRecvIfR, shipActRecvIfL, shipAllocStsL);
				}
				
				if (!isNull(shipAllocStsR) && !shipAllocStsR.isEmpty() && isIvNoTgt(shipInstR)) {
					// インボイスNO、インボイス明細NO、出荷引当状況NOの組み合わせが一致するか再確認
					ShipActRecvIf_Chk01_DtlR ivShipActRecvIfR = shipActRecvIfR.clone();
					ivShipActRecvIfR.ship_alloc_sts_no(shipAllocStsR.ship_alloc_sts_no());
					
					if (!isNull(ivShipActRecvIfR.iv_d_no()) && !isNull(ivShipActRecvIfR.iv_no()) && !ivDNoChecked && !ivNoChecked) {
						shipAllocStsR = _shipAllocStsL.getFirst(idxkey27, ivShipActRecvIfR.toArray(getShipAllocStsKey27()));
					}
					else if (!isNull(ivShipActRecvIfR.iv_d_no()) && !ivDNoChecked) {
						shipAllocStsR = _shipAllocStsL.getFirst(idxkey28, ivShipActRecvIfR.toArray(getShipAllocStsKey28()));
					}
					else if (!isNull(ivShipActRecvIfR.iv_no()) && !ivNoChecked) {
						shipAllocStsR = _shipAllocStsL.getFirst(idxkey29, ivShipActRecvIfR.toArray(getShipAllocStsKey29()));
					}
				}
				
				if (isNull(shipAllocStsR) || shipAllocStsR.isEmpty()) {
					
					msgL.add(new MCMessage(
							shipActRecvIfR, 
							null, 
							MSLAL0170, 
							shipActRecvIfR.data_no(), 
							shipActRecvIfR.data_lno(),
							shipActRecvIfR.ship_alloc_sts_no(), 
							shipActRecvIfR.ship_inst_d_no(), 
							shipActRecvIfR.iv_d_no(),
							shipActRecvIfR.iv_no(),
							shipActRecvIfR.dlv_slip_d_no(), 
							shipActRecvIfR.dlv_slip_no(),
							shipActRecvIfR.ship_loc_cd(),
							shipActRecvIfR.ship_str_ln_cd(),
							shipActRecvIfR.lot_no(),
							shipActRecvIfR.sublot_no(),
							toDispSno(shipActRecvIfR.sno1(), shipActRecvIfR.sno2(), shipActRecvIfR.sno3(), shipActRecvIfR.sno4())));
				}
				else {
					
					MAM_EXT_SYS_R extSysR = getExtSysR(shipActRecvIfR);
					
					if (isCrt(shipActRecvIfR) && shipAllocStsR.ship_act_qty().isPositive() && !isNull(extSysR) && extSysR.not_dup_imp_flg()) {
						// 重複取込不可チェック
						msgL.add(new MCMessage(shipActRecvIfR, null, MSLAL0207, 
								shipActRecvIfR.data_no(), shipActRecvIfR.data_lno(), shipActRecvIfR.ext_sys_cd(), shipActRecvIfR.ext_ship_act_no()));
					}
					
					shipActRecvIfR.ship_inst_d_no(nvl(shipActRecvIfR.ship_inst_d_no(), shipAllocStsR.ship_inst_d_no()));
					shipActRecvIfR.ship_alloc_sts_no(nvl(shipActRecvIfR.ship_alloc_sts_no(), shipAllocStsR.ship_alloc_sts_no()));
					shipActRecvIfR.ship_pr_no(shipAllocStsR.getStringNE(MST_SHIP_PR_R.$ship_pr_no));
					if (isIvNoTgt(shipInstR)) {
						if (isNull(shipActRecvIfR.iv_d_no()) && !isNull(shipActRecvIfR.iv_no())) {
							shipActRecvIfR.iv_d_no(shipAllocStsR.getStringNE(MST_IV_D_R.$iv_d_no));
						}
						if (!isNull(shipActRecvIfR.iv_d_no())) {
							shipActRecvIfR.dtl_iv_no(shipAllocStsR.getStringNE(MST_IV_R.$iv_no));
						}
						if (!shipInstR.getBooleanNE(MST_IV_R.$iv_ship_flg)) {
							shipActRecvIfR.iv_no(null);
						}
					}
					else {
						shipActRecvIfR.clear(ShipActRecvIf_Chk01_DtlR.$iv_no,
								ShipActRecvIf_Chk01_DtlR.$dtl_iv_no,
								ShipActRecvIf_Chk01_DtlR.$iv_d_no);
					}
				}
			}
			
			return msgL;
		}
		
		protected MST_SHIP_ALLOC_STS_R setShipAllocSts(ShipActRecvIf_Chk01_DtlR shipActRecvIfR,
				MCList<ShipActRecvIf_Chk01_DtlR> shipActRecvIfL, MCList<MST_SHIP_ALLOC_STS_R> shipAllocStsL) {
			
			MST_SHIP_ALLOC_STS_R shipAllocStsR = MST_SHIP_ALLOC_STS_R.create();
			
			if (MAC_DATA_CRUD_TYP.isCRT(shipActRecvIfR.data_crud_typ())) {
				MCList<MST_SHIP_ALLOC_STS_R> tmpShipAllocStsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
				MCList<MST_SHIP_ALLOC_STS_R> tmpCmplShipAllocStsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
				
				for (MST_SHIP_ALLOC_STS_R r : shipAllocStsL) {
					if (!r.getBoolean("cmpl_flg")) {
						if (!r.getBoolean("abort_flg") && !r.ship_act_qty().gte(r.base_unit_qty())) {
							tmpShipAllocStsL.add(r);
						}
						else {
							tmpCmplShipAllocStsL.add(r);
						}
					}
				}
				
				if (!tmpShipAllocStsL.isEmpty()) {
					shipAllocStsR = tmpShipAllocStsL.get(0);
				}
				else if (!tmpCmplShipAllocStsL.isEmpty()) {
					shipAllocStsR = tmpCmplShipAllocStsL.get(tmpCmplShipAllocStsL.size() - 1);
				}
				else {
					shipAllocStsR = shipAllocStsL.get(shipAllocStsL.size() - 1);
				}
				
				if (!shipAllocStsR.getBoolean("cmpl_flg")) {
					shipActRecvIfR.itm_cd(shipAllocStsR.getStringNE("itm_cd"));
					shipActRecvIfR.itm_sub1(shipAllocStsR.getStringNE("itm_sub1"));
					shipActRecvIfR.itm_sub2(shipAllocStsR.getStringNE("itm_sub2"));
					shipActRecvIfR.itm_sub3(shipAllocStsR.getStringNE("itm_sub3"));
					
					if (isNull(shipActRecvIfR.ent_unit_cd())) {
						shipActRecvIfR.ent_unit_cd(shipAllocStsR.ent_unit_cd());
					}
					
					MCNumber baseUnitQty =  getBaseUnitQty(shipActRecvIfR);
					
					shipAllocStsR.ship_act_qty(shipAllocStsR.ship_act_qty().add(baseUnitQty));
					
					if (shipActRecvIfR.abort_flg()) {
						MCList<MST_SHIP_ALLOC_STS_R> upCmplShipAllocStsL = _shipAllocStsL.subList("ship_inst_d_no", shipAllocStsR.ship_inst_d_no());
						upCmplShipAllocStsL.setBoolean("abort_flg", true);
					}
				}
			}
			else {
				MST_SHIP_ACT_D_R actDR = _shipActDL.getFirst(_extShipActNoIdxkey, shipActRecvIfR.ext_sys_cd(), shipActRecvIfR.ext_ship_act_no());
				if (isNull(actDR)){
					shipAllocStsR = shipAllocStsL.get(0);
					return shipAllocStsR;
				}
				else {
					shipAllocStsR = _shipAllocStsL.getFirst(_shipAllocStsIdxkey, actDR.ship_alloc_sts_no());
				}
				
				if (!shipAllocStsR.getBoolean("cmpl_flg")) {
					shipActRecvIfR.itm_cd(shipAllocStsR.getStringNE("itm_cd"));
					shipActRecvIfR.itm_sub1(shipAllocStsR.getStringNE("itm_sub1"));
					shipActRecvIfR.itm_sub2(shipAllocStsR.getStringNE("itm_sub2"));
					shipActRecvIfR.itm_sub3(shipAllocStsR.getStringNE("itm_sub3"));
					
					if (isNull(shipActRecvIfR.ent_unit_cd())) {
						shipActRecvIfR.ent_unit_cd(shipAllocStsR.ent_unit_cd());
					}
					
					MCNumber baseUnitQty = getBaseUnitQty(shipActRecvIfR);
					
					if (!isSame(baseUnitQty, actDR.base_unit_qty())) {
						MCNumber diffQty = baseUnitQty.subtract(actDR.base_unit_qty());
						actDR.base_unit_qty(baseUnitQty);
						shipAllocStsR.ship_act_qty(shipAllocStsR.ship_act_qty().add(diffQty));
					}
					
					if (shipActRecvIfR.abort_flg()) {
						MCList<MST_SHIP_ALLOC_STS_R> upCmplShipAllocStsL = _shipAllocStsL.subList("ship_inst_d_no", shipAllocStsR.ship_inst_d_no());
						upCmplShipAllocStsL.setBoolean("abort_flg", true);
					}
				}
			}
			
			return shipAllocStsR;
		}
		
		/**
		 * 基準単位数量
		 */
		protected MCNumber getBaseUnitQty(ShipActRecvIf_Chk01_DtlR ifR) {
			if (_itmCache == null) {
				_itmCache = new FXUCL_MCDbcCache<>(MCQueryApiBuilder.create(MAM_ITM_R.create("T")));
			}
			MAM_ITM_R itmR = _itmCache.get(ifR.itm_cd(), ifR.itm_sub1(), ifR.itm_sub2(), ifR.itm_sub3());
			if (isSame(itmR.unit_cd(), ifR.ent_unit_cd())) {
				return ifR.ent_unit_qty();
			}
			MAVM_ITM_UNIT_R unitR = getItmUnitR(
				ifR.itm_cd(), ifR.itm_sub1(), ifR.itm_sub2(), ifR.itm_sub3(), ifR.ent_unit_cd());
			return
				convToBaseUnit(
					ifR.ent_unit_qty(), unitR.conv_base_qty() , unitR.conv_qty(),
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
		
		/**
		 * サーバチェック処理を行う前に、使用される項目を補完するを補完する
		 * @param chkList 出荷実績受信ＩＦリスト
		 */
		protected void beforeChkCompl(MCList<ShipActRecvIf_Chk01_DtlR> chkList) {
			
			for (ShipActRecvIf_Chk01_DtlR shipActRecvIfR : chkList) {
				
				if (isDel(shipActRecvIfR)) {
					continue;
				}
				
				setShipTo(shipActRecvIfR);
				
				setTrdPtnTyp(shipActRecvIfR);
			}
		}
		
		/**
		 * 取引パタン区分が「売上」または「出荷」　かっ　送付先識別区分と納品先識別区分両方納品先の場合、 送付先に納品先を設定する。
		 * @param shipActRecvIfR 出荷実績受信ＩＦ
		 */
		protected void setShipTo(ShipActRecvIf_Chk01_DtlR shipActRecvIfR) {
			
			if (isDel(shipActRecvIfR)) {
				return;
			}
			
			if ((MSC_DLV_ID_TYP.isDLV(shipActRecvIfR.dlv_id_typ()) && MSC_SHIP_TO_ID_TYP.isDLV(shipActRecvIfR.ship_to_id_typ()))
					|| (MSC_DLV_ID_TYP.isLOC(shipActRecvIfR.dlv_id_typ()) && MSC_SHIP_TO_ID_TYP.isLOC(shipActRecvIfR.ship_to_id_typ()))) {
				
				shipActRecvIfR.ship_to_id_cd(shipActRecvIfR.dlv_id_cd());
				shipActRecvIfR.ship_to_id_nm(shipActRecvIfR.dlv_id_nm());
				shipActRecvIfR.ship_to_zip_cd(shipActRecvIfR.dlv_zip_cd());
				shipActRecvIfR.ship_to_addr1(shipActRecvIfR.dlv_addr1());
				shipActRecvIfR.ship_to_addr2(shipActRecvIfR.dlv_addr2());
				shipActRecvIfR.ship_to_addr3(shipActRecvIfR.dlv_addr3());
				shipActRecvIfR.ship_to_addr4(shipActRecvIfR.dlv_addr4());
				shipActRecvIfR.ship_to_cntct_dpt(shipActRecvIfR.dlv_cntct_dpt());
				shipActRecvIfR.ship_to_cntct_psn(shipActRecvIfR.dlv_cntct_psn());
				shipActRecvIfR.ship_to_tel(shipActRecvIfR.dlv_tel());
				shipActRecvIfR.ship_to_fax(shipActRecvIfR.dlv_fax());
				shipActRecvIfR.ship_to_sundry_flg(shipActRecvIfR.dlv_sundry_flg());
				shipActRecvIfR.mst_ship_to_id_nm(shipActRecvIfR.mst_dlv_id_nm());
			}
		}
		
		/**
		 * 取引パタン区分を設定する。
		 */
		protected void setTrdPtnTyp(ShipActRecvIf_Chk01_DtlR shipActRecvIfR) {
				
			if (isDel(shipActRecvIfR)) {
				return;
			}
			
			if (shipActRecvIfR.uplnd_flg()) {
				if (isNull(shipActRecvIfR.trd_ptn_typ())) {
					shipActRecvIfR.trd_ptn_typ(shipActRecvIfR.mst_trd_ptn_typ());
				}
			}
			else {
				// 出荷指図の取引パタン区分を設定する
				MST_SHIP_INST_D_R shipInstDR = getShipInstD(shipActRecvIfR.ship_inst_d_no());
				shipActRecvIfR.trd_ptn_typ(shipInstDR.trd_ptn_typ());
			}
		}
		
		/**
		 * 出荷実績受信ＩＦ情報に対応する出荷引当状況を特定できるかチェックする。
		 * @param shipActRecvIfL 出荷実績受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkShipTo(MCList<ShipActRecvIf_Chk01_DtlR> shipActRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (ShipActRecvIf_Chk01_DtlR shipActRecvIfR : shipActRecvIfL) {
				
				if (isUpd(shipActRecvIfR)) {
					
					MST_SHIP_ACT_R shipActR = getShipAct(shipActRecvIfR.ship_act_no());
					
					if (!isNull(shipActR)
							&& shipActRecvIfR.uplnd_flg()
							&& MAC_TRD_PTN_TYP.isPROV(shipActRecvIfR.trd_ptn_typ())
							&& !isNull(shipActRecvIfR.ship_to_id_typ()) 
							&& !isNull(shipActRecvIfR.ship_to_id_cd())
							&& (!isSame(shipActRecvIfR.ship_to_id_typ(), shipActR.ship_to_id_typ()) 
									|| !isSame(shipActRecvIfR.ship_to_id_cd(), shipActR.ship_to_id_cd()))) {
								
						msgL.add(new MCMessage(shipActRecvIfR, null, MSLAL0211, 
								shipActRecvIfR.data_no(), 
								shipActRecvIfR.data_lno(), 
								shipActR.ship_to_id_typ(),
								shipActR.ship_to_id_cd(),
								shipActRecvIfR.ship_to_id_typ(),
								shipActRecvIfR.ship_to_id_cd()));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * インボイスNOとインボイス明細NOを設定するか判定する。
		 * @param shipInstNo 出荷指図ＮＯ
		 * @return インボイス単位出荷または配送先経由しないはtrue
		 */
		protected boolean isIvNoTgt(MST_SHIP_INST_R shipInstR) {
			
			if (isNull(shipInstR) || isNull(shipInstR.ship_inst_no())) {
				return false;
			}
			
			return shipInstR.getBooleanNE(MST_IV_R.$iv_ship_flg) || MAC_VIA_DLV_TYP.isNOT_VIA(shipInstR.via_dlv_typ());
		}
		
		/**
		 * 取引パタン区分が支給で出荷場所が変わっているかチェックする
		 * @param shipActRecvIfL 出荷実績受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkLoc(MCList<ShipActRecvIf_Chk01_DtlR> shipActRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (ShipActRecvIf_Chk01_DtlR shipActRecvIfR : shipActRecvIfL) {
				
				if (isUpd(shipActRecvIfR)) {
					
					MST_SHIP_ACT_D_R shipActDR = getShipActD(shipActRecvIfR.ship_act_d_no());
					
					if (!isNull(shipActDR) 
							&& MAC_TRD_PTN_TYP.isPROV_RTN(shipActRecvIfR.trd_ptn_typ())
							&& !isNull(shipActRecvIfR.ship_loc_cd()) 
							&& !isSame(shipActRecvIfR.ship_loc_cd(), shipActDR.ship_loc_cd())) {
								
						msgL.add(new MCMessage(shipActRecvIfR, null, MSLAL0212, 
								shipActRecvIfR.data_no(), 
								shipActRecvIfR.data_lno(), 
								shipActDR.ship_loc_cd(),
								shipActRecvIfR.ship_loc_cd()));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 取引パタン区分が支給返品で出荷棚・ラインが変わっているかチェックする
		 * @param shipActRecvIfL 出荷実績受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkStrLn(MCList<ShipActRecvIf_Chk01_DtlR> shipActRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (ShipActRecvIf_Chk01_DtlR shipActRecvIfR : shipActRecvIfL) {
				
				if (isUpd(shipActRecvIfR)) {
					
					MST_SHIP_ACT_D_R shipActDR = getShipActD(shipActRecvIfR.ship_act_d_no());
					
					if (!isNull(shipActDR) 
							&& MAC_TRD_PTN_TYP.isPROV_RTN(shipActRecvIfR.trd_ptn_typ())
							&& !isNull(shipActRecvIfR.ship_str_ln_cd()) 
							&& !isSame(nullValToNull(shipActRecvIfR.ship_str_ln_cd()), nullValToNull(shipActDR.ship_str_ln_cd()))) {
								
						msgL.add(new MCMessage(shipActRecvIfR, null, MSLAL0213, 
								shipActRecvIfR.data_no(), 
								shipActRecvIfR.data_lno(), 
								shipActDR.ship_str_ln_cd(),
								shipActRecvIfR.ship_str_ln_cd()));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 同一取込単位のうち、エラーが存在するかどうかチェックする。
		 */
		protected void chkGrpErr() {
			
			MCIndexKey idxkey = up0().createIndex(ShipActRecvIf_Chk01_DtlR.$uplnd_flg);
			
			// 計画(出荷指図NOでグループエラー)
			MCList<ShipActRecvIf_Chk01_DtlR> plndL = up0().subList(idxkey, false);
			
			MCIndexKey plndErrIdxkey = plndL.createIndex(ShipActRecvIf_Chk01_DtlR.$err_flg);
			
			if (plndL.contains(plndErrIdxkey, true)) {
				
				for (ShipActRecvIf_Chk01_DtlR shipActRecvIfR : plndL) {
					
					if (!shipActRecvIfR.err_flg()) {
						
						shipActRecvIfR.err_flg(true);
						
						MCMessagePool.add(shipActRecvIfR, null, MSLAL0164, 
								shipActRecvIfR.data_no(), 
								shipActRecvIfR.data_lno(), 
								shipActRecvIfR.ship_fr_lg_grp_cd(), 
								shipActRecvIfR.ship_inst_no());
					}
				}
			}
			
			//　計画外（ヘッダ単位でグループエラー）
			for (MCList<ShipActRecvIf_Chk01_DtlR> shipActRecvIfL : groupListByHdrKeys(up0().subList(idxkey, true))) {
				
				MCIndexKey errIdxkey = shipActRecvIfL.createIndex(ShipActRecvIf_Chk01_DtlR.$err_flg);
				
				if (shipActRecvIfL.contains(errIdxkey, true)) {
					
					for (ShipActRecvIf_Chk01_DtlR shipActRecvIfR : shipActRecvIfL) {
					
						if (!shipActRecvIfR.err_flg()) {
							
							shipActRecvIfR.err_flg(true);
							
							MCMessagePool.add(shipActRecvIfR, null, MSLAL0204, 
									shipActRecvIfR.data_no(), 
									shipActRecvIfR.data_lno(), 
									shipActRecvIfR.ship_fr_lg_grp_cd(), 
									toYMDHMString(shipActRecvIfR.ship_tm()),
									toYMDHMString(shipActRecvIfR.dlv_tm()),
									shipActRecvIfR.cst_cd(),
									shipActRecvIfR.rqst_dpt_cd(),
									shipActRecvIfR.rqst_usr_cd(),
									shipActRecvIfR.ship_dpt_cd(),
									shipActRecvIfR.ship_usr_cd(),
									shipActRecvIfR.ship_to_id_typ(),
									shipActRecvIfR.ship_to_id_cd());
						}
					}
				}
			}
		}

		protected void chkPrevErr() {
			
			for (ShipActRecvIf_Chk01_DtlR shipActRecvIfR : up0()) {
				if (!shipActRecvIfR.err_flg()) {
					if (isPrevErr(shipActRecvIfR.sa())) {
						
						shipActRecvIfR.err_flg(true);
						MCMessagePool.add(shipActRecvIfR, null, MSLAL0652, shipActRecvIfR.data_no(), shipActRecvIfR.data_lno(), 
								shipActRecvIfR.sa().ship_fr_lg_grp_cd(), shipActRecvIfR.sa().ext_sys_cd(), shipActRecvIfR.sa().ext_ship_act_no());
					}
				}
			}
		}

		/**
		 * 補完時に必要な項目を先に設定する。
		 */
		protected void preCompl() {

			setItm();
			
			setRsn();
		}
		
		/**
		 * 補完処理で使用するキャッシュ情報を作成する。
		 */
		protected void crtCache() {
			
			crtBizRsnCache();
				
			crtItmCache();
			
			crtDlvCache();
			
			setLot();
			
			crtLotListCache();
		}
		
		/**
		 * 品目を設定する。（計画の場合、出荷実績受信IFの品目を無視する）
		 */
		protected void setItm() {
			
			MCList<ShipActRecvIf_Chk01_DtlR> chkList = getChkList(up0());
			for (ShipActRecvIf_Chk01_DtlR shipActRecvIfR : chkList) {
				
				if (isDel(shipActRecvIfR)) {
					continue;
				}
				
				if (!shipActRecvIfR.uplnd_flg()) {
					
					MST_SHIP_INST_D_R shipInstDR = getShipInstD(shipActRecvIfR.ship_inst_d_no());
					
					shipActRecvIfR.itm_cd(shipInstDR.itm_cd());
					shipActRecvIfR.itm_sub1(shipInstDR.itm_sub1());
					shipActRecvIfR.itm_sub2(shipInstDR.itm_sub2());
					shipActRecvIfR.itm_sub3(shipInstDR.itm_sub3());
				}
			}
		}
		
		/**
		 * 理由を設定する。（計画の場合、出荷実績受信IFの理由を無視する）
		 */
		protected void setRsn() {
			
			MCList<ShipActRecvIf_Chk01_DtlR> chkList = getChkList(up0());
			for (ShipActRecvIf_Chk01_DtlR shipActRecvIfR : chkList) {
				
				if (isDel(shipActRecvIfR)) {
					continue;
				}
				
				if (!shipActRecvIfR.uplnd_flg()) {
					
					MST_SHIP_INST_D_R shipInstDR = getShipInstD(shipActRecvIfR.ship_inst_d_no());
					
					shipActRecvIfR.rsn_cd(shipInstDR.rsn_cd());
				}
			}
		}
		
		/**
		 * 外部システムマスタのキャッシューを作成する。
		 */
		protected void crtExtSysCache() {
			
			MCList<ShipActRecvIf_Chk01_DtlR> chkList = getChkList(up0());
			
			_extSysCache = new FXUCL_MCDbcCache<MAM_EXT_SYS_R>(
					MCQueryApiBuilder.create(MAM_EXT_SYS_R.create("T")), 
					chkList,
					MAM_EXT_SYS_R.$ext_sys_cd);
		}
		
		/**
		 * キャッシューから外部システムマスタを取得する。
		 * @param shipActRecvIfR 出荷実績受信ＩＦ
		 * @return　外部システムマスタマスタ
		 */
		protected MAM_EXT_SYS_R getExtSysR(ShipActRecvIf_Chk01_DtlR shipActRecvIfR) {
			
			return _extSysCache.get(shipActRecvIfR.ext_sys_cd());
		}
		
		/**
		 * 品目マスタのキャッシューを作成する。
		 */
		protected void crtItmCache() {
			
			MCList<ShipActRecvIf_Chk01_DtlR> chkList = getChkList(up0());
			
			_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(
					MCQueryApiBuilder.create(MAM_ITM_R.create("T")), 
					chkList, 
					ShipActRecvIf_Chk01_DtlR.$itm_cd, 
					ShipActRecvIf_Chk01_DtlR.$itm_sub1,
					ShipActRecvIf_Chk01_DtlR.$itm_sub2, 
					ShipActRecvIf_Chk01_DtlR.$itm_sub3);
		}
		
		/**
		 * キャッシューから品目マスタを取得する。
		 * @param shipActRecvIfR 出荷実績受信ＩＦ
		 * @return　品目マスタマスタ
		 */
		protected MAM_ITM_R getItm(ShipActRecvIf_Chk01_DtlR shipActRecvIfR) {
			
			return _itmCache.get(shipActRecvIfR.itm_cd(), shipActRecvIfR.itm_sub1(), shipActRecvIfR.itm_sub2(), shipActRecvIfR.itm_sub3());
		}
		
		/**
		 * 納品先のキャッシューを作成する。
		 */
		protected void crtDlvCache() {
			
			MCList<ShipActRecvIf_Chk01_DtlR> chkList = getChkList(up0());
			
			_dlvCache = new FXUCL_MCDbcCache<MAM_BP_R>(
					MCQueryApiBuilder.create(MAM_BP_R.create("T")), 
					chkList.subList(r -> r.uplnd_flg() 
							&& MSC_DLV_ID_TYP.isDLV(r.dlv_id_typ()) 
							&& MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ())), 
					ShipActRecvIf_Chk01_DtlR.$dlv_id_cd);
		}
		
		/**
		 * キャッシューから納品先を取得する。
		 * @param shipActRecvIfR 出荷実績受信ＩＦ
		 * @return　納品先
		 */
		protected MAM_BP_R getDlv(ShipActRecvIf_Chk01_DtlR shipActRecvIfR) {
			
			return _dlvCache.get(shipActRecvIfR.dlv_id_cd());
		}
		
		/**
		 * 業務理由マスタのキャッシューを作成する。
		 */
		protected void crtBizRsnCache() {
			
			MCList<ShipActRecvIf_Chk01_DtlR> chkList = getChkList(up0());
			
			_bizRsnCache = new FXUCL_MCDbcCache<MAM_BIZ_RSN_R>(
					MCQueryApiBuilder.create(MAM_BIZ_RSN_R.create("T")), 
					chkList, 
					ShipActRecvIf_Chk01_DtlR.$rsn_cd);
		}
		
		/**
		 * キャッシューから業務理由マスタを取得する。
		 * @param shipActRecvIfR 出荷実績受信ＩＦ
		 * @return　業務理由マスタマスタ
		 */
		protected MAM_BIZ_RSN_R getBizRsn(ShipActRecvIf_Chk01_DtlR shipActRecvIfR) {
			
			return _bizRsnCache.get(shipActRecvIfR.rsn_cd());
		}
		
		/**
		 * ロットＮＯ、サブロットＮＯを設定する。<br>
		 * ロット管理しない場合、ＮＵＬＬ文字を設定する。
		 */
		protected void setLot() {
		
			MCList<ShipActRecvIf_Chk01_DtlR> chkList = getChkList(up0());
			
			for (ShipActRecvIf_Chk01_DtlR shipActRecvIfR : chkList) {
				
				if (isDel(shipActRecvIfR)) {
					continue;
				}
				
				MAM_ITM_R itmR = getItm(shipActRecvIfR);
				
				if (!isNull(itmR.lot_mng_typ()) && !MAC_LOT_MNG_TYP.req_lot(itmR.lot_mng_typ())) {
					shipActRecvIfR.lot_no(MAC_STR.NULL_VAL.value());
				}
				if (!isNull(itmR.sublot_mng_typ()) && !MAC_SUBLOT_MNG_TYP.req_lot(itmR.sublot_mng_typ())) {
					shipActRecvIfR.sublot_no(MAC_STR.NULL_VAL.value());
				}
			}
		}
		
		/**
		 * ロット・サブロットリストのキャッシューを作成する。（版ＮＯを取得するため）
		 */
		protected void crtLotListCache() {

			MCList<ShipActRecvIf_Chk01_DtlR> chkList = getChkList(up0());
			
			for (ShipActRecvIf_Chk01_DtlR shipActRecvIfR : chkList) {
				
				if (isDel(shipActRecvIfR)) {
					continue;
				}
				
				MAM_ITM_R itmR = getItm(shipActRecvIfR);
					
				shipActRecvIfR.ver_flg(itmR.ver_flg());
			}
			
			MCIndexKey idxkey = chkList.createIndex(ShipActRecvIf_Chk01_DtlR.$ver_flg);
			MCList<ShipActRecvIf_Chk01_DtlR> verL = chkList.subList(idxkey, true);
			
			_lotListCache = new FXUCL_MCDbcCache<MSVT_LOT_LIST_R>(
					MCQueryApiBuilder.create(MSVT_LOT_LIST_R.create("T")), 
					verL, 
					ShipActRecvIf_Chk01_DtlR.$itm_cd, 
					ShipActRecvIf_Chk01_DtlR.$itm_sub1,
					ShipActRecvIf_Chk01_DtlR.$itm_sub2, 
					ShipActRecvIf_Chk01_DtlR.$itm_sub3,
					ShipActRecvIf_Chk01_DtlR.$lot_no,
					ShipActRecvIf_Chk01_DtlR.$sublot_no);
		}
		
		/**
		 * キャッシューからロット・サブロットリストを取得する。（版ＮＯを取得するため）
		 * @param shipActRecvIfR 出荷実績受信ＩＦ
		 * @return　ロット・サブロットリスト
		 */
		protected MSVT_LOT_LIST_R getLotList(ShipActRecvIf_Chk01_DtlR shipActRecvIfR) {
			
			return _lotListCache.get(
					shipActRecvIfR.itm_cd(), 
					shipActRecvIfR.itm_sub1(), 
					shipActRecvIfR.itm_sub2(), 
					shipActRecvIfR.itm_sub3(),
					shipActRecvIfR.lot_no(),
					shipActRecvIfR.sublot_no());
		}
		
		/**
		 * 出荷実績受信ＩＦの補完を行う。
		 */
		protected void compl() {
			
			complHdr();
			
			complDtl();
			
			clearPlndItm();
			
			clearByTrdPtnTyp();
		}
		
		
		/**
		 * 出荷実績受信ＩＦのヘッダ項目の補完を行う。
		 */
		protected void complHdr() {
			
			MCList<ShipActRecvIf_Chk01_DtlR> chkList = getChkList(up0());
			
			for (ShipActRecvIf_Chk01_DtlR shipActRecvIfR : chkList) {
				
				if (isDel(shipActRecvIfR)) {
					continue;
				}
				// ヘッダの補完処理はここに追加
			}
		}
		
		/**
		 * 出荷実績受信ＩＦの明細項目の補完を行う。
		 */
		protected void complDtl() {

			MCList<ShipActRecvIf_Chk01_DtlR> chkList = getChkList(up0());
			
			for (ShipActRecvIf_Chk01_DtlR shipActRecvIfR : chkList) {
				
				if (isDel(shipActRecvIfR)) {
					continue;
				}
				
				MST_SHIP_INST_D_R shipInstDR = getShipInstD(shipActRecvIfR.ship_inst_d_no());
				
				MST_SHIP_ACT_D_R shipActDR = getShipActD(shipActRecvIfR.ship_act_d_no());
				
				MST_SHIP_ALLOC_STS_R shipAllocStsR = getShipAllocSts(shipActRecvIfR.ship_alloc_sts_no());
				
				setPriPrntFlg(shipActRecvIfR, shipAllocStsR, shipActDR);
				
				setSno(shipActRecvIfR, shipAllocStsR, shipInstDR);
				
				setVerNo(shipActRecvIfR, shipAllocStsR, shipActDR);
				
				setTrdUnitCd(shipActRecvIfR, shipAllocStsR);
				
				setSkipChkShipFlg(shipActRecvIfR, shipActDR);
				
				setBdDptCd(shipActRecvIfR, shipInstDR, shipActDR);
				
				setGdCd(shipActRecvIfR);
				
				setArrCntRmrks(shipActRecvIfR);
			}
		}
		
		/**
		 * 計画の場合、必要ない項目をクリアする。
		 */
		protected void clearPlndItm() {

			MCList<ShipActRecvIf_Chk01_DtlR> chkList = getChkList(up0());
			
			for (ShipActRecvIf_Chk01_DtlR shipActRecvIfR : chkList) {
				
				if (!shipActRecvIfR.uplnd_flg()) {
					
					shipActRecvIfR.clear(
							ShipActRecvIf_Chk01_DtlR.$rqst_dpt_cd,
							ShipActRecvIf_Chk01_DtlR.$rqst_usr_cd,
							ShipActRecvIf_Chk01_DtlR.$cst_cd,
							ShipActRecvIf_Chk01_DtlR.$ship_to_id_typ,
							ShipActRecvIf_Chk01_DtlR.$ship_to_id_cd,
							ShipActRecvIf_Chk01_DtlR.$ship_to_id_nm,
							ShipActRecvIf_Chk01_DtlR.$ship_to_zip_cd,
							ShipActRecvIf_Chk01_DtlR.$ship_to_addr1,
							ShipActRecvIf_Chk01_DtlR.$ship_to_addr2,
							ShipActRecvIf_Chk01_DtlR.$ship_to_addr3,
							ShipActRecvIf_Chk01_DtlR.$ship_to_addr4,
							ShipActRecvIf_Chk01_DtlR.$ship_to_cntct_dpt,
							ShipActRecvIf_Chk01_DtlR.$ship_to_cntct_psn,
							ShipActRecvIf_Chk01_DtlR.$ship_to_tel,
							ShipActRecvIf_Chk01_DtlR.$ship_to_fax,
							ShipActRecvIf_Chk01_DtlR.$trd_cd,
							ShipActRecvIf_Chk01_DtlR.$trd_ptn_typ,
							ShipActRecvIf_Chk01_DtlR.$dlv_id_typ,
							ShipActRecvIf_Chk01_DtlR.$dlv_id_cd,
							ShipActRecvIf_Chk01_DtlR.$dlv_id_nm,
							ShipActRecvIf_Chk01_DtlR.$dlv_zip_cd,
							ShipActRecvIf_Chk01_DtlR.$dlv_addr1,
							ShipActRecvIf_Chk01_DtlR.$dlv_addr2,
							ShipActRecvIf_Chk01_DtlR.$dlv_addr3,
							ShipActRecvIf_Chk01_DtlR.$dlv_addr4,
							ShipActRecvIf_Chk01_DtlR.$dlv_cntct_dpt,
							ShipActRecvIf_Chk01_DtlR.$dlv_cntct_psn,
							ShipActRecvIf_Chk01_DtlR.$dlv_tel,
							ShipActRecvIf_Chk01_DtlR.$dlv_fax,
							ShipActRecvIf_Chk01_DtlR.$dlv_str_ln_cd,
							ShipActRecvIf_Chk01_DtlR.$pri_prnt_flg,
							ShipActRecvIf_Chk01_DtlR.$itm_cd,
							ShipActRecvIf_Chk01_DtlR.$itm_sub1,
							ShipActRecvIf_Chk01_DtlR.$itm_sub2,
							ShipActRecvIf_Chk01_DtlR.$itm_sub3,
							ShipActRecvIf_Chk01_DtlR.$stk_arrv_bp_cd,
							ShipActRecvIf_Chk01_DtlR.$quality_typ,
							ShipActRecvIf_Chk01_DtlR.$stk_id_typ,
							ShipActRecvIf_Chk01_DtlR.$stk_bp_cd,
							ShipActRecvIf_Chk01_DtlR.$rsn_cd,
							ShipActRecvIf_Chk01_DtlR.$cst_po_no,
							ShipActRecvIf_Chk01_DtlR.$cst_po_d_no,
							ShipActRecvIf_Chk01_DtlR.$cst_dlv_inst_no,
							ShipActRecvIf_Chk01_DtlR.$cst_dlv_inst_d_no,
							ShipActRecvIf_Chk01_DtlR.$cst_itm_cd,
							ShipActRecvIf_Chk01_DtlR.$cst_itm_nm,
							ShipActRecvIf_Chk01_DtlR.$trd_rmrks,
							ShipActRecvIf_Chk01_DtlR.$trd_d_rmrks);
				}
			}
		}
		
		/**
		 * 取引パタン区分により、設定不要な項目をクリアする。
		 */
		protected void clearByTrdPtnTyp() {

			MCList<ShipActRecvIf_Chk01_DtlR> chkList = getChkList(up0());
			
			for (ShipActRecvIf_Chk01_DtlR shipActRecvIfR : chkList) {
				
				if (!MAC_TRD_PTN_TYP.isSLS(shipActRecvIfR.trd_ptn_typ())
						&& !MAC_TRD_PTN_TYP.isSHIP(shipActRecvIfR.trd_ptn_typ())) {
					
					shipActRecvIfR.clear(
							ShipActRecvIf_Chk01_DtlR.$cst_cd,
							ShipActRecvIf_Chk01_DtlR.$cst_po_no,
							ShipActRecvIf_Chk01_DtlR.$cst_po_d_no,
							ShipActRecvIf_Chk01_DtlR.$cst_dlv_inst_no,
							ShipActRecvIf_Chk01_DtlR.$cst_dlv_inst_d_no,
							ShipActRecvIf_Chk01_DtlR.$cst_itm_cd,
							ShipActRecvIf_Chk01_DtlR.$cst_itm_nm);
				}
			}
		}
		
		/**
		 * 価格印字を設定する。
		 * @param shipActRecvIfR 出荷実績受信ＩＦ
		 * @param shipAllocStsR 出荷引当状況
		 * @param shipActDR 出荷実績明細
		 */
		protected void setPriPrntFlg(ShipActRecvIf_Chk01_DtlR shipActRecvIfR, MST_SHIP_ALLOC_STS_R shipAllocStsR, MST_SHIP_ACT_D_R shipActDR) {
			
			if ( MSC_DLV_ID_TYP.isDLV(shipActRecvIfR.dlv_id_typ()) 
					&& MAC_TRD_PTN_TYP.isSLS(shipActRecvIfR.trd_ptn_typ())) {
				
				if (MAC_PRI_PRNT_TYP.contains(shipActRecvIfR.pri_prnt_typ())) {
					
					if (MAC_PRI_PRNT_TYP.isNOT_PRNT(shipActRecvIfR.pri_prnt_typ())) {
						shipActRecvIfR.pri_prnt_flg(false);
					}
					else if (MAC_PRI_PRNT_TYP.isPRNT(shipActRecvIfR.pri_prnt_typ())) {
						shipActRecvIfR.pri_prnt_flg(true);
					}
				}
				else if (isNull(shipActRecvIfR.pri_prnt_typ())) {
					
					if (isUpd(shipActRecvIfR) && !isNull(shipActDR) && isSame(shipActRecvIfR.dlv_id_cd(), shipActDR.dlv_id_cd())) {
						shipActRecvIfR.pri_prnt_flg(shipActDR.pri_prnt_flg());
					}
					else if (!shipActRecvIfR.uplnd_flg()) {
						shipActRecvIfR.pri_prnt_flg(shipAllocStsR.getBooleanNE(MST_SLO_D_R.$pri_prnt_flg));
					}
					else {
						shipActRecvIfR.pri_prnt_flg(_dlvCache.get(shipActRecvIfR.dlv_id_cd()).pri_prnt_flg());
					}
				}
				else {
					shipActRecvIfR.pri_prnt_flg(_dlvCache.get(shipActRecvIfR.dlv_id_cd()).pri_prnt_flg());
				}
			}
		}
		
		/**
		 * 手配ＮＯを設定する。
		 * @param shipActRecvIfR 出荷実績受信ＩＦ
		 * @param shipAllocStsR 出荷引当状況
		 * @param shipInstDR 出荷指図
		 */
		protected void setSno(ShipActRecvIf_Chk01_DtlR shipActRecvIfR, MST_SHIP_ALLOC_STS_R shipAllocStsR, MST_SHIP_INST_D_R shipInstDR) {

			if (shipActRecvIfR.uplnd_flg()) {
				return;
			}
			
			if (!shipAllocStsR.sno1_null_flg() || (!isNullOrNullVal(shipActRecvIfR.sno1()) && !isSame(shipActRecvIfR.sno1(), shipInstDR.sno1()))) {
				shipActRecvIfR.sno1(shipAllocStsR.sno1());
			}
			if (!shipAllocStsR.sno2_null_flg() || (!isNullOrNullVal(shipActRecvIfR.sno2()) && !isSame(shipActRecvIfR.sno2(), shipInstDR.sno2()))) {
				shipActRecvIfR.sno2(shipAllocStsR.sno2());
			}
			if (!shipAllocStsR.sno3_null_flg() || (!isNullOrNullVal(shipActRecvIfR.sno3()) && !isSame(shipActRecvIfR.sno3(), shipInstDR.sno3()))) {
				shipActRecvIfR.sno3(shipAllocStsR.sno3());
			}
			if (!shipAllocStsR.sno4_null_flg() || (!isNullOrNullVal(shipActRecvIfR.sno4()) && !isSame(shipActRecvIfR.sno4(), shipInstDR.sno4()))) {
				shipActRecvIfR.sno4(shipAllocStsR.sno4());
			}
		}
		
		/**
		 * 版ＮＯを設定する。
		 * @param shipActRecvIfR 出荷実績受信ＩＦ
 		 * @param shipAllocStsR 出荷引当状況
		 * @param shipActDR 出荷実績明細
		 */
		protected void setVerNo(ShipActRecvIf_Chk01_DtlR shipActRecvIfR, MST_SHIP_ALLOC_STS_R shipAllocStsR, MST_SHIP_ACT_D_R shipActDR) {
			
			if (shipActRecvIfR.ver_flg()) {
				
				if (isUpd(shipActRecvIfR)) {
					
					if (isSameItm(shipActRecvIfR, shipActDR) 
							&& isSame(shipActRecvIfR.lot_no(), shipActDR.lot_no()) 
							&& isSame(shipActRecvIfR.sublot_no(), shipActDR.sublot_no())) {
						
						shipActRecvIfR.ver_no(shipActDR.ver_no());
					}
					else {
						shipActRecvIfR.ver_no(getLotList(shipActRecvIfR).ver_no());
					}
				}
				else {
					
					if (!shipActRecvIfR.uplnd_flg() 
							&& isSame(shipActRecvIfR.lot_no(), shipAllocStsR.lot_no()) 
							&& isSame(shipActRecvIfR.sublot_no(), shipAllocStsR.sublot_no())) {
						// 計画の場合、出荷実績受信IFの品目を無視するので、品目が変わる可能性がない
						shipActRecvIfR.ver_no(shipAllocStsR.ver_no());
					}
					else {
						shipActRecvIfR.ver_no(getLotList(shipActRecvIfR).ver_no());
					}
				}
			}
		}
		
		/**
		 * 取引単位ＣＤを設定する。
		 * @param shipActRecvIfR 出荷実績受信ＩＦ
		 * @param shipAllocStsR 出荷引当状況
		 */
		protected void setTrdUnitCd(ShipActRecvIf_Chk01_DtlR shipActRecvIfR, MST_SHIP_ALLOC_STS_R shipAllocStsR) {
			
			if (isNull(shipActRecvIfR.ent_unit_cd())) {
				
				if (!shipActRecvIfR.uplnd_flg()) {
					shipActRecvIfR.ent_unit_cd(shipAllocStsR.ent_unit_cd());
				}
				else {
					MAM_ITM_R itmR = getItm(shipActRecvIfR);
					
					if (!isNull(itmR)) {
						shipActRecvIfR.ent_unit_cd(itmR.ship_unit_cd());
					}
				}
			}
		}
		
		/**
		 * 出荷時構成チェック不要を設定する。
		 * @param shipActRecvIfR 出荷実績受信ＩＦ
		 * @param shipActDR 出荷実績明細
		 */
		protected void setSkipChkShipFlg(ShipActRecvIf_Chk01_DtlR shipActRecvIfR, MST_SHIP_ACT_D_R shipActDR) {

			if (isUpd(shipActRecvIfR)) {
				
				shipActRecvIfR.skip_chk_ship_flg(shipActDR.skip_chk_ship_flg());
			}
			else {
				
				shipActRecvIfR.skip_chk_ship_flg(getItm(shipActRecvIfR).skip_chk_ship_flg());
			}
		}
		
		/**
		 * 負担部門を設定する。
		 * @param shipActRecvIfR 出荷実績受信ＩＦ
		 * @param shipInstDR 出荷指図明細
		 * @param shipActDR 出荷実績明細
		 */
		protected void setBdDptCd(ShipActRecvIf_Chk01_DtlR shipActRecvIfR, MST_SHIP_INST_D_R shipInstDR, MST_SHIP_ACT_D_R shipActDR) {
			
			if (!shipActRecvIfR.uplnd_flg()) {
				// 計画の場合、常に出荷指図明細から引継ぐ
				shipActRecvIfR.bd_dpt_cd(shipInstDR.bd_dpt_cd());
			}
			else {
				
				MAM_BIZ_RSN_R bizRsnR = getBizRsn(shipActRecvIfR);
				
				if (isNull(shipActRecvIfR.rsn_cd()) 
						|| isNull(bizRsnR) 
						|| (!(MAC_TRD_PTN_TYP.isSLS(shipActRecvIfR.trd_ptn_typ()) && bizRsnR.sls_acxfr_flg())
								&& !((MAC_TRD_PTN_TYP.isXFR(shipActRecvIfR.trd_ptn_typ()) 
										|| MAC_TRD_PTN_TYP.isXFR_RTN(shipActRecvIfR.trd_ptn_typ()))
										&& bizRsnR.acxfr_gi_flg()))) {
					// 理由ＣＤが未設定　または　他勘定ではない場合、クリアする
					shipActRecvIfR.bd_dpt_cd(null);
				}
				else {
					
					if (isNull(shipActRecvIfR.bd_dpt_cd())) {
						//　負担部門が未設定
						if (isUpd(shipActRecvIfR) 
								&& isSame(shipActRecvIfR.rsn_cd(), shipActDR.rsn_cd()) 
								&& !isNull(shipActDR.bd_dpt_cd())) {
							// 更新かつ理由ＣＤが変わってない場合、出荷実績明細の負担部門を保持
							shipActRecvIfR.bd_dpt_cd(shipActDR.bd_dpt_cd());
						}
						else {
							if (MAC_TRD_PTN_TYP.isSLS(shipActRecvIfR.trd_ptn_typ()) && bizRsnR.sls_acxfr_flg()) {
								// 取引区分が売上　かつ　理由が販売他勘定の場合、依頼元部門ＣＤを負担部門とする
								shipActRecvIfR.bd_dpt_cd(shipActRecvIfR.rqst_dpt_cd());
							}
							else if ((MAC_TRD_PTN_TYP.isXFR(shipActRecvIfR.trd_ptn_typ())
									|| MAC_TRD_PTN_TYP.isXFR_RTN(shipActRecvIfR.trd_ptn_typ()))
									&& bizRsnR.acxfr_gi_flg()) {
								
								// 取引区分が移動・移送または移動移送返品）　かつ 理由が他勘定出庫の場合、資産管理部門ＣＤを取得し、設定する
								String asstDptCd = execFuncString(createSqlId(LOGIC_ID, "MAPA_LOC$F_GET_ASST_DPT_CD", "01"), MAPA_LOC$F_GET_ASST_DPT_CD( value(shipActRecvIfR.ship_loc_cd()), value(shipActRecvIfR.ship_tm().startTimeOfDay())));
								
								shipActRecvIfR.bd_dpt_cd(asstDptCd);
							}
						}
					}
				}
			}
		}
		
		/**
		 * 入荷連絡備考を設定する。（売上または出荷の場合、クリアする）
		 * @param shipActRecvIfR 出荷実績受信ＩＦ
		 */
		protected void setArrCntRmrks(ShipActRecvIf_Chk01_DtlR shipActRecvIfR) {
			
			if (MAC_TRD_PTN_TYP.isSLS(shipActRecvIfR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSHIP(shipActRecvIfR.trd_ptn_typ())) {
				
				shipActRecvIfR.arr_cnt_rmrks(null);
			}
		}
		
		/**
		 * 入荷連絡備考を設定する。（売上または出荷の場合、クリアする）
		 * @param shipActRecvIfR 出荷実績受信ＩＦ
		 */
		protected void setGdCd(ShipActRecvIf_Chk01_DtlR shipActRecvIfR) {
			
			MAM_ITM_R itmR = getItm(shipActRecvIfR);
			
			if (!isNull(itmR.stk_mng_typ()) && !MAC_STK_MNG_TYP.isMNG(itmR.stk_mng_typ())) {
				shipActRecvIfR.gd_cd(null);
			}
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			
			down0().setAll(up0());
			
			if (!getChkList(up0()).isEmpty()) {
				
				setDownShipActCtrl();
				
				setDownShipActDel();
				
				setDownShipActUpd();
				
				setDownShipActIns();
				
				setDownShipActNone();
				
				setDownShipActCntr();
				
				setAbort();
				
				setPegNo(down1());
				
				setPegNo(down2());
				
				setPegNo(down3());
				
				setPegNo(down4());
				
				setDtlRowSeq();
			}
		}
		
		
		protected void hasErrFlgOff() {

		}
		
		/**
		 * 出荷実績登録の制御ブロックの下り伝聞を設定する。
		 */
		protected void setDownShipActCtrl() {
			
			ShipActIF_CtrlR ctrlR = ShipActIF_CtrlR.create();
			ctrlR.if_upd_typ(nvl(up1().if_upd_typ(), MAC_IF_UPD_TYP.SKIP_ERROR.value()));
			ctrlR.upd_cntr_chk_flg(false);
			ctrlR.bndl_prnt_flg(false);
			ctrlR.is_src_batch_flg(true);
			ctrlR.not_commit_flg(true);
			
			copyall(down1(), ctrlR);
		}
		
		/**
		 * 出荷実績用の下り電文を設定する。
		 */
		protected void setDownShipActDel() {
			
			ShipActIF_HdrR delHdrR = null;
			ShipActIF_DtlR delDtlR = null;
			MCList<ShipActIF_DtlR> delDtlL = null;
			
			for (MCList<MST_SHIP_ACT_D_R> shipActDL : _shipActDL.groupList(MST_SHIP_ACT_D_R.$ship_act_no)) {
				
				MST_SHIP_ACT_R shipActR = getShipAct(shipActDL.get(0).ship_act_no());
				
				int ifDelSize = 0;
				
				for (MST_SHIP_ACT_D_R shipActDR : shipActDL) {
				
					ShipActRecvIf_Chk01_DtlR shipActRecvIfR = getShipActRecvIfR(shipActDR);
					
					if (!isNull(shipActRecvIfR) && !shipActRecvIfR.err_flg() && isDel(shipActRecvIfR)) {
						ifDelSize++;
					}
				}
				
				if (isSame(shipActDL.size(), ifDelSize)) {
					// 削除件数が出荷実績明細の件数と一致する場合、出荷実績を取り消すとする
					delHdrR = ShipActIF_HdrR.create();
					
					// 外部出荷実績NO順で出荷実績を削除する
					shipActDL.sort(MST_SHIP_ACT_D_R.$ext_sys_cd, MST_SHIP_ACT_D_R.$ext_ship_act_no);
					ShipActRecvIf_Chk01_DtlR hdrShipActIfR = getShipActRecvIfR(shipActDL.get(0));
					
					setShipActHdrDel(delHdrR, hdrShipActIfR, shipActR);
					
					delDtlL = MCList.create(ShipActIF_DtlR.class);
					
					for (MST_SHIP_ACT_D_R shipActDR : shipActDL) {
						
						ShipActRecvIf_Chk01_DtlR shipActRecvIfR = getShipActRecvIfR(shipActDR);
						
						delDtlR = ShipActIF_DtlR.create();

						setShipActDtlDel(delDtlR, shipActRecvIfR, shipActDR, delHdrR);
						delDtlL.add(delDtlR);
					}
					
					down2().add(delHdrR);
					down3().addAll(delDtlL);
				}
			}
		}
		
		/**
		 * 出荷実績登録サービスの削除前チェック用の出荷実績ヘッダ情報を設定する。
		 * @param hdrR 削除前チェックヘッダ
		 * @param shipActRecvIfR 出荷実績受信ＩＦ
		 * @param shipActR 出荷実績ヘッダ
		 */
		protected void setShipActHdrDel(ShipActIF_HdrR hdrR, ShipActRecvIf_Chk01_DtlR shipActRecvIfR, MST_SHIP_ACT_R shipActR) {
			
			hdrR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			
			hdrR.hdr_dtl_peg_no(_hdrPegNo);
			_hdrPegNo++;
			
			hdrR.row_seq(hdrR.hdr_dtl_peg_no());
			
			hdrR.can_ac_dt(shipActR.ac_dt());
			hdrR.ship_act_no(shipActR.ship_act_no());
			hdrR.ship_fr_lg_grp_cd(shipActR.ship_fr_lg_grp_cd());
			
			hdrR.setParamIndex(shipActRecvIfR.sa().getParamIndex());
			hdrR.setParamRowIndex(shipActRecvIfR.sa().getParamRowIndex());
		}
		
		/**
		 * 出荷実績登録サービスの削除前チェック用の出荷実績明細情報を設定する。
		 * @param dtlR 削除前チェック明細
		 * @param shipActRecvIfR 出荷実績受信ＩＦ
		 * @param shipActDR 出荷実績明細
		 * @param hdrR 削除前チェックヘッダ
		 */
		protected void setShipActDtlDel(ShipActIF_DtlR dtlR, ShipActRecvIf_Chk01_DtlR shipActRecvIfR, MST_SHIP_ACT_D_R shipActDR, ShipActIF_HdrR hdrR) {
			
			shipActRecvIfR.hdr_dtl_peg_no(_hdrPegNo);
			
			dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			dtlR.hdr_dtl_peg_no(hdrR.hdr_dtl_peg_no());
			dtlR.ship_act_d_no(shipActDR.ship_act_d_no());
			dtlR.ship_act_no(hdrR.ship_act_no());
			
			dtlR.setParamIndex(shipActRecvIfR.sa().getParamIndex());
			dtlR.setParamRowIndex(shipActRecvIfR.sa().getParamRowIndex());
		}
		
		/**
		 * 出荷実績新規登録用の下り電文を設定する。
		 */
		protected void setDownShipActIns() {
			
			MCList<ShipActRecvIf_Chk01_DtlR> insShipActIfL = MCList.create(ShipActRecvIf_Chk01_DtlR.class);
			
			MCList<ShipActRecvIf_Chk01_DtlR> chkList = getChkList(up0());
			
			MCIndexKey crudIdxkey = chkList.createIndex(ShipActRecvIf_Chk01_DtlR.$data_crud_typ);
			insShipActIfL.addAll(chkList.subList(crudIdxkey, MAC_DATA_CRUD_TYP.CRT.value()));
			insShipActIfL.addAll(_shipActSplitInsIfL);
			
			MCList<ShipActIF_DtlR> dtlL = MCList.create(ShipActIF_DtlR.class);
			ShipActIF_DtlR dtlR = null;
			
			for (MCList<ShipActRecvIf_Chk01_DtlR> insL : groupListByHdrKeys(insShipActIfL)) {
				
				dtlL = MCList.create(ShipActIF_DtlR.class);
				
				ShipActRecvIf_Chk01_DtlR hdrIfR = insL.get(0);
				
				// データ更新区分が「新規」のレコードは、常に出荷実績を新規登録する。（既存の出荷実績に纏まらない）
				ShipActIF_HdrR hdrR = ShipActIF_HdrR.create();
				
				setShipActHdrIns(hdrR, hdrIfR);
				down2().add(hdrR);

				for (ShipActRecvIf_Chk01_DtlR insIfR : insL) {
					
					dtlR = ShipActIF_DtlR.create();
					
					setShipActDtlIns(dtlR, insIfR, hdrR);
					dtlL.add(dtlR);
				}
				
				down3().addAll(dtlL);
			}
		}
		
		/**
		 * 受注削除用の下り電文を設定する。
		 */
		protected void setDownShipActNone() {
			
			MCList<MST_SHIP_ACT_D_R> shipActDNoneL = null;
			
			for (MCList<MST_SHIP_ACT_D_R> shipActDL : _shipActDL.groupList(MST_SHIP_ACT_D_R.$ship_act_no)) {
				
				shipActDNoneL = MCList.create(MST_SHIP_ACT_D_R.class);
				
				for (MST_SHIP_ACT_D_R shipActDR : shipActDL) {
				
					ShipActRecvIf_Chk01_DtlR shipActRecvIfR = getShipActRecvIfR(shipActDR);
					
					if (isNull(shipActRecvIfR) || shipActRecvIfR.err_flg()) {
						shipActDNoneL.add(shipActDR.clone());
					}
				}
				
				MCList<ShipActIF_DtlR> dtlL = MCList.create(ShipActIF_DtlR.class);
				ShipActIF_DtlR dtlR = null;
				
				for (MST_SHIP_ACT_D_R shipActDR : shipActDNoneL) {
					
					ShipActIF_HdrR hdrR = getSameNoneHdr(shipActDR);
					
					if (!isNull(hdrR)) {
						
						dtlR = ShipActIF_DtlR.create();
						
						setShipActDtlNone(dtlR, shipActDR, hdrR);
						
						dtlL.add(dtlR);
					}
				}
				
				down3().addAll(dtlL);
			}
		}
		
		/**
		 * 出荷指図明細単位で打切/打切解除を行うように設定する。
		 */
		protected void setAbort() {

			for (MCList<ShipActIF_DtlR> shipActIfGrpL : down3().groupList(
					ShipActIF_DtlR.$hdr_dtl_peg_no, ShipActIF_DtlR.$ship_inst_d_no)) {
				
				if (!shipActIfGrpL.isEmpty() && isNull(shipActIfGrpL.get(0).ship_inst_d_no())) {
					continue;
				}
				
				boolean abortFlg = false;
				// 同一出荷指図明細ＮＯで打切がオンのレコードが存在する場合に、すべて打切りとする
				if (!shipActIfGrpL.subList(r -> 
						(MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD((r.data_crud_typ())))
						&& r.getParamIndex() != -1
						&& r.getParamRowIndex() != -1
						&& r.abort_flg()).isEmpty()) {
					
					abortFlg = true;
				}
				
				for (ShipActIF_DtlR shipActIfDtlR :shipActIfGrpL) {
					if (!MAC_DATA_CRUD_TYP.isDEL(shipActIfDtlR.data_crud_typ())) {
						shipActIfDtlR.abort_flg(abortFlg);
					}
				}
			}
		}
		
		/**
		 * 電文から同一出荷実績ヘッダを取得する。
		 * @param sloDR 受注明細
		 * @return 受注ヘッダ
		 */
		protected ShipActIF_HdrR getSameNoneHdr(MST_SHIP_ACT_D_R shipActDR) {
			
			for (ShipActIF_HdrR hdrR : down2()) {
				
				if (isSame(shipActDR.ship_act_no(), hdrR.ship_act_no())) {
					return hdrR;
				}
			}
			
			return null;
		}
		
		/**
		 * 出荷実績削除用の下り電文を設定する。
		 */
		protected void setDownShipActUpd() {
			
			MCIndexKey idxkey = _shipActL.createIndex(MST_SHIP_ACT_D_R.$ship_act_no);
			
			MCIndexKey delIdxkey = down3().createIndex(ShipActIF_HdrR.$data_crud_typ, ShipActIF_HdrR.$ship_act_no);
			
			MCList<ShipActRecvIf_Chk01_DtlR> shipActUpdIfL = null;
			MCList<ShipActRecvIf_Chk01_DtlR> shipActDelIfL = null;
			
			for (MCList<MST_SHIP_ACT_D_R> shipActDL : _shipActDL.groupList(MST_SHIP_ACT_D_R.$ship_act_no)) {
				
				MST_SHIP_ACT_R shipActR = _shipActL.getFirst(idxkey, shipActDL.get(0).ship_act_no());
				
				shipActUpdIfL = MCList.create(ShipActRecvIf_Chk01_DtlR.class);
				shipActDelIfL = MCList.create(ShipActRecvIf_Chk01_DtlR.class);
				
				for (MST_SHIP_ACT_D_R shipActDR : shipActDL) {
				
					ShipActRecvIf_Chk01_DtlR shipActRecvIfR = getShipActRecvIfR(shipActDR);
					
					if (!isNull(shipActRecvIfR) && !shipActRecvIfR.err_flg()) {
						if (isDel(shipActRecvIfR))  {
							if (!down3().contains(delIdxkey, MAC_DATA_CRUD_TYP.DEL.value(), shipActR.ship_act_no())) {
								shipActDelIfL.add(shipActRecvIfR);
							}
						}
						else {
							shipActUpdIfL.add(shipActRecvIfR);
						}
					}
				}
				
				int hdrSize = groupByHdrKeys(shipActUpdIfL).size();
				
				ShipActIF_HdrR hdrR = null;
				MCList<ShipActIF_DtlR> dtlL = MCList.create(ShipActIF_DtlR.class);
				ShipActIF_DtlR dtlR = null;
				
				if (hdrSize == 1) {
					
					ShipActRecvIf_Chk01_DtlR hdrIfR = shipActUpdIfL.get(0);
					
					hdrR = ShipActIF_HdrR.create();
					setShipActHdrUpd(hdrR, hdrIfR, shipActR);
					
					for (ShipActRecvIf_Chk01_DtlR shipActRecvIfR : shipActUpdIfL) {
						
						MST_SHIP_ACT_D_R shipActDR = getShipActD(shipActRecvIfR.ship_act_d_no());
						
						dtlR = ShipActIF_DtlR.create();
						setShipActDtlUpd(dtlR, shipActRecvIfR, shipActDR, hdrR);
						dtlL.add(dtlR);
					}
				}
				else if (hdrSize > 1) {
					
					_shipActSplitInsIfL = MCList.create(ShipActRecvIf_Chk01_DtlR.class);
					
					boolean isFirst = false;
					for (MCList<ShipActRecvIf_Chk01_DtlR> subShipActIfL : groupListByHdrKeys(shipActUpdIfL)) {
						
						isFirst = false;
						
						if (isNull(hdrR)) {
							
							ShipActRecvIf_Chk01_DtlR hdrIfR = subShipActIfL.get(0);
							
							hdrR = ShipActIF_HdrR.create();
							setShipActHdrUpd(hdrR, hdrIfR, shipActR);
							
							isFirst = true;
						}
						
						for (ShipActRecvIf_Chk01_DtlR shipActRecvIfR : subShipActIfL) {
							
							MST_SHIP_ACT_D_R shipActDR = getShipActD(shipActRecvIfR.ship_act_d_no());
							
							dtlR = ShipActIF_DtlR.create();
							
							setShipActDtlUpd(dtlR, shipActRecvIfR, shipActDR, hdrR);
							
							if (!isFirst) {
								// 削除⇒新規
								dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
								
								ShipActRecvIf_Chk01_DtlR splitIfR = shipActRecvIfR.clone();
								splitIfR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
								_shipActSplitInsIfL.add(splitIfR);
							}
						
							dtlL.add(dtlR);
						}
					}
				}
				
				for (ShipActRecvIf_Chk01_DtlR shipActRecvIfR : shipActDelIfL) {
					
					if (isNull(hdrR)) {
						
						hdrR = ShipActIF_HdrR.create();
						
						setShipActHdrNone(hdrR, shipActRecvIfR, shipActR);
					}
					
					MST_SHIP_ACT_D_R shipActDR = getShipActD(shipActRecvIfR.ship_act_d_no());
					
					dtlR = ShipActIF_DtlR.create();
					
					setShipActDtlUpd(dtlR, shipActRecvIfR, shipActDR, hdrR);
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					
					dtlL.add(dtlR);
				}
				
				down2().add(hdrR);
				down3().addAll(dtlL);
			}
		}
		
		/**
		 * 更新カウンタ関項目を設定する。<br>
		 * 出荷実績サービスでは、ブロックの出荷引当状況ＮＯ、出荷進捗NOを使用するため、設定する。(設定しないと、実行エラーが発生する)
		 */
		protected void setDownShipActCntr() {
			
			MCList<ShipActIF_DtlR> grpL = down3().groupBy(
					ShipActIF_DtlR.$hdr_dtl_peg_no, 
					ShipActIF_DtlR.$ship_alloc_sts_no, 
					ShipActIF_DtlR.$ship_pr_no);
			setShipPr(grpL);
			
			addAll(down4(), grpL, createMap_ShipActIF_CntrR_ShipActIF_DtlR());
			
			// 上り電文に設定必要がないため、一時に設定した出荷進捗ＮＯをクリア
			down3().clear(ShipActIF_DtlR.$ship_pr_no);
		}

		protected void setShipPr(MCList<ShipActIF_DtlR> grpL){
			MCList<ShipActIF_DtlR> shipActIfL = MCList.create(ShipActIF_DtlR.class);

			for (ShipActIF_DtlR grpR : grpL) {
				MCList<MST_SHIP_ALLOC_STS_R> shipAllocStsNoL = _shipAllocStsL.subList(_shipAllocStsIdxkey, grpR.ship_alloc_sts_no());
				for (MST_SHIP_ALLOC_STS_R shipAllocStsNoR : shipAllocStsNoL) {
					if (!(isSame(shipAllocStsNoR.ship_alloc_sts_no(), grpR.ship_alloc_sts_no())
							&& isSame(shipAllocStsNoR.getStringNE(MST_SHIP_SCHD_R.$ship_pr_no), grpR.ship_pr_no()))) {
						ShipActIF_DtlR shipActIfR = ShipActIF_DtlR.create();
						shipActIfR.hdr_dtl_peg_no(grpR.hdr_dtl_peg_no());
						shipActIfR.ship_alloc_sts_no(shipAllocStsNoR.ship_alloc_sts_no());
						shipActIfR.ship_pr_no(shipAllocStsNoR.getStringNE(MST_SHIP_SCHD_R.$ship_pr_no));
						shipActIfL.add(shipActIfR);
					}
				}
			}
			grpL.addAll(shipActIfL.groupBy(
					ShipActIF_DtlR.$hdr_dtl_peg_no, 
					ShipActIF_DtlR.$ship_alloc_sts_no, 
					ShipActIF_DtlR.$ship_pr_no));
		}
		
		/**
		 * 明細の処理順を設定する。
		 */
		protected void setDtlRowSeq() {

			for (ShipActIF_DtlR dtlR : down3()) {
				
				dtlR.row_seq(dtlR.peg_no());
			}
		}
				
		/**
		 * 出荷実績登録サービスの登録前チェック用（新規）の出荷実績ヘッダ情報を設定する。
		 * @param hdrR 登録前チェックヘッダ
		 * @param shipActRecvIfR 出荷実績受信ＩＦ
		 */
		protected void setShipActHdrIns(ShipActIF_HdrR hdrR, ShipActRecvIf_Chk01_DtlR shipActRecvIfR) {
			
			copy(hdrR, shipActRecvIfR, createMap_ShipActIF_HdrR_ShipActRecvIf_Chk01_DtlR());
			
			hdrR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			
			hdrR.hdr_dtl_peg_no(_hdrPegNo);
			_hdrPegNo++;
			
			hdrR.row_seq(hdrR.hdr_dtl_peg_no());
			
			hdrR.setParamIndex(shipActRecvIfR.sa().getParamIndex());
			hdrR.setParamRowIndex(shipActRecvIfR.sa().getParamRowIndex());
		}
		
		/**
		 * 出荷実績登録サービスの登録前チェック用（新規）の出荷実績明細情報を設定する。
		 * @param dtlR 登録前チェック明細
		 * @param shipActRecvIfR 出荷実績受信ＩＦ
		 * @param hdrR 登録前チェックヘッダ
		 */
		protected void setShipActDtlIns(ShipActIF_DtlR dtlR, ShipActRecvIf_Chk01_DtlR shipActRecvIfR, ShipActIF_HdrR hdrR) {
			
			shipActRecvIfR.hdr_dtl_peg_no(_hdrPegNo);
			
			copy(dtlR, shipActRecvIfR, createMap_ShipActIF_DtlR_ShipActRecvIf_Chk01_DtlR());
			
			dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());

			dtlR.hdr_dtl_peg_no(hdrR.hdr_dtl_peg_no());
			
			dtlR.setParamIndex(shipActRecvIfR.sa().getParamIndex());
			dtlR.setParamRowIndex(shipActRecvIfR.sa().getParamRowIndex());
		}
		
		/**
		 * 出荷実績登録サービスの登録前チェック用（更新）の出荷実績ヘッダ情報を設定する。
		 * @param hdrR 登録前チェックヘッダ
		 * @param shipActRecvIfR 出荷実績受信ＩＦ
		 * @param shipActR　出荷実績ヘッダ
		 */
		protected void setShipActHdrUpd(ShipActIF_HdrR hdrR, ShipActRecvIf_Chk01_DtlR shipActRecvIfR, MST_SHIP_ACT_R shipActR) {
			
			copy(hdrR, shipActRecvIfR, createMap_ShipActIF_HdrR_ShipActRecvIf_Chk01_DtlR());
			
			hdrR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			
			hdrR.hdr_dtl_peg_no(_hdrPegNo);
			_hdrPegNo++;
			
			hdrR.row_seq(hdrR.hdr_dtl_peg_no());
			
			hdrR.can_ac_dt(shipActR.ac_dt());
			
			hdrR.setParamIndex(shipActRecvIfR.sa().getParamIndex());
			hdrR.setParamRowIndex(shipActRecvIfR.sa().getParamRowIndex());
		}
		
		/**
		 * 出荷実績登録サービスの登録前チェック用（更新）の出荷実績明細情報を設定する。
		 * @param dtlR 登録前チェック明細
		 * @param shipActRecvIfR 出荷実績受信ＩＦ
		 * @param shipActDR　出荷実績明細
		 * @param hdrR 登録前チェックヘッダ
		 */
		protected void setShipActDtlUpd(ShipActIF_DtlR dtlR, ShipActRecvIf_Chk01_DtlR shipActRecvIfR, MST_SHIP_ACT_D_R shipActDR, ShipActIF_HdrR hdrR) {
			
			shipActRecvIfR.hdr_dtl_peg_no(_hdrPegNo);
			
			copy(dtlR, shipActRecvIfR, createMap_ShipActIF_DtlR_ShipActRecvIf_Chk01_DtlR());
			
			dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			
			dtlR.hdr_dtl_peg_no(hdrR.hdr_dtl_peg_no());
			
			dtlR.arr_cnt_rmrks_upd_flg(true);				
			dtlR.intr_d_rmrks_upd_flg(true);
			
			dtlR.dlv_slip_d_no(shipActDR.dlv_slip_d_no());				
			dtlR.dlv_slip_no(shipActDR.dlv_slip_no());
			
			dtlR.setParamIndex(shipActRecvIfR.sa().getParamIndex());
			dtlR.setParamRowIndex(shipActRecvIfR.sa().getParamRowIndex());
		}
		
		/**
		 * 出荷実績登録サービスの登録前チェック用（ヘッダ変更なし）の出荷実績ヘッダ情報を設定する。<br>
		 * 出荷実績受信ＩＦに削除のみ設定されている場合に使用する。
		 * @param hdrR 登録前チェックヘッダ
		 * @param shipActRecvIfR 出荷実績受信ＩＦ
		 * @param shipActR 出荷実績ヘッダ
		 */
		protected void setShipActHdrNone(ShipActIF_HdrR hdrR, ShipActRecvIf_Chk01_DtlR shipActRecvIfR, MST_SHIP_ACT_R shipActR) {
			
			copy(hdrR, shipActR, createMap_ShipActIF_HdrR_MST_SHIP_ACT_R());
			
			hdrR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
		
			hdrR.hdr_dtl_peg_no(_hdrPegNo);
			_hdrPegNo++;
			
			hdrR.row_seq(hdrR.hdr_dtl_peg_no());
			
			hdrR.can_ac_dt(shipActR.ac_dt());
			
			hdrR.setParamIndex(shipActRecvIfR.sa().getParamIndex());
			hdrR.setParamRowIndex(shipActRecvIfR.sa().getParamRowIndex());
		}
		
		/**
		 * 出荷実績登録サービスの登録前チェック用（明細変更なし）の出荷実績ヘッダ情報を設定する。<br>
		 * ヘッダの項目が変更された場合、対応する明細項目のデフォルト値を設定する。
		 * @param dtlR 登録前チェック明細
		 * @param shipActDR　出荷実績明細
		 * @param hdrR 登録前チェックヘッダ
		 */
		protected void setShipActDtlNone(ShipActIF_DtlR dtlR, MST_SHIP_ACT_D_R shipActDR, ShipActIF_HdrR hdrR) {
			
			copy(dtlR, shipActDR, createMap_ShipActIF_DtlR_MST_SHIP_ACT_D_R());
			
			dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			
			dtlR.hdr_dtl_peg_no(hdrR.hdr_dtl_peg_no());
			
			// 紐付く出荷実績受信ＩＦが存在しないため、ParamIndexとParamRowIndexを設定しない
		}
		
		/**
		 * 出荷実績受信ＩＦのヘッダ項目を返す。
		 * @return ヘッダ項目
		 */
		protected String[] getShipActRecvIfHdrKey() {

			return new String[] {
					
					ShipActRecvIf_Chk01_DtlR.$ship_inst_no,
					ShipActRecvIf_Chk01_DtlR.$ship_tm,
					ShipActRecvIf_Chk01_DtlR.$dlv_tm,
					ShipActRecvIf_Chk01_DtlR.$cst_cd,
					ShipActRecvIf_Chk01_DtlR.$rqst_dpt_cd,
					ShipActRecvIf_Chk01_DtlR.$rqst_usr_cd,
					ShipActRecvIf_Chk01_DtlR.$ship_dpt_cd,
					ShipActRecvIf_Chk01_DtlR.$ship_usr_cd,
					ShipActRecvIf_Chk01_DtlR.$ship_fr_lg_grp_cd,
					ShipActRecvIf_Chk01_DtlR.$ship_to_id_typ,
					ShipActRecvIf_Chk01_DtlR.$ship_to_id_cd,
					ShipActRecvIf_Chk01_DtlR.$ship_to_id_nm,
					ShipActRecvIf_Chk01_DtlR.$ship_to_id_cd,
					ShipActRecvIf_Chk01_DtlR.$ship_to_addr1,
					ShipActRecvIf_Chk01_DtlR.$ship_to_addr2,
					ShipActRecvIf_Chk01_DtlR.$ship_to_addr3,
					ShipActRecvIf_Chk01_DtlR.$ship_to_addr4,
					ShipActRecvIf_Chk01_DtlR.$ship_to_cntct_psn,
					ShipActRecvIf_Chk01_DtlR.$ship_to_tel,
					ShipActRecvIf_Chk01_DtlR.$ship_to_fax,
					ShipActRecvIf_Chk01_DtlR.$iv_no,
					ShipActRecvIf_Chk01_DtlR.$uplnd_flg};
		}
		
		/**
		 * 出荷実績受信ＩＦのヘッダ項目（計画外）を返す。
		 * @return ヘッダ項目
		 */
		protected String[] getShipActRecvIfUplndHdrKey() {

			String[] uplndHdrKeys = new String[] {
					ShipActRecvIf_Chk01_DtlR.$trd_cd,
					ShipActRecvIf_Chk01_DtlR.$dlv_id_typ,
					ShipActRecvIf_Chk01_DtlR.$dlv_id_cd,
					ShipActRecvIf_Chk01_DtlR.$dlv_id_nm,
					ShipActRecvIf_Chk01_DtlR.$dlv_zip_cd,
					ShipActRecvIf_Chk01_DtlR.$dlv_addr1,
					ShipActRecvIf_Chk01_DtlR.$dlv_addr2,
					ShipActRecvIf_Chk01_DtlR.$dlv_addr3,
					ShipActRecvIf_Chk01_DtlR.$dlv_addr4,
					ShipActRecvIf_Chk01_DtlR.$dlv_cntct_dpt,
					ShipActRecvIf_Chk01_DtlR.$dlv_cntct_psn,
					ShipActRecvIf_Chk01_DtlR.$dlv_tel,
					ShipActRecvIf_Chk01_DtlR.$dlv_fax,
					ShipActRecvIf_Chk01_DtlR.$dlv_str_ln_cd};
			
			List<String> keyL = new ArrayList<String>();
			keyL.addAll(java.util.Arrays.asList(getShipActRecvIfHdrKey()));
			keyL.addAll(java.util.Arrays.asList(uplndHdrKeys));
			
			return keyL.toArray(new String[0]);
		}
		/**
		 * 計画外ＦＬＧを基づき、対応する計画と計画外のヘッダ項目でグループ化したListの配列を返す。
		 * @param dtlL 出荷実績受信ＩＦリスト
		 * @return ヘッダ項目でグループ化したListの配列
		 */
		@SuppressWarnings("unchecked")	// 総称配列の警告回避
		protected MCList<ShipActRecvIf_Chk01_DtlR>[] groupListByHdrKeys(MCList<ShipActRecvIf_Chk01_DtlR> dtlL) {
			
			MCList<ShipActRecvIf_Chk01_DtlR> plndL = dtlL.createInstance();
			MCList<ShipActRecvIf_Chk01_DtlR> uplndL = dtlL.createInstance();
			allocateByUplnd(dtlL, plndL, uplndL);
			
			List<MCList<ShipActRecvIf_Chk01_DtlR>> grpL =  new ArrayList<MCList<ShipActRecvIf_Chk01_DtlR>>();
			if (!plndL.isEmpty()) {
				grpL.addAll(java.util.Arrays.asList(plndL.groupList(getShipActRecvIfHdrKey())));
			}
			
			if (!uplndL.isEmpty()) {
				grpL.addAll(java.util.Arrays.asList(uplndL.groupList(getShipActRecvIfUplndHdrKey())));
			}
			
			return grpL.toArray(new MCList[0]);
		}
		/**
		 * 計画外ＦＬＧを基づき、対応する計画と計画外のヘッダ項目でグループ化したリストを返す。
		 * @param dtlL 出荷実績受信ＩＦリスト
		 * @return ヘッダ項目でグループ化したリスト
		 */
		protected MCList<ShipActRecvIf_Chk01_DtlR> groupByHdrKeys(MCList<ShipActRecvIf_Chk01_DtlR> dtlL) {
			
			MCList<ShipActRecvIf_Chk01_DtlR> plndL = dtlL.createInstance();
			MCList<ShipActRecvIf_Chk01_DtlR> uplndL = dtlL.createInstance();
			allocateByUplnd(dtlL, plndL, uplndL);
			
			MCList<ShipActRecvIf_Chk01_DtlR> grpL = MCList.create(ShipActRecvIf_Chk01_DtlR.class);
			if (!plndL.isEmpty()) {
				grpL.addAll(plndL.groupBy(getShipActRecvIfHdrKey()));
			}
			
			if (!uplndL.isEmpty()) {
				grpL.addAll(uplndL.groupBy(getShipActRecvIfUplndHdrKey()));
			}
			
			return grpL;
		}
		/**
		 * 引数に指定されたリストを計画リストと計画外リストに振分ける
		 * @param dtlL 出荷実績受信ＩＦリスト
		 * @param plndL 計画リスト
		 * @param uplndL 計画外リスト
		 */
		protected void allocateByUplnd(MCList<ShipActRecvIf_Chk01_DtlR> dtlL, MCList<ShipActRecvIf_Chk01_DtlR> plndL, MCList<ShipActRecvIf_Chk01_DtlR> uplndL) {
			
			for (ShipActRecvIf_Chk01_DtlR dtlR : dtlL) {
				if (dtlR.uplnd_flg()) {
					uplndL.add(dtlR);
				}
				else {
					plndL.add(dtlR);
				}
			}
		}
		/**
		 * 出荷実績明細に紐付く出荷実績受信ＩＦを取得する。
		 * @param shipActDR 出荷実績明細
		 * @return 出荷実績受信ＩＦ
		 */
		protected ShipActRecvIf_Chk01_DtlR getShipActRecvIfR(MST_SHIP_ACT_D_R shipActDR) {
			
			if (_shipActRecvIfIdxkey == null) {
				_shipActRecvIfIdxkey = up0().createIndex(
						ShipActRecvIf_Chk01_DtlR.$ext_sys_cd, 
						ShipActRecvIf_Chk01_DtlR.$ext_ship_act_no);
			}

			return up0().getFirst(_shipActRecvIfIdxkey, shipActDR.ext_sys_cd(), shipActDR.ext_ship_act_no());
		}
		
		/**
		 * 指定された出荷実績受信ＩＦが新規かどうか。
		 * @param shipActRecvIfR 出荷実績受信ＩＦ
		 * @return　新規の場合はtrue
		 */
		protected boolean isCrt(ShipActRecvIf_Chk01_DtlR shipActRecvIfR) {
			
			return MAC_DATA_CRUD_TYP.isCRT(shipActRecvIfR.data_crud_typ());
		}
		
		/**
		 * 指定された出荷実績受信ＩＦが更新かどうか。
		 * @param shipActRecvIfR 出荷実績受信ＩＦ
		 * @return　新規の場合はtrue
		 */
		protected boolean isUpd(ShipActRecvIf_Chk01_DtlR shipActRecvIfR) {
			
			return MAC_DATA_CRUD_TYP.isUPD(shipActRecvIfR.data_crud_typ());
		}
		
		/**
		 * 指定された出荷実績受信ＩＦが更新かどうか。
		 * @param shipActRecvIfR 出荷実績受信ＩＦ
		 * @return　削除の場合はtrue
		 */
		protected boolean isDel(ShipActRecvIf_Chk01_DtlR shipActRecvIfR) {
			
			return MAC_DATA_CRUD_TYP.isDEL(shipActRecvIfR.data_crud_typ());
		}
		
		/**
		 * 出荷実績受信ＩＦの品目と出荷実績の品目が同一品目かどうか。
		 * @param shipActRecvIfR 出荷実績受信ＩＦ
		 * @param shipActDR 出荷実績明細
		 * @return 同一品目の場合はtrue
		 */
		protected boolean isSameItm(ShipActRecvIf_Chk01_DtlR shipActRecvIfR, MST_SHIP_ACT_D_R shipActDR) {
			
			return isSame(shipActRecvIfR.itm_cd(), shipActDR.itm_cd())
					&& isSame(shipActRecvIfR.itm_sub1(), shipActDR.itm_sub1())
					&& isSame(shipActRecvIfR.itm_sub2(), shipActDR.itm_sub2())
					&& isSame(shipActRecvIfR.itm_sub3(), shipActDR.itm_sub3());
		}
		
		/**
		 * 出荷実績受信ＩＦの品目と出荷指図の品目が同一品目かどうか。
		 * @param shipActRecvIfR 出荷実績受信ＩＦ
		 * @param shipInstDR 出荷指図明細
		 * @return 同一品目の場合はtrue
		 */
		protected boolean isSameItm(ShipActRecvIf_Chk01_DtlR shipActRecvIfR, MST_SHIP_INST_D_R shipInstDR) {
			
			return isSame(shipActRecvIfR.itm_cd(), shipInstDR.itm_cd())
					&& isSame(shipActRecvIfR.itm_sub1(), shipInstDR.itm_sub1())
					&& isSame(shipActRecvIfR.itm_sub2(), shipInstDR.itm_sub2())
					&& isSame(shipActRecvIfR.itm_sub3(), shipInstDR.itm_sub3());
		}
		
		protected Map_ShipActIF_HdrR_ShipActRecvIf_Chk01_DtlR<ShipActIF_HdrR,ShipActRecvIf_Chk01_DtlR> createMap_ShipActIF_HdrR_ShipActRecvIf_Chk01_DtlR() {
			return new Map_ShipActIF_HdrR_ShipActRecvIf_Chk01_DtlR<ShipActIF_HdrR, ShipActRecvIf_Chk01_DtlR>();
		}

		public class Map_ShipActIF_HdrR_ShipActRecvIf_Chk01_DtlR<D extends ShipActIF_HdrR, S extends ShipActRecvIf_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ShipActIF_HdrR.$ship_act_no, ShipActRecvIf_Chk01_DtlR.$ship_act_no);
				addColumnPathMap(ShipActIF_HdrR.$ship_inst_no, ShipActRecvIf_Chk01_DtlR.$ship_inst_no);
				addColumnPathMap(ShipActIF_HdrR.$ship_tm, ShipActRecvIf_Chk01_DtlR.$ship_tm);
				addColumnPathMap(ShipActIF_HdrR.$dlv_tm, ShipActRecvIf_Chk01_DtlR.$dlv_tm);
				addColumnPathMap(ShipActIF_HdrR.$rqst_dpt_cd, ShipActRecvIf_Chk01_DtlR.$rqst_dpt_cd);
				addColumnPathMap(ShipActIF_HdrR.$rqst_usr_cd, ShipActRecvIf_Chk01_DtlR.$rqst_usr_cd);
				addColumnPathMap(ShipActIF_HdrR.$ship_fr_lg_grp_cd, ShipActRecvIf_Chk01_DtlR.$ship_fr_lg_grp_cd);
				addColumnPathMap(ShipActIF_HdrR.$ship_dpt_cd, ShipActRecvIf_Chk01_DtlR.$ship_dpt_cd);
				addColumnPathMap(ShipActIF_HdrR.$ship_usr_cd, ShipActRecvIf_Chk01_DtlR.$ship_usr_cd);
				addColumnPathMap(ShipActIF_HdrR.$cst_cd, ShipActRecvIf_Chk01_DtlR.$cst_cd);
				addColumnPathMap(ShipActIF_HdrR.$ship_to_id_typ, ShipActRecvIf_Chk01_DtlR.$ship_to_id_typ);
				addColumnPathMap(ShipActIF_HdrR.$ship_to_id_cd, ShipActRecvIf_Chk01_DtlR.$ship_to_id_cd);
				addColumnPathMap(ShipActIF_HdrR.$ship_to_zip_cd, ShipActRecvIf_Chk01_DtlR.$ship_to_zip_cd);
				addColumnPathMap(ShipActIF_HdrR.$ship_to_addr1, ShipActRecvIf_Chk01_DtlR.$ship_to_addr1);
				addColumnPathMap(ShipActIF_HdrR.$ship_to_addr2, ShipActRecvIf_Chk01_DtlR.$ship_to_addr2);
				addColumnPathMap(ShipActIF_HdrR.$ship_to_addr3, ShipActRecvIf_Chk01_DtlR.$ship_to_addr3);
				addColumnPathMap(ShipActIF_HdrR.$ship_to_addr4, ShipActRecvIf_Chk01_DtlR.$ship_to_addr4);
				addColumnPathMap(ShipActIF_HdrR.$ship_to_cntct_dpt, ShipActRecvIf_Chk01_DtlR.$ship_to_cntct_dpt);
				addColumnPathMap(ShipActIF_HdrR.$ship_to_cntct_psn, ShipActRecvIf_Chk01_DtlR.$ship_to_cntct_psn);
				addColumnPathMap(ShipActIF_HdrR.$ship_to_tel, ShipActRecvIf_Chk01_DtlR.$ship_to_tel);
				addColumnPathMap(ShipActIF_HdrR.$ship_to_fax, ShipActRecvIf_Chk01_DtlR.$ship_to_fax);
				addColumnPathMap(ShipActIF_HdrR.$iv_no, ShipActRecvIf_Chk01_DtlR.$iv_no);
				addColumnPathMap(ShipActIF_HdrR.$dlv_slip_no, ShipActRecvIf_Chk01_DtlR.$dlv_slip_no);
				addColumnPathMap(ShipActIF_HdrR.$uplnd_flg, ShipActRecvIf_Chk01_DtlR.$uplnd_flg);

			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.ac_dt(MAUCL_DateUtil.getAcDt(src.ship_tm()));
				
				if (src.ship_to_sundry_flg()) {
					dest.ship_to_id_nm(src.ship_to_id_nm());
				}
				else {
					dest.ship_to_id_nm(src.mst_ship_to_id_nm());
				}
				
				dest.dlv_slip_prnt_flg(false);
				dest.ship_adv_prnt_flg(false);
				dest.lot_chk_off_flg(false);
				
				dest.intr_rmrks_upd_flg(false);	
				dest.sub_char1_upd_flg(false);	
				dest.sub_char2_upd_flg(false);		
				dest.sub_char3_upd_flg(false);
			}
		}
		
		protected Map_ShipActIF_DtlR_ShipActRecvIf_Chk01_DtlR<ShipActIF_DtlR,ShipActRecvIf_Chk01_DtlR> createMap_ShipActIF_DtlR_ShipActRecvIf_Chk01_DtlR() {
			return new Map_ShipActIF_DtlR_ShipActRecvIf_Chk01_DtlR<ShipActIF_DtlR, ShipActRecvIf_Chk01_DtlR>();
		}

		public class Map_ShipActIF_DtlR_ShipActRecvIf_Chk01_DtlR<D extends ShipActIF_DtlR, S extends ShipActRecvIf_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ShipActIF_DtlR.$ship_act_d_no, ShipActRecvIf_Chk01_DtlR.$ship_act_d_no);
				addColumnPathMap(ShipActIF_DtlR.$ship_act_no, ShipActRecvIf_Chk01_DtlR.$ship_act_no);
				addColumnPathMap(ShipActIF_DtlR.$ship_alloc_sts_no, ShipActRecvIf_Chk01_DtlR.$ship_alloc_sts_no);
				addColumnPathMap(ShipActIF_DtlR.$trd_cd, ShipActRecvIf_Chk01_DtlR.$trd_cd);
				addColumnPathMap(ShipActIF_DtlR.$trd_ptn_typ, ShipActRecvIf_Chk01_DtlR.$trd_ptn_typ);
				addColumnPathMap(ShipActIF_DtlR.$ship_loc_cd, ShipActRecvIf_Chk01_DtlR.$ship_loc_cd);
				addColumnPathMap(ShipActIF_DtlR.$ship_str_ln_cd, ShipActRecvIf_Chk01_DtlR.$ship_str_ln_cd);
				addColumnPathMap(ShipActIF_DtlR.$dlv_id_typ, ShipActRecvIf_Chk01_DtlR.$dlv_id_typ);
				addColumnPathMap(ShipActIF_DtlR.$dlv_id_cd, ShipActRecvIf_Chk01_DtlR.$dlv_id_cd);
				addColumnPathMap(ShipActIF_DtlR.$dlv_zip_cd, ShipActRecvIf_Chk01_DtlR.$dlv_zip_cd);
				addColumnPathMap(ShipActIF_DtlR.$dlv_addr1, ShipActRecvIf_Chk01_DtlR.$dlv_addr1);
				addColumnPathMap(ShipActIF_DtlR.$dlv_addr2, ShipActRecvIf_Chk01_DtlR.$dlv_addr2);
				addColumnPathMap(ShipActIF_DtlR.$dlv_addr3, ShipActRecvIf_Chk01_DtlR.$dlv_addr3);
				addColumnPathMap(ShipActIF_DtlR.$dlv_addr4, ShipActRecvIf_Chk01_DtlR.$dlv_addr4);
				addColumnPathMap(ShipActIF_DtlR.$dlv_cntct_dpt, ShipActRecvIf_Chk01_DtlR.$dlv_cntct_dpt);
				addColumnPathMap(ShipActIF_DtlR.$dlv_cntct_psn, ShipActRecvIf_Chk01_DtlR.$dlv_cntct_psn);
				addColumnPathMap(ShipActIF_DtlR.$dlv_tel, ShipActRecvIf_Chk01_DtlR.$dlv_tel);
				addColumnPathMap(ShipActIF_DtlR.$dlv_fax, ShipActRecvIf_Chk01_DtlR.$dlv_fax);
				addColumnPathMap(ShipActIF_DtlR.$dlv_str_ln_cd, ShipActRecvIf_Chk01_DtlR.$dlv_str_ln_cd);
				addColumnPathMap(ShipActIF_DtlR.$pri_prnt_flg, ShipActRecvIf_Chk01_DtlR.$pri_prnt_flg);
				addColumnPathMap(ShipActIF_DtlR.$itm_cd, ShipActRecvIf_Chk01_DtlR.$itm_cd);
				addColumnPathMap(ShipActIF_DtlR.$itm_sub1, ShipActRecvIf_Chk01_DtlR.$itm_sub1);
				addColumnPathMap(ShipActIF_DtlR.$itm_sub2, ShipActRecvIf_Chk01_DtlR.$itm_sub2);
				addColumnPathMap(ShipActIF_DtlR.$itm_sub3, ShipActRecvIf_Chk01_DtlR.$itm_sub3);
				addColumnPathMap(ShipActIF_DtlR.$itm_nm, ShipActRecvIf_Chk01_DtlR.$if_itm_nm);
				addColumnPathMap(ShipActIF_DtlR.$sno1, ShipActRecvIf_Chk01_DtlR.$sno1);
				addColumnPathMap(ShipActIF_DtlR.$sno2, ShipActRecvIf_Chk01_DtlR.$sno2);
				addColumnPathMap(ShipActIF_DtlR.$sno3, ShipActRecvIf_Chk01_DtlR.$sno3);
				addColumnPathMap(ShipActIF_DtlR.$sno4, ShipActRecvIf_Chk01_DtlR.$sno4);
				addColumnPathMap(ShipActIF_DtlR.$lot_no, ShipActRecvIf_Chk01_DtlR.$lot_no);
				addColumnPathMap(ShipActIF_DtlR.$sublot_no, ShipActRecvIf_Chk01_DtlR.$sublot_no);
				addColumnPathMap(ShipActIF_DtlR.$ver_no, ShipActRecvIf_Chk01_DtlR.$ver_no);
				addColumnPathMap(ShipActIF_DtlR.$stk_arrv_bp_cd, ShipActRecvIf_Chk01_DtlR.$stk_arrv_bp_cd);
				addColumnPathMap(ShipActIF_DtlR.$gd_cd, ShipActRecvIf_Chk01_DtlR.$gd_cd);
				addColumnPathMap(ShipActIF_DtlR.$trd_unit_qty, ShipActRecvIf_Chk01_DtlR.$ent_unit_qty);
				addColumnPathMap(ShipActIF_DtlR.$trd_unit_cd, ShipActRecvIf_Chk01_DtlR.$ent_unit_cd);
				addColumnPathMap(ShipActIF_DtlR.$quality_typ, ShipActRecvIf_Chk01_DtlR.$quality_typ);
				addColumnPathMap(ShipActIF_DtlR.$stk_id_typ, ShipActRecvIf_Chk01_DtlR.$stk_id_typ);
				addColumnPathMap(ShipActIF_DtlR.$stk_bp_cd, ShipActRecvIf_Chk01_DtlR.$stk_bp_cd);
				addColumnPathMap(ShipActIF_DtlR.$skip_chk_ship_flg, ShipActRecvIf_Chk01_DtlR.$skip_chk_ship_flg);
				addColumnPathMap(ShipActIF_DtlR.$rsn_cd, ShipActRecvIf_Chk01_DtlR.$rsn_cd);
				addColumnPathMap(ShipActIF_DtlR.$bd_dpt_cd, ShipActRecvIf_Chk01_DtlR.$bd_dpt_cd);
				addColumnPathMap(ShipActIF_DtlR.$cst_po_no, ShipActRecvIf_Chk01_DtlR.$cst_po_no);
				addColumnPathMap(ShipActIF_DtlR.$cst_po_d_no, ShipActRecvIf_Chk01_DtlR.$cst_po_d_no);
				addColumnPathMap(ShipActIF_DtlR.$cst_dlv_inst_no, ShipActRecvIf_Chk01_DtlR.$cst_dlv_inst_no);
				addColumnPathMap(ShipActIF_DtlR.$cst_dlv_inst_d_no, ShipActRecvIf_Chk01_DtlR.$cst_dlv_inst_d_no);
				addColumnPathMap(ShipActIF_DtlR.$cst_itm_cd, ShipActRecvIf_Chk01_DtlR.$cst_itm_cd);
				addColumnPathMap(ShipActIF_DtlR.$cst_itm_nm, ShipActRecvIf_Chk01_DtlR.$cst_itm_nm);
				addColumnPathMap(ShipActIF_DtlR.$base_dlv_slip_no, ShipActRecvIf_Chk01_DtlR.$base_dlv_slip_no);
				addColumnPathMap(ShipActIF_DtlR.$base_prov_act_no, ShipActRecvIf_Chk01_DtlR.$base_prov_act_no);
				addColumnPathMap(ShipActIF_DtlR.$base_ac_dt, ShipActRecvIf_Chk01_DtlR.$base_ac_dt);
				addColumnPathMap(ShipActIF_DtlR.$arr_cnt_rmrks, ShipActRecvIf_Chk01_DtlR.$arr_cnt_rmrks);
				addColumnPathMap(ShipActIF_DtlR.$trd_rmrks, ShipActRecvIf_Chk01_DtlR.$trd_rmrks);
				addColumnPathMap(ShipActIF_DtlR.$trd_d_rmrks, ShipActRecvIf_Chk01_DtlR.$trd_d_rmrks);
				addColumnPathMap(ShipActIF_DtlR.$intr_d_rmrks, ShipActRecvIf_Chk01_DtlR.$intr_d_rmrks);
				addColumnPathMap(ShipActIF_DtlR.$dlv_slip_d_no, ShipActRecvIf_Chk01_DtlR.$dlv_slip_d_no);
				addColumnPathMap(ShipActIF_DtlR.$dlv_slip_no, ShipActRecvIf_Chk01_DtlR.$dlv_slip_no);
				addColumnPathMap(ShipActIF_DtlR.$iv_no, ShipActRecvIf_Chk01_DtlR.$dtl_iv_no);
				addColumnPathMap(ShipActIF_DtlR.$iv_d_no, ShipActRecvIf_Chk01_DtlR.$iv_d_no);
				addColumnPathMap(ShipActIF_DtlR.$ship_inst_d_no, ShipActRecvIf_Chk01_DtlR.$ship_inst_d_no);
				addColumnPathMap(ShipActIF_DtlR.$abort_flg, ShipActRecvIf_Chk01_DtlR.$abort_flg);
				addColumnPathMap(ShipActIF_DtlR.$ship_pr_no, ShipActRecvIf_Chk01_DtlR.$ship_pr_no);
				addColumnPathMap(ShipActIF_DtlR.$ext_sys_cd, ShipActRecvIf_Chk01_DtlR.$ext_sys_cd);
				addColumnPathMap(ShipActIF_DtlR.$ext_ship_act_no, ShipActRecvIf_Chk01_DtlR.$ext_ship_act_no);

			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				if (src.dlv_sundry_flg()) {
					dest.dlv_id_nm(src.dlv_id_nm());
				}
				else {
					dest.dlv_id_nm(src.mst_dlv_id_nm());
				}
				
				dest.wms_flg(true);
				dest.sub_char1_upd_flg(false);
				dest.sub_char2_upd_flg(false);
				dest.sub_char3_upd_flg(false);
			}
		}
		
		protected Map_ShipActIF_HdrR_MST_SHIP_ACT_R<ShipActIF_HdrR,MST_SHIP_ACT_R> createMap_ShipActIF_HdrR_MST_SHIP_ACT_R() {
			return new Map_ShipActIF_HdrR_MST_SHIP_ACT_R<ShipActIF_HdrR, MST_SHIP_ACT_R>();
		}

		public class Map_ShipActIF_HdrR_MST_SHIP_ACT_R<D extends ShipActIF_HdrR, S extends MST_SHIP_ACT_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ShipActIF_HdrR.$ship_act_no, MST_SHIP_ACT_R.$ship_act_no);
				addColumnPathMap(ShipActIF_HdrR.$ship_inst_no, MST_SHIP_ACT_R.$ship_inst_no);
				addColumnPathMap(ShipActIF_HdrR.$ac_dt, MST_SHIP_ACT_R.$ac_dt);
				addColumnPathMap(ShipActIF_HdrR.$ship_tm, MST_SHIP_ACT_R.$ship_tm);
				addColumnPathMap(ShipActIF_HdrR.$dlv_tm, MST_SHIP_ACT_R.$dlv_tm);
				addColumnPathMap(ShipActIF_HdrR.$rqst_dpt_cd, MST_SHIP_ACT_R.$rqst_dpt_cd);
				addColumnPathMap(ShipActIF_HdrR.$rqst_usr_cd, MST_SHIP_ACT_R.$rqst_usr_cd);
				addColumnPathMap(ShipActIF_HdrR.$ship_fr_lg_grp_cd, MST_SHIP_ACT_R.$ship_fr_lg_grp_cd);
				addColumnPathMap(ShipActIF_HdrR.$ship_dpt_cd, MST_SHIP_ACT_R.$ship_dpt_cd);
				addColumnPathMap(ShipActIF_HdrR.$ship_usr_cd, MST_SHIP_ACT_R.$ship_usr_cd);
				addColumnPathMap(ShipActIF_HdrR.$cst_cd, MST_SHIP_ACT_R.$cst_cd);
				addColumnPathMap(ShipActIF_HdrR.$ship_to_id_typ, MST_SHIP_ACT_R.$ship_to_id_typ);
				addColumnPathMap(ShipActIF_HdrR.$ship_to_id_cd, MST_SHIP_ACT_R.$ship_to_id_cd);
				addColumnPathMap(ShipActIF_HdrR.$ship_to_id_nm, MST_SHIP_ACT_R.$ship_to_id_nm);
				addColumnPathMap(ShipActIF_HdrR.$ship_to_zip_cd, MST_SHIP_ACT_R.$ship_to_zip_cd);
				addColumnPathMap(ShipActIF_HdrR.$ship_to_addr1, MST_SHIP_ACT_R.$ship_to_addr1);
				addColumnPathMap(ShipActIF_HdrR.$ship_to_addr2, MST_SHIP_ACT_R.$ship_to_addr2);
				addColumnPathMap(ShipActIF_HdrR.$ship_to_addr3, MST_SHIP_ACT_R.$ship_to_addr3);
				addColumnPathMap(ShipActIF_HdrR.$ship_to_addr4, MST_SHIP_ACT_R.$ship_to_addr4);
				addColumnPathMap(ShipActIF_HdrR.$ship_to_cntct_dpt, MST_SHIP_ACT_R.$ship_to_cntct_dpt);
				addColumnPathMap(ShipActIF_HdrR.$ship_to_cntct_psn, MST_SHIP_ACT_R.$ship_to_cntct_psn);
				addColumnPathMap(ShipActIF_HdrR.$ship_to_tel, MST_SHIP_ACT_R.$ship_to_tel);
				addColumnPathMap(ShipActIF_HdrR.$ship_to_fax, MST_SHIP_ACT_R.$ship_to_fax);
				addColumnPathMap(ShipActIF_HdrR.$via_dlv_typ, MST_SHIP_ACT_R.$via_dlv_typ);
				addColumnPathMap(ShipActIF_HdrR.$iv_no, MST_SHIP_ACT_R.$iv_no);
				addColumnPathMap(ShipActIF_HdrR.$uplnd_flg, MST_SHIP_ACT_R.$uplnd_flg);
				addColumnPathMap(ShipActIF_HdrR.$ship_adv_prnt_flg, MST_SHIP_ACT_R.$ship_adv_prnt_flg);

			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.dlv_slip_prnt_flg(false);
				dest.lot_chk_off_flg(false);

				dest.intr_rmrks_upd_flg(false);					
				dest.sub_char1_upd_flg(false);	
				dest.sub_char2_upd_flg(false);		
				dest.sub_char3_upd_flg(false);
			}
		}
		
		protected Map_ShipActIF_DtlR_MST_SHIP_ACT_D_R<ShipActIF_DtlR,MST_SHIP_ACT_D_R> createMap_ShipActIF_DtlR_MST_SHIP_ACT_D_R() {
			return new Map_ShipActIF_DtlR_MST_SHIP_ACT_D_R<ShipActIF_DtlR, MST_SHIP_ACT_D_R>();
		}

		public class Map_ShipActIF_DtlR_MST_SHIP_ACT_D_R<D extends ShipActIF_DtlR, S extends MST_SHIP_ACT_D_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ShipActIF_DtlR.$ship_act_d_no, MST_SHIP_ACT_D_R.$ship_act_d_no);
				addColumnPathMap(ShipActIF_DtlR.$ship_act_no, MST_SHIP_ACT_D_R.$ship_act_no);
				addColumnPathMap(ShipActIF_DtlR.$ship_alloc_sts_no, MST_SHIP_ACT_D_R.$ship_alloc_sts_no);
				addColumnPathMap(ShipActIF_DtlR.$trd_cd, MST_SHIP_ACT_D_R.$trd_cd);
				addColumnPathMap(ShipActIF_DtlR.$trd_ptn_typ, MST_SHIP_ACT_D_R.$trd_ptn_typ);
				addColumnPathMap(ShipActIF_DtlR.$ship_loc_cd, MST_SHIP_ACT_D_R.$ship_loc_cd);
				addColumnPathMap(ShipActIF_DtlR.$ship_str_ln_cd, MST_SHIP_ACT_D_R.$ship_str_ln_cd);
				addColumnPathMap(ShipActIF_DtlR.$dlv_id_typ, MST_SHIP_ACT_D_R.$dlv_id_typ);
				addColumnPathMap(ShipActIF_DtlR.$dlv_id_cd, MST_SHIP_ACT_D_R.$dlv_id_cd);
				addColumnPathMap(ShipActIF_DtlR.$dlv_id_nm, MST_SHIP_ACT_D_R.$dlv_id_nm);
				addColumnPathMap(ShipActIF_DtlR.$dlv_zip_cd, MST_SHIP_ACT_D_R.$dlv_zip_cd);
				addColumnPathMap(ShipActIF_DtlR.$dlv_addr1, MST_SHIP_ACT_D_R.$dlv_addr1);
				addColumnPathMap(ShipActIF_DtlR.$dlv_addr2, MST_SHIP_ACT_D_R.$dlv_addr2);
				addColumnPathMap(ShipActIF_DtlR.$dlv_addr3, MST_SHIP_ACT_D_R.$dlv_addr3);
				addColumnPathMap(ShipActIF_DtlR.$dlv_addr4, MST_SHIP_ACT_D_R.$dlv_addr4);
				addColumnPathMap(ShipActIF_DtlR.$dlv_cntct_dpt, MST_SHIP_ACT_D_R.$dlv_cntct_dpt);
				addColumnPathMap(ShipActIF_DtlR.$dlv_cntct_psn, MST_SHIP_ACT_D_R.$dlv_cntct_psn);
				addColumnPathMap(ShipActIF_DtlR.$dlv_tel, MST_SHIP_ACT_D_R.$dlv_tel);
				addColumnPathMap(ShipActIF_DtlR.$dlv_fax, MST_SHIP_ACT_D_R.$dlv_fax);
				addColumnPathMap(ShipActIF_DtlR.$dlv_str_ln_cd, MST_SHIP_ACT_D_R.$dlv_str_ln_cd);
				addColumnPathMap(ShipActIF_DtlR.$pri_prnt_flg, MST_SHIP_ACT_D_R.$pri_prnt_flg);
				addColumnPathMap(ShipActIF_DtlR.$itm_cd, MST_SHIP_ACT_D_R.$itm_cd);
				addColumnPathMap(ShipActIF_DtlR.$itm_sub1, MST_SHIP_ACT_D_R.$itm_sub1);
				addColumnPathMap(ShipActIF_DtlR.$itm_sub2, MST_SHIP_ACT_D_R.$itm_sub2);
				addColumnPathMap(ShipActIF_DtlR.$itm_sub3, MST_SHIP_ACT_D_R.$itm_sub3);
				addColumnPathMap(ShipActIF_DtlR.$itm_nm, MST_SHIP_ACT_D_R.$itm_nm);
				addColumnPathMap(ShipActIF_DtlR.$iv_itm_nm, MST_SHIP_ACT_D_R.$iv_itm_nm);
				addColumnPathMap(ShipActIF_DtlR.$sno1, MST_SHIP_ACT_D_R.$sno1);
				addColumnPathMap(ShipActIF_DtlR.$sno2, MST_SHIP_ACT_D_R.$sno2);
				addColumnPathMap(ShipActIF_DtlR.$sno3, MST_SHIP_ACT_D_R.$sno3);
				addColumnPathMap(ShipActIF_DtlR.$sno4, MST_SHIP_ACT_D_R.$sno4);
				addColumnPathMap(ShipActIF_DtlR.$lot_no, MST_SHIP_ACT_D_R.$lot_no);
				addColumnPathMap(ShipActIF_DtlR.$sublot_no, MST_SHIP_ACT_D_R.$sublot_no);
				addColumnPathMap(ShipActIF_DtlR.$ver_no, MST_SHIP_ACT_D_R.$ver_no);
				addColumnPathMap(ShipActIF_DtlR.$stk_arrv_bp_cd, MST_SHIP_ACT_D_R.$stk_arrv_bp_cd);
				addColumnPathMap(ShipActIF_DtlR.$gd_cd, MST_SHIP_ACT_D_R.$gd_cd);
				addColumnPathMap(ShipActIF_DtlR.$quality_typ, MST_SHIP_ACT_D_R.$quality_typ);
				addColumnPathMap(ShipActIF_DtlR.$stk_id_typ, MST_SHIP_ACT_D_R.$stk_id_typ);
				addColumnPathMap(ShipActIF_DtlR.$stk_bp_cd, MST_SHIP_ACT_D_R.$stk_bp_cd);
				addColumnPathMap(ShipActIF_DtlR.$trd_unit_qty, MST_SHIP_ACT_D_R.$trd_unit_qty);
				addColumnPathMap(ShipActIF_DtlR.$trd_unit_cd, MST_SHIP_ACT_D_R.$trd_unit_cd);
				addColumnPathMap(ShipActIF_DtlR.$skip_chk_ship_flg, MST_SHIP_ACT_D_R.$skip_chk_ship_flg);
				addColumnPathMap(ShipActIF_DtlR.$rsn_cd, MST_SHIP_ACT_D_R.$rsn_cd);
				addColumnPathMap(ShipActIF_DtlR.$bd_dpt_cd, MST_SHIP_ACT_D_R.$bd_dpt_cd);
				addColumnPathMap(ShipActIF_DtlR.$cst_po_no, MST_SHIP_ACT_D_R.$cst_po_no);
				addColumnPathMap(ShipActIF_DtlR.$cst_po_d_no, MST_SHIP_ACT_D_R.$cst_po_d_no);
				addColumnPathMap(ShipActIF_DtlR.$cst_dlv_inst_no, MST_SHIP_ACT_D_R.$cst_dlv_inst_no);
				addColumnPathMap(ShipActIF_DtlR.$cst_dlv_inst_d_no, MST_SHIP_ACT_D_R.$cst_dlv_inst_d_no);
				addColumnPathMap(ShipActIF_DtlR.$cst_itm_cd, MST_SHIP_ACT_D_R.$cst_itm_cd);
				addColumnPathMap(ShipActIF_DtlR.$cst_itm_nm, MST_SHIP_ACT_D_R.$cst_itm_nm);
				addColumnPathMap(ShipActIF_DtlR.$arr_cnt_rmrks, MST_SHIP_ACT_D_R.$arr_cnt_rmrks);
				addColumnPathMap(ShipActIF_DtlR.$trd_rmrks, MST_SHIP_ACT_D_R.$trd_rmrks);
				addColumnPathMap(ShipActIF_DtlR.$trd_d_rmrks, MST_SHIP_ACT_D_R.$trd_d_rmrks);
				addColumnPathMap(ShipActIF_DtlR.$intr_d_rmrks, MST_SHIP_ACT_D_R.$intr_d_rmrks);
				addColumnPathMap(ShipActIF_DtlR.$sub_char1, MST_SHIP_ACT_D_R.$sub_char1);
				addColumnPathMap(ShipActIF_DtlR.$sub_char2, MST_SHIP_ACT_D_R.$sub_char2);
				addColumnPathMap(ShipActIF_DtlR.$sub_char3, MST_SHIP_ACT_D_R.$sub_char3);
				addColumnPathMap(ShipActIF_DtlR.$dlv_slip_d_no, MST_SHIP_ACT_D_R.$dlv_slip_d_no);
				addColumnPathMap(ShipActIF_DtlR.$dlv_slip_no, MST_SHIP_ACT_D_R.$dlv_slip_no);
				addColumnPathMap(ShipActIF_DtlR.$wms_flg, MST_SHIP_ACT_D_R.$wms_flg);
				addColumnPathMap(ShipActIF_DtlR.$ext_sys_cd, MST_SHIP_ACT_D_R.$ext_sys_cd);
				addColumnPathMap(ShipActIF_DtlR.$ext_ship_act_no, MST_SHIP_ACT_D_R.$ext_ship_act_no);

			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.ship_inst_d_no(src.getStringNE(MST_SHIP_INST_D_R.$ship_inst_d_no));
				dest.ship_pr_no(src.getStringNE(MST_SHIP_PR_R.$ship_pr_no));
				dest.abort_flg(src.getBooleanNE(MST_SHIP_SCHD_R.$abort_flg));
				dest.iv_no(src.getStringNE(MST_IV_R.$iv_no));
				dest.iv_d_no(src.getStringNE(MST_IV_D_R.$iv_d_no));
				dest.arr_cnt_rmrks_upd_flg(true);
				dest.intr_d_rmrks_upd_flg(true);
				
				dest.sub_char1_upd_flg(false);
				dest.sub_char2_upd_flg(false);
				dest.sub_char3_upd_flg(false);
			}
		}
		
		protected Map_ShipActIF_CntrR_ShipActIF_DtlR<ShipActIF_CntrR,ShipActIF_DtlR> createMap_ShipActIF_CntrR_ShipActIF_DtlR() {
			return new Map_ShipActIF_CntrR_ShipActIF_DtlR<ShipActIF_CntrR, ShipActIF_DtlR>();
		}

		public class Map_ShipActIF_CntrR_ShipActIF_DtlR<D extends ShipActIF_CntrR, S extends ShipActIF_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ShipActIF_CntrR.$hdr_dtl_peg_no, ShipActIF_DtlR.$hdr_dtl_peg_no);
				addColumnPathMap(ShipActIF_CntrR.$ship_alloc_sts_no, ShipActIF_DtlR.$ship_alloc_sts_no);
				addColumnPathMap(ShipActIF_CntrR.$ship_pr_no, ShipActIF_DtlR.$ship_pr_no);

			}
		}
	}
	
	/**
	 * 処理結果区分にエラーを設定
	 * @param shipActRecvIfR 出荷実績受信ＩＦ
	 */
	protected void setErrSts(MST_SHIP_ACT_RECV_IF_R shipActRecvIfR) {

		shipActRecvIfR.exe_sts_typ(MAC_EXE_STS_TYP.ERR.value());
		setErrSet(shipActRecvIfR);
	}
	
	/**
	 * 同一取込グループでエラーが発生した場合に、エラーリスト設定に追加する。
	 * @param shipActRecvIfR 出荷実績受信ＩＦ
	 */
	protected void setErrSet(MST_SHIP_ACT_RECV_IF_R shipActRecvIfR) {
		
		List<String> lst = createErrSetKey(shipActRecvIfR);
		if (!object(CLAZZ)._errSet.contains(lst)) {
			object(CLAZZ)._errSet.add(lst);
		}

		if (!object(CLAZZ)._stopErrSet.contains(shipActRecvIfR.ext_sys_cd())) {
			object(CLAZZ)._stopErrSet.add(shipActRecvIfR.ext_sys_cd());
		}
	}
	
	/**
	 * 同一取込単位で先に処理したデータでエラーが発生したかどうか。
	 * @param shipActRecvIfR 出荷実績受信ＩＦ
	 * @return エラーが発生した場合はtrue
	 */
	protected boolean isPrevErr(MST_SHIP_ACT_RECV_IF_R shipActRecvIfR) {
		
		return object(CLAZZ)._errSet.contains(createErrSetKey(shipActRecvIfR));
	}
	
	/**
	 * 同一取込グループのキー項目のリストを作成する。
	 * @param shipActRecvIfR 出荷実績受信ＩＦ
	 * @return エラーキー項目のリスト
	 */
	protected List<String> createErrSetKey(MST_SHIP_ACT_RECV_IF_R shipActRecvIfR) {
		
		List<String> lst = new ArrayList<String>();
		if (!isNull(shipActRecvIfR)) {
			lst.add(shipActRecvIfR.ship_fr_lg_grp_cd());
			lst.add(shipActRecvIfR.ext_sys_cd());
			lst.add(shipActRecvIfR.ext_ship_act_no());
			
		}
		return lst;
	}

	//FMCB CUSTOM END
}