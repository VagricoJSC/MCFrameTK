package mcframe.serverMSBG.MSBGL5170;

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
import mcframe.serverMSBG.MSBGL5090.*;
import mcframe.serverMSBG.MSBGL5120.*;
import mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBGL_XrateRevService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBGL_XrateRevService_MC extends MSBGL_XrateRevService_MC_A{
	//FMCB CUSTOM START

	/**
	 * XrateRev_Ins01オペレーション.<p>
	 *
	 * 為替レート評価替の結果を為替レート評価替履歴、為替差損益に登録する<br>
	 */
	public class XrateRev_Ins01 extends MSBGL_XrateRevService_MC_A.XrateRev_Ins01 {
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
				// 為替レートＣＤが設定されていない場合は会社マスタの売上為替レートＣＤを補完する
				xrateCd = getCo().sls_xrate_cd();
			}

			MCList<MST_MLY_AR_BAL_R> tgtL = getMlyArBal(tgtYm);

			MCList<MST_AR_EXC_GAIN_LOSS_R> arExcGainLossInsL =
					MCList.create(MST_AR_EXC_GAIN_LOSS_R.class);

			for (MST_MLY_AR_BAL_R tgtR : tgtL) {

				MCList<MST_MLY_AR_BAL_R> nextL = getNextMlyArBal(tgtR, tgtYm);

				MCNumber oldXrate = MSBGL_ArUtil.getXrate(tgtR.acst_cd(), tgtR.ar_dpt_cd(), tgtR.trd_cur_cd(), tgtR.iv_no(), tgtR.wrk_no(),
						tgtR.ar_typ(), tgtR.ac_ym());

				if (hasNoSlsData(oldXrate)) {
					continue;
				}

				MCNumber newXrate = getNewXrate(tgtR, tgtYm, xrateCd);

				MCNumber afterBaseCurEndBal = convToBaseCur(tgtR.end_bal(), newXrate,
						getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ());

				MCNumber excGainLoss = afterBaseCurEndBal.subtract(tgtR.base_cur_end_bal());

				String arXrateRevHisNo = getStrSeq(MSC_NUM_SYS_TYP.ARXRATEREVHIS);

				arExcGainLossInsL.add(
						insArExcGainLoss(arXrateRevHisNo, excGainLoss));

				insArXrateRevHis(arXrateRevHisNo, tgtR, oldXrate, newXrate, null, xrateCd);

				updMlyArBal(tgtR, excGainLoss, afterBaseCurEndBal);

				int index = 0;
				MCNumber baseCurEndBal = MCNumber.ZERO;
				for (MST_MLY_AR_BAL_R nextR : nextL) {
					if (index == 0) {
						baseCurEndBal = updNextMlyArBal(nextR, excGainLoss, afterBaseCurEndBal);
					}
					else {
						baseCurEndBal = updNextMlyArBal(nextR, excGainLoss, baseCurEndBal);
					}
					index++;
				}

				arExcGainLossInsL.addAll(
						excGainLossAdjust(nextL, newXrate, arXrateRevHisNo));
			}

			// 入金実績ＩＦ作成サービス
			execRcvActIfCrtService(arExcGainLossInsL);
		}

		protected boolean hasNoSlsData(MCNumber oldXrate) {
			return isNull(oldXrate);
		}

		/**
		 * 入金額判定<br />
		 * 対象の月次売掛残高情報に入金額が設定されているかどうか判定する<br>
		 * いずれかの入金額が設定されている場合、falseを返却<br>
		 * 入金額が設定されていない場合（全て0の場合）、trueを返却
		 * 
		 * @param nextR 月次売掛残高情報
		 * @return 判定結果
		 */
		protected boolean isRcvAmt(MST_MLY_AR_BAL_R nextR) {
			return nextR.cash_amt().isZero() &&
					nextR.xfr_amt().isZero() &&
					nextR.note_amt().isZero() &&
					nextR.setoff_amt().isZero() &&
					nextR.sw_amt().isZero();
		}

		/**
		 * 変更後為替レート取得<br />
		 * 対象年月の月末の為替レートを取得する
		 * 
		 * @param tgtR 対象年月の月次売掛残高情報
		 * @param tgtYm 対象年月
		 * @param xrateCd 為替レートＣＤ
		 * @return 対象年月末の為替レート
		 */
		protected MCNumber getNewXrate(MST_MLY_AR_BAL_R tgtR,
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
			dbSelect("MSBGL5170_MAM_CUR_XRATE_S01", xrateR, xrateR_bldr);

			if (xrateR.isEmpty()) {
				throw new MCAppException(MAUCD0024, tgtR.trd_cur_cd(), getCo().base_cur_cd(), xrateCd, baseDt);
			}
			return xrateR.xrate();
		}

		/**
		 * 対象年月の月次売掛残高の更新<br />
		 * 対象年月の月次売掛残高を更新する<br>
		 * 以下の通り、更新項目を設定する<br>
		 * <li>為替差損益＝為替差損益＋今回発生した為替差損益</li>
		 * <li>累計為替差損益＝累計為替差損益＋今回発生した為替差損益</li>
		 * <li>基準通貨当月残高＝引数の基準通貨当月残高</li>
		 * 
		 * @param tgtR 対象年月の月次売掛残高情報
		 * @param excGainLoss 為替差損益
		 * @param afterBaseCurEndBal 基準通貨当月残高
		 */
		protected void updMlyArBal(MST_MLY_AR_BAL_R tgtR, MCNumber excGainLoss,
				MCNumber afterBaseCurEndBal) {
			tgtR.exc_gain_loss(tgtR.exc_gain_loss().add(excGainLoss));
			tgtR.total_exc_gain_loss(tgtR.total_exc_gain_loss().add(excGainLoss));
			tgtR.base_cur_end_bal(afterBaseCurEndBal);
			MCQueryApiBuilder tgtR_bldr = MCQueryApiBuilder.create(MST_MLY_AR_BAL_R.create("T"));
			dbUpdateKey("MSBGL5170_MST_MLY_AR_BAL_U01", tgtR, tgtR_bldr);
		}

		/**
		 * 翌月以降の月次残高の更新情報取得<br />
		 * 翌月以降の月次売掛残高を更新する更新条件を取得する<br>
		 * 以下の通り、更新項目を設定する<br>
		 * <li>累計為替差損益＝累計為替差損益＋今回発生した為替差損益</li>
		 * <li>基準通貨月初残高＝前月の基準通貨当月残高</li>
		 * <li>基準通貨当月残高＝基準通貨月初残高＋基準通貨売上額－基準通貨入金額＋為替差損益</li>
		 * 
		 * @param nextR 対象年月の月次売掛残高情報
		 * @param excGainLoss 為替差損益
		 * @param baseCurEndBal 基準通貨当月残高（翌月の月初残高用）
		 * @return 基準通貨当月残高
		 */
		protected MCNumber updNextMlyArBal(MST_MLY_AR_BAL_R nextR, MCNumber excGainLoss,
				MCNumber baseCurEndBal) {
			nextR.total_exc_gain_loss(nextR.total_exc_gain_loss().add(excGainLoss));
			nextR.base_cur_init_bal(baseCurEndBal);
			nextR.base_cur_end_bal(getBaseCurEndBal(nextR));
			MCQueryApiBuilder nextR_bldr = MCQueryApiBuilder.create(MST_MLY_AR_BAL_R.create("T"));
			dbUpdateKey("MSBGL5170_MST_MLY_AR_BAL_U02", nextR, nextR_bldr);
			return nextR.base_cur_end_bal();
		}

		/**
		 * 為替差損益の調整<br />
		 * 翌月以降の入金データが存在する場合、為替差損益の調整分を登録して、<br>
		 * 月次売掛残高の情報を更新する
		 * 
		 * @param nextL 翌月以降の月次売掛残高情報
		 * @param aXrate 変更後為替レート
		 * @param arXrateRevHisNo 為替レート評価替履歴ＮＯ
		 * @return 債権為替差損益登録用リスト
		 */
		protected MCList<MST_AR_EXC_GAIN_LOSS_R> excGainLossAdjust(
				MCList<MST_MLY_AR_BAL_R> nextL, MCNumber aXrate,
				String arXrateRevHisNo) {

			MCList<MST_AR_EXC_GAIN_LOSS_R> insL = MCList.create(MST_AR_EXC_GAIN_LOSS_R.class);

			if (nextL.isEmpty()) {
				return insL;
			}

			int index = 0;
			MCNumber excGainLossSum = MCNumber.ZERO;
			for (MST_MLY_AR_BAL_R nextR : nextL) {
				// 対象月の翌月について為替差損益の調整額を為替差損益、累計為替差損益に反映する。
				if (index == 0) {
					if (isRcvAmt(nextR)) {
						index++;
						continue;
					}
					// 入金実績、入金実績明細を取得
					MCList<MST_RCV_ACT_D_R> rcvActL = getRcvActD(nextR);

					for (MST_RCV_ACT_D_R rcvActDR : rcvActL) {
						MCNumber rcvAmt = MCNumber.sum(
								nvl(rcvActDR.trd_cur_amt1(), MCNumber.ZERO),
								nvl(rcvActDR.trd_cur_amt2(), MCNumber.ZERO),
								nvl(rcvActDR.trd_cur_amt3(), MCNumber.ZERO)
								);

						// 為替差損益調整額を取得
						// （入金額*取引時為替レート）―（入金額*変更後レート）＝入金データの調整額
						MCNumber excGainLoss1 = convToBaseCur(rcvAmt, rcvActDR.trd_xrate(),
								getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ());
						MCNumber excGainLoss2 = convToBaseCur(rcvAmt, aXrate,
								getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ());
						MCNumber excGainLoss = excGainLoss1.subtract(excGainLoss2);

						if (!excGainLoss.isZero()) {
							insL.add(createArExcGainLoss(rcvActDR, excGainLoss, arXrateRevHisNo));
							excGainLossSum = excGainLossSum.add(excGainLoss);
						}
					}

					// 対象月の翌月の当月残高が0の場合、端数処理で発生した差額を調整する。
					if (nextR.end_bal().isZero() && !excGainLossSum.isZero()) {
						// 端数処理の調整額を求める
						// 月初残高－入金額＋為替差損益＋入金データの調整額＝端数処理の調整額
						MCNumber adjustAmt = nextR.base_cur_init_bal().subtract(
								getBaseCurRcvAmt(nextR)).add(nextR.exc_gain_loss()).add(excGainLossSum);
						// 端数処理の調整額を入金データの調整額から減算する
						excGainLossSum = excGainLossSum.subtract(adjustAmt);
						insL.get(0).exc_gain_loss(insL.get(0).exc_gain_loss().subtract(adjustAmt));
					}

					if (!excGainLossSum.isZero()) {
						updMlyArBalAdjust(nextR, excGainLossSum);
					}
				}
				// 対象月の翌々月以降については、調整額を累計為替差損益のみ反映する。
				else {
					if (!excGainLossSum.isZero()) {
						updMlyArBalAdjustOnlyTotal(nextR, excGainLossSum);
					}
				}
				index++;
			}

			if (!insL.isEmpty()) {
				MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_AR_EXC_GAIN_LOSS_R.create("T"));
				dbInsertEx("MSBGL5170_MST_AR_EXC_GAIN_LOSS_I01", insL, insL_bldr);
			}

			return insL;
		}

		/**
		 * 入金実績明細取得<br />
		 * 翌月以降の入金実績に対して、為替差損益の調整を行うため、<br>
		 * 対象の入金実績明細を取得する
		 * 
		 * @param nextR 翌月以降の月次売掛残高情報
		 * @return 入金実績明細
		 */
		protected MCList<MST_RCV_ACT_D_R> getRcvActD(MST_MLY_AR_BAL_R nextR) {
			MCList<MST_RCV_ACT_D_R> rcvActDL = MCList.create(MST_RCV_ACT_D_R.class);
			MST_RCV_ACT_D_R t1 = MST_RCV_ACT_D_R.create("T1");
			MST_RCV_ACT_R t2 = MST_RCV_ACT_R.create("T2");
			MCQueryApiBuilder rcvActDL_bldr = MCQueryApiBuilder.create(t1);
			rcvActDL_bldr.addInnerJoin(t2, bracket( t1.rcv_act_no.eq(t2.rcv_act_no) .and(t1.rcv_act_seq.eq(t2.rcv_act_seq))));
			rcvActDL_bldr.addWhereWithAnd(t2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			rcvActDL_bldr.addWhereWithAnd(t2.ac_ym.eq(bind("1")), nextR.ac_ym());
			rcvActDL_bldr.addWhereWithAnd(t1.acst_cd.eq(bind("1")), nextR.acst_cd());
			rcvActDL_bldr.addWhereWithAnd(t1.ar_dpt_cd.eq(bind("1")), nextR.ar_dpt_cd());
			rcvActDL_bldr.addWhereWithAnd(t2.trd_cur_cd.eq(bind("1")), nextR.trd_cur_cd());
			rcvActDL_bldr.addWhereWithAnd(t1.iv_no.eq(bind("1")), nextR.iv_no());
			rcvActDL_bldr.addWhereWithAnd(bracket( t1.wrk_no.eq(bind("1")) .or(t1.wrk_no.isNull()) .and(bind("1").isNull())), nextR.wrk_no());
			rcvActDL_bldr.addWhereWithAnd(t1.ar_typ.eq(bind("1")), nextR.ar_typ());
			dbSelect("MSBGL5170_MST_RCV_ACT_D_S01", rcvActDL, rcvActDL_bldr);

			return rcvActDL;
		}

		/**
		 * 為替差損益作成<br />
		 * 入金実績明細に紐づけて為替差損益を作成する
		 * 
		 * @param rcvActDR 入金実績明細情報
		 * @param excGainLoss 為替差損益調整額
		 * @param arXrateRevHisNo 債権為替レート評価替履歴ＮＯ
		 * @return 為替差損益情報
		 */
		protected MST_AR_EXC_GAIN_LOSS_R createArExcGainLoss(
				MST_RCV_ACT_D_R rcvActDR, MCNumber excGainLoss, String arXrateRevHisNo) {
			MST_AR_EXC_GAIN_LOSS_R insR = MST_AR_EXC_GAIN_LOSS_R.create();
			insR.rcv_act_d_no(rcvActDR.rcv_act_d_no());
			insR.rcv_act_d_seq(rcvActDR.rcv_act_d_seq());
			insR.ref_ar_xrate_rev_his_no(arXrateRevHisNo);
			insR.exc_gain_loss(excGainLoss);
			return insR;
		}

		/**
		 * 月次売掛残高の更新<br />
		 * 為替差損益の調整分を月次売掛残高に反映するために更新する<br>
		 * 以下の通り、更新項目を設定する<br>
		 * <li>為替差損益＝為替差損益＋今回発生した為替差損益調整額</li>
		 * <li>累計為替差損益＝累計為替差損益＋今回発生した為替差損益</li>
		 * 
		 * @param nextR 翌月以降の月次売掛残高情報
		 * @param excGainLoss 為替差損益
		 */
		protected void updMlyArBalAdjust(MST_MLY_AR_BAL_R nextR, 
				MCNumber excGainLoss) {
			nextR.exc_gain_loss(nextR.exc_gain_loss().add(excGainLoss));
			nextR.total_exc_gain_loss(nextR.total_exc_gain_loss().add(excGainLoss));
			nextR.base_cur_end_bal(nextR.base_cur_end_bal().add(excGainLoss));
			MCQueryApiBuilder nextR_bldr = MCQueryApiBuilder.create(MST_MLY_AR_BAL_R.create("T"));
			dbUpdateKey("MSBGL5170_MST_MLY_AR_BAL_U03", nextR, nextR_bldr);
		}

		/**
		 * 月次売掛残高の更新(累計為替差損益のみ更新)<br />
		 * 為替差損益の調整分を月次売掛残高に反映するために更新する<br>
		 * 以下の通り、更新項目を設定する<br>
		 * <li>累計為替差損益＝累計為替差損益＋今回発生した為替差損益</li>
		 * 
		 * @param nextR 翌月以降の月次売掛残高情報
		 * @param excGainLoss 為替差損益
		 */
		protected void updMlyArBalAdjustOnlyTotal(MST_MLY_AR_BAL_R nextR, 
				MCNumber excGainLoss) {
			nextR.total_exc_gain_loss(nextR.total_exc_gain_loss().add(excGainLoss));
			nextR.base_cur_init_bal(nextR.base_cur_init_bal().add(excGainLoss));
			nextR.base_cur_end_bal(nextR.base_cur_end_bal().add(excGainLoss));
			MCQueryApiBuilder nextR_bldr = MCQueryApiBuilder.create(MST_MLY_AR_BAL_R.create("T"));
			dbUpdateKey("MSBGL5170_MST_MLY_AR_BAL_U04", nextR, nextR_bldr);
		}
	}

	/**
	 * XrateRev_Del01オペレーション.<p>
	 *
	 * 為替レート評価替の取消処理を実行する<br>
	 */
	public class XrateRev_Del01 extends MSBGL_XrateRevService_MC_A.XrateRev_Del01 {
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

			MCList<MST_MLY_AR_BAL_R> tgtL = getMlyArBal(tgtYm);

			MCList<MST_AR_EXC_GAIN_LOSS_R> arExcGainLossInsL =
					MCList.create(MST_AR_EXC_GAIN_LOSS_R.class);

			for (MST_MLY_AR_BAL_R tgtR : tgtL) {

				MCList<MST_MLY_AR_BAL_R> nextL = getNextMlyArBal(tgtR, tgtYm);

				MST_AR_XRATE_REV_HIS_R arXrateRevHisR = getArXrateRevHis(tgtR);

				// 為替レート評価替履歴が存在しない場合は処理しない
				if (arXrateRevHisR.isEmpty()) {
					continue;
				}

				MCNumber newExcGainLoss = getExcGainLoss(arXrateRevHisR.ar_xrate_rev_his_no());

				String arXrateRevHisNo = getStrSeq(MSC_NUM_SYS_TYP.ARXRATEREVHIS);

				arExcGainLossInsL.add(
						insArExcGainLoss(arXrateRevHisNo, newExcGainLoss));

				insArXrateRevHis(arXrateRevHisNo, tgtR, arXrateRevHisR.new_xrate(),
						arXrateRevHisR.old_xrate(), arXrateRevHisR.ac_dt(), arXrateRevHisR.xrate_cd());

				MCNumber baseCurEndBal = updMlyArBal(tgtR, newExcGainLoss);

				int index = 0;
				MCNumber nextBaseCurEndBal = MCNumber.ZERO;
				for (MST_MLY_AR_BAL_R nextR : nextL) {
					if (index == 0) {
						nextBaseCurEndBal = updNextMlyArBal(nextR, newExcGainLoss, baseCurEndBal);
					}
					else {
						nextBaseCurEndBal = updNextMlyArBal(nextR, newExcGainLoss, nextBaseCurEndBal);
					}
					index++;
				}

				arExcGainLossInsL.addAll(
						excGainLossAdjust(arXrateRevHisNo, arXrateRevHisR.ar_xrate_rev_his_no()));
			}

			execRcvActIfCrtService(arExcGainLossInsL);
		}

		/**
		 * 為替レート評価替履歴取得<br />
		 * 対象の月次売掛残高に紐づく最新の為替レート評価替履歴情報を取得する
		 * 
		 * @param tgtR 対象年月の月次売掛残高
		 * @return 最新の為替レート評価替履歴
		 */
		protected MST_AR_XRATE_REV_HIS_R getArXrateRevHis(MST_MLY_AR_BAL_R tgtR) {
			MST_AR_XRATE_REV_HIS_R S1TB1 = MST_AR_XRATE_REV_HIS_R.create("TB1");
			MST_AR_XRATE_REV_HIS_R arXrateRevHisR = MST_AR_XRATE_REV_HIS_R.create();
			MST_AR_XRATE_REV_HIS_R t = MST_AR_XRATE_REV_HIS_R.create("T");
			MCQueryApiBuilder arXrateRevHisR_bldr = MCQueryApiBuilder.create(t);
			arXrateRevHisR_bldr.addWhereWithAnd(t.ar_xrate_rev_his_no.eq(subQuery() .select(max(S1TB1.ar_xrate_rev_his_no)) .from(S1TB1) .where( value(0).eq(value(0)) .and(S1TB1.ac_ym.eq(bind("ac_ym"))) .and(S1TB1.acst_cd.eq(bind("acst_cd"))) .and(S1TB1.ar_dpt_cd.eq(bind("ar_dpt_cd"))) .and(S1TB1.trd_cur_cd.eq(bind("trd_cur_cd"))) .and(S1TB1.iv_no.eq(bind("iv_no"))) .and( S1TB1.wrk_no.eq(bind("wrk_no")) .or(S1TB1.wrk_no.isNull()) .and(bind("wrk_no").isNull()) ) .and(S1TB1.ar_typ.eq(bind("ar_typ"))) )));
			dbSelect("MSBGL5170_MST_AR_XRATE_REV_HIS_S01", arXrateRevHisR, arXrateRevHisR_bldr, tgtR);
			return arXrateRevHisR;
		}

		/**
		 * 為替差損益（符号反転）取得<br />
		 * 為替レート評価替履歴ＮＯをもとに為替差損益を検索し、<br>
		 * 為替差損益を取得する<br>
		 * 符号を反転して返却する
		 * 
		 * @param arXrateRevHisNo 為替レート評価替履歴ＮＯ
		 * @return 符号反転した為替差損益
		 */
		protected MCNumber getExcGainLoss(String arXrateRevHisNo) {
			MST_AR_EXC_GAIN_LOSS_R t = MST_AR_EXC_GAIN_LOSS_R.create("T");
			MST_AR_EXC_GAIN_LOSS_R r = MST_AR_EXC_GAIN_LOSS_R.create();
			MCQueryApiBuilder r_bldr = MCQueryApiBuilder.create(t);
			r_bldr.setSelect(t.exc_gain_loss);
			r_bldr.addWhereWithAnd(t.ar_xrate_rev_his_no.eq(bind("1")), arXrateRevHisNo);
			dbSelect("MSBGL5170_MST_AR_EXC_GAIN_LOSS_S01", r, r_bldr);
			return r.exc_gain_loss().negate();
		}

		/**
		 * 対象年月の月次売掛残高の更新<br />
		 * 対象年月の月次売掛残高を更新する<br>
		 * 以下の通り、更新項目を設定する<br>
		 * <li>為替差損益＝為替差損益＋今回発生した為替差損益</li>
		 * <li>累計為替差損益＝累計為替差損益＋今回発生した為替差損益</li>
		 * <li>基準通貨当月残高＝基準通貨月初残高＋基準通貨売上額－基準通貨入金額＋為替差損益</li>
		 * 
		 * @param tgtR 対象年月の月次売掛残高情報
		 * @param excGainLoss 為替差損益
		 * @return 基準通貨当月残高
		 */
		protected MCNumber updMlyArBal(MST_MLY_AR_BAL_R tgtR, MCNumber excGainLoss) {
			tgtR.exc_gain_loss(tgtR.exc_gain_loss().add(excGainLoss));
			tgtR.total_exc_gain_loss(tgtR.total_exc_gain_loss().add(excGainLoss));
			tgtR.base_cur_end_bal(getBaseCurEndBal(tgtR));
			
			MCQueryApiBuilder tgtR_bldr = MCQueryApiBuilder.create(MST_MLY_AR_BAL_R.create("T"));
			dbUpdateKey("MSBGL5170_MST_MLY_AR_BAL_U05", tgtR, tgtR_bldr);
			return tgtR.base_cur_end_bal();
		}

		/**
		 * 翌月以降の月次残高の更新<br />
		 * 翌月以降の月次売掛残高を更新する<br>
		 * 以下の通り、更新項目を設定する<br>
		 * <li>累計為替差損益＝累計為替差損益＋今回発生した為替差損益</li>
		 * <li>基準通貨月初残高＝前月の基準通貨当月残高</li>
		 * <li>基準通貨当月残高＝基準通貨月初残高＋基準通貨売上額－基準通貨入金額＋為替差損益</li>
		 * 
		 * @param nextR 対象年月の月次売掛残高情報
		 * @param excGainLoss 為替差損益
		 * @param baseCurEndbal 基準通貨当月残高（翌月の月初残高用）
		 * @return 基準通貨当月残高
		 */
		protected MCNumber updNextMlyArBal(MST_MLY_AR_BAL_R nextR, MCNumber excGainLoss,
				MCNumber baseCurEndbal) {
			nextR.total_exc_gain_loss(nextR.total_exc_gain_loss().add(excGainLoss));
			nextR.base_cur_init_bal(baseCurEndbal);
			nextR.base_cur_end_bal(getBaseCurEndBal(nextR));
			
			MCQueryApiBuilder nextR_bldr = MCQueryApiBuilder.create(MST_MLY_AR_BAL_R.create("T"));
			dbUpdateKey("MSBGL5170_MST_MLY_AR_BAL_U06", nextR, nextR_bldr);
			return nextR.base_cur_end_bal();
		}

		/**
		 * 為替差損益の調整<br />
		 * @param newNo 変更後の債権為替レート評価替履歴ＮＯ
		 * @param oldNo 変更前の債権為替レート評価替履歴ＮＯ
		 * @return 債権為替差損益登録用リスト
		 */
		protected MCList<MST_AR_EXC_GAIN_LOSS_R> excGainLossAdjust(
				String newNo, String oldNo) {

			MCList<MST_AR_EXC_GAIN_LOSS_R> arExcGainLossL = MCList.create(MST_AR_EXC_GAIN_LOSS_R.class);
			MST_AR_EXC_GAIN_LOSS_R t = MST_AR_EXC_GAIN_LOSS_R.create("T");
			MCQueryApiBuilder arExcGainLossL_bldr = MCQueryApiBuilder.create(t);

			arExcGainLossL_bldr.addWhereWithAnd(t.ref_ar_xrate_rev_his_no.eq(bind("1")), oldNo);
			dbSelect("MSBGL5170_MST_AR_EXC_GAIN_LOSS_S02", arExcGainLossL, arExcGainLossL_bldr);

			if (!arExcGainLossL.isEmpty()) {
				// 今回処理対象の為替レート評価替履歴ＮＯを参照履歴ＮＯに設定して登録する
				for (MST_AR_EXC_GAIN_LOSS_R r : arExcGainLossL) {
					r.ref_ar_xrate_rev_his_no(newNo);
					r.exc_gain_loss(r.exc_gain_loss().negate());
				}
				dbInsertEx("MSBGL5170_MST_AR_EXC_GAIN_LOSS_I02", arExcGainLossL, arExcGainLossL_bldr);

				// 月次売掛残高の更新
				updMlyArBalAdjust(arExcGainLossL);
			}
			return arExcGainLossL;
		}

		/**
		 * 月次売掛残高の更新<br />
		 * 為替差損益の調整分を月次売掛残高に反映するために更新する<br>
		 * 
		 * @param l 為替差損益情報
		 */
		protected void updMlyArBalAdjust(MCList<MST_AR_EXC_GAIN_LOSS_R> l) {

			MCNumber excGainLoss = l.sum(MST_AR_EXC_GAIN_LOSS_R.$exc_gain_loss);
			MST_AR_EXC_GAIN_LOSS_R r = l.get(0);

			// 対象の入金実績の計上年月と同じ月次売掛残高について、
			// 為替差損益、累計為替差損益を更新する
			MST_MLY_AR_BAL_R mlyArBalR = MST_MLY_AR_BAL_R.create();
			MST_MLY_AR_BAL_R t1 = MST_MLY_AR_BAL_R.create("T1");
			MST_RCV_ACT_D_R t2 = MST_RCV_ACT_D_R.create("T2");
			MST_RCV_ACT_R t3 = MST_RCV_ACT_R.create("T3");
			MCQueryApiBuilder mlyArBalR_bldr = MCQueryApiBuilder.create(t1);
			mlyArBalR_bldr.addInnerJoin(t2, bracket( t1.acst_cd.eq(t2.acst_cd) .and(t1.ar_dpt_cd.eq(t2.ar_dpt_cd)) .and(t1.iv_no.eq(t2.iv_no)) .and( t1.wrk_no.eq(t2.wrk_no) .or(t1.wrk_no.isNull()) .and(t2.wrk_no.isNull()) ) .and(t1.ar_typ.eq(t2.ar_typ))));
			mlyArBalR_bldr.addInnerJoin(t3, bracket( t1.ac_ym.eq(t3.ac_ym) .and(t1.trd_cur_cd.eq(t3.trd_cur_cd)) .and(t2.rcv_act_no.eq(t3.rcv_act_no)) .and(t2.rcv_act_seq.eq(t3.rcv_act_seq))));
			mlyArBalR_bldr.addWhereWithAnd(t2.rcv_act_d_no.eq(bind("1")), r.rcv_act_d_no());
			mlyArBalR_bldr.addWhereWithAnd(t2.rcv_act_d_seq.eq(bind("1")), r.rcv_act_d_seq());
			dbSelect("MSBGL5170_MST_MLY_AR_BAL_S01", mlyArBalR, mlyArBalR_bldr);

			mlyArBalR.exc_gain_loss(mlyArBalR.exc_gain_loss().add(excGainLoss));
			mlyArBalR.total_exc_gain_loss(mlyArBalR.total_exc_gain_loss().add(excGainLoss));
			mlyArBalR.base_cur_end_bal(mlyArBalR.base_cur_end_bal().add(excGainLoss));
			dbUpdateKey("MSBGL5170_MST_MLY_AR_BAL_U07", mlyArBalR, mlyArBalR_bldr);

			// 対象の入金実績の計上年月の翌月以降の月次売掛残高については、
			// 累計為替差損益のみ更新する
			MCList<MST_MLY_AR_BAL_R> nextMlyArBalL = MCList.create(MST_MLY_AR_BAL_R.class);
			MST_MLY_AR_BAL_R t4 = MST_MLY_AR_BAL_R.create("T4");
			MST_RCV_ACT_D_R t5 = MST_RCV_ACT_D_R.create("T5");
			MST_RCV_ACT_R t6 = MST_RCV_ACT_R.create("T6");
			MCQueryApiBuilder nextMlyArBalL_bldr = MCQueryApiBuilder.create(t4);
			nextMlyArBalL_bldr.addInnerJoin(t5, bracket( t4.acst_cd.eq(t5.acst_cd) .and(t4.ar_dpt_cd.eq(t5.ar_dpt_cd)) .and(t4.iv_no.eq(t5.iv_no)) .and( t4.wrk_no.eq(t5.wrk_no) .or(t4.wrk_no.isNull()) .and(t5.wrk_no.isNull()) ) .and(t4.ar_typ.eq(t5.ar_typ))));
			nextMlyArBalL_bldr.addInnerJoin(t6, bracket( t4.ac_ym.gt(t6.ac_ym) .and(t4.trd_cur_cd.eq(t6.trd_cur_cd)) .and(t5.rcv_act_no.eq(t6.rcv_act_no)) .and(t5.rcv_act_seq.eq(t6.rcv_act_seq))));
			nextMlyArBalL_bldr.addWhereWithAnd(t5.rcv_act_d_no.eq(bind("1")), r.rcv_act_d_no());
			nextMlyArBalL_bldr.addWhereWithAnd(t5.rcv_act_d_seq.eq(bind("1")), r.rcv_act_d_seq());
			dbSelect("MSBGL5170_MST_MLY_AR_BAL_S02", nextMlyArBalL, nextMlyArBalL_bldr);

			for (MST_MLY_AR_BAL_R nextMlyArBalR : nextMlyArBalL) {
				nextMlyArBalR.total_exc_gain_loss(
						nextMlyArBalR.total_exc_gain_loss().add(excGainLoss));
				nextMlyArBalR.base_cur_init_bal(nextMlyArBalR.base_cur_init_bal().add(excGainLoss));
				nextMlyArBalR.base_cur_end_bal(nextMlyArBalR.base_cur_end_bal().add(excGainLoss));
			}
			dbUpdateKey("MSBGL5170_MST_MLY_AR_BAL_U08", nextMlyArBalL, nextMlyArBalL_bldr);
		}
	}

	/**
	 * 月次売掛残高情報の取得<br />
	 * 対象年月に該当する月次売掛残高を検索、ロックして<br>
	 * 検索結果を返却する
	 * 
	 * @param tgtYm 対象年月
	 * @return 月次売掛残高情報
	 */
	protected MCList<MST_MLY_AR_BAL_R> getMlyArBal(MCDate tgtYm) {

		MCList<MST_MLY_AR_BAL_R> tgtL = MCList.create(MST_MLY_AR_BAL_R.class);
		MST_MLY_AR_BAL_R t = MST_MLY_AR_BAL_R.create("T");
		MCQueryApiBuilder tgtL_bldr = MCQueryApiBuilder.create(t);

		tgtL_bldr.addWhereWithAnd(t.ac_ym.eq(bind("1")), tgtYm);
		tgtL_bldr.addWhereWithAnd(t.trd_cur_cd.neq(bind("1")), getCo().base_cur_cd());
		tgtL_bldr.addWhereWithAnd(t.end_bal.neq(value(0)));
		tgtL_bldr.addWhereWithAnd(t.iv_no.neq(value(MAC_STR.NULL_VAL.value())));
		dbSelectForUpdate("MSBGL5170_MST_MLY_AR_BAL_S03", tgtL, tgtL_bldr);

		return tgtL;
	}

	/**
	 * 翌月以降の月次売掛残高の取得<br />
	 * 対象年月の翌月以降の月次売掛残高を検索、ロックして<br>
	 * 検索結果を返却する
	 * 
	 * @param tgtR 対象の月売掛残高情報
	 * @param tgtYm 対象年月
	 * @return 翌月以降の月次売掛残高情報
	 */
	protected MCList<MST_MLY_AR_BAL_R> getNextMlyArBal(
			MST_MLY_AR_BAL_R tgtR, MCDate tgtYm) {

		MST_MLY_AR_BAL_R t = MST_MLY_AR_BAL_R.create("T");
		MCList<MST_MLY_AR_BAL_R> nextL = MCList.create(MST_MLY_AR_BAL_R.class);
		MCQueryApiBuilder nextL_bldr = MCQueryApiBuilder.create(t);

		nextL_bldr.addWhereWithAnd(t.acst_cd.eq(bind("1")), tgtR.acst_cd());
		nextL_bldr.addWhereWithAnd(t.ar_dpt_cd.eq(bind("1")), tgtR.ar_dpt_cd());
		nextL_bldr.addWhereWithAnd(t.trd_cur_cd.eq(bind("1")), tgtR.trd_cur_cd());
		nextL_bldr.addWhereWithAnd(t.iv_no.eq(bind("1")), tgtR.iv_no());
		nextL_bldr.addWhereWithAnd(bracket( t.wrk_no.eq(bind("1")) .or(t.wrk_no.isNull()) .and(bind("1").isNull())), tgtR.wrk_no());
		nextL_bldr.addWhereWithAnd(t.ar_typ.eq(bind("1")), tgtR.ar_typ());
		nextL_bldr.addWhereWithAnd(t.ac_ym.gt(bind("1")), tgtYm);
		nextL_bldr.addOrderByAsc(t.ac_ym);
		dbSelectForUpdate("MSBGL5170_MST_MLY_AR_BAL_S04", nextL, nextL_bldr);

		return nextL;
	}

	/**
	 * 為替差損益登録<br />
	 * 為替差損益に登録するレコードを作成して登録する
	 * 
	 * @param revHisNo 為替レート評価替履歴ＮＯ
	 * @param excGainLoss 為替差損益
	 * @return 為替差損益の登録情報
	 */
	protected MST_AR_EXC_GAIN_LOSS_R insArExcGainLoss(String revHisNo, MCNumber excGainLoss) {
		MST_AR_EXC_GAIN_LOSS_R insR = MST_AR_EXC_GAIN_LOSS_R.create();
		MST_AR_EXC_GAIN_LOSS_R t = MST_AR_EXC_GAIN_LOSS_R.create("T");
		MCQueryApiBuilder insR_bldr = MCQueryApiBuilder.create(t);
		insR.ar_xrate_rev_his_no(revHisNo);
		insR.exc_gain_loss(excGainLoss);
		dbInsert("MSBGL5170_MST_AR_EXC_GAIN_LOSS_I03", insR, insR_bldr);
		return insR;
	}

	/**
	 * 為替レート評価替履歴登録<br />
	 * 為替レート評価替履歴に登録するレコードを作成して登録する<br>
	 * 
	 * @param arXrateRevHisNo 債権為替レート評価替履歴ＮＯ
	 * @param tgtR 対象年月の月次売掛残高情報
	 * @param oldXrate 変更前為替レート
	 * @param newXrate 変更後為替レート
	 * @param xrateCd 為替レートＣＤ
	 * @param swBillDNo 振替請求明細ＮＯ
	 * @return 為替レート評価替履歴の登録情報
	 */
	protected void insArXrateRevHis(String arXrateRevHisNo, MST_MLY_AR_BAL_R tgtR,
			MCNumber oldXrate, MCNumber newXrate, MCDate acDt, String xrateCd) {
		if (isNull(acDt)) {
			acDt = MAUCL_DateUtil.getPeriodEndDt(tgtR.ac_ym(), MAC_PERIOD_TYP.MONTHLY.value());
		}
		MST_AR_XRATE_REV_HIS_R insR = MST_AR_XRATE_REV_HIS_R.create();
		insR.ar_xrate_rev_his_no(arXrateRevHisNo);
		insR.ac_ym(tgtR.ac_ym());
		insR.acst_cd(tgtR.acst_cd());
		insR.ar_dpt_cd(tgtR.ar_dpt_cd());
		insR.trd_cur_cd(tgtR.trd_cur_cd());
		insR.iv_no(tgtR.iv_no());
		insR.wrk_no(tgtR.wrk_no());
		insR.ar_typ(tgtR.ar_typ());
		insR.xrate_cd(xrateCd);
		insR.new_xrate(newXrate);
		insR.old_xrate(oldXrate);
		insR.base_cur_cd(getBaseCur().cur_cd());
		insR.exe_dt(getToday());
		insR.ac_dt(acDt);

		MCQueryApiBuilder insR_bldr = MCQueryApiBuilder.create(MST_AR_XRATE_REV_HIS_R.create("T"));
		dbInsert("MSBGL5170_MST_AR_XRATE_REV_HIS_I01", insR, insR_bldr);
	}

	/**
	 * 入金実績ＩＦ作成サービス実行<br />
	 * 登録した為替差損益情報をもとに入金実績ＩＦ作成サービスを実行する
	 * 
	 * @param insL 登録した為替差損益情報
	 */
	protected void execRcvActIfCrtService(MCList<MST_AR_EXC_GAIN_LOSS_R> insL) {

		MSBGL_RcvActIfCrtService.RcvActIfCrt_Ins01 op =
				MSBGL_RcvActIfCrtService.crtRcvActIfCrt_Ins01();

		for ( MST_AR_EXC_GAIN_LOSS_R insR : insL) {
			RcvActIfCrt_Ins01_CndR r = RcvActIfCrt_Ins01_CndR.create();
			r.rcv_act_d_no(insR.rcv_act_d_no());
			r.rcv_act_d_seq(insR.rcv_act_d_seq());
			r.ar_xrate_rev_his_no(insR.ar_xrate_rev_his_no());
			r.ref_ar_xrate_rev_his_no(insR.ref_ar_xrate_rev_his_no());
			op.up0().add(r);
		}
		op.exec();
	}

	/**
	 * 基準通貨当月残高を求める
	 * 基準通貨月初残高＋基準通貨売上額－基準通貨入金額＋為替差損益＝基準通貨当月残高
	 * 
	 * @param r 月次売掛残高
	 * @return 基準通貨当月残高
	 */
	protected MCNumber getBaseCurEndBal(MST_MLY_AR_BAL_R r) {
		return r.base_cur_init_bal().add(getBaseCurSlsAmt(r)).subtract(
				getBaseCurRcvAmt(r)).add(r.exc_gain_loss());
	}

	/**
	 * 基準通貨売上額を求める
	 * 
	 * @param r 月次売掛残高
	 * @return 基準通貨売上額
	 */
	protected MCNumber getBaseCurSlsAmt(MST_MLY_AR_BAL_R r) {
		return r.base_cur_sls_amt().add(r.base_cur_ret_amt()).add(
				r.base_cur_dscnt_amt()).add(r.base_cur_sw_to_amt()).add(
						r.base_cur_tax_amt());
	}

	/**
	 * 基準通貨入金額を求める
	 * 
	 * @param r 月次売掛残高
	 * @return 基準通貨入金額
	 */
	protected MCNumber getBaseCurRcvAmt(MST_MLY_AR_BAL_R r) {
		return r.base_cur_cash_amt().add(r.base_cur_note_amt()).add(
				r.base_cur_xfr_amt()).add(r.base_cur_setoff_amt()).add(
						r.base_cur_sw_amt());
	}

	//FMCB CUSTOM END
}