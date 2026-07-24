package mcframe.serverMSLA.MSLAL9980;

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
import mcframe.serverMSLA.MSLAL9980.*;	// このimportはFrameManagerの自動生成で追加されました。
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
 * "MSLAL_FileLinkBase"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAL_FileLinkBase_MC extends MSLAL_FileLinkBase_MC_A{
	//FMCB CUSTOM START
	
	protected String _strIoPath;
	protected String _strIoFile;
	
	protected String _mcAppServerDir = "MS.{LOGIC_ID}.flexsche.{CO_CD}.{EXT_SYS_CD}";
	protected static final String DIR_LOGIC_ID = "{LOGIC_ID}";
	protected static final String DIR_CO_CD = "{CO_CD}";
	protected static final String DIR_EXT_SYS_CD = "{EXT_SYS_CD}";
	protected static final String DIR_IF_PROC_TYP = "{IF_PROC_TYP}";
	protected static final String DIR_TIM_STAMP = "{yyMMddHHmmss}";
	
	protected MCDate _sdrvTm = MCDate.now();
	private MSLAL_FileLinkBase.FileLinkBase_Chk01 _chk01;
	
	protected String getLogicId() {
		return MSLAL_FileLinkBase.LOGIC_ID;
	}
	
	protected void setChkOpe(MSLAL_FileLinkBase.FileLinkBase_Chk01 chk01) {
		_chk01 = chk01;
	}
	
	protected boolean isExistPath(String path) {
		Path chkForPath = Paths.get(path);
		if (Files.exists(chkForPath)) {
			return true;
		}
		return false;
	}
	
	protected void getIoPath(String extSysCd) {
		_mcAppServerDir = _mcAppServerDir.replace(DIR_LOGIC_ID, getLogicId());
		_mcAppServerDir = _mcAppServerDir.replace(DIR_CO_CD, MCSys.user.coCD());
		_mcAppServerDir = _mcAppServerDir.replace(DIR_EXT_SYS_CD, extSysCd);
		String ioDir = _mcAppServerDir + "." + "io_dir";
		_strIoPath = MCConst.app.getString(ioDir, null);
	}
	
	/**
	 * FileLinkBase_Chk01オペレーション.<p>
	 *
	 * ファイル連携前チェック用の親クラス<br>
	 */
	public class FileLinkBase_Chk01 extends MSLAL_FileLinkBase_MC_A.FileLinkBase_Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			chkSchdTyp(msgList);
			chkIfProcTyp(msgList);
			if (!isNull(up0().ext_sys_cd())) {
				chkIoPath(msgList);
			}
			return msgList;
		}

		@Override
		protected void doIt() {
			super.doIt();
			setDown();
		}
		
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}
		
		protected void chkSchdTyp(MCMessageList msgList) {
			String schdTyp = up0().if_scheduler_typ();
			if (!isNull(schdTyp) && !MSC_IF_SCHEDULER_TYP.isFLEXSCHE(schdTyp)) {
				msgList.add(new MCMessage(MSLAL0911));
			}
		}
		
		protected void chkIoPath(MCMessageList msgList) {
			getIoPath(up0().ext_sys_cd());
			if (isNull(_strIoPath)) {
				msgList.add(new MCMessage(MSLAL0913));
				return;
			}
			if (!isExistPath(_strIoPath)) {
				msgList.add(new MCMessage(MSLAL0914));
				return;
			}
		}
		
		protected void chkIfProcTyp(MCMessageList msgList) {
		}
	}
	/**
	 * FileLinkBase_Upd01オペレーション.<p>
	 *
	 * ファイル連携更新用の親クラス<br>
	 */
	public class FileLinkBase_Upd01 extends MSLAL_FileLinkBase_MC_A.FileLinkBase_Upd01 {
		
		protected int _totalCnt = 0;
		protected int _successCnt = 0;
		protected int _errorCnt = 0;
		protected int _skipCnt = 0;
		
		protected boolean _exceptionFlg = false;
		protected boolean _sdrvErrFlg = false;
		
		protected List<String> _ifProcTypL = new ArrayList<>();
		protected MCList<Srch02_DtlR> _ifL = MCList.create(Srch02_DtlR.class);
		protected MCList<PFT_SDRV_IF_R> _upL = MCList.create(PFT_SDRV_IF_R.class);
		
		@Override
		protected void call() {
			super.call();
		}
		
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
		
		protected void execMain() {
			preCallThisChk01();
			callThisChk01();
			throwUpdErr();
			getIfProcTyp(up0().if_proc_typ());
			if (_ifProcTypL == null ||_ifProcTypL.isEmpty()) {
				procEndLog();
				return;
			}
			link();
			procEndLog();
		}
		
		protected void preCallThisChk01(){
		}
		
		protected void callThisChk01() {
			MCRow.copyall(_chk01.up0(), up0());
			_chk01.exec();
			MCRow.copyall(up0(), _chk01.down0());
		}
		
		protected void getIfProcTyp(String ifProcTyp) {
		}
		
		protected void link() {
			for (String ifProcTyp : _ifProcTypL) {
				preLink(ifProcTyp);
				if (isNull(_strIoPath)) {
					continue;
				}
				if (_ifL.isEmpty()) {
					continue;
				}
				sort();
				setLogKey(_ifL);
				linkFile();
			}
		}
		
		protected void preLink(String ifProcTyp) {
		}
		
		protected void srchSdrvIfAndLock(String ifProcTyp) {
			PFBZL_SendRecvIfCtrl.Srch02 ope = PFBZL_SendRecvIfCtrl.crtSrch02();
			Link_DtlR upR = Link_DtlR.create();
			upR.ext_sys_cd(up0().ext_sys_cd());
			upR.if_proc_typ(ifProcTyp);
			copy(ope.up0(), upR, createMap_Srch02_CndR_Link_DtlR());
			ope.exec();
			
			MCMessagePool.clear();
			_ifL = ope.down0();
			_ifL.setStringNE(SdrvDtlR.$sdrv_sts_typ, null);
		}
		
		protected Map_Srch02_CndR_Link_DtlR<Srch02_CndR,Link_DtlR> createMap_Srch02_CndR_Link_DtlR() {
			return new Map_Srch02_CndR_Link_DtlR<Srch02_CndR, Link_DtlR>();
		}
		
		public class Map_Srch02_CndR_Link_DtlR<D extends Srch02_CndR, S extends Link_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch02_CndR.$if_proc_typ, Link_DtlR.$if_proc_typ);
				addColumnPathMap(Srch02_CndR.$ext_sys_cd, Link_DtlR.$ext_sys_cd);
			}
		}
		
		protected void  getIoLoFilePath(String ifProcTyp) {
		}
		
		protected void linkFile() {
			preLinkFile();
			String svp = "svp_" + _ifL.get(0).if_proc_typ();
			MCNumber bfFileId = null;
			try {
				dbTran().setSavepoint(svp);
				for (Srch02_DtlR sdrvR : _ifL) {
					if (_sdrvErrFlg) {
						break;
					}
					if (!isNull(bfFileId) && isSame(sdrvR.file_id(), bfFileId)) {
						sdrvR.setStringNE(SdrvDtlR.$sdrv_sts_typ, MAC_SDRV_STS_TYP.SEND_OK.value());
						continue;
					}
					if (!isExistLocalFile(sdrvR)) {
						logger().writeProcessLog(getSkipLogMsg(), sdrvR.file_nm(), sdrvR.file_path());
						continue;
					}
					sdrv(sdrvR);
					bfFileId = sdrvR.file_id();
				}
				if (!_sdrvErrFlg) {
					afterSdrv();
				}
			}
			catch (Exception ex) {
				dbTran().rollback(svp);
				handleEx(ex, _ifL);
				_sdrvErrFlg = true;
			}
			rsltCnt(_ifL);
		}
		
		protected boolean isExistLocalFile(Srch02_DtlR sdrvR) {
			return true;
		}
		
		protected void preLinkFile() {
		}
		
		protected void sdrv(Srch02_DtlR sdrvR) {
			try {
				logger().writeProcessLog(getSdrvLogMsg(), sdrvR.file_nm());
				callLinkFile(sdrvR);
				
				sdrvR.setStringNE(SdrvDtlR.$sdrv_sts_typ, MAC_SDRV_STS_TYP.SEND_OK.value());
				moveTrash(sdrvR);
			}
			catch (MCException ex) {
				sdrvR.setStringNE(SdrvDtlR.$sdrv_sts_typ, MAC_SDRV_STS_TYP.SEND_ERR.value());
				handleEx(ex, _ifL);
				if (!isSame(ex.getID(), PFUCL0006)) {
					moveErr(sdrvR);
				}
				_sdrvErrFlg = true;
			}
		}
		
		protected void callLinkFile(Srch02_DtlR sdrvR) {
		}
		
		protected void moveTrash(Srch02_DtlR sendR) {
		}
		
		protected void moveErr(Srch02_DtlR sendR) {
		}
		
		protected void afterSdrv() {
		}
		
		protected void linkFile(String srcPath, String srcFile, String destPath, String destFile) {
			Path src = getPath(srcPath, srcFile);
			if (!Files.exists(src)) {
				return;
			}
			
			Path dest = getPath(destPath, destFile);
			makeEmpFile(dest);
			
			try {
				Files.copy(src, dest, StandardCopyOption.REPLACE_EXISTING);
			}
			catch (IOException e) {
				logger().writeProcessLog(PFBBL0102, e.toString());
				throw new MCException(e);
			}
		}
		
		protected Path getPath(String path, String file) {
			return Paths.get(path, file);
		}
		
		protected void makeEmpFile(Path path) {
			if (Files.exists(path)) {
				return;
			}
			try {
				Files.createFile(path);
			} catch(Exception e) {
				throw new MCException(e);
			}
		}
		
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
		
		protected void sort() {
			_ifL.sort(PFT_IF_FILE_R.$file_id, PFT_SDRV_IF_R.$data_no);
		}
		
		protected void updIfFile() {
			PFT_IF_FILE_R dbc = PFT_IF_FILE_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
			builder.setSet(dbc.fproc_typ);
			dbUpdateKey("MSLAL9970_PFT_IF_FILE_U01", _upL, builder);
		}
		
		protected void updSdrvIf() {
			PFT_SDRV_IF_R t = PFT_SDRV_IF_R.create("T");
			execDbUpdateKey("MSLAL9970_PFT_SDRV_IF_U01", t, _upL, t.sdrv_sts_typ, t.sdrv_tm,
				t.batch_log_no, t.log_sub_key1, t.log_sub_key2);
		}
		
		protected void preUpdSendIf(MCList<Srch02_DtlR> sendL) {
			setAll(_upL, sendL, createTo_PFT_SDRV_IF_R_Fr_Srch02_DtlR());
			_upL = _upL.subList(r -> !isNull(r.if_proc_typ()) && !isNull(r.sdrv_sts_typ()));
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
			MCLog.write(e);
		}
		
		protected void initLogger() {
			getConcurrentLogger();
		}
		
		protected void writeStartLog() {
			logger().writeStartLog(getStartLogMsg());
			pushStartLog(logger());
		}
		
		protected void procEndLog(Exception ex) {
			logger().writeProcessLog(
				ex instanceof MCException ? (MCException)ex : new MCException(ex));
			MCMessagePool.clear();
		}
		
		protected void procEndLog() {
			logger().writeDataLog(MCMessagePool.getMessageList());
			MCMessagePool.clear();
			if (_totalCnt != 0) {
				logger().writeProcessLog(getTotalCntLogMsg(), _totalCnt, _successCnt, _errorCnt, _skipCnt);
			}
		}
		
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
			logger().writeEndLog(getEndLogMsg());
			pushEndLog(logger());
			logger().close();
		}
		
		protected String getStartLogMsg() {
			return MSLAL0910;
		}
		
		protected String getEndLogMsg() {
			return MSLAL0919;
		}
		
		protected String getTotalCntLogMsg() {
			return MSLAL0920;
		}
		
		protected String getSdrvLogMsg() {
			return PFBZL0032;
		}
		
		protected String getSkipLogMsg() {
			return MSLAL0918;
		}
	}

	//FMCB CUSTOM END
}