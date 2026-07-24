package mcframe.serverMSBE.MSBEL5540;

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
import mcframe.serverMS.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMAUC.MAUCL5020.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL5540.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_Cache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import static mcframe.commonMA.notice.MA_Msg.MAUAL0058;
import mcframe.serverMBBA.MBBAL5010.*;
import mcframe.serverMSBB.MSBBL6010.*;
import mcframe.serverMSBB.MSBBL6080.*;
import mcframe.serverMSBB.MSBBL6220.*;
import mcframe.serverMSBD.MSBDL5190.*;
import mcframe.serverMSBE.MSBEL5010.*;
import mcframe.serverMSBE.MSBEL5260.*;
import mcframe.serverMSBE.MSBEL5270.*;
import mcframe.serverMSBE.MSBEL5500.*;
import mcframe.serverMSBE.MSBEL5520.*;
import mcframe.serverMSBE.MSBEL5530.*;
import mcframe.serverMSBE.MSBEL5550.*;
import mcframe.serverMSBE.MSBEL5710.*;
import mcframe.serverMSBE.MSBEL5730.*;
import mcframe.serverMSBG.MSBGL5080.*;
import mcframe.serverMSBE.MSBEL5900.*;
import mcframe.serverMSBE.MSBEL5930.*;
import mcframe.serverMSBF.MSBFL5100.*;
import mcframe.serverMSBF.MSBFL5110.*;
import mcframe.serverMSBF.MSBFL5200.*;
import mcframe.serverMSBF.MSBFL5210.*;
import mcframe.serverMSBI.MSBIL5010.*;
import mcframe.serverMSUC.MSUCL0080.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.serverMAUC.MAUCL1110.MAUCL_DptUtil.*;

import java.util.*;
import mcframe.serverMSLA.MSLAL5150.MSLAL_ShipActSendIfService;
import mcframe.serverMSLA.MSLAL5150.ShipActSendIf_Upd01_DtlR;
import mcframe.serverMSBE.MSBEL5040.*;
import static mcframe.serverMSUC.MSUCL0070.MSUCL_StkUtil.*;
import mcframe.serverCore.cache.MCJoinerList;
import static mcframe.commonCore.util.MCCollectionUtil.*;
import static mcframe.serverCore.cache.MCJoinerList.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_ShipActService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_ShipActService_MC extends MSBEL_ShipActService_MC_A{
	//FMCB CUSTOM START
	/**
	 * ShipAct_Chk01オペレーション.<p>
	 *
	 * 出荷実績の登録前チェックをする。<br>
	 */
	public class ShipAct_Chk01 extends MSBEL_ShipActService_MC_A.ShipAct_Chk01 {
		/**
		 * チェック対象のリスト<br>
		 * 売上済みや入荷済みなど、更新対象外を除いたリスト
		 */
		protected MCList<ShipAct_DtlR> _up1 = null;
		/**
		 * 明細からヘッダを特定するJOINキー
		 */
		protected MCJoinKey<MCList<ShipAct_HdrR>> _hdrJk = null;
		/**
		 * ヘッダから明細を特定するJOINキー
		 */
		protected MCJoinKey<MCList<ShipAct_DtlR>> _dtlJk = null;

		/**
		 * 輸出規制マスタ
		 */
		protected MCList<MAM_EX_CTRL_R> _exCtrl = null;
		protected MCIndexKey _idxExCtrl = null;
		/**
		 * インボイス出荷実績マップ
		 */
		protected MCList<MST_IV_SHIP_ACT_MAP_R> _ivShipActMapL = null;
		protected MCIndexKey _fixIvShipActMapIdxkey = null;
		protected MCIndexKey _ivShipActMapIdxkey = null;
		
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {

			// 初期処理
			crtJk(up0(), up1());
			doDataCache();
			editUp();

			// チェック処理
			crtJk(up0(), up1());		// editUpで構成が変わるので再生成
			checkAll();

			// メイン処理
			boolean isChk = true;	// チェック処理を実行する
			boolean isSlsDtlModReg = isSlsDtlModReg();
			crtJk(up0(), _up1);			// up0()と_up1を関連付け
			if (!isSlsDtlModReg) callLotChk03(_up1);
			if (!isSlsDtlModReg) callShipLotSrv(_up1, _hdrJk, isChk);
			callProvActSrv(_up1, _hdrJk, isChk);
			callVmiSrv(_up1, _hdrJk, isChk);
			callExActSrv(up0(), isChk);
			callExActSrvForOther(up1(), _hdrJk, isChk);
			callArrSchdSrv(_up1, _hdrJk, isChk);
			callPlntAprvSrv(_up1, _hdrJk);
			callMrktJudgSrv(_up1, _hdrJk);
			if (!isSlsDtlModReg) callLotTraceSrv(_up1);
			callClSrv(_up1, _hdrJk);
			callAprvStsSrv(_up1, _hdrJk, isChk);
			chkMinusStk(_up1, _hdrJk, up2());	// このチェックはすべてのチェックが完了してから実施する必要があります。カスタマイズ等でチェックを追加する場合は、これより前に追加してください。
			setErrFlg(up0(), _dtlJk);
			setDown();
		}

		protected boolean isSlsDtlModReg() {
			if(!isEmpty(up0().subList(ShipAct_HdrR.$sls_dtl_mod_flg, true))) {
				return true;
			}
			return false;
		}

		/**
		 * ヘッダと明細を関連付けるキーを生成する
		 */
		protected void crtJk(MCList<ShipAct_HdrR> hdrL, MCList<ShipAct_DtlR> dtlL) {
			// 明細からヘッダを特定するJOINキー
			_hdrJk = dtlL.join(ShipAct_DtlR.$hdr_peg_no, hdrL, ShipAct_HdrR.$peg_no);

			// ヘッダから対応する明細を特定するJOINキー
			_dtlJk = hdrL.join(ShipAct_HdrR.$peg_no, dtlL, ShipAct_DtlR.$hdr_peg_no);
		}

		/**
		 * マスタおよびトランをキャッシュする
		 */
		protected void doDataCache() {
			doShipAllocStsCache(up0(), up1());
			doShipActCache(up0());
			doShipActDCache(up0());
	
			MCList<ShipAct_HdrR> tmpHdrL = createShipAct_HdrL(); 
			MCList<ShipAct_DtlR> tmpDtlL = createShipAct_DtlL(); 
	
			for (ShipAct_HdrR hdrR : up0()) {
				if (MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
					tmpHdrL.add(getShipActR(hdrR.ship_act_no()));
					tmpDtlL.addAll(getShipActDLFromHdr(hdrR.ship_act_no()));
				}
				else {
					tmpHdrL.add(hdrR);
					tmpDtlL.addAll(hdrR.getJoined(_dtlJk));
				}
			}
			doLocCache(tmpDtlL);
			doBpCache(tmpHdrL, tmpDtlL);
			doItmCache(tmpDtlL);
			doItmUnitCache(tmpDtlL);
			doAllocStopLotCache(tmpDtlL);
		}


		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			_up1 = createShipAct_DtlL();

			MCNumber pegNo = nvl((MCNumber)up1().max(ShipAct_DtlR.$peg_no), MCNumber.ZERO);

			for (ShipAct_HdrR hdrR : up0()) {
				MCList<ShipAct_DtlR> dtlL = hdrR.getJoined(_dtlJk);
	
				if (MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
					ShipAct_HdrR r = getShipActR(hdrR.ship_act_no());
					hdrR.sa(r.sa());
					hdrR.sync_flg(r.sync_flg());
	
					dtlL = createShipAct_DtlL();
					for (MCList<ShipAct_DtlR> lst : getShipActDLFromHdr(hdrR.ship_act_no()).groupList(ShipAct_DtlR.$ship_act_d_no)) {
						ShipAct_DtlR dtlR = dtlL.add();
						MCRow.copyall(dtlR, lst.get(0));
						dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						dtlR.hdr_peg_no(hdrR.peg_no());
						dtlR.setAttributes(hdrR);
					}
					// peg_noはShipAct_Upd01と合わせること
					dtlL.sort(ShipAct_DtlR.$ship_act_d_no);
					for (ShipAct_DtlR rr : dtlL) {
						pegNo = pegNo.add(1);
						rr.peg_no(pegNo);
					}
				}
				cmplShipAct(hdrR, dtlL);

				_up1.addAll(dtlL);
			}

			// _up1 には売上済みや入荷済みなどの更新対象外は含めず、更新対象のみ設定する
			up1().setAll(_up1);
			_up1.removeAll(_up1.subList(r -> r.non_upd_flg()));
		}

		protected void setErrFlg(MCList<ShipAct_HdrR> hdrL, MCJoinKey<MCList<ShipAct_DtlR>> dtlJk) {
			for (ShipAct_HdrR hdrR : hdrL) {
				MCList<ShipAct_DtlR> dtlL = hdrR.getJoined(dtlJk);
				if(!isNull(dtlL.getFirst(ShipAct_DtlR.$err_flg, true))) {
					hdrR.err_flg(true);
				}
			}
		}

		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
		}

		/**
		 * メッセージリスト
		 */
		protected MCMessageList _errMsgList = new MCMessageList();
	
		/**
		 * チェック処理
		 */
		protected void checkAll() {

			//輸出規制マスタ情報を取得する
			getExCtrL();
			getIvShipActMapL();

			MCIndexKey idx = _up1.createIndex(ShipAct_DtlR.$hdr_peg_no);
			for (ShipAct_HdrR hdrR : up0()) {

				MCList<ShipAct_DtlR> dtlL = _up1.subList(idx, hdrR.peg_no());
				for (ShipAct_DtlR dtlR : dtlL) {
					// 固有チェック
					checkInput(hdrR, dtlR);
				}
			}

			// 受注関連チェック
			checkSlo(up0(), _up1);

			// インボイス関連チェック
			checkIV(up0(), _up1);

			// 品目マスタチェック
			checkItm(up0(), _up1);
			
			// 場所マスタチェック
			checkLoc(up0(), _up1);

			chkNotLotMix(up0(), _up1);

			MCMessagePool.addAll(_errMsgList);

			// エラーフラグを設定
			setErrFlgCmm(up0());
			setErrFlgCmm(_up1);
			for (ShipAct_HdrR hdrR : up0()) {
				MCList<ShipAct_DtlR> l = _up1.subList(idx, hdrR.peg_no());
				if (!isNull(l.getFirst(ShipAct_DtlR.$err_flg, true))) {
					hdrR.err_flg(true);
				}
			}
		}

		/**
		 * 固有エラーチェック
		 */
		protected void checkInput(ShipAct_HdrR hdrR, ShipAct_DtlR r) {
	
			int errCnt = _errMsgList.size();
	
			MCDate shipDt = hdrR.ship_tm().trunc(MCDateFieldType.DAY);
			MAM_ITM_R itmR = getItmR(r);
	
			// 「売上」「出荷」
			if (isSlsOrShip(r)) {
	
				// 「新規」「更新」
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())
					|| MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
	
					// 出荷禁止チェック
					if (shipDt.gte(itmR.getDate("sls_stop_dt"))) {
						_errMsgList.add(new MCMessage(
							r, null, MSBEL0016,
							toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
							toYMDString(shipDt),
							toYMDString(itmR.getDate("sls_stop_dt")), toDispGUIIndex(r)));
					}
	
					// 取引先禁止チェック
					String cstCd = hdrR.cst_cd();
					if (!hdrR.uplnd_flg()) {
						MST_SHIP_ALLOC_STS_R sasR = getShipAllocStsR(r);
						cstCd = sasR.getString("cst_cd");
					}
					MAM_BP_R cstR = getBpR(cstCd);
					if (shipDt.gte(cstR.getDate("sls_stop_dt"))) {
						_errMsgList.add(new MCMessage(
							r, null, MSBEL0245, cstCd,
							toYMDString(shipDt),
							toYMDString(cstR.getDate("sls_stop_dt")), toDispGUIIndex(r)));
					}
	
					// 輸出禁止チェック
					if (chkExCtrl(hdrR, r)) {
						_errMsgList.add(new MCMessage(
							r, null, MSBEL0018,
							toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
							getBpR(r.dlv_id_cd()).cntry_cd(), toDispGUIIndex(r)));
					}
	
					// 引当禁止チェック
					MST_ALLOC_STOP_LOT_R stopR = getAllocStopLotR(r);
					// 禁止日≦出荷日＜解除日
					if (!isNull(stopR) && !isNull(stopR.stop_dt())
						&& stopR.stop_dt().lte(shipDt)) {
						if (isNull(stopR.rel_dt()) || shipDt.lt(stopR.rel_dt())) {
							_errMsgList.add(new MCMessage(
								r, null, MSBEL0019,
								toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), r.lot_no(),
								r.sublot_no(), toDispGUIIndex(r)));
						}
					}
				}
	
				// 「更新」「削除」
				if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())
					|| MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
	
					// 売上計上済みチェック（検収基準の場合）
					if (!isSlsShipBasis(hdrR, r) && existSlsActIo(r) && !MSC_STK_ID_TYP.isCSTSTK(r.stk_id_typ())) {
						_errMsgList.add(new MCMessage(r, null, MSBEL0026, toDispGUIIndex(r)));
					}
					if (existUplndIv(hdrR, r)) {
						_errMsgList.add(new MCMessage(r, null, MSBEL1127, toDispGUIIndex(r)));
					}
					// インボイス出荷済みチェック
					if (existIvAct(r)) {
						_errMsgList.add(new MCMessage(r, null, MSBEL0028, toDispGUIIndex(r)));
					}
					// 出荷返品済みチェック
					if (existShipRet(r)) {
						_errMsgList.add(new MCMessage(r, null, MSBEL0029, toDispGUIIndex(r)));
					}
				}
			}
			// 「移動・移送」「移動・移送返品」「支給」「支給返品」
			else if (isXfrOrProv(r) ) {
	
				// 「新規」「更新」
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())
					|| MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
	
					// 移送禁止チェック
					if (shipDt.gte(itmR.getDate("xfr_stop_dt"))) {
						_errMsgList.add(new MCMessage(
							r, null, MSBEL0017,
							toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
							toYMDString(shipDt),
							toYMDString(itmR.getDate("xfr_stop_dt")), toDispGUIIndex(r)));
					}
	
					// 取引先禁止チェック
					MAM_LOC_R locR = getLocR(r.dlv_id_cd());
					if (!isNull(locR.sppl_cd())) {
						MAM_BP_R bR = getBpR(locR.sppl_cd());
						if (shipDt.gte(bR.getDate("xfr_stop_dt"))) {
							_errMsgList.add(new MCMessage(
								r, null, MSBEL0318, locR.sppl_cd(),
									toYMDString(shipDt),
									toYMDString(bR.getDate("xfr_stop_dt")), toDispGUIIndex(r)));
						}
					}
	
					// 輸出禁止チェック
					if (chkExCtrl(hdrR, r)) {
						_errMsgList.add(new MCMessage(
							r, null, MSBEL0018,
							toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
							locR.cntry_cd(), toDispGUIIndex(r)));
					}
				}
	
				// 「更新」「削除」
				if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())
					|| MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
	
					// 入荷済みチェック（着荷要の場合）
					if (isArr(hdrR, r) && existArrAct(r)) {
						_errMsgList.add(new MCMessage(r, null, MSBEL0027, toDispGUIIndex(r)));
					}
					// インボイス出荷済みチェック
					if (existIvAct(r)) {
						_errMsgList.add(new MCMessage(r, null, MSBEL0028, toDispGUIIndex(r)));
					}
				}
			}
	
			if (!hdrR.uplnd_flg()) {
				MCList<MST_SHIP_ALLOC_STS_R> sasL = getShipAllocStsL(r);
	
				for (MST_SHIP_ALLOC_STS_R sasR : sasL) {
					// 出荷留めチェック（指図対象外のみチェックする）
					if (MAC_SHIP_INST_TYP.isNON(sasR.getString("ship_inst_typ"))
						&& sasR.getBoolean("ship_block_flg")) {
						_errMsgList.add(new MCMessage(r, null, MSBEL0038, r.ship_schd_no(), toDispGUIIndex(r)));
					}
					// 出荷判定チェック
					if (!sasR.getBoolean("ship_abl_flg")) {
						_errMsgList.add(new MCMessage(
							r, null, MSBEL0235, sasR.getString("slo_no"), r.ship_schd_no(), toDispGUIIndex(r)));
					}
					// 預りチェック
					if (!isNull(sasR.getString("slo_d_no")) && sasR.getBoolean("sls_cststk_flg")) {
						if (!MSC_STK_ID_TYP.isCSTSTK(r.stk_id_typ())) {
							_errMsgList.add(new MCMessage(
								r, null, MSBEL0291, sasR.getString("slo_d_no"), toDispGUIIndex(r)));
						}
					}
				}
				// 受注打切済みチェック
				MST_SLO_D_R sloDR = getSloDR(r.slo_d_no());
				if (!sloDR.isEmpty() && sloDR.getNumber("ship_inst_qty").isZero()
						&& sloDR.getNumber("ship_act_qty").isPositive()) {
					if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())) {
						MST_SHIP_ACT_D_R actDR = getActDR(r.ship_act_d_no());
						if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) || (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ()) && isUpdTgt(r, actDR))) {
							if (sloDR.abort_flg()) {
								_errMsgList.add(new MCMessage(r, null, MSBEL1102, toDispGUIIndex(r)));
							}
						}
					}
					else if (MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
						if (sloDR.abort_flg()) {
							_errMsgList.add(new MCMessage(r, null, MSBEL1102, toDispGUIIndex(r)));
						}
					}
				}
				// 打切済みチェック
				if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())) {
					if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {	// 残数打切なので行削除に対してのみチェック
						for (MST_SHIP_ALLOC_STS_R sasR : sasL) {
							if (sasR.getBoolean("abort_flg")) {
								_errMsgList.add(new MCMessage(r, null, MSBEL0025, toDispGUIIndex(r)));
							}
						}
					}
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
					for (MST_SHIP_ALLOC_STS_R sasR : sasL) {
						if (sasR.getBoolean("abort_flg")) {
							_errMsgList.add(new MCMessage(r, null, MSBEL0030, toDispGUIIndex(r)));
						}
					}
				}
				if (!hdrR.ship_cmpl_no_chk_flg()
						&& (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ()) 
						|| MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ()))) {
					
					// 出荷完了チェック（出荷完了の場合、出荷実績を新規登録できないとする）
					MCIndexKey idx = _up1.createIndex(ShipAct_DtlR.$hdr_peg_no, ShipAct_DtlR.$ship_inst_d_no);
					if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()) 
							&& _up1.subList(idx, hdrR.peg_no(), r.ship_inst_d_no()).groupBy(ShipAct_DtlR.$data_crud_typ).size() == 1) {
						
						for (MST_SHIP_ALLOC_STS_R sasR : sasL) {
							if (sasR.getBoolean("abort_flg") || sasR.getNumberNE("sas_ship_act_qty").gte(sasR.base_unit_qty())) {

								_errMsgList.add(new MCMessage(r, null, MSBEL1019,
										hdrR.ship_inst_no(), r.ship_inst_d_no(), r.ship_schd_no(), r.ship_alloc_sts_no(), toDispGUIIndex(r)));
							}
						}
					}
				}
			}
			if (hdrR.dlv_slip_prnt_flg()) {
				if (MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
					if (isNull(r.base_ac_dt())) {
						_errMsgList.add(new MCMessage(r, null, MSBEL1105, toDispGUIIndex(r)));
					}
				}
			}
			if (_errMsgList.size() > errCnt) {
				hdrR.err_flg(true);
				r.err_flg(true);
			}
		}
	
		/**
		 * 固有エラーチェック（受注関連）
		 */
		protected void checkSlo(MCList<ShipAct_HdrR> hdrL, MCList<ShipAct_DtlR> dtlL) {

			MCList<ShipAct_HdrR> chkHdrL = createShipAct_HdrL();
			for (ShipAct_HdrR hdrR : up0()) {
				// 計画外、または削除はチェック不要
				if (hdrR.uplnd_flg()
					|| MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
					continue;
				}
				chkHdrL.add(hdrR);
			}

			// 「売上」「出荷」のみ＆削除行は対象外（出荷対象とはみなさない）
			MCIndexKey chkHdrIdx = chkHdrL.createIndex(ShipAct_HdrR.$peg_no);
			MCList<ShipAct_DtlR> chkDtlL = createShipAct_DtlL();
			for (ShipAct_DtlR r : _up1) {
				if (isSlsOrShip(r)
					&& !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())
					&& !isNull(chkHdrL.getFirst(chkHdrIdx, r.hdr_peg_no()))) {
					chkDtlL.add(r);
				}
			}

			MCList<MST_SHIP_ALLOC_STS_R> sasL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			for (ShipAct_DtlR r : chkDtlL) {
				MST_SHIP_ALLOC_STS_R sasR = sasL.add();
				MCRow.copyvalue(sasR, getShipAllocStsR(r));
				sasR.setNumberNE(ShipAct_DtlR.$hdr_peg_no, r.hdr_peg_no());	// ヘッダを特定するキー
			}

			// 出荷対象の受注の明細全てを取得
			MCList<MST_SLO_D_R> slodL = MCList.create(MST_SLO_D_R.class);
			for (MST_SHIP_ALLOC_STS_R r : sasL) {
				if (!isNull(r.getString("slo_d_no"))) {
					slodL.add().slo_d_no(r.getString("slo_d_no"));
				}
			}
			if (slodL.isEmpty()) {
				return;
			}
			slodL = slodL.groupBy(MST_SLO_D_R.$slo_d_no);
			MCQueryApiBuilder slodL_bldr = MCQueryApiBuilder.create(MST_SLO_D_R.create("T"));
			dbWkDelete("MSBEL5540_MSW_SLO_D_D01", slodL_bldr.getBaseDbc());
			dbWkInsert("MSBEL5540_MSW_SLO_D_I01", slodL, slodL_bldr.getBaseDbc());

			MCList<MST_SLO_R> sloL = MCList.create(MST_SLO_R.class);
			MST_SLO_R sloL_t = MST_SLO_R.create("T");
			MCQueryApiBuilder sloL_bldr = MCQueryApiBuilder.create(sloL_t);
			MST_SLO_D_R t1 = MST_SLO_D_R.create("T1");
			MSW_SLO_D_KEY_R w = MSW_SLO_D_KEY_R.create("W");
			MST_SHIP_PR_R t2 = MST_SHIP_PR_R.create("T2");
			MST_SLO_D_R t3 = MST_SLO_D_R.create("T3");
			MST_SHIP_PR_R t4 = MST_SHIP_PR_R.create("T4");
			MST_SHIP_SCHD_R t5 = MST_SHIP_SCHD_R.create("T5");
			sloL.addStringColumn("set_itm_grp_no");
			sloL_bldr.setDistinct();
			sloL_bldr.setSelect(sloL_t.slo_no, sloL_t.iv_no, sloL_t.assort_typ,
					t3.slo_d_no, t3.ship_inst_typ, t3.set_itm_grp_no, t4.ship_pr_no,
					t4.ship_inst_qty, t4.ship_act_qty, t5.ship_schd_no, t5.base_unit_qty);
			sloL_bldr.addInnerJoin(t1, bracket(t1.slo_no.eq(sloL_t.slo_no)));
			sloL_bldr.addInnerJoin(w, bracket(w.slo_d_no.eq(t1.slo_d_no)));
			sloL_bldr.addInnerJoin(t2, bracket(t2.slo_d_no.eq(t1.slo_d_no)));
			sloL_bldr.addInnerJoin(t3, bracket(t3.slo_no.eq(sloL_t.slo_no)));
			sloL_bldr.addInnerJoin(t4, bracket(t4.slo_d_no.eq(t3.slo_d_no)
					.and(t4.ship_to_id_typ.eq(t2.ship_to_id_typ))
					.and(t4.ship_to_id_cd.eq(t2.ship_to_id_cd))
					.and(t4.ship_to_id_nm.eq(t2.ship_to_id_nm)
							.or(t4.ship_to_id_nm.isNull())
							.and(t2.ship_to_id_nm.isNull()))
					.and(t4.ship_to_zip_cd.eq(t2.ship_to_zip_cd)
							.or(t4.ship_to_zip_cd.isNull())
							.and(t2.ship_to_zip_cd.isNull()))
					.and(t4.ship_to_addr1.eq(t2.ship_to_addr1)
							.or(t4.ship_to_addr1.isNull())
							.and(t2.ship_to_addr1.isNull()))
					.and(t4.ship_to_addr2.eq(t2.ship_to_addr2)
							.or(t4.ship_to_addr2.isNull())
							.and(t2.ship_to_addr2.isNull()))
					.and(t4.ship_to_addr3.eq(t2.ship_to_addr3)
							.or(t4.ship_to_addr3.isNull())
							.and(t2.ship_to_addr3.isNull()))
					.and(t4.ship_to_addr4.eq(t2.ship_to_addr4)
							.or(t4.ship_to_addr4.isNull())
							.and(t2.ship_to_addr4.isNull()))
					.and(t4.ship_to_cntct_dpt.eq(t2.ship_to_cntct_dpt)
							.or(t4.ship_to_cntct_dpt.isNull())
							.and(t2.ship_to_cntct_dpt.isNull()))
					.and(t4.ship_to_cntct_psn.eq(t2.ship_to_cntct_psn)
							.or(t4.ship_to_cntct_psn.isNull())
							.and(t2.ship_to_cntct_psn.isNull()))
					.and(t4.ship_to_tel.eq(t2.ship_to_tel)
							.or(t4.ship_to_tel.isNull())
							.and(t2.ship_to_tel.isNull()))
					.and(t4.ship_to_fax.eq(t2.ship_to_fax)
							.or(t4.ship_to_fax.isNull())
							.and(t2.ship_to_fax.isNull()))
					.and(t4.via_dlv_typ.eq(t2.via_dlv_typ)
							.or(t4.via_dlv_typ.isNull())
							.and(t2.via_dlv_typ.isNull()))
					.and(t4.ship_to_lg_grp_cd.eq(t2.ship_to_lg_grp_cd)
							.or(t4.ship_to_lg_grp_cd.isNull())
							.and(t2.ship_to_lg_grp_cd.isNull()))));
			sloL_bldr.addInnerJoin(t5, bracket(t5.ship_pr_no.eq(t4.ship_pr_no)));
			sloL_bldr.setWhere(t3.can_flg.eq(value(false)));
			sloL_bldr.addWhereWithAnd(
					t3.ship_inst_typ.eq(value(MAC_SHIP_INST_TYP.NON.value())));
			sloL_bldr.addWhereWithAnd(t5.abort_flg.eq(value(false)));
			dbSelect("MSBEL5540_MST_SLO_S01", sloL, sloL_bldr);

			MCIndexKey
				sloIdx = sasL.createIndex("slo_no"),
				sloDIdx = sasL.createIndex("slo_d_no"),
				shipIdx = sasL.createIndex("ship_schd_no"),
				setItmGIdx = sasL.createIndex("set_itm_grp_no");
			MCIndexKey dtlIdx = chkDtlL.createIndex("ship_schd_no");
			for (MCList<MST_SLO_R> lst : sloL.groupList("slo_no")) {
				MST_SLO_R sloR = lst.get(0);

				// チェック対象の受注に対応するヘッダを取得
				MST_SHIP_ALLOC_STS_R sasR = sasL.getFirst(sloIdx, sloR.slo_no());
				ShipAct_HdrR hdrR = chkHdrL.getFirst(chkHdrIdx, sasR.getNumber(ShipAct_DtlR.$hdr_peg_no));

				// 「ピッキングなし」が取り残されていないかチェック
				int n = 0, m = 0;
				for (MST_SLO_R r : lst) {
					if (r.getNumber("ship_inst_qty").isPositive()
						&& r.getNumber("ship_act_qty").isZero()
						&& isNull(sasL.getFirst(sloDIdx, r.getString("slo_d_no")))) {
						n++;		// 受注内の指図済み＆未出荷の件数
						if (MAC_SHIP_INST_TYP.isNO_PICK(r.getString("ship_inst_typ"))) {
							m++;	// そのうち、ピッキングなしの件数
						}
					}
				}
				if (n>0 && m >0 && n==m) {
					// 「ピッキングなし」しか残っていないので、エラーとする
					_errMsgList.add(new MCMessage(hdrR, null, MSBEL0020));
				}

				// インボイス単位出荷チェック（画面指定のインボイスNOと出荷対象の受注が持つNOが同じか）
				if (!isNull(hdrR.iv_no())
					&& !isNull(sloR.getString("iv_no"))
					&& !isSame(hdrR.iv_no(), sloR.getString("iv_no"))) {
					_errMsgList.add(new MCMessage(hdrR, null, MSBEL0021, hdrR.iv_no(), sloR.getString("iv_no")));
				}

				// 品揃えチェック（指図なしのみ）
				// 売上明細訂正登録画面で訂正したときは品揃えのチェックは実行しない
				if (!isSlsDtlModReg() && !hdrR.uplnd_flg() && isNull(hdrR.ship_inst_no())) {
					java.util.ArrayList<MCList<MST_SLO_R>> arr = new java.util.ArrayList<>();
					if (MSC_SHIP_ASSORT_TYP.isAST(sloR.assort_typ())) {
						arr.add(lst);
					}
					else {
						for (MCList<MST_SLO_R> grpL : lst.groupList("set_itm_grp_no")) {
							String grpNo = grpL.get(0).getString("set_itm_grp_no");
							if (!isNull(grpNo) && !isNull(sasL.getFirst(setItmGIdx, grpNo))) {
								arr.add(grpL);
							}
						}
					}

					for (MCList<MST_SLO_R> grpL : arr) {
						for (MST_SLO_R r : grpL) {
							sasR = sasL.getFirst(shipIdx, r.getString("ship_schd_no"));
							if (isNull(sasR)) {
								// 出荷対象になっていない
									_errMsgList.add(new MCMessage(hdrR, null, MSBEL0024,
										sloR.slo_no(), sloR.assort_typ(),
										r.getString("set_itm_grp_no"), r.getString("ship_schd_no"),
										r.getNumber("base_unit_qty"), r.getNumber("base_unit_qty")));
							}
							else {
								MCList<ShipAct_DtlR> upL = chkDtlL.subList(dtlIdx, sasR.getString("ship_schd_no"));
								// 出荷する数量の基準単位数量を算出する
								MCNumber baseQty = MCNumber.ZERO;
								for(ShipAct_DtlR rr : upL) {
									MAM_ITM_R itmR = getItmR(rr);
									MAVM_ITM_UNIT_R unitR = getItmUnitR(rr);
									baseQty = sum(baseQty,
										convToBaseUnit(rr.trd_unit_qty(),
										unitR.conv_base_qty(), unitR.conv_qty(), itmR.dec_place(), itmR.rnd_typ()));
								}
								// 出荷対象（上り電文に含まれている）だが、一部出荷もエラーにする
								if (!upL.get(0).abort_flg()
									&& baseQty.lt(r.getNumber("base_unit_qty"))) {
									_errMsgList.add(new MCMessage(hdrR, null, MSBEL0024,
										sloR.slo_no(), sloR.assort_typ(),
										r.getString("set_itm_grp_no"), r.getString("ship_schd_no"),
										baseQty, r.getNumber("base_unit_qty")));
								}
							}
						}
					}
				}
			}
		}

		/**
		 * 固有エラーチェック（インボイス関連）
		 */
		protected void checkIV(MCList<ShipAct_HdrR> hdrL, MCList<ShipAct_DtlR> dtlL) {
	
			MCList<ShipAct_HdrR>
				chkHdrL = createShipAct_HdrL(),		// インボイス単位出荷以外
				chkHdrIvL = createShipAct_HdrL();	// インボイス単位出荷
			for (ShipAct_HdrR hdrR : hdrL) {
				// 計画外はチェック不要
				if (hdrR.uplnd_flg()) {
					continue;
				}
				else if (!isNull(hdrR.iv_no())) {
					chkHdrIvL.add(hdrR);	// インボイス単位出荷
				}
				else {
					chkHdrL.add(hdrR);
				}
			}
			MST_IV_R ivL_t = MST_IV_R.create("T");
			MCQueryApiBuilder ivL_bldr = MCQueryApiBuilder.create(ivL_t);
			MCList<MST_IV_R> ivL = MCList.create(MST_IV_R.class);
			MST_IV_D_R t1 = MST_IV_D_R.create("T1");
			MST_IV_MAP_R t2 = MST_IV_MAP_R.create("T2");
			MST_SHIP_SCHD_R t3 = MST_SHIP_SCHD_R.create("T3");
			MST_SHIP_ALLOC_STS_R t4 = MST_SHIP_ALLOC_STS_R.create("T4");
			MCIndexKey ivIdx = null;
			if (!chkHdrIvL.isEmpty()) {
				ivL_bldr.setSelect(ivL_t.iv_no, ivL_t.iv_ship_flg, t1.iv_d_no,
						t2.ship_schd_no, t2.base_unit_qty);
				ivL_bldr.addInnerJoin(t1, bracket(t1.iv_mng_no.eq(ivL_t.iv_mng_no)));
				ivL_bldr.addInnerJoin(t2, bracket(t2.iv_d_no.eq(t1.iv_d_no)));
				ivL_bldr.addInnerJoin(t3, bracket(t3.ship_schd_no.eq(t2.ship_schd_no)));
				ivL_bldr.setWhere(ivL_t.iv_no.eq(bind("iv_no")));
				ivL_bldr.setDistinct();
				dbSelect("MSBEL5540_MST_IV_S01", ivL, ivL_bldr, chkHdrIvL);

				ivIdx = ivL.createIndex(MST_IV_R.$iv_no);
				for (ShipAct_HdrR hdrR : chkHdrIvL) {
					if (isNull(ivL.getFirst(ivIdx, hdrR.iv_no()))) {
						_errMsgList.add(new MCMessage(hdrR, null, MSBEL0292, hdrR.iv_no()));
						hdrR.err_flg(true);
					}
				}
			}
			checkIvQty(hdrL, dtlL);

			// 取消を除く（取消は以降のチェックは行わない）
			chkHdrL = chkHdrL.subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));
			chkHdrIvL = chkHdrIvL.subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));
			if (chkHdrL.isEmpty() && chkHdrIvL.isEmpty()) {
				return;
			}

			MCIndexKey
				ivSasIdx = null,
				dtlIdx = dtlL.createIndex(ShipAct_DtlR.$hdr_peg_no);
			if (!chkHdrL.isEmpty()) {
				// インボイス単位出荷でない出荷に対して、インボイス単位出荷が混在していないかチェック

				MCList<MST_SHIP_ALLOC_STS_R> wkL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
				for (ShipAct_HdrR hdrR : chkHdrL) {
					MCList<ShipAct_DtlR> tmpDtlL = dtlL
						.subList(dtlIdx, hdrR.peg_no())
						.subList(rr -> !MAC_DATA_CRUD_TYP.isDEL(rr.data_crud_typ()));
					for (ShipAct_DtlR row : tmpDtlL) {
						MST_SHIP_ALLOC_STS_R wkR = MST_SHIP_ALLOC_STS_R.create();
						wkR.ship_alloc_sts_no(row.ship_alloc_sts_no());
						wkL.add(wkR);
					}
				}
				dbWkDelete("MSBEL5540_MSW_SHIP_ALLOC_STS_D03", MST_SHIP_ALLOC_STS_R.create());
				dbWkInsert("MSBEL5540_MSW_SHIP_ALLOC_STS_I03", wkL, MST_SHIP_ALLOC_STS_R.create());
				
				MSW_SHIP_ALLOC_STS_KEY_R w = MSW_SHIP_ALLOC_STS_KEY_R.create("W");
				// 出荷指図対象外と、出荷指図対象を別々に検索する。
				ivL.init();
				ivL_bldr = MCQueryApiBuilder.create(ivL_t);
				ivL_bldr.setSelect(ivL_t.iv_no, ivL_t.iv_ship_flg, t1.iv_d_no, t2.ship_schd_no,
						t4.ship_alloc_sts_no);
				ivL_bldr.addInnerJoin(t1, bracket(t1.iv_mng_no.eq(ivL_t.iv_mng_no)));
				ivL_bldr.addInnerJoin(t2, bracket(t2.iv_d_no.eq(t1.iv_d_no)));
				ivL_bldr.addInnerJoin(t3, bracket(t3.ship_schd_no.eq(t2.ship_schd_no)));
				ivL_bldr.addInnerJoin(t4, bracket(t4.ship_schd_no.eq(t3.ship_schd_no)));
				ivL_bldr.addInnerJoin(w, bracket(w.ship_alloc_sts_no.eq(t4.ship_alloc_sts_no)));
				dbSelect("MSBEL5540_MST_IV_S02", ivL, ivL_bldr);
				MCList<MST_IV_R> ivL2 = MCList.create(MST_IV_R.class);
				ivL_bldr = MCQueryApiBuilder.create(ivL_t);
				ivL_bldr.setSelect(ivL_t.iv_no, ivL_t.iv_ship_flg, t1.iv_d_no, t2.ship_schd_no,
						t4.ship_alloc_sts_no);
				ivL_bldr.addInnerJoin(t1, bracket(t1.iv_mng_no.eq(ivL_t.iv_mng_no)));
				ivL_bldr.addInnerJoin(t2, bracket(t2.iv_d_no.eq(t1.iv_d_no)));
				ivL_bldr.addInnerJoin(t3, bracket(t3.ship_schd_no.eq(t2.ship_schd_no)));
				ivL_bldr.addInnerJoin(t4, bracket(t4.ship_inst_d_no.eq(t3.ship_inst_d_no)));
				ivL_bldr.addInnerJoin(w, bracket(w.ship_alloc_sts_no.eq(t4.ship_alloc_sts_no)));
				dbSelect("MSBEL5540_MST_IV_S05", ivL2, ivL_bldr);
				
				ivL.addAll(ivL2);
				ivL = ivL.distinctNE(MST_IV_R.$iv_no, MST_IV_R.$iv_ship_flg, MST_IV_D_R.$iv_d_no,
						MST_IV_MAP_R.$ship_schd_no, MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no);
				ivIdx = ivL.createIndex("iv_no");
				ivSasIdx = ivL.createIndex("ship_alloc_sts_no");
			}

			// チェック対象をマージ
			chkHdrL.addAll(chkHdrIvL);
			
			// ヘッダごとにインボイス関連のチェックを行う
			for (ShipAct_HdrR hdrR : chkHdrL) {

				// 削除行は対象外（出荷対象とはみなさない）
				MCList<ShipAct_DtlR> chkL = dtlL.createInstance();
				MCList<MST_SHIP_ALLOC_STS_R> sasL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
				// 輸出後に打切できるようにしたので、チェックの対象に輸出済や売上済など後処理済の明細も含める
				for (ShipAct_DtlR r : hdrR.getJoined(_dtlJk)) {
					if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
						chkL.add(r);
						sasL.addAll(getShipAllocStsL(r));
		
						MAM_ITM_R itmR = getItmR(r);
						MAVM_ITM_UNIT_R unitR = getItmUnitR(r);
						r.base_unit_qty(
							convToBaseUnit(
								r.trd_unit_qty(), unitR.conv_base_qty(), unitR.conv_qty(),
								itmR.dec_place(), itmR.rnd_typ()));
					}
				}
				if (chkL.isEmpty())	return;
				MCIndexKey idx = sasL.createIndex("ship_schd_no");
		
				// インボイス取引対象と対象外が混在していないかチェック
				// 移送系はマスタ上混在することがないので、cst_iv_flgのみチェックの対象にする
				sasL.addBooleanColumn("cst_iv_flg");		// groupBy
				if (sasL.groupBy("cst_iv_flg").size() > 1) {
					_errMsgList.add(new MCMessage(hdrR, null, MSBEL0022));
				}
		
				if (!isNull(hdrR.iv_no())) {
					// インボイスに紐付く出荷予定が全て揃っているかチェック
					for (MST_IV_R ivR : ivL.subList(ivIdx, hdrR.iv_no())) {
						if (isNull(sasL.getFirst(idx, ivR.getString("ship_schd_no")))) {
							_errMsgList.add(new MCMessage(hdrR, null, MSBEL0023));
							break;
						}
					}
				}
				else {
					for (ShipAct_DtlR r : chkL) {
						MST_IV_R ivR = ivL.getFirst(ivSasIdx, r.ship_alloc_sts_no());
						if (!isNull(ivR) && ivR.iv_ship_flg()) {
							_errMsgList.add(
								new MCMessage(r, null, MSBEL0206, r.ship_schd_no(), ivR.iv_no(), toDispGUIIndex(r)));
						}
					}
				}
		
				// ※インボイス取引対象は指図まとめがないため、出荷予定の単位で比較する
				for (MCList<ShipAct_DtlR> lst : chkL.groupList(ShipAct_DtlR.$ship_schd_no)) {
					ShipAct_DtlR r = lst.get(0);
					MST_SHIP_ALLOC_STS_R sasR = sasL.getFirst(idx, r.ship_schd_no());
		
					MCNumber
						actQty = lst.sum(ShipAct_DtlR.$base_unit_qty),
						ivQty = sasR.getNumber("iv_schd_qty"),
						schdQty = sasR.getNumber("schd_qty");
					boolean iv_flg = isSlsOrShip(r) ? sasR.getBoolean("cst_iv_flg") : sasR.getBoolean("iv_trd_flg");
		
					if (isNull(actQty)) {
						// 品目マスタが論理削除されている場合にnullになる
						// 後続処理でエラーにしているので、ここではスキップする
						continue;
					}
					// 出荷予定ごとの実績数
					actQty = actQty.add(sasR.getNumber("ss_ship_act_qty"));
					for (ShipAct_DtlR rr : hdrR.getJoined(_dtlJk).subList(ShipAct_DtlR.$ship_schd_no, r.ship_schd_no())) {
						if (!isNull(rr.ship_act_d_no())) {
							ShipAct_DtlR sadR = getShipActDR(rr.ship_act_d_no());
							actQty = actQty.subtract(sadR.base_unit_qty());
						}
					}
					
					// インボイス登録済みは打切不可
					if (sasR.getNumber("iv_schd_qty").isPositive() && !isSame(ivQty, actQty) && r.abort_flg()) {
						_errMsgList.add(
							new MCMessage(r, null, MSBEL0350, r.ship_schd_no(), actQty, schdQty, ivQty, toDispGUIIndex(r)));
					}
					
					if (iv_flg) {
						if (sasR.getNumber("iv_schd_qty").isPositive()) {
							if (!isNull(hdrR.iv_no())) {
								if (!sasR.getNumber("iv_schd_qty").eq(actQty)) {
									_errMsgList.add(new MCMessage(r, null, MSBEL0314, r.iv_d_no(), actQty, schdQty, toDispGUIIndex(r)));
								}
							}
						}
						if (MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ()) && !sasR.getBoolean("purc_ddlv_flg")
								&& isSlsShipBasis(hdrR, r) && MAC_VIA_DLV_TYP.isNOT_VIA(hdrR.via_dlv_typ())) {
							for (ShipAct_DtlR dtlR : lst) {
								if (isNull(dtlR.iv_d_no())) {
									_errMsgList.add(new MCMessage(dtlR, null, MSBEL1126, dtlR.ship_schd_no(), toDispGUIIndex(dtlR)));
								}
							}
						}
					}
				}
			}
		}
		
		/**
		 * インボイス数量に関連するチェックを行う。
		 * @param hdrL 出荷実績ヘッダリスト
		 * @param dtlL 出荷指図明細リスト
		 */
		protected void checkIvQty(MCList<ShipAct_HdrR> hdrL, MCList<ShipAct_DtlR> dtlL) {
			
			MCList<ShipAct_DtlR> chkIvDtlL = dtlL.createInstance();
			MCList<ShipAct_DtlR> chkNoIvDtlL = dtlL.createInstance();
			MCList<ShipAct_DtlR> chkShipBasisDtlL = dtlL.createInstance();
			MCIndexKey dtlIdxkey = dtlL.createIndex(ShipAct_DtlR.$hdr_peg_no);
			
			for (ShipAct_HdrR hdrR : hdrL) {
				if (isNull(hdrR.iv_no()) && !hdrR.uplnd_iv_sls_flg()) {
					for (ShipAct_DtlR dtlR : dtlL.subList(dtlIdxkey, hdrR.peg_no())) {
						if (!MAC_TRD_PTN_TYP.isSLS(dtlR.trd_ptn_typ()) || !isIvTrd(hdrR, dtlR)) {
							continue;
						}
						
						if (!isNull(dtlR.iv_d_no())) {
							chkIvDtlL.add(dtlR);
						}
						else if (!MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ())) {
							chkNoIvDtlL.add(dtlR);
						}
						
						if (!hdrR.uplnd_flg()
								&& isNull(hdrR.iv_no())
								&& !isNull(dtlR.ship_inst_d_no())
								&& isSlsShipBasis(hdrR, dtlR)
								&& MAC_VIA_DLV_TYP.isNOT_VIA(hdrR.via_dlv_typ())
								&& (!MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ()) || MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ()))) {
							// インボイス単位出荷がオフかつ配送先経由しないかつ出荷基準の場合、インボイスの全明細が揃っているかチェックする。
							chkShipBasisDtlL.add(dtlR);
						}
					}
				}
			}
			
			if (!chkIvDtlL.isEmpty()) {
				MCList<MST_IV_SHIP_ACT_MAP_R> ivShipActMapL = getIvShipActMapL(chkIvDtlL);
				MCIndexKey ivShipActMapIdxkey = ivShipActMapL.createIndex(MST_IV_SHIP_ACT_MAP_R.$iv_d_no);
				for (MCList<ShipAct_DtlR> ivGrpL : chkIvDtlL.groupList(ShipAct_DtlR.$iv_d_no)) {
					ShipAct_DtlR chkR = ivGrpL.get(0);
					
					MCList<MST_IV_SHIP_ACT_MAP_R> subIvShipActMapL = ivShipActMapL.subList(ivShipActMapIdxkey, chkR.iv_d_no());
					MCNumber ivQty = subIvShipActMapL.get(0).getNumberNE("iv_qty");
					MCNumber shipActQty = MCNumber.ZERO;
					
					for (ShipAct_DtlR dtlR : ivGrpL) {
						if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
							shipActQty = shipActQty.add(dtlR.base_unit_qty());
						}
						else if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
							shipActQty = shipActQty.add(dtlR.base_unit_qty());
							subIvShipActMapL.removeAll(subIvShipActMapL.subList(r->isSame(r.ship_act_d_no(), dtlR.ship_act_d_no())));
						}
						else if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
							shipActQty = shipActQty.subtract(dtlR.base_unit_qty());
							subIvShipActMapL.removeAll(subIvShipActMapL.subList(r->isSame(r.ship_act_d_no(), dtlR.ship_act_d_no())));
						}
					}
					
					MCNumber noShipIvQty = ivQty.subtract(nvl(subIvShipActMapL.sum(MST_IV_SHIP_ACT_MAP_R.$base_unit_qty), MCNumber.ZERO));
					
					if (shipActQty.gt(noShipIvQty)) {
						_errMsgList.add(new MCMessage(chkR, null, MSBEL1113, chkR.ship_schd_no(), chkR.iv_d_no(), shipActQty,noShipIvQty, toDispGUIIndex(chkR)));
					}
				}
			}

			if (!chkNoIvDtlL.isEmpty()) {
				for (ShipAct_DtlR chkR : chkNoIvDtlL) {
					
					MCList<MST_IV_SHIP_ACT_MAP_R> subIvShipActMapL = _ivShipActMapL.subList(_fixIvShipActMapIdxkey, chkR.ship_act_d_no(), true);
					MCNumber fixQty = nvl(subIvShipActMapL.sum(MST_IV_SHIP_ACT_MAP_R.$base_unit_qty), MCNumber.ZERO);
					
					if (MAC_DATA_CRUD_TYP.isDEL(chkR.data_crud_typ()) && fixQty.isPositive()) {
						_errMsgList.add(new MCMessage(chkR, null, MSBEL1117, chkR.ship_act_d_no(),  toDispGUIIndex(chkR)));
					}
					else if (MAC_DATA_CRUD_TYP.isUPD(chkR.data_crud_typ())){
						if (chkR.base_unit_qty().lt(fixQty)) {
							_errMsgList.add(new MCMessage(chkR, null, MSBEL1112, chkR.ship_act_d_no(), chkR.base_unit_qty(), fixQty, toDispGUIIndex(chkR)));
						}
					}
				}
			}
			
			if (!chkShipBasisDtlL.isEmpty()) {
				
				MCIndexKey shipInstIdxkey = chkShipBasisDtlL.createIndex(ShipAct_DtlR.$iv_d_no, ShipAct_DtlR.$ship_inst_d_no);
				
				MCList<MST_IV_SHIP_INST_MAP_R> ivShipInstMapL = getIvShipInstMapL(chkShipBasisDtlL);
				for (MCList<MST_IV_SHIP_INST_MAP_R> mapL : ivShipInstMapL.groupList(MST_IV_R.$iv_no)) {
					
					boolean errFlg = false;
					MCList<ShipAct_DtlR> chkL = MCList.create(ShipAct_DtlR.class);
					for (MST_IV_SHIP_INST_MAP_R mapR : mapL) {
						
						MCList<ShipAct_DtlR> subChkL = chkShipBasisDtlL.subList(shipInstIdxkey, mapR.iv_d_no(), mapR.ship_inst_d_no());
						if (subChkL.isEmpty()) {
							errFlg = true;
						}
						else {
							chkL.addAll(subChkL);
						}
					}
					
					if (errFlg) {
						for (ShipAct_DtlR chkR : chkL) {
							_errMsgList.add(new MCMessage(chkR, null, MSBEL1131,
									mapL.get(0).getStringNE(MST_IV_R.$iv_no),
									String.join(",", mapL.distinctNE(MST_SHIP_INST_D_R.$ship_inst_no).getStringNE(MST_SHIP_INST_D_R.$ship_inst_no)), toDispGUIIndex(chkR)));
						}
					}
					else {
						for (MST_IV_SHIP_INST_MAP_R ivDR : mapL.distinctNE(MST_IV_D_R.$iv_d_no)) {
							
							MCList<ShipAct_DtlR> chkIvDL = chkL.subList(ShipAct_DtlR.$iv_d_no, ivDR.iv_d_no());
							MCNumber shipQty =  chkIvDL.sum(ShipAct_DtlR.$base_unit_qty);
							if (!ivDR.base_unit_qty().eq(shipQty)) {
								
								ShipAct_DtlR chkR = chkIvDL.get(0);
								_errMsgList.add(new MCMessage(chkR, null, MSBEL1132,
										ivDR.iv_d_no(),
										shipQty, ivDR.base_unit_qty(), toDispGUIIndex(chkR)));
							}
						}
					}
					
					MCIndexKey hdrIdxkey = hdrL.createIndex(ShipAct_HdrR.$peg_no);
					MCList<ShipAct_HdrR> chkHdrL = hdrL.createInstance();
					chkHdrL.addDateColumn("ship_dt");
					for (ShipAct_DtlR chkR : chkL) {
						ShipAct_HdrR hdrR = hdrL.getFirst(hdrIdxkey, chkR.hdr_peg_no()).clone();
						hdrR.setValueNE("ship_dt", hdrR.ship_tm().startTimeOfDay());
						chkHdrL.add(hdrR);
					}
					if (chkHdrL.distinctNE(ShipAct_HdrR.$ac_dt).size() > 1 || chkHdrL.distinctNE("ship_dt").size() > 1) {
						for (ShipAct_HdrR hdrR : chkHdrL) {
							_errMsgList.add(new MCMessage(hdrR, null, MSBEL1130, 
									mapL.get(0).getStringNE(MST_IV_R.$iv_no),
									String.join(",", mapL.distinctNE(MST_SHIP_INST_D_R.$ship_inst_no).getStringNE(MST_SHIP_INST_D_R.$ship_inst_no)), toDispGUIIndex(hdrR)));
						}
					}
				}
			}
		}
		
		/**
		 * インボイス出荷実績マップを取得する。
		 * @return インボイス出荷実績マップ
		 */
		protected void getIvShipActMapL() {
			
			_ivShipActMapL = MCList.create(MST_IV_SHIP_ACT_MAP_R.class);
			
			MST_IV_SHIP_ACT_MAP_R ivShipActMap = MST_IV_SHIP_ACT_MAP_R.create("IVSHIPACTMAP");
			MCQueryApiBuilder ivShipActMap_bldr = MCQueryApiBuilder.create(ivShipActMap);
			ivShipActMap_bldr.setSelect(ivShipActMap.ship_act_d_no, ivShipActMap.iv_d_no, ivShipActMap.base_unit_qty, ivShipActMap.fix_flg);
			ivShipActMap_bldr.setWhere(ivShipActMap.ship_act_d_no.eq(bind(ShipAct_DtlR.$ship_act_d_no)));
			
			dbSelect("MSBEL5540_MST_IV_SHIP_ACT_MAP_S01", _ivShipActMapL, ivShipActMap_bldr, up1());
			
			_ivShipActMapIdxkey = _ivShipActMapL.createIndex(MST_IV_SHIP_ACT_MAP_R.$ship_act_d_no);
			_fixIvShipActMapIdxkey = _ivShipActMapL.createIndex(MST_IV_SHIP_ACT_MAP_R.$ship_act_d_no, MST_IV_SHIP_ACT_MAP_R.$fix_flg);
		}
		
		/**
		 * 引数に指定されたリストのインボイス明細NOを元に、インボイス出荷実績マップを取得する。
		 * @param dtlL 出荷実績明細リスト
		 * @return インボイス出荷実績マップ
		 */
		protected MCList<MST_IV_SHIP_ACT_MAP_R> getIvShipActMapL(MCList<ShipAct_DtlR> dtlL) {
			
			MCList<MST_IV_SHIP_ACT_MAP_R> ivShipActMapL = MCList.create(MST_IV_SHIP_ACT_MAP_R.class);
			
			MST_IV_SHIP_ACT_MAP_R ivShipActMap = MST_IV_SHIP_ACT_MAP_R.create("IVSHIPACTMAP");
			MST_IV_D_R ivD = MST_IV_D_R.create("IVD");
			
			MCQueryApiBuilder ivShipActMap_bldr = MCQueryApiBuilder.create(ivD);
			ivShipActMap_bldr.setSelect(ivShipActMap.ship_act_d_no, ivShipActMap.base_unit_qty);
			ivShipActMap_bldr.addSelect(ivD.iv_d_no,ivD.base_unit_qty.as("iv_qty"));
			ivShipActMap_bldr.addLeftOuterJoin(ivShipActMap, ivD.iv_d_no.eq(ivShipActMap.iv_d_no));
			ivShipActMap_bldr.setWhere(ivD.iv_d_no.eq(bind(ShipAct_DtlR.$iv_d_no)));
			
			dbSelect("MSBEL5540_MST_IV_SHIP_ACT_MAP_S02", ivShipActMapL, ivShipActMap_bldr, dtlL);
			
			return ivShipActMapL;
		}
		
		/**
		 * 引数に指定されたリストのインボイス明細NOを元に、インボイス出荷指図マップを取得する。
		 * @param dtlL 出荷指図明細リスト
		 * @return インボイス出荷指図マップ
		 */
		protected MCList<MST_IV_SHIP_INST_MAP_R> getIvShipInstMapL(MCList<ShipAct_DtlR> dtlL) {
			
			MCList<MST_IV_SHIP_INST_MAP_R> ivShipInstMapL = MCList.create(MST_IV_SHIP_INST_MAP_R.class);
			ivShipInstMapL.addStringColumn(MST_SHIP_INST_D_R.$ship_inst_no);
			
			MST_IV_SHIP_INST_MAP_R ivShipInstMap = MST_IV_SHIP_INST_MAP_R.create("ISIM");
			MST_IV_D_R ivD = MST_IV_D_R.create("IVD");
			MST_IV_R iv = MST_IV_R.create("IV");
			MST_SHIP_INST_D_R shipInstD = MST_SHIP_INST_D_R.create("SHIPINSTD");
			MST_IV_SHIP_INST_MAP_R s1IvShipInstMap = MST_IV_SHIP_INST_MAP_R.create("S1ISIM");
			MST_IV_D_R s1IvD = MST_IV_D_R.create("S1IVD");
			
			MCQueryApiBuilder ivShipInstMap_bldr = MCQueryApiBuilder.create(ivShipInstMap);
			ivShipInstMap_bldr.setDistinct();
			ivShipInstMap_bldr.setSelect(ivShipInstMap.ship_inst_d_no, ivShipInstMap.iv_d_no);
			ivShipInstMap_bldr.addSelect(ivD.base_unit_qty);
			ivShipInstMap_bldr.addSelect(iv.iv_no);
			ivShipInstMap_bldr.addSelect(shipInstD.ship_inst_no);
			ivShipInstMap_bldr.addInnerJoin(ivD, ivShipInstMap.iv_d_no.eq(ivD.iv_d_no));
			ivShipInstMap_bldr.addInnerJoin(iv, iv.iv_mng_no.eq(ivD.iv_mng_no));
			ivShipInstMap_bldr.addInnerJoin(shipInstD, ivShipInstMap.ship_inst_d_no.eq(shipInstD.ship_inst_d_no));
			ivShipInstMap_bldr.setWhere(exists(subQuery().select(value("x")).from(
					s1IvShipInstMap.innerJoin(s1IvD).on(s1IvShipInstMap.iv_d_no.eq(s1IvD.iv_d_no)))
					.where(s1IvD.iv_mng_no.eq(iv.iv_mng_no).and(s1IvShipInstMap.ship_inst_d_no.eq(bind(ShipAct_DtlR.$ship_inst_d_no))))));
			
			dbSelect("MSBEL5540_MST_IV_SHIP_INST_MAP_S01", ivShipInstMapL, ivShipInstMap_bldr, dtlL);
			
			return ivShipInstMapL;
		}
		
		/**
		 * 計画外かつインボイスが登録済か判定する。
		 * @param hdrR インボイスヘッダ
		 * @param dtlR インボイス明細
		 * @return  計画外かつインボイスが登録済はtrue
		 */
		protected boolean existUplndIv(ShipAct_HdrR hdrR, ShipAct_DtlR dtlR) {
			if (hdrR.uplnd_flg() && !hdrR.uplnd_iv_sls_flg()) {
				MCList<MST_IV_SHIP_ACT_MAP_R> subIvShipActMapL = _ivShipActMapL.subList(_ivShipActMapIdxkey, dtlR.ship_act_d_no());
				
				return !subIvShipActMapL.isEmpty();
			}
			
			return false;
		}
		
		protected boolean isIvTrd(ShipAct_HdrR hdrR, ShipAct_DtlR dtlR) {
			if (hdrR.uplnd_flg()) {
				if (isSlsOrShip(dtlR) && !isNull(hdrR.cst_cd())) {
					return getBpR(hdrR.cst_cd()).cst_iv_flg();
				}
				else {
					return false;
				}
			}
			MST_SHIP_ALLOC_STS_R sasR = getShipAllocStsL(dtlR).get(0);
			if (isSlsOrShip(dtlR)) {
				return sasR.getBoolean("cst_iv_flg");
			}
			else {
				return sasR.getBoolean("iv_trd_flg");
			}
		}
		
		protected boolean isUpdTgt(ShipAct_DtlR dtlR, MST_SHIP_ACT_D_R actDR) {
			if (!isSame(dtlR.base_unit_qty(), actDR.base_unit_qty()) || dtlR.abort_flg()) {
				return true;
			}
			return false;
		}

		/**
		 * 固有エラーチェック（品目マスタ関連）
		 */
		protected void checkItm(MCList<ShipAct_HdrR> hdrL, MCList<ShipAct_DtlR> dtlL) {
			for (ShipAct_DtlR r : dtlL) {
				MAM_ITM_R itmR = getItmR(r);
				if (itmR.isEmpty()) {
					_errMsgList.add(new MCMessage(r, null, MAUAL0189,
							toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), toDispGUIIndex(r)));
				}
			}
		}
		
		/**
		 * 固有エラーチェック（場所マスタ関連）
		 */
		protected void checkLoc(MCList<ShipAct_HdrR> hdrL, MCList<ShipAct_DtlR> dtlL) {
			for (ShipAct_HdrR h : hdrL) {
				for (ShipAct_DtlR r : h.getJoined(_dtlJk)) {
					if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
						if (isNull(r.ship_loc_cd())) {
							_errMsgList.add(new MCMessage(r, null, MSBEL0261,
									h.ship_fr_lg_grp_cd(), toDispGUIIndex(r)));
						}
					}
				}
			}
		}

		/**
		 * ロット・サブロット混在不可チェック
		 */
		protected void chkNotLotMix(MCList<ShipAct_HdrR> hdrL,
				MCList<ShipAct_DtlR> dtlL) {
			
			MCList<ShipAct_HdrR> chkHdrL = createShipAct_HdrL();
			for (ShipAct_HdrR hdrR : hdrL) {
				// 計画外、または削除はチェック不要
				if (hdrR.uplnd_flg()
					|| MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
					continue;
				}
				chkHdrL.add(hdrR);
			}

			// 「売上」「出荷」のみ＆削除行は対象外（出荷対象とはみなさない）
			MCIndexKey chkHdrIdx = chkHdrL.createIndex(ShipAct_HdrR.$peg_no);
			MCList<ShipAct_DtlR> chkDtlL = createShipAct_DtlL();
			for (ShipAct_DtlR r : dtlL) {
				if (isSlsOrShip(r)
					&& !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())
					&& !isNull(chkHdrL.getFirst(chkHdrIdx, r.hdr_peg_no()))) {
					chkDtlL.add(r);
				}
			}
			
			// 同一受注明細、出荷予定の同一品目でロット・サブロットの混在をチェックするためのindexKey
			MCIndexKey lotMixIdxKey = chkDtlL.createIndex(
					ShipAct_DtlR.$slo_d_no,
					ShipAct_DtlR.$ship_schd_no,
					ShipAct_DtlR.$itm_cd,
					ShipAct_DtlR.$itm_sub1,
					ShipAct_DtlR.$itm_sub2,
					ShipAct_DtlR.$itm_sub3);
			
			for (ShipAct_DtlR r : chkDtlL) {
				String dispItm = toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				String dispGUIIndex = toDispGUIIndex(r);
				
				MCList<ShipAct_DtlR> subL = chkDtlL.subList(lotMixIdxKey, r.slo_d_no(),
						r.ship_schd_no(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(),
						r.itm_sub3());
				MAM_ITM_R itmR = getItmR(r);
				// ロット、サブロット混在（同一受注明細ＮＯ、出荷予定ＮＯ単位の同一品目）
				if (!MAC_LOT_MNG_TYP.isNOT_MNG(itmR.lot_mng_typ())) {
					if (r.not_lot_mix_flg()) {
						for (ShipAct_DtlR subR : subL) {
							if (isNullOr(r.lot_no(), subR.lot_no())) {
								continue;
							}
							if (!isSame(r.lot_no(), subR.lot_no())) {
								_errMsgList.add(new MCMessage(r, null, MSBEL1201, dispItm,
										dispGUIIndex));
								break;
							}
						}
					}
					if (!MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmR.sublot_mng_typ())
							&& r.not_sublot_mix_flg()) {
						for (ShipAct_DtlR subR : subL) {
							if (isNullOr(r.lot_no(), subR.lot_no(), r.sublot_no(),
									subR.sublot_no())) {
								continue;
							}
							if (isSame(r.lot_no(), subR.lot_no())
									&& !isSame(r.sublot_no(), subR.sublot_no())) {
								_errMsgList.add(new MCMessage(r, null, MSBEL1202, dispItm,
										dispGUIIndex));
								break;
							}
						}
					}
				}
			}
		}

		protected String getCntryCd(ShipAct_DtlR dtlR) {
			if (isSlsOrShip(dtlR)) {
				MAM_BP_R bpR =  getBpR(dtlR.dlv_id_cd());
				return bpR.cntry_cd();
			}
			else {
				MAM_LOC_R locR =  getLocR(dtlR.dlv_id_cd());
				return locR.cntry_cd();
			}
		}
		protected MST_SLO_D_R getSloDR(String sloDNo) {
			MST_SLO_D_R SLOD = MST_SLO_D_R.create("SLOD");
			MST_SHIP_PR_R SHIPPR = MST_SHIP_PR_R.create("SHIPPR");
			MCQueryApiBuilder sloDBldr = MCQueryApiBuilder.create(SLOD);
			sloDBldr.setSelect(SLOD.abort_flg, SHIPPR.ship_inst_qty, SHIPPR.ship_act_qty);
			sloDBldr.addInnerJoin(SHIPPR, bracket(SHIPPR.slo_d_no.eq(SLOD.slo_d_no)));
			sloDBldr.setWhere(SLOD.slo_d_no.eq(bind("1")), sloDNo);
			sloDBldr.addWhereWithAnd(SLOD.can_flg.eq(value(false)));
			dbSelect("MSBEL5540_MST_SLO_D_S01", SLOD, sloDBldr);
			
			return SLOD;
		}
		protected MST_SHIP_ACT_D_R getActDR(String shipActDNo) {
			MST_SHIP_ACT_D_R actDR = MST_SHIP_ACT_D_R.create("SHIPACTD");
			MCQueryApiBuilder actDRBldr = MCQueryApiBuilder.create(actDR);
			actDRBldr.setSelect(actDR.ship_act_d_no, actDR.ship_act_no, actDR.base_unit_qty);
			actDRBldr.setWhere(actDR.ship_act_d_no.eq(bind("1")), shipActDNo);
			actDRBldr.addWhereWithAnd(actDR.can_flg.eq(value(false)));
			dbSelect("MSBEL5540_MST_SHIP_ACT_D_S10", actDR, actDRBldr);
			
			return actDR;
		}
		
		protected void getExCtrL() {
			
			_up1.addStringColumn(MAM_EX_CTRL_R.$hs_cd);
			_up1.addStringColumn(MAM_EX_CTRL_R.$cntry_cd);

			MCList<MAM_EX_CTRL_R> bindL = MCList.create(MAM_EX_CTRL_R.class);
			
			for (ShipAct_DtlR dtlR : _up1) {
				MAM_ITM_R itmR = getItmR(dtlR);
				String cntryCd = getCntryCd(dtlR);

				dtlR.setString(MAM_EX_CTRL_R.$hs_cd, itmR.hs_cd());
				dtlR.setString(MAM_EX_CTRL_R.$cntry_cd, cntryCd);

				if(!isNull(itmR.hs_cd()) && !isNull(cntryCd)) {
					MAM_EX_CTRL_R r = MAM_EX_CTRL_R.create();
					r.hs_cd(itmR.hs_cd());
					r.cntry_cd(cntryCd);

					bindL.add(r);
				}
			}

			_exCtrl = MCList.create(MAM_EX_CTRL_R.class);
			MCQueryApiBuilder exCtrl_bldr = MCQueryApiBuilder.create(MAM_EX_CTRL_R.create("T"));
			
			if (!bindL.isEmpty()) {
				dbSelectColumn("MSBEL5540_MAM_EX_CTRL_S01", _exCtrl, exCtrl_bldr, new String[] {
						MAM_EX_CTRL_R.$hs_cd, MAM_EX_CTRL_R.$cntry_cd
				}, bindL, new String[] {
						MAM_EX_CTRL_R.$hs_cd, MAM_EX_CTRL_R.$cntry_cd
				});
			}
			
			_idxExCtrl = _exCtrl.createIndex(MAM_EX_CTRL_R.$hs_cd, MAM_EX_CTRL_R.$cntry_cd);
		}
		
		/**
		 * 指定された品目は輸出規制かどうか。
		 */
		protected boolean chkExCtrl(ShipAct_HdrR hdrR, ShipAct_DtlR dtlR) {

			String hs_cd = dtlR.getString(MAM_EX_CTRL_R.$hs_cd);
			String cntry_cd = dtlR.getString(MAM_EX_CTRL_R.$cntry_cd);
			
			if(!isIvTrd(hdrR, dtlR) || isNull(hs_cd) || isNull(cntry_cd)) {
				return false;
			}

			boolean exCtrFlg = false;
			MCDate shipDt = hdrR.ship_tm().trunc(MCDateFieldType.DAY);

			for (MAM_EX_CTRL_R exCtrR : _exCtrl.subList(_idxExCtrl, hs_cd, cntry_cd)) {
				
				if (exCtrR.st_dt().lte(shipDt) && exCtrR.end_dt().gte(shipDt)) {
					
					exCtrFlg = true;
					break;
				}
			}
			
			return exCtrFlg;
		}
		/**
		 * 引当管理サービスを実行し、出荷対象の在庫が存在するか（マイナス在庫許可品の場合は在庫または入庫予定が存在するか）チェックします。
		 * 受払実績サービスでもマイナス在庫チェックを実施していますが、マイナス在庫許可品の場合は実施されないため、当機能でチェックする必要があります。
		 * マイナス在庫許可品のみチェックするか、またはすべての品目をチェックするかどうかは、物流Ｇマスタの出庫時マイナス在庫確認フラグにより制御します。（オンの場合はすべての品目）
		 * フラグをオフにすると、マイナス在庫許可品以外のチェックは受払実績サービスで実施されますが、その場合は行単位にチェックが行われず、マイナス在庫が発生すると全行がエラーとなります。
		 * フラグをオンにして当機能でチェックを実施すれば、どの行でエラーとなったか判断することができ、エラーとならなかった行は登録されます。
		 * @param dtlL
		 * @param hdrJk
		 */
		protected void chkMinusStk(MCList<ShipAct_DtlR> dtlL,
				MCJoinKey<MCList<ShipAct_HdrR>> hdrJk, MCList<ShipAct_Del_DtlR> delL) {
			MCList<ShipAct_DtlR> tgtL = MCList.create(ShipAct_DtlR.class);
			MCList<ShipAct_DtlR> stkL = MCList.create(ShipAct_DtlR.class);
			MCList<ShipAct_DtlR> allocL = MCList.create(ShipAct_DtlR.class);
			
			if(!isEmpty(up0().subList(ShipAct_HdrR.$sls_dtl_mod_flg, true))) {
				return;
			}

			// 上り電文をロット提案対象のレコード、取消対象のレコードに分ける
			for (ShipAct_DtlR r : dtlL) {
				// エラー行は対象外
				if (r.err_flg()) {
					continue;
				}
				//在庫管理しない品目は対象外
				MAM_ITM_R itm = getItmR(r);
				r.stk_mng_typ(itm.stk_mng_typ());
				if (!MAC_STK_MNG_TYP.isMNG(itm.stk_mng_typ())) {
					continue;
				}
				ShipAct_HdrR hdrR = r.getJoinedRow(hdrJk);
				if (hdrR.err_flg()) {
					continue;
				}

				// 物流グループに設定された出庫時マイナス在庫確認フラグがオフの場合、マイナス在庫許可品のみ対象とする
				MAM_LG_GRP_R lgGrp = getLgGppR(hdrR.ship_fr_lg_grp_cd());
				if (!lgGrp.gi_minus_stk_chk_flg()) {
					if (!isMinusStkItm(r)) {
						continue;
					}
				}

				if (!hdrR.uplnd_flg()) {
					MST_SHIP_ALLOC_STS_R sasR = getShipAllocStsR(r);
					// 同時計上
					if (MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ())
							&& sasR.getBoolean("purc_ddlv_flg")
							&& r.purc_sync_flg()) {
						continue;
					}
				}

				// ヘッダ行の値を明細の一時カラムにセット
				setTmpCol(hdrR, r);

				// 削除行以外（新規行、更新行）はチェック対象
				if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					tgtL.add(r);
				}
				// 新規行以外（更新行、削除行）は引当可能在庫として戻す対象
				if (!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					// キャッシュから更新前のレコードを取得する
					stkL.add(getShipActDR(r.ship_act_d_no()));
				}
				// 実績登録より前（指図時など）に引当が行われている場合、引当可能在庫として戻す対象
				if (!isNull(r.ship_alloc_sts_no())) {
					allocL.add(r);
				}
			}
			if (tgtL.isEmpty()) {
				return;
			}

			// 引当管理サービスの引当ロックを実行
			callAllocLockSrv(tgtL);

			// 削除対象リストが設定されている場合、移動実績明細を取得して引当可能在庫として戻す対象にする
			stkL.addAll(getStkFromShipActD(delL));

			// 引当管理サービスのロット提案を実行
			callAllocSrchSrv(tgtL, stkL, allocL);
		}

		/**
		 * マイナス在庫許可品かどうか判断する
		 * @param r
		 * @return
		 */
		protected boolean isMinusStkItm(ShipAct_DtlR r) {
			// システムパラメータの出荷実績マイナス在庫許可フラグがオンでない場合は不許可
			if (!isSame(getSysParm("MINUS_STK_SHIP_FLG"), "1")) {
				return false;
			}
			MAM_ITM_R itm = getItmR(r);
			// 移動実績マイナス在庫許可フラグがオンの場合は品目マスタのマイナス在庫許可フラグに従う
			return itm.minus_stk_flg();
		}

		/**
		 * ヘッダの値を明細の一時カラムに設定する
		 * @param hdrR
		 * @param r
		 */
		protected void setTmpCol(ShipAct_HdrR hdrR, ShipAct_DtlR r) {
			r.setDateNE("tmp_gi_schd_dt", hdrR.ship_tm());
			r.setBooleanNE("tmp_ex_flg", (isIvTrd(hdrR, r) && MAC_VIA_DLV_TYP.isVIA(hdrR.via_dlv_typ())));
		}

		/**
		 * 削除対象リストの出荷実績明細を抽出し、引当可能在庫として戻すためのリストを作成する
		 * @param delL 削除対象リスト
		 * @return 引当可能在庫リスト
		 */
		protected MCList<ShipAct_DtlR> getStkFromShipActD(MCList<ShipAct_Del_DtlR> delL) {
			MCList<ShipAct_DtlR> stkL = MCList.create(ShipAct_DtlR.class);
			if (delL.isEmpty()) {
				return stkL;
			}

			// 削除対象リストが設定されている場合、引当可能在庫として戻す対象にするため、出荷実績明細を抽出
			MCList<MST_SHIP_ACT_D_R> dbcL = MCList.create(MST_SHIP_ACT_D_R.class);
			MST_SHIP_ACT_D_R t = MST_SHIP_ACT_D_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
					t.ship_loc_cd, t.ship_str_ln_cd, t.stk_arrv_bp_cd, t.lot_no,
					t.sublot_no, t.sno1, t.sno2, t.sno3, t.sno4, t.pack_unit_qty,
					t.pack_unit_cd, t.gd_cd, t.quality_typ, t.stk_id_typ, t.stk_bp_cd,
					t.base_unit_qty);
			dbcL_bldr.setWhere(t.ship_act_d_no.eq(bind("ship_act_d_no")));
			dbSelect("MSBEL5540_MST_SHIP_ACT_D_S01", dbcL, dbcL_bldr, delL);
			addAll(stkL, dbcL, createMap_ShipAct_DtlR_MST_SHIP_ACT_D_R());
			return stkL;
		}

		/**
		 * 引当管理サービスの引当ロックを実行する
		 * @param tgtL 引当対象リスト
		 */
		protected void callAllocLockSrv(MCList<ShipAct_DtlR> tgtL) {
			// 品目、枝番、出荷場所で引当ロックサービスを実行
			String[] lockKeys = new String[] {
					ShipAct_DtlR.$itm_cd, ShipAct_DtlR.$itm_sub1,
					ShipAct_DtlR.$itm_sub2, ShipAct_DtlR.$itm_sub3,
					ShipAct_DtlR.$ship_loc_cd
			};
			MCList<ShipAct_DtlR> lockL = tgtL.groupBy(lockKeys);
			MSBEL_AllocMngService.Alloc_Lock_Upd01 o = MSBEL_AllocMngService.crtAlloc_Lock_Upd01();
			addAll(o.up0(), lockL, createMap_MSW_ALLOC_LOC_MAP_R_ShipAct_DtlR());
			o.exec();
		}

		/**
		 * 引当管理サービスのロット提案を実行する
		 * @param tgtL ロット提案対象リスト
		 * @param stkL 引当可能在庫とみなすリスト
		 * @param allocL 指図時の引当情報を開放するためのリスト
		 */
		protected void callAllocSrchSrv(MCList<ShipAct_DtlR> tgtL, MCList<ShipAct_DtlR> stkL,
				MCList<ShipAct_DtlR> allocL) {
			// ロット提案サービスを実行
			MSBEL_AllocMngService.Alloc_Srch01 o = MSBEL_AllocMngService.crtAlloc_Srch01();
			o.up0().short_ope_typ(MSC_SHORT_OPE_TYP.PROCEED.value()); //不足時処理区分は1:継続
			o.up0().addBooleanColumn("minus_stk_chk_flg", true); //マイナス在庫確認
			o.up0().except_alloc_wait_flg(true);
			addAll(o.up1(), tgtL, createMap_Srch_TgtR_ShipAct_DtlR()); // ロット提案対象
			addAll(o.up2(), stkL, createMap_Srch_StkR_ShipAct_DtlR()); // 更新前または削除行を引当可能在庫として戻す
			addAll(o.up3(), allocL, createMap_Srch_Io_SchdR_ShipAct_DtlR()); // 引当済行を引当可能在庫として戻す
			o.exec();

			// 引当に失敗したレコードが存在する場合はエラー
			if (!o.down2().isEmpty()) {
				MCMessageList msgList = new MCMessageList();
				MCIndexKey idx = tgtL.createIndex(ShipAct_DtlR.$peg_no);
				for (Srch_TgtR errR : o.down2()) {
					ShipAct_DtlR r = tgtL.getFirst(idx, errR.peg_no());
					r.err_flg(true);
					if (isMinusStkItm(r)) {
						// マイナス在庫許可の場合のエラーメッセージ
						msgList.add(new MCMessage(r, null, MSBEL1029,
								toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(),
										r.itm_sub3()),
								r.ship_loc_cd(), r.ship_str_ln_cd(), r.lot_no(), r.sublot_no(),
								toDispSno(r.sno1(), r.sno2(), r.sno3(), r.sno4()),
								r.trd_unit_cd(), r.gd_cd(), r.quality_typ(), r.stk_id_typ(),
								r.stk_bp_cd(), toDispGUIIndex(r)));
					}
					else {
						// マイナス在庫許可でない場合のエラーメッセージ
						msgList.add(new MCMessage(r, null, MSBEL1028,
								toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(),
										r.itm_sub3()),
								r.ship_loc_cd(), r.ship_str_ln_cd(), r.lot_no(), r.sublot_no(),
								toDispSno(r.sno1(), r.sno2(), r.sno3(), r.sno4()),
								r.trd_unit_cd(), r.gd_cd(), r.quality_typ(), r.stk_id_typ(),
								r.stk_bp_cd(), toDispGUIIndex(r)));
					}
				}
				MCMessagePool.addAll(msgList);
			}
		}

		protected Map_ShipAct_DtlR_MST_SHIP_ACT_D_R<ShipAct_DtlR,MST_SHIP_ACT_D_R> createMap_ShipAct_DtlR_MST_SHIP_ACT_D_R() {
			return new Map_ShipAct_DtlR_MST_SHIP_ACT_D_R<ShipAct_DtlR, MST_SHIP_ACT_D_R>();
		}

		public class Map_ShipAct_DtlR_MST_SHIP_ACT_D_R<D extends ShipAct_DtlR, S extends MST_SHIP_ACT_D_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ShipAct_DtlR.$itm_cd, MST_SHIP_ACT_D_R.$itm_cd);
				addColumnPathMap(ShipAct_DtlR.$itm_sub1, MST_SHIP_ACT_D_R.$itm_sub1);
				addColumnPathMap(ShipAct_DtlR.$itm_sub2, MST_SHIP_ACT_D_R.$itm_sub2);
				addColumnPathMap(ShipAct_DtlR.$itm_sub3, MST_SHIP_ACT_D_R.$itm_sub3);
				addColumnPathMap(ShipAct_DtlR.$ship_loc_cd, MST_SHIP_ACT_D_R.$ship_loc_cd);
				addColumnPathMap(ShipAct_DtlR.$ship_str_ln_cd, MST_SHIP_ACT_D_R.$ship_str_ln_cd);
				addColumnPathMap(ShipAct_DtlR.$stk_arrv_bp_cd, MST_SHIP_ACT_D_R.$stk_arrv_bp_cd);
				addColumnPathMap(ShipAct_DtlR.$lot_no, MST_SHIP_ACT_D_R.$lot_no);
				addColumnPathMap(ShipAct_DtlR.$sublot_no, MST_SHIP_ACT_D_R.$sublot_no);
				addColumnPathMap(ShipAct_DtlR.$sno1, MST_SHIP_ACT_D_R.$sno1);
				addColumnPathMap(ShipAct_DtlR.$sno2, MST_SHIP_ACT_D_R.$sno2);
				addColumnPathMap(ShipAct_DtlR.$sno3, MST_SHIP_ACT_D_R.$sno3);
				addColumnPathMap(ShipAct_DtlR.$sno4, MST_SHIP_ACT_D_R.$sno4);
				addColumnPathMap(ShipAct_DtlR.$pack_unit_qty, MST_SHIP_ACT_D_R.$pack_unit_qty);
				addColumnPathMap(ShipAct_DtlR.$pack_unit_cd, MST_SHIP_ACT_D_R.$pack_unit_cd);
				addColumnPathMap(ShipAct_DtlR.$gd_cd, MST_SHIP_ACT_D_R.$gd_cd);
				addColumnPathMap(ShipAct_DtlR.$quality_typ, MST_SHIP_ACT_D_R.$quality_typ);
				addColumnPathMap(ShipAct_DtlR.$stk_id_typ, MST_SHIP_ACT_D_R.$stk_id_typ);
				addColumnPathMap(ShipAct_DtlR.$stk_bp_cd, MST_SHIP_ACT_D_R.$stk_bp_cd);
				addColumnPathMap(ShipAct_DtlR.$base_unit_qty, MST_SHIP_ACT_D_R.$base_unit_qty);
			}
		}

		protected Map_MSW_ALLOC_LOC_MAP_R_ShipAct_DtlR<MSW_ALLOC_LOC_MAP_R,ShipAct_DtlR> createMap_MSW_ALLOC_LOC_MAP_R_ShipAct_DtlR() {
			return new Map_MSW_ALLOC_LOC_MAP_R_ShipAct_DtlR<MSW_ALLOC_LOC_MAP_R, ShipAct_DtlR>();
		}

		public class Map_MSW_ALLOC_LOC_MAP_R_ShipAct_DtlR<D extends MSW_ALLOC_LOC_MAP_R, S extends ShipAct_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_cd, ShipAct_DtlR.$itm_cd);
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub1, ShipAct_DtlR.$itm_sub1);
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub2, ShipAct_DtlR.$itm_sub2);
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub3, ShipAct_DtlR.$itm_sub3);
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$gi_loc_cd, ShipAct_DtlR.$ship_loc_cd);
			}
		}

		protected Map_Srch_TgtR_ShipAct_DtlR<Srch_TgtR,ShipAct_DtlR> createMap_Srch_TgtR_ShipAct_DtlR() {
			return new Map_Srch_TgtR_ShipAct_DtlR<Srch_TgtR, ShipAct_DtlR>();
		}

		public class Map_Srch_TgtR_ShipAct_DtlR<D extends Srch_TgtR, S extends ShipAct_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch_TgtR.$peg_no, ShipAct_DtlR.$peg_no);
				addColumnPathMap(Srch_TgtR.$itm_cd, ShipAct_DtlR.$itm_cd);
				addColumnPathMap(Srch_TgtR.$itm_sub1, ShipAct_DtlR.$itm_sub1);
				addColumnPathMap(Srch_TgtR.$itm_sub2, ShipAct_DtlR.$itm_sub2);
				addColumnPathMap(Srch_TgtR.$itm_sub3, ShipAct_DtlR.$itm_sub3);
				addColumnPathMap(Srch_TgtR.$gi_loc_cd, ShipAct_DtlR.$ship_loc_cd);
				addColumnPathMap(Srch_TgtR.$gi_str_ln_cd, ShipAct_DtlR.$ship_str_ln_cd);
				addColumnPathMap(Srch_TgtR.$gi_stk_arrv_bp_cd, ShipAct_DtlR.$stk_arrv_bp_cd);
				addColumnPathMap(Srch_TgtR.$quality_typ, ShipAct_DtlR.$quality_typ);
				addColumnPathMap(Srch_TgtR.$stk_id_typ, ShipAct_DtlR.$stk_id_typ);
				addColumnPathMap(Srch_TgtR.$stk_bp_cd, ShipAct_DtlR.$stk_bp_cd);
				addColumnPathMap(Srch_TgtR.$gd_cd, ShipAct_DtlR.$gd_cd);
				addColumnPathMap(Srch_TgtR.$lot_no, ShipAct_DtlR.$lot_no);
				addColumnPathMap(Srch_TgtR.$sublot_no, ShipAct_DtlR.$sublot_no);
				addColumnPathMap(Srch_TgtR.$sno1, ShipAct_DtlR.$sno1);
				addColumnPathMap(Srch_TgtR.$sno2, ShipAct_DtlR.$sno2);
				addColumnPathMap(Srch_TgtR.$sno3, ShipAct_DtlR.$sno3);
				addColumnPathMap(Srch_TgtR.$sno4, ShipAct_DtlR.$sno4);
				addColumnPathMap(Srch_TgtR.$base_unit_cd, ShipAct_DtlR.$base_unit_cd);
				addColumnPathMap(Srch_TgtR.$base_unit_qty, ShipAct_DtlR.$base_unit_qty);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.gi_schd_dt(src.getDateNE("tmp_gi_schd_dt"));

				MAVM_ITM_UNIT_R unitR = getItmUnitR(src);
				if (unitR.pack_flg()) {
					dest.pack_unit_cd(src.trd_unit_cd());
					dest.pack_unit_qty(src.trd_unit_qty());
				}
				else {
					dest.pack_unit_cd(src.base_unit_cd());
					dest.pack_unit_qty(src.base_unit_qty());
				}

				// 出庫実績でマイナス在庫許可を有効にしている場合、入庫予定を提案対象とするため、在庫提案ＦＬＧはfalse
				dest.stk_flg(!isMinusStkItm(src));

				// 在庫提案ＦＬＧがfalseの場合は、入庫予定を参照する必要があるため在庫優先引当ＦＬＧをfalseに
				dest.stk_alloc_flg(dest.stk_flg());
			}
		}

		protected Map_Srch_StkR_ShipAct_DtlR<Srch_StkR,ShipAct_DtlR> createMap_Srch_StkR_ShipAct_DtlR() {
			return new Map_Srch_StkR_ShipAct_DtlR<Srch_StkR, ShipAct_DtlR>();
		}

		public class Map_Srch_StkR_ShipAct_DtlR<D extends Srch_StkR, S extends ShipAct_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch_StkR.$itm_cd, ShipAct_DtlR.$itm_cd);
				addColumnPathMap(Srch_StkR.$itm_sub1, ShipAct_DtlR.$itm_sub1);
				addColumnPathMap(Srch_StkR.$itm_sub2, ShipAct_DtlR.$itm_sub2);
				addColumnPathMap(Srch_StkR.$itm_sub3, ShipAct_DtlR.$itm_sub3);
				addColumnPathMap(Srch_StkR.$loc_cd, ShipAct_DtlR.$ship_loc_cd);
				addColumnPathMap(Srch_StkR.$str_ln_cd, ShipAct_DtlR.$ship_str_ln_cd);
				addColumnPathMap(Srch_StkR.$stk_arrv_bp_cd, ShipAct_DtlR.$stk_arrv_bp_cd);
				addColumnPathMap(Srch_StkR.$lot_no, ShipAct_DtlR.$lot_no);
				addColumnPathMap(Srch_StkR.$sublot_no, ShipAct_DtlR.$sublot_no);
				addColumnPathMap(Srch_StkR.$sno1, ShipAct_DtlR.$sno1);
				addColumnPathMap(Srch_StkR.$sno2, ShipAct_DtlR.$sno2);
				addColumnPathMap(Srch_StkR.$sno3, ShipAct_DtlR.$sno3);
				addColumnPathMap(Srch_StkR.$sno4, ShipAct_DtlR.$sno4);
				addColumnPathMap(Srch_StkR.$pack_unit_cd, ShipAct_DtlR.$pack_unit_cd);
				addColumnPathMap(Srch_StkR.$gd_cd, ShipAct_DtlR.$gd_cd);
				addColumnPathMap(Srch_StkR.$quality_typ, ShipAct_DtlR.$quality_typ);
				addColumnPathMap(Srch_StkR.$stk_id_typ, ShipAct_DtlR.$stk_id_typ);
				addColumnPathMap(Srch_StkR.$stk_bp_cd, ShipAct_DtlR.$stk_bp_cd);
				addColumnPathMap(Srch_StkR.$pack_unit_qty, ShipAct_DtlR.$pack_unit_qty);
				addColumnPathMap(Srch_StkR.$base_unit_qty, ShipAct_DtlR.$base_unit_qty);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
				dest.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
				if (MSC_STK_ID_TYP.isCOSTK(src.stk_id_typ())) {
					if (!isNull(src.dlv_id_cd()) && !MAC_STR.isNULL_VAL(nvl(src.stk_arrv_bp_cd(), MAC_STR.NULL_VAL.value()))) {
						dest.asst_typ(MAC_ASST_TYP.CO_SLS.value());
					}
					else {
						dest.asst_typ(MAC_LOC_MNG_TYP.asst_typ(getLocR(src.ship_loc_cd()).loc_mng_typ()));
					}
				}
				else {
					if (!isNull(src.ship_loc_cd())) {
						MAM_LOC_R locR = getLocR(src.ship_loc_cd());
						if (!isNull(locR) && MSC_STK_ID_TYP.isONR_PROV(src.stk_id_typ())
								&& locR.getBooleanNE("repurc_obli_flg")) {
							dest.asst_typ(MAC_ASST_TYP.CO_PROD.value());
						}
						else {
							dest.asst_typ(MAC_ASST_TYP.OTH.value());
						}
					}
					else {
						dest.asst_typ(MAC_ASST_TYP.OTH.value());
					}
				}
			}
		}

		protected Map_Srch_Io_SchdR_ShipAct_DtlR<Srch_Io_SchdR,ShipAct_DtlR> createMap_Srch_Io_SchdR_ShipAct_DtlR() {
			return new Map_Srch_Io_SchdR_ShipAct_DtlR<Srch_Io_SchdR, ShipAct_DtlR>();
		}

		public class Map_Srch_Io_SchdR_ShipAct_DtlR<D extends Srch_Io_SchdR, S extends ShipAct_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch_Io_SchdR.$io_schd_no, ShipAct_DtlR.$ship_alloc_sts_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.io_schd_typ(getIoSchdTypForShip(src.trd_ptn_typ(), src.stk_id_typ(),
						false, src.getBooleanNE("tmp_ex_flg")));
				MST_SHIP_ALLOC_STS_R sasR = getShipAllocStsL(src).get(0);
				dest.io_schd_sts_typ(getIoSchdStsTypForShip(src.trd_ptn_typ(),
						sasR.getString("dlv_inst_rcpt_no"), sasR.getString("slo_prms_no"),
						sasR.getBoolean("purc_ddlv_flg"), !isNull(sasR.ship_inst_d_no()),
						false, false, src.stk_id_typ()));

			}
		}
	}

	/**
	 * ShipAct_InptChk01オペレーション.<p>
	 *
	 * 出荷実績の登録・更新が可能かチェックをする。<br>
	 */
	public class ShipAct_InptChk01 extends MSBEL_ShipActService_MC_A.ShipAct_InptChk01 {
		@Override
		protected void call() {
			super.call();
		}

		/**
		 * 明細からヘッダを特定するJOINキー
		 */
		protected MCJoinKey<MCList<ShipAct_InptChk01_HdrR>> _hdrJk = null;

		/**
		 * ヘッダから明細を特定するJOINキー
		 */
		protected MCJoinKey<MCList<ShipAct_InptChk01_DtlR>> _dtlJk = null;

		@Override
		protected void doIt() {
			_hdrJk = up1().join(ShipAct_InptChk01_DtlR.$hdr_peg_no, up0(), ShipAct_InptChk01_HdrR.$peg_no);
			_dtlJk = up0().join(ShipAct_InptChk01_HdrR.$peg_no, up1(), ShipAct_InptChk01_DtlR.$hdr_peg_no);

			super.doIt();

				// 出荷実績チェック処理
				callShipActChkSrv();
//			}

			setDown();
		}

		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();
			// 条件付リストロジックチェックの処理
			// リストロジックの条件を明細に設定
			for (ShipAct_InptChk01_HdrR hdrR : up0()) {
				if (!isNull(hdrR.ship_tm())) {
					hdrR.ship_dt(hdrR.ship_tm().trunc(MCDateFieldType.DAY));
				}
				MCList<ShipAct_InptChk01_DtlR> dtlL = hdrR.getJoined(_dtlJk);
				dtlL.forEach(r -> {
					r.ship_fr_lg_grp_cd(hdrR.ship_fr_lg_grp_cd());
					r.ac_dt(hdrR.ac_dt());
					r.ship_dt(hdrR.ship_dt());
				});
			}
		}

		@Override
		protected void customListLogicCnd(String column, MCNumber paramIndex, MCConstRow data, Map<String, Comparable<?>> cnd) {
			super.customListLogicCnd(column, paramIndex, data, cnd);
			if (isSame(paramIndex, MCNumber.ONE)) {
				// 在庫着荷先
				if (isSame(column, ShipAct_InptChk01_DtlR.$stk_arrv_bp_cd)) {
					cnd.put(BpCols.$i_bp_is_srch_typ, MAC_BP_IS_SRCH_TYP.SPPL.value());
					cnd.put(BpCols.$i_sppl_flg, true);
				}
			}
		}

		/**
		 * 引継ぎ元からの補完対象のカラム
		 */
		protected String[][] _cmpleCols = 
		{
				// ヘッダ
				{
					ShipAct_InptChk01_HdrR.$ship_to_lg_grp_cd,
					ShipAct_InptChk01_HdrR.$ship_fr_lg_grp_cd,
					ShipAct_InptChk01_HdrR.$ship_to_id_typ,
					ShipAct_InptChk01_HdrR.$ship_to_id_cd,
					ShipAct_InptChk01_HdrR.$ship_to_id_nm,
					ShipAct_InptChk01_HdrR.$ship_to_zip_cd,
					ShipAct_InptChk01_HdrR.$ship_to_addr1,
					ShipAct_InptChk01_HdrR.$ship_to_addr2,
					ShipAct_InptChk01_HdrR.$ship_to_addr3,
					ShipAct_InptChk01_HdrR.$ship_to_addr4,
					ShipAct_InptChk01_HdrR.$ship_to_cntct_dpt,
					ShipAct_InptChk01_HdrR.$ship_to_cntct_psn,
					ShipAct_InptChk01_HdrR.$ship_to_tel,
					ShipAct_InptChk01_HdrR.$ship_to_fax,
					ShipAct_InptChk01_HdrR.$ship_to_sundry_flg,
					ShipAct_InptChk01_HdrR.$via_dlv_typ,
					ShipAct_InptChk01_HdrR.$wg_cd,
					ShipAct_InptChk01_HdrR.$ship_term_cd
				},
				// 明細
				{
					ShipAct_InptChk01_DtlR.$trd_cd,
					ShipAct_InptChk01_DtlR.$trd_ptn_typ,
					ShipAct_InptChk01_DtlR.$itm_cd,
					ShipAct_InptChk01_DtlR.$itm_sub1,
					ShipAct_InptChk01_DtlR.$itm_sub2,
					ShipAct_InptChk01_DtlR.$itm_sub3,
					ShipAct_InptChk01_DtlR.$itm_nm,
					ShipAct_InptChk01_DtlR.$iv_itm_nm,
					ShipAct_InptChk01_DtlR.$sundry_itm_flg,
					ShipAct_InptChk01_DtlR.$ver_no,
					ShipAct_InptChk01_DtlR.$sno1,
					ShipAct_InptChk01_DtlR.$sno2,
					ShipAct_InptChk01_DtlR.$sno3,
					ShipAct_InptChk01_DtlR.$sno4,
					ShipAct_InptChk01_DtlR.$stk_arrv_bp_cd,
					ShipAct_InptChk01_DtlR.$quality_typ,
					ShipAct_InptChk01_DtlR.$stk_id_typ,
					ShipAct_InptChk01_DtlR.$stk_bp_cd,
					ShipAct_InptChk01_DtlR.$dlv_id_cd,
					ShipAct_InptChk01_DtlR.$dlv_id_nm,
					ShipAct_InptChk01_DtlR.$dlv_sundry_flg,
					ShipAct_InptChk01_DtlR.$dlv_zip_cd,
					ShipAct_InptChk01_DtlR.$dlv_addr1,
					ShipAct_InptChk01_DtlR.$dlv_addr2,
					ShipAct_InptChk01_DtlR.$dlv_addr3,
					ShipAct_InptChk01_DtlR.$dlv_addr4,
					ShipAct_InptChk01_DtlR.$dlv_cntct_dpt,
					ShipAct_InptChk01_DtlR.$dlv_cntct_psn,
					ShipAct_InptChk01_DtlR.$dlv_tel,
					ShipAct_InptChk01_DtlR.$dlv_fax,
					ShipAct_InptChk01_DtlR.$cst_po_no,
					ShipAct_InptChk01_DtlR.$cst_po_d_no,
					ShipAct_InptChk01_DtlR.$cst_dlv_inst_no,
					ShipAct_InptChk01_DtlR.$cst_dlv_inst_d_no,
					ShipAct_InptChk01_DtlR.$cst_itm_cd,
					ShipAct_InptChk01_DtlR.$cst_itm_nm,
					ShipAct_InptChk01_DtlR.$rsn_cd,
					ShipAct_InptChk01_DtlR.$bd_dpt_cd,
					ShipAct_InptChk01_DtlR.$trd_rmrks,
					ShipAct_InptChk01_DtlR.$trd_d_rmrks
				}
		};

		@Override
		protected boolean isSetListLogicValue(MCNumber paramIndex, MCRow row, String column) {
			ShipAct_InptChk01_HdrR hdrR = null;
			if (isSame(paramIndex, MCNumber.ZERO)) {
				hdrR = (ShipAct_InptChk01_HdrR)row;
			}
			else if (isSame(paramIndex, MCNumber.ONE)) {
				hdrR = row.getJoinedRow(_hdrJk);
			}
			else {
				return super.isSetListLogicValue(paramIndex, row, column);
			}

			if (!hdrR.uplnd_flg()
				&& (isSame(paramIndex, MCNumber.ZERO)
					|| isSame(paramIndex, MCNumber.ONE))) {
				String[] arr = isSame(paramIndex, MCNumber.ZERO) ? _cmpleCols[0] : _cmpleCols[1];
				for (String s : arr) {
					if (isSame(s, column)) {
						return false;
					}
				}
			}
			// 計画外
			else {
				// 送付先識別
				if (isSame(paramIndex, MCNumber.ZERO)
					&& row.getBoolean(ShipAct_InptChk01_HdrR.$ship_to_sundry_flg)
					&& (isSame(column, ShipAct_InptChk01_HdrR.$ship_to_id_nm)
						|| isSame(column, ShipAct_InptChk01_HdrR.$ship_to_zip_cd)
						|| isSame(column, ShipAct_InptChk01_HdrR.$ship_to_addr1)
						|| isSame(column, ShipAct_InptChk01_HdrR.$ship_to_addr2)
						|| isSame(column, ShipAct_InptChk01_HdrR.$ship_to_addr3)
						|| isSame(column, ShipAct_InptChk01_HdrR.$ship_to_addr4)
						|| isSame(column, ShipAct_InptChk01_HdrR.$ship_to_cntct_dpt)
						|| isSame(column, ShipAct_InptChk01_HdrR.$ship_to_cntct_psn)
						|| isSame(column, ShipAct_InptChk01_HdrR.$ship_to_tel)
						|| isSame(column, ShipAct_InptChk01_HdrR.$ship_to_fax)
						)) {
					return false;
				}
				// 品目
				else if (isSame(paramIndex, MCNumber.ONE)
						&& row.getBoolean(ShipAct_InptChk01_DtlR.$sundry_itm_flg)
						&& isSame(column, ShipAct_InptChk01_DtlR.$itm_nm)) {
					return false;
				}
				// 納品先識別
				else if (isSame(paramIndex, MCNumber.ONE)
						&& row.getBoolean(ShipAct_InptChk01_DtlR.$dlv_sundry_flg)
						&& (isSame(column, ShipAct_InptChk01_DtlR.$dlv_id_nm)
							|| isSame(column, ShipAct_InptChk01_DtlR.$dlv_zip_cd)
							|| isSame(column, ShipAct_InptChk01_DtlR.$dlv_addr1)
							|| isSame(column, ShipAct_InptChk01_DtlR.$dlv_addr2)
							|| isSame(column, ShipAct_InptChk01_DtlR.$dlv_addr3)
							|| isSame(column, ShipAct_InptChk01_DtlR.$dlv_addr4)
							|| isSame(column, ShipAct_InptChk01_DtlR.$dlv_cntct_dpt)
							|| isSame(column, ShipAct_InptChk01_DtlR.$dlv_cntct_psn)
							|| isSame(column, ShipAct_InptChk01_DtlR.$dlv_tel)
							|| isSame(column, ShipAct_InptChk01_DtlR.$dlv_fax)
						)) {
					return false;
				}
			}
			return super.isSetListLogicValue(paramIndex, row, column);
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			MCList<ShipAct_InptChk01_HdrR>
				instL = createShipAct_InptChk01_HdrL(),		// 指図あり
				ivL = createShipAct_InptChk01_HdrL(),			// インボイス出荷（指図なし・予定あり）
				uplndL = createShipAct_InptChk01_HdrL(),	// 計画外
				schdL = createShipAct_InptChk01_HdrL();	// インボイス出荷以外（指図なし・予定あり）

			for (ShipAct_InptChk01_HdrR hdrR : up0()) {
				// 指図あり
				if (!isNull(hdrR.ship_inst_no())) {
					instL.add(hdrR);
				}
				// インボイス出荷（指図なし・予定あり）
				else if (!isNull(hdrR.iv_no())) {
					ivL.add(hdrR);
				}
				// 計画外
				else if (hdrR.uplnd_flg()) {
					uplndL.add(hdrR);
				}
				// インボイス出荷以外（指図なし・予定あり）
				else {
					schdL.add(hdrR);
				}
			}

			// 指図あり
			if (!instL.isEmpty()) {
				// 出荷指図からデータを補完する
				msgL.addAll(cmpleByShipInst(instL));
				msgL.addAll(cmpleByShipInstD(instL));
			}
			// インボイス出荷（指図なし・予定あり）
			else if (!ivL.isEmpty()) {
				// インボイスからデータを補完する
				msgL.addAll(cmpleByIv(ivL));
				msgL.addAll(cmpleByIvD(ivL));
			}
			// 計画外
			else if (!uplndL.isEmpty()) {
				// 出荷実績からデータを補完する
				msgL.addAll(cmpleByShipAct(uplndL));
				msgL.addAll(cmpleByShipActD(uplndL));
			}
			// インボイス出荷以外（指図なし・予定あり）
			else {
				// 出荷予定からデータを補完する
				msgL.addAll(cmpleByShipSchd(schdL));
			}

			return msgL;
		}

		@Override
		protected MCMessageList updCntChkReq() {
			MCMessageList msgL = super.updCntChkReq();
			for (ShipAct_InptChk01_HdrR hdrR : up0()) {
				if (!hdrR.uplnd_flg()) {
					return msgL;
				}
				if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())) {
					msgL.addAll(check(hdrR, ShipAct_InptChk01_HdrR.$ship_act_no, new FXUCL_RequiredValidater()));
				}
			}
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			for (ShipAct_InptChk01_HdrR hdrR : up0()) {
				if (!hdrR.err_flg()) {
					msgL.addAll(checkAtLeastOneDtl(hdrR, getChkList(hdrR.getJoined(_dtlJk))));
				}
			}
			MCList<ShipAct_InptChk01_DtlR>
				upL = getChkList(up1().subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())));

			// 定型チェック後の補完
			crrctDataAfterDoServerChk(upL);

			// 条件付必須チェック
			msgL.addAll(chkReq(upL));

			// 条件付妥当性チェック
			msgL.addAll(chkValid(upL));

			// 有効桁数チェック
			msgL.addAll(chkDecPlace(upL));

			// 納品棚・ライン存在チェック
			msgL.addAll(chkDlvStrLnCd(upL));

			// 表示順
			setDispSeq(upL);
			// 基準数量
			cmplBaseUnitQty(upL);
			// 受払進捗管理ＮＯ
			cmplIoSchdPrNo(upL);
			// 支給区分
			cmplProvTyp(upL);

			// 更新対象外の設定
			setNonUpdFlg(getChkList(up1()));

			return msgL;
		}

		/**
		 * 上り電文の順番に従って表示順を設定
		 */
		protected void setDispSeq(MCList<ShipAct_InptChk01_DtlR> l) {
			for (int i=0; i<l.size(); i++) {
				l.get(i).disp_seq(i+1);
			}
		}

		/**
		 * doServerChk（リストロジックによるチェックなど）実行後に行うべきデータの補正
		 */
		protected void crrctDataAfterDoServerChk(MCList<ShipAct_InptChk01_DtlR> notErrL) {
			for (ShipAct_InptChk01_DtlR r : notErrL) {
				ShipAct_InptChk01_HdrR hdrR = r.getJoinedRow(_hdrJk);
			
				// リストロジックによって補完する項目を元に条件分岐するので、リストロジック実行後に補完している
				// ロットＮＯ
				if (!MAC_LOT_MNG_TYP.req_lot(r.lot_mng_typ())) {
					r.lot_no(MAC_STR.NULL_VAL.value());
				}
				// サブロットＮＯ
				if (!MAC_SUBLOT_MNG_TYP.req_lot(r.sublot_mng_typ())) {
					r.sublot_no(MAC_STR.NULL_VAL.value());
				}
				// 手配ＮＯ１
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno1_mng_typ())) {
					r.sno1(MAC_STR.NULL_VAL.value());
				}
				else if (!MAC_SNO_MNG_TYP.isMNG_REQ(r.sno1_mng_typ())) {
					r.sno1(nvl(r.sno1(), MAC_STR.NULL_VAL.value()));
				}
				// 手配ＮＯ２
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno2_mng_typ())) {
					r.sno2(MAC_STR.NULL_VAL.value());
				}
				else if (!MAC_SNO_MNG_TYP.isMNG_REQ(r.sno2_mng_typ())) {
					r.sno2(nvl(r.sno2(), MAC_STR.NULL_VAL.value()));
				}
				// 手配ＮＯ３
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno3_mng_typ())) {
					r.sno3(MAC_STR.NULL_VAL.value());
				}
				else if (!MAC_SNO_MNG_TYP.isMNG_REQ(r.sno3_mng_typ())) {
					r.sno3(nvl(r.sno3(), MAC_STR.NULL_VAL.value()));
				}
				// 手配ＮＯ４
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno4_mng_typ())) {
					r.sno4(MAC_STR.NULL_VAL.value());
				}
				else if (!MAC_SNO_MNG_TYP.isMNG_REQ(r.sno4_mng_typ())) {
					r.sno4(nvl(r.sno4(), MAC_STR.NULL_VAL.value()));
				}
				r.ship_str_ln_cd(nvl(r.ship_str_ln_cd(), MAC_STR.NULL_VAL.value()));

				if (hdrR.uplnd_flg()) {
					if (MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isSHIP(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())) {
						r.quality_typ(MAC_QUALITY_TYP.GOOD.value());
					}
					if (MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())) {
						if (isNullOrNullVal(r.stk_arrv_bp_cd())){
							r.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
						}
						else if (!isSame(r.stk_arrv_bp_cd(), r.ship_loc_sppl_cd())) {
							r.stk_arrv_bp_cd(nvl(r.ship_loc_sppl_cd(), MAC_STR.NULL_VAL.value()));
						}
					}
					else {
						r.stk_arrv_bp_cd(nvl(r.ship_loc_sppl_cd(), MAC_STR.NULL_VAL.value()));
					}
					if (MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())) {
						r.stk_bp_cd(MAC_STR.NULL_VAL.value());
					}
					else if (MSC_STK_ID_TYP.isCSTSTK(r.stk_id_typ())) {
						r.stk_bp_cd(hdrR.cst_cd());
					}
					r.dlv_str_ln_cd(nvl(r.dlv_str_ln_cd(), MAC_STR.NULL_VAL.value()));
					
					if (MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())) {
						r.pri_prnt_flg(true);
					}
				}

				if (MSC_DLV_ID_TYP.isLOC(r.dlv_id_typ())) {
					r.dlv_str_ln_cd(nvl(r.dlv_str_ln_cd(), MAC_STR.NULL_VAL.value()));
				}
				else {
					r.dlv_str_ln_cd(null);
				}
			}
		}

		/**
		 * 条件付必須チェック
		 * 
		 * @return
		 */
		protected MCMessageList chkReq(MCList<ShipAct_InptChk01_DtlR> notErrL) {
			MCMessageList msgL = new MCMessageList();

			for (MCList<ShipAct_InptChk01_DtlR> l : notErrL.groupList(ShipAct_InptChk01_DtlR.$hdr_peg_no)) {
				ShipAct_InptChk01_HdrR hdrR = l.get(0).getJoinedRow(_hdrJk); 
				if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())) {
					msgL.addAll(check(hdrR, ShipAct_InptChk01_HdrR.$can_ac_dt, new FXUCL_RequiredValidater()));
				}
				if (hdrR.ship_to_sundry_flg()) {
					msgL.addAll(check(hdrR, ShipAct_InptChk01_HdrR.$ship_to_id_nm, new FXUCL_RequiredValidater()));
				}

				boolean isChkedHdr = false;
				for (ShipAct_InptChk01_DtlR r : l) {
					if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
						continue;
					}
	
					// 更新
					if (!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
						msgL.addAll(check(r, ShipAct_InptChk01_DtlR.$ship_act_d_no, new FXUCL_RequiredValidater()));
					}
					// 計画外
					if (hdrR.uplnd_flg()) {
						if (!isChkedHdr) {
							if (MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ())
								|| MAC_TRD_PTN_TYP.isSHIP(r.trd_ptn_typ())) {
								// 取引は画面ではヘッダに入力するので、先頭行でのみチェックする
								msgL.addAll(check(hdrR, ShipAct_InptChk01_HdrR.$cst_cd, new FXUCL_RequiredValidater()));
								msgL.addAll(check(hdrR, ShipAct_InptChk01_HdrR.$rqst_dpt_cd, new FXUCL_RequiredValidater()));
							}
							msgL.addAll(check(hdrR, ShipAct_InptChk01_HdrR.$ship_fr_lg_grp_cd, new FXUCL_RequiredValidater()));
							isChkedHdr = true;
						}
						// 手配、在庫着荷先および在庫取引先は補完済みなので、NULLの場合はエラーとする
						msgL.addAll(check(r, ShipAct_InptChk01_DtlR.$sno1, new FXUCL_RequiredValidater()));
						msgL.addAll(check(r, ShipAct_InptChk01_DtlR.$sno2, new FXUCL_RequiredValidater()));
						msgL.addAll(check(r, ShipAct_InptChk01_DtlR.$sno3, new FXUCL_RequiredValidater()));
						msgL.addAll(check(r, ShipAct_InptChk01_DtlR.$sno4, new FXUCL_RequiredValidater()));
						msgL.addAll(check(r, ShipAct_InptChk01_DtlR.$stk_arrv_bp_cd, new FXUCL_RequiredValidater()));
						msgL.addAll(check(r, ShipAct_InptChk01_DtlR.$stk_bp_cd, new FXUCL_RequiredValidater()));
						msgL.addAll(check(r, ShipAct_InptChk01_DtlR.$dlv_id_typ, new FXUCL_RequiredValidater()));
						msgL.addAll(check(r, ShipAct_InptChk01_DtlR.$dlv_id_cd, new FXUCL_RequiredValidater()));
					}
					else {
						msgL.addAll(check(r, ShipAct_InptChk01_DtlR.$ship_alloc_sts_no, new FXUCL_RequiredValidater()));
					}
					msgL.addAll(check(r, ShipAct_InptChk01_DtlR.$lot_no, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, ShipAct_InptChk01_DtlR.$sublot_no, new FXUCL_RequiredValidater()));
					if (MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())
						|| MAC_SHIP_INST_TYP.isPICK(r.ship_inst_typ())
						|| MAC_SHIP_INST_TYP.isNON(r.ship_inst_typ())) {
						// 在庫管理品、またはピッキングあり／指図対象外は必須
						msgL.addAll(check(r, ShipAct_InptChk01_DtlR.$ship_loc_cd, new FXUCL_RequiredValidater()));
						msgL.addAll(check(r, ShipAct_InptChk01_DtlR.$ship_str_ln_cd, new FXUCL_RequiredValidater()));
					}
					if (MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())) {
						// 在庫管理品は必須
						msgL.addAll(check(r, ShipAct_InptChk01_DtlR.$gd_cd, new FXUCL_RequiredValidater()));
					}
					if (r.dlv_sundry_flg()) {
						msgL.addAll(check(r, ShipAct_InptChk01_DtlR.$dlv_id_nm, new FXUCL_RequiredValidater()));
					}
					// 支給返品時の支給計上日（基）の必須チェック
					if (hdrR.dlv_slip_prnt_flg()) {
						if (MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
							if (isNull(r.base_ac_dt())) {
								msgL.add(new MCMessage(r, null, MSBEL1105, toDispGUIIndex(r)));
							}
						}
					}
					if (!MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
					// 支給返品以外の場合に返品元情報は入力しない。
						if (!isNull(r.base_dlv_slip_no())
								|| !isNull(r.base_prov_act_no())
								|| !isNull(r.base_ac_dt())) {
							msgL.add(new MCMessage(r, null, MSBEL1106, toDispGUIIndex(r)));
						}
					}
				}
			}
			return msgL;
		}

		/**
		 * チェックに必要なマスタをキャッシュする
		 */
		protected void doMstDataCache(MCList<ShipAct_InptChk01_DtlR> notErrL) {
			MCList<ShipAct_DtlR> l = MCList.create(ShipAct_DtlR.class);
			notErrL.forEach(r -> {
				// 場所
				l.add().ship_loc_cd(r.ship_loc_cd());
				if (MSC_DLV_ID_TYP.isLOC(r.dlv_id_typ())) {
					l.add().ship_loc_cd(r.dlv_id_cd());
				}
				// 取引先
				if (!isNullAnd(r.stk_arrv_bp_cd(), r.stk_bp_cd())) {
					ShipAct_DtlR addR = l.add();
					addR.stk_arrv_bp_cd(r.stk_arrv_bp_cd());
					addR.stk_bp_cd(r.stk_bp_cd());
				}
			});
			doLocCache(l);	// 場所
			doBpCache(l);		// 取引先
		}

		/**
		 * 条件付妥当性チェック
		 * 
		 * @return
		 */
		protected MCMessageList chkValid(MCList<ShipAct_InptChk01_DtlR> notErrL) {
			MCMessageList msgL = new MCMessageList();

			// マスタキャッシュ
			doMstDataCache(notErrL);
			
			// 配送先経由区分の補完
			cmpleViaDlvTyp(up0());

			for (MCList<ShipAct_InptChk01_DtlR> l : notErrL.groupList(ShipAct_InptChk01_DtlR.$hdr_peg_no)) {
				ShipAct_InptChk01_HdrR hdrR = l.get(0).getJoinedRow(_hdrJk);

				// 配送先チェック
				if (MAC_VIA_DLV_TYP.isVIA(hdrR.via_dlv_typ())) {
					if (!MSC_SHIP_TO_ID_TYP.isTDLV(hdrR.ship_to_id_typ())) {
						// 配送先経由で出荷する場合は、送付先識別に配送先を指定してください。
						msgL.add(new MCMessage(hdrR, null, MSBEL0050));
					}
				}
				
				// 得意先チェック
				if (hdrR.uplnd_flg() && !isNull(hdrR.cst_cd())) {
					MAM_BP_R cstR = getBpR(hdrR.cst_cd());
					if (cstR.cst_iv_flg()) {
						if (MAC_TRD_PTN_TYP.isSLS(l.get(0).trd_ptn_typ()) 
								&& MAC_SLS_BASIS_TYP.isSHIP_BASIS(nvl(cstR.sls_basis_typ(), getCo().sls_basis_typ()))) {
							 msgL.add(new MCMessage(hdrR, null, MSBEL1125));
						}
					}
				}
			}
			
			// 出荷場所チェック（支給のみ）
			MCList<ShipAct_InptChk01_DtlR>
				provL = notErrL.subList(r -> MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ()));
			if (!provL.isEmpty()) {
				// 支給先ごとにチェック
				for (MCList<ShipAct_InptChk01_DtlR>
					l : provL.groupList(ShipAct_InptChk01_DtlR.$dlv_id_cd)) {

					MCList<MAM_LOC_R> frL = MCList.create(MAM_LOC_R.class);
					l.forEach(r -> frL.add(getLocR(r.ship_loc_cd())));

					if (frL.groupBy("sppl_cd").size() > 1) {
						ShipAct_InptChk01_DtlR r = l.get(0);
						msgL.add(new MCMessage(r, null, MSBEL0246, toDispGUIIndex(r)));
					}
				}
			}

			for (int i=0; i<notErrL.size(); i++) {
				ShipAct_InptChk01_DtlR r = notErrL.get(i);
				ShipAct_InptChk01_HdrR hdrR = r.getJoinedRow(_hdrJk);

				// 取引パタンの妥当性チェック
				if (!MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ())
					&& !MAC_TRD_PTN_TYP.isSHIP(r.trd_ptn_typ())
					&& !MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
					&& !MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
					&& !MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
					&& !MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
					msgL.add(new MCMessage(
						r, null, MSBEL0051, r.trd_cd(), r.trd_ptn_typ(), toDispGUIIndex(r)));
				}

				// 送付先識別区分「納品先」と取引パタン「売上」「出荷」の関連チェック
				if (MSC_SHIP_TO_ID_TYP.isDLV(hdrR.ship_to_id_typ())) {
					if (!MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ())
						&& !MAC_TRD_PTN_TYP.isSHIP(r.trd_ptn_typ())) {
						msgL.add(new MCMessage(
								r, null, MSBEL0053, r.trd_cd(), r.trd_ptn_typ(), hdrR.ship_to_id_typ(), toDispGUIIndex(r)));
					}
				}
				// 送付先識別区分「場所」と取引パタン「移動・移送」「移動・移送返品」「支給」「支給返品」の関連チェック
				else if (MSC_SHIP_TO_ID_TYP.isLOC(hdrR.ship_to_id_typ())) {
					if (!MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
						&& !MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
						&& !MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
						&& !MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
						msgL.add(new MCMessage(
						r, null, MSBEL0052, r.trd_cd(), r.trd_ptn_typ(), hdrR.ship_to_id_typ(), toDispGUIIndex(r)));
					}
				}
				// 支給返品と送付先先識別区分に「配送先」のチェック
				if (MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ()) && MSC_SHIP_TO_ID_TYP.isTDLV(hdrR.ship_to_id_typ())) {
					
					msgL.add(new MCMessage(
							r, null, MSBEL1032, r.trd_cd(), r.trd_ptn_typ(), hdrR.ship_to_id_typ(), toDispGUIIndex(r)));
				}

				// 納品先識別区分「納品先」と取引パタン「売上」「出荷」の関連チェック
				if (MSC_DLV_ID_TYP.isDLV(r.dlv_id_typ())) {
					if (!MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ())
						&& !MAC_TRD_PTN_TYP.isSHIP(r.trd_ptn_typ())) {
						msgL.add(new MCMessage(
								r, null, MSBEL0055, r.trd_cd(), r.trd_ptn_typ(), r.dlv_id_typ(), toDispGUIIndex(r)));
					}
				}
				// 納品先識別区分「場所」と取引パタン「移動・移送」「移動・移送返品」「支給」「支給返品」の関連チェック
				else if (MSC_DLV_ID_TYP.isLOC(r.dlv_id_typ())) {
					if (!MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
						&& !MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
						&& !MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
						&& !MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
						msgL.add(new MCMessage(
						r, null, MSBEL0054, r.trd_cd(), r.trd_ptn_typ(), r.dlv_id_typ(), toDispGUIIndex(r)));
					}
				}

				if (MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {

					// 出荷元物流Ｇと出荷先物流Ｇの関連チェック
					if (isSame(hdrR.ship_fr_lg_grp_cd(), hdrR.ship_to_lg_grp_cd())) {
						msgL.add(new MCMessage(r, null, MSBEL0057,
							hdrR.ship_fr_lg_grp_cd(), hdrR.ship_to_lg_grp_cd(), toDispGUIIndex(r)));
					}
					// 在庫品のみ
					if (MAC_STK_MNG_TYP.isNOT_MNG(r.stk_mng_typ())) {
						msgL.add(new MCMessage(r, null, MSBEL0250,
							toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), toDispGUIIndex(r)));
					}
				}

				// 移送、移送返品、支給返品の場合、納品先は社内場所であること
				if (MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
					if (!isNull(getLocR(r.dlv_id_cd()).sppl_cd())) {
						msgL.add(new MCMessage(r, null, MSBEL0212, r.trd_cd(), r.dlv_id_cd(), toDispGUIIndex(r)));
					}
				}
				// 支給の場合、納品先は外注場所であること
				if (MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())) {
					if (isNull(getLocR(r.dlv_id_cd()).sppl_cd())) {
						msgL.add(new MCMessage(r, null, MSBEL0213, r.trd_cd(), r.dlv_id_cd(), toDispGUIIndex(r)));
					}
				}
				// 移送、移送返品、売上、出荷の場合、出荷場所は社内場所であること
				if (MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSHIP(r.trd_ptn_typ())) {
					if (!isNull(getLocR(r.ship_loc_cd()).sppl_cd())) {
						msgL.add(new MCMessage(
							r, null, MSBEL0214, r.trd_cd(), r.ship_loc_cd(), toDispGUIIndex(r)));
					}
				}
				// 支給返品の場合、出荷場所は外注場所であること
				if (MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
					if (isNull(getLocR(r.ship_loc_cd()).sppl_cd())) {
						msgL.add(new MCMessage(
							r, null, MSBEL0215, r.trd_cd(), r.ship_loc_cd(), toDispGUIIndex(r)));
					}
				}
				
				if (MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSHIP(r.trd_ptn_typ())) {
					// 売上、出荷の場合、自社在庫または預りであること
					if (!MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())
						&& !MSC_STK_ID_TYP.isCSTSTK(r.stk_id_typ())) {
						msgL.add(new MCMessage(
							r, null, MSBEL0216, r.trd_cd(), r.stk_id_typ(), toDispGUIIndex(r)));
					}
				}
				if (MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())) {
					// 移送、移送返品の場合、自社在庫、返品検収前、預り、VMI、検収不良、無償受給であること
					if (!MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())
						&& !MSC_STK_ID_TYP.isRTN_PRE_ACCPT(r.stk_id_typ())
						&& !MSC_STK_ID_TYP.isCSTSTK(r.stk_id_typ())
						&& !MSC_STK_ID_TYP.isRNT_RCV(r.stk_id_typ())
						&& !MSC_STK_ID_TYP.isACCPT_DFCT(r.stk_id_typ())
						&& !MSC_STK_ID_TYP.isNCV_RCV(r.stk_id_typ())) {
						msgL.add(new MCMessage(
							r, null, MSBEL0217, r.trd_cd(), r.stk_id_typ(), toDispGUIIndex(r)));
					}
				}
				if (MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())) {
					// 支給の場合、自社在庫、VMI、無償受給、有償支給であること
					if (!MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())
						&& !MSC_STK_ID_TYP.isRNT_RCV(r.stk_id_typ())
						&& !MSC_STK_ID_TYP.isNCV_RCV(r.stk_id_typ())
						&& !MSC_STK_ID_TYP.isONR_PROV(r.stk_id_typ())) {
						msgL.add(new MCMessage(
							r, null, MSBEL0218, r.trd_cd(), r.stk_id_typ(), toDispGUIIndex(r)));
					}
				}
				if (MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
					// 支給返品の場合、自社在庫、検収不良、無償受給、有償支給であること
					if (!MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())
						&& !MSC_STK_ID_TYP.isACCPT_DFCT(r.stk_id_typ())
						&& !MSC_STK_ID_TYP.isNCV_RCV(r.stk_id_typ())
						&& !MSC_STK_ID_TYP.isONR_PROV(r.stk_id_typ())) {
						msgL.add(new MCMessage(
							r, null, MSBEL0219, r.trd_cd(), r.stk_id_typ(), toDispGUIIndex(r)));
					}
				}

				// 在庫着荷先
				// 自社在庫、かつ在庫着荷先指定あり（＝無償支給された在庫）、有償支給
				// 支給返品、かつ検収不良or無償受給の場合、発注先であること
				if ((MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ()) && !isNullOrNullVal(r.stk_arrv_bp_cd())
					|| MSC_STK_ID_TYP.isONR_PROV(r.stk_id_typ())
					|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())
						&& (MSC_STK_ID_TYP.isACCPT_DFCT(r.stk_id_typ()) || MSC_STK_ID_TYP.isNCV_RCV(r.stk_id_typ())))
					&& !getBpR(r.stk_arrv_bp_cd()).sppl_flg()) {
					msgL.add(new MCMessage(
						r, null, MSBEL0220, r.trd_cd(), r.stk_id_typ(), r.stk_arrv_bp_cd(), toDispGUIIndex(r)));
				}

				// 在庫取引先
				// 返品検収前、預りの場合、得意先であること
				if ((MSC_STK_ID_TYP.isRTN_PRE_ACCPT(r.stk_id_typ())
					|| MSC_STK_ID_TYP.isCSTSTK(r.stk_id_typ()))
					&& !getBpR(r.stk_bp_cd()).cst_flg()) {
					msgL.add(new MCMessage(
						r, null, MSBEL0222, r.trd_cd(), r.stk_id_typ(), r.stk_bp_cd(), toDispGUIIndex(r)));
				}
				// VMI、検収不良、無償受給、有償支給の場合、発注先であること
				if ((MSC_STK_ID_TYP.isRNT_RCV(r.stk_id_typ())
					|| MSC_STK_ID_TYP.isACCPT_DFCT(r.stk_id_typ())
					|| MSC_STK_ID_TYP.isNCV_RCV(r.stk_id_typ())
					|| MSC_STK_ID_TYP.isONR_PROV(r.stk_id_typ()))
					&& !getBpR(r.stk_bp_cd()).sppl_flg()) {
					msgL.add(new MCMessage(
						r, null, MSBEL0223, r.trd_cd(), r.stk_id_typ(), r.stk_bp_cd(), toDispGUIIndex(r)));
				}
				if (hdrR.uplnd_flg() && !isNull(r.rsn_cd())) {
					
					if ((MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ()) 
							|| MAC_TRD_PTN_TYP.isSHIP(r.trd_ptn_typ())) && !r.out_sls_flg()) {
						// 売上、出荷は売上の理由を指定する
						msgL.add(new MCMessage(r, null, MSBEL1033, r.trd_cd(), r.trd_ptn_typ(), r.rsn_cd(), toDispGUIIndex(r)));
					}
					
					if (MAC_TRD_PTN_TYP.isSHIP(r.trd_ptn_typ()) && r.sls_acxfr_flg()) {
						// 出荷は販売他勘定を指定できない
						msgL.add(new MCMessage(r, null, MSBEL1034, r.trd_cd(), r.trd_ptn_typ(), r.rsn_cd(), toDispGUIIndex(r)));
					}
					
					if ((MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
							|| MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
							|| MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
							|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) && !r.out_xfr_flg()) {
						// 移動・移送、移動・移送返品、支給、支給返品は移送の理由を指定する
						msgL.add(new MCMessage(r, null, MSBEL1035, r.trd_cd(), r.trd_ptn_typ(), r.rsn_cd(), toDispGUIIndex(r)));
					}
					
					if ((MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
							|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())
							|| MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())) && r.acxfr_gi_flg()) {
						// 移動・移送返品、支給、支給返品は他勘定出庫を指定できない
						msgL.add(new MCMessage(r, null, MSBEL1036, r.trd_cd(), r.trd_ptn_typ(), r.rsn_cd(), toDispGUIIndex(r)));
					}
				}
				
				if (hdrR.uplnd_flg() 
						&& (MAC_TRD_PTN_TYP.isSHIP(r.trd_ptn_typ())
								|| MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
								|| MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
								|| MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
								|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) 
						&& !MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())) {
					// 出荷、移動・移送、移動・移送返品、支給、支給返品は他勘定出庫を指定できない
					msgL.add(new MCMessage(r, null, MSBEL1037, 
							r.trd_cd(), 
							r.trd_ptn_typ(), 
							toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), 
							r.stk_mng_typ(), 
							toDispGUIIndex(r)));
				}
				
				if (MAC_SNO_MNG_TYP.isMNG_REQ(r.sno1_mng_typ())) {
					r.sno1(nullValToNull(r.sno1()));
					if (isNull(r.sno1())) {
						msgL.add(new MCMessage(r, ShipAct_InptChk01_DtlR.$sno1,
								MSBEL1038, toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), toDispGUIIndex(r)));
					}
				}
				if (MAC_SNO_MNG_TYP.isMNG_REQ(r.sno2_mng_typ())) {
					r.sno2(nullValToNull(r.sno2()));
					if (isNull(r.sno2())) {
						msgL.add(new MCMessage(r, ShipAct_InptChk01_DtlR.$sno2,
								MSBEL1039, toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), toDispGUIIndex(r)));
					}
				}
				if (MAC_SNO_MNG_TYP.isMNG_REQ(r.sno3_mng_typ())) {
					r.sno3(nullValToNull(r.sno3()));
					if (isNull(r.sno3())) {
						msgL.add(new MCMessage(r, ShipAct_InptChk01_DtlR.$sno3,
								MSBEL1040, toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), toDispGUIIndex(r)));
					}
				}
				if (MAC_SNO_MNG_TYP.isMNG_REQ(r.sno4_mng_typ())) {
					r.sno4(nullValToNull(r.sno4()));
					if (isNull(r.sno4())) {
						msgL.add(new MCMessage(r, ShipAct_InptChk01_DtlR.$sno4,
								MSBEL1041, toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), toDispGUIIndex(r)));
					}
				}
			}
			return msgL;
		}

		/**
		 * 有効桁数チェック
		 */
		protected MCMessageList chkDecPlace(MCList<ShipAct_InptChk01_DtlR> notErrL) {
			MCMessageList msgL = new MCMessageList();

			// 取引単位数量
			msgL.addAll(checkDecPlace(notErrL, ShipAct_InptChk01_DtlR.$trd_unit_dec_place, ShipAct_InptChk01_DtlR.$trd_unit_qty));

			return msgL;
		}

		/**
		 * 納品棚・ラインの存在チェック
		 */
		protected MCMessageList chkDlvStrLnCd(MCList<ShipAct_InptChk01_DtlR> notErrL) {
			MCMessageList msgL = new MCMessageList();

			MCList<ShipAct_InptChk01_DtlR>
				chkL = notErrL.subList(r -> 
					MSC_DLV_ID_TYP.isLOC(r.dlv_id_typ())
					&& !isNullOrNullVal(r.dlv_str_ln_cd()));
			if (chkL.isEmpty()) {
				return msgL;
			}

			MCList<MAM_STR_LN_R> dbc = MCList.create(MAM_STR_LN_R.class);
			MAM_STR_LN_R t = MAM_STR_LN_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.loc_cd, t.str_ln_cd);
			dbc_bldr.setWhere(t.loc_cd.eq(bind("dlv_id_cd")));
			dbc_bldr.addWhereWithAnd(t.str_ln_cd.eq(bind("dlv_str_ln_cd")));
			dbSelect("MSBEL5540_MAM_STR_LN_S01", dbc, dbc_bldr, chkL);
			MCIndexKey idx = dbc.createIndex(dbc_bldr.getBaseDbc().getKeyColumn());

			chkL.forEach(r -> {
				if (isNull(dbc.getFirst(idx, r.dlv_id_cd(), r.dlv_str_ln_cd()))) {
					msgL.add(new MCMessage(r, null, MAUAL0058, toDispGUIIndex(r)));
				}
			});
			return msgL;
		}

		/**
		 * 出荷指図の存在チェック、および上り電文のデータを補完する
		 */
		protected MCMessageList cmpleByShipInst(MCList<ShipAct_InptChk01_HdrR> hdrL) {

			MCMessageList msgL = new MCMessageList();

			MCList<MST_SHIP_INST_R> dbc = MCList.create(MST_SHIP_INST_R.class);
			MST_SHIP_INST_R t = MST_SHIP_INST_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.ship_inst_no, t.ship_to_id_typ, t.ship_to_id_cd,
					t.ship_to_id_nm, t.ship_to_zip_cd, t.ship_to_addr1, t.ship_to_addr2,
					t.ship_to_addr3, t.ship_to_addr4, t.ship_to_cntct_dpt,
					t.ship_to_cntct_psn, t.ship_to_tel, t.ship_to_fax,
					t.ship_to_sundry_flg, t.via_dlv_typ, t.wg_cd, t.ship_fr_lg_grp_cd,
					t.ship_to_lg_grp_cd, t.ship_term_cd);
			dbSelectKeyForUpdate("MSBEL5540_MST_SHIP_INST_S01", dbc, dbc_bldr, hdrL);

			MCIndexKey idx = dbc.createIndex(MST_SHIP_INST_R.$ship_inst_no);
			for (ShipAct_InptChk01_HdrR hdrR : hdrL) {
				MST_SHIP_INST_R instR = dbc.getFirst(idx, hdrR.ship_inst_no());

				if (isNull(instR)) {
					msgL.addAll(getRecordNotFoundMsg("MS", "MST_SHIP_INST"
							, new String[]{MST_SHIP_INST_R.$ship_inst_no}
							, new Comparable[]{hdrR.ship_inst_no()}, hdrR));
				}
				else {
					// 引継元の出荷指図からデータを補完
					hdrR.ship_to_id_typ(instR.getString("ship_to_id_typ"));
					hdrR.ship_to_id_cd(instR.getString("ship_to_id_cd"));
					hdrR.ship_to_id_nm(instR.getString("ship_to_id_nm"));
					hdrR.ship_to_zip_cd(instR.getString("ship_to_zip_cd"));
					hdrR.ship_to_addr1(instR.getString("ship_to_addr1"));
					hdrR.ship_to_addr2(instR.getString("ship_to_addr2"));
					hdrR.ship_to_addr3(instR.getString("ship_to_addr3"));
					hdrR.ship_to_addr4(instR.getString("ship_to_addr4"));
					hdrR.ship_to_cntct_dpt(instR.getString("ship_to_cntct_dpt"));
					hdrR.ship_to_cntct_psn(instR.getString("ship_to_cntct_psn"));
					hdrR.ship_to_tel(instR.getString("ship_to_tel"));
					hdrR.ship_to_fax(instR.getString("ship_to_fax"));
					hdrR.ship_to_sundry_flg(instR.getBoolean("ship_to_sundry_flg"));
					hdrR.via_dlv_typ(instR.getString("via_dlv_typ"));
					hdrR.wg_cd(instR.getString("wg_cd"));
					hdrR.ship_fr_lg_grp_cd(instR.getString("ship_fr_lg_grp_cd"));
					hdrR.ship_to_lg_grp_cd(instR.getString("ship_to_lg_grp_cd"));
					hdrR.ship_term_cd(instR.getString("ship_term_cd"));
				}
			}
			return msgL;
		}

		/**
		 * 出荷引当状況、出荷指図明細の存在チェック、および上り電文のデータを補完する
		 */
		protected MCMessageList cmpleByShipInstD(MCList<ShipAct_InptChk01_HdrR> hdrL) {

			MCList<ShipAct_InptChk01_DtlR> dtlL = createShipAct_InptChk01_DtlL();
			for (ShipAct_InptChk01_HdrR hdrR : hdrL) {
				dtlL.addAll(hdrR.getJoined(_dtlJk));
				dtlL.setDateNE(ShipAct_InptChk01_DtlR.$ac_dt, hdrR.ac_dt());
			}

			MCMessageList msgL = new MCMessageList();
			MCList<ShipAct_InptChk01_DtlR> notErrL = getChkList(dtlL);
			if (isNull(notErrL)) {
				return msgL;
			}

			MCList<MST_SHIP_ALLOC_STS_R> instDL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			MST_SHIP_ALLOC_STS_R t = MST_SHIP_ALLOC_STS_R.create("T");
			MCQueryApiBuilder instDL_bldr = MCQueryApiBuilder.create(t);
			MST_SHIP_INST_D_R t2 = MST_SHIP_INST_D_R.create("T2");
			MST_SHIP_SCHD_R t3 = MST_SHIP_SCHD_R.create("T3");
			MST_SHIP_PR_R t4 = MST_SHIP_PR_R.create("T4");
			MST_SLO_D_R t5 = MST_SLO_D_R.create("T5");
			MST_SLO_R t6 = MST_SLO_R.create("T6");
			MST_DLV_INST_RCPT_R t7 = MST_DLV_INST_RCPT_R.create("T7");
			MAM_LOC_R m1 = MAM_LOC_R.create("M1");
			MAM_ITM_LG_GRP_R m2 = MAM_ITM_LG_GRP_R.create("M2");
			instDL.addBooleanColumn("sundry_itm_flg");
			instDL.addBooleanColumn("inst_bndl_flg");
			instDL.addBooleanColumn("dlv_sundry_flg");
			instDL.addBooleanColumn("abort_flg");
			instDL_bldr.setSelect(t.ship_alloc_sts_no, t.gd_cd, t.io_schd_pr_no);
			instDL_bldr.addSelect(t2.ship_inst_d_no, t2.ship_inst_no, t2.trd_cd,
					t2.trd_ptn_typ, t2.itm_cd, t2.itm_sub1, t2.itm_sub2, t2.itm_sub3,
					t2.itm_nm, t2.iv_itm_nm, t2.sundry_itm_flg, t2.base_unit_cd,
					t2.ver_no, t2.sno1, t2.sno2, t2.sno3, t2.sno4, t2.stk_arrv_bp_cd,
					t2.quality_typ, t.stk_id_typ, t.stk_bp_cd, t2.abort_flg,
					t6.cst_po_no, t5.cst_po_d_no, t7.cst_dlv_inst_no,
					t7.cst_dlv_inst_d_no, t5.cst_itm_cd, t5.cst_itm_nm, t2.rsn_cd,
					t2.bd_dpt_cd, t2.trd_rmrks, t2.trd_d_rmrks, t3.ship_schd_no,
					t3.ship_pr_no, t3.inst_bndl_flg, t4.slo_d_no, t4.xfr_schd_no,
					t4.ship_inst_typ, t4.dlv_id_typ,
					nvl(t3.dlv_cd, t4.dlv_id_cd).as("dlv_id_cd"),
					nvl2(t3.dlv_cd, t3.dlv_nm, t4.dlv_id_nm).as("dlv_id_nm"),
					nvl2(t3.dlv_cd, t3.dlv_zip_cd, t4.dlv_zip_cd).as("dlv_zip_cd"),
					nvl2(t3.dlv_cd, t3.dlv_addr1, t4.dlv_addr1).as("dlv_addr1"),
					nvl2(t3.dlv_cd, t3.dlv_addr2, t4.dlv_addr2).as("dlv_addr2"),
					nvl2(t3.dlv_cd, t3.dlv_addr3, t4.dlv_addr3).as("dlv_addr3"),
					nvl2(t3.dlv_cd, t3.dlv_addr4, t4.dlv_addr4).as("dlv_addr4"),
					nvl2(t3.dlv_cd, t3.dlv_cntct_dpt, t4.dlv_cntct_dpt)
							.as("dlv_cntct_dpt"),
					nvl2(t3.dlv_cd, t3.dlv_cntct_psn, t4.dlv_cntct_psn)
							.as("dlv_cntct_psn"),
					nvl2(t3.dlv_cd, t3.dlv_tel, t4.dlv_tel).as("dlv_tel"),
					nvl2(t3.dlv_cd, t3.dlv_fax, t4.dlv_fax).as("dlv_fax"),
					nvl2(t3.dlv_cd, t3.dlv_sundry_flg, t4.dlv_sundry_flg)
							.as("dlv_sundry_flg"),
					t4.dlv_str_ln_cd, t4.rqst_dpt_cd,
					nvl(m2.lg_def_loc_cd, m1.loc_cd).as("loc_cd"));
			instDL_bldr.addInnerJoin(t2, bracket(t2.ship_inst_d_no.eq(t.ship_inst_d_no)));
			instDL_bldr.addInnerJoin(t3,
					bracket(t3.ship_inst_d_no.eq(t2.ship_inst_d_no)));
			instDL_bldr.addInnerJoin(t4, bracket(t4.ship_pr_no.eq(t3.ship_pr_no)));
			instDL_bldr.addLeftOuterJoin(t5, bracket(t5.slo_d_no.eq(t4.slo_d_no)));
			instDL_bldr.addLeftOuterJoin(t6, bracket(t6.slo_no.eq(t5.slo_no)));
			instDL_bldr.addLeftOuterJoin(t7,
					bracket(t7.dlv_inst_rcpt_no.eq(t3.dlv_inst_rcpt_no)));
			instDL_bldr.addLeftOuterJoin(m1, bracket(m1.lg_grp_cd.eq(t2.ship_lg_grp_cd)
					.and(m1.lg_def_flg.eq(value(true)))));
			instDL_bldr.addLeftOuterJoin(m2,
					bracket(m2.itm_cd.eq(t2.itm_cd)
							.and(m2.itm_sub1.eq(t2.itm_sub1))
							.and(m2.itm_sub2.eq(t2.itm_sub2))
							.and(m2.itm_sub3.eq(t2.itm_sub3))
							.and(m2.lg_grp_cd.eq(t2.ship_lg_grp_cd))));
			instDL_bldr.setWhere(t.ship_alloc_sts_no.eq(bind("ship_alloc_sts_no")));
			dbSelect("MSBEL5540_MST_SHIP_ALLOC_STS_S01", instDL, instDL_bldr,
					notErrL.groupBy("ship_alloc_sts_no"));

			MCIndexKey instIdx = instDL.createIndex(MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no);
			MCIndexKey up2Idx = up2().createIndex(ShipAct_InptChk01_CntrR.$ship_pr_no);

			notErrL.addStringColumn("rqst_dpt_cd");
			for (ShipAct_InptChk01_DtlR r : notErrL) {
				MCList<MST_SHIP_ALLOC_STS_R> sasL = instDL.subList(instIdx, r.ship_alloc_sts_no());	// 指図まとめの場合に複数件あり

				// 出荷引当状況NOがDBに登録されているか
				if (isNull(sasL)) {
					msgL.addAll(getRecordNotFoundMsg("MS", "MST_SHIP_ALLOC_STS"
							, new String[]{MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no}
							, new Comparable[]{r.ship_alloc_sts_no()}, r));
					continue;
				}

				MST_SHIP_ALLOC_STS_R sasR = sasL.get(0);	// 指図明細は１件（出荷予定が複数件）
				// 上り電文から取得した出荷進捗と、出荷進捗更新カウンタとの妥当性をチェック
				for (MST_SHIP_ALLOC_STS_R rr : sasL) {
					ShipAct_InptChk01_CntrR up2R = up2().getFirst(up2Idx, rr.toArray(up2Idx.getKeys()));
					if (isNull(up2R)) {
						msgL.addAll(getRecordInvalidMsg(MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no, r.ship_alloc_sts_no(), r));
					}
				}
				// 引継元の出荷指図明細からデータを補完
				r.trd_cd(sasR.getString("trd_cd"));
				r.trd_ptn_typ(sasR.getString("trd_ptn_typ"));
				r.itm_cd(sasR.getString("itm_cd"));
				r.itm_sub1(sasR.getString("itm_sub1"));
				r.itm_sub2(sasR.getString("itm_sub2"));
				r.itm_sub3(sasR.getString("itm_sub3"));
				r.itm_nm(sasR.getString("itm_nm"));
				r.iv_itm_nm(sasR.getString("iv_itm_nm"));
				r.sundry_itm_flg(sasR.getBoolean("sundry_itm_flg"));
				r.base_unit_cd(sasR.base_unit_cd());
				// 補完しない
				// r.sno1(sasR.sno1());
				// r.sno2(sasR.sno2());
				// r.sno3(sasR.sno3());
				// r.sno4(sasR.sno4());
				// r.ver_no(sasR.ver_no());
				r.ship_inst_typ(sasR.getString("ship_inst_typ"));
				if (MAC_SHIP_INST_TYP.isNO_PICK(r.ship_inst_typ())) {
					// ピッキングなしの場合、場所の標準物流場所で補完する
					r.ship_loc_cd(sasR.getString("loc_cd"));
					r.ship_str_ln_cd(isNull(r.ship_loc_cd()) ? null : MAC_STR.NULL_VAL.value());
				}
				r.stk_arrv_bp_cd(sasR.stk_arrv_bp_cd());
				r.quality_typ(sasR.quality_typ());
				r.stk_id_typ(sasR.stk_id_typ());
				if (isNullOrNullVal(r.stk_bp_cd())) {
					// 上り電文の在庫取引先ＣＤがNullか*の場合、補完する
					r.stk_bp_cd(sasR.stk_bp_cd());
				}
				r.dlv_id_typ(sasR.getString("dlv_id_typ"));
				r.dlv_id_cd(sasR.getString("dlv_id_cd"));
				r.dlv_id_nm(sasR.getString("dlv_id_nm"));
				r.dlv_zip_cd(sasR.getString("dlv_zip_cd"));
				r.dlv_addr1(sasR.getString("dlv_addr1"));
				r.dlv_addr2(sasR.getString("dlv_addr2"));
				r.dlv_addr3(sasR.getString("dlv_addr3"));
				r.dlv_addr4(sasR.getString("dlv_addr4"));
				r.dlv_cntct_dpt(sasR.getString("dlv_cntct_dpt"));
				r.dlv_cntct_psn(sasR.getString("dlv_cntct_psn"));
				r.dlv_tel(sasR.getString("dlv_tel"));
				r.dlv_fax(sasR.getString("dlv_fax"));
				r.dlv_sundry_flg(sasR.getBoolean("dlv_sundry_flg"));
				r.dlv_str_ln_cd(sasR.getString("dlv_str_ln_cd"));
				r.cst_po_no(sasR.getString("cst_po_no"));
				r.cst_po_d_no(sasR.getString("cst_po_d_no"));
				r.cst_dlv_inst_no(sasR.getString("cst_dlv_inst_no"));
				r.cst_dlv_inst_d_no(sasR.getString("cst_dlv_inst_d_no"));
				r.cst_itm_cd(sasR.getString("cst_itm_cd"));
				r.cst_itm_nm(sasR.getString("cst_itm_nm"));
				r.rsn_cd(sasR.getString("rsn_cd"));
				r.trd_rmrks(sasR.getString("trd_rmrks"));
				r.trd_d_rmrks(sasR.getString("trd_d_rmrks"));
				r.io_schd_pr_no(sasR.io_schd_pr_no());
				r.abort_rel_flg(!r.abort_flg() && sasR.getBoolean("abort_flg"));	// 打切解除
				
				r.addStringColumn("rqst_dpt_cd", sasR.getString("rqst_dpt_cd"));
				r.gd_cd(sasR.gd_cd());
			}
			// 負担部門の組織変更対応
			setDpt(notErrL, ShipAct_InptChk01_DtlR.$bd_dpt_cd, ShipAct_InptChk01_DtlR.$ac_dt);
			// 依頼部門の組織変更対応
			setDpt(notErrL, "rqst_dpt_cd", null, ShipAct_InptChk01_DtlR.$ac_dt, true);

			return msgL;
		}

		/**
		 * インボイスの存在チェック、および上り電文のデータを補完する
		 */
		protected MCMessageList cmpleByIv(MCList<ShipAct_InptChk01_HdrR> hdrL) {

			MCMessageList msgL = new MCMessageList();

			MCList<MST_IV_R> dbc = MCList.create(MST_IV_R.class);
			MST_IV_R t = MST_IV_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			MAM_BP_R m1 = MAM_BP_R.create("M1");
			dbc.addStringColumn("lg_grp_cd");
			dbc.addStringColumn("wg_cd");
			dbc_bldr.setSelect(t.iv_no, t.tdlv_cd, t.tdlv_nm, t.tdlv_zip_cd, t.tdlv_addr1,
					t.tdlv_addr2, t.tdlv_addr3, t.tdlv_addr4, t.tdlv_cntct_dpt,
					t.tdlv_cntct_psn, t.tdlv_tel, t.tdlv_fax, t.tdlv_sundry_flg,
					t.dlv_id_typ, t.dlv_id_cd, t.dlv_id_nm, t.dlv_zip_cd, t.dlv_addr1,
					t.dlv_addr2, t.dlv_addr3, t.dlv_addr4, t.dlv_cntct_dpt,
					t.dlv_cntct_psn, t.dlv_tel, t.dlv_fax, t.dlv_sundry_flg,
					t.via_dlv_typ);
			dbc_bldr.addSelect(m1.lg_grp_cd);
			dbc_bldr.addLeftOuterJoin(m1, bracket(m1.bp_cd.eq(t.tdlv_cd)));
			dbc_bldr.setWhere(t.iv_no.eq(bind("iv_no")));
			dbc_bldr.setLockTable(t.iv_no);
			dbSelectForUpdate("MSBEL5540_MST_IV_S03", dbc, dbc_bldr, hdrL);

			MCIndexKey idx = dbc.createIndex(MST_IV_R.$iv_no);
			for (ShipAct_InptChk01_HdrR hdrR : hdrL) {
				MST_IV_R ivR = dbc.getFirst(idx, hdrR.iv_no());

				if (isNull(ivR)) {
					msgL.add(new MCMessage(hdrR, null, MSBEL0292, hdrR.iv_no()));
				}
				else {
					// 引継元のインボイスからデータを補完
					if (isNull(ivR.tdlv_cd())) {
						hdrR.ship_to_id_typ(ivR.dlv_id_typ());
						hdrR.ship_to_id_cd(ivR.dlv_id_cd());
						hdrR.ship_to_id_nm(ivR.dlv_id_nm());
						hdrR.ship_to_zip_cd(ivR.dlv_zip_cd());
						hdrR.ship_to_addr1(ivR.dlv_addr1());
						hdrR.ship_to_addr2(ivR.dlv_addr2());
						hdrR.ship_to_addr3(ivR.dlv_addr3());
						hdrR.ship_to_addr4(ivR.dlv_addr4());
						hdrR.ship_to_cntct_dpt(ivR.dlv_cntct_dpt());
						hdrR.ship_to_cntct_psn(ivR.dlv_cntct_psn());
						hdrR.ship_to_tel(ivR.dlv_tel());
						hdrR.ship_to_fax(ivR.dlv_fax());
						hdrR.ship_to_sundry_flg(ivR.dlv_sundry_flg());
					}
					else {
						hdrR.ship_to_id_typ(MSC_SHIP_TO_ID_TYP.TDLV.value());
						hdrR.ship_to_id_cd(ivR.tdlv_cd());
						hdrR.ship_to_id_nm(ivR.tdlv_nm());
						hdrR.ship_to_zip_cd(ivR.tdlv_zip_cd());
						hdrR.ship_to_addr1(ivR.tdlv_addr1());
						hdrR.ship_to_addr2(ivR.tdlv_addr2());
						hdrR.ship_to_addr3(ivR.tdlv_addr3());
						hdrR.ship_to_addr4(ivR.tdlv_addr4());
						hdrR.ship_to_cntct_dpt(ivR.tdlv_cntct_dpt());
						hdrR.ship_to_cntct_psn(ivR.tdlv_cntct_psn());
						hdrR.ship_to_tel(ivR.tdlv_tel());
						hdrR.ship_to_fax(ivR.tdlv_fax());
						hdrR.ship_to_sundry_flg(ivR.tdlv_sundry_flg());
					}
					hdrR.via_dlv_typ(ivR.via_dlv_typ());
					// 出荷予定から補完する
					hdrR.ship_to_lg_grp_cd(ivR.getString("lg_grp_cd"));
					hdrR.ship_term_cd(null);
				}
			}
			return msgL;
		}

		/**
		 * 出荷引当状況、出荷指図明細の存在チェック、および上り電文のデータを補完する
		 */
		protected MCMessageList cmpleByIvD(MCList<ShipAct_InptChk01_HdrR> hdrL) {

			MCList<ShipAct_InptChk01_DtlR> dtlL = createShipAct_InptChk01_DtlL();
			for (ShipAct_InptChk01_HdrR hdrR : hdrL) {
				dtlL.addAll(hdrR.getJoined(_dtlJk));
				dtlL.setDateNE(ShipAct_InptChk01_DtlR.$ac_dt, hdrR.ac_dt());
			}

			MCMessageList msgL = new MCMessageList();
			MCList<ShipAct_InptChk01_DtlR> notErrL = getChkList(dtlL);
			if (isNull(notErrL)) {
				return msgL;
			}

			MCList<MST_SHIP_ALLOC_STS_R> ivDL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			MST_SHIP_ALLOC_STS_R t = MST_SHIP_ALLOC_STS_R.create("T");
			MCQueryApiBuilder ivDL_bldr = MCQueryApiBuilder.create(t);
			MST_IV_MAP_R t2 = MST_IV_MAP_R.create("T2");
			MST_IV_D_R t3 = MST_IV_D_R.create("T3");
			MST_IV_R t4 = MST_IV_R.create("T4");
			MST_SHIP_SCHD_R t5 = MST_SHIP_SCHD_R.create("T5");
			MST_SHIP_PR_R t6 = MST_SHIP_PR_R.create("T6");
			MST_DLV_INST_RCPT_R t7 = MST_DLV_INST_RCPT_R.create("T7");
			MAM_LOC_R m1 = MAM_LOC_R.create("M1");
			MAM_LG_GRP_R m2 = MAM_LG_GRP_R.create("M2");
			MAM_ITM_LG_GRP_R m3 = MAM_ITM_LG_GRP_R.create("M3");
			ivDL.addBooleanColumn("sundry_itm_flg");
			ivDL.addBooleanColumn("dlv_sundry_flg");
			ivDL.addBooleanColumn("abort_flg");
			ivDL_bldr.setSelect(t.ship_alloc_sts_no, t.io_schd_pr_no);
			ivDL_bldr.addSelect(t3.iv_d_no, t4.iv_no, t3.trd_cd, t4.trd_ptn_typ,
					t3.itm_cd, t3.itm_sub1, t3.itm_sub2, t3.itm_sub3, t3.itm_nm,
					t3.iv_itm_nm, t3.sundry_itm_flg, t3.base_unit_cd, t5.ver_no, t3.sno1,
					t3.sno2, t3.sno3, t3.sno4, t5.stk_arrv_bp_cd, t5.quality_typ,
					t.stk_id_typ, t.stk_bp_cd, t5.abort_flg, t3.cst_po_no,
					t3.cst_po_d_no, t7.cst_dlv_inst_no, t7.cst_dlv_inst_d_no,
					t3.cst_itm_cd, t3.cst_itm_nm, t3.rsn_cd, t3.bd_dpt_cd, t5.trd_rmrks,
					t5.trd_d_rmrks, t5.ship_schd_no, t5.ship_pr_no, t5.ship_fr_lg_grp_cd,
					t6.ship_inst_typ, t4.dlv_id_typ, t4.dlv_id_cd, t4.dlv_id_nm,
					t4.dlv_zip_cd, t4.dlv_addr1, t4.dlv_addr2, t4.dlv_addr3, t4.dlv_addr4,
					t4.dlv_cntct_dpt, t4.dlv_cntct_psn, t4.dlv_tel, t4.dlv_fax,
					t4.dlv_sundry_flg, t6.rqst_dpt_cd,
					nvl(m3.lg_def_loc_cd, m1.loc_cd).as("loc_cd"), m2.wg_cd);
			ivDL_bldr.addInnerJoin(t2, bracket(t2.ship_schd_no.eq(t.ship_schd_no)));
			ivDL_bldr.addInnerJoin(t3, bracket(t3.iv_d_no.eq(t2.iv_d_no)));
			ivDL_bldr.addInnerJoin(t4, bracket(t4.iv_mng_no.eq(t3.iv_mng_no)));
			ivDL_bldr.addInnerJoin(t5, bracket(t5.ship_schd_no.eq(t.ship_schd_no)));
			ivDL_bldr.addInnerJoin(t6, bracket(t6.ship_pr_no.eq(t5.ship_pr_no)));
			ivDL_bldr.addLeftOuterJoin(t7,
					bracket(t7.dlv_inst_rcpt_no.eq(t5.dlv_inst_rcpt_no)));
			ivDL_bldr.addLeftOuterJoin(m1, bracket(m1.lg_grp_cd.eq(t4.ship_fr_lg_grp_cd)
					.and(m1.lg_def_flg.eq(value(true)))));
			ivDL_bldr.addLeftOuterJoin(m2,
					bracket(m2.lg_grp_cd.eq(t4.ship_fr_lg_grp_cd)));
			ivDL_bldr.addLeftOuterJoin(m3,
					bracket(m3.itm_cd.eq(t3.itm_cd)
							.and(m3.itm_sub1.eq(t3.itm_sub1))
							.and(m3.itm_sub2.eq(t3.itm_sub2))
							.and(m3.itm_sub3.eq(t3.itm_sub3))
							.and(m3.lg_grp_cd.eq(t4.ship_fr_lg_grp_cd))));
			ivDL_bldr.setWhere(t.ship_alloc_sts_no.eq(bind("ship_alloc_sts_no")));
			dbSelect("MSBEL5540_MST_SHIP_ALLOC_STS_S02", ivDL, ivDL_bldr,
					notErrL.groupBy("ship_alloc_sts_no"));

			MCIndexKey ivIdx = ivDL.createIndex(MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no);
			MCIndexKey up2Idx = up2().createIndex(ShipAct_InptChk01_CntrR.$ship_pr_no);

			notErrL.addStringColumn("rqst_dpt_cd");
			for (ShipAct_InptChk01_DtlR r : notErrL) {
				MCList<MST_SHIP_ALLOC_STS_R> sasL = ivDL.subList(ivIdx, r.ship_alloc_sts_no());

				// 出荷引当状況NOがDBに登録されているか
				if (isNull(sasL)) {
					msgL.addAll(getRecordNotFoundMsg("MS", "MST_SHIP_ALLOC_STS"
							, new String[]{MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no}
							, new Comparable[]{r.ship_alloc_sts_no()}, r));
					continue;
				}

				MST_SHIP_ALLOC_STS_R sasR = sasL.get(0);
				// 上り電文から取得した出荷進捗と、出荷進捗更新カウンタとの妥当性をチェック
				for (MST_SHIP_ALLOC_STS_R rr : sasL) {
					ShipAct_InptChk01_CntrR up2R = up2().getFirst(up2Idx, rr.toArray(up2Idx.getKeys()));
					if (isNull(up2R)) {
						msgL.addAll(getRecordInvalidMsg(MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no, r.ship_alloc_sts_no(), r));
					}
				}
				// 引継元のインボイス明細からデータを補完
				r.trd_cd(sasR.getString("trd_cd"));
				r.trd_ptn_typ(sasR.getString("trd_ptn_typ"));
				r.itm_cd(sasR.getString("itm_cd"));
				r.itm_sub1(sasR.getString("itm_sub1"));
				r.itm_sub2(sasR.getString("itm_sub2"));
				r.itm_sub3(sasR.getString("itm_sub3"));
				r.itm_nm(sasR.getString("itm_nm"));
				r.iv_itm_nm(sasR.getString("iv_itm_nm"));
				r.sundry_itm_flg(sasR.getBoolean("sundry_itm_flg"));
				r.base_unit_cd(sasR.base_unit_cd());
				// 補完しない
				// r.sno1(sasR.getString("sno1"));
				// r.sno2(sasR.getString("sno2"));
				// r.sno3(sasR.getString("sno3"));
				// r.sno4(sasR.getString("sno4"));
				// r.ver_no(sasR.ver_no());
				r.ship_inst_typ(sasR.getString("ship_inst_typ"));
				if (MAC_SHIP_INST_TYP.isNO_PICK(r.ship_inst_typ())) {
					// ピッキングなしの場合、場所の標準物流場所で補完する
					r.ship_loc_cd(sasR.getString("loc_cd"));
					r.ship_str_ln_cd(isNull(r.ship_loc_cd()) ? null : MAC_STR.NULL_VAL.value());
				}
				r.stk_arrv_bp_cd(sasR.stk_arrv_bp_cd());
				r.quality_typ(sasR.quality_typ());
				r.stk_id_typ(sasR.stk_id_typ());
				if (isNullOrNullVal(r.stk_bp_cd())) {
					// 上り電文の在庫取引先ＣＤがNullか*の場合、補完する
					r.stk_bp_cd(sasR.stk_bp_cd());
				}
				r.dlv_id_typ(sasR.getString("dlv_id_typ"));
				r.dlv_id_cd(sasR.getString("dlv_id_cd"));
				r.dlv_id_nm(sasR.getString("dlv_id_nm"));
				r.dlv_zip_cd(sasR.getString("dlv_zip_cd"));
				r.dlv_addr1(sasR.getString("dlv_addr1"));
				r.dlv_addr2(sasR.getString("dlv_addr2"));
				r.dlv_addr3(sasR.getString("dlv_addr3"));
				r.dlv_addr4(sasR.getString("dlv_addr4"));
				r.dlv_cntct_dpt(sasR.getString("dlv_cntct_dpt"));
				r.dlv_cntct_psn(sasR.getString("dlv_cntct_psn"));
				r.dlv_tel(sasR.getString("dlv_tel"));
				r.dlv_fax(sasR.getString("dlv_fax"));
				r.dlv_sundry_flg(sasR.getBoolean("dlv_sundry_flg"));
				r.cst_po_no(sasR.getString("cst_po_no"));
				r.cst_po_d_no(sasR.getString("cst_po_d_no"));
				r.cst_dlv_inst_no(sasR.getString("cst_dlv_inst_no"));
				r.cst_dlv_inst_d_no(sasR.getString("cst_dlv_inst_d_no"));
				r.cst_itm_cd(sasR.getString("cst_itm_cd"));
				r.cst_itm_nm(sasR.getString("cst_itm_nm"));
				r.rsn_cd(sasR.getString("rsn_cd"));
				r.trd_rmrks(sasR.getString("trd_rmrks"));
				r.trd_d_rmrks(sasR.getString("trd_d_rmrks"));
				r.io_schd_pr_no(sasR.io_schd_pr_no());
				r.abort_rel_flg(!r.abort_flg() && sasR.getBoolean("abort_flg"));	// 打切解除

				// 物流Ｇを跨いでインボイスは作成されない
				ShipAct_InptChk01_HdrR hdrR = r.getJoinedRow(_hdrJk);
				hdrR.ship_fr_lg_grp_cd(sasR.getString("ship_fr_lg_grp_cd"));
				hdrR.wg_cd(sasR.getString("wg_cd"));
				
				r.addStringColumn("rqst_dpt_cd", sasR.getString("rqst_dpt_cd"));
			}
			// 負担部門の組織変更対応
			setDpt(notErrL, ShipAct_InptChk01_DtlR.$bd_dpt_cd, ShipAct_InptChk01_DtlR.$ac_dt);
			// 依頼部門の組織変更対応
			setDpt(notErrL, "rqst_dpt_cd", null, ShipAct_InptChk01_DtlR.$ac_dt, true);

			return msgL;
		}

		/**
		 * 出荷実績の存在チェック、および上り電文のデータを補完する
		 */
		protected MCMessageList cmpleByShipAct(MCList<ShipAct_InptChk01_HdrR> hdrL) {

			MCMessageList msgL = new MCMessageList();

			MCList<ShipAct_InptChk01_HdrR> lst = hdrL.subList(r -> !MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()));
			if (!lst.isEmpty()) {
				MCList<MST_SHIP_ACT_R> dbc = MCList.create(MST_SHIP_ACT_R.class);
				MST_SHIP_ACT_R t = MST_SHIP_ACT_R.create("T");
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
				dbc_bldr.setSelect(t.ship_act_no, t.via_dlv_typ);
				dbSelectKeyForUpdate("MSBEL5540_MST_SHIP_ACT_S01", dbc, dbc_bldr, lst);

				MCIndexKey idx = dbc.createIndex(MST_SHIP_ACT_R.$ship_act_no);
				for (ShipAct_InptChk01_HdrR hdrR : lst) {
					MST_SHIP_ACT_R actR = dbc.getFirst(idx, hdrR.ship_act_no());
					if (isNull(actR)) {
						msgL.addAll(getRecordNotFoundMsg("MS", "MST_SHIP_ACT"
								, new String[]{MST_SHIP_ACT_R.$ship_act_no}
								, new Comparable[]{hdrR.ship_act_no()}, hdrR));
					}
					else if (isNull(hdrR.via_dlv_typ())) {
						hdrR.via_dlv_typ(actR.via_dlv_typ());
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 配送先経由区分を補完する。
		 * @param hdrL 出荷実績ヘッダリスト
		 */
		protected void cmpleViaDlvTyp(MCList<ShipAct_InptChk01_HdrR> hdrL) {
			
			hdrL.forEach(r -> {
				if (r.uplnd_flg() && isNull(r.via_dlv_typ())) {
					MCList<ShipAct_InptChk01_DtlR> dtlL = r.getJoined(_dtlJk);
					MAM_BP_R cstR = getBpR(r.cst_cd());
					MAM_BP_R tdlvR = getBpR(r.ship_to_id_cd());
					if (!isNull(tdlvR) && MSC_SHIP_TO_ID_TYP.isTDLV(r.ship_to_id_typ())
							&& !dtlL.isEmpty() && (MAC_TRD_PTN_TYP.isSLS(dtlL.get(0).trd_ptn_typ()) || MAC_TRD_PTN_TYP.isSHIP(dtlL.get(0).trd_ptn_typ()))
							&& !isNull(cstR) && cstR.cst_iv_flg()) {
						r.via_dlv_typ(tdlvR.via_dlv_typ());
					}
					else {
						r.via_dlv_typ(MAC_VIA_DLV_TYP.NOT_VIA.value());
					}
				}
			});
		}

		/**
		 * 出荷実績明細の存在チェック、および上り電文のデータを補完する
		 */
		protected MCMessageList cmpleByShipActD(MCList<ShipAct_InptChk01_HdrR> hdrL) {

			MCList<ShipAct_InptChk01_DtlR> dtlL = createShipAct_InptChk01_DtlL();
			for (ShipAct_InptChk01_HdrR hdrR : hdrL) {
				if (!MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ())) {
					dtlL.addAll(hdrR.getJoined(_dtlJk));
					dtlL.setDateNE(ShipAct_InptChk01_DtlR.$ac_dt, hdrR.ac_dt());
				}
			}

			MCMessageList msgL = new MCMessageList();
			MCList<ShipAct_InptChk01_DtlR>
				notErrL = getChkList(dtlL.subList(r ->  !MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())));
			if (isNull(notErrL)) {
				return msgL;
			}

			MCList<MST_SHIP_ACT_D_R> actDL = MCList.create(MST_SHIP_ACT_D_R.class);
			MST_SHIP_ACT_D_R t = MST_SHIP_ACT_D_R.create("T");
			MCQueryApiBuilder actDL_bldr = MCQueryApiBuilder.create(t);
			actDL_bldr.setSelect(t.ship_act_d_no, t.ship_act_no, t.trd_cd, t.trd_ptn_typ,
					t.io_schd_pr_no);
			dbSelectKey("MSBEL5540_MST_SHIP_ACT_D_S02", actDL, actDL_bldr, notErrL);

			MCIndexKey instIdx = actDL.createIndex(MST_SHIP_ACT_D_R.$ship_act_d_no);
			for (ShipAct_InptChk01_DtlR r : notErrL) {
				MST_SHIP_ACT_D_R actDR = actDL.getFirst(instIdx, r.ship_act_d_no());

				// 出荷実績明細NOがDBに登録されているか
				if (isNull(actDR)) {
					msgL.addAll(getRecordNotFoundMsg("MS", "MST_SHIP_ACT_D"
							, new String[]{MST_SHIP_ACT_D_R.$ship_act_d_no}
							, new Comparable[]{r.ship_act_d_no()}, r));
					continue;
				}

				// 出荷実績NOが妥当か
				ShipAct_InptChk01_HdrR hdrR = r.getJoinedRow(_hdrJk);
				if (!isSame(hdrR.ship_act_no(), actDR.ship_act_no())) {
					msgL.addAll(getRecordInvalidMsg(ShipAct_InptChk01_DtlR.$ship_act_no, r.ship_act_no(), r));
				}

				r.io_schd_pr_no(actDR.io_schd_pr_no());
				r.trd_cd(actDR.trd_cd());
				r.trd_ptn_typ(actDR.trd_ptn_typ());
			}
			// 負担部門の組織変更対応
			setDpt(notErrL, ShipAct_InptChk01_DtlR.$bd_dpt_cd, ShipAct_InptChk01_DtlR.$ac_dt);

			return msgL;
		}

		/**
		 * 出荷予定から出荷実績を登録する際のヘッダ項目
		 */
		protected final String[] _shipActHdrKey = {
			"trd_cd", "trd_ptn_typ",
			"ship_to_id_typ", "ship_to_id_cd", "ship_to_id_nm",
			"ship_to_zip_cd", "ship_to_addr1", "ship_to_addr2", "ship_to_addr3", "ship_to_addr4",
			"ship_to_cntct_dpt", "ship_to_cntct_psn", "ship_to_tel", "ship_to_fax",
			"via_dlv_typ",
			"ship_term_cd", "ship_to_lg_grp_cd", "ship_fr_lg_grp_cd", "ship_schd_tm",
			"dlv_id_typ", "dlv_id_cd", "dlv_id_nm",
			"dlv_zip_cd", "dlv_addr1", "dlv_addr2", "dlv_addr3", "dlv_addr4",
			"dlv_cntct_dpt", "dlv_cntct_psn", "dlv_tel", "dlv_fax"
		};
		protected boolean isSameShipActHdrKey(
			MST_SHIP_ALLOC_STS_R r1, MST_SHIP_ALLOC_STS_R r2) {
			for (String s : _shipActHdrKey) {
				if (!isSame(r1.getValue(s), r2.getValue(s))) {
					return false;
				}
			}
			return true;
		}

		/**
		 * 出荷引当状況、出荷予定の存在チェック、および上り電文のデータを補完する
		 */
		protected MCMessageList cmpleByShipSchd(MCList<ShipAct_InptChk01_HdrR> hdrL) {

			MCList<ShipAct_InptChk01_DtlR> dtlL = createShipAct_InptChk01_DtlL();
			for (ShipAct_InptChk01_HdrR hdrR : hdrL) {
				dtlL.addAll(hdrR.getJoined(_dtlJk));
				dtlL.setDateNE(ShipAct_InptChk01_DtlR.$ac_dt, hdrR.ac_dt());
			}

			MCMessageList msgL = new MCMessageList();
			MCList<ShipAct_InptChk01_DtlR> notErrL = getChkList(dtlL);
			if (isNull(notErrL)) {
				return msgL;
			}

			MCList<MST_SHIP_ALLOC_STS_R> schdL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			MST_SHIP_ALLOC_STS_R t = MST_SHIP_ALLOC_STS_R.create("T");
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
			MST_SHIP_SCHD_R t2 = MST_SHIP_SCHD_R.create("T2");
			MST_SHIP_PR_R t3 = MST_SHIP_PR_R.create("T3");
			MST_SLO_D_R t4 = MST_SLO_D_R.create("T4");
			MST_SLO_R t5 = MST_SLO_R.create("T5");
			MST_DLV_INST_RCPT_R t6 = MST_DLV_INST_RCPT_R.create("T6");
			schdL.addBooleanColumn("ship_to_sundry_flg");
			schdL.addBooleanColumn("sundry_itm_flg");
			schdL.addBooleanColumn("dlv_sundry_flg");
			schdL.addBooleanColumn("abort_flg");
			schdL_bldr.setSelect(t.ship_alloc_sts_no, t.io_schd_pr_no);
			schdL_bldr.addSelect(t3.trd_cd, t3.trd_ptn_typ, t5.slo_no,
					nvl2(t2.tdlv_cd, value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
							t3.ship_to_id_typ).as("ship_to_id_typ"),
					nvl(nvl(t2.tdlv_cd,
							decode(t3.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()), t2.dlv_cd,
									nullValue())),
							t3.ship_to_id_cd).as("ship_to_id_cd"),
					nvl2(t2.tdlv_cd, t2.tdlv_nm,
							decode(t3.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(t2.dlv_cd, t2.dlv_nm, t3.ship_to_id_nm),
									t3.ship_to_id_nm)).as("ship_to_id_nm"),
					nvl2(t2.tdlv_cd, t2.tdlv_zip_cd,
							decode(t3.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(t2.dlv_cd, t2.dlv_zip_cd, t3.ship_to_zip_cd),
									t3.ship_to_zip_cd)).as("ship_to_zip_cd"),
					nvl2(t2.tdlv_cd, t2.tdlv_addr1,
							decode(t3.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(t2.dlv_cd, t2.dlv_addr1, t3.ship_to_addr1),
									t3.ship_to_addr1)).as("ship_to_addr1"),
					nvl2(t2.tdlv_cd, t2.tdlv_addr2,
							decode(t3.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(t2.dlv_cd, t2.dlv_addr2, t3.ship_to_addr2),
									t3.ship_to_addr2)).as("ship_to_addr2"),
					nvl2(t2.tdlv_cd, t2.tdlv_addr3,
							decode(t3.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(t2.dlv_cd, t2.dlv_addr3, t3.ship_to_addr3),
									t3.ship_to_addr3)).as("ship_to_addr3"),
					nvl2(t2.tdlv_cd, t2.tdlv_addr4,
							decode(t3.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(t2.dlv_cd, t2.dlv_addr4, t3.ship_to_addr4),
									t3.ship_to_addr4)).as("ship_to_addr4"),
					nvl2(t2.tdlv_cd, t2.tdlv_cntct_dpt,
							decode(t3.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(t2.dlv_cd, t2.dlv_cntct_dpt,
											t3.ship_to_cntct_dpt),
									t3.ship_to_cntct_dpt)).as("ship_to_cntct_dpt"),
					nvl2(t2.tdlv_cd, t2.tdlv_cntct_psn,
							decode(t3.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(t2.dlv_cd, t2.dlv_cntct_psn,
											t3.ship_to_cntct_psn),
									t3.ship_to_cntct_psn)).as("ship_to_cntct_psn"),
					nvl2(t2.tdlv_cd, t2.tdlv_tel, decode(t3.ship_to_id_typ,
							value(MSC_SHIP_TO_ID_TYP.DLV.value()),
							nvl2(t2.dlv_cd, t2.dlv_tel, t3.ship_to_tel), t3.ship_to_tel))
									.as("ship_to_tel"),
					nvl2(t2.tdlv_cd, t2.tdlv_fax, decode(t3.ship_to_id_typ,
							value(MSC_SHIP_TO_ID_TYP.DLV.value()),
							nvl2(t2.dlv_cd, t2.dlv_fax, t3.ship_to_fax), t3.ship_to_fax))
									.as("ship_to_fax"),
					nvl2(t2.tdlv_cd, t2.tdlv_sundry_flg,
							decode(t3.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(t2.dlv_cd, t2.dlv_sundry_flg,
											t3.ship_to_sundry_flg),
									t3.ship_to_sundry_flg)).as("ship_to_sundry_flg"),
					nvl2(t2.tdlv_cd, t2.tdlv_lg_grp_cd,
							decode(t3.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(t2.dlv_cd, t2.dlv_lg_grp_cd,
											t3.ship_to_lg_grp_cd),
									t3.ship_to_lg_grp_cd)).as("ship_to_lg_grp_cd"),
					nvl(t2.via_dlv_typ, t3.via_dlv_typ).as("via_dlv_typ"),
					t2.wg_cd, t2.ship_fr_lg_grp_cd, t2.ship_term_cd, t3.ship_pr_no,
					t2.ship_schd_tm, t3.dlv_id_typ,
					nvl(t2.dlv_cd, t3.dlv_id_cd).as("dlv_id_cd"),
					nvl2(t2.dlv_cd, t2.dlv_nm, t3.dlv_id_nm).as("dlv_id_nm"),
					nvl2(t2.dlv_cd, t2.dlv_zip_cd, t3.dlv_zip_cd).as("dlv_zip_cd"),
					nvl2(t2.dlv_cd, t2.dlv_addr1, t3.dlv_addr1).as("dlv_addr1"),
					nvl2(t2.dlv_cd, t2.dlv_addr2, t3.dlv_addr2).as("dlv_addr2"),
					nvl2(t2.dlv_cd, t2.dlv_addr3, t3.dlv_addr3).as("dlv_addr3"),
					nvl2(t2.dlv_cd, t2.dlv_addr4, t3.dlv_addr4).as("dlv_addr4"),
					nvl2(t2.dlv_cd, t2.dlv_cntct_dpt, t3.dlv_cntct_dpt)
							.as("dlv_cntct_dpt"),
					nvl2(t2.dlv_cd, t2.dlv_cntct_psn, t3.dlv_cntct_psn)
							.as("dlv_cntct_psn"),
					nvl2(t2.dlv_cd, t2.dlv_sundry_flg, t3.dlv_sundry_flg)
							.as("dlv_sundry_flg"),
					nvl2(t2.dlv_cd, t2.dlv_tel, t3.dlv_tel).as("dlv_tel"),
					nvl2(t2.dlv_cd, t2.dlv_fax, t3.dlv_fax).as("dlv_fax"),
					t3.dlv_str_ln_cd, t2.itm_cd, t2.itm_sub1, t2.itm_sub2, t2.itm_sub3,
					t2.itm_nm, t2.iv_itm_nm, t2.sundry_itm_flg, t2.base_unit_cd,
					t2.ver_no, t2.sno1, t2.sno2, t2.sno3, t2.sno4, t2.stk_arrv_bp_cd,
					t2.quality_typ, t.stk_id_typ, t.stk_bp_cd, t2.abort_flg,
					t5.cst_po_no, t4.cst_po_d_no, t6.cst_dlv_inst_no,
					t6.cst_dlv_inst_d_no, t4.cst_itm_cd, t4.cst_itm_nm, t3.rsn_cd,
					t3.bd_dpt_cd, t2.trd_rmrks, t2.trd_d_rmrks, t3.rqst_dpt_cd,
					t2.ship_schd_no);
			schdL_bldr.addInnerJoin(t2, bracket(t2.ship_schd_no.eq(t.ship_schd_no)));
			schdL_bldr.addInnerJoin(t3, bracket(t3.ship_pr_no.eq(t2.ship_pr_no)));
			schdL_bldr.addLeftOuterJoin(t4, bracket(t4.slo_d_no.eq(t3.slo_d_no)));
			schdL_bldr.addLeftOuterJoin(t5, bracket(t5.slo_no.eq(t4.slo_no)));
			schdL_bldr.addLeftOuterJoin(t6,
					bracket(t6.dlv_inst_rcpt_no.eq(t2.dlv_inst_rcpt_no)));

			schdL_bldr.setWhere(t.ship_alloc_sts_no.eq(bind("ship_alloc_sts_no")));
			dbSelect("MSBEL5540_MST_SHIP_ALLOC_STS_S03", schdL, schdL_bldr,
					notErrL.groupBy("ship_alloc_sts_no"));

			MCIndexKey instIdx = schdL.createIndex(MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no);
			MCIndexKey up2Idx = up2().createIndex(ShipAct_InptChk01_CntrR.$ship_pr_no);

			notErrL.addStringColumn("rqst_dpt_cd");
			MST_SHIP_ALLOC_STS_R bkSasR = null;
			for (ShipAct_InptChk01_DtlR r : notErrL) {
				MST_SHIP_ALLOC_STS_R sasR = schdL.getFirst(instIdx, r.ship_alloc_sts_no());

				// 出荷引当状況NOがDBに登録されているか
				if (isNull(sasR)) {
					msgL.addAll(getRecordNotFoundMsg("MS", "MST_SHIP_ALLOC_STS"
							, new String[]{MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no}
							, new Comparable[]{r.ship_alloc_sts_no()}, r));
					continue;
				}
				sasR.setDate("ship_schd_tm", sasR.getDate("ship_schd_tm").trunc(MCDateFieldType.DAY));	// ここでは時分秒は使わない

				// ヘッダ項目が異なる
				if (!isNull(bkSasR) && !isSameShipActHdrKey(sasR, bkSasR)) {
					msgL.add(new MCMessage(r, null, MSBEL0032, toDispGUIIndex(r)));
				}
				else {
					// 上り電文から取得した出荷進捗と、出荷進捗更新カウンタとの妥当性をチェック
					ShipAct_InptChk01_CntrR up2R = up2().getFirst(up2Idx, sasR.toArray(up2Idx.getKeys()));
					if (isNull(up2R)) {
						msgL.addAll(getRecordInvalidMsg(MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no, r.ship_alloc_sts_no(), r));
					}
				}

				// 引継元の出荷予定からデータを補完
				if (isNull(bkSasR)) { 
					ShipAct_InptChk01_HdrR hdrR = r.getJoinedRow(_hdrJk);
					hdrR.ship_to_id_typ(sasR.getString("ship_to_id_typ"));
					hdrR.ship_to_id_cd(sasR.getString("ship_to_id_cd"));
					hdrR.ship_to_id_nm(sasR.getString("ship_to_id_nm"));
					hdrR.ship_to_zip_cd(sasR.getString("ship_to_zip_cd"));
					hdrR.ship_to_addr1(sasR.getString("ship_to_addr1"));
					hdrR.ship_to_addr2(sasR.getString("ship_to_addr2"));
					hdrR.ship_to_addr3(sasR.getString("ship_to_addr3"));
					hdrR.ship_to_addr4(sasR.getString("ship_to_addr4"));
					hdrR.ship_to_cntct_dpt(sasR.getString("ship_to_cntct_dpt"));
					hdrR.ship_to_cntct_psn(sasR.getString("ship_to_cntct_psn"));
					hdrR.ship_to_tel(sasR.getString("ship_to_tel"));
					hdrR.ship_to_fax(sasR.getString("ship_to_fax"));
					hdrR.ship_to_sundry_flg(sasR.getBoolean("ship_to_sundry_flg"));
					hdrR.via_dlv_typ(sasR.getString("via_dlv_typ"));
					hdrR.wg_cd(sasR.getString("wg_cd"));
					hdrR.ship_fr_lg_grp_cd(sasR.getString("ship_fr_lg_grp_cd"));
					hdrR.ship_to_lg_grp_cd(sasR.getString("ship_to_lg_grp_cd"));
					hdrR.ship_term_cd(sasR.getString("ship_term_cd"));
					bkSasR = sasR;
				}	
				r.trd_cd(sasR.getString("trd_cd"));
				r.trd_ptn_typ(sasR.getString("trd_ptn_typ"));
				r.itm_cd(sasR.getString("itm_cd"));
				r.itm_sub1(sasR.getString("itm_sub1"));
				r.itm_sub2(sasR.getString("itm_sub2"));
				r.itm_sub3(sasR.getString("itm_sub3"));
				r.itm_nm(sasR.getString("itm_nm"));
				r.iv_itm_nm(sasR.getString("iv_itm_nm"));
				r.sundry_itm_flg(sasR.getBoolean("sundry_itm_flg"));
				r.base_unit_cd(sasR.base_unit_cd());
				// 補完しない
				// r.sno1(sasR.sno1());
				// r.sno2(sasR.sno2());
				// r.sno3(sasR.sno3());
				// r.sno4(sasR.sno4());
				// r.ver_no(sasR.ver_no());
				r.stk_arrv_bp_cd(sasR.stk_arrv_bp_cd());
				r.quality_typ(sasR.quality_typ());
				r.stk_id_typ(sasR.stk_id_typ());
				if (isNullOrNullVal(r.stk_bp_cd())) {
					// 上り電文の在庫取引先ＣＤがNullか*の場合、補完する
					r.stk_bp_cd(sasR.stk_bp_cd());
				}
				r.dlv_id_typ(sasR.getString("dlv_id_typ"));
				r.dlv_id_cd(sasR.getString("dlv_id_cd"));
				r.dlv_id_nm(sasR.getString("dlv_id_nm"));
				r.dlv_zip_cd(sasR.getString("dlv_zip_cd"));
				r.dlv_addr1(sasR.getString("dlv_addr1"));
				r.dlv_addr2(sasR.getString("dlv_addr2"));
				r.dlv_addr3(sasR.getString("dlv_addr3"));
				r.dlv_addr4(sasR.getString("dlv_addr4"));
				r.dlv_cntct_dpt(sasR.getString("dlv_cntct_dpt"));
				r.dlv_cntct_psn(sasR.getString("dlv_cntct_psn"));
				r.dlv_tel(sasR.getString("dlv_tel"));
				r.dlv_fax(sasR.getString("dlv_fax"));
				r.dlv_sundry_flg(sasR.getBoolean("dlv_sundry_flg"));
				r.dlv_str_ln_cd(sasR.getString("dlv_str_ln_cd"));
				r.cst_po_no(sasR.getString("cst_po_no"));
				r.cst_po_d_no(sasR.getString("cst_po_d_no"));
				r.cst_dlv_inst_no(sasR.getString("cst_dlv_inst_no"));
				r.cst_dlv_inst_d_no(sasR.getString("cst_dlv_inst_d_no"));
				r.cst_itm_cd(sasR.getString("cst_itm_cd"));
				r.cst_itm_nm(sasR.getString("cst_itm_nm"));
				r.rsn_cd(sasR.getString("rsn_cd"));
				r.trd_rmrks(sasR.getString("trd_rmrks"));
				r.trd_d_rmrks(sasR.getString("trd_d_rmrks"));
				r.io_schd_pr_no(sasR.io_schd_pr_no());
				r.abort_rel_flg(!r.abort_flg() && sasR.getBoolean("abort_flg"));	// 打切解除
				
				r.addStringColumn("rqst_dpt_cd", sasR.getString("rqst_dpt_cd"));
			}
			// 負担部門の組織変更対応
			setDpt(notErrL, ShipAct_InptChk01_DtlR.$bd_dpt_cd, ShipAct_InptChk01_DtlR.$ac_dt);
			// 依頼部門の組織変更対応
			setDpt(notErrL, "rqst_dpt_cd", null, ShipAct_InptChk01_DtlR.$ac_dt, true);

			return msgL;
		}

		/**
		 * 基準単位数量の算出し補完する<br>
		 * ※事前に基準数量、換算数量、小数部有効桁数、端数処理区分が補完されていること
		 */
		protected void cmplBaseUnitQty(MCList<ShipAct_InptChk01_DtlR> notErrL) {
			for (ShipAct_InptChk01_DtlR r : notErrL) {
				r.base_unit_qty(
					convToBaseUnit(
						r.trd_unit_qty(), r.trd_unit_conv_base_qty() , r.trd_unit_conv_qty(),
						r.base_unit_dec_place(), r.base_unit_rnd_typ())
				);
			}
		}

		/**
		 * 受払進捗管理ＮＯを補完する
		 */
		protected void cmplIoSchdPrNo(MCList<ShipAct_InptChk01_DtlR> notErrL) {
			MCList<ShipAct_InptChk01_DtlR> seqL = MCList.create(ShipAct_InptChk01_DtlR.class);
			for (ShipAct_InptChk01_DtlR dtlR : notErrL) {
				if (MAC_TRD_PTN_TYP.isSLS(dtlR.trd_ptn_typ())
					 || MAC_TRD_PTN_TYP.isSHIP(dtlR.trd_ptn_typ())) {
					// 「売上」「出荷」は不使用
				}
				else if (isNull(dtlR.io_schd_pr_no())) {
					seqL.add(dtlR);	// 後でまとめて発番する
				}
			}
			if (seqL.size() > 0) {
				doSeqCache(MSC_NUM_SYS_TYP.IOSCHDPR, seqL.size());
				for (ShipAct_InptChk01_DtlR r : seqL) {
					r.io_schd_pr_no(getStrSeq(MSC_NUM_SYS_TYP.IOSCHDPR));
				}
			}
		}

		/**
		 * 計画外支給に対して支給区分を設定する
		 */
		protected void cmplProvTyp(MCList<ShipAct_InptChk01_DtlR> notErrL) {
			// 計画外の支給、支給返品の場合、支給区分、支給計上区分を設定する
			MCList<ShipAct_InptChk01_DtlR> provL = createShipAct_InptChk01_DtlL();
			for (ShipAct_InptChk01_DtlR r : notErrL) {

				ShipAct_InptChk01_HdrR hdrR = r.getJoinedRow(_hdrJk);
				if (!hdrR.uplnd_flg()) {
					// 予定ありは対象外
					continue;
				}
				if (MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
					provL.add(r);
				}
				else if (MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())) {
					if (isNull(r.ship_loc_sppl_cd())
						|| !isSame(r.ship_loc_sppl_cd(), r.dlv_sppl_cd())) {
						provL.add(r);
					}
				}
			}
			if (!provL.isEmpty()) {
				MSBEL_ProvSchdService.ProvSchd_Chk01 chk = MSBEL_ProvSchdService.crtProvSchd_Chk01();
				for (ShipAct_InptChk01_DtlR provR : provL) {
					ShipAct_InptChk01_HdrR hdrR = provR.getJoinedRow(_hdrJk);
					copy(chk.up0().add(), provR, hdrR, createMap_ProvSchd_DtlR_ShipAct_InptChk01_DtlR());
				}
				chk.exec();
				copyErrFlg(provL, chk.down0());
				if (hasErrFlgOn(provL)) {
					return;
				}

				MSBEL_ProvSchdService.ProvSchd_Sprt01 sprt = MSBEL_ProvSchdService.crtProvSchd_Sprt01();
				sprt.up0().setAll(chk.up0());
				sprt.exec();
				copyByPegNo(
					provL, new String[]{ShipAct_DtlR.$prov_typ, ShipAct_DtlR.$prov_basis_typ},
					sprt.down0(), new String[]{ProvSchd_DtlR.$prov_typ, ProvSchd_DtlR.$prov_basis_typ}
				);
			}
		}
		protected Map_ProvSchd_DtlR_ShipAct_InptChk01_DtlR<ProvSchd_DtlR,ShipAct_InptChk01_DtlR,ShipAct_InptChk01_HdrR> createMap_ProvSchd_DtlR_ShipAct_InptChk01_DtlR() {
			return new Map_ProvSchd_DtlR_ShipAct_InptChk01_DtlR<ProvSchd_DtlR, ShipAct_InptChk01_DtlR, ShipAct_InptChk01_HdrR>();
		}
		public class Map_ProvSchd_DtlR_ShipAct_InptChk01_DtlR<D extends ProvSchd_DtlR, S extends ShipAct_InptChk01_DtlR, W extends ShipAct_InptChk01_HdrR> extends MAUCC_RowMapperWith<D,S,W>{
			protected ShipAct_InptChk01_HdrR _hdrR;
			@Override
			public void setWith(ShipAct_InptChk01_HdrR hdrR) {
				_hdrR = hdrR;
			}
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ProvSchd_DtlR.$peg_no, ShipAct_InptChk01_DtlR.$peg_no);
				addColumnPathMap(ProvSchd_DtlR.$data_crud_typ, ShipAct_InptChk01_DtlR.$data_crud_typ);
				addColumnPathMap(ProvSchd_DtlR.$trd_ptn_typ, ShipAct_InptChk01_DtlR.$trd_ptn_typ);
				addColumnPathMap(ProvSchd_DtlR.$itm_cd, ShipAct_InptChk01_DtlR.$itm_cd);
				addColumnPathMap(ProvSchd_DtlR.$itm_sub1, ShipAct_InptChk01_DtlR.$itm_sub1);
				addColumnPathMap(ProvSchd_DtlR.$itm_sub2, ShipAct_InptChk01_DtlR.$itm_sub2);
				addColumnPathMap(ProvSchd_DtlR.$itm_sub3, ShipAct_InptChk01_DtlR.$itm_sub3);
				addColumnPathMap(ProvSchd_DtlR.$stk_id_typ, ShipAct_InptChk01_DtlR.$stk_id_typ);
				addColumnPathMap(ProvSchd_DtlR.$stk_arrv_bp_cd, ShipAct_InptChk01_DtlR.$stk_arrv_bp_cd);
				addColumnPathMap(ProvSchd_DtlR.$base_unit_qty, ShipAct_InptChk01_DtlR.$base_unit_qty);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				MAM_LOC_R locR = null;
				if (MAC_TRD_PTN_TYP.isPROV(src.trd_ptn_typ())) {
					locR = getLocR(src.dlv_id_cd());
				}
				else {
					locR = getLocR(src.ship_loc_cd());
				}
				dest.wg_cd(locR.wg_cd());
				dest.prsppl_cd(locR.sppl_cd());
	
				MAM_BP_R bpR = getBpR(dest.prsppl_cd());
				if (MAC_TRD_PTN_TYP.isPROV(src.trd_ptn_typ())) {
					if (MAC_PROV_RCV_TYP.isNOT_ARR(bpR.prov_rcv_typ())) {
						dest.accpt_schd_dt(_hdrR.ship_tm());
					}
					else {
						dest.accpt_schd_dt(_hdrR.dlv_tm());
					}
				}
				else {
					dest.accpt_schd_dt(_hdrR.ship_tm());
				}
				dest.accpt_schd_dt(dest.accpt_schd_dt().trunc(MCDateFieldType.DAY));
			}
		}

		/**
		 * 更新対象外とする明細にフラグを立てる<br>
		 * 以下の明細を更新対象外とする<br>
		 * ※更新対象外は納品書NO単位で対象外とする<br>
		 * 
		 * 更新対象外とする条件）<br>
		 * －ヘッダの納品書NOと納品書NOが異なる明細<br>
		 * －出荷返品済み<br>
		 * －検収基準かつ売上済み<br>
		 * －着荷要かつ入荷済み<br>
		 */
		protected void setNonUpdFlg(MCList<ShipAct_InptChk01_DtlR> notErrL) {

			MCList<ShipAct_HdrR> hdrL = createShipAct_HdrL();
			for (MCList<ShipAct_InptChk01_DtlR> lst : notErrL.subList(r -> !isNull(r.ship_act_d_no()))
					.groupList(ShipAct_InptChk01_DtlR.$hdr_peg_no)) {
				hdrL.add().ship_act_no(lst.get(0).getJoinedRow(_hdrJk).ship_act_no());
			}
			doShipActCache(hdrL);
			doShipActDCache(hdrL);

			// 納品書NO単位でチェック対象・対象外を分ける
			Map<String, String> dlvMap = new HashMap<>();

			// 訂正前の実績情報(ヘッダ)
			MCList<ShipAct_InptChk01_DtlR> tgtL = notErrL.subList(r -> !isNull(r.ship_act_d_no()));
			int nonUpdCnt = 0;
			for (ShipAct_InptChk01_DtlR r : tgtL) {
				ShipAct_InptChk01_HdrR hdrR = r.getJoinedRow(_hdrJk);

				// 訂正前の実績情報(明細)
				ShipAct_DtlR actDR = getShipActDR(r.ship_act_d_no());

				// ヘッダの納品書NOと異なる
				// ※ヘッダの納品書NOは、納品書NO単位で訂正する場合にのみ設定される
				if (!isNull(hdrR.dlv_slip_no())
					&& !isSame(r.dlv_slip_no(), hdrR.dlv_slip_no())) {
					r.non_upd_flg(true);
				}
				// 更新不可となった納品書は対象外
				else if (dlvMap.containsKey(actDR.dlv_slip_no())) {
					r.non_upd_flg(true);
				}
				// 更新可能か判定
				else if (!canUpdActDR(r.ship_act_d_no())) {
					r.non_upd_flg(true);
					dlvMap.put(actDR.dlv_slip_no(), null);
				}

				if (r.non_upd_flg() && !r.abort_flg() && !r.abort_rel_flg()) {
					// 打切、打切解除を除く更新対象外をカウント
					nonUpdCnt++;
				}
			}

			if (tgtL.size() == notErrL.size()
				&& tgtL.size() > 0
				&& nonUpdCnt == tgtL.size()) {

				// 全件対象外となる場合は、チェック処理でエラーにするため全件対象にする
				notErrL.forEach(r -> r.non_upd_flg(false));
			}
		}
	
		/**
		 * 更新できる出荷実績明細か判定する<br>
		 * 更新できる場合は true を返す
		 */
		protected boolean canUpdActDR(String shipActDNo) {
			if (isNull(shipActDNo)) {
				return true;
			}
			// 訂正前の実績情報(明細)
			ShipAct_DtlR actDR = getShipActDR(shipActDNo);
			if (isNull(actDR)) {
				return true;
			}
			// 輸出済みは更新不可
			if (existIvAct(actDR)) {
				return false;
			}
			// 出荷返品済みは更新不可
			if (existShipRet(actDR)) {
				return false;
			}
			ShipAct_HdrR actHR = getShipActR(actDR.ship_act_no());
			if (!isSync(actHR, actDR)) {
				if (MAC_TRD_PTN_TYP.isSLS(actDR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSHIP(actDR.trd_ptn_typ())) {
					// 検収基準かつ売上済みは更新不可
					if (existSlsActIo(actDR)) {
						return false;
					}
				}
				else {
					// 着荷基準かつ入荷済みは更新不可
					if (existArrAct(actDR)) {
						return false;
					}
				}
			}
			return true;
		}

		/**
		 * 出荷実績SV 更新前チェック処理を実行する
		 */
		protected void callShipActChkSrv() {
			// チェックOKのレコードをChk01に渡す
			MCIndexKey idxkey = up1().createIndex(
					ShipAct_InptChk01_DtlR.$hdr_peg_no, 
					ShipAct_InptChk01_DtlR.$err_flg);
			
			MCList<ShipAct_InptChk01_HdrR> hdrL = MCList.create(ShipAct_InptChk01_HdrR.class);
			MCList<ShipAct_InptChk01_DtlR> dtlL = MCList.create(ShipAct_InptChk01_DtlR.class);
			
			for (ShipAct_InptChk01_HdrR hdrR : up0()) {
				if (hdrR.err_flg() || up1().contains(idxkey, hdrR.peg_no(), true)) {
					continue;
				}
				
				hdrL.add(hdrR);
				dtlL.addAll(up1().subList(idxkey, hdrR.peg_no(), false));
			}
			up_SA_v0_0(v0_up0, hdrL);
			up_SA_v0_1(v0_up1, dtlL);
			up_SA_v0_2(v0_up2, up3());
			v0.exec();

			MCIndexKey
				idx0 = v0.down0().createIndex(ShipAct_HdrR.$peg_no),
				idx1 = v0.down1().createIndex(ShipAct_DtlR.$hdr_peg_no, ShipAct_DtlR.$peg_no);
			for (ShipAct_InptChk01_HdrR hdrR : up0()) {
				ShipAct_HdrR src0 = v0.down0().getFirst(idx0, hdrR.peg_no());
				if (!isNull(src0)) {
					hdrR.err_flg(src0.err_flg());

					for (ShipAct_InptChk01_DtlR dtlR : hdrR.getJoined(_dtlJk)) {
						ShipAct_DtlR src1 = v0.down1().getFirst(idx1, hdrR.peg_no(), dtlR.peg_no());
						if (src1 != null && src1.err_flg()) {
							dtlR.err_flg(src1.err_flg());
						}
					}
				}
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
			for (ShipAct_InptChk01_HdrR downR : down0()) {
				if (!isNull(downR.getJoined(_dtlJk).getFirst(ShipAct_InptChk01_DtlR.$err_flg, true))) {
					// 明細にエラーがある場合、ヘッダのフラグも立てる
					downR.err_flg(true);
				}
			}
		}
	}

	/**
	 * ShipAct_InptChk02オペレーション.<p>
	 *
	 * 出荷実績の削除が可能かチェックをする。<br>
	 */
	public class ShipAct_InptChk02 extends MSBEL_ShipActService_MC_A.ShipAct_InptChk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			if (!hasErrFlgOn(up0())) {
				// 出荷実績チェック処理
				callShipActChkSrv();
			}

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 出荷実績からデータ補完
			msgL.addAll(cmpleByShipAct());
			msgL.addAll(cmpleByShipActD());

			return msgL;
		}

		/**
		 * 出荷実績の存在チェック、および上り電文のデータを補完する
		 */
		protected MCMessageList cmpleByShipAct() {
			MCMessageList msgL = new MCMessageList();

			MCList<MST_SHIP_ACT_R> dbc = MCList.create(MST_SHIP_ACT_R.class);
			MST_SHIP_ACT_R t = MST_SHIP_ACT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.ship_act_no, t.ship_fr_lg_grp_cd, t.uplnd_flg);
			dbSelectKey("MSBEL5540_MST_SHIP_ACT_S02", dbc, dbc_bldr, up0());

			MCIndexKey idx = dbc.createIndex(MST_SHIP_ACT_R.$ship_act_no);
			for (ShipAct_InptChk02_HdrR hdrR : up0()) {
				MST_SHIP_ACT_R actR = dbc.getFirst(idx, hdrR.ship_act_no());
				if (isNull(actR)) {
					msgL.addAll(getRecordNotFoundMsg("MS", "MST_SHIP_ACT"
							, new String[]{MST_SHIP_ACT_R.$ship_act_no}
							, new Comparable[]{hdrR.ship_act_no()}, hdrR));
				}
				hdrR.ac_dt(actR.ac_dt());
				hdrR.ship_fr_lg_grp_cd(actR.ship_fr_lg_grp_cd());
				hdrR.uplnd_flg(actR.uplnd_flg());
			}

			return msgL;
		}

		/**
		 * 出荷実績明細の存在チェック、および上り電文のデータを補完する
		 */
		protected MCMessageList cmpleByShipActD() {

			MCMessageList msgL = new MCMessageList();
			MCList<ShipAct_InptChk02_HdrR> hdrL = up0().subList(r -> !r.uplnd_flg());
			if (isNull(hdrL)) {
				return msgL;
			}

			MCList<MST_SHIP_ACT_D_R> actDL = MCList.create(MST_SHIP_ACT_D_R.class);
			MST_SHIP_ACT_D_R t = MST_SHIP_ACT_D_R.create("T");
			MCQueryApiBuilder actDL_bldr = MCQueryApiBuilder.create(t);
			MST_SHIP_ALLOC_STS_R t1 = MST_SHIP_ALLOC_STS_R.create("T1");
			MST_SHIP_SCHD_R t2 = MST_SHIP_SCHD_R.create("T2");
			actDL_bldr.setSelect(t.ship_act_d_no, t.ship_act_no, t.ship_alloc_sts_no,
					t.trd_cd, t.io_schd_pr_no);
			actDL_bldr.addSelect(t2.ship_pr_no);
			actDL_bldr.addInnerJoin(t1,
					bracket(t1.ship_alloc_sts_no.eq(t.ship_alloc_sts_no)));
			actDL_bldr.addInnerJoin(t2, bracket(t2.ship_inst_d_no.eq(t1.ship_inst_d_no)
					.or(t2.ship_schd_no.eq(t1.ship_schd_no))));
			actDL_bldr.setWhere(t.ship_act_no.eq(bind("ship_act_no")));
			actDL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelect("MSBEL5540_MST_SHIP_ACT_D_S03", actDL, actDL_bldr, hdrL);

			MCIndexKey idx = up1().createIndex(
				ShipAct_InptChk01_CntrR.$ship_alloc_sts_no, ShipAct_InptChk01_CntrR.$ship_pr_no
			);
			for (MST_SHIP_ACT_D_R r : actDL) {
				ShipAct_InptChk01_CntrR cntrR = up1().getFirst(idx, r.toArray(idx.getKeys()));

				// 実績に紐付く出荷引当状況NOおよび出荷進捗NOが妥当か
				// ⇒実績に対する出荷進捗に対して、ロックおよび更新カウンタチェックが行われているか
				if (isNull(cntrR)) {
					msgL.addAll(getRecordInvalidMsg(
						ShipAct_InptChk01_CntrR.$ship_alloc_sts_no, r.ship_alloc_sts_no(), r));
				}
			}
			return msgL;
		}

		/**
		 * 出荷実績SV 更新前チェック処理を実行する
		 */
		protected void callShipActChkSrv() {
			mapUpContainers(SA);
			v0.exec();

			MCIndexKey
				idx0 = v0.down0().createIndex(ShipAct_HdrR.$peg_no);
			for (ShipAct_InptChk02_HdrR hdrR : up0()) {
				ShipAct_HdrR src0 = v0.down0().getFirst(idx0, hdrR.peg_no());
				if (!isNull(src0)) {
					hdrR.err_flg(src0.err_flg());
				}
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}

	/**
	 * ShipAct_Upd01オペレーション.<p>
	 *
	 * 出荷実績を更新する。<br>
	 */
	public class ShipAct_Upd01 extends MSBEL_ShipActService_MC_A.ShipAct_Upd01 {
		/**
		 * 更新対象のリスト<br>
		 * 売上済みや入荷済みなど、更新対象外を除いたリスト
		 */
		protected MCList<ShipAct_DtlR> _up1 = null;
		/**
		 * 明細からヘッダを特定するJOINキー
		 */
		protected MCJoinKey<MCList<ShipAct_HdrR>> _hdrJk = null;
		/**
		 * ヘッダから明細を特定するJOINキー
		 */
		protected MCJoinKey<MCList<ShipAct_DtlR>> _dtlJk = null;
		protected MCJoinKey<MCList<ShipAct_DtlR>> _dtlAllJk = null;
		/**
		 * インボイス登録サービス実行制御フラグ（インボイスの受払実績を作成するため）
		 */
		protected boolean _callIvRegSrvForIvIoActFlg = false;
		
		/**
		 * 訂正前の納品書の金額情報リスト（与信更新用）
		 */
		protected MCList<MST_DLV_SLIP_D_R> srcCredDlvSlipDL = null;

		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {

			// 初期処理
			editUp();

			getCredDlvSlipDL();
			// メイン処理
			boolean isChk = false;	// チェック処理ではなく本処理を実行する
			crtJk();
			delIoActWk();
			callArrActSrvDel(_up1, _hdrJk);	// 入荷予定を処理する前に実績を削除する
			updShipAct();
			updShipActD();
			callIvRegSrvUpd03(up1(), _hdrJk);
			callProvActSrv(_up1, _hdrJk, isChk);
			callShipRprtPrntSrv(up0(), up2(), _hdrJk, _dtlJk);
			callShipLotSrv(_up1, _hdrJk, isChk);
			callVmiSrv(_up1, _hdrJk, isChk);
			callPreIoSlipSrv(up0(), _dtlJk);
			callIvRegSrvUpd04();
			callShipSchdSrv(up1(), _hdrJk);
			callShipInstSrv(up1(), _hdrJk);
			callExActSrv(up0(), isChk);
			callExActSrvForOther(up1(), _hdrJk, isChk);
			callSloStsSrv(up0(), _dtlJk);
			callArrSchdSrv(_up1, _hdrJk, isChk);
			callArrActSrvUpd(up0(), _up1, _hdrJk);
			callSlsSchdSrv(up0(), _dtlAllJk);
			callSlsSchdSrvForIv(up1(), _hdrJk);
			callShipSchdUpd05(up0(), _dtlAllJk);
			callSlsActSrv(up0(), up1(), _dtlAllJk);
			callAprvStsSrv(_up1, _hdrJk, isChk);
			callIoSlipSrv(up0());
			updCred();
			callRevDataIns01(up0());
			setDown();
		}

		/**
		 * ヘッダと明細を関連付けるキーを生成する
		 */
		protected void crtJk() {
			// 明細からヘッダを特定するJOINキー
			_hdrJk = up1().join(ShipAct_DtlR.$hdr_peg_no, up0(), ShipAct_HdrR.$peg_no);

			// ヘッダから対応する明細を特定するJOINキー
			_dtlJk = up0().join(ShipAct_HdrR.$peg_no, _up1, ShipAct_DtlR.$hdr_peg_no);
			_dtlAllJk = up0().join(ShipAct_HdrR.$peg_no, up1(), ShipAct_DtlR.$hdr_peg_no);
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			_up1 = createShipAct_DtlL();

			MCNumber pegNo = nvl((MCNumber)up1().max(ShipAct_DtlR.$peg_no), MCNumber.ZERO);

			MCIndexKey idx = up1().createIndex(ShipAct_DtlR.$hdr_peg_no);
			for (ShipAct_HdrR hdrR : up0()) {
				MCList<ShipAct_DtlR> dtlL = up1().subList(idx, hdrR.peg_no());

				if (MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
					ShipAct_HdrR r = getShipActR(hdrR.ship_act_no());
					hdrR.sa(r.sa());
					hdrR.sync_flg(r.sync_flg());
	
					dtlL = createShipAct_DtlL();
					for (MCList<ShipAct_DtlR> lst : getShipActDLFromHdr(hdrR.ship_act_no()).groupList(ShipAct_DtlR.$ship_act_d_no)) {
						ShipAct_DtlR dtlR = dtlL.add();
						MCRow.copyall(dtlR, lst.get(0));
						dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						dtlR.hdr_peg_no(hdrR.peg_no());
						dtlR.setAttributes(hdrR);
					}
					// peg_noはShipAct_Chk01と合わせること
					dtlL.sort(ShipAct_DtlR.$ship_act_d_no);
					for (ShipAct_DtlR rr : dtlL) {
						pegNo = pegNo.add(1);
						rr.peg_no(pegNo);
					}
				}
				cmplShipAct(hdrR, dtlL);
				cmplShipActD(dtlL);

				_up1.addAll(dtlL);
			}
			setShipActNo();
			setShipActDNo();
			
			// ＶＭＩサービス呼び出し時に元の紐付けＮＯが必要となるが、原則peg_noと同じとなる
			setOrgPegNo(_up1);

			// _up1 には売上済みや入荷済みなどの更新対象外は含めず、更新対象のみ設定する
			up1().setAll(_up1);
			_up1.removeAll(_up1.subList(r -> r.non_upd_flg()));
			
			// 分割出荷の場合、納品書NOを再発番する
			clearDlvSlipNo(up0(), _up1);
		}
		
		protected void setOrgPegNo(MCList <ShipAct_DtlR> shipActDtlL) {
			for (ShipAct_DtlR shipActDtlR : shipActDtlL) {
				//org_peg_noが渡されるのは、出荷実績一覧のみ
				if (isNull(shipActDtlR.org_peg_no())) {
					shipActDtlR.org_peg_no(shipActDtlR.peg_no());
				}
			}
		}
		
		/**
		 * 訂正前の納品書の金額情報リスト（与信更新用）を取得する。
		 */
		protected void getCredDlvSlipDL() {
			srcCredDlvSlipDL = getDlvSlipDL();
		}
		
		/**
		 * 与信の更新対象
		 */
		protected CredList _credL = new CredList();
		
		/**
		 * 与信更新
		 */
		protected void updCred() {
			_credL.init();

			// 与信更新対象を取得
			MCList<MST_DLV_SLIP_D_R> tgtL = getCredTgtL();

			for (MST_DLV_SLIP_D_R tgtR : tgtL) {
				// 与信更新対象を取得
				Cred_Upd01_CndR credR = _credL.get(tgtR.getString("cst_cd"), tgtR.getString("trd_cur_cd"));
				
				MCNumber schdQty = MCNumber.max(tgtR.getNumber("ship_schd_qty"), tgtR.getNumber("ship_inst_qty"));
				MCNumber actQty = MCNumber.max(tgtR.getNumber("ship_act_qty"), tgtR.getNumber("src_ship_act_qty"));
				if (actQty.gt(schdQty)) {
					
					MCNumber credQty = MCNumber.ZERO;
					if (tgtR.getNumber("src_ship_act_qty").gt(schdQty)) {
						credQty = schdQty.subtract(tgtR.getNumber("src_ship_act_qty"));
					}
					if (tgtR.getNumber("ship_act_qty").gt(schdQty)) {
						credQty = credQty.add(tgtR.getNumber("ship_act_qty").subtract(schdQty));
					}
					MCNumber dlvQty = tgtR.getNumber("ship_act_qty").isZero() ? tgtR.getNumber("src_ship_act_qty") : tgtR.getNumber("ship_act_qty");
					
					MCNumber credAmt = (tgtR.getNumber("trd_cur_amt").add(tgtR.getNumber("trd_cur_tax_amt"))
							.multiply(credQty)
							.divide(dlvQty, tgtR.getNumber("amt_dec_place").intValue(), MAC_RND_TYP.toMC(tgtR.getString("sls_tax_rnd_typ"))));
					credR.amt(credR.amt().add(credAmt));
				}
			}

			// 与信更新サービス
			callCredUpd();
		}
		
		/**
		 * 与信更新
		 */
		protected void callCredUpd() {
			MCList<Cred_Upd01_CndR> credL = _credL.toMCList().subList(r -> !r.amt().isZero());
			if (!credL.isEmpty()) {
				MSBGL_CredService.Cred_Upd01 o = MSBGL_CredService.crtCred_Upd01();
				o.up0().setAll(credL);
				o.exec();
				if (!o.down1().isEmpty()){
					MCMessageList msgList = new MCMessageList();
					for (Cred_Upd01_ErrR errR : o.down1()) {

						MCMessage msg = new MCMessage(MSBBL0124, errR.cred_cd(), errR.cur_cd(), errR.cred_amt(), errR.cred_limit());
						msgList.add(msg);
					}

					MCAppException ex = new MCAppException(msgList.get(0));
					msgList.remove(0);
					ex.addCauseMessageList(msgList);

					throw ex;
				}
			}
		}

		/**
		 * 与信更新対象のレコードを取得する
		 * @param up0L	「出荷実績ＮＯ」を含んだリスト
		 * @return	与信更新対象のリスト
		 */
		protected MCList<MST_DLV_SLIP_D_R> getCredTgtL() {
			
			MCList<MST_DLV_SLIP_D_R> dlvL = getDlvSlipDL();
			if (!srcCredDlvSlipDL.isEmpty()) {
				dlvL.merge(srcCredDlvSlipDL, MST_SHIP_SCHD_R.$ship_schd_no);
			}
			MCList<MST_DLV_SLIP_D_R> tgtL = dlvL.createInstance();
			
			if (!dlvL.isEmpty()) {
				MCIndexKey dlvIdx = dlvL.createIndex(MST_SHIP_SCHD_R.$ship_schd_no);
				
				// 予定数 or 出荷指図数 or 出荷実績数を取得する
				MCList<MST_SHIP_SCHD_R> ssL = MCList.create(MST_SHIP_SCHD_R.class);
				MST_SHIP_SCHD_R shipSchd = MST_SHIP_SCHD_R.create("SHIPSCHD");
				MCQueryApiBuilder ssL_bldr = MCQueryApiBuilder.create(shipSchd);
				MST_SHIP_PR_R shipPr = MST_SHIP_PR_R.create("SHIPPR");
				ssL_bldr.setSelect(shipSchd.ship_schd_no, shipSchd.base_unit_qty, shipSchd.ship_inst_qty,
						shipSchd.ship_act_qty, shipPr.slo_d_no);
				ssL_bldr.addInnerJoin(shipPr, bracket(shipPr.ship_pr_no.eq(shipSchd.ship_pr_no)));
				ssL_bldr.setWhere(shipSchd.ship_schd_no.eq(bind("ship_schd_no")));
				ssL_bldr.addConstWhereWithAnd(
						shipPr.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())));
				dbSelect("MSBEL5540_MST_SHIP_SCHD_S01", ssL, ssL_bldr, dlvL, null);

				// 受注明細を取得する。
				MCList<MST_SLO_D_R> sloL = MCList.create(MST_SLO_D_R.class);
				MST_SLO_D_R sloD = MST_SLO_D_R.create("SLOD");
				MCQueryApiBuilder sloL_bldr = MCQueryApiBuilder.create(sloD);
				MST_SLO_R slo = MST_SLO_R.create("SLO");
				MAM_CUR_R trdCur = MAM_CUR_R.create("TRDCUR");
				MAM_BP_R cst = MAM_BP_R.create("CST");
				
				sloL_bldr.setSelect(sloD.slo_d_no, sloD.sls_cststk_flg, slo.cst_cd,
						slo.trd_cur_cd, cst.sls_amt_rnd_typ, cst.sls_tax_rnd_typ, trdCur.amt_dec_place);
				sloL_bldr.addInnerJoin(slo, bracket(slo.slo_no.eq(sloD.slo_no)));
				sloL_bldr.addLeftOuterJoin(cst, bracket(cst.bp_cd.eq(slo.cst_cd)));
				sloL_bldr.addLeftOuterJoin(trdCur, bracket(trdCur.cur_cd.eq(slo.trd_cur_cd)));
				sloL_bldr.setWhere(sloD.slo_d_no.eq(bind("slo_d_no")));
				dbSelect("MSBEL5540_MST_SLO_D_S02", sloL, sloL_bldr, ssL);
				MCIndexKey sloIdx = sloL.createIndex(MST_SLO_D_R.$slo_d_no);

				// 出荷予定ごとに集計
				for (MST_SHIP_SCHD_R ssR : ssL) {
					MST_SLO_D_R sloR = sloL.getFirst(sloIdx, ssR.getString("slo_d_no"));
					if (sloR.sls_cststk_flg()) {
						continue;
					}
					MST_DLV_SLIP_D_R dlvR = dlvL.getFirst(dlvIdx, ssR.ship_schd_no());
					if (isNull(dlvR)) {
						dlvR = tgtL.createRow();
						dlvR.setString("ship_schd_no", ssR.ship_schd_no());
						dlvR.slo_d_no(ssR.getString("slo_d_no"));
						dlvR.trd_cur_amt(0);
						dlvR.trd_cur_tax_amt(0);
					}
					dlvR.setNumber("ship_schd_qty", ssR.base_unit_qty());
					dlvR.setNumber("ship_inst_qty", ssR.ship_inst_qty());
					dlvR.setNumber("ship_act_qty", ssR.ship_act_qty());
					dlvR.setString("cst_cd", sloR.getString("cst_cd"));
					dlvR.setString("trd_cur_cd", sloR.getString("trd_cur_cd"));
					dlvR.setString("sls_amt_rnd_typ", sloR.getString("sls_amt_rnd_typ"));
					dlvR.setString("sls_tax_rnd_typ", sloR.getString("sls_tax_rnd_typ"));
					dlvR.setNumber("amt_dec_place", sloR.getNumber("amt_dec_place"));

					tgtL.add(dlvR);
				}
				
				for (ShipAct_DtlR dtlR : up1()) {
					MST_SHIP_ALLOC_STS_R sasR = getShipAllocStsR(dtlR);
					if(isNull(sasR)) {
						continue;
					}
					MST_DLV_SLIP_D_R dlvSlipDR = tgtL.getFirst("ship_schd_no", sasR.ship_schd_no());
					if (isNull(dlvSlipDR)) {
						continue;
					}
					dlvSlipDR.setValueNE("src_ship_act_qty", sasR.getNumber("ss_ship_act_qty"));
				}
			}
			return tgtL;
		}
		
		/**
		 * 出荷予定ごとの納品書の金額を取得する。
		 * @return 出荷予定ごとの納品書の金額
		 */
		protected MCList<MST_DLV_SLIP_D_R> getDlvSlipDL() {
			
			MCList<MST_DLV_SLIP_D_R> dlvL = MCList.create(MST_DLV_SLIP_D_R.class);
			dlvL.addStringColumn("ship_schd_no");
			dlvL.addStringColumn("trd_cur_cd");
			dlvL.addStringColumn("cst_cd");
			dlvL.addStringColumn("sls_amt_rnd_typ");
			dlvL.addStringColumn("sls_tax_rnd_typ");
			dlvL.addNumberColumn("amt_dec_place");
			dlvL.addNumberColumn("ship_schd_qty");
			dlvL.addNumberColumn("ship_inst_qty");
			dlvL.addNumberColumn("ship_act_qty");
			dlvL.addNumberColumn("src_ship_act_qty");
			
			MST_DLV_SLIP_D_R dlvSlipD = MST_DLV_SLIP_D_R.create("DLVSLIPD");
			MST_DLV_SLIP_R dlvSlip = MST_DLV_SLIP_R.create("DLVSLIP");
			MST_SHIP_ACT_D_R shipActD = MST_SHIP_ACT_D_R.create("SHIPACTD");
			MST_SHIP_ALLOC_STS_R shipAllocSts = MST_SHIP_ALLOC_STS_R.create("SAS");
			MAM_BP_R cst = MAM_BP_R.create("CST");
			
			MCQueryApiBuilder dlvL_bldr = MCQueryApiBuilder.create(dlvSlipD);
			dlvL_bldr.addGroupBy(shipAllocSts.ship_schd_no, dlvSlip.slip_sts_typ);
			dlvL_bldr.addGroupFunc(nvl(sum(dlvSlipD.trd_cur_amt), value(0)), "trd_cur_amt");
			dlvL_bldr.addGroupFunc(nvl(sum(dlvSlipD.trd_cur_tax_amt), value(0)), "trd_cur_tax_amt");
			dlvL_bldr.addInnerJoin(dlvSlip, dlvSlip.dlv_slip_no.eq(dlvSlipD.dlv_slip_no)
					.and(dlvSlip.dlv_slip_seq.eq(dlvSlipD.dlv_slip_seq)));
			dlvL_bldr.addInnerJoin(shipActD, dlvSlipD.dlv_slip_no.eq(shipActD.dlv_slip_no)
					.and(dlvSlipD.dlv_slip_seq.eq(shipActD.dlv_slip_seq)).and(dlvSlipD.dlv_slip_d_no.eq(shipActD.dlv_slip_d_no)));
			dlvL_bldr.addInnerJoin(shipAllocSts, shipActD.ship_alloc_sts_no.eq(shipAllocSts.ship_alloc_sts_no));
			dlvL_bldr.addLeftOuterJoin(cst, bracket(cst.bp_cd.eq(dlvSlip.bp_cd)));
			dlvL_bldr.setWhere(shipAllocSts.ship_schd_no.eq(bind("ship_schd_no")));
			dlvL_bldr.addConstWhereWithAnd(
					dlvSlip.trn_typ.eq(value(MSC_TRN_TYP.SHIP.value()))
					.and(dlvSlip.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
					.and(dlvSlip.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
					.and(shipActD.stk_id_typ.neq(value(MSC_STK_ID_TYP.CSTSTK.value())))
					.and(cst.cst_iv_flg.eq(value(true))));
			dbSelect("MSBEL5540_MST_DLV_SLIP_D_S02", dlvL, dlvL_bldr, _up1, null);
			
			return dlvL;
		}

		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			setPrStsTyp();
			down0().setAll(up0());
			down1().setAll(up1());
		}

		/**
		 * 出荷実績ＮＯを発番・設定する
		 */
		protected void setShipActNo() {
			MCList<ShipAct_HdrR> setNumL = createShipAct_HdrL();
			MCList<ElmArgsR> elmArgsL = MCList.create(ElmArgsR.create());
			for (ShipAct_HdrR hdrR : up0()) {
				if (MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ())) {
					ElmArgsR r = ElmArgsR.create();
					r.co_cd(getCo().co_cd());
					r.wg_cd(hdrR.wg_cd());
					r.dt(hdrR.ship_tm().trunc(MCDateFieldType.DAY));
					r.peg_no(hdrR.peg_no());
					elmArgsL.add(r);
					setNumL.add(hdrR);
				}
			}
			if (!elmArgsL.isEmpty()) {
				setNum(MAC_NUM_BIZ_TYP.SHIPACT, elmArgsL);
				for (int i=0; i<elmArgsL.size(); i++) {
					ShipAct_HdrR hdrR = setNumL.get(i);
					hdrR.ship_act_no(elmArgsL.get(i).new_no());
				}
			}
		}
	
		/**
		 * 出荷実績明細ＮＯを発番・設定する
		 */
		protected void setShipActDNo() {
			MCList<ShipAct_DtlR> setNumL = createShipAct_DtlL();
			MCIndexKey idx = up1().createIndex(ShipAct_DtlR.$hdr_peg_no);
			for (ShipAct_HdrR hdrR : up0()) {
				MCList<ShipAct_DtlR> l = up1().subList(idx, hdrR.peg_no());
				if (MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ())) {
					setNumL.addAll(l);
				}
				else {
					for (ShipAct_DtlR dtlR : l) {
						if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
							setNumL.add(dtlR);
						}
					}
				}
			}
			if (!setNumL.isEmpty()) {
				doSeqCache(MSC_NUM_SYS_TYP.SHACTD, setNumL.size());
				for (ShipAct_DtlR r : setNumL) {
					r.ship_act_d_no(getStrSeq(MSC_NUM_SYS_TYP.SHACTD));
				}
			}
		}

		/**
		 * 出荷進捗状況を取得・設定する
		 */
		protected void setPrStsTyp() {
	
			MCList<ShipAct_DtlR> dtlL = createShipAct_DtlL();
			for (ShipAct_HdrR hdrR : up0()) {
				if (hdrR.uplnd_flg()
					|| MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
					continue;
				}
				dtlL.addAll(hdrR.getJoined(_dtlAllJk));
			}

			MCList<ShipAct_DtlR> dtlL2 = dtlL.groupBy(ShipAct_DtlR.$ship_act_d_no);
			MSW_SHIP_ACT_D_KEY_R S0 = MSW_SHIP_ACT_D_KEY_R.create();
			MCInsert q = sql("MSBEL5540_MSW_SHIP_ACT_D_KEY_I01").insert(S0).columns(S0.ship_act_d_no)
					.values(bind("ship_act_d_no"));
			q.executeBatchUpdate(dtlL2);
	
			MCList<MST_SHIP_ACT_D_R> dbc = MCList.create(MST_SHIP_ACT_D_R.class);
			MST_SHIP_ACT_D_R t = MST_SHIP_ACT_D_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			MSW_SHIP_ACT_D_KEY_R w = MSW_SHIP_ACT_D_KEY_R.create("W");
			MST_SHIP_ALLOC_STS_R t2 = MST_SHIP_ALLOC_STS_R.create("T2");
			MST_SHIP_SCHD_R t3 = MST_SHIP_SCHD_R.create("T3");
			dbc_bldr.setSelect(t.ship_act_d_no, t3.pr_sts_typ);
			dbc_bldr.addInnerJoin(w, bracket(w.ship_act_d_no.eq(t.ship_act_d_no)));
			dbc_bldr.addInnerJoin(t2,
					bracket(t2.ship_alloc_sts_no.eq(t.ship_alloc_sts_no)));
			dbc_bldr.addInnerJoin(t3, bracket(t3.ship_schd_no.eq(t2.ship_schd_no)
					.or(t3.ship_inst_d_no.eq(t2.ship_inst_d_no))));
			dbc_bldr.setOrderByAsc(t.ship_act_d_no, t3.pr_sts_typ);
			dbSelect("MSBEL5540_MST_SHIP_ACT_D_S04", dbc, dbc_bldr);
	
			MCIndexKey idx = dbc.createIndex(MST_SHIP_ACT_D_R.$ship_act_d_no);
			for (ShipAct_DtlR r : dtlL) {
				// 複数ある場合は最遅を採用する
				MST_SHIP_ACT_D_R actR = dbc.getFirst(idx, r.ship_act_d_no());
				r.pr_sts_typ(actR.getString("pr_sts_typ"));
			}
		}

		/**
		 * 受払実績ワークを削除する
		 */
		protected void delIoActWk() {
			// 出荷実績SVは、同一トランザクション内で複数回呼ばれることがあるので
			// ワークを事前に削除する必要がある
			if (!isNull(up0().getFirst(ShipAct_HdrR.$io_act_flg, true))) {
				MSW_IO_ACT_R S0 = MSW_IO_ACT_R.create();
				execDbWkDelete("MSBEL5540_MSW_IO_ACT_D01", S0);
			}
		}

		/**
		 * 出荷実績を登録する
		 */
		protected void updShipAct() {
			MCList<MST_SHIP_ACT_R>
				insL = MCList.create(MST_SHIP_ACT_R.class),
				upd1L = MCList.create(MST_SHIP_ACT_R.class),
				upd2L = MCList.create(MST_SHIP_ACT_R.class),
				delL = MCList.create(MST_SHIP_ACT_R.class);

			for (ShipAct_HdrR hdrR : up0()) {
				// 削除
				if (MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
					hdrR.sa().can_flg(true);
					delL.add(hdrR.sa());
				}
				else {
		
					// 登録
					if (MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ())) {
						hdrR.sa().ship_act_rev(1);
						insL.add(hdrR.sa());
					}
					// 更新
					else {
						hdrR.sa().ship_act_rev(hdrR.sa().ship_act_rev().add(1));
		
						// 更新対象外の出荷実績明細が存在する場合は、更新する項目を制限する
						MCList<ShipAct_DtlR> dtlL = hdrR.getJoined(_dtlJk);
						if (!isNull(dtlL.getFirst(ShipAct_DtlR.$non_upd_flg, true))) {
							upd2L.add(hdrR.sa());
						}
						else {
							upd1L.add(hdrR.sa());
						}
					}
				}
			}
			if (!insL.isEmpty()) {
				dbInsert("MSBEL5540_MST_SHIP_ACT_I01", insL, MCQueryApiBuilder.create(MST_SHIP_ACT_R.create("T")));
			}
			if (!upd1L.isEmpty()) {
				MST_SHIP_ACT_R upd1L_t = MST_SHIP_ACT_R.create("T");
				MCQueryApiBuilder upd1L_bldr = MCQueryApiBuilder.create(upd1L_t);
				upd1L_bldr.removeSet(
					upd1L_t.dlv_prnt_flg, upd1L_t.dlv_prnt_tm, upd1L_t.ship_adv_prnt_flg, upd1L_t.ship_adv_prnt_tm
				);
				dbUpdateKey("MSBEL5540_MST_SHIP_ACT_U01", upd1L, upd1L_bldr);
			}
			if (!upd2L.isEmpty()) {
				MST_SHIP_ACT_R upd2L_t = MST_SHIP_ACT_R.create("T");
				MCQueryApiBuilder upd2L_bldr = MCQueryApiBuilder.create(upd2L_t);
				upd2L_bldr.setSet(upd2L_t.intr_rmrks, upd2L_t.sub_char1, upd2L_t.sub_char2, upd2L_t.sub_char3);
				dbUpdateKey("MSBEL5540_MST_SHIP_ACT_U02", upd2L, upd2L_bldr);
			}
			if (!delL.isEmpty()) {
				MST_SHIP_ACT_R delL_t = MST_SHIP_ACT_R.create("T");
				MCQueryApiBuilder delL_bldr = MCQueryApiBuilder.create(delL_t);
				delL_bldr.setSet(delL_t.can_flg);
				dbUpdateKey("MSBEL5540_MST_SHIP_ACT_U03", delL, delL_bldr);		// 論理削除
			}
		}
	
		/**
		 * 出荷実績明細を登録する
		 */
		protected void updShipActD() {
			MCList<MST_SHIP_ACT_D_R>
				insL = MCList.create(MST_SHIP_ACT_D_R.class),
				upd1L = MCList.create(MST_SHIP_ACT_D_R.class),
				upd2L = MCList.create(MST_SHIP_ACT_D_R.class),
				delL = MCList.create(MST_SHIP_ACT_D_R.class);

			for (ShipAct_DtlR r : up1()) {
				ShipAct_HdrR hdrR = r.getJoinedRow(_hdrJk);

				// 登録
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					r.ship_act_no(hdrR.ship_act_no());

					MST_SHIP_ACT_D_R insR = insL.add();
					MCRow.copyvalue(insR, r.sad());
					if (hdrR.dlv_slip_flg()) {
						// 登録後に出荷帳票発行SVを実行するので一時的にNULL文字を設定する
						// 出荷帳票発行SV後にUPDATEする
						insR.dlv_slip_d_no(MAC_STR.NULL_VAL.value());
						insR.dlv_slip_no(MAC_STR.NULL_VAL.value());
						insR.dlv_slip_seq(0);
					}
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					r.sad().can_flg(MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));
					delL.add(r.sad());
				}
				else {
					if (r.non_upd_flg()) {
						upd2L.add(r.sad());
					}
					else {
						upd1L.add(r.sad());
					}
				}
			}
			if (!insL.isEmpty()) {
				dbInsert("MSBEL5540_MST_SHIP_ACT_D_I01", insL, MCQueryApiBuilder.create(MST_SHIP_ACT_D_R.create("T")));
			}
			if (!delL.isEmpty()) {
				MST_SHIP_ACT_D_R delL_t = MST_SHIP_ACT_D_R.create("T");
				MCQueryApiBuilder delL_bldr = MCQueryApiBuilder.create(delL_t);
				delL_bldr.setSet(delL_t.can_flg);
				dbUpdateKey("MSBEL5540_MST_SHIP_ACT_D_U01", delL, delL_bldr);
			}
			if (!upd1L.isEmpty()) {
				MCQueryApiBuilder upd1L_bldr = MCQueryApiBuilder.create(MST_SHIP_ACT_D_R.create("T"));
				upd1L_bldr.removeSet(MST_SHIP_ACT_D_R.$wms_flg);
				upd1L_bldr.removeSet(MST_SHIP_ACT_D_R.$ext_sys_cd);
				upd1L_bldr.removeSet(MST_SHIP_ACT_D_R.$ext_ship_act_no);
				dbUpdateKey("MSBEL5540_MST_SHIP_ACT_D_U02", upd1L, upd1L_bldr);
			}
			if (!upd2L.isEmpty()) {
				// 更新対象外の出荷実績明細は、更新する項目を制限する
				MST_SHIP_ACT_D_R upd2L_t = MST_SHIP_ACT_D_R.create("T");
				MCQueryApiBuilder upd2L_bldr = MCQueryApiBuilder.create(upd2L_t);
				upd2L_bldr.setSet(
						upd2L_t.disp_seq, upd2L_t.intr_d_rmrks, upd2L_t.sub_char1,
						upd2L_t.sub_char2, upd2L_t.sub_char3
				);
				dbUpdateKey("MSBEL5540_MST_SHIP_ACT_D_U03", upd2L, upd2L_bldr);
			}
		}
		/**
		 * 「改訂履歴データ更新リスト」テーブルにデータを登録サービス呼び出し
		 */
		protected void callRevDataIns01(MCList<ShipAct_HdrR> hdrL) {
			MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
			for (ShipAct_HdrR hdrR : hdrL) {
				RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
				opeR.rev_data_src_no(hdrR.ship_act_no());
				opeR.rev_no(hdrR.sa().ship_act_rev());
				opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_SHIP_ACT.value());
				ope.up0().add(opeR);
			}
			ope.exec();
		}
		
		/**
		 * インボイス登録サービスを実行する。<br>
		 * インボイス出荷実績マップを登録する。
		 */
		protected void callIvRegSrvUpd03(MCList<ShipAct_DtlR> dtlL, MCJoinKey<MCList<ShipAct_HdrR>> hdrJk) {
			
			MSBEL_IvRegService.Iv_Upd03 ope = MSBEL_IvRegService.crtIv_Upd03();
			
			for (ShipAct_DtlR dtlR : dtlL) {
				
				ShipAct_HdrR hdrR = dtlR.getJoinedRow(hdrJk);
				if (hdrR.uplnd_flg()) {
					continue;
				}
				
				boolean ivTrdFlg = false;
				MST_SHIP_ALLOC_STS_R sasR = getShipAllocStsL(dtlR).get(0);
				if (isSlsOrShip(dtlR)) {
					ivTrdFlg = sasR.getBoolean("cst_iv_flg");
				}
				else {
					ivTrdFlg = sasR.getBoolean("iv_trd_flg");
				}
				
				if (ivTrdFlg) {
					Iv_Upd03_Ctrl2R upR = Iv_Upd03_Ctrl2R.create();
					
					upR.ship_act_d_no(dtlR.ship_act_d_no());
					
					if (!isNull(dtlR.iv_d_no())) {
						upR.data_crud_typ(dtlR.data_crud_typ());
						upR.iv_no(nvl(dtlR.iv_no(), hdrR.iv_no()));
						upR.iv_d_no(dtlR.iv_d_no());
						upR.ship_schd_no(dtlR.ship_schd_no());
						upR.ship_alloc_sts_no(dtlR.ship_alloc_sts_no());
						upR.base_unit_qty(dtlR.base_unit_qty());
						upR.ship_act_fix_flg(true);
					}
					if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ()) || MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
						upR.can_ac_dt(hdrR.can_ac_dt());
					}
					
					ope.up1().add(upR);
				}
			}
				
			if (!ope.up1().isEmpty()) {
				_callIvRegSrvForIvIoActFlg = true;
				ope.up0().ship_act_reg_flg(true);
				ope.exec();
			}
		}
		
		/**
		 * インボイス登録サービスを実行する。<br>
		 * インボイスの受払実績を作成する。
		 */
		protected void callIvRegSrvUpd04() {
			if (_callIvRegSrvForIvIoActFlg) {
				MSBEL_IvRegService.Iv_Upd04 ope = MSBEL_IvRegService.crtIv_Upd04();
				ope.exec();
			}
		}
	}

	/**
	 * ShipAct_Upd02オペレーション.<p>
	 *
	 * 出荷実績の返品情報、納品数量を更新する。<br>
	 */
	public class ShipAct_Upd02 extends MSBEL_ShipActService_MC_A.ShipAct_Upd02 {
		
		/**
		 * 更新対象の出荷実績明細を格納
		 */
		protected MCList<MST_SHIP_ACT_D_R> _shipL = null;
		protected MST_SHIP_ACT_D_R _shipL_t = MST_SHIP_ACT_D_R.create("T");
		protected MCQueryApiBuilder _shipL_bldr = MCQueryApiBuilder.create(_shipL_t);
		
		/**
		 * 更新元の入荷数量を格納
		 */
		protected MCList<MST_ARR_SCHD_R> _arrL = null;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			preProc();
			insWk();
			lock();
			getArrQty();
			setDlvQty();
			setRetQty();
			updActD();
			callRevDataIns01();
		}

		/**
		 * 前処理
		 */
		protected void preProc() {
			_shipL = MCList.create(MST_SHIP_ACT_D_R.class);
			_arrL = MCList.create(MST_ARR_SCHD_R.class);
		}

		/**
		 * 更新対象をワークに追加する
		 */
		protected void insWk() {
			MSW_SHIP_ACT_D_KEY_R S0 = MSW_SHIP_ACT_D_KEY_R.create();
			MST_SHIP_ACT_D_R S1 = MST_SHIP_ACT_D_R.create();
			execDbWkDelete("MSBEL5540_MSW_SHIP_ACT_D_KEY_D01", S0);
			MCInsert q2 = sql("MSBEL5540_MSW_SHIP_ACT_D_KEY_I02").insert(S0)
					.query(subQuery().selectDistinct(S1.ship_act_d_no).from(S1)
							.where(S1.dlv_slip_d_no.eq(bind("dlv_slip_d_no"))
									.and(S1.can_flg.eq(value(false)))));
			q2.executeBatchUpdate(up0());
		}

		/**
		 * 更新対象をロックする
		 */
		protected void lock() {
			MSW_SHIP_ACT_D_KEY_R w = MSW_SHIP_ACT_D_KEY_R.create("W");
			MST_IV_SHIP_ACT_D_R S1W = MST_IV_SHIP_ACT_D_R.create("W");
			MST_SHIP_ACT_R t2 = MST_SHIP_ACT_R.create("T2");
			_shipL_bldr.setSelect(
					_shipL_t.ship_act_d_no,
					_shipL_t.ship_act_no,
					_shipL_t.dlv_qty,
					_shipL_t.ship_ret_qty,
					_shipL_t.ship_ret_flg,
					_shipL_t.dlv_slip_d_no,
					_shipL_t.lot_no,
					_shipL_t.sublot_no,
					_shipL_t.stk_arrv_bp_cd,
					_shipL_t.quality_typ,
					_shipL_t.stk_insp_typ,
					_shipL_t.stk_id_typ,
					_shipL_t.stk_bp_cd,
					_shipL_t.base_unit_qty,
					t2.ship_act_rev
			);
			_shipL_bldr.addSelect(nvl(bracket(subQuery()
					.select(sum(S1W.base_unit_qty))
					.from(S1W)
					.where(S1W.ship_act_d_no.eq(_shipL_t.ship_act_d_no))), value(0))
					.as("iv_act_qty"));
			_shipL_bldr.addInnerJoin(w, bracket(w.ship_act_d_no.eq(_shipL_t.ship_act_d_no)));
			_shipL_bldr.addInnerJoin(t2, bracket(t2.ship_act_no.eq(_shipL_t.ship_act_no)));
			_shipL_bldr.setOrderByAsc(_shipL_t.ship_act_d_no);
			_shipL_bldr.setLockTable(_shipL_t.ship_act_d_no);
			dbSelectForUpdate("MSBEL5540_MST_SHIP_ACT_D_S05", _shipL, _shipL_bldr);
		}

		/**
		 * 出荷実績明細を更新する
		 */
		protected void updActD() {
			_shipL_bldr.setSet(
					_shipL_t.dlv_qty,
					_shipL_t.ship_ret_qty,
					_shipL_t.ship_ret_flg
			);
			dbUpdateKey("MSBEL5540_MST_SHIP_ACT_D_U04", _shipL, _shipL_bldr);
		}

		/**
		 * 入荷数量（返品数量および納品数量）を取得する
		 */
		protected void getArrQty() {
			getArrQtyForDlv();
			getArrQtyForRet();
		}
		protected void getArrQtyForDlv() {
			MCList<ShipAct_DtlR> upL = up0().subList(r -> !r.ship_ret_flg());
			if (upL.isEmpty()) {
				return;
			}
			MCList<MST_ARR_SCHD_R> arrL = _arrL.createInstance();
			MST_ARR_SCHD_R t = MST_ARR_SCHD_R.create("T");
			MCQueryApiBuilder arrL_bldr = MCQueryApiBuilder.create(t);
			MST_ARR_PR_R t2 = MST_ARR_PR_R.create("T2");
			arrL_bldr.setWhere(t2.dlv_slip_d_no.eq(bind("dlv_slip_d_no")));
			arrL_bldr.setGroupBy(t2.dlv_slip_d_no);
			arrL_bldr.addGroupFunc(sum(t.arr_qty), "arr_qty");
			arrL_bldr.addInnerJoin(t2, bracket( t2.arr_pr_no.eq(t.arr_pr_no)));
			dbSelect("MSBEL5540_MST_ARR_SCHD_S01", arrL, arrL_bldr, upL);

			_arrL.addAll(arrL);
		}
		protected void getArrQtyForRet() {
			MCList<ShipAct_DtlR> upL = up0().subList(r -> r.ship_ret_flg());
			if (upL.isEmpty()) {
				return;
			}
			MCList<MST_ARR_SCHD_R> arrL = _arrL.createInstance();
			MST_ARR_SCHD_R t = MST_ARR_SCHD_R.create("T");
			MCQueryApiBuilder arrL_bldr = MCQueryApiBuilder.create(t);
			MST_ARR_PR_R t2 = MST_ARR_PR_R.create("T2");
			MST_ARR_ACT_R t3 = MST_ARR_ACT_R.create("T3");
			arrL_bldr.setWhere(t2.ret_dlv_slip_d_no.eq(bind("dlv_slip_d_no")));
			arrL_bldr.setGroupBy(
					t2.ret_dlv_slip_d_no,
					t3.lot_no, t3.sublot_no,
					t3.stk_arrv_bp_cd,
					t3.quality_typ,
					t3.stk_insp_typ,
					t3.stk_id_typ,
					t3.stk_bp_cd
			);
			arrL_bldr.addGroupFunc(sum(t3.base_unit_qty), "arr_qty");
			arrL_bldr.addInnerJoin(t2, bracket(t2.arr_pr_no.eq(t.arr_pr_no)));
			arrL_bldr.addInnerJoin(t3, bracket(t3.arr_schd_no.eq(t.arr_schd_no)
					.and(t3.can_flg.eq(value(false)))));
			dbSelect("MSBEL5540_MST_ARR_SCHD_S02", arrL, arrL_bldr, upL);

			_arrL.addAll(arrL);
		}

		/**
		 * 入荷数量（返品数量または納品数量）を設定する
		 */
		protected void setQty(
			MST_ARR_SCHD_R arrR, MCList<MST_SHIP_ACT_D_R> shipL, String tgtCol) {

			// 初期化
			shipL.setNumber(tgtCol, 0);

			// 出荷実績明細NOの古い順に実績を割り当てる
			shipL.sort(MST_SHIP_ACT_D_R.$ship_act_d_no);
			MCNumber actQty = arrR.arr_qty();
			for (MST_SHIP_ACT_D_R r : shipL) {
				if (actQty.gt(r.base_unit_qty())) {
					r.setNumber(tgtCol ,r.base_unit_qty());
					actQty = actQty.subtract(r.base_unit_qty()); 
				}
				else if (actQty.isPositive()) {
					r.setNumber(tgtCol, actQty);
					actQty = MCNumber.ZERO;
				}
			}
			// 過入荷分は出荷実績明細NOのもっとも新しい明細に加算する
			if (actQty.isPositive()) {
				MST_SHIP_ACT_D_R r = shipL.get(shipL.size() - 1);
				r.setNumber(tgtCol, r.getNumber(tgtCol).add(actQty));
			}
		}

		/**
		 * 納品数量を設定する
		 */
		protected void setDlvQty() {
			MCList<ShipAct_DtlR> upL = up0().subList(r -> !r.ship_ret_flg());
			if (upL.isEmpty()) {
				return;
			}
			MCIndexKey
				arrIdx = _arrL.createIndex(MST_ARR_PR_R.$dlv_slip_d_no),
				shipIdx = _shipL.createIndex(MST_SHIP_ACT_D_R.$dlv_slip_d_no);
			for (ShipAct_DtlR upR : upL) {
				MST_ARR_SCHD_R arrR = _arrL.getFirst(arrIdx, upR.dlv_slip_d_no());
				MCList<MST_SHIP_ACT_D_R> shipL = _shipL.subList(shipIdx, upR.dlv_slip_d_no());

				// 入荷数量を割り当てる
				setQty(arrR, shipL, MST_SHIP_ACT_D_R.$dlv_qty);
			}
		}

		/**
		 * 入荷数量（返品数量または納品数量）を設定する
		 */
		protected void setRetQty() {
			MCList<ShipAct_DtlR> upL = up0().subList(r -> r.ship_ret_flg());
			if (upL.isEmpty()) {
				return;
			}
			MCIndexKey
				arrIdx = _arrL.createIndex(MST_ARR_PR_R.$ret_dlv_slip_d_no),
				dlvIdx = _shipL.createIndex(MST_SHIP_ACT_D_R.$dlv_slip_d_no),
				shipIdx = _shipL.createIndex(
					MST_SHIP_ACT_D_R.$dlv_slip_d_no,
					MST_SHIP_ACT_D_R.$lot_no,
					MST_SHIP_ACT_D_R.$sublot_no,
					MST_SHIP_ACT_D_R.$stk_arrv_bp_cd,
					MST_SHIP_ACT_D_R.$quality_typ,
					MST_SHIP_ACT_D_R.$stk_insp_typ,
					MST_SHIP_ACT_D_R.$stk_id_typ,
					MST_SHIP_ACT_D_R.$stk_bp_cd);
			for (ShipAct_DtlR upR : up0()) {

				// 初期化
				_shipL.subList(dlvIdx, upR.dlv_slip_d_no()).setNumber(MST_SHIP_ACT_D_R.$ship_ret_qty, 0);
				_shipL.subList(dlvIdx, upR.dlv_slip_d_no()).setBoolean(MST_SHIP_ACT_D_R.$ship_ret_flg, false);
				
				for (MST_ARR_SCHD_R arrR : _arrL.subList(arrIdx, upR.dlv_slip_d_no())) {
					// 出荷返品では場所、格付が変更できるので出荷実績とのマッチングのキーに含めない
					MCList<MST_SHIP_ACT_D_R> shipL =
							_shipL.subList(shipIdx,
								upR.dlv_slip_d_no(), arrR.lot_no(), arrR.sublot_no(), arrR.stk_arrv_bp_cd(),
								arrR.quality_typ(), arrR.stk_insp_typ(), arrR.stk_id_typ(), arrR.stk_bp_cd());
	
					for (MST_SHIP_ACT_D_R r : shipL) {
						// 輸出した分の数量は返品数の割り当て対象から除外
						r.base_unit_qty(r.base_unit_qty().subtract(r.getNumber("iv_act_qty")));
					}
	
					// 入荷数量を割り当てる
					setQty(arrR, shipL, MST_SHIP_ACT_D_R.$ship_ret_qty);
	
					// 出荷返品数量＞０の場合、フラグをオンに設定する
					shipL.setBoolean(
						MST_SHIP_ACT_D_R.$ship_ret_flg,
						shipL.sum(MST_SHIP_ACT_D_R.$ship_ret_qty).isPositive());
				}
			}
		}
		/**
		 * 「改訂履歴データ更新リスト」テーブルにデータを登録サービス呼び出し
		 */
		protected void callRevDataIns01() {
			MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
			for (MST_SHIP_ACT_D_R dtlR : _shipL.groupBy(MST_SHIP_ACT_D_R.$ship_act_no, MST_SHIP_ACT_R.$ship_act_rev)) {
				RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
				opeR.rev_data_src_no(dtlR.ship_act_no());
				opeR.rev_no(dtlR.getNumberNE(MST_SHIP_ACT_R.$ship_act_rev));
				opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_SHIP_ACT.value());
				ope.up0().add(opeR);
			}
			ope.exec();
		}
	}

	/**
	 * ShipAct_Upd03オペレーション.<p>
	 *
	 * 現品票発行済フラグをオン(発行済)に更新する。<br>
	 */
	public class ShipAct_Upd03 extends MSBEL_ShipActService_MC_A.ShipAct_Upd03 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			updActD();
			callRevDataIns01();
		}
		/**
		 * 出荷実績明細を更新する
		 */
		protected void updActD() {
			MST_SHIP_ACT_D_R dbc = MST_SHIP_ACT_D_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
			builder.setSetVL(dbc.stk_lst_prnt_flg, value(true));
			dbUpdateKey("MSBEL5540_MST_SHIP_ACT_D_U05", up0(), builder);
		}
		/**
		 * 「改訂履歴データ更新リスト」テーブルにデータを登録サービス呼び出し
		 */
		protected void callRevDataIns01() {
			MCList<MST_SHIP_ACT_R> bindL = createBindRevDataIns01(up0());
			
			MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
			for (MST_SHIP_ACT_R bindR : bindL.groupBy(MST_SHIP_ACT_R.$ship_act_no, MST_SHIP_ACT_R.$ship_act_rev)) {
				RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
				opeR.rev_data_src_no(bindR.ship_act_no());
				opeR.rev_no(bindR.ship_act_rev());
				opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_SHIP_ACT.value());
				ope.up0().add(opeR);
			}
			ope.exec();
		}
		/**
		 * 「改訂履歴データ更新リスト」の上り電文用にデータを取得する
		 * @param up0L 上り電文
		 * @return 更新対象の出荷実績
		 */
		protected MCList<MST_SHIP_ACT_R> createBindRevDataIns01(MCList<ShipAct_DtlR> up0L){
			MCQueryApiBuilder wrkShipActDL_bldr1 = MCQueryApiBuilder.create(MST_SHIP_ACT_D_R.create("W"));
			dbWkDelete("MSBEL5540_MSW_SHIP_ACT_D_D01", wrkShipActDL_bldr1.getBaseDbc());
			dbWkInsert("MSBEL5540_MSW_SHIP_ACT_D_I01", up0L, wrkShipActDL_bldr1.getBaseDbc());
			
			MCList<MST_SHIP_ACT_R> bindL = MCList.create(MST_SHIP_ACT_R.class);
			MST_SHIP_ACT_R dbc = MST_SHIP_ACT_R.create("T");
			MST_SHIP_ACT_D_R t2 = MST_SHIP_ACT_D_R.create("T2");
			MSW_SHIP_ACT_D_KEY_R w1 = MSW_SHIP_ACT_D_KEY_R.create("W1");
			MCQueryApiBuilder shipAct_bldr = MCQueryApiBuilder.create(dbc);
			shipAct_bldr.setSelect(
					dbc.ship_act_no,
					dbc.ship_act_rev
			);
			shipAct_bldr.addInnerJoin(t2, t2.ship_act_no.eq(dbc.ship_act_no));
			shipAct_bldr.addInnerJoin(w1, w1.ship_act_d_no.eq(t2.ship_act_d_no));
			dbSelect("MSBEL5540_MST_SHIP_ACT_D_S09", bindL, shipAct_bldr);
			
			dbWkDelete("MSBEL5540_MSW_SHIP_ACT_D_D02", wrkShipActDL_bldr1.getBaseDbc());
			
			return bindL;
		}
	}

	/**
	 * 上り電文に対して補完処理を行う
	 */
	protected void cmplShipAct(ShipAct_HdrR hdrR, MCList<ShipAct_DtlR> dtlL) {
		if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())) {
			ShipAct_HdrR actR = getShipActR(hdrR.ship_act_no());
			hdrR.ship_act_rev(actR.ship_act_rev());
		}
		if (!hdrR.ship_to_sundry_flg()) {
			hdrR.ship_to_id_nm(null);
		}
		if (hdrR.dlv_slip_prnt_flg()) {
			hdrR.sa().dlv_prnt_flg(true);
			hdrR.sa().dlv_prnt_tm(MCDate.sysnow());
		} else {
			hdrR.sa().dlv_prnt_flg(false);
		}
		if (hdrR.ship_adv_prnt_flg()) {
			hdrR.sa().ship_adv_prnt_flg(true);
			hdrR.sa().ship_adv_prnt_tm(MCDate.sysnow());
		} else {
			hdrR.sa().ship_adv_prnt_flg(false);
		}
		for (ShipAct_DtlR dtlR : dtlL) {
			if (!hdrR.uplnd_flg()) {
				MCList<MST_SHIP_ALLOC_STS_R> allocL = getShipAllocStsL(dtlR);
				if (allocL.size() > 1) {	// 複数件=指図まとめ
					dtlR.ship_inst_d_no(allocL.get(0).ship_inst_d_no());
					if (MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ())
						&& isNull(dtlR.dlv_slip_no())) {
						dtlR.dlv_slip_no(allocL.get(0).dlv_slip_no());
						dtlR.dlv_slip_seq(allocL.get(0).dlv_slip_seq());
						dtlR.dlv_slip_d_no(allocL.get(0).dlv_slip_d_no());
					}
				}
				else {
					MST_SHIP_ALLOC_STS_R allocR = allocL.get(0);
					dtlR.ship_inst_d_no(allocR.ship_inst_d_no());
					dtlR.ship_pr_no(allocR.getString("ship_pr_no"));
					dtlR.ship_schd_no(allocR.ship_schd_no());
					dtlR.slo_d_no(allocR.getString("slo_d_no"));
					if (!isNull(hdrR.iv_no())) {
						// インボイス単位出荷の場合のみ、補完する
						dtlR.iv_d_no(allocR.getString("iv_d_no"));
					}
					if (MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ())
						&& isNull(dtlR.dlv_slip_no())) {	// 上り電文に設定されてきた場合は、そっちを優先する
						dtlR.dlv_slip_no(allocR.dlv_slip_no());
						dtlR.dlv_slip_seq(allocR.dlv_slip_seq());
						dtlR.dlv_slip_d_no(allocR.dlv_slip_d_no());
					}
				}
			}
			if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())
				&& MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
				// 削除行に対して、出荷実績明細NOから出荷実績明細を補完
				dtlR.sad(getShipActDR(dtlR.ship_act_d_no()).sad().clone());
			}
			else if (!isNull(dtlR.ship_act_d_no())) {
				// 納品書関連は、複数件あっても同じ値が設定されているので先頭行の値を取得する
				ShipAct_DtlR actR = getShipActDR(dtlR.ship_act_d_no());
				dtlR.dlv_slip_d_no(actR.dlv_slip_d_no());
				dtlR.dlv_slip_no(actR.dlv_slip_no());
				dtlR.dlv_slip_seq(actR.dlv_slip_seq());
				dtlR.ship_act_no(actR.ship_act_no());
			}
			dtlR.lot_no(nvl(dtlR.lot_no(), MAC_STR.NULL_VAL.value()));
			dtlR.sublot_no(nvl(dtlR.sublot_no(), MAC_STR.NULL_VAL.value()));
			dtlR.sno1(nvl(dtlR.sno1(), MAC_STR.NULL_VAL.value()));
			dtlR.sno2(nvl(dtlR.sno2(), MAC_STR.NULL_VAL.value()));
			dtlR.sno3(nvl(dtlR.sno3(), MAC_STR.NULL_VAL.value()));
			dtlR.sno4(nvl(dtlR.sno4(), MAC_STR.NULL_VAL.value()));
			dtlR.stk_bp_cd(nvl(dtlR.stk_bp_cd(), MAC_STR.NULL_VAL.value()));
			dtlR.stk_arrv_bp_cd(nvl(dtlR.stk_arrv_bp_cd(), MAC_STR.NULL_VAL.value()));
		}
		if (hdrR.sls_dtl_mod_flg()) {
			// 売上明細訂正画面で訂正した場合、元出荷実績情報を保持する
			if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())) {
				ShipAct_HdrR actHR = getShipActR(hdrR.ship_act_no());
				for (ShipAct_DtlR dtlR : dtlL) {
					if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
						ShipAct_DtlR actDR = getShipActDR(dtlR.ship_act_d_no());
						if (isSync(actHR, dtlR) ) {
							ShipAct_HdrR srcHdrR = hdrR.clone();
							hdrR.sa(actHR.sa().clone());
							hdrR.ac_dt(srcHdrR.ac_dt());
							
							ShipAct_DtlR srcR = dtlR.clone();
							dtlR.sad(actDR.sad().clone());
							dtlR.disp_seq(srcR.disp_seq());
						}
					}
				}
			}
			else if (MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ()) && !isNull(hdrR.ref_ship_act_no())) {
				ShipAct_HdrR actHR = getShipActR(hdrR.ref_ship_act_no());
				for (ShipAct_DtlR dtlR : dtlL) {
					if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ()) && !isNull(dtlR.ref_ship_act_d_no())) {
						ShipAct_DtlR actDR = getShipActDR(dtlR.ref_ship_act_d_no());
						if (isSync(actHR, actDR)) {
							ShipAct_HdrR srcHdrR = hdrR.clone();
							hdrR.sa(actHR.sa().clone());
							hdrR.ship_act_no(null);
							hdrR.ship_act_rev(null);
							hdrR.ac_dt(srcHdrR.ac_dt());
							
							ShipAct_DtlR srcR = dtlR.clone();
							dtlR.sad(actDR.sad().clone());
							dtlR.ship_act_no(null);
							dtlR.disp_seq(srcR.disp_seq());
							dtlR.ship_act_d_no(null);
							dtlR.dlv_slip_no(srcR.dlv_slip_no());
							dtlR.dlv_slip_seq(srcR.dlv_slip_seq());
							dtlR.dlv_slip_d_no(srcR.dlv_slip_d_no());
						}
					}
				}
			}
		}
	}

	/**
	 * 出荷実績明細のデータを補完する
	 */
	protected void cmplShipActD(MCList<ShipAct_DtlR> dtlL) {
		dtlL.forEach(r -> {
			// 品名
			if (!r.sundry_itm_flg()
				|| isXfrOrProv(r)) {
				r.itm_nm(null);
				r.iv_itm_nm(null);
			}

			// 在庫検査区分
			r.sad().stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());

			// 荷姿数量
			MAVM_ITM_UNIT_R unitR = getItmUnitR(r);
			if (unitR.pack_flg()) {
				r.pack_unit_cd(r.trd_unit_cd());
				r.pack_unit_qty(r.trd_unit_qty());
			}
			else {
				r.pack_unit_cd(r.base_unit_cd());
				r.pack_unit_qty(r.base_unit_qty());
			}

			// 納品先識別名
			if (!r.dlv_sundry_flg()) {
				r.dlv_id_nm(null);
			}

			// 売上、出荷の場合、出荷＝納品とみなして設定する
			r.sad().dlv_qty(isSlsOrShip(r) ? r.base_unit_qty() : MCNumber.ZERO);
			r.ship_ret_qty(0);
			if (!MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())) {
				r.gd_cd(null);
			}
		});
	}

	/**
	 * ロット情報サービス.ロット存在チェック
	 */
	protected void callLotChk03(MCList<ShipAct_DtlR> dtlL) {
		MCList<ShipAct_DtlR> l = MCList.create(ShipAct_DtlR.class);
		for (ShipAct_DtlR r : dtlL) {
			if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				continue;
			}
			l.add(r);
		}
		if (l.isEmpty()) return ;
		MSBFL_LotService.Lot_Chk03 o = MSBFL_LotService.crtLot_Chk03();
		setAll(o.up0(), l, createMap_Lot_Chk03_CndR_ShipAct_DtlR());
		o.exec();
		copyErrFlg(l, o.down0());
		chkLotQualityTyp(dtlL, o.down0());
	}
	protected Map_Lot_Chk03_CndR_ShipAct_DtlR<Lot_Chk03_CndR,ShipAct_DtlR> createMap_Lot_Chk03_CndR_ShipAct_DtlR() {
		return new Map_Lot_Chk03_CndR_ShipAct_DtlR<Lot_Chk03_CndR, ShipAct_DtlR>();
	}
	public class Map_Lot_Chk03_CndR_ShipAct_DtlR<D extends Lot_Chk03_CndR, S extends ShipAct_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Lot_Chk03_CndR.$peg_no, ShipAct_DtlR.$peg_no);
			addColumnPathMap(Lot_Chk03_CndR.$itm_cd, ShipAct_DtlR.$itm_cd);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub1, ShipAct_DtlR.$itm_sub1);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub2, ShipAct_DtlR.$itm_sub2);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub3, ShipAct_DtlR.$itm_sub3);
			addColumnPathMap(Lot_Chk03_CndR.$lot_no, ShipAct_DtlR.$lot_no);
			addColumnPathMap(Lot_Chk03_CndR.$sublot_no, ShipAct_DtlR.$sublot_no);
		}
	}
	protected void chkLotQualityTyp(MCList<ShipAct_DtlR> dtlL, MCList<Lot_Chk03_CndR> lotL) {
		MCIndexKey lotIdx = lotL.createIndex(Lot_Chk03_CndR.$peg_no);
		for (ShipAct_DtlR r : dtlL) {
			if (!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
				continue;
			}
			if (!MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ())
					&& !MAC_TRD_PTN_TYP.isSHIP(r.trd_ptn_typ())
					&& !MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())) {
				continue;
			}
			Lot_Chk03_CndR lotR = lotL.getFirst(lotIdx, r.peg_no());
			if (!isNull(lotR) && (MAC_QUALITY_TYP.isDFCT_INSP(lotR.quality_typ())
							|| MAC_QUALITY_TYP.isDFCT_OPER(lotR.quality_typ()))) {
				MCMessagePool.add(new MCMessage(r, r.lot_no(), MSBEL1074,
						r.trd_cd(), r.trd_ptn_typ(), toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
						r.lot_no(), r.sublot_no(), toDispGUIIndex(r)));
				r.err_flg(true);
			}
		}
	}

	/**
	 * 出荷ロットチェックサービスを呼び出し、出荷ロットを更新する
	 */
	protected void callShipLotSrv(
			MCList<ShipAct_DtlR> dtlL, MCJoinKey<MCList<ShipAct_HdrR>> hdrJk, boolean isChk) {
		MCList<ShipAct_DtlR> shipLotL = MCList.create(ShipAct_DtlR.class);
		for (ShipAct_DtlR r : dtlL) {
			// 「売上」「出荷」のみが対象
			if (isSlsOrShip(r)) {
				// ロット管理しない品目は対象外
				MAM_ITM_R itmR = getItmR(r);
				if (!MAC_LOT_MNG_TYP.req_lot(itmR.lot_mng_typ())) {
					continue;
				}
				shipLotL.add(r);
			}
		}
		if (shipLotL.isEmpty())	return;

		if (isChk) {
			// チェックは削除行以外
			MCList<ShipAct_DtlR>
				chkL = shipLotL.subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));
			// 有効期限/ロット逆転チェック
			MSBEL_ShipLotChkService.ShipLotChk_Chk01
				 o = MSBEL_ShipLotChkService.crtShipLotChk_Chk01();
			chkL.forEach(r -> {
				ShipAct_HdrR hdrR = r.getJoinedRow(hdrJk);
				if (!hdrR.lot_chk_off_flg()) {
					ShipLot_DtlR upR = ShipLot_DtlR.create();
					copy(upR, r, hdrR, createMap_ShipLotChk_ShipLot_DtlR_ShipAct_DtlR());
					if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
						upR.ship_schd_no(r.ship_schd_no());
					}
					else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
						upR.ship_act_d_no(r.ship_act_d_no());
					}
					o.up0().add(upR);
				}
			});
			o.exec();
			copyErrFlg(chkL, o.down0());
		}
		else {
			cmpleByShipInst(shipLotL, hdrJk);
			cmpleByShipSchd(shipLotL, hdrJk);

			// 出荷ロット更新
			MCList<ShipLot_DtlR> updL = MCList.create(ShipLot_DtlR.class);
			shipLotL.forEach(r -> {
				ShipAct_HdrR hdrR = r.getJoinedRow(hdrJk);
				copy(updL.add(), r, hdrR, createMap_ShipLotChk_ShipLot_DtlR_ShipAct_DtlR());
			});
			updL.forEach(r -> r.ship_alloc_sts_no(null));	// 予定分は出荷残がある場合のみ追加する

			for (MCList<ShipAct_DtlR> lst : shipLotL.groupList(ShipAct_DtlR.$ship_alloc_sts_no)) {
				ShipAct_HdrR hdrR = lst.get(0).getJoinedRow(hdrJk);
				if (!hdrR.uplnd_flg()) {
					ShipAct_DtlR r = lst.get(0);
					MST_SHIP_ALLOC_STS_R sasR = getShipAllocStsR(r);

					if (sasR.alloc_flg() && !isNullOrNullVal(r.lot_no())) {
						MCNumber qty = lst
							.subList(rr -> !MAC_DATA_CRUD_TYP.isDEL(rr.data_crud_typ()))
							.sum(ShipAct_DtlR.$base_unit_qty);	// 出荷数

						// 出荷残ありの場合、予定分のロットも登録する
						if (!r.abort_flg() && sasR.base_unit_qty().gt(qty)) {
							ShipAct_DtlR tmpR = r.clone();
								tmpR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
							copy(updL.add(), tmpR, hdrR, createMap_ShipLotChk_ShipLot_DtlR_ShipAct_DtlR());
						}
					}
				}
			}
			MSBEL_ShipLotChkService.ShipLotChk_Upd01 o = MSBEL_ShipLotChkService.crtShipLotChk_Upd01();
			o.up0().setAll(updL.groupBy(_ShipLotDelCols));
			o.up0().addAll(updL.groupBy(_ShipLotUpdCols));
			o.exec();
		}
	}

	/**
	 * 出荷指図から納品予定日時を補完する
	 */
	protected void cmpleByShipInst(MCList<ShipAct_DtlR> shipLotL, MCJoinKey<MCList<ShipAct_HdrR>> hdrJk) {

		MCList<ShipAct_HdrR> hdrL = MCList.create(ShipAct_HdrR.class);
		MCList<ShipAct_DtlR> tgtL = MCList.create(ShipAct_DtlR.class);
		
		// 出荷指図ありのレコードのみのリストを作成
		shipLotL.forEach(r -> {
			ShipAct_HdrR hdrR = r.getJoinedRow(hdrJk);
			if (!isNull(hdrR.ship_inst_no())) {
				tgtL.add(r);
				hdrL.add(hdrR);
			}
		});

		if (hdrL.isEmpty()) return;

		// 作成したリストの出荷指図ＮＯを元に出荷指図を検索
		MCList<MST_SHIP_INST_R> dbc = MCList.create(MST_SHIP_INST_R.class);
		MST_SHIP_INST_R t = MST_SHIP_INST_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.ship_inst_no, t.dlv_schd_tm);
		dbSelectKey("MSBEL5540_MST_SHIP_INST_S02", dbc, dbc_bldr, hdrL);

		MCIndexKey idx = dbc.createIndex(MST_SHIP_INST_R.$ship_inst_no);
		tgtL.forEach(r -> {
			ShipAct_HdrR hdrR = r.getJoinedRow(hdrJk);
			MST_SHIP_INST_R instR = dbc.getFirst(idx, hdrR.ship_inst_no());

			// 出荷指図の納品予定日時を一時カラムに設定
			r.addDateColumn("inst_dlv_tm", instR.dlv_schd_tm());
		});
	}

	/**
	 * 出荷予定から納品予定日時を補完する
	 */
	protected void cmpleByShipSchd(MCList<ShipAct_DtlR> shipLotL, MCJoinKey<MCList<ShipAct_HdrR>> hdrJk) {

		MCList<ShipAct_DtlR> tgtL = MCList.create(ShipAct_DtlR.class);

		// 出荷指図なし、かつ計画ありのレコードのリストを作成
		shipLotL.forEach(r -> {
			ShipAct_HdrR hdrR = r.getJoinedRow(hdrJk);
			if (isNull(hdrR.ship_inst_no())
					&& !hdrR.uplnd_flg()) {
				tgtL.add(r);
			}
		});

		if (tgtL.isEmpty()) return;

		tgtL.forEach(r -> {
			MST_SHIP_ALLOC_STS_R sasR = getShipAllocStsR(r);

			// 出荷予定の納品予定日時を一時カラムに設定
			r.addDateColumn("schd_dlv_tm", sasR.getDate("dlv_schd_tm"));
		});
	}

	protected final String[] _ShipLotDelCols = {
		ShipLot_DtlR.$cst_cd, ShipLot_DtlR.$dlv_cd,
		ShipLot_DtlR.$itm_cd, ShipLot_DtlR.$itm_sub1, ShipLot_DtlR.$itm_sub2, ShipLot_DtlR.$itm_sub3,
		ShipLot_DtlR.$base_dt, ShipLot_DtlR.$lot_no, ShipLot_DtlR.$sublot_no,
		ShipLot_DtlR.$org_ship_alloc_sts_no, ShipLot_DtlR.$org_ship_act_d_no
	};
	protected final String[] _ShipLotUpdCols = {
		ShipLot_DtlR.$cst_cd, ShipLot_DtlR.$dlv_cd,
		ShipLot_DtlR.$itm_cd, ShipLot_DtlR.$itm_sub1, ShipLot_DtlR.$itm_sub2, ShipLot_DtlR.$itm_sub3,
		ShipLot_DtlR.$base_dt, ShipLot_DtlR.$lot_no, ShipLot_DtlR.$sublot_no,
		ShipLot_DtlR.$ship_alloc_sts_no, ShipLot_DtlR.$ship_act_d_no
	};
	protected Map_ShipLotChk_ShipLot_DtlR_ShipAct_DtlR<ShipLot_DtlR, ShipAct_DtlR, ShipAct_HdrR> createMap_ShipLotChk_ShipLot_DtlR_ShipAct_DtlR() {
		return new Map_ShipLotChk_ShipLot_DtlR_ShipAct_DtlR<ShipLot_DtlR, ShipAct_DtlR, ShipAct_HdrR>();
	}
	public class Map_ShipLotChk_ShipLot_DtlR_ShipAct_DtlR<D extends ShipLot_DtlR, S extends ShipAct_DtlR, W extends ShipAct_HdrR> extends MAUCC_RowMapperWith<D,S,W>{
		protected ShipAct_HdrR _hdrR;
		public void setWith(W hdrR) {
			_hdrR = hdrR;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipLot_DtlR.$peg_no, ShipAct_DtlR.$peg_no);
			addColumnPathMap(ShipLot_DtlR.$itm_cd, ShipAct_DtlR.$itm_cd);
			addColumnPathMap(ShipLot_DtlR.$itm_sub1, ShipAct_DtlR.$itm_sub1);
			addColumnPathMap(ShipLot_DtlR.$itm_sub2, ShipAct_DtlR.$itm_sub2);
			addColumnPathMap(ShipLot_DtlR.$itm_sub3, ShipAct_DtlR.$itm_sub3);
			addColumnPathMap(ShipLot_DtlR.$lot_no, ShipAct_DtlR.$lot_no);
			addColumnPathMap(ShipLot_DtlR.$sublot_no, ShipAct_DtlR.$sublot_no);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			if (_hdrR.uplnd_flg()) {
				dest.cst_cd(_hdrR.cst_cd());
				dest.dlv_cd(src.dlv_id_cd());
			}
			else {
				MST_SHIP_ALLOC_STS_R sasR = getShipAllocStsR(src); 
				dest.cst_cd(sasR.getString("cst_cd"));
				dest.dlv_cd(sasR.getString("dlv_id_cd"));
				if (MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
					dest.lot_no(sasR.lot_no());
					dest.sublot_no(sasR.sublot_no());
				}
			}
			if (MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())
					&& !isNull(_hdrR.ship_inst_no())) {
				dest.base_dt(src.getDate("inst_dlv_tm").trunc(MCDateFieldType.DAY));
			}
			else if (MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())
					&& !_hdrR.uplnd_flg()) {
				dest.base_dt(src.getDate("schd_dlv_tm").trunc(MCDateFieldType.DAY));
			}
			else {
				dest.base_dt(_hdrR.dlv_tm().trunc(MCDateFieldType.DAY));
			}
			dest.lock_flg(true);
			
			if (MAC_DATA_CRUD_TYP.isCRT(src.data_crud_typ())) {
				dest.org_ship_alloc_sts_no(src.ship_alloc_sts_no());
				dest.ship_act_d_no(src.ship_act_d_no());
			}
			else if (MAC_DATA_CRUD_TYP.isUPD(src.data_crud_typ())) {
				dest.org_ship_alloc_sts_no(src.ship_alloc_sts_no());
				dest.org_ship_act_d_no(src.ship_act_d_no());
				dest.ship_act_d_no(src.ship_act_d_no());
			}
			else {
				dest.org_ship_act_d_no(src.ship_act_d_no());
				dest.org_ship_alloc_sts_no(src.ship_alloc_sts_no());
				dest.ship_alloc_sts_no(src.ship_alloc_sts_no());
			}
		}
	}

	/**
	 * 出荷帳票発行サービスを呼び出し、納品伝票を作成する
	 */
	protected void callShipRprtPrntSrv(
			MCList<ShipAct_HdrR> hdrL, ShipAct_CndR cndR,
			MCJoinKey<MCList<ShipAct_HdrR>> hdrJk, MCJoinKey<MCList<ShipAct_DtlR>> dtlJk) {
		MCList<ShipAct_HdrR>
			updL = createShipAct_HdrL(), delL = createShipAct_HdrL();
		MCList<ShipAct_DtlR>
			tgtL = createShipAct_DtlL(), tgtAllL = createShipAct_DtlL(), delDtlL = createShipAct_DtlL();
		for (ShipAct_HdrR hdrR : hdrL) {
			if (!hdrR.dlv_slip_flg()) {
				continue;
			}
			else if (MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
				delL.add(hdrR);
			}
			else {
				updL.add(hdrR);
				tgtL.addAll(
					hdrR.getJoined(dtlJk).subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()))
				);
				tgtAllL.addAll(hdrR.getJoined(dtlJk));
			}
			delDtlL.addAll(hdrR.getJoined(dtlJk).subList(r -> MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())));
		}

		if (!delL.isEmpty()) {
			MSBEL_ShipRprtPrntService.ShipRprt_Upd01 o = MSBEL_ShipRprtPrntService.crtShipRprt_Upd01();
			o.up2().bndl_prnt_flg(cndR.bndl_prnt_flg());
			for (ShipAct_HdrR hdrR :delL) {
				for (ShipAct_DtlR dtlR :hdrR.getJoined(dtlJk).groupBy(ShipAct_DtlR.$dlv_slip_no)) {
					ShipRprt_Upd01_HdrR up = o.up0().add();
					up.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					up.can_ac_dt(hdrR.can_ac_dt());
					up.dlv_slip_prnt_flg(hdrR.dlv_slip_prnt_flg());
					up.ship_adv_prnt_flg(hdrR.ship_adv_prnt_flg());
					up.dlv_slip_no(dtlR.dlv_slip_no());
					up.setAttributes(hdrR);
				}
			}
			o.exec();
		}
		if (!tgtL.isEmpty()) {
			MSBEL_ShipRprtPrntService.ShipRprt_Upd01 o = MSBEL_ShipRprtPrntService.crtShipRprt_Upd01();
			o.up2().bndl_prnt_flg(cndR.bndl_prnt_flg());

			//諸口品の場合、引当在庫の品名を出力する
			setSundryItemName(tgtL);

			// 以下の項目が異なる場合は、ヘッダを分ける→納品書NOが分かれる
			MCList<ShipRprt_Upd01_HdrR> rprtHdrL = MCList.create(ShipRprt_Upd01_HdrR.class);
			rprtHdrL.addStringColumn("dtl_uniq_no");	// ヘッダと明細の紐付けを保持
			rprtHdrL.addNumberColumn("disp_seq");
			MCList<ShipRprt_Upd01_DtlR> rprtDtlL = MCList.create(ShipRprt_Upd01_DtlR.class);

			// 電文を作成する時は削除行を含める
			tgtAllL.forEach(r -> {
				ShipAct_HdrR hdrR = r.getJoinedRow(hdrJk);
				copy(rprtDtlL.add(), r, hdrR, createMap_ShipRprt_Upd01_DtlR_ShipAct_DtlR());
				copy(rprtHdrL.add(), r, hdrR, createMap_ShipRprt_Upd01_HdrR_ShipAct_DtlR());
			});

			String[] grpKey = {
				ShipRprt_Upd01_HdrR.$hdr_peg_no,	// 上り電文のヘッダごとに分割
				ShipRprt_Upd01_HdrR.$slo_no,
				ShipRprt_Upd01_HdrR.$trd_cd,
				ShipRprt_Upd01_HdrR.$trd_ptn_typ,
				ShipRprt_Upd01_HdrR.$dlv_id_typ,
				ShipRprt_Upd01_HdrR.$dlv_id_cd,
				ShipRprt_Upd01_HdrR.$dlv_id_nm,
				ShipRprt_Upd01_HdrR.$dlv_zip_cd,
				ShipRprt_Upd01_HdrR.$dlv_addr1,
				ShipRprt_Upd01_HdrR.$dlv_addr2,
				ShipRprt_Upd01_HdrR.$dlv_addr3,
				ShipRprt_Upd01_HdrR.$dlv_addr4,
				ShipRprt_Upd01_HdrR.$dlv_tel,
				ShipRprt_Upd01_HdrR.$dlv_fax,
				ShipRprt_Upd01_HdrR.$dlv_cntct_dpt,
				ShipRprt_Upd01_HdrR.$dlv_cntct_psn,
				ShipRprt_Upd01_HdrR.$dlv_sundry_flg,
				ShipRprt_Upd01_HdrR.$xfr_loc_cd,	// 支給返品の時に出荷場所を設定
				ShipRprt_Upd01_HdrR.$wg_cd,
				ShipRprt_Upd01_HdrR.$pri_prnt_flg,
				ShipRprt_Upd01_HdrR.$cst_po_no,
				ShipRprt_Upd01_HdrR.$cststk_ship_flg,
				ShipRprt_Upd01_HdrR.$trd_rmrks,
				ShipRprt_Upd01_HdrR.$dlv_slip_no
			};
			int pegNo = 1;
			MCIndexKey idx = rprtDtlL.createIndex(ShipRprt_Upd01_DtlR.$dtl_uniq_no);
			for (MCList<ShipRprt_Upd01_HdrR> grpL : rprtHdrL.groupList(grpKey)) {
				ShipRprt_Upd01_HdrR grpR = grpL.get(0).clone();
				grpR.hdr_peg_no(pegNo);
				grpL.sort("disp_seq");

				//データ更新区分を設定する
				//・全部納品書ＮＯが入って無かったらCRT
				//・全部削除だったらDEL
				//・それ以外はUPD
				int iDel = 0;
				int iUpd = 0;
				int iCrt = 0;
				for (ShipRprt_Upd01_HdrR r : grpL) {
					ShipRprt_Upd01_DtlR dtlR = rprtDtlL.getFirst(idx, r.getString("dtl_uniq_no"));
					if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
						iDel++;
					}
					else if (isNull(dtlR.dlv_slip_no())) {
						iCrt++;
					}
					else {
						iUpd++;
					}
				}
				
				String typ = MAC_DATA_CRUD_TYP.UPD.value();
				if(iUpd != 0) {
					typ = MAC_DATA_CRUD_TYP.UPD.value();
				}
				else if(iDel == 0 && iCrt != 0) {
					typ = MAC_DATA_CRUD_TYP.CRT.value();
				}
				else if(iDel != 0 && iCrt == 0) {
					typ = MAC_DATA_CRUD_TYP.DEL.value();
				}
				grpR.data_crud_typ(typ);

				o.up0().add(grpR);

				if (!MAC_DATA_CRUD_TYP.isDEL(grpR.data_crud_typ())) {
					// ヘッダ紐付けNOを明細に反映する
					for (ShipRprt_Upd01_HdrR r : grpL) {
						// 削除行はサービスに渡さない
						if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
							ShipRprt_Upd01_DtlR dtlR = rprtDtlL.getFirst(idx, r.getString("dtl_uniq_no"));
							dtlR.hdr_peg_no(pegNo);
							o.up1().add(dtlR);
						}
					}
				}
				pegNo++;
			}
			if (!o.up0().isEmpty()) {
				// 不要な削除分を除外する
				removeDelHdr(o.up0());
				o.exec();
				//throwUpdErr();		// 帳票発行に失敗した場合はエラーとする

				MCIndexKey idx1 = o.down0().createIndex(ShipRprt_Upd01_DtlR.$dtl_uniq_no);
				tgtL.forEach(r -> {
					ShipRprt_Upd01_DtlR dR = o.down0().getFirst(idx1, r.ship_act_d_no());
					r.dlv_slip_no(dR.dlv_slip_no());
					r.dlv_slip_seq(dR.dlv_slip_seq());
					r.setBooleanNE(ShipRprt_Upd01_DtlR.$upded_flg, dR.upded_flg());
					r.dlv_slip_d_no(dR.dlv_slip_d_no());
				});
				aftrCallShipRprtUpd(tgtL, o.down0(), hdrJk);
			}
		}
		// EDI出荷実績送信サービスを呼び出す。
		MCList<ShipAct_HdrR> sendL = MCList.create(ShipAct_HdrR.class);
		sendL.addAll(updL);
		sendL.addAll(delL);
		chkTrdPtn(sendL);
		callShipActSendIfSv(sendL, tgtL, delDtlL);
	}
	
	protected void removeDelHdr(MCList<ShipRprt_Upd01_HdrR> up0L) {
		MCList<ShipRprt_Upd01_HdrR> removeL = MCList.create(ShipRprt_Upd01_HdrR.class);
		for (MCList<ShipRprt_Upd01_HdrR> gl :
			up0L.subList(r -> isNull(r.dlv_slip_no())).groupList(ShipRprt_Upd01_HdrR.$dlv_slip_act_no)) {
			
			if (gl.distinctNE(ShipRprt_Upd01_HdrR.$data_crud_typ).size() > 1) {
				// UPDとDELが混在しているときは、UPDのみでDEL分の納品伝票も取り消される
				// CRTとUPDは混在しないのでDELのみ考慮する
				removeL.addAll(
					gl.subList(ShipRprt_Upd01_HdrR.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value())
				);
			}
		}
		up0L.removeAll(removeL);
	}
	/**
	 * 出荷帳票発行サービス呼出後の後処理（登録・訂正）
	 */
	protected void aftrCallShipRprtUpd(
		MCList<ShipAct_DtlR> dtlL, MCList<ShipRprt_Upd01_DtlR> downL, MCJoinKey<MCList<ShipAct_HdrR>> hdrJk) {
		
		MCList<ShipAct_HdrR> hdrL = MCList.create(ShipAct_HdrR.class);
		MCIndexKey idx = downL.createIndex(ShipRprt_Upd01_DtlR.$dtl_uniq_no);
		for (ShipAct_DtlR dtlR : dtlL) {
			ShipAct_HdrR hdrR = dtlR.getJoinedRow(hdrJk);
			
			ShipRprt_Upd01_DtlR dR = downL.getFirst(idx, dtlR.ship_act_d_no());
			hdrR.setBooleanNE(ShipRprt_Upd01_DtlR.$upded_flg,
				hdrR.getBooleanNE(ShipRprt_Upd01_DtlR.$upded_flg) || dR.upded_flg());
			if (hdrR.dlv_slip_prnt_flg()) {
				hdrR.dlv_slip_prnted_flg(hdrR.dlv_slip_prnted_flg() || dR.dlv_slip_prnted_flg());
			}
			if (hdrR.ship_adv_prnt_flg()) {
				hdrR.ship_adv_prnted_flg(hdrR.ship_adv_prnted_flg() || dR.ship_adv_prnted_flg());
			}
			
			hdrL.add(hdrR);
		}
		
		// 発行済フラグ、発行日時を更新する
		MCList<MST_SHIP_ACT_R> updL = MCList.create(MST_SHIP_ACT_R.class);
		MCDate sysnow = MCDate.now();
		for (MCList<ShipAct_HdrR> l : hdrL.groupList(ShipAct_HdrR.$ship_act_no)) {
			ShipAct_HdrR hdrR = l.get(0);
			MST_SHIP_ACT_R updR = updL.add();
			updR.ship_act_no(hdrR.ship_act_no());
			
			// 発行済み
			if (hdrR.dlv_slip_prnted_flg()) {
				updR.dlv_prnt_flg(true);
				updR.dlv_prnt_tm(sysnow);
			}
			// 未発行かつ登録対象
			else if (hdrR.getBooleanNE(ShipRprt_Upd01_DtlR.$upded_flg)) {
				updR.dlv_prnt_flg(false);
				ShipAct_HdrR bfrR = getShipActR(updR.ship_act_no());
				if (!isNull(bfrR)) {
					updR.dlv_prnt_tm(bfrR.sa().dlv_prnt_tm());
				}
				else {
					updR.dlv_prnt_tm(null);
				}
			}
			// 未発行かつ登録対象外（更新前の納品書と同じ内容なので登録不要）
			else {
				ShipAct_HdrR bfrR = getShipActR(updR.ship_act_no());
				if (!isNull(bfrR)) {
					updR.dlv_prnt_flg(bfrR.sa().dlv_prnt_flg());
					updR.dlv_prnt_tm(bfrR.sa().dlv_prnt_tm());
				}
			}
			
			if (hdrR.ship_adv_prnted_flg()) {
				updR.ship_adv_prnt_flg(true);
				updR.ship_adv_prnt_tm(sysnow);
			}
			else if (hdrR.getBooleanNE(ShipRprt_Upd01_DtlR.$upded_flg)) {
				updR.ship_adv_prnt_flg(false);
				ShipAct_HdrR bfrR = getShipActR(updR.ship_act_no());
				if (!isNull(bfrR)) {
					updR.ship_adv_prnt_tm(bfrR.sa().ship_adv_prnt_tm());
				}
				else {
					updR.ship_adv_prnt_tm(null);
				}
			}
			else {
				ShipAct_HdrR bfrR = getShipActR(updR.ship_act_no());
				if (!isNull(bfrR)) {
					updR.ship_adv_prnt_flg(bfrR.sa().ship_adv_prnt_flg());
					updR.ship_adv_prnt_tm(bfrR.sa().ship_adv_prnt_tm());
				}
			}
			
			// 下り電文用に再設定
			hdrR.dlv_slip_prnted_flg(updR.dlv_prnt_flg());
			hdrR.ship_adv_prnted_flg(updR.ship_adv_prnt_flg());
		}
		MST_SHIP_ACT_R act = MST_SHIP_ACT_R.create("T");
		MCQueryApiBuilder bldr = MCQueryApiBuilder.create(act);
		bldr.setSet(
			act.dlv_prnt_flg, act.dlv_prnt_tm, act.ship_adv_prnt_flg, act.ship_adv_prnt_tm
		);
		dbUpdateKey("MSBEL5540_MST_SHIP_ACT_U04", updL, bldr);

		// 納品書NO、納品書明細NOを反映する
		MST_SHIP_ACT_D_R actd = MST_SHIP_ACT_D_R.create("T");
		bldr = MCQueryApiBuilder.create(actd);
		bldr.setSet(actd.dlv_slip_no, actd.dlv_slip_seq, actd.dlv_slip_d_no);
		dbUpdateKey("MSBEL5540_MST_SHIP_ACT_D_U06", dtlL, bldr);
	}
	
	//取引パタン区分が売上か出荷のデータのみを抽出する
	protected void chkTrdPtn(MCList<ShipAct_HdrR> sendL) {
		MCList<ShipAct_HdrR> getL = MCList.create(ShipAct_HdrR.class);
		for(ShipAct_HdrR r : sendL) {
			MCList<MST_SHIP_ACT_D_R> shipActDL = MCList.create(MST_SHIP_ACT_D_R.class);
			MST_SHIP_ACT_D_R t = MST_SHIP_ACT_D_R.create("T");
			MCQueryApiBuilder shipActDL_bldr = MCQueryApiBuilder.create(t);
			shipActDL_bldr.setSelect(t.trd_ptn_typ);
			shipActDL_bldr.setWhere(t.ship_act_no.eq(bind("1")), r.ship_act_no());
			dbSelect("MSBEL5540_MST_SHIP_ACT_D_S06", shipActDL, shipActDL_bldr);
			if(MAC_TRD_PTN_TYP.isSLS(shipActDL.get(0).trd_ptn_typ())||
					MAC_TRD_PTN_TYP.isSHIP(shipActDL.get(0).trd_ptn_typ())) {
				getL.add(r);
			}
		}
		sendL.setAll(getL);
	}

	protected void callShipActSendIfSv(MCList<ShipAct_HdrR> hdrL, MCList<ShipAct_DtlR> dtlL, MCList<ShipAct_DtlR> delDtlL) {
				
		MSLAL_ShipActSendIfService.ShipActSendIf_Upd01 ope = MSLAL_ShipActSendIfService.crtShipActSendIf_Upd01();
				
		ShipActSendIf_Upd01_DtlR dtlR = null;
		MCIndexKey idx = dtlL.createIndex(ShipAct_DtlR.$hdr_peg_no);
		for (ShipAct_HdrR hdrR : hdrL.groupByNE(
				ShipAct_HdrR.$peg_no, ShipAct_HdrR.$ship_act_no, ShipAct_HdrR.$iv_no, ShipAct_HdrR.$data_crud_typ)) {
			
			dtlR = ShipActSendIf_Upd01_DtlR.create();
			dtlR.ship_act_no(hdrR.ship_act_no());
			dtlR.iv_no(hdrR.iv_no());
			dtlR.data_crud_typ(hdrR.data_crud_typ());
			
			ope.up0().add(dtlR);
			
			if (isNull(hdrR.iv_no())) {
				// インボイス単位ではないかつ配送先経由しない場合、明細のインボイスNOを設定する。
				for (ShipAct_DtlR dlt : dtlL.subList(idx, hdrR.peg_no()).groupBy(ShipAct_DtlR.$iv_no)) {
					if (isNull(dlt.iv_no())) {
						continue;
					}
					dtlR = ShipActSendIf_Upd01_DtlR.create();
					dtlR.ship_act_no(hdrR.ship_act_no());
					dtlR.iv_no(dlt.iv_no());
					dtlR.data_crud_typ(hdrR.data_crud_typ());
					
					ope.up0().add(dtlR);
				}
			}
		}
		for (ShipAct_DtlR r : dtlL.distinctNE(ShipAct_DtlR.$dlv_slip_no)) {
			mcframe.serverMSLA.MSLAL5150.ShipActSendIf_Upd01_DlvR dlvR = ope.up1().add();
			dlvR.dlv_slip_no(r.dlv_slip_no());
			dlvR.upded_flg(r.getBooleanNE(ShipRprt_Upd01_DtlR.$upded_flg));
		}
		
		for (ShipAct_DtlR r : delDtlL.distinctNE( ShipAct_DtlR.$dlv_slip_d_no, ShipAct_DtlR.$iv_d_no, ShipAct_DtlR.$iv_no)) {
			if (isNull(r.iv_d_no())) {
				continue;
			}
			mcframe.serverMSLA.MSLAL5150.ShipActSendIf_Upd01_IvDlvR ivDlvR = ope.up2().add();
			ivDlvR.dlv_slip_d_no(r.dlv_slip_d_no());
			ivDlvR.iv_d_no(r.iv_d_no());
			ivDlvR.iv_no(r.iv_no());
		}
		
		if (ope.up0().size() > 0) {
			ope.exec();
		}
	}
	protected Map_ShipRprt_Upd01_HdrR_ShipAct_HdrR<ShipRprt_Upd01_HdrR,ShipAct_HdrR> createMap_ShipRprt_Upd01_HdrR_ShipAct_HdrR() {
		return new Map_ShipRprt_Upd01_HdrR_ShipAct_HdrR<ShipRprt_Upd01_HdrR, ShipAct_HdrR>();
	}
	public class Map_ShipRprt_Upd01_HdrR_ShipAct_HdrR<D extends ShipRprt_Upd01_HdrR, S extends ShipAct_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			dest.can_ac_dt(src.can_ac_dt());
			dest.trn_typ(MSC_TRN_TYP.SHIP.value());
			dest.dlv_slip_act_no(src.ship_act_no());
			dest.dlv_slip_prnt_flg(src.dlv_slip_prnt_flg());
			dest.ship_adv_prnt_flg(src.ship_adv_prnt_flg());
		}
	}
	protected Map_ShipRprt_Upd01_HdrR_ShipAct_DtlR<ShipRprt_Upd01_HdrR,ShipAct_DtlR,ShipAct_HdrR> createMap_ShipRprt_Upd01_HdrR_ShipAct_DtlR() {
		return new Map_ShipRprt_Upd01_HdrR_ShipAct_DtlR<ShipRprt_Upd01_HdrR, ShipAct_DtlR,ShipAct_HdrR>();
	}
	public class Map_ShipRprt_Upd01_HdrR_ShipAct_DtlR<D extends ShipRprt_Upd01_HdrR, S extends ShipAct_DtlR, W extends ShipAct_HdrR> extends MAUCC_RowMapperWith<D,S,W>{
		protected ShipAct_HdrR _hdrR;
		@Override
		public void setWith(W hdrR) {
			_hdrR = hdrR;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipRprt_Upd01_HdrR.$cst_po_no, ShipAct_DtlR.$cst_po_no);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$pri_prnt_flg, ShipAct_DtlR.$pri_prnt_flg);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$trd_cd, ShipAct_DtlR.$trd_cd);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$trd_ptn_typ, ShipAct_DtlR.$trd_ptn_typ);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_id_typ, ShipAct_DtlR.$dlv_id_typ);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_id_cd, ShipAct_DtlR.$dlv_id_cd);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_id_nm, ShipAct_DtlR.$dlv_id_nm);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_sundry_flg, ShipAct_DtlR.$dlv_sundry_flg);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_zip_cd, ShipAct_DtlR.$dlv_zip_cd);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_addr1, ShipAct_DtlR.$dlv_addr1);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_addr2, ShipAct_DtlR.$dlv_addr2);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_addr3, ShipAct_DtlR.$dlv_addr3);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_addr4, ShipAct_DtlR.$dlv_addr4);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_cntct_dpt, ShipAct_DtlR.$dlv_cntct_dpt);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_cntct_psn, ShipAct_DtlR.$dlv_cntct_psn);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_tel, ShipAct_DtlR.$dlv_tel);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_fax, ShipAct_DtlR.$dlv_fax);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$trd_rmrks, ShipAct_DtlR.$trd_rmrks);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.hdr_peg_no(src.hdr_peg_no());		// 上り電文のヘッダを一意に特定するキー
			dest.setString("dtl_uniq_no", src.ship_act_d_no());	// 一時的にヘッダと明細を紐付けるため
			dest.setNumber("disp_seq", src.disp_seq());
			dest.data_crud_typ(src.data_crud_typ());		// 削除行を特定するため
			dest.dlv_slip_prnt_flg(_hdrR.dlv_slip_prnt_flg());
			dest.ship_adv_prnt_flg(_hdrR.ship_adv_prnt_flg());

			dest.r_inst_no(src.getStringNE("r_inst_no"));
			dest.split_flg(true);

			dest.ac_dt(_hdrR.ac_dt());
			dest.can_ac_dt(_hdrR.can_ac_dt());
			dest.trn_typ(MSC_TRN_TYP.SHIP.value());
			dest.dlv_slip_inst_no(_hdrR.ship_inst_no());
			dest.dlv_slip_act_no(_hdrR.ship_act_no());

			dest.dpt_cd(_hdrR.ship_dpt_cd());
			dest.usr_cd(_hdrR.ship_usr_cd());
			if (_hdrR.uplnd_flg()) {
				if (MAC_TRD_PTN_TYP.isSLS(src.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSHIP(src.trd_ptn_typ()) 
					|| MAC_TRD_PTN_TYP.isPROV(src.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPROV_RTN(src.trd_ptn_typ())) {
					dest.dpt_cd(_hdrR.rqst_dpt_cd());
					dest.usr_cd(_hdrR.rqst_usr_cd());
				}
			}
			else {
				MST_SHIP_ALLOC_STS_R sasR = getShipAllocStsL(src).get(0);
				dest.dlv_id_typ(sasR.getString("dlv_id_typ"));
				dest.dlv_id_cd(sasR.getString("dlv_id_cd"));
				dest.dlv_id_nm(sasR.getString("dlv_id_nm"));
				dest.dlv_zip_cd(sasR.getString("dlv_zip_cd"));
				dest.dlv_addr1(sasR.getString("dlv_addr1"));
				dest.dlv_addr2(sasR.getString("dlv_addr2"));
				dest.dlv_addr3(sasR.getString("dlv_addr3"));
				dest.dlv_addr4(sasR.getString("dlv_addr4"));
				dest.dlv_cntct_dpt(sasR.getString("dlv_cntct_dpt"));
				dest.dlv_cntct_psn(sasR.getString("dlv_cntct_psn"));
				dest.dlv_tel(sasR.getString("dlv_tel"));
				dest.dlv_fax(sasR.getString("dlv_fax"));
				dest.dlv_sundry_flg(sasR.getBoolean("dlv_sundry_flg"));
				dest.slo_no(sasR.getString("slo_no"));
			}
			dest.ship_tm(_hdrR.ship_tm());
			dest.dlv_tm(_hdrR.dlv_tm());
			dest.trd_cd(src.trd_cd());
			dest.trd_ptn_typ(src.trd_ptn_typ());

			if (MAC_TRD_PTN_TYP.isSLS(src.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isSHIP(src.trd_ptn_typ())) {
				if (_hdrR.uplnd_flg()) {
					dest.bp_cd(_hdrR.cst_cd());
					dest.wg_cd(getDptR(_hdrR.rqst_dpt_cd(), _hdrR.ac_dt()).wg_cd());
				}
				else {
					MST_SHIP_ALLOC_STS_R sasR = getShipAllocStsR(src);
					dest.bp_cd(sasR.getString("cst_cd"));
					sasR.addDateColumn("ac_dt", _hdrR.ac_dt());
					setDpt(sasR, "rqst_dpt_cd", "ac_dt");
					dest.wg_cd(getDptR(sasR.getString("rqst_dpt_cd"), _hdrR.ac_dt()).wg_cd());
				}
			}
			else {
				dest.wg_cd(_hdrR.wg_cd());
				if (MAC_TRD_PTN_TYP.isPROV(src.trd_ptn_typ())) {
					dest.bp_cd(getLocR(dest.dlv_id_cd()).sppl_cd());
					dest.pri_prnt_flg(true);
				}
				else if (MAC_TRD_PTN_TYP.isPROV_RTN(src.trd_ptn_typ())) {
					dest.bp_cd(getLocR(src.ship_loc_cd()).sppl_cd());
					dest.xfr_loc_cd(src.ship_loc_cd());
					dest.pri_prnt_flg(true);
				}
			}
			dest.ship_fr_lg_grp_cd(_hdrR.ship_fr_lg_grp_cd());

			// 同時計上フラグ
			if (isSlsOrShip(src)) {
				dest.sync_flg(isSlsShipBasis(_hdrR, src));
			}
			else {
				dest.sync_flg(!isArr(_hdrR, src));
			}
			
			// 預り出荷の場合
			if (!isNull(dest.slo_no()) && MSC_STK_ID_TYP.isCSTSTK(src.stk_id_typ())) {
				dest.cststk_ship_flg(true);
				dest.pri_prnt_flg(false);
			}
			
			// ヘッダの納品書が設定されている場合、納品書ごとにヘッダを分けて実行する
			// ※ヘッダの納品書が設定されるのは、出荷実績登録画面を納品書で検索し、更新した場合のみ
			if (!isNull(_hdrR.dlv_slip_no())) {
				dest.dlv_slip_no(_hdrR.dlv_slip_no());
			}
			// 出荷基準の売上で、直前に売上明細訂正で訂正されている場合、納品書ごとにヘッダを分けて実行する
			// ※取消分の納品伝票がトランザクション区分と納品伝票実績ＮＯの組み合わせで取得できないので
			else if (isSlsOrShip(src) && isSlsShipBasis(_hdrR, src)) {
				for (ShipAct_DtlR actDR : getShipActDLFromHdr(_hdrR.ship_act_no())) {
					if (!isNull(actDR) && MSC_TRN_TYP.isSLS(actDR.getStringNE("trn_typ"))) {
						dest.dlv_slip_no(src.dlv_slip_no());
						break;
					}
				}
			}
		}
	}
	protected Map_ShipRprt_Upd01_DtlR_ShipAct_DtlR<ShipRprt_Upd01_DtlR,ShipAct_DtlR, ShipAct_HdrR> createMap_ShipRprt_Upd01_DtlR_ShipAct_DtlR() {
		return new Map_ShipRprt_Upd01_DtlR_ShipAct_DtlR<ShipRprt_Upd01_DtlR, ShipAct_DtlR, ShipAct_HdrR>();
	}
	public class Map_ShipRprt_Upd01_DtlR_ShipAct_DtlR<D extends ShipRprt_Upd01_DtlR, S extends ShipAct_DtlR, W extends ShipAct_HdrR> extends MAUCC_RowMapperWith<D,S,W>{
		protected ShipAct_HdrR _hdrR;
		@Override
		public void setWith(W hdrR) {
			_hdrR = hdrR;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipRprt_Upd01_DtlR.$dlv_slip_d_no, ShipAct_DtlR.$dlv_slip_d_no);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$dlv_slip_no, ShipAct_DtlR.$dlv_slip_no);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_cd, ShipAct_DtlR.$itm_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_sub1, ShipAct_DtlR.$itm_sub1);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_sub2, ShipAct_DtlR.$itm_sub2);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_sub3, ShipAct_DtlR.$itm_sub3);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_nm, ShipAct_DtlR.$itm_nm);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sundry_itm_flg, ShipAct_DtlR.$sundry_itm_flg);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sno1, ShipAct_DtlR.$sno1);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sno2, ShipAct_DtlR.$sno2);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sno3, ShipAct_DtlR.$sno3);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sno4, ShipAct_DtlR.$sno4);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$lot_no, ShipAct_DtlR.$lot_no);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sublot_no, ShipAct_DtlR.$sublot_no);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$gd_cd, ShipAct_DtlR.$gd_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$trd_unit_qty, ShipAct_DtlR.$trd_unit_qty);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$trd_unit_cd, ShipAct_DtlR.$trd_unit_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$base_unit_qty, ShipAct_DtlR.$base_unit_qty);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$base_unit_cd, ShipAct_DtlR.$base_unit_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$rsn_cd, ShipAct_DtlR.$rsn_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$bd_dpt_cd, ShipAct_DtlR.$bd_dpt_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$cst_po_d_no, ShipAct_DtlR.$cst_po_d_no);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$cst_itm_cd, ShipAct_DtlR.$cst_itm_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$cst_itm_nm, ShipAct_DtlR.$cst_itm_nm);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$slo_d_no, ShipAct_DtlR.$slo_d_no);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$trd_d_rmrks, ShipAct_DtlR.$trd_d_rmrks);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$base_ac_dt, ShipAct_DtlR.$base_ac_dt);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.dtl_uniq_no(src.ship_act_d_no());
			if (!_hdrR.uplnd_flg()) {
				MST_SHIP_ALLOC_STS_R sasR = getShipAllocStsL(src).get(0);
				dest.dlv_inst_rcpt_no(sasR.getString("dlv_inst_rcpt_no"));
				dest.ship_schd_no(sasR.ship_schd_no());
			}
			else {
				if (MAC_TRD_PTN_TYP.isPROV(src.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPROV_RTN(src.trd_ptn_typ())) {
					dest.prov_typ(src.prov_typ());
					dest.prov_basis_typ(src.prov_basis_typ());
				}
			}
		}
	}
	/**
	 * 指図時点の納品書から変更がある場合、納品書NOをクリアする
	 */
	protected void clearDlvSlipNo(MCList<ShipAct_HdrR> hdrL, MCList<ShipAct_DtlR> dtlL) {

		MCIndexKey idx = dtlL.createIndex(ShipAct_DtlR.$hdr_peg_no);
		MCList<ShipAct_DtlR> tgtDtlL = MCList.create(ShipAct_DtlR.class);
		for (ShipAct_HdrR hdrR : hdrL) {
			if (MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ())
				 && !isNull(hdrR.ship_inst_no())) {
				tgtDtlL.addAll(dtlL.subList(idx, hdrR.peg_no()));
			}
		}
		if (tgtDtlL.isEmpty()) {
			return;
		}
		
		MST_SHIP_ACT_D_R t = MST_SHIP_ACT_D_R.create("T");
		MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
		bldr.setDistinct();
		bldr.setSelect(t.ship_act_no, t.dlv_slip_no);
		bldr.setWhere(t.dlv_slip_no.eq(bind("dlv_slip_no")));
		bldr.addConstWhereWithAnd(t.can_flg.eq(value(false)));
		
		MCList<MST_SHIP_ACT_D_R> actDL = MCList.create(MST_SHIP_ACT_D_R.class);
		dbSelect("MSBEL5540_MST_SHIP_ACT_D_S10",
			actDL, bldr, tgtDtlL.groupBy(MST_SHIP_ACT_D_R.$dlv_slip_no));
		MCIndexKey sadIdx = actDL.createIndex(MST_SHIP_ACT_D_R.$dlv_slip_no);
		MCIndexKey dtlIdx = tgtDtlL.createIndex(ShipAct_DtlR.$dlv_slip_no);
		MCList<ShipAct_DtlR> clearNoL = MCList.create(ShipAct_DtlR.class);
		
		for (MCList<ShipAct_DtlR> l :
			tgtDtlL.groupList(ShipAct_DtlR.$dlv_slip_no, ShipAct_DtlR.$hdr_peg_no)) {
			
			ShipAct_DtlR r = l.get(0);
			MCNumber hPegNo =
				(MCNumber)tgtDtlL
					.subList(dtlIdx, r.dlv_slip_no())
					.min(ShipAct_DtlR.$hdr_peg_no);
			
			// 以下のいずれかに該当する場合、納品書ＮＯは引き継がないで再発番する
			// ・同じ納品書ＮＯが出荷済みか
			// ・同じ納品書ＮＯの出荷対象がヘッダ違いで複数ある
			if (!isNull(actDL.getFirst(sadIdx, r.dlv_slip_no()))
				|| !isSame(r.hdr_peg_no(), hPegNo)) {
				clearNoL.addAll(l);
			}
		}
		clearNoL.forEach(rr -> {
			rr.dlv_slip_no(null);
			rr.dlv_slip_d_no(null);
		});
	}

	/**
	 * 諸口品の場合、引当在庫の品名を出力する
	 */
	protected void setSundryItemName(MCList<ShipAct_DtlR> dtlL) {
		MCList<ShipAct_DtlR> sundryItm_dtlL = dtlL.subList(r -> r.sundry_itm_flg());
		
		MCList<MAM_SUNDRY_ITM_R> sundryItmL = MCList.create(MAM_SUNDRY_ITM_R.class);
		MAM_SUNDRY_ITM_R m = MAM_SUNDRY_ITM_R.create("M");
		MCQueryApiBuilder sundryItmL_bldr = MCQueryApiBuilder.create(m);
		sundryItmL_bldr.setSelect(m.itm_nm, m.itm_cd, m.itm_sub1, m.itm_sub2, m.itm_sub3, m.sno1, m.sno2, m.sno3, m.sno4);
		dbSelectKey("MSBEL5540_MAM_SUNDRY_ITM_S01", sundryItmL, sundryItmL_bldr, sundryItm_dtlL);
		
		MCIndexKey idx = sundryItmL.createIndex(
				MAM_SUNDRY_ITM_R.$itm_cd,
				MAM_SUNDRY_ITM_R.$itm_sub1,
				MAM_SUNDRY_ITM_R.$itm_sub2,
				MAM_SUNDRY_ITM_R.$itm_sub3,
				MAM_SUNDRY_ITM_R.$sno1,
				MAM_SUNDRY_ITM_R.$sno2,
				MAM_SUNDRY_ITM_R.$sno3,
				MAM_SUNDRY_ITM_R.$sno4);
		
		sundryItm_dtlL.forEach(r -> {
			MAM_SUNDRY_ITM_R sundryItmR = sundryItmL.getFirst(idx, r.itm_cd(),
					r.itm_sub1(), r.itm_sub2(), r.itm_sub3(),
					r.sno1(), r.sno2(), r.sno3(), r.sno4());
			
			if(!isNull(sundryItmR)) {
				r.itm_nm(sundryItmR.itm_nm());
			}
		});
	}

	/**
	 * 受払実績サービスを呼び出し、受払実績WKを作成する
	 */
	protected void callPreIoSlipSrv(MCList<ShipAct_HdrR> hdrL, MCJoinKey<MCList<ShipAct_DtlR>> dtlJk) {
		MSBEL_IoActService.IoAct_Ins01 o = MSBEL_IoActService.crtIoAct_Ins01();

		for (ShipAct_HdrR hdrR : hdrL) {
			MCList<ShipAct_DtlR> tgtL = hdrR.getJoined(dtlJk);

			// 削除
			if (MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
				// ヘッダ単位で削除
				copy(o.up0().add(), ShipAct_DtlR.create(), hdrR, createMap_IoAct_Ins01_DtlR_ShipAct_DtlR_forDel());
			}
			// 新規
			else if (MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ())) {
				// 全件まとめて作成
				addAll(o.up0(), tgtL, hdrR, createMap_IoAct_Ins01_DtlR_ShipAct_DtlR());
			}
			// それ以外
			else {
				MCList<ShipAct_DtlR> delL = tgtL.subList(r -> MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));
				if (!delL.isEmpty()) {
					// 削除行はデータ更新区分を「削除」で実行
					addAll(o.up0(), delL, hdrR, createMap_IoAct_Ins01_DtlR_ShipAct_DtlR_forDel());
				}
				MCList<ShipAct_DtlR> upL = tgtL.subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));
				if (!upL.isEmpty()) {
					addAll(o.up0(), upL, hdrR, createMap_IoAct_Ins01_DtlR_ShipAct_DtlR());
				}
			}
		}
		if (!o.up0().isEmpty()) {
			o.exec();
		}
	}
	/**
	 * 受払実績サービスを呼び出し、受払実績を作成する
	 */
	protected void callIoSlipSrv(MCList<ShipAct_HdrR> hdrL) {
		if (!isNull(hdrL.getFirst(new String[] {ShipAct_HdrR.$io_act_flg, ShipAct_HdrR.$uplnd_iv_sls_flg}, new Comparable[] {true, false}))) {
		// 計画外インボイス取引売上の場合、出荷実績の時点に受払実績を反映しない
			MSBEL_IoActService.IoAct_Upd01 o = MSBEL_IoActService.crtIoAct_Upd01();
			if (!isNull(hdrL.getFirst(ShipAct_HdrR.$lot_chk_off_flg, true))) {
				o.setLotChkFlg(true);
			}
			o.exec();
		}
	}
	/**
	 * 受払実績削除用マッパー
	 */
	protected Map_IoAct_Ins01_DtlR_ShipAct_DtlR_forDel<IoAct_Ins01_DtlR, ShipAct_DtlR, ShipAct_HdrR> createMap_IoAct_Ins01_DtlR_ShipAct_DtlR_forDel() {
		return new Map_IoAct_Ins01_DtlR_ShipAct_DtlR_forDel<IoAct_Ins01_DtlR, ShipAct_DtlR, ShipAct_HdrR>();
	}
	public class Map_IoAct_Ins01_DtlR_ShipAct_DtlR_forDel<D extends IoAct_Ins01_DtlR, S extends ShipAct_DtlR, W extends ShipAct_HdrR> extends MAUCC_RowMapperWith<D,S,W>{
		protected ShipAct_HdrR _hdrR;
		public void setWith(W hdrR) {
			_hdrR = hdrR;
		}
		@Override
		protected void valueCopy(D dest, S src) {
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			dest.act_no(_hdrR.ship_act_no());
			dest.act_d_no(src.ship_act_d_no());
			dest.can_ac_dt(_hdrR.can_ac_dt());
			dest.trn_typ(MSC_TRN_TYP.SHIP.value());
		}
	}
	/**
	 * 受払実績追加・更新用マッパー
	 */
	protected Map_IoAct_Ins01_DtlR_ShipAct_DtlR<IoAct_Ins01_DtlR, ShipAct_DtlR, ShipAct_HdrR> createMap_IoAct_Ins01_DtlR_ShipAct_DtlR() {
		return new Map_IoAct_Ins01_DtlR_ShipAct_DtlR<IoAct_Ins01_DtlR, ShipAct_DtlR, ShipAct_HdrR>();
	}
	public class Map_IoAct_Ins01_DtlR_ShipAct_DtlR<D extends IoAct_Ins01_DtlR, S extends ShipAct_DtlR, W extends ShipAct_HdrR> extends MAUCC_RowMapperWith<D,S,W>{
		protected ShipAct_HdrR _hdrR;
		public void setWith(W hdrR) {
			_hdrR = hdrR;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(IoAct_Ins01_DtlR.$act_d_no, ShipAct_DtlR.$ship_act_d_no);
			addColumnPathMap(IoAct_Ins01_DtlR.$trd_cd, ShipAct_DtlR.$trd_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$trd_ptn_typ, ShipAct_DtlR.$trd_ptn_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$itm_cd, ShipAct_DtlR.$itm_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$itm_sub1, ShipAct_DtlR.$itm_sub1);
			addColumnPathMap(IoAct_Ins01_DtlR.$itm_sub2, ShipAct_DtlR.$itm_sub2);
			addColumnPathMap(IoAct_Ins01_DtlR.$itm_sub3, ShipAct_DtlR.$itm_sub3);
			addColumnPathMap(IoAct_Ins01_DtlR.$itm_nm, ShipAct_DtlR.$itm_nm);
			addColumnPathMap(IoAct_Ins01_DtlR.$stk_mng_typ, ShipAct_DtlR.$stk_mng_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$sno1_mng_typ, ShipAct_DtlR.$sno1_mng_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$sno2_mng_typ, ShipAct_DtlR.$sno2_mng_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$sno3_mng_typ, ShipAct_DtlR.$sno3_mng_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$sno4_mng_typ, ShipAct_DtlR.$sno4_mng_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$sundry_itm_flg, ShipAct_DtlR.$sundry_itm_flg);
			addColumnPathMap(IoAct_Ins01_DtlR.$gi_loc_cd, ShipAct_DtlR.$ship_loc_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$gi_str_ln_cd, ShipAct_DtlR.$ship_str_ln_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$stk_arrv_bp_cd, ShipAct_DtlR.$stk_arrv_bp_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$lot_no, ShipAct_DtlR.$lot_no);
			addColumnPathMap(IoAct_Ins01_DtlR.$sublot_no, ShipAct_DtlR.$sublot_no);
			addColumnPathMap(IoAct_Ins01_DtlR.$sno1, ShipAct_DtlR.$sno1);
			addColumnPathMap(IoAct_Ins01_DtlR.$sno2, ShipAct_DtlR.$sno2);
			addColumnPathMap(IoAct_Ins01_DtlR.$sno3, ShipAct_DtlR.$sno3);
			addColumnPathMap(IoAct_Ins01_DtlR.$sno4, ShipAct_DtlR.$sno4);
			addColumnPathMap(IoAct_Ins01_DtlR.$gi_gd_cd, ShipAct_DtlR.$gd_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$gr_gd_cd, ShipAct_DtlR.$gd_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$quality_typ, ShipAct_DtlR.$quality_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$stk_id_typ, ShipAct_DtlR.$stk_id_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$stk_bp_cd, ShipAct_DtlR.$stk_bp_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$trd_unit_qty, ShipAct_DtlR.$trd_unit_qty);
			addColumnPathMap(IoAct_Ins01_DtlR.$trd_unit_cd, ShipAct_DtlR.$trd_unit_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$pack_unit_qty, ShipAct_DtlR.$pack_unit_qty);
			addColumnPathMap(IoAct_Ins01_DtlR.$pack_unit_cd, ShipAct_DtlR.$pack_unit_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$base_unit_qty, ShipAct_DtlR.$base_unit_qty);
			addColumnPathMap(IoAct_Ins01_DtlR.$base_unit_cd, ShipAct_DtlR.$base_unit_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$cst_itm_cd, ShipAct_DtlR.$cst_itm_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$cst_itm_nm, ShipAct_DtlR.$cst_itm_nm);
			addColumnPathMap(IoAct_Ins01_DtlR.$trd_rmrks, ShipAct_DtlR.$trd_rmrks);
			addColumnPathMap(IoAct_Ins01_DtlR.$trd_d_rmrks, ShipAct_DtlR.$trd_d_rmrks);
			addColumnPathMap(IoAct_Ins01_DtlR.$rsn_cd, ShipAct_DtlR.$rsn_cd);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			dest.data_crud_typ(src.data_crud_typ());
			dest.ac_dt(_hdrR.ac_dt());
			dest.can_ac_dt(_hdrR.can_ac_dt());
			dest.act_tm(_hdrR.ship_tm());
			dest.act_no(_hdrR.ship_act_no());
			dest.act_seq(null);
			dest.act_rev_no(_hdrR.ship_act_rev());
			dest.un_fix_flg(false);
			dest.trn_typ(MSC_TRN_TYP.SHIP.value());
			dest.act_dpt_cd(_hdrR.ship_dpt_cd());
			dest.act_usr_cd(_hdrR.ship_usr_cd());

			dest.gi_wg_cd(getLocR(src.ship_loc_cd()).wg_cd());
			if (isXfrOrProv(src)) {
				MAM_LOC_R locR = getLocR(src.dlv_id_cd());
				dest.gr_wg_cd(locR.wg_cd());
				dest.gr_loc_cd(src.dlv_id_cd());
				dest.gr_str_ln_cd(src.dlv_str_ln_cd());
			}
			if (MAC_TRD_PTN_TYP.isSLS(src.trd_ptn_typ())) {
				if (!MAC_VIA_DLV_TYP.isVIA(_hdrR.via_dlv_typ())
					&& !MSC_STK_ID_TYP.isCSTSTK(src.stk_id_typ())) {
					if (!isNull(_hdrR.iv_no())) {
						dest.fix_no_typ(MSC_FIX_NO_TYP.IV_NO.value());
						dest.fix_no(_hdrR.iv_no());
					}
					else {
						dest.fix_no_typ(MSC_FIX_NO_TYP.DLV_SLIP_NO.value());
						dest.fix_no(src.dlv_slip_no());
					}
				}
			}
			dest.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
			dest.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
			if (!_hdrR.uplnd_flg() && isSlsOrShip(src)) {
				MST_SHIP_ALLOC_STS_R sasR = getShipAllocStsR(src);
				if (!isNull(sasR)) {
					dest.slo_no(sasR.getString("slo_no"));
				}
			}
			dest.iv_no(_hdrR.iv_no());
			// 得意先・納品先
			if (isSlsOrShip(src)) {
				if (_hdrR.uplnd_flg()) {
					dest.cst_cd(_hdrR.cst_cd());
					dest.dlv_cd(src.dlv_id_cd());
				}
				else {
					MST_SHIP_ALLOC_STS_R sasR = getShipAllocStsR(src); 
					dest.cst_cd(sasR.getString("cst_cd"));
					dest.dlv_cd(sasR.getString("dlv_id_cd"));
				}
			}
			// 配送先
			if (MAC_VIA_DLV_TYP.isVIA(_hdrR.via_dlv_typ())) {
				dest.tdlv_cd(_hdrR.ship_to_id_cd());
			}
			if (MAC_TRD_PTN_TYP.isSHIP(src.trd_ptn_typ())) {
				dest.via_dlv_typ(MAC_VIA_DLV_TYP.NOT_VIA.value());
			}
			else {
				dest.via_dlv_typ(_hdrR.via_dlv_typ());
			}
			
			if(!_hdrR.uplnd_flg()) {
				MCList<MST_SHIP_ALLOC_STS_R> allocL = getShipAllocStsL(src);
				if(!isNull(allocL) && allocL.get(0).alloc_flg()) {
					dest.no_gi_alloc_flg(true);
				}
			}
			
			// 売上明細訂正登録で更新した場合、出庫引当確認を対象外にする
			if (_hdrR.sls_dtl_mod_flg()) {
				dest.no_gi_alloc_flg(true);
			}
		}
	}

	/**
	 * 出荷指図サービスを呼び出し、出荷指図を更新する
	 */
	protected void callShipInstSrv(
			MCList<ShipAct_DtlR> dtlL, MCJoinKey<MCList<ShipAct_HdrR>> hdrJk) {

		// 更新対象、打切、打切解除の明細のみ抽出
		MCList<ShipAct_DtlR> updL = createShipAct_DtlL();
		for (ShipAct_DtlR r : dtlL) {
			ShipAct_HdrR hdrR = r.getJoinedRow(hdrJk);
			if (hdrR.uplnd_flg() || isNull(hdrR.ship_inst_no())) {
				continue;
			}
			// 更新対象または打切
			if (!r.non_upd_flg() || r.abort_flg()) {
				updL.add(r);
			}
			else {
				MST_SHIP_ALLOC_STS_R sasR = getShipAllocStsL(r).get(0);
				// 打切解除
				if (sasR.getBoolean("abort_flg")) {
					updL.add(r);
				}
			}
		}
		if (updL.isEmpty())	return;

		MSBEL_ShipInstService.ShipInst_Upd02 o = MSBEL_ShipInstService.crtShipInst_Upd02();
		Map_ShipInst_Upd02_DtlR_ShipAct_DtlR
			<ShipInst_Upd02_DtlR,ShipAct_DtlR> mpr = createMap_ShipInst_Upd02_DtlR_ShipAct_DtlR();
		for (MCList<ShipAct_DtlR> grpL : updL.groupList(ShipAct_DtlR.$ship_inst_d_no)) {
			copy(o.up0().add(), grpL.get(0), mpr);
		}
		if (!o.up0().isEmpty()) {
			o.exec();
		}
	}
	protected Map_ShipInst_Upd02_DtlR_ShipAct_DtlR<ShipInst_Upd02_DtlR,ShipAct_DtlR> createMap_ShipInst_Upd02_DtlR_ShipAct_DtlR() {
		return new Map_ShipInst_Upd02_DtlR_ShipAct_DtlR<ShipInst_Upd02_DtlR, ShipAct_DtlR>();
	}
	public class Map_ShipInst_Upd02_DtlR_ShipAct_DtlR<D extends ShipInst_Upd02_DtlR, S extends ShipAct_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipInst_Upd02_DtlR.$ship_inst_d_no, ShipAct_DtlR.$ship_inst_d_no);
			addColumnPathMap(ShipInst_Upd02_DtlR.$abort_flg, ShipAct_DtlR.$abort_flg);
		}
	}

	/**
	 * 出荷予定サービスを呼び出し、出荷予定を更新する
	 */
	protected void callShipSchdSrv(
			MCList<ShipAct_DtlR> dtlL, MCJoinKey<MCList<ShipAct_HdrR>> hdrJk) {

		final String GRP_COL = "__grp_col__";

		// 更新対象、打切、打切解除の明細のみ抽出
		MCList<ShipAct_DtlR> updL = createShipAct_DtlL();
		updL.addStringColumn(GRP_COL);
		for (ShipAct_DtlR r : dtlL) {
			ShipAct_HdrR hdrR = r.getJoinedRow(hdrJk);
			if (hdrR.uplnd_flg()) {
				continue;
			}
			// 更新対象または打切
			if (!r.non_upd_flg() || r.abort_flg()) {
				updL.add(r);
			}
			else {
				MST_SHIP_ALLOC_STS_R sasR = getShipAllocStsL(r).get(0);
				// 打切解除
				if (sasR.getBoolean("abort_flg")) {
					updL.add(r);
				}
			}

			// 指図経由の出荷の場合は、指図明細単位、それ以外は出荷予定単位に実績数を反映する
			r.setStringNE(GRP_COL, 
				isNull(hdrR.ship_inst_no()) ? r.ship_schd_no() : r.ship_inst_d_no());
		}
		if (updL.isEmpty())	return;

		MSBEL_ShipSchdService.ShipSchd_Upd03 o = MSBEL_ShipSchdService.crtShipSchd_Upd03();
		Map_ShipSchd_Upd03_DtlR_ShipAct_DtlR
			<ShipSchd_Upd03_DtlR,ShipAct_DtlR> mpr = createMap_ShipSchd_Upd03_DtlR_ShipAct_DtlR();
		for (MCList<ShipAct_DtlR> grpL : updL.groupList(GRP_COL)) {
			copy(o.up0().add(), grpL.get(0), mpr);
		}
		setAll(o.up1(),
			updL.groupBy(ShipAct_DtlR.$ship_alloc_sts_no, ShipAct_DtlR.$ship_act_d_no),
			createMap_ShipSchd_Upd03_ActDtlR_ShipAct_DtlR());
		
		if (!o.up0().isEmpty()) {
			o.exec();
		}
	}
	protected Map_ShipSchd_Upd03_DtlR_ShipAct_DtlR<ShipSchd_Upd03_DtlR,ShipAct_DtlR> createMap_ShipSchd_Upd03_DtlR_ShipAct_DtlR() {
		return new Map_ShipSchd_Upd03_DtlR_ShipAct_DtlR<ShipSchd_Upd03_DtlR, ShipAct_DtlR>();
	}
	public class Map_ShipSchd_Upd03_DtlR_ShipAct_DtlR<D extends ShipSchd_Upd03_DtlR, S extends ShipAct_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipSchd_Upd03_DtlR.$ship_schd_no, ShipAct_DtlR.$ship_schd_no);
			addColumnPathMap(ShipSchd_Upd03_DtlR.$ship_inst_d_no, ShipAct_DtlR.$ship_inst_d_no);
			addColumnPathMap(ShipSchd_Upd03_DtlR.$abort_flg, ShipAct_DtlR.$abort_flg);
		}
	}
	protected Map_ShipSchd_Upd03_ActDtlR_ShipAct_DtlR<ShipSchd_Upd03_ActDtlR,ShipAct_DtlR> createMap_ShipSchd_Upd03_ActDtlR_ShipAct_DtlR() {
		return new Map_ShipSchd_Upd03_ActDtlR_ShipAct_DtlR<ShipSchd_Upd03_ActDtlR, ShipAct_DtlR>();
	}
	public class Map_ShipSchd_Upd03_ActDtlR_ShipAct_DtlR<D extends ShipSchd_Upd03_ActDtlR, S extends ShipAct_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipSchd_Upd03_ActDtlR.$ship_alloc_sts_no, ShipAct_DtlR.$ship_alloc_sts_no);
			addColumnPathMap(ShipSchd_Upd03_ActDtlR.$ship_act_d_no, ShipAct_DtlR.$ship_act_d_no);
		}
	}

	/**
	 * 出荷予定サービス(Upd05)を呼び出し、出荷予定を更新する
	 */
	protected void callShipSchdUpd05(
			MCList<ShipAct_HdrR> hdrL, MCJoinKey<MCList<ShipAct_DtlR>> dtlJk) {
		MCList<ShipAct_DtlR> tgtL = MCList.create(ShipAct_DtlR.class);

		for (ShipAct_HdrR hdrR : hdrL) {
			if (hdrR.uplnd_flg()) {
				continue;
			}

			for (ShipAct_DtlR r : getSlsSrvL(hdrR, hdrR.getJoined(dtlJk), false)) {
				MST_SHIP_ALLOC_STS_R sasR = getShipAllocStsR(r);
				if (isSlsShipBasis(hdrR, r)) {
					// 出荷基準は対象外
					continue;
				}
				else if (r.abort_flg() || sasR.getBoolean("abort_flg")) {
					tgtL.add(r);
				}
			}
		
			// インボイス取引 かつ インボイス単位出荷ではない場合、売上予定打切数量を出荷進捗に反映するため、対象とする。
			if (isNull(hdrR.iv_no())) {
				
				for (ShipAct_DtlR r : hdrR.getJoined(dtlJk)) {
					
					MST_SHIP_ALLOC_STS_R sasR = getShipAllocStsR(r);
					
					// 「売上」以外、仕入直送、売上済の預り売上は対象外
					if (!MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ())
						|| sasR.getBoolean("purc_ddlv_flg")
						|| !sasR.getBoolean("cst_iv_flg")
						|| (MSC_STK_ID_TYP.isCSTSTK(r.stk_id_typ())
								&& sasR.getNumber("sls_qty").isPositive())) {
						continue;
					}
					
					tgtL.add(r);
				}
			}
		}
		
		if (tgtL.isEmpty()) {
			return;
		}

		MSBEL_ShipSchdService.ShipSchd_Upd05 o = MSBEL_ShipSchdService.crtShipSchd_Upd05();
		setAll(o.up0(), tgtL.groupBy(ShipAct_DtlR.$ship_schd_no), createMap_ShipSchd_Upd05_DtlR_ShipAct_DtlR());
		if (!o.up0().isEmpty()) {
			o.exec();
		}
	}
	protected Map_ShipSchd_Upd05_DtlR_ShipAct_DtlR<ShipSchd_Upd05_DtlR,ShipAct_DtlR> createMap_ShipSchd_Upd05_DtlR_ShipAct_DtlR() {
		return new Map_ShipSchd_Upd05_DtlR_ShipAct_DtlR<ShipSchd_Upd05_DtlR, ShipAct_DtlR>();
	}
	public class Map_ShipSchd_Upd05_DtlR_ShipAct_DtlR<D extends ShipSchd_Upd05_DtlR, S extends ShipAct_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipSchd_Upd05_DtlR.$ship_schd_no, ShipAct_DtlR.$ship_schd_no);
		}
	}


	/**
	 * ＶＭＩ計上サービスを呼び出し、仕入実績を登録する
	 */
	protected MCList<Vmi_Chk01_DtlR> _vmiUpMap = MCList.create(Vmi_Chk01_DtlR.class);
	protected void callVmiSrv(
			MCList<ShipAct_DtlR> dtlL, MCJoinKey<MCList<ShipAct_HdrR>> hdrJk, boolean isChk) {

		if (!isChk) {
			MCList<Vmi_Chk01_DtlR> vmipL = object(CLAZZ)._vmiUpMap;
			MCList<Vmi_Chk01_DtlR> vmipNEL = MCList.create(Vmi_Chk01_DtlR.class);
			if (!isNull(vmipL)) {
				MCIndexKey idx = vmipL.createIndex("peg_no");
				MCIndexKey purcSrcNoidx = vmipL.createIndex("purc_src_no");
				dtlL.forEach(r -> {
					Vmi_Chk01_DtlR vmiR = Vmi_Chk01_DtlR.create();
					
					if(MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
						vmiR = vmipL.getFirst(purcSrcNoidx, r.ship_act_d_no());
					}
					else {
						vmiR = vmipL.getFirst(idx, r.org_peg_no());
					}

					if (!isNull(vmiR)) {
						vmiR.purc_src_no(r.ship_act_d_no());

						vmipNEL.add(vmiR);

						// 計上後は自社在庫として扱う
						if (!MAC_DATA_CRUD_TYP.isDEL(vmiR.data_crud_typ())) {
							r.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
							r.stk_bp_cd(null);
						}
					}
				});

				// 本処理はチェック処理で作成したコンテナを利用する
				MSBDL_VmiService.Vmi_Upd01 o = MSBDL_VmiService.crtVmi_Upd01();
				o.up0().setAll(vmipNEL);
				o.exec();
				// 出荷実績サービスが複数回呼ばれるケースがあるため、クリアする
				object(CLAZZ)._vmiUpMap.clear();
			}
			return;
		}

		PurcActDCache purcActDL = new PurcActDCache(
			dtlL.subList(r -> !isNull(r.ship_act_d_no()) && MSC_STK_ID_TYP.isRNT_RCV(r.stk_id_typ())));

		MCList<Vmi_Chk01_DtlR> upL = MCList.create(Vmi_Chk01_DtlR.class);
		for (ShipAct_DtlR r : dtlL) {
			MAM_LOC_R frLocR = getLocR(r.ship_loc_cd());
			if (!isXfrOrProv(r)
				|| !MSC_STK_ID_TYP.isRNT_RCV(r.stk_id_typ())) {
				continue;
			}

			ShipAct_DtlR tmpR = r.clone();
			if (MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ()) || frLocR.getBoolean("gi_vmi_flg")) {
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					if (!purcActDL.exists(r.ship_act_d_no())) {
						// 削除だが仕入実績がない⇒何もしない
						continue;
					}
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					if (!purcActDL.exists(r.ship_act_d_no())) {
						// 更新だが仕入実績がない⇒新規
						tmpR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					}
				}
			}
			else {
				if (!purcActDL.exists(r.ship_act_d_no())) {
					// 仕入実績がない⇒何もしない
					continue;
				}
				// VMI計上フラグがオフだが、仕入実績がある⇒削除
				tmpR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}

			ShipAct_HdrR hdrR = r.getJoinedRow(hdrJk);
			if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				copy(upL.add(), tmpR, hdrR, createMap_Vmi_Chk01_DtlR_ShipAct_DtlR_forDel());
			}
			else {
				copy(upL.add(), tmpR, hdrR, createMap_Vmi_Chk01_DtlR_ShipAct_DtlR());
			}
		}
		if (upL.isEmpty())	return;

		MSBDL_VmiService.Vmi_Chk01 o = MSBDL_VmiService.crtVmi_Chk01();
		o.up0().setAll(upL);
		o.exec();
		copyErrFlg(dtlL, o.down0());
		object(CLAZZ)._vmiUpMap.setAll(o.down0());
		}
	
	protected Map_Vmi_Chk01_DtlR_ShipAct_DtlR_forDel<Vmi_Chk01_DtlR,ShipAct_DtlR, ShipAct_HdrR> createMap_Vmi_Chk01_DtlR_ShipAct_DtlR_forDel() {
		return new Map_Vmi_Chk01_DtlR_ShipAct_DtlR_forDel<Vmi_Chk01_DtlR, ShipAct_DtlR, ShipAct_HdrR>();
	}
	public class Map_Vmi_Chk01_DtlR_ShipAct_DtlR_forDel<D extends Vmi_Chk01_DtlR, S extends ShipAct_DtlR, W extends ShipAct_HdrR> extends MAUCC_RowMapperWith<D,S,W>{
		protected ShipAct_HdrR _hdrR;
		@Override
		public void setWith(W hdrR) {
			_hdrR = hdrR;
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.peg_no(src.peg_no());
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			dest.purc_src_typ(MSC_PURC_SRC_TYP.SHIP.value());
			dest.purc_src_no(src.ship_act_d_no());
			dest.can_ac_dt(_hdrR.can_ac_dt());
		}
	}
	protected Map_Vmi_Chk01_DtlR_ShipAct_DtlR<Vmi_Chk01_DtlR,ShipAct_DtlR,ShipAct_HdrR> createMap_Vmi_Chk01_DtlR_ShipAct_DtlR() {
		return new Map_Vmi_Chk01_DtlR_ShipAct_DtlR<Vmi_Chk01_DtlR, ShipAct_DtlR, ShipAct_HdrR>();
	}
	public class Map_Vmi_Chk01_DtlR_ShipAct_DtlR<D extends Vmi_Chk01_DtlR, S extends ShipAct_DtlR, W extends ShipAct_HdrR> extends MAUCC_RowMapperWith<D,S,W>{
		protected ShipAct_HdrR _hdrR;
		@Override
		public void setWith(W hdrR) {
			_hdrR = hdrR;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Vmi_Chk01_DtlR.$peg_no, ShipAct_DtlR.$peg_no);
			addColumnPathMap(Vmi_Chk01_DtlR.$data_crud_typ, ShipAct_DtlR.$data_crud_typ);
			addColumnPathMap(Vmi_Chk01_DtlR.$trd_ptn_typ, ShipAct_DtlR.$trd_ptn_typ);
			addColumnPathMap(Vmi_Chk01_DtlR.$stk_bp_cd, ShipAct_DtlR.$stk_bp_cd);
			addColumnPathMap(Vmi_Chk01_DtlR.$itm_cd, ShipAct_DtlR.$itm_cd);
			addColumnPathMap(Vmi_Chk01_DtlR.$itm_sub1, ShipAct_DtlR.$itm_sub1);
			addColumnPathMap(Vmi_Chk01_DtlR.$itm_sub2, ShipAct_DtlR.$itm_sub2);
			addColumnPathMap(Vmi_Chk01_DtlR.$itm_sub3, ShipAct_DtlR.$itm_sub3);
			addColumnPathMap(Vmi_Chk01_DtlR.$itm_nm, ShipAct_DtlR.$itm_nm);
			addColumnPathMap(Vmi_Chk01_DtlR.$trd_unit_cd, ShipAct_DtlR.$trd_unit_cd);
			addColumnPathMap(Vmi_Chk01_DtlR.$trd_unit_qty, ShipAct_DtlR.$trd_unit_qty);
			addColumnPathMap(Vmi_Chk01_DtlR.$base_unit_cd, ShipAct_DtlR.$base_unit_cd);
			addColumnPathMap(Vmi_Chk01_DtlR.$base_unit_qty, ShipAct_DtlR.$base_unit_qty);
			addColumnPathMap(Vmi_Chk01_DtlR.$gd_cd, ShipAct_DtlR.$gd_cd);
			addColumnPathMap(Vmi_Chk01_DtlR.$sno1, ShipAct_DtlR.$sno1);
			addColumnPathMap(Vmi_Chk01_DtlR.$sno2, ShipAct_DtlR.$sno2);
			addColumnPathMap(Vmi_Chk01_DtlR.$sno3, ShipAct_DtlR.$sno3);
			addColumnPathMap(Vmi_Chk01_DtlR.$sno4, ShipAct_DtlR.$sno4);
			addColumnPathMap(Vmi_Chk01_DtlR.$lot_no, ShipAct_DtlR.$lot_no);
			addColumnPathMap(Vmi_Chk01_DtlR.$sublot_no, ShipAct_DtlR.$sublot_no);
			addColumnPathMap(Vmi_Chk01_DtlR.$quality_typ, ShipAct_DtlR.$quality_typ);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.purc_src_typ(MSC_PURC_SRC_TYP.SHIP.value());
			dest.purc_src_no(src.ship_act_d_no());
			dest.purc_dt(_hdrR.ship_tm().trunc(MCDateFieldType.DAY));
			dest.ac_dt(_hdrR.ac_dt());
			dest.loc_cd(src.ship_loc_cd());
			dest.str_ln_cd(src.ship_str_ln_cd());
			dest.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
			if (MAC_DATA_CRUD_TYP.isUPD(src.data_crud_typ())) {
				dest.can_ac_dt(_hdrR.can_ac_dt());
			}
		}
	}
	public class PurcActDCache {
		protected MCList<MST_PURC_ACT_D_R> _purcActDL = null;
		protected MCIndexKey _purcActDIdx = null;
		protected PurcActDCache(MCList<ShipAct_DtlR> dtlL) {
			if (isNull(_purcActDL)) {
				_purcActDL = MCList.create(MST_PURC_ACT_D_R.class);
				MST_PURC_ACT_D_R t = MST_PURC_ACT_D_R.create("T");
				MCQueryApiBuilder purcActDL_bldr = MCQueryApiBuilder.create(t);
				MST_PURC_ACT_R t1 = MST_PURC_ACT_R.create("T1");
				purcActDL_bldr.setSelect(t.purc_src_no);
				purcActDL_bldr.addInnerJoin(t1, bracket(t1.purc_act_no.eq(t.purc_act_no)
						.and(t1.purc_act_seq.eq(t.purc_act_seq))
						.and(t1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))));
				purcActDL_bldr.setWhere(
						t.purc_src_typ.eq(value(MSC_PURC_SRC_TYP.SHIP.value())));
				purcActDL_bldr.addWhereWithAnd(t.purc_src_no.eq(bind("ship_act_d_no")));
				dbSelect("MSBEL5540_MST_PURC_ACT_D_S01", _purcActDL, purcActDL_bldr, dtlL);
				_purcActDIdx = _purcActDL.createIndex(MST_PURC_ACT_D_R.$purc_src_no);
			}
		}
		protected boolean exists(String shipActDNo) {
			return !isNull(_purcActDL.getFirst(_purcActDIdx, shipActDNo));
		}
	}

	/**
	 * 支給実績サービスの下り電文とのマッピング
	 */
	protected String[][] _provActCopyCols = {
			{
				ShipAct_DtlR.$stk_arrv_bp_cd,
				ShipAct_DtlR.$stk_id_typ,
				ShipAct_DtlR.$stk_bp_cd
			},
			{
				ProvActUpd01_DtlR.$stk_arrv_bp_cd,
				ProvActUpd01_DtlR.$stk_id_typ,
				ProvActUpd01_DtlR.$stk_bp_cd
			}
	};
	/**
	 * 支給実績サービスを呼び出し、支給実績を登録する
	 * 下り電文を出荷実績明細に更新する必要があるため、出荷実績明細の更新前に実行する
	 */
	protected void callProvActSrv(
			MCList<ShipAct_DtlR> dtlL, MCJoinKey<MCList<ShipAct_HdrR>> hdrJk, boolean isChk) {

		MCList<ShipAct_DtlR> provL = MCList.create(ShipAct_DtlR.class);
		for (ShipAct_DtlR r : dtlL) {
			if ((MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())
				|| isOutsrcDDlv(r))
				&& !isNull(getProvTyp(r))) {
				provL.add(r);
			}
		}
		if (provL.isEmpty())	return;

		if (isChk) {
			// 支給実績キャッシュ
			doProvActCache(
				provL.subList(r -> !MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()))
			);
			MSBEL_ProvActService.ProvAct_Chk01 o = MSBEL_ProvActService.crtProvAct_Chk01();
			provL.forEach(r -> {
				ShipAct_HdrR hdrR = r.getJoinedRow(hdrJk);
				copy(o.up0().add(), r, hdrR, createMap_ProvActChk01_DtlR_ShipAct_DtlR());
			});
			o.exec();
			copyErrFlg(provL, o.down0());
		}
		else {
			MSBEL_ProvActService.ProvAct_Upd01 o = MSBEL_ProvActService.crtProvAct_Upd01();
			provL.forEach(r -> {
				ShipAct_HdrR hdrR = r.getJoinedRow(hdrJk);
				copy(o.up0().add(), r, hdrR, createMap_ProvActUpd01_DtlR_ShipAct_DtlR());
			});
			o.exec();
			// 受払実績、入荷予定・実績は支給実績の結果を踏まえる
			copyByPegNo(dtlL, _provActCopyCols[0], o.down0(), _provActCopyCols[1]);
		}
	}
	protected Map_ProvActChk01_DtlR_ShipAct_DtlR<ProvActChk01_DtlR,ShipAct_DtlR,ShipAct_HdrR> createMap_ProvActChk01_DtlR_ShipAct_DtlR() {
		return new Map_ProvActChk01_DtlR_ShipAct_DtlR<ProvActChk01_DtlR, ShipAct_DtlR, ShipAct_HdrR>();
	}
	public class Map_ProvActChk01_DtlR_ShipAct_DtlR<D extends ProvActChk01_DtlR, S extends ShipAct_DtlR, W extends ShipAct_HdrR> extends MAUCC_RowMapperWith<D,S,W>{
		protected ShipAct_HdrR _hdrR;
		@Override
		public void setWith(W hdrR) {
			_hdrR = hdrR;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ProvActChk01_DtlR.$peg_no, ShipAct_DtlR.$peg_no);
			addColumnPathMap(ProvActChk01_DtlR.$data_crud_typ, ShipAct_DtlR.$data_crud_typ);
			addColumnPathMap(ProvActChk01_DtlR.$itm_cd, ShipAct_DtlR.$itm_cd);
			addColumnPathMap(ProvActChk01_DtlR.$itm_sub1, ShipAct_DtlR.$itm_sub1);
			addColumnPathMap(ProvActChk01_DtlR.$itm_sub2, ShipAct_DtlR.$itm_sub2);
			addColumnPathMap(ProvActChk01_DtlR.$itm_sub3, ShipAct_DtlR.$itm_sub3);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.accpt_dt(_hdrR.ship_tm().trunc(MCDateFieldType.DAY));
			dest.ac_dt(_hdrR.ac_dt());
			dest.trd_ptn_typ(MAC_TRD_PTN_TYP.PROV_RTN.value());
			dest.loc_cd(src.ship_loc_cd());

			MAM_LOC_R locR = getLocR(src.ship_loc_cd());
			dest.wg_cd(locR.wg_cd());
			dest.prsppl_cd(locR.sppl_cd());

			// 支給実績SV内で補完する
			dest.prov_typ(null);
			dest.prov_basis_typ(null);
			dest.trd_cur_cd(null);
			dest.xrate(null);
			dest.ptax_xrate(null);
			dest.tax_cd(null);

			if (MAC_DATA_CRUD_TYP.isCRT(src.data_crud_typ())) {
				if (!_hdrR.uplnd_flg()) {
					dest.prov_src_schd_typ(MSC_PROV_SRC_SCHD_TYP.SHIP.value());
					dest.prov_src_schd_no1(src.ship_schd_no());
				}
				dest.stk_id_typ(src.stk_id_typ());
				dest.prov_src_act_typ(MSC_PROV_SRC_ACT_TYP.RET_SHIP.value());
			}
			else {
				dest.can_ac_dt(_hdrR.can_ac_dt());
				MST_PROV_ACT_R actR = getProvActR(src.ship_act_d_no());
				if (!isNull(actR)) {
					dest.prov_act_no(actR.prov_act_no());
					dest.prov_src_act_typ(actR.prov_src_act_typ());
					dest.prov_src_act_no(actR.prov_src_act_no());
				}
			}
		}
	}
	protected Map_ProvActUpd01_DtlR_ShipAct_DtlR<ProvActUpd01_DtlR,ShipAct_DtlR,ShipAct_HdrR> createMap_ProvActUpd01_DtlR_ShipAct_DtlR() {
		return new Map_ProvActUpd01_DtlR_ShipAct_DtlR<ProvActUpd01_DtlR, ShipAct_DtlR, ShipAct_HdrR>();
	}
	public class Map_ProvActUpd01_DtlR_ShipAct_DtlR<D extends ProvActUpd01_DtlR, S extends ShipAct_DtlR, W extends ShipAct_HdrR> extends MAUCC_RowMapperWith<D,S,W>{
		protected ShipAct_HdrR _hdrR;
		@Override
		public void setWith(W hdrR) {
			_hdrR = hdrR;
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.peg_no(src.peg_no());
			dest.data_crud_typ(src.data_crud_typ());
			dest.trd_cd(src.trd_cd());
			dest.trd_ptn_typ(MAC_TRD_PTN_TYP.PROV_RTN.value());
			dest.prov_src_act_typ(MSC_PROV_SRC_ACT_TYP.RET_SHIP.value());
			dest.prov_src_act_no(src.ship_act_d_no());

			if (!_hdrR.uplnd_flg()) {
				MCList<MST_SHIP_ALLOC_STS_R> allocL = getShipAllocStsL(src);
				if (!isNull(allocL) && !allocL.isEmpty()) {
					dest.addBooleanColumn("alloc_flg", allocL.get(0).alloc_flg());
				}
			}
			// 支給実績SV内で補完する
			dest.prov_typ(null);
			dest.prov_basis_typ(null);
			dest.xrate(null);
			dest.ptax_xrate(null);
			dest.trd_cur_cd(null);
			dest.tax_cd(null);
			dest.trd_cur_upri(null);
			dest.wtax_rate(null);

			if (MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
				dest.can_ac_dt(_hdrR.can_ac_dt());
				MST_PROV_ACT_R actR = getProvActR(src.ship_act_d_no());
				if (!isNull(actR)) {
					dest.prov_act_no(actR.prov_act_no());
				}
			}
			else {
				dest.xfr_rsn_cd(src.rsn_cd());
				dest.trd_unit_cd(src.trd_unit_cd());
				dest.trd_unit_qty(src.trd_unit_qty());
				dest.base_unit_cd(src.base_unit_cd());
				dest.base_unit_qty(src.base_unit_qty());
				dest.accpt_dt(_hdrR.ship_tm().trunc(MCDateFieldType.DAY));
				dest.ac_dt(_hdrR.ac_dt());
				MAM_LOC_R locR = getLocR(src.ship_loc_cd());
				dest.wg_cd(locR.wg_cd());
				dest.prsppl_cd(locR.sppl_cd());

				if (MAC_DATA_CRUD_TYP.isCRT(src.data_crud_typ())) {
					if (!_hdrR.uplnd_flg()) {
						dest.prov_src_schd_typ(MSC_PROV_SRC_SCHD_TYP.SHIP.value());
						dest.prov_src_schd_no1(src.ship_schd_no());
					}
				}
				else {
					dest.can_ac_dt(_hdrR.can_ac_dt());
					MST_PROV_ACT_R actR = getProvActR(src.ship_act_d_no());
					if (!isNull(actR)) {
						dest.prov_act_no(actR.prov_act_no());
						dest.prov_src_act_typ(actR.prov_src_act_typ());
						dest.prov_src_act_no(actR.prov_src_act_no());
					}
				}
				dest.itm_cd(src.itm_cd());
				dest.itm_sub1(src.itm_sub1());
				dest.itm_sub2(src.itm_sub2());
				dest.itm_sub3(src.itm_sub3());
				dest.loc_cd(src.ship_loc_cd());
				dest.str_ln_cd(src.ship_str_ln_cd());
				dest.stk_arrv_bp_cd(src.stk_arrv_bp_cd());
				dest.lot_no(src.lot_no());
				dest.sublot_no(src.sublot_no());
				dest.sno1(src.sno1());
				dest.sno2(src.sno2());
				dest.sno3(src.sno3());
				dest.sno4(src.sno4());
				dest.gd_cd(src.gd_cd());
				dest.quality_typ(src.quality_typ());
				dest.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
				dest.stk_id_typ(src.stk_id_typ());
				dest.stk_bp_cd(src.stk_bp_cd());
				dest.intr_rmrks(src.intr_d_rmrks());
				dest.trd_d_rmrks(src.trd_d_rmrks());
				dest.sub_char1(src.sub_char1());
				dest.sub_char2(src.sub_char2());
				dest.sub_char3(src.sub_char3());
				dest.base_ac_dt(src.base_ac_dt());
			}
		}
	}

	/**
	 * 外注間直送か
	 */
	protected boolean isOutsrcDDlv(ShipAct_DtlR r) {
		if (!MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())) {
			return false;
		}
		String
			fr = getLocR(r.ship_loc_cd()).sppl_cd(),
			to = getLocR(r.dlv_id_cd()).sppl_cd();
		
		return !isNull(fr) && !isSame(fr, to);
	}

	/**
	 * 在庫識別区分から支給区分を取得する
	 */
	protected String getProvTyp(ShipAct_DtlR r) {
		if (MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())) {
			if (MAC_STR.isNULL_VAL(r.stk_arrv_bp_cd())) {
				// 使用基準の在庫の場合は支給実績サービスを実行しない
				return null;
			}
			else {
				return MAC_PROV_TYP.FFR_PROV.value();
			}
		}
		else if (MSC_STK_ID_TYP.isACCPT_DFCT(r.stk_id_typ())
					|| MSC_STK_ID_TYP.isNCV_RCV(r.stk_id_typ())) {
				return MAC_PROV_TYP.FFR_PROV.value();
		}
		else if (MSC_STK_ID_TYP.isONR_PROV(r.stk_id_typ())) {
			return MAC_PROV_TYP.ONR_PROV.value();
		}
		return null;
	}

	/**
	 * 入荷進捗・入荷予定を作成する単位
	 */
	protected String[] _$arrSchdKey = {
		// 入荷進捗の粒度
		ShipAct_DtlR.$dlv_slip_no,
		ShipAct_DtlR.$dlv_slip_d_no,
		ShipAct_DtlR.$itm_cd,
		ShipAct_DtlR.$itm_sub1,
		ShipAct_DtlR.$itm_sub2,
		ShipAct_DtlR.$itm_sub3,
		ShipAct_DtlR.$itm_nm,
		ShipAct_DtlR.$sundry_itm_flg,
		ShipAct_DtlR.$sno1,
		ShipAct_DtlR.$sno2,
		ShipAct_DtlR.$sno3,
		ShipAct_DtlR.$sno4,
		ShipAct_DtlR.$lot_no,
		ShipAct_DtlR.$sublot_no,
		ShipAct_DtlR.$ver_no,
		ShipAct_DtlR.$trd_unit_cd,
		ShipAct_DtlR.$base_unit_cd,
		ShipAct_DtlR.$rsn_cd,
		ShipAct_DtlR.$bd_dpt_cd,
		ShipAct_DtlR.$cst_po_d_no,
		ShipAct_DtlR.$cst_itm_cd,
		ShipAct_DtlR.$cst_itm_nm,
		// 入荷予定の粒度
		ShipAct_DtlR.$gd_cd,
		ShipAct_DtlR.$quality_typ,
		ShipAct_DtlR.$stk_id_typ,
		ShipAct_DtlR.$stk_bp_cd,
		ShipAct_DtlR.$stk_arrv_bp_cd,
		ShipAct_DtlR.$arr_loc_cd,
		ShipAct_DtlR.$arr_str_ln_cd
	};

	/**
	 * 入荷予定サービスの下り電文を格納<br>
	 * 入荷実績サービスの上りに使用する
	 */
	protected MCList<ArrSchd_DtlR> _arrSchdRsltL = null;

	/**
	 * 入荷予定サービスを呼び出し、入荷予定を登録する
	 */
	protected void callArrSchdSrv(
			MCList<ShipAct_DtlR> dtlL, MCJoinKey<MCList<ShipAct_HdrR>> hdrJk, boolean isChk) {

		MCList<ShipAct_DtlR>
			arrSchdL = MCList.create(ShipAct_DtlR.class),
			delL = MCList.create(ShipAct_DtlR.class),
			insL = MCList.create(ShipAct_DtlR.class);
		for (ShipAct_DtlR r : dtlL) {
			ShipAct_HdrR hdrR = r.getJoinedRow(hdrJk);
			if (!isXfrOrProv(r)){
				continue;
			}
			else if (MAC_VIA_DLV_TYP.isVIA(hdrR.via_dlv_typ())) {
				// 配送先を経由する⇒入荷予定は輸出実績SVで作成する
				continue;
			}
			arrSchdL.add(r);

			// 入庫先を設定する
			if (hdrR.uplnd_flg()) {
				// 計画外は電文の納品先識別、納品棚・ライン
				r.arr_loc_cd(r.dlv_id_cd());
				r.arr_str_ln_cd(r.dlv_str_ln_cd());
			}
			else {
				// 移送、支給では送付先＝納品先であり、送付先はヘッダ項目なので１つに決まる
				// よって、先頭レコードから取得できる納品先識別、納品棚・ラインを入庫先とする
				MST_SHIP_ALLOC_STS_R allocR = getShipAllocStsL(r).get(0);
				r.arr_loc_cd(allocR.getString("dlv_id_cd"));
				r.arr_str_ln_cd(allocR.getString("dlv_str_ln_cd"));
			}

			if (MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
				// 訂正前の納品書明細を全件削除
				delL.add(r);
			}
			else if (MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ())) {
				// 全件追加
				insL.add(r);
			}
			else {
				if (!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					delL.add(r);
				}
				if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					insL.add(r);
				}
			}
		}
		if (arrSchdL.isEmpty())	return;


		// peg_no退避（入荷予定Svと粒度が異なるため）
		arrSchdL.forEach(r -> r.setNumberNE("__peg_no__", r.peg_no()));

		MCList<ArrPr_DtlR> prL = MCList.create(ArrPr_DtlR.class);
		MCList<ArrSchd_DtlR> schdL = MCList.create(ArrSchd_DtlR.class);
		int peg_no = 1;
		if (!delL.isEmpty()) {
			for (ShipAct_DtlR r : delL) {
				addAll(schdL, getShipActDL(r.ship_act_d_no()), createMap_ArrSchd_DtlR_ShipAct_DtlR_forDel());
			}
			// 重複分を除外する
			schdL = schdL.groupBy(ArrSchd_DtlR.$arr_pr_no, ArrSchd_DtlR.$arr_schd_no, ArrSchd_DtlR.$data_crud_typ);
			for (MCList<ArrSchd_DtlR> l : schdL.groupList(ArrSchd_DtlR.$arr_pr_no)) {
				l.setNumber(ArrSchd_DtlR.$peg_no, peg_no++);
				copy(prL.add(), l.get(0), createMap_ArrPr_DtlR_ArrSchd_DtlR_forDel());
			}
		}

		if (isChk) {
			if (!insL.isEmpty()) {
				// 支給予定キャッシュ
				doProvSchdCache(
					insL.subList(r -> MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ()))
				);
				// チェック処理の時は納品書明細でまとまってないので、そのままの粒度で実行する
				for (ShipAct_DtlR r : insL) {
					ShipAct_HdrR hdrR = r.getJoinedRow(hdrJk);
					copy(schdL.add(), r , hdrR, createMap_ArrSchd_DtlR_ShipAct_DtlR_forChk01());
				}
				setPegNo(schdL);
			}

			MSBEL_ArrSchdService.ArrSchd_Chk01 o = MSBEL_ArrSchdService.crtArrSchd_Chk01();
			o.up0().setAll(schdL);
			o.exec();
			copyErrFlg(arrSchdL, o.down0());
		}
		else {
			if (!insL.isEmpty()) {

				// 受払進捗管理NOをキャッシュ
				doSeqCache(MSC_NUM_SYS_TYP.IOSCHDPR, insL.size());
	
				// 入荷予定を作成する粒度
				MCGroupByPolicy p = new MCGroupByPolicy(_$arrSchdKey);
				p.sum(ShipAct_DtlR.$trd_unit_qty);
				p.sum(ShipAct_DtlR.$base_unit_qty);
	
				for (MCList<ShipAct_DtlR> lst : insL.groupList(ShipAct_DtlR.$dlv_slip_d_no)) {
					ShipAct_HdrR hdrR = lst.get(0).getJoinedRow(hdrJk);
					ShipAct_DtlR prR = lst.get(0).clone();
					prR.peg_no(peg_no++);	// Up0とUp1の紐付けの為、振り直し
					prR.trd_unit_qty(lst.sum(ShipAct_DtlR.$trd_unit_qty));
	
					// 入荷進捗は納品書明細NOの単位に作成する
					copy(prL.add(), prR, hdrR, createMap_ArrPr_DtlR_ShipAct_DtlR());

					for (MCList<ShipAct_DtlR> l : lst.groupList(_$arrSchdKey)) {
						l.sort(ShipAct_DtlR.$disp_seq);	// 入荷連絡備考は表示順の明細を採用
						ShipAct_DtlR r = l.get(0).clone();
						r.trd_unit_qty(l.sum(ShipAct_DtlR.$trd_unit_qty));
						r.base_unit_qty(l.sum(ShipAct_DtlR.$base_unit_qty));
						r.peg_no(prR.peg_no());

						copy(schdL.add(), r, hdrR, createMap_ArrSchd_DtlR_ShipAct_DtlR());
					}
				}
			}

			MSBEL_ArrSchdService.ArrSchd_Upd01 o = MSBEL_ArrSchdService.crtArrSchd_Upd01();
			o.up0().setAll(prL);
			o.up1().setAll(schdL);
			o.exec();

			// 後続の入荷実績SVで使用するため、発番された値を保持する
			_arrSchdRsltL = o.down0();
		}
		// peg_no復活
		arrSchdL.forEach(r -> r.peg_no(r.getNumberNE("__peg_no__")));
	}
	/**
	 * 入荷予定サービス(入荷進捗)削除用マッパー
	 */
	protected Map_ArrPr_DtlR_ArrSchd_DtlR_forDel<ArrPr_DtlR,ArrSchd_DtlR> createMap_ArrPr_DtlR_ArrSchd_DtlR_forDel() {
		return new Map_ArrPr_DtlR_ArrSchd_DtlR_forDel<ArrPr_DtlR, ArrSchd_DtlR>();
	}
	public class Map_ArrPr_DtlR_ArrSchd_DtlR_forDel<D extends ArrPr_DtlR, S extends ArrSchd_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.peg_no(src.peg_no());
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			dest.arr_pr_no(src.arr_pr_no());
		}
	}
	/**
	 * 入荷予定サービス(入荷進捗)作成用マッパー
	 */
	protected Map_ArrPr_DtlR_ShipAct_DtlR<ArrPr_DtlR,ShipAct_DtlR, ShipAct_HdrR> createMap_ArrPr_DtlR_ShipAct_DtlR() {
		return new Map_ArrPr_DtlR_ShipAct_DtlR<ArrPr_DtlR, ShipAct_DtlR, ShipAct_HdrR>();
	}
	public class Map_ArrPr_DtlR_ShipAct_DtlR<D extends ArrPr_DtlR, S extends ShipAct_DtlR, W extends ShipAct_HdrR> extends MAUCC_RowMapperWith<D,S,W>{
		protected ShipAct_HdrR _hdrR;
		@Override
		public void setWith(W hdrR) {
			_hdrR = hdrR;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ArrPr_DtlR.$peg_no, ShipAct_DtlR.$peg_no);
			addColumnPathMap(ArrPr_DtlR.$trd_cd, ShipAct_DtlR.$trd_cd);
			addColumnPathMap(ArrPr_DtlR.$trd_ptn_typ, ShipAct_DtlR.$trd_ptn_typ);
			addColumnPathMap(ArrPr_DtlR.$dlv_slip_d_no, ShipAct_DtlR.$dlv_slip_d_no);
			addColumnPathMap(ArrPr_DtlR.$trd_unit_qty, ShipAct_DtlR.$trd_unit_qty);
			addColumnPathMap(ArrPr_DtlR.$trd_unit_cd, ShipAct_DtlR.$trd_unit_cd);
			addColumnPathMap(ArrPr_DtlR.$rsn_cd, ShipAct_DtlR.$rsn_cd);
			addColumnPathMap(ArrPr_DtlR.$bd_dpt_cd, ShipAct_DtlR.$bd_dpt_cd);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			dest.rqst_dpt_cd(_hdrR.ship_dpt_cd());
			if (!isNull(_hdrR.ship_dpt_cd())) {
				dest.rqst_wg_cd(getDptR(_hdrR.ship_dpt_cd(), _hdrR.ac_dt()).wg_cd());
			}
			if (!isNull(dest.bd_dpt_cd())) {
				dest.bd_wg_cd(getDptR(dest.bd_dpt_cd(), _hdrR.ac_dt()).wg_cd());
			}
		}
	}
	/**
	 * 入荷予定サービス(入荷予定)削除用マッパー
	 */
	protected Map_ArrSchd_DtlR_ShipAct_DtlR_forDel<ArrSchd_DtlR,ShipAct_DtlR> createMap_ArrSchd_DtlR_ShipAct_DtlR_forDel() {
		return new Map_ArrSchd_DtlR_ShipAct_DtlR_forDel<ArrSchd_DtlR, ShipAct_DtlR>();
	}
	public class Map_ArrSchd_DtlR_ShipAct_DtlR_forDel<D extends ArrSchd_DtlR, S extends ShipAct_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void valueCopy(D dest, S src) {
			dest.peg_no(src.peg_no());
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			dest.arr_schd_no(src.getString("arr_schd_no"));
			dest.arr_pr_no(src.getString("arr_pr_no"));
			dest.trd_ptn_typ(src.trd_ptn_typ());
		}
	}
	/**
	 * 入荷予定サービス(入荷予定)作成用マッパー
	 */
	protected Map_ArrSchd_DtlR_ShipAct_DtlR<ArrSchd_DtlR,ShipAct_DtlR, ShipAct_HdrR> createMap_ArrSchd_DtlR_ShipAct_DtlR() {
		return new Map_ArrSchd_DtlR_ShipAct_DtlR<ArrSchd_DtlR, ShipAct_DtlR, ShipAct_HdrR>();
	}
	public class Map_ArrSchd_DtlR_ShipAct_DtlR<D extends ArrSchd_DtlR, S extends ShipAct_DtlR, W extends ShipAct_HdrR> extends MAUCC_RowMapperWith<D,S,W>{
		protected ShipAct_HdrR _hdrR;
		@Override
		public void setWith(W hdrR) {
			_hdrR = hdrR;
		}	@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ArrSchd_DtlR.$peg_no, ShipAct_DtlR.$peg_no);
			addColumnPathMap(ArrSchd_DtlR.$dlv_slip_no, ShipAct_DtlR.$dlv_slip_no);
			addColumnPathMap(ArrSchd_DtlR.$itm_cd, ShipAct_DtlR.$itm_cd);
			addColumnPathMap(ArrSchd_DtlR.$itm_sub1, ShipAct_DtlR.$itm_sub1);
			addColumnPathMap(ArrSchd_DtlR.$itm_sub2, ShipAct_DtlR.$itm_sub2);
			addColumnPathMap(ArrSchd_DtlR.$itm_sub3, ShipAct_DtlR.$itm_sub3);
			addColumnPathMap(ArrSchd_DtlR.$itm_nm, ShipAct_DtlR.$itm_nm);
			addColumnPathMap(ArrSchd_DtlR.$sundry_itm_flg, ShipAct_DtlR.$sundry_itm_flg);
			addColumnPathMap(ArrSchd_DtlR.$sno1, ShipAct_DtlR.$sno1);
			addColumnPathMap(ArrSchd_DtlR.$sno2, ShipAct_DtlR.$sno2);
			addColumnPathMap(ArrSchd_DtlR.$sno3, ShipAct_DtlR.$sno3);
			addColumnPathMap(ArrSchd_DtlR.$sno4, ShipAct_DtlR.$sno4);
			addColumnPathMap(ArrSchd_DtlR.$lot_no, ShipAct_DtlR.$lot_no);
			addColumnPathMap(ArrSchd_DtlR.$sublot_no, ShipAct_DtlR.$sublot_no);
			addColumnPathMap(ArrSchd_DtlR.$ver_no, ShipAct_DtlR.$ver_no);
			addColumnPathMap(ArrSchd_DtlR.$stk_arrv_bp_cd, ShipAct_DtlR.$stk_arrv_bp_cd);
			addColumnPathMap(ArrSchd_DtlR.$gd_cd, ShipAct_DtlR.$gd_cd);
			addColumnPathMap(ArrSchd_DtlR.$quality_typ, ShipAct_DtlR.$quality_typ);
			addColumnPathMap(ArrSchd_DtlR.$stk_id_typ, ShipAct_DtlR.$stk_id_typ);
			addColumnPathMap(ArrSchd_DtlR.$stk_bp_cd, ShipAct_DtlR.$stk_bp_cd);
			addColumnPathMap(ArrSchd_DtlR.$trd_unit_qty, ShipAct_DtlR.$trd_unit_qty);
			addColumnPathMap(ArrSchd_DtlR.$trd_unit_cd, ShipAct_DtlR.$trd_unit_cd);
			addColumnPathMap(ArrSchd_DtlR.$base_unit_qty, ShipAct_DtlR.$base_unit_qty);
			addColumnPathMap(ArrSchd_DtlR.$base_unit_cd, ShipAct_DtlR.$base_unit_cd);
			addColumnPathMap(ArrSchd_DtlR.$trd_ptn_typ, ShipAct_DtlR.$trd_ptn_typ);
			addColumnPathMap(ArrSchd_DtlR.$arr_cnt_rmrks, ShipAct_DtlR.$arr_cnt_rmrks);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			dest.arr_ptn_typ(MSC_ARR_PTN_TYP.NRML.value());
			dest.arr_schd_tm(_hdrR.dlv_tm());
			dest.arr_loc_cd(src.arr_loc_cd());
			dest.str_ln_cd(src.arr_str_ln_cd());
			dest.wg_cd(getLocR(dest.arr_loc_cd()).wg_cd());
			dest.io_schd_pr_no(getStrSeq(MSC_NUM_SYS_TYP.IOSCHDPR));
		}
	}
	protected Map_ArrSchd_DtlR_ShipAct_DtlR_forChk01<ArrSchd_DtlR,ShipAct_DtlR, ShipAct_HdrR> createMap_ArrSchd_DtlR_ShipAct_DtlR_forChk01() {
		return new Map_ArrSchd_DtlR_ShipAct_DtlR_forChk01<ArrSchd_DtlR, ShipAct_DtlR, ShipAct_HdrR>();
	}
	public class Map_ArrSchd_DtlR_ShipAct_DtlR_forChk01<D extends ArrSchd_DtlR, S extends ShipAct_DtlR, W extends ShipAct_HdrR> extends MAUCC_RowMapperWith<D,S,W>{
		protected ShipAct_HdrR _hdrR;
		@Override
		public void setWith(W hdrR) {
			_hdrR = hdrR;
		}	@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ArrSchd_DtlR.$peg_no, ShipAct_DtlR.$peg_no);
			addColumnPathMap(ArrSchd_DtlR.$trd_cd, ShipAct_DtlR.$trd_cd);
			addColumnPathMap(ArrSchd_DtlR.$trd_ptn_typ, ShipAct_DtlR.$trd_ptn_typ);
			addColumnPathMap(ArrSchd_DtlR.$itm_cd, ShipAct_DtlR.$itm_cd);
			addColumnPathMap(ArrSchd_DtlR.$itm_sub1, ShipAct_DtlR.$itm_sub1);
			addColumnPathMap(ArrSchd_DtlR.$itm_sub2, ShipAct_DtlR.$itm_sub2);
			addColumnPathMap(ArrSchd_DtlR.$itm_sub3, ShipAct_DtlR.$itm_sub3);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			dest.arr_schd_tm(_hdrR.dlv_tm());
			dest.arr_loc_cd(src.arr_loc_cd());
			dest.str_ln_cd(src.arr_str_ln_cd());
			dest.wg_cd(getLocR(dest.arr_loc_cd()).wg_cd());

			if (MAC_TRD_PTN_TYP.isPROV(src.trd_ptn_typ())) {
				MST_PROV_SCHD_R provR = getProvSchdR(src.ship_schd_no(), src.trd_ptn_typ());
				if (!isNull(provR)) {
					dest.prov_typ(provR.prov_typ());
					dest.prov_basis_typ(provR.prov_basis_typ());
					dest.xrate(provR.xrate());
					dest.ptax_xrate(provR.ptax_xrate());
					dest.trd_cur_cd(provR.trd_cur_cd());
					dest.tax_cd(provR.tax_cd());
					dest.trd_cur_upri(provR.trd_cur_upri());
				}
				dest.stk_id_typ(src.stk_id_typ());
				dest.stk_arrv_bp_cd(src.stk_arrv_bp_cd());
			}
		}
	}

	/**
	 * 移送、または支給で着荷要か判定する
	 */
	protected boolean isArr(ShipAct_HdrR hdrR, ShipAct_DtlR dtlR) {
		if (MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ())) {
			// 出荷先場所
			MAM_LOC_R toLocR = getLocR(dtlR.dlv_id_cd());
	
			// 以下のいずれかに該当する場合は、着荷要とみなす
			// ・配送先を経由する⇒着荷不要の入荷実績は輸出実績SVで作成する
			// ・出荷先が自社場所：工場・物流倉庫マスタ.着荷フラグがオン
			// ・出荷先が外注場所：取引先マスタ.支給積送管理区分が「着荷登録必要（積送：出荷側）」または「着荷登録必要（積送：入荷側）」
			if (MAC_VIA_DLV_TYP.isVIA(hdrR.via_dlv_typ())
				|| isNull(toLocR.sppl_cd()) && toLocR.getBoolean("arr_flg")
				|| !isNull(toLocR.sppl_cd()) && !MAC_PROV_RCV_TYP.isNOT_ARR(toLocR.getString("prov_rcv_typ"))) {
				// 着荷要
				return true;
			}
			else {
				// 着荷不要（出荷と同時に入荷実績を作成する）
				return false;
			}
		}
		else {
			// 同時計上＝着荷不要
			return !isSync(hdrR, dtlR);
		}
	}

	/**
	 * 同時計上で登録したか
	 */
	protected boolean isSync(ShipAct_HdrR hdrR, ShipAct_DtlR dtlR) {
		if (hdrR.uplnd_flg()) {
			return getShipActR(hdrR.ship_act_no()).getBoolean("sync_flg");
		}
		else {
			MCList<ShipAct_DtlR> actL = getShipActDLFromHdr(hdrR.ship_act_no()); 
			MCIndexKey idx = actL.createIndex(ShipAct_DtlR.$ship_alloc_sts_no);
			MCList<ShipAct_DtlR>
				l = actL
					.subList(idx, dtlR.ship_alloc_sts_no())
					.subList(r -> !isNull(r.ship_act_d_no()));
			return l.getBoolean(0, "sync_flg");
		}
	}

	/**
	 * 入荷実績サービスを呼び出し、入荷実績を削除する
	 */
	protected void callArrActSrvDel(
			MCList<ShipAct_DtlR> dtlL, MCJoinKey<MCList<ShipAct_HdrR>> hdrJk) {
		MCList<ShipAct_DtlR> arrSchdL = MCList.create(ShipAct_DtlR.class);
		for (ShipAct_DtlR r : dtlL) {
			ShipAct_HdrR hdrR = r.getJoinedRow(hdrJk);

			if (MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ())) {
				continue;	// 新規では実行しない
			}
			if (!isXfrOrProv(r) || isArr(hdrR, r)){
				continue;
			}
			arrSchdL.add(r);
		}
		if (arrSchdL.isEmpty())	return;

		MCList<ArrAct_DtlR> arrActL = MCList.create(ArrAct_DtlR.class);
		for (MCList<ShipAct_DtlR> lst : arrSchdL.groupList(ShipAct_DtlR.$hdr_peg_no)) {
			ShipAct_HdrR hdrR = lst.get(0).getJoinedRow(hdrJk);

			// 削除分を抽出
			if (MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
				addAll(arrActL, getShipActDLFromHdr(hdrR.ship_act_no()).subList(
					rr -> !isNull(rr.getString("arr_act_no"))), hdrR, createMap_ArrAct_DtlR_ShipAct_DtlR());
			}
			else {
				// 更新も削除＆新規で作成する
				for (ShipAct_DtlR r : lst.subList(r -> !MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()))) {
					addAll(arrActL, getShipActDL(r.ship_act_d_no()).subList(
						rr -> !isNull(rr.getString("arr_act_no"))), hdrR, createMap_ArrAct_DtlR_ShipAct_DtlR());
				}
			}
		}
		if (arrActL.isEmpty())	return;
		
		// 重複分を除外
		arrActL = arrActL.groupBy(
			ArrAct_DtlR.$data_crud_typ, ArrAct_DtlR.$arr_act_no, ArrAct_DtlR.$can_ac_dt);
		setPegNo(arrActL);
		MSBEL_ArrActService.ArrAct_Chk01 o1 = MSBEL_ArrActService.crtArrAct_Chk01();
		o1.up0().setAll(arrActL);
		int msgCnt = MCMessagePool.size();
		o1.exec();
		if (MCMessagePool.size() > msgCnt) {
			throwDelErr();
		}

		MSBEL_ArrActService.ArrAct_Upd01 o2 = MSBEL_ArrActService.crtArrAct_Upd01();
		o2.up1().setAll(arrActL);
		o2.exec();
	}

	/**
	 * 入荷実績サービスを実行し、入荷実績を登録する
	 */
	protected void callArrActSrvUpd(
			MCList<ShipAct_HdrR> hdrL, MCList<ShipAct_DtlR> dtlL, MCJoinKey<MCList<ShipAct_HdrR>> hdrJk) {
		if (isNull(_arrSchdRsltL)) {
			// チェック処理では実行しない
			return;
		}

		MCList<ArrAct_DtlR> arrActL = MCList.create(ArrAct_DtlR.class);
		// 新規または更新分
		// 入荷予定サービスの下り電文を利用して、更新対象（同時作成した入荷予定）を取得する
		MCList<MST_ARR_SCHD_R> dbc = MCList.create(MST_ARR_SCHD_R.class);
		MST_ARR_SCHD_R t = MST_ARR_SCHD_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MST_ARR_PR_R t1 = MST_ARR_PR_R.create("T1");
		MAM_ITM_R m1 = MAM_ITM_R.create("M1");
		dbc_bldr.setSelectAll();
		dbc_bldr.addSelect(t1.dlv_slip_d_no, t1.trd_cd, t1.trd_ptn_typ, t1.rsn_cd,
				t1.bd_dpt_cd, t1.bd_wg_cd, m1.stk_mng_typ, m1.sno1_mng_typ,
				m1.sno2_mng_typ, m1.sno3_mng_typ, m1.sno4_mng_typ);
		dbc_bldr.addInnerJoin(t1, bracket(t1.arr_pr_no.eq(t.arr_pr_no)));
		dbc_bldr.addLeftOuterJoin(m1,
				bracket(m1.itm_cd.eq(t.itm_cd)
						.and(m1.itm_sub1.eq(t.itm_sub1))
						.and(m1.itm_sub2.eq(t.itm_sub2))
						.and(m1.itm_sub3.eq(t.itm_sub3))));
		dbSelectKey("MSBEL5540_MST_ARR_SCHD_S03", dbc, dbc_bldr, _arrSchdRsltL);

		MCIndexKey idx = dbc.createIndex("dlv_slip_no");
		for (MCList<ShipAct_DtlR> grpL : dtlL.groupList("dlv_slip_no")) {
			ShipAct_DtlR r = grpL.get(0);
			ShipAct_HdrR hdrR = r.getJoinedRow(hdrJk);
			if (!isArr(hdrR, r)) {	// 着荷不要のみ
				addAll(
					arrActL, dbc.subList(idx, r.dlv_slip_no()),
					hdrR, createMap_ArrAct_DtlR_MST_ARR_SCHD_R());
			}
		}
		if (!arrActL.isEmpty()) {
			setPegNo(arrActL);
			MSBEL_ArrActService.ArrAct_Chk01 o1 = MSBEL_ArrActService.crtArrAct_Chk01();
			o1.up0().setAll(arrActL);
			int msgCnt = MCMessagePool.size();
			o1.exec();
			if (MCMessagePool.size() > msgCnt) {
				throwUpdErr();
			}

			MSBEL_ArrActService.ArrAct_Upd01 o2 = MSBEL_ArrActService.crtArrAct_Upd01();
			o2.up1().setAll(arrActL);
			o2.exec();
		}
	}
	protected Map_ArrAct_DtlR_MST_ARR_SCHD_R<ArrAct_DtlR,MST_ARR_SCHD_R,ShipAct_HdrR> createMap_ArrAct_DtlR_MST_ARR_SCHD_R() {
		return new Map_ArrAct_DtlR_MST_ARR_SCHD_R<ArrAct_DtlR, MST_ARR_SCHD_R,ShipAct_HdrR>();
	}
	public class Map_ArrAct_DtlR_MST_ARR_SCHD_R<D extends ArrAct_DtlR, S extends MST_ARR_SCHD_R, W extends ShipAct_HdrR> extends MAUCC_RowMapperWith<D,S,W>{
		protected ShipAct_HdrR _hdrR;
		@Override
		public void setWith(W hdrR) {
			_hdrR = hdrR;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ArrAct_DtlR.$arr_schd_no, MST_ARR_SCHD_R.$arr_schd_no);
			addColumnPathMap(ArrAct_DtlR.$itm_cd, MST_ARR_SCHD_R.$itm_cd);
			addColumnPathMap(ArrAct_DtlR.$itm_sub1, MST_ARR_SCHD_R.$itm_sub1);
			addColumnPathMap(ArrAct_DtlR.$itm_sub2, MST_ARR_SCHD_R.$itm_sub2);
			addColumnPathMap(ArrAct_DtlR.$itm_sub3, MST_ARR_SCHD_R.$itm_sub3);
			addColumnPathMap(ArrAct_DtlR.$itm_nm, MST_ARR_SCHD_R.$itm_nm);
			addColumnPathMap(ArrAct_DtlR.$sundry_itm_flg, MST_ARR_SCHD_R.$sundry_itm_flg);
			addColumnPathMap(ArrAct_DtlR.$sno1, MST_ARR_SCHD_R.$sno1);
			addColumnPathMap(ArrAct_DtlR.$sno2, MST_ARR_SCHD_R.$sno2);
			addColumnPathMap(ArrAct_DtlR.$sno3, MST_ARR_SCHD_R.$sno3);
			addColumnPathMap(ArrAct_DtlR.$sno4, MST_ARR_SCHD_R.$sno4);
			addColumnPathMap(ArrAct_DtlR.$lot_no, MST_ARR_SCHD_R.$lot_no);
			addColumnPathMap(ArrAct_DtlR.$sublot_no, MST_ARR_SCHD_R.$sublot_no);
			addColumnPathMap(ArrAct_DtlR.$ver_no, MST_ARR_SCHD_R.$ver_no);
			addColumnPathMap(ArrAct_DtlR.$stk_arrv_bp_cd, MST_ARR_SCHD_R.$stk_arrv_bp_cd);
			addColumnPathMap(ArrAct_DtlR.$gd_cd, MST_ARR_SCHD_R.$gd_cd);
			addColumnPathMap(ArrAct_DtlR.$quality_typ, MST_ARR_SCHD_R.$quality_typ);
			addColumnPathMap(ArrAct_DtlR.$stk_insp_typ, MST_ARR_SCHD_R.$stk_insp_typ);
			addColumnPathMap(ArrAct_DtlR.$stk_id_typ, MST_ARR_SCHD_R.$stk_id_typ);
			addColumnPathMap(ArrAct_DtlR.$stk_bp_cd, MST_ARR_SCHD_R.$stk_bp_cd);
			addColumnPathMap(ArrAct_DtlR.$arr_loc_cd, MST_ARR_SCHD_R.$arr_loc_cd);
			addColumnPathMap(ArrAct_DtlR.$str_ln_cd, MST_ARR_SCHD_R.$str_ln_cd);
			addColumnPathMap(ArrAct_DtlR.$trd_unit_qty, MST_ARR_SCHD_R.$trd_unit_qty);
			addColumnPathMap(ArrAct_DtlR.$trd_unit_cd, MST_ARR_SCHD_R.$trd_unit_cd);
			addColumnPathMap(ArrAct_DtlR.$base_unit_qty, MST_ARR_SCHD_R.$base_unit_qty);
			addColumnPathMap(ArrAct_DtlR.$base_unit_cd, MST_ARR_SCHD_R.$base_unit_cd);
			addColumnPathMap(ArrAct_DtlR.$arr_pr_no, MST_ARR_SCHD_R.$arr_pr_no);
			addColumnPathMap(ArrAct_DtlR.$iv_no, MST_ARR_SCHD_R.$iv_no);
			addColumnPathMap(ArrAct_DtlR.$arr_ptn_typ, MST_ARR_SCHD_R.$arr_ptn_typ);
			addColumnPathMap(ArrAct_DtlR.$io_schd_pr_no, MST_ARR_SCHD_R.$io_schd_pr_no);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			dest.trd_cd(src.getString("trd_cd"));
			dest.trd_ptn_typ(src.getString("trd_ptn_typ"));
			dest.stk_mng_typ(src.getString("stk_mng_typ"));
			dest.sno1_mng_typ(src.getString("sno1_mng_typ"));
			dest.sno2_mng_typ(src.getString("sno2_mng_typ"));
			dest.sno3_mng_typ(src.getString("sno3_mng_typ"));
			dest.sno4_mng_typ(src.getString("sno4_mng_typ"));
			dest.arr_tm(_hdrR.dlv_tm());
			dest.ac_dt(_hdrR.ac_dt());
			dest.can_ac_dt(_hdrR.can_ac_dt());
			dest.rsn_cd(src.getString("rsn_cd"));
			dest.bd_dpt_cd(src.getString("bd_dpt_cd"));
			dest.bd_wg_cd(src.getString("bd_wg_cd"));
		}
	}
	protected Map_ArrAct_DtlR_ShipAct_DtlR<ArrAct_DtlR,ShipAct_DtlR,ShipAct_HdrR> createMap_ArrAct_DtlR_ShipAct_DtlR() {
		return new Map_ArrAct_DtlR_ShipAct_DtlR<ArrAct_DtlR, ShipAct_DtlR, ShipAct_HdrR>();
	}
	public class Map_ArrAct_DtlR_ShipAct_DtlR<D extends ArrAct_DtlR, S extends ShipAct_DtlR, W extends ShipAct_HdrR> extends MAUCC_RowMapperWith<D,S,W>{
		protected ShipAct_HdrR _hdrR;
		@Override
		public void setWith(W hdrR) {
			_hdrR = hdrR;
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			dest.arr_act_no(src.getString("arr_act_no"));
			dest.can_ac_dt(_hdrR.can_ac_dt());
		}
	}

	/**
	 * 売上予定(実績)サービスの処理対象を取得する
	 */
	protected MCList<ShipAct_DtlR> getSlsSrvL(
		ShipAct_HdrR hdrR, MCList<ShipAct_DtlR> dtlL, boolean isActL) {

		MCList<ShipAct_DtlR>
			slsL = dtlL.subList(ShipAct_DtlR.$trd_ptn_typ, MAC_TRD_PTN_TYP.SLS.value()),
			slsSchdL = MCList.create(ShipAct_DtlR.class),
			slsActL = MCList.create(ShipAct_DtlR.class),
			emptyL = MCList.create(ShipAct_DtlR.class);

		if ((MAC_VIA_DLV_TYP.isVIA(hdrR.via_dlv_typ()) && (!hdrR.uplnd_flg() || isActL)) || slsL.isEmpty()) {
			return emptyL;
		}
		else if (!isNull(hdrR.iv_no()) && !isActL) {
			// インボイス単位出荷、かつ配送先経由しない場合、売上予定の売上計上可能フラグを更新する
			return slsL;
		}

		// 売上実績サービスからの呼び出しの場合、売上実績作成フラグ、納品伝票作成フラグともにオフが設定される
		if (!hdrR.sls_act_flg() && !hdrR.dlv_slip_flg()) {
			if (hdrR.sls_dtl_mod_flg() && hdrR.uplnd_flg() && !isActL) {
				// 売上明細訂正画面で訂正した場合、売上予定を更新する（電文が分割された場合、納品書ＮＯを売上予定に反映する）
				for (ShipAct_DtlR r : slsL) {
					ShipAct_HdrR actHR = null;
					if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
						actHR = getShipActR(hdrR.ref_ship_act_no());
					}
					else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
						actHR = getShipActR(hdrR.ship_act_no());
					}
					if (!isNull(actHR) && actHR.sync_flg()) {
						// 同時計上の場合のみ売上予定を削除・登録する
						slsSchdL.add(r);
					}
				}
				return slsSchdL;
			}
			if (hdrR.uplnd_iv_sls_flg()) {
				// 計画外インボイス取引売上の場合、出荷時に売上予定を作成する。
				return isActL ?  emptyL : slsL;
			}
			if (hdrR.uplnd_flg()) {
				return emptyL;
			}
			for (ShipAct_DtlR r : slsL) {
				MST_SHIP_ALLOC_STS_R sasR = getShipAllocStsR(r);
				// インボイス取引対象、または仕入直送の場合は出荷実績から実行しない
				if (sasR.getBoolean("cst_iv_flg")
					|| sasR.getBoolean("purc_ddlv_flg")) {
					continue;
				}
				slsSchdL.add(r);
			}
		}
		else {
			if (hdrR.uplnd_flg()) {
				slsSchdL.setAll(slsL);
				// 先に計画外を判定しているので、２つ目の引数がnullでも問題ない
				if (hdrR.sls_act_flg() && isSlsShipBasis(hdrR, null)) {
					slsActL.setAll(slsL);
				}
			}
			else {
				for (ShipAct_DtlR r : slsL) {
					MST_SHIP_ALLOC_STS_R sasR = getShipAllocStsR(r);
					// 仕入直送、または預り売上の場合は出荷実績から実行しない
					if (sasR.getBoolean("purc_ddlv_flg")
						|| MSC_STK_ID_TYP.isCSTSTK(r.stk_id_typ())
							 && sasR.getNumber("sls_qty").isPositive()) {
						continue;
					}
					// インボイス取引対象は売上予定は作成しない
					// ただし、出荷基準の場合、売上実績は作成する
					if (!sasR.getBoolean("cst_iv_flg")) {
						slsSchdL.add(r);
					}
					if (hdrR.sls_act_flg() && isSlsShipBasis(hdrR, r)) {
						slsActL.add(r);
					}
				}
			}
		}
		return isActL ?  slsActL : slsSchdL;
	}

	/**
	 * 売上計上区分が「出荷基準」かを判定する
	 */
	protected boolean isSlsShipBasis(ShipAct_HdrR hdrR, ShipAct_DtlR dtlR) {
		if (MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ())) {
			if (hdrR.uplnd_flg()) {
				return
					MAC_SLS_BASIS_TYP.isSHIP_BASIS(
						nvl(getBpR(hdrR.cst_cd()).sls_basis_typ(), getCo().sls_basis_typ()));
			}
			else {
				MST_SHIP_ALLOC_STS_R sasR = getShipAllocStsR(dtlR);
				return MAC_SLS_BASIS_TYP.isSHIP_BASIS(sasR.getString("sls_basis_typ"));
			}
		}
		else {
			return isSync(hdrR, dtlR);
		}
	}

	/**
	 * 売上予定サービス（Sls_Schd_Upd01）のキー
	 */
	protected String[] _$sls_schd_upd01_key = {
		ShipAct_DtlR.$dlv_slip_d_no
	};
	/**
	 * 売上予定サービス（Sls_Schd_Upd02）のキー
	 */
	protected String[] _$sls_schd_upd02_key = {
		ShipAct_DtlR.$ship_schd_no,
		ShipAct_DtlR.$dlv_slip_d_no,
		ShipAct_DtlR.$slo_d_no
	};
	protected String[] _$sls_schd_upd02_key2 = {
		ShipAct_DtlR.$ship_schd_no,
		ShipAct_DtlR.$ship_act_d_no,
		ShipAct_DtlR.$data_crud_typ
	};
	/**
	 * 売上予定サービスを呼び出し、売上予定を更新する
	 */
	protected void callSlsSchdSrv(
			MCList<ShipAct_HdrR> hdrL, MCJoinKey<MCList<ShipAct_DtlR>> dtlJk) {

		MSBBL_SlsSchdService.Sls_Schd_Upd01 upd01 = MSBBL_SlsSchdService.crtSls_Schd_Upd01();
		MSBBL_SlsSchdService.Sls_Schd_Upd02 upd02 = MSBBL_SlsSchdService.crtSls_Schd_Upd02();
		MSBBL_SlsSchdService.Sls_Schd_Upd05 upd05 = MSBBL_SlsSchdService.crtSls_Schd_Upd05();

		for (ShipAct_HdrR hdrR : hdrL) {
			MCList<ShipAct_DtlR>
				slsL = getSlsSrvL(hdrR, hdrR.getJoined(dtlJk), false),
				updL = MCList.create(ShipAct_DtlR.class);

			// 更新対象、打切、打切解除の明細のみ抽出
			for (ShipAct_DtlR r : slsL) {
				// 更新対象または打切
				if (!r.non_upd_flg() || r.abort_flg()) {
					updL.add(r);
				}
				else if (!hdrR.uplnd_flg()) {
					MST_SHIP_ALLOC_STS_R sasR = getShipAllocStsR(r);
					// 打切解除
					if (sasR.getBoolean("abort_flg")) {
						updL.add(r);
					}
				}
			}
			if (!updL.isEmpty()) {
				if (hdrR.uplnd_flg()) {
					// 渡すリストは更新対象のみ
					setSlsSchdSrvForUplnd(hdrR, updL, upd01);
				}
				else if (!isNull(hdrR.iv_no())) {
					setSlsSchdSrvForIv(hdrR, upd05);
				}
				else {
					// updL：更新対象、および打切、打切解除を含めたリスト
					// slsL： 更新対象外も含む全明細のリスト
					setSlsSchdSrvForPlnd(hdrR, updL, slsL, upd02);
				}
			}
		}
		if (!upd01.up0().isEmpty()) {
			upd01.exec();
		}
		if (!upd02.up0().isEmpty()) {
			// 売上予定サービス電文再編集
			adjUpd02(upd02, hdrL);
			upd02.exec();
		}
		if (!upd05.up0().isEmpty()) {
			upd05.exec();
		}
	}
	
	protected void adjUpd02(MSBBL_SlsSchdService.Sls_Schd_Upd02 o, MCList<ShipAct_HdrR> hdrL) {
		// 売上明細訂正登録以外は処理しない
		if (!hdrL.isEmpty() && !hdrL.get(0).sls_dtl_mod_flg()) {
			return;
		}
		
		MSBBL_SlsSchdService.Sls_Schd_Upd02 newUpd02 = MSBBL_SlsSchdService.crtSls_Schd_Upd02();
		MCIndexKey idxKey = o.up0().createIndex(Sls_Schd_Upd02_DtlR.$data_crud_typ, Sls_Schd_Upd02_DtlR.$ship_schd_no, Sls_Schd_Upd02_DtlR.$slo_d_no);
		
		// 売上予定サービスへの電文再編集
		for (Sls_Schd_Upd02_DtlR up0R : o.up0()) {
			// 「削除」と同一キーで「新規」がある場合（伝票分割が発生する場合）、「削除」を電文に追加
			// それ以外の場合、「削除」は電文から除外
			if (MAC_DATA_CRUD_TYP.isDEL(up0R.data_crud_typ())) {
				Sls_Schd_Upd02_DtlR insR = o.up0().getFirst(idxKey, MAC_DATA_CRUD_TYP.CRT.value(), up0R.ship_schd_no(), up0R.slo_d_no());
				if (!isNull(insR)) {
					newUpd02.up0().add(up0R);
				}
			}
			else {
				newUpd02.up0().add(up0R);
			}
		}
		o.up0().clear();
		o.up0().addAll(newUpd02.up0());
	}
	
	/**
	 * 売上予定サービスを実行する。（インボイス取引かつインボイス単位出荷ではない）
	 */
	protected void callSlsSchdSrvForIv(
			MCList<ShipAct_DtlR> dtlL, MCJoinKey<MCList<ShipAct_HdrR>> hdrJk) {
		
		MSBBL_SlsSchdService.Sls_Schd_Upd05 ope = MSBBL_SlsSchdService.crtSls_Schd_Upd05();
		
		MCList<ShipAct_DtlR> shipActL = MCList.create(ShipAct_DtlR.class);

		for (ShipAct_DtlR r : dtlL) {
			ShipAct_HdrR hdrR = r.getJoinedRow(hdrJk);
			if (hdrR.uplnd_flg() || !isNull(hdrR.iv_no())) {
				// 計画外、またはインボイス単位出荷の場合に売上予定を実行しない
				continue ;
			}
			
			MST_SHIP_ALLOC_STS_R sasR = getShipAllocStsR(r);
			
			// 「売上」以外、仕入直送、売上済の預り売上は対象外
			if (!MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ())
				|| sasR.getBoolean("purc_ddlv_flg")
				|| !sasR.getBoolean("cst_iv_flg")
				|| (MSC_STK_ID_TYP.isCSTSTK(r.stk_id_typ())
						&& sasR.getNumber("sls_qty").isPositive())) {
				continue;
			}
			
			shipActL.add(r);
		}
		
		Sls_Schd_Upd05_DtlR upR = null;
		
		for (ShipAct_DtlR r : shipActL.groupBy(ShipAct_DtlR.$slo_d_no)) {
			
			upR = Sls_Schd_Upd05_DtlR.create();
			
			upR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			upR.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.SLO_D.value());
			upR.slo_d_no(r.slo_d_no());
			
			ope.up0().add(upR);
		}
			
		if (!ope.up0().isEmpty()) {
			ope.exec();
		}
	}
	
	protected void setSlsSchdSrvForIv(
			ShipAct_HdrR hdrR, MSBBL_SlsSchdService.Sls_Schd_Upd05 o) {
		copy(o.up0().add(), hdrR, createMap_Sls_Schd_Upd05_DtlR_ShipAct_HdrR());
	}
	protected void setSlsSchdSrvForPlnd(
			ShipAct_HdrR hdrR, MCList<ShipAct_DtlR> tgtL, MCList<ShipAct_DtlR> dtlL, MSBBL_SlsSchdService.Sls_Schd_Upd02 o) {
		MCList<Sls_Schd_Upd02_DtlR> upL = MCList.create(Sls_Schd_Upd02_DtlR.class);
		MCList<Sls_Schd_Upd02_ShipActR> up2L = MCList.create(Sls_Schd_Upd02_ShipActR.class);
		MCList<ShipAct_DtlR>
			delL = MCList.create(ShipAct_DtlR.class),
			updL = MCList.create(ShipAct_DtlR.class),
			insL = MCList.create(ShipAct_DtlR.class);
		if (MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
			// 訂正前の納品書明細を全件削除
			delL.addAll(tgtL);
		}
		else if (MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ())) {
			// 全件追加
			insL.addAll(tgtL);
		}
		else {

			// 変更前のリストと比較して新規か更新かを設定する
			MCList<ShipAct_DtlR>
				orgL = MCList.create(ShipAct_DtlR.class);
				tgtL = tgtL.subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));

			// 変更前のリストから更新対象外の分を除外する
			MCIndexKey dtlIdx = dtlL.createIndex(ShipAct_DtlR.$ship_act_d_no);
			for (ShipAct_DtlR actR : getShipActDLFromHdr(hdrR.ship_act_no())) {
				ShipAct_DtlR dtlR = dtlL.getFirst(dtlIdx, actR.ship_act_d_no());
				if (!isNull(dtlR) && dtlR.non_upd_flg()) {
					MST_SHIP_ALLOC_STS_R allocR = getShipAllocStsR(actR);
					if ( !(dtlR.abort_flg() || allocR.getBoolean("abort_flg")) ) {
						// 打切、打切解除を除く更新対象外を除外
						continue;
					}
				}
				ShipAct_DtlR orgR = orgL.add();
				MCRow.copyall(orgR, actR);

				// 予定情報を補完
				MST_SHIP_ALLOC_STS_R allocR = getShipAllocStsR(actR);
				orgR.ship_schd_no(allocR.ship_schd_no());
				orgR.slo_d_no(allocR.getString("slo_d_no"));
			}
			orgL = getSlsSrvL(hdrR, orgL, false);

			MCIndexKey idx = orgL.createIndex(_$sls_schd_upd02_key);
			for (MCList<ShipAct_DtlR> lst : tgtL.groupList(_$sls_schd_upd02_key)) {
				ShipAct_DtlR r = lst.get(0);

				ShipAct_DtlR orgR = orgL.getFirst(idx, r.toArray(_$sls_schd_upd02_key));
				if (isNull(orgR)) {
					// 変更前のリストに存在しない→新規
					insL.addAll(lst);
				}
				else {
					// 変更前のリストに存在する→更新
					updL.addAll(lst);
				}
			}

			// 変更前のリストから削除されているか
			idx = tgtL.createIndex(_$sls_schd_upd02_key);
			for (MCList<ShipAct_DtlR> lst : orgL.groupList(_$sls_schd_upd02_key)) {
				ShipAct_DtlR r = lst.get(0);

				ShipAct_DtlR tgtR = tgtL.getFirst(idx, r.toArray(_$sls_schd_upd02_key));
				if (isNull(tgtR)) {
					// 変更後のリストに存在しない→削除
					delL.addAll(lst);
				}
			}
		}
		if (!delL.isEmpty()) {
			// 納品書明細NOで重複を除外
			Map_Sls_Schd_Upd02_DtlR_ShipAct_DtlR_forDel
				<Sls_Schd_Upd02_DtlR, ShipAct_DtlR, ShipAct_HdrR> mpr = createMap_Sls_Schd_Upd02_DtlR_ShipAct_DtlR_forDel();
			for (MCList<ShipAct_DtlR> grpL : delL.groupList(_$sls_schd_upd02_key)) {
				copy(upL.add(), grpL.get(0), hdrR, mpr);
			}
		}
		if (!insL.isEmpty()) {
			// 納品書明細NOでサマリして設定する
			Map_Sls_Schd_Upd02_DtlR_ShipAct_DtlR
				<Sls_Schd_Upd02_DtlR, ShipAct_DtlR, ShipAct_HdrR> mpr = createMap_Sls_Schd_Upd02_DtlR_ShipAct_DtlR();
			for (MCList<ShipAct_DtlR> grpL : insL.groupList(_$sls_schd_upd02_key)) {
				ShipAct_DtlR r = grpL.get(0).clone();
				r.trd_unit_qty(grpL.sum(ShipAct_DtlR.$trd_unit_qty));
				r.base_unit_qty(grpL.sum(ShipAct_DtlR.$base_unit_qty));
				copy(upL.add(), r, hdrR, mpr);
			}
		}
		if (!updL.isEmpty()) {
			// 納品書明細NOでサマリして設定する
			Map_Sls_Schd_Upd02_DtlR_ShipAct_DtlR_forUpd
				<Sls_Schd_Upd02_DtlR, ShipAct_DtlR, ShipAct_HdrR> mpr = createMap_Sls_Schd_Upd02_DtlR_ShipAct_DtlR_forUpd();
			for (MCList<ShipAct_DtlR> grpL : updL.groupList(_$sls_schd_upd02_key)) {
				ShipAct_DtlR r = grpL.get(0).clone();
				r.trd_unit_qty(grpL.sum(ShipAct_DtlR.$trd_unit_qty));
				r.base_unit_qty(grpL.sum(ShipAct_DtlR.$base_unit_qty));
				copy(upL.add(), r, hdrR, mpr);
			}
		}
		addAll(up2L, tgtL.groupBy(_$sls_schd_upd02_key2), createMap_Sls_Schd_Upd02_ShipActR_ShipAct_DtlR());

		if (hdrR.sls_dtl_mod_flg()) {
			// 売上明細訂正画面で訂正した場合、売上実績サービスで与信を算出するため、与信を計算しないように設定
			upL.setValueNE(Sls_Schd_Upd02_DtlR.$cred_no_up_flg, true);
		}
		o.up0().addAll(upL);
		o.up1().addAll(up2L);
	}
	protected void setSlsSchdSrvForUplnd(
			ShipAct_HdrR hdrR, MCList<ShipAct_DtlR> dtlL, MSBBL_SlsSchdService.Sls_Schd_Upd01 o) {
		MCList<Sls_Schd_Upd01_DtlR> upL = MCList.create(Sls_Schd_Upd01_DtlR.class);
		MCList<ShipAct_DtlR>
			delL = MCList.create(ShipAct_DtlR.class), insL = MCList.create(ShipAct_DtlR.class);
		if (MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
			// 訂正前の納品書明細を全件削除
			delL.addAll(dtlL);
		}
		else if (MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ())) {
			// 全件追加
			insL.addAll(dtlL);
		}
		else {
			delL.addAll(dtlL.subList(r ->!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())));
			insL.addAll(dtlL.subList(r ->!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())));
		}
		if (!delL.isEmpty()) {
			// 納品書明細NOで重複を除外
			Map_Sls_Schd_Upd01_DtlR_ShipAct_DtlR_forDel
				<Sls_Schd_Upd01_DtlR, ShipAct_DtlR> mpr = createMap_Sls_Schd_Upd01_DtlR_ShipAct_DtlR_forDel();
			for (MCList<ShipAct_DtlR> grpL : delL.groupList(_$sls_schd_upd01_key)) {
				copy(upL.add(), grpL.get(0), mpr);
			}
		}
		if (!insL.isEmpty()) {
			// 納品書明細NOでサマリして設定する
			Map_Sls_Schd_Upd01_DtlR_ShipAct_DtlR
				<Sls_Schd_Upd01_DtlR, ShipAct_DtlR, ShipAct_HdrR> mpr = createMap_Sls_Schd_Upd01_DtlR_ShipAct_DtlR();
			for (MCList<ShipAct_DtlR> grpL : insL.groupList(_$sls_schd_upd01_key)) {
				ShipAct_DtlR r = grpL.get(0).clone();
				r.trd_unit_qty(grpL.sum(ShipAct_DtlR.$trd_unit_qty));
				r.base_unit_qty(grpL.sum(ShipAct_DtlR.$base_unit_qty));
				copy(upL.add(), r, hdrR, mpr);
			}
		}
		if (hdrR.sls_dtl_mod_flg()) {
			// 売上明細訂正画面で訂正した場合、売上実績サービスで与信を算出するため、与信を計算しないように設定
			upL.setValueNE(Sls_Schd_Upd01_DtlR.$cred_no_up_flg, true);
		}
		if (hdrR.uplnd_iv_sls_flg()) {
			// 計画外インボイス取引売上の場合、売上実績サービスで与信を算出するため、与信を計算しないように設定
			upL.setValueNE(Sls_Schd_Upd01_DtlR.$cred_no_up_flg, true);
		}
		o.up0().addAll(upL);
	}
	/**
	 * 売上予定(計画外)削除用マッパー
	 * @return
	 */
	protected Map_Sls_Schd_Upd01_DtlR_ShipAct_DtlR_forDel<Sls_Schd_Upd01_DtlR,ShipAct_DtlR> createMap_Sls_Schd_Upd01_DtlR_ShipAct_DtlR_forDel() {
		return new Map_Sls_Schd_Upd01_DtlR_ShipAct_DtlR_forDel<Sls_Schd_Upd01_DtlR, ShipAct_DtlR>();
	}
	public class Map_Sls_Schd_Upd01_DtlR_ShipAct_DtlR_forDel<D extends Sls_Schd_Upd01_DtlR, S extends ShipAct_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void valueCopy(D dest, S src) {
			dest.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.SHIP_ACT_D.value());
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			dest.dlv_slip_d_no(src.dlv_slip_d_no());
		}
	}
	/**
	 * 売上予定(計画外)作成用マッパー
	 * @return
	 */
	protected Map_Sls_Schd_Upd01_DtlR_ShipAct_DtlR<Sls_Schd_Upd01_DtlR,ShipAct_DtlR,ShipAct_HdrR> createMap_Sls_Schd_Upd01_DtlR_ShipAct_DtlR() {
		return new Map_Sls_Schd_Upd01_DtlR_ShipAct_DtlR<Sls_Schd_Upd01_DtlR, ShipAct_DtlR,ShipAct_HdrR>();
	}
	public class Map_Sls_Schd_Upd01_DtlR_ShipAct_DtlR<D extends Sls_Schd_Upd01_DtlR, S extends ShipAct_DtlR, W extends ShipAct_HdrR> extends MAUCC_RowMapperWith<D,S,W>{
		protected ShipAct_HdrR _hdrR;
		@Override
		public void setWith(W hdrR) {
			_hdrR = hdrR;
		}
		@Override
		protected void valueCopy(D dest, S src) {
			dest.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.SHIP_ACT_D.value());
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			dest.dlv_slip_d_no(src.dlv_slip_d_no());
			if (isSlsShipBasis(_hdrR, src)) {
				dest.sls_schd_dt(_hdrR.ship_tm().trunc(MCDateFieldType.DAY));
			}
			else {
				dest.sls_schd_dt(_hdrR.dlv_tm().trunc(MCDateFieldType.DAY));
			}
			dest.trd_unit_cd(src.trd_unit_cd());
			dest.trd_unit_qty(src.trd_unit_qty());
			dest.base_unit_cd(src.base_unit_cd());
			dest.base_unit_qty(src.base_unit_qty());
		}
	}
	/**
	 * 売上予定削除用マッパー
	 * @return
	 */
	protected Map_Sls_Schd_Upd02_DtlR_ShipAct_DtlR_forDel<Sls_Schd_Upd02_DtlR,ShipAct_DtlR, ShipAct_HdrR> createMap_Sls_Schd_Upd02_DtlR_ShipAct_DtlR_forDel() {
		return new Map_Sls_Schd_Upd02_DtlR_ShipAct_DtlR_forDel<Sls_Schd_Upd02_DtlR, ShipAct_DtlR, ShipAct_HdrR>();
	}
	public class Map_Sls_Schd_Upd02_DtlR_ShipAct_DtlR_forDel<D extends Sls_Schd_Upd02_DtlR, S extends ShipAct_DtlR, W extends ShipAct_HdrR> extends MAUCC_RowMapperWith<D,S,W>{
		protected ShipAct_HdrR _hdrR;
		@Override
		public void setWith(W hdrR) {
			_hdrR = hdrR;
		}
		@Override
		protected void valueCopy(D dest, S src) {
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			dest.ship_schd_no(src.ship_schd_no());
			dest.dlv_slip_d_no(src.dlv_slip_d_no());
			dest.slo_d_no(src.slo_d_no());
		}
	}
	/**
	 * 売上予定作成用マッパー
	 * @return
	 */
	protected Map_Sls_Schd_Upd02_DtlR_ShipAct_DtlR<Sls_Schd_Upd02_DtlR,ShipAct_DtlR, ShipAct_HdrR> createMap_Sls_Schd_Upd02_DtlR_ShipAct_DtlR() {
		return new Map_Sls_Schd_Upd02_DtlR_ShipAct_DtlR<Sls_Schd_Upd02_DtlR, ShipAct_DtlR, ShipAct_HdrR>();
	}
	public class Map_Sls_Schd_Upd02_DtlR_ShipAct_DtlR<D extends Sls_Schd_Upd02_DtlR, S extends ShipAct_DtlR, W extends ShipAct_HdrR> extends MAUCC_RowMapperWith<D,S,W>{
		protected ShipAct_HdrR _hdrR;
		@Override
		public void setWith(W hdrR) {
			_hdrR = hdrR;
		}
		@Override
		protected void valueCopy(D dest, S src) {
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			dest.ship_schd_no(src.ship_schd_no());
			dest.dlv_slip_d_no(src.dlv_slip_d_no());
			dest.slo_d_no(src.slo_d_no());
			if (isSlsShipBasis(_hdrR, src)) {
				dest.sls_schd_dt(_hdrR.ship_tm().trunc(MCDateFieldType.DAY));
			}
			else {
				dest.sls_schd_dt(_hdrR.dlv_tm().trunc(MCDateFieldType.DAY));
			}
			dest.trd_unit_cd(src.trd_unit_cd());
			dest.trd_unit_qty(src.trd_unit_qty());
			dest.base_unit_cd(src.base_unit_cd());
			dest.base_unit_qty(src.base_unit_qty());
			dest.abort_flg(src.abort_flg());
		}
	}
	/**
	 * 売上予定更新用マッパー
	 * @return
	 */
	protected Map_Sls_Schd_Upd02_DtlR_ShipAct_DtlR_forUpd<Sls_Schd_Upd02_DtlR,ShipAct_DtlR, ShipAct_HdrR> createMap_Sls_Schd_Upd02_DtlR_ShipAct_DtlR_forUpd() {
		return new Map_Sls_Schd_Upd02_DtlR_ShipAct_DtlR_forUpd<Sls_Schd_Upd02_DtlR, ShipAct_DtlR, ShipAct_HdrR>();
	}
	public class Map_Sls_Schd_Upd02_DtlR_ShipAct_DtlR_forUpd<D extends Sls_Schd_Upd02_DtlR, S extends ShipAct_DtlR, W extends ShipAct_HdrR> extends Map_Sls_Schd_Upd02_DtlR_ShipAct_DtlR<D,S,W>{
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
		}
	}
	protected Map_Sls_Schd_Upd02_ShipActR_ShipAct_DtlR<Sls_Schd_Upd02_ShipActR,ShipAct_DtlR> createMap_Sls_Schd_Upd02_ShipActR_ShipAct_DtlR() {
		return new Map_Sls_Schd_Upd02_ShipActR_ShipAct_DtlR<Sls_Schd_Upd02_ShipActR, ShipAct_DtlR>();
	}
	public class Map_Sls_Schd_Upd02_ShipActR_ShipAct_DtlR<D extends Sls_Schd_Upd02_ShipActR, S extends ShipAct_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void valueCopy(D dest, S src) {
			dest.data_crud_typ(src.data_crud_typ());
			dest.ship_schd_no(src.ship_schd_no());
			dest.ship_act_d_no(src.ship_act_d_no());
		}
	}
	protected Map_Sls_Schd_Upd05_DtlR_ShipAct_HdrR<Sls_Schd_Upd05_DtlR,ShipAct_HdrR> createMap_Sls_Schd_Upd05_DtlR_ShipAct_HdrR() {
		return new Map_Sls_Schd_Upd05_DtlR_ShipAct_HdrR<Sls_Schd_Upd05_DtlR, ShipAct_HdrR>();
	}
	public class Map_Sls_Schd_Upd05_DtlR_ShipAct_HdrR<D extends Sls_Schd_Upd05_DtlR, S extends ShipAct_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.data_crud_typ(src.data_crud_typ());
			dest.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.IV_D.value());
			dest.iv_no(src.iv_no());
			dest.ship_act_flg(true);
		}
	}

	/**
	 * 売上実績サービスを呼び出し、売上実績を更新する
	 */
	protected void callSlsActSrv(
			MCList<ShipAct_HdrR> hdrL, MCList<ShipAct_DtlR> dtlL, MCJoinKey<MCList<ShipAct_DtlR>> dtlJk) {

		MSBBL_SlsActService.SlsAct_Upd02 o = MSBBL_SlsActService.crtSlsAct_Upd02();
		MCIndexKey dtlIdx = dtlL.createIndex(ShipAct_DtlR.$hdr_peg_no, ShipAct_DtlR.$ship_act_d_no);

		for (ShipAct_HdrR hdrR : hdrL) {

			MCList<ShipAct_DtlR>
				slsL = getSlsSrvL(hdrR, hdrR.getJoined(dtlJk), true).subList(r -> !r.non_upd_flg());
			if (slsL.isEmpty()) {
				continue;
			}
			boolean cstIvFlg = false;
			for (ShipAct_DtlR slsR : slsL) {
				if (hdrR.uplnd_flg()) {
					continue;
				}
				MST_SHIP_ALLOC_STS_R sasR = getShipAllocStsR(slsR);
				if (sasR.getBoolean("cst_iv_flg")) {
					cstIvFlg = true;
					break;
				}
			}

			if (!isNull(hdrR.iv_no())) {
				SlsAct_Upd02_CndR cndR = o.up0().add();
				cndR.iv_no(hdrR.iv_no());
				cndR.data_crud_typ(hdrR.data_crud_typ());
				cndR.can_ac_dt(hdrR.can_ac_dt());
			}
			else if (cstIvFlg) {
				MCList<ShipAct_DtlR> lst = slsL.groupBy(ShipAct_DtlR.$iv_no);
				lst.forEach(r -> {
					SlsAct_Upd02_CndR cndR = o.up0().add();
					cndR.iv_no(r.iv_no());
					if (!MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())) {
						cndR.data_crud_typ(hdrR.data_crud_typ());
					}
					else {
						MCList<ShipAct_DtlR> ivDtlL = slsL.subList(ivR -> isSame(ivR.iv_no(), r.iv_no()));
						if (ivDtlL.size() == ivDtlL.subList(ShipAct_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value()).size()) {
							cndR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						}
						else {
							cndR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
						}
					}
					cndR.can_ac_dt(hdrR.can_ac_dt());
					cndR.ac_dt(hdrR.ac_dt());
					cndR.ship_dt(hdrR.ship_tm().startTimeOfDay());
					cndR.use_iv_ship_act_map(true);
				});
			}
			else {
				if (!MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())) {
					MCList<ShipAct_DtlR> lst = slsL.groupBy(ShipAct_DtlR.$dlv_slip_no);
					lst.forEach(r -> {
						SlsAct_Upd02_CndR cndR = o.up0().add();
						cndR.dlv_slip_no(r.dlv_slip_no());
						cndR.data_crud_typ(hdrR.data_crud_typ());
						cndR.can_ac_dt(hdrR.can_ac_dt());
					});
				}
				else {
					// 変更前のリストと比較して新規か更新かを設定する
					MCList<ShipAct_DtlR>
						orgL = MCList.create(ShipAct_DtlR.class),
						updL = slsL.subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));

					// 変更前のリストから更新対象外の分を除外する
					for (ShipAct_DtlR actR : getShipActDLFromHdr(hdrR.ship_act_no())) {
						ShipAct_DtlR dtlR = dtlL.getFirst(dtlIdx, hdrR.peg_no(), actR.ship_act_d_no());
						if (!isNull(dtlR) && dtlR.non_upd_flg()) {
							continue;
						}
						orgL.add(actR);
					}
					orgL = getSlsSrvL(hdrR, orgL, false);

					MCIndexKey idx = orgL.createIndex(ShipAct_DtlR.$dlv_slip_no);
					for (ShipAct_DtlR r : updL.groupBy(ShipAct_DtlR.$dlv_slip_no)) {

						SlsAct_Upd02_CndR cndR = o.up0().add();
						cndR.dlv_slip_no(r.dlv_slip_no());

						ShipAct_DtlR orgR = orgL.getFirst(idx, r.dlv_slip_no());
						if (isNull(orgR)) {
							// 変更前のリストに存在しない→新規
							cndR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
						}
						else {
							// 変更前のリストに存在する→更新
							cndR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
						}
						cndR.can_ac_dt(hdrR.can_ac_dt());
					}

					// 変更前のリストから納品書NOが削除されているか
					idx = updL.createIndex(ShipAct_DtlR.$dlv_slip_no);
					for (MCList<ShipAct_DtlR> lst : orgL.groupList(ShipAct_DtlR.$dlv_slip_no)) {
						ShipAct_DtlR r = lst.get(0);
						if (!isSlsShipBasis(hdrR, r)) {
							// 出荷基準でない場合は対象外
							continue;
						}
						ShipAct_DtlR updR = updL.getFirst(idx, r.dlv_slip_no());
						if (isNull(updR)) {
							// 変更後のリストに存在しない→削除
							SlsAct_Upd02_CndR cndR = o.up0().add();
							cndR.dlv_slip_no(r.dlv_slip_no());
							cndR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
							cndR.can_ac_dt(hdrR.can_ac_dt());
						}
					}
				}
			}
		}
		if (!o.up0().isEmpty()) {
			// 複数出荷指図を纏めてインボイスを登録した場合、重複を除外する。
			o.up0().setAll(o.up0().distinctNE(SlsAct_Upd02_CndR.$dlv_slip_no, SlsAct_Upd02_CndR.$iv_no));
			o.exec();
		}
	}

	/**
	 * 受注状況更新サービスのキー
	 */
	protected String[] _$sls_sts_key = {
		ShipAct_DtlR.$trd_ptn_typ,
		ShipAct_DtlR.$slo_d_no,
		ShipAct_DtlR.$iv_no,
		ShipAct_DtlR.$iv_d_no,
		ShipAct_DtlR.$dlv_slip_no,
		ShipAct_DtlR.$dlv_slip_d_no,
		ShipAct_DtlR.$trd_unit_cd
	};

	/**
	 * 受注状況更新サービスを呼び出し、受注状況を更新する
	 */
	protected void callSloStsSrv(
			MCList<ShipAct_HdrR> hdrL, MCJoinKey<MCList<ShipAct_DtlR>> dtlJk) {

		MSBBL_SloStsRegService.SloSts_Ins01 o = MSBBL_SloStsRegService.crtSloSts_Ins01();
		Map_SloSts_DtlR_ShipAct_DtlR
			<SloSts_DtlR,ShipAct_DtlR, ShipAct_HdrR> mpr = createMap_SloSts_DtlR_ShipAct_DtlR();
		MCGroupByPolicy p = new MCGroupByPolicy(_$sls_sts_key);
		p.sum(ShipAct_DtlR.$trd_unit_qty);

		for (ShipAct_HdrR hdrR : hdrL) {
			if (hdrR.uplnd_flg()) {
				continue;
			}
			MCList<ShipAct_DtlR>
				delL = MCList.create(ShipAct_DtlR.class),
				crtL = MCList.create(ShipAct_DtlR.class);
			for (ShipAct_DtlR dtlR : hdrR.getJoined(dtlJk)) {
				ShipAct_DtlR r = dtlR;
				if (!isSlsOrShip(r)) {
					MST_SHIP_ALLOC_STS_R sasR = getShipAllocStsL(r).get(0);
					if (isNull(sasR.getString("xfr_slo_d_no")) || sasR.getBoolean("rqst_can_flg")) {
						continue;
					}
					// ＷＧ間依頼の作成元受注明細
					r = dtlR.clone();
					r.slo_d_no(sasR.getString("xfr_slo_d_no"));
				}
				if (!MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					ShipAct_DtlR tmpR = getShipActDR(r.ship_act_d_no()).clone();
					tmpR.slo_d_no(r.slo_d_no());
					tmpR.iv_d_no(r.iv_d_no());
					delL.add(tmpR);
				}
				if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					crtL.add(r);
				}
			}
			// 訂正・削除分
			if (!delL.isEmpty()) {
				delL = delL.groupBy(p);
				delL.forEach(r -> r.trd_unit_qty(r.trd_unit_qty().negate()));	// 符号反転
				addAll(o.up0(), delL, hdrR, mpr);
			}
			// 新規・訂正分
			if (!crtL.isEmpty()) {
				crtL = crtL.groupBy(p);
				addAll(o.up0(), crtL, hdrR, mpr);
			}
		}

		if (!o.up0().isEmpty()) {
			o.exec();
		}
	}
	protected Map_SloSts_DtlR_ShipAct_DtlR<SloSts_DtlR,ShipAct_DtlR, ShipAct_HdrR> createMap_SloSts_DtlR_ShipAct_DtlR() {
		return new Map_SloSts_DtlR_ShipAct_DtlR<SloSts_DtlR, ShipAct_DtlR, ShipAct_HdrR>();
	}
	public class Map_SloSts_DtlR_ShipAct_DtlR<D extends SloSts_DtlR, S extends ShipAct_DtlR, W extends ShipAct_HdrR> extends MAUCC_RowMapperWith<D,S,W>{
		protected ShipAct_HdrR _hdrR;
		@Override
		public void setWith(W hdrR) {
			_hdrR = hdrR;
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.slo_d_no(src.slo_d_no());
			if (!isSlsOrShip(src)) {
				dest.slo_sts_typ(MSC_SLO_STS_TYP.PLNT_SHIP.value());
				dest.ship_inst_no(_hdrR.ship_inst_no());
			}
			else {
				dest.slo_sts_typ(MSC_SLO_STS_TYP.SHIP.value());
				dest.ac_dt(_hdrR.ac_dt());
			}
			dest.unit_cd(src.trd_unit_cd());
			dest.qty(src.trd_unit_qty());
			dest.ship_lg_grp_cd(_hdrR.ship_fr_lg_grp_cd());
			dest.iv_no(nvl(_hdrR.iv_no(), src.iv_no()));
			dest.iv_d_no(src.iv_d_no());
			dest.dlv_slip_no(src.dlv_slip_no());
			dest.dlv_slip_d_no(src.dlv_slip_d_no());
			dest.biz_tm(_hdrR.ship_tm());
		}
	}
	/**
	 * 承認提供サービスを呼び出し、次処理済みに更新する
	 */
	protected void callAprvStsSrv(
			MCList<ShipAct_DtlR> dtlL, MCJoinKey<MCList<ShipAct_HdrR>> hdrJk, boolean isChk) {

		MCList<ShipAct_DtlR> aprvL = MCList.create(ShipAct_DtlR.class);
		aprvL.addStringColumn("aprv_no");
		for (ShipAct_DtlR r : dtlL) {
			ShipAct_HdrR hdrR = r.getJoinedRow(hdrJk);
			if (hdrR.uplnd_flg()) {
				continue;
			}
			MST_SHIP_ALLOC_STS_R sasR = getShipAllocStsR(r);
			if (isSlsOrShip(r) && isNull(hdrR.ship_inst_no()) && sasR.getBoolean("aprv_flg")) {
				// 指図なし＆承認対象の場合（指図あり＆承認対象は指図SVで次処理済みにする）
				if (!isChk) {
					// チェック処理は無条件に実行する
					if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())
						&& MSUCL_SlsUtil.isSloNextOper(sasR.getString("slo_no"))) {
						// 解除不可の場合は対象外
						continue;
					}
				}
				r.setStringNE("aprv_no", sasR.getString("aprv_no"));
				aprvL.add(r);
			}
		}
		if (aprvL.isEmpty())	return;

		MCList<ShipAct_DtlR>
			upd02L = aprvL.subList(r -> MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())),
			upd03L = aprvL.subList(r -> MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));
		callAprvStsUpd02(upd02L, isChk);
		callAprvStsUpd03(upd03L, isChk);
	}
	/**
	 * 承認次処理済み更新
	 */
	protected void callAprvStsUpd02(MCList<ShipAct_DtlR> aprvL, boolean isChk) {
		if (aprvL.isEmpty())	return;
		if (isChk) {
			MBBAL_AprvService.Aprv_Chk02 o = MBBAL_AprvService.crtAprv_Chk02();
			setAll(o.up0(), aprvL, createMap_Aprv_Chk02_Rslt1R_ShipAct_DtlR());
			o.exec();
			copyErrFlg(aprvL, o.down0());
		}
		else {
			MBBAL_AprvService.Aprv_Upd02 o = MBBAL_AprvService.crtAprv_Upd02();
			setAll(o.up0(), aprvL.groupBy("aprv_no"), createMap_Aprv_Chk02_Rslt1R_ShipAct_DtlR());
			o.exec();
		}
	}
	/**
	 * 承認次処理済み解除
	 */
	protected void callAprvStsUpd03(MCList<ShipAct_DtlR> aprvL, boolean isChk) {
		if (aprvL.isEmpty())	return;
		if (isChk) {
			MBBAL_AprvService.Aprv_Chk03 o = MBBAL_AprvService.crtAprv_Chk03();
			setAll(o.up0(), aprvL, createMap_Aprv_Chk02_Rslt1R_ShipAct_DtlR());
			o.exec();
			copyErrFlg(aprvL, o.down0());
		}
		else {
			MBBAL_AprvService.Aprv_Upd03 o = MBBAL_AprvService.crtAprv_Upd03();
			setAll(o.up0(), aprvL.groupBy("aprv_no"), createMap_Aprv_Chk02_Rslt1R_ShipAct_DtlR());
			o.exec();
		}
	}
	protected Map_Aprv_Chk02_Rslt1R_ShipAct_DtlR<Aprv_Chk02_Rslt1R,ShipAct_DtlR> createMap_Aprv_Chk02_Rslt1R_ShipAct_DtlR() {
		return new Map_Aprv_Chk02_Rslt1R_ShipAct_DtlR<Aprv_Chk02_Rslt1R, ShipAct_DtlR>();
	}
	public class Map_Aprv_Chk02_Rslt1R_ShipAct_DtlR<D extends Aprv_Chk02_Rslt1R, S extends ShipAct_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.peg_no(src.peg_no());
			dest.aprv_no(src.getString("aprv_no"));
		}
	}

	/**
	 * 工場出荷承認予定登録サービスを呼び出し、出荷可能チェックを行う
	 */
	protected void callPlntAprvSrv(MCList<ShipAct_DtlR> dtlL, MCJoinKey<MCList<ShipAct_HdrR>> hdrJk) {

		MCList<ShipAct_DtlR> aprvL = MCList.create(ShipAct_DtlR.class);
		for (ShipAct_DtlR r : dtlL) {
			ShipAct_HdrR hdrR = r.getJoinedRow(hdrJk);

			if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				continue;
			}
			MAM_LOC_R locR = getLocR(r.ship_loc_cd());
			if (MAC_LOC_MNG_TYP.isPRD(locR.loc_mng_typ())) {
				if (isSlsOrShip(r)) {
					// 生産場所からの出荷・売上
					aprvL.add(r);
				}
				else if (MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
						|| MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())) {
					if (MAC_VIA_DLV_TYP.isVIA(hdrR.via_dlv_typ())) {
						// 輸出はチェック対象
						aprvL.add(r);
					}
					else {
						MAM_LOC_R toLocR = getLocR(r.dlv_id_cd());
						if (!isSame(locR.site_cd(), toLocR.site_cd())
								|| MAC_LOC_MNG_TYP.isSLS(toLocR.loc_mng_typ())) {
							aprvL.add(r);
						}
					}
				}
			}
		}
		if (!aprvL.isEmpty()) {
			MSBFL_PlntAprvService.PlntAprv_Chk02 o = MSBFL_PlntAprvService.crtPlntAprv_Chk02();
			setAll(o.up0(), aprvL, createMap_PlntAprv_Chk02_RsltR_ShipAct_DtlR());
			o.exec();
			copyErrFlg(aprvL, o.down0());
		}
	}
	protected Map_PlntAprv_Chk02_RsltR_ShipAct_DtlR<PlntAprv_Chk02_RsltR,ShipAct_DtlR> createMap_PlntAprv_Chk02_RsltR_ShipAct_DtlR() {
		return new Map_PlntAprv_Chk02_RsltR_ShipAct_DtlR<PlntAprv_Chk02_RsltR, ShipAct_DtlR>();
	}
	public class Map_PlntAprv_Chk02_RsltR_ShipAct_DtlR<D extends PlntAprv_Chk02_RsltR, S extends ShipAct_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PlntAprv_Chk02_RsltR.$peg_no, ShipAct_DtlR.$peg_no);
			addColumnPathMap(PlntAprv_Chk02_RsltR.$itm_cd, ShipAct_DtlR.$itm_cd);
			addColumnPathMap(PlntAprv_Chk02_RsltR.$itm_sub1, ShipAct_DtlR.$itm_sub1);
			addColumnPathMap(PlntAprv_Chk02_RsltR.$itm_sub2, ShipAct_DtlR.$itm_sub2);
			addColumnPathMap(PlntAprv_Chk02_RsltR.$itm_sub3, ShipAct_DtlR.$itm_sub3);
			addColumnPathMap(PlntAprv_Chk02_RsltR.$lot_no, ShipAct_DtlR.$lot_no);
			addColumnPathMap(PlntAprv_Chk02_RsltR.$sublot_no, ShipAct_DtlR.$sublot_no);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.pre_inst_flg(false);
		}
	}

	/**
	 * 市場出荷判定情報サービスを呼び出し、出荷可能チェックを行う
	 */
	protected void callMrktJudgSrv(MCList<ShipAct_DtlR> dtlL, MCJoinKey<MCList<ShipAct_HdrR>> hdrJk) {

		MCList<ShipAct_DtlR> judgL = MCList.create(ShipAct_DtlR.class);
		for (ShipAct_DtlR r : dtlL) {
			ShipAct_HdrR hdrR = r.getJoinedRow(hdrJk);

			if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())
				&& isSlsOrShip(r)
				&& (hdrR.uplnd_flg() || !getShipAllocStsR(r).getBoolean("purc_ddlv_flg"))) {
				// 売上・出荷が対象（ただし仕入直送は仕入実績サービスでチェックするため対象から除外する）
				judgL.add(r);
			}
		}
		if (!judgL.isEmpty()) {
			MSBFL_MrktJudgService.MrktJudg_Chk02 o = MSBFL_MrktJudgService.crtMrktJudg_Chk02();
			setAll(o.up0(), judgL, createMap_MrktJudg_Chk02_RsltR_ShipAct_DtlR());
			o.exec();
			copyErrFlg(judgL, o.down0());
		}
	}
	protected Map_MrktJudg_Chk02_RsltR_ShipAct_DtlR<MrktJudg_Chk02_RsltR,ShipAct_DtlR> createMap_MrktJudg_Chk02_RsltR_ShipAct_DtlR() {
		return new Map_MrktJudg_Chk02_RsltR_ShipAct_DtlR<MrktJudg_Chk02_RsltR, ShipAct_DtlR>();
	}
	public class Map_MrktJudg_Chk02_RsltR_ShipAct_DtlR<D extends MrktJudg_Chk02_RsltR, S extends ShipAct_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MrktJudg_Chk02_RsltR.$peg_no, ShipAct_DtlR.$peg_no);
			addColumnPathMap(MrktJudg_Chk02_RsltR.$itm_cd, ShipAct_DtlR.$itm_cd);
			addColumnPathMap(MrktJudg_Chk02_RsltR.$itm_sub1, ShipAct_DtlR.$itm_sub1);
			addColumnPathMap(MrktJudg_Chk02_RsltR.$itm_sub2, ShipAct_DtlR.$itm_sub2);
			addColumnPathMap(MrktJudg_Chk02_RsltR.$itm_sub3, ShipAct_DtlR.$itm_sub3);
			addColumnPathMap(MrktJudg_Chk02_RsltR.$lot_no, ShipAct_DtlR.$lot_no);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.pre_inst_flg(false);
		}
	}

	/**
	 * ロットトレース情報サービスを呼び出し、出荷時構成チェックを行う
	 */
	protected void callLotTraceSrv(MCList<ShipAct_DtlR> dtlL) {
		MCList<ShipAct_DtlR> traceL = MCList.create(ShipAct_DtlR.class);
		for (ShipAct_DtlR r : dtlL) {
			if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())
				|| MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
				continue;
			}
			else if (isSlsOrShip(r)) {
				traceL.add(r);
			}
			else {
				// 工場・物流倉庫跨ぎがチェック対象
				if (!isSame(
					getLocR(r.ship_loc_cd()).site_cd(),
					getLocR(r.dlv_id_cd()).site_cd())) {
					traceL.add(r);
				}
			}
		}
		if (!traceL.isEmpty()) {
			MSBFL_LotTraceService.LotTrace_Chk01 o = MSBFL_LotTraceService.crtLotTrace_Chk01();
			setAll(o.up0(), traceL, createMap_LotTrace_Chk01_RsltR_ShipAct_DtlR());
			o.exec();
			copyErrFlg(traceL, o.down0());
		}
	}
	protected Map_LotTrace_Chk01_RsltR_ShipAct_DtlR<LotTrace_Chk01_RsltR,ShipAct_DtlR> createMap_LotTrace_Chk01_RsltR_ShipAct_DtlR() {
		return new Map_LotTrace_Chk01_RsltR_ShipAct_DtlR<LotTrace_Chk01_RsltR, ShipAct_DtlR>();
	}
	public class Map_LotTrace_Chk01_RsltR_ShipAct_DtlR<D extends LotTrace_Chk01_RsltR, S extends ShipAct_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(LotTrace_Chk01_RsltR.$peg_no, ShipAct_DtlR.$peg_no);
			addColumnPathMap(LotTrace_Chk01_RsltR.$err_flg, ShipAct_DtlR.$err_flg);
			addColumnPathMap(LotTrace_Chk01_RsltR.$skip_chk_ship_flg, ShipAct_DtlR.$skip_chk_ship_flg);
			addColumnPathMap(LotTrace_Chk01_RsltR.$itm_cd, ShipAct_DtlR.$itm_cd);
			addColumnPathMap(LotTrace_Chk01_RsltR.$itm_sub1, ShipAct_DtlR.$itm_sub1);
			addColumnPathMap(LotTrace_Chk01_RsltR.$itm_sub2, ShipAct_DtlR.$itm_sub2);
			addColumnPathMap(LotTrace_Chk01_RsltR.$itm_sub3, ShipAct_DtlR.$itm_sub3);
			addColumnPathMap(LotTrace_Chk01_RsltR.$lot_no, ShipAct_DtlR.$lot_no);
			addColumnPathMap(LotTrace_Chk01_RsltR.$sublot_no, ShipAct_DtlR.$sublot_no);
			addColumnPathMap(LotTrace_Chk01_RsltR.$sno1, ShipAct_DtlR.$sno1);
			addColumnPathMap(LotTrace_Chk01_RsltR.$sno2, ShipAct_DtlR.$sno2);
			addColumnPathMap(LotTrace_Chk01_RsltR.$sno3, ShipAct_DtlR.$sno3);
			addColumnPathMap(LotTrace_Chk01_RsltR.$sno4, ShipAct_DtlR.$sno4);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.loc_cd(src.ship_loc_cd());
			dest.site_cd(getLocR(dest.loc_cd()).site_cd());
		}
	}

	/**
	 * 締処理提供サービスを呼び出し、締日チェックを行う
	 */
	protected void callClSrv(
			MCList<ShipAct_DtlR> dtlL, MCJoinKey<MCList<ShipAct_HdrR>> hdrJk) {
		MSBIL_ClService.Cl_Chk03 o = MSBIL_ClService.crtCl_Chk03();
		for (ShipAct_DtlR r : dtlL) {
			ShipAct_HdrR hdrR = r.getJoinedRow(hdrJk);
			if (hdrR.sls_dtl_mod_flg()) {
				continue;
			}
			copy(o.up0().add(), r, hdrR, createMap_Cl_Chk03_CndR_ShipAct_DtlR());
		}
		if (o.up0().isEmpty())	return;
		o.exec();
		copyErrFlg(dtlL, o.down0());
	}
	protected Map_Cl_Chk03_CndR_ShipAct_DtlR<Cl_Chk03_CndR,ShipAct_DtlR, ShipAct_HdrR> createMap_Cl_Chk03_CndR_ShipAct_DtlR() {
		return new Map_Cl_Chk03_CndR_ShipAct_DtlR<Cl_Chk03_CndR, ShipAct_DtlR, ShipAct_HdrR>();
	}
	public class Map_Cl_Chk03_CndR_ShipAct_DtlR<D extends Cl_Chk03_CndR, S extends ShipAct_DtlR, W extends ShipAct_HdrR> extends MAUCC_RowMapperWith<D,S,W>{
		protected ShipAct_HdrR _hdrR;
		@Override
		public void setWith(W hdrR) {
			_hdrR = hdrR;
		}
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Cl_Chk03_CndR.$peg_no, ShipAct_DtlR.$peg_no);
			addColumnPathMap(Cl_Chk03_CndR.$itm_cd, ShipAct_DtlR.$itm_cd);
			addColumnPathMap(Cl_Chk03_CndR.$itm_sub1, ShipAct_DtlR.$itm_sub1);
			addColumnPathMap(Cl_Chk03_CndR.$itm_sub2, ShipAct_DtlR.$itm_sub2);
			addColumnPathMap(Cl_Chk03_CndR.$itm_sub3, ShipAct_DtlR.$itm_sub3);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			if (!MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
				dest.ac_dt(_hdrR.ac_dt());
			}
			dest.stk_cls_chk_flg(true);
			dest.loc_cd(src.ship_loc_cd());

			if (!MAC_DATA_CRUD_TYP.isCRT(src.data_crud_typ())) {
				dest.can_ac_dt(_hdrR.can_ac_dt());

				// 訂正前の出荷実績明細
				ShipAct_DtlR actR = getShipActDR(src.ship_act_d_no());
				dest.old_itm_cd(actR.itm_cd());
				dest.old_itm_sub1(actR.itm_sub1());
				dest.old_itm_sub2(actR.itm_sub2());
				dest.old_itm_sub3(actR.itm_sub3());
				dest.old_loc_cd(actR.ship_loc_cd());
			}
		}
	}

	/**
	 * 輸出実績サービスを呼び出し、インボイスを更新する
	 */
	protected void callExActSrv(MCList<ShipAct_HdrR> hdrL, boolean isChk) {
		MCList<ShipAct_HdrR> lst = createShipAct_HdrL();
		for (ShipAct_HdrR hdrR : hdrL) {
			// インボイス単位出荷、かつ配送先経由しない場合、輸出実績サービスを実行してインボイスを完了にする
			if (isNull(hdrR.iv_no()) || MAC_VIA_DLV_TYP.isVIA(hdrR.via_dlv_typ())) {
				continue;
			}
			// 計画外売上のインボイスはこの段階では未登録なので輸出実績サービスを実行しない
			if (hdrR.uplnd_iv_sls_flg()) {
				continue;
			}
			lst.add(hdrR);
		}
		if (lst.isEmpty())	return;

		if (isChk) {
			MSBEL_ExActService.ExAct_Chk02 o = MSBEL_ExActService.crtExAct_Chk02();
			setAll(o.up0(), lst, createMap_ExAct_Upd02_DtlR_ShipAct_HdrR());
			o.exec();
			copyErrFlg(lst, o.down0());
		}
		else {
			MSBEL_ExActService.ExAct_Upd02 o = MSBEL_ExActService.crtExAct_Upd02();
			setAll(o.up0(), lst, createMap_ExAct_Upd02_DtlR_ShipAct_HdrR());
			o.exec();
		}
	}
	/**
	 * 輸出実績サービスを呼び出し、インボイスを更新する（預り売上または出荷基準）。
	 * @param dtlL 出荷実績明細リスト
	 * @param hdrJk ヘッダJOINキー
	 * @param isChk チェック処理ＦＬＧ
	 */
	protected void callExActSrvForOther(MCList<ShipAct_DtlR> dtlL, MCJoinKey<MCList<ShipAct_HdrR>> hdrJk, boolean isChk) {
		MCList<ExAct_Upd02_DtlR> upL = MCList.create(ExAct_Upd02_DtlR.class);
		MCList<ShipAct_DtlR> ivExistsDtlL = dtlL.subList(r -> !isNull(r.iv_no()));
		for (MCList<ShipAct_DtlR> grpDtlL: ivExistsDtlL.groupList(ShipAct_DtlR.$iv_no)) {
			ShipAct_DtlR chkR = grpDtlL.get(0);
			ShipAct_HdrR hdrR = chkR.getJoinedRow(hdrJk);
			if (!isNull(hdrR.iv_no()) || MAC_VIA_DLV_TYP.isVIA(hdrR.via_dlv_typ()) || hdrR.uplnd_iv_sls_flg() || hdrR.uplnd_flg()) {
				continue;
			}
			
			boolean callTgt = false;
			boolean slsCststkFlg = false;
			String ivNo = null;
			for (ShipAct_DtlR dtlR: grpDtlL) {
				MST_SHIP_ALLOC_STS_R sasR = getShipAllocStsL(dtlR).get(0);
				if (!isNull(dtlR.iv_no()) && !isNull(sasR.getString("slo_d_no"))) {
					
					if (sasR.getBoolean("sls_cststk_flg") || isSlsShipBasis(dtlR.getJoinedRow(hdrJk), dtlR)) {
						
						callTgt = true;
						if (sasR.getBoolean("sls_cststk_flg")) {
							slsCststkFlg = true;
						}
						ivNo = dtlR.iv_no();
						break;
					}
				}
			}
			if (callTgt) {
				ExAct_Upd02_DtlR upR = ExAct_Upd02_DtlR.create();
				upR.peg_no(chkR.peg_no());
				upR.iv_no(ivNo);
				if (grpDtlL.size() == (grpDtlL.subList(ShipAct_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value()).size())) {
					upR.cmpl_flg(false);
				}
				else {
					upR.cmpl_flg(true);
				}
				upR.sls_cststk_flg(slsCststkFlg);
				upL.add(upR);
			}
		}
		
		if (upL.isEmpty())	return;

		if (isChk) {
			MSBEL_ExActService.ExAct_Chk02 o = MSBEL_ExActService.crtExAct_Chk02();
			o.up0().setAll(upL);
			o.exec();
			copyErrFlg(dtlL, o.down0());
			for (ShipAct_DtlR errR : dtlL.subList(ShipAct_DtlR.$err_flg, true)) {
				for (ShipAct_DtlR dtlR : dtlL.subList(ShipAct_DtlR.$iv_no, errR.iv_no())) {
					ShipAct_HdrR hdrR = dtlR.getJoinedRow(hdrJk);
					hdrR.err_flg(true);
				}
			}
		}
		else {
			MSBEL_ExActService.ExAct_Upd02 o = MSBEL_ExActService.crtExAct_Upd02();
			o.up0().setAll(upL);
			o.exec();
		}
	}
	
	/**
	 * 与信の更新対象を扱うクラス
	 */
	public class CredList {
		protected Map<Set<String>, Cred_Upd01_CndR> _credMap;
		public CredList() {
			init();
		}
		protected Cred_Upd01_CndR get(String cstCd, String curCd) {
			Set<String> key = createKey(cstCd, curCd);
			if (!_credMap.containsKey(key)) {
				// 存在しない場合は追加する
				Cred_Upd01_CndR credR = Cred_Upd01_CndR.create();
				credR.cst_cd(cstCd);
				credR.cur_cd(curCd);
				credR.trd_ptn_typ(MAC_TRD_PTN_TYP.SLS.value());
				credR.cred_upd_typ(MSC_CRED_UPD_TYP.UPD_CHK.value());
				credR.amt(0);
				_credMap.put(key, credR);
			}
			return _credMap.get(key);
		}
		protected MCList<Cred_Upd01_CndR> toMCList() {
			MCList<Cred_Upd01_CndR> list = MCList.create(Cred_Upd01_CndR.class);
			_credMap.entrySet().forEach(r -> {
				list.add(r.getValue());
			});
			return list;
		}
		protected Set<String> createKey(String cstCd, String curCd) {
			Set<String> key = new HashSet<>();
			key.add(cstCd);
			key.add(curCd);
			return key;
		}
		protected void init() {
			_credMap = new HashMap<>();
		}
	}
	protected Map_ExAct_Upd02_DtlR_ShipAct_HdrR<ExAct_Upd02_DtlR,ShipAct_HdrR> createMap_ExAct_Upd02_DtlR_ShipAct_HdrR() {
		return new Map_ExAct_Upd02_DtlR_ShipAct_HdrR<ExAct_Upd02_DtlR, ShipAct_HdrR>();
	}
	public class Map_ExAct_Upd02_DtlR_ShipAct_HdrR<D extends ExAct_Upd02_DtlR, S extends ShipAct_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.peg_no(src.peg_no());
			dest.iv_no(src.iv_no());
			if (MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
				dest.cmpl_flg(false);
			}
			else {
				dest.cmpl_flg(true);
			}
		}
	}

	/**
	 * 取引パタンが「売上」「出荷」か判定する
	 */
	protected boolean isSlsOrShip(ShipAct_DtlR r) {
			return MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSHIP(r.trd_ptn_typ());
	}

	/**
	 * 取引パタンが「移動・移送」「移動・移送返品」「支給」「支給返品」のいずれかか判定する
	 */
	protected boolean isXfrOrProv(ShipAct_DtlR r) {
			return MAC_TRD_PTN_TYP.isXFR(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ());
	}


	/**
	 * 売上計上済みか判定する
	 */
	protected boolean existSlsActIo(ShipAct_DtlR r) {
		MCList<ShipAct_DtlR> actL = getShipActDL(r.ship_act_d_no());
		for (ShipAct_DtlR actR : actL) {
			if (!isNull(actR.getString("sls_act_io_no"))) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 入荷済みか判定する
	 */
	protected boolean existArrAct(ShipAct_DtlR r) {
		MCList<ShipAct_DtlR> actL = getShipActDL(r.ship_act_d_no());
		for (ShipAct_DtlR actR : actL) {
			if (!isNull(actR.getString("arr_act_no"))) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 輸出済みか判定する
	 */
	protected boolean existIvAct(ShipAct_DtlR r) {
		MCList<ShipAct_DtlR> actL = getShipActDL(r.ship_act_d_no());
		for (ShipAct_DtlR actR : actL) {
			if (!isNull(actR.getString("iv_ship_act_d_no"))) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 出荷返品対象の出荷実績か判定する
	 */
	protected boolean existShipRet(ShipAct_DtlR r) {
		MCList<ShipAct_DtlR> actL = getShipActDL(r.ship_act_d_no());
		for (ShipAct_DtlR actR : actL) {
			if (actR.getBoolean("ship_ret_flg")) {
				return true;
			}
		}
		return false;
	}



	/**
	 * 基準単位数量から取引単位数量に換算する<br>
	 * 換算時に余りが出る場合はnullを返却する
	 */
	protected MCNumber cnvBaseToTrdUnitQty(ShipAct_DtlR dtlR, MCNumber baseUnitQty) {
		MAVM_ITM_UNIT_R unitR = getItmUnitR(dtlR); 
		// 基準単位数量→取引単位数量
		MCNumber trdUnitQty
			= rvrsBaseUnitConv(
				baseUnitQty, unitR.conv_base_qty(), unitR.conv_qty(),
				unitR.dec_place(), unitR.rnd_typ());
		// 取引単位数量→基準単位数量
		MAM_ITM_R itmR = getItmR(dtlR);
		MCNumber cnvQty
			= convToBaseUnit(
				trdUnitQty, unitR.conv_base_qty(), unitR.conv_qty(),
				itmR.dec_place(), itmR.rnd_typ());
		// 基準単位数量⇔取引単位数量に換算できた場合のみ、取引単位数量を返す
		if (baseUnitQty.eq(cnvQty)) {
			return trdUnitQty;
		}
		return null;
	}


///// キャッシュ関連
	/**
	 * キャッシュを管理するリクエストオブジェクト
	 */
	protected static final Class<MSBEL_ShipActService> CLAZZ = MSBEL_ShipActService.class;

	/**
	 * 出荷実績ヘッダのキャッシュ<br>
	 * 更新・削除前のデータをキャッシュする<br>
	 */
	protected ShipActCache _shipActCache = null;
	public class ShipActCache {
		protected MCList<ShipAct_HdrR> _hdrL = MCList.create(ShipAct_HdrR.class);
		protected MCIndexKey _idx = null;
		protected ShipActCache() {
			_hdrL = MCList.create(ShipAct_HdrR.class);
			crtIdx();
		}
		protected void crtIdx() {
			_idx = _hdrL.createIndex(ShipAct_HdrR.$ship_act_no);
		}
		protected ShipAct_HdrR get(String shipActNo) {
			return _hdrL.getFirst(_idx, shipActNo);
		}
		protected void doCache(MCList<ShipAct_HdrR> hdrL) {
			MCList<MST_SHIP_ACT_R> dbc = MCList.create(MST_SHIP_ACT_R.class);
			MST_DLV_SLIP_R S1W = MST_DLV_SLIP_R.create("S1W");
			MST_SHIP_ACT_D_R S1T1 = MST_SHIP_ACT_D_R.create("T1");
			MSW_SHIP_ACT_KEY_R w = MSW_SHIP_ACT_KEY_R.create("W");
			hdrL.forEach(r -> {
				if (!isNull(r.ship_act_no())) {
					dbc.add().ship_act_no(r.ship_act_no());
				}
			});
			if (dbc.isEmpty()) {
				return;
			}
			MST_SHIP_ACT_R dbc_t = MST_SHIP_ACT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(dbc_t);
			dbWkDelete("MSBEL5540_MSW_SHIP_ACT_D01", dbc_bldr.getBaseDbc());
			MCList<MST_SHIP_ACT_R> dbc2 = dbc.groupBy(MST_SHIP_ACT_R.$ship_act_no);
			MCQueryApiBuilder dbc2_bldr = MCQueryApiBuilder.create(MST_SHIP_ACT_R.create("T"));
			dbWkInsert("MSBEL5540_MSW_SHIP_ACT_I01", dbc2, dbc2_bldr.getBaseDbc());

			dbc.init();
			dbc_bldr = MCQueryApiBuilder.create(dbc_t);
			dbc.addBooleanColumn("sync_flg");
			dbc_bldr.setSelectAll();
			dbc_bldr.addSelect(bracket(subQuery().select(min(S1W.sync_flg))
					.from(S1W.innerJoin(S1T1).on(
						S1T1.dlv_slip_no.eq(S1W.dlv_slip_no)
						.and(S1T1.dlv_slip_seq.eq(S1W.dlv_slip_seq))
					))
					.where(S1T1.ship_act_no.eq(dbc_t.ship_act_no)
							)).as("sync_flg"));
			dbc_bldr.addInnerJoin(w, bracket(w.ship_act_no.eq(dbc_t.ship_act_no)));
			dbc_bldr.setLockTable(dbc_t.ship_act_no);
			dbc_bldr.setOrderByAsc(dbc_t.ship_act_no);
			if (dbSelectForUpdate("MSBEL5540_MST_SHIP_ACT_S03", dbc, dbc_bldr) <= 0) return;

			MCList<ShipAct_HdrR>
				rmL = createShipAct_HdrL(), addL = createShipAct_HdrL();
			for (MST_SHIP_ACT_R r : dbc) {
				ShipAct_HdrR hdrR = _hdrL.getFirst(_idx, r.ship_act_no());
				if (!isNull(hdrR)) {
					// 存在する場合、取得したデータで差し替える
					rmL.add(hdrR);
				}

				hdrR = addL.add();
				hdrR.sa(r);
				hdrR.sync_flg(r.getBoolean("sync_flg"));
			}
			if (!rmL.isEmpty()) {
				_hdrL.removeAll(rmL);
			}
			_hdrL.addAll(addL);

			crtIdx();
		}
	}
	protected void doShipActCache(MCList<ShipAct_HdrR> hdrL) {
		if (object(CLAZZ)._shipActCache == null) {
			object(CLAZZ)._shipActCache = new ShipActCache();
		}
		if (!isNull(hdrL)) {
			object(CLAZZ)._shipActCache.doCache(hdrL);
		}
	}
	protected ShipAct_HdrR getShipActR(String shipActNo) {
		return object(CLAZZ)._shipActCache.get(shipActNo);
	}


	/**
	 * 出荷実績明細<br>
	 * 更新・削除前のデータをキャッシュする<br>
	 */
	protected ShipActDCache _shipActDCache = null;
	public class ShipActDCache {
		protected MCList<ShipAct_DtlR> _dtlL = MCList.create(ShipAct_DtlR.class);
		protected MCIndexKey _idx1 = null, _idx2 = null;
		protected ShipActDCache() {
			_dtlL = MCList.create(ShipAct_DtlR.class);
			crtIdx();
		}
		protected void crtIdx() {
			_idx1 = _dtlL.createIndex(ShipAct_DtlR.$ship_act_no);
			_idx2 = _dtlL.createIndex(ShipAct_DtlR.$ship_act_d_no);
		}
		protected MCList<ShipAct_DtlR> get(String shipActNo, String shipActDNo) {
			if (!isNull(shipActDNo)) {
				return _dtlL.subList(_idx2, shipActDNo);
			}
			else if (!isNull(shipActNo)) {
				return _dtlL.subList(_idx1, shipActNo);
			}
			return null;
		}
		protected void doCache(MCList<ShipAct_HdrR> hdrL) {
			MCList<ShipAct_HdrR> lst = createShipAct_HdrL();
			lst.addAll(hdrL.subList(r -> !isNull(r.ship_act_no())));
			if (lst.isEmpty()) {
				return;
			}
			MSW_SHIP_ACT_KEY_R S0 = MSW_SHIP_ACT_KEY_R.create();
			execDbWkDelete("MSBEL5540_MSW_SHIP_ACT_KEY_D01", S0);
			MCList<ShipAct_HdrR> lst2 = lst.groupBy(ShipAct_HdrR.$ship_act_no);
			MCInsert q2 = sql("MSBEL5540_MSW_SHIP_ACT_KEY_I01").insert(S0).columns(S0.ship_act_no)
					.values(bind("ship_act_no"));
			q2.executeBatchUpdate(lst2);

			// 入荷進捗、入荷実績に対してロックする
			MCList<MST_SHIP_ACT_D_R> dbc = MCList.create(MST_SHIP_ACT_D_R.class);
			MST_SHIP_ACT_D_R t = MST_SHIP_ACT_D_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			MSW_SHIP_ACT_KEY_R w = MSW_SHIP_ACT_KEY_R.create("W");
			MCTempView t1 = createTempView("T1");
			MSW_SHIP_ACT_KEY_R S1W1 = MSW_SHIP_ACT_KEY_R.create("W1");
			MST_SHIP_ACT_D_R S1W2 = MST_SHIP_ACT_D_R.create("W2");
			MST_SLS_ACT_IO_R S1W3 = MST_SLS_ACT_IO_R.create("W3");
			MST_SLS_ACT_D_R S1W4 = MST_SLS_ACT_D_R.create("W4");
			MST_SLS_ACT_R S1W5 = MST_SLS_ACT_R.create("W5");
			MST_ARR_PR_R t2 = MST_ARR_PR_R.create("T2");
			MST_ARR_SCHD_R t3 = MST_ARR_SCHD_R.create("T3");
			MST_ARR_ACT_R t4 = MST_ARR_ACT_R.create("T4");
			MST_DLV_SLIP_R t5 = MST_DLV_SLIP_R.create("T5");
			MST_IV_SHIP_ACT_D_R t6 = MST_IV_SHIP_ACT_D_R.create("T6");
			MST_SHIP_ACT_R t7 = MST_SHIP_ACT_R.create("T7");
			MST_IV_SHIP_ACT_MAP_R t8 = MST_IV_SHIP_ACT_MAP_R.create("T8");
			MST_IV_D_R t9 = MST_IV_D_R.create("T9");
			MST_IV_R t10 = MST_IV_R.create("T10");
			dbc.addStringColumn("sls_act_io_no");
			dbc.addStringColumn("arr_pr_no");
			dbc.addStringColumn("arr_schd_no");
			dbc.addStringColumn("arr_act_no");
			dbc.addStringColumn("trn_typ");
			dbc.addBooleanColumn("sync_flg");
			dbc.addStringColumn("iv_ship_act_d_no");
			dbc.addStringColumn("iv_no");
			dbc.addStringColumn("iv_d_no");
			dbc_bldr.setSelectAll();
			dbc_bldr.addSelect(t1.pr(S1W3.sls_act_io_no), t2.arr_pr_no, t3.arr_schd_no,
					t4.arr_act_no, t5.trn_typ, t5.sync_flg, t6.iv_ship_act_d_no);
			dbc_bldr.addSelect(t10.iv_no, t9.iv_d_no);
			dbc_bldr.addInnerJoin(w, bracket(w.ship_act_no.eq(t.ship_act_no)));
			dbc_bldr.addLeftOuterJoin(subQuery()
					.select(S1W3.sls_act_io_no, S1W2.ship_act_d_no)
					.from(S1W1.innerJoin(S1W2)
							.on(bracket(S1W2.ship_act_no.eq(S1W1.ship_act_no)))
							.innerJoin(S1W3)
							.on(bracket(S1W3.ship_act_d_no.eq(S1W2.ship_act_d_no)))
							.innerJoin(S1W4)
							.on(bracket(S1W4.sls_act_d_no.eq(S1W3.sls_act_d_no)
									.and(S1W4.sls_act_d_seq.eq(S1W3.sls_act_d_seq))))
							.innerJoin(S1W5)
							.on(bracket(S1W5.sls_act_no.eq(S1W4.sls_act_no)
									.and(S1W5.sls_act_seq.eq(S1W4.sls_act_seq))
									.and(S1W5.slip_sts_typ
											.eq(value(MAC_SLIP_STS_TYP.CRT.value()))))))
					.view(t1), bracket(t1.pr("ship_act_d_no").eq(t.ship_act_d_no)));
			dbc_bldr.addLeftOuterJoin(t2, bracket(t2.dlv_slip_d_no.eq(t.dlv_slip_d_no)));
			dbc_bldr.addLeftOuterJoin(t3, bracket(t3.arr_pr_no.eq(t2.arr_pr_no)));
			dbc_bldr.addLeftOuterJoin(t4, bracket(
					t4.arr_schd_no.eq(t3.arr_schd_no)
					.and(t4.can_flg.eq(value(false)))));
			dbc_bldr.addLeftOuterJoin(t5, bracket(t5.dlv_slip_no.eq(t.dlv_slip_no)
					.and(t5.dlv_slip_seq.eq(t.dlv_slip_seq))));
			dbc_bldr.addLeftOuterJoin(t6, bracket(t6.ship_act_d_no.eq(t.ship_act_d_no)));
			dbc_bldr.addInnerJoin(t7, t.ship_act_no.eq(t7.ship_act_no));
			dbc_bldr.addLeftOuterJoin(t8, bracket(
					t.ship_act_d_no.eq(t8.ship_act_d_no)
					.and(t8.ship_act_fix_flg.eq(value(true)))
					.and(t7.iv_no.isNull())
					.and(t7.via_dlv_typ.eq(value(MAC_VIA_DLV_TYP.NOT_VIA.value())))
			));
			dbc_bldr.addLeftOuterJoin(t9, t8.iv_d_no.eq(t9.iv_d_no));
			dbc_bldr.addLeftOuterJoin(t10, t9.iv_mng_no.eq(t10.iv_mng_no));
			dbc_bldr.setWhere(t.can_flg.eq(value(false)));
			dbc_bldr.setOrderByAsc(t2.arr_pr_no, t4.arr_act_no, t1.pr("ship_act_d_no"));
			if (dbSelect("MSBEL5540_MST_SHIP_ACT_D_S07", dbc, dbc_bldr) <= 0) return;

			lockArrPr(dbc);
			lockArrAct(dbc);

			MCList<ShipAct_DtlR> l = createShipAct_DtlL();
			for (MST_SHIP_ACT_D_R r : dbc) {
				l.addAll(_dtlL.subList(_idx1, r.ship_act_no()));
			}
			if (!l.isEmpty()) {
				// 存在する場合、取得したデータで差し替える
				_dtlL.removeAll(l);
			}
			dbc.forEach(r -> {
				ShipAct_DtlR dtlR = _dtlL.add();
				dtlR.sad(r);
				dtlR.setStringNE("sls_act_io_no", r.getString("sls_act_io_no"));
				dtlR.setStringNE("arr_pr_no", r.getString("arr_pr_no"));
				dtlR.setStringNE("arr_schd_no", r.getString("arr_schd_no"));
				dtlR.setStringNE("arr_act_no", r.getString("arr_act_no"));
				dtlR.setStringNE("iv_ship_act_d_no", r.getString("iv_ship_act_d_no"));
				dtlR.setStringNE("trn_typ", r.getString("trn_typ"));
				dtlR.sync_flg(r.getBoolean("sync_flg"));
				dtlR.iv_no(r.getString("iv_no"));
				dtlR.iv_d_no(r.getString("iv_d_no"));
			});

			crtIdx();
		}

		protected void lockArrPr(MCList<MST_SHIP_ACT_D_R> selectL) {
			MCList<MST_ARR_PR_R> arrBindL = MCList.create(MST_ARR_PR_R.class);
			for (MST_SHIP_ACT_D_R selR : selectL) {
				String arrPrNo = selR.getStringNE(MST_ARR_PR_R.$arr_pr_no);
				if (!isNull(arrPrNo)) {
					MST_ARR_PR_R tmp = MST_ARR_PR_R.create();
					tmp.arr_pr_no(arrPrNo);
					arrBindL.add(tmp);
				}
			}
			if (!arrBindL.isEmpty()) {
				MST_ARR_PR_R t = MST_ARR_PR_R.create("T");
				MCQueryApiBuilder arrBuilder = MCQueryApiBuilder.create(t);
				arrBuilder.setSelect(t.arr_pr_no);
				arrBuilder.setOrderByAsc(t.arr_pr_no);
				dbSelectKeyForUpdateNoFetch("MSBEL5540_MST_ARR_PR_S01", arrBuilder, arrBindL);
			}
		}
		protected void lockArrAct(MCList<MST_SHIP_ACT_D_R> selectL) {
			MCList<MST_ARR_ACT_R> arrBindL = MCList.create(MST_ARR_ACT_R.class);
			for (MST_SHIP_ACT_D_R selR : selectL) {
				String arrActNo = selR.getStringNE(MST_ARR_ACT_R.$arr_act_no);
				if (!isNull(arrActNo)) {
					MST_ARR_ACT_R tmp = MST_ARR_ACT_R.create();
					tmp.arr_act_no(arrActNo);
					arrBindL.add(tmp);
				}
			}
			if (!arrBindL.isEmpty()) {
				MST_ARR_ACT_R t = MST_ARR_ACT_R.create("T");
				MCQueryApiBuilder arrBuilder = MCQueryApiBuilder.create(t);
				arrBuilder.setSelect(t.arr_act_no);
				arrBuilder.setOrderByAsc(t.arr_act_no);
				dbSelectKeyForUpdateNoFetch("MSBEL5540_MST_ARR_ACT_S01", arrBuilder, arrBindL);
			}
		}
	}
	protected void doShipActDCache(MCList<ShipAct_HdrR> hdrL) {
		if (object(CLAZZ)._shipActDCache == null) {
			object(CLAZZ)._shipActDCache = new ShipActDCache();
		}
		if (!isNull(hdrL)) {
			object(CLAZZ)._shipActDCache.doCache(hdrL);
		}
	}
	protected MCList<ShipAct_DtlR> getShipActDL(String shipActDNo) {
		// キャッシュは売上実績、入荷実績、輸出実績をJOINした結果なので、出荷実績明細に対して
		// 複数件になることがあるので、出荷実績明細のみではなく、それらを含めて取得する場合は当メソッドを使用する
		return object(CLAZZ)._shipActDCache.get(null, shipActDNo);
	}
	protected ShipAct_DtlR getShipActDR(String shipActDNo) {
		// キャッシュは売上実績、入荷実績、輸出実績をJOINした結果なので、出荷実績明細に対して
		// 複数件になることがあるが、それらを無視して出荷実績明細だけ取得する場合は当メソッドを使用する
		MCList<ShipAct_DtlR> l = getShipActDL(shipActDNo);
		if (!l.isEmpty()) {
			return l.get(0);
		}
		return null;
	}
	protected MCList<ShipAct_DtlR> getShipActDLFromHdr(String shipActNo) {
		return object(CLAZZ)._shipActDCache.get(shipActNo, null);
	}


	/**
	 * 場所マスタ（出荷場所、または入荷場所）のキャッシュ
	 */
	protected FXUCL_MCDbcCache<MAM_LOC_R> _locCache;
	protected void doLocCache(MCList<ShipAct_DtlR> dtlL) {

		// キャッシュ対象の場所
		MCList<MAM_LOC_R> cndL = MCList.create(MAM_LOC_R.class);
		for (ShipAct_DtlR r : dtlL) {
			if (MSC_DLV_ID_TYP.isLOC(r.dlv_id_typ())) {
				cndL.add().loc_cd(r.dlv_id_cd());
			}
			cndL.add().loc_cd(r.ship_loc_cd());
		}

		MCList<MAM_LOC_R> dbc = MCList.create(MAM_LOC_R.class);
		MAM_LOC_R t = MAM_LOC_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MAM_SITE_R m1 = MAM_SITE_R.create("M1");
		MAM_BP_R m2 = MAM_BP_R.create("M2");
		dbc.addBooleanColumn("arr_flg");
		dbc.addStringColumn("prov_rcv_typ");
		dbc.addBooleanColumn("repurc_obli_flg");
		dbc_bldr.setSelect(
				t.loc_cd,
				t.gi_vmi_flg,
				t.wg_cd,
				t.site_cd,
				t.loc_mng_typ,
				t.sppl_cd,
				t.cntry_cd,
				m1.arr_flg,
				m2.prov_rcv_typ,
				m2.repurc_obli_flg
		);
		dbc_bldr.addLeftOuterJoin(m1, bracket(m1.site_cd.eq(t.site_cd)));
		dbc_bldr.addLeftOuterJoin(m2, bracket(m2.bp_cd.eq(t.sppl_cd)));

		if (object(CLAZZ)._locCache == null) {
			object(CLAZZ)._locCache = new FXUCL_MCDbcCache<MAM_LOC_R>(dbc, dbc_bldr, cndL, MAM_LOC_R.$loc_cd);
		}
		else {
			cndL = cndL.subList(r -> isNull(object(CLAZZ)._locCache.getCache(r.loc_cd())));
			if (!cndL.isEmpty()) {
				dbSelectKey("MSBEL5540_MAM_LOC_S01", dbc, dbc_bldr, cndL);
				dbc.forEach(r -> {
					object(CLAZZ)._locCache.putCache(r.toArray(MAM_LOC_R.$loc_cd), r);
				});
			}
		}
	}
	protected MAM_LOC_R getLocR(String locCd) {
		return object(CLAZZ)._locCache.get(locCd);
	}

	/**
	 * 取引先マスタのキャッシュ
	 */
	protected FXUCL_MCDbcCache<MAM_BP_R> _bpCache;
	protected void doBpCache(MCList<ShipAct_DtlR> dtlL) {
		doBpCache(createShipAct_HdrL(), dtlL);
	}
	protected void doBpCache(MCList<ShipAct_HdrR> hdrL, MCList<ShipAct_DtlR> dtlL) {

		MCList<MAM_BP_R> cndL = MCList.create(MAM_BP_R.class);
		for (ShipAct_DtlR r : dtlL) {
			if (!MSC_DLV_ID_TYP.isLOC(r.dlv_id_typ())) {
				cndL.add().bp_cd(r.dlv_id_cd());
			}
			if (!isNull(r.stk_arrv_bp_cd())) {
				cndL.add().bp_cd(r.stk_arrv_bp_cd());
			}
			if (!isNull(r.stk_bp_cd())) {
				cndL.add().bp_cd(r.stk_bp_cd());
			}
		}
		for (ShipAct_HdrR hdrR : hdrL) {
			if (!MSC_SHIP_TO_ID_TYP.isLOC(hdrR.ship_to_id_typ())) {
				cndL.add().bp_cd(hdrR.ship_to_id_cd());
			}
			if (!isNull(hdrR.cst_cd())) {
				cndL.add().bp_cd(hdrR.cst_cd());
			}
		}

		MCList<MAM_BP_R> dbc = MCList.create(MAM_BP_R.class);
		MAM_BP_R t = MAM_BP_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MAM_BP_STOP_R m1 = MAM_BP_STOP_R.create("M1");
		dbc.addDateColumn("sls_stop_dt");
		dbc_bldr.setSelect(
				t.bp_cd,
				t.sls_basis_typ,
				t.cntry_cd,
				t.cst_flg,
				t.sppl_flg,
				t.dlv_flg,
				t.cst_iv_flg,
				t.prov_rcv_typ,
				t.via_dlv_typ
		);
		dbc_bldr.addSelect(m1.sls_stop_dt, m1.xfr_stop_dt);
		dbc_bldr.addLeftOuterJoin(m1, bracket(m1.bp_cd.eq(t.bp_cd)));

		if (object(CLAZZ)._bpCache == null) {
			object(CLAZZ)._bpCache = new FXUCL_MCDbcCache<MAM_BP_R>(dbc, dbc_bldr, cndL, MAM_BP_R.$bp_cd);
		}
		else {
			cndL = cndL.subList(
				r -> !isNullOrNullVal(r.bp_cd()) 
						&& isNull(object(CLAZZ)._bpCache.getCache(r.bp_cd()))
			);
			if (!cndL.isEmpty()) {
				dbSelectKey("MSBEL5540_MAM_BP_S01", dbc, dbc_bldr, cndL);
				dbc.forEach(r -> {
					object(CLAZZ)._bpCache.putCache(r.toArray(MAM_BP_R.$bp_cd), r);
				});
			}
		}
	}
	protected MAM_BP_R getBpR(String bpCd) {
		return object(CLAZZ)._bpCache.get(bpCd);
	}

	/**
	 * 品目マスタをキャッシュに格納する
	 */
	protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache;
	protected void doItmCache(MCList<ShipAct_DtlR> dtlL) {

		MCList<MAM_ITM_R> cndL = MCList.create(MAM_ITM_R.class);
		for (ShipAct_DtlR r : dtlL) {
			MAM_ITM_R cndR = cndL.add();
			cndR.itm_cd(r.itm_cd());
			cndR.itm_sub1(r.itm_sub1());
			cndR.itm_sub2(r.itm_sub2());
			cndR.itm_sub3(r.itm_sub3());
		}

		MCList<MAM_ITM_R> dbc = MCList.create(MAM_ITM_R.class);
		MAM_ITM_R t = MAM_ITM_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MAM_ITM_STOP_R m1 = MAM_ITM_STOP_R.create("M1");
		dbc.addDateColumn("sls_stop_dt");
		dbc.addDateColumn("xfr_stop_dt");
		dbc_bldr.setSelect(
				t.itm_cd,
				t.itm_sub1,
				t.itm_sub2,
				t.itm_sub3,
				t.stk_mng_typ,
				t.hs_cd,
				t.lot_mng_typ,
				t.dec_place,
				t.rnd_typ,
				t.minus_stk_flg,
				m1.sls_stop_dt,
				m1.xfr_stop_dt
		);
		dbc_bldr.addLeftOuterJoin(m1,
				bracket(m1.itm_cd.eq(t.itm_cd)
						.and(m1.itm_sub1.eq(t.itm_sub1))
						.and(m1.itm_sub2.eq(t.itm_sub2))
						.and(m1.itm_sub3.eq(t.itm_sub3))));

		if (object(CLAZZ)._itmCache == null) {
			object(CLAZZ)._itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(
					dbc, dbc_bldr, cndL, MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
		}
		else {
			cndL = cndL.subList(
				r -> isNull(object(CLAZZ)._itmCache.getCache(
						r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()))
			);
			if (!cndL.isEmpty()) {
				dbSelectKey("MSBEL5540_MAM_ITM_S01", dbc, dbc_bldr, cndL);
				dbc.forEach(r -> {
					object(CLAZZ)._itmCache.putCache(
						r.toArray(
							MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3
						), r);
				});
			}
		}
	}
	protected MAM_ITM_R getItmR(ShipAct_DtlR r) {
		return object(CLAZZ)._itmCache.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
	}

	/**
	 * 品目単位マスタのキャッシュ
	 */
	protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _itmUnitCache;
	protected void doItmUnitCache(MCList<ShipAct_DtlR> dtlL) {

		MAVM_ITM_UNIT_R t1 = MAVM_ITM_UNIT_R.create("T");
		MCQueryApiBuilder dbc1_bldr = MCQueryApiBuilder.create(t1);
		if (object(CLAZZ)._itmUnitCache == null) {
			object(CLAZZ)._itmUnitCache = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(dbc1_bldr);
		}

		MCList<MAVM_ITM_UNIT_R> cndL = MCList.create(MAVM_ITM_UNIT_R.class);
		for (ShipAct_DtlR r : dtlL) {
			if (isNull(object(CLAZZ)._itmUnitCache.getCache(
					r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.trd_unit_cd()))) {
				MAVM_ITM_UNIT_R cndR = cndL.add();
				cndR.itm_cd(r.itm_cd());
				cndR.itm_sub1(r.itm_sub1());
				cndR.itm_sub2(r.itm_sub2());
				cndR.itm_sub3(r.itm_sub3());
				cndR.unit_cd(r.trd_unit_cd());
			}
		}
		if (!cndL.isEmpty()) {
			MCList<MAVM_ITM_UNIT_R> dbc = MCList.create(MAVM_ITM_UNIT_R.class);
			MCQueryApiBuilder dbc2_bldr = MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T"));
			dbc2_bldr.setSelectAll();
			dbSelectKey("MSBEL5540_MAVM_ITM_UNIT_S01", dbc, dbc2_bldr, cndL);
			dbc.forEach(r -> {
				object(CLAZZ)._itmUnitCache.putCache(r.toArray(MAVM_ITM_UNIT_R.$itm_cd,
						MAVM_ITM_UNIT_R.$itm_sub1, MAVM_ITM_UNIT_R.$itm_sub2,
						MAVM_ITM_UNIT_R.$itm_sub3, MAVM_ITM_UNIT_R.$unit_cd), r);
			});
		}
	}
	protected MAVM_ITM_UNIT_R getItmUnitR(ShipAct_DtlR r) {
		return object(CLAZZ)._itmUnitCache.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.trd_unit_cd());
	}

	/**
	 * 引当禁止ロットのキャッシュ
	 */
	protected FXUCL_MCDbcCache<MST_ALLOC_STOP_LOT_R> _stopLotCache;
	protected void doAllocStopLotCache(MCList<ShipAct_DtlR> dtlL) {

		if (object(CLAZZ)._stopLotCache == null) {
			object(CLAZZ)._stopLotCache = new FXUCL_MCDbcCache<MST_ALLOC_STOP_LOT_R>(MCQueryApiBuilder.create(MST_ALLOC_STOP_LOT_R.create("T")));
		}

		MCList<MST_ALLOC_STOP_LOT_R> cndL = MCList.create(MST_ALLOC_STOP_LOT_R.class);
		for (ShipAct_DtlR r : dtlL) {
			if (isNull(object(CLAZZ)._stopLotCache.getCache(
					r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.lot_no(), r.sublot_no()))) {
				MST_ALLOC_STOP_LOT_R cndR = cndL.add();
				cndR.itm_cd(r.itm_cd());
				cndR.itm_sub1(r.itm_sub1());
				cndR.itm_sub2(r.itm_sub2());
				cndR.itm_sub3(r.itm_sub3());
				cndR.lot_no(r.lot_no());
				cndR.sublot_no(r.sublot_no());
			}
		}
		if (!cndL.isEmpty()) {
			MCList<MST_ALLOC_STOP_LOT_R> dbc = MCList.create(MST_ALLOC_STOP_LOT_R.class);
			MCQueryApiBuilder dbc2_bldr = MCQueryApiBuilder.create(MST_ALLOC_STOP_LOT_R.create("T"));
			dbc2_bldr.setSelectAll();
			dbSelectKey("MSBEL5540_MST_ALLOC_STOP_LOT_S01", dbc, dbc2_bldr, cndL);
			dbc.forEach(r -> {
				object(CLAZZ)._stopLotCache.putCache(r.toArray(
						MST_ALLOC_STOP_LOT_R.$itm_cd, MST_ALLOC_STOP_LOT_R.$itm_sub1,
						MST_ALLOC_STOP_LOT_R.$itm_sub2, MST_ALLOC_STOP_LOT_R.$itm_sub3,
						MST_ALLOC_STOP_LOT_R.$lot_no, MST_ALLOC_STOP_LOT_R.$sublot_no),
						r);
			});
		}
	}
	protected MST_ALLOC_STOP_LOT_R getAllocStopLotR(ShipAct_DtlR r) {
		return object(CLAZZ)._stopLotCache.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.lot_no(), r.sublot_no());
	}


	/**
	 * 出荷引当状況のキャッシュ
	 */
	protected FXUCL_Cache<MCList<MST_SHIP_ALLOC_STS_R>> _shipAllocStsCache = null;
	protected void doShipAllocStsCache(MCList<ShipAct_HdrR> hdrL, MCList<ShipAct_DtlR> dtlL) {

		MCList<ShipAct_HdrR> crtL = createShipAct_HdrL(), updL = createShipAct_HdrL(), ivL = createShipAct_HdrL();
		MCList<ShipAct_DtlR> crtDtlL = createShipAct_DtlL();
		MCIndexKey crtDtlIdx = dtlL.createIndex(ShipAct_DtlR.$hdr_peg_no, ShipAct_DtlR.$data_crud_typ);
		for (ShipAct_HdrR hdrR : hdrL) {
			if (hdrR.uplnd_flg()) {
				continue;
			}
			else if (MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ())) {
				crtL.add(hdrR);

				if (!isNull(hdrR.iv_no())) {
					ivL.add(hdrR);
				}
			}
			else {
				updL.add(hdrR);
				crtDtlL.addAll(dtlL.subList(crtDtlIdx, hdrR.peg_no(), MAC_DATA_CRUD_TYP.CRT.value()));
			}
		}
		if (crtL.isEmpty() && updL.isEmpty()) {
			return;
		}
		else {
			MSW_SHIP_ALLOC_STS_KEY_R S0 = MSW_SHIP_ALLOC_STS_KEY_R.create();
			MSW_IV_KEY_R S1 = MSW_IV_KEY_R.create();
			execDbWkDelete("MSBEL5540_MSW_SHIP_ALLOC_STS_KEY_D01", S0);
			if (!crtL.isEmpty()) {
				MCList<ShipAct_DtlR> lst = createShipAct_DtlL();
				MCIndexKey idx = dtlL.createIndex(ShipAct_DtlR.$hdr_peg_no);
				crtL.forEach(r -> lst.addAll(dtlL.subList(idx, r.peg_no())));
				MCList<ShipAct_DtlR> lst2 = lst.groupBy(ShipAct_DtlR.$ship_alloc_sts_no);
				MCInsert q2 = sql("MSBEL5540_MSW_SHIP_ALLOC_STS_KEY_I01").insert(S0).columns(S0.ship_alloc_sts_no)
						.values(bind("ship_alloc_sts_no"));
				q2.executeBatchUpdate(lst2);

				if (!ivL.isEmpty()) {
					execDbWkDelete("MSBEL5540_MSW_IV_KEY_D01", S1);
					MCList<ShipAct_HdrR> ivL2 = ivL.groupBy(ShipAct_HdrR.$iv_no);
					MST_IV_R S1W = MST_IV_R.create("W");
					MCInsert q4 = sql("MSBEL5540_MSW_IV_KEY_I01").insert(S1).columns(S1.iv_mng_no)
							.query(subQuery().selectDistinct(S1W.iv_mng_no).from(S1W)
									.where(S1W.iv_no.eq(bind("iv_no"))));
					q4.executeBatchUpdate(ivL2);
				}
			}
			if (!crtDtlL.isEmpty()) {
				MCList<ShipAct_DtlR> crtDtlL2 = crtDtlL.groupBy(ShipAct_DtlR.$ship_alloc_sts_no);
				MCInsert q3 = sql("MSBEL5540_MSW_SHIP_ALLOC_STS_KEY_I03").insert(S0).columns(S0.ship_alloc_sts_no)
						.values(bind("ship_alloc_sts_no"));
				q3.executeBatchUpdate(crtDtlL2);
			}
			if (!updL.isEmpty()) {
				MCList<ShipAct_HdrR> updL2 = updL.groupBy(ShipAct_HdrR.$ship_act_no);
				MST_SHIP_ACT_R S1T1 = MST_SHIP_ACT_R.create("T1");
				MST_SHIP_ACT_D_R S1T2 = MST_SHIP_ACT_D_R.create("T2");
				MSW_SHIP_ALLOC_STS_KEY_R S1W = MSW_SHIP_ALLOC_STS_KEY_R.create("W");
				MCInsert q5 = sql("MSBEL5540_MSW_SHIP_ALLOC_STS_KEY_I02").insert(S0).columns(S0.ship_alloc_sts_no)
						.query(subQuery().selectDistinct(S1T2.ship_alloc_sts_no)
								.from(S1T1.innerJoin(S1T2).on(
										bracket(S1T2.ship_act_no.eq(S1T1.ship_act_no))))
								.where(S1T1.ship_act_no.eq(bind("ship_act_no"))
										.and(notExists(subQuery().select(value("x"))
												.from(S1W).where(S1W.ship_alloc_sts_no
														.eq(S1T2.ship_alloc_sts_no))))));
				q5.executeBatchUpdate(updL2);
				MST_SHIP_ACT_R S2T1 = MST_SHIP_ACT_R.create("T1");
				MST_IV_R S2T2 = MST_IV_R.create("T2");
				MSW_IV_KEY_R S2W = MSW_IV_KEY_R.create("W");
				MCInsert q6 = sql("MSBEL5540_MSW_IV_KEY_I02").insert(S1).columns(S1.iv_mng_no).query(subQuery()
						.selectDistinct(S2T2.iv_mng_no)
						.from(S2T1.innerJoin(S2T2).on(bracket(S2T2.iv_no.eq(S2T1.iv_no))))
						.where(S2T1.ship_act_no.eq(bind("ship_act_no"))
								.and(notExists(subQuery().select(value("x")).from(S2W)
										.where(S2W.iv_mng_no.eq(S2T2.iv_mng_no))))));
				q6.executeBatchUpdate(updL2);
			}
		}

		MCList<MST_SHIP_ALLOC_STS_R> dbc = MCList.create(MST_SHIP_ALLOC_STS_R.class);
		MST_SHIP_ALLOC_STS_R t = MST_SHIP_ALLOC_STS_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MSW_SHIP_ALLOC_STS_KEY_R w = MSW_SHIP_ALLOC_STS_KEY_R.create("W");
		MST_SHIP_SCHD_R t1 = MST_SHIP_SCHD_R.create("T1");
		MST_SHIP_PR_R t2 = MST_SHIP_PR_R.create("T2");
		MST_SLO_D_R t3 = MST_SLO_D_R.create("T3");
		MST_SLO_R t4 = MST_SLO_R.create("T4");
		MST_XFR_SCHD_R t5 = MST_XFR_SCHD_R.create("T5");
		dbc.addBooleanColumn("abort_flg");
		dbc.addBooleanColumn("ship_block_flg");
		dbc.addBooleanColumn("ship_abl_flg");
		dbc.addBooleanColumn("purc_ddlv_flg");
		dbc.addBooleanColumn("aprv_flg");
		dbc.addBooleanColumn("dlv_sundry_flg");
		dbc.addBooleanColumn("cst_iv_flg");
		dbc.addBooleanColumn("iv_trd_flg");
		dbc.addBooleanColumn("sls_cststk_flg");
		dbc.addStringColumn("slo_no");
		dbc.addStringColumn("slo_d_no");
		dbc.addStringColumn("set_itm_grp_no");
		dbc.addBooleanColumn("rqst_can_flg");
		dbc.addStringColumn("site_cd");
		dbc.addStringColumn("gr_sppl_cd");
		dbc.addStringColumn("gi_sppl_cd");
		dbc.addStringColumn("gi_loc_cd");
		dbc.addStringColumn("dlv_lg_grp_cd");
		dbc.addDateColumn("dlv_schd_tm");
		dbc_bldr.setSelect(t.ship_alloc_sts_no, t.ship_schd_no, t.dlv_slip_d_no,
				t.dlv_slip_no, t.lot_no, t.sublot_no, t.base_unit_qty, t1.ship_inst_d_no,
				t1.dlv_inst_rcpt_no, t1.abort_flg, t1.ship_block_flg, t1.ship_abl_flg,
				t1.slo_prms_no, t.ship_act_qty.as("sas_ship_act_qty"), t1.iv_schd_qty,
				t1.base_unit_qty.as("schd_qty"), t1.ship_act_qty.as("ss_ship_act_qty"),
				t1.dlv_schd_tm,
				t2.ship_pr_no, t2.trd_cd, t2.trd_ptn_typ,
				t2.cst_cd, t2.rqst_dpt_cd, t2.rqst_usr_cd, t2.dlv_id_typ,
				nvl(t1.dlv_cd, t2.dlv_id_cd).as("dlv_id_cd"),
				nvl2(t1.dlv_cd, t1.dlv_nm, t2.dlv_id_nm).as("dlv_id_nm"),
				nvl2(t1.dlv_cd, t1.dlv_zip_cd, t2.dlv_zip_cd).as("dlv_zip_cd"),
				nvl2(t1.dlv_cd, t1.dlv_addr1, t2.dlv_addr1).as("dlv_addr1"),
				nvl2(t1.dlv_cd, t1.dlv_addr2, t2.dlv_addr2).as("dlv_addr2"),
				nvl2(t1.dlv_cd, t1.dlv_addr3, t2.dlv_addr3).as("dlv_addr3"),
				nvl2(t1.dlv_cd, t1.dlv_addr4, t2.dlv_addr4).as("dlv_addr4"),
				nvl2(t1.dlv_cd, t1.dlv_cntct_dpt, t2.dlv_cntct_dpt).as("dlv_cntct_dpt"),
				nvl2(t1.dlv_cd, t1.dlv_cntct_psn, t2.dlv_cntct_psn).as("dlv_cntct_psn"),
				nvl2(t1.dlv_cd, t1.dlv_tel, t2.dlv_tel).as("dlv_tel"),
				nvl2(t1.dlv_cd, t1.dlv_fax, t2.dlv_fax).as("dlv_fax"),
				nvl2(t1.dlv_cd, t1.dlv_sundry_flg, t2.dlv_sundry_flg)
						.as("dlv_sundry_flg"),
				t2.dlv_str_ln_cd, t2.ship_inst_typ, t2.purc_ddlv_flg, t2.ship_act_qty,
				t2.sls_qty, t2.dlv_qty, t2.slo_d_no, t3.sls_cststk_flg, t3.set_itm_grp_no,
				t4.slo_no, t4.iv_no, t4.aprv_flg, t4.aprv_no, t4.sls_basis_typ,
				t5.gr_loc_cd, t5.gr_str_ln_cd, t5.slo_d_no.as("xfr_slo_d_no"),
				t5.gi_loc_cd, t5.rqst_can_flg, t.alloc_flg);
		dbc_bldr.addSelect(t1.ship_fr_lg_grp_cd, t1.ship_term_cd);
		dbc_bldr.addInnerJoin(w, bracket(w.ship_alloc_sts_no.eq(t.ship_alloc_sts_no)));
		dbc_bldr.addInnerJoin(t1, bracket(t1.ship_inst_d_no.eq(t.ship_inst_d_no)
				.or(t1.ship_schd_no.eq(t.ship_schd_no))));
		dbc_bldr.addInnerJoin(t2, bracket(t2.ship_pr_no.eq(t1.ship_pr_no)));
		dbc_bldr.addLeftOuterJoin(t3, bracket(t3.slo_d_no.eq(t2.slo_d_no)));
		dbc_bldr.addLeftOuterJoin(t4, bracket(t4.slo_no.eq(t3.slo_no)));
		dbc_bldr.addLeftOuterJoin(t5, bracket(t5.xfr_schd_no.eq(t2.xfr_schd_no)));
		dbc_bldr.setLockTable(t2.ship_pr_no);
		dbc_bldr.setOrderByAsc(t2.ship_pr_no);
		dbSelectForUpdate("MSBEL5540_MST_SHIP_ALLOC_STS_S05", dbc, dbc_bldr);

		// インボイス関連テーブルだけ切り出し
		MSW_IV_KEY_R S1W1 = MSW_IV_KEY_R.create("W1");
		MST_IV_R S1W2 = MST_IV_R.create("W2");
		MST_IV_D_R S1W3 = MST_IV_D_R.create("W3");
		MST_IV_MAP_R S1W4 = MST_IV_MAP_R.create("W4");
		MST_IV_R t7 = MST_IV_R.create("T7");
		MCQueryApiBuilder dbc_iv_bldr = MCQueryApiBuilder.create(S1W1);
		
		dbc_iv_bldr.setSelect(S1W4.iv_d_no, S1W4.ship_schd_no, S1W2.iv_mng_no);
		dbc_iv_bldr.addInnerJoin(S1W2, bracket(S1W2.iv_mng_no.eq(S1W1.iv_mng_no)
							.and(S1W2.iv_ship_flg.eq(value(true)))));
		dbc_iv_bldr.addInnerJoin(S1W3, bracket(S1W3.iv_mng_no.eq(S1W2.iv_mng_no)));
		dbc_iv_bldr.addInnerJoin(S1W4, bracket(S1W4.iv_d_no.eq(S1W3.iv_d_no)));
		dbc_iv_bldr.addLeftOuterJoin(t7, bracket(t7.iv_mng_no.eq(S1W2.iv_mng_no)));
		
		MCList<MST_IV_D_R> lgIvL = MCList.create(MST_IV_D_R.class);
		dbSelect("MSBEL5540_MSW_IV_KEY_S01", lgIvL, dbc_iv_bldr);

		MCIndexKey lgIvIdx = lgIvL.createIndex("ship_schd_no");
		
		dbc.addStringColumn(MST_IV_D_R.$iv_d_no);
		dbc.addStringColumn(MST_IV_D_R.$iv_mng_no);
		
		MCList<MST_SHIP_ALLOC_STS_R> dbc2 = MCList.create(MST_SHIP_ALLOC_STS_R.class);
		for (MST_SHIP_ALLOC_STS_R dbcR : dbc) {
			MCList<MST_IV_D_R> ivdL = lgIvL.subList(lgIvIdx, dbcR.getString("ship_schd_no"));
			if (ivdL.size() == 0) {
				dbc2.add(dbcR);
				continue;
			}
			for (MST_IV_D_R ivdR : ivdL) {
				MST_SHIP_ALLOC_STS_R dbcR2 = dbcR.clone();
				dbcR2.setStringNE(MST_IV_D_R.$iv_d_no, ivdR.iv_d_no());
				dbcR2.setStringNE(MST_IV_D_R.$iv_mng_no, ivdR.iv_mng_no());
				dbc2.add(dbcR2);
			}
		}
		dbc.setAll(dbc2);

		// 入庫場所情報取得
		MCJoinerList<MST_SHIP_ALLOC_STS_R> joinList = new MCJoinerList<>();
		joinList
			.add(MAM_LOC_R.class, r -> toCondition(
				r.getString("gr_loc_cd")
			))
			.addSelect(m -> toArray(
				m.site_cd, m.sppl_cd
			))
			.addMap((r, m) -> {
				r.setString("site_cd", m.site_cd());
				r.setString("gr_sppl_cd", m.sppl_cd());
			});
		joinList.join(dbc);
		
		// 出庫場所情報取得
		joinList
			.add(MAM_LOC_R.class, r -> toCondition(
				r.getString("gi_loc_cd")
			))
			.addSelect(m -> toArray(
				m.sppl_cd
			))
			.addMap((r, m) -> {
				r.setString("gi_sppl_cd", m.sppl_cd());
			});
		joinList.join(dbc);
		
		// 取引先情報取得
		joinList
			.add(MAM_BP_R.class, r -> toCondition(
				r.getString("cst_cd")
			))
			.addSelect(m -> toArray(
				m.cst_iv_flg
			))
			.addMap((r, m) -> {
				r.setBoolean("cst_iv_flg", m.cst_iv_flg());
			});
		joinList.join(dbc);
		
		// 納入先識別情報取得
		joinList
			.add(MSVM_DLV_ID_R.class, r -> toCondition(
				r.getString("dlv_id_typ"), r.getString("dlv_id_cd")
			))
			.addSelect(m -> toArray(
				m.lg_grp_cd
			))
			.addMap((r, m) -> {
				r.setString("dlv_lg_grp_cd", m.lg_grp_cd());
			});
		joinList.join(dbc);
		
		// 物流制御情報取得
		MAM_LG_CTL_R l = MAM_LG_CTL_R.create("T");
		MCQueryApiBuilder lgCtlLL_bldr = MCQueryApiBuilder.create(l);
		MCList<MAM_LG_CTL_R> wkL = MCList.create(MAM_LG_CTL_R.class);
		for (MST_SHIP_ALLOC_STS_R dbcR : dbc) {
			MAM_LG_CTL_R wkR = MAM_LG_CTL_R.create();
			wkR.fr_lg_grp_cd(dbcR.getString("ship_fr_lg_grp_cd"));
			wkR.to_lg_grp_cd(dbcR.getString("dlv_lg_grp_cd"));
			wkR.ship_term_cd(dbcR.getString("ship_term_cd"));
			wkL.add(wkR);
		}
		dbWkDelete("MSBEL5540_MAW_LG_CTL_D01", lgCtlLL_bldr.getBaseDbc());
		dbWkInsert("MSBEL5540_MAW_LG_CTL_I01", wkL, lgCtlLL_bldr.getBaseDbc());
		
		MAW_LG_CTL_KEY_R lgW = MAW_LG_CTL_KEY_R.create("W");
		lgCtlLL_bldr.setSelect(l.fr_lg_grp_cd, l.to_lg_grp_cd, l.ship_term_cd, l.iv_trd_flg);
		lgCtlLL_bldr.addInnerJoin(lgW, bracket(l.fr_lg_grp_cd.eq(lgW.fr_lg_grp_cd))
											.and(l.to_lg_grp_cd.eq(lgW.to_lg_grp_cd))
											.and(bracket(l.ship_term_cd.eq(lgW.ship_term_cd).or(l.ship_term_cd.eq(value(MAC_STR.NULL_VAL.value()))))));

		MCList<MAM_LG_CTL_R> lgCtlL = MCList.create(MAM_LG_CTL_R.class);
		dbSelect("MSBEL5540_MAM_LG_CTL_S01", lgCtlL, lgCtlLL_bldr);
		
		MCIndexKey lgCtlIdx = lgCtlL.createIndex(MAM_LG_CTL_R.$fr_lg_grp_cd, MAM_LG_CTL_R.$to_lg_grp_cd, MAM_LG_CTL_R.$ship_term_cd);
		
		// 出荷条件が一致するほうを優先する
		for (MST_SHIP_ALLOC_STS_R dbcR : dbc) {
			if (MAC_TRD_PTN_TYP.isPROV_RTN(dbcR.getString("trd_ptn_typ"))) {
				dbcR.setBoolean(MAM_LG_CTL_R.$iv_trd_flg, false);
			}
			else {
				MAM_LG_CTL_R lgR = lgCtlL.getFirst(lgCtlIdx, dbcR.getString("ship_fr_lg_grp_cd"),
							dbcR.getString("dlv_lg_grp_cd"),
							dbcR.getString("ship_term_cd"));
				if (!isNull(lgR)) {
					dbcR.setBoolean(MAM_LG_CTL_R.$iv_trd_flg, lgR.iv_trd_flg());
				}
				else {
					MAM_LG_CTL_R lgRNullVal = 
					lgCtlL.getFirst(lgCtlIdx, dbcR.getString("ship_fr_lg_grp_cd"),
											dbcR.getString("dlv_lg_grp_cd"),
											MAC_STR.NULL_VAL.value());
					if (!isNull(lgRNullVal)) {
						dbcR.setBoolean(MAM_LG_CTL_R.$iv_trd_flg, lgRNullVal.iv_trd_flg());
					}
				}
			}
		}
		MCIndexKey idx = dbc.createIndex(MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no);

		lockIv(dbc);

		if (object(CLAZZ)._shipAllocStsCache == null) {
			object(CLAZZ)._shipAllocStsCache = new FXUCL_Cache<MCList<MST_SHIP_ALLOC_STS_R>>();
			object(CLAZZ)._shipAllocStsCache.setFixMaxCacheSize(-1);
		}
		for (MST_SHIP_ALLOC_STS_R r : dbc) {
			Comparable<?>[] key = r.toArray(idx.getKeys());
			object(CLAZZ)._shipAllocStsCache.putCache(key, dbc.subList(idx, key));
		}
	}

	protected void lockIv(MCList<MST_SHIP_ALLOC_STS_R> selectL) {
		MCList<MST_IV_R> ivBindL = MCList.create(MST_IV_R.class);
		for (MST_SHIP_ALLOC_STS_R selR : selectL) {
			String ivMngNo = selR.getStringNE(MST_IV_R.$iv_mng_no);
			if (!isNull(ivMngNo)) {
				MST_IV_R tmp = MST_IV_R.create();
				tmp.iv_mng_no(ivMngNo);
				ivBindL.add(tmp);
			}
		}
		if (!ivBindL.isEmpty()) {
			MST_IV_R t = MST_IV_R.create("T");
			MCQueryApiBuilder ivBuilder = MCQueryApiBuilder.create(t);
			ivBuilder.setSelect(t.iv_mng_no);
			ivBuilder.setOrderByAsc(t.iv_mng_no);
			dbSelectKeyForUpdateNoFetch("MSBEL5540_MST_IV_S04", ivBuilder, ivBindL);
		}
	}

	/**
	 * キャッシュから出荷引当状況を取得する<br>
	 * 「売上」「出荷」の場合のみ使用する。左記以外の取引パタンの場合はnullを返す<br>
	 * ※「売上」「出荷」は指図まとめがないため、１行に限定することができる
	 */
	protected MST_SHIP_ALLOC_STS_R getShipAllocStsR(ShipAct_DtlR dtlR) {
		if (MAC_TRD_PTN_TYP.isSLS(dtlR.trd_ptn_typ())
			|| MAC_TRD_PTN_TYP.isSHIP(dtlR.trd_ptn_typ())) {

			MCList<MST_SHIP_ALLOC_STS_R> lst = getShipAllocStsL(dtlR);
			if (lst != null && !lst.isEmpty()) {
				return lst.get(0);
			}
		}
		return null;
	}

	/**
	 * キャッシュから出荷引当状況を取得する
	 */
	protected MCList<MST_SHIP_ALLOC_STS_R> getShipAllocStsL(ShipAct_DtlR dtlR) {
		Comparable<?>[] key = dtlR.toArray(ShipAct_DtlR.$ship_alloc_sts_no); // キャッシュ作成時のキーと同じタイプのキーにしないと、取得出来ません。
		return object(CLAZZ)._shipAllocStsCache.getCache(key);
	}
	
	/**
	 * 部門マスタのキャッシュ<br>
	 */
	protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _dptCache = null;
	protected MAM_DPT_R getDptR(String dptCd, MCDate dt) {
		if (object(CLAZZ)._dptCache == null) {
			MAM_DPT_R t = MAM_DPT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.dpt_cd, t.wg_cd);
			object(CLAZZ)._dptCache = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(dbc_bldr);
		}
		return object(CLAZZ)._dptCache.get(dt, dptCd);
	}

	/**
	 * 物流Ｇマスタのキャッシュ<br>
	 */
	protected FXUCL_MCDbcCache<MAM_LG_GRP_R> _lgGrpCache = null;
	protected MAM_LG_GRP_R getLgGppR(String lgGrpCd) {
		if (object(CLAZZ)._lgGrpCache == null) {
			MAM_LG_GRP_R t = MAM_LG_GRP_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.wg_cd, t.gi_minus_stk_chk_flg);
			object(CLAZZ)._lgGrpCache = new FXUCL_MCDbcCache<MAM_LG_GRP_R>(dbc_bldr);
		}
		return object(CLAZZ)._lgGrpCache.get(lgGrpCd);
	}

	/**
	 * 支給予定のキャッシュ<br>
	 */
	public class ProvSchdCache {
		protected MCList<MST_PROV_SCHD_R> _provSchdL = null;
		protected MCIndexKey _idx = null;
		protected ProvSchdCache(MCList<ShipAct_DtlR> dtlL) {
			_provSchdL = MCList.create(MST_PROV_SCHD_R.class);
			crtIdx();
		}
		protected void doCache(MCList<ShipAct_DtlR> dtlL) {
			MCList<MST_PROV_SCHD_R> dbc = MCList.create(MST_PROV_SCHD_R.class);
			MST_PROV_SCHD_R t = MST_PROV_SCHD_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelectAll();
			dbc_bldr.setWhere(t.prov_src_schd_typ.eq(value(MSC_PROV_SRC_SCHD_TYP.SHIP.value())));
			dbc_bldr.addWhereWithAnd(t.prov_src_schd_no1.eq(bind("ship_schd_no")));
			dbc_bldr.addWhereWithAnd(t.prov_src_schd_no2.eq(value(MAC_STR.NULL_VAL.value())));
			dbSelect("MSBEL5540_MST_PROV_SCHD_S01", dbc, dbc_bldr, dtlL);

			MCList<MST_PROV_SCHD_R> l = MCList.create(MST_PROV_SCHD_R.class);
			dbc.forEach(r -> {
				MST_PROV_SCHD_R provR = get(r.prov_src_schd_no1(), r.trd_ptn_typ());
				if (!isNull(provR)) {
					l.add(provR);
				}
			});
			if (!l.isEmpty()) {
				_provSchdL.removeAll(l);
			}

			_provSchdL.addAll(dbc);
			crtIdx();
		}
		protected void crtIdx() {
			_idx = _provSchdL.createIndex(
				MST_PROV_SCHD_R.$prov_src_schd_no1,
				MST_PROV_SCHD_R.$trd_ptn_typ);
		}
		protected MST_PROV_SCHD_R get(String shipSchdNo, String trdPtnTyp) {
			return _provSchdL.getFirst(_idx, shipSchdNo, trdPtnTyp);
		}
	}
	protected ProvSchdCache _provSchdCache = null;
	protected void doProvSchdCache(MCList<ShipAct_DtlR> dtlL) {
		if (object(CLAZZ)._provSchdCache == null) {
			object(CLAZZ)._provSchdCache = new ProvSchdCache(dtlL);
		}
		object(CLAZZ)._provSchdCache.doCache(dtlL);
	}
	protected MST_PROV_SCHD_R getProvSchdR(String shipSchdNo, String trdPtnTyp) {
		return object(CLAZZ)._provSchdCache.get(shipSchdNo, trdPtnTyp);
	}

	/**
	 * 支給実績のキャッシュ
	 */
	public class ProvActCache {
		protected MCList<MST_PROV_ACT_R> _provActL = null;
		protected MCIndexKey _idx = null;
		protected ProvActCache(MCList<ShipAct_DtlR> dtlL) {
			_provActL = MCList.create(MST_PROV_ACT_R.class);
			crtIdx();
		}
		protected void doCache(MCList<ShipAct_DtlR> dtlL) {
			MCList<MST_PROV_ACT_R> dbc = MCList.create(MST_PROV_ACT_R.class);
			MST_PROV_ACT_R t = MST_PROV_ACT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelectAll();
			dbc_bldr.setWhere(t.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.RET_SHIP.value())));
			dbc_bldr.addWhereWithAnd(t.prov_src_act_no.eq(bind("ship_act_d_no")));
			dbc_bldr.addWhereWithAnd(t.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			dbSelect("MSBEL5540_MST_PROV_ACT_S01", dbc, dbc_bldr, dtlL);

			MCList<MST_PROV_ACT_R> l = MCList.create(MST_PROV_ACT_R.class);
			dbc.forEach(r -> {
				MST_PROV_ACT_R provR = get(r.prov_src_act_no());
				if (!isNull(provR)) {
					l.add(provR);
				}
			});
			if (!l.isEmpty()) {
				_provActL.removeAll(l);
			}

			_provActL.addAll(dbc);
			crtIdx();
		}
		protected void crtIdx() {
			_idx = _provActL.createIndex(MST_PROV_ACT_R.$prov_src_act_no);
		}
		protected MST_PROV_ACT_R get(String shipActDNo) {
			return _provActL.getFirst(_idx, shipActDNo);
		}
	}
	protected ProvActCache _provActCache = null;
	protected void doProvActCache(MCList<ShipAct_DtlR> dtlL) {
		if (object(CLAZZ)._provActCache == null) {
			object(CLAZZ)._provActCache = new ProvActCache(dtlL);
		}
		object(CLAZZ)._provActCache.doCache(dtlL);
	}
	protected MST_PROV_ACT_R getProvActR(String shipActDNo) {
		return object(CLAZZ)._provActCache.get(shipActDNo);
	}
	/**
	 * ShipAct_RevUpd01オペレーション.<p>
	 *
	 * 出荷実績改訂履歴テーブルを更新する。改訂履歴データ更新用の共通処理（MAUCL5020）から呼び出される。<br>
	 */
	public class ShipAct_RevUpd01 extends MSBEL_ShipActService_MC_A.ShipAct_RevUpd01 {

		MCList<MST_SHIP_ACT_R> _hCurrentL = MCList.create(MST_SHIP_ACT_R.class);
		MST_SHIP_ACT_R _hCurrentL_t = MST_SHIP_ACT_R.create("T");
		MCQueryApiBuilder _hCurrentL_bldr = MCQueryApiBuilder.create(_hCurrentL_t);
		MCList<MST_SHIP_ACT_D_R> _dCurrentL = MCList.create(MST_SHIP_ACT_D_R.class);
		MST_SHIP_ACT_D_R _dCurrentL_t = MST_SHIP_ACT_D_R.create("T");
		MCQueryApiBuilder _dCurrentL_bldr = MCQueryApiBuilder.create(_dCurrentL_t);
		MCList<MST_SHIP_ACT_P_R> _hRevL = MCList.create(MST_SHIP_ACT_P_R.class);
		MST_SHIP_ACT_P_R _hRevL_t = MST_SHIP_ACT_P_R.create("T");
		MCQueryApiBuilder _hRevL_bldr = MCQueryApiBuilder.create(_hRevL_t);
		MCList<MST_SHIP_ACT_D_P_R> _dRevL = MCList.create(MST_SHIP_ACT_D_P_R.class);
		MST_SHIP_ACT_D_P_R _dRevL_t = MST_SHIP_ACT_D_P_R.create("T");
		MCQueryApiBuilder _dRevL_bldr = MCQueryApiBuilder.create(_dRevL_t);

		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			wkInsert();
			selectCurrentAndRev();
			revisionInsOrUpd();
		}
		
		/**
		 * 上り電文の項目を本体・改訂履歴ヘッダーのワークテーブルに設定
		 */
		protected void wkInsert() {
			MCList<MST_SHIP_ACT_R> wkL = MCList.create(MST_SHIP_ACT_R.class);
			for (RevData_Upd01_DtlR r : up0()) {
				MST_SHIP_ACT_R wkR = MST_SHIP_ACT_R.create();
				wkR.ship_act_no(r.rev_data_src_no());
				wkL.add(wkR);
			}
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_SHIP_ACT_R.create("T"));
			dbWkDelete("MSBEL5540_MSW_SHIP_ACT_D02", wkL_bldr.getBaseDbc());
			MCList<MST_SHIP_ACT_R> wkL2 = wkL.groupBy(wkL_bldr.getBaseDbc().getKeyColumn());
			MCQueryApiBuilder wkL2_bldr = MCQueryApiBuilder.create(MST_SHIP_ACT_R.create("T"));
			dbWkInsert("MSBEL5540_MSW_SHIP_ACT_I02", wkL2, wkL2_bldr.getBaseDbc());
			MCList<MST_SHIP_ACT_P_R> wkpL = MCList.create(MST_SHIP_ACT_P_R.class);

			for (RevData_Upd01_DtlR r : up0()) {
				MST_SHIP_ACT_P_R wkpR = MST_SHIP_ACT_P_R.create();
				wkpR.ship_act_no(r.rev_data_src_no());
				wkpR.ship_act_rev(r.rev_no());
				wkpL.add(wkpR);
			}
			MCQueryApiBuilder wkpL_bldr = MCQueryApiBuilder.create(MST_SHIP_ACT_P_R.create("T"));
			dbWkDelete("MSBEL5540_MSW_SHIP_ACT_P_D01", wkpL_bldr.getBaseDbc());
			MCList<MST_SHIP_ACT_P_R> wkpL2 = wkpL.groupBy(wkpL_bldr.getBaseDbc().getKeyColumn());
			MCQueryApiBuilder wkpL2_bldr = MCQueryApiBuilder.create(MST_SHIP_ACT_P_R.create("T"));
			dbWkInsert("MSBEL5540_MSW_SHIP_ACT_P_I01", wkpL2, wkpL2_bldr.getBaseDbc());
		}
		
		/**
		 * 本体テーブルと改訂履歴テーブルからリストを取得
		 */
		protected void selectCurrentAndRev() {
			MSW_SHIP_ACT_KEY_R w1 = MSW_SHIP_ACT_KEY_R.create("W");
			MSW_SHIP_ACT_P_KEY_R w2 = MSW_SHIP_ACT_P_KEY_R.create("W");
			
			_hCurrentL_bldr.addInnerJoin(w1, bracket(_hCurrentL_t.ship_act_no.eq(w1.ship_act_no)));
			dbSelect("MSBEL5540_MST_SHIP_ACT_S04", _hCurrentL, _hCurrentL_bldr);
			_dCurrentL_bldr.addInnerJoin(w1, bracket(_dCurrentL_t.ship_act_no.eq(w1.ship_act_no)));
			dbSelect("MSBEL5540_MST_SHIP_ACT_D_S08", _dCurrentL, _dCurrentL_bldr);

			_hRevL_bldr.addInnerJoin(w2, bracket(_hRevL_t.ship_act_no.eq(w2.ship_act_no)
					.and(_hRevL_t.ship_act_rev.eq(w2.ship_act_rev))));
			dbSelect("MSBEL5540_MST_SHIP_ACT_P_S01", _hRevL, _hRevL_bldr);
			_dRevL_bldr.addInnerJoin(w2, bracket(_dRevL_t.ship_act_no.eq(w2.ship_act_no)
					.and(_dRevL_t.ship_act_rev.eq(w2.ship_act_rev))));
			dbSelect("MSBEL5540_MST_SHIP_ACT_D_P_S01", _dRevL, _dRevL_bldr);
		}
		
		/**
		 * 本番テーブルのデータを元に、改訂履歴テーブルを追加又は更新する。
		 */
		protected void revisionInsOrUpd() {
			// ヘッダーの改訂履歴テーブルを追加又は更新する。
			MCIndexKey hRevIdx = _hRevL.createIndex(MST_SHIP_ACT_P_R.$ship_act_no, MST_SHIP_ACT_P_R.$ship_act_rev);
			MCList<MST_SHIP_ACT_P_R> hUpd = MCList.create(MST_SHIP_ACT_P_R.class);

			MCList<MST_SHIP_ACT_P_R> hIns = MCList.create(MST_SHIP_ACT_P_R.class);

			for (MST_SHIP_ACT_R hcurrentR : _hCurrentL) {
				
				MST_SHIP_ACT_P_R tempRevR = MST_SHIP_ACT_P_R.create();
				tempRevR.setByName(hcurrentR);
				if (_hRevL == null || isNull(_hRevL.getFirst(hRevIdx, hcurrentR.ship_act_no(), hcurrentR.ship_act_rev()))) {
					hIns.add(tempRevR);
				}
				else {
					hUpd.add(tempRevR);
				}
			}
			MCQueryApiBuilder hIns_bldr = MCQueryApiBuilder.create(MST_SHIP_ACT_P_R.create("T"));
			MCQueryApiBuilder hUpd_bldr = MCQueryApiBuilder.create(MST_SHIP_ACT_P_R.create("T"));
			if (!isNull(hIns)) {
				dbInsert("MSBEL5540_MST_SHIP_ACT_P_I01", hIns, hIns_bldr);
			}
			if (!isNull(hUpd)) {
				hUpd_bldr.removeSet(hUpd_bldr.getBaseDbc().getKeyColumn());
				dbUpdateKey("MSBEL5540_MST_SHIP_ACT_P_U01", hUpd, hUpd_bldr);
			}
			
			// 明細の改訂履歴テーブルを追加又は更新する。
			MCIndexKey dRevIdx = _dRevL.createIndex(MST_SHIP_ACT_D_P_R.$ship_act_rev, MST_SHIP_ACT_D_P_R.$ship_act_d_no);
			MCIndexKey hCurrentIdx = _hCurrentL.createIndex(MST_SHIP_ACT_R.$ship_act_no);
			MCList<MST_SHIP_ACT_D_P_R> dUpd = MCList.create(MST_SHIP_ACT_D_P_R.class);
			MCList<MST_SHIP_ACT_D_P_R> dIns = MCList.create(MST_SHIP_ACT_D_P_R.class);
			MCList<MST_SHIP_ACT_D_P_R> dDel = MCList.create(MST_SHIP_ACT_D_P_R.class);
			MCIndexKey hRevDIdx = _dRevL.createIndex(MST_SHIP_ACT_D_P_R.$ship_act_rev, MST_SHIP_ACT_D_P_R.$can_flg);
			
			for (MST_SHIP_ACT_D_R dcurrentR : _dCurrentL) {
				MST_SHIP_ACT_D_P_R tempRevR = MST_SHIP_ACT_D_P_R.create();
				tempRevR.setByName(dcurrentR);
				
				// ヘッダーより改訂番号を取得
				MST_SHIP_ACT_R hCurrentR = _hCurrentL.getFirst(hCurrentIdx, dcurrentR.ship_act_no());
				tempRevR.ship_act_rev(hCurrentR.ship_act_rev());

				// 履歴テーブルのなかで、今回削除した改訂番号のデータに紐づくもの
				MST_SHIP_ACT_D_P_R revR = _dRevL.getFirst(dRevIdx, tempRevR.ship_act_rev(), tempRevR.ship_act_d_no());
				// 同一ヘッダ同一改訂番号の履歴データ 
				MCList<MST_SHIP_ACT_D_P_R> hDRevL = _dRevL.subList(hRevDIdx, hCurrentR.ship_act_rev(), false);

				if (_dRevL == null || isNull(revR)) {
					if (hCurrentR.can_flg()) {
						continue;
					}
					dIns.add(tempRevR);
				}
				else {
					if (hCurrentR.can_flg() && revR.can_flg() && !hDRevL.isEmpty()) {
						dDel.add(tempRevR);
					}
					else {
						dUpd.add(tempRevR);
					}
				}
				
			}
			
			MCQueryApiBuilder dUpd_bldr = MCQueryApiBuilder.create(MST_SHIP_ACT_D_P_R.create("T"));
			MCQueryApiBuilder dIns_bldr = MCQueryApiBuilder.create(MST_SHIP_ACT_D_P_R.create("T"));
			MCQueryApiBuilder dDel_bldr = MCQueryApiBuilder.create(MST_SHIP_ACT_D_P_R.create("T"));

			if (!isNull(dIns)) {
				dbInsert("MSBEL5540_MST_SHIP_ACT_D_P_I01", dIns, dIns_bldr);
			}
			if (!isNull(dUpd)) {
				dUpd_bldr.removeSet(dUpd_bldr.getBaseDbc().getKeyColumn());
				dbUpdateKey("MSBEL5540_MST_SHIP_ACT_D_P_U01", dUpd, dUpd_bldr);
			}
			if (!isNull(dDel)) {
				dbDeleteKey("MSBEL5540_MST_SHIP_ACT_D_P_D01", dDel, dDel_bldr);
			}
		}
	}

	//FMCB CUSTOM END
}