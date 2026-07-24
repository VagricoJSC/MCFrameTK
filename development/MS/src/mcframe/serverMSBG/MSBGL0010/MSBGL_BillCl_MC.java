package mcframe.serverMSBG.MSBGL0010;

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
import mcframe.serverMSBG.MSBGL0010.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBG.MSBGL0010.Query.*;
import mcframe.serverMSBG.MSBGL5030.*;
import mcframe.serverCore.mcjdbc.MCSavepoint;
import mcframe.serverCore.requester.MCServerThreadManager;
import mcframe.commonCore.param.MCParam;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverMSBG.MSBGL5040.*;
import mcframe.serverMSBG.MSBGL5120.*;
import mcframe.serverFXUC.FXUCL0030.*;

import java.util.List;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBGL_BillCl"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBGL_BillCl_MC extends MSBGL_BillCl_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 */
	public class Srch01 extends MSBGL_BillCl_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}


		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			setUpTmpCol();

			MCList<Srch02_HdrR> bufL = MCList.create(Srch02_HdrR.class);

			if (up0().batch_flg()) {
				bufL.addAll(getBatchRslt());
			}

			if (up0().manual_flg()) {
				bufL.addAll(getManualRslt());
			}

			if (up0().sel_flg()) {
				bufL.addAll(getSelRslt());
			}

			if (up0().each_sls_flg()) {
				bufL.addAll(getEachSlsRslt());
			}
			down0().addAll(bufL);

		}

		/**
		 * 検索条件に対する一時カラムを設定する
		 */
		protected void setUpTmpCol() {

			up0().today(getToday());
			up0().setStringNE(MAM_CO_R.$base_cur_cd, getCo().base_cur_cd());
			up0().setStringNE(MAM_CO_R.$bill_xrate_cd, getCo().bill_xrate_cd());
			up0().setDateNE(MST_BILL_R.$base_dt, getBaseDt());
		}
		protected MCDate getBaseDt() {
			if (isNullOr(up0().bill_ym(), up0().bill_cl_day())) {
				return null;
			}
			return getBillYmd(up0().bill_ym(), up0().bill_cl_day());
		}

		@Override
		protected void editListMain() {
			super.editListMain();

			down0().sort(Srch02_HdrR.$bill_dpt_cd, Srch02_HdrR.$bcst_cd
					,Srch02_HdrR.$trd_cur_cd, Srch02_HdrR.$wrk_no);
		}

		/**
		 * バッチ締日請求の検索結果を取得する
		 * 
		 * @return 請求情報（バッチ締日請求）
		 */
		protected MCList<Srch02_HdrR> getBatchRslt() {
			MCList<Srch02_HdrR> rsltL = MCList.create(Srch02_HdrR.class);

			executeQuery(rsltL, MSBGL0010_MST_BILL_S01(), up0());
			setBillClInfo(rsltL, true);

			return rsltL;
		}

		/**
		 * マニュアル締日請求の検索結果を取得する
		 * 
		 * @return 請求情報（マニュアル締日請求）
		 */
		protected MCList<Srch02_HdrR> getManualRslt() {
			MCList<Srch02_HdrR> rsltL = MCList.create(Srch02_HdrR.class);

			executeQuery(rsltL, MSBGL0010_MST_BILL_S02(), up0());
			setBillClInfo(rsltL, true);

			return rsltL;
		}

		/**
		 * マニュアル選択請求の検索結果を取得する
		 * 
		 * @return 請求情報（マニュアル選択請求）
		 */
		protected MCList<Srch02_HdrR> getSelRslt() {
			MCList<Srch02_HdrR> rsltL = MCList.create(Srch02_HdrR.class);

			executeQuery(rsltL, MSBGL0010_MST_BILL_S03(), up0());
			setBillClInfo(rsltL, false);

			return rsltL;
		}

		/**
		 * 売上都度請求の検索結果を取得する
		 * 
		 * @return 請求情報（売上都度請求）
		 */
		protected MCList<Srch02_HdrR> getEachSlsRslt() {
			MCList<Srch02_HdrR> rsltL = MCList.create(Srch02_HdrR.class);

			executeQuery(rsltL, MSBGL0010_MST_BILL_S04(), up0());
			setBillClInfo(rsltL, false);

			return rsltL;
		}
	}

	/**
	 * Srch02オペレーション.<p>
	 *
	 */
	public class Srch02 extends MSBGL_BillCl_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			setUpTmpCol(up0());

			if (up0().new_flg()) {
				executeQuery(down0(), MSBGL0010_MST_BILL_S06(), up0());
			} else {
				executeQuery(down0(), MSBGL0010_MST_BILL_S05(), up0());
			}
		}
		protected void setUpTmpCol(Srch02_CndR up) {
			if (isSame(up.bill_cl_day(), 99)) {
				up.bill_cl_day(null);
				up.addStringColumn("BILL_CL_DAY99_FLG_STR", toTrueStr(true));
			}
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 */
	public class Chk01 extends MSBGL_BillCl_MC_A.Chk01 {

		protected MCList<MST_BILL_R> _chkLockL = MCList.create(MST_BILL_R.class);

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 更新カウンタチェック
			MCQueryApiBuilder chkLockL_bldr = MCQueryApiBuilder.create(MST_BILL_R.create("T"));
			dbSelectKeyForUpdate("MSBGL0010_MST_BILL_S01", _chkLockL, chkLockL_bldr, up0());
			
			MCList<MST_BILL_R> lockL = MCList.create(MST_BILL_R.class);
			MST_BILL_R t = MST_BILL_R.create("T");
			MCQueryApiBuilder lockL_bldr = MCQueryApiBuilder.create(t);

			// ロック：関連する請求を全ておさえる（請求、未請求にかかわらず）
			lockL_bldr.setSelect(t.bill_mng_no);
			lockL_bldr.setWhere(t.bcst_cd.eq(bind("bcst_cd")));
			lockL_bldr.addWhereWithAnd(t.trd_cur_cd.eq(bind("trd_cur_cd")));
			lockL_bldr.addWhereWithAnd(t.iv_no.eq(bind("iv_no")));
			lockL_bldr.addWhereWithAnd(bracket(t.wrk_no.eq(bind("wrk_no"))
					.or(t.wrk_no.isNull())
					.and(bind("wrk_no").isNull())));
			lockL_bldr.addOrderByAsc(t.bill_cl_dt);
			dbSelectForUpdateNoWait("MSBGL0010_MST_BILL_S02", lockL, lockL_bldr, up0());

			MCIndexKey idxkey = _chkLockL.createIndex(MST_BILL_R.$bill_mng_no);

			for (Chk01_HdrR hdrR :up0()) {

				MST_BILL_R chkLockR = MST_BILL_R.create();
				chkLockR = _chkLockL.getFirst(idxkey, hdrR.bill_mng_no());

				msgL.addAll(checkUpdCntrNE(hdrR, Chk01_HdrR.$upd_cntr, chkLockR));

				if (MAC_BILL_CL_TYP.isSEL(hdrR.bill_cl_typ()) ||
						MAC_BILL_CL_TYP.isEACH_SLS(hdrR.bill_cl_typ())) {

					msgL.addAll(check(hdrR, Chk01_HdrR.$inpt_rcv_schd_dt, new FXUCL_RequiredValidater()));
				} else {

					msgL.addAll(check(hdrR, Chk01_HdrR.$inpt_bill_cl_day, new FXUCL_RequiredValidater()));
				}

				hdrR.bill_cl_dt(getBillYmd(hdrR.inpt_bill_ym(), hdrR.inpt_bill_cl_day()));
				
				if(!isNull(chkLockR)) {
					compBase(hdrR,chkLockR);
					msgL.addAll(checkWritableDptCdDac(hdrR, "new_bill_dpt_cd"));
				}
			}
			// 更新カウンタチェック（前受金の入金実績明細）
			msgL.addAll(chkUpdCntrRcvActD());

			return msgL;
		}
		protected MCMessageList chkUpdCntrRcvActD() {
			MCMessageList msgL = new MCMessageList();
			
			MCList<Chk01_DtlR> up1L = up1().subList(r -> !isNull(r.rcv_act_d_no()));
			if (up1L.isEmpty()) {
				return msgL;
			}
			
			MST_RCV_ACT_D_R t1 = MST_RCV_ACT_D_R.create("T1");
			MST_RCV_ACT_R t2 = MST_RCV_ACT_R.create("T2");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
			bldr.setSelect(
				t1.rcv_act_d_no, t1.rcv_act_d_seq, t2.upd_cntr
			);
			bldr.addInnerJoin(t2,
				t2.rcv_act_no.eq(t1.rcv_act_no)
				.and(t2.rcv_act_seq.eq(t1.rcv_act_seq))
			);
			bldr.setLockTable(t2.rcv_act_no);		// 入金実績ヘッダをロック
			MCList<MST_RCV_ACT_D_R> rsltL = MCList.create(MST_RCV_ACT_D_R.class);
			dbSelectKeyForUpdateNoWait("MSBGL0010_MST_RCV_ACT_D_S01", rsltL, bldr, up1L);
			MCIndexKey idx = rsltL.createIndex(
				MST_RCV_ACT_D_R.$rcv_act_d_no, MST_RCV_ACT_D_R.$rcv_act_d_seq);
			
			MCIndexKey up1Idx = up1L.createIndex(Chk01_HdrR.$rec_id);
			for (Chk01_HdrR up0R : up0()) {
				int cnt = msgL.size();
				for (Chk01_DtlR up1R : up1L.subList(up1Idx, up0R.rec_id())) {
					msgL.addAll(
						checkUpdCntrNE(
							up1R,
							Chk01_DtlR.$rcv_act_upd_cntr,
							rsltL.getFirst(idx, up1R.rcv_act_d_no(), up1R.rcv_act_d_seq())
						)
					);
					if (msgL.size() > cnt) {
						for (MCMessage msg : msgL) {
							msg.setCauseRow(up0R, msg.getCauseColumn());
						}
						break;
					}
				}
			}
			
			return msgL;
		}

		protected void compBase(Chk01_HdrR hdrR, MST_BILL_R inptR) {
			hdrR.bcst_cd(inptR.bcst_cd());
			hdrR.bill_dpt_cd(inptR.bill_dpt_cd());
			hdrR.addStringColumn("new_bill_dpt_cd", MSBGL_ArUtil.getBcstDpt(inptR.bcst_cd(), getBillYmd(hdrR.inpt_bill_ym(), hdrR.inpt_bill_cl_day()), inptR.bill_dpt_cd(), inptR.bill_dpt_cd()));
			hdrR.trd_cur_cd(inptR.trd_cur_cd());
			hdrR.iv_no(inptR.iv_no());
			hdrR.wrk_no(inptR.wrk_no());
		}
		
		protected void compBase() {

			MCIndexKey idxkey = _chkLockL.createIndex(MST_BILL_R.$bill_mng_no);

			for (Chk01_HdrR hdrR :up0()) {
				MST_BILL_R inptR = MST_BILL_R.create();
				inptR = _chkLockL.getFirst(idxkey, hdrR.bill_mng_no());
				hdrR.bcst_cd(inptR.bcst_cd());
				hdrR.bill_dpt_cd(inptR.bill_dpt_cd());
				hdrR.addStringColumn("new_bill_dpt_cd", MSBGL_ArUtil.getBcstDpt(inptR.bcst_cd(), getBillYmd(hdrR.inpt_bill_ym(), hdrR.inpt_bill_cl_day()), inptR.bill_dpt_cd(), inptR.bill_dpt_cd()));
				hdrR.trd_cur_cd(inptR.trd_cur_cd());
				setBillXrate(hdrR);
				hdrR.iv_no(inptR.iv_no());
				hdrR.wrk_no(inptR.wrk_no());
			}
		}
		protected void setBillXrate(Chk01_HdrR hdrR) {
			if (isSame(hdrR.trd_cur_cd(), getCo().base_cur_cd())) {
				hdrR.bill_xrate(MCNumber.ONE);
			}
			else if (!getCo().bill_xrate_conv_flg()) {
				hdrR.bill_xrate(null);
			}
		}

		@Override
		protected MCMessageList doServerCheckSub() {

			MCMessageList msgL = super.doServerCheckSub();

			for (Chk01_HdrR hdrR :up0()) {

				if (MAC_BILL_CL_TYP.isSEL(hdrR.bill_cl_typ()) || MAC_BILL_CL_TYP.isEACH_SLS(hdrR.bill_cl_typ())) {

					if (!hdrR.bill_d_sel_flg()) {

						msgL.add(new MCMessage(hdrR, null, MSBGL0080, hdrR.bcst_cd()));
					}
				}
				if (getCo().bill_xrate_conv_flg()) {
					msgL.addAll(check(hdrR, Chk01_HdrR.$bill_xrate, new FXUCL_RequiredValidater()));
				}
			}
			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 */
	public class Upd01 extends MSBGL_BillCl_MC_A.Upd01 {
		protected FXUCL_MCDbcCache<MAM_BP_R> _bpCache = null;
		protected void initBpCache(MCList<Chk01_HdrR> bindL) {
			MAM_BP_R bp = MAM_BP_R.create("BP");
			MCQueryApiBuilder bpBldr = MCQueryApiBuilder.create(bp);
			bpBldr.setSelect(bp.bp_cd);
			bpBldr.addSelect(bp.bill_prnt_typ);
			bpBldr.addSelect(bp.bill_can_slip_typ);
			bpBldr.addSelect(bp.bill_dtl_subttl_typ);
			bpBldr.addSelect(bp.sls_dtl_outp_typ);
			_bpCache = new FXUCL_MCDbcCache<MAM_BP_R>(bpBldr,
					bindL.groupBy(Chk01_HdrR.$bcst_cd), Chk01_HdrR.$bcst_cd);
		}

		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}


		@Override
		protected void doIt() {
			editUp();

			callThisChk01();

			MCList<Chk01_HdrR> notErrL = up0().subList(Chk01_HdrR.$err_flg, false);
			if (notErrL.size() != 0) {
				pre();

				billCl(notErrL);
			}


			// マルチスレッドで処理していない場合にのみ、印刷をここで実行する
			if (!MCServerThreadManager.isChildThread()) {
				
				MCList<Chk01_HdrR> notErrPrtL = up0().subList(Chk01_HdrR.$err_flg, false);
				MCList<Chk01_HdrR> prtL = MCList.create(Chk01_HdrR.class);

				for (Chk01_HdrR prtR:notErrPrtL) {
					MAM_BP_R bpR = MAM_BP_R.create();
					bpR = _bpCache.get(prtR.bcst_cd());

					if (isNull(bpR.bill_prnt_typ()) || MAC_BILL_PRNT_TYP.isBILL_CL(bpR.bill_prnt_typ())) {
						prtL.add(prtR);
					}
				}
				execBillPrnt(prtL);
			}
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		@Override
		protected <T extends MCRow> MCList<T> getSplitList(MCParam p) {
			return (MCList<T>) up0();
		}

		@Override
		protected <T extends MCRow> void setUpListParam(int blockNo, MCList<T> dest, MCList<T> src) {
			if (blockNo == 1) {
				dest.addAll((MCList<T>)up1());
			}
			else {
				super.setUpListParam(blockNo, dest, src);
			}
		}

		@Override
		protected <T extends MCOperation> void setDownParm(MCParam p, List<T> opL) {
			super.setDownParm(p, opL);
			// マルチスレッドの場合は、スレッドが Join した後に請求書Ｎｏでソートしてまとめて印刷する
			// （スレッドごとに印刷すると、印刷順が請求書Ｎｏ順にならないため）
			down0().sort(Chk01_HdrR.$bill_no);

			MCList<Chk01_HdrR> notErrPrtL = up0().subList(Chk01_HdrR.$err_flg, false);
			MCList<Chk01_HdrR> prtL = MCList.create(Chk01_HdrR.class);

			if (_bpCache == null) {
				initBpCache(up0());
			}

			for (Chk01_HdrR prtR:notErrPrtL) {

				MAM_BP_R bpR = MAM_BP_R.create();
				bpR = _bpCache.get(prtR.bcst_cd());

				if (isNull(bpR.bill_prnt_typ()) || MAC_BILL_PRNT_TYP.isBILL_CL(bpR.bill_prnt_typ())) {
					prtL.add(prtR);
				}
			}
			execBillPrnt(prtL);
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBGL_BillCl.Chk01 ope = MSBGL_BillCl.crtChk01();

			ope.up0().setAll(up0());
			ope.up1().setAll(up1());
			ope.exec();

			up0().setAll(ope.down0());
			up1().setAll(ope.down1());
		}


		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(up0());			
		}

		/**
		 * 前処理<br>
		 * ワークテーブルの削除
		 * 上り電文のソート
		 */
		protected void pre() {

			MSW_BILL_R t = MSW_BILL_R.create("T");
			MSW_BILL_D_R t1 = MSW_BILL_D_R.create("T");
			MSW_RCV_ACT_D_R t2 = MSW_RCV_ACT_D_R.create("T");

			execDbWkDelete("MSBGL0010_MSW_BILL_D01", t);
			execDbWkDelete("MSBGL0010_MSW_BILL_D_D01", t1);
			execDbWkDelete("MSBGL0010_MSW_RCV_ACT_D_D01", t2);

			//請求先ＣＤ、請求部門ＣＤ、通貨ＣＤ、インボイスＮＯ、案件ＮＯの昇順で並び替える
			up0().sort(
					Chk01_HdrR.$bcst_cd, 
					Chk01_HdrR.$bill_dpt_cd, 
					Chk01_HdrR.$trd_cur_cd, 
					Chk01_HdrR.$iv_no, 
					Chk01_HdrR.$wrk_no
					);
			initBpCache(up0());
		}

		/**
		 * 請求締処理（上り電文のリストに対する処理）<br>
		 * 下り電文に締処理結果を設定する<br>
		 * ヘッダ１行ごとにcommitまたはrollback処理を実施する
		 * @param notErrL 
		 */
		protected void billCl(MCList<Chk01_HdrR> notErrL) {

			// １行ごとの処理
			for (Chk01_HdrR hdrR : notErrL) {

				MCSavepoint sp = dbTran().setSavepoint();

				try {

					// 請求締処理
					hdrR = billCl(hdrR);
					handleSuccess(hdrR);
				}
				catch (MCException ex) {
					handleEx(ex, hdrR, sp);
					continue;
				}
			}
		}



		/**
		 * 請求締処理を実施する
		 * 
		 * @param hdrR 締処理条件
		 */
		protected Chk01_HdrR billCl(Chk01_HdrR hdrR) {

			MCList<MST_BILL_R> billL = getTrgtBill(hdrR);

			MCList<MST_BILL_D_R> billDL = getTrgtBillD(hdrR);

			billDL = setClFlg(billDL, hdrR, up1());

			MCList<MST_RCV_ACT_D_R> rcvActDL = getTrgtRcvActD(hdrR, up1());
			hdrR = billCl(hdrR, billL, billDL, rcvActDL);

			return hdrR;

		}

		/**
		 * 未請求の請求情報を全て取得する
		 * 
		 * @param hdrR 締処理条件
		 * @return 締対象である可能性のある請求情報
		 */
		protected MCList<MST_BILL_R> getTrgtBill(Chk01_HdrR hdrR) {


			MCList<MST_BILL_R> billL = MCList.create(MST_BILL_R.class);
			MST_BILL_R t = MST_BILL_R.create("T");
			MCQueryApiBuilder billL_bldr = MCQueryApiBuilder.create(t);

			setTrgtBillCnd(billL , t, billL_bldr);

			dbSelect("MSBGL0010_MST_BILL_S03", billL, billL_bldr, hdrR);

			billL.setDateNE("inpt_bill_cl_dt", getBillYmd(hdrR.inpt_bill_ym(),hdrR.inpt_bill_cl_day()));
			billL.addDateColumn("inpt_rcv_schd_dt", hdrR.inpt_rcv_schd_dt());
			billL.setNumberNE(MST_BILL_R.$bill_xrate, hdrR.bill_xrate());
			billL.setAttributes(hdrR);

			return billL;

		}

		/**
		 * 未請求の請求情報を取得するための条件を設定する
		 * 
		 * @param billL 設定対象のDBC
		 */
		protected void setTrgtBillCnd(MCList<MST_BILL_R> billL, MST_BILL_R list, MCQueryApiBuilder builder) {

			builder.setSelect(list.bill_mng_no);
			builder.addSelect(list.bcst_cd);
			builder.addSelect(list.bill_dpt_cd);
			builder.addSelect(list.bill_cl_dt);
			builder.addSelect(list.iv_no);
			builder.addSelect(list.trd_cur_cd);
			builder.addSelect(list.wrk_no);

			builder.setWhere(list.bcst_cd.eq(bind("bcst_cd")));
			builder.addWhereWithAnd(list.bill_dpt_cd.eq(bind("bill_dpt_cd")));
			builder.addWhereWithAnd(list.trd_cur_cd.eq(bind("trd_cur_cd")));
			builder.addWhereWithAnd(list.iv_no.eq(bind("iv_no")));
			builder.addWhereWithAnd(bracket(list.wrk_no.eq(bind("wrk_no"))
					.or(list.wrk_no.isNull())
					.and(bind("wrk_no").isNull())));
			builder.addWhereWithAnd(
					value(MSC_BILL_CL_STS_TYP.NOT_BILL.value()).eq(list.bill_cl_sts_typ));

		}


		/**
		 * 未請求の請求明細を全て取得する<br>
		 * 画面で請求明細を選択していない場合はマスタに従って請求締対象フラグも立てる
		 * 
		 * @param hdrR 締処理条件
		 * @return 締対象である可能性のある請求明細
		 */
		protected MCList<MST_BILL_D_R> getTrgtBillD(Chk01_HdrR hdrR) {

			MCList<MST_BILL_D_R> billDL = MCList.create(MST_BILL_D_R.class);
			MST_BILL_D_R t = MST_BILL_D_R.create("T");
			MCQueryApiBuilder billDL_bldr = MCQueryApiBuilder.create(t);

			setTrgtBillDCnd(billDL, hdrR, t, billDL_bldr);

			dbSelect("MSBGL0010_MST_BILL_D_S01", billDL, billDL_bldr, hdrR);

			return billDL;

		}

		/**
		 * 未請求の請求情報明細を取得するための条件を設定する
		 * 
		 * @param billL 設定対象のDBC
		 * @param hdrR 締処理条件
		 */
		protected void setTrgtBillDCnd(MCList<MST_BILL_D_R> billDL, Chk01_HdrR hdrR, MST_BILL_D_R list, MCQueryApiBuilder builder) {

			billDL.addBooleanColumn("cl_flg");
			MST_BILL_R bill1 = MST_BILL_R.create("BILL1");
			MST_BILL_ACST_R billAcst = MST_BILL_ACST_R.create("BILLACST");

			builder.setSelect(list.bill_d_no);
			builder.addSelect(list.bill_mng_no);
			builder.addSelect(list.bill_d_typ);
			builder.addSelect(list.act_d_no);
			builder.addSelect(list.act_d_seq);
			builder.addSelect(list.slip_sts_typ);
			builder.addSelect(list.bill_mtd_typ);
			builder.addSelect(
					cases()
					.when(list.crryovr_flg.eq(value(true)))
						.then(value(true))
					.when(list.bill_mtd_typ.eq(value(MSC_BILL_MTD_TYP.PART_BILL.value())))
						.then(value(true))
					.otherwise(value(false)).as("crryovr_flg"));
			builder.addSelect(list.dlv_dt);
			builder.addSelect(list.ac_dt);
			builder.addSelect(list.dlv_slip_no);
			builder.addSelect(list.itm_cd);
			builder.addSelect(list.itm_sub1);
			builder.addSelect(list.itm_sub2);
			builder.addSelect(list.itm_sub3);
			builder.addSelect(list.itm_nm);
			builder.addSelect(list.cst_itm_cd);
			builder.addSelect(list.cst_itm_nm);
			builder.addSelect(list.trd_unit_qty);
			builder.addSelect(list.trd_unit_cd);
			builder.addSelect(list.trd_cur_upri);
			builder.addSelect(list.trd_cur_amt);
			builder.addSelect(list.trd_cur_tax_amt);
			builder.addSelect(list.tax_cd);
			builder.addSelect(list.trd_d_rmrks);
			builder.addSelect(list.bill_d_rmrks);
			builder.addSelect(list.wrk_no);
			builder.addSelect(list.cst_cd);
			builder.addSelect(list.dlv_cd);
			builder.addSelect(billAcst.acst_cd);
			builder.activeForeign("BILL1");
			builder.addInnerJoin(billAcst, bracket(list.bill_acst_no.eq(billAcst.bill_acst_no)));
			builder.addWhereWithAnd(bill1.bcst_cd.eq(bind("bcst_cd")));
			builder.addWhereWithAnd(bill1.bill_dpt_cd.eq(bind("bill_dpt_cd")));
			builder.addWhereWithAnd(bill1.trd_cur_cd.eq(bind("trd_cur_cd")));
			builder.addWhereWithAnd(bill1.iv_no.eq(bind("iv_no")));
			builder.addWhereWithAnd(bracket(bill1.wrk_no.eq(bind("wrk_no"))
					.or(bill1.wrk_no.isNull())
					.and(bind("wrk_no").isNull())));
			builder.addWhereWithAnd(bill1.bill_cl_sts_typ.eq(value(MSC_BILL_CL_STS_TYP.NOT_BILL.value())));
			// 画面で選択されている場合は後で設定
			if (hdrR.bill_d_sel_flg()) {
			builder.addSelect(value(false).as("cl_flg")); // cl_flg
			}
			// 画面で選択されていない場合はマスタに従って設定
			else {
				builder.addSelect(MSPA_AR_UTIL$F_GET_BILL_CL_FLG2(
						bind("bcst_cd"),
						list.bill_basis_dt,
						list.bill_crryovr_times,
						bind("inpt_bill_ym"),
						bind("inpt_bill_cl_day")).as("cl_flg")); // cl_flg
			}
		}


		/**
		 * 締対象の請求明細であるかどうかを取得するファンクションのStringを取得する
		 * 
		 * @param hdrR 締処理条件
		 * @return 請求締対象フラグを取得するファンクションのString
		 */
		protected String getBillClFlgFunc(Chk01_HdrR hdrR) {

			String str = null;

			// 画面で選択されている場合は後で設定
			if (hdrR.bill_d_sel_flg()) {
				str = "'0'";
			}
			// 画面で選択されていない場合はマスタに従って設定
			else {
				str = "MSPA_AR_UTIL.F_GET_BILL_CL_FLG (" +
						":bcst_cd, " +
						"T.bill_basis_dt, " +
						"T.bill_crryovr_times, " +
						":inpt_bill_ym, " +
						":inpt_bill_cl_day)";
			}

			return str;

		}

		/**
		 * 締対象の請求明細に締対象フラグを立てる
		 * 
		 * @param billDL フラグを設定する対象の請求明細
		 * @param hdrR 締処理条件
		 * @param dtlL 画面で選択した締処理対象
		 * @return 締対象フラグを立てた請求明細
		 */
		protected MCList<MST_BILL_D_R> setClFlg(MCList<MST_BILL_D_R> billDL, Chk01_HdrR hdrR, MCList<Chk01_DtlR> dtlL) {

			if (hdrR.bill_d_sel_flg()) {

				MCIndexKey billDIdIdx = billDL.createIndex(MST_BILL_D_R.$bill_d_no);

				for (Chk01_DtlR dtlR : dtlL) {
					MST_BILL_D_R billDR = billDL.getFirst(billDIdIdx, dtlR.bill_d_no());
					if (!isNull(billDR)) {
						billDR.setBoolean("cl_flg", true);
						billDR.addNumberColumn("amt", dtlR.amt());
						billDR.addNumberColumn("tax_amt", dtlR.tax_amt());
						billDR.bill_prnt_tgt_flg(dtlR.bill_prnt_tgt_flg());
						billDR.bill_mtd_typ(dtlR.bill_mtd_typ());
						billDR.setAttributesByName(dtlR);
					}
				}

			}
			else {
				for (MST_BILL_D_R billDR :billDL) {
					billDR.bill_prnt_tgt_flg(true);
					billDR.bill_mtd_typ(MSC_BILL_MTD_TYP.ALL_BILL.value());
					billDR.addNumberColumn("amt", MCNumber.ZERO);
					billDR.addNumberColumn("tax_amt", MCNumber.ZERO);
				}
				MAM_BP_R bcstR = _bpCache.get(hdrR.bcst_cd());
				MSBGL_BillClService.setBillPrntTgtFlg(billDL, bcstR);
			}

			return billDL;

		}
		/**
		 * 請求対象となる前受金の入金実績を全て取得する<br>
		 */
		protected MCList<MST_RCV_ACT_D_R> getTrgtRcvActD(Chk01_HdrR hdrR, MCList<Chk01_DtlR> dtlL) {
			MCList<MST_RCV_ACT_D_R> tgtL = MCList.create(MST_RCV_ACT_D_R.class);
			if (hdrR.bill_d_sel_flg()) {
				// ヘッダに紐付く明細のうち、前受金のみ請求対象とする
				MCList<Chk01_DtlR> tgtAdvL =
					dtlL.subList(r -> !isNull(r.rcv_act_d_no()) && isSame(r.rec_id(), hdrR.rec_id()));
				for (Chk01_DtlR r : tgtAdvL) {
					MST_RCV_ACT_D_R tgtR = tgtL.add();
					tgtR.rcv_act_d_no(r.rcv_act_d_no());
					tgtR.rcv_act_d_seq(r.rcv_act_d_seq());
				}
			}
			else {
				MCList<MST_RCV_ACT_D_R> tgtAdvL =
					MSBGL_ArUtil.getBillClAdvL(hdrR.bcst_cd(), hdrR.bill_dpt_cd(), hdrR.trd_cur_cd());
				if (!tgtAdvL.isEmpty()) {
					// 請求明細選択で選択されていない前受金のみ請求対象とする
					MCIndexKey idx = dtlL.createIndex(Chk01_DtlR.$rcv_act_d_no, Chk01_DtlR.$rcv_act_d_seq);
					for (MST_RCV_ACT_D_R advR : tgtAdvL) {
						if (isNull(dtlL.getFirst(idx, advR.rcv_act_d_no(), advR.rcv_act_d_seq()))) {
							tgtL.add(advR);
						}
					}
				}
			}
			
			MST_RCV_ACT_D_R t = MST_RCV_ACT_D_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(
				t.rcv_act_d_no, t.rcv_act_d_seq, t.rcv_act_no, t.rcv_act_seq
			);
			
			MCList<MST_RCV_ACT_D_R> rsltL = MCList.create(MST_RCV_ACT_D_R.class);
			dbSelectKey("MSBGL0010_RCV_ACT_D_S01", rsltL, bldr, tgtL);
			
			rsltL.forEach(r -> {
				r.bill_mng_no(hdrR.bill_mng_no());
			});
			
			return rsltL;
		}

		/**
		 * 請求締処理を呼び出す<br>
		 * 請求書Ｎｏと請求管理NOを結果に受ける
		 * 
		 * @param hdrR 請求締処理の条件を含んだコンテナ
		 * @param billL 請求
		 * @param billDL 請求明細
		 * @return 発行した請求書Ｎｏを含んだ下り電文用コンテナ
		 */
		protected Chk01_HdrR billCl(
			Chk01_HdrR hdrR, MCList<MST_BILL_R> billL, MCList<MST_BILL_D_R> billDL, MCList<MST_RCV_ACT_D_R> rcvActDL) {

			MCList<MSW_BILL_R> wBillL = MCList.create(MSW_BILL_R.class);
			MCList<MSW_BILL_D_R> wBillDL = MCList.create(MSW_BILL_D_R.class);
			MCList<MSW_RCV_ACT_D_R> wRcvActDL = MCList.create(MSW_RCV_ACT_D_R.class);

			addAll(wBillL, billL, createMapWorkBill());
			addAll(wBillDL, billDL, createMapWorkBillD());
			addAll(wRcvActDL, rcvActDL, createMapWorkRcvActD());

			MCQueryApiBuilder wBillL_bldr = MCQueryApiBuilder.create(MSW_BILL_R.create("T"));
			dbInsert("MSBGL0010_MSW_BILL_I01", wBillL, wBillL_bldr);
			MCQueryApiBuilder wBillDL_bldr = MCQueryApiBuilder.create(MSW_BILL_D_R.create("T"));
			dbInsert("MSBGL0010_MSW_BILL_D_I01", wBillDL, wBillDL_bldr);
			MCQueryApiBuilder wRcvActDL_bldr = MCQueryApiBuilder.create(MSW_RCV_ACT_D_R.create("T"));
			dbInsert("MSBGL0010_MSW_RCV_ACT_D_I01", wRcvActDL, wRcvActDL_bldr);

			mcframe.serverMSBG.MSBGL5030.MSBGL_BillClService.BillCl_Upd02 upd02 = 
					mcframe.serverMSBG.MSBGL5030.MSBGL_BillClService.crtBillCl_Upd02();

			BillCl_Upd02_HdrR billClR = BillCl_Upd02_HdrR.create();
			copy(billClR, hdrR, createMapBillClReg());

			upd02.up0().add(billClR);
			upd02.exec();

			billClR = upd02.down0().get(0);
			createMap_Chk01_HdrR_BillCl_Upd02_HdrR().copy(hdrR, billClR);

			MSW_BILL_R t = MSW_BILL_R.create("T");
			execDbWkDelete("MSBGL0010_MSW_BILL_D02", t);
			MSW_BILL_D_R t1 = MSW_BILL_D_R.create("T");
			execDbWkDelete("MSBGL0010_MSW_BILL_D_D02", t1);
			MSW_RCV_ACT_D_R t2 = MSW_RCV_ACT_D_R.create("T");
			execDbWkDelete("MSBGL0010_MSW_RCV_ACT_D_D02", t2);

			return hdrR;

		}

		/**
		 * 請求書発行
		 * @param prtL 
		 */
		protected void execBillPrnt(MCList<Chk01_HdrR> prtL) {
			if (isNull(prtL)) {
				return;
			}
			MSBGL_BillPrntService.Bill_Prnt01 billPrnt01Serv = MSBGL_BillPrntService.crtBill_Prnt01();
			addAll(billPrnt01Serv.up0(), prtL, createMap_Bill_Prnt01_HdrR_Chk01_HdrR());
			billPrnt01Serv.up1().indiv_prnt_flg(up2().indiv_prnt_flg());

			billPrnt01Serv.exec();
			

			MCIndexKey ik = billPrnt01Serv.down0().createIndex(Bill_Prnt01_HdrR.$bill_mng_no, Bill_Prnt01_HdrR.$bill_no);

			for (Chk01_HdrR r :up0()) {
				Bill_Prnt01_HdrR down = billPrnt01Serv.down0().getFirst(ik, r.bill_mng_no(), r.bill_no());
				if (down == null) {
					continue;
				}
				else if (down.err_flg()) {
					r.err_flg(true);
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
				else {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		protected Map_MSW_BILL_R_MST_BILL_R<MSW_BILL_R,MST_BILL_R> createMapWorkBill() {
			return new Map_MSW_BILL_R_MST_BILL_R<MSW_BILL_R, MST_BILL_R>();
		}

		public class Map_MSW_BILL_R_MST_BILL_R<D extends MSW_BILL_R, S extends MST_BILL_R> extends MCRowMapper<D,S>{

			@Override
			protected void valueCopy(D dest, S src) {
				dest.dat_cntr(MCNumber.ONE);
			}

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MSW_BILL_R.$bill_mng_no, MST_BILL_R.$bill_mng_no);
				addColumnPathMap(MSW_BILL_R.$bcst_cd, MST_BILL_R.$bcst_cd);
				addColumnPathMap(MSW_BILL_R.$bill_dpt_cd, MST_BILL_R.$bill_dpt_cd);
				addColumnPathMap(MSW_BILL_R.$bill_cl_dt, MST_BILL_R.$bill_cl_dt);
				addColumnPathMap(MSW_BILL_R.$iv_no, MST_BILL_R.$iv_no);
				addColumnPathMap(MSW_BILL_R.$trd_cur_cd, MST_BILL_R.$trd_cur_cd);
				addColumnPathMap(MSW_BILL_R.$bill_xrate, MST_BILL_R.$bill_xrate);
				addColumnPathMap(MSW_BILL_R.$wrk_no, MST_BILL_R.$wrk_no);
				addColumnPathMap(MSW_BILL_R.$inpt_rcv_schd_dt, "inpt_rcv_schd_dt");
				addColumnPathMap(MSW_BILL_R.$inpt_bill_cl_dt, "inpt_bill_cl_dt");
			}
		}

		protected Map_MSW_BILL_D_R_MST_BILL_D_R<MSW_BILL_D_R,MST_BILL_D_R> createMapWorkBillD() {
			return new Map_MSW_BILL_D_R_MST_BILL_D_R<MSW_BILL_D_R, MST_BILL_D_R>();
		}

		public class Map_MSW_BILL_D_R_MST_BILL_D_R<D extends MSW_BILL_D_R, S extends MST_BILL_D_R> extends MCRowMapper<D,S>{
			@Override
			public void valueCopy(D dest, S src) {

				dest.dat_cntr(MCNumber.ONE);
			}
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MSW_BILL_D_R.$bill_d_no, MST_BILL_D_R.$bill_d_no);
				addColumnPathMap(MSW_BILL_D_R.$bill_mng_no, MST_BILL_D_R.$bill_mng_no);
				addColumnPathMap(MSW_BILL_D_R.$bill_mtd_typ, MST_BILL_D_R.$bill_mtd_typ);
				addColumnPathMap(MSW_BILL_D_R.$bill_prnt_tgt_flg, MST_BILL_D_R.$bill_prnt_tgt_flg);
				addColumnPathMap(MSW_BILL_D_R.$amt, "amt");
				addColumnPathMap(MSW_BILL_D_R.$tax_amt, "tax_amt");
				addColumnPathMap(MSW_BILL_D_R.$cl_flg, "cl_flg");

			}
		}
		protected Map_MSW_RCV_ACT_D_R_MST_RCV_ACT_D_R<MSW_RCV_ACT_D_R,MST_RCV_ACT_D_R> createMapWorkRcvActD() {
			return new Map_MSW_RCV_ACT_D_R_MST_RCV_ACT_D_R<MSW_RCV_ACT_D_R, MST_RCV_ACT_D_R>();
		}
		public class Map_MSW_RCV_ACT_D_R_MST_RCV_ACT_D_R<D extends MSW_RCV_ACT_D_R, S extends MST_RCV_ACT_D_R> extends MCRowMapper<D,S>{
			@Override
			public void valueCopy(D dest, S src) {
				dest.dat_cntr(MCNumber.ONE);
			}
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MSW_RCV_ACT_D_R.$rcv_act_d_no, MST_RCV_ACT_D_R.$rcv_act_d_no);
				addColumnPathMap(MSW_RCV_ACT_D_R.$rcv_act_d_seq, MST_RCV_ACT_D_R.$rcv_act_d_seq);
				addColumnPathMap(MSW_RCV_ACT_D_R.$rcv_act_no, MST_RCV_ACT_D_R.$rcv_act_no);
				addColumnPathMap(MSW_RCV_ACT_D_R.$rcv_act_seq, MST_RCV_ACT_D_R.$rcv_act_seq);
				addColumnPathMap(MSW_RCV_ACT_D_R.$bill_mng_no, MST_RCV_ACT_D_R.$bill_mng_no);
			}
		}

		protected Map_BillCl_Upd02_HdrR_Chk01_HdrR<BillCl_Upd02_HdrR,Chk01_HdrR> createMapBillClReg() {
			return new Map_BillCl_Upd02_HdrR_Chk01_HdrR<BillCl_Upd02_HdrR, Chk01_HdrR>();
		}

		public class Map_BillCl_Upd02_HdrR_Chk01_HdrR<D extends BillCl_Upd02_HdrR, S extends Chk01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(BillCl_Upd02_HdrR.$bcst_cd, Chk01_HdrR.$bcst_cd);
				addColumnPathMap(BillCl_Upd02_HdrR.$bill_dpt_cd, Chk01_HdrR.$bill_dpt_cd);
				addColumnPathMap(BillCl_Upd02_HdrR.$iv_no, Chk01_HdrR.$iv_no);
				addColumnPathMap(BillCl_Upd02_HdrR.$trd_cur_cd, Chk01_HdrR.$trd_cur_cd);
				addColumnPathMap(BillCl_Upd02_HdrR.$wrk_no, Chk01_HdrR.$wrk_no);
				addColumnPathMap(BillCl_Upd02_HdrR.$bill_d_sel_flg, Chk01_HdrR.$bill_d_sel_flg);

			}


		}
		protected Map_Chk01_HdrR_BillCl_Upd02_HdrR<Chk01_HdrR,BillCl_Upd02_HdrR> createMap_Chk01_HdrR_BillCl_Upd02_HdrR() {
			return new Map_Chk01_HdrR_BillCl_Upd02_HdrR<Chk01_HdrR, BillCl_Upd02_HdrR>();
		}

		public class Map_Chk01_HdrR_BillCl_Upd02_HdrR<D extends Chk01_HdrR, S extends BillCl_Upd02_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk01_HdrR.$bill_no, BillCl_Upd02_HdrR.$bill_no);
				addColumnPathMap(Chk01_HdrR.$bill_mng_no, BillCl_Upd02_HdrR.$bill_mng_no);

			}
		}

		protected void handleSuccess(Chk01_HdrR hdrR) {
			dbTran().commit();
			hdrR.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
		}

		protected void handleEx(MCException e, Chk01_HdrR hdrR, MCSavepoint sp) {

			dbTran().rollback(sp);

			if (isNull(e.getCauseRow())) {
				e.setCauseRow(hdrR, null);
			}
			MCMessageList msg = new MCMessageList();
			msg.add(e.getMCMessage());
			MCMessagePool.addAll(msg);
			hdrR.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			hdrR.err_flg(true);
		}

		protected void handleSuccess(MCList<Chk01_HdrR> l) {
			dbTran().commit();
			for (Chk01_HdrR r : l) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}
		protected void handleEx(Exception e,
				MCList<Chk01_HdrR> l) {
			dbTran().rollback();

			MCException mcex;
			if (e instanceof MCException) {
				mcex = (MCException)e;
			}
			else {
				mcex = new MCException(e);
			}
			MCLog.write(mcex);
			MCMessage msg = mcex.getMCMessage();
			MCMessagePool.add(msg);
			MCMessagePool.addAll(mcex.getCauseMessageList());
			for (Chk01_HdrR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
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
	 * Chk02オペレーション.<p>
	 *
	 */
	public class Chk02 extends MSBGL_BillCl_MC_A.Chk02 {

		protected MCList<MST_BILL_R> _chkLockL = MCList.create(MST_BILL_R.class);

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 更新カウンタチェック
			MCQueryApiBuilder chkLockL_bldr = MCQueryApiBuilder.create(MST_BILL_R.create("T"));
			dbSelectKeyForUpdate("MSBGL0010_MST_BILL_S04", _chkLockL, chkLockL_bldr, up0());

			MCIndexKey idxkey = _chkLockL.createIndex(MST_BILL_R.$bill_mng_no);

			for (Chk02_HdrR hdrR :up0()) {

				MST_BILL_R chkLockR = MST_BILL_R.create();
				chkLockR = _chkLockL.getFirst(idxkey, hdrR.bill_mng_no());

				msgL.addAll(checkUpdCntrNE(hdrR, Chk01_HdrR.$upd_cntr, chkLockR));
				
				if(!isNull(chkLockR)) {
					compBase(hdrR,chkLockR);
					// DACチェック
					msgL.addAll(checkWritableDptCdDac(hdrR, Chk01_HdrR.$bill_dpt_cd));
				}
			}

			return msgL;
		}

		protected void compBase(Chk02_HdrR hdrR,MST_BILL_R inptR) {
			hdrR.bill_dpt_cd(inptR.bill_dpt_cd());
		}
		
		protected void compBase() {

			MCIndexKey idxkey = _chkLockL.createIndex(MST_BILL_R.$bill_mng_no);

			for (Chk02_HdrR hdrR :up0()) {
				MST_BILL_R inptR = MST_BILL_R.create();
				inptR = _chkLockL.getFirst(idxkey, hdrR.bill_mng_no());
				hdrR.bill_dpt_cd(inptR.bill_dpt_cd());
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
	 * Del01オペレーション.<p>
	 *
	 */
	public class Del01 extends MSBGL_BillCl_MC_A.Del01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {
			editUp();

			callThisChk02();

			MCList<Chk02_HdrR> notErrL = up0().subList(Chk02_HdrR.$err_flg, false);
			if (notErrL.size() != 0) {
				billClDel(notErrL);
			}

		}

		/**
		 * 請求締解除処理（上り電文のリストに対する処理）<br>
		 * @param notErrL 
		 */
		protected void billClDel(MCList<Chk02_HdrR> notErrL) {

			// 請求締処理
			callBillClDelServ(notErrL);

		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(up0());			
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk02() {

			MSBGL_BillCl.Chk02 ope = MSBGL_BillCl.crtChk02();

			ope.up0().setAll(up0());
			ope.exec();

			up0().setAll(ope.down0());
		}

		/**
		 * 請求締解除処理を実行する
		 */
		protected void callBillClDelServ(MCList<Chk02_HdrR> mcList) {
			for (Chk02_HdrR hdrR : mcList) {
				
				MCSavepoint sp = dbTran().setSavepoint();
				
				MSBGL_BillClService.BillCl_Del01 ope = MSBGL_BillClService.crtBillCl_Del01();
				BillCl_Del01_CndR cndR = MSBGL_BillClService.crtBillCl_Del01().createBillCl_Del01_CndR();
				createMap_BillCl_Del01_CndR_Chk02_HdrR().copy(cndR, hdrR);
				ope.up0().add(cndR);
				
				try {
					ope.exec();
					handleSuccess(hdrR);
				}
				catch (MCException ex) {
					handleEx(ex, hdrR, sp);
				}
			}
		}

		protected void handleSuccess(Chk02_HdrR hdrR) {
			dbTran().commit();
			hdrR.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
		}

		protected void handleEx(MCException e, Chk02_HdrR hdrR, MCSavepoint sp) {
			
			dbTran().rollback(sp);
			
			if (isNull(e.getCauseRow())) {
				e.setCauseRow(hdrR, null);
			}
			MCMessageList msg = new MCMessageList();
			msg.add(e.getMCMessage());
			MCMessagePool.addAll(msg);
			hdrR.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			hdrR.err_flg(true);
		}

		protected Map_BillCl_Del01_CndR_Chk02_HdrR<BillCl_Del01_CndR,Chk02_HdrR> createMap_BillCl_Del01_CndR_Chk02_HdrR() {
			return new Map_BillCl_Del01_CndR_Chk02_HdrR<BillCl_Del01_CndR, Chk02_HdrR>();
		}

		public class Map_BillCl_Del01_CndR_Chk02_HdrR<D extends BillCl_Del01_CndR, S extends Chk02_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(BillCl_Del01_CndR.$bill_mng_no, Chk02_HdrR.$bill_mng_no);

			}
		}
		protected void handleSuccess(MCList<Chk02_HdrR> l) {
			dbTran().commit();
			for (Chk02_HdrR r : l) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}
		protected void handleEx(Exception e,
				MCList<Chk02_HdrR> l) {
			dbTran().rollback();

			MCException mcex;
			if (e instanceof MCException) {
				mcex = (MCException)e;
			}
			else {
				mcex = new MCException(e);
			}
			MCLog.write(mcex);
			MCMessage msg = mcex.getMCMessage();
			MCMessagePool.add(msg);
			MCMessagePool.addAll(mcex.getCauseMessageList());
			for (Chk02_HdrR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
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
	 * 請求締年月日から請求締年月と請求締日を設定する。<BR>
	 * 
	 * @param rlstL 検索結果
	 * @param reqClDay 請求締日が必要な場合に true
	 */
	protected void setBillClInfo(MCList<Srch02_HdrR> rlstL, boolean reqClDay) {

		for (Srch02_HdrR r : rlstL) {

			if (!isNull(r.last_bill_cl_dt())) {
				r.last_bill_ym(r.last_bill_cl_dt().trunc(MCDate.MONTH));
				if (reqClDay) {
					r.last_bill_cl_day(Integer.parseInt(r.last_bill_cl_dt().toString("dd")));
				}
			}
		}
	}


	/**
	 * 請求締年月日の設定
	 * 
	 * @param hdrR 締処理条件
	 * @return 請求締年月日
	 */
	protected MCDate getBillYmd(MCDate base, MCNumber bill_cl_day) {

		if (isNull(bill_cl_day) || isSame(bill_cl_day, 0)) {
			return base;
		}

		MCDate tmp = base.addDay(bill_cl_day).addDay(-1);

		if (tmp.getMonth() != base.getMonth()) {
			return base.endOfMonth();
		}
		else {
			return tmp;
		}
	}

	protected Map_Bill_Prnt01_HdrR_Chk01_HdrR<Bill_Prnt01_HdrR,Chk01_HdrR> createMap_Bill_Prnt01_HdrR_Chk01_HdrR() {
		return new Map_Bill_Prnt01_HdrR_Chk01_HdrR<Bill_Prnt01_HdrR, Chk01_HdrR>();
	}

	public class Map_Bill_Prnt01_HdrR_Chk01_HdrR<D extends Bill_Prnt01_HdrR, S extends Chk01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Bill_Prnt01_HdrR.$bill_mng_no, Chk01_HdrR.$bill_mng_no);
			addColumnPathMap(Bill_Prnt01_HdrR.$bill_no, Chk01_HdrR.$bill_no);
		}
	}

	//FMCB CUSTOM END
}