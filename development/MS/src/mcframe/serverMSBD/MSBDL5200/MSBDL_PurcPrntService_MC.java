package mcframe.serverMSBD.MSBDL5200;

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
import mcframe.commonMSBE.MSBER0500.*;	// このimportはFrameManagerの自動生成で追加されました。
import java.util.*;
import java.util.Map.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.commonMSBD.MSBDR0030.*;
import mcframe.commonMSBD.MSBDR0050.*;
import mcframe.commonMSBD.MSBDR0060.*;
import mcframe.serverMSBE.MSBEL5550.*;
import mcframe.serverMSBE.MSBEL5900.*;
import mcframe.commonCore.report.MCFileWriteListener;
import mcframe.commonCore.report.MCReportFile;
import mcframe.commonCore.report.MCUCXSingleFile;
import mcframe.commonCore.report.container.*;
import mcframe.serverCore.report.*;
import static mcframe.serverMSBD.MSBDL5200.Query.*;
import mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil;
import mcframe.serverMAUC.MAUCL1060.MAUCL_TrdUtil;
import mcframe.serverMSUC.MSUCL0020.*;
import static mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil.*;
import mcframe.serverMAUC.MAUCL5020.*;
import mcframe.serverMSUC.MSUCL0120.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.serverMBBC.MBBCL5020.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCFuncCache;
import static mcframe.serverCore.dbc.CoreFunction.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBDL_PurcPrntService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBDL_PurcPrntService_MC extends MSBDL_PurcPrntService_MC_A{
	//FMCB CUSTOM START

	public static final Class<MSBDL_PurcPrntService> CLAZZ = MSBDL_PurcPrntService.class;
	
	/**
	 * PurcPrnt_Upd01オペレーション.<p>
	 *
	 * 購買納品伝票・明細トランザクションの作成・更新(削除含む)と納品書発行する<br>
	 */
	public class PurcPrnt_Upd01 extends MSBDL_PurcPrntService_MC_A.PurcPrnt_Upd01 {
		/** 処理対象の上り電文*/
		MCList<PurcPrnt_Upd01_HdrR> _up0L;
		/** ヘッダ紐づけNO*/
		MCNumber _hdrPegNo;
		/** ロック*/
		MCList<MST_PURC_DLV_SLIP_R> _lockDlvSlipL;
		MCList<MST_PURC_DLV_SLIP_D_R> _lockDlvSlipDL;
		MCList<MST_ARR_SCHD_R>_lockArrSchdL;
		// 洗い替え対象のヘッダ、明細
		MCList<MST_PURC_DLV_SLIP_R> _befDelDlvSlipL;
		MCList<MST_PURC_DLV_SLIP_D_R> _befDelDlvSlipDL;
		/** 更新リスト：ヘッダ*/
		MCList<PurcPrnt_Upd01_HdrR> _insHdrL;
		MCList<MST_PURC_DLV_SLIP_R> _updHdrL;
		MCList<MST_PURC_DLV_SLIP_R> _delHdrL;
		/** 更新リスト：明細*/
		MCList<PurcPrnt_Upd01_DtlR> _insDtlL;
		MCList<MST_PURC_DLV_SLIP_D_R> _updDtlL;
		MCList<MST_PURC_DLV_SLIP_D_R> _delDtlL;
		/** 更新リスト：入荷予定*/
		MCList<MST_ARR_SCHD_R> _updArrSchdL;
		/** 採番済の納品書ＮＯ、連番を格納する*/
		MCList<PurcPrnt_Upd01_HdrR> _assignHdrL;
		MCList<PurcPrnt_Upd01_DtlR> _assignDtlL;
		/** 発行対象の納品書NO・管理連番を格納する*/
		MCList<PurcPrnt_Prnt01_DlvSlipR> _prntTgtHdrL;
		/** 削除対象除外ヘッダ*/
		MCList<MST_PURC_DLV_SLIP_R> _removeDelHdrL;
		/** キャッシュ関連*/
		MCList<MST_PO_R> _cachePo = null;
		MCList<MST_PO_D_R> _cachePoD = null;
		MCList<MST_PRMS_RCPT_R> _cachePrmsRcpt = null;
		MCList<MST_DLV_INST_R> _cacheDlvInst = null;
		MCList<MST_ARR_PR_R> _cacheArrPr = null;
		MCList<MST_PURC_DLV_SLIP_R> _cachePurcDlvSlip = null;
		MCList<MST_PURC_DLV_SLIP_D_R> _cachePurcDlvSlipD = null;
		MCList<MST_ARR_SCHD_R> _cacheArrSchd = null;
		MCList<MST_PROV_SCHD_R> _cacheProvSchd = null;
		protected FXUCL_MCDbcCache<MAM_BP_R> _cacheBp = null;
		protected FXUCL_MCDbcCache<MAM_LOC_R> _cacheLoc = null;
		protected FXUCL_MCDbcCache<MAM_SLIP_FORM_R> _cacheSlipForm = null;
		protected FXUCL_MCDbcCache<MAM_TAX_R> _cacheTax = null;
		protected FXUCL_MCDbcCache<MAM_CUR_R> _cacheCur = null;
		protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _cacheItmUnit = null;
		protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _cacheDpt = null;
		protected FXUCL_MCDbcCache<MAM_USR_R> _cacheUsr = null;
		protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItm = null;
		MCIndexKey _cachePoIndex = null;
		MCIndexKey _cachePoDIndex = null;
		MCIndexKey _cachePrmsRcptIndex = null;
		MCIndexKey _cacheDlvInstIndex = null;
		MCIndexKey _cacheArrPrIndex = null;
		MCIndexKey _cachePurcDlvSlipIndexByDlvSlip = null;
		MCIndexKey _cachePurcDlvSlipIndex = null;
		MCIndexKey _cachePurcDlvSlipIndexByPo = null;
		MCIndexKey _cachePurcDlvSlipIndexByDlvInstGrp = null;
		MCIndexKey _cachePurcDlvSlipIndexByPrmsRcpt = null;
		MCIndexKey _cachePurcDlvSlipDIndex = null;
		MCIndexKey _cachePurcDlvSlipDIndexByHdrKey = null;
		MCIndexKey _cacheArrSchdIndex = null;
		MCIndexKey _cacheArrSchdIndexByPo = null;
		MCIndexKey _cacheArrSchdIndexByDlvInstGrp = null;
		MCIndexKey _cacheArrSchdIndexByDlvInstD = null;
		MCIndexKey _cacheArrSchdIndexByPrmsRcptGrp = null;
		MCIndexKey _cacheArrSchdIndexByPrmsRcptD = null;
		MCIndexKey _cacheArrSchdIndexByDlvSlip = null;
		MCIndexKey _cacheArrSchdIndexByDlvSlipD = null;
		MCIndexKey _cacheProvSchdIndex = null;
		MCList<PurcPrnt_Upd01_HdrR> _down0L = null;
		MCList<PurcPrnt_Upd01_DtlR> _down1L = null;
		MCIndexKey _cachePurcDlvSlipIndexByMngNo = null;
		protected FXUCL_MCDbcCache<MAM_CUR_LCL_R> _cacheCurOutsrcLcl = null;
		protected FXUCL_MCDbcCache<MAM_LOC_LCL_R> _cacheLocOutsrcLcl = null;
		protected FXUCL_MCDbcCacheStEnd<MAM_DPT_LCL_R> _cacheDptOutsrcLcl = null;
		protected FXUCL_MCDbcCache<MAM_USR_LCL_R> _cacheUsrOutsrcLcl = null;
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			// 前処理
			preProc();
			// ワークテーブルを設定する
			insWk();
			// 更新対象テーブルをロックする
			chkLock();
			// 関連テーブル取得
			doCache();
			// 購買納品伝票データ作成
			crtPurcDlvSlip();
			// 入荷予定更新（納品伝票関連データクリア）
			clearArrSchd();
			// 入荷予定更新
			// （納品書ＮＯセット）
			updArrSchd();
			// ワークテーブル削除
			delWk();
			// 帳票発行
			callPurcPrnt01();
			setDown();
		}
		protected void setDown() {
			setDown0();
			setDown1();
		}
		protected void setDown0() {
			down0().addAll(_down0L);
		}
		protected void setDown1() {
			// 購買納品伝票トランを作成しない場合もあるので、最新の連番を取得して下り電文に設定する
			
			MST_PURC_DLV_SLIP_D_R wkDbc = MST_PURC_DLV_SLIP_D_R.create();
			dbWkDelete("MSBDL5200_MSW_PURC_DLV_SLIP_D_D01", wkDbc);
			dbWkInsert("MSBDL5200_MSW_PURC_DLV_SLIP_D_I01",
				_down1L.distinctNE(PurcPrnt_Upd01_DtlR.$dlv_slip_mng_d_no), wkDbc);
			
			MST_PURC_DLV_SLIP_D_R t1 = MST_PURC_DLV_SLIP_D_R.create("T1");
			MST_PURC_DLV_SLIP_R t2 = MST_PURC_DLV_SLIP_R.create("T2");
			MSW_PURC_DLV_SLIP_D_KEY_R w1 = MSW_PURC_DLV_SLIP_D_KEY_R.create("W1");
			MST_PURC_DLV_SLIP_D_R w2 = MST_PURC_DLV_SLIP_D_R.create("W2");
			MCTempView v1 = createTempView("V1");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
			bldr.setSelect(
				t1.dlv_slip_mng_d_no,
				t1.dlv_slip_mng_d_seq,
				t1.dlv_slip_d_no,
				t1.dlv_slip_d_seq,
				t2.dlv_slip_mng_no,
				t2.dlv_slip_mng_seq,
				t2.dlv_slip_no,
				t2.dlv_slip_seq,
				t2.dlv_slip_rev
			);
			bldr.addInnerJoin(
				subQuery()
				.select(
					w1.dlv_slip_mng_d_no,
					max(w2.dlv_slip_mng_d_seq).as("dlv_slip_mng_d_seq")
				)
				.from(w2
					.innerJoin(w1).on(w2.dlv_slip_mng_d_no.eq(w1.dlv_slip_mng_d_no))
				)
				.groupBy(w1.dlv_slip_mng_d_no)
				.view(v1),
				v1.pr("dlv_slip_mng_d_no").eq(t1.dlv_slip_mng_d_no)
					.and(v1.pr("dlv_slip_mng_d_seq").eq(t1.dlv_slip_mng_d_seq))
			);
			bldr.addInnerJoin(t2,
				t2.dlv_slip_mng_no.eq(t1.dlv_slip_mng_no).and(t2.dlv_slip_mng_seq.eq(t1.dlv_slip_mng_seq)));
			
			MCList<MST_PURC_DLV_SLIP_D_R> rsltL = MCList.create(MST_PURC_DLV_SLIP_D_R.class);
			dbSelect("MSBDL5200_MST_PURC_DLV_SLIP_S09", rsltL, bldr);
			MCIndexKey idx = rsltL.createIndex(MST_PURC_DLV_SLIP_D_R.$dlv_slip_mng_d_no);
			
			dbWkDelete("MSBDL5200_MSW_PURC_DLV_SLIP_D_D02", wkDbc);
			
			for (PurcPrnt_Upd01_DtlR down1R : _down1L) {
				MST_PURC_DLV_SLIP_D_R slipR = rsltL.getFirst(idx, down1R.dlv_slip_mng_d_no());
				if (!isNull(slipR)) {
					down1R.dlv_slip_mng_d_no(slipR.dlv_slip_mng_d_no());
					down1R.dlv_slip_mng_d_seq(slipR.dlv_slip_mng_d_seq());
					down1R.dlv_slip_d_no(slipR.dlv_slip_d_no());
					down1R.dlv_slip_d_seq(slipR.dlv_slip_d_seq());
					down1R.dlv_slip_mng_no(slipR.dlv_slip_mng_no());
					down1R.dlv_slip_mng_seq(slipR.dlv_slip_mng_seq());
					down1R.dlv_slip_no(slipR.getStringNE("dlv_slip_no"));
					down1R.dlv_slip_seq(slipR.getNumberNE("dlv_slip_seq"));
					down1R.dlv_slip_rev(slipR.getNumberNE("dlv_slip_rev"));
				}
			}
			
			down1().addAll(_down1L);
		}

		/**
		 * 前処理を実行する
		 */
		protected void preProc() {
			_befDelDlvSlipL = MCList.create(MST_PURC_DLV_SLIP_R.class);
			_befDelDlvSlipDL = MCList.create(MST_PURC_DLV_SLIP_D_R.class);
			_insHdrL = MCList.create(PurcPrnt_Upd01_HdrR.class);
			_updHdrL = MCList.create(MST_PURC_DLV_SLIP_R.class);
			_delHdrL = MCList.create(MST_PURC_DLV_SLIP_R.class);
			_insDtlL = MCList.create(PurcPrnt_Upd01_DtlR.class);
			_updDtlL = MCList.create(MST_PURC_DLV_SLIP_D_R.class);
			_delDtlL = MCList.create(MST_PURC_DLV_SLIP_D_R.class);
			_assignHdrL = MCList.create(PurcPrnt_Upd01_HdrR.class);
			_assignDtlL = MCList.create(PurcPrnt_Upd01_DtlR.class);
			_updArrSchdL = MCList.create(MST_ARR_SCHD_R.class);
			_prntTgtHdrL = MCList.create(PurcPrnt_Prnt01_DlvSlipR.class);
			_removeDelHdrL = MCList.create(MST_PURC_DLV_SLIP_R.class);
			_hdrPegNo = MCNumber.ZERO;
			_down0L = MCList.create(PurcPrnt_Upd01_HdrR.class);
			_down1L = MCList.create(PurcPrnt_Upd01_DtlR.class);
			setUp();
		}
		protected void insWk() {
			// 発注ワーク
			MCQueryApiBuilder work_bldr = MCQueryApiBuilder.create(MST_PO_R.create("T"));
			dbWkDelete("MSBDL5200_MSW_PO_D03", work_bldr.getBaseDbc());
			MCList<MSW_PO_KEY_R> poL = MCList.create(MSW_PO_KEY_R.class);
			for (PurcPrnt_Upd01_HdrR r : _up0L.groupBy(PurcPrnt_Upd01_HdrR.$po_no)) {
				MSW_PO_KEY_R wkR = poL.add();
				wkR.po_no(r.po_no());
			}
			dbWkInsert("MSBDL5200_MSW_PO_D_I02", poL, work_bldr.getBaseDbc());
		}
		protected void delWk() {
			MCQueryApiBuilder work_bldr = MCQueryApiBuilder.create(MST_PO_R.create("T"));
			dbWkDelete("MSBDL5200_MSW_PO_D04", work_bldr.getBaseDbc());
		}
		protected void setUp() {
			_up0L = MCList.create(PurcPrnt_Upd01_HdrR.class);
			MCList<PurcPrnt_Upd01_HdrR>[]gpL = up0().groupList(PurcPrnt_Upd01_HdrR.$po_no,
																								PurcPrnt_Upd01_HdrR.$po_rev,
																								PurcPrnt_Upd01_HdrR.$dlv_slip_prnt_flg,
																								PurcPrnt_Upd01_HdrR.$dlv_inst_grp_no,
																								PurcPrnt_Upd01_HdrR.$prms_rcpt_grp_no);
			for (MCList<PurcPrnt_Upd01_HdrR> wkL : gpL) {
				PurcPrnt_Upd01_HdrR wkR = wkL.get(0);
				if (wkL.size() > 1) {
					wkR.peg_no(null);
					wkR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				_up0L.add(wkR);
			}
		}
		/**
		 * 更新対象のテーブルをロックする
		 */
		protected void chkLock() {
			lockPurcDlvInst();
			lockPurcDlvInstD();
			lockArrSchd();
		}
		
		/**
		 * 関連テーブルをキャッシュする
		 */
		protected void doCache() {
			initCachePo();
			initCachePoD();
			initCacheArrPr();
			initCachePrmsRcpt();
			initCacheDlvInst();
			initArrSchdCache();
			initCachePurcDlvSlip();
			initCachePurcDlvSlipD();
			initCacheProvSchd();
			initCacheLoc();
			initCacheBp();
			initCacheSlipForm();
			initCacheTax();
			initCacheCur();
			initCacheItmUnit();
			initCacheDpt();
			initCacheUsr();
			initCacheItm();
			initCacheCurOutsrcLcl();
			initCacheLocOutsrcLcl();
			initCacheDptOutsrcLcl();
			initCacheUsrOutsrcLcl();
		}
		
		/**
		 * 購買納品伝票を作成する
		 */
		protected void crtPurcDlvSlip() {
			for (PurcPrnt_Upd01_HdrR r : _up0L) {
				MCList<PurcPrnt_Upd01_HdrR> hdrL = MCList.create(PurcPrnt_Upd01_HdrR.class);
				MCList<PurcPrnt_Upd01_DtlR> dtlL = MCList.create(PurcPrnt_Upd01_DtlR.class);
				MST_PO_R poR = getCachePo(r.po_no());
				PurcPrnt_Upd01_HdrR baseHdrR = r.clone();
				copy(baseHdrR, poR , createMap_PurcPrnt_Upd01_HdrR_MST_PO_R());
				setDelOldHdr(baseHdrR);
				// 最終承認済でない場合は新規の納品書は作らない
				if (poR.aprv_flg() && !MAC_APRV_STS_TYP.isACPT(poR.aprv_sts_typ())) {
					continue;
				}
				crtHdrDtl(baseHdrR, poR, hdrL, dtlL);
				setDbUpdHdrDtl(hdrL, dtlL);
				_down1L.addAll(dtlL);
			}
			updDisDlvSlip();
			delDlvSlip();
			insDlvSlip();
			insDlvSlipD();
			updDlvSlip();
			updDlvSlipD();
		}
		
		protected void callPurcPrnt01() {
			MSBDL_PurcPrntService.PurcPrnt_Prnt01 purcPrnt01 = MSBDL_PurcPrntService.crtPurcPrnt_Prnt01();
			_prntTgtHdrL.sort(PurcPrnt_Prnt01_DlvSlipR.$dlv_slip_mng_no, PurcPrnt_Prnt01_DlvSlipR.$dlv_slip_mng_seq);
			for (PurcPrnt_Prnt01_DlvSlipR prntTgtHdrR : _prntTgtHdrL) {
				if (isPrntDlvSlip(prntTgtHdrR)) {
					purcPrnt01.up2().add(prntTgtHdrR);
				}
			}
			if (isSame(purcPrnt01.up2().size(), 0)) {
				MCList<PurcPrnt_Upd01_HdrR> up0PrntTgtL = _up0L.subList(r -> r.dlv_slip_prnt_flg());
				if ((!isNull(_prntTgtHdrL) && !_prntTgtHdrL.isEmpty()) || (isNull(up0PrntTgtL) || up0PrntTgtL.isEmpty())) {
				}
				else {
					// 処理内で納品書が作成されなかった場合もエラーメッセージを出力するために発注NOのみの行を追加しておく
					for (PurcPrnt_Upd01_HdrR up0R : up0PrntTgtL) {
						MCList<MST_ARR_SCHD_R> arrSchdL = getCacheArrSchdByPo(up0R.po_no());
						boolean isNoCmpl = false;
						if (!isNull(arrSchdL) && !arrSchdL.isEmpty()) {
							for (MST_ARR_SCHD_R arrSchdR : arrSchdL) {
								MST_PO_D_R poDR = getCachePoD(arrSchdR.getStringNE("po_d_no"));
								MST_ARR_PR_R arrPrR = getCacheArrPr(arrSchdR.arr_pr_no());
								if (!arrSchdR.cmpl_flg() || (!poDR.dlv_slip_invalid_flg() && arrSchdR.arr_skip_flg() && !arrPrR.purc_cmpl_flg())) {
									isNoCmpl = true;
									break;
								}
							}
							if (isNoCmpl) {
								continue;
							}
						}
						PurcPrnt_Prnt01_DlvSlipR prntDlvSlipR = purcPrnt01.up2().add();
						prntDlvSlipR.po_no(up0R.po_no());
					}
				}
			}
			if (!purcPrnt01.up2().isEmpty()) {
				purcPrnt01.up2().setBoolean(PurcPrnt_Prnt01_DlvSlipR.$bp_srch_flg, true);
				purcPrnt01.up3().indiv_prnt_flg(up1().indiv_prnt_flg());
				purcPrnt01.exec();
			}
			
			MCIndexKey idxKey = purcPrnt01.down2().createIndex(PurcPrnt_Prnt01_DlvSlipR.$po_no);
			for (PurcPrnt_Upd01_HdrR up0R :  _up0L) {
				PurcPrnt_Upd01_HdrR downR = PurcPrnt_Upd01_HdrR.create();
				downR.peg_no(up0R.peg_no());
				
				MCList<PurcPrnt_Prnt01_DlvSlipR> prntDownL = purcPrnt01.down2().subList(idxKey, up0R.po_no());
				if (isNull(prntDownL) || prntDownL.isEmpty()) {
					downR.err_flg(false);
				}
				else {
					downR.err_flg((boolean)prntDownL.max(PurcPrnt_Prnt01_DlvSlipR.$err_flg));
				}
				
				_down0L.add(downR);
			}
		}
		
		/**
		 * 納品書を発行するか
		 */
		protected boolean isPrntDlvSlip(PurcPrnt_Prnt01_DlvSlipR dlvSlipR) {
			MST_PURC_DLV_SLIP_R oldDlvSlipR = getCachePurcDlvSlip(dlvSlipR.dlv_slip_mng_no(), dlvSlipR.dlv_slip_mng_seq());
			// 購買納品伝票ヘッダキャッシュが取得できない場合は、登録対象なので発行する
			if (isNull(oldDlvSlipR) || oldDlvSlipR.isEmpty() || !oldDlvSlipR.slip_prnt_flg()) {
				return true;
			}
			// それ以外の場合、発行対象にするかはシステムパラメータに依存する
			return MCBooleanUtil.dbStringToBoolean(
					getSysParmNE("IMDT_PRNT_DLV_SLIP_FLG"));
		}
		
		/**
		 * 購買納品伝票の「新規」データから「納品書ＮＯ」・「発注ＮＯ」or「納入指示ＧＮＯ」or「納期回答受領ＧＮＯ」に紐づくデータを取消する
		 * @param baseHdrR 変更前のヘッダ
		 * @param hdrL 処理内で作成した納品書ヘッダ
		 */
		protected void setDelOldHdr(PurcPrnt_Upd01_HdrR baseHdrR) {
			MCList<MST_PURC_DLV_SLIP_R> dlvSlipL = null;
			if (MSC_PURC_DLV_SLIP_SRC_TYP.isDLV_INST(baseHdrR.purc_dlv_slip_src_typ())) {
				dlvSlipL = getCachePurcDlvSlipByDlvInstGrp(baseHdrR.po_no(), baseHdrR.dlv_inst_grp_no());
				MCList<MST_PURC_DLV_SLIP_R>noDlvSlipL = getCachePurcDlvSlipByDlvInstGrp(baseHdrR.po_no(), null);
				if (!isNull(noDlvSlipL)) {
					dlvSlipL.addAll(noDlvSlipL);
				}
			}
			else if (MSC_PURC_DLV_SLIP_SRC_TYP.isPRMS_RCPT(baseHdrR.purc_dlv_slip_src_typ())) {
				dlvSlipL = getCachePurcDlvSlipByPrmsRcptGrp(baseHdrR.po_no(), baseHdrR.prms_rcpt_grp_no());
				MCList<MST_PURC_DLV_SLIP_R>noPrmsRcptL = getCachePurcDlvSlipByPrmsRcptGrp(baseHdrR.po_no(), null);
				if (!isNull(noPrmsRcptL)) {
					dlvSlipL.addAll(noPrmsRcptL);
				}
			}
			else {
				dlvSlipL = getCachePurcDlvSlipByPo(baseHdrR.po_no());
			}
			// 削除対象データがない場合は処理しない
			if(isNull(dlvSlipL) || dlvSlipL.isEmpty()) {
				return;
			}
			for (MST_PURC_DLV_SLIP_R dlvSlipR: dlvSlipL) {
				if (!isDelTgtHdr(baseHdrR, dlvSlipR)) {
					continue;
				}
				MCList<MST_PURC_DLV_SLIP_D_R> delDL = getCachePurcDlvSlipDByHdrKey(dlvSlipR.dlv_slip_mng_no(), dlvSlipR.dlv_slip_mng_seq());
				if (!isNull(delDL) && !delDL.isEmpty()) {
					_delDtlL.addAll(delDL);
				}
				_delHdrL.add(dlvSlipR);
				if (baseHdrR.dlv_slip_prnt_flg()) {
					PurcPrnt_Prnt01_DlvSlipR prntR = PurcPrnt_Prnt01_DlvSlipR.create();
					setPrntTgtHdr(prntR, dlvSlipR, baseHdrR);
					prntR.dlv_slip_mng_seq(prntR.dlv_slip_mng_seq().add(1));
					_prntTgtHdrL.add(prntR);
				}
			}
		}
		
		/**
		 * 納品伝票ヘッダは取消対象か
		 * @param up0R 上り電文
		 * @param dlvSlipR チェック対象の納品伝票ヘッダ
		 */
		protected boolean isDelTgtHdr(PurcPrnt_Upd01_HdrR up0R, MST_PURC_DLV_SLIP_R dlvSlipR) {
			// 伝票状況区分「登録」以外は取消対象ではない
			if (!MAC_SLIP_STS_TYP.isCRT(dlvSlipR.slip_sts_typ())) {
				return false;
			}
			// 以下の条件を全て満たす場合は取消対象に含まない
			// ・上り電文の購買納品伝票区分が「発注」以外
			// ・上り電文のデータ更新区分が「削除」
			// ・購買納品伝票作成元区分が上り電文とチェック対象の納品伝票ヘッダで異なる
			// ・削除前の納品書ヘッダに紐づく納品書明細の納入指示・納期回答が存在しない場合
			if (!MSC_PURC_DLV_SLIP_SRC_TYP.isPO(up0R.purc_dlv_slip_src_typ())
				&& MAC_DATA_CRUD_TYP.isDEL(up0R.data_crud_typ())
				&& !isSame(up0R.purc_dlv_slip_src_typ(), dlvSlipR.purc_dlv_slip_src_typ())
				&& !isExistsDlvInst(up0R, dlvSlipR) && !isExistsPrmsRcpt(up0R, dlvSlipR)) {
				setDelLinkDlvSlip(up0R, dlvSlipR);
				return false;
			}
			// 入荷予定が全数入荷済の場合は取消対象に含まない
			if (isCmplArrByHdr(dlvSlipR)) {
				return false;
			}
			// 同一の購買納品伝票ヘッダが既に削除対象から除外された場合は取消対象に含まない
			// 例：複数の納期回答受領ヘッダを入荷予定反映オフ→オンに変更
			for (MST_PURC_DLV_SLIP_R removeDelHdrR : _removeDelHdrL) {
				if (isSame(dlvSlipR, removeDelHdrR)) {
					return false;
				}
			}
			// 重複する場合は取消対象に含まない
			for (MST_PURC_DLV_SLIP_R rdelHdrR : _delHdrL) {
				if (isSame(dlvSlipR, rdelHdrR)) {
					return false;
				}
			}
			return true;
		}
		protected boolean isExistsDlvInst(PurcPrnt_Upd01_HdrR up0R, MST_PURC_DLV_SLIP_R dlvSlipR) {
			if (!MSC_PURC_DLV_SLIP_SRC_TYP.isDLV_INST(up0R.purc_dlv_slip_src_typ())) {
				return false;
			}
			
			MCList<MST_DLV_INST_R> dlvInstL = getCacheDlvInst(dlvSlipR.dlv_inst_grp_no());
			if (isNull(dlvInstL) || dlvInstL.isEmpty()) {
				return false;
			}
			return true;
		}
		
		protected boolean isExistsPrmsRcpt(PurcPrnt_Upd01_HdrR up0R, MST_PURC_DLV_SLIP_R dlvSlipR) {
			if (!MSC_PURC_DLV_SLIP_SRC_TYP.isPRMS_RCPT(up0R.purc_dlv_slip_src_typ())) {
				return false;
			}

			MCList<MST_PRMS_RCPT_R> prmsRcptL = getCachePrmsRcpt(dlvSlipR.prms_rcpt_grp_no());
			if (isNull(prmsRcptL) || prmsRcptL.isEmpty()) {
				return false;
			}
			return true;
		}
		
		/**
		 * 納品伝票トランと納入指示・納期回答受領の紐づきを取り消す
		 */
		protected void setDelLinkDlvSlip(PurcPrnt_Upd01_HdrR up0R,MST_PURC_DLV_SLIP_R dlvSlipR) {
			MST_PURC_DLV_SLIP_R wkHdrR = dlvSlipR.clone();
			MCList<MST_PURC_DLV_SLIP_D_R>wkDtlL = getCachePurcDlvSlipDByHdrKey(wkHdrR.dlv_slip_mng_no(), wkHdrR.dlv_slip_mng_seq());
			if (MSC_PURC_DLV_SLIP_SRC_TYP.isDLV_INST(up0R.purc_dlv_slip_src_typ())) {
				wkHdrR.dlv_inst_grp_no(null);
				wkDtlL.setStringNE(MST_PURC_DLV_SLIP_D_R.$dlv_inst_d_no, null);
			}
			else if (MSC_PURC_DLV_SLIP_SRC_TYP.isPRMS_RCPT(up0R.purc_dlv_slip_src_typ())) {
				wkHdrR.prms_rcpt_grp_no(null);
				wkDtlL.setStringNE(MST_PURC_DLV_SLIP_D_R.$prms_rcpt_d_no, null);
			}
			_updHdrL.add(wkHdrR);
			_updDtlL.addAll(wkDtlL);
		}
		/**
		 * 納品書発行サービスの上り電文用の項目を設定する
		 * @param destR
		 * @param srcR
		 * @param up0R
		 */
		protected void setPrntTgtHdr(PurcPrnt_Prnt01_DlvSlipR destR, MST_PURC_DLV_SLIP_R srcR, PurcPrnt_Upd01_HdrR up0R) {
			if (MSC_PURC_DLV_SLIP_SRC_TYP.isDLV_INST(up0R.purc_dlv_slip_src_typ())) {
				destR.dlv_inst_grp_no(up0R.dlv_inst_grp_no());
			}
			else if (MSC_PURC_DLV_SLIP_SRC_TYP.isPRMS_RCPT(up0R.prms_rcpt_grp_no())) {
				destR.prms_rcpt_grp_no(up0R.prms_rcpt_grp_no());
			}
			destR.peg_no(up0R.peg_no());
			destR.po_no(up0R.po_no());
			destR.dlv_slip_mng_no(srcR.dlv_slip_mng_no());
			destR.dlv_slip_mng_seq(srcR.dlv_slip_mng_seq());
		}
		/**
		 * 納品伝票ヘッダ・明細を作成する
		 * @param baseHdrR
		 * @param poR
		 */
		protected void crtHdrDtl(PurcPrnt_Upd01_HdrR baseHdrR, MST_PO_R poR, MCList<PurcPrnt_Upd01_HdrR> hdrL, MCList<PurcPrnt_Upd01_DtlR>dtlL) {
			split(baseHdrR, poR, hdrL, dtlL);
			setHdrSeq(hdrL);
			setDtlSeq(hdrL, dtlL);
			calcAmt(hdrL, dtlL);
			setTotalAmt(hdrL, dtlL);
		}
		
		/**
		 * 納品伝票を分割する
		 * @param baseHdrR ヘッダ作成元の行
		 * @param poR 発注ヘッダ
		 * @param hdrL 分割後のヘッダを格納するリスト
		 * @param dtlL 分割後の明細を格納するリスト
		 */
		protected void split(PurcPrnt_Upd01_HdrR baseHdrR, MST_PO_R poR, MCList<PurcPrnt_Upd01_HdrR> hdrL, MCList<PurcPrnt_Upd01_DtlR> dtlL) {
			
			MCList<MST_PURC_DLV_SLIP_D_R> wkDelDtlL = MCList.create(MST_PURC_DLV_SLIP_D_R.class);
			MCList<MST_ARR_SCHD_R> arrSchdL = null;
			if(MSC_PURC_DLV_SLIP_SRC_TYP.isDLV_INST(baseHdrR.purc_dlv_slip_src_typ())){
				arrSchdL = getCacheArrSchdByDlvInst(baseHdrR.dlv_inst_grp_no());
			}
			else if (MSC_PURC_DLV_SLIP_SRC_TYP.isPRMS_RCPT(baseHdrR.purc_dlv_slip_src_typ())) {
				arrSchdL = getCacheArrSchdByPrmsRcpt(baseHdrR.prms_rcpt_grp_no());
			}
			else {
				arrSchdL = getCacheArrSchdByPo(baseHdrR.po_no());
			}
			if (isNull(arrSchdL) || arrSchdL.isEmpty()) {
				return;
			}
			MCList<PurcPrnt_Upd01_HdrR> wkHdrL = MCList.create(PurcPrnt_Upd01_HdrR.class);
			MCIndexKey idxDelD1 = _delDtlL.createIndex(MST_PURC_DLV_SLIP_D_R.$dlv_slip_mng_d_no, MST_PURC_DLV_SLIP_D_R.$dlv_slip_d_seq);
			
			// ヘッダの項目を補完する
			for (MST_ARR_SCHD_R arrSchdR : arrSchdL) {
				MST_ARR_PR_R arrPrR = getCacheArrPr(arrSchdR.arr_pr_no());
				// 全数入荷済の場合は対象外
				if (arrSchdR.cmpl_flg() && !arrSchdR.arr_skip_flg()) {
					MST_PURC_DLV_SLIP_D_R delDR = _delDtlL.getFirst(idxDelD1, arrSchdR.dlv_slip_mng_d_no(), arrSchdR.dlv_slip_mng_d_seq());
					if (!isNull(delDR) && !delDR.isEmpty()) {
						wkDelDtlL.add(delDR);
					}
					continue;
				}
				// 入荷不要品の場合、全数仕入済の場合対象外
				else if (arrSchdR.arr_skip_flg() && arrPrR.purc_cmpl_flg()) {
					MST_PURC_DLV_SLIP_D_R delDR = _delDtlL.getFirst(idxDelD1, arrSchdR.dlv_slip_mng_d_no(), arrSchdR.dlv_slip_mng_d_seq());
					if (!isNull(delDR) && !delDR.isEmpty()) {
						wkDelDtlL.add(delDR);
					}
					continue;
				}
				PurcPrnt_Upd01_HdrR wkHdrR = baseHdrR.clone();
				completionHdr(wkHdrR, poR, arrSchdR);
				wkHdrL.add(wkHdrR);
			}
			if (!isNull(wkDelDtlL) && !wkDelDtlL.isEmpty()) {
				MCList<MST_PURC_DLV_SLIP_R> removeHdrL = MCList.create(MST_PURC_DLV_SLIP_R.class);
				MCList<MST_PURC_DLV_SLIP_D_R> removeDtlL = MCList.create(MST_PURC_DLV_SLIP_D_R.class);
				MCList<PurcPrnt_Prnt01_DlvSlipR> removePrntTgtL = MCList.create(PurcPrnt_Prnt01_DlvSlipR.class);
				MCIndexKey idxPrtTgtHdr = _prntTgtHdrL.createIndex(PurcPrnt_Prnt01_DlvSlipR.$dlv_slip_mng_no, PurcPrnt_Prnt01_DlvSlipR.$dlv_slip_mng_seq);
				MCIndexKey idxWkDelD = wkDelDtlL.createIndex(MST_PURC_DLV_SLIP_D_R.$dlv_slip_mng_no, MST_PURC_DLV_SLIP_D_R.$dlv_slip_mng_seq);
				MCIndexKey idxDelD2 = _delDtlL.createIndex(MST_PURC_DLV_SLIP_D_R.$dlv_slip_mng_no, MST_PURC_DLV_SLIP_D_R.$dlv_slip_mng_seq);
				// 取消対象のヘッダに対して全行が完了している場合は、取消対象から除外する
				for (MST_PURC_DLV_SLIP_R delHdrR : _delHdrL) {
					MCList<MST_PURC_DLV_SLIP_D_R> cmplDelL = wkDelDtlL.subList(idxWkDelD, delHdrR.dlv_slip_mng_no(), delHdrR.dlv_slip_mng_seq());
					if (isNull(cmplDelL) || cmplDelL.isEmpty()) {
						continue;
					}
					MCList<MST_PURC_DLV_SLIP_D_R> oldDelL = _delDtlL.subList(idxDelD2, delHdrR.dlv_slip_mng_no(), delHdrR.dlv_slip_mng_seq());
					if (isSame(oldDelL.size(), cmplDelL.size())) {
						PurcPrnt_Prnt01_DlvSlipR prntTgtHdrR = _prntTgtHdrL.getFirst(idxPrtTgtHdr, delHdrR.dlv_slip_mng_no(), delHdrR.dlv_slip_mng_seq().add(1));
						removeHdrL.add(delHdrR);
						removeDtlL.addAll(oldDelL);
						removePrntTgtL.add(prntTgtHdrR);
					}
				}
				if (!isNull(removeHdrL) && !removeHdrL.isEmpty()) {
					_delHdrL.removeAll(removeHdrL);
				}
				if (!isNull(removeDtlL) && !removeDtlL.isEmpty()) {
					_delDtlL.removeAll(removeDtlL);
				}
				if (!isNull(removePrntTgtL) && !removePrntTgtL.isEmpty()) {
					_prntTgtHdrL.removeAll(removePrntTgtL);
				}
			}
			// 分割
			String[] gpKeys = getHdrGpKeys(baseHdrR.purc_dlv_slip_src_typ(), poR.sgl_form_flg());
			MCList<PurcPrnt_Upd01_HdrR>[] wkGpL = wkHdrL.groupList(gpKeys);
			for (MCList<PurcPrnt_Upd01_HdrR>gpL : wkGpL) {
				PurcPrnt_Upd01_HdrR hdrR = gpL.get(0).clone();
				hdrR.addStringColumn("temp_trd_cur_cd");
				hdrR.addStringColumn("temp_trd_cur_nm");
				hdrR.addNumberColumn("temp_xrate");
				hdrR.addNumberColumn("temp_ptax_xrate");
				hdrR.addStringColumn("temp_outsrc_bp_prnt_lcl_cd");
				// 納入指示ＧＮＯが複数になる場合は納入指示ＧＮＯをクリア
				if (MSC_PURC_DLV_SLIP_SRC_TYP.isPRMS_RCPT(hdrR.purc_dlv_slip_src_typ()) && gpL.groupBy(PurcPrnt_Upd01_HdrR.$dlv_inst_grp_no).size() > 1) {
					hdrR.dlv_inst_grp_no(null);
				}
				hdrR.hdr_peg_no(_hdrPegNo);
				_hdrPegNo = _hdrPegNo.add(1);
				hdrL.add(hdrR);
				for (PurcPrnt_Upd01_HdrR gpR : gpL) {
					PurcPrnt_Upd01_DtlR dtlR = PurcPrnt_Upd01_DtlR.create();
					MST_ARR_SCHD_R arrSchdR = getCacheArrSchd(gpR.arr_schd_no());
					completionDtl(dtlR, hdrR, arrSchdR);
					dtlL.add(dtlR);
				}
				if (hdrR.prov_ddlv_flg()) {
					String outsrc_prnt_lcl_cd = hdrR.getStringNE("temp_outsrc_bp_prnt_lcl_cd");
					
					hdrR.trd_cur_cd(hdrR.getStringNE("temp_trd_cur_cd"));
					hdrR.trd_cur_nm(getCacheCurOutsrcLclNm(hdrR.trd_cur_cd(), outsrc_prnt_lcl_cd));
					hdrR.xrate(hdrR.getNumberNE("temp_xrate"));
					hdrR.ptax_xrate(hdrR.getNumberNE("temp_ptax_xrate"));
					
					MAM_LOC_LCL_R locLclR = getCacheLocOutsrcLcl(hdrR.arr_loc_cd(), outsrc_prnt_lcl_cd);
					hdrR.arr_loc_nm(locLclR.loc_nm());
					hdrR.arr_loc_zip_cd(locLclR.zip_cd());
					hdrR.arr_loc_addr1(locLclR.addr1());
					hdrR.arr_loc_addr2(locLclR.addr2());
					hdrR.arr_loc_addr3(locLclR.addr3());
					hdrR.arr_loc_addr4(locLclR.addr4());
					hdrR.arr_loc_tel(locLclR.tel());
					hdrR.arr_loc_fax(locLclR.fax());
					
					MAM_DPT_LCL_R dptLclR = getCacheDptOutsrcLcl(poR.purc_dpt_cd(), outsrc_prnt_lcl_cd);
					hdrR.sppl_zip_cd(dptLclR.zip_cd());
					hdrR.sppl_addr1(dptLclR.addr1());
					hdrR.sppl_addr2(dptLclR.addr2());
					hdrR.sppl_addr3(dptLclR.addr3());
					hdrR.sppl_addr4(dptLclR.addr4());
					hdrR.sppl_tel(dptLclR.tel());
					hdrR.sppl_fax(dptLclR.fax());
					hdrR.sppl_cntct_dpt(dptLclR.dpt_nm());
					hdrR.sppl_cntct_psn(getCacheUsrOutsrsLclNm(poR.purc_usr_cd(), outsrc_prnt_lcl_cd));
				}
			}
		}
		/**
		 * ヘッダの項目を補完する
		 * @param destR 補完先のヘッダ
		 * @param poR 発注ヘッダ
		 * @param arrSchdR 入荷予定
		 */
		protected void completionHdr(PurcPrnt_Upd01_HdrR destR, MST_PO_R poR, MST_ARR_SCHD_R arrSchdR) {
			// 補完
			MAM_DPT_R dptR = getCacheDpt(poR.purc_dpt_cd());
			MAM_LOC_R locR = getCacheLoc(arrSchdR.arr_loc_cd());
			MAM_USR_R usrR = getCacheUsr(poR.purc_usr_cd());
			MAM_CUR_R curR = getCacheCur(poR.trd_cur_cd());

			destR.trd_cur_nm(curR.cur_nm());
			destR.slip_line_max(getLineMax(poR.dlv_slip_form_cd()));
			copy(destR, poR, createMap_PurcPrnt_Upd01_HdrR_MST_PO_R());
			copy(destR, arrSchdR, createMap_PurcPrnt_Upd01_HdrR_MST_ARR_SCHD_R());
			destR.dlv_slip_no(poR.sgl_form_flg() ? destR.po_d_no() : destR.po_no());
			destR.wg_cd(dptR.wg_cd());
			// 仕入直送の場合
			if (destR.purc_ddlv_flg()) {
				destR.arr_loc_nm(getCo().co_nm());
				destR.arr_loc_zip_cd(dptR.zip_cd());
				destR.arr_loc_addr1(dptR.addr1());
				destR.arr_loc_addr2(dptR.addr2());
				destR.arr_loc_addr3(dptR.addr3());
				destR.arr_loc_addr4(dptR.addr4());
				destR.arr_loc_tel(dptR.tel());
				destR.arr_loc_fax(dptR.fax());
			}
			// 仕入直送以外の場合
			else {
				destR.arr_loc_nm(arrSchdR.getStringNE("loc_nm"));
				destR.arr_loc_zip_cd(arrSchdR.getStringNE("zip_cd"));
				destR.arr_loc_addr1(arrSchdR.getStringNE("addr1"));
				destR.arr_loc_addr2(arrSchdR.getStringNE("addr2"));
				destR.arr_loc_addr3(arrSchdR.getStringNE("addr3"));
				destR.arr_loc_addr4(arrSchdR.getStringNE("addr4"));
				destR.arr_loc_tel(arrSchdR.getStringNE("tel"));
				destR.arr_loc_fax(arrSchdR.getStringNE("fax"));
			}
			// 支給直送の場合、自社→外注先の納品書にする
			if (destR.prov_ddlv_flg()) {
				MAM_BP_R outsrcSpplR = getCacheBp(locR.sppl_cd());
				destR.bp_cntct_dpt(outsrcSpplR.sppl_cntct_dpt());
				destR.bp_cntct_psn(outsrcSpplR.sppl_cntct_psn());
				destR.sppl_zip_cd(dptR.zip_cd());
				destR.sppl_addr1(dptR.addr1());
				destR.sppl_addr2(dptR.addr2());
				destR.sppl_addr3(dptR.addr3());
				destR.sppl_addr4(dptR.addr4());
				destR.sppl_tel(dptR.tel());
				destR.sppl_fax(dptR.fax());
				destR.sppl_cntct_dpt(dptR.dpt_nm());
				destR.sppl_cntct_psn(usrR.usr_nm());
				destR.sppl_id_typ(MSC_DLV_ID_TYP.CO.value());
				destR.sppl_id_cd(getCo().co_cd());
			}
			else {
				destR.bp_cntct_dpt(dptR.dpt_nm());
				destR.bp_cntct_psn(usrR.usr_nm());
				destR.sppl_id_typ(MSC_DLV_ID_TYP.SPPL.value());
				destR.sppl_id_cd(destR.bp_cd());
			}
		}
		/**
		 * マスタから伝票行数を取得する
		 */
		protected MCNumber _maxLine = MCNumber.valueOf(Math.pow(10, MST_DLV_SLIP_R.slip_line_max_META.length()) - 1);
		protected int getLineMax(String form_cd) {
			MCNumber line = _maxLine;
			MAM_SLIP_FORM_R frmR = getCacheSlipForm(form_cd);
			if (!isNull(frmR) && !isNull(frmR.line_num())) {
				line = frmR.line_num();
			}
			return line.intValue();
		}
		/**
		 * 明細の項目を補完する
		 * @param dtlR 明細
		 * @param hdrR ヘッダ
		 * @param arrSchdR 入荷予定
		 */
		protected void completionDtl(PurcPrnt_Upd01_DtlR dtlR, PurcPrnt_Upd01_HdrR hdrR, MST_ARR_SCHD_R arrSchdR) {
			dtlR.arr_schd_no(arrSchdR.arr_schd_no());
			dtlR.hdr_peg_no(hdrR.hdr_peg_no());
			copy(dtlR, hdrR, createMap_PurcPrnt_Upd01_DtlR_PurcPrnt_Upd01_HdrR());
			copy(dtlR, arrSchdR, createMap_PurcPrnt_Upd01_DtlR_MST_ARR_SCHD_R());
			MST_PO_D_R poDR = getCachePoD(dtlR.po_d_no());
			copy(dtlR, poDR, createMap_PurcPrnt_Upd01_DtlR_MST_PO_D_R());
			if (!isSame(poDR.trd_unit_cd(), dtlR.trd_unit_cd())) {
				MAVM_ITM_UNIT_R itmUnitR = getCacheItmUnit(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), dtlR.trd_unit_cd());
				MCNumber poQty = convToBaseUnit(
						dtlR.base_unit_po_qty(),
						itmUnitR.conv_qty(),
						itmUnitR.conv_base_qty(),
						itmUnitR.dec_place(),
						itmUnitR.rnd_typ());
				dtlR.trd_unit_po_qty(poQty);
			}
			if (hdrR.prov_ddlv_flg()) {
				MAM_LOC_R locR = getCacheLoc(arrSchdR.arr_loc_cd());
				MAM_BP_R bpR = getCacheBp(locR.sppl_cd());
				hdrR.setStringNE("temp_outsrc_bp_prnt_lcl_cd", bpR.prnt_lcl_cd());
				MST_PROV_SCHD_R provSchdR = getCacheProvSchd(arrSchdR.arr_schd_no());
				if (isOnrProv(provSchdR)) {
					copy(dtlR, provSchdR, createMap_PurcPrnt_Upd01_DtlR_MST_PROV_SCHD_R());
					MAM_TAX_R taxR = getCacheTax(provSchdR.tax_cd());
					MAM_CUR_R curR = getCacheCur(nvl(provSchdR.trd_cur_cd(), bpR.cur_cd()));
					MCRow r = MAUCL_AmtUtil.getAmtAndTax(
							dtlR.trd_cur_upri(),
							dtlR.base_unit_qty(),
							taxR.tax_rate(),
							taxR.inc_tax_flg(),
							curR.amt_dec_place(),
							bpR.prov_amt_rnd_typ(),
							bpR.prov_tax_rnd_typ());
					dtlR.trd_cur_amt(r.getNumberNE("amt"));
					dtlR.trd_cur_tax_amt(r.getNumberNE("tax_amt"));
					dtlR.trd_cur_dscnt_amt(null);
					hdrR.setStringNE("temp_trd_cur_cd", curR.cur_cd());
					hdrR.setNumberNE("temp_xrate", provSchdR.xrate());
					hdrR.setNumberNE("temp_ptax_xrate", provSchdR.ptax_xrate());
				}
				else {
					hdrR.setStringNE("temp_trd_cur_cd", bpR.cur_cd());
					hdrR.setNumberNE("temp_xrate", null);
					hdrR.setNumberNE("temp_ptax_xrate", null);
					dtlR.trd_cur_amt(null);
					dtlR.trd_cur_tax_amt(null);
					dtlR.trd_cur_dscnt_amt(null);
					dtlR.trd_cur_upri(null);
					dtlR.tax_cd(null);
					dtlR.wtax_rate(getDefWtaxRate(dtlR, bpR.cur_cd(), poDR));
					dtlR.wtax_amt(null);
				}
			}
			if (!dtlR.pri_prnt_flg()) {
				// 金額関連の項目をクリア
				dtlR.trd_cur_upri(null);
				dtlR.trd_cur_amt(null);
				dtlR.trd_cur_dscnt_amt(null);
				dtlR.tax_cd(null);
				dtlR.trd_cur_tax_amt(null);
				dtlR.wtax_rate(null);
				dtlR.wtax_amt(null);
			}
		}
		
		protected boolean isOnrProv(MST_PROV_SCHD_R provSchdR) {
			if (!isNull(provSchdR) && !provSchdR.isEmpty()) {
				return MAC_PROV_TYP.isONR_PROV(provSchdR.prov_typ());
			}
			else {
				// 使用基準
				return false;
			}
		}
		
		protected boolean isWtaxTarget(String trdCurCd) {
			if (isSame(trdCurCd, getCo().base_cur_cd())
				&& (isNull(getCo().ptax_cur_cd()) || isSame(trdCurCd, getCo().ptax_cur_cd()))) {
				return true;
			}
			else {
				return false;
			}
		}
		
		protected MCNumber getDefWtaxRate(PurcPrnt_Upd01_DtlR dtlR, String trdCurCd, MST_PO_D_R poDR) {
			if (isWtaxTarget(trdCurCd)) {
				MST_PO_R poR = getCachePo(poDR.po_no());
				dtlR.addDateColumn("wtax_base_dt", poR.po_dt());
				MCNumber wtaxRate = execFuncNumber(createSqlId(LOGIC_ID, "MAPA_TAX$F_GET_WTAX_RATE", "01"),
						MAPA_TAX$F_GET_WTAX_RATE(
							bind("itm_cd"),
							bind("itm_sub1"),
							bind("itm_sub2"),
							bind("itm_sub3"),
							bind("wtax_base_dt")),
						dtlR);
				return wtaxRate;
			}
			else {
				return null;
			}
		}
		
		/**
		 * ヘッダの集約条件を取得する
		 * @param purcDlvSlipSrcTyp 納品書作成元区分
		 * @param sglFormFlg 単票ＦＬＧ
		 * @return ヘッダの集約条件のキー
		 */
		protected String[] getHdrGpKeys(String purcDlvSlipSrcTyp, boolean sglFormFlg) {
			if (sglFormFlg) {
				return new String[] {PurcPrnt_Upd01_HdrR.$arr_schd_no};
			}
			String gpColumn = null;
			if(MSC_PURC_DLV_SLIP_SRC_TYP.isDLV_INST(purcDlvSlipSrcTyp)){
				gpColumn = MST_DLV_INST_R.$dlv_inst_grp_no;
			}
			else if(MSC_PURC_DLV_SLIP_SRC_TYP.isPRMS_RCPT(purcDlvSlipSrcTyp)){
				gpColumn = MST_PRMS_RCPT_R.$prms_rcpt_grp_no;
			}
			else {
				gpColumn = MST_PO_D_R.$po_no;
			}
			return new String[] {gpColumn
					, PurcPrnt_Upd01_HdrR.$sppl_id_typ
					, PurcPrnt_Upd01_HdrR.$sppl_id_cd
					, PurcPrnt_Upd01_HdrR.$arr_loc_zip_cd
					, PurcPrnt_Upd01_HdrR.$arr_loc_addr1
					, PurcPrnt_Upd01_HdrR.$arr_loc_addr2
					, PurcPrnt_Upd01_HdrR.$arr_loc_addr3
					, PurcPrnt_Upd01_HdrR.$arr_loc_addr4
					, PurcPrnt_Upd01_HdrR.$arr_loc_tel
					, PurcPrnt_Upd01_HdrR.$arr_loc_fax
					, PurcPrnt_Upd01_HdrR.$bp_cntct_dpt
					, PurcPrnt_Upd01_HdrR.$bp_cntct_psn
					, PurcPrnt_Upd01_HdrR.$sppl_zip_cd
					, PurcPrnt_Upd01_HdrR.$sppl_addr1
					, PurcPrnt_Upd01_HdrR.$sppl_addr2
					, PurcPrnt_Upd01_HdrR.$sppl_addr3
					, PurcPrnt_Upd01_HdrR.$sppl_addr4
					, PurcPrnt_Upd01_HdrR.$sppl_tel
					, PurcPrnt_Upd01_HdrR.$sppl_fax
					, PurcPrnt_Upd01_HdrR.$sppl_cntct_dpt
					, PurcPrnt_Upd01_HdrR.$sppl_cntct_psn
					, PurcPrnt_Upd01_HdrR.$dlv_rqst_tm
			};
		}
		/**
		 * 納品書連番の割り当てを行う
		 * @param hdrL 処理対象の納品書ヘッダ一覧
		 */
		protected void setHdrSeq(MCList<PurcPrnt_Upd01_HdrR> hdrL) {
			for (PurcPrnt_Upd01_HdrR hdrR : hdrL) {
				MCList<MST_PURC_DLV_SLIP_R> oldDlvSlipL = getCachePurcDlvSlipByDlvSlip(hdrR.dlv_slip_no());
				// 過去に納品書データを作成している場合
				if (!isNull(oldDlvSlipL) && !oldDlvSlipL.isEmpty()) {
					// 登録済の納品書を入荷予定の納品書管理ＮＯ・連番で取得できるか
					MST_PURC_DLV_SLIP_R oldDlvSlipR = getCachePurcDlvSlip(hdrR.dlv_slip_mng_no(), hdrR.dlv_slip_mng_seq());
					if (!isNull(oldDlvSlipR) && !oldDlvSlipR.isEmpty()) {
						// 登録済の納品書が存在し、処理内で未割り当ての場合は使用可能
						if (!isExistsAssignHdr(oldDlvSlipR.dlv_slip_no(), oldDlvSlipR.dlv_slip_seq()) && isAllocHdr(hdrR, oldDlvSlipR)) {
							hdrR.dlv_slip_seq(oldDlvSlipR.dlv_slip_seq());
							hdrR.dlv_slip_mng_no(oldDlvSlipR.dlv_slip_mng_no());
							hdrR.dlv_slip_rev(oldDlvSlipR.dlv_slip_rev().add(1));
							hdrR.dlv_slip_mng_seq(oldDlvSlipR.dlv_slip_mng_seq().add(2));
							hdrR.old_dlv_slip_mng_seq(oldDlvSlipR.dlv_slip_mng_seq());
							_assignHdrL.add(hdrR);
							continue;
						}
					}
				}
				// 入荷予定の納品書管理ＮＯ・連番から割り当て可能なデータを特定できない場合、処理内で未使用の納品書連番をセットする
				setNoAssignHdrSeq(MCNumber.ONE, hdrR, oldDlvSlipL);
				_assignHdrL.add(hdrR);
			}
		}
		/**
		 * 納品書ＮＯ、連番が処理内で使用されているか
		 * @param dlvSlipNo 納品書ＮＯ
		 * @param dlvSlipSeq 納品書連番
		 * @return true: 納品書ＮＯ・連番が処理内で使用されている<br />
		 * false:納品書ＮＯ・連番が処理内で使用されていない
		 */
		protected boolean isExistsAssignHdr(String dlvSlipNo,  MCNumber dlvSlipSeq) {
			if (isSame(_assignHdrL.size(), 0)) {
				return false;
			}
			MCIndexKey idxAssignHdrKey = _assignHdrL.createIndex(PurcPrnt_Upd01_HdrR.$dlv_slip_no, PurcPrnt_Upd01_HdrR.$dlv_slip_seq);
			PurcPrnt_Upd01_HdrR assignHdrR = _assignHdrL.getFirst(idxAssignHdrKey, dlvSlipNo, dlvSlipSeq);
			// 
			if (isNull(assignHdrR) || assignHdrR.isEmpty()) {
				return false;
			}
			return true;
		}
		/**
		 * 処理内で未使用の納品書連番を登録対象のデータにセットする。
		 * 処理内で使用中、もしくは割り当て不可能な納品書ＮＯ・連番の場合は処理を割当対象の連番を加算して処理を再帰呼び出しする。
		 * @param seq 割当対象の連番
		 * @param hdrR 登録対象の納品書ヘッダ
		 * @param oldDlvSlipL 変更前の納品書ヘッダ
		 */
		protected void setNoAssignHdrSeq(MCNumber seq, PurcPrnt_Upd01_HdrR hdrR, MCList<MST_PURC_DLV_SLIP_R> oldDlvSlipL) {
			if (isExistsAssignHdr(hdrR.dlv_slip_no(), seq)) {
				seq = seq.add(1);
				setNoAssignHdrSeq(seq, hdrR, oldDlvSlipL);
			}
			else {
				MCIndexKey oldDlvSlipKey = oldDlvSlipL.createIndex(MST_PURC_DLV_SLIP_R.$dlv_slip_no, MST_PURC_DLV_SLIP_R.$dlv_slip_seq);
				MST_PURC_DLV_SLIP_R oldDlvSlipR = oldDlvSlipL.getFirst(oldDlvSlipKey, hdrR.dlv_slip_no(), seq);
				if (isNull(oldDlvSlipR)) {
					hdrR.dlv_slip_seq(seq);
					hdrR.dlv_slip_rev(1);
					hdrR.dlv_slip_mng_no(null);
					hdrR.dlv_slip_mng_seq(1);
				}
				else if (isAllocHdr(hdrR, oldDlvSlipR)) {
					hdrR.dlv_slip_seq(seq);
					hdrR.dlv_slip_mng_no(oldDlvSlipR.dlv_slip_mng_no());
					hdrR.dlv_slip_rev(oldDlvSlipR.dlv_slip_rev().add(1));
					if (MAC_SLIP_STS_TYP.isCAN(oldDlvSlipR.slip_sts_typ())) {
						hdrR.dlv_slip_mng_seq(oldDlvSlipR.dlv_slip_mng_seq().add(1));
					}
					else {
						hdrR.dlv_slip_mng_seq(oldDlvSlipR.dlv_slip_mng_seq().add(2));
					}
					hdrR.old_dlv_slip_mng_seq(oldDlvSlipR.dlv_slip_mng_seq());
				}
				else {
					seq = seq.add(1);
					setNoAssignHdrSeq(seq, hdrR, oldDlvSlipL);
				}
			}
		}
		/**
		 * 納品書ＮＯ、連番を新規データに割り当てできるか
		 * @param hdrR 登録対象の納品書ヘッダ
		 * @param oldDlvSlipR 変更前の納品書ヘッダ
		 * @return
		 * true:変更前の納品書ＮＯ・連番を新規データに割り当て可能<br />
		 * false:変更前の納品書ＮＯ・連番を新規データに割り当て不可
		 */
		protected boolean isAllocHdr(PurcPrnt_Upd01_HdrR hdrR, MST_PURC_DLV_SLIP_R oldDlvSlipR) {
			// 全数入荷済の入荷予定に紐づく場合は割り当て不可
			if (isCmplArrByHdr(oldDlvSlipR)) {
				return false;
			}
			// 変更前の納品書ＮＯ・連番が最新ＲＥＶが取消済であれば、新規データに割り当て可能
			if (MAC_SLIP_STS_TYP.isCAN(oldDlvSlipR.slip_sts_typ())) {
				return true;
			}
			else {
				// 納期回答受領をもとに作成する場合、以下のすべての条件に合致すれば割り当て可能。
				// ・変更前の納品書ヘッダの納期回答受領ＧＮＯがNULL、もしくは変更前後で納期回答受領ＧＮＯが一致する
				if (MSC_PURC_DLV_SLIP_SRC_TYP.isPRMS_RCPT(hdrR.purc_dlv_slip_src_typ())) {
					if (isNull(oldDlvSlipR.prms_rcpt_grp_no()) || isSame(hdrR.prms_rcpt_grp_no(), oldDlvSlipR.prms_rcpt_grp_no())) {
						return true;
					}
					else {
						// 変更前後の納期回答受領ＧＮＯが一致しない場合、変更前の納期回答受領ＧＮＯに紐づくデータが削除済なら使用可能。
						MCList<MST_PRMS_RCPT_R> oldPrmsRcptL = getCachePrmsRcpt(oldDlvSlipR.prms_rcpt_grp_no());
						if (isNull(oldPrmsRcptL) || oldPrmsRcptL.isEmpty()) {
							if (!isExistsDelHdr(oldDlvSlipR)) {
								_delHdrL.add(oldDlvSlipR);	
							}
							return true;
						}
						// 処理内で削除するヘッダの場合は割り当て可能
						else if (isExistsDelHdr(oldDlvSlipR)) {
							return true;
						}
					}
				}
				// 納入指示をもとに作成する場合、以下のすべての条件に合致すれば割り当て可能
				// ・納期回答受領ＧＮＯが未設定
				// ・変更前の納品書ヘッダの納入指示ＧＮＯがNULL、もしくは変更前後で納入指示ＧＮＯが一致する、もしくは変更前後で納入指示ＧＮＯが一致しないが処理内で削除対象になっている
				else if (MSC_PURC_DLV_SLIP_SRC_TYP.isDLV_INST(hdrR.purc_dlv_slip_src_typ())) {
					if (isNull(oldDlvSlipR.prms_rcpt_grp_no()) && (isNull(oldDlvSlipR.dlv_inst_grp_no()) || isSame(oldDlvSlipR.dlv_inst_grp_no(), hdrR.dlv_inst_grp_no()))) {
						return true;
					}
					else {
						// 変更前後の納入指示ＧＮＯが一致しない場合、変更前の納入指示ＧＮＯに紐づくデータが削除済なら使用可能。
						MCList<MST_DLV_INST_R> oldDlvInstL = getCacheDlvInst(oldDlvSlipR.dlv_inst_grp_no());
						if (isNull(oldDlvInstL) || oldDlvInstL.isEmpty()) {
							if (!isExistsDelHdr(oldDlvSlipR)) {
								_delHdrL.add(oldDlvSlipR);	
							}
							return true;
						}
						// 処理内で削除するヘッダの場合は割り当て可能
						else if (isExistsDelHdr(oldDlvSlipR)) {
							return true;
						}
					}
				}
				// それ以外の場合は、条件なしで割り当て可能
				else {
					return true;
				}
			}
			return false;
		}
		/**
		 * 全数入荷済か
		 * @param oldDlvSlipDR
		 * @return true 全数入荷済 false 未入荷/一部入荷
		 */
		protected boolean isCmplArrByHdr(MST_PURC_DLV_SLIP_R oldDlvSlipR) {
			MCList<MST_ARR_SCHD_R> arrSchdL = getCacheArrSchdByDlvSlip(oldDlvSlipR.dlv_slip_mng_no(), oldDlvSlipR.dlv_slip_mng_seq());
			if (!isNull(arrSchdL) && !arrSchdL.isEmpty()) {
				for (MST_ARR_SCHD_R r : arrSchdL) {
					if (r.cmpl_flg() && !r.arr_skip_flg()) {
						return true;
					}
				}
			}
			 return false;
		}
		/**
		 * 削除対象のヘッダリストに既に追加済か
		 * @param oldDlvSlipR
		 * @return true:リストに存在する false:リストに存在しない
		 */
		protected boolean isExistsDelHdr(MST_PURC_DLV_SLIP_R oldDlvSlipR) {
			if (_delHdrL.isEmpty() || isNull(_delHdrL)) {
				return false;
			}
			if (_delHdrL.subList(r -> isSame(r.dlv_slip_mng_no(), oldDlvSlipR.dlv_slip_mng_no()) && isSame(r.dlv_slip_mng_seq(), oldDlvSlipR.dlv_slip_mng_seq())).size() > 0) {
				return true;
			}
			return false;
		}
		/**
		 * 納品書明細連番の割り当てを行う
		 * @param dtlL
		 * @param hdrR
		 */
		protected void setDtlSeq(MCList<PurcPrnt_Upd01_HdrR>hdrL, MCList<PurcPrnt_Upd01_DtlR>dtlL) {
			MCIndexKey idxKey = dtlL.createIndex(PurcPrnt_Upd01_DtlR.$hdr_peg_no);
			for (PurcPrnt_Upd01_HdrR hdrR:  hdrL) {
				MCList<PurcPrnt_Upd01_DtlR> wkDtlL = dtlL.subList(idxKey, hdrR.hdr_peg_no());
				for (PurcPrnt_Upd01_DtlR dtlR : wkDtlL) {
					dtlR.dlv_slip_mng_no(hdrR.dlv_slip_mng_no());
					dtlR.dlv_slip_mng_seq(hdrR.dlv_slip_mng_seq());
					MCList<MST_PURC_DLV_SLIP_D_R> oldDlvSlipDL = getCachePurcDLvSlipD(dtlR.dlv_slip_d_no());
					// 過去に納品書データを作成している場合
					if (!isNull(oldDlvSlipDL) && !oldDlvSlipDL.isEmpty()) {
						// 登録済の納品書を入荷予定の納品書管理ＮＯ・連番で取得できるか
						MCIndexKey oldDlvSlipDKey = oldDlvSlipDL.createIndex(MST_PURC_DLV_SLIP_D_R.$dlv_slip_mng_d_no, MST_PURC_DLV_SLIP_D_R.$dlv_slip_mng_d_seq);
						MST_PURC_DLV_SLIP_D_R oldDlvSlipDR = oldDlvSlipDL.getFirst(oldDlvSlipDKey, dtlR.dlv_slip_mng_d_no(), dtlR.dlv_slip_mng_d_seq());
						if (!isNull(oldDlvSlipDR) && !oldDlvSlipDR.isEmpty()) {
							// 登録済の納品書が存在し、処理内で未割り当ての場合は使用可能
							if (!isExistsAssignDtl(oldDlvSlipDR.dlv_slip_d_no(), oldDlvSlipDR.dlv_slip_d_seq()) && isAllocDtl(hdrR, dtlR, oldDlvSlipDR)) {
								dtlR.dlv_slip_d_seq(oldDlvSlipDR.dlv_slip_d_seq());
								dtlR.dlv_slip_mng_d_no(oldDlvSlipDR.dlv_slip_mng_d_no());
								dtlR.dlv_slip_mng_d_seq(oldDlvSlipDR.dlv_slip_mng_d_seq().add(2));
								dtlR.purc_ddlv_dlv_slip_no(oldDlvSlipDR.purc_ddlv_dlv_slip_no());
								dtlR.purc_ddlv_dlv_slip_seq(oldDlvSlipDR.purc_ddlv_dlv_slip_seq());
								dtlR.purc_ddlv_dlv_slip_d_no(oldDlvSlipDR.purc_ddlv_dlv_slip_d_no());
								_assignDtlL.add(dtlR);
								continue;
							}
						}
					}
					// 入荷予定の納品書明細管理ＮＯ・連番から割り当て可能なデータを特定できない場合、処理内で未使用の納品書連番をセットする
					setNoAssignDtlSeq(MCNumber.ONE, dtlR, oldDlvSlipDL, hdrR);
					_assignDtlL.add(dtlR);
				}
			}
	
		}
		/**
		 * 処理内で未使用の納品書明細連番を登録対象のデータにセットする。
		 * 処理内で使用中、もしくは割り当て不可能な納品書明細ＮＯ・連番の場合は処理を割当対象の連番を加算して処理を再帰呼び出しする。
		 * @param seq 割当対象の連番
		 * @param dtlR 登録対象の納品書明細
		 * @param oldDlvSlipDL 変更前の納品書明細
		 */
		protected void setNoAssignDtlSeq(MCNumber seq, PurcPrnt_Upd01_DtlR dtlR, MCList<MST_PURC_DLV_SLIP_D_R> oldDlvSlipDL, PurcPrnt_Upd01_HdrR hdrR) {
			oldDlvSlipDL.sort(SortType.DESC, MST_PURC_DLV_SLIP_D_R.$dlv_slip_mng_d_seq);
			if (isExistsAssignDtl(dtlR.dlv_slip_d_no(), seq)) {
				seq = seq.add(1);
				setNoAssignDtlSeq(seq, dtlR, oldDlvSlipDL, hdrR);
			}
			else {
				MST_PURC_DLV_SLIP_D_R oldDlvSlipDR = null;
				if (!isNull(oldDlvSlipDL) && !oldDlvSlipDL.isEmpty()) {
					MCIndexKey oldDlvSlipDKey = oldDlvSlipDL.createIndex(MST_PURC_DLV_SLIP_D_R.$dlv_slip_d_no, MST_PURC_DLV_SLIP_D_R.$dlv_slip_d_seq);
					oldDlvSlipDR = oldDlvSlipDL.getFirst(oldDlvSlipDKey, dtlR.dlv_slip_d_no(), seq);
				}
				if (isNull(oldDlvSlipDR)) {
					dtlR.dlv_slip_d_seq(seq);
					dtlR.dlv_slip_mng_d_no(null);
					dtlR.dlv_slip_mng_d_seq(1);
				}
				else if (isAllocDtl(hdrR, dtlR, oldDlvSlipDR)) {
					dtlR.dlv_slip_d_seq(seq);
					dtlR.dlv_slip_mng_d_no(oldDlvSlipDR.dlv_slip_mng_d_no());
					dtlR.purc_ddlv_dlv_slip_no(oldDlvSlipDR.purc_ddlv_dlv_slip_no());
					dtlR.purc_ddlv_dlv_slip_seq(oldDlvSlipDR.purc_ddlv_dlv_slip_seq());
					dtlR.purc_ddlv_dlv_slip_d_no(oldDlvSlipDR.purc_ddlv_dlv_slip_d_no());
					 MST_PURC_DLV_SLIP_R oldDlvSlipR = getCachePurcDlvSlip(oldDlvSlipDR.dlv_slip_mng_no(), oldDlvSlipDR.dlv_slip_mng_seq());
					if (!isNull(oldDlvSlipR) && MAC_SLIP_STS_TYP.isCAN(oldDlvSlipR.slip_sts_typ())) {
						dtlR.dlv_slip_mng_d_seq(oldDlvSlipDR.dlv_slip_mng_d_seq().add(1));
					}
					else {
						dtlR.dlv_slip_mng_d_seq(oldDlvSlipDR.dlv_slip_mng_d_seq().add(2));
					}
				}
				else {
					seq = seq.add(1);
					setNoAssignDtlSeq(seq, dtlR, oldDlvSlipDL, hdrR);
				}
			}
		}

		/**
		 * 納品書明細ＮＯ、連番を新規データに割り当てできるか
		 * @param hdrR 登録対象の納品書ヘッダ
		 * @param dtlR 登録対象の納品書明細
		 * @param oldDlvSlipDR 変更前の納品書明細
		 * true:変更前の納品書明細ＮＯ・連番を新規データに割り当て可能<br />
		 * false:変更前の納品書明細ＮＯ・連番を新規データに割り当て不可
		 */
		protected boolean isAllocDtl(PurcPrnt_Upd01_HdrR hdrR, PurcPrnt_Upd01_DtlR dtlR, MST_PURC_DLV_SLIP_D_R oldDlvSlipDR) {
			 MST_PURC_DLV_SLIP_R oldDlvSlipR = getCachePurcDlvSlip(oldDlvSlipDR.dlv_slip_mng_no(), oldDlvSlipDR.dlv_slip_mng_seq());
			// ヘッダが取得できない場合は使用不可
			 if (isNull(oldDlvSlipR)) {
				return false;
			}
			 // 入荷予定が完了している場合は使用不可
			if (isCmplArrByDtl(oldDlvSlipDR)) {
				return false;
			}
			 // 変更前のヘッダが取消済であれば、新規データに割り当て可能
			if (!isNull(oldDlvSlipR) && MAC_SLIP_STS_TYP.isCAN(oldDlvSlipR.slip_sts_typ())) {
				return true;
			}
			// 変更前の納品書ＮＯ・連番が最新ＲＥＶで取消済ではない場合
			else {
				// 納期回答受領をもとに作成する場合、以下のすべての条件に合致すれば割り当て可能。
				// ・納入指示ＧＮＯが一致する
				// ・変更前の納品書ヘッダの納期回答受領ＧＮＯがNULL、もしくは変更前後で納期回答受領ＧＮＯが一致する
				if (MSC_PURC_DLV_SLIP_SRC_TYP.isPRMS_RCPT(hdrR.purc_dlv_slip_src_typ())) {
					if (isSame(oldDlvSlipR.dlv_inst_grp_no(), hdrR.dlv_inst_grp_no()) && (isNull(oldDlvSlipR.prms_rcpt_grp_no()) || isSame(hdrR.prms_rcpt_grp_no(), oldDlvSlipR.prms_rcpt_grp_no()))) {
						return true;
					}
					else {
						// 変更前後の納期回答受領ＧＮＯが一致しない場合、変更前の納期回答受領ＧＮＯに紐づくデータが削除済なら使用可能。
						MCList<MST_PRMS_RCPT_R> oldPrmsRcptL = getCachePrmsRcpt(oldDlvSlipR.prms_rcpt_grp_no());
						if (isNull(oldPrmsRcptL) || oldPrmsRcptL.isEmpty()) {
							return true;
						}
					}
				}
				// 納入指示をもとに作成する場合、以下のすべての条件に合致すれば割り当て可能
				// ・納期回答受領ＧＮＯが未設定
				// ・変更前の納品書ヘッダの納入指示ＧＮＯがNULL、もしくは変更前後で納入指示ＧＮＯが一致する、もしくは変更前後で納入指示ＧＮＯが一致しないが処理内で削除対象になっている
				else if (MSC_PURC_DLV_SLIP_SRC_TYP.isDLV_INST(hdrR.purc_dlv_slip_src_typ())) {
					if (isNull(oldDlvSlipR.prms_rcpt_grp_no()) && (isNull(oldDlvSlipR.dlv_inst_grp_no()) || isSame(oldDlvSlipR.dlv_inst_grp_no(), hdrR.dlv_inst_grp_no()))) {
						return true;
					}
					else {
						// 変更前後の納入指示ＧＮＯが一致しない場合、変更前の納入指示ＧＮＯに紐づくデータが削除済なら使用可能。
						MCList<MST_DLV_INST_R> oldDlvInstL = getCacheDlvInst(oldDlvSlipR.dlv_inst_grp_no());
						if (isNull(oldDlvInstL) || oldDlvInstL.isEmpty()) {
							return true;
						}
					}
				}
				// それ以外の場合、納入指示・納期回答受領を行っていない場合は割り当て可能
				else {
					if (isNull(oldDlvSlipR.prms_rcpt_grp_no()) && isNull(oldDlvSlipR.dlv_inst_grp_no())) {
						return true;
					}
				}
			}
			return false;
		}
		/**
		 * 全数入荷済か
		 * @param oldDlvSlipDR
		 * @return true 全数入荷済 false 未入荷/一部入荷
		 */
		protected boolean isCmplArrByDtl(MST_PURC_DLV_SLIP_D_R oldDlvSlipDR) {
			 MCList<MST_ARR_SCHD_R> arrSchdL = getCacheArrSchdByDlvSlipD(oldDlvSlipDR.dlv_slip_mng_d_no(), oldDlvSlipDR.dlv_slip_mng_d_seq());
			 if (!isNull(arrSchdL) && !arrSchdL.isEmpty()) {
				 for (MST_ARR_SCHD_R r : arrSchdL) {
					 if (r.cmpl_flg() && !r.arr_skip_flg()) {
						 return true;
					 }
				 }
			 }
			 return false;
		}
		/**
		 * 納品書明細ＮＯ、連番が処理内で使用されているか
		 * @param dlvSlipDNo 納品書明細ＮＯ
		 * @param dlvSlipDSeq 納品書連番
		 * @return 
		 * true: 納品書明細ＮＯ・連番が処理内で使用されている<br />
		 * false:納品書明細ＮＯ・連番が処理内で使用されていない
		 */
		protected boolean isExistsAssignDtl(String dlvSlipDNo,  MCNumber dlvSlipDSeq) {
			if (isSame(_assignDtlL.size(), 0)) {
				return false;
			}
			MCIndexKey idxAssignDtlKey = _assignDtlL.createIndex(PurcPrnt_Upd01_DtlR.$dlv_slip_d_no, PurcPrnt_Upd01_DtlR.$dlv_slip_d_seq);
			PurcPrnt_Upd01_DtlR assignDtlR = _assignDtlL.getFirst(idxAssignDtlKey, dlvSlipDNo, dlvSlipDSeq);
			// 
			if (isNull(assignDtlR) || assignDtlR.isEmpty()) {
				return false;
			}
			return true;
		}
		/**
		 * 入荷予定が分割されている場合に、明細の金額を計算する
		 * @param hdrL 納品伝票ヘッダ
		 * @param dtlL 納品伝票明細
		 */
		protected void calcAmt(MCList<PurcPrnt_Upd01_HdrR>hdrL, MCList<PurcPrnt_Upd01_DtlR> dtlL) {
			MCIndexKey hdrGetKey = hdrL.createIndex(PurcPrnt_Upd01_HdrR.$hdr_peg_no);
			dtlL.addNumberColumn("peg_no");
			setPegNo(dtlL);
			int hdrPegNo = 0;
			// ユーティリティ実行用の引数電文
			MCList<ConvQtyAmtUtil_Calc01_HdrR> hdrParmLst = MCList.create(ConvQtyAmtUtil_Calc01_HdrR.class);
			MCList<ConvQtyAmtUtil_Calc01_Dtl1R> dtl1ParmLst = MCList.create(ConvQtyAmtUtil_Calc01_Dtl1R.class);
			
			// 明細下り電文を発注明細NO単位でグルーピングして、ユーティティの引数(ヘッダ)にする
			for (MCList<PurcPrnt_Upd01_DtlR> grpL : dtlL.groupList(PurcPrnt_Upd01_DtlR.$po_d_no, PurcPrnt_Upd01_DtlR.$pri_prnt_flg)) {
				PurcPrnt_Upd01_DtlR tmpR = grpL.get(0);
				PurcPrnt_Upd01_HdrR tmpHdrR = hdrL.getFirst(hdrGetKey, tmpR.hdr_peg_no());
				MST_PO_D_R poDR = getCachePoD(tmpR.po_d_no());
				MAM_CUR_R curR = getCacheCur(tmpHdrR.trd_cur_cd());
				MAM_BP_R bpR = getCacheBp(tmpHdrR.bp_cd());
				MAM_TAX_R taxR = getCacheTax(tmpR.tax_cd());
				MAVM_ITM_UNIT_R poItmUnitR = getCacheItmUnit(tmpR.itm_cd(), tmpR.itm_sub1(), tmpR.itm_sub2(), tmpR.itm_sub3(), poDR.trd_unit_cd());
				MAVM_ITM_UNIT_R baseItmUnitR =  getCacheItmUnit(tmpR.itm_cd(), tmpR.itm_sub1(), tmpR.itm_sub2(), tmpR.itm_sub3(), poDR.base_unit_cd());
				
				if (isSame(grpL.size(), 1) && isSame(tmpR.base_unit_qty(), poDR.base_unit_qty())) {
					// 発注明細に対する入荷予定が分割されていない場合は按分しない。
					continue;
				}
				if (tmpR.prov_ddlv_flg()) {
					// 支給直送の場合は個別に計算しているので処理対象外
					continue;
				}
				if (!tmpR.pri_prnt_flg()) {
					// 価格印字対象外の場合は計算しない
					continue;
				}
				if (tmpR.dlv_slip_invalid_flg()) {
					// 納品書出力対象外の場合は計算しない
					continue;
				}
				MCNumber trdCurAmtDecPlace = curR.amt_dec_place();
				String purcAmtRndTyp = bpR.purc_amt_rnd_typ();
				String purcTaxRndTyp = bpR.purc_tax_rnd_typ();
				
				ConvQtyAmtUtil_Calc01_HdrR hdrParmRow = ConvQtyAmtUtil_Calc01_HdrR.create();
				hdrParmRow.peg_no(hdrPegNo++);
				hdrParmRow.trd_unit_cd(poDR.trd_unit_cd());
				hdrParmRow.trd_unit_qty(poDR.trd_unit_qty());
				hdrParmRow.trd_cur_upri(tmpR.trd_cur_upri());
				hdrParmRow.trd_cur_dscnt_amt(tmpR.trd_cur_dscnt_amt());
				MCRow rslt = getAmtAndTax(tmpR.trd_cur_upri(), poDR.trd_unit_qty(), taxR.tax_rate(), taxR.inc_tax_flg(), 
						trdCurAmtDecPlace, purcAmtRndTyp, purcTaxRndTyp, tmpR.trd_cur_dscnt_amt());
				hdrParmRow.trd_cur_inc_tax_amt(rslt.getNumberNE("inc_tax_amt"));
				hdrParmRow.base_unit_dec_place(baseItmUnitR.dec_place());
				hdrParmRow.base_unit_rnd_typ(baseItmUnitR.rnd_typ());
				hdrParmRow.trd_unit_conv_qty(poItmUnitR.conv_qty());
				hdrParmRow.trd_unit_conv_base_qty(poItmUnitR.conv_base_qty());
				
				MCNumber baseUnitQty = convToBaseUnit(
						hdrParmRow.trd_unit_qty(),
						hdrParmRow.trd_unit_conv_base_qty(),
						hdrParmRow.trd_unit_conv_qty(),
						hdrParmRow.base_unit_dec_place(),
						hdrParmRow.base_unit_rnd_typ());
				
				hdrParmRow.schd_base_unit_qty(baseUnitQty);

				hdrParmRow.trd_cur_cd(tmpHdrR.trd_cur_cd());
				hdrParmRow.amt_dec_place(trdCurAmtDecPlace);
				hdrParmRow.upri_dec_place(curR.upri_dec_place());
				hdrParmRow.amt_rnd_typ(purcAmtRndTyp);
				hdrParmRow.tax_rnd_typ(purcTaxRndTyp);
				hdrParmRow.tax_rate(taxR.tax_rate());
				hdrParmRow.inc_tax_flg(taxR.inc_tax_flg());
				
				hdrParmLst.add(hdrParmRow);
				
				for (PurcPrnt_Upd01_DtlR row : grpL) {
					MAVM_ITM_UNIT_R itmUnitR = getCacheItmUnit(row.itm_cd(), row.itm_sub1(), row.itm_sub2(), row.itm_sub3(), row.trd_unit_cd());
					ConvQtyAmtUtil_Calc01_Dtl1R dtl1ParmRow = ConvQtyAmtUtil_Calc01_Dtl1R.create();
					dtl1ParmRow.hdr_peg_no(hdrParmRow.peg_no());
					dtl1ParmRow.peg_no(row.getNumberNE("peg_no"));
					dtl1ParmRow.trd_unit_qty(row.trd_unit_qty());
					dtl1ParmRow.trd_unit_cd(row.trd_unit_cd());
					dtl1ParmRow.trd_unit_conv_base_qty(itmUnitR.conv_base_qty());
					dtl1ParmRow.trd_unit_conv_qty(itmUnitR.conv_qty());
					dtl1ParmLst.add(dtl1ParmRow);
				}
			}
			
			// 金額計算実行
			MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc02 ope = MSUCL_ConvQtyAmtUtil.crtConvQtyAmtUtil_Calc02();
			ope.up0().addAll(hdrParmLst);
			ope.up1().addAll(dtl1ParmLst);
			ope.exec();
			
			// 実行結果を明細行に反映する
			String[] destCols = {
					PurcPrnt_Upd01_DtlR.$trd_cur_upri
					,PurcPrnt_Upd01_DtlR.$trd_cur_dscnt_amt
					,PurcPrnt_Upd01_DtlR.$trd_cur_amt
					,PurcPrnt_Upd01_DtlR.$trd_cur_tax_amt
					};
			
			String[] srcCols = {
					ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_upri
					,ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_dscnt_amt
					,ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_amt
					,ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_tax_amt
					};
			
			MCList<PurcPrnt_Upd01_DtlR> subL = dtlL.subList(PurcPrnt_Upd01_DtlR.$prov_ddlv_flg, false);
			copyByPegNo(subL, destCols, ope.down0(), srcCols);
		}
		/**
		 * 明細の金額合計をヘッダにセットする
		 * @param hdrL 納品伝票ヘッダ
		 * @param dtlL 納品伝票明細
		 */
		protected void setTotalAmt(MCList<PurcPrnt_Upd01_HdrR>hdrL, MCList<PurcPrnt_Upd01_DtlR> dtlL) {
			MCIndexKey idxKey = dtlL.createIndex(PurcPrnt_Upd01_DtlR.$hdr_peg_no);
			for (PurcPrnt_Upd01_HdrR hdrR : hdrL) {
				MCList<PurcPrnt_Upd01_DtlR> wkDtlL = dtlL.subList(idxKey, hdrR.hdr_peg_no());
				MCNumber trdCurAmt = MCNumber.ZERO;
				MCNumber trdCurTaxAmt = MCNumber.ZERO;
				for (PurcPrnt_Upd01_DtlR wkDtlR : wkDtlL) {
					MAM_ITM_R itmR = getCacheItm(wkDtlR.itm_cd(), wkDtlR.itm_sub1(), wkDtlR.itm_sub2(), wkDtlR.itm_sub3());
					if (!isNull(wkDtlR.trd_cur_amt())) {
						trdCurAmt = trdCurAmt.add(itmR.dscnt_itm_flg() ? wkDtlR.trd_cur_amt().negate() : wkDtlR.trd_cur_amt());
					}
					if (!isNull(wkDtlR.trd_cur_tax_amt())) {
						trdCurTaxAmt = trdCurTaxAmt.add(itmR.dscnt_itm_flg() ? wkDtlR.trd_cur_tax_amt().negate() : wkDtlR.trd_cur_tax_amt());
					}
				}
				hdrR.trd_cur_amt(trdCurAmt);
				hdrR.trd_cur_tax_amt(trdCurTaxAmt);
				hdrR.trd_cur_dscnt_amt(wkDtlL.sum(PurcPrnt_Upd01_DtlR.$trd_cur_dscnt_amt));
				if (isNull(hdrR.trd_cur_amt())) {
					hdrR.trd_cur_nm(null);
				}
				if (!isNull(hdrR.trd_cur_amt())) {
					if (hdrR.trd_cur_amt().isZero()) {
						hdrR.base_cur_amt(MCNumber.ZERO);
					}
					else {
						hdrR.base_cur_amt(convToBaseCur(
								hdrR.trd_cur_amt(),
								hdrR.xrate(),
								getBaseCur().amt_dec_place(),
								getCo().xrate_rnd_typ())
						);
					}
				}
				if (!isNull(hdrR.trd_cur_tax_amt())) {
					if (hdrR.trd_cur_amt().isZero()) {
						hdrR.base_cur_tax_amt(MCNumber.ZERO);
					}
					else {
						hdrR.base_cur_tax_amt(convToBaseCur(
								hdrR.trd_cur_tax_amt(),
								hdrR.xrate(),
								getBaseCur().amt_dec_place(),
								getCo().xrate_rnd_typ())
						);
					}
				}
				if (!isNull(hdrR.trd_cur_dscnt_amt())) {
					hdrR.base_cur_dscnt_amt(convToBaseCur(
							hdrR.trd_cur_dscnt_amt(),
							hdrR.xrate(),
							getBaseCur().amt_dec_place(),
							getCo().xrate_rnd_typ())
					);
				}
			}
		}
		/**
		 * 納品書ヘッダ、明細をDB更新用のリストに格納する<br />
		 * 作成したデータを登録前のデータと比較し、納品書書き込み対象の項目に変更がある場合は登録リストに格納する。<br>
		 * 納品書書き込み対象の項目に変更がない場合は、取消データから削除し、登録対象にもしない<br />
		 * ただし、納品書書き込み対象外の項目が変わった場合は、更新対象リストに格納し、改訂番号は上げない。<br />
		 * （例：発注→納入指示などで紐づくＮＯや納品書作成元区分が変わった場合）
		 * @param hdrL 納品書ヘッダ
		 * @param dtlL 納品書明細
		 */
		protected void setDbUpdHdrDtl(MCList<PurcPrnt_Upd01_HdrR> hdrL, MCList<PurcPrnt_Upd01_DtlR>dtlL) {
			MCIndexKey idxWkDtl = dtlL.createIndex(PurcPrnt_Upd01_DtlR.$hdr_peg_no);
			MCIndexKey idxDelHdr = _delHdrL.createIndex(MST_PURC_DLV_SLIP_R.$dlv_slip_mng_no, MST_PURC_DLV_SLIP_R.$dlv_slip_mng_seq);
			MCIndexKey idxDelDtl = _delDtlL.createIndex(MST_PURC_DLV_SLIP_D_R.$dlv_slip_mng_no, MST_PURC_DLV_SLIP_D_R.$dlv_slip_mng_seq);
			MCIndexKey idxDelDtlPK = _delDtlL.createIndex(MST_PURC_DLV_SLIP_D_R.$dlv_slip_mng_d_no, MST_PURC_DLV_SLIP_D_R.$dlv_slip_mng_d_seq);
			MCIndexKey idxWkDtlInvalid = _delDtlL.createIndex(MST_PURC_DLV_SLIP_D_R.$dlv_slip_mng_no, MST_PURC_DLV_SLIP_D_R.$dlv_slip_mng_seq, MST_PURC_DLV_SLIP_D_R.$dlv_slip_invalid_flg);
			MCIndexKey idxPrtTgtHdr = _prntTgtHdrL.createIndex(PurcPrnt_Prnt01_DlvSlipR.$dlv_slip_mng_no, PurcPrnt_Prnt01_DlvSlipR.$dlv_slip_mng_seq);
			MCList<PurcPrnt_Prnt01_DlvSlipR> wkDelPrtTgtHdrL = MCList.create(PurcPrnt_Prnt01_DlvSlipR.class);
			MCList<PurcPrnt_Prnt01_DlvSlipR> wkAddPrtTgtHdrL = MCList.create(PurcPrnt_Prnt01_DlvSlipR.class);
			MCList<MST_PURC_DLV_SLIP_R> wkDelHdrL = MCList.create(MST_PURC_DLV_SLIP_R.class);
			MCList<MST_PURC_DLV_SLIP_D_R> wkDelDtlL = MCList.create(MST_PURC_DLV_SLIP_D_R.class);
			for (PurcPrnt_Upd01_HdrR hdrR : hdrL) {
				// 納品書管理ＮＯなしの場合は、登録対象と扱う
				if (isNull(hdrR.dlv_slip_mng_no())) {
					_insHdrL.add(hdrR);
					MCList<PurcPrnt_Upd01_DtlR> crtDtlL = dtlL.subList(idxWkDtl, hdrR.hdr_peg_no());
					for (PurcPrnt_Upd01_DtlR crtDtlR : crtDtlL) {
						_insDtlL.add(crtDtlR);
						MST_ARR_SCHD_R updArrSchdR = MST_ARR_SCHD_R.create();
						copy(updArrSchdR, hdrR, createMap_MST_ARR_SCHD_R_PurcPrnt_Upd01_HdrR());
						copy(updArrSchdR, crtDtlR, createMap_MST_ARR_SCHD_R_PurcPrnt_Upd01_DtlR());
						_updArrSchdL.add(updArrSchdR);
					}
				}
				else {
					MCList<PurcPrnt_Upd01_DtlR> crtDtlL = dtlL.subList(idxWkDtl, hdrR.hdr_peg_no());
					MST_PURC_DLV_SLIP_R oldHdrR = _delHdrL.getFirst(idxDelHdr, hdrR.dlv_slip_mng_no(), hdrR.old_dlv_slip_mng_seq());
					MCList<MST_PURC_DLV_SLIP_D_R> oldDtlL = _delDtlL.subList(idxDelDtl, hdrR.dlv_slip_mng_no(), hdrR.old_dlv_slip_mng_seq());
					boolean hdrUpdFlg = isUpdDlvSlipHdr(hdrR, oldHdrR);
					boolean dtlUpdFlg = false;
					boolean dtlInvalidUpdFlg = false;
					if (!hdrUpdFlg) {
						dtlUpdFlg = isUpdDlvSlipD(crtDtlL, oldDtlL, false);
						dtlInvalidUpdFlg = isUpdDlvSlipD(crtDtlL, oldDtlL, true);
					}
					// ヘッダも明細も変わっていない場合は、取消対象から除外し、登録対象にもしない
					if (!hdrUpdFlg && !dtlUpdFlg) {
						wkDelHdrL.add(oldHdrR);
						if (hdrR.dlv_slip_prnt_flg() && !isNoPrnt(hdrR, crtDtlL)) {
							PurcPrnt_Prnt01_DlvSlipR prntHdrR = PurcPrnt_Prnt01_DlvSlipR.create();
							setPrntTgtHdr(prntHdrR, oldHdrR, hdrR);
							wkAddPrtTgtHdrL.add(prntHdrR);
							PurcPrnt_Prnt01_DlvSlipR removeR = _prntTgtHdrL.getFirst(idxPrtTgtHdr, prntHdrR.dlv_slip_mng_no(), prntHdrR.dlv_slip_mng_seq().add(1));
							wkDelPrtTgtHdrL.add(removeR);
						}
						// 納品書出力対象外のデータが増減している場合、納品書出力対象のデータだけ登録・更新対象から除外する
						// 納品書出力対象外のデータは登録or更新対象に格納する
						if (dtlInvalidUpdFlg) {
							MCList<MST_PURC_DLV_SLIP_D_R> noInvalidDtlL= _delDtlL.subList(idxWkDtlInvalid, hdrR.dlv_slip_mng_no(), hdrR.old_dlv_slip_mng_seq(), false);
							wkDelDtlL.addAll(noInvalidDtlL);
							for (PurcPrnt_Upd01_DtlR crtDtlR : crtDtlL) {
								if (!crtDtlR.dlv_slip_invalid_flg()) {
									continue;
								}
								crtDtlR.dlv_slip_mng_no(hdrR.dlv_slip_mng_no());
								crtDtlR.dlv_slip_mng_seq(hdrR.old_dlv_slip_mng_seq());
								MCRow oldDtlR = _delDtlL.getFirst(idxDelDtlPK, crtDtlR.dlv_slip_mng_d_no(), crtDtlR.dlv_slip_mng_d_seq().subtract(2));
								if (!isNull(oldDtlR) && !oldDtlR.isEmpty()) {
									crtDtlR.dlv_slip_mng_d_seq(crtDtlR.dlv_slip_mng_d_seq().subtract(2));
									_updDtlL.add(crtDtlR.pdsd());
								}
								else {
									_insDtlL.add(crtDtlR);
								}
								MST_ARR_SCHD_R updArrSchdR = MST_ARR_SCHD_R.create();
								copy(updArrSchdR, hdrR, createMap_MST_ARR_SCHD_R_PurcPrnt_Upd01_HdrR());
								copy(updArrSchdR, crtDtlR, createMap_MST_ARR_SCHD_R_PurcPrnt_Upd01_DtlR());
								updArrSchdR.dlv_slip_mng_seq(hdrR.old_dlv_slip_mng_seq());
								_updArrSchdL.add(updArrSchdR);
							}
						}
						else {
							wkDelDtlL.addAll(oldDtlL);
						}
						continue;
					}
					else {
						// 変更前のヘッダが未発行の場合、洗い替えで登録する
						if (!isNull(oldHdrR) && !oldHdrR.isEmpty() && !oldHdrR.slip_prnt_flg()) {
							_befDelDlvSlipL.add(oldHdrR);
							_befDelDlvSlipDL.addAll(oldDtlL);
							wkDelHdrL.add(oldHdrR);
							wkDelDtlL.addAll(oldDtlL);
							hdrR.dlv_slip_mng_seq(hdrR.old_dlv_slip_mng_seq());
							hdrR.dlv_slip_seq(oldHdrR.dlv_slip_seq());
							hdrR.dlv_slip_rev(oldHdrR.dlv_slip_rev());
							PurcPrnt_Prnt01_DlvSlipR removeR = _prntTgtHdrL.getFirst(idxPrtTgtHdr, hdrR.dlv_slip_mng_no(), hdrR.dlv_slip_mng_seq().add(1));
							wkDelPrtTgtHdrL.add(removeR);
							for (PurcPrnt_Upd01_DtlR crtDtlR : crtDtlL) {
								MCList<MST_PURC_DLV_SLIP_D_R> wkOldDL = oldDtlL.subList(r -> isSame(r.dlv_slip_mng_d_no(), crtDtlR.dlv_slip_mng_d_no()));
								crtDtlR.dlv_slip_mng_seq(hdrR.dlv_slip_mng_seq());
								if (isNull(wkOldDL) || wkOldDL.isEmpty()) {
									continue;
								}
								MST_PURC_DLV_SLIP_D_R wkOldDR = wkOldDL.get(0);
								crtDtlR.dlv_slip_mng_d_seq(wkOldDR.dlv_slip_mng_d_seq());
								crtDtlR.dlv_slip_d_seq(wkOldDR.dlv_slip_d_seq());
							}
						}
						_insHdrL.add(hdrR);
						hdrR.hdr_upd_flg(false);
						if (hdrR.dlv_slip_prnt_flg()&& !isNoPrnt(hdrR, crtDtlL)) {
							PurcPrnt_Prnt01_DlvSlipR prntHdrR = PurcPrnt_Prnt01_DlvSlipR.create();
							setPrntTgtHdr(prntHdrR, hdrR.pds(), hdrR);
							wkAddPrtTgtHdrL.add(prntHdrR);
						}
						crtDtlL.setStringNE(PurcPrnt_Upd01_DtlR.$dlv_slip_mng_no, hdrR.dlv_slip_mng_no());
						for (PurcPrnt_Upd01_DtlR crtDtlR : crtDtlL) {
							crtDtlR.dtl_upd_flg(false);
							_insDtlL.add(crtDtlR);
							MST_ARR_SCHD_R updArrSchdR = MST_ARR_SCHD_R.create();
							copy(updArrSchdR, hdrR, createMap_MST_ARR_SCHD_R_PurcPrnt_Upd01_HdrR());
							copy(updArrSchdR, crtDtlR, createMap_MST_ARR_SCHD_R_PurcPrnt_Upd01_DtlR());
							_updArrSchdL.add(updArrSchdR);
						}
					}
				}
			}
			// 除外対象を反映
			if  (!isNull(wkDelHdrL) && !wkDelHdrL.isEmpty()) {
				_delHdrL.removeAll(wkDelHdrL);
				_removeDelHdrL.addAll(wkDelHdrL);
			}
			if (!isNull(wkDelDtlL) && !wkDelDtlL.isEmpty()) {
				_delDtlL.removeAll(wkDelDtlL);
			}
			if (!isNull(wkDelPrtTgtHdrL) && !wkDelPrtTgtHdrL.isEmpty()) {
				_prntTgtHdrL.removeAll(wkDelPrtTgtHdrL);
			}
			if (!isNull(wkAddPrtTgtHdrL) && !wkAddPrtTgtHdrL.isEmpty()) {
				_prntTgtHdrL.addAll(wkAddPrtTgtHdrL);
			}
			setUpdList(hdrL, dtlL);
		}
		/**
		 *
		 */
		protected boolean isNoPrnt(PurcPrnt_Upd01_HdrR hdrR, MCList<PurcPrnt_Upd01_DtlR> dtlL) {
			boolean noPrntFlg = true;
			for (PurcPrnt_Upd01_DtlR dtlR : dtlL) {
				if (!dtlR.dlv_slip_invalid_flg()) {
					noPrntFlg = false;
					break;
				}
			}
			return noPrntFlg;
		}
		/**
		 * 納品書書き込み対象外の項目に変更がある場合、更新用のリストに格納する
		 * @param hdrL 納品書ヘッダ
		 * @param dtlL 納品書明細
		 */
		protected void setUpdList(MCList<PurcPrnt_Upd01_HdrR> hdrL, MCList<PurcPrnt_Upd01_DtlR> dtlL) {
			MCIndexKey hdrUpdKey = hdrL.createIndex(PurcPrnt_Upd01_HdrR.$hdr_upd_flg);
			MCIndexKey dtlUpdKey = dtlL.createIndex(PurcPrnt_Upd01_DtlR.$dtl_upd_flg);
			MCList<PurcPrnt_Upd01_HdrR> updHdrL = hdrL.subList(hdrUpdKey, true);
			MCList<PurcPrnt_Upd01_DtlR> updDtlL = dtlL.subList(dtlUpdKey, true);
			if (!isNull(updHdrL) && !updHdrL.isEmpty()) {
				for (PurcPrnt_Upd01_HdrR hdrR : updHdrL) {
					// 納品書管理連番を戻す
					hdrR.dlv_slip_mng_seq(hdrR.old_dlv_slip_mng_seq());
					_updHdrL.add(hdrR.pds());
				}
			}
			if (!isNull(updDtlL) && !updDtlL.isEmpty()) {
				MCIndexKey hdrKey = hdrL.createIndex(PurcPrnt_Upd01_HdrR.$hdr_peg_no);
				for (PurcPrnt_Upd01_DtlR dtlR : updDtlL) {
					PurcPrnt_Upd01_HdrR hdrR = hdrL.getFirst(hdrKey, dtlR.hdr_peg_no());
					// 納品書管理連番を戻す
					dtlR.dlv_slip_mng_seq(hdrR.old_dlv_slip_mng_seq());
					dtlR.dlv_slip_mng_d_seq(dtlR.dlv_slip_mng_d_seq().subtract(2));
					_updDtlL.add(dtlR.pdsd());
				}
			}
		}
		/**
		 * 納品書管理ＮＯを採番する
		 * @param hdrL 納品書ヘッダ
		 * @param dtlL 納品書明細
		 */
		protected void crtHdrMngNo(MCList<PurcPrnt_Upd01_HdrR> hdrL, MCList<PurcPrnt_Upd01_DtlR> dtlL) {
			MCIndexKey idxKey = dtlL.createIndex(PurcPrnt_Upd01_DtlR.$hdr_peg_no);
			MCIndexKey updArrIndexKey = _updArrSchdL.createIndex(MST_ARR_SCHD_R.$arr_schd_no);
			MCList<PurcPrnt_Upd01_HdrR> wkhdrL = hdrL.subList(PurcPrnt_Upd01_HdrR.$dlv_slip_mng_no, null);
			if (isNull(wkhdrL) || wkhdrL.isEmpty()) {
				return;
			}
			wkhdrL.addBooleanColumn("tgt_flg", true);
			MCIndexKey wkIdxKey = wkhdrL.createIndex("tgt_flg");
			if (wkhdrL.subList(wkIdxKey, true).size() > 0) {
				doSeqCache(MSC_NUM_SYS_TYP.PURCDLVSLIPMNG, wkhdrL.subList(wkIdxKey, true).size());
			}
			for (PurcPrnt_Upd01_HdrR wkHdrR : wkhdrL) {
				if (wkHdrR.getBooleanNE("tgt_flg")) {
					wkHdrR.dlv_slip_mng_no(getStrSeq(MSC_NUM_SYS_TYP.PURCDLVSLIPMNG));
				}
				MCList<PurcPrnt_Upd01_DtlR> wkDtlL = dtlL.subList(idxKey, wkHdrR.hdr_peg_no());
				wkDtlL.setStringNE(PurcPrnt_Upd01_DtlR.$dlv_slip_mng_no, wkHdrR.dlv_slip_mng_no());
				for (PurcPrnt_Upd01_DtlR wkDtlR : wkDtlL) {
					MST_ARR_SCHD_R updArrSchdR = _updArrSchdL.getFirst(updArrIndexKey, wkDtlR.arr_schd_no());
					updArrSchdR.dlv_slip_mng_no(wkDtlR.dlv_slip_mng_no());
				}
				if (wkHdrR.dlv_slip_prnt_flg() && !isNoPrnt(wkHdrR, wkDtlL)) {
					PurcPrnt_Prnt01_DlvSlipR prntHdrR = PurcPrnt_Prnt01_DlvSlipR.create();
					setPrntTgtHdr(prntHdrR, wkHdrR.pds(), wkHdrR);
					_prntTgtHdrL.add(prntHdrR);
				}
			}
		}
		/**
		 * 納品書明細管理ＮＯを採番する
		 * @param dtlL 納品書明細
		 */
		protected void crtDtlMngNo(MCList<PurcPrnt_Upd01_DtlR> dtlL) {
			MCIndexKey updArrIndexKey = _updArrSchdL.createIndex(MST_ARR_SCHD_R.$arr_schd_no);
			MCList<PurcPrnt_Upd01_DtlR> wkDtlL = dtlL;
			if (isNull(wkDtlL) || wkDtlL.isEmpty()) {
				return;
			}
			wkDtlL.addBooleanColumn("tgt_flg", true);
			for (PurcPrnt_Upd01_DtlR wkDtlR : wkDtlL) {
				if (!isNull(wkDtlR.dlv_slip_mng_d_no())) {
					wkDtlR.setBooleanNE("tgt_flg", false);
				}
			}
			MCIndexKey wkIdxKey = wkDtlL.createIndex("tgt_flg");
			if (wkDtlL.subList(wkIdxKey, true).size() > 0) {
				doSeqCache(MSC_NUM_SYS_TYP.PURCDLVSLIPDMNG, wkDtlL.subList(wkIdxKey, true).size());
			}
			
			for (PurcPrnt_Upd01_DtlR wkDtlR : wkDtlL) {
				if (wkDtlR.getBooleanNE("tgt_flg")) {
					wkDtlR.dlv_slip_mng_d_no(getStrSeq(MSC_NUM_SYS_TYP.PURCDLVSLIPDMNG));
				}
				MST_ARR_SCHD_R updArrSchdR = _updArrSchdL.getFirst(updArrIndexKey, wkDtlR.arr_schd_no());
				updArrSchdR.dlv_slip_mng_d_no(wkDtlR.dlv_slip_mng_d_no());
			}
		}
		protected String[] _dlvSlipCols;
		protected String[] _dlvSlipUpdCols;
		protected boolean isUpdDlvSlipHdr(PurcPrnt_Upd01_HdrR crtR, MST_PURC_DLV_SLIP_R disR) {
			// 比較対象のヘッダがない場合は変更対象
			if (isNull(disR) || disR.isEmpty()) {
				return true;
			}
			if (_dlvSlipCols == null) {
				_dlvSlipCols = new String[] {
						 MST_PURC_DLV_SLIP_R.$dlv_slip_no
						, MST_PURC_DLV_SLIP_R.$dlv_slip_seq
						, MST_PURC_DLV_SLIP_R.$dpt_cd
						, MST_PURC_DLV_SLIP_R.$usr_cd
						, MST_PURC_DLV_SLIP_R.$dlv_rqst_tm
						, MST_PURC_DLV_SLIP_R.$trd_cd
						, MST_PURC_DLV_SLIP_R.$trd_ptn_typ
						, MST_PURC_DLV_SLIP_R.$trd_cur_cd
						, MST_PURC_DLV_SLIP_R.$trd_cur_nm
						, MST_PURC_DLV_SLIP_R.$trd_cur_amt
						, MST_PURC_DLV_SLIP_R.$trd_cur_tax_amt
						, MST_PURC_DLV_SLIP_R.$trd_cur_dscnt_amt
						, MST_PURC_DLV_SLIP_R.$base_cur_amt
						, MST_PURC_DLV_SLIP_R.$base_cur_tax_amt
						, MST_PURC_DLV_SLIP_R.$base_cur_dscnt_amt
						, MST_PURC_DLV_SLIP_R.$xrate
						, MST_PURC_DLV_SLIP_R.$ptax_xrate
						, MST_PURC_DLV_SLIP_R.$slip_line_max
						, MST_PURC_DLV_SLIP_R.$bp_cd
						, MST_PURC_DLV_SLIP_R.$arr_loc_nm
						, MST_PURC_DLV_SLIP_R.$arr_loc_zip_cd
						, MST_PURC_DLV_SLIP_R.$arr_loc_addr1
						, MST_PURC_DLV_SLIP_R.$arr_loc_addr2
						, MST_PURC_DLV_SLIP_R.$arr_loc_addr3
						, MST_PURC_DLV_SLIP_R.$arr_loc_addr4
						, MST_PURC_DLV_SLIP_R.$bp_cntct_dpt
						, MST_PURC_DLV_SLIP_R.$bp_cntct_psn
						, MST_PURC_DLV_SLIP_R.$arr_loc_tel
						, MST_PURC_DLV_SLIP_R.$arr_loc_fax
						, MST_PURC_DLV_SLIP_R.$sppl_id_typ
						, MST_PURC_DLV_SLIP_R.$sppl_id_cd
						, MST_PURC_DLV_SLIP_R.$sppl_id_nm
						, MST_PURC_DLV_SLIP_R.$sppl_sundry_flg
						, MST_PURC_DLV_SLIP_R.$sppl_zip_cd
						, MST_PURC_DLV_SLIP_R.$sppl_addr1
						, MST_PURC_DLV_SLIP_R.$sppl_addr2
						, MST_PURC_DLV_SLIP_R.$sppl_addr3
						, MST_PURC_DLV_SLIP_R.$sppl_addr4
						, MST_PURC_DLV_SLIP_R.$sppl_cntct_dpt
						, MST_PURC_DLV_SLIP_R.$sppl_cntct_psn
						, MST_PURC_DLV_SLIP_R.$sppl_tel
						, MST_PURC_DLV_SLIP_R.$sppl_fax
						, MST_PURC_DLV_SLIP_R.$arr_loc_cd
						, MST_PURC_DLV_SLIP_R.$wg_cd
						, MST_PURC_DLV_SLIP_R.$trd_rmrks
						, MST_PURC_DLV_SLIP_R.$sub_char1
						, MST_PURC_DLV_SLIP_R.$sub_char2
						, MST_PURC_DLV_SLIP_R.$sub_char3
				};
			}
			if (_dlvSlipUpdCols == null) {
				_dlvSlipUpdCols = new String[] {
						MST_PURC_DLV_SLIP_R.$po_no
						, MST_PURC_DLV_SLIP_R.$po_rev
						, MST_PURC_DLV_SLIP_R.$dlv_inst_grp_no
						, MST_PURC_DLV_SLIP_R.$prms_rcpt_grp_no
						, MST_PURC_DLV_SLIP_R.$purc_dlv_slip_src_typ
				};
			}
			MST_PURC_DLV_SLIP_R wkCrtR = crtR.pds().clone();
			MST_PURC_DLV_SLIP_R wkDisR = disR.clone();
			
			// 値が異なる項目がある場合、登録対象とする
			if (!isColSame(wkCrtR, wkDisR, _dlvSlipCols)) {
				return true;
			}
			if (!isColSame(wkCrtR, wkDisR, _dlvSlipUpdCols)) {
				crtR.hdr_upd_flg(true);
			}
			return false;
		}
		protected String[] _dlvSlipDCols;
		protected String[] _dlvSlipDUpdCols;
		protected boolean isUpdDlvSlipD(MCList<PurcPrnt_Upd01_DtlR> crtDL, MCList<MST_PURC_DLV_SLIP_D_R> disDL, boolean invalidFlg) {
			MCIndexKey idxCrt = crtDL.createIndex(PurcPrnt_Upd01_DtlR.$dlv_slip_invalid_flg);
			MCIndexKey idxDis = disDL.createIndex(MST_PURC_DLV_SLIP_D_R.$dlv_slip_invalid_flg);
			if (_dlvSlipDCols == null) {
				_dlvSlipDCols = new String[] {
						MST_PURC_DLV_SLIP_D_R.$dlv_slip_d_no
						, MST_PURC_DLV_SLIP_D_R.$dlv_slip_d_seq
						, MST_PURC_DLV_SLIP_D_R.$sundry_itm_flg
						, MST_PURC_DLV_SLIP_D_R.$sno1
						, MST_PURC_DLV_SLIP_D_R.$sno2
						, MST_PURC_DLV_SLIP_D_R.$sno3
						, MST_PURC_DLV_SLIP_D_R.$sno4
						, MST_PURC_DLV_SLIP_D_R.$lot_no
						, MST_PURC_DLV_SLIP_D_R.$sublot_no
						, MST_PURC_DLV_SLIP_D_R.$str_ln_cd
						, MST_PURC_DLV_SLIP_D_R.$trd_unit_qty
						, MST_PURC_DLV_SLIP_D_R.$trd_unit_po_qty
						, MST_PURC_DLV_SLIP_D_R.$trd_unit_cd
						, MST_PURC_DLV_SLIP_D_R.$base_unit_qty
						, MST_PURC_DLV_SLIP_D_R.$base_unit_po_qty
						, MST_PURC_DLV_SLIP_D_R.$base_unit_cd
						, MST_PURC_DLV_SLIP_D_R.$interim_flg
						, MST_PURC_DLV_SLIP_D_R.$pri_prnt_flg
						, MST_PURC_DLV_SLIP_D_R.$trd_cur_upri
						, MST_PURC_DLV_SLIP_D_R.$trd_cur_amt
						, MST_PURC_DLV_SLIP_D_R.$trd_cur_dscnt_amt
						, MST_PURC_DLV_SLIP_D_R.$trd_cur_tax_amt
						, MST_PURC_DLV_SLIP_D_R.$tax_cd
						, MST_PURC_DLV_SLIP_D_R.$wtax_rate
						, MST_PURC_DLV_SLIP_D_R.$wtax_amt
						, MST_PURC_DLV_SLIP_D_R.$po_d_no
						, MST_PURC_DLV_SLIP_D_R.$trd_d_rmrks
						, MST_PURC_DLV_SLIP_D_R.$prov_ddlv_flg
						, MST_PURC_DLV_SLIP_D_R.$sub_char1
						, MST_PURC_DLV_SLIP_D_R.$sub_char2
						, MST_PURC_DLV_SLIP_D_R.$sub_char3
				};
			}
			if (_dlvSlipDUpdCols == null) {
				_dlvSlipDUpdCols = new String[] {MST_PURC_DLV_SLIP_D_R.$dlv_inst_d_no
						, MST_PURC_DLV_SLIP_D_R.$prms_rcpt_d_no
						, MST_PURC_DLV_SLIP_D_R.$purc_ddlv_dlv_slip_no
						, MST_PURC_DLV_SLIP_D_R.$purc_ddlv_dlv_slip_seq
						, MST_PURC_DLV_SLIP_D_R.$purc_ddlv_dlv_slip_d_no
				};
			}
			MCList<PurcPrnt_Upd01_DtlR> crtDL2 = crtDL.subList(idxCrt, invalidFlg);
			MCList<MST_PURC_DLV_SLIP_D_R> disDL2 = disDL.subList(idxDis, invalidFlg);
			if ((isNull(crtDL2) || crtDL2.isEmpty()) && (isNull(disDL2) || disDL2.isEmpty())) {
				return false;
			}
			else if (!isNull(crtDL2) && !crtDL2.isEmpty() && !isNull(disDL2) && !disDL2.isEmpty()) {
				// 納品書出力対象or対象外を条件に比較
				if (!isSame(crtDL2.size(), disDL2.size())) {
					return true;
				}
				// 値が異なる項目がある場合、登録対象とする
				crtDL2.sort(MST_PURC_DLV_SLIP_D_R.$dlv_slip_d_no, MST_PURC_DLV_SLIP_D_R.$dlv_slip_d_seq);
				disDL2.sort(MST_PURC_DLV_SLIP_D_R.$dlv_slip_d_no, MST_PURC_DLV_SLIP_D_R.$dlv_slip_d_seq);

				MCList<PurcPrnt_Upd01_DtlR> wkCrtDL = crtDL2.clone();
				MCList<MST_PURC_DLV_SLIP_D_R> wkDisDL = disDL2.clone();
				
				for (int i=0; i<wkCrtDL.size(); i++) {
					if (!isColSame(wkCrtDL.get(i).pdsd(), wkDisDL.get(i), _dlvSlipDCols)) {
						return true;
					}
					else {
						if (!isColSame(wkCrtDL.get(i).pdsd(), wkDisDL.get(i), _dlvSlipDUpdCols)) {
							crtDL.get(i).dtl_upd_flg(true);
						}
					}
				}
				return false;
			}
			else {
				return true;
			}
		}
		/** DB更新関連*/
		/**
		 * 入荷予定の納品伝票関連項目をクリアする
		 */
		protected void clearArrSchd() {
			MCList<MST_ARR_SCHD_R> arrSchdL = MCList.create(MST_ARR_SCHD_R.class);
			getClearArrSchd(arrSchdL);
			if (isSame(arrSchdL.size(), 0)) {
				return;
			}
			MST_ARR_SCHD_R t = MST_ARR_SCHD_R.create("T");
			MCQueryApiBuilder arrSchd_bldr = MCQueryApiBuilder.create(t);
			arrSchd_bldr.setSet(t.dlv_slip_mng_no, t.dlv_slip_mng_seq, t.dlv_slip_mng_d_no, t.dlv_slip_mng_d_seq);
			arrSchdL.setStringNE(MST_ARR_SCHD_R.$dlv_slip_mng_no, null);
			arrSchdL.setNumberNE(MST_ARR_SCHD_R.$dlv_slip_mng_seq, null);
			arrSchdL.setStringNE(MST_ARR_SCHD_R.$dlv_slip_mng_d_no, null);
			arrSchdL.setNumberNE(MST_ARR_SCHD_R.$dlv_slip_mng_d_seq, null);
			dbUpdateKey("MSBDL5200_MST_ARR_SCHD_U01", arrSchdL, arrSchd_bldr);
		}
		/**
		 * 入荷予定に納品伝票関連の項目をセットする
		 */
		protected void updArrSchd() {
			if (isNull(_updArrSchdL) || _updArrSchdL.isEmpty()) {
				return;
			}
			MCList<MST_ARR_SCHD_R> bindL = _updArrSchdL.clone();
			// 入荷予定
			MST_ARR_SCHD_R t = MST_ARR_SCHD_R.create("T");
			MCQueryApiBuilder arrSchd_bldr = MCQueryApiBuilder.create(t);
			arrSchd_bldr.clearSet();
			arrSchd_bldr.addSet(t.dlv_slip_no, t.dlv_slip_mng_no, t.dlv_slip_mng_seq, t.dlv_slip_mng_d_no, t.dlv_slip_mng_d_seq);
			dbUpdateKey("MSBDL5200_MST_ARR_SCHD_U02", bindL, arrSchd_bldr);
		}
		/**
		 * 納品伝票関連項目クリア対象の入荷予定を取得する
		 * @param arrSchdL
		 */
		protected void getClearArrSchd(MCList<MST_ARR_SCHD_R>arrSchdL) {
			MCList<MST_ARR_SCHD_R> wkArrSchdL = MCList.create(MST_ARR_SCHD_R.class);
			MCList<MST_ARR_SCHD_R> bindL = MCList.create(MST_ARR_SCHD_R.class);
			for (MST_PURC_DLV_SLIP_D_R delDtlR: _delDtlL) {
				MST_ARR_SCHD_R bindR = MST_ARR_SCHD_R.create();
				bindR.dlv_slip_mng_d_no(delDtlR.dlv_slip_mng_d_no());
				bindR.dlv_slip_mng_d_seq(delDtlR.dlv_slip_mng_d_seq());
				bindL.add(bindR);
			}
			for (MST_PURC_DLV_SLIP_D_R befDelDlvSlipDR : _befDelDlvSlipDL) {
				MST_ARR_SCHD_R bindR = MST_ARR_SCHD_R.create();
				bindR.dlv_slip_mng_d_no(befDelDlvSlipDR.dlv_slip_mng_d_no());
				bindR.dlv_slip_mng_d_seq(befDelDlvSlipDR.dlv_slip_mng_d_seq());
				bindL.add(bindR);
			}
			if (isSame(bindL.size(), 0)) {
				return;
			}
			// 入荷予定
			MST_ARR_SCHD_R t = MST_ARR_SCHD_R.create("T");
			MCQueryApiBuilder arrSchd_bldr = MCQueryApiBuilder.create(t);
			arrSchd_bldr.addWhereWithAnd(t.dlv_slip_mng_d_no.eq(bind("dlv_slip_mng_d_no")));
			arrSchd_bldr.addWhereWithAnd(t.dlv_slip_mng_d_seq.eq(bind("dlv_slip_mng_d_seq")));
			arrSchd_bldr.addWhereWithAnd(value(false).eq(
					cases()
						.when(t.arr_skip_flg.eq(value(true)))
						.then(value(false))
						.otherwise(t.cmpl_flg)
				)
			);
			dbSelect("MSBDL5200_MST_ARR_SCHD_S03", wkArrSchdL, arrSchd_bldr, bindL);
			arrSchdL.addAll(wkArrSchdL);
		}

		/**
		 * 取消対象の納品書ヘッダ・明細の伝票状況区分を「無効」にする
		 */
		protected void updDisDlvSlip() {
			if (isNull(_delHdrL) || _delHdrL.isEmpty()) {
				return;
			}
			MST_PURC_DLV_SLIP_R PURCDLVSLIP = MST_PURC_DLV_SLIP_R.create("T");
			MCQueryApiBuilder hdrUpd_bldr = MCQueryApiBuilder.create(PURCDLVSLIP);
			MCList<MST_PURC_DLV_SLIP_R> dlvSlipL = _delHdrL.clone();
			hdrUpd_bldr.setSetVL(PURCDLVSLIP.slip_sts_typ, value(MAC_SLIP_STS_TYP.DIS.value()));
			dbUpdateKey("MSBDL5200_MST_PURC_DLV_SLIP_U01", dlvSlipL, hdrUpd_bldr);
		}
		/**
		 * 取消対象の納品書ヘッダ・明細をもとに伝票状況区分「取消」のデータを作成する
		 */
		protected void delDlvSlip() {
			if (isNull(_delHdrL) || _delHdrL.isEmpty()) {
				return;
			}
			MST_PURC_DLV_SLIP_R PURCDLVSLIP = MST_PURC_DLV_SLIP_R.create("T");
			MCQueryApiBuilder hdrDel_bldr = MCQueryApiBuilder.create(PURCDLVSLIP);
			MCList<MST_PURC_DLV_SLIP_R> dlvSlipL = _delHdrL.clone();
			dlvSlipL.addNumberColumn(PurcPrnt_Upd01_HdrR.$old_dlv_slip_mng_seq);
			for (MST_PURC_DLV_SLIP_R dlvSlipR : dlvSlipL) {
				MST_PO_R poR = getCachePo(dlvSlipR.po_no());
				dlvSlipR.setNumberNE(PurcPrnt_Upd01_HdrR.$old_dlv_slip_mng_seq, dlvSlipR.dlv_slip_mng_seq());
				dlvSlipR.dlv_slip_mng_seq(dlvSlipR.dlv_slip_mng_seq().add(1));
				dlvSlipR.slip_sts_typ(MAC_SLIP_STS_TYP.CAN.value());
				dlvSlipR.last_po_rev(poR.po_rev());
				// 金額の符号反転
				dlvSlipR.trd_cur_amt(negate(dlvSlipR.trd_cur_amt()));
				dlvSlipR.trd_cur_tax_amt(negate(dlvSlipR.trd_cur_tax_amt()));
				dlvSlipR.trd_cur_dscnt_amt(negate(dlvSlipR.trd_cur_dscnt_amt()));
				dlvSlipR.base_cur_amt(negate(dlvSlipR.base_cur_amt()));
				dlvSlipR.base_cur_tax_amt(negate(dlvSlipR.base_cur_tax_amt()));
				dlvSlipR.base_cur_dscnt_amt(negate(dlvSlipR.base_cur_dscnt_amt()));
				dlvSlipR.slip_prnt_flg(false);
			}
			dbInsert("MSBDL5200_MST_PURC_DLV_SLIP_I01", dlvSlipL, hdrDel_bldr);
			
			if (isNull(_delDtlL) || _delDtlL.isEmpty()) {
				return;
			}
			MST_PURC_DLV_SLIP_D_R PURCDLVSLIPD = MST_PURC_DLV_SLIP_D_R.create("T");
			MCQueryApiBuilder dtlDel_bldr = MCQueryApiBuilder.create(PURCDLVSLIPD);
			MCList<MST_PURC_DLV_SLIP_D_R> dlvSlipDL = _delDtlL.clone();
			MCIndexKey hdrIdxKey = dlvSlipL.createIndex(MST_PURC_DLV_SLIP_R.$dlv_slip_mng_no, PurcPrnt_Upd01_HdrR.$old_dlv_slip_mng_seq);
			for (MST_PURC_DLV_SLIP_D_R dlvSlipDR : dlvSlipDL) {
				MST_PURC_DLV_SLIP_R dlvSlipR = dlvSlipL.getFirst(hdrIdxKey, dlvSlipDR.dlv_slip_mng_no(), dlvSlipDR.dlv_slip_mng_seq());
				dlvSlipDR.dlv_slip_mng_seq(dlvSlipR.dlv_slip_mng_seq());
				dlvSlipDR.dlv_slip_mng_d_seq(dlvSlipDR.dlv_slip_mng_d_seq().add(1));
				// 数量の符号反転
				dlvSlipDR.trd_unit_qty(negate(dlvSlipDR.trd_unit_qty()));
				dlvSlipDR.trd_unit_po_qty(negate(dlvSlipDR.trd_unit_po_qty()));
				dlvSlipDR.base_unit_qty(negate(dlvSlipDR.base_unit_qty()));
				dlvSlipDR.base_unit_po_qty(negate(dlvSlipDR.base_unit_po_qty()));
				// 金額の符号反転
				dlvSlipDR.trd_cur_amt(negate(dlvSlipDR.trd_cur_amt()));
				dlvSlipDR.trd_cur_tax_amt(negate(dlvSlipDR.trd_cur_tax_amt()));
				dlvSlipDR.trd_cur_dscnt_amt(negate(dlvSlipDR.trd_cur_dscnt_amt()));
			}
			dbInsert("MSBDL5200_MST_PURC_DLV_SLIP_D_I01", dlvSlipDL, dtlDel_bldr);
		}
		/**
		 * 納品書ヘッダを登録する
		 */
		protected void insDlvSlip() {
			if (isNull(_insHdrL) || _insHdrL.isEmpty()) {
				return;
			}
			
			crtHdrMngNo(_insHdrL, _insDtlL);
			
			// 洗い替え対象の購買納品伝票トランがある場合は削除してから登録する
			if (!isNull(_befDelDlvSlipL) && !_befDelDlvSlipL.isEmpty()) {
				MST_PURC_DLV_SLIP_R dbc = MST_PURC_DLV_SLIP_R.create();
				dbDeleteKey("MSBDL5200_MST_PURC_DLV_SLIP_D01", _befDelDlvSlipL, dbc);
			}
			
			MST_PURC_DLV_SLIP_R PURCDLVSLIP = MST_PURC_DLV_SLIP_R.create("T");
			MCQueryApiBuilder hdrIns_bldr = MCQueryApiBuilder.create(PURCDLVSLIP);
			_insHdrL.setStringNE(MST_PURC_DLV_SLIP_R.$slip_sts_typ, MAC_SLIP_STS_TYP.CRT.value());
			_insHdrL.setBooleanNE(MST_PURC_DLV_SLIP_R.$slip_prnt_flg, false);
			dbInsert("MSBDL5200_MST_PURC_DLV_SLIP_I02", _insHdrL.innerRowList(PurcPrnt_Upd01_HdrR.$pds), hdrIns_bldr);
		}
		/**
		 * 納品書明細を登録する
		 */
		protected void insDlvSlipD() {
			if (isNull(_insDtlL) || _insDtlL.isEmpty()) {
				return;
			}
			crtDtlMngNo(_insDtlL);
			// 洗い替え対象の購買納品伝票トランがある場合は削除してから登録する
			if (!isNull(_befDelDlvSlipDL) && !_befDelDlvSlipDL.isEmpty()) {
				MST_PURC_DLV_SLIP_D_R dbc = MST_PURC_DLV_SLIP_D_R.create();
				dbDeleteKey("MSBDL5200_MST_PURC_DLV_SLIP_D_D01", _befDelDlvSlipDL, dbc);
			}
			MST_PURC_DLV_SLIP_D_R PURCDLVSLIPD = MST_PURC_DLV_SLIP_D_R.create("T");
			MCQueryApiBuilder dtlIns_bldr = MCQueryApiBuilder.create(PURCDLVSLIPD);
			dbInsert("MSBDL5200_MST_PURC_DLV_SLIP_D_I02", _insDtlL.innerRowList(PurcPrnt_Upd01_DtlR.$pdsd), dtlIns_bldr);
		}
		/**
		 * 納品書ヘッダを更新する<br>
		 */
		protected void updDlvSlip() {
			if (isNull(_updHdrL) || _updHdrL.isEmpty()) {
				return;
			}
			MST_PURC_DLV_SLIP_R t = MST_PURC_DLV_SLIP_R.create("T");
			MCQueryApiBuilder hdrUpd_bldr = MCQueryApiBuilder.create(t);
			hdrUpd_bldr.removeSet(
					t.dlv_slip_mng_no
					,t.purc_dlv_slip_src_typ
					,t.dlv_slip_mng_seq
					,t.dlv_slip_no
					,t.dlv_slip_rev
					,t.dlv_slip_seq
					,t.po_rev
					,t.slip_sts_typ
					,t.slip_prnt_flg
			);
			MCList<MST_PURC_DLV_SLIP_R> dlvSlipL = _updHdrL.clone();
			dbUpdateKey("MSBDL5200_MST_PURC_DLV_SLIP_U02", dlvSlipL, hdrUpd_bldr);
		}
		/**
		 * 納品書明細を更新する<br>
		 */
		protected void updDlvSlipD() {
			if (isNull(_updDtlL) || _updDtlL.isEmpty()) {
				return;
			}
			MST_PURC_DLV_SLIP_D_R t = MST_PURC_DLV_SLIP_D_R.create("T");
			MCQueryApiBuilder dtlUpd_bldr = MCQueryApiBuilder.create(t);
			dtlUpd_bldr.removeSet(
					t.dlv_slip_mng_no
					,t.dlv_slip_mng_seq
					,t.dlv_slip_d_no
					,t.dlv_slip_d_seq
					,t.dlv_slip_mng_d_no
					,t.dlv_slip_mng_d_seq
					,t.purc_ddlv_dlv_slip_no
					,t.purc_ddlv_dlv_slip_seq
					,t.purc_ddlv_dlv_slip_d_no
			);
			MCList<MST_PURC_DLV_SLIP_D_R> dlvSlipDL = _updDtlL.clone();
			dbUpdateKey("MSBDL5200_MST_PURC_DLV_SLIP_D_U02", dlvSlipDL, dtlUpd_bldr);
		}
		/** テーブルロック関連*/
		/**
		 * 購買納品伝票ヘッダをロックする
		 */
		protected void lockPurcDlvInst() {
			_lockDlvSlipL = MCList.create(MST_PURC_DLV_SLIP_R.class);
			MST_PURC_DLV_SLIP_R DLVSLIP = MST_PURC_DLV_SLIP_R.create("DLVSLIP");
			MSW_PO_KEY_R WK = MSW_PO_KEY_R.create("WK");
			
			MCQueryApiBuilder lockDlvSlipL_bldr = MCQueryApiBuilder.create(DLVSLIP);
			lockDlvSlipL_bldr.addInnerJoin(WK, DLVSLIP.po_no.eq(WK.po_no));
			dbSelectForUpdate("MSBDL5200_MST_PURC_DLV_SLIP_S05", _lockDlvSlipL, lockDlvSlipL_bldr);
		}
		/**
		 * 購買納品伝票明細をロックする
		 */
		protected void lockPurcDlvInstD() {
			_lockDlvSlipDL = MCList.create(MST_PURC_DLV_SLIP_D_R.class);
			MST_PURC_DLV_SLIP_D_R DLVSLIPD = MST_PURC_DLV_SLIP_D_R.create("DLVSLIPD");
			MCQueryApiBuilder lockDlvSlipD_bldr = MCQueryApiBuilder.create(DLVSLIPD);
			
			lockDlvSlipD_bldr.setWhere(DLVSLIPD.dlv_slip_mng_no.eq(bind(MST_PURC_DLV_SLIP_D_R.$dlv_slip_mng_no)));
			lockDlvSlipD_bldr.addWhereWithAnd(DLVSLIPD.dlv_slip_mng_seq.eq(bind(MST_PURC_DLV_SLIP_D_R.$dlv_slip_mng_seq)));
			dbSelectForUpdate("MSBDL5200_MST_PURC_DLV_SLIP_D_S06", _lockDlvSlipDL, lockDlvSlipD_bldr, _lockDlvSlipL);
		}
		/**
		 * 入荷予定をロックする
		 */
		protected void lockArrSchd() {
			_lockArrSchdL = MCList.create(MST_ARR_SCHD_R.class);
			MST_ARR_SCHD_R ARRSCHD = MST_ARR_SCHD_R.create("ARRSCHD");
			MST_ARR_PR_R ARRPR = MST_ARR_PR_R.create("ARRPR");
			MST_PO_D_R POD = MST_PO_D_R.create("POD");
			MST_PO_R PO = MST_PO_R.create("PO");
			MSW_PO_KEY_R WK = MSW_PO_KEY_R.create("WK");
			MCQueryApiBuilder lockArrSchd_bldr = MCQueryApiBuilder.create(ARRSCHD);
			lockArrSchd_bldr.addInnerJoin(ARRPR, ARRPR.arr_pr_no.eq(ARRSCHD.arr_pr_no));
			lockArrSchd_bldr.addInnerJoin(POD, POD.po_d_no.eq(ARRPR.po_d_no));
			lockArrSchd_bldr.addInnerJoin(PO, PO.po_no.eq(POD.po_no));
			lockArrSchd_bldr.addInnerJoin(WK, WK.po_no.eq(PO.po_no));

			dbSelectForUpdate("MSBDL5200_MST_ARR_SCHD_S01", _lockArrSchdL, lockArrSchd_bldr);
		}
		
		protected Map_PurcPrnt_Upd01_HdrR_MST_PO_R<PurcPrnt_Upd01_HdrR,MST_PO_R> createMap_PurcPrnt_Upd01_HdrR_MST_PO_R() {
			return new Map_PurcPrnt_Upd01_HdrR_MST_PO_R<PurcPrnt_Upd01_HdrR, MST_PO_R>();
		}

		public class Map_PurcPrnt_Upd01_HdrR_MST_PO_R<D extends PurcPrnt_Upd01_HdrR, S extends MST_PO_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$po_no, MST_PO_R.$po_no);
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$po_rev, MST_PO_R.$po_rev);
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$last_po_rev, MST_PO_R.$po_rev);
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$trd_cd, MST_PO_R.$trd_cd);
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$trd_cur_cd, MST_PO_R.$trd_cur_cd);
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$xrate, MST_PO_R.$xrate);
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$ptax_xrate, MST_PO_R.$ptax_xrate);
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$trd_ptn_typ, MST_PO_R.$trd_ptn_typ);
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$bp_cd, MST_PO_R.$sppl_cd);
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$sppl_zip_cd, MST_PO_R.$sppl_zip_cd);
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$sppl_addr1, MST_PO_R.$sppl_addr1);
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$sppl_addr2, MST_PO_R.$sppl_addr2);
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$sppl_addr3, MST_PO_R.$sppl_addr3);
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$sppl_addr4, MST_PO_R.$sppl_addr4);
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$dpt_cd, MST_PO_R.$purc_dpt_cd);
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$usr_cd, MST_PO_R.$purc_usr_cd);
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$sppl_cntct_dpt, MST_PO_R.$sppl_cntct_dpt);
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$sppl_cntct_psn, MST_PO_R.$sppl_cntct_psn);
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$sppl_tel, MST_PO_R.$sppl_tel);
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$sppl_fax, MST_PO_R.$sppl_fax);
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$wg_cd, MST_PO_R.$wg_cd);
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$trd_rmrks, MST_PO_R.$dlv_slip_rmrks);
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$sub_char1, MST_PO_R.$sub_char1);
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$sub_char2, MST_PO_R.$sub_char2);
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$sub_char3, MST_PO_R.$sub_char3);
			}
		}
		/** キャッシュ取得*/
		/**
		 * 発注ヘッダを検索し、キャッシュに格納する
		 * @param hdrL 発注NOが格納されているリスト
		 */
		protected void initCachePo() {
			_cachePo = MCList.create(MST_PO_R.class);
			MST_PO_R PO = MST_PO_R.create("PO");
			MSW_PO_KEY_R WK = MSW_PO_KEY_R.create("WK");

			MCQueryApiBuilder cachePo_bldr = MCQueryApiBuilder.create(PO);
			
			cachePo_bldr.addInnerJoin(WK, PO.po_no.eq(WK.po_no));
			dbSelect("MSBDL5200_MST_PO_S01", _cachePo, cachePo_bldr);
			_cachePoIndex = _cachePo.createIndex(MST_PO_R.$po_no);
		}
		
		/**
		 * 発注ヘッダキャッシュを取得する
		 * @param poNo 発注NO
		 * @return 発注ヘッダキャッシュ
		 */
		protected MST_PO_R getCachePo(String poNo) {
			return _cachePo.getFirst(_cachePoIndex, poNo);
		}
		/**
		 * 発注明細を検索し、キャッシュに格納する
		 * @param hdrL 発注NOが格納されているリスト
		 */
		protected void initCachePoD() {
			_cachePoD = MCList.create(MST_PO_D_R.class);
			MST_PO_D_R POD = MST_PO_D_R.create("POD");
			MST_PO_R PO = MST_PO_R.create("PO");
			MSW_PO_KEY_R WK = MSW_PO_KEY_R.create("WK");
			MCQueryApiBuilder cachePoD_bldr = MCQueryApiBuilder.create(POD);
			
			cachePoD_bldr.addInnerJoin(WK, WK.po_no.eq(POD.po_no));
			cachePoD_bldr.addInnerJoin(PO, PO.po_no.eq(POD.po_no)
					.and(bracket(MAC_APRV_STS_TYP$IS_ACPT(PO.aprv_sts_typ).eq(value(true)).or(PO.aprv_flg.eq(value(false)))))
					.and(PO.can_flg.eq(value(false))));
			dbSelect("MSBDL5200_MST_PO_D_S01", _cachePoD, cachePoD_bldr);
			_cachePoDIndex = _cachePoD.createIndex(MST_PO_D_R.$po_d_no);
		}
		/**
		 * 発注明細キャッシュを取得する
		 * @param poDNo 発注明細NO
		 * @return 発注明細キャッシュ
		 */
		protected MST_PO_D_R getCachePoD(String poDNo) {
			return _cachePoD.getFirst(_cachePoDIndex, poDNo);
		}

		/**
		 * 納期回答受領を検索し、キャッシュに格納する
		 * @param 
		 */
		protected void initCachePrmsRcpt() {
			_cachePrmsRcpt = MCList.create(MST_PRMS_RCPT_R.class);
			MST_PRMS_RCPT_R PRMS = MST_PRMS_RCPT_R.create("PRMS");
			MCQueryApiBuilder prmsRcptCache_bldr = MCQueryApiBuilder.create(PRMS);
			
			prmsRcptCache_bldr.addWhereWithAnd(PRMS.po_d_no.eq(bind("po_d_no")));
			prmsRcptCache_bldr.addWhereWithAnd(PRMS.can_flg.eq(value(false)));
			dbSelect("MSBDL5200_MST_PRMS_RCPT_S01", _cachePrmsRcpt, prmsRcptCache_bldr, _cachePoD);
			_cachePrmsRcptIndex = _cachePrmsRcpt.createIndex(MST_PRMS_RCPT_R.$prms_rcpt_grp_no);
		}

		/**
		 * 納期回答受領ヘッダキャッシュを取得する
		 * @param prmsRcptGrpNo 納期回答受領ＧＮＯ
		 * @return 納期回答受領ヘッダキャッシュ
		 */
		protected MCList<MST_PRMS_RCPT_R> getCachePrmsRcpt(String prmsRcptGrpNo) {
			return _cachePrmsRcpt.subList(_cachePrmsRcptIndex, prmsRcptGrpNo);
		}
		/**
		 * 納入指示を検索し、キャッシュに格納する
		 * @param 
		 */
		protected void initCacheDlvInst() {
			_cacheDlvInst = MCList.create(MST_DLV_INST_R.class);
			MST_DLV_INST_R DLVINST = MST_DLV_INST_R.create("DLVINST");
			MCQueryApiBuilder dlvInstCache_bldr = MCQueryApiBuilder.create(DLVINST);
			
			dlvInstCache_bldr.addWhereWithAnd(DLVINST.po_d_no.eq(bind("po_d_no")));
			dlvInstCache_bldr.addWhereWithAnd(DLVINST.can_flg.eq(value(false)));
			dbSelect("MSBDL5200_MST_DLV_INST_S02", _cacheDlvInst, dlvInstCache_bldr, _cachePoD);
			_cacheDlvInstIndex = _cacheDlvInst.createIndex(MST_DLV_INST_R.$dlv_inst_grp_no);
		}
		protected MCList<MST_DLV_INST_R> getCacheDlvInst(String dlvInstGrpNo) {
			return _cacheDlvInst.subList(_cacheDlvInstIndex, dlvInstGrpNo);
		}
		/**
		 * 入荷進捗を検索し、キャッシュに格納する
		 * @param 
		 */
		protected void initCacheArrPr() {
			_cacheArrPr = MCList.create(MST_ARR_PR_R.class);
			MST_ARR_PR_R ARRPR = MST_ARR_PR_R.create("ARRPR");
			MCQueryApiBuilder arrPrCache_bldr = MCQueryApiBuilder.create(ARRPR);
			
			arrPrCache_bldr.addWhereWithAnd(ARRPR.po_d_no.eq(bind("po_d_no")));
			dbSelect("MSBDL5200_MST_ARR_PR_S05", _cacheArrPr, arrPrCache_bldr, _cachePoD);
			_cacheArrPrIndex = _cacheArrPr.createIndex(MST_ARR_PR_R.$arr_pr_no);
		}

		/**
		 * 入荷進捗キャッシュを取得する
		 * @param arrPrNo 入荷進捗NO
		 * @return 入荷進捗キャッシュ
		 */
		protected MST_ARR_PR_R getCacheArrPr(String arrPrNo) {
			return _cacheArrPr.getFirst(_cacheArrPrIndex, arrPrNo);
		}
		/**
		 * 購買納品伝票ヘッダを検索し、キャッシュに格納する
		 * @param hdrL 発注ＮＯが格納されているリスト
		 */
		protected void initCachePurcDlvSlip() {
			_cachePurcDlvSlip = MCList.create(MST_PURC_DLV_SLIP_R.class);
			MST_PURC_DLV_SLIP_R DLVSLIP = MST_PURC_DLV_SLIP_R.create("T");
			MSW_PO_KEY_R WK = MSW_PO_KEY_R.create("WK");
			MCQueryApiBuilder cachePurcDlvSlip_bldr = MCQueryApiBuilder.create(DLVSLIP);
			
			cachePurcDlvSlip_bldr.addInnerJoin(WK, DLVSLIP.po_no.eq(WK.po_no));
			cachePurcDlvSlip_bldr.addWhereWithAnd(DLVSLIP.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.DIS.value())));
			cachePurcDlvSlip_bldr.setOrderByAsc(DLVSLIP.dlv_slip_no, DLVSLIP.dlv_slip_seq);
			cachePurcDlvSlip_bldr.setOrderByDesc(DLVSLIP.dlv_slip_rev);
			dbSelect("MSBDL5200_MST_PURC_DLV_SLIP_S01", _cachePurcDlvSlip, cachePurcDlvSlip_bldr);
			_cachePurcDlvSlipIndexByDlvSlip = _cachePurcDlvSlip.createIndex(MST_PURC_DLV_SLIP_R.$dlv_slip_no);
			_cachePurcDlvSlipIndex = _cachePurcDlvSlip.createIndex(MST_PURC_DLV_SLIP_R.$dlv_slip_mng_no, MST_PURC_DLV_SLIP_R.$dlv_slip_mng_seq);
			_cachePurcDlvSlipIndexByPo = _cachePurcDlvSlip.createIndex(MST_PURC_DLV_SLIP_R.$po_no);
			_cachePurcDlvSlipIndexByDlvInstGrp = _cachePurcDlvSlip.createIndex(MST_PURC_DLV_SLIP_R.$po_no, MST_PURC_DLV_SLIP_R.$dlv_inst_grp_no);
			_cachePurcDlvSlipIndexByPrmsRcpt = _cachePurcDlvSlip.createIndex(MST_PURC_DLV_SLIP_R.$po_no, MST_PURC_DLV_SLIP_R.$prms_rcpt_grp_no);
			_cachePurcDlvSlipIndexByMngNo = _cachePurcDlvSlip.createIndex(MST_PURC_DLV_SLIP_R.$dlv_slip_mng_no);
		}

		/**
		 * 納品書管理ＮＯ、納品書管理連番に紐づく購買納品伝票明細キャッシュを取得する
		 * @param dlvSlipMngNo 納品書管理ＮＯ
		 * @param dlvSlipMngSeq 納品書管理連番
		 * @return 納品伝票ヘッダ
		 */
		protected MST_PURC_DLV_SLIP_R getCachePurcDlvSlip(String dlvSlipMngNo, MCNumber dlvSlipMngSeq) {
			return _cachePurcDlvSlip.getFirst(_cachePurcDlvSlipIndex, dlvSlipMngNo, dlvSlipMngSeq);
		}
		/**
		 * 納品書ＮＯに紐づく購買納品伝票ヘッダキャッシュを取得する
		 * @param dlvSlipNo 納品書ＮＯ
		 * @return 納品伝票ヘッダ
		 */
		protected MCList<MST_PURC_DLV_SLIP_R> getCachePurcDlvSlipByDlvSlip(String dlvSlipNo) {
			return _cachePurcDlvSlip.subList(_cachePurcDlvSlipIndexByDlvSlip, dlvSlipNo);
		}
		/**
		 * 発注ＮＯに紐づく購買納品伝票ヘッダキャッシュを取得する
		 * @param poNo 発注ＮＯ
		 * @return 納品伝票ヘッダ
		 */
		protected MCList<MST_PURC_DLV_SLIP_R> getCachePurcDlvSlipByPo(String poNo) {
			return _cachePurcDlvSlip.subList(_cachePurcDlvSlipIndexByPo, poNo);
		}
		/**
		 * 発注ＮＯ・納入指示ＧＮＯに紐づく購買納品伝票ヘッダキャッシュを取得する
		 * @param poNo 発注ＮＯ
		 * @param dlvInstGrpNo 納入指示ＧＮＯ
		 * @return 納品伝票ヘッダ
		 */
		protected MCList<MST_PURC_DLV_SLIP_R> getCachePurcDlvSlipByDlvInstGrp(String poNo,String dlvInstGrpNo) {
			return _cachePurcDlvSlip.subList(_cachePurcDlvSlipIndexByDlvInstGrp, poNo, dlvInstGrpNo);
		}
		/**
		 * 発注ＮＯ・納入指示ＧＮＯ・納期回答受領ＧＮＯに紐づく購買納品伝票ヘッダキャッシュを取得する
		 * @param poNo 発注ＮＯ
		 * @param prmsRcptGrpNo 納期回答受領ＧＮＯ
		 * @return 納品伝票ヘッダ
		 */
		protected MCList<MST_PURC_DLV_SLIP_R> getCachePurcDlvSlipByPrmsRcptGrp(String poNo, String prmsRcptGrpNo) {
			return _cachePurcDlvSlip.subList(_cachePurcDlvSlipIndexByPrmsRcpt, poNo, prmsRcptGrpNo);
		}
		/**
		 * 購買納品伝票明細を検索し、キャッシュに格納する
		 */
		protected void initCachePurcDlvSlipD() {
			_cachePurcDlvSlipD = MCList.create(MST_PURC_DLV_SLIP_D_R.class);
			_cachePurcDlvSlipD.addStringColumn(MST_PURC_DLV_SLIP_R.$dlv_slip_no);
			_cachePurcDlvSlipD.addNumberColumn(MST_PURC_DLV_SLIP_R.$dlv_slip_seq);
			MST_PURC_DLV_SLIP_D_R DLVSLIPD = MST_PURC_DLV_SLIP_D_R.create("DLVSLIPD");
			MST_PURC_DLV_SLIP_R DLVSLIP = MST_PURC_DLV_SLIP_R.create("DLVSLIP");
			MCQueryApiBuilder cachePurcDlvSlipD_bldr = MCQueryApiBuilder.create(DLVSLIPD);
			
			cachePurcDlvSlipD_bldr.addInnerJoin(DLVSLIP, DLVSLIPD.dlv_slip_mng_no.eq(DLVSLIP.dlv_slip_mng_no).and(DLVSLIPD.dlv_slip_mng_seq.eq(DLVSLIP.dlv_slip_mng_seq)));
			cachePurcDlvSlipD_bldr.addWhereWithAnd(DLVSLIP.dlv_slip_no.eq(bind("dlv_slip_no")));
			cachePurcDlvSlipD_bldr.addWhereWithAnd(DLVSLIP.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.DIS.value())));
			dbSelect("MSBDL5200_MST_PURC_DLV_SLIP_D_S02", _cachePurcDlvSlipD, cachePurcDlvSlipD_bldr, _cachePurcDlvSlip);
			_cachePurcDlvSlipDIndex = _cachePurcDlvSlipD.createIndex(MST_PURC_DLV_SLIP_D_R.$dlv_slip_d_no);
			_cachePurcDlvSlipDIndexByHdrKey = _cachePurcDlvSlipD.createIndex(MST_PURC_DLV_SLIP_D_R.$dlv_slip_mng_no, MST_PURC_DLV_SLIP_D_R.$dlv_slip_mng_seq);
		}

		/**
		 * 購買納品伝票明細キャッシュを取得する
		 * @param dlvSlipDNo 納品書明細ＮＯ
		 * @return 購買納品伝票明細
		 */
		protected MCList<MST_PURC_DLV_SLIP_D_R> getCachePurcDLvSlipD(String dlvSlipDNo) {
			return _cachePurcDlvSlipD.subList(_cachePurcDlvSlipDIndex, dlvSlipDNo);
		}
		/**
		 * 納品書管理ＮＯ・連番に紐づく購買納品伝票明細キャッシュを取得する
		 * @param dlvSlipMngNo 納品書管理ＮＯ
		 * @param dlvSlipMngSeq 納品書管理連番
		 * @return 購買納品伝票明細
		 */
		protected MCList<MST_PURC_DLV_SLIP_D_R> getCachePurcDlvSlipDByHdrKey(String dlvSlipMngNo, MCNumber dlvSlipMngSeq) {
			return _cachePurcDlvSlipD.subList(_cachePurcDlvSlipDIndexByHdrKey, dlvSlipMngNo, dlvSlipMngSeq);
		}
		/**
		 * 入荷予定を検索し、キャッシュに格納する
		 * @param hdrL 発注ＮＯが格納されているリスト
		 */
		protected void initArrSchdCache() {
			_cacheArrSchd = MCList.create(MST_ARR_SCHD_R.class);
			_cacheArrSchd.addStringColumn(MST_PO_R.$po_no);
			_cacheArrSchd.addStringColumn(MST_PURC_DLV_SLIP_R.$dlv_inst_grp_no);
			_cacheArrSchd.addStringColumn(MST_PRMS_RCPT_R.$prms_rcpt_grp_no);
			_cacheArrSchd.addBooleanColumn("prov_ddlv_flg");
			_cacheArrSchd.addBooleanColumn("purc_ddlv_flg");
			_cacheArrSchd.addStringColumn("dpt_cd");
			_cacheArrSchd.addStringColumn("usr_cd");
			MST_ARR_SCHD_R ARRSCHD = MST_ARR_SCHD_R.create("ARRSCHD");
			MST_DLV_INST_D_R DLVINSTD = MST_DLV_INST_D_R.create("DLVINSTD");
			MST_DLV_INST_R DLVINST = MST_DLV_INST_R.create("DLVINST");
			MST_PRMS_RCPT_D_R PRMSTRCPTD = MST_PRMS_RCPT_D_R.create("PRMSTRCPTD");
			MST_PRMS_RCPT_R PRMSRCPT = MST_PRMS_RCPT_R.create("PRMSRCPT");
			MST_ARR_PR_R ARRPR = MST_ARR_PR_R.create("ARRPT");
			MST_PO_D_R POD = MST_PO_D_R.create("POD");
			MST_PO_R PO = MST_PO_R.create("PO");
			MAM_LOC_R LOC = MAM_LOC_R.create("LOC");
			MAM_BP_R BP = MAM_BP_R.create("BP");
			MCQueryApiBuilder cacheArrSchd_bldr = MCQueryApiBuilder.create(ARRSCHD);
			
			cacheArrSchd_bldr.removeSelect(ARRSCHD.trd_unit_qty, ARRSCHD.base_unit_qty);
			cacheArrSchd_bldr.addSelect(DLVINST.dlv_inst_grp_no
												, PRMSRCPT.prms_rcpt_grp_no
												, POD.po_no
												, POD.po_d_no
												, nvl(PRMSTRCPTD.trd_unit_qty, nvl(DLVINSTD.trd_unit_qty, POD.trd_unit_qty)).as("trd_unit_qty")
												, nvl(PRMSTRCPTD.base_unit_qty, nvl(DLVINSTD.base_unit_qty, POD.base_unit_qty)).as("base_unit_qty")
												, cases().when(POD.dlv_cd.isNull().and(LOC.sppl_cd.isNotNull())).then(PO.purc_dpt_cd).otherwise(nullValue()).as("dpt_cd")
												, cases().when(POD.dlv_cd.isNull().and(LOC.sppl_cd.isNotNull())).then(PO.purc_usr_cd).otherwise(nullValue()).as("usr_cd")
												, cases().when(POD.dlv_cd.isNull().and(LOC.sppl_cd.isNotNull())).then(value(true)).otherwise(value(false)).as("prov_ddlv_flg")
												, cases().when(POD.dlv_cd.isNotNull()).then(value(true)).otherwise(value(false)).as("purc_ddlv_flg")
												);
			cacheArrSchd_bldr.addSelect(LOC.loc_nm);
			cacheArrSchd_bldr.addSelect(MAPA_LOC$F_GET_LOC_ADDR(ARRSCHD.arr_loc_cd, value(getToday()),value(MAC_LOC_ADDR_TYP.ZIP_CD.value()), BP.prnt_lcl_cd).as(MAM_LOC_R.$zip_cd));
			cacheArrSchd_bldr.addSelect(MAPA_LOC$F_GET_LOC_ADDR(ARRSCHD.arr_loc_cd, value(getToday()),value(MAC_LOC_ADDR_TYP.ADDR1.value()), BP.prnt_lcl_cd).as(MAM_LOC_R.$addr1));
			cacheArrSchd_bldr.addSelect(MAPA_LOC$F_GET_LOC_ADDR(ARRSCHD.arr_loc_cd, value(getToday()),value(MAC_LOC_ADDR_TYP.ADDR2.value()), BP.prnt_lcl_cd).as(MAM_LOC_R.$addr2));
			cacheArrSchd_bldr.addSelect(MAPA_LOC$F_GET_LOC_ADDR(ARRSCHD.arr_loc_cd, value(getToday()),value(MAC_LOC_ADDR_TYP.ADDR3.value()), BP.prnt_lcl_cd).as(MAM_LOC_R.$addr3));
			cacheArrSchd_bldr.addSelect(MAPA_LOC$F_GET_LOC_ADDR(ARRSCHD.arr_loc_cd, value(getToday()),value(MAC_LOC_ADDR_TYP.ADDR4.value()), BP.prnt_lcl_cd).as(MAM_LOC_R.$addr4));
			cacheArrSchd_bldr.addSelect(MAPA_LOC$F_GET_LOC_ADDR(ARRSCHD.arr_loc_cd, value(getToday()),value(MAC_LOC_ADDR_TYP.TEL.value()), BP.prnt_lcl_cd).as(MAM_LOC_R.$tel));
			cacheArrSchd_bldr.addSelect(MAPA_LOC$F_GET_LOC_ADDR(ARRSCHD.arr_loc_cd, value(getToday()),value(MAC_LOC_ADDR_TYP.FAX.value()), BP.prnt_lcl_cd).as(MAM_LOC_R.$fax));
			cacheArrSchd_bldr.addLeftOuterJoin(DLVINSTD, DLVINSTD.dlv_inst_d_no.eq(ARRSCHD.dlv_inst_d_no));
			cacheArrSchd_bldr.addLeftOuterJoin(DLVINST, DLVINST.dlv_inst_no.eq(DLVINSTD.dlv_inst_no));
			cacheArrSchd_bldr.addLeftOuterJoin(PRMSTRCPTD, PRMSTRCPTD.prms_rcpt_d_no.eq(ARRSCHD.prms_rcpt_d_no));
			cacheArrSchd_bldr.addLeftOuterJoin(PRMSRCPT, PRMSRCPT.prms_rcpt_no.eq(PRMSTRCPTD.prms_rcpt_no));
			cacheArrSchd_bldr.addLeftOuterJoin(ARRPR, ARRPR.arr_pr_no.eq(ARRSCHD.arr_pr_no));
			cacheArrSchd_bldr.addLeftOuterJoin(POD, POD.po_d_no.eq(ARRPR.po_d_no));
			cacheArrSchd_bldr.addLeftOuterJoin(PO, PO.po_no.eq(POD.po_no));
			cacheArrSchd_bldr.addLeftOuterJoin(LOC, LOC.loc_cd.eq(ARRSCHD.arr_loc_cd));
			cacheArrSchd_bldr.addLeftOuterJoin(BP, BP.bp_cd.eq(PO.sppl_cd));
			// 全数打切は除く
			cacheArrSchd_bldr.addWhereWithAnd(value(false).eq(
					cases()
						.when(ARRSCHD.abort_flg.eq(value(true)))
						.then(
								cases()
								.when(ARRSCHD.arr_qty.eq(value(0)))
								.then(value(true))
								.otherwise(value(false))
						)
						.otherwise(value(false))
					)
			);
			cacheArrSchd_bldr.addWhereWithAnd(ARRSCHD.arr_pr_no.eq(bind(MST_ARR_SCHD_R.$arr_pr_no)));
			dbSelect("MSBDL5200_MST_ARR_SCHD_S02", _cacheArrSchd, cacheArrSchd_bldr, _cacheArrPr);
			_cacheArrSchdIndex = _cacheArrSchd.createIndex(MST_ARR_SCHD_R.$arr_schd_no);
			_cacheArrSchdIndexByPo = _cacheArrSchd.createIndex(MST_PO_D_R.$po_no);
			_cacheArrSchdIndexByDlvInstGrp = _cacheArrSchd.createIndex(MST_DLV_INST_R.$dlv_inst_grp_no);
			_cacheArrSchdIndexByDlvInstD = _cacheArrSchd.createIndex(MST_ARR_SCHD_R.$dlv_inst_d_no);
			_cacheArrSchdIndexByPrmsRcptGrp = _cacheArrSchd.createIndex(MST_PRMS_RCPT_R.$prms_rcpt_grp_no);
			_cacheArrSchdIndexByPrmsRcptD = _cacheArrSchd.createIndex(MST_ARR_SCHD_R.$prms_rcpt_d_no);
			_cacheArrSchdIndexByDlvSlip = _cacheArrSchd.createIndex(MST_ARR_SCHD_R.$dlv_slip_mng_no, MST_ARR_SCHD_R.$dlv_slip_mng_seq);
			_cacheArrSchdIndexByDlvSlipD = _cacheArrSchd.createIndex(MST_ARR_SCHD_R.$dlv_slip_mng_d_no, MST_ARR_SCHD_R.$dlv_slip_mng_d_seq);
		}

		/**
		 * 入荷予定ＮＯに紐づく入荷予定キャッシュを取得する
		 * @param arrSchdNo 入荷予定ＮＯ
		 * @return 入荷予定キャッシュ
		 */
		protected MST_ARR_SCHD_R getCacheArrSchd(String arrSchdNo) {
			return _cacheArrSchd.getFirst(_cacheArrSchdIndex, arrSchdNo);
		}
		/**
		 * 発注ＮＯに紐づく入荷予定キャッシュを取得する
		 * @param poNo 発注ＮＯ
		 * @return 入荷予定キャッシュ
		 */
		protected MCList<MST_ARR_SCHD_R> getCacheArrSchdByPo(String poNo) {
			return _cacheArrSchd.subList(_cacheArrSchdIndexByPo, poNo);
		}
		/**
		 * 納入指示ＧＮＯに紐づく入荷予定キャッシュを取得する
		 * @param dlvInstGrpNo 納入指示ＧＮＯ
		 * @return 入荷予定キャッシュ
		 */
		protected MCList<MST_ARR_SCHD_R> getCacheArrSchdByDlvInst(String dlvInstGrpNo) {
			return _cacheArrSchd.subList(_cacheArrSchdIndexByDlvInstGrp, dlvInstGrpNo);
		}
		/**
		 * 納入指示明細ＮＯに紐づく入荷予定キャッシュを取得する
		 * @param dlvInstDNo 納入指示明細ＮＯ
		 * @return 入荷予定キャッシュ
		 */
		protected MST_ARR_SCHD_R getCacheArrSchdByDlvInstD(String dlvInstDNo) {
			return _cacheArrSchd.getFirst(_cacheArrSchdIndexByDlvInstD, dlvInstDNo);
		}
		/**
		 * 納期回答受領ＧＮＯに紐づく入荷予定キャッシュを取得する
		 * @param prmsRcptGrpNo 納期回答受領ＧＮＯ
		 * @return 入荷予定キャッシュ
		 */
		protected MCList<MST_ARR_SCHD_R> getCacheArrSchdByPrmsRcpt(String prmsRcptGrpNo) {
			return _cacheArrSchd.subList(_cacheArrSchdIndexByPrmsRcptGrp, prmsRcptGrpNo);
		}
		/**
		 * 納期回答受領明細ＮＯに紐づく入荷予定キャッシュを取得する
		 * @param prmsRcptDNo 納期回答受領明細ＮＯ
		 * @return 入荷予定キャッシュ
		 */
		protected MST_ARR_SCHD_R getCacheArrSchdByPrmsRcptD(String prmsRcptDNo) {
			return _cacheArrSchd.getFirst(_cacheArrSchdIndexByPrmsRcptD, prmsRcptDNo);
		}
		/**
		 * 購買納品書管理ＮＯ、連番に紐づく入荷予定キャッシュを取得する
		 * @param prmsRcptDNo 納期回答受領明細ＮＯ
		 * @return 入荷予定キャッシュ
		 */
		protected MCList<MST_ARR_SCHD_R> getCacheArrSchdByDlvSlip(String dlvSlipMngNo, MCNumber dlvSLipMngSeq) {
			return _cacheArrSchd.subList(_cacheArrSchdIndexByDlvSlip, dlvSlipMngNo, dlvSLipMngSeq);
		}
		/**
		 * 購買納品書明細管理ＮＯ、連番に紐づく入荷予定キャッシュを取得する
		 * @param prmsRcptDNo 納期回答受領明細ＮＯ
		 * @return 入荷予定キャッシュ
		 */
		protected MCList<MST_ARR_SCHD_R> getCacheArrSchdByDlvSlipD(String dlvSlipMngDNo, MCNumber dlvSLipMngDSeq) {
			return _cacheArrSchd.subList(_cacheArrSchdIndexByDlvSlipD, dlvSlipMngDNo, dlvSLipMngDSeq);
		}
		/**
		 * 支給予定を検索し、キャッシュに格納する
		 */
		protected void initCacheProvSchd() {
			_cacheProvSchd = MCList.create(MST_PROV_SCHD_R.class);
			MST_PROV_SCHD_R t = MST_PROV_SCHD_R.create("T");
			MCQueryApiBuilder cacheProvSchd_bldr = MCQueryApiBuilder.create(t);
			
			cacheProvSchd_bldr.addWhereWithAnd(t.prov_src_schd_no2.eq(bind("arr_schd_no")));
			dbSelect("MSBDL5200_MST_PROV_SCHD_S01", _cacheProvSchd, cacheProvSchd_bldr, _cacheArrSchd);
			_cacheProvSchdIndex = _cacheProvSchd.createIndex(MST_PROV_SCHD_R.$prov_src_schd_no2);
		}

		/**
		 * 支給予定キャッシュを取得する
		 * @param arrSchdNo 入荷予定ＮＯ
		 * @return 支給予定キャッシュ
		 */
		protected MST_PROV_SCHD_R getCacheProvSchd(String arrSchdNo) {
			return _cacheProvSchd.getFirst(_cacheProvSchdIndex, arrSchdNo);
		}
		
		/**
		 * 取引先マスタを検索し、キャッシュに格納する
		 */
		protected void initCacheBp() {
			MCList<MAM_BP_R> bindL = MCList.create(MAM_BP_R.class);
			for (MST_PO_R r : _cachePo) {
				MAM_BP_R bpR = MAM_BP_R.create();
				bpR.bp_cd(r.sppl_cd());
				bindL.add(bpR);
			}
			for (MST_ARR_SCHD_R r : _cacheArrSchd) {
				MAM_LOC_R locR = getCacheLoc(r.arr_loc_cd());
				if (!isNull(locR.sppl_cd())) {
					MAM_BP_R bpR = MAM_BP_R.create();
					bpR.bp_cd(locR.sppl_cd());
					bindL.add(bpR);
				}
			}
			MAM_BP_R t = MAM_BP_R.create("T");
			MCQueryApiBuilder bpL_bldr = MCQueryApiBuilder.create(t);
			_cacheBp = new FXUCL_MCDbcCache<MAM_BP_R>(bpL_bldr, bindL.groupBy(MAM_BP_R.$bp_cd), MAM_BP_R.$bp_cd);
		}
		/**
		 * 取引先マスタキャッシュを取得する
		 * @param bpCd 取引先ＣＤ
		 * @return 取引先マスタキャッシュ
		 */
		protected MAM_BP_R getCacheBp(String bpCd) {
			return _cacheBp.get(bpCd);
		}
		/**
		 * 場所マスタを検索し、キャッシュに格納する
		 */
		protected void initCacheLoc() {
			MCList<MAM_LOC_R> bindL = MCList.create(MAM_LOC_R.class);
			for (MST_ARR_SCHD_R r : _cacheArrSchd) {
				MAM_LOC_R locR = MAM_LOC_R.create();
				locR.loc_cd(r.arr_loc_cd());
				bindL.add(locR);
			}
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder locL_bldr = MCQueryApiBuilder.create(t);
			_cacheLoc = new FXUCL_MCDbcCache<MAM_LOC_R>(locL_bldr, bindL.groupBy(MAM_LOC_R.$loc_cd),MAM_LOC_R.$loc_cd);
		}
		/**
		 * 場所マスタキャッシュを取得する
		 * @param locCd 場所ＣＤ
		 * @return 場所マスタキャッシュ
		 */
		protected MAM_LOC_R getCacheLoc(String locCd) {
			return _cacheLoc.get(locCd);
		}
		/**
		 * 伝票帳票マスタを検索し、キャッシュに格納する
		 */
		protected void initCacheSlipForm() {
			MCList<MAM_SLIP_FORM_R> bindL = MCList.create(MAM_SLIP_FORM_R.class);
			for (MST_PO_R r : _cachePo) {
				if (isNull(r.dlv_slip_form_cd())) {
					continue;
				}
				MAM_SLIP_FORM_R formR = MAM_SLIP_FORM_R.create();
				formR.slip_form_cd(r.dlv_slip_form_cd());
				bindL.add(formR);
			}
			MCQueryApiBuilder slipFormL_bldr = MCQueryApiBuilder.create(MAM_SLIP_FORM_R.create("T"));
			_cacheSlipForm = new FXUCL_MCDbcCache<MAM_SLIP_FORM_R>(slipFormL_bldr, bindL.groupBy(MAM_SLIP_FORM_R.$slip_form_cd), MAM_SLIP_FORM_R.$slip_form_cd);
		}
		protected MAM_SLIP_FORM_R getCacheSlipForm(String slipFormCd) {
			return _cacheSlipForm.get(slipFormCd);
		}
		/**
		 * 税マスタを検索し、キャッシュに格納する
		 */
		protected void initCacheTax() {
			MCList<MAM_TAX_R> bindL = MCList.create(MAM_TAX_R.class);
			for (MST_PO_D_R poDR : _cachePoD) {
				MAM_TAX_R taxR = MAM_TAX_R.create();
				taxR.tax_cd(poDR.tax_cd());
				bindL.add(taxR);
			}
			for (MST_PROV_SCHD_R provSchdR : _cacheProvSchd) {
				MAM_TAX_R taxR = MAM_TAX_R.create();
				taxR.tax_cd(provSchdR.tax_cd());
				bindL.add(taxR);
			}
			MCQueryApiBuilder taxL_bldr = MCQueryApiBuilder.create(MAM_TAX_R.create("T"));
			_cacheTax = new FXUCL_MCDbcCache<MAM_TAX_R>(taxL_bldr, bindL.groupBy(MAM_TAX_R.$tax_cd), MAM_TAX_R.$tax_cd);
		}
		/**
		 * 税マスタキャッシュを取得する
		 * @param taxCd 税ＣＤ
		 * @return 伝票帳票マスタキャッシュ
		 */
		protected MAM_TAX_R getCacheTax(String taxCd) {
			return _cacheTax.get(taxCd);
		}
		/**
		 * 通貨マスタを検索し、キャッシュに格納する
		 */
		protected void initCacheCur() {
			MCList<MAM_CUR_R> bindL = MCList.create(MAM_CUR_R.class);
			for (MST_PO_R poR : _cachePo) {
				MAM_CUR_R curR = MAM_CUR_R.create();
				curR.cur_cd(poR.trd_cur_cd());
				bindL.add(curR);
			}
			for (MST_PROV_SCHD_R provSchdR : _cacheProvSchd) {
				MAM_CUR_R curR = MAM_CUR_R.create();
				curR.cur_cd(provSchdR.trd_cur_cd());
				bindL.add(curR);
			}
			MCQueryApiBuilder curL_bldr = MCQueryApiBuilder.create(MAM_CUR_R.create("T"));
			_cacheCur = new FXUCL_MCDbcCache<MAM_CUR_R>(curL_bldr, bindL.groupBy(MAM_CUR_R.$cur_cd), MAM_CUR_R.$cur_cd);
		}
		/**
		 * 通貨マスタキャッシュを取得する
		 * @param curCd 税ＣＤ
		 * @return 伝票帳票マスタキャッシュ
		 */
		protected MAM_CUR_R getCacheCur(String curCd) {
			return _cacheCur.get(curCd);
		}
		
		protected void initCacheCurOutsrcLcl() {
			MCList<MAM_CUR_LCL_R> bindL = MCList.create(MAM_CUR_LCL_R.class);
			for (MST_PROV_SCHD_R provSchdR : _cacheProvSchd) {
				MAM_CUR_LCL_R curR = MAM_CUR_LCL_R.create();
				curR.cur_cd(provSchdR.trd_cur_cd());
				bindL.add(curR);
			}
			MCQueryApiBuilder curL_bldr = MCQueryApiBuilder.create(MAM_CUR_LCL_R.create("T"));
			_cacheCurOutsrcLcl = new FXUCL_MCDbcCache<MAM_CUR_LCL_R>(curL_bldr, bindL.groupBy(MAM_CUR_LCL_R.$cur_cd, MAM_CUR_LCL_R.$lcl_cd), MAM_CUR_LCL_R.$cur_cd, MAM_CUR_LCL_R.$lcl_cd);
		}
		protected String getCacheCurOutsrcLclNm(String curCd, String lclCd) {
			return _cacheCurOutsrcLcl.get(curCd, lclCd).cur_nm();
		}
		
		protected void initCacheLocOutsrcLcl() {
			MCList<MAM_LOC_LCL_R> bindL = MCList.create(MAM_LOC_LCL_R.class);
			for (MST_ARR_SCHD_R r : _cacheArrSchd) {
				MAM_LOC_LCL_R locR = MAM_LOC_LCL_R.create();
				locR.loc_cd(r.arr_loc_cd());
				bindL.add(locR);
			}
			MAM_LOC_LCL_R t = MAM_LOC_LCL_R.create("T");
			MCQueryApiBuilder locL_bldr = MCQueryApiBuilder.create(t);
			_cacheLocOutsrcLcl = new FXUCL_MCDbcCache<MAM_LOC_LCL_R>(locL_bldr, bindL.groupBy(MAM_LOC_LCL_R.$loc_cd, MAM_LOC_LCL_R.$lcl_cd), MAM_LOC_LCL_R.$loc_cd, MAM_LOC_LCL_R.$lcl_cd);
		}
		protected MAM_LOC_LCL_R getCacheLocOutsrcLcl(String locCd, String lclCd) {
			return _cacheLocOutsrcLcl.get(locCd, lclCd);
		}
		
		protected void initCacheDptOutsrcLcl() {
			MCList<MAM_DPT_LCL_R> bindL = MCList.create(MAM_DPT_LCL_R.class);
			for (MST_PO_R poR : _cachePo) {
				MAM_DPT_LCL_R dptR = MAM_DPT_LCL_R.create();
				dptR.dpt_cd(poR.purc_dpt_cd());
				bindL.add(dptR);
			}
			MCQueryApiBuilder dptL_bldr = MCQueryApiBuilder.create(MAM_DPT_LCL_R.create("T"));
			_cacheDptOutsrcLcl = new FXUCL_MCDbcCacheStEnd<MAM_DPT_LCL_R>(dptL_bldr, bindL.groupBy(MAM_DPT_LCL_R.$dpt_cd, MAM_DPT_LCL_R.$lcl_cd), MAM_DPT_LCL_R.$dpt_cd, MAM_DPT_LCL_R.$lcl_cd);
		}
		protected MAM_DPT_LCL_R getCacheDptOutsrcLcl(String dptCd, String lclCd) {
			return _cacheDptOutsrcLcl.get(getToday(), dptCd, lclCd);
		}
		
		protected void initCacheUsrOutsrcLcl() {
			MCList<MAM_USR_LCL_R> bindL = MCList.create(MAM_USR_LCL_R.class);
			for (MST_PO_R poR : _cachePo) {
				MAM_USR_LCL_R usrR = MAM_USR_LCL_R.create();
				usrR.usr_cd(poR.purc_usr_cd());
				bindL.add(usrR);
			}
			MCQueryApiBuilder usrL_bldr = MCQueryApiBuilder.create(MAM_USR_LCL_R.create("T"));
			_cacheUsrOutsrcLcl = new FXUCL_MCDbcCache<MAM_USR_LCL_R>(usrL_bldr, bindL.groupBy(MAM_USR_LCL_R.$usr_cd, MAM_USR_LCL_R.$lcl_cd), MAM_USR_LCL_R.$usr_cd, MAM_USR_LCL_R.$lcl_cd);
		}
		protected String getCacheUsrOutsrsLclNm(String usrCd, String lclCd) {
			return _cacheUsrOutsrcLcl.get(usrCd, lclCd).usr_nm();
		}

		/**
		 * 品目単位マスタを検索し、キャッシュに格納する
		 */
		protected void initCacheItmUnit() {
			MCList<MAVM_ITM_UNIT_R> bindL = MCList.create(MAVM_ITM_UNIT_R.class);
			for (MST_ARR_SCHD_R arrSchdR : _cacheArrSchd) {
				MAVM_ITM_UNIT_R itmUnitR = MAVM_ITM_UNIT_R.create();
				itmUnitR.itm_cd(arrSchdR.itm_cd());
				itmUnitR.itm_sub1(arrSchdR.itm_sub1());
				itmUnitR.itm_sub2(arrSchdR.itm_sub2());
				itmUnitR.itm_sub3(arrSchdR.itm_sub3());
				itmUnitR.unit_cd(arrSchdR.trd_unit_cd());
				bindL.add(itmUnitR);
			}
			for (MST_PO_D_R poDR : _cachePoD) {
				MAVM_ITM_UNIT_R itmUnitR = MAVM_ITM_UNIT_R.create();
				itmUnitR.itm_cd(poDR.itm_cd());
				itmUnitR.itm_sub1(poDR.itm_sub1());
				itmUnitR.itm_sub2(poDR.itm_sub2());
				itmUnitR.itm_sub3(poDR.itm_sub3());
				itmUnitR.unit_cd(poDR.trd_unit_cd());
				bindL.add(itmUnitR);
				if (!isSame(poDR.trd_unit_cd(), poDR.base_unit_cd())) {
					MAVM_ITM_UNIT_R baseItmUnitR = itmUnitR.clone();
					baseItmUnitR.unit_cd(poDR.base_unit_cd());
					bindL.add(baseItmUnitR);
				}
			}
			MCQueryApiBuilder itmUnitL_bldr = MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T"));
			String [] keys = new String[] {MAVM_ITM_UNIT_R.$itm_cd
					, MAVM_ITM_UNIT_R.$itm_sub1
					, MAVM_ITM_UNIT_R.$itm_sub2
					, MAVM_ITM_UNIT_R.$itm_sub3
					, MAVM_ITM_UNIT_R.$unit_cd
			};
			_cacheItmUnit = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(itmUnitL_bldr, bindL.groupBy(keys), keys);
		}
		/**
		 * 品目単位マスタキャッシュを取得する
		 * @param itm_cd 品目ＣＤ
		 * @param itm_sub1 枝番１
		 * @param itm_sub2 枝番２
		 * @param itm_sub3 枝番３
		 * @param unit_cd 単位ＣＤ
		 * @return 伝票帳票マスタキャッシュ
		 */
		protected MAVM_ITM_UNIT_R getCacheItmUnit(String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3,String unit_cd) {
			return _cacheItmUnit.get(itm_cd, itm_sub1, itm_sub2, itm_sub3, unit_cd);
		}
		/**
		 * 部門マスタを検索し、キャッシュに格納する
		 */
		protected void initCacheDpt() {
			MCList<MAM_DPT_R> bindL = MCList.create(MAM_DPT_R.class);
			for (MST_PO_R poR : _cachePo) {
				MAM_DPT_R dptR = MAM_DPT_R.create();
				dptR.dpt_cd(poR.purc_dpt_cd());
				bindL.add(dptR);
			}
			MCQueryApiBuilder dptL_bldr = MCQueryApiBuilder.create(MAM_DPT_R.create("T"));
			_cacheDpt = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(dptL_bldr, bindL.groupBy(MAM_DPT_R.$dpt_cd), MAM_DPT_R.$dpt_cd);
		}
		/**
		 * 部門マスタキャッシュを取得する
		 * @param dptCd 部門ＣＤ
		 * @return 部門マスタキャッシュ
		 */
		protected MAM_DPT_R getCacheDpt(String dptCd) {
			return _cacheDpt.get(getToday(), dptCd);
		}
		/**
		 * ユーザマスタを検索し、キャッシュに格納する
		 */
		protected void initCacheUsr() {
			MCList<MAM_USR_R> bindL = MCList.create(MAM_USR_R.class);
			for (MST_PO_R poR : _cachePo) {
				MAM_USR_R usrR = MAM_USR_R.create();
				usrR.usr_cd(poR.purc_usr_cd());
				bindL.add(usrR);
			}
			MCQueryApiBuilder usrL_bldr = MCQueryApiBuilder.create(MAM_USR_R.create("T"));
			_cacheUsr = new FXUCL_MCDbcCache<MAM_USR_R>(usrL_bldr, bindL.groupBy(MAM_USR_R.$usr_cd), MAM_USR_R.$usr_cd);
		}
		/**
		 * ユーザマスタキャッシュを取得する
		 * @param usrCd ユーザＣＤ
		 * @return ユーザマスタキャッシュ
		 */
		protected MAM_USR_R getCacheUsr(String usrCd) {
			return _cacheUsr.get(usrCd);
		}
		protected void initCacheItm() {
			MCList<MAM_ITM_R> bindL = MCList.create(MAM_ITM_R.class);
			for (MST_PO_D_R poDR : _cachePoD) {
				MAM_ITM_R itmR = MAM_ITM_R.create();
				itmR.itm_cd(poDR.itm_cd());
				itmR.itm_sub1(poDR.itm_sub1());
				itmR.itm_sub2(poDR.itm_sub2());
				itmR.itm_sub3(poDR.itm_sub3());
				bindL.add(itmR);
			}
			MCQueryApiBuilder itmBldr = MCQueryApiBuilder.create(MAM_ITM_R.create("T"));
			_cacheItm = new FXUCL_MCDbcCache<MAM_ITM_R>(itmBldr, bindL.groupBy(MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3), MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
		}
		protected MAM_ITM_R getCacheItm(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
			return _cacheItm.get(itmCd, itmSub1, itmSub2, itmSub3);
		}
		protected Map_PurcPrnt_Upd01_HdrR_MST_ARR_SCHD_R<PurcPrnt_Upd01_HdrR,MST_ARR_SCHD_R> createMap_PurcPrnt_Upd01_HdrR_MST_ARR_SCHD_R() {
			return new Map_PurcPrnt_Upd01_HdrR_MST_ARR_SCHD_R<PurcPrnt_Upd01_HdrR, MST_ARR_SCHD_R>();
		}

		public class Map_PurcPrnt_Upd01_HdrR_MST_ARR_SCHD_R<D extends PurcPrnt_Upd01_HdrR, S extends MST_ARR_SCHD_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$dlv_slip_mng_no, MST_ARR_SCHD_R.$dlv_slip_mng_no);
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$dlv_slip_mng_seq, MST_ARR_SCHD_R.$dlv_slip_mng_seq);
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$wg_cd, MST_ARR_SCHD_R.$wg_cd);
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$arr_loc_cd, MST_ARR_SCHD_R.$arr_loc_cd);
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$po_no, MST_PO_D_P_R.$po_no);
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$po_d_no, MST_PO_D_P_R.$po_d_no);
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$dlv_inst_grp_no, MST_DLV_INST_R.$dlv_inst_grp_no);
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$prms_rcpt_grp_no, MST_PRMS_RCPT_R.$prms_rcpt_grp_no);
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$dlv_rqst_tm, MST_ARR_SCHD_R.$arr_schd_tm);
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$arr_schd_no, MST_ARR_SCHD_R.$arr_schd_no);
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$prov_ddlv_flg, "prov_ddlv_flg");
				addColumnPathMap(PurcPrnt_Upd01_HdrR.$purc_ddlv_flg, "purc_ddlv_flg");
			}
		}
	}
	protected Map_PurcPrnt_Upd01_DtlR_MST_ARR_SCHD_R<PurcPrnt_Upd01_DtlR,MST_ARR_SCHD_R> createMap_PurcPrnt_Upd01_DtlR_MST_ARR_SCHD_R() {
		return new Map_PurcPrnt_Upd01_DtlR_MST_ARR_SCHD_R<PurcPrnt_Upd01_DtlR, MST_ARR_SCHD_R>();
	}

	public class Map_PurcPrnt_Upd01_DtlR_MST_ARR_SCHD_R<D extends PurcPrnt_Upd01_DtlR, S extends MST_ARR_SCHD_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$dlv_slip_mng_d_no, MST_ARR_SCHD_R.$dlv_slip_mng_d_no);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$dlv_slip_mng_d_seq, MST_ARR_SCHD_R.$dlv_slip_mng_d_seq);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$itm_cd, MST_ARR_SCHD_R.$itm_cd);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$itm_sub1, MST_ARR_SCHD_R.$itm_sub1);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$itm_sub2, MST_ARR_SCHD_R.$itm_sub2);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$itm_sub3, MST_ARR_SCHD_R.$itm_sub3);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$itm_nm, MST_ARR_SCHD_R.$itm_nm);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$sundry_itm_flg, MST_ARR_SCHD_R.$sundry_itm_flg);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$sno1, MST_ARR_SCHD_R.$sno1);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$sno2, MST_ARR_SCHD_R.$sno2);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$sno3, MST_ARR_SCHD_R.$sno3);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$sno4, MST_ARR_SCHD_R.$sno4);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$lot_no, MST_ARR_SCHD_R.$lot_no);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$sublot_no, MST_ARR_SCHD_R.$sublot_no);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$str_ln_cd, MST_ARR_SCHD_R.$str_ln_cd);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$trd_unit_qty, MST_ARR_SCHD_R.$trd_unit_qty);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$trd_unit_cd, MST_ARR_SCHD_R.$trd_unit_cd);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$base_unit_qty, MST_ARR_SCHD_R.$base_unit_qty);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$base_unit_cd, MST_ARR_SCHD_R.$base_unit_cd);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$dlv_inst_d_no, MST_ARR_SCHD_R.$dlv_inst_d_no);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$prms_rcpt_d_no, MST_ARR_SCHD_R.$prms_rcpt_d_no);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$po_d_no, MST_PO_D_R.$po_d_no);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$dlv_slip_d_no, MST_PO_D_R.$po_d_no);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$trd_d_rmrks, MST_ARR_SCHD_R.$dlv_slip_d_rmrks);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$sub_char1, MST_ARR_SCHD_R.$sub_char1);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$sub_char2, MST_ARR_SCHD_R.$sub_char2);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$sub_char3, MST_ARR_SCHD_R.$sub_char3);
		}
	}
	protected Map_PurcPrnt_Upd01_DtlR_PurcPrnt_Upd01_HdrR<PurcPrnt_Upd01_DtlR,PurcPrnt_Upd01_HdrR> createMap_PurcPrnt_Upd01_DtlR_PurcPrnt_Upd01_HdrR() {
		return new Map_PurcPrnt_Upd01_DtlR_PurcPrnt_Upd01_HdrR<PurcPrnt_Upd01_DtlR, PurcPrnt_Upd01_HdrR>();
	}

	public class Map_PurcPrnt_Upd01_DtlR_PurcPrnt_Upd01_HdrR<D extends PurcPrnt_Upd01_DtlR, S extends PurcPrnt_Upd01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$hdr_peg_no, PurcPrnt_Upd01_HdrR.$hdr_peg_no);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$data_crud_typ, PurcPrnt_Upd01_HdrR.$data_crud_typ);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$dlv_slip_mng_no, PurcPrnt_Upd01_HdrR.$dlv_slip_mng_no);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$dlv_slip_mng_seq, PurcPrnt_Upd01_HdrR.$dlv_slip_mng_seq);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$prov_ddlv_flg, PurcPrnt_Upd01_HdrR.$prov_ddlv_flg);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$purc_ddlv_flg, PurcPrnt_Upd01_HdrR.$purc_ddlv_flg);
		}
	}
	protected Map_PurcPrnt_Upd01_DtlR_MST_PO_D_R<PurcPrnt_Upd01_DtlR,MST_PO_D_R> createMap_PurcPrnt_Upd01_DtlR_MST_PO_D_R() {
		return new Map_PurcPrnt_Upd01_DtlR_MST_PO_D_R<PurcPrnt_Upd01_DtlR, MST_PO_D_R>();
	}

	public class Map_PurcPrnt_Upd01_DtlR_MST_PO_D_R<D extends PurcPrnt_Upd01_DtlR, S extends MST_PO_D_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$interim_flg, MST_PO_D_R.$interim_flg);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$pri_prnt_flg, MST_PO_D_R.$pri_print_flg);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$base_unit_po_qty, MST_PO_D_R.$base_unit_qty);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$trd_unit_po_qty, MST_PO_D_R.$trd_unit_qty);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$trd_cur_upri, MST_PO_D_R.$trd_cur_upri);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$trd_cur_amt, MST_PO_D_R.$trd_cur_amt);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$trd_cur_dscnt_amt, MST_PO_D_R.$trd_cur_dscnt_amt);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$tax_cd, MST_PO_D_R.$tax_cd);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$trd_cur_tax_amt, MST_PO_D_R.$trd_cur_tax_amt);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$wtax_rate, MST_PO_D_R.$wtax_rate);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$wtax_amt, MST_PO_D_R.$wtax_amt);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$sppl_itm_cd, MST_PO_D_R.$sppl_itm_cd);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$sppl_itm_nm, MST_PO_D_R.$sppl_itm_nm);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$dlv_slip_invalid_flg, MST_PO_D_R.$dlv_slip_invalid_flg);
		}
	}
	protected Map_PurcPrnt_Upd01_DtlR_MST_PROV_SCHD_R<PurcPrnt_Upd01_DtlR,MST_PROV_SCHD_R> createMap_PurcPrnt_Upd01_DtlR_MST_PROV_SCHD_R() {
		return new Map_PurcPrnt_Upd01_DtlR_MST_PROV_SCHD_R<PurcPrnt_Upd01_DtlR, MST_PROV_SCHD_R>();
	}

	public class Map_PurcPrnt_Upd01_DtlR_MST_PROV_SCHD_R<D extends PurcPrnt_Upd01_DtlR, S extends MST_PROV_SCHD_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$trd_cur_upri, MST_PROV_SCHD_R.$trd_cur_upri);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$trd_cur_amt, MST_PROV_SCHD_R.$trd_cur_amt);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$tax_cd, MST_PROV_SCHD_R.$tax_cd);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$trd_cur_tax_amt, MST_PROV_SCHD_R.$trd_cur_tax_amt);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$wtax_rate, MST_PROV_SCHD_R.$wtax_rate);
			addColumnPathMap(PurcPrnt_Upd01_DtlR.$wtax_amt, MST_PROV_SCHD_R.$wtax_amt);
		}
	}
	protected Map_MST_ARR_SCHD_R_PurcPrnt_Upd01_DtlR<MST_ARR_SCHD_R,PurcPrnt_Upd01_DtlR> createMap_MST_ARR_SCHD_R_PurcPrnt_Upd01_DtlR() {
		return new Map_MST_ARR_SCHD_R_PurcPrnt_Upd01_DtlR<MST_ARR_SCHD_R, PurcPrnt_Upd01_DtlR>();
	}

	public class Map_MST_ARR_SCHD_R_PurcPrnt_Upd01_DtlR<D extends MST_ARR_SCHD_R, S extends PurcPrnt_Upd01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_ARR_SCHD_R.$arr_schd_no, PurcPrnt_Upd01_DtlR.$arr_schd_no);
			addColumnPathMap(MST_ARR_SCHD_R.$dlv_slip_mng_d_no, PurcPrnt_Upd01_DtlR.$dlv_slip_mng_d_no);
			addColumnPathMap(MST_ARR_SCHD_R.$dlv_slip_mng_d_seq, PurcPrnt_Upd01_DtlR.$dlv_slip_mng_d_seq);
		}
	}
	protected Map_MST_ARR_SCHD_R_PurcPrnt_Upd01_HdrR<MST_ARR_SCHD_R,PurcPrnt_Upd01_HdrR> createMap_MST_ARR_SCHD_R_PurcPrnt_Upd01_HdrR() {
		return new Map_MST_ARR_SCHD_R_PurcPrnt_Upd01_HdrR<MST_ARR_SCHD_R, PurcPrnt_Upd01_HdrR>();
	}

	public class Map_MST_ARR_SCHD_R_PurcPrnt_Upd01_HdrR<D extends MST_ARR_SCHD_R, S extends PurcPrnt_Upd01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_ARR_SCHD_R.$dlv_slip_no, PurcPrnt_Upd01_HdrR.$dlv_slip_no);
			addColumnPathMap(MST_ARR_SCHD_R.$dlv_slip_mng_no, PurcPrnt_Upd01_HdrR.$dlv_slip_mng_no);
			addColumnPathMap(MST_ARR_SCHD_R.$dlv_slip_mng_seq, PurcPrnt_Upd01_HdrR.$dlv_slip_mng_seq);
		}
	}
	/**
	 * PurcPrnt_Prnt01オペレーション.<p>
	 *
	 * 注文書、納入指示書、納品書を発行する。<br>
	 */
	public class PurcPrnt_Prnt01 extends MSBDL_PurcPrntService_MC_A.PurcPrnt_Prnt01 {
		//ロックした発注ヘッダ
		protected MCList<MST_PO_R> _lockPoL = MCList.create(MST_PO_R.class);

		//ロックした納入指示ヘッダ
		protected MCList<MST_DLV_INST_R> _lockDlvInstL = MCList.create(MST_DLV_INST_R.class);
		//ロックした購買納品書ヘッダ
		protected MCList<MST_PURC_DLV_SLIP_R> _lockDlvSlipL = MCList.create(MST_PURC_DLV_SLIP_R.class);
		//注文書の発行リスト
		protected Map<List<String>, List<MSBDR_Po>> _poPrntMap = new LinkedHashMap<List<String>, List<MSBDR_Po>>();
		//注文書の再発行リスト
		protected Map<List<String>, MCReportInfoR> _poReprntMap = new LinkedHashMap<List<String>, MCReportInfoR>();
		
		//納品書の発行リスト
		//キー：発注登録からの発行時は発注ＮＯ、購買納期調整登録からの発行時は納入指示ＮＯ
		protected Map<String, List<MSBER_DlvSlip>> _dlvSlipMap = new LinkedHashMap<String, List<MSBER_DlvSlip>>();
		//納品書控の発行リスト
		//キー：発注登録からの発行時は発注ＮＯ、購買納期調整登録からの発行時は納入指示ＮＯ
		protected Map<String, List<MSBER_DlvSlip>> _dlvSlipSubMap = new LinkedHashMap<String, List<MSBER_DlvSlip>>();
		//発注先（納品書を発注先ごとに発行するためのMap）
		//キー：発注登録からの発行時は発注ＮＯ、購買納期調整登録からの発行時は納入指示ＮＯ
		protected Map<String, String> _spplMap = new LinkedHashMap<String, String>();
		
		//納入指示書の発行リスト
		protected Map<List<String>, List<MSBDR_DlvInst>> _dlvInstPrntMap = new LinkedHashMap<List<String>, List<MSBDR_DlvInst>>();
		//納入指示書の再発行リスト
		protected Map<List<String>, MCReportInfoR> _dlvInstReprntMap = new LinkedHashMap<List<String>, MCReportInfoR>();
		
		//再発行の帳票は、添付帳票登録サービスの呼び出し対象外のため、呼び出し対象外の帳票情報を保持する
		protected Set<List<String>> _rePrntPoSet = new HashSet<List<String>>();
		protected Set<List<String>> _rePrntDlvSlipSet = new HashSet<List<String>>();
		
		protected MCIndexKey _lockPokey;
		protected MCIndexKey _lockDlvInstkey;
		protected MCIndexKey _lockDlvSlipkey;

		//EIAJ納品書バーコード用半角スペース
		protected final String SP = " ";
	
		protected FXUCL_MCDbcCache<MAM_SLIP_FORM_R> _slipCache = null;
		protected FXUCL_MCDbcCache<MAM_PO_PRINT_R> _poPrntCache = null;
		
		//エラー行以外のリスト
		protected MCList<PurcPrnt_Prnt01_PoR> _up0L = null;
		protected MCList<PurcPrnt_Prnt01_DlvInstR> _up1L = null;
		protected MCList<PurcPrnt_Prnt01_DlvSlipR> _up2L = null;

		protected MCList<MST_PO_R> _updPoL = MCList.create(MST_PO_R.class);
		protected MST_PO_R _updPoL_t = MST_PO_R.create("T");
		protected MCQueryApiBuilder _updPoL_bldr = MCQueryApiBuilder.create(_updPoL_t);
		protected MCList<MST_DLV_INST_R> _updDlvInstL = MCList.create(MST_DLV_INST_R.class);
		protected MST_DLV_INST_R _updDlvInstL_t = MST_DLV_INST_R.create("T");
		protected MCQueryApiBuilder _updDlvInstL_bldr = MCQueryApiBuilder.create(_updDlvInstL_t);
		protected MCList<MST_PURC_DLV_SLIP_R> _updPurcDlvSlipL = MCList.create(MST_PURC_DLV_SLIP_R.class);
		protected MST_PURC_DLV_SLIP_R _updPurcDlvSlipL_t = MST_PURC_DLV_SLIP_R.create("T");
		protected MCQueryApiBuilder _updPurcDlvSlipL_bldr = MCQueryApiBuilder.create(_updPurcDlvSlipL_t);
		
		protected MCDate _prntHm = MCDate.now();
		protected MCList<BpUtil_Sprt01_DtlR> _bpUtil = MCList.create(BpUtil_Sprt01_DtlR.class);
		protected MCIndexKey _bpUtilkey;
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			if (up0().size() == 0 && up1().size() == 0 && up2().size() == 0 && up4().size() == 0) {
				return;
			}
			_inspSchdL = null;
			_poDL = null;
			checkLock();
			execPrnt();
			upd();
			setDown();
		}

		protected void setDown(){
			down0().addAll(up0());
			down1().addAll(up1());
			down2().addAll(up2());
			down3().addAll(up4());
		}

		protected void upd() {
			updPo();
			updDlvInst();
			updPrntFlg();
		}

		protected void updPo() {
			setCondPo();
			dbUpdateKey("MSBDL5200_MST_PO_U01", _updPoL, _updPoL_bldr);
			// 発注明細を空更新する。
			// 最新の明細をヘッダと紐づけるため、ヘッダとupd_srv_req_noが同じ明細を更新対象にする。
			MST_PO_D_R t = MST_PO_D_R.create("T");
			execDbUpdate("MSBDL5200_MST_PO_D_U01",
					t, _updPoL,
					t.po_no.eq(bindEx("po_no"))
					.and(t.po_rev.eq(bindEx("po_rev")))
					.and(t.upd_srv_req_no.eq(bindEx("upd_srv_req_no"))),
					t.po_no);
			// 改訂履歴データ更新サービス呼出（発注改訂履歴テーブル更新）
			callRevDataServiceIns01();
		}

		/**
		 * 改訂履歴データ更新サービスの改訂履歴データ更新リスト登録処理を呼び出す。
		 * 発注改訂履歴テーブルを更新する。
		 */
		protected void callRevDataServiceIns01() {
			MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
			for (MST_PO_R r : _updPoL) {
				RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
				opeR.rev_data_src_no(r.po_no());
				opeR.rev_no(r.po_rev());
				opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_PO.value());
				ope.up0().add(opeR);
			}
			ope.exec();
		}

		protected void updDlvInst(){
			setCondDlvInst();
			dbUpdateKey("MSBDL5200_MST_DLV_INST_U01", _updDlvInstL, _updDlvInstL_bldr);
		}
		
		protected void updPrntFlg() {
			setCondPurcDlvSlip();
			dbUpdateKey("MSBDL5200_MST_PURC_DLV_SLIP_U03", _updPurcDlvSlipL, _updPurcDlvSlipL_bldr);
		}

		protected void setCondPo() {
			_updPoL_bldr.setSet(_updPoL_t.po_print_dt);
			_updPoL_bldr.addSet(_updPoL_t.po_print_flg);
			_updPoL_bldr.addSet(_updPoL_t.last_po_rev);
		}

		protected void setCondDlvInst() {
			_updDlvInstL_bldr.setSet(_updDlvInstL_t.dlv_inst_print_dt);
			_updDlvInstL_bldr.addSet(_updDlvInstL_t.dlv_inst_print_flg);
			_updDlvInstL_bldr.addSet(_updDlvInstL_t.last_dlv_inst_rev);
		}
	
		protected void setCondPurcDlvSlip() {
			_updPurcDlvSlipL_bldr.setSet(_updPurcDlvSlipL_t.slip_prnt_flg);
		}
	
		/**
		 * 訂正の注文書か
		 * @param infoR
		 * @return 訂正注文書の場合にtrue
		 */
		protected boolean isUpdReprintPo(MCReportInfoR infoR) {
			MSBDR_Po repSet = (MSBDR_Po) MCServerReportManager.toReportSet(infoR);
			String bt = repSet.getBlockType(PoHdrR.create());
			@SuppressWarnings("unchecked")
			MCList<MCRow> hdrL = repSet.getAll(bt);
			if (hdrL == null || hdrL.isEmpty()) {
				return false;
			}
			PoHdrR hdrR = (PoHdrR) hdrL.get(0);
			return MAC_RPT_STS_TYP.isCOR(hdrR.rpt_sts_typ());
		}
		
		/**
		 * 訂正の納入指示書か
		 * @param infoR
		 * @return 納入指示書の場合にtrue
		 */
		protected boolean isUpdReprintDlvInst(MCReportInfoR infoR) {
			MSBDR_DlvInst repSet = (MSBDR_DlvInst) MCServerReportManager.toReportSet(infoR);
			String bt = repSet.getBlockType(DlvInstHdrR.create());
			@SuppressWarnings("unchecked")
			MCList<MCRow> hdrL = repSet.getAll(bt);
			if (hdrL == null || hdrL.isEmpty()) {
				return false;
			}
			DlvInstHdrR hdrR = (DlvInstHdrR) hdrL.get(0);
			return MAC_RPT_STS_TYP.isCOR(hdrR.rpt_sts_typ());
		}
		
		protected MSBDR_Po getCanPo(MCReportInfoR infoR, MST_PO_R poR) {
			// RportSetに変換して編集。業務情報で検索して1件のみ取得される。
			MSBDR_Po repSet = (MSBDR_Po) MCServerReportManager.toReportSet(infoR);

			//訂正、取消時の取消注文書データ作成
			String bt = repSet.getBlockType(PoHdrR.create());
			String btd = repSet.getBlockType(PoDtlR.create());
			@SuppressWarnings("unchecked")
			MCList<MCRow> hdrL = repSet.getAll(bt);
			@SuppressWarnings("unchecked")
			MCList<MCRow> dtlL = repSet.getAll(btd);
			if (hdrL == null || hdrL.isEmpty()) {
				return null;
			}
			if (dtlL == null || dtlL.isEmpty()) {
				return null;
			}
			// 訂正、取消前データの最新ＦＬＧをオフに更新する
			infoR.app_report_sts2("0");
			MCServerReportManager.updatePrintData(infoR);
			//訂正、取消後のデータ作成
			//ヘッダは1行のみ取得される
			PoHdrR hdrR = (PoHdrR) hdrL.get(0);
			//印刷済データの中身を参照し、仮単価が含まれるかを判定する
			boolean isInterim = false;
			for (MCRow dtlR : dtlL) {
				if (((PoDtlR) dtlR).interim_flg()) {
					isInterim = true;
				}
			}
			MSBDR_Po newRepSet = MSBDR_Po.create();
			// 取消時に入力可能な項目の表示
			// 注文書表示
			PoHdrR canHdrR = createPoHdr(poR);
			if (!poR.can_flg()) {
				canHdrR.po_print_cd(hdrR.po_print_cd());
				hdrR.crct_rsn_cd(null);
				hdrR.po_crct_rsn_nm(null);
				hdrR.po_crct_rsn_rmrks(null);
			}
			else {
				hdrR.crct_rsn_cd(canHdrR.crct_rsn_cd());
				hdrR.po_crct_rsn_nm(canHdrR.po_crct_rsn_nm());
				hdrR.po_crct_rsn_rmrks(canHdrR.po_crct_rsn_rmrks());
			}
			MAM_PO_PRINT_R poPrntR = getPoPrnt(canHdrR.po_print_cd());
			// 訂正理由
			hdrR.po_print_txt(isInterim ? poPrntR.txt_del_on() : poPrntR.txt_del_off());
			hdrR.print_hm(_prntHm);
			setPoTxt(hdrR);
			hdrR.rpt_sts_typ(MAC_RPT_STS_TYP.CAN.value());
			MAC_RPT_STS_TYP.putNameNE(hdrR, PoHdrR.$rpt_sts_typ, PoHdrR.$rpt_sts_typ_nm, repSet.getLocale());
			newRepSet.addRow(hdrR);
			newRepSet.addAll(dtlL);
			newRepSet.setLocale(repSet.getLocale());
			setPoBisInfo(newRepSet, hdrR);

			return newRepSet;
		}
		
		
		protected MSBDR_DlvInst getCanDlvInst(MCReportInfoR infoR, MST_DLV_INST_R dlvInstR) {
			// RportSetに変換して編集。業務情報で検索して1件のみ取得される。
			MSBDR_DlvInst repSet = (MSBDR_DlvInst) MCServerReportManager.toReportSet(infoR);

			//訂正、取消時の取消納入指示書データ作成
			String bt = repSet.getBlockType(DlvInstHdrR.create());
			@SuppressWarnings("unchecked")
			MCList<MCRow> hdrL = repSet.getAll(bt);
			if (hdrL == null || hdrL.isEmpty()) {
				return null;
			}
			// 訂正、取消前データの最新ＦＬＧをオフにする
			infoR.app_report_sts2("0");
			MCServerReportManager.updatePrintData(infoR);
			//訂正、取消後のデータ作成
			//ヘッダは1行のみ取得される
			DlvInstHdrR hdrR = (DlvInstHdrR) hdrL.get(0);
			hdrR.rpt_sts_typ(MAC_RPT_STS_TYP.CAN.value());
			MAC_RPT_STS_TYP.putNameNE(hdrR, DlvInstHdrR.$rpt_sts_typ, DlvInstHdrR.$rpt_sts_typ_nm, repSet.getLocale());
			repSet.setAppReportSts1(hdrR.rpt_sts_typ());
			repSet.setAppReportStsNm1(hdrR.rpt_sts_typ_nm());

			return repSet;
		}
		
		protected MCReportInfoR srchPoReprintInfo(String poNo, String poRev, String lclCd, boolean isLatest, String repSts) {
			MSBDR_Po poPrnt = MSBDR_Po.create();

			poPrnt.setAppReportNo1(poNo);
			poPrnt.setAppReportNo2(poRev);
			poPrnt.setLocale(toLocaleFromLclCd(lclCd));
			if (!isNull(repSts)) {
				poPrnt.setAppReportSts1(repSts);
			}
			//最新のみ検索する
			if (isLatest) {
				poPrnt.setAppReportSts2("1");
			}
			// 印刷データからデータを取得
			MCList<MCReportInfoR> infoL = MCServerReportManager.searchPrintData(poPrnt, false);
			if (infoL == null) {
				return null;
			}
			return infoL.get(0);
		}
		
		protected MCReportInfoR srchDlvInstReprintInfo(String dlvInstNo, String dlvInstRev, String lclCd, boolean isLatest, String repSts) {
			MSBDR_DlvInst dlvInstPrnt = MSBDR_DlvInst.create();

			dlvInstPrnt.setAppReportNo1(dlvInstNo);
			dlvInstPrnt.setAppReportNo2(dlvInstRev);
			dlvInstPrnt.setLocale(toLocaleFromLclCd(lclCd));
			if (!isNull(repSts)) {
				dlvInstPrnt.setAppReportSts1(repSts);
			}
			//最新のみ検索する
			if (isLatest) {
				dlvInstPrnt.setAppReportSts2("1");
			}
			// 印刷データからデータを取得
			MCList<MCReportInfoR> infoL = MCServerReportManager.searchPrintData(dlvInstPrnt, false);
			if (infoL == null) {
				return null;
			}
			return infoL.get(0);
		}		
		
		
		protected void createPoPrnt(PurcPrnt_Prnt01_PoR up0R) {
			MST_PO_R poR = getLatestPo(up0R);
			//取消注文書
			MSBDR_Po repSetCan = null;
			//新規作成分
			MSBDR_Po repSetNew = null;

			if (isReprntPo(poR)) {
				MCReportInfoR infoR ;
				if(isNull(poR)){
					String lclCd = getPrntLclCd(up0R.po_no());
					infoR = srchPoReprintInfo(up0R.po_no(), up0R.po_rev().toString(), lclCd, true, null);
				}
				else {
					// 「帳票発行済改訂番号の訂正で帳票発行なし→取り消し」と操作した場合、po_revでは再発行対象が見つからない
					// ので、last_po_revで検索する。
					String srchRev = poR.po_rev().toString();
					if (poR.po_rev().gt(poR.last_po_rev())) {
						srchRev = poR.last_po_rev().toString();
					}
					infoR = srchPoReprintInfo(poR.po_no(), srchRev, poR.getStringNE("prnt_lcl_cd"), true, null);	
				}
				if (isNull(infoR)) {
					return;
				}
				addReprntSetKey(_rePrntPoSet,infoR);
				// reportsetの作成
				repSetNew = (MSBDR_Po) MCServerReportManager.toReportSet(infoR);
				
				// 訂正の場合の取消
				if (isUpdReprintPo(infoR)) {
					MCNumber canRev = isNull(poR) ? up0R.po_rev() : poR.po_rev().subtract(1);
					MCReportInfoR infoCanR;
					// 訂正注文書改訂番号の一つ前の改訂番号で取消注文書が検索できない場合（※）
					// 改訂番号を一つずつ減らし、取消注文書が見つかるまで検索する。
					// （※）ＥＤＩを送信して改訂番号が一つ上がったが、注文書を発行しなかった場合
					for (; 1 <= canRev.intValue(); canRev = canRev.subtract(1)) {
					if (isNull(poR)) {
						String lclCd = getPrntLclCd(up0R.po_no());
						infoCanR = srchPoReprintInfo(up0R.po_no(), canRev.toString(), lclCd, false, MAC_RPT_STS_TYP.CAN.value());
					}
					else {
						infoCanR = srchPoReprintInfo(poR.po_no(), canRev.toString(), poR.getStringNE("prnt_lcl_cd"), false,
								MAC_RPT_STS_TYP.CAN.value());
					}
					if (isNull(infoCanR)) {
						continue;
					}
					
					// reportsetの作成
					repSetCan = (MSBDR_Po) MCServerReportManager.toReportSet(infoCanR);
					if (repSetCan != null) {
							_poReprntMap.put(Arrays.asList(new String[] {isNull(poR) ? up0R.po_no() : poR.po_no(), canRev.toString() }), infoCanR);
							_poPrntMap.put(Arrays.asList(new String[] {poR.po_no(), poR.po_rev().toString()}), 
									new ArrayList<MSBDR_Po>(Arrays.asList(new MSBDR_Po[] {repSetCan})));
							addReprntSetKey(_rePrntPoSet,infoCanR);
							break;
						}
					}
				}
				_poReprntMap.put(Arrays.asList(new String[] { isNull(poR) ? up0R.po_no() : poR.po_no(),
					isNull(poR) ? up0R.po_rev().toString() : poR.po_rev().toString() }), infoR);
				String tmp_po_no = isNull(poR) ? up0R.po_no() : poR.po_no();
				String tmp_po_rev = isNull(poR) ? up0R.po_rev().toString() : poR.po_rev().toString();
				List<MSBDR_Po> l = _poPrntMap.get(Arrays.asList(new String[] { tmp_po_no, tmp_po_rev }));
				if (null == l) {
					l = new ArrayList<MSBDR_Po>(Arrays.asList(new MSBDR_Po[] { repSetNew }));
				}
				else {
					l.add(repSetNew);
				}
				_poPrntMap.put(Arrays.asList(new String[] { tmp_po_no, tmp_po_rev }), l);
				return;
			}
			if (isPrntPoCan(poR)) {
				MCReportInfoR infoR = srchPoReprintInfo(poR.po_no(), poR.last_po_rev().toString(), poR.getStringNE("prnt_lcl_cd"), true, null);
				if (!isNull(infoR)) {
				repSetCan = getCanPo(infoR, poR);
				// 印刷データの登録のみ
				MCServerReportManager.request(repSetCan, false);
				//発注ヘッダ更新情報設定	
				setPoUpdData(poR, up0R, poR.last_po_rev());
				}
			}

			// 発行データ作成（新規登録、訂正後）
			if (!poR.can_flg()) {
				repSetNew = createPoReportSet(poR);
				// 印刷データの登録のみ
				MCServerReportManager.request(repSetNew, false);
				//発注ヘッダ更新情報設定	
				setPoUpdData(poR, up0R, poR.po_rev());
			}
			// 発注訂正時は、取消注文書、訂正注文書の順でまとめてレポートセットを作成
			if (repSetCan != null) {
				_poPrntMap.put(Arrays.asList(new String[]{poR.po_no(), poR.po_rev().toString()}), 
						new ArrayList<MSBDR_Po>(Arrays.asList(new MSBDR_Po[]{repSetCan})));
			}
			if (repSetNew != null) {
				List<MSBDR_Po> l = _poPrntMap.get(Arrays.asList(new String[] { poR.po_no(), poR.po_rev().toString() }));
				if (null == l) {
					l = new ArrayList<MSBDR_Po>(Arrays.asList(new MSBDR_Po[] { repSetNew }));
				}
				else {
					l.add(repSetNew);
				}
				_poPrntMap.put(Arrays.asList(new String[] { poR.po_no(), poR.po_rev().toString() }), l);
			}
		
		}
		
		protected MST_PO_R getLatestPo(PurcPrnt_Prnt01_PoR up0R) {
			MST_PO_R poR = _lockPoL.getFirst(_lockPokey, up0R.po_no());
			if (isLatestPo(poR, up0R))  {
				return poR;
			}
			return null;
		}
		
		protected boolean isLatestPo(MST_PO_R poR, PurcPrnt_Prnt01_PoR up0R) {
			// 過去改訂の場合は発注（poR）は取得されない
			if (isNull(poR)) {
				return false;
			}
			// 発注一覧登録で同じ発注に対し過去改訂と最新改訂を同時に選択した場合に、過去改訂に対しても発注（poR）が取得されてしまう。
			// そのため改訂番号の比較を行うことで最新改訂かどうかを判断する。
			if (isSame(up0R.po_rev(), poR.po_rev())) {
				return true;
			}
			return false;
		}

		protected void createDlvInstPrnt(PurcPrnt_Prnt01_DlvInstR up1R) {

			MST_DLV_INST_R dlvInstR = _lockDlvInstL.getFirst(_lockDlvInstkey, up1R.dlv_inst_no());
			//取消納入指示書
			MSBDR_DlvInst repSetCan = null;
			//新規作成分
			MSBDR_DlvInst repSetNew = null;

			if (isReprntDlvInst(dlvInstR)) {
				// 「帳票発行済改訂番号の訂正で帳票発行なし→取り消し」と操作した場合、dlv_inst_revでは再発行対象が見つからない
				// ので、last_dlv_inst_revで検索する。
				String srchRev = dlvInstR.dlv_inst_rev().toString();
				if (dlvInstR.dlv_inst_rev().gt(dlvInstR.last_dlv_inst_rev())) {
					srchRev = dlvInstR.last_dlv_inst_rev().toString();
				}
				MCReportInfoR infoR = srchDlvInstReprintInfo(dlvInstR.dlv_inst_no(), srchRev, dlvInstR.getStringNE("prnt_lcl_cd"), true, null);
				// reportsetの作成
				repSetNew = (MSBDR_DlvInst) MCServerReportManager.toReportSet(infoR);
				// 訂正の場合の取消
				if (isUpdReprintDlvInst(infoR)) {
					MCNumber canRev = dlvInstR.dlv_inst_rev().subtract(1);
					MCReportInfoR infoCanR;
					// 訂正納入指示書改訂番号の一つ前の改訂番号で取消納入指示書が検索できない場合（※）
					// 改訂番号を一つずつ減らし、取消納入指示書が見つかるまで検索する。
					// （※）ＥＤＩを送信して改訂番号が一つ上がったが、納入指示書を発行しなかった場合
					for (; 1 <= canRev.intValue(); canRev = canRev.subtract(1)) {
						infoCanR = srchDlvInstReprintInfo(dlvInstR.dlv_inst_no(), canRev.toString(), dlvInstR.getStringNE("prnt_lcl_cd"), false,
							MAC_RPT_STS_TYP.CAN.value());
						if (isNull(infoCanR)) {
							continue;
						}
						// reportsetの作成
						repSetCan = (MSBDR_DlvInst) MCServerReportManager.toReportSet(infoCanR);
						if (repSetCan != null) {
							_dlvInstReprntMap.put(Arrays.asList(new String[] {dlvInstR.dlv_inst_no(), canRev.toString()}), infoCanR);
							_dlvInstPrntMap.put(Arrays.asList(new String[] {dlvInstR.dlv_inst_no(), dlvInstR.dlv_inst_rev.toString()}),
									new ArrayList<MSBDR_DlvInst>(Arrays.asList(new MSBDR_DlvInst[] {repSetCan})));
							break;
						}
					}
				}
				List<MSBDR_DlvInst> l = _dlvInstPrntMap.get(Arrays.asList(new String[] {dlvInstR.dlv_inst_no(), dlvInstR.dlv_inst_rev().toString()}));
				if (null == l) {
					l = new ArrayList<MSBDR_DlvInst>(Arrays.asList(new MSBDR_DlvInst[] {repSetNew}));
				}
				else {
					l.add(repSetNew);
				}
				_dlvInstReprntMap.put(Arrays.asList(new String[] {dlvInstR.dlv_inst_no(), dlvInstR.dlv_inst_rev().toString()}), infoR);
				_dlvInstPrntMap.put(Arrays.asList(new String[] {dlvInstR.dlv_inst_no(), dlvInstR.dlv_inst_rev().toString()}), l);
				return;
			}
			if (isPrntDlvInstCan(dlvInstR)) {
				MCReportInfoR infoR = srchDlvInstReprintInfo(dlvInstR.dlv_inst_no(), dlvInstR.last_dlv_inst_rev().toString(),
						dlvInstR.getStringNE("prnt_lcl_cd"), true, null);
				repSetCan = getCanDlvInst(infoR, dlvInstR);
				MCServerReportManager.request(repSetCan, false);
				//納入指示ヘッダ更新情報設定	
				setDlvInstUpdData(dlvInstR, up1R, dlvInstR.last_dlv_inst_rev());
			}

			// 発行データ作成（新規登録、訂正後）
			if (!dlvInstR.can_flg()) {
				repSetNew = createDlvInstRS(dlvInstR);
				// 印刷データの登録のみ
				MCServerReportManager.request(repSetNew, false);
				//納入指示ヘッダ更新情報設定	
				setDlvInstUpdData(dlvInstR, up1R, dlvInstR.dlv_inst_rev());
			}
			// 納入指示訂正時は、取消納入指示書、訂正納入指示書の順でまとめてレポートセットを作成
			if (repSetCan != null) {
				_dlvInstPrntMap.put(Arrays.asList(new String[] {dlvInstR.dlv_inst_no(), dlvInstR.dlv_inst_rev.toString()}),
						new ArrayList<MSBDR_DlvInst>(Arrays.asList(new MSBDR_DlvInst[] {repSetCan})));
			}
			if (repSetNew != null) {
				List<MSBDR_DlvInst> l = _dlvInstPrntMap.get(Arrays.asList(new String[] {dlvInstR.dlv_inst_no(), dlvInstR.dlv_inst_rev.toString()}));
				if (null == l) {
					l = new ArrayList<MSBDR_DlvInst>(Arrays.asList(new MSBDR_DlvInst[] { repSetNew }));
				}
				else {
					l.add(repSetNew);
				}
				_dlvInstPrntMap.put(Arrays.asList(new String[] {dlvInstR.dlv_inst_no(), dlvInstR.dlv_inst_rev.toString()}), l);
			}
		}

		protected void requestDlvSlip() {
			if(!existsDlvSlip()){
				return;
			}
			prntDlvSlip(_dlvSlipMap);
			
			_dlvSlipMap.clear();
		}
		
		protected void requestDlvSlipSub() {
			if(!existsDlvSubSlip()){
				return;
			}
			prntDlvSlip(_dlvSlipSubMap);
			
			_dlvSlipSubMap.clear();
		}
		
		protected void requestDlvInst() {
			if(!existsDlvInst()){
				return;
			}
			// 発注先ごとにMapを作成
			Map<String, List<MSBDR_DlvInst>> lclMap = new LinkedHashMap<String, List<MSBDR_DlvInst>>();
			for (Map.Entry<List<String>, List<MSBDR_DlvInst>> en : _dlvInstPrntMap.entrySet()) {
				
				boolean isInit = false;
				List<MSBDR_DlvInst> lst = null;
				for (MSBDR_DlvInst di : en.getValue()) {
					if (!isInit) {
						lst = lclMap.get(di.getAppToCd1());
						if (lst == null) {
							lst = new ArrayList<MSBDR_DlvInst>();
							lclMap.put(di.getAppToCd1(), lst);
						}
						isInit = true;
					}
					lst.add(di);
				}
			}
			
			// ソート処理
			lclMap = dlvInstMapSort(lclMap);
			
			for (Map.Entry<String, List<MSBDR_DlvInst>> en : lclMap.entrySet()) {
				MCReportInfoR diReprntInfo = null;
				MCReportSet allRs = null;
				boolean isInit = false;
				boolean indivPrntFlg = false;
				
				if (!up3().indiv_prnt_flg()) {
					BpUtil_Sprt01_DtlR bpR = _bpUtil.getFirst(_bpUtilkey, en.getKey());
					indivPrntFlg = bpR.indiv_prnt_flg();
				}
				
				if (up3().indiv_prnt_flg() || indivPrntFlg) {
					// 個別発行
					String oldDi = null;
					for (MSBDR_DlvInst di : en.getValue()) {
						if (isSame(di.getAppReportNo1(), oldDi)) {
							allRs.addAll(di.getAll());
						}
						else {
							if (allRs != null) {
								allRs.setRegister(false);
								MCServerReportManager.request(allRs);
							}
							diReprntInfo = getDlvInstReprntInfo(di);
							if (isNull(diReprntInfo)) {
								allRs = di.createInstance();
								allRs.setLocale(di.getLocale());
								allRs.addAll(di.getAll());
								oldDi = di.getAppReportNo1();
							}
							else {
								allRs = null;
								MCServerReportManager.reprint(diReprntInfo);
							}
						}
					}
					if (allRs != null) {
						allRs.setRegister(false);
						MCServerReportManager.request(allRs);
					}
				}
				else {
					// まとめ発行
					for (MSBDR_DlvInst di : en.getValue()) {
						if (!isInit) {
							allRs = di.createInstance();
							allRs.setLocale(di.getLocale());
							isInit = true;
						}
						diReprntInfo = getDlvInstReprntInfo(di);
						if (isNull(diReprntInfo)) {
							allRs.addAll(di.getAll());
						}
					}
					if (allRs.size() != 0) {
						MCServerReportManager.request(allRs);
					}
					for (Map.Entry<List<String>, MCReportInfoR> reprntDi : _dlvInstReprntMap.entrySet()) {
						if (isSame(reprntDi.getValue().app_to_cd1(), en.getKey())) {
							MCServerReportManager.reprint(reprntDi.getValue());
						}
					}
				}
			}
			_dlvInstPrntMap.clear();
			_dlvInstReprntMap.clear();
		}

		protected MCReportInfoR getDlvInstReprntInfo(MSBDR_DlvInst di) {
			MCReportInfoR info = di.getReportInfo();
			return _dlvInstReprntMap.get(Arrays.asList(new String[] {info.app_report_no1(), info.app_report_no2()}));
		}

		protected void requestPo() {
			if (!existsPo()) {
				return;
			}
			// 発注先ごとにMapを作成
			Map<String, List<MSBDR_Po>> lclMap = new LinkedHashMap<String, List<MSBDR_Po>>();
			for (Map.Entry<List<String>, List<MSBDR_Po>> en : _poPrntMap.entrySet()) {

				boolean isInit = false;
				List<MSBDR_Po> lst = null;
				for (MSBDR_Po po : en.getValue()) {
					if (!isInit) {
						lst = lclMap.get(po.getAppToCd1());
						if (lst == null) {
							lst = new ArrayList<MSBDR_Po>();
							lclMap.put(po.getAppToCd1(), lst);
						}
						isInit = true;
					}
					lst.add(po);
				}
				
			}
			
			// ソート処理
			lclMap = poMapSort(lclMap);
			List<MCReportSet> rptSetList = new ArrayList<>();
			for (Map.Entry<String, List<MSBDR_Po>> en : lclMap.entrySet()) {
				MCReportInfoR poReprntInfo = null;
				MCReportSet allPoRs = null;
				boolean isPoInit = false;
				boolean indivPrntFlg = false;

				if (!up3().indiv_prnt_flg()) {
					BpUtil_Sprt01_DtlR bpR = _bpUtil.getFirst(_bpUtilkey, en.getKey());
					indivPrntFlg = bpR.indiv_prnt_flg();
				}

				if (up3().indiv_prnt_flg() || indivPrntFlg) {
					// 個別発行
					for (MSBDR_Po po : en.getValue()) {
						if (allPoRs != null) {
								allPoRs.setRegister(false);
								MCServerReportManager.requestImmediate(allPoRs);
							}
						poReprntInfo = getPoReprntInfo(po);
						if (isNull(poReprntInfo)) {
							allPoRs = po.createInstance();
							allPoRs.setLocale(po.getLocale());
							allPoRs.addAll(po.getAll());
							allPoRs.addWriteListener(new FileWriteListener(rptSetList));
						}
						else {
							allPoRs = null;
							MCServerReportManager.reprint(poReprntInfo.clone());
						}
					}
					if(allPoRs != null) {
						allPoRs.setRegister(false);
						MCServerReportManager.requestImmediate(allPoRs);
					}
				}
				else {
					// まとめ発行
					for (MSBDR_Po po : en.getValue()) {
						if (!isPoInit) {
							allPoRs = po.createInstance();
							allPoRs.setLocale(po.getLocale());
							isPoInit = true;
						}
						poReprntInfo = getPoReprntInfo(po);
						if (isNull(poReprntInfo)) {
							allPoRs.addAll(po.getAll());
						}
					}
					if (allPoRs.size() != 0) {
						MCServerReportManager.request(allPoRs);
					}
					for (Map.Entry<List<String>, MCReportInfoR> reprntPo : _poReprntMap.entrySet()) {
						if(isSame(reprntPo.getValue().app_to_cd1(), en.getKey())) {
							MCServerReportManager.reprint(reprntPo.getValue());
						}
					}
				}
			}
			//添付帳票登録サービス（更新）の呼び出し
			if(!rptSetList.isEmpty()) {
				callPoAttachSrv(rptSetList);
			}
			_poPrntMap.clear();
			_poReprntMap.clear();
			_rePrntPoSet.clear();
		}

		protected MCReportInfoR getPoReprntInfo(MSBDR_Po po) {
			MCReportInfoR info = po.getReportInfo();
			return _poReprntMap.get(Arrays.asList(new String[] {info.app_report_no1(), info.app_report_no2()}));
		}

		protected void callPoAttachSrv(List<MCReportSet> rsList) {
			Map<String, List<Attach_Chk01_DtlR>> up0Map = new LinkedHashMap<String, List<Attach_Chk01_DtlR>>();
			createPoAttachMap(rsList,up0Map);
			
			if(up0Map.isEmpty()) {
				return;
			}
			
			//取消とそれ以外に分けてサービスを呼び出す
			for (Map.Entry<String, List<Attach_Chk01_DtlR>> en : up0Map.entrySet()) {
				MBBCL_AttachService.Attach_Upd01 ope = MBBCL_AttachService.crtAttach_Upd01();
				setPoAttachUp(ope,en);
				ope.exec();
			}
		}
		protected void createPoAttachMap(List<MCReportSet> rsList, Map<String, List<Attach_Chk01_DtlR>> map) {
			for(MCReportSet rs: rsList) {
				//reportSetから、ヘッダを取得する
				String bt = rs.getBlockType(PoHdrR.create());
				
				@SuppressWarnings("unchecked")
				MCList<MCRow> hdrL = rs.getAll(bt);

				if (hdrL == null || hdrL.isEmpty()) {
					continue;
				}
				
				PoHdrR hdrR = (PoHdrR) hdrL.get(0);
				//再発行は登録サービス呼び出し対象外
				if(isRePrntPo(hdrR)) {
					continue;
				}
				editPoAttachMap(rs,hdrR,map);
			}
		}
		protected void editPoAttachMap(MCReportSet rs, PoHdrR hdrR,Map<String, List<Attach_Chk01_DtlR>> map) {
			Attach_Chk01_DtlR up0 = Attach_Chk01_DtlR.create();
			copy(up0, hdrR, createMap_Attach_Chk01_DtlR_PoHdrR());
			//WG
			up0.wg_cd(getWgCd(hdrR.purc_dpt_cd(), hdrR.po_dt()));
			//帳票ID
			up0.report_id(rs.getReportInfo().report_id());
			//添付元ファイル(バイナリ）
			up0.file_bin(rs.getReportInfo().save_file_bin());
			
			List<Attach_Chk01_DtlR> l = map.get(MAC_RPT_STS_TYP.isCAN(hdrR.rpt_sts_typ()) ? "CAN": "OTHER"); 
			if(null == l) {
				l = new ArrayList<Attach_Chk01_DtlR>(Arrays.asList(new Attach_Chk01_DtlR[]{up0}));
			}else {
				l.add(up0);
			}
			if(MAC_RPT_STS_TYP.isCAN(hdrR.rpt_sts_typ())) {
				map.put("CAN",l);
			}else {
				map.put("OTHER", l);
			}
		}
		protected void setPoAttachUp(MBBCL_AttachService.Attach_Upd01 ope,Map.Entry<String, List<Attach_Chk01_DtlR>> en) {
			ope.up0().addAll(en.getValue());
			ope.up1().upd_cntr_chk_flg(false);
			ope.up1().del_flg(isSame(en.getKey(),"CAN") ? true : false);
		}
		protected Boolean isRePrntPo(PoHdrR hdrR) {
			List<String> list = new ArrayList<>();
			list.add(hdrR.po_no());//no
			list.add(hdrR.po_rev().toString());//rev
			list.add(hdrR.rpt_sts_typ());//区分
			
			if(_rePrntPoSet.contains(list)) {
				return true;
			}
			return false;
		}

		protected Map_Attach_Chk01_DtlR_PoHdrR<Attach_Chk01_DtlR, PoHdrR> createMap_Attach_Chk01_DtlR_PoHdrR() {
			return new Map_Attach_Chk01_DtlR_PoHdrR<Attach_Chk01_DtlR, PoHdrR>();
		}
		
		public class Map_Attach_Chk01_DtlR_PoHdrR<D extends Attach_Chk01_DtlR, S extends PoHdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Attach_Chk01_DtlR.$biz_key1, PoHdrR.$po_no);//発注ＮＯ
				addColumnPathMap(Attach_Chk01_DtlR.$dt, PoHdrR.$po_dt);//発注日
				addColumnPathMap(Attach_Chk01_DtlR.$bp_cd, PoHdrR.$sppl_cd);//発注先CD
				addColumnPathMap(Attach_Chk01_DtlR.$cur_cd, PoHdrR.$trd_cur_cd);//取引通貨ＣＤ
				addColumnPathMap(Attach_Chk01_DtlR.$purc_dpt_cd, PoHdrR.$purc_dpt_cd);//購買部門CD
				addColumnPathMap(Attach_Chk01_DtlR.$sppl_cd, PoHdrR.$sppl_cd);//発注先ＣＤ
				addColumnPathMap(Attach_Chk01_DtlR.$wrk_no, PoHdrR.$wrk_no);//案件No
				addColumnPathMap(Attach_Chk01_DtlR.$tterm_cd1, PoHdrR.$tterm_cd1);//取引条件ＣＤ1
				addColumnPathMap(Attach_Chk01_DtlR.$tterm_cd2, PoHdrR.$tterm_cd2);//取引条件ＣＤ2
				addColumnPathMap(Attach_Chk01_DtlR.$tterm_cd3, PoHdrR.$tterm_cd3);//取引条件ＣＤ3
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				dest.biz_typ(MAC_BIZ_TYP.PO.value());//業務区分：発注
				dest.biz_key2(src.po_rev().toString());//発注改定番号はNum→Str変換してセット
				dest.amt(src.ttl_amt().add(src.ttl_tax_amt()));//税込金額合計
				dest.attach_file_flg(true);//ファイル添付フラグ
			}
		}
		protected void setPoUpdData(MST_PO_R poR, PurcPrnt_Prnt01_PoR up0R, MCNumber rev) {
			MST_PO_R updPoR = MST_PO_R.create();
			updPoR.po_no(poR.po_no());
			updPoR.po_rev(poR.po_rev());
			updPoR.po_print_flg(true);
			updPoR.last_po_rev(rev);
			updPoR.po_print_dt(_prntHm);
			updPoR.upd_srv_req_no(poR.upd_srv_req_no());
			_updPoL.add(updPoR);
		}

		protected void setDlvInstUpdData(MST_DLV_INST_R dlvInstR, PurcPrnt_Prnt01_DlvInstR up1R, MCNumber rev) {
			MST_DLV_INST_R updDlvInstR = MST_DLV_INST_R.create();
			updDlvInstR.dlv_inst_no(dlvInstR.dlv_inst_no());
			updDlvInstR.dlv_inst_rev(dlvInstR.dlv_inst_rev());
			updDlvInstR.dlv_inst_print_flg(true);
			updDlvInstR.last_dlv_inst_rev(rev);
			updDlvInstR.dlv_inst_print_dt(_prntHm);
			_updDlvInstL.add(updDlvInstR);
		}

		protected void setPurcDlvSlipUpdData(PurcPrnt_Prnt01_DlvSlipR up2R) {
			MST_PURC_DLV_SLIP_R updDlvSlipR = MST_PURC_DLV_SLIP_R.create();
			updDlvSlipR.dlv_slip_mng_no(up2R.dlv_slip_mng_no());
			updDlvSlipR.dlv_slip_mng_seq(up2R.dlv_slip_mng_seq());
			updDlvSlipR.slip_prnt_flg(true);
			_updPurcDlvSlipL.add(updDlvSlipR);
		}
		
		/**
		 * 注文書のみを発行する場合の注文書発行処理
		 * @param upR
		 */
		protected void prntPoAll() {
			for (PurcPrnt_Prnt01_PoR up0R : _up0L) {
				createPoPrnt(up0R);
			}
			requestPo();
		}
		/**
		 * 納品書のみを発行する場合の納品書発行処理
		 * @param upR
		 */
		protected void prntDlvSlipAll() {
			initDbcCacheTrd();
			srchDlvSlip();
			for (PurcPrnt_Prnt01_DlvSlipR up2R : _up2L) {
				//納品書
				createDlvSlipRS(up2R);
			}
			requestDlvSlip();
			requestDlvSlipSub();
		}
		
		/**
		 * 納入指示書のみを発行する場合の納入指示書発行処理
		 * @param upR
		 */
		protected void prntDlvInstAll() {
			srchDlvInstData();
			for (PurcPrnt_Prnt01_DlvInstR up1R : _up1L) {
				//納入指示書
				createDlvInstPrnt(up1R);
			}
			requestDlvInst();
		}
		protected Map<MCNumber, PurcPrnt_Prnt01_DlvSlipR> _up4Map;
		/**
		 * 購買の納品書に対応する、仕入直送の納品書発行処理
		 */
		protected void prntPurcDdlvDlvSlip() {
			_up4Map = new HashMap<>();
			
			MSBEL_ShipRprtPrntService.ShipRprt_Prnt01 ope = MSBEL_ShipRprtPrntService.crtShipRprt_Prnt01();
			for (MST_PURC_DLV_SLIP_D_R slipR : getPurcDdlvDlvSlip()) {
				PurcPrnt_Prnt01_DlvSlipR up4R = getUp4R(slipR);
				
				ShipRprt_Prnt01_HdrR up0R = ope.up0().add();
				copy(up0R, slipR, createMap_ShipRprt_Prnt01_HdrR_MST_PURC_DLV_SLIP_D_R());
				up0R.inc_can_flg(up4R.inc_can_flg());
				
				_up4Map.put(up0R.peg_no(), up4R);
			}
			ope.up1().bndl_prnt_flg(!up3().indiv_prnt_flg());
			ope.exec();
			
			for (ShipRprt_Prnt01_HdrR downR : ope.down0()) {
				PurcPrnt_Prnt01_DlvSlipR upR = _up4Map.get(downR.peg_no());
				if (!isNull(upR)) {
					upR.err_flg(downR.err_flg());
				}
			}
		}
		protected MCList<MST_PURC_DLV_SLIP_D_R> getPurcDdlvDlvSlip() {
			MCList<PurcPrnt_Prnt01_DlvSlipR> tgtL = getChkList(up4());
			
			MST_PURC_DLV_SLIP_D_R t = MST_PURC_DLV_SLIP_D_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setDistinct();
			bldr.setSelect(
				t.dlv_slip_mng_no, t.dlv_slip_mng_seq,
				t.purc_ddlv_dlv_slip_no, t.purc_ddlv_dlv_slip_seq
			);
			bldr.setWhere(t.dlv_slip_mng_no.eq(bind("dlv_slip_mng_no")));
			bldr.addWhereWithAnd(t.dlv_slip_mng_seq.eq(bind("dlv_slip_mng_seq")));
			bldr.addConstWhereWithAnd(t.purc_ddlv_dlv_slip_no.isNotNull().and(t.purc_ddlv_dlv_slip_seq.isNotNull()));
			
			MCList<MST_PURC_DLV_SLIP_D_R> prntL = MCList.create(MST_PURC_DLV_SLIP_D_R.class);
			dbSelect(
				"MSBDL5200_MST_PURC_DLV_SLIP_D_S07",
				prntL, bldr,
				tgtL.subList(r -> isNullOr(r.purc_ddlv_dlv_slip_no(), r.purc_ddlv_dlv_slip_seq()))
			);
			
			// 仕入直送納品書ＮＯ、連番が指定されている分は別で設定する
			for (PurcPrnt_Prnt01_DlvSlipR tgtR : tgtL.distinctNE(PurcPrnt_Prnt01_DlvSlipR.$purc_ddlv_dlv_slip_no, PurcPrnt_Prnt01_DlvSlipR.$purc_ddlv_dlv_slip_seq)) {
				if (!isNullOr(tgtR.purc_ddlv_dlv_slip_no(), tgtR.purc_ddlv_dlv_slip_seq())) {
					MST_PURC_DLV_SLIP_D_R prntR = prntL.add();
					prntR.dlv_slip_mng_no(tgtR.dlv_slip_mng_no());
					prntR.dlv_slip_mng_seq(tgtR.dlv_slip_mng_seq());
					prntR.purc_ddlv_dlv_slip_no(tgtR.purc_ddlv_dlv_slip_no());
					prntR.purc_ddlv_dlv_slip_seq(tgtR.purc_ddlv_dlv_slip_seq());
				}
			}
			// 重複分を除外
			prntL.setAll(
				prntL.distinctNE(PurcPrnt_Prnt01_DlvSlipR.$purc_ddlv_dlv_slip_no, PurcPrnt_Prnt01_DlvSlipR.$purc_ddlv_dlv_slip_seq)
			);
			
			setPegNo(prntL);
			
			return prntL;
		}
		protected Map_ShipRprt_Prnt01_HdrR_MST_PURC_DLV_SLIP_D_R<ShipRprt_Prnt01_HdrR,MST_PURC_DLV_SLIP_D_R> createMap_ShipRprt_Prnt01_HdrR_MST_PURC_DLV_SLIP_D_R() {
			return new Map_ShipRprt_Prnt01_HdrR_MST_PURC_DLV_SLIP_D_R<ShipRprt_Prnt01_HdrR, MST_PURC_DLV_SLIP_D_R>();
		}
		public class Map_ShipRprt_Prnt01_HdrR_MST_PURC_DLV_SLIP_D_R<D extends ShipRprt_Prnt01_HdrR, S extends MST_PURC_DLV_SLIP_D_R> extends MCRowMapper<D,S>{
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.peg_no(src.getNumberNE("peg_no"));
				dest.dlv_slip_no(src.purc_ddlv_dlv_slip_no());
				dest.dlv_slip_seq(src.purc_ddlv_dlv_slip_seq());
				dest.dlv_slip_prnt_flg(true);
			}
		}
		protected MCIndexKey _up4Idx;
		protected PurcPrnt_Prnt01_DlvSlipR getUp4R(MST_PURC_DLV_SLIP_D_R slipR) {
			if (_up4Idx == null) {
				_up4Idx = up4().createIndex(
					PurcPrnt_Prnt01_DlvSlipR.$dlv_slip_mng_no, PurcPrnt_Prnt01_DlvSlipR.$dlv_slip_mng_seq,
					PurcPrnt_Prnt01_DlvSlipR.$purc_ddlv_dlv_slip_no, PurcPrnt_Prnt01_DlvSlipR.$purc_ddlv_dlv_slip_seq
				);
			}
			PurcPrnt_Prnt01_DlvSlipR up4R = 
				up4().getFirst(
					_up4Idx,
					slipR.dlv_slip_mng_no(), slipR.dlv_slip_mng_seq(),
					slipR.purc_ddlv_dlv_slip_no(), slipR.purc_ddlv_dlv_slip_seq());
			if (isNull(up4R)) {
				up4R = up4().getFirst(
						_up4Idx,
						slipR.dlv_slip_mng_no(), slipR.dlv_slip_mng_seq(), null, null);
			}
			return up4R;
		}
		
		protected boolean existsPo(){
			if (_poPrntMap == null) {
				return false;
			}
			int cnt = _poPrntMap.size();
			if (cnt == 0) {
				return false;
			}
			return true;
		}
		protected boolean existsDlvSlip(){
			if (_dlvSlipMap == null) {
				return false;
			}
			int cnt = _dlvSlipMap.size();
			if (cnt == 0) {
				return false;
			}
			return true;
		}

		protected boolean existsDlvSubSlip(){
			if (_dlvSlipSubMap == null) {
				return false;
			}
			int cnt = _dlvSlipSubMap.size();
			if (cnt == 0) {
				return false;
			}
			return true;
		}
		
		protected boolean existsDlvInst() {
			if (_dlvInstPrntMap == null) {
				return false;
			}
			int cnt = _dlvInstPrntMap.size();
			if (cnt == 0) {
				return false;
			}
			return true;
		}

		protected void requestPoAndDlvSlip() {
			if (isPrntPoFirst()) {
				prntPoDlvSlip();
			}
			else {
				prntPoDlvSlipAlt();
			}
		}

		/**
		 * 以下の順で注文書、納品書を発行する。<BR>
		 * １．注文書の新規発行<BR>
		 * ２．納品書<BR>
		 * ３．納品書控
		 */
		protected void prntPoDlvSlip() {
			requestPo();
			requestDlvSlip();
			requestDlvSlipSub();
		}
		
		/**
		 * 以下の順で注文書、納品書を発行する。<BR>
		 * １．注文書の発行＋納品書（注文書の新規発行のみを含む）<BR>
		 * ２．注文書のみ（新規・再発行の順）<BR>
		 * ３．納品書のみ<BR>
		 * ４．納品書控
		 */
		protected void prntPoDlvSlipAlt(){
			
			MCIndexKey up2Key = _up2L.createIndex(PurcPrnt_Prnt01_DlvSlipR.$po_no);
			//「１．」の分		
			for (Iterator<Entry<List<String>, List<MSBDR_Po>>> it = _poPrntMap.entrySet().iterator(); it.hasNext();) {
				Map.Entry<List<String>, List<MSBDR_Po>> en = (Map.Entry<List<String>, List<MSBDR_Po>>) it.next();
				// 納品書				
				if(!existsDlvSlip()){
					continue;
				}
				
				ArrayList<String> dlvSlipKeys = new ArrayList<String>();
				MCReportSet allDlvSlipRs = null;
				boolean isDlvSlipInit = false;
				List<MCReportSet> rptPoSetList = new ArrayList<>();
				List<MCReportSet> rptDlvSlipSetList = new ArrayList<>();
				boolean isPoPrnted  = false;
				boolean indivPrntFlg = false;
				if (!up3().indiv_prnt_flg()) {
					BpUtil_Sprt01_DtlR bpR = _bpUtil.getFirst(_bpUtilkey, en.getValue().get(0).getAppToCd1());
					indivPrntFlg = bpR.indiv_prnt_flg();
				}
				
				MCList<PurcPrnt_Prnt01_DlvSlipR> dlvSlipL = _up2L.subList(up2Key, en.getKey().get(0));
				for (PurcPrnt_Prnt01_DlvSlipR dlvSlipR : dlvSlipL) {
					String key = dlvSlipR.dlv_slip_mng_no() +  String.valueOf(dlvSlipR.dlv_slip_mng_seq());
					List<MSBER_DlvSlip> dlvL = _dlvSlipMap.get(key);
					if (dlvL == null) {
						continue;
					}
					if(up3().indiv_prnt_flg() || indivPrntFlg) {
						if(!isPoPrnted) {
							//注文書→納品書の順に個別発行するため、先に注文書を発行する
							MCReportSet allPoRs = null;
							for (MSBDR_Po po : en.getValue()) {
								if (allPoRs != null) {
									allPoRs.setRegister(false);
									MCServerReportManager.requestImmediate(allPoRs);
								}
								allPoRs = po.createInstance();
								allPoRs.setLocale(po.getLocale());
								allPoRs.addAll(po.getAll());
								allPoRs.addWriteListener(new FileWriteListener(rptPoSetList));
						}
						allPoRs.setRegister(false);
						MCServerReportManager.requestImmediate(allPoRs);
						isPoPrnted = true;
						}
						dlvSlipKeys.add(key);
						for (MSBER_DlvSlip dlvR : dlvL) {
							if (allDlvSlipRs != null) {
								allDlvSlipRs.setRegister(false);
								MCServerReportManager.requestImmediate(allDlvSlipRs);
							}
							allDlvSlipRs = dlvR.createInstance();
							allDlvSlipRs.setLocale(dlvR.getLocale());
							allDlvSlipRs.addAll(dlvR.getAll());
							allDlvSlipRs.addWriteListener(new FileWriteListener(rptDlvSlipSetList));
						}
						allDlvSlipRs.setRegister(false);
						MCServerReportManager.requestImmediate(allDlvSlipRs);
					}else {
						dlvSlipKeys.add(key);
						for (MSBER_DlvSlip dlvR : dlvL) {
							if (!isDlvSlipInit) {
								allDlvSlipRs = dlvR.createInstance();
								allDlvSlipRs.setReportID(dlvR.getReportID());
								isDlvSlipInit = true;
							}
							allDlvSlipRs.addAll(dlvR.getAll());
						}
					}
				}
				//添付帳票登録サービス（更新）の呼び出し
				if(!rptPoSetList.isEmpty()) {
					callPoAttachSrv(rptPoSetList);
				}
				if(!rptDlvSlipSetList.isEmpty()) {
					callDlvSlipAttachSrv(rptDlvSlipSetList);
				}
				if (allDlvSlipRs != null) {
					if(!up3().indiv_prnt_flg() && !indivPrntFlg) {
						//個別発行フラグがオフの場合はまとめて発行
						MCReportSet allPoRs = null;
						boolean isPoInit = false;
						for (MSBDR_Po po : en.getValue()) {
							if (!isPoInit) {
								allPoRs = po.createInstance();
								allPoRs.setLocale(po.getLocale());
								isPoInit = true;
							}
							allPoRs.addAll(po.getAll());
						}
						MCServerReportManager.request(allPoRs);
						MCServerReportManager.request(allDlvSlipRs);
					}
					//印刷したら削除
					it.remove();
					dlvSlipKeys.forEach(r -> _dlvSlipMap.remove(r));
				}
				allDlvSlipRs = null;
			}
			//「２．」の分
			requestPo();
			//「３．」の分
			requestDlvSlip();
			requestDlvSlipSub();

			_poPrntMap.clear();
		}
		
		/**
		 * 注文書・納品書を一括で印刷する際に、注文書→納品書の順で印刷するか。<BR>
		 * trueの場合、注文書全部→納品書全部→納品書控全部の順となる。<BR>
		 * falseの場合、発注明細ごとに注文書→納品書の順で出力し最後に納品書控をまとめて印刷する。
		 * @return
		 */
		protected boolean isPrntPoFirst(){
			//固定。カスタマイズ用。
			return true;
		}
		
		protected MSBDR_Po createPoReportSet(MST_PO_R poR) {
			MSBDR_Po repSet = MSBDR_Po.create();
			PoHdrR hdrR = createPoHdr(poR);
			String lclCd = hdrR.getStringNE("prnt_lcl_cd");
			MCList<PoDtlR> dtlL = createPoDtl(poR, lclCd);
			repSet.setLocale(toLocaleFromLclCd(lclCd));
			editPoData(hdrR, dtlL, repSet, poR);
			repSet.addRow(hdrR);
			repSet.addAll(dtlL);
			return repSet;
		}

		protected PoHdrR createPoHdr(MST_PO_R poR) {
			PoHdrR hdrR = PoHdrR.create();

			executeQuery(hdrR, MSBDL5200_MST_PO_S01(), poR);

			return hdrR;
		}

		protected MSBDR_DlvInst createDlvInstRS(MST_DLV_INST_R dlvInstR){
			MSBDR_DlvInst repSet = MSBDR_DlvInst.create();
			DlvInstHdrR hdrR = _dlvInstHdrDataL.getFirst(_dlvInstHdrDataIdxKey, dlvInstR.dlv_inst_no());
			MCList<DlvInstDtlR> dtlL = _dlvInstDtlDataL.subList(_dlvInstDtlDataIdxKey, dlvInstR.dlv_inst_no());
			repSet.setLocale(toLocaleFromLclCd(hdrR.getStringNE("prnt_lcl_cd")));
			editDlvInstData(hdrR, dtlL, repSet, dlvInstR);
			repSet.addRow(hdrR);
			repSet.addAll(dtlL);
			return repSet;
		}


		protected void createDlvSlipRS(PurcPrnt_Prnt01_DlvSlipR up2R) {
			List<MSBER_DlvSlip> repSetList;
			List<MSBER_DlvSlip> subRepSetList;

			MSBER_DlvSlip repSet = MSBER_DlvSlip.create();

			MCList<PurcPrnt_Prnt01_DlvSlipDataR> dataL = null; 
			dataL = _dlvSlipDataL.subList(_dlvSlipDataIdxkey, up2R.dlv_slip_mng_no(), up2R.dlv_slip_mng_seq());
			if (dataL.isEmpty()) {
				MCMessagePool.add(new MCMessage(up2R, null, MSBDL0167, up2R.po_no(), toDispGUIIndex(up2R)));
				up2R.setBooleanNE("err_flg", true);
				return;
			}
			if (!isNull(up2R.dlv_inst_grp_no())) {
				repSetList = _dlvSlipMap.get(up2R.dlv_inst_grp_no());
				subRepSetList = _dlvSlipSubMap.get(up2R.dlv_inst_grp_no());
			}
			else if (!isNull(up2R.prms_rcpt_grp_no())) {
				repSetList = _dlvSlipMap.get(up2R.prms_rcpt_grp_no());
				subRepSetList = _dlvSlipSubMap.get(up2R.prms_rcpt_grp_no());
			}
			else {
				repSetList = _dlvSlipMap.get(up2R.po_no());
				subRepSetList = _dlvSlipSubMap.get(up2R.po_no());
			}
			
			if (repSetList == null) {
				repSetList = new ArrayList<MSBER_DlvSlip>();
			}
			if (subRepSetList == null) {
				subRepSetList = new ArrayList<MSBER_DlvSlip>();
			}
			repSet.setReportID(getFormId(up2R.sppl_ship_form_cd()));
			// 値の編集
			editDlvSlipDtlData(dataL, repSet, up2R);
			for (PurcPrnt_Prnt01_DlvSlipDataR dataR : dataL) {
				repSet.addRow(dataR.hdr());
				repSet.addRow(dataR.dtl());
			}
			// 印刷データの登録のみ
			MCServerReportManager.request(repSet, false);
			//再発行
			MST_PURC_DLV_SLIP_R dlvSlipR = _lockDlvSlipL.getFirst(_lockDlvSlipkey, up2R.dlv_slip_mng_no(), up2R.dlv_slip_mng_seq());
			if(dlvSlipR.slip_prnt_flg()) {
				addReprntSetKey(_rePrntDlvSlipSet, repSet.getReportInfo());
			}
			repSetList.add(repSet);
			_dlvSlipMap.put(up2R.dlv_slip_mng_no() + String.valueOf(up2R.dlv_slip_mng_seq()), repSetList);

			//控えがあるフォームの場合
			String subForm = getSubFormId(up2R.sppl_ship_form_cd());
			if (!isNull(subForm)) {
				MSBER_DlvSlip subRepSet= MSBER_DlvSlip.create();
				subRepSet.addAll(repSet.getAll());
				subRepSet.setReportID(subForm);
				subRepSet.setAppReportNo1(repSet.getAppReportNo1());
				// 印刷データの登録のみ
				MCServerReportManager.request(subRepSet, false);
				subRepSetList.add(subRepSet);
				_dlvSlipSubMap.put(up2R.dlv_slip_mng_no() + String.valueOf(up2R.dlv_slip_mng_seq()), subRepSetList);
			}
			//納品伝票ヘッダ更新情報設定	
			setPurcDlvSlipUpdData(up2R);
		}
		
		/**
		 * 購買納品書ヘッダワークに上り電文の「納品伝票管理ＮＯ」「納品伝票管理連番」を登録する
		 */
		protected void insWkPurcDlvSlip() {
			// 上り電文に対応する伝票(最新の連番を持つ伝票)をワークテーブルに格納
			MCList<MST_PURC_DLV_SLIP_R> dbc = MCList.create(MST_PURC_DLV_SLIP_R.class);
			MST_PURC_DLV_SLIP_R dbc_t = MST_PURC_DLV_SLIP_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(dbc_t);
			MCList<PurcPrnt_Prnt01_DlvSlipR> cndL = _up2L.clone();
			if (!cndL.isEmpty()) {
				dbc_bldr.setOrderByAsc(dbc_t.dlv_slip_no);
				dbc_bldr.setLockTable(dbc_t.dlv_slip_no);
				dbSelectKeyForUpdate("MSBDL5200_MST_PURC_DLV_SLIP_S06", dbc, dbc_bldr.getBaseDbc(), cndL);
			}
			dbWkDelete("MSBDL5200_MSW_PURC_DLV_SLIP_D01", dbc_bldr.getBaseDbc());
			dbWkInsert("MSBDL5200_MSW_PURC_DLV_SLIP_I01", dbc, dbc_bldr.getBaseDbc());
		}
		protected void insWkDlvInst() {
			// 上り電文に対応する納入指示をワークテーブルに格納
			if (isNull(_lockDlvInstL) || _lockDlvInstL.isEmpty()) {
				return;
			}
			MST_DLV_INST_R dbc_t = MST_DLV_INST_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(dbc_t);
			dbWkDelete("MSBDL5200_MSW_DLV_INST_D01", dbc_bldr.getBaseDbc());
			dbWkInsert("MSBDL5200_MSW_DLV_INST_I01", _lockDlvInstL, dbc_bldr.getBaseDbc());
		}

		protected void editDlvSlipDtlData(MCList<PurcPrnt_Prnt01_DlvSlipDataR> dataL, MSBER_DlvSlip repSet, PurcPrnt_Prnt01_DlvSlipR up2R) {
			//一時カラム設定
			dataL.forEach(r -> {
				setTempCol(r, r.dtl());
			});
			MCList<PurcPrnt_Prnt01_DlvSlipDataR> tmpDataL;
			// 合計行数
			int lineCnt;
			MCList<DlvSlipDtlR> dtlL = MCList.create(DlvSlipDtlR.class);
			MCNumber lineNum = getFormLineNum(up2R.sppl_ship_form_cd());
			// ページ内行数
			int cnt;
			MCNumber ttlCutTaxInAmt,ttlCutTaxAmt,ttlCutTaxDscntAmt;

			dataL.sort(getDlvSlipHdrKeys());
			MCList<PurcPrnt_Prnt01_DlvSlipDataR>[] dataGrpL = dataL.groupList(getDlvSlipHdrKeys());
			for (MCList<PurcPrnt_Prnt01_DlvSlipDataR> grpL : dataGrpL) {
				int dataLSize = grpL.size();
				lineCnt = 0;
				cnt = 0;
				ttlCutTaxInAmt = null;
				ttlCutTaxAmt = null;
				ttlCutTaxDscntAmt = null;
				tmpDataL = MCList.create(PurcPrnt_Prnt01_DlvSlipDataR.class);
				for (PurcPrnt_Prnt01_DlvSlipDataR dataR : grpL) {
					lineCnt++;
					cnt++;
					DlvSlipDtlR dtlR = dataR.dtl();
					// キーに対応する発注先を保持
					_spplMap.put(up2R.dlv_slip_mng_no() + String.valueOf(up2R.dlv_slip_mng_seq()), dataR.hdr().slo_co_cd());
					
					dataR.hdr().setStringNE("purc_usr_cd", dataR.getString("purc_usr_cd"));
					dataR.hdr().setStringNE("purc_dpt_cd", dataR.getString("purc_dpt_cd"));
					dataR.hdr().setStringNE("purc_usr_nm", dataR.getString("purc_usr_nm"));
					dataR.hdr().setStringNE("purc_dpt_nm", dataR.getString("purc_dpt_nm"));
					dataR.hdr().setStringNE("outsrc_bp_prnt_lcl_cd", dataR.outsrc_bp_prnt_lcl_cd());
					
					editDlvSlipData(dataR.hdr(), dtlR, up2R, repSet);
					//明細
					//値引品の場合の符号反転
					if (dtlR.dscnt_itm_flg() && !isNull(dtlR.trd_cur_upri())) {
						dtlR.trd_cur_upri(dtlR.trd_cur_upri().negate());
						dtlR.trd_cur_amt(dtlR.trd_cur_amt().negate());
						dtlR.trd_cur_tax_amt(dtlR.trd_cur_tax_amt().negate());
						dtlR.trd_cur_tax_in_amt(dtlR.trd_cur_tax_in_amt().negate());
					}
					// 内税のマーク設定
					if (dtlR.inc_tax_flg()) {
						dtlR.t_inc_tax("1");
						dtlR.s_inc_tax_flg(MAC_STR.PRNT_INC_TAX.name(repSet.getLocale()));
					}
					if (dtlR.interim_flg()) {
						dtlR.s_interim_flg(MAC_STR.PRNT_INTERIM.name(repSet.getLocale()));
					}
					if (dtlR.getBoolean("pri_print_flg")) {
						// 集計値
						if (!isNull(dtlR.trd_cur_amt())) {
							ttlCutTaxInAmt = dtlR.trd_cur_amt().add(nvl(ttlCutTaxInAmt, MCNumber.ZERO));
						}
						if (!isNull(dtlR.trd_cur_tax_amt())) {
							ttlCutTaxAmt = dtlR.trd_cur_tax_amt().add(nvl(ttlCutTaxAmt, MCNumber.ZERO));
						}
						if (!isNull(dtlR.trd_cur_dscnt_amt())) {
							ttlCutTaxDscntAmt = dtlR.trd_cur_dscnt_amt().add(nvl(ttlCutTaxDscntAmt, MCNumber.ZERO));
						}
					}
					dtlR.ship_dlv_slip_d_no("-" + String.valueOf(dtlR.dlv_slip_d_seq()));
					tmpDataL.add(dataR);
					dtlL.add(dtlR);

					// 伝票の最終行または最後の明細の場合、集計値を同伝票の前明細に設定し、集計値の一時変数をクリアする
					if (lineCnt == dataLSize) {
						if (!isNull(tmpDataL.getFirst("pri_print_flg",toTrueStr(true)))) {
							for (PurcPrnt_Prnt01_DlvSlipDataR tmpDataR : tmpDataL) {
								tmpDataR.hdr().ttl_trd_cur_amt(ttlCutTaxInAmt);
								tmpDataR.hdr().ttl_trd_cur_tax_amt(ttlCutTaxAmt);
								tmpDataR.hdr().ttl_trd_cur_dscnt_amt(ttlCutTaxDscntAmt);
								putNumStr(repSet, tmpDataR.hdr(),
										DlvSlipHdrR.$s_ttl_trd_cur_amt,
										DlvSlipHdrR.$ttl_trd_cur_amt,
										dtlR.getNumber("amt_dec_place"));
								putNumStr(repSet, tmpDataR.hdr(),
										DlvSlipHdrR.$s_ttl_trd_cur_tax_amt,
										DlvSlipHdrR.$ttl_trd_cur_tax_amt,
										tmpDataR.getNumber("amt_dec_place"));
								putNumStr(repSet, tmpDataR.hdr(),
										DlvSlipHdrR.$s_ttl_trd_cur_dscnt_amt,
										DlvSlipHdrR.$ttl_trd_cur_dscnt_amt,
										tmpDataR.getNumber("amt_dec_place"));
							}
						}
						else {
							tmpDataL.setValueNE("hdr.trd_cur_cd", null);
							tmpDataL.setValueNE("hdr.trd_cur_nm", null);
						}

						cnt = 0;
						ttlCutTaxInAmt = null;
						ttlCutTaxAmt = null;
						ttlCutTaxDscntAmt = null;
						tmpDataL = MCList.create(PurcPrnt_Prnt01_DlvSlipDataR.class);
					}
				}
			}
			editDlvSlipDtlDataSub(dtlL, repSet);
		}


		protected String[] getDlvSlipHdrKeys() {
			PurcPrnt_Prnt01_DlvSlipDataR r = PurcPrnt_Prnt01_DlvSlipDataR.create();
			return new String[] {
					r.hdr().getRootRowColumnPath(DlvSlipHdrR.$dlv_slip_no),
					r.hdr().getRootRowColumnPath(DlvSlipHdrR.$dlv_slip_seq),
					r.hdr().getRootRowColumnPath(DlvSlipHdrR.$dlv_slip_rev),
					r.hdr().getRootRowColumnPath(DlvSlipHdrR.$dlv_id_typ),
					r.hdr().getRootRowColumnPath(DlvSlipHdrR.$dlv_id_nm),
					r.hdr().getRootRowColumnPath(DlvSlipHdrR.$dlv_id_cd),
					r.hdr().getRootRowColumnPath(DlvSlipHdrR.$dlv_zip_cd),
					r.hdr().getRootRowColumnPath(DlvSlipHdrR.$dlv_addr1),
					r.hdr().getRootRowColumnPath(DlvSlipHdrR.$dlv_addr2),
					r.hdr().getRootRowColumnPath(DlvSlipHdrR.$dlv_addr3),
					r.hdr().getRootRowColumnPath(DlvSlipHdrR.$dlv_addr4),
					r.hdr().getRootRowColumnPath(DlvSlipHdrR.$dlv_addr),
					r.hdr().getRootRowColumnPath(DlvSlipHdrR.$dlv_tel),
					r.hdr().getRootRowColumnPath(DlvSlipHdrR.$dlv_fax),
					r.hdr().getRootRowColumnPath(DlvSlipHdrR.$dlv_cntct_dpt),
					r.hdr().getRootRowColumnPath(DlvSlipHdrR.$dlv_cntct_psn),
					r.hdr().getRootRowColumnPath(DlvSlipHdrR.$ship_dt),
					r.hdr().getRootRowColumnPath(DlvSlipHdrR.$ship_tm), 
					r.hdr().getRootRowColumnPath(DlvSlipHdrR.$dlv_dt),
					r.hdr().getRootRowColumnPath(DlvSlipHdrR.$dlv_tm)
			};
			
		}

		MCList<PurcPrnt_Prnt01_DlvSlipDataR> _dlvSlipDataL;
		MCIndexKey _dlvSlipDataIdxkey;
		MCIndexKey _dlvSlipDataIdxkeyDlvSlipNo;
		protected void srchDlvSlip() {
			_dlvSlipDataL = MCList.create(PurcPrnt_Prnt01_DlvSlipDataR.class);
			_dlvSlipDataL.addStringColumn("dlv_slip_mng_no");
			_dlvSlipDataL.addNumberColumn("dlv_slip_mng_seq");
			// 添付ファイル情報に設定するための通貨CD。
			// 購買納品伝票ヘッダの取引通貨CDを取得してtrd_cur_cdに設定しているが、無償受給やVMIの取引では後続の処理でクリアされる。
			// そのため、添付ファイル情報に設定する際、どの取引でも通貨が取得できるように別の名称で保持しておく。
			_dlvSlipDataL.addStringColumn("cur_cd_for_attach");
			MCRow bindR = MCRow.create();
			bindR.addDateColumn("dt", getToday());
			executeQuery(_dlvSlipDataL, MSBDL5200_MST_PURC_DLV_SLIP_D_S01(), bindR);
			replaceDataForProv();
			_dlvSlipDataIdxkey = _dlvSlipDataL.createIndex("dlv_slip_mng_no", "dlv_slip_mng_seq");
			_dlvSlipDataIdxkeyDlvSlipNo = _dlvSlipDataL.createIndex("hdr.dlv_slip_no", "hdr.dlv_slip_seq");
	}
		
		protected void replaceDataForProv() {
			for (PurcPrnt_Prnt01_DlvSlipDataR dlvSlipDataR : _dlvSlipDataL) {
				if (dlvSlipDataR.outsrc_prov_ddlv_flg()) {
					dlvSlipDataR.hdr().po_co_nm(dlvSlipDataR.prov_hdr().po_co_nm());
					dlvSlipDataR.hdr().po_co_alt_nm1(dlvSlipDataR.prov_hdr().po_co_alt_nm1());
					dlvSlipDataR.hdr().po_co_alt_nm2(dlvSlipDataR.prov_hdr().po_co_alt_nm2());
					dlvSlipDataR.hdr().po_co_alt_nm3(dlvSlipDataR.prov_hdr().po_co_alt_nm3());
					dlvSlipDataR.hdr().po_co_alt_nm4(dlvSlipDataR.prov_hdr().po_co_alt_nm4());
					dlvSlipDataR.hdr().slo_co_cntry_nm(dlvSlipDataR.prov_hdr().slo_co_cntry_nm());
					dlvSlipDataR.hdr().po_co_cntry_nm(dlvSlipDataR.prov_hdr().po_co_cntry_nm());
					dlvSlipDataR.hdr().dlv_cntry_nm(dlvSlipDataR.prov_hdr().dlv_cntry_nm());
					dlvSlipDataR.hdr().slo_co_nm(dlvSlipDataR.prov_hdr().slo_co_nm());
					dlvSlipDataR.hdr().slo_co_alt_nm1(dlvSlipDataR.prov_hdr().slo_co_alt_nm1());
					dlvSlipDataR.hdr().slo_co_alt_nm2(dlvSlipDataR.prov_hdr().slo_co_alt_nm2());
					dlvSlipDataR.hdr().slo_co_alt_nm3(dlvSlipDataR.prov_hdr().slo_co_alt_nm3());
					dlvSlipDataR.hdr().slo_co_alt_nm4(dlvSlipDataR.prov_hdr().slo_co_alt_nm4());
					dlvSlipDataR.hdr().dpt_nm(dlvSlipDataR.prov_hdr().dpt_nm());
					dlvSlipDataR.hdr().usr_nm(dlvSlipDataR.prov_hdr().usr_nm());
					
					if (!dlvSlipDataR.outsrc_sundry_itm_flg()) {
						dlvSlipDataR.dtl().dlv_slip_itm_nm(dlvSlipDataR.prov_dtl().dlv_slip_itm_nm());
					}
					dlvSlipDataR.dtl().dlv_slip_itm_alt_nm1(dlvSlipDataR.prov_dtl().dlv_slip_itm_alt_nm1());
					dlvSlipDataR.dtl().dlv_slip_itm_alt_nm2(dlvSlipDataR.prov_dtl().dlv_slip_itm_alt_nm2());
					dlvSlipDataR.dtl().dlv_slip_itm_alt_nm3(dlvSlipDataR.prov_dtl().dlv_slip_itm_alt_nm3());
					dlvSlipDataR.dtl().dlv_slip_itm_alt_nm4(dlvSlipDataR.prov_dtl().dlv_slip_itm_alt_nm4());
					dlvSlipDataR.dtl().tax_nm(dlvSlipDataR.prov_dtl().tax_nm());
					dlvSlipDataR.dtl().slo_po_unit_nm(dlvSlipDataR.prov_dtl().slo_po_unit_nm());
					dlvSlipDataR.dtl().dlv_inst_unit_nm(dlvSlipDataR.prov_dtl().dlv_inst_unit_nm());
					dlvSlipDataR.dtl().trd_unit_nm(dlvSlipDataR.prov_dtl().trd_unit_nm());
					dlvSlipDataR.dtl().base_unit_nm(dlvSlipDataR.prov_dtl().base_unit_nm());
					
					dlvSlipDataR.setStringNE("purc_dpt_nm", dlvSlipDataR.prov_hdr().dpt_nm());
					dlvSlipDataR.setStringNE("purc_usr_nm", dlvSlipDataR.prov_hdr().usr_nm());
				}
			}
		}
		
		MCList<DlvInstHdrR> _dlvInstHdrDataL;
		MCList<DlvInstDtlR> _dlvInstDtlDataL;
		MCIndexKey _dlvInstHdrDataIdxKey;
		MCIndexKey _dlvInstDtlDataIdxKey;
		protected void srchDlvInstData() {
			_dlvInstDtlDataL = MCList.create(DlvInstDtlR.class);
			_dlvInstHdrDataL = MCList.create(DlvInstHdrR.class);
			executeQuery(_dlvInstHdrDataL, MSBDL5200_MST_DLV_INST_S01());
			_dlvInstHdrDataIdxKey = _dlvInstHdrDataL.createIndex("dlv_inst_no");
			executeQuery(_dlvInstDtlDataL, MSBDL5200_MST_DLV_INST_D_S01());
			_dlvInstDtlDataIdxKey = _dlvInstDtlDataL.createIndex("dlv_inst_no");
		}

		protected void setPoRptStsTyp(PoHdrR hdrR, MST_PO_R poR) {
			if (isCrtPo(poR)) {
				// ＥＤＩから注文書の運用に切り替えた場合の対応
				// 訂正データの帳票ステータス区分に「訂正」が印字されるようにする
				if (isSame(poR.po_rev(), MCNumber.ONE)) {
					hdrR.rpt_sts_typ(MAC_RPT_STS_TYP.CRT.value());
				}
				else {
					hdrR.rpt_sts_typ(MAC_RPT_STS_TYP.COR.value());
				}
			}
			else if (isUpdPo(poR)) {
				hdrR.rpt_sts_typ(MAC_RPT_STS_TYP.COR.value());
			}
			else if (isCanPo(poR)) {
				hdrR.rpt_sts_typ(MAC_RPT_STS_TYP.CAN.value());
			}

		}

		protected void setDlvInstRptStsTyp(DlvInstHdrR hdrR, MST_DLV_INST_R dlvInstR) {
			if (isCrtDlvInst(dlvInstR)) {
				hdrR.rpt_sts_typ(MAC_RPT_STS_TYP.CRT.value());
			}
			else if (isUpdDlvInst(dlvInstR)) {
				hdrR.rpt_sts_typ(MAC_RPT_STS_TYP.COR.value());
			}
			else if (isCanDlvInst(dlvInstR)) {
				hdrR.rpt_sts_typ(MAC_RPT_STS_TYP.CAN.value());
			}
		}
		
		/**
		 * 個別発行取得の呼び出し
		 */
		protected void getIndivPrnt() {
			// 各帳票のNOから発注先を検索→発注先を個別発行処理に連携→フラグ取得
			MCList<PurcPrnt_Prnt01_PoR> up0L = MCList.create(PurcPrnt_Prnt01_PoR.class);
			MCList<PurcPrnt_Prnt01_DlvInstR> up1L = MCList.create(PurcPrnt_Prnt01_DlvInstR.class);
			up0L.addAll(_up0L);
			up1L.addAll(_up1L);
			
			// 発注NOから取得
			MCList<MST_PO_R> poL = MCList.create(MST_PO_R.class);
			MST_PO_R t = MST_PO_R.create("T");
			MCQueryApiBuilder poL_bldr = MCQueryApiBuilder.create(t);
			poL_bldr.setSelect(t.sppl_cd);
			poL_bldr.setWhere(t.po_no.eq(bind("po_no")));
			dbSelect("MSBDL5200_MST_PO_S02", poL, poL_bldr, up0L);
			
			// 納入指示ＮＯから取得
			MCList<MST_PO_R> poL2 = MCList.create(MST_PO_R.class);
			MST_PO_D_R t1 = MST_PO_D_R.create("T1");
			MST_DLV_INST_R t2 = MST_DLV_INST_R.create("T2");
			MSW_DLV_INST_KEY_R w1 = MSW_DLV_INST_KEY_R.create("W1");
			MCQueryApiBuilder dlvInstL_bldr = MCQueryApiBuilder.create(t);
			dlvInstL_bldr.setSelect(t.sppl_cd);
			dlvInstL_bldr.addInnerJoin(t1, t.po_no.eq(t1.po_no));
			dlvInstL_bldr.addInnerJoin(t2, t1.po_d_no.eq(t2.po_d_no));
			dlvInstL_bldr.addInnerJoin(w1, w1.dlv_inst_no.eq(t2.dlv_inst_no));
			dbSelect("MSBDL5200_MST_DLV_INST_S03", poL2, dlvInstL_bldr);
			poL.addAll(poL2);
			
			// 購買納品伝票ヘッダワークから取得
			MCList<MST_PO_R> poL3 = MCList.create(MST_PO_R.class);
			MST_PURC_DLV_SLIP_R t3 = MST_PURC_DLV_SLIP_R.create("T1");
			MSW_PURC_DLV_SLIP_KEY_R w2 = MSW_PURC_DLV_SLIP_KEY_R.create("W2");
			MCQueryApiBuilder purcDlvSlipL_bldr = MCQueryApiBuilder.create(t3);
			purcDlvSlipL_bldr.setSelect(t3.bp_cd.as("sppl_cd"));
			purcDlvSlipL_bldr.addInnerJoin(w2, w2.dlv_slip_mng_no.eq(t3.dlv_slip_mng_no).and(w2.dlv_slip_mng_seq.eq(t3.dlv_slip_mng_seq)));
			dbSelect("MSBDL5200_MST_PURC_DLV_SLIP_S07", poL3, purcDlvSlipL_bldr);
			poL.addAll(poL3);
			
			MSUCL_BpUtil.BpUtil_Sprt01 ope = MSUCL_BpUtil.crtBpUtil_Sprt01();
			ope.up0().bp_typ(MAC_BP_IS_SRCH_TYP.SPPL.value());
			for (MST_PO_R poR : poL.groupBy(MST_PO_R.$sppl_cd)) {
				BpUtil_Sprt01_DtlR dtlR = BpUtil_Sprt01_DtlR.create();
				dtlR.bp_cd(poR.sppl_cd());
				ope.up1().add(dtlR);
			}
			ope.exec();
			
			_bpUtil = ope.down0();
			_bpUtilkey = _bpUtil.createIndex(BpUtil_Sprt01_DtlR.$bp_cd);
		}
		
		/**
		 * 注文書ソート
		 * @param map
		 * @return
		 */
		protected Map<String, List<MSBDR_Po>> poMapSort(Map<String, List<MSBDR_Po>> map) {
			// 注文書ReportSetマップソート（発注先順）
			List<Entry<String, List<MSBDR_Po>>> entries = new ArrayList<Entry<String, List<MSBDR_Po>>>(map.entrySet());
			Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));

			LinkedHashMap<String, List<MSBDR_Po>> result = new LinkedHashMap<>();
			for (Map.Entry<String, List<MSBDR_Po>> entry : entries) {
				result.put(entry.getKey(), entry.getValue());
			}

			return result;
		}
		
		/**
		 * 納品書ソート
		 * @param map
		 * @return
		 */
		protected Map<String, List<MSBER_DlvSlip>> dlvSlipMapSort(Map<String, List<MSBER_DlvSlip>> map) {
			// 納品書ReportSetマップソート（発注者ＣＤ順）
			List<Entry<String, List<MSBER_DlvSlip>>> entries = new ArrayList<Entry<String, List<MSBER_DlvSlip>>>(map.entrySet());
			Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));

			LinkedHashMap<String, List<MSBER_DlvSlip>> result = new LinkedHashMap<>();
			for (Map.Entry<String, List<MSBER_DlvSlip>> entry : entries) {
				result.put(entry.getKey(), entry.getValue());
			}

			return result;
		}
		
		/**
		 * 納入指示書ソート
		 * @param map
		 * @return
		 */
		protected Map<String, List<MSBDR_DlvInst>> dlvInstMapSort(Map<String, List<MSBDR_DlvInst>> map) {
			// 納入指示書ReportSetマップソート（発注者ＣＤ順）
			List<Entry<String, List<MSBDR_DlvInst>>> entries = new ArrayList<Entry<String, List<MSBDR_DlvInst>>>(map.entrySet());
			Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));

			LinkedHashMap<String, List<MSBDR_DlvInst>> result = new LinkedHashMap<>();
			for (Map.Entry<String, List<MSBDR_DlvInst>> entry : entries) {
				result.put(entry.getKey(), entry.getValue());
			}

			return result;
		}
		
		/**
		 * 納品書の発行
		 */
		protected void prntDlvSlip(Map<String, List<MSBER_DlvSlip>> dlvSlipMap) {
			// 発注先ごとにMapを作成
			Map<String, List<MSBER_DlvSlip>> spplMap = new LinkedHashMap<String, List<MSBER_DlvSlip>>();
			for (Map.Entry<String, List<MSBER_DlvSlip>> en : dlvSlipMap.entrySet()) {
				boolean isInit = false;
				List<MSBER_DlvSlip> lst = null;
				for (MSBER_DlvSlip s : en.getValue()) {
					if (!isInit) {
						lst = spplMap.get(_spplMap.get(en.getKey()));
						if (lst == null) {
							lst = new ArrayList<MSBER_DlvSlip>();
							spplMap.put(_spplMap.get(en.getKey()), lst);
						}
						isInit = true;
					}
					lst.add(s);
				}
			}
			
			// ソート処理
			spplMap = dlvSlipMapSort(spplMap);
			List<MCReportSet> rptSetList = new ArrayList<>();
			
			for (Map.Entry<String, List<MSBER_DlvSlip>> en : spplMap.entrySet()) {
				MCReportSet allRs = null;
				boolean isDlvInit = false;
				boolean indivPrntFlg = false;
				
				if (!up3().indiv_prnt_flg()) {
					BpUtil_Sprt01_DtlR bpR = _bpUtil.getFirst(_bpUtilkey, en.getKey());
					indivPrntFlg = bpR.indiv_prnt_flg();
				}
				
				if (up3().indiv_prnt_flg() || indivPrntFlg) {
					// 個別発行
					for (MSBER_DlvSlip s : en.getValue()) {
						if (allRs != null) {
								allRs.setRegister(false);
								MCServerReportManager.requestImmediate(allRs);
							}
							allRs = s.createInstance();
							allRs.setReportID(s.getReportID());
							allRs.setLocale(s.getLocale());
							allRs.addAll(s.getAll());
							allRs.addWriteListener(new FileWriteListener(rptSetList));
					}
					allRs.setRegister(false);
					MCServerReportManager.requestImmediate(allRs);
				}
				else {
					// まとめ発行
					for (MSBER_DlvSlip s : en.getValue()) {
						if (!isDlvInit) {
							allRs = s.createInstance();
							allRs.setReportID(s.getReportID());
							allRs.setLocale(s.getLocale());
							isDlvInit = true;
						}
						allRs.addAll(s.getAll());
					}
					allRs.setRegister(false);
					MCServerReportManager.request(allRs);
				}
			}
			//添付帳票登録サービス（更新）の呼び出し
			if(!rptSetList.isEmpty()) {
				callDlvSlipAttachSrv(rptSetList);
			}
		}
		
		protected void callDlvSlipAttachSrv(List<MCReportSet> rsList) {
			
			Map<String, List<Attach_Chk01_DtlR>> up0Map = new LinkedHashMap<String, List<Attach_Chk01_DtlR>>();
			createDlvSlipAttachMap(rsList, up0Map);
			
			if(up0Map.isEmpty()) {
				return;
			}
			
			//取消とそれ以外に分けてサービスを呼び出す
			for (Map.Entry<String, List<Attach_Chk01_DtlR>> en : up0Map.entrySet()) {
				MBBCL_AttachService.Attach_Upd01 ope = MBBCL_AttachService.crtAttach_Upd01();
				setDlvSlipAttachUp(ope,en);
				ope.exec();
			}
		}
		protected void createDlvSlipAttachMap(List<MCReportSet> rsList, Map<String, List<Attach_Chk01_DtlR>> map) {
			for(MCReportSet rs: rsList) {
				//reportSetから、ヘッダを取得する
				String bt = rs.getBlockType(DlvSlipHdrR.create());
				
				@SuppressWarnings("unchecked")
				MCList<MCRow> hdrL = rs.getAll(bt);

				if (hdrL == null || hdrL.isEmpty()) {
					return;
				}
				
				DlvSlipHdrR hdrR = (DlvSlipHdrR) hdrL.get(0);
				
				//再発行も登録対象外
				if(isRePrntDlvSlip(hdrR)) {
					continue;
				}
				editDlvSlipAttachMap(rs,hdrR,map);
			}
		}
		protected void editDlvSlipAttachMap(MCReportSet rs, DlvSlipHdrR hdrR,Map<String, List<Attach_Chk01_DtlR>> map) {
			Attach_Chk01_DtlR up0 = Attach_Chk01_DtlR.create();
			copy(up0, hdrR, createMap_Attach_Chk01_DtlR_DlvSlipHdrR());
			//WG
			up0.wg_cd(getWgCd(hdrR.dpt_cd(), hdrR.dlv_rqst_dt()));
			//帳票ID
			up0.report_id(rs.getReportInfo().report_id());
			//添付元ファイル(バイナリ）
			up0.file_bin(rs.getReportInfo().save_file_bin());
			
			List<Attach_Chk01_DtlR> l = map.get(MAC_RPT_STS_TYP.isCAN(hdrR.slip_sts_typ()) ? "CAN": "OTHER"); 
			if(null == l) {
				l = new ArrayList<Attach_Chk01_DtlR>(Arrays.asList(new Attach_Chk01_DtlR[]{up0}));
			}else {
				l.add(up0);
			}
			if(MAC_RPT_STS_TYP.isCAN(hdrR.slip_sts_typ())) {
				map.put("CAN",l);
			}else {
				map.put("OTHER", l);
			}
		}
		protected void setDlvSlipAttachUp(MBBCL_AttachService.Attach_Upd01 ope,Map.Entry<String, List<Attach_Chk01_DtlR>> en) {
			ope.up0().addAll(en.getValue());
			ope.up1().upd_cntr_chk_flg(false);
			ope.up1().del_flg(isSame(en.getKey(),"CAN") ? true : false);
		}
		protected Boolean isRePrntDlvSlip(DlvSlipHdrR hdrR) {
			List<String> list = new ArrayList<>();
			list.add(hdrR.dlv_slip_no());//no
			list.add(hdrR.dlv_slip_rev().toString());//rev
			list.add(hdrR.slip_sts_typ());//区分
			
			if(_rePrntDlvSlipSet.contains(list)) {
				return true;
			}
			return false;
		}
		
		protected Map_Attach_Chk01_DtlR_DlvSlipHdrR<Attach_Chk01_DtlR, DlvSlipHdrR> createMap_Attach_Chk01_DtlR_DlvSlipHdrR() {
			return new Map_Attach_Chk01_DtlR_DlvSlipHdrR<Attach_Chk01_DtlR, DlvSlipHdrR>();
		}
		
		public class Map_Attach_Chk01_DtlR_DlvSlipHdrR<D extends Attach_Chk01_DtlR, S extends DlvSlipHdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Attach_Chk01_DtlR.$biz_key1, DlvSlipHdrR.$dlv_slip_no);//納品書ＮＯ
				addColumnPathMap(Attach_Chk01_DtlR.$dt, DlvSlipHdrR.$dlv_rqst_dt);//納入希望日時
				addColumnPathMap(Attach_Chk01_DtlR.$bp_cd, DlvSlipHdrR.$slo_co_cd);//受注者ＣＤ
				addColumnPathMap(Attach_Chk01_DtlR.$cur_cd, DlvSlipHdrR.$trd_cur_cd);//取引通貨ＣＤ
				addColumnPathMap(Attach_Chk01_DtlR.$purc_dpt_cd, DlvSlipHdrR.$dpt_cd);//購買部門CD
				addColumnPathMap(Attach_Chk01_DtlR.$sppl_cd, DlvSlipHdrR.$slo_co_cd);//発注先ＣＤ
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				PurcPrnt_Prnt01_DlvSlipDataR dlvSlipR = _dlvSlipDataL.getFirst(_dlvSlipDataIdxkeyDlvSlipNo, src.dlv_slip_no(), src.dlv_slip_seq());
				if (!isNull(dlvSlipR)) {
					dest.cur_cd(dlvSlipR.getStringNE("cur_cd_for_attach"));
				}
				dest.biz_typ(MAC_BIZ_TYP.DLV_SLIP_PURC.value());//業務区分：納品書（購買）
				dest.biz_key2(src.dlv_slip_rev().toString());//納品書リビジョンはNum→Str変換してセット
				dest.amt(nvl(src.ttl_trd_cur_amt(), MCNumber.ZERO).add(nvl(src.ttl_trd_cur_tax_amt(), MCNumber.ZERO)));//税込金額合計
				dest.attach_file_flg(true);//ファイル添付フラグ
				
				if (src.prov_flg()) {
					dest.bp_cd(src.po_co_cd());
				}
			}
		}

		protected void  editDlvSlipDtlDataSub(MCList<DlvSlipDtlR> dtlL, MSBER_DlvSlip repSet){
			putPrntItmSub1(dtlL, DlvSlipDtlR.$itm_sub1_view, DlvSlipDtlR.$itm_sub1_data);
			putPrntItmSub2(dtlL, DlvSlipDtlR.$itm_sub2_view, DlvSlipDtlR.$itm_sub2_data);
			putPrntItmSub3(dtlL, DlvSlipDtlR.$itm_sub3_view, DlvSlipDtlR.$itm_sub3_data);
			putPrntStr(dtlL, DlvSlipDtlR.$lot_no_view, DlvSlipDtlR.$lot_no_data);
			putPrntStr(dtlL, DlvSlipDtlR.$sublot_no_view, DlvSlipDtlR.$sublot_no_data);
			setRowNumStr(dtlL, repSet);
		}
		
		protected void editDlvSlipData(DlvSlipHdrR hdrR, DlvSlipDtlR dtlR, PurcPrnt_Prnt01_DlvSlipR up2R, MSBER_DlvSlip repSet){
			
			//ヘッダ
			hdrR.print_hm(_prntHm);
			//発注番号
			hdrR.eiaj_dlv_slip_po_no(up2R.po_no());
			//バーコード
			hdrR.eiaj_b_slo_po_qty(dtlR.slo_po_qty());
			putNumStr(repSet, hdrR, DlvSlipHdrR.$s_eiaj_b_slo_po_qty, DlvSlipHdrR.$eiaj_b_slo_po_qty,  dtlR.getNumber("slo_po_unit_dec_place"));
			hdrR.b_eiaj1(MSC_EIAJ_DLV_SLIP_STR.BAR_ST_END_BIT.name() + MSC_EIAJ_DLV_SLIP_STR.BAR_ID_Z.name() + hdrR.dlv_slip_no()
					+ MSC_EIAJ_DLV_SLIP_STR.BAR_ST_END_BIT.name());
			String qty = hdrR.s_eiaj_b_slo_po_qty().length() > 13 ? hdrR.s_eiaj_b_slo_po_qty().substring(0, 13) : hdrR.s_eiaj_b_slo_po_qty();
			hdrR.b_eiaj2(MSC_EIAJ_DLV_SLIP_STR.BAR_ST_END_BIT.name() + MSC_EIAJ_DLV_SLIP_STR.BAR_ID_3N.name()
					+ MSC_EIAJ_DLV_SLIP_STR.BAR_LINE_TYP3.name() + hdrR.dlv_slip_no() + SP + qty + SP + MSC_EIAJ_DLV_SLIP_STR.BAR_ST_END_BIT.name());
			String itmCd = dtlR.dlv_slip_itm_cd().length() > 25 ? dtlR.dlv_slip_itm_cd().substring(0, 13) : dtlR.dlv_slip_itm_cd();
			hdrR.b_eiaj3(MSC_EIAJ_DLV_SLIP_STR.BAR_ST_END_BIT.name() + MSC_EIAJ_DLV_SLIP_STR.BAR_ID_3N.name()
					+ MSC_EIAJ_DLV_SLIP_STR.BAR_LINE_TYP4.name() + itmCd + SP + SP + MSC_EIAJ_DLV_SLIP_STR.BAR_ST_END_BIT.name());
			String dt = hdrR.dlv_rqst_dt().toString("yyyyMMddHHmm");
			hdrR.b_eiaj4(MSC_EIAJ_DLV_SLIP_STR.BAR_ST_END_BIT.name() + MSC_EIAJ_DLV_SLIP_STR.BAR_ID_3N.name()
					+ MSC_EIAJ_DLV_SLIP_STR.BAR_LINE_TYP5.name() + dt + SP + MSC_EIAJ_DLV_SLIP_STR.BAR_ST_END_BIT.name());
			String useLocaleCd = null;
			if (dtlR.getBooleanNE("prov_ddlv_flg")) {
				useLocaleCd = hdrR.getStringNE("outsrc_bp_prnt_lcl_cd");
				String defTrd = MAUCL_TrdUtil.getDefaultTrdCd(MAC_TRD_PTN_TYP.PROV.value());
				if (!isNull(defTrd)) {
					hdrR.trd_cd(defTrd);
				}
				hdrR.slo_co_cd(getCo().co_cd());
				hdrR.slo_co_nm(getCoNm(useLocaleCd));
				hdrR.prov_flg(true);
				if (isNull(hdrR.dlv_cntct_psn_title())) {
					hdrR.dlv_cntct_psn_title(
						isNull(hdrR.dlv_cntct_psn()) ? 
							MSC_DLV_SLIP_STR.DEAR1.name(toLocaleFromLclCd(useLocaleCd))
							: MSC_DLV_SLIP_STR.DEAR2.name(toLocaleFromLclCd(useLocaleCd)));
				}
			}
			else {
				useLocaleCd = getUsrLclCd();
				hdrR.po_co_cd(getCo().co_cd());
				hdrR.po_co_nm(nvl(getCoNm(useLocaleCd), getCo().co_nm()));
				hdrR.dlv_cntct_psn_title(MSC_DLV_SLIP_STR.DEAR3.name(toLocaleFromLclCd(useLocaleCd)));
			}
			hdrR.trd_nm(getCacheTrdNm(hdrR.trd_cd(), useLocaleCd));
			repSet.setLocale(toLocaleFromLclCd(useLocaleCd));

			hdrR.slo_co_addr(concatAddress(hdrR.slo_co_addr1(), hdrR.slo_co_addr2(), hdrR.slo_co_addr3(), hdrR.slo_co_addr4()));
			hdrR.po_co_addr(concatAddress(hdrR.po_co_addr1(), hdrR.po_co_addr2(), hdrR.po_co_addr3(), hdrR.po_co_addr4()));
			hdrR.dlv_addr(concatAddress(hdrR.dlv_addr(), hdrR.dlv_addr2(), hdrR.dlv_addr3(), hdrR.dlv_addr4()));
			hdrR.ship_tm(setTm(hdrR.ship_tm()));
			hdrR.dlv_tm(setTm(hdrR.dlv_tm()));
			hdrR.dlv_rqst_tm(setTm(hdrR.dlv_rqst_tm()));
			
			// 標準納品書、標準納品書（控）のときのみの処理
			if (isSame(repSet.getReportID(), "MSBER0500")
					|| isSame(repSet.getReportID(), "MSBER0510")) {
				hdrR.ship_dt_lbl(MSC_DLV_SLIP_STR.DLV_DT.name(repSet.getLocale()));
				hdrR.ship_dt(hdrR.dlv_dt());
				hdrR.dlv_dt(null);
			}
			
			hdrR.dlv_lbl(MSC_DLV_SLIP_STR.DLV.name(repSet.getLocale()));
			// タイトル
			String title = MAC_TRD_PTN_TYP.slip_title_typ(hdrR.trd_ptn_typ());
			// 支給直送の場合は取引に関わらず「支給書」にする
			if (hdrR.prov_flg()) {
				hdrR.formtitle(MAC_SLIP_TITLE_TYP.PROV_SLIP.name(repSet.getLocale()));
			}
			else if (isNull(title)) {
				hdrR.formtitle(MAC_SLIP_TITLE_TYP.DLV_SLIP.name(repSet.getLocale()));
			}
			else {
				hdrR.formtitle(MAC_SLIP_TITLE_TYP.get(title).name(repSet.getLocale()));
			}
			// 取消伝票の場合、「取消」を表示し、訂正伝票の場合は「訂正」を表示する。
			if (MAC_SLIP_STS_TYP.isCAN(hdrR.slip_sts_typ())) {
				hdrR.slip_sts_typ_nm(MSC_DLV_SLIP_STR.CAN.name(repSet.getLocale()));
			}
			else if (hdrR.dlv_slip_rev().gt(1)){
				hdrR.slip_sts_typ_nm(MSC_DLV_SLIP_STR.UPD.name(repSet.getLocale()));
			}
			setDlvSlipBisInfo(hdrR, dtlR, repSet);
			//下り電文に設定する為
			up2R.dlv_slip_no(hdrR.dlv_slip_no());
			up2R.dlv_slip_seq(hdrR.dlv_slip_seq());
			up2R.dlv_slip_rev(hdrR.dlv_slip_rev());
		}
		
		protected FXUCL_MCFuncCache<String> _CoNmCache;
		protected String getCoNm(String lclCd) {
			if (_CoNmCache == null) {
					_CoNmCache = new FXUCL_MCFuncCache<>(in -> {
					return FCPA_CO$F_GET_CO_NM1(value((String) in[0]));
				});
			}
			return _CoNmCache.get(lclCd);
		}
		protected FXUCL_MCDbcCache<MAM_TRD_R> _cacheTrd;
		protected FXUCL_MCDbcCache<MAM_TRD_LCL_R> _cacheTrdLcl;
		protected void initDbcCacheTrd() {
			MAM_TRD_R t1 = MAM_TRD_R.create("T");
			MCQueryApiBuilder t1Bldr = MCQueryApiBuilder.create(t1);
			t1Bldr.setSelect(
				t1.trd_cd,
				t1.trd_nm
			);
			_cacheTrd = new FXUCL_MCDbcCache<MAM_TRD_R>(t1Bldr);
			
			MAM_TRD_LCL_R t2 = MAM_TRD_LCL_R.create("T");
			MCQueryApiBuilder t2Bldr = MCQueryApiBuilder.create(t2);
			t2Bldr.setSelect(
				t2.trd_cd,
				t2.trd_nm,
				t2.lcl_cd
			);
			_cacheTrdLcl = new FXUCL_MCDbcCache<MAM_TRD_LCL_R>(t2Bldr);
		}
		protected String getCacheTrdNm(String trdCd, String lclCd) {
			MAM_TRD_LCL_R dbc = _cacheTrdLcl.get(trdCd, lclCd);
			if ( !(isNull(dbc) || dbc.isEmpty()) ) {
				MAM_TRD_R r = MAM_TRD_R.create();
				r.setValuesByName(dbc);
				return r.trd_nm();
			}
			return _cacheTrd.get(trdCd).trd_nm();
		}
		
		protected void setTempCol(PurcPrnt_Prnt01_DlvSlipDataR dataR, DlvSlipDtlR dtlR){
			dtlR.addNumberColumn("trd_unit_dec_place", dataR.getNumberNE("trd_unit_dec_place"));
			dtlR.addNumberColumn("base_unit_dec_place", dataR.getNumberNE("base_unit_dec_place"));
			dtlR.addNumberColumn("amt_dec_place", dataR.getNumberNE("amt_dec_place"));
			dtlR.addNumberColumn("upri_dec_place", dataR.getNumberNE("upri_dec_place"));
			dtlR.addNumberColumn("slo_po_unit_dec_place", dataR.getNumberNE("slo_po_unit_dec_place"));
			dtlR.addNumberColumn("dlv_inst_unit_dec_place", dataR.getNumberNE("dlv_inst_unit_dec_place"));
			dtlR.addBooleanColumn("pri_print_flg", MCBooleanUtil.dbStringToBoolean(dataR.getStringNE("pri_print_flg")));
			dtlR.addBooleanColumn("prov_ddlv_flg", MCBooleanUtil.dbStringToBoolean(dataR.getStringNE("prov_ddlv_flg")));
			dtlR.addBooleanColumn("prov_inc_tax_flg", MCBooleanUtil.dbStringToBoolean(dataR.getStringNE("prov_inc_tax_flg")));
			dtlR.addStringColumn("prov_tax_rnd_typ", dataR.getStringNE("prov_tax_rnd_typ"));
			dtlR.addStringColumn("prov_amt_rnd_typ", dataR.getStringNE("prov_amt_rnd_typ"));
			dtlR.addBooleanColumn("purc_ddlv_flg", MCBooleanUtil.dbStringToBoolean(dataR.getStringNE("purc_ddlv_flg")));
			}
		
		protected void setRowNumStr(MCList<DlvSlipDtlR> dtlL,MSBER_DlvSlip repSet){
			putNumStr(repSet, dtlL, DlvSlipDtlR.$s_int_trd_unit_qty, DlvSlipDtlR.$s_dec_trd_unit_qty, DlvSlipDtlR.$trd_unit_qty, "trd_unit_dec_place");
			putNumStr(repSet, dtlL, DlvSlipDtlR.$s_trd_unit_qty, DlvSlipDtlR.$trd_unit_qty, "trd_unit_dec_place");
			
			putNumStr(repSet, dtlL, DlvSlipDtlR.$s_int_trd_unit_po_qty, DlvSlipDtlR.$s_dec_trd_unit_po_qty, DlvSlipDtlR.$trd_unit_po_qty, "trd_unit_dec_place");
			putNumStr(repSet, dtlL, DlvSlipDtlR.$s_trd_unit_po_qty, DlvSlipDtlR.$trd_unit_po_qty, "trd_unit_dec_place");
			
			putNumStr(repSet, dtlL, DlvSlipDtlR.$s_int_base_unit_qty, DlvSlipDtlR.$s_dec_base_unit_qty, DlvSlipDtlR.$base_unit_qty, "base_unit_dec_place");
			putNumStr(repSet, dtlL, DlvSlipDtlR.$s_base_unit_qty, DlvSlipDtlR.$base_unit_qty, "base_unit_dec_place");
			
			putNumStr(repSet, dtlL, DlvSlipDtlR.$s_int_dlv_inst_qty, DlvSlipDtlR.$s_dec_dlv_inst_qty, DlvSlipDtlR.$dlv_inst_qty, "dlv_inst_unit_dec_place");
			putNumStr(repSet, dtlL, DlvSlipDtlR.$s_dlv_inst_qty, DlvSlipDtlR.$dlv_inst_qty, "dlv_inst_unit_dec_place");
			
			putNumStr(repSet, dtlL, DlvSlipDtlR.$s_int_slo_po_qty, DlvSlipDtlR.$s_dec_slo_po_qty, DlvSlipDtlR.$slo_po_qty, "slo_po_unit_dec_place");
			putNumStr(repSet, dtlL, DlvSlipDtlR.$s_slo_po_qty, DlvSlipDtlR.$slo_po_qty, "slo_po_unit_dec_place");
			
			putNumStr(repSet, dtlL, DlvSlipDtlR.$s_pack_qty, DlvSlipDtlR.$pack_qty, "trd_unit_dec_place");
			putNumStr(repSet, dtlL, DlvSlipDtlR.$s_ttl_pack_qty, DlvSlipDtlR.$ttl_pack_qty, "trd_unit_dec_place");
			for (DlvSlipDtlR r : dtlL) {
				if (!r.getBooleanNE("pri_print_flg")) {
					r.trd_cur_upri(null);
					r.trd_cur_amt(null);
					r.trd_cur_tax_in_amt(null);
					r.trd_cur_tax_amt(null);
					r.trd_cur_dscnt_amt(null);
					r.tax_cd(null);
					r.tax_nm(null);
					r.tax_rate(null);
					r.tax_typ(null);
					r.t_inc_tax(null);
					r.s_inc_tax_flg(null);
					r.s_interim_flg(null);
				}
			}
			putNumStr(repSet, dtlL, DlvSlipDtlR.$s_int_trd_cur_upri, DlvSlipDtlR.$s_dec_trd_cur_upri, DlvSlipDtlR.$trd_cur_upri, "upri_dec_place");
			putNumStr(repSet, dtlL, DlvSlipDtlR.$s_trd_cur_upri, DlvSlipDtlR.$trd_cur_upri, "upri_dec_place");
			
			putNumStr(repSet, dtlL, DlvSlipDtlR.$s_int_trd_cur_amt, DlvSlipDtlR.$s_dec_trd_cur_amt, DlvSlipDtlR.$trd_cur_amt, "amt_dec_place");
			putNumStr(repSet, dtlL, DlvSlipDtlR.$s_trd_cur_amt, DlvSlipDtlR.$trd_cur_amt, "amt_dec_place");
			
			putNumStr(repSet, dtlL, DlvSlipDtlR.$s_int_trd_cur_tax_in_amt, DlvSlipDtlR.$s_dec_trd_cur_tax_in_amt,
					DlvSlipDtlR.$trd_cur_tax_in_amt, "amt_dec_place");
			putNumStr(repSet, dtlL, DlvSlipDtlR.$s_trd_cur_tax_in_amt, DlvSlipDtlR.$trd_cur_tax_in_amt, "amt_dec_place");
			
			putNumStr(repSet, dtlL, DlvSlipDtlR.$s_int_trd_cur_tax_amt, DlvSlipDtlR.$s_dec_trd_cur_tax_amt, DlvSlipDtlR.$trd_cur_tax_amt,
					"amt_dec_place");
			putNumStr(repSet, dtlL, DlvSlipDtlR.$s_trd_cur_tax_amt, DlvSlipDtlR.$trd_cur_tax_amt, "amt_dec_place");
			
			putNumStr(repSet, dtlL, DlvSlipDtlR.$s_int_trd_cur_dscnt_amt, DlvSlipDtlR.$s_dec_trd_cur_dscnt_amt, DlvSlipDtlR.$trd_cur_dscnt_amt,
					"amt_dec_place");
			putNumStr(repSet, dtlL, DlvSlipDtlR.$s_trd_cur_dscnt_amt, DlvSlipDtlR.$trd_cur_dscnt_amt, "amt_dec_place");
			
			putNumStr(repSet, dtlL, DlvSlipDtlR.$s_tax_rate, DlvSlipDtlR.$tax_rate, dtlL.get(0).getMeta(DlvSlipDtlR.$tax_rate));
		}

		
		protected void editDlvInstData(DlvInstHdrR hdrR, MCList<DlvInstDtlR> dtlL, MSBDR_DlvInst repSet, MST_DLV_INST_R dlvInstR) {
			//ヘッダ
			setDlvInstRptStsTyp(hdrR, dlvInstR);
			MAC_RPT_STS_TYP.putName(hdrR, DlvInstHdrR.$rpt_sts_typ, DlvInstHdrR.$rpt_sts_typ_nm);
			hdrR.print_hm(_prntHm);
			hdrR.sppl_addr(concatAddress(hdrR.sppl_addr1(), hdrR.sppl_addr2(), hdrR.sppl_addr3(), hdrR.sppl_addr4()));
			hdrR.dpt_addr(concatAddress(hdrR.dpt_addr1(), hdrR.dpt_addr2(), hdrR.dpt_addr3(), hdrR.dpt_addr4()));
			hdrR.in_to_loc_addr(concatAddress(hdrR.in_to_loc_addr1(), hdrR.in_to_loc_addr2(), hdrR.in_to_loc_addr3(), hdrR.in_to_loc_addr4()));
			hdrR.dlv_addr(concatAddress(hdrR.dlv_addr1(), hdrR.dlv_addr2(), hdrR.dlv_addr3(), hdrR.dlv_addr4()));
			hdrR.tdlv_addr(concatAddress(hdrR.tdlv_addr1(), hdrR.tdlv_addr2(), hdrR.tdlv_addr3(), hdrR.tdlv_addr4()));
			hdrR.co_cd(getCo().co_cd());
			hdrR.co_nm(getCo().co_nm());
			putPrntItmSub1(hdrR, DlvInstHdrR.$itm_sub1_view, DlvInstHdrR.$itm_sub1_data);
			putPrntItmSub2(hdrR, DlvInstHdrR.$itm_sub2_view, DlvInstHdrR.$itm_sub2_data);
			putPrntItmSub3(hdrR, DlvInstHdrR.$itm_sub3_view, DlvInstHdrR.$itm_sub3_data);
			hdrR.ver_no_lbl(isNull(hdrR.ver_no()) ? null : MSC_INSP_PRNT_STR.VER_NO.name(repSet.getLocale()));
			hdrR.dlv_rqst_tm(setTm(hdrR.dlv_rqst_tm()));
			putNumStr(repSet, hdrR, DlvInstHdrR.$s_base_unit_qty, DlvInstHdrR.$base_unit_qty, hdrR.getNumber("base_unit_dec_place"));
			putNumStr(repSet, hdrR, DlvInstHdrR.$s_hdr_trd_unit_qty, DlvInstHdrR.$hdr_trd_unit_qty, hdrR.getNumber("hdr_trd_unit_dec_place"));
			putNumStr(repSet, hdrR, DlvInstHdrR.$s_arr_qty, DlvInstHdrR.$arr_qty, hdrR.getNumber("base_unit_dec_place"));
			//明細
			putNumStr(repSet, dtlL, DlvInstDtlR.$s_int_trd_unit_qty, DlvInstDtlR.$s_dec_trd_unit_qty, DlvInstDtlR.$trd_unit_qty, "dtl_trd_unit_dec_place");
			for (DlvInstDtlR dtlR : dtlL) {
				dtlR.insp_end_dt(getInspEndDt(hdrR.po_d_no()));
				dtlR.insp_end_dt_lbl(MSC_INSP_PRNT_STR.INSP_CMPL_DT.name(repSet.getLocale()));
				dtlR.dtl_dlv_rqst_tm(setTm(dtlR.dtl_dlv_rqst_tm()));
				dtlR.dtl_in_to_loc_addr(concatAddress(dtlR.dtl_in_to_loc_addr1(), dtlR.dtl_in_to_loc_addr2(), dtlR.dtl_in_to_loc_addr3(), dtlR.dtl_in_to_loc_addr4()));
			}
			setDlvInstBisInfo(hdrR, repSet);
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

		/**
		 * 打切行の場合は合計額から除外する
		 */
		protected MCNumber getPrntTtlAmt(String column, MCList<PoDtlR> dtlL, PoHdrR hdrR, boolean taxFlg) {
			MCNumber ttl = MCNumber.ZERO;
			MCNumber amt = MCNumber.ZERO;
			MCNumber taxAmt = MCNumber.ZERO;
			for (PoDtlR dtlR : dtlL) {
				if (!(dtlR.abort_flg() && !dtlR.getBooleanNE("rem_abort_flg"))) {
					if(taxFlg) {
						taxAmt = dtlR.getNumberNE(column);
					}
					else {
						amt = dtlR.getNumberNE(column);
					}

					if (dtlR.getBooleanNE("rem_abort_flg")) {
						MCNumber actQty = dtlR.getNumberNE("base_unit_qty").subtract(dtlR.getNumberNE("abort_qty"));
						MCNumber trdUnitQty = rvrsBaseUnitConv(actQty,
								dtlR.getNumberNE("unit_conv_base_qty"), dtlR.getNumberNE("unit_conv_qty"),
								dtlR.getNumberNE("unit_dec_place"), dtlR.getStringNE("unit_rnd_typ"));
						MCRow amtR = MAUCL_AmtUtil.getAmtAndTax(dtlR.trd_cur_upri(), trdUnitQty, dtlR.getNumberNE("tax_rate"),
								dtlR.inc_tax_flg(), hdrR.getNumberNE("amt_dec_place"),
								hdrR.getStringNE("purc_amt_rnd_typ"), hdrR.getStringNE("purc_tax_rnd_typ"),
								dtlR.trd_cur_dscnt_amt());
						amt = amtR.getNumber("amt");
						taxAmt = amtR.getNumber("tax_amt");
					}
				
					if(taxFlg) {
						ttl = ttl.add(nvl(taxAmt, MCNumber.ZERO));
					}
					else {
						ttl = ttl.add(nvl(amt, MCNumber.ZERO));
					}
				}
			}
			return ttl;
		}
		
		protected void editPoData(PoHdrR hdrR, MCList<PoDtlR> dtlL, MSBDR_Po repSet, MST_PO_R poR) {
			//ヘッダ
			setPoRptStsTyp(hdrR, poR);
			MAC_RPT_STS_TYP.putName(hdrR, PoHdrR.$rpt_sts_typ, PoHdrR.$rpt_sts_typ_nm, repSet.getLocale());
			hdrR.print_hm(_prntHm);
			hdrR.ttl_amt(getPrntTtlAmt(PoDtlR.$trd_cur_amt, dtlL, hdrR, false));
			hdrR.ttl_tax_amt(getPrntTtlAmt(PoDtlR.$trd_cur_tax_amt, dtlL, hdrR, true));
			hdrR.sppl_addr(concatAddress(hdrR.sppl_addr1(), hdrR.sppl_addr2(), hdrR.sppl_addr3(), hdrR.sppl_addr4()));
			hdrR.dpt_addr(concatAddress(hdrR.dpt_addr1(), hdrR.dpt_addr2(), hdrR.dpt_addr3(), hdrR.dpt_addr4()));
			hdrR.co_cd(getCo().co_cd());
			// 帳票出力ロケールでの会社名がNULLならログインロケールの会社名をセット
			if(isNull(hdrR.co_nm())){
				hdrR.co_nm(getCo().co_nm());
			}	
			putNumStr(repSet, hdrR, PoHdrR.$s_ttl_amt, PoHdrR.$ttl_amt, hdrR.getNumberNE("amt_dec_place"));
			putNumStr(repSet, hdrR, PoHdrR.$s_ttl_tax_amt, PoHdrR.$ttl_tax_amt, hdrR.getNumberNE("amt_dec_place"));
			setPoTxt(hdrR);
			//明細
			for (PoDtlR dtlR : dtlL) {
				// 印字はどちらか片方 
				dtlR.itm_nm(MCBooleanUtil.dbStringToBoolean(poR.getString("sppl_iv_flg")) ? dtlR.iv_itm_nm() : dtlR.itm_nm());
				dtlR.t_interim(dtlR.interim_flg() ? MAC_STR.PRNT_INTERIM.name(repSet.getLocale()) : null);
				dtlR.insp_end_dt(getInspEndDt(dtlR.po_d_no()));
				dtlR.t_inc_tax(dtlR.inc_tax_flg() ? MAC_STR.PRNT_INC_TAX.name(repSet.getLocale()) : null);
				dtlR.insp_end_dt_lbl(MSC_INSP_PRNT_STR.INSP_CMPL_DT.name(repSet.getLocale()));
				dtlR.ver_no_lbl(isNull(dtlR.ver_no()) ? null : MSC_INSP_PRNT_STR.VER_NO.name(repSet.getLocale()));
				dtlR.setNumberNE("upri_dec_place", hdrR.getNumber("upri_dec_place"));
				dtlR.setNumberNE("amt_dec_place", hdrR.getNumber("amt_dec_place"));
				dtlR.dlv_rqst_tm(setTm(dtlR.dlv_rqst_tm()));
				dtlR.in_to_loc_addr(concatAddress(dtlR.in_to_loc_addr1(), dtlR.in_to_loc_addr2(), dtlR.in_to_loc_addr3(), dtlR.in_to_loc_addr4()));
				dtlR.dlv_addr(concatAddress(dtlR.dlv_addr1(), dtlR.dlv_addr2(), dtlR.dlv_addr3(), dtlR.dlv_addr4()));
				dtlR.tdlv_addr(concatAddress(dtlR.tdlv_addr1(), dtlR.tdlv_addr2(), dtlR.tdlv_addr3(), dtlR.tdlv_addr4()));
				// 残数打切の場合も「打切」を表示する。
				// 実績時に残数打切すると発注明細の打切FLG（dtlR.abort_flg)が「0」なので、打切数量で判定する。
				dtlR.abort_flg(dtlR.abort_qty().isZero() ? false : true);
				dtlR.t_abort(dtlR.abort_flg() ? MSC_PO_STR.PRNT_ABORT.name(repSet.getLocale()) : null);
				dtlR.abort_qty(dtlR.abort_qty().isZero() ? null : dtlR.abort_qty());
			}
			
			putPrntItmSub1(dtlL, PoDtlR.$itm_sub1_view, PoDtlR.$itm_sub1_data);
			putPrntItmSub2(dtlL, PoDtlR.$itm_sub2_view, PoDtlR.$itm_sub2_data);
			putPrntItmSub3(dtlL, PoDtlR.$itm_sub3_view, PoDtlR.$itm_sub3_data);

			putNumStr(repSet, dtlL, PoDtlR.$s_int_trd_unit_qty, PoDtlR.$s_dec_trd_unit_qty, PoDtlR.$trd_unit_qty, "unit_dec_place");			
			putNumStr(repSet, dtlL, PoDtlR.$s_int_abort_qty, PoDtlR.$s_dec_abort_qty, PoDtlR.$abort_qty, "base_unit_dec_place");
			putNumStr(repSet, dtlL, PoDtlR.$s_int_trd_cur_upri, PoDtlR.$s_dec_trd_cur_upri, PoDtlR.$trd_cur_upri, "upri_dec_place");
			putNumStr(repSet, dtlL, PoDtlR.$s_int_trd_cur_amt, PoDtlR.$s_dec_trd_cur_amt, PoDtlR.$trd_cur_amt, "amt_dec_place");
			putNumStr(repSet, dtlL, PoDtlR.$s_int_trd_cur_onr_prov_amt, PoDtlR.$s_dec_trd_cur_onr_prov_amt, PoDtlR.$trd_cur_onr_prov_amt,
					"amt_dec_place");
			putNumStr(repSet, dtlL, PoDtlR.$s_int_trd_cur_onr_prov_upri, PoDtlR.$s_dec_trd_cur_onr_prov_upri,
					PoDtlR.$trd_cur_onr_prov_upri, "upri_dec_place");
			putNumStr(repSet, dtlL, PoDtlR.$s_int_trd_cur_proc_amt, PoDtlR.$s_dec_trd_cur_proc_amt, PoDtlR.$trd_cur_proc_amt,
					"amt_dec_place");
			putNumStr(repSet, dtlL, PoDtlR.$s_int_trd_cur_proc_upri, PoDtlR.$s_dec_trd_cur_proc_upri, PoDtlR.$trd_cur_proc_upri,
					"upri_dec_place");
			putNumStr(repSet, dtlL, PoDtlR.$s_int_trd_cur_dscnt_amt, PoDtlR.$s_dec_trd_cur_dscnt_amt, PoDtlR.$trd_cur_dscnt_amt,
					"amt_dec_place");
			putNumStr(repSet, dtlL, PoDtlR.$s_int_trd_cur_tax_amt, PoDtlR.$s_dec_trd_cur_tax_amt, PoDtlR.$trd_cur_tax_amt, "amt_dec_place");
			setPoBisInfo(repSet, hdrR);
		}
		
		protected void setPoTxt(PoHdrR hdrR) {
			hdrR.po_print_txt1(null);
			hdrR.po_print_txt2(null);
			hdrR.po_print_txt3(null);
			hdrR.po_print_txt4(null);
			hdrR.po_print_txt5(null);
			hdrR.po_print_txt6(null);
			
			String[] txts = MCStringUtil.split(MCStringUtil.CRLF_CODE, MCStringUtil.convertToCRLF(hdrR.po_print_txt()));
			if (1 <= txts.length) {
				hdrR.po_print_txt1(txts[0]);
			}
			if (2 <= txts.length) {
				hdrR.po_print_txt2(txts[1]);
			}
			if (3 <= txts.length) {
				hdrR.po_print_txt3(txts[2]);
			}
			if (4 <= txts.length) {
				hdrR.po_print_txt4(txts[3]);
			}
			if (5 <= txts.length) {
				hdrR.po_print_txt5(txts[4]);
			}
			if (6 <= txts.length) {
				hdrR.po_print_txt6(txts[5]);
			}
		}

		protected void setPoBisInfo(MSBDR_Po repSet, PoHdrR hdrR) {
			repSet.setAppReportNo1(hdrR.po_no());
			repSet.setAppReportNo2(hdrR.po_rev().toString());
			repSet.setAppReportSts1(hdrR.rpt_sts_typ());
			repSet.setAppReportStsNm1(hdrR.rpt_sts_typ_nm());
			// 最新ＦＬＧ。「1」が最新。
			// 訂正、取消によって同じリビジョンの印刷データが複数になる場合、過去の印刷データの値が「0」になる。
			repSet.setAppReportSts2("1");
			repSet.setAppUsrCd1(hdrR.purc_usr_cd());
			repSet.setAppUsrNm1(hdrR.purc_usr_nm());
			repSet.setAppUsrCd2(hdrR.purc_dpt_cd());
			repSet.setAppUsrNm2(hdrR.purc_dpt_nm());
			repSet.setAppToCd1(hdrR.sppl_cd());
			repSet.setAppToNm1(hdrR.sppl_nm());
			repSet.setAppRmrks1(hdrR.po_print_rmrks());
		}

		protected void setDlvSlipBisInfo(DlvSlipHdrR hdrR, DlvSlipDtlR dtlR,MSBER_DlvSlip repSet) {
			repSet.setAppReportNo1(hdrR.dlv_slip_no());
			repSet.setAppReportNo2(hdrR.dlv_slip_rev().toString());
			setDlvSlipSts(hdrR, repSet);
			repSet.setAppUsrCd1(hdrR.getStringNE("purc_usr_cd"));
			repSet.setAppUsrNm1(hdrR.getStringNE("purc_usr_nm"));
			repSet.setAppUsrCd2(hdrR.getStringNE("purc_dpt_cd"));
			repSet.setAppUsrNm2(hdrR.getStringNE("purc_dpt_nm"));
			repSet.setAppToCd1(hdrR.po_co_cd());
			repSet.setAppToNm1(hdrR.po_co_nm());
			repSet.setAppToCd2(hdrR.slo_co_cd());
			repSet.setAppToNm2(hdrR.slo_co_nm());
			repSet.setAppRmrks1(hdrR.po_trd_rmrks());
		}
		
		protected void setDlvSlipSts(DlvSlipHdrR hdrR, MSBER_DlvSlip repSet) {
			if (MAC_SLIP_STS_TYP.isCAN(hdrR.slip_sts_typ())) {
				repSet.setAppReportSts1(MAC_RPT_STS_TYP.CAN.value());
				repSet.setAppReportStsNm1(MAC_RPT_STS_TYP.CAN.name(repSet.getLocale()));
			}
			else if (hdrR.dlv_slip_rev().gt(1)){
				repSet.setAppReportSts1(MAC_RPT_STS_TYP.COR.value());
				repSet.setAppReportStsNm1(MAC_RPT_STS_TYP.COR.name(repSet.getLocale()));
			}
			else {
				repSet.setAppReportSts1(MAC_RPT_STS_TYP.CRT.value());
				repSet.setAppReportStsNm1(MAC_RPT_STS_TYP.CRT.name(repSet.getLocale()));
			}
		}

		protected void setDlvInstBisInfo(DlvInstHdrR hdrR, MSBDR_DlvInst repSet) {
			repSet.setAppReportNo1(hdrR.dlv_inst_no());
			repSet.setAppReportNo2(hdrR.dlv_inst_rev().toString());
			repSet.setAppReportSts1(hdrR.rpt_sts_typ());
			repSet.setAppReportStsNm1(hdrR.rpt_sts_typ_nm());
			// 最新ＦＬＧ。「1」が最新。
			// 訂正、取消によって同じリビジョンの印刷データが複数になる場合、過去の印刷データの値が「0」になる。
			repSet.setAppReportSts2("1");
			repSet.setAppUsrCd1(hdrR.purc_usr_cd());
			repSet.setAppUsrNm1(hdrR.purc_usr_nm());
			repSet.setAppUsrCd2(hdrR.purc_dpt_cd());
			repSet.setAppUsrNm2(hdrR.purc_dpt_nm());
			repSet.setAppToCd1(hdrR.sppl_cd());
			repSet.setAppToNm1(hdrR.sppl_nm());
			repSet.setAppRmrks1(hdrR.dlv_inst_prnt_rmrks());
		}
		protected MCList<MST_INSP_SCHD_R> _inspSchdL;
		protected MCIndexKey _inspSchdIdx;
		/**
		 * 検査予定の検査終了予定日を取得する。
		 */
		protected MCDate getInspEndDt(String poDNo) {
			String endTm = "end_tm";
			if (_inspSchdL == null) {
				MCQueryApiBuilder work_bldr = MCQueryApiBuilder.create(MST_PO_R.create("T"));
				dbWkDelete("MSBDL5200_MSW_PO_D01", work_bldr.getBaseDbc());
				if (!isNull(_up0L)) {
					dbWkInsert("MSBDL5200_MSW_PO_I01", _up0L, work_bldr.getBaseDbc());
				}
				if (!isNull(_up1L)) {
					dbWkInsert("MSBDL5200_MSW_PO_I02", _up1L, work_bldr.getBaseDbc());
				}

				MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
				MST_PO_D_R t2 = MST_PO_D_R.create("T2");
				MSW_PO_KEY_R w = MSW_PO_KEY_R.create("W");
				MCQueryApiBuilder inspR_bldr = MCQueryApiBuilder.create(t);
	
				//１発注明細に対して複数の検査依頼が存在する場合、
				//最も遅い検査終了予定日とする。
				inspR_bldr.addMax(t.end_tm, endTm);
				inspR_bldr.addGroupBy(t.src_no1);
				inspR_bldr.addInnerJoin(t2, t2.po_d_no.eq(t.src_no1));
				inspR_bldr.addInnerJoin(w, w.po_no.eq(t2.po_no));
	
				inspR_bldr.setWhere(t.insp_typ.eq(bind("1")), MSC_INSP_TYP.ACCPT.value());
				//最新の検査依頼ではなく、発注時に作成された検査依頼を元に表示したいため、
				//検査回数は1回目のレコードを取得する
				inspR_bldr.addWhereWithAnd(t.insp_freq.eq(value(1)));
				_inspSchdL = MCList.create(MST_INSP_SCHD_R.class);
				dbSelect("MSBDL5200_MST_INSP_SCHD_S01", _inspSchdL, inspR_bldr);
				_inspSchdIdx = _inspSchdL.createIndex(MST_INSP_SCHD_R.$src_no1);

				dbWkDelete("MSBDL5200_MSW_PO_D02", work_bldr.getBaseDbc());
			}
			MST_INSP_SCHD_R inspR = _inspSchdL.getFirst(_inspSchdIdx, poDNo);
			return isNull(inspR) ? null : inspR.getDateNE(endTm);
		}

		protected MCList<PoDtlR> _poDL;
		protected MCIndexKey _poDIdx;
		protected MCList<PoDtlR> createPoDtl(MST_PO_R poR, String lclCd) {
			if (_poDL == null) {
				MCQueryApiBuilder work_bldr = MCQueryApiBuilder.create(MST_PO_P_R.create("T"));
				dbWkDelete("MSBDL5200_MSW_PO_P_D01", work_bldr.getBaseDbc());
				dbWkInsert("MSBDL5200_MSW_PO_P_I01", _up0L, work_bldr.getBaseDbc());
				
				_poDL = MCList.create(PoDtlR.class);
				_poDL.addStringColumn(PoHdrR.$po_no);
				_poDL.addNumberColumn(PoHdrR.$po_rev);
				_poDL.addBooleanColumn("rem_abort_flg");
				executeQuery(_poDL, MSBDL5200_MST_PO_D_S01());
				_poDIdx = _poDL.createIndex(PoHdrR.$po_no, PoHdrR.$po_rev);
				
				dbWkDelete("MSBDL5200_MSW_PO_P_D02", work_bldr.getBaseDbc());
			}
			MCList<PoDtlR> dtlL = _poDL.subList(_poDIdx, poR.po_no(), poR.po_rev());
			dtlL.sort(PoDtlR.$disp_seq);
			return dtlL;
		}

		protected void execPrnt() {
			// 画面の個別発行フラグがオフの場合、個別発行フラグ取得
			if (!up3().indiv_prnt_flg()) {
				getIndivPrnt();
			}
			
			//注文書のみ
			if (isPrntPo()) {
				prntPoAll();
			}
			//納品書のみ
			else if (isPrntDlvSlip()) {
				prntDlvSlipAll();
			}
			//納入指示書のみ
			else if (isPrntDlvInst()) {
				prntDlvInstAll();
			}
			//注文書、納品書
			else if (isPrntPoAndDlvSlip()) {
				prntPoAndDlvSlip();
			}
			//納入指示書、納品書
			else if (isPrntDlvSlipAndDlvInst()) {
				prntDlvInstAll();
				prntDlvSlipAll();
			}
			if (isPrntPurcDdlvDlvSlip()) {
				prntPurcDdlvDlvSlip();
			}

		}

		protected void prntPoAndDlvSlip() {
			//注文書
			for (PurcPrnt_Prnt01_PoR up0R : _up0L) {
				createPoPrnt(up0R);
			}
			
			srchDlvSlip();
			
			initDbcCacheTrd();
			//納品書
			for (PurcPrnt_Prnt01_DlvSlipR up2R : _up2L) {
				createDlvSlipRS(up2R);
			}

			requestPoAndDlvSlip();
		}
		
		

		protected boolean isPrntPo() {
			return !up0().isEmpty() && up1().isEmpty() && up2().isEmpty();
		}

		protected boolean isPrntPoAndDlvSlip() {
			return !up0().isEmpty() && up1().isEmpty() && !up2().isEmpty();
		}

		protected boolean isPrntDlvSlip() {
			return up0().isEmpty() && up1().isEmpty() && !up2().isEmpty();
		}

		protected boolean isPrntDlvInst() {
			return up0().isEmpty() && !up1().isEmpty() && up2().isEmpty();
		}

		protected boolean isPrntDlvSlipAndDlvInst() {
			return up0().isEmpty() && !up1().isEmpty() && !up2().isEmpty();
		}
		
		protected boolean isPrntPurcDdlvDlvSlip() {
			return !up4().isEmpty();
		}
		
		protected boolean isPrntDlvSlipAndPurcDdlvDlvSlip() {
			return !up2().isEmpty() && !up4().isEmpty();
		}

		protected boolean isCanPo(MST_PO_R poR) {
			return poR.can_flg() && !isNotPrntPo(poR);
		}

		protected boolean isCanDlvInst(MST_DLV_INST_R dlvInstR) {
			return dlvInstR.can_flg() && !isNotPrntDlvInst(dlvInstR);
		}

		protected boolean isCrtPo(MST_PO_R poR) {
			return isNull(poR.last_po_rev()) && !poR.can_flg();
		}

		protected boolean isCrtDlvInst(MST_DLV_INST_R dlvInstR) {
			return isNull(dlvInstR.last_dlv_inst_rev()) && !dlvInstR.can_flg();
		}

		protected boolean isUpdPo(MST_PO_R poR) {
			return !isNull(poR.last_po_rev()) && !isSame(poR.po_rev(), poR.last_po_rev()) && !isCanPo(poR);
		}

		protected boolean isUpdDlvInst(MST_DLV_INST_R dlvInstR) {
			return !isNull(dlvInstR.last_dlv_inst_rev()) && !isSame(dlvInstR.dlv_inst_rev(), dlvInstR.last_dlv_inst_rev()) && !isCanDlvInst(dlvInstR);
		}
		/**
		 * 取消注文書を新規発行するか
		 * 取消 || 訂正
		 */
		protected boolean isPrntPoCan(MST_PO_R poR) {
			return (poR.can_flg() && !isNull(poR.last_po_rev())) || isUpdPo(poR);
		}
		/**
		 * 取消納入指示書を新規発行するか
		 */
		protected boolean isPrntDlvInstCan(MST_DLV_INST_R dlvInstR) {
			return (dlvInstR.can_flg() && !isNull(dlvInstR.last_dlv_inst_rev())) || isUpdDlvInst(dlvInstR);
		}

		// 注文書再発行か（過去リビジョン || 最新リビジョンで発行済）
		protected boolean isReprntPo(MST_PO_R poR) {
			return isNull(poR) || poR.po_print_flg();
		}

		// 納入指示書再発行か（過去リビジョン || 最新リビジョンで発行済）（条件は同じ）
		protected boolean isReprntDlvInst(MST_DLV_INST_R dlvInstR) {
			return dlvInstR.dlv_inst_print_flg();
		}
		

		
		/**
		 * 注文書を発行しないか。
		 * 注文書を一度も発行しない状態で取消した場合は何も発行しない
		 * @param poR
		 * @return 
		 */
		protected boolean isNotPrntPo(MST_PO_R poR) {
			return isNull(poR.last_po_rev()) && poR.can_flg();
		}

		/**
		 * 納入指示書を発行しないか。
		 * 納入指示書を一度も発行しない状態で取消した場合は何も発行しない
		 * @param dlvInstR
		 * @return 
		 */
		protected boolean isNotPrntDlvInst(MST_DLV_INST_R dlvInstR) {
			return isNull(dlvInstR.last_dlv_inst_rev()) && dlvInstR.can_flg();
		}

		protected void checkLock() {
			lock();
			check();
			insWkPurcDlvSlip();
			insWkDlvInst();
		}

		protected void check() {
			checkDlvSlip();
			checkPo();
			setCheckedList();
			crtCache();
		}
		
		/**
		 * 発注先納品書ＣＤが設定されている場合のみ、納品書発行対象リストに加える
		 */
		protected void checkDlvSlip() {
			MAM_BP_R t = MAM_BP_R.create("T");
			MCQueryApiBuilder bpL_bldr = MCQueryApiBuilder.create(t);
			bpL_bldr.setSelect(t.bp_cd);
			bpL_bldr.addSelect(t.sppl_ship_form_cd);
	
			MCList<PurcPrnt_Prnt01_DlvSlipR> up2L = getChkList(up2());
			_up2L = MCList.create(PurcPrnt_Prnt01_DlvSlipR.class);
			MCList<MCRow> bindL = MCList.create(MCRow.class);
			bindL.addStringColumn("sppl_cd");
			// 帳票発行ボタンの場合は本処理で発注ヘッダの伝票帳票コードを取得
			if (!up2L.isEmpty() && up2L.get(0).bp_srch_flg()) {
				for (PurcPrnt_Prnt01_DlvSlipR up2R : up2L) {
					MST_PO_R poR = _lockPoL.getFirst(_lockPokey, up2R.po_no());
					if (!isNull(poR) && !isNull(poR.dlv_slip_form_cd())) {
						up2R.sppl_ship_form_cd(poR.dlv_slip_form_cd());
						_up2L.add(up2R);
					}
				}
			}
			else {
				for (PurcPrnt_Prnt01_DlvSlipR up2R : up2L) {
					if (!isNull(up2R.sppl_ship_form_cd())) {
						_up2L.setAll(up2L);
					}
				}
			}

		}
		
		protected String getFormId(String slipFormCd) {
			return _slipCache.getCache(slipFormCd).slip_form_id();
		}
		
		protected MCNumber getFormLineNum(String slipFormCd) {
			return _slipCache.getCache(slipFormCd).line_num();
		}
		
		protected String getSubFormId(String slipFormCd) {
			return _slipCache.getCache(slipFormCd).copy_slip_form_id();
		}
		
		protected MAM_PO_PRINT_R getPoPrnt(String poPrntCd){
			return _poPrntCache.get(poPrntCd);
		}

		protected String getPrntLclCd(String poNo) {
			MAM_BP_R bpR = MAM_BP_R.create();
			MAM_BP_R t = MAM_BP_R.create("T");
			MCQueryApiBuilder bpR_bldr = MCQueryApiBuilder.create(t);
			MST_PO_R po = MST_PO_R.create("PO");
			MCRow bind = MCRow.create();
			bind.addStringColumn("po_no", poNo);
			bpR_bldr.addInnerJoin(po,
					bracket(t.bp_cd.eq(po.sppl_cd)
							.and(po.po_no.eq(bind("po_no")))));
			dbSelect("MSBDL5200_MAM_BP_S01", bpR, bpR_bldr, bind);
			return bpR.prnt_lcl_cd();
		}
		
		protected void crtCache() {
			_slipCache = new FXUCL_MCDbcCache<MAM_SLIP_FORM_R>(
					MCQueryApiBuilder.create(MAM_SLIP_FORM_R.create("T")),
					_up2L.groupBy(PurcPrnt_Prnt01_DlvSlipR.$sppl_ship_form_cd),
					PurcPrnt_Prnt01_DlvSlipR.$sppl_ship_form_cd);
			MAM_PO_PRINT_R poPrntR_t = MAM_PO_PRINT_R.create("T");
			_poPrntCache = new FXUCL_MCDbcCache<MAM_PO_PRINT_R>(MCQueryApiBuilder.create(poPrntR_t));
			doSeqCache(MSC_NUM_SYS_TYP.DLVSLIPD, _up2L.size());
		}
		
		protected void setCheckedList(){
			_up0L = getChkList(up0());
			_up1L = getChkList(up1());
			_up2L = getChkList(_up2L);
		}

		protected void lock() {
			//注文書のみ
			if (isPrntPo()) {
				lockPo();

			}
			//納品書のみ
			else if (isPrntDlvSlip()) {
				lockDlvSlip();
			}

			//納入指示書のみ
			else if (isPrntDlvInst()) {
				lockDlvInst();
			}

			//注文書、納品書
			else if (isPrntPoAndDlvSlip()) {
				lockDlvSlip();
				lockPoAndDlvSlip();
			}
			//納入指示書、納品書
			else if (isPrntDlvSlipAndDlvInst()) {
				lockDlvSlip();
				lockDlvInst();
			}
			if (isPrntPurcDdlvDlvSlip()) {
				// 納品書も発行する場合はロック済なので呼ばない
				if (!isPrntDlvSlipAndPurcDdlvDlvSlip()) {
					lockDlvSlip();
				}
				lockPurcDdlvDlvSlip();
			}
			_lockPokey = _lockPoL.createIndex(MST_PO_R.$po_no);
			
		}

		protected void lockPo() {
			_lockPoL.addAll(lockPoCommon(up0()));
		}

		protected void lockPoAndDlvSlip() {
			//注文書を発行する明細で発注ヘッダをロック
			_lockPoL.addAll(lockPoCommon(up0()));
			//納品書
			MCList<PurcPrnt_Prnt01_DlvSlipR> bindL = MCList.create(PurcPrnt_Prnt01_DlvSlipR.class);
			MCIndexKey k = up0().createIndex(PurcPrnt_Prnt01_PoR.$po_no);
			//up0でロックした発注との重複を排除
			for (PurcPrnt_Prnt01_DlvSlipR up2R : up2()) {
				if (isNull(up0().getFirst(k, up2R.po_no()))) {
					bindL.add(up2R);
				}
			}
			_lockPoL.addAll(lockPoCommon(bindL));
			//発注ＮＯに対応する入荷進捗をロック
			lockArrPrByPoNo(up2().groupBy(PurcPrnt_Prnt01_DlvSlipR.$po_no));

		}

		protected void lockArrPrByPoNo(MCList<PurcPrnt_Prnt01_DlvSlipR> bindL) {
			MST_PO_D_R pod = MST_PO_D_R.create("POD");
			MST_PO_R po = MST_PO_R.create("PO");
			MCList<MST_ARR_PR_R> lockArrPrL = MCList.create(MST_ARR_PR_R.class);
			MST_ARR_PR_R t = MST_ARR_PR_R.create("T");
			MCQueryApiBuilder lockArrPrL_bldr = MCQueryApiBuilder.create(t);

			lockArrPrL_bldr.addLeftOuterJoin(pod, bracket(t.po_d_no.eq(pod.po_d_no)));
			lockArrPrL_bldr.addLeftOuterJoin(po, bracket(po.po_no.eq(pod.po_no)));
			lockArrPrL_bldr.addWhereWithAnd(po.po_no.eq(bind("po_no")));
			lockArrPrL_bldr.setLockTable(t.arr_pr_no);
			lockArrPrL_bldr.setOrderByAsc(lockArrPrL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectForUpdate("MSBDL5200_MST_ARR_PR_S01", lockArrPrL, lockArrPrL_bldr, bindL);
		}

		protected void lockArrPrByDlvInstNo(MCList<PurcPrnt_Prnt01_DlvSlipR> bindL) {
			MST_ARR_SCHD_R schd = MST_ARR_SCHD_R.create("SCHD");
			MST_DLV_INST_D_R instd = MST_DLV_INST_D_R.create("INSTD");
			MST_DLV_INST_R inst = MST_DLV_INST_R.create("INST");
			MCList<MST_ARR_PR_R> lockArrPrL = MCList.create(MST_ARR_PR_R.class);
			MST_ARR_PR_R t = MST_ARR_PR_R.create("T");
			MCQueryApiBuilder lockArrPrL_bldr = MCQueryApiBuilder.create(t);
			
			lockArrPrL_bldr.addLeftOuterJoin(schd,
					bracket(t.arr_pr_no.eq(schd.arr_pr_no)));
			lockArrPrL_bldr.addLeftOuterJoin(instd,
					bracket(schd.dlv_inst_d_no.eq(instd.dlv_inst_d_no)));
			lockArrPrL_bldr.addLeftOuterJoin(inst,
					bracket(inst.dlv_inst_no.eq(instd.dlv_inst_no)));
			lockArrPrL_bldr.setWhere(inst.dlv_inst_grp_no.eq(bind("dlv_inst_grp_no")));
			lockArrPrL_bldr.setLockTable(t.arr_pr_no);
			lockArrPrL_bldr.setOrderByAsc(lockArrPrL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectForUpdate("MSBDL5200_MST_ARR_PR_S02", lockArrPrL, lockArrPrL_bldr, bindL);
		}
		
		protected void lockArrPrByPrmsRcpt(MCList<PurcPrnt_Prnt01_DlvSlipR> bindL) {
			MST_ARR_SCHD_R schd = MST_ARR_SCHD_R.create("SCHD");
			MST_PRMS_RCPT_D_R rcptd = MST_PRMS_RCPT_D_R.create("RCPTD");
			MST_PRMS_RCPT_R rcpt = MST_PRMS_RCPT_R.create("RCPT");
			MCList<MST_ARR_PR_R> lockArrPrL = MCList.create(MST_ARR_PR_R.class);
			MST_ARR_PR_R t = MST_ARR_PR_R.create("T");
			MCQueryApiBuilder lockArrPrL_bldr = MCQueryApiBuilder.create(t);
			
			lockArrPrL_bldr.addLeftOuterJoin(schd,
					bracket(t.arr_pr_no.eq(schd.arr_pr_no)));
			lockArrPrL_bldr.addLeftOuterJoin(rcptd,
					bracket(schd.prms_rcpt_d_no.eq(rcptd.prms_rcpt_d_no)));
			lockArrPrL_bldr.addLeftOuterJoin(rcpt,
					bracket(rcptd.prms_rcpt_no.eq(rcpt.prms_rcpt_no)));
			lockArrPrL_bldr.setWhere(rcpt.prms_rcpt_grp_no.eq(bind("prms_rcpt_grp_no.eq")));
			lockArrPrL_bldr.setLockTable(t.arr_pr_no);
			lockArrPrL_bldr.setOrderByAsc(lockArrPrL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectForUpdate("MSBDL5200_MST_ARR_PR_S04", lockArrPrL, lockArrPrL_bldr, bindL);
		}

		protected void lockDlvSlip() {
			MCList<PurcPrnt_Prnt01_DlvSlipR> bindL = MCList.create(PurcPrnt_Prnt01_DlvSlipR.class);
			bindL.addAll(up2());
			bindL.addAll(up4());
			MST_PURC_DLV_SLIP_R t = MST_PURC_DLV_SLIP_R.create("T");
			MCQueryApiBuilder locDlvSlipL_bldr = MCQueryApiBuilder.create(t);
			
			locDlvSlipL_bldr.setWhere(t.dlv_slip_mng_no.eq(bind("dlv_slip_mng_no")));
			locDlvSlipL_bldr.addWhereWithAnd(t.dlv_slip_mng_seq.eq(bind("dlv_slip_mng_seq")));
			locDlvSlipL_bldr.setOrderBy(t.dlv_slip_mng_no.asc(), t.dlv_slip_mng_seq.desc());
			dbSelectForUpdate("MSBDL5200_MST_PURC_DLV_SLIP_S08", _lockDlvSlipL, locDlvSlipL_bldr, bindL);
			_lockDlvSlipkey = _lockDlvSlipL.createIndex(MST_PURC_DLV_SLIP_R.$dlv_slip_mng_no, MST_PURC_DLV_SLIP_R.$dlv_slip_mng_seq);
			if (up2().isEmpty()) {
				return;
			}
			//up2の発注ＮＯは必須
			// 納入指示ＧＮＯが指定されている場合は納入指示ＮＯに対応する入荷進捗をロック
			// 納期回答受領ＧＮＯが指定されている場合は納期回答受領ＧＮＯに対応する入荷進捗をロック
			if (!isNull(up2().get(0).dlv_inst_grp_no())) {
				lockArrPrByDlvInstNo(up2());
			}
			else if (!isNull(up2().get(0).prms_rcpt_grp_no())) {
				lockArrPrByPrmsRcpt(up2());
			}
			else {
				//発注ＮＯに対応する入荷進捗をロック
				lockArrPrByPoNo(up2().groupBy(PurcPrnt_Prnt01_DlvSlipR.$po_no));
			}

			_lockPoL.addAll(lockPoCommon(up2().groupBy(PurcPrnt_Prnt01_DlvSlipR.$po_no)));
		}
		
		protected void lockPurcDdlvDlvSlip() {
			//up4の発注ＮＯは必須
			// 納入指示ＧＮＯが指定されている場合は納入指示ＮＯに対応する入荷進捗をロック
			// 納期回答受領ＧＮＯが指定されている場合は納期回答受領ＧＮＯに対応する入荷進捗をロック
			if (!isNull(up4().get(0).dlv_inst_grp_no())) {
				lockArrPrByDlvInstNo(up4());
			}
			else if (!isNull(up4().get(0).prms_rcpt_grp_no())) {
				lockArrPrByPrmsRcpt(up4());
			}
			else {
				//発注ＮＯに対応する入荷進捗をロック
				lockArrPrByPoNo(up4().groupBy(PurcPrnt_Prnt01_DlvSlipR.$po_no));
			}

			_lockPoL.addAll(lockPoCommon(up4().groupBy(PurcPrnt_Prnt01_DlvSlipR.$po_no)));
		}

		protected void lockDlvInst() {
			//納入指示書発行時は上り電文の発注ＮＯに対応する発注ヘッダをすべてロック、入荷進捗もロック
			MCList<MST_ARR_PR_R> lockArrPrL = MCList.create(MST_ARR_PR_R.class);
			MST_ARR_PR_R t = MST_ARR_PR_R.create("T");
			MCQueryApiBuilder lockArrPrL_bldr = MCQueryApiBuilder.create(t);
			lockArrPrL_bldr.addWhereWithAnd(t.po_d_no.eq(bind("po_d_no")));
			lockArrPrL_bldr.setOrderByAsc(lockArrPrL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectForUpdate("MSBDL5200_MST_ARR_PR_S03",
					lockArrPrL, lockArrPrL_bldr, up1().groupBy(PurcPrnt_Prnt01_DlvInstR.$po_d_no));

			_lockPoL.addAll(lockPoCommon(up1().groupBy(PurcPrnt_Prnt01_DlvInstR.$po_no)));
			_lockDlvInstL.addAll(lockDlvInstCommon(up1()));
			_lockDlvInstkey= _lockDlvInstL.createIndex(MST_DLV_INST_R.$dlv_inst_no);
		}

		protected MCList<MST_DLV_INST_R> lockDlvInstCommon(MCList<? extends MCRow> bindL) {
			MCList<MST_DLV_INST_R> lockDlvInstL = MCList.create(MST_DLV_INST_R.class);
			lockDlvInstL = MCList.create(MST_DLV_INST_R.class);
			MCQueryApiBuilder lockDlvInstL_bldr = MCQueryApiBuilder.create(MST_DLV_INST_R.create("T"));
			lockDlvInstL_bldr.setOrderByAsc(lockDlvInstL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectKeyForUpdate("MSBDL5200_MST_DLV_INST_S01", lockDlvInstL, lockDlvInstL_bldr, bindL);
			return lockDlvInstL;
		}

		protected MCList<MST_PO_R> lockPoCommon(MCList<? extends MCRow> bindL) {

			MCList<MST_PO_R> lockPoL = MCList.create(MST_PO_R.class);
			MST_PO_R t = MST_PO_R.create("T");
			MCQueryApiBuilder lockPoL_bldr = MCQueryApiBuilder.create(t);
			MST_PO_D_R S1POD = MST_PO_D_R.create("POD");
			MAM_BP_R bp = MAM_BP_R.create("BP");

			// 注文書表示テキストに表示する文言を判定する為。仮単価の明細を含むかどうか。
			lockPoL_bldr.addSelect(cases()
					.when(bracket(subQuery().select(countAll()).from(S1POD)
							.where(t.po_no.eq(S1POD.po_no)
									.and(t.po_rev.eq(S1POD.po_rev))
									.and(S1POD.can_flg.eq(value(false)))
									.and(S1POD.interim_flg.eq(value(true)))))
											.gt(value(0)))
					.then(value(true)).otherwise(value(false)).as("interim_flg"));
			lockPoL_bldr.addSelect(bp.prnt_lcl_cd);
			lockPoL_bldr.addSelect(bp.sppl_iv_flg);
			lockPoL_bldr.addLeftOuterJoin(bp, bracket(bp.bp_cd.eq(t.sppl_cd)));

			//発行対象が最新リビジョンならロックを行うが、最新リビジョンかどうかは検索してみないとわからない。
			//上り電文の発注ＮＯ、発注改訂番号で検索し、ロックできた場合は最新リビジョン、できなかった場合か過去リビジョン（この場合はロックしない）。
			lockPoL_bldr.setWhere(t.po_no.eq(bind("po_no")));
			lockPoL_bldr.addWhereWithCutOffAnd(t.po_rev.eq(bind("po_rev")));
			lockPoL_bldr.setOrderByAsc(lockPoL_bldr.getBaseDbc().getKeyColumn$());
			lockPoL_bldr.setLockTable(t.po_no);
			dbSelectForUpdate("MSBDL5200_MST_PO_S01", lockPoL, lockPoL_bldr, bindL);
			return lockPoL;

		}

		protected void checkPoComm(MCList<? extends MCRow> tgtL, String msgId) {
			for (MCList<? extends MCRow> gl : tgtL.groupList("po_no")) {
				MCRow upR = gl.get(0);
				MST_PO_R poR = _lockPoL.getFirst(_lockPokey, upR.getStringNE("po_no"));
				//再発行（過去リビジョン || 最新リビジョンの再発行）の場合はチェックなし
				if (isNull(poR) || poR.po_print_flg()) {
					continue;
				} 
				// 未発行で取消の場合は発行しない
				if (isNotPrntPo(poR)) {
					continue;
				}
				if (poR.aprv_flg() && !MAC_APRV_STS_TYP.isACPT(poR.aprv_sts_typ())) {
					MCMessagePool.add(new MCMessage(upR, null, msgId, poR.po_no(), poR.aprv_no(), toDispGUIIndex(upR)));
					gl.setBooleanNE("err_flg", true);
				}
			}

		}


		protected void checkPo() {
			
			checkPoComm(up0(), MSBDL0014);
			MCList<PurcPrnt_Prnt01_DlvSlipR> up24 = MCList.create(PurcPrnt_Prnt01_DlvSlipR.class);
			up24.addAll(_up2L);
			up24.addAll(up4());
			MCList<PurcPrnt_Prnt01_DlvSlipR> aprvChkL = setChkAprv(up24);
			checkPoComm(aprvChkL, MSBDL0016);
		}
		/**
		 * 承認対象チェックを行う行を設定する
		 * @return チェック対象行
		 */
		protected MCList<PurcPrnt_Prnt01_DlvSlipR> setChkAprv(MCList<PurcPrnt_Prnt01_DlvSlipR> dlvSlipL) {
			MCList<PurcPrnt_Prnt01_DlvSlipR> retL = MCList.create(PurcPrnt_Prnt01_DlvSlipR.class);
			for (PurcPrnt_Prnt01_DlvSlipR r : dlvSlipL) {
				if (isNullAnd(r.dlv_slip_mng_no(), r.dlv_slip_mng_seq())) {
					retL.add(r);
					continue;
				}
				boolean isTgt = false;
				MST_PURC_DLV_SLIP_R dlvSlipR = _lockDlvSlipL.getFirst(_lockDlvSlipkey, r.dlv_slip_mng_no(), r.dlv_slip_mng_seq());
				// 伝票状況区分「取消」以外はチェック対象
				if (!MAC_SLIP_STS_TYP.isCAN(dlvSlipR.slip_sts_typ())) {
					isTgt = true;
				}
				if (isTgt) {
					retL.add(r);
				}
			}
			return retL;
		}
	}
	
	/**
	 * PurcPrnt_Prnt02オペレーション.<p>
	 *
	 * 仕入返品票を発行する。<br>
	 */
	public class PurcPrnt_Prnt02 extends MSBDL_PurcPrntService_MC_A.PurcPrnt_Prnt02 {

		// ロック用仕入返品実績ヘッダ
		protected MCList<MST_PURC_RET_ACT_R> _lockPurcRetActL = MCList.create(MST_PURC_RET_ACT_R.class);

		protected MCIndexKey _lockPurcRetActKey;

		// 仕入返品票の発行リスト
		protected Map<List<String>, List<MSBDR_PurcRet>> _purcRetPrntMap = new LinkedHashMap<List<String>, List<MSBDR_PurcRet>>();
		// 仕入返品票の再発行リスト
		protected Map<List<String>, MCReportInfoR> _purcRetReprntMap = new LinkedHashMap<List<String>, MCReportInfoR>();

		protected Set<List<String>> _rePrntPurcRetSet = new HashSet<List<String>>();
		
		// 更新用仕入返品実績ヘッダ
		protected MCList<MST_PURC_RET_ACT_R> _updPurcRetActL = MCList.create(MST_PURC_RET_ACT_R.class);

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
			createPurcRetPrnt();
			execPrnt();
			upd();
		}

		/**
		 * 仕入返品実績ヘッダをロックする
		 * 
		 */
		protected void lock() {

			if (!up0().isEmpty()) {
				MST_PURC_RET_ACT_R lockPurcRetActL_t = MST_PURC_RET_ACT_R.create("T");
				MCQueryApiBuilder lockPurcRetActL_bldr = MCQueryApiBuilder.create(lockPurcRetActL_t);
				MAM_BP_R bp = MAM_BP_R.create("BP");
				lockPurcRetActL_bldr.addSelect(bp.prnt_lcl_cd);
				lockPurcRetActL_bldr.addSelect(bp.sppl_iv_flg);
				lockPurcRetActL_bldr.addSelect(bp.cur_cd);
				lockPurcRetActL_bldr.addLeftOuterJoin(bp,
						bracket(bp.bp_cd.eq(lockPurcRetActL_t.sppl_cd)));
				lockPurcRetActL_bldr.setOrderByAsc(
						lockPurcRetActL_bldr.getBaseDbc().getKeyColumn$());
				lockPurcRetActL_bldr.setLockTable(lockPurcRetActL_t.purc_ret_act_no);
				dbSelectKeyForUpdate("MSBDL5200_MST_PURC_RET_ACT_S01",
						_lockPurcRetActL, lockPurcRetActL_bldr, up0());
				_lockPurcRetActKey = _lockPurcRetActL.createIndex(
						PurcPrnt_Prnt02_CndR.$purc_ret_act_no,
						PurcPrnt_Prnt02_CndR.$purc_ret_act_rev);
			}
		}


		/**
		 * 仕入返品票を発行する
		 * 
		 */
		protected void createPurcRetPrnt() {

			for (PurcPrnt_Prnt02_CndR up : up0()) {

				MST_PURC_RET_ACT_R purcRetActR = _lockPurcRetActL.getFirst(_lockPurcRetActKey, up.purc_ret_act_no(), up.purc_ret_act_rev());

				// 未発行で取消の場合は発行しない
				if (!isNull(purcRetActR) && isNotPrntPurcRet(purcRetActR)) {
					continue;
				}

				// 再発行分
				MSBDR_PurcRet repSetCan = null;
				// 新規作成分
				MSBDR_PurcRet repSetNew = null;

				// 再発行データ取得がある場合
				// 印刷データ取得
				if (isReprnt(purcRetActR)) {
					MCReportInfoR infoR;
					if (isNull(purcRetActR)) {
						String lclCd = getPrntLclCd(up.purc_ret_act_no());
						infoR = reprntPurcRet(up.purc_ret_act_no(), up.purc_ret_act_rev().toString(), lclCd, true, null);
					}
					else {
						// 「帳票発行済改訂番号の訂正で帳票発行なし→取り消し」と操作した場合、purc_ret_print_revでは再発行対象が見つからない
						// ので、last_purc_ret_print_revで検索する。
						String srchRev = purcRetActR.purc_ret_act_rev().toString();
						if (purcRetActR.purc_ret_act_rev().gt(purcRetActR.last_purc_ret_print_rev())) {
							srchRev = purcRetActR.last_purc_ret_print_rev().toString();
						}
						infoR = reprntPurcRet(purcRetActR.purc_ret_act_no(), srchRev, purcRetActR.getStringNE("prnt_lcl_cd"), true, null);
					}
					if (isNull(infoR)) {
						return;
					}
					addReprntSetKey(_rePrntPurcRetSet, infoR);
					// reportsetの作成
					repSetNew = (MSBDR_PurcRet) MCServerReportManager.toReportSet(infoR);
					
					// 訂正の場合の取消
					if (isUpdReprintPret(infoR)) {
						MCNumber canRev = isNull(purcRetActR) ? up.purc_ret_act_rev() : purcRetActR.purc_ret_act_rev().subtract(1);
						MCReportInfoR infoCanR;
						if (isNull(purcRetActR)) {
							String lclCd = getPrntLclCd(up.purc_ret_act_no());
							infoCanR = reprntPurcRet(up.purc_ret_act_no(), canRev.toString(), lclCd, false, MAC_RPT_STS_TYP.CAN.value());
						}
						else {
							infoCanR = reprntPurcRet(purcRetActR.purc_ret_act_no(), canRev.toString(), purcRetActR.getStringNE("prnt_lcl_cd"), false,
									MAC_RPT_STS_TYP.CAN.value());
						}

						// reportsetの作成
						repSetCan = (MSBDR_PurcRet) MCServerReportManager.toReportSet(infoCanR);
						if (repSetCan != null) {
							//取消伝票の再発行
							addReprntSetKey(_rePrntPurcRetSet, infoCanR);
							_purcRetReprntMap.put(Arrays.asList(new String[] {purcRetActR.purc_ret_act_no(),
								isNull(purcRetActR) ? up.purc_ret_act_rev().toString() : purcRetActR.purc_ret_act_rev().subtract(1).toString()}), infoCanR);
							_purcRetPrntMap.put(Arrays.asList(new String[] {purcRetActR.purc_ret_act_no(), purcRetActR.purc_ret_act_rev().toString()}),
									new ArrayList<MSBDR_PurcRet>(Arrays.asList(new MSBDR_PurcRet[] {repSetCan})));
						}
					}
					List<MSBDR_PurcRet> l = _purcRetPrntMap.get(Arrays.asList(new String[] {purcRetActR.purc_ret_act_no(), purcRetActR.purc_ret_act_rev().toString()}));
					if (null == l) {
						l = new ArrayList<MSBDR_PurcRet>(Arrays.asList(new MSBDR_PurcRet[] { repSetNew }));
					}
					else {
						l.add(repSetNew);
					}
					_purcRetReprntMap.put(Arrays.asList(new String[] {purcRetActR.purc_ret_act_no(), purcRetActR.purc_ret_act_rev().toString()}), infoR);
					_purcRetPrntMap.put(Arrays.asList(new String[] {purcRetActR.purc_ret_act_no(), purcRetActR.purc_ret_act_rev().toString()}), l);
					continue;
				}

				if (isPrntCan(purcRetActR)) {

					MCReportInfoR infoR = reprntPurcRet(purcRetActR.purc_ret_act_no(), purcRetActR.last_purc_ret_print_rev().toString(),
							purcRetActR.getStringNE("prnt_lcl_cd"), true, null);
					if (!isNull(infoR)) {
					repSetCan = getCanPurcRet(infoR, purcRetActR);
					MCServerReportManager.request(repSetCan, false);
					// 仕入返品実績ヘッダ更新情報設定	
					setPurcRetUpdData(purcRetActR, up, purcRetActR.last_purc_ret_print_rev());
					}
				}

				// 発行データ作成（新規登録、訂正後）
				if (!purcRetActR.can_flg()) {
					repSetNew = createPurcRetReportSet(purcRetActR);
					// 印刷データの登録のみ
					MCServerReportManager.request(repSetNew, false);
					// 仕入返品実績ヘッダ更新情報設定	
					setPurcRetUpdData(purcRetActR, up, purcRetActR.purc_ret_act_rev());
				}

				// 訂正時は、取消注文書、訂正注文書の順でまとめてレポートセットを作成
				if (repSetCan != null) {
					_purcRetPrntMap.put(Arrays.asList(new String[]{purcRetActR.purc_ret_act_no(), purcRetActR.purc_ret_act_rev().toString()}),
							new ArrayList<MSBDR_PurcRet>(Arrays.asList(new MSBDR_PurcRet[]{repSetCan})));
				}
				if (repSetNew != null) {
					List<MSBDR_PurcRet> l = _purcRetPrntMap.get(Arrays.asList(new String[] {purcRetActR.purc_ret_act_no(), purcRetActR.purc_ret_act_rev().toString()}));
					if (null == l) {
						l = new ArrayList<MSBDR_PurcRet>(Arrays.asList(new MSBDR_PurcRet[] { repSetNew }));
					}
					else {
						l.add(repSetNew);
					}
					_purcRetPrntMap.put(Arrays.asList(new String[] {purcRetActR.purc_ret_act_no(), purcRetActR.purc_ret_act_rev().toString() }), l);
				}
			}
		}
		
		
		protected boolean isUpdReprintPret(MCReportInfoR infoR) {
			MSBDR_PurcRet repSet = (MSBDR_PurcRet) MCServerReportManager.toReportSet(infoR);
			String bt = repSet.getBlockType(PurcRetHdrR.create());
			@SuppressWarnings("unchecked")
			MCList<MCRow> hdrL = repSet.getAll(bt);
			if (hdrL == null || hdrL.isEmpty()) {
				return false;
			}
			PurcRetHdrR hdrR = (PurcRetHdrR) hdrL.get(0);
			return MAC_RPT_STS_TYP.isCOR(hdrR.rpt_sts_typ());
		}
		

		protected String getPrntLclCd(String purcRetNo) {
			MAM_BP_R bpR = MAM_BP_R.create();
			MAM_BP_R t = MAM_BP_R.create("T");
			MCQueryApiBuilder bpR_bldr = MCQueryApiBuilder.create(t);
			MST_PURC_RET_ACT_R pret = MST_PURC_RET_ACT_R.create("PRET");
			MCRow bind = MCRow.create();
			bind.addStringColumn("purc_ret_act_no", purcRetNo);
			bpR_bldr.addInnerJoin(pret, bracket(t.bp_cd.eq(pret.sppl_cd)
					.and(pret.purc_ret_act_no.eq(bind("purc_ret_act_no")))));
			dbSelect("MSBDL5200_MAM_BP_S02", bpR, bpR_bldr, bind);
			return bpR.prnt_lcl_cd();
		}
		
		protected void execPrnt(){
			requestPurcRet();
		}
		
		protected boolean existsPurcRet(){
			if (_purcRetPrntMap == null) {
				return false;
			}
			int cnt = _purcRetPrntMap.size();
			if (cnt == 0) {
				return false;
			}
			return true;
		}
		
		protected void requestPurcRet() {
			if (!existsPurcRet()) {
				return;
			}
			// 画面の個別発行フラグがオフの場合、個別発行フラグ取得
			if (!up1().indiv_prnt_flg()) {
				getIndivPrnt();
			}
			// 発注先ごとにMapを作成
			Map<String, List<MSBDR_PurcRet>> lclMap = new LinkedHashMap<String, List<MSBDR_PurcRet>>();
			for (Map.Entry<List<String>, List<MSBDR_PurcRet>> en : _purcRetPrntMap.entrySet()) {

				boolean isInit = false;
				List<MSBDR_PurcRet> lst = null;
				for (MSBDR_PurcRet purcRet : en.getValue()) {
					if (!isInit) {
						lst = lclMap.get(purcRet.getAppToCd1());
						if (lst == null) {
							lst = new ArrayList<MSBDR_PurcRet>();
							lclMap.put(purcRet.getAppToCd1(), lst);
						}
						isInit = true;
					}
					lst.add(purcRet);
				}
				
			}
			
			// ソート処理
			lclMap = purcRetMapSort(lclMap);
			List<MCReportSet> rptSetList = new ArrayList<>();
			for (Map.Entry<String, List<MSBDR_PurcRet>> en : lclMap.entrySet()) {
				MCReportInfoR purcRetReprntInfo = null;
				MCReportSet allRs = null;
				boolean isPurcRetInit = false;
				boolean indivPrntFlg = false;
				
				if (!up1().indiv_prnt_flg()) {
					BpUtil_Sprt01_DtlR bpR = _bpUtil.getFirst(_bpUtilkey, en.getKey());
					indivPrntFlg = bpR.indiv_prnt_flg();
				}
				
				if (up1().indiv_prnt_flg() || indivPrntFlg) {
					// 個別発行
					for (MSBDR_PurcRet purcRet : en.getValue()) {
						if (allRs != null) {
								allRs.setRegister(false);
								MCServerReportManager.requestImmediate(allRs);
							}
						purcRetReprntInfo = getPurcRetReprntInfo(purcRet);
						if (isNull(purcRetReprntInfo)) {
							allRs = purcRet.createInstance();
							allRs.setLocale(purcRet.getLocale());
							allRs.addAll(purcRet.getAll());
							allRs.addWriteListener(new FileWriteListener(rptSetList));
						}
						else {
							allRs = null;
							MCServerReportManager.reprint(purcRetReprntInfo);
						}
					}
					if (allRs != null) {
						// 印刷データを登録しない
						allRs.setRegister(false);
						MCServerReportManager.requestImmediate(allRs);
					}
				}
				else {
					// まとめ発行
					for (MSBDR_PurcRet purcRet : en.getValue()) {
						if (!isPurcRetInit) {
							allRs = purcRet.createInstance();
							allRs.setLocale(purcRet.getLocale());
							isPurcRetInit = true;
						}
						purcRetReprntInfo = getPurcRetReprntInfo(purcRet);
						if (isNull(purcRetReprntInfo)) {
							allRs.addAll(purcRet.getAll());
						}
					}
					if (allRs.size() != 0) {
						MCServerReportManager.request(allRs);
					}
					for (Map.Entry<List<String>, MCReportInfoR> reprntPr : _purcRetReprntMap.entrySet()) {
						if (isSame(reprntPr.getValue().app_to_cd1(), en.getKey())) {
							MCServerReportManager.reprint(reprntPr.getValue());
						}
					}
				}
			}
			//添付帳票登録サービス（更新）の呼び出し
			if(!rptSetList.isEmpty()) {
				callPurcRetAttachSrv(rptSetList);
			}
		}

		protected MCReportInfoR getPurcRetReprntInfo(MSBDR_PurcRet pr) {
			MCReportInfoR info = pr.getReportInfo();
			return _purcRetReprntMap.get(Arrays.asList(new String[] {info.app_report_no1(), info.app_report_no2()}));
		}

		protected void callPurcRetAttachSrv(List<MCReportSet> rsList) {
			
			Map<String, List<Attach_Chk01_DtlR>> up0Map = new LinkedHashMap<String, List<Attach_Chk01_DtlR>>();
			createPurcRetAttachMap(rsList,up0Map);
			
			if(up0Map.isEmpty()) {
				return;
			}
			
			//取消とそれ以外に分けてサービスを呼び出す
			for (Map.Entry<String, List<Attach_Chk01_DtlR>> en : up0Map.entrySet()) {
				MBBCL_AttachService.Attach_Upd01 ope = MBBCL_AttachService.crtAttach_Upd01();
				setPurcRetAttachUp(ope,en);
				ope.exec();
			}
		}
		protected void createPurcRetAttachMap(List<MCReportSet> rsList, Map<String, List<Attach_Chk01_DtlR>> map) {
			for(MCReportSet rs: rsList) {
				//reportSetから、ヘッダを取得する
				String bt = rs.getBlockType(PurcRetHdrR.create());
				
				@SuppressWarnings("unchecked")
				MCList<MCRow> hdrL = rs.getAll(bt);

				if (hdrL == null || hdrL.isEmpty()) {
					continue;
				}
				
				PurcRetHdrR hdrR = (PurcRetHdrR) hdrL.get(0);
				
				//再発行は登録サービス呼び出し対象外
				if(isRePrntPurcRet(hdrR)) {
					continue;
				}
				editPurcRetAttachMap(rs,hdrR,map);
			}
		}
		protected void editPurcRetAttachMap(MCReportSet rs, PurcRetHdrR hdrR,Map<String, List<Attach_Chk01_DtlR>> map) {
			Attach_Chk01_DtlR up0 = Attach_Chk01_DtlR.create();
			copy(up0, hdrR, createMap_Attach_Chk01_DtlR_PurcRetHdrR());
			//WG
			up0.wg_cd(getWgCd(hdrR.purc_dpt_cd(), hdrR.purc_ret_dt()));
			//帳票ID
			up0.report_id(rs.getReportInfo().report_id());
			//添付元ファイル(バイナリ）
			up0.file_bin(rs.getReportInfo().save_file_bin());
			
			List<Attach_Chk01_DtlR> l = map.get(MAC_RPT_STS_TYP.isCAN(hdrR.rpt_sts_typ()) ? "CAN": "OTHER"); 
			if(null == l) {
				l = new ArrayList<Attach_Chk01_DtlR>(Arrays.asList(new Attach_Chk01_DtlR[]{up0}));
			}else {
				l.add(up0);
			}
			if(MAC_RPT_STS_TYP.isCAN(hdrR.rpt_sts_typ())) {
				map.put("CAN",l);
			}else {
				map.put("OTHER", l);
			}
		}
		protected void setPurcRetAttachUp(MBBCL_AttachService.Attach_Upd01 ope,Map.Entry<String, List<Attach_Chk01_DtlR>> en) {
			ope.up0().addAll(en.getValue());
			ope.up1().upd_cntr_chk_flg(false);
			ope.up1().del_flg(isSame(en.getKey(),"CAN") ? true : false);
		}
		protected Boolean isRePrntPurcRet(PurcRetHdrR hdrR) {
			List<String> list = new ArrayList<>();
			list.add(hdrR.purc_ret_act_no());//no
			list.add(hdrR.purc_ret_act_rev().toString());//rev
			list.add(hdrR.rpt_sts_typ());//区分
			
			if(_rePrntPurcRetSet.contains(list)) {
				return true;
			}
			return false;
		}
		protected Map_Attach_Chk01_DtlR_PurcRetHdrR<Attach_Chk01_DtlR, PurcRetHdrR> createMap_Attach_Chk01_DtlR_PurcRetHdrR() {
			return new Map_Attach_Chk01_DtlR_PurcRetHdrR<Attach_Chk01_DtlR, PurcRetHdrR>();
		}
		
		public class Map_Attach_Chk01_DtlR_PurcRetHdrR<D extends Attach_Chk01_DtlR, S extends PurcRetHdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Attach_Chk01_DtlR.$biz_key1, PurcRetHdrR.$purc_ret_act_no);//仕入返品実績ＮＯ
				addColumnPathMap(Attach_Chk01_DtlR.$dt, PurcRetHdrR.$purc_ret_dt);//仕入返品日
				addColumnPathMap(Attach_Chk01_DtlR.$bp_cd, PurcRetHdrR.$sppl_cd);//発注先CD
				addColumnPathMap(Attach_Chk01_DtlR.$cur_cd, PurcRetHdrR.$trd_cur_cd);//取引通貨ＣＤ
				addColumnPathMap(Attach_Chk01_DtlR.$purc_dpt_cd, PurcRetHdrR.$purc_dpt_cd);//購買部門CD
				addColumnPathMap(Attach_Chk01_DtlR.$sppl_cd, PurcRetHdrR.$sppl_cd);//発注先ＣＤ
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				MST_PURC_RET_ACT_R purcRetActR = _lockPurcRetActL.getFirst(_lockPurcRetActKey, src.purc_ret_act_no());
				if (!isNull(purcRetActR)) {
					dest.cur_cd(purcRetActR.getStringNE("cur_cd"));
				}
				dest.biz_typ(MAC_BIZ_TYP.PURC_RET.value());//業務区分：仕入返品
				dest.biz_key2(src.purc_ret_act_rev().toString());//仕入返品実績改訂番号はNum→Str変換してセット
				dest.amt(nvl(src.ttl_amt(), MCNumber.ZERO).add(nvl(src.ttl_tax_amt(), MCNumber.ZERO)));//税込金額合計
				dest.attach_file_flg(true);//ファイル添付フラグ
			}
		}
		
		/**
		 * 再発行情報を取得する
		 */
		protected MCReportInfoR reprntPurcRet(String pretActNo, String revNo, String lclCd, boolean isLatest, String repSts ) {

			MSBDR_PurcRet purcRetPrnt = MSBDR_PurcRet.create();

			purcRetPrnt.setAppReportNo1(pretActNo);
			purcRetPrnt.setAppReportNo2(revNo);
			purcRetPrnt.setLocale(toLocaleFromLclCd(lclCd));
			if (!isNull(repSts)) {
				purcRetPrnt.setAppReportSts1(repSts);
			}
			//最新のみ検索する
			if (isLatest) {
				purcRetPrnt.setAppReportSts2("1");
			}
			

			// 印刷データからデータを取得
			MCList<MCReportInfoR> infoL = MCServerReportManager.searchPrintData(purcRetPrnt, false);
			if (infoL == null) {
				return null;
			}
			return infoL.get(0);
		}

		/**
		 * 取消発行情報を取得する
		 * 
		 * @param infoR
		 * @param purcRetActR
		 * @return
		 */
		protected MSBDR_PurcRet getCanPurcRet(MCReportInfoR infoR, MST_PURC_RET_ACT_R purcRetActR) {

			MSBDR_PurcRet repSet = (MSBDR_PurcRet) MCServerReportManager.toReportSet(infoR);

				String bt = repSet.getBlockType(PurcRetHdrR.create());
				String btd = repSet.getBlockType(PurcRetDtlR.create());
				@SuppressWarnings("unchecked")
				MCList<MCRow> hdrL = repSet.getAll(bt);
				@SuppressWarnings("unchecked")
				MCList<MCRow> dtlL = repSet.getAll(btd);
				if (hdrL == null || hdrL.isEmpty()) {
					return null;
				}

				// 訂正、取消前データの最新ＦＬＧをオフにする
				infoR.app_report_sts2("0");
				MCServerReportManager.updatePrintData(infoR);

				// 訂正、取消後のデータ作成
				PurcRetHdrR hdrR = (PurcRetHdrR) hdrL.get(0);
				hdrR.rpt_sts_typ(MAC_RPT_STS_TYP.CAN.value());
				MAC_RPT_STS_TYP.putNameNE(hdrR, PoHdrR.$rpt_sts_typ, PoHdrR.$rpt_sts_typ_nm, repSet.getLocale());
				MSBDR_PurcRet newRepSet = MSBDR_PurcRet.create();
				newRepSet.addRow(hdrR);
				newRepSet.addAll(dtlL);
				newRepSet.setLocale(repSet.getLocale());
				setPretBisInfo(newRepSet, hdrR);
				return newRepSet;

		}

		/**
		 * 印刷データを作成する
		 * 
		 * @param purcRetActR
		 * @return
		 */
		protected MSBDR_PurcRet createPurcRetReportSet(MST_PURC_RET_ACT_R purcRetActR) {

			MSBDR_PurcRet repSet = MSBDR_PurcRet.create();
			PurcRetHdrR hdrR = createPurcRetHdr(purcRetActR);
			MCList<PurcRetDtlR> dtlL = createPurcRetDtl(hdrR);
			repSet.setLocale(toLocaleFromLclCd(hdrR.getStringNE("prnt_lcl_cd")));
			editPurcRetData(hdrR, dtlL, repSet, purcRetActR);
			repSet.addRow(hdrR);
			repSet.addAll(dtlL);
			return repSet;
		}

		/**
		 * ヘッダを検索する
		 * 
		 * @param purcRetActR
		 * @return
		 */
		protected PurcRetHdrR createPurcRetHdr(MST_PURC_RET_ACT_R purcRetActR) {

			PurcRetHdrR hdrR = PurcRetHdrR.create();
			executeQuery(hdrR, MSBDL5200_MST_PURC_RET_ACT_S01(), purcRetActR);
			return hdrR;
		}

		/**
		 * 明細を検索する
		 * 
		 * @param hdrR
		 * @return
		 */
		protected MCList<PurcRetDtlR> createPurcRetDtl(PurcRetHdrR hdrR) {

			MCList<PurcRetDtlR> dtlL = MCList.create(PurcRetDtlR.class);
			executeQuery(dtlL, MSBDL5200_MST_PURC_RET_ACT_D_S01(), hdrR);
			return dtlL;
		}

		/**
		 * 印刷データを編集する
		 * 
		 * @param hdrR
		 * @param dtlL
		 * @param repSet
		 * @param purcRetActR
		 */
		protected void editPurcRetData(PurcRetHdrR hdrR, MCList<PurcRetDtlR> dtlL, MSBDR_PurcRet repSet, MST_PURC_RET_ACT_R purcRetActR) {

			setRptStsTyp(hdrR, purcRetActR);
			MAC_RPT_STS_TYP.putNameNE(hdrR, PurcRetHdrR.$rpt_sts_typ, PurcRetHdrR.$rpt_sts_typ_nm, repSet.getLocale());
			// 帳票出力ロケールでの会社名がNULLならログインロケールの会社名をセット
			if(isNull(hdrR.co_nm())){
				hdrR.co_nm(getCo().co_nm());
			}
			hdrR.print_hm(_prntHm);
			hdrR.ttl_amt(dtlL.sum(PurcRetDtlR.$trd_cur_amt));
			hdrR.ttl_tax_amt(dtlL.sum(PurcRetDtlR.$trd_cur_tax_amt));
			hdrR.sppl_addr(concatAddress(hdrR.sppl_addr1(), hdrR.sppl_addr2(), hdrR.sppl_addr3(), hdrR.sppl_addr4()));
			hdrR.dpt_addr(concatAddress(hdrR.dpt_addr1(), hdrR.dpt_addr2(), hdrR.dpt_addr3(), hdrR.dpt_addr4()));
			hdrR.ret_sppl_addr(concatAddress(hdrR.ret_sppl_addr1(), hdrR.ret_sppl_addr2(), hdrR.ret_sppl_addr3(), hdrR.ret_sppl_addr4()));
			putNumStr(repSet, hdrR, PurcRetHdrR.$s_ttl_amt, PurcRetHdrR.$ttl_amt, hdrR.getNumberNE("amt_dec_place"));
			putNumStr(repSet, hdrR, PurcRetHdrR.$s_ttl_tax_amt, PurcRetHdrR.$ttl_tax_amt, hdrR.getNumberNE("amt_dec_place"));

			for (PurcRetDtlR dtlR : dtlL) {
				// 印字はどちらか片方 
				dtlR.itm_nm(MCBooleanUtil.dbStringToBoolean(purcRetActR.getString("sppl_iv_flg")) ? dtlR.iv_itm_nm() : dtlR.itm_nm());
				dtlR.t_interim(dtlR.interim_flg() ? MAC_STR.PRNT_INTERIM.name(repSet.getLocale()) : null);
				dtlR.t_inc_tax(dtlR.inc_tax_flg() ? MAC_STR.PRNT_INC_TAX.name(repSet.getLocale()) : null);
				dtlR.ver_no_lbl(isNull(dtlR.ver_no()) ? null : MSC_INSP_PRNT_STR.VER_NO.name(repSet.getLocale()));
				dtlR.addNumberColumn("amt_dec_place", hdrR.getNumberNE("amt_dec_place"));
				dtlR.addNumberColumn("upri_dec_place", hdrR.getNumberNE("upri_dec_place"));

			}

			putPrntItmSub1(dtlL, PurcRetDtlR.$itm_sub1_view, PurcRetDtlR.$itm_sub1_data);
			putPrntItmSub2(dtlL, PurcRetDtlR.$itm_sub2_view, PurcRetDtlR.$itm_sub2_data);
			putPrntItmSub3(dtlL, PurcRetDtlR.$itm_sub3_view, PurcRetDtlR.$itm_sub3_data);

			putNumStr(repSet, dtlL, PurcRetDtlR.$s_int_trd_unit_qty, PurcRetDtlR.$s_dec_trd_unit_qty, PurcRetDtlR.$trd_unit_qty, "unit_dec_place");
			putNumStr(repSet, dtlL, PurcRetDtlR.$s_int_trd_cur_upri, PurcRetDtlR.$s_dec_trd_cur_upri, PurcRetDtlR.$trd_cur_upri, "upri_dec_place");
			putNumStr(repSet, dtlL, PurcRetDtlR.$s_int_trd_cur_amt, PurcRetDtlR.$s_dec_trd_cur_amt, PurcRetDtlR.$trd_cur_amt, "amt_dec_place");
			putNumStr(repSet, dtlL, PurcRetDtlR.$s_int_trd_cur_tax_amt, PurcRetDtlR.$s_dec_trd_cur_tax_amt, PurcRetDtlR.$trd_cur_tax_amt, "amt_dec_place");
			putNumStr(repSet, dtlL, PurcRetDtlR.$s_int_trd_cur_dscnt_amt, PurcRetDtlR.$s_dec_trd_cur_dscnt_amt, PurcRetDtlR.$trd_cur_dscnt_amt,	"amt_dec_place");
			putNumStr(repSet, dtlL, PurcRetDtlR.$s_int_trd_cur_proc_upri, PurcRetDtlR.$s_dec_trd_cur_proc_upri, PurcRetDtlR.$trd_cur_proc_upri, "upri_dec_place");
			putNumStr(repSet, dtlL, PurcRetDtlR.$s_int_trd_cur_proc_amt, PurcRetDtlR.$s_dec_trd_cur_proc_amt, PurcRetDtlR.$trd_cur_proc_amt, "amt_dec_place");
			putNumStr(repSet, dtlL, PurcRetDtlR.$s_int_trd_cur_onr_prov_upri, PurcRetDtlR.$s_dec_trd_cur_onr_prov_upri, PurcRetDtlR.$trd_cur_onr_prov_upri, "upri_dec_place");
			putNumStr(repSet, dtlL, PurcRetDtlR.$s_int_trd_cur_onr_prov_amt, PurcRetDtlR.$s_dec_trd_cur_onr_prov_amt, PurcRetDtlR.$trd_cur_onr_prov_amt, "amt_dec_place");
			setPretBisInfo(repSet, hdrR);
		}

		protected void setRptStsTyp(PurcRetHdrR hdrR, MST_PURC_RET_ACT_R purcRetActR) {
			if (isCrtPurcRet(purcRetActR)) {
				hdrR.rpt_sts_typ(MAC_RPT_STS_TYP.CRT.value());
			}
			else if (isUpdPurcRet(purcRetActR)) {
				hdrR.rpt_sts_typ(MAC_RPT_STS_TYP.COR.value());
			}
			else if (isCanPurcRet(purcRetActR)) {
				hdrR.rpt_sts_typ(MAC_RPT_STS_TYP.CAN.value());
			}

		}

		/**
		 * 業務情報を設定する
		 * 
		 * @param repSet
		 * @param hdrR
		 */
		protected void setPretBisInfo(MSBDR_PurcRet repSet, PurcRetHdrR hdrR) {
			repSet.setAppReportNo1(hdrR.purc_ret_act_no());
			repSet.setAppReportNo2(hdrR.purc_ret_act_rev().toString());
			repSet.setAppReportSts1(hdrR.rpt_sts_typ());
			repSet.setAppReportStsNm1(hdrR.rpt_sts_typ_nm());
			repSet.setAppUsrCd1(hdrR.purc_usr_cd());
			repSet.setAppUsrNm1(hdrR.purc_usr_nm());
			repSet.setAppUsrCd2(hdrR.purc_dpt_cd());
			repSet.setAppUsrNm2(hdrR.purc_dpt_nm());
			repSet.setAppToCd1(hdrR.sppl_cd());
			repSet.setAppToNm1(hdrR.sppl_nm());
			repSet.setAppToNm2(hdrR.ret_sppl_nm());
			repSet.setAppRmrks1(hdrR.purc_ret_print_rmrks());
			// 最新ＦＬＧ。「1」が最新。
			// 訂正、取消によって同じリビジョンの印刷データが複数になる場合、過去の印刷データの値が「0」になる。
			repSet.setAppReportSts2("1");
			
		}

		/**
		 * 仕入返品実績ヘッダの更新情報を設定する
		 * 
		 * @param purcRetActR
		 * @param up
		 */
		protected void setPurcRetUpdData(MST_PURC_RET_ACT_R purcRetActR, PurcPrnt_Prnt02_CndR up, MCNumber rev) {

			MST_PURC_RET_ACT_R updPurcRetActR = MST_PURC_RET_ACT_R.create();
			updPurcRetActR.purc_ret_act_no(purcRetActR.purc_ret_act_no());
			updPurcRetActR.purc_ret_act_rev(purcRetActR.purc_ret_act_rev());
			updPurcRetActR.purc_ret_print_flg(true);
			updPurcRetActR.last_purc_ret_print_rev(rev);
			updPurcRetActR.purc_ret_print_dt(_prntHm);
			_updPurcRetActL.add(updPurcRetActR);
		}

		/**
		 * 個別発行取得の呼び出し
		 */
		protected void getIndivPrnt() {
			// 仕入返品票の仕入返品実績NOから発注先を検索→発注先を個別発行処理に連携→フラグ取得
			// 仕入返品実績ヘッダの取得
			MCList<MST_PURC_RET_ACT_R> purcRetActL = MCList.create(MST_PURC_RET_ACT_R.class);
			MST_PURC_RET_ACT_R t = MST_PURC_RET_ACT_R.create("T");
			MCQueryApiBuilder purcRetActL_bldr = MCQueryApiBuilder.create(t);
			purcRetActL_bldr.setSelect(t.sppl_cd);
			purcRetActL_bldr.setWhere(t.purc_ret_act_no.eq(bind("purc_ret_act_no")));
			dbSelect("MSBDL5200_MST_PURC_RET_ACT_S02", purcRetActL, purcRetActL_bldr, up0());
			
			MSUCL_BpUtil.BpUtil_Sprt01 ope = MSUCL_BpUtil.crtBpUtil_Sprt01();
			ope.up0().bp_typ(MAC_BP_IS_SRCH_TYP.SPPL.value());
			for (MST_PURC_RET_ACT_R purcRetActR : purcRetActL.groupBy(MST_PURC_RET_ACT_R.$sppl_cd)) {
				BpUtil_Sprt01_DtlR dtlR = BpUtil_Sprt01_DtlR.create();
				dtlR.bp_cd(purcRetActR.sppl_cd());
				ope.up1().add(dtlR);
			}
			ope.exec();
			
			_bpUtil = ope.down0();
			_bpUtilkey = _bpUtil.createIndex(BpUtil_Sprt01_DtlR.$bp_cd);
		}
		
		/**
		 * 仕入返品票ソート
		 * @param map
		 * @return
		 */
		protected Map<String, List<MSBDR_PurcRet>> purcRetMapSort(Map<String, List<MSBDR_PurcRet>> map) {
			// 仕入返品票ReportSetマップソート（発注先順）
			List<Entry<String, List<MSBDR_PurcRet>>> entries = new ArrayList<Entry<String, List<MSBDR_PurcRet>>>(map.entrySet());
			Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));

			LinkedHashMap<String, List<MSBDR_PurcRet>> result = new LinkedHashMap<>();
			for (Map.Entry<String, List<MSBDR_PurcRet>> entry : entries) {
				result.put(entry.getKey(), entry.getValue());
			}

			return result;
		}
		
		/**
		 * 仕入返品実績ヘッダを更新する
		 */
		protected void upd() {

			MST_PURC_RET_ACT_R updPurcRetActL_t = MST_PURC_RET_ACT_R.create("T");
			MCQueryApiBuilder updPurcRetActL_bldr = MCQueryApiBuilder.create(updPurcRetActL_t);
			updPurcRetActL_bldr.setSet(updPurcRetActL_t.purc_ret_print_dt);
			updPurcRetActL_bldr.addSet(updPurcRetActL_t.purc_ret_print_flg);
			updPurcRetActL_bldr.addSet(updPurcRetActL_t.last_purc_ret_print_rev);
			dbUpdateKey("MSBDL5200_MST_PURC_RET_ACT_U01", _updPurcRetActL, updPurcRetActL_bldr);

			// 改訂履歴データ更新サービス呼出（仕入返品実績改訂履歴テーブル更新）
			callRevDataServiceIns01();
		}

		/**
		 * 改訂履歴データ更新サービスの改訂履歴データ更新リスト登録処理を呼び出す。
		 * 仕入返品実績訂履歴テーブルを更新する。
		 */
		protected void callRevDataServiceIns01() {
			if (_updPurcRetActL.size() > 0) {
				MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
				for (MST_PURC_RET_ACT_R r : _updPurcRetActL) {
					RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
					opeR.rev_data_src_no(r.purc_ret_act_no());
					opeR.rev_no(r.purc_ret_act_rev());
					opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_PURC_RET_ACT.value());
					ope.up0().add(opeR);
				}
				ope.exec();
			}
		}

		protected boolean isPrntCan(MST_PURC_RET_ACT_R purcRetActR) {
			return (purcRetActR.can_flg() && !isNull(purcRetActR.last_purc_ret_print_rev())) || isUpdPurcRet(purcRetActR);
		}
	
		protected boolean isReprnt(MST_PURC_RET_ACT_R purcRetActR) {
			return isNull(purcRetActR) || purcRetActR.purc_ret_print_flg();
		}
		
		protected boolean isCanPurcRet(MST_PURC_RET_ACT_R purcRetActR) {
			return purcRetActR.can_flg() && !isNotPrntPurcRet(purcRetActR);
		}

		protected boolean isCrtPurcRet(MST_PURC_RET_ACT_R purcRetActR) {
			return isSame(purcRetActR.purc_ret_act_rev(), MCNumber.ONE) && !purcRetActR.can_flg();
		}

		protected boolean isUpdPurcRet(MST_PURC_RET_ACT_R purcRetActR) {
			return !isSame(purcRetActR.purc_ret_act_rev(), MCNumber.ONE) && !isReprnt(purcRetActR) && !isCanPurcRet(purcRetActR);
		}

		protected boolean isNotPrntPurcRet(MST_PURC_RET_ACT_R purcRetActR) {
			return isNull(purcRetActR.last_purc_ret_print_rev()) && purcRetActR.can_flg();
		}
	}
	
	/**
	 * PurcPrnt_Upd02オペレーション.<p>
	 *
	 * 仕入直送の納品伝票・明細トランザクションを作成する<br>
	 */
	public class PurcPrnt_Upd02 extends MSBDL_PurcPrntService_MC_A.PurcPrnt_Upd02 {
		
		/**
		 * 出荷帳票発行サービス（仕入直送納品書用）
		 */
		protected MSBEL_ShipRprtPrntService.ShipRprt_Upd03 _upd03;
		
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			initCache();
			callShipRprtUpd03();
			setDown();
		}
		
		/**
		 * トランザクションをキャッシュする
		 */
		protected void initCache() {
			initArrSchdCache();
		}
		
		/**
		 * 納品伝票を作成する
		 */
		protected void callShipRprtUpd03() {
			MCList<PurcPrnt_Upd02_HdrR> delL = MCList.create(PurcPrnt_Upd02_HdrR.class);
			MCList<PurcPrnt_Upd02_HdrR> updL = MCList.create(PurcPrnt_Upd02_HdrR.class);
			up0().forEach(r -> {
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					delL.add(r);
				}
				else {
					updL.add(r);
				}
			});
			
			_upd03 = MSBEL_ShipRprtPrntService.crtShipRprt_Upd03();
			setShipRprtDel(delL);
			setShipRprtUpd(updL);
			
			if (!_upd03.up0().isEmpty()) {
				_upd03.exec();
				
				aftrCallShipRprtUpd03(updL, delL);
			}
		}
		protected void setShipRprtDel(MCList<PurcPrnt_Upd02_HdrR> up0L) {
			int pegNo = getMaxPegNo();
			for (PurcPrnt_Upd02_HdrR up0R : up0L) {
				ShipRprt_Upd03_HdrR hdrR = _upd03.up0().add();
				hdrR.peg_no(++pegNo);
				hdrR.po_no(up0R.po_no());
				hdrR.data_crud_typ(up0R.data_crud_typ());
				hdrR.dlv_slip_prnt_flg(up0R.dlv_slip_prnt_flg());
				hdrR.bndl_prnt_flg(!up0R.indiv_prnt_flg());
				hdrR.setAttributes(up0R);
			}
		}
		protected void setShipRprtUpd(MCList<PurcPrnt_Upd02_HdrR> up0L) {
			int pegNo = getMaxPegNo();
			for (PurcPrnt_Upd02_HdrR up0R : up0L) {
				MCList<MST_ARR_SCHD_R> asL = up0R.getJoined(_arrSchdJk);
				
				// （仕入直送の納品書の）明細の並び順は受注に合わせる
				asL.sort(
					MST_SLO_D_R.$slo_no,
					MST_SLO_D_R.$disp_seq,
					MST_SHIP_SCHD_R.$ship_schd_no
				);
				
				for (MST_ARR_SCHD_R asR : asL) {
					ShipRprt_Upd03_HdrR hdrR = _upd03.up0().add();
					hdrR.peg_no(++pegNo);
					hdrR.po_no(up0R.po_no());
					hdrR.data_crud_typ(up0R.data_crud_typ());
					hdrR.arr_schd_no(asR.arr_schd_no());
					hdrR.ship_schd_no(asR.getStringNE(MST_SHIP_SCHD_R.$ship_schd_no));
					hdrR.dlv_slip_prnt_flg(up0R.dlv_slip_prnt_flg());
					hdrR.bndl_prnt_flg(!up0R.indiv_prnt_flg());
					hdrR.setAttributes(up0R);
				}
			}
		}
		protected int getMaxPegNo() {
			MCNumber n = (MCNumber)_upd03.up0().max(ShipRprt_Upd03_HdrR.$peg_no);
			return isNull(n) ? 0 : n.intValue();
		}
		
		/**
		 * 納品伝票作成の後処理を行う
		 */
		protected void aftrCallShipRprtUpd03(MCList<PurcPrnt_Upd02_HdrR> updL, MCList<PurcPrnt_Upd02_HdrR> delL) {
			// 購買納品伝票トランに仕入直納の納品書情報を反映する
			updPurcDlvSlip(updL, delL);
		}
		protected void updPurcDlvSlip(MCList<PurcPrnt_Upd02_HdrR> updL, MCList<PurcPrnt_Upd02_HdrR> delL) {
			
			MCList<MST_PURC_DLV_SLIP_D_R> updSlipDL  = MCList.create(MST_PURC_DLV_SLIP_D_R.class);
			updSlipDL.addAll(crtPurcDlvSlipL4Upd(updL));
			updSlipDL.addAll(crtPurcDlvSlipL4Del(delL));
		
			MST_PURC_DLV_SLIP_D_R t = MST_PURC_DLV_SLIP_D_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSet(
				t.purc_ddlv_dlv_slip_no, t.purc_ddlv_dlv_slip_seq, t.purc_ddlv_dlv_slip_d_no
			);
			dbUpdateKey("MSBDL5200_MST_PURC_DLV_SLIP_U04", updSlipDL, bldr);
		}
		protected MCList<MST_PURC_DLV_SLIP_D_R> crtPurcDlvSlipL4Upd(MCList<PurcPrnt_Upd02_HdrR> updL) {
			// 新規・更新分は出荷帳票発行サービスから更新情報を作成する
			MCList<MST_PURC_DLV_SLIP_D_R> updSlipDL  = MCList.create(MST_PURC_DLV_SLIP_D_R.class);
			
			MCIndexKey idx = _upd03.down0().createIndex(ShipRprt_Upd03_HdrR.$arr_schd_no);
			for (PurcPrnt_Upd02_HdrR up0R : updL) {
				for (MST_ARR_SCHD_R asR : up0R.getJoined(_arrSchdJk)) {
					ShipRprt_Upd03_HdrR downR = _upd03.down0().getFirst(idx, asR.arr_schd_no());
					
					// 購買納品伝票と紐付け
					MST_PURC_DLV_SLIP_D_R updSlipDR = updSlipDL.add();
					updSlipDR.dlv_slip_mng_d_no(asR.dlv_slip_mng_d_no());
					updSlipDR.dlv_slip_mng_d_seq(asR.dlv_slip_mng_d_seq());
					if (!isNull(downR)) {
						updSlipDR.purc_ddlv_dlv_slip_no(downR.dlv_slip_no());
						updSlipDR.purc_ddlv_dlv_slip_seq(downR.dlv_slip_seq());
						updSlipDR.purc_ddlv_dlv_slip_d_no(downR.dlv_slip_d_no());
					}
				}
			}
			return updSlipDL;
		}
		protected MCList<MST_PURC_DLV_SLIP_D_R> crtPurcDlvSlipL4Del(MCList<PurcPrnt_Upd02_HdrR> delL) {
			// 削除分は出荷帳票発行サービスから下り電文が返ってこないので、最新の納品伝票トランから更新情報を作成する
			MST_PURC_DLV_SLIP_D_R t1 = MST_PURC_DLV_SLIP_D_R.create("T1");
			MSW_PO_KEY_R w1 = MSW_PO_KEY_R.create("W1");
			MST_PURC_DLV_SLIP_R w2 = MST_PURC_DLV_SLIP_R.create("W2");
			MST_DLV_SLIP_R w3 = MST_DLV_SLIP_R.create("W3");
			MCTempView v1 = createTempView("V1");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
			bldr.setSelect(
				t1.dlv_slip_mng_d_no, t1.dlv_slip_mng_d_seq,
				t1.purc_ddlv_dlv_slip_no, t1.purc_ddlv_dlv_slip_d_no,
				subQuery()
					.select(max(w3.dlv_slip_seq))
					.from(w3)
					.where(
						w3.dlv_slip_no.eq(t1.purc_ddlv_dlv_slip_no)
						.and(w3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CAN.value())))
					)
					.as("purc_ddlv_dlv_slip_seq")
			);
			bldr.addInnerJoin(subQuery()
				.select(
					w2.dlv_slip_mng_no,
					max(w2.dlv_slip_mng_seq).as("dlv_slip_mng_seq")
				)
				.from(w1
					.innerJoin(w2).on(
						w2.po_no.eq(w1.po_no)
						.and(w2.purc_dlv_slip_src_typ.eq(value(MSC_PURC_DLV_SLIP_SRC_TYP.PO.value())))
						.and(w2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CAN.value())))
					)
				)
				.groupBy(
					w2.dlv_slip_mng_no
				)
				.view(v1), 
					t1.dlv_slip_mng_no.eq(v1.pr("dlv_slip_mng_no"))
					.and(t1.dlv_slip_mng_seq.eq(v1.pr("dlv_slip_mng_seq")))
			);
			
			delPoWk();
			insPoWk(delL);
			
			MCList<MST_PURC_DLV_SLIP_D_R> updSlipDL = MCList.create(MST_PURC_DLV_SLIP_D_R.class);
			dbSelect("MSBDL5200_MST_PURC_DLV_SLIP_D_S08", updSlipDL, bldr);
			
			delPoWk();
			return updSlipDL;
		}
		protected void insPoWk(MCList<PurcPrnt_Upd02_HdrR> delL) {
			dbWkInsert("MSBDL5200_MSW_PO_I03", delL, MST_PO_R.create("T"));
		}
		protected void delPoWk() {
			dbWkDelete("MSBBL5200_MSW_PO_D01", MST_PO_R.create("T"));
		}
		
		/**
		 * 下り電文を設定する
		 */
		protected void setDown(	) {
			setDown0();
			setDown1();
		}
		protected void setDown0() {
			down0().setAll(up0());
		}
		protected void setDown1() {
			// 出荷帳票発行サービスの下り電文を設定する
			MCList<PurcPrnt_Upd02_DtlR> downL = MCList.create(PurcPrnt_Upd02_DtlR.class);
			MCIndexKey idx = _upd03.down0().createIndex(ShipRprt_Upd03_HdrR.$arr_schd_no);
			for (PurcPrnt_Upd02_HdrR up0R : up0()) {
				for (MST_ARR_SCHD_R asR : up0R.getJoined(_arrSchdJk)) {
					ShipRprt_Upd03_HdrR rptDownR = _upd03.down0().getFirst(idx, asR.arr_schd_no());
					
					PurcPrnt_Upd02_DtlR downR = downL.add();
					downR.hdr_peg_no(up0R.hdr_peg_no());
					downR.arr_schd_no(asR.arr_schd_no());
					downR.setAttributes(up0R);
					
					MST_PURC_DLV_SLIP_D_R slipDR = downR.pdsd();
					slipDR.po_d_no(asR.getStringNE(MST_PURC_DLV_SLIP_D_R.$po_d_no));
					slipDR.dlv_inst_d_no(asR.dlv_inst_d_no());
					slipDR.prms_rcpt_d_no(asR.prms_rcpt_d_no());
					if (!isNull(rptDownR)) {
						slipDR.purc_ddlv_dlv_slip_no(rptDownR.dlv_slip_no());
						slipDR.purc_ddlv_dlv_slip_seq(rptDownR.dlv_slip_seq());
						slipDR.purc_ddlv_dlv_slip_d_no(rptDownR.dlv_slip_d_no());
						downR.purc_ddlv_dlv_slip_rev(rptDownR.dlv_slip_rev());
					}
				}
			}
			down1().setAll(downL);
		}
		
		/**
		 * 納品伝票明細から入荷予定を特定するJoinキー
		 */
		protected MCJoinKey<MCList<MST_ARR_SCHD_R>> _arrSchdJk;
		
		/**
		 * 入荷予定キャッシュ
		 */
		protected MCList<MST_ARR_SCHD_R> _arrSchdL;
		protected void initArrSchdCache() {
			MST_PO_D_R t1 = MST_PO_D_R.create("T1");
			MST_ARR_PR_R t2 = MST_ARR_PR_R.create("T2");
			MST_ARR_SCHD_R t3 = MST_ARR_SCHD_R.create("T3");
			MST_PURC_SCHD_R t4 = MST_PURC_SCHD_R.create("T4");
			MST_SLS_SCHD_R t5 = MST_SLS_SCHD_R.create("T5");
			MST_SLO_D_R t6 = MST_SLO_D_R.create("T6");
			MST_SLO_R t7 = MST_SLO_R.create("T7");
			MST_PURC_DLV_SLIP_D_R t8 = MST_PURC_DLV_SLIP_D_R.create("T8");
			MAM_BP_R m1 = MAM_BP_R.create("M1");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
			bldr.setSelect(
				t1.po_no,
				t3.arr_schd_no, t3.dlv_slip_mng_d_no, t3.dlv_slip_mng_d_seq,
				t5.ship_schd_no, t6.slo_no, t6.disp_seq,
				t8.po_d_no, t8.dlv_inst_d_no, t8.prms_rcpt_d_no
			);
			bldr.addInnerJoin(t2, t2.po_d_no.eq(t1.po_d_no));
			bldr.addInnerJoin(t3, t3.arr_pr_no.eq(t2.arr_pr_no));
			bldr.addInnerJoin(t4, t4.arr_schd_no.eq(t3.arr_schd_no));
			bldr.addInnerJoin(t5, t5.purc_schd_no.eq(t4.purc_schd_no).and(t5.purc_act_d_no.isNull()));
			bldr.addInnerJoin(t6, t6.slo_d_no.eq(t5.slo_d_no));
			bldr.addInnerJoin(t7, t7.slo_no.eq(t6.slo_no));
			// 入荷予定の持つＮＯが購買納品伝票トランに存在する明細のみを、仕入直送納品書の対象とする
			bldr.addInnerJoin(t8,
				t8.dlv_slip_mng_d_no.eq(t3.dlv_slip_mng_d_no)
				.and(t8.dlv_slip_mng_d_seq.eq(t3.dlv_slip_mng_d_seq))
			);
			bldr.addInnerJoin(m1, m1.bp_cd.eq(t7.cst_cd));
			bldr.setWhere(t1.po_no.eq(bind("po_no")));
			bldr.addConstWhereWithAnd(t3.abort_flg.eq(value(false)));
			// 納品書を作成する対象はインボイス取引対象外のみ
			bldr.addConstWhereWithAnd(m1.cst_iv_flg.eq(value(false)));
			
			_arrSchdL = MCList.create(MST_ARR_SCHD_R.class);
			_arrSchdL.addStringColumn(MST_PO_D_R.$po_no);
			_arrSchdL.addStringColumn(MST_SHIP_SCHD_R.$ship_schd_no);
			_arrSchdL.addStringColumn(MST_SLO_D_R.$slo_no);
			_arrSchdL.addNumberColumn(MST_SLO_D_R.$disp_seq);
			_arrSchdL.addStringColumn(MST_PURC_DLV_SLIP_D_R.$po_d_no);
			
			dbSelect("MSBDL5200_MST_ARR_SCHD_S04", _arrSchdL, bldr, up0());
			
			_arrSchdJk = up0().join(
				PurcPrnt_Upd02_HdrR.$po_no,
				_arrSchdL, MST_PO_D_R.$po_no);
		}
	}


	/**
	 * 再発行の帳票情報をセットに追加する
	 */
	protected void addReprntSetKey(Set<List<String>> tgtSet,MCReportInfoR infoR) {
		List<String> keyLst = createReprntSetKey(infoR);
		if(!tgtSet.contains(keyLst)) {
			tgtSet.add(keyLst);
		}
	}
	protected List<String> createReprntSetKey(MCReportInfoR infoR){
		List<String> list = new ArrayList<>();
		if (!isNull(infoR)) {
			list.add(infoR.app_report_no1());//no
			list.add(infoR.app_report_no2());//rev
			list.add(infoR. app_report_sts1());//区分
		}
		return list;
	}
	/**
	 * 帳票ファイル情報取得用のリスナークラス
	 */
	public class FileWriteListener extends MCFileWriteListener {
		List<MCReportSet> list;
		
		FileWriteListener(List<MCReportSet> list) {
			this.list = list;
		}
		
		@Override
		public void initWrite(MCReportFile rf) {
			if (rf instanceof MCUCXSingleFile) {
				list.add(rf.getReportSet());
			}
			super.initWrite(rf);
		}
	}
	/**
	 * ワーキンググループＣＤ取得<br />
	 * 部門ＣＤと適用開始日をもとに部門マスタからワーキンググループＣＤを取得する
	 * 
	 * @param dptCd 部門ＣＤ
	 * @param dt 適用開始日
	 * 
	 * @return ワーキンググループＣＤ
	 */
	public static String getWgCd(String dptCd, MCDate dt) {
		return object(CLAZZ)._getWgCd(dptCd, dt);
	}
	
	protected String _getWgCd(String dptCd, MCDate dt) {
		return getDpt(dptCd, dt).wg_cd();
	}
	/** 部門マスタのキャッシュ */
	protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _dpt;
	
	/**
	 * 部門ＣＤと適用日に対応した部門マスタを取得する。<br>
	 * キャッシュに存在する場合、キャッシュから取得して返却する。
	 * 
	 * @param dptCd 部門ＣＤ
	 * @param stDt 適用開始日
	 * 
	 * @return 部門マスタ情報
	 */
	public static MAM_DPT_R getDpt(String dptCd, MCDate stDt) {
		return object(CLAZZ)._getDptCache().get(stDt, dptCd);
	}
	
	protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _getDptCache() {
		MCList<MCRow> bindL = MCList.create(MCRow.class);
		if (_dpt == null){
			_dpt = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(MCQueryApiBuilder.create(MAM_DPT_R.create("T")), bindL, MAM_DPT_R.$dpt_cd);
		}
		return _dpt;
	}

	//FMCB CUSTOM END
}