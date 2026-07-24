package mcframe.serverPFBZ.PFBZL5040;

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
import mcframe.serverPF.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverPFBZ.PFBZL5040.*;	// このimportはFrameManagerの自動生成で追加されました。
import java.io.File;
import mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys;

import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys.*;
//FMCB CUSTOM_IMPORT END

/**
 * "PFBZL_FileRecv"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class PFBZL_FileRecv_MC extends PFBZL_FileRecv_MC_A{
	//FMCB CUSTOM START
	
	public PFUCL_AppSys.IfPrtclMgr<MCRow> _ifPrtclMgr = crtRecvIfProtocolMgr();

	/**
	 * Srch01オペレーション.<p>
	 *
	 * ＦＴＰサーバの監視対象ディレクトリを取得する<br>
	 */
	public class Srch01 extends PFBZL_FileRecv_MC_A.Srch01 {
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected boolean isDelFlgCtl() {
			return true;
		}

		@Override
		protected boolean isReleaseFlgCtl() {
			return true;
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			PFT_SDRV_IF_R ifR = setArg(up0());

			MCList<DtlR> dtlL = getRecvPrtcl(ifR, false);
			chkDown(dtlL);
			setDown(dtlL);
		}

		protected void chkDown(MCList<DtlR> dtlL) {
			for (DtlR dtlR : dtlL) {
				String recvTyp = _ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.RECV_TYP,
						dtlR.if_proc_typ());
				if (isNull(dtlR.remote_dir())) {
					//FTP
					if (isSame(recvTyp, PFUCL_AppSys._recv_typ_ftp)) {
						MCMessagePool.add(new MCMessage(PFBZL0028, 
								dtlR.ext_sys_cd(),
								dtlR.if_proc_typ(),
								MAC_IF_CTL_TYP.RECV_RMT_DIR.value(),
								MAC_IF_CTL_TYP.FTP_HOST.value(),
								MAC_IF_CTL_TYP.FTP_USER.value(),
								MAC_IF_CTL_TYP.FTP_PASS.value()));
					}
					//SFTP
					else if (isSame(recvTyp, PFUCL_AppSys._recv_typ_sftp)) {
						MCMessagePool.add(new MCMessage(PFBZL0072, 
								dtlR.ext_sys_cd(),
								dtlR.if_proc_typ(),
								MAC_IF_CTL_TYP.RECV_RMT_DIR.value(),
								MAC_IF_CTL_TYP.SFTP_HOST.value(),
								MAC_IF_CTL_TYP.SFTP_USER.value(),
								MAC_IF_CTL_TYP.SFTP_PASS.value(),
								MAC_IF_CTL_TYP.SFTP_KEY_FILE_PATH.value()));
					}
				}
			}
		}

		protected void setDown(MCList<DtlR> dtlL) {
			// リモート情報が設定されているもののみ
			dtlL.removeAll(dtlL.subList(DtlR.$remote_dir, null));
			down0().setAll(dtlL);
		}
	}
	
	/**
	 * Srch02オペレーション.<p>
	 *
	 * ローカルディレクトリの監視対象を取得する<br>
	 */
	public class Srch02 extends PFBZL_FileRecv_MC_A.Srch02 {
			
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected boolean isDelFlgCtl() {
			return true;
		}

		@Override
		protected boolean isReleaseFlgCtl() {
			return true;
		}
	
		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			PFT_SDRV_IF_R ifR = setArg(up0());
			
			MCList<DtlR> dtlL = getRecvPrtcl(ifR, true);
			setDown(dtlL);
		}

		protected void setDown(MCList<DtlR> dtlL) {
			down0().setAll(dtlL);
		}
	}

	protected PFT_SDRV_IF_R setArg(CndR cndR) {

		if(isNull(cndR) || cndR.isEmpty() || isNull(cndR.ext_sys_cd())) {
			if(isNull(cndR)) {
				throw new MCException(PFBZL0054, null, null);
			}
			else {
				throw new MCException(PFBZL0054, cndR.if_proc_typ(), cndR.ext_sys_cd());
			}
		}
		PFT_SDRV_IF_R ifR = PFT_SDRV_IF_R.create();
		ifR.if_proc_typ(cndR.if_proc_typ());
		ifR.ext_sys_cd(cndR.ext_sys_cd());
		return ifR;
	}

	/**
	 * 通信対象のディレクトリ取得する
	 * @param ifR 取得範囲の指定（ext_sys_cd, if_proc_typの指定が無い場合は、全フォルダを探索）
	 * @param localFlg ローカルディレクトリの取得ならtrue
	 * @return
	 */
	protected <T extends MCRow>MCList<DtlR> getRecvPrtcl(PFT_SDRV_IF_R ifR, boolean localFlg) {
		
		MCList<DtlR> dtlL = MCList.create(DtlR.class);
		PFT_SDRV_IF_R wkIfR = ifR.clone();
		
		MCList<MAM_EXT_SYS_R> extSysL = MCList.create(MAM_EXT_SYS_R.class);
		MAM_EXT_SYS_R t = MAM_EXT_SYS_R.create("T");
		MCQueryApiBuilder extSysL_bldr = MCQueryApiBuilder.create(t);
		extSysL_bldr.setSelect(t.ext_sys_cd);
		extSysL_bldr.setWhere(t.ext_sys_typ.neq(value(MAC_EXT_SYS_TYP.EDI_MCF.value())));
		extSysL_bldr.addWhereWithCutOffAnd(t.ext_sys_cd.like(bind("1")), ifR.ext_sys_cd());
		dbSelect(createSqlId(LOGIC_ID, t, "S02"), extSysL, extSysL_bldr);
		
		if(extSysL.isEmpty()) {
			//対象となる外部システムが取得できないため終了
			MCMessagePool.add(new MCMessage(PFBZL0504, ifR.ext_sys_cd()));
			return dtlL;
		}
		for(MAM_EXT_SYS_R extSysR : extSysL){
			wkIfR.ext_sys_cd(extSysR.ext_sys_cd());
			dtlL.addAll(getRecvPrtclByExtSys(wkIfR, localFlg));
		}
		return dtlL;
	}

	/**
	 * 通信対象のディレクトリ取得する
	 * @param ifR 取得範囲の指定（ext_sys_cd, if_proc_typの指定が無い場合は、全フォルダを探索）
	 * @param localFlg ローカルディレクトリの取得ならtrue
	 * @return
	 */
	protected <T extends MCRow>MCList<DtlR> getRecvPrtclByExtSys(PFT_SDRV_IF_R ifR, boolean localFlg) {


		// 通信ルールマスタのディレクトリ指定のリスト
		MCList<MAM_IF_PROTOCOL_R> ifPrtclL = MCList.create(MAM_IF_PROTOCOL_R.class);
		MAM_IF_PROTOCOL_R t = MAM_IF_PROTOCOL_R.create("T");
		MCQueryApiBuilder ifPrtclL_bldr = MCQueryApiBuilder.create(t);

		ifPrtclL_bldr.setSelect(t.ext_sys_cd, t.if_proc_typ, t.if_ctl_typ, t.var_str);
		if(localFlg) {
			ifPrtclL_bldr.setWhere(t.if_ctl_typ.eq(value(MAC_IF_CTL_TYP.LOCAL_DIR.value())));
		}
		else {
			ifPrtclL_bldr.setWhere(t.if_ctl_typ.eq(value(MAC_IF_CTL_TYP.RECV_RMT_DIR.value())));
		}
		ifPrtclL_bldr.addWhereWithAnd(MAC_IF_PROC_TYP$IS_SEND(t.if_proc_typ).eq(value(false)).or(t.if_proc_typ.isNull()));
		ifPrtclL_bldr.addWhereWithAnd(t.ext_sys_cd.like(bind("1")), ifR.ext_sys_cd());
		ifPrtclL_bldr.addWhereWithCutOffAnd(bracket( t.if_proc_typ.like(bind("1")) .or(t.if_proc_typ.isNull())), ifR.if_proc_typ());
		ifPrtclL_bldr.addOrderByDesc(t.if_proc_typ);
		dbSelect(createSqlId(LOGIC_ID, t, "S03"), ifPrtclL, ifPrtclL_bldr);
		
		// ディレクトリ指定が無い場合、ローカルのデフォルトの設定をリスト化する
		if(ifPrtclL.isEmpty() && localFlg) {
			//ローカルフォルダ指定省略時の対象フォルダをリストアップ
			getDefDir(ifR, ifPrtclL);
		}
		// ディレクトリ指定がある場合、その指定に従う
		else if(!ifPrtclL.isEmpty()){
			//ＩＦ処理区分の指定省略時の対象のＩＦ処理区分に対応したローカルフォルダをリストアップ
			getExstRecvDir(ifR, ifPrtclL);
		}
		if(ifPrtclL.isEmpty()) {
			if (localFlg) {
				MCMessagePool.add(new MCMessage(PFUCL0005, ifR.ext_sys_cd(),
						MAC_IF_CTL_TYP.LOCAL_DIR.value()));
			}
			else {
				MCMessagePool.add(new MCMessage(PFUCL0005, ifR.ext_sys_cd(),
						MAC_IF_CTL_TYP.RECV_RMT_DIR.value()));
			}
			
			return null;
		}

		//リストを整理
		ifPrtclL = ifPrtclL.groupBy(MAM_IF_PROTOCOL_R.$ext_sys_cd, MAM_IF_PROTOCOL_R.$if_proc_typ);
		MCList<MAM_IF_PROTOCOL_R> wkL = MCList.create(MAM_IF_PROTOCOL_R.class);
		for(MAM_IF_PROTOCOL_R wkR : ifPrtclL) {
			if(!isNull(wkR.if_proc_typ())) {
				wkL.add(wkR);
			}
		}
		return getPrtclDir(wkL);
	}
	
	/**
	 * ＩＦ通信ルールマスタにおけるＩＦ処理区分省略時のフォルダ存在チェック
	 * @param ifPrtclL ＩＦ通信ルールマスタ
	 * @return
	 */
	protected void getExstRecvDir(PFT_SDRV_IF_R ifR, MCList<MAM_IF_PROTOCOL_R> ifPrtclL) {
		MCList<MAM_IF_PROTOCOL_R> wkIfPrtclL = MCList.create(MAM_IF_PROTOCOL_R.class);
		MCList<MAM_IF_PROTOCOL_R> dmyIfPrtclL = MCList.create(MAM_IF_PROTOCOL_R.class);
		
		for(MAM_IF_PROTOCOL_R ifPrtclR : ifPrtclL) {
			// ＩＦ通信ルールマスタの設定でＩＦ処理区分が省略されている場合は、フォルダの有無で判断する
			if(isNull(ifPrtclR.if_proc_typ())) {
				dmyIfPrtclL = detectIfProcTypDir(ifPrtclR.var_str(), ifR);
				if(dmyIfPrtclL != null) {
					wkIfPrtclL.merge(dmyIfPrtclL, MAM_IF_PROTOCOL_R.$ext_sys_cd, MAM_IF_PROTOCOL_R.$if_proc_typ);
				}
			}
			else {
				wkIfPrtclL.add(ifPrtclR);
			}
		}
		ifPrtclL.addAll(wkIfPrtclL);
	}
	
	/**
	 * デフォルト指定の外部システム・ＩＦ処理区分のフォルダ存在チェック
	 * 
	 * @param ifR 探索範囲の条件
	 * @param ifPrtclL 探索対象となる外部システム・ＩＦ処理区分の情報
	 */
	protected void getDefDir(PFT_SDRV_IF_R ifR, MCList<MAM_IF_PROTOCOL_R> ifPrtclL) {
		
		MCList<MAM_IF_PROTOCOL_R> dmyL = null;
		MCList<MAM_IF_PROTOCOL_R> wkIfPrtclL = MCList.create(MAM_IF_PROTOCOL_R.class);
		
		// 通信ルールマスタの指定が無い場合は、デフォルトのディレクトリを存在する機能を取得
		dmyL = detectIfProcTypDir(PFUCL_AppSys._def_local_dir, ifR);
		if(dmyL != null && !dmyL.isEmpty()) {
			wkIfPrtclL.addAll(dmyL);
		}
		ifPrtclL.addAll(wkIfPrtclL);
	}

	/**
	 * ＩＦ処理区分のフォルダのリスト作成
	 * 
	 * 指定されたフォルダの直下に外部システムＣＤと同名のフォルダが存在する場合、それをリスト化して戻す
	 * 
	 * @param rootDir 探索対象のルートフォルダ
	 * @param wkIfR 
	 * @param ifPrtclL 探索対象となる外部システム・ＩＦ処理区分の情報
	 * @return 外部システムマスタのリスト（外部システムＣＤのリスト）
	 */
	protected MCList<MAM_EXT_SYS_R> detectExtSysDir(String rootDir, PFT_SDRV_IF_R wkIfR, MCList<MAM_IF_PROTOCOL_R> ifPrtclL) {

		MCList<MAM_EXT_SYS_R> extSysL   = MCList.create(MAM_EXT_SYS_R.class);
		MAM_EXT_SYS_R t = MAM_EXT_SYS_R.create("T");
		MCQueryApiBuilder extSysL_bldr = MCQueryApiBuilder.create(t);
		MCList<MAM_EXT_SYS_R> wkExtSysL = MCList.create(MAM_EXT_SYS_R.class);
		
		String baseDir = _ifPrtclMgr.convPlaceHolder(rootDir, wkIfR, PFUCL_AppSys.IfPrtclMgr.PlaceHolder.EXT_SYS_CD);
		int pos = baseDir.indexOf(PFUCL_AppSys.IfPrtclMgr.PlaceHolder.EXT_SYS_CD);
		if(pos > 0) {
			//プレースフォルダ に{EXT_SYS_CD)}がある場合のみトリムする
			baseDir = baseDir.substring(0, pos);
		}
		File f = new File(baseDir);
		if (!f.exists()) {
			return null;
		}
		
		// 外部システムＣＤのリスト取得
		String[] dirList = f.list();
		if(!isNull(wkIfR.ext_sys_cd())) {
			MAM_EXT_SYS_R eR = extSysL.createRow();
			eR.ext_sys_cd(wkIfR.ext_sys_cd());
			extSysL.add(eR);
		}
		else {
			dbSelect(createSqlId(LOGIC_ID, t, "S01"), extSysL, extSysL_bldr);
		}

		// 外部システムＣＤと同名のフォルダが存在する場合、wkExtSysLに追加
		for (MAM_EXT_SYS_R extSysR: extSysL) {
			for(int i=0; i < dirList.length; i++){
				if(isSame(dirList[i], extSysR.ext_sys_cd())) {
					wkExtSysL.add(extSysR);
					break;
				}
			}
		}
		return wkExtSysL;
	}
	
	/**
	 * ＩＦ処理区分のフォルダの存在チェックとリスト作成
	 * 
	 * 指定されたフォルダの直下にＩＦ処理区分と同名のフォルダが存在する場合、それをリスト化して戻す
	 * 
	 * @param rootDir 探索対象のルートフォルダ
	 * @param wkIfR 
	 * @param ifPrtclL 探索対象となる外部システム・ＩＦ処理区分の情報
	 * @return ＩＦ通信ルールマスタのリスト（外部システムＣＤ・ＩＦ処理区分のリスト）
	 */
	protected MCList<MAM_IF_PROTOCOL_R> detectIfProcTypDir(String rootDir, PFT_SDRV_IF_R wkIfR) {

		MCList<MAM_IF_PROTOCOL_R> wkIfPrtclL = MCList.create(MAM_IF_PROTOCOL_R.class);

		//ＩＦ処理区分の手前のフォルダを取得するため、プレースフォルダの置換をしない
		String wkDir = _ifPrtclMgr.convPlaceHolder(rootDir, wkIfR, PFUCL_AppSys.IfPrtclMgr.PlaceHolder.IF_PROC_TYP);

		wkDir = nvl(wkDir, "");
		int pos = wkDir.indexOf(PFUCL_AppSys.IfPrtclMgr.PlaceHolder.IF_PROC_TYP);
		if(pos > 0) {
			wkDir = wkDir.substring(0, pos);
		}
		else if(isNull(wkIfR.if_proc_typ()) || !MAC_IF_PROC_TYP.contains(wkIfR.if_proc_typ())){
			//ＩＦ処理区分をプレースホルダに持たず、引数にＩＦ処理区分の指定が無い場合は、処理の継続ができないので終了
			return wkIfPrtclL;
		}

		// 存在するディレクトリに合致する外部システムＣＤをwkExtSysLに保存
		for (MAC_IF_PROC_TYP ifProcTyp: MAC_IF_PROC_TYP.array()) {
			// 受信のＩＦ処理区分以外はスキップ
			if(ifProcTyp.is_send()) {
				continue;
			}
			else if(!isNull(wkIfR.if_proc_typ())) {
				if(!isSame(ifProcTyp.value(), wkIfR.if_proc_typ())){
					continue;
				}
			}
			MAM_IF_PROTOCOL_R wkPrtclR = MAM_IF_PROTOCOL_R.create();
			wkPrtclR.ext_sys_cd(wkIfR.ext_sys_cd());
			wkPrtclR.if_proc_typ(ifProcTyp.value());
			wkIfPrtclL.add(wkPrtclR);
		}
		return wkIfPrtclL;
	}

	/**
	 * 受信対象ディレクトリ情報、およびＩＦルールマスタの情報のリストを返す
	 * @param ifPrtclL 受信対象の外部システム・ＩＦ処理区分のリスト
	 * @return
	 */
	protected <T extends MCRow>MCList<DtlR> getPrtclDir(MCList<MAM_IF_PROTOCOL_R> ifPrtclL) {
		// 対応する全フォルダを取得する
		MCList<DtlR> dtlL = MCList.create(DtlR.class);
		for(MAM_IF_PROTOCOL_R ifPrtclR: ifPrtclL) {
			_ifPrtclMgr.set(ifPrtclR.ext_sys_cd(), ifPrtclR.if_proc_typ());
			String recvTyp = _ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.RECV_TYP,ifPrtclR.if_proc_typ());
			DtlR dtlR = DtlR.create();
			dtlR.local_dir(_ifPrtclMgr.getLocalDir(ifPrtclR.if_proc_typ()));
			dtlR.remote_dir(_ifPrtclMgr.getRecvRemoteDir(ifPrtclR.if_proc_typ(), false));
			dtlR.transfer_lock_typ(_ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.TRANSFER_LOCK_TYP, ifPrtclR.if_proc_typ()));
			dtlR.sts_fsuffix(_ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.STS_FILE_SUFFIX, ifPrtclR.if_proc_typ()));
			if(isSame(recvTyp, PFUCL_AppSys._recv_typ_ftp)) {
				dtlR.ftp_host(_ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.FTP_HOST, ifPrtclR.if_proc_typ()));
				dtlR.ftp_user(_ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.FTP_USER, ifPrtclR.if_proc_typ()));
				dtlR.ftp_password(_ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.FTP_PASS, ifPrtclR.if_proc_typ()));
				dtlR.ftp_port(_ifPrtclMgr.getIfCtlNumber(MAC_IF_CTL_TYP.FTP_PORT, ifPrtclR.if_proc_typ()));
				dtlR.ftp_mode(_ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.FTP_MODE, ifPrtclR.if_proc_typ()));
				dtlR.ftp_opts(_ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.FTP_OPTS, ifPrtclR.if_proc_typ()));

				// リモート情報が設定されていないときは、関連する情報は設定しない		
				if (isNull(dtlR.remote_dir())
				 || isNull(dtlR.ftp_host())
				 || isNull(dtlR.ftp_user())
				 || isNull(dtlR.ftp_password())) {
					dtlR.remote_dir(null);
					dtlR.ftp_host(null);
					dtlR.ftp_user(null);
					dtlR.ftp_password(null);
					dtlR.ftp_port(null);
					dtlR.ftp_mode(null);
					dtlR.ftp_opts(null);
				}
			}
			else if(isSame(recvTyp, PFUCL_AppSys._recv_typ_sftp)) {
				dtlR.sftp_host(_ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.SFTP_HOST, ifPrtclR.if_proc_typ()));
				dtlR.sftp_user(_ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.SFTP_USER, ifPrtclR.if_proc_typ()));
				dtlR.sftp_password(_ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.SFTP_PASS, ifPrtclR.if_proc_typ()));
				dtlR.sftp_port(_ifPrtclMgr.getIfCtlNumber(MAC_IF_CTL_TYP.SFTP_PORT, ifPrtclR.if_proc_typ()));
				dtlR.sftp_key_file_path(_ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.SFTP_KEY_FILE_PATH, ifPrtclR.if_proc_typ()));

				// リモート情報が設定されていないときは、関連する情報は設定しない		
				if (isNull(dtlR.remote_dir())
				 || isNull(dtlR.sftp_host())
				 || isNull(dtlR.sftp_user())
				 || (isNull(dtlR.sftp_password()) && isNull(dtlR.sftp_key_file_path()))) {
					dtlR.remote_dir(null);
					dtlR.sftp_host(null);
					dtlR.sftp_user(null);
					dtlR.sftp_password(null);
					dtlR.sftp_port(null);
					dtlR.sftp_key_file_path(null);
				}
			}
			dtlR.if_proc_typ(ifPrtclR.if_proc_typ());
			dtlR.ext_sys_cd(ifPrtclR.ext_sys_cd());
			dtlL.add(dtlR);
		}
		return dtlL;
	}

	//FMCB CUSTOM END
}