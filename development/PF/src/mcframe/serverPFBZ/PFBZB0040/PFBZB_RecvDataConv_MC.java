package mcframe.serverPFBZ.PFBZB0040;

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
import mcframe.serverPFUD.PFUDL5020.*;	// このimportはFrameManagerの自動生成で追加されました。

import java.io.File;
import java.util.ArrayList;

import mcframe.commonCore.net.MCFtpClient;
import mcframe.serverPFUD.PFUDL0040.Upd01_DtlR;
import mcframe.serverPFBZ.PFBZL5040.*;

import static mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "PFBZB_RecvDataConv"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class PFBZB_RecvDataConv_MC extends PFBZB_RecvDataConv_MC_A{
	//FMCB CUSTOM START

	/**
	 * 受信の単位
	 */
	private String[] _RECVKEY1;
	protected String[] RECVKEY1() {
		if(_RECVKEY1 == null ) {
			_RECVKEY1 = new String[] {DtlR.$if_proc_typ,
										DtlR.$ext_sys_cd,
										DtlR.$local_dir,
										DtlR.$transfer_lock_typ};
		}
		return _RECVKEY1;
	}


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
	 * 受信変換の単位
	 */
	private String[] _RECVKEY2;
	protected String[] RECVKEY2() {
		if(_RECVKEY2 == null ) {
			_RECVKEY2 = new String[] {SdrvDtlR.$if_proc_typ, SdrvDtlR.$ext_sys_cd};
		}
		return _RECVKEY2;
	}

	/** MCMessagePool退避用 */
	protected MCMessageList _buMessageList = new MCMessageList();
	
	/**
	 * Upd01オペレーション.<p>
	 *
	 * ローカルフォルダからファイルを取得し、ファイルを入力・コード変換を行うUpd02オペレーションを実行する<br>
	 */
	public class Upd01 extends PFBZB_RecvDataConv_MC_A.Upd01 {

		/**
		 * FTPクライアント<br>
		 * ローカルフォルダ内のファイルの抽出に使用
		 */
		protected MCFtpClient _ftpClnt = new MCFtpClient();	

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			MCList<DtlR> dirL = null;
			
			initLog();
			writeStartLog();

			try {
				dirL = readRecvIf();
				if (dirL.isEmpty()) {
					MCMessagePool.add(new MCMessage(PFBZL0022));
					writeEndLog();
					return;
				}
			}
			catch (Exception ex) {
				procErrLog(ex);
				throw ex;
			}

			MCList<DtlR> grpL = dirL.groupBy(RECVKEY1());
			MCList<SdrvDtlR> sdrvDtlL = MCList.create(SdrvDtlR.class);
			
			for (DtlR grpR : grpL) {
				try {
					procRecvStartLog(grpR);

					sdrvDtlL = srchLocalFiles(dirL.subList(RECVKEY1(), grpR.toArray(RECVKEY1())));
					setLogKey(sdrvDtlL);
					setDataNo(sdrvDtlL);
					makeDtlL(sdrvDtlL);
					
					recvIf(sdrvDtlL, true);
					updRecvIf(sdrvDtlL, true);

					// 取込処理の前にデータを確定させる
					dbTran().commit();
					procDataLog();

					// 変換完了のデータのみ取込処理対象とする
					callImpOpe(sdrvDtlL.subList(SdrvDtlR.$sdrv_sts_typ, MAC_SDRV_STS_TYP.RECV_CONV_OK.value()));

					rsltCnt(sdrvDtlL);
					
				}
				catch (Exception ex) {
					procErrLog(ex);
				}
				finally{
					for (SdrvDtlR dtlR : sdrvDtlL) {
						if (MAC_SDRV_STS_TYP.isNOTYET(dtlR.sdrv_sts_typ()) ||
							MAC_SDRV_STS_TYP.isRECV_ERR(dtlR.sdrv_sts_typ()) ||
							MAC_SDRV_STS_TYP.isRECV_CONV_ERR(dtlR.sdrv_sts_typ())) {

							moveToErr(dtlR.ifFile().file_path(), dtlR.ifFile().file_nm(), dtlR.sts_fsuffix());
						}
						else {
							moveToTrash(dtlR.ifFile().file_path(), dtlR.ifFile().file_nm(), dtlR.sts_fsuffix());
						}
					}
					procRecvEndLog();
				}
			}
			writeEndLog();
		}

		protected MCList<DtlR> readRecvIf() {
			PFBZL_FileRecv.Srch02 ope = PFBZL_FileRecv.crtSrch02();
			copy(ope.up0(), up0(), createSrchCndR_CndR());
			ope.exec();
			procDataLog();
			MCMessagePool.clear();
			return ope.down0();
		}

		/**
		 * 受信対象ファイルを抽出する
		 * @param dirL ファイル取得対象ディレクトリのリスト
		 * @return 取得対象のファイルリスト
		 */
		protected MCList<SdrvDtlR> srchLocalFiles(MCList<DtlR> dirL) {
			MCList<SdrvDtlR> sdrvDtlL = MCList.create(SdrvDtlR.class);

			MAUCC_RowMapperWith<SdrvDtlR, DtlR, File> mapper = createSdrvDtlR_PFBZL5040_DtlR();
			for (DtlR dirR : dirL) {
				try {
					ArrayList<File> files = srchLocalFiles(dirR);
					
					for (File file : files) {
						SdrvDtlR sdrvDtlR = SdrvDtlR.create();
						copy(sdrvDtlR, dirR, file, mapper);
						sdrvDtlL.add(sdrvDtlR);
					}
				}
				catch (Exception ex) {
					procErrLog(ex);
					if(!(ex instanceof MCException)) {
						throw ex;
					}
				}
			}
			sdrvDtlL.sort(SdrvDtlR.$if_proc_typ, SdrvDtlR.$ext_sys_cd, SdrvDtlR.$file_path, SdrvDtlR.$file_nm);
			return sdrvDtlL;
		}

		protected ArrayList<File> srchLocalFiles(DtlR dirR) {

			ArrayList<File> arr = new ArrayList<>();

			// 転送モードによるファイルのフィルタリングを考慮
			if (isSame(dirR.transfer_lock_typ(), _transfer_lock_typ_status)) {
				_ftpClnt.setFtpMode(MCFtpClient.STATUS_FILE_MODE);
				if (!isNull(dirR.sts_fsuffix())) {
					_ftpClnt.setStatusFileSuffix(dirR.sts_fsuffix());
				}
			}
			else {
				_ftpClnt.setFtpMode(MCFtpClient.RENAME_MODE);
				_ftpClnt.setStatusFileSuffix(null);
			}
			for (File file : _ftpClnt.getReceiveFileList(dirR.local_dir())) {
				arr.add(file);
			}

			return arr;
		}

		protected void callImpOpe(MCList<SdrvDtlR> sdrvDtlL) {

			MCList<Upd01_DtlR> upL = MCList.create(Upd01_DtlR.class);	
			MCRowMapper<Upd01_DtlR, SdrvDtlR> mapper = createUpd01_Dtl_SdrvDtlR();

			// 外部システムＣＤ毎に即時取込みするか否かが決定する
			for (MCList<SdrvDtlR> dtlL : sdrvDtlL.groupList(SdrvDtlR.$ext_sys_cd)) {
				SdrvDtlR grpR = dtlL.get(0);
				if (isNull(grpR) || isNull(grpR.ext_sys_cd()) || 
						!ifAdptrMgr().getRealImpFlg(grpR.sdrvIf())) {
					continue;
				}

				setAll(upL, dtlL, mapper);
				
				try {
					callImpOperation(MAC_IF_PROC_TYP.imp_ope(grpR.if_proc_typ()), upL);
					logger().writeProcessLog(PFBZL0025, MAC_IF_PROC_TYP.imp_ope(grpR.if_proc_typ()));
				}
				catch (Exception ex) {
					logger().writeProcessLog(PFBZL0026, MAC_IF_PROC_TYP.imp_ope(grpR.if_proc_typ()));
					procErrLog(ex);
				}
			}
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

		protected SdrvDtlR_PFBZL5040_DtlR<SdrvDtlR, DtlR, File> createSdrvDtlR_PFBZL5040_DtlR() {
			return new SdrvDtlR_PFBZL5040_DtlR<SdrvDtlR, DtlR, File>();
		}
		public class SdrvDtlR_PFBZL5040_DtlR<D extends SdrvDtlR, S extends DtlR, W extends File>
				extends MAUCC_RowMapperWith<D,S,W>{
			
			protected W _file;
			
			@Override
			public void setWith(W file) {
				this._file = file;
			}
			
			@Override
			public void valueCopy(D dest, S src){
				dest.if_proc_typ(src.if_proc_typ());
				dest.ext_sys_cd(src.ext_sys_cd());
				dest.file_path(_file.getParent());
				dest.file_nm(_file.getName());
				dest.sts_fsuffix(_ftpClnt.getStatusFileSuffix());
			}
		}

		protected Upd01_Dtl_SdrvDtlR<Upd01_DtlR, SdrvDtlR> createUpd01_Dtl_SdrvDtlR() {
			return new Upd01_Dtl_SdrvDtlR<Upd01_DtlR, SdrvDtlR>();
		}
		public class Upd01_Dtl_SdrvDtlR<D extends Upd01_DtlR, S extends SdrvDtlR>
				extends MCRowMapper<D,S>{
			@Override
			public void valueCopy(D dest, S src){
				dest.data_no(src.data_no());
				dest.if_proc_typ(src.if_proc_typ());
			}
		}
	}

	/**
	 * Upd02オペレーション.<p>
	 *
	 * ファイル入力、コード変換を行い受信ＩＦ情報を作成する<br>
	 */
	public class Upd02 extends PFBZB_RecvDataConv_MC_A.Upd02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			
		}

	}

	/**
	 * Upd03オペレーション.<p>
	 *
	 * 画面から指定したデータに対して、受信ＩＦ情報のコードを変換する<br>
	 */
	public class Upd03 extends PFBZB_RecvDataConv_MC_A.Upd03 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			initLog();
			writeStartLog();

			for (MCList<SdrvDtlR> upL : up0().groupList(RECVKEY2())) {
				procConvStartLog(upL.get(0));
				setLogKey(upL);

				String svp = "svp_" + upL.get(0).data_no().toString();

				try {
					dbTran().setSavepoint(svp);

					lockAndCheckRecvIf(upL);
					recvIf(upL, false);
					updRecvIf(upL, false);
					rsltCnt(upL);
				}
				catch (Exception ex) {
					dbTran().rollback(svp);
					procErrLog(ex);
				}
				finally {
					procConvEndLog();
				}
			}
			writeEndLog();
		}
	}

	/**
	 * 
	 * @param dtlL
	 * @param execRecvOpe
	 */
	protected void recvIf(MCList<SdrvDtlR> sdrvDtlL, boolean execRecvOpe) {
		for (SdrvDtlR sdrvDtlR : sdrvDtlL) {
			if(execRecvOpe) {
				logger().writeProcessLog(PFBZL0024, sdrvDtlR.file_nm());
			}
			String svp = "svp_" + sdrvDtlR.file_nm();
			try {
				dbTran().setSavepoint(svp);
				callOperation(sdrvDtlR, execRecvOpe);

			}
			catch (Exception ex) {
				dbTran().rollback(svp);
				handleEx(ex, sdrvDtlL);
			}
		}	
	}

	protected void callOperation(SdrvDtlR dtlR, boolean execRecvOpe) {

		// 受信
		if (execRecvOpe) {
			MCList<SdrvDtlR> dtlL = MCList.create(SdrvDtlR.class);
			dtlL.add(dtlR);
			callReadOperation(dtlR.sdrvIf().file_io_ope(), dtlL, null);

			try {
				insIfFile(dtlR);
				insSdrvIfFile(dtlR);
				insSdrvIf(dtlR);
			}
			catch(Exception ex) {
				// レコードの登録で失敗した場合は、処理の継続はできない。
				// トラブル発生したファイルをreadyに戻して再度取込みを
				// 実施する旨をガイドする
				logger().writeProcessLog(PFBZL0056, dtlR.file_nm(), dtlR.file_path());
				handleEx(ex, dtlR);
			}
		}
		//コード変換直前に最新のコード変換アダプタをセットする
		dtlR.sdrvIf().conv_ope(ifAdptrMgr().getConvOpe(dtlR.sdrvIf()));

		// 後処理（コード変換）
		if (!MAC_SDRV_STS_TYP.isRECV_ERR(dtlR.sdrv_sts_typ()) &&
			!isNull(dtlR.sdrvIf().conv_ope())) {
			
			
			ConvDtlR upR = ConvDtlR.create();
			copy(upR, dtlR, createConvDtlR_SdrvDtlR());

			MCList<ConvDtlR> upL = MCList.create(ConvDtlR.class);
			upL.add(upR);
			callPostOperation(dtlR.sdrvIf().conv_ope(), upL, null);

			dtlR.sdrv_sts_typ(upL.get(0).sdrv_sts_typ());
		}
	}
	
	protected void lockAndCheckRecvIf(MCList<SdrvDtlR> dtlL) {

		PFT_SDRV_IF_R t = PFT_SDRV_IF_R.create("T");
		MCList<PFT_SDRV_IF_R> workL = MCList.create(PFT_SDRV_IF_R.class);
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		
		builder.setSelect(t.if_proc_typ, t.data_no)
			.addOrderByAsc(t.if_proc_typ, t.data_no);
		dbSelectKeyForUpdateNoWait(createSqlId(LOGIC_ID, t, "S01"), workL, builder, dtlL);
		
		checkUpdCntr(dtlL, _$ifKey, workL,_$ifKey);
	}
	
	protected void setDataNo(MCList<SdrvDtlR> sdrvDtlL) {
		//DataNoはＥＳＢ共通のシーケンス"ESB_DATA_NO"を利用する
		doSeqCache(MAC_NUM_SYS_TYP.ESB_DATA_NO, sdrvDtlL.size());
		for (SdrvDtlR dtlR : sdrvDtlL) {
			dtlR.data_no(getSequence(MAC_NUM_SYS_TYP.ESB_DATA_NO.value()));
		}
	}

	protected void makeDtlL(MCList<SdrvDtlR> sdrvDtlL) {
	
		for(SdrvDtlR sdrvDtlR : sdrvDtlL) {
			sdrvDtlR.sdrv_sts_typ(MAC_SDRV_STS_TYP.NOTYET.value());
			sdrvDtlR.sdrvIf().file_io_ope(ifAdptrMgr().getFileIoOpe(sdrvDtlR.sdrvIf()));
			sdrvDtlR.sdrvIf().conv_ope(ifAdptrMgr().getConvOpe(sdrvDtlR.sdrvIf()));
		}
		
	}
	
	protected void insSdrvIf(SdrvDtlR dtlR) {
		dtlR.sdrvIf().sdrv_tm(MCDate.now());
		PFT_SDRV_IF_R ifR = dtlR.sdrvIf().clone();
		dbInsert(createSqlId(LOGIC_ID, PFT_SDRV_IF_R.TABLE_NAME, "I02"), ifR, MCQueryApiBuilder.create(PFT_SDRV_IF_R.create()));
	}

	protected void updRecvIf(MCList<SdrvDtlR> dtlL, boolean execRecvOpe) {
		
		MCList<PFT_SDRV_IF_R> 
			ifL = MCList.create(PFT_SDRV_IF_R.class),
			exL = MCList.create(PFT_SDRV_IF_R.class);
		PFT_SDRV_IF_R t = PFT_SDRV_IF_R.create("T");
		PFT_SDRV_IF_R ext = PFT_SDRV_IF_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		MCQueryApiBuilder builderEx = MCQueryApiBuilder.create(ext);
		MCDate tm = MCDate.now();
		for (SdrvDtlR dtlR : dtlL) {
			if (isNull(dtlR.sdrv_sts_typ())) {	// 処理対象外
				exL.add(dtlR.sdrvIf());
				continue;
			}
			PFT_SDRV_IF_R ifR = dtlR.sdrvIf().clone();
			if (MAC_SDRV_STS_TYP.isRECV_CONV_OK(ifR.sdrv_sts_typ())) {
				ifR.sdrv_tm(tm);
			}
			else {
				ifR.conv_ope(null);	// 変換完了以外は更新しない
			}
			ifL.add(ifR);
		}
		if (!ifL.isEmpty()) {
			builder.setSet(
					t.conv_ope,
					t.sdrv_sts_typ,
					t.batch_log_no,
					t.log_sub_key1,
					t.log_sub_key2
					);
			if (execRecvOpe) {
				builder.addSet(t.sdrv_tm);
			}
			dbUpdateKey(createSqlId(LOGIC_ID, t, "U01"), ifL, builder);
		}

		if (!exL.isEmpty()) {
			builderEx.setSet(
					ext.batch_log_no,
					ext.log_sub_key1,
					ext.log_sub_key2
					);
			dbUpdateKey(createSqlId(LOGIC_ID, ext, "U02"), exL, builderEx);
		}
	}

	protected void insIfFile(SdrvDtlR dtlR) {
		PFT_IF_FILE_R fR = PFT_IF_FILE_R.create();
		copy(fR, dtlR, createPFT_IF_FILE_SdrvDtlR());
		dbInsert(createSqlId(LOGIC_ID, PFT_IF_FILE_R.TABLE_NAME, "I03"), fR, MCQueryApiBuilder.create(PFT_IF_FILE_R.create()));
		
		// PFT_SDRV_IF_FILEの更新で使う
		dtlR.file_id(fR.file_id());
	}

	protected PFT_IF_FILE_SdrvDtlR<PFT_IF_FILE_R, SdrvDtlR> createPFT_IF_FILE_SdrvDtlR() {
		return new PFT_IF_FILE_SdrvDtlR<PFT_IF_FILE_R, SdrvDtlR>();
	}
	public class PFT_IF_FILE_SdrvDtlR<D extends PFT_IF_FILE_R, S extends SdrvDtlR>
			extends MCRowMapper<D,S>{
		@Override
		public void valueCopy(D dest, S src){
			dest.file_id(getSequence(MAC_NUM_SYS_TYP.ESB_FILE_ID.value()));
			dest.file_path(src.ifFile().file_path());
			dest.file_nm(src.ifFile().file_nm());
			if(MAC_SDRV_STS_TYP.isRECV_OK(src.sdrv_sts_typ())) {
				dest.fproc_typ(MAC_FPROC_TYP.OK.value());	// 処理済
			}
			else {
				dest.fproc_typ(MAC_FPROC_TYP.ERR.value());	// エラー
			}
		}
	}
	
	protected void insSdrvIfFile(SdrvDtlR dtlL) {
		PFT_SDRV_IF_FILE_R r = PFT_SDRV_IF_FILE_R.create();
		copy(r, dtlL, createPFT_SDRV_IF_FILE_SdrvDtlR());
		dbInsert(createSqlId(LOGIC_ID, PFT_SDRV_IF_FILE_R.TABLE_NAME, "I01"), r, MCQueryApiBuilder.create(PFT_SDRV_IF_FILE_R.create()));
	}

	protected PFT_SDRV_IF_FILE_SdrvDtlR<PFT_SDRV_IF_FILE_R, SdrvDtlR> createPFT_SDRV_IF_FILE_SdrvDtlR() {
		return new PFT_SDRV_IF_FILE_SdrvDtlR<PFT_SDRV_IF_FILE_R, SdrvDtlR>();
	}
	public class PFT_SDRV_IF_FILE_SdrvDtlR<D extends PFT_SDRV_IF_FILE_R, S extends SdrvDtlR>
			extends MCRowMapper<D,S>{
		@Override
		public void valueCopy(D dest, S src){
			dest.data_no(src.data_no());
			dest.file_id(src.file_id());
		}
	}

	protected ConvDtlR_DtlR<ConvDtlR, SdrvDtlR> createConvDtlR_SdrvDtlR() {
		return new ConvDtlR_DtlR<ConvDtlR, SdrvDtlR>();
	}
	public class ConvDtlR_DtlR<D extends ConvDtlR, S extends SdrvDtlR>
			extends MCRowMapper<D,S>{
		@Override
		public void valueCopy(D dest, S src){
			dest.data_no(src.data_no());
			dest.if_proc_typ(src.if_proc_typ());
			dest.ext_sys_cd(src.ext_sys_cd());
		}
	}

	/**
	 * ログのキーをセットする
	 */
	protected void setLogKey(MCList<?> keyL) {
		if(isNull(keyL)) {
			return;
		}
		if(keyL.get(0).contains(DtlR.$sdrvIf)) {
			MCList<?> sdrvL =keyL.innerRowList(SdrvDtlR.$sdrvIf);
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
	 * ログの初期化
	 */
	protected void initLog() {
		getLogger();
	}

	/**
	 * バッチ処理の開始
	 */
	protected void writeStartLog() {
		logger().writeStartLog(PFBZL0046);
		pushStartLog(logger());
	}
	/**
	 * ファイル取得処理のループ開始ログ
	 * @param dirR
	 */
	protected void procRecvStartLog(DtlR dirR) {
		logger().writeProcessLog(PFBZL0021,
			dirR.ext_sys_cd(), dirR.if_proc_typ(), dirR.local_dir(),
			isSame(dirR.transfer_lock_typ(), _transfer_lock_typ_status) ?
					_transfer_lock_typ_status : _transfer_lock_typ_rename);
	}
	
	/**
	 * 変換処理のループ開始ログ
	 * @param upR
	 */
	protected void procConvStartLog(SdrvDtlR upR) {
		logger().writeProcessLog(
			PFBZL0016
			, upR.ext_sys_cd()
			, upR.if_proc_typ()
			, ifAdptrMgr().getConvOpe(upR.sdrvIf()));
	}

	/**
	 * データログ
	 */
	protected void procDataLog() {
		logger().writeDataLog(MCMessagePool.getMessageList());
		_buMessageList.addAll(MCMessagePool.getMessageList());
		MCMessagePool.clear();
	}
	/**
	 * エラー発生時のログ
	 * @param ex
	 */
	protected void procErrLog(Exception ex) {
		MCLog.write(ex);
		logger().writeProcessLog(
			ex instanceof MCException ? (MCException)ex :  new MCException(ex));
	}

	/**
	 * 受信コード変換処理のプロセス終了ログ
	 */
	protected void procConvEndLog() {
		procDataLog();
		MCMessagePool.clear();

		if (_totalCnt == 0) {
			logger().writeProcessLog(PFBZL0017);
		}
		else {
			logger().writeProcessLog(PFBZL0018, _totalCnt, _successCnt, _errorCnt, _skipCnt);
		}
	}
	
	/**
	 * 受信変換処理のプロセス終了ログ
	 */
	protected void procRecvEndLog() {
		procDataLog();
		MCMessagePool.clear();
		if (_totalCnt == 0) {
			logger().writeProcessLog(PFBZL0022);
		}
		else {
			logger().writeProcessLog(PFBZL0023, _totalCnt, _successCnt, _errorCnt, _skipCnt);
		}
	}

	/**
	 * 受信変換処理の終了ログ
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
		logger().writeEndLog(PFBZL0047);
		pushEndLog(logger());
	}

	protected <T extends SdrvDtlR>void rsltCnt(MCList<T> upL) {
		_totalCnt = _successCnt = _errorCnt = _skipCnt = 0;
		for (SdrvDtlR dtlR : upL) {
			if (MAC_SDRV_STS_TYP.isRECV_ERR(dtlR.sdrv_sts_typ())
			 || MAC_SDRV_STS_TYP.isRECV_CONV_ERR(dtlR.sdrv_sts_typ())) {
				_errorCnt++;
				_sumErrorCnt++;
			}
			else if (MAC_SDRV_STS_TYP.isRECV_CONV_OK(dtlR.sdrv_sts_typ())
				  || MAC_SDRV_STS_TYP.isRECV_OK(dtlR.sdrv_sts_typ())) {
				_successCnt++;
			}
			else {
				_skipCnt++;
			}
			_totalCnt++;
			_sumTotalCnt++;
		}
	}

	//FMCB CUSTOM END
}