package mcframe.serverMBBE.MBBEL0090;

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
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMBBE.MBBEL0090.*;	// このimportはFrameManagerの自動生成で追加されました。

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;

import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.report.MCCSVFile;
import mcframe.commonCore.report.MCFileReadListener;
import mcframe.commonCore.report.MCReportFile;
import mcframe.commonCore.report.container.MCCSVReportSet;
import mcframe.commonCore.report.container.MCReportMeta;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.MCReportConst;
import mcframe.commonCore.sys.MCFactory;
import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.commonCore.util.MCDataConvUtil;
import mcframe.commonMA.meta.MA_META;
import mcframe.serverCore.mcjdbc.MCCursor;
import mcframe.serverCore.mcjdbc.MCSavepoint;
import mcframe.serverCore.report.MCReportConf;
import mcframe.serverCore.requester.MCServerThreadManager;
import mcframe.serverCore.resource.MCConst;
import mcframe.serverCore.sys.MCSys;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogger;
import mcframe.serverMAUD.MAUDL6010.MAUDL_RLUtil;

import static mcframe.commonCore.notice.Core_Msg.*;
import static mcframe.commonMAUD.MAUDC0010.MAUDC_BizDatDLEnv.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import static mcframe.serverMAUD.MAUDL5010.MAUDL_BizDatDLer.*;
import static mcframe.serverMBBE.MBBEL0090.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MBBEL_BulkImpReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MBBEL_BulkImpReg_MC extends MBBEL_BulkImpReg_MC_A{
	//FMCB CUSTOM START

	/** リソース取得用キー */
	protected static final String _KEY_LABEL_LINE = "MB.bulk_imp.label_line";
	/** リソース取得用キー */
	protected static final String _KEY_CHKOPE_BASE = "MB.bulk_imp.check_ope_base";
	/** リソース取得用キー */
	protected static final String _KEY_FETCH_SIZE = "MB.bulk_imp.fetch_size";
	/** マスタ制御区分取得用 */
	protected String _bpMstSetTyp;

	/** Date型(#MA.TM)の固定書式  */
	protected String _tmFmt = "HH:mm";
	/** 電文項目から無視するカラム */
	protected String[] _ignCols = new String[] {
		"st_dt_key", "st_ym_key",
		"th_image_flg", "th_image",
		"upd_cntr"
	};

	/** 取引先マスタのマスタ制御区分を取得する*/
	protected String getBpMstSetTyp() {
		if (_bpMstSetTyp == null) {
			MAUDL_RLUtil.Srch01 o = MAUDL_RLUtil.crtSrch01();
			o.up0().mst_nm(MAC_MST_NM.MAM_BP.value());
			o.exec();
			_bpMstSetTyp = o.down0().mst_set_typ();
		}
		return _bpMstSetTyp;
	}

	protected boolean isBpAllComCom() {
		return MAC_MST_SET_TYP.isALL_COM_COM(getBpMstSetTyp());
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * まとめ登録実行管理情報を検索する<br>
	 */
	public class Srch01 extends MBBEL_BulkImpReg_MC_A.Srch01 {

		@Override
		protected void call() {
			super.call();
		}

		protected void doSearchMain() {
			srchBulkImpCtl();
		}

		/** 検索処理 */
		protected void srchBulkImpCtl() {
			MCQueryPlan sql = MBBEL0090_MBC_BULK_IMP_CTL_S01();
			
			if(isBpAllComCom()) {
				sql.addDynamicSQLInfo(MBBEL0090_MBC_BULK_IMP_CTL_S01_WHERE01());
			} else {
				sql.addDynamicSQLInfo(MBBEL0090_MBC_BULK_IMP_CTL_S01_WHERE02());
			}
			executeQuery(down0(), sql, up0());
		}

	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * まとめ登録を実行する<br>
	 */
	public class Upd01 extends MBBEL_BulkImpReg_MC_A.Upd01 {

		/** 処理済みリスト */
		protected MCList<Upd01_DtlR> _processedList = MCList.create(Upd01_DtlR.class);

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				getBatchLogger();
				writeStartLogWithLogger(null);
				execMain();
			}
			catch (Exception ex) {
				handleExWithLogger(ex);
			}
			finally {
				writeEndLogWithLogger(null);
				logger().close();
			}
		}

		protected void execMain() {

			editUp();

			MCList<Upd01_DtlR> notFinList = up0().createInstance();
			//カテゴリ順序単位に実行
			for(MCList<Upd01_DtlR> ctgSeqGrp: up0().groupList(Upd01_DtlR.$table_ctg_seq)) {
				while(getNotFinList(ctgSeqGrp, notFinList)) {
					//並列実行
					callThisUpd03(extExecList(notFinList));
				}
			}
		}

		/** 上り電文編集 */
		protected void editUp() {
			editUpForReg(up0(), up1());
		}

		/** 同一カテゴリ順序内の未実行テーブルをnotFinListに格納し、1件でも対象があればtrueを返す */
		protected boolean getNotFinList(MCList<Upd01_DtlR> ctgSeqGrp, MCList<Upd01_DtlR> notFinList) {
			//notFinListを入れ替える
			notFinList.setAll(ctgSeqGrp.subList(r -> !r.fin_flg()));

			return !notFinList.isEmpty();
		}

		/** 未実行のテーブルから並列実行可能な対象を抽出する */
		protected MCList<Upd01_DtlR> extExecList(MCList<Upd01_DtlR> notFinList) {
			//カテゴリごとの未実行の最小順序
			MCGroupByPolicy p = new MCGroupByPolicy(Upd01_DtlR.$table_ctg);
			p.min(Upd01_DtlR.$table_seq);
			MCList<Upd01_DtlR> minL = notFinList.groupBy(p);

			return notFinList.subList(r -> canExec(r, minL));
		}

		/** 
		 * 実行可能かどうか</br>
		 * 実行順が未実行の中で最小、かつ同一カテゴリの前の処理が全て正常終了している場合にtrueを返す
		 */
		protected boolean canExec(Upd01_DtlR r, MCList<Upd01_DtlR> minL) {
			if (r.fin_flg()) {
				return false;
			}
			Upd01_DtlR minR = minL.getFirst(Upd01_DtlR.$table_ctg, r.table_ctg());
			if (minR != null && !isSame(r.table_seq(), minR.table_seq())) {
				return false ;
			}

			for (Upd01_DtlR s : _processedList) {
				if (isSame(s.table_ctg(), r.table_ctg()) && s.table_seq().lt(r.table_seq())) {
					if (!s.fin_flg()) {
						return false;
					}
					if (s.err_flg()) {
						// 前の処理がエラーの場合、実行ＦＬＧをたてて実行はしない
						r.fin_flg(true);
						return false;
					}
				}
			}
			return true;
		}

		protected void callThisUpd03(MCList<Upd01_DtlR> procSeqL) {
			if (procSeqL.isEmpty()) {
				return ;
			}

			// オペレーション分割
			List<MBBEL_BulkImpReg.Upd03> oL = splitOperation(procSeqL);

			// 並列実行
			MCServerThreadManager.setCommitAndRollback(true);
			MCServerThreadManager.setShutdownOnError(false);
			MCServerThreadManager.invokeAndWait(oL);

			_processedList.addAll(procSeqL);
		}

		protected List<MBBEL_BulkImpReg.Upd03> splitOperation(MCList<Upd01_DtlR> procSeqL) {
			List<MBBEL_BulkImpReg.Upd03> opeL = new ArrayList<>();
			List<MCList<Upd01_DtlR>> list = splitUpList(procSeqL, getThreadBatchSize(procSeqL.size()));
			for (MCList<Upd01_DtlR> upL: list) {
				MBBEL_BulkImpReg.Upd03 ope = MBBEL_BulkImpReg.crtUpd03();
				ope.up0().setAll(upL);
				MCRow.copyall(ope.up1(), up1());
				opeL.add(ope);
			}
			return opeL;
		}

		protected List<MCList<Upd01_DtlR>> splitUpList(MCList<Upd01_DtlR> list, int max) {
			List<MCList<Upd01_DtlR>> ret = new ArrayList<>();
			if (list.size() <= max) {
				ret.add(list);
				return ret;
			}

			MCList<Upd01_DtlR> stack = MCList.create(Upd01_DtlR.class);
			for (int i = 0; i < list.size(); i++) {
				stack.add(list.get(i));
				if (stack.size() >= max || i == list.size() - 1) {
					MCList<Upd01_DtlR> l = MCList.create(Upd01_DtlR.class);
					l.setAll(stack);
					ret.add(l);
					stack.clear();
				}
			}
			return ret;
		}

	}

	/**
	 * Upd02オペレーション.<p>
	 *
	 * まとめ登録（チェックのみ）を実行する<br>
	 */
	public class Upd02 extends MBBEL_BulkImpReg_MC_A.Upd02 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				getBatchLogger();
				writeStartLogWithLogger(null);
				execMain();
			}
			catch (Exception ex) {
				handleExWithLogger(ex);
			}
			finally {
				writeEndLogWithLogger(null);
				logger().close();
			}
		}

		protected void execMain() {

			editUp();

			//上り電文は１行の想定
			for(Upd01_DtlR r: up0()) {
				callThisUpd03(r);
			}

		}

		/** 上り電文編集 */
		protected void editUp() {
			editUpForReg(up0(), up1());
			up1().chk_only_flg(true);
		}

		/** まとめ登録処理呼び出し */
		protected void callThisUpd03(Upd01_DtlR r) {
			MCList<Upd01_DtlR> opeUpL = MCList.create(Upd01_DtlR.class);
			opeUpL.add(r);

			MBBEL_BulkImpReg.Upd03 ope = MBBEL_BulkImpReg.crtUpd03();
			ope.up0().setAll(opeUpL);
			MCRow.copyall(ope.up1(), up1());

			ope.exec();
		}

	}

	/**
	 * Upd03オペレーション.<p>
	 *
	 * まとめ登録処理を実行する<br>
	 */
	public class Upd03 extends MBBEL_BulkImpReg_MC_A.Upd03 {

		/** バッチログのインスタンス */
		protected FXBAL_BatchLogger _logger = null;
		/** まとめ登録処理用ユーティリティ */
		protected BulkImpUtil _util;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				initLogger();
				execMain();
			}
			finally {
				closeLogger();
				up0().setBoolean(Upd01_DtlR.$fin_flg, true);
			}
		}

		protected void execMain() {

			up0().sort(Upd01_DtlR.$table_ctg_seq,
					Upd01_DtlR.$table_ctg,
					Upd01_DtlR.$table_seq,
					Upd01_DtlR.$table_id);

			for (Upd01_DtlR r: up0()) {
				MCSavepoint sp = dbTran().setSavepoint();
				try {
					prep(r);
					main(r);
					post(r);
				}
				catch (Exception ex) {
					dbTran().rollback(sp);
					writeErrMsg(r);
					throw ex;
				}
				dbTran().commit();
			}
		}

		/** 対象テーブルの前処理 */
		protected void prep(Upd01_DtlR r) {
			_logger.writeProcessLog(MBBEL0010, r.table_id(), r.file_nm(),
					r.db_class_path(), r.chk_ope(), r.upd_ope());
			_util = new BulkImpUtil(r, up1());
		}

		/** 対象テーブルのメイン処理  */
		protected void main(Upd01_DtlR r) {
			_util.main();
		}

		/** 対象テーブルの後処理 */
		protected void post(Upd01_DtlR r) {
			writeErrMsg(r);
			_logger.writeProcessLog(MBBEL0011,
				r.table_id(), _util.getTotalCnt(), _util.getSuccessCnt(), _util.getErrorCnt());
			if(!isNull(_util.getErrFile())) {
				registerFile(_util.getErrFile());
			}
		}

		protected void writeErrMsg(Upd01_DtlR r) {
			if(_util != null && !_util.getErrMsgList().isEmpty()) {
				_logger.writeProcessLog(_util.getErrMsgList());
				_util.getErrMsgList().clear();
				up0().setBoolean(Upd01_DtlR.$err_flg, true);
			}
		}

		/** バッチログのインスタンスを取得する */
		protected void initLogger() {
			if (MCServerThreadManager.isChildThread()) {
				_logger = getConcurrentLogger();
			}
			else {
				//呼出元から引き継ぐ
				_logger = logger();
			}
		}

		/** バッチログをクローズする */
		protected void closeLogger() {
			if (MCServerThreadManager.isChildThread()) {
				_logger.close();
			}
		}

	}

	/**
	 * Prnt01オペレーション.<p>
	 *
	 * フォーマットファイルを出力する<br>
	 */
	public class Prnt01 extends MBBEL_BulkImpReg_MC_A.Prnt01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			execMain();
			setDown();
		}

		/** 上り電文編集 */
		protected void editUp() {
			editUpForPrnt(up0(), null);
		}

		/**
		 * メイン処理<p>
		 * オペレーションの上り電文項目のフォーマットファイルを出力する。
		 */
		protected void execMain() {
			for(Upd01_DtlR r: up0()) {
				try {
					writeFile(r);
				}
				catch (MCException ex){
					//例外はスキップ
					MCLog.write(ex);
					handleEx(ex);
					r.file_path(null);
				}
			}
		}

		/** フォーマットファイルを出力する */
		protected void writeFile(Upd01_DtlR r) {
			//ヘッダ項目、ヘッダ項目論理名取得
			List<String> colL = new ArrayList<>();
			List<String> lblL = new ArrayList<>();
			getHeader(r, getIsChkOpeBase(r.table_id()), colL, lblL);

			BulkImpFileWriter writer = createBulkImpFileWriter(r.file_path());
			writer.setDatCols(colL.toArray(new String[0]));
			writer.setHdrLbls(writer.getDatCols());
			if(getIsLabelLine(r.table_id())) {
				//ヘッダ項目論理名行追加
				writer.append(getHeaderLabel(r, colL, lblL));
			}

			writer.out();
		}

		/** 下り電文設定 */
		protected void setDown() {
			//出力ファイル名を設定
			down0().setAll(up0());
		}

		protected void handleEx(MCException ex) {
			MCMessagePool.add(ex.getMCMessage());
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

	}

	/**
	 * Prnt02オペレーション.<p>
	 *
	 * データファイルを出力する<br>
	 */
	public class Prnt02 extends MBBEL_BulkImpReg_MC_A.Prnt02 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				getBatchLogger();
				writeStartLogWithLogger(null);
				editUp();
				execMain();
			}
			catch (Exception ex) {
				handleExWithLogger(ex);
			}
			finally {
				writeEndLogWithLogger(null);
				logger().close();
			}
		}

		/** 上り電文編集 */
		protected void editUp() {
			editUpForPrnt(up0(), up1());
		}

		/** 
		 * メイン処理<p>
		 * ＤＢコンテナを使用して検索しfetchサイズ毎にファイルに出力する。</br>
		 * 出力ファイルはサーバ処理ファイル管理に登録する 。
		 */
		protected void execMain() {
			for(Upd01_DtlR r: up0()) {
				if(isNull(r.db_class_path())) {
					logger().writeProcessLog(MBBEL0016, r.table_id());
					continue;
				}
				try {
					setDelFlgCtl(false);
					writeFile(r);
					if(!isNull(r.file_path())) {
						registerFile(r.file_path());
					}
				}
				catch (MCException ex){
					//例外はスキップ
					MCLog.write(ex);
					r.file_path(null);
					handleEx(ex);
				}
				finally {
					setDelFlgCtl(true);
				}
			}
		}

		/** データファイルを出力する */
		protected void writeFile(Upd01_DtlR r) {

			//ヘッダ項目、ヘッダ項目論理名取得
			boolean chkBase = getIsChkOpeBase(r.table_id());
			List<String> colL = new ArrayList<>();
			List<String> lblL = new ArrayList<>();
			getHeader(r, chkBase, colL, lblL);

			MCRow rc;
			MCDBContainer dbc = null;
			if(chkBase && !isNull(r.chk_ope())) {
				MCOperation ope = createOperation(r.chk_ope(), null);
				rc = ((MCList<?>)ope.up(0)).createRow();
			}
			else if(!isNull(r.upd_ope())) {
				MCOperation ope = createOperation(r.upd_ope(), null);
				rc = ((MCList<?>)ope.up(0)).createRow();
			}
			else {
				dbc = createDbcRow(r.db_class_path(), null);
				rc = (MCRow)dbc;
			}

			BulkImpFileWriter writer = createBulkImpFileWriter(r.file_path());
			writer.setDatCols(colL.toArray(new String[0]));
			writer.setHdrLbls(writer.getDatCols());
			boolean isLableLine = getIsLabelLine(r.table_id());
			if(!isSame(FileInfo.getTyp(r.file_nm()), FileInfo.CSV)) {
				if (dbc == null) {
					dbc = createDbcRow(r.db_class_path(), null);
				}
				int max = FileInfo.MAX_ROW_XLSX - getDataStartRow(r, up1()) + 1;
				
				int cnt = execDbCount(createSqlId(LOGIC_ID, dbc, "S50"), dbc);

				if (cnt > max) {
					throw new MCAppException(MBBEL0021, r.table_id());
				}
			}
			//ヘッダ項目論理名行追加
			if(isLableLine) {
				writer.append(getHeaderLabel(r, colL, lblL));
			}

			// データ開始行の前まで空白行を追加する
			addBlankUpToDataStartLine(r, up1(), writer, isLableLine ? 1: 0);
			
			for (String col: writer.getDatCols()) {
				MCMeta meta = rc.getMeta(col);
				if(isSame(meta.ID(), MA_META.TM.ID())) {
					writer.setFmt(col, up1().tm_fmt());
				}
				else if (meta.type() == MCDataType.DATE) {
					writer.setFmt(col, up1().dt_fmt());
				}
				else if(meta.type() == MCDataType.TIMESTAMP) {
					writer.setFmt(col, up1().ts_fmt());
				}
			}

			MCCursor<? extends MCRow> cur = getOpenCur(r, rc, dbc, writer.getDatCols());
			try {
				while (cur.dbFetch() > 0) {
					writer.append(cur.getList());
				}
				writer.out();
				logger().writeProcessLog(MBBEL0015, r.table_id(), r.file_nm(),
						isLableLine ? writer.getDatRowCnt() - 1: writer.getDatRowCnt());
			}
			finally {
				cur.dbCloseCur();
			}

		}

		/** データ取得用のSELECT文カーソルを取得する */
		protected MCCursor<? extends MCRow> getOpenCur(Upd01_DtlR r, MCRow rc, MCDBContainer dbc, String... selects) {
			if(dbc == null) {
				dbc = createDbcRow(r.db_class_path(), null);
			}
			
			MCQueryApiBuilder bldr = getSelectQuery(dbc, selects);
			int fetch = getFetchSize(1000, "write", r.table_id());
			MCCursor<? extends MCRow> cur;
			cur = bldr.buildSelect(createSqlId(LOGIC_ID, bldr.getBaseDbc(), "S51")).openCursor(null, null, rc.getClass(), fetch);
			
			return cur;
		}

		/** ＤＢコンテナに応じてデータ取得用のSELECT文を取得する */
		protected MCQueryApiBuilder getSelectQuery(MCDBContainer dbc, String... selects) {
			String[] db = dbc.getColumnPathArray();
			List<MCPermColumn> cols = new ArrayList<>();
			for(String s: selects) {
				if(MCCollectionUtil.contains(s, db)) {
					cols.add(dbc.getColumn$(s));
				}
			}
			
			MCDBContainer t = dbc.clone();
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(cols.toArray(new MCPermColumn[0]));

			if(dbc instanceof MAM_ITM_COM_R) {
				bldr.addWhereWithAnd(((MAM_ITM_COM_R) dbc).co_cd.eq(value(getCo().co_cd())));
			}
			else if(dbc instanceof MAM_COEF_AUTO_R) {
				MAM_ALC_COEF_R S0_M1 = MAM_ALC_COEF_R.create("ALC_COEF1");
				bldr.addLeftOuterJoin(S0_M1, S0_M1.alc_coef_cd.eq(((MAM_COEF_AUTO_R) dbc).alc_coef_cd));
				bldr.addSelect(S0_M1.coef_config_typ.as("coef_config_typ"));
				bldr.addSelect(S0_M1.qty_unit_typ.as("qty_unit_typ"));
			}
			
			return bldr;
		}

		protected void handleEx(MCException ex) {
			logger().writeProcessLog(ex);
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

	}

	/**
	 * まとめ登録用ユーティリティ
	 */
	protected class BulkImpUtil {

		/** エラーメッセージ格納列のカラム名*/
		protected static final String ERR_MSG_COL = "err_msg_info";
		/** 読込元データと読込データの紐づけ用カラム名*/
		protected static final String ROW_IDX_COL = "_row_idx";
		/** 読み飛ばし行の目印　*/
		protected static final String IGN_ROW_FLG_COL = "_ign_row_flg_";
		/** 読み飛ばし用のダミーメタ */
		protected MCReportMeta _dmyMeta = new MCReportMeta("dummy", "", "dummy", false);

		/** 読込データ(文字列表現) */
		protected MCList<MCRow> _readOrgL = MCList.create(MCRow.class);
		/** 読込元データと読込データの紐づけ用インデックス*/
		protected MCIndexKey _rowIdx;
		/** 処理中に発生したエラーメッセージ */
		protected MCMessageList _errMsgL = new MCMessageList();
		/** 読込行と紐づくメッセージリストのMap*/
		protected Map<MCNumber, MCMessageList> _relatedErrMsgMap = new HashMap<>();
		/** ファイルのヘッダー行 */
		protected String[] _headingCols = null;
		/** ヘッダー行の論理名ラベル行と読み飛ばし行 */
		protected MCList<MCRow> _labelCols = MCList.create(MCRow.class);

		/** 読込行数 */
		protected int _totalCnt;
		/** 正常終了行数 */
		protected int _successCnt;
		/** エラー行数 */
		protected int _errorCnt;
		/** 続行不可のエラー */
		protected boolean _break;
		/** 処理対象 */
		protected Upd01_DtlR _tgt;
		/** 処理制御情報 */
		protected Upd01_CtrlR _ctrl;
		/** 入力ファイル */
		protected File _file;
		/** DBコンテナ */
		protected MCDBContainer _dbcR;
		/** チェックオペレーションの雛形 */
		protected MCOperation _chkOpe;
		/** 登録オペレーションの雛形 */
		protected MCOperation _updOpe;
		/** オペレーションの上りコンテナ  */
		protected MCRow _upR;
		/** ファイル入力用のReader */
		protected BulkImpReadFile _reader;
		/** ファイル入力用のレポートセット */
		protected MCReportSet _rptSet;

		/** エラー行出力ファイル */
		protected File _errFile;
		/** エラーファイル出力用のWriter */
		protected BulkImpFileWriter _writer;

		public BulkImpUtil(Upd01_DtlR tgt, Upd01_CtrlR ctrl) {
			_tgt = tgt;
			_ctrl = ctrl;
		}

		/** 読込行数 */
		public int getTotalCnt() {
			return _totalCnt;
		}

		/** 登録行数 */
		public int getSuccessCnt() {
			return _successCnt;
		}

		/** エラー行数 */
		public int getErrorCnt() {
			return _errorCnt;
		}

		/** エラー行のみを出力したファイル */
		public File getErrFile() {
			return _errFile;
		}

		/** エラーメッセージリスト */
		public MCMessageList getErrMsgList() {
			return _errMsgL;
		}

		/** まとめ登録処理 */
		public void main() {

			init();
			//初期化エラー
			throwEx();

			prep();
			read();
			post();

		}

		/** 初期化とチェック処理 */
		protected void init() {

			_file = new File(_tgt.file_path());

			_dbcR = createDbcR();
			_chkOpe = createChkOperation();
			_updOpe = createUpdOperation();

			if(!getErrMsgList().isEmpty()) {
				_break = true;
				return;
			}

			if(_updOpe != null) {
				_upR = ((MCList<?>)_updOpe.up(0)).createRow();
			}
			else if(_dbcR != null) {
				_upR = (MCRow)_dbcR;
			}
			else {
				getErrMsgList().add(new MCMessage(MBBEL0017, _tgt.table_id()));
				_break = true;
				return;
			}

			if(_ctrl.crud_flg() && _dbcR != null ) {
				getErrMsgList().add(new MCMessage(MBBEL0018, _tgt.table_id()));
			}
			else if(!_ctrl.crud_flg() && _dbcR == null) {
				getErrMsgList().add(new MCMessage(MBBEL0019, _tgt.table_id()));
			}

			if(!getErrMsgList().isEmpty()) {
				_break = true;
				return;
			}

			_reader = createReader();

		}

		/** ファイル読込の前処理 */
		protected void prep() {
			if(!_ctrl.chk_only_flg() && _ctrl.remake_flg()) {
				deleteData();
			}
		}

		/** ファイル読込処理 */
		protected void read() {
			_reader.read(_file.getAbsolutePath());
		}

		/** ファイル読込の後処理 */
		protected void post() {
			if(_writer != null) {
				_writer.out();
			}
			throwEx();
		}

		/** 続行不可のエラーが発生している場合は例外をthrowする */
		protected void throwEx() {
			if(_break) {
				throw new MCException(MAUDL0009);
			}
		}

		/** 
		 * 登録対象のテーブルのdelete処理
		 * ＤＢコンテナを使用して対象テーブルの全データを削除する。
		 * ＤＢコンテナが設定されていな場合は何もしない。
		 */
		protected void deleteData() {
			if(_dbcR != null) {
				//排他制御はしていない
				if(_dbcR instanceof MAM_ITM_COM_R) {
					MCPredicate where = ((MAM_ITM_COM_R) _dbcR).co_cd.eq(bind("1"));
					execDbDelete("MBBEL0090_MAM_ITM_COM_D01", _dbcR, where, getCo().co_cd());
				}
				else {
					execDbDelete(createSqlId(LOGIC_ID, _dbcR, "D50"), _dbcR, null);
				}
			}
		}

		/** レポートセットから読込んだ行を取得する */
		protected MCList<?> getReadList() {
			return _rptSet.getAll();
		}

		/** レポートセットをクリアする */
		protected void clearReadList() {
			_rptSet.clear();
		}

		/** fetch_size単位の処理 */
		protected void bulkImp() {
			_rowIdx = _readOrgL.createIndex(ROW_IDX_COL);
			try {
				bulkImpMain(getReadList());
			}
			finally {
				clearReadList();
				_relatedErrMsgMap.clear();
				_readOrgL.clear();
			}
		}

		/** fetch_size行数分のチェック・登録処理 */
		protected void bulkImpMain(MCList<?> readL) {
			MCList<MCRow> tgtL = MCList.create(readL.get(0));
			for(MCRow r: readL) {
				if (r.getBooleanNE(IGN_ROW_FLG_COL) == false) {
					tgtL.add(r);
				}
			}

			//読込み時のエラー
			if(!tgtL.createRow().containsConst(ERR_FLG_COL)) {
				tgtL.addBooleanColumn(ERR_FLG_COL);
			}
			MCList<MCRow> errList = tgtL.subList(ERR_FLG_COL, true);
			_errorCnt += errList.size();
			if(_break) {
				return;
			}
			if(!_ctrl.chk_only_flg()) {
				writeErrDataFile(errList);
			}
			tgtL = tgtL.subList(ERR_FLG_COL, false);

			//行ステータス設定
			setSatus(tgtL);

			//データ補正、抽出
			tgtL = editTgt(tgtL);
			if(tgtL.isEmpty()) {
				return;
			}

			//チェック処理
			doChk(tgtL);
			errList = tgtL.subList(ERR_FLG_COL, true);
			_errorCnt += errList.size();

			//続行判定
			if(_ctrl.chk_only_flg()) {
				return;
			}
			if(_errorCnt > 0 && !_ctrl.err_continue_flg()) {
				_break = true;
				return;
			}

			//登録処理
			if(!errList.isEmpty()) {
				writeErrDataFile(errList);
				tgtL = tgtL.subList(ERR_FLG_COL, false);
			}
			doUpd(tgtL);

		}

		/** 読み込んだ行の行ステータスを設定する */
		protected void setSatus(MCList<?> l) {
			if(l.isEmpty() || _ctrl.crud_flg() || _dbcR == null) {
				return;
			}

			if(_ctrl.remake_flg()) {
				l.setStatus(MCRow.CREATE);
				return;
			}

			MCList<?> dbcL = MCList.create(_dbcR);
			String[] keys = _dbcR.getKeyColumn();
			if(keys.length == 0) {
				//キーがなければ常にInsert
				l.setStatus(MCRow.CREATE);
				return;
			}

			if(_dbcR.getPkWorkDbc() != null) {
				try {
					setDelFlgCtl(false);
					selectPkWk(dbcL, l);
				}
				finally {
					setDelFlgCtl(true);
				}
			}
			else {
				MCDBContainer t = _dbcR.clone();
				MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
				dbSelectKey(createSqlId(LOGIC_ID, bldr.getBaseDbc(), "S52"), dbcL, bldr, l);
			}

			if(dbcL.isEmpty()) {
				l.setStatus(MCRow.CREATE);
				return;
			}

			MCIndexKey idxKey = dbcL.createIndex(keys);

			for(MCRow r: l) {
				if(dbcL.getFirst(idxKey, r.toArray(keys)) == null) {
					r.setStatus(MCRow.CREATE);
				}
				else {
					r.setStatus(MCRow.MODIFY);
				}
			}
		}

		/** PKワークテーブルを使用したテーブルの検索 */
		public void selectPkWk(MCList<?> result, MCList<?> bindL) {
			// PKワークテーブルにインサート
			MCDBContainer workDbc = _dbcR.getPkWorkDbc();
			workDbc.setAlias("W");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(workDbc);
			bldr.setValues(workDbc.getKeyColumn$());
			dbInsert(createSqlId(LOGIC_ID, bldr.getBaseDbc(), "I50"), bindL, bldr);
			// テーブルの検索
			bldr = MCQueryApiBuilder.create(_dbcR);
			bldr.setOrderByAsc(_dbcR.getKeyColumn$());
			bldr.setSelect(_dbcR.getKeyColumn$());
			bldr.addSelect(_dbcR.getColumn$(MAM_ITM_COM_R.$upd_cntr));
			// PKワークテーブルとジョイン
			MCPredicate p = value(0).eq(value(0));
			for (String col : _dbcR.getKeyColumn()) {
				p = p.and(MCQueryApiBuilder
						.makeEq(_dbcR.getColumn$(col), workDbc.getColumn$(col))
						.or(MCQueryApiBuilder.makeIsNull(_dbcR.getColumn$(col))
								.and(MCQueryApiBuilder.makeIsNull(workDbc.getColumn$(col)))));
			}
			bldr.addInnerJoin(workDbc, p);
			bldr.addLockTable(_dbcR.getKeyColumn$()[0]);
			dbSelect(createSqlId(LOGIC_ID, bldr.getBaseDbc(), "S53"), result, bldr);
		}

		/** 読み込んだ行の加工、抽出処理 */
		protected MCList<MCRow> editTgt(MCList<MCRow> l) {
			MCList<MCRow> ans = l;
			if(_ctrl.ins_only_flg()) {
				ans = ans.subList(MCRow.CREATE);
			}
			String[] stKeys = new String[] {"st_dt", "st_ym"};
			for (String src: stKeys) {
				String col = src + "_key";
				String dest = getStKeyCol(col);
				if (dest != null) {
					ans.forEach(r -> r.setValue(dest, r.getValueNE(src)));
				}
			}

			if(_updOpe  != null
					&&_updOpe instanceof mcframe.serverMABC.MABCL0390.MABCL_ItmLst.ItmLst_Upd02) {
				ans = ans.subList("co_cd", getCo().co_cd());
				//登録オペレーションでupd_cntrがnullだと新規行と見なされてしまうため
				ans.setNumberNE(MAM_ITM_COM_R.$upd_cntr, 0);
			}
			if(_updOpe  != null
					&&_updOpe instanceof mcframe.serverMABC.MABCL0520.MABCL_BpLst.BpLst_Upd02) {
				//登録オペレーションでupd_cntrがnullだと新規行と見なされてしまうため
				ans.setNumberNE(MAM_BP_R.$upd_cntr, 0);
			}

			return ans;
		}

		protected String getStKeyCol(String col) {
			for (String x : _upR.getColumnPathArray()) {
				if (x.endsWith(col)) {
					return x;
				}
			}
			return null;
		}

		/** チェック処理を実行する */
		protected void doChk(MCList<?> l) {
			if(_chkOpe == null || l.isEmpty()) {
				return;
			}
			callChkOpe(l);
			checkErrMsg(l);
		}

		/** チェック用オペレーションを実行する */
		@SuppressWarnings({"unchecked", "rawtypes"})
		protected void callChkOpe(MCList<?> l) {

			MCOperation ope = initOperation(_chkOpe);
			//登録とチェックのコンテナは同一の想定
			((MCList)ope.up(0)).addAll(l);

			//CheckerでロケールＣＤ存在チェックを行うための設定
			if (ope instanceof Checker) {
				((Checker) ope).doChkLcl(true);
			}

			try {
				ope.exec();
			}
			catch (MCAppException ex) {
				MCLog.write(ex);

				//チェック処理での例外は全行エラー扱いとする
				l.setBooleanNE(ERR_FLG_COL, true);
				MCMessageList mL;
				mL = ex.getCauseMessageList();
				if(mL.isEmpty()) {
					mL = new MCMessageList();
					mL.add(ex.getMCMessage());
				}
				getErrMsgList().addAll(mL);
				_break = true;
			}
		}

		/** 登録処理を実行する */
		protected void doUpd(MCList<?> l) {
			if(l.isEmpty()) {
				return;
			}
			if(_updOpe != null) {
				callUpdOpe(l);
			}
			else {
				updByDbc(l);
			}
		}

		/** 登録用オペレーションを実行する */
		@SuppressWarnings({"unchecked", "rawtypes"})
		protected void callUpdOpe(MCList<?> l) {

			MCOperation ope = initOperation(_updOpe);
			((MCList)ope.up(0)).addAll(l);
			try {
				ope.exec();
				_successCnt += l.size();
			}
			catch (MCAppException ex) {
				MCLog.write(ex);
				MCMessageList mL = ex.getCauseMessageList();
				if(mL.isEmpty()) {
					mL = new MCMessageList();
					mL.add(ex.getMCMessage());
				}
				getErrMsgList().addAll(mL);
				_break = true;
			}
		}

		/** DBコンテナを使用して更新処理を実行する */
		protected void updByDbc(MCList<?> l) {
			try {
				MCList<?> dbcL = null;

				dbcL = l.subList(MCRow.CREATE);
				if(!dbcL.isEmpty()) {
					MCDBContainer t = _dbcR.clone();
					MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
					bldr.setValues(getQueryDbcCols());
					dbInsert(createSqlId(LOGIC_ID, bldr.getBaseDbc(), "I51"), dbcL, bldr);
					dbcL.clear();
				}

				dbcL = l.subList(MCRow.MODIFY);
				if(!dbcL.isEmpty()) {
					MCDBContainer t = _dbcR.clone();
					MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
					bldr.setValues(getQueryDbcCols());
					dbUpdateKey(createSqlId(LOGIC_ID, bldr.getBaseDbc(), "U50"), dbcL, bldr);
					dbcL.clear();
				}
				_successCnt += l.size();
			}
			catch (MCException ex) {
				MCLog.write(ex);
				MCMessageList mL = ex.getCauseMessageList();
				if(mL.isEmpty()) {
					mL = new MCMessageList();
					mL.add(ex.getMCMessage());
				}
				getErrMsgList().addAll(mL);
				_break = true;
			}
		}
		
		/** _headingColsからdbcに存在しないカラムを除いて返す */
		protected MCPermColumn[] getQueryDbcCols() {
			ArrayList<MCPermColumn> l = new ArrayList<>();
			for (String col : _headingCols) {
				if (_dbcR.containsConst(col)) {
					l.add(_dbcR.getColumn$(col));
				}
			}
			return l.toArray(new MCPermColumn[l.size()]);
		}

		/** オペレーションを新規作成する */
		protected MCOperation initOperation(MCOperation ope) {
			//オペレーションを使いまわしてはいけない
			MCOperationInfo info = ope.getOperationInfo();
			MCOperation newOpe = createOperation(
					info.moduleId, info.logicId, info.operationId, ope.getClass());
			return newOpe;
		}

		/** チェック処理のエラーメッセージ処理 */
		protected void checkErrMsg(MCList<?> l) {
			for (MCMessage msg : MCMessagePool.getMessageList()) {
				setErrMsg(l, msg);
			}
			MCMessagePool.clear();
		}

		/** エラー行にエラーメッセージを設定する */
		protected void setErrMsg(MCList<?> l, MCMessage msg) {
			MCRow causeRow = msg.getCauseRow();
			MCRow s = null;
			if (causeRow != null) {
				int i = causeRow.getParamRowIndex();
				for(MCRow r: l) {
					if (r.getParamRowIndex() == i) {
						s = r;
						break;
					}
				}
			}
			addErrMsg(s, msg);
		}

		/** エラーを蓄積し、行とエラーを紐づける */
		protected void addErrMsg(MCRow r, MCMessage msg) {
			getErrMsgList().add(msg);
			if(r != null) {
				setRelateErrMsg(r, msg);
			}
		}

		/** エラー行にエラーメッセージを設定する */
		protected void setRelateErrMsg(MCRow r, MCMessage msg) {
			getRelateMessageList(r).add(msg);
		}

		/** 行に紐づくMCMessageListを取得する */
		protected MCMessageList getRelateMessageList(MCRow r) {
			MCNumber idx = r.getNumberNE(ROW_IDX_COL);
			MCMessageList mL = _relatedErrMsgMap.get(idx);
			if(mL == null) {
				mL = new MCMessageList();
				_relatedErrMsgMap.put(idx, mL);
			}
			return mL;
		}

		/** エラー行をファイルに出力する */
		protected void writeErrDataFile(MCList<?> errL) {
			if(errL.isEmpty()) {
				return;
			}
			MCList<MCRow> writeL = MCList.create(MCRow.class);
			for(MCRow r: errL) {
				MCNumber rowIdx = r.getNumberNE(ROW_IDX_COL);
				MCRow orgR = _readOrgL.getFirst(_rowIdx, rowIdx);
				if(orgR != null) {
					writeL.add(orgR);
					if(isSame(FileInfo.getTyp(_tgt.file_nm()), FileInfo.CSV)) {
						continue;
					}
					MCMessageList mL = _relatedErrMsgMap.get(rowIdx);
					if(mL != null) {
						StringBuilder sb = new StringBuilder();
						for(MCMessage m: mL) {
							if(sb.length() != 0) {
								sb.append("\n");
							}
							//SXSSFWorkbook対応
							String s = m.toString().replaceAll("\r\n", "\n"); 
							sb.append(s);
						}
						orgR.setStringNE(ERR_MSG_COL, sb.toString());
					}
				}
			}

			getWriter().append(writeL);
		}

		/** エラー行出力用のWriterを取得する */
		protected BulkImpFileWriter getWriter() {
			if(_writer == null) {
				_errFile = new File(getOutDir(), "err_" + _tgt.file_nm());
				_writer = createBulkImpFileWriter(_errFile.getPath());
				_writer.setDatCols(getErrFileHeadingCol());
				_writer.setHdrLbls(_writer.getDatCols());
				
				// 論理名と読み飛ばし行を出力する
				if(!_labelCols.isEmpty()) {
					_writer.append(_labelCols);
				}
				
				// データ開始行の前まで空白行を追加する
				addBlankUpToDataStartLine(_tgt, _ctrl, _writer, _labelCols.size());

				for (String col: _writer.getDatCols()) {
					MCMeta meta = _upR.getMeta(col);
					if(meta == null) {
						continue;
					}
					if(isSame(meta.ID(), MA_META.TM.ID())) {
						_writer.setFmt(col, _ctrl.tm_fmt());
					}
					else if (meta.type() == MCDataType.DATE) {
						_writer.setFmt(col, _ctrl.dt_fmt());
					}
					else if(meta.type() == MCDataType.TIMESTAMP) {
						_writer.setFmt(col, _ctrl.ts_fmt());
					}
				}
			}
			return _writer;
		}

		/** エラー行ファイル用のヘッダ（ エラーメッセージ列が追加される） */
		protected String[] getErrFileHeadingCol() {
			if(isSame(FileInfo.getTyp(_tgt.file_nm()), FileInfo.CSV)) {
				return _headingCols;
			}
			String[] ret = new String[_headingCols.length + 1];
			System.arraycopy(_headingCols, 0, ret, 0, _headingCols.length);
			ret[ret.length - 1] = ERR_MSG_COL;
			return ret;
		}

		protected MCDBContainer createDbcR() {
			if(isNull(_tgt.db_class_path())) {
				return null;
			}
			return createDbcRow(_tgt.db_class_path(), getErrMsgList());
		}

		/** 登録用オペレーションを生成する */
		protected MCOperation createUpdOperation() {
			if(isNull(_tgt.upd_ope())) {
				return null;
			}
			MCOperation ope = createOperation(_tgt.upd_ope(), getErrMsgList());
			validateOpe(_tgt, ope, getErrMsgList());
			return ope;
		}

		/** チェック用オペレーションを生成する */
		protected MCOperation createChkOperation() {
			if(isNull(_tgt.chk_ope())) {
				return null;
			}
			MCOperation ope = createOperation(_tgt.chk_ope(), getErrMsgList());
			validateOpe(_tgt, ope, getErrMsgList());
			return ope;
		}

		/** ファイル読込用のMCCSVFileクラスを作成する */
		protected BulkImpReadFile createReader() {
			_rptSet = MCCSVReportSet.create(_upR.getClass());
			_rptSet.addReadListener(new BulkImpFileReadListener());

			BulkImpReadFile csvf = new BulkImpReadFile();
			csvf.setReportSet(_rptSet);
			csvf.useHeading(true);
			if(!isSame(FileInfo.getTyp(_tgt.file_nm()), FileInfo.CSV)) {
				//エクセル用
				csvf.setCharset(MCReportFile.ENCODE_UTF16);
				csvf.setDelimiter("\t");
			}

			return csvf;
		}

		/** ファイル読込用クラス */
		protected class BulkImpReadFile extends MCCSVFile {

			@Override
			public boolean readLineNext() {
				if(_break) {
					return false;
				}
				return super.readLineNext();
			}

			@Override
			public void readSetValue(String fileName, MCRow r, int rowIndex, int metaIndex,
					MCReportMeta rmeta, String val) {
				if(rmeta == _dmyMeta) {
					return;
				}
				try {
					super.readSetValue(fileName, r, rowIndex, metaIndex, rmeta, val);
					if(!_ctrl.crud_flg() && _dbcR != null) {
						//setSatusのinsertで桁数あふれる場合があるのでここでチェック
						colValidate(r, rowIndex, rmeta, val);
					}
				}
				catch (MCException ex) {
					MCLog.write(ex);
					MCMessage msg = new MCMessage(r, null, MBBEL0014,
						rowIndex + 1, rmeta.getColumnPath(), rmeta.getFormat(), val);
					handleErrMsg(r, msg);
				}
			}

			/** DBコンテナ項目メタ定義適合チェック */
			protected void colValidate(MCRow r, int rowIdx, MCReportMeta meta, String val) {
				if(meta == null){
					return;
				}
				String colPath = meta.getColumnPath();
				MCMessageList msgL = r.validate(colPath);

				// 不要なメッセージは除外
				MCMessageList wkMsgL = new MCMessageList();
				for (MCMessage msg :msgL) {
					if(!isIgnoreErrMsg(msg)) {
						wkMsgL.add(msg);
					}
				}
				if (!wkMsgL.isEmpty()) {
					MCMessage msg = new MCMessage(r, null, MBBEL0014, rowIdx + 1, colPath, meta.getFormat(), val);
					handleErrMsg(r, msg);
					getErrMsgList().addAll(wkMsgL);
					for (MCMessage wkMsg :wkMsgL) {
						setRelateErrMsg(r, wkMsg);
					}
				}
			}

			/** 必須チェックと負値チェックのエラーであるかを返す */
			protected boolean isIgnoreErrMsg(MCMessage msg) {
				return isSame(FCBBC0065, msg.getID())
						|| _updOpe != null && isSame(FCBCC0074, msg.getID());
			}

			/** 読込時エラーのハンドリング */
			protected void handleErrMsg(MCRow r, MCMessage msg) {
				r.setBooleanNE(ERR_FLG_COL, true);
				addErrMsg(r, msg);
				if(!_ctrl.chk_only_flg() && !_ctrl.err_continue_flg()) {
					_break = true;
				}
			}

		}

		/** ファイル読込用のリスナー */
		protected class BulkImpFileReadListener extends MCFileReadListener {
			//readLines⇒Rowの確定→ メタの確定→ Rowの格納
			/** ファイルの実データ行かどうか */
			protected boolean _isDataLine;
			/** ファイル読込時のフェッチサイズ */
			protected int _fetchSize = getFetchSize(1000, "read", _tgt.table_id());
			/** ファイルに論理名ラベル行が含まれるかどうか */
			protected boolean _hasLabelLine = getIsLabelLine(_tgt.table_id());
			/** ファイルのデータ開始行 */
			protected int _dataStartIndex = -1;
			/** ヘッダー行のメタ */
			protected MCReportMeta[] _headingMetaArry;

			@Override
			public String[] readLines(int rowIndex, String[] values) {
				if(!_isDataLine) {
					if(_dataStartIndex < 0) {
						_dataStartIndex = getDataStartRow(_tgt, _ctrl) - 1;
					}
					if (rowIndex > 0 && rowIndex < _dataStartIndex) {
						MCRow r = MCRow.create();
						int len = _headingCols.length > values.length ? values.length: _headingCols.length;
						for(int i = 0; i < len; i++) {
							r.addStringColumn(_headingCols[i], values[i]);
						}
						_labelCols.add(r);
					}
					if(rowIndex == _dataStartIndex) {
						clearReadList();
						_isDataLine = true;
						_totalCnt = 0;
					}
				}
				else if ((rowIndex - _dataStartIndex) % _fetchSize == 0) {
					bulkImp();
				}
				return values;
			}

			@Override
			public void readHeadingLine(String[] values) {
				_headingCols = values;
				// カラム名が未指定のときは適当なカラム名をつけておく（エラー回避のため）
				for (int i = 0; i<_headingCols.length; i++) {
					if (isNull(_headingCols[i])) {
						_headingCols[i] = "_dummy_column_"+i;
					}
				}
				super.readHeadingLine(values);
			}
			
			@Override
			public String setValueBefore(int rowIndex, int colIndex, MCRow r, String value, MCReportMeta rmeta) {
				// コメント行に対する型変換エラーを回避する
				if (rowIndex < _dataStartIndex) {
					return null;
				}
				if (rmeta != null) {
					value = replaceWith(value, _tgt, rmeta.getHeaderName());
					value = trimWith(value, _tgt, rmeta.getHeaderName());
					if (isNull(value)) {
						value = null;
					}
				}
				return super.setValueBefore(rowIndex, colIndex, r, value, rmeta);
			}

			/**
			 * リソースの設定に従って、文字列を変換する。<br>
			 * c.f. String#replaceAll(before, after)
			 * <ul>
			 *  <li>置換対象の文字パタン(before)：リソースキーの読み込み優先順位
			 *   <ol>
			 *    <li>MB.MBBEL0090.replaceWith.[upd_ope/db_class_path].before</li>
			 *    <li>MB.MBBEL0090.replaceWith.default.before</li>
			 *   </ol>
			 *   nullまたは空文字の場合、置換処理を実施しない。
			 *  </li>
			 *  <li>置換文字(after)：リソースキーの読み込み優先順位
			 *   <ol>
			 *    <li>MB.MBBEL0090.replaceWith.target.[upd_ope/db_class_path].after</li>
			 *    <li>MB.MBBEL0090.replaceWith.default.after</li>
			 *   </ol>
			 *   鍵括弧（[]）で囲まれている場合、先頭と末尾の１文字を除外した値を置換文字とみなす。
			 *  </li>
			 * </ul>
			 */
			protected String replaceWith(String val, Upd01_DtlR tgt, String col) {
				if (!isNull(val)) {
					String middleKey = null;
					if (!isNull(tgt.upd_ope())) {
						middleKey = tgt.upd_ope();
					}
					else if (!isNull(tgt.db_class_path())) {
						middleKey = tgt.db_class_path();
					}
					else {
						return val;
					}
					final String[] head = {"MB", "MBBEL0090", "replaceWith"};
					final String[] target = {"target"};
					final String[] tag = middleKey.split("\\.");
					String key = null;

					key = MCConst.createKey(MCCollectionUtil.concat(head, target, tag, new String[] {col, "before"}));
					String before = null;
					if (MCConst.app.containsKey(key)) {
						before = MCConst.app.getString(key);
					}
					else {
						key = MCConst.createKey(MCCollectionUtil.concat(head, new String[] {"default","before"}));
						if (MCConst.app.containsKey(key)) {
							before = MCConst.app.getString(key);
						}
					}
					if (isNull(before)) {
						return val;
					}

					key = MCConst.createKey(MCCollectionUtil.concat(head, target, tag, new String[] {col, "after"}));
					String after = null;
					if (MCConst.app.containsKey(key)) {
						after = MCConst.app.getString(key);
					}
					else {
						key = MCConst.createKey(MCCollectionUtil.concat(head, new String[] {"default","after"}));
						if (MCConst.app.containsKey(key)) {
							after = MCConst.app.getString(key);
						}
					}
					if (after == null) {
						after = "";
					}
					else {
						if (after.startsWith("[") && after.endsWith("]")) {
							after = after.substring(1, after.length() -1);
						}
					}
					return val.replaceAll(before, after);
				}
				return val;
			}

			/**
			 * リソースの設定に従って、空白文字（\s、全角空白）をトリムする。<br>
			 * c.f. MCStringUtil.trim()
			 * <ul>
			 *  <li>リソースキーの読み込み優先順位
			 *   <ol>
			 *    <li>MB.MBBEL0090.trimWith.target.[upd_ope/db_class_path]</li>
			 *    <li>MB.MBBEL0090.trimWith.default</li>
			 *   </ol>
			 *  </li>
			 *  <li>設定値
			 *   <ul>
			 *    <li>BOTH：先頭と末尾の空白文字をトリムする</li>
			 *    <li>NONE：トリムしない</li>
			 *   </ul>
			 *    リソース値にNONEが設定されてない場合、BOTHとみなす。
			 *  </li>
			 * </ul>
			 */
			protected String trimWith(String val, Upd01_DtlR tgt, String col) {
				if (!isNull(val)) {
					String middleKey = null;
					if (!isNull(tgt.upd_ope())) {
						middleKey = tgt.upd_ope();
					}
					else if (!isNull(tgt.db_class_path())) {
						middleKey = tgt.db_class_path();
					}
					else {
						return val;
					}
					final String[] head = {"MB", "MBBEL0090", "trimWith"};
					final String[] target = {"target"};
					final String[] tag = middleKey.split("\\.");
					String key = null;

					key = MCConst.createKey(MCCollectionUtil.concat(head, target, tag, new String[] {col}));
					String trim = null;
					if (MCConst.app.containsKey(key)) {
						trim = MCConst.app.getString(key);
					}
					else {
						key = MCConst.createKey(MCCollectionUtil.concat(head, new String[] {"default"}));
						trim = MCConst.app.getString(key);
					}
					
					if (!isSame(trim, "NONE")) {
						return MCStringUtil.trim(val);
					}
				}
				return val;
			}

			@Override
			public MCRow rowFix(MCRow r, int rowIndex, String[] values, String rType) {
				if(_isDataLine) {
					_totalCnt++;

					MCRow readR = MCRow.create();
					int len = _headingCols.length > values.length ? values.length: _headingCols.length;
					for (int i = 0; i < len; i++) {
						readR.setStringNE(_headingCols[i], values[i]);
					}
					_readOrgL.add(readR);

					readR.setNumberNE(ROW_IDX_COL, _totalCnt);
					r.setNumberNE(ROW_IDX_COL, _totalCnt);

					r.setParamIndex(0);
					r.setParamRowIndex(rowIndex);

					//メッセージに表示される行数に使用される
					r.setGUIIndex(rowIndex);
				}
				else {
					if (rowIndex < _dataStartIndex) {
						r.setBooleanNE(IGN_ROW_FLG_COL, true);
					}
				}

				return r;
			}

			@Override
			public MCReportMeta[] metaFix(MCReportMeta[] rMetas, int rowIndex,
					String[] values, MCRow r, String rType) {
				if(_headingCols == null) {
					return _rptSet.getReportMetaArray(_rptSet.getBlockType(r));
				}
				if(_headingMetaArry == null) {
					List<MCReportMeta> rMetaList = new ArrayList<MCReportMeta>();
					for(String col: _headingCols) {
						MCReportMeta rmeta = _rptSet.getReportMeta(r, col);
						if(rmeta != null) {
							if (rmeta.type() == MCDataType.DATE) {
								if(isSame(rmeta.ID(), MA_META.TM.ID())) {
									rmeta.setFormat(_ctrl.tm_fmt());
								}
								else if(isSame(rmeta.ID(), MA_META.HM.ID())) {
									rmeta.setFormat("HH:mm");
								}
								else {
									rmeta.setFormat(_ctrl.dt_fmt());
								}
							}
							else if(rmeta.type() == MCDataType.TIMESTAMP) {
								rmeta.setFormat(_ctrl.ts_fmt());
							}
							rMetaList.add(rmeta);
						}
						else {
							rMetaList.add(_dmyMeta);
						}
					}
					_headingMetaArry = rMetaList.toArray(new MCReportMeta[rMetaList.size()]);
				}
				return _headingMetaArry;
			}

			@Override
			public void fileCloseAfter() {
				if(_isDataLine && !getReadList().isEmpty()) {
					bulkImp();
				}
				super.fileCloseAfter();
			}
		}
	}

	/** ファイル出力用クラス */
	protected static class BulkImpFileWriter extends BizDatDLer {

		protected BulkImpFileWriter(String path) {
			super(path);
		}

		@Override
		protected void init() {
			_typ = FileInfo.getTyp(getPath());
			if(isSame(_typ, FileInfo.XLSX)) {
				_dler = new BulkImpFileWriterForExcel();
			}
			else {
				_dler = new BulkImpFileWriterForCSV();
			}

			setFont("ＭＳ Ｐゴシック");
			setCharSet(MCReportConst.getDefaultCharset());
		}

		public class BulkImpFileWriterForExcel extends BizDatDLer.BizDatDLerForExcel {

			@Override
			protected CellStyle getDtCellStyle(Cell cell, int cellnum, String fmt) {
				String key = isNull(fmt) ? getDtFmt(): fmt;
				if (!_dtCellStyleMap.containsKey(key)) {
					_dtCellStyleMap.put(key, _wb.getNumCellStyles());
					CellStyle cellStyle = _wb.createCellStyle();
					cellStyle.cloneStyleFrom(cell.getCellStyle());
					cellStyle.setDataFormat(_wb.createDataFormat().getFormat(key));
				}
				return _wb.getCellStyleAt(_dtCellStyleMap.get(key));
			}

			@Override
			protected CellStyle getTsCellStyle(Cell cell, int cellnum, String fmt) {
				String key = isNull(fmt) ? getTsFmt(): fmt;
				if (!_tsCellStyleMap.containsKey(key)) {
					_tsCellStyleMap.put(key, _wb.getNumCellStyles());
					CellStyle cellStyle = _wb.createCellStyle();
					cellStyle.cloneStyleFrom(cell.getCellStyle());
					cellStyle.setDataFormat(_wb.createDataFormat().getFormat(key));
				}
				return _wb.getCellStyleAt(_tsCellStyleMap.get(key));
			}
		}

		public class BulkImpFileWriterForCSV extends BizDatDLerForCSV {
			@Override
			public MCReportMeta[] getWriteReportMetaArray(int rowIndex, MCRow r, String rType) {
				List<MCReportMeta> metaL = new ArrayList<>();
				for (String col: getDatCols()) {
					MCMeta meta = r.getMeta(col);
					if(meta != null) {
						metaL.add(new MCReportMeta(meta, col, nvl(getFmtMap().get(col), ""), "", true));
					}
				}
				return metaL.toArray(new MCReportMeta[0]);
			}
		}
	}

	// ///////////////////// 共通処理 ///////////////////////////////////////////
	/** 出力時上り電文編集共通処理 */
	protected void editUpForPrnt(MCList<Upd01_DtlR> up0, Upd01_CtrlR up1) {
		editUpCom(up0, up1);
		setOutFilePath(up0);
	}

	/**登録時上り電文編集共通処理 */
	protected void editUpForReg(MCList<Upd01_DtlR> up0, Upd01_CtrlR up1) {
		editUpCom(up0, up1);
		decBase64(up0);
	}

	/**上り電文編集共通処理 */
	protected void editUpCom(MCList<Upd01_DtlR> up0, Upd01_CtrlR up1) {
		getMbcBulkImpCtl(up0);
		if(up1 != null) {
			up1.dt_fmt(getDtFmt(up1.fmt_typ()));
			up1.ts_fmt(getTsFmt(up1.fmt_typ()));
			up1.tm_fmt(getTmFmt(up1.fmt_typ()));
		}
	}

	/** まとめ登録実行管理情報を取得する */
	protected void getMbcBulkImpCtl(MCList<Upd01_DtlR> upL) {
		MCList<MBC_BULK_IMP_CTL_R> dbcL = MCList.create(MBC_BULK_IMP_CTL_R.class);
		for(Upd01_DtlR r: upL) {
			MBC_BULK_IMP_CTL_R dbcR = MBC_BULK_IMP_CTL_R.create();
			dbcR.table_id(r.table_id());
			dbcL.add(dbcR);
		}
		MCQueryApiBuilder bldr = MCQueryApiBuilder.create(MBC_BULK_IMP_CTL_R.create("T"));
		dbWkDelete("MBBEL0090_MBW_BULK_IMP_CTL_D01", bldr.getBaseDbc());
		dbWkInsert("MBBEL0090_MBW_BULK_IMP_CTL_I01", dbcL, bldr.getBaseDbc());

		MCList<Upd01_DtlR> l = MCList.create(Upd01_DtlR.class);
		executeQuery(l, MBBEL0090_MBC_BULK_IMP_CTL_S02());
		dbWkDelete("MBBEL0090_MBW_BULK_IMP_CTL_D02", bldr.getBaseDbc());
		MCIndexKey idx = l.createIndex(MBC_BULK_IMP_CTL_R.$table_id);

		for(Upd01_DtlR upR: upL) {
			Upd01_DtlR dbR = l.getFirst(idx, upR.table_id());
			if(dbR != null) {
				upR.db_class_path(dbR.db_class_path());
				upR.chk_ope(dbR.chk_ope());
				upR.upd_ope(dbR.upd_ope());
				upR.table_ctg_seq(dbR.table_ctg_seq());
				upR.table_ctg(dbR.table_ctg());
				upR.table_seq(dbR.table_seq());
			}
		}
	}

	protected String getDtFmt(String fmtTyp) {
		String fmt;
		if(isSame(fmtTyp, "1")) {
			fmt = "MM/dd/yyyy";
		}
		else if(isSame(fmtTyp, "2")) {
			fmt = "dd/MM/yyyy";
		}
		else {
			//デフォルト
			fmt = "yyyy/MM/dd";
		}
		return fmt;
	}

	protected String getTsFmt(String fmtTyp) {
		String fmt;
		if(isSame(fmtTyp, "1")) {
			fmt = "MM/dd/yyyy HH:mm:ss.SSS";
		}
		else if(isSame(fmtTyp, "2")) {
			fmt = "dd/MM/yyyy HH:mm:ss.SSS";
		}
		else {
			//デフォルト
			fmt = "yyyy/MM/dd HH:mm:ss.SSS";
		}
		return fmt;
	}
	protected String getTmFmt(String fmtTyp) {
		String fmt;
		if(isSame(fmtTyp, "1")) {
			fmt = "MM/dd/yyyy HH:mm";
		}
		else if(isSame(fmtTyp, "2")) {
			fmt = "dd/MM/yyyy HH:mm";
		}
		else {
			//デフォルト
			fmt = "yyyy/MM/dd HH:mm";
		}
		return fmt;
	}

	// ///////////////////// File関連 ///////////////////////////////////////////
	/** 出力ファイルパスの設定 */
	protected void setOutFilePath(MCList<Upd01_DtlR> upL) {
		String dir = getOutDir();
		for(Upd01_DtlR r: upL) { 
			r.file_path(getFile(dir, r.file_nm()).getAbsolutePath());
		}
	}

	/** BASE64エンコードされた文字列をデコードしてファイルに出力する。 */
	protected void decBase64(MCList<Upd01_DtlR> l) {
		String dir = getOutDir();
		for(Upd01_DtlR r: l) {
			File file = new File(dir, getCsvFileNm(r.file_nm()));
			r.file_path(file.getAbsolutePath());
			decBase64(r);
			r.file_dat(null);
		}
	}

	/** BASE64エンコードされた文字列をデコードしてファイルに出力する。 */
	protected void decBase64(Upd01_DtlR r) {
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(r.file_path());
			out.write(MCDataConvUtil.decodeBase64(r.file_dat()));
			out.flush();
		}
		catch (IOException ex) {
			throw new MCException(ex);
		}
		finally {
			if (out != null) {
				try {
					out.close();
				}
				catch (IOException ex) {
					throw new MCException(ex);
				}
			}
		}
	}

	/** ファイル出力ディレクトリを取得する */
	protected String getOutDir() {
		String path = MCReportFile.setSeparator(MCReportConf.getDataPath((String) null))
				+ MCSys.request.serverRequestNo();
		File dir = new File(path);
		if (!dir.exists()) {
			dir.mkdirs();
		}
		return path;
	}

	/** 出力ファイルを生成する */
	protected File getFile(String dir, String fileNm) {
		File f = new File(dir, fileNm);
		if(f.exists()) {
			f.delete();
		}
		return f;
	}

	/** サーバ側のファイル名を取得する */
	protected String getCsvFileNm(String upFileNm) {
		//エクセルでもサーバ側ではＣＳＶで受け取っている
		String ext = FileInfo.getTyp(upFileNm);
		if(!isSame(ext ,FileInfo.CSV)) {
			return upFileNm.replaceFirst(ext + "$", FileInfo.CSV);
		}
		return upFileNm;
	}

	/** データ開始行の前まで空白行を追加する */
	protected void addBlankUpToDataStartLine(Upd01_DtlR tgt, Upd01_CtrlR ctrl, BulkImpFileWriter writer, int appendedRowNum) {
		int fillLine = getDataStartRow(tgt, ctrl) - 2 - appendedRowNum;
		
		MCList<MCRow> fillL = MCList.create(MCRow.class);
		for (int i = 1; i <= fillLine; i++) {
			fillL.add(MCRow.create());
		}
		if (!isNull(fillL)) {
			writer.append(fillL);
		}
	}

	// ///////////////////// ユーティリティ ///////////////////////////////////////////
	/** ファイルのヘッダ項目(オペレーションの上り電文項目、或いはＤＢコンテナの列項目）を取得する */
	protected void getHeader(Upd01_DtlR r, boolean chkBase, List<String> colL, List<String> lblL) {
		if(chkBase && !isNull(r.chk_ope())) {
			MCOperation ope = createOperation(r.chk_ope(), null);
			validateOpe(r, ope, null);
			getOpeCols(r, ope, colL, lblL);
		}
		else if(!isNull(r.upd_ope())) {
			MCOperation ope = createOperation(r.upd_ope(), null);
			validateOpe(r, ope, null);
			getOpeCols(r, ope, colL, lblL);
		}
		else {
			getDbcCols(r, createDbcRow(r.db_class_path(), null), colL, lblL);
		}
	}

	/** ファイルのヘッダ項目論理名を取得する */
	protected MCList<MCRow> getHeaderLabel(Upd01_DtlR r, List<String> colL, List<String> lblL) {
		MCRow s = MCRow.create();
		int len = colL.size() > lblL.size() ? lblL.size(): colL.size();
		for(int i = 0; i < len; i++) {
			s.setStringNE(colL.get(i), lblL.get(i));
		}
		MCList<MCRow> l = MCList.create(MCRow.class);
		l.add(s);
		return l;
	}

	/** オペレーションの上り電文項目を取得する */
	protected void getOpeCols(Upd01_DtlR r, MCOperation ope, List<String> colL, List<String> lblL) {
		MCList<MCRow> args = MCList.create(MCRow.class);
		MCLogicUtil.getDefInfo(ope.getOperationInfo(), true, 0, args, "item", "item_lbl", "req");
		for (MCRow arg: args) {
			String col = arg.getString("item");
			if(!MCCollectionUtil.contains(col, getIgnoreCols(r))) {
				colL.add(col);
				lblL.add(arg.getString("item_lbl"));
			}
		}
	}

	/** ＤＢコンテナの列項目を取得する（Ｚ項目と更新対象外カラムを除く） */
	protected void getDbcCols(Upd01_DtlR r, MCDBContainer dbc, List<String> colL, List<String> lblL) {
		String[] cols = dbc.getConstColumnPathArray();
		List<String> skipCols = Arrays.asList(dbc.getUpdSkipColumn());
		for (String s: cols) {
			if(!MCCollectionUtil.contains(s, getIgnoreCols(r))
					&& !skipCols.contains(s)
					&& dbc.getForeignInfoByColumn(s) == null) {
				colL.add(s);
				lblL.add(getDBLabel(dbc.tableName(), s.toUpperCase()));
			}
		}
	}

	/** 読込対象の除外項目を取得する */
	protected String[] getIgnoreCols(Upd01_DtlR r) {
		return _ignCols;
	}

	/** ファイル内のデータ開始行を取得する */
	protected int getDataStartRow(Upd01_DtlR tgt, Upd01_CtrlR ctrl) {
		if(isSame(FileInfo.getTyp(tgt.file_nm()), FileInfo.XLSX)
				&& !isNull(ctrl.data_start_row()) && ctrl.data_start_row().gte(3)) {
			return ctrl.data_start_row().intValue();
		}
		return getIsLabelLine(tgt.table_id()) ? 3 : 2;
	}

	/**
	 * フェッチサイズをMCAppServerリソースから取得する。</br>
	 * 階層化されたリソースキーを以下の順で検索し最初に見つかったキーを返す。 </br>
	 * リソースの設定が無い場合はデフォルト値(def)を返す</br>
	 * <dd>[MB].[bulk_imp].[fetch_size].[read/write].[table_id]</br>
	 * [MB].[bulk_imp].[fetch_size].[read/write]</br>
	 * [MB].[bulk_imp].[fetch_size]</dd>
	 */
	protected int getFetchSize(int def, String... key) {
		String[] keys = new String[key.length + 1];
		keys[0] = _KEY_FETCH_SIZE;
		System.arraycopy(key, 0, keys, 1, key.length);
		for (int i = keys.length; i > 0; i--) {
			String[] k = MCCollectionUtil.subArray(keys, 0, i, String.class);
			int fetchSize = MCConst.app.getInteger(MCConst.createKey(k), -1);
			if (fetchSize > 0) {
				return fetchSize;
			}
		}
		return def;
	}

	/**
	 * ヘッダに論理名行を出力するかをMCAppServerリソースから取得する。</br>
	 * リソースが設定されていない場合はtrue</br>
	 * リソースキーは以下の優先順で検索する。 </br>
	 * <li>[MB].[bulk_imp].[label_line].[table_id]
	 * <li>[MB].[bulk_imp].[label_line]
	 */
	protected boolean getIsLabelLine(String tableId) {
		return getBooleanResource(true, new String[]{_KEY_LABEL_LINE, tableId});
	}

	/**
	 * 入出力ヘッダ項目の取得元をチェックオペレーションとするかをMCAppServerリソースから取得する。</br>
	 * リソースが設定されていない場合はfalse</br>
	 * リソースキーは以下の優先順で検索する。 </br>
	 * <li>[MB].[bulk_imp].[check_ope_base].[table_id]
	 * <li>[MB].[bulk_imp].[check_ope_base]
	 */
	protected boolean getIsChkOpeBase(String tableId) {
		return getBooleanResource(false, new String[]{_KEY_CHKOPE_BASE, tableId});
	}

	/**
	 * MCAppServerリソースからboolean値を取得する。</br>
	 * 設定が無い場合はデフォルト値(def)を返す</br>
	 */
	protected boolean getBooleanResource(boolean def, String[] keys) {
		for (int i = keys.length; i > 0; i--) {
			String[] k = MCCollectionUtil.subArray(keys, 0, i, String.class);
			String key = MCConst.createKey(k);
			if (MCConst.app.containsKey(key)) {
				if(!isNull(MCConst.app.getString(key))) {
					return MCConst.app.getBoolean(key);
				}
			}
		}
		return def;
	}

	/** 処理対象外のオペレーションが設定されていなかチェックする */
	protected void validateOpe(Upd01_DtlR r, MCOperation ope, MCMessageList msgList) {
		if(ope != null && (ope.up(1) != null || !(ope.up(0) instanceof MCList))) {
			MCOperationInfo info = ope.getOperationInfo();
			String opePath = info.moduleId + "." + info.logicId + "." +info.operationId;
			MCMessage m = new MCMessage(MBBEL0020, r.table_id(), opePath);
			if(msgList == null) {
				throw new MCAppException(m);
			}
			msgList.add(m);
		}
	}

	// ///////////////////// Factory ///////////////////////////////////////////
	/** ファイル書込用のWriterを作成する */
	public static BulkImpFileWriter createBulkImpFileWriter(String path) {
		return new BulkImpFileWriter(path);
	}

	/** クラスパスからDBコンテナRowクラスを生成する */
	public static MCDBContainer createDbcRow(String db, MCMessageList msgList) {
		MCDBContainer dbcR = null;
		try {
			Class<?> dbcClazz = Class.forName(db);
			Object obj = MCFactory.invokeStatic(dbcClazz, "create", null, null);
			dbcR = (MCDBContainer) dbcClazz.cast(obj);
			dbcR.setAlias("T");
		}
		catch (Exception ex) {
			MCLog.write(ex);
			MCMessage m = new MCMessage(MBBEL0013, db);
			if(msgList == null) {
				throw new MCAppException(m);
			}
			msgList.add(m);
		}
		return dbcR;
	}

	/** オペレーションを生成する */
	public static MCOperation createOperation(String opePath, MCMessageList msgList) {
		MCOperation ope = null;
		String[] arr = opePath.split("\\.");
		try {
			ope = createOperation(arr[0], arr[1], arr[2], MCOperation.class);
		}
		catch (Exception ex) {
			MCLog.write(ex);
			MCMessage m = new MCMessage(MBBEL0012, opePath);
			if(msgList == null) {
				throw new MCAppException(m);
			}
			msgList.add(m);
		}
		return ope;
	}

	/**
	 * 論理削除フラグ制御のオン・オフを設定します。<p>
	 * @param flg 論理削除フラグ制御のオン・オフ<p>
	 */
	protected void setDelFlgCtl(boolean flg) {
		MCRow r = MCRow.create();
		r.setStringNE("del_flg_ctl", MCBooleanUtil.booleanToDBString(flg));
		String procid = "MAPA_CONTEXT$SET_DEL_FLG_CTL";
		execProc(createSqlId(LOGIC_ID, procid, "01"), procid, r, ":del_flg_ctl");
	}

	//FMCB CUSTOM END
}