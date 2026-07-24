package mcframe.serverMSBH.MSBHL5090;

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
import mcframe.commonMSBH.MSBHR0010.*;
import mcframe.commonMSBH.MSBHR0020.*;
import mcframe.commonMSBH.MSBHR0040.*;
import mcframe.commonCore.report.container.MCReportSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.LinkedHashMap;
import java.util.Collections;
import mcframe.serverCore.report.MCServerReportManager;
import mcframe.serverCore.sys.MCSys;
import mcframe.serverMAUC.MAUCL1060.MAUCL_TrdUtil;

import static mcframe.serverMSBH.MSBHL5090.Query.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import java.util.Arrays;
import java.util.ArrayList;
import mcframe.serverMSUC.MSUCL0120.*;
import java.util.Set;
import java.util.HashSet;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.commonCore.report.MCFileWriteListener;
import mcframe.commonCore.report.MCReportFile;
import mcframe.commonCore.report.MCUCXSingleFile;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.serverMBBC.MBBCL5020.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBHL_ApPrntService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBHL_ApPrntService_MC extends MSBHL_ApPrntService_MC_A{
	//FMCB CUSTOM START
	public static final Class<MSBHL_ApPrntService> CLAZZ = MSBHL_ApPrntService.class;
	/**
	 * ApPrnt_Prnt01オペレーション.<p>
	 *
	 * 支払予定表を発行します。<br>
	 */
	public class ApPrnt_Prnt01 extends MSBHL_ApPrntService_MC_A.ApPrnt_Prnt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			MCList<ApPrnt_Prnt01_HdrR> okList = chkPaySchd();
			if (!okList.isEmpty()) {
				prnt(okList);
			}
		}

		/**
		 * 支払予定表が発行可能かをチェックし、発行可能な上り電文の行を返す。
		 * 
		 * @return
		 */
		protected MCList<ApPrnt_Prnt01_HdrR> chkPaySchd() {
			MCList<ApPrnt_Prnt01_HdrR> okList = createApPrnt_Prnt01_HdrL();
			
			MCList<MST_PAY_CHK_R> chkL = getPayChk();
			MCIndexKey chkIk = chkL.createIndex("pay_schd_no");

			for (ApPrnt_Prnt01_HdrR up : up0()) {
				MST_PAY_CHK_R chkR = chkL.getFirst(chkIk, up.pay_schd_no());
				MCMessageList msgList = new MCMessageList();
				
				if (chkR == null) {
					msgList.addAll(getRecordNotFoundMsg(
							"MS",
							"MST_PAY_SCHD",
							new String[]{PaySchdLstDtlR.$pay_schd_no},
							new Comparable[]{up.pay_schd_no()}, up));
				}
				else {
					// 承認状況チェック
					if (chkR.aprv_flg()
							&& !MAC_APRV_STS_TYP.isACPT(chkR.aprv_sts_typ())) {
						msgList.add(
								new MCMessage(up, null, MSBHL0031, up.pay_schd_no(),  toDispGUIIndex(up)));
					}
				}
				
				if (msgList.isEmpty()) {
					okList.add(up);
				}
				else {
					up.err_flg(true);
					MCMessagePool.addAll(msgList);
				}
				
				down0().add(up);
			}
			
			return okList;
		}
		
		/**
		 * チェック用の支払照合ヘッダを返す
		 * 
		 * @return
		 */
		protected MCList<MST_PAY_CHK_R> getPayChk() {
			MCList<MST_PAY_CHK_R> chkL = MCList.create(MST_PAY_CHK_R.class);
			MST_PAY_CHK_R t = MST_PAY_CHK_R.create("T");
			MST_PAY_SCHD_R t2 = MST_PAY_SCHD_R.create("T2");
			MCQueryApiBuilder chkL_bldr = MCQueryApiBuilder.create(t);
			chkL_bldr.setSelect(t.pay_chk_no, t.aprv_sts_typ, t.aprv_flg);
			chkL_bldr.addSelect(t2.pay_schd_no);
			chkL_bldr.addLeftOuterJoin(t2, bracket( t.pay_chk_mng_no.eq(t2.pay_chk_mng_no)));
			chkL_bldr.setWhere(t2.pay_schd_no.eq(bind("pay_schd_no")));
			chkL_bldr.setLockTable(t.pay_chk_mng_no);
			chkL_bldr.setOrderByAsc(chkL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectForUpdate("MSBHL5090_MST_PAY_CHK_S01", chkL, chkL_bldr, up0());
			return chkL;
		}

		/**
		 * 支払予定表を発行する
		 * 
		 * @param okList
		 */
		protected void prnt(MCList<ApPrnt_Prnt01_HdrR> okList) {
			MSBHR_PaySchdLst prnt_rs = MSBHR_PaySchdLst.create();
			
			MCList<PaySchdLstDtlR> dtl = srchPaySchd(okList);
			MCList<PaySchdLstDtlR>[] dtlGrp = dtl.groupList("pay_dpt_cd", "pay_dpt_nm");
			boolean isMulti = dtlGrp.length > 1;
			
			for (MCList<PaySchdLstDtlR> dtlSub : dtlGrp) {
				MSBHR_PaySchdLst reg_rs = MSBHR_PaySchdLst.create();

				setData(reg_rs, dtlSub);

				if (0 < reg_rs.size()) {
					prnt_rs.addAll(reg_rs.getAll());
					MCServerReportManager.request(reg_rs, !isMulti);
				}
			}

			if (isMulti) {
				MCServerReportManager.request(prnt_rs);
			}
		}
		
		/**
		 * 支払予定を検索する
		 * 
		 * @param okList
		 * @return
		 */
		protected MCList<PaySchdLstDtlR> srchPaySchd(MCList<ApPrnt_Prnt01_HdrR> okList) {
			MCList<PaySchdLstDtlR> dtl = MCList.create(PaySchdLstDtlR.class);
			MCRow r = MCRow.create();
			r.addStringColumn("pay_schd_no",
					MCStringUtil.arrayValueJoin(
							okList.getString(ApPrnt_Prnt01_HdrR.$pay_schd_no)
									.toArray(new String[okList.size()])));
			executeQuery(dtl, MSBHL5090_MST_PAY_SCHD_S01(), r);
			return dtl;
		}

		/**
		 * 取得した値を編集し、レポートセットにセットする
		 * 
		 * @param reportSet
		 * @param dtl
		 */
		protected void setData(MSBHR_PaySchdLst reportSet,
				MCList<PaySchdLstDtlR> dtl) {

			PaySchdLstHdrR hdr = createHdr(dtl.get(0));
			reportSet.addRow(hdr);

			putNumStr(reportSet, dtl,
					PaySchdLstDtlR.$s_int_amt,
					PaySchdLstDtlR.$s_dec_amt,
					PaySchdLstDtlR.$trd_cur_amt,
					PaySchdLstDtlR.$amt_dec_place);

			sortData(dtl);
			reportSet.addAll(dtl);
			setBizInfo(reportSet, hdr);
		}

		/**
		 * ヘッダを作成する
		 * 
		 * @param dtl
		 * @return
		 */
		protected PaySchdLstHdrR createHdr(PaySchdLstDtlR dtl) {
			PaySchdLstHdrR hdr = PaySchdLstHdrR.create();
			hdr.pay_dpt_cd(dtl.getStringNE("pay_dpt_cd"));
			hdr.pay_dpt_nm(dtl.getStringNE("pay_dpt_nm"));
			hdr.prnt_tm(MCDate.now());
			return hdr;
		}

		/**
		 * 明細をソートする
		 * 
		 * @param dtl
		 */
		protected void sortData(MCList<PaySchdLstDtlR> dtl) {
			dtl.sort(PaySchdLstDtlR.$psppl_cd, PaySchdLstDtlR.$bsppl_dpt_cd, 
					PaySchdLstDtlR.$bsppl_cd, PaySchdLstDtlR.$pay_schd_dt, 
					PaySchdLstDtlR.$ap_sttl_cd,	PaySchdLstDtlR.$trd_cur_cd, 
					PaySchdLstDtlR.$pay_chk_no,	PaySchdLstDtlR.$pay_schd_no);
		}

		/**
		 * 業務情報を設定する
		 * 
		 * @param reportSet
		 * @param hdr
		 */
		protected void setBizInfo(MSBHR_PaySchdLst reportSet, PaySchdLstHdrR hdr) {
			reportSet.setAppUsrCd1(hdr.pay_dpt_cd());
			reportSet.setAppUsrNm1(hdr.pay_dpt_nm());
		}
	}
	/**
	 * ApPrnt_Prnt02オペレーション.<p>
	 *
	 * 支払予定明細を発行します。<br>
	 */
	public class ApPrnt_Prnt02 extends MSBHL_ApPrntService_MC_A.ApPrnt_Prnt02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			MCList<ApPrnt_Prnt02_HdrR> okList = chkPayChk();
			if (!okList.isEmpty()) {
				prnt(okList);
			}
		}

		/**
		 * 支払予定明細が発行可能かをチェックし、発行可能な上り電文の行を返す。
		 * 
		 * @return
		 */
		protected MCList<ApPrnt_Prnt02_HdrR> chkPayChk() {
			MCList<ApPrnt_Prnt02_HdrR> okList = createApPrnt_Prnt02_HdrL();
			
			MCList<MST_PAY_CHK_R> chkL = getPayChk();
			MCIndexKey chkIk = chkL.createIndex(MST_PAY_CHK_R.$pay_chk_no);

			for (ApPrnt_Prnt02_HdrR up : up0()) {
				MST_PAY_CHK_R chkR = chkL.getFirst(chkIk, up.pay_chk_no());
				MCMessageList msgList = new MCMessageList();
				
				if (chkR == null) {
					msgList.addAll(getRecordNotFoundMsg(
							"MS",
							"MST_PAY_CHK",
							new String[]{MST_PAY_CHK_R.$pay_chk_no},
							new Comparable[]{up.pay_chk_no()}, up));
				}
				else {
					// 承認状況チェック
					if (chkR.aprv_flg()
							&& !MAC_APRV_STS_TYP.isACPT(chkR.aprv_sts_typ())) {
						msgList.add(
								new MCMessage(up, null, MSBHL0032, up.pay_chk_no(),  toDispGUIIndex(up)));
					}
				}
				
				if (msgList.isEmpty()) {
					okList.add(up);
				}
				else {
					up.err_flg(true);
					MCMessagePool.addAll(msgList);
				}
				
				down0().add(up);
			}
			
			return okList;
		}
		
		/**
		 * チェック用の支払照合ヘッダを返す
		 * 
		 * @return
		 */
		protected MCList<MST_PAY_CHK_R> getPayChk() {
			MCList<MST_PAY_CHK_R> chkL = MCList.create(MST_PAY_CHK_R.class);
			MST_PAY_CHK_R t = MST_PAY_CHK_R.create("T");
			MCQueryApiBuilder chkL_bldr = MCQueryApiBuilder.create(t);
			chkL_bldr.setSelect(t.pay_chk_no, t.aprv_sts_typ, t.aprv_flg);
			chkL_bldr.setWhere(t.pay_chk_no.eq(bind("pay_chk_no")));
			chkL_bldr.setOrderByAsc(chkL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectForUpdate("MSBHL5090_MST_PAY_CHK_S02", chkL, chkL_bldr, up0());
			return chkL;
		}

		/**
		 * 支払予定明細を発行する
		 * 
		 * @param okList
		 */
		protected void prnt(MCList<ApPrnt_Prnt02_HdrR> okList) {
			MSBHR_PaySchdDtl prnt_rs = MSBHR_PaySchdDtl.create();
			
			MCList<PaySchdHdrR> payChk = srchPayChk(okList);
			boolean isMulti = payChk.size() > 1;
			for (PaySchdHdrR r :  payChk) {
				MSBHR_PaySchdDtl reg_rs = MSBHR_PaySchdDtl.create();
				
				MCList<PaySchdDtlR> dtl = srchApD(r);

				setData(reg_rs, r, dtl);
				
				prnt_rs.addAll(reg_rs.getAll());
				MCServerReportManager.request(reg_rs, !isMulti);
			}

			if (isMulti) {
				MCServerReportManager.request(prnt_rs);
			}
		}
		
		/**
		 * 支払照合ヘッダを検索する
		 * 
		 * @param okList
		 * @return
		 */
		protected MCList<PaySchdHdrR> srchPayChk(MCList<ApPrnt_Prnt02_HdrR> okList) {
			MCList<PaySchdHdrR> payChk = MCList.create(PaySchdHdrR.class);
			MCRow r = MCRow.create();
			r.addStringColumn("pay_chk_no",
					MCStringUtil.arrayValueJoin(
							okList.getString(ApPrnt_Prnt02_HdrR.$pay_chk_no)
									.toArray(new String[okList.size()])));
			executeQuery(payChk, MSBHL5090_MST_PAY_CHK_S01(), r);
			return payChk;
		}
		
		/**
		 * 買掛明細を検索する
		 * 
		 * @param r
		 * @return
		 */
		protected MCList<PaySchdDtlR> srchApD(PaySchdHdrR r) {
			MCList<PaySchdDtlR> dtl = MCList.create(PaySchdDtlR.class);
			executeQuery(dtl, MSBHL5090_MST_AP_D_S01(), r);
			return dtl;
		}

		/**
		 * 取得した値を編集し、レポートセットにセットする
		 * 
		 * @param reportSet
		 * @param hdr
		 */
		protected void setData(MSBHR_PaySchdDtl reportSet,
				PaySchdHdrR hdr, MCList<PaySchdDtlR> dtl) {

			hdr.prnt_tm(MCDate.now());

			MCNumber amt_dec_place = hdr.getNumber("amt_dec_place");
			dtl.setNumber(PaySchdDtlR.$trd_cur_amt_dec_place, amt_dec_place);
			dtl.setNumber(PaySchdDtlR.$trd_cur_upri_dec_place, hdr.getNumber("upri_dec_place"));
			
			editDtl(reportSet, dtl);
			
			PaySchdFtrR ftr = createFtr(hdr);
			putNumStr(reportSet, ftr, PaySchdFtrR.$s_total_amt, PaySchdFtrR.$total_amt,
					amt_dec_place);
			putNumStr(reportSet, ftr, PaySchdFtrR.$s_total_com_paid,
					PaySchdFtrR.$total_com_paid, amt_dec_place);

			reportSet.addRow(hdr);
			reportSet.addAll(dtl);
			reportSet.addRow(ftr);
			
			setBizInfo(reportSet, hdr);
		}

		/**
		 * 明細を編集する
		 * 
		 * @param reportSet
		 * @param dtl
		 */
		protected void editDtl(MSBHR_PaySchdDtl reportSet, MCList<PaySchdDtlR> dtl) {

			MSC_PAY_MTD_TYP.putNameNE(dtl, PaySchdDtlR.$pay_mtd_typ,
					PaySchdDtlR.$pay_mtd_typ_nm, MCSys.user.locale());

			dtl.forEach(r -> {
				if (r.crryovr_flg() || MSC_PAY_MTD_TYP.isPART_PAY(r.pay_mtd_typ())) {
					r.part_pay_mark(MAC_STR.PRNT_NOTE_MARK.name(MCSys.user.locale()));
				}
				if (r.inc_tax_flg()) {
					r.s_inc_tax_flg(MAC_STR.PRNT_INC_TAX.name(MCSys.user.locale()));
				}

				r.trd_unit_qty(r.trd_unit_qty()
						.multiply(MAC_TRD_PTN_TYP.qty_disp_pm(r.trd_ptn_typ())));
				r.trd_cur_upri(r.trd_cur_upri().multiply(
						MAUCL_TrdUtil.getUpriDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
				r.trd_cur_amt(r.trd_cur_amt().multiply(
						MAUCL_TrdUtil.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
				r.trd_cur_tax_amt(r.trd_cur_tax_amt().multiply(
						MAUCL_TrdUtil.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
				if (!isNull(r.trd_cur_proc_upri())) {
					r.trd_cur_proc_upri(r.trd_cur_proc_upri().multiply(
							MAUCL_TrdUtil.getUpriDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
				}
				if (!isNull(r.trd_cur_proc_amt())) {
					r.trd_cur_proc_amt(r.trd_cur_proc_amt().multiply(
							MAUCL_TrdUtil.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
				}
				if (!isNull(r.trd_cur_onr_prov_upri())) {
					r.trd_cur_onr_prov_upri(r.trd_cur_onr_prov_upri().multiply(
							MAUCL_TrdUtil.getUpriDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
				}
				if (!isNull(r.trd_cur_onr_prov_amt())) {
					r.trd_cur_onr_prov_amt(r.trd_cur_onr_prov_amt().multiply(
							MAUCL_TrdUtil.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
				}
			});

			dtl.setAll(dtl.subList(r -> !isBaseTaxDeff(r)));

			putNumStr(reportSet, dtl, PaySchdDtlR.$s_int_unit_qty,
					PaySchdDtlR.$s_dec_unit_qty, PaySchdDtlR.$trd_unit_qty,
					PaySchdDtlR.$trd_unit_dec_place);
			putNumStr(reportSet, dtl, PaySchdDtlR.$s_int_upri, PaySchdDtlR.$s_dec_upri,
					PaySchdDtlR.$trd_cur_upri, PaySchdDtlR.$trd_cur_upri_dec_place);
			putNumStr(reportSet, dtl, PaySchdDtlR.$s_int_amt, PaySchdDtlR.$s_dec_amt,
					PaySchdDtlR.$trd_cur_amt, PaySchdDtlR.$trd_cur_amt_dec_place);
			putNumStr(reportSet, dtl, PaySchdDtlR.$s_int_tax_amt,
					PaySchdDtlR.$s_dec_tax_amt, PaySchdDtlR.$trd_cur_tax_amt,
					PaySchdDtlR.$trd_cur_amt_dec_place);
			putNumStr(reportSet, dtl, PaySchdDtlR.$s_int_tax_rate,
					PaySchdDtlR.$s_dec_tax_rate, PaySchdDtlR.$tax_rate);
			putNumStr(reportSet, dtl, PaySchdDtlR.$s_int_proc_upri,
					PaySchdDtlR.$s_dec_proc_upri, PaySchdDtlR.$trd_cur_proc_upri,
					PaySchdDtlR.$trd_cur_upri_dec_place);
			putNumStr(reportSet, dtl, PaySchdDtlR.$s_int_proc_amt,
					PaySchdDtlR.$s_dec_proc_amt, PaySchdDtlR.$trd_cur_proc_amt,
					PaySchdDtlR.$trd_cur_amt_dec_place);
			putNumStr(reportSet, dtl, PaySchdDtlR.$s_int_onr_prov_upri,
					PaySchdDtlR.$s_dec_onr_prov_upri, PaySchdDtlR.$trd_cur_onr_prov_upri,
					PaySchdDtlR.$trd_cur_upri_dec_place);
			putNumStr(reportSet, dtl, PaySchdDtlR.$s_int_onr_prov_amt,
					PaySchdDtlR.$s_dec_onr_prov_amt, PaySchdDtlR.$trd_cur_onr_prov_amt,
					PaySchdDtlR.$trd_cur_amt_dec_place);
			editItmSub(dtl);
		}

		/**
		 * 基準単位通貨のみの税差額調整か判断する
		 * @param r 明細データ
		 * @return 基準単位通貨のみ税差額調整の場合、trueを返す
		 */
		protected boolean isBaseTaxDeff(PaySchdDtlR r) {
			
			if (isNull(r.getNumberNE(MST_AP_D_R.$base_cur_tax_amt))) {
				return false;
			}
			else if (r.trd_cur_tax_amt().isZero()
					&& !r.getNumberNE(MST_AP_D_R.$base_cur_tax_amt).isZero()) {
				return true;
			}
			else {
				return false;
			}
		}

		protected void editItmSub(MCList<PaySchdDtlR> dtlL) {
			putPrntItmSub1(dtlL, PaySchdDtlR.$itm_sub1_view, PaySchdDtlR.$itm_sub1_data);
			putPrntItmSub2(dtlL, PaySchdDtlR.$itm_sub2_view, PaySchdDtlR.$itm_sub2_data);
			putPrntItmSub3(dtlL, PaySchdDtlR.$itm_sub3_view, PaySchdDtlR.$itm_sub3_data);

		}
		
		/**
		 * フッタを作成する
		 * 
		 * @param hdr
		 * @return
		 */
		protected PaySchdFtrR createFtr(PaySchdHdrR hdr) {
			PaySchdFtrR ftr = PaySchdFtrR.create();
			ftr.total_amt(hdr.getNumberNE("total_amt"));
			ftr.total_com_paid(hdr.getNumberNE("total_com_paid"));
			ftr.trd_cur_cd(hdr.getStringNE("trd_cur_cd"));
			ftr.trd_cur_nm(hdr.getStringNE("trd_cur_nm"));
			return ftr;
		}

		/**
		 * 業務情報を設定する
		 * 
		 * @param reportSet
		 * @param hdr
		 */
		protected void setBizInfo(MSBHR_PaySchdDtl reportSet, PaySchdHdrR hdr) {
			reportSet.setAppReportNo1(hdr.pay_chk_no());
			reportSet.setAppUsrCd1(hdr.bsppl_usr_cd());
			reportSet.setAppUsrNm1(hdr.bsppl_usr_nm());
			reportSet.setAppUsrCd2(hdr.bsppl_dpt_cd());
			reportSet.setAppUsrNm2(hdr.bsppl_dpt_nm());
			reportSet.setAppToCd1(hdr.bsppl_cd());
			reportSet.setAppToNm1(hdr.bsppl_nm());
			reportSet.setAppToCd2(hdr.psppl_cd());
			reportSet.setAppToNm2(hdr.psppl_nm());
		}
	}

	/**
	 * ApPrnt_Prnt03オペレーション.<p>
	 *
	 * 支払通知書を発行します。<br>
	 */
	public class ApPrnt_Prnt03 extends MSBHL_ApPrntService_MC_A.ApPrnt_Prnt03 {
		
		/**
		 * 支払通知書ReportSetマップ
		 */
		protected Map<String, List<MSBHR_PayNtc>> _payNtcReportMap = new LinkedHashMap<String, List<MSBHR_PayNtc>>();
		
		/**
		 * 支払照合ヘッダ
		 */
		protected MCList<MST_PAY_CHK_R> _payChkL = null;
		protected MCIndexKey _idxPayChk = null;
		
		/**
		 * 買掛明細
		 */
		protected MCList<MST_AP_D_R> _apDL = null;
		protected MCIndexKey _idxApD = null;
		
		/**
		 * 支払予定
		 */
		protected MCList<MST_PAY_SCHD_R> _paySchdL = null;
		protected MCIndexKey _idxPaySchd = null;
		
		/**
		 * 支払実績明細
		 */
		protected MCList<MST_PAY_ACT_D_R> _payActDL = null;
		protected MCIndexKey _idxPayActD = null;
		
		/**
		 * 前渡金実績
		 */
		protected MCList<MST_ADV_PAY_ACT_R> _advPayActL = null;
		protected MCIndexKey _idxAdvPayAct = null;
		
		/** 
		 * 明細の行数のカウンタ 
		 */
		protected int _rowCnt = 0;
		
		/**
		 * 明細の１ページあたりの最大行数
		 */
		protected final static int _MAX_ROW_COUNT = 8;
		
		/**
		 * 支払通知書の支払予定表示行数
		 */
		protected final static int _PAY_SCHD_MAX_ROW_COUNT = 5;
		
		/**
		 * 支払通知書の税表示行数
		 */
		protected final static int _TAX_MAX_ROW_COUNT = 10;
		
		/**
		 * 支払通知書の税表示年月のカラム名
		 */
		protected final static String _TAX_YM_COL = "tax_ym1";
		
		/**
		 * 相殺ＦＬＧのカラム名
		 */
		protected final static String _SETOFF_FLG_COL = "setoff_flg";
		
		/**
		 * 支払通知書の税表示月別インデント
		 */
		protected final static String _TAX_YM_INDENT = "   ";
		/** 再発行する支払通知書キーのセット*/
		protected Set<List<String>> _rePrntPayChkSet = new HashSet<List<String>>();
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			MCList<ApPrnt_Prnt03_HdrR> okList = chkPayNtc();
			if (!okList.isEmpty()) {
				getPayChk(okList);
				getApD(okList);
				getPaySchd();
				getPayActD();
				getAdvPayAct();
				
				prnt(okList);
			}
		}
		
		/**
		 * 支払通知書が発行可能かをチェックし、発行可能な上り電文の行を返す
		 * @return エラーなしデータ
		 */
		protected MCList<ApPrnt_Prnt03_HdrR> chkPayNtc() {
			MCList<ApPrnt_Prnt03_HdrR> okList = createApPrnt_Prnt03_HdrL();
			
			MCList<MST_PAY_CHK_R> chkL = getPayChk();
			MCIndexKey chkIk = chkL.createIndex(MST_PAY_CHK_R.$pay_chk_no);
			
			MCList<MAM_BP_R> chkBpL = getBpChk(chkL);
			MCIndexKey chkBpIk = chkBpL.createIndex(MAM_BP_R.$bp_cd);

			for (ApPrnt_Prnt03_HdrR up : up0()) {
				MST_PAY_CHK_R chkR = chkL.getFirst(chkIk, up.pay_chk_no());
				MCMessageList msgList = new MCMessageList();
				
				if (chkR == null) {
					msgList.addAll(getRecordNotFoundMsg(
							"MS",
							"MST_PAY_CHK",
							new String[]{MST_PAY_CHK_R.$pay_chk_no},
							new Comparable[]{up.pay_chk_no()}, up));
				}
				else {
					// 支払通知書発行対象チェック
					MAM_BP_R chkBpR = chkBpL.getFirst(chkBpIk, chkR.bsppl_cd());
					if (isNull(chkBpR)) {
						msgList.add(
								new MCMessage(up, null, MSBHL0026, chkR.bsppl_cd()));
					}
					else if(!chkBpR.pay_ntc_prnt_flg()) {
						msgList.add(
								new MCMessage(up, null, MSBHL0254, chkR.pay_chk_no(), chkR.bsppl_cd()));
					}
					
					// 承認状況チェック
					if (chkR.aprv_flg()
							&& !MAC_APRV_STS_TYP.isACPT(chkR.aprv_sts_typ())) {
						msgList.add(
								new MCMessage(up, null, MSBHL0253, up.pay_chk_no(), toDispGUIIndex(up)));
					}
				}
				
				if (msgList.isEmpty()) {
					okList.add(up);
				}
				else {
					up.err_flg(true);
					MCMessagePool.addAll(msgList);
				}
				
				down0().add(up);
			}
			
			return okList;
		}
		
		/**
		 * チェック用の支払照合ヘッダを返す
		 * @return チェック用の支払照合ヘッダ
		 */
		protected MCList<MST_PAY_CHK_R> getPayChk() {
			MCList<MST_PAY_CHK_R> chkL = MCList.create(MST_PAY_CHK_R.class);
			MST_PAY_CHK_R t = MST_PAY_CHK_R.create("T");
			MCQueryApiBuilder chkL_bldr = MCQueryApiBuilder.create(t);
			chkL_bldr.setSelect(t.pay_chk_no);
			chkL_bldr.addSelect(t.bsppl_cd);
			chkL_bldr.addSelect(t.aprv_sts_typ);
			chkL_bldr.addSelect(t.aprv_flg);
			chkL_bldr.setWhere(t.pay_chk_no.eq(bind("pay_chk_no")));
			chkL_bldr.setOrderByAsc(chkL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectForUpdate("MSBHL5090_MST_PAY_CHK_S03", chkL, chkL_bldr, up0());
			return chkL;
		}
		
		/**
		 * チェック用の取引先マスタを返す
		 * @param chkL チェック用の支払照合ヘッダ
		 * @return チェック用の取引先マスタ
		 */
		protected MCList<MAM_BP_R> getBpChk(MCList<MST_PAY_CHK_R> chkL) {
			MCList<MAM_BP_R> chkBpL = MCList.create(MAM_BP_R.class);
			MAM_BP_R t = MAM_BP_R.create("T");
			MCQueryApiBuilder chkBpL_bldr = MCQueryApiBuilder.create(t);
			chkBpL_bldr.setSelect(t.bp_cd);
			chkBpL_bldr.addSelect(t.pay_ntc_prnt_flg);
			chkBpL_bldr.setWhere(t.bp_cd.eq(bind("bsppl_cd")));
			chkBpL_bldr.addWhereWithAnd(t.del_flg.eq(value(false)));
			chkBpL_bldr.setOrderByAsc(chkBpL_bldr.getBaseDbc().getKeyColumn$());
			dbSelect("MSBHL5090_MAM_BP_S01", chkBpL, chkBpL_bldr, chkL);
			return chkBpL;
		}
		
		/**
		 * 支払照合ヘッダを取得する
		 * @param okList エラーなしデータ
		 */
		protected void getPayChk(MCList<ApPrnt_Prnt03_HdrR> okList) {
			_payChkL = MCList.create(MST_PAY_CHK_R.class);
			_payChkL.addBooleanColumn(MAM_BP_R.$pay_ntc_dtl_outp_flg);
			_payChkL.addBooleanColumn(MAM_BP_R.$pay_ntc_bfw_bal_disp_flg);
			_payChkL.addBooleanColumn(MAM_BP_R.$pay_ntc_dtl_pay_flg);
			
			executeQuery(_payChkL, MSBHL5090_MST_PAY_CHK_S02(), okList);
			
			_idxPayChk = _payChkL.createIndex(MST_PAY_CHK_R.$pay_chk_no);
		}
		
		/**
		 * 買掛明細を取得する
		 * @param okList エラーなしデータ
		 */
		protected void getApD(MCList<ApPrnt_Prnt03_HdrR> okList) {
			_apDL = MCList.create(MST_AP_D_R.class);
			_apDL.addBooleanColumn(MAM_ITM_R.$dscnt_itm_flg);
			_apDL.addNumberColumn(MAM_TAX_R.$tax_rate);
			_apDL.addBooleanColumn(MAM_TAX_R.$inc_tax_flg);
			_apDL.addNumberColumn("part_pay_ntc_ttl_amt");
			_apDL.addNumberColumn("part_pay_ntc_crryovr_amt");
			
			executeQuery(_apDL, MSBHL5090_MST_AP_D_S02(), okList);
			
			_idxApD = _apDL.createIndex(MST_AP_D_R.$pay_chk_no);
		}
		
		/**
		 * 支払予定を取得する
		 */
		protected void getPaySchd() {
			_paySchdL = MCList.create(MST_PAY_SCHD_R.class);
			
			executeQuery(_paySchdL, MSBHL5090_MST_PAY_SCHD_S02(), _payChkL);
			
			_idxPaySchd = _paySchdL.createIndex(MST_PAY_SCHD_R.$pay_chk_mng_no);
		}
		
		/**
		 * 支払実績明細を取得する
		 */
		protected void getPayActD() {
			_payActDL = MCList.create(MST_PAY_ACT_D_R.class);
			_payActDL.addDateColumn(MST_PAY_ACT_R.$pay_act_dt);
			_payActDL.addDateColumn(MST_PAY_ACT_R.$ac_dt);
			_payActDL.addNumberColumn(MAM_TAX_R.$tax_rate);
			_payActDL.addBooleanColumn(MAM_TAX_R.$inc_tax_flg);
			_payActDL.addBooleanColumn(MAM_STTL_R.$bill_tax_disp_flg);
			executeQuery(_payActDL, MSBHL5090_MST_PAY_ACT_D_S01(), _payChkL);
			
			_idxPayActD = _payActDL.createIndex(MST_PAY_ACT_D_R.$calc_tgt_pay_chk_mng_no);
		}
		
		/**
		 * 前渡金実績を取得する
		 */
		protected void getAdvPayAct() {
			_advPayActL = MCList.create(MST_ADV_PAY_ACT_R.class);
			_advPayActL.addNumberColumn(MAM_TAX_R.$tax_rate);
			_advPayActL.addBooleanColumn(MAM_TAX_R.$inc_tax_flg);
			_advPayActL.addBooleanColumn(MAM_STTL_R.$bill_tax_disp_flg);
			
			executeQuery(_advPayActL, MSBHL5090_MST_ADV_PAY_ACT_S01(), _payChkL);
			
			_idxAdvPayAct = _advPayActL.createIndex(MST_ADV_PAY_ACT_R.$pay_chk_mng_no);
		}
		
		/**
		 * 支払通知書を印刷する
		 * @param okList エラーなしデータ
		 */
		protected void prnt(MCList<ApPrnt_Prnt03_HdrR> okList) {
			
			okList.sort(ApPrnt_Prnt03_HdrR.$pay_chk_no);
			for (ApPrnt_Prnt03_HdrR r : okList) {
				
				MST_PAY_CHK_R payChkR = _payChkL.getFirst(_idxPayChk, r.pay_chk_no());
				MCList<MST_AP_D_R> apDL = _apDL.subList(_idxApD, r.pay_chk_no());
				MCList<MST_PAY_SCHD_R> paySchdL = _paySchdL.subList(_idxPaySchd, payChkR.pay_chk_mng_no());
				MCList<MST_PAY_ACT_D_R> payActDL = _payActDL.subList(_idxPayActD, payChkR.pay_chk_mng_no());
				MCList<MST_ADV_PAY_ACT_R> advPayActL = _advPayActL.subList(_idxAdvPayAct, payChkR.pay_chk_mng_no());
				
				setDispPm(apDL);
				
				MSBHR_PayNtc payNtcReportSet = new MSBHR_PayNtc();
				
				makeHdr(payNtcReportSet, payChkR, apDL, paySchdL, payActDL, advPayActL);
				makeDtl(payNtcReportSet, payChkR, apDL, payActDL, advPayActL);
				
				setPayNtcBizInfo(payNtcReportSet, payChkR);
				
				crtReportMap(payNtcReportSet, payChkR.bsppl_cd());
			}
			sort();
			prntAll();
			
			updPayChk();
		}
		
		/**
		 * 単価、数量、金額の表示用の符号を設定する
		 * @param apDL 買掛明細
		 */
		protected void setDispPm(MCList<MST_AP_D_R> apDL) {
			
			for (MST_AP_D_R apDR : apDL) {
				apDR.trd_unit_qty(apDR.trd_unit_qty().multiply(MAC_TRD_PTN_TYP.qty_disp_pm(apDR.trd_ptn_typ())));
				apDR.trd_cur_upri(apDR.trd_cur_upri().multiply(
						MAUCL_TrdUtil.getUpriDispPm(apDR.trd_ptn_typ(), apDR.getBooleanNE(MAM_ITM_R.$dscnt_itm_flg))));
				apDR.trd_cur_amt(apDR.trd_cur_amt().multiply(
						MAUCL_TrdUtil.getAmtDispPm(apDR.trd_ptn_typ(), apDR.getBooleanNE(MAM_ITM_R.$dscnt_itm_flg))));
				apDR.trd_cur_tax_amt(apDR.trd_cur_tax_amt().multiply(
						MAUCL_TrdUtil.getAmtDispPm(apDR.trd_ptn_typ(), apDR.getBooleanNE(MAM_ITM_R.$dscnt_itm_flg))));
				apDR.base_cur_tax_amt(apDR.base_cur_tax_amt().multiply(
						MAUCL_TrdUtil.getAmtDispPm(apDR.trd_ptn_typ(), apDR.getBooleanNE(MAM_ITM_R.$dscnt_itm_flg))));
			}
		}

		/**
		 * 支払通知書の印刷情報を作成する
		 * @param payNtcReportSet 支払通知書ReportSet
		 * @param payChkR 支払照合ヘッダ
		 * @param apDL 買掛明細
		 * @param paySchdL 支払予定
		 * @param payActDL 支払実績明細
		 * @param advPayActL 前渡金実績
		 */
		protected void makeHdr(MSBHR_PayNtc payNtcReportSet, MST_PAY_CHK_R payChkR,
				MCList<MST_AP_D_R> apDL, MCList<MST_PAY_SCHD_R> paySchdL,
				MCList<MST_PAY_ACT_D_R> payActDL, MCList<MST_ADV_PAY_ACT_R> advPayActL) {
			
			PayNtcHdrR payNtcHdrR = PayNtcHdrR.create();
			
			copy(payNtcHdrR, payChkR, createMap_PayNtcHdrR_MST_PAY_CHK_R());
			
			setHdrDt(payNtcHdrR, payChkR, apDL);
			
			setHdrAmt(payNtcHdrR, payChkR);
			
			MCList<PayNtcHdrR> hdrTaxL = MCList.create(PayNtcHdrR.class);
			setHdrTax(hdrTaxL, payChkR, apDL, payActDL, advPayActL);
			
			setHdrPaySchd(payNtcHdrR, payChkR, paySchdL);
			
			putNumStrHdr(payNtcReportSet, payNtcHdrR, hdrTaxL, payChkR);
			
			setHdrReport(payNtcReportSet, payNtcHdrR, hdrTaxL);
			if(payChkR.prnt_flg()) {
				addReprntSetKey(_rePrntPayChkSet,payChkR);	
			}
		}
		
		/**
		 * ヘッダーの日付を設定する
		 * @param payNtcHdrR 支払通知書データ
		 * @param payChkR 支払照合ヘッダ
		 * @param apDL 買掛明細
		 */
		protected void setHdrDt(PayNtcHdrR payNtcHdrR, MST_PAY_CHK_R payChkR, MCList<MST_AP_D_R> apDL) {
			
			payNtcHdrR.prnt_tm(MCDate.now());
			payNtcHdrR.reg_dt(payChkR.reg_dt());
			
			if (payChkR.pay_spot_flg()) {
				payNtcHdrR.pay_ntc_ym(apDL.get(0).pay_basis_dt());
			}
			else {
				payNtcHdrR.pay_ntc_ym(payChkR.bsppl_cl_dt());
				payNtcHdrR.pay_ntc_cl_day(payChkR.bsppl_cl_dt().getDay());
			}
		}

		/**
		 * ヘッダーの金額を設定する
		 * @param payNtcHdrR 支払通知書データ
		 * @param payChkR 支払照合ヘッダ
		 */
		protected void setHdrAmt(PayNtcHdrR payNtcHdrR, MST_PAY_CHK_R payChkR) {
			
			// ヘッダへの金額設定
			payNtcHdrR.purc_amt(payChkR.purc_amt());
			payNtcHdrR.dscnt_amt(payChkR.purc_dscnt_amt());
			payNtcHdrR.ret_amt(payChkR.purc_ret_amt());
			payNtcHdrR.sw_to_amt(payChkR.sw_to_amt());
			payNtcHdrR.adv_pay_bal(payChkR.adv_pay_bal());
			
			// 繰越金額を表示する場合
			if (isBfwBalDisp(payChkR)) {
				payNtcHdrR.schd_pay_amt(payChkR.schd_pay_amt());
				payNtcHdrR.last_pay_schd_amt(payChkR.last_pay_schd_amt());
				payNtcHdrR.pay_amt(sum(payChkR.account_amt(), payChkR.cash_amt(), payChkR.note_amt()));
				payNtcHdrR.sw_amt(payChkR.sw_amt());
				payNtcHdrR.setoff_amt(payChkR.setoff_amt().multiply(-1));
				payNtcHdrR.bfw_amt(payChkR.bfw_amt());
				payNtcHdrR.tax_amt(payChkR.tax_amt().subtract(payChkR.setoff_tax_amt()));
				payNtcHdrR.adv_pay_amt(payChkR.adv_pay_amt());
				payNtcHdrR.adv_pay_setoff_amt(payChkR.adv_pay_setoff_amt());
				payNtcHdrR.adv_pay_setoff_tax_amt(payChkR.adv_pay_setoff_tax_amt());
			}
			// 繰越金額を表示しない場合
			else {
				MCNumber deffPaySchdAmt = payChkR.bfw_amt().subtract(payChkR.sw_amt());
				payNtcHdrR.schd_pay_amt(payChkR.schd_pay_amt().subtract(deffPaySchdAmt));
				payNtcHdrR.last_pay_schd_amt(null);
				payNtcHdrR.pay_amt(null);
				payNtcHdrR.sw_amt(payChkR.sw_amt().isZero() ? null : payChkR.sw_amt());
				payNtcHdrR.setoff_amt(null);
				payNtcHdrR.bfw_amt(payChkR.sw_amt().isZero() ? null : payChkR.sw_amt().negate());
				payNtcHdrR.tax_amt(payChkR.tax_amt());
				
				if (isPayActDisp(payChkR)) {
					payNtcHdrR.adv_pay_amt(payChkR.adv_pay_amt());
					payNtcHdrR.adv_pay_setoff_amt(payChkR.adv_pay_setoff_amt());
					payNtcHdrR.adv_pay_setoff_tax_amt(payChkR.adv_pay_setoff_tax_amt());
				}
				else {
					payNtcHdrR.adv_pay_amt(null);
					payNtcHdrR.adv_pay_setoff_amt(null);
					payNtcHdrR.adv_pay_setoff_tax_amt(null);
				}
			}
		}
		
		/**
		 * 繰越金額を表示するかどうかを判断する
		 * @param payChkR 支払照合ヘッダ
		 * @return 繰越金額を表示する場合にtrueを返す
		 */
		protected boolean isBfwBalDisp(MST_PAY_CHK_R payChkR) {
			
			if (!isPayActDisp(payChkR)) {
				return false;
			}
			
			// 前回支払予定がゼロで支払合計も振替もゼロの場合は表示しない
			MCNumber payAmt = sum(payChkR.account_amt(), payChkR.cash_amt(), payChkR.note_amt(), payChkR.setoff_amt());
			if (payChkR.last_pay_schd_amt().isZero() && payAmt.isZero() && payChkR.sw_amt().isZero()) {
				return false;
			}
			
			return true;
		}

		/**
		 * 支払関連を表示するかどうかを判断する
		 * @param payChkR 支払照合ヘッダ
		 * @return 支払関連を表示する場合にtrueを返す
		 */
		protected boolean isPayActDisp(MST_PAY_CHK_R payChkR) {
			
			// 支払通知書前月残高表示が不要に設定されている場合は表示しない
			if (!payChkR.getBooleanNE(MAM_BP_R.$pay_ntc_bfw_bal_disp_flg)) {
				return false;
			}
			
			// 都度支払の場合は表示しない
			if (payChkR.pay_spot_flg()) {
				return false;
			}
			
			return true;
		}

		/**
		 * ヘッダの税額の内訳を設定する
		 * @param hdrTaxL 税額の内訳
		 * @param payChkR 支払照合ヘッダ
		 * @param apDL 買掛明細
		 * @param payActDL 支払実績明細
		 * @param advPayActL 前渡金実績
		 */
		protected void setHdrTax(MCList<PayNtcHdrR> hdrTaxL, MST_PAY_CHK_R payChkR, MCList<MST_AP_D_R> apDL,
				MCList<MST_PAY_ACT_D_R> payActDL, MCList<MST_ADV_PAY_ACT_R> advPayActL) {
			
			MCList<PayNtcHdrR> taxL = sumTax(payChkR, apDL, payActDL, advPayActL);
			
			if (taxL.isEmpty()) {
				return;
			}
			
			// 外貨ＦＬＧ
			boolean foreignFlg = !isSame(payChkR.trd_cur_cd(), getBaseCur().cur_cd()) && !isNull(payChkR.pay_xrate ());
			
			int taxRowCnt = 0;
			PayNtcHdrR hdrTaxR = PayNtcHdrR.create();
			
			for (MCList<PayNtcHdrR> taxGrpL : taxL.groupList(PayNtcHdrR.$tax_rate1)) {
				
				if (isNull(taxGrpL.get(0).getNumberNE(PayNtcHdrR.$tax_rate1))) {
					continue;
				}
				
				if (taxRowCnt > 0 && taxRowCnt + taxGrpL.size() + 1 > _TAX_MAX_ROW_COUNT) {
					// ヘッダ改行の処理
					hdrTaxL.add(hdrTaxR);
					hdrTaxR = PayNtcHdrR.create();
					taxRowCnt = 0;
				}
				
				// 税率ごとの内訳を設定する
				taxRowCnt++;
				hdrTaxR.setValueNE(getColumnNmByRowCnt(PayNtcHdrR.$tax_rate1, taxRowCnt), taxGrpL.get(0).tax_rate1());
				hdrTaxR.setValueNE(getColumnNmByRowCnt(PayNtcHdrR.$tax_rate_purc_amt1, taxRowCnt), taxGrpL.sum(PayNtcHdrR.$tax_rate_purc_amt1));
				hdrTaxR.setValueNE(getColumnNmByRowCnt(PayNtcHdrR.$tax_rate_tax_amt1, taxRowCnt), taxGrpL.sum(PayNtcHdrR.$tax_rate_tax_amt1));
				if (foreignFlg) {
					hdrTaxR.setValueNE(getColumnNmByRowCnt(PayNtcHdrR.$tax_rate_base_tax_amt1, taxRowCnt), taxGrpL.sum(PayNtcHdrR.$tax_rate_base_tax_amt1));
				}
				
				// 対象月ごとの内訳を設定する
				for (PayNtcHdrR taxYmR : taxGrpL) {
					taxRowCnt++;
					hdrTaxR.setValueNE(getColumnNmByRowCnt(_TAX_YM_COL, taxRowCnt), toYMString(taxYmR.getDateNE(_TAX_YM_COL)));
					hdrTaxR.setValueNE(getColumnNmByRowCnt(PayNtcHdrR.$tax_rate_purc_amt1, taxRowCnt), taxYmR.tax_rate_purc_amt1());
					hdrTaxR.setValueNE(getColumnNmByRowCnt(PayNtcHdrR.$tax_rate_tax_amt1, taxRowCnt), taxYmR.tax_rate_tax_amt1());
					if (foreignFlg) {
						hdrTaxR.setValueNE(getColumnNmByRowCnt(PayNtcHdrR.$tax_rate_base_tax_amt1, taxRowCnt), taxYmR.tax_rate_base_tax_amt1());
					}
				}
				
				// 空白行の追加
				taxRowCnt++;
			}
			
			hdrTaxL.add(hdrTaxR);
		}
		
		/**
		 * 税額を税率、年月ごとに集計する
		 * @param payChkR 支払照合ヘッダ
		 * @param apDL 買掛明細
		 * @param payActDL 支払実績明細
		 * @param advPayActL 前渡金実績
		 * @return 集計結果
		 */
		protected MCList<PayNtcHdrR> sumTax(MST_PAY_CHK_R payChkR, MCList<MST_AP_D_R> apDL, MCList<MST_PAY_ACT_D_R> payActDL, MCList<MST_ADV_PAY_ACT_R> advPayActL) {
			
			MCList<PayNtcHdrR> taxL = MCList.create(PayNtcHdrR.class);
			taxL.addDateColumn(_TAX_YM_COL);
			
			MCIndexKey payActDLIdx= payActDL.createIndex(MST_PAY_ACT_D_R.$ap_sttl_typ,  MAM_STTL_R.$bill_tax_disp_flg);
			MCIndexKey advPayActLIdx = advPayActL.createIndex(MST_ADV_PAY_ACT_R.$com_paid_ap_sttl_typ, MAM_STTL_R.$bill_tax_disp_flg);
			
			addAll(taxL, apDL, createMap_PayNtcHdrR_MST_AP_D_R());
			if (isPayActDisp(payChkR)) {
				addAll(taxL, payActDL.subList(payActDLIdx, MAC_AP_STTL_TYP.SETOFF.value(), true), createMap_PayNtcHdrR_MST_PAY_ACT_D_R());
				addAll(taxL, advPayActL.subList(advPayActLIdx, MAC_AP_STTL_TYP.SETOFF.value(), true), createMap_PayNtcHdrR_MST_ADV_PAY_ACT_R());
			}
			
			MCGroupByPolicy policy = new MCGroupByPolicy(PayNtcHdrR.$tax_rate1, _TAX_YM_COL);
			policy.sum(PayNtcHdrR.$tax_rate_purc_amt1, PayNtcHdrR.$tax_rate_tax_amt1, PayNtcHdrR.$tax_rate_base_tax_amt1);
			
			taxL = taxL.groupBy(policy);
			taxL.sort(PayNtcHdrR.$tax_rate1, _TAX_YM_COL);
			
			return taxL;
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
		
		/**
		 * ヘッダの支払予定情報を設定する
		 * @param payNtcHdrR 支払通知書データ
		 * @param payChkR 支払照合ヘッダ
		 * @param paySchdL 支払予定
		 */
		protected void setHdrPaySchd(PayNtcHdrR payNtcHdrR, MST_PAY_CHK_R payChkR, MCList<MST_PAY_SCHD_R> paySchdL) {
			
			if (!payChkR.getBooleanNE(MAM_BP_R.$pay_ntc_dtl_pay_flg)) {
				return;
			}
			
			paySchdL.sort(MST_PAY_SCHD_R.$pay_schd_dt, MST_PAY_SCHD_R.$ap_sttl_cd, MST_PAY_SCHD_R.$pay_bank_ac_cd);
			
			int paySchdRowCnt = 0;
			MCNumber paySchdAmtSum = MCNumber.ZERO;
			
			for (MST_PAY_SCHD_R paySchdR : paySchdL) {
				
				paySchdRowCnt++;
				if (paySchdRowCnt < _PAY_SCHD_MAX_ROW_COUNT
						|| (paySchdRowCnt == _PAY_SCHD_MAX_ROW_COUNT && paySchdL.size() == _PAY_SCHD_MAX_ROW_COUNT)) {
					
					payNtcHdrR.setValueNE(getColumnNmByRowCnt(PayNtcHdrR.$pay_schd_dt1, paySchdRowCnt), paySchdR.pay_schd_dt());
					payNtcHdrR.setValueNE(getColumnNmByRowCnt(PayNtcHdrR.$sttl_cd1, paySchdRowCnt), paySchdR.ap_sttl_cd());
					payNtcHdrR.setValueNE(getColumnNmByRowCnt(PayNtcHdrR.$sttl_nm1, paySchdRowCnt), paySchdR.getStringNE(MAM_STTL_R.$sttl_nm));
					payNtcHdrR.setValueNE(getColumnNmByRowCnt(PayNtcHdrR.$pay_schd_amt1, paySchdRowCnt), paySchdR.trd_cur_amt());
					payNtcHdrR.setValueNE(getColumnNmByRowCnt(PayNtcHdrR.$bank_cd1, paySchdRowCnt), paySchdR.getStringNE(MAM_BANK_AC_R.$bank_cd));
					payNtcHdrR.setValueNE(getColumnNmByRowCnt(PayNtcHdrR.$bank_nm1, paySchdRowCnt), paySchdR.getStringNE(MAM_BANK_R.$bank_nm));
					payNtcHdrR.setValueNE(getColumnNmByRowCnt(PayNtcHdrR.$branch_cd1, paySchdRowCnt), paySchdR.getStringNE(MAM_BANK_AC_R.$branch_cd));
					payNtcHdrR.setValueNE(getColumnNmByRowCnt(PayNtcHdrR.$branch_nm1, paySchdRowCnt), paySchdR.getStringNE(MAM_BANK_BRANCH_R.$branch_nm));
					payNtcHdrR.setValueNE(getColumnNmByRowCnt(PayNtcHdrR.$bank_ac_no1, paySchdRowCnt), paySchdR.getStringNE(MAM_BANK_AC_R.$bank_ac_no));
					
					paySchdAmtSum = paySchdAmtSum.add(paySchdR.trd_cur_amt());
				}
				else {
					break;
				}
			}
			
			if (paySchdL.size() > _PAY_SCHD_MAX_ROW_COUNT) {
				payNtcHdrR.setValueNE(getColumnNmByRowCnt(PayNtcHdrR.$sttl_nm1, _PAY_SCHD_MAX_ROW_COUNT),
						MSC_PAY_NTC_PRNT_STR.ELSE_PAY_SCHD.name(MCSys.user.locale()));
				payNtcHdrR.setValueNE(getColumnNmByRowCnt(PayNtcHdrR.$pay_schd_amt1,_PAY_SCHD_MAX_ROW_COUNT),
						paySchdL.sum(MST_PAY_SCHD_R.$trd_cur_amt).subtract(paySchdAmtSum));
			}
		}
		
		/**
		 * ヘッダの数値カラムの値を指定の文字列カラムに設定する
		 * @param payNtcReportSet 支払通知書ReportSet
		 * @param payNtcHdrR 支払通知書データ
		 * @param hdrTaxL 税額の内訳
		 * @param payChkR 支払照合ヘッダ
		 */
		protected void putNumStrHdr(MSBHR_PayNtc payNtcReportSet, PayNtcHdrR payNtcHdrR, MCList<PayNtcHdrR> hdrTaxL, MST_PAY_CHK_R payChkR) {
			
			MCNumber decPlace = payChkR.getNumberNE(MAM_CUR_R.$amt_dec_place);
			
			putNumStr(payNtcReportSet, payNtcHdrR, PayNtcHdrR.$s_schd_pay_amt, PayNtcHdrR.$schd_pay_amt, decPlace);
			putNumStr(payNtcReportSet, payNtcHdrR, PayNtcHdrR.$s_pay_xrate, PayNtcHdrR.$pay_xrate, decPlace);
			putNumStr(payNtcReportSet, payNtcHdrR, PayNtcHdrR.$s_last_pay_schd_amt, PayNtcHdrR.$last_pay_schd_amt, decPlace);
			putNumStr(payNtcReportSet, payNtcHdrR, PayNtcHdrR.$s_pay_amt, PayNtcHdrR.$pay_amt, decPlace);
			putNumStr(payNtcReportSet, payNtcHdrR, PayNtcHdrR.$s_sw_amt, PayNtcHdrR.$sw_amt, decPlace);
			putNumStr(payNtcReportSet, payNtcHdrR, PayNtcHdrR.$s_setoff_amt, PayNtcHdrR.$setoff_amt, decPlace);
			putNumStr(payNtcReportSet, payNtcHdrR, PayNtcHdrR.$s_bfw_amt, PayNtcHdrR.$bfw_amt, decPlace);
			putNumStr(payNtcReportSet, payNtcHdrR, PayNtcHdrR.$s_purc_amt, PayNtcHdrR.$purc_amt, decPlace);
			putNumStr(payNtcReportSet, payNtcHdrR, PayNtcHdrR.$s_dscnt_amt, PayNtcHdrR.$dscnt_amt, decPlace);
			putNumStr(payNtcReportSet, payNtcHdrR, PayNtcHdrR.$s_ret_amt, PayNtcHdrR.$ret_amt, decPlace);
			putNumStr(payNtcReportSet, payNtcHdrR, PayNtcHdrR.$s_tax_amt, PayNtcHdrR.$tax_amt, decPlace);
			putNumStr(payNtcReportSet, payNtcHdrR, PayNtcHdrR.$s_sw_to_amt, PayNtcHdrR.$sw_to_amt, decPlace);
			
			putNumStr(payNtcReportSet, payNtcHdrR, PayNtcHdrR.$s_adv_pay_bal, PayNtcHdrR.$adv_pay_bal, decPlace);
			putNumStr(payNtcReportSet, payNtcHdrR, PayNtcHdrR.$s_adv_pay_amt, PayNtcHdrR.$adv_pay_amt, decPlace);
			putNumStr(payNtcReportSet, payNtcHdrR, PayNtcHdrR.$s_adv_pay_setoff_amt, PayNtcHdrR.$adv_pay_setoff_amt, decPlace);
			putNumStr(payNtcReportSet, payNtcHdrR, PayNtcHdrR.$s_adv_pay_setoff_tax_amt, PayNtcHdrR.$adv_pay_setoff_tax_amt, decPlace);
			
			putNumStr(payNtcReportSet, hdrTaxL, PayNtcHdrR.$s_tax_rate1, PayNtcHdrR.$tax_rate1, decPlace);
			putNumStr(payNtcReportSet, hdrTaxL, PayNtcHdrR.$s_tax_rate_purc_amt1, PayNtcHdrR.$tax_rate_purc_amt1, decPlace);
			putNumStr(payNtcReportSet, hdrTaxL, PayNtcHdrR.$s_tax_rate_tax_amt1, PayNtcHdrR.$tax_rate_tax_amt1, decPlace);
			putNumStr(payNtcReportSet, hdrTaxL, PayNtcHdrR.$s_tax_rate_base_tax_amt1, PayNtcHdrR.$tax_rate_base_tax_amt1, decPlace);
			putNumStr(payNtcReportSet, hdrTaxL, PayNtcHdrR.$s_tax_rate2, PayNtcHdrR.$tax_rate2, decPlace);
			putNumStr(payNtcReportSet, hdrTaxL, PayNtcHdrR.$s_tax_rate_purc_amt2, PayNtcHdrR.$tax_rate_purc_amt2, decPlace);
			putNumStr(payNtcReportSet, hdrTaxL, PayNtcHdrR.$s_tax_rate_tax_amt2, PayNtcHdrR.$tax_rate_tax_amt2, decPlace);
			putNumStr(payNtcReportSet, hdrTaxL, PayNtcHdrR.$s_tax_rate_base_tax_amt2, PayNtcHdrR.$tax_rate_base_tax_amt2, decPlace);
			putNumStr(payNtcReportSet, hdrTaxL, PayNtcHdrR.$s_tax_rate3, PayNtcHdrR.$tax_rate3, decPlace);
			putNumStr(payNtcReportSet, hdrTaxL, PayNtcHdrR.$s_tax_rate_purc_amt3, PayNtcHdrR.$tax_rate_purc_amt3, decPlace);
			putNumStr(payNtcReportSet, hdrTaxL, PayNtcHdrR.$s_tax_rate_tax_amt3, PayNtcHdrR.$tax_rate_tax_amt3, decPlace);
			putNumStr(payNtcReportSet, hdrTaxL, PayNtcHdrR.$s_tax_rate_base_tax_amt3, PayNtcHdrR.$tax_rate_base_tax_amt3, decPlace);
			putNumStr(payNtcReportSet, hdrTaxL, PayNtcHdrR.$s_tax_rate4, PayNtcHdrR.$tax_rate4, decPlace);
			putNumStr(payNtcReportSet, hdrTaxL, PayNtcHdrR.$s_tax_rate_purc_amt4, PayNtcHdrR.$tax_rate_purc_amt4, decPlace);
			putNumStr(payNtcReportSet, hdrTaxL, PayNtcHdrR.$s_tax_rate_tax_amt4, PayNtcHdrR.$tax_rate_tax_amt4, decPlace);
			putNumStr(payNtcReportSet, hdrTaxL, PayNtcHdrR.$s_tax_rate_base_tax_amt4, PayNtcHdrR.$tax_rate_base_tax_amt4, decPlace);
			putNumStr(payNtcReportSet, hdrTaxL, PayNtcHdrR.$s_tax_rate5, PayNtcHdrR.$tax_rate5, decPlace);
			putNumStr(payNtcReportSet, hdrTaxL, PayNtcHdrR.$s_tax_rate_purc_amt5, PayNtcHdrR.$tax_rate_purc_amt5, decPlace);
			putNumStr(payNtcReportSet, hdrTaxL, PayNtcHdrR.$s_tax_rate_tax_amt5, PayNtcHdrR.$tax_rate_tax_amt5, decPlace);
			putNumStr(payNtcReportSet, hdrTaxL, PayNtcHdrR.$s_tax_rate_base_tax_amt5, PayNtcHdrR.$tax_rate_base_tax_amt5, decPlace);
			putNumStr(payNtcReportSet, hdrTaxL, PayNtcHdrR.$s_tax_rate6, PayNtcHdrR.$tax_rate6, decPlace);
			putNumStr(payNtcReportSet, hdrTaxL, PayNtcHdrR.$s_tax_rate_purc_amt6, PayNtcHdrR.$tax_rate_purc_amt6, decPlace);
			putNumStr(payNtcReportSet, hdrTaxL, PayNtcHdrR.$s_tax_rate_tax_amt6, PayNtcHdrR.$tax_rate_tax_amt6, decPlace);
			putNumStr(payNtcReportSet, hdrTaxL, PayNtcHdrR.$s_tax_rate_base_tax_amt6, PayNtcHdrR.$tax_rate_base_tax_amt6, decPlace);
			putNumStr(payNtcReportSet, hdrTaxL, PayNtcHdrR.$s_tax_rate7, PayNtcHdrR.$tax_rate7, decPlace);
			putNumStr(payNtcReportSet, hdrTaxL, PayNtcHdrR.$s_tax_rate_purc_amt7, PayNtcHdrR.$tax_rate_purc_amt7, decPlace);
			putNumStr(payNtcReportSet, hdrTaxL, PayNtcHdrR.$s_tax_rate_tax_amt7, PayNtcHdrR.$tax_rate_tax_amt7, decPlace);
			putNumStr(payNtcReportSet, hdrTaxL, PayNtcHdrR.$s_tax_rate_base_tax_amt7, PayNtcHdrR.$tax_rate_base_tax_amt7, decPlace);
			putNumStr(payNtcReportSet, hdrTaxL, PayNtcHdrR.$s_tax_rate8, PayNtcHdrR.$tax_rate8, decPlace);
			putNumStr(payNtcReportSet, hdrTaxL, PayNtcHdrR.$s_tax_rate_purc_amt8, PayNtcHdrR.$tax_rate_purc_amt8, decPlace);
			putNumStr(payNtcReportSet, hdrTaxL, PayNtcHdrR.$s_tax_rate_tax_amt8, PayNtcHdrR.$tax_rate_tax_amt8, decPlace);
			putNumStr(payNtcReportSet, hdrTaxL, PayNtcHdrR.$s_tax_rate_base_tax_amt8, PayNtcHdrR.$tax_rate_base_tax_amt8, decPlace);
			putNumStr(payNtcReportSet, hdrTaxL, PayNtcHdrR.$s_tax_rate9, PayNtcHdrR.$tax_rate9, decPlace);
			putNumStr(payNtcReportSet, hdrTaxL, PayNtcHdrR.$s_tax_rate_purc_amt9, PayNtcHdrR.$tax_rate_purc_amt9, decPlace);
			putNumStr(payNtcReportSet, hdrTaxL, PayNtcHdrR.$s_tax_rate_tax_amt9, PayNtcHdrR.$tax_rate_tax_amt9, decPlace);
			putNumStr(payNtcReportSet, hdrTaxL, PayNtcHdrR.$s_tax_rate_base_tax_amt9, PayNtcHdrR.$tax_rate_base_tax_amt9, decPlace);
			putNumStr(payNtcReportSet, hdrTaxL, PayNtcHdrR.$s_tax_rate10, PayNtcHdrR.$tax_rate10, decPlace);
			putNumStr(payNtcReportSet, hdrTaxL, PayNtcHdrR.$s_tax_rate_purc_amt10, PayNtcHdrR.$tax_rate_purc_amt10, decPlace);
			putNumStr(payNtcReportSet, hdrTaxL, PayNtcHdrR.$s_tax_rate_tax_amt10, PayNtcHdrR.$tax_rate_tax_amt10, decPlace);
			putNumStr(payNtcReportSet, hdrTaxL, PayNtcHdrR.$s_tax_rate_base_tax_amt10, PayNtcHdrR.$tax_rate_base_tax_amt10, decPlace);
			
			putNumStr(payNtcReportSet, payNtcHdrR, PayNtcHdrR.$s_pay_schd_amt1, PayNtcHdrR.$pay_schd_amt1, decPlace);
			putNumStr(payNtcReportSet, payNtcHdrR, PayNtcHdrR.$s_pay_schd_amt2, PayNtcHdrR.$pay_schd_amt2, decPlace);
			putNumStr(payNtcReportSet, payNtcHdrR, PayNtcHdrR.$s_pay_schd_amt3, PayNtcHdrR.$pay_schd_amt3, decPlace);
			putNumStr(payNtcReportSet, payNtcHdrR, PayNtcHdrR.$s_pay_schd_amt4, PayNtcHdrR.$pay_schd_amt4, decPlace);
			putNumStr(payNtcReportSet, payNtcHdrR, PayNtcHdrR.$s_pay_schd_amt5, PayNtcHdrR.$pay_schd_amt5, decPlace);
		}
		
		/**
		 * ヘッダのReportSetを設定する
		 * @param payNtcReportSet 支払通知書ReportSet
		 * @param payNtcHdrR 支払通知書データ
		 * @param hdrTaxL 税額の内訳
		 */
		protected void setHdrReport(MSBHR_PayNtc payNtcReportSet, PayNtcHdrR payNtcHdrR, MCList<PayNtcHdrR> hdrTaxL) {
			
			MCNumber hdrPage = MCNumber.ONE;
			
			MCList<PayNtcHdrR> payNtcHdrL = MCList.create(PayNtcHdrR.class);
			
			if (hdrTaxL.isEmpty()) {
				payNtcHdrR.hdr_page(hdrPage);
				payNtcReportSet.addRow(payNtcHdrR);
			}
			else {
				for (PayNtcHdrR hdrTaxR : hdrTaxL) {
					// ヘッダ情報を作成する
					PayNtcHdrR row = payNtcHdrR.clone();
					copy(row, hdrTaxR, createMap_PayNtcHdrR_PayNtcHdrR());
					row.hdr_page(hdrPage);
					
					// ヘッダ情報リストを設定する
					payNtcHdrL.add(row);
					payNtcReportSet.addNextPageRow();
					
					hdrPage = hdrPage.add(1);
				}
			}
			
			// ヘッダのReportSetを設定する
			payNtcReportSet.addAll(payNtcHdrL);
			payNtcReportSet.addNextPageRow();
		}
		
		/**
		 * 支払通知書明細の印刷情報を作成する
		 * @param payNtcReportSet 支払通知書ReportSet
		 * @param payChkR 支払照合ヘッダ
		 * @param apDL 買掛明細
		 * @param payActDL 支払実績明細
		 * @param advPayActL 前渡金実績
		 */
		protected void makeDtl(MSBHR_PayNtc payNtcReportSet, MST_PAY_CHK_R payChkR, MCList<MST_AP_D_R> apDL,
				MCList<MST_PAY_ACT_D_R> payActDL, MCList<MST_ADV_PAY_ACT_R> advPayActL) {
			
			MCList<PayNtcDtlR> payNtcDtlL = MCList.create(PayNtcDtlR.class);
			
			// 支払通知書明細印刷が不要な場合
			if (!payChkR.getBooleanNE(MAM_BP_R.$pay_ntc_dtl_outp_flg)) {
				return;
			}
			
			_rowCnt = 0;
			
			// 小計なしの場合
			if (MAC_PAY_NTC_DTL_SUBTTL_TYP.isNOT_OUTP(payChkR.getStringNE(MAM_BP_R.$pay_ntc_dtl_subttl_typ))) {
				addPrntPayNtcDtlNoSubttl(payNtcDtlL, payChkR, apDL, payActDL, advPayActL);
			}
			// 買掛先ごとの場合
			else if (MAC_PAY_NTC_DTL_SUBTTL_TYP.isEACH_ASPL(payChkR.getStringNE(MAM_BP_R.$pay_ntc_dtl_subttl_typ))) {
				addPrntPayNtcDtlEachAspl(payNtcDtlL, payChkR, apDL, payActDL, advPayActL);
			}
			// 発注先ごとの場合
			else if (MAC_PAY_NTC_DTL_SUBTTL_TYP.isEACH_SPL(payChkR.getStringNE(MAM_BP_R.$pay_ntc_dtl_subttl_typ))) {
				addPrntPayNtcDtlEachSpl(payNtcDtlL, payChkR, apDL, payActDL, advPayActL);
			}
			// 案件ごとの場合
			else if (MAC_PAY_NTC_DTL_SUBTTL_TYP.isEACH_WRK(payChkR.getStringNE(MAM_BP_R.$pay_ntc_dtl_subttl_typ))) {
				addPrntPayNtcDtlEachWrk(payNtcDtlL, payChkR, apDL, payActDL, advPayActL);
			}
			
			// 改ページ
			breakDtlPage(payNtcDtlL);
			
			putNumStrDtl(payNtcReportSet, payNtcDtlL, payChkR);
			
			putViewStrDtl(payNtcDtlL);
			
			payNtcReportSet.addAll(payNtcDtlL);
		}
		
		/**
		 * 小計無しの支払通知書明細を作成する
		 * @param payNtcDtlL 支払通知書明細データ
		 * @param payChkR 支払照合ヘッダ
		 * @param apDL 買掛明細
		 * @param payActDL 支払実績明細
		 * @param advPayActL 前渡金実績
		 */
		protected void addPrntPayNtcDtlNoSubttl(MCList<PayNtcDtlR> payNtcDtlL, MST_PAY_CHK_R payChkR,
				MCList<MST_AP_D_R> apDL, MCList<MST_PAY_ACT_D_R> payActDL, MCList<MST_ADV_PAY_ACT_R> advPayActL) {
			
			// 買掛明細を追加
			MCList<PayNtcDtlR> apDtlL = MCList.create(PayNtcDtlR.class);
			addAll(apDtlL, apDL, createMap_PayNtcDtlR_MST_AP_D_R());
			addPrntApDtl(payChkR, apDtlL, payNtcDtlL, null);
			
			// 支払実績明細を追加
			MCList<PayNtcDtlR> payActDtlL = MCList.create(PayNtcDtlR.class);
			addAll(payActDtlL, payActDL, createMap_PayNtcDtlR_MST_PAY_ACT_D_R());
			addPrntPayActDtl(payChkR, payActDtlL, payNtcDtlL);
			
			// 前渡金実績を追加
			MCList<PayNtcDtlR> advPayActDtlL = setAdvPayActDtl(advPayActL);
			addPrntAdvPayActDtl(payChkR, advPayActDtlL, payNtcDtlL);
		}

		/**
		 * 買掛先別小計の支払通知書明細を作成する
		 * @param payNtcDtlL 支払通知書明細データ
		 * @param payChkR 支払照合ヘッダ
		 * @param apDL 買掛明細
		 * @param payActDL 支払実績明細
		 * @param advPayActL 前渡金実績
		 */
		protected void addPrntPayNtcDtlEachAspl(MCList<PayNtcDtlR> payNtcDtlL, MST_PAY_CHK_R payChkR,
				MCList<MST_AP_D_R> apDL, MCList<MST_PAY_ACT_D_R> payActDL, MCList<MST_ADV_PAY_ACT_R> advPayActL) {
			
			// 買掛明細を追加
			MCList<PayNtcDtlR> apDtlL = MCList.create(PayNtcDtlR.class);
			addAll(apDtlL, apDL, createMap_PayNtcDtlR_MST_AP_D_R());
			if (!apDtlL.isEmpty()) {
				
				// 買掛先リストの取得
				MCList<PayNtcDtlR> asplL = getAsplList(payChkR, apDtlL);
				MCIndexKey idx = apDtlL.createIndex(MST_AP_D_R.$asppl_cd);
				
				for (PayNtcDtlR asplR : asplL) {
					
					// 明細レコード作成
					MCList<PayNtcDtlR> subL = apDtlL.subList(idx, asplR.getStringNE(MST_AP_D_R.$asppl_cd));
					PayNtcDtlR subttlDtlR = getSubttlForAspl(asplR);
					addPrntApDtl(payChkR, subL, payNtcDtlL, subttlDtlR);
					
					// 改ページ
					if (MAC_PAY_NTC_DTL_BRK_TYP.isEACH_SUBTTL(payChkR.getStringNE(MAM_BP_R.$pay_ntc_dtl_brk_typ))) {
						breakDtlPage(payNtcDtlL);
					}
				}
			}
			
			// 支払実績明細を追加
			MCList<PayNtcDtlR> payActDtlL = MCList.create(PayNtcDtlR.class);
			addAll(payActDtlL, payActDL, createMap_PayNtcDtlR_MST_PAY_ACT_D_R());
			addPrntPayActDtl(payChkR, payActDtlL, payNtcDtlL);
			
			// 前渡金実績を追加
			MCList<PayNtcDtlR> advPayActDtlL = setAdvPayActDtl(advPayActL);
			addPrntAdvPayActDtl(payChkR, advPayActDtlL, payNtcDtlL);
		}
		
		/**
		 * 発注先別小計の支払通知書明細を作成する
		 * @param payNtcDtlL 支払通知書明細データ
		 * @param payChkR 支払照合ヘッダ
		 * @param apDL 買掛明細
		 * @param payActDL 支払実績明細
		 * @param advPayActL 前渡金実績
		 */
		protected void addPrntPayNtcDtlEachSpl(MCList<PayNtcDtlR> payNtcDtlL,	MST_PAY_CHK_R payChkR,
				MCList<MST_AP_D_R> apDL, MCList<MST_PAY_ACT_D_R> payActDL, MCList<MST_ADV_PAY_ACT_R> advPayActL) {
			
			// 買掛明細を追加
			MCList<PayNtcDtlR> apDtlL = MCList.create(PayNtcDtlR.class);
			addAll(apDtlL, apDL, createMap_PayNtcDtlR_MST_AP_D_R());
			if (!apDtlL.isEmpty()) {
				
				// 発注先リストの取得
				MCList<PayNtcDtlR> splL = getSplList(payChkR, apDtlL);
				MCIndexKey idx = apDtlL.createIndex(MST_AP_D_R.$sppl_cd);
				
				for (PayNtcDtlR splR : splL) {
					
					// 明細レコード作成
					MCList<PayNtcDtlR> subL = apDtlL.subList(idx, splR.getStringNE(MST_AP_D_R.$sppl_cd));
					PayNtcDtlR subttlDtlR = getSubttlForSpl(splR);
					addPrntApDtl(payChkR, subL, payNtcDtlL, subttlDtlR);
					
					// 改ページ
					if (MAC_PAY_NTC_DTL_BRK_TYP.isEACH_SUBTTL(payChkR.getStringNE(MAM_BP_R.$pay_ntc_dtl_brk_typ))) {
						breakDtlPage(payNtcDtlL);
					}
				}
			}
			
			// 支払実績明細を追加
			MCList<PayNtcDtlR> payActDtlL = MCList.create(PayNtcDtlR.class);
			addAll(payActDtlL, payActDL, createMap_PayNtcDtlR_MST_PAY_ACT_D_R());
			addPrntPayActDtl(payChkR, payActDtlL, payNtcDtlL);
			
			// 前渡金実績を追加
			MCList<PayNtcDtlR> advPayActDtlL = setAdvPayActDtl(advPayActL);
			addPrntAdvPayActDtl(payChkR, advPayActDtlL, payNtcDtlL);
		}
		
		/**
		 * 案件別小計の支払通知書明細を作成する
		 * @param payNtcDtlL 支払通知書明細データ
		 * @param payChkR 支払照合ヘッダ
		 * @param apDL 買掛明細
		 * @param payActDL 支払実績明細
		 * @param advPayActL 前渡金実績
		 */
		protected void addPrntPayNtcDtlEachWrk(MCList<PayNtcDtlR> payNtcDtlL, MST_PAY_CHK_R payChkR,
				MCList<MST_AP_D_R> apDL, MCList<MST_PAY_ACT_D_R> payActDL, MCList<MST_ADV_PAY_ACT_R> advPayActL) {
			
			// 買掛明細を追加
			MCList<PayNtcDtlR> apDtlL = MCList.create(PayNtcDtlR.class);
			addAll(apDtlL, apDL, createMap_PayNtcDtlR_MST_AP_D_R());
			if (!apDtlL.isEmpty()) {
				
				// 案件リストの取得
				MCList<PayNtcDtlR> wrkL = getWrkList(apDtlL);
				MCIndexKey idx = apDtlL.createIndex(MST_AP_D_R.$po_wrk_no);
				
				for (PayNtcDtlR wrkR : wrkL) {
					
					// 明細レコード作成
					MCList<PayNtcDtlR> subL = apDtlL.subList(idx, wrkR.getStringNE(MST_AP_D_R.$po_wrk_no));
					PayNtcDtlR subttlDtlR = getSubttlForWrk(wrkR);
					addPrntApDtl(payChkR, subL, payNtcDtlL, subttlDtlR);
					
					// 改ページ
					if (MAC_PAY_NTC_DTL_BRK_TYP.isEACH_SUBTTL(payChkR.getStringNE(MAM_BP_R.$pay_ntc_dtl_brk_typ))) {
						breakDtlPage(payNtcDtlL);
					}
				}
			}
			
			// 支払実績明細を追加
			MCList<PayNtcDtlR> payActDtlL = MCList.create(PayNtcDtlR.class);
			addAll(payActDtlL, payActDL, createMap_PayNtcDtlR_MST_PAY_ACT_D_R());
			addPrntPayActDtl(payChkR, payActDtlL, payNtcDtlL);
			
			// 前渡金実績を追加
			MCList<PayNtcDtlR> advPayActDtlL = setAdvPayActDtl(advPayActL);
			addPrntAdvPayActDtl(payChkR, advPayActDtlL, payNtcDtlL);
		}
		
		/**
		 * 明細の数値カラムの値を指定の文字列カラムに設定する
		 * @param payNtcReportSet 支払通知書ReportSet
		 * @param payNtcDtlL 支払通知書明細データ
		 * @param payChkR 支払照合ヘッダ
		 */
		protected void putNumStrDtl(MSBHR_PayNtc payNtcReportSet, MCList<PayNtcDtlR> payNtcDtlL, MST_PAY_CHK_R payChkR) {
			
			payNtcDtlL.addNumberColumn(MAM_CUR_R.$amt_dec_place, payChkR.getNumberNE(MAM_CUR_R.$amt_dec_place));
			payNtcDtlL.addNumberColumn(MAM_CUR_R.$upri_dec_place, payChkR.getNumberNE(MAM_CUR_R.$upri_dec_place));
			
			putNumStr(payNtcReportSet, payNtcDtlL, PayNtcDtlR.$s_trd_unit_qty_int, PayNtcDtlR.$s_trd_unit_qty_dec, PayNtcDtlR.$trd_unit_qty, MAVM_ITM_UNIT_R.$dec_place);
			putNumStr(payNtcReportSet, payNtcDtlL, PayNtcDtlR.$s_trd_cur_upri_int, PayNtcDtlR.$s_trd_cur_upri_dec, PayNtcDtlR.$trd_cur_upri, MAM_CUR_R.$upri_dec_place);
			putNumStr(payNtcReportSet, payNtcDtlL, PayNtcDtlR.$s_trd_cur_amt_int, PayNtcDtlR.$s_trd_cur_amt_dec, PayNtcDtlR.$trd_cur_amt, MAM_CUR_R.$amt_dec_place);
			putNumStr(payNtcReportSet, payNtcDtlL, PayNtcDtlR.$s_trd_cur_dscnt_amt_int, PayNtcDtlR.$s_trd_cur_dscnt_amt_dec, PayNtcDtlR.$trd_cur_dscnt_amt, MAM_CUR_R.$amt_dec_place);
			putNumStr(payNtcReportSet, payNtcDtlL, PayNtcDtlR.$s_trd_cur_tax_amt_int, PayNtcDtlR.$s_trd_cur_tax_amt_dec, PayNtcDtlR.$trd_cur_tax_amt, MAM_CUR_R.$amt_dec_place);
			
			putNumStr(payNtcReportSet, payNtcDtlL, PayNtcDtlR.$s_part_pay_d_amt1_int, PayNtcDtlR.$s_part_pay_d_amt1_dec, PayNtcDtlR.$part_pay_d_amt1, MAM_CUR_R.$amt_dec_place);
			putNumStr(payNtcReportSet, payNtcDtlL, PayNtcDtlR.$s_part_pay_d_amt2_int, PayNtcDtlR.$s_part_pay_d_amt2_dec, PayNtcDtlR.$part_pay_d_amt2, MAM_CUR_R.$amt_dec_place);
			
			putNumStr(payNtcReportSet, payNtcDtlL, PayNtcDtlR.$s_tax_rate, PayNtcDtlR.$tax_rate, (MCNumber)null);
		}
		
		/**
		 * 品目枝番の表示用項目を設定する
		 * @param payNtcDtlL 支払通知書明細データ
		 */
		protected void putViewStrDtl(MCList<PayNtcDtlR> payNtcDtlL) {
			
			putPrntItmSub1(payNtcDtlL, PayNtcDtlR.$itm_sub1_view, PayNtcDtlR.$itm_sub1_data);
			putPrntItmSub2(payNtcDtlL, PayNtcDtlR.$itm_sub2_view, PayNtcDtlR.$itm_sub2_data);
			putPrntItmSub3(payNtcDtlL, PayNtcDtlR.$itm_sub3_view, PayNtcDtlR.$itm_sub3_data);
		}
		
		/**
		 * 買掛先リストを取得する
		 * @param payChkR 支払照合ヘッダ
		 * @param apDtlL 明細データ
		 * @return 買掛先リスト
		 */
		protected MCList<PayNtcDtlR> getAsplList(MST_PAY_CHK_R payChkR, MCList<PayNtcDtlR> apDtlL) {
			
			MCList<PayNtcDtlR> asplL = apDtlL.groupByNE(
					MST_AP_D_R.$asppl_cd,
					"asppl_nm");
			
			asplL.sort(MST_AP_D_R.$asppl_cd);
			
			return asplL;
		}
		
		/**
		 * 小計用のコンテナを取得する<br>
		 * コンテナには買掛先ＣＤと買掛先名が設定される
		 * @param asplL 買掛先Row
		 * @return 小計用行
		 */
		protected PayNtcDtlR getSubttlForAspl(PayNtcDtlR asplL) {
			
			// 小計行の作成
			PayNtcDtlR subttlDtlR = PayNtcDtlR.create();
			
			if (!isNull(asplL)) {
				subttlDtlR.setAttributes(asplL);
				
				subttlDtlR.itm_cd(asplL.getStringNE(MST_AP_D_R.$asppl_cd));
				subttlDtlR.itm_nm(asplL.getStringNE("asppl_nm"));
			}
			return subttlDtlR;
		}
		
		/**
		 * 発注先リストを取得する
		 * @param payChkR 支払照合ヘッダ
		 * @param apDtlL 明細データ
		 * @return 発注先リスト
		 */
		protected MCList<PayNtcDtlR> getSplList(MST_PAY_CHK_R payChkR, MCList<PayNtcDtlR> apDtlL) {
			
			MCList<PayNtcDtlR> splL = apDtlL.groupByNE(
					MST_AP_D_R.$sppl_cd,
					"sppl_nm");
			
			splL.sort(MST_AP_D_R.$sppl_cd);
			
			return splL;
		}
		
		/**
		 * 小計用のコンテナを取得する<br>
		 * コンテナには発注先ＣＤと発注先名が設定される
		 * @param splL 発注先Row
		 * @return 小計用行
		 */
		protected PayNtcDtlR getSubttlForSpl(PayNtcDtlR splL) {
			
			// 小計行の作成
			PayNtcDtlR subttlDtlR = PayNtcDtlR.create();
			
			if (!isNull(splL)) {
				subttlDtlR.setAttributes(splL);
				
				subttlDtlR.itm_cd(splL.getStringNE(MST_AP_D_R.$sppl_cd));
				subttlDtlR.itm_nm(splL.getStringNE("sppl_nm"));
			}
			return subttlDtlR;
		}
		
		/**
		 * 案件リストを取得する
		 * @param apDtlL 明細データ
		 * @return 案件リスト
		 */
		private MCList<PayNtcDtlR> getWrkList(MCList<PayNtcDtlR> apDtlL) {
			
			MCList<PayNtcDtlR> wrkL = apDtlL.groupByNE(
					MST_AP_D_R.$po_wrk_no,
					MST_WRK_R.$wrk_nm);
			
			wrkL.sort(MST_AP_D_R.$po_wrk_no);
			
			return wrkL;
		}
		
		/**
		 * 小計用のコンテナを取得する<br>
		 * コンテナには案件ＮＯと案件名が設定される
		 * @param wrkR 案件Row
		 * @return 小計用行
		 */
		protected PayNtcDtlR getSubttlForWrk(PayNtcDtlR wrkR) {
			
			// 小計行の作成
			PayNtcDtlR subttlDtlR = PayNtcDtlR.create();
			
			if (!isNull(wrkR)) {
				subttlDtlR.setAttributes(wrkR);
				
				subttlDtlR.itm_cd(wrkR.getStringNE(MST_AP_D_R.$po_wrk_no));
				subttlDtlR.itm_nm(wrkR.getStringNE(MST_WRK_R.$wrk_nm));
			}
			return subttlDtlR;
		}
		
		/**
		 * 支払関連の支払通知書明細の印刷情報を作成する
		 * @param payChkR 支払照合ヘッダ
		 * @param payActDtlL 明細データ
		 * @param payNtcDtlL 支払通知書明細データ
		 */
		protected void addPrntPayActDtl(MST_PAY_CHK_R payChkR, MCList<PayNtcDtlR> payActDtlL,	MCList<PayNtcDtlR> payNtcDtlL) {
			
			removeCanRed(payActDtlL, payChkR, PayNtcDtlR.$act_d_no, "act_d_seq");
			if (payActDtlL.isEmpty()) {
				return;
			}
			
			addColumnPayDtl(payActDtlL);
			payActDtlL = payActDtlL.groupBy(getPayDtlGroupByPolicy());
			
			// ソート処理
			ArrayList<String> sortCols = new ArrayList<>();
			sortCols.addAll(Arrays.asList(getSortOrder(payChkR.getStringNE(MAM_BP_R.$pay_ntc_dtl_sort_typ))));
			sortCols.add(_SETOFF_FLG_COL);
			payActDtlL.sort(sortCols);
			
			// 支払小計用リスト
			MCList<PayNtcDtlR> payActDtlSubL = MCList.create(PayNtcDtlR.class);
			
			// 明細作成
			boolean isDispSubttl = false;
			for (PayNtcDtlR apyActDtlR : payActDtlL) {
				if (!isPayActDisp(payChkR) && !isApswIn(apyActDtlR)) {
					continue;
				}
				
				// 明細データを追加する
				setSlipStsTypNm(apyActDtlR);
				addPrntDtl(payNtcDtlL, apyActDtlR);
				isDispSubttl = true;
				
				payActDtlSubL.add(apyActDtlR);
			}
			
			if (isDispSubttl) {
				addPrntPayActSubttl(payNtcDtlL, payActDtlSubL);
			}
		}
		
		/**
		 * 支払、前渡金の明細の一時カラムを追加する
		 * @param payDtlL 明細データ
		 */
		protected void addColumnPayDtl(MCList<PayNtcDtlR> payDtlL) {
			payDtlL.addDateColumn(MST_AP_D_R.$ac_dt);
			payDtlL.addStringColumn(MST_PAY_ACT_R.$trd_cur_cd);
			payDtlL.addStringColumn(MAM_CUR_R.$cur_nm);
			payDtlL.addBooleanColumn(_SETOFF_FLG_COL);
		}

		/**
		 * 支払、前渡金の明細の集計条件を取得する
		 * @return 集計条件
		 */
		protected MCGroupByPolicy getPayDtlGroupByPolicy() {
			
			MCGroupByPolicy p = new MCGroupByPolicy(
					PayNtcDtlR.$purc_ac_dt,
					PayNtcDtlR.$act_no,
					PayNtcDtlR.$trd_cd,
					PayNtcDtlR.$trd_nm,
					PayNtcDtlR.$slip_sts_typ,
					PayNtcDtlR.$slip_sts_typ_nm,
					PayNtcDtlR.$itm_nm,
					MST_PAY_ACT_R.$ac_dt,
					PayNtcDtlR.$tax_cd,
					PayNtcDtlR.$tax_nm,
					PayNtcDtlR.$inc_tax_flg,
					PayNtcDtlR.$s_inc_tax_flg,
					PayNtcDtlR.$pay_ntc_d_print_rmrks,
					MST_PAY_ACT_R.$trd_cur_cd,
					MAM_CUR_R.$cur_nm,
					_SETOFF_FLG_COL
					);
			
			p.sum(PayNtcDtlR.$trd_cur_amt, PayNtcDtlR.$trd_cur_tax_amt);
			
			return p;
		}
		
		/**
		 * 残高振替受入か判断する
		 * @param apyActDtlR 明細データ
		 * @return 残高振替受入の場合にtrueを返す
		 */
		protected boolean isApswIn(PayNtcDtlR apyActDtlR) {
			return MAC_AP_STTL_TYP.isAPSW_IN_CHK(apyActDtlR.getStringNE(MST_PAY_ACT_D_R.$ap_sttl_typ))
				|| MAC_AP_STTL_TYP.isAPSW_IN_NOT_CHK(apyActDtlR.getStringNE(MST_PAY_ACT_D_R.$ap_sttl_typ));
		}
		
		/**
		 * 支払の小計を追加する
		 * @param payNtcDtlL 支払通知書明細データ
		 * @param payActDtlSubL 支払小計用リスト
		 */
		protected void addPrntPayActSubttl(MCList<PayNtcDtlR> payNtcDtlL, MCList<PayNtcDtlR> payActDtlSubL) {
			
			if (payActDtlSubL.isEmpty()) {
				return;
			}
			
			PayNtcDtlR subR = PayNtcDtlR.create();
			PayNtcDtlR payActDtlSubR = payActDtlSubL.get(0);
			subR.setAttributes(payActDtlSubR);
			
			subR.trd_nm(MSC_PAY_NTC_PRNT_STR.PAY_TTL.name(MCSys.user.locale()));
			subR.trd_cur_amt(payActDtlSubL.sum(PayNtcDtlR.$trd_cur_amt));
			subR.trd_cur_tax_amt(payActDtlSubL.sum(PayNtcDtlR.$trd_cur_tax_amt));
			subR.pay_ntc_d_print_rmrks(payActDtlSubR.getStringNE(MAM_CUR_R.$cur_nm));
			
			// 1行空けて挿入
			addPrntDtl(payNtcDtlL, PayNtcDtlR.create());
			addPrntDtl(payNtcDtlL, subR);
			addPrntDtl(payNtcDtlL, PayNtcDtlR.create());
		}
		
		/**
		 * 前渡金実績の明細データを設定する
		 * @param advPayActL 前渡金実績
		 * @return 明細データ
		 */
		protected MCList<PayNtcDtlR> setAdvPayActDtl(MCList<MST_ADV_PAY_ACT_R> advPayActL) {
			
			MCList<PayNtcDtlR> advPayActDtlL = MCList.create(PayNtcDtlR.class);
			
			for (MST_ADV_PAY_ACT_R r : advPayActL) {
				
				// 前渡金実績のデータを設定
				PayNtcDtlR advPayActDtlR = PayNtcDtlR.create();
				advPayActDtlR.purc_ac_dt(r.pay_act_dt());
				advPayActDtlR.act_no(r.adv_pay_act_no());
				advPayActDtlR.addNumberColumn("act_seq", r.adv_pay_act_seq());
				advPayActDtlR.act_rev(r.adv_pay_act_rev());
				advPayActDtlR.slip_sts_typ(r.slip_sts_typ());
				advPayActDtlR.trd_nm(MSC_PAY_NTC_PRNT_STR.ADV_PAY_AMT.name(MCSys.user.locale()));
				advPayActDtlR.itm_nm(r.getStringNE(MAM_STTL_R.$sttl_nm));
				advPayActDtlR.trd_cur_amt(r.trd_cur_amt());
				advPayActDtlR.addDateColumn(MST_ADV_PAY_ACT_R.$ac_dt, r.ac_dt());
				advPayActDtlR.addStringColumn(MST_ADV_PAY_ACT_R.$trd_cur_cd, r.trd_cur_cd());
				advPayActDtlR.addStringColumn(MAM_CUR_R.$cur_nm, r.getStringNE(MAM_CUR_R.$cur_nm));
				advPayActDtlR.addBooleanColumn("pay_flg", true);
				advPayActDtlR.addBooleanColumn(_SETOFF_FLG_COL, false);
				advPayActDtlL.add(advPayActDtlR);
				
				// 前渡金実績の手数料相殺のデータを設定
				if (MAC_AP_STTL_TYP.isSETOFF(r.com_paid_ap_sttl_typ())) {
					PayNtcDtlR comPaidR = advPayActDtlR.clone();
					if (r.getBooleanNE(MAM_STTL_R.$bill_tax_disp_flg)) { 
						comPaidR.trd_cur_amt(getTrdCurSetoffAmtExcludingTax(r));
						comPaidR.trd_cur_tax_amt(r.trd_cur_com_paid_tax_amt());
						comPaidR.tax_rate(r.getNumberNE(MAM_TAX_R.$tax_rate));
						comPaidR.tax_cd(r.trd_cur_com_paid_tax_cd());
						comPaidR.tax_nm(r.getStringNE(MAM_TAX_R.$tax_nm));
						comPaidR.inc_tax_flg(r.getBooleanNE(MAM_TAX_R.$inc_tax_flg));
						comPaidR.s_inc_tax_flg(r.getBooleanNE(MAM_TAX_R.$inc_tax_flg) ? MSC_PAY_NTC_PRNT_STR.INC_TAX.name(MCSys.user.locale()) : null);
					}
					else {
						comPaidR.trd_cur_amt(r.trd_cur_com_paid());
					}
					comPaidR.itm_nm(r.getStringNE("com_paid_sttl_nm"));
					comPaidR.addBooleanColumn(_SETOFF_FLG_COL, true);
					advPayActDtlL.add(comPaidR);
				}
			}
			
			return advPayActDtlL;
		}
		
		/**
		 * 前渡金関連の支払通知書明細の印刷情報を作成する
		 * @param payChkR 支払照合ヘッダ
		 * @param advPayActDtlL 明細データ
		 * @param payNtcDtlL 支払通知書明細データ
		 */
		protected void addPrntAdvPayActDtl(MST_PAY_CHK_R payChkR,	MCList<PayNtcDtlR> advPayActDtlL, MCList<PayNtcDtlR> payNtcDtlL) {
			
			if (!isPayActDisp(payChkR)) {
				return;
			}
			
			removeCanRed(advPayActDtlL, payChkR, PayNtcDtlR.$act_no, "act_seq");
			if (advPayActDtlL.isEmpty()) {
				return;
			}
			
			addColumnPayDtl(advPayActDtlL);
			advPayActDtlL = advPayActDtlL.groupBy(getPayDtlGroupByPolicy());
			
			// ソート処理
			ArrayList<String> sortCols = new ArrayList<>();
			sortCols.addAll(Arrays.asList(getSortOrder(payChkR.getStringNE(MAM_BP_R.$pay_ntc_dtl_sort_typ))));
			sortCols.add(_SETOFF_FLG_COL);
			advPayActDtlL.sort(sortCols);
			
			// 明細作成
			for (PayNtcDtlR apyActDtlR : advPayActDtlL) {
				// 明細データを追加する
				setSlipStsTypNm(apyActDtlR);
				addPrntDtl(payNtcDtlL, apyActDtlR);
			}
			
			addPrntAdvPayActSubttl(payNtcDtlL, advPayActDtlL);
		}
		
		/**
		 * 前渡金の小計を追加する
		 * @param payNtcDtlL 支払通知書明細データ
		 * @param advPayActDtlL 明細データ
		 */
		protected void addPrntAdvPayActSubttl(MCList<PayNtcDtlR> payNtcDtlL, MCList<PayNtcDtlR> advPayActDtlL) {
			
			PayNtcDtlR subR = PayNtcDtlR.create();
			PayNtcDtlR advPayActDtlR = advPayActDtlL.get(0);
			subR.setAttributes(advPayActDtlR);
			
			subR.trd_nm(MSC_PAY_NTC_PRNT_STR.ADV_TTL.name(MCSys.user.locale()));
			subR.trd_cur_amt(advPayActDtlL.sum(PayNtcDtlR.$trd_cur_amt));
			subR.trd_cur_tax_amt(advPayActDtlL.sum(PayNtcDtlR.$trd_cur_tax_amt));
			subR.pay_ntc_d_print_rmrks(advPayActDtlR.getStringNE(MAM_CUR_R.$cur_nm));
			
			// 1行空けて挿入
			addPrntDtl(payNtcDtlL, PayNtcDtlR.create());
			addPrntDtl(payNtcDtlL, subR);
			addPrntDtl(payNtcDtlL, PayNtcDtlR.create());
		}

		/**
		 * 買掛関連の支払通知書明細の印刷情報を作成する
		 * @param payChkR 支払照合ヘッダ
		 * @param apDtlL 明細データ
		 * @param payNtcDtlL 支払通知書明細データ
		 * @param subttlDtlR 小計（小計対象の取引先コードと名称だけを設定したコンテナ）
		 */
		protected void addPrntApDtl(MST_PAY_CHK_R payChkR, MCList<PayNtcDtlR> apDtlL, MCList<PayNtcDtlR> payNtcDtlL, PayNtcDtlR subttlDtlR) {
			
			removeCanRed(apDtlL, payChkR, PayNtcDtlR.$act_d_no, "act_d_seq");
			if (apDtlL.isEmpty()) {
				return;
			}

			// 初期化
			if (subttlDtlR == null) {
				subttlDtlR = PayNtcDtlR.create();
			}
			
			apDtlL.sort(getSortOrder(payChkR.getStringNE(MAM_BP_R.$pay_ntc_dtl_sort_typ)));
			
			// 明細作成
			boolean isDispSubttl = false;
			for (PayNtcDtlR apDtlR : apDtlL) {
				if (isBaseTaxDeff(apDtlR)) {
					continue;
				}
				
				// 小計の計算（加算）
				setPrntSbttl(subttlDtlR, apDtlR);
				
				// 明細データを追加する
				setSlipStsTypNm(apDtlR);
				addPrntDtl(payNtcDtlL, apDtlR);
				isDispSubttl = true;
				
				if (MSC_PAY_MTD_TYP.isPART_PAY(apDtlR.pay_mtd_typ())) {
					// 一部支払の場合のみ
					addPrntPartPayRow(payNtcDtlL, apDtlR);
				}
			}
			
			if (isDispSubttl) {
				addPrntApSubttl(payNtcDtlL, subttlDtlR, payChkR);
			}
		}
		
		/**
		 * 基準単位通貨のみの税差額調整か判断する
		 * @param apDtlR 明細データ
		 * @return 基準単位通貨のみ税差額調整の場合、trueを返す
		 */
		protected boolean isBaseTaxDeff(PayNtcDtlR apDtlR) {
			
			if (isNull(apDtlR.getNumberNE(MST_AP_D_R.$base_cur_tax_amt))) {
				return false;
			}
			else if (apDtlR.trd_cur_tax_amt().isZero()
					&& !apDtlR.getNumberNE(MST_AP_D_R.$base_cur_tax_amt).isZero()) {
				return true;
			}
			else {
				return false;
			}
		}
		
		/**
		 * 伝票状況区分名を設定する
		 * @param dtlR 明細データ
		 */
		protected void setSlipStsTypNm(PayNtcDtlR dtlR) {
			
			dtlR.slip_sts_typ_nm(!MAC_SLIP_STS_TYP.isCRT(dtlR.slip_sts_typ()) ? MAC_SLIP_STS_TYP.get(dtlR.slip_sts_typ()).name(MCSys.user.locale()) : null);
		}

		/**
		 * 支払通知書明細並順に従って明細のソート順を取得する
		 * @param sortTyp 支払通知書明細並順
		 * @return ソート順
		 */
		protected String[] getSortOrder(String sortTyp) {
			
			if (MAC_PAY_NTC_DTL_SORT_TYP.isPURC_DT(sortTyp)) {
				return new String[] {
					PayNtcDtlR.$purc_ac_dt,
					PayNtcDtlR.$po_no,
					PayNtcDtlR.$po_d_no,
					MST_AP_D_R.$ac_dt,
					PayNtcDtlR.$dlv_slip_no,
					PayNtcDtlR.$dlv_slip_d_no,
					PayNtcDtlR.$act_no,
					PayNtcDtlR.$act_d_no
				};
			}
			else if (MAC_PAY_NTC_DTL_SORT_TYP.isAC_DT(sortTyp)) {
				return new String[] {
					MST_AP_D_R.$ac_dt,
					PayNtcDtlR.$purc_ac_dt,
					PayNtcDtlR.$po_no,
					PayNtcDtlR.$po_d_no,
					PayNtcDtlR.$dlv_slip_no,
					PayNtcDtlR.$dlv_slip_d_no,
					PayNtcDtlR.$act_no,
					PayNtcDtlR.$act_d_no
				};
			}
			else if (MAC_PAY_NTC_DTL_SORT_TYP.isPO_NO(sortTyp)) {
				return new String[] {
					PayNtcDtlR.$po_no,
					PayNtcDtlR.$po_d_no,
					PayNtcDtlR.$purc_ac_dt,
					MST_AP_D_R.$ac_dt,
					PayNtcDtlR.$dlv_slip_no,
					PayNtcDtlR.$dlv_slip_d_no,
					PayNtcDtlR.$act_no,
					PayNtcDtlR.$act_d_no
				};
			}
			else if (MAC_PAY_NTC_DTL_SORT_TYP.isDLV_SLIP_NO(sortTyp)) {
				return new String[] {
					PayNtcDtlR.$dlv_slip_no,
					PayNtcDtlR.$dlv_slip_d_no,
					PayNtcDtlR.$act_no,
					PayNtcDtlR.$act_d_no,
					PayNtcDtlR.$purc_ac_dt,
					PayNtcDtlR.$po_no,
					PayNtcDtlR.$po_d_no,
					MST_AP_D_R.$ac_dt
				};
			}
			
			return null;
		}
		
		/**
		 * 支払通知書明細の印刷情報（小計）を設定する
		 * @param subttlDtlR 小計（小計対象の取引先コードと名称だけを設定したコンテナ）
		 * @param dtlR 明細データ
		 */
		protected void setPrntSbttl(PayNtcDtlR subttlDtlR, PayNtcDtlR dtlR) {
			subttlDtlR.trd_cur_amt(nvl(subttlDtlR.trd_cur_amt(), MCNumber.ZERO).add(nvl(dtlR.trd_cur_amt(), MCNumber.ZERO)));
			subttlDtlR.trd_cur_tax_amt(nvl(subttlDtlR.trd_cur_tax_amt(), MCNumber.ZERO).add(nvl(dtlR.trd_cur_tax_amt(), MCNumber.ZERO)));
		}
		
		/**
		 * 明細に１行追加する。<br>
		 * 改ページを制御する。<br>
		 * 数値フィールドのフォーマットを調整する。
		 * 
		 * @param payNtcDtlL 支払通知書明細データ
		 * @param dtlR 追加対象の行
		 */
		protected void addPrntDtl(MCList<PayNtcDtlR> payNtcDtlL, PayNtcDtlR dtlR) {
			
			// ページの設定
			if (_rowCnt == _MAX_ROW_COUNT) {
				breakDtlPage(payNtcDtlL);
			}
			
			_rowCnt++;
			
			payNtcDtlL.add(dtlR);
		}

		/**
		 * 明細を改ページする。<br>
		 * 最大行数まで空行を追加して改ページする
		 * @param payNtcDtlL 支払通知書明細データ
		 */
		protected void breakDtlPage(MCList<PayNtcDtlR> payNtcDtlL) {
			
			// 出力行数が０の場合は改ページすると空ページとなるため改ページしない
			if (_rowCnt == 0) {
				return;
			}
			
			// 現在行が一行目で空行の場合は削除する
			if (_rowCnt == 1) {
				if (payNtcDtlL.get(payNtcDtlL.size() - 1).isEmpty()) {
					payNtcDtlL.remove(payNtcDtlL.size() - 1);
					_rowCnt = 0;
				}
				return;
			}

			// １ページの最大行数まで空行で埋める
			for (int i = _rowCnt ; i < _MAX_ROW_COUNT; i++) {
				// 支払通知書ヘッダーのデフォルト値を設定する。
				payNtcDtlL.add(PayNtcDtlR.create());
			}

			// 行数の変数を初期化する
			_rowCnt = 0;
		}
		
		/**
		 * 一部支払の行を追加する
		 * @param payNtcDtlL 支払通知書明細データ
		 * @param dtlR 明細データ
		 */
		protected void addPrntPartPayRow(MCList<PayNtcDtlR> payNtcDtlL, PayNtcDtlR dtlR) {
			
			PayNtcDtlR partPayR1 = PayNtcDtlR.create();
			partPayR1.part_pay_d_label1(MSC_PAY_NTC_PRNT_STR.PAY_NTC_DTL_TTL.name(MCSys.user.locale()));
			partPayR1.part_pay_d_label2(MSC_PAY_NTC_PRNT_STR.PAY_NTC_COMPL_TTL.name(MCSys.user.locale()));
			partPayR1.part_pay_d_amt1(dtlR.getNumberNE("part_pay_ntc_ttl_amt"));
			partPayR1.part_pay_d_amt2(MCNumber.sum(
					dtlR.getNumberNE("part_pay_ntc_ttl_amt"),
					dtlR.trd_cur_amt().negate(),
					dtlR.trd_cur_tax_amt().negate(),
					dtlR.getNumberNE("part_pay_ntc_crryovr_amt").negate()));
			
			addPrntDtl(payNtcDtlL, partPayR1);
			
			PayNtcDtlR partPayR2 = PayNtcDtlR.create();
			partPayR2.part_pay_d_label1(MSC_PAY_NTC_PRNT_STR.PAY_NTC_AMT.name(MCSys.user.locale()));
			partPayR2.part_pay_d_label2(MSC_PAY_NTC_PRNT_STR.BFW_AMT.name(MCSys.user.locale()));
			partPayR2.part_pay_d_amt1(dtlR.trd_cur_amt().add(dtlR.trd_cur_tax_amt()));
			partPayR2.part_pay_d_amt2(dtlR.getNumberNE("part_pay_ntc_crryovr_amt"));
			
			addPrntDtl(payNtcDtlL, partPayR2);
		}
		
		/**
		 * 買掛の小計を追加する
		 * @param payNtcDtlL 支払通知書明細データ
		 * @param subttlDtlR 小計データ
		 * @param payChkR 支払照合ヘッダ
		 */
		protected void addPrntApSubttl(MCList<PayNtcDtlR> payNtcDtlL, PayNtcDtlR subttlDtlR, MST_PAY_CHK_R payChkR) {
			
			PayNtcDtlR subR = PayNtcDtlR.create();
			subR.setAttributes(payChkR);
			
			subR.trd_nm(MSC_PAY_NTC_PRNT_STR.AP_TTL.name(MCSys.user.locale()));
			subR.itm_cd(subttlDtlR.itm_cd());
			subR.itm_nm(subttlDtlR.itm_nm());
			subR.trd_cur_amt(subttlDtlR.trd_cur_amt());
			subR.trd_cur_tax_amt(subttlDtlR.trd_cur_tax_amt());
			
			// 1行空けて挿入
			addPrntDtl(payNtcDtlL, PayNtcDtlR.create());
			addPrntDtl(payNtcDtlL, subR);
			addPrntDtl(payNtcDtlL, PayNtcDtlR.create());
		}
		
		/**
		 * 不要な明細を取り除く<br>
		 * 取消、取消伝票が同じ支払通知書に含まれる場合に該当する明細を印刷対象から削除する。
		 * @param dtlL 明細データ
		 * @param payChkR 支払照合ヘッダ
		 * @param actDNoCol 明細実績ＮＯカラム名
		 * @param actDSeqCol 明細実績連番
		 */
		protected void removeCanRed(MCList<PayNtcDtlR> dtlL, MST_PAY_CHK_R payChkR, String actDNoCol, String actDSeqCol) {
			
			MCIndexKey idxkey = dtlL.createIndex(actDNoCol, actDSeqCol);
			dtlL.addBooleanColumn("prnt", true);
			String canSlipTyp = payChkR.getStringNE(MAM_BP_R.$pay_ntc_can_slip_typ);
			
			for (PayNtcDtlR dtlR : dtlL) {
				
				String actDNo = dtlR.getStringNE(actDNoCol);
				MCNumber actDSeq = dtlR.getNumberNE(actDSeqCol);
				
				if (isNullOr(actDNo, actDSeq)) {
					continue;
				}
				
				// 取消伝票を表示する場合（支払系の明細以外）は追加してスキップ
				if (!MAC_PAY_NTC_CAN_SLIP_TYP.isNO_DISP(canSlipTyp) && !dtlR.getBooleanNE("pay_flg")) {
					
					if(MAC_PAY_NTC_CAN_SLIP_TYP.isDISP_ALL(canSlipTyp)){
						continue;
					}
					else if (MAC_PAY_NTC_CAN_SLIP_TYP.isDISP_DIFF(canSlipTyp)){
						
						if (!isSame(actDSeq, MCNumber.ONE)
								&& (MAC_SLIP_STS_TYP.isCRT(dtlR.slip_sts_typ()) || MAC_SLIP_STS_TYP.isDIS(dtlR.slip_sts_typ()))) {
							// 取消を取得。伝票行ＮＯが異なる場合は別の明細とみなす。
							PayNtcDtlR canR = dtlL.getFirst(idxkey, actDNo, actDSeq.add(-1));
							if (!isNull(canR)) {
								PayNtcDtlR disR = dtlL.getFirst(idxkey, actDNo, actDSeq.add(-2));
								if (!isNull(disR)) {
									
									if (checkSameData(dtlR, disR, canR, payChkR)) {
										// 取消、黒伝は表示しない
										canR.setBooleanNE("prnt", false);
										dtlR.setBooleanNE("prnt", false);
										// 無効伝票を新規と同様の表示（「取消」を表示しない）にするための制御
										disR.slip_sts_typ(MAC_SLIP_STS_TYP.CRT.value());
									}
								}
							}
						}
					}
					continue;
				}
				
				// 無効伝票の場合、取消伝票が存在した場合はスキップ
				if (MAC_SLIP_STS_TYP.isDIS(dtlR.slip_sts_typ())) {
					if (dtlL.subList(idxkey, actDNo, actDSeq.add(1)).size() > 0) {
						dtlR.setBooleanNE("prnt", false);
						continue;
					}
				}
				// 取消伝票の場合、無効伝票が存在した場合はスキップ
				if (MAC_SLIP_STS_TYP.isCAN(dtlR.slip_sts_typ())) {
					if (dtlL.subList(idxkey, actDNo, actDSeq.add(-1)).size() > 0) {
						dtlR.setBooleanNE("prnt", false);
						continue;
					}
				}
			}
			
			setInterimFlg(dtlL, canSlipTyp, actDNoCol, actDSeqCol);
			dtlL.setAll(dtlL.subList("prnt", true));
		}
		
		/**
		 * 新規伝票と無効伝票と取消伝票が変わっているか判断する。
		 * @param crtR 新規伝票
		 * @param disR　無効伝票
		 * @param canR 取消伝票
		 * @param payChkR 支払照合ヘッダ
		 * @return 変わっていない場合はtrue
		 */
		protected boolean checkSameData(PayNtcDtlR crtR, PayNtcDtlR disR, PayNtcDtlR canR, MST_PAY_CHK_R payChkR) {
			
			// 明細項目に変更がある場合は表示する
			boolean ret = true;
			if (!isSame(crtR.purc_ac_dt(), disR.purc_ac_dt())
					|| !isSame(crtR.base_purc_ac_dt(), disR.base_purc_ac_dt())
					|| !isSame(crtR.dlv_slip_no(), disR.dlv_slip_no())
					|| !isSame(crtR.itm_cd(), disR.itm_cd())
					|| !isSame(crtR.itm_sub1_data(), disR.itm_sub1_data())
					|| !isSame(crtR.itm_sub2_data(), disR.itm_sub2_data())
					|| !isSame(crtR.itm_sub3_data(), disR.itm_sub3_data())
					|| !isSame(crtR.itm_nm(), disR.itm_nm())
					|| !isSame(crtR.sppl_itm_cd(), disR.sppl_itm_cd())
					|| !isSame(crtR.sppl_itm_nm(), disR.sppl_itm_nm())
					|| !isSame(crtR.trd_unit_qty(), disR.trd_unit_qty())
					|| !isSame(crtR.trd_unit_cd(), disR.trd_unit_cd())
					|| !isSame(crtR.trd_cur_upri(), disR.trd_cur_upri())
					|| !isSame(crtR.trd_cur_amt(), disR.trd_cur_amt())
					|| !isSame(crtR.trd_cur_tax_amt(), disR.trd_cur_tax_amt())
					|| !isSame(crtR.tax_cd(), disR.tax_cd())
					|| !isSame(crtR.pay_ntc_d_print_rmrks(), disR.pay_ntc_d_print_rmrks())
					|| !isSame(crtR.getStringNE(MST_AP_D_R.$po_wrk_no), disR.getStringNE(MST_AP_D_R.$po_wrk_no))) {
				ret = false;
			}
			
			// 明細項目は同じでも支払通知書明細の出力方法（取引先マスタの設定による）で使用する値が変更されている場合、
			// 出力対象として一旦保持するが、支払通知書明細を出力する際に表示対象から除外する
			if (MAC_PAY_NTC_DTL_SUBTTL_TYP.isEACH_ASPL(payChkR.getStringNE(MAM_BP_R.$pay_ntc_dtl_subttl_typ))) {
				if (!isSame(crtR.getStringNE(MST_AP_D_R.$asppl_cd), disR.getStringNE(MST_AP_D_R.$asppl_cd))) {
					ret = false;
				}
			}
			else if (MAC_PAY_NTC_DTL_SUBTTL_TYP.isEACH_SPL(payChkR.getStringNE(MAM_BP_R.$pay_ntc_dtl_subttl_typ))) {
				if (!isSame(crtR.getStringNE(MST_AP_D_R.$sppl_cd), disR.getStringNE(MST_AP_D_R.$sppl_cd))) {
					ret = false;
				}
			}
			
			return ret;
		}
		
		/**
		 * 仮単価を設定する。
		 * @param dtlL 明細データ
		 * @param canSlipTyp 支払通知書取消伝票表示区分
		 * @param actDNoCol 明細実績ＮＯカラム名
		 * @param actDSeqCol 明細実績連番
		 */
		protected void setInterimFlg(MCList<PayNtcDtlR> dtlL, String canSlipTyp, String actDNoCol, String actDSeqCol) {
			
			// 支払通知書取消伝票表示区分が無効・取消伝票を表示する（変更のみ）の場合のみ、設定する
			if (!MAC_PAY_NTC_CAN_SLIP_TYP.isDISP_DIFF(canSlipTyp)) {
				return;
			}
			
			MCIndexKey idxkey = dtlL.createIndex(actDNoCol, actDSeqCol);
			
			for (PayNtcDtlR dtlR : dtlL.subList("prnt", true)) {
				
				if (MAC_SLIP_STS_TYP.isDIS(dtlR.slip_sts_typ())) {
					
					// 支払通知書項目変更なしの最終回訂正レコードを取得する
					PayNtcDtlR latestSamePayNtcR = dtlL.getFirst(idxkey, dtlR.getStringNE(actDNoCol), dtlR.getNumberNE(actDSeqCol).add(1));
					
					while (!isNull(latestSamePayNtcR)) {
						
						PayNtcDtlR nextR = dtlL.getFirst(idxkey, latestSamePayNtcR.getStringNE(actDNoCol), latestSamePayNtcR.getNumberNE(actDSeqCol).add(1));
						
						if (isNull(nextR) || nextR.getBooleanNE("prnt")) {
							break;
						}
						
						latestSamePayNtcR = nextR;
					}
					
					if (!isNull(latestSamePayNtcR) && !latestSamePayNtcR.getBooleanNE("prnt")) {
						// 最新の仮単価を設定する
						dtlR.interim_flg(latestSamePayNtcR.interim_flg());
					}
				}
			}
		}
		
		/**
		 * 支払通知書業務情報を設定する
		 * @param payNtcReportSet 支払通知書ReportSet
		 * @param payChkR 支払照合ヘッダ
		 */
		protected void setPayNtcBizInfo(MSBHR_PayNtc payNtcReportSet,	MST_PAY_CHK_R payChkR) {
			
			payNtcReportSet.setAppReportNo1(payChkR.pay_chk_no());
			payNtcReportSet.setAppReportNo2(payChkR.pay_ntc_rev().toString());
			payNtcReportSet.setAppUsrCd1(payChkR.bsppl_dpt_cd());
			payNtcReportSet.setAppUsrNm1(payChkR.getStringNE(MAM_DPT_R.$dpt_nm));
			payNtcReportSet.setAppToCd1(payChkR.bsppl_cd());
			payNtcReportSet.setAppToNm1(payChkR.getStringNE(MAM_BP_R.$bp_nm));
		}
		
		/**
		 * 支払通知書ReportSetマップを作成する
		 * @param payNtcReportSet 支払通知書ReportSet
		 * @param bspplCd 支払予定管理先ＣＤ
		 */
		protected void crtReportMap(MSBHR_PayNtc payNtcReportSet, String bspplCd) {
			
			List<MSBHR_PayNtc> list = _payNtcReportMap.get(bspplCd);
			if (list == null) {
				list = new ArrayList<MSBHR_PayNtc>();
				list.add(payNtcReportSet);
				_payNtcReportMap.put(bspplCd, list);
			}
			else {
				list.add(payNtcReportSet);
			}
		}
		
		/**
		 * 支払通知書ReportSetマップのソート
		 */
		protected void sort() {
			// 支払通知書ReportSetマップソート（支払予定管理先順）
			List<Entry<String, List<MSBHR_PayNtc>>> payNtcEntries = new ArrayList<Entry<String, List<MSBHR_PayNtc>>>(_payNtcReportMap.entrySet());
			Collections.sort(payNtcEntries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));

			LinkedHashMap<String, List<MSBHR_PayNtc>> payNtcResult = new LinkedHashMap<>();
			for (Map.Entry<String, List<MSBHR_PayNtc>> payNtcEntry : payNtcEntries) {
				payNtcResult.put(payNtcEntry.getKey(), payNtcEntry.getValue());
			}

			_payNtcReportMap = payNtcResult;
		}
		
		/**
		 * 支払通知書ReportSetマップをもとに帳票を発行する
		 */
		protected void prntAll() {
			
			MCList<BpUtil_Sprt01_DtlR> bp = null;
			MCIndexKey idxkey = null;
			// 画面の個別発行フラグがオフの場合
			if (!up1().indiv_prnt_flg()) {
				// 個別発行フラグ取得処理
				bp = getIndivPrnt();
				idxkey = bp.createIndex(BpUtil_Sprt01_DtlR.$bp_cd);
			}
			List<MCReportSet> rptSetList = new ArrayList<>();
			for (Map.Entry<String, List<MSBHR_PayNtc>> bsppl : _payNtcReportMap.entrySet()) {
				String bspplCd = bsppl.getKey();
				boolean indivPrntFlg = false;

				if (!up1().indiv_prnt_flg()) {
					BpUtil_Sprt01_DtlR bpR = bp.getFirst(idxkey, bspplCd);
					indivPrntFlg = bpR.indiv_prnt_flg();
				}

				if (up1().indiv_prnt_flg() || indivPrntFlg) {
					// 個別発行
					for (MSBHR_PayNtc payNtcReport : bsppl.getValue()) {
						MCReportSet reportSet = payNtcReport.createInstance();
						MCReportSet singleRptSet = payNtcReport.createInstance();
						reportSet.addAll(payNtcReport.getAll());
						reportSet.addWriteListener(new FileWriteListener(rptSetList));
						singleRptSet.addAll(payNtcReport.getAll());
						singleRptSet.setReportInfo(payNtcReport.getReportInfo());

						MCServerReportManager.request(singleRptSet, false);

						reportSet.setPersistent(false);
						MCServerReportManager.requestImmediate(reportSet);
					}
				}
				else {
					// まとめ発行
					MCReportSet all = bsppl.getValue().get(0).createInstance();
					for (MSBHR_PayNtc payNtcReport : bsppl.getValue()) {
						MCReportSet singleRptSet = payNtcReport.createInstance();
						all.addAll(payNtcReport.getAll());
						singleRptSet.addAll(payNtcReport.getAll());
						singleRptSet.setReportInfo(payNtcReport.getReportInfo());

						MCServerReportManager.request(singleRptSet, false);
					}
					all.setPersistent(false);
					MCServerReportManager.request(all);
				}
			}
			//添付帳票登録サービス（更新）の呼び出し
			if(!rptSetList.isEmpty()) {
				callPayNtcAttachSrv(rptSetList);
			}
		}
		
		/**
		 * 個別発行フラグ取得処理呼び出し
		 * @return
		 */
		protected MCList<BpUtil_Sprt01_DtlR> getIndivPrnt() {
			MSUCL_BpUtil.BpUtil_Sprt01 ope = MSUCL_BpUtil.crtBpUtil_Sprt01();
			ope.up0().bp_typ(MAC_BP_IS_SRCH_TYP.BSPPL.value());
			for (MST_PAY_CHK_R hdrR : _payChkL.groupBy(MST_PAY_CHK_R.$bsppl_cd)) {
				BpUtil_Sprt01_DtlR dtlR = BpUtil_Sprt01_DtlR.create();
				dtlR.bp_cd(hdrR.bsppl_cd());
				ope.up1().add(dtlR);
			}
			ope.exec();

			return ope.down0();
		}
		
		/**
		 * 支払照合ヘッダを更新する
		 */
		protected void updPayChk() {
			MST_PAY_CHK_R t = MST_PAY_CHK_R.create("T");
			MCQueryApiBuilder updR_bldr = MCQueryApiBuilder.create(t);
			updR_bldr.setSet(t.prnt_flg);
			
			_payChkL.setBoolean(MST_PAY_CHK_R.$prnt_flg, true);
			
			dbUpdateKey("MSBHL5090_MST_PAY_CHK_U01", _payChkL, updR_bldr);
		}
		
		// //////////////////// Mapper /////////////////////////////
		
		// 支払通知書データ設定用Mapper
		protected Map_PayNtcHdrR_MST_PAY_CHK_R<PayNtcHdrR,MST_PAY_CHK_R> createMap_PayNtcHdrR_MST_PAY_CHK_R() {
			return new Map_PayNtcHdrR_MST_PAY_CHK_R<PayNtcHdrR, MST_PAY_CHK_R>();
		}
		public class Map_PayNtcHdrR_MST_PAY_CHK_R<D extends PayNtcHdrR, S extends MST_PAY_CHK_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PayNtcHdrR.$pay_chk_no, MST_PAY_CHK_R.$pay_chk_no);
				addColumnPathMap(PayNtcHdrR.$pay_ntc_rev, MST_PAY_CHK_R.$pay_ntc_rev);
				addColumnPathMap(PayNtcHdrR.$wrk_no, MST_PAY_CHK_R.$wrk_no);
				addColumnPathMap(PayNtcHdrR.$wrk_nm, MST_WRK_R.$wrk_nm);
				addColumnPathMap(PayNtcHdrR.$bsppl_cd, MST_PAY_CHK_R.$bsppl_cd);
				addColumnPathMap(PayNtcHdrR.$pay_ntc_zip_cd, MAM_BP_R.$pay_ntc_zip_cd);
				addColumnPathMap(PayNtcHdrR.$pay_ntc_addr1, MAM_BP_R.$pay_ntc_addr1);
				addColumnPathMap(PayNtcHdrR.$pay_ntc_addr2, MAM_BP_R.$pay_ntc_addr2);
				addColumnPathMap(PayNtcHdrR.$pay_ntc_addr3, MAM_BP_R.$pay_ntc_addr3);
				addColumnPathMap(PayNtcHdrR.$pay_ntc_addr4, MAM_BP_R.$pay_ntc_addr4);
				addColumnPathMap(PayNtcHdrR.$pay_ntc_bsppl_nm, MAM_BP_R.$pay_ntc_bsppl_nm);
				addColumnPathMap(PayNtcHdrR.$pay_ntc_bsppl_dpt, MAM_BP_R.$pay_ntc_bsppl_dpt);
				addColumnPathMap(PayNtcHdrR.$pay_ntc_bsppl_psn, MAM_BP_R.$pay_ntc_bsppl_psn);
				addColumnPathMap(PayNtcHdrR.$pay_ntc_bsppl_psn_title, MAM_BP_R.$pay_ntc_bsppl_psn_title);
				addColumnPathMap(PayNtcHdrR.$pay_ntc_tel, MAM_BP_R.$pay_ntc_tel);
				addColumnPathMap(PayNtcHdrR.$biz_co_no, MAM_BP_R.$biz_co_no);
				addColumnPathMap(PayNtcHdrR.$bsppl_dpt_cd, MST_PAY_CHK_R.$bsppl_dpt_cd);
				addColumnPathMap(PayNtcHdrR.$dpt_nm, MAM_DPT_R.$dpt_nm);
				addColumnPathMap(PayNtcHdrR.$dpt_tel, MAM_DPT_R.$tel);
				addColumnPathMap(PayNtcHdrR.$cur_cd, MST_PAY_CHK_R.$trd_cur_cd);
				addColumnPathMap(PayNtcHdrR.$cur_nm, MAM_CUR_R.$cur_nm);
				addColumnPathMap(PayNtcHdrR.$pay_ntc_dtl_outp_flg, MAM_BP_R.$pay_ntc_dtl_outp_flg);
				addColumnPathMap(PayNtcHdrR.$sub_char1, MST_PAY_CHK_R.$sub_char1);
				addColumnPathMap(PayNtcHdrR.$sub_char2, MST_PAY_CHK_R.$sub_char2);
				addColumnPathMap(PayNtcHdrR.$sub_char3, MST_PAY_CHK_R.$sub_char3);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.re_issue(src.prnt_flg() ? MSC_PAY_NTC_PRNT_STR.RE_PRNT.name(MCSys.user.locale()) : null);
				dest.pay_ntc_addr(concatAddress(src.getStringNE(MAM_BP_R.$pay_ntc_addr1), src.getStringNE(MAM_BP_R.$pay_ntc_addr2),
						src.getStringNE(MAM_BP_R.$pay_ntc_addr3), src.getStringNE(MAM_BP_R.$pay_ntc_addr4)));
				dest.co_cd(getCo().co_cd());
				dest.zip_cd(getCo().zip_cd());
				dest.addr1(getCo().addr1());
				dest.addr2(getCo().addr2());
				dest.addr3(getCo().addr3());
				dest.addr4(getCo().addr4());
				dest.addr(concatAddress(getCo().addr1(), getCo().addr2(), getCo().addr3(), getCo().addr4()));
				dest.co_nm(getCo().co_nm());
				if (!isSame(src.trd_cur_cd(), getBaseCur().cur_cd())) {
					dest.base_cur_cd(getBaseCur().cur_cd());
					dest.base_cur_nm(getBaseCur().cur_nm());
					dest.pay_xrate(src.pay_xrate());
				}
			}
		}
		
		// 税額の内訳（買掛明細）設定用Mapper
		protected Map_PayNtcHdrR_MST_AP_D_R<PayNtcHdrR,MST_AP_D_R> createMap_PayNtcHdrR_MST_AP_D_R() {
			return new Map_PayNtcHdrR_MST_AP_D_R<PayNtcHdrR, MST_AP_D_R>();
		}
		public class Map_PayNtcHdrR_MST_AP_D_R<D extends PayNtcHdrR, S extends MST_AP_D_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PayNtcHdrR.$tax_rate1, MAM_TAX_R.$tax_rate);
				addColumnPathMap(PayNtcHdrR.$tax_rate_purc_amt1, MST_AP_D_R.$trd_cur_amt);
				addColumnPathMap(PayNtcHdrR.$tax_rate_tax_amt1, MST_AP_D_R.$trd_cur_tax_amt);
				addColumnPathMap(PayNtcHdrR.$tax_rate_base_tax_amt1, MST_AP_D_R.$base_cur_tax_amt);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.addDateColumn(_TAX_YM_COL, src.act_dt().startTimeOfMonth());
			}
		}
		
		// 税額の内訳（支払実績明細）設定用Mapper
		protected Map_PayNtcHdrR_MST_PAY_ACT_D_R<PayNtcHdrR,MST_PAY_ACT_D_R> createMap_PayNtcHdrR_MST_PAY_ACT_D_R() {
			return new Map_PayNtcHdrR_MST_PAY_ACT_D_R<PayNtcHdrR, MST_PAY_ACT_D_R>();
		}
		public class Map_PayNtcHdrR_MST_PAY_ACT_D_R<D extends PayNtcHdrR, S extends MST_PAY_ACT_D_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PayNtcHdrR.$tax_rate1, MAM_TAX_R.$tax_rate);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.addDateColumn(_TAX_YM_COL, src.getDateNE(MST_PAY_ACT_R.$pay_act_dt).startTimeOfMonth());
				dest.tax_rate_purc_amt1(nvl(src.trd_cur_exc_com_paid(), MCNumber.ZERO).negate());
				dest.tax_rate_tax_amt1(nvl(src.trd_cur_com_paid_tax_amt(), MCNumber.ZERO).negate());
				dest.tax_rate_base_tax_amt1(nvl(src.base_cur_com_paid_tax_amt(), MCNumber.ZERO).negate());
			}
		}
		
		// 税額の内訳（前渡金実績）設定用Mapper
		protected Map_PayNtcHdrR_MST_ADV_PAY_ACT_R<PayNtcHdrR,MST_ADV_PAY_ACT_R> createMap_PayNtcHdrR_MST_ADV_PAY_ACT_R() {
			return new Map_PayNtcHdrR_MST_ADV_PAY_ACT_R<PayNtcHdrR, MST_ADV_PAY_ACT_R>();
		}
		public class Map_PayNtcHdrR_MST_ADV_PAY_ACT_R<D extends PayNtcHdrR, S extends MST_ADV_PAY_ACT_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PayNtcHdrR.$tax_rate1, MAM_TAX_R.$tax_rate);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.addDateColumn(_TAX_YM_COL, src.pay_act_dt().startTimeOfMonth());
				dest.tax_rate_purc_amt1(nvl(src.trd_cur_exc_com_paid(), MCNumber.ZERO).negate());
				dest.tax_rate_tax_amt1(nvl(src.trd_cur_com_paid_tax_amt(), MCNumber.ZERO).negate());
				dest.tax_rate_base_tax_amt1(nvl(src.base_cur_com_paid_tax_amt(), MCNumber.ZERO).negate());
			}
		}
		
		// ヘッダの税額の内訳設定用Mapper
		protected Map_PayNtcHdrR_PayNtcHdrR<PayNtcHdrR,PayNtcHdrR> createMap_PayNtcHdrR_PayNtcHdrR() {
			return new Map_PayNtcHdrR_PayNtcHdrR<PayNtcHdrR, PayNtcHdrR>();
		}
		public class Map_PayNtcHdrR_PayNtcHdrR<D extends PayNtcHdrR, S extends PayNtcHdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PayNtcHdrR.$tax_rate1, PayNtcHdrR.$tax_rate1);
				addColumnPathMap(PayNtcHdrR.$tax_rate_purc_amt1, PayNtcHdrR.$tax_rate_purc_amt1);
				addColumnPathMap(PayNtcHdrR.$s_tax_rate_purc_amt1, PayNtcHdrR.$s_tax_rate_purc_amt1);
				addColumnPathMap(PayNtcHdrR.$tax_rate_tax_amt1, PayNtcHdrR.$tax_rate_tax_amt1);
				addColumnPathMap(PayNtcHdrR.$s_tax_rate_tax_amt1, PayNtcHdrR.$s_tax_rate_tax_amt1);
				addColumnPathMap(PayNtcHdrR.$tax_rate_base_tax_amt1, PayNtcHdrR.$tax_rate_base_tax_amt1);
				addColumnPathMap(PayNtcHdrR.$s_tax_rate_base_tax_amt1, PayNtcHdrR.$s_tax_rate_base_tax_amt1);
				addColumnPathMap(PayNtcHdrR.$tax_rate2, PayNtcHdrR.$tax_rate2);
				addColumnPathMap(PayNtcHdrR.$tax_rate_purc_amt2, PayNtcHdrR.$tax_rate_purc_amt2);
				addColumnPathMap(PayNtcHdrR.$s_tax_rate_purc_amt2, PayNtcHdrR.$s_tax_rate_purc_amt2);
				addColumnPathMap(PayNtcHdrR.$tax_rate_tax_amt2, PayNtcHdrR.$tax_rate_tax_amt2);
				addColumnPathMap(PayNtcHdrR.$s_tax_rate_tax_amt2, PayNtcHdrR.$s_tax_rate_tax_amt2);
				addColumnPathMap(PayNtcHdrR.$tax_rate_base_tax_amt2, PayNtcHdrR.$tax_rate_base_tax_amt2);
				addColumnPathMap(PayNtcHdrR.$s_tax_rate_base_tax_amt2, PayNtcHdrR.$s_tax_rate_base_tax_amt2);
				addColumnPathMap(PayNtcHdrR.$tax_rate3, PayNtcHdrR.$tax_rate3);
				addColumnPathMap(PayNtcHdrR.$tax_rate_purc_amt3, PayNtcHdrR.$tax_rate_purc_amt3);
				addColumnPathMap(PayNtcHdrR.$s_tax_rate_purc_amt3, PayNtcHdrR.$s_tax_rate_purc_amt3);
				addColumnPathMap(PayNtcHdrR.$tax_rate_tax_amt3, PayNtcHdrR.$tax_rate_tax_amt3);
				addColumnPathMap(PayNtcHdrR.$s_tax_rate_tax_amt3, PayNtcHdrR.$s_tax_rate_tax_amt3);
				addColumnPathMap(PayNtcHdrR.$tax_rate_base_tax_amt3, PayNtcHdrR.$tax_rate_base_tax_amt3);
				addColumnPathMap(PayNtcHdrR.$s_tax_rate_base_tax_amt3, PayNtcHdrR.$s_tax_rate_base_tax_amt3);
				addColumnPathMap(PayNtcHdrR.$tax_rate4, PayNtcHdrR.$tax_rate4);
				addColumnPathMap(PayNtcHdrR.$tax_rate_purc_amt4, PayNtcHdrR.$tax_rate_purc_amt4);
				addColumnPathMap(PayNtcHdrR.$s_tax_rate_purc_amt4, PayNtcHdrR.$s_tax_rate_purc_amt4);
				addColumnPathMap(PayNtcHdrR.$tax_rate_tax_amt4, PayNtcHdrR.$tax_rate_tax_amt4);
				addColumnPathMap(PayNtcHdrR.$s_tax_rate_tax_amt4, PayNtcHdrR.$s_tax_rate_tax_amt4);
				addColumnPathMap(PayNtcHdrR.$tax_rate_base_tax_amt4, PayNtcHdrR.$tax_rate_base_tax_amt4);
				addColumnPathMap(PayNtcHdrR.$s_tax_rate_base_tax_amt4, PayNtcHdrR.$s_tax_rate_base_tax_amt4);
				addColumnPathMap(PayNtcHdrR.$tax_rate5, PayNtcHdrR.$tax_rate5);
				addColumnPathMap(PayNtcHdrR.$tax_rate_purc_amt5, PayNtcHdrR.$tax_rate_purc_amt5);
				addColumnPathMap(PayNtcHdrR.$s_tax_rate_purc_amt5, PayNtcHdrR.$s_tax_rate_purc_amt5);
				addColumnPathMap(PayNtcHdrR.$tax_rate_tax_amt5, PayNtcHdrR.$tax_rate_tax_amt5);
				addColumnPathMap(PayNtcHdrR.$s_tax_rate_tax_amt5, PayNtcHdrR.$s_tax_rate_tax_amt5);
				addColumnPathMap(PayNtcHdrR.$tax_rate_base_tax_amt5, PayNtcHdrR.$tax_rate_base_tax_amt5);
				addColumnPathMap(PayNtcHdrR.$s_tax_rate_base_tax_amt5, PayNtcHdrR.$s_tax_rate_base_tax_amt5);
				addColumnPathMap(PayNtcHdrR.$tax_rate6, PayNtcHdrR.$tax_rate6);
				addColumnPathMap(PayNtcHdrR.$tax_rate_purc_amt6, PayNtcHdrR.$tax_rate_purc_amt6);
				addColumnPathMap(PayNtcHdrR.$s_tax_rate_purc_amt6, PayNtcHdrR.$s_tax_rate_purc_amt6);
				addColumnPathMap(PayNtcHdrR.$tax_rate_tax_amt6, PayNtcHdrR.$tax_rate_tax_amt6);
				addColumnPathMap(PayNtcHdrR.$s_tax_rate_tax_amt6, PayNtcHdrR.$s_tax_rate_tax_amt6);
				addColumnPathMap(PayNtcHdrR.$tax_rate_base_tax_amt6, PayNtcHdrR.$tax_rate_base_tax_amt6);
				addColumnPathMap(PayNtcHdrR.$s_tax_rate_base_tax_amt6, PayNtcHdrR.$s_tax_rate_base_tax_amt6);
				addColumnPathMap(PayNtcHdrR.$tax_rate7, PayNtcHdrR.$tax_rate7);
				addColumnPathMap(PayNtcHdrR.$tax_rate_purc_amt7, PayNtcHdrR.$tax_rate_purc_amt7);
				addColumnPathMap(PayNtcHdrR.$s_tax_rate_purc_amt7, PayNtcHdrR.$s_tax_rate_purc_amt7);
				addColumnPathMap(PayNtcHdrR.$tax_rate_tax_amt7, PayNtcHdrR.$tax_rate_tax_amt7);
				addColumnPathMap(PayNtcHdrR.$s_tax_rate_tax_amt7, PayNtcHdrR.$s_tax_rate_tax_amt7);
				addColumnPathMap(PayNtcHdrR.$tax_rate_base_tax_amt7, PayNtcHdrR.$tax_rate_base_tax_amt7);
				addColumnPathMap(PayNtcHdrR.$s_tax_rate_base_tax_amt7, PayNtcHdrR.$s_tax_rate_base_tax_amt7);
				addColumnPathMap(PayNtcHdrR.$tax_rate8, PayNtcHdrR.$tax_rate8);
				addColumnPathMap(PayNtcHdrR.$tax_rate_purc_amt8, PayNtcHdrR.$tax_rate_purc_amt8);
				addColumnPathMap(PayNtcHdrR.$s_tax_rate_purc_amt8, PayNtcHdrR.$s_tax_rate_purc_amt8);
				addColumnPathMap(PayNtcHdrR.$tax_rate_tax_amt8, PayNtcHdrR.$tax_rate_tax_amt8);
				addColumnPathMap(PayNtcHdrR.$s_tax_rate_tax_amt8, PayNtcHdrR.$s_tax_rate_tax_amt8);
				addColumnPathMap(PayNtcHdrR.$tax_rate_base_tax_amt8, PayNtcHdrR.$tax_rate_base_tax_amt8);
				addColumnPathMap(PayNtcHdrR.$s_tax_rate_base_tax_amt8, PayNtcHdrR.$s_tax_rate_base_tax_amt8);
				addColumnPathMap(PayNtcHdrR.$tax_rate9, PayNtcHdrR.$tax_rate9);
				addColumnPathMap(PayNtcHdrR.$tax_rate_purc_amt9, PayNtcHdrR.$tax_rate_purc_amt9);
				addColumnPathMap(PayNtcHdrR.$s_tax_rate_purc_amt9, PayNtcHdrR.$s_tax_rate_purc_amt9);
				addColumnPathMap(PayNtcHdrR.$tax_rate_tax_amt9, PayNtcHdrR.$tax_rate_tax_amt9);
				addColumnPathMap(PayNtcHdrR.$s_tax_rate_tax_amt9, PayNtcHdrR.$s_tax_rate_tax_amt9);
				addColumnPathMap(PayNtcHdrR.$tax_rate_base_tax_amt9, PayNtcHdrR.$tax_rate_base_tax_amt9);
				addColumnPathMap(PayNtcHdrR.$s_tax_rate_base_tax_amt9, PayNtcHdrR.$s_tax_rate_base_tax_amt9);
				addColumnPathMap(PayNtcHdrR.$tax_rate10, PayNtcHdrR.$tax_rate10);
				addColumnPathMap(PayNtcHdrR.$tax_rate_purc_amt10, PayNtcHdrR.$tax_rate_purc_amt10);
				addColumnPathMap(PayNtcHdrR.$s_tax_rate_purc_amt10, PayNtcHdrR.$s_tax_rate_purc_amt10);
				addColumnPathMap(PayNtcHdrR.$tax_rate_tax_amt10, PayNtcHdrR.$tax_rate_tax_amt10);
				addColumnPathMap(PayNtcHdrR.$s_tax_rate_tax_amt10, PayNtcHdrR.$s_tax_rate_tax_amt10);
				addColumnPathMap(PayNtcHdrR.$tax_rate_base_tax_amt10, PayNtcHdrR.$tax_rate_base_tax_amt10);
				addColumnPathMap(PayNtcHdrR.$s_tax_rate_base_tax_amt10, PayNtcHdrR.$s_tax_rate_base_tax_amt10);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.s_tax_rate1(getTaxRateStr(src.s_tax_rate1(), src.getStringNE("tax_ym1")));
				dest.s_tax_rate2(getTaxRateStr(src.s_tax_rate2(), src.getStringNE("tax_ym2")));
				dest.s_tax_rate3(getTaxRateStr(src.s_tax_rate3(), src.getStringNE("tax_ym3")));
				dest.s_tax_rate4(getTaxRateStr(src.s_tax_rate4(), src.getStringNE("tax_ym4")));
				dest.s_tax_rate5(getTaxRateStr(src.s_tax_rate5(), src.getStringNE("tax_ym5")));
				dest.s_tax_rate6(getTaxRateStr(src.s_tax_rate6(), src.getStringNE("tax_ym6")));
				dest.s_tax_rate7(getTaxRateStr(src.s_tax_rate7(), src.getStringNE("tax_ym7")));
				dest.s_tax_rate8(getTaxRateStr(src.s_tax_rate8(), src.getStringNE("tax_ym8")));
				dest.s_tax_rate9(getTaxRateStr(src.s_tax_rate9(), src.getStringNE("tax_ym9")));
				dest.s_tax_rate10(getTaxRateStr(src.s_tax_rate10(), src.getStringNE("tax_ym10")));
			}
			/**
			 * 税率文字列に表示する文字列を取得する
			 * @param s_tax_rate 税率
			 * @param tax_ym 対象月
			 * @return 税率文字列
			 */
			protected String getTaxRateStr(String s_tax_rate, String tax_ym) {
				
				// 税率を表示する場合
				if (!isNull(s_tax_rate)) {
					return s_tax_rate + MSC_PAY_NTC_PRNT_STR.TAX_TGT.name(MCSys.user.locale());
				}
				// 対象月を表示する場合
				else if(!isNull(tax_ym)) {
					return _TAX_YM_INDENT + tax_ym;
				}
				// 表示なしの場合
				else {
					return null;
				}
			}
		}
		
		// 支払通知書明細データ（買掛明細）設定用Mapper
		protected Map_PayNtcDtlR_MST_AP_D_R<PayNtcDtlR,MST_AP_D_R> createMap_PayNtcDtlR_MST_AP_D_R() {
			return new Map_PayNtcDtlR_MST_AP_D_R<PayNtcDtlR, MST_AP_D_R>();
		}
		public class Map_PayNtcDtlR_MST_AP_D_R<D extends PayNtcDtlR, S extends MST_AP_D_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PayNtcDtlR.$purc_ac_dt, MST_AP_D_R.$act_dt);
				addColumnPathMap(PayNtcDtlR.$base_purc_ac_dt, MST_AP_D_R.$base_purc_ac_dt);
				addColumnPathMap(PayNtcDtlR.$po_no, MST_AP_D_R.$po_no);
				addColumnPathMap(PayNtcDtlR.$po_d_no, MST_AP_D_R.$po_d_no);
				addColumnPathMap(PayNtcDtlR.$dlv_slip_no, MST_AP_D_R.$bp_dlv_slip_no);
				addColumnPathMap(PayNtcDtlR.$dlv_slip_d_no, MST_AP_D_R.$bp_dlv_slip_d_no);
				addColumnPathMap(PayNtcDtlR.$act_no, MST_AP_D_R.$purc_act_no);
				addColumnPathMap(PayNtcDtlR.$act_rev, MST_AP_D_R.$purc_act_rev);
				addColumnPathMap(PayNtcDtlR.$act_d_no, MST_AP_D_R.$purc_act_d_no);
				addColumnPathMap(PayNtcDtlR.$slip_sts_typ, MST_AP_D_R.$slip_sts_typ);
				addColumnPathMap(PayNtcDtlR.$itm_cd, MST_AP_D_R.$itm_cd);
				addColumnPathMap(PayNtcDtlR.$itm_sub1_data, MST_AP_D_R.$itm_sub1);
				addColumnPathMap(PayNtcDtlR.$itm_sub2_data, MST_AP_D_R.$itm_sub2);
				addColumnPathMap(PayNtcDtlR.$itm_sub3_data, MST_AP_D_R.$itm_sub3);
				addColumnPathMap(PayNtcDtlR.$sppl_itm_cd, MST_AP_D_R.$sppl_itm_cd);
				addColumnPathMap(PayNtcDtlR.$itm_nm, MST_AP_D_R.$itm_nm);
				addColumnPathMap(PayNtcDtlR.$itm_alt_nm1, MAM_ITM_R.$itm_alt_nm1);
				addColumnPathMap(PayNtcDtlR.$itm_alt_nm2, MAM_ITM_R.$itm_alt_nm2);
				addColumnPathMap(PayNtcDtlR.$itm_alt_nm3, MAM_ITM_R.$itm_alt_nm3);
				addColumnPathMap(PayNtcDtlR.$itm_alt_nm4, MAM_ITM_R.$itm_alt_nm4);
				addColumnPathMap(PayNtcDtlR.$sppl_itm_nm, MST_AP_D_R.$sppl_itm_nm);
				addColumnPathMap(PayNtcDtlR.$pay_mtd_typ, MST_AP_D_R.$pay_mtd_typ);
				addColumnPathMap(PayNtcDtlR.$trd_cd, MST_AP_D_R.$trd_cd);
				addColumnPathMap(PayNtcDtlR.$trd_nm, MAM_TRD_R.$trd_nm);
				addColumnPathMap(PayNtcDtlR.$trd_unit_cd, MST_AP_D_R.$trd_unit_cd);
				addColumnPathMap(PayNtcDtlR.$unit_nm, MAM_UNIT_R.$unit_nm);
				addColumnPathMap(PayNtcDtlR.$inc_tax_flg, MAM_TAX_R.$inc_tax_flg);
				addColumnPathMap(PayNtcDtlR.$interim_flg, MST_AP_D_R.$interim_flg);
				addColumnPathMap(PayNtcDtlR.$trd_cur_dscnt_amt, MST_AP_D_R.$trd_cur_dscnt_amt);
				addColumnPathMap(PayNtcDtlR.$trd_cur_tax_amt, MST_AP_D_R.$trd_cur_tax_amt);
				addColumnPathMap(PayNtcDtlR.$tax_rate, MAM_TAX_R.$tax_rate);
				addColumnPathMap(PayNtcDtlR.$tax_cd, MST_AP_D_R.$tax_cd);
				addColumnPathMap(PayNtcDtlR.$tax_nm, MAM_TAX_R.$tax_nm);
				addColumnPathMap(PayNtcDtlR.$pay_ntc_d_print_rmrks, MST_AP_D_R.$pay_ntc_d_print_rmrks);
				addColumnPathMap(PayNtcDtlR.$d_sub_char1, MST_AP_D_R.$sub_char1);
				addColumnPathMap(PayNtcDtlR.$d_sub_char2, MST_AP_D_R.$sub_char2);
				addColumnPathMap(PayNtcDtlR.$d_sub_char3, MST_AP_D_R.$sub_char3);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.s_inc_tax_flg(src.getBooleanNE(MAM_TAX_R.$inc_tax_flg) ? MSC_PAY_NTC_PRNT_STR.INC_TAX.name(MCSys.user.locale()) : null);
				dest.s_interim_flg(src.interim_flg() ? MSC_PAY_NTC_PRNT_STR.INTERIM.name(MCSys.user.locale()) : null);
				if (MAC_TRD_PTN_TYP.isTAX_DIFF_PAY_SCHD_CL(src.trd_ptn_typ())) {
					dest.trd_unit_qty(null);
					dest.trd_cur_upri(null);
					dest.trd_cur_amt(null);
				}
				else {
					dest.trd_unit_qty(src.trd_unit_qty());
					dest.trd_cur_upri(src.trd_cur_upri());
					dest.trd_cur_amt(src.trd_cur_amt());
				}
				dest.addDateColumn(MST_AP_D_R.$ac_dt, src.ac_dt());
				dest.addNumberColumn("act_d_seq", src.purc_act_d_seq());
				dest.addStringColumn(MST_AP_D_R.$sppl_cd, src.sppl_cd());
				dest.addStringColumn("sppl_nm", src.getStringNE("sppl_nm"));
				dest.addStringColumn(MST_AP_D_R.$asppl_cd, src.asppl_cd());
				dest.addStringColumn("asppl_nm", src.getStringNE("asppl_nm"));
				dest.addNumberColumn(MST_AP_D_R.$base_cur_tax_amt, src.base_cur_tax_amt());
				dest.addNumberColumn("part_pay_ntc_ttl_amt", src.getNumberNE("part_pay_ntc_ttl_amt"));
				dest.addNumberColumn("part_pay_ntc_crryovr_amt", src.getNumberNE("part_pay_ntc_crryovr_amt"));
				dest.addStringColumn(MST_AP_D_R.$po_wrk_no, src.po_wrk_no());
				dest.addStringColumn(MST_WRK_R.$wrk_nm, src.getStringNE(MST_WRK_R.$wrk_nm));
				dest.addNumberColumn(MAVM_ITM_UNIT_R.$dec_place, src.getNumberNE(MAVM_ITM_UNIT_R.$dec_place));
				dest.addBooleanColumn("pay_flg", false);
			}
		}
		
		// 支払通知書明細データ（支払実績明細）設定用Mapper
		protected Map_PayNtcDtlR_MST_PAY_ACT_D_R<PayNtcDtlR,MST_PAY_ACT_D_R> createMap_PayNtcDtlR_MST_PAY_ACT_D_R() {
			return new Map_PayNtcDtlR_MST_PAY_ACT_D_R<PayNtcDtlR, MST_PAY_ACT_D_R>();
		}
		public class Map_PayNtcDtlR_MST_PAY_ACT_D_R<D extends PayNtcDtlR, S extends MST_PAY_ACT_D_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PayNtcDtlR.$purc_ac_dt, MST_PAY_ACT_R.$pay_act_dt);
				addColumnPathMap(PayNtcDtlR.$act_no, MST_PAY_ACT_R.$pay_act_no);
				addColumnPathMap(PayNtcDtlR.$act_rev, MST_PAY_ACT_R.$pay_act_seq);
				addColumnPathMap(PayNtcDtlR.$act_d_no, MST_PAY_ACT_D_R.$pay_act_d_no);
				addColumnPathMap(PayNtcDtlR.$slip_sts_typ, MST_PAY_ACT_R.$slip_sts_typ);
				addColumnPathMap(PayNtcDtlR.$trd_cd, MST_PAY_ACT_D_R.$ap_sttl_cd);
				addColumnPathMap(PayNtcDtlR.$trd_nm, MAM_STTL_R.$sttl_nm);
				addColumnPathMap(PayNtcDtlR.$pay_ntc_d_print_rmrks, MST_PAY_ACT_D_R.$pay_ntc_d_print_rmrks);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.addStringColumn(MST_PAY_ACT_D_R.$ap_sttl_typ, src.ap_sttl_typ());
				if (MAC_AP_STTL_TYP.isSETOFF(src.ap_sttl_typ())) {
					if (src.getBooleanNE(MAM_STTL_R.$bill_tax_disp_flg)) {
						dest.trd_cur_amt(getTrdCurSetoffAmtExcludingTax(src));
						dest.trd_cur_tax_amt(src.trd_cur_com_paid_tax_amt());
						dest.tax_rate(src.getNumberNE(MAM_TAX_R.$tax_rate));
						dest.tax_cd(src.trd_cur_com_paid_tax_cd());
						dest.tax_nm(src.getStringNE(MAM_TAX_R.$tax_nm));
						dest.inc_tax_flg(src.getBooleanNE(MAM_TAX_R.$inc_tax_flg));
						dest.s_inc_tax_flg(src.getBooleanNE(MAM_TAX_R.$inc_tax_flg) ? MSC_PAY_NTC_PRNT_STR.INC_TAX.name(MCSys.user.locale()) : null);
					}
					else {
						dest.trd_cur_amt(getTrdCurSetoffAmtExcludingTax(src).add(nvl(src.trd_cur_com_paid_tax_amt(), MCNumber.ZERO)));
					}
					dest.addBooleanColumn(_SETOFF_FLG_COL, true);
				}
				else {
					dest.trd_cur_amt(src.trd_cur_amt());
					dest.addBooleanColumn(_SETOFF_FLG_COL, false);
				}
				dest.addDateColumn(MST_PAY_ACT_R.$ac_dt, src.getDateNE(MST_PAY_ACT_R.$ac_dt));
				dest.addNumberColumn("act_d_seq", src.pay_act_d_seq());
				dest.addStringColumn(MST_PAY_ACT_R.$trd_cur_cd, src.getStringNE(MST_PAY_ACT_R.$trd_cur_cd));
				dest.addStringColumn(MAM_CUR_R.$cur_nm, src.getStringNE(MAM_CUR_R.$cur_nm));
				dest.addBooleanColumn("pay_flg", true);
			}
		}
		
		protected MCNumber getTrdCurSetoffAmtExcludingTax(MST_PAY_ACT_D_R payActDR) {
			return nvl(payActDR.trd_cur_exc_com_paid(), nvl(payActDR.trd_cur_amt(), MCNumber.ZERO));
		}
		
		protected MCNumber getTrdCurSetoffAmtExcludingTax(MST_ADV_PAY_ACT_R advPayActR) {
			return nvl(advPayActR.trd_cur_exc_com_paid(), nvl(advPayActR.trd_cur_com_paid(), MCNumber.ZERO));
		}

		protected void callPayNtcAttachSrv(List<MCReportSet> rsLst) {
			List<Attach_Chk01_DtlR> upLst = new ArrayList<Attach_Chk01_DtlR>();
			createPayNtcAttachLst(rsLst,upLst);
			
			if(upLst.isEmpty()) {
				return;
			}
			
			MBBCL_AttachService.Attach_Upd01 ope = MBBCL_AttachService.crtAttach_Upd01();
			setPayChkAttachUp(ope,upLst);
			ope.exec();
		}
		protected void createPayNtcAttachLst(List<MCReportSet> rsLst, List<Attach_Chk01_DtlR> upLst) {
			for(MCReportSet rs: rsLst) {
				//reportSetから、ヘッダを取得する
				String bt = rs.getBlockType(PayNtcHdrR.create());
				
				@SuppressWarnings("unchecked")
				MCList<MCRow> hdrL = rs.getAll(bt);

				if (hdrL == null || hdrL.isEmpty()) {
					continue;
				}
				
				PayNtcHdrR hdrR = (PayNtcHdrR) hdrL.get(0);
				//再発行は登録サービス呼び出し対象外
				if(isRePrntPayNtc(hdrR)) {
					continue;
				}
				editPayNtcAttachLst(rs,hdrR,upLst);
			}
		}
		protected void setPayChkAttachUp(MBBCL_AttachService.Attach_Upd01 ope,List<Attach_Chk01_DtlR> upLst) {
			ope.up0().addAll(upLst);
			ope.up1().upd_cntr_chk_flg(false);
			ope.up1().del_flg(false);
		}
		protected Boolean isRePrntPayNtc(PayNtcHdrR hdrR) {
			List<String> list = new ArrayList<>();
			list.add(hdrR.pay_chk_no());//no
			list.add(hdrR.pay_ntc_rev().toString());//rev
			
			if(_rePrntPayChkSet.contains(list)) {
				return true;
			}
			return false;
		}
		protected void editPayNtcAttachLst(MCReportSet rs, PayNtcHdrR hdrR,List<Attach_Chk01_DtlR> upLst) {
			Attach_Chk01_DtlR up0 = Attach_Chk01_DtlR.create();
			copy(up0, hdrR, createMap_Attach_Chk01_DtlR_PayNtcHdrR());
			//WG
			up0.wg_cd(getWgCd(hdrR.bsppl_dpt_cd(), hdrR.reg_dt()));
			//帳票ID
			up0.report_id(rs.getReportInfo().report_id());
			//添付元ファイル(バイナリ）
			up0.file_bin(rs.getReportInfo().save_file_bin());
			upLst.add(up0);
		}

		protected Map_Attach_Chk01_DtlR_PayNtcHdrR<Attach_Chk01_DtlR, PayNtcHdrR> createMap_Attach_Chk01_DtlR_PayNtcHdrR() {
			return new Map_Attach_Chk01_DtlR_PayNtcHdrR<Attach_Chk01_DtlR, PayNtcHdrR>();
		}
		
		public class Map_Attach_Chk01_DtlR_PayNtcHdrR<D extends Attach_Chk01_DtlR, S extends PayNtcHdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Attach_Chk01_DtlR.$biz_key1, PayNtcHdrR.$pay_chk_no);//支払照合ＮＯ
				addColumnPathMap(Attach_Chk01_DtlR.$dt, PayNtcHdrR.$reg_dt);//登録日
				addColumnPathMap(Attach_Chk01_DtlR.$bp_cd, PayNtcHdrR.$bsppl_cd);//支払予定管理先ＣＤ
				addColumnPathMap(Attach_Chk01_DtlR.$cur_cd, PayNtcHdrR.$cur_cd);//通貨ＣＤ
				addColumnPathMap(Attach_Chk01_DtlR.$bsppl_cd, PayNtcHdrR.$bsppl_cd);//支払予定管理先ＣＤ
				addColumnPathMap(Attach_Chk01_DtlR.$bsppl_dpt_cd, PayNtcHdrR.$bsppl_dpt_cd);//部門
				addColumnPathMap(Attach_Chk01_DtlR.$wrk_no, PayNtcHdrR.$wrk_no);//案件
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				dest.biz_typ(MAC_BIZ_TYP.PAY_NTC.value());//業務区分：支払通知
				dest.biz_key2(src.pay_ntc_rev().toString());//通知書改訂番号はNum→Str変換してセット
				dest.amt(src.schd_pay_amt());//今回支払予定金額
				dest.attach_file_flg(true);//ファイル添付フラグ
			}
		}
		/**再発行の帳票情報をセットに追加
		 */
		protected void addReprntSetKey(Set<List<String>> tgtSet,MST_PAY_CHK_R r) {
			List<String> keyLst = createReprntSetKey(r);
			if(!tgtSet.contains(keyLst)) {
				tgtSet.add(keyLst);
			}
		}
		protected List<String> createReprntSetKey(MST_PAY_CHK_R r){
			List<String> list = new ArrayList<>();
			if (!isNull(r)) {
				list.add(r.pay_chk_no());//no
				list.add(r.pay_ntc_rev().toString());//rev
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