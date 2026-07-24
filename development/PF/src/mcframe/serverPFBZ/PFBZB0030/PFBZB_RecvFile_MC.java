package mcframe.serverPFBZ.PFBZB0030;

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
import mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys;
import mcframe.commonCore.net.*;
import mcframe.serverPFUD.PFUDL5020.*;

import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import static mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys.*;

import mcframe.serverPFBZ.PFBZL5040.*;
//FMCB CUSTOM_IMPORT END

/**
 * "PFBZB_RecvFile"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class PFBZB_RecvFile_MC extends PFBZB_RecvFile_MC_A{
	//FMCB CUSTOM START
	
	PFUCL_AppSys.IfPrtclMgr<MCRow> _ifPrtclMgr = PFUCL_AppSys.crtRecvIfProtocolMgr(); 

	/**
	 * Recv01オペレーション.<p>
	 *
	 * ＩＦファイルを受信する。<br>
	 */
	public class Recv01 extends PFBZB_RecvFile_MC_A.Recv01 {

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
		/**
		 * 受信対象取得（EZXL0210）の下り電文を設定
		 */
		protected MCList<DtlR>
			 _dtlL = MCList.create(mcframe.serverPFBZ.PFBZL5040.DtlR.class);

		/**
		 * 変換の単位
		 */
		protected String[] _recvKey = {
			"if_proc_typ", "ext_sys_cd"
		};

		/** MCMessagePool退避用 */
		protected MCMessageList _buMessageList = new MCMessageList();
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			initLog();
			try {
				readRecvIf();
				if (_dtlL.isEmpty()) {
					procEndLog();
					writeEndLog();
					return;
				}
				setLogKey(_dtlL);
			}
			catch (Exception ex) {
				procEndLog(ex);
				throw ex;
			}
			
			for (DtlR dtlR : _dtlL) {
				
				//通信ルールマスタのデータを取得
				_ifPrtclMgr.set(dtlR);

				writeStartLog(dtlR);
				String recvTyp = _ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.RECV_TYP,
						dtlR.if_proc_typ());
				if (!isSame(_recv_typ_ftp, recvTyp) && !isSame(_recv_typ_sftp, recvTyp)) {
					continue;
				}
				
				try {
					recv(dtlR);
				}
				catch (Exception ex) {
					procEndLog(ex);
				}
				finally {
					procEndLog();
				}
			}
			writeEndLog();
		}

		/**
		 * バッチログを初期化する。
		 */
		protected void initLog() {
			getLogger();
			logger().writeStartLog(PFBZL0044);
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
		protected void writeStartLog(DtlR dtlR) {
			String recvTyp = _ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.RECV_TYP, dtlR.if_proc_typ());
			if (isSame(_recv_typ_ftp, recvTyp)) {
				logger().writeProcessLog(PFBZL0035,
						dtlR.ext_sys_cd(),
						dtlR.if_proc_typ(), 
						_recv_typ_ftp_msg,
						dtlR.local_dir(), 
						dtlR.remote_dir(), 
						_ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.FTP_HOST, dtlR.if_proc_typ()),
						_ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.FTP_USER, dtlR.if_proc_typ()),
						isSame(dtlR.transfer_lock_typ(), _transfer_lock_typ_rename) ? 
								_transfer_lock_typ_rename_msg : _transfer_lock_typ_status_msg,
						_ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.FTP_OPTS, dtlR.if_proc_typ())
					);
			}
			else if(isSame(_recv_typ_sftp, recvTyp)){
				logger().writeProcessLog(PFBZL0035,
						dtlR.ext_sys_cd(),
						dtlR.if_proc_typ(), 
						_recv_typ_sftp_msg,
						dtlR.local_dir(), 
						dtlR.remote_dir(), 
						_ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.SFTP_HOST, dtlR.if_proc_typ()),
						_ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.SFTP_USER, dtlR.if_proc_typ()),
						isSame(dtlR.transfer_lock_typ(), _transfer_lock_typ_rename) ? 
								_transfer_lock_typ_rename_msg : _transfer_lock_typ_status_msg,
						"-"
					);
			}
			else {
				logger().writeProcessLog(PFBZL0075,
					dtlR.ext_sys_cd(),
					dtlR.if_proc_typ(),
					ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.RECV_TYP, dtlR.if_proc_typ()));
			}
		}

		protected void procEndLog(Exception ex) {
			logger().writeProcessLog(
				ex instanceof MCException ? (MCException)ex :  new MCException(ex));
		}


		protected void procEndLog() {
			logger().writeDataLog(MCMessagePool.getMessageList());
			_buMessageList.addAll(MCMessagePool.getMessageList());
			MCMessagePool.clear();
			if (_totalCnt == 0) {
				logger().writeProcessLog(PFBZL0036);
			}
			else {
				logger().writeProcessLog(PFBZL0037, _totalCnt, _successCnt, _errorCnt, _skipCnt);
			}
		}

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
			logger().writeEndLog(PFBZL0045);
			pushEndLog(logger());
		}
		
		protected void readRecvIf() {
			PFBZL_FileRecv.Srch01 ope = PFBZL_FileRecv.crtSrch01();
			copy(ope.up0(), up0(), createSrchCndR_CndR());
			ope.exec();
			_dtlL = ope.down0();
			logger().writeDataLog(MCMessagePool.getMessageList());
			_buMessageList.addAll(MCMessagePool.getMessageList());
			MCMessagePool.clear();
		}

		protected void recv(DtlR dtlR) {
			MCFtpClient ftpClnt = crtFtpClnt(dtlR);
			ftpRecv(dtlR, ftpClnt);
		}

		protected void ftpRecv(DtlR dtlR, MCFtpClient ftpClnt) {
			_totalCnt = _successCnt = _errorCnt = 0;
			ftpClnt.receiveFile(dtlR.remote_dir(), dtlR.local_dir());
			String msg = "";
			String recvTyp = _ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.RECV_TYP, dtlR.if_proc_typ());
			if (isSame(_recv_typ_ftp, recvTyp)) {
				msg += "----- FTP GET -----";
			}
			else if(isSame(_recv_typ_sftp, recvTyp)) {
				msg += "----- SFTP GET -----";
			}
			msg = msg + "\n" + "Remote Dir : " + dtlR.remote_dir() + "\n" + "Get Files ["
					+ ftpClnt.getSucessFileNames().length + "] :" + "\n";
			MCMessageList procL = new MCMessageList();
			for (String fname : ftpClnt.getSucessFileNames()) {
				msg += "  [" + fname + "]\n";
				procL.add(new MCMessage(PFBZL0024, fname));
			}
			logger().writeProcessLog(procL);
			MCLog.write(new MCMessage(PFBZL0039, msg));

			_totalCnt += ftpClnt.getTargetFileNames().length;
			_successCnt += ftpClnt.getSucessFileNames().length;
			_errorCnt += ftpClnt.getFailFileNames().length;
			_sumTotalCnt += ftpClnt.getTargetFileNames().length;
			_sumErrorCnt += ftpClnt.getFailFileNames().length;
			for (String fname : ftpClnt.getFailFileNames()) {
				appHandleEx(ftpClnt.getFailMCExceptionByFileName(fname), fname, dtlR);
			}
		}

		protected MCFtpClient crtFtpClnt(DtlR dtlR) {
			
			MCFtpClient ftpClnt = null;
			String recvTyp = _ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.RECV_TYP, dtlR.if_proc_typ());
			if (isSame(_recv_typ_ftp, recvTyp)) {
				ftpClnt = new MCFtpClient(dtlR.ftp_host(), dtlR.ftp_user(),
						dtlR.ftp_password());
				
				if (!isNull(dtlR.ftp_port())) {
					ftpClnt.setPortNo(dtlR.ftp_port().intValue());
				}
				String mode = _ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.FTP_MODE,
						dtlR.if_proc_typ());
				ftpClnt.setIsPassive(isSame(mode, _ftp_mode_passive));
				ftpClnt.setFtpOpts(dtlR.ftp_opts());
			}
			else if(isSame(_recv_typ_sftp, recvTyp)) {
				//パスワード認証
				if (isNull(_ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.SFTP_KEY_FILE_PATH,
						dtlR.if_proc_typ()))) {
					ftpClnt = new MCFtpClient(
							_ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.SFTP_HOST,
									dtlR.if_proc_typ()),
							_ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.SFTP_USER,
									dtlR.if_proc_typ()),
							_ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.SFTP_PASS,
									dtlR.if_proc_typ()),
							PROTOCOL_TYPE.SFTP_PASSWORD, null);
				}
				//公開鍵認証
				else {
					ftpClnt = new MCFtpClient(
							_ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.SFTP_HOST,
									dtlR.if_proc_typ()),
							_ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.SFTP_USER,
									dtlR.if_proc_typ()),
							_ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.SFTP_PASS,
									dtlR.if_proc_typ()),
							PROTOCOL_TYPE.SFTP_PUBLICKEY,
							_ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.SFTP_KEY_FILE_PATH,
									dtlR.if_proc_typ()));
				}
				
				MCNumber portNo = _ifPrtclMgr.getIfCtlNumber(MAC_IF_CTL_TYP.SFTP_PORT,
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
			
			String lockTyp = _ifPrtclMgr.getIfCtlString(
					MAC_IF_CTL_TYP.TRANSFER_LOCK_TYP, dtlR.if_proc_typ());
			ftpClnt.setFtpMode(isSame(lockTyp, _transfer_lock_typ_status)
					? MCFtpClient.STATUS_FILE_MODE
					: MCFtpClient.RENAME_MODE);

			if (!isNull(dtlR.sts_fsuffix())) {
				ftpClnt.setStatusFileSuffix(dtlR.sts_fsuffix());
			}
			return ftpClnt;
		}

		protected void appHandleEx(Exception e, String fname, DtlR dtlR) {
			
			MCException ex = e instanceof MCException ? (MCException)e : new MCException(e);
			
			MCException appEx = null;
			String recvTyp = _ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.RECV_TYP, dtlR.if_proc_typ());
			if (isSame(_recv_typ_ftp, recvTyp)) {
				appEx = new MCAppException(PFBZL0038,
						dtlR.ftp_host(), _recv_typ_ftp_msg, dtlR.ftp_user(), dtlR.remote_dir(), fname,
						dtlR.if_proc_typ());
			}
			else if(isSame(_recv_typ_sftp, recvTyp)) {
				appEx = new MCAppException(PFBZL0038,
						dtlR.sftp_host(), _recv_typ_sftp_msg, dtlR.sftp_user(), dtlR.remote_dir(), fname,
						dtlR.if_proc_typ());
			}
			
			appEx.addCauseMessage(ex.getMCMessage());
			handleEx(appEx, dtlR);
		}

		protected SrchCndR_CndR<mcframe.serverPFBZ.PFBZL5040.CndR, CndR> createSrchCndR_CndR() {
			return new SrchCndR_CndR<mcframe.serverPFBZ.PFBZL5040.CndR, CndR>();
		}
		public class SrchCndR_CndR<D extends mcframe.serverPFBZ.PFBZL5040.CndR, S extends CndR>
				extends MCRowMapper<D,S>{
			@Override
			public void valueCopy(D dest, S src){
				dest.if_proc_typ(src.if_proc_typ());
				dest.ext_sys_cd(src.ext_sys_cd());
			}
		}
	}

	//FMCB CUSTOM END
}