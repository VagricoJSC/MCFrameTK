package mcframe.serverPFBZ.PFBZB5010;

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

import java.util.ArrayList;
import java.util.List;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.serverPFBZ.PFBZL9050.*;
import static mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverCore.requester.MCServerThreadManager;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogger;
//FMCB CUSTOM_IMPORT END

/**
 * "PFBZB_SendDataConv"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class PFBZB_SendDataConv_MC extends PFBZB_SendDataConv_MC_A{
	//FMCB CUSTOM START

	/**
	 * 送信単位のキー
	 */
	private String[] _SENDKEY;
	protected String[] SENDKEY() {
		if(_SENDKEY == null ) {
			_SENDKEY = new String[] {SdrvDtlR.$if_proc_typ, SdrvDtlR.$ext_sys_cd};
		}
		return _SENDKEY;
	}

	/** 対象件数 */
	protected int _totalCnt = 0;

	/** 正常終了件数 */
	protected int _successCnt = 0;

	/** エラー件数 */
	protected int _errorCnt = 0;

	/** スキップ件数 */
	protected int _skipCnt = 0;
	
	/** MCMessagePool退避用 */
	protected MCMessageList _buMessageList = new MCMessageList();

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 送信対象の送信ＩＦ情報を検索し、コード変換、ファイル出力を行う<br>
	 */
	public class Upd01 extends PFBZB_SendDataConv_MC_A.Upd01 {
		protected MCList<SdrvDtlR> _ifL = MCList.create(SdrvDtlR.class);

		/** 全対象件数 */
		protected int _sumTotalCnt = 0;

		/** 全エラー件数 */
		protected int _sumErrorCnt = 0;

		protected FXBAL_BatchLogger _logger = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			_logger = getConcurrentLogger();
			try {
				writeStartLog(_logger);
				
				MCMessageList msgL = chkUpParam();
				if (!msgL.isEmpty()) {
					logger().writeProcessLog(msgL);
					throw new MCAppException(msgOpeErr());
				}
				
				callSrch();
				if (_ifL.isEmpty()) {
					procEndLog(_logger);
				}
				else {
					procDataLog();
					
					setLogKey(_ifL, _logger);
					callSdrvIf();
					
					backupMessagePool();
				}
			}
			catch (Exception ex) {
				handleEx(ex, _logger);
			}
			finally {
				writeEndLog(_logger, _sumTotalCnt, _sumErrorCnt);
			}
		}
		
		protected MCMessageList chkUpParam() {
			MCMessageList msgL = new MCMessageList();
			if (!isNull(up0().co_cd()) && !isSame(up0().ext_sys_cd(), getExtSysCd())) {
				msgL.add(new MCMessage(PFBZL0505, up0().if_proc_typ(), up0().ext_sys_cd(), up0().co_cd()));
			}
			return msgL;
		}

		// 送信対象ＩＦの取得
		protected void callSrch() {
			PFBZL_SendRecvIfCtrl.Srch01 ope = PFBZL_SendRecvIfCtrl.crtSrch01();
			copy(ope.up0(), up0(), createSrch01_CndR_CndR());
			ope.exec();

			setAll(_ifL, ope.down0(), createSdrvDtlR_Srch01_DtlR());

		}

		protected Srch01_CndR_CndR<Srch01_CndR, CndR> createSrch01_CndR_CndR() {
			return new Srch01_CndR_CndR<Srch01_CndR, CndR>();
		}

		public class Srch01_CndR_CndR<D extends Srch01_CndR, S extends CndR> extends MCRowMapper<D, S> {
			@Override
			public void valueCopy(D dest, S src) {
				dest.if_proc_typ(src.if_proc_typ());
				dest.ext_sys_cd(src.ext_sys_cd());
				dest.batch_flg(true);
				dest.notyet_flg(true);
				dest.send_conv_err_flg(true);
				dest.send_err_flg(true);
			}
		}

		protected SdrvDtlR_Srch01_DtlR<SdrvDtlR, Srch01_DtlR> createSdrvDtlR_Srch01_DtlR() {
			return new SdrvDtlR_Srch01_DtlR<SdrvDtlR, Srch01_DtlR>();
		}

		public class SdrvDtlR_Srch01_DtlR<D extends SdrvDtlR, S extends Srch01_DtlR> extends MCRowMapper<D, S> {
			@Override
			public void valueCopy(D dest, S src) {
				dest.sdrvIf(src.sdrvIf());
				dest.ifFile(src.ifFile());
				dest.batch_flg(true);
			}
		}

		/**
		 * 送信変換処理のメイン処理の呼出
		 */
		protected void callSdrvIf() {
			List<Upd02> opeL = new ArrayList<>();
			for (MCList<SdrvDtlR> cndL : splitTgt(_ifL)) {
				Upd02 ope = crtUpd02();
				ope.up0().addAll(cndL);
				ope.up0().forEach(r -> r.co_cd(up0().co_cd()));
				opeL.add(ope);
			}
			if (!opeL.isEmpty()) {
				if (MCServerThreadManager.getLimitThreadSize() == 1) {
					MCServerThreadManager.setUseMainDBTran(true);
				}
				MCServerThreadManager.invokeAndWait(opeL, FXBAL_BatchLogManager.class);
			}
			for (Upd02 ope : opeL) {
				for (SdrvRsltR downR : ope.down0()) {
					_sumTotalCnt += downR.total_cnt().intValue();
					_sumErrorCnt += downR.error_cnt().intValue();
				}
			}
		}

		/**
		 * スレッドサイズを考慮して上り電文を分割する
		 * @param list
		 * @return
		 */
		protected List<MCList<SdrvDtlR>> splitTgt(MCList<SdrvDtlR> list) {
			List<MCList<SdrvDtlR>> ret = new ArrayList<>();
			if (list.isEmpty()) {
				return ret;
			}
			MCSortPolicy sortPolicy = new MCSortPolicy();
			sortPolicy.add(MCList.SortType.ASC, SdrvDtlR.$if_proc_typ);
			sortPolicy.add(MCList.SortType.ASC, SdrvDtlR.$ext_sys_cd);
			list.sort(sortPolicy);

			int thread = MCServerThreadManager.getThreadCount(list.size());
			list.addNumberColumn("thred_num");
			int rowNum = 0;
			SdrvDtlR bfRow = null;
			for (SdrvDtlR row : list) {
				// 前行と同一キーの場合は同一スレッドで処理
				if (bfRow != null && (!isSame(row.if_proc_typ(), bfRow.if_proc_typ()) || !isSame(row.ext_sys_cd(), bfRow.ext_sys_cd()))) {
					rowNum++;
				}
				row.setNumberNE("thred_num", MCNumber.valueOf(rowNum % thread));
				bfRow = row;
			}

			MCList<SdrvDtlR> tmp = MCList.create(SdrvDtlR.class);
			for (int i = 0; i < thread; i++) {
				tmp = MCList.create(SdrvDtlR.class);
				for (SdrvDtlR row : list.subList("thred_num", MCNumber.valueOf(i))) {
					tmp.add(row);
				}
				if (!tmp.isEmpty()) {
					ret.add(tmp);
				}
			}
			return ret;
		}
		

		/**
		 * Upd02から返却されたメッセージを退避する
		 */
		protected void backupMessagePool() {
			_buMessageList.addAll(MCMessagePool.getMessageList());
			MCMessagePool.clear();
		}
		
		protected String getEdiMcfSystemCd() {
			MAM_EXT_SYS_R extSysR = MAM_EXT_SYS_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(extSysR);
			builder.setWhere(extSysR.ext_sys_typ.eq(value(MAC_EXT_SYS_TYP.EDI_MCF.value())));
			dbSelect(createSqlId(LOGIC_ID, extSysR, "S01"), extSysR, builder);
			return extSysR.ext_sys_cd();
		}
	}

	/**
	 * Upd02オペレーション.<p>
	 *
	 * 送信ＩＦ情報のコードを変換しファイルに出力する<br>
	 */
	public class Upd02 extends PFBZB_SendDataConv_MC_A.Upd02 {

		/** 全対象件数 */
		protected int _sumTotalCnt = 0;

		/** 全エラー件数 */
		protected int _sumErrorCnt = 0;
		
		protected MCList<SdrvDtlR> _codeConvL = null;

		//会社連携用帳票セット（会社連携処理時にのみ利用）
		ArrayList<MCReportSet> rsL = null;

		protected FXBAL_BatchLogger _logger = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			if (!isBatchRqst()) {
				_logger = getConcurrentLogger();
				setLogKey(up0(), _logger);
				writeStartLog(_logger);
				if (up0().isEmpty()) {
					procEndLog(_logger);
					return;
				}
			}
			else {
				if (MCServerThreadManager.isUseMainDBTran()) {
					_logger = logger();
				}
				else {
					_logger = logger().clone();
				}
			}

			for (MCList<SdrvDtlR> upL : up0().groupList(SENDKEY())) {
				setAdptrInfo(upL);
				SdrvDtlR upR = upL.get(0);
				procStartLog(upR, _logger);
				sort(upL);
				_totalCnt = _successCnt = _errorCnt = _skipCnt = 0;

				String svp = "svp_" + upR.data_no().toString();
				try {
					dbTran().setSavepoint(svp);

					//送信データ変換処理
					lockAndCheckSendIf(upL);
					if (isNull(upL)) {
						continue;
					}
					execMain(upL);
					if (isNull(_codeConvL)) {
						return;
					}
					//送信ファイル作成後のデータ登録・更新処理
					insIfFile(_codeConvL);
					insSdrvIfFile(_codeConvL);
					updSdrvIf(_codeConvL);
					updEsbIf(_codeConvL);
					rsltCnt(_codeConvL);
				}
				catch (Exception ex) {
					dbTran().rollback(svp);
					procErrLog(ex, _logger);
				}
				finally {
					procEndLog(_logger);
				}
			}
			if (!isBatchRqst()) {
				writeEndLog(_logger, _sumTotalCnt, _sumErrorCnt);
			}
			else {
				// メッセージ退避リストからMCMessagePoolを復元
				MCMessagePool.addAll(_buMessageList);
			}

			setDown();
		}

		/**
		 * 会社間連携処理の判定
		 * 
		 * @param upR
		 * @return
		 */
		protected boolean isLink(SdrvDtlR upR) {
			// 外部システム区分を取得し、LINK処理か否かを判定
			return isSame(ifAdptrMgr().getExtSysTyp(upR.sdrvIf()), MAC_EXT_SYS_TYP.EDI_MCF.value());
		}

		/**
		 * ＳＣＭ（ＭＤ）連携処理の判定
		 * 
		 * @param upR
		 * @return
		 */
		protected boolean isMD(SdrvDtlR upR) {
			return isSame(ifAdptrMgr().getExtSysTyp(upR.sdrvIf()), MAC_EXT_SYS_TYP.SCM_MD.value());
		}

		/**
		 * 起動元の判定処理
		 * 
		 * 起動元によりメッセージ等を振り分けるための判定処理
		 * 呼出元が指定するbatch_flgに従う。呼出元の
		 * 指定が取得できない場合はfalseとみなす。
		 * 
		 * @return バッチフラグ
		 */
		protected boolean isBatchRqst() {
			if (up0() == null || up0().isEmpty()) {
				return false;
			}
			return up0().get(0).batch_flg();
		}

		protected void execMain(MCList<SdrvDtlR> upL) {
			MCList<SdrvDtlR> ifL = null;
			try {
				ifL = checkSendIf(upL);
				callOperation(ifL);
			}
			catch (Exception ex) {
				handleEx(ex, ifL);
			}
		}

		protected void sort(MCList<SdrvDtlR> upL) {
			upL.sort(SdrvDtlR.$data_no);
		}

		protected MCList<SdrvDtlR> checkSendIf(MCList<SdrvDtlR> upL) {

			MCList<SdrvDtlR> dtlL = MCList.create(SdrvDtlR.class);
			for (int i = 0; i < upL.size(); i++) {
				SdrvDtlR dtlR = upL.get(i);

				if (!isSendIf(dtlR.if_proc_typ())) {
					dtlR.sdrvIf().not_send_flg(true);
					MCMessagePool.add(new MCMessage(dtlR, null, PFBZL0014, dtlR.ext_sys_cd(), dtlR.if_proc_typ(), dtlR.data_no()));
					continue; // 未送信の状態でスキップ
				}
				else if (isNull(dtlR.sdrvIf().file_io_ope())
						&& !ifAdptrMgr().getWebApiFlg(dtlR.sdrvIf())
						&& !ifAdptrMgr().getCmdExecFlg(dtlR.sdrvIf())) {
					dtlR.sdrvIf().not_send_flg(true);
					MCMessagePool.add(new MCMessage(dtlR, null, PFBZL0013, dtlR.if_proc_typ(), dtlR.ext_sys_cd(), dtlR.data_no()));
					continue; // 未送信の状態でスキップ
				}

				dtlL.add(dtlR);
			}

			return dtlL;
		}

		protected void callOperation(MCList<SdrvDtlR> dtlL) {

			if (dtlL.isEmpty()) {
				return;
			}
			SdrvDtlR dtlR = dtlL.get(0);
			MCList<SdrvDtlR> codeConvL = MCList.create(SdrvDtlR.class);
			MCList<SdrvDtlR> notErrL = MCList.create(SdrvDtlR.class);

			// コード変換
			if (!isNull(dtlR.sdrvIf().conv_ope())) {
				MCList<ConvDtlR> upL = MCList.create(ConvDtlR.class);
				setAll(upL, dtlL, createConvDtlR_SdrvDtlR());
				callPreOperation(dtlR.sdrvIf().conv_ope(), upL);
				getConvListBySdrvStsTyp(upL, dtlL, codeConvL, notErrL);
				dtlL = notErrL;
			}

			if (ifAdptrMgr().getWebApiFlg(dtlR.sdrvIf())) {
				// 通信変換
				callWriteOperation(ifAdptrMgr().getWebApiOpe(dtlR.sdrvIf()), dtlL, null);
			}
			else if (ifAdptrMgr().getCmdExecFlg(dtlR.sdrvIf())) {
				// コマンド実行
				callWriteOperation(ifAdptrMgr().getCmdExecOpe(dtlR.sdrvIf()), dtlL, null);
			}
			else {
				// 形式変換
				for (String ope : dtlR.sdrvIf().file_io_ope().split(",")) {
					ope = ope.trim();
					if (!isNull(ope)) {
						if (!dtlL.isEmpty() && !isMD(dtlL.get(0))) {
							callWriteOperation(dtlR.sdrvIf().file_io_ope(), dtlL, null);
						}
					}
				}
			}
			_codeConvL = isNull(codeConvL) ? dtlL.clone() : codeConvL.clone();
		}
		
		protected void getConvListBySdrvStsTyp(MCList<ConvDtlR> upL, MCList<SdrvDtlR> dtlLOrg, MCList<SdrvDtlR> codeConvL, MCList<SdrvDtlR> notErrL) {
			MCIndexKey idx = dtlLOrg.createIndex(_$ifKey);

			for (ConvDtlR upR : upL) {
				SdrvDtlR r = dtlLOrg.getFirst(idx, upR.toArray(_$ifKey));
				r.sdrv_sts_typ(upR.sdrv_sts_typ());
				if (!MAC_SDRV_STS_TYP.isNOTYET(r.sdrv_sts_typ())) {
					codeConvL.add(r);
				}
				if (!MAC_SDRV_STS_TYP.isNOTYET(r.sdrv_sts_typ()) && !MAC_SDRV_STS_TYP.isSEND_CONV_ERR(r.sdrv_sts_typ())) {
					notErrL.add(r);
				}
			}
			return;
		}

		protected ConvDtlR_SdrvDtlR<ConvDtlR, SdrvDtlR> createConvDtlR_SdrvDtlR() {
			return new ConvDtlR_SdrvDtlR<ConvDtlR, SdrvDtlR>();
		}

		public class ConvDtlR_SdrvDtlR<D extends ConvDtlR, S extends SdrvDtlR> extends MCRowMapper<D, S> {
			@Override
			public void valueCopy(D dest, S src) {
				dest.if_proc_typ(src.if_proc_typ());
				dest.ext_sys_cd(src.ext_sys_cd());
				dest.data_no(src.data_no());
				dest.sdrv_sts_typ(src.sdrv_sts_typ());
				dest.co_cd(src.co_cd());
			}
		}

		protected ConvDtlR_SdrvDtlR<ConvDtlR, SdrvDtlR> createSdrvDtlR_SdrvDtlR() {
			return new ConvDtlR_SdrvDtlR<ConvDtlR, SdrvDtlR>();
		}

		protected void lockAndCheckSendIf(MCList<SdrvDtlR> upL) {
			PFT_SDRV_IF_R t = PFT_SDRV_IF_R.create("T");
			MCList<PFT_SDRV_IF_R> workL = MCList.create(PFT_SDRV_IF_R.class);
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);

			builder.setSelect(t.if_proc_typ, t.data_no, t.sdrv_sts_typ)
				   .addOrderByAsc(t.if_proc_typ, t.data_no);
			dbSelectKeyForUpdateNoWait(createSqlId(LOGIC_ID, t, "S01"), workL, builder, upL);
			
			checkUpdCntr(upL, _$ifKey, workL, _$ifKey);
			
			MCList<SdrvDtlR> tgtL = MCList.create(SdrvDtlR.class);
			MCIndexKey idx = workL.createIndex(PFT_SDRV_IF_R.$data_no);
			for (SdrvDtlR upR : upL) {
				PFT_SDRV_IF_R wkR = workL.getFirst(idx, upR.data_no());
				if (wkR != null) {
					if (MAC_SDRV_STS_TYP.isNOTYET(wkR.sdrv_sts_typ())
							|| MAC_SDRV_STS_TYP.isSEND_CONV_ERR(wkR.sdrv_sts_typ())
							|| MAC_SDRV_STS_TYP.isSEND_ERR(wkR.sdrv_sts_typ())
							) {
						tgtL.add(upR);
					}
					else {
						_logger.writeProcessLog(PFBZL0071, upR.data_no());
						_skipCnt++;
					}
				}
			}
			upL.setAll(tgtL);
			
			_totalCnt += _skipCnt;
			_sumTotalCnt += _skipCnt;
		}

		protected void updSdrvIf(MCList<SdrvDtlR> upL) {
			PFT_SDRV_IF_R t = PFT_SDRV_IF_R.create("T");
			MCList<PFT_SDRV_IF_R> ifL = MCList.create(PFT_SDRV_IF_R.class);
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);

			ifL.addAll(upL.innerRowList(SdrvDtlR.$sdrvIf, PFT_SDRV_IF_R.class));
			builder.setSet(t.conv_ope, t.file_io_ope, t.web_api_ope, t.cmd_exec_ope, t.sdrv_sts_typ, t.batch_log_no, t.log_sub_key1, t.log_sub_key2);

			dbUpdateKey(createSqlId(LOGIC_ID, t, "U01"), ifL, builder);
		}

		/**
		 * ESBインターフェーステーブルの更新処理
		 * @param dtlL
		 */
		protected void updEsbIf(MCList<SdrvDtlR> dtlL) {
			if (isNull(dtlL) || dtlL.isEmpty()) {
				throw new MCException(PFBZL0048);
			}

			String bibat = MAC_IF_PROC_TYP.bi_bat(dtlL.get(0).if_proc_typ());
			if (isSame(bibat, "MABCB0010")) return;

			PFBZL_SendRecvIfCtrl.UpdEsb01 ope = PFBZL_SendRecvIfCtrl.crtUpdEsb01();
			for (MCList<SdrvDtlR> subL : dtlL.groupList(SdrvDtlR.$if_proc_typ)) {
				String tblNm = MAC_IF_PROC_TYP.upd_if_tbl(dtlL.get(0).if_proc_typ());
				if (isNull(tblNm)) {
					throw new MCException(PFBZL0049);
				}
				setAll(ope.up0(), subL, createMap_UpdEsb01_DtlR_SdrvDtlR());
				ope.setEsbIfTblNm(tblNm);
				ope.setSdrvFlg(true);
				ope.exec();
			}
		}

		protected Map_UpdEsb01_DtlR_SdrvDtlR<UpdEsb01_DtlR, SdrvDtlR> createMap_UpdEsb01_DtlR_SdrvDtlR() {
			return new Map_UpdEsb01_DtlR_SdrvDtlR<UpdEsb01_DtlR, SdrvDtlR>();
		}

		public class Map_UpdEsb01_DtlR_SdrvDtlR<D extends UpdEsb01_DtlR, S extends SdrvDtlR> extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(UpdEsb01_DtlR.$data_no, SdrvDtlR.$data_no);
				addColumnPathMap(UpdEsb01_DtlR.$sdrv_sts_typ, SdrvDtlR.$sdrv_sts_typ);
			}
		}

		protected void insIfFile(MCList<SdrvDtlR> dtlL) {
			String[] fileKey = {
					SdrvDtlR.$file_path, SdrvDtlR.$file_nm
			};

			// 送信変換ＯＫを登録対象とする
			MCList<SdrvDtlR> ifL = dtlL
					.subList(r -> MAC_SDRV_STS_TYP.isSEND_CONV_OK(r.sdrv_sts_typ())
							&& !ifAdptrMgr().getWebApiFlg(r.sdrvIf())
							&& !ifAdptrMgr().getCmdExecFlg(r.sdrvIf()));
			if (ifL.isEmpty()) {
				return;
			}

			MCList<SdrvDtlR> fList = ifL.groupBy(fileKey);
			doSeqCache(MAC_NUM_SYS_TYP.ESB_FILE_ID, fList.size());

			MCRowMapper<PFT_IF_FILE_R, SdrvDtlR> mapper = createPFT_IF_FILE_R_SdrvDtlR();
			MCList<PFT_IF_FILE_R> fL = MCList.create(PFT_IF_FILE_R.class);

			MCIndexKey idx = fList.createIndex(fileKey);
			for (SdrvDtlR ifR : ifL) {
				if (isMD(ifR)) {
					continue;
				}
				SdrvDtlR fRow = fList.getFirst(idx, ifR.toArray(fileKey));
				if (isNull(fRow.file_id())) {
					PFT_IF_FILE_R fR = PFT_IF_FILE_R.create();
					copy(fR, ifR, mapper);
					fL.add(fR);
					fRow.file_id(fR.file_id());
				}
				// PFT_SDRV_IF_FILEの更新で使用
				ifR.file_id(fRow.file_id());
			}
			
			dbInsert(createSqlId(LOGIC_ID, PFT_IF_FILE_R.TABLE_NAME, "I01"), fL, MCQueryApiBuilder.create(PFT_IF_FILE_R.create()));
		}

		protected PFT_IF_FILE_R_SdrvDtlR<PFT_IF_FILE_R, SdrvDtlR> createPFT_IF_FILE_R_SdrvDtlR() {
			return new PFT_IF_FILE_R_SdrvDtlR<PFT_IF_FILE_R, SdrvDtlR>();
		}

		public class PFT_IF_FILE_R_SdrvDtlR<D extends PFT_IF_FILE_R, S extends SdrvDtlR> extends MCRowMapper<D, S> {
			@Override
			public void valueCopy(D dest, S src) {
				dest.file_id(getSequence(MAC_NUM_SYS_TYP.ESB_FILE_ID.value()));
				dest.file_path(src.file_path());
				dest.file_nm(src.file_nm());
				dest.fproc_typ(MAC_FPROC_TYP.NOTYET.value());
			}
		}

		protected void insSdrvIfFile(MCList<SdrvDtlR> dtlL) {
			// 送信変換ＯＫをファイル保存する
			MCList<SdrvDtlR> ifL = dtlL
					.subList(r -> MAC_SDRV_STS_TYP.isSEND_CONV_OK(r.sdrv_sts_typ())
							&& !isMD(r)
							&& !ifAdptrMgr().getWebApiFlg(r.sdrvIf())
							&& !ifAdptrMgr().getCmdExecFlg(r.sdrvIf()));
			if (ifL.isEmpty()) {
				return;
			}

			MCList<PFT_SDRV_IF_FILE_R> l = MCList.create(PFT_SDRV_IF_FILE_R.class);
			setAll(l, ifL, createPFT_SDRV_IF_FILE_R_SdrvDtlR());
			dbInsert(createSqlId(LOGIC_ID, PFT_SDRV_IF_FILE_R.TABLE_NAME, "I02"), l, MCQueryApiBuilder.create(PFT_SDRV_IF_FILE_R.create()));
		}

		protected PFT_SDRV_IF_FILE_R_SdrvDtlR<PFT_SDRV_IF_FILE_R, SdrvDtlR> createPFT_SDRV_IF_FILE_R_SdrvDtlR() {
			return new PFT_SDRV_IF_FILE_R_SdrvDtlR<PFT_SDRV_IF_FILE_R, SdrvDtlR>();
		}

		public class PFT_SDRV_IF_FILE_R_SdrvDtlR<D extends PFT_SDRV_IF_FILE_R, S extends SdrvDtlR> extends MCRowMapper<D, S> {
			@Override
			public void valueCopy(D dest, S src) {
				dest.data_no(src.data_no());
				dest.file_id(src.file_id());
			}
		}

		protected void rsltCnt(MCList<SdrvDtlR> upL) {
			for (SdrvDtlR dtlR : upL) {
				if (MAC_SDRV_STS_TYP.isSEND_CONV_ERR(dtlR.sdrv_sts_typ()) || MAC_SDRV_STS_TYP.isSEND_ERR(dtlR.sdrv_sts_typ())) {
					_errorCnt++;
					_sumErrorCnt++;
				}
				else if (MAC_SDRV_STS_TYP.isSEND_CONV_OK(dtlR.sdrv_sts_typ()) || MAC_SDRV_STS_TYP.isSEND_OK(dtlR.sdrv_sts_typ())) {
					_successCnt++;
				}
				else {
					_skipCnt++;
				}
				_totalCnt++;
				_sumTotalCnt++;
			}
		}

		protected void setDown() {
			SdrvRsltR down0R = SdrvRsltR.create();
			down0R.total_cnt(_sumTotalCnt);
			down0R.error_cnt(_sumErrorCnt);
			down0().add(down0R);
		}
	}

	/**
	 * アダプタマスタの情報を補完する
	 * 
	 * ifLのリストには同一のＩＦ処理区分(IF_PROC_TYP)、外部システムＣＤ（EXT_SYS_CD)がセットされていて
	 * 必ず1行以上の値がセットされているという前提で使用すること。
	 * 
	 */
	protected MCList<SdrvDtlR> setAdptrInfo(MCList<SdrvDtlR> ifL) {
		if (ifL == null || ifL.isEmpty()) {
			//前提として本処理には入らないのでエラー処理省略
			return null;
		}
		MCList<MCRow> inL = ifL.innerRowList(SdrvDtlR.$sdrvIf);
		if (inL == null || inL.isEmpty()) {
			//前提として本処理には入らないのでエラー処理省略
			return null;
		}
		inL.setStringNE(PFT_SDRV_IF_R.$conv_ope, ifAdptrMgr().getConvOpe(ifL.get(0).sdrvIf()));
		if (ifAdptrMgr().getWebApiFlg(ifL.get(0).sdrvIf())) {
			inL.setStringNE(PFT_SDRV_IF_R.$web_api_ope, ifAdptrMgr().getWebApiOpe(ifL.get(0).sdrvIf()));
		}
		else if (ifAdptrMgr().getCmdExecFlg(ifL.get(0).sdrvIf())) {
			inL.setStringNE(PFT_SDRV_IF_R.$cmd_exec_ope, ifAdptrMgr().getCmdExecOpe(ifL.get(0).sdrvIf()));
		}
		else {
			inL.setStringNE(PFT_SDRV_IF_R.$file_io_ope, ifAdptrMgr().getFileIoOpe(ifL.get(0).sdrvIf()));
		}
		return ifL;
	}

	/**
	 * 例外処理
	 *
	 * @param ex
	 */
	protected void handleEx(Exception ex, FXBAL_BatchLogger logger) {
		MCException mcex;
		if (ex instanceof MCException) {
			mcex = (MCException) ex;
		}
		else {
			mcex = new MCException(ex);
		}
		logger.writeProcessLog(mcex);

		throw mcex;
	}

	protected FXBAL_BatchLogger initLog() {
		return getLogger();
	}

	/**
	 * ログにキーをセットする
	 * @param keyL セット対象のリスト
	 */
	protected void setLogKey(MCList<? extends MCRow> keyL, FXBAL_BatchLogger logger) {
		if (keyL == null || keyL.isEmpty()) {
			return;
		}
		if (keyL.get(0).contains(SdrvDtlR.$sdrvIf)) {
			MCList<PFT_SDRV_IF_R> sdrvL = keyL.innerRowList(SdrvDtlR.$sdrvIf, PFT_SDRV_IF_R.class);
			logger.setLogKey(sdrvL, PFT_SDRV_IF_R.$batch_log_no, PFT_SDRV_IF_R.$log_sub_key1, PFT_SDRV_IF_R.$log_sub_key2);
		}
		else {
			logger.setLogKey(keyL);
		}
	}

	protected void writeStartLog(FXBAL_BatchLogger logger) {
		logger.writeStartLog(PFBZL0040);
		pushStartLog(logger);
	}

	protected void procStartLog(SdrvDtlR upR, FXBAL_BatchLogger logger) {
		if (ifAdptrMgr().getWebApiFlg(upR.sdrvIf())) {
			logger.writeProcessLog(PFBZL0065, upR.sdrvIf().ext_sys_cd(), upR.sdrvIf().if_proc_typ(), upR.co_cd(), upR.sdrvIf().conv_ope(), upR.sdrvIf().web_api_ope());
		}
		else if (ifAdptrMgr().getCmdExecFlg(upR.sdrvIf())) {
			logger.writeProcessLog(PFBZL0066, upR.sdrvIf().ext_sys_cd(), upR.sdrvIf().if_proc_typ(), upR.co_cd(), upR.sdrvIf().conv_ope(), upR.sdrvIf().cmd_exec_ope());
		}
		else {
			logger.writeProcessLog(PFBZL0015, upR.sdrvIf().ext_sys_cd(), upR.sdrvIf().if_proc_typ(), upR.co_cd(), upR.sdrvIf().conv_ope(), upR.sdrvIf().file_io_ope());
		}
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
	 * エラー発生時のログ出力
	 * @param ex
	 */
	protected void procErrLog(Exception ex, FXBAL_BatchLogger logger) {
		logger.writeProcessLog(ex instanceof MCException ? (MCException) ex : new MCException(ex));
	}

	/**
	 * 変換処理単位毎の終了ログを出力する。
	 */
	protected void procEndLog(FXBAL_BatchLogger logger) {
		logger.writeDataLog(MCMessagePool.getMessageList());
		_buMessageList.addAll(MCMessagePool.getMessageList());
		MCMessagePool.clear();
		if (_totalCnt == 0) {
			logger.writeProcessLog(PFBZL0019);
		}
		else {
			logger.writeProcessLog(PFBZL0020, _totalCnt, _successCnt, _errorCnt, _skipCnt);
		}
	}

	/**
	 * バッチ処理の終了ログを出力する。
	 */
	protected void writeEndLog(FXBAL_BatchLogger logger, int _sumTotalCnt, int _sumErrorCnt) {
		logger.writeDataLog(MCMessagePool.getMessageList());
		MCMessagePool.clear();
		// メッセージ退避リストからMCMessagePoolを復元
		MCMessagePool.addAll(_buMessageList);
		if (_sumTotalCnt == 0) {
			logger.writeProcessLog(MAUDL0008);
			MCMessagePool.add(new MCMessage(MAUDL0008));
		}
		else if (_sumErrorCnt > 0) {
			logger.writeProcessLog(MAUDL0009);
			MCMessagePool.add(new MCMessage(MAUDL0009));
			pushErrorLog(logger());
		}
		logger.writeEndLog(PFBZL0041);
		pushEndLog(logger);
	}

	//FMCB CUSTOM END
}