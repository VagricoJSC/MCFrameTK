package mcframe.serverMSBG.MSBGL5120;

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
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import static mcframe.serverMSBG.MSBGL5120.Query.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverFXUC.FXUCL0030.*;
import mcframe.commonFXUC.FXUCC0030.*;
import mcframe.serverMAUC.MAUCL0140.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBGL_ArUtil"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBGL_ArUtil_MC extends MSBGL_ArUtil_MC_A{
	//FMCB CUSTOM START

	/**
	 * このクラス（スレッドセーフ対応用）
	 */
	protected static final Class<MSBGL_ArUtil> CLAZZ = MSBGL_ArUtil.class;

	/**
	 * 休日を考慮して引数の入金予定日（schdRcvDt）を調整する。
	 * 
	 * @param rcvSchdDt 入金予定日
	 * @param billClDt 請求年月日
	 * @param bcstCd 請求先ＣＤ
	 * @param sttlCd 決済方法ＣＤ
	 * @param billDptCd 請求部門ＣＤ
	 * @return 休日を考慮して入金予定日を調整した結果の日付
	 */
	public static MCDate adjustSchdRcvDt(MCDate rcvSchdDt, MCDate billClDt, String bcstCd, String sttlCd, String billDptCd) {
		return object(CLAZZ)._adjustSchdRcvDt(rcvSchdDt, billClDt, bcstCd, sttlCd, billDptCd);
	}

	protected MCDate _adjustSchdRcvDt(MCDate rcvSchdDt, MCDate billClDt, String bcstCd, String sttlCd, String billDptCd) {
		return adjustSchdRcvDt(rcvSchdDt, billClDt, getBp(bcstCd), sttlCd, billDptCd);
	}

	/**
	 * 休日を考慮して引数の入金予定日（schdRcvDt）を調整する。
	 * 
	 * @param rcvSchdDt 休日を考慮していない入金予定日
	 * @param billClDt 請求年月日
	 * @param bcstR 請求先情報
	 * @param sttlCd 決済方法ＣＤ
	 * @param billDptCd 請求部門ＣＤ
	 * @return 休日考慮後の入金予定日
	 */
	protected MCDate adjustSchdRcvDt(MCDate rcvSchdDt, MCDate billClDt, MAM_BP_R bcstR, String sttlCd, String billDptCd) {
		if (isNullOr(bcstR.rcv_ba_typ(), rcvSchdDt)) {
			return rcvSchdDt;
		}

		// 決済方法別に日付を調整
		// 「振込」の場合
		if (MAC_AR_STTL_TYP.isBANK(getArSttl(sttlCd).ar_sttl_typ())) {

			// 請求先の担当部門に対応する銀行カレンダ取得
			String dptBankCalCd = getDptBankCal(billClDt, getBcstDpt(bcstR.bp_cd(), billClDt, billDptCd, billDptCd));

			// 銀行カレンダと請求先のカレンダで両方が営業日の日付
			MCDate dt = MAUCL_DateUtil.getBusinessDay(rcvSchdDt, bcstR.rcv_ba_typ(), dptBankCalCd, bcstR.bill_cal_cd());
			return dt;
		}
		else {
			// 請求先のカレンダで営業日の日付
			MCDate dt = MAUCL_DateUtil.getBusinessDay(rcvSchdDt, bcstR.rcv_ba_typ(), null, bcstR.bill_cal_cd());
			return dt;
		}
	}

	/** 部門に対応した銀行のカレンダＣＤキャッシュ */
	protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _dptCal;

	protected String getDptBankCal(MCDate stDt, String dptCd) {
		
		if (_dptCal == null) {
			MAM_BANK_R bank1 = MAM_BANK_R.create("BANK1");
			MCList<MCRow> bindL = MCList.create(MCRow.class);
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(MAM_DPT_R.create("T"));
			MAM_BANK_BRANCH_R branch1 = MAM_BANK_BRANCH_R.create("BRANCH1");
			MAM_BANK_AC_R bank_ac1 = MAM_BANK_AC_R.create("BANK_AC1");
			
			builder.addSelect(nvl(branch1.cal_cd, bank1.cal_cd).as("bank_cal_cd"));
			builder.activeForeign(MAM_DPT_R.$BANK_AC1);
			builder.addLeftOuterJoin(bank1, bank_ac1.bank_cd.eq(bank1.bank_cd));
			builder.addLeftOuterJoin(branch1, bank_ac1.bank_cd.eq(branch1.bank_cd)
					.and(bank_ac1.branch_cd.eq(branch1.branch_cd)));
			_dptCal = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(builder, bindL, MAM_DPT_R.$dpt_cd);
		}

		return _dptCal.get(stDt, dptCd).getStringNE("bank_cal_cd");
	}

	/**
	 * 最終請求書請求額取得<br />
	 * 
	 * 最後の請求書の請求額を取得する。
	 * 
	 * @param bcstCd 請求先ＣＤ
	 * @param billDptCd 請求部門ＣＤ
	 * @param ivNo インボイスＮＯ
	 * @param curCd 通貨ＣＤ
	 * @param wrkNo 案件ＮＯ
	 * @param flg フラグ
	 * 				trueの場合、請求明細のインボイスＮＯを条件にする
	 * 				falseの場合、請求ヘッダのインボイスＮＯを条件にする
	 * 
	 * @return 最後の請求書の請求額
	 */
	public static MCNumber getLastBillAmt(String bcstCd, String billDptCd, String ivNo, String curCd, String wrkNo,
			boolean flg) {
		return object(CLAZZ)._getLastBillAmt(bcstCd, billDptCd, ivNo, curCd, wrkNo, flg);
	}

	protected MCNumber _getLastBillAmt(String bcstCd, String billDptCd, String ivNo, String curCd, String wrkNo,
			boolean flg) {
		MST_BILL_R lastBill = getLastBillRec(bcstCd, billDptCd, ivNo, curCd, wrkNo, flg);
		if (lastBill.isEmpty()) {
			return null;
		}
		else {
			// -該当のレコードの今回請求額を前回請求額として返す
			return lastBill.bill_amt();
		}
	}

	/**
	 * 最新請求取得<br />
	 * 
	 * 最後の請求書の請求レコードを取得する。画面か、バッチで締めを行った請求が対象。都度請求は対象としない。
	 * 
	 * @param bcstCd 請求先ＣＤ
	 * @param billDptCd 請求部門ＣＤ
	 * @param ivNo インボイスＮＯ
	 * @param curCd 通貨ＣＤ
	 * @param wrkNo 案件ＮＯ
	 * @param flg フラグ
	 * 				trueの場合、請求明細のインボイスＮＯを条件にする
	 * 				falseの場合、請求ヘッダのインボイスＮＯを条件にする
	 * 
	 * @return 最新請求
	 */
	public static MST_BILL_R getLastBillRec(String bcstCd, String billDptCd, String ivNo, String curCd, String wrkNo,
			boolean flg) {
		return object(CLAZZ)._getLastBillRec(bcstCd, billDptCd, ivNo, curCd, wrkNo, flg);
	}

	protected MST_BILL_R _getLastBillRec(String bcstCd, String billDptCd, String ivNo, String curCd, String wrkNo, boolean flg) {
		MST_BILL_R r = MST_BILL_R.create();
		MST_BILL_R t = MST_BILL_R.create("T");
		MCQueryApiBuilder r_bldr = MCQueryApiBuilder.create(t);
		r_bldr.addWhereWithAnd(t.bill_mng_no.eq(bind("1")),
				getLastBillMngNo(bcstCd, billDptCd, ivNo, curCd, wrkNo, flg));
		dbSelect("MSBGL5120_MST_BILL_S01", r, r_bldr);
		return r;
	}

	/**
	 * 最新請求管理ＮＯ取得<br />
	 * 
	 * 最新の請求管理ＮＯを返す。
	 * 
	 * @param bcstCd 請求先ＣＤ
	 * @param billDptCd 請求部門ＣＤ
	 * @param ivNo インボイスＮＯ
	 * @param curCd 通貨ＣＤ
	 * @param wrkNo 案件ＮＯ
	 * @param flg フラグ
	 * 				trueの場合、請求明細のインボイスＮＯを条件にする
	 * 				falseの場合、請求ヘッダのインボイスＮＯを条件にする
	 * @param prntBillMngNo 発番請求管理ＮＯ。指定しないことも可能。
	 * 					複数指定した場合、最初の発番請求管理ＮＯのみが採用される。
	 * 
	 * @return 最新の請求管理ＮＯ
	 */
	public static String getLastBillMngNo(String bcstCd, String billDptCd, String ivNo, String curCd, String wrkNo,
			boolean flg, MCNumber... prntBillMngNo) {
		return object(CLAZZ)._getLastBillMngNo(bcstCd, billDptCd, ivNo, curCd, wrkNo, flg, prntBillMngNo);
	}


	protected String _getLastBillMngNo(String bcstCd, String billDptCd, String ivNo, String curCd, String wrkNo, boolean flg,
			MCNumber... prntBillMngNo) {
		MST_BILL_R r = MST_BILL_R.create();
		MST_BILL_R t = MST_BILL_R.create("T");
		MCQueryApiBuilder r_bldr = MCQueryApiBuilder.create(t);
		r_bldr.addMax(t.bill_mng_no, "bill_mng_no");
		r_bldr.addWhereWithAnd(t.bcst_cd.eq(bind("1")), bcstCd);
		r_bldr.addWhereWithAnd(t.bill_dpt_cd.eq(bind("1")), billDptCd);
		if (flg) {
			MST_BILL_D_R S1TB1 = MST_BILL_D_R.create("TB1");
			r_bldr.addWhereWithAnd(exists(subQuery()
					.select(value("X"))
					.from(S1TB1)
					.where(t.bill_mng_no.eq(S1TB1.bill_mng_no)
							.and(S1TB1.iv_no.eq(bind("1"))))),
					ivNo);
		}
		else {
			r_bldr.addWhereWithAnd(t.iv_no.eq(bind("1")), ivNo);
		}
		r_bldr.addWhereWithAnd(t.trd_cur_cd.eq(bind("1")), curCd);
		r_bldr.addWhereWithAnd(bracket(t.wrk_no.eq(bind("1"))
				.or(t.wrk_no.isNull())
				.and(bind("1").isNull())),
				wrkNo);
		r_bldr.addWhereWithAnd(t.bill_cl_sts_typ.in(value(MSC_BILL_CL_STS_TYP.CL_SCRN.value()),
				value(MSC_BILL_CL_STS_TYP.CL_BATCH.value())));
		if (prntBillMngNo.length > 0) {
			r_bldr.addWhereWithAnd(t.bill_mng_no.neq(bind("1")), prntBillMngNo[0]);
		}
		dbSelect("MSBGL5120_MST_BILL_S02", r, r_bldr);
		return r.bill_mng_no();
	}

	/**
	 * 最新請求今回請求額取得<br />
	 * 
	 * 未請求の請求で、請求締年月日より前の最新の請求から今回請求額を取得する。
	 * 
	 * @param bcstCd 請求先ＣＤ
	 * @param billDptCd 請求部門ＣＤ
	 * @param ivNo インボイスＮＯ
	 * @param curCd 通貨ＣＤ
	 * @param billYmd 請求締年月日
	 * @param wrkNo 案件ＮＯ
	 * 
	 * @return 今回請求額
	 */
	public static MCNumber getLastNotBillAmt(String bcstCd, String billDptCd, String ivNo, String curCd,
			MCDate billYmd, String wrkNo) {
		return object(CLAZZ)._getLastNotBillAmt(bcstCd, billDptCd, ivNo, curCd, billYmd, wrkNo);
	}

	protected MCNumber _getLastNotBillAmt(String bcstCd, String billDptCd, String ivNo, String curCd,
			MCDate billYmd, String wrkNo) {
		MST_BILL_R r = getLastNotBillRec(bcstCd, billDptCd, ivNo, curCd, billYmd, wrkNo);
		if (r.isEmpty()) {
			return null;
		}
		else {
			return r.bill_amt();
		}
	}

	/**
	 * 最新請求取得<br />
	 * 
	 * 未請求の請求で、引数の請求締年月日より前の最新の請求を取得する。
	 * 
	 * @param bcstCd 請求先ＣＤ
	 * @param billDptCd 請求部門ＣＤ
	 * @param ivNo インボイスＮＯ
	 * @param curCd 通貨ＣＤ
	 * @param billYmd 請求締年月日
	 * @param wrkNo 案件ＮＯ
	 * 
	 * @return 最新請求
	 */
	public static MST_BILL_R getLastNotBillRec(String bcstCd, String billDptCd, String ivNo,
			String curCd, MCDate billYmd, String wrkNo) {
		return object(CLAZZ)._getLastNotBillRec(bcstCd, billDptCd, ivNo, curCd, billYmd, wrkNo);
	}


	protected MST_BILL_R _getLastNotBillRec(String bcstCd, String billDptCd, String ivNo, String curCd, MCDate billYmd, String wrkNo) {
		MST_BILL_R r = MST_BILL_R.create();
		MST_BILL_R t = MST_BILL_R.create("T");
		MCQueryApiBuilder r_bldr = MCQueryApiBuilder.create(t);
		// 未請求の場合、他のキーが同じだと請求締年月日は重複しない
		r_bldr.addWhereWithAnd(t.bill_cl_dt.eq(bind("1")),
				getLastNotBillClDt(bcstCd, billDptCd, ivNo, curCd, wrkNo, billYmd));
		r_bldr.addWhereWithAnd(t.bcst_cd.eq(bind("1")), bcstCd);
		r_bldr.addWhereWithAnd(t.bill_dpt_cd.eq(bind("1")), billDptCd);
		if (MAC_STR.isNULL_VAL(ivNo)) {
			r_bldr.addWhereWithAnd(t.iv_no.eq(bind("1")), ivNo);
		}
		else {
			MST_BILL_D_R S1TB1 = MST_BILL_D_R.create("TB1");
			r_bldr.addWhereWithAnd(exists(subQuery()
					.select(value("X"))
					.from(S1TB1)
					.where(t.bill_mng_no.eq(S1TB1.bill_mng_no)
							.and(S1TB1.iv_no.eq(bind("1"))))), ivNo);
		}
		r_bldr.addWhereWithAnd(t.trd_cur_cd.eq(bind("1")), curCd);
		r_bldr.addWhereWithAnd(bracket(t.wrk_no.eq(bind("1"))
				.or(t.wrk_no.isNull())
				.and(bind("1").isNull())),
				wrkNo);
		r_bldr.addWhereWithAnd(
				t.bill_cl_sts_typ.eq(value(MSC_BILL_CL_STS_TYP.NOT_BILL.value())));
		dbSelect("MSBGL5120_MST_BILL_S03", r, r_bldr);

		return r;
	}

	/**
	 * 未請求最新請求締年月日取得<br />
	 * 
	 * 未請求の請求で、引数の請求締年月日より前の最新の請求締年月日を取得する
	 * 
	 * @param bcstCd 請求先ＣＤ
	 * @param billDptCd 請求部門ＣＤ
	 * @param ivNo インボイスＮＯ
	 * @param curCd 通貨ＣＤ
	 * @param wrkNo 案件ＮＯ
	 * @param billYmd 請求締年月日
	 * 
	 * @return 最新の請求締年月日
	 */
	protected MCDate getLastNotBillClDt(String bcstCd, String billDptCd, String ivNo,
			String curCd, String wrkNo, MCDate billYmd) {
		MST_BILL_R r = MST_BILL_R.create();
		MST_BILL_R t = MST_BILL_R.create("T");
		MCQueryApiBuilder r_bldr = MCQueryApiBuilder.create(t);
		r_bldr.addMax(t.bill_cl_dt, "bill_cl_dt");
		r_bldr.addWhereWithAnd(t.bcst_cd.eq(bind("1")), bcstCd);
		r_bldr.addWhereWithAnd(t.bill_dpt_cd.eq(bind("1")), billDptCd);
		if (MAC_STR.isNULL_VAL(ivNo)) {
			r_bldr.addWhereWithAnd(t.iv_no.eq(bind("1")), ivNo);
		}
		else {
			MST_BILL_D_R S1TB1 = MST_BILL_D_R.create("TB1");
			r_bldr.addWhereWithAnd(exists(subQuery()
					.select(value("X"))
					.from(S1TB1)
					.where(t.bill_mng_no.eq(S1TB1.bill_mng_no)
							.and(S1TB1.iv_no.eq(bind("1"))))),
					ivNo);
		}
		r_bldr.addWhereWithAnd(t.trd_cur_cd.eq(bind("1")), curCd);
		r_bldr.addWhereWithAnd(bracket(t.wrk_no.eq(bind("1"))
				.or(t.wrk_no.isNull())
				.and(bind("1").isNull())),
				wrkNo);
		r_bldr.addWhereWithAnd(t.bill_cl_sts_typ.eq(value(MSC_BILL_CL_STS_TYP.NOT_BILL.value())));
		if (!MAC_Y4M.isNULL_VAL(billYmd)) {
			r_bldr.addWhereWithAnd(t.bill_cl_dt.lt(bind("1")), billYmd);
		}
		r_bldr.addWhereWithAnd(MAC_Y4M$IS_NULL_VAL(t.bill_cl_dt).eq(value(false)));
		dbSelect("MSBGL5120_MST_BILL_S04", r, r_bldr);
		return r.bill_cl_dt();
	}

	/**
	 * 請求予定日取得<br />
	 * 
	 * 起算日から請求予定日を算出する。
	 * 
	 * @param bcstCd 請求先ＣＤ
	 * @param billBaseDt 請求予定日算出の基準日
	 * @param billCrryovrTimes 請求サイト
	 * @param bcstR 請求先情報
	 * 
	 * @return 請求予定日
	 */
	public static MCDate getBillSchdDt(String bcstCd, MCDate billBaseDt,
			MCNumber billCrryovrTimes, MAM_BP_R bcstR) {
		return object(CLAZZ)._getBillSchdDt(bcstCd, billBaseDt, billCrryovrTimes, bcstR);
	}

	protected MCDate _getBillSchdDt(String bcstCd, MCDate billBaseDt,
			MCNumber billCrryovrTimes, MAM_BP_R bcstR) {
		// 引数チェック
		if (isNull(billBaseDt)) {
			return null;
		}

		// マニュアル選択請求の場合はnullを返す
		if (MAC_BILL_CL_TYP.isSEL(bcstR.bill_cl_typ())) {
			return null;
		}

		// 締日のリストを取得
		List<MCNumber> clDayL = getClDayL(bcstR);
		if (clDayL.isEmpty()) {
			return null;
		}

		// 締日ごとの処理
		MCDate billDt = null; // 戻り値の請求予定日
		MCDate baseDt = billBaseDt;
		final int ini =
			nvl(billCrryovrTimes, MCNumber.ZERO).add(MCNumber.ONE).intValue();
		for (int crryovrCnt = ini; crryovrCnt > 0; baseDt = toYM(baseDt).addMonth(1)) {
			for (int i = 0; i < clDayL.size() && crryovrCnt > 0; i++) {
				int clDay = clDayL.get(i).intValue();
				// 請求締日が月末の場合、無条件で月末が請求日
				if (baseDt.endOfMonth().getDay() <= clDay) {
					billDt = baseDt.endOfMonth();
					crryovrCnt--;
				}
				// 基準日が締まっていない場合、基準日の月の請求締日が請求日
				else if (baseDt.getDay() <= clDay) {
					billDt = baseDt.modDay(clDay);
					crryovrCnt--;
				}
			}
		}
		return billDt;
	}

	/**
	 * 締日リスト取得<br />
	 * 
	 * 引数の取引先（請求先）より締日を抽出して返す
	 * 
	 * @param bpR 取引先
	 * 
	 * @return 取引先の締日のリスト
	 */
	protected List<MCNumber> getClDayL(MAM_BP_R bpR) {
		List<MCNumber> l = new ArrayList<MCNumber>();

		if (!isNull(bpR.bill_cl_day1())) {
			l.add(bpR.bill_cl_day1());
		}
		if (!isNull(bpR.bill_cl_day2())) {
			l.add(bpR.bill_cl_day2());
		}
		if (!isNull(bpR.bill_cl_day3())) {
			l.add(bpR.bill_cl_day3());
		}
		if (!isNull(bpR.bill_cl_day4())) {
			l.add(bpR.bill_cl_day4());
		}
		if (!isNull(bpR.bill_cl_day5())) {
			l.add(bpR.bill_cl_day5());
		}

		Collections.sort(l);

		return l;
	}

	/**
	 * 次回請求予定日取得<br />
	 * 
	 * 次回の請求予定日を取得する。
	 * 
	 * @param bcstCd 請求先ＣＤ
	 * @param billDt 今回の請求日
	 * 
	 * @return 次回の請求予定日
	 */
	public static MCDate getNextBillDt(String bcstCd, MCDate billDt) {
		return object(CLAZZ)._getNextBillDt(bcstCd, billDt);
	}

	protected MCDate _getNextBillDt(String bcstCd, MCDate billDt) {
		List<MCNumber> clDayL = getClDayL(getBp(bcstCd));
		if (clDayL.isEmpty()) {
			return null;
		}
		MCDate baseDt = billDt;
		MCNumber billClDay = null;
		for (MCNumber clDay : clDayL) {
			// 基準日と比較して該当の締日が到来していない場合はその締日が次回の請求となる
			// 締日が月末の場合
			if (baseDt.endOfMonth().getDay() <= clDay.intValue()) {
				if (baseDt.lt(baseDt.endOfMonth())) {
					billClDay = clDay;
					break;
				}
			}
			// 締日が月末以外の場合
			else if (baseDt.getDay() < clDay.intValue()) {
				billClDay = clDay;
				break;
			}
		}
		// 締日が見つからなかった場合、基準日を翌月にし、リストの最初の締日を採用する
		// 注意：締日が1日の時もここで設定される
		if (isNull(billClDay)) {
			billClDay = clDayL.get(0);
			baseDt = baseDt.addMonth(MCNumber.ONE);
		}
		if (billClDay.intValue() >= baseDt.endOfMonth().getDay()) {
			return baseDt.endOfMonth();
		}
		else {
			return baseDt.modDay(billClDay);
		}
	}

	/**
	 * 入金予定日取得<br />
	 * 
	 * 入金予定日を取得する。
	 * 
	 * @param bcstCd 請求先ＣＤ
	 * @param billDptCd 請求部門ＣＤ
	 * @param curCd 通貨ＣＤ
	 * @param atSttlCd 債権決済方法ＣＤ
	 * @param billClDt 請求締年月日
	 * 
	 * @return 入金予定日
	 */
	public static MCDate getRcvSchdDt(String bcstCd, String billDptCd, String curCd, String atSttlCd, MCDate billClDt) {
		return object(CLAZZ)._getRcvSchdDt(bcstCd, billDptCd, curCd, atSttlCd, billClDt);
	}

	protected MCDate _getRcvSchdDt(String bcstCd, String billDptCd, String curCd, String atSttlCd, MCDate billClDt) {

		// 請求締年月日がnullの場合は入金予定日をnullとする
		if (isNull(billClDt)) {
			return null;
		}

		// 入金予定制御マスタ情報取得
		MAM_RCV_SCHD_CTL_R rcvSchdCtlR = getRcvSchdCtl(bcstCd, billDptCd, curCd, atSttlCd, null, billClDt).get(0);

		// 入金予定日取得
		MCDate rcvSchdDt = getRcvSchdDt(rcvSchdCtlR, bcstCd, billClDt);

		// 入金予定日調整
		rcvSchdDt = adjustSchdRcvDt(rcvSchdDt, billClDt, bcstCd, atSttlCd, billDptCd);

		return rcvSchdDt;
	}

	/**
	 * 入金予定日取得<br /> 
	 * 
	 * 基準日と入金予定制御マスタ情報から入金予定日を取得する。
	 * 
	 * @param rcvSchdCtlR 入金制御マスタ情報
	 * @param bcstCd 請求先ＣＤ
 	 * @param billClDt 請求締年月日
 	 * 
	 * @return 入金予定日
	 */
	protected MCDate getRcvSchdDt(MAM_RCV_SCHD_CTL_R rcvSchdCtlR, String bcstCd, MCDate billClDt) {	
		// 入金日、入金サイトの取得
		MCNumber[] rcvInfo = getRcvDay(rcvSchdCtlR, bcstCd, billClDt);

		// 入金予定日の算出
		MCDate schdRcvDt = getRcvSchdDt(rcvSchdCtlR, billClDt, rcvInfo[0], rcvInfo[1], rcvInfo[2]);
		return schdRcvDt;
	}

	/**
	 * 入金予定日算出<br />
	 * 
	 * 入金予定日を算出する。
	 * 
 	 * @param rcvSchdCtlR 入金制御マスタ情報
	 * @param billClDt 請求締年月日
	 * @param rcvDay 指定の日付(0:締日なし《締日算出の場合のみ》/99:末日)
	 * @param rcvCrryovrMons 入金サイト
	 * @param clDay 取引先マスタの請求締日
	 * 
	 * @return 算出した日付
	 */
	protected MCDate getRcvSchdDt(MAM_RCV_SCHD_CTL_R rcvSchdCtlR, MCDate billClDt, MCNumber rcvDay, MCNumber rcvCrryovrMons, MCNumber clDay) {

		MCDate ret = billClDt;

		// サイト区分が「月」の時
		if (MAC_CRRYOVR_MONS_TYP.isMM(rcvSchdCtlR.crryovr_mons_typ())) {

			// 入金予定日、又は入金サイトがNULLの時は NULL を返す
			if (isNull(rcvDay) || isNull(rcvCrryovrMons)) {
				return null;
			}
			// 請求締年月日に対して入金サイトを加算する
			ret = ret.addMonth(rcvCrryovrMons);
			
			// 請求締年月日 > 入金予定日の場合は、請求締年月日に対して入金サイト１を加算
			if (billClDt.getDay() > rcvDay.intValue()) {
				ret = ret.addMonth(MCNumber.ONE);
			}
			if (!isNull(clDay) && 28 <= rcvDay.intValue() && rcvDay.intValue() <= 30
					&& clDay.gt(rcvDay) && billClDt.endOfMonth().getDay() <= rcvDay.intValue()) {
				ret = ret.addMonth(MCNumber.ONE);
			}
			// 入金日の設定
			// 月の最大日が実入金予定日より大きい場合
			if (ret.endOfMonth().getDay() > rcvDay.intValue()) {
				// (例) ret = 2002/05/01 + (15 - 1) = 2002/05/15
				ret = toYM(ret).addDay(rcvDay.subtract(MCNumber.ONE));
			}
			// 月の最大日が実入金予定日以下の場合
			else {
				ret = ret.endOfMonth();
			}
		}
		// サイト区分が「日」の時
		else {
			// 入金サイトがNULLの時は　NULL を返す
			if (isNull(rcvCrryovrMons)) {
				return null;
			}
			// 請求締年月日に対して入金サイトを加算した結果を入金予定日として設定する。
			ret = ret.addDay(rcvCrryovrMons);
		}
		return ret;
	}

	/**
	 * 入金日取得<br />
	 * 
	 * 入金予定日取得で採用する入金日を返す。
	 * 
	 * @param rcvSchdCtlR 入金制御マスタ情報
	 * @param bcstCd 請求先ＣＤ
	 * @param billYmd 請求締年月日
	 * 
	 * @return MCNumber[]{入金予定日取得で採用する入金日、入金サイト、請求締日}
	 */
	protected MCNumber[] getRcvDay(MAM_RCV_SCHD_CTL_R rcvSchdCtlR, String bcstCd, MCDate billYmd) {
		// 請求先情報取得
		MAM_BP_R bpR = getBp(bcstCd);

		// 締日のリストを取得
		List<MCNumber> clDayL = getClDayL(bpR);

		// 締日の指定が無い場合は固定で入金日１を採用する
		if (clDayL.isEmpty()) {
			return new MCNumber[] {rcvSchdCtlR.rcv_day1(), rcvSchdCtlR.rcv_crryovr_mons1(), null};
		}

		// 締日の指定がある場合は、最も近い請求締日に対応した入金日を採用する
		else {
			MCNumber billClDay = null;
			for (MCNumber clDay : clDayL) {
				//  請求締日が月末の場合、無条件で月末が請求日
				if (billYmd.endOfMonth().getDay() <= clDay.intValue()) {
					billClDay = clDay;
					break;
				}
				// 基準日が締まっていない場合、基準日の月の請求締日が請求日
				else if (billYmd.getDay() <= clDay.intValue()) {
					billClDay = clDay;
					break;
				}
				billClDay = clDay;
			}

			// 対応する入金日、入金サイトを返す
			if (isSame(bpR.bill_cl_day1(), billClDay)) {
				return new MCNumber[] {rcvSchdCtlR.rcv_day1(), rcvSchdCtlR.rcv_crryovr_mons1(), billClDay};
			}
			else if (isSame(bpR.bill_cl_day2(), billClDay)) {
				if (MAC_CRRYOVR_MONS_TYP.isMM(rcvSchdCtlR.crryovr_mons_typ())) {
					if (isNull(rcvSchdCtlR.rcv_day2()) || isNull(rcvSchdCtlR.rcv_crryovr_mons2())) {
						throw new MCAppException(MSBGL0123, bcstCd, rcvSchdCtlR.wg_cd(), rcvSchdCtlR.cur_cd());
					}
				}
				else {
					if (isNull(rcvSchdCtlR.rcv_crryovr_mons2())) {
						throw new MCAppException(MSBGL0123, bcstCd, rcvSchdCtlR.wg_cd(), rcvSchdCtlR.cur_cd());
					}
				}
				return new MCNumber[] {rcvSchdCtlR.rcv_day2(), rcvSchdCtlR.rcv_crryovr_mons2(), billClDay};
			}
			else if (isSame(bpR.bill_cl_day3(), billClDay)) {
				if (MAC_CRRYOVR_MONS_TYP.isMM(rcvSchdCtlR.crryovr_mons_typ())) {
					if (isNull(rcvSchdCtlR.rcv_day3()) || isNull(rcvSchdCtlR.rcv_crryovr_mons3())) {
						throw new MCAppException(MSBGL0123, bcstCd, rcvSchdCtlR.wg_cd(), rcvSchdCtlR.cur_cd());
					}
				}
				else {
					if (isNull(rcvSchdCtlR.rcv_crryovr_mons3())) {
						throw new MCAppException(MSBGL0123, bcstCd, rcvSchdCtlR.wg_cd(), rcvSchdCtlR.cur_cd());
					}
				}
				return new MCNumber[] {rcvSchdCtlR.rcv_day3(), rcvSchdCtlR.rcv_crryovr_mons3(), billClDay};
			}
			else if (isSame(bpR.bill_cl_day4(), billClDay)) {
				if (MAC_CRRYOVR_MONS_TYP.isMM(rcvSchdCtlR.crryovr_mons_typ())) {
					if (isNull(rcvSchdCtlR.rcv_day4()) || isNull(rcvSchdCtlR.rcv_crryovr_mons4())) {
						throw new MCAppException(MSBGL0123, bcstCd, rcvSchdCtlR.wg_cd(), rcvSchdCtlR.cur_cd());
					}
				}
				else {
					if (isNull(rcvSchdCtlR.rcv_crryovr_mons4())) {
						throw new MCAppException(MSBGL0123, bcstCd, rcvSchdCtlR.wg_cd(), rcvSchdCtlR.cur_cd());
					}
				}
				return new MCNumber[] {rcvSchdCtlR.rcv_day4(), rcvSchdCtlR.rcv_crryovr_mons4(), billClDay};
			}
			else {
				if (MAC_CRRYOVR_MONS_TYP.isMM(rcvSchdCtlR.crryovr_mons_typ())) {
					if (isNull(rcvSchdCtlR.rcv_day5()) || isNull(rcvSchdCtlR.rcv_crryovr_mons5())) {
						throw new MCAppException(MSBGL0123, bcstCd, rcvSchdCtlR.wg_cd(), rcvSchdCtlR.cur_cd());
					}
				}
				else {
					if (isNull(rcvSchdCtlR.rcv_crryovr_mons5())) {
						throw new MCAppException(MSBGL0123, bcstCd, rcvSchdCtlR.wg_cd(), rcvSchdCtlR.cur_cd());
					}
				}
				return new MCNumber[] {rcvSchdCtlR.rcv_day5(), rcvSchdCtlR.rcv_crryovr_mons5(), billClDay};
			}
		}
	}

	/**
	 * 入金予定情報を取得する。
	 * 
	 * @param bcstCd 請求先ＣＤ
	 * @param billDptCd 請求部門ＣＤ
	 * @param curCd 通貨ＣＤ
	 * @param amt 金額
	 * @param billClDt 請求締年月日
	 * 
	 * @return 入金予定情報
	 */
	public static MCList<MST_RCV_SCHD_R> getRcvSchd(String bcstCd, String billDptCd, String curCd, MCNumber amt,
			MCDate billClDt) {
		return object(CLAZZ)._getRcvSchd(bcstCd, billDptCd, curCd, amt, billClDt);
	}

	protected MCList<MST_RCV_SCHD_R> _getRcvSchd(String bcstCd, String billDptCd, String curCd, MCNumber amt,
			MCDate billClDt) {

		// 請求締年月日がnullの場合は入金予定日をnullとする
		if (isNull(billClDt)) {
			return null;
		}

		// 入金予定制御マスタ情報取得
		MCList<MAM_RCV_SCHD_CTL_R> rcvSchdCtlL = getRcvSchdCtl(bcstCd, billDptCd, curCd, null, amt, billClDt);

		if (rcvSchdCtlL.isEmpty()) {
			return null;
		}

		// 案分
		rcvSchdCtlL.addNumberColumn("rcv_schd_amt");
		FXUCC_Divide.prop(rcvSchdCtlL, amt, getCur(curCd).amt_dec_place().intValue(), MAM_RCV_SCHD_CTL_R.$rate, "rcv_schd_amt");

		MCList<MST_RCV_SCHD_R> rcvSchdL = MCList.create(MST_RCV_SCHD_R.class);
		// 金種毎の処理
		for (MAM_RCV_SCHD_CTL_R rcvSchdCtlR: rcvSchdCtlL){
			MST_RCV_SCHD_R rcvSchdR = MST_RCV_SCHD_R.create();
			MCDate rcvSchdDt;
			MCNumber rcvSchdAmt;

			// 入金予定日取得
			rcvSchdDt = getRcvSchdDt(rcvSchdCtlR, bcstCd, billClDt);

			// 休日を考慮した入金予定日の取得
			rcvSchdDt = adjustSchdRcvDt(rcvSchdDt, billClDt, bcstCd, rcvSchdCtlR.sttl_cd(), billDptCd);

			// 入金予定額取得
			rcvSchdAmt = rcvSchdCtlR.getNumber("rcv_schd_amt");

			rcvSchdR.rcv_schd_dt(rcvSchdDt);
			rcvSchdR.rcv_schd_amt(rcvSchdAmt);
			rcvSchdR.rcv_mtd_cd(rcvSchdCtlR.sttl_cd());
			rcvSchdR.rcv_typ(getArSttl(rcvSchdCtlR.sttl_cd()).ar_sttl_typ());
			rcvSchdL.add(rcvSchdR);
		}
		return rcvSchdL;
	}

	/**
	 * 案分<br />
	 * 
	 * 金種毎に案分する
	 * 
	 * @param rcvSchdCtlL 入金予定制御マスタ情報
	 * @param curCd 通貨ＣＤ
	 * @param amt 金額
	 * 
	 * @return 案分結果の配列
	 */
	protected MCNumber[] amtProp(MCList<MAM_RCV_SCHD_CTL_R> rcvSchdCtlL, String curCd, MCNumber amt) {
		MCNumber[] ratioL = new MCNumber[4]; 

		// 金種別比率設定
		for (MAM_RCV_SCHD_CTL_R rcvSchdCtlR: rcvSchdCtlL){
			String arSttlTyp = getArSttl(rcvSchdCtlR.sttl_cd()).ar_sttl_typ();		 
			// 現金
			if (MAC_AR_STTL_TYP.isCASH(arSttlTyp)) {
				ratioL[0] = rcvSchdCtlR.rate();
			}
			// 振込
			else if (MAC_AR_STTL_TYP.isBANK(arSttlTyp)) {
				ratioL[1] = rcvSchdCtlR.rate();
			}
			// 手形
			else if (MAC_AR_STTL_TYP.isNOTE(arSttlTyp)) {
				ratioL[2] = rcvSchdCtlR.rate();
			}
			// 相殺
			else {
				ratioL[3] = rcvSchdCtlR.rate();
			}
		}
		// 案分
		MAM_CUR_R curR = getCur(curCd);
		MCNumber[] amts = FXUCC_Divide.prop(amt, curR.amt_dec_place().intValue(),
				ratioL[0], ratioL[1], ratioL[2], ratioL[3]).allocArray();		
		
		return amts;
	}

	/**
	 * 入金額取得<br />
	 * 
	 * 金種毎の入金額を取得する。
	 * 
	 * @param rcvSchdCtlR 入金予定制御マスタ情報
	 * @param amts 入金額
	 * 
	 * @return 入金額
	 */
	protected MCNumber getRcvSchdAmt(MAM_RCV_SCHD_CTL_R rcvSchdCtlR, MCNumber[] amts) {
		String arSttlTyp = getArSttl(rcvSchdCtlR.sttl_cd()).ar_sttl_typ();	
		// 現金
		if (MAC_AR_STTL_TYP.isCASH(arSttlTyp)) {
			return amts[0];
		}
		// 振込
		else if (MAC_AR_STTL_TYP.isBANK(arSttlTyp)) {
			return amts[1];
		}
		// 手形
		else if (MAC_AR_STTL_TYP.isNOTE(arSttlTyp)) {
			return amts[2];
		}
		// 相殺
		else {
			return amts[3];
		}
	}

	/**
	 * 入金予定制御マスタ取得<br />
	 * 
	 * 入金予定制御マスタを取得する。
	 * 
	 * @param bcstCd 請求先ＣＤ
	 * @param billDptCd 請求部門ＣＤ
	 * @param curCd 通貨ＣＤ
	 * @param arSttlCd 債権決済方法ＣＤ
	 * @param amt 金額
	 * @param billClDt 請求締年月日
	 * 
	 * @return 入金制御マスタ情報
	 */
	public static MCList<MAM_RCV_SCHD_CTL_R> getRcvSchdCtl(
			String bcstCd, String billDptCd ,String curCd, String arSttlCd, MCNumber amt, MCDate billClDt) {
		return object(CLAZZ)._getRcvSchdCtl(bcstCd, billDptCd , curCd, arSttlCd, amt, billClDt);
	}

	protected MCList<MAM_RCV_SCHD_CTL_R> _getRcvSchdCtl(
			String bcstCd, String billDptCd ,String curCd, String arSttlCd, MCNumber amt, MCDate billClDt) {

		// 請求部門に対応するＷＧＣＤを取得
		String wgCd = getDpt(billDptCd, billClDt).wg_cd();
		if (isNull(wgCd)) {
			MCRow bindR = MCRow.create();
			bindR.setStringNE(MAM_DPT_R.$dpt_cd, billDptCd);
			setLastDpt(bindR, MAM_DPT_R.$dpt_cd, null);
			wgCd = bindR.getStringNE(MAM_WG_R.$wg_cd);
		}

		// 入金予定制御マスタを取得
		MCList<MAM_RCV_SCHD_CTL_R> l = srchRcvSchdCtl(bcstCd, wgCd, curCd, arSttlCd, amt);

		if (l.isEmpty()) {
			l = srchRcvSchdCtl(MAC_STR.NULL_VAL.value(), wgCd, curCd, arSttlCd, amt);
		}

		if (l.isEmpty()) {
			throw new MCAppException(MSBGL0019, bcstCd, wgCd, curCd);
		}

		return l;
	}

	protected FXUCL_Cache<MCList<MAM_RCV_SCHD_CTL_R>> _rcvSchdCtl;

	protected MCList<MAM_RCV_SCHD_CTL_R> srchRcvSchdCtl(
			String bcstCd, String wgCd, String curCd, String arSttlCd, MCNumber amt) {

		MAM_RCV_SCHD_CTL_R S1T2 = MAM_RCV_SCHD_CTL_R.create("T2");
		if (_rcvSchdCtl == null) {
			_rcvSchdCtl = new FXUCL_Cache<MCList<MAM_RCV_SCHD_CTL_R>>();
			_rcvSchdCtl.setFixMaxCacheSize(-1);
		}

		if (isNull(_rcvSchdCtl.getCache(bcstCd, wgCd, curCd, arSttlCd, amt))) {
			MCList<MAM_RCV_SCHD_CTL_R> dbcL = MCList.create(MAM_RCV_SCHD_CTL_R.class);
			MAM_RCV_SCHD_CTL_R t = MAM_RCV_SCHD_CTL_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.addWhereWithAnd(t.bcst_cd.eq(bind("1")), bcstCd);
			dbcL_bldr.addWhereWithAnd(t.cur_cd.eq(bind("1")), curCd);
			dbcL_bldr.addWhereWithCutOffAnd(t.sttl_cd.eq(bind("1")), arSttlCd);
			dbcL_bldr.addWhereWithAnd(t.wg_cd.eq(bind("1")), wgCd);
			// 金額がnull、またはマイナスの時は下限金額が一番小さいレコードを取得する。
			if (isNull(amt) || amt.lt(MCNumber.ZERO)) {
				dbcL_bldr.addWhereWithAnd(t.min_amt.eq(subQuery()
						.select(min(S1T2.min_amt))
						.from(S1T2)
						.where(S1T2.bcst_cd.eq(bind("1"))
								.and(S1T2.cur_cd.eq(bind("2")))
								.cutoff$and(S1T2.sttl_cd.eq(bind("3")))
								.and(S1T2.wg_cd.eq(bind("4"))))),
						bcstCd, curCd, arSttlCd, wgCd);
			}
			else {
				dbcL_bldr.addWhereWithAnd(t.min_amt.eq(subQuery()
						.select(max(S1T2.min_amt))
						.from(S1T2)
						.where(S1T2.bcst_cd.eq(bind("1"))
								.and(S1T2.cur_cd.eq(bind("2")))
								.cutoff$and(S1T2.sttl_cd.eq(bind("3")))
								.and(S1T2.wg_cd.eq(bind("4")))
								.and(S1T2.min_amt.lte(bind("5"))))),
						bcstCd, curCd, arSttlCd, wgCd, amt);
			}
			dbSelect("MSBGL5120_MAM_RCV_SCHD_CTL_S01", dbcL, dbcL_bldr);
			_setRcvSchdCtl(dbcL, bcstCd, wgCd, curCd, arSttlCd, amt);
		}
		return _rcvSchdCtl.getCache(bcstCd, wgCd, curCd, arSttlCd, amt);
	}

	protected void _setRcvSchdCtl(MCList<MAM_RCV_SCHD_CTL_R> dbcL,
			String bcstCd, String wgCd, String curCd, String arSttlCd, MCNumber amt) {
		Comparable<?>[] keys = new Comparable<?>[] {
			bcstCd, wgCd, curCd, arSttlCd, amt
		};
		_rcvSchdCtl.putCache(keys, dbcL);
	}

	/**
	 * 日付算出<br />
	 * 
	 * 基準となる日付に対して入金サイトの加算や日にち指定を行い、入金予定日や締日を算出する。
	 * 
	 * @param basedate 基準日付
	 * @param day 指定の日付(0:締日なし《締日算出の場合のみ》/99:末日)
	 * 
	 * @return 算出した日付
	 */
	public static MCDate combineDt(MCDate basedate, MCNumber day) {
		return object(CLAZZ)._combineDt(basedate, day);
	}

	protected MCDate _combineDt(MCDate basedate, MCNumber day) {
		//  指定の日にち = 0 の場合、nullを返す
		if (isNull(basedate) || isNull(day) || day.isZero()) {
			return null;
		}

		MCDate ret = basedate;
		// 月の最大日指定の場合
		if (day.eq(99)) {
			ret = ret.endOfMonth();
		}
		// 月の最大日指定ではない場合
		else {
			// 月の最大日が基準日付より大きい場合
			if (ret.endOfMonth().getDay() > day.intValue()) {
				// (例) ret = 2002/05/01 + (15 - 1) = 2002/05/15
				ret = toYM(ret).addDay(day.subtract(MCNumber.ONE));
			}
			// 月の最大日が基準日付以下の場合
			else {
				ret = ret.endOfMonth();
			}
		}
		return ret;
	}

	/**
	 * 売上金額取得<br />
	 * 
	 * 売上金額を取得する。債権取引グループ区分が売上でない場合はゼロを返す。
	 * 売上の場合は取引パタン区分の AR_AMT_PM によって符号を掛けた金額を返す。
	 * 
	 * @param trdPtnTyp 取引パタン区分
	 * @param arTrdGrpTyp 債権取引グループ区分
	 * @param amt 金額
	 * 
	 * @return 売上金額（売上の場合のみ）
	 */
	public static MCNumber getSlsAmt(String trdPtnTyp, String arTrdGrpTyp, MCNumber amt) {
		return object(CLAZZ)._getSlsAmt(trdPtnTyp, arTrdGrpTyp, amt);
	}

	protected MCNumber _getSlsAmt(String trdPtnTyp, String arTrdGrpTyp, MCNumber amt) {
		// 債権取引グループ区分が売上の場合は金額の符号を掛けた金額
		if (MAC_AR_TRD_GRP_TYP.isSLS(arTrdGrpTyp)) {
			return MAC_TRD_PTN_TYP.ar_amt_pm(trdPtnTyp).multiply(amt);
		}
		// 売上でない場合はゼロ
		else {
			return MCNumber.ZERO;
		}
	}

	/**
	 * 返品金額取得<br />
	 * 
	 * 返品金額を取得する。債権取引グループ区分が返品でない場合はゼロを返す。
	 * 返品の場合は取引パタン区分の AR_AMT_PM によって符号を掛けた金額を返す。
	 * 
	 * @param trdPtnTyp 取引パタン区分
	 * @param arTrdGrpTyp 債権取引グループ区分
	 * @param amt 金額
	 * 
	 * @return 返品金額（返品の場合のみ）
	 */
	public static MCNumber getRetAmt(String trdPtnTyp, String arTrdGrpTyp, MCNumber amt) {
		return object(CLAZZ)._getSretAmt(trdPtnTyp, arTrdGrpTyp, amt);
	}

	protected MCNumber _getSretAmt(String trdPtnTyp, String arTrdGrpTyp, MCNumber amt) {
		// 債権取引グループ区分が返品の場合は金額の符号を掛けた金額
		if (MAC_AR_TRD_GRP_TYP.isSLS_RTN(arTrdGrpTyp)) {
			return MAC_TRD_PTN_TYP.ar_amt_pm(trdPtnTyp).multiply(amt);
		}
		// 返品でない場合はゼロ
		else {
			return MCNumber.ZERO;
		}
	}

	/**
	 * 値引金額取得<br />
	 * 
	 * 値引金額を取得する。債権取引グループ区分が値引でない場合はゼロを返す。
	 * 値引の場合は取引パタン区分の AR_AMT_PM によって符号を掛けた金額を返す。
	 * 
	 * @param trdPtnTyp 取引パタン区分
	 * @param arTrdGrpTyp 債権取引グループ区分
	 * @param amt 金額
	 * 
	 * @return 値引金額（値引の場合のみ）
	 */
	public static MCNumber getDscntAmt(String trdPtnTyp, String arTrdGrpTyp, MCNumber amt) {
		return object(CLAZZ)._getDscntAmt(trdPtnTyp, arTrdGrpTyp, amt);
	}

	protected MCNumber _getDscntAmt(String trdPtnTyp, String arTrdGrpTyp, MCNumber amt) {
		// 債権取引グループ区分が値引の場合は金額の符号を掛けた金額
		if (MAC_AR_TRD_GRP_TYP.isSLS_DSCNT(arTrdGrpTyp)) {
			return MAC_TRD_PTN_TYP.ar_amt_pm(trdPtnTyp).multiply(amt);
		}
		// 値引でない場合はゼロ
		else {
			return MCNumber.ZERO;
		}
	}

	/**
	 * 税金額取得<br />
	 * 
	 * 税金額を取得する。引数の消費税額に取引パタン区分の AR_AMT_PM の符号を掛けた金額を返す。
	 * 取引パタン区分が請求時税差額の場合のみ引数は金額を採用する。
	 * 
	 * @param trdPtnTyp 取引パタン区分
	 * @param taxAmt 消費税額
	 * 
	 * @return 税金額（税の場合のみ）
	 */
	public static MCNumber getTaxAmt(String trdPtnTyp, MCNumber taxAmt) {
		return object(CLAZZ)._getTaxAmt(trdPtnTyp, taxAmt);
	}

	protected MCNumber _getTaxAmt(String trdPtnTyp, MCNumber taxAmt) {
		return MAC_TRD_PTN_TYP.ar_amt_pm(trdPtnTyp).multiply(taxAmt);
	}

	/**
	 * 源泉税額取得<br />
	 * 
	 * 源泉税額を取得する。引数の源泉税額に取引パタン区分の AR_AMT_PM の符号を掛けた金額を返す。
	 * 
	 * @param trdPtnTyp 取引パタン区分
	 * @param wtaxAmt 消費税額
	 * 
	 * @return 消費税金額（消費税の場合のみ）
	 */
	public static MCNumber getWtaxAmt(String trdPtnTyp, MCNumber wtaxAmt) {
		return object(CLAZZ)._getWtaxAmt(trdPtnTyp, wtaxAmt);
	}

	protected MCNumber _getWtaxAmt(String trdPtnTyp, MCNumber wtaxAmt) {
		return MAC_TRD_PTN_TYP.ar_amt_pm(trdPtnTyp).multiply(wtaxAmt);
	}

	/**
	 * 現金金額取得<br />
	 * 
	 * 現金金額を取得する。債権取引グループ区分が入金でない場合はゼロを返す。
	 * 債権決済区分が現金でない場合はゼロを返す。現金の場合は取引パタン区分の AR_AMT_PM によって符号を掛けた金額を返す。
	 * 
	 * @param trdPtnTyp 取引パタン区分
	 * @param arTrdGrpTyp 債権取引グループ区分
	 * @param arSttlTyp 債権決済区分
	 * @param amt1 金額１
	 * @param amt2 金額２
	 * @param amt3 金額３
	 * 
	 * @return 現金金額（現金の場合のみ）
	 */
	public static MCNumber getCashAmt(String trdPtnTyp, String arTrdGrpTyp, String arSttlTyp,
			MCNumber amt1, MCNumber amt2, MCNumber amt3) {
		return object(CLAZZ)._getCashAmt(trdPtnTyp, arTrdGrpTyp, arSttlTyp, amt1, amt2, amt3);
	}

	protected MCNumber _getCashAmt(String trdPtnTyp, String arTrdGrpTyp, String arSttlTyp,
			MCNumber amt1, MCNumber amt2, MCNumber amt3) {
		// 債権取引グループ区分が入金、かつ、債権決済方法が現金の場合、金額の符号を掛けた金額
		if (MAC_AR_TRD_GRP_TYP.isRCV(arTrdGrpTyp)
				&& MAC_AR_STTL_TYP.isCASH(arSttlTyp)) {
			return MAC_TRD_PTN_TYP.ar_amt_pm(trdPtnTyp).multiply(amt1);
		}
		// それ以外はゼロ
		else {
			return MCNumber.ZERO;
		}
	}

	/**
	 * 手形金額取得<br />
	 * 
	 * 手形金額を取得する。債権取引グループ区分が入金でない場合はゼロを返す。
	 * 債権決済区分が手形でない場合はゼロを返す。手形の場合は取引パタン区分の AR_AMT_PM によって符号を掛けた金額を返す。
	 * 
	 * @param trdPtnTyp 取引パタン区分
	 * @param arTrdGrpTyp 債権取引グループ区分
	 * @param arSttlTyp 債権決済区分
	 * @param amt1 金額１
	 * @param amt2 金額２
	 * @param amt3 金額３
	 * 
	 * @return 手形金額（手形の場合のみ）
	 */
	public static MCNumber getNoteAmt(String trdPtnTyp, String arTrdGrpTyp, String arSttlTyp,
			MCNumber amt1, MCNumber amt2, MCNumber amt3) {
		return object(CLAZZ)._getNoteAmt(trdPtnTyp, arTrdGrpTyp, arSttlTyp, amt1, amt2, amt3);
	}

	protected MCNumber _getNoteAmt(String trdPtnTyp, String arTrdGrpTyp, String arSttlTyp,
			MCNumber amt1, MCNumber amt2, MCNumber amt3) {
		// 債権取引グループ区分が入金、かつ、債権決済方法が手形の場合、金額の符号を掛けた金額
		if (MAC_AR_TRD_GRP_TYP.isRCV(arTrdGrpTyp)
				&& MAC_AR_STTL_TYP.isNOTE(arSttlTyp)) {
			return MAC_TRD_PTN_TYP.ar_amt_pm(trdPtnTyp).multiply(amt1);
		}
		// それ以外はゼロ
		else {
			return MCNumber.ZERO;
		}
	}

	/**
	 * 振込金額取得<br />
	 * 
	 * 振込金額を取得する。債権取引グループ区分が入金でない場合はゼロを返す。
	 * 債権決済区分が振込でない場合はゼロを返す。振込の場合は取引パタン区分の AR_AMT_PM によって符号を掛けた金額を返す。
	 * 
	 * @param trdPtnTyp 取引パタン区分
	 * @param arTrdGrpTyp 債権取引グループ区分
	 * @param arSttlTyp 債権決済区分
	 * @param amt1 金額１
	 * @param amt2 金額２
	 * @param amt3 金額３
	 * 
	 * @return 振込金額（振込の場合のみ）
	 */
	public static MCNumber getXfrAmt(String trdPtnTyp, String arTrdGrpTyp, String arSttlTyp,
			MCNumber amt1, MCNumber amt2, MCNumber amt3) {
		return object(CLAZZ)._getXfrAmt(trdPtnTyp, arTrdGrpTyp, arSttlTyp, amt1, amt2, amt3);
	}

	protected MCNumber _getXfrAmt(String trdPtnTyp, String arTrdGrpTyp, String arSttlTyp,
			MCNumber amt1, MCNumber amt2, MCNumber amt3) {
		// 債権取引グループ区分が入金、かつ、債権決済方法が振込の場合、金額の符号を掛けた金額
		if (MAC_AR_TRD_GRP_TYP.isRCV(arTrdGrpTyp)
				&& MAC_AR_STTL_TYP.isBANK(arSttlTyp)) {
			return MAC_TRD_PTN_TYP.ar_amt_pm(trdPtnTyp).multiply(amt1);
		}
		// それ以外はゼロ
		else {
			return MCNumber.ZERO;
		}
	}

	/**
	 * 相殺金額取得<br />
	 * 
	 * 相殺金額を取得する。債権取引グループ区分が相殺でない場合はゼロを返す。
	 * 相殺の場合は取引パタン区分の AR_AMT_PM によって符号を掛けた金額を返す。
	 * 
	 * @param trdPtnTyp 取引パタン区分
	 * @param arTrdGrpTyp 債権取引グループ区分
	 * @param amt1 金額１
	 * @param amt2 金額２
	 * @param amt3 金額３
	 * 
	 * @return 相殺金額（相殺の場合のみ）
	 */
	public static MCNumber getSetoffAmt(String trdPtnTyp, String arTrdGrpTyp,
			MCNumber amt1, MCNumber amt2, MCNumber amt3) {
		return object(CLAZZ)._getSetoffAmt(trdPtnTyp, arTrdGrpTyp, amt1, amt2, amt3);
	}

	protected MCNumber _getSetoffAmt(String trdPtnTyp, String arTrdGrpTyp,
			MCNumber amt1, MCNumber amt2, MCNumber amt3) {
		// 債権取引グループ区分が相殺の場合は金額の符号を掛けた金額
		if (MAC_AR_TRD_GRP_TYP.isSETOFF(arTrdGrpTyp)) {
			return MAC_TRD_PTN_TYP.ar_amt_pm(trdPtnTyp).multiply(sum(amt1, amt2, amt3));
		}
		// 相殺でない場合は金額２と金額３の合計
		else {
			return MAC_TRD_PTN_TYP.ar_amt_pm(trdPtnTyp).multiply(sum(amt2, amt3));
		}
	}
	public static MCNumber getSetoffTaxAmt(String trdPtnTyp, String arTrdGrpTyp,
			MCNumber amt1, MCNumber amt2, MCNumber amt3, boolean billDispFlg) {
		return object(CLAZZ)._getSetoffTaxAmt(trdPtnTyp, arTrdGrpTyp, amt1, amt2, amt3, billDispFlg);
	}

	protected MCNumber _getSetoffTaxAmt(String trdPtnTyp, String arTrdGrpTyp,
			MCNumber amt1, MCNumber amt2, MCNumber amt3, boolean billDispFlg) {
		if (!billDispFlg) {
			return MCNumber.ZERO;
		}
		if (MAC_AR_TRD_GRP_TYP.isSETOFF(arTrdGrpTyp)) {
			return MAC_TRD_PTN_TYP.ar_amt_pm(trdPtnTyp).multiply(sum(amt1, amt2, amt3));
		}
		else {
			return MAC_TRD_PTN_TYP.ar_amt_pm(trdPtnTyp).multiply(sum(amt2, amt3));
		}
	}

	/**
	 * 振替金額取得<br />
	 * 
	 * 振替金額を取得する。債権取引グループ区分が振替でない場合はゼロを返す。
	 * 振替の場合は取引パタン区分の AR_AMT_PM によって符号を掛けた金額を返す。
	 * 
	 * @param trdPtnTyp 取引パタン区分
	 * @param arTrdGrpTyp 債権取引グループ区分
	 * @param amt1 金額１
	 * @param amt2 金額２
	 * @param amt3 金額３
	 * 
	 * @return 振替金額（振替の場合のみ）
	 */
	public static MCNumber getArSwAmt(String trdPtnTyp, String arTrdGrpTyp,
			MCNumber amt1, MCNumber amt2, MCNumber amt3) {
		return object(CLAZZ)._getArSwAmt(trdPtnTyp, arTrdGrpTyp, amt1, amt2, amt3);
	}

	protected MCNumber _getArSwAmt(String trdPtnTyp, String arTrdGrpTyp,
			MCNumber amt1, MCNumber amt2, MCNumber amt3) {
		// 債権取引グループ区分が振替の場合は金額の符号を掛けた金額
		if (MAC_AR_TRD_GRP_TYP.isARSW(arTrdGrpTyp)  && !MAC_TRD_PTN_TYP.isARSW_IN_BILL_BAL(trdPtnTyp)) {
			return MAC_TRD_PTN_TYP.ar_amt_pm(trdPtnTyp).multiply(amt1);
		}
		// 振替でない場合はゼロ
		else {
			return MCNumber.ZERO;
		}
	}

	/**
	 * 振替金額(振替先)取得<br />
	 * 
	 * 振替金額を取得する。債権取引グループ区分が振替でない場合はゼロを返す。
	 * 振替の場合は取引パタン区分の AR_AMT_PM によって符号を掛けた金額を返す。
	 * 
	 * @param trdPtnTyp 取引パタン区分
	 * @param arTrdGrpTyp 債権取引グループ区分
	 * @param amt1 金額１
	 * @param amt2 金額２
	 * @param amt3 金額３
	 * 
	 * @return 振替金額（振替の場合のみ）
	 */
	public static MCNumber getArSwToAmt(String trdPtnTyp, String arTrdGrpTyp,
			MCNumber amt1, MCNumber amt2, MCNumber amt3) {
		return object(CLAZZ)._getArSwToAmt(trdPtnTyp, arTrdGrpTyp, amt1, amt2, amt3);
	}

	protected MCNumber _getArSwToAmt(String trdPtnTyp, String arTrdGrpTyp,
			MCNumber amt1, MCNumber amt2, MCNumber amt3) {
		// 債権取引グループ区分が振替の場合は金額の符号を掛けた金額
		if (MAC_AR_TRD_GRP_TYP.isARSW(arTrdGrpTyp) && MAC_TRD_PTN_TYP.isARSW_IN_BILL_BAL(trdPtnTyp)) {
			return MAC_TRD_PTN_TYP.ar_amt_pm(trdPtnTyp).multiply(amt1);
		}
		// 振替でない場合はゼロ
		else {
			return MCNumber.ZERO;
		}
	}

	/** 取引先マスタ取得 */
	protected FXUCL_Cache<MAM_BP_R> _bp;
	/**
	 * 取引先ＣＤから取引先マスタ情報を取得する。
	 * 
	 * @param bpCd
	 */
	public static MAM_BP_R getBp(String bpCd) {
		return object(CLAZZ)._getBp(bpCd);
	}

	protected MAM_BP_R _getBp(String bpCd) {
		if (_bp == null) {
			_bp = new FXUCL_Cache<MAM_BP_R>();
			_bp.setFixMaxCacheSize(-1);
		}
		if (isNull(_bp.getCache(bpCd))) {
			MAM_BP_R dbc = MAM_BP_R.create();
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MAM_BP_R.create("T"));
			dbSelectKey("MSBGL5120_MAM_BP_S01", dbc, dbc_bldr, bpCd);
			_setBp(dbc);
		}
		return _bp.getCache(bpCd);
	}

	/**
	 * 取引先マスタのＤＢコンテナをキャッシュに設定する
	 * 
	 * @param dbcL DBコンテナ
	 */
	public static void setBp(MCList<MAM_BP_R> dbcL) {
		for (MAM_BP_R dbc : dbcL) {
			object(CLAZZ)._setBp(dbc);
		}
	}

	/**
	 * 取引先マスタのＤＢコンテナをキャッシュに設定する
	 * 
	 * @param dbc DBコンテナ
	 */
	public static void setBp(MAM_BP_R dbc) {
		object(CLAZZ)._setBp(dbc);
	}

	protected void _setBp(MAM_BP_R dbc) {
		_bp.putCache(new String [] {dbc.bp_cd()}, dbc);
	}

	/**
	 * 取引先マスタのキャッシュを初期化する
	 */
	public static void initBp() {
		object(CLAZZ)._initBp();
	}

	protected void _initBp() {
		_bp = new FXUCL_Cache<MAM_BP_R>();
		_bp.setFixMaxCacheSize(-1);
	}

	/** 通貨マスタ取得 */
	protected FXUCL_MCDbcCache<MAM_CUR_R> _cur;
	/**
	 * 通貨ＣＤから通貨マスタ情報を取得する。
	 * 
	 * @param curCd
	 */
	public static MAM_CUR_R getCur(String curCd) {
		return object(CLAZZ)._getCur(curCd);
	}
	protected MAM_CUR_R _getCur(String curCd) {
		if (_cur == null) {
			_cur = new FXUCL_MCDbcCache<MAM_CUR_R>(MCQueryApiBuilder.create(MAM_CUR_R.create("T")));
		}
		return _cur.get(curCd);
	}

	/** 為替レート取得キャッシュ */
	protected FXUCL_MCFuncCache<MCNumber> _xrateCache;

	/**
	 * 為替レート取得<br />
	 * 為替レートを取得する。
	 * 
	 * @param curCd 通貨ＣＤ
	 * @return 為替レート
	 */
	public static MCNumber getSlsXrate(String trdCurCd, MCDate stDt) {
		return object(CLAZZ)._getSlsXrate(trdCurCd, stDt);
	}
	protected MCNumber _getSlsXrate(String trdCurCd, MCDate stDt) {
		if (_xrateCache == null) {
			_xrateCache = new FXUCL_MCFuncCache<>(in -> {
				return MAPA_XCHNG$F_GET_SLS_XRATE(value((String) in[0]), value((MCDate) in[1]));
			});
		}
		return _xrateCache.get(trdCurCd, stDt);
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
		if (_dpt == null) {
			_dpt = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(MCQueryApiBuilder.create(MAM_DPT_R.create("T")), bindL, MAM_DPT_R.$dpt_cd);
		}
		return _dpt;
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

	/** 決済方法マスタのキャッシュ */
	protected FXUCL_MCDbcCache<MAM_STTL_R> _sttlTyp;
	
	/**
	 * 債権決済方法に対応した債権決済区分を取得する。<BR>
	 * 引数の債権決済方法がNULL以外で債権決済方法マスタが取得できない場合はエラー。
	 * 
	 * @param arSttlCd 決済方法ＣＤ
	 * @return 債権決済区分
	 */
	public static MAM_STTL_R getArSttl(String arSttlCd) {
		return object(CLAZZ)._getArSttl(arSttlCd);
	}

	protected MAM_STTL_R _getArSttl(String sttlCd) {
		if (_sttlTyp == null) {
			_sttlTyp = new FXUCL_MCDbcCache<MAM_STTL_R>(MCQueryApiBuilder.create(MAM_STTL_R.create("T")));
		}
		return _sttlTyp.get(sttlCd);
	}

	/** 決済方法マスタのキャッシュ */
	protected FXUCL_MCDbcCacheCW<MAM_STTL_R> _sttlCd;
	
	/**
	 * 債権決済方法取得<br />
	 * 
	 * 引数の債権決済区分より決済方法マスタのレコードを取得する
	 * 
	 * @param arSttlTyp 債権決済区分
	 * @return 決済方法ＣＤ
	 */
	public static MAM_STTL_R getArSttlCd(String arSttlTyp) {
		return object(CLAZZ)._getArSttlCd(arSttlTyp);
	}

	protected MAM_STTL_R _getArSttlCd(String arSttlTyp) {
		if (_sttlCd == null) {
			MAM_STTL_R t = MAM_STTL_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.addWhereWithAnd(t.ar_sttl_typ.eq(bind("b1")));
			_sttlCd = new FXUCL_MCDbcCacheCW<MAM_STTL_R>(dbc_bldr);
		}
		return _sttlCd.get(arSttlTyp);
	}

	/**
	 * 請求先担当部門取得<br />
	 * 請求先の請求部門区分により以下の通り部門ＣＤを取得する。<br>
	 * 
	 * <li>請求部門区分が「1：売上部門」の場合、引数の売上部門ＣＤを返却する</li>
	 * <li>請求部門区分が「2：債権部門」の場合、引数の債権部門ＣＤを返却する</li>
	 * <li>請求部門区分が「3：請求部門」の場合、取引先（補助）マスタから請求先担当部門を取得して返却する。部門が取得できない場合はエラーとする</li>
	 * 
	 * @param bcstCd 請求先ＣＤ
	 * @param dt 基準日付
	 * @param slsDptCd 売上部門ＣＤ
	 * @param arDptCd 債権部門ＣＤ
	 * 
	 * @return 請求先担当部門
	 */
	public static String getBcstDpt(String bcstCd, MCDate dt, String slsDptCd, String arDptCd) {
		return object(CLAZZ)._getBcstDpt(bcstCd, dt, slsDptCd, arDptCd);
	}

	protected String _getBcstDpt(String bcstCd, MCDate dt, String slsDptCd, String arDptCd) {
		MAM_BP_R bpR = getBp(bcstCd);

		// 売上部門ＣＤを返却
		if (MAC_BILL_DPT_TYP.isSLS(bpR.bill_dpt_typ())) {
			return slsDptCd;
		}
		// 債権部門ＣＤを返却
		else if (MAC_BILL_DPT_TYP.isAR(bpR.bill_dpt_typ())) {
			return arDptCd;
		}
		// 請求先担当部門ＣＤを検索して返却
		return getBcstDptSub(bcstCd, dt);
	}

	protected FXUCL_Cache<String> _bcstDpt;

	protected String getBcstDptSub(String bcstCd, MCDate baseDt) {
		if (_bcstDpt == null) {
			_bcstDpt = new FXUCL_Cache<String>();
			_bcstDpt.setFixMaxCacheSize(-1);
		}
		if (isNull(_bcstDpt.getCache(bcstCd, baseDt))) {
			MCRow bindR = MCRow.create();
			bindR.setStringNE("I_BCST_CD", bcstCd);
			bindR.setDateNE("I_BASE_DT", baseDt);
			String billDptCd = execFuncString(createSqlId(LOGIC_ID, "MAPA_BP$F_GET_BCST_DPT_CD", "01"),
					MAPA_BP$F_GET_BCST_DPT_CD(bind("i_bcst_cd"), bind("i_base_dt")), bindR);
			_setBillDptCd(billDptCd, bcstCd, baseDt);
		}
		return _bcstDpt.getCache(bcstCd, baseDt);
	}

	/**
	 * 請求先ＣＤ、基準日をキーに請求部門ＣＤをキャッシュに設定する
	 * 
	 * @param billDptCd 請求部門ＣＤ
	 * @param bcstCd 請求先ＣＤ
	 * @param baseDt 基準日
	 */
	public static void setBillDptCd(String billDptCd, String bcstCd, MCDate baseDt) {
		object(CLAZZ)._setBillDptCd(billDptCd, bcstCd, baseDt);
	}
	protected void _setBillDptCd(String billDptCd, String bcstCd, MCDate baseDt) {
		_bcstDpt.putCache(new Comparable[] {bcstCd, baseDt},  billDptCd);
	}

	/**
	 * 請求部門ＣＤのキャッシュを初期化する
	 */
	public static void initBcstDpt() {
		object(CLAZZ)._initBcstDpt();
	}
	protected void _initBcstDpt() {
		_bcstDpt = new FXUCL_Cache<String>();
		_bcstDpt.setFixMaxCacheSize(-1);
	}

	protected FXUCL_MCFuncCache<String> _newDpt;

	/**
	 * 部門ＣＤ取得<br />
	 * 部門ＣＤと基準日から組織変更を考慮した部門ＣＤを取得する
	 * 
	 * @param dptCd 部門ＣＤ
	 * @param dt 基準日
	 * @return 部門ＣＤ
	 */
	public static String getNewDptCd(String dptCd, MCDate dt) {
		return object(CLAZZ)._getNewDptCd(dptCd, dt);
	}

	protected String _getNewDptCd(String dptCd, MCDate dt) {
		if (_newDpt == null) {
			_newDpt = new FXUCL_MCFuncCache<>(in -> {
				return MAPA_DPT$F_GET_DPT_CD_NE(value((String) in[0]), value((MCDate) in[1]));
			});
		}
		return nvl(_newDpt.get(dptCd, dt), dptCd);
	}

	protected FXUCL_MCDbcCacheCW<MAM_DPT_R> _latestDpt;
	protected FXUCL_MCDbcCacheCW<MAM_DPT_R> _maxEndDt;

	/**
	 * 引数のMCRowに設定されている部門ＣＤをもとに適用終了日が最大の部門マスタから、
	 * 部門名、ＷＧ、ＷＧ名取得し、引数のMCRowに設定する
	 * 
	 * @param r 処理対象MCRow
	 * @param dptCdCol 部門ＣＤカラム名
	 * @param dptNmCol 部門名カラム名
	 */
	public static <R extends MCRow> R setLastDpt(R r, String dptCdCol, String dptNmCol) {
		return object(CLAZZ)._setLastDpt(r, dptCdCol, dptNmCol);
	}

	protected <R extends MCRow> R _setLastDpt(R r, String dptCdCol, String dptNmCol) {
		if (_latestDpt == null) {
			MAM_DPT_R t = MAM_DPT_R.create("T");
			MCQueryApiBuilder dptR_bldr = MCQueryApiBuilder.create(t);
			MAM_WG_R wg = MAM_WG_R.create("WG");
			dptR_bldr.addSelect(wg.wg_nm);
			dptR_bldr.setWhere(t.dpt_cd.eq(bind("b1")));
			dptR_bldr.addWhereWithAnd(t.end_dt.eq(bind("b2")));
			dptR_bldr.addLeftOuterJoin(wg, bracket(t.wg_cd.eq(wg.wg_cd)));
			_latestDpt = new FXUCL_MCDbcCacheCW<MAM_DPT_R>(dptR_bldr);
		}
		MAM_DPT_R dptR = MAM_DPT_R.create();
		dptR = _latestDpt.get(r.getStringNE(dptCdCol), getMaxEndDt(r, dptCdCol));

		r.setStringNE(dptCdCol, dptR.dpt_cd());
		if (!isNull(dptNmCol)) {
			r.setStringNE(dptNmCol, dptR.dpt_nm());
		}
		r.setStringNE(MAM_DPT_R.$wg_cd, dptR.wg_cd());
		r.setStringNE(MAM_WG_R.$wg_nm, dptR.getStringNE(MAM_WG_R.$wg_nm));
		return r;
	}

	protected MCDate getMaxEndDt(MCRow r, String dptCdCol) {
		if (_maxEndDt == null) {
			MAM_DPT_R t = MAM_DPT_R.create("T");
			MCQueryApiBuilder dptR_bldr = MCQueryApiBuilder.create(t);
			dptR_bldr.addMax(t.end_dt, MAM_DPT_R.$end_dt);
			dptR_bldr.setWhere(t.dpt_cd.eq(bind("b1")));
			_maxEndDt = new FXUCL_MCDbcCacheCW<MAM_DPT_R>(dptR_bldr);
		}
		return _maxEndDt.get(r.getStringNE(dptCdCol)).end_dt();
	}

	/**
	 * 請求先が国内か国外か判定する<br>
	 * <li>国内の場合、falseを返却</li>
	 * <li>国外の場合、trueを返却</li>
	 * 
	 * @param bcstCd 請求先ＣＤ
	 * @return 判定結果
	 */
	public static boolean isForeign(String bcstCd) {
		return object(CLAZZ)._isForeign(bcstCd);
	}

	protected boolean _isForeign(String bcstCd) {
		return !isSame(getBp(bcstCd).cntry_cd(), getCo().cntry_cd());
	}

	/**
	 * 引数の請求先の請求締処理区分が売上都度請求かどうかを判定する<br>
	 * 
	 * <li>売上都度請求の場合、trueを返却</li>
	 * <li>売上都度請求以外の場合、falseを返却</li>
	 * 
	 * @param bcstCd 請求先ＣＤ
	 * 
	 * @return 判定結果
	 */
	public static boolean isEachSls(String bcstCd) {
		return object(CLAZZ)._isEachSls(bcstCd);
	}

	protected boolean _isEachSls(String bcstCd) {
		return MAC_BILL_CL_TYP.isEACH_SLS(getBp(bcstCd).bill_cl_typ());
	}

	/**
	 * 請求先の売上仮単価締ＦＬＧを取得する
	 * 
	 * @param bcstCd 請求先ＣＤ
	 * 
	 * @return 売上仮単価締ＦＬＧ
	 */
	public static boolean getSlsInterimClFlg(String bcstCd) {
		return object(CLAZZ)._getSlsInterimClFlg(bcstCd);
	}

	protected boolean _getSlsInterimClFlg(String bcstCd) {
		return getBp(bcstCd).sls_interim_cl_flg();
	}

	/**
	 * 請求先の請求税計算ＦＬＧを取得する
	 * 
	 * @param bcstCd 請求先ＣＤ
	 * 
	 * @return 請求税計算ＦＬＧ
	 */
	public static boolean getTaxOnBillFlg(String bcstCd) {
		return object(CLAZZ)._getTaxOnBillFlg(bcstCd);
	}

	protected boolean _getTaxOnBillFlg(String bcstCd) {
		return getBp(bcstCd).tax_on_bill_flg();
	}

	/**
	 * 前受金残高取得<br />
	 * 請求先、請求部門をもとに前受金残高を取得する
	 * 
	 * @param bcstCd 請求先ＣＤ
	 * @param billDptCd 請求部門ＣＤ
	 * 
	 * @return 前受金残高
	 */
	public static MCNumber getAdvAmtBal(String bcstCd, String billDptCd, String trdCurCd) {
		return object(CLAZZ)._getAdvAmtBal(bcstCd, billDptCd, trdCurCd);
	}

	protected MCNumber _getAdvAmtBal(String bcstCd, String billDptCd, String trdCurCd) {

		MCList<MST_RCV_R> rcvL = MCList.create(MST_RCV_R.class);
		MST_RCV_R t = MST_RCV_R.create("T");
		MCQueryApiBuilder rcvL_bldr = MCQueryApiBuilder.create(t);
		rcvL_bldr.setSelect(t.rcv_amt);
		rcvL_bldr.addSelect(t.bill_setoff_amt);
		rcvL_bldr.addSelect(t.bill_dpt_cd);
		rcvL_bldr.addWhereWithAnd(t.dat_typ.eq(bind("1")), MSC_RCV_DAT_TYP.ADV.value());
		rcvL_bldr.addWhereWithAnd(t.bcst_cd.eq(bind("1")), bcstCd);
		rcvL_bldr.addWhereWithAnd(t.trd_cur_cd.eq(bind("1")), trdCurCd);
		dbSelect("MSBGL5120_MST_RCV_S01", rcvL, rcvL_bldr);

		if (rcvL.isEmpty()) {
			return MCNumber.ZERO;
		}

		// 前受金入金に請求部門が設定されている場合、かつ、引数の請求部門ＣＤと異なる場合、
		// 対象から除外する
		MCList<MST_RCV_R> tgtL = MCList.create(MST_RCV_R.class);
		for (MST_RCV_R r : rcvL) {
			if (isNull(r.bill_dpt_cd()) || isSame(billDptCd, r.bill_dpt_cd())) {
				tgtL.add(r);
			}
		}
		
		if (tgtL.isEmpty()) {
			return MCNumber.ZERO;
		}

		// 入金額 ― 請求済相殺額を返却する
		return tgtL.sum(MST_RCV_R.$rcv_amt).subtract(
				tgtL.sum(MST_RCV_R.$bill_setoff_amt));
	}
	/**
	 * 前受金取得<br>
	 * 請求先、請求部門、取引通貨をもとに請求締対象となりうる前受金を取得する
	 * 
	 * @param bcstCd 請求先ＣＤ
	 * @param billDptCd 請求部門ＣＤ
	 * @param trdCurCd 取引通貨ＣＤ
	 * 
	 * @return 前受金（入金実績明細ＮＯ、連番のみ）
	 */
	public static MCList<MST_RCV_ACT_D_R> getBillClAdvL(String bcstCd, String billDptCd, String trdCurCd) {
		return object(CLAZZ)._getBillClAdvL(bcstCd, billDptCd, trdCurCd);
	}

	protected MCList<MST_RCV_ACT_D_R> _getBillClAdvL(String bcstCd, String billDptCd, String trdCurCd) {
		
		MST_RCV_ACT_R t1 = MST_RCV_ACT_R.create("T1");
		MST_RCV_ACT_D_R t2 = MST_RCV_ACT_D_R.create("T2");
		MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
		bldr.setSelect(
			t2.rcv_act_d_no, t2.rcv_act_d_seq, t2.rcv_act_no, t2.rcv_act_seq, t1.bill_dpt_cd,
			t1.ar_trd_grp_typ, t1.trd_ptn_typ, t1.ar_sttl_typ1,
			t2.trd_cur_amt1, t2.trd_cur_amt2, t2.trd_cur_amt3,
			t2.trd_cur_tax_amt1, t2.trd_cur_tax_amt2, t2.trd_cur_tax_amt3
		);
		bldr.addInnerJoin(t2, 
			t2.rcv_act_no.eq(t1.rcv_act_no)
			.and(t2.rcv_act_seq.eq(t1.rcv_act_seq))
		);
		bldr.setWhere(t1.bcst_cd.eq(bind("1")), bcstCd);
		bldr.addWhereWithAnd(t1.trd_cur_cd.eq(bind("1")), trdCurCd);
		bldr.addWhereWithAnd(
			t1.trd_ptn_typ.in(
				value(MAC_TRD_PTN_TYP.RCV_ADV.value()),
				value(MAC_TRD_PTN_TYP.SETOFF_ADV_OTH.value()),
				value(MAC_TRD_PTN_TYP.SETOFF_SUSP_ADV.value())
			)
		);
		bldr.addWhereWithAnd(t2.bill_mng_no.isNull());
		bldr.addWhereWithAnd(t1.bill_dtl_adv_flg.eq(value(true)));
		
		MCList<MST_RCV_ACT_D_R> rsltL = MCList.create(MST_RCV_ACT_D_R.class);
		dbSelectForUpdate("MSBGL5120_MST_RCV_ACT_D_S01", rsltL, bldr);
		
		// 請求部門が設定されている場合、かつ、引数の請求部門ＣＤと異なる場合、対象から除外する
		MCList<MST_RCV_ACT_D_R> tgtL = MCList.create(MST_RCV_ACT_D_R.class);
		for (MST_RCV_ACT_D_R r : rsltL) {
			if (isNull(r.bill_dpt_cd()) || isSame(billDptCd, r.bill_dpt_cd())) {
				tgtL.add(r);
			}
		}
		
		return tgtL;
	}
	/**
	 * 請求ヘッダの前受金入金額、前受金相殺額、前受金相殺税額を設定する
	 */
	public static void setAdvAmt(MST_BILL_R r, MCList<MST_RCV_ACT_D_R> advL) {
		object(CLAZZ)._setAdvAmt(r, advL);
	}
	protected void _setAdvAmt(MST_BILL_R r, MCList<MST_RCV_ACT_D_R> advL) {
		if (advL.isEmpty()) {
			r.adv_amt(MCNumber.ZERO);
			r.adv_setoff_amt(MCNumber.ZERO);
			r.adv_setoff_tax_amt(MCNumber.ZERO);
		}
		else {
			for (MST_RCV_ACT_D_R advR : advL) {
				MCNumber tmpSetoffAdvOthAmt = MCNumber.ZERO;
				// 前受金その他相殺（前受金の返金）の金額取得
				if (MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(advR.getString("trd_ptn_typ"))) {
					tmpSetoffAdvOthAmt = MSBGL_ArUtil.getSetoffAmt(
						advR.getString("trd_ptn_typ"), advR.getString("ar_trd_grp_typ"),
						advR.trd_cur_amt1(), advR.trd_cur_amt2(), advR.trd_cur_amt3()).multiply(-1);
				}
				// 前受金入金額
				r.adv_amt(nvl(r.adv_amt(), MCNumber.ZERO).subtract(
					sum(
						MSBGL_ArUtil.getCashAmt(
							advR.getString("trd_ptn_typ"), advR.getString("ar_trd_grp_typ"), advR.getString("ar_sttl_typ1"),
							advR.trd_cur_amt1(), advR.trd_cur_amt2(), advR.trd_cur_amt3()),
						MSBGL_ArUtil.getNoteAmt(
							advR.getString("trd_ptn_typ"), advR.getString("ar_trd_grp_typ"), advR.getString("ar_sttl_typ1"),
							advR.trd_cur_amt1(), advR.trd_cur_amt2(), advR.trd_cur_amt3()),
						MSBGL_ArUtil.getXfrAmt(
							advR.getString("trd_ptn_typ"), advR.getString("ar_trd_grp_typ"), advR.getString("ar_sttl_typ1"),
							advR.trd_cur_amt1(), advR.trd_cur_amt2(), advR.trd_cur_amt3())
						,tmpSetoffAdvOthAmt
					)
				));
				if (!MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(advR.getString("trd_ptn_typ"))) {
					r.adv_setoff_amt(nvl(r.adv_setoff_amt(), MCNumber.ZERO).subtract(
						MSBGL_ArUtil.getSetoffAmt(
							advR.getString("trd_ptn_typ"), advR.getString("ar_trd_grp_typ"),
							advR.trd_cur_amt1(), advR.trd_cur_amt2(), advR.trd_cur_amt3())
					));
					r.adv_setoff_tax_amt(nvl(r.adv_setoff_tax_amt(), MCNumber.ZERO).subtract(
						MSBGL_ArUtil.getSetoffTaxAmt(
							advR.getString("trd_ptn_typ"), advR.getString("ar_trd_grp_typ"),
							advR.trd_cur_tax_amt1(), advR.trd_cur_tax_amt2(), advR.trd_cur_tax_amt3(),
							advR.getBooleanNE("bill_tax_disp_flg"))
					));
				}
			}
			// 前受金相殺額（税抜き）
			r.adv_setoff_amt(
				r.adv_setoff_amt().subtract(r.adv_setoff_tax_amt())
			);
		}
	}

	/**
	 * applAmt（消込対象金額）で消込した際に、取消、無効実績のセットが優先的に消込できるようにソートして返す。<BR>
	 * tgtLには以下のカラムが含まれている必要がある。<BR>
	 * <table border = 1><tr><th>カラム名</th><th>型</th><th>値</th></tr>
	 * <tr><td>par_slip_sts_typ</td><td>String</td><td>親請求明細の伝票状況区分</td></tr>
	 * <tr><td>appl_amt</td><td>MCNumber</td><td>MST_BILL_D_APPL_BAL.APPL_AMT</td></tr>
	 * <tr><td>par_rcv_act_d_no</td><td>String</td><td>親請求明細の入金実績明細ＮＯ</td></tr>
	 * <tr><td>par_pre_rcv_act_d_no</td><td>String</td><td>親請求明細の旧入金実績明細ＮＯ</td></tr>
	 * <tr><td>not_appl_bal</td><td>MCNumber</td><td>MST_BILL_D_APPL_BAL.NOT_APPL_BAL</td></tr>
	 * <tr><td>acst_cd</td><td>String</td><td>売掛先ＣＤ</td></tr>
	 * <tr><td>ar_dpt_cd</td><td>String</td><td>売掛部門ＣＤ</td></tr>
	 * <tr><td>wrk_no</td><td>String</td><td>案件ＮＯ</td></tr>
	 * <tr><td>trd_cur_cd</td><td>String</td><td>取引通貨ＣＤ</td></tr>
	 * <tr><td>iv_no</td><td>String</td><td>インボイスＮＯ</td></tr>
	 * <tr><td>bcst_cd</td><td>String</td><td>請求先ＣＤ</td></tr>
	 * </table>
	 * @param tgtL
	 * @param applAmt
	 * @return
	 */
	public static <T extends MCRow> MCList<T> sortRedCanSlipFirst(MCList<T> tgtL,MCNumber applAmt){
		return object(CLAZZ)._sortRedCanSlipFirst(tgtL, applAmt);
	}

	protected <T extends MCRow> MCList<T> _sortRedCanSlipFirst(MCList<T> tgtL,
			MCNumber applAmt) {
		tgtL.setBooleanNE("pair", false);

		MCList<T> applBilldL = MCList.create(tgtL.createRow());
		MCList<T> pairBilldL = MCList.create(tgtL.createRow());

		MCIndexKey key = tgtL.createIndex(getRedCanSlipIdxCols());

		for (T r : tgtL) {

			// 取消実績の場合はセットの無効実績を探してペアリストに追加
			if (MAC_SLIP_STS_TYP.isCAN(r.getString("par_slip_sts_typ"))) {
				
				// 他の実績で消込されている場合は自動消込の対象外とする
				if (!r.getNumber("appl_amt").isZero()) {
					continue;
				}

				MCList<T> canL = tgtL.subList(key, getRedCanSlipKeyVal(r)).subList("appl_amt", MCNumber.ZERO);

				if (!canL.isEmpty()) {
					// 残高振替で一部金額のみ振替されている場合は自動消込の対象外とする
					if (!canL.get(0).getNumber("not_appl_bal").add(r.getNumber("not_appl_bal")).isZero()) {
						continue;
					}

					boolean isRedFirst = canL.get(0).getNumber("not_appl_bal")
							.multiply(applAmt).isNegative();

					// 入金額と符号違いの明細が先に配置されるようにする
					pairBilldL.add(isRedFirst ? canL.get(0) : r); // 入金額と符号違いの明細を追加
					pairBilldL.add(isRedFirst ? r : canL.get(0)); // 入金額と符号が同じ明細を追加

					canL.get(0).setBoolean("pair", true);
					r.setBoolean("pair", true);

					continue;
				}
			}
		}

		// 最初に取消伝票と赤伝票のセットを追加
		applBilldL.addAll(pairBilldL);
		applBilldL.addAll(tgtL.subList("pair", false));

		return applBilldL.clone();
	}

	protected String[] getRedCanSlipIdxCols(){
		return new String[]{"par_act_d_no", "par_act_d_seq",
				"acst_cd", "ar_dpt_cd", "wrk_no", "ar_typ",
				"trd_cur_cd", "iv_no", "bcst_cd", "bill_dpt_cd"};
	}

	protected <T extends MCRow> Comparable<?>[] getRedCanSlipKeyVal(T r) {
		return new Comparable<?>[] {
			r.getString("par_act_d_no"), r.getNumber("par_act_d_seq").subtract(1),
			r.getString("acst_cd"),r.getString("ar_dpt_cd"), r.getString("wrk_no"), r.getString("ar_typ"),
			r.getString("trd_cur_cd"), r.getString("iv_no"), r.getString("bcst_cd"), r.getString("bill_dpt_cd")
		};
	}

	/**
	 * 売掛消込予定登録<br />
	 * 
	 * 登録対象の売掛先別請求情報をもとに請求明細を取得し、売掛消込予定を作成する<br>
	 * 同じキーで既に存在する場合は更新、存在しない場合は新規登録する。<br>
	 * 登録済の売掛消込予定のうち不要となるレコードを削除する。
	 * 
	 * @param rcvSchdL 入金予定情報
	 * @param regBillAcstL 売掛先別請求リスト
	 * @param billR 請求ヘッダレコード
	 * @param rcvSchdDt 入金予定日
	 * @param flg 売掛消込実績の付け替え処理を行うかどうかのフラグ
	 * @param arOpeTyp 債権更新処理区分
	 */
	public static void regArApplSchd(MCList<MST_RCV_SCHD_R> rcvSchdL,
			MCList<MST_BILL_ACST_R> regBillAcstL, MST_BILL_R billR,
			MCDate rcvSchdDt, boolean flg, String arOpeTyp) {
		object(CLAZZ)._regArApplSchd(rcvSchdL, regBillAcstL, billR, rcvSchdDt, flg, arOpeTyp, null);
	}

	public static void regArApplSchd(MCList<MST_RCV_SCHD_R> rcvSchdL,
			MCList<MST_BILL_ACST_R> regBillAcstL, MST_BILL_R billR, MCDate rcvSchdDt, boolean flg,
			String arOpeTyp, MCList<MST_BILL_D_R> keyL) {
		object(CLAZZ)._regArApplSchd(rcvSchdL, regBillAcstL, billR, rcvSchdDt, flg, arOpeTyp, keyL);
	}

	protected void _regArApplSchd(MCList<MST_RCV_SCHD_R> rcvSchdL,
			MCList<MST_BILL_ACST_R> regBillAcstL, MST_BILL_R billR, 
			MCDate rcvSchdDt, boolean flg, String arOpeTyp, MCList<MST_BILL_D_R> keyL) {

		MCList<MST_AR_APPL_SCHD_R> lockL = srchArApplSchdL(regBillAcstL);
		MCList<MST_BILL_D_R> billDL = getBillDForArApplSchd(regBillAcstL, arOpeTyp, keyL);
		MCList<MST_AR_APPL_SCHD_R> regL =  getArApplSchd(billDL, billR, rcvSchdL);

		// 売掛消込予定の登録・更新処理
		MCList<MST_AR_APPL_SCHD_R> delL = insUpdArApplSchd(regL, lockL, rcvSchdDt);

		// 不要な売掛消込予定を削除
		delArApplSchd(delL, regL, flg);

		// 売掛消込予定の金額調整処理
		adjustArApplSchd(billR);
	}

	/**
	 * 売掛消込予定登録<br />
	 * 
	 * 登録対象の売掛先別請求情報をもとに請求明細を取得し、売掛消込予定を作成する<br>
	 * 同じキーで既に存在する場合は更新、存在しない場合は新規登録する。<br>
	 * 登録済の売掛消込予定のうち不要となるレコードを削除する。
	 * 
	 * @param rcvSchdL 入金予定情報
	 * @param regBillAcstL 売掛先別請求リスト
	 * @param billR 請求ヘッダレコード
	 * @param flg 売掛消込実績の付け替え処理を行うかどうかのフラグ
	 */
	public static void regArApplSchd(MCList<MST_RCV_SCHD_R> rcvSchdL,
			MCList<MST_BILL_ACST_R> regBillAcstL, MST_BILL_R billR, boolean flg) {
		object(CLAZZ)._regArApplSchd(rcvSchdL, regBillAcstL, billR, flg);
	}

	protected void _regArApplSchd(MCList<MST_RCV_SCHD_R> rcvSchdL,
			MCList<MST_BILL_ACST_R> regBillAcstL, MST_BILL_R billR, boolean flg) {

		MCList<MST_AR_APPL_SCHD_R> lockL = srchArApplSchdL(regBillAcstL);
		MCList<MST_BILL_D_R> billDL = getBillDForArApplSchd(regBillAcstL, null, null);
		MCList<MST_AR_APPL_SCHD_R> regL =  getArApplSchd(billDL, billR, rcvSchdL);

		// 売掛消込予定の登録・更新処理
		MCList<MST_AR_APPL_SCHD_R> delL = insUpdArApplSchd(regL, lockL, null);

		// 不要な売掛消込予定を削除
		delArApplSchd(delL, regL, flg);

		// 売掛消込予定の金額調整処理
		adjustArApplSchd(billR);
	}

	/**
	 * 売掛消込予定の検索<br />
	 * 
	 * 請求管理ＮＯをもとにして売掛消込予定情報を検索する
	 * 
	 * @param cndL 検索条件リスト
	 * 
	 * @return 売掛消込予定リスト
	 */
	protected MCList<MST_AR_APPL_SCHD_R> srchArApplSchdL(
			MCList<MST_BILL_ACST_R> cndL) {
		MCList<MST_AR_APPL_SCHD_R> l = MCList.create(MST_AR_APPL_SCHD_R.class);
		MST_AR_APPL_SCHD_R t = MST_AR_APPL_SCHD_R.create("T");
		MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);

		l_bldr.addSelect(t.ar_appl_schd_no);
		l_bldr.addWhereWithAnd(t.bill_acst_no.eq(bind("bill_acst_no")));
		l_bldr.setOrderByAsc(t.rcv_mtd_cd);
		dbSelect("MSBGL5120_MST_AR_APPL_SCHD_S01", l, l_bldr, cndL);
		return l;
	}

	/**
	 * 売掛消込予定の対象となる請求明細取得<br />
	 * 
	 * 売掛別請求ＮＯをもとに売掛消込予定に含める請求明細を取得する
	 * 
	 * @param regBillAcstL 売掛先別請求リスト
	 * @param arOpeTyp 債権更新処理区分
	 * 
	 * @return billDL 請求明細リスト
	 */
	protected MCList<MST_BILL_D_R> getBillDForArApplSchd(
			MCList<MST_BILL_ACST_R> regBillAcstL, String arOpeTyp, MCList<MST_BILL_D_R> keyL) {
		MCList<MST_BILL_D_R> billDL = MCList.create(MST_BILL_D_R.class);
		MST_BILL_D_R t = MST_BILL_D_R.create("T");
		MCQueryApiBuilder billDL_bldr = MCQueryApiBuilder.create(t);
		billDL_bldr.addWhereWithAnd(t.bill_acst_no.eq(bind("bill_acst_no")));
		billDL_bldr.addWhereWithAnd(t.valid_flg.eq(value(true)));
		billDL_bldr.addWhereWithAnd(t.trd_ptn_typ.in(
				value(MAC_TRD_PTN_TYP.SLS.value()),
				value(MAC_TRD_PTN_TYP.SLS_CNSGN.value()),
				value(MAC_TRD_PTN_TYP.SLS_RTN.value()),
				value(MAC_TRD_PTN_TYP.SLS_DSCNT.value()),
				value(MAC_TRD_PTN_TYP.SLS_XTRA.value()),
				value(MAC_TRD_PTN_TYP.ARSW_IN_BILL_BAL.value()),
				value(MAC_TRD_PTN_TYP.TAX_DIFF_BILL_CL.value())));
		dbSelect("MSBGL5120_MST_BILL_D_S01", billDL, billDL_bldr, regBillAcstL);

		// 未請求明細振替(-)、請求繰越回数更新(-)の場合、請求明細を作成しないので
		// 取引通貨金額、取引通貨税額、源泉税額にゼロを設定しておく
		if (MSC_AR_OPE_TYP.isARSW_OUT_NOT_BILL_BAL(arOpeTyp) || MSC_AR_OPE_TYP.isBILL_CRRYOVR_TIMES_ORG(arOpeTyp)) {
			if (!isNull(keyL)) {
				MCList<MST_BILL_D_R> tempL = MCList.create(MST_BILL_D_R.class);
				MCIndexKey key = keyL.createIndex(MST_BILL_D_R.$bill_d_no);
				for (MST_BILL_D_R billDR : billDL) {
					MST_BILL_D_R r = keyL.getFirst(key, billDR.bill_d_no());
					if (isNull(r)) {
						tempL.add(billDR);
					}
				}
				billDL.setAll(tempL);
			}
		}

		setBillDAmt(billDL);
		return billDL;
	}

	/**
	 * 請求明細の金額項目を売掛金額計算用に符号を調整する
	 * 
	 * @param billDL 請求明細
	 */
	protected void setBillDAmt(MCList<MST_BILL_D_R> billDL) {
		editUpForDscntItm(billDL);
		for (MST_BILL_D_R r : billDL) {
			String trdPtnTyp = r.trd_ptn_typ();
			r.trd_cur_amt(MAC_TRD_PTN_TYP.ar_amt_pm(trdPtnTyp).multiply(r.trd_cur_amt()));
			r.trd_cur_tax_amt(MAC_TRD_PTN_TYP.ar_amt_pm(trdPtnTyp).multiply(r.trd_cur_tax_amt()));
			r.wtax_amt(MAC_TRD_PTN_TYP.ar_amt_pm(trdPtnTyp).multiply(r.wtax_amt()));
		}
	}

	/**
	 * 売掛消込予定リスト作成<br />
	 * 
	 * 請求明細を売掛別請求ＮＯ、インボイスＮＯ、債権区分で集約して、getArApplSchdSub()を呼び出し<br>
	 * 返却された売掛消込予定リストを追加して作成した売掛消込予定リストを返却する
	 * 
	 * @param billDL 請求明細
	 * @param billR 請求ヘッダ
	 * @param rcvSchdL 入金予定
	 * 
	 * @return 売掛消込予定リスト
	 */
	protected MCList<MST_AR_APPL_SCHD_R> getArApplSchd(
			MCList<MST_BILL_D_R> billDL, MST_BILL_R billR, MCList<MST_RCV_SCHD_R> rcvSchdL) {

		MCList<MST_AR_APPL_SCHD_R> retL = MCList.create(MST_AR_APPL_SCHD_R.class);

		for (MST_BILL_D_R billDR : billDL.groupBy(getBillDGroupByPolicy())) {
			retL.addAll(getArApplSchdSub(billDR, billR, rcvSchdL));
		}
		adjustApplAmt(billDL, rcvSchdL, retL);
		return retL;
	}

	/**
	 * 請求明細を売掛別請求ＮＯ、インボイスＮＯ、債権区分毎にグルーピングするMCGroupByPolicyを設定
	 * 
	 * @return MCGroupByPolicy
	 */
	protected MCGroupByPolicy getBillDGroupByPolicy() {
		MCGroupByPolicy gp = new MCGroupByPolicy(_billDGroupByCols);
		gp.sum(MST_BILL_D_R.$trd_cur_amt);
		gp.sum(MST_BILL_D_R.$trd_cur_tax_amt);
		gp.sum(MST_BILL_D_R.$wtax_amt);
		return gp;
	}

	protected String[] _billDGroupByCols = {
		MST_BILL_D_R.$bill_acst_no,
		MST_BILL_D_R.$iv_no,
		MST_BILL_D_R.$ar_typ
	};

	/**
	 * 売掛消込予定の作成<br />
	 * 
	 * 請求明細レコードをもとに売掛消込予定情報を作成する
	 * 
	 * @param billDR 請求明細
	 * @param billR 請求ヘッダ
	 * @param rcvSchdL 入金予定
	 * 
	 * @return 売掛消込予定
	 */
	protected MCList<MST_AR_APPL_SCHD_R> getArApplSchdSub(
			MST_BILL_D_R billDR, MST_BILL_R billR, MCList<MST_RCV_SCHD_R> rcvSchdL) {

		// 基準日がnullの場合はnullを返却
		if (isNull(billR.base_dt())) {
			return null;
		}

		// 対象金額を設定（取引通貨金額＋取引通貨税額―源泉税額）
		MCNumber amt = billDR.trd_cur_amt().add(billDR.trd_cur_tax_amt()).subtract(billDR.wtax_amt());

		MCList<MAM_RCV_SCHD_CTL_R> rcvSchdCtlL = MCList.create(MAM_RCV_SCHD_CTL_R.class);

		if (isNull(rcvSchdL) || rcvSchdL.isEmpty()) {
			// 入金予定制御マスタ情報取得
			rcvSchdCtlL = getRcvSchdCtl(billR.bcst_cd(), billR.bill_dpt_cd(),
					billR.trd_cur_cd(), null, amt, billR.base_dt());
		}
		else {
			MCList<MST_RCV_SCHD_R> subL =
					rcvSchdL.subList(r -> !MAC_AR_STTL_TYP.isWTAX(r.rcv_typ()));
			MCNumber rcvSchdAmtSum = subL.sum(MST_RCV_SCHD_R.$rcv_schd_amt);
			for (MST_RCV_SCHD_R rcvSchdR : subL) {
				MAM_RCV_SCHD_CTL_R rcvSchdCtlR = MAM_RCV_SCHD_CTL_R.create();
				// 対象リストの入金予定額の合計が0の場合、比率に1を設定する
				if (rcvSchdAmtSum.isZero()) {
					rcvSchdCtlR.sttl_cd(rcvSchdR.rcv_mtd_cd());
					rcvSchdCtlR.rate(MCNumber.ONE);
					rcvSchdCtlR.addDateColumn("rcv_schd_dt", rcvSchdR.rcv_schd_dt());
					rcvSchdCtlL.add(rcvSchdCtlR);
				}
				else {
					// 入金予定額が0以外の場合のみ設定する
					if (!rcvSchdR.rcv_schd_amt().isZero()) {
						rcvSchdCtlR.sttl_cd(rcvSchdR.rcv_mtd_cd());
						rcvSchdCtlR.rate(rcvSchdR.rcv_schd_amt());
						rcvSchdCtlR.addDateColumn("rcv_schd_dt", rcvSchdR.rcv_schd_dt());
						rcvSchdCtlL.add(rcvSchdCtlR);
					}
				}
			}
		}

		if (rcvSchdCtlL.isEmpty()) {
			return null;
		}

		MAM_CUR_R curR = getCur(billR.trd_cur_cd());
		rcvSchdCtlL.addNumberColumn("rcv_schd_amt");
		FXUCC_Divide.prop(rcvSchdCtlL, amt, curR.amt_dec_place().intValue(), MAM_RCV_SCHD_CTL_R.$rate, "rcv_schd_amt");

		MCList<MST_AR_APPL_SCHD_R> arApplSchdL = MCList.create(MST_AR_APPL_SCHD_R.class);

		// 金種毎の処理
		for (MAM_RCV_SCHD_CTL_R rcvSchdCtlR: rcvSchdCtlL){
			MCDate rcvSchdDt;
			if (isNull(rcvSchdCtlR.getDateNE("rcv_schd_dt"))) {
				// 入金予定日取得
				rcvSchdDt = getRcvSchdDt(rcvSchdCtlR, billR.bcst_cd(), billR.base_dt());

				// 休日を考慮した入金予定日の取得
				rcvSchdDt = adjustSchdRcvDt(rcvSchdDt, billR.base_dt(), billR.bcst_cd(),
						rcvSchdCtlR.sttl_cd(), billR.bill_dpt_cd());
			}
			else {
				rcvSchdDt = rcvSchdCtlR.getDateNE("rcv_schd_dt");
			}
			arApplSchdL.add(
					getArApplSchdR(
							billDR,
							rcvSchdDt,
							rcvSchdCtlR.sttl_cd(),
							rcvSchdCtlR.getNumber("rcv_schd_amt"))
					);
		}
		// 源泉税額が設定されている場合、源泉税用のレコードを追加する
		if (!billDR.wtax_amt().isZero()) {
			arApplSchdL.add(
					getArApplSchdR(
							billDR,
							(MCDate)arApplSchdL.min(MST_RCV_SCHD_R.$rcv_schd_dt),
							_getArSttlCd(MAC_AR_STTL_TYP.WTAX.value()).sttl_cd(),
							billDR.wtax_amt())
					);
		}
		return arApplSchdL;
	}

	/**
	 * 入金方法・入金予定日ごとの消込対象額を調整する
	 * @param billDL 請求明細
	 * @param rcvSchdL 入金予定
	 * @param applTgtAmt 消込対象額
	 */
	protected void adjustApplAmt(MCList<MST_BILL_D_R> billDL, MCList<MST_RCV_SCHD_R> rcvSchdL, MCList<MST_AR_APPL_SCHD_R> arApplSchdL) {
		if (isNull(rcvSchdL) || rcvSchdL.size() <= 1 || billDL.groupBy(_billDGroupByCols).size() <= 1) {
			return;
		}
		MCSortPolicy sp = new MCSortPolicy();
		sp.add(SortType.DESC, MST_BILL_D_R.$trd_cur_amt);
		sp.add(SortType.DESC, MST_BILL_D_R.$bill_acst_no);
		MCList<MST_BILL_D_R> tmpL = billDL.clone();
		tmpL.sort(sp);
		
		// 金額が最大の売掛別請求を差額調整の対象とする
		MST_BILL_D_R maxAmtR = tmpL.get(0);
		
		MCIndexKey applIdx = arApplSchdL.createIndex(MST_AR_APPL_SCHD_R.$rcv_mtd_cd,
				MST_AR_APPL_SCHD_R.$rcv_schd_dt, MST_AR_APPL_SCHD_R.$bill_acst_no);
		
		for (MST_RCV_SCHD_R r : rcvSchdL) {
			MCNumber sumAmt = MCNumber.ZERO;
			MCList<MST_AR_APPL_SCHD_R> subL = arApplSchdL.subList(applIdx, r.rcv_mtd_cd(), r.rcv_schd_dt());
			if (!isNull(subL)) {
				sumAmt = subL.sum(MST_AR_APPL_SCHD_R.$appl_tgt_amt);
				if (!isSame(r.rcv_schd_amt(), sumAmt)) {
					MST_AR_APPL_SCHD_R tgtR = arApplSchdL.getFirst(applIdx, r.rcv_mtd_cd(), r.rcv_schd_dt(), maxAmtR.bill_acst_no());
					if (!isNull(tgtR)) {
						tgtR.appl_tgt_amt(tgtR.appl_tgt_amt().add(r.rcv_schd_amt()).subtract(sumAmt));
					}
				}
			}
		}
	}	

	/**
	 * 売掛消込予定レコードを作成する
	 * 
	 * @param billDR 請求明細情報
	 * @param rcvSchdDt 入金予定日
	 * @param rcvMtdCd 入金方法ＣＤ
	 * @param applTgtAmt 消込対象額
	 * 
	 * @return 源泉税用の売掛消込予定レコード
	 */
	protected MST_AR_APPL_SCHD_R getArApplSchdR(MST_BILL_D_R billDR, MCDate rcvSchdDt, String rcvMtdCd, MCNumber applTgtAmt) {
		MST_AR_APPL_SCHD_R r = MST_AR_APPL_SCHD_R.create();
		r.bill_acst_no(billDR.bill_acst_no());
		r.iv_no(billDR.iv_no());
		r.ar_typ(billDR.ar_typ());
		r.rcv_schd_dt(rcvSchdDt);
		r.appl_tgt_amt(applTgtAmt);
		r.rcv_mtd_cd(rcvMtdCd);
		return r;
	}

	/**
	 * 売掛消込予定の登録・更新<br />
	 * 
	 * 売掛消込予定に既に存在する場合は更新、存在しない場合は新規登録する<br>
	 * 既に存在する売掛消込予定のうち今回登録・更新対象に存在しないレコードを削除リストとして返却する
	 * 
	 * @param regL 登録対象の売掛消込予定（更新時の更新内容）
	 * @param lockL 更新対象の売掛消込予定
	 * 
	 * @return 削除対象の売掛消込予定
	 */
	protected MCList<MST_AR_APPL_SCHD_R> insUpdArApplSchd(
			MCList<MST_AR_APPL_SCHD_R> regL,
			MCList<MST_AR_APPL_SCHD_R> lockL, MCDate rcvSchdDt) {

		// 削除用リストを取得する
		MCList<MST_AR_APPL_SCHD_R> delL = MCList.create(MST_AR_APPL_SCHD_R.class);

		MCIndexKey regKey = regL.createIndex(arApplSchdKeyCols);

		// 入金予定日が指定されている場合、設定する。
		if (!isNull(rcvSchdDt)) {
			regL.setDate(MST_AR_APPL_SCHD_R.$rcv_schd_dt, rcvSchdDt);
		}

		for (MST_AR_APPL_SCHD_R lockR : lockL) {
			MST_AR_APPL_SCHD_R oldR = getArApplSchdFirst(regL, lockR, regKey);
			if (isNull(oldR)) {
				delL.add(lockR);
			}
		}

		// 売掛消込予定の登録・更新を行う
		MCIndexKey lockKey = lockL.createIndex(arApplSchdKeyCols);

		for (MST_AR_APPL_SCHD_R regR : regL) {
			MST_AR_APPL_SCHD_R lockR = getArApplSchdFirst(lockL, regR, lockKey);
			if (isNull(lockR)) {
				insArApplSchd(regR);
			}
			else {
				updArApplSchd(regR, lockR);
			}
		}

		return delL;
	}

	protected String[] arApplSchdKeyCols = {
			MST_AR_APPL_SCHD_R.$bill_acst_no,
			MST_AR_APPL_SCHD_R.$iv_no,
			MST_AR_APPL_SCHD_R.$ar_typ,
			MST_AR_APPL_SCHD_R.$rcv_mtd_cd,
			MST_AR_APPL_SCHD_R.$rcv_schd_dt
	};

	/**
	 * 売掛消込予定を抽出<br />
	 * 
	 * 売掛消込予定リストからキー情報（売掛先別請求ＮＯ、入金方法ＣＤ、入金予定日）を<br>
	 * もとにしてレコードを抽出する
	 * 
	 * @param l 売掛消込予定リスト
	 * @param r 売掛消込予定レコード
	 * @param idxKey 売掛消込予定のキー
	 * 
	 * @return 抽出した売掛消込予定レコード
	 */
	protected MST_AR_APPL_SCHD_R getArApplSchdFirst(MCList<MST_AR_APPL_SCHD_R> l,
			MST_AR_APPL_SCHD_R r, MCIndexKey idxKey) {
		return l.getFirst(idxKey, r.bill_acst_no(), r.iv_no(), r.ar_typ(),
				r.rcv_mtd_cd(), r.rcv_schd_dt());
	}

	/**
	 * 売掛消込予定登録<br />
	 * 売掛消込予定を新規登録する
	 * 
	 * @param r 新規登録対象の売掛消込予定レコード
	 */
	protected void insArApplSchd(MST_AR_APPL_SCHD_R r) {
		
		r.ar_appl_schd_no(getStrSeq(MSC_NUM_SYS_TYP.ARAPPLSCHD));
		r.appl_amt(MCNumber.ZERO);
		r.not_appl_bal(r.appl_tgt_amt());
		
		MCQueryApiBuilder applSchdR_bldr = MCQueryApiBuilder.create(MST_AR_APPL_SCHD_R.create("T"));
		dbInsertEx("MSBGL5120_MST_AR_APPL_SCHD_I01", r, applSchdR_bldr);
	}

	/**
	 * 売掛消込予定更新<br />
	 * 売掛消込予定を更新する
	 * 
	 * @param r 更新情報
	 * @param lockR 更新元の売掛消込予定レコード
	 */
	protected void updArApplSchd(MST_AR_APPL_SCHD_R r, MST_AR_APPL_SCHD_R lockR) {

		// 後続処理のために売掛消込予定ＮＯを設定する
		r.ar_appl_schd_no(lockR.ar_appl_schd_no());
	
		MST_AR_APPL_SCHD_R t = MST_AR_APPL_SCHD_R.create("T");
		MCQueryApiBuilder arrSchd_bldr = MCQueryApiBuilder.create(t);
		arrSchd_bldr.setWhere(t.ar_appl_schd_no.eq(bindEx("ar_appl_schd_no")));
		arrSchd_bldr.setSet(t.rcv_schd_dt);
		arrSchd_bldr.addSet(t.appl_tgt_amt);
		arrSchd_bldr.addSetVL(t.not_appl_bal, bindEx("appl_tgt_amt").subtract(t.appl_amt));
		dbUpdate("MSBGL5120_MST_AR_APPL_SCHD_U01", r, arrSchd_bldr);

	}

	/**
	 * 売掛消込予定の削除<br />
	 * 
	 * <li>削除対象の売掛消込予定が存在する場合、以下の処理を行う</li>
	 * ①flgがtrueの場合、削除対象の売掛消込予定に紐付く売掛消込実績を検索し、
	 * 売掛消込実績の付け替え処理を呼び出す<br>
	 * ②削除対象の売掛消込予定を削除する<br>
	 * 
	 * <br><li>削除対象の売掛消込予定が存在しない場合、何もしない</li>
	 * @param delL 削除対象の売掛消込予定
	 * @param regL 登録対象の売掛消込予定
	 * @param flg 売掛消込実績の付け替え処理を行うかどうかのフラグ
	 */
	protected void delArApplSchd(MCList<MST_AR_APPL_SCHD_R> delL,
			MCList<MST_AR_APPL_SCHD_R> regL, boolean flg) {
		if (!delL.isEmpty()) {
			// 売掛消込実績の売掛消込予定ＮＯを付け替える
			delL.addBooleanColumn("not_del", false);
			if (flg) {
				_updArApplAct(delL, regL, false);
			}
			MCQueryApiBuilder regR_bldr = MCQueryApiBuilder.create(MST_AR_APPL_SCHD_R.create("T"));
			dbDeleteKey("MSBGL5120_MST_AR_APPL_SCHD_D01", delL.subList("not_del", false), regR_bldr);
		}
	}

	/**
	 * 売掛消込実績の付け替え処理<br />
	 * 
	 * 売掛消込実績の売掛消込予定ＮＯを付け替える。
	 * 
	 * @param arApplActL 売掛消込実績リスト
	 * @param arApplSchdL 付替え先の売掛消込予定リスト
	 */
	public static void updArApplAct(MCList<MST_AR_APPL_SCHD_R> delL,
			MCList<MST_AR_APPL_SCHD_R> arApplSchdL) {
		object(CLAZZ). _updArApplAct(delL, arApplSchdL, true);
	}
	protected void _updArApplAct(MCList<MST_AR_APPL_SCHD_R> delL,
			MCList<MST_AR_APPL_SCHD_R> arApplSchdL, boolean isCl) {

		MCList<MST_AR_APPL_ACT_R> actL = MCList.create(MST_AR_APPL_ACT_R.class);
		MST_AR_APPL_ACT_R t = MST_AR_APPL_ACT_R.create("T");
		MCQueryApiBuilder actL_bldr = MCQueryApiBuilder.create(t);
		actL_bldr.setWhere(t.ar_appl_schd_no.eq(bind("ar_appl_schd_no")));
		dbSelect("MSBGL5120_MST_AR_APPL_ACT_S01", actL, actL_bldr, delL);

		MCList<MST_BILL_D_APPL_ACT_R> billDApplActL = getApplActL(actL);
		MCIndexKey billDApplActIdx = billDApplActL.createIndex(MST_BILL_D_APPL_ACT_R.$rcv_act_d_no);

		// IndexKey作成
		MCIndexKey schdKey = arApplSchdL.createIndex(MST_AR_APPL_SCHD_R.$bill_acst_no,
				MST_AR_APPL_SCHD_R.$iv_no, MST_AR_APPL_SCHD_R.$ar_typ);
		MCIndexKey schdKeyForBillCl = arApplSchdL.createIndex(
				MST_AR_APPL_SCHD_R.$iv_no, MST_AR_APPL_SCHD_R.$ar_typ);
		MCIndexKey schdKeyForBillClPrior = arApplSchdL.createIndex(
				MST_AR_APPL_SCHD_R.$iv_no, MST_AR_APPL_SCHD_R.$ar_typ, MST_AR_APPL_SCHD_R.$rcv_mtd_cd);
		// 削除対象から削除対象外にする場合にtrueを設定する
		delL.addBooleanColumn("not_del", false);

		for (MST_AR_APPL_SCHD_R delR : delL) {

			clearAmt(delR);

			// 削除する売掛消込予定に紐付く売掛消込実績を抽出
			MCList<MST_AR_APPL_ACT_R> actSubL =
					actL.subList(MST_AR_APPL_ACT_R.$ar_appl_schd_no, delR.ar_appl_schd_no());

			if (actSubL.isEmpty()) {
				continue;
			}

			// 削除する売掛消込予定と同じKeyの売掛消込予定を抽出（付替え先の売掛消込予定）
			MCList<MST_AR_APPL_SCHD_R> schdSubL =
					arApplSchdL.subList(schdKey, delR.bill_acst_no(), delR.iv_no(), delR.ar_typ());

			//　請求締処理時（isCl=true）は、削除する売掛消込予定（delR）と登録する売掛消込予定（arApplSchdL）が直接（bill_acst_noで）紐づかないので、他の項目で絞り込む
			if (isCl && schdSubL.isEmpty()) {
				// 元の売掛消込予定の入金方法で絞り込む
				schdSubL = arApplSchdL.subList(schdKeyForBillClPrior, delR.iv_no(), delR.ar_typ(), delR.rcv_mtd_cd());
				if (schdSubL.isEmpty()) {
					// 削除する売掛消込予定と同じKeyの売掛消込予定を抽出（付替え先の売掛消込予定）
					schdSubL = arApplSchdL.subList(schdKeyForBillCl, delR.iv_no(), delR.ar_typ());
				}
			}

			schdSubL.sort(MST_AR_APPL_SCHD_R.$rcv_mtd_cd, MST_AR_APPL_SCHD_R.$rcv_schd_dt);

			// 以下の優先順位で付け替える。
			// １．入金方法が同じ
			// ２．入金方法は違うが入金予定日と入金日が同じ
			// ３．入金対象額と入金額が同じ
			// ４．それ以外は入金方法、入金予定日で並び替えた1件目に付け替える
			// （未請求分が無いので金額の割り当て直しはしない）
			for (MST_AR_APPL_ACT_R actR : actSubL) {
				boolean setFlg = false;
				// 売掛消込実績に対して割り当て可能な売掛消込予定を取得
				MCList<MST_AR_APPL_SCHD_R> applTgtL = getApplTgtL(actR, schdSubL, billDApplActL, billDApplActIdx);
				for (MST_AR_APPL_SCHD_R schdR : applTgtL) {
					if (isSame(actR.rcv_mtd_cd(), schdR.rcv_mtd_cd())) {
						actR.ar_appl_schd_no(schdR.ar_appl_schd_no());
						setFlg = true;
						break;
					}
					else if (isSame(actR.rcv_act_dt(), schdR.rcv_schd_dt())) {
						actR.ar_appl_schd_no(schdR.ar_appl_schd_no());
						setFlg = true;
						break;
					}
					else if (isSame(actR.appl_amt(), schdR.appl_tgt_amt())) {
						actR.ar_appl_schd_no(schdR.ar_appl_schd_no());
						setFlg = true;
						break;
					}
				}
				// それ以外
				if (!setFlg) {
					if (applTgtL.isEmpty()) {
						if (delR.getBoolean("not_del")) {
						}
						else {
							delR.setBoolean("not_del", true);

							MST_AR_APPL_SCHD_R applSchdR = MST_AR_APPL_SCHD_R.create("T");
							MCQueryApiBuilder arrSchd_bldr = MCQueryApiBuilder.create(applSchdR);
							arrSchd_bldr.setWhere(applSchdR.ar_appl_schd_no.eq(bindEx("ar_appl_schd_no")));
							arrSchd_bldr.setSetVL(applSchdR.appl_tgt_amt, value(0));
							arrSchd_bldr.addSetVL(applSchdR.not_appl_bal, value(0));
							arrSchd_bldr.addSetVL(applSchdR.appl_amt, value(0));

							dbUpdate("MSBGL5120_MST_AR_APPL_SCHD_U02", delR, arrSchd_bldr);
						}
					}
					else {
						actR.ar_appl_schd_no(applTgtL.get(0).ar_appl_schd_no());
					}
				}
				updArApplSchdForArApplAct(actR);
			}

			MCQueryApiBuilder applAct_bldr = MCQueryApiBuilder.create(MST_AR_APPL_ACT_R.create("T"));
			dbUpdateKey("MSBGL5120_MST_AR_APPL_ACT_U01", actSubL, applAct_bldr);
		}
	}

	protected void clearAmt(MST_AR_APPL_SCHD_R delR) {
		delR.appl_tgt_amt(MCNumber.ZERO);
		delR.appl_amt(MCNumber.ZERO);
		delR.not_appl_bal(MCNumber.ZERO);
	}

	/**
	 * 売掛消込実績リストから請求明細消込実績リストを取得<br />
	 * 
	 * 売掛消込実績リストから請求明細消込実績リストを取得する
	 * 
	 * @param actL 売掛消込実績リスト
	 * @return 請求明細消込実績リスト
	 */
	protected MCList<MST_BILL_D_APPL_ACT_R> getApplActL(MCList<MST_AR_APPL_ACT_R> actL) {
		MCList<MST_BILL_D_APPL_ACT_R> billDApplActL = MCList.create(MST_BILL_D_APPL_ACT_R.class);
		MST_BILL_D_APPL_ACT_R t = MST_BILL_D_APPL_ACT_R.create("T");
		MST_BILL_D_R  t2 = MST_BILL_D_R.create("T2");
		MST_BILL_R t3 = MST_BILL_R.create("T3");

		MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
		billDApplActL.addStringColumn("bcst_cd");
		billDApplActL.addStringColumn("bill_dpt_cd");
		billDApplActL.addStringColumn("trd_cur_cd");
		billDApplActL.addStringColumn("iv_no");
		billDApplActL.addStringColumn("wrk_no");
		billDApplActL.addDateColumn("bill_cl_dt");
		
		l_bldr.setSelect(t.rcv_act_d_no, t.bill_d_no, t2.bill_acst_no, 
						t.appl_amt, 
						t3.bcst_cd, t3.bill_dpt_cd, t3.trd_cur_cd, t3.iv_no, t3.wrk_no, t3.bill_cl_dt);
		l_bldr.addInnerJoin(t2, t2.bill_d_no.eq(t.bill_d_no));
		l_bldr.addInnerJoin(t3, t3.bill_mng_no.eq(t2.bill_mng_no));
		l_bldr.setWhere(t.rcv_act_d_no.eq(bind("rcv_act_d_no")));
		dbSelect("MSBGL5120_MST_BILL_D_APPL_ACT_S07", billDApplActL, l_bldr, actL);

		return billDApplActL;
	}
	
	/**
	 * 売掛消込実績に対して割り当て可能な売掛消込予定リストを取得<br />
	 * 
	 * 売掛消込実績に対して割り当て可能な売掛消込予定リストを取得する
	 * 
	 * @param actR 売掛消込実績
	 * @param schdL 売掛消込予定リスト
	 * @param billDApplActL 請求明細消込実績リスト
	 * @param idx
	 * @return 売掛消込予定リスト
	 */
	protected MCList<MST_AR_APPL_SCHD_R> getApplTgtL(
		MST_AR_APPL_ACT_R actR, MCList<MST_AR_APPL_SCHD_R> schdL,
		MCList<MST_BILL_D_APPL_ACT_R> billDApplActL, MCIndexKey idx) {
		
		MCList<MST_BILL_D_APPL_ACT_R>
			ls = billDApplActL
				.subList(idx, actR.rcv_act_d_no())
				.distinctNE(MST_BILL_D_R.$bill_acst_no);
		if (ls.isEmpty()) {
			// 明細消込なし⇒紐付け可
			return schdL;
		}
		else if (ls.size() == 1) {
			// 明細消込が1件、かつ予定と実績で売掛先別請求ＮＯが同じ⇒紐付け可
			MST_BILL_D_APPL_ACT_R billDApplActR = ls.get(0);
			return schdL.subList(r ->
				isSame(r.bill_acst_no(), billDApplActR.getStringNE(MST_BILL_D_R.$bill_acst_no))
			);
		}
		
		// 売掛消込実績が複数の請求にまたがる場合は締不可
		MST_BILL_D_APPL_ACT_R billDApplActR = ls.get(0);
		throw new MCAppException(
			MSBGL0132,
			billDApplActR.getStringNE("bcst_cd"),
			billDApplActR.getStringNE("bill_dpt_cd"),
			billDApplActR.getStringNE("trd_cur_cd"),
			billDApplActR.getStringNE("iv_no"),
			billDApplActR.getStringNE("wrk_no"),
			toYMDString(billDApplActR.getDateNE("bill_cl_dt")),
			actR.rcv_act_d_no()
		);
	}

	/**
	 * 源泉税、相殺（借方）の実績付け替え用の売掛消込予定を作成する
	 * 
	 * @param actR 売掛消込実績
	 * @param schdR 売掛消込予定（他の入金方法）
	 * @param arApplSchdNo 新規発番した売掛消込予定ＮＯ
	 */
	protected void insArApplSchd(MST_AR_APPL_ACT_R actR, MST_AR_APPL_SCHD_R schdR, String arApplSchdNo) {
		MST_AR_APPL_SCHD_R insR = MST_AR_APPL_SCHD_R.create();
		insR.ar_appl_schd_no(arApplSchdNo);
		insR.bill_acst_no(schdR.bill_acst_no());
		insR.iv_no(schdR.iv_no());
		insR.ar_typ(schdR.ar_typ());
		insR.rcv_mtd_cd(actR.rcv_mtd_cd());
		insR.rcv_schd_dt(actR.rcv_act_dt());
		insR.appl_tgt_amt(MCNumber.ZERO);
		insR.appl_amt(MCNumber.ZERO);
		insR.not_appl_bal(MCNumber.ZERO);
		MCQueryApiBuilder insR_bldr = MCQueryApiBuilder.create(MST_AR_APPL_SCHD_R.create("T"));
		dbInsertEx("MSBGL5120_MST_AR_APPL_SCHD_I02", insR, insR_bldr);
	}

	/**
	 * 売掛消込予定の更新<br />
	 * 
	 * 売掛消込実績をもとに売掛消込予定の消込額、未消込残高を更新する
	 * 
	 * @param r 売掛消込実績
	 */
	protected void updArApplSchdForArApplAct(MST_AR_APPL_ACT_R r) {
		// 売掛消込予定の消込額、未消込残高を更新する
		MST_AR_APPL_SCHD_R t = MST_AR_APPL_SCHD_R.create("T");
		MCQueryApiBuilder applAct_bldr = MCQueryApiBuilder.create(t);
		applAct_bldr.setWhere(t.ar_appl_schd_no.eq(bindEx("ar_appl_schd_no")));
		applAct_bldr.setSetVL(t.appl_amt, t.appl_amt.add(bindEx("appl_amt")));
		applAct_bldr.addSetVL(t.not_appl_bal, t.not_appl_bal.subtract(bindEx("appl_amt")));
		dbUpdate("MSBGL5120_MST_AR_APPL_SCHD_U03", r, applAct_bldr);
	}

	/**
	 * 売掛消込予定の調整処理<br />
	 * 
	 * 売掛先別請求の対象額と売掛消込予定の消込対象額の合計値で差分がある場合、
	 * その差分を売掛消込予定に含めて更新をすることで調整を行う。
	 * 売掛消込予定の入金方法ＣＤの昇順で最初のレコードに差分を含める。
	 * 
	 * @param billR 請求ヘッダ
	 */
	protected void adjustArApplSchd(MST_BILL_R billR) {

		// 入金予定情報を取得
		MCList<MST_RCV_SCHD_R> rcvSchdL = getRcvSchdL(billR.bill_mng_no());
		// 売掛消込予定を取得
		MCList<MST_AR_APPL_SCHD_R> arApplSchdL = getArApplSchdL(
				billR.bill_mng_no());
		// 入金方法、入金予定日で集約
		MCList<MST_AR_APPL_SCHD_R> groupL =  arApplSchdL.groupBy(
				getArApplSchdGroupByPolicy());

		MCIndexKey idxKey = groupL.createIndex(
				MST_AR_APPL_SCHD_R.$rcv_mtd_cd, MST_AR_APPL_SCHD_R.$rcv_schd_dt);
		for (MST_RCV_SCHD_R rcvSchdR : rcvSchdL.groupBy(getRcvSchdGroupByPolicy())) {
			// 入金予定の入金方法、入金予定日毎に、売掛消込予定の消込対象額を比較する
			MST_AR_APPL_SCHD_R arApplSchdR = groupL.getFirst(
					idxKey, rcvSchdR.rcv_mtd_cd(), rcvSchdR.rcv_schd_dt());
			if (isNull(arApplSchdR)) {
				continue;
			}
			// 調整額を保持
			MCNumber adjustAmt = rcvSchdR.rcv_schd_amt().subtract(arApplSchdR.appl_tgt_amt());
			if (!adjustAmt.isZero()) {
				// インボイスＮＯ、債権区分、入金方法、入金予定日順に並び替えた最初のレコードを更新する
				MST_AR_APPL_SCHD_R updR = arApplSchdL.get(0);
				updR.appl_tgt_amt(updR.appl_tgt_amt().add(adjustAmt));
				
				MCQueryApiBuilder applSchd_bldr = MCQueryApiBuilder.create(MST_AR_APPL_SCHD_R.create("T"));
				dbUpdateKey("MSBGL5120_MST_AR_APPL_SCHD_U04", updR, applSchd_bldr);
			}
		}
	}

	protected MCGroupByPolicy getRcvSchdGroupByPolicy() {
		MCGroupByPolicy gp = new MCGroupByPolicy(
				MST_RCV_SCHD_R.$rcv_mtd_cd, MST_RCV_SCHD_R.$rcv_schd_dt);
		gp.sum(MST_RCV_SCHD_R.$rcv_schd_amt);
		return gp;
	}

	protected MCGroupByPolicy getArApplSchdGroupByPolicy() {
		MCGroupByPolicy gp = new MCGroupByPolicy(
				MST_AR_APPL_SCHD_R.$rcv_mtd_cd, MST_AR_APPL_SCHD_R.$rcv_schd_dt);
		gp.sum(MST_AR_APPL_SCHD_R.$appl_tgt_amt);
		return gp;
	}

	/**
	 * 売掛消込予定取得
	 * 
	 * 請求管理ＮＯをもとに売掛込予定を検索して返却する
	 * 
	 * @param billMngNo 請求管理ＮＯ
	 * 
	 * @return 売掛消込予定情報
	 */
	protected MCList<MST_AR_APPL_SCHD_R> getArApplSchdL(String billMngNo) {
		MCList<MST_AR_APPL_SCHD_R> l = MCList.create(MST_AR_APPL_SCHD_R.class);
		MST_AR_APPL_SCHD_R applSchd = MST_AR_APPL_SCHD_R.create("T2");
		MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(applSchd);
		MST_BILL_ACST_R acst = MST_BILL_ACST_R.create("T");
		l_bldr.addInnerJoin(acst, bracket(applSchd.bill_acst_no.eq(acst.bill_acst_no)));
		l_bldr.setWhere(acst.bill_mng_no.eq(bind("1")), billMngNo);
		l_bldr.setOrderByAsc(applSchd.iv_no, applSchd.ar_typ, applSchd.rcv_mtd_cd, applSchd.rcv_schd_dt, applSchd.ar_appl_schd_no);
		dbSelect("MSBGL5120_MST_AR_APPL_SCHD_S02", l, l_bldr);
		return l;
	}

	/**
	 * 入金予定情報取得<br />
	 * 
	 * 請求管理ＮＯをもとに入金予定情報を検索して返却する
	 * 
	 * @param billMngNo 請求管理ＮＯ
	 * 
	 * @return 入金予定情報
	 */
	public static MCList<MST_RCV_SCHD_R> getRcvSchdL(String billMngNo) {
		return object(CLAZZ)._getRcvSchdL(billMngNo);
	}
	protected MCList<MST_RCV_SCHD_R> _getRcvSchdL(String billMngNo) {
		MCList<MST_RCV_SCHD_R> l = MCList.create(MST_RCV_SCHD_R.class);
		MST_RCV_SCHD_R t = MST_RCV_SCHD_R.create("T");
		MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
		l_bldr.setWhere(t.bill_mng_no.eq(bind("1")), billMngNo);
		dbSelect("MSBGL5120_MST_RCV_SCHD_S01", l, l_bldr);
		return l;
	}

	/**
	 * 請求額取得<br />
	 * 請求額を計算して返す。
	 * 
	 * @param info 計算元の情報を持ったMCRow。(sls_amt、sret_amt、dscnt_amt、ctax_amt、
	 * 			cash_amt、note_amt、xfr_amt、setoff_amt、sw_amtカラムを持っているという前提)
	 * 
	 * @return 請求額
	 */
	public static MCNumber getBillAmt(MCRow info) {
		return object(CLAZZ)._getBillAmt(info);
	}

	protected MCNumber _getBillAmt(MCRow info) {
		return getSlsAmt(info).add(getRcvAmt(info));
	}
	/**
	 * 請求額取得（請求用）
	 * ※相殺額の扱いが異なる。相殺額は入金に含めず売掛から差し引く
	 */
	public static MCNumber getBillAmt4Bill(MCRow info) {
		return object(CLAZZ)._getBillAmt4Bill(info);
	}
	protected MCNumber _getBillAmt4Bill(MCRow info) {
		return getSlsAmt(info).add(getRcvAmt4Bill(info).add(getSetoffAmt(info)));
	}

	/**
	 * 入金額取得<br />
	 * 入金額を計算して返す。
	 * 
	 * @param info 計算元の情報を持ったMCRow。(cash_amt、note_amt、xfr_amt、
	 * 			setoff_amt、sw_amtカラムを持っているという前提)
	 * 
	 * @return 入金額
	 */
	public static MCNumber getRcvAmt(MCRow info) {
		return object(CLAZZ)._getRcvAmt(info);
	}

	protected MCNumber _getRcvAmt(MCRow info) {
		return info.getNumber("cash_amt").add(info.getNumber("note_amt"))
			.add(info.getNumber("xfr_amt")).add(info.getNumber("setoff_amt"))
			.add(info.getNumber("sw_amt"));
	}
	/**
	 * 入金額取得（請求用）
	 * ※相殺額の扱いが異なる。相殺額は入金に含めず売掛から差し引く
	 */
	public static MCNumber getRcvAmt4Bill(MCRow info) {
		return object(CLAZZ)._getRcvAmt4Bill(info);
	}
	protected MCNumber _getRcvAmt4Bill(MCRow info) {
		return info.getNumber("cash_amt").add(info.getNumber("note_amt"))
			.add(info.getNumber("xfr_amt"))
			.add(info.getNumber("sw_amt"));
	}

	/**
	 * 今回売上金額取得<br />
	 * 今回売上金額を計算して返す。
	 * 
	 * @param info 計算元の情報を持ったMCRow。(sls_amt、sret_amt、dscnt_amt、ctax_amt
	 * 			カラムを持っているという前提)
	 * 
	 * @return 今回売上金額
	 */
	public static MCNumber getSlsAmt(MCRow info) {
		return object(CLAZZ)._getSlsAmt(info);
	}

	protected MCNumber _getSlsAmt(MCRow info) {
		return info.getNumber("sls_amt").add(info.getNumber("ret_amt"))
			.add(info.getNumber("dscnt_amt")).add(info.getNumber("tax_amt"))
			.add(info.getNumber("sw_to_amt"));
	}
	/**
	 * 相殺額（税込み）を取得<br />
	 */
	public static MCNumber getSetoffAmt(MCRow info) {
		return object(CLAZZ)._getSetoffAmt(info);
	}
	protected MCNumber _getSetoffAmt(MCRow info) {
		return info.getNumber("setoff_amt").add(info.getNumber("setoff_tax_amt"));
	}

	/**
	 * 基準通貨入金額取得<br />
	 * 基準通貨入金額を計算して返す。
	 * 
	 * @param info 計算元の情報を持ったMCRow。(base_cur_cash_amt、base_cur_note_amt、
	 * 			base_cur_xfr_amt、setoff_amt、sw_amtカラムを持っているという前提)
	 * 
	 * @return 基準通貨入金額
	 */
	public static MCNumber getBaseCurRcvAmt(MCRow info) {
		return object(CLAZZ)._getBaseCurRcvAmt(info);
	}

	protected MCNumber _getBaseCurRcvAmt(MCRow info) {
		return info.getNumber("base_cur_cash_amt").add(info.getNumber("base_cur_note_amt"))
			.add(info.getNumber("base_cur_xfr_amt")).add(info.getNumber("base_cur_setoff_amt"))
			.add(info.getNumber("base_cur_sw_amt"));
	}

	/**
	 * 基準通貨請求額取得<br />
	 * 基準通貨請求額を計算して返す。
	 * 
	 * @param info 計算元の情報を持ったMCRow。(base_cur_sls_amt、base_cur_sret_amt、
	 * 			base_cur_dscnt_amt、base_cur_ctax_amt、base_cur_cash_amt、
	 * 			base_cur_note_amt、base_cur_xfr_amt、base_cur_setoff_amt、
	 * 			base_cur_sw_amtカラムを持っているという前提)
	 * 
	 * @return 基準通貨請求額
	 */
	public static MCNumber getBaseCurBillAmt(MCRow info) {
		return object(CLAZZ)._getBaseCurBillAmt(info);
	}

	protected MCNumber _getBaseCurBillAmt(MCRow info) {
		return info.getNumber("base_cur_sls_amt").add(info.getNumber("base_cur_ret_amt"))
			.add(info.getNumber("base_cur_dscnt_amt")).add(info.getNumber("base_cur_tax_amt"))
			.add(info.getNumber("base_cur_sw_to_amt")).add(getBaseCurRcvAmt(info));
	}

	/**
	 * 債権共通サービス内で計算するために値引品目ＦＬＧを考慮した符号反転用の数値を取得します。
	 *
	 * @param trdPtnTyp 取引パタン区分
	 * @param dscntItmFlg 値引品目ＦＬＧ
	 * @return 1（符号反転しない場合） 、-1（符号反転する場合）
	 */
	public static MCNumber getDscntItmPm(String trdPtnTyp, boolean dscntItmFlg) {
		return object(CLAZZ)._getDscntItmPm(trdPtnTyp, dscntItmFlg);
	}

	protected MCNumber _getDscntItmPm(String trdPtnTyp, boolean dscntItmFlg) {
		if (isDscntItmUpriSignRvrsTrd(trdPtnTyp) && dscntItmFlg) {
			return new MCNumber(-1);
		}
		return MCNumber.ONE;
	}

	/**
	 * 値引品目に対する符号を反転する取引かを判定します。
	 * 
	 * @param trdPtnTyp
	 * @return
	 */
	protected boolean isDscntItmUpriSignRvrsTrd (String trdPtnTyp) {
		
		// 値引系取引は含めない。値引取引かつ値引品目はマイナスで表示するため。
		if (MAC_TRD_PTN_TYP.isSLS(trdPtnTyp) 
		 || MAC_TRD_PTN_TYP.isSLS_CNSGN(trdPtnTyp) 
		 || MAC_TRD_PTN_TYP.isSLS_RTN(trdPtnTyp) 
		 ) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * 取引区分と値引品目
	 * @param dtlL
	 */
	public static void editUpForDscntItm(MCList<?> dtlL) {
		object(CLAZZ)._editUpForDscntItm(dtlL);
	}
	protected void _editUpForDscntItm(MCList<?> dtlL) {
		// 品目マスタより値引品ＦＬＧを取得する
		MCList<MAM_ITM_R> itmL = getItmL(dtlL);
		MCIndexKey idxkey = itmL.createIndex(_itmKey);

		for (MCRow dtlR : dtlL) {
			MAM_ITM_R itmR = itmL.getFirst(idxkey, dtlR.getString("itm_cd"), dtlR.getString("itm_sub1"),
					dtlR.getString("itm_sub2"), dtlR.getString("itm_sub3"));
			if (isNull(itmR)) {
				continue;
			}
			// 値引品目を考慮した符号反転
			String trdPtnTyp = dtlR.getString("trd_ptn_typ");
			dtlR.setNumber("trd_cur_upri", (dtlR.getNumber("trd_cur_upri").multiply(
					MSBGL_ArUtil.getDscntItmPm(trdPtnTyp, itmR.dscnt_itm_flg()))));
			dtlR.setNumber("trd_cur_amt", (dtlR.getNumber("trd_cur_amt").multiply(
					MSBGL_ArUtil.getDscntItmPm(trdPtnTyp, itmR.dscnt_itm_flg()))));
			dtlR.setNumber("trd_cur_amt1", (dtlR.getNumber("trd_cur_amt1").multiply(
					MSBGL_ArUtil.getDscntItmPm(trdPtnTyp, itmR.dscnt_itm_flg()))));
			dtlR.setNumber("trd_cur_tax_amt", (dtlR.getNumber("trd_cur_tax_amt").multiply(
					MSBGL_ArUtil.getDscntItmPm(trdPtnTyp, itmR.dscnt_itm_flg()))));
			dtlR.setNumber("base_cur_upri", (dtlR.getNumber("base_cur_upri").multiply(
					MSBGL_ArUtil.getDscntItmPm(trdPtnTyp, itmR.dscnt_itm_flg()))));
			dtlR.setNumber("base_cur_amt", (dtlR.getNumber("base_cur_amt").multiply(
					MSBGL_ArUtil.getDscntItmPm(trdPtnTyp, itmR.dscnt_itm_flg()))));
			dtlR.setNumber("base_cur_amt1", (dtlR.getNumber("base_cur_amt1").multiply(
					MSBGL_ArUtil.getDscntItmPm(trdPtnTyp, itmR.dscnt_itm_flg()))));
			dtlR.setNumber("base_cur_tax_amt", (dtlR.getNumber("base_cur_tax_amt").multiply(
					MSBGL_ArUtil.getDscntItmPm(trdPtnTyp, itmR.dscnt_itm_flg()))));
			dtlR.setNumber("wtax_amt", (dtlR.getNumber("wtax_amt").multiply(
					MSBGL_ArUtil.getDscntItmPm(trdPtnTyp, itmR.dscnt_itm_flg()))));
		}
	}

	protected String[] _itmKey = {
			MAM_ITM_R.$itm_cd,
			MAM_ITM_R.$itm_sub1,
			MAM_ITM_R.$itm_sub2,
			MAM_ITM_R.$itm_sub3};

	protected MCList<MAM_ITM_R> getItmL(MCList<?> dtlL) {
		MCList<?> itmGroupL = dtlL.groupBy(_itmKey);
		MCList<MAM_ITM_R> insItmL = MCList.create(MAM_ITM_R.class);
		MCList<MAM_ITM_R> itmL = MCList.create(MAM_ITM_R.class);
		if (_itm == null) {
			_itm = new FXUCL_Cache<MAM_ITM_R>();
			_itm.setFixMaxCacheSize(-1);
		}
		for (MCRow itmGroupR : itmGroupL) {
			if (itmGroupR.isEmpty()) {
				continue;
			}
			String itmCd = itmGroupR.getStringNE("itm_cd");
			String itmSub1 = itmGroupR.getStringNE("itm_sub1");
			String itmSub2 = itmGroupR.getStringNE("itm_sub2");
			String itmSub3 = itmGroupR.getStringNE("itm_sub3");
			MAM_ITM_R itmR = _itm.getCache(itmCd, itmSub1, itmSub2, itmSub3);
			if (isNull(itmR)) {
				//未キャッシュの品目をinsItmLに集める
				MAM_ITM_R insItmR = MAM_ITM_R.create();
				insItmR.itm_cd(itmCd);
				insItmR.itm_sub1(itmSub1);
				insItmR.itm_sub2(itmSub2);
				insItmR.itm_sub3(itmSub3);
				insItmL.add(insItmR);
			} else {
				itmL.add(itmR);
			}
		}
		if (!insItmL.isEmpty()) {
			itmL.addAll(getItm(insItmL));
		}
		return itmL;
	}

	protected FXUCL_Cache<MAM_ITM_R> _itm = null;
	
	protected static MCList<MAM_ITM_R> getItm(MCList<MAM_ITM_R> insItmL) {
		return object(CLAZZ)._getItm(insItmL);
	}

	protected MCList<MAM_ITM_R> _getItm(MCList<MAM_ITM_R> insItmL) {
		MCList<MAM_ITM_R> dbc = MCList.create(MAM_ITM_R.class);
		MAM_ITM_R t = MAM_ITM_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.itm_cd);
		dbc_bldr.addSelect(t.itm_sub1);
		dbc_bldr.addSelect(t.itm_sub2);
		dbc_bldr.addSelect(t.itm_sub3);
		dbc_bldr.addSelect(t.dscnt_itm_flg);
		dbSelectKey("MSBGL5120_MAM_ITM_S01", dbc, dbc_bldr, insItmL);
		
		setItm(dbc);
		return dbc;
	}

	/**
	 * 品目マスタのＤＢコンテナをキャッシュに設定する
	 * 
	 * @param dbcL DBコンテナ
	 */
	public static void setItm(MCList<MAM_ITM_R> dbcL) {
		for (MAM_ITM_R dbc : dbcL) {
			object(CLAZZ)._setItm(dbc);
		}
	}

	/**
	 * 品目マスタのＤＢコンテナをキャッシュに設定する
	 * 
	 * @param dbc DBコンテナ
	 */
	public static void setItm(MAM_ITM_R dbc) {
		object(CLAZZ)._setItm(dbc);
	}

	protected void _setItm(MAM_ITM_R dbc) {
		String[] keys = new String[] {
				dbc.itm_cd(), 
				dbc.itm_sub1(),
				dbc.itm_sub2(),
				dbc.itm_sub3()
				};
		_itm.putCache(keys, dbc);
	}

	/**
	 * 品目マスタのキャッシュを初期化する
	 */
	public static void initItm() {
		object(CLAZZ)._initItm();
	}

	protected void _initItm() {
		_itm = new FXUCL_Cache<MAM_ITM_R>();
		_itm.setFixMaxCacheSize(-1);
	}
	
	public static MCList<MST_BILL_D_R> srchSwBilld(String acstCd, String arDptCd, String trdCurCd, String ivNo, String wrkNo, String arTyp, boolean includeCompl) {
		return object(CLAZZ)._srchSwBilld(acstCd, arDptCd, trdCurCd, ivNo, wrkNo, arTyp, includeCompl);
	}
	protected MCList<MST_BILL_D_R> _srchSwBilld(String acstCd, String arDptCd, String trdCurCd, String ivNo, String wrkNo, String arTyp, boolean includeCompl) {
		MCList<MST_BILL_D_R> swBillDL = MCList.create(MST_BILL_D_R.class);
		MCRow bindR = MCRow.create();
		bindR.addStringColumn(MST_AR_XRATE_REV_HIS_R.$acst_cd, acstCd);
		bindR.addStringColumn(MST_AR_XRATE_REV_HIS_R.$ar_dpt_cd, arDptCd);
		bindR.addStringColumn(MST_AR_XRATE_REV_HIS_R.$trd_cur_cd, trdCurCd);
		bindR.addStringColumn(MST_AR_XRATE_REV_HIS_R.$iv_no, ivNo);
		bindR.addStringColumn(MST_AR_XRATE_REV_HIS_R.$wrk_no, wrkNo);
		bindR.addStringColumn(MST_AR_XRATE_REV_HIS_R.$ar_typ, arTyp);
		// 未消込残高が「0」以下の請求明細を検索対象に含めるかどうか
		bindR.addBooleanColumn("include_compl_flg", includeCompl);
		
		executeQuery(swBillDL, MSBGL5120_MST_BILL_D_S01(), bindR);

		return swBillDL;
	}

	public static MST_AR_XRATE_REV_HIS_R srchXrateHis(String acstCd, String arDptCd, String trdCurCd, String ivNo, String wrkNo, String arTyp) {
		return object(CLAZZ)._srchXrateHis(acstCd, arDptCd, trdCurCd, ivNo, wrkNo, arTyp);
	}



	protected MST_AR_XRATE_REV_HIS_R _srchXrateHis(String acstCd, String arDptCd, String trdCurCd, String ivNo, String wrkNo,
			String arTyp) {
		MCRow bindR = MCRow.create();
		bindR.addStringColumn(MST_AR_XRATE_REV_HIS_R.$acst_cd, acstCd);
		bindR.addStringColumn(MST_AR_XRATE_REV_HIS_R.$ar_dpt_cd, arDptCd);
		bindR.addStringColumn(MST_AR_XRATE_REV_HIS_R.$trd_cur_cd, trdCurCd);
		bindR.addStringColumn(MST_AR_XRATE_REV_HIS_R.$iv_no, ivNo);
		bindR.addStringColumn(MST_AR_XRATE_REV_HIS_R.$wrk_no, wrkNo);
		bindR.addStringColumn(MST_AR_XRATE_REV_HIS_R.$ar_typ, arTyp);

		MST_AR_XRATE_REV_HIS_R xrateR = MST_AR_XRATE_REV_HIS_R.create();
		MST_AR_XRATE_REV_HIS_R t = MST_AR_XRATE_REV_HIS_R.create("T");
		MCQueryApiBuilder xrateR_bldr = MCQueryApiBuilder.create(t);
		MST_AR_XRATE_REV_HIS_R S1TB1 = MST_AR_XRATE_REV_HIS_R.create("TB1");
		xrateR_bldr.setSelect(t.new_xrate);
		xrateR_bldr.addSelect(t.ar_xrate_rev_his_no);
		xrateR_bldr.addSelect(t.ac_ym);
		xrateR_bldr.addWhereWithAnd(t.ar_xrate_rev_his_no.eq(subQuery()
				.select(max(S1TB1.ar_xrate_rev_his_no))
				.from(S1TB1)
				.where(value(0).eq(value(0))
						.and(S1TB1.acst_cd.eq(bind("acst_cd")))
						.and(S1TB1.ar_dpt_cd.eq(bind("ar_dpt_cd")))
						.and(S1TB1.trd_cur_cd.eq(bind("trd_cur_cd")))
						.and(S1TB1.iv_no.eq(bind("iv_no")))
						.and(S1TB1.wrk_no.eq(bind("wrk_no"))
								.or(S1TB1.wrk_no.isNull())
								.and(bind("wrk_no").isNull()))
						.and(S1TB1.ar_typ.eq(bind("ar_typ"))))));
		dbSelect("MSBGL5120_MST_AR_XRATE_REV_HIS_S01", xrateR, xrateR_bldr, bindR);
		return xrateR;
	}

	public static MCNumber srchSlsXrate(String acstCd, String arDptCd, String trdCurCd, String ivNo, String wrkNo, String arTyp, MCDate acYmTo) {
		return object(CLAZZ)._srchSlsXrate(acstCd, arDptCd, trdCurCd, ivNo, wrkNo, arTyp, acYmTo);
	}

	protected MCNumber _srchSlsXrate(String acstCd, String arDptCd, String trdCurCd, String ivNo, String wrkNo, String arTyp, MCDate acYmTo) {
		MCList<MST_BILL_D_R> billDL = MCList.create(MST_BILL_D_R.class);
		MCRow bindR = MCRow.create();
		bindR.addStringColumn(MST_AR_XRATE_REV_HIS_R.$acst_cd, acstCd);
		bindR.addStringColumn(MST_AR_XRATE_REV_HIS_R.$ar_dpt_cd, arDptCd);
		bindR.addStringColumn(MST_AR_XRATE_REV_HIS_R.$trd_cur_cd, trdCurCd);
		bindR.addStringColumn(MST_AR_XRATE_REV_HIS_R.$iv_no, ivNo);
		bindR.addStringColumn(MST_AR_XRATE_REV_HIS_R.$wrk_no, wrkNo);
		bindR.addStringColumn(MST_AR_XRATE_REV_HIS_R.$ar_typ, arTyp);
		bindR.addDateColumn(MST_AR_XRATE_REV_HIS_R.$ac_ym, acYmTo);
		
		// 新規のレコードを取得
		executeQuery(billDL, MSBGL5120_MST_BILL_D_S02(), bindR);
		MST_BILL_D_R billDR = billDL.isEmpty() ? MST_BILL_D_R.create() : billDL.get(0);

		// 新規のレコード がなければ、請求明細ＮＯが最も大きいレコードの為替レートを採用
		if (isNull(billDR.xrate())) {
			executeQuery(billDR, MSBGL5120_MST_BILL_D_S03(), bindR);
		}
		return billDR.xrate();
	}

	public static MCNumber getXrate(String acstCd, String arDptCd, String trdCurCd, String ivNo, String wrkNo, String arTyp, MCDate acYmTo) {
		return object(CLAZZ)._getXrate(acstCd, arDptCd, trdCurCd, ivNo, wrkNo, arTyp, acYmTo);
	}
	protected MCNumber _getXrate(String acstCd, String arDptCd, String trdCurCd, String ivNo, String wrkNo, String arTyp, MCDate acYmTo) {

		MCList<MST_BILL_D_R> swBillDL = MCList.create(MST_BILL_D_R.class);
		swBillDL = MSBGL_ArUtil.srchSwBilld(acstCd, arDptCd, trdCurCd, ivNo, wrkNo, arTyp, false);
		if (swBillDL.isEmpty()) {
			swBillDL = MSBGL_ArUtil.srchSwBilld(acstCd, arDptCd, trdCurCd, ivNo, wrkNo, arTyp, true);
		}

		MST_AR_XRATE_REV_HIS_R hisXrateR = MSBGL_ArUtil.srchXrateHis(acstCd, arDptCd, trdCurCd, ivNo, wrkNo, arTyp);

		if (!isNull(hisXrateR.new_xrate())) {
			// 請求残高振替（＋）の請求明細が存在しない場合は、評価替の為替レートを返す。
			if (swBillDL.isEmpty()) {
				return hisXrateR.new_xrate();
			}
			// 請求残高振替（＋）の請求明細の計上年月 ＜＝ 為替レート評価替の計上年月
			// の場合は、請求残高振替（＋）の請求明細に対して為替レート評価替が行われているので、評価替の為替レートを返す。
			if (((MCDate) swBillDL.max(MST_BILL_D_R.$ac_ym)).lte(hisXrateR.ac_ym())) {
				return hisXrateR.new_xrate();
			}
		}

		// 処理対象年月に、請求残高振替（＋）の請求明細が複数ある場合は請求明細ＮＯが最大のレコードから為替レートを取得する。
		// ※上記の為替レートを最新の為替レートとみなして処理する
		if (!swBillDL.isEmpty()) {
			swBillDL.sort(SortType.DESC, MST_BILL_D_R.$bill_d_no);
			MST_BILL_D_R tgtSwBillD = swBillDL.get(0);
			if (!isNull(tgtSwBillD.xrate())) {
				return tgtSwBillD.xrate();
			}
		}

		MCNumber slsXrate = MSBGL_ArUtil.srchSlsXrate(acstCd, arDptCd, trdCurCd, ivNo, wrkNo, arTyp, acYmTo);

		return slsXrate;
	}
	//FMCB CUSTOM END
}