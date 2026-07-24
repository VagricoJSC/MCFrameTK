package mcframe.serverMSBG.MSBGL0160;

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
import mcframe.serverMSBG.MSBGL0160.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.commonCore.container.MCRow.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.serverMSBG.MSBGL0160.Query.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;

import java.util.HashMap;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBGL_RcvDivReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBGL_RcvDivReg_MC extends MSBGL_RcvDivReg_MC_A{
	//FMCB CUSTOM START

	/**
	* 引継の入金情報のキャッシュ
	*/
	protected static final Class<MSBGL_RcvDivReg> CLAZZ = MSBGL_RcvDivReg.class;
	protected FXUCL_MCDbcCache<MST_RCV_R> _rcvCache = null;

	// チェック処理でキャッシュを初期化する
	protected static void initRcvCache(MST_RCV_R rctR, MST_RCV_R t, MCQueryApiBuilder rcvR_bldr) {
		object(CLAZZ)._initRcvCache(rctR, t, rcvR_bldr);
	}

	protected void _initRcvCache(MST_RCV_R rcvR, MST_RCV_R t, MCQueryApiBuilder rcvR_bldr) {
		_rcvCache = new FXUCL_MCDbcCache<MST_RCV_R>(rcvR_bldr);
	}

	protected static MST_RCV_R getRcvCache(String rcvNo) {
		return object(CLAZZ)._rcvCache.get(rcvNo);
	}

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 分割元の入金、入金予定情報を検索する。<br>
	 */
	public class Srch01 extends MSBGL_RcvDivReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			// 入金情報
			Srch01_HdrR hdrR = srchRcv();

			if (!chkRcv(hdrR)) {
				return;
			}

			// 入金分割先
			MCList<Srch01_RcvDivR> rcvDivL = srchRcvDiv(hdrR);

			// 入金予定
			MCList<Srch01_RcvSchdR> rcvSchdL = srchRcvSchd(hdrR);

			MCRow.copyall(down0(), hdrR);
			down1().addAll(rcvDivL);
			down2().addAll(rcvSchdL);
		}

		/**
		 * 入金情報検索
		 * @return
		 */
		protected Srch01_HdrR srchRcv() {
			Srch01_HdrR hdrR = Srch01_HdrR.create();
			executeQuery(hdrR, MSBGL0160_MST_RCV_S01(), up0());
			return hdrR;
		}

		/**
		 * 入金情報チェック
		 * @param hdrR
		 * @return
		 */
		protected boolean chkRcv(Srch01_HdrR hdrR) {

			if (hdrR.isEmpty()) {
				return false;
			}

			// データ区分が「3:入金登録」または「1.仮受登録」以外の場合は、エラー
			if (!(MSC_RCV_DAT_TYP.isRCV(hdrR.rcv_dat_typ())
					|| MSC_RCV_DAT_TYP.isSUSP(hdrR.rcv_dat_typ()))) {
				throw new MCAppException(up0(), null, MSBGL0003);
			}

			// 分割元入金ＮＯがNULL以外の場合は、エラー
			if (!isNull(hdrR.div_src_rcv_no())) {
				throw new MCAppException(up0(), null, MSBGL0004);
			}

			// 入金先が設定されていない入金データの場合は、エラー
			if (isNull(hdrR.rcst_cd())) {
				// 入金先が指定されていない入金情報は、当画面で処理できません。
				throw new MCAppException(up0(), null, MSBGL0033);
			}

			// 請求先・請求部門の両方が設定されている入金データの場合は、、エラー
			if (!isNull(hdrR.bcst_cd()) && !isNull(hdrR.bill_dpt_cd())) {
				throw new MCAppException(up0(), null, MSBGL0032);
			}
			return true;
		}

		/**
		 * 入金分割先情報検索
		 * @param hdrR
		 * @return
		 */
		protected MCList<Srch01_RcvDivR> srchRcvDiv(Srch01_HdrR hdrR) {
			MCList<Srch01_RcvDivR> rcvDivL = MCList.create(Srch01_RcvDivR.class);
			executeQuery(rcvDivL, MSBGL0160_MST_RCV_S02(), hdrR);
			return rcvDivL;
		}

		/**
		 * 入金予定情報検索
		 * @param hdrR
		 * @return
		 */
		protected MCList<Srch01_RcvSchdR> srchRcvSchd(Srch01_HdrR hdrR) {
			MCList<Srch01_RcvSchdR> rcvSchdL = MCList.create(Srch01_RcvSchdR.class);
			hdrR.addDateColumn("rcv_schd_dt_fr", up0().rcv_schd_dt_fr());
			hdrR.addDateColumn("rcv_schd_dt_to", up0().rcv_schd_dt_to());
			hdrR.addBooleanColumn("inc_not_cl_flg", up0().inc_not_cl_flg());
			executeQuery(rcvSchdL, MSBGL0160_MST_RCV_SCHD_S01(), hdrR);

			return rcvSchdL;
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 更新前のチェックを行う。<br>
	 */
	public class Chk01 extends MSBGL_RcvDivReg_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			if (!hasErr()) {
			}
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			msgL.addAll(chkBase());

			return msgL;
		}

		/**
		 * ロック、更新カウンタチェック
		 * 
		 * @return
		 */
		protected MCMessageList chkBase() {
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(orgRcvLock(up0()));
			msgL.addAll(rcvLock(up1()));
			return msgL;
		}

		/**
		 * 分割元入金情報のロック
		 * @param up0
		 * @return
		 */
		protected MCMessageList orgRcvLock(HdrR up0) {
			MCMessageList msgL = new MCMessageList();
			// 入金ＮＯが存在する場合、入金を検索してロックする。
			if (isNull(up0.rcv_no())) {
				return msgL;
			}

			MST_RCV_R rcvR = MST_RCV_R.create();
			MST_RCV_R t = MST_RCV_R.create("T");
			MCQueryApiBuilder rcvR_bldr = MCQueryApiBuilder.create(t);
			dbSelectKeyForUpdateNoWait("MSBGL0160_MST_RCV_S01", rcvR, rcvR_bldr, up0);
			msgL.addAll(checkUpdCntrNE(up0, HdrR.$rcv_upd_cntr, rcvR));

			// 入金情報をキャッシュ
			initRcvCache(rcvR, t, rcvR_bldr);
			return msgL;
		}

		/**
		 * 分割先入金情報のロック
		 * @param up1
		 * @return
		 */
		protected MCMessageList rcvLock(MCList<RcvDivR> up1) {
			MCMessageList msgL = new MCMessageList();

			// 入金ＮＯをもとに入金情報を検索してロックする。
			MCList<MST_RCV_R> rcvL = MCList.create(MST_RCV_R.class);
			MST_RCV_R t = MST_RCV_R.create("T");
			MCQueryApiBuilder rcvL_bldr = MCQueryApiBuilder.create(t);
			dbSelectKeyForUpdateNoWait("MSBGL0160_MST_RCV_S02", rcvL, rcvL_bldr, up1);

			MCIndexKey idxkey = rcvL.createIndex(MST_RCV_R.$rcv_no);
			for (RcvDivR rcvDivR: up1) {
				if (!(rcvDivR.isStatusModify() || rcvDivR.isStatusDelete())) {
					continue;
				}
				MST_RCV_R rcvR = rcvL.getFirst(idxkey, rcvDivR.rcv_no());
				msgL.addAll(checkUpdCntrNE(rcvDivR, RcvDivR.$div_src_rcv_upd_cntr, rcvR));

				// 入金情報をキャッシュ
				initRcvCache(rcvR, t, rcvL_bldr);
			}
			return msgL;
		}

		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();

			// 条件付リストロジックチェックの処理
			// 請求先
			ListLogicBind bcstBind = getListLogicBind(up1(), RcvDivR.$bcst_cd);	
			bcstBind.putBind(BpCols.$i_in_rcst_cd, getRcvCache(up0().rcv_no()), MST_RCV_R.$rcst_cd);
			// 請求部門
			ListLogicBind billDptBind = getListLogicBind(up1(), RcvDivR.$bill_dpt_cd);
			billDptBind.putBind(DptCols.$i_dt, getRcvCache(up0().rcv_no()), MST_RCV_R.$rcv_dt);
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			// DACチェック
			msgL.addAll(checkWritableDptCdDac(getRcvCache(up0().rcv_no()), MST_RCV_R.$rcv_dpt_cd));
			for (RcvDivR r : up1()) {
				// 更新・削除行のみ
				if (r.isStatusModify() || r.isStatusDelete()) {
					msgL.addAll(checkWritableDptCdDac(getRcvCache(r.rcv_no()), MST_RCV_R.$rcv_dpt_cd));
				}
			}

			msgL.addAll(chkReq());

			msgL.addAll(chkOther());

			msgL.addAll(chkSub());

			return msgL;
		}

		/**
		 * 条件付必須チェック
		 * @param hR
		 * @return
		 */
		protected MCMessageList chkReq() {
			MCMessageList msgL = new MCMessageList();

			for (RcvDivR r : up1()) {
				if (r.isStatusModify() || r.isStatusDelete()) {
					msgL.addAll(check(r, HdrR.$rcv_no, new FXUCL_RequiredValidater()));
				}
			}
			return msgL;
		}

		/**
		 * 
		 * 金額小数部有効桁数チェック
		 * 
		 * @param hR
		 * @return
		 */
		protected MCMessageList chkSub() {

			MCMessageList msgL = new MCMessageList();
			MCList<RcvDivR> notErrL = getChkList(up1());

			MST_RCV_R orgRcvR = getRcvCache(up0().rcv_no());
			MAM_CUR_R r = MAM_CUR_R.create();
			MAM_CUR_R t = MAM_CUR_R.create("T");
			MCQueryApiBuilder r_bldr = MCQueryApiBuilder.create(t);
			r_bldr.setSelect(t.amt_dec_place);
			dbSelectKey("MSBGL0160_MAM_CUR_S01", r, r_bldr, orgRcvR.trd_cur_cd());
			msgL.addAll(checkDecPlace(notErrL, r.amt_dec_place().intValue(), RcvDivR.$rcv_amt));
			msgL.addAll(checkDecPlace(notErrL, r.amt_dec_place().intValue(), RcvDivR.$com_paid));

			return msgL;
		}

		/**
		 * 固有チェック
		 * @param 
		 * @return
		 */
		protected MCMessageList chkOther() {
			MCMessageList msgL = new MCMessageList();

			MST_RCV_R orgRcvR = getRcvCache(up0().rcv_no());
			MCList<MST_RCV_R> orgRcvDivL = srchRcvDiv(up0());

			// ステータス別の入金分割情報
			MCList<MST_RCV_R> rcvDivNonL = getRcvDivNonL(orgRcvDivL, up1());
			MCList<RcvDivR> rcvDivInsL = up1().subList(Status.CREATE);
			MCList<RcvDivR> rcvDivUpdL = up1().subList(Status.MODIFY);

			// 入金分割情報の入金額
			MCNumber rcvDivRcvAmtIns = (MCNumber) nvl(rcvDivInsL.sum(RcvDivR.$rcv_amt), MCNumber.ZERO);
			MCNumber rcvDivRcvAmtUpd = (MCNumber) nvl(rcvDivUpdL.sum(RcvDivR.$rcv_amt), MCNumber.ZERO);
			MCNumber rcvDivRcvAmtNon = (MCNumber) nvl(rcvDivNonL.sum(RcvDivR.$rcv_amt), MCNumber.ZERO);

			// 入金分割情報の振込手数料
			MCNumber rcvDivComPaidIns = (MCNumber) nvl(rcvDivInsL.sum(RcvDivR.$com_paid), MCNumber.ZERO);
			MCNumber rcvDivComPaidUpd = (MCNumber) nvl(rcvDivUpdL.sum(RcvDivR.$com_paid), MCNumber.ZERO);
			MCNumber rcvDivComPaidNon = (MCNumber) nvl(rcvDivNonL.sum(RcvDivR.$com_paid), MCNumber.ZERO);

			// 更新後の分割先入金額の合計
			MCNumber tRcvDivRcvAmt = (MCNumber) nvl(rcvDivRcvAmtIns.add(rcvDivRcvAmtUpd).add(rcvDivRcvAmtNon), MCNumber.ZERO);
			// 更新前の分割先入金額の合計 
			MCNumber tOrgRcvDivRcvAmt = (MCNumber) nvl(orgRcvDivL.sum(RcvDivR.$rcv_amt), MCNumber.ZERO);
			// 更新後の分割先振込手数料の合計
			MCNumber tRcvDivComPaid = (MCNumber) nvl(rcvDivComPaidIns.add(rcvDivComPaidUpd).add(rcvDivComPaidNon), MCNumber.ZERO);
			// 更新前の分割先振込手数料の合計 
			MCNumber tOrgRcvDivComPaid = (MCNumber) nvl(orgRcvDivL.sum(RcvDivR.$com_paid), MCNumber.ZERO);
			// 入金タブの振込手数料
			MCNumber orgRcvComPaid = (MCNumber) nvl(orgRcvR.com_paid(), MCNumber.ZERO);

			// 更新後の分割先入金額の合計 ー 更新前の分割先入金額の合計 > 分割元入金情報の未処理残高の場合、エラー
			// ※入金元A 30,000 → 入金元A´ 20,000 分割A 10,000 としたあと、 分割A を分割A´ 30,000に修正する場合、
			//  入金元A´ 20,000 + 分割A 10,000 = 30,000 > 分割A´ 30,000 であることをチェックする。
			if (tRcvDivRcvAmt.subtract(tOrgRcvDivRcvAmt).gt(orgRcvR.not_proc_bal())) {
				msgL.add(new MCMessage(MSBGL0096, tRcvDivRcvAmt, orgRcvR.not_proc_bal()));
			}

			// 更新後の振込手数料 ー 更新前の分割先入金の振込手数料　> 更新前の分割元入金情報の振込手数料の場合、エラー
			if (tRcvDivComPaid.subtract(tOrgRcvDivComPaid).gt(orgRcvComPaid)) {
				msgL.add(new MCMessage(MSBGL0017, orgRcvComPaid, tRcvDivComPaid));
			}

			//入金タブの入金額ー更新後の入金額が0の場合、かつ、
			//入金タブの振込手数料+登録済の分割先入金の振込手数料ー画面で入力した振込手数料の合計が0より大きい場合
			if (orgRcvR.rcv_amt().subtract(tRcvDivRcvAmt).isZero()
					&& orgRcvComPaid.add(tOrgRcvDivComPaid.subtract(tRcvDivComPaid)).isPositive()) {
				msgL.add(new MCMessage(MSBGL0020, orgRcvComPaid.add(tOrgRcvDivComPaid.subtract(tRcvDivComPaid))));
			}

			// 重複チェック
			msgL.addAll(dupChk(rcvDivNonL, rcvDivInsL, rcvDivUpdL));

			// 分割先入金ごとのチェック処理
			for (RcvDivR r : up1()) {
				MST_RCV_R rcvDivR = getRcvCache(r.rcv_no());
				if (r.isStatusModify()) {

					// 入金分割枠の入金額<入金処理額の場合エラーとする。
					if (r.rcv_amt().lt(rcvDivR.rcv_proc_amt())) {
						msgL.add(new MCMessage(r, RcvDivR.$rcv_amt, MSBGL0023, rcvDivR.rcv_no(), r.rcv_amt(), rcvDivR.rcv_proc_amt(), toDispGUIIndex(r)));
					}
				}
				else if (r.isStatusDelete()) {
					// 入金分割枠の入金処理額>0 の場合エラーにする。
					if (rcvDivR.rcv_proc_amt().isPositive()) {
						msgL.add(new MCMessage(r, null, MSBGL0024, rcvDivR.rcv_no(), toDispGUIIndex(r)));
					}
				}
			}
			return msgL;
		}

		protected MCMessageList dupChk(MCList<MST_RCV_R> rcvDivNonL, MCList<RcvDivR> rcvDivInsL ,MCList<RcvDivR> rcvDivUpdL) {
			MCMessageList msgL = new MCMessageList();
			MCList<RcvDivR> chkL = MCList.create(RcvDivR.class);

			MCIndexKey idxkey1 = up1().createIndex(RcvDivR.$rcv_no);
			for (MST_RCV_R r : rcvDivNonL) {
				RcvDivR tmp = RcvDivR.create();
				tmp = up1().getFirst(idxkey1, r.rcv_no());
				chkL.add(tmp);
			}
			chkL.addAll(rcvDivInsL);
			chkL.addAll(rcvDivUpdL);

			// 重複レコード抽出
			MCList<RcvDivR> grpL = chkL.groupBy(RcvDivR.$bcst_cd, RcvDivR.$bill_dpt_cd);
			MCIndexKey idxkey2 = chkL.createIndex(RcvDivR.$bcst_cd, RcvDivR.$bill_dpt_cd);

			for (RcvDivR r : grpL) {
				if (chkL.subList(idxkey2, r.bcst_cd(), r.bill_dpt_cd()).size() > 1) {
					RcvDivR dupR = chkL.getFirst(idxkey2, r.bcst_cd(), r.bill_dpt_cd());
					msgL.add(new MCMessage(MSBGL0005, dupR.bcst_cd(), dupR.bill_dpt_cd(), toDispGUIIndex(dupR)));
				}
			}
			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			copyall(down0(), up0());
			down1().setAll(up1());
		}
	}

	/**
	 * 入金分割先情報検索
	 * @param hdrR
	 * @return
	 */
	protected MCList<MST_RCV_R> srchRcvDiv(HdrR hdrR) {
		MCList<MST_RCV_R> rcvDivL = MCList.create(MST_RCV_R.class);
		MST_RCV_R t = MST_RCV_R.create("T");
		MCQueryApiBuilder rcvDivL_bldr = MCQueryApiBuilder.create(t);
		rcvDivL_bldr.setWhere(t.div_src_rcv_no.eq(bind("1")), hdrR.rcv_no());
		dbSelect("MSBGL0160_MST_RCV_S03", rcvDivL, rcvDivL_bldr);
		return rcvDivL;
	}

	/**
	 * 分割元入金分割情報と上り電文の更新・削除行からＮＯＮステータス行を抽出する。
	 * @param orgRcvDivL
	 * @return
	 */
	protected MCList<MST_RCV_R> getRcvDivNonL(MCList<MST_RCV_R> orgRcvDivL, MCList<RcvDivR>up1) {		
		MCList<MST_RCV_R> nonRcvDivL = MCList.create(MST_RCV_R.class);

		if (orgRcvDivL.isEmpty()) {
			return nonRcvDivL;
		}

		nonRcvDivL.setAll(orgRcvDivL);
		MCIndexKey idxkey = orgRcvDivL.createIndex("rcv_no");

		for (RcvDivR uR :up1) {
			MST_RCV_R r = MST_RCV_R.create();
			if (uR.isStatusModify() || uR.isStatusDelete()) {
				r = orgRcvDivL.getFirst(idxkey, uR.rcv_no());
				nonRcvDivL.remove(r);
			}
		}
		return nonRcvDivL;
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 入金を分割する。<br>
	 */
	public class Upd01 extends MSBGL_RcvDivReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();

			// チェック処理
			callThisChk01();
			throwUpdErr();

			main();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(HdrR.$peg_no, up0());
			setPegNo(RcvDivR.$peg_no, up1());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBGL_RcvDivReg.Chk01 ope = MSBGL_RcvDivReg.crtChk01();
			copyall(ope.up0(), up0());
			ope.up1().setAll(up1());

			ope.exec();

			copyall(up0(), ope.down0());
			up1().setAll(ope.down1());
		}

		/**
		 * メイン部
		 */
		protected void main() {
			MCList<MST_RCV_R> insL = MCList.create(MST_RCV_R.class);
			MCList<MST_RCV_R> updL = MCList.create(MST_RCV_R.class);
			MCList<MST_RCV_R> delL = MCList.create(MST_RCV_R.class);

			//　更新前の分割先入金情報
			MCList<MST_RCV_R> orgRcvDivL = srchRcvDiv(up0());
			
			// 分割元入金情報取得
			MST_RCV_R orgRcvR = getRcvCache(up0().rcv_no());

			// 分割先入金情報の更新
			rcvDivReg(orgRcvR, insL , updL, delL);

			// 分割元入金情報の更新
			orgRcvReg(orgRcvR, orgRcvDivL);

			// 下り電文設定
			setDown(orgRcvR, insL);
		}

		/**
		 * 分割先入金情報の更新
		 * 
		 * @param orgRcvR
		 * @param insL
		 * @param updL
		 * @param delL
		 */
		protected void rcvDivReg(MST_RCV_R orgRcvR, MCList<MST_RCV_R> insL, MCList<MST_RCV_R> updL, MCList<MST_RCV_R> delL) {
			insL.addNumberColumn("peg_no");

			for (RcvDivR r :up1()) {
				MST_RCV_R tmp = MST_RCV_R.create();

				// 新規行
				if (r.isStatusCreate()) {
					copy(tmp, orgRcvR, r, createMap_MST_RCV_R_MST_RCV_R_INS());
					insL.add(tmp);
				}

				// 更新行
				if (r.isStatusModify()) {
					// 更新前分割先入金情報
					MST_RCV_R orgRcvDivR = getRcvCache(r.rcv_no());
					copy(tmp, orgRcvDivR, r, createMap_MST_RCV_R_MST_RCV_R_UPD());
					updL.add(tmp);
				}

				// 削除行
				if (r.isStatusDelete()) {
					tmp.rcv_no(r.rcv_no());
					delL.add(tmp);
				}
			}
			MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_RCV_R.create("T"));
			dbInsert("MSBGL0160_MST_RCV_I01", insL, insL_bldr);
			
			MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(MST_RCV_R.create("T"));
			dbUpdateKey("MSBGL0160_MST_RCV_U01", updL, updL_bldr);
			
			MCQueryApiBuilder delL_bldr = MCQueryApiBuilder.create(MST_RCV_R.create("T"));
			dbDeleteKey("MSBGL0160_MST_RCV_D01", delL, delL_bldr);
		}

		/**
		 * 分割元入金情報の更新
		 * 
		 * @param orgRcvR
		 */
		protected void orgRcvReg(MST_RCV_R orgRcvR ,MCList<MST_RCV_R> orgRcvDivL ) {
			MCNumber orgRcvProcAmt = (MCNumber) nvl(orgRcvR.rcv_proc_amt(), MCNumber.ZERO);
			MCNumber orgRcvComPaid = (MCNumber) nvl(orgRcvR.com_paid(), MCNumber.ZERO);

			// ステータス別の入金分割情報
			MCList<MST_RCV_R> rcvDivNonL = getRcvDivNonL(orgRcvDivL, up1());
			MCList<RcvDivR> rcvDivInsL = up1().subList(Status.CREATE);
			MCList<RcvDivR> rcvDivUpdL = up1().subList(Status.MODIFY);

			// 入金分割情報の入金額
			MCNumber rcvDivRcvAmtIns = (MCNumber) nvl(rcvDivInsL.sum(RcvDivR.$rcv_amt), MCNumber.ZERO);
			MCNumber rcvDivRcvAmtUpd = (MCNumber) nvl(rcvDivUpdL.sum(RcvDivR.$rcv_amt), MCNumber.ZERO);
			MCNumber rcvDivRcvAmtNon = (MCNumber) nvl(rcvDivNonL.sum(RcvDivR.$rcv_amt), MCNumber.ZERO);

			// 入金分割情報の振込手数料
			MCNumber rcvDivComPaidIns = (MCNumber) nvl(rcvDivInsL.sum(RcvDivR.$com_paid), MCNumber.ZERO);
			MCNumber rcvDivComPaidUpd = (MCNumber) nvl(rcvDivUpdL.sum(RcvDivR.$com_paid), MCNumber.ZERO);
			MCNumber rcvDivComPaidNon = (MCNumber) nvl(rcvDivNonL.sum(RcvDivR.$com_paid), MCNumber.ZERO);

			// 更新後の分割先入金額の合計
			MCNumber tRcvDivRcvAmt = (MCNumber) nvl(rcvDivRcvAmtIns.add(rcvDivRcvAmtUpd).add(rcvDivRcvAmtNon), MCNumber.ZERO);
			// 更新前の分割先入金額の合計 
			MCNumber tOrgRcvDivRcvAmt = (MCNumber) nvl(orgRcvDivL.sum(RcvDivR.$rcv_amt), MCNumber.ZERO);
			// 更新後の分割先振込手数料の合計
			MCNumber tRcvDivComPaid = (MCNumber) nvl(rcvDivComPaidIns.add(rcvDivComPaidUpd).add(rcvDivComPaidNon), MCNumber.ZERO);
			// 更新前の分割先振込手数料の合計 
			MCNumber tOrgRcvDivComPaid = (MCNumber) nvl(orgRcvDivL.sum(RcvDivR.$com_paid), MCNumber.ZERO);

			// 入金処理額取得 （分割元入金情報の入金処理額　+ 更新前の分割先入金額合計 - 更新後の分割先入金額合計）
			MCNumber rcvProcAmt = orgRcvProcAmt.add(tRcvDivRcvAmt).subtract(tOrgRcvDivRcvAmt);

			// 振込手数料取得 （分割元入金情報の振込手数料 + 更新前の振込手数料 - 更新後の振込手数料）
			MCNumber comPaid = orgRcvComPaid.add(tOrgRcvDivComPaid).subtract(tRcvDivComPaid);

			orgRcvR.rcv_proc_amt(rcvProcAmt);
			orgRcvR.not_proc_bal(orgRcvR.rcv_amt().subtract(rcvProcAmt));
			orgRcvR.com_paid(comPaid);

			// 分割先の入金がない場合は、分割フラグをオフにする。それ以外はオン
			if (rcvDivNonL.isEmpty() && rcvDivInsL.isEmpty() && rcvDivUpdL.isEmpty()) {
				orgRcvR.div_flg(false);
			}
			else {
				orgRcvR.div_flg(true);
			}
			MCQueryApiBuilder orgRcvR_bldr = MCQueryApiBuilder.create(MST_RCV_R.create("T"));
			dbUpdateKey("MSBGL0160_MST_RCV_U02", orgRcvR, orgRcvR_bldr);
		}

		/**
		 * 下り電文設定
		 * 
		 * @param orgRcvR
		 * @param insL
		 */
		protected void setDown(MST_RCV_R orgRcvR, MCList<MST_RCV_R> insL) {
			copy(down0(), orgRcvR, createMap_HdrR_MST_RCV_R());
			MCIndexKey idxkey = insL.createIndex("peg_no");
			for (RcvDivR uR : up1()) {
				MST_RCV_R r = MST_RCV_R.create();
				r = insL.getFirst(idxkey, uR.peg_no());
				if (!isNull(r)) {
					uR.rcv_no(r.rcv_no());
				}
			}
			down1().setAll(up1());
		}

		/**
		 * 新規行設定　分割元入金情報（MST_RCV_R）、新規行（RcvDivR） > 入金情報（MST_RCV_R）
		 * @return
		 */
		protected Map_MST_RCV_R_MST_RCV_R_INS<MST_RCV_R,MST_RCV_R,RcvDivR> createMap_MST_RCV_R_MST_RCV_R_INS() {
			return new Map_MST_RCV_R_MST_RCV_R_INS<MST_RCV_R, MST_RCV_R, RcvDivR>();
		}

		public class Map_MST_RCV_R_MST_RCV_R_INS<D extends MST_RCV_R, S extends MST_RCV_R, W extends RcvDivR> extends MAUCC_RowMapperWith<D,S,W>{

			protected W _rcvDivR;

			@Override
			public void setWith(W _rcvDivR) {
				this._rcvDivR = _rcvDivR;
			}

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_RCV_R.$slo_no, MST_RCV_R.$slo_no);
				addColumnPathMap(MST_RCV_R.$dat_typ, MST_RCV_R.$dat_typ);
				addColumnPathMap(MST_RCV_R.$rcst_cd, MST_RCV_R.$rcst_cd);
				addColumnPathMap(MST_RCV_R.$acst_cd, MST_RCV_R.$acst_cd);
				addColumnPathMap(MST_RCV_R.$asppl_cd, MST_RCV_R.$asppl_cd);
				addColumnPathMap(MST_RCV_R.$bsppl_cd, MST_RCV_R.$bsppl_cd);
				addColumnPathMap(MST_RCV_R.$rcv_dpt_cd, MST_RCV_R.$rcv_dpt_cd);
				addColumnPathMap(MST_RCV_R.$wg_cd, MST_RCV_R.$wg_cd);
				addColumnPathMap(MST_RCV_R.$rcv_usr_cd, MST_RCV_R.$rcv_usr_cd);
				addColumnPathMap(MST_RCV_R.$rcv_dt, MST_RCV_R.$rcv_dt);
				addColumnPathMap(MST_RCV_R.$ac_dt, MST_RCV_R.$ac_dt);
				addColumnPathMap(MST_RCV_R.$rcv_mtd_cd, MST_RCV_R.$rcv_mtd_cd);
				addColumnPathMap(MST_RCV_R.$rcv_typ, MST_RCV_R.$rcv_typ);
				addColumnPathMap(MST_RCV_R.$bank_ac_cd, MST_RCV_R.$bank_ac_cd);
				addColumnPathMap(MST_RCV_R.$xfr_psn, MST_RCV_R.$xfr_psn);
				addColumnPathMap(MST_RCV_R.$note_mng_no, MST_RCV_R.$note_mng_no);
				addColumnPathMap(MST_RCV_R.$trd_cur_cd, MST_RCV_R.$trd_cur_cd);
				addColumnPathMap(MST_RCV_R.$base_cur_cd, MST_RCV_R.$base_cur_cd);
				addColumnPathMap(MST_RCV_R.$xrate_cd, MST_RCV_R.$xrate_cd);
				addColumnPathMap(MST_RCV_R.$xrate, MST_RCV_R.$xrate);
				addColumnPathMap(MST_RCV_R.$src_rcv_act_no, MST_RCV_R.$src_rcv_act_no);
				addColumnPathMap(MST_RCV_R.$src_rcv_act_seq, MST_RCV_R.$src_rcv_act_seq);
				addColumnPathMap(MST_RCV_R.$src_rcv_act_d_no, MST_RCV_R.$src_rcv_act_d_no);
				addColumnPathMap(MST_RCV_R.$src_rcv_act_d_seq, MST_RCV_R.$src_rcv_act_d_seq);
				addColumnPathMap(MST_RCV_R.$pay_act_no, MST_RCV_R.$pay_act_no);
				addColumnPathMap(MST_RCV_R.$bill_setoff_amt, MST_RCV_R.$bill_setoff_amt);
				addColumnPathMap(MST_RCV_R.$auto_appl_basis_dt, MST_RCV_R.$auto_appl_basis_dt);
				addColumnPathMap(MST_RCV_R.$rcv_auto_appl_tgt_flg, MST_RCV_R.$rcv_auto_appl_tgt_flg);
				addColumnPathMap(MST_RCV_R.$auto_appl_sts_typ, MST_RCV_R.$auto_appl_sts_typ);
				addColumnPathMap(MST_RCV_R.$prnt_flg, MST_RCV_R.$prnt_flg);
				addColumnPathMap(MST_RCV_R.$div_src_rcv_no, MST_RCV_R.$rcv_no);
			}

			@Override
			public void valueCopy(D dest, S src) {
				dest.rcv_no(getRcvNo(src));
				dest.bcst_cd(_rcvDivR.bcst_cd());
				dest.bill_dpt_cd(_rcvDivR.bill_dpt_cd());
				dest.rcv_rmrks(_rcvDivR.rcv_rmrks());
				dest.sub_char1(_rcvDivR.rcv_sub_char1());
				dest.sub_char2(_rcvDivR.rcv_sub_char2());
				dest.sub_char3(_rcvDivR.rcv_sub_char3());
				dest.rcv_amt(_rcvDivR.rcv_amt());
				dest.rcv_proc_amt(MCNumber.ZERO);
				dest.not_proc_bal(_rcvDivR.rcv_amt());
				dest.com_paid(_rcvDivR.com_paid());
				dest.seq_no(MCNumber.ONE);
				dest.div_flg(false);
				dest.setNumberNE("peg_no" ,_rcvDivR.peg_no());
			}
		}

		/**
		 * 更新行設定　分割元入金情報（MST_RCV_R）、更新行（RcvDivR） > 入金情報（MST_RCV_R）
		 * @return
		 */
		protected Map_MST_RCV_R_MST_RCV_R_UPD<MST_RCV_R,MST_RCV_R,RcvDivR> createMap_MST_RCV_R_MST_RCV_R_UPD() {
			return new Map_MST_RCV_R_MST_RCV_R_UPD<MST_RCV_R, MST_RCV_R,RcvDivR>();
		}

		public class Map_MST_RCV_R_MST_RCV_R_UPD<D extends MST_RCV_R, S extends MST_RCV_R, W extends RcvDivR> extends MAUCC_RowMapperWith<D,S,W>{

			protected W _rcvDivR;

			@Override
			public void setWith(W _rcvDivR) {
				this._rcvDivR = _rcvDivR;
			}

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_RCV_R.$rcv_no, MST_RCV_R.$rcv_no);
				addColumnPathMap(MST_RCV_R.$slo_no, MST_RCV_R.$slo_no);
				addColumnPathMap(MST_RCV_R.$dat_typ, MST_RCV_R.$dat_typ);
				addColumnPathMap(MST_RCV_R.$rcst_cd, MST_RCV_R.$rcst_cd);
				addColumnPathMap(MST_RCV_R.$acst_cd, MST_RCV_R.$acst_cd);
				addColumnPathMap(MST_RCV_R.$asppl_cd, MST_RCV_R.$asppl_cd);
				addColumnPathMap(MST_RCV_R.$bsppl_cd, MST_RCV_R.$bsppl_cd);
				addColumnPathMap(MST_RCV_R.$rcv_dpt_cd, MST_RCV_R.$rcv_dpt_cd);
				addColumnPathMap(MST_RCV_R.$wg_cd, MST_RCV_R.$wg_cd);
				addColumnPathMap(MST_RCV_R.$rcv_usr_cd, MST_RCV_R.$rcv_usr_cd);
				addColumnPathMap(MST_RCV_R.$rcv_dt, MST_RCV_R.$rcv_dt);
				addColumnPathMap(MST_RCV_R.$ac_dt, MST_RCV_R.$ac_dt);
				addColumnPathMap(MST_RCV_R.$rcv_proc_amt, MST_RCV_R.$rcv_proc_amt);
				addColumnPathMap(MST_RCV_R.$rcv_mtd_cd, MST_RCV_R.$rcv_mtd_cd);
				addColumnPathMap(MST_RCV_R.$rcv_typ, MST_RCV_R.$rcv_typ);
				addColumnPathMap(MST_RCV_R.$bank_ac_cd, MST_RCV_R.$bank_ac_cd);
				addColumnPathMap(MST_RCV_R.$xfr_psn, MST_RCV_R.$xfr_psn);
				addColumnPathMap(MST_RCV_R.$note_mng_no, MST_RCV_R.$note_mng_no);
				addColumnPathMap(MST_RCV_R.$trd_cur_cd, MST_RCV_R.$trd_cur_cd);
				addColumnPathMap(MST_RCV_R.$base_cur_cd, MST_RCV_R.$base_cur_cd);
				addColumnPathMap(MST_RCV_R.$xrate_cd, MST_RCV_R.$xrate_cd);
				addColumnPathMap(MST_RCV_R.$xrate, MST_RCV_R.$xrate);
				addColumnPathMap(MST_RCV_R.$src_rcv_act_no, MST_RCV_R.$src_rcv_act_no);
				addColumnPathMap(MST_RCV_R.$src_rcv_act_seq, MST_RCV_R.$src_rcv_act_seq);
				addColumnPathMap(MST_RCV_R.$src_rcv_act_d_no, MST_RCV_R.$src_rcv_act_d_no);
				addColumnPathMap(MST_RCV_R.$src_rcv_act_d_seq, MST_RCV_R.$src_rcv_act_d_seq);
				addColumnPathMap(MST_RCV_R.$pay_act_no, MST_RCV_R.$pay_act_no);
				addColumnPathMap(MST_RCV_R.$bill_setoff_amt, MST_RCV_R.$bill_setoff_amt);
				addColumnPathMap(MST_RCV_R.$auto_appl_basis_dt, MST_RCV_R.$auto_appl_basis_dt);
				addColumnPathMap(MST_RCV_R.$rcv_auto_appl_tgt_flg, MST_RCV_R.$rcv_auto_appl_tgt_flg);
				addColumnPathMap(MST_RCV_R.$auto_appl_sts_typ, MST_RCV_R.$auto_appl_sts_typ);
				addColumnPathMap(MST_RCV_R.$prnt_flg, MST_RCV_R.$prnt_flg);
				addColumnPathMap(MST_RCV_R.$div_src_rcv_no, MST_RCV_R.$div_src_rcv_no);
				addColumnPathMap(MST_RCV_R.$div_flg, MST_RCV_R.$div_flg);
			}

			@Override
			public void valueCopy(D dest, S src) {
				dest.bcst_cd(_rcvDivR.bcst_cd());
				dest.bill_dpt_cd(_rcvDivR.bill_dpt_cd());
				dest.rcv_rmrks(_rcvDivR.rcv_rmrks());
				dest.sub_char1(_rcvDivR.rcv_sub_char1());
				dest.sub_char2(_rcvDivR.rcv_sub_char2());
				dest.sub_char3(_rcvDivR.rcv_sub_char3());
				dest.rcv_amt(_rcvDivR.rcv_amt());
				dest.not_proc_bal(_rcvDivR.rcv_amt().subtract(src.rcv_proc_amt()));
				dest.com_paid(_rcvDivR.com_paid());
				dest.seq_no(src.seq_no().add(2));
			}
		}

		/**
		 * 下り電文設定　分割元入金情報（MST_RCV_R） > 下り電文（HdrR）
		 * @return
		 */
		protected Map_HdrR_MST_RCV_R<HdrR,MST_RCV_R> createMap_HdrR_MST_RCV_R() {
			return new Map_HdrR_MST_RCV_R<HdrR, MST_RCV_R>();
		}

		public class Map_HdrR_MST_RCV_R<D extends HdrR, S extends MST_RCV_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(HdrR.$rcv_proc_amt, MST_RCV_R.$rcv_proc_amt);
				addColumnPathMap(HdrR.$not_proc_bal, MST_RCV_R.$not_proc_bal);
				addColumnPathMap(HdrR.$div_flg, MST_RCV_R.$div_flg);
			}
		}

		/**
		 * 下り電文設定　分割元入金情報（MST_RCV_R） > 下り電文（MST_RCV_R）
		 * @return
		 */
		protected Map_RcvDivR_MST_RCV_R<RcvDivR,MST_RCV_R> createMap_RcvDivR_MST_RCV_R() {
			return new Map_RcvDivR_MST_RCV_R<RcvDivR, MST_RCV_R>();
		}

		public class Map_RcvDivR_MST_RCV_R<D extends RcvDivR, S extends MST_RCV_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(RcvDivR.$rcv_no, MST_RCV_R.$rcv_no);
			}
		}
	}

	/**
	 * 入金Ｎｏを取得する
	 * @param dptCd
	 * @return
	 */
	protected String getRcvNo(MST_RCV_R src) {
		ElmArgsR args = ElmArgsR.create();
		args.co_cd(getCo().co_cd());

		args.bp_cd(src.rcst_cd());
		args.dpt_cd(src.rcv_dpt_cd());
		args.wg_cd(src.wg_cd());
		args.dt(src.rcv_dt());

		return getNum(MAC_NUM_BIZ_TYP.RCV, args);
	}

	//FMCB CUSTOM END
}