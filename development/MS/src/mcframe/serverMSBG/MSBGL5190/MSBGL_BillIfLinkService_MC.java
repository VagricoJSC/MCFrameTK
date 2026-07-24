package mcframe.serverMSBG.MSBGL5190;

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
import mcframe.serverMS.dbc.*;
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
import mcframe.serverMSBG.MSBGL5190.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverPFBZ.PFBZL9050.*;
import mcframe.serverPFUD.PFUDL5020.*;
import mcframe.serverPF.dbc.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverMBBC.MBBCL5030.MBBCL_InvoiceAgentLinkService;
import mcframe.serverMBBC.MBBCL5030.IALink_Copy01_DtlR;
import mcframe.commonCore.sys.*;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys.*;
import static mcframe.commonPF.notice.PF_Msg.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import org.apache.commons.io.FileUtils;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBGL_BillIfLinkService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBGL_BillIfLinkService_MC extends MSBGL_BillIfLinkService_MC_A{
	//FMCB CUSTOM START
	
	// キャッシュ
	protected static final Class<MSBGL_BillIfLinkService> CLAZZ = MSBGL_BillIfLinkService.class;
	
	//プレースホルダ
	protected static final String DIR_CO_CD = "{CO_CD}";
	protected static final String DIR_TRD_YM = "{TRD_YM}";
	protected static final String DIR_BIZ_TYP = "{BIZ_TYP}";
	
	/**
	 * Send_Chk01オペレーション.<p>
	 *
	 * 送信前チェック<br>
	 */
	public class Send_Chk01 extends MSBGL_BillIfLinkService_MC_A.Send_Chk01 {
		protected Map<String, Map<String, String>> _extParamMap = new HashMap<>();
		
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
		protected mcframe.commonCore.notice.MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			checkIfProcTyp(up0(), msgList);
			return msgList;
		}
		/**
		 * ＩＦ処理区分のチェック
		 */
		protected <R extends MCRow> void checkIfProcTyp(R row, MCMessageList msgList) {
			String ifProcTyp = row.getString(MAM_IF_PROTOCOL_R.$if_proc_typ);
			if (!isNull(ifProcTyp) && !MAC_IF_PROC_TYP.isBILL_SEND(ifProcTyp)) {
				msgList.add(new MCMessage(MSBGL0601, ifProcTyp));
			}
		}
		
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}
		
	}
	/**
	 * Send_Upd01オペレーション.<p>
	 *
	 * 請求ＩＦ送信サービスを実行する<br>
	 */
	public class Send_Upd01 extends MSBGL_BillIfLinkService_MC_A.Send_Upd01 {
		/** 対象件数 */
		protected int _totalCnt = 0;
		/** 正常終了件数 */
		protected int _successCnt = 0;
		/** エラー件数 */
		protected int _errorCnt = 0;
		/** スキップ件数 */
		protected int _skipCnt = 0;
		
		/**
		 * 送受信日時
		 */
		protected MCDate _sdrvTm = MCDate.now();
		
		/**
		 * 送信対象取得（PFUDL5020#Srch02）の下り電文を設定
		 */
		protected MCList<Srch02_DtlR> _ifL = MCList.create(Srch02_DtlR.class);
		
		/**
		 * 送信制御トラン更新用
		 */
		protected MCList<PFT_SDRV_IF_R> _upL = MCList.create(PFT_SDRV_IF_R.class);
		
		/**
		 * 例外発生フラグ
		 */
		protected boolean _exceptionFlg = false;
		
		/**
		 * 送信エラーフラグ
		 */
		protected Boolean _sendErrFlg = false;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				initLogger();
				writeStartLog();
				execMain();
			}
			catch (Exception ex) {
				procEndLog(ex);
				_exceptionFlg = true;
				throw ex;
			}
			finally {
				writeEndLog();
			}
		}
		
		/**
		 * メイン処理
		 */
		protected void execMain() {
			callThisChk01();
			throwUpdErr();
			srchSdrvIfAndLock();
			if (_ifL.isEmpty()) {
				procEndLog();
				return;
			}
			setLogKey(_ifL);
			sort();
			send();
		}
		
		protected void callThisChk01() {
			MSBGL_BillIfLinkService.Send_Chk01 o = MSBGL_BillIfLinkService.crtSend_Chk01();
			MCRow.copyall(o.up0(), up0());
			o.exec();
			MCRow.copyall(up0(), o.down0());
		}
		
		/**
		 * バッチログを初期化する
		 */
		protected void initLogger() {
			getConcurrentLogger();
		}
		
		/**
		 * 開始ログを出力する。
		 */
		protected void writeStartLog() {
			logger().writeStartLog(MSBGL0602);
			pushStartLog(logger());
		}
		
		/**
		 * ログのキーをセットする
		 */
		protected void setLogKey(MCList<? extends MCRow> keyL) {
			if (isNull(keyL) || keyL.isEmpty()) {
				return;
			}
			if (keyL.get(0).contains(SdrvDtlR.$sdrvIf)) {
				MCList<PFT_SDRV_IF_R> sdrvL =keyL.innerRowList(SdrvDtlR.$sdrvIf, PFT_SDRV_IF_R.class);
				logger().setLogKey(sdrvL
						, PFT_SDRV_IF_R.$batch_log_no
						, PFT_SDRV_IF_R.$log_sub_key1
						, PFT_SDRV_IF_R.$log_sub_key2);
			}
			else {
				logger().setLogKey(keyL);
			}
		}
		
		/**
		 * 処理ログを表示する
		 */
		protected void procEndLog(Exception ex) {
			logger().writeProcessLog(
				ex instanceof MCException ? (MCException)ex :  new MCException(ex));
			MCMessagePool.clear();
		}
		
		/**
		 * 処理ログを表示する
		 */
		protected void procEndLog() {
			logger().writeDataLog(MCMessagePool.getMessageList());
			MCMessagePool.clear();
			if (_totalCnt != 0) {
				logger().writeProcessLog(MSBGL0603, _totalCnt, _successCnt, _errorCnt, _skipCnt);
			}
		}
		
		/**
		 * 終了ログを表示する
		 */
		protected void writeEndLog() {
			logger().writeDataLog(MCMessagePool.getMessageList());
			MCMessagePool.clear();
			if (_errorCnt > 0 || _exceptionFlg) {
				logger().writeProcessLog(MAUDL0009);
				MCMessagePool.add(new MCMessage(MAUDL0009));
				pushErrorLog(logger());
			}
			else if (_totalCnt == 0) {
				logger().writeProcessLog(MAUDL0008);
				MCMessagePool.add(new MCMessage(MAUDL0008));
			}
			logger().writeEndLog(MSBGL0604);
			pushEndLog(logger());
			logger().close();
		}
		
		/**
		 * 送信対象データを検索し、ロックする。
		 */
		protected void srchSdrvIfAndLock() {
			PFBZL_SendRecvIfCtrl.Srch02 ope = PFBZL_SendRecvIfCtrl.crtSrch02();
			copy(ope.up0(), up0(), createMap_Srch02_CndR_Send_DtlR());
			ope.exec();
			
			// ＩＦ通信ルールマスタのチェックは使用しないため、検索処理のエラーメッセージと送受信状況区分をクリアする。
			MCMessagePool.clear();
			_ifL = ope.down0();
			_ifL.setStringNE(SdrvDtlR.$sdrv_sts_typ, null);
		}
		
		protected Map_Srch02_CndR_Send_DtlR<Srch02_CndR,Send_DtlR> createMap_Srch02_CndR_Send_DtlR() {
			return new Map_Srch02_CndR_Send_DtlR<Srch02_CndR, Send_DtlR>();
		}

		public class Map_Srch02_CndR_Send_DtlR<D extends Srch02_CndR, S extends Send_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch02_CndR.$if_proc_typ, Send_DtlR.$if_proc_typ);
				addColumnPathMap(Srch02_CndR.$ext_sys_cd, Send_DtlR.$ext_sys_cd);

			}
		}
		
		protected void sort() {
			_ifL.sort(PFT_IF_FILE_R.$file_id, PFT_SDRV_IF_R.$data_no);
		}
		
		/**
		 * ファイル送信処理
		 */
		protected void send() {
			createCache();
			for (MCList<Srch02_DtlR> sendL : _ifL.groupList(PFT_SDRV_IF_FILE_R.$file_id)) {
				// 送信エラーが発生した場合、残りのファイルはスキップする。
				if (_sendErrFlg) {
					break;
				}
				
				String svp = "svp_" + sendL.get(0).file_id().toString();
				try {
					dbTran().setSavepoint(svp);
					
					send(sendL);
					preUpdSendIf(sendL);
					updIfFile();
					updSdrvIf();
					updEsbIf(sendL);
				}
				catch (Exception ex) {
					dbTran().rollback(svp);
					handleEx(ex, sendL);
					_sendErrFlg = true;
				}
			}
			rsltCnt(_ifL);
			procEndLog();
		}
		
		/**
		 * ファイル送信処理
		 */
		protected void send(MCList<Srch02_DtlR> sendL) {
			Srch02_DtlR dtlR = sendL.get(0);
			try {
				logger().writeProcessLog(PFBZL0032, dtlR.file_nm());
				attachFile(dtlR);
				sendL.setStringNE(SdrvDtlR.$sdrv_sts_typ, MAC_SDRV_STS_TYP.SEND_OK.value());
				moveToTrash(dtlR.file_path(), dtlR.file_nm());
			}
			catch (MCException ex) {
				sendL.setStringNE(SdrvDtlR.$sdrv_sts_typ, MAC_SDRV_STS_TYP.SEND_ERR.value());
				handleEx(ex, sendL);
				if (!isSame(ex.getID(), PFUCL0006)) {	// ファイルの移動以外のエラー
					moveToErr(dtlR.file_path(), dtlR.file_nm());
				}
				_sendErrFlg = true;
			}
		}
		
		/**
		 * 送信IF更新の前処理
		 */
		protected void preUpdSendIf(MCList<Srch02_DtlR> sendL) {
			setAll(_upL, sendL, createTo_PFT_SDRV_IF_R_Fr_Srch02_DtlR());
		}
		
		/**
		 * ESBインターフェーステーブルの更新処理
		 * @param dtlL
		 */
		protected void updEsbIf(MCList<Srch02_DtlR> dtlL) {
			if (isNull(dtlL) || dtlL.isEmpty()) {
				throw new MCException(PFBZL0048);
			}
			PFBZL_SendRecvIfCtrl.UpdEsb01 ope = PFBZL_SendRecvIfCtrl.crtUpdEsb01();
			for (MCList<Srch02_DtlR> subL : dtlL.groupList(Srch02_DtlR.$if_proc_typ)) {
				String tblNm = MAC_IF_PROC_TYP.upd_if_tbl(subL.get(0).if_proc_typ());
				if (isNull(tblNm)) {
					throw new MCException(PFBZL0049);
				}
				setAll(ope.up0(), subL , createMap_UpdEsb01_DtlR_Srch02_DtlR());
				ope.setEsbIfTblNm(tblNm);
				ope.setSdrvFlg(true);
				ope.exec();
			}
		}
		
		protected Map_UpdEsb01_DtlR_Srch02_DtlR<UpdEsb01_DtlR,Srch02_DtlR> createMap_UpdEsb01_DtlR_Srch02_DtlR() {
			return new Map_UpdEsb01_DtlR_Srch02_DtlR<UpdEsb01_DtlR, Srch02_DtlR>();
		}
		
		public class Map_UpdEsb01_DtlR_Srch02_DtlR<D extends UpdEsb01_DtlR, S extends Srch02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(UpdEsb01_DtlR.$data_no, Srch02_DtlR.$data_no);
				addColumnPathMap(UpdEsb01_DtlR.$sdrv_sts_typ, Srch02_DtlR.$sdrv_sts_typ);

			}
		}
		
		/**
		 * PFT_SDRV_IFの更新
		 */
		protected void updSdrvIf() {
			PFT_SDRV_IF_R t = PFT_SDRV_IF_R.create("T");
			execDbUpdateKey("MSBGL5190_PFT_SDRV_IF_U01", t, _upL, t.sdrv_sts_typ, t.sdrv_tm,
					t.batch_log_no, t.log_sub_key1, t.log_sub_key2);
		}
		
		/**
		 * PFT_IF_FILEの更新
		 */
		protected void updIfFile() {
			PFT_IF_FILE_R dbc = PFT_IF_FILE_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
			builder.setSet(dbc.fproc_typ);
			dbUpdateKey("MSBGL5190_PFT_IF_FILE_U01", _upL, builder);
		}
		
		protected To_PFT_SDRV_IF_R_Fr_Srch02_DtlR<PFT_SDRV_IF_R, Srch02_DtlR> createTo_PFT_SDRV_IF_R_Fr_Srch02_DtlR() {
			return new To_PFT_SDRV_IF_R_Fr_Srch02_DtlR<PFT_SDRV_IF_R, Srch02_DtlR>();
		}
		
		public class To_PFT_SDRV_IF_R_Fr_Srch02_DtlR<D extends PFT_SDRV_IF_R, S extends Srch02_DtlR>
				extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PFT_SDRV_IF_R.$data_no, Srch02_DtlR.$data_no);
				addColumnPathMap(PFT_SDRV_IF_R.$if_proc_typ, Srch02_DtlR.$if_proc_typ);
				addColumnPathMap(PFT_SDRV_IF_R.$sdrv_sts_typ, Srch02_DtlR.$sdrv_sts_typ);
				addColumnPathMap(PFT_SDRV_IF_R.$batch_log_no, Srch02_DtlR.$batch_log_no);
				addColumnPathMap(PFT_SDRV_IF_R.$log_sub_key1, Srch02_DtlR.$log_sub_key1);
				addColumnPathMap(PFT_SDRV_IF_R.$log_sub_key2, Srch02_DtlR.$log_sub_key2);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				dest.setNumberNE(PFT_IF_FILE_R.$file_id, src.file_id());
				if (MAC_SDRV_STS_TYP.isSEND_OK(dest.sdrv_sts_typ())) {
					dest.sdrv_tm(_sdrvTm);
					dest.setStringNE(PFT_IF_FILE_R.$fproc_typ, MAC_FPROC_TYP.OK.value());
					dest.setStringNE(_$exe_sts_typ, MAC_EXE_STS_TYP.OK.value());
				}
				else {
					dest.setStringNE(PFT_IF_FILE_R.$fproc_typ, MAC_FPROC_TYP.ERR.value());
					dest.setStringNE(_$exe_sts_typ, MAC_EXE_STS_TYP.ERR.value());
				}
			}
		}
		
		/**
		 * 実行結果の件数をカウントする
		 * 
		 * @param e
		 * @param ifL
		 */
		protected void rsltCnt(MCList<Srch02_DtlR> ifL) {
			for (Srch02_DtlR ifR : ifL) {
				String sdrvStsTyp = ifR.sdrv_sts_typ();
				if (MAC_SDRV_STS_TYP.isSEND_ERR(sdrvStsTyp)) {
					_errorCnt++;
				}
				else if (MAC_SDRV_STS_TYP.isSEND_OK(sdrvStsTyp)) {
					_successCnt++;
				}
				else {
					_skipCnt++;
				}
				_totalCnt++;
			}
		}
		
		/**
		 * エラー処理を行う
		 * 
		 * @param e
		 * @param ifL
		 */
		protected void handleEx(Exception e, MCList<?> ifL) {
			MCException ex = e instanceof MCException ? (MCException)e : new MCException(e);
			if (isNull(ex.getCauseRow())) {
				for (MCRow ifR : ifL) {
					MCMessagePool.add(ifR, null,
						ex.getID(), (Object[])ex.getBindArray());
				}
			}
			else {
				MCMessagePool.add(ex.getCauseRow(), ex.getCauseColumn(),
					ex.getMCMessage().getID(), (Object[])ex.getBindArray());
			}
			for (MCMessage msg : ex.getCauseMessageList()) {
				for (MCRow ifR : ifL) {
					MCMessagePool.add(
						ifR, null, msg.getID(), (Object[])msg.getBindArray());
				}
			}
			if (ex.getCause() != null) {
				Throwable th = ex.getCause();
				MCException cause = th instanceof MCException ? (MCException)th : new MCException(th);
				for (MCRow ifR : ifL) {
					MCMessagePool.add(
						ifR, null, cause.getID(), (Object[])cause.getBindArray());
				}
			}

			MCLog.write(e);
		}
		
		/**
		 * ファイル連携処理の実行
		 */
		protected void attachFile(Srch02_DtlR dtlR) {
			
			File tmpDir = createTempDir();
			try {
				attachFileMain(tmpDir, dtlR);
			}
			finally {
				deleteTempDir(tmpDir);
			}
		}
		
		protected File createTempDir() {
			Path p;
			File f;
			try {
				p = Files.createTempDirectory("mcf_");
				f = p.toFile();
			}
			catch (IOException e) {
				throw new MCException(e);
			}
			return f;
		}
		
		protected void deleteTempDir(File tmpDir) {
			try {
				FileUtils.deleteDirectory(tmpDir);
			}
			catch (IOException e) {
				throw new MCException(e);
			}
		}
		
		/**
		 * 請求ＩＦ送信のＡＰＩ呼出し用のサービスを実行
		 * @param tmpDir
		 * @param dtlR
		 */
		protected void attachFileMain(File tmpDir, Srch02_DtlR dtlR) {
			MBBCL_InvoiceAgentLinkService.IALink_Copy01 ope = MBBCL_InvoiceAgentLinkService.crtIALink_Copy01();
			
			File f = outputTmpFile(tmpDir, dtlR);
			IALink_Copy01_DtlR addR = ope.up0().add();
			addR.ext_sys_cd(up0().ext_sys_cd());
			addR.src_file(f.getAbsolutePath());
			addR.file_path(getFilePath(dtlR));
			addR.file_name(getFileName(dtlR));
			addR.overwrite_flg(getOverwriteFlg());
			
			if (!ope.up0().isEmpty()) {
				ope.exec();
			}
		}
		
		protected File outputTmpFile(File tmpDir, Srch02_DtlR dtlR) {
			File srcFile = new File(dtlR.file_path(),dtlR.file_nm());
			Path src = Paths.get(srcFile.getAbsolutePath());
			Path dest = Paths.get(tmpDir.getAbsolutePath(), dtlR.file_nm());
			try {
				Files.copy(src, dest, REPLACE_EXISTING);
			}
			catch (IOException e) {
				throw new MCException(e);
			}
			return new File(dest.toString());
		}
		
		protected String getFileName(Srch02_DtlR dtlR) {
			return dtlR.file_nm();
		}
		
		/**
		 * 帳票保存先マスタのキャッシュから保存先のパスを取得する
		 */
		protected String getFilePath(Srch02_DtlR dtlR) {
			MAM_REPORT_STRG_PATH_R pathR = getCacheRptPath(getBizTyp());
			if (!isNull(pathR)) {
				return convPlaceHolder(pathR.report_strg_path(), dtlR);
			}
			throw new MCException(MSBGL0605,getBizTyp());
			
		}
		
		protected String getBizTyp() {
			return MAC_BIZ_TYP.BILL_IF_SND.value();
		}
		
		protected boolean getOverwriteFlg() {
			return false;
		}
		
		/**
		 * キャッシュ作成を行う
		 */
		protected void createCache(){
			MCList<MAM_REPORT_STRG_PATH_R> upL = MCList.create(MAM_REPORT_STRG_PATH_R.class);
			MAM_REPORT_STRG_PATH_R upR = MAM_REPORT_STRG_PATH_R.create();
			upR.biz_typ(getBizTyp());
			upL.add(upR);
			createRptPathCache(upL);
		}
		
		protected String convPlaceHolder(String path, Srch02_DtlR r) {
			String tmp = path;
			if (!isNull(tmp)) {
				tmp = tmp.replace(DIR_CO_CD, MCSys.user.coCD());
				MCDate dt = _sdrvTm;
				tmp = tmp.replace(DIR_TRD_YM, isNull(dt) ? "" : dt.toString("yyyyMM"));
				String str = getBizTyp();
				tmp = tmp.replace(DIR_BIZ_TYP, isNull(str) ? "null" : str);
			}
			return tmp;
		}
	}
	
	
	/**
	 * キャッシュ（帳票保存先マスタ）
	 */
	protected FXUCL_MCDbcCache<MAM_REPORT_STRG_PATH_R> _cacheRptPath;
	protected void createRptPathCache(MCList<MAM_REPORT_STRG_PATH_R> upL) {
		MCList<MAM_REPORT_STRG_PATH_R> bindL = upL.groupBy(MAM_REPORT_STRG_PATH_R.$biz_typ, MAM_REPORT_STRG_PATH_R.$bp_cd);
		MCList<MAM_REPORT_STRG_PATH_R> bizL = bindL.groupBy(MAM_REPORT_STRG_PATH_R.$biz_typ);
		MCList<MAM_REPORT_STRG_PATH_R> bpL = bindL.groupBy(MAM_REPORT_STRG_PATH_R.$bp_cd);
		bizL.setStringNE(MAM_REPORT_STRG_PATH_R.$bp_cd, MAC_STR.NULL_VAL.value());
		bindL.addAll(bizL);
		bpL.setStringNE(MAM_REPORT_STRG_PATH_R.$biz_typ, MAC_STR.NULL_VAL.value());
		bindL.addAll(bpL);
		MAM_REPORT_STRG_PATH_R r = bindL.createRow();
		r.biz_typ(MAC_STR.NULL_VAL.value());
		r.bp_cd(MAC_STR.NULL_VAL.value());
		bindL.add(r);
		MAM_REPORT_STRG_PATH_R t = MAM_REPORT_STRG_PATH_R.create("T");
		MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
		bldr.setSelect(t.biz_typ, t.bp_cd, t.report_strg_path, t.del_flg);
		object(CLAZZ)._cacheRptPath = new FXUCL_MCDbcCache<MAM_REPORT_STRG_PATH_R>(bldr,
				bindL, MAM_REPORT_STRG_PATH_R.$biz_typ, MAM_REPORT_STRG_PATH_R.$bp_cd);
	}
	
	/**
	 * 取引先ＣＤが未指定のレコードを取得する
	 * @param bizTyp
	 * @return
	 */
	protected MAM_REPORT_STRG_PATH_R getCacheRptPath(String bizTyp) {
		MAM_REPORT_STRG_PATH_R r = object(CLAZZ)._cacheRptPath.get(bizTyp, MAC_STR.NULL_VAL.value());
		if (!isNull(r.biz_typ()) && !r.del_flg()) {
			return r;
		}
		r = object(CLAZZ)._cacheRptPath.get(MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value());
		if (!isNull(r.biz_typ()) && !r.del_flg()) {
			return r;
		}
		return null;
	}

	//FMCB CUSTOM END
}