package mcframe.serverMSBH.MSBHL5120;

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
import mcframe.serverMSBH.MSBHL5010.*;
import mcframe.serverMSBH.MSBHL5070.*;
import mcframe.serverMSBH.MSBHL5110.*;
import mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBHL_ApXrateRevService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBHL_ApXrateRevService_MC extends MSBHL_ApXrateRevService_MC_A{
	//FMCB CUSTOM START

	/**
	 * XrateRev_Ins01オペレーション.<p>
	 *
	 * 為替レート評価替の結果を為替レート評価替履歴、為替差損益に登録する<br>
	 */
	public class XrateRev_Ins01 extends MSBHL_ApXrateRevService_MC_A.XrateRev_Ins01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			execMain(up0().tgt_ym(), up0().xrate_cd());
		}

		/**
		 * 為替レート評価替メイン処理<br />
		 * 
		 * @param tgtYm 対象年月
		 * @param xrateCd 為替レートＣＤ
		 */
		protected void execMain(MCDate tgtYm, String xrateCd) {

			if (isNull(tgtYm)) {
				throw new MCAppException(MSBGL0084);
			}

			if (isNull(xrateCd)) {
				// 為替レートＣＤが設定されていない場合は会社マスタの仕入為替レートＣＤを補完する
				xrateCd = getCo().purc_xrate_cd();
			}

			MCList<MST_MLY_AP_BAL_R> tgtL = getMlyApBal(tgtYm);

			MCList<MST_AP_EXC_GAIN_LOSS_R> apExcGainLossInsL =
					MCList.create(MST_AP_EXC_GAIN_LOSS_R.class);

			for (MST_MLY_AP_BAL_R tgtR : tgtL) {
				// 支払対象ではない債務区分は評価替対象にしない。
				if (!MAC_AP_TYP.is_pay(tgtR.ap_typ())) {
					continue;
				}
				MST_MLY_AP_BAL_R nextR = getNextMlyApBal(tgtR, tgtYm);

				MCNumber oldXrate = getOldXrate(tgtR, tgtYm);
				MCNumber newXrate = getNewXrate(tgtR, tgtYm, xrateCd);

				if (hasNoApData(oldXrate)) {
					continue;
				}

				MCNumber afterBaseCurEndBal =
					isSame(oldXrate, newXrate) ?
						tgtR.base_cur_end_bal() :
						convToBaseCur(
							tgtR.end_bal(), newXrate, getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ()
						);

				MCNumber excGainLoss = tgtR.base_cur_end_bal().subtract(afterBaseCurEndBal);

				String apXrateRevHisNo = getStrSeq(MSC_NUM_SYS_TYP.APXRATEREVHIS);

				// 当月残高に対する評価替えによる差損益
				apExcGainLossInsL.add(
						insApExcGainLoss(apXrateRevHisNo, excGainLoss));

				insApXrateRevHis(apXrateRevHisNo, tgtR, oldXrate, newXrate, null, xrateCd);

				updMlyApBal(tgtR, excGainLoss, afterBaseCurEndBal);

				// 翌月分を調整
				if (!isNull(nextR)) {
					nextR.base_cur_init_bal(afterBaseCurEndBal);
					nextR.base_cur_end_bal(getBaseCurEndBal(nextR));
					afterBaseCurEndBal = nextR.base_cur_end_bal();
	
					apExcGainLossInsL.addAll(
							excGainLossAdjust(nextR, oldXrate, newXrate, apXrateRevHisNo));
				}
			}

			// 支払実績ＩＦ作成サービス
			execPayActIfCrtService(apExcGainLossInsL);
		}

		protected boolean hasNoApData(MCNumber oldXrate) {
			return isNull(oldXrate);
		}

		/**
		 * 支払額判定<br />
		 * 対象の月次買掛残高情報に支払額が設定されているかどうか判定する<br>
		 * いずれかの支払額が設定されている場合、falseを返却<br>
		 * 支払額が設定されていない場合（全て0の場合）、trueを返却
		 * 
		 * @param nextR 月次買掛残高情報
		 * @return 判定結果
		 */
		protected boolean isPayAmt(MST_MLY_AP_BAL_R nextR) {
			return nextR.cash_amt().isZero() &&
					nextR.account_amt().isZero() &&
					nextR.note_amt().isZero() &&
					nextR.setoff_amt().isZero() &&
					nextR.sw_amt().isZero();
		}

		/**
		 * 変更前為替レート取得<br />
		 * 為替レート評価替履歴から最新の変更後為替レートを取得して<br>
		 * 今回の処理で利用する変更前為替レートとして返却する<br>
		 * 為替レート評価替履歴が存在しない場合、請求明細の為替レートを<br>
		 * 今回の処理で利用する変更前為替レートとして返却する
		 * 
		 * @param tgtR 対象年月の月次買掛残高情報
		 * @param tgtYm 対象年月
		 * @return 変更前為替レート
		 */
		protected MCNumber getOldXrate(MST_MLY_AP_BAL_R tgtR, MCDate tgtYm) {

			MST_AP_XRATE_REV_HIS_R xrateR = MST_AP_XRATE_REV_HIS_R.create();
			MST_AP_XRATE_REV_HIS_R t1 = MST_AP_XRATE_REV_HIS_R.create("T1");
			MST_AP_XRATE_REV_HIS_R S1TB1 = MST_AP_XRATE_REV_HIS_R.create("TB1");
			MCQueryApiBuilder xrateR_bldr = MCQueryApiBuilder.create(t1);
			xrateR_bldr.setSelect(t1.ac_ym, t1.new_xrate);
			xrateR_bldr.addWhereWithAnd(t1.ap_xrate_rev_his_no.eq(subQuery()
					.select(max(S1TB1.ap_xrate_rev_his_no)).from(S1TB1)
					.where(value(0).eq(value(0))
							.and(S1TB1.asppl_cd.eq(bind("asppl_cd")))
							.and(S1TB1.ap_dpt_cd.eq(bind("ap_dpt_cd")))
							.and(S1TB1.trd_cur_cd.eq(bind("trd_cur_cd")))
							.and(S1TB1.purc_act_no.eq(bind("purc_act_no")))
							.and(S1TB1.rcpt_iv_mng_no.eq(bind("rcpt_iv_mng_no")))
							.and(S1TB1.wrk_no.eq(bind("wrk_no")))
							.and(S1TB1.ap_typ.eq(bind("ap_typ"))))));
			dbSelect("MSBHL5120_MST_AP_XRATE_REV_HIS_S01", xrateR, xrateR_bldr, tgtR);

			MCList<MST_AP_D_R> apDL = MCList.create(MST_AP_D_R.class);
			MST_AP_D_R t2 = MST_AP_D_R.create("T2");
			MCQueryApiBuilder apDL_bldr = MCQueryApiBuilder.create(t2);
			apDL_bldr.setSelect(t2.ap_d_no, t2.ac_ym, t2.slip_sts_typ, t2.xrate, t2.sw_src_ap_appl_schd_no, t2.sw_src_ap_d_no);
			apDL_bldr.addWhereWithAnd(t2.asppl_cd.eq(bind("1")), tgtR.asppl_cd());
			apDL_bldr.addWhereWithAnd(t2.ap_dpt_cd.eq(bind("1")), tgtR.ap_dpt_cd());
			apDL_bldr.addWhereWithAnd(t2.trd_cur_cd.eq(bind("1")), tgtR.trd_cur_cd());
			apDL_bldr.addWhereWithAnd(t2.wrk_no.eq(bind("1")), tgtR.wrk_no());
			apDL_bldr.addWhereWithAnd(t2.ap_typ.eq(bind("1")), tgtR.ap_typ());
			if (isNullOrNullVal(tgtR.rcpt_iv_mng_no())) {
				apDL_bldr.addWhereWithAnd(t2.purc_act_no.eq(bind("1")), tgtR.purc_act_no());
			}
			else {
				apDL_bldr.addWhereWithAnd(t2.rcpt_iv_mng_no.eq(bind("1")), tgtR.rcpt_iv_mng_no());
			}
			apDL_bldr.addWhereWithAnd(t2.ac_ym.lte(bind("1")), tgtYm);
			apDL_bldr.addWhereWithAnd(t2.valid_flg.eq(value(true)));
			dbSelect("MSBHL5120_MST_AP_D_S01", apDL, apDL_bldr);

			MCRow row = MSBHL_ApUtil.getXRate(xrateR, apDL);
			return row.getNumber(MST_AP_D_R.$xrate);
		}

		/**
		 * 変更後為替レート取得<br />
		 * 対象年月の月末の為替レートを取得する
		 * 
		 * @param tgtR 対象年月の月次買掛残高情報
		 * @param tgtYm 対象年月
		 * @param xrateCd 為替レートＣＤ
		 * @return 対象年月末の為替レート
		 */
		protected MCNumber getNewXrate(MST_MLY_AP_BAL_R tgtR,
				MCDate tgtYm, String xrateCd) {

			MCDate baseDt = tgtYm.endOfMonth();

			MAM_CUR_XRATE_R xrateR = MAM_CUR_XRATE_R.create();
			MAM_CUR_XRATE_R t = MAM_CUR_XRATE_R.create("T");
			MCQueryApiBuilder xrateR_bldr = MCQueryApiBuilder.create(t);
			xrateR_bldr.addWhereWithAnd(t.fr_cur_cd.eq(bind("1")), tgtR.trd_cur_cd());
			xrateR_bldr.addWhereWithAnd(t.to_cur_cd.eq(bind("1")), getCo().base_cur_cd());
			xrateR_bldr.addWhereWithAnd(t.xrate_cd.eq(bind("1")), xrateCd);
			xrateR_bldr.addWhereWithAnd(t.st_dt.lte(bind("1")), baseDt);
			xrateR_bldr.addWhereWithAnd(t.end_dt.gte(bind("1")), baseDt);
			dbSelect("MSBHL5120_MAM_CUR_XRATE_S01", xrateR, xrateR_bldr);

			if (xrateR.isEmpty()) {
				throw new MCAppException(MAUCD0024, tgtR.trd_cur_cd(), getCo().base_cur_cd(), xrateCd, baseDt);
			}
			return xrateR.xrate();
		}

		/**
		 * 対象年月の月次買掛残高の更新<br />
		 * 対象年月の月次買掛残高を更新する<br>
		 * 以下の通り、更新項目を設定する<br>
		 * <li>為替差損益＝為替差損益＋今回発生した為替差損益</li>
		 * <li>累計為替差損益＝累計為替差損益＋今回発生した為替差損益</li>
		 * <li>基準通貨当月残高＝引数の基準通貨当月残高</li>
		 * 
		 * @param tgtR 対象年月の月次買掛残高情報
		 * @param excGainLoss 為替差損益
		 * @param afterBaseCurEndBal 基準通貨当月残高
		 */
		protected void updMlyApBal(MST_MLY_AP_BAL_R tgtR, MCNumber excGainLoss,
				MCNumber afterBaseCurEndBal) {
			MST_MLY_AP_BAL_R t = MST_MLY_AP_BAL_R.create("T");
			MCQueryApiBuilder tgtR_bldr = MCQueryApiBuilder.create(t);
			tgtR.exc_gain_loss(tgtR.exc_gain_loss().add(excGainLoss));
			tgtR.total_exc_gain_loss(tgtR.total_exc_gain_loss().add(excGainLoss));
			tgtR.base_cur_end_bal(afterBaseCurEndBal);
			dbUpdateKey("MSBHL5120_MST_MLY_AP_BAL_U01", tgtR, tgtR_bldr);
		}

		/**
		 * 為替差損益の調整<br />
		 * 翌月以降の支払データが存在する場合、為替差損益の調整分を登録して、<br>
		 * 月次買掛残高の情報を更新する
		 * 
		 * @param nextR 翌月の月次買掛残高情報
		 * @param bXrate 変更前為替レート
		 * @param aXrate 変更後為替レート
		 * @param apXrateRevHisNo 為替レート評価替履歴ＮＯ
		 * @return 債務為替差損益登録用リスト
		 */
		protected MCList<MST_AP_EXC_GAIN_LOSS_R> excGainLossAdjust(
				MST_MLY_AP_BAL_R nextR, MCNumber bXrate, MCNumber aXrate, String apXrateRevHisNo) {

			MCList<MST_AP_EXC_GAIN_LOSS_R> insL = MCList.create(MST_AP_EXC_GAIN_LOSS_R.class);

			// 対象月の翌月について為替差損益の調整額を為替差損益、累計為替差損益に反映する。
			if (isNull(nextR) || isPayAmt(nextR)) {
				return insL;
			}
			MCNumber excGainLossSum = MCNumber.ZERO;
			
			// 支払実績、支払実績明細を取得
			MCList<MST_PAY_ACT_D_R> payActL = getPayActD(nextR);

			for (MST_PAY_ACT_D_R payActDR : payActL) {
				// 為替差損益調整額を取得
				// (支払額*評価替後レート) ー (支払額*仕入時レート) ＝ 支払データの調整額
				MCNumber excGainLoss1 = convToBaseCur(
						payActDR.trd_cur_amt(), aXrate,
						getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ());
				MCNumber excGainLoss2 = convToBaseCur(
						payActDR.trd_cur_amt(), bXrate,
						getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ());
				MCNumber excGainLoss = excGainLoss1.subtract(excGainLoss2);

				if (!excGainLoss.isZero()) {
					insL.add(createApExcGainLoss(payActDR, excGainLoss, apXrateRevHisNo));
					excGainLossSum = excGainLossSum.add(excGainLoss);
				}
			}

			// 対象月の翌月の当月残高が0の場合、端数処理で発生した差額を調整する。
			if (nextR.end_bal().isZero() && !excGainLossSum.isZero()) {
				// 端数処理の調整額を求める
				// 月初残高－支払額－為替差損益－支払データの調整額＝端数処理の調整額
				MCNumber adjustAmt =
					nextR.base_cur_init_bal()
						.subtract(getBaseCurPayAmt(nextR))
						.subtract(nextR.exc_gain_loss())
						.subtract(excGainLossSum);
				// 端数処理の調整額を支払データの調整額に加算する
				insL.get(0).exc_gain_loss(insL.get(0).exc_gain_loss().add(adjustAmt));
			}

			if (!insL.isEmpty()) {
				MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_AP_EXC_GAIN_LOSS_R.create("T"));
				dbInsertEx("MSBHL5120_MST_AP_EXC_GAIN_LOSS_I01", insL, insL_bldr);
			}

			return insL;
		}

		/**
		 * 支払実績明細取得<br />
		 * 翌月以降の支払実績に対して、為替差損益の調整を行うため、<br>
		 * 対象の支払実績明細を取得する
		 * 
		 * @param nextR 翌月以降の月次買掛残高情報
		 * @return 支払実績明細
		 */
		protected MCList<MST_PAY_ACT_D_R> getPayActD(MST_MLY_AP_BAL_R nextR) {
			MCList<MST_PAY_ACT_D_R> payActDL = MCList.create(MST_PAY_ACT_D_R.class);
			MST_PAY_ACT_D_R t1 = MST_PAY_ACT_D_R.create("T1");
			MST_PAY_ACT_R t2 = MST_PAY_ACT_R.create("T2");
			MCQueryApiBuilder payActDL_bldr = MCQueryApiBuilder.create(t1);
			payActDL_bldr.setSelect(t1.pay_act_d_no, t1.pay_act_d_seq, t1.trd_cur_amt, t2.xrate);
			payActDL_bldr.addInnerJoin(t2, bracket(t1.pay_act_no.eq(t2.pay_act_no)
					.and(t1.pay_act_seq.eq(t2.pay_act_seq))));
			payActDL_bldr.addWhereWithAnd(
					t1.ap_sttl_typ.in(value(MAC_AP_STTL_TYP.ACNT.value()),
							value(MAC_AP_STTL_TYP.CASH.value()),
							value(MAC_AP_STTL_TYP.NOTE.value()),
							value(MAC_AP_STTL_TYP.SETOFF.value()),
							value(MAC_AP_STTL_TYP.APSW_OUT_CHK.value()),
							value(MAC_AP_STTL_TYP.APSW_IN_CHK.value()),
							value(MAC_AP_STTL_TYP.APSW_OUT_NOT_CHK.value()),
							value(MAC_AP_STTL_TYP.APSW_IN_NOT_CHK.value())));
			payActDL_bldr.addWhereWithAnd(t2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			payActDL_bldr.addWhereWithAnd(t2.ac_ym.eq(bind("1")), nextR.ac_ym());
			payActDL_bldr.addWhereWithAnd(t1.asppl_cd.eq(bind("1")), nextR.asppl_cd());
			payActDL_bldr.addWhereWithAnd(t1.ap_dpt_cd.eq(bind("1")), nextR.ap_dpt_cd());
			payActDL_bldr.addWhereWithAnd(t2.trd_cur_cd.eq(bind("1")), nextR.trd_cur_cd());
			payActDL_bldr.addWhereWithAnd(t1.purc_act_no.eq(bind("1")), nextR.purc_act_no());
			payActDL_bldr.addWhereWithAnd(t1.rcpt_iv_mng_no.eq(bind("1")), nextR.rcpt_iv_mng_no());
			payActDL_bldr.addWhereWithAnd(t1.wrk_no.eq(bind("1")), nextR.wrk_no());
			payActDL_bldr.addWhereWithAnd(t1.ap_typ.eq(bind("1")), nextR.ap_typ());
			payActDL_bldr.setLockTable(t2.pay_act_no);
			dbSelectForUpdate("MSBHL5120_MST_PAY_ACT_D_S01", payActDL, payActDL_bldr);

			return payActDL;
		}

		/**
		 * 為替差損益作成<br />
		 * 支払実績明細に紐づけて為替差損益を作成する
		 * 
		 * @param payActDR 支払実績明細情報
		 * @param excGainLoss 為替差損益調整額
		 * @param apXrateRevHisNo 債務為替レート評価替履歴ＮＯ
		 * @return 為替差損益情報
		 */
		protected MST_AP_EXC_GAIN_LOSS_R createApExcGainLoss(
				MST_PAY_ACT_D_R payActDR, MCNumber excGainLoss, String apXrateRevHisNo) {
			MST_AP_EXC_GAIN_LOSS_R insR = MST_AP_EXC_GAIN_LOSS_R.create();
			insR.pay_act_d_no(payActDR.pay_act_d_no());
			insR.pay_act_d_seq(payActDR.pay_act_d_seq());
			insR.ref_ap_xrate_rev_his_no(apXrateRevHisNo);
			insR.exc_gain_loss(excGainLoss);
			return insR;
		}
	}

	/**
	 * XrateRev_Del01オペレーション.<p>
	 *
	 * 為替レート評価替の取消処理を実行する<br>
	 */
	public class XrateRev_Del01 extends MSBHL_ApXrateRevService_MC_A.XrateRev_Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			execMain(up0().tgt_ym());
		}

		/**
		 * 為替レート評価替取消メイン処理<br />
		 * @param tgtYm 対象年月
		 */
		protected void execMain(MCDate tgtYm) {
			if (isNull(tgtYm)) {
				throw new MCAppException(MSBGL0084);
			}

			MCList<MST_MLY_AP_BAL_R> tgtL = getMlyApBal(tgtYm);

			MCList<MST_AP_EXC_GAIN_LOSS_R> apExcGainLossInsL =
					MCList.create(MST_AP_EXC_GAIN_LOSS_R.class);

			for (MST_MLY_AP_BAL_R tgtR : tgtL) {

				MST_AP_XRATE_REV_HIS_R apXrateRevHisR = getApXrateRevHis(tgtR);

				// 為替レート評価替履歴が存在しない場合は処理しない
				if (apXrateRevHisR.isEmpty()) {
					continue;
				}

				MCNumber newExcGainLoss = getExcGainLoss(apXrateRevHisR.ap_xrate_rev_his_no());

				String apXrateRevHisNo = getStrSeq(MSC_NUM_SYS_TYP.APXRATEREVHIS);

				apExcGainLossInsL.add(
						insApExcGainLoss(apXrateRevHisNo, newExcGainLoss));

				insApXrateRevHis(apXrateRevHisNo, tgtR, apXrateRevHisR.new_xrate(),
						apXrateRevHisR.old_xrate(), apXrateRevHisR.ac_dt(), apXrateRevHisR.xrate_cd());

				updMlyApBal(tgtR, newExcGainLoss);

				apExcGainLossInsL.addAll(
						excGainLossAdjust(apXrateRevHisNo, apXrateRevHisR.ap_xrate_rev_his_no()));
			}

			execPayActIfCrtService(apExcGainLossInsL);
		}

		/**
		 * 為替レート評価替履歴取得<br />
		 * 対象の月次買掛残高に紐づく最新の為替レート評価替履歴情報を取得する
		 * 
		 * @param tgtR 対象年月の月次買掛残高
		 * @return 最新の為替レート評価替履歴
		 */
		protected MST_AP_XRATE_REV_HIS_R getApXrateRevHis(MST_MLY_AP_BAL_R tgtR) {
			MST_AP_XRATE_REV_HIS_R apXrateRevHisR = MST_AP_XRATE_REV_HIS_R.create();
			MST_AP_XRATE_REV_HIS_R t = MST_AP_XRATE_REV_HIS_R.create("T");
			MST_AP_XRATE_REV_HIS_R S1TB1 = MST_AP_XRATE_REV_HIS_R.create("TB1");
			MCQueryApiBuilder apXrateRevHisR_bldr = MCQueryApiBuilder.create(t);
			apXrateRevHisR_bldr.addWhereWithAnd(t.ap_xrate_rev_his_no.eq(subQuery()
					.select(max(S1TB1.ap_xrate_rev_his_no)).from(S1TB1)
					.where(value(0).eq(value(0))
							.and(S1TB1.ac_ym.eq(bind("ac_ym")))
							.and(S1TB1.asppl_cd.eq(bind("asppl_cd")))
							.and(S1TB1.ap_dpt_cd.eq(bind("ap_dpt_cd")))
							.and(S1TB1.trd_cur_cd.eq(bind("trd_cur_cd")))
							.and(S1TB1.purc_act_no.eq(bind("purc_act_no")))
							.and(S1TB1.rcpt_iv_mng_no.eq(bind("rcpt_iv_mng_no")))
							.and(S1TB1.wrk_no.eq(bind("wrk_no")))
							.and(S1TB1.ap_typ.eq(bind("ap_typ"))))));
			dbSelect("MSBHL5120_MST_AP_XRATE_REV_HIS_S02", apXrateRevHisR, apXrateRevHisR_bldr, tgtR);
			return apXrateRevHisR;
		}

		/**
		 * 為替差損益（符号反転）取得<br />
		 * 為替レート評価替履歴ＮＯをもとに為替差損益を検索し、<br>
		 * 為替差損益を取得する<br>
		 * 符号を反転して返却する
		 * 
		 * @param apXrateRevHisNo 為替レート評価替履歴ＮＯ
		 * @return 符号反転した為替差損益
		 */
		protected MCNumber getExcGainLoss(String apXrateRevHisNo) {
			MST_AP_EXC_GAIN_LOSS_R t = MST_AP_EXC_GAIN_LOSS_R.create("T");
			MST_AP_EXC_GAIN_LOSS_R r = MST_AP_EXC_GAIN_LOSS_R.create();
			MCQueryApiBuilder r_bldr = MCQueryApiBuilder.create(t);
			r_bldr.setSelect(t.exc_gain_loss);
			r_bldr.addWhereWithAnd(t.ap_xrate_rev_his_no.eq(bind("1")), apXrateRevHisNo);
			dbSelect("MSBHL5120_MST_AP_EXC_GAIN_LOSS_S01", r, r_bldr);
			return r.exc_gain_loss().negate();
		}

		/**
		 * 対象年月の月次買掛残高の更新<br />
		 * 対象年月の月次買掛残高を更新する<br>
		 * 以下の通り、更新項目を設定する<br>
		 * <li>為替差損益＝為替差損益＋今回発生した為替差損益</li>
		 * <li>累計為替差損益＝累計為替差損益＋今回発生した為替差損益</li>
		 * <li>基準通貨当月残高＝基準通貨月初残高＋基準通貨仕入額－基準通貨支払額＋為替差損益</li>
		 * 
		 * @param tgtR 対象年月の月次買掛残高情報
		 * @param excGainLoss 為替差損益
		 * @return 基準通貨当月残高
		 */
		protected MCNumber updMlyApBal(MST_MLY_AP_BAL_R tgtR, MCNumber excGainLoss) {
			
			tgtR.exc_gain_loss(tgtR.exc_gain_loss().add(excGainLoss));
			tgtR.total_exc_gain_loss(tgtR.total_exc_gain_loss().add(excGainLoss));
			tgtR.base_cur_end_bal(getBaseCurEndBal(tgtR));
			MCQueryApiBuilder tgtR_bldr = MCQueryApiBuilder.create(MST_MLY_AP_BAL_R.create("T"));
			dbUpdateKey("MSBHL5120_MST_MLY_AP_BAL_U02", tgtR, tgtR_bldr);
			return tgtR.base_cur_end_bal();
		}

		/**
		 * 為替差損益の調整<br />
		 * @param newNo 変更後の債務為替レート評価替履歴ＮＯ
		 * @param oldNo 変更前の債務為替レート評価替履歴ＮＯ
		 * @return 債務為替差損益登録用リスト
		 */
		protected MCList<MST_AP_EXC_GAIN_LOSS_R> excGainLossAdjust(
				String newNo, String oldNo) {

			MCList<MST_AP_EXC_GAIN_LOSS_R> apExcGainLossL = MCList.create(MST_AP_EXC_GAIN_LOSS_R.class);
			MST_AP_EXC_GAIN_LOSS_R t = MST_AP_EXC_GAIN_LOSS_R.create("T");
			MCQueryApiBuilder apExcGainLossL_bldr = MCQueryApiBuilder.create(t);

			apExcGainLossL_bldr.addWhereWithAnd(t.ref_ap_xrate_rev_his_no.eq(bind("1")), oldNo);
			dbSelect("MSBHL5120_MST_AP_EXC_GAIN_LOSS_S02", apExcGainLossL, apExcGainLossL_bldr);

			if (!apExcGainLossL.isEmpty()) {
				// 今回処理対象の為替レート評価替履歴ＮＯを参照履歴ＮＯに設定して登録する
				for (MST_AP_EXC_GAIN_LOSS_R r : apExcGainLossL) {
					r.ref_ap_xrate_rev_his_no(newNo);
					r.exc_gain_loss(r.exc_gain_loss().negate());
				}
				dbInsertEx("MSBHL5120_MST_AP_EXC_GAIN_LOSS_I02", apExcGainLossL, apExcGainLossL_bldr);
			}
			return apExcGainLossL;
		}
	}

	/**
	 * 月次買掛残高情報の取得<br />
	 * 対象年月に該当する月次買掛残高を検索、ロックして<br>
	 * 検索結果を返却する
	 * 
	 * @param tgtYm 対象年月
	 * @return 月次買掛残高情報
	 */
	protected MCList<MST_MLY_AP_BAL_R> getMlyApBal(MCDate tgtYm) {

		MCList<MST_MLY_AP_BAL_R> tgtL = MCList.create(MST_MLY_AP_BAL_R.class);
		MST_MLY_AP_BAL_R t = MST_MLY_AP_BAL_R.create("T");
		MCQueryApiBuilder tgtL_bldr = MCQueryApiBuilder.create(t);

		tgtL_bldr.addWhereWithAnd(t.ac_ym.eq(bind("1")), tgtYm);
		tgtL_bldr.addWhereWithAnd(t.trd_cur_cd.neq(bind("1")), getCo().base_cur_cd());
		tgtL_bldr.addWhereWithAnd(t.end_bal.neq(value(0)));
		tgtL_bldr.addWhereWithAnd(bracket( t.purc_act_no.neq(value(MAC_STR.NULL_VAL.value())) .or(t.rcpt_iv_mng_no.neq(value(MAC_STR.NULL_VAL.value())))));
		dbSelectForUpdate("MSBHL5120_MST_MLY_AP_BAL_S01", tgtL, tgtL_bldr);

		return tgtL;
	}

	/**
	 * 翌月の月次買掛残高の取得<br />
	 * 対象年月の翌月の月次買掛残高を検索する<br>
	 * 
	 * @param tgtR 対象の月買掛残高情報
	 * @param tgtYm 対象年月
	 * @return 翌月の月次買掛残高情報
	 */
	protected MCList<MST_MLY_AP_BAL_R> _nextMlyApBalL = null;
	protected MCIndexKey _nextMlyApBalLIdx = null;
	protected MST_MLY_AP_BAL_R getNextMlyApBal(
			MST_MLY_AP_BAL_R tgtR, MCDate tgtYm) {

		if (_nextMlyApBalL == null) {
			MSBHL_ApBalService.ApBal_Srch01 ope = MSBHL_ApBalService.crtApBal_Srch01();
			ope.up0().group_ap_dpt_flg(true);
			ope.up0().group_wg_flg(true);
			ope.up0().group_asppl_flg(true);
			ope.up0().group_purc_act_no_flg(true);
			ope.up0().group_rcpt_iv_no_flg(true);
			ope.up0().group_rcpt_iv_mng_no_flg(true);
			ope.up0().group_trd_cur_flg(true);
			ope.up0().group_wrk_no_flg(true);
			ope.up0().group_ap_typ_flg(true);
			// 支払実績に対する評価替えによる差損益の計算対象は翌月分のみ
			ope.up0().ac_ym_fr(tgtYm.addMonth(1));
			ope.up0().ac_ym_to(ope.up0().ac_ym_fr());
			ope.exec();
			
			_nextMlyApBalL = MCList.create(MST_MLY_AP_BAL_R.class);
			 addAll(_nextMlyApBalL, ope.down0(), createMap_MST_MLY_AP_BAL_R_ApBal_Srch01_RsltR());
			 _nextMlyApBalLIdx = _nextMlyApBalL.createIndex(
				 MST_MLY_AP_BAL_R.$asppl_cd, MST_MLY_AP_BAL_R.$ap_dpt_cd, MST_MLY_AP_BAL_R.$trd_cur_cd,
				 MST_MLY_AP_BAL_R.$purc_act_no, MST_MLY_AP_BAL_R.$rcpt_iv_mng_no,
				 MST_MLY_AP_BAL_R.$wrk_no, MST_MLY_AP_BAL_R.$ap_typ
			 );
		}
		return _nextMlyApBalL.getFirst(
			_nextMlyApBalLIdx,
				tgtR.asppl_cd(), tgtR.ap_dpt_cd(), tgtR.trd_cur_cd(),
				tgtR.purc_act_no(), tgtR.rcpt_iv_mng_no(),
				tgtR.wrk_no(), tgtR.ap_typ()
		);
	}
	protected Map_MST_MLY_AP_BAL_R_ApBal_Srch01_RsltR<MST_MLY_AP_BAL_R,ApBal_Srch01_RsltR> createMap_MST_MLY_AP_BAL_R_ApBal_Srch01_RsltR() {
		return new Map_MST_MLY_AP_BAL_R_ApBal_Srch01_RsltR<MST_MLY_AP_BAL_R, ApBal_Srch01_RsltR>();
	}
	public class Map_MST_MLY_AP_BAL_R_ApBal_Srch01_RsltR<D extends MST_MLY_AP_BAL_R, S extends ApBal_Srch01_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_MLY_AP_BAL_R.$ac_ym, ApBal_Srch01_RsltR.$ac_ym);
			addColumnPathMap(MST_MLY_AP_BAL_R.$asppl_cd, ApBal_Srch01_RsltR.$asppl_cd);
			addColumnPathMap(MST_MLY_AP_BAL_R.$ap_dpt_cd, ApBal_Srch01_RsltR.$ap_dpt_cd);
			addColumnPathMap(MST_MLY_AP_BAL_R.$trd_cur_cd, ApBal_Srch01_RsltR.$trd_cur_cd);
			addColumnPathMap(MST_MLY_AP_BAL_R.$purc_act_no, ApBal_Srch01_RsltR.$purc_act_no);
			addColumnPathMap(MST_MLY_AP_BAL_R.$ap_typ, ApBal_Srch01_RsltR.$ap_typ);
			addColumnPathMap(MST_MLY_AP_BAL_R.$init_bal, ApBal_Srch01_RsltR.$init_bal);
			addColumnPathMap(MST_MLY_AP_BAL_R.$purc_amt, ApBal_Srch01_RsltR.$purc_amt);
			addColumnPathMap(MST_MLY_AP_BAL_R.$ret_amt, ApBal_Srch01_RsltR.$ret_amt);
			addColumnPathMap(MST_MLY_AP_BAL_R.$dscnt_amt, ApBal_Srch01_RsltR.$dscnt_amt);
			addColumnPathMap(MST_MLY_AP_BAL_R.$sw_to_amt, ApBal_Srch01_RsltR.$sw_to_amt);
			addColumnPathMap(MST_MLY_AP_BAL_R.$tax_amt, ApBal_Srch01_RsltR.$tax_amt);
			addColumnPathMap(MST_MLY_AP_BAL_R.$cash_amt, ApBal_Srch01_RsltR.$cash_amt);
			addColumnPathMap(MST_MLY_AP_BAL_R.$note_amt, ApBal_Srch01_RsltR.$note_amt);
			addColumnPathMap(MST_MLY_AP_BAL_R.$account_amt, ApBal_Srch01_RsltR.$account_amt);
			addColumnPathMap(MST_MLY_AP_BAL_R.$setoff_amt, ApBal_Srch01_RsltR.$setoff_amt);
			addColumnPathMap(MST_MLY_AP_BAL_R.$sw_amt, ApBal_Srch01_RsltR.$sw_amt);
			addColumnPathMap(MST_MLY_AP_BAL_R.$end_bal, ApBal_Srch01_RsltR.$end_bal);
			addColumnPathMap(MST_MLY_AP_BAL_R.$base_cur_cd, ApBal_Srch01_RsltR.$base_cur_cd);
			addColumnPathMap(MST_MLY_AP_BAL_R.$base_cur_init_bal, ApBal_Srch01_RsltR.$base_cur_init_bal);
			addColumnPathMap(MST_MLY_AP_BAL_R.$base_cur_purc_amt, ApBal_Srch01_RsltR.$base_cur_purc_amt);
			addColumnPathMap(MST_MLY_AP_BAL_R.$base_cur_ret_amt, ApBal_Srch01_RsltR.$base_cur_ret_amt);
			addColumnPathMap(MST_MLY_AP_BAL_R.$base_cur_dscnt_amt, ApBal_Srch01_RsltR.$base_cur_dscnt_amt);
			addColumnPathMap(MST_MLY_AP_BAL_R.$base_cur_sw_to_amt, ApBal_Srch01_RsltR.$base_cur_sw_to_amt);
			addColumnPathMap(MST_MLY_AP_BAL_R.$base_cur_tax_amt, ApBal_Srch01_RsltR.$base_cur_tax_amt);
			addColumnPathMap(MST_MLY_AP_BAL_R.$base_cur_cash_amt, ApBal_Srch01_RsltR.$base_cur_cash_amt);
			addColumnPathMap(MST_MLY_AP_BAL_R.$base_cur_note_amt, ApBal_Srch01_RsltR.$base_cur_note_amt);
			addColumnPathMap(MST_MLY_AP_BAL_R.$base_cur_account_amt, ApBal_Srch01_RsltR.$base_cur_account_amt);
			addColumnPathMap(MST_MLY_AP_BAL_R.$base_cur_setoff_amt, ApBal_Srch01_RsltR.$base_cur_setoff_amt);
			addColumnPathMap(MST_MLY_AP_BAL_R.$base_cur_sw_amt, ApBal_Srch01_RsltR.$base_cur_sw_amt);
			addColumnPathMap(MST_MLY_AP_BAL_R.$base_cur_end_bal, ApBal_Srch01_RsltR.$base_cur_end_bal);
			addColumnPathMap(MST_MLY_AP_BAL_R.$exc_gain_loss, ApBal_Srch01_RsltR.$exc_gain_loss);
			addColumnPathMap(MST_MLY_AP_BAL_R.$total_exc_gain_loss, ApBal_Srch01_RsltR.$total_exc_gain_loss);
			addColumnPathMap(MST_MLY_AP_BAL_R.$rcpt_iv_no, ApBal_Srch01_RsltR.$rcpt_iv_no);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.rcpt_iv_mng_no(nvl(src.rcpt_iv_mng_no(), MAC_STR.NULL_VAL.value()));
			dest.wrk_no(nvl(src.wrk_no(), MAC_STR.NULL_VAL.value()));
			// 不使用項目に「0」を設定
			dest.sw_amt(MCNumber.ZERO);
			dest.sw_to_amt(MCNumber.ZERO);
		}
	}

	/**
	 * 為替差損益登録<br />
	 * 為替差損益に登録するレコードを作成して登録する
	 * 
	 * @param revHisNo 為替レート評価替履歴ＮＯ
	 * @param excGainLoss 為替差損益
	 * @return 為替差損益の登録情報
	 */
	protected MST_AP_EXC_GAIN_LOSS_R insApExcGainLoss(String revHisNo, MCNumber excGainLoss) {
		MST_AP_EXC_GAIN_LOSS_R insR = MST_AP_EXC_GAIN_LOSS_R.create();
		MST_AP_EXC_GAIN_LOSS_R t = MST_AP_EXC_GAIN_LOSS_R.create("T");
		MCQueryApiBuilder insR_bldr = MCQueryApiBuilder.create(t);
		insR.ap_xrate_rev_his_no(revHisNo);
		insR.exc_gain_loss(excGainLoss);
		dbInsert("MSBHL5120_MST_AP_EXC_GAIN_LOSS_I03", insR, insR_bldr);
		return insR;
	}

	/**
	 * 為替レート評価替履歴登録<br />
	 * 為替レート評価替履歴に登録するレコードを作成して登録する<br>
	 * 
	 * @param apXrateRevHisNo 債務為替レート評価替履歴ＮＯ
	 * @param tgtR 対象年月の月次買掛残高情報
	 * @param oldXrate 変更前為替レート
	 * @param newXrate 変更後為替レート
	 * @param xrateCd 為替レートＣＤ
	 * @return 為替レート評価替履歴の登録情報
	 */
	protected void insApXrateRevHis(String apXrateRevHisNo, MST_MLY_AP_BAL_R tgtR,
			MCNumber oldXrate, MCNumber newXrate, MCDate acDt, String xrateCd) {
		if (isNull(acDt)) {
			acDt = MAUCL_DateUtil.getPeriodEndDt(tgtR.ac_ym(), MAC_PERIOD_TYP.MONTHLY.value());
		}
		MST_AP_XRATE_REV_HIS_R insR = MST_AP_XRATE_REV_HIS_R.create();
		MST_AP_XRATE_REV_HIS_R t = MST_AP_XRATE_REV_HIS_R.create("T");
		MCQueryApiBuilder insR_bldr = MCQueryApiBuilder.create(t);
		insR.ap_xrate_rev_his_no(apXrateRevHisNo);
		insR.ac_ym(tgtR.ac_ym());
		insR.asppl_cd(tgtR.asppl_cd());
		insR.ap_dpt_cd(tgtR.ap_dpt_cd());
		insR.trd_cur_cd(tgtR.trd_cur_cd());
		insR.purc_act_no(tgtR.purc_act_no());
		insR.rcpt_iv_mng_no(tgtR.rcpt_iv_mng_no());
		insR.wrk_no(tgtR.wrk_no());
		insR.ap_typ(tgtR.ap_typ());
		insR.xrate_cd(xrateCd);
		insR.new_xrate(newXrate);
		insR.old_xrate(oldXrate);
		insR.base_cur_cd(getBaseCur().cur_cd());
		insR.exe_dt(getToday());
		insR.ac_dt(acDt);
		dbInsert("MSBHL5120_MST_AP_XRATE_REV_HIS_I01", insR, insR_bldr);
	}

	/**
	 * 支払実績ＩＦ作成サービス実行<br />
	 * 登録した為替差損益情報をもとに支払実績ＩＦ作成サービスを実行する
	 * 
	 * @param insL 登録した為替差損益情報
	 */
	protected void execPayActIfCrtService(MCList<MST_AP_EXC_GAIN_LOSS_R> insL) {

		MSBHL_PayActIfCrtService.PayActIfCrt_Ins01 op =
				MSBHL_PayActIfCrtService.crtPayActIfCrt_Ins01();

		for ( MST_AP_EXC_GAIN_LOSS_R insR : insL) {
			PayActIfCrt_Ins01_CndR r = PayActIfCrt_Ins01_CndR.create();
			r.pay_act_d_no(insR.pay_act_d_no());
			r.pay_act_d_seq(insR.pay_act_d_seq());
			r.ap_xrate_rev_his_no(insR.ap_xrate_rev_his_no());
			r.ref_ap_xrate_rev_his_no(insR.ref_ap_xrate_rev_his_no());
			op.up0().add(r);
		}
		op.exec();
	}

	/**
	 * 基準通貨当月残高を求める
	 * 基準通貨月初残高＋基準通貨仕入額－基準通貨支払額＋為替差損益＝基準通貨当月残高
	 * 
	 * @param r 月次買掛残高
	 * @return 基準通貨当月残高
	 */
	protected MCNumber getBaseCurEndBal(MST_MLY_AP_BAL_R r) {
		return
			r.base_cur_init_bal()
				.add(getBaseCurPurcAmt(r))
				.subtract(	getBaseCurPayAmt(r))
				.add(r.exc_gain_loss());
	}

	/**
	 * 基準通貨仕入額を求める
	 * 
	 * @param r 月次買掛残高
	 * @return 基準通貨仕入額
	 */
	protected MCNumber getBaseCurPurcAmt(MST_MLY_AP_BAL_R r) {
		return
			r.base_cur_purc_amt()
				.add(r.base_cur_ret_amt())
				.add(r.base_cur_dscnt_amt())
				.add(r.base_cur_sw_to_amt())
				.add(r.base_cur_tax_amt());
	}

	/**
	 * 基準通貨支払額を求める
	 * 
	 * @param r 月次買掛残高
	 * @return 基準通貨支払額
	 */
	protected MCNumber getBaseCurPayAmt(MST_MLY_AP_BAL_R r) {
		return
			r.base_cur_cash_amt()
				.add(r.base_cur_note_amt())
				.add(r.base_cur_account_amt())
				.add(r.base_cur_setoff_amt())
				.add(r.base_cur_sw_amt())
				;
	}

	//FMCB CUSTOM END
}