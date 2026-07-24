package mcframe.serverMSLA.MSLAL9970;

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
import mcframe.serverMSLA.MSLAL9970.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSLA.MSLAL9980.*;	
import mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys;
import mcframe.serverPFBZ.PFBZL9050.*;
import mcframe.serverPFUD.PFUDL5020.*;
import mcframe.serverPF.dbc.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverCore.resource.MCConst;
import mcframe.commonCore.sys.*;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.Files;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.HashMap;

import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static mcframe.commonPF.notice.PF_Msg.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import org.apache.commons.io.FileUtils;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAL_SchdLinkService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_SchdLinkService_MC extends MSLAL_SchdLinkService_MC_A{
	//FMCB CUSTOM START
	
	protected PFUCL_AppSys.IfPrtclMgr<MCDBContainer> _ifPrtclMgr = crtSendIfProtocolMgr();
	
	protected void getIoFile(String ifProcTyp) {
		String ioDir = _mcAppServerDir + ".out_file_nm." + ifProcTyp;
		_strIoFile = MCConst.app.getString(ioDir, null);
	}
	
	protected void setIfPrtclMgr(String extSysCd) {
		_ifPrtclMgr.set(extSysCd, null);
	}
	
	protected MCList<MCRow> getRecvIfProcTyp() {
		return MAC_IF_PROC_TYP.list().subList(r -> 
		!MAC_IF_PROC_TYP.is_send(r.getString(MAC_IF_PROC_TYP.$VALUE)) && 
		MAC_IF_PROC_TYP.is_fs(r.getString(MAC_IF_PROC_TYP.$VALUE)));
	}
	
	@Override
	protected String getLogicId() {
		return MSLAL_SchdLinkService.LOGIC_ID;
	}
	
	/**
	 * Send_Chk01オペレーション.<p>
	 *
	 * 送信前チェック<br>
	 */
	public class Send_Chk01 extends MSLAL_SchdLinkService_MC_A.Send_Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void chkIfProcTyp(MCMessageList msgList) {
			String ifProcTyp = up0().if_proc_typ();
			if (!isNull(ifProcTyp) && 
				(!MAC_IF_PROC_TYP.is_send(ifProcTyp) || !MAC_IF_PROC_TYP.is_fs(ifProcTyp))) {
				msgList.add(new MCMessage(MSLAL0912, ifProcTyp));
			}
		}
	}
	/**
	 * Send_Upd01オペレーション.<p>
	 *
	 * スケジューラＩＦファイル送信サービスを実行する<br>
	 */
	public class Send_Upd01 extends MSLAL_SchdLinkService_MC_A.Send_Upd01 {
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void getIfProcTyp(String ifProcTyp) {
			if (isNull(ifProcTyp)) {
				MCList<MCRow> ifProcTypL = MAC_IF_PROC_TYP.list().subList(r -> 
					MAC_IF_PROC_TYP.is_send(r.getString(MAC_IF_PROC_TYP.$VALUE)) && 
					MAC_IF_PROC_TYP.is_fs(r.getString(MAC_IF_PROC_TYP.$VALUE)));
				if (ifProcTypL.isEmpty()) {
					return;
				}
				for(MCRow ifProcTypR : ifProcTypL) {
					_ifProcTypL.add(ifProcTypR.getString(MAC_IF_PROC_TYP.$VALUE));
				}
			}
			else {
				_ifProcTypL.add(ifProcTyp);
			}
		}
		
		@Override
		protected void preCallThisChk01() {
			setChkOpe(MSLAL_SchdLinkService.crtSend_Chk01());
		}
		
		@Override
		protected void preLink(String ifProcTyp) {
			srchSdrvIfAndLock(ifProcTyp);
			getIoPath(up0().ext_sys_cd());
		}
		
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
		
		@Override
		protected void preLinkFile() {
			makeIoFileNm(_ifL.get(0).file_nm());
		}
		
		protected void makeIoFileNm(String fileNm) {
			String[] splitFile = fileNm.split(Pattern.quote("."));
			String[] ioFile = splitFile[0].split(Pattern.quote("_"));
			_strIoFile = ioFile[0].concat(".") + splitFile[1];
		}
		
		@Override
		protected boolean isExistLocalFile(Srch02_DtlR sdrvR) {
			return isExistPath(sdrvR.file_path() + "\\" + sdrvR.file_nm());
		}
		
		@Override
		protected void callLinkFile(Srch02_DtlR sdrvR) {
			linkFile(sdrvR.file_path(), sdrvR.file_nm(), _strIoPath, _strIoFile);
		}
		
		@Override
		protected void moveTrash(Srch02_DtlR sendR) {
			moveToTrash(sendR.file_path(), sendR.file_nm());
		}
		@Override
		protected void moveErr(Srch02_DtlR sendR) {
			moveToErr(sendR.file_path(), sendR.file_nm());
		}
		
		@Override
		protected void afterSdrv() {
			preUpdSendIf(_ifL);
			updIfFile();
			updSdrvIf();
		}
		
		@Override
		protected String getSdrvLogMsg() {
			return PFBZL0032;
		}
	}
	/**
	 * Recv_Chk01オペレーション.<p>
	 *
	 * 受信前チェック<br>
	 */
	public class Recv_Chk01 extends MSLAL_SchdLinkService_MC_A.Recv_Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			return msgList;
		}
		
		@Override
		protected void chkIfProcTyp(MCMessageList msgList) {
			String ifProcTyp = up0().if_proc_typ();
			if (!isNull(ifProcTyp) && 
				(MAC_IF_PROC_TYP.is_send(ifProcTyp) || !MAC_IF_PROC_TYP.is_fs(ifProcTyp))) {
				msgList.add(new MCMessage(MSLAL0912, ifProcTyp));
			}
		}
		
		@Override
		protected void chkIoPath(MCMessageList msgList) {
			super.chkIoPath(msgList);
			if (isNull(_strIoPath)) {
				return;
			}
			MCList<MCRow> recvIfProcTypL = MCList.create(MCRow.class);
			if (isNull(up0().if_proc_typ())) {
				recvIfProcTypL = getRecvIfProcTyp();
			}
			else {
				recvIfProcTypL.add();
				recvIfProcTypL.addStringColumn(MAC_IF_PROC_TYP.$VALUE, up0().if_proc_typ());
			}
			for (MCRow recvIfProc : recvIfProcTypL) {
				getIoFile(recvIfProc.getString(MAC_IF_PROC_TYP.$VALUE));
				if (isNull(_strIoFile)) {
					msgList.add(new MCMessage(MSLAL0915));
					return;
				}
				if (!isExistPath(_strIoPath + "\\" + _strIoFile)) {
					msgList.add(new MCMessage(MSLAL0916));
				}
			}
		}
		
	}
	/**
	 * Recv_Upd01オペレーション.<p>
	 *
	 * スケジューラＩＦファイル受信サービスを実行する<br>
	 */
	public class Recv_Upd01 extends MSLAL_SchdLinkService_MC_A.Recv_Upd01 {
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void getIfProcTyp(String ifProcTyp) {
			if (isNull(ifProcTyp)) {
				MCList<MCRow> ifProcTypL = getRecvIfProcTyp();
				if (ifProcTypL.isEmpty()) {
					return;
				}
				for(MCRow ifProcTypR : ifProcTypL) {
					_ifProcTypL.add(ifProcTypR.getString(MAC_IF_PROC_TYP.$VALUE));
				}
			}
			else {
				_ifProcTypL.add(ifProcTyp);
			}
		}
		
		@Override
		protected void preCallThisChk01() {
			setChkOpe(MSLAL_SchdLinkService.crtRecv_Chk01());
		}
		
		@Override
		protected void preLink(String ifProcTyp) {
			getIoLoFilePath(ifProcTyp);
		}
		
		@Override
		protected void getIoLoFilePath(String ifProcTyp) {
			getIoPath(up0().ext_sys_cd());
			getIoFile(ifProcTyp);
			
			setIfPrtclMgr(up0().ext_sys_cd());
			String ld = _ifPrtclMgr.getLocalDir(ifProcTyp);
			if (!isExistPath(ld)) {
				_ifL = null;
				return;
			}
			String fileNm = getLocalFileNm();
			if (isNull(fileNm)) {
				_ifL = null;
				return;
			}
			Srch02_DtlR fileR = Srch02_DtlR.create();
			fileR.file_path(ld);
			fileR.file_nm(fileNm);
			fileR.if_proc_typ(ifProcTyp);
			_ifL.add(0, fileR);
		}
		
		@Override
		protected void callLinkFile(Srch02_DtlR sdrvR) {
			linkFile(_strIoPath, _strIoFile, sdrvR.file_path(), sdrvR.file_nm());
		}
		
		protected String getLocalFileNm() {
			String[] splitStr = _strIoFile.split(Pattern.quote("."));
			return splitStr[0] + _sdrvTm.toString("_yyMMddHHmmss.") + splitStr[1];
			
		}
		
		@Override
		protected String getSdrvLogMsg() {
			return PFBZL0033;
		}
		
		@Override
		protected String getTotalCntLogMsg() {
			return MSLAL0921;
		}
	}

	//FMCB CUSTOM END
}