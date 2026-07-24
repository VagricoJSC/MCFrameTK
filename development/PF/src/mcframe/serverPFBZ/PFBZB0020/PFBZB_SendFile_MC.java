package mcframe.serverPFBZ.PFBZB0020;

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
import mcframe.serverPF.dbc.*;
import static mcframe.commonPF.notice.PF_Msg.*;

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
import static mcframe.serverPF.dbc.PFFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.commonCore.net.*;
import mcframe.serverPFUD.PFUDL5020.*;
import mcframe.serverPFBZ.PFBZL9050.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import static mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.commonCore.net.PROTOCOL_TYPE;
//FMCB CUSTOM_IMPORT END

/**
 * "PFBZB_SendFile"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class PFBZB_SendFile_MC extends PFBZB_SendFile_MC_A{
	//FMCB CUSTOM START

	/** 対象件数 */
	protected int _totalCnt = 0;
	/** 正常終了件数 */
	protected int _successCnt = 0;
	/** エラー件数 */
	protected int _errorCnt = 0;
	/** スキップ件数 */
	protected int _skipCnt = 0;

	/** 全対象件数 */
	protected int _sumTotalCnt = 0;
	/** 全エラー件数 */
	protected int _sumErrorCnt = 0;

	/** MCMessagePool退避用 */
	protected MCMessageList _buMessageList = new MCMessageList();
	/**
	 * Send01オペレーション.<p>
	 *
	 * ＩＦファイルを送信する。<br>
	 */
	public class Send01 extends PFBZB_SendFile_MC_A.Send01 {

		/**
		 * 送信日時
		 */
		protected MCDate _send_tm = MCDate.now();
		
		/**
		 * PFUDL5020内のメッセージを格納
		 */
		protected MCMessageList _msgL = new MCMessageList();
		
		/**
		 * 送信対象取得（PFUDL5020#Srch02）の下り電文を設定
		 */
		protected MCList<Srch02_DtlR> _ifL = MCList.create(Srch02_DtlR.class);
		
		/**
		 * 送信制御トラン更新用
		 */
		protected MCList<PFT_SDRV_IF_R> _upL = MCList.create(PFT_SDRV_IF_R.class);
		
		/**
		 * FTP送信の単位
		 */
		protected final String[] _$ftpInfo = {
			MAC_IF_CTL_TYP.FTP_HOST.value(),
			MAC_IF_CTL_TYP.FTP_USER.value(),
			MAC_IF_CTL_TYP.FTP_PASS.value(),
			MAC_IF_CTL_TYP.TRANSFER_LOCK_TYP.value(),
			MAC_IF_CTL_TYP.FTP_PORT.value(),
			MAC_IF_CTL_TYP.FTP_MODE.value(),
			MAC_IF_CTL_TYP.FTP_OPTS.value()
		};

		/**
		 * FTPクライアント
		 */
		protected MCFtpClient _ftpClnt = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			initLog();

			try {
				readSdrvIf();
				if (_ifL.isEmpty()) {
					procEndLog();
					return;
				}
				setLogKey(_ifL);
				sort();
				send();
			}
			catch (Exception ex) {
				procEndLog(ex);
				throw ex;
			}
			finally {
				writeEndLog();
			}
		}

		/**
		 * バッチログを初期化する
		 */
		protected void initLog() {
			getLogger();
			logger().writeStartLog(PFBZL0042);
			pushStartLog(logger());
		}

		/**
		 * ログのキーをセットする
		 */
		protected void setLogKey(MCList<? extends MCRow> keyL) {
			if(keyL == null || keyL.isEmpty()) {
				return;
			}
			if(keyL.get(0).contains(SdrvDtlR.$sdrvIf)) {
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
		 * 開始ログを出力する。
		 */
		protected void writeStartLog(Srch02_DtlR dtlR) {
			
			String sendTyp = ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.SEND_TYP, dtlR.if_proc_typ());
			if (isSame(_send_typ_ftp, sendTyp)) {
				logger().writeProcessLog(PFBZL0029,
					dtlR.ext_sys_cd(),
					dtlR.if_proc_typ(), 
					_send_typ_ftp_msg,
					dtlR.file_path(), 
					ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.SEND_RMT_DIR, dtlR.if_proc_typ()),
					ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.FTP_HOST, dtlR.if_proc_typ()),
					ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.FTP_USER, dtlR.if_proc_typ()),
					ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.FTP_OPTS, dtlR.if_proc_typ())
				);
			}
			else if(isSame(_send_typ_sftp, sendTyp)) {
				logger().writeProcessLog(PFBZL0029,
					dtlR.ext_sys_cd(),
					dtlR.if_proc_typ(), 
					_send_typ_sftp_msg,
					dtlR.file_path(), 
					ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.SEND_RMT_DIR, dtlR.if_proc_typ()),
					ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.SFTP_HOST, dtlR.if_proc_typ()),
					ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.SFTP_USER, dtlR.if_proc_typ()),
					"-");
			}
			else if (isSame(_send_typ_copy, sendTyp)) {
				logger().writeProcessLog(PFBZL0029,
					dtlR.ext_sys_cd(),
					dtlR.if_proc_typ(),
					_send_typ_copy_msg,
					dtlR.file_path(), 
					ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.SEND_RMT_DIR, dtlR.if_proc_typ()),
					"-", "-", "-");
			}
			else {
				logger().writeProcessLog(PFBZL0063,
					dtlR.ext_sys_cd(),
					dtlR.if_proc_typ(),
					ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.SEND_TYP, dtlR.if_proc_typ()));
			}
		}

		/**
		 * 処理ログを表示する
		 */
		protected void procEndLog(Exception ex) {
			logger().writeProcessLog(
				ex instanceof MCException ? (MCException)ex :  new MCException(ex));
		}

		/**
		 * 処理ログを表示する
		 */
		protected void procEndLog() {
			logger().writeDataLog(MCMessagePool.getMessageList());
			_buMessageList.addAll(MCMessagePool.getMessageList());
			MCMessagePool.clear();
			if (_totalCnt == 0) {
				logger().writeProcessLog(PFBZL0030);
			}
			else {
				logger().writeProcessLog(PFBZL0031, _totalCnt, _successCnt, _errorCnt, _skipCnt);
			}
		}

		/**
		 * 処理ログを表示する
		 */
		protected void writeEndLog() {
			logger().writeDataLog(MCMessagePool.getMessageList());
			MCMessagePool.clear();
			// メッセージ退避リストからMCMessagePoolを復元
			MCMessagePool.addAll(_buMessageList);
			if(_sumTotalCnt == 0) {
				logger().writeProcessLog(MAUDL0008);
				MCMessagePool.add(new MCMessage(MAUDL0008));
			}
			else if (_sumErrorCnt > 0) {
				logger().writeProcessLog(MAUDL0009);
				MCMessagePool.add(new MCMessage(MAUDL0009));
				pushErrorLog(logger());
			}
			logger().writeEndLog(PFBZL0043);
			pushEndLog(logger());
		}
		
		protected void readSdrvIf() {
			PFBZL_SendRecvIfCtrl.Srch02 ope = PFBZL_SendRecvIfCtrl.crtSrch02();
			copy(ope.up0(), up0(), createSrch02_CndR_CndR());
			ope.exec();
			_msgL.addAll(MCMessagePool.getMessageList());
			MCMessagePool.clear();

			_ifL = ope.down0();
		}

		protected SrchCndR_CndR<mcframe.serverPFBZ.PFBZL9050.Srch02_CndR, CndR> createSrch02_CndR_CndR() {
			return new SrchCndR_CndR<mcframe.serverPFBZ.PFBZL9050.Srch02_CndR, CndR>();
		}
		
		public class SrchCndR_CndR<D extends mcframe.serverPFBZ.PFBZL9050.Srch02_CndR, S extends CndR>
				extends MCRowMapper<D,S>{
			@Override
			public void valueCopy(D dest, S src){
				dest.if_proc_typ(src.if_proc_typ());
				dest.ext_sys_cd(src.ext_sys_cd());
			}
		}

		protected void sort() {
			_ifL.sort(PFT_SDRV_IF_R.$if_proc_typ
					, PFT_IF_FILE_R.$file_id
					, PFT_SDRV_IF_R.$data_no);
		}

		protected void send() {

			String[] grpKey = {PFT_SDRV_IF_R.$if_proc_typ
					, PFT_SDRV_IF_R.$ext_sys_cd};
			
			for (MCList<Srch02_DtlR> ifL : _ifL.groupList(grpKey)) {
				
				//通信ルールマスタのデータを取得
				Srch02_DtlR r = ifL.get(0);
				ifPrtclMgr().set(r);
				writeStartLog(r);
				String sendTyp = ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.SEND_TYP,
						r.if_proc_typ());
				if (!isSame(_send_typ_copy, sendTyp) && !isSame(_send_typ_ftp, sendTyp) && !isSame(_send_typ_sftp, sendTyp)) {
					continue;
				}
				
				for (MCList<Srch02_DtlR> sendL : ifL.groupList(PFT_SDRV_IF_FILE_R.$file_id)) {
					String svp = "svp_" + sendL.get(0).file_id().toString();
					try {
						dbTran().setSavepoint(svp);

						setMsgPoolCauseRows(sendL);
						send(sendL);
						preUpdSendIf(sendL);
						updIfFile();
						updSdrvIf();
						updEsbIf(sendL);
					}
					catch (Exception ex) {
						dbTran().rollback(svp);
						handleEx(ex, sendL);
					}
				}
				rsltCnt(ifL);
				procEndLog();
			}
		}

		protected void send(MCList<Srch02_DtlR> sendL) {

			Srch02_DtlR dtlR = sendL.get(0);
			try {
				if (MAC_SDRV_STS_TYP.isSEND_ERR(dtlR.sdrv_sts_typ())) {
					moveToErr(dtlR.file_path(), dtlR.file_nm());
				}
				else if (!ftpSend(dtlR)) {
					for (String file_nm : _ftpClnt.getFailFileNames()) {
						if (isSame(dtlR.file_nm(), file_nm)) {
							handleEx(_ftpClnt.getFailMCExceptionByFileName(file_nm), sendL);
							break;
						}
					}
					sendL.setStringNE(SdrvDtlR.$sdrv_sts_typ, MAC_SDRV_STS_TYP.SEND_ERR.value());
					moveToErr(dtlR.file_path(), dtlR.file_nm());
				}
				else {
					sendL.setStringNE(SdrvDtlR.$sdrv_sts_typ, MAC_SDRV_STS_TYP.SEND_OK.value());
					moveToTrash(dtlR.file_path(), dtlR.file_nm());
				}
			}
			catch (MCException ex) {
				sendL.setStringNE(SdrvDtlR.$sdrv_sts_typ, MAC_SDRV_STS_TYP.SEND_ERR.value());
				handleEx(ex, sendL);
				if (!isSame(ex.getID(), PFUCL0006)) {	// ファイルの移動以外のエラー
					moveToErr(dtlR.file_path(), dtlR.file_nm());
				}
			}
		}

		protected boolean ftpSend(Srch02_DtlR dtlR) {

			boolean isFtp = isSame(ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.SEND_TYP,
					dtlR.if_proc_typ()), _send_typ_ftp) ? true : false;

			boolean isSftp = isSame(ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.SEND_TYP,
					dtlR.if_proc_typ()), _send_typ_sftp) ? true : false;

			MCNumber wkMax = null;
			MCNumber wkWait = null;
			if (isFtp) {
				wkMax = ifPrtclMgr().getIfCtlNumber(MAC_IF_CTL_TYP.FTP_RTRY_CNT,
						dtlR.if_proc_typ());
				wkWait = ifPrtclMgr().getIfCtlNumber(MAC_IF_CTL_TYP.FTP_WAIT_SEC,
						dtlR.if_proc_typ());
			}
			else if (isSftp) {
				wkMax = ifPrtclMgr().getIfCtlNumber(MAC_IF_CTL_TYP.SFTP_RTRY_CNT,
						dtlR.if_proc_typ());
				wkWait = ifPrtclMgr().getIfCtlNumber(MAC_IF_CTL_TYP.SFTP_WAIT_SEC,
						dtlR.if_proc_typ());
			}
			int max = 0;
			if (!isNull(wkMax)) {
				max = wkMax.intValue(); // リトライ回数
			}
			else {
				max = 3; // 指定なしの場合 リトライ  3回
			}

			int wait = 0;
			if (!isNull(wkWait)) {
				wait = wkWait.intValue(); // 待ち時間（秒）
			}
			else {
				wait = 5; // 指定なしの場合 待ち時間（5秒）
			}

			_ftpClnt = crtFtpClnt(dtlR);
			logger().writeProcessLog(PFBZL0032, dtlR.file_nm());

			int i = 1;
			while (true) {
				if (isFtp) {
					MCLog.write(PFBZL0057);
				}
				else if (isSftp) {
					MCLog.write(PFBZL0076);
				}
				else {
					MCLog.write(PFBZL0059);
				}
				boolean ret = _ftpClnt.sendFile(dtlR.file_path(), dtlR.file_nm(),
						dtlR.remote_dir(), dtlR.file_nm());
				if (isFtp) {
					MCLog.write(PFBZL0058);
				}
				else if (isSftp) {
					MCLog.write(PFBZL0077);
				}
				else {
					MCLog.write(PFBZL0060);
				}
				if (ret || i++ > max) {
					return ret;
				}
				try {
					logger().writeProcessLog(PFBZL0034, wait, i - 1, max);
					Thread.sleep(1000 * wait);
				}
				catch (InterruptedException ex) {
					//エラー発生のコメントのみを残す
					logger().writeProcessLog(PFBZL0061);
				}
			}
		}

		protected MCFtpClient crtFtpClnt(Srch02_DtlR dtlR) {

			MCFtpClient ftpClnt = null;
			String sendTyp = ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.SEND_TYP, dtlR.if_proc_typ());
			if (isSame(_send_typ_ftp, sendTyp)) {
				
				ftpClnt = new MCFtpClient(
						ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.FTP_HOST, dtlR.if_proc_typ())
						,ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.FTP_USER, dtlR.if_proc_typ())
						,ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.FTP_PASS, dtlR.if_proc_typ())
					);

				MCNumber portNo = ifPrtclMgr().getIfCtlNumber(MAC_IF_CTL_TYP.FTP_PORT, dtlR.if_proc_typ());
				if(!isNull(portNo)) {
					ftpClnt.setPortNo(portNo.intValue()); // ポート番号
				}
				else {
					ftpClnt.setPortNo(21); // ポート番号 省略時は21
				}
				String mode = ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.FTP_MODE, dtlR.if_proc_typ());
				ftpClnt.setIsPassive(isSame(mode, _ftp_mode_passive));
				String ftpOpts = ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.FTP_OPTS, dtlR.if_proc_typ());
				ftpClnt.setFtpOpts(ftpOpts);
			}
			else if (isSame(_send_typ_sftp, sendTyp)) {
				//パスワード認証
				if (isNull(ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.SFTP_KEY_FILE_PATH,
						dtlR.if_proc_typ()))) {
					ftpClnt = new MCFtpClient(
							ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.SFTP_HOST,
									dtlR.if_proc_typ()),
							ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.SFTP_USER,
									dtlR.if_proc_typ()),
							ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.SFTP_PASS,
									dtlR.if_proc_typ()),
							PROTOCOL_TYPE.SFTP_PASSWORD, null);
				}
				//公開鍵認証
				else {
					ftpClnt = new MCFtpClient(
							ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.SFTP_HOST,
									dtlR.if_proc_typ()),
							ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.SFTP_USER,
									dtlR.if_proc_typ()),
							ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.SFTP_PASS,
									dtlR.if_proc_typ()),
							PROTOCOL_TYPE.SFTP_PUBLICKEY,
							ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.SFTP_KEY_FILE_PATH,
									dtlR.if_proc_typ()));
				}

				MCNumber portNo = ifPrtclMgr().getIfCtlNumber(MAC_IF_CTL_TYP.SFTP_PORT,
						dtlR.if_proc_typ());
				if (!isNull(portNo)) {
					ftpClnt.setPortNo(portNo.intValue()); // ポート番号
				}
				else {
					ftpClnt.setPortNo(22); // ポート番号 省略時は22
				}
			}
			else {
				ftpClnt = new MCFtpClient();
			}
			String lockTyp = ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.TRANSFER_LOCK_TYP, dtlR.if_proc_typ());
			ftpClnt.setFtpMode(
					isSame(lockTyp, _transfer_lock_typ_status) ?
						MCFtpClient.STATUS_FILE_MODE : MCFtpClient.RENAME_MODE);
			if (!isNull(dtlR.sts_fsuffix())) {
				ftpClnt.setStatusFileSuffix(dtlR.sts_fsuffix());
			}
			return ftpClnt;
		}

		protected void preUpdSendIf(MCList<Srch02_DtlR> sendL) {
			setAll(_upL, sendL, createTo_PFT_SDRV_IF_R_Fr_Srch02_DtlR());
		}

		/**
		 * ESBインターフェーステーブルの更新処理
		 * @param dtlL
		 */
		protected void updEsbIf(MCList<Srch02_DtlR> dtlL) {
			if(isNull(dtlL) || dtlL.isEmpty()) {
				throw new MCException(PFBZL0048);
			}
			PFBZL_SendRecvIfCtrl.UpdEsb01 ope = PFBZL_SendRecvIfCtrl.crtUpdEsb01();
			for(MCList<Srch02_DtlR> subL : dtlL.groupList(Srch02_DtlR.$if_proc_typ)) {
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
				addColumnPathMap(UpdEsb01_DtlR.$data_no, SdrvDtlR.$data_no);
				addColumnPathMap(UpdEsb01_DtlR.$sdrv_sts_typ, SdrvDtlR.$sdrv_sts_typ);
			}
		}

		protected void updSdrvIf() {
			PFT_SDRV_IF_R t = PFT_SDRV_IF_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
			builder.setSet(
					t.sdrv_sts_typ,
					t.sdrv_tm,
					t.batch_log_no,
					t.log_sub_key1,
					t.log_sub_key2
					);
			dbUpdateKey(createSqlId(LOGIC_ID, t, "U01"), _upL, builder);
		}

		protected void updIfFile() {
			PFT_IF_FILE_R t = PFT_IF_FILE_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
			builder.setSet(t.fproc_typ);
			builder.addWhereWithAnd(t.file_id.eq(bindEx(PFT_IF_FILE_R.$file_id)));
			
			dbUpdate(createSqlId(LOGIC_ID, t, "U02"), _upL, builder);
		}

		protected void setMsgPoolCauseRows(MCList<Srch02_DtlR> sendL) {
			MCIndexKey idx1 = sendL.createIndex(_$ifKey),
					   idx2 = sendL.createIndex(PFT_SDRV_IF_FILE_R.$file_id);
			for (MCMessage msg : _msgL) {
				MCRow r = msg.getCauseRow();
				if (!isNull(r.getStringNE(_$if_proc_typ))
				 && !isNull(r.getNumberNE(_$data_no))) {
					Srch02_DtlR dtlR = sendL.getFirst(idx1, r.toArray(_$ifKey));
					if (!isNull(dtlR)) {
					 	msg.setCauseRow(dtlR,  null);
						MCMessagePool.add(msg);
					}
				}
				else if (!isNull(r.getNumberNE(Srch02_DtlR.$file_id))) {
					for (Srch02_DtlR dtlR : sendL.subList(idx2, r.getNumberNE(Srch02_DtlR.$file_id))) {
					 	msg.setCauseRow(dtlR,  null);
						MCMessagePool.add(msg);
					}
				}
			}
		}

		protected To_PFT_SDRV_IF_R_Fr_Srch02_DtlR<PFT_SDRV_IF_R, Srch02_DtlR> createTo_PFT_SDRV_IF_R_Fr_Srch02_DtlR() {
			return new To_PFT_SDRV_IF_R_Fr_Srch02_DtlR<PFT_SDRV_IF_R, Srch02_DtlR>();
		}
		public class To_PFT_SDRV_IF_R_Fr_Srch02_DtlR<D extends PFT_SDRV_IF_R, S extends Srch02_DtlR>
				extends MCRowMapper<D,S>{

			@Override
			public void valueCopy(D dest, S src){
				dest.if_proc_typ(src.if_proc_typ());
				dest.data_no(src.data_no());
				dest.sdrv_sts_typ(src.sdrv_sts_typ());
				dest.batch_log_no(src.batch_log_no());
				dest.log_sub_key1(src.log_sub_key1());
				dest.log_sub_key2(src.log_sub_key2());

				dest.setNumberNE(PFT_IF_FILE_R.$file_id, src.file_id());
				if (MAC_SDRV_STS_TYP.isSEND_OK(dest.sdrv_sts_typ())) {
					dest.sdrv_tm(_send_tm);
					dest.setStringNE(PFT_IF_FILE_R.$fproc_typ, MAC_FPROC_TYP.OK.value());
					dest.setStringNE(_$exe_sts_typ, MAC_EXE_STS_TYP.OK.value());
				}
				else {
					dest.setStringNE(PFT_IF_FILE_R.$fproc_typ, MAC_FPROC_TYP.ERR.value());
					dest.setStringNE(_$exe_sts_typ, MAC_EXE_STS_TYP.ERR.value());
				}
			}
		}
	
		protected void rsltCnt(MCList<Srch02_DtlR> ifL) {
			_totalCnt = _successCnt = _errorCnt = _skipCnt = 0;
			for (Srch02_DtlR ifR : ifL) {
				String sdrvStsTyp = ifR.sdrv_sts_typ();
				if (MAC_SDRV_STS_TYP.isSEND_ERR(sdrvStsTyp)) {
					_errorCnt++;
					_sumErrorCnt++;
				}
				else if (MAC_SDRV_STS_TYP.isSEND_OK(sdrvStsTyp)) {
					_successCnt++;
				}
				else {
					_skipCnt++;
				}
				_totalCnt++;
				_sumTotalCnt++;
			}
		}
	}

	//FMCB CUSTOM END
}