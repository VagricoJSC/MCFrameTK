package mcframe.serverMSBB.MSBBL6070;

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
import mcframe.commonCore.report.container.*;
import mcframe.serverCore.report.MCServerReportManager;
import mcframe.serverMSUC.MSUCL0120.*;
import mcframe.commonMSBB.MSBBR0070.*;
import java.util.*;
import java.util.Map.*;
import static mcframe.serverCore.dbc.CoreFunction.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBL_SloPrmsPrntService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBL_SloPrmsPrntService_MC extends MSBBL_SloPrmsPrntService_MC_A{
	//FMCB CUSTOM START

	/**
	 * SloPrms_Prnt01オペレーション.<p>
	 *
	 * 納期回答書を発行します。<br>
	 */
	public class SloPrms_Prnt01 extends MSBBL_SloPrmsPrntService_MC_A.SloPrms_Prnt01 {
		/** 納期回答書ReportSetマップ */
		protected Map<List<String>, List<MSBBR_SloPrms>> _sloPrmsReportMap =  new LinkedHashMap<List<String>, List<MSBBR_SloPrms>>();
		
		/** ロック対象 */
		protected MCList<MST_SLO_R> _lockSloL = MCList.create(MST_SLO_R.class);
		protected MCList<MST_SLO_PRMS_H_R> _lockSloPrmsHL = MCList.create(MST_SLO_PRMS_H_R.class);
		protected MCList<MST_SHIP_PR_R> _lockShipPrL = MCList.create(MST_SHIP_PR_R.class);
		protected MCIndexKey _lockSloKey;
		protected MCIndexKey _lockSloPrmsHKey;
		protected MCIndexKey _lockShipPrKey;
		
		/** エラー行以外のリスト */
		protected MCList<SloPrms_Prnt01_HdrR> _up0L = MCList.create(SloPrms_Prnt01_HdrR.class);
		
		/** 更新対象 */
		protected MCList<MST_SLO_PRMS_H_R> _updSloPrmsHL = MCList.create(MST_SLO_PRMS_H_R.class);
		protected MST_SLO_PRMS_H_R _updSloPrmsHL_t = MST_SLO_PRMS_H_R.create("T");
		protected MCQueryApiBuilder _updSloPrmsHL_bldr = MCQueryApiBuilder.create(_updSloPrmsHL_t);
		
		protected MCDate _prntHm = MCDate.now();
		protected MCList<BpUtil_Sprt01_DtlR> _bpUtil = MCList.create(BpUtil_Sprt01_DtlR.class);
		protected MCIndexKey _bpUtilkey;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			lock();
			check();
			execPrnt();
			upd();
		}
		
		protected void lock() {
			sloLock();
			sloPrmsHLock();
			shipPrLock();
		}
		
		protected void check() {
			MCIndexKey key = _lockSloPrmsHL.createIndex(MST_SLO_PRMS_H_R.$slo_prms_h_no, MST_SLO_PRMS_H_R.$slo_prms_rev);
			
			for (SloPrms_Prnt01_HdrR up : up0()) {
				MST_SLO_PRMS_H_R chkR = _lockSloPrmsHL.getFirst(key, up.slo_prms_h_no(), up.slo_prms_rev());
				
				if (chkR == null) {
					MCMessagePool.addAll(getRecordNotFoundMsg(
							"MS", "MST_SLO_PRMS_H", key.getKeys(), up.toArray(key.getKeys()), up));
					up.err_flg(true);
				}
				else {
					_up0L.add(up);
				}
				down0().add(up);
			}
		}
		
		protected void execPrnt() {
			// 画面の個別発行フラグがオフの場合、個別発行フラグ取得
			if (!up1().indiv_prnt_flg()) {
				getIndivPrnt();
			}
			
			// 受注納期回答ヘッダ単位で印刷データを作成
			MCGroupByPolicy gpPrmsNo = new MCGroupByPolicy(SloPrms_Prnt01_HdrR.$slo_no, SloPrms_Prnt01_HdrR.$slo_d_no, SloPrms_Prnt01_HdrR.$slo_prms_h_no);
			MCList<SloPrms_Prnt01_HdrR> prmsNoSubL = _up0L.groupBy(gpPrmsNo);
			prmsNoSubL.sort(SortType.ASC, SloPrms_Prnt01_HdrR.$slo_d_no, SloPrms_Prnt01_HdrR.$slo_prms_h_no);
			for (SloPrms_Prnt01_HdrR up1R : prmsNoSubL) {
				createSloPrmsPrnt(up1R);
			}
			requestSloPrms();
		}
		
		protected void upd() {
			updSloPrmsH();
		}
		
		protected void createSloPrmsPrnt(SloPrms_Prnt01_HdrR up1R) {
			//取消納期回答書
			MSBBR_SloPrms repSetCan = null;
			//新規作成分
			MSBBR_SloPrms repSetNew = null;
			MST_SLO_PRMS_H_R sloPrmsHR = _lockSloPrmsHL.getFirst(_lockSloPrmsHKey, up1R.slo_prms_h_no());
			
			MST_SLO_R r = _lockSloL.getFirst(_lockSloKey, up1R.slo_no());
			sloPrmsHR.addStringColumn("slo_no", up1R.slo_no());
			sloPrmsHR.addStringColumn("prnt_lcl_cd", r.getString("prnt_lcl_cd"));
			if (isNull(sloPrmsHR.last_prms_rev())) {
				sloPrmsHR.last_prms_rev(MCNumber.ZERO);
			}
			MCNumber newRev = sloPrmsHR.last_prms_rev().add(1);
			
			if (isReprntSloPrms(sloPrmsHR)) {
				
				MCReportInfoR infoR = srchSloPrmsReprintInfo(sloPrmsHR.slo_prms_h_no(), sloPrmsHR.last_prms_rev().toString(), sloPrmsHR.getString("prnt_lcl_cd"), null);
				
				if (isNull(infoR)) {
					return;
				}
				repSetNew = (MSBBR_SloPrms) MCServerReportManager.toReportSet(infoR);
				
				// 訂正の場合の取消
				if (isUpdReprintSloPrms(infoR)) {
					MCNumber canRev = sloPrmsHR.last_prms_rev().subtract(1);
					MCReportInfoR infoCanR = srchSloPrmsReprintInfo(sloPrmsHR.slo_prms_h_no(), canRev.toString(), sloPrmsHR.getString("prnt_lcl_cd"), MAC_RPT_STS_TYP.CAN.value());
					
					if (isNull(infoCanR)) {
						return;
					}
					repSetCan = (MSBBR_SloPrms) MCServerReportManager.toReportSet(infoCanR);
					if (repSetCan != null) {
						_sloPrmsReportMap.put(Arrays.asList(new String[] {sloPrmsHR.slo_prms_h_no(), sloPrmsHR.last_prms_rev.toString()}),
								new ArrayList<MSBBR_SloPrms>(Arrays.asList(new MSBBR_SloPrms[] {repSetCan})));
					}
				}
				
				List<MSBBR_SloPrms> l = _sloPrmsReportMap.get(Arrays.asList(new String[] {sloPrmsHR.slo_prms_h_no(), sloPrmsHR.last_prms_rev().toString()}));
				if (null == l) {
					l = new ArrayList<MSBBR_SloPrms>(Arrays.asList(new MSBBR_SloPrms[] {repSetNew}));
				}
				else {
					l.add(repSetNew);
				}
				_sloPrmsReportMap.put(Arrays.asList(new String[] {sloPrmsHR.slo_prms_h_no(), sloPrmsHR.last_prms_rev().toString()}), l);
				return;
			}
			
			// 取消納期回答書
			if (!isCrtSloPrms(sloPrmsHR) && !isNotPrntSloPrms(sloPrmsHR)) {
				MCReportInfoR infoR = srchSloPrmsReprintInfo(sloPrmsHR.slo_prms_h_no(), sloPrmsHR.last_prms_rev().toString(), sloPrmsHR.getString("prnt_lcl_cd"), null);
				if (isNull(infoR)) {
					return;
				}
				repSetCan = getCanSloPrms(infoR, sloPrmsHR);
				MCServerReportManager.request(repSetCan, false);
				
				setSloPrmsHUpdData(sloPrmsHR, sloPrmsHR.last_prms_rev());
			}
			
			// 発行データ作成（新規登録、訂正後）
			if (!sloPrmsHR.can_flg()) {
				repSetNew = createSloPrms(sloPrmsHR);
				// 印刷データの登録のみ
				MCServerReportManager.request(repSetNew, false);
				
				setSloPrmsHUpdData(sloPrmsHR, newRev);
			}
			
			// 納期回答訂正時は、取消納期回答書、訂正納期回答書の順でまとめてレポートセットを作成
			if (repSetCan != null) {
				_sloPrmsReportMap.put(Arrays.asList(new String[] {sloPrmsHR.slo_prms_h_no(), newRev.toString()}),
						new ArrayList<MSBBR_SloPrms>(Arrays.asList(new MSBBR_SloPrms[] {repSetCan})));
			}
			if (repSetNew != null) {
				List<MSBBR_SloPrms> l = _sloPrmsReportMap.get(Arrays.asList(new String[] {sloPrmsHR.slo_prms_h_no(), newRev.toString()}));
				if (null == l) {
					l = new ArrayList<MSBBR_SloPrms>(Arrays.asList(new MSBBR_SloPrms[] {repSetNew}));
				}
				else {
					l.add(repSetNew);
				}
				_sloPrmsReportMap.put(Arrays.asList(new String[] {sloPrmsHR.slo_prms_h_no(), newRev.toString()}), l);
			}
		}
		
		protected void updSloPrmsH() {
			setCondSloPrmsH();
			dbUpdateKey("MSBBL6070_MST_SLO_PRMS_H_U01", _updSloPrmsHL, _updSloPrmsHL_bldr);
		}
		
		protected void setCondSloPrmsH() {
			_updSloPrmsHL_bldr.setSet(_updSloPrmsHL_t.slo_prms_prnt_flg);
			_updSloPrmsHL_bldr.addSet(_updSloPrmsHL_t.last_prms_rev);
			_updSloPrmsHL_bldr.addSet(_updSloPrmsHL_t.prms_prnt_tm);
		}
		
		/**
		 * 納期回答書再発行か
		 */
		protected boolean isReprntSloPrms(MST_SLO_PRMS_H_R sloPrmsHR) {
			return sloPrmsHR.slo_prms_prnt_flg();
		}
		
		/**
		 * 訂正の納入指示書か
		 * @param infoR
		 * @return 納入指示書の場合にtrue
		 */
		protected boolean isUpdReprintSloPrms(MCReportInfoR infoR) {
			MSBBR_SloPrms repSet = (MSBBR_SloPrms) MCServerReportManager.toReportSet(infoR);
			String bt = repSet.getBlockType(SloPrmsHdrR.create());
			@SuppressWarnings("unchecked")
			MCList<MCRow> hdrL = repSet.getAll(bt);
			if (hdrL == null || hdrL.isEmpty()) {
				return false;
			}
			SloPrmsHdrR hdrR = (SloPrmsHdrR) hdrL.get(0);
			return MAC_RPT_STS_TYP.isCOR(hdrR.rpt_sts_typ());
		}
		
		protected MCReportInfoR srchSloPrmsReprintInfo(String prmsNo, String lastPrmsRev, String lclCd, String repSts) {
			MSBBR_SloPrms sloPrmsPrnt = MSBBR_SloPrms.create();
			sloPrmsPrnt.setAppReportNo1(prmsNo);
			sloPrmsPrnt.setAppReportNo2(lastPrmsRev);
			sloPrmsPrnt.setLocale(toLocaleFromLclCd(lclCd));
			if (!isNull(repSts)) {
				sloPrmsPrnt.setAppReportSts1(repSts);
			}
			
			// 印刷データからデータを取得
			MCList<MCReportInfoR> infoL = MCServerReportManager.searchPrintData(sloPrmsPrnt, false);
			if (infoL == null) {
				return null;
			}
			return infoL.get(0);
		}
		
		protected MSBBR_SloPrms getCanSloPrms(MCReportInfoR infoR, MST_SLO_PRMS_H_R sloPrmsHR) {
			// RportSetに変換して編集。業務情報で検索して1件のみ取得される。
			MSBBR_SloPrms repSet = (MSBBR_SloPrms) MCServerReportManager.toReportSet(infoR);
			
			//訂正、取消時の取消納入指示書データ作成
			String bt = repSet.getBlockType(SloPrmsHdrR.create());
			@SuppressWarnings("unchecked")
			MCList<MCRow> hdrL = repSet.getAll(bt);
			if (hdrL == null || hdrL.isEmpty()) {
				return null;
			}
			
			//訂正、取消後のデータ作成
			//ヘッダは1行のみ取得される
			SloPrmsHdrR hdrR = (SloPrmsHdrR) hdrL.get(0);
			hdrR.rpt_sts_typ(MAC_RPT_STS_TYP.CAN.value());
			MAC_RPT_STS_TYP.putNameNE(hdrR, SloPrmsHdrR.$rpt_sts_typ, SloPrmsHdrR.$rpt_sts_typ_nm, repSet.getLocale());
			repSet.setAppReportSts1(hdrR.rpt_sts_typ());
			repSet.setAppReportStsNm1(hdrR.rpt_sts_typ_nm());
			
			return repSet;
		}
		
		/**
		 * 受注納期回答ヘッダ更新情報設定
		 */
		protected void setSloPrmsHUpdData(MST_SLO_PRMS_H_R sloPrmsHR, MCNumber rev) {
			MST_SLO_PRMS_H_R updSloPrmsHR = MST_SLO_PRMS_H_R.create();
			updSloPrmsHR.slo_prms_h_no(sloPrmsHR.slo_prms_h_no());
			updSloPrmsHR.slo_prms_prnt_flg(true);
			updSloPrmsHR.last_prms_rev(rev);
			updSloPrmsHR.prms_prnt_tm(_prntHm);
			_updSloPrmsHL.add(updSloPrmsHR);
		}
		
		/**
		 * 納期回答書データ作成
		 */
		protected MSBBR_SloPrms createSloPrms(MST_SLO_PRMS_H_R sloPrmsHR){
			MSBBR_SloPrms repSet = MSBBR_SloPrms.create();
			
			MST_SLO_D_R sloDR =  srchSloD(sloPrmsHR);
			MCList<MST_SLO_PRMS_R> sloPrmsL = srchSloPrms(sloPrmsHR);
			sloPrmsL.sort(SortType.ASC, MST_SLO_PRMS_R.$slo_prms_no);
			
			// ヘッダの値コピー
			SloPrmsHdrR prntHdrR = SloPrmsHdrR.create();
			MST_SLO_R sloR = _lockSloL.getFirst(_lockSloKey, sloPrmsHR.getStringNE("slo_no"));
			copy(prntHdrR, sloR, createMap_SloPrmsHdrR_MST_SLO_R());
			copy(prntHdrR, sloDR, createMap_SloPrmsHdrR_MST_SLO_D_R());
			MST_SHIP_PR_R shipPrR = _lockShipPrL.getFirst(_lockShipPrKey, sloPrmsHR.slo_d_no());
			prntHdrR.ship_act_qty(shipPrR.ship_act_qty());
			prntHdrR.slo_no(sloPrmsHR.getStringNE("slo_no"));
			prntHdrR.slo_d_no(sloPrmsHR.slo_d_no());
			prntHdrR.slo_prms_h_no(sloPrmsHR.slo_prms_h_no());
			MCNumber rev = sloPrmsHR.last_prms_rev().add(1);
			prntHdrR.last_prms_rev(rev);
			
			// 明細の値コピー
			MCList<SloPrmsDtlR> prntDtlL = MCList.create(SloPrmsDtlR.class);
			addAll(prntDtlL, sloPrmsL, createMap_SloPrmsDtlR_MST_SLO_PRMS_R());
			
			repSet.setLocale(toLocaleFromLclCd(sloPrmsHR.getStringNE("prnt_lcl_cd")));
			editSloPrmsData(prntHdrR, prntDtlL, repSet, sloPrmsHR);
			repSet.addRow(prntHdrR);
			repSet.addAll(prntDtlL);
			return repSet;
		}
		
		protected void editSloPrmsData(SloPrmsHdrR prntHdrR, MCList<SloPrmsDtlR> prntDtlL,
				MSBBR_SloPrms repSet, MST_SLO_PRMS_H_R sloPrmsHR) {
			// ヘッダ
			setSloPrmsRptStsTyp(prntHdrR, sloPrmsHR);
			MAC_RPT_STS_TYP.putName(prntHdrR, SloPrmsHdrR.$rpt_sts_typ, SloPrmsHdrR.$rpt_sts_typ_nm, repSet.getLocale());
			prntHdrR.prms_prnt_tm(_prntHm);
			putPrntItmSub1(prntHdrR, SloPrmsHdrR.$itm_sub1_view, SloPrmsHdrR.$itm_sub1_data);
			putPrntItmSub2(prntHdrR, SloPrmsHdrR.$itm_sub2_view, SloPrmsHdrR.$itm_sub2_data);
			putPrntItmSub3(prntHdrR, SloPrmsHdrR.$itm_sub3_view, SloPrmsHdrR.$itm_sub3_data);
			putNumStr(repSet, prntHdrR,
					SloPrmsHdrR.$s_base_unit_qty,
					SloPrmsHdrR.$base_unit_qty,
					prntHdrR.getNumberNE("base_unit_dec_place"));
			putNumStr(repSet, prntHdrR,
					SloPrmsHdrR.$s_trd_unit_qty,
					SloPrmsHdrR.$trd_unit_qty,
					prntHdrR.getNumberNE("trd_unit_dec_place"));
			prntHdrR.dlv_rqst_tm(setTm(prntHdrR.dlv_rqst_tm()));
			putNumStr(repSet, prntHdrR,
					SloPrmsHdrR.$s_ship_act_qty,
					SloPrmsHdrR.$ship_act_qty,
					prntHdrR.getNumberNE("base_unit_dec_place"));
			
			// 明細
			for (SloPrmsDtlR r : prntDtlL) {
				r.prms_dlv_tm(setTm(r.prms_dlv_tm()));
			}
			putNumStr(repSet, prntDtlL,
					SloPrmsDtlR.$s_int_trd_unit_prms_qty,
					SloPrmsDtlR.$s_dec_trd_unit_prms_qty,
					SloPrmsDtlR.$trd_unit_prms_qty,
					"trd_unit_prms_dec_place");
			setSloPrmsBisInfo(prntHdrR, repSet);
		}
		
		protected void setSloPrmsRptStsTyp(SloPrmsHdrR prntHdrR, MST_SLO_PRMS_H_R sloPrmsHR) {
			if (isCrtSloPrms(sloPrmsHR)) {
				prntHdrR.rpt_sts_typ(MAC_RPT_STS_TYP.CRT.value());
			}
			else {
				prntHdrR.rpt_sts_typ(MAC_RPT_STS_TYP.COR.value());
			}
		}
		
		protected MCDate setTm(MCDate tm) {
			if(isNull(tm)){
				return tm;
			}
			//00:00分をNULLで表示				
			if (isSame(tm.getHour(), 0) && isSame(tm.getMinute(), 0) && isSame(tm.getSecond(), 0)) {
				return null;
			}
			return tm;
		}
		
		protected void setSloPrmsBisInfo(SloPrmsHdrR prntHdrR, MSBBR_SloPrms repSet) {
			repSet.setAppReportNo1(prntHdrR.slo_prms_h_no());
			repSet.setAppReportNo2(prntHdrR.last_prms_rev().toString());
			repSet.setAppReportSts1(prntHdrR.rpt_sts_typ());
			repSet.setAppReportStsNm1(prntHdrR.rpt_sts_typ_nm());
			repSet.setAppUsrCd1(prntHdrR.sls_dpt_cd());
			repSet.setAppUsrNm1(prntHdrR.sls_dpt_nm());
			repSet.setAppUsrCd2(prntHdrR.sls_usr_cd());
			repSet.setAppUsrNm2(prntHdrR.sls_usr_nm());
			repSet.setAppToCd1(prntHdrR.cst_cd());
			repSet.setAppToNm1(prntHdrR.cst_nm());
		}
		
		protected void requestSloPrms() {
			if(!existsSloPrms()){
				return;
			}
			
			// 得意先ごとにMapを作成
			Map<String, List<MSBBR_SloPrms>> lclMap = new LinkedHashMap<String, List<MSBBR_SloPrms>>();
			for (Map.Entry<List<String>, List<MSBBR_SloPrms>> en : _sloPrmsReportMap.entrySet()) {
				boolean isInit = false;
				List<MSBBR_SloPrms> lst = null;
				for (MSBBR_SloPrms sp : en.getValue()) {
					if (!isInit) {
						lst = lclMap.get(sp.getAppToCd1());
						if (lst == null) {
							lst = new ArrayList<MSBBR_SloPrms>();
							lclMap.put(sp.getAppToCd1(), lst);
						}
						isInit = true;
					}
					lst.add(sp);
				}
			}
			
			// ソート処理
			lclMap = sloPrmsMapSort(lclMap);
			
			for (Map.Entry<String, List<MSBBR_SloPrms>> en : lclMap.entrySet()) {
				MCReportSet allRs = null;
				boolean isInit = false;
				boolean indivPrntFlg = false;
				
				if (!up1().indiv_prnt_flg()) {
					BpUtil_Sprt01_DtlR bpR = _bpUtil.getFirst(_bpUtilkey, en.getKey());
					indivPrntFlg = bpR.indiv_prnt_flg();
				}
				
				if (up1().indiv_prnt_flg() || indivPrntFlg) {
					// 個別発行
					String oldSp = null;
					for (MSBBR_SloPrms sp : en.getValue()) {
						if (isSame(sp.getAppReportNo1(), oldSp)) {
							allRs.addAll(sp.getAll());
						}
						else {
							if (allRs != null) {
								allRs.setRegister(false);
								MCServerReportManager.request(allRs);
							}
							allRs = sp.createInstance();
							allRs.setLocale(sp.getLocale());
							allRs.addAll(sp.getAll());
							oldSp = sp.getAppReportNo1();
						}
					}
					allRs.setRegister(false);
					MCServerReportManager.request(allRs);
				}
				else {
					// まとめ発行
					for (MSBBR_SloPrms sp : en.getValue()) {
						if (!isInit) {
							allRs = sp.createInstance();
							allRs.setLocale(sp.getLocale());
							isInit = true;
						}
						allRs.addAll(sp.getAll());
					}
					allRs.setRegister(false);
					MCServerReportManager.request(allRs);
				}
			}
			_sloPrmsReportMap.clear();
		}
		
		protected boolean existsSloPrms() {
			if (_sloPrmsReportMap == null) {
				return false;
			}
			int cnt = _sloPrmsReportMap.size();
			if (cnt == 0) {
				return false;
			}
			return true;
		}
		
		/**
		 * 納期回答書ソート
		 * @param map
		 * @return
		 */
		protected Map<String, List<MSBBR_SloPrms>> sloPrmsMapSort(Map<String, List<MSBBR_SloPrms>> map) {
			// 納期回答書ReportSetマップソート（得意先ＣＤ順）
			List<Entry<String, List<MSBBR_SloPrms>>> entries = new ArrayList<Entry<String, List<MSBBR_SloPrms>>>(map.entrySet());
			Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
			
			LinkedHashMap<String, List<MSBBR_SloPrms>> result = new LinkedHashMap<>();
			for (Map.Entry<String, List<MSBBR_SloPrms>> entry : entries) {
				result.put(entry.getKey(), entry.getValue());
			}
			
			return result;
		}
		
		/**
		 * 個別発行取得の呼び出し
		 */
		protected void getIndivPrnt() {
			// 各帳票の受注NOから得意先を検索→得意先を個別発行処理に連携→フラグ取得
			MCList<SloPrms_Prnt01_HdrR> up0L = MCList.create(SloPrms_Prnt01_HdrR.class);
			up0L.addAll(_up0L);
			
			MCList<MST_SLO_R> sloL = MCList.create(MST_SLO_R.class);
			MST_SLO_R t = MST_SLO_R.create("T");
			MCQueryApiBuilder sloL_bldr = MCQueryApiBuilder.create(t);
			sloL_bldr.setSelect(t.cst_cd);
			sloL_bldr.setWhere(t.slo_no.eq(bind("slo_no")));
			dbSelect("MSBBL6070_MST_SLO_S02", sloL, sloL_bldr, up0L);
			
			MSUCL_BpUtil.BpUtil_Sprt01 ope = MSUCL_BpUtil.crtBpUtil_Sprt01();
			ope.up0().bp_typ(MAC_BP_IS_SRCH_TYP.CST.value());
			for (MST_SLO_R sloR : sloL.groupBy(MST_SLO_R.$cst_cd)) {
				BpUtil_Sprt01_DtlR dtlR = BpUtil_Sprt01_DtlR.create();
				dtlR.bp_cd(sloR.cst_cd());
				ope.up1().add(dtlR);
			}
			ope.exec();
			
			_bpUtil = ope.down0();
			_bpUtilkey = _bpUtil.createIndex(BpUtil_Sprt01_DtlR.$bp_cd);
		}
		
		/**
		 * 新規納期回答書を発行するか
		 */
		protected boolean isCrtSloPrms(MST_SLO_PRMS_H_R sloPrmsHR) {
			return !sloPrmsHR.can_flg() && sloPrmsHR.last_prms_rev().eq(MCNumber.ZERO);
		}
		
		/**
		 * 納期回答書を発行しないか
		 * 納期回答書を一度も発行しない状態で取消した場合は何も発行しない 
		 */
		protected boolean isNotPrntSloPrms(MST_SLO_PRMS_H_R sloPrmsHR) {
			return  sloPrmsHR.can_flg() && sloPrmsHR.last_prms_rev().eq(MCNumber.ZERO);
		}
		
		/**
		 * 受注ヘッダをロックする
		 */
		protected void sloLock() {
			up0().sort(SloPrms_Prnt01_HdrR.$slo_no, SloPrms_Prnt01_HdrR.$slo_d_no,
					SloPrms_Prnt01_HdrR.$slo_prms_rev, SloPrms_Prnt01_HdrR.$slo_prms_no);
			
			MST_SLO_R sloR = MST_SLO_R.create("SLO");
			MCQueryApiBuilder lockSloL_bldr = MCQueryApiBuilder.create(sloR);
			lockSloL_bldr.addWhereWithAnd(sloR.slo_no.eq(bind("slo_no")));
			lockSloL_bldr.setLockTable(sloR.slo_no);
			
			MAM_BP_R cst = MAM_BP_R.create("CST");
			MAM_BP_LCL_R cstLcl = MAM_BP_LCL_R.create("CSTLCL");
			lockSloL_bldr.addLeftOuterJoin(cst, sloR.cst_cd.eq(cst.bp_cd));
			lockSloL_bldr.addLeftOuterJoin(cstLcl, sloR.cst_cd.eq(cstLcl.bp_cd)
					.and(cst.prnt_lcl_cd.eq(cstLcl.lcl_cd)));
			lockSloL_bldr.addSelect(cst.prnt_lcl_cd);
			lockSloL_bldr.addSelect( nvl(cstLcl.bp_nm, cst.bp_nm).as("cst_nm"));
			lockSloL_bldr.addSelect(nvl(cstLcl.bp_alt_nm1, cst.bp_alt_nm1).as("cst_alt_nm1"));
			lockSloL_bldr.addSelect(nvl(cstLcl.bp_alt_nm2, cst.bp_alt_nm2).as("cst_alt_nm2"));
			lockSloL_bldr.addSelect(nvl(cstLcl.bp_alt_nm3, cst.bp_alt_nm3).as("cst_alt_nm3"));
			lockSloL_bldr.addSelect(nvl(cstLcl.bp_alt_nm4, cst.bp_alt_nm4).as("cst_alt_nm4"));
			
			MAM_BP_SUB_R bpSub = MAM_BP_SUB_R.create("BPSUB");
			lockSloL_bldr.addLeftOuterJoin(bpSub, sloR.cst_cd.eq(bpSub.bp_cd)
					.and(sloR.slo_dt.between(bpSub.st_dt, bpSub.end_dt)));
			lockSloL_bldr.addSelect(nvl(bpSub.zip_cd, cst.zip_cd).as("cst_zip_cd"));
			lockSloL_bldr.addSelect(nvl(bpSub.addr1, cst.addr1).as("cst_addr1"));
			lockSloL_bldr.addSelect(nvl(bpSub.addr2, cst.addr2).as("cst_addr2"));
			lockSloL_bldr.addSelect(nvl(bpSub.addr3, cst.addr3).as("cst_addr3"));
			lockSloL_bldr.addSelect(nvl(bpSub.addr4, cst.addr4).as("cst_addr4"));
			lockSloL_bldr.addSelect(nvl(bpSub.tel, cst.tel).as("cst_tel"));
			lockSloL_bldr.addSelect(nvl(bpSub.fax, cst.fax).as("cst_fax"));
			lockSloL_bldr.addSelect(nvl(bpSub.cst_cntct_dpt, cst.cst_cntct_dpt).as("cst_cntct_dpt"));
			lockSloL_bldr.addSelect(nvl(bpSub.cst_cntct_psn, cst.cst_cntct_psn).as("cst_cntct_psn"));
			lockSloL_bldr.addSelect(nvl(bpSub.cst_cntct_psn_title, cst.cst_cntct_psn_title).as("cst_cntct_psn_title"));
			
			MAM_CNTRY_R cntry1 = MAM_CNTRY_R.create("CNTRY1");
			lockSloL_bldr.addLeftOuterJoin(cntry1, cst.cntry_cd.eq(cntry1.cntry_cd));
			lockSloL_bldr.addSelect(cntry1.cntry_nm.as("cst_cntry_nm"));
			
			MAM_DPT_R dpt = MAM_DPT_R.create("DPT");
			MAM_DPT_LCL_R dptLcl = MAM_DPT_LCL_R.create("DPTLCL");
			lockSloL_bldr.addLeftOuterJoin(dpt, sloR.sls_dpt_cd.eq(dpt.dpt_cd)
					.and(sloR.slo_dt.between(dpt.st_dt, dpt.end_dt)));
			lockSloL_bldr.addLeftOuterJoin(dptLcl, sloR.sls_dpt_cd.eq(dptLcl.dpt_cd)
					.and(sloR.slo_dt.between(dptLcl.st_dt, dptLcl.end_dt))
					.and(cst.prnt_lcl_cd.eq(dptLcl.lcl_cd)));
			lockSloL_bldr.addSelect(nvl(dptLcl.zip_cd, dpt.zip_cd).as("sls_zip_cd"));
			lockSloL_bldr.addSelect(nvl(dptLcl.addr1, dpt.addr1).as("sls_addr1"));
			lockSloL_bldr.addSelect(nvl(dptLcl.addr2, dpt.addr2).as("sls_addr2"));
			lockSloL_bldr.addSelect(nvl(dptLcl.addr3, dpt.addr3).as("sls_addr3"));
			lockSloL_bldr.addSelect(nvl(dptLcl.addr4, dpt.addr4).as("sls_addr4"));
			lockSloL_bldr.addSelect(nvl(dptLcl.tel, dpt.tel).as("sls_tel"));
			lockSloL_bldr.addSelect(nvl(dptLcl.fax, dpt.fax).as("sls_fax"));
			lockSloL_bldr.addSelect(nvl(dptLcl.dpt_nm, dpt.dpt_nm).as("sls_dpt_nm"));
			
			MAM_USR_R usr = MAM_USR_R.create("USR");
			MAM_USR_LCL_R usrLcl = MAM_USR_LCL_R.create("USRLCL");
			lockSloL_bldr.addLeftOuterJoin(usr, sloR.sls_usr_cd.eq(usr.usr_cd));
			lockSloL_bldr.addLeftOuterJoin(usrLcl,
					sloR.sls_usr_cd.eq(usrLcl.usr_cd)
					.and(cst.prnt_lcl_cd.eq(usrLcl.lcl_cd)));
			lockSloL_bldr.addSelect(nvl(usrLcl.usr_nm, usr.usr_nm).as("sls_usr_nm"));
			
			lockSloL_bldr.addSelect(FCPA_CO$F_GET_CO_NM1(cst.prnt_lcl_cd).as("co_nm"));
			
			MAM_CNTRY_R cntry2 = MAM_CNTRY_R.create("CNTRY2");
			lockSloL_bldr.addLeftOuterJoin(cntry2, value(getCo().cntry_cd()).eq(cntry2.cntry_cd));
			lockSloL_bldr.addSelect(cntry2.cntry_nm.as("co_cntry_nm"));
			
			dbSelectForUpdate("MSBBL6070_MST_SLO_S01",
					_lockSloL, lockSloL_bldr, up0().groupBy(SloPrms_Prnt01_HdrR.$slo_no));
			
			_lockSloKey = _lockSloL.createIndex(MST_SLO_R.$slo_no);
		}
		
		/**
		 * 受注納期回答ヘッダをロックする
		 */
		protected void sloPrmsHLock() {
			MST_SLO_PRMS_H_R sloPrmsHR = MST_SLO_PRMS_H_R.create("SLOPRMSH");
			MCQueryApiBuilder lockSloPrmsHL_bldr = MCQueryApiBuilder.create(sloPrmsHR);
			lockSloPrmsHL_bldr.setSelect(
					sloPrmsHR.slo_prms_h_no,
					sloPrmsHR.slo_prms_rev,
					sloPrmsHR.last_prms_rev,
					sloPrmsHR.slo_d_no,
					sloPrmsHR.slo_prms_prnt_flg,
					sloPrmsHR.can_flg);
			lockSloPrmsHL_bldr.addWhereWithAnd(sloPrmsHR.slo_prms_h_no.eq(bind("slo_prms_h_no")));
			dbSelectForUpdate("MSBBL6070_MST_SLO_PRMS_H_S01",
					_lockSloPrmsHL, lockSloPrmsHL_bldr, up0().groupBy(SloPrms_Prnt01_HdrR.$slo_prms_h_no));
			
			_lockSloPrmsHKey = _lockSloPrmsHL.createIndex(MST_SLO_PRMS_H_R.$slo_prms_h_no);
		}
		
		/**
		 * 出荷進捗をロックする
		 */
		protected void shipPrLock() {
			MST_SHIP_PR_R shipPrR = MST_SHIP_PR_R.create("SHIPPR");
			MCQueryApiBuilder lockShipPrL_bldr = MCQueryApiBuilder.create(shipPrR);
			lockShipPrL_bldr.addWhereWithAnd(shipPrR.slo_d_no.eq(bind("slo_d_no")));
			dbSelectForUpdate("MSBBL6070_MST_SHIP_PR_S01",
					_lockShipPrL, lockShipPrL_bldr, up0().groupBy(SloPrms_Prnt01_HdrR.$slo_d_no));
			
			_lockShipPrKey = _lockShipPrL.createIndex(MST_SHIP_PR_R.$slo_d_no);
		}
		
		/**
		 * 受注明細を検索する
		 * 
		 * @return
		 */
		protected MST_SLO_D_R srchSloD(MST_SLO_PRMS_H_R sloPrmsHR) {
			MST_SLO_D_R rsltR = MST_SLO_D_R.create();
			MST_SLO_D_R sloDR = MST_SLO_D_R.create("SLOD");
			MCQueryApiBuilder sloD_bldr = MCQueryApiBuilder.create(sloDR);
			
			sloD_bldr.setSelect(
					sloDR.dlv_cd,
					sloDR.dlv_zip_cd,
					sloDR.dlv_addr1,
					sloDR.dlv_addr2,
					sloDR.dlv_addr3,
					sloDR.dlv_addr4,
					sloDR.dlv_tel,
					sloDR.dlv_fax,
					sloDR.dlv_cntct_dpt,
					sloDR.dlv_cntct_psn,
					sloDR.cst_po_d_no,
					sloDR.cst_itm_cd,
					sloDR.cst_itm_nm,
					sloDR.base_unit_qty,
					sloDR.base_unit_cd,
					sloDR.trd_unit_qty,
					sloDR.trd_unit_cd,
					sloDR.dlv_rqst_tm,
					sloDR.itm_cd,
					sloDR.itm_sub1.as("itm_sub1_data"),
					sloDR.itm_sub2.as("itm_sub2_data"),
					sloDR.itm_sub3.as("itm_sub3_data"),
					sloDR.itm_nm,
					sloDR.sno1,
					sloDR.sno2,
					sloDR.sno3,
					sloDR.sno4,
					sloDR.sub_char1.as("slo_d_sub_char1"),
					sloDR.sub_char2.as("slo_d_sub_char2"),
					sloDR.sub_char3.as("slo_d_sub_char3"),
					sloDR.tdlv_cd,
					sloDR.tdlv_cntct_dpt,
					sloDR.tdlv_cntct_psn,
					sloDR.tdlv_zip_cd,
					sloDR.tdlv_addr1,
					sloDR.tdlv_addr2,
					sloDR.tdlv_addr3,
					sloDR.tdlv_addr4,
					sloDR.tdlv_tel,
					sloDR.tdlv_fax);
			sloD_bldr.setWhere(sloDR.slo_d_no.eq(bind("1")), sloPrmsHR.slo_d_no());
			
			MAM_BP_LCL_R dlvLcl = MAM_BP_LCL_R.create("DLVLCL");
			MAM_BP_R dlv = MAM_BP_R.create("DLV");
			sloD_bldr.addLeftOuterJoin(dlvLcl, sloDR.dlv_cd.eq(dlvLcl.bp_cd)
					.and(dlvLcl.lcl_cd.eq(bind("prnt_lcl_cd"))));
			sloD_bldr.addLeftOuterJoin(dlv, sloDR.dlv_cd.eq(dlv.bp_cd));
			sloD_bldr.addSelect(nvl(sloDR.dlv_nm, nvl(dlvLcl.bp_nm, dlv.bp_nm)).as("dlv_nm"));
			sloD_bldr.addSelect(nvl(dlvLcl.bp_alt_nm1, dlv.bp_alt_nm1).as("dlv_alt_nm1"));
			sloD_bldr.addSelect(nvl(dlvLcl.bp_alt_nm2, dlv.bp_alt_nm2).as("dlv_alt_nm2"));
			sloD_bldr.addSelect(nvl(dlvLcl.bp_alt_nm3, dlv.bp_alt_nm3).as("dlv_alt_nm3"));
			sloD_bldr.addSelect(nvl(dlvLcl.bp_alt_nm4, dlv.bp_alt_nm4).as("dlv_alt_nm4"));
			
			MAM_ITM_R itm = MAM_ITM_R.create("ITM");
			MAM_ITM_LCL_R itmLcl = MAM_ITM_LCL_R.create("M1");
			sloD_bldr.addLeftOuterJoin(itm,
					sloDR.itm_cd.eq(itm.itm_cd)
					.and(sloDR.itm_sub1.eq(itm.itm_sub1))
					.and(sloDR.itm_sub2.eq(itm.itm_sub2))
					.and(sloDR.itm_sub3.eq(itm.itm_sub3)));
			sloD_bldr.addLeftOuterJoin(itmLcl, sloDR.itm_cd.eq(itmLcl.itm_cd)
					.and(sloDR.itm_sub1.eq(itmLcl.itm_sub1))
					.and(sloDR.itm_sub2.eq(itmLcl.itm_sub2))
					.and(sloDR.itm_sub3.eq(itmLcl.itm_sub3))
					.and(itmLcl.lcl_cd.eq(bind("prnt_lcl_cd"))));
			sloD_bldr.addSelect(nvl(sloDR.itm_nm, nvl(itmLcl.itm_nm, itm.itm_nm)).as("itm_nm"));
			sloD_bldr.addSelect(nvl(itmLcl.itm_alt_nm1, itm.itm_alt_nm1).as("itm_alt_nm1"));
			sloD_bldr.addSelect(nvl(itmLcl.itm_alt_nm2, itm.itm_alt_nm2).as("itm_alt_nm2"));
			sloD_bldr.addSelect(nvl(itmLcl.itm_alt_nm3, itm.itm_alt_nm3).as("itm_alt_nm3"));
			sloD_bldr.addSelect(nvl(itmLcl.itm_alt_nm4, itm.itm_alt_nm4).as("itm_alt_nm4"));
			
			MAM_UNIT_R unit1 = MAM_UNIT_R.create("UNIT1");
			MAM_UNIT_LCL_R unitLcl1 = MAM_UNIT_LCL_R.create("UNITLCL1");
			sloD_bldr.addLeftOuterJoin(unit1, sloDR.trd_unit_cd.eq(unit1.unit_cd));
			sloD_bldr.addLeftOuterJoin(unitLcl1,
					sloDR.trd_unit_cd.eq(unitLcl1.unit_cd)
					.and(unitLcl1.lcl_cd.eq(bind("prnt_lcl_cd"))));
			sloD_bldr.addSelect(nvl(unitLcl1.unit_nm, unit1.unit_nm).as("trd_unit_nm"));
			
			MAVM_ITM_UNIT_R itmUnit1 = MAVM_ITM_UNIT_R.create("ITMUNIT1");
			sloD_bldr.addLeftOuterJoin(itmUnit1, sloDR.trd_unit_cd.eq(itmUnit1.unit_cd)
					.and(sloDR.itm_cd.eq(itmUnit1.itm_cd))
					.and(sloDR.itm_sub1.eq(itmUnit1.itm_sub1))
					.and(sloDR.itm_sub2.eq(itmUnit1.itm_sub2))
					.and(sloDR.itm_sub3.eq(itmUnit1.itm_sub3)));
			sloD_bldr.addSelect((itmUnit1.dec_place).as("trd_unit_dec_place"));
			
			MAM_UNIT_R unit2 = MAM_UNIT_R.create("UNIT2");
			MAM_UNIT_LCL_R unitLcl2 = MAM_UNIT_LCL_R.create("UNITLCL2");
			sloD_bldr.addLeftOuterJoin(unit2, sloDR.base_unit_cd.eq(unit2.unit_cd));
			sloD_bldr.addLeftOuterJoin(unitLcl2,
					sloDR.base_unit_cd.eq(unitLcl2.unit_cd)
					.and(unitLcl2.lcl_cd.eq(bind("prnt_lcl_cd"))));
			sloD_bldr.addSelect(nvl(unitLcl2.unit_nm, unit2.unit_nm).as("base_unit_nm"));
			
			MAVM_ITM_UNIT_R itmUnit2 = MAVM_ITM_UNIT_R.create("ITMUNIT2");
			sloD_bldr.addLeftOuterJoin(itmUnit2, sloDR.trd_unit_cd.eq(itmUnit2.unit_cd)
					.and(sloDR.itm_cd.eq(itmUnit2.itm_cd))
					.and(sloDR.itm_sub1.eq(itmUnit2.itm_sub1))
					.and(sloDR.itm_sub2.eq(itmUnit2.itm_sub2))
					.and(sloDR.itm_sub3.eq(itmUnit2.itm_sub3)));
			sloD_bldr.addSelect((itmUnit1.dec_place).as("base_unit_dec_place"));
			
			MST_SLO_R slo = MST_SLO_R.create("SLO");
			sloD_bldr.addLeftOuterJoin(slo, sloDR.slo_no.eq(slo.slo_no));
			MAM_BP_SUB_R bpSub = MAM_BP_SUB_R.create("BPSUB");
			sloD_bldr.addLeftOuterJoin(bpSub, sloDR.dlv_cd.eq(bpSub.bp_cd)
					.and(slo.slo_dt.between(bpSub.st_dt, bpSub.end_dt)));
			MAM_BP_R cst = MAM_BP_R.create("CST");
			sloD_bldr.addLeftOuterJoin(cst, sloDR.dlv_cd.eq(cst.bp_cd));
			sloD_bldr.addSelect(nvl(bpSub.dlv_cntct_psn_title, cst.dlv_cntct_psn_title).as("dlv_cntct_psn_title"));
			
			MAM_BP_R tdlv = MAM_BP_R.create("TDLV");
			sloD_bldr.addLeftOuterJoin(tdlv, sloDR.tdlv_cd.eq(tdlv.bp_cd));
			sloD_bldr.addSelect(nvl(sloDR.tdlv_nm, tdlv.bp_nm).as("tdlv_nm"));
			
			MAM_CNTRY_R cntry = MAM_CNTRY_R.create("CNTRY");
			sloD_bldr.addLeftOuterJoin(cntry, dlv.cntry_cd.eq(cntry.cntry_cd));
			sloD_bldr.addSelect(cntry.cntry_nm.as("dlv_cntry_nm"));
			
			dbSelectKey("MSBBL6070_MST_SLO_D_S01", rsltR, sloD_bldr, sloPrmsHR);
			
			return rsltR;
		}
		
		/**
		 * 受注納期回答を検索する
		 * 
		 * @return
		 */
		protected MCList<MST_SLO_PRMS_R> srchSloPrms(MST_SLO_PRMS_H_R sloPrmsHR) {
			MCList<MST_SLO_PRMS_R> sloPrmsL = MCList.create(MST_SLO_PRMS_R.class);
			MST_SLO_PRMS_R sloPrmsR = MST_SLO_PRMS_R.create("SLOPRMS");
			MCQueryApiBuilder sloPrms_bldr = MCQueryApiBuilder.create(sloPrmsR);
			
			sloPrms_bldr.setSelect(
					sloPrmsR.slo_no,
					sloPrmsR.slo_d_no,
					sloPrmsR.slo_prms_rev,
					sloPrmsR.slo_prms_no,
					sloPrmsR.trd_unit_prms_qty,
					sloPrmsR.prms_dlv_tm,
					sloPrmsR.prms_rmrks,
					sloPrmsR.sub_char1.as("slo_prms_sub_char1"),
					sloPrmsR.sub_char2.as("slo_prms_sub_char2"),
					sloPrmsR.sub_char3.as("slo_prms_sub_char3")
					);
			sloPrms_bldr.setWhere(sloPrmsR.slo_prms_h_no.eq(bind("1")), sloPrmsHR.slo_prms_h_no());
			sloPrms_bldr.addWhereWithAnd(sloPrmsR.slo_prms_rev.eq(bind("1")), sloPrmsHR.slo_prms_rev());
			sloPrms_bldr.addWhereWithAnd(sloPrmsR.can_flg.eq(value(false)));
			
			dbSelect("MSBBL6070_MST_SLO_PRMS_S01", sloPrmsL, sloPrms_bldr, sloPrmsHR);
			
			setShipSchd(sloPrmsL, sloPrmsHR);
			return sloPrmsL;
		}
		
		/**
		 * 受注納期回答に対応する出荷予定の情報を設定する
		 */
		protected void setShipSchd(MCList<MST_SLO_PRMS_R> sloPrmsL, MST_SLO_PRMS_H_R sloPrmsHR) {
			// 納期回答登録後に出荷予定登録で出荷予定を分割すると、受注納期回答と出荷予定は１対Ｎになる
			// そのため、srchSloPrms とメソッドを分けて出荷予定から単位を取得する（同じ納期回答が複数件出力されるのを防ぐため）
			MCList<MST_SHIP_SCHD_R> shipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
			MST_SLO_PRMS_R sloPrmsR = MST_SLO_PRMS_R.create("SLOPRMS");
			MST_SHIP_SCHD_R shipSchdR = MST_SHIP_SCHD_R.create("SHIPSCHD");
			MST_SLO_D_R sloDR = MST_SLO_D_R.create("SLOD");
			MCQueryApiBuilder sloPrms_bldr = MCQueryApiBuilder.create(sloPrmsR);
			
			sloPrms_bldr.setSelect(
					sloPrmsR.slo_prms_no,
					nvl(shipSchdR.trd_unit_cd, sloDR.trd_unit_cd).as("trd_unit_cd")
					);
			sloPrms_bldr.addLeftOuterJoin(shipSchdR, shipSchdR. slo_prms_no.eq(sloPrmsR.slo_prms_no));
			sloPrms_bldr.addLeftOuterJoin(sloDR, sloDR. slo_d_no.eq(sloPrmsR.slo_d_no));
			sloPrms_bldr.setWhere(sloPrmsR.slo_prms_no.eq(bind("slo_prms_no")));
			
			MAM_UNIT_R unit1 = MAM_UNIT_R.create("UNIT1");
			MAM_UNIT_LCL_R unitLcl1 = MAM_UNIT_LCL_R.create("UNITLCL1");
			sloPrms_bldr.addLeftOuterJoin(unit1,
					 nvl(shipSchdR.trd_unit_cd, sloDR.trd_unit_cd).eq(unit1.unit_cd));
			sloPrms_bldr.addLeftOuterJoin(unitLcl1,
					unit1.unit_cd.eq(unitLcl1.unit_cd)
					.and(unitLcl1.lcl_cd.eq(bind("prnt_lcl_cd"))));
			sloPrms_bldr.addSelect(nvl(unitLcl1.unit_nm, unit1.unit_nm).as("trd_unit_nm"));
			
			MAVM_ITM_UNIT_R itmUnit1 = MAVM_ITM_UNIT_R.create("ITMUNIT1");
			sloPrms_bldr.addLeftOuterJoin(itmUnit1,
					 unit1.unit_cd.eq(itmUnit1.unit_cd)
					.and(sloDR.itm_cd.eq(itmUnit1.itm_cd))
					.and(sloDR.itm_sub1.eq(itmUnit1.itm_sub1))
					.and(sloDR.itm_sub2.eq(itmUnit1.itm_sub2))
					.and(sloDR.itm_sub3.eq(itmUnit1.itm_sub3)));
			sloPrms_bldr.addSelect((itmUnit1.dec_place).as("trd_unit_dec_place"));
			
			dbSelect("MSBBL6070_MST_SHIP_SCHD_S01", shipSchdL, sloPrms_bldr, sloPrmsL, sloPrmsHR);
			
			// 納期回答単位には出荷予定の取引単位を設定する
			MCIndexKey idx = shipSchdL.createIndex(MST_SHIP_SCHD_R.$slo_prms_no);
			for (MST_SLO_PRMS_R prmsR : sloPrmsL) {
				MST_SHIP_SCHD_R r = shipSchdL.getFirst(idx, prmsR.slo_prms_no());
				if (!isNull(r)) {
					prmsR.setStringNE("trd_unit_prms_unit_cd", r.trd_unit_cd());
					prmsR.setStringNE("trd_unit_prms_unit_nm", r.getStringNE("trd_unit_nm"));
					prmsR.setNumberNE("trd_unit_prms_dec_place", r.getNumberNE("trd_unit_dec_place"));
				}
			} 
		}
		
		protected Map_SloPrmsHdrR_MST_SLO_R<SloPrmsHdrR,MST_SLO_R> createMap_SloPrmsHdrR_MST_SLO_R() {
			return new Map_SloPrmsHdrR_MST_SLO_R<SloPrmsHdrR, MST_SLO_R>();
		}
		
		public class Map_SloPrmsHdrR_MST_SLO_R<D extends SloPrmsHdrR, S extends MST_SLO_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SloPrmsHdrR.$cst_cd, MST_SLO_R.$cst_cd);
				addColumnPathMap(SloPrmsHdrR.$cst_zip_cd, "cst_zip_cd");
				addColumnPathMap(SloPrmsHdrR.$cst_addr1, "cst_addr1");
				addColumnPathMap(SloPrmsHdrR.$cst_addr2, "cst_addr2");
				addColumnPathMap(SloPrmsHdrR.$cst_addr3, "cst_addr3");
				addColumnPathMap(SloPrmsHdrR.$cst_addr4, "cst_addr4");
				addColumnPathMap(SloPrmsHdrR.$cst_nm, "cst_nm");
				addColumnPathMap(SloPrmsHdrR.$cst_alt_nm1, "cst_alt_nm1");
				addColumnPathMap(SloPrmsHdrR.$cst_alt_nm2, "cst_alt_nm2");
				addColumnPathMap(SloPrmsHdrR.$cst_alt_nm3, "cst_alt_nm3");
				addColumnPathMap(SloPrmsHdrR.$cst_alt_nm4, "cst_alt_nm4");
				addColumnPathMap(SloPrmsHdrR.$cst_cntct_dpt, "cst_cntct_dpt");
				addColumnPathMap(SloPrmsHdrR.$cst_cntct_psn, "cst_cntct_psn");
				addColumnPathMap(SloPrmsHdrR.$cst_cntct_psn_title, "cst_cntct_psn_title");
				addColumnPathMap(SloPrmsHdrR.$cst_tel, "cst_tel");
				addColumnPathMap(SloPrmsHdrR.$cst_fax, "cst_fax");
				addColumnPathMap(SloPrmsHdrR.$cst_cntry_nm, "cst_cntry_nm");
				addColumnPathMap(SloPrmsHdrR.$co_nm, "co_nm");
				addColumnPathMap(SloPrmsHdrR.$co_cntry_nm, "co_cntry_nm");
				addColumnPathMap(SloPrmsHdrR.$sls_dpt_cd, MST_SLO_R.$sls_dpt_cd);
				addColumnPathMap(SloPrmsHdrR.$sls_dpt_zip_cd, "sls_zip_cd");
				addColumnPathMap(SloPrmsHdrR.$sls_dpt_addr1, "sls_addr1");
				addColumnPathMap(SloPrmsHdrR.$sls_dpt_addr2, "sls_addr2");
				addColumnPathMap(SloPrmsHdrR.$sls_dpt_addr3, "sls_addr3");
				addColumnPathMap(SloPrmsHdrR.$sls_dpt_addr4, "sls_addr4");
				addColumnPathMap(SloPrmsHdrR.$sls_dpt_nm, "sls_dpt_nm");
				addColumnPathMap(SloPrmsHdrR.$sls_usr_cd, MST_SLO_R.$sls_usr_cd);
				addColumnPathMap(SloPrmsHdrR.$sls_usr_nm, "sls_usr_nm");
				addColumnPathMap(SloPrmsHdrR.$sls_dpt_tel, "sls_tel");
				addColumnPathMap(SloPrmsHdrR.$sls_dpt_fax, "sls_fax");
				addColumnPathMap(SloPrmsHdrR.$cst_po_no, MST_SLO_R.$cst_po_no);
				addColumnPathMap(SloPrmsHdrR.$slo_dt, MST_SLO_R.$slo_dt);
				addColumnPathMap(SloPrmsHdrR.$slo_sub_char1, MST_SLO_R.$sub_char1);
				addColumnPathMap(SloPrmsHdrR.$slo_sub_char2, MST_SLO_R.$sub_char2);
				addColumnPathMap(SloPrmsHdrR.$slo_sub_char3, MST_SLO_R.$sub_char3);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				dest.cst_addr(concatAddress(src.getStringNE("cst_addr1"), src.getStringNE("cst_addr2"), src.getStringNE("cst_addr3"), src.getStringNE("cst_addr4")));
				dest.sls_dpt_addr(concatAddress(src.getStringNE("sls_addr1"), src.getStringNE("sls_addr2"), src.getStringNE("sls_addr3"), src.getStringNE("sls_addr4")));
			}
		}
		
		protected Map_SloPrmsHdrR_MST_SLO_D_R<SloPrmsHdrR,MST_SLO_D_R> createMap_SloPrmsHdrR_MST_SLO_D_R() {
			return new Map_SloPrmsHdrR_MST_SLO_D_R<SloPrmsHdrR, MST_SLO_D_R>();
		}
		
		public class Map_SloPrmsHdrR_MST_SLO_D_R<D extends SloPrmsHdrR, S extends MST_SLO_D_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SloPrmsHdrR.$dlv_cd, MST_SLO_D_R.$dlv_cd);
				addColumnPathMap(SloPrmsHdrR.$dlv_zip_cd, MST_SLO_D_R.$dlv_zip_cd);
				addColumnPathMap(SloPrmsHdrR.$dlv_addr1, MST_SLO_D_R.$dlv_addr1);
				addColumnPathMap(SloPrmsHdrR.$dlv_addr2, MST_SLO_D_R.$dlv_addr2);
				addColumnPathMap(SloPrmsHdrR.$dlv_addr3, MST_SLO_D_R.$dlv_addr3);
				addColumnPathMap(SloPrmsHdrR.$dlv_addr4, MST_SLO_D_R.$dlv_addr4);
				addColumnPathMap(SloPrmsHdrR.$dlv_nm, MST_SLO_D_R.$dlv_nm);
				addColumnPathMap(SloPrmsHdrR.$dlv_alt_nm1, "dlv_alt_nm1");
				addColumnPathMap(SloPrmsHdrR.$dlv_alt_nm2, "dlv_alt_nm2");
				addColumnPathMap(SloPrmsHdrR.$dlv_alt_nm3, "dlv_alt_nm3");
				addColumnPathMap(SloPrmsHdrR.$dlv_alt_nm4, "dlv_alt_nm4");
				addColumnPathMap(SloPrmsHdrR.$dlv_cntct_dpt, MST_SLO_D_R.$dlv_cntct_dpt);
				addColumnPathMap(SloPrmsHdrR.$dlv_cntct_psn, MST_SLO_D_R.$dlv_cntct_psn);
				addColumnPathMap(SloPrmsHdrR.$dlv_cntct_psn_title, "dlv_cntct_psn_title");
				addColumnPathMap(SloPrmsHdrR.$dlv_tel, MST_SLO_D_R.$dlv_tel);
				addColumnPathMap(SloPrmsHdrR.$dlv_fax, MST_SLO_D_R.$dlv_fax);
				addColumnPathMap(SloPrmsHdrR.$dlv_cntry_nm, "dlv_cntry_nm");
				addColumnPathMap(SloPrmsHdrR.$tdlv_cd, MST_SLO_D_R.$tdlv_cd);
				addColumnPathMap(SloPrmsHdrR.$tdlv_zip_cd, MST_SLO_D_R.$tdlv_zip_cd);
				addColumnPathMap(SloPrmsHdrR.$tdlv_addr1, MST_SLO_D_R.$tdlv_addr1);
				addColumnPathMap(SloPrmsHdrR.$tdlv_addr2, MST_SLO_D_R.$tdlv_addr2);
				addColumnPathMap(SloPrmsHdrR.$tdlv_addr3, MST_SLO_D_R.$tdlv_addr3);
				addColumnPathMap(SloPrmsHdrR.$tdlv_addr4, MST_SLO_D_R.$tdlv_addr4);
				addColumnPathMap(SloPrmsHdrR.$tdlv_nm, MST_SLO_D_R.$tdlv_nm);
				addColumnPathMap(SloPrmsHdrR.$tdlv_cntct_dpt, MST_SLO_D_R.$tdlv_cntct_dpt);
				addColumnPathMap(SloPrmsHdrR.$tdlv_cntct_psn, MST_SLO_D_R.$tdlv_cntct_psn);
				addColumnPathMap(SloPrmsHdrR.$tdlv_tel, MST_SLO_D_R.$tdlv_tel);
				addColumnPathMap(SloPrmsHdrR.$tdlv_fax, MST_SLO_D_R.$tdlv_fax);
				addColumnPathMap(SloPrmsHdrR.$cst_po_d_no, MST_SLO_D_R.$cst_po_d_no);
				addColumnPathMap(SloPrmsHdrR.$cst_itm_cd, MST_SLO_D_R.$cst_itm_cd);
				addColumnPathMap(SloPrmsHdrR.$cst_itm_nm, MST_SLO_D_R.$cst_itm_nm);
				addColumnPathMap(SloPrmsHdrR.$base_unit_qty, MST_SLO_D_R.$base_unit_qty);
				addColumnPathMap(SloPrmsHdrR.$base_unit_cd, MST_SLO_D_R.$base_unit_cd);
				addColumnPathMap(SloPrmsHdrR.$base_unit_nm, "base_unit_nm");
				addColumnPathMap(SloPrmsHdrR.$ship_act_unit_nm, "base_unit_nm");
				addColumnPathMap(SloPrmsHdrR.$trd_unit_qty, MST_SLO_D_R.$trd_unit_qty);
				addColumnPathMap(SloPrmsHdrR.$trd_unit_cd, MST_SLO_D_R.$trd_unit_cd);
				addColumnPathMap(SloPrmsHdrR.$trd_unit_nm, "trd_unit_nm");
				addColumnPathMap(SloPrmsHdrR.$dlv_rqst_dt, MST_SLO_D_R.$dlv_rqst_tm);
				addColumnPathMap(SloPrmsHdrR.$dlv_rqst_tm, MST_SLO_D_R.$dlv_rqst_tm);
				addColumnPathMap(SloPrmsHdrR.$itm_cd, MST_SLO_D_R.$itm_cd);
				addColumnPathMap(SloPrmsHdrR.$itm_sub1_data, "itm_sub1_data");
				addColumnPathMap(SloPrmsHdrR.$itm_sub2_data, "itm_sub2_data");
				addColumnPathMap(SloPrmsHdrR.$itm_sub3_data, "itm_sub3_data");
				addColumnPathMap(SloPrmsHdrR.$itm_nm, MST_SLO_D_R.$itm_nm);
				addColumnPathMap(SloPrmsHdrR.$itm_alt_nm1, "itm_alt_nm1");
				addColumnPathMap(SloPrmsHdrR.$itm_alt_nm2, "itm_alt_nm2");
				addColumnPathMap(SloPrmsHdrR.$itm_alt_nm3, "itm_alt_nm3");
				addColumnPathMap(SloPrmsHdrR.$itm_alt_nm4, "itm_alt_nm4");
				addColumnPathMap(SloPrmsHdrR.$sno1, MST_SLO_D_R.$sno1);
				addColumnPathMap(SloPrmsHdrR.$sno2, MST_SLO_D_R.$sno2);
				addColumnPathMap(SloPrmsHdrR.$sno3, MST_SLO_D_R.$sno3);
				addColumnPathMap(SloPrmsHdrR.$sno4, MST_SLO_D_R.$sno4);
				addColumnPathMap(SloPrmsHdrR.$slo_d_sub_char1, "slo_d_sub_char1");
				addColumnPathMap(SloPrmsHdrR.$slo_d_sub_char2, "slo_d_sub_char2");
				addColumnPathMap(SloPrmsHdrR.$slo_d_sub_char3, "slo_d_sub_char3");
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				dest.dlv_addr(concatAddress(src.dlv_addr1(), src.dlv_addr2(), src.dlv_addr3(), src.dlv_addr4()));
				dest.tdlv_addr(concatAddress(src.tdlv_addr1(), src.tdlv_addr2(), src.tdlv_addr3(), src.tdlv_addr4()));
				dest.addNumberColumn("base_unit_dec_place", src.getNumberNE("base_unit_dec_place"));
				dest.addNumberColumn("trd_unit_dec_place", src.getNumberNE("trd_unit_dec_place"));
			}
		}
		
		protected Map_SloPrmsDtlR_MST_SLO_PRMS_R<SloPrmsDtlR,MST_SLO_PRMS_R> createMap_SloPrmsDtlR_MST_SLO_PRMS_R() {
			return new Map_SloPrmsDtlR_MST_SLO_PRMS_R<SloPrmsDtlR, MST_SLO_PRMS_R>();
		}
		
		public class Map_SloPrmsDtlR_MST_SLO_PRMS_R<D extends SloPrmsDtlR, S extends MST_SLO_PRMS_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SloPrmsDtlR.$slo_prms_no, MST_SLO_PRMS_R.$slo_prms_no);
				addColumnPathMap(SloPrmsDtlR.$trd_unit_prms_qty, MST_SLO_PRMS_R.$trd_unit_prms_qty);
				addColumnPathMap(SloPrmsDtlR.$prms_dlv_dt, MST_SLO_PRMS_R.$prms_dlv_tm);
				addColumnPathMap(SloPrmsDtlR.$prms_dlv_tm, MST_SLO_PRMS_R.$prms_dlv_tm);
				addColumnPathMap(SloPrmsDtlR.$prms_rmrks, MST_SLO_PRMS_R.$prms_rmrks);
				addColumnPathMap(SloPrmsDtlR.$slo_prms_sub_char1, "slo_prms_sub_char1");
				addColumnPathMap(SloPrmsDtlR.$slo_prms_sub_char2, "slo_prms_sub_char2");
				addColumnPathMap(SloPrmsDtlR.$slo_prms_sub_char3, "slo_prms_sub_char3");
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.trd_unit_prms_unit_cd(src.getStringNE("trd_unit_prms_unit_cd"));
				dest.trd_unit_prms_unit_nm(src.getStringNE("trd_unit_prms_unit_nm"));
				dest.setNumberNE("trd_unit_prms_dec_place", src.getNumberNE("trd_unit_prms_dec_place"));
			}
		}
	}

	//FMCB CUSTOM END
}