package mcframe.serverMSBG.MSBGL5040;

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
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import mcframe.commonMSBG.MSBGR0010.MSBGR_Bill;
import mcframe.commonMSBG.MSBGR0010.BillHdrR;
import mcframe.commonMSBG.MSBGR0010.BillDtlR;
import mcframe.commonMSBG.MSBGR0020.MSBGR_SlsDtl;
import mcframe.commonMSBG.MSBGR0020.SlsHdrR;
import mcframe.serverMSBG.MSBGL5120.*;
import mcframe.serverMSLA.MSLAL5210.Bill_Send01_HdrR;
import mcframe.serverMSLA.MSLAL5210.MSLAL_BillSendIfService;
import mcframe.serverCore.report.MCServerReportManager;
import mcframe.serverCore.sys.MCSys;
import mcframe.commonCore.report.container.MCReportSet;
import static mcframe.serverMSBG.MSBGL5040.Query.*;
import mcframe.serverMAUC.MAUCL1060.*;
import java.util.Map;
import java.util.Map.Entry;
import java.util.LinkedHashMap;
import java.util.Collections;
import mcframe.serverMSUC.MSUCL0120.*;
import java.util.Set;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.commonCore.report.container.MCReportInfoR;
import mcframe.commonCore.report.MCFileWriteListener;
import mcframe.commonCore.report.MCReportFile;
import mcframe.commonCore.report.MCUCXSingleFile;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.serverMBBC.MBBCL5020.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBGL_BillPrntService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBGL_BillPrntService_MC extends MSBGL_BillPrntService_MC_A{
	//FMCB CUSTOM START
	public static final Class<MSBGL_BillPrntService> CLAZZ = MSBGL_BillPrntService.class;
	/** 
	 * 明細の行数のカウンタ 
	 */
	protected int _rowCnt = 0;

	/** 
	 * 明細の１ページあたりの最大行数（デフォルトは10行） 
	 */
	protected final static int _MAX_ROW_COUNT = 8;
	
	/**
	 * 請求書の入金予定表示行数
	 */
	protected final static int _RCV_SCHD_MAX_ROW_COUNT = 5;
	
	/**
	 * 請求書の税表示行数
	 */
	protected final static int _TAX_MAX_ROW_COUNT = 10;
	/**
	 * 請求書の税表示月別インデント
	 */
	protected final static String _TAX_MONTH_INDENT = "   ";
	
	/**
	 * 請求書ヘッダーベースリスト
	 */
	protected MCList<Bill_Prnt01_HdrBaseR> _billHdrBaseL = null;
	
	/**
	 * 請求書明細ベースリスト
	 */
	protected MCList<Bill_Prnt01_DtlBaseR> _billDtlBaseL = null;
	
	/**
	 * 請求書明細/お買い上げ明細リスト
	 */
	protected MCList<BillDtlR> _dtlL = null;
	
	/**
	 * 入金予定リスト
	 */
	protected MCList<MST_RCV_SCHD_R> _rcvSchdL = null;
	
	/**
	 * 請求書ReportSet
	 */
	protected MSBGR_Bill _billReportSet = null;
	
	/**
	 * お買い上げ明細ReportSet
	 */
	protected MSBGR_SlsDtl _slsDtlReportSet = null;
	
	/**
	 * 出荷時納品書明細リスト
	 */
	protected MCList<Bill_Prnt01_DtlBaseR> _shipDlvSlipDL = null;

	/**
	 * 請求書ReportSetリスト
	 */
	protected List<MSBGR_Bill> _billReportSetL = null;
	
	/**
	 * お買い上げ明細ReportSet
	 */
	protected List<MSBGR_SlsDtl> _slsDtlReportSetL = null;
	
	/**
	 * 請求書の出力中ＦＬＧ
	 */
	protected boolean isBillProcessing = false;
	/**
	 * 請求書ReportSetマップ
	 */
	protected Map<String, List<MSBGR_Bill>> _billReportMap = new LinkedHashMap<String, List<MSBGR_Bill>>();

	
	/**
	 * お買い上げ明細ReportSetマップ（キー１：請求先ＣＤ、キー２：[請求書NO,改訂番号]）
	 */
	protected Map<String, Map<List<String>, List<MSBGR_SlsDtl>>> _slsDtlReport2DMap = new LinkedHashMap<String, Map<List<String>, List<MSBGR_SlsDtl>>>();
	/**
	 * EDI IF制御マスタリスト
	 */
	MCList<MAM_EDI_IF_CTL_R> _ediIfCtrL = MCList.create(MAM_EDI_IF_CTL_R.class);
	
	/**
	 * Bill_Prnt01オペレーション.<p>
	 *
	 * 請求書を発行する。<br>
	 */
	public class Bill_Prnt01 extends MSBGL_BillPrntService_MC_A.Bill_Prnt01 {
		/** 発行する請求書NOに対する改訂番号を保持する（お買い上げ明細の改訂番号補完用） */
		protected Map<String,String> _prntKeyMap = new LinkedHashMap<String,String>();
		/** 再発行する請求書・お買い上げ明細キーのセット*/
		protected Set<List<String>> _rePrntSet = new HashSet<List<String>>();
		/** 請求書の添付帳票登録サービス呼出時に設定した電文を保持する（お買上明細の電文補完用）*/
		protected Map<List<String>,Attach_Chk01_DtlR> _billInfoMap= new LinkedHashMap<List<String>,Attach_Chk01_DtlR>();
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			crtBillWk();
			lockBill();
			getBillDtl();
			setShipDlvSlipD();
			getRcvSchd();
			getEdiIf();
			prnt();
		}
		
		/**
		 * 請求管理ＮＯがキーのワークを作成する
		 */
		protected void crtBillWk() {
			
			MCList<MST_BILL_R> dbcL = MCList.create(MST_BILL_R.class);
			for (Bill_Prnt01_HdrR upR : up0()) {
				MST_BILL_R dbcR = MST_BILL_R.create();
				dbcR.bill_mng_no(upR.bill_mng_no());
				dbcL.add(dbcR);
			}
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MST_BILL_R.create("T"));
			dbWkDelete("MSBGL5040_MSW_BILL_D01", dbcL_bldr.getBaseDbc());
			dbWkInsert("MSBGL5040_MSW_BILL_I01", dbcL, dbcL_bldr.getBaseDbc());
		}
		
		/**
		 * 請求をロック・取得する。
		 */
		protected void lockBill() {
			
			_billHdrBaseL = MCList.create(Bill_Prnt01_HdrBaseR.class);
			_billHdrBaseL.addBooleanColumn("bill_d_sel_flg");
			executeQuery(_billHdrBaseL, MSBGL5040_MST_BILL_S01());
			
			MAC_BANK_AC_TYP.putNameNE(_billHdrBaseL, Bill_Prnt01_HdrBaseR.$bank_ac_typ, Bill_Prnt01_HdrBaseR.$bank_ac_typ_nm, MCSys.user.locale());
		}
		
		/**
		 * 請求明細を取得する。
		 */
		protected void getBillDtl() {
			
			_billDtlBaseL = MCList.create(Bill_Prnt01_DtlBaseR.class);

			MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL = MCList.create(Bill_Prnt01_DtlBaseR.class);
			billDtlBaseL.addBooleanColumn("crryovr_flg");
			billDtlBaseL.addBooleanColumn("bill_prnt_tgt_flg");
			executeQuery(billDtlBaseL, MSBGL5040_MST_BILL_D_S01());
			_billDtlBaseL = getBillDtlBase(billDtlBaseL);
		}
		protected MCList<Bill_Prnt01_DtlBaseR> getBillDtlBase(MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL) {
			MCList<Bill_Prnt01_DtlBaseR> subBillDtlBaseL = MCList.create(Bill_Prnt01_DtlBaseR.class);
			MCIndexKey idxHdrkey = _billHdrBaseL.createIndex(Bill_Prnt01_HdrBaseR.$bill_mng_no);
			MCIndexKey idxDtlkey = billDtlBaseL.createIndex(Bill_Prnt01_DtlBaseR.$bill_mng_no);

			for (Bill_Prnt01_HdrR prntHdrR : up0()) {

				Bill_Prnt01_HdrBaseR billHdrBaseR = _billHdrBaseL.getFirst(idxHdrkey, prntHdrR.bill_mng_no());
				MCList<Bill_Prnt01_DtlBaseR> subDtlBaseL = billDtlBaseL.subList(idxDtlkey, billHdrBaseR.bill_mng_no());
				if (billHdrBaseR.getBooleanNE("bill_d_sel_flg")) {
					subBillDtlBaseL.addAll(subDtlBaseL.subList("bill_prnt_tgt_flg", true));
				}
				else {
					subBillDtlBaseL.addAll(subDtlBaseL);
				}
			}

			return subBillDtlBaseL;
		}
		
		/**
		 * 個別発行フラグ取得処理呼び出し
		 * @return 
		 */
		protected MCList<BpUtil_Sprt01_DtlR> getIndivPrnt() {
			MSUCL_BpUtil.BpUtil_Sprt01 ope = MSUCL_BpUtil.crtBpUtil_Sprt01();
			ope.up0().bp_typ(MAC_BP_IS_SRCH_TYP.BCST.value());
			for (Bill_Prnt01_HdrBaseR hdrR : _billHdrBaseL.groupBy(Bill_Prnt01_HdrBaseR.$bcst_cd)) {
				BpUtil_Sprt01_DtlR dtlR = BpUtil_Sprt01_DtlR.create();
				dtlR.bp_cd(hdrR.bcst_cd());
				ope.up1().add(dtlR);
			}
			ope.exec();

			return ope.down0();
		}
		
		/**
		 * 入金予定を取得する。
		 */
		protected void getRcvSchd() {
			
			_rcvSchdL = MCList.create(MST_RCV_SCHD_R.class);
			MST_RCV_SCHD_R t = MST_RCV_SCHD_R.create("T");
			MCQueryApiBuilder rcvSchdL_bldr = MCQueryApiBuilder.create(t);
			MAM_STTL_R m1 = MAM_STTL_R.create("M1");
			MSW_BILL_KEY_R w = MSW_BILL_KEY_R.create("W");
			rcvSchdL_bldr.setSelect(t.bill_mng_no,
					t.rcv_schd_dt, t.rcv_mtd_cd,
					t.rcv_typ, t.rcv_schd_amt);
			rcvSchdL_bldr.addSelect(m1.sttl_nm);
			rcvSchdL_bldr.addLeftOuterJoin(m1, m1.sttl_cd.eq(t.rcv_mtd_cd));
			rcvSchdL_bldr.addInnerJoin(w, w.bill_mng_no.eq(t.bill_mng_no));
			dbSelect("MSBGL5040_MST_RCV_SCHD_S01", _rcvSchdL, rcvSchdL_bldr);

		}
		
		/**
		 * 出荷時納品書明細を取得する。
		 */
		protected void setShipDlvSlipD() {

			_shipDlvSlipDL = MCList.create(Bill_Prnt01_DtlBaseR.class);
			MCList<Bill_Prnt01_DtlBaseR> shipDlvSlipDMutiL = _billDtlBaseL.subList(Bill_Prnt01_DtlBaseR.$ship_dlv_slip_multi_flg, true);

			if (!isNull(shipDlvSlipDMutiL)) {
				executeQuery(_shipDlvSlipDL, MSBGL5040_MST_DLV_SLIP_D_S01());
				
				MCIndexKey idxkey = _shipDlvSlipDL.createIndex(Bill_Prnt01_DtlBaseR.$act_d_no, Bill_Prnt01_DtlBaseR.$act_d_seq);
				for (Bill_Prnt01_DtlBaseR billDtlBaseR : shipDlvSlipDMutiL) {
					Bill_Prnt01_DtlBaseR dtlR = _shipDlvSlipDL.getFirst(idxkey, billDtlBaseR.act_d_no(), billDtlBaseR.act_d_seq());
					billDtlBaseR.ship_dlv_slip_d_no(dtlR.ship_dlv_slip_d_no());
				}
			}
		}
		
		/**
		 * 請求書＆お買い上げ明細を印刷する。
		 */
		protected void prnt() {
			
			initReportSetList();
			
			up0().sort(Bill_Prnt01_HdrR.$bill_mng_no, Bill_Prnt01_HdrR.$bill_no);
			
			for (Bill_Prnt01_HdrR prntHdrR : up0()) {
				
				MCIndexKey idxkey = _billHdrBaseL.createIndex(MST_BILL_R.$bill_mng_no);
				Bill_Prnt01_HdrBaseR billHdrBaseR = _billHdrBaseL.getFirst(idxkey, prntHdrR.bill_mng_no());
				
				try {
					
					chkBill(prntHdrR, billHdrBaseR);
					
					MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL = getBillDtlBase(billHdrBaseR);
					
					chkBillD(prntHdrR, billHdrBaseR, billDtlBaseL);
					
					crtBillReportSet(billHdrBaseR, billDtlBaseL);
					
					crtSlsDtlReportSet(billHdrBaseR, billDtlBaseL);
					_prntKeyMap.put(billHdrBaseR.bill_no(),billHdrBaseR.bill_rev().toString());
					if(billHdrBaseR.prnt_flg()) {
						addReprntSetKey(_rePrntSet, billHdrBaseR);
					}
					prntHdrR.err_flg(false);
					down0().add(prntHdrR);
				}
				catch (MCAppException ex) {
					
					MCLog.write(ex);
					MCMessagePool.add(ex.setCauseRow(prntHdrR, null).getMCMessage());
					down0().add(prntHdrR);
					setErrFlgCmm(down0());
					continue;
				}
				
				updPrntFlg(prntHdrR);
			}
			
			sort();
			
			prntAll(_billReportSetL);
			
			prntSlsAll(_slsDtlReportSetL);
		}
		
		/**
		 * ＥＤＩ ＩＦ制御マスタを取得する。
		 */
		protected void getEdiIf() {
			MAM_EDI_IF_CTL_R t = MAM_EDI_IF_CTL_R.create("T");
			MCQueryApiBuilder ediifctrL_bldr = MCQueryApiBuilder.create(t);
			ediifctrL_bldr.setSelect(t.if_proc_typ, t.bp_cd);
			ediifctrL_bldr
					.setWhere(t.if_proc_typ.eq(value(MAC_IF_PROC_TYP.BILL_SEND.value()))
							.and(value(getToday()).between(t.st_dt, t.end_dt)));
			dbSelect("MSBGL5040_MAM_EDI_IF_CTL_S01", _ediIfCtrL, ediifctrL_bldr);
		}
		
		/**
		 * Mapソート
		 */
		protected void sort() {
			//請求書ReportSetマップソート（請求先順）
			List<Entry<String, List<MSBGR_Bill>>> bill_entries = new ArrayList<Entry<String, List<MSBGR_Bill>>>(_billReportMap.entrySet());
			Collections.sort(bill_entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));

			LinkedHashMap<String, List<MSBGR_Bill>> billResult = new LinkedHashMap<>();
			for (Map.Entry<String, List<MSBGR_Bill>> bill_entry : bill_entries) {
				billResult.put(bill_entry.getKey(), bill_entry.getValue());
			}

			_billReportMap = billResult;
			
			//お買い上げ明細ReportSetマップソート（請求先順）
			
			List<Entry<String,Map<List<String>,List<MSBGR_SlsDtl>>>> sls_entries2D = new ArrayList<Entry<String,Map<List<String>,List<MSBGR_SlsDtl>>>>(_slsDtlReport2DMap.entrySet());
			Collections.sort(sls_entries2D, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));

			LinkedHashMap<String,Map<List<String>,List<MSBGR_SlsDtl>>> slsResult2D = new LinkedHashMap<>();
			for (Map.Entry<String,Map<List<String>,List<MSBGR_SlsDtl>>> sls_entry2D : sls_entries2D) {
				slsResult2D.put(sls_entry2D.getKey(), sls_entry2D.getValue());
			}

			_slsDtlReport2DMap = slsResult2D;
		}
		/**
		 * 個別発行するかどうかの真偽値を返す
		 * @param bp
		 * @param idxkey
		 * @param up1
		 * @param bpCd
		 * @return 画面の個別発行フラグがオンもしくはマスタの個別発行フラグがオンの場合はtrue、そうでなければfalse
		 */
		protected Boolean isIndivPrnt(MCList<BpUtil_Sprt01_DtlR> bp,MCIndexKey idxkey,Bill_Prnt01_CndR up1,String bpCd) {
			boolean indivPrntFlg = false;
			
			if (!up1().indiv_prnt_flg() && !bpCd.isEmpty()) {
				BpUtil_Sprt01_DtlR bpR = bp.getFirst(idxkey, bpCd);
				indivPrntFlg = bpR.indiv_prnt_flg();
			}
			if (up1().indiv_prnt_flg() || indivPrntFlg) {
				return true;
			}
			return false;
		}
		
		/**
		 * MCReportSetのListをもとに帳票を発行する。
		 * 1件分のMCReportSetを引数に指定した場合は、印刷データの登録と帳票発行する。
		 * 複数件のMCReportSetを引数に指定した場合は、１つのデータファイルにまとめて発行し、
		 * 印刷データは登録しない。
		 * 
		 * @param reportSets MCReportSetのList
		 */
		protected <E extends MCReportSet> void prntAll(List<E> reportSets) {
			MCList<BpUtil_Sprt01_DtlR> bp = null;
			MCIndexKey idxkey = null;
			// 画面の個別発行フラグがオフの場合
			if (!up1().indiv_prnt_flg()) {
				// 個別発行フラグ取得処理
				bp = getIndivPrnt();
				idxkey = bp.createIndex(BpUtil_Sprt01_DtlR.$bp_cd);
			}
			
			List<MCReportSet> rptSetList = new ArrayList<>();
			@SuppressWarnings({
					"rawtypes", "unchecked"
			})
			java.util.function.Function<MCReportSet, MCList> f= rptSet -> {
				MCList<MCRow> lst = MCList.create(MCRow.class);
				// 請求書(鑑)
				lst.addAll(rptSet.getAll("BillHdr"));
				
				// 請求書明細
				if (isNull(rptSet.get(0).getStringNE("bill_mng_no"))
						|| rptSet.get(0).getBooleanNE("bill_dtl_outp_flg")) {
					lst.add(lst.get(lst.size() - 1));		// 明細出力用ヘッダ
					lst.addAll(rptSet.getAll("BillDtl"));
				}
				return lst;
			};
			if (reportSets == null) {
				return;
			}
			int cnt = reportSets.size();
			if (cnt == 0) {
				return;
			}
			else if (cnt == 1) {
				
				
				Boolean isEdi = false;

				MCIndexKey ik = _ediIfCtrL.createIndex(MAM_EDI_IF_CTL_R.$bp_cd);
				if (!isNull(_ediIfCtrL.getFirst(ik,
						reportSets.get(0).get(0).getStringNE("bcst_cd")))) {
					MSLAL_BillSendIfService.BillSendIf_Upd01 ope = MSLAL_BillSendIfService
							.crtBillSendIf_Upd01();
					Bill_Send01_HdrR billSendHdr = Bill_Send01_HdrR.create();
					billSendHdr.bill_mng_no(
							reportSets.get(0).get(0).getStringNE("bill_mng_no"));
					billSendHdr.bill_print_flg(true);
					ope.up0().add(billSendHdr);
					ope.exec();

					isEdi = true;
				}
				else {
					isEdi = false;
				}

				// EDIフラグ更新
				MST_BILL_R updR = MST_BILL_R.create();
				MST_BILL_R t = MST_BILL_R.create("T");
				MCQueryApiBuilder updR_bldr = MCQueryApiBuilder.create(t);
				updR_bldr.setSet(t.edi_flg);
				updR_bldr.setWhere(t.bill_mng_no.eq(bindEx("bill_mng_no")));

				updR.bill_mng_no(reportSets.get(0).get(0).getStringNE("bill_mng_no"));
				updR.edi_flg(isEdi);

				dbUpdateKey("MSBGL5040_MST_BILL_U03", updR, updR_bldr);

				
				MCReportSet reportSet = reportSets.get(0).createInstance();
				copyBillBizInfo(reportSet, reportSets);
				reportSet.addAll(f.apply(reportSets.get(0)));
				if (isEdi) {
					MCServerReportManager.request(reportSet, false);
				}
				else {
					if (isIndivPrnt(bp,idxkey,up1(),reportSets.get(0).get(0).getStringNE("bcst_cd"))) {
						reportSet.addWriteListener(new FileWriteListener(rptSetList));
						MCServerReportManager.requestImmediate(reportSet);
					}else {
						MCServerReportManager.request(reportSet);
					}
				}
			}
			else {
				
				MSLAL_BillSendIfService.BillSendIf_Upd01 billSendIfOpe = MSLAL_BillSendIfService
						.crtBillSendIf_Upd01();
				MCList<MST_BILL_R> updL = MCList.create(MST_BILL_R.class);
				for (Map.Entry<String, List<MSBGR_Bill>> bcst : _billReportMap.entrySet()) {
					String bcstCd = bcst.getKey();
					MCIndexKey ik = _ediIfCtrL.createIndex(MAM_EDI_IF_CTL_R.$bp_cd);
					Boolean isEdiSendFlg = !isNull(_ediIfCtrL.getFirst(ik, bcstCd));

					if (isEdiSendFlg) {
						for (MSBGR_Bill billReport : bcst.getValue()) {
							// 帳票データの保管(印刷はしない)
							MCReportSet singleRptSet = billReport.createInstance();
							singleRptSet.addAll(f.apply(billReport));
							MCServerReportManager.request(singleRptSet, false);

							// 印刷の代わりに請求送信IFの要求を作成
							Bill_Send01_HdrR billSendHdr = Bill_Send01_HdrR.create();
							billSendHdr.bill_mng_no(
									billReport.get(0).getStringNE("bill_mng_no"));
							billSendHdr.bill_print_flg(true);
							billSendIfOpe.up0().add(billSendHdr);

							// EDIフラグ更新
							MST_BILL_R updR = MST_BILL_R.create();
							updR.bill_mng_no(
									billReport.get(0).getStringNE("bill_mng_no"));
							updR.edi_flg(true);
							updL.add(updR);
						}
					}
					else {
						for (MSBGR_Bill billReport : bcst.getValue()) {
							// EDIフラグ更新
							MST_BILL_R updR = MST_BILL_R.create();
							updR.bill_mng_no(
									billReport.get(0).getStringNE("bill_mng_no"));
							updR.edi_flg(false);
							updL.add(updR);
						}
					}

					if (isEdiSendFlg) continue;


					if (isIndivPrnt(bp,idxkey,up1(),bcstCd)) {
						for (MSBGR_Bill billReport : bcst.getValue()) {
							MCReportSet reportSet = billReport.createInstance();
							reportSet.addAll(f.apply(billReport));
							reportSet.addWriteListener(new FileWriteListener(rptSetList));
							MCServerReportManager.requestImmediate(reportSet);
						}
					}
					else {
						MCReportSet all = bcst.getValue().get(0).createInstance();
						MCReportSet singleRptSet = null;
						for (MSBGR_Bill billReport : bcst.getValue()) {
							singleRptSet = billReport.createInstance();
							singleRptSet.addAll(f.apply(billReport));
							all.addAll(singleRptSet.getAll());

							MCServerReportManager.request(singleRptSet, false);
						}
						all.setPersistent(false);
						MCServerReportManager.request(all);
					}
				}
				
				if (billSendIfOpe.up0().size() > 0) {
					billSendIfOpe.exec();
				}

				if (updL.size() > 0) {
					MST_BILL_R t = MST_BILL_R.create("T");
					MCQueryApiBuilder updR_bldr = MCQueryApiBuilder.create(t);
					updR_bldr.setSet(t.edi_flg);
					updR_bldr.setWhere(t.bill_mng_no.eq(bindEx("bill_mng_no")));

					dbUpdateKey("MSBGL5040_MST_BILL_U03", updL, updR_bldr);
				}
			}
			if(!rptSetList.isEmpty()) {
				callBillAttachSrv(rptSetList);
			}
		}
		
		/**
		 * お買い上げ明細のMCReportSetのListをもとに帳票を発行する。
		 * 1件分のMCReportSetを引数に指定した場合は、印刷データの登録と帳票発行する。
		 * 複数件のMCReportSetを引数に指定した場合は、１つのデータファイルにまとめて発行し、
		 * 印刷データは登録しない。
		 * 
		 * @param reportSets MCReportSetのList
		 */
		protected <E extends MCReportSet> void prntSlsAll(List<E> reportSets) {
			MCList<BpUtil_Sprt01_DtlR> bp = null;
			MCIndexKey idxkey = null;
			List<MCReportSet> rptSetList = new ArrayList<>();
			// 画面の個別発行フラグがオフの場合
			if (!up1().indiv_prnt_flg()) {
				// 個別発行フラグ取得処理
				bp = getIndivPrnt();
				idxkey = bp.createIndex(BpUtil_Sprt01_DtlR.$bp_cd);
			}
			if (reportSets == null) {
				return;
			}
			int cnt = reportSets.size();
			if (cnt == 0) {
				return;
			}
			else if (cnt == 1) {

				MCReportSet reportSet = reportSets.get(0).createInstance();
				copyBillBizInfo(reportSet, reportSets);
				reportSet.addRow(reportSets.get(0).get(0));
				if (isNull(reportSets.get(0).get(0).getStringNE("bill_mng_no"))
						|| reportSets.get(0).get(0).getBooleanNE("bill_dtl_outp_flg")) {
					reportSet.addAll(reportSets.get(0).getAll());
				}
				String bcstCd = getBcstCd(reportSets.get(0), reportSets.get(0).get(0).getStringNE("bill_no"));
				if (isIndivPrnt(bp,idxkey,up1(),bcstCd)) {
					reportSet.addWriteListener(new FileWriteListener(rptSetList));
					MCServerReportManager.requestImmediate(reportSet);
				}else {
					MCServerReportManager.request(reportSet);
				}
			}
			else {

				for (Entry<String,Map<List<String>,List<MSBGR_SlsDtl>>> bcst : _slsDtlReport2DMap.entrySet()) {
					String bcstCd = bcst.getKey();
					if (isIndivPrnt(bp,idxkey,up1(),bcstCd)) {

						
						//同じ請求先の場合は「請求書NO,改訂番号」毎に分けて発行する
						Map<List<String>,List<MSBGR_SlsDtl>> innerSlsMap = bcst.getValue();
						for(Entry<List<String>,List<MSBGR_SlsDtl>> slsEntry : innerSlsMap.entrySet()) {
							//同じ請求書NO,revのお買上明細は１つのPDF
							MCReportSet all = slsEntry.getValue().get(0).createInstance();
							MCReportSet singleRptSet = null;
							for (MSBGR_SlsDtl slsReport : slsEntry.getValue()) {
								all.addRow(slsReport.get(0));
								singleRptSet = slsReport.createInstance();
								singleRptSet.addRow(slsReport.get(0));

								if (isNull(slsReport.get(0).getStringNE("bill_mng_no"))
										|| slsReport.get(0).getBooleanNE("bill_dtl_outp_flg")) {
									all.addAll(slsReport.getAll());
									singleRptSet.addAll(slsReport.getAll());
								}

								MCServerReportManager.request(singleRptSet, false);
							}
							all.setPersistent(false);
							all.addWriteListener(new FileWriteListener(rptSetList));
							MCServerReportManager.requestImmediate(all);
						}
					}
					else {
						Map<List<String>,List<MSBGR_SlsDtl>> innerSlsMap = bcst.getValue();
						List<Entry<List<String>, List<MSBGR_SlsDtl>>>innerSlsEntries = new ArrayList<Entry<List<String>, List<MSBGR_SlsDtl>>>(innerSlsMap.entrySet());
						MCReportSet all = innerSlsEntries.get(0).getValue().get(0).createInstance();
						MCReportSet singleRptSet = null;

						for(Entry<List<String>,List<MSBGR_SlsDtl>> slsEntry : innerSlsMap.entrySet()) {
							for (MSBGR_SlsDtl slsReport : slsEntry.getValue()) {
								all.addRow(slsReport.get(0));
								singleRptSet = slsReport.createInstance();
								singleRptSet.addRow(slsReport.get(0));

								if (isNull(slsReport.get(0).getStringNE("bill_mng_no"))
										|| slsReport.get(0).getBooleanNE("bill_dtl_outp_flg")) {
									all.addAll(slsReport.getAll());
									singleRptSet.addAll(slsReport.getAll());
								}

								MCServerReportManager.request(singleRptSet, false);
							}
						}
						all.setPersistent(false);
						MCServerReportManager.request(all);
					}
				}
			}
			//添付帳票登録サービス（更新）の呼び出し
			if(!rptSetList.isEmpty()) {
				callSlsDtlAttachSrv(rptSetList);
			}
		}

		/**
		 * 請求書業務情報をコピーする
		 * 
		 * @param reportSet コピー先
		 * @param reportSets コピー元
		 */
		protected <E extends MCReportSet> void copyBillBizInfo(MCReportSet reportSet, List<E> reportSets) {
			reportSet.setAppReportNo1(reportSets.get(0).getAppReportNo1());
			reportSet.setAppUsrCd1(reportSets.get(0).getAppUsrCd1());
			reportSet.setAppUsrNm1(reportSets.get(0).getAppUsrNm1());
			reportSet.setAppToCd1(reportSets.get(0).getAppToCd1());
			reportSet.setAppToNm1(reportSets.get(0).getAppToNm1());
		}
		
		/**
		 * 請求書＆お買い上げ明細のReportSetリストを初期化する。
		 */
		protected void initReportSetList() {

			_billReportSetL = new ArrayList<MSBGR_Bill>();
			_slsDtlReportSetL = new ArrayList<MSBGR_SlsDtl>();
		}
		
		/**
		 * 請求書発行チェック処理を行う。
		 * @param prntHdrR 上り電文Row
		 * @param billHdrBaseR 請求ヘッダーベースRow
		 */
		protected void chkBill(Bill_Prnt01_HdrR prntHdrR, Bill_Prnt01_HdrBaseR billHdrBaseR) {
			
			MCIndexKey idxkey = _billDtlBaseL.createIndex(Bill_Prnt01_DtlBaseR.$bill_mng_no);
			MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL = _billDtlBaseL.subList(idxkey, prntHdrR.bill_mng_no());
				
			if (isNull(billHdrBaseR) || billHdrBaseR.isEmpty() || MAC_STR.isNULL_VAL(billHdrBaseR.bill_no())) {
				throw new MCAppException(prntHdrR, Bill_Prnt01_HdrR.$bill_no, MSBGL0113, prntHdrR.bill_no());
			}
			
			if ((isNull(billDtlBaseL) || billDtlBaseL.isEmpty()) && billHdrBaseR.last_bill_amt().isZero()) {
				throw new MCAppException(prntHdrR, Bill_Prnt01_HdrR.$bill_no, MSBGL0114, prntHdrR.bill_no());
			}
			
			if (MAC_BILL_PRNT_TYP.isRCV_ADJ(billHdrBaseR.bill_prnt_typ()) && !billHdrBaseR.rcv_schd_adjst_flg()) {
				throw new MCAppException(prntHdrR, Bill_Prnt01_HdrR.$bill_no, MSBGL0119, prntHdrR.bill_no());
			}
			if (MAC_BILL_PRNT_TYP.isNOT_PRNT(billHdrBaseR.bill_prnt_typ())) {
				throw new MCAppException(prntHdrR, Bill_Prnt01_HdrR.$bill_no, MSBGL0039, prntHdrR.bill_no(), billHdrBaseR.bcst_cd());
			}
		}
		
		/**
		 * 請求明細のチェック処理を行う。
		 * @param billHdrBaseR 請求ヘッダーベース
		 * @param billDtlBaseL 請求明細ベースリスト
		 */
		protected void chkBillD(Bill_Prnt01_HdrR prntHdrR, Bill_Prnt01_HdrBaseR billHdrBaseR, MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL) {
			MCIndexKey indxKey = billDtlBaseL.createIndex(Bill_Prnt01_DtlBaseR.$slip_sts_typ, Bill_Prnt01_DtlBaseR.$interim_flg);
			MAM_BP_R bill = MSBGL_ArUtil.getBp(billHdrBaseR.bcst_cd());
			if(isNull(bill)) {
				return;
			}
			if (billHdrBaseR.bill_each_sls_flg() &&
					!bill.sls_interim_cl_flg() &&
					billDtlBaseL.subList(indxKey, MAC_SLIP_STS_TYP.CRT.value(), true).size() > 0) {
				throw new MCAppException(prntHdrR, Bill_Prnt01_HdrR.$bill_no, MSBGL0036, prntHdrR.bill_no());
			}
		}
		
		/**
		 * 請求書ReportSetを作成する。
		 * @param billHdrBaseR 請求ヘッダーベースRow
		 */
		protected void crtBillReportSet(Bill_Prnt01_HdrBaseR billHdrBaseR, MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL) {
			
			initBill();

			addPrntBillHdr(billHdrBaseR, billDtlBaseL);
			
			addPrntBillDtl(billHdrBaseR, billDtlBaseL);
			
			setBillBizInfo(billHdrBaseR);
			
			List<MSBGR_Bill> list = _billReportMap.get(billHdrBaseR.bcst_cd());
			if (list == null) {
				list = new ArrayList<MSBGR_Bill>();
				list.add(_billReportSet);
				_billReportMap.put(billHdrBaseR.bcst_cd(), list);
			}
			else {
				list.add(_billReportSet);
			}
			
			if (_billReportSet.size() > 0) {
				
				_billReportSetL.add(_billReportSet);
			}
		}
		
		/**
		 * 請求書の出力処理を初期化する。
		 */
		protected void initBill() {
			
			isBillProcessing = true;

			_billReportSet = new MSBGR_Bill();
			
			_rowCnt = 0;
			_dtlL = MCList.create(BillDtlR.class);
			_dtlL.addNumberColumn(Bill_Prnt01_DtlBaseR.$trd_unit_dec_place);
		}
		
		/**
		 * 請求書ヘッダーを作成する。
		 * @param billHdrR 請求ヘッダー
		 * @param billDtlL 請求明細
		 */
		protected void addPrntBillHdr(Bill_Prnt01_HdrBaseR billHdrBaseR, MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL) {
			
			BillHdrR billHdrR = BillHdrR.create();
			MCList<BillHdrR> billHdrL = MCList.create(BillHdrR.class);
			billHdrL.add(billHdrR);
			
			copy(billHdrR, billHdrBaseR, createMap_BillHdrR_Bill_Prnt01_HdrBaseR());
		
			billHdrR.re_issue(billHdrBaseR.prnt_flg() ? MSC_BILL_PRNT_STR.RE_PRNT.name(MCSys.user.locale()) : null);
			
			setBillHdrDt(billHdrBaseR, billHdrR);
			
			setBillHdrCo(billHdrR);
			
			setBillHdrAddr(billHdrR);
			
			setBillHdrAmt(billHdrBaseR, billHdrR, billDtlBaseL);
			
			setBillHdrTax(billHdrL, billDtlBaseL);
			
			setBillHdrRcvSchd(billHdrBaseR, billHdrR);
			
			putNumStrBillHdr(billHdrBaseR, billHdrL);
			putTaxRateStrHdr(billHdrL);
			setHdrReport(billHdrL);
		}
		
		/**
		 * 会社情報を設定する。
		 * @param billHdrR  請求ヘッダー
		 */
		protected void setBillHdrCo(BillHdrR billHdrR) {

			billHdrR.co_cd(getCo().co_cd());
			billHdrR.zip_cd(getCo().zip_cd());
			billHdrR.addr1(getCo().addr1());
			billHdrR.addr2(getCo().addr2());
			billHdrR.addr3(getCo().addr3());
			billHdrR.addr4(getCo().addr4());
			billHdrR.dpt_tel(nvl(billHdrR.dpt_tel(), getCo().tel()));
			billHdrR.biz_co_no(getCo().biz_co_no());
		}
		
		/**
		 * 請求書ヘッダーの住所を設定する。
		 * @param billHdrR 請求ヘッダー
		 */
		protected void setBillHdrAddr(BillHdrR billHdrR) {
			
			billHdrR.bill_addr(concatAddress(billHdrR.bill_addr1(), billHdrR.bill_addr2(), billHdrR.bill_addr3(), billHdrR.bill_addr4()));
			billHdrR.addr(concatAddress(billHdrR.addr1(), billHdrR.addr2(), billHdrR.addr3(), billHdrR.addr4()));
		}
		
		/**
		 * 請求書ヘッダーの日付を設定する。
		 * @param billHdrBaseR 請求ヘッダーベースRow
		 * @param billHdrR 請求ヘッダー
		 */
		protected void setBillHdrDt(Bill_Prnt01_HdrBaseR billHdrBaseR, BillHdrR billHdrR) {	
			
			billHdrR.prnt_tm(MCDate.now());
			billHdrR.bill_ym(billHdrBaseR.bill_cl_dt().startOfMonth());
			billHdrR.bill_cl_day(billHdrBaseR.bill_cl_day());
			billHdrR.bill_dt(billHdrBaseR.bill_dt());
		}
		
		/**
		 * 請求書ヘッダーの金額を設定する。
		 * @param billHdrR 請求ヘッダー
		 * @param billDtlL 請求明細
		 */
		protected void setBillHdrAmt(Bill_Prnt01_HdrBaseR billHdrBaseR, BillHdrR billHdrR, MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL) {

			MCIndexKey key = billDtlBaseL.createIndex(Bill_Prnt01_DtlBaseR.$ar_trd_grp_typ);
			MCIndexKey key2 = billDtlBaseL.createIndex(Bill_Prnt01_DtlBaseR.$trd_ptn_typ);

			// 各種金額の計算
			MCNumber slsAmt = sumAmt(billDtlBaseL, MAC_AR_TRD_GRP_TYP.SLS, key);
			MCNumber sretAmt = sumAmt(billDtlBaseL, MAC_AR_TRD_GRP_TYP.SLS_RTN, key);
			MCNumber dscntAmt = sumAmt(billDtlBaseL, MAC_AR_TRD_GRP_TYP.SLS_DSCNT, key);
			MCList<Bill_Prnt01_DtlBaseR> arDtlL = billDtlBaseL.subList(r -> !isAdvTrdTyp(r.trd_ptn_typ()));
			MCNumber rcvAmt = sumRcvAmt(arDtlL);
			MCNumber setoffAmt = sumSetoffAmt(arDtlL);
			MCNumber setoffTaxAmt = sumSetoffTaxAmt(arDtlL);
			MCNumber swAmt = sumAmt(billDtlBaseL, MAC_TRD_PTN_TYP.ARSW_OUT_BILL_BAL, key2)
					.add(sumAmt(billDtlBaseL, MAC_TRD_PTN_TYP.ARSW_OUT_NOT_BILL_BAL, key2));
			MCNumber swToAmt = sumAmt(billDtlBaseL, MAC_TRD_PTN_TYP.ARSW_IN_BILL_BAL, key2)
					.add(sumAmt(billDtlBaseL, MAC_TRD_PTN_TYP.ARSW_IN_NOT_BILL_BAL,	key2));
			MCNumber taxAmt = nvl(billDtlBaseL.sum(Bill_Prnt01_DtlBaseR.$trd_cur_tax_amt), MCNumber.ZERO);

			// ヘッダへの金額設定
			billHdrR.sls_amt(slsAmt);
			billHdrR.dscnt_amt(dscntAmt);
			billHdrR.ret_amt(sretAmt);
			billHdrR.tax_amt(taxAmt.subtract(setoffTaxAmt));
			billHdrR.sw_to_amt(swToAmt);
			billHdrR.adv_amt_bal(billHdrBaseR.adv_amt_bal());

			// 繰越金額を表示する場合
			if (isBfwBalDisp(billHdrBaseR, arDtlL)) {
				
				billHdrR.last_bill_amt(billHdrR.last_bill_amt());
				billHdrR.rcv_amt(rcvAmt);
				billHdrR.setoff_amt(setoffAmt.subtract(setoffTaxAmt).multiply(-1));
				billHdrR.setoff_tax_amt(setoffTaxAmt);
				billHdrR.sw_amt(swAmt);
				billHdrR.bfw_amt(MCNumber.sum(billHdrR.last_bill_amt(), billHdrR.rcv_amt().negate(), billHdrR.sw_amt().negate()));
				billHdrR.bill_amt(MCNumber.sum(billHdrR.bfw_amt(), slsAmt, sretAmt, dscntAmt, taxAmt, swToAmt, setoffAmt.negate()));
				billHdrR.adv_amt(billHdrBaseR.adv_amt());
				billHdrR.adv_setoff_amt(billHdrBaseR.adv_setoff_amt());
				billHdrR.adv_setoff_tax_amt(billHdrBaseR.adv_setoff_tax_amt());
			}
			// 繰越金額を表示しない場合
			else {
				
				billHdrR.last_bill_amt(null);
				billHdrR.rcv_amt(null);
				billHdrR.setoff_amt(null);
				billHdrR.setoff_tax_amt(null);
				billHdrR.sw_amt(swAmt.isZero() ? null : swAmt);
				billHdrR.bfw_amt(swAmt.isZero() ? null : swAmt.negate());
				billHdrR.bill_amt(MCNumber.sum(swAmt.negate(), slsAmt, sretAmt, dscntAmt, taxAmt, swToAmt));
				if (!isBfwBalDisp(billHdrBaseR)) {
					billHdrR.adv_amt(null);
					billHdrR.adv_setoff_amt(null);
					billHdrR.adv_setoff_tax_amt(null);
				}
				else {
					billHdrR.adv_amt(billHdrBaseR.adv_amt());
					billHdrR.adv_setoff_amt(billHdrBaseR.adv_setoff_amt());
					billHdrR.adv_setoff_tax_amt(billHdrBaseR.adv_setoff_tax_amt());
				}
			}
		}
		
		/**
		 * 請求書ヘッダーの消費税を設定する。
		 * @param billHdrR 請求ヘッダー
		 * @param billDtlBaseL 請求明細
		 */
		protected void setBillHdrTax(MCList<BillHdrR> billHdrL, MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL) {
			
			BillHdrR billHdrR = billHdrL.get(0);
			BillHdrR orgHdrTaxR = billHdrR.clone();
			
			// 点在している税をまとめる
			MCList<Bill_Prnt01_DtlBaseR> billDtlL = calcBillHdrTax(billDtlBaseL);
			
			// 外貨ＦＬＧ
			boolean foreignFlg = !isSame(billHdrR.cur_cd(), getBaseCur().cur_cd()) && !isNull(billHdrR.bill_xrate());
			
			int taxRowCnt = 0;
			for (MCList<Bill_Prnt01_DtlBaseR> taxGrpL : taxGroupList(billDtlL)) {
				
				if (taxRowCnt > 0 && taxRowCnt + taxGrpL.size() + 1 > _TAX_MAX_ROW_COUNT) {
					// ヘッダ改行の処理
					billHdrR = orgHdrTaxR.clone();
					billHdrL.add(billHdrR);
					taxRowCnt = 0;
				}
				
				// 税率ごとの内訳を設定する
				taxRowCnt++;
				billHdrR.setValueNE(getColumnNmByRowCnt(BillHdrR.$tax_rate1, taxRowCnt), taxGrpL.get(0).getNumberNE(Bill_Prnt01_DtlBaseR.$tax_rate));
				billHdrR.setValueNE(getColumnNmByRowCnt(BillHdrR.$tax_rate_sls_amt1, taxRowCnt), taxGrpL.sum(Bill_Prnt01_DtlBaseR.$trd_cur_amt));
				billHdrR.setValueNE(getColumnNmByRowCnt(BillHdrR.$tax_rate_tax_amt1, taxRowCnt), taxGrpL.sum(Bill_Prnt01_DtlBaseR.$trd_cur_tax_amt));
				if (foreignFlg) {
					billHdrR.setValueNE(getColumnNmByRowCnt(BillHdrR.$tax_rate_base_tax_amt1, taxRowCnt), taxGrpL.sum(Bill_Prnt01_DtlBaseR.$base_cur_tax_amt));
				}
				
				// 対象月ごとの内訳を設定する。最大10行（税率＋9か月分）。それ以降は出力されない
				for (Bill_Prnt01_DtlBaseR taxYmR : taxGrpL) {
					taxRowCnt++;
					billHdrR.setValueNE(getColumnNmByRowCnt("tax_ac_ym1", taxRowCnt), toYMString(taxYmR.ac_ym()));
					billHdrR.setValueNE(getColumnNmByRowCnt(BillHdrR.$tax_rate_sls_amt1, taxRowCnt), taxYmR.trd_cur_amt());
					billHdrR.setValueNE(getColumnNmByRowCnt(BillHdrR.$tax_rate_tax_amt1, taxRowCnt), taxYmR.trd_cur_tax_amt());
					if (foreignFlg) {
						billHdrR.setValueNE(getColumnNmByRowCnt(BillHdrR.$tax_rate_base_tax_amt1, taxRowCnt), taxYmR.base_cur_tax_amt());
					}
				}
				
				// 空白行の追加
				taxRowCnt++;
			}
		}
		
		protected MCList<Bill_Prnt01_DtlBaseR> calcBillHdrTax(MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL) {
			MCList<Bill_Prnt01_DtlBaseR> retL = MCList.create(Bill_Prnt01_DtlBaseR.class);
			for (Bill_Prnt01_DtlBaseR baseR : billDtlBaseL) {
				if (isNullAnd(baseR.tax_rate(), baseR.tax_rate1(), baseR.tax_rate2())) {
					continue;
				}
				
				Bill_Prnt01_DtlBaseR tmpR = Bill_Prnt01_DtlBaseR.create();
				boolean addTgt = true;
				
				tmpR.ac_ym(baseR.ac_ym());
				
				if (!isNull(baseR.tax_rate())) {
					tmpR.tax_rate(baseR.tax_rate());
					tmpR.trd_cur_amt(baseR.trd_cur_amt());
					tmpR.trd_cur_tax_amt(baseR.trd_cur_tax_amt());
					tmpR.base_cur_tax_amt(baseR.base_cur_tax_amt());
				}
				else if (!isNull(baseR.tax_rate1())) {
					int sign = MAC_AR_STTL_TYP.isSETOFF_DR(baseR.ar_sttl_typ1()) ? -1 : 1;
					tmpR.tax_rate(baseR.tax_rate1());
					if (baseR.bill_tax_disp_flg1()) {
						tmpR.trd_cur_amt((baseR.trd_cur_amt1().subtract(baseR.trd_cur_tax_amt1())).multiply(sign));
						tmpR.trd_cur_tax_amt(baseR.trd_cur_tax_amt1().multiply(sign));
						tmpR.base_cur_tax_amt(baseR.base_cur_tax_amt1().multiply(sign));
					}
					else {
						addTgt = false;
					}
				}
				else if (!isNull(baseR.tax_rate2())) {
					int sign = MAC_AR_STTL_TYP.isSETOFF_DR(baseR.ar_sttl_typ2()) ? -1 : 1;
					tmpR.tax_rate(baseR.tax_rate2());
					if (baseR.bill_tax_disp_flg2()) {
						tmpR.trd_cur_amt((baseR.trd_cur_amt2().subtract(baseR.trd_cur_tax_amt2())).multiply(sign));
						tmpR.trd_cur_tax_amt(baseR.trd_cur_tax_amt2().multiply(sign));
						tmpR.base_cur_tax_amt(baseR.base_cur_tax_amt2().multiply(sign));
					}
					else {
						addTgt = false;
					}
				}
				if (addTgt) {
					retL.add(tmpR);
				}
			}
			return retL;
		}
		protected MCList<Bill_Prnt01_DtlBaseR>[] taxGroupList(MCList<Bill_Prnt01_DtlBaseR> billDtlL) {
			MCGroupByPolicy policy = new MCGroupByPolicy(
				Bill_Prnt01_DtlBaseR.$tax_rate,
				Bill_Prnt01_DtlBaseR.$ac_ym
			);
			policy.sum(
				Bill_Prnt01_DtlBaseR.$trd_cur_amt,
				Bill_Prnt01_DtlBaseR.$trd_cur_tax_amt,
				Bill_Prnt01_DtlBaseR.$base_cur_tax_amt
			);
			// 税率、計上年月でサマリし、税率ごとのリストを作成する
			MCList<Bill_Prnt01_DtlBaseR>[] arr =
				billDtlL.groupBy(policy).groupList(Bill_Prnt01_DtlBaseR.$tax_rate);
			
			// 税率、計上年月の昇順で並び変える
			for (int i=0; i<arr.length; i++) {
				arr[i].sort(Bill_Prnt01_DtlBaseR.$ac_ym);
			}
			Arrays.sort(arr, new java.util.Comparator<MCList<Bill_Prnt01_DtlBaseR>>() {
				public int compare(MCList<Bill_Prnt01_DtlBaseR> o1, MCList<Bill_Prnt01_DtlBaseR> o2) {
					return o1.get(0).tax_rate().compareTo(o2.get(0).tax_rate());
				}
			});
			
			return arr;
		}
		
		/**
		 * 請求書ヘッダーの入金予定を設定する。
		 * @param billHdrR 請求ヘッダー
		 */
		protected void setBillHdrRcvSchd(Bill_Prnt01_HdrBaseR billHdrBaseR, BillHdrR billHdrR) {
			
			MCIndexKey idxkey = _rcvSchdL.createIndex(MST_RCV_SCHD_R.$bill_mng_no);
			MCList<MST_RCV_SCHD_R> subRcvSchdL = _rcvSchdL.subList(idxkey, billHdrR.getStringNE(MST_RCV_SCHD_R.$bill_mng_no));
			subRcvSchdL.sort(MST_RCV_SCHD_R.$rcv_schd_dt, MST_RCV_SCHD_R.$rcv_mtd_cd);
			
			MST_RCV_SCHD_R rcvSchdR = null;
			MCNumber rcvSchdAmtSum = MCNumber.ZERO;
			
			for (int i = 0; i < subRcvSchdL.size(); i++) {
				
				rcvSchdR = subRcvSchdL.get(i);
				
				int rcvRowCnt = i + 1;
				
				if (rcvRowCnt < _RCV_SCHD_MAX_ROW_COUNT 
						|| (rcvRowCnt == _RCV_SCHD_MAX_ROW_COUNT && subRcvSchdL.size() == _RCV_SCHD_MAX_ROW_COUNT )) {
					
					if (billHdrBaseR.bill_dtl_rcv_flg()) {
						billHdrR.setValueNE(getColumnNmByRowCnt(BillHdrR.$rcv_schd_dt1, rcvRowCnt), rcvSchdR.rcv_schd_dt());
						billHdrR.setValueNE(getColumnNmByRowCnt(BillHdrR.$rcv_mtd_cd1, rcvRowCnt), rcvSchdR.rcv_mtd_cd());
						billHdrR.setValueNE(getColumnNmByRowCnt(BillHdrR.$sttl_nm1, rcvRowCnt), rcvSchdR.getStringNE(MAM_STTL_R.$sttl_nm));
						billHdrR.setValueNE(getColumnNmByRowCnt(BillHdrR.$rcv_schd_amt1, rcvRowCnt), rcvSchdR.rcv_schd_amt());
					
						rcvSchdAmtSum = rcvSchdAmtSum.add(rcvSchdR.rcv_schd_amt());
					}
				}
				else {
					break;
				}
			}
			
			if (subRcvSchdL.size() > _RCV_SCHD_MAX_ROW_COUNT) {
				if (billHdrBaseR.bill_dtl_rcv_flg()) {
					billHdrR.setValueNE(getColumnNmByRowCnt(BillHdrR.$sttl_nm1, _RCV_SCHD_MAX_ROW_COUNT), MSC_BILL_PRNT_STR.ELSE_RCV_SCHD.name(MCSys.user.locale()));
					billHdrR.setValueNE(getColumnNmByRowCnt(BillHdrR.$rcv_schd_amt1, _RCV_SCHD_MAX_ROW_COUNT), 
							subRcvSchdL.sum(MST_RCV_SCHD_R.$rcv_schd_amt).subtract(rcvSchdAmtSum));
				}
			}
			
			if (!isBankDisp(subRcvSchdL)) {
				// 入金予定に振込が含まれてない場合は、振込口座情報をクリアする
				
				billHdrR.clear(BillHdrR.$rcv_bank_ac_cd,
						BillHdrR.$bank_cd,
						BillHdrR.$bank_nm,
						BillHdrR.$bank_ac_cd,
						BillHdrR.$bank_ac_nm,
						BillHdrR.$bank_ac_typ,
						BillHdrR.$bank_ac_typ_nm,
						BillHdrR.$bank_ac_no,
						BillHdrR.$bank_ac_holder);
			}
		}
		
		/**
		 * 請求明細を作成する。
		 * 
		 * @param billHdrBaseR 請求ヘッダーベースRow
		 * @param billDtlBaseL 請求明細
		 */
		protected void addPrntBillDtl(Bill_Prnt01_HdrBaseR billHdrBaseR, MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL) {

			// 明細が１件も存在しない場合
			if (isNull(billDtlBaseL)) {
				return;
			}

			// 請求明細印刷が不要な場合
			if (!billHdrBaseR.bill_dtl_outp_flg()) {
				return;
			}

			// 小計なしの場合
			if (MAC_BILL_DTL_SUBTTL_TYP.isNOT_OUTP(billHdrBaseR.bill_dtl_subttl_typ())) {
				addPrntBillDtlNoSubttl(billHdrBaseR, billDtlBaseL);
			}
			// 売掛先ごとの場合
			else if (MAC_BILL_DTL_SUBTTL_TYP.isEACH_ACST(billHdrBaseR.bill_dtl_subttl_typ())) {
				addPrntBillDtlEachAcst(billHdrBaseR, billDtlBaseL);
			}
			// 得意先ごとの場合
			else if (MAC_BILL_DTL_SUBTTL_TYP.isEACH_CST(billHdrBaseR.bill_dtl_subttl_typ())) {
				addPrntBillDtlEachCst(billHdrBaseR, billDtlBaseL);
			}
			// 納品先ごとの場合
			else if (MAC_BILL_DTL_SUBTTL_TYP.isEACH_DLV(billHdrBaseR.bill_dtl_subttl_typ())) {
				addPrntBillDtlEachDlv(billHdrBaseR, billDtlBaseL);
			}
			// 案件ごとの場合
			else if (MAC_BILL_DTL_SUBTTL_TYP.isEACH_WRK(billHdrBaseR.bill_dtl_subttl_typ())) {
				addPrntBillDtlEachWrk(billHdrBaseR, billDtlBaseL);
			}

			// 改ページ
			breakDtlPage();
			
			putNumStrDtl(billHdrBaseR);
			
			putViewStrDtl();
			
			_billReportSet.addAll(_dtlL);
		}
		
		/**
		 * 請求書業務情報を設定する。
		 * @param billHdrBaseR 請求書ヘッダーベース
		 */
		protected void setBillBizInfo(Bill_Prnt01_HdrBaseR billHdrBaseR) {

			_billReportSet.setAppReportNo1(billHdrBaseR.bill_no());
			_billReportSet.setAppUsrCd1(billHdrBaseR.bill_dpt_cd());
			_billReportSet.setAppUsrNm1(billHdrBaseR.dpt_nm());
			_billReportSet.setAppToCd1(billHdrBaseR.bcst_cd());
			_billReportSet.setAppToNm1(billHdrBaseR.bcst_nm());
		}
		
		/**
		 * お買い上げ明細のReportSetを作成する。
		 * @param billHdrBaseR 請求ヘッダーベース
		 * @param billDtlBaseL 請求明細ベースリスト
		 */
		protected void crtSlsDtlReportSet(Bill_Prnt01_HdrBaseR billHdrBaseR, MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL) {
			
			if (isNull(billDtlBaseL)) {
				return;
			}

			
			//キー：請求書NO,改訂番号、値：ReportSetを保持するマップ
			Map<List<String>,List<MSBGR_SlsDtl>> innerSlsMap = _slsDtlReport2DMap.get(billHdrBaseR.bcst_cd());
			if(innerSlsMap == null) {
				innerSlsMap = new LinkedHashMap<List<String>,List<MSBGR_SlsDtl>>();
				_slsDtlReport2DMap.put(billHdrBaseR.bcst_cd(), innerSlsMap);
			}
			// 売上明細では入金は出力しない
			MCList<Bill_Prnt01_DtlBaseR> ioDL = getIoDtlLForSlsDtl(billDtlBaseL);

			// 売掛先別の場合
			if (MAC_SLS_DTL_OUTP_TYP.isEACH_ACST(billHdrBaseR.sls_dtl_outp_typ())) {

				MCList<Bill_Prnt01_BpR> acstL = getAcstList(billHdrBaseR, ioDL);

				for (Bill_Prnt01_BpR acstR : acstL) {
					
					initSlsDtl();
					
					addPrntSlsForAcst(billHdrBaseR, acstR, ioDL);
					
					setSlsBizInfo(billHdrBaseR, acstR);
					
					if (_slsDtlReportSet.size() > 0) {
						
						_slsDtlReportSetL.add(_slsDtlReportSet);
						addSlsSetToMap(innerSlsMap,billHdrBaseR);
					}
				}
			}
			// 得意先別の場合
			else if (MAC_SLS_DTL_OUTP_TYP.isEACH_CST(billHdrBaseR.sls_dtl_outp_typ())) {

				MCList<Bill_Prnt01_BpR> cstL = getCstList(billHdrBaseR, ioDL);

				for (Bill_Prnt01_BpR cstR : cstL) {
					
					initSlsDtl();
					
					addPrntSlsForCst(billHdrBaseR, cstR, ioDL);
					
					setSlsBizInfo(billHdrBaseR, cstR);
					
					if (_slsDtlReportSet.size() > 0) {
						
						_slsDtlReportSetL.add(_slsDtlReportSet);
						addSlsSetToMap(innerSlsMap,billHdrBaseR);
					}
				}
			}

		}
		
		/**
		 * 請求書NO,改訂番号をキーとするマップにお買上明細を追加する。
		 */
		protected void addSlsSetToMap(Map<List<String>,List<MSBGR_SlsDtl>> map, Bill_Prnt01_HdrBaseR hdrR) {
			List<String> innerKey = new ArrayList<String>(Arrays.asList(hdrR.bill_no(), hdrR.bill_rev().toString()));
			List<MSBGR_SlsDtl> tgtRptSetL = map.get(innerKey);
			if(tgtRptSetL == null) {
				tgtRptSetL = new ArrayList<>();
				tgtRptSetL.add(_slsDtlReportSet);
				map.put(innerKey,tgtRptSetL);
			}else {
				tgtRptSetL.add(_slsDtlReportSet);
			}
		}
		
		/**
		 * お買い上げ明細を初期化する。
		 */
		protected void initSlsDtl() {

			isBillProcessing = false;
			
			_slsDtlReportSet = new MSBGR_SlsDtl();
			
			_rowCnt = 0;
			_dtlL = MCList.create(BillDtlR.class);
			_dtlL.addNumberColumn(Bill_Prnt01_DtlBaseR.$trd_unit_dec_place);
		}
		
		/**
		 * お買い上げ明細業務情報を設定する。
		 * @param billHdrBaseR 請求ヘッダーベース
		 * @param bpR 取引先
		 */
		protected void setSlsBizInfo(Bill_Prnt01_HdrBaseR billHdrBaseR, Bill_Prnt01_BpR bpR) {

			_slsDtlReportSet.setAppReportNo1(billHdrBaseR.bill_no());
			_slsDtlReportSet.setAppUsrCd1(billHdrBaseR.bill_dpt_cd());
			_slsDtlReportSet.setAppUsrNm1(billHdrBaseR.dpt_nm());
			_slsDtlReportSet.setAppToCd1(bpR.bp_cd());
			_slsDtlReportSet.setAppToNm1(bpR.bp_nm());
		}
		
		/**
		 * 請求書発行済みＦＬＧを更新する。
		 * @param prntHdrR　発行ヘッダーRow
		 */
		protected void updPrntFlg(Bill_Prnt01_HdrR prntHdrR) {

			MST_BILL_R updR = MST_BILL_R.create();
			MST_BILL_R t = MST_BILL_R.create("T");
			MCQueryApiBuilder updR_bldr = MCQueryApiBuilder.create(t);

			updR_bldr.setSet(t.prnt_flg);

			updR.bill_mng_no(prntHdrR.bill_mng_no());
			updR.prnt_flg(true);

			dbUpdateKey("MSBGL5040_MST_BILL_U01", updR, updR_bldr);
		}

		/**
		 * ヘッダの数値カラムの値を指定の文字列カラムに設定する。
		 * 
		 * @param billHdrBaseR 請求ヘッダーベース
		 * @param billHdrR 請求書ヘッダー
		 */
		protected void putNumStrBillHdr(Bill_Prnt01_HdrBaseR billHdrBaseR, MCList<BillHdrR> billHdrL) {

			MCNumber decPlace = billHdrBaseR.amt_dec_place();
			
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_bill_amt, BillHdrR.$bill_amt, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_last_bill_amt, BillHdrR.$last_bill_amt, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_rcv_amt, BillHdrR.$rcv_amt, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_sw_amt, BillHdrR.$sw_amt, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_setoff_amt, BillHdrR.$setoff_amt, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_setoff_tax_amt, BillHdrR.$setoff_tax_amt, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_bfw_amt, BillHdrR.$bfw_amt, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_sls_amt, BillHdrR.$sls_amt, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_dscnt_amt, BillHdrR.$dscnt_amt, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_ret_amt, BillHdrR.$ret_amt, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_amt, BillHdrR.$tax_amt, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_sw_to_amt, BillHdrR.$sw_to_amt, decPlace);
			
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_bill_xrate, BillHdrR.$bill_xrate, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_rate1, BillHdrR.$tax_rate1, billHdrL.getMeta(BillHdrR.$tax_rate1));
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_rate_sls_amt1, BillHdrR.$tax_rate_sls_amt1, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_rate_tax_amt1, BillHdrR.$tax_rate_tax_amt1, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_rate_base_tax_amt1, BillHdrR.$tax_rate_base_tax_amt1, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_rate2, BillHdrR.$tax_rate2, billHdrL.getMeta(BillHdrR.$tax_rate2));
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_rate_sls_amt2, BillHdrR.$tax_rate_sls_amt2, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_rate_tax_amt2, BillHdrR.$tax_rate_tax_amt2, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_rate_base_tax_amt2, BillHdrR.$tax_rate_base_tax_amt2, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_rate3, BillHdrR.$tax_rate3, billHdrL.getMeta(BillHdrR.$tax_rate3));
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_rate_sls_amt3, BillHdrR.$tax_rate_sls_amt3, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_rate_tax_amt3, BillHdrR.$tax_rate_tax_amt3, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_rate_base_tax_amt3, BillHdrR.$tax_rate_base_tax_amt3, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_rate4, BillHdrR.$tax_rate4, billHdrL.getMeta(BillHdrR.$tax_rate4));
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_rate_sls_amt4, BillHdrR.$tax_rate_sls_amt4, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_rate_tax_amt4, BillHdrR.$tax_rate_tax_amt4, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_rate_base_tax_amt4, BillHdrR.$tax_rate_base_tax_amt4, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_rate5, BillHdrR.$tax_rate5, billHdrL.getMeta(BillHdrR.$tax_rate5));
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_rate_sls_amt5, BillHdrR.$tax_rate_sls_amt5, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_rate_tax_amt5, BillHdrR.$tax_rate_tax_amt5, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_rate_base_tax_amt5, BillHdrR.$tax_rate_base_tax_amt5, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_rate6, BillHdrR.$tax_rate6, billHdrL.getMeta(BillHdrR.$tax_rate6));
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_rate_sls_amt6, BillHdrR.$tax_rate_sls_amt6, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_rate_tax_amt6, BillHdrR.$tax_rate_tax_amt6, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_rate_base_tax_amt6, BillHdrR.$tax_rate_base_tax_amt6, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_rate7, BillHdrR.$tax_rate7, billHdrL.getMeta(BillHdrR.$tax_rate7));
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_rate_sls_amt7, BillHdrR.$tax_rate_sls_amt7, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_rate_tax_amt7, BillHdrR.$tax_rate_tax_amt7, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_rate_base_tax_amt7, BillHdrR.$tax_rate_base_tax_amt7, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_rate8, BillHdrR.$tax_rate8, billHdrL.getMeta(BillHdrR.$tax_rate8));
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_rate_sls_amt8, BillHdrR.$tax_rate_sls_amt8, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_rate_tax_amt8, BillHdrR.$tax_rate_tax_amt8, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_rate_base_tax_amt8, BillHdrR.$tax_rate_base_tax_amt8, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_rate9, BillHdrR.$tax_rate9, billHdrL.getMeta(BillHdrR.$tax_rate9));
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_rate_sls_amt9, BillHdrR.$tax_rate_sls_amt9, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_rate_tax_amt9, BillHdrR.$tax_rate_tax_amt9, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_rate_base_tax_amt9, BillHdrR.$tax_rate_base_tax_amt9, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_rate10, BillHdrR.$tax_rate10, billHdrL.getMeta(BillHdrR.$tax_rate10));
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_rate_sls_amt10, BillHdrR.$tax_rate_sls_amt10, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_rate_tax_amt10, BillHdrR.$tax_rate_tax_amt10, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_tax_rate_base_tax_amt10, BillHdrR.$tax_rate_base_tax_amt10, decPlace);
			
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_adv_amt_bal, BillHdrR.$adv_amt_bal, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_adv_amt, BillHdrR.$adv_amt, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_adv_setoff_amt, BillHdrR.$adv_setoff_amt, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_adv_setoff_tax_amt, BillHdrR.$adv_setoff_tax_amt, decPlace);
			
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_rcv_schd_amt1, BillHdrR.$rcv_schd_amt1, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_rcv_schd_amt2, BillHdrR.$rcv_schd_amt2, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_rcv_schd_amt3, BillHdrR.$rcv_schd_amt3, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_rcv_schd_amt4, BillHdrR.$rcv_schd_amt4, decPlace);
			putNumStr(_billReportSet, billHdrL, BillHdrR.$s_rcv_schd_amt5, BillHdrR.$rcv_schd_amt5, decPlace);
		}
		protected void putTaxRateStrHdr(MCList<BillHdrR> billHdrL) {
			for (BillHdrR r : billHdrL) {
				r.s_tax_rate1(getTaxRateStr(r.s_tax_rate1(), r.getStringNE("tax_ac_ym1")));
				r.s_tax_rate2(getTaxRateStr(r.s_tax_rate2(), r.getStringNE("tax_ac_ym2")));
				r.s_tax_rate3(getTaxRateStr(r.s_tax_rate3(), r.getStringNE("tax_ac_ym3")));
				r.s_tax_rate4(getTaxRateStr(r.s_tax_rate4(), r.getStringNE("tax_ac_ym4")));
				r.s_tax_rate5(getTaxRateStr(r.s_tax_rate5(), r.getStringNE("tax_ac_ym5")));
				r.s_tax_rate6(getTaxRateStr(r.s_tax_rate6(), r.getStringNE("tax_ac_ym6")));
				r.s_tax_rate7(getTaxRateStr(r.s_tax_rate7(), r.getStringNE("tax_ac_ym7")));
				r.s_tax_rate8(getTaxRateStr(r.s_tax_rate8(), r.getStringNE("tax_ac_ym8")));
				r.s_tax_rate9(getTaxRateStr(r.s_tax_rate9(), r.getStringNE("tax_ac_ym9")));
				r.s_tax_rate10(getTaxRateStr(r.s_tax_rate10(), r.getStringNE("tax_ac_ym10")));
			}
		}
		protected String getTaxRateStr(String s_tax_rate, String tax_ac_ym) {
			// 税率を表示する場合
			if (!isNull(s_tax_rate)) {
				return s_tax_rate + MSC_BILL_PRNT_STR.TAX_TGT.name(MCSys.user.locale());
			}
			// 対象月を表示する場合
			else if(!isNull(tax_ac_ym)) {
				return _TAX_MONTH_INDENT + tax_ac_ym;
			}
			// 表示なしの場合
			else {
				return null;
			}
		}
		protected void setHdrReport(MCList<BillHdrR> billHdrL) {
			int page = 0;
			for (BillHdrR hdrR : billHdrL) {
				hdrR.hdr_page(++page);
				_billReportSet.addRow(hdrR);
			}
			billHdrL.setNumber(BillHdrR.$hdr_page_sum, page);
		}
		
		/**
		 * 明細の数値カラムの値を指定の文字列カラムに設定する。
		 * @param billHdrBaseR 請求ヘッダーベースRow
		 */
		protected void putNumStrDtl(Bill_Prnt01_HdrBaseR billHdrBaseR) {
			
			_dtlL.addNumberColumn(Bill_Prnt01_HdrBaseR.$upri_dec_place, billHdrBaseR.upri_dec_place());
			_dtlL.addNumberColumn(Bill_Prnt01_HdrBaseR.$amt_dec_place, billHdrBaseR.amt_dec_place());
			
			putNumStr(getProcessingReportSet(), _dtlL, BillDtlR.$s_trd_unit_qty_int, BillDtlR.$s_trd_unit_qty_dec, BillDtlR.$trd_unit_qty, Bill_Prnt01_DtlBaseR.$trd_unit_dec_place);
			putNumStr(getProcessingReportSet(), _dtlL, BillDtlR.$s_trd_cur_upri_int, BillDtlR.$s_trd_cur_upri_dec, BillDtlR.$trd_cur_upri, Bill_Prnt01_HdrBaseR.$upri_dec_place);
			putNumStr(getProcessingReportSet(), _dtlL, BillDtlR.$s_trd_cur_amt_int, BillDtlR.$s_trd_cur_amt_dec, BillDtlR.$trd_cur_amt, Bill_Prnt01_HdrBaseR.$amt_dec_place);
			putNumStr(getProcessingReportSet(), _dtlL, BillDtlR.$s_trd_cur_dscnt_amt_int, BillDtlR.$s_trd_cur_dscnt_amt_dec, BillDtlR.$trd_cur_dscnt_amt, Bill_Prnt01_HdrBaseR.$amt_dec_place);
			putNumStr(getProcessingReportSet(), _dtlL, BillDtlR.$s_trd_cur_tax_amt_int, BillDtlR.$s_trd_cur_tax_amt_dec, BillDtlR.$trd_cur_tax_amt, Bill_Prnt01_HdrBaseR.$amt_dec_place);
			
			putNumStr(getProcessingReportSet(), _dtlL, BillDtlR.$s_part_bill_d_amt1_int, BillDtlR.$s_part_bill_d_amt1_dec, BillDtlR.$part_bill_d_amt1, Bill_Prnt01_HdrBaseR.$amt_dec_place);
			putNumStr(getProcessingReportSet(), _dtlL, BillDtlR.$s_part_bill_d_amt2_int, BillDtlR.$s_part_bill_d_amt2_dec, BillDtlR.$part_bill_d_amt2, Bill_Prnt01_HdrBaseR.$amt_dec_place);
			
			putNumStr(getProcessingReportSet(), _dtlL, BillDtlR.$s_tax_rate, BillDtlR.$tax_rate, (MCNumber)null); // 小数点以下をゼロ埋めしない
		}
		
		/**
		 * 品目枝番の表示用項目を設定する。
		 */
		protected void putViewStrDtl() {
			
			putPrntItmSub1(_dtlL, BillDtlR.$itm_sub1_view, BillDtlR.$itm_sub1_data);
			putPrntItmSub2(_dtlL, BillDtlR.$itm_sub2_view, BillDtlR.$itm_sub2_data);
			putPrntItmSub3(_dtlL, BillDtlR.$itm_sub3_view, BillDtlR.$itm_sub3_data);
		}
		
		/**
		 * 処理中のReportSet返す。
		 * @return ReportSet
		 */
		protected MCReportSet getProcessingReportSet() {

			return isBillProcessing ? _billReportSet : _slsDtlReportSet;
		}

		/**
		 * 明細に１行追加する。<br>
		 * 改ページを制御する。<br>
		 * 数値フィールドのフォーマットを調整する。
		 * 
		 * @param billDtlR 追加対象の行
		 */
		protected void addPrntDtl(BillDtlR billDtlR) {

			// ページの設定
			if (_rowCnt == _MAX_ROW_COUNT) {
				breakDtlPage();
			}
			_rowCnt++;
			
			_dtlL.add(billDtlR);
		}

		/**
		 * 明細を改ページする。<br>
		 * 最大行数まで空行を追加して改ページする
		 */
		protected void breakDtlPage() {

			// 出力行数が０の場合は改ページすると空ページとなるため改ページしない
			if (_rowCnt == 0) {
				return;
			}
			
			// 現在行が一行目で空行の場合は削除する
			if (_rowCnt == 1) {
				if (_dtlL.get(_dtlL.size() - 1).isEmpty()) {
					_dtlL.remove(_dtlL.size() - 1);
					_rowCnt = 0;
				}
				return;
			}

			// １ページの最大行数まで空行で埋める
			for (int i = _rowCnt ; i < _MAX_ROW_COUNT; i++) {
				// 請求書ヘッダーのデフォルト値を設定する。
				_dtlL.add(BillDtlR.create());
			}

			// 行数の変数を初期化する
			_rowCnt = 0;
		}

		/**
		 * 発行済フラグを設定する。
		 * 
		 * @param billDtlBaseL 請求明細ベースリスト
		 */
		protected void updPrntFlg(MCList<Bill_Prnt01_HdrBaseR> billDtlBaseL) {

			billDtlBaseL.setBooleanNE(MST_BILL_R.$prnt_flg, true);
			
			MST_BILL_R t = MST_BILL_R.create("T");
			execDbUpdateKey("MSBGL5040_MST_BILL_U02", t, billDtlBaseL, t.prnt_flg);

		}

		/**
		 * 請求明細から売掛先のリストを取得する。
		 * 
		 * @param billHdrBaseR 請求ヘッダーベースRow
		 * @param billDtlBaseL 請求明細ベースリスト
		 * @return 売掛先のリスト
		 */
		protected MCList<Bill_Prnt01_BpR> getAcstList(Bill_Prnt01_HdrBaseR billHdrBaseR, MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL) {

			MCList<Bill_Prnt01_BpR> acstL = MCList.create(Bill_Prnt01_BpR.class);
			
			executeQuery(acstL, MSBGL5040_MST_BILL_ACST_S01(), billHdrBaseR);

			Bill_Prnt01_BpR  acstR = null;
			// 明細が紐付く売掛先を取得する
			MCList<Bill_Prnt01_DtlBaseR> subL = billDtlBaseL.groupBy(Bill_Prnt01_DtlBaseR.$bill_acst_no);
			for (Bill_Prnt01_DtlBaseR dtlR : subL) {
				
				acstR = acstL.getFirst(Bill_Prnt01_BpR.$bill_acst_no, dtlR.bill_acst_no());
				// 売掛先別で明細を抽出する際に使用するカラムと値をセットする
				billDtlBaseL.subList(Bill_Prnt01_DtlBaseR.$bill_acst_no, dtlR.bill_acst_no()).setValueNE(
						"acst_cd", acstR.bp_cd());
			}

			MCGroupByPolicy policy = new MCGroupByPolicy(
					Bill_Prnt01_BpR.$bp_cd,
					Bill_Prnt01_BpR.$bp_nm,
					Bill_Prnt01_BpR.$bp_alt_nm1,
					Bill_Prnt01_BpR.$bp_alt_nm2,
					Bill_Prnt01_BpR.$bp_alt_nm3,
					Bill_Prnt01_BpR.$bp_alt_nm4,
					Bill_Prnt01_BpR.$zip_cd,
					Bill_Prnt01_BpR.$addr1,
					Bill_Prnt01_BpR.$addr2,
					Bill_Prnt01_BpR.$addr3,
					Bill_Prnt01_BpR.$addr4,
					Bill_Prnt01_BpR.$tel);
			policy.addKey("cntry_nm", "bp_cntry_nm");
			
			MCList<Bill_Prnt01_BpR> acstGrpL = acstL.groupBy(policy);
			acstGrpL.sort(Bill_Prnt01_BpR.$bp_cd);

			return acstGrpL;
		}

		/**
		 * 請求明細から得意先のリストを取得する。
		 * 
		 * @param billHdrBaseR 請求ヘッダーベースRow
		 * @param billDtlBaseL 請求明細ベースリスト
		 * @return 得意先のリスト
		 */
		protected MCList<Bill_Prnt01_BpR> getCstList(Bill_Prnt01_HdrBaseR billHdrBaseR, MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL) {

			MCList<Bill_Prnt01_BpR> cstL = MCList.create(Bill_Prnt01_BpR.class);
			
			executeQuery(cstL, MSBGL5040_MST_BILL_D_S02(), billHdrBaseR);

			cstL.sort(Bill_Prnt01_BpR.$bp_cd);

			return cstL;
		}

		/**
		 * 請求明細から納品先のリストを取得する。
		 * 
		 * @param billDtlBaseL 請求明細ベース
		 * @return 納品先のリスト
		 */
		protected MCList<Bill_Prnt01_DtlBaseR> getdlvList(MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL) {

			MCList<Bill_Prnt01_DtlBaseR> scstL = billDtlBaseL.groupBy(
					Bill_Prnt01_DtlBaseR.$dlv_cd, 
					Bill_Prnt01_DtlBaseR.$dlv_nm);

			scstL.sort(Bill_Prnt01_DtlBaseR.$dlv_cd);
			
			for (Bill_Prnt01_DtlBaseR r : scstL) {
				if(isNull(r.dlv_cd())) {
					scstL.remove(r);
					break;
				}
			}

			return scstL;
		}
		
		/**
		 * 案件情報を取得する。
		 * @param billDtlBaseL 請求明細ベース
		 * @return 案件リスト
		 */
		protected MCList<Bill_Prnt01_DtlBaseR> getWrkList(MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL) {
			
			MCList<Bill_Prnt01_DtlBaseR> wrkL = billDtlBaseL.groupBy(
					Bill_Prnt01_DtlBaseR.$wrk_no, 
					Bill_Prnt01_DtlBaseR.$wrk_nm);
			wrkL.removeAll(wrkL.subList(Bill_Prnt01_DtlBaseR.$wrk_no, null));

			wrkL.sort(MST_WRK_R.$wrk_no);

			return wrkL;
		}

		/**
		 * 小計無しの請求書明細を作成する。
		 * 
		 * @param billHdrBaseR 請求ヘッダベース
		 * @param billDtlBaseL 請求明細ベース
		 */
		protected void addPrntBillDtlNoSubttl(Bill_Prnt01_HdrBaseR billHdrBaseR, MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL) {

			// 受払明細を追加
			MCList<Bill_Prnt01_DtlBaseR> ioDtlL = getIoDtlL(billDtlBaseL);
			if (ioDtlL.size() > 0) {
				
				ioDtlL = getBillDPrntDtl(ioDtlL);
				addPrntIoDtl(billHdrBaseR, ioDtlL, null);
			}

			// 入金明細を追加
			MCList<Bill_Prnt01_DtlBaseR> arDL = getArDtlL(billDtlBaseL);
			if (arDL.size() > 0) {
				addPrntArBillDtl(billHdrBaseR, arDL);
			}
			// 前受金を追加
			MCList<Bill_Prnt01_DtlBaseR> advDL = getAdvDtlL(billDtlBaseL);
			if (advDL.size() > 0) {
				addPrntArBillDtl(billHdrBaseR, advDL);
			}
		}

		/**
		 * 売掛先別小計の請求書明細を作成する。
		 * 
		 * @param billHdrBaseR 請求ヘッダベース
		 * @param billDtlBaseL 請求明細ベース
		 */
		protected void addPrntBillDtlEachAcst(Bill_Prnt01_HdrBaseR billHdrBaseR, MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL) {

			// 受払明細を追加
			MCList<Bill_Prnt01_DtlBaseR> ioDL = getIoDtlL(billDtlBaseL);
			if (ioDL.size() > 0) {

				MCList<Bill_Prnt01_BpR> acstL = getAcstList(billHdrBaseR, ioDL);

				for (Bill_Prnt01_BpR acstR : acstL) {

					// 明細レコード作成
					MCList<Bill_Prnt01_DtlBaseR> subL = getBillDForAcst(acstR, ioDL);
					subL = getBillDPrntDtl(subL);
					BillDtlR subttlDR = getSubttlBaseForAcst(acstR);
					addPrntIoDtl(billHdrBaseR, subL, subttlDR);

					// 改ページ
					if (MAC_BILL_DTL_BRK_TYP.isEACH_SUBTTL(billHdrBaseR.bill_dtl_brk_typ())) {
						breakDtlPage();
					}
				}
			}

			// 入金明細を追加
			MCList<Bill_Prnt01_DtlBaseR> arDL = getArDtlL(billDtlBaseL);
			if (arDL.size() > 0) {
				// 明細レコード作成
				addPrntArBillDtl(billHdrBaseR, arDL);
			}
			// 前受金を追加
			MCList<Bill_Prnt01_DtlBaseR> advDL = getAdvDtlL(billDtlBaseL);
			if (advDL.size() > 0) {
				addPrntArBillDtl(billHdrBaseR, advDL);
			}
		}

		/**
		 * 得意先別小計の請求書明細を作成する。
		 * 
		 * @param billHdrBaseR 請求ヘッダベース
		 * @param billDtlBaseL 請求明細ベース
		 */
		protected void addPrntBillDtlEachCst(Bill_Prnt01_HdrBaseR billHdrBaseR, MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL) {

			// 受払明細を追加
			MCList<Bill_Prnt01_DtlBaseR> ioDL = getIoDtlL(billDtlBaseL);
			if (ioDL.size() > 0) {

				MCList<Bill_Prnt01_BpR> cstL = getCstList(billHdrBaseR, ioDL);
				cstL.add(Bill_Prnt01_BpR.create()); // 得意先がNULLも処理に含める（消費税差額など）

				for (Bill_Prnt01_BpR cstR : cstL) {

					// 明細レコード作成
					MCList<Bill_Prnt01_DtlBaseR> subL = ioDL.subList(Bill_Prnt01_DtlBaseR.$cst_cd, cstR.bp_cd());
					subL = getBillDPrntDtl(subL);
					BillDtlR subttlDR = getSubttlBaseForCst(cstR);
					addPrntIoDtl(billHdrBaseR, subL, subttlDR);

					// 改ページ
					if (MAC_BILL_DTL_BRK_TYP.isEACH_SUBTTL(billHdrBaseR.bill_dtl_brk_typ())) {
						breakDtlPage();
					}
				}
			}

			// 入金明細を追加
			MCList<Bill_Prnt01_DtlBaseR> arDL = getArDtlL(billDtlBaseL);
			if (arDL.size() > 0) {
				// 明細レコード作成
				addPrntArBillDtl(billHdrBaseR, arDL);
			}
			// 前受金を追加
			MCList<Bill_Prnt01_DtlBaseR> advDL = getAdvDtlL(billDtlBaseL);
			if (advDL.size() > 0) {
				addPrntArBillDtl(billHdrBaseR, advDL);
			}
		}

		/**
		 * 納品先別小計の請求書明細を作成する。
		 * 
		 * @param billHdrBaseR 請求ヘッダベース
		 * @param billDtlBaseL 請求明細ベース
		 */
		protected void addPrntBillDtlEachDlv(Bill_Prnt01_HdrBaseR billHdrBaseR, MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL) {

			// 受払明細を追加
			MCList<Bill_Prnt01_DtlBaseR> ioDL = getIoDtlL(billDtlBaseL);
			if (ioDL.size() > 0) {

				// 納品先リストの取得
				MCList<Bill_Prnt01_DtlBaseR> dlvL = getdlvList(ioDL);
				dlvL.add(Bill_Prnt01_DtlBaseR.create()); // 納品先がNULLも処理に含める（消費税差額など）

				for (Bill_Prnt01_DtlBaseR dlvR : dlvL) {

					// 明細レコード作成
					MCList<Bill_Prnt01_DtlBaseR> subL = ioDL.subList(
							new String[] {Bill_Prnt01_DtlBaseR.$dlv_cd, Bill_Prnt01_DtlBaseR.$dlv_nm}, 
							new String[] {dlvR.dlv_cd(), dlvR.dlv_nm()});
					subL = getBillDPrntDtl(subL);
					
					BillDtlR subttlDR = getSubttlBaseForDlv(dlvR);
					addPrntIoDtl(billHdrBaseR, subL, subttlDR);

					// 改ページ
					if (MAC_BILL_DTL_BRK_TYP.isEACH_SUBTTL(billHdrBaseR.bill_dtl_brk_typ())) {
						breakDtlPage();
					}
				}
			}

			// 入金
			MCList<Bill_Prnt01_DtlBaseR> arDL = getArDtlL(billDtlBaseL);
			if (arDL.size() > 0) {
				// 明細レコード作成
				addPrntArBillDtl(billHdrBaseR, arDL);
			}
			// 前受金を追加
			MCList<Bill_Prnt01_DtlBaseR> advDL = getAdvDtlL(billDtlBaseL);
			if (advDL.size() > 0) {
				addPrntArBillDtl(billHdrBaseR, advDL);
			}
		}
		
		/**
		 * 案件別小計の請求書明細を作成する。
		 * 
		 * @param billHdrBaseR 請求ヘッダベース
		 * @param billDtlBaseL 請求明細ベース
		 */
		protected void addPrntBillDtlEachWrk(Bill_Prnt01_HdrBaseR billHdrBaseR, MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL) {

			// 受払明細を追加
			MCList<Bill_Prnt01_DtlBaseR> ioDL = getIoDtlL(billDtlBaseL);
			if (ioDL.size() > 0) {

				// 案件リストの取得
				MCList<Bill_Prnt01_DtlBaseR> WrkL = getWrkList(ioDL);
				WrkL.add(Bill_Prnt01_DtlBaseR.create()); // 案件がNULLも処理に含める（消費税差額など）

				for (Bill_Prnt01_DtlBaseR wrkR : WrkL) {

					// 明細レコード作成
					MCList<Bill_Prnt01_DtlBaseR> subL = ioDL.subList(
							Bill_Prnt01_DtlBaseR.$wrk_no, wrkR.wrk_no());
					subL = getBillDPrntDtl(subL);
					
					BillDtlR subttlDR = getSubttlBaseForWrk(wrkR);
					addPrntIoDtl(billHdrBaseR, subL, subttlDR);

					// 改ページ
					if (MAC_BILL_DTL_BRK_TYP.isEACH_SUBTTL(billHdrBaseR.bill_dtl_brk_typ())) {
						breakDtlPage();
					}
				}
			}

			// 入金
			MCList<Bill_Prnt01_DtlBaseR> arDL = getArDtlL(billDtlBaseL);
			if (arDL.size() > 0) {
				// 明細レコード作成
				addPrntArBillDtl(billHdrBaseR, arDL);
			}
			// 前受金を追加
			MCList<Bill_Prnt01_DtlBaseR> advDL = getAdvDtlL(billDtlBaseL);
			if (advDL.size() > 0) {
				addPrntArBillDtl(billHdrBaseR, advDL);
			}
		}

		/**
		 * 請求明細から入金関連（消費税差額を除く）のリストを取得する。
		 * 
		 * @param billDtlBaseL 請求明細
		 * @return 入金関連のリスト
		 */
		protected MCList<Bill_Prnt01_DtlBaseR> getArDtlL(MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL) {

			MCList<Bill_Prnt01_DtlBaseR> retL = MCList.create(Bill_Prnt01_DtlBaseR.class);

			for (Bill_Prnt01_DtlBaseR dR : billDtlBaseL) {

				if (MSC_BILL_D_TYP.isRCV(dR.bill_d_typ())
						&& !(MAC_TRD_PTN_TYP.isTAX_DIFF_BILL_CL(dR.trd_ptn_typ())
								|| MAC_TRD_PTN_TYP.isARSW_IN_BILL_BAL(dR.trd_ptn_typ())
								|| MAC_TRD_PTN_TYP.isARSW_IN_NOT_BILL_BAL(dR.trd_ptn_typ())
								|| isAdvTrdTyp(dR.trd_ptn_typ()))){
					retL.addAll(splitArDtlR(dR));
				}
			}

			return retL;
		}
		/**
		 * 請求明細から前受金のリストを取得する
		 */
		protected MCList<Bill_Prnt01_DtlBaseR> getAdvDtlL(MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL) {

			MCList<Bill_Prnt01_DtlBaseR> retL = MCList.create(Bill_Prnt01_DtlBaseR.class);

			for (Bill_Prnt01_DtlBaseR dR : billDtlBaseL) {

				if (MSC_BILL_D_TYP.isRCV(dR.bill_d_typ())
						&& isAdvTrdTyp(dR.trd_ptn_typ())) {
					retL.addAll(splitArDtlR(dR));
				}
			}

			return retL;
		}
		/**
		 * 入金データから相殺分を分割する
		 */
		protected MCList<Bill_Prnt01_DtlBaseR> splitArDtlR(Bill_Prnt01_DtlBaseR billDtlBaseR) {
			MCList<Bill_Prnt01_DtlBaseR> retL = MCList.create(Bill_Prnt01_DtlBaseR.class);
			
			if (MAC_AR_STTL_TYP.isSETOFF_DR(billDtlBaseR.ar_sttl_typ1())) {
				// 相殺分
				Bill_Prnt01_DtlBaseR setoffR = billDtlBaseR.clone();
				if (billDtlBaseR.bill_tax_disp_flg1()) {
					setoffR.trd_cur_amt(billDtlBaseR.trd_cur_amt1().subtract(billDtlBaseR.trd_cur_tax_amt1()));
					setoffR.trd_cur_tax_amt(billDtlBaseR.trd_cur_tax_amt1());
					setoffR.tax_cd(billDtlBaseR.tax_cd1());
					setoffR.tax_nm(billDtlBaseR.tax_nm1());
					setoffR.inc_tax_flg(billDtlBaseR.inc_tax_flg1());
				}
				else {
					setoffR.trd_cur_tax_amt(null);
					setoffR.tax_cd(null);
					setoffR.tax_nm(null);
					setoffR.inc_tax_flg(false);
				}
				setoffR.setoff_flg(true);
				retL.add(setoffR);
			}
			else if (MAC_AR_STTL_TYP.isSETOFF_DR(billDtlBaseR.ar_sttl_typ2())) {
				// 入金分
				Bill_Prnt01_DtlBaseR rcvR = billDtlBaseR.clone();
				rcvR.trd_cur_amt(billDtlBaseR.trd_cur_amt1());
				rcvR.trd_cur_tax_amt(null);
				rcvR.bill_d_rmrks(null);
				retL.add(rcvR);
				
				// 相殺分
				Bill_Prnt01_DtlBaseR setoffR = billDtlBaseR.clone();
				setoffR.rcv_nm(billDtlBaseR.ar_sttl_nm2());
				if (billDtlBaseR.bill_tax_disp_flg2()) {
					setoffR.trd_cur_amt(billDtlBaseR.trd_cur_amt2().subtract(billDtlBaseR.trd_cur_tax_amt2()));
					setoffR.trd_cur_tax_amt(billDtlBaseR.trd_cur_tax_amt2());
					setoffR.tax_cd(billDtlBaseR.tax_cd2());
					setoffR.tax_nm(billDtlBaseR.tax_nm2());
					setoffR.inc_tax_flg(billDtlBaseR.inc_tax_flg2());
				}
				else {
					setoffR.trd_cur_amt(billDtlBaseR.trd_cur_amt2());
					setoffR.trd_cur_tax_amt(null);
					setoffR.tax_cd(null);
					setoffR.tax_nm(null);
					setoffR.inc_tax_flg(false);
				}
				setoffR.setoff_flg(true);
				retL.add(setoffR);
			}
			else if (isAdvTrdTyp(billDtlBaseR.trd_ptn_typ())) {
				Bill_Prnt01_DtlBaseR rcvR = billDtlBaseR.clone();
				rcvR.trd_cur_amt(billDtlBaseR.trd_cur_amt1());
				rcvR.trd_cur_tax_amt(null);
				retL.add(rcvR);
			}
			else {
				retL.add(billDtlBaseR);
			}
			
			return retL;
		}

		/**
		 * 請求明細から受払（消費税差額も含む）関連のリストを取得する。
		 * 
		 * @param billDtlBaseL 請求明細
		 * @return 受払関連のリスト
		 */
		protected MCList<Bill_Prnt01_DtlBaseR> getIoDtlL(MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL) {

			MCList<Bill_Prnt01_DtlBaseR> retL = MCList.create(Bill_Prnt01_DtlBaseR.class);

			for (Bill_Prnt01_DtlBaseR dR : billDtlBaseL) {

				if (MSC_BILL_D_TYP.isSLS(dR.bill_d_typ())
						|| (MAC_TRD_PTN_TYP.isTAX_DIFF_BILL_CL(dR.trd_ptn_typ())
									&& !dR.trd_cur_tax_amt().isZero()
								|| MAC_TRD_PTN_TYP.isARSW_IN_BILL_BAL(dR.trd_ptn_typ())
								|| MAC_TRD_PTN_TYP.isARSW_IN_NOT_BILL_BAL(dR.trd_ptn_typ()))) {
					retL.add(dR);
				}
			}

			return retL;
		}
		
		/**
		 * 請求明細から受払（消費税差額も含む）関連のリストを取得する。(お買上明細用) 
		 * 
		 * @param billDtlBaseL 請求明細
		 * @return 受払関連のリスト
		 */
		protected MCList<Bill_Prnt01_DtlBaseR> getIoDtlLForSlsDtl(MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL) {

			MCList<Bill_Prnt01_DtlBaseR> retL = MCList.create(Bill_Prnt01_DtlBaseR.class);

			for (Bill_Prnt01_DtlBaseR dR : billDtlBaseL) {

				if (MSC_BILL_D_TYP.isSLS(dR.bill_d_typ())
						|| (MAC_TRD_PTN_TYP.isTAX_DIFF_BILL_CL(dR.trd_ptn_typ())
									&& !dR.trd_cur_tax_amt().isZero())) {
					retL.add(dR);
				}
			}

			return retL;
		}

		/**
		 * 受払関連の請求明細の印刷情報を作成する。<br>
		 * 請求書明細の場合は小計行も作成する
		 * 
		 * @param billHdrBaseR ヘッダベース
		 * @param ioDtlL 請求明細（受払）
		 * @param subttlDtlR 小計（小計対象の取引先コードと名称だけを設定したコンテナ）
		 */
		protected void addPrntIoDtl(Bill_Prnt01_HdrBaseR billHdrBaseR, MCList<Bill_Prnt01_DtlBaseR> ioDtlL, BillDtlR subttlDtlR) {

			if (ioDtlL.size() == 0) {
				return;
			}

			// 初期化
			if (subttlDtlR == null) {
				subttlDtlR = BillDtlR.create();
			}

			// 明細作成
			for (Bill_Prnt01_DtlBaseR ioDR : ioDtlL) {

				// 小計の計算（加算）
				setPrntIoBillSbttl(subttlDtlR, ioDR);

				// 明細の作成
				BillDtlR dtlR = BillDtlR.create();
				
				// 出荷時納品書明細（複数）の場合
				if (ioDR.ship_dlv_slip_multi_flg() && !isNull(ioDR.ship_dlv_slip_d_no())) {
					MCList<Bill_Prnt01_DtlBaseR> ioDtlMutiL = getIoDtlMuti(ioDR);
					
					for (Bill_Prnt01_DtlBaseR ioDMutiR : ioDtlMutiL) {
						dtlR = getPrntIoBillDtl(ioDMutiR);
						addPrntDtl(dtlR);
					}
				}
				else {
					dtlR = getPrntIoBillDtl(ioDR);
					addPrntDtl(dtlR);
				}
				
				if (MSC_BILL_MTD_TYP.isPART_BILL(ioDR.bill_mtd_typ())) {
					// 一部請求の場合のみ
					
					addPrntPartBillRow(ioDR);
				}
			}

			// 小計は請求書明細の場合のみ
			if (isBillProcessing) {
				addPrntIoSubttl(subttlDtlR, billHdrBaseR);
			}
			else {
				addPrntDtl(BillDtlR.create());
			}
		}
		
		/**
		 * 一部請求の行を追加する。
		 * @param billDtlBaseR 請求明細ベースRow
		 */
		protected void addPrntPartBillRow(Bill_Prnt01_DtlBaseR billDtlBaseR) {

			BillDtlR partBillR1 = BillDtlR.create();
			partBillR1.part_bill_d_label1(MSC_BILL_PRNT_STR.BILL_DTL_TTL.name(MCSys.user.locale()));
			partBillR1.part_bill_d_label2(MSC_BILL_PRNT_STR.BILL_COMPL_TTL.name(MCSys.user.locale()));
			partBillR1.part_bill_d_amt1(billDtlBaseR.part_bill_ttl_amt());
			partBillR1.part_bill_d_amt2(MCNumber.sum(
					billDtlBaseR.part_bill_ttl_amt(), 
					billDtlBaseR.trd_cur_amt().negate(), 
					billDtlBaseR.trd_cur_tax_amt().negate(),
					billDtlBaseR.part_bill_crryovr_amt().negate()));
			
			addPrntDtl(partBillR1);
			
			BillDtlR partBillR2= BillDtlR.create();
			partBillR2.part_bill_d_label1(MSC_BILL_PRNT_STR.BILL_AMT.name(MCSys.user.locale()));
			partBillR2.part_bill_d_label2(MSC_BILL_PRNT_STR.BFW_AMT.name(MCSys.user.locale()));
			partBillR2.part_bill_d_amt1(billDtlBaseR.trd_cur_amt().add(billDtlBaseR.trd_cur_tax_amt()));
			partBillR2.part_bill_d_amt2(billDtlBaseR.part_bill_crryovr_amt());
			
			addPrntDtl(partBillR2);
		}

		/**
		 * 受払関連の請求明細の印刷情報（小計）を設定する。
		 * 
		 * @param subttlDR 小計設定用のコンテナ
		 * @param ioDR 加算対象の請求明細（受払）
		 */
		protected void setPrntIoBillSbttl(BillDtlR subttlDR, Bill_Prnt01_DtlBaseR ioDR) {
			
			subttlDR.trd_cur_amt(nvl(subttlDR.trd_cur_amt(), MCNumber.ZERO).add(ioDR.trd_cur_amt()));
			subttlDR.trd_cur_tax_amt(nvl(subttlDR.trd_cur_tax_amt(), MCNumber.ZERO).add(ioDR.trd_cur_tax_amt()));
		}

		/**
		 * 出荷時納品書明細（複数）情報を取得する。
		 * 
		 * @param ioDR 請求明細（受払）
		 * @return 出荷時納品書明細（複数）情報
		 */
		protected MCList<Bill_Prnt01_DtlBaseR> getIoDtlMuti(Bill_Prnt01_DtlBaseR ioDR) {
			
			MCList<Bill_Prnt01_DtlBaseR> ioDMutiL = MCList.create(Bill_Prnt01_DtlBaseR.class);
			Bill_Prnt01_DtlBaseR row = Bill_Prnt01_DtlBaseR.create();
			
			String str = ioDR.ship_dlv_slip_d_no().toString();
			String[] strSpl = str.split(":", 0);
			
			for (int i = 0; i < strSpl.length; i++) {
				row = ioDR.clone();
				row.ship_dlv_slip_d_no(strSpl[i]);
				ioDMutiL.add(row);
			}
			
			ioDMutiL.sort(Bill_Prnt01_DtlBaseR.$ship_dlv_slip_d_no);
			Bill_Prnt01_DtlBaseR ioDMutiR = ioDMutiL.get(0);
			ioDMutiR.setBooleanNE(Bill_Prnt01_DtlBaseR.$ship_dlv_slip_multi_flg, false);
			
			return ioDMutiL;
		}

		/**
		 * 受払関連の請求明細の印刷情報を取得する。
		 * 
		 * @param ioDR 請求明細（受払）
		 * @return 請求明細の印刷情報
		 */
		protected BillDtlR getPrntIoBillDtl(Bill_Prnt01_DtlBaseR ioDR) {

			BillDtlR dtlR = BillDtlR.create();
			dtlR.setAttributes(ioDR);
			
			dtlR.setValueNE(Bill_Prnt01_DtlBaseR.$trd_unit_dec_place, ioDR.trd_unit_dec_place());
			
			copy(dtlR, ioDR, createMap_BillDtlR_Bill_Prnt01_DtlBaseR());

			dtlR.dlv_dt(!isNull(ioDR.dlv_dt()) ? ioDR.dlv_dt() : ioDR.ac_dt());
			
			dtlR.s_inc_tax_flg(ioDR.inc_tax_flg() ? MSC_BILL_PRNT_STR.INC_TAX.name(MCSys.user.locale()) : null);
			dtlR.s_interim_flg(ioDR.interim_flg() ? MSC_BILL_PRNT_STR.INTERIM.name(MCSys.user.locale()) : null);
			
			if (MAC_TRD_PTN_TYP.isTAX_DIFF_BILL_CL(ioDR.trd_ptn_typ())) {
				dtlR.trd_unit_qty(null);
				dtlR.trd_cur_upri(null);
				dtlR.trd_cur_amt(null);
			}
			else if (MAC_TRD_PTN_TYP.isARSW_IN_BILL_BAL(ioDR.trd_ptn_typ())) {
				dtlR.trd_unit_qty(null);
				dtlR.trd_cur_upri(null);
				dtlR.trd_cur_tax_amt(null);
				dtlR.tax_rate(null);
			}
			dtlR.slip_sts_typ_nm(!MAC_SLIP_STS_TYP.isCRT(getConvSlipStsTyp(ioDR)) ? MAC_SLIP_STS_TYP.get(ioDR.slip_sts_typ()).name(MCSys.user.locale()) : null);

			return dtlR;
		}

		/**
		 * 入金関連の請求明細の印刷情報を作成する。
		 * 
		 * @param billHdrBaseR ヘッダベース
		 * @param billDtlBaseL 請求明細（入金）
		 */
		protected void addPrntArBillDtl(Bill_Prnt01_HdrBaseR billHdrBaseR, MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL) {

			if (billDtlBaseL.size() == 0) {
				return;
			}

			MCList<Bill_Prnt01_DtlBaseR> prntL = billDtlBaseL.groupBy(getArBillDGroupByPolicy());
			ArrayList<String> sortCols = new ArrayList<>();
			sortCols.addAll(Arrays.asList(getSortOrder(billHdrBaseR.bill_dtl_sort_typ())));
			sortCols.add(Bill_Prnt01_DtlBaseR.$setoff_flg);	// 入金分、相殺分の順で出力する
			prntL.sort(sortCols);

			// 明細作成
			for (Bill_Prnt01_DtlBaseR prntR : prntL) {

				BillDtlR dtlR = getPrntArBillDtl(billHdrBaseR, prntR);
				addPrntDtl(dtlR);
			}

			// 小計は請求書明細の場合のみ
			addPrntArSubttl(billHdrBaseR, prntL);
		}

		/**
		 * 入金関連の請求明細の印刷情報を取得する
		 * 
		 * @param billHdrBaseR ヘッダベース
		 * @param dR 請求明細（入金）
		 * @return 請求明細の印刷情報
		 */
		protected BillDtlR getPrntArBillDtl(Bill_Prnt01_HdrBaseR billHdrBaseR, Bill_Prnt01_DtlBaseR dR) {

			BillDtlR dtlR = BillDtlR.create();
			dtlR.setAttributes(dR);

			dtlR.dlv_dt(dR.rcv_dt());
			dtlR.itm_nm(dR.rcv_nm());
			dtlR.trd_cd(dR.trd_cd());
			dtlR.trd_nm(dR.trd_nm());
			dtlR.trd_cur_amt(dR.trd_cur_amt());
			if (!isNull(dR.trd_cur_tax_amt())) {
				dtlR.trd_cur_tax_amt(!dR.trd_cur_tax_amt().isZero() ? dR.trd_cur_tax_amt() : null); // 消費税差額伝票は税額が表示される
			}
			dtlR.tax_nm(dR.tax_nm());
			dtlR.s_inc_tax_flg(dR.inc_tax_flg() ? MSC_BILL_PRNT_STR.INC_TAX.name(MCSys.user.locale()) : null);
			dtlR.trd_d_rmrks(dR.bill_d_rmrks());
			dtlR.bill_d_rmrks(dR.bill_d_rmrks());
			dtlR.slip_sts_typ_nm(!MAC_SLIP_STS_TYP.isCRT(dR.slip_sts_typ()) ? MAC_SLIP_STS_TYP.get(dR.slip_sts_typ()).name(MCSys.user.locale()) : null);

			return dtlR;

		}

		/**
		 * 入金の明細の集計条件を取得する。<br>
		 * 同じ伝票Ｎｏの明細はひとつにまとめる
		 * 
		 * @return 集計条件
		 */
		protected MCGroupByPolicy getArBillDGroupByPolicy() {

			MCGroupByPolicy p = new MCGroupByPolicy(
					Bill_Prnt01_DtlBaseR.$ac_dt,
					Bill_Prnt01_DtlBaseR.$act_no,
					Bill_Prnt01_DtlBaseR.$trd_cd,
					Bill_Prnt01_DtlBaseR.$trd_nm,
					Bill_Prnt01_DtlBaseR.$trd_ptn_typ,
					Bill_Prnt01_DtlBaseR.$rcv_nm,
					Bill_Prnt01_DtlBaseR.$rcv_dt,
					Bill_Prnt01_DtlBaseR.$sort_dlv_dt,
					Bill_Prnt01_DtlBaseR.$tax_cd,
					Bill_Prnt01_DtlBaseR.$tax_nm,
					Bill_Prnt01_DtlBaseR.$inc_tax_flg,
					Bill_Prnt01_DtlBaseR.$slip_sts_typ,
					Bill_Prnt01_DtlBaseR.$trd_d_rmrks,
					Bill_Prnt01_DtlBaseR.$bill_d_rmrks
					,Bill_Prnt01_DtlBaseR.$setoff_flg
					,Bill_Prnt01_DtlBaseR.$bill_tax_disp_flg1
					,Bill_Prnt01_DtlBaseR.$bill_tax_disp_flg2
					);

			p.sum(Bill_Prnt01_DtlBaseR.$trd_cur_amt, Bill_Prnt01_DtlBaseR.$trd_cur_tax_amt);

			return p;
		}

		/**
		 * 合計行を追加する
		 * 
		 * @param billHdrBaseR ヘッダベース
		 * @param ioDL 売上合計対象
		 * @param arDL 入金合計対象（存在しない場合はnullを渡すこと）
		 */
		protected void addPrntTtl(Bill_Prnt01_HdrBaseR billHdrBaseR, MCList<Bill_Prnt01_DtlBaseR> ioDL, MCList<Bill_Prnt01_DtlBaseR> arDL) {

			MCNumber ttlIoAmt = nvl(ioDL.sum(Bill_Prnt01_DtlBaseR.$trd_cur_amt), MCNumber.ZERO);
			MCNumber ttlCtaxAmt = nvl(ioDL.sum(Bill_Prnt01_DtlBaseR.$trd_cur_tax_amt), MCNumber.ZERO);
			MCNumber ttlArAmt = (arDL != null) ? nvl(arDL.sum(Bill_Prnt01_DtlBaseR.$trd_cur_amt), MCNumber.ZERO) : MCNumber.ZERO;

			BillDtlR ttlR = BillDtlR.create();
			ttlR.setAttributes(billHdrBaseR);

			ttlR.trd_nm(MSC_BILL_PRNT_STR.TTL.name(MCSys.user.locale()));
			ttlR.trd_cur_amt(MCNumber.sum(ttlIoAmt.subtract(ttlArAmt), ttlCtaxAmt));
			ttlR.trd_d_rmrks(billHdrBaseR.cur_nm());

			addPrntDtl(ttlR);
			addPrntDtl(BillDtlR.create());
		}

		/**
		 * 売掛の小計を追加する
		 * 
		 * @param subttlDR　小計データ
		 * @param billHdrBaseR ヘッダベース
		 */
		protected void addPrntIoSubttl(BillDtlR subttlDR, Bill_Prnt01_HdrBaseR billHdrBaseR) {

			BillDtlR subR = BillDtlR.create();
			subR.setAttributes(billHdrBaseR);
			
			subR.trd_nm(MSC_BILL_PRNT_STR.IO_TTL.name(MCSys.user.locale()));
			subR.itm_cd(subttlDR.itm_cd());
			subR.itm_nm(subttlDR.itm_nm());
			subR.trd_cur_amt(subttlDR.trd_cur_amt());
			subR.trd_cur_tax_amt(subttlDR.trd_cur_tax_amt());

			// 1行空けて挿入
			addPrntDtl(BillDtlR.create());
			addPrntDtl(subR);
			addPrntDtl(BillDtlR.create());
		}

		/**
		 * 入金明細の小計を追加する
		 * 
		 * @param billHdrBaseR ヘッダベース
		 * @param billDtlBaseL 入金明細
		 */
		protected void addPrntArSubttl(Bill_Prnt01_HdrBaseR billHdrBaseR, MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL) {

			BillDtlR subR = BillDtlR.create();
			subR.setAttributes(billHdrBaseR);

			subR.trd_nm(
				(isAdvTrdTyp(billDtlBaseL.get(0).trd_ptn_typ()) ?
					MSC_BILL_PRNT_STR.ADV_TTL : MSC_BILL_PRNT_STR.AR_TTL).name(MCSys.user.locale())
			);
			for (Bill_Prnt01_DtlBaseR billDtlBaseR : billDtlBaseL) {
				if (MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(billDtlBaseR.trd_ptn_typ())) {
					subR.trd_cur_amt(nvl(subR.trd_cur_amt(), MCNumber.ZERO).subtract(billDtlBaseR.trd_cur_amt()));
				}
				else {
					subR.trd_cur_amt(nvl(subR.trd_cur_amt(), MCNumber.ZERO).add(billDtlBaseR.trd_cur_amt()));
					subR.trd_cur_tax_amt(nvl(subR.trd_cur_tax_amt(), MCNumber.ZERO).add(billDtlBaseR.trd_cur_tax_amt()));
				}
			}
			subR.trd_d_rmrks(billHdrBaseR.cur_nm());

			// 1行空けて挿入
			addPrntDtl(BillDtlR.create());
			addPrntDtl(subR);
			addPrntDtl(BillDtlR.create());
		}

		/**
		 * 指定した売掛先の請求明細を抽出する
		 * 
		 * @param acstR 売掛先
		 * @param billDtlBaseL 請求明細
		 * @return 売掛先の請求明細
		 */
		protected MCList<Bill_Prnt01_DtlBaseR> getBillDForAcst(Bill_Prnt01_BpR acstR, MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL){

			return billDtlBaseL.subList("acst_cd", acstR.bp_cd());
		}

		/**
		 * 小計用のコンテナを取得する<br>
		 * コンテナには売掛先コードと売掛先名が設定される
		 * 
		 * @param acstR 売掛先Row
		 * @return 小計用行
		 */
		protected BillDtlR getSubttlBaseForAcst(Bill_Prnt01_BpR acstR) {

			// 小計行の作成
			BillDtlR subttlDR = BillDtlR.create();
			
			if (!isNull(acstR)) {
			
				subttlDR.setAttributes(acstR);
				
				subttlDR.itm_cd(acstR.bp_cd());
				subttlDR.itm_nm(acstR.bp_nm());
			}

			return subttlDR;
		}

		/**
		 * 小計用のコンテナを取得する。<br>
		 * コンテナには得意先コードと得意先名が設定される
		 * 
		 * @param acstR 得意先Row
		 * @return 小計用行
		 */
		protected BillDtlR getSubttlBaseForCst(Bill_Prnt01_BpR acstR) {

			// 小計行の作成
			BillDtlR subttlDR = BillDtlR.create();

			if (!isNull(acstR)) {
				subttlDR.setAttributes(acstR);
				subttlDR.itm_cd(acstR.bp_cd());
				subttlDR.itm_nm(acstR.bp_nm());
			}

			return subttlDR;
		}

		/**
		 * 小計用のコンテナを取得する<br>
		 * コンテナには納品先コードと納品先名が設定される
		 * 
		 * @param dlvR 納品先Row
		 * @return 小計用行
		 */
		protected BillDtlR getSubttlBaseForDlv(Bill_Prnt01_DtlBaseR dlvR) {

			// 小計行の作成
			BillDtlR subttlDR = BillDtlR.create();

			if (!isNull(dlvR)) {
				subttlDR.setAttributes(dlvR);
				subttlDR.itm_cd(dlvR.dlv_cd());
				subttlDR.itm_nm(dlvR.dlv_nm());
			}

			return subttlDR;
		}
		
		/**
		 * 小計用のコンテナを取得する<br>
		 * コンテナには納品先コードと納品先名が設定される
		 * 
		 * @param wrkR 案件Row
		 * @return 小計用行
		 */
		protected BillDtlR getSubttlBaseForWrk(Bill_Prnt01_DtlBaseR wrkR) {

			// 小計行の作成
			BillDtlR subttlDR = BillDtlR.create();

			if (!isNull(wrkR)) {
				subttlDR.setAttributes(wrkR);
				subttlDR.itm_cd(wrkR.wrk_no());
				subttlDR.itm_nm(wrkR.wrk_nm());
			}

			return subttlDR;
		}

		/**
		 * 請求明細のベースを取得する
		 * 
		 * @param billHdrBaseR ヘッダベース
		 * @return 請求明細ベース
		 */
		protected MCList<Bill_Prnt01_DtlBaseR> getBillDtlBase(Bill_Prnt01_HdrBaseR billHdrBaseR) {

			// 明細を取得
			MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL = getBillDtl(billHdrBaseR);

			// 取消伝票・取消票の表示制御
			removeCanRed(billHdrBaseR, billDtlBaseL);

			// 請求残高の表示制御
			removeSwInOut(billDtlBaseL);

			return billDtlBaseL;
		}

		/**
		 * 請求明細を取得する。
		 * 
		 * @param billHdrBaseR ヘッダベース
		 * @return 請求明細
		 */
		protected MCList<Bill_Prnt01_DtlBaseR> getBillDtl(Bill_Prnt01_HdrBaseR billHdrBaseR){
			
			// 受払伝票系の明細を取得
			MCList<Bill_Prnt01_DtlBaseR> ioBillDL = getIoBillD(billHdrBaseR);
			ioBillDL.sort(getSortOrder(billHdrBaseR.bill_dtl_sort_typ()));

			// 債権伝票系の明細を取得
			MCList<Bill_Prnt01_DtlBaseR> arBillDL = getArBillD(billHdrBaseR);
			arBillDL.sort(getSortOrder(billHdrBaseR.bill_dtl_sort_typ()));

			// 二つをあわせる
			MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL = MCList.create(Bill_Prnt01_DtlBaseR.class);
			billDtlBaseL.addAll(ioBillDL);
			billDtlBaseL.addAll(arBillDL);

			// 表示用の符号設定
			for (Bill_Prnt01_DtlBaseR billDtlBaseR : billDtlBaseL) {
				setDispPm(billDtlBaseR);
			}

			return billDtlBaseL;
		}

		/**
		 * 単価、数量、金額の表示用の符号を設定する。
		 * 
		 * @param billDtlBaseR 請求明細
		 */
		protected void setDispPm(Bill_Prnt01_DtlBaseR billDtlBaseR) {

			billDtlBaseR.trd_unit_qty(billDtlBaseR.trd_unit_qty().multiply(
					MAC_TRD_PTN_TYP.qty_disp_pm(billDtlBaseR.trd_ptn_typ())));
			billDtlBaseR.trd_cur_upri(billDtlBaseR.trd_cur_upri().multiply(
					MAUCL_TrdUtil.getUpriDispPm(billDtlBaseR.trd_ptn_typ(), billDtlBaseR.dscnt_itm_flg())));
			billDtlBaseR.trd_cur_amt(billDtlBaseR.trd_cur_amt().multiply(
					MAUCL_TrdUtil.getAmtDispPm(billDtlBaseR.trd_ptn_typ(), billDtlBaseR.dscnt_itm_flg())));
			billDtlBaseR.trd_cur_tax_amt(billDtlBaseR.trd_cur_tax_amt().multiply(
					MAUCL_TrdUtil.getAmtDispPm(billDtlBaseR.trd_ptn_typ(), billDtlBaseR.dscnt_itm_flg())));
			billDtlBaseR.base_cur_tax_amt(billDtlBaseR.base_cur_tax_amt().multiply(
					MAUCL_TrdUtil.getAmtDispPm(billDtlBaseR.trd_ptn_typ(), billDtlBaseR.dscnt_itm_flg())));
			billDtlBaseR.trd_cur_amt1(billDtlBaseR.trd_cur_amt1().multiply(
					MAUCL_TrdUtil.getAmtDispPm(billDtlBaseR.trd_ptn_typ(), billDtlBaseR.dscnt_itm_flg())));
			billDtlBaseR.trd_cur_amt2(billDtlBaseR.trd_cur_amt2().multiply(
					MAUCL_TrdUtil.getAmtDispPm(billDtlBaseR.trd_ptn_typ(), billDtlBaseR.dscnt_itm_flg())));
			billDtlBaseR.trd_cur_amt3(billDtlBaseR.trd_cur_amt3().multiply(
					MAUCL_TrdUtil.getAmtDispPm(billDtlBaseR.trd_ptn_typ(), billDtlBaseR.dscnt_itm_flg())));
			billDtlBaseR.trd_cur_tax_amt1(billDtlBaseR.trd_cur_tax_amt1().multiply(
					MAUCL_TrdUtil.getAmtDispPm(billDtlBaseR.trd_ptn_typ(), billDtlBaseR.dscnt_itm_flg())));
			billDtlBaseR.trd_cur_tax_amt2(billDtlBaseR.trd_cur_tax_amt2().multiply(
					MAUCL_TrdUtil.getAmtDispPm(billDtlBaseR.trd_ptn_typ(), billDtlBaseR.dscnt_itm_flg())));
			billDtlBaseR.trd_cur_tax_amt3(billDtlBaseR.trd_cur_tax_amt3().multiply(
					MAUCL_TrdUtil.getAmtDispPm(billDtlBaseR.trd_ptn_typ(), billDtlBaseR.dscnt_itm_flg())));
			billDtlBaseR.base_cur_tax_amt1(billDtlBaseR.base_cur_tax_amt1().multiply(
					MAUCL_TrdUtil.getAmtDispPm(billDtlBaseR.trd_ptn_typ(), billDtlBaseR.dscnt_itm_flg())));
			billDtlBaseR.base_cur_tax_amt2(billDtlBaseR.base_cur_tax_amt2().multiply(
					MAUCL_TrdUtil.getAmtDispPm(billDtlBaseR.trd_ptn_typ(), billDtlBaseR.dscnt_itm_flg())));
			billDtlBaseR.base_cur_tax_amt3(billDtlBaseR.base_cur_tax_amt3().multiply(
					MAUCL_TrdUtil.getAmtDispPm(billDtlBaseR.trd_ptn_typ(), billDtlBaseR.dscnt_itm_flg())));
		}

		/**
		 * 受払に関わる請求明細を取得する。<br>
		 * 売上・返品・値引値増・消費税差額が対象
		 * 
		 * @param billHdrBaseR ヘッダベース
		 * @return 受払に関わる請求明細
		 */
		protected MCList<Bill_Prnt01_DtlBaseR> getIoBillD(Bill_Prnt01_HdrBaseR billHdrBaseR) {
			
			MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL = MCList.create(Bill_Prnt01_DtlBaseR.class);
			
			MCIndexKey idxkey = _billDtlBaseL.createIndex(Bill_Prnt01_DtlBaseR.$bill_mng_no);
			
			MCList<Bill_Prnt01_DtlBaseR> subDtlBaseL = _billDtlBaseL.subList(idxkey, billHdrBaseR.bill_mng_no());
			
			for (Bill_Prnt01_DtlBaseR dtlBaseR : subDtlBaseL) {
				
				if (MAC_AR_TRD_GRP_TYP.isSLS(dtlBaseR.ar_trd_grp_typ())
						||MAC_AR_TRD_GRP_TYP.isSLS_RTN(dtlBaseR.ar_trd_grp_typ())
						||MAC_AR_TRD_GRP_TYP.isSLS_DSCNT(dtlBaseR.ar_trd_grp_typ())
						||MAC_AR_TRD_GRP_TYP.isTAX_DIFF(dtlBaseR.ar_trd_grp_typ())) {
					
					billDtlBaseL.add(dtlBaseR);
				}
			}
			
			return billDtlBaseL;
		}

		/**
		 * 入金に関わる請求明細を取得する。<br>
		 * 入金・相殺・振替が対象
		 * 
		 * @param billHdrBaseR ヘッダベース
		 * @return 入金に関わる請求明細
		 */
		protected MCList<Bill_Prnt01_DtlBaseR> getArBillD(Bill_Prnt01_HdrBaseR billHdrBaseR) {

			MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL = MCList.create(Bill_Prnt01_DtlBaseR.class);
			
			MCIndexKey idxkey = _billDtlBaseL.createIndex(Bill_Prnt01_DtlBaseR.$bill_mng_no);
			
			MCList<Bill_Prnt01_DtlBaseR> subDtlBaseL = _billDtlBaseL.subList(idxkey, billHdrBaseR.bill_mng_no());
			
			boolean isBfwBalDispFlg = isBfwBalDisp(billHdrBaseR, subDtlBaseL);
			
			for (Bill_Prnt01_DtlBaseR dtlBaseR : subDtlBaseL) {
				
				if (MAC_AR_TRD_GRP_TYP.isRCV(dtlBaseR.ar_trd_grp_typ())
						||MAC_AR_TRD_GRP_TYP.isSETOFF(dtlBaseR.ar_trd_grp_typ())
						||MAC_AR_TRD_GRP_TYP.isARSW(dtlBaseR.ar_trd_grp_typ())) {
					
					if (!isBfwBalDispFlg) {
						// 請求書に前回請求額を載せない場合は残高振替のみ表示する
						if (isArswTrdTyp(dtlBaseR.trd_ptn_typ())) {
							billDtlBaseL.add(dtlBaseR);
						}
						else if (isAdvTrdTyp(dtlBaseR.trd_ptn_typ()) && isBfwBalDisp(billHdrBaseR)) {
							billDtlBaseL.add(dtlBaseR);
						}
					}
					else {
						billDtlBaseL.add(dtlBaseR);
					}
				}
			}
			
			return billDtlBaseL;
		}

		/**
		 * 残高振替の取引かどうかを判断する
		 * 
		 * @param trdTyp 取引区分
		 * @return 残高振替の取引の場合にtrue
		 */
		protected boolean isArswTrdTyp(String trdTyp) {

			return MAC_TRD_PTN_TYP.isARSW_IN_BILL_BAL(trdTyp)
					|| MAC_TRD_PTN_TYP.isARSW_OUT_BILL_BAL(trdTyp);

		}

		/**
		 * 請求明細出力順に従って明細のソート順を取得する
		 * 
		 * @param sortTyp 請求明細出力順
		 * @return ソート順
		 */
		protected String[] getSortOrder(String sortTyp) {

			if (MAC_BILL_DTL_SORT_TYP.isAC_DT(sortTyp)) {
				return new String[] {
						Bill_Prnt01_DtlBaseR.$ac_dt,
						Bill_Prnt01_DtlBaseR.$sort_dlv_dt,
						Bill_Prnt01_DtlBaseR.$cst_po_no,
						Bill_Prnt01_DtlBaseR.$cst_po_d_no,
						Bill_Prnt01_DtlBaseR.$dlv_slip_no,
						Bill_Prnt01_DtlBaseR.$act_no,
						Bill_Prnt01_DtlBaseR.$act_d_no
				};
			}
			else if (MAC_BILL_DTL_SORT_TYP.isARV_DT(sortTyp)) {
				return new String[] {
						Bill_Prnt01_DtlBaseR.$sort_dlv_dt,
						Bill_Prnt01_DtlBaseR.$cst_po_no,
						Bill_Prnt01_DtlBaseR.$cst_po_d_no,
						Bill_Prnt01_DtlBaseR.$ac_dt,
						Bill_Prnt01_DtlBaseR.$dlv_slip_no,
						Bill_Prnt01_DtlBaseR.$act_no,
						Bill_Prnt01_DtlBaseR.$act_d_no,
				};
			}
			else if (MAC_BILL_DTL_SORT_TYP.isCST_PO_NO(sortTyp)) {
				return new String[] {
						Bill_Prnt01_DtlBaseR.$cst_po_no,
						Bill_Prnt01_DtlBaseR.$cst_po_d_no,
						Bill_Prnt01_DtlBaseR.$sort_dlv_dt,
						Bill_Prnt01_DtlBaseR.$ac_dt,
						Bill_Prnt01_DtlBaseR.$dlv_slip_no,
						Bill_Prnt01_DtlBaseR.$act_no,
						Bill_Prnt01_DtlBaseR.$act_d_no,
				};
			}
			else if (MAC_BILL_DTL_SORT_TYP.isDLV_SLIP_NO(sortTyp)) {
				return new String[] {
						Bill_Prnt01_DtlBaseR.$dlv_slip_no,
						Bill_Prnt01_DtlBaseR.$act_no,
						Bill_Prnt01_DtlBaseR.$act_d_no,
						Bill_Prnt01_DtlBaseR.$sort_dlv_dt,
						Bill_Prnt01_DtlBaseR.$cst_po_no,
						Bill_Prnt01_DtlBaseR.$cst_po_d_no,
						Bill_Prnt01_DtlBaseR.$ac_dt
				};
			}

			return null;
		}

		/**
		 * 不要な明細を取り除く<br>
		 * 取消、取消伝票が同じ請求に含まれる場合に該当する明細を印刷対象から削除する。
		 * 
		 * @param billHdrBaseR ヘッダベース
 		 * @param billDtlBaseL 請求明細
		 */
		protected void removeCanRed(Bill_Prnt01_HdrBaseR billHdrBaseR, MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL) {
			
			MCIndexKey billDtlBaseLKey = billDtlBaseL.createIndex(getBillDtlBaseLKey());
			
			// 請求書に出力するかどうか
			billDtlBaseL.addBooleanColumn("prnt", true);
			// 請求書明細に出力するか
			billDtlBaseL.addBooleanColumn("billDtlPrnt", true);
			// 請求書明細に出力する取消伝票の文字列「取消」を表示しないように空文字列に変換するか
			billDtlBaseL.addBooleanColumn("billDtlConv", false);
			// 売上明細に出力するか
			billDtlBaseL.addBooleanColumn("slsDtlPrnt", true);
			// 売上明細に出力する取消伝票の文字列「取消」を表示しないように空文字列に変換するか
			billDtlBaseL.addBooleanColumn("slsDtlConv", false);

			for (Bill_Prnt01_DtlBaseR billDtlBaseR : billDtlBaseL) {
				
				// 取消伝票を表示する場合（入金系の明細以外）は追加してスキップ
				if (!MAC_BILL_CAN_SLIP_TYP.isNO_DISP(billHdrBaseR.bill_can_slip_typ()) && !isRcvTrdTyp(billDtlBaseR.trd_ptn_typ())) {
					
					if(billHdrBaseR.getBooleanNE("bill_d_sel_flg")){
						continue;
					}
					if(MAC_BILL_CAN_SLIP_TYP.isDISP_ALL(billHdrBaseR.bill_can_slip_typ())){
						continue;
					}
					else if (MAC_BILL_CAN_SLIP_TYP.isDISP_DIFF(billHdrBaseR.bill_can_slip_typ())){
						
						if (!isSame(billDtlBaseR.act_d_seq(), MCNumber.ONE)
								&& (MAC_SLIP_STS_TYP.isCRT(billDtlBaseR.slip_sts_typ()) || MAC_SLIP_STS_TYP.isDIS(billDtlBaseR.slip_sts_typ()))) {
							// 取消を取得。伝票行ＮＯが異なる場合は別の明細とみなす。
							Bill_Prnt01_DtlBaseR canR = billDtlBaseL.getFirst(billDtlBaseLKey, getBillDtlBaseLDisKeyVal(billDtlBaseR));
							if (!isNull(canR)) {
								Bill_Prnt01_DtlBaseR disR = billDtlBaseL.getFirst(billDtlBaseLKey, getBillDtlBaseLDisKeyVal(canR));
								if (!isNull(disR)) {
									
									if (checkSameData(billDtlBaseR, disR, canR, billHdrBaseR)) {
										// 取消、黒伝は表示しない
										canR.setBooleanNE("prnt", false);
										billDtlBaseR.setBooleanNE("prnt", false);
									}
								}
							}
						}
					}
					continue;
				}
				
				// 無効伝票の場合、取消伝票が存在した場合はスキップ
				if (MAC_SLIP_STS_TYP.isDIS(billDtlBaseR.slip_sts_typ())) {
					if (isAllBill(billDtlBaseR) && isCanSlipExist(billDtlBaseR, billDtlBaseL, billDtlBaseLKey)) {
						billDtlBaseR.setBooleanNE("prnt", false);
						continue;
					}
				}
				// 取消伝票の場合、無効伝票が存在した場合はスキップ
				if (MAC_SLIP_STS_TYP.isCAN(billDtlBaseR.slip_sts_typ())) {
					if (isAllBill(billDtlBaseR) && isDisSlipExist(billDtlBaseR, billDtlBaseL, billDtlBaseLKey)) {
						billDtlBaseR.setBooleanNE("prnt", false);
						continue;
					}
				}
			}
			setInterimFlg(billHdrBaseR, billDtlBaseL);
			billDtlBaseL.setAll(billDtlBaseL.subList("prnt", true));
			setSlipConv(billHdrBaseR, billDtlBaseL);
		}

		protected void setSlipConv(Bill_Prnt01_HdrBaseR billHdrBaseR, MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL) {
			MCIndexKey billDtlBaseLKey = billDtlBaseL.createIndex(Bill_Prnt01_DtlBaseR.$act_d_no);
			for (Bill_Prnt01_DtlBaseR billDtlBaseR : billDtlBaseL) {

				if(billHdrBaseR.getBooleanNE("bill_d_sel_flg")){
					continue;
				}
				if (isRcvTrdTyp(billDtlBaseR.trd_ptn_typ()) 
						|| !MAC_BILL_CAN_SLIP_TYP.isDISP_DIFF(billHdrBaseR.bill_can_slip_typ())) {
					continue;
				}

				if (MAC_SLIP_STS_TYP.isDIS(billDtlBaseR.slip_sts_typ())) {
					MCList<Bill_Prnt01_DtlBaseR> billDtlL = billDtlBaseL.subList(billDtlBaseLKey, billDtlBaseR.act_d_no());
					if (billDtlBaseR.getBooleanNE("billDtlPrnt")) {
						MCList<Bill_Prnt01_DtlBaseR> subBillDtlL = getBillDPrntDtl(billDtlL);
						Bill_Prnt01_DtlBaseR canSubBillDtlR = getMaxSlipDR(subBillDtlL.subList(Bill_Prnt01_DtlBaseR.$slip_sts_typ, MAC_SLIP_STS_TYP.CAN.value()));
						Bill_Prnt01_DtlBaseR crtSubBillDtlR = getMaxSlipDR(subBillDtlL.subList(Bill_Prnt01_DtlBaseR.$slip_sts_typ, MAC_SLIP_STS_TYP.CRT.value()));
						if (!existsMaxSlipDR(billDtlBaseR, canSubBillDtlR) && !existsMaxSlipDR(billDtlBaseR, crtSubBillDtlR)) {
							billDtlBaseR.setBooleanNE("billDtlConv", true);
						}
						else {
							billDtlBaseR.setBooleanNE("billDtlConv", false);
						}
					}
					if (billDtlBaseR.getBooleanNE("slsDtlPrnt")) {
						MCList<Bill_Prnt01_DtlBaseR> subSlsDtlL = getSlsDtlPrntDtl(billDtlL);
						Bill_Prnt01_DtlBaseR canSubSlsDtlR = getMaxSlipDR(subSlsDtlL.subList(Bill_Prnt01_DtlBaseR.$slip_sts_typ, MAC_SLIP_STS_TYP.CAN.value()));
						Bill_Prnt01_DtlBaseR crtSubSlsDtlR = getMaxSlipDR(subSlsDtlL.subList(Bill_Prnt01_DtlBaseR.$slip_sts_typ, MAC_SLIP_STS_TYP.CRT.value()));
						if (!existsMaxSlipDR(billDtlBaseR, canSubSlsDtlR) && !existsMaxSlipDR(billDtlBaseR, crtSubSlsDtlR)) {
							billDtlBaseR.setBooleanNE("slsDtlConv", true);
						}
						else {
							billDtlBaseR.setBooleanNE("slsDtlConv", false);
						}
					}
				}
			}
		}

		protected boolean isAllBill(Bill_Prnt01_DtlBaseR billDtlBaseR) {
			if (MSC_BILL_MTD_TYP.isALL_BILL(billDtlBaseR.bill_mtd_typ()) && !billDtlBaseR.getBooleanNE("crryovr_flg")) {
				return true;
			}
			return false;
		}

		protected boolean isCanSlipExist(Bill_Prnt01_DtlBaseR billDtlBaseR, MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL, MCIndexKey billDtlBaseLKey) {
			if (!isNull(billDtlBaseR.act_d_seq()) 
					&& billDtlBaseL.subList(billDtlBaseLKey, getBillDtlBaseLCanKeyVal(billDtlBaseR)).size() > 0) {
				return true;
			}
			return false;
		}
		protected boolean isDisSlipExist(Bill_Prnt01_DtlBaseR billDtlBaseR, MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL, MCIndexKey billDtlBaseLKey) {
			if (!isNull(billDtlBaseR.act_d_seq()) 
					&& billDtlBaseL.subList(billDtlBaseLKey, getBillDtlBaseLDisKeyVal(billDtlBaseR)).size() > 0) {
				return true;
			}
			return false;
		}

		protected String[] getBillDtlBaseLKey() {
			return new String[] {
					Bill_Prnt01_DtlBaseR.$act_d_no,
					Bill_Prnt01_DtlBaseR.$act_d_seq,
					Bill_Prnt01_DtlBaseR.$bill_mtd_typ,
					"crryovr_flg"
			};
		}
		protected Comparable<?>[] getBillDtlBaseLCanKeyVal(Bill_Prnt01_DtlBaseR r) {
			return new Comparable<?>[] {
					r.act_d_no(),
					r.act_d_seq().add(1),
					r.bill_mtd_typ(),
					false
			};
		}
		protected Comparable<?>[] getBillDtlBaseLDisKeyVal(Bill_Prnt01_DtlBaseR r) {
			return new Comparable<?>[] {
					r.act_d_no(),
					r.act_d_seq().add(-1),
					r.bill_mtd_typ(),
					false
			};
		}
		protected boolean isDisRTgt(Bill_Prnt01_DtlBaseR r, Bill_Prnt01_DtlBaseR canR) {
			if (isSame(r.act_d_no(), canR.act_d_no()) && isSame(r.bill_mtd_typ(), canR.bill_mtd_typ()) 
					&& !r.getBooleanNE("crryovr_flg") && existsMaxSlipDR(r, canR)) {
				return true;
			}
			return false;
		}
		protected boolean existsMaxSlipDR(Bill_Prnt01_DtlBaseR r, Bill_Prnt01_DtlBaseR slipDR) {
			if (isNull(slipDR)) {
				return false;
			}
			if (r.act_d_seq().lt(slipDR.act_d_seq())) {
				return true;
			}
			return false;
		}
		protected Bill_Prnt01_DtlBaseR getMaxSlipDR(MCList<Bill_Prnt01_DtlBaseR> billDtlL) {
			if (billDtlL.isEmpty()) {
				return null;
			}
			billDtlL.sort(SortType.DESC, Bill_Prnt01_DtlBaseR.$act_d_seq);
			return billDtlL.get(0);
		}

		/**
		 * 仮単価を設定する。
		 * @param billHdrBaseR ヘッダベース
 		 * @param billDtlBaseL 請求明細
		 */
		protected void setInterimFlg(Bill_Prnt01_HdrBaseR billHdrBaseR, MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL) {
			
			// 請求書取消伝票表示区分が無効・取消伝票を表示する（変更のみ）の場合のみ、設定する
			if (!MAC_BILL_CAN_SLIP_TYP.isDISP_DIFF(billHdrBaseR.bill_can_slip_typ())) {
				return;
			}
			
			MCIndexKey idxkey = billDtlBaseL.createIndex(Bill_Prnt01_DtlBaseR.$act_d_no, Bill_Prnt01_DtlBaseR.$act_d_seq);
			
			for (Bill_Prnt01_DtlBaseR billDtlBaseR : billDtlBaseL.subList("prnt", true)) {
				
				if (MAC_SLIP_STS_TYP.isDIS(billDtlBaseR.slip_sts_typ())) {
					
					// 請求書項目変更なしの最終回訂正レコードを取得する
					
					Bill_Prnt01_DtlBaseR latestSameBillR = billDtlBaseL.getFirst(idxkey, billDtlBaseR.act_d_no(), billDtlBaseR.act_d_seq().add(1));
					
					while (!isNull(latestSameBillR)) {
						
						Bill_Prnt01_DtlBaseR nextR = billDtlBaseL.getFirst(idxkey, latestSameBillR.act_d_no(), latestSameBillR.act_d_seq().add(1));
						
						if (isNull(nextR) || nextR.getBooleanNE("prnt")) {
							break;
						}
						
						latestSameBillR = nextR;
					}
					
					if (!isNull(latestSameBillR) && !latestSameBillR.getBooleanNE("prnt")) {
						// 最新の仮単価を設定する
						billDtlBaseR.interim_flg(latestSameBillR.interim_flg());
					}
				}
			}
		}

		/**
		 * 新規伝票と無効伝票と取消伝票が変わっているか判断する。
		 * @param crtR 新規伝票
		 * @param disR　無効伝票
		 * @param canR 取消伝票
		 * @param billHdrBaseR 請求ヘッダーベースRow
		 * @return 変わっている場合はtrue
		 */
		protected boolean checkSameData(Bill_Prnt01_DtlBaseR crtR, Bill_Prnt01_DtlBaseR disR, Bill_Prnt01_DtlBaseR canR, Bill_Prnt01_HdrBaseR billHdrBaseR) {
			
			// 明細項目に変更がある場合は表示する
			boolean isComColChanged = true;
			if (!isSame(nvl(crtR.dlv_dt(), crtR.ac_dt()), nvl(disR.dlv_dt(), disR.ac_dt()))
					|| !isSame(crtR.base_sls_ac_dt(), disR.base_sls_ac_dt())
					|| !isSame(crtR.dlv_slip_no(), disR.dlv_slip_no())
					|| !isSame(crtR.itm_cd(), disR.itm_cd())
					|| !isSame(crtR.itm_sub1(), disR.itm_sub1())
					|| !isSame(crtR.itm_sub2(), disR.itm_sub2())
					|| !isSame(crtR.itm_sub3(), disR.itm_sub3())
					|| !isSame(crtR.itm_nm(), disR.itm_nm())
					|| !isSame(crtR.cst_itm_cd(), disR.cst_itm_cd())
					|| !isSame(crtR.cst_itm_nm(), disR.cst_itm_nm())
					|| !isSame(crtR.trd_unit_qty(), disR.trd_unit_qty())
					|| !isSame(crtR.trd_unit_cd(), disR.trd_unit_cd())
					|| !isSame(crtR.trd_cur_upri(), disR.trd_cur_upri())
					|| !isSame(crtR.trd_cur_amt(), disR.trd_cur_amt())
					|| !isSame(crtR.trd_cur_tax_amt(), disR.trd_cur_tax_amt())
					|| !isSame(crtR.tax_cd(), disR.tax_cd())
					|| !isSame(crtR.trd_d_rmrks(), disR.trd_d_rmrks())
					|| !isSame(crtR.bill_d_rmrks(), disR.bill_d_rmrks())) {
				isComColChanged = false;
			}
			// 明細項目は同じでも請求書明細、売上明細の出力方法（取引先マスタの設定による）で使用する値が変更されている場合、
			// 出力対象として一旦保持するが、請求書明細、売上明細を出力する際に表示対象から除外する

			boolean isBillDColChanged = true;
			// 請求書明細
			if (MAC_BILL_DTL_SUBTTL_TYP.isEACH_ACST(billHdrBaseR.bill_dtl_subttl_typ())) {
				if (!isSame(crtR.getStringNE("acst_cd"), disR.getStringNE("acst_cd"))) {
					isBillDColChanged = false;
				}
				else if (isComColChanged && isBillDColChanged) {
					crtR.addBooleanColumn("billDtlPrnt", false);
					canR.addBooleanColumn("billDtlPrnt", false);
					disR.addBooleanColumn("billDtlConv", true);
				}
			}
			else if (MAC_BILL_DTL_SUBTTL_TYP.isEACH_CST(billHdrBaseR.bill_dtl_subttl_typ())) {
				if (!isSame(crtR.cst_cd(), disR.cst_cd())) {
					isBillDColChanged = false;
				}
				else if (isComColChanged && isBillDColChanged) {
					crtR.addBooleanColumn("billDtlPrnt", false);
					canR.addBooleanColumn("billDtlPrnt", false);
					disR.addBooleanColumn("billDtlConv", true);
				}
			}
			else if (MAC_BILL_DTL_SUBTTL_TYP.isEACH_DLV(billHdrBaseR.bill_dtl_subttl_typ())) {
				if (!isSame(crtR.dlv_cd(), disR.dlv_cd())) {
					isBillDColChanged = false;
				}
				else if (isComColChanged && isBillDColChanged) {
					crtR.addBooleanColumn("billDtlPrnt", false);
					canR.addBooleanColumn("billDtlPrnt", false);
					disR.addBooleanColumn("billDtlConv", true);
				}
			}
			else if (MAC_BILL_DTL_SUBTTL_TYP.isEACH_WRK(billHdrBaseR.bill_dtl_subttl_typ())) {
				if (!isSame(crtR.wrk_no(), disR.wrk_no())) {
					isBillDColChanged = false;
				}
				else if (isComColChanged && isBillDColChanged) {
					crtR.addBooleanColumn("billDtlPrnt", false);
					canR.addBooleanColumn("billDtlPrnt", false);
					disR.addBooleanColumn("billDtlConv", true);
				}
			}
			else if (MAC_BILL_DTL_SUBTTL_TYP.isNOT_OUTP(billHdrBaseR.bill_dtl_subttl_typ()) && isComColChanged && isBillDColChanged) {
				// 小計単位が無いので出力しない
				crtR.addBooleanColumn("billDtlPrnt", false);
				canR.addBooleanColumn("billDtlPrnt", false);
				disR.addBooleanColumn("billDtlConv", true);
			}

			boolean isSlsDColChanged = true;
			// 売上明細
			if (isIoD(crtR)) {
				if (MAC_SLS_DTL_OUTP_TYP.isEACH_CST(billHdrBaseR.sls_dtl_outp_typ())) {
					if (!isSame(crtR.cst_cd(), disR.cst_cd())) {
						isSlsDColChanged = false;
					}
					else if (isComColChanged && isSlsDColChanged) {
						crtR.addBooleanColumn("slsDtlPrnt", false);
						canR.addBooleanColumn("slsDtlPrnt", false);
						disR.addBooleanColumn("slsDtlConv", true);
					}
				}
				else if (MAC_SLS_DTL_OUTP_TYP.isEACH_ACST(billHdrBaseR.sls_dtl_outp_typ())) {
					if (!isSame(crtR.getStringNE("acst_cd"), disR.getStringNE("acst_cd"))) {
						isSlsDColChanged = false;
					}
					else if (isComColChanged && isSlsDColChanged) {
						crtR.addBooleanColumn("slsDtlPrnt", false);
						canR.addBooleanColumn("slsDtlPrnt", false);
						disR.addBooleanColumn("slsDtlConv", true);
					}
				}
			}
			return isComColChanged && isBillDColChanged && isSlsDColChanged;
		}
		
		/**
		 * お買い上げ明細に出力する明細を返す。
		 * @param billDL　請求明細
		 * @return お買い上げ明細に出力する明細リスト
		 */
		protected MCList<Bill_Prnt01_DtlBaseR> getSlsDtlPrntDtl(MCList<Bill_Prnt01_DtlBaseR> billDL) {
			return billDL.subList("slsDtlPrnt", true);
		}

		/**
		 * 請求書に出力する明細を返す。
		 * @param billDL 請求明細
		 * @return 請求書に出力する明細リスト
		 */
		protected MCList<Bill_Prnt01_DtlBaseR> getBillDPrntDtl(MCList<Bill_Prnt01_DtlBaseR> billDL) {
			return billDL.subList("billDtlPrnt", true);
		}
		
		/**
		 * 指定された請求明細が売上明細かどうか判定する。
		 * @param dtlBaseR 請求明細Row
		 * @return　売上明細の場合はtrue
		 */
		protected boolean isIoD(Bill_Prnt01_DtlBaseR dtlBaseR) {
			
			return MSC_BILL_D_TYP.isSLS(dtlBaseR.bill_d_typ())
					|| MAC_TRD_PTN_TYP.isTAX_DIFF_BILL_CL(dtlBaseR.trd_ptn_typ());
		}
		
		/**
		 * 取消、新規を表示しないで取消伝票のみ表示する場合、伝票状況区分の「取消」を表示しない為、「新規」の区分に付け替えて返す。
		 * @param dtlBaseR 請求明細
		 * @return　伝票状況区分
		 */
		protected String getConvSlipStsTyp(Bill_Prnt01_DtlBaseR dtlBaseR) {
			
			String slipStsTyp = dtlBaseR.slip_sts_typ();
			if (isBillProcessing) {
				if (dtlBaseR.getBooleanNE("billDtlConv")) {
					slipStsTyp = MAC_SLIP_STS_TYP.CRT.value();
				}
			}
			else {
				if (dtlBaseR.getBooleanNE("slsDtlConv")) {
					slipStsTyp = MAC_SLIP_STS_TYP.CRT.value();
				}
			}
			return slipStsTyp;
		}
		
		/**
		 * 入金系の取引かどうかを判断する。
		 * 
		 * @param trdTyp 取引区分
		 * @return 入金系の取引の場合にtrue
		 */
		protected boolean isRcvTrdTyp(String trdTyp) {

			return MAC_AR_TRD_GRP_TYP.isRCV(MAC_TRD_PTN_TYP.ar_trd_grp_typ(trdTyp))
					|| MAC_AR_TRD_GRP_TYP.isSETOFF(MAC_TRD_PTN_TYP.ar_trd_grp_typ(trdTyp))
					|| MAC_AR_TRD_GRP_TYP.isTAX_DIFF(MAC_TRD_PTN_TYP.ar_trd_grp_typ(trdTyp));
		}

		/**
		 * 同じ請求に同じ親伝から発生した請求残高振替の（－）と（＋）が
		 * 同時に含まれる場合に該当する明細を印刷対象から削除する。
		 * 
		 * @param billDtlBaseL 請求明細
		 */
		protected void removeSwInOut(MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL) {

			MCIndexKey key = billDtlBaseL.createIndex(Bill_Prnt01_DtlBaseR.$par_act_no, Bill_Prnt01_DtlBaseR.$iv_no, Bill_Prnt01_DtlBaseR.$ar_typ);
			HashSet<List<String>> skipSet = new HashSet<List<String>>();
			MCList<Bill_Prnt01_DtlBaseR> removedL = MCList.create(Bill_Prnt01_DtlBaseR.class);

			for (Bill_Prnt01_DtlBaseR r : billDtlBaseL) {

				List<String> skipKey = Arrays.asList(r.par_act_no(), r.iv_no(), r.ar_typ());
				if (skipSet.contains(skipKey)) {
					continue;
				}
				MCList<Bill_Prnt01_DtlBaseR> subL = billDtlBaseL.subList(key, r.par_act_no(), r.iv_no(), r.ar_typ());

				if (subL.size() >= 2) {
					MCIndexKey idxkey = subL.createIndex(Bill_Prnt01_DtlBaseR.$trd_ptn_typ);
					if ((MAC_TRD_PTN_TYP.isARSW_OUT_BILL_BAL(r.trd_ptn_typ())
							&& subL.contains(idxkey, MAC_TRD_PTN_TYP.ARSW_IN_BILL_BAL.value()))
							|| (MAC_TRD_PTN_TYP.isARSW_IN_BILL_BAL(r.trd_ptn_typ())
									&& subL.contains(idxkey, MAC_TRD_PTN_TYP.ARSW_OUT_BILL_BAL.value()))) {

						MCList<Bill_Prnt01_DtlBaseR> inSubL = subL.subList(idxkey, MAC_TRD_PTN_TYP.ARSW_IN_BILL_BAL.value());
						MCList<Bill_Prnt01_DtlBaseR> outSubL = subL.subList(idxkey, MAC_TRD_PTN_TYP.ARSW_OUT_BILL_BAL.value());
						Bill_Prnt01_DtlBaseR inSubR = inSubL.get(0);
						Bill_Prnt01_DtlBaseR outSubR = outSubL.get(0);

						if (isSame(inSubL.size(), inSubR.rcv_act_d_cnt())
								&& isSame(outSubL.size(), outSubR.rcv_act_d_cnt())) {
							skipSet.add(skipKey);
							continue;
						}
					}
				}

				// それ以外は追加
				removedL.add(r);
			}

			// 最後に置き換える
			billDtlBaseL.setAll(removedL);
		}

		/**
		 * 売掛先別の売上明細を作成する
		 * 
		 * @param billHdrBaseR ヘッダベース
		 * @param bAcstR 売掛先別請求情報
		 * @param ioDL 請求明細（受払）
		 */
		protected void addPrntSlsForAcst(Bill_Prnt01_HdrBaseR billHdrBaseR, Bill_Prnt01_BpR acstR, MCList<Bill_Prnt01_DtlBaseR> ioDL) {

			// 対象の明細を取得
			MCList<Bill_Prnt01_DtlBaseR> subL = getBillDForAcst(acstR, ioDL);
			if (subL.size() == 0) {
				return;
			}
			
			subL = getSlsDtlPrntDtl(subL);

			// お買い上げ明細鑑を追加
			addPrntSlsHdr(billHdrBaseR, subL, acstR);

			// お買い上げ明細を追加
			addPrntSlsDtl(billHdrBaseR, subL);
		}

		/**
		 * 得意先別の売上明細を作成する。
		 * 
		 * @param billHdrBaseR ヘッダベース
		 * @param cstR 得意先
		 * @param ioDL 請求明細（受払）
		 */
		protected void addPrntSlsForCst(Bill_Prnt01_HdrBaseR billHdrBaseR, Bill_Prnt01_BpR cstR, MCList<Bill_Prnt01_DtlBaseR> ioDL) {

			// 対象の明細を取得
			MCList<Bill_Prnt01_DtlBaseR> subL = ioDL.subList(Bill_Prnt01_DtlBaseR.$cst_cd, cstR.bp_cd());
			if (subL.size() == 0) {
				return;
			}

			subL = getSlsDtlPrntDtl(subL);

			// お買い上げ明細鑑の作成
			addPrntSlsHdr(billHdrBaseR, subL, cstR);

			// お買い上げ明細を追加
			addPrntSlsDtl(billHdrBaseR, subL);
		}

		/**
		 * 売掛先別の売上明細を追加する。
		 * 
		 * @param billHdrBaseR ヘッダベース
		 * @param billDtlBaseL 請求明細
		 * @param bpR 売掛先/得意先
		 */
		protected void addPrntSlsHdr(Bill_Prnt01_HdrBaseR billHdrBaseR, MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL, Bill_Prnt01_BpR bpR){
			
			SlsHdrR slsHdrR = SlsHdrR.create();
			copy(slsHdrR, billHdrBaseR, createMap_SlsHdrR_Bill_Prnt01_HdrBaseR());

			slsHdrR.re_issue(billHdrBaseR.prnt_flg() ? MSC_BILL_PRNT_STR.RE_PRNT.name(MCSys.user.locale()) : null);
			
			setSlsHdrDt(billHdrBaseR, slsHdrR);
			
			setSlsHdrBp(bpR, slsHdrR);
			
			setSlsHdrCo(slsHdrR);
			
			setSlsHdrAddr(slsHdrR);
			
			setSlsHdrAmt(slsHdrR, billDtlBaseL);
			
			putNumStrSlsHdr(billHdrBaseR, slsHdrR);

			_slsDtlReportSet.addRow(slsHdrR);
		}
		
		/**
		 * お買い上げ明細の売掛先/得意先を設定する。
		 * @param bpR 売掛先/得意先
		 * @param slsHdrR お買い上げ明細ヘッダー
		 */
		protected void setSlsHdrBp(Bill_Prnt01_BpR bpR, SlsHdrR slsHdrR) {
			
			slsHdrR.bp_zip_cd(bpR.zip_cd());
			slsHdrR.bp_addr1(bpR.addr1());
			slsHdrR.bp_addr2(bpR.addr2());
			slsHdrR.bp_addr3(bpR.addr3());
			slsHdrR.bp_addr4(bpR.addr4());
			slsHdrR.bp_tel(bpR.tel());
			slsHdrR.bp_cd(bpR.bp_cd());
			slsHdrR.bp_nm(bpR.bp_nm());
			slsHdrR.bp_alt_nm1(bpR.bp_alt_nm1());
			slsHdrR.bp_alt_nm2(bpR.bp_alt_nm2());
			slsHdrR.bp_alt_nm3(bpR.bp_alt_nm3());
			slsHdrR.bp_alt_nm4(bpR.bp_alt_nm4());
			slsHdrR.bp_cntry_nm(bpR.getStringNE("bp_cntry_nm"));
			slsHdrR.cntry_nm(bpR.getStringNE("cntry_nm"));
		}
		
		/**
		 * お買い上げ明細ヘッダーの日付を設定する。
		 * @param billHdrBaseR 請求ヘッダーベースRow
		 * @param slsHdrR お買い上げ明細ヘッダー
		 */
		protected void setSlsHdrDt(Bill_Prnt01_HdrBaseR billHdrBaseR, SlsHdrR slsHdrR) {	
			
			slsHdrR.prnt_tm(MCDate.now());
			slsHdrR.bill_ym(billHdrBaseR.bill_cl_dt().startOfMonth());
			slsHdrR.bill_cl_day(billHdrBaseR.bill_cl_day());
			slsHdrR.bill_dt(billHdrBaseR.bill_dt());
		}
		
		/**
		 * お買い上げ明細ヘッダーの会社情報を設定する。
		 * @param slsHdrR  お買い上げ明細請求ヘッダー
		 */
		protected void setSlsHdrCo(SlsHdrR slsHdrR) {

			slsHdrR.co_cd(getCo().co_cd());
			slsHdrR.zip_cd(getCo().zip_cd());
			slsHdrR.addr1(getCo().addr1());
			slsHdrR.addr2(getCo().addr2());
			slsHdrR.addr3(getCo().addr3());
			slsHdrR.addr4(getCo().addr4());
			slsHdrR.dpt_tel(nvl(slsHdrR.dpt_tel(), getCo().tel()));
			slsHdrR.biz_co_no(getCo().biz_co_no());
		}
		
		/**
		 * お買い上げ明細ヘッダーの住所を設定する。
		 * @param slsHdrR お買い上げ明細ヘッダー
		 */
		protected void setSlsHdrAddr(SlsHdrR slsHdrR) {
			
			slsHdrR.addr(concatAddress(slsHdrR.addr1(), slsHdrR.addr2(), slsHdrR.addr3(), slsHdrR.addr4()));
			slsHdrR.bp_addr(concatAddress(slsHdrR.bp_addr1(), slsHdrR.bp_addr2(), slsHdrR.bp_addr3(), slsHdrR.bp_addr4()));
		}
		
		/**
		 * 得意先に対応した金額を印刷用ヘッダに設定する。
		 * 
		 * @param slsHdrR お買い上げ明細ヘッダー
		 * @param billDtlBaseL 請求明細
		 */
		protected void setSlsHdrAmt(SlsHdrR slsHdrR, MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL) {

			MCIndexKey key = billDtlBaseL.createIndex(Bill_Prnt01_DtlBaseR.$ar_trd_grp_typ);

			// 各種金額の設定
			slsHdrR.sls_amt(sumAmt(billDtlBaseL, MAC_AR_TRD_GRP_TYP.SLS, key));
			slsHdrR.ret_amt(sumAmt(billDtlBaseL, MAC_AR_TRD_GRP_TYP.SLS_RTN, key));
			slsHdrR.dscnt_amt(sumAmt(billDtlBaseL, MAC_AR_TRD_GRP_TYP.SLS_DSCNT, key));
			slsHdrR.tax_amt(nvl(billDtlBaseL.sum(Bill_Prnt01_DtlBaseR.$trd_cur_tax_amt), MCNumber.ZERO));

			// 合計
			slsHdrR.bill_amt(MCNumber.sum(slsHdrR.sls_amt(), slsHdrR.ret_amt(), slsHdrR.dscnt_amt(), slsHdrR.tax_amt()));
		}
		
		/**
		 * お買い上げ明細ヘッダの数値カラムの値を指定の文字列カラムに設定する
		 * @param billHdrBaseR 請求ヘッダーベース
		 * @param slsHdrR　お買い上げ明細ヘッダー
		 */
		protected void putNumStrSlsHdr(Bill_Prnt01_HdrBaseR billHdrBaseR, SlsHdrR slsHdrR) {

			MCNumber decPlace = billHdrBaseR.amt_dec_place();
			
			putNumStr(_slsDtlReportSet, slsHdrR, SlsHdrR.$s_bill_amt, SlsHdrR.$bill_amt, decPlace);
			putNumStr(_slsDtlReportSet, slsHdrR, SlsHdrR.$s_sls_amt, SlsHdrR.$sls_amt, decPlace);
			putNumStr(_slsDtlReportSet, slsHdrR, SlsHdrR.$s_dscnt_amt, SlsHdrR.$dscnt_amt, decPlace);
			putNumStr(_slsDtlReportSet, slsHdrR, SlsHdrR.$s_ret_amt, SlsHdrR.$ret_amt, decPlace);
			putNumStr(_slsDtlReportSet, slsHdrR, SlsHdrR.$s_tax_amt, SlsHdrR.$tax_amt, decPlace);
		}
		
		protected void addPrntSlsDtl(Bill_Prnt01_HdrBaseR billHdrBaseR, MCList<Bill_Prnt01_DtlBaseR> slsDtlL) {
			
			// お買い上げ明細明細の作成
			addPrntIoDtl(billHdrBaseR, slsDtlL, null);

			// 合計行の追加
			addPrntTtl(billHdrBaseR, slsDtlL, null);

			// 改ページ
			breakDtlPage();
			
			putNumStrDtl(billHdrBaseR);
			
			putViewStrDtl();
			
			_slsDtlReportSet.addAll(_dtlL);
		}
		protected void callBillAttachSrv(List<MCReportSet> rsList) {
			List<Attach_Chk01_DtlR> upLst = new ArrayList<Attach_Chk01_DtlR>(); 
			createBillAttachLst(rsList,upLst);
			
			if(upLst.isEmpty()) {
				return;
			}
			cacheBillPrntInfo(upLst);
			MBBCL_AttachService.Attach_Upd01 ope = MBBCL_AttachService.crtAttach_Upd01();
			setAttachUp(ope,upLst);
			ope.exec();
		}
		protected void createBillAttachLst(List<MCReportSet> rsList,List<Attach_Chk01_DtlR> upLst) {
			for(MCReportSet rs: rsList) {
				//reportSetから、ヘッダを取得する
				String bt = rs.getBlockType(BillHdrR.create());
				
				@SuppressWarnings("unchecked")
				MCList<MCRow> hdrL = rs.getAll(bt);

				if (hdrL == null || hdrL.isEmpty()) {
					continue;
				}
				
				BillHdrR hdrR = (BillHdrR) hdrL.get(0);
				//再発行は登録サービス呼び出し対象外
				if(isRePrntBill(hdrR)) {
					continue;
				}
				editBillAttachLst(rs,hdrR,upLst);
			}
		}
		protected void editBillAttachLst(MCReportSet rs, BillHdrR hdrR,List<Attach_Chk01_DtlR> upLst) {
			Attach_Chk01_DtlR up0 = Attach_Chk01_DtlR.create();
			copy(up0, hdrR, createMap_Attach_Chk01_DtlR_BillHdrR());
			//WG
			up0.wg_cd(getWgCd(hdrR.bill_dpt_cd(), hdrR.prnt_tm()));
			//帳票ID
			up0.report_id(rs.getReportInfo().report_id());
			//添付元ファイル(バイナリ）
			up0.file_bin(rs.getReportInfo().save_file_bin());
			upLst.add(up0);
		}
		protected void setAttachUp(MBBCL_AttachService.Attach_Upd01 ope,List<Attach_Chk01_DtlR> upLst) {
			ope.up0().addAll(upLst);
			ope.up1().upd_cntr_chk_flg(false);
			ope.up1().del_flg(false);
		}
		protected void cacheBillPrntInfo(List<Attach_Chk01_DtlR> upLst) {
			for(Attach_Chk01_DtlR upR : upLst) {
				List<String> key = new ArrayList<String>(Arrays.asList(upR.biz_key1(), upR.biz_key2()));
				Attach_Chk01_DtlR r = _billInfoMap.get(key);
				if(r == null) {
					_billInfoMap.put(key,upR);
				}
			}
		}
		protected Boolean isRePrntBill(BillHdrR hdrR) {
			List<String> list = new ArrayList<>();
			list.add(hdrR.bill_no());//no
			list.add(hdrR.bill_rev().toString());//rev
			
			if(_rePrntSet.contains(list)) {
				return true;
			}
			return false;
		}
		protected Map_Attach_Chk01_DtlR_BillHdrR<Attach_Chk01_DtlR, BillHdrR> createMap_Attach_Chk01_DtlR_BillHdrR() {
			return new Map_Attach_Chk01_DtlR_BillHdrR<Attach_Chk01_DtlR, BillHdrR>();
		}
		
		public class Map_Attach_Chk01_DtlR_BillHdrR<D extends Attach_Chk01_DtlR, S extends BillHdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Attach_Chk01_DtlR.$biz_key1, BillHdrR.$bill_no);//請求ＮＯ
				addColumnPathMap(Attach_Chk01_DtlR.$dt, BillHdrR.$bill_dt);//請求日
				addColumnPathMap(Attach_Chk01_DtlR.$bp_cd, BillHdrR.$bcst_cd);//請求先CD
				addColumnPathMap(Attach_Chk01_DtlR.$cur_cd, BillHdrR.$cur_cd);//通貨ＣＤ
				addColumnPathMap(Attach_Chk01_DtlR.$bcst_cd, BillHdrR.$bcst_cd);//請求先CD
				addColumnPathMap(Attach_Chk01_DtlR.$bill_dpt_cd, BillHdrR.$bill_dpt_cd);//部門ＣＤ
				addColumnPathMap(Attach_Chk01_DtlR.$wrk_no, BillHdrR.$wrk_no);//案件
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				dest.biz_typ(MAC_BIZ_TYP.BILL.value());//業務区分：請求
				dest.biz_key2(src.bill_rev().toString());//請求書改訂番号はNum→Str変換してセット
				dest.amt(src.bill_amt());//ご請求金額（請求額）
				dest.attach_file_flg(true);//ファイル添付フラグ
			}
		}
		
		/**
		 * 請求書発行時に保持している請求書の情報から請求先ＣＤを取得する（お買上明細からの呼出を想定）
		 * @param rs
		 * @param billNo
		 * @return 請求書が添付帳票登録サービス呼出対象であった場合は請求書.請求先ＣＤ、そうでなければEmpty
		 */
		protected String getBcstCd(MCReportSet rs, String billNo) {
			List<String> key = new ArrayList<String>(Arrays.asList(billNo, _prntKeyMap.get(billNo)));
			Attach_Chk01_DtlR billUp0 = _billInfoMap.get(key);
			return isNull(billUp0) ? "":billUp0.bp_cd();
		}

		protected void callSlsDtlAttachSrv(List<MCReportSet> rsList) {
			List<Attach_Chk01_DtlR> upLst = new ArrayList<Attach_Chk01_DtlR>(); 
			createSlsDtlAttachLst(rsList,upLst);
			
			if(upLst.isEmpty()) {
				return;
			}
			
			MBBCL_AttachService.Attach_Upd01 ope = MBBCL_AttachService.crtAttach_Upd01();
			setAttachUp(ope,upLst);
			ope.exec();
		}
		protected void createSlsDtlAttachLst(List<MCReportSet> rsList,List<Attach_Chk01_DtlR> upLst) {
			for(MCReportSet rs: rsList) {
				//reportSetから、ヘッダを取得する
				String bt = rs.getBlockType(SlsHdrR.create());
				
				@SuppressWarnings("unchecked")
				MCList<MCRow> hdrL = rs.getAll(bt);

				if (hdrL == null || hdrL.isEmpty()) {
					continue;
				}
				
				SlsHdrR hdrR = (SlsHdrR) hdrL.get(0);
				//再発行は登録サービス呼び出し対象外
				if(isRePrntSls(hdrR)) {
					continue;
				}
				editSlsDtlAttachLst(rs,hdrR,upLst);
			}
		}
		protected void editSlsDtlAttachLst(MCReportSet rs, SlsHdrR hdrR,List<Attach_Chk01_DtlR> upLst) {
			Attach_Chk01_DtlR up0 = Attach_Chk01_DtlR.create();
			//帳票IDと添付元ファイル以外の連携項目は請求書と同じ
			List<String> key = new ArrayList<String>(Arrays.asList(hdrR.bill_no(), _prntKeyMap.get(hdrR.bill_no())));
			Attach_Chk01_DtlR billUp0 = _billInfoMap.get(key);
			copy(up0, billUp0,createMap_Attach_Chk01_DtlR());
			//帳票ID
			up0.report_id(rs.getReportInfo().report_id());
			//添付元ファイル(バイナリ）
			up0.file_bin(rs.getReportInfo().save_file_bin());
			upLst.add(up0);
		}
		protected Boolean isRePrntSls(SlsHdrR hdrR) {
			List<String> list = new ArrayList<>();
			list.add(hdrR.bill_no());
			list.add(_prntKeyMap.get(hdrR.bill_no()));
			
			if(_rePrntSet.contains(list)) {
				return true;
			}
			return false;
		}
		protected Map_Attach_Chk01_DtlR<Attach_Chk01_DtlR, Attach_Chk01_DtlR> createMap_Attach_Chk01_DtlR() {
			return new Map_Attach_Chk01_DtlR<Attach_Chk01_DtlR, Attach_Chk01_DtlR>();
		}
		
		public class Map_Attach_Chk01_DtlR<D extends Attach_Chk01_DtlR, S extends Attach_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Attach_Chk01_DtlR.$biz_typ, Attach_Chk01_DtlR.$biz_typ);
				addColumnPathMap(Attach_Chk01_DtlR.$biz_key1, Attach_Chk01_DtlR.$biz_key1);
				addColumnPathMap(Attach_Chk01_DtlR.$biz_key2, Attach_Chk01_DtlR.$biz_key2);
				addColumnPathMap(Attach_Chk01_DtlR.$dt, Attach_Chk01_DtlR.$dt);
				addColumnPathMap(Attach_Chk01_DtlR.$bp_cd, Attach_Chk01_DtlR.$bp_cd);
				addColumnPathMap(Attach_Chk01_DtlR.$cur_cd, Attach_Chk01_DtlR.$cur_cd);
				addColumnPathMap(Attach_Chk01_DtlR.$amt, Attach_Chk01_DtlR.$amt);
				addColumnPathMap(Attach_Chk01_DtlR.$wg_cd, Attach_Chk01_DtlR.$wg_cd);
				addColumnPathMap(Attach_Chk01_DtlR.$bill_dpt_cd, Attach_Chk01_DtlR.$bill_dpt_cd);
				addColumnPathMap(Attach_Chk01_DtlR.$bcst_cd, Attach_Chk01_DtlR.$bcst_cd);
				addColumnPathMap(Attach_Chk01_DtlR.$wrk_no, Attach_Chk01_DtlR.$wrk_no);
				addColumnPathMap(Attach_Chk01_DtlR.$attach_file_flg,Attach_Chk01_DtlR.$attach_file_flg);
			}
		}
	}
	
	/**
	 * 繰越金額を表示するかどうかを判断する。
	 * 
	 * @param billHdrR 請求ヘッダー
	 * @return 繰越金額を表示する場合はtrue
	 */
	protected boolean isBfwBalDisp(Bill_Prnt01_HdrBaseR billHdrBaseR) {

		// 請求書前月残高表示が不要に設定されている場合は表示しない
		if (!billHdrBaseR.bfw_bal_disp_flg()) {
			return false;
		}

		// 都度請求の場合は表示しない
		if (billHdrBaseR.bill_each_sls_flg()) {
			return false;
		}
		
		return true;
	}
	/**
	 * 繰越金額を表示するかどうかを判断する。
	 * 
	 * @param billHdrR 請求ヘッダー
	 * @param billDtlL 請求明細
	 * @return 繰越金額を表示する場合はtrue
	 */
	protected boolean isBfwBalDisp(Bill_Prnt01_HdrBaseR billHdrBaseR, MCList<Bill_Prnt01_DtlBaseR> billDtlL) {

		if (!isBfwBalDisp(billHdrBaseR)) {
			return false;
		}

		// 前回請求がゼロで入金合計も振替もゼロの場合は表示しない
		if (billHdrBaseR.last_bill_amt().isZero()) {

			if (billDtlL.isEmpty()) {
				return false;
			}

			MCIndexKey key = billDtlL.createIndex(Bill_Prnt01_DtlBaseR.$ar_trd_grp_typ);
			MCIndexKey key2 = billDtlL.createIndex(Bill_Prnt01_DtlBaseR.$trd_ptn_typ);
			
			MCNumber rcvAmt = sumAmt(billDtlL, MAC_AR_TRD_GRP_TYP.RCV, key);
			MCNumber setoffAmt = sumAmt(billDtlL, MAC_AR_TRD_GRP_TYP.SETOFF, key);
			MCNumber swAmt = sumAmt(billDtlL, MAC_TRD_PTN_TYP.ARSW_OUT_BILL_BAL, key2)
					.add(sumAmt(billDtlL, MAC_TRD_PTN_TYP.ARSW_OUT_NOT_BILL_BAL, key2));

			if (rcvAmt.add(setoffAmt).isZero() && swAmt.isZero()) {
				return false;
			}
		}

		return true;
	}
	
	/**
	 * 振込口座を表示するかどうかを判断する。
	 * 
	 * @param rcvSchdL 入金予定
	 * @return 入金予定に振込が含まれる場合はtrue
	 */
	protected boolean isBankDisp(MCList<MST_RCV_SCHD_R> rcvSchdL) {
		
		MCIndexKey idxkey = rcvSchdL.createIndex(MST_RCV_SCHD_R.$rcv_typ);
		return rcvSchdL.contains(idxkey, MAC_AR_STTL_TYP.BANK.value());
	}
	
	/**
	 * 債権取引グループ区分に応じて金額を合計する。
	 * 
	 * @param billDtlL 請求明細
	 * @param grpTyp 債権取引グループ区分
	 * @param idxkey インデックスキー
	 * @return 合計金額
	 */
	protected MCNumber sumAmt(MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL, MAC_AR_TRD_GRP_TYP grpTyp, MCIndexKey idxkey) {

		if (billDtlBaseL.isEmpty()) {
			
			return MCNumber.ZERO;
		}

		MCNumber amt = billDtlBaseL.subList(idxkey, grpTyp.value()).sum(Bill_Prnt01_DtlBaseR.$trd_cur_amt);

		return nvl(amt, MCNumber.ZERO);
	}
	
	/**
	 * 取引パタン区分に応じて金額を合計する。
	 * 
	 * @param billDtlL 請求明細
	 * @param trdPtnTyp 取引パタン区分
	 * @param idxkey インデックスキー
	 * @return 合計金額
	 */
	protected MCNumber sumAmt(MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL, MAC_TRD_PTN_TYP trdPtnTyp, MCIndexKey idxkey) {

		if (billDtlBaseL.isEmpty()) {
			
			return MCNumber.ZERO;
		}

		MCNumber amt = billDtlBaseL.subList(idxkey, trdPtnTyp.value()).sum(Bill_Prnt01_DtlBaseR.$trd_cur_amt);

		return nvl(amt, MCNumber.ZERO);
	}
	/**
	 * 入金額を集計する
	 */
	protected MCNumber sumRcvAmt(MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL) {
		MCNumber amt = MCNumber.ZERO;
		for (Bill_Prnt01_DtlBaseR r :  billDtlBaseL) {
			// ユーティリティ内で符号をかけるので、元に戻すための符号
			MCNumber pm = MAC_TRD_PTN_TYP.ar_amt_pm(r.trd_ptn_typ());
			
			amt = amt.add(
				sum(
					MSBGL_ArUtil.getCashAmt(
						r.trd_ptn_typ(), r.ar_trd_grp_typ(), r.ar_sttl_typ1(),
						r.trd_cur_amt1(), r.trd_cur_amt2(), r.trd_cur_amt3()).multiply(pm),
					MSBGL_ArUtil.getNoteAmt(
						r.trd_ptn_typ(), r.ar_trd_grp_typ(), r.ar_sttl_typ1(),
						r.trd_cur_amt1(), r.trd_cur_amt2(), r.trd_cur_amt3()).multiply(pm),
					MSBGL_ArUtil.getXfrAmt(
						r.trd_ptn_typ(), r.ar_trd_grp_typ(), r.ar_sttl_typ1(),
						r.trd_cur_amt1(), r.trd_cur_amt2(), r.trd_cur_amt3()).multiply(pm)
				)
			);
		}
		return amt;
	}
	/**
	 * 相殺額を集計する
	 */
	protected MCNumber sumSetoffAmt(MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL) {
		MCNumber amt = MCNumber.ZERO;
		for (Bill_Prnt01_DtlBaseR r :  billDtlBaseL) {
			// ユーティリティ内で符号をかけるので、元に戻すための符号
			MCNumber pm = MAC_TRD_PTN_TYP.ar_amt_pm(r.trd_ptn_typ());
			
			amt = amt.add(
				MSBGL_ArUtil.getSetoffAmt(
					r.trd_ptn_typ(), r.ar_trd_grp_typ(),
					r.trd_cur_amt1(), r.trd_cur_amt2(), r.trd_cur_amt3()).multiply(pm)
			);
		}
		return amt;
	}
	/**
	 * 相殺税額を集計する
	 */
	protected MCNumber sumSetoffTaxAmt(MCList<Bill_Prnt01_DtlBaseR> billDtlBaseL) {
		MCNumber amt = MCNumber.ZERO;
		for (Bill_Prnt01_DtlBaseR r :  billDtlBaseL) {
			// ユーティリティ内で符号をかけるので、元に戻すための符号
			MCNumber pm = MAC_TRD_PTN_TYP.ar_amt_pm(r.trd_ptn_typ());
			
			amt = amt.add(
				MSBGL_ArUtil.getSetoffTaxAmt(
					r.trd_ptn_typ(), r.ar_trd_grp_typ(),
					r.trd_cur_tax_amt1(), r.trd_cur_tax_amt2(), r.trd_cur_tax_amt3(),
					getBillTaxDispFlg(r)).multiply(pm)
			);
		}
		return amt;
	}
	protected boolean getBillTaxDispFlg(Bill_Prnt01_DtlBaseR r) {
		if (MAC_AR_STTL_TYP.isSETOFF_DR(r.ar_sttl_typ1())) {
			return r.bill_tax_disp_flg1();
		}
		if (MAC_AR_STTL_TYP.isSETOFF_DR(r.ar_sttl_typ2())) {
			return r.bill_tax_disp_flg2();
		}
		return false;
	}
	/**
	 * 前受金が発生する取引かどうか判断する
	 */
	protected boolean isAdvTrdTyp(String trdTyp) {
		return MAC_TRD_PTN_TYP.isRCV_ADV(trdTyp)
				|| MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(trdTyp)
				|| MAC_TRD_PTN_TYP.isSETOFF_SUSP_ADV(trdTyp);
	}
	
	/**
	 * 指定されたカラムと行番号で連番のカラム名を返す。
	 * 
	 * @param columnNm カラム名
	 * @param no 連番
	 * @return カラム名の下一桁を除いて、連番を連結して文字列
	 */
	protected String getColumnNmByRowCnt(String columnNm, int no) {
		
		if (columnNm != null && columnNm.length() > 0) {
			
			columnNm = columnNm.substring(0, columnNm.length() - 1).concat(String.valueOf(no));
		}
		
		return columnNm;
	}
	
	protected Map_BillHdrR_Bill_Prnt01_HdrBaseR<BillHdrR,Bill_Prnt01_HdrBaseR> createMap_BillHdrR_Bill_Prnt01_HdrBaseR() {
		return new Map_BillHdrR_Bill_Prnt01_HdrBaseR<BillHdrR, Bill_Prnt01_HdrBaseR>();
	}

	public class Map_BillHdrR_Bill_Prnt01_HdrBaseR<D extends BillHdrR, S extends Bill_Prnt01_HdrBaseR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			
			addColumnPathMap(BillHdrR.$bill_no, Bill_Prnt01_HdrBaseR.$bill_no);
			addColumnPathMap(BillHdrR.$bill_rev, Bill_Prnt01_HdrBaseR.$bill_rev);
			addColumnPathMap(BillHdrR.$wrk_no, Bill_Prnt01_HdrBaseR.$wrk_no);
			addColumnPathMap(BillHdrR.$wrk_nm, Bill_Prnt01_HdrBaseR.$wrk_nm);
			addColumnPathMap(BillHdrR.$bcst_cd, Bill_Prnt01_HdrBaseR.$bcst_cd);
			addColumnPathMap(BillHdrR.$bill_zip_cd, Bill_Prnt01_HdrBaseR.$bill_zip_cd);
			addColumnPathMap(BillHdrR.$bill_addr1, Bill_Prnt01_HdrBaseR.$bill_addr1);
			addColumnPathMap(BillHdrR.$bill_addr2, Bill_Prnt01_HdrBaseR.$bill_addr2);
			addColumnPathMap(BillHdrR.$bill_addr3, Bill_Prnt01_HdrBaseR.$bill_addr3);
			addColumnPathMap(BillHdrR.$bill_addr4, Bill_Prnt01_HdrBaseR.$bill_addr4);
			addColumnPathMap(BillHdrR.$bill_bcst_nm, Bill_Prnt01_HdrBaseR.$bill_bcst_nm);
			addColumnPathMap(BillHdrR.$bill_bcst_dpt, Bill_Prnt01_HdrBaseR.$bill_bcst_dpt);
			addColumnPathMap(BillHdrR.$bill_bcst_psn, Bill_Prnt01_HdrBaseR.$bill_bcst_psn);
			addColumnPathMap(BillHdrR.$bill_bcst_psn_title, Bill_Prnt01_HdrBaseR.$bill_bcst_psn_title);
			addColumnPathMap(BillHdrR.$bill_tel, Bill_Prnt01_HdrBaseR.$bill_tel);
			addColumnPathMap(BillHdrR.$bill_dpt_cd, Bill_Prnt01_HdrBaseR.$bill_dpt_cd);
			addColumnPathMap(BillHdrR.$co_nm, Bill_Prnt01_HdrBaseR.$co_nm);
			addColumnPathMap(BillHdrR.$dpt_nm, Bill_Prnt01_HdrBaseR.$dpt_nm);
			addColumnPathMap(BillHdrR.$dpt_tel, Bill_Prnt01_HdrBaseR.$dpt_tel);
			addColumnPathMap(BillHdrR.$bill_amt, Bill_Prnt01_HdrBaseR.$bill_amt);
			addColumnPathMap(BillHdrR.$cur_cd, Bill_Prnt01_HdrBaseR.$cur_cd);
			addColumnPathMap(BillHdrR.$cur_nm, Bill_Prnt01_HdrBaseR.$cur_nm);
			addColumnPathMap(BillHdrR.$last_bill_amt, Bill_Prnt01_HdrBaseR.$last_bill_amt);
			addColumnPathMap(BillHdrR.$rcv_amt, Bill_Prnt01_HdrBaseR.$rcv_amt);
			addColumnPathMap(BillHdrR.$setoff_amt, Bill_Prnt01_HdrBaseR.$setoff_amt);
			addColumnPathMap(BillHdrR.$sw_amt, Bill_Prnt01_HdrBaseR.$sw_amt);
			addColumnPathMap(BillHdrR.$bfw_amt, Bill_Prnt01_HdrBaseR.$bfw_amt);
			addColumnPathMap(BillHdrR.$sls_amt, Bill_Prnt01_HdrBaseR.$sls_amt);
			addColumnPathMap(BillHdrR.$dscnt_amt, Bill_Prnt01_HdrBaseR.$dscnt_amt);
			addColumnPathMap(BillHdrR.$ret_amt, Bill_Prnt01_HdrBaseR.$ret_amt);
			addColumnPathMap(BillHdrR.$tax_amt, Bill_Prnt01_HdrBaseR.$tax_amt);
			addColumnPathMap(BillHdrR.$sw_to_amt, Bill_Prnt01_HdrBaseR.$sw_to_amt);
			addColumnPathMap(BillHdrR.$rcv_bank_ac_cd, Bill_Prnt01_HdrBaseR.$rcv_bank_ac_cd);
			addColumnPathMap(BillHdrR.$bank_cd, Bill_Prnt01_HdrBaseR.$bank_cd);
			addColumnPathMap(BillHdrR.$bank_nm, Bill_Prnt01_HdrBaseR.$bank_nm);
			addColumnPathMap(BillHdrR.$bank_ac_cd, Bill_Prnt01_HdrBaseR.$bank_ac_cd);
			addColumnPathMap(BillHdrR.$bank_ac_nm, Bill_Prnt01_HdrBaseR.$bank_ac_nm);
			addColumnPathMap(BillHdrR.$bank_ac_typ, Bill_Prnt01_HdrBaseR.$bank_ac_typ);
			addColumnPathMap(BillHdrR.$bank_ac_typ_nm, Bill_Prnt01_HdrBaseR.$bank_ac_typ_nm);
			addColumnPathMap(BillHdrR.$bank_ac_no, Bill_Prnt01_HdrBaseR.$bank_ac_no);
			addColumnPathMap(BillHdrR.$bank_ac_holder, Bill_Prnt01_HdrBaseR.$bank_ac_holder);
			addColumnPathMap(BillHdrR.$bill_dtl_outp_flg, Bill_Prnt01_HdrBaseR.$bill_dtl_outp_flg);
			addColumnPathMap(BillHdrR.$sub_char1, Bill_Prnt01_HdrBaseR.$sub_char1);
			addColumnPathMap(BillHdrR.$sub_char2, Bill_Prnt01_HdrBaseR.$sub_char2);
			addColumnPathMap(BillHdrR.$sub_char3, Bill_Prnt01_HdrBaseR.$sub_char3);
			addColumnPathMap(BillHdrR.$bill_cntry_nm, "bill_cntry_nm");
			addColumnPathMap(BillHdrR.$cntry_nm, "cntry_nm");

		}
		
		@Override
		public void valueCopy(D dest, S src) {
			dest.setStringNE("bill_mng_no", src.bill_mng_no());
			if (!isSame(src.cur_cd(), getBaseCur().cur_cd())) {
				dest.base_cur_cd(getBaseCur().cur_cd());
				dest.base_cur_nm(getBaseCur().cur_nm());
				dest.bill_xrate(src.bill_xrate());
			}
		}
	}
	
	protected Map_BillDtlR_Bill_Prnt01_DtlBaseR<BillDtlR,Bill_Prnt01_DtlBaseR> createMap_BillDtlR_Bill_Prnt01_DtlBaseR() {
		return new Map_BillDtlR_Bill_Prnt01_DtlBaseR<BillDtlR, Bill_Prnt01_DtlBaseR>();
	}

	public class Map_BillDtlR_Bill_Prnt01_DtlBaseR<D extends BillDtlR, S extends Bill_Prnt01_DtlBaseR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(BillDtlR.$dlv_dt, Bill_Prnt01_DtlBaseR.$dlv_dt);
			addColumnPathMap(BillDtlR.$base_sls_ac_dt, Bill_Prnt01_DtlBaseR.$base_sls_ac_dt);
			addColumnPathMap(BillDtlR.$dlv_slip_no, Bill_Prnt01_DtlBaseR.$dlv_slip_no);
			addColumnPathMap(BillDtlR.$dlv_slip_d_no, Bill_Prnt01_DtlBaseR.$dlv_slip_d_no);
			addColumnPathMap(BillDtlR.$ship_dlv_slip_no, Bill_Prnt01_DtlBaseR.$ship_dlv_slip_no);
			addColumnPathMap(BillDtlR.$ship_dlv_slip_d_no, Bill_Prnt01_DtlBaseR.$ship_dlv_slip_d_no);
			addColumnPathMap(BillDtlR.$ship_dlv_slip_multi_flg, Bill_Prnt01_DtlBaseR.$ship_dlv_slip_multi_flg);
			addColumnPathMap(BillDtlR.$act_no, Bill_Prnt01_DtlBaseR.$act_no);
			addColumnPathMap(BillDtlR.$act_rev, Bill_Prnt01_DtlBaseR.$act_rev);
			addColumnPathMap(BillDtlR.$act_d_no, Bill_Prnt01_DtlBaseR.$act_d_no);
			addColumnPathMap(BillDtlR.$slip_sts_typ, Bill_Prnt01_DtlBaseR.$slip_sts_typ);
			addColumnPathMap(BillDtlR.$itm_cd, Bill_Prnt01_DtlBaseR.$itm_cd);
			addColumnPathMap(BillDtlR.$itm_sub1_data, Bill_Prnt01_DtlBaseR.$itm_sub1);
			addColumnPathMap(BillDtlR.$itm_sub2_data, Bill_Prnt01_DtlBaseR.$itm_sub2);
			addColumnPathMap(BillDtlR.$itm_sub3_data, Bill_Prnt01_DtlBaseR.$itm_sub3);
			addColumnPathMap(BillDtlR.$cst_itm_cd, Bill_Prnt01_DtlBaseR.$cst_itm_cd);
			addColumnPathMap(BillDtlR.$itm_nm, Bill_Prnt01_DtlBaseR.$itm_nm);
			addColumnPathMap(BillDtlR.$itm_alt_nm1, Bill_Prnt01_DtlBaseR.$itm_alt_nm1);
			addColumnPathMap(BillDtlR.$itm_alt_nm2, Bill_Prnt01_DtlBaseR.$itm_alt_nm2);
			addColumnPathMap(BillDtlR.$itm_alt_nm3, Bill_Prnt01_DtlBaseR.$itm_alt_nm3);
			addColumnPathMap(BillDtlR.$itm_alt_nm4, Bill_Prnt01_DtlBaseR.$itm_alt_nm4);
			addColumnPathMap(BillDtlR.$cst_itm_nm, Bill_Prnt01_DtlBaseR.$cst_itm_nm);
			addColumnPathMap(BillDtlR.$trd_cd, Bill_Prnt01_DtlBaseR.$trd_cd);
			addColumnPathMap(BillDtlR.$trd_nm, Bill_Prnt01_DtlBaseR.$trd_nm);
			addColumnPathMap(BillDtlR.$trd_unit_qty, Bill_Prnt01_DtlBaseR.$trd_unit_qty);
			addColumnPathMap(BillDtlR.$trd_unit_cd, Bill_Prnt01_DtlBaseR.$trd_unit_cd);
			addColumnPathMap(BillDtlR.$unit_nm, Bill_Prnt01_DtlBaseR.$unit_nm);
			addColumnPathMap(BillDtlR.$trd_cur_upri, Bill_Prnt01_DtlBaseR.$trd_cur_upri);
			addColumnPathMap(BillDtlR.$inc_tax_flg, Bill_Prnt01_DtlBaseR.$inc_tax_flg);
			addColumnPathMap(BillDtlR.$interim_flg, Bill_Prnt01_DtlBaseR.$interim_flg);
			addColumnPathMap(BillDtlR.$trd_cur_amt, Bill_Prnt01_DtlBaseR.$trd_cur_amt);
			addColumnPathMap(BillDtlR.$trd_cur_tax_amt, Bill_Prnt01_DtlBaseR.$trd_cur_tax_amt);
			addColumnPathMap(BillDtlR.$tax_rate, Bill_Prnt01_DtlBaseR.$tax_rate);
			addColumnPathMap(BillDtlR.$trd_d_rmrks, Bill_Prnt01_DtlBaseR.$trd_d_rmrks);
			addColumnPathMap(BillDtlR.$d_sub_char1, Bill_Prnt01_DtlBaseR.$d_sub_char1);
			addColumnPathMap(BillDtlR.$d_sub_char2, Bill_Prnt01_DtlBaseR.$d_sub_char2);
			addColumnPathMap(BillDtlR.$d_sub_char3, Bill_Prnt01_DtlBaseR.$d_sub_char3);
			addColumnPathMap(BillDtlR.$tax_cd, Bill_Prnt01_DtlBaseR.$tax_cd);
			addColumnPathMap(BillDtlR.$tax_nm, Bill_Prnt01_DtlBaseR.$tax_nm);
		}
		
		@Override
		public void valueCopy(D dest, S src) {
			if (!src.trd_cur_dscnt_amt().isZero()) {
				dest.trd_cur_dscnt_amt(src.trd_cur_dscnt_amt());
			}
		}
	}
	
	protected Map_SlsHdrR_Bill_Prnt01_HdrBaseR<SlsHdrR,Bill_Prnt01_HdrBaseR> createMap_SlsHdrR_Bill_Prnt01_HdrBaseR() {
		return new Map_SlsHdrR_Bill_Prnt01_HdrBaseR<SlsHdrR, Bill_Prnt01_HdrBaseR>();
	}

	public class Map_SlsHdrR_Bill_Prnt01_HdrBaseR<D extends SlsHdrR, S extends Bill_Prnt01_HdrBaseR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SlsHdrR.$bill_no, Bill_Prnt01_HdrBaseR.$bill_no);
			addColumnPathMap(SlsHdrR.$wrk_no, Bill_Prnt01_HdrBaseR.$wrk_no);
			addColumnPathMap(SlsHdrR.$wrk_nm, Bill_Prnt01_HdrBaseR.$wrk_nm);
			addColumnPathMap(SlsHdrR.$bill_dpt_cd, Bill_Prnt01_HdrBaseR.$bill_dpt_cd);
			addColumnPathMap(SlsHdrR.$co_nm, Bill_Prnt01_HdrBaseR.$co_nm);
			addColumnPathMap(SlsHdrR.$dpt_nm, Bill_Prnt01_HdrBaseR.$dpt_nm);
			addColumnPathMap(SlsHdrR.$dpt_tel, Bill_Prnt01_HdrBaseR.$dpt_tel);
			addColumnPathMap(SlsHdrR.$bill_amt, Bill_Prnt01_HdrBaseR.$bill_amt);
			addColumnPathMap(SlsHdrR.$cur_cd, Bill_Prnt01_HdrBaseR.$cur_cd);
			addColumnPathMap(SlsHdrR.$cur_nm, Bill_Prnt01_HdrBaseR.$cur_nm);
			addColumnPathMap(SlsHdrR.$sls_amt, Bill_Prnt01_HdrBaseR.$sls_amt);
			addColumnPathMap(SlsHdrR.$dscnt_amt, Bill_Prnt01_HdrBaseR.$dscnt_amt);
			addColumnPathMap(SlsHdrR.$ret_amt, Bill_Prnt01_HdrBaseR.$ret_amt);
			addColumnPathMap(SlsHdrR.$tax_amt, Bill_Prnt01_HdrBaseR.$tax_amt);
			addColumnPathMap(SlsHdrR.$sub_char1, Bill_Prnt01_HdrBaseR.$sub_char1);
			addColumnPathMap(SlsHdrR.$sub_char2, Bill_Prnt01_HdrBaseR.$sub_char2);
			addColumnPathMap(SlsHdrR.$sub_char3, Bill_Prnt01_HdrBaseR.$sub_char3);
			addColumnPathMap(SlsHdrR.$bp_cntry_nm, "bp_cntry_nm");
			addColumnPathMap(SlsHdrR.$cntry_nm, "cntry_nm");

		}
	}
	/**
	 * 再発行の帳票情報をセットに追加する
	 */
	protected void addReprntSetKey(Set<List<String>> tgtSet,Bill_Prnt01_HdrBaseR hdrR) {
		List<String> keyLst = createReprntSetKey(hdrR);
		if(!tgtSet.contains(keyLst)) {
			tgtSet.add(keyLst);
		}
	}
	protected List<String> createReprntSetKey(Bill_Prnt01_HdrBaseR hdrR){
		List<String> list = new ArrayList<>();
		if (!isNull(hdrR)) {
			list.add(hdrR.bill_no());//no
			list.add(hdrR.bill_rev().toString());//rev
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