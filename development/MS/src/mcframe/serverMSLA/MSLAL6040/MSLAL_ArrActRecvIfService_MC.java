package mcframe.serverMSLA.MSLAL6040;

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
import mcframe.serverMSLA.MSLAL6040.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL6000.*;	// このimportはFrameManagerの自動生成で追加されました。

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
import mcframe.serverMSBE.MSBEL6000.MSBEL_ArrActRcptIFService;
import static mcframe.serverMSLA.MSLAL6040.Query.*;
import mcframe.serverMSLA.MSLAL6320.MSLAL_SCMActRecvIfService;
import mcframe.serverPF.dbc.*;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogger;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0170.FXUCL_AtLeastOneValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverCore.mcjdbc.MCSavepoint;
import mcframe.serverCore.requester.MCServerThreadManager;
import mcframe.serverCore.resource.MCConst;
import mcframe.serverCore.sys.MCSys;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.commonCore.sys.MCFactory;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_ArrActRecvIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_ArrActRecvIfService_MC extends MSLAL_ArrActRecvIfService_MC_A{
	//FMCB CUSTOM START

	/**
	 * エラーになったキーの組み合わせを保持する(Upd03, Upd04で共有)
	 */
	protected Set<List<String>> _errSet = new HashSet<List<String>>();
	/**
	 * エラーになった外部システムCDを保持する(Upd03, Upd04で共有)
	 */
	protected Set<String> _stopErrSet = new HashSet<String>();

	/**
	 * キャッシュを管理するリクエストオブジェクト
	 */
	protected static final Class<MSLAL_ArrActRecvIfService> CLAZZ = MSLAL_ArrActRecvIfService.class;

	/**
	 * ArrActRecvIf_Upd01オペレーション.<p>
	 *
	 * 入荷実績受信ＩＦ取込を行う。（ＥＳＢのリアルタイム取込から呼び出される）<br>
	 */
	public class ArrActRecvIf_Upd01 extends MSLAL_ArrActRecvIfService_MC_A.ArrActRecvIf_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			callArrActRecvIfUpd02();
		}

		/**
		 * ArrActRecvIf_Upd02を実行する。
		 */
		protected void callArrActRecvIfUpd02() {
			MSLAL_ArrActRecvIfService.ArrActRecvIf_Upd02 ope = getOpe();
			setAll(ope.up0(), up0(), createMap_IfDataImp_Upd01_DtlR_Upd01_DtlR());
			ope.exec();
		}
		
		/**
		 * 呼び出し先のオペレーションを返す。<BR>
		 * 本クラスのサブクラスで呼び出し先オペレーションを切り替える場合にオーバーライドする。
		 */
		protected MSLAL_ArrActRecvIfService.ArrActRecvIf_Upd02 getOpe(){
			return MSLAL_ArrActRecvIfService.crtArrActRecvIf_Upd02();
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
	 * ArrActRecvIf_Upd02オペレーション.<p>
	 *
	 * 入荷実績受信ＩＦ取込を行う。（ＩＦデータ確認、および入荷実績ＩＦ取込バッチから呼び出される）<br>
	 */
	public class ArrActRecvIf_Upd02 extends MSLAL_ArrActRecvIfService_MC_A.ArrActRecvIf_Upd02 {

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

		/** 入荷実績受信ＩＦ **/
		protected MCList<MSVT_ARR_ACT_RECV_IF_R> _recvIfL = null;
		protected MSVT_ARR_ACT_RECV_IF_R _recvIfL_t = null;
		protected MCQueryApiBuilder recvIfL_bldr = null;
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
			logger().writeStartLog(getStartLogMsg());
			pushStartLog(logger());
		}

		protected String getStartLogMsg(){
			return MSLAL0048;
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

			logger().writeEndLog(getEndLogMsg(), _totalNum, _okNum, _errNum, _skipNum);
			pushEndLog(logger());
			// Loggerを新規作成した場合（呼出元からLoggerを引き継がない場合）のみクローズ
			if (_crtNewLogger) {
				logger().close();
			}
		}
		
		protected String getEndLogMsg(){
			return MSLAL0049;
		}

		/**
		 * 入荷実績受信ＩＦデータを取得する。
		 */
		protected void preSrch() {
			
			_recvIfL = MCList.create(MSVT_ARR_ACT_RECV_IF_R.class);
			_recvIfL_t = MSVT_ARR_ACT_RECV_IF_R.create("T");
			recvIfL_bldr = MCQueryApiBuilder.create(_recvIfL_t);
			_recvIfL.addStringColumn("arr_pr_no");
			
			setBldr(recvIfL_bldr);

			if (!up0().isEmpty()) {
				recvIfL_bldr.addWhereWithCutOffAnd(_recvIfL_t.data_lno.eq(bind("data_lno")));
				recvIfL_bldr.addWhereWithCutOffAnd(_recvIfL_t.data_no.eq(bind("data_no")));
				recvIfL_bldr.addWhereWithCutOffAnd(_recvIfL_t.ext_data_no.eq(bind("ext_data_no")));
				recvIfL_bldr.addWhereWithCutOffAnd(_recvIfL_t.ext_sys_cd.eq(bind("ext_sys_cd")));
				addWhereToBldr(_recvIfL_t, recvIfL_bldr);
				dbSelect("MSLAL6040_MSVT_ARR_ACT_RECV_IF_S01", _recvIfL, recvIfL_bldr, up0(), null);
			}
			else {
				addWhereToBldr(_recvIfL_t, recvIfL_bldr);
				dbSelect("MSLAL6040_MSVT_ARR_ACT_RECV_IF_S02", _recvIfL, recvIfL_bldr);
			}

			if (up1().src_actlumprecv_flg()
				&& !up1().exe_unit_lump_flg()
				&& !_recvIfL.isEmpty()) {

				// 実績一括受信バッチから処理単位区分「まとめない」で実行されてきた場合のみ
				// 同一外部システムデータNOのレコードをまとめて処理する
				MCList<MSVT_ARR_ACT_RECV_IF_R> dbc = _recvIfL.createInstance();
				MSVT_ARR_ACT_RECV_IF_R t = MSVT_ARR_ACT_RECV_IF_R.create("T");
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
				
				setBldr(dbc_bldr);

				dbc_bldr.setWhere(t.ext_data_no.eq(bind("ext_data_no")));
				dbc_bldr.addWhereWithAnd(t.ext_sys_cd.eq(bind("ext_sys_cd")));
				
				addWhereToBldr(t, dbc_bldr);
				
				dbSelect("MSLAL6040_MSVT_ARR_ACT_RECV_IF_S03", dbc, dbc_bldr,
						_recvIfL.groupBy(MSVT_ARR_ACT_RECV_IF_R.$ext_data_no,
								MSVT_ARR_ACT_RECV_IF_R.$ext_sys_cd),
						null);

				if (!dbc.isEmpty()) {
					_recvIfL.merge(dbc, dbc_bldr.getBaseDbc().getKeyColumn());
				}
			}

			// 入荷予定NO、または各種明細NOから各種ヘッダNOを取得
			String[] addCols = {"rcpt_iv_mng_no", "sls_ret_schd_no", "iv_no", "dlv_slip_no"};
			for (String s : addCols) {
				_recvIfL.addStringColumn(s);
			}

			String[] cols = {"rcpt_iv_mng_no", "po_no", "sls_ret_schd_no", "iv_no", "dlv_slip_no"};
			MCList<ArrActRecvIf_Chk01_DtlR> l = getArrSchdList(_recvIfL);
			l.sort(cols);
			MCIndexKey idx = l.createIndex("arr_pr_no");

			for (MSVT_ARR_ACT_RECV_IF_R recvIfR : _recvIfL) {
				ArrActRecvIf_Chk01_DtlR r = l.getFirst(idx, recvIfR.getString("arr_pr_no"));
				if (!isNull(r)) {
					for (String s : cols) {
						if (!isNull(r.getStringNE(s))) {
							// cols に追加した順を優先にいずれかのNOにだけ値を設定する
							// 設定した値は取込単位のキーとして使用する
							recvIfR.setStringNE(s, r.getStringNE(s));
							break;
						}
					}
				}
			}
		}

		private void setBldr(MCQueryApiBuilder builder) {
			
			PFT_SDRV_IF_R t2 = PFT_SDRV_IF_R.create("T2");
			MST_ARR_SCHD_R t3 = MST_ARR_SCHD_R.create("T3");
			MST_ARR_PR_R t4 = MST_ARR_PR_R.create("T4");
			MST_RCPT_IV_D_R t5 = MST_RCPT_IV_D_R.create("T5");
			MST_PURC_SCHD_R t6 = MST_PURC_SCHD_R.create("T6");
			
			builder.addSelect(coalesce( t6.arr_pr_no, t3.arr_pr_no, t4.arr_pr_no).as("arr_pr_no"));
			builder.addLeftOuterJoin(t2, bracket( t2.data_no.eq(_recvIfL_t.data_no)));
			builder.addLeftOuterJoin(t3,
					bracket(t3.arr_schd_no.eq(_recvIfL_t.arr_schd_no)
							.or(t3.prms_rcpt_d_no.eq(_recvIfL_t.prms_rcpt_d_no))
							.or(t3.dlv_inst_d_no.eq(_recvIfL_t.dlv_inst_d_no))));
			builder.addLeftOuterJoin(t4,
					bracket(t4.po_d_no.eq(_recvIfL_t.po_d_no)
							.or(t4.sls_ret_schd_d_no.eq(_recvIfL_t.sls_ret_schd_d_no))
							.or(t4.dlv_slip_d_no.eq(_recvIfL_t.dlv_slip_d_no))
							.or(t4.iv_d_no.eq(_recvIfL_t.iv_d_no))));
			builder.addLeftOuterJoin(t5, bracket( t5.rcpt_iv_d_no.eq(_recvIfL_t.rcpt_iv_d_no)));
			builder.addLeftOuterJoin(t6, bracket( t6.purc_schd_no.eq(t5.purc_schd_no)));
		}

		private void addWhereToBldr(MSVT_ARR_ACT_RECV_IF_R t, MCQueryApiBuilder builder) {
			
			PFT_SDRV_IF_R t2 = PFT_SDRV_IF_R.create("T2");
			MAM_SCM_IF_CTL_R S1X = MAM_SCM_IF_CTL_R.create("X");
			
			builder.addConstWhereWithAnd(bracket(t2.sdrv_sts_typ.isNull()
					.or(t2.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.RECV_CONV_OK.value()))))
							.and(t.imp_flg.eq(value(true)))
							.and(t.if_proc_typ.eq(value(getIfProcTyp().value())))
							.and(exists(subQuery().select(value("X")).from(S1X)
									.where(bracket(S1X.loc_cd.eq(t.arr_loc_cd)
											.or(S1X.loc_cd.isNull()))
													.and(S1X.lg_grp_cd.eq(t.arr_lg_grp_cd)
															.or(S1X.lg_grp_cd.isNull()))
													.and(S1X.if_proc_typ
															.eq(t.if_proc_typ))
													.and(S1X.st_dt.lte(t.recv_dt))
													.and(S1X.end_dt.gte(t.recv_dt))))));
		}

		/**
		 * 入荷実績受信ＩＦ処理のメイン処理
		 */
		protected void exe() {

			callArrActRecvIfUpd03();
		}

		protected MSLAL_ArrActRecvIfService.ArrActRecvIf_Upd03 getOpe() {
			return MSLAL_ArrActRecvIfService.crtArrActRecvIf_Upd03();
		}
		
		/**
		 * スレッドを分割し、各スレッドごとにArrActRecvIf_Upd03を実行する。
		 */
		protected void callArrActRecvIfUpd03() {

			// 呼出元のサービス実行番号を取得
			int no = object(MSLAL_SCMActRecvIfService.class)._execNo;

			MSLAL_ArrActRecvIfService.ArrActRecvIf_Upd03 upd03 = null;

			List<MSLAL_ArrActRecvIfService.ArrActRecvIf_Upd03> opeL = new ArrayList<>();
			if (MCServerThreadManager.getLimitThreadSize() <= 1
				|| up1().src_actlumprecv_flg() && !MAC_IF_UPD_TYP.isSKIP_ERROR(up1().if_upd_typ())) {
				// 実績一括受信バッチではIF更新区分が「エラーを無視して登録」の場合のみ、マルチスレッド実行を許可する
				// （「エラーを無視して登録」以外の場合だと取込順を担保する必要があるが、マルチスレッドだとそれができないので）
				sort();

				upd03 = getOpe();
				upd03._no = no;
				setAll(upd03.up0(), _recvIfL, createMap_ArrActRecvIf_Upd03_DtlR_MSVT_ARR_ACT_RECV_IF_R());
				upd03.up1().if_upd_typ(up1().if_upd_typ());
				upd03.up1().src_actlumprecv_flg(up1().src_actlumprecv_flg());
				opeL.add(upd03);

				MCServerThreadManager.setUseMainDBTran(true);
				MCServerThreadManager.invokeAndWait(1, opeL, FXBAL_BatchLogManager.class, MSLAL_SCMActRecvIfService.class);
			}
			else {
				// 入荷物流グループごとにスレッドを分割
				for (MCList<MSVT_ARR_ACT_RECV_IF_R> grpL : _recvIfL.groupList(MSVT_ARR_ACT_RECV_IF_R.$arr_lg_grp_cd)) {
	
					upd03 = getOpe();
					upd03._no = no++;
					setAll(upd03.up0(), grpL, createMap_ArrActRecvIf_Upd03_DtlR_MSVT_ARR_ACT_RECV_IF_R());
					upd03.up1().if_upd_typ(up1().if_upd_typ());
					upd03.up1().src_actlumprecv_flg(up1().src_actlumprecv_flg());
	
					opeL.add(upd03);
				}

				// 件数の多いスレッドを優先に実行する。
				Collections.sort(opeL, new Comparator<MSLAL_ArrActRecvIfService.ArrActRecvIf_Upd03>() {
					public int compare(MSLAL_ArrActRecvIfService.ArrActRecvIf_Upd03 o1, MSLAL_ArrActRecvIfService.ArrActRecvIf_Upd03 o2) {
						return (o1.up0().size() - o2.up0().size()) * -1;	// 降順
					}
				});
				MCServerThreadManager.setCommitAndRollback(true);
				MCServerThreadManager.invokeAndWait(opeL, FXBAL_BatchLogManager.class, MSLAL_SCMActRecvIfService.class);
			}

			for (MSLAL_ArrActRecvIfService.ArrActRecvIf_Upd03 ope : opeL) {
				_totalNum += ope.down0().total_num().intValue();
				_okNum += ope.down0().ok_num().intValue();
				_errNum += ope.down0().err_num().intValue();
				_skipNum += ope.down0().skip_num().intValue();
			}

			// 呼出元のサービス実行番号に戻す
			object(MSLAL_SCMActRecvIfService.class)._execNo = no;
		}

		protected Map_ArrActRecvIf_Upd03_DtlR_MSVT_ARR_ACT_RECV_IF_R<ArrActRecvIf_Upd03_DtlR,MSVT_ARR_ACT_RECV_IF_R> createMap_ArrActRecvIf_Upd03_DtlR_MSVT_ARR_ACT_RECV_IF_R() {
			return new Map_ArrActRecvIf_Upd03_DtlR_MSVT_ARR_ACT_RECV_IF_R<ArrActRecvIf_Upd03_DtlR, MSVT_ARR_ACT_RECV_IF_R>();
		}
		public class Map_ArrActRecvIf_Upd03_DtlR_MSVT_ARR_ACT_RECV_IF_R<D extends ArrActRecvIf_Upd03_DtlR, S extends MSVT_ARR_ACT_RECV_IF_R> extends MCRowMapper<D,S>{
			@Override
			public void valueCopy(D dest, S src) {
				dest.aa(src);
				dest.rcpt_iv_mng_no(src.getStringNE("rcpt_iv_mng_no"));
				dest.po_no(src.getStringNE("po_no"));
				dest.sls_ret_schd_no(src.getStringNE("sls_ret_schd_no"));
				dest.iv_no(src.getStringNE("iv_no"));
				dest.dlv_slip_no(src.getStringNE("dlv_slip_no"));
			}
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
	}

	/**
	 * ArrActRecvIf_Upd03オペレーション.<p>
	 *
	 * 入荷実績受信ＩＦ取込を行う。（マルチスレッド実行用）<br>
	 */
	public class ArrActRecvIf_Upd03 extends MSLAL_ArrActRecvIfService_MC_A.ArrActRecvIf_Upd03 {
		/** ArrActRecvIf_Upd04を呼び出す際にデータＮＯ、入荷物流グループ、各種ＮＯ(*1)の組み合わせを何件ずつ渡すかのパラメータ **/
		/** (*1)：受領インボイスＮＯ、発注ＮＯ、売上返品予定ＮＯ、インボイスＮＯ、納品書ＮＯのいずれか **/
		protected int _loopCnt = MCConst.app.getInteger("MS.MSLAL6040.loop_size", 100);

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
		 * ArrActRecvIf_Upd04バッチ呼び出しオペレーションから引き継ぐ
		 */
		protected FXBAL_BatchLogger _logger = null;

		/**
		 * インスタンス生成元（ArrActRecvIf_Upd03）でスレッド間でユニークな値を設定
		 */
		protected int _no = 0;

		/**
		 * MSLAL_ArrActRecvIfService.ArrActRecvIf_Upd04の実行結果リスト
		 */
		protected MCList<ArrActRecvIf_Upd04_DtlR> _exeRslt = null;

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
		 * 入荷実績受信ＩＦ取込処理を実行する。
		 */
		protected void exe() {

			int cnt = 0;

			MCList<ArrActRecvIf_Upd03_DtlR> tgtL = MCList.create(ArrActRecvIf_Upd03_DtlR.class);
			ArrActRecvIf_Upd03_DtlR oldR = ArrActRecvIf_Upd03_DtlR.create();

			sort();

			for (ArrActRecvIf_Upd03_DtlR dtlR : up0()) {

				if (isNextData(oldR, dtlR)) {

					if (!tgtL.isEmpty() && _loopCnt <= cnt) {

						callArrActRecvIfUpd04(tgtL);
						cnt = 0;
						tgtL.clear();
					}
				}

				oldR = dtlR;
				cnt++;
				tgtL.add(dtlR);
			}

			if (!tgtL.isEmpty()) {

				callArrActRecvIfUpd04(tgtL);
			}
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

		protected MSLAL_ArrActRecvIfService.ArrActRecvIf_Upd04 getOpe(){
			return MSLAL_ArrActRecvIfService.crtArrActRecvIf_Upd04();
		}
		
		/**
		 * ArrActRecvIf_Upd04を実行する。
		 * @param recvIfL 入荷実績受信ＩＦリスト
		 */
		protected void callArrActRecvIfUpd04(MCList<ArrActRecvIf_Upd03_DtlR> recvIfL) {

			crtArrActRecvIfWk(recvIfL);

			MCList<MSVT_ARR_ACT_RECV_IF_R> exeL = srchLockArrActRecvIf(recvIfL);
			MCIndexKey idx = exeL.createIndex(MSVT_ARR_ACT_RECV_IF_R.$data_lno);

			Set<List<String>> afterExtDataSet = srchAfterExtData(exeL);

			MSLAL_ArrActRecvIfService.ArrActRecvIf_Upd04 ope = getOpe();

			MCList<MSVT_ARR_ACT_RECV_IF_R> skipL = MCList.create(MSVT_ARR_ACT_RECV_IF_R.class);
			for (ArrActRecvIf_Upd03_DtlR recvIfR : recvIfL) {
				MSVT_ARR_ACT_RECV_IF_R exeR = exeL.getFirst(idx, recvIfR.data_lno());

				// 以下のいずかに該当するデータは処理対象外（対象件数およびスキップ件数にもカウントしない）
				// ・処理対象外(取込フラグがオフ、送受信状況区分が「受信変換完了」以外(nullを除く))
				// ・ 「エラー行まで登録」による対象外
				// ・ＳＣＭ実績受信ＩＦ一括取込の実行から取り込みまでの間にデータが更新されている
				if (isNull(exeR) || isStopErr(exeR) || isChkUpdCntr(exeR)) {
					continue;
				}
				// 同一の入荷物流グループ、外部システムＣＤ、外部入荷実績ＮＯでエラーが発生している場合、それ以降のデータは処理しない
				else if (isErrSkip(exeR)) {

					setErrSts(exeR);
					MCMessagePool.add(
						exeR, null, MSLAL0050,
						exeR.data_no(), exeR.data_lno(), exeR.arr_lg_grp_cd(), exeR.ext_sys_cd(), exeR.ext_arr_act_no());
					skipL.add(exeR);
				}
				// 同一の入荷物流グループ、外部システムＣＤ、外部入荷実績ＮＯで、新しいデータが既に処理されている場合、スキップする
				else if (isOkSkip(exeR, afterExtDataSet)) {

					setSkipSts(exeR);
					MCMessagePool.add(
						exeR, null, MSLAL0051,
						exeR.data_no(),exeR.data_lno(), exeR.arr_lg_grp_cd(), exeR.ext_sys_cd(), exeR.ext_arr_act_no());
					skipL.add(exeR);
				}
				// 入荷不要のデータを対象外とするか
				else if (isOkSkipByArrSkip(exeR)) {

					setOkSts(exeR);
					MCMessagePool.add(
						exeR, null, MSLAL0219, exeR.data_no(), exeR.data_lno(), exeR.po_d_no(),
						exeR.bp_dlv_slip_no(), exeR.bp_dlv_slip_d_no());
					skipL.add(exeR);
				}
				else {

					copy(ope.up0().add(), exeR, recvIfR, createMap_ArrActRecvIf_Upd04_DtlR_MSVT_ARR_ACT_RECV_IF_R());
				}
			}

			if (!ope.up0().isEmpty()) {
				ope.up1().if_upd_typ(up1().if_upd_typ());
				ope.up1().src_actlumprecv_flg(up1().src_actlumprecv_flg());
				ope.exec();
			}

			mergeExeRslt(skipL, ope.down0());

			afterCall(exeL);

			delArrActRecvIfWk(recvIfL);
		}
		protected Map_ArrActRecvIf_Upd04_DtlR_MSVT_ARR_ACT_RECV_IF_R
				<ArrActRecvIf_Upd04_DtlR,MSVT_ARR_ACT_RECV_IF_R,ArrActRecvIf_Upd03_DtlR> createMap_ArrActRecvIf_Upd04_DtlR_MSVT_ARR_ACT_RECV_IF_R() {
			return new Map_ArrActRecvIf_Upd04_DtlR_MSVT_ARR_ACT_RECV_IF_R
					<ArrActRecvIf_Upd04_DtlR, MSVT_ARR_ACT_RECV_IF_R,ArrActRecvIf_Upd03_DtlR>();
		}
		public class Map_ArrActRecvIf_Upd04_DtlR_MSVT_ARR_ACT_RECV_IF_R
				<D extends ArrActRecvIf_Upd04_DtlR, S extends MSVT_ARR_ACT_RECV_IF_R, W extends ArrActRecvIf_Upd03_DtlR> extends MAUCC_RowMapperWith<D,S,W>{
			protected ArrActRecvIf_Upd03_DtlR _recvIfR;
			@Override
			public void setWith(W recvIfR) {
				_recvIfR = recvIfR;
			}
			@Override
			public void valueCopy(D dest, S src) {
				dest.aa(src);
				dest.rcpt_iv_mng_no(_recvIfR.rcpt_iv_mng_no());
				dest.po_no(_recvIfR.po_no());
				dest.sls_ret_schd_no(_recvIfR.sls_ret_schd_no());
				dest.iv_no(_recvIfR.iv_no());
				dest.dlv_slip_no(_recvIfR.dlv_slip_no());
			}
		}

		/**
		 * 「エラー行まで登録」の状態となっているか
		 */
		protected boolean isStopErr(MSVT_ARR_ACT_RECV_IF_R r) {
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
		protected boolean isErrSkip(MSVT_ARR_ACT_RECV_IF_R exeR) {

			return object(CLAZZ)._errSet.contains(createErrSetKey(exeR));
		}

		/**
		 * 同一キーで新しいデータが既に処理済みかどうか。
		 * @param exeR 取込対象行
		 * @return 処理済みの場合はtrue
		 */
		protected boolean isOkSkip(MSVT_ARR_ACT_RECV_IF_R exeR, Set<List<String>> afterExtDataSet) {

			return afterExtDataSet.contains(createErrSetKey(exeR));
		}

		/**
		 * ＳＣＭ実績受信ＩＦ一括取込で取得したデータが更新されていないか
		 * 
		 * @param exeR 取込対象行
		 * @return 更新されている場合はtrue
		 */
		protected boolean isChkUpdCntr(MSVT_ARR_ACT_RECV_IF_R exeR) {
			if (!up1().src_actlumprecv_flg()) {
				return false;
			}

			// ＳＣＭ実績受信ＩＦ一括取込で取得したMESIF情報を取得する

			if (!isSame(exeR.upd_srv_req_no(), MCSys.request.serverRequestNo())) {
				MCMessageList msgL = new MCMessageList();
				msgL.addAll(checkUpdCntrNE(exeR, MSVT_MES_IF_R.$upd_cntr,
						MSLAL_SCMActRecvIfService.getMesIfR(exeR.data_lno(),
								exeR.data_no())));
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
		 * 入荷不要のデータを処理対象外とするか
		 */
		protected boolean isOkSkipByArrSkip(MSVT_ARR_ACT_RECV_IF_R exeR) {
			// 処理対象（後続処理でエラーとする）
			return false;
		}

		/**
		 * 入荷実績受信ＩＦのワークテーブルにデータを登録する。
		 * @param recvIfL 入荷実績受信ＩＦ
		 */
		protected void crtArrActRecvIfWk(MCList<ArrActRecvIf_Upd03_DtlR> recvIfL) {
			MCList<MST_ARR_ACT_RECV_IF_R> dbc = MCList.create(MST_ARR_ACT_RECV_IF_R.class);
			MST_ARR_ACT_RECV_IF_R t = MST_ARR_ACT_RECV_IF_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			recvIfL.forEach(r -> dbc.add().data_lno(r.data_lno()));

			dbWkDelete("MSLAL6040_MSW_ARR_ACT_RECV_IF_D01", dbc_bldr.getBaseDbc());
			dbWkInsert("MSLAL6040_MSW_ARR_ACT_RECV_IF_I01", dbc.groupBy(MST_ARR_ACT_RECV_IF_R.$data_lno), dbc_bldr.getBaseDbc());
		}

		/**
		 * 受信ＩＦテーブルをロックする
		 */
		protected MCList<MSVT_ARR_ACT_RECV_IF_R> srchLockArrActRecvIf(MCList<ArrActRecvIf_Upd03_DtlR> recvIfL) {

			MSW_ARR_ACT_RECV_IF_KEY_R w1 = MSW_ARR_ACT_RECV_IF_KEY_R.create("W1");
			Class<?> clazz = createDbcClass(getTblName());
			MCDBContainer arractif = (MCDBContainer) MCFactory.invokeStatic(clazz,
					"create", new Class[] {
							String.class
					}, new Object[] {
							"ARRACTIF"
					});
			PFT_SDRV_IF_R t2 = PFT_SDRV_IF_R.create("T2");

			// ロック用のSELECT文発行
			MCQueryApiBuilder lock_bldr = MCQueryApiBuilder.create(arractif);
			lock_bldr.addInnerJoin(w1, MCQueryApiBuilder.makeEq(w1.data_lno, arractif.getColumn$("data_lno")));
			lock_bldr.addLeftOuterJoin(t2, MCQueryApiBuilder.makeEq(t2.data_no, arractif.getColumn$("data_no")));

			lock_bldr.setWhere(value(0).eq(value(0)));
			lock_bldr.addWhereWithAnd(bracket(t2.sdrv_sts_typ.isNull().or(
					t2.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.RECV_CONV_OK.value())))));
			lock_bldr.addWhereWithAnd(MCQueryApiBuilder.makeEq(arractif.getColumn$("imp_flg"), value(true)));
			lock_bldr.addOrderByAsc(arractif.getColumn$("data_lno"));

			lock_bldr.setLockTable(arractif.getColumn$("data_lno"));

			dbSelectForUpdateNoFetch("MSLAL6040_MST_ARR_ACT_RECV_IF_S01", lock_bldr);

			// データ取得用のSELECT文発行
			MCList<MSVT_ARR_ACT_RECV_IF_R> exeL = MCList.create(MSVT_ARR_ACT_RECV_IF_R.class);
			MSVT_ARR_ACT_RECV_IF_R t = MSVT_ARR_ACT_RECV_IF_R.create("T");
			MCQueryApiBuilder exeL_bldr = MCQueryApiBuilder.create(t);

			exeL_bldr.addInnerJoin(w1, bracket( t.data_lno.eq(w1.data_lno)));
			exeL_bldr.addLeftOuterJoin(t2, t.data_no.eq(t2.data_no));

			exeL_bldr.setWhere(value(0).eq(value(0)));
			exeL_bldr.addWhereWithAnd(bracket(t2.sdrv_sts_typ.isNull().or(
					t2.sdrv_sts_typ.eq(value(MAC_SDRV_STS_TYP.RECV_CONV_OK.value())))));
			exeL_bldr.addWhereWithAnd(t.imp_flg.eq(value(true)));
			exeL_bldr.addWhereWithAnd(t.if_proc_typ.eq(value(getIfProcTyp().value())));
			exeL_bldr.addOrderByAsc(t.data_lno);

			dbSelect("MSLAL6040_MSVT_ARR_ACT_RECV_IF_S04", exeL, exeL_bldr);

			for (MSVT_ARR_ACT_RECV_IF_R exeR : exeL) {

				// log_sub_key1にスレッド間でユニークな値を設定
				exeR.setParamIndex(_no);
			}

			_logger.setLogKey(exeL,
					MSVT_ARR_ACT_RECV_IF_R.$batch_log_no,
					MSVT_ARR_ACT_RECV_IF_R.$log_sub_key1,
					MSVT_ARR_ACT_RECV_IF_R.$log_sub_key2);

			return exeL;
		}

		/**
		 * 同一キーで取込対象より新しいかつ処理済みのデータを取得する。
		 * @param exeL 取込対象リスト
		 * @return 処理済みデータリスト
		 */
		protected Set<List<String>> srchAfterExtData(MCList<MSVT_ARR_ACT_RECV_IF_R> exeL) {

			MSVT_ARR_ACT_RECV_IF_R S1ST = MSVT_ARR_ACT_RECV_IF_R.create("ST");

			MCList<MSVT_ARR_ACT_RECV_IF_R> afterL = MCList.create(MSVT_ARR_ACT_RECV_IF_R.class);
			MSVT_ARR_ACT_RECV_IF_R t = MSVT_ARR_ACT_RECV_IF_R.create("T");
			MCQueryApiBuilder afterL_bldr = MCQueryApiBuilder.create(t);

			afterL_bldr.setSelect(t.arr_lg_grp_cd);
			afterL_bldr.addSelect(t.ext_sys_cd);
			afterL_bldr.addSelect(t.ext_arr_act_no);
			afterL_bldr.addConstWhereWithAnd(exists(subQuery().select(value("X")).from(S1ST)
					.where(t.ext_data_no.lt(S1ST.ext_data_no)
							.and(t.ext_sys_cd.eq(S1ST.ext_sys_cd))
							.and(t.arr_lg_grp_cd.eq(S1ST.arr_lg_grp_cd))
							.and(t.ext_arr_act_no.eq(S1ST.ext_arr_act_no))
							.and(t.if_proc_typ.eq(value(getIfProcTyp().value())))
							.and(S1ST.exe_sts_typ.in(value(MAC_EXE_STS_TYP.OK.value()),
									value(MAC_EXE_STS_TYP.SKP.value()))))));
			afterL_bldr.addWhereWithAnd(t.if_proc_typ.eq(value(getIfProcTyp().value())));

			dbSelectColumn("MSLAL6040_MSVT_ARR_ACT_RECV_IF_S05", afterL, afterL_bldr, exeL, MSVT_ARR_ACT_RECV_IF_R.$data_lno);

			Set<List<String>> set = new HashSet<List<String>>();
			for (MSVT_ARR_ACT_RECV_IF_R afterR : afterL) {

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
		 * @param downL MSLAL_ArrActRecvIfService.ArrActRecvIf_Upd04の下り電文
		 */
		protected void mergeExeRslt(MCList<MSVT_ARR_ACT_RECV_IF_R> skipL, MCList<ArrActRecvIf_Upd04_DtlR> downL) {

			_exeRslt = MCList.create(ArrActRecvIf_Upd04_DtlR.class);
			_exeRslt.setAll(downL);

			ArrActRecvIf_Upd04_DtlR dtlR = null;

			for (MSVT_ARR_ACT_RECV_IF_R skipR : skipL) {

				dtlR = ArrActRecvIf_Upd04_DtlR.create();
				dtlR.data_lno(skipR.data_lno());
				dtlR.exe_sts_typ(skipR.exe_sts_typ());
				_exeRslt.add(dtlR);
			}
		}

		/**
		 * 入荷実績受信ＩＦ取込の後処理。
		 * @param exeL 取込対象リスト
		 */
		protected void afterCall(MCList<MSVT_ARR_ACT_RECV_IF_R> exeL) {

			rsltCnt(exeL);

			updIf(exeL);

			MCMessageList msgList = MCMessagePool.getMessageList();
			_logger.writeDataLog(msgList);
			pushAlertMsg(msgList);

			dbTran().commit();

			msgList.clear();
		}

		protected void pushAlertMsg(MCMessageList msgList) {
			
		}
		
		/**
		 * 入荷実績受信ＩＦを更新する。
		 * @param exeL 取込対象リスト
		 */
		protected void updIf(MCList<MSVT_ARR_ACT_RECV_IF_R> exeL) {

			MCUpdate q = getUpdSql();
			q.executeBatchUpdate(exeL);
		}

		protected MCUpdate getUpdSql() {
			Class<?> clazz = createDbcClass(getTblName());
			MCDBContainer S0T = (MCDBContainer) MCFactory.invokeStatic(clazz,
					"create", new Class[] {
							String.class
					}, new Object[] {
							"T"
					});
			
			MCUpdate q = sql(createSqlId(LOGIC_ID, S0T, "U01"))
					.update(S0T)
					.set(S0T.getColumn$("imp_flg")).eq(bind("imp_flg"))
					.set(S0T.getColumn$("exe_sts_typ")).eq(bind("exe_sts_typ"))
					.set(S0T.getColumn$("batch_log_no")).eq(bind("batch_log_no"))
					.set(S0T.getColumn$("log_sub_key1")).eq(bind("log_sub_key1"))
					.set(S0T.getColumn$("log_sub_key2")).eq(bind("log_sub_key2"))
					.where(
							MCQueryApiBuilder.makeEq(S0T.getColumn$("data_lno"), bind("data_lno"))
					);
			return q;
		}
		
		protected String getTblName() {
			return MAC_IF_PROC_TYP.upd_if_tbl(getIfProcTyp().value());
		}
		
		/**
		 * 取込結果の件数を算出する。
		 * @param exeL 取込対象リスト
		 */
		protected void rsltCnt(MCList<MSVT_ARR_ACT_RECV_IF_R> exeL) {

			MCIndexKey idxkey = _exeRslt.createIndex(ArrActRecvIf_Upd03_DtlR.$data_lno);

			for (MSVT_ARR_ACT_RECV_IF_R exeR : exeL) {

				ArrActRecvIf_Upd04_DtlR exeRslt = _exeRslt.getFirst(idxkey, exeR.data_lno());

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
		 * 処理結果区分に処理済を設定する。
		 * 
		 * @param exeR 取込対象行
		 */
		protected void setOkSts(MSVT_ARR_ACT_RECV_IF_R exeR) {

			exeR.exe_sts_typ(MAC_EXE_STS_TYP.OK.value());
		}

		/**
		 * 処理結果区分にスキップを設定する。
		 * 
		 * @param exeR 取込対象行
		 */
		protected void setSkipSts(MSVT_ARR_ACT_RECV_IF_R exeR) {

			exeR.exe_sts_typ(MAC_EXE_STS_TYP.SKP.value());
		}

		/**
		 * 処理結果区分にエラーを設定する。
		 * 
		 * @param row 取込対象行
		 */
		protected void setErrSts(MSVT_ARR_ACT_RECV_IF_R exeR) {

			exeR.exe_sts_typ(MAC_EXE_STS_TYP.ERR.value());
			setErrSet(exeR);
		}

		/**
		 * 同一取込単位
		 */
		protected String[] getGrpKey() {
			return new String[]{
				ArrActRecvIf_Upd03_DtlR.$ext_data_no,
				ArrActRecvIf_Upd03_DtlR.$arr_lg_grp_cd,
				ArrActRecvIf_Upd03_DtlR.$ext_sys_cd,
				ArrActRecvIf_Upd03_DtlR.$rcpt_iv_mng_no,
				ArrActRecvIf_Upd03_DtlR.$po_no,
				ArrActRecvIf_Upd03_DtlR.$sls_ret_schd_no,
				ArrActRecvIf_Upd03_DtlR.$iv_no,
				ArrActRecvIf_Upd03_DtlR.$dlv_slip_no
			};
		}

		/**
		 * 引数で渡された比較対象が同一取込単位かどうか。
		 * @param preR 前の取込対象
		 * @param exeR　取込対象
		 * @return 取込単位のいずれかが異なる場合はtrue
		 */
		protected boolean isNextData(ArrActRecvIf_Upd03_DtlR preR, ArrActRecvIf_Upd03_DtlR exeR) {

			return !preR.equalColumns(
				exeR, getGrpKey()
			);
		}

		/**
		 * 入荷実績受信ＩＦワークテーブルのデータを削除する。
		 * @param recvIfL
		 */
		protected void delArrActRecvIfWk(MCList<ArrActRecvIf_Upd03_DtlR> recvIfL) {
			MST_ARR_ACT_RECV_IF_R t = MST_ARR_ACT_RECV_IF_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbWkDelete("MSLAL6040_dbc_bldr.MST_ARR_ACT_RECV_IF_D01", dbc_bldr.getBaseDbc());
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
	 * ArrActRecvIf_Upd04オペレーション.<p>
	 *
	 * 入荷実績受信ＩＦ取込を行う。（入荷実績受信ＩＦサービスを呼び出す本処理）<br>
	 */
	public class ArrActRecvIf_Upd04 extends MSLAL_ArrActRecvIfService_MC_A.ArrActRecvIf_Upd04 {

		/**
		 * チェック処理(Chk01)の下り電文<br>
		 * 入荷実績受信IFサービス(MSBEL6000)の上り電文にもなる
		 */
		protected MCList<ArrActRecvIf_Chk01_Dtl2R> _chkRsltL;
		protected MCIndexKey _chkIdxkey = null;

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
			up0().setString(ArrActRecvIf_Upd04_DtlR.$exe_sts_typ, MAC_EXE_STS_TYP.NOT_EXE.value());
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
			MCList<ArrActRecvIf_Upd04_DtlR>[] grp = getGrp();

			for (MCList<ArrActRecvIf_Upd04_DtlR> list : grp) {
				try {
					if (isStopErr(list.get(0))) {
						continue;
					}
					sp = setSavepoint();
					chk(list);
					callArrActRcptIfService(list);
				}
				catch (Exception ex) {
					handleEx(ex, sp, list);
				}
				finally {
					sp = null;
				}
			}
		}

		protected MSLAL_ArrActRecvIfService.ArrActRecvIf_Chk01 getOpe(){
			 return MSLAL_ArrActRecvIfService.crtArrActRecvIf_Chk01();
		}
		
		/**
		 * チェック処理
		 */
		protected void chk(MCList<ArrActRecvIf_Upd04_DtlR> list) {

			MSLAL_ArrActRecvIfService.ArrActRecvIf_Chk01 chkOpe = getOpe();
			setAll(chkOpe.up0(), list, createMap_ArrActRecvIf_Chk01_DtlR_ArrActRecvIf_Upd04_DtlR());
			chkOpe.exec();

			_chkRsltL = chkOpe.down1();
			_chkIdxkey = chkOpe.down1().createIndex(ArrActRecvIf_Chk01_Dtl2R.$data_lno);

			MCIndexKey idx = chkOpe.down0().createIndex(ArrActRecvIf_Chk01_DtlR.$data_lno);
			for (ArrActRecvIf_Upd04_DtlR r : list) {
				MCList<ArrActRecvIf_Chk01_DtlR> chkL = chkOpe.down0().subList(idx, r.data_lno());
				for (ArrActRecvIf_Chk01_DtlR chkR : chkL) {
					r.push_alert_usr_cd(chkR.push_alert_usr_cd());
					r.push_alert_wg_cd(chkR.push_alert_wg_cd());
					if (chkR.err_flg()) {
						setErr(r);
						break;
					}
				}
			}

			chkGrpErr(list);

			// 同一キーでエラーが発生していないかチェック
			chkPrevErr(list);
		}

		/**
		 * 入荷実績受信IFサービスの呼出
		 */
		protected void callArrActRcptIfService(MCList<ArrActRecvIf_Upd04_DtlR> list) {

			MSBEL_ArrActRcptIFService.ArrActIF_Upd01 o = MSBEL_ArrActRcptIFService.crtArrActIF_Upd01();
			o.up0().if_upd_typ(nvl(up1().if_upd_typ(), MAC_IF_UPD_TYP.SKIP_ERROR.value()));
			o.up0().is_src_batch_flg(true);

			MCNumber peg = MCNumber.ZERO;
			Map<MCNumber, ArrActRecvIf_Upd04_DtlR> map = new HashMap<>();

			for (ArrActRecvIf_Upd04_DtlR r : list) {
				if (isErr(r)) {
					if (MAC_IF_UPD_TYP.isSTOP_ERROR(up1().if_upd_typ())) {
						break;
					}
					continue;
				}
				MCList<ArrActRecvIf_Chk01_Dtl2R> chkL = _chkRsltL.subList(_chkIdxkey, r.data_lno());
				if (!isNull(chkL)) {
					for (ArrActRecvIf_Chk01_Dtl2R chkR : chkL) {
						ArrActIF_DtlR ifR = chkR.aaIf(), upR = o.up1().add();
						ifR.peg_no(peg);
						MCRow.copyall(upR, ifR);
						upR.setAttributes(ifR);

						map.put(peg, r);
						peg = peg.add(1);
					}
				}
			}
			if (!o.up1().isEmpty()) {
				o.exec();

				for (ArrActIF_DtlR ifR : o.down0()) {
					ArrActRecvIf_Upd04_DtlR r = map.get(ifR.peg_no());
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
		 * 入荷実績登録処理でエラーが発生した場合の処理。
		 */
		protected void handleEx(Exception ex, MCSavepoint sp, MCList<ArrActRecvIf_Upd04_DtlR> list) {

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

			for (ArrActRecvIf_Upd04_DtlR opeRow : list) {
				MCMessagePool.add(opeRow, null, MSLAL0052, opeRow.data_no(), opeRow.data_lno(), msgId, msg);
				for (MCMessage causeMsg : causeMsgList) {
					MCMessage newMsg = new MCMessage(opeRow, null, causeMsg.getID(), (Object[])causeMsg.getBindArray());
					MCMessagePool.add(newMsg);
				}
				
				setErr(opeRow);
			}
			
			if (sp != null) {
				
				dbTran().rollback(sp);
			}
		}

		/**
		 * 取込単位のうち、一部でもエラーがあったら全てエラーとする
		 */
		protected void chkGrpErr(MCList<ArrActRecvIf_Upd04_DtlR> list) {

// 明細単位の取込のため、グルーピングによるエラーはしない。
//			ArrActRecvIf_Upd04_DtlR errR = list.getFirst(ArrActRecvIf_Upd04_DtlR.$exe_sts_typ, MAC_EXE_STS_TYP.ERR.value());
//			if (errR != null) {
//				for (ArrActRecvIf_Upd04_DtlR row : list) {
//					if (!isErr(row)) {
//						MCMessagePool.add(
//							row, null, MSLAL0053,
//							row.data_no(), row.data_lno(),
//							row.arr_lg_grp_cd(),
//							row.rcpt_iv_mng_no(),
//							row.po_no(),
//							row.sls_ret_schd_no(),
//							row.iv_no(),
//							row.dlv_slip_no());
//						setErr(row);
//					}
//				}
//			}
		}

		/**
		 * 同一の入荷物流グループ、外部入荷実績ＮＯですでにエラーが発生しているかをチェックする
		 */
		protected void chkPrevErr(MCList<ArrActRecvIf_Upd04_DtlR> list) {

			for (ArrActRecvIf_Upd04_DtlR row : list) {
				if (!isErr(row)) {
					if (object(CLAZZ)._errSet.contains(createErrSetKey(row.aa()))) {
						setErrSts(row.aa());
						MCMessagePool.add(
							row, null, MSLAL0050,
							row.data_no(), row.data_lno(), row.arr_lg_grp_cd(), row.ext_sys_cd(), row.ext_arr_act_no());
					}
				}
			}
		}

		/**
		 * 「エラー行まで登録」の状態となっているか
		 */
		protected boolean isStopErr(ArrActRecvIf_Upd04_DtlR r) {
			if (MAC_IF_UPD_TYP.isSTOP_ERROR(up1().if_upd_typ())
				&& object(CLAZZ)._stopErrSet.contains(r.ext_sys_cd())) {
				return true;
			}
			return false;
		}

		/**
		 * 取込単位ごとのセーブポイントを作成する
		 */
		protected MCSavepoint setSavepoint() {
			return dbTran().setSavepoint();
		}

		protected void setDown() {
			
			down0().setAll(up0());
		}

		/**
		 * 取込単位となるキーを返す
		 */
		protected String[] getGrpKey() {
			return new String[]{
				ArrActRecvIf_Upd04_DtlR.$ext_data_no,
				ArrActRecvIf_Upd04_DtlR.$arr_lg_grp_cd,
				ArrActRecvIf_Upd04_DtlR.$ext_sys_cd,
				ArrActRecvIf_Upd04_DtlR.$rcpt_iv_mng_no,
				ArrActRecvIf_Upd04_DtlR.$po_no,
				ArrActRecvIf_Upd04_DtlR.$sls_ret_schd_no,
				ArrActRecvIf_Upd04_DtlR.$iv_no,
				ArrActRecvIf_Upd04_DtlR.$dlv_slip_no
			};
		}

		/**
		 * 取込単位でグループ化する
		 * 
		 * @return
		 */
		@SuppressWarnings("unchecked")	// 総称配列の警告回避
		protected MCList<ArrActRecvIf_Upd04_DtlR>[] getGrp() {
			
			List<MCList<ArrActRecvIf_Upd04_DtlR>> arr = new ArrayList<>();
			ArrActRecvIf_Upd04_DtlR bkR = null;
			MCList<ArrActRecvIf_Upd04_DtlR> lst = null;

			for (ArrActRecvIf_Upd04_DtlR r : up0()) {
				if (isNull(bkR) || !r.equalColumns(bkR, getGrpKey())) {
					lst = MCList.create(ArrActRecvIf_Upd04_DtlR.class);
					arr.add(lst);
				}
				lst.add(r);
				bkR = r;
			}
			
			List<MCList<ArrActRecvIf_Upd04_DtlR>> ret = mergeNewDtlL(arr);
			return ret.toArray(new MCList[ret.size()]);
		}
		/**
		 * #getGrp()の結果を基に、新規取り込みデータが連続している場合は更にまとめる
		 * @see #getGrp()
		 * @param arr {@link #getGrpKey()}でグループ化したもの
		 * @return ret 新規取り込みデータをマージしたリスト
		 */
		protected List<MCList<ArrActRecvIf_Upd04_DtlR>> mergeNewDtlL(
				List<MCList<ArrActRecvIf_Upd04_DtlR>> arr) {
			List<MCList<ArrActRecvIf_Upd04_DtlR>> ret = new ArrayList<>();
			MCList<ArrActRecvIf_Upd04_DtlR> mergeDestL = MCList
					.create(ArrActRecvIf_Upd04_DtlR.class);
			boolean isMerging = false;

			for (MCList<ArrActRecvIf_Upd04_DtlR> l : arr) {
				if (isNewDtlOnly(l)) {
					mergeDestL.addAll(l);
					isMerging = true;
				}
				else {
					if (isMerging) {
						ret.add(mergeDestL);
						isMerging = false;
						mergeDestL = MCList.create(ArrActRecvIf_Upd04_DtlR.class);
					}
					ret.add(l);
				}
			}

			if (isMerging) {
				ret.add(mergeDestL);// IFデータが全て新規の場合
			}
			return ret;
		}

		protected boolean isNewDtlOnly(MCList<ArrActRecvIf_Upd04_DtlR> l) {
			for (ArrActRecvIf_Upd04_DtlR r : l) {
				if (!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					return false;
				}
			}
			return true;
		}

		/**
		 * 処理結果区分がエラーか
		 */
		protected boolean isErr(ArrActRecvIf_Upd04_DtlR row) {
			return MAC_EXE_STS_TYP.isERR(row.exe_sts_typ());
		}

		/**
		 * 処理結果区分にエラーを設定
		 */
		protected void setErr(ArrActRecvIf_Upd04_DtlR row) {
			setErrSts(row.aa());
		}

		/**
		 * 処理結果区分にエラーを設定
		 */
		protected void setErr(MCList<ArrActRecvIf_Upd04_DtlR> list) {
			for (ArrActRecvIf_Upd04_DtlR row : list) {
				setErr(row);
			}
		}

		/**
		 * 処理結果区分に処理済を設定
		 */
		protected void setOk(ArrActRecvIf_Upd04_DtlR row) {
			row.exe_sts_typ(MAC_EXE_STS_TYP.OK.value());
		}
		protected void setOk(MCList<ArrActRecvIf_Upd04_DtlR> list) {
			for (ArrActRecvIf_Upd04_DtlR row : list) {
				setOk(row);
			}
		}

		protected Map_ArrActRecvIf_Chk01_DtlR_ArrActRecvIf_Upd04_DtlR<ArrActRecvIf_Chk01_DtlR,ArrActRecvIf_Upd04_DtlR> createMap_ArrActRecvIf_Chk01_DtlR_ArrActRecvIf_Upd04_DtlR() {
			return new Map_ArrActRecvIf_Chk01_DtlR_ArrActRecvIf_Upd04_DtlR<ArrActRecvIf_Chk01_DtlR, ArrActRecvIf_Upd04_DtlR>();
		}
		public class Map_ArrActRecvIf_Chk01_DtlR_ArrActRecvIf_Upd04_DtlR<D extends ArrActRecvIf_Chk01_DtlR, S extends ArrActRecvIf_Upd04_DtlR> extends MCRowMapper<D,S>{
			@Override
			public void valueCopy(D dest, S src) {
				dest.aa(src.aa());
				dest.rcpt_iv_mng_no(src.rcpt_iv_mng_no());
			}
		}
	}

	/**
	 * ArrActRecvIf_Chk01オペレーション.<p>
	 *
	 * 入荷実績受信ＩＦ取込を行う前のチェック処理<br>
	 */
	public class ArrActRecvIf_Chk01 extends MSLAL_ArrActRecvIfService_MC_A.ArrActRecvIf_Chk01 {

		/**
		 * 入荷実績受信IFに対応する入荷予定のリスト
		 */
		protected MCList<ArrActRecvIf_Chk01_DtlR> _asL;

		//入荷予定を特定するためのキーと、キーを格納するマップ
		protected MCIndexKey _prmsKey;

		protected MCIndexKey _podKey;

		protected MCIndexKey _sretKey;

		protected MCIndexKey _ivKey;

		protected MCIndexKey _rcptIvKey;

		protected MCIndexKey _dlvSlipKey;

		protected MCIndexKey _dlvInstKey;

		protected MCIndexKey _schdKey;
		
		protected MCIndexKey _lotKey;

		protected Map<String, MCIndexKey> _keyMap = new HashMap<String, MCIndexKey>();

		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void initUpSub() {
			super.initUpSub();

			for (ArrActRecvIf_Chk01_DtlR r : up0()) {
				if (!isNull(r.itm_cd())) {
					r.itm_sub1(nvl(r.itm_sub1(), MAC_STR.NULL_VAL.value()));
					r.itm_sub2(nvl(r.itm_sub2(), MAC_STR.NULL_VAL.value()));
					r.itm_sub3(nvl(r.itm_sub3(), MAC_STR.NULL_VAL.value()));
				}
			}
		}
		@Override
		protected void doIt() {
			super.doIt();
			setDown();
		}

		protected void setDown() {
			down0().setAll(
				up0().groupBy(ArrActRecvIf_Chk01_DtlR.$data_lno, ArrActRecvIf_Chk01_DtlR.$err_flg, 
						ArrActRecvIf_Chk01_DtlR.$push_alert_usr_cd, ArrActRecvIf_Chk01_DtlR.$push_alert_wg_cd)
			);
			up0().forEach(r -> {
				ArrActRecvIf_Chk01_Dtl2R d1R = down1().add();
				d1R.data_lno(r.data_lno());
				d1R.aaIf(r.aaIf());
				d1R.setAttributes(r);
			});
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			chkTran(msgL, getChkList(up0()));
			chkUp(msgL, getChkList(up0()));

			MCList<ArrActRecvIf_Chk01_DtlR> up = getChkList(up0());
			if (up.isEmpty()) {
				return msgL;
			}

			// 入荷予定のリスト（新規分のみ）
			_asL = getArrSchdList(up.innerRowList("aa", MSVT_ARR_ACT_RECV_IF_R.class));

			// キャッシュ
			doCache(up);

			// 入荷予定を特定
			cmpleArrSchdNo(up, msgL);

			// 入荷実績を特定
			cmpleArrActNo(up, msgL);

			// 条件付き妥当性チェック
			msgL.addAll(chkValid(up));

			up = getChkList(up);
			if (up.isEmpty()) {
				return msgL;
			}

			// 補完
			cmpleAAIf(up);

			up0().setAll(up0().subList(ArrActRecvIf_Chk01_DtlR.$err_flg, true));
			up0().addAll(up);

			return msgL;
		}
		
		protected void chkTran(MCMessageList msgL, MCList<ArrActRecvIf_Chk01_DtlR> tgtL) {

		}
		
		protected void chkSameExtArrActNo(MCMessageList msgL, MCList<ArrActRecvIf_Chk01_DtlR> tgtL) {
			for (MCList<ArrActRecvIf_Chk01_DtlR> grpL : tgtL.groupList(
					ArrActRecvIf_Chk01_DtlR.$ext_sys_cd, ArrActRecvIf_Chk01_DtlR.$ext_arr_act_no)) {
				if (1 < grpL.size()) {
					for (ArrActRecvIf_Chk01_DtlR r : grpL) {
						r.err_flg(true);
						addSameExtArrActNoErrMsg(r, msgL);
					}
				}
			}
		}
		
		protected void addSameExtArrActNoErrMsg(ArrActRecvIf_Chk01_DtlR r, MCMessageList msgL) {
			msgL.add(new MCMessage(r, null, MSLAL0182, r.data_no(), r.data_lno(), r.ext_sys_cd(), r.ext_arr_act_no()));
		}
 

		/**
		 * 条件付き妥当性チェック
		 */
		protected MCMessageList chkValid(MCList<ArrActRecvIf_Chk01_DtlR> up) {
			MCMessageList msgL = new MCMessageList();

			for (ArrActRecvIf_Chk01_DtlR r : up) {

				MST_ARR_SCHD_R asR = null;

				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {

					asR = getArrSchdR(r.arr_schd_no());
					if (isNull(asR)) {
						msgL.add(new MCMessage(
							r, null, MSLAL0054, r.data_no(), r.data_lno()));
						r.err_flg(true);
					}
					else {
						MST_ARR_ACT_R aaR = getArrActR(r.ext_sys_cd(), r.ext_arr_act_no());
						if (!isNull(aaR)) {
							msgL.add(new MCMessage(
								r, null, MSLAL0056,
								r.data_no(), r.data_lno(), r.ext_sys_cd(), r.ext_arr_act_no()));
							r.err_flg(true);
						}
						MAM_EXT_SYS_R extSysR = getExtSysR(r.ext_sys_cd());
						if (extSysR.not_dup_imp_flg()) {
							if (asR.arr_qty().isPositive()) {
								// 重複取込不可
								msgL.add(new MCMessage(
									r, null, MSLAL0055,
									r.data_no(), r.data_lno(), r.ext_sys_cd(), r.ext_arr_act_no()));
								r.err_flg(true);
							}
						}
					}
				}
				else {
					MST_ARR_ACT_R aaR = getArrActR(r.aaIf().arr_act_no());
					if (isNull(aaR)) {
						msgL.add(new MCMessage(
							r, null, MSLAL0057,
							r.data_no(), r.data_lno(), r.ext_sys_cd(), r.ext_arr_act_no()));
						r.err_flg(true);
					}
					else {
						asR = getArrSchdR(aaR.arr_schd_no());
					}
				}

				if (!isNull(asR)) {
					// 品目が予定と同じか
					if (!isNullAnd(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3())) {
						if (!isSame(r.itm_cd(), asR.itm_cd())
							|| !isSame(r.itm_sub1(), asR.itm_sub1())
							|| !isSame(r.itm_sub2(), asR.itm_sub2())
							|| !isSame(r.itm_sub3(), asR.itm_sub3())) {
							msgL.add(new MCMessage(
								r, null, MSLAL0190,
								r.data_no(), r.data_lno(),
								toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
								toDispItm(asR.itm_cd(), asR.itm_sub1(), asR.itm_sub2(), asR.itm_sub3())));
						}
					}
					// 版ＮＯが予定と同じか
					MAM_ITM_R itmR = getItmR(asR.itm_cd(), asR.itm_sub1(), asR.itm_sub2(), asR.itm_sub3());
					if (itmR.ver_flg() && !isNull(r.aa().ver_no())) {
						if (!isSame(r.aa().ver_no(), asR.ver_no())) {
							msgL.add(new MCMessage(
								r, null, MSLAL0059,
								r.data_no(), r.data_lno(), r.aa().ver_no(), asR.ver_no()));
						}
					}
				}
				chkValidCustom(r, asR, msgL);
			}
			
			return msgL;
		}
		
		protected void chkValidCustom(ArrActRecvIf_Chk01_DtlR r, MST_ARR_SCHD_R asR, MCMessageList msgL) {
		}
		
		protected void chkUp(MCMessageList msgL, MCList<ArrActRecvIf_Chk01_DtlR> upL) {
			chkUpHdr(msgL, upL);
			for (ArrActRecvIf_Chk01_DtlR upR : upL) {
				chkUpDtl(msgL, upR);
			}
		}

		protected void chkUpHdr(MCMessageList msgL, MCList<ArrActRecvIf_Chk01_DtlR> upL) {
			chkSameExtArrActNo(msgL, upL);
		}

		protected void chkUpDtl(MCMessageList msgL, ArrActRecvIf_Chk01_DtlR upR) {

			if (MAC_DATA_CRUD_TYP.isCRT(upR.data_crud_typ())) {
				String[] atLeastOneChkCols = {
					ArrActRecvIf_Chk01_DtlR.$arr_schd_no,
					ArrActRecvIf_Chk01_DtlR.$po_d_no,
					ArrActRecvIf_Chk01_DtlR.$prms_rcpt_d_no,
					ArrActRecvIf_Chk01_DtlR.$dlv_inst_d_no,
					ArrActRecvIf_Chk01_DtlR.$rcpt_iv_d_no,
					ArrActRecvIf_Chk01_DtlR.$sls_ret_schd_d_no,
					ArrActRecvIf_Chk01_DtlR.$dlv_slip_d_no,
					ArrActRecvIf_Chk01_DtlR.$iv_d_no
				};
				msgL.addAll(check(upR, atLeastOneChkCols, new FXUCL_AtLeastOneValidater()));
			}

			if ((MAC_DATA_CRUD_TYP.isCRT(upR.data_crud_typ()) ||
				MAC_DATA_CRUD_TYP.isUPD(upR.data_crud_typ())) &&
				isNull(upR.trd_unit_qty())) {
				upR.err_flg(true);
				msgL.addAll(check(upR, ArrActRecvIf_Chk01_DtlR.$trd_unit_qty,
						new FXUCL_RequiredValidater()));
			}

		}

		/**
		 * 入荷実績受信IF(MSBEL6000)に必要なデータを<br>
		 * 入荷予定または入荷実績から補完する
		 */
		protected void cmpleAAIf(MCList<ArrActRecvIf_Chk01_DtlR> up) {

			setAbortFlg(up);
			for (ArrActRecvIf_Chk01_DtlR r : up) {
				MSVT_ARR_ACT_RECV_IF_R recvIfR = r.aa();
				ArrActIF_DtlR ifR = r.aaIf();
				cmpleAAIfR(r, recvIfR, ifR);
			}

		}

		protected void cmpleAAIfR(ArrActRecvIf_Chk01_DtlR r, MSVT_ARR_ACT_RECV_IF_R recvIfR, ArrActIF_DtlR ifR) {

			//ifR.peg_no(r.data_lno());	// 呼出元(ArrActRecvIf_Upd04)で設定する
			ifR.data_crud_typ(r.data_crud_typ());
			ifR.arr_schd_no(r.arr_schd_no());
			ifR.wms_flg(true);
			ifR.ext_sys_cd(r.aa().ext_sys_cd());
			ifR.ext_arr_act_no(r.aa().ext_arr_act_no());
			ifR.lg_grp_cd(r.aa().arr_lg_grp_cd());

			if (MAC_DATA_CRUD_TYP.isCRT(ifR.data_crud_typ())) {
				// 入荷予定から補完
				cmpleAAIfByArrSchd(r);
			}
			else {
				// 入荷実績から補完
				cmpleAAIfByArrAct(r);

				if (MAC_DATA_CRUD_TYP.isDEL(ifR.data_crud_typ())) {
					return;
				}
			}

			ifR.arr_tm(recvIfR.arr_tm());
			if (!isNull(ifR.arr_tm())) {
				ifR.ac_dt(getAcDt(recvIfR.arr_tm()));
			}
			ifR.arr_dpt_cd(recvIfR.arr_dpt_cd());
			ifR.arr_usr_cd(recvIfR.arr_usr_cd());
			ifR.trd_unit_qty(recvIfR.trd_unit_qty());
			ifR.base_unit_qty(getBaseUnitQty(ifR));
			ifR.purc_cont_qty(null);
			if (!isNull(ifR.sppl_cd())) {
				ifR.bp_lot_no(recvIfR.bp_lot_no());
				ifR.bp_dlv_slip_no(recvIfR.bp_dlv_slip_no());
				ifR.bp_dlv_slip_d_no(recvIfR.bp_dlv_slip_d_no());
				ifR.ship_fr_valid_dt(recvIfR.ship_fr_valid_dt());
			}
			else {
				ifR.bp_lot_no(null);
				ifR.bp_dlv_slip_no(null);
				ifR.bp_dlv_slip_d_no(null);
				ifR.ship_fr_valid_dt(null);
			}
			ifR.insp_cnt_rmrks(recvIfR.insp_cnt_rmrks());
			ifR.intr_rmrks(recvIfR.intr_rmrks());
			ifR.trd_rmrks(null);
			ifR.trd_d_rmrks(null);
			ifR.sub_char1(null);
			ifR.sub_char2(null);
			ifR.sub_char3(null);
			ifR.abort_flg(recvIfR.abort_flg());
			setLotInfo(r, ifR);
			ifR.same_lot_flg(getSameLotFlg(ifR));
			ifR.prnt_flg(false);
			ifR.cststk_flg(false);
			ifR.arr_pr_upd_cntr(null);
			ifR.arr_act_upd_cntr(null);
			ifR.arr_dpt_cd_upd_flg(true);
			ifR.arr_usr_cd_upd_flg(true);
			ifR.sno1_upd_flg(true);
			ifR.sno2_upd_flg(true);
			ifR.sno3_upd_flg(true);
			ifR.sno4_upd_flg(true);
			ifR.lot_no_upd_flg(true);
			ifR.sublot_no_upd_flg(true);
			ifR.ver_no_upd_flg(true);
			ifR.stk_arrv_bp_cd_upd_flg(true);
			ifR.gd_cd_upd_flg(true);
			ifR.quality_typ_upd_flg(true);
			ifR.stk_insp_typ_upd_flg(true);
			ifR.stk_id_typ_upd_flg(true);
			ifR.stk_bp_cd_upd_flg(true);
			ifR.sppl_itm_cd_upd_flg(true);
			ifR.sppl_itm_nm_upd_flg(true);
			ifR.maker_cd_upd_flg(true);
			ifR.bp_lot_no_upd_flg(true);
			ifR.bp_dlv_slip_no_upd_flg(true);
			ifR.bp_dlv_slip_d_no_upd_flg(true);
			ifR.ship_fr_valid_dt_upd_flg(true);
			ifR.purc_cont_qty_upd_flg(true);
			ifR.insp_cnt_rmrks_upd_flg(true);
			ifR.intr_rmrks_upd_flg(true);
			ifR.trd_rmrks_upd_flg(true);
			ifR.trd_d_rmrks_upd_flg(true);
			ifR.sub_char1_upd_flg(true);
			ifR.sub_char2_upd_flg(true);
			ifR.sub_char3_upd_flg(true);
			ifR.arr_pr_no_upd_flg(true);
			ifR.iv_no_upd_flg(true);

			ifR.setAttributes(r);
		}
		
		/**
		 * 各種明細NOから入荷予定を特定する<br>
		 * 入荷予定が複数ある場合、入荷実績受信IFに併せて入荷予定を消し込む
		 */
		protected void cmpleArrSchdNo(MCList<ArrActRecvIf_Chk01_DtlR> up, MCMessageList msgL) {

			crtIndex();
			// 入荷受信実績IFを分割した分を含め、すべての実績IFを格納
			MCList<ArrActRecvIf_Chk01_DtlR> wkUpL = MCList.create(ArrActRecvIf_Chk01_DtlR.class);

			for (ArrActRecvIf_Chk01_DtlR r : up) {
				ArrActIF_DtlR ifR = r.aaIf();

				if (!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					// データ更新区分が「新規」以外は対象外
					wkUpL.add(r);
					continue;
				}
				MCList<ArrActRecvIf_Chk01_DtlR> asL = MCList.create(ArrActRecvIf_Chk01_DtlR.class);
				for (String s : getArrSchdKeyPrms()) {
					Comparable<?> c = r.getValueNE(s);
					if (!isNull(c)) {
						// 各種キーで入荷予定を絞り込む
						asL = _asL.subList(_keyMap.get(s), c, false);
						if (!asL.isEmpty()) {
							asL = asL.subList(ArrActRecvIf_Chk01_DtlR.$abort_flg, false);
						}

						if (s == ArrActRecvIf_Chk01_DtlR.$po_d_no) {
							boolean spplIvFlg = false;
							if (!asL.isEmpty()) {
								spplIvFlg = asL.get(0).getBooleanNE("sppl_iv_flg");
							}
							if (spplIvFlg && !isNull(r.bp_dlv_slip_no())) {
								MCList<ArrActRecvIf_Chk01_DtlR> ivL;

								// インボイス取引対象の場合は、さらに業者納品書NOに設定されている受領インボイスNOで絞り込む
								// 受領インボイスNOで絞り込めない場合は、受領インボイスNOが設定されていない入荷予定を対象にする
								// ※受領インボイス登録前にＩＦデータを受信した場合に取り込みできるようにするため
								for (String val : new String[] {r.bp_dlv_slip_no(), null}) {
									ivL = asL.subList(ArrActRecvIf_Chk01_DtlR.$rcpt_iv_no, val);
									if (!ivL.isEmpty()) {
										asL = ivL;
										break;
									}
								}
							}
						}
						break;
					}
				}
				if (asL.isEmpty()) {
					wkUpL.add(r);		// chkValid でエラーとする
					continue;
				}

				// 入荷実績受信IFの基準単位数量を算出するため事前に品目を補完
				// ※品目は入荷予定の単位で変わらないため、先頭レコードの入荷予定を使用する
				MST_ARR_SCHD_R asR = getArrSchdR(asL.get(0).arr_schd_no());
				ifR.itm_cd(asR.itm_cd());
				ifR.itm_sub1(asR.itm_sub1());
				ifR.itm_sub2(asR.itm_sub2());
				ifR.itm_sub3(asR.itm_sub3());
				ifR.trd_unit_qty(r.aa().trd_unit_qty());
				ifR.trd_unit_cd(nvl(r.aa().trd_unit_cd(), asR.trd_unit_cd()));

				if (!existsItmUnit(ifR)) {
					r.err_flg(true);
					msgL.add(new MCMessage(r, null, MSLAL0651, r.data_no(), r.data_lno(),
							toDispItm(ifR.itm_cd(), ifR.itm_sub1(), ifR.itm_sub2(), ifR.itm_sub3()),
							r.trd_unit_cd()));
					continue;
				}

				ifR.base_unit_qty(getBaseUnitQty(ifR));
				ifR.base_unit_cd(asR.base_unit_cd());
				ifR.trd_ptn_typ(asR.getString("trd_ptn_typ"));

				// ひとまず先頭の入荷予定NOを消し込み対象として設定する
				r.arr_schd_no(asL.get(0).arr_schd_no());

				if (asL.size() == 1
					|| cannotSplitIfR(r, asL)) {
					for (ArrActRecvIf_Chk01_DtlR row : asL) {
						if (row.abort_flg()) {
							continue;
						}
						MCNumber schdQty = row.getNumber("base_unit_qty").subtract(row.getNumber("arr_qty"));
						if (schdQty.isPositive()) {
							// 同一ロット不許可品(ロットまたはサブロットを手動で発番)は複数の入荷予定に対して同一ロットを設定できないので複数相手に消し込みしない
							r.arr_schd_no(row.arr_schd_no());
							// 入荷数量を加算（入荷予定リストを消し込む）
							row.setNumber("arr_qty", row.getNumber("arr_qty").add(ifR.base_unit_qty()));
							row.abort_flg(r.abort_flg());
							break;
						}
					}
					wkUpL.add(r);
				}
				else {
					// 入荷数量
					MCNumber actQty = ifR.base_unit_qty();

					// 入荷予定日時の古い順、入荷予定NOの小さい順に消し込む
					// ただし、入荷実績受信IFのロット、サブロット、格付が設定されている場合、それらと一致する入荷予定を優先する
					sort(r, asL);

					MCList<ArrActRecvIf_Chk01_DtlR> tmpL = MCList.create(ArrActRecvIf_Chk01_DtlR.class);
					for (int i=0; i<asL.size(); i++) {
						if (actQty.isZero())	{
							break;
						}
						ArrActRecvIf_Chk01_DtlR row = asL.get(i);
						// 未入荷数量
						MCNumber schdQty = row.getNumber("base_unit_qty").subtract(row.getNumber("arr_qty"));
						if (row.abort_flg()) {
							continue;
						}
						if (!schdQty.isPositive() && i != asL.size() - 1) {
							// 消し込み済み
							continue;
						}

						ArrActRecvIf_Chk01_DtlR rr = i == 0 ? r : r.clone();
						ifR = rr.aaIf();
						tmpL.add(rr);

						if (i == asL.size()-1) {
							// 最終レコードは過不足関係なし
							ifR.base_unit_qty(actQty);
						}
						else {
							if (schdQty.lt(actQty)) {
								ifR.base_unit_qty(schdQty);
								// 残
								actQty = actQty.subtract(schdQty);
							}
							else {
								ifR.base_unit_qty(actQty);
								actQty = MCNumber.ZERO;
							}
							// 入荷数量を加算（入荷予定リストを消し込む）
							row.setNumber("arr_qty", row.getNumber("arr_qty").add(ifR.base_unit_qty()));
						}

						if (isNull(rr.aa().trd_unit_cd())) {
							ifR.trd_unit_cd(row.trd_unit_cd());
						}
						rr.aa().trd_unit_qty(getTrdUnitQty(ifR));
						rr.arr_schd_no(row.arr_schd_no());
						row.abort_flg(r.abort_flg());
					}
					if (tmpL.isEmpty()) {
						wkUpL.add(r);		// chkValid でエラーとする
					}
					else {
						wkUpL.addAll(tmpL);
					}
				}
			}
			up.setAll(wkUpL);
		}

		protected boolean existsItmUnit(ArrActIF_DtlR r) {
			if (!isNull(r.trd_unit_cd())) {
				MAVM_ITM_UNIT_R unitR = getItmUnitR(r.itm_cd(), r.itm_sub1(),
						r.itm_sub2(), r.itm_sub3(), r.trd_unit_cd());
				if (isNull(unitR) || unitR.isEmpty()) {
					return false;
				}
			}
			return true;
		}

		/**
		 * 複数の入荷予定を消し込むことができないインタフェースか
		 * 同一ロット不許可品、かつロット(サブロット)を自動で発番しない場合は、複数の入荷予定は消し込まないようにする
		 * ※自動で発番しない場合、ロットが重複することになるのでチェックでエラーになる
		 * 
		 * @return false：複数の入荷予定を消し込み可、true：複数の入荷予定は消し込み不可
		 */
		protected boolean cannotSplitIfR(ArrActRecvIf_Chk01_DtlR r, MCList<ArrActRecvIf_Chk01_DtlR> asL) {
			ArrActIF_DtlR ifR = r.aaIf();

			// 判断にはロット作成フラグが必要
			setLotInfo(r, ifR);

			if (!ifR.crt_lot_flg()) {
				return false;
			}

			sort(r, asL);
			MAM_ITM_R itmR = getItmR(ifR.itm_cd(), ifR.itm_sub1(), ifR.itm_sub2(), ifR.itm_sub3());
			if (MAC_LOT_MNG_TYP.isUNIQ(itmR.lot_mng_typ())) {
				if (MAC_LOT_NO_TYP.isMANUAL(itmR.lot_no_typ())
					|| MAC_LOT_NO_TYP.isAUTO_MANU(itmR.lot_no_typ()) && !isNull(ifR.lot_no())) {
					// 同一ロット不許可品、かつロットを自動で発番しない場合は不可
					return true;
				}
			}
			if (MAC_SUBLOT_MNG_TYP.isUNIQ(itmR.sublot_mng_typ())) {
				if (MAC_LOT_NO_TYP.isMANUAL(itmR.sublot_no_typ())
					|| MAC_LOT_NO_TYP.isAUTO_MANU(itmR.sublot_no_typ()) && !isNull(ifR.sublot_no())) {
					// 同一サブロット不許可品、かつサブロットを自動で発番しない場合は不可
					return true;
				}
			}

			return false;
		}

		/**
		 * 入荷予定を特定する対象のリストをソートする
		 */
		protected MCList<ArrActRecvIf_Chk01_DtlR> sort(
				ArrActRecvIf_Chk01_DtlR r, MCList<ArrActRecvIf_Chk01_DtlR> asL) {
			// asL：各種キーで絞り込み済みのリスト

			// 入荷予定日時の古い順、入荷予定NOの小さい順に消し込む
			// ただし、入荷実績受信IFのロット、サブロット、格付が設定されている場合、それらと一致する入荷予定を優先する
			asL.sort(ArrActRecvIf_Chk01_DtlR.$arr_schd_tm, ArrActRecvIf_Chk01_DtlR.$arr_schd_no);

			String[] cols = {
				ArrActRecvIf_Chk01_DtlR.$lot_no,
				ArrActRecvIf_Chk01_DtlR.$sublot_no,
				ArrActRecvIf_Chk01_DtlR.$gd_cd
			};
			ArrayList<String> arr = new ArrayList<>();
			for (String s : cols) {
				if (!isNull(r.getString(s))) {
					arr.add(s);
				}
			}
			if (!arr.isEmpty()) {
				String[] key = arr.toArray(new String[arr.size()]);
				MCList<ArrActRecvIf_Chk01_DtlR> lst = asL.createInstance();

				// ロット、サブロット、格付が一致する入荷予定を優先する	
				lst.setAll(asL.subList(key, r.toArray(key)));
				lst.sort(ArrActRecvIf_Chk01_DtlR.$arr_schd_tm, ArrActRecvIf_Chk01_DtlR.$arr_schd_no);

				lst.merge(asL, ArrActRecvIf_Chk01_DtlR.$arr_schd_no);
				asL.setAll(lst);
			}

			return asL;
		}

		/**
		 * 入荷予定を特定するインデックスを生成する
		 */
		protected void crtIndex() {
			_schdKey = _asL.createIndex(ArrActRecvIf_Chk01_DtlR.$arr_schd_no, MST_ARR_SCHD_R.$cmpl_flg);
			_prmsKey = _asL.createIndex(ArrActRecvIf_Chk01_DtlR.$prms_rcpt_d_no, MST_ARR_SCHD_R.$cmpl_flg);
			_dlvInstKey = _asL.createIndex(ArrActRecvIf_Chk01_DtlR.$dlv_inst_d_no, MST_ARR_SCHD_R.$cmpl_flg);
			_rcptIvKey = _asL.createIndex(ArrActRecvIf_Chk01_DtlR.$rcpt_iv_d_no, MST_ARR_SCHD_R.$cmpl_flg);
			_podKey = _asL.createIndex(ArrActRecvIf_Chk01_DtlR.$po_d_no, MST_ARR_SCHD_R.$cmpl_flg);
			_sretKey = _asL.createIndex(ArrActRecvIf_Chk01_DtlR.$sls_ret_schd_d_no, MST_ARR_SCHD_R.$cmpl_flg);
			_ivKey = _asL.createIndex(ArrActRecvIf_Chk01_DtlR.$iv_d_no, MST_ARR_SCHD_R.$cmpl_flg);
			_dlvSlipKey = _asL.createIndex(ArrActRecvIf_Chk01_DtlR.$dlv_slip_d_no, MST_ARR_SCHD_R.$cmpl_flg);

			_keyMap.put(ArrActRecvIf_Chk01_DtlR.$arr_schd_no, _schdKey);
			_keyMap.put(ArrActRecvIf_Chk01_DtlR.$prms_rcpt_d_no, _prmsKey);
			_keyMap.put(ArrActRecvIf_Chk01_DtlR.$dlv_inst_d_no, _dlvInstKey);
			_keyMap.put(ArrActRecvIf_Chk01_DtlR.$rcpt_iv_d_no, _rcptIvKey);
			_keyMap.put(ArrActRecvIf_Chk01_DtlR.$po_d_no, _podKey);
			_keyMap.put(ArrActRecvIf_Chk01_DtlR.$sls_ret_schd_d_no, _sretKey);
			_keyMap.put(ArrActRecvIf_Chk01_DtlR.$iv_d_no, _ivKey);
			_keyMap.put(ArrActRecvIf_Chk01_DtlR.$dlv_slip_d_no, _dlvSlipKey);

		}

		/**
		 * 消込対象の入荷予定を特定するためのキー。<BR>
		 * 配列の順番は、入荷予定の特定に使用する優先度の高い順。
		 */
		protected String[] getArrSchdKeyPrms() {
			return new String[] {
					ArrActRecvIf_Chk01_DtlR.$arr_schd_no,
					ArrActRecvIf_Chk01_DtlR.$rcpt_iv_d_no,
					ArrActRecvIf_Chk01_DtlR.$prms_rcpt_d_no,
					ArrActRecvIf_Chk01_DtlR.$dlv_inst_d_no,
					ArrActRecvIf_Chk01_DtlR.$po_d_no,
					ArrActRecvIf_Chk01_DtlR.$sls_ret_schd_d_no,
					ArrActRecvIf_Chk01_DtlR.$iv_d_no,
					ArrActRecvIf_Chk01_DtlR.$dlv_slip_d_no};
		}
		
		
		/**
		 * 外部入荷実績NOから入荷実績を特定する<br>
		 * 入荷実績が複数ある場合、入荷実績受信IFに併せて入荷実績を消し込む
		 */
		protected void cmpleArrActNo(MCList<ArrActRecvIf_Chk01_DtlR> up, MCMessageList msgL) {

			// 入荷受信実績IFを分割した分を含め、すべての実績IFを格納
			MCList<ArrActRecvIf_Chk01_DtlR> wkUpL = MCList.create(ArrActRecvIf_Chk01_DtlR.class);

			for (ArrActRecvIf_Chk01_DtlR r : up) {
				ArrActIF_DtlR ifR = r.aaIf();

				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					// データ更新区分が「新規」は対象外
					wkUpL.add(r);
					continue;
				}
				MCList<MST_ARR_ACT_R> aaL = getArrActL(r.ext_sys_cd(), r.ext_arr_act_no());
				if (aaL.isEmpty()) {
					wkUpL.add(r);		// chkValid でエラーとする
					continue;
				}

				// 入荷実績受信IFの基準単位数量を算出するため事前に品目を補完
				// ※品目は入荷実績の単位で変わらないため、先頭レコードの入荷実績を使用する
				MST_ARR_ACT_R aaR = aaL.get(0);
				ifR.itm_cd(aaR.itm_cd());
				ifR.itm_sub1(aaR.itm_sub1());
				ifR.itm_sub2(aaR.itm_sub2());
				ifR.itm_sub3(aaR.itm_sub3());
				ifR.trd_unit_qty(r.aa().trd_unit_qty());
				ifR.trd_unit_cd(nvl(r.aa().trd_unit_cd(), aaR.trd_unit_cd()));

				if (!existsItmUnit(ifR) && MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					r.err_flg(true);
					msgL.add(new MCMessage(r, null, MSLAL0651, r.data_no(), r.data_lno(),
							toDispItm(ifR.itm_cd(), ifR.itm_sub1(), ifR.itm_sub2(), ifR.itm_sub3()),
							r.trd_unit_cd()));
					continue;
				}

				ifR.base_unit_qty(getBaseUnitQty(ifR));
				ifR.base_unit_cd(aaR.base_unit_cd());

				// 入荷数量
				MCNumber actQty = ifR.base_unit_qty();

				aaL.sort(MST_ARR_ACT_R.$arr_act_no);
				for (int i=0; i<aaL.size(); i++) {
					aaR = aaL.get(i);

					ArrActRecvIf_Chk01_DtlR rr = i == 0 ? r : r.clone();
					ifR = rr.aaIf();
					wkUpL.add(rr);

					if (MAC_DATA_CRUD_TYP.isDEL(rr.data_crud_typ())) {
						// 削除
					}
					else if (actQty.isZero()) {
						// 前回から入荷数量が減り、既にある入荷実績を満たせない場合は削除する
						rr.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					}
					else if (i == aaL.size()-1) {
						// 最終レコードは過不足関係なし
						ifR.base_unit_qty(actQty);
					}
					else {
						if (aaR.base_unit_qty().lt(actQty)) {
							ifR.base_unit_qty(aaR.base_unit_qty());
							// 残
							actQty = actQty.subtract(aaR.base_unit_qty());
						}
						else {
							ifR.base_unit_qty(actQty);
							actQty = MCNumber.ZERO;
						}
					}

					if (isNull(rr.aa().trd_unit_cd())) {
						ifR.trd_unit_cd(aaR.trd_unit_cd());
					}
					rr.aa().trd_unit_qty(getTrdUnitQty(ifR));
					ifR.arr_act_no(aaR.arr_act_no());
				}
			}
			up.setAll(wkUpL);
		}

		/**
		 * 入荷予定の存在チェック、および上り電文のデータを補完する
		 */
		protected void cmpleAAIfByArrSchd(ArrActRecvIf_Chk01_DtlR r) {

			MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
			ArrActIF_DtlR ifR = r.aaIf();

			ifR.trd_cd(asR.getString("trd_cd"));
			ifR.trd_ptn_typ(asR.getString("trd_ptn_typ"));
			ifR.purc_act_io_no(asR.getString("purc_act_io_no"));
			ifR.wg_cd(asR.wg_cd());
			if (isNullOr(r.aa().itm_cd(), r.aa().itm_sub1(), r.aa().itm_sub2(), r.aa().itm_sub3())) {
				ifR.itm_cd(asR.itm_cd());
				ifR.itm_sub1(asR.itm_sub1());
				ifR.itm_sub2(asR.itm_sub2());
				ifR.itm_sub3(asR.itm_sub3());
			}
			else {
				ifR.itm_cd(r.aa().itm_cd());
				ifR.itm_sub1(r.aa().itm_sub1());
				ifR.itm_sub2(r.aa().itm_sub2());
				ifR.itm_sub3(r.aa().itm_sub3());
			}
			ifR.itm_nm(asR.itm_nm());
			ifR.rcpt_iv_itm_nm(asR.rcpt_iv_itm_nm());
			ifR.sundry_itm_flg(asR.sundry_itm_flg());
			ifR.purc_id_typ(asR.purc_id_typ());
			MAM_ITM_R itmR = getItmR(ifR.itm_cd(), ifR.itm_sub1(), ifR.itm_sub2(), ifR.itm_sub3());
			ifR.stk_mng_typ(itmR.stk_mng_typ());
			ifR.sno1(asR.sno1());
			ifR.sno2(asR.sno2());
			ifR.sno3(asR.sno3());
			ifR.sno4(asR.sno4());
			r.aa().lot_no(nvl(r.aa().lot_no(), asR.lot_no()));
			r.aa().sublot_no(nvl(r.aa().sublot_no(), asR.sublot_no()));
			ifR.lot_no(r.aa().lot_no());
			ifR.sublot_no(r.aa().sublot_no());
			ifR.ver_no(nvl(r.aa().ver_no(), asR.ver_no()));
			ifR.gd_cd(nvl(r.aa().gd_cd(), asR.gd_cd()));
			ifR.quality_typ(asR.quality_typ());
			ifR.trd_unit_cd	(nvl(r.aa().trd_unit_cd(), asR.trd_unit_cd()));
			ifR.sppl_itm_cd(asR.sppl_itm_cd());
			ifR.sppl_itm_nm(asR.sppl_itm_nm());
			ifR.cst_cd(asR.getString("cst_cd"));
			ifR.sret_fr_cd(asR.getString("sret_fr_cd"));
			ifR.sppl_cd(asR.getString("sppl_cd"));
			ifR.ret_loc_cd(asR.ret_loc_cd());
			ifR.ret_str_ln_cd(asR.ret_str_ln_cd());
			ifR.ret_gd_cd(asR.ret_gd_cd());
			ifR.maker_cd(asR.maker_cd());
			if (isNull(r.aa().arr_loc_cd())) {
				ifR.arr_loc_cd(asR.arr_loc_cd());
				ifR.str_ln_cd(asR.str_ln_cd());
			}
			else {
				ifR.arr_loc_cd(r.aa().arr_loc_cd());
				ifR.str_ln_cd(r.aa().arr_str_ln_cd());
			}
			ifR.base_unit_cd(asR.base_unit_cd());
			ifR.rsn_cd(asR.getString("rsn_cd"));
			ifR.bd_dpt_cd(asR.getString("bd_dpt_cd"));
			ifR.sync_flg(asR.sync_flg());
			ifR.arr_pr_no(asR.arr_pr_no());
			ifR.rcpt_iv_no(asR.rcpt_iv_no());
			ifR.iv_no(asR.iv_no());
			ifR.arr_ptn_typ(asR.arr_ptn_typ());

			// 呼出先で補完されるのでここでは補完しない
			//ifR.stk_arrv_bp_cd(asR.stk_arrv_bp_cd());
			//ifR.stk_insp_typ(asR.stk_insp_typ());
			//ifR.stk_id_typ(asR.stk_id_typ());
			//ifR.stk_bp_cd(asR.stk_bp_cd());
			//ifR.mfg_inst_no(asR.mfg_inst_no());
			//ifR.pre_outsrc_act_flg(asR.pre_outsrc_act_flg());
		}

		/**
		 * 入荷実績の存在チェック、および上り電文のデータを補完する
		 */
		protected void cmpleAAIfByArrAct(ArrActRecvIf_Chk01_DtlR r) {

			ArrActIF_DtlR ifR = r.aaIf();
			MST_ARR_ACT_R aaR = getArrActR(ifR.arr_act_no());
			MST_ARR_SCHD_R asR = getArrSchdR(aaR.arr_schd_no());

			ifR.arr_pr_no(asR.arr_pr_no());
			ifR.arr_schd_no(aaR.arr_schd_no());
			ifR.arr_act_no(aaR.arr_act_no());
			ifR.can_ac_dt(aaR.ac_dt());

			if (MAC_DATA_CRUD_TYP.isDEL(ifR.data_crud_typ())) {
				return;
			}

			ifR.trd_cd(aaR.trd_cd());
			ifR.trd_ptn_typ(aaR.trd_ptn_typ());
			ifR.purc_act_io_no(aaR.purc_act_io_no());
			ifR.wg_cd(aaR.wg_cd());
			if (isNullOr(r.aa().itm_cd(), r.aa().itm_sub1(), r.aa().itm_sub2(), r.aa().itm_sub3())) {
				ifR.itm_cd(aaR.itm_cd());
				ifR.itm_sub1(aaR.itm_sub1());
				ifR.itm_sub2(aaR.itm_sub2());
				ifR.itm_sub3(aaR.itm_sub3());
			}
			else {
				ifR.itm_cd(r.aa().itm_cd());
				ifR.itm_sub1(r.aa().itm_sub1());
				ifR.itm_sub2(r.aa().itm_sub2());
				ifR.itm_sub3(r.aa().itm_sub3());
			}
			ifR.itm_nm(aaR.itm_nm());
			ifR.rcpt_iv_itm_nm(aaR.rcpt_iv_itm_nm());
			ifR.sundry_itm_flg(aaR.sundry_itm_flg());
			ifR.purc_id_typ(aaR.purc_id_typ());
			ifR.stk_mng_typ(aaR.stk_mng_typ());
			ifR.sno1(aaR.sno1());
			ifR.sno2(aaR.sno2());
			ifR.sno3(aaR.sno3());
			ifR.sno4(aaR.sno4());
			ifR.lot_no(nvl(nullValToNull(r.aa().lot_no()), aaR.lot_no()));
			ifR.sublot_no(nvl(nullValToNull(r.aa().sublot_no()), aaR.sublot_no()));
			ifR.ver_no(nvl(r.aa().ver_no(), aaR.ver_no()));
			ifR.gd_cd(nvl(r.aa().gd_cd(), aaR.gd_cd()));
			ifR.quality_typ(aaR.quality_typ());
			ifR.trd_unit_cd	(nvl(r.aa().trd_unit_cd(), aaR.trd_unit_cd()));
			ifR.sppl_itm_cd(aaR.sppl_itm_cd());
			ifR.sppl_itm_nm(aaR.sppl_itm_nm());
			ifR.cst_cd(aaR.cst_cd());
			ifR.sret_fr_cd(aaR.sret_fr_cd());
			ifR.sppl_cd(aaR.sppl_cd());
			ifR.ret_loc_cd(aaR.ret_loc_cd());
			ifR.ret_str_ln_cd(aaR.ret_str_ln_cd());
			ifR.ret_gd_cd(aaR.ret_gd_cd());
			ifR.maker_cd(aaR.maker_cd());
			if (isNull(r.aa().arr_loc_cd())) {
				ifR.arr_loc_cd(aaR.arr_loc_cd());
				ifR.str_ln_cd(aaR.str_ln_cd());
			}
			else {
				ifR.arr_loc_cd(r.aa().arr_loc_cd());
				ifR.str_ln_cd(r.aa().arr_str_ln_cd());
			}
			ifR.base_unit_cd(aaR.base_unit_cd());
			ifR.rsn_cd(aaR.rsn_cd());
			ifR.bd_dpt_cd(aaR.bd_dpt_cd());
			ifR.sync_flg(aaR.sync_flg());

			ifR.rcpt_iv_no(asR.rcpt_iv_no());
			ifR.iv_no(asR.iv_no());
			ifR.arr_ptn_typ(asR.arr_ptn_typ());

			// 呼出先で補完されるのでここでは補完しない
			//ifR.stk_arrv_bp_cd(aaR.stk_arrv_bp_cd());
			//ifR.stk_insp_typ(aaR.stk_insp_typ());
			//ifR.stk_id_typ(aaR.stk_id_typ());
			//ifR.stk_bp_cd(aaR.stk_bp_cd());
			//ifR.mfg_inst_no(aaR.mfg_inst_no());
			//ifR.pre_outsrc_act_flg(aaR.pre_outsrc_act_flg());
		}

		/**
		 * 基準単位数量<br>
		 * ※事前に品目が補完されていること
		 */
		protected MCNumber getBaseUnitQty(ArrActIF_DtlR ifR) {
			MAM_ITM_R itmR = getItmR(ifR.itm_cd(), ifR.itm_sub1(), ifR.itm_sub2(), ifR.itm_sub3());
			MAVM_ITM_UNIT_R unitR = getItmUnitR(
				ifR.itm_cd(), ifR.itm_sub1(), ifR.itm_sub2(), ifR.itm_sub3(), ifR.trd_unit_cd());
			return
				convToBaseUnit(
					ifR.trd_unit_qty(), unitR.conv_base_qty() , unitR.conv_qty(),
					itmR.dec_place(), itmR.rnd_typ());
		}

		/**
		 * 取引単位数量
		 * ※事前に品目、基準単位数量が補完されていること
		 */
		protected MCNumber getTrdUnitQty(ArrActIF_DtlR ifR) {
			return getTrdUnitQty(ifR, false);
		}
		protected MCNumber getTrdUnitQty(ArrActIF_DtlR ifR, boolean remFlg) {
			MAVM_ITM_UNIT_R unitR = getItmUnitR(
					ifR.itm_cd(), ifR.itm_sub1(), ifR.itm_sub2(), ifR.itm_sub3(), ifR.trd_unit_cd());
			MCNumber qty =
				rvrsBaseUnitConv(
					ifR.base_unit_qty(), unitR.conv_base_qty(), unitR.conv_qty(),
					unitR.dec_place(), unitR.rnd_typ(), true);
			if (remFlg) {
				// 結果がNULLの場合でもそのまま返す
				return qty;
			}
			else {
				return
					isNull(qty) ? ifR.base_unit_qty() : qty;
			}
		}

		/**
		 * 取引単位ＣＤ
		 * ※事前に品目、基準単位数量が補完されていること
		 */
		protected String getTrdUnitCd(ArrActIF_DtlR ifR) {
			return
				isNull(getTrdUnitQty(ifR, true)) ? ifR.base_unit_cd() : ifR.trd_unit_cd();
		}

		protected boolean isPurcTrd(ArrActIF_DtlR ifR) {
			return MAC_TRD_PTN_TYP.isPURC(ifR.trd_ptn_typ()) || 
					MAC_TRD_PTN_TYP.isPURC_XPNS(ifR.trd_ptn_typ()) || 
					MAC_TRD_PTN_TYP.isARR(ifR.trd_ptn_typ());
		}
		
		protected void setLotInfo(ArrActRecvIf_Chk01_DtlR r, ArrActIF_DtlR ifR) {
			if (isPurcTrd(ifR)) {
				setLotSubLot(r);
			}
			else {
				ifR.crt_lot_flg(false);
			}
		}

		/**
		 * 同一ロットフラグ<br>
		 * ※事前に品目、取引パタン区分、ロット作成フラグが補完されていること
		 */
		protected boolean getSameLotFlg(ArrActIF_DtlR ifR) {
			MAM_ITM_R itmR = getItmR(ifR.itm_cd(), ifR.itm_sub1(), ifR.itm_sub2(), ifR.itm_sub3());
			return
				(MAC_TRD_PTN_TYP.isPURC(ifR.trd_ptn_typ())
					 || MAC_TRD_PTN_TYP.isPURC_XPNS(ifR.trd_ptn_typ()))
					&& MAC_LOT_MNG_TYP.isUNIQ(itmR.lot_mng_typ())
					&& MAC_LOT_MNG_TYP.isUNIQ(itmR.sublot_mng_typ())
					&& ifR.crt_lot_flg();
		}

		/**
		 * 打切フラグを設定する
		 */
		protected void setAbortFlg(MCList<ArrActRecvIf_Chk01_DtlR> up) {
			// 打ち切りは入荷予定単位
			for (MCList<ArrActRecvIf_Chk01_DtlR> gl : up.groupList(ArrActRecvIf_Chk01_DtlR.$arr_schd_no)) {
				for (ArrActRecvIf_Chk01_DtlR r : gl) {
					if (r.abort_flg()) {
						gl.forEach(rr -> rr.abort_flg(true));
						break;
					}
				}
			}
		}

		/**
		 * チェック・補完に必要なデータをキャッシュする
		 */
		protected void doCache(MCList<ArrActRecvIf_Chk01_DtlR> up) {
			initExtSysL(up);
			initArrActL(up);
			initLot(up);

			MCList<ArrActRecvIf_Chk01_DtlR> l = MCList.create(ArrActRecvIf_Chk01_DtlR.class);
			l.setAll(_asL);
			up.forEach(r -> {
				if (!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					MST_ARR_ACT_R aaR = getArrActR(r.ext_sys_cd(), r.ext_arr_act_no());
					if (!isNull(aaR)) {
						l.add().arr_schd_no(aaR.arr_schd_no());
					}
				}
			});
			initArrSchdL(l);
			l.forEach(r -> {
				MST_ARR_SCHD_R asR = getArrSchdR(r.arr_schd_no());
				if (!isNull(asR)) {
					r.aa().itm_cd(asR.itm_cd());
					r.aa().itm_sub1(asR.itm_sub1());
					r.aa().itm_sub2(asR.itm_sub2());
					r.aa().itm_sub3(asR.itm_sub3());
					r.aa().trd_unit_cd(asR.trd_unit_cd());
				}
			});
			
			initItmL(l);
			initItmUnitL(l);
		}

		/**
		 * 入荷予定キャッシュ
		 */
		protected ArrSchdCache _arrSchdL;
		protected void initArrSchdL(MCList<ArrActRecvIf_Chk01_DtlR> up) {
			_arrSchdL = new ArrSchdCache(up);
		}
		protected MST_ARR_SCHD_R getArrSchdR(String arrSchdNo) {
			return _arrSchdL.get(arrSchdNo);
		}
		public class ArrSchdCache {
			protected MCList<MST_ARR_SCHD_R> _dbc;
			protected MST_ARR_SCHD_R _dbc_t;
			protected MCQueryApiBuilder dbc_bldr;
			protected MCIndexKey _idx;
			protected ArrSchdCache(MCList<ArrActRecvIf_Chk01_DtlR> up) {
				init(up);
			}
			protected void init(MCList<ArrActRecvIf_Chk01_DtlR> up) {
				
				MSW_ARR_SCHD_KEY_R w = MSW_ARR_SCHD_KEY_R.create("W");
				MST_ARR_PR_R t2 = MST_ARR_PR_R.create("T2");
				MCTempView t3 = createTempView("T3");
				MSW_ARR_SCHD_KEY_R S1W1 = MSW_ARR_SCHD_KEY_R.create("W1");
				MST_ARR_SCHD_R S1W2 = MST_ARR_SCHD_R.create("W2");
				MST_PURC_SCHD_R S1W3 = MST_PURC_SCHD_R.create("W3");
				MST_PURC_ACT_D_R S1W4 = MST_PURC_ACT_D_R.create("W4");
				MST_PURC_ACT_IO_R S1W5 = MST_PURC_ACT_IO_R.create("W5");
				MST_PURC_ACT_R S1W6 = MST_PURC_ACT_R.create("W6");
				
				_dbc = MCList.create(MST_ARR_SCHD_R.class);
				_dbc_t = MST_ARR_SCHD_R.create("T");
				dbc_bldr = MCQueryApiBuilder.create(_dbc_t);
				up.forEach(r -> _dbc.add().arr_schd_no(r.aa().arr_schd_no()));
				dbWkDelete("MSLAL6040_MSW_ARR_SCHD_D01", dbc_bldr.getBaseDbc());
				dbWkInsert("MSLAL6040_MSW_ARR_SCHD_I01", _dbc.groupBy(MST_ARR_SCHD_R.$arr_schd_no), dbc_bldr.getBaseDbc());
				
				_dbc.init();
				dbc_bldr = MCQueryApiBuilder.create(_dbc_t);
				_dbc.addStringColumn("trd_cd");
				_dbc.addStringColumn("trd_ptn_typ");
				_dbc.addStringColumn("cst_cd");
				_dbc.addStringColumn("sret_fr_cd");
				_dbc.addStringColumn("sppl_cd");
				_dbc.addStringColumn("rsn_cd");
				_dbc.addStringColumn("bd_dpt_cd");
				_dbc.addStringColumn("purc_act_io_no");
				dbc_bldr.removeSelect(MST_ARR_SCHD_R.$arr_loc_cd,
						MST_ARR_SCHD_R.$str_ln_cd, MST_ARR_SCHD_R.$trd_unit_cd,
						MST_ARR_SCHD_R.$trd_unit_qty);
				dbc_bldr.addSelect(t2.trd_cd, t2.trd_ptn_typ, t2.cst_cd, t2.sret_fr_cd,
						t2.sppl_cd, t2.rsn_cd, t2.bd_dpt_cd, t3.pr("purc_act_io_no"),
						nvl2(t3.pr("purc_act_io_no"), t3.pr("in_to_loc_cd"),
								_dbc_t.arr_loc_cd).as("arr_loc_cd"),
						nvl2(t3.pr("purc_act_io_no"), t3.pr("str_ln_cd"),
								_dbc_t.str_ln_cd).as("str_ln_cd"),
						nvl2(t3.pr("purc_act_io_no"), t3.pr("trd_unit_cd"),
								_dbc_t.trd_unit_cd).as("trd_unit_cd"),
						nvl2(t3.pr("purc_act_io_no"), t3.pr("trd_unit_qty"),
								_dbc_t.trd_unit_qty).as("trd_unit_qty"));
				dbc_bldr.addInnerJoin(w, bracket( w.arr_schd_no.eq(_dbc_t.arr_schd_no)));
				dbc_bldr.addInnerJoin(t2, bracket( t2.arr_pr_no.eq(_dbc_t.arr_pr_no)));
				dbc_bldr.addLeftOuterJoin(
						subQuery()
								.select(S1W1.arr_schd_no, S1W5.purc_act_io_no,
										S1W5.in_to_loc_cd, S1W5.str_ln_cd,
										S1W5.trd_unit_cd, S1W5.trd_unit_qty)
								.from(S1W1.innerJoin(S1W2).on(bracket(S1W2.arr_schd_no
										.eq(S1W1.arr_schd_no)
										.and(S1W2.arr_ptn_typ.eq(value(
												MSC_ARR_PTN_TYP.N_YET_ARR.value())))))
										.innerJoin(S1W3)
										.on(bracket(
												S1W3.arr_schd_no.eq(S1W2.arr_schd_no)))
										.innerJoin(S1W4)
										.on(bracket(
												S1W4.purc_schd_no.eq(S1W3.purc_schd_no)))
										.innerJoin(S1W5)
										.on(bracket(
												S1W5.purc_act_d_no.eq(S1W4.purc_act_d_no)
														.and(S1W5.purc_act_d_seq.eq(
																S1W4.purc_act_d_seq))))
										.innerJoin(S1W6)
										.on(bracket(S1W6.purc_act_no.eq(S1W4.purc_act_no)
												.and(S1W6.purc_act_seq
														.eq(S1W4.purc_act_seq))
												.and(S1W6.slip_sts_typ.eq(value(
														MAC_SLIP_STS_TYP.CRT.value()))))))
								.view(t3),
						bracket(t3.pr(S1W1.arr_schd_no).eq(_dbc_t.arr_schd_no)));
				dbc_bldr.setOrderByAsc(_dbc_t.arr_schd_no);
				dbc_bldr.setLockTable(t2.arr_pr_no);
				dbSelectForUpdate("MSLAL6040_MST_ARR_SCHD_S01", _dbc, dbc_bldr);
				_idx = _dbc.createIndex(MST_ARR_SCHD_R.$arr_schd_no);

				dbWkDelete("MSLAL6040_MSW_ARR_SCHD_D02", dbc_bldr.getBaseDbc());
			}
			protected MST_ARR_SCHD_R get(String arrSchdNo) {
				return _dbc.getFirst(_idx, arrSchdNo);
			}
		}

		/**
		 * 入荷実績キャッシュ
		 */
		protected ArrActCache _arrActL;
		protected void initArrActL(MCList<ArrActRecvIf_Chk01_DtlR> up) {
			_arrActL = new ArrActCache(up);
		}
		protected MST_ARR_ACT_R getArrActR(String arrActNo) {
			return _arrActL.get(arrActNo);
		}
		protected MST_ARR_ACT_R getArrActR(String extSysCd, String extArrActNo) {
			return _arrActL.get(extSysCd, extArrActNo);
		}
		protected MCList<MST_ARR_ACT_R> getArrActL(String extSysCd, String extArrActNo) {
			return _arrActL.subList(extSysCd, extArrActNo);
		}
		public class ArrActCache {
			protected MCList<MST_ARR_ACT_R> _dbc;
			protected MST_ARR_ACT_R _dbc_t;
			protected MCQueryApiBuilder dbc_bldr;
			protected MCIndexKey _idx1, _idx2;
			protected ArrActCache(MCList<ArrActRecvIf_Chk01_DtlR> up) {
				init(up);
			}
			protected void init(MCList<ArrActRecvIf_Chk01_DtlR> up) {
				_dbc = MCList.create(MST_ARR_ACT_R.class);
				_dbc_t = MST_ARR_ACT_R.create("T");
				dbc_bldr = MCQueryApiBuilder.create(_dbc_t);
				if (!up.isEmpty()) {
					dbc_bldr.setWhere(_dbc_t.ext_sys_cd.eq(bind("ext_sys_cd")));
					dbc_bldr.addWhereWithAnd(_dbc_t.ext_arr_act_no.eq(bind("ext_arr_act_no")));
					dbc_bldr.addWhereWithAnd(_dbc_t.can_flg.eq(value(false)));
					dbc_bldr.setOrderByAsc(_dbc_t.arr_act_no);
					dbc_bldr.setLockTable(_dbc_t.arr_act_no);
					dbSelectForUpdate("MSLAL6040_MST_ARR_ACT_S01", _dbc, dbc_bldr, up.groupBy( ArrActRecvIf_Chk01_DtlR.$ext_sys_cd, ArrActRecvIf_Chk01_DtlR.$ext_arr_act_no, ArrActRecvIf_Chk01_DtlR.$arr_lg_grp_cd));
				}
				_idx1 = _dbc.createIndex(MST_ARR_ACT_R.$arr_act_no);
				_idx2 = _dbc.createIndex(
					MST_ARR_ACT_R.$ext_sys_cd, MST_ARR_ACT_R.$ext_arr_act_no, MST_ARR_ACT_R.$lg_grp_cd);
			}
			protected MST_ARR_ACT_R get(String arrActNo) {
				return _dbc.getFirst(_idx1, arrActNo);
			}
			protected MST_ARR_ACT_R get(String extSysCd, String extArrActNo) {
				return _dbc.getFirst(_idx2, extSysCd, extArrActNo);
			}
			protected MCList<MST_ARR_ACT_R> subList(String extSysCd, String extArrActNo) {
				return _dbc.subList(_idx2, extSysCd, extArrActNo);
			}
		}

		/**
		 * 品目マスタキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache;
		protected void initItmL(MCList<ArrActRecvIf_Chk01_DtlR> up) {
			MCList<MAM_ITM_R> dbc = MCList.create(MAM_ITM_R.class);
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			up.forEach(r -> {
				MAM_ITM_R dbcR = dbc.add();
				dbcR.itm_cd(r.aa().itm_cd());
				dbcR.itm_sub1(r.aa().itm_sub1());
				dbcR.itm_sub2(r.aa().itm_sub2());
				dbcR.itm_sub3(r.aa().itm_sub3());
			});
			_itmCache = new FXUCL_MCDbcCache<>(
					dbc_bldr, dbc,
				MAM_ITM_R.$itm_cd,
				MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
		}
		protected MAM_ITM_R getItmR(
				String itmCd, String itmSub1, String itmSub2, String itmSub3) {
			if (_itmCache == null) {
				MAM_ITM_R t = MAM_ITM_R.create("T");
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
				_itmCache = new FXUCL_MCDbcCache<>(dbc_bldr);
			}
			return _itmCache.get(itmCd, itmSub1, itmSub2, itmSub3);
		}

		/**
		 * 品目単位マスタキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _itmUnitCache;
		protected void initItmUnitL(MCList<ArrActRecvIf_Chk01_DtlR> up) {
			MCList<MAVM_ITM_UNIT_R> dbc = MCList.create(MAVM_ITM_UNIT_R.class);
			MAVM_ITM_UNIT_R t = MAVM_ITM_UNIT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			up.forEach(r -> {
				MAVM_ITM_UNIT_R dbcR = dbc.add();
				dbcR.itm_cd(r.aa().itm_cd());
				dbcR.itm_sub1(r.aa().itm_sub1());
				dbcR.itm_sub2(r.aa().itm_sub2());
				dbcR.itm_sub3(r.aa().itm_sub3());
				dbcR.unit_cd(r.aa().trd_unit_cd());

				MAM_ITM_R itmR = getItmR(dbcR.itm_cd(), dbcR.itm_sub1(), dbcR.itm_sub2(), dbcR.itm_sub3());
				if (!isNull(itmR) && !isSame(itmR.unit_cd(), dbcR.unit_cd())) {
					dbcR = dbcR.clone();
					dbcR.unit_cd(itmR.unit_cd());
					dbc.add(dbcR);
				}
			});
			_itmUnitCache = new FXUCL_MCDbcCache<>(
				dbc_bldr, dbc,
				MAVM_ITM_UNIT_R.$itm_cd,
				MAVM_ITM_UNIT_R.$itm_sub1, MAVM_ITM_UNIT_R.$itm_sub2, MAVM_ITM_UNIT_R.$itm_sub3,
				MAVM_ITM_UNIT_R.$unit_cd);
		}
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
		 * 外部システムマスタキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_EXT_SYS_R> _extSysCache;
		protected void initExtSysL(MCList<ArrActRecvIf_Chk01_DtlR> up) {
			MCList<MAM_EXT_SYS_R> dbc = MCList.create(MAM_EXT_SYS_R.class);
			MAM_EXT_SYS_R t = MAM_EXT_SYS_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			up.forEach(r -> {
				dbc.add().ext_sys_cd(r.aa().ext_sys_cd());
			});
			_extSysCache = new FXUCL_MCDbcCache<>(
				dbc_bldr, dbc,
				MAM_EXT_SYS_R.$ext_sys_cd);
		}
		protected MAM_EXT_SYS_R getExtSysR(String extSysCd) {
			if (_extSysCache == null) {
				MAM_EXT_SYS_R t = MAM_EXT_SYS_R.create("T");
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
				_extSysCache = new FXUCL_MCDbcCache<>(dbc_bldr);
			}
			return _extSysCache.get(extSysCd);
		}
		
		/**
		 * ロット情報キャッシュ
		 */
		protected MCList<MST_LOT_R> _lotL;
		protected MST_LOT_R _lotL_t;
		protected MCQueryApiBuilder lotL_bldr;
		
		protected void initLot(MCList<ArrActRecvIf_Chk01_DtlR> upL) {
			_lotL = MCList.create(MST_LOT_R.class);
			_lotL_t = MST_LOT_R.create("T");
			lotL_bldr = MCQueryApiBuilder.create(_lotL_t);
			
			MCList<MSVT_ARR_ACT_RECV_IF_R> ifL = upL.innerRowList("aa", MSVT_ARR_ACT_RECV_IF_R.class);
			MCList<MSVT_ARR_ACT_RECV_IF_R> gbL = ifL.groupBy(MSVT_ARR_ACT_RECV_IF_R.$itm_cd,
					MSVT_ARR_ACT_RECV_IF_R.$lot_no, MSVT_ARR_ACT_RECV_IF_R.$itm_sub1, MSVT_ARR_ACT_RECV_IF_R.$itm_sub2,
					MSVT_ARR_ACT_RECV_IF_R.$itm_sub3);

			MCList<MST_LOT_R> wkL = MCList.create(MST_LOT_R.class);
			MST_LOT_R wkL_t = MST_LOT_R.create("T");
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(wkL_t);
			for (MSVT_ARR_ACT_RECV_IF_R r : gbL) {
				if (isNullOr(r.itm_cd(), r.lot_no(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3())) {
					continue;
				}
				MAM_ITM_R itmR = getItmR(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				if (MAC_LOT_MNG_TYP.req_lot(itmR.lot_mng_typ())) {
					MST_LOT_R wkR = MST_LOT_R.create();
					wkR.itm_cd(r.itm_cd());
					wkR.itm_sub1(r.itm_sub1());
					wkR.itm_sub2(r.itm_sub2());
					wkR.itm_sub3(r.itm_sub3());
					wkR.lot_no(r.lot_no());
					wkR.sublot_no(MAC_STR.NULL_VAL.value());
					wkL.add(wkR);
				}
			}
			if (!wkL.isEmpty()) {
				dbWkDelete("MSLAL6040_MSW_LOT_D01", wkL_bldr.getBaseDbc());
				dbWkInsert("MSLAL6040_MSW_LOT_I01", wkL, wkL_bldr.getBaseDbc());

				MSW_LOT_KEY_R t2 = MSW_LOT_KEY_R.create("T2");

				lotL_bldr.setSelect(_lotL_t.itm_cd);
				lotL_bldr.addSelect(_lotL_t.itm_sub1);
				lotL_bldr.addSelect(_lotL_t.itm_sub2);
				lotL_bldr.addSelect(_lotL_t.itm_sub3);
				lotL_bldr.addSelect(_lotL_t.lot_no);
				lotL_bldr.addSelect(_lotL_t.sublot_no);

				lotL_bldr.addInnerJoin(t2,
						bracket(_lotL_t.itm_cd.eq(t2.itm_cd)
								.and(_lotL_t.itm_sub1.eq(t2.itm_sub1))
								.and(_lotL_t.itm_sub2.eq(t2.itm_sub2))
								.and(_lotL_t.itm_sub3.eq(t2.itm_sub3))
								.and(_lotL_t.lot_no.eq(t2.lot_no))));
				lotL_bldr.setDistinct();
				dbSelect("MSLAL6040_MST_LOT_S01", _lotL, lotL_bldr);
				
				MST_LOT_R wkDel = MST_LOT_R.create("T");
				MCQueryApiBuilder wkDel_bldr = MCQueryApiBuilder.create(wkDel);
				dbWkDelete("MSLAL6040_MSW_LOT_D02", wkDel_bldr.getBaseDbc());
			}
			_lotKey = _lotL.createIndex(MST_LOT_R.$itm_cd, MST_LOT_R.$itm_sub1, MST_LOT_R.$itm_sub2,
					MST_LOT_R.$itm_sub3, MST_LOT_R.$lot_no, MST_LOT_R.$sublot_no);
		}

		protected FXUCL_MCDbcCache<MST_LOT_R> _lotDBCCache;

		protected void initLotDBCL() {
			MST_LOT_R t = MST_LOT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			_lotDBCCache = new FXUCL_MCDbcCache<>(dbc_bldr);
		}

		protected MST_LOT_R getLotDBCR(String itmCd, String itmSub1, String itmSub2, String itmSub3, String lotNo,
				String subLotNo) {
			if (_lotDBCCache == null) {
				initLotDBCL();
			}
			return _lotDBCCache.get(itmCd, itmSub1, itmSub2, itmSub3, lotNo, subLotNo);
		}

		protected boolean existsLot(ArrActIF_DtlR ifR) {

			MST_LOT_R lotR = _lotL.getFirst(_lotKey, ifR.itm_cd(), ifR.itm_sub1(), ifR.itm_sub2(), ifR.itm_sub3(), ifR.lot_no(), ifR.sublot_no());
			if (isNull(lotR)) {
				lotR = getLotDBCR(ifR.itm_cd(), ifR.itm_sub1(), ifR.itm_sub2(), ifR.itm_sub3(), ifR.lot_no(), nvl(ifR.sublot_no(), MAC_STR.NULL_VAL.value()));
			}
			return !isNull(lotR) && !lotR.isEmpty();
		}
		
		protected boolean existsLot(ArrActIF_DtlR ifR, MAM_ITM_R itmR) {

			ArrActIF_DtlR r = ifR.clone();
			if(MAC_SUBLOT_MNG_TYP.isSTK(itmR.sublot_mng_typ())) {
				r.sublot_no(MAC_STR.NULL_VAL.value());
			}
			return existsLot(r);
		}

		protected void setLotSubLot(ArrActRecvIf_Chk01_DtlR r) {
			if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				return;
			}
			MAM_ITM_R itmR = getItmR(r.aa().itm_cd(), r.aa().itm_sub1(), r.aa().itm_sub2(), r.aa().itm_sub3());			
			if (MAC_LOT_MNG_TYP.isNOT_MNG(itmR.lot_mng_typ()) && MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmR.sublot_mng_typ())) {
				return;
			}
				
			ArrActIF_DtlR ifR = r.aaIf();
			MST_ARR_ACT_R aaR = getArrActR(ifR.arr_act_no());
			boolean existsLot = false;
			r.aa().lot_no(nullValToNull(r.aa().lot_no()));
			r.aa().sublot_no(nullValToNull(r.aa().sublot_no()));

			if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
				// サブロットＮＯ
				if (!MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmR.sublot_mng_typ())) {
					ifR.sublot_no(r.sublot_no());
				}

				// ロットＮＯ、ロット作成ＦＬＧ
				if (!MAC_LOT_MNG_TYP.isNOT_MNG(itmR.lot_mng_typ())) {
					ifR.lot_no(r.lot_no());
				}
				existsLot = existsLot(ifR, itmR);
				if (existsLot) {
					ifR.crt_lot_flg(false);
				}
				else {
					ifR.crt_lot_flg(true);
				}
			}
			else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
				// サブロットＮＯ
				if (!MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmR.sublot_mng_typ())) {
					if (isNull(r.sublot_no())) {
						ifR.sublot_no(aaR.sublot_no());
					}
					else {
						ifR.sublot_no(r.sublot_no());
					}
				}

				// ロットＮＯ、ロット作成ＦＬＧ
				if (!MAC_LOT_MNG_TYP.isNOT_MNG(itmR.lot_mng_typ())) {
					if (isNull(r.lot_no())) {
						ifR.lot_no(aaR.lot_no());
						ifR.crt_lot_flg(false);
					}
					else {
						ifR.lot_no(r.lot_no());
						existsLot = existsLot(ifR, itmR);
						if (existsLot) {
							ifR.crt_lot_flg(false);
						}
						else {
							ifR.crt_lot_flg(true);
						}
					}
				}
			}
		}
	}
	

	/**
	 * 処理結果区分にエラーを設定
	 * 
	 * @param recvR
	 */
	protected void setErrSts(MSVT_ARR_ACT_RECV_IF_R recvR) {

		recvR.exe_sts_typ(MAC_EXE_STS_TYP.ERR.value());
		setErrSet(recvR);
	}

	protected void setErrSet(MSVT_ARR_ACT_RECV_IF_R recvR) {

		List<String> l = createErrSetKey(recvR);
		if (!object(CLAZZ)._errSet.contains(l)) {
			object(CLAZZ)._errSet.add(l);
		}

		if (!object(CLAZZ)._stopErrSet.contains(recvR.ext_sys_cd())) {
			object(CLAZZ)._stopErrSet.add(recvR.ext_sys_cd());
		}
	}

	protected List<String> createErrSetKey(MSVT_ARR_ACT_RECV_IF_R recvR) {

		List<String> l = new ArrayList<String>();
		if (!isNull(recvR)) {
			l.add(recvR.ext_sys_cd());
			l.add(recvR.arr_lg_grp_cd());
			l.add(recvR.ext_arr_act_no());
		}
		return l;
	}

	/**
	 * 各種明細NOから入荷予定NOおよび各種ヘッダNOを取得する
	 */
	protected MCList<ArrActRecvIf_Chk01_DtlR> getArrSchdList(MCList<MSVT_ARR_ACT_RECV_IF_R> up) {

		Map<String, MCList<MCDBContainer>> recvMap = new LinkedHashMap<>();
		recvMap.put(MSVT_ARR_ACT_RECV_IF_R.$arr_schd_no, MCList.create(MST_ARR_SCHD_R.create("T")));
		recvMap.put(MSVT_ARR_ACT_RECV_IF_R.$rcpt_iv_d_no, MCList.create(MST_RCPT_IV_D_R.create("T")));
		recvMap.put(MSVT_ARR_ACT_RECV_IF_R.$prms_rcpt_d_no, MCList.create(MST_PRMS_RCPT_D_R.create("T")));
		recvMap.put(MSVT_ARR_ACT_RECV_IF_R.$dlv_inst_d_no, MCList.create(MST_DLV_INST_D_R.create("T")));
		recvMap.put(MSVT_ARR_ACT_RECV_IF_R.$po_d_no, MCList.create(MST_PO_D_R.create("T")));
		recvMap.put(MSVT_ARR_ACT_RECV_IF_R.$sls_ret_schd_d_no, MCList.create(MST_SLS_RET_SCHD_D_R.create("T")));
		recvMap.put(MSVT_ARR_ACT_RECV_IF_R.$iv_d_no, MCList.create(MST_IV_D_R.create("T")));
		recvMap.put(MSVT_ARR_ACT_RECV_IF_R.$dlv_slip_d_no, MCList.create(MST_DLV_SLIP_D_R.create("T")));

		// 入荷予定を特定するNOを決める（優先順位はマップに追加した順）
		for (MSVT_ARR_ACT_RECV_IF_R r : up) {
			for (Entry<String, MCList<MCDBContainer>> entry : recvMap.entrySet()) {
				String key = entry.getKey();
				if (!isNull(r.getString(key))) {
					MCRow dbcR = entry.getValue().add();
					dbcR.setString(key, r.getString(key));
					break;
				}
			}
		}
		
		// 入荷予定を取得するため各NOをワークに追加
		for (Entry<String, MCList<MCDBContainer>> entry : recvMap.entrySet()) {
			MCList<MCDBContainer> dbc = entry.getValue();
			MCDBContainer dbc_t = dbc.createRow();
			dbc_t.setAlias("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(dbc_t);
			if (!dbc.isEmpty()) {
				dbWkDelete(createSqlId(LOGIC_ID, dbc_bldr.getBaseDbc().getPkWorkDbc(), "D51"), dbc_bldr.getBaseDbc());
				dbWkInsert(createSqlId(LOGIC_ID, dbc_bldr.getBaseDbc().getPkWorkDbc(), "I51"),
						dbc.groupBy(entry.getKey()), dbc_bldr.getBaseDbc());
			}
		}

		MCList<ArrActRecvIf_Chk01_DtlR> asL = MCList.create(ArrActRecvIf_Chk01_DtlR.class);
		asL.addBooleanColumn("sppl_iv_flg");
		asL.addBooleanColumn(MST_ARR_SCHD_R.$cmpl_flg);
		executeQuery(asL, MSLAL6040_MST_ARR_SCHD_S01());

		for (Entry<String, MCList<MCDBContainer>> entry : recvMap.entrySet()) {
			MCList<MCDBContainer> dbc = entry.getValue();
			MCDBContainer dbc_t = dbc.createRow();
			dbc_t.setAlias("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(dbc_t);
			if (!dbc.isEmpty()) {
				dbWkDelete(createSqlId(LOGIC_ID, dbc_bldr.getBaseDbc().getPkWorkDbc(), "D52"), dbc_bldr.getBaseDbc());
			}
		}

		return asL;
	}

	protected MAC_IF_PROC_TYP getIfProcTyp() {
		return MAC_IF_PROC_TYP.WMS_ARR_ACT_RECV;
	}

	//FMCB CUSTOM END
}