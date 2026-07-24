package mcframe.serverMSBB.MSBBL6040;

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
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.commonCore.report.MCFileWriteListener;
import mcframe.commonCore.report.MCReportFile;
import mcframe.commonCore.report.MCUCXSingleFile;
import mcframe.serverCore.report.MCServerReportManager;
import mcframe.commonMSBB.MSBBR0010.*;
import java.util.*;
import mcframe.commonMSBB.MSBBR0010.MSBBR_Qtn;
import mcframe.commonMSBB.MSBBR0020.MSBBR_ExQtn;
import static mcframe.serverCore.dbc.CoreFunction.*;
import java.util.Map.*;
import mcframe.serverMSUC.MSUCL0120.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.serverMBBC.MBBCL5020.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBL_QtnPrntService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBL_QtnPrntService_MC extends MSBBL_QtnPrntService_MC_A{
	//FMCB CUSTOM START
	public static final Class<MSBBL_QtnPrntService> CLAZZ = MSBBL_QtnPrntService.class;
	/**
	 * Qtn_Prnt01オペレーション.<p>
	 *
	 */
	public class Qtn_Prnt01 extends MSBBL_QtnPrntService_MC_A.Qtn_Prnt01 {
		/** 見積書ReportSetマップ */
		protected Map<List<String>, List<MSBBR_Qtn>> _qtnReportMap;
		/** 再発行用見積書Reportマップ */
		protected Map<List<String>, MCReportInfoR> _qtnReportReprntMap;
		/** 国外見積書ReportSetマップ */
		protected Map<List<String>, List<MSBBR_ExQtn>> _exQtnReportMap;
		/** 再発行用国外見積書Reportマップ */
		protected Map<List<String>, MCReportInfoR> _exQtnReportReprntMap;
		/** 再発行する見積書キーのセット*/
		protected Set<List<String>> _rePrntQtnSet;
		protected MCList<BpUtil_Sprt01_DtlR> _bpUtil = MCList.create(BpUtil_Sprt01_DtlR.class);
		protected MCIndexKey _bpUtilkey;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			initVariable();
			MCList<Qtn_Prnt01_HdrR> okList = chkQtn();
			prnt(okList);
		}
		
		/**
		 * 変数の初期化
		 */
		protected void initVariable() {

			_qtnReportMap = new LinkedHashMap<List<String>, List<MSBBR_Qtn>>();
			_qtnReportReprntMap = new LinkedHashMap<List<String>, MCReportInfoR>();
			_exQtnReportMap = new LinkedHashMap<List<String>, List<MSBBR_ExQtn>>();
			_exQtnReportReprntMap = new LinkedHashMap<List<String>, MCReportInfoR>();
			_rePrntQtnSet = new HashSet<List<String>>();
		}

		/**
		 * 見積書を発行する
		 * 
		 * @param okList
		 */
		protected void prnt (MCList<Qtn_Prnt01_HdrR> okList) {

			for (Qtn_Prnt01_HdrR r : okList) {

				MCReportSet reportSet;
				if (r.cst_iv_flg()) {
					reportSet = MSBBR_ExQtn.create();
				}
				else {
					reportSet = MSBBR_Qtn.create();
				}

				if (r.qtn_prnt_flg()) {

					// 業務情報
					reportSet.setAppReportNo1(r.qtn_no());
					reportSet.setAppReportNo2(r.qtn_rev().toString());
					reportSet.setAppReportNo3(r.qtn_prnt_seq().toString());
					reportSet.setLocale(toLocaleFromLclCd(r.prnt_lcl_cd()));

					// 印刷データからデータを取得
					MCList<MCReportInfoR> infoL = MCServerReportManager.searchPrintData(reportSet, false);
					if (infoL == null || infoL.isEmpty()) {
						continue;
					}
					// 複数ある場合、最新のデータで印刷する
					infoL.sort(SortType.DESC, MCReportInfoR.$print_seq);
					
					// ヘッダ・フッタ情報の取得
					MST_QTN_R hdrFtr = srchHdrFtr(r);
					if (hdrFtr.isEmpty()) {
						continue;
					}
					
					setReRptMap(r, hdrFtr, infoL);
					//再発行する見積書のキーを追加
					addReprntSetKey(_rePrntQtnSet, hdrFtr);
				}
				else {
					// ヘッダ・フッタ情報の取得
					MST_QTN_R hdrFtr = srchHdrFtr(r);
					if (hdrFtr.isEmpty()) {
						continue;
					}

					// 明細情報の取得
					MCList<MST_QTN_D_R> dtl = srchDtl(hdrFtr);
					if (dtl.isEmpty()) {
						continue;
					}
					
					for (MST_QTN_D_R dtlR : dtl) {
						if (dtlR.getBooleanNE("dscnt_itm_flg")) {
							// 値引品目は単価/金額/税額の符号反転
							dtlR.trd_cur_upri(dtlR.trd_cur_upri().negate());
							dtlR.trd_cur_amt(dtlR.trd_cur_amt().negate());
							dtlR.trd_cur_tax_amt(dtlR.trd_cur_tax_amt().negate());
							dtlR.trd_cur_std_sls_upri(dtlR.trd_cur_std_sls_upri().negate());
							dtlR.trd_cur_std_sls_amt(dtlR.trd_cur_std_sls_amt().negate());
						}
					}
					
					// ヘッダの値コピー
					QtnHdrR prntHdr = QtnHdrR.create();
					copy(prntHdr, hdrFtr, createMap_QtnHdrR_MST_QTN_R());

					// 合計金額の計算
					prntHdr.ttl_trd_cur_amt(dtl.sum(MST_QTN_D_R.$trd_cur_amt));
					prntHdr.ttl_trd_cur_tax_amt(dtl.sum(MST_QTN_D_R.$trd_cur_tax_amt));

					// 明細の値コピー
					MCList<QtnDtlR> prntDtl = MCList.create(QtnDtlR.class);
					addAll(prntDtl, dtl, createMap_QtnDtlR_MST_QTN_D_R());

					//　値の設定
					setData(reportSet, hdrFtr, dtl, prntHdr, prntDtl);

					reportSet.setLocale(toLocaleFromLclCd(r.prnt_lcl_cd()));

					// 印刷データ作成
					if (0 < reportSet.size()) {
						setNewRptMap(r, reportSet);
						MCServerReportManager.request(reportSet, false);
						// 更新処理
						updQtn(r);
						
					}
				}

			}
			
			// 発行処理
			prnt();
		}
		
		/**
		 * 新規発行情報をマップに設定する
		 */
		protected void setNewRptMap(Qtn_Prnt01_HdrR r, MCReportSet reportSet) {

			if (r.cst_iv_flg()) {
				MSBBR_ExQtn rs = MSBBR_ExQtn.create();
				rs.addAll(reportSet.getAll());
				rs.setAppToCd1(reportSet.getAppToCd1());
				rs.setAppReportNo1(reportSet.getAppReportNo1());
				rs.setAppReportNo2(reportSet.getAppReportNo2());
				rs.setLocale(toLocaleFromLclCd(r.prnt_lcl_cd()));
				
				List<MSBBR_ExQtn> l = _exQtnReportMap.get(Arrays.asList(new String[] {r.qtn_no(), r.qtn_rev().toString()}));
				if (null == l) {
					l = new ArrayList<MSBBR_ExQtn>(Arrays.asList(new MSBBR_ExQtn[] {rs}));
				}
				else {
					l.add(rs);
				}
				_exQtnReportMap.put(Arrays.asList(new String[] {r.qtn_no(), r.qtn_rev().toString()}), l);
			}
			else {
				MSBBR_Qtn rs = MSBBR_Qtn.create();
				rs.addAll(reportSet.getAll());
				rs.setAppToCd1(reportSet.getAppToCd1());
				rs.setAppReportNo1(reportSet.getAppReportNo1());
				rs.setAppReportNo2(reportSet.getAppReportNo2());
				rs.setLocale(toLocaleFromLclCd(r.prnt_lcl_cd()));
				
				List<MSBBR_Qtn> l = _qtnReportMap.get(Arrays.asList(new String[] {r.qtn_no(), r.qtn_rev().toString()}));
				if (null == l) {
					l = new ArrayList<MSBBR_Qtn>(Arrays.asList(new MSBBR_Qtn[] {rs}));
				}
				else {
					l.add(rs);
				}
				_qtnReportMap.put(Arrays.asList(new String[] {r.qtn_no(), r.qtn_rev().toString()}), l);
			}
		}
		
		/**
		 * 再発行情報をマップに設定する
		 */
		protected void setReRptMap(Qtn_Prnt01_HdrR r, MST_QTN_R hdrFtr, MCList<MCReportInfoR> infoL) {

			if (r.cst_iv_flg()) {
				MSBBR_ExQtn repSetNew = (MSBBR_ExQtn) MCServerReportManager.toReportSet(infoL.get(0));
				List<MSBBR_ExQtn> l = _exQtnReportMap.get(Arrays.asList(new String[] {hdrFtr.qtn_no(), hdrFtr.qtn_rev().toString()}));
				if (null == l) {
					l = new ArrayList<MSBBR_ExQtn>(Arrays.asList(new MSBBR_ExQtn[] {repSetNew}));
				}
				else {
					l.add(repSetNew);
				}
				_exQtnReportReprntMap.put(Arrays.asList(new String[] {hdrFtr.qtn_no(), hdrFtr.qtn_rev().toString()}), infoL.get(0));
				_exQtnReportMap.put(Arrays.asList(new String[] {hdrFtr.qtn_no(), hdrFtr.qtn_rev().toString()}), l);
			}
			else {
				MSBBR_Qtn repSetNew = (MSBBR_Qtn) MCServerReportManager.toReportSet(infoL.get(0));
				List<MSBBR_Qtn> l = _qtnReportMap.get(Arrays.asList(new String[] {hdrFtr.qtn_no(), hdrFtr.qtn_rev().toString()}));
				if (null == l) {
					l = new ArrayList<MSBBR_Qtn>(Arrays.asList(new MSBBR_Qtn[] {repSetNew}));
				}
				else {
					l.add(repSetNew);
				}
				_qtnReportReprntMap.put(Arrays.asList(new String[] {hdrFtr.qtn_no(), hdrFtr.qtn_rev().toString()}), infoL.get(0));
				_qtnReportMap.put(Arrays.asList(new String[] {hdrFtr.qtn_no(), hdrFtr.qtn_rev().toString()}), l);
			}
		}
		/**
		 * 見積書が発行可能かをチェックし、発行可能な上り電文の行を返す。
		 * 
		 * @return
		 */
		protected MCList<Qtn_Prnt01_HdrR> chkQtn() {

			MCList<MST_QTN_R> chkL = lockQtn();
			MCIndexKey ik = chkL.createIndex(MST_QTN_R.$qtn_no, MST_QTN_R.$qtn_rev);

			MCList<Qtn_Prnt01_HdrR> okList = MCList.create(Qtn_Prnt01_HdrR.class);

			for (Qtn_Prnt01_HdrR up : up0()) {

				MST_QTN_R chkR = chkL.getFirst(ik, up.qtn_no(), up.qtn_rev());
				MCMessageList msgList = new MCMessageList();

				if (chkR == null) {
					msgList.addAll(getRecordNotFoundMsg(
							"MS",
							"MST_QTN",
							new String[]{MST_QTN_R.$qtn_no, MST_QTN_R.$qtn_rev},
							new Comparable[]{up.qtn_no(), up.qtn_rev()}, up));
				}
				else {
					// 見積状況チェック
					if (MSC_QTN_TYP.isCREATING(chkR.qtn_typ())) {
						msgList.add(new MCMessage(up, null, MSBBL0044, up.qtn_no(), up.qtn_rev()));
					}

					// 承認状況チェック
					if (chkR.aprv_flg() && !MAC_APRV_STS_TYP.isACPT(chkR.aprv_sts_typ())) {
						msgList.add(new MCMessage(up, null, MSBBL0045, up.qtn_no(), up.qtn_rev()));
					}

					// 取消チェック
					if (chkR.can_flg()) {
						msgList.add(new MCMessage(up, null, MSBBL0046, up.qtn_no(), up.qtn_rev()));
					}
				}

				if (msgList.isEmpty()) {
					up.qtn_prnt_flg(chkR.qtn_prnt_flg());
					up.cst_iv_flg(chkR.getBooleanNE("cst_iv_flg"));
					up.prnt_lcl_cd(chkR.getStringNE("prnt_lcl_cd"));

					okList.add(up);
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
		 * 見積ヘッダをロックする
		 * 
		 * @return
		 */
		protected MCList<MST_QTN_R> lockQtn() {

			up0().sort(Qtn_Prnt01_HdrR.$qtn_no, Qtn_Prnt01_HdrR.$qtn_rev);

			MAM_BP_R m1 = MAM_BP_R.create("M1");
			MCList<MST_QTN_R> chkL = MCList.create(MST_QTN_R.class);
			MST_QTN_R t = MST_QTN_R.create("T");
			MCQueryApiBuilder chkL_bldr = MCQueryApiBuilder.create(t);
			chkL.addBooleanColumn("cst_iv_flg");
			chkL_bldr.addSelect(m1.cst_iv_flg);
			chkL_bldr.addSelect(m1.prnt_lcl_cd);
			chkL_bldr.addLeftOuterJoin(m1, t.cst_cd.eq(m1.bp_cd));
			chkL_bldr.setLockTable(t.qtn_no);
			chkL_bldr.setOrderByAsc(chkL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectKeyForUpdate("MSBBL6040_MST_QTN_S01", chkL, chkL_bldr, up0());
			return chkL;
		}

		/**
		 * 見積ヘッダを検索する
		 * 
		 * @param r
		 * @return
		 */
		protected MST_QTN_R srchHdrFtr(Qtn_Prnt01_HdrR r) {
			MST_QTN_R hdrFtr = MST_QTN_R.create();
			hdrFtr.addStringColumn("bp_alt_nm1");
			hdrFtr.addStringColumn("bp_alt_nm2");
			hdrFtr.addStringColumn("bp_alt_nm3");
			hdrFtr.addStringColumn("bp_alt_nm4");

			MST_QTN_R t = MST_QTN_R.create("T");
			MCQueryApiBuilder hdrFtr_bldr = MCQueryApiBuilder.create(t);
			hdrFtr_bldr.setWhere(t.qtn_no.eq(bind("1")), r.qtn_no());
			hdrFtr_bldr.addWhereWithAnd(t.qtn_rev.eq(bind("1")), r.qtn_rev());

			hdrFtr_bldr.setSelect(
					t.qtn_no,
					t.qtn_rev,
					t.trd_cd,
					t.cst_cd,
					t.cst_zip_cd,
					t.cst_addr1,
					t.cst_addr2,
					t.cst_addr3,
					t.cst_addr4,
					t.cst_cntct_dpt,
					t.cst_cntct_psn,
					t.cst_tel,
					t.cst_fax,
					t.qtn_prnt_dt,
					t.sls_dpt_cd,
					t.sls_usr_cd,
					t.trd_cur_cd,
					t.wrk_no,
					t.qtn_dt,
					t.valid_dt,
					t.sub_char1,
					t.sub_char2,
					t.sub_char3,
					t.trnspt_cd,
					t.tterm_cd1,
					t.tterm_cd2,
					t.tterm_cd3,
					t.tterm_rmrks1,
					t.tterm_rmrks2,
					t.tterm_rmrks3,
					t.qtn_term_cd,
					t.qtn_rmrks,
					t.qtn_prnt_seq);

			MAM_BP_R m1 = MAM_BP_R.create("M1");
			// 得意先
			MAM_BP_LCL_R m2 = MAM_BP_LCL_R.create("M2");
			hdrFtr_bldr.addLeftOuterJoin(m1, t.cst_cd.eq(m1.bp_cd));
			hdrFtr_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR(t.cst_cd, t.qtn_dt,
					value(MAC_BP_ADDR_TYP.CST_CNTCT_PSN_TITLE.value()))
							.as("cst_cntct_psn_title"));
			hdrFtr_bldr.addSelect(m1.prnt_lcl_cd);

			hdrFtr_bldr.addLeftOuterJoin(m2,
					t.cst_cd.eq(m2.bp_cd)
					.and(m1.prnt_lcl_cd.eq(m2.lcl_cd)));
			hdrFtr_bldr.addSelect(nvl(t.cst_nm, nvl(m2.bp_nm, m1.bp_nm)).as("cst_nm"));
			hdrFtr_bldr.addSelect(m1.bp_alt_nm1);
			hdrFtr_bldr.addSelect(m1.bp_alt_nm2);
			hdrFtr_bldr.addSelect(m1.bp_alt_nm3);
			hdrFtr_bldr.addSelect(m1.bp_alt_nm4);

			// 部門
			MAM_DPT_LCL_R m3 = MAM_DPT_LCL_R.create("M3");
			hdrFtr_bldr.addLeftOuterJoin(m3,
					t.sls_dpt_cd.eq(m3.dpt_cd)
					.and(t.qtn_dt.between(m3.st_dt, m3.end_dt))
					.and(m1.prnt_lcl_cd.eq(m3.lcl_cd)));
			hdrFtr_bldr.addSelect(m3.dpt_nm.as("sls_dpt_nm"));
			hdrFtr_bldr.addSelect(m3.zip_cd.as("sls_dpt_zip_cd"));
			hdrFtr_bldr.addSelect(m3.addr1.as("sls_dpt_addr1"));
			hdrFtr_bldr.addSelect(m3.addr2.as("sls_dpt_addr2"));
			hdrFtr_bldr.addSelect(m3.addr3.as("sls_dpt_addr3"));
			hdrFtr_bldr.addSelect(m3.addr4.as("sls_dpt_addr4"));
			hdrFtr_bldr.addSelect(m3.tel.as("sls_dpt_tel"));
			hdrFtr_bldr.addSelect(m3.fax.as("sls_dpt_fax"));

			// 自社
			hdrFtr_bldr.addSelect(FCPA_CO$F_GET_CO_NM1(m1.prnt_lcl_cd).as("co_nm"));

			// 担当者
			MAM_USR_R usr = MAM_USR_R.create("USR");
			MAM_USR_LCL_R m4 = MAM_USR_LCL_R.create("M4");
			hdrFtr_bldr.addLeftOuterJoin(usr, t.sls_usr_cd.eq(usr.usr_cd));
			hdrFtr_bldr.addLeftOuterJoin(m4,
					t.sls_usr_cd.eq(m4.usr_cd)
					.and(m1.prnt_lcl_cd.eq(m4.lcl_cd)));
			hdrFtr_bldr.addSelect(nvl(m4.usr_nm, usr.usr_nm).as("sls_usr_nm"));

			// 通貨
			MAM_CUR_R m5 = MAM_CUR_R.create("M5");
			MAM_CUR_LCL_R m6 = MAM_CUR_LCL_R.create("M6");
			hdrFtr_bldr.addLeftOuterJoin(m5, t.trd_cur_cd.eq(m5.cur_cd));
			hdrFtr_bldr.addSelect(m5.amt_dec_place);
			hdrFtr_bldr.addSelect(m5.upri_dec_place);

			hdrFtr_bldr.addLeftOuterJoin(m6,
					t.trd_cur_cd.eq(m6.cur_cd)
					.and(m1.prnt_lcl_cd.eq(m6.lcl_cd)));
			hdrFtr_bldr.addSelect(nvl(m6.cur_nm, m5.cur_nm).as("trd_cur_nm"));

			// 案件
			MST_WRK_R t1 = MST_WRK_R.create("T1");
			hdrFtr_bldr.addLeftOuterJoin(t1, t.wrk_no.eq(t1.wrk_no));
			hdrFtr_bldr.addSelect(t1.wrk_nm);

			// 輸送方法
			MAM_TRNSPT_R trnspt = MAM_TRNSPT_R.create("TRNSPT");
			MAM_TRNSPT_LCL_R m7 = MAM_TRNSPT_LCL_R.create("M7");
			hdrFtr_bldr.addLeftOuterJoin(trnspt, t.trnspt_cd.eq(trnspt.trnspt_cd));
			hdrFtr_bldr.addLeftOuterJoin(m7,
					t.trnspt_cd.eq(m7.trnspt_cd)
					.and(m1.prnt_lcl_cd.eq(m7.lcl_cd)));
			hdrFtr_bldr.addSelect(nvl(m7.trnspt_nm, trnspt.trnspt_nm).as("trnspt_nm"));

			// 取引条件１
			MAM_TTERM_R tterm1 = MAM_TTERM_R.create("TTERM1");
			MAM_TTERM_LCL_R m8 = MAM_TTERM_LCL_R.create("M8");
			hdrFtr_bldr.addLeftOuterJoin(tterm1, t.tterm_cd1.eq(tterm1.tterm_cd));
			hdrFtr_bldr.addLeftOuterJoin(m8,
					t.tterm_cd1.eq(m8.tterm_cd)
					.and(m1.prnt_lcl_cd.eq(m8.lcl_cd)));
			hdrFtr_bldr.addSelect(nvl(m8.tterm_nm, tterm1.tterm_nm).as("tterm_nm1"));

			// 取引条件２
			MAM_TTERM_R tterm2 = MAM_TTERM_R.create("TTERM2");
			MAM_TTERM_LCL_R m9 = MAM_TTERM_LCL_R.create("M9");
			hdrFtr_bldr.addLeftOuterJoin(tterm2, t.tterm_cd2.eq(tterm2.tterm_cd));
			hdrFtr_bldr.addLeftOuterJoin(m9,
					t.tterm_cd2.eq(m9.tterm_cd)
					.and(m1.prnt_lcl_cd.eq(m9.lcl_cd)));
			hdrFtr_bldr.addSelect(nvl(m9.tterm_nm, tterm2.tterm_nm).as("tterm_nm2"));

			// 取引条件３
			MAM_TTERM_R tterm3 = MAM_TTERM_R.create("TTERM3");
			MAM_TTERM_LCL_R m10 = MAM_TTERM_LCL_R.create("M10");
			hdrFtr_bldr.addLeftOuterJoin(tterm3, t.tterm_cd3.eq(tterm3.tterm_cd));
			hdrFtr_bldr.addLeftOuterJoin(m10,
					t.tterm_cd3.eq(m10.tterm_cd)
					.and(m1.prnt_lcl_cd.eq(m10.lcl_cd)));
			hdrFtr_bldr.addSelect(nvl(m10.tterm_nm, tterm3.tterm_nm).as("tterm_nm3"));

			// 見積条件
			MST_SLO_RSN_R t2 = MST_SLO_RSN_R.create("T2");
			hdrFtr_bldr.addLeftOuterJoin(t2, t.qtn_term_cd.eq(t2.slo_rsn_cd));
			hdrFtr_bldr.addSelect(t2.slo_rsn_nm.as("qtn_term_nm"));

			// 国（得意先）
			hdrFtr.addStringColumn("cst_cntry_nm");
			MAM_CNTRY_R cntry1 = MAM_CNTRY_R.create("CNTRY1");
			hdrFtr_bldr.addLeftOuterJoin(cntry1, m1.cntry_cd.eq(cntry1.cntry_cd));
			hdrFtr_bldr.addSelect(cntry1.cntry_nm.as("cst_cntry_nm"));

			// 国（会社）
			hdrFtr.addStringColumn("sls_cntry_nm");
			MAM_CNTRY_R cntry2 = MAM_CNTRY_R.create("CNTRY2");
			hdrFtr_bldr.addLeftOuterJoin(cntry2, value(getCo().cntry_cd()).eq(cntry2.cntry_cd));
			hdrFtr_bldr.addSelect(cntry2.cntry_nm.as("sls_cntry_nm"));

			dbSelectKey("MSBBL6040_MST_QTN_S02", hdrFtr, hdrFtr_bldr, r);

			return hdrFtr;
		}

		/**
		 * 見積明細を検索する
		 * 
		 * @param hdrFtr
		 * @return
		 */
		protected MCList<MST_QTN_D_R> srchDtl(MST_QTN_R hdrFtr) {
			MCList<MST_QTN_D_R> dtl = MCList.create(MST_QTN_D_R.class);
			dtl.addStringColumn("itm_alt_nm1");
			dtl.addStringColumn("itm_alt_nm2");
			dtl.addStringColumn("itm_alt_nm3");
			dtl.addStringColumn("itm_alt_nm4");

			MST_QTN_D_R t = MST_QTN_D_R.create("T");
			MCQueryApiBuilder dtl_bldr = MCQueryApiBuilder.create(t);
			dtl_bldr.setWhere(t.qtn_no.eq(bind("1")), hdrFtr.qtn_no());
			dtl_bldr.addWhereWithAnd(t.qtn_rev.eq(bind("1")), hdrFtr.qtn_rev());

			dtl_bldr.setSelect(
					t.itm_cd,
					t.itm_sub1.as("itm_sub1_data"),
					t.itm_sub2.as("itm_sub2_data"),
					t.itm_sub3.as("itm_sub3_data"),
					t.iv_itm_nm,
					t.cst_itm_cd,
					t.cst_itm_nm,
					t.trd_unit_qty,
					t.trd_unit_cd,
					t.cntry_org_cd,
					t.interim_flg,
					t.trd_cur_upri,
					t.trd_cur_std_sls_upri,
					t.trd_cur_amt,
					t.trd_cur_std_sls_amt,
					t.trd_cur_dscnt_amt,
					t.trd_cur_tax_amt,
					t.dlv_cd,
					t.dlv_addr1,
					t.dlv_addr2,
					t.dlv_addr3,
					t.dlv_addr4,
					t.qtn_d_rmrks,
					t.disp_seq,
					t.sub_char1.as("d_sub_char1"),
					t.sub_char2.as("d_sub_char2"),
					t.sub_char3.as("d_sub_char3"));

			MAM_BP_R dlv = MAM_BP_R.create("DLV");
			// 品目
			MAM_ITM_LCL_R m1 = MAM_ITM_LCL_R.create("M1");
			MAM_ITM_R itm = MAM_ITM_R.create("ITM");
			dtl_bldr.addLeftOuterJoin(dlv, t.dlv_cd.eq(dlv.bp_cd));
			dtl_bldr.addLeftOuterJoin(m1, t.itm_cd.eq(m1.itm_cd)
					.and(t.itm_sub1.eq(m1.itm_sub1))
					.and(t.itm_sub2.eq(m1.itm_sub2))
					.and(t.itm_sub3.eq(m1.itm_sub3))
					.and(m1.lcl_cd.eq(bind("prnt_lcl_cd"))));
			dtl_bldr.addLeftOuterJoin(itm,
					t.itm_cd.eq(itm.itm_cd)
					.and(t.itm_sub1.eq(itm.itm_sub1))
					.and(t.itm_sub2.eq(itm.itm_sub2))
					.and(t.itm_sub3.eq(itm.itm_sub3)));
			dtl_bldr.addSelect(nvl(t.iv_itm_nm, nvl(t.itm_nm, nvl(m1.itm_nm, itm.itm_nm)))
					.as("itm_nm"));
			dtl_bldr.addSelect(nvl(m1.itm_alt_nm1, itm.itm_alt_nm1).as("itm_alt_nm1"));
			dtl_bldr.addSelect(nvl(m1.itm_alt_nm2, itm.itm_alt_nm2).as("itm_alt_nm2"));
			dtl_bldr.addSelect(nvl(m1.itm_alt_nm3, itm.itm_alt_nm3).as("itm_alt_nm3"));
			dtl_bldr.addSelect(nvl(m1.itm_alt_nm4, itm.itm_alt_nm4).as("itm_alt_nm4"));
			dtl_bldr.addSelect(itm.dscnt_itm_flg.as("dscnt_itm_flg"));
			dtl.addBooleanColumn("dscnt_itm_flg");

			// 数量小数部有効桁数
			MAVM_ITM_UNIT_R m2 = MAVM_ITM_UNIT_R.create("M2");
			dtl_bldr.addLeftOuterJoin(m2, t.trd_unit_cd.eq(m2.unit_cd)
					.and(t.itm_cd.eq(m2.itm_cd))
					.and(t.itm_sub1.eq(m2.itm_sub1))
					.and(t.itm_sub2.eq(m2.itm_sub2))
					.and(t.itm_sub3.eq(m2.itm_sub3)));
			dtl_bldr.addSelect(m2.dec_place);

			// 単位
			MAM_UNIT_R unit = MAM_UNIT_R.create("UNIT");
			MAM_UNIT_LCL_R m3 = MAM_UNIT_LCL_R.create("M3");
			dtl_bldr.addLeftOuterJoin(unit, t.trd_unit_cd.eq(unit.unit_cd));
			dtl_bldr.addLeftOuterJoin(m3,
					t.trd_unit_cd.eq(m3.unit_cd)
					.and(m3.lcl_cd.eq(bind("prnt_lcl_cd"))));
			dtl_bldr.addSelect(nvl(m3.unit_nm, unit.unit_nm).as("trd_unit_nm"));

			// 税
			MAM_TAX_R m4 = MAM_TAX_R.create("M4");
			dtl_bldr.addLeftOuterJoin(m4, t.tax_cd.eq(m4.tax_cd));
			dtl.addBooleanColumn("inc_tax_flg");
			dtl_bldr.addSelect(m4.inc_tax_flg);
			dtl_bldr.addSelect(m4.tax_rate);

			// 納品先
			MAM_BP_LCL_R m5 = MAM_BP_LCL_R.create("M5");
			dtl_bldr.addLeftOuterJoin(m5,
					t.dlv_cd.eq(m5.bp_cd)
					.and(m5.lcl_cd.eq(bind("prnt_lcl_cd"))));
			dtl_bldr.addSelect(nvl(t.dlv_nm, nvl(m5.bp_nm, dlv.bp_nm)).as("dlv_nm"));
			dtl_bldr.addSelect(nvl(m5.bp_alt_nm1, dlv.bp_alt_nm1).as("dlv_alt_nm1"));
			dtl_bldr.addSelect(nvl(m5.bp_alt_nm2, dlv.bp_alt_nm2).as("dlv_alt_nm2"));
			dtl_bldr.addSelect(nvl(m5.bp_alt_nm3, dlv.bp_alt_nm3).as("dlv_alt_nm3"));
			dtl_bldr.addSelect(nvl(m5.bp_alt_nm4, dlv.bp_alt_nm4).as("dlv_alt_nm4"));

			// 国（納品先）
			hdrFtr.addStringColumn("dlv_cntry_nm");
			MAM_CNTRY_R cntry = MAM_CNTRY_R.create("CNTRY");
			dtl_bldr.addLeftOuterJoin(cntry, dlv.cntry_cd.eq(cntry.cntry_cd));
			dtl_bldr.addSelect(cntry.cntry_nm.as("dlv_cntry_nm"));

			dtl_bldr.setOrderByAsc(t.disp_seq);

			dbSelect("MSBBL6040_MST_QTN_D_S01", dtl, dtl_bldr, hdrFtr);

			dtl.setNumberNE("amt_dec_place", hdrFtr.getNumberNE("amt_dec_place"));
			dtl.setNumberNE("upri_dec_place", hdrFtr.getNumberNE("upri_dec_place"));
			dtl.setStringNE("prnt_lcl_cd", hdrFtr.getStringNE("prnt_lcl_cd"));

			return dtl;
		}

		/**
		 * 取得した値を編集し、レポートセットにセットする
		 * 
		 * @param reportSet
		 * @param hdr
		 * @param dtl
		 * @param prntHdr
		 * @param prntDtl
		 */
		protected void setData(MCReportSet reportSet,
				MST_QTN_R hdr,
				MCList<MST_QTN_D_R> dtl,
				QtnHdrR prntHdr,
				MCList<QtnDtlR> prntDtl) {

			putNumStr(reportSet, prntHdr,
					QtnHdrR.$s_ttl_trd_cur_amt,
					QtnHdrR.$ttl_trd_cur_amt,
					hdr.getNumberNE("amt_dec_place"));

			putNumStr(reportSet, prntHdr,
					QtnHdrR.$s_ttl_trd_cur_tax_amt,
					QtnHdrR.$ttl_trd_cur_tax_amt,
					hdr.getNumberNE("amt_dec_place"));

			int cnt = 0;

			for (QtnDtlR r : prntDtl) {

				r.addNumberColumn("amt_dec_place", hdr.getNumberNE("amt_dec_place"));
				r.addNumberColumn("upri_dec_place", hdr.getNumberNE("upri_dec_place"));
				r.addNumberColumn("dec_place", dtl.get(cnt).getNumberNE("dec_place"));
			}

			putNumStr(reportSet, prntDtl,
					QtnDtlR.$s_int_trd_cur_upri,
					QtnDtlR.$s_dec_trd_cur_upri,
					QtnDtlR.$trd_cur_upri,
					"upri_dec_place");

			putNumStr(reportSet, prntDtl,
					QtnDtlR.$s_int_trd_cur_amt,
					QtnDtlR.$s_dec_trd_cur_amt,
					QtnDtlR.$trd_cur_amt,
					"amt_dec_place");

			putNumStr(reportSet, prntDtl,
					QtnDtlR.$s_int_trd_cur_std_sls_upri,
					QtnDtlR.$s_dec_trd_cur_std_sls_upri,
					QtnDtlR.$trd_cur_std_sls_upri,
					"upri_dec_place");

			putNumStr(reportSet, prntDtl,
					QtnDtlR.$s_int_trd_cur_std_sls_amt,
					QtnDtlR.$s_dec_trd_cur_std_sls_amt,
					QtnDtlR.$trd_cur_std_sls_amt,
					"amt_dec_place");

			putNumStr(reportSet, prntDtl,
					QtnDtlR.$s_int_trd_cur_dscnt_amt,
					QtnDtlR.$s_dec_trd_cur_dscnt_amt,
					QtnDtlR.$trd_cur_dscnt_amt,
					"amt_dec_place");

			putNumStr(reportSet, prntDtl,
					QtnDtlR.$s_int_trd_cur_tax_amt,
					QtnDtlR.$s_dec_trd_cur_tax_amt,
					QtnDtlR.$trd_cur_tax_amt,
					"amt_dec_place");

			putNumStr(reportSet, prntDtl,
					QtnDtlR.$s_tax_rate,
					QtnDtlR.$tax_rate,
					QtnDtlR.tax_rate_META);

			putNumStr(reportSet, prntDtl,
					QtnDtlR.$s_int_trd_unit_qty,
					QtnDtlR.$s_dec_trd_unit_qty,
					QtnDtlR.$trd_unit_qty,
					"dec_place");

			putPrntItmSub1(prntDtl, QtnDtlR.$itm_sub1_view, QtnDtlR.$itm_sub1_data);
			putPrntItmSub2(prntDtl, QtnDtlR.$itm_sub2_view, QtnDtlR.$itm_sub2_data);
			putPrntItmSub3(prntDtl, QtnDtlR.$itm_sub3_view, QtnDtlR.$itm_sub3_data);

			prntHdr.addNumberColumn("qtn_prnt_seq", hdr.getNumberNE("qtn_prnt_seq"));

			reportSet.addRow(prntHdr);
			reportSet.addAll(prntDtl);
			setBizInfo(reportSet, prntHdr);
		}

		/**
		 * 業務情報を設定する
		 * 
		 * @param reportSet
		 * @param prntHdr
		 */
		protected void setBizInfo(MCReportSet reportSet, QtnHdrR prntHdr) {
			reportSet.setAppReportNo1(prntHdr.qtn_no());
			reportSet.setAppReportNo2(prntHdr.qtn_rev().toString());
			reportSet.setAppReportNo3(prntHdr.getNumberNE("qtn_prnt_seq").toString());
			reportSet.setAppUsrCd1(prntHdr.sls_dpt_cd());
			reportSet.setAppUsrNm1(prntHdr.sls_dpt_nm());
			reportSet.setAppUsrCd2(prntHdr.sls_usr_cd());
			reportSet.setAppUsrNm2(prntHdr.sls_usr_nm());
			reportSet.setAppToCd1(prntHdr.cst_cd());
			reportSet.setAppToNm1(prntHdr.cst_nm());
		}

		/**
		 * 見積書を印刷する
		 */
		protected void prnt() {

			prntAll();
		}

		/**
		 * MCReportSetのListをもとに帳票を発行します。
		 * 1件分のMCReportSetを引数に指定した場合は、印刷データの登録と帳票発行します。
		 * 複数件のMCReportSetを引数に指定した場合は、１つのデータファイルにまとめて発行し、
		 * 印刷データは登録しません。
		 * 
		 * @param reportSets MCReportSetのList
		 */
		protected <E extends MCReportSet> void prntAll(List<E> reportSets) {

			if (reportSets == null) {
				return;
			}
			int cnt = reportSets.size();
			if (cnt == 0) {
				return;
			}
			else {

				MCReportSet all = reportSets.get(0).createInstance();
				for (MCReportSet reportSet : reportSets) {
					all.addAll(reportSet.getAll());
				}
				all.setPersistent(false);
				MCServerReportManager.request(all);
			}
		}
		
		/**
		 * MCReportSetのListをもとに帳票を発行します。
		 * 1件分のMCReportSetを引数に指定した場合は、印刷データの登録と帳票発行します。
		 * 複数件のMCReportSetを引数に指定した場合は、１つのデータファイルにまとめて発行し、
		 * 印刷データは登録しません。
		 * 
		 * @param reportSets MCReportSetのList
		 */
		protected <E extends MCReportSet> void prntAll() {

			if ((_qtnReportMap == null || _qtnReportMap.size() == 0) && (_exQtnReportMap == null || _exQtnReportMap.size() == 0)) {
				return;
			}

			// 画面の個別発行フラグがオフの場合
			if (!up1().indiv_prnt_flg()) {
				// 個別発行フラグ取得処理
				getIndivPrnt();
			}
			
			List<MCReportSet> rptSetList = new ArrayList<>();

			// 見積書を登録
			if (!(_qtnReportMap == null || _qtnReportMap.size() == 0)) {

				// 発注先ごとにMapを作成
				Map<String, List<MSBBR_Qtn>> lclMap = new LinkedHashMap<String, List<MSBBR_Qtn>>();
				for (Map.Entry<List<String>, List<MSBBR_Qtn>> en : _qtnReportMap.entrySet()) {
					boolean isInit = false;
					List<MSBBR_Qtn> lst = null;
					for (MSBBR_Qtn purcRet : en.getValue()) {
						if (!isInit) {
							lst = lclMap.get(purcRet.getAppToCd1());
							if (lst == null) {
								lst = new ArrayList<MSBBR_Qtn>();
								lclMap.put(purcRet.getAppToCd1(), lst);
							}
							isInit = true;
						}
						lst.add(purcRet);
					}
				}

				// ソート処理
				lclMap = qtnMapSort(lclMap);

				for (Map.Entry<String, List<MSBBR_Qtn>> en : lclMap.entrySet()) {
					MCReportInfoR qtnReprntInfo = null;
					MCReportSet allQtnRs = null;
					boolean isQtnInit = false;
					boolean indivPrntFlg = false;

					if (!up1().indiv_prnt_flg()) {
						BpUtil_Sprt01_DtlR bpR = _bpUtil.getFirst(_bpUtilkey, en.getKey());
						indivPrntFlg = bpR.indiv_prnt_flg();
					}

					if (up1().indiv_prnt_flg() || indivPrntFlg) {
						// 個別発行
						String oldQtn = null;
						for (MSBBR_Qtn qtn : en.getValue()) {
							if (isSame(qtn.getAppReportNo1() + qtn.getAppReportNo2(), oldQtn)) {
								allQtnRs.addAll(qtn.getAll());
							}
							else {
								if (allQtnRs != null) {
									allQtnRs.setRegister(false);
									MCServerReportManager.requestImmediate(allQtnRs);
								}
								qtnReprntInfo = getQtnReprntInfo(qtn);
								if (isNull(qtnReprntInfo)) {
									allQtnRs = qtn.createInstance();
									allQtnRs.setLocale(qtn.getLocale());
									allQtnRs.addAll(qtn.getAll());
									oldQtn = qtn.getAppReportNo1() + qtn.getAppReportNo2();
									allQtnRs.addWriteListener(new FileWriteListener(rptSetList));
								}
								else {
									allQtnRs = null;
									MCServerReportManager.reprint(qtnReprntInfo);
								}
							}
						}
						if (allQtnRs != null) {
							allQtnRs.setRegister(false);
							MCServerReportManager.requestImmediate(allQtnRs);
						}
					}
					else {
						// まとめ発行
						for (MSBBR_Qtn qtn : en.getValue()) {
							if (!isQtnInit) {
								allQtnRs = qtn.createInstance();
								allQtnRs.setLocale(qtn.getLocale());
								isQtnInit = true;
							}
							qtnReprntInfo = getQtnReprntInfo(qtn);
							if (isNull(qtnReprntInfo)) {
								allQtnRs.addAll(qtn.getAll());
							}
						}
						if (allQtnRs.size() != 0) {
							MCServerReportManager.request(allQtnRs);
						}
						for (Map.Entry<List<String>, MCReportInfoR> reprntQtn : _qtnReportReprntMap.entrySet()) {
							if (isSame(reprntQtn.getValue().app_to_cd1(), en.getKey())) {
								MCServerReportManager.reprint(reprntQtn.getValue());
							}
						}
					}
				}
			}

			// 国外見積書を登録
			if (!(_exQtnReportMap == null || _exQtnReportMap.size() == 0)) {

				// 発注先ごとにMapを作成
				Map<String, List<MSBBR_ExQtn>> lclMap = new LinkedHashMap<String, List<MSBBR_ExQtn>>();
				for (Map.Entry<List<String>, List<MSBBR_ExQtn>> en : _exQtnReportMap.entrySet()) {
					boolean isInit = false;
					List<MSBBR_ExQtn> lst = null;
					for (MSBBR_ExQtn purcRet : en.getValue()) {
						if (!isInit) {
							lst = lclMap.get(purcRet.getAppToCd1());
							if (lst == null) {
								lst = new ArrayList<MSBBR_ExQtn>();
								lclMap.put(purcRet.getAppToCd1(), lst);
							}
							isInit = true;
						}
						lst.add(purcRet);
					}
				}

				// ソート処理
				lclMap = exQtnMapSort(lclMap);

				for (Map.Entry<String, List<MSBBR_ExQtn>> en : lclMap.entrySet()) {
					MCReportInfoR exQtnReprntInfo = null;
					MCReportSet allExQtnRs = null;
					boolean isExQtnInit = false;
					boolean indivPrntFlg = false;

					if (!up1().indiv_prnt_flg()) {
						BpUtil_Sprt01_DtlR bpR = _bpUtil.getFirst(_bpUtilkey, en.getKey());
						indivPrntFlg = bpR.indiv_prnt_flg();
					}

					if (up1().indiv_prnt_flg() || indivPrntFlg) {
						// 個別発行
						String oldExQtn = null;
						for (MSBBR_ExQtn exQtn : en.getValue()) {
							if (isSame(exQtn.getAppReportNo1() + exQtn.getAppReportNo2(), oldExQtn)) {
								allExQtnRs.addAll(exQtn.getAll());
							}
							else {
								if (allExQtnRs != null) {
									allExQtnRs.setRegister(false);
									MCServerReportManager.requestImmediate(allExQtnRs);
								}
								exQtnReprntInfo = getExQtnReprntInfo(exQtn);
								if (isNull(exQtnReprntInfo)) {
									allExQtnRs = exQtn.createInstance();
									allExQtnRs.setLocale(exQtn.getLocale());
									allExQtnRs.addAll(exQtn.getAll());
									oldExQtn = exQtn.getAppReportNo1()+ exQtn.getAppReportNo2();
									allExQtnRs.addWriteListener(new FileWriteListener(rptSetList));
								}
								else {
									allExQtnRs = null;
									MCServerReportManager.reprint(exQtnReprntInfo);
								}
							}
						}
						if (allExQtnRs != null) {
							allExQtnRs.setRegister(false);
							MCServerReportManager.requestImmediate(allExQtnRs);
						}
					}
					else {
						// まとめ発行
						for (MSBBR_ExQtn exQtn : en.getValue()) {
							if (!isExQtnInit) {
								allExQtnRs = exQtn.createInstance();
								allExQtnRs.setLocale(exQtn.getLocale());
								isExQtnInit = true;
							}
							exQtnReprntInfo = getExQtnReprntInfo(exQtn);
							if (isNull(exQtnReprntInfo)) {
								allExQtnRs.addAll(exQtn.getAll());
							}
						}
						if(allExQtnRs.size() != 0) {
							MCServerReportManager.request(allExQtnRs);
						}
						for (Map.Entry<List<String>, MCReportInfoR> reprntExQtn : _exQtnReportReprntMap.entrySet()) {
							if (isSame(reprntExQtn.getValue().app_to_cd1(), en.getKey())) {
								MCServerReportManager.reprint(reprntExQtn.getValue());
							}
						}
					}
				}
			}
			
			//添付帳票登録サービス（更新）の呼び出し （国内・国外まとめて呼出する）
			if(!rptSetList.isEmpty()) {
				callQtnAttachSrv(rptSetList);
			}
		}

		protected MCReportInfoR getQtnReprntInfo(MSBBR_Qtn qtn) {
			MCReportInfoR info = qtn.getReportInfo();
			return _qtnReportReprntMap.get(Arrays.asList(new String[] { info.app_report_no1(), info.app_report_no2() }));
		}

		protected MCReportInfoR getExQtnReprntInfo(MSBBR_ExQtn exQtn) {
			MCReportInfoR info = exQtn.getReportInfo();
			return _exQtnReportReprntMap.get(Arrays.asList(new String[] { info.app_report_no1(), info.app_report_no2() }));
		}

		/**
		 * 見積ヘッダを更新する
		 * 
		 * @param r
		 */
		protected void updQtn(Qtn_Prnt01_HdrR r) {

			MST_QTN_R upd = MST_QTN_R.create();
			MST_QTN_R t = MST_QTN_R.create("T");
			MCQueryApiBuilder upd_bldr = MCQueryApiBuilder.create(t);

			upd.qtn_no(r.qtn_no());
			upd.qtn_rev(r.qtn_rev());
			upd.qtn_prnt_dt(getToday());
			upd.qtn_prnt_flg(true);
			upd_bldr.setSet(t.qtn_prnt_flg, t.qtn_prnt_dt);
			dbUpdateKey("MSBBL6040_MST_QTN_U01", upd, upd_bldr);
		}
		
		/**
		 * 個別発行取得の呼び出し
		 */
		protected void getIndivPrnt() {
			// 各帳票の見積NOから得意先を検索→得意先を個別発行処理に連携→フラグ取得
			// 見積ヘッダの取得
			MCList<MST_QTN_R> qtnL = MCList.create(MST_QTN_R.class);
			MST_QTN_R t = MST_QTN_R.create("T");
			MCQueryApiBuilder qtnL_bldr = MCQueryApiBuilder.create(t);
			qtnL_bldr.setSelect(t.cst_cd);
			qtnL_bldr.setWhere(t.qtn_no.eq(bind("qtn_no")));
			dbSelect("MSBBL6040_MST_QTN_S03", qtnL, qtnL_bldr, up0());
			
			MSUCL_BpUtil.BpUtil_Sprt01 ope = MSUCL_BpUtil.crtBpUtil_Sprt01();
			ope.up0().bp_typ(MAC_BP_IS_SRCH_TYP.CST.value());
			for (MST_QTN_R qtnR : qtnL.groupBy(MST_QTN_R.$cst_cd)) {
				BpUtil_Sprt01_DtlR dtlR = BpUtil_Sprt01_DtlR.create();
				dtlR.bp_cd(qtnR.cst_cd());
				ope.up1().add(dtlR);
			}
			ope.exec();

			_bpUtil = ope.down0();
			_bpUtilkey = _bpUtil.createIndex(BpUtil_Sprt01_DtlR.$bp_cd);
		}

		/**
		 * 見積書ソート
		 * @param map
		 * @return
		 */
		protected Map<String, List<MSBBR_Qtn>> qtnMapSort(Map<String, List<MSBBR_Qtn>> map) {
			// 見積書ReportSetマップソート（得意先順）
			List<Entry<String, List<MSBBR_Qtn>>> entries = new ArrayList<Entry<String, List<MSBBR_Qtn>>>(map.entrySet());
			Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));

			LinkedHashMap<String, List<MSBBR_Qtn>> result = new LinkedHashMap<>();
			for (Map.Entry<String, List<MSBBR_Qtn>> entry : entries) {
				result.put(entry.getKey(), entry.getValue());
			}

			return result;
		}

		/**
		 * 国外見積書ソート
		 * @param map
		 * @return
		 */
		protected Map<String, List<MSBBR_ExQtn>> exQtnMapSort(Map<String, List<MSBBR_ExQtn>> map) {
			// 国外見積書ReportSetマップソート（得意先順）
			List<Entry<String, List<MSBBR_ExQtn>>> entries = new ArrayList<Entry<String, List<MSBBR_ExQtn>>>(map.entrySet());
			Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));

			LinkedHashMap<String, List<MSBBR_ExQtn>> result = new LinkedHashMap<>();
			for (Map.Entry<String, List<MSBBR_ExQtn>> entry : entries) {
				result.put(entry.getKey(), entry.getValue());
			}

			return result;
		}

		protected Map_QtnHdrR_MST_QTN_R<QtnHdrR,MST_QTN_R> createMap_QtnHdrR_MST_QTN_R() {
			return new Map_QtnHdrR_MST_QTN_R<QtnHdrR, MST_QTN_R>();
		}

		public class Map_QtnHdrR_MST_QTN_R<D extends QtnHdrR, S extends MST_QTN_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(QtnHdrR.$trd_cd, MST_QTN_R.$trd_cd);
				addColumnPathMap(QtnHdrR.$cst_cd, MST_QTN_R.$cst_cd);
				addColumnPathMap(QtnHdrR.$cst_zip_cd, MST_QTN_R.$cst_zip_cd);
				addColumnPathMap(QtnHdrR.$cst_addr1, MST_QTN_R.$cst_addr1);
				addColumnPathMap(QtnHdrR.$cst_addr2, MST_QTN_R.$cst_addr2);
				addColumnPathMap(QtnHdrR.$cst_addr3, MST_QTN_R.$cst_addr3);
				addColumnPathMap(QtnHdrR.$cst_addr4, MST_QTN_R.$cst_addr4);
				addColumnPathMap(QtnHdrR.$cst_addr, "cst_addr");
				addColumnPathMap(QtnHdrR.$cst_nm, MST_QTN_R.$cst_nm);
				addColumnPathMap(QtnHdrR.$cst_alt_nm1, "bp_alt_nm1");
				addColumnPathMap(QtnHdrR.$cst_alt_nm2, "bp_alt_nm2");
				addColumnPathMap(QtnHdrR.$cst_alt_nm3, "bp_alt_nm3");
				addColumnPathMap(QtnHdrR.$cst_alt_nm4, "bp_alt_nm4");
				addColumnPathMap(QtnHdrR.$cst_cntct_dpt, MST_QTN_R.$cst_cntct_dpt);
				addColumnPathMap(QtnHdrR.$cst_cntct_psn, MST_QTN_R.$cst_cntct_psn);
				addColumnPathMap(QtnHdrR.$cst_cntct_psn_title, "cst_cntct_psn_title");
				addColumnPathMap(QtnHdrR.$cst_tel, MST_QTN_R.$cst_tel);
				addColumnPathMap(QtnHdrR.$cst_fax, MST_QTN_R.$cst_fax);
				addColumnPathMap(QtnHdrR.$qtn_prnt_dt, MST_QTN_R.$qtn_prnt_dt);
				addColumnPathMap(QtnHdrR.$sls_dpt_cd, MST_QTN_R.$sls_dpt_cd);
				addColumnPathMap(QtnHdrR.$sls_dpt_zip_cd, "sls_dpt_zip_cd");
				addColumnPathMap(QtnHdrR.$sls_dpt_addr1, "sls_dpt_addr1");
				addColumnPathMap(QtnHdrR.$sls_dpt_addr2, "sls_dpt_addr2");
				addColumnPathMap(QtnHdrR.$sls_dpt_addr3, "sls_dpt_addr3");
				addColumnPathMap(QtnHdrR.$sls_dpt_addr4, "sls_dpt_addr4");
				addColumnPathMap(QtnHdrR.$sls_dpt_addr, "sls_dpt_addr");
				addColumnPathMap(QtnHdrR.$co_nm, "co_nm");
				addColumnPathMap(QtnHdrR.$sls_dpt_nm, "sls_dpt_nm");
				addColumnPathMap(QtnHdrR.$sls_usr_cd, MST_QTN_R.$sls_usr_cd);
				addColumnPathMap(QtnHdrR.$sls_usr_nm, "sls_usr_nm");
				addColumnPathMap(QtnHdrR.$sls_dpt_tel, "sls_dpt_tel");
				addColumnPathMap(QtnHdrR.$sls_dpt_fax, "sls_dpt_fax");
				addColumnPathMap(QtnHdrR.$trd_cur_cd, MST_QTN_R.$trd_cur_cd);
				addColumnPathMap(QtnHdrR.$trd_cur_nm, "trd_cur_nm");
				addColumnPathMap(QtnHdrR.$qtn_no, MST_QTN_R.$qtn_no);
				addColumnPathMap(QtnHdrR.$qtn_rev, MST_QTN_R.$qtn_rev);
				addColumnPathMap(QtnHdrR.$wrk_no, MST_QTN_R.$wrk_no);
				addColumnPathMap(QtnHdrR.$wrk_nm, "wrk_nm");
				addColumnPathMap(QtnHdrR.$qtn_dt, MST_QTN_R.$qtn_dt);
				addColumnPathMap(QtnHdrR.$valid_dt, MST_QTN_R.$valid_dt);
				addColumnPathMap(QtnHdrR.$sub_char1, MST_QTN_R.$sub_char1);
				addColumnPathMap(QtnHdrR.$sub_char2, MST_QTN_R.$sub_char2);
				addColumnPathMap(QtnHdrR.$sub_char3, MST_QTN_R.$sub_char3);
				addColumnPathMap(QtnHdrR.$trnspt_cd, MST_QTN_R.$trnspt_cd);
				addColumnPathMap(QtnHdrR.$trnspt_nm, "trnspt_nm");
				addColumnPathMap(QtnHdrR.$tterm_cd1, MST_QTN_R.$tterm_cd1);
				addColumnPathMap(QtnHdrR.$tterm_cd2, MST_QTN_R.$tterm_cd2);
				addColumnPathMap(QtnHdrR.$tterm_cd3, MST_QTN_R.$tterm_cd3);
				addColumnPathMap(QtnHdrR.$tterm_nm1, "tterm_nm1");
				addColumnPathMap(QtnHdrR.$tterm_rmrks1, MST_QTN_R.$tterm_rmrks1);
				addColumnPathMap(QtnHdrR.$tterm_nm2, "tterm_nm2");
				addColumnPathMap(QtnHdrR.$tterm_rmrks2, MST_QTN_R.$tterm_rmrks2);
				addColumnPathMap(QtnHdrR.$tterm_nm3, "tterm_nm3");
				addColumnPathMap(QtnHdrR.$tterm_rmrks3, MST_QTN_R.$tterm_rmrks3);
				addColumnPathMap(QtnHdrR.$qtn_term_cd, MST_QTN_R.$qtn_term_cd);
				addColumnPathMap(QtnHdrR.$qtn_term_nm, "qtn_term_nm");
				addColumnPathMap(QtnHdrR.$qtn_rmrks, MST_QTN_R.$qtn_rmrks);
				addColumnPathMap(QtnHdrR.$cst_cntry_nm, "cst_cntry_nm");
				addColumnPathMap(QtnHdrR.$sls_cntry_nm, "sls_cntry_nm");

			}

			@Override
			protected void valueCopy(D dest, S src) {

				dest.cst_addr(concatAddress(src.cst_addr1(), src.cst_addr2(), src.cst_addr3(), src.cst_addr4()));
				dest.sls_dpt_addr(concatAddress(src.getStringNE("sls_dpt_addr1"), src.getStringNE("sls_dpt_addr2"), src.getStringNE("sls_dpt_addr3"), src.getStringNE("sls_dpt_addr4")));
				dest.qtn_prnt_dt(getToday());
			}
		}

		protected Map_QtnDtlR_MST_QTN_D_R<QtnDtlR,MST_QTN_D_R> createMap_QtnDtlR_MST_QTN_D_R() {
			return new Map_QtnDtlR_MST_QTN_D_R<QtnDtlR, MST_QTN_D_R>();
		}

		public class Map_QtnDtlR_MST_QTN_D_R<D extends QtnDtlR, S extends MST_QTN_D_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(QtnDtlR.$itm_cd, MST_QTN_D_R.$itm_cd);
				addColumnPathMap(QtnDtlR.$itm_sub1_data, "itm_sub1_data");
				addColumnPathMap(QtnDtlR.$itm_sub2_data, "itm_sub2_data");
				addColumnPathMap(QtnDtlR.$itm_sub3_data, "itm_sub3_data");
				addColumnPathMap(QtnDtlR.$itm_nm, MST_QTN_D_R.$itm_nm);
				addColumnPathMap(QtnDtlR.$itm_alt_nm1, "itm_alt_nm1");
				addColumnPathMap(QtnDtlR.$itm_alt_nm2, "itm_alt_nm2");
				addColumnPathMap(QtnDtlR.$itm_alt_nm3, "itm_alt_nm3");
				addColumnPathMap(QtnDtlR.$itm_alt_nm4, "itm_alt_nm4");
				addColumnPathMap(QtnDtlR.$iv_itm_nm, MST_QTN_D_R.$iv_itm_nm);
				addColumnPathMap(QtnDtlR.$cst_itm_cd, MST_QTN_D_R.$cst_itm_cd);
				addColumnPathMap(QtnDtlR.$cst_itm_nm, MST_QTN_D_R.$cst_itm_nm);
				addColumnPathMap(QtnDtlR.$trd_unit_qty, MST_QTN_D_R.$trd_unit_qty);
				addColumnPathMap(QtnDtlR.$trd_unit_cd, MST_QTN_D_R.$trd_unit_cd);
				addColumnPathMap(QtnDtlR.$trd_unit_nm, "trd_unit_nm");
				addColumnPathMap(QtnDtlR.$cntry_org_cd, MST_QTN_D_R.$cntry_org_cd);
				addColumnPathMap(QtnDtlR.$interim_flg, MST_QTN_D_R.$interim_flg);
				addColumnPathMap(QtnDtlR.$inc_tax_flg, "inc_tax_flg");
				addColumnPathMap(QtnDtlR.$trd_cur_upri, MST_QTN_D_R.$trd_cur_upri);
				addColumnPathMap(QtnDtlR.$trd_cur_std_sls_upri, MST_QTN_D_R.$trd_cur_std_sls_upri);
				addColumnPathMap(QtnDtlR.$trd_cur_amt, MST_QTN_D_R.$trd_cur_amt);
				addColumnPathMap(QtnDtlR.$trd_cur_std_sls_amt, MST_QTN_D_R.$trd_cur_std_sls_amt);
				addColumnPathMap(QtnDtlR.$trd_cur_dscnt_amt, MST_QTN_D_R.$trd_cur_dscnt_amt);
				addColumnPathMap(QtnDtlR.$trd_cur_tax_amt, MST_QTN_D_R.$trd_cur_tax_amt);
				addColumnPathMap(QtnDtlR.$tax_rate, "tax_rate");
				addColumnPathMap(QtnDtlR.$dlv_cd, MST_QTN_D_R.$dlv_cd);
				addColumnPathMap(QtnDtlR.$dlv_nm, MST_QTN_D_R.$dlv_nm);
				addColumnPathMap(QtnDtlR.$dlv_alt_nm1, "dlv_alt_nm1");
				addColumnPathMap(QtnDtlR.$dlv_alt_nm2, "dlv_alt_nm2");
				addColumnPathMap(QtnDtlR.$dlv_alt_nm3, "dlv_alt_nm3");
				addColumnPathMap(QtnDtlR.$dlv_alt_nm4, "dlv_alt_nm4");
				addColumnPathMap(QtnDtlR.$dlv_addr1, MST_QTN_D_R.$dlv_addr1);
				addColumnPathMap(QtnDtlR.$dlv_addr2, MST_QTN_D_R.$dlv_addr2);
				addColumnPathMap(QtnDtlR.$dlv_addr3, MST_QTN_D_R.$dlv_addr3);
				addColumnPathMap(QtnDtlR.$dlv_addr4, MST_QTN_D_R.$dlv_addr4);
				addColumnPathMap(QtnDtlR.$qtn_d_rmrks, MST_QTN_D_R.$qtn_d_rmrks);
				addColumnPathMap(QtnDtlR.$disp_seq, MST_QTN_D_R.$disp_seq);
				addColumnPathMap(QtnDtlR.$d_sub_char1, "d_sub_char1");
				addColumnPathMap(QtnDtlR.$d_sub_char2, "d_sub_char2");
				addColumnPathMap(QtnDtlR.$d_sub_char3, "d_sub_char3");
				addColumnPathMap(QtnDtlR.$dlv_cntry_nm, "dlv_cntry_nm");

			}

			@Override
			protected void valueCopy(D dest, S src) {

				dest.dlv_addr(concatAddress(src.dlv_addr1(), src.dlv_addr2(), src.dlv_addr3(), src.dlv_addr4()));
				dest.t_interim(src.getBooleanNE("interim_flg") ? MAC_STR.PRNT_INTERIM.name(toLocaleFromLclCd(src.getStringNE("prnt_lcl_cd"))) : null);
				dest.t_inc_tax(src.getBooleanNE("inc_tax_flg") ? MAC_STR.PRNT_INC_TAX.name(toLocaleFromLclCd(src.getStringNE("prnt_lcl_cd"))) : null);
			}
		}
		protected void callQtnAttachSrv(List<MCReportSet> rsList) {
			List<Attach_Chk01_DtlR> upLst = new ArrayList<Attach_Chk01_DtlR>(); 
			createQtnAttachLst(rsList,upLst);
			
			if(upLst.isEmpty()) {
				return;
			}
			
			MBBCL_AttachService.Attach_Upd01 ope = MBBCL_AttachService.crtAttach_Upd01();
			setQtnAttachUp(ope,upLst);
			ope.exec();
		}
		protected void createQtnAttachLst(List<MCReportSet> rsList,List<Attach_Chk01_DtlR> upLst) {
			for(MCReportSet rs: rsList) {
				//reportSetから、ヘッダを取得する
				String bt = rs.getBlockType(QtnHdrR.create());
				
				@SuppressWarnings("unchecked")
				MCList<MCRow> hdrL = rs.getAll(bt);

				if (hdrL == null || hdrL.isEmpty()) {
					continue;
				}
				
				QtnHdrR hdrR = (QtnHdrR) hdrL.get(0);
				//再発行は登録サービス呼び出し対象外
				if(isRePrntQtn(hdrR)) {
					continue;
				}
				editQtnAttachLst(rs,hdrR,upLst);
			}
		}
		protected void editQtnAttachLst(MCReportSet rs, QtnHdrR hdrR,List<Attach_Chk01_DtlR> upLst) {
			Attach_Chk01_DtlR up0 = Attach_Chk01_DtlR.create();
			copy(up0, hdrR, createMap_Attach_Chk01_DtlR_QtnHdrR());
			//WG
			up0.wg_cd(getWgCd(hdrR.sls_dpt_cd(), hdrR.qtn_dt()));
			//帳票ID
			up0.report_id(rs.getReportInfo().report_id());
			//添付元ファイル(バイナリ）
			up0.file_bin(rs.getReportInfo().save_file_bin());
			upLst.add(up0);
		}
		protected void setQtnAttachUp(MBBCL_AttachService.Attach_Upd01 ope,List<Attach_Chk01_DtlR> upLst) {
			ope.up0().addAll(upLst);
			ope.up1().upd_cntr_chk_flg(false);
			ope.up1().del_flg(false);
		}
		protected Boolean isRePrntQtn(QtnHdrR hdrR) {
			List<String> list = new ArrayList<>();
			list.add(hdrR.qtn_no());//no
			list.add(hdrR.qtn_rev().toString());//rev
			
			if(_rePrntQtnSet.contains(list)) {
				return true;
			}
			return false;
		}
		protected Map_Attach_Chk01_DtlR_QtnHdrR<Attach_Chk01_DtlR, QtnHdrR> createMap_Attach_Chk01_DtlR_QtnHdrR() {
			return new Map_Attach_Chk01_DtlR_QtnHdrR<Attach_Chk01_DtlR, QtnHdrR>();
		}
		
		public class Map_Attach_Chk01_DtlR_QtnHdrR<D extends Attach_Chk01_DtlR, S extends QtnHdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Attach_Chk01_DtlR.$biz_key1, QtnHdrR.$qtn_no);//見積ＮＯ
				addColumnPathMap(Attach_Chk01_DtlR.$dt, QtnHdrR.$qtn_dt);//見積日
				addColumnPathMap(Attach_Chk01_DtlR.$bp_cd, QtnHdrR.$cst_cd);//得意先ＣＤ
				addColumnPathMap(Attach_Chk01_DtlR.$cur_cd, QtnHdrR.$trd_cur_cd);//通貨ＣＤ
				addColumnPathMap(Attach_Chk01_DtlR.$sls_dpt_cd, QtnHdrR.$sls_dpt_cd);//売上部門CD
				addColumnPathMap(Attach_Chk01_DtlR.$cst_cd, QtnHdrR.$cst_cd);//得意先ＣＤ
				addColumnPathMap(Attach_Chk01_DtlR.$wrk_no, QtnHdrR.$wrk_no);//案件ＮＯ
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				dest.biz_typ(MAC_BIZ_TYP.QTN.value());//業務区分：見積
				dest.biz_key2(src.qtn_rev().toString());//見積改訂番号はNum→Str変換してセット
				dest.amt(src.ttl_trd_cur_amt().add(src.ttl_trd_cur_tax_amt()));//仕切税額合計
				dest.attach_file_flg(true);//ファイル添付フラグ
			}
		}
		/**再発行の帳票情報をセットに追加
		 */
		protected void addReprntSetKey(Set<List<String>> tgtSet,MST_QTN_R r) {
			List<String> keyLst = createReprntSetKey(r);
			if(!tgtSet.contains(keyLst)) {
				tgtSet.add(keyLst);
			}
		}
		protected List<String> createReprntSetKey(MST_QTN_R r){
			List<String> list = new ArrayList<>();
			if (!isNull(r)) {
				list.add(r.qtn_no());//no
				list.add(r.qtn_rev().toString());//rev
			}
			return list;
		}
	}
	/**
	 * 帳票ファイル情報取得用のリスナー
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