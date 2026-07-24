package mcframe.serverMSBG.MSBGL5050;

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
import mcframe.commonMSBG.MSBGR0030.*;
import mcframe.commonMSBG.MSBGR0040.*;
import mcframe.commonMSBG.MSBGR0050.*;
import mcframe.commonMSBG.MSBGR0060.*;
import mcframe.commonMSBG.MSBGR0070.*;
import mcframe.commonMSBG.MSBGR0080.*;
import mcframe.serverMSBG.MSBGL5120.*;
import static mcframe.serverMSBG.MSBGL5050.Query.*;
import mcframe.commonCore.report.container.*;
import mcframe.serverCore.report.MCServerReportManager;
import mcframe.serverCore.sys.MCSys;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import mcframe.serverMSUC.MSUCL0120.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBGL_ArSlipPrntService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBGL_ArSlipPrntService_MC extends MSBGL_ArSlipPrntService_MC_A{
	//FMCB CUSTOM START
	
	/**
	 * ArSlip_Prnt01オペレーション.<p>
	 *
	 */
	public class ArSlip_Prnt01 extends MSBGL_ArSlipPrntService_MC_A.ArSlip_Prnt01 {

		/** 債権伝票の新規発行用リスト */
		protected List<MSBGR_ArSlip> _arSlipList;
		/** 債権伝票の新規→無効発行用リスト */
		protected List<MSBGR_ArSlip> _arSlipDisList;
		/** 振替伝票の新規発行用リスト */
		protected List<MSBGR_Sw> _swList;
		/** 相殺伝票の新規発行用リスト */
		protected List<MSBGR_Setoff> _setoffList;
		/** 相殺伝票の新規→無効発行用リスト */
		protected List<MSBGR_Setoff> _setoffDisList;
		/** 消費税差額伝票の新規発行用リスト */
		protected List<MSBGR_CtaxDiff> _ctaxDiffList;
		/** 消費税差額伝票の新規→無効発行用リスト */
		protected List<MSBGR_CtaxDiff> _ctaxDiffDisList;
		/** 前受金・仮受金その他相殺伝票の新規発行用リスト */
		protected List<MSBGR_SuspOth> _suspOthList;
		/** 前受金・仮受金その他相殺伝票の新規→無効発行用リスト */
		protected List<MSBGR_SuspOth> _suspOthDisList;

		/** 債権伝票の新規発行件数 */
		protected int _arSlipNum;
		/** 振替伝票の新規発行件数 */
		protected int _swNum;
		/** 相殺伝票の新規発行件数 */
		protected int _setoffNum;
		/** 消費税差額伝票の新規発行件数 */
		protected int _ctaxDiffNum;
		/** 前受金・仮受金その他相殺伝票の新規発行件数 */
		protected int _suspOthNum;

		/** 債権伝票の再発行リスト */
		protected MCList<MCReportInfoR> _arSlipReprntList = MCList.create(MCReportInfoR.class);

		/** 振替伝票の再発行リスト */
		protected MCList<MCReportInfoR> _swReprntList = MCList.create(MCReportInfoR.class);

		/** 相殺伝票の再発行リスト */
		protected MCList<MCReportInfoR> _setoffReprntList = MCList.create(MCReportInfoR.class);

		/** 相殺伝票の再発行リスト */
		protected MCList<MCReportInfoR> _ctaxDiffReprntList = MCList.create(MCReportInfoR.class);

		/** 前受金・仮受金その他相殺伝票の再発行リスト */
		protected MCList<MCReportInfoR> _suspOthReprntList = MCList.create(MCReportInfoR.class);

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			MCList<ArSlip_Prnt01_HdrR> okList = chkRcvAct();
			countNum(okList);
			prnt(okList);
		}

		/**
		 * 債権伝票を発行する
		 * 
		 * @param okList
		 */
		protected void prnt(MCList<ArSlip_Prnt01_HdrR> okList) {

			for (ArSlip_Prnt01_HdrR r : okList) {
				if (MSC_AR_SLIP_PRNT_TYP.isGEN(r.ar_slip_prnt_typ())) {
					prntArSlip(r);
				}
				else if (MSC_AR_SLIP_PRNT_TYP.isARSW(r.ar_slip_prnt_typ())) {
					prntSw(r);
				}
				else if (MSC_AR_SLIP_PRNT_TYP.isSETOFF(r.ar_slip_prnt_typ())) {
					prntSetoff(r);
				}
				else if (MSC_AR_SLIP_PRNT_TYP.isTAX_DIFF(r.ar_slip_prnt_typ())) {
					prntCtaxDiff(r);
				}
				else if (MSC_AR_SLIP_PRNT_TYP.isSETOFF_SUSP(r.ar_slip_prnt_typ())) {
					prntSuspOth(r);
				}
			}
			prnt();
		}

		/**
		 * 帳票発行処理
		 */
		protected void prnt() {
			prntAll(_arSlipList, MSC_AR_SLIP_PRNT_TYP.GEN);
			prntDis(_arSlipDisList);
			reprntAll(_arSlipReprntList);
			prntAll(_swList, MSC_AR_SLIP_PRNT_TYP.ARSW);
			reprntAll(_swReprntList);
			prntAll(_setoffList, MSC_AR_SLIP_PRNT_TYP.SETOFF);
			prntDis(_setoffDisList);
			reprntAll(_setoffReprntList);
			prntAll(_ctaxDiffList, MSC_AR_SLIP_PRNT_TYP.TAX_DIFF);
			prntDis(_ctaxDiffDisList);
			reprntAll(_ctaxDiffReprntList);
			prntAll(_suspOthList, MSC_AR_SLIP_PRNT_TYP.SETOFF_SUSP);
			prntDis(_suspOthDisList);
			reprntAll(_suspOthReprntList);
		}

		/**
		 * MCReportSetのListをもとに帳票を発行します。
		 * 1件分のMCReportSetを引数に指定した場合は、印刷データの登録と帳票発行します。
		 * 複数件のMCReportSetを引数に指定した場合は、１つのデータファイルにまとめて発行し、
		 * 印刷データは登録しません。
		 * 
		 * @param reportSets MCReportSetのList
		 */
		protected <E extends MCReportSet> void prntAll(List<E> reportSets, MSC_AR_SLIP_PRNT_TYP slipPrntTyp) {
			if (reportSets == null) {
				return;
			}
			int cnt = reportSets.size();
			if (cnt == 0) {
				return;
			}
			else if (cnt == 1) {
				MCServerReportManager.request(reportSets.get(0));
			}
			else {

				if (up1().indiv_prnt_flg()) {
					for (MCReportSet reportSet : reportSets) {
						MCServerReportManager.request(reportSet);
					}
				} else {
					// 相殺伝票
					if (MSC_AR_SLIP_PRNT_TYP.isSETOFF(slipPrntTyp)) {
						
						TreeMap<String, List<E>> grpReportSetsSorted = new TreeMap<>();
						
						if(cnt == 2 && reportSets.get(0).getAppReportNo1().equals(reportSets.get(1).getAppReportNo1())) {
							// 単票の訂正更新(取消伝票＋新規伝票)時は新規側をグループキーとする
							if(MAC_SLIP_STS_TYP.isCRT(reportSets.get(0).getAppReportSts1())) {
								grpReportSetsSorted.put(reportSets.get(0).getAppToCd5(), reportSets);
							} else {
								grpReportSetsSorted.put(reportSets.get(1).getAppToCd5(), reportSets);
							}

						}else {
							Collections.sort(reportSets, (o1, o2) -> o1.getAppReportNo1().compareTo(o2.getAppReportNo1()));
							for (Map.Entry<String, List<E>> entry : 
									reportSets.stream().collect(Collectors.groupingBy(MCReportSet::getAppToCd5)).entrySet()) {
								grpReportSetsSorted.put(entry.getKey(), entry.getValue());
							}
						}

						for (Map.Entry<String, List<E>> mapReportSets : grpReportSetsSorted.entrySet()) {
							MCReportSet all = reportSets.get(0).createInstance();

							MSUCL_BpUtil.BpUtil_Sprt01 ope = MSUCL_BpUtil.crtBpUtil_Sprt01();
							MCList<BpUtil_Sprt01_DtlR> bpUtil = MCList.create(BpUtil_Sprt01_DtlR.class);
							MCIndexKey bpUtilkey = null;
							BpUtil_Sprt01_DtlR bpR = null;
							String srchType = null;
							
							if (MAC_DEBT_CRED_ID_TYP.isBSPPL(mapReportSets.getKey().split("_")[0])) {
								srchType = MAC_BP_IS_SRCH_TYP.BSPPL.value();
							} else if(MAC_DEBT_CRED_ID_TYP.isCST(mapReportSets.getKey().split("_")[0])) {
								srchType = MAC_BP_IS_SRCH_TYP.CST.value();
							} else if(MAC_DEBT_CRED_ID_TYP.isBCST(mapReportSets.getKey().split("_")[0])) {
								srchType = MAC_BP_IS_SRCH_TYP.BCST.value();
							}
							if(!isNull(srchType)) {
								ope.up0().bp_typ(srchType);
								BpUtil_Sprt01_DtlR dtlR = BpUtil_Sprt01_DtlR.create();
								dtlR.bp_cd(mapReportSets.getKey().split("_")[1]);
								ope.up1().add(dtlR);
								ope.exec();
								bpUtil = ope.down0();
								bpUtilkey = bpUtil.createIndex(BpUtil_Sprt01_DtlR.$bp_cd);
								bpR = bpUtil.getFirst(bpUtilkey, mapReportSets.getKey().split("_")[1]);
							}

							if(bpR != null && bpR.indiv_prnt_flg()) {
								// 単票画面からの訂正更新(取消伝票＋新規伝票)時は個別フラグの状況は問わず一括出力
								if(cnt == 2 && reportSets.get(0).getAppReportNo1().equals(reportSets.get(1).getAppReportNo1())) {
									for (MCReportSet rs : mapReportSets.getValue()) {
										all.addAll(rs.getAll());
									}
									all.setPersistent(false);
									MCServerReportManager.request(all);
								} else {
									for (MCReportSet rs : mapReportSets.getValue()) {
										MCServerReportManager.request(rs);
									}
								}
							} else {
								for (MCReportSet rs : mapReportSets.getValue()) {
									all.addAll(rs.getAll());
								}
								if(mapReportSets.getValue().size() > 1) {
									all.setPersistent(false);
								}
								MCServerReportManager.request(all);
							}
						}
					// 債権伝票、振替伝票、消費税差額調整伝票、仮受金・前受金その他相殺伝票
					} else {
						Collections.sort(reportSets, (o1, o2) -> o1.getAppReportNo1().compareTo(o2.getAppReportNo1()));
						TreeMap<String, List<E>> grpReportSetsSorted = new TreeMap<>();
						for (Map.Entry<String, List<E>> entry : 
								reportSets.stream().collect(Collectors.groupingBy(MCReportSet::getAppToCd5)).entrySet()) {
							grpReportSetsSorted.put(entry.getKey(), entry.getValue());
						}
						
						MSUCL_BpUtil.BpUtil_Sprt01 ope = MSUCL_BpUtil.crtBpUtil_Sprt01();
						if (MSC_AR_SLIP_PRNT_TYP.isGEN(slipPrntTyp)) {
							ope.up0().bp_typ(MAC_BP_IS_SRCH_TYP.RCST.value());
						}
						else if (MSC_AR_SLIP_PRNT_TYP.isARSW(slipPrntTyp)) {
							ope.up0().bp_typ(MAC_BP_IS_SRCH_TYP.BCST.value());
						}
						else if (MSC_AR_SLIP_PRNT_TYP.isTAX_DIFF(slipPrntTyp)) {
							ope.up0().bp_typ(MAC_BP_IS_SRCH_TYP.BCST.value());
						}
						else if (MSC_AR_SLIP_PRNT_TYP.isSETOFF_SUSP(slipPrntTyp)) {
							ope.up0().bp_typ(MAC_BP_IS_SRCH_TYP.RCST.value());
						}
						for (Map.Entry<String, List<E>> mapReportSets : grpReportSetsSorted.entrySet()) {
							BpUtil_Sprt01_DtlR dtlR = BpUtil_Sprt01_DtlR.create();
							dtlR.bp_cd(mapReportSets.getKey());
							ope.up1().add(dtlR);
						}
						ope.exec();
						MCList<BpUtil_Sprt01_DtlR> bpUtil = MCList.create(BpUtil_Sprt01_DtlR.class);
						bpUtil = ope.down0();
						MCIndexKey bpUtilkey = bpUtil.createIndex(BpUtil_Sprt01_DtlR.$bp_cd);
						
						for (Map.Entry<String, List<E>> mapReportSets : grpReportSetsSorted.entrySet()) {
							MCReportSet all = reportSets.get(0).createInstance();
							BpUtil_Sprt01_DtlR bpR = bpUtil.getFirst(bpUtilkey, mapReportSets.getKey());

							if(bpR != null && bpR.indiv_prnt_flg()) {
								// 単票画面からの訂正更新(取消伝票＋新規伝票)時は個別フラグの状況は問わず一括出力
								if(cnt == 2 && reportSets.get(0).getAppReportNo1().equals(reportSets.get(1).getAppReportNo1())) {
									for (MCReportSet rs : mapReportSets.getValue()) {
										all.addAll(rs.getAll());
									}
									all.setPersistent(false);
									MCServerReportManager.request(all);
								} else {
									for (MCReportSet rs : mapReportSets.getValue()) {
										MCServerReportManager.request(rs);
									}
								}
							} else {
								for (MCReportSet rs : mapReportSets.getValue()) {
									all.addAll(rs.getAll());
								}
								if(mapReportSets.getValue().size() > 1) {
									all.setPersistent(false);
								}
								MCServerReportManager.request(all);
							}
						}
					}
				}
			}
		}

		/**
		 * MCReportSetのListをもとに新規→無効になった帳票を発行します。
		 * MCReportSetを１件ごとに処理し、印刷データの登録と帳票発行を実行します。
		 * 
		 * @param reportSets MCReportSetのList
		 */
		protected <E extends MCReportSet> void prntDis(List<E> reportSets) {
			if (reportSets == null) {
				return;
			}
			int cnt = reportSets.size();
			if (cnt == 0) {
				return;
			}
			for (MCReportSet reportSet : reportSets) {
				MCServerReportManager.request(reportSet);
			}
		}

		/**
		 * 帳票を再発行する
		 * 
		 * @param reprntList 再発行対象のMCReportInfoRのMCList
		 */
		protected void reprntAll (MCList<MCReportInfoR> reprntList) {
			if (reprntList == null) {
				return;
			}
			MCServerReportManager.reprint(reprntList);
		}

		/**
		 * 債権伝票が発行可能かをチェックし、発行可能な上り電文の行を返す。
		 * 
		 * @return
		 */
		protected MCList<ArSlip_Prnt01_HdrR> chkRcvAct() {

			MCList<MST_RCV_ACT_R> chkL = lockRcvAct();
			MCIndexKey ik = chkL.createIndex(MST_RCV_ACT_R.$rcv_act_no, MST_RCV_ACT_R.$rcv_act_seq);

			MCList<ArSlip_Prnt01_HdrR> okList = MCList.create(ArSlip_Prnt01_HdrR.class);

			for (ArSlip_Prnt01_HdrR up : up0()) {
				MST_RCV_ACT_R chkR = chkL.getFirst(ik, up.rcv_act_no(), up.rcv_act_seq());
				MCMessageList msgList = new MCMessageList();

				if (chkR == null) {
					msgList.addAll(getRecordNotFoundMsg(
							"MS",
							"MST_RCV_ACT",
							new String[]{MST_RCV_ACT_R.$rcv_act_no, MST_RCV_ACT_R.$rcv_act_seq},
							new Comparable[]{up.rcv_act_no(), up.rcv_act_seq()}, up));
				}

				if (msgList.isEmpty()) {
					up.ar_slip_prnt_typ(chkR.ar_slip_prnt_typ());
					up.prnt_flg(chkR.prnt_flg());
					up.slip_sts_typ(chkR.slip_sts_typ());
					okList.add(up);

					if (!chkR.prnt_flg()) {
						updRcvAct(up, chkR);
					}
				}
				else {
					MCMessagePool.addAll(msgList);
					up.err_flg(true);
				}
				down0().add(up);
			}
			return okList;
		}

		/**
		 * 発行対象の件数カウント
		 * 
		 * @param okList
		 */
		protected void countNum (MCList<ArSlip_Prnt01_HdrR> okList) {
			MCList<ArSlip_Prnt01_HdrR>[] lists = okList.groupList(MST_RCV_ACT_R.$ar_slip_prnt_typ);
			for (MCList<ArSlip_Prnt01_HdrR> list : lists) {
				ArSlip_Prnt01_HdrR r = list.get(0);
				if (MSC_AR_SLIP_PRNT_TYP.isGEN(r.ar_slip_prnt_typ())) {
					_arSlipList = new ArrayList<MSBGR_ArSlip>();
					_arSlipDisList = new ArrayList<MSBGR_ArSlip>();
					_arSlipNum = list.size();
				}
				else if (MSC_AR_SLIP_PRNT_TYP.isARSW(r.ar_slip_prnt_typ())) {
					_swList = new ArrayList<MSBGR_Sw>();
					_swNum = list.size();
				}
				else if (MSC_AR_SLIP_PRNT_TYP.isSETOFF(r.ar_slip_prnt_typ())) {
					_setoffList = new ArrayList<MSBGR_Setoff>();
					_setoffDisList = new ArrayList<MSBGR_Setoff>();
					_setoffNum = list.size();
				}
				else if (MSC_AR_SLIP_PRNT_TYP.isTAX_DIFF(r.ar_slip_prnt_typ())) {
					_ctaxDiffList = new ArrayList<MSBGR_CtaxDiff>();
					_ctaxDiffDisList = new ArrayList<MSBGR_CtaxDiff>();
					_ctaxDiffNum = list.size();
				}
				else if (MSC_AR_SLIP_PRNT_TYP.isSETOFF_SUSP(r.ar_slip_prnt_typ())) {
					_suspOthList = new ArrayList<MSBGR_SuspOth>();
					_suspOthDisList = new ArrayList<MSBGR_SuspOth>();
					_suspOthNum = list.size();
				}
			}
		}

		/**
		 * 入金実績ヘッダをロックする
		 * 
		 * @return
		 */
		protected MCList<MST_RCV_ACT_R> lockRcvAct() {

			up0().sort(ArSlip_Prnt01_HdrR.$rcv_act_no, ArSlip_Prnt01_HdrR.$rcv_act_seq);

			MCList<MST_RCV_ACT_R> chkL = MCList.create(MST_RCV_ACT_R.class);
			MST_RCV_ACT_R t = MST_RCV_ACT_R.create("T");
			MCQueryApiBuilder chkL_bldr = MCQueryApiBuilder.create(t);
			chkL_bldr.setSelect(t.rcv_act_no);
			chkL_bldr.addSelect(t.rcv_act_seq);
			chkL_bldr.addSelect(t.prnt_flg);
			chkL_bldr.addSelect(t.slip_sts_typ);
			chkL_bldr.addSelect(t.ar_slip_prnt_typ);
			chkL_bldr.setOrderByAsc(chkL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectKeyForUpdate("MSBGL5050_MST_RCV_ACT_S01", chkL, chkL_bldr, up0());

			return chkL;
		}

		/**
		 * 入金実績ヘッダを更新する
		 * 
		 * @return
		 */
		protected void updRcvAct(ArSlip_Prnt01_HdrR up, MST_RCV_ACT_R updR) {

			MST_RCV_ACT_R t = MST_RCV_ACT_R.create("T");
			MCQueryApiBuilder updR_bldr = MCQueryApiBuilder.create(t);

			updR.rcv_act_no(up.rcv_act_no());
			updR.rcv_act_seq(up.rcv_act_seq());
			updR.prnt_flg(true);
			updR_bldr.setSet(t.prnt_flg);
			dbUpdateKey("MSBGL5050_MST_RCV_ACT_U01", updR, updR_bldr);
		}

		/**
		 * 債権伝票を発行する
		 * 
		 * @param r
		 */
		protected void prntArSlip(ArSlip_Prnt01_HdrR r) {

			if (r.prnt_flg() && _arSlipNum == 1) { 
				MSBGR_ArSlip reportSet = MSBGR_ArSlip.create();
				
				// 業務情報を設定し、印刷データからデータを取得
				reportSet.setAppReportNo1(r.rcv_act_no());
				reportSet.setAppReportNo3(r.rcv_act_seq().toString());
				reportSet.setAppReportSts2("1");
				MCList<MCReportInfoR> infoL = MCServerReportManager.searchPrintData(reportSet, false);
				if(infoL == null) {
					return;
				}

				MCReportInfoR infoR = infoL.get(0);
				MSBGR_ArSlip rs = (MSBGR_ArSlip)MCServerReportManager.toReportSet(infoR);
				String bt = rs.getBlockType(ArSlipHdrR.create());
				MCList<?> ls = rs.getAll(bt);
				ArSlipHdrR row = (ArSlipHdrR)(ls.get(0));

				// 新規→無効に更新した場合のみ、帳票のステータスを無効に更新する
				if (!MAC_SLIP_STS_TYP.isDIS(row.slip_sts_typ()) && MAC_SLIP_STS_TYP.isDIS(r.slip_sts_typ())) {
					row.slip_sts_typ(r.slip_sts_typ());
					MAC_SLIP_STS_TYP.putNameNE(row, ArSlipHdrR.$slip_sts_typ, ArSlipHdrR.$slip_sts_typ_nm, MCSys.user.locale());

					infoR.app_report_sts2("0");
					MCServerReportManager.updatePrintData(infoR);

					rs.setAppReportSts1(MAC_SLIP_STS_TYP.DIS.value());
					rs.setAppReportStsNm1(MAC_SLIP_STS_TYP.DIS.name());
					rs.setAppReportSts2("1");

					_arSlipDisList.add(rs);
				}
				else {
					_arSlipReprntList.add(infoR);
				}
			}
			else {
				MSBGR_ArSlip reportSet = MSBGR_ArSlip.create();

				// 入金実績ヘッダの検索
				MCList<ArSlipHdrR> hdrL = MCList.create(ArSlipHdrR.class);
				hdrL.addNumberColumn("amt_dec_place");
				executeQuery(hdrL, MSBGL5050_MST_RCV_ACT_S01(), r);
				ArSlipHdrR hdrR = ArSlipHdrR.create();
				hdrR.addNumberColumn("amt_dec_place");
				if (!hdrL.isEmpty()) {
					hdrR = hdrL.get(0);
				}
				// 入金実績明細の検索
				MCList<ArSlipDtlR> dtlL = MCList.create(ArSlipDtlR.class);
				executeQuery(dtlL, MSBGL5050_MST_RCV_ACT_D_S01(), hdrR);
				for (ArSlipDtlR dtlR : dtlL) {
					dtlR.setNumberNE("amt_dec_place", hdrR.getNumberNE("amt_dec_place"));
					MAC_AR_TYP.putNameNE(dtlR, ArSlipDtlR.$ar_typ, ArSlipDtlR.$ar_typ_nm, MCSys.user.locale());
				}

				// ヘッダ情報の加工
				MAC_SLIP_STS_TYP.putNameNE(hdrR, ArSlipHdrR.$slip_sts_typ, ArSlipHdrR.$slip_sts_typ_nm, MCSys.user.locale());
				MAC_NOTE_TYP.putNameNE(hdrR, ArSlipHdrR.$note_typ, ArSlipHdrR.$note_typ_nm, MCSys.user.locale());

				hdrR.prnt_tm(MCDate.now());

				putNumStr(reportSet, hdrR,
						ArSlipHdrR.$s_xrate,
						ArSlipHdrR.$xrate,
						hdrR.getNumber("amt_dec_place"));

				putNumStr(reportSet, hdrR,
						ArSlipHdrR.$s_not_proc_bal,
						ArSlipHdrR.$not_proc_bal,
						hdrR.getNumber("amt_dec_place"));

				putNumStr(reportSet, hdrR,
						ArSlipHdrR.$s_subttl1,
						ArSlipHdrR.$subttl1,
						hdrR.getNumber("amt_dec_place"));

				putNumStr(reportSet, hdrR,
						ArSlipHdrR.$s_subttl2,
						ArSlipHdrR.$subttl2,
						hdrR.getNumber("amt_dec_place"));

				reportSet.addRow(hdrR);

				// 明細情報の加工
				putNumStr(reportSet, dtlL,
						ArSlipDtlR.$s_int_trd_cur_amt1,
						ArSlipDtlR.$s_dec_trd_cur_amt1,
						ArSlipDtlR.$trd_cur_amt1,
						"amt_dec_place");

				putNumStr(reportSet, dtlL,
						ArSlipDtlR.$s_int_trd_cur_amt2,
						ArSlipDtlR.$s_dec_trd_cur_amt2,
						ArSlipDtlR.$trd_cur_amt2,
						"amt_dec_place");

				putPrntStr(dtlL, ArSlipDtlR.$iv_no_view, ArSlipDtlR.$iv_no_data);

				reportSet.addAll(dtlL);

				// 業務情報をセット
				reportSet.setAppTitle1(hdrR.report_title());
				reportSet.setAppReportNo1(hdrR.rcv_act_no());
				reportSet.setAppReportNo2(hdrR.rcv_act_rev().toString());
				reportSet.setAppReportNo3(hdrR.rcv_act_seq().toString());
				reportSet.setAppReportSts1(hdrR.slip_sts_typ());
				reportSet.setAppReportStsNm1(hdrR.slip_sts_typ_nm());
				reportSet.setAppReportSts2("1");
				reportSet.setAppUsrCd1(hdrR.dpt_cd());
				reportSet.setAppUsrNm1(hdrR.dpt_nm());
				reportSet.setAppUsrCd2(hdrR.usr_cd());
				reportSet.setAppUsrNm2(hdrR.usr_nm());
				reportSet.setAppToCd1(hdrR.rcst_cd());
				reportSet.setAppToNm1(hdrR.rcst_nm());
				reportSet.setAppToCd5(hdrR.rcst_cd());
				// データ作成処理
				_arSlipList.add(reportSet);
				if (_arSlipNum > 1) {
					MCServerReportManager.request(reportSet, false);
				}
			}
		}

		/**
		 * 振替伝票を発行する
		 * 
		 * @param r
		 */
		protected void prntSw(ArSlip_Prnt01_HdrR r) {

			if (r.prnt_flg() && _swNum == 1) {
				MSBGR_Sw reportSet = MSBGR_Sw.create();

				reportSet.setAppReportNo1(r.rcv_act_no());
				reportSet.setAppReportNo3(r.rcv_act_seq().toString());
				reportSet.setAppReportSts2("1");
				MCList<MCReportInfoR> infoL = MCServerReportManager.searchPrintData(reportSet, false);
				if(infoL == null) {
					return;
				}

				MCReportInfoR infoR = infoL.get(0);
				_swReprntList.add(infoR);
			}
			else {

				MSBGR_Sw reportSet = MSBGR_Sw.create();

				// 入金実績ヘッダの検索（振替元）
				MST_RCV_ACT_R rcvActFr = getRcvActFr(r);

				// 入金実績明細の検索（振替元）
				MCList<SwDtlR> dtlL = MCList.create(SwDtlR.class);
				executeQuery(dtlL, MSBGL5050_MST_RCV_ACT_D_S02(), rcvActFr);
				for (SwDtlR dtlR : dtlL) {
					dtlR.setNumberNE("amt_dec_place", rcvActFr.getNumberNE("amt_dec_place"));
					MAC_AR_TYP.putNameNE(dtlR, SwDtlR.$ar_typ, SwDtlR.$ar_typ_nm, MCSys.user.locale());
					if (isNull(dtlR.bill_dpt_nm_fr())) {
						MSBGL_ArUtil.setLastDpt(dtlR, SwDtlR.$bill_dpt_cd_fr, SwDtlR.$bill_dpt_nm_fr);
					}
					if (isNull(dtlR.ar_dpt_nm_fr())) {
						MSBGL_ArUtil.setLastDpt(dtlR, SwDtlR.$ar_dpt_cd_fr, SwDtlR.$ar_dpt_nm_fr);
					}
				}

				// 入金実績ヘッダの検索（振替先）
				SwHdrR hdrTo = SwHdrR.create();
				hdrTo.rcv_act_no(rcvActFr.par_rcv_act_no());
				hdrTo.rcv_act_seq(rcvActFr.par_rcv_act_seq());

				executeQuery(hdrTo, MSBGL5050_MST_RCV_ACT_S02(), hdrTo);

				setHdrR(hdrTo, rcvActFr);

				// ヘッダ情報の加工
				MAC_SLIP_STS_TYP.putNameNE(hdrTo, SwHdrR.$slip_sts_typ, SwHdrR.$slip_sts_typ_nm, MCSys.user.locale());
				hdrTo.prnt_tm(MCDate.now());
				putNumStr(reportSet, hdrTo, SwHdrR.$s_trd_cur_amt, SwHdrR.$trd_cur_amt,
						rcvActFr.getNumber("amt_dec_place"));
				reportSet.addRow(hdrTo);

				// 明細情報の加工
				putNumStr(reportSet, dtlL, SwDtlR.$s_int_trd_cur_amt1,
						SwDtlR.$s_dec_trd_cur_amt1, SwDtlR.$trd_cur_amt1,
						"amt_dec_place");
				putPrntStr(dtlL, SwDtlR.$iv_no_view, SwDtlR.$iv_no_data);
				reportSet.addAll(dtlL);

				// 業務情報をセット
				setOther(reportSet, hdrTo);

				// データ作成処理
				_swList.add(reportSet);
				if (_swNum > 1) {
					MCServerReportManager.request(reportSet, false);
				}
			}
		}
		
		/**
		 * 振替元情報取得
		 * @param r
		 * @return
		 */
		protected MST_RCV_ACT_R getRcvActFr(ArSlip_Prnt01_HdrR r) {
			MST_RCV_ACT_R rcvActFr = MST_RCV_ACT_R.create();
			MST_RCV_ACT_R t = MST_RCV_ACT_R.create("T");
			MCQueryApiBuilder rcvActFr_bldr = MCQueryApiBuilder.create(t);
			MAM_CUR_R cur = MAM_CUR_R.create("CUR");
			MAM_BP_R bp = MAM_BP_R.create("BP");
			rcvActFr.addNumberColumn("amt_dec_place");
			rcvActFr.addStringColumn("bcst_nm");

			rcvActFr_bldr.setSelect(t.rcv_act_no);
			rcvActFr_bldr.addSelect(t.rcv_act_seq);
			rcvActFr_bldr.addSelect(t.par_rcv_act_no);
			rcvActFr_bldr.addSelect(t.par_rcv_act_seq);
			rcvActFr_bldr.addSelect(t.ac_dt);
			rcvActFr_bldr.addSelect(t.bcst_cd);
			rcvActFr_bldr.addSelect(t.trd_cur_amt);
			rcvActFr_bldr.addSelect(t.trd_cd);
			rcvActFr_bldr.addSelect(cur.amt_dec_place);
			rcvActFr_bldr.addSelect(bp.bp_nm.as("bcst_nm"));
			rcvActFr_bldr.addInnerJoin(cur, t.trd_cur_cd.eq(cur.cur_cd));
			rcvActFr_bldr.addInnerJoin(bp, t.bcst_cd.eq(bp.bp_cd));

			dbSelectKey("MSBGL5050_MST_RCV_ACT_S02", rcvActFr, rcvActFr_bldr, r);
			return rcvActFr;
		}
		
		/**
		 * ヘッダ情報設定
		 * @param hdrTo
		 * @param rcvActFr
		 */
		protected void setHdrR(SwHdrR hdrTo, MST_RCV_ACT_R rcvActFr) {
			hdrTo.rcv_act_no(rcvActFr.rcv_act_no());
			hdrTo.bcst_cd_fr(rcvActFr.bcst_cd());
			hdrTo.bcst_nm_fr(rcvActFr.getStringNE("bcst_nm"));
			hdrTo.trd_cur_amt(rcvActFr.trd_cur_amt());
			
			MAM_TRD_R trdR = MAM_TRD_R.create();
			MCQueryApiBuilder trdR_bldr = MCQueryApiBuilder.create(MAM_TRD_R.create("T"));
			dbSelectKey("MSBGL5050_MAM_TRD_S01", trdR, trdR_bldr, rcvActFr.trd_cd());
			hdrTo.report_title(trdR.trd_nm());
		}
		
		/**
		 * 業務情報設定
		 * @param reportSet
		 * @param hdrTo
		 */
		protected void setOther(MSBGR_Sw reportSet, SwHdrR hdrTo) {
			reportSet.setAppTitle1(hdrTo.report_title());
			reportSet.setAppReportNo1(hdrTo.rcv_act_no());
			reportSet.setAppReportNo2(hdrTo.rcv_act_rev().toString());
			reportSet.setAppReportNo3(hdrTo.rcv_act_seq().toString());
			reportSet.setAppReportSts1(hdrTo.slip_sts_typ());
			reportSet.setAppReportStsNm1(hdrTo.slip_sts_typ_nm());
			reportSet.setAppReportSts2("1");
			reportSet.setAppUsrCd1(hdrTo.dpt_cd());
			reportSet.setAppUsrNm1(hdrTo.dpt_nm());
			reportSet.setAppUsrCd2(hdrTo.usr_cd());
			reportSet.setAppUsrNm2(hdrTo.usr_nm());
			reportSet.setAppUsrCd3(hdrTo.ar_dpt_cd_to());
			reportSet.setAppUsrNm3(hdrTo.ar_dpt_nm_to());
			reportSet.setAppUsrCd4(hdrTo.bill_dpt_cd_to());
			reportSet.setAppUsrNm4(hdrTo.bill_dpt_nm_to());
			reportSet.setAppToCd1(hdrTo.bcst_cd_to());
			reportSet.setAppToNm1(hdrTo.bcst_nm_to());
			reportSet.setAppToCd2(hdrTo.acst_cd_to());
			reportSet.setAppToNm2(hdrTo.acst_nm_to());
			reportSet.setAppToCd3(hdrTo.bcst_cd_fr());
			reportSet.setAppToNm3(hdrTo.bcst_nm_fr());
			reportSet.setAppToCd5(hdrTo.bcst_cd_to());
		}

		/**
		 * 相殺伝票を発行する
		 * 
		 * @param r
		 */
		protected void prntSetoff(ArSlip_Prnt01_HdrR r) {
			if (r.prnt_flg() && _setoffNum == 1) {
				MSBGR_Setoff reportSet = MSBGR_Setoff.create();

				reportSet.setAppReportNo1(r.rcv_act_no());
				reportSet.setAppReportNo3(r.rcv_act_seq().toString());
				reportSet.setAppReportSts2("1");
				MCList<MCReportInfoR> infoL = MCServerReportManager.searchPrintData(reportSet, false);
				if(infoL == null) {
					return;
				}

				MCReportInfoR infoR = infoL.get(0);
				MSBGR_Setoff rs = (MSBGR_Setoff)MCServerReportManager.toReportSet(infoR);
				String bt = rs.getBlockType(SetoffHdrR.create());
				MCList<?> ls = rs.getAll(bt);
				SetoffHdrR row = (SetoffHdrR)(ls.get(0));

				// 新規→無効に更新した場合のみ、帳票のステータスを無効に更新する
				if (!MAC_SLIP_STS_TYP.isDIS(row.slip_sts_typ()) && MAC_SLIP_STS_TYP.isDIS(r.slip_sts_typ())) {

					row.slip_sts_typ(r.slip_sts_typ());
					MAC_SLIP_STS_TYP.putNameNE(row, ArSlipHdrR.$slip_sts_typ, ArSlipHdrR.$slip_sts_typ_nm, MCSys.user.locale());
					
					// 元となった帳票データは、再発行時に取得されないよう、ステータスを更新する。
					infoR.app_report_sts2("0");
					MCServerReportManager.updatePrintData(infoR);

					rs.setAppReportSts1(MAC_SLIP_STS_TYP.DIS.value());
					rs.setAppReportStsNm1(MAC_SLIP_STS_TYP.DIS.name());
					rs.setAppReportSts2("1");

					_setoffDisList.add(rs);
				}
				else {
					_setoffReprntList.add(infoR);
				}
			}
			else {

				MSBGR_Setoff reportSet = MSBGR_Setoff.create();

				// 入金実績ヘッダの検索
				SetoffHdrR hdrR = SetoffHdrR.create();
				hdrR.addNumberColumn("amt_dec_place");
				executeQuery(hdrR, MSBGL5050_MST_RCV_ACT_S03(), r);

				// 入金実績明細の検索
				MCList<SetoffDtlR> dtlL = MCList.create(SetoffDtlR.class);
				executeQuery(dtlL, MSBGL5050_MST_RCV_ACT_D_S03(), hdrR);
				for (SetoffDtlR dtlR : dtlL) {
					dtlR.setNumberNE("amt_dec_place", hdrR.getNumberNE("amt_dec_place"));
					MAC_AR_TYP.putNameNE(dtlR, SetoffDtlR.$ar_typ, SetoffDtlR.$ar_typ_nm, MCSys.user.locale());
				}

				// ヘッダ情報の加工
				MAC_SLIP_STS_TYP.putNameNE(hdrR, SetoffHdrR.$slip_sts_typ, SetoffHdrR.$slip_sts_typ_nm, MCSys.user.locale());

				hdrR.prnt_tm(MCDate.now());

				putNumStr(reportSet, hdrR,
						SetoffHdrR.$s_xrate,
						SetoffHdrR.$xrate,
						hdrR.getNumber("amt_dec_place"));

				putNumStr(reportSet, hdrR,
						SetoffHdrR.$s_not_proc_bal,
						SetoffHdrR.$not_proc_bal,
						hdrR.getNumber("amt_dec_place"));

				putNumStr(reportSet, hdrR,
						SetoffHdrR.$s_subttl1,
						SetoffHdrR.$subttl1,
						hdrR.getNumber("amt_dec_place"));

				reportSet.addRow(hdrR);

				// 明細情報の加工
				putNumStr(reportSet, dtlL,
						SetoffDtlR.$s_int_trd_cur_amt1,
						SetoffDtlR.$s_dec_trd_cur_amt1,
						SetoffDtlR.$trd_cur_amt1,
						"amt_dec_place");

				putPrntStr(dtlL, SetoffDtlR.$iv_no_view, SetoffDtlR.$iv_no_data);

				reportSet.addAll(dtlL);

				// 業務情報をセット
				reportSet.setAppTitle1(hdrR.report_title());
				reportSet.setAppReportNo1(hdrR.rcv_act_no());
				reportSet.setAppReportNo2(hdrR.rcv_act_rev().toString());
				reportSet.setAppReportNo3(hdrR.rcv_act_seq().toString());
				reportSet.setAppReportSts1(hdrR.slip_sts_typ());
				reportSet.setAppReportStsNm1(hdrR.slip_sts_typ_nm());
				reportSet.setAppReportSts2("1");
				reportSet.setAppUsrCd1(hdrR.dpt_cd());
				reportSet.setAppUsrNm1(hdrR.dpt_nm());
				reportSet.setAppUsrCd2(hdrR.usr_cd());
				reportSet.setAppUsrNm2(hdrR.usr_nm());
				reportSet.setAppToCd1(hdrR.debt_cred_id_cd());
				reportSet.setAppToNm1(hdrR.debt_cred_nm());
				// 借方先識別区分 + "_" + 借方先ＣＤ
				reportSet.setAppToCd5(hdrR.getStringNE("DEBT_CRED_ID_TYP") + "_" + hdrR.debt_cred_id_cd());
				// データ作成処理
				_setoffList.add(reportSet);
				if (_setoffNum > 1) {
					MCServerReportManager.request(reportSet, false);
				}
			}
		}

		/**
		 * 消費税差額調整伝票を発行する
		 * 
		 * @param r
		 */
		protected void prntCtaxDiff(ArSlip_Prnt01_HdrR r) {

			if (r.prnt_flg() && _ctaxDiffNum == 1) {
				MSBGR_CtaxDiff reportSet = MSBGR_CtaxDiff.create();

				reportSet.setAppReportNo1(r.rcv_act_no());
				reportSet.setAppReportNo3(r.rcv_act_seq().toString());
				reportSet.setAppReportSts2("1");
				MCList<MCReportInfoR> infoL = MCServerReportManager.searchPrintData(reportSet, false);
				if(infoL == null) {
					return;
				}

				MCReportInfoR infoR = infoL.get(0);
				MSBGR_CtaxDiff rs = (MSBGR_CtaxDiff)MCServerReportManager.toReportSet(infoR);
				String bt = rs.getBlockType(CtaxDiffHdrR.create());
				MCList<?> ls = rs.getAll(bt);
				CtaxDiffHdrR row = (CtaxDiffHdrR)(ls.get(0));

				// 新規→無効に更新した場合のみ、帳票のステータスを無効に更新する
				if (!MAC_SLIP_STS_TYP.isDIS(row.slip_sts_typ()) && MAC_SLIP_STS_TYP.isDIS(r.slip_sts_typ())) {

					row.slip_sts_typ(r.slip_sts_typ());
					MAC_SLIP_STS_TYP.putNameNE(row, ArSlipHdrR.$slip_sts_typ, ArSlipHdrR.$slip_sts_typ_nm, MCSys.user.locale());
					
					// 元となった帳票データは、再発行時に取得されないよう、ステータスを更新する。
					infoR.app_report_sts2("0");
					MCServerReportManager.updatePrintData(infoR);

					rs.setAppReportSts1(MAC_SLIP_STS_TYP.DIS.value());
					rs.setAppReportStsNm1(MAC_SLIP_STS_TYP.DIS.name());
					rs.setAppReportSts2("1");

					_ctaxDiffDisList.add(rs);
				}
				else {
					_ctaxDiffReprntList.add(infoR);
				}
			}
			else {

				MSBGR_CtaxDiff reportSet = MSBGR_CtaxDiff.create();

				// 入金実績ヘッダの検索
				MCList<CtaxDiffHdrR> hdrL = MCList.create(CtaxDiffHdrR.class);
				hdrL.addNumberColumn("amt_dec_place");
				hdrL.addNumberColumn("base_cur_amt_dec_place");
				executeQuery(hdrL, MSBGL5050_MST_RCV_ACT_S04(), r);
				CtaxDiffHdrR hdrR = CtaxDiffHdrR.create();
				hdrR.addNumberColumn("amt_dec_place");
				hdrR.addNumberColumn("base_cur_amt_dec_place");
				if (!hdrL.isEmpty()) {
					hdrR = hdrL.get(0);
				}
				// 入金実績明細の検索
				MCList<CtaxDiffDtlR> dtlL = MCList.create(CtaxDiffDtlR.class);
				executeQuery(dtlL, MSBGL5050_MST_RCV_ACT_D_S04(), hdrR);
				for (CtaxDiffDtlR dtlR : dtlL) {
					dtlR.setNumberNE("amt_dec_place", hdrR.getNumberNE("amt_dec_place"));
					dtlR.setNumberNE("base_cur_amt_dec_place", hdrR.getNumberNE("base_cur_amt_dec_place"));
					MAC_AR_TYP.putNameNE(dtlR, SetoffDtlR.$ar_typ, SetoffDtlR.$ar_typ_nm, MCSys.user.locale()); 
				}

				// ヘッダ情報の加工
				MAC_SLIP_STS_TYP.putNameNE(hdrR, CtaxDiffHdrR.$slip_sts_typ, CtaxDiffHdrR.$slip_sts_typ_nm, MCSys.user.locale());

				hdrR.prnt_tm(MCDate.now());

				putNumStr(reportSet, hdrR,
						CtaxDiffHdrR.$s_tax_subttl1,
						CtaxDiffHdrR.$tax_subttl1,
						hdrR.getNumber("amt_dec_place"));
				putNumStr(reportSet, hdrR,
						CtaxDiffHdrR.$s_base_cur_tax_subttl1,
						CtaxDiffHdrR.$base_cur_tax_subttl1,
						hdrR.getNumber("base_cur_amt_dec_place"));

				reportSet.addRow(hdrR);

				// 明細情報の加工
				putNumStr(reportSet, dtlL,
						CtaxDiffDtlR.$s_int_trd_cur_tax_amt1,
						CtaxDiffDtlR.$s_dec_trd_cur_tax_amt1,
						CtaxDiffDtlR.$trd_cur_tax_amt1,
						"amt_dec_place");
				putNumStr(reportSet, dtlL,
						CtaxDiffDtlR.$s_int_base_cur_tax_amt1,
						CtaxDiffDtlR.$s_dec_base_cur_tax_amt1,
						CtaxDiffDtlR.$base_cur_tax_amt1,
						"base_cur_amt_dec_place");

				putPrntStr(dtlL, CtaxDiffDtlR.$iv_no_view, CtaxDiffDtlR.$iv_no_data);

				reportSet.addAll(dtlL);

				// 業務情報をセット
				reportSet.setAppTitle1(hdrR.report_title());
				reportSet.setAppReportNo1(hdrR.rcv_act_no());
				reportSet.setAppReportNo2(hdrR.rcv_act_rev().toString());
				reportSet.setAppReportNo3(hdrR.rcv_act_seq().toString());
				reportSet.setAppReportSts1(hdrR.slip_sts_typ());
				reportSet.setAppReportStsNm1(hdrR.slip_sts_typ_nm());
				reportSet.setAppReportSts2("1");
				reportSet.setAppUsrCd1(hdrR.dpt_cd());
				reportSet.setAppUsrNm1(hdrR.dpt_nm());
				reportSet.setAppUsrCd2(hdrR.usr_cd());
				reportSet.setAppUsrNm2(hdrR.usr_nm());
				reportSet.setAppToCd1(hdrR.bcst_cd());
				reportSet.setAppToNm1(hdrR.bcst_nm());
				reportSet.setAppToCd5(hdrR.bcst_cd());
				// データ作成処理
				_ctaxDiffList.add(reportSet);
				if (_ctaxDiffNum > 1) {
					MCServerReportManager.request(reportSet, false);
				}
			}
		}

		/**
		 * 仮受金・前受金その他相殺伝票を発行する
		 * 
		 * @param r
		 */
		protected void prntSuspOth(ArSlip_Prnt01_HdrR r) {

			if (r.prnt_flg() && _suspOthNum == 1) {

				MSBGR_SuspOth reportSet = MSBGR_SuspOth.create();

				reportSet.setAppReportNo1(r.rcv_act_no());
				reportSet.setAppReportNo3(r.rcv_act_seq().toString());
				reportSet.setAppReportSts2("1");
				MCList<MCReportInfoR> infoL = MCServerReportManager.searchPrintData(reportSet, false);
				if(infoL == null) {
					return;
				}

				MCReportInfoR infoR = infoL.get(0);
				MSBGR_SuspOth rs = (MSBGR_SuspOth)MCServerReportManager.toReportSet(infoR);
				String bt = rs.getBlockType(SuspOthHdrR.create());
				MCList<?> ls = rs.getAll(bt);
				SuspOthHdrR row = (SuspOthHdrR)(ls.get(0));

				// 新規→無効に更新した場合のみ、帳票のステータスを無効に更新する
				if (!MAC_SLIP_STS_TYP.isDIS(row.slip_sts_typ()) && MAC_SLIP_STS_TYP.isDIS(r.slip_sts_typ())) {

					row.slip_sts_typ(r.slip_sts_typ());
					MAC_SLIP_STS_TYP.putNameNE(row, ArSlipHdrR.$slip_sts_typ, ArSlipHdrR.$slip_sts_typ_nm, MCSys.user.locale());
					
					// 元となった帳票データは、再発行時に取得されないよう、ステータスを更新する。
					infoR.app_report_sts2("0");
					MCServerReportManager.updatePrintData(infoR);

					rs.setAppReportSts1(MAC_SLIP_STS_TYP.DIS.value());
					rs.setAppReportStsNm1(MAC_SLIP_STS_TYP.DIS.name());
					rs.setAppReportSts2("1");

					_suspOthDisList.add(rs);
				}
				else {
					_suspOthReprntList.add(infoR);
				}
			}
			else {

				MSBGR_SuspOth reportSet = MSBGR_SuspOth.create();

				// 入金実績ヘッダの検索
				SuspOthHdrR hdrR = SuspOthHdrR.create();
				hdrR.addNumberColumn("amt_dec_place");
				executeQuery(hdrR, MSBGL5050_MST_RCV_ACT_S05(), r);

				// ヘッダ情報の加工
				MAC_SLIP_STS_TYP.putNameNE(hdrR, SuspOthHdrR.$slip_sts_typ, SuspOthHdrR.$slip_sts_typ_nm, MCSys.user.locale());
				MAC_NOTE_TYP.putNameNE(hdrR, SuspOthHdrR.$note_typ, SuspOthHdrR.$note_typ_nm, MCSys.user.locale());

				hdrR.prnt_tm(MCDate.now());

				putNumStr(reportSet, hdrR,
						SuspOthHdrR.$s_xrate,
						SuspOthHdrR.$xrate,
						hdrR.getNumber("amt_dec_place"));

				putNumStr(reportSet, hdrR,
						SuspOthHdrR.$s_not_proc_bal,
						SuspOthHdrR.$not_proc_bal,
						hdrR.getNumber("amt_dec_place"));

				putNumStr(reportSet, hdrR,
						SuspOthHdrR.$s_subttl1,
						SuspOthHdrR.$subttl1,
						hdrR.getNumber("amt_dec_place"));

				reportSet.addRow(hdrR);

				// 業務情報をセット
				reportSet.setAppTitle1(hdrR.getStringNE("report_title"));
				reportSet.setAppReportNo1(hdrR.rcv_act_no());
				reportSet.setAppReportNo2(hdrR.rcv_act_rev().toString());
				reportSet.setAppReportNo3(hdrR.rcv_act_seq().toString());
				reportSet.setAppReportSts1(hdrR.slip_sts_typ());
				reportSet.setAppReportStsNm1(hdrR.slip_sts_typ_nm());
				reportSet.setAppReportSts2("1");
				reportSet.setAppUsrCd1(hdrR.dpt_cd());
				reportSet.setAppUsrNm1(hdrR.dpt_nm());
				reportSet.setAppUsrCd2(hdrR.usr_cd());
				reportSet.setAppUsrNm2(hdrR.usr_nm());
				reportSet.setAppToCd1(hdrR.rcst_cd());
				reportSet.setAppToNm1(hdrR.rcst_nm());
				reportSet.setAppToCd5(hdrR.rcst_cd());
				
				// データ作成処理
				_suspOthList.add(reportSet);
				if (_suspOthNum > 1) {
					MCServerReportManager.request(reportSet, false);
				}
			}
		}
	}
	/**
	 * ArSlip_Prnt02オペレーション.<p>
	 *
	 */
	public class ArSlip_Prnt02 extends MSBGL_ArSlipPrntService_MC_A.ArSlip_Prnt02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			MCList<ArSlip_Prnt02_HdrR> okList = chkRcv();
			prnt(okList);
		}

		/**
		 * 入金管理票を発行する
		 * 
		 * @param okList
		 */
		protected void prnt(MCList<ArSlip_Prnt02_HdrR> okList) {
			List<MSBGR_Rcv> rptList = new ArrayList<MSBGR_Rcv>();
			for (ArSlip_Prnt02_HdrR r : okList) {
				RcvHdrR hdrR = srchRcv(r);
				if (hdrR.isEmpty()) {
					continue;
				}

				MSBGR_Rcv rs = MSBGR_Rcv.create();
				setData(rs, hdrR, r);
				rptList.add(rs);
			}

			if(rptList.size() == 1) {
				MCServerReportManager.request(rptList.get(0));

			}else {
				Collections.sort(rptList, (o1, o2) -> o1.getAppReportNo1().compareTo(o2.getAppReportNo1()));
				TreeMap<String, List<MSBGR_Rcv>> grpReportSetsSorted = new TreeMap<>();
				for (Map.Entry<String, List<MSBGR_Rcv>> entry : 
					rptList.stream().collect(Collectors.groupingBy(MCReportSet::getAppToCd1)).entrySet()) {
					grpReportSetsSorted.put(entry.getKey(), entry.getValue());
				}
				
				if (up1().indiv_prnt_flg()) {
					for (MSBGR_Rcv rs : rptList) {
						MCServerReportManager.request(rs);
					}
				} else {
					MSUCL_BpUtil.BpUtil_Sprt01 ope = MSUCL_BpUtil.crtBpUtil_Sprt01();
					ope.up0().bp_typ(MAC_BP_IS_SRCH_TYP.RCST.value());
					for (Map.Entry<String, List<MSBGR_Rcv>> mapReportSets : grpReportSetsSorted.entrySet()) {
						BpUtil_Sprt01_DtlR dtlR = BpUtil_Sprt01_DtlR.create();
						dtlR.bp_cd(mapReportSets.getKey());
						ope.up1().add(dtlR);
					}
					ope.exec();
					MCList<BpUtil_Sprt01_DtlR> bpUtil = MCList.create(BpUtil_Sprt01_DtlR.class);
					bpUtil = ope.down0();
					MCIndexKey bpUtilkey = bpUtil.createIndex(BpUtil_Sprt01_DtlR.$bp_cd);
					
					for (Map.Entry<String, List<MSBGR_Rcv>> mapReportSets : grpReportSetsSorted.entrySet()) {
						MCReportSet all = rptList.get(0).createInstance();
						BpUtil_Sprt01_DtlR bpR = bpUtil.getFirst(bpUtilkey, mapReportSets.getKey());

						if(bpR != null && bpR.indiv_prnt_flg()) {
							for (MSBGR_Rcv rs : mapReportSets.getValue()) {
								MCServerReportManager.request(rs);
							}
						} else {
							for (MCReportSet reportSet : mapReportSets.getValue()) {
								all.addAll(reportSet.getAll());
							}
							if(mapReportSets.getValue().size() > 1) {
								all.setPersistent(false);
							}
							MCServerReportManager.request(all);
						}
					}
				}
			}
		}

		/**
		 * 入金管理票が発行可能かをチェックし、発行可能な上り電文の行を返す。
		 * 
		 * @return
		 */
		protected MCList<ArSlip_Prnt02_HdrR> chkRcv() {

			MCList<MST_RCV_R> chkL = lockRcv();
			MCIndexKey ik = chkL.createIndex(MST_RCV_R.$rcv_no);

			MCList<ArSlip_Prnt02_HdrR> okList = MCList.create(ArSlip_Prnt02_HdrR.class);

			for (ArSlip_Prnt02_HdrR up : up0()) {

				MST_RCV_R chkR = chkL.getFirst(ik, up.rcv_no());
				MCMessageList msgList = new MCMessageList();

				if (chkR == null) {
					msgList.addAll(getRecordNotFoundMsg(
							"MS",
							"MST_RCV",
							new String[]{MST_RCV_R.$rcv_no},
							new Comparable[]{up.rcv_no()}, up));
				}

				if (msgList.isEmpty()) {

					okList.add(up);

					if (!chkR.prnt_flg()) {
						updRcv(up, chkR);
					}
				}
				else {
					MCMessagePool.addAll(msgList);
					up.err_flg(true);
				}

				down0().add(up);
			}
			return okList;
		}

		/**
		 * 入金をロックする
		 * 
		 * @return
		 */
		protected MCList<MST_RCV_R> lockRcv() {

			up0().sort(ArSlip_Prnt02_HdrR.$rcv_no); 

			MCList<MST_RCV_R> chkL = MCList.create(MST_RCV_R.class);
			MCQueryApiBuilder chkL_bldr = MCQueryApiBuilder.create(MST_RCV_R.create("T"));
			chkL_bldr.setOrderByAsc(chkL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectKey("MSBGL5050_MST_RCV_S01", chkL, chkL_bldr, up0());

			return chkL;
		}

		/**
		 * 入金を更新する
		 * 
		 * @return
		 */
		protected void updRcv(ArSlip_Prnt02_HdrR up, MST_RCV_R updR) {

			MST_RCV_R t = MST_RCV_R.create("T");
			MCQueryApiBuilder updR_bldr = MCQueryApiBuilder.create(t);

			updR.rcv_no(up.rcv_no());
			updR.prnt_flg(true);
			updR_bldr.setSet(t.prnt_flg);
			dbUpdateKey("MSBGL5050_MST_RCV_U01", updR, updR_bldr);
		}

		/**
		 * 入金を検索する
		 * 
		 * @return
		 */
		protected RcvHdrR srchRcv(ArSlip_Prnt02_HdrR r) {

			RcvHdrR hdrR = RcvHdrR.create();
			hdrR.addNumberColumn("seq_no");
			hdrR.addNumberColumn("amt_dec_place");
			executeQuery(hdrR, MSBGL5050_MST_RCV_S01(), r);
			return hdrR;
		}

		/**
		 * 取得した値を編集し、レポートセットにセットする
		 * 
		 * @param reportSet
		 * @param hdrR
		 * @param r
		 */
		protected void setData(MSBGR_Rcv reportSet, RcvHdrR hdrR, ArSlip_Prnt02_HdrR r) {

			if (r.del_flg()) {
				hdrR.rcv_prnt_typ_nm(MAC_RPT_STS_TYP.CAN.name(MCSys.user.locale()));
			}
			else {

				if (isSame(hdrR.getNumberNE("seq_no"), MCNumber.ONE)) {
					hdrR.rcv_prnt_typ_nm(MAC_RPT_STS_TYP.CRT.name(MCSys.user.locale()));
				}
				else {
					hdrR.rcv_prnt_typ_nm(MAC_RPT_STS_TYP.COR.name(MCSys.user.locale()));
				}
			}

			MAC_NOTE_TYP.putNameNE(hdrR, RcvHdrR.$note_typ, RcvHdrR.$note_typ_nm, MCSys.user.locale());

			hdrR.prnt_tm(MCDate.now());

			putNumStr(reportSet, hdrR,
					RcvHdrR.$s_xrate,
					RcvHdrR.$xrate,
					hdrR.getNumber("amt_dec_place"));

			putNumStr(reportSet, hdrR,
					RcvHdrR.$s_rcv_amt,
					RcvHdrR.$rcv_amt,
					hdrR.getNumber("amt_dec_place"));

			reportSet.addRow(hdrR);

			// 業務情報をセット
			reportSet.setAppReportNo1(hdrR.rcv_no());
			reportSet.setAppReportStsNm1(hdrR.rcv_prnt_typ_nm());
			reportSet.setAppUsrCd1(hdrR.rcv_dpt_cd());
			reportSet.setAppUsrNm1(hdrR.rcv_dpt_nm());
			reportSet.setAppUsrCd2(hdrR.rcv_usr_cd());
			reportSet.setAppUsrNm2(hdrR.rcv_usr_nm());
			reportSet.setAppUsrCd3(hdrR.bill_dpt_cd());
			reportSet.setAppUsrNm3(hdrR.bill_dpt_nm());
			reportSet.setAppToCd1(hdrR.rcst_cd());
			reportSet.setAppToNm1(hdrR.rcst_nm());
			reportSet.setAppToCd2(hdrR.bcst_cd());
			reportSet.setAppToNm2(hdrR.bcst_nm());
			if (isNull(hdrR.rcst_cd())) {
				reportSet.setAppToCd1("");
			} else {
				reportSet.setAppToCd1(hdrR.rcst_cd());
			}
		}
	}

	//FMCB CUSTOM END
}