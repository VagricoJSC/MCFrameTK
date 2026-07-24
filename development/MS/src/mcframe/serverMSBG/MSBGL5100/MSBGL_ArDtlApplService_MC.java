package mcframe.serverMSBG.MSBGL5100;

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
import mcframe.serverMSBG.MSBGL5100.*;	// このimportはFrameManagerの自動生成で追加されました。

import java.util.ArrayList;
import java.util.List;

import mcframe.serverCore.resource.MCConst;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonFXUC.FXUCC0030.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverMSBG.MSBGL5120.MSBGL_ArUtil;
import mcframe.serverMSBB.MSBBL6080.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverMSBG.MSBGL5100.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBGL_ArDtlApplService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBGL_ArDtlApplService_MC extends MSBGL_ArDtlApplService_MC_A{
	//FMCB CUSTOM START

	protected static final Class<MSBGL_ArDtlApplService> CLAZZ = MSBGL_ArDtlApplService.class;

	protected FXUCL_MCDbcCache<MST_RCV_ACT_D_R> _rcvActDCache = null;

	protected FXUCL_MCDbcCache<MST_RCV_ACT_R> _rcvActCache = null;

	// この数値分だけまとめてＤＢに登録・更新する
	protected int _loopcnt = MCConst.app.getInteger("MS.MSBGL5100.loop_size", 100);

	/**
	 * 入金実績情報をキャッシュする
	 * 
	 * @return キャッシュ情報
	 */
	protected static MST_RCV_ACT_R getRcvActCache(ArDtlAppl_Chk01_DtlR dtlR) {
		return object(CLAZZ)._getRcvActCache(dtlR);
	}
	protected MST_RCV_ACT_R _getRcvActCache(ArDtlAppl_Chk01_DtlR dtlR) {
		if (_rcvActCache == null) {
			_rcvActCache = new FXUCL_MCDbcCache<MST_RCV_ACT_R>(MCQueryApiBuilder.create(MST_RCV_ACT_R.create("T")));
		}
		return _rcvActCache.get(dtlR.rcv_act_no(), dtlR.rcv_act_seq());
	}

	/**
	 * 入金実績明細情報をキャッシュする
	 * 
	 * @return キャッシュ情報
	 */
	protected static MST_RCV_ACT_D_R getRcvActDCache(ArDtlAppl_Chk01_DtlR dtlR) {
		return object(CLAZZ)._getRcvActDCache(dtlR);
	}
	protected MST_RCV_ACT_D_R _getRcvActDCache(ArDtlAppl_Chk01_DtlR dtlR) {
		if (_rcvActDCache == null) {
			_rcvActDCache = new FXUCL_MCDbcCache<MST_RCV_ACT_D_R>(MCQueryApiBuilder.create(MST_RCV_ACT_D_R.create("T")));
		}
		return _rcvActDCache.get(dtlR.rcv_act_d_no(), dtlR.rcv_act_d_seq());
	}

	/**
	 * ArDtlAppl_Chk01オペレーション.<p>
	 *
	 * 消込処理用のチェックを行う<br>
	 */
	public class ArDtlAppl_Chk01 extends MSBGL_ArDtlApplService_MC_A.ArDtlAppl_Chk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			chkApplRcvAct(up0());

			// 入金実績をキャッシュする
			MST_RCV_ACT_R rcvActR = getRcvActCache(up0().get(0));
			MCQueryApiBuilder rcvActR_bldr = MCQueryApiBuilder.create(MST_RCV_ACT_R.create("T"));
			dbSelectKeyForUpdateNoWait("MSBGL5100_MST_RCV_ACT_S01", rcvActR, rcvActR_bldr, rcvActR);

			// 入金実績が取り消されていた場合
			if (!MAC_SLIP_STS_TYP.isCRT(rcvActR.slip_sts_typ())) {
				throw new MCAppException(MSBGL0082, rcvActR.rcv_act_no(), rcvActR.rcv_act_rev());
			}
		}
	}

	/**
	 * 消込を行う伝票に複数の伝票が含まれていないかチェックする<p>
	 * 複数の伝票が含まれている場合はエラーとする
	 * 
	 */
	protected void chkApplRcvAct(MCList<ArDtlAppl_Chk01_DtlR> l) {

		// 最終行手前までの処理
		for (int i = 0; i < l.size() - 1; i++) {

			ArDtlAppl_Chk01_DtlR crntR = l.get(i);
			ArDtlAppl_Chk01_DtlR nextR = l.get(i + 1);

			// 複数の入金実績を処理することはできないのでエラーとする
			if (!isSame(crntR.rcv_act_no(), nextR.rcv_act_no())) {
				throw new MCAppException(MSBGL0083);
			}
		}
	}

	/**
	 * ArDtlAppl_Upd01オペレーション.<p>
	 *
	 * 売掛明細消込処理を行う<br>
	 */
	public class ArDtlAppl_Upd01 extends MSBGL_ArDtlApplService_MC_A.ArDtlAppl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			applBal(up0());
		}
	}

	/**
	 * Upd03の場合は入金実績無しで消し込むため、対応する入金実績ＮＯを便宜上「-1」で設定する
	 * 
	 */
	protected String _RCV_ACT_NULL_NO = "-1";

	/**
	 * 売掛明細消込のメイン処理<br />
	 * 
	 * @param baseL 上り電文リスト
	 */
	protected void applBal(MCList<ArDtlAppl_Chk01_DtlR> baseL) {

		MCList<MST_MLY_AR_BAL_R> arBalL = MCList.create(MST_MLY_AR_BAL_R.class);

		setApplRegCnd(baseL, arBalL);

		delBillDApplAct(baseL);

		MST_MLY_AR_BAL_R arBalL_t = MST_MLY_AR_BAL_R.create("T");
		MCQueryApiBuilder arBalL_bldr = MCQueryApiBuilder.create(arBalL_t);
		updArBal(arBalL, arBalL_t, arBalL_bldr);
	}

	/**
	 * 各種トランザクションの更新用コンテナを作成する<p>
	 * 引数に渡されたコンテナに対して情報を追加する
	 * 
	 * @param baseL 上り電文リスト
	 * @param arBalL 月次売掛残高リスト
	 */
	protected void setApplRegCnd(MCList<ArDtlAppl_Chk01_DtlR> baseL,
			MCList<MST_MLY_AR_BAL_R> arBalL) {

		MCList<ArDtlAppl_Upd01_BillDApplBalR> applBalL = MCList.create(ArDtlAppl_Upd01_BillDApplBalR.class);
		MCList<MST_BILL_D_APPL_ACT_R> applActL = MCList.create(MST_BILL_D_APPL_ACT_R.class);
		MCList<SloSts_DtlR> sloStsL = MCList.create(SloSts_DtlR.class);
		createArSlipDCache(baseL);

		// 入金実績の検索
		MST_RCV_ACT_R rcvActR = getRcvAct(baseL.get(0));

		MCList<ArDtlAppl_Chk01_DtlR> keyL = baseL.groupBy(ArDtlAppl_Chk01_DtlR.$bill_mng_no);
		keyL.sort(ArDtlAppl_Chk01_DtlR.$bill_mng_no);

		String[] keysBillD = {MST_BILL_D_R.$bill_d_no};
		String[] keysApplAct = {MST_BILL_D_APPL_ACT_R.$rcv_act_d_no, 
				MST_BILL_D_APPL_ACT_R.$bill_d_no, MST_BILL_D_APPL_ACT_R.$parent_bill_d_no};

		// 請求情報の単位で処理
		for (ArDtlAppl_Chk01_DtlR keyR : keyL) {

			// 請求のロック
			MST_BILL_R billR = lockBill(keyR);
			MCList<ArDtlAppl_Chk01_DtlR> subL = baseL.subList(ArDtlAppl_Chk01_DtlR.$bill_mng_no, keyR.bill_mng_no());

			for (MCList<ArDtlAppl_Chk01_DtlR> subLoopL : getSubLoopL(subL)) {

				// 請求明細を検索
				MCList<MST_BILL_D_R> getBillDL = getBillD(subLoopL);
				MCIndexKey ikBillD = getBillDL.createIndex(keysBillD);

				// 請求明細消込実績を検索
				MCList<MST_BILL_D_APPL_ACT_R> getApplActL = getApplAct(subLoopL);
				MCIndexKey ikApplRec = getApplActL.createIndex(keysApplAct);

				// 請求明細消込残高をロック
				lockBillDApplBal(subLoopL);

				for (ArDtlAppl_Chk01_DtlR subR : subLoopL) {

					// 請求明細、入金実績明細を検索
					MST_BILL_D_R billDR = getBillDL.getFirst(ikBillD, subR.bill_d_no());
					MST_RCV_ACT_D_R rcvActDR = getRcvActD(subR);

					if (!rcvActDR.isEmpty()) {
						subR.iv_no(rcvActDR.iv_no());
						subR.wrk_no(rcvActDR.wrk_no());
						subR.acst_cd(rcvActDR.acst_cd());
						subR.ar_dpt_cd(rcvActDR.ar_dpt_cd());
						subR.ar_typ(rcvActDR.ar_typ());
					}
					if (!rcvActR.isEmpty()) {
						subR.rcv_act_ac_ym(rcvActR.ac_ym());
						subR.xrate(rcvActR.xrate());
					}
					subR.trd_cur_cd(billR.trd_cur_cd());
					subR.ac_ym(billDR.ac_ym());
					subR.ac_dt(billDR.ac_dt());
					subR.trd_xrate(billDR.xrate());

					// 請求明細消込実績を検索
					Comparable<?>[] vals = {subR.rcv_act_d_no(), subR.bill_d_no(), subR.parent_bill_d_no()};
					MST_BILL_D_APPL_ACT_R applActR = getApplActL.getFirst(ikApplRec, vals);

					// 請求明細消込残高を追加
					ArDtlAppl_Upd01_BillDApplBalR applBalR = createBillDApplBal(subR, applActR, billDR);
					applBalL.add(applBalR);

					// 請求明細消込実績を追加
					applActR = createBillDApplAct(subR, applBalR);
					applActL.add(applActR);

					// 受注状況を追加
					SloSts_DtlR sloStsR = createSloSts(subR, rcvActR, rcvActDR, billDR);
					sloStsL.add(sloStsR);
				}
				setApplRegCndSub(applActL, applBalL, sloStsL);
			}
		}
		updRcvActDApplCompl(rcvActR);
		arBalL.addAll(createArBal(baseL));
	}

	/**
	 * 入金実績明細を検索し、キャッシュする
	 * 
	 * @param baseL 検索条件(ar_slip_d_id)がセットされたリスト
	 */
	protected void createArSlipDCache(MCList<ArDtlAppl_Chk01_DtlR> baseL) {
		MCList<MST_RCV_ACT_D_R> rcvActDL = MCList.create(MST_RCV_ACT_D_R.class);
		MST_RCV_ACT_D_R t = MST_RCV_ACT_D_R.create("T");
		MCQueryApiBuilder rcvActDL_bldr = MCQueryApiBuilder.create(t);
		getRcvActDL(rcvActDL, t, rcvActDL_bldr);
		_rcvActDCache = new FXUCL_MCDbcCache<MST_RCV_ACT_D_R>(rcvActDL_bldr, baseL, ArDtlAppl_Chk01_DtlR.$rcv_act_d_no, ArDtlAppl_Chk01_DtlR.$rcv_act_d_seq);
	}

	/**
	 * 入金実績明細のＤＢコンテナ作成<br />
	 * 
	 * 入金実績明細ＤＢコンテナにselect句を追加して返却する
	 * 
	 * @return 入金実績明細ＤＢコンテナ
	 */
	protected void getRcvActDL(MCList<MST_RCV_ACT_D_R> rcvActDL, 
			MST_RCV_ACT_D_R t, MCQueryApiBuilder rcvActDL_bldr) {
		rcvActDL_bldr.setSelect(t.iv_no);
		rcvActDL_bldr.addSelect(t.wrk_no);
		rcvActDL_bldr.addSelect(t.acst_cd);
		rcvActDL_bldr.addSelect(t.ar_dpt_cd);
		rcvActDL_bldr.addSelect(t.ar_typ);
	}

	/**
	 * 請求明細消込実績、請求明細消込残高、受注状況を更新する。更新後に引数のコンテナをクリアする。
	 * 
	 * @param applRecL 請求明細消込実績
	 * @param applBalL 請求明細消込残高
	 * @param sloStsL 受注状況
	 */
	protected void setApplRegCndSub(MCList<MST_BILL_D_APPL_ACT_R> applActL,
			MCList<ArDtlAppl_Upd01_BillDApplBalR> applBalL, MCList<SloSts_DtlR> sloStsL) {

		updInsBillDApplRec(applActL);
		applActL.clear();

		updBillDApplBal(applBalL);
		applBalL.clear();

		execSloStsReg(sloStsL);
		sloStsL.clear();
	}

	/**
	 * 入金実績の更新
	 * 
	 * @param rcvActR 入金実績
	 */
	protected void updRcvActDApplCompl(MST_RCV_ACT_R rcvActR) {
		MCList<MST_RCV_ACT_D_R> rcvActDL = MCList.create(MST_RCV_ACT_D_R.class);
		executeQuery(rcvActDL, MSBGL5100_MST_RCV_ACT_D_S01(), rcvActR);
		for (MST_RCV_ACT_D_R rcvActDR : rcvActDL) {
			MCNumber notApplBal = rcvActDR.getNumberNE("not_appl_bal");
			if (notApplBal.isZero()) {
				rcvActDR.appl_cmpl_flg(true);
			}
			else {
				rcvActDR.appl_cmpl_flg(false);
			}
		}
		MST_RCV_ACT_D_R rcvActDL_t = MST_RCV_ACT_D_R.create("T");
		MCQueryApiBuilder rcvActDL_bldr = MCQueryApiBuilder.create(rcvActDL_t);
		updRcvActD(rcvActDL, rcvActDL_t, rcvActDL_bldr);
	}

	/**
	 * 
	 * @param rcvActDL
	 */
	protected void updRcvActD(MCList<MST_RCV_ACT_D_R> rcvActDL,
			MST_RCV_ACT_D_R rcvActDL_t, MCQueryApiBuilder rcvActDL_bldr) {
		if (rcvActDL.isEmpty()) {
			return;
		}
		rcvActDL_bldr.setSetVL(rcvActDL_t.appl_cmpl_flg, bindEx("appl_cmpl_flg"));
		rcvActDL_bldr.setWhere(rcvActDL_t.rcv_act_d_no.eq(bindEx("rcv_act_d_no")));
		rcvActDL_bldr.addWhereWithAnd(rcvActDL_t.rcv_act_d_seq.eq(bindEx("rcv_act_d_seq")));
		dbUpdate("MSBGL5100_MST_RCV_ACT_D_U01", rcvActDL, rcvActDL_bldr);
	}

	/**
	 * 入金実績を取得する
	 * 
	 * @param baseR 上り電文情報
	 * @return 入金実績ＤＢコンテナ
	 */
	protected MST_RCV_ACT_R getRcvAct(ArDtlAppl_Chk01_DtlR baseR) {

		MST_RCV_ACT_R rcvActR = MST_RCV_ACT_R.create();

		// Upd03からの呼び出しの場合は債権伝票は存在しない
		if (baseR.un_dtl_appl_flg()) {
			return rcvActR;
		}

		// チェック処理でキャッシュしてある入金実績を取得する
		return getRcvActCache(baseR);
	}

	/**
	 * 
	 * @param baseR
	 * @return
	 */
	protected MST_RCV_ACT_D_R getRcvActD(ArDtlAppl_Chk01_DtlR baseR) {

		MST_RCV_ACT_D_R rcvActDR = MST_RCV_ACT_D_R.create();

		// Upd03からの呼び出しの場合は債権伝票は存在しない
		if (baseR.un_dtl_appl_flg()) {
			return rcvActDR;
		}
		rcvActDR = getRcvActDCache(baseR);

		return rcvActDR;
	}

	/**
	 * 
	 * @param keyR
	 * @return
	 */
	protected MST_BILL_R lockBill(ArDtlAppl_Chk01_DtlR keyR) {

		// 請求のロック
		MST_BILL_R billR = MST_BILL_R.create();
		MCQueryApiBuilder billR_bldr = MCQueryApiBuilder.create(MST_BILL_R.create("T"));
		dbSelectKeyForUpdate("MSBGL5100_MST_BILL_S01", billR, billR_bldr, keyR);
		return billR;
	}

	/**
	 * 
	 * @param subL
	 * @return
	 */
	protected List<MCList<ArDtlAppl_Chk01_DtlR>> getSubLoopL(MCList<ArDtlAppl_Chk01_DtlR> subL) {

		List<MCList<ArDtlAppl_Chk01_DtlR>> subLoopL = new ArrayList<MCList<ArDtlAppl_Chk01_DtlR>>();
		MCList<ArDtlAppl_Chk01_DtlR> tmp = null;
		for (int i = 0; i < subL.size(); i++) {
			if (i % _loopcnt == 0) {
				tmp = MCList.create(ArDtlAppl_Chk01_DtlR.class);
				subLoopL.add(tmp);
			}
			tmp.add(subL.get(i));
		}
		return subLoopL;
	}

	/**
	 * 
	 * @param baseL
	 * @return
	 */
	protected MCList<MST_BILL_D_R> getBillD(MCList<ArDtlAppl_Chk01_DtlR> baseL) {
		MCList<MST_BILL_D_R> billDL = MCList.create(MST_BILL_D_R.class);
		MST_BILL_ACST_R bill_acst1 = MST_BILL_ACST_R.create("BILL_ACST1");
		MST_BILL_D_R t = MST_BILL_D_R.create("T");
		MCQueryApiBuilder billDL_bldr = MCQueryApiBuilder.create(t);
		billDL_bldr.addSelect(bill_acst1.ar_dpt_cd);
		billDL_bldr.activeForeign("BILL_ACST1");
		billDL_bldr.setLockTable(t.bill_d_no);
		dbSelectKeyForUpdateNoWait("MSBGL5100_MST_BILL_D_S01", billDL, billDL_bldr, baseL);
		
		lockBillAcst(billDL);

		return billDL;
	}

	protected void lockBillAcst(MCList<MST_BILL_D_R> billDL) {
		MCList<MST_BILL_ACST_R> bill_acstBindL = MCList.create(MST_BILL_ACST_R.class);
		for (MST_BILL_D_R billDR : billDL) {
			String billAcstNo = billDR.getStringNE(MST_BILL_ACST_R.$bill_acst_no);
			if (!isNull(billAcstNo)) {
				MST_BILL_ACST_R tmp = MST_BILL_ACST_R.create();
				tmp.bill_acst_no(billAcstNo);
				bill_acstBindL.add(tmp);
			}
		}
		if (!bill_acstBindL.isEmpty()) {
			MST_BILL_ACST_R t = MST_BILL_ACST_R.create("T");
			MCQueryApiBuilder billAcstBuilder = MCQueryApiBuilder.create(t);
			billAcstBuilder.setSelect(t.bill_acst_no);
			billAcstBuilder.setOrderByAsc(t.bill_acst_no);
			dbSelectKeyForUpdateNoFetch("MSBGL5100_MST_BILL_ACST_S01", billAcstBuilder, bill_acstBindL);
		}
	}

	/**
	 * 
	 * @param baseL
	 * @return
	 */
	protected MCList<MST_BILL_D_APPL_ACT_R> getApplAct(
			MCList<ArDtlAppl_Chk01_DtlR> baseL) {
		MCList<MST_BILL_D_APPL_ACT_R> applActL = MCList.create(MST_BILL_D_APPL_ACT_R.class);
		MCQueryApiBuilder applActL_bldr = MCQueryApiBuilder.create(MST_BILL_D_APPL_ACT_R.create("T"));
		dbSelectKeyForUpdateNoWait("MSBGL5100_MST_BILL_D_APPL_ACT_S01", applActL, applActL_bldr, baseL);

		return applActL;
	}

	/**
	 * 
	 * @param baseL
	 * @return
	 */
	protected MCList<MST_BILL_D_APPL_BAL_R> lockBillDApplBal(
			MCList<ArDtlAppl_Chk01_DtlR> baseL) {
		MCList<MST_BILL_D_APPL_BAL_R> lockL = MCList.create(MST_BILL_D_APPL_BAL_R.class);
		MCQueryApiBuilder lockL_bldr = MCQueryApiBuilder.create(MST_BILL_D_APPL_BAL_R.create("T"));
		dbSelectKeyForUpdateNoWait("MSBGL5100_MST_BILL_D_APPL_BAL_S01", lockL, lockL_bldr, baseL);

		return lockL;
	}

	/**
	 * 請求明細消込残高の更新条件を作成する<br>
	 * 同時にbaseRに追加情報を設定する
	 * 
	 * @param baseR 消込情報（請求明細消込残高から計上年月・債権部門ＣＤ・元消込額が設定される）
	 * @param applActR 請求明細消込実績
	 * @param billDR 請求明細情報
	 * 
	 * @return 請求明細消込残高情報
	 */
	protected ArDtlAppl_Upd01_BillDApplBalR createBillDApplBal(
			ArDtlAppl_Chk01_DtlR baseR, MST_BILL_D_APPL_ACT_R applActR, MST_BILL_D_R billDR) {
		// 請求明細消込残高の作成
		ArDtlAppl_Upd01_BillDApplBalR applBalR =
				ArDtlAppl_Upd01_BillDApplBalR.create();
		applBalR.setAttributes(baseR);
		applBalR.bill_d_no(baseR.bill_d_no());
		applBalR.parent_bill_d_no(baseR.parent_bill_d_no());
		applBalR.ac_ym(billDR.ac_ym());
		applBalR.ar_dpt_cd(billDR.getString("ar_dpt_cd"));
		applBalR.appl_amt(baseR.appl_amt());
		applBalR.last_appl_dt(getToday());
		// 実績が存在する場合、現在の金額をセット
		if (!isNull(applActR)) {
			applBalR.org_appl_amt(applActR.appl_amt());
			applBalR.act_appl_flg(true);
		}
		// 実績が存在しない場合、現在の金額として0をセット
		else {
			applBalR.org_appl_amt(0);
			applBalR.act_appl_flg(false);
		}
		baseR.org_appl_amt(applBalR.org_appl_amt());

		return applBalR;
	}

	/**
	 * 請求明細消込実績の更新条件を作成する
	 * 
	 * @param baseR 消込情報
	 * @param applBalR 請求明細消込残高
	 * @return 請求明細消込実績
	 */
	protected MST_BILL_D_APPL_ACT_R createBillDApplAct(
			ArDtlAppl_Chk01_DtlR baseR, ArDtlAppl_Upd01_BillDApplBalR applBalR) {

		MST_BILL_D_APPL_ACT_R applActR = MST_BILL_D_APPL_ACT_R.create();
		applActR.setAttributes(baseR);
		applActR.bill_d_no(baseR.bill_d_no());
		applActR.rcv_act_d_no(nvl(baseR.rcv_act_d_no(), _RCV_ACT_NULL_NO)); // Upd03の場合は債権伝票が無いため「-1」を固定で設定
		applActR.parent_bill_d_no(baseR.parent_bill_d_no());
		applActR.appl_amt(baseR.appl_amt());
		applActR.appl_dt(getToday());

		if (applBalR.act_appl_flg()) {
			applActR.setStatus(Status.MODIFY);
		}
		else {
			applActR.setStatus(Status.CREATE);
		}
		return applActR;
	}

	/**
	 * 請求明細消込実績を更新する<p>
	 * 新規・更新・削除
	 * 
	 * @param applRecL 請求明細消込実績（行ステータスに更新か新規かを設定したもの）
	 */
	protected void updInsBillDApplRec(MCList<MST_BILL_D_APPL_ACT_R> applActL) {
		MCList<MST_BILL_D_APPL_ACT_R> updL = applActL.subList(Status.MODIFY);
		MST_BILL_D_APPL_ACT_R updL_t = MST_BILL_D_APPL_ACT_R.create("T");
		MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(updL_t);
		updBillDApplRec(updL, updL_t, updL_bldr);
		
		MCList<MST_BILL_D_APPL_ACT_R> insL = applActL.subList(Status.CREATE);
		MST_BILL_D_APPL_ACT_R insL_t = MST_BILL_D_APPL_ACT_R.create("T");
		MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(insL_t);
		insBillDApplRec(insL, insL_t, insL_bldr);
	}

	/**
	 * 請求明細消込実績を更新する
	 * 
	 * @param updL 更新用コンテナ
	 */
	protected void updBillDApplRec(MCList<MST_BILL_D_APPL_ACT_R> updL,
			MST_BILL_D_APPL_ACT_R updL_t, MCQueryApiBuilder updL_bldr) {
		setUpdBillDApplRecCnd(updL, updL_t, updL_bldr);
		dbUpdate("MSBGL5100_MST_BILL_D_APPL_ACT_U01", updL, updL_bldr);
	}

	/**
	 * 請求明細消込実績の更新条件を設定する
	 * 
	 * @param updL 更新用コンテナ
	 */
	protected void setUpdBillDApplRecCnd(MCList<MST_BILL_D_APPL_ACT_R> updL,
			MST_BILL_D_APPL_ACT_R updL_t, MCQueryApiBuilder updL_bldr) {
		updL_bldr.setSet(updL_t.appl_dt, updL_t.appl_amt);
		updL_bldr.setWhere(updL_t.rcv_act_d_no.eq(bindEx("rcv_act_d_no")));
		updL_bldr.addWhereWithAnd(updL_t.bill_d_no.eq(bindEx("bill_d_no")));
		updL_bldr.addWhereWithAnd(updL_t.parent_bill_d_no.eq(bindEx("parent_bill_d_no")));
	}

	/**
	 * 請求明細消込実績を新規追加する
	 * 
	 * @param insL 新規用コンテナ
	 */
	protected void insBillDApplRec(MCList<MST_BILL_D_APPL_ACT_R> insL,
			MST_BILL_D_APPL_ACT_R insL_t, MCQueryApiBuilder insL_bldr) {
		dbInsert("MSBGL5100_MST_BILL_D_APPL_ACT_I01", insL, insL_bldr);
	}

	/**
	 * 請求明細消込残高の更新
	 * 
	 * @param applBalL 更新条件
	 */
	protected void updBillDApplBal(MCList<ArDtlAppl_Upd01_BillDApplBalR> applBalL) {
		MCList<MST_BILL_D_APPL_BAL_R> updL = MCList.create(MST_BILL_D_APPL_BAL_R.class);
		addAll(updL, applBalL, createMap_ApplBalR());
		MST_BILL_D_APPL_BAL_R updL_t = MST_BILL_D_APPL_BAL_R.create("T");
		MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(updL_t);
		// 更新条件の設定
		setUpdBillDApplBalCnd(updL, updL_t, updL_bldr);
		// 更新
		dbUpdateKey("MSBGL5100_MST_BILL_D_APPL_BAL_U01", updL, updL_bldr);
	}

	protected Map_ApplBalR<MST_BILL_D_APPL_BAL_R, ArDtlAppl_Upd01_BillDApplBalR> createMap_ApplBalR() {
		return new Map_ApplBalR<MST_BILL_D_APPL_BAL_R, ArDtlAppl_Upd01_BillDApplBalR>();
	}

	public class Map_ApplBalR<D extends MST_BILL_D_APPL_BAL_R, S extends ArDtlAppl_Upd01_BillDApplBalR> extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_BILL_D_APPL_BAL_R.$bill_d_no, ArDtlAppl_Upd01_BillDApplBalR.$bill_d_no);
			addColumnPathMap(MST_BILL_D_APPL_BAL_R.$parent_bill_d_no, ArDtlAppl_Upd01_BillDApplBalR.$parent_bill_d_no);
			addColumnPathMap(MST_BILL_D_APPL_BAL_R.$last_appl_dt, ArDtlAppl_Upd01_BillDApplBalR.$last_appl_dt);
		}
		@Override
		public void valueCopy(D dest, S src) {
			dest.appl_amt(src.appl_amt().subtract(src.org_appl_amt()));
			dest.not_appl_bal(src.appl_amt().subtract(src.org_appl_amt()));
		}
	}

	/**
	 * 請求明細消込残高の更新条件の設定
	 * 
	 * @param applBalL 更新用コンテナ
	 */
	protected void setUpdBillDApplBalCnd(MCList<MST_BILL_D_APPL_BAL_R> applBalL,
			MST_BILL_D_APPL_BAL_R applBalL_t, MCQueryApiBuilder applBalL_bldr) {
		applBalL_bldr.setSet(applBalL_t.last_appl_dt);
		applBalL_bldr.addSetVL(applBalL_t.appl_amt,
				applBalL_t.appl_amt.add(bindEx("appl_amt")));
		applBalL_bldr.addSetVL(applBalL_t.not_appl_bal,
				applBalL_t.not_appl_bal.subtract(bindEx("appl_amt")));
	}

	/**
	 * 受注状況更新サービスを実行する
	 * 
	 * @param sloStsL 受注状況更新サービス用の上り電文
	 */
	protected void execSloStsReg(MCList<SloSts_DtlR> sloStsL) {

		if (isSame(sloStsL.size(), 0)) {
			return;
		}
		MSBBL_SloStsRegService.SloSts_Ins01 op = MSBBL_SloStsRegService.crtSloSts_Ins01();
		op.up0().addAll(sloStsL);
		op.exec();
	}

	/**
	 * 受注状況更新処理用の引数を作成する
	 * 
	 * @param baseR 消込情報
	 * @param slipR 消込伝票情報
	 * @param slipDR 消込伝票明細情報
	 * @param billDR 請求明細情報
	 * @return 受注状況更新処理用の引数
	 */
	protected SloSts_DtlR createSloSts(
			ArDtlAppl_Chk01_DtlR baseR, MST_RCV_ACT_R rcvActR, MST_RCV_ACT_D_R rcvActDR, MST_BILL_D_R billDR) {

		if (isNull(billDR.slo_d_no())) {
			return null;
		}

		// 受注状況更新用明細
		SloSts_DtlR slsStsR = SloSts_DtlR.create();
		slsStsR.setAttributes(baseR);

		slsStsR.slo_d_no(billDR.slo_d_no());
		slsStsR.slo_sts_typ(MSC_SLO_STS_TYP.AR_DTL_APPL.value());
		slsStsR.cur_cd(baseR.trd_cur_cd());
		slsStsR.amt(baseR.appl_amt());
		slsStsR.ac_dt(rcvActR.ac_dt());
		slsStsR.sls_act_no(billDR.act_no());
		slsStsR.sls_act_d_no(billDR.act_d_no());

		return slsStsR;

	}

	/**
	 * 月次売掛残高の更新条件を作成する
	 * 
	 * @param baseL 消込情報
	 * @return 月次売掛残高
	 */
	protected MCList<MST_MLY_AR_BAL_R> createArBal(MCList<ArDtlAppl_Chk01_DtlR> baseL) {

		if (baseL.get(0).no_upd_ar_bal_flg()) {
			// 請求済残高振替の振替先は更新不要
			return null;
		}
		
		// 売掛情報の更新
		MCList<MST_MLY_AR_BAL_R> arBalLForRcv = createArBalForRcvAppl(baseL); // 入金に対応する売掛情報
		MCList<MST_MLY_AR_BAL_R> arBalLForAr = createArBalForArAppl(baseL); // 売掛に対応する売掛情報

		// 両方をまとめる
		arBalLForRcv.addAll(arBalLForAr);

		// 主キーでsumする
		MCQueryApiBuilder arBalLForRcv_bldr = MCQueryApiBuilder.create(MST_MLY_AR_BAL_R.create("T"));
		MCGroupByPolicy gp = new MCGroupByPolicy(arBalLForRcv_bldr.getBaseDbc().getKeyColumn());
		gp.sum(
				MST_MLY_AR_BAL_R.$rcv_appl_amt,
				MST_MLY_AR_BAL_R.$base_cur_rcv_appl_amt,
				MST_MLY_AR_BAL_R.$rcv_not_appl_bal,
				MST_MLY_AR_BAL_R.$base_cur_rcv_not_appl_bal,
				MST_MLY_AR_BAL_R.$ar_appl_amt,
				MST_MLY_AR_BAL_R.$base_cur_ar_appl_amt,
				MST_MLY_AR_BAL_R.$ar_not_appl_bal,
				MST_MLY_AR_BAL_R.$base_cur_ar_not_appl_bal);

		MCList<MST_MLY_AR_BAL_R> retL = arBalLForRcv.groupBy(gp);

		return retL;

	}

	/**
	 * 売掛情報に対する入金の消込情報を作成する
	 * 
	 * @param baseL ベース情報
	 * @return 入金の消込結果を反映した売掛情報
	 */
	protected MCList<MST_MLY_AR_BAL_R> createArBalForRcvAppl(MCList<ArDtlAppl_Chk01_DtlR> baseL) {

		MCList<MST_MLY_AR_BAL_R> arBalL = MCList.create(MST_MLY_AR_BAL_R.class);

		// Upd03の場合は債権伝票の指定が無い
		if (baseL.get(0).un_dtl_appl_flg()) {
			return arBalL;
		}

		MCList<ArDtlAppl_Chk01_DtlR> keyL = baseL.groupBy(getArBalForRcvApplKey());
		keyL.sort(getArBalForRcvApplKey());

		// 売掛情報のキー毎の処理
		for (ArDtlAppl_Chk01_DtlR keyR : keyL) {

			MST_MLY_AR_BAL_R arBalR = createArBalForRcv(keyR); // キーのみが設定された金額ゼロの売掛情報
			MCList<ArDtlAppl_Chk01_DtlR> subL = baseL.subList(getArBalForRcvApplKey(), keyR); // 売掛情報のキーで抽出したリスト

			// 売掛情報への消込金額（入金）の設定
			setArBalAmtForRcv(arBalR, subL);
			arBalL.add(arBalR);
		}
		return arBalL;
	}

	protected String[] getArBalForRcvApplKey() {
		return new String[] {
				ArDtlAppl_Chk01_DtlR.$rcv_act_ac_ym,
				ArDtlAppl_Chk01_DtlR.$ar_dpt_cd,
				ArDtlAppl_Chk01_DtlR.$acst_cd,
				ArDtlAppl_Chk01_DtlR.$iv_no,
				ArDtlAppl_Chk01_DtlR.$trd_cur_cd,
				ArDtlAppl_Chk01_DtlR.$wrk_no,
				ArDtlAppl_Chk01_DtlR.$ar_typ,
		};
	}

	/**
	 * 月次売掛残高を作成する（入金消込）<p>
	 * 設定するのは月次売掛情報のキーのみ<br>
	 * その他の項目は全てゼロを設定する
	 * 
	 * @param baseR 消込情報
	 * @return 月次売掛情報
	 */
	protected MST_MLY_AR_BAL_R createArBalForRcv(ArDtlAppl_Chk01_DtlR baseR) {
		MST_MLY_AR_BAL_R arBalR = MST_MLY_AR_BAL_R.create();
		arBalR.setAttributes(baseR);
		arBalR.ar_dpt_cd(baseR.ar_dpt_cd());
		arBalR.ac_ym(baseR.rcv_act_ac_ym());
		arBalR.acst_cd(baseR.acst_cd());
		arBalR.iv_no(baseR.iv_no());
		arBalR.trd_cur_cd(baseR.trd_cur_cd());
		arBalR.wrk_no(baseR.wrk_no());
		arBalR.ar_typ(baseR.ar_typ());
		arBalR.ar_appl_amt(0);
		arBalR.ar_not_appl_bal(0);
		arBalR.rcv_appl_amt(0);
		arBalR.rcv_not_appl_bal(0);
		arBalR.base_cur_ar_appl_amt(0);
		arBalR.base_cur_ar_not_appl_bal(0);
		arBalR.base_cur_rcv_appl_amt(0);
		arBalR.base_cur_rcv_not_appl_bal(0);
		
		return arBalR;
	}

	/**
	 * 月次売掛残高に入金消込額を設定する
	 * 
	 * @param arBalR 売掛情報（消込額を設定されるコンテナ）
	 * @param baseL 消込情報
	 */
	protected void setArBalAmtForRcv(MST_MLY_AR_BAL_R arBalR, MCList<ArDtlAppl_Chk01_DtlR> baseL) {
		for (ArDtlAppl_Chk01_DtlR baseR : baseL) {
			setArBalAmtForRcv(arBalR, baseR);
		}
	}

	/**
	 * 月次売掛残高に入金消込額を設定する
	 * 
	 * @param arBalR 売掛情報（消込額を設定されるコンテナ）
	 * @param baseR 消込情報
	 */
	protected void setArBalAmtForRcv(MST_MLY_AR_BAL_R arBalR, ArDtlAppl_Chk01_DtlR baseR) {
		MCNumber amt = baseR.appl_amt().subtract(baseR.org_appl_amt());
		arBalR.rcv_appl_amt(arBalR.rcv_appl_amt().add(amt)); // 消込額
		arBalR.rcv_not_appl_bal(arBalR.rcv_not_appl_bal().subtract(amt)); // 未消込残高
		
		if (isSame(getBaseCur().cur_cd(), baseR.trd_cur_cd())) {
			arBalR.base_cur_rcv_appl_amt(arBalR.rcv_appl_amt());
			arBalR.base_cur_rcv_not_appl_bal(arBalR.rcv_not_appl_bal());
		}
		else {
			// 消込額を基準通貨で換算する
			MCNumber baseCurAmt = convCur(amt, baseR.xrate(),
					getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ());
			arBalR.base_cur_rcv_appl_amt(arBalR.base_cur_rcv_appl_amt().add(baseCurAmt));
			arBalR.base_cur_rcv_not_appl_bal(arBalR.base_cur_rcv_not_appl_bal().subtract(baseCurAmt));
		}
	}

	/**
	 * 月次売掛残高に対する売掛金の消込情報を作成する
	 * 
	 * @param baseL 消込情報
	 * @return 売掛情報
	 */
	protected MCList<MST_MLY_AR_BAL_R> createArBalForArAppl(MCList<ArDtlAppl_Chk01_DtlR> baseL) {

		MCList<MST_MLY_AR_BAL_R> arBalL = MCList.create(MST_MLY_AR_BAL_R.class);

		MCList<ArDtlAppl_Chk01_DtlR> keyL = baseL.groupBy(getArBalForArApplKey());
		keyL.sort(getArBalForArApplKey());
		// 売掛情報のキー毎の処理
		for (ArDtlAppl_Chk01_DtlR keyR : keyL) {
			MST_MLY_AR_BAL_R arBalR = createArBalForAr(keyR); // キーのみが設定された金額ゼロの売掛情報
			MCList<ArDtlAppl_Chk01_DtlR> subL = baseL.subList(getArBalForArApplKey(), keyR); // 売掛情報のキーで抽出したリスト
			// 売掛情報への消込金額（売掛金）の設定
			setArBalAmtForAr(arBalR, subL);
			arBalL.add(arBalR);
		}
		return arBalL;
	}

	protected String[] getArBalForArApplKey() {
		return new String[] {
				ArDtlAppl_Chk01_DtlR.$ac_ym,
				ArDtlAppl_Chk01_DtlR.$ar_dpt_cd,
				ArDtlAppl_Chk01_DtlR.$acst_cd,
				ArDtlAppl_Chk01_DtlR.$iv_no,
				ArDtlAppl_Chk01_DtlR.$trd_cur_cd,
				ArDtlAppl_Chk01_DtlR.$wrk_no,
				ArDtlAppl_Chk01_DtlR.$ar_typ
		};
	}

	/**
	 * 月次売掛残高を作成する（売掛金消込）<p>
	 * 設定するのは月次売掛情報のキーのみ<br>
	 * その他の項目は全てゼロを設定する
	 * 
	 * @param baseR 消込情報
	 * @return 月次売掛残高
	 */
	protected MST_MLY_AR_BAL_R createArBalForAr(ArDtlAppl_Chk01_DtlR baseR) {
		MST_MLY_AR_BAL_R arBalR = MST_MLY_AR_BAL_R.create();
		arBalR.setAttributes(baseR);
		arBalR.ar_dpt_cd(baseR.ar_dpt_cd());
		arBalR.ac_ym(baseR.ac_ym());
		arBalR.acst_cd(baseR.acst_cd());
		arBalR.iv_no(baseR.iv_no());
		arBalR.trd_cur_cd(baseR.trd_cur_cd());
		arBalR.wrk_no(baseR.wrk_no());
		arBalR.ar_typ(baseR.ar_typ());
		arBalR.ar_appl_amt(0);
		arBalR.ar_not_appl_bal(0);
		arBalR.rcv_appl_amt(0);
		arBalR.rcv_not_appl_bal(0);
		arBalR.base_cur_ar_appl_amt(0);
		arBalR.base_cur_ar_not_appl_bal(0);
		arBalR.base_cur_rcv_appl_amt(0);
		arBalR.base_cur_rcv_not_appl_bal(0);

		return arBalR;
	}

	/**
	 * 月次売掛残高に売掛金消込額を設定する
	 * 
	 * @param arBalR 売掛情報（消込額を設定されるコンテナ）
	 * @param baseL 消込情報
	 */
	protected void setArBalAmtForAr(MST_MLY_AR_BAL_R arBalR, MCList<ArDtlAppl_Chk01_DtlR> baseL) {
		for (ArDtlAppl_Chk01_DtlR baseR : baseL) {
			setArBalAmtForAr(arBalR, baseR);
		}
	}

	/**
	 * 月次売掛残高に売掛金消込額を設定する
	 * 
	 * @param arBalR 売掛情報（消込額を設定されるコンテナ）
	 * @param baseR 消込情報
	 */
	protected void setArBalAmtForAr(MST_MLY_AR_BAL_R arBalR, ArDtlAppl_Chk01_DtlR baseR) {
		MCNumber amt = baseR.appl_amt().subtract(baseR.org_appl_amt());
		arBalR.ar_appl_amt(arBalR.ar_appl_amt().add(amt)); // 消込額
		arBalR.ar_not_appl_bal(arBalR.ar_not_appl_bal().subtract(amt)); // 未消込残高

		if (isSame(getBaseCur().cur_cd(), baseR.trd_cur_cd())) {
			arBalR.base_cur_ar_appl_amt(arBalR.ar_appl_amt());
			arBalR.base_cur_ar_not_appl_bal(arBalR.ar_not_appl_bal());
		}
		else {
			// 消込額を基準通貨で換算する
			MCNumber baseCurAmt = convCur(amt, baseR.trd_xrate(),
					getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ());
			arBalR.base_cur_ar_appl_amt(arBalR.base_cur_ar_appl_amt().add(baseCurAmt));
			arBalR.base_cur_ar_not_appl_bal(arBalR.base_cur_ar_not_appl_bal().subtract(baseCurAmt));
		}
	}

	/**
	 * 請求明細消込実績の消込額が０の行を削除する
	 * 
	 * @param baseL 消込条件
	 */
	protected void delBillDApplAct(MCList<ArDtlAppl_Chk01_DtlR> baseL) {
		MCList<ArDtlAppl_Chk01_DtlR> rcvActDKeyL = baseL.groupBy(ArDtlAppl_Chk01_DtlR.$rcv_act_d_no);
		for (ArDtlAppl_Chk01_DtlR rcvActDKeyR : rcvActDKeyL) {
			MST_BILL_D_APPL_ACT_R dbc = MST_BILL_D_APPL_ACT_R.create("T");
			execDbDelete("MSBGL5100_MST_BILL_D_APPL_ACT_D01", dbc, dbc.rcv_act_d_no.eq(bind("rcv_act_d_no"))
					.and(dbc.appl_amt.eq(value(0))), rcvActDKeyR);
		}
	}

	/**
	 * 月次売掛残高情報の更新
	 * 
	 * @param arBalL 月次売掛残高
	 */
	protected void updArBal(MCList<MST_MLY_AR_BAL_R> arBalL,
			MST_MLY_AR_BAL_R arBalL_t, MCQueryApiBuilder arBalL_bldr) {

		// 更新条件の設定
		setUpdArBalCnd(arBalL, arBalL_t, arBalL_bldr);

		dbUpdate("MSBGL5100_MST_MLY_AR_BAL_U01", arBalL, arBalL_bldr);
	}

	/**
	 * 月次売掛残高情報の更新条件の設定
	 * 
	 * @param arBalL 更新用コンテナ
	 */
	protected void setUpdArBalCnd(MCList<MST_MLY_AR_BAL_R> arBalL,
			MST_MLY_AR_BAL_R arBalL_t, MCQueryApiBuilder arBalL_bldr) {
		arBalL_bldr.setSetVL(arBalL_t.ar_appl_amt,
				arBalL_t.ar_appl_amt.add(bindEx("ar_appl_amt")));
		arBalL_bldr.addSetVL(arBalL_t.ar_not_appl_bal,
				arBalL_t.ar_not_appl_bal.add(bindEx("ar_not_appl_bal")));
		arBalL_bldr.addSetVL(arBalL_t.rcv_appl_amt,
				arBalL_t.rcv_appl_amt.add(bindEx("rcv_appl_amt")));
		arBalL_bldr.addSetVL(arBalL_t.rcv_not_appl_bal,
				arBalL_t.rcv_not_appl_bal.add(bindEx("rcv_not_appl_bal")));
		arBalL_bldr.addSetVL(arBalL_t.base_cur_ar_appl_amt,
				arBalL_t.base_cur_ar_appl_amt.add(bindEx("base_cur_ar_appl_amt")));
		arBalL_bldr.addSetVL(arBalL_t.base_cur_ar_not_appl_bal,
				arBalL_t.base_cur_ar_not_appl_bal.add(bindEx("base_cur_ar_not_appl_bal")));
		arBalL_bldr.addSetVL(arBalL_t.base_cur_rcv_appl_amt,
				arBalL_t.base_cur_rcv_appl_amt.add(bindEx("base_cur_rcv_appl_amt")));
		arBalL_bldr.addSetVL(arBalL_t.base_cur_rcv_not_appl_bal,
				arBalL_t.base_cur_rcv_not_appl_bal.add(bindEx("base_cur_rcv_not_appl_bal")));
		arBalL_bldr.setWhere(arBalL_t.ac_ym.eq(bindEx("ac_ym")));
		arBalL_bldr.addWhereWithAnd(arBalL_t.acst_cd.eq(bindEx("acst_cd")));
		arBalL_bldr.addWhereWithAnd(arBalL_t.ar_dpt_cd.eq(bindEx("ar_dpt_cd")));
		arBalL_bldr.addWhereWithAnd(arBalL_t.trd_cur_cd.eq(bindEx("trd_cur_cd")));
		arBalL_bldr.addWhereWithAnd(arBalL_t.iv_no.eq(bindEx("iv_no")));
		arBalL_bldr.addWhereWithAnd(bracket(arBalL_t.wrk_no.eq(bindEx("wrk_no"))
				.or(bindEx("wrk_no").isNull())
				.and(arBalL_t.wrk_no.isNull())));
		arBalL_bldr.addWhereWithAnd(arBalL_t.ar_typ.eq(bindEx("ar_typ")));
	}

	/**
	 * ArDtlAppl_Upd02オペレーション.<p>
	 *
	 * 売掛明細の自動消込処理を行う<br>
	 */
	public class ArDtlAppl_Upd02 extends MSBGL_ArDtlApplService_MC_A.ArDtlAppl_Upd02 {

		protected List<ArDtlAppl_Upd02_DtlR> _errL = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			for (ArDtlAppl_Upd02_DtlR r : up0()) {

				MCList<ArDtlAppl_Chk01_DtlR> applBaseL = createApplBase(r);

				// 消込対象が無い場合はスキップ
				// 明細の金額が0の場合（入金額と相殺額を符号違いで同じ額にした場合）にサイズ0のリストが返ってくる
				if (applBaseL == null || applBaseL.size() == 0) {
					continue;
				}

				chkApplRcvAct(applBaseL);
				applBal(applBaseL);
				
			}
			setMsgPool();
		}

		/**
		 * 消込基本情報の作成
		 * 
		 * @param slipDR 入金実績明細情報
		 */
		protected MCList<ArDtlAppl_Chk01_DtlR> createApplBase(ArDtlAppl_Upd02_DtlR dtlR) {

			MCList<ArDtlAppl_Chk01_DtlR> baseL = MCList.create(ArDtlAppl_Chk01_DtlR.class); // 消込全候補

			// 消込対象が存在しない場合はスキップ
			if (executeQuery(baseL, MSBGL5100_MST_BILL_D_APPL_BAL_S01(), dtlR) == 0) {
				addErrList(dtlR);
				return null;
			}
			MCNumber notApplBal = baseL.sum(ArDtlAppl_Chk01_DtlR.$not_appl_bal); // 消込残高の合計（符号チェック用）
			MCNumber applAmt = dtlR.appl_tgt_amt(); // 債権伝票明細の消込対象額
			// 符号違いの場合はスキップ
			if (notApplBal.multiply(applAmt).isNegative()) {

				addErrList(dtlR);
				return null;
			}
			//取消、無効実績のセットが先頭になるようソートする
			MCList<ArDtlAppl_Chk01_DtlR> sortL = MSBGL_ArUtil.sortRedCanSlipFirst(baseL, applAmt);

			if (checkAppl(notApplBal, applAmt)) {
				for (ArDtlAppl_Chk01_DtlR r : sortL) {
					r.appl_amt(r.not_appl_bal());
				}
				return sortL;
			}
			else {
				// 消込処理の実行
				IfDivideInSeqInfo<ArDtlAppl_Chk01_DtlR> divRslt = FXUCC_Divide.inSeq(
						sortL, applAmt, ArDtlAppl_Chk01_DtlR.$not_appl_bal, ArDtlAppl_Chk01_DtlR.$appl_amt);

				return divRslt.allocated();
			}
		}

		protected void addErrList(ArDtlAppl_Upd02_DtlR r) {
			if (null == _errL) {
				_errL = new ArrayList<ArDtlAppl_Upd02_DtlR>();
			}
			_errL.add(r);
		}

		/**
		 * 自動消込ができなかった明細のエラーメッセージを設定する
		 * 
		 */
		protected void setMsgPool() {
			if (_errL == null) {
				return;
			}
			for (ArDtlAppl_Upd02_DtlR r : _errL) {

				MCMessagePool.add(r, "ArDtlAppl_Upd02_DtlR" , MSBGL0118 , r.rcv_act_d_no());
			}
		}

		/**
		 * 一部消込か全額消込か判定する
		 * 
		 * @param notApplBal 消込残高の合計
		 * @param applAmt 債権伝票明細の消込対象額（相殺額）
		 */
		protected boolean checkAppl(MCNumber notApplBal, MCNumber applAmt) {
			if(applAmt.isNegative()) {
				if(notApplBal.gte(applAmt)) {
					return true;
				}
			}
			else if(notApplBal.lte(applAmt)) {
				return true;
			}
			return false;
		}
	}

	/**
	 * ArDtlAppl_Upd03オペレーション.<p>
	 *
	 * 売掛明細の自動消込処理を行う<br>
	 */
	public class ArDtlAppl_Upd03 extends MSBGL_ArDtlApplService_MC_A.ArDtlAppl_Upd03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			MCList<ArDtlAppl_Chk01_DtlR> baseL = createApplBase();

			if (baseL.isEmpty()) {
				return;
			}

			applBalForEach(baseL);
		}

		/**
		 * 消込基本情報の作成<br>
		 * 都度請求の請求明細の未消込の赤黒のセットを取得する
		 * 
		 * @return 消込基本情報
		 */
		protected MCList<ArDtlAppl_Chk01_DtlR> createApplBase() {

			MCList<ArDtlAppl_Chk01_DtlR> baseL = MCList.create(ArDtlAppl_Chk01_DtlR.class); // 消込全候補

			// 複数の請求先・通貨・I/V Noを扱うため、取得と同時にここでロックをしておく
			executeQuery(baseL, MSBGL5100_MST_BILL_D_APPL_BAL_S02());

			return baseL;

		}
		
		/**
		 * 消込のキーごとに売掛明細を消し込む<p>
		 * キーは売掛部門・売掛先・通貨・インボイスＮｏ・案件ＣＤ
		 * 
		 * @param baseL 消込基本情報
		 */
		protected void applBalForEach(MCList<ArDtlAppl_Chk01_DtlR> baseL) {

			MCList<ArDtlAppl_Chk01_DtlR> grpL = baseL.groupBy(getApplGrpKey());
			MCIndexKey idx = baseL.createIndex(getApplGrpKey());

			for (ArDtlAppl_Chk01_DtlR grpR : grpL) {

				// 自動明細消込から呼ばれた場合、取消、無効がセットになっていない場合がある。
				// 本メソッドの最後で消込の総額がゼロにならない場合は処理しないようにしているので、
				// 取消、無効実績のセット以外の伝票を除外する。
				MCList<ArDtlAppl_Chk01_DtlR> preSubL = baseL.subList(idx, getApplGrpKeyVals(grpR));

				// 取消、無効には同じgrp_idをセットしてある。grp_idで抽出して2件取得できた場合は
				// 取消、無効のセットが取得できたことになるので、消込対象リストに追加。
				// 1件しか取得できなかった実績は除外する。
				MCList<ArDtlAppl_Chk01_DtlR> grpIdL = preSubL.groupBy("grp_id");
				MCIndexKey idx2 = preSubL.createIndex("grp_id");
				MCList<ArDtlAppl_Chk01_DtlR> subL = MCList.create(ArDtlAppl_Chk01_DtlR.class);

				for (ArDtlAppl_Chk01_DtlR grpIdR : grpIdL) {
					MCList<ArDtlAppl_Chk01_DtlR> setL = preSubL.subList(idx2, grpIdR.getStringNE("grp_id"));
					if (setL.size() == 2) {
						subL.addAll(setL);
					}
				}

				//取消、無効のセットが存在しない場合は終了
				if(subL.size() == 0){
					continue;
				}

				subL.setColumnValue(ArDtlAppl_Chk01_DtlR.$appl_amt, ArDtlAppl_Chk01_DtlR.$not_appl_bal); // 全てを消し込んだことにする
				subL.setBoolean(ArDtlAppl_Chk01_DtlR.$un_dtl_appl_flg, true);
				
				// 未消込の赤黒をセットで消し込むため、消込の総額はゼロであること
				if (!subL.sum(ArDtlAppl_Chk01_DtlR.$appl_amt).isZero()) {
					MCLog.write(MSBGL0035, grpR.ar_dpt_cd(), grpR.acst_cd(), grpR.iv_no(), grpR.trd_cur_cd(), grpR.wrk_no(), grpR.ar_typ());
					continue;
				}
				applBal(subL);
			}
		}

		protected String[] getApplGrpKey() {
			return new String[] {
					ArDtlAppl_Chk01_DtlR.$ar_dpt_cd, ArDtlAppl_Chk01_DtlR.$acst_cd,
					ArDtlAppl_Chk01_DtlR.$iv_no, ArDtlAppl_Chk01_DtlR.$trd_cur_cd,
					ArDtlAppl_Chk01_DtlR.$wrk_no, ArDtlAppl_Chk01_DtlR.$ar_typ
			};
		}

		protected Comparable<?>[] getApplGrpKeyVals(ArDtlAppl_Chk01_DtlR baseR) {
			return new Comparable<?>[] {
					baseR.ar_dpt_cd(), baseR.acst_cd(), baseR.iv_no(), baseR.trd_cur_cd(),
					baseR.wrk_no(), baseR.ar_typ()
			};
		}
	}

	//FMCB CUSTOM END
}