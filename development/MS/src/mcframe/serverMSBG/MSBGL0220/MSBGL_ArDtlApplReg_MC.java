package mcframe.serverMSBG.MSBGL0220;

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
import mcframe.serverMSBG.MSBGL0220.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBG.MSBGL5100.*;
import static mcframe.serverMSBG.MSBGL0220.Query.*;
import mcframe.serverMAUC.MAUCL1060.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBGL_ArDtlApplReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBGL_ArDtlApplReg_MC extends MSBGL_ArDtlApplReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 消込対象の売掛明細を検索する<br>
	 */
	public class Srch01 extends MSBGL_ArDtlApplReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			Srch01_RcvActDR rcvActR = Srch01_RcvActDR.create();
			if (isSrchRcvAct(up0().rcv_act_d_no())) {
				executeQuery(rcvActR, MSBGL0220_MST_RCV_ACT_D_S01(), up0());
				
				if (!chkSlipDRslt(rcvActR)) {
					return;
				}
			}
			
			
			setArApplSrchCnd(rcvActR);
			MCList<Srch01_ApplDtlR> applL = MCList.create(Srch01_ApplDtlR.class);
			executeQuery(applL, MSBGL0220_MST_AR_APPL_SCHD_S01(), up0());
			if (!chkBArApplRslt(applL)) {
				return;
			}
			
			setArApplRslt(applL, rcvActR);
			
			// 電文への設定
			MCRow.copyall(down0(), rcvActR);
			down1().addAll(applL);
			
		}
		
		protected boolean chkSlipDRslt(Srch01_RcvActDR rcvActR) {

			if (rcvActR.isEmpty()) {
				return false;
			}
			if (!MAC_SLIP_STS_TYP.isCRT(rcvActR.slip_sts_typ())) {
				throw new MCAppException(up0(), null, MSBGL0085);
			}
			if (!isProcessable(rcvActR.trd_ptn_typ())) {
				throw new MCAppException(up0(), null, MSBGL0086);
			}

			return true;

		}
		
		protected boolean chkBArApplRslt(MCList<Srch01_ApplDtlR> applL) {

			if (applL.isEmpty()) {
				return false;
			}
			return true;

		}
		
		/**
		 * 処理可能な取引区分かどうかを判断する<p>
		 * 「売上代金入金」「前受金売掛金相殺」「その他勘定売掛金相殺」「仮受金売掛金相殺」のみ処理が可能
		 *
		 * @param trdTyp 取引区分
		 * @return 処理可否
		 */
		protected boolean isProcessable(String trdTyp) {

			return (MAC_TRD_PTN_TYP.isRCV_AR(trdTyp)
						|| MAC_TRD_PTN_TYP.isSETOFF_ADV_AR(trdTyp)
						|| MAC_TRD_PTN_TYP.isSETOFF_OTR_AR(trdTyp)
						|| MAC_TRD_PTN_TYP.isSETOFF_SUSP_AR(trdTyp));

		}
		
		protected void setArApplSrchCnd(Srch01_RcvActDR rcvActR) {
			
			// 入金実績明細を検索している場合に上り電文を編集する。
			if (isSrchRcvAct(up0().rcv_act_d_no())) {
				MCList<MST_AR_APPL_ACT_R> arApplActL = MCList.create(MST_AR_APPL_ACT_R.class);
				MST_AR_APPL_ACT_R t = MST_AR_APPL_ACT_R.create("T");
				MCQueryApiBuilder arApplActL_bldr = MCQueryApiBuilder.create(t);
				MST_AR_APPL_ACT_R arApplActR = MST_AR_APPL_ACT_R.create();
				arApplActL_bldr.addWhereWithAnd(t.rcv_act_d_no.eq(bind("1")), rcvActR.rcv_act_d_no());
				arApplActL_bldr.addWhereWithAnd(t.rcv_act_d_seq.eq(bind("1")), rcvActR.rcv_act_d_seq());
				dbSelect("MSBGL0220_MST_AR_APPL_ACT_S01", arApplActL, arApplActL_bldr);
				
				if (!arApplActL.isEmpty()) {
					arApplActR = arApplActL.get(0);
				}
				up0().ar_appl_schd_no(arApplActR.ar_appl_schd_no());
				up0().slo_no(rcvActR.slo_no());
			}
		}
		
		protected void setArApplRslt(MCList<Srch01_ApplDtlR> applL, Srch01_RcvActDR rcvActR) {

			for (Srch01_ApplDtlR applR : applL) {
				setArApplRslt(applR, rcvActR);
				applR.trd_cur_upri(getUpriDispPm(applR.trd_cur_upri(), applR.trd_ptn_typ(), applR.dscnt_itm_flg()));
				applR.trd_cur_amt(getAmtDispPm(applR.trd_cur_amt(), applR.trd_ptn_typ(), applR.dscnt_itm_flg()));
				applR.trd_cur_tax_amt(getAmtDispPm(applR.trd_cur_tax_amt(), applR.trd_ptn_typ(), applR.dscnt_itm_flg()));
				applR.trd_cur_dscnt_amt(getAmtDispPm(applR.trd_cur_dscnt_amt(), applR.trd_ptn_typ(), applR.dscnt_itm_flg()));
				applR.trd_unit_qty(applR.trd_unit_qty().multiply(MAC_TRD_PTN_TYP.qty_disp_pm(applR.trd_ptn_typ())));
			}

		}
		
		protected MCNumber getAmtDispPm(MCNumber val, String trdPtnTyp, boolean dscntItmFlg) {
			if (!isNull(val) && !isNull(trdPtnTyp)) {
				return val.multiply(MAUCL_TrdUtil.getAmtDispPm(trdPtnTyp, dscntItmFlg));
			}
			return val;
		}
		
		protected MCNumber getUpriDispPm(MCNumber val, String trdPtnTyp, boolean dscntItmFlg) {
			if (!isNull(val) && !isNull(trdPtnTyp)) {
				return val.multiply(MAUCL_TrdUtil.getUpriDispPm(trdPtnTyp, dscntItmFlg));
			}
			return val;
		}

		protected void setArApplRslt(Srch01_ApplDtlR applR, Srch01_RcvActDR rcvActR) {

			if (!MAC_TRD_PTN_TYP.isARSW_OUT_BILL_BAL(applR.arsw_trd_ptn_typ()) &&
					!MAC_TRD_PTN_TYP.isARSW_IN_BILL_BAL(applR.arsw_trd_ptn_typ())) {
				applR.arsw_ac_ym(null);
				applR.arsw_ac_dt(null);
				applR.arsw_trd_cd(null);
				applR.arsw_trd_nm(null);
				applR.arsw_act_no(null);
				applR.arsw_act_d_no(null);
			}

			if (rcvActR.isEmpty()) {
				return;
			}
			if (applR.appl_amt().isZero()) {
				applR.check(false);
			}
			else {
				applR.check(true);
			}
			applR.rcv_act_no(rcvActR.rcv_act_no());
			applR.rcv_act_seq(rcvActR.rcv_act_seq());
			applR.rcv_act_d_no(rcvActR.rcv_act_d_no());
			applR.rcv_act_d_seq(rcvActR.rcv_act_d_seq());
			applR.rcv_act_upd_cntr(rcvActR.rcv_act_upd_cntr());
		}
	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 売掛明細消込を更新する前のチェックをする<br>
	 */
	public class Chk01 extends MSBGL_ArDtlApplReg_MC_A.Chk01 {
		protected MCNumber _rcvActDApplAmt = null;
		protected MST_RCV_ACT_R _rcvActR = null;
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			MCList<ApplDtlR> notErrL = getChkList(up0());
			
			if (!hasErr()) {
				callWkActRegUpdChkSrv(notErrL);
				setErrToRtnStsTyp();
			}
			setDown();
		}
		
		/**
		 * 売掛明細消込サービスのチェック処理を実行する
		 */
		protected void callWkActRegUpdChkSrv(MCList<ApplDtlR> up0) {
			MSBGL_ArDtlApplService.ArDtlAppl_Chk01 ope = MSBGL_ArDtlApplService.crtArDtlAppl_Chk01();
			addAll(ope.up0(), up0, createMap_ArDtlAppl_Chk01_DtlR_ApplDtlR());
			ope.exec();
			copyErrFlg(up0, ope.down0());
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			msgL.addAll(chkBase());
			
			return msgL;
		}
		
		/**
		 * ロック、更新カウンタチェック
		 * 
		 * @return
		 */
		protected MCMessageList chkBase() {
			MCMessageList msgL = new MCMessageList();
			
			msgL.addAll(rcvActDLock(up0().get(0)));

			for (ApplDtlR r : up0()) {
				msgL.addAll(billDLock(r));
				msgL.addAll(billDApplBalLock(r));
				
			}
			
			return msgL;
		}		
		
		protected MCMessageList rcvActDLock(ApplDtlR r) {
			MCMessageList msgL = new MCMessageList();
			
			if (isNull(r.rcv_act_d_no())) {
				return msgL;
			}
			
			_rcvActR = MST_RCV_ACT_R.create();
			MST_RCV_ACT_R t = MST_RCV_ACT_R.create("T");
			MCQueryApiBuilder rcvActR_bldr = MCQueryApiBuilder.create(t);
			MST_RCV_ACT_D_R rcvactd1 = MST_RCV_ACT_D_R.create("RCVACTD1");
			rcvActR_bldr.setSelect(t.upd_cntr);
			rcvActR_bldr.addSelect(t.rcv_act_no);
			rcvActR_bldr.addSelect(t.rcv_act_seq);
			rcvActR_bldr.addSelect(rcvactd1.ar_dpt_cd);
			rcvActR_bldr
					.addSelect(bracket(rcvactd1.trd_cur_amt1.add(rcvactd1.trd_cur_amt2)
							.add(rcvactd1.trd_cur_amt3)).as("rcv_act_d_appl_tgt_amt"));
			rcvActR_bldr.addInnerJoin(rcvactd1, rcvactd1.rcv_act_no.eq(t.rcv_act_no)
					.and(rcvactd1.rcv_act_seq.eq(t.rcv_act_seq)));
			rcvActR_bldr.setWhere(rcvactd1.rcv_act_d_no.eq(bind("1")), r.rcv_act_d_no());
			rcvActR_bldr.addWhereWithAnd(rcvactd1.rcv_act_d_seq.eq(bind("1")), r.rcv_act_d_seq());
			dbSelectForUpdateNoWait("MSBGL0220_MST_RCV_ACT_S01", _rcvActR, rcvActR_bldr, r);
			
			_rcvActDApplAmt = _rcvActR.getNumberNE("RCV_ACT_D_APPL_TGT_AMT");
			msgL = checkUpdCntrNE(r, ApplDtlR.$rcv_act_upd_cntr, _rcvActR);
			
			// 下り電文設定
			r.rcv_act_no(_rcvActR.getString(MST_RCV_ACT_R.$rcv_act_no));
			r.rcv_act_seq(_rcvActR.getNumber(MST_RCV_ACT_R.$rcv_act_seq));
			
			
			return msgL;
		}
		
		protected MCMessageList billDLock(ApplDtlR r) {
			MST_BILL_D_R billDR = MST_BILL_D_R.create();
			MST_BILL_D_R t = MST_BILL_D_R.create("T");
			MCQueryApiBuilder billDR_bldr = MCQueryApiBuilder.create(t);
			billDR_bldr.setSelect(t.upd_cntr);
			dbSelectKeyForUpdateNoWait("MSBGL0220_MST_BILL_D_S01", billDR, billDR_bldr, r);
			return checkUpdCntrNE(r, ApplDtlR.$bill_d_upd_cntr, billDR);
		}
		
		protected MCMessageList billDApplBalLock(ApplDtlR r) {
			MST_BILL_D_APPL_BAL_R billDApplBalR = MST_BILL_D_APPL_BAL_R.create();
			MST_BILL_D_APPL_BAL_R t = MST_BILL_D_APPL_BAL_R.create("T");
			MCQueryApiBuilder billDApplBalR_bldr = MCQueryApiBuilder.create(t);
			billDApplBalR_bldr.setSelect(t.upd_cntr);
			billDApplBalR_bldr.addSelect(t.appl_tgt_amt);
			dbSelectKeyForUpdateNoWait("MSBGL0220_MST_BILL_D_APPL_BAL_S01",
					billDApplBalR, billDApplBalR_bldr, r);
			r.appl_tgt_amt(billDApplBalR.appl_tgt_amt());
			return checkUpdCntrNE(r, ApplDtlR.$bill_d_appl_bal_upd_cntr, billDApplBalR);
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCRow chkR = MCRow.create();
			chkR.setStringNE(MST_RCV_ACT_D_R.$ar_dpt_cd,
					_rcvActR.getString(MST_RCV_ACT_D_R.$ar_dpt_cd));
			msgL.addAll(checkWritableDptCdDac(chkR, MST_RCV_ACT_D_R.$ar_dpt_cd));
			
			msgL.addAll(chkOther(up0().subList(ApplDtlR.$check, true)));
			
			return msgL;
		}
		
		/**
		 * 固有チェック
		 * @param hR
		 * @return
		 */
		protected MCMessageList chkOther(MCList<ApplDtlR> applDtlL) {
			MCMessageList msgL = new MCMessageList();
			
			// 入金実績明細タブの消込額計が消込対象額を超えている場合エラーとする
			MCNumber ttlApplAmt = MCNumber.ZERO;
			for (ApplDtlR r : applDtlL) {
				ttlApplAmt = ttlApplAmt.add(r.appl_amt());
				
				// 明細単位で、消込累計額が消込対象額を超えている場合エラーとする
				if (isOverApplTgtAmt(r.appl_tgt_amt(), r.appl_tgt_amt().subtract(r.ttl_appl_amt()))) {
					msgL.add(new MCMessage(MSBGL0009, r.appl_amt(), r.appl_tgt_amt().subtract(r.ttl_appl_amt())));
				}
			}
			
			if (isOverApplTgtAmt(_rcvActDApplAmt, _rcvActDApplAmt.subtract(ttlApplAmt))) {
				msgL.add(new MCMessage(MSBGL0008));
			}
			
			return msgL;
		}
		
		/**
		 * 消込額計(消込累計額)が消込対象額を超えている場合エラーとする
		 * @param applTgtAmt 消込対象額
		 * @param notApplAmt 消込対象額から消込額計(消込累計額)を引いた結果
		 * @return エラーの場合Trueを返す
		 */
		protected boolean isOverApplTgtAmt(MCNumber applTgtAmt, MCNumber notApplAmt) {

			return applTgtAmt.multiply(notApplAmt).isNegative();
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	
	/**
	 * 入金実績明細を検索する場合にTrueを返す。
	 * 
	 * @return
	 */
	protected boolean isSrchRcvAct(String rcv_act_d_no) {
		return !isNull(rcv_act_d_no);
	}
	
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 売掛明細の消込実績を更新する<br>
	 */
	public class Upd01 extends MSBGL_ArDtlApplReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			// チェック処理
			editUp();
			callThisChk01();
			throwUpdErr();
			
			// 売掛明細消込サービス
			arDtlAppl();	
		}
		
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(ApplDtlR.$peg_no, up0());
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBGL_ArDtlApplReg.Chk01 ope = MSBGL_ArDtlApplReg.crtChk01();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}
		
		/**
		 * 売掛明細消込サービスを実行する。
		 * 
		 * @param rcvR
		 * @param isDel
		 */
		protected void arDtlAppl() {
			
			if (up0().isEmpty()) {
				return;
			}
			
			MCList<ApplDtlR> tmpUp0 = up0().statusChangedList();
			
			MSBGL_ArDtlApplService.ArDtlAppl_Upd01 ope = MSBGL_ArDtlApplService.crtArDtlAppl_Upd01();
			addAll(ope.up0(), tmpUp0, createMap_ArDtlAppl_Chk01_DtlR_ApplDtlR());
			ope.exec();
		}
	}
	
	
	// Mapper
	protected Map_ArDtlAppl_Chk01_DtlR_ApplDtlR<ArDtlAppl_Chk01_DtlR,ApplDtlR> createMap_ArDtlAppl_Chk01_DtlR_ApplDtlR() {
		return new Map_ArDtlAppl_Chk01_DtlR_ApplDtlR<ArDtlAppl_Chk01_DtlR, ApplDtlR>();
	}

	public class Map_ArDtlAppl_Chk01_DtlR_ApplDtlR<D extends ArDtlAppl_Chk01_DtlR, S extends ApplDtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ArDtlAppl_Chk01_DtlR.$rcv_act_d_no, ApplDtlR.$rcv_act_d_no);
			addColumnPathMap(ArDtlAppl_Chk01_DtlR.$rcv_act_d_seq, ApplDtlR.$rcv_act_d_seq);
			addColumnPathMap(ArDtlAppl_Chk01_DtlR.$bill_d_no, ApplDtlR.$bill_d_no);
			addColumnPathMap(ArDtlAppl_Chk01_DtlR.$parent_bill_d_no, ApplDtlR.$parent_bill_d_no);
			addColumnPathMap(ArDtlAppl_Chk01_DtlR.$bill_mng_no, ApplDtlR.$bill_mng_no);
			addColumnPathMap(ArDtlAppl_Chk01_DtlR.$appl_amt, ApplDtlR.$appl_amt);
			addColumnPathMap(ArDtlAppl_Chk01_DtlR.$rcv_act_no, ApplDtlR.$rcv_act_no);
			addColumnPathMap(ArDtlAppl_Chk01_DtlR.$rcv_act_seq, ApplDtlR.$rcv_act_seq);
		}
	}

	//FMCB CUSTOM END
}