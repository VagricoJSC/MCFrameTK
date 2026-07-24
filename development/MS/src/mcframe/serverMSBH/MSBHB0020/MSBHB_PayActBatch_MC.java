package mcframe.serverMSBH.MSBHB0020;

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
import mcframe.serverMSBH.MSBHB0020.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil;
import mcframe.serverMSBH.MSBHL5010.MSBHL_ApUtil;
import mcframe.serverMSBH.MSBHL5040.MSBHL_PayActRegService;
import mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_DtlR;
import mcframe.serverMSBH.MSBHL5040.PayAct_Chk01_HdrR;
import mcframe.serverCore.requester.MCServerThreadManager;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogger;
import static mcframe.serverMSBH.MSBHB0020.Query.*;

import java.util.ArrayList;
import java.util.List;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBHB_PayActBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBHB_PayActBatch_MC extends MSBHB_PayActBatch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Ins01オペレーション.<p>
	 *
	 * 支払実績計上バッチのメイン処理<br>
	 */
	public class Ins01 extends MSBHB_PayActBatch_MC_A.Ins01 {
		/**
		 * 対象件数 
		 */
		protected int _totalCnt = 0;
		
		/**
		 * 正常終了件数
		 */
		protected int _successCnt = 0;
		
		/**
		 * エラー件数
		 */
		protected int _errorCnt = 0;
		
		/**
		 * 例外発生ＦＬＧ
		 */
		protected boolean _exceptionFlg = false;
		
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
				handleEx(ex);
			}
			finally {
				writeEndLog();
			}
		}
		
		/**
		 * バッチログを初期化する。
		 */
		protected void initLogger() {
			getConcurrentLogger();
		}

		/**
		 * 開始ログを出力する。
		 */
		protected void writeStartLog() {
			logger().writeStartLog(MSBHL0046);
			pushStartLog(logger());
		}

		/**
		 * 例外処理
		 */
		protected void handleEx(Exception ex) {
			MCException mcex;
			if (ex instanceof MCException) {
				mcex = (MCException) ex;
			}
			else {
				mcex = new MCException(ex);
			}
			logger().writeProcessLog(mcex);
			_exceptionFlg = true;
			
			throw mcex;
		}
		
		/**
		 * 終了ログを出力する。
		*/
		protected void writeEndLog() {
			if (_errorCnt > 0 || _exceptionFlg) {
				logger().writeProcessLog(MAUDL0009);
				MCMessagePool.add(MAUDL0009);
				pushErrorLog(logger());
			}
			else if (_totalCnt == 0) {
				logger().writeProcessLog(MAUDL0008);
				MCMessagePool.add(MAUDL0008);
			}
			logger().writeEndLog(MSBHL0047, _totalCnt, _successCnt, _errorCnt);
			pushEndLog(logger());
			logger().close();
		}
		
		/**
		 * 支払実績計上バッチのメイン処理
		 */
		protected void execMain() {
			
			MCList<MAM_BP_R> pspplL = getPspplL();
			if (isNull(pspplL)) {
				return;
			}
			
			int no = 0;
			
			List<MSBHB_PayActBatch.Ins02> opeL = new ArrayList<>();
			for (MCList<Ins02_DtlR> dtlL : splitTgt(pspplL)) {
				MSBHB_PayActBatch.Ins02 ope = MSBHB_PayActBatch.crtIns02();
				ope._no = ++no;
				ope.up0().not_pay_schd_dt_flg(up0().not_pay_schd_dt_flg());
				ope.up1().addAll(dtlL);
				opeL.add(ope);
			}
			
			if (!opeL.isEmpty()) {
				if (MCServerThreadManager.getLimitThreadSize() == 1) {
					MCServerThreadManager.setUseMainDBTran(true);
				}
				MCServerThreadManager.invokeAndWait(opeL, FXBAL_BatchLogManager.class);
			}
			
			for (MSBHB_PayActBatch.Ins02 ope : opeL) {
				Ins02_RsltR downR = ope.down0();
				_totalCnt += downR.total_cnt().intValue();
				_successCnt += downR.success_cnt().intValue();
				_errorCnt += downR.error_cnt().intValue();
			}
		}
		
		/**
		 * スレッドサイズを考慮して上り電文を分割する。
		 * @param pspplL 支払先リスト
		 * @return 振り分けたマルチスレッドのリスト
		 */
		protected List<MCList<Ins02_DtlR>> splitTgt(MCList<MAM_BP_R> pspplL) {
			
			List<MCList<Ins02_DtlR>> ret = new ArrayList<>();
			if (pspplL.isEmpty()) {
				return ret;
			}
			
			int max = getThreadBatchSize(pspplL.size());
			
			MCList<Ins02_DtlR> tmp = MCList.create(Ins02_DtlR.class);
			for (MAM_BP_R row : pspplL) {
				
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(Ins02_DtlR.class);
				}
				
				Ins02_DtlR cndR = Ins02_DtlR.create();
				cndR.psppl_cd(row.psppl_cd());
				tmp.add(cndR);
			}
			
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			
			return ret;
		}
		
		/**
		 * 処理対象データの支払先を取得する。
		 */
		protected MCList<MAM_BP_R> getPspplL() {
			
			MCList<MAM_BP_R> pspplL = MCList.create(MAM_BP_R.class);
			MAM_BP_R t0 = MAM_BP_R.create("T");
			MCQueryApiBuilder pspplL_bldr = MCQueryApiBuilder.create(t0);
			MST_PAY_CHK_R t1 = MST_PAY_CHK_R.create("T1");
			MST_PAY_SCHD_R t2 = MST_PAY_SCHD_R.create("T2");
			MST_AP_APPL_SCHD_R t3 = MST_AP_APPL_SCHD_R.create("T3");

			pspplL_bldr.setDistinct();
			pspplL_bldr.setSelect(t0.psppl_cd);

			pspplL_bldr.addInnerJoin(t1, t0.bp_cd.eq(t1.bsppl_cd));
			pspplL_bldr.addInnerJoin(t2, t1.pay_chk_mng_no.eq(t2.pay_chk_mng_no));
			pspplL_bldr.addInnerJoin(t3, t3.pay_schd_no.eq(t2.pay_schd_no));

			pspplL_bldr.setWhere(t3.pay_sts_typ.in(value(MSC_PAY_STS_TYP.NOT_PAY.value()),
					value(MSC_PAY_STS_TYP.PART_PAY.value())));
			pspplL_bldr.addWhereWithAnd(bracket(t1.aprv_flg.eq(value(false))
					.or(t1.aprv_sts_typ.eq(value(MAC_APRV_STS_TYP.ACPT.value())))));
			pspplL_bldr.addWhereWithAnd(t2.pay_schd_dt.lte(bind("1")), getToday());

			dbSelect("MSBHB0020_MAM_BP_S01", pspplL, pspplL_bldr);
			
			return pspplL;
		}
	}
	/**
	 * Ins02オペレーション.<p>
	 *
	 * 支払予定に対して支払実績を登録する<br>
	 */
	public class Ins02 extends MSBHB_PayActBatch_MC_A.Ins02 {
		
		/**
		 * スレッド間でユニークな値を設定
		 */
		protected int _no = 0;
		
		/**
		 * バッチログのlogger<br>
		 * Ins01バッチ呼び出しオペレーションから引き継ぐ
		 */
		protected FXBAL_BatchLogger _logger = null;
		
		/**
		 * 処理対象の支払予定リスト
		 */
		protected MCList<Ins02_PaySchdR> _paySchdL = null;
		
		/**
		 * 支払実績登録サービスの上り電文ヘッダ
		 */
		protected MCList<PayAct_Chk01_HdrR> _payActHdr = null;
		
		/**
		 * 支払実績登録サービスの上り電文明細
		 */
		protected MCList<PayAct_Chk01_DtlR> _payActDtl = null;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			try {
				initLogger();
				execMain();
				setDown();
			}
			finally {
				closeLogger();
			}
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
		 * メイン処理を実行する。
		 */
		protected void execMain() {
			
			getPaySchd();
			
			editPaySchd();
			
			callPayActMain();
			
			insPayActBr();
		}
		
		/**
		 * 処理対象の支払予定を取得する。
		 */
		protected void getPaySchd() {
			
			MCList<MAM_BP_R> bpL = MCList.create(MAM_BP_R.class);
			MCQueryApiBuilder bpL_bldr = MCQueryApiBuilder.create(MAM_BP_R.create("T"));
			dbWkDelete("MSBHB0020_MAW_BP_D01", bpL_bldr.getBaseDbc());

			setBpWk(bpL);
			dbWkInsert("MSBHB0020_MAW_BP_I01", bpL, bpL_bldr.getBaseDbc());

			MCRow bindR = MCRow.create();
			bindR.addDateColumn("today", getToday());

			_paySchdL = MCList.create(Ins02_PaySchdR.class);
			executeQuery(_paySchdL, MSBHB0020_MST_PAY_CHK_S01(), bindR);

			dbWkDelete("MSBHB0020_MAW_BP_D02", bpL_bldr.getBaseDbc());
		}
		
		/**
		 * 取引先ワークにレコードを追加する。
		 * @param bpL 取引先ワーク
		 */
		protected void setBpWk(MCList<MAM_BP_R> bpL) {
			
			for (Ins02_DtlR dtlR : up1()) {
				MAM_BP_R bpR = MAM_BP_R.create();
				bpR.bp_cd(dtlR.psppl_cd());
				bpL.add(bpR);
			}
		}
		
		/**
		 * 支払予定を編集する。
		 */
		protected void editPaySchd() {
			
			if (isNull(_paySchdL)) {
				return;
			}
			
			setPegNo(_paySchdL);
			
			_paySchdL.setValueNE(Ins02_PaySchdR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
			
			if (up0().not_pay_schd_dt_flg()) {
				_paySchdL.setValueNE(Ins02_PaySchdR.$pay_act_dt, getToday());
			}
			
			_paySchdL.setColumnValueNE(Ins02_PaySchdR.$ac_dt, Ins02_PaySchdR.$pay_act_dt);
			
			calcComPaidAmt();
		}
		
		/**
		 * 手数料の金額を再計算する。
		 */
		protected void calcComPaidAmt() {
			
			_paySchdL.forEach(r -> {
				if (MAC_AP_STTL_TYP.is_com_paid(r.ap_sttl_typ()) || MAC_AP_STTL_TYP.isSETOFF(r.ap_sttl_typ())) {
					if (isNull(r.trd_cur_com_paid_tax_cd())) {
						return;
					}

					String taxCd = MSBHL_ApUtil.getComPaidAndSetoffTaxCd(r.pay_act_dt());

					if (isNull(taxCd)) {
						throw new MCAppException(MSBHL0024);
					}

					MAM_TAX_R todayTaxR = MSBHL_ApUtil.getTax(taxCd);

					if (!isNull(todayTaxR.tax_cd())) {
						if (!isSame(todayTaxR.tax_cd(), r.trd_cur_com_paid_tax_cd())) {

							r.trd_cur_com_paid_tax_cd(todayTaxR.tax_cd());
						}
					}
				}
			});
		}
		
		/**
		 * 支払実績登録サービスを実装する。
		 */
		protected void callPayActMain() {
			
			callPayActChk01();
			
			callPayActUpd01();
		}
		
		/**
		 * 支払実績登録サービスの支払実績更新前チェックを実行する。
		 */
		protected void callPayActChk01() {
			
			setParamIndex();
			
			_logger.setLogKey(_paySchdL,
					MST_PAY_ACT_BR_R.$batch_log_no,
					MST_PAY_ACT_BR_R.$log_sub_key1,
					MST_PAY_ACT_BR_R.$log_sub_key2);
			
			MSBHL_PayActRegService.PayAct_Chk01 chk01 = MSBHL_PayActRegService.crtPayAct_Chk01();
			_payActHdr = chk01.createPayAct_Chk01_HdrL();
			_payActDtl = chk01.createPayAct_Chk01_DtlL();
			
			MCRowMapper<PayAct_Chk01_HdrR, Ins02_PaySchdR> hdrMapper = createMap_PayAct_Chk01_HdrR_Ins02_PaySchdR();
			MCRowMapper<PayAct_Chk01_DtlR, Ins02_PaySchdR> dtlMapper = createMap_PayAct_Chk01_DtlR_Ins02_PaySchdR();
			int i = 0;
			for (MCList<Ins02_PaySchdR> l : createGroupList()) {
				
				l.setNumber(Ins02_PaySchdR.$hdr_peg_no, i);
				
				PayAct_Chk01_HdrR hdrR = _payActHdr.add();
				copy(hdrR, l.get(0), hdrMapper);
				setXrate(hdrR);
				
				addAll(_payActDtl, l, dtlMapper);
				
				i++;
			}
			
			chk01.up0().addAll(_payActHdr);
			chk01.up1().addAll(_payActDtl);
			chk01.exec();
			
			copyErrFlg(_paySchdL, chk01.down1());
			
			setSameHdrErr();
			
			_logger.writeDataLog(MCMessagePool.getMessageList());
		}
		
		/**
		 * パラメータインデックスを設定する。
		 */
		protected void setParamIndex() {
			
			for (Ins02_PaySchdR paySchdR : _paySchdL) {
				paySchdR.setParamIndex(_no);
			}
		}
		
		/**
		 * 同一ヘッダでその他行のエラーが発生した場合、その他エラーが発生した旨のメッセージを追加する
		 */
		protected void setSameHdrErr() {
			
			// メッセージプールに格納されているCauseRow(エラーとなっている行)を取得する
			MCMessageList errl = MCMessagePool.getMessageList();
			MCList<MCRow> el = MCList.create(MCRow.class);
			errl.forEach(m -> {
				el.add(m.getCauseRow());
			});
			
			_paySchdL.forEach(r -> {
				if (r.err_flg()) {
					if (!hasMessage(r, el)) {
						MCMessagePool.add(new MCMessage(r, null, MSBHL0009, toDispGUIIndex(r)));
					}
				}
			});
		}
		
		/**
		 * 引数で指定された行に紐付くエラーメッセージが存在するかを評価する。
		 * @param r 出荷予定
		 * @param el エラーメッセージのCauseRowリスト
		 * @return 行に紐付くエラーメッセージが存在するはtrue
		 */
		protected boolean hasMessage(MCRow r, MCList<MCRow> el) {
			for(MCRow e : el) {
				if (r.getParamIndex() == e.getParamIndex() 
						&& r.getParamRowIndex() == e.getParamRowIndex()) {
					return true;
				}
			}
			return false;
		}
		
		/**
		 * 支払実績計上バッチ結果確認を登録する。
		 */
		protected void insPayActBr() {
			
			doSeqCache(MAC_NUM_SYS_TYP.BATCH_DATA, _paySchdL.size());

			MCList<MST_PAY_ACT_BR_R> brL = MCList.create(MST_PAY_ACT_BR_R.class);

			for (Ins02_PaySchdR paySchdR : _paySchdL) {

				MST_PAY_ACT_BR_R brR = MST_PAY_ACT_BR_R.create();
				brR.batch_data_no(getStrSeq(MAC_NUM_SYS_TYP.BATCH_DATA));
				brR.pay_chk_no(paySchdR.pay_chk_no());
				brR.pay_schd_no(paySchdR.pay_schd_no());
				brR.psppl_cd(paySchdR.psppl_cd());
				brR.bsppl_cd(paySchdR.bsppl_cd());
				brR.bsppl_dpt_cd(paySchdR.bsppl_dpt_cd());
				brR.ap_sttl_cd(paySchdR.ap_sttl_cd());
				brR.ap_sttl_typ(paySchdR.ap_sttl_typ());
				brR.pay_schd_dt(paySchdR.pay_schd_dt());
				brR.reg_dt(paySchdR.reg_dt());
				brR.bsppl_cl_dt(paySchdR.bsppl_cl_dt());
				brR.exe_sts_typ(paySchdR.err_flg() ? MAC_EXE_STS_TYP.ERR.value()
						: MAC_EXE_STS_TYP.OK.value());
				brR.batch_log_no(
						paySchdR.getStringNE(MST_PAY_SCHD_CL_BR_R.$batch_log_no));
				brR.log_sub_key1(
						paySchdR.getNumberNE(MST_PAY_SCHD_CL_BR_R.$log_sub_key1));
				brR.log_sub_key2(
						paySchdR.getNumberNE(MST_PAY_SCHD_CL_BR_R.$log_sub_key2));

				brL.add(brR);
			}

			MCQueryApiBuilder brL_bldr = MCQueryApiBuilder.create(MST_PAY_ACT_BR_R.create("T"));
			dbInsert("MSBHB0020_MST_PAY_ACT_BR_I01", brL, brL_bldr);
		}
		
		/**
		 * 為替レートを設定する。
		 * @param hdrR 支払実績登録サービスの上り電文ヘッダ
		 */
		protected void setXrate(PayAct_Chk01_HdrR hdrR) {
			
			hdrR.xrate(MAUCL_AmtUtil.getDefXrateNE(
					hdrR.trd_cur_cd(),
					getBaseCur().cur_cd(),
					getCo().purc_xrate_cd(), hdrR.pay_act_dt()));
		}
		
		/**
		 * 同一支払実績ヘッダに纏められるリストを作成する。
		 * @return 同一支払実績ヘッダに纏められるリスト
		 */
		protected List<MCList<Ins02_PaySchdR>> createGroupList() {
			
			_paySchdL.sort(getGrpKeys());
			
			List<MCList<Ins02_PaySchdR>> ret = new ArrayList<>();
			for (MCList<Ins02_PaySchdR> paySchdL : _paySchdL.groupList(getGrpKeys())) {
				
				setApSttlCdGrp(paySchdL);
				
				// グループ化用の債務決済方法ＣＤで分割
				for (MCList<Ins02_PaySchdR> sttlL: paySchdL.groupList(Ins02_PaySchdR.$ap_sttl_cd_grp)) {
					// 債務決済方法の関連情報で分割
					for (MCList<Ins02_PaySchdR> l : splitSttlInfo(sttlL)) {
						ret.add(l);
					}
				}
			}
			return ret;
		}
		
		/**
		 * リストを分割するための情報を設定する。
		 * @param paySchdL 支払予定リスト
		 */
		protected void setApSttlCdGrp(MCList<Ins02_PaySchdR> paySchdL) {
			
			paySchdL.sort(Ins02_PaySchdR.$ap_sttl_cd);
			MCIndexKey typIdx = paySchdL.createIndex(Ins02_PaySchdR.$ap_sttl_typ);
			
			Ins02_PaySchdR acnt01 = paySchdL.getFirst(typIdx, MAC_AP_STTL_TYP.ACNT.value());
			Ins02_PaySchdR cash01 = paySchdL.getFirst(typIdx, MAC_AP_STTL_TYP.CASH.value());
			MCList<Ins02_PaySchdR> setoffCP = paySchdL.subList(typIdx, MAC_AP_STTL_TYP.SETOFF.value());
			if (!isNull(acnt01)) {
				// 預金（手数料）は預金と同じグループ
				MCList<Ins02_PaySchdR> acntCP = paySchdL.subList(typIdx, MAC_AP_STTL_TYP.ACNT_COM_PAID.value());
				acntCP.setString(Ins02_PaySchdR.$ap_sttl_cd_grp, acnt01.ap_sttl_cd_grp());
				setoffCP.setString(Ins02_PaySchdR.$ap_sttl_cd_grp, acnt01.ap_sttl_cd_grp());
			}
			if (!isNull(cash01)) {
				// 現金（手数料）は現金と同じグループ
				MCList<Ins02_PaySchdR> cashCP = paySchdL.subList(typIdx, MAC_AP_STTL_TYP.CASH_COM_PAID.value());
				cashCP.setString(Ins02_PaySchdR.$ap_sttl_cd_grp, cash01.ap_sttl_cd_grp());
				if (isNull(acnt01)) {
					setoffCP.setString(Ins02_PaySchdR.$ap_sttl_cd_grp, cash01.ap_sttl_cd_grp());
				}
			}
			if (isNull(acnt01) && isNull(cash01)) {
				// 相殺は預金、現金、手形の順で存在するグループに含める
				Ins02_PaySchdR note01 = paySchdL.getFirst(typIdx, MAC_AP_STTL_TYP.NOTE.value());
				if (!isNull(note01)) {
					setoffCP.setString(Ins02_PaySchdR.$ap_sttl_cd_grp, note01.ap_sttl_cd_grp());
				}
			}
		}
		
		/**
		 * 債務決済方法の関連情報でリストを分割する。
		 * @param paySchdL 支払予定
		 * @return 債務決済方法で分割したリスト
		 */
		protected MCList<Ins02_PaySchdR>[] splitSttlInfo(MCList<Ins02_PaySchdR> paySchdL) {
			if (MAC_AP_STTL_TYP.isSETOFF(paySchdL.get(0).ap_sttl_typ())
					&& isSame(paySchdL.get(0).ap_sttl_cd(), paySchdL.get(0).ap_sttl_cd_grp())) {
				// 相殺のみのグループは相殺情報で分割
				return paySchdL.groupList(
						Ins02_PaySchdR.$ap_setoff_typ, Ins02_PaySchdR.$setoff_cd,
						Ins02_PaySchdR.$setoff_nm, Ins02_PaySchdR.$so_dpt_cd);
			}
			else {
				// 債務決済方法の関連情報で分割（相殺以外）
				MCList<Ins02_PaySchdR>[] grpL = paySchdL.subList(r->!MAC_AP_STTL_TYP.isSETOFF(r.ap_sttl_typ())).groupList(
						Ins02_PaySchdR.$bank_ac_cd,
						Ins02_PaySchdR.$pay_bank_ac_cd, Ins02_PaySchdR.$note_no,
						Ins02_PaySchdR.$note_typ, Ins02_PaySchdR.$note_rsn_cd,
						Ins02_PaySchdR.$draw_dt, Ins02_PaySchdR.$due_dt, Ins02_PaySchdR.$note_days,
						Ins02_PaySchdR.$drawer_nm, Ins02_PaySchdR.$draw_bank_cd,
						Ins02_PaySchdR.$draw_branch_cd, Ins02_PaySchdR.$endrsr,
						Ins02_PaySchdR.$accptr);
				
				// 相殺を一つ目のリストに追加
				grpL[0].addAll(paySchdL.subList(r->MAC_AP_STTL_TYP.isSETOFF(r.ap_sttl_typ())));
				
				return grpL;
			}
		}
		
		/**
		 * 支払実績登録サービスの支払実績更新を実行する
		 */
		protected void callPayActUpd01() {
			
			MCList<PayAct_Chk01_HdrR> hdrL = getChkList(_payActHdr);
			
			if (!hdrL.isEmpty()) {
				MCList<PayAct_Chk01_DtlR> dtlL = getChkList(_payActDtl);
				MSBHL_PayActRegService.PayAct_Upd01 upd01 = MSBHL_PayActRegService.crtPayAct_Upd01();
				upd01.up0().addAll(hdrL);
				upd01.up1().addAll(dtlL);
				upd01.exec();
			}
		}
		
		/**
		 * 処理単位のキー項目を返す。
		 * @return 処理単位のキー項目
		 */
		protected String[] getGrpKeys() {
			
			return new String[] {
					Ins02_PaySchdR.$psppl_cd, 
					Ins02_PaySchdR.$pay_dpt_cd, 
					Ins02_PaySchdR.$trd_cur_cd, 
					Ins02_PaySchdR.$pay_act_dt};
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			
			MCList<Ins02_PaySchdR> cntL = _paySchdL.distinctNE(
					Ins02_PaySchdR.$pay_schd_no, Ins02_PaySchdR.$err_flg);
			
			down0().total_cnt(cntL.size());
			down0().success_cnt(getChkList(cntL).size());
			down0().error_cnt(cntL.subList(r->r.err_flg()).size());
		}
		
		/**
		 * バッチログをクローズする。
		 */
		protected void closeLogger() {
			if (!MCServerThreadManager.isUseMainDBTran()) {
				_logger.close();
			}
		}
		
		protected Map_PayAct_Chk01_HdrR_Ins02_PaySchdR<PayAct_Chk01_HdrR,Ins02_PaySchdR> createMap_PayAct_Chk01_HdrR_Ins02_PaySchdR() {
			return new Map_PayAct_Chk01_HdrR_Ins02_PaySchdR<PayAct_Chk01_HdrR, Ins02_PaySchdR>();
		}

		public class Map_PayAct_Chk01_HdrR_Ins02_PaySchdR<D extends PayAct_Chk01_HdrR, S extends Ins02_PaySchdR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PayAct_Chk01_HdrR.$hdr_peg_no, Ins02_PaySchdR.$hdr_peg_no);
				addColumnPathMap(PayAct_Chk01_HdrR.$data_crud_typ, Ins02_PaySchdR.$data_crud_typ);
				addColumnPathMap(PayAct_Chk01_HdrR.$psppl_cd, Ins02_PaySchdR.$psppl_cd);
				addColumnPathMap(PayAct_Chk01_HdrR.$pay_dpt_cd, Ins02_PaySchdR.$pay_dpt_cd);
				addColumnPathMap(PayAct_Chk01_HdrR.$pay_act_dt, Ins02_PaySchdR.$pay_act_dt);
				addColumnPathMap(PayAct_Chk01_HdrR.$ac_dt, Ins02_PaySchdR.$ac_dt);
				addColumnPathMap(PayAct_Chk01_HdrR.$trd_cur_cd, Ins02_PaySchdR.$trd_cur_cd);
				addColumnPathMap(PayAct_Chk01_HdrR.$ap_sttl_cd, Ins02_PaySchdR.$ap_sttl_cd);
				addColumnPathMap(PayAct_Chk01_HdrR.$bank_ac_cd, Ins02_PaySchdR.$bank_ac_cd);
				addColumnPathMap(PayAct_Chk01_HdrR.$pay_bank_ac_cd, Ins02_PaySchdR.$pay_bank_ac_cd);
				addColumnPathMap(PayAct_Chk01_HdrR.$ap_setoff_typ, Ins02_PaySchdR.$ap_setoff_typ);
				addColumnPathMap(PayAct_Chk01_HdrR.$setoff_cd, Ins02_PaySchdR.$setoff_cd);
				addColumnPathMap(PayAct_Chk01_HdrR.$setoff_nm, Ins02_PaySchdR.$setoff_nm);
				addColumnPathMap(PayAct_Chk01_HdrR.$so_dpt_cd, Ins02_PaySchdR.$so_dpt_cd);
				addColumnPathMap(PayAct_Chk01_HdrR.$note_no, Ins02_PaySchdR.$note_no);
				addColumnPathMap(PayAct_Chk01_HdrR.$note_typ, Ins02_PaySchdR.$note_typ);
				addColumnPathMap(PayAct_Chk01_HdrR.$note_rsn_cd, Ins02_PaySchdR.$note_rsn_cd);
				addColumnPathMap(PayAct_Chk01_HdrR.$draw_dt, Ins02_PaySchdR.$draw_dt);
				addColumnPathMap(PayAct_Chk01_HdrR.$due_dt, Ins02_PaySchdR.$due_dt);
				addColumnPathMap(PayAct_Chk01_HdrR.$note_days, Ins02_PaySchdR.$note_days);
				addColumnPathMap(PayAct_Chk01_HdrR.$drawer_nm, Ins02_PaySchdR.$drawer_nm);
				addColumnPathMap(PayAct_Chk01_HdrR.$draw_bank_cd, Ins02_PaySchdR.$draw_bank_cd);
				addColumnPathMap(PayAct_Chk01_HdrR.$draw_branch_cd, Ins02_PaySchdR.$draw_branch_cd);
				addColumnPathMap(PayAct_Chk01_HdrR.$endrsr, Ins02_PaySchdR.$endrsr);
				addColumnPathMap(PayAct_Chk01_HdrR.$accptr, Ins02_PaySchdR.$accptr);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.schd_act_flg(false);
				dest.upd_cntr_not_chk_flg(true);
				dest.dac_not_chk_flg(true);
				dest.pay_dpt_chng_flg(true);
			}
		}
		
		protected Map_PayAct_Chk01_DtlR_Ins02_PaySchdR<PayAct_Chk01_DtlR, Ins02_PaySchdR> createMap_PayAct_Chk01_DtlR_Ins02_PaySchdR() {
			return new Map_PayAct_Chk01_DtlR_Ins02_PaySchdR<PayAct_Chk01_DtlR, Ins02_PaySchdR>();
		}
		
		public class Map_PayAct_Chk01_DtlR_Ins02_PaySchdR<D extends PayAct_Chk01_DtlR, S extends Ins02_PaySchdR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PayAct_Chk01_DtlR.$peg_no, Ins02_PaySchdR.$peg_no);
				addColumnPathMap(PayAct_Chk01_DtlR.$hdr_peg_no, Ins02_PaySchdR.$hdr_peg_no);
				addColumnPathMap(PayAct_Chk01_DtlR.$data_crud_typ, Ins02_PaySchdR.$data_crud_typ);
				addColumnPathMap(PayAct_Chk01_DtlR.$ap_appl_schd_no, Ins02_PaySchdR.$ap_appl_schd_no);
				addColumnPathMap(PayAct_Chk01_DtlR.$pay_chk_mng_no, Ins02_PaySchdR.$pay_chk_mng_no);
				addColumnPathMap(PayAct_Chk01_DtlR.$ap_sttl_cd, Ins02_PaySchdR.$ap_sttl_cd);
				addColumnPathMap(PayAct_Chk01_DtlR.$bank_ac_cd, Ins02_PaySchdR.$bank_ac_cd);
				addColumnPathMap(PayAct_Chk01_DtlR.$pay_bank_ac_cd, Ins02_PaySchdR.$pay_bank_ac_cd);
				addColumnPathMap(PayAct_Chk01_DtlR.$trd_cur_com_paid_tax_cd, Ins02_PaySchdR.$trd_cur_com_paid_tax_cd);
				addColumnPathMap(PayAct_Chk01_DtlR.$ap_setoff_typ, Ins02_PaySchdR.$ap_setoff_typ);
				addColumnPathMap(PayAct_Chk01_DtlR.$setoff_cd, Ins02_PaySchdR.$setoff_cd);
				addColumnPathMap(PayAct_Chk01_DtlR.$setoff_nm, Ins02_PaySchdR.$setoff_nm);
				addColumnPathMap(PayAct_Chk01_DtlR.$so_dpt_cd, Ins02_PaySchdR.$so_dpt_cd);
				addColumnPathMap(PayAct_Chk01_DtlR.$trd_cur_amt, Ins02_PaySchdR.$trd_cur_amt);
				addColumnPathMap(PayAct_Chk01_DtlR.$bsppl_cd, Ins02_PaySchdR.$bsppl_cd);
				addColumnPathMap(PayAct_Chk01_DtlR.$bsppl_dpt_cd, Ins02_PaySchdR.$bsppl_dpt_cd);
				addColumnPathMap(PayAct_Chk01_DtlR.$asppl_cd, Ins02_PaySchdR.$asppl_cd);
				addColumnPathMap(PayAct_Chk01_DtlR.$ap_dpt_cd, Ins02_PaySchdR.$ap_dpt_cd);
				addColumnPathMap(PayAct_Chk01_DtlR.$purc_act_no, Ins02_PaySchdR.$purc_act_no);
				addColumnPathMap(PayAct_Chk01_DtlR.$rcpt_iv_mng_no, Ins02_PaySchdR.$rcpt_iv_mng_no);
				addColumnPathMap(PayAct_Chk01_DtlR.$rcpt_iv_no, Ins02_PaySchdR.$rcpt_iv_no);
				addColumnPathMap(PayAct_Chk01_DtlR.$wrk_no, Ins02_PaySchdR.$wrk_no);
				addColumnPathMap(PayAct_Chk01_DtlR.$ap_typ, Ins02_PaySchdR.$ap_typ);
				addColumnPathMap(PayAct_Chk01_DtlR.$trd_d_rmrks, Ins02_PaySchdR.$trd_d_rmrks);
			}
		}
	}

	//FMCB CUSTOM END
}