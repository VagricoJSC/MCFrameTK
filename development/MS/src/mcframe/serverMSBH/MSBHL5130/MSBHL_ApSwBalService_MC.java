package mcframe.serverMSBH.MSBHL5130;

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
import mcframe.serverMSBH.MSBHL5130.*;	// このimportはFrameManagerの自動生成で追加されました。
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import mcframe.commonCore.report.container.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverCore.report.MCServerReportManager;
import mcframe.serverFXUC.FXUCL0030.FXUCL_Cache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_AtLeastOneValidater;
import mcframe.serverMSBI.MSBIL5010.*;
import mcframe.serverMSBH.MSBHL5020.*;
import mcframe.serverMSBH.MSBHL5040.*;
import mcframe.serverMSBH.MSBHL5010.MSBHL_ApUtil;
import static mcframe.serverMSBH.MSBHL5130.Query.*;
import mcframe.commonMSBH.MSBHR0030.*;
import java.util.*;
import java.util.Map.*;
import mcframe.serverMSUC.MSUCL0120.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBHL_ApSwBalService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBHL_ApSwBalService_MC extends MSBHL_ApSwBalService_MC_A{
	//FMCB CUSTOM START
	/**
	 * このクラス（スレッドセーフ対応用）
	 */
	protected static final Class<MSBHL_ApSwBalService> CLAZZ = MSBHL_ApSwBalService.class;
	
	/**
	 * ApSwBal_Chk01オペレーション.<p>
	 *
	 * 債務残高振替が可能かチェックをする。<br>
	 */
	public class ApSwBal_Chk01 extends MSBHL_ApSwBalService_MC_A.ApSwBal_Chk01 {
	
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			callApDServiceChk03();
			setDown();
		}
		
		@Override
		protected void initUpSub() {
			super.initUpSub();
			crtJk(up0(), up1(), up2());
			initCache(up0());
		}

		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();
			for (ApSwBal_Chk01_ToR toR : up2()) {
				ApSwBal_Chk01_BaseR baseR = getSwBaseR(toR);
				toR.ac_dt(baseR.ac_dt());
			}
		}
		
		@Override
		protected MCMessageList updCntChkReq() {
		
			MCMessageList msgL = super.updCntChkReq();
			msgL.addAll(chkUpdCntReq());
			
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
		
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(chkUpdCnt());
			msgL.addAll(super.doServerCheckBase());

			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheck() {
		
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(super.doServerCheck());
			msgL.addAll(chkReq());
			
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
		
			MCMessageList msgL = super.doServerCheckSub();
			cmpleSub();
			
			msgL.addAll(chkWrk());
			msgL.addAll(chkCl());
			msgL.addAll(chkDac());
			msgL.addAll(chkSwTgt());
			msgL.addAll(chkApDpt());
			msgL.addAll(chkSttlTyp());
			return msgL;
		}
		
		/**
		 * 上り電文の値を補完する
		 */
		protected void cmpleSub() {
			MCList<ApSwBal_Chk01_ToR> toL = getChkList(up2());
			for (ApSwBal_Chk01_ToR toR : toL) {
				ApSwBal_Chk01_BaseR baseR = getSwBaseR(toR);
				MAM_BP_R bspplR = getBpCache(toR.bsppl_cd());
				if (bspplR.pay_spot_flg()) {
					if (!isNullOr(baseR.pay_basis_dt(), baseR.pay_schd_dt())) {
						baseR.pay_basis_dt(null);
						baseR.pay_crryovr_times(null);
					}
				}
				else {
					baseR.pay_schd_dt(null);
				}
				if (isNull(baseR.pay_crryovr_times())) {
					baseR.pay_crryovr_times(0);
				}
			}
			MCList<ApSwBal_Chk01_FrR> frL = getChkList(up0());
			for (ApSwBal_Chk01_FrR frR : frL) {
				ApSwBal_Chk01_ToR toR = getSwToR(frR);
				
				if (MSC_AP_WRK_OPE_TYP.isWRK(toR.wrk_ope_typ())) {
					frR.wrk_no(toR.wrk_no());
				}
				else if (MSC_AP_WRK_OPE_TYP.isNOT_WRK(toR.wrk_ope_typ())) {
					frR.wrk_no(MAC_STR.NULL_VAL.value());
				}
				else {
					if (isSwChk(frR)) {
						// 照合済の場合は、支払照合の案件ＮＯを引き継ぐ
						MST_PAY_CHK_R pcR = getPayChkCache(frR.pay_chk_mng_no());
						frR.wrk_no(pcR.wrk_no());
					}
					else {
						// 未照合の場合は、買掛明細の案件ＮＯを引き継ぐ
						frR.wrk_no(getApDCache(frR.ap_d_no()).wrk_no());
					}
				}
			}
		}
		
		/**
		 * 排他必須チェックを行う（更新カウンタ必須）
		 */
		protected MCMessageList chkUpdCntReq() {
			MCMessageList msgL = new MCMessageList();
			
			MCList<ApSwBal_Chk01_FrR> frL = getChkList(up0());
			for (ApSwBal_Chk01_FrR frR : frL) {
				ApSwBal_Chk01_BaseR baseR = getSwBaseR(frR);
				if (baseR.upd_cntr_not_chk_flg()) {
					continue;
				}
				// 更新カウンタの必須チェック
				if (isSwChk(frR)) {
					msgL.addAll(check(frR, ApSwBal_Chk01_FrR.$pay_schd_no, new FXUCL_RequiredValidater()));
					msgL.addAll(check(frR, ApSwBal_Chk01_FrR.$pay_chk_upd_cntr, new FXUCL_RequiredValidater()));
				}
				else {
					msgL.addAll(check(frR, ApSwBal_Chk01_FrR.$ap_d_no, new FXUCL_RequiredValidater()));
					msgL.addAll(check(frR, ApSwBal_Chk01_FrR.$ap_d_upd_cntr, new FXUCL_RequiredValidater()));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 排他チェックを行う
		 */
		protected MCMessageList chkUpdCnt() {
			MCMessageList msgL = new MCMessageList();
			
			MCList<ApSwBal_Chk01_FrR> frL = getChkList(up0());
			for (ApSwBal_Chk01_FrR frR : frL) {
				ApSwBal_Chk01_BaseR baseR = getSwBaseR(frR);
				if (baseR.upd_cntr_not_chk_flg()) {
					continue;
				}
				if (isSwChk(frR)) {
					// 照合済残高振替は支払照合ヘッダの更新カウンタをチェック
					MST_PAY_CHK_R payChkR = getPayChkCache(frR.pay_chk_mng_no());
					msgL.addAll(checkUpdCntrNE(frR, ApSwBal_Chk01_FrR.$pay_chk_upd_cntr, payChkR));
				}
				else {
					// 未照合残高振替は買掛明細の更新カウンタをチェック
					MST_AP_D_R apDR = getApDCache(frR.ap_d_no());
					msgL.addAll(checkUpdCntrNE(frR, ApSwBal_Chk01_FrR.$ap_d_upd_cntr, apDR));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 必須チェックを行う
		 */
		protected MCMessageList chkReq() {
			MCMessageList msgL = new MCMessageList();
			
			MCList<ApSwBal_Chk01_FrR> frL = getChkList(up0());
			for (ApSwBal_Chk01_FrR frR : frL) {
				if (isSwChk(frR)) {
					msgL.addAll(check(frR, ApSwBal_Chk01_FrR.$pay_schd_no, new FXUCL_RequiredValidater()));
				}
				else {
					msgL.addAll(check(frR, ApSwBal_Chk01_FrR.$ap_d_no, new FXUCL_RequiredValidater()));
				}
			}
			
			MCList<ApSwBal_Chk01_ToR> toL = getChkList(up2());
			for (ApSwBal_Chk01_ToR toR : toL) {
				ApSwBal_Chk01_BaseR baseR = getSwBaseR(toR);
				MAM_BP_R bspplR = getBpCache(toR.bsppl_cd());
				if (baseR.sw_chk_flg()) {
					if (bspplR.pay_spot_flg()) {
						String[] cols = {
							ApSwBal_Chk01_BaseR.$pay_basis_dt,
							ApSwBal_Chk01_BaseR.$pay_schd_dt
						};
						msgL.addAll(check(baseR, cols, new FXUCL_AtLeastOneValidater()));
					}
					else {
						msgL.addAll(check(baseR, ApSwBal_Chk01_BaseR.$pay_basis_dt, new FXUCL_RequiredValidater()));
					}
				}
				
				if (!isNull(baseR.pay_basis_dt())) {
					msgL.addAll(check(baseR, ApSwBal_Chk01_BaseR.$pay_crryovr_times, new FXUCL_RequiredValidater()));
				}
				
				if (MSC_AP_WRK_OPE_TYP.isWRK(toR.wrk_ope_typ())) {
					msgL.addAll(check(toR, ApSwBal_Chk01_ToR.$wrk_no, new FXUCL_RequiredValidater()));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 案件の存在チェックを行う
		 */
		protected MCMessageList chkWrk() {
			MCMessageList msgL = new MCMessageList();
		
			MCList<ApSwBal_Chk01_FrR> frL = getChkList(up0());
			for (ApSwBal_Chk01_FrR frR : frL) {
				ApSwBal_Chk01_ToR toR = getSwToR(frR);
				
				if (isNull(toR.wrk_ope_typ()) && !isNullOrNullVal(frR.wrk_no())) {
					MST_WRK_R wrkR = getWrkCache(frR.wrk_no());
					if (isNull(wrkR) || wrkR.isEmpty() || wrkR.can_flg()) {
						msgL.add(new MCMessage(frR, ApSwBal_Chk01_ToR.$wrk_no, MSBHL0101, frR.wrk_no(), toDispGUIIndex(frR)));
					}
				}
				else if (MSC_AP_WRK_OPE_TYP.isWRK(toR.wrk_ope_typ()) && !isNull(toR.wrk_no())) {
					MST_WRK_R wrkR = getWrkCache(toR.wrk_no());
					if (isNull(wrkR) || wrkR.isEmpty() || wrkR.can_flg()) {
						msgL.add(new MCMessage(toR, ApSwBal_Chk01_ToR.$wrk_no, MSBHL0101, toR.wrk_no(), toDispGUIIndex(toR)));
					}
					break;
				}
			}
			
			return msgL;
		}
		
		/**
		 * 締チェックを行う
		 */
		protected MCMessageList chkCl() {
			
			// メッセージ退避
			MCMessageList msgPool = new MCMessageList(), msgL = new MCMessageList();
			msgPool.addAll(MCMessagePool.getMessageList());
			MCMessagePool.clear();
			
			MSBIL_ClService.Cl_Chk03 o = MSBIL_ClService.crtCl_Chk03();
			
			MCList<ApSwBal_Chk01_BaseR> baseL = getChkList(up1());
			for (ApSwBal_Chk01_BaseR baseR : baseL) {
				
				Cl_Chk03_CndR up0R = o.up0().add();
				up0R.peg_no(baseR.peg_no());
				up0R.ac_dt(baseR.ac_dt());
				up0R.pay_cls_chk_flg(true);
				up0R.setAttributes(baseR);
			}
			
			MCList<ApSwBal_Chk01_FrR> frL = getChkList(up0());
			for (ApSwBal_Chk01_FrR frR : frL) {
				// 振替元
				Cl_Chk03_CndBpR up2R = o.up2().add();
				if (isSwChk(frR)) {
					MST_PAY_SCHD_R psR = getPaySchdCache(frR.pay_schd_no());
					up2R.bp_cd(psR.asppl_cd());
				}
				else {
					MST_AP_D_R apDR = getApDCache(frR.ap_d_no());
					up2R.bp_cd(apDR.asppl_cd());
				}
				// 振替先
				ApSwBal_Chk01_ToR toR = getSwToR(frR);
				o.up2().add().bp_cd(toR.asppl_cd());
			}
			// 重複を除外
			o.up2().setAll(o.up2().groupBy(Cl_Chk03_CndBpR.$bp_cd));
			
			if (!o.up0().isEmpty()) {
				o.exec();
				copyErrFlg(up0(), o.down0(), ApSwBal_Chk01_BaseR.$peg_no, Cl_Chk03_CndR.$peg_no);
			}
			
			// 退避したメッセージを戻す
			msgL.addAll(MCMessagePool.getMessageList());
			MCMessagePool.clear();
			MCMessagePool.addAll(msgPool);
			
			return msgL;
		}
		
		/**
		 * ＤＡＣチェックを行う
		 */
		protected MCMessageList chkDac() {
			MCMessageList msgL = new MCMessageList();
		
			// 振替元
			MCList<ApSwBal_Chk01_FrR> frL = getChkList(up0());
			for (ApSwBal_Chk01_FrR frR : frL) {
				ApSwBal_Chk01_BaseR baseR = getSwBaseR(frR);
				if (baseR.dac_not_chk_flg()) {
					continue;
				}
				ApSwBal_Chk01_ToR chkR = ApSwBal_Chk01_ToR.create();
				chkR.setAttributes(frR);
				chkR.ap_dpt_cd(isSwChk(frR) ?
					getPaySchdCache(frR.pay_schd_no()).ap_dpt_cd() : getApDCache(frR.ap_d_no()).ap_dpt_cd());
				msgL.addAll(checkWritableDptCdDac(chkR, ApSwBal_Chk01_ToR.$ap_dpt_cd));
			}
			
			// 振替先
			MCList<ApSwBal_Chk01_ToR> toL = getChkList(up2());
			for (ApSwBal_Chk01_ToR toR : toL) {
				ApSwBal_Chk01_BaseR baseR = getSwBaseR(toR);
				if (baseR.dac_not_chk_flg()) {
					continue;
				}
				msgL.addAll(checkWritableDptCdDac(toR, ApSwBal_Chk01_ToR.$ap_dpt_cd));
			}
			
			return msgL;
		}
		
		/**
		 * 振替可能かチェックを行う
		 */
		protected MCMessageList chkSwTgt() {
			MCMessageList msgL = new MCMessageList();
		
			MCList<ApSwBal_Chk01_FrR> frL = getChkList(up0());
			for (ApSwBal_Chk01_FrR frR : frL) {
				if (isSwChk(frR)) {
					MST_PAY_SCHD_R psR = getPaySchdCache(frR.pay_schd_no());
					
					if (MAC_AP_STTL_TYP.is_com_paid(psR.ap_sttl_typ())) {
						// 手数料は振替不可
						msgL.add(new MCMessage(frR, null, MSBHL0102, frR.pay_schd_no(), psR.ap_sttl_cd(), psR.ap_sttl_typ(), toDispGUIIndex(frR)));
					}
					
					if (MAC_AP_STTL_TYP.isWTAX(psR.ap_sttl_typ())) {
						// 源泉税は振替不可
						msgL.add(new MCMessage(frR, null, MSBHL0103, frR.pay_schd_no(), toDispGUIIndex(frR)));
					}
					
					if (MSC_PAY_STS_TYP.isPAY(psR.pay_sts_typ())) {
						// 支払済みは振替不可
						msgL.add(new MCMessage(frR, null, MSBHL0104, frR.pay_schd_no(), toDispGUIIndex(frR)));
					}
					
					MST_PAY_CHK_R pcR = getPayChkCache(frR.pay_chk_mng_no());
					if (pcR.aprv_flg() && !MAC_APRV_STS_TYP.isACPT(pcR.aprv_sts_typ())) {
						// 承認対象の場合は最終承認済み以外は振替不可
						msgL.add(new MCMessage(frR, null, MSBHL0105, frR.pay_schd_no(), toDispGUIIndex(frR)));
					}
				}
				else {
					MST_AP_D_R apDR = getApDCache(frR.ap_d_no());
					
					if (!apDR.valid_flg()) {
						// 無効な買掛明細は振替不可
						msgL.add(new MCMessage(frR, null, MSBHL0106, frR.ap_d_no(), toDispGUIIndex(frR)));
					}
					
					MAM_BP_R bpR = getBpCache(apDR.sppl_cd());
					if (!bpR.purc_interim_cl_flg() && apDR.interim_flg()) {
						// 仮単価の買掛明細は振替不可
						msgL.add(new MCMessage(frR, null, MSBHL0004, apDR.purc_act_d_no(), apDR.ap_d_no(), toDispGUIIndex(frR)));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 債務部門に対するチェックを行う
		 */
		protected MCMessageList chkApDpt() {
			MCMessageList msgL = new MCMessageList();
		
			MCList<ApSwBal_Chk01_FrR> frL = getChkList(up0());
			MCList<ApSwBal_Chk01_ToR> apDptL = MCList.create(ApSwBal_Chk01_ToR.class);
			for (ApSwBal_Chk01_FrR frR : frL) {
				ApSwBal_Chk01_BaseR baseR = getSwBaseR(frR);
				MAM_AC_RSN_R acRsnR = getAcRsnCache(baseR.ac_rsn_cd());
				if (acRsnR.ac_invalid_flg()) {
					continue;
				}
				// 仕分対象の取引のみを対象に ToR のコンテナを利用してチェック
				if (isSwChk(frR)) {
					MCList<MST_AP_D_R> apDL = getApDCacheByPaySchd(frR.pay_schd_no());
					for (MST_AP_D_R apDR : apDL) {
						ApSwBal_Chk01_ToR apDptR = apDptL.add();
						apDptR.ap_dpt_cd(apDR.ap_dpt_cd());
						apDptR.ac_dt(baseR.ac_dt());
						apDptR.setStringNE(ApSwBal_Chk01_FrR.$pay_schd_no, frR.pay_schd_no());
						apDptR.setAttributes(frR);
						break;
					}
				}
				else {
					MST_AP_D_R apDR = getApDCache(frR.ap_d_no());
					ApSwBal_Chk01_ToR apDptR = apDptL.add();
					apDptR.ap_dpt_cd(apDR.ap_dpt_cd());
					apDptR.ac_dt(baseR.ac_dt());
					apDptR.setStringNE(ApSwBal_Chk01_FrR.$ap_d_no, frR.ap_d_no());
					apDptR.setAttributes(frR);
				}
			}
			if (!apDptL.isEmpty()) {
				checkDptCd(apDptL);
				for (ApSwBal_Chk01_ToR r : apDptL) {
					if (isNull(r.getString("chk_ap_dpt_cd"))) {
						// 計上日時点で振替元の債務部門が有効でない場合は振替不可
						msgL.add(new MCMessage(
							r, null, MSBHL0107,
							r.getStringNE(ApSwBal_Chk01_FrR.$pay_schd_no),
							r.getStringNE(ApSwBal_Chk01_FrR.$ap_d_no),
							r.ap_dpt_cd(), toYMDString(r.ac_dt()), toDispGUIIndex(r)));
					}
				}
			}
			
			return msgL;
		}
		/**
		 * 債務部門が計上日時点で有効かチェックする
		 */
		protected void checkDptCd(MCList<ApSwBal_Chk01_ToR> apDptL) {
			apDptL.addStringColumn("chk_ap_dpt_cd");
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_DPT$F_CHECK_DPT_CD", "01"),
					MABCFunction.getFunctionExecuter("MAPA_DPT$F_CHECK_DPT_CD"),
					"chk_ap_dpt_cd", apDptL, ApSwBal_Chk01_ToR.$ap_dpt_cd,
					ApSwBal_Chk01_ToR.$ac_dt);
		}
		
		/**
		 * 決済方法区分に対するチェックを行う
		 */
		protected MCMessageList chkSttlTyp() {
			MCMessageList msgL = new MCMessageList();
			
			MCList<ApSwBal_Chk01_BaseR> baseL = getChkList(up1());
			for (ApSwBal_Chk01_BaseR baseR : baseL) {
				if (baseR.sw_chk_flg()) {
					if (!MAC_AP_STTL_TYP.isAPSW_OUT_CHK(baseR.ap_sttl_typ())) {
						msgL.add(new MCMessage(
							baseR, ApSwBal_Chk01_BaseR.$ap_sttl_cd, MSBHL0108,
							baseR.ap_sttl_cd(), MAC_AP_STTL_TYP.APSW_OUT_CHK.value(), toDispGUIIndex(baseR)));
					}
					MAM_STTL_R dbc = getSttlCacheByApSttlTyp(MAC_AP_STTL_TYP.APSW_IN_CHK.value());
					if (isNull(dbc) || dbc.isEmpty()) {
						msgL.add(new MCMessage(baseR, null, MSBHL0109, MAC_AP_STTL_TYP.APSW_IN_CHK.value(), toDispGUIIndex(baseR)));
					}
				}
				else {
					if (!MAC_AP_STTL_TYP.isAPSW_OUT_NOT_CHK(baseR.ap_sttl_typ())) {
						msgL.add(new MCMessage(
							baseR, ApSwBal_Chk01_BaseR.$ap_sttl_cd, MSBHL0108,
							baseR.ap_sttl_cd(), MAC_AP_STTL_TYP.APSW_OUT_NOT_CHK.value(), toDispGUIIndex(baseR)));
					}
					MAM_STTL_R dbc = getSttlCacheByApSttlTyp(MAC_AP_STTL_TYP.APSW_IN_NOT_CHK.value());
					if (isNull(dbc) || dbc.isEmpty()) {
						msgL.add(new MCMessage(baseR, null, MSBHL0109, MAC_AP_STTL_TYP.APSW_IN_NOT_CHK.value(), toDispGUIIndex(baseR)));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 買掛明細登録サービスの残高振替前チェックを行う
		 */
		protected void callApDServiceChk03() {
			MSBHL_ApDtlRegService.ApDtl_Chk03 o = MSBHL_ApDtlRegService.crtApDtl_Chk03();
			
			MCList<ApSwBal_Chk01_FrR> frL = getChkList(up0());
			for (ApSwBal_Chk01_FrR frR : frL) {
				ApSwBal_Chk01_BaseR baseR = getSwBaseR(frR);
				ApSwBal_Chk01_ToR toR = getSwToR(frR);
				
				ApDtl_Chk01_DtlR up0R = o.up0().add();
				up0R.peg_no(frR.peg_no());
				up0R.bsppl_cd(toR.bsppl_cd());
				up0R.setAttributes(frR);
				
				if (!baseR.sw_chk_flg() && isNullAnd(baseR.pay_basis_dt(), baseR.pay_schd_dt())) {
					MST_AP_D_R apDR = getApDCache(frR.ap_d_no());
					up0R.pay_basis_dt(apDR.pay_basis_dt());
					up0R.pay_crryovr_times(apDR.pay_crryovr_times());
				}
				else {
					up0R.pay_basis_dt(baseR.pay_basis_dt());
					up0R.pay_crryovr_times(baseR.pay_crryovr_times());
					break;
				}
			}
			o.exec();
			copyErrFlg(frL, o.down0());
		}
		
		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
			down2().setAll(up2());
		}
	}
	
	/**
	 * ApSwBal_Ins01オペレーション.<p>
	 *
	 * 債務残高振替を行う。<br>
	 */
	public class ApSwBal_Ins01 extends MSBHL_ApSwBalService_MC_A.ApSwBal_Ins01 {
		/**
		 * 支払実績登録サービス（払出分）
		 */
		protected MSBHL_PayActRegService.PayAct_Upd01 _paDUpd01Out;
		
		/**
		 * 払出の支払実績明細と上り電文を対応付けるマップ
		 */
		protected Map<Integer, ApSwBal_Chk01_FrR> _paDMap;
		
		/**
		 * 買掛明細登録サービス
		 */
		protected MSBHL_ApDtlRegService.ApDtl_Upd03 _apDUpd03;
			
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			crtJk(up0(), up1(), up2());
			callPayActServiceOut();
			updPaySchd();
			callApDServiceUpd03();
			callPayActServiceIn();
			prnt();
			setDown();
		}
		
		/**
		 * 支払実績登録サービスを実行して払出の実績を作成する
		 */
		protected void callPayActServiceOut() {
			MSBHL_PayActRegService.PayAct_Chk01 chk =  MSBHL_PayActRegService.crtPayAct_Chk01();
			_paDMap = new HashMap<>();
			
			int idx = 0;
			// 照合済
			for (ApSwBal_Chk01_FrR frR : up0().subList(rr -> isSwChk(rr))) {
				// 買掛消込予定ごとに作成する
				for (MST_AP_APPL_SCHD_R applR : getApApplSchdCacheByPaySchd(frR.pay_schd_no())) {
					makeSwCmn(chk, idx, frR);
					makeSwOutChk(chk, idx, frR, applR);
					_paDMap.put(idx++, frR);
				}
			}
			
			// 未照合
			for (ApSwBal_Chk01_FrR frR : up0().subList(rr -> !isSwChk(rr))) {
				// 買掛明細ごとに作成する
				MST_AP_D_R apDR = getApDCache(frR.ap_d_no());
				makeSwCmn(chk, idx, frR);
				makeSwOutNotChk(chk, idx, frR, apDR);
				_paDMap.put(idx++, frR);
			}
			
			// まとめる
			groupBySw(chk);
			
			chk.exec();
			
			_paDUpd01Out =  MSBHL_PayActRegService.crtPayAct_Upd01();
			_paDUpd01Out.up0().setAll(chk.down0());
			_paDUpd01Out.up1().setAll(chk.down1());
			_paDUpd01Out.exec();
			
			// 払出の支払実績を取得
			initPayActCache(_paDUpd01Out.down0());
			initPayActDCache(_paDUpd01Out.down1());
		}
		
		/**
		 * 支払実績登録サービスを実行して受入の実績を作成する
		 */
		protected void callPayActServiceIn() {
			MSBHL_PayActRegService.PayAct_Chk01 chk =  MSBHL_PayActRegService.crtPayAct_Chk01();

			int idx = 0;
			for (PayAct_Chk01_DtlR downR : _paDUpd01Out.down1()) {
				// 振替元の支払実績明細ごとに作成する
				MST_PAY_ACT_D_R paDR = getPayActDCache(downR.pay_act_d_no(), downR.pay_act_d_seq());
				ApSwBal_Chk01_FrR frR = _paDMap.get(downR.peg_no().intValue());
				
				// 照合済
				if (isSwChk(frR)) {
					makeSwCmn(chk, idx, frR);
					makeSwInChk(chk, idx, frR, paDR);
				}
				// 未照合
				else {
					makeSwCmn(chk, idx, frR);
					makeSwInNotChk(chk, idx, frR, paDR);
				}
				idx++;
			}
			
			// まとめる
			groupBySw(chk);
			
			chk.exec();
			
			MSBHL_PayActRegService.PayAct_Upd01 upd =  MSBHL_PayActRegService.crtPayAct_Upd01();
			upd.up0().setAll(chk.down0());
			upd.up1().setAll(chk.down1());
			upd.exec();
		}
		
		/**
		 * 支払実績登録サービスの電文を作成する（共通）
		 */
		protected void makeSwCmn(MSBHL_PayActRegService.PayAct_Chk01 o, int idx, ApSwBal_Chk01_FrR frR) {

			ApSwBal_Chk01_BaseR baseR = getSwBaseR(frR);
			
			PayAct_Chk01_HdrR hdrR = o.up0().add();
			hdrR.hdr_peg_no(idx);
			hdrR.data_crud_typ(MAC_SLIP_STS_TYP.CRT.value());
			hdrR.pay_dpt_cd(baseR.pay_dpt_cd());
			hdrR.wg_cd(baseR.wg_cd());
			hdrR.pay_usr_cd(baseR.pay_usr_cd());
			hdrR.pay_act_dt(baseR.sw_dt());
			hdrR.ac_dt(baseR.ac_dt());
			hdrR.pay_basis_dt(baseR.ac_dt());
			hdrR.schd_act_flg(false);					// 予定時実績はオフ
			hdrR.upd_cntr_not_chk_flg(true);		// チェック不要
			hdrR.dac_not_chk_flg(true);				// チェック不要
			hdrR.pay_dpt_chng_flg(false);			// 画面で指定するので変換不要
			hdrR.setAttributes(frR);

			PayAct_Chk01_DtlR dtlR = o.up1().add();
			dtlR.peg_no(hdrR.hdr_peg_no());
			dtlR.hdr_peg_no(hdrR.hdr_peg_no());
			dtlR.data_crud_typ(MAC_SLIP_STS_TYP.CRT.value());
			dtlR.setAttributes(frR);
		}
		
		/**
		 * 支払実績登録サービスの電文を作成する（照合済残高振替払出）
		 */
		protected void makeSwOutChk(MSBHL_PayActRegService.PayAct_Chk01 o, int idx, ApSwBal_Chk01_FrR frR, MST_AP_APPL_SCHD_R applR) {
			
			ApSwBal_Chk01_BaseR baseR = getSwBaseR(frR);
			MST_PAY_CHK_R pcR = getPayChkCache(frR.pay_chk_mng_no());
			MST_PAY_SCHD_R psR = getPaySchdCache(frR.pay_schd_no());
			MST_AP_D_R apDR = getApDCacheByPaySchd(frR.pay_schd_no(), applR.purc_act_no(), applR.rcpt_iv_mng_no());
			MAM_BP_R bspplR = getBpCache(pcR.bsppl_cd());

			PayAct_Chk01_HdrR hdrR = o.up0().get(idx);
			hdrR.psppl_cd(bspplR.psppl_cd());
			hdrR.trd_cur_cd(apDR.trd_cur_cd());
			hdrR.xrate(getXRate(frR, applR));
			hdrR.ap_sttl_typ(baseR.ap_sttl_typ());
			hdrR.ap_sttl_cd(baseR.ap_sttl_cd());
			hdrR.trd_rmrks(baseR.trd_rmrks());
			hdrR.sub_char1(baseR.sub_char1());
			hdrR.sub_char2(baseR.sub_char2());
			hdrR.sub_char3(baseR.sub_char3());
			
			PayAct_Chk01_DtlR dtlR = o.up1().get(idx);
			dtlR.ap_appl_schd_no(applR.ap_appl_schd_no());
			dtlR.pay_schd_no(applR.pay_schd_no());
			dtlR.pay_chk_mng_no(psR.pay_chk_mng_no());
			dtlR.pay_chk_no(pcR.pay_chk_no());
			dtlR.ap_sttl_typ(baseR.ap_sttl_typ());
			dtlR.ap_sttl_cd(baseR.ap_sttl_cd());
			dtlR.ac_rsn_cd(baseR.ac_rsn_cd());
			
			dtlR.trd_cur_amt(applR.trd_cur_amt().subtract(applR.trd_cur_appl_amt()));
			dtlR.base_cur_amt(null);	// 基準通貨金額は支払実績登録サービス内で計算する
			dtlR.base_cur_amt_not_calc_flg(false);
			
			dtlR.bsppl_cd(pcR.bsppl_cd());
			dtlR.bsppl_dpt_cd(pcR.bsppl_dpt_cd());
			dtlR.asppl_cd(psR.asppl_cd());
			dtlR.ap_dpt_cd(psR.ap_dpt_cd());
			dtlR.purc_act_no(applR.purc_act_no());
			dtlR.rcpt_iv_mng_no(applR.rcpt_iv_mng_no());
			dtlR.rcpt_iv_no(applR.rcpt_iv_no());
			dtlR.wrk_no(pcR.wrk_no());
			dtlR.ap_typ(psR.ap_typ());
		}
		
		/**
		 * 支払実績登録サービスの電文を作成する（照合済残高振替受入）
		 */
		protected void makeSwInChk(MSBHL_PayActRegService.PayAct_Chk01 o, int idx, ApSwBal_Chk01_FrR frR, MST_PAY_ACT_D_R paDR) {
			
			ApSwBal_Chk01_ToR toR = getSwToR(frR);
			MST_PAY_ACT_R paR = getPayActCache(paDR.pay_act_no(), paDR.pay_act_seq());
			MAM_STTL_R sttlR = getSttlCacheByApSttlTyp(MAC_AP_STTL_TYP.APSW_IN_CHK.value());

			PayAct_Chk01_HdrR hdrR = o.up0().get(idx);
			hdrR.psppl_cd(toR.psppl_cd());
			hdrR.trd_cur_cd(paR.trd_cur_cd());
			hdrR.xrate(paR.xrate());
			hdrR.ap_sttl_typ(sttlR.ap_sttl_typ());
			hdrR.ap_sttl_cd(sttlR.sttl_cd());
			hdrR.par_pay_act_no(paR.pay_act_no());
			hdrR.par_pay_act_seq(paR.pay_act_seq());
			
			PayAct_Chk01_DtlR dtlR = o.up1().get(idx);
			dtlR.ap_sttl_typ(sttlR.ap_sttl_typ());
			dtlR.ap_sttl_cd(sttlR.sttl_cd());
			dtlR.ac_rsn_cd(sttlR.ac_rsn_cd());
			
			dtlR.trd_cur_amt(paDR.trd_cur_amt().negate());
			dtlR.base_cur_amt(paDR.base_cur_amt().negate());	// 振替元の基準通貨金額を使用する
			dtlR.base_cur_amt_not_calc_flg(true);
			
			dtlR.bsppl_cd(toR.bsppl_cd());
			dtlR.bsppl_dpt_cd(toR.bsppl_dpt_cd());
			dtlR.asppl_cd(toR.asppl_cd());
			dtlR.ap_dpt_cd(toR.ap_dpt_cd());
			dtlR.purc_act_no(paDR.purc_act_no());
			dtlR.rcpt_iv_mng_no(paDR.rcpt_iv_mng_no());
			dtlR.rcpt_iv_no(paDR.rcpt_iv_no());
			dtlR.wrk_no(frR.wrk_no());
			dtlR.ap_typ(paDR.ap_typ());
			dtlR.par_pay_act_d_no(paDR.pay_act_d_no());
			dtlR.par_pay_act_d_seq(paDR.pay_act_d_seq());
		}
		
		/**
		 * 支払実績登録サービスの電文を作成する（未照合残高振替払出）
		 */
		protected void makeSwOutNotChk(MSBHL_PayActRegService.PayAct_Chk01 o, int idx, ApSwBal_Chk01_FrR frR, MST_AP_D_R apDR) {
			
			ApSwBal_Chk01_BaseR baseR = getSwBaseR(frR);
			MAM_BP_R bspplR = getBpCache(apDR.bsppl_cd());
			MAM_BP_R spplR = getBpCache(apDR.sppl_cd());
			
			PayAct_Chk01_HdrR hdrR = o.up0().get(idx);
			hdrR.psppl_cd(bspplR.psppl_cd());
			hdrR.trd_cur_cd(apDR.trd_cur_cd());
			hdrR.xrate(getXRate(apDR));
			hdrR.ap_sttl_typ(baseR.ap_sttl_typ());
			hdrR.ap_sttl_cd(baseR.ap_sttl_cd());
			hdrR.trd_rmrks(baseR.trd_rmrks());
			hdrR.sub_char1(baseR.sub_char1());
			hdrR.sub_char2(baseR.sub_char2());
			hdrR.sub_char3(baseR.sub_char3());
			
			PayAct_Chk01_DtlR dtlR = o.up1().get(idx);
			dtlR.ap_d_no(apDR.ap_d_no());
			dtlR.ap_sttl_typ(baseR.ap_sttl_typ());
			dtlR.ap_sttl_cd(baseR.ap_sttl_cd());
			dtlR.ac_rsn_cd(baseR.ac_rsn_cd());
			
			MAM_ITM_R itmR =
				getItmCache(apDR.itm_cd(), apDR.itm_sub1(), apDR.itm_sub2(), apDR.itm_sub3());
			dtlR.trd_cur_amt(
				sum(apDR.trd_cur_amt(), apDR.trd_cur_tax_amt())
					.multiply(MAC_TRD_PTN_TYP.ap_amt_pm(apDR.trd_ptn_typ()))
					.multiply(MSBHL_ApUtil.getDscntItmPm(apDR.trd_ptn_typ(), itmR.dscnt_itm_flg()))
			);
			dtlR.base_cur_amt(null);	// 基準通貨金額は支払実績登録サービス内で計算する
			dtlR.base_cur_amt_not_calc_flg(false);
			
			dtlR.bsppl_cd(apDR.bsppl_cd());
			dtlR.bsppl_dpt_cd(apDR.bsppl_dpt_cd());
			dtlR.asppl_cd(apDR.asppl_cd());
			dtlR.ap_dpt_cd(apDR.ap_dpt_cd());
			if (MAC_TRD_PTN_TYP.isAPSW_IN_CHK(apDR.trd_ptn_typ())) {
				dtlR.purc_act_no(apDR.purc_act_no());
				dtlR.rcpt_iv_mng_no(apDR.rcpt_iv_mng_no());
				dtlR.rcpt_iv_no(apDR.rcpt_iv_no());
			}
			else if (spplR.sppl_iv_flg() && !isNullOrNullVal(apDR.rcpt_iv_mng_no())) {
				dtlR.purc_act_no(MAC_STR.NULL_VAL.value());
				dtlR.rcpt_iv_mng_no(apDR.rcpt_iv_mng_no());
				dtlR.rcpt_iv_no(apDR.rcpt_iv_no());
			}
			else if (!isSame(apDR.trd_cur_cd(), getBaseCur().cur_cd())) {
				dtlR.purc_act_no(apDR.purc_act_no());
				dtlR.rcpt_iv_mng_no(MAC_STR.NULL_VAL.value());
				dtlR.rcpt_iv_no(MAC_STR.NULL_VAL.value());
			}
			else {
				dtlR.purc_act_no(MAC_STR.NULL_VAL.value());
				dtlR.rcpt_iv_mng_no(MAC_STR.NULL_VAL.value());
				dtlR.rcpt_iv_no(MAC_STR.NULL_VAL.value());
			}
			dtlR.wrk_no(apDR.wrk_no());
			dtlR.ap_typ(apDR.ap_typ());
		}
		
		/**
		 * 支払実績登録サービスの電文を作成する（未照合残高振替受入）
		 */
		protected void makeSwInNotChk(MSBHL_PayActRegService.PayAct_Chk01 o, int idx, ApSwBal_Chk01_FrR frR, MST_PAY_ACT_D_R paDR) {
			
			ApSwBal_Chk01_ToR toR = getSwToR(frR);
			MST_PAY_ACT_R paR = getPayActCache(paDR.pay_act_no(), paDR.pay_act_seq());
			MAM_STTL_R sttlR = getSttlCacheByApSttlTyp(MAC_AP_STTL_TYP.APSW_IN_NOT_CHK.value());

			PayAct_Chk01_HdrR hdrR = o.up0().get(idx);
			hdrR.psppl_cd(toR.psppl_cd());
			hdrR.trd_cur_cd(paR.trd_cur_cd());
			hdrR.xrate(paR.xrate());
			hdrR.ap_sttl_typ(sttlR.ap_sttl_typ());
			hdrR.ap_sttl_cd(sttlR.sttl_cd());
			hdrR.par_pay_act_no(paR.pay_act_no());
			hdrR.par_pay_act_seq(paR.pay_act_seq());
			
			PayAct_Chk01_DtlR dtlR = o.up1().get(idx);
			dtlR.ap_sttl_typ(sttlR.ap_sttl_typ());
			dtlR.ap_sttl_cd(sttlR.sttl_cd());
			dtlR.ac_rsn_cd(sttlR.ac_rsn_cd());
			
			dtlR.trd_cur_amt(paDR.trd_cur_amt().negate());
			dtlR.base_cur_amt(paDR.base_cur_amt().negate());	// 振替元の基準通貨金額を使用する
			dtlR.base_cur_amt_not_calc_flg(true);
			
			dtlR.bsppl_cd(toR.bsppl_cd());
			dtlR.bsppl_dpt_cd(toR.bsppl_dpt_cd());
			dtlR.asppl_cd(toR.asppl_cd());
			dtlR.ap_dpt_cd(toR.ap_dpt_cd());
			dtlR.purc_act_no(paDR.purc_act_no());
			dtlR.rcpt_iv_mng_no(paDR.rcpt_iv_mng_no());
			dtlR.rcpt_iv_no(paDR.rcpt_iv_no());
			dtlR.wrk_no(frR.wrk_no());
			dtlR.ap_typ(paDR.ap_typ());
			dtlR.par_pay_act_d_no(paDR.pay_act_d_no());
			dtlR.par_pay_act_d_seq(paDR.pay_act_d_seq());
		}
		
		/**
		 * 為替レートを取得する
		 */
		protected MCNumber getXRate(ApSwBal_Chk01_FrR frR, MST_AP_APPL_SCHD_R applR) {
			MCList<MST_AP_D_R> apDL = getApDLCacheByPaySchd(frR.pay_schd_no(), applR.purc_act_no(), applR.rcpt_iv_mng_no());
			return getXRate(apDL);
		}
		protected MCNumber getXRate(MST_AP_D_R apDR) {
			MCList<MST_AP_D_R> apDL = MCList.create(MST_AP_D_R.class);
			apDL.add(apDR);
			return getXRate(apDL);
		}
		protected MCNumber getXRate(MCList<MST_AP_D_R> apDL) {
			MST_AP_D_R apDR = apDL.get(0);
			MST_AP_XRATE_REV_HIS_R xrtR = getXrateRevHisCache(
				apDR.asppl_cd(), apDR.ap_dpt_cd(), apDR.trd_cur_cd(),
				!isNullOrNullVal(apDR.rcpt_iv_mng_no()) ? MAC_STR.NULL_VAL.value() : apDR.purc_act_no(),
				!isNullOrNullVal(apDR.rcpt_iv_mng_no()) ? apDR.rcpt_iv_mng_no() : MAC_STR.NULL_VAL.value(),
				apDR.wrk_no(), apDR.ap_typ());
			
			MCRow row = MSBHL_ApUtil.getXRate(xrtR, apDL);
			return row.getNumber(MST_AP_D_R.$xrate);
		}
		
		/**
		 * 支払実績登録サービスの電文をまとめる
		 */
		protected void groupBySw(MSBHL_PayActRegService.PayAct_Chk01 o) {
			// 為替レートが同じヘッダを同一のヘッダにまとめる
			Map<MCNumber, PayAct_Chk01_HdrR> hdrPegMap = new HashMap<>();
			for (int i=0; i<o.up0().size(); i++) {
				PayAct_Chk01_HdrR hdrR = o.up0().get(i);
				if (!hdrPegMap.containsKey(hdrR.xrate())) {
					hdrPegMap.put(hdrR.xrate(), hdrR);
				}
				hdrR.hdr_peg_no(hdrPegMap.get(hdrR.xrate()).hdr_peg_no());
				o.up1().get(i).hdr_peg_no(hdrR.hdr_peg_no());		// ヘッダと明細が1対1の前提
			}
			o.up0().setAll(hdrPegMap.values());
			o.up0().sort(PayAct_Chk01_HdrR.$hdr_peg_no);
			o.up1().sort(PayAct_Chk01_DtlR.$hdr_peg_no, PayAct_Chk01_DtlR.$peg_no);
		}
		
		/**
		 * 支払予定を更新する
		 */
		protected void updPaySchd() {
			MCList<ApSwBal_Chk01_FrR> swChkL = up0().subList(r -> isSwChk(r));
			if (!swChkL.isEmpty()) {
				MST_PAY_SCHD_R dbc = MST_PAY_SCHD_R.create("T");
				MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
				builder.setSetVL(dbc.sw_flg, value(true));
				dbUpdateKey("MSBHL5130_MST_PAY_SCHD_U01", swChkL, builder);
			}
		}
		
		/**
		 * 買掛明細登録サービスを実行して以下を行う<br>
		 * <li>振替元の買掛明細を更新</li>
		 * <li>振替先の買掛明細を作成</li>
		 */
		protected void callApDServiceUpd03() {
			_apDUpd03 = MSBHL_ApDtlRegService.crtApDtl_Upd03();
			
			for (PayAct_Chk01_DtlR downR : _paDUpd01Out.down1()) {
				MST_PAY_ACT_D_R paDR = getPayActDCache(downR.pay_act_d_no(), downR.pay_act_d_seq());
				MST_PAY_ACT_R paR = getPayActCache(paDR.pay_act_no(), paDR.pay_act_seq());
				ApSwBal_Chk01_FrR frR = _paDMap.get(downR.peg_no().intValue());
				ApSwBal_Chk01_BaseR baseR = getSwBaseR(frR);
				ApSwBal_Chk01_ToR toR = getSwToR(frR);
			
				ApDtl_Chk01_DtlR upR = _apDUpd03.up0().add();
				upR.peg_no(frR.peg_no());
				upR.ap_d_no(frR.ap_d_no());
				upR.ap_appl_schd_no(paDR.ap_appl_schd_no());
				upR.xrate(paR.xrate());
				upR.trd_cur_amt(paDR.trd_cur_amt());
				upR.base_cur_amt(paDR.base_cur_amt());
				if (!baseR.sw_chk_flg()) {
					// 未照合振替の場合、値引品などは符号調整してあるのでもとに戻す
					MST_AP_D_R apDR = getApDCache(frR.ap_d_no());
					MAM_ITM_R itmR =
						getItmCache(apDR.itm_cd(), apDR.itm_sub1(), apDR.itm_sub2(), apDR.itm_sub3());
					MCNumber pm =
						MAC_TRD_PTN_TYP.ap_amt_pm(apDR.trd_ptn_typ())
							.multiply(MSBHL_ApUtil.getDscntItmPm(apDR.trd_ptn_typ(), itmR.dscnt_itm_flg()));
					upR.trd_cur_amt(upR.trd_cur_amt().multiply(pm));
					upR.base_cur_amt(upR.base_cur_amt().multiply(pm));
				}
				upR.act_dt(baseR.sw_dt());
				upR.ac_dt(baseR.ac_dt());
				if (!baseR.sw_chk_flg() && isNullAnd(baseR.pay_basis_dt(), baseR.pay_schd_dt())) {
					MST_AP_D_R apDR = getApDCache(frR.ap_d_no());
					upR.pay_basis_dt(apDR.pay_basis_dt());
					upR.pay_crryovr_times(apDR.pay_crryovr_times());
					upR.pay_schd_dt(apDR.pay_schd_dt());
				}
				else {
					upR.pay_basis_dt(baseR.pay_basis_dt());
					upR.pay_crryovr_times(baseR.pay_crryovr_times());
					upR.pay_schd_dt(baseR.pay_schd_dt());
				}
				upR.asppl_cd(toR.asppl_cd());
				upR.ap_dpt_cd(toR.ap_dpt_cd());
				upR.bsppl_cd(toR.bsppl_cd());
				upR.bsppl_dpt_cd(toR.bsppl_dpt_cd());
				upR.wrk_no(frR.wrk_no());
				upR.setAttributes(frR);
			}
			_apDUpd03.exec();
		}
		
		/**
		 * 振替伝票を発行する
		 */
		protected void prnt() {
			MSBHL_ApSwBalService.ApSwBal_Prnt01 prnt =  MSBHL_ApSwBalService.crtApSwBal_Prnt01();

			for (PayAct_Chk01_HdrR downR : _paDUpd01Out.down0()) {
				ApSwBal_Prnt01_CndR r = prnt.up0().add();
				r.pay_act_no(downR.pay_act_no());
				r.pay_act_seq(downR.pay_act_seq());
			}
			
			prnt.exec();
		}
		
		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			// 振替先の買掛明細ＮＯを下り電文に設定する
			MCIndexKey idx = up0().createIndex(ApSwBal_Chk01_FrR.$peg_no);
			for (ApDtl_Chk01_DtlR apDR : _apDUpd03.down0()) {
				ApSwBal_Chk01_FrR frR = up0().getFirst(idx, apDR.peg_no()), downR = down0().add();
				downR.hdr_peg_no(frR.hdr_peg_no());
				downR.peg_no(frR.peg_no());
				downR.to_ap_d_no(apDR.to_ap_d_no());
				downR.ap_appl_schd_no(apDR.ap_appl_schd_no());
				downR.pay_schd_no(frR.pay_schd_no());
				downR.ap_d_no(frR.ap_d_no());
				downR.setAttributes(frR);
			}
		}
	}

	/**
	 * ApSwBal_Prnt01オペレーション.<p>
	 *
	 * 振替伝票を発行する。<br>
	 */
	public class ApSwBal_Prnt01 extends MSBHL_ApSwBalService_MC_A.ApSwBal_Prnt01 {
		
		/**
		 * 新規発行対象
		 */
		protected MCList<ApSwBal_Prnt01_CndR> _crtPrntL;
		
		/**
		 * 再発行対象
		 */
		protected MCList<ApSwBal_Prnt01_CndR> _rePrntL;
		
		/** 
		 * 振替伝票ReportSetマップ
		 */
		protected Map<String, List<MSBHR_Sw>> _swReportMap;
		
		/** 
		 * 振替伝票再発行ReportSetマップ
		 */
		protected Map<List<String>, MCReportInfoR> _swReprntMap;
		
		protected MCList<BpUtil_Sprt01_DtlR> _bpUtil = MCList.create(BpUtil_Sprt01_DtlR.class);
		protected MCIndexKey _bpUtilkey;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			initPrnt();
			prnt();
			rePrnt();
			sendRequest();
		}
		
		/**
		 * 発行前処理
		 */
		protected void initPrnt() {
			
			_crtPrntL = MCList.create(ApSwBal_Prnt01_CndR.class);
			_rePrntL = MCList.create(ApSwBal_Prnt01_CndR.class);
			_swReportMap = new LinkedHashMap<String, List<MSBHR_Sw>>();
			_swReprntMap = new LinkedHashMap<List<String>, MCReportInfoR>();
			
			for (ApSwBal_Prnt01_CndR r : up0()) {
				if (r.reprnt_flg()) {
					_rePrntL.add(r);
				}
				else {
					_crtPrntL.add(r);
				}
			}
		}
		
		/**
		 * 振替伝票の新規発行データを取得する
		 */
		protected void prnt() {
			
			if (_crtPrntL.isEmpty()) {
				return;
			}
			
			// 印刷対象データを取得
			List<MCList<SwDtlR>> datLL = selectData();
			
			for (MCList<SwDtlR> datL : datLL) {
				
				// 印刷データを作成
				MSBHR_Sw rptSet = makePrntData(datL);
				
				// 印刷データの登録
				MCServerReportManager.request(rptSet, false);
				
				// 一括発行用のマップに設定する
				setSwMap(rptSet);
			}
		}
		
		/**
		 * 印刷対象データを取得する
		 */
		protected List<MCList<SwDtlR>> selectData() {
			MCList<MST_PAY_ACT_R> dbc = MCList.create(MST_PAY_ACT_R.class);
			_crtPrntL.forEach(r -> {
				MST_PAY_ACT_R dbcR = dbc.add();
				dbcR.pay_act_no(r.pay_act_no());
				dbcR.pay_act_seq(r.pay_act_seq());
			});
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MST_PAY_ACT_R.create("T"));
			dbWkDelete("MSBHL5130_MSW_PAY_ACT_D01", dbc_bldr.getBaseDbc());
			dbWkInsert("MSBHL5130_MSW_PAY_ACT_I01", dbc, dbc_bldr.getBaseDbc());
			
			MCList<SwDtlR> datL = MCList.create(SwDtlR.class);
			addDtlColumns(datL);
			
			executeQuery(datL, MSBHL5130_MST_PAY_ACT_S01());
			dbWkDelete("MSBHL5130_MSW_PAY_ACT_D02", dbc_bldr.getBaseDbc());
			
			// ヘッダごとにリスト化
			MCIndexKey idx = datL.createIndex(SwHdrR.$pay_act_no, SwHdrR.$pay_act_seq);
			List<MCList<SwDtlR>> arr = new ArrayList<>();
			for (ApSwBal_Prnt01_CndR r : _crtPrntL) {
				arr.add(datL.subList(idx, r.toArray(idx.getKeys())));
			}
			
			return arr;
		}
		
		/**
		 * 引数のコンテナに一時カラムを追加する
		 */
		protected void addDtlColumns(MCList<SwDtlR> datL) {
			for (mcframe.commonCore.meta.MCMeta meta : SwHdrR.colmetas()) {
				String name = meta.name();
				if (meta.type() == MCDataType.BOOLEAN) {
					datL.addBooleanColumn(name);
				}
				else if (meta.type() == MCDataType.NUMBER) {
					datL.addNumberColumn(name);
				}
				else if (meta.type() == MCDataType.DATE) {
					datL.addDateColumn(name);
				}
				else {
					datL.addStringColumn(name);
				}
			}
			datL.addNumberColumn(MAM_CUR_R.$amt_dec_place);
		}
		
		/**
		 * 印刷データを作成する
		 */
		protected MSBHR_Sw makePrntData(MCList<SwDtlR> datL) {
			MSBHR_Sw rptSet = MSBHR_Sw.create();
			
			// ヘッダ
			SwHdrR hdrR = SwHdrR.create();
			SwDtlR datR = datL.get(0);
			for (String col : SwHdrR.colnames()) {
				hdrR.setValue(col, datR.getValue(col));
			}
			hdrR.prnt_tm(MCDate.now());
			hdrR.ttl_trd_cur_amt(datL.sum(SwDtlR.$trd_cur_amt));
			if (datL.groupBy(SwHdrR.$wrk_no_to_data).size() > 1) {
				hdrR.setString(SwHdrR.$wrk_no_to_data, null);
				hdrR.setString(SwHdrR.$wrk_nm_to, null);
			}
			
			MAC_AP_STTL_TYP.putNameNE(hdrR, SwHdrR.$ap_sttl_typ, SwHdrR.$ap_sttl_typ_nm, getUsrLocale());
			putPrntStr(hdrR, SwHdrR.$wrk_no_to_view, SwHdrR.$wrk_no_to_data);
			putNumStr(rptSet, hdrR, SwHdrR.$s_xrate, SwHdrR.$xrate, datR.getNumber(MAM_CUR_R.$amt_dec_place));
			putNumStr(rptSet, hdrR, SwHdrR.$s_ttl_trd_cur_amt, SwHdrR.$ttl_trd_cur_amt, datR.getNumber(MAM_CUR_R.$amt_dec_place));
			rptSet.addRow(hdrR);
			
			// 明細
			MAC_AP_TYP.putNameNE(datL, SwDtlR.$ap_typ, SwDtlR.$ap_typ_nm, getUsrLocale());
			putPrntStr(datL, SwDtlR.$wrk_no_fr_view, SwDtlR.$wrk_no_fr_data);
			putPrntStr(datL, SwDtlR.$rcpt_iv_no_view, SwDtlR.$rcpt_iv_no_data);
			putPrntStr(datL, SwDtlR.$rcpt_iv_mng_no_view, SwDtlR.$rcpt_iv_mng_no_data);
			putPrntStr(datL, SwDtlR.$ap_d_no_fr_view, SwDtlR.$ap_d_no_fr_data);
			putPrntStr(datL, SwDtlR.$pay_schd_no_fr_view, SwDtlR.$pay_schd_no_fr_data);
			putPrntStr(datL, SwDtlR.$ap_appl_schd_no_fr_view, SwDtlR.$ap_appl_schd_no_fr_data);
			putPrntStr(datL, SwDtlR.$ap_d_no_to_view, SwDtlR.$ap_d_no_to_data);
			putNumStr(rptSet, datL, SwDtlR.$s_int_trd_cur_amt, SwDtlR.$s_dec_trd_cur_amt, SwDtlR.$trd_cur_amt, MAM_CUR_R.$amt_dec_place);
			rptSet.addAll(datL);
			
			// 業務情報
			rptSet.setAppTitle1(hdrR.report_title());
			rptSet.setAppReportNo1(hdrR.pay_act_no());
			rptSet.setAppReportNo2(hdrR.pay_act_rev().toString());
			rptSet.setAppReportNo3(hdrR.pay_act_seq().toString());
			rptSet.setAppUsrCd1(hdrR.pay_dpt_cd());
			rptSet.setAppUsrNm1(hdrR.pay_dpt_nm());
			rptSet.setAppUsrCd2(hdrR.pay_usr_cd());
			rptSet.setAppUsrNm2(hdrR.pay_usr_nm());
			rptSet.setAppUsrCd3(hdrR.ap_dpt_cd_to());
			rptSet.setAppUsrNm3(hdrR.ap_dpt_nm_to());
			rptSet.setAppUsrCd3(hdrR.bsppl_dpt_cd_to());
			rptSet.setAppUsrNm3(hdrR.bsppl_dpt_nm_to());
			rptSet.setAppToCd1(hdrR.bsppl_cd_to());
			rptSet.setAppToNm1(hdrR.bsppl_nm_to());
			rptSet.setAppToCd2(hdrR.asppl_cd_to());
			rptSet.setAppToNm2(hdrR.asppl_nm_to());
			rptSet.setAppToCd3(hdrR.bsppl_cd_fr());
			rptSet.setAppToNm3(hdrR.bsppl_nm_fr());
			
			return rptSet;
		}
		
		/**
		 * 振替伝票の再発行データを取得する
		 */
		protected void rePrnt() {
			
			if (_rePrntL.isEmpty()) {
				return;
			}
			
			for (ApSwBal_Prnt01_CndR r : _rePrntL) {
				MSBHR_Sw reportSet = MSBHR_Sw.create();
				reportSet.setAppReportNo1(r.pay_act_no());
				reportSet.setAppReportNo3(r.pay_act_seq().toString());
				
				MCList<MCReportInfoR> infoL = MCServerReportManager.searchPrintData(reportSet, false);
				if (!infoL.isEmpty()) {
					// 印刷データが取得できた場合は再印刷
					MSBHR_Sw repSetNew = (MSBHR_Sw) MCServerReportManager.toReportSet(infoL.get(0));
					List<MSBHR_Sw> l = _swReportMap.get(repSetNew.getAppToCd1());
					if (null == l) {
						l = new ArrayList<MSBHR_Sw>(Arrays.asList(new MSBHR_Sw[] {repSetNew}));
					}
					else {
						l.add(repSetNew);
					}
					_swReportMap.put(repSetNew.getAppToCd1(), l);
					_swReprntMap.put(Arrays.asList(new String[] {r.pay_act_no(), r.pay_act_seq().toString()}), infoL.get(0));
				}
			}
		}
		
		/**
		 * 一括発行用のマップに設定する
		 */
		protected void setSwMap(MSBHR_Sw rptSet) {
			MSBHR_Sw rs = MSBHR_Sw.create();
			List<MSBHR_Sw> list = _swReportMap.get(rptSet.getAppToCd1());
			if (list == null) {
				list = new ArrayList<MSBHR_Sw>();
				_swReportMap.put(rptSet.getAppToCd1(), list);
			}
			rs.addAll(rptSet.getAll());
			
			// 業務情報
			rs.setAppTitle1(rptSet.getAppTitle1());
			rs.setAppReportNo1(rptSet.getAppReportNo1());
			rs.setAppReportNo2(rptSet.getAppReportNo2());
			rs.setAppReportNo3(rptSet.getAppReportNo3());
			rs.setAppUsrCd1(rptSet.getAppUsrCd1());
			rs.setAppUsrNm1(rptSet.getAppUsrNm1());
			rs.setAppUsrCd2(rptSet.getAppUsrCd2());
			rs.setAppUsrNm2(rptSet.getAppUsrNm2());
			rs.setAppUsrCd3(rptSet.getAppUsrCd3());
			rs.setAppUsrNm3(rptSet.getAppUsrNm3());
			rs.setAppUsrCd3(rptSet.getAppUsrCd3());
			rs.setAppUsrNm3(rptSet.getAppUsrNm3());
			rs.setAppToCd1(rptSet.getAppToCd1());
			rs.setAppToNm1(rptSet.getAppToNm1());
			rs.setAppToCd2(rptSet.getAppToCd2());
			rs.setAppToNm2(rptSet.getAppToNm2());
			rs.setAppToCd3(rptSet.getAppToCd3());
			rs.setAppToNm3(rptSet.getAppToNm3());
			
			list.add(rs);
		}
		
		/**
		 * 印刷処理をリクエストする
		 */
		protected void sendRequest() {
			if (_swReportMap == null || _swReportMap.size() == 0) {
				return;
			}
			// 画面の個別発行フラグがオフの場合
			if (!up1().indiv_prnt_flg()) {
				// 個別発行フラグ取得処理
				getIndivPrnt();
			}
			
			// ソート処理
			_swReportMap = swMapSort(_swReportMap);
			
			for (Map.Entry<String, List<MSBHR_Sw>> en : _swReportMap.entrySet()) {
				MCReportInfoR swReprntInfo = null;
				MCReportSet allSwRs = null;
				boolean isSwInit = false;
				boolean indivPrntFlg = false;
				
				if (!up1().indiv_prnt_flg()) {
					BpUtil_Sprt01_DtlR bpR = _bpUtil.getFirst(_bpUtilkey, en.getKey());
					indivPrntFlg = bpR.indiv_prnt_flg();
				}
				
				if (up1().indiv_prnt_flg() || indivPrntFlg) {
					// 個別発行
					String oldSw = null;
					for (MSBHR_Sw sw : en.getValue()) {
						if(isSame(sw.getAppReportNo1(), oldSw)) {
							allSwRs.addAll(sw.getAll());
						}
						else {
							if (allSwRs != null) {
								allSwRs.setRegister(false);
								MCServerReportManager.request(allSwRs);
							}
							swReprntInfo = getSwReprntInfo(sw);
							if (isNull(swReprntInfo)) {
								allSwRs = sw.createInstance();
								allSwRs.setLocale(sw.getLocale());
								allSwRs.addAll(sw.getAll());
								oldSw = sw.getAppReportNo1();
							}
							else {
								allSwRs = null;
								MCServerReportManager.reprint(swReprntInfo);
							}
						}
					}
					if (allSwRs != null ) {
						allSwRs.setRegister(false);	
						MCServerReportManager.request(allSwRs);
					}
				}
				else {
					// まとめ発行
					for (MSBHR_Sw sw : en.getValue()) {
						if (!isSwInit) {
							allSwRs = sw.createInstance();
							allSwRs.setLocale(sw.getLocale());
							isSwInit = true;
						}
						swReprntInfo = getSwReprntInfo(sw);
						if (isNull(swReprntInfo)) {
							allSwRs.addAll(sw.getAll());
						}
					}
					if (allSwRs.size() != 0) {
						MCServerReportManager.request(allSwRs);
					}
					for (Map.Entry<List<String>, MCReportInfoR> reprntSw : _swReprntMap.entrySet()) {
						if(isSame(reprntSw.getValue().app_to_cd1(), en.getKey())) {
							MCServerReportManager.reprint(reprntSw.getValue());
						}
					}
				}
			}
		}

		protected MCReportInfoR getSwReprntInfo(MSBHR_Sw sw) {
			MCReportInfoR info = sw.getReportInfo();
			return _swReprntMap.get(Arrays.asList(new String[] { info.app_report_no1(), info.app_report_no3() }));
		}
		
		
		/**
		 * 個別発行取得の呼び出し
		 */
		protected void getIndivPrnt() {
			// 支払実績ＮＯと支払実績連番から支払予定管理先を検索→支払予定管理先を個別発行処理に連携→フラグ取得
			// 支払実績明細の取得
			MCList<MST_PAY_ACT_D_R> payActDL = MCList.create(MST_PAY_ACT_D_R.class);
			MST_PAY_ACT_D_R t = MST_PAY_ACT_D_R.create("T");
			MST_PAY_ACT_D_R t2 = MST_PAY_ACT_D_R.create("T2");
			MCQueryApiBuilder payActDL_bldr = MCQueryApiBuilder.create(t);
			payActDL_bldr.setSelect(t2.bsppl_cd);
			payActDL_bldr.addInnerJoin(t2, t.pay_act_d_no.eq(t2.par_pay_act_d_no)
					.and(t.pay_act_d_seq.eq(t2.par_pay_act_d_seq)));
			payActDL_bldr.setWhere(t.pay_act_no.eq(bind("pay_act_no")));
			payActDL_bldr.addWhereWithAnd(t.pay_act_seq.eq(bind("pay_act_seq")));
			dbSelect("MSBHL5130_MST_PAY_ACT_D_S01", payActDL, payActDL_bldr, up0());
			
			MSUCL_BpUtil.BpUtil_Sprt01 ope = MSUCL_BpUtil.crtBpUtil_Sprt01();
			ope.up0().bp_typ(MAC_BP_IS_SRCH_TYP.BSPPL.value());
			for (MST_PAY_ACT_D_R payActDR : payActDL.groupBy(MST_PAY_ACT_D_R.$bsppl_cd)) {
				BpUtil_Sprt01_DtlR dtlR = BpUtil_Sprt01_DtlR.create();
				dtlR.bp_cd(payActDR.bsppl_cd());
				ope.up1().add(dtlR);
			}
			ope.exec();
			
			_bpUtil = ope.down0();
			_bpUtilkey = _bpUtil.createIndex(BpUtil_Sprt01_DtlR.$bp_cd);
		}
		
		/**
		 * 振替伝票ソート
		 * @param map
		 * @return
		 */
		protected Map<String, List<MSBHR_Sw>> swMapSort(Map<String, List<MSBHR_Sw>> map) {
			// 振替伝票ReportSetマップソート（支払予定管理先順）
			List<Entry<String, List<MSBHR_Sw>>> entries = new ArrayList<Entry<String, List<MSBHR_Sw>>>(map.entrySet());
			Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
			
			LinkedHashMap<String, List<MSBHR_Sw>> result = new LinkedHashMap<>();
			for (Map.Entry<String, List<MSBHR_Sw>> entry : entries) {
				result.put(entry.getKey(), entry.getValue());
			}
			
			return result;
		}
	}

	/**
	 * 残高振替の対象が、照合済か未照合を判定する
	 */
	protected boolean isSwChk(ApSwBal_Chk01_FrR r) {
		ApSwBal_Chk01_BaseR baseR = getSwBaseR(r); 
		if (baseR.sw_chk_flg()) {
			return true;
		}
		return false;
	}


// ----- Joinキー
	/**
	 * FrR から BaseR を特定するキー
	 */
	protected MCJoinKey<MCList<ApSwBal_Chk01_BaseR>> _fr2BaseJk;
	/**
	 * FrR から ToR を特定するキー
	 */
	protected MCJoinKey<MCList<ApSwBal_Chk01_ToR>> _fr2ToJk;
	/**
	 * ToR から BaseR を特定するキー
	 */
	protected MCJoinKey<MCList<ApSwBal_Chk01_BaseR>> _to2BaseJk;
	
	/**
	 * 振替元、振替、振替先を紐付けるキーを生成する
	 */
	protected void crtJk(
		MCList<ApSwBal_Chk01_FrR> up0, MCList<ApSwBal_Chk01_BaseR> up1, MCList<ApSwBal_Chk01_ToR> up2) {
		_fr2BaseJk =
			up0.join(ApSwBal_Chk01_FrR.$hdr_peg_no, up1, ApSwBal_Chk01_BaseR.$hdr_peg_no);
		_fr2ToJk =
			up0.join(ApSwBal_Chk01_FrR.$hdr_peg_no, up2, ApSwBal_Chk01_ToR.$hdr_peg_no);
		_to2BaseJk =
			up2.join(ApSwBal_Chk01_ToR.$hdr_peg_no, up1, ApSwBal_Chk01_BaseR.$hdr_peg_no);
	}
	
	/**
	 * 振替元から対応する振替情報を取得する
	 */
	protected ApSwBal_Chk01_BaseR getSwBaseR(ApSwBal_Chk01_FrR frR) {
			return frR.getJoinedRow(_fr2BaseJk);
	}

	/**
	 * 振替元から対応する振替情報を取得する
	 */
	protected ApSwBal_Chk01_BaseR getSwBaseR(ApSwBal_Chk01_ToR toR) {
			return toR.getJoinedRow(_to2BaseJk);
	}
	
	/**
	 * 振替元から対応する振替先を取得する
	 */
	protected ApSwBal_Chk01_ToR getSwToR(ApSwBal_Chk01_FrR frR) {
			return frR.getJoinedRow(_fr2ToJk);
	}


// ----- キャッシュ
	/**
	 * キャッシュの初期化
	 */
	protected void initCache(MCList<ApSwBal_Chk01_FrR> upFrL) {
		// 必須チェック前なので支払予定ＮＯ、買掛明細ＮＯがNULLである考慮が必要
		
		MCList<ApSwBal_Chk01_FrR> psL = upFrL.subList(r -> isSwChk(r));
		
		// 買掛消込予定をキャッシュ
		initApApplSchdCache(psL);
		
		// 支払予定をキャッシュ
		initPaySchdCache(psL);
		
		// 支払照合をキャッシュ
		psL.forEach(r -> {
			if (!isNull(r.pay_schd_no())) {
				MST_PAY_SCHD_R dbcR = getPaySchdCache(r.pay_schd_no());
				r.pay_chk_mng_no(dbcR.pay_chk_mng_no());
			}
		});
		initPayChkCache(psL.groupBy(ApSwBal_Chk01_FrR.$pay_chk_mng_no));
		
		// 買掛明細をキャッシュ
		initApDCache(upFrL);
		
		// 為替レート評価替をキャッシュ
		initXrateRevHisCache(upFrL);
		
		// 品目マスタをキャッシュ
		initItmCache(upFrL);
	}

	/**
	 * 買掛明細キャッシュ
	 */
	protected FXUCL_Cache<MST_AP_D_R> _apDCache;
	protected FXUCL_Cache<MCList<MST_AP_D_R>> _apDCacheByPaySchd;
	protected void initApDCache(MCList<ApSwBal_Chk01_FrR> upFrL) {
		MCList<ApSwBal_Chk01_FrR>
			apDL = MCList.create(ApSwBal_Chk01_FrR.class),
			psL = MCList.create(ApSwBal_Chk01_FrR.class);
		
		for (ApSwBal_Chk01_FrR upFrR : upFrL) {
			if (isSwChk(upFrR)) {
				psL.add(upFrR);
			}
			else {
				apDL.add(upFrR);
			}
		}

		if (!apDL.isEmpty()) {
			apDL.sort(ApSwBal_Chk01_FrR.$ap_d_no);
			
			MCList<MST_AP_D_R> dbc = MCList.create(MST_AP_D_R.class);
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MST_AP_D_R.create("T"));
			dbc_bldr.setOrderByAsc(dbc_bldr.getBaseDbc().getKeyColumn$());
			dbSelectKeyForUpdateNoWait("MSBHL5130_MST_AP_D_S01", dbc, dbc_bldr, apDL);
			
			object(CLAZZ)._apDCache = new FXUCL_Cache<>();
			object(CLAZZ)._apDCache.setFixMaxCacheSize(-1);
			for (MST_AP_D_R r : dbc) {
				Comparable<?>[] key = r.toArray(MST_AP_D_R.$ap_d_no);
				object(CLAZZ)._apDCache.putCache(key, r);
			}
		}
		if (!psL.isEmpty()) {
			MCList<ApSwBal_Chk01_FrR> chkGrpL =
				psL.groupBy(ApSwBal_Chk01_FrR.$pay_chk_mng_no).subList(r -> !isNull(r.pay_chk_mng_no()));
			MCList<MST_AP_D_R> dbc = MCList.create(MST_AP_D_R.class);
			MST_AP_D_R t = MST_AP_D_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setWhere(t.pay_chk_mng_no.eq(bind("pay_chk_mng_no")));
			dbSelect("MSBHL5130_MST_AP_D_S02", dbc, dbc_bldr, chkGrpL);
			
			// 支払予定と買掛明細を紐付ける項目
			MCIndexKey idx = dbc.createIndex(MST_AP_D_R.$pay_chk_mng_no,
					MST_AP_D_R.$asppl_cd, MST_AP_D_R.$ap_dpt_cd, MST_AP_D_R.$ap_typ);
			
			object(CLAZZ)._apDCacheByPaySchd = new FXUCL_Cache<>();
			object(CLAZZ)._apDCacheByPaySchd.setFixMaxCacheSize(-1);
			for (ApSwBal_Chk01_FrR grp : chkGrpL) {
				for (MST_PAY_SCHD_R psR : getPaySchdCacheByPayChk(grp.pay_chk_mng_no())) {
					Comparable<?>[] key = psR.toArray(ApSwBal_Chk01_FrR.$pay_schd_no);
					MCList<MST_AP_D_R> subDbc = dbc.subList(idx, psR.toArray(idx.getKeys()));
					subDbc.sort(MST_AP_D_R.$ap_d_no);
					object(CLAZZ)._apDCacheByPaySchd.putCache(key, subDbc);
				}
			}
		}
	}
	public static MST_AP_D_R getApDCache(String apDNo) {
		return object(CLAZZ)._apDCache.getCache(apDNo);
	}
	public static MCList<MST_AP_D_R> getApDCacheByPaySchd(String paySchdNo) {
		return object(CLAZZ)._apDCacheByPaySchd.getCache(paySchdNo);
	}
	public static MST_AP_D_R getApDCacheByPaySchd(String paySchdNo, String purcActNo, String rcptIvMngNo) {
		MCList<MST_AP_D_R> l = object(CLAZZ)._apDCacheByPaySchd.getCache(paySchdNo);
		// 同一仕入内、または同一インボイス内の最新の買掛明細を取得する
		l.sort(SortType.DESC, MST_AP_D_R.$ap_d_no);
		if (!isNullOrNullVal(rcptIvMngNo)) {
			return l.getFirst(MST_AP_D_R.$rcpt_iv_mng_no, rcptIvMngNo);
		}
		else if (!isNullOrNullVal(purcActNo)) {
			return l.getFirst(MST_AP_D_R.$purc_act_no, purcActNo);
		}
		else if (!l.isEmpty()) {
			return l.get(0);
		}
		return null;
	}
	public static MCList<MST_AP_D_R> getApDLCacheByPaySchd(String paySchdNo, String purcActNo, String rcptIvMngNo) {
		MCList<MST_AP_D_R> l = object(CLAZZ)._apDCacheByPaySchd.getCache(paySchdNo);
		// 同一仕入内、または同一インボイス内の最新の買掛明細を取得する
		if (!isNullOrNullVal(rcptIvMngNo)) {
			return l.subList(MST_AP_D_R.$rcpt_iv_mng_no, rcptIvMngNo);
		}
		else if (!isNullOrNullVal(purcActNo)) {
			return l.subList(MST_AP_D_R.$purc_act_no, purcActNo);
		}
		return l;
	}

	/**
	 * 買掛消込予定キャッシュ
	 */
	protected FXUCL_Cache<MST_AP_APPL_SCHD_R> _apApplSchdCache;
	protected FXUCL_Cache<MCList<MST_AP_APPL_SCHD_R>> _apApplSchdCacheByPaySchd;
	protected void initApApplSchdCache(MCList<ApSwBal_Chk01_FrR> cndL) {
		MCList<MST_AP_APPL_SCHD_R> dbc = MCList.create(MST_AP_APPL_SCHD_R.class);
		MST_AP_APPL_SCHD_R t = MST_AP_APPL_SCHD_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setWhere(t.pay_schd_no.eq(bind("pay_schd_no")));
		dbSelect("MSBHL5130_MST_AP_APPL_SCHD_S01", dbc, dbc_bldr, cndL);
		
		object(CLAZZ)._apApplSchdCache = new FXUCL_Cache<>();
		object(CLAZZ)._apApplSchdCache.setFixMaxCacheSize(-1);
		for (MST_AP_APPL_SCHD_R r : dbc) {
			Comparable<?>[] key = r.toArray(MST_AP_APPL_SCHD_R.$ap_appl_schd_no);
			object(CLAZZ)._apApplSchdCache.putCache(key, r);
		}
		
		object(CLAZZ)._apApplSchdCacheByPaySchd = new FXUCL_Cache<>();
		object(CLAZZ)._apApplSchdCacheByPaySchd.setFixMaxCacheSize(-1);
		for (MCList<MST_AP_APPL_SCHD_R> l : dbc.groupList(MST_AP_APPL_SCHD_R.$pay_schd_no)) {
			Comparable<?>[] key = l.get(0).toArray(MST_AP_APPL_SCHD_R.$pay_schd_no);
			object(CLAZZ)._apApplSchdCacheByPaySchd.putCache(key, l);
		}
	}
	public static MST_AP_APPL_SCHD_R getApApplSchdCache(String apApplSchdNo) {
		return object(CLAZZ)._apApplSchdCache.getCache(apApplSchdNo);
	}
	protected MCList<MST_AP_APPL_SCHD_R> getApApplSchdCacheByPaySchd(String paySchdNo) {
		return object(CLAZZ)._apApplSchdCacheByPaySchd.getCache(paySchdNo);
	}

	/**
	 * 支払予定キャッシュ
	 */
	protected FXUCL_MCDbcCache<MST_PAY_SCHD_R> _paySchdCache;
	protected FXUCL_Cache<MCList<MST_PAY_SCHD_R>> _paySchdCacheByPayChk;
	protected void initPaySchdCache(MCList<ApSwBal_Chk01_FrR> cndL) {
		MCList<MST_PAY_SCHD_R> dbc = MCList.create(MST_PAY_SCHD_R.class);
		MST_PAY_SCHD_R t = MST_PAY_SCHD_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		object(CLAZZ)._paySchdCache = new FXUCL_MCDbcCache<MST_PAY_SCHD_R>(dbc, dbc_bldr, cndL, ApSwBal_Chk01_FrR.$pay_schd_no);
		
		dbc_bldr.setWhere(t.pay_chk_mng_no.eq(bind("pay_chk_mng_no")));
		dbSelect("MSBHL5130_MST_PAY_SCHD_S01", dbc, dbc_bldr, dbc.groupBy(MST_PAY_SCHD_R.$pay_chk_mng_no));
		object(CLAZZ)._paySchdCacheByPayChk = new FXUCL_Cache<>();
		object(CLAZZ)._paySchdCacheByPayChk.setFixMaxCacheSize(-1);
		for (MCList<MST_PAY_SCHD_R> l : dbc.groupList(MST_PAY_SCHD_R.$pay_chk_mng_no)) {
			Comparable<?>[] key = l.get(0).toArray(MST_PAY_SCHD_R.$pay_chk_mng_no);
			object(CLAZZ)._paySchdCacheByPayChk.putCache(key, l);
		}
	}
	public static MST_PAY_SCHD_R getPaySchdCache(String paySchdNo) {
		return object(CLAZZ)._paySchdCache.get(paySchdNo);
	}
	protected MCList<MST_PAY_SCHD_R> getPaySchdCacheByPayChk(String payChkmngNo) {
		return object(CLAZZ)._paySchdCacheByPayChk.getCache(payChkmngNo);
	}

	/**
	 * 支払照合キャッシュ
	 */
	protected FXUCL_Cache<MST_PAY_CHK_R> _payChkCache;
	protected void initPayChkCache(MCList<ApSwBal_Chk01_FrR> cndL) {
		cndL.sort(ApSwBal_Chk01_FrR.$pay_chk_mng_no);
		
		MCList<MST_PAY_CHK_R> dbc = MCList.create(MST_PAY_CHK_R.class);
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MST_PAY_CHK_R.create("T"));
		dbc_bldr.setOrderByAsc(dbc_bldr.getBaseDbc().getKeyColumn$());
		dbSelectKeyForUpdateNoWait("MSBHL5130_MST_PAY_CHK_S01", dbc, dbc_bldr, cndL);
		
		object(CLAZZ)._payChkCache = new FXUCL_Cache<>();
		object(CLAZZ)._payChkCache.setFixMaxCacheSize(-1);
		for (MST_PAY_CHK_R r : dbc) {
			Comparable<?>[] key = r.toArray(MST_PAY_CHK_R.$pay_chk_mng_no);
			object(CLAZZ)._payChkCache.putCache(key, r);
		}
	}
	public static MST_PAY_CHK_R getPayChkCache(String payChkMngNo) {
		return object(CLAZZ)._payChkCache.getCache(payChkMngNo);
	}

	/**
	 * 案件キャッシュ
	 */
	protected FXUCL_MCDbcCache<MST_WRK_R> _wrkCache;
	protected MST_WRK_R getWrkCache(String wrkNo) {
		if (object(CLAZZ)._wrkCache == null) {
			object(CLAZZ)._wrkCache = new FXUCL_MCDbcCache<>(MCQueryApiBuilder.create(MST_WRK_R.create("T")));
		}
		return object(CLAZZ)._wrkCache.get(wrkNo);
	}

	/**
	 * 支払実績キャッシュ
	 */
	protected FXUCL_MCDbcCache<MST_PAY_ACT_R> _payActCache;
	protected void initPayActCache(MCList<PayAct_Chk01_HdrR> cndL) {
		object(CLAZZ)._payActCache = new FXUCL_MCDbcCache<MST_PAY_ACT_R>(
			MCQueryApiBuilder.create(MST_PAY_ACT_R.create("T")), cndL, PayAct_Chk01_HdrR.$pay_act_no, PayAct_Chk01_HdrR.$pay_act_seq);
	}
	protected MST_PAY_ACT_R getPayActCache(String payActNo, MCNumber payActSeq) {
		return object(CLAZZ)._payActCache.get(payActNo, payActSeq);
	}

	/**
	 * 支払実績明細キャッシュ
	 */
	protected FXUCL_MCDbcCache<MST_PAY_ACT_D_R> _payActDCache;
	protected void initPayActDCache(MCList<PayAct_Chk01_DtlR> cndL) {
		object(CLAZZ)._payActDCache = new FXUCL_MCDbcCache<MST_PAY_ACT_D_R>(
			MCQueryApiBuilder.create(MST_PAY_ACT_D_R.create("T")), cndL, PayAct_Chk01_DtlR.$pay_act_d_no, PayAct_Chk01_DtlR.$pay_act_d_seq);
	}
	protected MST_PAY_ACT_D_R getPayActDCache(String payActDNo, MCNumber payActDSeq) {
		return object(CLAZZ)._payActDCache.get(payActDNo, payActDSeq);
	}

	/**
	 * 為替評価替レート履歴キャッシュ
	 */
	protected FXUCL_Cache<MST_AP_XRATE_REV_HIS_R> _xrateRevHisCache;
	protected void initXrateRevHisCache(MCList<ApSwBal_Chk01_FrR> upFrL) {
		
		// 月次買掛残高テーブルのワークを利用する
		MCList<MST_MLY_AP_BAL_R> dbcWk = MCList.create(MST_MLY_AP_BAL_R.class);
		for (ApSwBal_Chk01_FrR r : upFrL) {
			if (isSwChk(r)) {
				if (!isNull(r.pay_schd_no())) {
					MST_PAY_SCHD_R psR = getPaySchdCache(r.pay_schd_no());
					MST_PAY_CHK_R pcR = getPayChkCache(psR.pay_chk_mng_no());
					for (MST_AP_APPL_SCHD_R applR : getApApplSchdCacheByPaySchd(r.pay_schd_no())) {
						MST_MLY_AP_BAL_R dbcR = dbcWk.add();
						// 計上年月は使用しない
						dbcR.asppl_cd(psR.asppl_cd());
						dbcR.ap_dpt_cd(psR.ap_dpt_cd());
						dbcR.trd_cur_cd(pcR.trd_cur_cd());
						dbcR.purc_act_no(applR.purc_act_no());
						dbcR.rcpt_iv_mng_no(applR.rcpt_iv_mng_no());
						dbcR.wrk_no(pcR.wrk_no());
						dbcR.ap_typ(psR.ap_typ());
					}
				}
			}
			else {
				if (!isNull(r.ap_d_no())) {
					MST_AP_D_R apDR = getApDCache(r.ap_d_no());
					MST_MLY_AP_BAL_R dbcR = dbcWk.add();
					dbcR.asppl_cd(apDR.asppl_cd());
					dbcR.ap_dpt_cd(apDR.ap_dpt_cd());
					dbcR.trd_cur_cd(apDR.trd_cur_cd());
					if (!isNullOrNullVal(apDR.rcpt_iv_mng_no())) {
						dbcR.purc_act_no(MAC_STR.NULL_VAL.value());
						dbcR.rcpt_iv_mng_no(apDR.rcpt_iv_mng_no());
					}
					else {
						dbcR.purc_act_no(apDR.purc_act_no());
						dbcR.rcpt_iv_mng_no(MAC_STR.NULL_VAL.value());
					}
					dbcR.wrk_no(apDR.wrk_no());
					dbcR.ap_typ(apDR.ap_typ());
				}
			}
		}
		MCQueryApiBuilder dbcWk_bldr = MCQueryApiBuilder.create(MST_MLY_AP_BAL_R.create("T"));
		dbWkDelete("MSBHL5130_MSW_MLY_AP_BAL_D01", dbcWk_bldr.getBaseDbc());
		dbWkInsert("MSBHL5130_MSW_MLY_AP_BAL_I01", dbcWk, dbcWk_bldr.getBaseDbc());

		MCList<MST_AP_XRATE_REV_HIS_R> dbc = MCList.create(MST_AP_XRATE_REV_HIS_R.class);
		MST_AP_XRATE_REV_HIS_R dbc_t = MST_AP_XRATE_REV_HIS_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(dbc_t);
		MSW_MLY_AP_BAL_KEY_R w1 = MSW_MLY_AP_BAL_KEY_R.create("W1");
		dbc_bldr.setSelect(dbc_t.ap_xrate_rev_his_no, dbc_t.ac_ym, dbc_t.asppl_cd,
				dbc_t.ap_dpt_cd, dbc_t.trd_cur_cd, dbc_t.purc_act_no,
				dbc_t.rcpt_iv_mng_no, dbc_t.wrk_no, dbc_t.ap_typ, dbc_t.new_xrate);
		dbc_bldr.addInnerJoin(w1, bracket(w1.asppl_cd.eq(dbc_t.asppl_cd)
				.and(w1.ap_dpt_cd.eq(dbc_t.ap_dpt_cd))
				.and(w1.trd_cur_cd.eq(dbc_t.trd_cur_cd))
				.and(w1.purc_act_no.eq(dbc_t.purc_act_no))
				.and(w1.rcpt_iv_mng_no.eq(dbc_t.rcpt_iv_mng_no))
				.and(w1.wrk_no.eq(dbc_t.wrk_no))
				.and(w1.ap_typ.eq(dbc_t.ap_typ))));
		dbSelect("MSBHL5130_MST_AP_XRATE_REV_HIS_S01", dbc, dbc_bldr);
		dbWkDelete("MSBHL5130_MSW_MLY_AP_BAL_D02", dbcWk_bldr.getBaseDbc());
		
		object(CLAZZ)._xrateRevHisCache = new FXUCL_Cache<>();
		object(CLAZZ)._xrateRevHisCache.setFixMaxCacheSize(-1);
		String[] keyCols = {
			MST_AP_XRATE_REV_HIS_R.$asppl_cd,
			MST_AP_XRATE_REV_HIS_R.$ap_dpt_cd,
			MST_AP_XRATE_REV_HIS_R.$trd_cur_cd,
			MST_AP_XRATE_REV_HIS_R.$purc_act_no,
			MST_AP_XRATE_REV_HIS_R.$rcpt_iv_mng_no,
			MST_AP_XRATE_REV_HIS_R.$wrk_no,
			MST_AP_XRATE_REV_HIS_R.$ap_typ,
		};
		for (MCList<MST_AP_XRATE_REV_HIS_R> l : dbc.groupList(keyCols)) {
			l.sort(SortType.DESC, MST_AP_XRATE_REV_HIS_R.$ap_xrate_rev_his_no);
			Comparable<?>[] key = l.get(0).toArray(keyCols);
			object(CLAZZ)._xrateRevHisCache.putCache(key, l.get(0));
		}
	}
	public static MST_AP_XRATE_REV_HIS_R getXrateRevHisCache(
		String aspplCd, String apDptCd, String trdCurCd, String PurcActNo, String rcptIvMngNo, String wrkNo, String apTyp) {
		return object(CLAZZ)._xrateRevHisCache.getCache(aspplCd, apDptCd, trdCurCd, PurcActNo, rcptIvMngNo, wrkNo, apTyp);
	}

	/**
	 * 品目マスタキャッシュ
	 */
	protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache;
	protected void initItmCache(MCList<ApSwBal_Chk01_FrR> cndL) {
		MCList<MST_AP_D_R> apDL = MCList.create(MST_AP_D_R.class);
		for (ApSwBal_Chk01_FrR r : cndL) {
			if (!isNull(r.pay_schd_no())) {
				apDL.addAll(getApDCacheByPaySchd(r.pay_schd_no()));
			}
			if (!isNull(r.ap_d_no())) {
				apDL.add(getApDCache(r.ap_d_no()));
			}
		}
		object(CLAZZ)._itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(
			MCQueryApiBuilder.create(MAM_ITM_R.create("T")), apDL, MST_AP_D_R.$itm_cd, MST_AP_D_R.$itm_sub1, MST_AP_D_R.$itm_sub2, MST_AP_D_R.$itm_sub3);
	}
	protected MAM_ITM_R getItmCache(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
		return object(CLAZZ)._itmCache.get(itmCd, itmSub1, itmSub2, itmSub3);
	}

	/**
	 * 取引先マスタキャッシュ
	 */
	protected FXUCL_MCDbcCache<MAM_BP_R> _bpCache;
	protected MAM_BP_R getBpCache(String bpCd) {
		if (object(CLAZZ)._bpCache == null) {
			object(CLAZZ)._bpCache = new FXUCL_MCDbcCache<>(MCQueryApiBuilder.create(MAM_BP_R.create("T")));
		}
		return object(CLAZZ)._bpCache.get(bpCd);
	}

	/**
	 * 決済方法マスタキャッシュ
	 */
	protected FXUCL_Cache<MAM_STTL_R> _sttlCacheByApSttlTyp;
	protected MAM_STTL_R getSttlCacheByApSttlTyp(String apSttlTyp) {
		if (object(CLAZZ)._sttlCacheByApSttlTyp == null) {
			object(CLAZZ)._sttlCacheByApSttlTyp = new FXUCL_Cache<>();
			object(CLAZZ)._sttlCacheByApSttlTyp.setFixMaxCacheSize(-1);
		}
		MAM_STTL_R r = object(CLAZZ)._sttlCacheByApSttlTyp.getCache(apSttlTyp);
		if (isNull(r)) {
			MCList<MAM_STTL_R> dbc = MCList.create(MAM_STTL_R.class);
			MAM_STTL_R t = MAM_STTL_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setWhere(t.ap_sttl_flg.eq(value(true)));
			dbc_bldr.addWhereWithAnd(t.ap_sttl_typ.eq(bind("1")), apSttlTyp);
			dbc_bldr.setOrderByAsc(dbc_bldr.getBaseDbc().getKeyColumn$());
			dbSelect("MSBHL5130_MAM_STTL_S01", dbc, dbc_bldr);
			
			Comparable<?>[] key = new Comparable<?>[]{apSttlTyp};
			object(CLAZZ)._sttlCacheByApSttlTyp.putCache(key, dbc.isEmpty() ? MAM_STTL_R.create() : dbc.get(0));
		}
		return object(CLAZZ)._sttlCacheByApSttlTyp.getCache(apSttlTyp);
	}

	/**
	 * 会計理由マスタキャッシュ
	 */
	protected FXUCL_MCDbcCache<MAM_AC_RSN_R> _apRsnCache;
	protected MAM_AC_RSN_R getAcRsnCache(String acRsnCd) {
		if (object(CLAZZ)._apRsnCache == null) {
			object(CLAZZ)._apRsnCache = new FXUCL_MCDbcCache<>(MCQueryApiBuilder.create(MAM_AC_RSN_R.create("T")));
		}
		return object(CLAZZ)._apRsnCache.get(acRsnCd);
	}

	//FMCB CUSTOM END
}