package mcframe.serverMSLA.MSLAL6080;

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
import mcframe.serverMS.dbc.MST_ACXFR_ACT_D_R;
import mcframe.serverMS.dbc.MST_ACXFR_ACT_R;
import mcframe.serverMS.dbc.MST_ACXFR_ACT_RECV_IF_R;
import mcframe.serverMS.dbc.MST_ACXFR_INST_D_R;
import mcframe.serverMS.dbc.MST_ACXFR_INST_R;
import mcframe.serverMS.dbc.MST_ACXFR_SCHD_R;
import mcframe.serverMS.dbc.MST_ARR_ACT_RECV_IF_R;
import mcframe.serverMS.dbc.MSVT_LOT_LIST_R;
import mcframe.serverMS.dbc.MSVT_MES_IF_R;
import mcframe.serverMSBE.MSBEL6410.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSLA.MSLAL6080.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMBBE.MBBEL5010.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverPFUD.PFUDL0040.*;	// このimportはFrameManagerの自動生成で追加されました。

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.commonCore.container.MCRow.*;
import mcframe.serverMSLA.MSLAL6320.MSLAL_SCMActRecvIfService;
import mcframe.serverPF.dbc.PFT_SDRV_IF_R;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogger;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
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
 * "MSLAL_AcXfrActRecvIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_AcXfrActRecvIfService_MC extends MSLAL_AcXfrActRecvIfService_MC_A{
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
	protected static final Class<MSLAL_AcXfrActRecvIfService> CLAZZ = MSLAL_AcXfrActRecvIfService.class;

	/**
	 * AcXfrActRecvIf_Upd01オペレーション.<p>
	 *
	 * 他勘定振替実績受信ＩＦ取込を行う。（ＥＳＢのリアルタイム取込から呼び出される）<br>
	 */
	public class AcXfrActRecvIf_Upd01 extends MSLAL_AcXfrActRecvIfService_MC_A.AcXfrActRecvIf_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			callAcXfrActRecvIfUpd02();
		}
		
		/**
		 * 他勘定振替実績受信ＩＦ取込２を実行する。
		 */
		protected void callAcXfrActRecvIfUpd02() {
			
			MSLAL_AcXfrActRecvIfService.AcXfrActRecvIf_Upd02 ope = MSLAL_AcXfrActRecvIfService.crtAcXfrActRecvIf_Upd02();
			
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
	 * AcXfrActRecvIf_Upd02オペレーション.<p>
	 *
	 * 他勘定振替実績受信ＩＦ取込を行う。（ＩＦデータ確認、および他勘定振替実績受信ＩＦ取込バッチから呼び出される）<br>
	 */
	public class AcXfrActRecvIf_Upd02 extends MSLAL_AcXfrActRecvIfService_MC_A.AcXfrActRecvIf_Upd02 {
		
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
		 * 他勘定振替実績受信ＩＦリスト 
		 */
		MCList<MST_ACXFR_ACT_RECV_IF_R> _acxfrActRecvIfL = null;
		
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
			
			logger().writeStartLog(MSLAL0300);
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
			
			logger().writeEndLog(MSLAL0301, _totalNum, _okNum, _errNum, _skipNum);
			pushEndLog(logger());
			// Loggerを新規作成した場合（呼出元からLoggerを引き継がない場合）のみクローズ
			if (_crtNewLogger) {
				logger().close();
			}
		}
		
		/**
		 * 他勘定振替実績受信ＩＦデータを取得する。
		 */
		protected void preSrch() {
			_acxfrActRecvIfL = MCList.create(MST_ACXFR_ACT_RECV_IF_R.class);
			MST_ACXFR_ACT_RECV_IF_R t = MST_ACXFR_ACT_RECV_IF_R.create("T");
			MCQueryApiBuilder acxfrActRecvIfL_bldr = MCQueryApiBuilder.create(t);
			
			makeDml(acxfrActRecvIfL_bldr);
			if (!up0().isEmpty()) {
				dbSelect("MSLAL6080_MST_ACXFR_ACT_RECV_IF_S01", _acxfrActRecvIfL, acxfrActRecvIfL_bldr, up0());
			}
			else {
				dbSelect("MSLAL6080_MST_ACXFR_ACT_RECV_IF_S02", _acxfrActRecvIfL, acxfrActRecvIfL_bldr);
			}
			
			if (up1().src_actlumprecv_flg()
					&& !up1().exe_unit_lump_flg()
					&& !_acxfrActRecvIfL.isEmpty()) {

				// 実績一括受信バッチから処理単位区分「まとめない」で実行されてきた場合のみ
				// 同一外部システムデータNOのレコードをまとめて処理する
				MCList<MST_ACXFR_ACT_RECV_IF_R> dbc = MCList.create(MST_ACXFR_ACT_RECV_IF_R.class);
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
				
				makeDml(dbc_bldr);
				
				dbc_bldr.setWhere(t.ext_data_no.eq(bind("ext_data_no")));
				dbc_bldr.addWhereWithAnd(t.ext_sys_cd.eq(bind("ext_sys_cd")));
				dbSelect("MSLAL6080_MST_ACXFR_ACT_RECV_IF_S03", dbc, dbc_bldr, _acxfrActRecvIfL.groupBy(MST_ARR_ACT_RECV_IF_R.$ext_data_no, MST_ARR_ACT_RECV_IF_R.$ext_sys_cd));

				if (!dbc.isEmpty()) {
					_acxfrActRecvIfL.merge(dbc, dbc.createRow().getKeyColumn());
				}
			}
		}
		protected void makeDml(MCQueryApiBuilder builder) {
			MAM_LOC_R m1 = MAM_LOC_R.create("M1");
			MAM_SCM_IF_CTL_R m2 = MAM_SCM_IF_CTL_R.create("M2");
			PFT_SDRV_IF_R t2 = PFT_SDRV_IF_R.create("T2");
			MST_ACXFR_ACT_RECV_IF_R t = MST_ACXFR_ACT_RECV_IF_R.create(builder.getBaseDbcAlias());


			builder.removeSelect(MST_ACXFR_ACT_RECV_IF_R.$lg_grp_cd);
			builder.addSelect(nvl( t.lg_grp_cd, m1.lg_grp_cd).as("lg_grp_cd"));
			builder.addLeftOuterJoin(m1, t.loc_cd.eq(m1.loc_cd));
			builder.addInnerJoin(m2, bracket(t.loc_cd.eq(m2.loc_cd).or(t.lg_grp_cd.eq(m2.lg_grp_cd))).and(m2.if_proc_typ.eq(value(MAC_IF_PROC_TYP.WMS_ACXFR_ACT_RECV.value()))).and(m2.st_dt.lte(t.recv_dt)).and(m2.end_dt.gte(t.recv_dt)));
			builder.addLeftOuterJoin(t2, t.data_no.eq(t2.data_no));
			
			builder.setWhere(value(0).eq(value(0)));
			builder.addWhereWithAnd(t2.sdrv_sts_typ.isNull()
							.or(t2.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.RECV_CONV_OK.value()))));
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
		
			callAcXfrActRecvIfUpd03();
		}
		
		/**
		 * スレッドを分割し、各スレッドごとに他勘定振替実績受信ＩＦ取込３を実行する。
		 */
		protected void callAcXfrActRecvIfUpd03() {

			// 呼出元のサービス実行番号を取得
			int no = object(MSLAL_SCMActRecvIfService.class)._execNo;

			MSLAL_AcXfrActRecvIfService.AcXfrActRecvIf_Upd03 upd03;

			List<MSLAL_AcXfrActRecvIfService.AcXfrActRecvIf_Upd03> opeL = new ArrayList<>();
			
			if (MCServerThreadManager.getLimitThreadSize() <= 1
					|| up1().src_actlumprecv_flg() && !MAC_IF_UPD_TYP.isSKIP_ERROR(up1().if_upd_typ())) {
				sort();

				upd03 = MSLAL_AcXfrActRecvIfService.crtAcXfrActRecvIf_Upd03();
				upd03._no = no;
				setAll(upd03.up0(), _acxfrActRecvIfL, createMap_AcXfrActRecvIf_Upd03_DtlR_MST_ACXFR_ACT_RECV_IF_R());
				upd03.up1().if_upd_typ(up1().if_upd_typ());
				upd03.up1().src_actlumprecv_flg(up1().src_actlumprecv_flg());
				opeL.add(upd03);

				MCServerThreadManager.setUseMainDBTran(true);
				MCServerThreadManager.invokeAndWait(1, opeL, FXBAL_BatchLogManager.class, MSLAL_SCMActRecvIfService.class);
			}
			else {
				for (MCList<MST_ACXFR_ACT_RECV_IF_R> credGrpL : _acxfrActRecvIfL.groupList(MST_ACXFR_ACT_RECV_IF_R.$lg_grp_cd)) {

					upd03 = MSLAL_AcXfrActRecvIfService.crtAcXfrActRecvIf_Upd03();
					upd03._no = no++;
					setAll(upd03.up0(), credGrpL, createMap_AcXfrActRecvIf_Upd03_DtlR_MST_ACXFR_ACT_RECV_IF_R());
					upd03.up1().if_upd_typ(up1().if_upd_typ());
					upd03.up1().src_actlumprecv_flg(up1().src_actlumprecv_flg());

					opeL.add(upd03);
				}
				if (!opeL.isEmpty()) {
					Collections.sort(opeL, new Comparator<MSLAL_AcXfrActRecvIfService.AcXfrActRecvIf_Upd03>() {
						@Override
						public int compare(MSLAL_AcXfrActRecvIfService.AcXfrActRecvIf_Upd03 o1, MSLAL_AcXfrActRecvIfService.AcXfrActRecvIf_Upd03 o2) {
							return (o1.up0().size() - o2.up0().size()) * -1;
						}
					});
					
					MCServerThreadManager.setCommitAndRollback(true);
					MCServerThreadManager.invokeAndWait(opeL, FXBAL_BatchLogManager.class, MSLAL_SCMActRecvIfService.class);
				}
			}
			for (MSLAL_AcXfrActRecvIfService.AcXfrActRecvIf_Upd03 ope: opeL) {
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
			_acxfrActRecvIfL.sort(
				MST_ACXFR_ACT_RECV_IF_R.$data_make_dt,
				MST_ACXFR_ACT_RECV_IF_R.$ext_sys_cd,
				MST_ACXFR_ACT_RECV_IF_R.$ext_data_no,
				MST_ACXFR_ACT_RECV_IF_R.$ext_data_lno
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
		
		protected Map_AcXfrActRecvIf_Upd03_DtlR_MST_ACXFR_ACT_RECV_IF_R<AcXfrActRecvIf_Upd03_DtlR,MST_ACXFR_ACT_RECV_IF_R> createMap_AcXfrActRecvIf_Upd03_DtlR_MST_ACXFR_ACT_RECV_IF_R() {
			return new Map_AcXfrActRecvIf_Upd03_DtlR_MST_ACXFR_ACT_RECV_IF_R<AcXfrActRecvIf_Upd03_DtlR, MST_ACXFR_ACT_RECV_IF_R>();
		}

		public class Map_AcXfrActRecvIf_Upd03_DtlR_MST_ACXFR_ACT_RECV_IF_R<D extends AcXfrActRecvIf_Upd03_DtlR, S extends MST_ACXFR_ACT_RECV_IF_R> extends MCRowMapper<D,S>{
			@Override
			public void valueCopy(D dest, S src) {
				dest.axa(src);
			}
		}
	}
	/**
	 * AcXfrActRecvIf_Upd03オペレーション.<p>
	 *
	 * 他勘定振替実績受信ＩＦ取込を行う。（マルチスレッド実行用）<br>
	 */
	public class AcXfrActRecvIf_Upd03 extends MSLAL_AcXfrActRecvIfService_MC_A.AcXfrActRecvIf_Upd03 {
		
		/**
		 * 他勘定振替実績受信ＩＦ取込４を呼び出す際にデータＮＯ、物流グループの組み合わせを何件ずつ渡すかのパラメータ
		 */
		protected int _loopCnt = MCConst.app.getInteger("MS.MSLAL6080.loop_size", 100);
		
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
		 * AcXfrActRecvIf_Upd04バッチ呼び出しオペレーションから引き継ぐ
		 */
		protected FXBAL_BatchLogger _logger = null;
		
		/**
		 * インスタンス生成元（AcXfrActRecvIf_Upd03）でスレッド間でユニークな値を設定
		 */
		protected int _no = 0;
		
		/**
		 * AcXfrActRecvIf_Upd04の実行結果リスト
		 */
		protected MCList<AcXfrActRecvIf_Upd04_DtlR> _exeRslt = null;
		
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
		 * 他勘定振替実績受信ＩＦ取込処理を実行する。
		 */
		protected void exe() {

			int cnt = 0;
			
			MCList<MST_ACXFR_ACT_RECV_IF_R> tgtL = MCList.create(MST_ACXFR_ACT_RECV_IF_R.class);
			MST_ACXFR_ACT_RECV_IF_R tgtL_t = MST_ACXFR_ACT_RECV_IF_R.create("T");
			MCQueryApiBuilder tgtL_bldr = MCQueryApiBuilder.create(tgtL_t);
			MST_ACXFR_ACT_RECV_IF_R oldR = MST_ACXFR_ACT_RECV_IF_R.create();
			
			for (AcXfrActRecvIf_Upd03_DtlR dtlR : up0()) {
				
				MST_ACXFR_ACT_RECV_IF_R keyR = dtlR.axa();
				
				if (isNextData(oldR, keyR)) {
					
					if (!tgtL.isEmpty() && _loopCnt <= cnt) {
						
						callAcXfrActRecvIfUpd04(tgtL,tgtL_t,tgtL_bldr);
						cnt = 0;
						tgtL.clear();
					}
				}
				
				oldR = keyR;
				cnt++;
				tgtL.add(keyR);
			}
			
			if (!tgtL.isEmpty()) {
				
				callAcXfrActRecvIfUpd04(tgtL,tgtL_t,tgtL_bldr);
			}
		}
		
		/**
		 * 他勘定振替実績受信ＩＦを実行する。
		 * @param acxfrActRecvIfL 他勘定振替実績受信ＩＦリスト
		 */
		protected void callAcXfrActRecvIfUpd04(MCList<MST_ACXFR_ACT_RECV_IF_R> acxfrActRecvIfL, MST_ACXFR_ACT_RECV_IF_R acxfrActRecvIfL_t, MCQueryApiBuilder acxfrActRecvIfL_bldr) {
			
			crtAcXfrActRecvIfWk(acxfrActRecvIfL, acxfrActRecvIfL_t, acxfrActRecvIfL_bldr);
			
			MCList<MST_ACXFR_ACT_RECV_IF_R> exeL = srchLockAcXfrActRecvIf();
			MCIndexKey idx = exeL.createIndex(MST_ACXFR_ACT_RECV_IF_R.$data_lno);

			Set<List<String>> afterExtDataSet = srchAfterExtData(exeL);
			
			MSLAL_AcXfrActRecvIfService.AcXfrActRecvIf_Upd04 ope = MSLAL_AcXfrActRecvIfService.crtAcXfrActRecvIf_Upd04();
			
			AcXfrActRecvIf_Upd04_DtlR upR = null;
			
			MCList<MST_ACXFR_ACT_RECV_IF_R> skipL = MCList.create(MST_ACXFR_ACT_RECV_IF_R.class);
			for (MST_ACXFR_ACT_RECV_IF_R recvIfR : acxfrActRecvIfL) {
				MST_ACXFR_ACT_RECV_IF_R exeR = exeL.getFirst(idx, recvIfR.data_lno());

				if (isNull(exeR) || isStopErr(exeR) || isChkUpdCntr(exeR)) {
					continue;
				}
				// 同一の処理グループでエラーが発生している場合、それ以降のデータは処理しない
				else if (isPrevErr(exeR)) {
					
					setErrSts(exeR);
					if (!isNull(exeR.acxfr_inst_no())) {
						MCMessagePool.add(exeR, null, MSLAL0302, exeR.data_no(), exeR.data_lno(), exeR.acxfr_inst_no());
					}
					else {
						MCMessagePool.add(exeR, null, MSLAL0316, exeR.data_no(), exeR.data_lno(), exeR.ext_sys_cd(), exeR.ext_acxfr_act_no());
					}
					skipL.add(exeR);
				}
				// 同一の処理グループで、新しいデータが既に処理されている場合、スキップする
				else if (isOkSkip(exeR, afterExtDataSet)) {
					
					setSkipSts(exeR);
					MCMessagePool.add(exeR, null, MSLAL0303, exeR.data_no(),exeR.data_lno(), exeR.ext_sys_cd(), exeR.ext_acxfr_act_no());
					skipL.add(exeR);
				}
				else {
					
					upR = AcXfrActRecvIf_Upd04_DtlR.create();
					upR.axa(exeR);
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
			
			delAcXfrActRecvIfWk(acxfrActRecvIfL, acxfrActRecvIfL_t, acxfrActRecvIfL_bldr);
		}

		/**
		 * 「エラー行まで登録」の状態となっているか
		 */
		protected boolean isStopErr(MST_ACXFR_ACT_RECV_IF_R r) {
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
		protected boolean isChkUpdCntr(MST_ACXFR_ACT_RECV_IF_R exeR) {
			if (!up1().src_actlumprecv_flg()) {
				return false;
			}

			// ＳＣＭ実績受信ＩＦ一括取込で取得したMESIF情報を取得する
			MCRow mesIfR = MSLAL_SCMActRecvIfService.getMesIfR(exeR.data_lno(), exeR.data_no());

			if (!isSame(exeR.upd_srv_req_no(), MCSys.request.serverRequestNo())) {
				MCMessageList msgL = new MCMessageList();
				msgL.addAll(checkUpdCntrNE(exeR, MSVT_MES_IF_R.$upd_cntr, mesIfR));
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
		protected boolean isOkSkip(MST_ACXFR_ACT_RECV_IF_R exeR, Set<List<String>> afterExtDataSet) {
			
			return afterExtDataSet.contains(createOKSkipSetKey(exeR));
		}
		
		/**
		 * 他勘定振替実績受信ＩＦのワークテーブルにデータを登録する。
		 * @param acxfrActRecvIfL 他勘定振替実績受信ＩＦ
		 */
		protected void crtAcXfrActRecvIfWk(MCList<MST_ACXFR_ACT_RECV_IF_R> acxfrActRecvIfL, MST_ACXFR_ACT_RECV_IF_R acxfrActRecvIfL_t, MCQueryApiBuilder acxfrActRecvIfL_bldr) {
			
			dbWkDelete("MSLAL6080_MSW_ACXFR_ACT_RECV_IF_D01", acxfrActRecvIfL_bldr.getBaseDbc());
			dbWkInsert("MSLAL6080_MSW_ACXFR_ACT_RECV_IF_I01", acxfrActRecvIfL, acxfrActRecvIfL_bldr.getBaseDbc());
		}
		
		/**
		 * 他勘定振替実績受信ＩＦをロックする。
		 */
		protected MCList<MST_ACXFR_ACT_RECV_IF_R> srchLockAcXfrActRecvIf() {

			MSW_ACXFR_ACT_RECV_IF_KEY_R w1 = MSW_ACXFR_ACT_RECV_IF_KEY_R.create("W1");
			PFT_SDRV_IF_R t2 = PFT_SDRV_IF_R.create("T2");

			MCList<MST_ACXFR_ACT_RECV_IF_R> exeL = MCList.create(MST_ACXFR_ACT_RECV_IF_R.class);
			MST_ACXFR_ACT_RECV_IF_R t = MST_ACXFR_ACT_RECV_IF_R.create("T");
			MCQueryApiBuilder exeL_bldr = MCQueryApiBuilder.create(t);
			
			exeL_bldr.addInnerJoin(w1, t.data_lno.eq(w1.data_lno));
			exeL_bldr.addLeftOuterJoin(t2, t.data_no.eq(t2.data_no));
			
			exeL_bldr.setWhere(value(0).eq(value(0)));
			exeL_bldr.addWhereWithAnd(t2.sdrv_sts_typ.isNull()
							.or(t2.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.RECV_CONV_OK.value()))));
			exeL_bldr.addWhereWithAnd(t.imp_flg.eq(value(true)));
			exeL_bldr.addOrderByAsc(t.ext_data_no, t.acxfr_inst_no, t.ext_sys_cd, t.ext_acxfr_act_no);
			exeL_bldr.setLockTable(t.data_lno);
			
			dbSelectForUpdate("MSLAL6080_MST_ACXFR_ACT_RECV_IF_S04", exeL, exeL_bldr);
			
			for (MST_ACXFR_ACT_RECV_IF_R exeR : exeL) {
				
				// log_sub_key1にスレッド間でユニークな値を設定
				exeR.setParamIndex(_no);
			}
			
			_logger.setLogKey(exeL,
					MST_ACXFR_ACT_RECV_IF_R.$batch_log_no,
					MST_ACXFR_ACT_RECV_IF_R.$log_sub_key1,
					MST_ACXFR_ACT_RECV_IF_R.$log_sub_key2);
			
			return exeL;
		}
		
		/**
		 * 同一キーで取込対象より新しいかつ処理済みのデータを取得する。
		 * @param exeL 取込対象リスト
		 * @return 処理済みデータリスト
		 */
		protected Set<List<String>> srchAfterExtData(MCList<MST_ACXFR_ACT_RECV_IF_R> exeL) {
			
			MST_ACXFR_ACT_RECV_IF_R t = MST_ACXFR_ACT_RECV_IF_R.create("T");
			MST_ACXFR_ACT_RECV_IF_R S1ST = MST_ACXFR_ACT_RECV_IF_R.create("ST");

			MCList<MST_ACXFR_ACT_RECV_IF_R> afterL = MCList.create(MST_ACXFR_ACT_RECV_IF_R.class);
			MCQueryApiBuilder afterL_bldr = MCQueryApiBuilder.create(t);
			
			afterL_bldr.setSelect(t.loc_cd, t.acxfr_inst_no, t.ext_sys_cd, t.ext_acxfr_act_no);
			afterL_bldr
					.addConstWhereWithAnd(exists(subQuery().select(value("X")).from(S1ST)
							.where(t.ext_data_no.lt(S1ST.ext_data_no)
									.and(t.lg_grp_cd.eq(S1ST.lg_grp_cd)
											.or(t.loc_cd.eq(S1ST.loc_cd)))
									.and(t.ext_sys_cd.eq(S1ST.ext_sys_cd))
									.and(t.ext_acxfr_act_no.eq(S1ST.ext_acxfr_act_no))
									.and(S1ST.exe_sts_typ.in(
											value(MAC_EXE_STS_TYP.OK.value()),
											value(MAC_EXE_STS_TYP.SKP.value()))))));

			dbSelectColumn("MSLAL6080_MST_ACXFR_ACT_RECV_IF_S05", afterL, afterL_bldr, exeL, MST_ACXFR_ACT_RECV_IF_R.$data_lno);

			Set<List<String>> set = new HashSet<List<String>>();
			for (MST_ACXFR_ACT_RECV_IF_R afterR : afterL) {
				
				List<String> l = createOKSkipSetKey(afterR);
				if (!set.contains(l)) {
					set.add(l);
				}
			}
			return set;
		}
		
		/**
		 * 取込結果をマージする。
		 * @param skipL スキップリスト
		 * @param downL AcXfrActRecvIf_Upd04の下り電文
		 */
		protected void mergeExeRslt(MCList<MST_ACXFR_ACT_RECV_IF_R> skipL, MCList<AcXfrActRecvIf_Upd04_DtlR> downL) {
			
			_exeRslt = MCList.create(AcXfrActRecvIf_Upd04_DtlR.class);
			_exeRslt.setAll(downL);
			
			AcXfrActRecvIf_Upd04_DtlR dtlR = null;
			
			for (MST_ACXFR_ACT_RECV_IF_R skipR : skipL) {
				
				dtlR = AcXfrActRecvIf_Upd04_DtlR.create();
				dtlR.data_lno(skipR.data_lno());
				dtlR.exe_sts_typ(skipR.exe_sts_typ());
				_exeRslt.add(dtlR);
			}
		}
		
		/**
		 * 他勘定振替実績受信ＩＦ取込の後処理。
		 * @param exeL 取込対象リスト
		 */
		protected void afterCall(MCList<MST_ACXFR_ACT_RECV_IF_R> exeL) {
			
			rsltCnt(exeL);
			
			updIf(exeL);
			
			MCMessageList msgList = MCMessagePool.getMessageList();
			_logger.writeDataLog(msgList);
			
			dbTran().commit();
			
			msgList.clear();
		}

		/**
		 * 他勘定振替実績受信ＩＦを更新する。
		 * @param exeL 取込対象リスト
		 */
		protected void updIf(MCList<MST_ACXFR_ACT_RECV_IF_R> exeL) {
			
			MST_ACXFR_ACT_RECV_IF_R t = MST_ACXFR_ACT_RECV_IF_R.create("T");
			MCQueryApiBuilder exeL_bldr = MCQueryApiBuilder.create(t);

			exeL_bldr.setSet(t.imp_flg, t.exe_sts_typ, t.batch_log_no, t.log_sub_key1, t.log_sub_key2);
			
			dbUpdateKey("MSLAL6080_MST_ACXFR_ACT_RECV_IF_U01", exeL, exeL_bldr);
		}

		/**
		 * 取込結果の件数を算出する。
		 * @param exeL 取込対象リスト
		 */
		protected void rsltCnt(MCList<MST_ACXFR_ACT_RECV_IF_R> exeL) {
			
			MCIndexKey idxkey = _exeRslt.createIndex(AcXfrActRecvIf_Upd03_DtlR.$data_lno);
			
			for (MST_ACXFR_ACT_RECV_IF_R exeR : exeL) {
				
				AcXfrActRecvIf_Upd04_DtlR exeRslt = _exeRslt.getFirst(idxkey, exeR.data_lno());
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
		protected void setSkipSts(MST_ACXFR_ACT_RECV_IF_R exeR) {

			exeR.exe_sts_typ(MAC_EXE_STS_TYP.SKP.value());
		}
		
		/**
		 * 処理結果区分にエラーを設定する。
		 * 
		 * @param exeR 取込対象行
		 */
		protected void setErrSts(MST_ACXFR_ACT_RECV_IF_R exeR) {

			exeR.exe_sts_typ(MAC_EXE_STS_TYP.ERR.value());
			setErrSet(exeR);
		}
		
		/**
		 * 引数で渡された比較対象が同一取込単位かどうか。
		 * @param preR 前の取込対象
		 * @param exeR　取込対象
		 * @return 取込単位のいずれかが異なる場合はtrue
		 */
		protected boolean isNextData(MST_ACXFR_ACT_RECV_IF_R preR, MST_ACXFR_ACT_RECV_IF_R exeR) {
			
			return !(isSame(preR.ext_data_no(), exeR.ext_data_no())
					&& isSame(preR.lg_grp_cd(), exeR.lg_grp_cd())
					&& isSame(preR.acxfr_inst_no(), exeR.acxfr_inst_no())
					&& (isNull(preR.acxfr_inst_no()) || isSame(preR.ext_acxfr_act_no(), exeR.ext_acxfr_act_no())));
		}
		
		/**
		 * 他勘定振替実績受信ＩＦワークテーブルのデータを削除する。
		 * @param acxfrActRecvIfL 他勘定振替実績受信ＩＦリスト
		 */
		protected void delAcXfrActRecvIfWk(MCList<MST_ACXFR_ACT_RECV_IF_R> acxfrActRecvIfL, MST_ACXFR_ACT_RECV_IF_R acxfrActRecvIfL_t, MCQueryApiBuilder acxfrActRecvIfL_bldr) {
			
			dbWkDelete("MSLAL6080_MSW_ACXFR_ACT_RECV_IF_D02", acxfrActRecvIfL_bldr.getBaseDbc());
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
	 * AcXfrActRecvIf_Upd04オペレーション.<p>
	 *
	 * 他勘定振替実績受信ＩＦ取込を行う。（他勘定振替実績受信ＩＦサービスを呼び出す本処理）<br>
	 */
	public class AcXfrActRecvIf_Upd04 extends MSLAL_AcXfrActRecvIfService_MC_A.AcXfrActRecvIf_Upd04 {
		
		/**
		 * 他勘定振替実績受信ＩＦ取込チェックオペレーション
		 */
		protected MSLAL_AcXfrActRecvIfService.AcXfrActRecvIf_Chk01 _acxfrActRecvIfChk = null;
		
		/**
		 * MSBEL6410_他勘定振替実績受信ＩＦサービスの登録オペレーション
		 */
		protected MSBEL_AcXfrActRcptIFService.AcXfrActIF_Upd01 _upd01Serv = null;
		
		/**
		 * MSBEL6410_他勘定振替実績受信ＩＦサービスの実行前のメッセージリスト
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
			up0().setString(AcXfrActRecvIf_Upd04_DtlR.$exe_sts_typ, MAC_EXE_STS_TYP.NOT_EXE.value());
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
			MCList<AcXfrActRecvIf_Upd04_DtlR>[] grp = getGrp();
			
			MCMessageList msgList = new MCMessageList();
			msgList.addAll(MCMessagePool.getMessageList());

			for (MCList<AcXfrActRecvIf_Upd04_DtlR> acxfrActRecvIfL : grp) {

				acxfrActRecvIfL = acxfrActRecvIfL.subList(r -> !isStopErr(r));
				if (acxfrActRecvIfL.isEmpty()) {
					continue;
				}
				
				// 異なる他勘定振替実績の間に影響が発生しないように、メッセージプールをクリアする
				MCMessagePool.clear();
				
				callThisChk01(acxfrActRecvIfL);
				
				msgList.addAll(MCMessagePool.getMessageList());
				
				if (_acxfrActRecvIfChk.down1().isEmpty()) {
					continue;
				}
				// 計画外でエラーではないレコードを取込するので、メッセージプールをクリアする
				// （メッセージプールをクリアしないと、後続処理でエラーが発生するため）
				MCMessagePool.clear();
				
				try {
					sp = setSavepoint();
					callAcXfrActRcptIFService(acxfrActRecvIfL);
				}
				catch (Exception ex) {
					handleEx(ex, sp, acxfrActRecvIfL);
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
		 * 他勘定振替実績受信ＩＦ取込チェックを実行する。
		 * @param acxfrActRecvIfL 他勘定振替実績受信ＩＦリスト
		 */
		protected void callThisChk01(MCList<AcXfrActRecvIf_Upd04_DtlR> acxfrActRecvIfL) {
			
			_acxfrActRecvIfChk = MSLAL_AcXfrActRecvIfService.crtAcXfrActRecvIf_Chk01();
			setAll(_acxfrActRecvIfChk.up0(), acxfrActRecvIfL, createMap_AcXfrActRecvIf_Chk01_DtlR_AcXfrActRecvIf_Upd04_DtlR());
			_acxfrActRecvIfChk.exec();
			
			MCIndexKey idxkey = _acxfrActRecvIfChk.down0().createIndex(AcXfrActRecvIf_Chk01_DtlR.$data_lno);
			
			for (AcXfrActRecvIf_Upd04_DtlR dtlR : acxfrActRecvIfL) {
				AcXfrActRecvIf_Chk01_DtlR chkRsltR = _acxfrActRecvIfChk.down0().getFirst(idxkey, dtlR.data_lno());
				
				dtlR.uplnd_flg(chkRsltR.uplnd_flg());
				dtlR.hdr_dtl_peg_no(chkRsltR.hdr_dtl_peg_no());
				
				if (chkRsltR.err_flg()) {
					setErrSts(dtlR.axa());
				}
			}
			chkPrevErr(acxfrActRecvIfL);
		}
		
		/**
		 * MSBEL6410_他勘定振替実績受信ＩＦサービスを実行する。
		 * @param acxfrActRecvIfL 他勘定振替実績受信ＩＦリスト
		 */
		protected void callAcXfrActRcptIFService(MCList<AcXfrActRecvIf_Upd04_DtlR> acxfrActRecvIfL) {
			
			callAcXfrActRcptIFServiceUpd01(acxfrActRecvIfL);
			
			setOk(acxfrActRecvIfL);
		}
		
		/**
		 * MSBEL6410_他勘定振替実績受信ＩＦサービスの登録を実行する。
		 * @param acxfrActRecvIfL 他勘定振替実績受信ＩＦリスト
		 */
		protected void callAcXfrActRcptIFServiceUpd01(MCList<AcXfrActRecvIf_Upd04_DtlR> acxfrActRecvIfL) {
			
			_beforeCallServMsgList = (MCMessageList)MCMessagePool.getMessageList().clone();
			
			_upd01Serv = MSBEL_AcXfrActRcptIFService.crtAcXfrActIF_Upd01();
			
			copyall(_upd01Serv.up0(), _acxfrActRecvIfChk.down1());
			_upd01Serv.up1().setAll(_acxfrActRecvIfChk.down2());
			_upd01Serv.up2().setAll(_acxfrActRecvIfChk.down3());

			_upd01Serv.exec();
			
			setAcXfrActRcptIFServiceChk01Err(acxfrActRecvIfL);
			MAUCL_RevDataService.RevData_Upd02 revServ = MAUCL_RevDataService.crtRevData_Upd02();
			revServ.exec();
		}
		
		/**
		 * MSBEL6410_他勘定振替実績受信ＩＦサービスの登録チェック結果を他勘定振替実績受信ＩＦに反映する。
		 * @param acxfrActRecvIfL 他勘定振替実績受信ＩＦリスト
		 */
		protected void setAcXfrActRcptIFServiceChk01Err(MCList<AcXfrActRecvIf_Upd04_DtlR> acxfrActRecvIfL) {
			
			MCMessageList msgL = MCMessagePool.getMessageList();
			
			for (MCMessage msg :msgL) {
				
				if (!_beforeCallServMsgList.contains(msg) && isErrMsg(msg)) {
					// 他勘定振替実績受信ＩＦサービスの実行前のリストに存在しないかつエラーメッセージの場合、処理結果をエラーに設定する
					
					MCRow causeRow = msg.getCauseRow();
					
					for (AcXfrActRecvIf_Upd04_DtlR dtlR : acxfrActRecvIfL) {
						
						if (isNull(causeRow) 
								|| (causeRow.getParamIndex() == dtlR.getParamIndex()
									&& causeRow.getParamRowIndex() == dtlR.getParamRowIndex())) {
							
							setErrSts(dtlR.axa());
						}
					}
				}
			}
			
			chkGrpErr(acxfrActRecvIfL);
		}

		/**
		 * 更新処理例外発生時の後処理を行う。
		 * @param ex 例外
		 * @param sp セーブポイント
		 * @param acxfrActRecvIfL 他勘定振替実績受信ＩＦリスト
		 */
		protected void handleEx(Exception ex, MCSavepoint sp, MCList<AcXfrActRecvIf_Upd04_DtlR> acxfrActRecvIfL) {

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

			for (AcXfrActRecvIf_Upd04_DtlR opeRow : acxfrActRecvIfL) {
				
				MCMessagePool.add(opeRow, null, MSLAL0304, opeRow.data_no(), opeRow.data_lno(), msgId, msg);
				for (MCMessage causeMsg : causeMsgList) {
					MCMessage newMsg = new MCMessage(opeRow, null, causeMsg.getID(), (Object[])causeMsg.getBindArray());
					MCMessagePool.add(newMsg);
				}
				
				setErr(opeRow.axa());
			}
			
			if (sp != null) {
				
				dbTran().rollback(sp);
			}
		}
		
		/**
		 * 同一取込単位のうち、エラーが存在するかどうかチェックする。<br>
		 * 一部でもエラーがあったら全てエラーとする。
		 * @param acxfrActRecvIfL 他勘定振替実績受信ＩＦリスト
		 */
		protected void chkGrpErr(MCList<AcXfrActRecvIf_Upd04_DtlR> acxfrActRecvIfL) {

			// ヘッダ単位でグループエラー
			for (MCList<AcXfrActRecvIf_Upd04_DtlR> uplndL : acxfrActRecvIfL.groupList(AcXfrActRecvIf_Upd04_DtlR.$hdr_dtl_peg_no)) {
				
				MCIndexKey exeStsTypIdxkey = uplndL.createIndex(AcXfrActRecvIf_Upd04_DtlR.$exe_sts_typ);
				
				if (uplndL.contains(exeStsTypIdxkey, MAC_EXE_STS_TYP.ERR.value())) {
					
					for (AcXfrActRecvIf_Upd04_DtlR acxfrActRecvIfR : uplndL) {
					
						if (!isErr(acxfrActRecvIfR.axa())) {

							MCMessagePool.add(acxfrActRecvIfR, null, MSLAL0306, 
									acxfrActRecvIfR.data_no(), 
									acxfrActRecvIfR.data_lno(), 
									acxfrActRecvIfR.axa().trd_cd(),
									acxfrActRecvIfR.axa().loc_cd(),
									toYMDHMString(acxfrActRecvIfR.axa().acxfr_act_tm()),
									acxfrActRecvIfR.axa().act_dpt_cd(),
									acxfrActRecvIfR.axa().act_usr_cd());
							
							setErr(acxfrActRecvIfR.axa());
						}
					}
				}
			}
		}

		protected void chkPrevErr(MCList<AcXfrActRecvIf_Upd04_DtlR> acxfrActRecvIfL) {
			
			for (AcXfrActRecvIf_Upd04_DtlR acxfrActRecvIfR : acxfrActRecvIfL) {
				if (!isErr(acxfrActRecvIfR.axa())) {
					if (isPrevErr(acxfrActRecvIfR.axa())) {
						setErrSts(acxfrActRecvIfR.axa());				
						MCMessagePool.add(acxfrActRecvIfR, null, MSLAL0316, 
								acxfrActRecvIfR.data_no(), 
								acxfrActRecvIfR.data_lno(), 
								acxfrActRecvIfR.axa().ext_sys_cd(), 
								acxfrActRecvIfR.axa().ext_acxfr_act_no());
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
		protected boolean isStopErr(AcXfrActRecvIf_Upd04_DtlR r) {
			if (MAC_IF_UPD_TYP.isSTOP_ERROR(up1().if_upd_typ())
				&& object(CLAZZ)._stopErrSet.contains(r.axa().ext_sys_cd())) {
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
		 * 取込単位で他勘定振替実績受信ＩＦ情報をグループ化する。
		 * @return 取込単位のグループ
		 */
		@SuppressWarnings("unchecked")	// 総称配列の警告回避
		protected MCList<AcXfrActRecvIf_Upd04_DtlR>[] getGrp() {
			
			List<MCList<AcXfrActRecvIf_Upd04_DtlR>> arr = new ArrayList<>();
			AcXfrActRecvIf_Upd04_DtlR bkR = null;
			MCList<AcXfrActRecvIf_Upd04_DtlR> lst = null;

			for (AcXfrActRecvIf_Upd04_DtlR r : up0()) {
				if (isNull(bkR) || !r.equalColumns(bkR, getGrpKey())) {
					lst = MCList.create(AcXfrActRecvIf_Upd04_DtlR.class);
					arr.add(lst);
				}
				lst.add(r);
				bkR = r;
			}
			
			return arr.toArray(new MCList[arr.size()]);
		}

		/**
		 * 処理結果区分に処理済を設定する。
		 * @param acxfrActRecvIfL 他勘定振替実績受信ＩＦリスト
		 */
		protected void setOk(MCList<AcXfrActRecvIf_Upd04_DtlR> acxfrActRecvIfL) {
			
			for (AcXfrActRecvIf_Upd04_DtlR acxfrActRecvIfR : acxfrActRecvIfL) {
				
				if (!isErr(acxfrActRecvIfR.axa())) {
					acxfrActRecvIfR.exe_sts_typ(MAC_EXE_STS_TYP.OK.value());
				}
			}
		}
		
		/**
		 * 処理結果区分にエラーを設定する。
		 * @param acxfrActRecvIfR 他勘定振替実績受信ＩＦ
		 */
		protected void setErr(MST_ACXFR_ACT_RECV_IF_R acxfrActRecvIfR) {
			setErrSts(acxfrActRecvIfR);
		}
		
		/**
		 * 他勘定振替実績受信ＩＦの処理結果区分がエラーかどうか。
		 * @param acxfrActRecvIfR 他勘定振替実績受信ＩＦ
		 * @return 処理結果区分がエラーはtrue
		 */
		protected boolean isErr(MST_ACXFR_ACT_RECV_IF_R acxfrActRecvIfR) {
			
			return MAC_EXE_STS_TYP.isERR(acxfrActRecvIfR.exe_sts_typ());
		}
		
		/**
		 * 同一取込グループのキーを返す。
		 * @return 同一取込グループのキー
		 */
		protected String[] getGrpKey() {
			
			return new String[] { 
					AcXfrActRecvIf_Upd04_DtlR.$ext_data_no,
					"axa.ext_sys_cd",
					AcXfrActRecvIf_Upd04_DtlR.$lg_grp_cd,
					AcXfrActRecvIf_Upd04_DtlR.$acxfr_inst_no};
		}
		
		protected Map_AcXfrActRecvIf_Chk01_DtlR_AcXfrActRecvIf_Upd04_DtlR<AcXfrActRecvIf_Chk01_DtlR,AcXfrActRecvIf_Upd04_DtlR> createMap_AcXfrActRecvIf_Chk01_DtlR_AcXfrActRecvIf_Upd04_DtlR() {
			return new Map_AcXfrActRecvIf_Chk01_DtlR_AcXfrActRecvIf_Upd04_DtlR<AcXfrActRecvIf_Chk01_DtlR, AcXfrActRecvIf_Upd04_DtlR>();
		}

		public class Map_AcXfrActRecvIf_Chk01_DtlR_AcXfrActRecvIf_Upd04_DtlR<D extends AcXfrActRecvIf_Chk01_DtlR, S extends AcXfrActRecvIf_Upd04_DtlR> extends MCRowMapper<D,S>{
			@Override
			public void valueCopy(D dest, S src) {
				
				dest.axa(src.axa());
				dest.setParamIndex(src.axa().getParamIndex());
				dest.setParamRowIndex(src.axa().getParamRowIndex());
			}
		}
	}
	/**
	 * AcXfrActRecvIf_Chk01オペレーション.<p>
	 *
	 * 他勘定振替実績受信ＩＦ取込を行う前のチェック処理<br>
	 */
	public class AcXfrActRecvIf_Chk01 extends MSLAL_AcXfrActRecvIfService_MC_A.AcXfrActRecvIf_Chk01 {
		
		/**
		 * 他勘定振替実績ヘッダリスト
		 */
		protected MCList<MST_ACXFR_ACT_R> _acxfrActL = null;
		
		/**
		 * 他勘定振替実績明細リスト
		 */
		protected MCList<MST_ACXFR_ACT_D_R> _acxfrActDL = null;
		
		/**
		 * 他勘定振替指図ヘッダリスト
		 */
		protected MCList<MST_ACXFR_INST_R> _acxfrInstL = null;
		
		/**
		 * 他勘定振替指図明細リスト
		 */
		protected MCList<MST_ACXFR_INST_D_R> _acxfrInstDL = null;
		
		/**
		 * 他勘定振替実績ヘッダのインデックス
		 */
		protected MCIndexKey _acxfrActIdxkey = null;
		
		/**
		 * 他勘定振替実績明細のインデックス
		 */
		protected MCIndexKey _acxfrActDIdxkey = null;
		
		/**
		 * 他勘定振替実績明細の(外部他勘定振替実績ＮＯ)インデックス
		 */
		protected MCIndexKey _extAcXfrActNoIdxkey = null;
		
		/**
		 * 他勘定振替実績受信ＩＦのインデックス
		 */
		protected MCIndexKey _acxfrActRecvIfIdxkey = null;
		
		/**
		 * 他勘定振替指図ヘッダのインデックス
		 */
		protected MCIndexKey _acxfrInstIdxkey = null;
		
		/**
		 * 他勘定振替指図明細のインデックス
		 */
		protected MCIndexKey _acxfrInstDIdxkey = null;
		
		/**
		 * 外部システムマスタのキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_EXT_SYS_R> _extSysCache = null;
		
		/** 
		 * 品目マスタ のキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache = null;
		
		/** 
		 * ロット・サブロットリスト のキャッシュ
		 */
		protected FXUCL_MCDbcCache<MSVT_LOT_LIST_R> _lotListCache = null;
		
		/** 
		 * ロット・サブロット のキャッシュ
		 */
		protected FXUCL_MCDbcCache<MST_LOT_R> _lotCache = null;
		
		/**
		 * 他勘定振替実績が分割されたことにより、新規登録用の他勘定振替実績受信ＩＦを格納するリスト
		 */
		protected MCList<AcXfrActRecvIf_Chk01_DtlR> _acxfrActSplitInsIfL = null;
		
		/**
		 * ヘッダ紐付けＮＯ
		 */
		protected long _hdrPegNo = 0;
		
		/** 
		 * 諸口品マスタ のキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_SUNDRY_ITM_R> _sundryItmCache = null;
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
			
			chkLot();
			
			compl();
			
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheck() {
			
			MCMessageList msgL = super.doServerCheck();
			
			getAcXfrActInfo();
			
			setAcXfrInst(up0());
			
			getAcXfrInstInfo();
			
			sortDtl(up0());
			
			setGdCd(up0());
			
			setUplndFlg(up0());
			
			msgL.addAll(chkReq(up0()));
			
			msgL.addAll(chkDuplicate(up0()));
			
			msgL.addAll(chkAcXfrInst(up0()));
			
			msgL.addAll(chkAcXfrInstD(up0()));
			
			msgL.addAll(chkAcXfrAct(up0()));
			
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			
			MCMessageList msgL = super.doServerCheckSub();
			
			beforeChkCompl(up0());
			
			MCList<AcXfrActRecvIf_Chk01_DtlR> chkList = getChkList(up0());
			
			if (!isNull(chkList)) {
				
				msgL.addAll(chkTrd(chkList));
				
				msgL.addAll(chkLoc(chkList));
			}
			
			return msgL;
		}
		
		/**
		 * 他勘定振替指図関連情報を取得する。
		 */
		protected void getAcXfrInstInfo() {
			
			getAcXfrInst();
			
			getAcXfrInstD();
		}
		
		/**
		 * 他勘定振替指図ヘッダを取得する。
		 */
		protected void getAcXfrInst() {
			
			_acxfrInstL = MCList.create(MST_ACXFR_INST_R.class);
			MST_ACXFR_INST_R t = MST_ACXFR_INST_R.create("T");
			MCQueryApiBuilder acxfrInstL_bldr = MCQueryApiBuilder.create(t);
			
			acxfrInstL_bldr.setWhere(t.acxfr_inst_no.eq(bind("acxfr_inst_no")));
			
			dbSelectForUpdate("MSLAL6080_MST_ACXFR_INST_S01", _acxfrInstL, acxfrInstL_bldr, up0().groupBy(AcXfrActRecvIf_Chk01_DtlR.$acxfr_inst_no));
			
			_acxfrInstIdxkey = _acxfrInstL.createIndex(MST_ACXFR_INST_R.$acxfr_inst_no);
		}
		
		/**
		 * 引数に指定された他勘定振替指図ＮＯで他勘定振替指図ヘッダを取得する。
		 * @param acxfrInstNo 他勘定振替指図ＮＯ
		 * @return 他勘定振替指図ヘッダ
		 */
		protected MST_ACXFR_INST_R getAcXfrInst(String acxfrInstNo) {
			
			return _acxfrInstL.getFirst(_acxfrInstIdxkey, acxfrInstNo);
		}
		
		/**
		 * 他勘定振替指図明細を取得する。
		 */
		protected void getAcXfrInstD() {
			
			MST_ACXFR_INST_R t2 = MST_ACXFR_INST_R.create("T2");

			_acxfrInstDL = MCList.create(MST_ACXFR_INST_D_R.class);
			MST_ACXFR_INST_D_R t = MST_ACXFR_INST_D_R.create("T");
			MCQueryApiBuilder acxfrInstDL_bldr = MCQueryApiBuilder.create(t);
			
			acxfrInstDL_bldr.addInnerJoin(t2, t.acxfr_inst_no.eq(t2.acxfr_inst_no));
			acxfrInstDL_bldr.setWhere(t.acxfr_inst_no.eq(bind("acxfr_inst_no")));
			
			acxfrInstDL_bldr.addLockTable(t.acxfr_inst_no);
			dbSelectForUpdate("MSLAL6080_MST_ACXFR_INST_D_S01", _acxfrInstDL, acxfrInstDL_bldr, _acxfrInstL.groupBy(MST_ACXFR_INST_R.$acxfr_inst_no));
			
			_acxfrInstDIdxkey = _acxfrInstDL.createIndex(MST_ACXFR_INST_D_R.$acxfr_inst_d_no);
		}
		
		/**
		 * 引数に指定された他勘定振替指図明細ＮＯで他勘定振替指図明細を取得する。
		 * @param acxfrInstDNo 他勘定振替指図明細ＮＯ
		 * @return 他勘定振替指図明細
		 */
		protected MST_ACXFR_INST_D_R getAcXfrInstD(String acxfrInstDNo) {
			
			 return _acxfrInstDL.getFirst(_acxfrInstDIdxkey, acxfrInstDNo);
		}
		
		/**
		 * 他勘定振替実績関連情報を取得する。
		 */
		protected void getAcXfrActInfo() {
			
			getAcXfrAct();
			
			getAcXfrActD();
		}
		
		/**
		 * 他勘定振替実績ヘッダを取得する。
		 */
		protected void getAcXfrAct() {
			
			MST_ACXFR_ACT_D_R t2 = MST_ACXFR_ACT_D_R.create("T2");

			_acxfrActL = MCList.create(MST_ACXFR_ACT_R.class);
			MST_ACXFR_ACT_R t = MST_ACXFR_ACT_R.create("T");
			MCQueryApiBuilder acxfrActL_bldr = MCQueryApiBuilder.create(t);
			
			acxfrActL_bldr.addInnerJoin(t2, t.acxfr_act_no.eq(t2.acxfr_act_no));
			
			acxfrActL_bldr.setWhere(t2.ext_sys_cd.eq(bind("ext_sys_cd")));
			acxfrActL_bldr.addWhereWithAnd(t2.ext_acxfr_act_no.eq(bind("ext_acxfr_act_no")));
			acxfrActL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			acxfrActL_bldr.addWhereWithAnd(t2.can_flg.eq(value(false)));
			acxfrActL_bldr.addLockTable(t.acxfr_act_no);
			
			dbSelectForUpdate("MSLAL6080_MST_ACXFR_ACT_S01", _acxfrActL, acxfrActL_bldr, up0().groupBy( AcXfrActRecvIf_Chk01_DtlR.$ext_sys_cd, AcXfrActRecvIf_Chk01_DtlR.$ext_acxfr_act_no));
			
			_acxfrActIdxkey = _acxfrActL.createIndex(MST_ACXFR_ACT_R.$acxfr_act_no);
		}
		
		/**
		 * 引数に指定された他勘定振替実績ＮＯで他勘定振替実績ヘッダを取得する。
		 * @param acxfrActNo 他勘定振替実績ＮＯ
		 * @return 他勘定振替実績ヘッダ
		 */
		protected MST_ACXFR_ACT_R getAcXfrAct(String acxfrActNo) {
			
			return _acxfrActL.getFirst(_acxfrActIdxkey, acxfrActNo);
		}
		
		/**
		 * 他勘定振替実績明細を取得する。
		 */
		protected void getAcXfrActD() {
			
			MAM_ITM_R m1 = MAM_ITM_R.create("M1");

			_acxfrActDL = MCList.create(MST_ACXFR_ACT_D_R.class);
			MST_ACXFR_ACT_D_R t = MST_ACXFR_ACT_D_R.create("T");
			MCQueryApiBuilder acxfrActDL_bldr = MCQueryApiBuilder.create(t);
			acxfrActDL_bldr.addSelect(m1.itm_nm);
			
			acxfrActDL_bldr.addLeftOuterJoin(m1, t.itm_cd.eq(m1.itm_cd).and(t.itm_sub1.eq(m1.itm_sub1)).and(t.itm_sub2.eq(m1.itm_sub2)).and(t.itm_sub3.eq(m1.itm_sub3)));
			acxfrActDL_bldr.setWhere(t.acxfr_act_no.eq(bind("acxfr_act_no")));
			acxfrActDL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			
			acxfrActDL_bldr.addLockTable(t.acxfr_act_d_no);
			dbSelectForUpdate("MSLAL6080_MST_ACXFR_ACT_D_S01", _acxfrActDL, acxfrActDL_bldr, _acxfrActL.groupBy(MST_ACXFR_ACT_R.$acxfr_act_no));
			
			_acxfrActDIdxkey = _acxfrActDL.createIndex(MST_ACXFR_ACT_D_R.$acxfr_act_d_no);
			
			_extAcXfrActNoIdxkey = _acxfrActDL.createIndex(MST_ACXFR_ACT_D_R.$ext_sys_cd, MST_ACXFR_ACT_D_R.$ext_acxfr_act_no);
		}
		
		/**
		 * 引数に指定された他勘定振替実績明細ＮＯで他勘定振替実績明細を取得する。
		 * @param acxfrActDNo 他勘定振替実績明細ＮＯ
		 * @return 他勘定振替実績明細
		 */
		protected MST_ACXFR_ACT_D_R getAcXfrActD(String acxfrActDNo) {
			
			 return _acxfrActDL.getFirst(_acxfrActDIdxkey, acxfrActDNo);
		}
		
		/**
		 * 処理対象の明細をソートする。
		 * 
		 * @param acxfrActRecvIfL 他勘定振替実績受信ＩＦリスト
		 */
		protected void sortDtl(MCList<AcXfrActRecvIf_Chk01_DtlR> acxfrActRecvIfL) {
			
			acxfrActRecvIfL.sort(AcXfrActRecvIf_Chk01_DtlR.$ext_sys_cd, AcXfrActRecvIf_Chk01_DtlR.$ext_acxfr_act_no);
		}
		
		/**
		 * 他勘定振替指図の補完
		 * 
		 * @param acxfrActRecvIfL 他勘定振替実績受信ＩＦリスト
		 */
		protected void setAcXfrInst(MCList<AcXfrActRecvIf_Chk01_DtlR> acxfrActRecvIfL) {
			
			for (AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR : acxfrActRecvIfL) {
				if (isUpd(acxfrActRecvIfR) || isDel(acxfrActRecvIfR)) {
					MST_ACXFR_ACT_D_R acxfrActDR = _acxfrActDL.getFirst(
							_extAcXfrActNoIdxkey, acxfrActRecvIfR.ext_sys_cd(), acxfrActRecvIfR.ext_acxfr_act_no());
					
					if(isNull(acxfrActDR)) {
						continue;
					}
					MST_ACXFR_ACT_R acxfrActR = getAcXfrAct(acxfrActDR.acxfr_act_no());
					
					acxfrActRecvIfR.acxfr_inst_no(acxfrActR.acxfr_inst_no());
					acxfrActRecvIfR.acxfr_inst_d_no(acxfrActDR.acxfr_inst_d_no());
				}
			}
		}
		
		/**
		 * 格付ＣＤを設定する。(システムパラメータ(DEF_STK_GD_CD)が設定されている場合、その値を設定する)
		 * @param acxfrActRecvIfL 他勘定振替実績受信ＩＦリスト
		 */
		protected void setGdCd(MCList<AcXfrActRecvIf_Chk01_DtlR> acxfrActRecvIfL) {
			
			String defStkGdCd = getSysParm("DEF_STK_GD_CD");
			for (AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR : acxfrActRecvIfL) {
				if (!isNull(defStkGdCd)) {
					acxfrActRecvIfR.gd_cd(defStkGdCd);
				}
			}
		}

		/**
		 * 計画外FLGを設定する。（他勘定振替引当状況NO、他勘定振替指図NO、納品書明細NO、納品書NOがすべて未設定の場合に、計画外とする）
		 * @param acxfrActRecvIfL 他勘定振替実績受信ＩＦリスト
		 */
		protected void setUplndFlg(MCList<AcXfrActRecvIf_Chk01_DtlR> acxfrActRecvIfL) {
			
			for (AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR : acxfrActRecvIfL) {
				
				if (isCrt(acxfrActRecvIfR) || isUpd(acxfrActRecvIfR) || isDel(acxfrActRecvIfR)) {
					
					if (isNullAnd(acxfrActRecvIfR.acxfr_inst_no(),
							acxfrActRecvIfR.acxfr_inst_d_no())) {
						
						acxfrActRecvIfR.uplnd_flg(true);
					}
				}
			}
		}
		
		/**
		 * 条件付き必須チェックを行う。
		 * @param acxfrActRecvIfL 他勘定振替実績受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkReq(MCList<AcXfrActRecvIf_Chk01_DtlR> acxfrActRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR : acxfrActRecvIfL) {
				
				if (isCrt(acxfrActRecvIfR) || isUpd(acxfrActRecvIfR)) {
					
					// 計画と計画外の共通必須チェックのみ行う。（条件付き必須チェックは後続処理に任せる）
					msgL.addAll(check(acxfrActRecvIfR, AcXfrActRecvIf_Chk01_DtlR.$acxfr_act_tm, new FXUCL_RequiredValidater()));
					msgL.addAll(check(acxfrActRecvIfR, AcXfrActRecvIf_Chk01_DtlR.$trd_unit_qty, new FXUCL_RequiredValidater()));
					
					if (!acxfrActRecvIfR.uplnd_flg()) {
						
						msgL.addAll(check(acxfrActRecvIfR, AcXfrActRecvIf_Chk01_DtlR.$acxfr_inst_no, new FXUCL_RequiredValidater()));
					}
					else {
						msgL.addAll(check(acxfrActRecvIfR, AcXfrActRecvIf_Chk01_DtlR.$trd_cd, new FXUCL_RequiredValidater()));
						msgL.addAll(check(acxfrActRecvIfR, AcXfrActRecvIf_Chk01_DtlR.$loc_cd, new FXUCL_RequiredValidater()));
						msgL.addAll(check(acxfrActRecvIfR, AcXfrActRecvIf_Chk01_DtlR.$itm_cd, new FXUCL_RequiredValidater()));
						msgL.addAll(check(acxfrActRecvIfR, AcXfrActRecvIf_Chk01_DtlR.$trd_unit_cd, new FXUCL_RequiredValidater()));
						msgL.addAll(check(acxfrActRecvIfR, AcXfrActRecvIf_Chk01_DtlR.$gd_cd, new FXUCL_RequiredValidater()));
						msgL.addAll(check(acxfrActRecvIfR, AcXfrActRecvIf_Chk01_DtlR.$stk_id_typ, new FXUCL_RequiredValidater()));
						msgL.addAll(check(acxfrActRecvIfR, AcXfrActRecvIf_Chk01_DtlR.$rsn_cd, new FXUCL_RequiredValidater()));
						msgL.addAll(check(acxfrActRecvIfR, AcXfrActRecvIf_Chk01_DtlR.$bd_dpt_cd, new FXUCL_RequiredValidater()));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 外部他勘定振替実績ＮＯが重複しているかをチェックする。
		 * @param acxfrActRecvIfL 他勘定振替実績受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkDuplicate(MCList<AcXfrActRecvIf_Chk01_DtlR> acxfrActRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			List<MCNumber> errL = new ArrayList<MCNumber>();
			AcXfrActRecvIf_Chk01_DtlR prev = null;
			for (AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR : acxfrActRecvIfL) {
				
				if (prev == null) {
					prev = acxfrActRecvIfR;
					continue;
				}
				
				if (isSame(acxfrActRecvIfR.ext_sys_cd(), prev.ext_sys_cd()) 
						&& isSame(acxfrActRecvIfR.ext_acxfr_act_no(), prev.ext_acxfr_act_no())) {
					
					if (!errL.contains(prev.data_lno())) {
						
						msgL.add(new MCMessage(prev, null, MSLAL0307, prev.data_no(),
								prev.data_lno(), 
								prev.ext_sys_cd(), 
								prev.ext_acxfr_act_no()));
						
						errL.add(prev.data_lno());
					}
					
					msgL.add(new MCMessage(acxfrActRecvIfR, null, MSLAL0307, acxfrActRecvIfR.data_no(),
							acxfrActRecvIfR.data_lno(), 
							acxfrActRecvIfR.ext_sys_cd(), 
							acxfrActRecvIfR.ext_acxfr_act_no()));
					
					errL.add(acxfrActRecvIfR.data_lno());
				}
				
				prev = acxfrActRecvIfR;
			}	
			
			return msgL;
		}
		
		/**
		 * 他勘定振替指図が存在するかどうかチェックする。
		 * @param acxfrActRecvIfL 他勘定振替実績受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkAcXfrInst(MCList<AcXfrActRecvIf_Chk01_DtlR> acxfrActRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR : acxfrActRecvIfL) {
				
				if (!acxfrActRecvIfR.uplnd_flg() && !isNull(acxfrActRecvIfR.acxfr_inst_no())) {
					
					MST_ACXFR_INST_R acxfrInstR = getAcXfrInst(acxfrActRecvIfR.acxfr_inst_no());
					
					if (isNull(acxfrInstR) || acxfrInstR.isEmpty()) {
						msgL.add(new MCMessage(acxfrActRecvIfR, null, MSLAL0309, acxfrActRecvIfR.data_no(),
								acxfrActRecvIfR.data_lno(), 
								acxfrActRecvIfR.acxfr_inst_no()));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 他勘定振替実績受信ＩＦ情報に対応する他勘定振替実績明細を特定できるかチェックする。
		 * @param shipActRecvIfL 他勘定振替実績受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkAcXfrInstD(MCList<AcXfrActRecvIf_Chk01_DtlR> acxfrActRecvIfL) {
			
			crtExtSysCache();
			
			MCMessageList msgL = new MCMessageList();
			
			MCIndexKey idxkey1 = _acxfrInstDL.createIndex(getAcXfrInstDKey1());
			MCIndexKey idxkey2 = _acxfrInstDL.createIndex(getAcXfrInstDKey2());
			MCIndexKey idxkey3 = _acxfrInstDL.createIndex(getAcXfrInstDKey3());
			MCIndexKey idxkey4 = _acxfrInstDL.createIndex(getAcXfrInstDKey4());
			MCIndexKey idxkey5 = _acxfrInstDL.createIndex(getAcXfrInstDKey5());
			MCIndexKey idxkey6 = _acxfrInstDL.createIndex(getAcXfrInstDKey6());
			
			for (AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR : acxfrActRecvIfL) {
				
				if (isDel(acxfrActRecvIfR) 
						|| acxfrActRecvIfR.uplnd_flg() || isNull(acxfrActRecvIfR.acxfr_inst_no())) {
					continue;
				}
				
				// 訂正・取消のＩＦデータに他勘定振替指図明細ＮＯが指定されていない場合、訂正・取消対象の他勘定振替実績明細.他勘定振替指図明細ＮＯを補完
				if (isNull(acxfrActRecvIfR.acxfr_inst_d_no())) {
					MST_ACXFR_ACT_D_R actDR = _acxfrActDL.getFirst(_extAcXfrActNoIdxkey, acxfrActRecvIfR.ext_sys_cd(), acxfrActRecvIfR.ext_acxfr_act_no());
					if (!isNull(actDR)) {
						acxfrActRecvIfR.acxfr_inst_d_no(actDR.acxfr_inst_d_no());
					}
				}
				MST_ACXFR_INST_D_R acXfrInstDR = _acxfrInstDL.getFirst(idxkey1, acxfrActRecvIfR.toArray(getAcXfrInstDKey1()));
				
				if (isNull(acXfrInstDR) || acXfrInstDR.isEmpty()) {
					acXfrInstDR = _acxfrInstDL.getFirst(idxkey2, acxfrActRecvIfR.toArray(getAcXfrInstDKey2()));
				}
				if (isNull(acXfrInstDR) || acXfrInstDR.isEmpty()) {
					acXfrInstDR = _acxfrInstDL.getFirst(idxkey3, acxfrActRecvIfR.toArray(getAcXfrInstDKey3()));
				}
				if (isNull(acXfrInstDR) || acXfrInstDR.isEmpty()) {
					acXfrInstDR = _acxfrInstDL.getFirst(idxkey4, acxfrActRecvIfR.toArray(getAcXfrInstDKey4()));
				}
				if (isNull(acXfrInstDR) || acXfrInstDR.isEmpty()) {
					acXfrInstDR = _acxfrInstDL.getFirst(idxkey5, acxfrActRecvIfR.toArray(getAcXfrInstDKey5()));
				}
				if (isNull(acXfrInstDR) || acXfrInstDR.isEmpty()) {
					acXfrInstDR = _acxfrInstDL.getFirst(idxkey6, acxfrActRecvIfR.toArray(getAcXfrInstDKey6()));
				}
				
				if (isNull(acXfrInstDR) || acXfrInstDR.isEmpty()) {
					
					msgL.add(new MCMessage(
							acxfrActRecvIfR, 
							null, 
							MSLAL0312, 
							acxfrActRecvIfR.data_no(), 
							acxfrActRecvIfR.data_lno(),
							acxfrActRecvIfR.acxfr_inst_no(), 
							acxfrActRecvIfR.acxfr_inst_d_no(), 
							toDispItm(nvl(acxfrActRecvIfR.itm_cd(),  MAC_STR.NULL_VAL.value()), 
									nvl(acxfrActRecvIfR.itm_sub1(),  MAC_STR.NULL_VAL.value()), 
									nvl(acxfrActRecvIfR.itm_sub2(),  MAC_STR.NULL_VAL.value()), 
									nvl(acxfrActRecvIfR.itm_sub3(), MAC_STR.NULL_VAL.value())), 
							acxfrActRecvIfR.str_ln_cd(),
							acxfrActRecvIfR.lot_no(),
							acxfrActRecvIfR.sublot_no(),
							toDispSno(nvl(acxfrActRecvIfR.sno1(), MAC_STR.NULL_VAL.value()), 
									nvl(acxfrActRecvIfR.sno2(), MAC_STR.NULL_VAL.value()), 
									nvl(acxfrActRecvIfR.sno3(), MAC_STR.NULL_VAL.value()),
									nvl(acxfrActRecvIfR.sno4(), MAC_STR.NULL_VAL.value()))));
				}
				else {
					
					MAM_EXT_SYS_R extSysR = getExtSysR(acxfrActRecvIfR);
					
					if (isCrt(acxfrActRecvIfR) && !MSC_PR_STS_TYP.isINST(acXfrInstDR.pr_sts_typ()) && !isNull(extSysR) && extSysR.not_dup_imp_flg()) {
						// 重複取込不可チェック
						msgL.add(new MCMessage(acxfrActRecvIfR, null, MSLAL0313, 
								acxfrActRecvIfR.data_no(), acxfrActRecvIfR.data_lno(), acxfrActRecvIfR.ext_sys_cd(), acxfrActRecvIfR.ext_acxfr_act_no()));
					}
					
					acxfrActRecvIfR.acxfr_inst_d_no(nvl(acxfrActRecvIfR.acxfr_inst_d_no(), acXfrInstDR.acxfr_inst_d_no()));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 他勘定振替指図明細を特定するためのキー項目を返す。<br>
		 * 優先順位１．他勘定振替指図明細ＮＯ
		 * @return キー項目配列
		 */
		protected String[] getAcXfrInstDKey1() {
			
			return new String[] {MST_ACXFR_INST_D_R.$acxfr_inst_d_no};
		}
		
		/**
		 * 他勘定振替指図明細を特定するためのキー項目を返す。<br>
		 * 優先順位２．他勘定振替指図ＮＯ＋品目＋棚＋ロットＮＯ＋サブロットＮＯ＋手配ＮＯ１～４（４つとも一致）
		 * @return キー項目配列
		 */
		protected String[] getAcXfrInstDKey2() {
			
			return new String[] {
					MST_ACXFR_INST_D_R.$acxfr_inst_no,
					MST_ACXFR_INST_D_R.$itm_cd,
					MST_ACXFR_INST_D_R.$itm_sub1,
					MST_ACXFR_INST_D_R.$itm_sub2,
					MST_ACXFR_INST_D_R.$itm_sub3,
					MST_ACXFR_INST_D_R.$str_ln_cd,
					MST_ACXFR_INST_D_R.$lot_no,
					MST_ACXFR_INST_D_R.$sublot_no,
					MST_ACXFR_INST_D_R.$sno1,
					MST_ACXFR_INST_D_R.$sno2,
					MST_ACXFR_INST_D_R.$sno3,
					MST_ACXFR_INST_D_R.$sno4};
		}
		
		/**
		 * 他勘定振替指図明細を特定するためのキー項目を返す。<br>
		 * 優先順位３．他勘定振替指図ＮＯ＋品目＋棚＋ロットＮＯ＋サブロットＮＯ
		 * @return キー項目配列
		 */
		protected String[] getAcXfrInstDKey3() {
			
			return new String[] {
					MST_ACXFR_INST_D_R.$acxfr_inst_no,
					MST_ACXFR_INST_D_R.$itm_cd,
					MST_ACXFR_INST_D_R.$itm_sub1,
					MST_ACXFR_INST_D_R.$itm_sub2,
					MST_ACXFR_INST_D_R.$itm_sub3,
					MST_ACXFR_INST_D_R.$str_ln_cd,
					MST_ACXFR_INST_D_R.$lot_no,
					MST_ACXFR_INST_D_R.$sublot_no};
		}
		
		/**
		 * 他勘定振替指図明細を特定するためのキー項目を返す。<br>
		 * 優先順位４．他勘定振替指図ＮＯ＋品目＋棚
		 * @return キー項目配列
		 */
		protected String[] getAcXfrInstDKey4() {
			
			return new String[] {
					MST_ACXFR_INST_D_R.$acxfr_inst_no,
					MST_ACXFR_INST_D_R.$itm_cd,
					MST_ACXFR_INST_D_R.$itm_sub1,
					MST_ACXFR_INST_D_R.$itm_sub2,
					MST_ACXFR_INST_D_R.$itm_sub3,
					MST_ACXFR_INST_D_R.$str_ln_cd};
		}
		
		/**
		 * 他勘定振替指図明細を特定するためのキー項目を返す。<br>
		 * 優先順位５．他勘定振替指図ＮＯ＋品目
		 * @return キー項目配列
		 */
		protected String[] getAcXfrInstDKey5() {
			
			return new String[] {
					MST_ACXFR_INST_D_R.$acxfr_inst_no,
					MST_ACXFR_INST_D_R.$itm_cd,
					MST_ACXFR_INST_D_R.$itm_sub1,
					MST_ACXFR_INST_D_R.$itm_sub2,
					MST_ACXFR_INST_D_R.$itm_sub3};
		}
		
		
		/**
		 * 他勘定振替指図明細を特定するためのキー項目を返す。<br>
		 * 優先順位６．他勘定振替指図ＮＯ
		 * @return キー項目配列
		 */
		protected String[] getAcXfrInstDKey6() {
			
			return new String[] {
					MST_ACXFR_INST_D_R.$acxfr_inst_no};
		}
		
		/**
		 * 対応する他勘定振替実績情報を取込みできるかチェックする。
		 * @param acxfrActRecvIfL 他勘定振替実績受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkAcXfrAct(MCList<AcXfrActRecvIf_Chk01_DtlR> acxfrActRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			boolean errFlg = false;
			
			for (AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR : acxfrActRecvIfL) {
				
				errFlg = false;
				
				MCList<MST_ACXFR_ACT_D_R> acxfrActDL = _acxfrActDL.subList(
						_extAcXfrActNoIdxkey, acxfrActRecvIfR.ext_sys_cd(), acxfrActRecvIfR.ext_acxfr_act_no());
				
				if (isCrt(acxfrActRecvIfR)) {
					
					for (MST_ACXFR_ACT_D_R acxfrActDR : acxfrActDL) {
						
						msgL.add(new MCMessage(acxfrActRecvIfR, null, MSLAL0308, 
								acxfrActRecvIfR.data_no(), acxfrActRecvIfR.data_lno(), acxfrActDR.ext_sys_cd(), acxfrActDR.ext_acxfr_act_no()));
						errFlg = true;
					}
				}
				else {
					
					if (acxfrActDL.size() > 1) {
						
						msgL.add(new MCMessage(acxfrActRecvIfR, null, MSLAL0310, acxfrActRecvIfR.data_no(), acxfrActRecvIfR.data_lno()));
						errFlg = true;
					}
					else if (acxfrActDL.size() == 0) {
						
						msgL.add(new MCMessage(acxfrActRecvIfR, null, MSLAL0311, acxfrActRecvIfR.data_no(), acxfrActRecvIfR.data_lno()));
						errFlg = true;
					}
				}
				
				if ((isUpd(acxfrActRecvIfR) || isDel(acxfrActRecvIfR)) && !errFlg) {
					
					MST_ACXFR_ACT_D_R acxfrActDR = acxfrActDL.get(0);
					
					// 更新/削除行の対応する他勘定振替実績ＮＯ、他勘定振替実績明細ＮＯを設定する
					acxfrActRecvIfR.acxfr_act_no(acxfrActDR.acxfr_act_no());
					acxfrActRecvIfR.acxfr_act_d_no(acxfrActDR.acxfr_act_d_no());
					
					if (isDel(acxfrActRecvIfR)) {
						
						acxfrActRecvIfR.acxfr_inst_d_no(nvl(acxfrActRecvIfR.acxfr_inst_d_no(), acxfrActDR.getStringNE(MST_ACXFR_INST_D_R.$acxfr_inst_d_no)));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * サーバチェック処理を行う前に、使用される項目を補完するを補完する
		 * @param chkList 他勘定振替実績受信ＩＦリスト
		 */
		protected void beforeChkCompl(MCList<AcXfrActRecvIf_Chk01_DtlR> chkList) {
			
			for (AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR : chkList) {
	
				setTrdPtnTyp(acxfrActRecvIfR);
			}
		}
		
		/**
		 * 取引パタン区分を設定する。
		 * @param acxfrActRecvIfR 他勘定振替実績受信ＩＦ
		 */
		protected void setTrdPtnTyp(AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR) {

			if (acxfrActRecvIfR.uplnd_flg()) {
				if (isNull(acxfrActRecvIfR.trd_ptn_typ())) {
					acxfrActRecvIfR.trd_ptn_typ(acxfrActRecvIfR.mst_trd_ptn_typ());
				}
			}
			else {
				// 他勘定振替指図の取引パタン区分を設定する
				MST_ACXFR_INST_R acxfrInstR = getAcXfrInst(acxfrActRecvIfR.acxfr_inst_no());
				if (!isNull(acxfrInstR)) {
					acxfrActRecvIfR.trd_ptn_typ(acxfrInstR.trd_ptn_typ());
				}
			}
		}
		
		/**
		 * 取引が変わっているかチェックする
		 * @param acxfrActRecvIfL 他勘定振替実績受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkTrd(MCList<AcXfrActRecvIf_Chk01_DtlR> acxfrActRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR : acxfrActRecvIfL) {
				
				if (isUpd(acxfrActRecvIfR) && acxfrActRecvIfR.uplnd_flg()) {
					
					MST_ACXFR_ACT_R acxfrActR = getAcXfrAct(acxfrActRecvIfR.acxfr_act_no());
					
					if (!isNull(acxfrActR) 
							&& !isNull(acxfrActRecvIfR.trd_cd()) 
							&& !isSame(acxfrActRecvIfR.trd_cd(), acxfrActR.trd_cd())) {
								
						msgL.add(new MCMessage(acxfrActRecvIfR, null, MSLAL0317, 
								acxfrActRecvIfR.data_no(), 
								acxfrActRecvIfR.data_lno(), 
								acxfrActR.trd_cd(),
								acxfrActR.trd_ptn_typ(),
								acxfrActRecvIfR.trd_cd(),
								acxfrActRecvIfR.trd_ptn_typ()));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 場所が変わっているかチェックする
		 * @param acxfrActRecvIfL 他勘定振替実績受信ＩＦリスト
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList chkLoc(MCList<AcXfrActRecvIf_Chk01_DtlR> acxfrActRecvIfL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR : acxfrActRecvIfL) {
				
				if (isUpd(acxfrActRecvIfR) && acxfrActRecvIfR.uplnd_flg()) {
					
					MST_ACXFR_ACT_R acxfrActR = getAcXfrAct(acxfrActRecvIfR.acxfr_act_no());
					
					if (!isNull(acxfrActR) 
							&& !isNull(acxfrActRecvIfR.loc_cd()) 
							&& !isSame(acxfrActRecvIfR.loc_cd(), acxfrActR.loc_cd())) {
								
						msgL.add(new MCMessage(acxfrActRecvIfR, null, MSLAL0314, 
								acxfrActRecvIfR.data_no(), 
								acxfrActRecvIfR.data_lno(), 
								acxfrActR.loc_cd(),
								acxfrActRecvIfR.loc_cd()));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 同一取込単位のうち、エラーが存在するかどうかチェックする。
		 */
		protected void chkGrpErr() {
			
			MCIndexKey idxkey = up0().createIndex(AcXfrActRecvIf_Chk01_DtlR.$uplnd_flg);
			
			// 計画(他勘定振替指図NOでグループエラー)
			MCList<AcXfrActRecvIf_Chk01_DtlR> plndL = up0().subList(idxkey, false);
			
			MCIndexKey plndErrIdxkey = plndL.createIndex(AcXfrActRecvIf_Chk01_DtlR.$err_flg);
			
			if (plndL.contains(plndErrIdxkey, true)) {
				
				for (AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR : plndL) {
					
					if (!acxfrActRecvIfR.err_flg()) {
						
						acxfrActRecvIfR.err_flg(true);
						
						MCMessagePool.add(acxfrActRecvIfR, null, MSLAL0305, 
								acxfrActRecvIfR.data_no(),
								acxfrActRecvIfR.data_lno(),
								acxfrActRecvIfR.acxfr_inst_no());
					}
				}
			}
			
			// 計画外（ヘッダ単位でグループエラー）
			for (MCList<AcXfrActRecvIf_Chk01_DtlR> acxfrActRecvIfL : up0().subList(idxkey, true).groupList(getAcXfrActRecvIfHdrKey())) {
				
				MCIndexKey errIdxkey = acxfrActRecvIfL.createIndex(AcXfrActRecvIf_Chk01_DtlR.$err_flg);
				
				if (acxfrActRecvIfL.contains(errIdxkey, true)) {
					
					for (AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR : acxfrActRecvIfL) {
					
						if (!acxfrActRecvIfR.err_flg()) {
							
							acxfrActRecvIfR.err_flg(true);
							
							MCMessagePool.add(acxfrActRecvIfR, null, MSLAL0306, 
									acxfrActRecvIfR.data_no(),
									acxfrActRecvIfR.data_lno(),
									acxfrActRecvIfR.trd_cd(),
									acxfrActRecvIfR.loc_cd(),
									toYMDHMString(acxfrActRecvIfR.acxfr_act_tm()),
									acxfrActRecvIfR.act_dpt_cd(),
									acxfrActRecvIfR.act_usr_cd());
						}
					}
				}
			}
		}
		
		/**
		 * ロットＮＯとサブロットＮＯのチェックを行う。
		 */
		protected void chkLot() {
			
			MCMessageList msgL = new MCMessageList();
			
			MCList<AcXfrActRecvIf_Chk01_DtlR> chkList = getChkList(up0());
			
			for (AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR : chkList) {
				
				MAM_ITM_R itmR = getItm(acxfrActRecvIfR);
				
				if (isDel(acxfrActRecvIfR) 
						|| !MAC_TRD_PTN_TYP.isSTK_OTH_GR(acxfrActRecvIfR.trd_ptn_typ())
						|| (MAC_LOT_MNG_TYP.isNOT_MNG(itmR.lot_mng_typ()) 
								&& MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmR.sublot_mng_typ()))) {
					// 他勘定入庫以外の場合は、設定しない
					continue;
				}
				
				if (MAC_LOT_MNG_TYP.req_lot(itmR.lot_mng_typ()) 
						&& MAC_LOT_NO_TYP.isMANUAL(itmR.lot_no_typ())) {
					
					acxfrActRecvIfR.lot_no(nullValToNull(acxfrActRecvIfR.lot_no()));
					msgL.addAll(check(acxfrActRecvIfR, AcXfrActRecvIf_Chk01_DtlR.$lot_no, new FXUCL_RequiredValidater()));
				}
				
				if (MAC_SUBLOT_MNG_TYP.req_lot(itmR.sublot_mng_typ()) 
						&& MAC_LOT_NO_TYP.isMANUAL(itmR.sublot_no_typ())) {
					
					acxfrActRecvIfR.sublot_no(nullValToNull(acxfrActRecvIfR.sublot_no()));
					msgL.addAll(check(acxfrActRecvIfR, AcXfrActRecvIf_Chk01_DtlR.$sublot_no, new FXUCL_RequiredValidater()));
				}
				
				if ((!isNull(itmR.lot_mng_typ()) && MAC_LOT_MNG_TYP.req_lot(itmR.lot_mng_typ()) && !existsMstLot(acxfrActRecvIfR))
						|| (!isNull(itmR.sublot_mng_typ()) && MAC_SUBLOT_MNG_TYP.req_lot(itmR.sublot_mng_typ()) 
								&& !MAC_SUBLOT_MNG_TYP.isSTK(itmR.sublot_mng_typ()) && !existsLot(acxfrActRecvIfR))) {
					
					acxfrActRecvIfR.crt_lot_flg(true);
				}
			}
			
			if (!msgL.isEmpty()) {
				MCMessagePool.addAll(msgL);
				setErrFlg(msgL);
			}
		}
		
		protected void chkPrevErr() {
			
			for (AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR : up0()) {
				if (!acxfrActRecvIfR.err_flg()) {
					if (isPrevErr(acxfrActRecvIfR.axa())) {
						
						acxfrActRecvIfR.err_flg(true);
						
						MCMessagePool.add(acxfrActRecvIfR, null, MSLAL0316, 
								acxfrActRecvIfR.data_no(), 
								acxfrActRecvIfR.data_lno(), 
								acxfrActRecvIfR.axa().ext_sys_cd(), 
								acxfrActRecvIfR.axa().ext_acxfr_act_no());
					}
				}
			}
		}
		
		/**
		 * 補完時に必要な項目を先に設定する。
		 */
		protected void preCompl() {

			setItm();
			
			setSno();
		}
		
		/**
		 * 補完処理で使用するキャッシュ情報を作成する。
		 */
		protected void crtCache() {
				
			crtItmCache();
			
			setLot();
			
			crtLotListCache();
			
			crtLotCache();
			
			crtSundryItmCache();
		}
		
		/**
		 * 品目を設定する。（計画の場合、他勘定振替実績受信IFの品目を無視する）
		 */
		protected void setItm() {
			
			MCList<AcXfrActRecvIf_Chk01_DtlR> chkList = getChkList(up0());
			for (AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR : chkList) {
				
				if (isDel(acxfrActRecvIfR)) {
					
					MST_ACXFR_ACT_D_R acxfrActDR = getAcXfrActD(acxfrActRecvIfR.acxfr_act_d_no());
					
					acxfrActRecvIfR.itm_cd(acxfrActDR.itm_cd());
					acxfrActRecvIfR.itm_sub1(acxfrActDR.itm_sub1());
					acxfrActRecvIfR.itm_sub2(acxfrActDR.itm_sub2());
					acxfrActRecvIfR.itm_sub3(acxfrActDR.itm_sub3());
				}
				else if (!acxfrActRecvIfR.uplnd_flg()) {
					
					MST_ACXFR_INST_D_R acxfrInstDR = getAcXfrInstD(acxfrActRecvIfR.acxfr_inst_d_no());
					
					acxfrActRecvIfR.itm_cd(acxfrInstDR.itm_cd());
					acxfrActRecvIfR.itm_sub1(acxfrInstDR.itm_sub1());
					acxfrActRecvIfR.itm_sub2(acxfrInstDR.itm_sub2());
					acxfrActRecvIfR.itm_sub3(acxfrInstDR.itm_sub3());
				}
				else {
					if (!isNull(acxfrActRecvIfR.itm_cd())) {
						acxfrActRecvIfR.itm_sub1(nvl(acxfrActRecvIfR.itm_sub1(), MAC_STR.NULL_VAL.value()));
						acxfrActRecvIfR.itm_sub2(nvl(acxfrActRecvIfR.itm_sub2(), MAC_STR.NULL_VAL.value()));
						acxfrActRecvIfR.itm_sub3(nvl(acxfrActRecvIfR.itm_sub3(), MAC_STR.NULL_VAL.value()));
					}
					
					if (!isNull(acxfrActRecvIfR.bd_itm_cd())) {
						acxfrActRecvIfR.bd_itm_sub1(nvl(acxfrActRecvIfR.bd_itm_sub1(), MAC_STR.NULL_VAL.value()));
						acxfrActRecvIfR.bd_itm_sub2(nvl(acxfrActRecvIfR.bd_itm_sub2(), MAC_STR.NULL_VAL.value()));
						acxfrActRecvIfR.bd_itm_sub3(nvl(acxfrActRecvIfR.bd_itm_sub3(), MAC_STR.NULL_VAL.value()));
					}
				}
			}
		}
		
		/**
		 * 手配ＮＯを設定する。（計画の場合、他勘定振替実績受信IFの手配ＮＯを無視する）
		 */
		protected void setSno() {
			
			MCList<AcXfrActRecvIf_Chk01_DtlR> chkList = getChkList(up0());
			for (AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR : chkList) {
				
				if (!isNull(acxfrActRecvIfR.acxfr_inst_d_no())) {
					
					MST_ACXFR_INST_D_R acxfrInstDR = getAcXfrInstD(acxfrActRecvIfR.acxfr_inst_d_no());
					
					acxfrActRecvIfR.sno1(acxfrInstDR.sno1());
					acxfrActRecvIfR.sno2(acxfrInstDR.sno2());
					acxfrActRecvIfR.sno3(acxfrInstDR.sno3());
					acxfrActRecvIfR.sno4(acxfrInstDR.sno4());
				}
				else {
					acxfrActRecvIfR.sno1(nvl(acxfrActRecvIfR.sno1(), MAC_STR.NULL_VAL.value()));
					acxfrActRecvIfR.sno2(nvl(acxfrActRecvIfR.sno2(), MAC_STR.NULL_VAL.value()));
					acxfrActRecvIfR.sno3(nvl(acxfrActRecvIfR.sno3(), MAC_STR.NULL_VAL.value()));
					acxfrActRecvIfR.sno4(nvl(acxfrActRecvIfR.sno4(), MAC_STR.NULL_VAL.value()));
				}
			}
		}
		/**
		 * 外部システムマスタのキャッシューを作成する。
		 */
		protected void crtExtSysCache() {
			
			MCList<AcXfrActRecvIf_Chk01_DtlR> chkList = getChkList(up0());
			
			_extSysCache = new FXUCL_MCDbcCache<MAM_EXT_SYS_R>(
					MCQueryApiBuilder.create(MAM_EXT_SYS_R.create("T")), 
					chkList,
					MAM_EXT_SYS_R.$ext_sys_cd);
		}
		
		/**
		 * キャッシューから外部システムマスタを取得する。
		 * @param acxfrActRecvIfR 他勘定振替実績受信ＩＦ
		 * @return　外部システムマスタマスタ
		 */
		protected MAM_EXT_SYS_R getExtSysR(AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR) {
			
			return _extSysCache.get(acxfrActRecvIfR.ext_sys_cd());
		}
		
		/**
		 * 品目マスタのキャッシューを作成する。
		 */
		protected void crtItmCache() {
			
			MCList<AcXfrActRecvIf_Chk01_DtlR> chkList = getChkList(up0());
			
			_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(
					MCQueryApiBuilder.create(MAM_ITM_R.create("T")), 
					chkList, 
					AcXfrActRecvIf_Chk01_DtlR.$itm_cd, 
					AcXfrActRecvIf_Chk01_DtlR.$itm_sub1,
					AcXfrActRecvIf_Chk01_DtlR.$itm_sub2, 
					AcXfrActRecvIf_Chk01_DtlR.$itm_sub3);
		}
		
		/**
		 * キャッシューから品目マスタを取得する。
		 * @param acxfrActRecvIfR 他勘定振替実績受信ＩＦ
		 * @return 品目マスタマスタ
		 */
		protected MAM_ITM_R getItm(AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR) {
			
			return _itmCache.get(acxfrActRecvIfR.itm_cd(), acxfrActRecvIfR.itm_sub1(), acxfrActRecvIfR.itm_sub2(), acxfrActRecvIfR.itm_sub3());
		}
		
		/**
		 * ロットＮＯ、サブロットＮＯを設定する。<br>
		 * ロット管理しない場合、ＮＵＬＬ文字を設定する。
		 */
		protected void setLot() {
		
			MCList<AcXfrActRecvIf_Chk01_DtlR> chkList = getChkList(up0());
			
			for (AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR : chkList) {
				
				MAM_ITM_R itmR = getItm(acxfrActRecvIfR);
				
				if (!isNull(itmR.lot_mng_typ()) && !MAC_LOT_MNG_TYP.req_lot(itmR.lot_mng_typ())) {
					acxfrActRecvIfR.lot_no(MAC_STR.NULL_VAL.value());
				}
				if (!isNull(itmR.sublot_mng_typ()) && !MAC_SUBLOT_MNG_TYP.req_lot(itmR.sublot_mng_typ())) {
					acxfrActRecvIfR.sublot_no(MAC_STR.NULL_VAL.value());
				}
				
				if (!MAC_TRD_PTN_TYP.isSTK_OTH_GR(acxfrActRecvIfR.trd_ptn_typ())
						|| (MAC_LOT_MNG_TYP.isNOT_MNG(itmR.lot_mng_typ()) 
								&& MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmR.sublot_mng_typ()))) {
					// 他勘定入庫以外の場合は、設定しない
					continue;
				}
				
				MST_ACXFR_INST_D_R acxfrInstDR = getAcXfrInstD(acxfrActRecvIfR.acxfr_inst_d_no());
				MST_ACXFR_ACT_D_R acxfrActDR = getAcXfrActD(acxfrActRecvIfR.acxfr_act_d_no());
				
				if (isCrt(acxfrActRecvIfR) && !acxfrActRecvIfR.uplnd_flg()) {
					
					if (isNull(acxfrActRecvIfR.lot_no())) {
						acxfrActRecvIfR.lot_no(acxfrInstDR.lot_no());
					}
					if (isNull(acxfrActRecvIfR.sublot_no())) {
						acxfrActRecvIfR.sublot_no(acxfrInstDR.sublot_no());
					}
				}
				
				if (isUpd(acxfrActRecvIfR)) {
					
					if (isNull(acxfrActRecvIfR.lot_no())) {
						acxfrActRecvIfR.lot_no(acxfrActDR.lot_no());
					}
					
					if (isNull(acxfrActRecvIfR.sublot_no())) {
						acxfrActRecvIfR.sublot_no(acxfrActDR.sublot_no());
					}
				}
				
				if (isDel(acxfrActRecvIfR)) {
					acxfrActRecvIfR.lot_no(acxfrActDR.lot_no());
					acxfrActRecvIfR.sublot_no(acxfrActDR.sublot_no());
				}
				
			}
		}
		
		/**
		 * ロット・サブロットリストのキャッシューを作成する。（版ＮＯを取得するため）
		 */
		protected void crtLotListCache() {

			MCList<AcXfrActRecvIf_Chk01_DtlR> chkList = getChkList(up0());
			
			for (AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR : chkList) {
				
				if (isDel(acxfrActRecvIfR)) {
					continue;
				}
				
				MAM_ITM_R itmR = getItm(acxfrActRecvIfR);
					
				acxfrActRecvIfR.ver_flg(itmR.ver_flg());
			}
			
			MCIndexKey idxkey = chkList.createIndex(AcXfrActRecvIf_Chk01_DtlR.$ver_flg);
			MCList<AcXfrActRecvIf_Chk01_DtlR> verL = chkList.subList(idxkey, true);
			
			_lotListCache = new FXUCL_MCDbcCache<MSVT_LOT_LIST_R>(
					MCQueryApiBuilder.create(MSVT_LOT_LIST_R.create("T")), 
					verL, 
					AcXfrActRecvIf_Chk01_DtlR.$itm_cd, 
					AcXfrActRecvIf_Chk01_DtlR.$itm_sub1,
					AcXfrActRecvIf_Chk01_DtlR.$itm_sub2, 
					AcXfrActRecvIf_Chk01_DtlR.$itm_sub3,
					AcXfrActRecvIf_Chk01_DtlR.$lot_no,
					AcXfrActRecvIf_Chk01_DtlR.$sublot_no);
		}
		
		/**
		 * ロット・サブロットリストのキャッシューを作成する。
		 */
		protected void crtLotCache() {

			MCList<AcXfrActRecvIf_Chk01_DtlR> chkList = getChkList(up0());
			MCList<AcXfrActRecvIf_Chk01_DtlR> chkListEx = MCList.create(AcXfrActRecvIf_Chk01_DtlR.class);
			
			for (AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR : chkList) {
				
				if (isDel(acxfrActRecvIfR)) {
					continue;
				}
				
				AcXfrActRecvIf_Chk01_DtlR r = acxfrActRecvIfR.clone();
				
				MAM_ITM_R itmR = getItm(r);
				
				if (!itmR.isEmpty() && MAC_SUBLOT_MNG_TYP.isSTK(itmR.sublot_mng_typ())) {
					r.sublot_no(MAC_STR.NULL_VAL.value());
				}
				chkListEx.add(r);
			}
			
			_lotCache = new FXUCL_MCDbcCache<MST_LOT_R>(
					MCQueryApiBuilder.create(MST_LOT_R.create("T")), 
					chkListEx, 
					AcXfrActRecvIf_Chk01_DtlR.$itm_cd, 
					AcXfrActRecvIf_Chk01_DtlR.$itm_sub1,
					AcXfrActRecvIf_Chk01_DtlR.$itm_sub2, 
					AcXfrActRecvIf_Chk01_DtlR.$itm_sub3,
					AcXfrActRecvIf_Chk01_DtlR.$lot_no,
					AcXfrActRecvIf_Chk01_DtlR.$sublot_no);
		}
		
		/**
		 * キャッシューからロット・サブロットリストを取得する。（版ＮＯを取得するため）
		 * @param acxfrActRecvIfR 他勘定振替実績受信ＩＦ
		 * @return ロット・サブロットリスト
		 */
		protected MSVT_LOT_LIST_R getLotList(AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR) {
			
			return _lotListCache.get(
					acxfrActRecvIfR.itm_cd(), 
					acxfrActRecvIfR.itm_sub1(), 
					acxfrActRecvIfR.itm_sub2(), 
					acxfrActRecvIfR.itm_sub3(),
					acxfrActRecvIfR.lot_no(),
					acxfrActRecvIfR.sublot_no());
		}
		
		/**
		 * キャッシューからロット・サブロットリストを取得する。（LOT新規フラグの判定のため）
		 * @param acxfrActRecvIfR 他勘定振替実績受信ＩＦ
		 * @return ロット・サブロットリスト
		 */
		protected MST_LOT_R getLot(AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR) {
			
			AcXfrActRecvIf_Chk01_DtlR r = acxfrActRecvIfR.clone();
			
			MAM_ITM_R itmR = getItm(r);
			
			if (!itmR.isEmpty() && MAC_SUBLOT_MNG_TYP.isSTK(itmR.sublot_mng_typ())) {
				r.sublot_no(MAC_STR.NULL_VAL.value());
			}
			return _lotCache.get(
					r.itm_cd(), 
					r.itm_sub1(), 
					r.itm_sub2(), 
					r.itm_sub3(),
					r.lot_no(),
					r.sublot_no());
		}
		
		/**
		 * 諸口品マスタのキャッシュを作成する。
		 */
		protected void crtSundryItmCache() {
			
			MCList<AcXfrActRecvIf_Chk01_DtlR> chkList = getChkList(up0());
			
			_sundryItmCache = new FXUCL_MCDbcCache<MAM_SUNDRY_ITM_R>(
					MCQueryApiBuilder.create(MAM_SUNDRY_ITM_R.create("T")),
					chkList,
					AcXfrActRecvIf_Chk01_DtlR.$itm_cd,
					AcXfrActRecvIf_Chk01_DtlR.$itm_sub1,
					AcXfrActRecvIf_Chk01_DtlR.$itm_sub2,
					AcXfrActRecvIf_Chk01_DtlR.$itm_sub3,
					AcXfrActRecvIf_Chk01_DtlR.$sno1,
					AcXfrActRecvIf_Chk01_DtlR.$sno2,
					AcXfrActRecvIf_Chk01_DtlR.$sno3,
					AcXfrActRecvIf_Chk01_DtlR.$sno4);
		}
		/**
		 * キャッシュから諸口品マスタを取得する。
		 * @param acxfrActRecvIfR 他勘定振替実績受信ＩＦ
		 * @return 諸口品マスタ
		 */
		protected MAM_SUNDRY_ITM_R getSundryItm(AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR) {
			
			return _sundryItmCache.get(
					acxfrActRecvIfR.itm_cd(),
					acxfrActRecvIfR.itm_sub1(),
					acxfrActRecvIfR.itm_sub2(),
					acxfrActRecvIfR.itm_sub3(),
					acxfrActRecvIfR.sno1(),
					acxfrActRecvIfR.sno2(),
					acxfrActRecvIfR.sno3(),
					acxfrActRecvIfR.sno4());
		}
		/**
		 * 指定されたロットとサブロットはロット情報に存在するどうか。
		 * @param acxfrActRecvIfR 他勘定振替実績受信ＩＦ
		 * @return 存在する場合はtrue
		 */
		protected boolean existsLot(AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR) {
			
			MSVT_LOT_LIST_R lotR = getLotList(acxfrActRecvIfR);
			
			return !lotR.isEmpty();
		}
		
		/**
		 * 指定されたロットとサブロットはMST_LOTに存在するどうか。
		 * @param acxfrActRecvIfR 他勘定振替実績受信ＩＦ
		 * @return 存在する場合はtrue
		 */
		protected boolean existsMstLot(AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR) {
			
			MST_LOT_R lotR = getLot(acxfrActRecvIfR);
			return !lotR.isEmpty();
		}
		
		/**
		 * 他勘定振替実績受信ＩＦの補完を行う。
		 */
		protected void compl() {
			
			copyAcXfrInstInfo();
			
			complHdr();
			
			complDtl();
		}
		
		/**
		 * 他勘定振替実績受信ＩＦのヘッダ項目の補完を行う。
		 */
		protected void complHdr() {
			
			MCList<AcXfrActRecvIf_Chk01_DtlR> chkList = getChkList(up0());
			
			for (AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR : chkList) {
				
				if (isDel(acxfrActRecvIfR)) {
					continue;
				}
				// ヘッダの補完処理はここに追加
			}
		}
		
		/**
		 * 他勘定振替実績受信ＩＦの明細項目の補完を行う。
		 */
		protected void complDtl() {

			MCList<AcXfrActRecvIf_Chk01_DtlR> chkList = getChkList(up0());
			
			for (AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR : chkList) {
				
				if (isDel(acxfrActRecvIfR)) {
					continue;
				}
				
				MST_ACXFR_INST_D_R acxfrInstDR = getAcXfrInstD(acxfrActRecvIfR.acxfr_inst_d_no());
				
				MST_ACXFR_ACT_D_R acxfrActDR = getAcXfrActD(acxfrActRecvIfR.acxfr_act_d_no());
				
				setItmNm(acxfrActRecvIfR);
				
				setTrdUnitCd(acxfrActRecvIfR, acxfrInstDR, acxfrActDR);
				
				setBdDptCd(acxfrActRecvIfR, acxfrInstDR, acxfrActDR);
				
				setVerNo(acxfrActRecvIfR);
				
				setFixNoTyp(acxfrActRecvIfR);
				
				setFixNo(acxfrActRecvIfR);
				
				setStkArrvBpCd(acxfrActRecvIfR);
			}
		}
		
		/**
		 * 計画の場合、他勘定振替実績受信ＩＦのデータを無視し、他勘定振替指図から引継ぐ。
		 */
		protected void copyAcXfrInstInfo() {

			MCList<AcXfrActRecvIf_Chk01_DtlR> chkList = getChkList(up0());
			
			for (AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR : chkList) {
				
				if (acxfrActRecvIfR.uplnd_flg()) {
					continue;
				}
				
				if (isCrt(acxfrActRecvIfR)) {
					
					MST_ACXFR_INST_D_R acxfrInstDR = getAcXfrInstD(acxfrActRecvIfR.acxfr_inst_d_no());
					MST_ACXFR_INST_R acxfrInstR = getAcXfrInst(acxfrActRecvIfR.acxfr_inst_no());
					
					acxfrActRecvIfR.trd_cd(acxfrInstR.trd_cd());
					acxfrActRecvIfR.trd_ptn_typ(acxfrInstR.trd_ptn_typ());
					acxfrActRecvIfR.loc_cd(acxfrInstR.loc_cd());
					acxfrActRecvIfR.itm_cd(acxfrInstDR.itm_cd());
					acxfrActRecvIfR.itm_sub1(acxfrInstDR.itm_sub1());
					acxfrActRecvIfR.itm_sub2(acxfrInstDR.itm_sub2());
					acxfrActRecvIfR.itm_sub3(acxfrInstDR.itm_sub3());
					acxfrActRecvIfR.quality_typ(acxfrInstDR.quality_typ());
					acxfrActRecvIfR.gd_cd(acxfrInstDR.gd_cd());
					acxfrActRecvIfR.sno1(acxfrInstDR.sno1());
					acxfrActRecvIfR.sno2(acxfrInstDR.sno2());
					acxfrActRecvIfR.sno3(acxfrInstDR.sno3());
					acxfrActRecvIfR.sno4(acxfrInstDR.sno4());
					acxfrActRecvIfR.stk_id_typ(acxfrInstDR.stk_id_typ());
					acxfrActRecvIfR.stk_bp_cd(acxfrInstDR.stk_bp_cd());
					acxfrActRecvIfR.fix_no_typ(acxfrInstDR.fix_no_typ());
					acxfrActRecvIfR.fix_no(acxfrInstDR.fix_no());
					acxfrActRecvIfR.stk_arrv_bp_cd(acxfrInstDR.stk_arrv_bp_cd());
					acxfrActRecvIfR.rsn_cd(acxfrInstDR.rsn_cd());
					acxfrActRecvIfR.bd_itm_cd(acxfrInstDR.bd_itm_cd());
					acxfrActRecvIfR.bd_itm_sub1(acxfrInstDR.bd_itm_sub1());
					acxfrActRecvIfR.bd_itm_sub2(acxfrInstDR.bd_itm_sub2());
					acxfrActRecvIfR.bd_itm_sub3(acxfrInstDR.bd_itm_sub3());
					acxfrActRecvIfR.bd_lot_no(acxfrInstDR.bd_lot_no());
					acxfrActRecvIfR.bd_sublot_no(acxfrInstDR.bd_sublot_no());
					acxfrActRecvIfR.bd_sno1(acxfrInstDR.bd_sno1());
					acxfrActRecvIfR.bd_sno2(acxfrInstDR.bd_sno2());
					acxfrActRecvIfR.bd_sno3(acxfrInstDR.bd_sno3());
					acxfrActRecvIfR.bd_sno4(acxfrInstDR.bd_sno4());
					acxfrActRecvIfR.bd_bp_cd(acxfrInstDR.bd_bp_cd());
					acxfrActRecvIfR.bd_loc_cd(acxfrInstDR.bd_loc_cd());
					acxfrActRecvIfR.bd_ctg_cd(acxfrInstDR.bd_ctg_cd());
					acxfrActRecvIfR.bd_oper_cd(acxfrInstDR.bd_oper_cd());
				}
				else {
					
					// 更新の場合、他勘定振替実績明細の情報を引継ぐ
					MST_ACXFR_ACT_R acxfrActR = getAcXfrAct(acxfrActRecvIfR.acxfr_act_no());
					MST_ACXFR_ACT_D_R acxfrActDR = getAcXfrActD(acxfrActRecvIfR.acxfr_act_d_no());
					
					acxfrActRecvIfR.trd_cd(acxfrActR.trd_cd());
					acxfrActRecvIfR.trd_ptn_typ(acxfrActR.trd_ptn_typ());
					acxfrActRecvIfR.loc_cd(acxfrActR.loc_cd());
					acxfrActRecvIfR.itm_cd(acxfrActDR.itm_cd());
					acxfrActRecvIfR.itm_sub1(acxfrActDR.itm_sub1());
					acxfrActRecvIfR.itm_sub2(acxfrActDR.itm_sub2());
					acxfrActRecvIfR.itm_sub3(acxfrActDR.itm_sub3());
					acxfrActRecvIfR.quality_typ(acxfrActDR.quality_typ());
					acxfrActRecvIfR.gd_cd(acxfrActDR.gd_cd());
					acxfrActRecvIfR.sno1(acxfrActDR.sno1());
					acxfrActRecvIfR.sno2(acxfrActDR.sno2());
					acxfrActRecvIfR.sno3(acxfrActDR.sno3());
					acxfrActRecvIfR.sno4(acxfrActDR.sno4());
					acxfrActRecvIfR.stk_id_typ(acxfrActDR.stk_id_typ());
					acxfrActRecvIfR.stk_bp_cd(acxfrActDR.stk_bp_cd());
					acxfrActRecvIfR.fix_no_typ(acxfrActDR.fix_no_typ());
					acxfrActRecvIfR.fix_no(acxfrActDR.fix_no());
					acxfrActRecvIfR.stk_arrv_bp_cd(acxfrActDR.stk_arrv_bp_cd());
					acxfrActRecvIfR.rsn_cd(acxfrActDR.rsn_cd());
					acxfrActRecvIfR.bd_itm_cd(acxfrActDR.bd_itm_cd());
					acxfrActRecvIfR.bd_itm_sub1(acxfrActDR.bd_itm_sub1());
					acxfrActRecvIfR.bd_itm_sub2(acxfrActDR.bd_itm_sub2());
					acxfrActRecvIfR.bd_itm_sub3(acxfrActDR.bd_itm_sub3());
					acxfrActRecvIfR.bd_lot_no(acxfrActDR.bd_lot_no());
					acxfrActRecvIfR.bd_sublot_no(acxfrActDR.bd_sublot_no());
					acxfrActRecvIfR.bd_sno1(acxfrActDR.bd_sno1());
					acxfrActRecvIfR.bd_sno2(acxfrActDR.bd_sno2());
					acxfrActRecvIfR.bd_sno3(acxfrActDR.bd_sno3());
					acxfrActRecvIfR.bd_sno4(acxfrActDR.bd_sno4());
					acxfrActRecvIfR.bd_bp_cd(acxfrActDR.bd_bp_cd());
					acxfrActRecvIfR.bd_loc_cd(acxfrActDR.bd_loc_cd());
					acxfrActRecvIfR.bd_ctg_cd(acxfrActDR.bd_ctg_cd());
					acxfrActRecvIfR.bd_oper_cd(acxfrActDR.bd_oper_cd());
				}
			}
		}
		
		
		/**
		 * 品名を設定する。
		 * @param acxfrActRecvIfR 他勘定振替実績受信ＩＦ
		 */
		protected void setItmNm(AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR) {
			
			MAM_ITM_R itmR = getItm(acxfrActRecvIfR);
			
			MAM_SUNDRY_ITM_R sundryItmR = getSundryItm(acxfrActRecvIfR);
			
			MST_ACXFR_ACT_D_R acxfrActDR = getAcXfrActD(acxfrActRecvIfR.acxfr_act_d_no());
			if (itmR.sundry_itm_flg()) {
				
				if (isUpd(acxfrActRecvIfR)) {
					//計画の場合、諸口品マスタの品名を設定
					if (!isNull(acxfrActDR.acxfr_inst_d_no())) {
						acxfrActRecvIfR.itm_nm(sundryItmR.itm_nm());
					}
					else {
					//計画外の場合、IF品名を設定(設定がない場合、諸口品マスタの品名)
						acxfrActRecvIfR.itm_nm(nvl(acxfrActRecvIfR.axa().if_itm_nm(), sundryItmR.itm_nm()));
					}
				}
				else if (isCrt(acxfrActRecvIfR)) {
					//計画の場合、諸口品マスタの品名を設定
					if (!isNull(acxfrActRecvIfR.acxfr_inst_d_no())) {
						acxfrActRecvIfR.itm_nm(sundryItmR.itm_nm());
					}
					else {
					//計画外の場合、IF品名を設定(設定がない場合、諸口品マスタの品名)
						acxfrActRecvIfR.itm_nm(nvl(acxfrActRecvIfR.axa().if_itm_nm(), sundryItmR.itm_nm()));
					}
				}
			}
		}
		
		/**
		 * 負担部門を設定する。
		 * @param acxfrActRecvIfR 他勘定振替実績受信ＩＦ
 		 * @param acxfrInstDR 他勘定振替指図明細
		 * @param acxfrActDR 他勘定振替実績明細
		 */
		protected void setBdDptCd(AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR, MST_ACXFR_INST_D_R acxfrInstDR, MST_ACXFR_ACT_D_R acxfrActDR) {
			
			if (isNull(acxfrActRecvIfR.bd_dpt_cd())) {
				
				if (isCrt(acxfrActRecvIfR) && !acxfrActRecvIfR.uplnd_flg()) {
					acxfrActRecvIfR.bd_dpt_cd(acxfrInstDR.bd_dpt_cd());
				}
				else if (isUpd(acxfrActRecvIfR) && !acxfrActRecvIfR.uplnd_flg()) {
					acxfrActRecvIfR.bd_dpt_cd(acxfrActDR.bd_dpt_cd());
				}
			}
		}
		
		/**
		 * 取引単位を設定する。
		 * @param acxfrActRecvIfR 他勘定振替実績受信ＩＦ
 		 * @param acxfrInstDR 他勘定振替指図明細
		 * @param acxfrActDR 他勘定振替実績明細
		 */
		protected void setTrdUnitCd(AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR, MST_ACXFR_INST_D_R acxfrInstDR, MST_ACXFR_ACT_D_R acxfrActDR) {
			
			if (isNull(acxfrActRecvIfR.trd_unit_cd())) {
				
				if (isCrt(acxfrActRecvIfR) && !acxfrActRecvIfR.uplnd_flg()) {
					acxfrActRecvIfR.trd_unit_cd(acxfrInstDR.trd_unit_cd());
				}
				else if (isUpd(acxfrActRecvIfR) && !acxfrActRecvIfR.uplnd_flg()) {
					acxfrActRecvIfR.trd_unit_cd(acxfrActDR.trd_unit_cd());
				}
			}
		}
		
		/**
		 * 版ＮＯを設定する。
		 * @param acxfrActRecvIfR 他勘定振替実績受信ＩＦ
 		 * @param acxfrInstDR 他勘定振替指図明細
		 * @param acxfrActDR 他勘定振替実績明細
		 */
		protected void setVerNo(AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR) {
			
			if (acxfrActRecvIfR.ver_flg()) {
				
				MSVT_LOT_LIST_R lotR = getLotList(acxfrActRecvIfR);
				
				if (!isNull(lotR)) {
					acxfrActRecvIfR.ver_no(lotR.ver_no());
				}
			}
		}
		
		/**
		 * 確定ＮＯ区分を設定する。
		 * @param acxfrActRecvIfR 他勘定振替実績受信ＩＦ
		 */
		protected void setFixNoTyp(AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR) {

			if (MAC_TRD_PTN_TYP.isSTK_OTH_GR(acxfrActRecvIfR.trd_ptn_typ())) {
				acxfrActRecvIfR.fix_no_typ(null);
			}
		}
		
		/**
		 * 確定ＮＯを設定する。（確定ＮＯ区分が未設定またはなしの場合、クリアする）
		 * @param acxfrActRecvIfR 他勘定振替実績受信ＩＦ
		 */
		protected void setFixNo(AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR) {

			if (isNull(acxfrActRecvIfR.fix_no_typ()) || MSC_FIX_NO_TYP.isNON(acxfrActRecvIfR.fix_no_typ())) {
				acxfrActRecvIfR.fix_no(null);
			}
		}
		
		/**
		 * 在庫着荷先ＣＤを設定する。（在庫識別区分が返品検収前、預り、VMIのいずれかの場合、クリアする）
		 * @param acxfrActRecvIfR
		 */
		protected void setStkArrvBpCd(AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR) {
			
			if (MSC_STK_ID_TYP.isRTN_PRE_ACCPT(acxfrActRecvIfR.stk_id_typ())
					|| MSC_STK_ID_TYP.isCSTSTK(acxfrActRecvIfR.stk_id_typ())
					|| MSC_STK_ID_TYP.isRNT_RCV(acxfrActRecvIfR.stk_id_typ())) {
				acxfrActRecvIfR.stk_arrv_bp_cd(null);
			}
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			
			down0().setAll(up0());
			
			if (!getChkList(up0()).isEmpty()) {
				
				setDownAcXfrActCtrl();
				
				setDownAcXfrActDel();
				
				setDownAcXfrActUpd();
				
				setDownAcXfrActIns();
				
				setDownAcXfrActNone();
				
				setAbort();
				
				setPegNo(down1());
				
				setPegNo(down2());
				
				setPegNo(down3());
			}
		}
		
		/**
		 * 他勘定振替実績登録の制御ブロックの下り伝聞を設定する。
		 */
		protected void setDownAcXfrActCtrl() {
			
			AcXfrActIF_CtrlR ctrlR = AcXfrActIF_CtrlR.create();
			ctrlR.if_upd_typ(nvl(up1().if_upd_typ(), MAC_IF_UPD_TYP.SKIP_ERROR.value()));
			ctrlR.upd_cntr_chk_flg(false);
			ctrlR.is_src_batch_flg(true);
			ctrlR.not_commit_flg(true);
			
			copyall(down1(), ctrlR);
		}
		
		/**
		 * 他勘定振替実績用の下り電文を設定する。
		 */
		protected void setDownAcXfrActDel() {
			
			AcXfrActIF_HdrR delHdrR = null;
			AcXfrActIF_DtlR delDtlR = null;
			MCList<AcXfrActIF_DtlR> delDtlL = null;
			
			for (MCList<MST_ACXFR_ACT_D_R> acxfrActDL : _acxfrActDL.groupList(MST_ACXFR_ACT_D_R.$acxfr_act_no)) {
				
				MST_ACXFR_ACT_R acxfrActR = getAcXfrAct(acxfrActDL.get(0).acxfr_act_no());
				
				int ifDelSize = 0;
				
				for (MST_ACXFR_ACT_D_R acxfrActDR : acxfrActDL) {
				
					AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR = getAcXfrActRecvIfR(acxfrActDR);
					
					if (!isNull(acxfrActRecvIfR) && !acxfrActRecvIfR.err_flg() && isDel(acxfrActRecvIfR)) {
						ifDelSize++;
					}
				}
				
				if (isSame(acxfrActDL.size(), ifDelSize)) {
					// 削除件数が他勘定振替実績明細の件数と一致する場合、他勘定振替実績を取り消すとする
					delHdrR = AcXfrActIF_HdrR.create();
					
					// 外部他勘定振替実績NO順で他勘定振替実績を削除する
					acxfrActDL.sort(MST_ACXFR_ACT_D_R.$ext_sys_cd, MST_ACXFR_ACT_D_R.$ext_acxfr_act_no);
					AcXfrActRecvIf_Chk01_DtlR hdrAcXfrActIfR = getAcXfrActRecvIfR(acxfrActDL.get(0));
					
					setAcXfrActHdrDel(delHdrR, hdrAcXfrActIfR, acxfrActR);
					
					delDtlL = MCList.create(AcXfrActIF_DtlR.class);
					
					for (MST_ACXFR_ACT_D_R acxfrActDR : acxfrActDL) {
						
						AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR = getAcXfrActRecvIfR(acxfrActDR);
						
						delDtlR = AcXfrActIF_DtlR.create();

						setAcXfrActDtlDel(delDtlR, acxfrActRecvIfR, acxfrActDR, delHdrR);
						delDtlL.add(delDtlR);
					}
					
					down2().add(delHdrR);
					down3().addAll(delDtlL);
				}
			}
		}
		
		/**
		 * 他勘定振替実績登録サービスの削除前チェック用の他勘定振替実績ヘッダ情報を設定する。
		 * @param hdrR 削除前チェックヘッダ
		 * @param acxfrActRecvIfR 他勘定振替実績受信ＩＦ
		 * @param acxfrActR 他勘定振替実績ヘッダ
		 */
		protected void setAcXfrActHdrDel(AcXfrActIF_HdrR hdrR, AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR, MST_ACXFR_ACT_R acxfrActR) {
			
			hdrR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			
			hdrR.hdr_dtl_peg_no(_hdrPegNo);
			_hdrPegNo++;
						
			hdrR.can_ac_dt(acxfrActR.ac_dt());
			hdrR.acxfr_act_no(acxfrActR.acxfr_act_no());
			hdrR.acxfr_inst_no(acxfrActR.acxfr_inst_no());
			hdrR.trd_cd(acxfrActR.trd_cd());
			hdrR.trd_ptn_typ(acxfrActR.trd_ptn_typ());
			hdrR.loc_cd(acxfrActR.loc_cd());
			
			hdrR.setParamIndex(acxfrActRecvIfR.axa().getParamIndex());
			hdrR.setParamRowIndex(acxfrActRecvIfR.axa().getParamRowIndex());
		}
		
		/**
		 * 他勘定振替実績登録サービスの削除前チェック用の他勘定振替実績明細情報を設定する。
		 * @param dtlR 削除前チェック明細
		 * @param acxfrActRecvIfR 他勘定振替実績受信ＩＦ
		 * @param acxfrActDR 他勘定振替実績明細
		 * @param hdrR 削除前チェックヘッダ
		 */
		protected void setAcXfrActDtlDel(AcXfrActIF_DtlR dtlR, AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR, MST_ACXFR_ACT_D_R acxfrActDR, AcXfrActIF_HdrR hdrR) {
			
			acxfrActRecvIfR.hdr_dtl_peg_no(_hdrPegNo);
			
			dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			copy(dtlR, acxfrActRecvIfR, createMap_AcXfrActIF_DtlR_AcXfrActRecvIf_Chk01_DtlR_ForDel());
			dtlR.hdr_dtl_peg_no(hdrR.hdr_dtl_peg_no());
			dtlR.loc_cd(hdrR.loc_cd());
			dtlR.acxfr_act_no(acxfrActDR.acxfr_act_no());
			dtlR.acxfr_act_d_no(acxfrActDR.acxfr_act_d_no());
			dtlR.acxfr_inst_d_no(acxfrActDR.acxfr_inst_d_no());
			
			dtlR.setParamIndex(acxfrActRecvIfR.axa().getParamIndex());
			dtlR.setParamRowIndex(acxfrActRecvIfR.axa().getParamRowIndex());
		}
		
		protected Map_AcXfrActIF_DtlR_AcXfrActRecvIf_Chk01_DtlR_ForDel<AcXfrActIF_DtlR,AcXfrActRecvIf_Chk01_DtlR> createMap_AcXfrActIF_DtlR_AcXfrActRecvIf_Chk01_DtlR_ForDel() {
			return new Map_AcXfrActIF_DtlR_AcXfrActRecvIf_Chk01_DtlR_ForDel<AcXfrActIF_DtlR, AcXfrActRecvIf_Chk01_DtlR>();
		}

		public class Map_AcXfrActIF_DtlR_AcXfrActRecvIf_Chk01_DtlR_ForDel<D extends AcXfrActIF_DtlR, S extends AcXfrActRecvIf_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				
				addColumnPathMap(AcXfrActIF_DtlR.$itm_cd, AcXfrActRecvIf_Chk01_DtlR.$itm_cd);
				addColumnPathMap(AcXfrActIF_DtlR.$itm_sub1, AcXfrActRecvIf_Chk01_DtlR.$itm_sub1);
				addColumnPathMap(AcXfrActIF_DtlR.$itm_sub2, AcXfrActRecvIf_Chk01_DtlR.$itm_sub2);
				addColumnPathMap(AcXfrActIF_DtlR.$itm_sub3, AcXfrActRecvIf_Chk01_DtlR.$itm_sub3);
				addColumnPathMap(AcXfrActIF_DtlR.$ver_no, AcXfrActRecvIf_Chk01_DtlR.$ver_no);

				addColumnPathMap(AcXfrActIF_DtlR.$str_ln_cd, AcXfrActRecvIf_Chk01_DtlR.$str_ln_cd);
				addColumnPathMap(AcXfrActIF_DtlR.$stk_arrv_bp_cd, AcXfrActRecvIf_Chk01_DtlR.$stk_arrv_bp_cd);
				addColumnPathMap(AcXfrActIF_DtlR.$lot_no, AcXfrActRecvIf_Chk01_DtlR.$lot_no);
				addColumnPathMap(AcXfrActIF_DtlR.$sublot_no, AcXfrActRecvIf_Chk01_DtlR.$sublot_no);
				addColumnPathMap(AcXfrActIF_DtlR.$sno1, AcXfrActRecvIf_Chk01_DtlR.$sno1);
				addColumnPathMap(AcXfrActIF_DtlR.$sno2, AcXfrActRecvIf_Chk01_DtlR.$sno2);
				addColumnPathMap(AcXfrActIF_DtlR.$sno3, AcXfrActRecvIf_Chk01_DtlR.$sno3);
				addColumnPathMap(AcXfrActIF_DtlR.$sno4, AcXfrActRecvIf_Chk01_DtlR.$sno4);
				addColumnPathMap(AcXfrActIF_DtlR.$stk_id_typ, AcXfrActRecvIf_Chk01_DtlR.$stk_id_typ);
				addColumnPathMap(AcXfrActIF_DtlR.$stk_bp_cd, AcXfrActRecvIf_Chk01_DtlR.$stk_bp_cd);
				addColumnPathMap(AcXfrActIF_DtlR.$rsn_cd, AcXfrActRecvIf_Chk01_DtlR.$rsn_cd);
				addColumnPathMap(AcXfrActIF_DtlR.$gd_cd, AcXfrActRecvIf_Chk01_DtlR.$gd_cd);
				addColumnPathMap(AcXfrActIF_DtlR.$quality_typ, AcXfrActRecvIf_Chk01_DtlR.$quality_typ);
			}
		}
		
		/**
		 * 他勘定振替実績新規登録用の下り電文を設定する。
		 */
		protected void setDownAcXfrActIns() {
			
			MCList<AcXfrActRecvIf_Chk01_DtlR> insAcXfrActIfL = MCList.create(AcXfrActRecvIf_Chk01_DtlR.class);
			
			MCList<AcXfrActRecvIf_Chk01_DtlR> chkList = getChkList(up0());
			
			MCIndexKey crudIdxkey = chkList.createIndex(AcXfrActRecvIf_Chk01_DtlR.$data_crud_typ);
			insAcXfrActIfL.addAll(chkList.subList(crudIdxkey, MAC_DATA_CRUD_TYP.CRT.value()));
			insAcXfrActIfL.addAll(_acxfrActSplitInsIfL);
			
			MCList<AcXfrActIF_DtlR> dtlL = MCList.create(AcXfrActIF_DtlR.class);
			AcXfrActIF_DtlR dtlR = null;
			
			for (MCList<AcXfrActRecvIf_Chk01_DtlR> insL : insAcXfrActIfL.groupList(getAcXfrActRecvIfHdrKey())) {
				
				dtlL = MCList.create(AcXfrActIF_DtlR.class);
				
				AcXfrActRecvIf_Chk01_DtlR hdrIfR = insL.get(0);
				
				// データ更新区分が「新規」のレコードは、常に他勘定振替実績を新規登録する。（既存の他勘定振替実績に纏まらない）
				AcXfrActIF_HdrR hdrR = AcXfrActIF_HdrR.create();
				
				setAcXfrActHdrIns(hdrR, hdrIfR);
				down2().add(hdrR);

				for (AcXfrActRecvIf_Chk01_DtlR insIfR : insL) {
					
					dtlR = AcXfrActIF_DtlR.create();
					
					setAcXfrActDtlIns(dtlR, insIfR, hdrR);
					dtlL.add(dtlR);
				}
				
				down3().addAll(dtlL);
			}
		}
		
		/**
		 * 勘定振替実績削除用の下り電文を設定する。
		 */
		protected void setDownAcXfrActNone() {
			
			MCList<MST_ACXFR_ACT_D_R> acxfrActDNoneL = null;
			
			for (MCList<MST_ACXFR_ACT_D_R> acxfrActDL : _acxfrActDL.groupList(MST_ACXFR_ACT_D_R.$acxfr_act_no)) {
				
				acxfrActDNoneL = MCList.create(MST_ACXFR_ACT_D_R.class);
				
				for (MST_ACXFR_ACT_D_R acxfrActDR : acxfrActDL) {
				
					AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR = getAcXfrActRecvIfR(acxfrActDR);
					
					if (isNull(acxfrActRecvIfR) || acxfrActRecvIfR.err_flg()) {
						acxfrActDNoneL.add(acxfrActDR.clone());
					}
				}
				
				MCList<AcXfrActIF_DtlR> dtlL = MCList.create(AcXfrActIF_DtlR.class);
				AcXfrActIF_DtlR dtlR = null;
				
				for (MST_ACXFR_ACT_D_R acxfrActDR : acxfrActDNoneL) {
					
					AcXfrActIF_HdrR hdrR = getSameNoneHdr(acxfrActDR);
					
					if (!isNull(hdrR)) {
						
						dtlR = AcXfrActIF_DtlR.create();
						
						setAcXfrActDtlNone(dtlR, acxfrActDR, hdrR);
						
						dtlL.add(dtlR);
					}
				}
				
				down3().addAll(dtlL);
			}
		}
		
		/**
		 * 他勘定振替指図明細単位で打切/打切解除を行うように設定する。
		 */
		protected void setAbort() {

			for (MCList<AcXfrActIF_DtlR> acxfrActIfGrpL : down3().groupList(
					AcXfrActIF_DtlR.$hdr_dtl_peg_no, AcXfrActIF_DtlR.$acxfr_inst_d_no)) {
				
				if (!acxfrActIfGrpL.isEmpty() && isNull(acxfrActIfGrpL.get(0).acxfr_inst_d_no())) {
					continue;
				}
				
				boolean abortFlg = false;
				// 同一他勘定振替指図明細ＮＯで打切がオンのレコードが存在する場合に、すべて打切りとする
				if (!acxfrActIfGrpL.subList(r -> 
						(MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD((r.data_crud_typ())))
						&& r.getParamIndex() != -1
						&& r.getParamRowIndex() != -1
						&& r.abort_flg()).isEmpty()) {
					
					abortFlg = true;
				}
				
				for (AcXfrActIF_DtlR acxfrActIfDtlR :acxfrActIfGrpL) {
					if (!MAC_DATA_CRUD_TYP.isDEL(acxfrActIfDtlR.data_crud_typ())) {
						acxfrActIfDtlR.abort_flg(abortFlg);
					}
				}
			}
		}
		
		/**
		 * 電文から同一他勘定振替実績ヘッダを取得する。
		 * @param acxfrActDR 他勘定振替実績明細
		 * @return 他勘定振替実績ヘッダ
		 */
		protected AcXfrActIF_HdrR getSameNoneHdr(MST_ACXFR_ACT_D_R acxfrActDR) {
			
			for (AcXfrActIF_HdrR hdrR : down2()) {
				
				if (isSame(acxfrActDR.acxfr_act_no(), hdrR.acxfr_act_no())) {
					return hdrR;
				}
			}
			
			return null;
		}
		
		/**
		 * 他勘定振替実績削除用の下り電文を設定する。
		 */
		protected void setDownAcXfrActUpd() {
			
			MCIndexKey idxkey = _acxfrActL.createIndex(MST_ACXFR_ACT_D_R.$acxfr_act_no);
			
			MCIndexKey delIdxkey = down3().createIndex(AcXfrActIF_HdrR.$data_crud_typ, AcXfrActIF_HdrR.$acxfr_act_no);
			
			MCList<AcXfrActRecvIf_Chk01_DtlR> acxfrActUpdIfL = null;
			MCList<AcXfrActRecvIf_Chk01_DtlR> acxfrActDelIfL = null;
			MCList<AcXfrActIF_DtlR> tmpAddDtlL = MCList.create(AcXfrActIF_DtlR.class);
			
			for (MCList<MST_ACXFR_ACT_D_R> acxfrActDL : _acxfrActDL.groupList(MST_ACXFR_ACT_D_R.$acxfr_act_no)) {
				
				MST_ACXFR_ACT_R acxfrActR = _acxfrActL.getFirst(idxkey, acxfrActDL.get(0).acxfr_act_no());
				
				acxfrActUpdIfL = MCList.create(AcXfrActRecvIf_Chk01_DtlR.class);
				acxfrActDelIfL = MCList.create(AcXfrActRecvIf_Chk01_DtlR.class);
				
				for (MST_ACXFR_ACT_D_R acxfrActDR : acxfrActDL) {
				
					AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR = getAcXfrActRecvIfR(acxfrActDR);
					
					if (!isNull(acxfrActRecvIfR) && !acxfrActRecvIfR.err_flg()) {
						if (isDel(acxfrActRecvIfR)) {
							if (!down3().contains(delIdxkey, MAC_DATA_CRUD_TYP.DEL.value(), acxfrActR.acxfr_act_no())) {
								acxfrActDelIfL.add(acxfrActRecvIfR);
							}
						}
						else {
							acxfrActUpdIfL.add(acxfrActRecvIfR);
						}
					}
				}
				
				int hdrSize = acxfrActUpdIfL.groupBy(getAcXfrActRecvIfHdrKey()).size();
				
				AcXfrActIF_HdrR hdrR = null;
				MCList<AcXfrActIF_DtlR> dtlL = MCList.create(AcXfrActIF_DtlR.class);
				AcXfrActIF_DtlR dtlR = null;
				
				if (hdrSize == 1) {
					
					AcXfrActRecvIf_Chk01_DtlR hdrIfR = acxfrActUpdIfL.get(0);
					
					hdrR = AcXfrActIF_HdrR.create();
					setAcXfrActHdrUpd(hdrR, hdrIfR, acxfrActR);
					
					for (AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR : acxfrActUpdIfL) {
						
						MST_ACXFR_ACT_D_R acxfrActDR = getAcXfrActD(acxfrActRecvIfR.acxfr_act_d_no());
						
						dtlR = AcXfrActIF_DtlR.create();
						setAcXfrActDtlUpd(dtlR, acxfrActRecvIfR, acxfrActDR, hdrR);
						dtlL.add(dtlR);
					}
				}
				else if (hdrSize > 1) {
					
					_acxfrActSplitInsIfL = MCList.create(AcXfrActRecvIf_Chk01_DtlR.class);
					
					boolean isFirst = false;
					for (MCList<AcXfrActRecvIf_Chk01_DtlR> subAcXfrActIfL : acxfrActUpdIfL.groupList(getAcXfrActRecvIfHdrKey())) {
						
						isFirst = false;
						
						if (isNull(hdrR)) {
							
							AcXfrActRecvIf_Chk01_DtlR hdrIfR = subAcXfrActIfL.get(0);
							
							hdrR = AcXfrActIF_HdrR.create();
							setAcXfrActHdrUpd(hdrR, hdrIfR, acxfrActR);
							
							isFirst = true;
						}
						
						for (AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR : subAcXfrActIfL) {
							
							MST_ACXFR_ACT_D_R acxfrActDR = getAcXfrActD(acxfrActRecvIfR.acxfr_act_d_no());
							
							dtlR = AcXfrActIF_DtlR.create();
							
							setAcXfrActDtlUpd(dtlR, acxfrActRecvIfR, acxfrActDR, hdrR);
							
							if (!isFirst) {
								// 削除⇒新規
								dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
								
								AcXfrActRecvIf_Chk01_DtlR splitIfR = acxfrActRecvIfR.clone();
								splitIfR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
								_acxfrActSplitInsIfL.add(splitIfR);
							}
						
							dtlL.add(dtlR);
						}
					}
				}
				
				for (AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR : acxfrActDelIfL) {
					
					if (isNull(hdrR)) {
						
						hdrR = AcXfrActIF_HdrR.create();
						
						setAcXfrActHdrNone(hdrR, acxfrActRecvIfR, acxfrActR);
					}
					
					MST_ACXFR_ACT_D_R acxfrActDR = getAcXfrActD(acxfrActRecvIfR.acxfr_act_d_no());
					
					dtlR = AcXfrActIF_DtlR.create();
					
					setAcXfrActDtlUpd(dtlR, acxfrActRecvIfR, acxfrActDR, hdrR);
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					
					dtlL.add(dtlR);
				}
				
				down2().add(hdrR);
				tmpAddDtlL.addAll(dtlL);
			}
			
			down3().addAll(tmpAddDtlL);
		}
				
		/**
		 * 他勘定振替実績登録サービスの登録前チェック用（新規）の他勘定振替実績ヘッダ情報を設定する。
		 * @param hdrR 登録前チェックヘッダ
		 * @param acxfrActRecvIfR 他勘定振替実績受信ＩＦ
		 */
		protected void setAcXfrActHdrIns(AcXfrActIF_HdrR hdrR, AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR) {
			
			copy(hdrR, acxfrActRecvIfR, createMap_AcXfrActIF_HdrR_AcXfrActRecvIf_Chk01_DtlR());
			
			hdrR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			hdrR.acxfr_act_no(null);
			
			hdrR.hdr_dtl_peg_no(_hdrPegNo);
			_hdrPegNo++;
			
			hdrR.setParamIndex(acxfrActRecvIfR.axa().getParamIndex());
			hdrR.setParamRowIndex(acxfrActRecvIfR.axa().getParamRowIndex());
		}
		
		/**
		 * 他勘定振替実績登録サービスの登録前チェック用（新規）の他勘定振替実績明細情報を設定する。
		 * @param dtlR 登録前チェック明細
		 * @param acxfrActRecvIfR 他勘定振替実績受信ＩＦ
		 * @param hdrR 登録前チェックヘッダ
		 */
		protected void setAcXfrActDtlIns(AcXfrActIF_DtlR dtlR, AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR, AcXfrActIF_HdrR hdrR) {
			
			acxfrActRecvIfR.hdr_dtl_peg_no(_hdrPegNo);
			
			copy(dtlR, acxfrActRecvIfR, createMap_AcXfrActIF_DtlR_AcXfrActRecvIf_Chk01_DtlR());
			
			dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			dtlR.acxfr_act_no(null);
			dtlR.acxfr_act_d_no(null);
			dtlR.hdr_dtl_peg_no(hdrR.hdr_dtl_peg_no());
			
			dtlR.setParamIndex(acxfrActRecvIfR.axa().getParamIndex());
			dtlR.setParamRowIndex(acxfrActRecvIfR.axa().getParamRowIndex());
		}
		
		/**
		 * 他勘定振替実績登録サービスの登録前チェック用（更新）の他勘定振替実績ヘッダ情報を設定する。
		 * @param hdrR 登録前チェックヘッダ
		 * @param acxfrActRecvIfR 他勘定振替実績受信ＩＦ
		 * @param acxfrActR　他勘定振替実績ヘッダ
		 */
		protected void setAcXfrActHdrUpd(AcXfrActIF_HdrR hdrR, AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR, MST_ACXFR_ACT_R acxfrActR) {
			
			copy(hdrR, acxfrActRecvIfR, createMap_AcXfrActIF_HdrR_AcXfrActRecvIf_Chk01_DtlR());
			
			hdrR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			
			hdrR.hdr_dtl_peg_no(_hdrPegNo);
			_hdrPegNo++;
			
			hdrR.can_ac_dt(acxfrActR.ac_dt());
			
			hdrR.setParamIndex(acxfrActRecvIfR.axa().getParamIndex());
			hdrR.setParamRowIndex(acxfrActRecvIfR.axa().getParamRowIndex());
		}
		
		/**
		 * 他勘定振替実績登録サービスの登録前チェック用（更新）の他勘定振替実績明細情報を設定する。
		 * @param dtlR 登録前チェック明細
		 * @param acxfrActRecvIfR 他勘定振替実績受信ＩＦ
		 * @param acxfrActDR　他勘定振替実績明細
		 * @param hdrR 登録前チェックヘッダ
		 */
		protected void setAcXfrActDtlUpd(AcXfrActIF_DtlR dtlR, AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR, MST_ACXFR_ACT_D_R acxfrActDR, AcXfrActIF_HdrR hdrR) {
			
			acxfrActRecvIfR.hdr_dtl_peg_no(_hdrPegNo);
			
			copy(dtlR, acxfrActRecvIfR, createMap_AcXfrActIF_DtlR_AcXfrActRecvIf_Chk01_DtlR());
			
			dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			
			dtlR.hdr_dtl_peg_no(hdrR.hdr_dtl_peg_no());
			
			dtlR.setParamIndex(acxfrActRecvIfR.axa().getParamIndex());
			dtlR.setParamRowIndex(acxfrActRecvIfR.axa().getParamRowIndex());
		}
		
		/**
		 * 他勘定振替実績登録サービスの登録前チェック用（ヘッダ変更なし）の他勘定振替実績ヘッダ情報を設定する。<br>
		 * 他勘定振替実績受信ＩＦに削除のみ設定されている場合に使用する。
		 * @param hdrR 登録前チェックヘッダ
		 * @param acxfrActRecvIfR 他勘定振替実績受信ＩＦ
		 * @param acxfrActR 他勘定振替実績ヘッダ
		 */
		protected void setAcXfrActHdrNone(AcXfrActIF_HdrR hdrR, AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR, MST_ACXFR_ACT_R acxfrActR) {
			
			copy(hdrR, acxfrActR, createMap_AcXfrActIF_HdrR_MST_ACXFR_ACT_R());
			
			hdrR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
		
			hdrR.hdr_dtl_peg_no(_hdrPegNo);
			_hdrPegNo++;
			
			hdrR.can_ac_dt(acxfrActR.ac_dt());
			
			hdrR.setParamIndex(acxfrActRecvIfR.axa().getParamIndex());
			hdrR.setParamRowIndex(acxfrActRecvIfR.axa().getParamRowIndex());
		}
		
		/**
		 * 他勘定振替実績登録サービスの登録前チェック用（明細変更なし）の他勘定振替実績ヘッダ情報を設定する。<br>
		 * ヘッダの項目が変更された場合、対応する明細項目のデフォルト値を設定する。
		 * @param dtlR 登録前チェック明細
		 * @param acxfrActDR　他勘定振替実績明細
		 * @param hdrR 登録前チェックヘッダ
		 */
		protected void setAcXfrActDtlNone(AcXfrActIF_DtlR dtlR, MST_ACXFR_ACT_D_R acxfrActDR, AcXfrActIF_HdrR hdrR) {
			
			copy(dtlR, acxfrActDR, createMap_AcXfrActIF_DtlR_MST_ACXFR_ACT_D_R());
			
			dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			
			dtlR.hdr_dtl_peg_no(hdrR.hdr_dtl_peg_no());
			
			// 紐付く他勘定振替実績受信ＩＦが存在しないため、ParamIndexとParamRowIndexを設定しない
		}
		
		/**
		 * 他勘定振替実績受信ＩＦのヘッダ項目を返す。
		 * @return ヘッダ項目
		 */
		protected String[] getAcXfrActRecvIfHdrKey() {

			return new String[] {
					
					AcXfrActRecvIf_Chk01_DtlR.$acxfr_inst_no,
					AcXfrActRecvIf_Chk01_DtlR.$trd_cd,
					AcXfrActRecvIf_Chk01_DtlR.$trd_ptn_typ,
					AcXfrActRecvIf_Chk01_DtlR.$loc_cd,
					AcXfrActRecvIf_Chk01_DtlR.$acxfr_act_tm,
					AcXfrActRecvIf_Chk01_DtlR.$act_usr_cd,
					AcXfrActRecvIf_Chk01_DtlR.$act_dpt_cd,
					AcXfrActRecvIf_Chk01_DtlR.$uplnd_flg};
		}
		
		/**
		 * 他勘定振替実績明細に紐付く他勘定振替実績受信ＩＦを取得する。
		 * @param acxfrActDR 他勘定振替実績明細
		 * @return 他勘定振替実績受信ＩＦ
		 */
		protected AcXfrActRecvIf_Chk01_DtlR getAcXfrActRecvIfR(MST_ACXFR_ACT_D_R acxfrActDR) {
			
			if (_acxfrActRecvIfIdxkey == null) {
				_acxfrActRecvIfIdxkey = up0().createIndex(
						AcXfrActRecvIf_Chk01_DtlR.$ext_sys_cd, 
						AcXfrActRecvIf_Chk01_DtlR.$ext_acxfr_act_no);
			}

			return up0().getFirst(_acxfrActRecvIfIdxkey, acxfrActDR.ext_sys_cd(), acxfrActDR.ext_acxfr_act_no());
		}
		
		/**
		 * 指定された他勘定振替実績受信ＩＦが新規かどうか。
		 * @param acxfrActRecvIfR 他勘定振替実績受信ＩＦ
		 * @return　新規の場合はtrue
		 */
		protected boolean isCrt(AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR) {
			
			return MAC_DATA_CRUD_TYP.isCRT(acxfrActRecvIfR.data_crud_typ());
		}
		
		/**
		 * 指定された他勘定振替実績受信ＩＦが更新かどうか。
		 * @param acxfrActRecvIfR 他勘定振替実績受信ＩＦ
		 * @return　新規の場合はtrue
		 */
		protected boolean isUpd(AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR) {
			
			return MAC_DATA_CRUD_TYP.isUPD(acxfrActRecvIfR.data_crud_typ());
		}
		
		/**
		 * 指定された他勘定振替実績受信ＩＦが更新かどうか。
		 * @param acxfrActRecvIfR 他勘定振替実績受信ＩＦ
		 * @return　削除の場合はtrue
		 */
		protected boolean isDel(AcXfrActRecvIf_Chk01_DtlR acxfrActRecvIfR) {
			
			return MAC_DATA_CRUD_TYP.isDEL(acxfrActRecvIfR.data_crud_typ());
		}
		
		protected Map_AcXfrActIF_HdrR_AcXfrActRecvIf_Chk01_DtlR<AcXfrActIF_HdrR,AcXfrActRecvIf_Chk01_DtlR> createMap_AcXfrActIF_HdrR_AcXfrActRecvIf_Chk01_DtlR() {
			return new Map_AcXfrActIF_HdrR_AcXfrActRecvIf_Chk01_DtlR<AcXfrActIF_HdrR, AcXfrActRecvIf_Chk01_DtlR>();
		}

		public class Map_AcXfrActIF_HdrR_AcXfrActRecvIf_Chk01_DtlR<D extends AcXfrActIF_HdrR, S extends AcXfrActRecvIf_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(AcXfrActIF_HdrR.$data_crud_typ, AcXfrActRecvIf_Chk01_DtlR.$data_crud_typ);
				addColumnPathMap(AcXfrActIF_HdrR.$hdr_dtl_peg_no, AcXfrActRecvIf_Chk01_DtlR.$hdr_dtl_peg_no);
				addColumnPathMap(AcXfrActIF_HdrR.$acxfr_act_no, AcXfrActRecvIf_Chk01_DtlR.$acxfr_act_no);
				addColumnPathMap(AcXfrActIF_HdrR.$trd_cd, AcXfrActRecvIf_Chk01_DtlR.$trd_cd);
				addColumnPathMap(AcXfrActIF_HdrR.$trd_ptn_typ, AcXfrActRecvIf_Chk01_DtlR.$trd_ptn_typ);
				addColumnPathMap(AcXfrActIF_HdrR.$loc_cd, AcXfrActRecvIf_Chk01_DtlR.$loc_cd);
				addColumnPathMap(AcXfrActIF_HdrR.$acxfr_inst_no, AcXfrActRecvIf_Chk01_DtlR.$acxfr_inst_no);
				addColumnPathMap(AcXfrActIF_HdrR.$acxfr_act_tm, AcXfrActRecvIf_Chk01_DtlR.$acxfr_act_tm);
				addColumnPathMap(AcXfrActIF_HdrR.$act_usr_cd, AcXfrActRecvIf_Chk01_DtlR.$act_usr_cd);
				addColumnPathMap(AcXfrActIF_HdrR.$act_dpt_cd, AcXfrActRecvIf_Chk01_DtlR.$act_dpt_cd);
				addColumnPathMap(AcXfrActIF_HdrR.$err_flg, AcXfrActRecvIf_Chk01_DtlR.$err_flg);
				addColumnPathMap(AcXfrActIF_HdrR.$peg_no, AcXfrActRecvIf_Chk01_DtlR.$peg_no);

			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.ac_dt(MAUCL_DateUtil.getAcDt(src.acxfr_act_tm()));
				
				if (isCrt(src)) {
					
					dest.intr_rmrks_upd_flg(true);
					dest.trd_rmrks_upd_flg(false);
					dest.sub_char1_upd_flg(true);
					dest.sub_char2_upd_flg(true);
					dest.sub_char3_upd_flg(true);
				}
				else {
					dest.trd_rmrks_upd_flg(false);
					dest.intr_rmrks_upd_flg(false);
					dest.sub_char1_upd_flg(false);
					dest.sub_char2_upd_flg(false);
					dest.sub_char3_upd_flg(false);
				}
			}
		}
		
		protected Map_AcXfrActIF_DtlR_AcXfrActRecvIf_Chk01_DtlR<AcXfrActIF_DtlR,AcXfrActRecvIf_Chk01_DtlR> createMap_AcXfrActIF_DtlR_AcXfrActRecvIf_Chk01_DtlR() {
			return new Map_AcXfrActIF_DtlR_AcXfrActRecvIf_Chk01_DtlR<AcXfrActIF_DtlR, AcXfrActRecvIf_Chk01_DtlR>();
		}

		public class Map_AcXfrActIF_DtlR_AcXfrActRecvIf_Chk01_DtlR<D extends AcXfrActIF_DtlR, S extends AcXfrActRecvIf_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(AcXfrActIF_DtlR.$data_crud_typ, AcXfrActRecvIf_Chk01_DtlR.$data_crud_typ);
				addColumnPathMap(AcXfrActIF_DtlR.$hdr_dtl_peg_no, AcXfrActRecvIf_Chk01_DtlR.$hdr_dtl_peg_no);
				addColumnPathMap(AcXfrActIF_DtlR.$peg_no, AcXfrActRecvIf_Chk01_DtlR.$peg_no);
				addColumnPathMap(AcXfrActIF_DtlR.$abort_flg, AcXfrActRecvIf_Chk01_DtlR.$abort_flg);
				addColumnPathMap(AcXfrActIF_DtlR.$itm_cd, AcXfrActRecvIf_Chk01_DtlR.$itm_cd);
				addColumnPathMap(AcXfrActIF_DtlR.$itm_sub1, AcXfrActRecvIf_Chk01_DtlR.$itm_sub1);
				addColumnPathMap(AcXfrActIF_DtlR.$itm_sub2, AcXfrActRecvIf_Chk01_DtlR.$itm_sub2);
				addColumnPathMap(AcXfrActIF_DtlR.$itm_sub3, AcXfrActRecvIf_Chk01_DtlR.$itm_sub3);
				addColumnPathMap(AcXfrActIF_DtlR.$itm_nm, AcXfrActRecvIf_Chk01_DtlR.$itm_nm);
				addColumnPathMap(AcXfrActIF_DtlR.$crt_lot_flg, AcXfrActRecvIf_Chk01_DtlR.$crt_lot_flg);
				addColumnPathMap(AcXfrActIF_DtlR.$lot_no, AcXfrActRecvIf_Chk01_DtlR.$lot_no);
				addColumnPathMap(AcXfrActIF_DtlR.$sublot_no, AcXfrActRecvIf_Chk01_DtlR.$sublot_no);
				addColumnPathMap(AcXfrActIF_DtlR.$ver_no, AcXfrActRecvIf_Chk01_DtlR.$ver_no);
				addColumnPathMap(AcXfrActIF_DtlR.$trd_unit_cd, AcXfrActRecvIf_Chk01_DtlR.$trd_unit_cd);
				addColumnPathMap(AcXfrActIF_DtlR.$trd_unit_qty, AcXfrActRecvIf_Chk01_DtlR.$trd_unit_qty);
				addColumnPathMap(AcXfrActIF_DtlR.$str_ln_cd, AcXfrActRecvIf_Chk01_DtlR.$str_ln_cd);
				addColumnPathMap(AcXfrActIF_DtlR.$bd_dpt_cd, AcXfrActRecvIf_Chk01_DtlR.$bd_dpt_cd);
				addColumnPathMap(AcXfrActIF_DtlR.$stk_arrv_bp_cd, AcXfrActRecvIf_Chk01_DtlR.$stk_arrv_bp_cd);
				addColumnPathMap(AcXfrActIF_DtlR.$quality_typ, AcXfrActRecvIf_Chk01_DtlR.$quality_typ);
				addColumnPathMap(AcXfrActIF_DtlR.$stk_id_typ, AcXfrActRecvIf_Chk01_DtlR.$stk_id_typ);
				addColumnPathMap(AcXfrActIF_DtlR.$gd_cd, AcXfrActRecvIf_Chk01_DtlR.$gd_cd);
				addColumnPathMap(AcXfrActIF_DtlR.$stk_bp_cd, AcXfrActRecvIf_Chk01_DtlR.$stk_bp_cd);
				addColumnPathMap(AcXfrActIF_DtlR.$sno1, AcXfrActRecvIf_Chk01_DtlR.$sno1);
				addColumnPathMap(AcXfrActIF_DtlR.$sno2, AcXfrActRecvIf_Chk01_DtlR.$sno2);
				addColumnPathMap(AcXfrActIF_DtlR.$sno3, AcXfrActRecvIf_Chk01_DtlR.$sno3);
				addColumnPathMap(AcXfrActIF_DtlR.$sno4, AcXfrActRecvIf_Chk01_DtlR.$sno4);
				addColumnPathMap(AcXfrActIF_DtlR.$fix_no_typ, AcXfrActRecvIf_Chk01_DtlR.$fix_no_typ);
				addColumnPathMap(AcXfrActIF_DtlR.$fix_no, AcXfrActRecvIf_Chk01_DtlR.$fix_no);
				addColumnPathMap(AcXfrActIF_DtlR.$bd_loc_cd, AcXfrActRecvIf_Chk01_DtlR.$bd_loc_cd);
				addColumnPathMap(AcXfrActIF_DtlR.$bd_ctg_cd, AcXfrActRecvIf_Chk01_DtlR.$bd_ctg_cd);
				addColumnPathMap(AcXfrActIF_DtlR.$bd_oper_cd, AcXfrActRecvIf_Chk01_DtlR.$bd_oper_cd);
				addColumnPathMap(AcXfrActIF_DtlR.$bd_bp_cd, AcXfrActRecvIf_Chk01_DtlR.$bd_bp_cd);
				addColumnPathMap(AcXfrActIF_DtlR.$bd_itm_cd, AcXfrActRecvIf_Chk01_DtlR.$bd_itm_cd);
				addColumnPathMap(AcXfrActIF_DtlR.$bd_itm_sub1, AcXfrActRecvIf_Chk01_DtlR.$bd_itm_sub1);
				addColumnPathMap(AcXfrActIF_DtlR.$bd_itm_sub2, AcXfrActRecvIf_Chk01_DtlR.$bd_itm_sub2);
				addColumnPathMap(AcXfrActIF_DtlR.$bd_itm_sub3, AcXfrActRecvIf_Chk01_DtlR.$bd_itm_sub3);
				addColumnPathMap(AcXfrActIF_DtlR.$bd_lot_no, AcXfrActRecvIf_Chk01_DtlR.$bd_lot_no);
				addColumnPathMap(AcXfrActIF_DtlR.$bd_sublot_no, AcXfrActRecvIf_Chk01_DtlR.$bd_sublot_no);
				addColumnPathMap(AcXfrActIF_DtlR.$bd_sno1, AcXfrActRecvIf_Chk01_DtlR.$bd_sno1);
				addColumnPathMap(AcXfrActIF_DtlR.$bd_sno2, AcXfrActRecvIf_Chk01_DtlR.$bd_sno2);
				addColumnPathMap(AcXfrActIF_DtlR.$bd_sno3, AcXfrActRecvIf_Chk01_DtlR.$bd_sno3);
				addColumnPathMap(AcXfrActIF_DtlR.$bd_sno4, AcXfrActRecvIf_Chk01_DtlR.$bd_sno4);
				addColumnPathMap(AcXfrActIF_DtlR.$intr_d_rmrks, AcXfrActRecvIf_Chk01_DtlR.$intr_d_rmrks);
				addColumnPathMap(AcXfrActIF_DtlR.$trd_d_rmrks, AcXfrActRecvIf_Chk01_DtlR.$trd_d_rmrks);
				addColumnPathMap(AcXfrActIF_DtlR.$acxfr_inst_d_no, AcXfrActRecvIf_Chk01_DtlR.$acxfr_inst_d_no);
				addColumnPathMap(AcXfrActIF_DtlR.$acxfr_act_d_no, AcXfrActRecvIf_Chk01_DtlR.$acxfr_act_d_no);
				addColumnPathMap(AcXfrActIF_DtlR.$rsn_cd, AcXfrActRecvIf_Chk01_DtlR.$rsn_cd);
				addColumnPathMap(AcXfrActIF_DtlR.$ext_sys_cd, AcXfrActRecvIf_Chk01_DtlR.$ext_sys_cd);
				addColumnPathMap(AcXfrActIF_DtlR.$ext_acxfr_act_no, AcXfrActRecvIf_Chk01_DtlR.$ext_acxfr_act_no);

			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.wms_flg(true);
				
				if (isCrt(src)) {
					dest.sub_char1_upd_flg(true);
					dest.sub_char2_upd_flg(true);
					dest.sub_char3_upd_flg(true);
				}
				else {
					dest.sub_char1_upd_flg(false);
					dest.sub_char2_upd_flg(false);
					dest.sub_char3_upd_flg(false);
				}
				dest.intr_d_rmrks_upd_flg(true);
				dest.trd_d_rmrks_upd_flg(true);
			}
		}
		
		protected Map_AcXfrActIF_HdrR_MST_ACXFR_ACT_R<AcXfrActIF_HdrR,MST_ACXFR_ACT_R> createMap_AcXfrActIF_HdrR_MST_ACXFR_ACT_R() {
			return new Map_AcXfrActIF_HdrR_MST_ACXFR_ACT_R<AcXfrActIF_HdrR, MST_ACXFR_ACT_R>();
		}

		public class Map_AcXfrActIF_HdrR_MST_ACXFR_ACT_R<D extends AcXfrActIF_HdrR, S extends MST_ACXFR_ACT_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(AcXfrActIF_HdrR.$acxfr_act_no, MST_ACXFR_ACT_R.$acxfr_act_no);
				addColumnPathMap(AcXfrActIF_HdrR.$trd_cd, MST_ACXFR_ACT_R.$trd_cd);
				addColumnPathMap(AcXfrActIF_HdrR.$trd_ptn_typ, MST_ACXFR_ACT_R.$trd_ptn_typ);
				addColumnPathMap(AcXfrActIF_HdrR.$loc_cd, MST_ACXFR_ACT_R.$loc_cd);
				addColumnPathMap(AcXfrActIF_HdrR.$acxfr_inst_no, MST_ACXFR_ACT_R.$acxfr_inst_no);
				addColumnPathMap(AcXfrActIF_HdrR.$acxfr_act_tm, MST_ACXFR_ACT_R.$acxfr_act_tm);
				addColumnPathMap(AcXfrActIF_HdrR.$ac_dt, MST_ACXFR_ACT_R.$ac_dt);
				addColumnPathMap(AcXfrActIF_HdrR.$act_usr_cd, MST_ACXFR_ACT_R.$act_usr_cd);
				addColumnPathMap(AcXfrActIF_HdrR.$act_dpt_cd, MST_ACXFR_ACT_R.$act_dpt_cd);

			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				dest.intr_rmrks_upd_flg(false);
				dest.trd_rmrks_upd_flg(false);
				dest.sub_char1_upd_flg(false);
				dest.sub_char2_upd_flg(false);
				dest.sub_char3_upd_flg(false);
			}
		}
		
		protected Map_AcXfrActIF_DtlR_MST_ACXFR_ACT_D_R<AcXfrActIF_DtlR,MST_ACXFR_ACT_D_R> createMap_AcXfrActIF_DtlR_MST_ACXFR_ACT_D_R() {
			return new Map_AcXfrActIF_DtlR_MST_ACXFR_ACT_D_R<AcXfrActIF_DtlR, MST_ACXFR_ACT_D_R>();
		}

		public class Map_AcXfrActIF_DtlR_MST_ACXFR_ACT_D_R<D extends AcXfrActIF_DtlR, S extends MST_ACXFR_ACT_D_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(AcXfrActIF_DtlR.$itm_cd, MST_ACXFR_ACT_D_R.$itm_cd);
				addColumnPathMap(AcXfrActIF_DtlR.$itm_sub1, MST_ACXFR_ACT_D_R.$itm_sub1);
				addColumnPathMap(AcXfrActIF_DtlR.$itm_sub2, MST_ACXFR_ACT_D_R.$itm_sub2);
				addColumnPathMap(AcXfrActIF_DtlR.$itm_sub3, MST_ACXFR_ACT_D_R.$itm_sub3);
				addColumnPathMap(AcXfrActIF_DtlR.$lot_no, MST_ACXFR_ACT_D_R.$lot_no);
				addColumnPathMap(AcXfrActIF_DtlR.$sublot_no, MST_ACXFR_ACT_D_R.$sublot_no);
				addColumnPathMap(AcXfrActIF_DtlR.$trd_unit_cd, MST_ACXFR_ACT_D_R.$trd_unit_cd);
				addColumnPathMap(AcXfrActIF_DtlR.$trd_unit_qty, MST_ACXFR_ACT_D_R.$trd_unit_qty);
				addColumnPathMap(AcXfrActIF_DtlR.$str_ln_cd, MST_ACXFR_ACT_D_R.$str_ln_cd);
				addColumnPathMap(AcXfrActIF_DtlR.$bd_dpt_cd, MST_ACXFR_ACT_D_R.$bd_dpt_cd);
				addColumnPathMap(AcXfrActIF_DtlR.$stk_arrv_bp_cd, MST_ACXFR_ACT_D_R.$stk_arrv_bp_cd);
				addColumnPathMap(AcXfrActIF_DtlR.$quality_typ, MST_ACXFR_ACT_D_R.$quality_typ);
				addColumnPathMap(AcXfrActIF_DtlR.$stk_id_typ, MST_ACXFR_ACT_D_R.$stk_id_typ);
				addColumnPathMap(AcXfrActIF_DtlR.$gd_cd, MST_ACXFR_ACT_D_R.$gd_cd);
				addColumnPathMap(AcXfrActIF_DtlR.$stk_bp_cd, MST_ACXFR_ACT_D_R.$stk_bp_cd);
				addColumnPathMap(AcXfrActIF_DtlR.$sno1, MST_ACXFR_ACT_D_R.$sno1);
				addColumnPathMap(AcXfrActIF_DtlR.$sno2, MST_ACXFR_ACT_D_R.$sno2);
				addColumnPathMap(AcXfrActIF_DtlR.$sno3, MST_ACXFR_ACT_D_R.$sno3);
				addColumnPathMap(AcXfrActIF_DtlR.$sno4, MST_ACXFR_ACT_D_R.$sno4);
				addColumnPathMap(AcXfrActIF_DtlR.$fix_no_typ, MST_ACXFR_ACT_D_R.$fix_no_typ);
				addColumnPathMap(AcXfrActIF_DtlR.$fix_no, MST_ACXFR_ACT_D_R.$fix_no);
				addColumnPathMap(AcXfrActIF_DtlR.$bd_loc_cd, MST_ACXFR_ACT_D_R.$bd_loc_cd);
				addColumnPathMap(AcXfrActIF_DtlR.$bd_ctg_cd, MST_ACXFR_ACT_D_R.$bd_ctg_cd);
				addColumnPathMap(AcXfrActIF_DtlR.$bd_oper_cd, MST_ACXFR_ACT_D_R.$bd_oper_cd);
				addColumnPathMap(AcXfrActIF_DtlR.$bd_bp_cd, MST_ACXFR_ACT_D_R.$bd_bp_cd);
				addColumnPathMap(AcXfrActIF_DtlR.$bd_itm_cd, MST_ACXFR_ACT_D_R.$bd_itm_cd);
				addColumnPathMap(AcXfrActIF_DtlR.$bd_itm_sub1, MST_ACXFR_ACT_D_R.$bd_itm_sub1);
				addColumnPathMap(AcXfrActIF_DtlR.$bd_itm_sub2, MST_ACXFR_ACT_D_R.$bd_itm_sub2);
				addColumnPathMap(AcXfrActIF_DtlR.$bd_itm_sub3, MST_ACXFR_ACT_D_R.$bd_itm_sub3);
				addColumnPathMap(AcXfrActIF_DtlR.$bd_lot_no, MST_ACXFR_ACT_D_R.$bd_lot_no);
				addColumnPathMap(AcXfrActIF_DtlR.$bd_sublot_no, MST_ACXFR_ACT_D_R.$bd_sublot_no);
				addColumnPathMap(AcXfrActIF_DtlR.$bd_sno1, MST_ACXFR_ACT_D_R.$bd_sno1);
				addColumnPathMap(AcXfrActIF_DtlR.$bd_sno2, MST_ACXFR_ACT_D_R.$bd_sno2);
				addColumnPathMap(AcXfrActIF_DtlR.$bd_sno3, MST_ACXFR_ACT_D_R.$bd_sno3);
				addColumnPathMap(AcXfrActIF_DtlR.$bd_sno4, MST_ACXFR_ACT_D_R.$bd_sno4);
				addColumnPathMap(AcXfrActIF_DtlR.$intr_d_rmrks, MST_ACXFR_ACT_D_R.$intr_d_rmrks);
				addColumnPathMap(AcXfrActIF_DtlR.$trd_d_rmrks, MST_ACXFR_ACT_D_R.$trd_d_rmrks);
				addColumnPathMap(AcXfrActIF_DtlR.$rsn_cd, MST_ACXFR_ACT_D_R.$rsn_cd);
				addColumnPathMap(AcXfrActIF_DtlR.$wms_flg, MST_ACXFR_ACT_D_R.$wms_flg);
				addColumnPathMap(AcXfrActIF_DtlR.$ext_sys_cd, MST_ACXFR_ACT_D_R.$ext_sys_cd);
				addColumnPathMap(AcXfrActIF_DtlR.$ext_acxfr_act_no, MST_ACXFR_ACT_D_R.$ext_acxfr_act_no);
				addColumnPathMap(AcXfrActIF_DtlR.$acxfr_act_d_no, MST_ACXFR_ACT_D_R.$acxfr_act_d_no);
				
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.itm_nm(src.getStringNE(MAM_ITM_R.$itm_nm));
				dest.acxfr_inst_d_no(src.getStringNE(MST_ACXFR_INST_D_R.$acxfr_inst_d_no));
				dest.abort_flg(src.getBooleanNE(MST_ACXFR_SCHD_R.$abort_flg));
				dest.intr_d_rmrks_upd_flg(false);
				dest.trd_d_rmrks_upd_flg(false);
				dest.sub_char1_upd_flg(false);
				dest.sub_char2_upd_flg(false);
				dest.sub_char3_upd_flg(false);
			}
		}
	}
	
	/**
	 * 処理結果区分にエラーを設定
	 * @param acxfrActRecvIfR 他勘定振替実績受信ＩＦ
	 */
	protected void setErrSts(MST_ACXFR_ACT_RECV_IF_R acxfrActRecvIfR) {

		acxfrActRecvIfR.exe_sts_typ(MAC_EXE_STS_TYP.ERR.value());
		setErrSet(acxfrActRecvIfR);
	}
	
	/**
	 * 同一取込グループでエラーが発生した場合に、エラーリスト設定に追加する。
	 * @param acxfrActRecvIfR 他勘定振替実績受信ＩＦ
	 */
	protected void setErrSet(MST_ACXFR_ACT_RECV_IF_R acxfrActRecvIfR) {
		
		List<String> lst = createErrSetKey(acxfrActRecvIfR);
		if (!object(CLAZZ)._errSet.contains(lst)) {
			object(CLAZZ)._errSet.add(lst);
		}

		if (!object(CLAZZ)._stopErrSet.contains(acxfrActRecvIfR.ext_sys_cd())) {
			object(CLAZZ)._stopErrSet.add(acxfrActRecvIfR.ext_sys_cd());
		}
	}
	
	/**
	 * 同一取込単位で先に処理したデータでエラーが発生したかどうか。
	 * @param acxfrActRecvIfR 他勘定振替実績受信ＩＦ
	 * @return エラーが発生した場合はtrue
	 */
	protected boolean isPrevErr(MST_ACXFR_ACT_RECV_IF_R acxfrActRecvIfR) {
		
		return object(CLAZZ)._errSet.contains(createErrSetKey(acxfrActRecvIfR));
	}
	
	/**
	 * 同一取込グループのキー項目のリストを作成する。
	 * @param acxfrActRecvIfR 他勘定振替実績受信ＩＦ
	 * @return エラーキー項目のリスト
	 */
	protected List<String> createErrSetKey(MST_ACXFR_ACT_RECV_IF_R acxfrActRecvIfR) {
		
		List<String> lst = new ArrayList<String>();
		if (!isNull(acxfrActRecvIfR)) {
			lst.add(acxfrActRecvIfR.ext_sys_cd());
			lst.add(acxfrActRecvIfR.ext_acxfr_act_no());
		}
		return lst;
	}
	
	/**
	 * 成功スッキプのキー項目のリストを作成する。
	 * @param acxfrActRecvIfR 他勘定振替実績受信ＩＦ
	 * @return エラーキー項目のリスト
	 */
	protected List<String> createOKSkipSetKey(MST_ACXFR_ACT_RECV_IF_R acxfrActRecvIfR) {
		
		List<String> lst = new ArrayList<String>();
		if (!isNull(acxfrActRecvIfR)) {
			lst.add(acxfrActRecvIfR.ext_sys_cd());
			lst.add(acxfrActRecvIfR.ext_acxfr_act_no());
		}
		return lst;
	}

	//FMCB CUSTOM END
}