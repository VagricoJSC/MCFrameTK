package mcframe.serverMSBE.MSBEL6500;

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
import mcframe.serverMS.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL6500.*; // このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverMSBF.MSBFL5210.*;
import mcframe.serverMSBI.MSBIL5010.Cl_Chk03_CndR;
import mcframe.serverMSBI.MSBIL5010.MSBIL_ClService;
import mcframe.serverMABC.MABCL5010.MABCL_SundryItmRegService;
import mcframe.serverMABC.MABCL5010.SundryItm_Chk01_DtlR;
import mcframe.serverMABC.MABCL5010.SundryItm_Upd01_DtlR;
import mcframe.serverMSBE.MSBEL5010.IoAct_Ins01_DtlR;
import mcframe.serverMSBE.MSBEL5010.MSBEL_IoActService;
import mcframe.serverMSBE.MSBEL5550.*;
import mcframe.commonFXUC.FXUCC0090.FXUCC_RowMapperWith;

import java.util.ArrayList;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_StkXfrActRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_StkXfrActRegService_MC extends MSBEL_StkXfrActRegService_MC_A{
	//FMCB CUSTOM START
	//品目マスタコンテナキャッシュ
	protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache;

	protected FXUCL_MCDbcCache<MAM_ITM_R> getItmCache() {
		return _itmCache;
	}

	protected static final String[] bindCols = new String[] {
			MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2,
			MAM_ITM_R.$itm_sub3
	};

	// 受払更新対象データ
	protected MCList<IoAct_Ins01_DtlR> _ioL;

	// 諸口品更新対象データ
	protected MCList<SundryItm_Upd01_DtlR> _suL;

	// 出荷帳票発行データ
	protected MCList<ShipRprt_Upd01_HdrR> _srpHdrL;

	protected MCList<ShipRprt_Upd01_DtlR> _srpDtlL;

	// 更新前情報
	protected MST_STK_XFR_ACT_R _actH;

	// 新規登録用DBC
	MCList<MST_STK_XFR_ACT_R> _insStkXfrL;

	MCList<MST_STK_XFR_ACT_D_R> _insStkXfrDL;

	// 更新用DBC
	MCList<MST_STK_XFR_ACT_R> _updStkXfrL;

	MCList<MST_STK_XFR_ACT_R> _tsUpdStkXfrL;

	MCList<MST_STK_XFR_ACT_D_R> _updStkXfrDL;

	// 削除用DBC
	MCList<MST_STK_XFR_ACT_R> _delStkXfrL;

	MCList<MST_STK_XFR_ACT_D_R> _delStkXfrDL;

	// チェック処理(ここから)　=========================================================================
	/**
	 * StkXfrAct_Chk01オペレーション.<p>
	 *
	 * 「品目ＣＤ」「ロット・手配ＮＯ」「良品：格付ＣＤ」「荷姿」の振替実績する前に、チェックを実行します。<br>
	 */
	public class StkXfrAct_Chk01 extends MSBEL_StkXfrActRegService_MC_A.StkXfrAct_Chk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void init() {
			super.init();
			_initItmCache(up2());
		}

		@Override
		protected void doIt() {
			super.doIt();

			// サービス呼出
			callChkSvc(up0(), up2());

			setDown();
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
			down2().setAll(up2());
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for (StkXfrAct_Chk01_HdrR hdr : up0()) {
				msgList.addAll(chkHdr(hdr));
				msgList.addAll(chkDtlGi(hdr, exceptDelete(getDtlL(hdr, up1()))));
				msgList.addAll(chkDtlGr(hdr, exceptDelete(getDtlL(hdr, up2()))));
				msgList.addAll(chkDtl(hdr, exceptDelete(getDtlL(hdr, up1())),
						exceptDelete(getDtlL(hdr, up2()))));
			}
			// 荷姿情報の保管
			setPackData(up1());
			setPackData(up2());
			return msgList;
		}
	}

	/**
	 * StkXfrAct_Chk02オペレーション.<p>
	 *
	 * 「品目ＣＤ」「ロット・手配ＮＯ」「良品：格付ＣＤ」「荷姿」の振替実績を訂正する前に、チェックを実行します。<br>
	 */
	public class StkXfrAct_Chk02 extends MSBEL_StkXfrActRegService_MC_A.StkXfrAct_Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void init() {
			super.init();
			_initItmCache(up2());
		}

		@Override
		protected void doIt() {
			super.doIt();
			prepare(up0(), up1(), up2());

			// サービス呼出
			callChkSvc(up0(), up2());

			setDown();
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
			down2().setAll(up2());
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for (StkXfrAct_Chk01_HdrR hdr : up0()) {
				msgList.addAll(chkHdr(hdr));
				msgList.addAll(chkDtlGi(hdr, exceptDelete(getDtlL(hdr, up1()))));
				msgList.addAll(chkDtlGr(hdr, exceptDelete(getDtlL(hdr, up2()))));
				msgList.addAll(chkDtl(hdr, exceptDelete(getDtlL(hdr, up1())),
						exceptDelete(getDtlL(hdr, up2()))));
			}
			// 荷姿情報の補完
			setPackData(up1());
			setPackData(up2());

			return msgList;
		}
	}

	/**
	 * StkXfrAct_Chk03オペレーション.<p>
	 *
	 * 「品目ＣＤ」「ロット・手配ＮＯ」「良品：格付ＣＤ」「荷姿」の振替実績を取り消しする前に、チェックを実行します。<br>
	 */
	public class StkXfrAct_Chk03 extends MSBEL_StkXfrActRegService_MC_A.StkXfrAct_Chk03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			callClChk03(up0());
			setDown();
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for (StkXfrAct_Chk01_HdrR hdr : up0()) {
				msgList.addAll(chkHdr(hdr));
			}
			return msgList;
		}
	}

	protected void prepare(
			MCList<StkXfrAct_Chk01_HdrR> hdrL,
			MCList<StkXfrAct_Chk01_DtlGiR> giL, MCList<StkXfrAct_Chk01_DtlGiR> grL) {

		doDlvSlipCache(hdrL);

		MCIndexKey
			giIdx = giL.createIndex(StkXfrAct_Chk01_DtlGiR.$hdr_dtl_peg_no),
			grIdx = grL.createIndex(StkXfrAct_Chk01_DtlGiR.$hdr_dtl_peg_no);

		for (StkXfrAct_Chk01_HdrR hdrR : hdrL) {
			MCList<StkXfrAct_Chk01_DtlGiR>
				tmpGiL = giL.subList(giIdx, hdrR.hdr_dtl_peg_no()),
				tmpGrL = grL.subList(grIdx, hdrR.hdr_dtl_peg_no());
			cmplStkXfrAct(hdrR, tmpGiL);
			cmplStkXfrAct(hdrR, tmpGrL);
		}
	}

	protected void cmplStkXfrAct(
		StkXfrAct_Chk01_HdrR hdrR, MCList<StkXfrAct_Chk01_DtlGiR> dtlL) {

		MST_DLV_SLIP_R dlvR = getDlvSlipR(hdrR.stk_xfr_act_no());
		hdrR.dlv_slip_no(dlvR.dlv_slip_no());
		for (StkXfrAct_Chk01_DtlGiR dtlR : dtlL) {
			// 納品書関連は、複数件あっても同じ値が設定されているので先頭行の値を取得する
			dtlR.dlv_slip_no(dlvR.dlv_slip_no());
		}
	}

	/**
	 * ヘッダチェック
	 * @param hdrR
	 */
	protected MCMessageList chkHdr(StkXfrAct_Chk01_HdrR hdrR) {
		MCMessageList msgList = new MCMessageList();
		return msgList;
	}

	/**
	 * 明細_出庫チェック
	 * @param hdrR
	 * @param dtlL
	 */
	protected MCMessageList chkDtlGi(StkXfrAct_Chk01_HdrR hdrR,
			MCList<StkXfrAct_Chk01_DtlGiR> dtlL) {
		MCMessageList msgList = new MCMessageList();
		// 手配NOチェック
		msgList.addAll(chkSno(dtlL));
		// ロットNOチェック
		msgList.addAll(chkLot(dtlL));
		// サブロットNOチェック
		msgList.addAll(chkSubLot(dtlL));
		// 在庫取引先チェック
		msgList.addAll(chkBp(dtlL));
		// 確定NOチェック
		msgList.addAll(chkFixNo(dtlL));
		// 在庫着荷先チェック
		msgList.addAll(chkStkArrvBp(hdrR, dtlL));
		return msgList;
	}

	/**
	 * 明細_入庫チェック
	 * @param hdrR
	 * @param dtlL
	 */
	protected MCMessageList chkDtlGr(StkXfrAct_Chk01_HdrR hdrR,
			MCList<StkXfrAct_Chk01_DtlGiR> dtlL) {
		MCMessageList msgList = new MCMessageList();
		// 手配NOチェック
		msgList.addAll(chkSno(dtlL));
		// ロットNOチェック
		msgList.addAll(chkLot(dtlL));
		// サブロットNOチェック
		msgList.addAll(chkSubLot(dtlL));
		// 在庫取引先チェック
		msgList.addAll(chkBp(dtlL));
		// 確定NOチェック
		msgList.addAll(chkFixNo(dtlL));
		// ロット作成チェック
		msgList.addAll(chkCrtLot(dtlL));
		return msgList;
	}

	/**
	 * 明細_手配NOチェック
	 * @param dtlL
	 */
	protected MCMessageList chkSno(MCList<StkXfrAct_Chk01_DtlGiR> dtlL) {
		MCMessageList msgList = new MCMessageList();
		// 手配ＮＯ１管理区分が「管理しない」「管理する（任意：在庫対象外）」の品目に対してNULL文字以外の手配NO１が指定されている場合エラーとする。
		for (StkXfrAct_Chk01_DtlGiR dtl : dtlL) {
			//手配NO１
			if (MAC_SNO_MNG_TYP.isNOT_MNG(dtl.sno1_mng_typ())
					|| MAC_SNO_MNG_TYP.isMNG_NOT_STK(dtl.sno1_mng_typ())) {
				if (!isNull(nullValToNull(dtl.sno1()))) {
					msgList.add(new MCMessage(dtl, StkXfrAct_Chk01_DtlGiR.$sno1,
							MSBEL0063, toDispItm(dtl.itm_cd(), dtl.itm_sub1(),
									dtl.itm_sub2(), dtl.itm_sub3()),
							dtl.sno1_mng_typ(), dtl.sno1()));
				}
			}
			//手配NO2
			if (MAC_SNO_MNG_TYP.isNOT_MNG(dtl.sno2_mng_typ())
					|| MAC_SNO_MNG_TYP.isMNG_NOT_STK(dtl.sno2_mng_typ())) {
				if (!isNull(nullValToNull(dtl.sno2()))) {
					msgList.add(new MCMessage(dtl, StkXfrAct_Chk01_DtlGiR.$sno2,
							MSBEL0064, toDispItm(dtl.itm_cd(), dtl.itm_sub1(),
									dtl.itm_sub2(), dtl.itm_sub3()),
							dtl.sno2_mng_typ(), dtl.sno2()));
				}
			}
			//手配NO3
			if (MAC_SNO_MNG_TYP.isNOT_MNG(dtl.sno3_mng_typ())
					|| MAC_SNO_MNG_TYP.isMNG_NOT_STK(dtl.sno3_mng_typ())) {
				if (!isNull(nullValToNull(dtl.sno3()))) {
					msgList.add(new MCMessage(dtl, StkXfrAct_Chk01_DtlGiR.$sno3,
							MSBEL0065, toDispItm(dtl.itm_cd(), dtl.itm_sub1(),
									dtl.itm_sub2(), dtl.itm_sub3()),
							dtl.sno3_mng_typ(), dtl.sno3()));
				}
			}
			//手配NO4
			if (MAC_SNO_MNG_TYP.isNOT_MNG(dtl.sno4_mng_typ())
					|| MAC_SNO_MNG_TYP.isMNG_NOT_STK(dtl.sno4_mng_typ())) {
				if (!isNull(nullValToNull(dtl.sno4()))) {
					msgList.add(new MCMessage(dtl, StkXfrAct_Chk01_DtlGiR.$sno4,
							MSBEL0066, toDispItm(dtl.itm_cd(), dtl.itm_sub1(),
									dtl.itm_sub2(), dtl.itm_sub3()),
							dtl.sno4_mng_typ(), dtl.sno4()));
				}
			}
		}
		return msgList;
	}

	/**
	 * 明細_ロットNOチェック
	 * @param dtlL
	 */
	protected MCMessageList chkLot(MCList<StkXfrAct_Chk01_DtlGiR> dtlL) {
		MCMessageList msgList = new MCMessageList();
		for (StkXfrAct_Chk01_DtlGiR dtl : dtlL) {
			// ロット管理区分が「ロット管理しない」品目に対して、NULL文字以外のロットＮＯが指定されている場合
			MAM_ITM_R itm = srchItm(dtl.itm_cd(), dtl.itm_sub1(), dtl.itm_sub2(),
					dtl.itm_sub3());
			if (MAC_LOT_MNG_TYP.isNOT_MNG(itm.lot_mng_typ())) {
				if (!isNull(nullValToNull(dtl.lot_no()))) {
					msgList.add(new MCMessage(dtl, StkXfrAct_Chk01_DtlGiR.$lot_no,
							MSBEL0067, toDispItm(dtl.itm_cd(), dtl.itm_sub1(),
									dtl.itm_sub2(), dtl.itm_sub3()),
							itm.lot_mng_typ(), dtl.lot_no()));
				}
			}
		}
		return msgList;
	}

	/**
	 * 明細_サブロットNOチェック
	 * @param dtlL
	 */
	protected MCMessageList chkSubLot(MCList<StkXfrAct_Chk01_DtlGiR> dtlL) {
		MCMessageList msgList = new MCMessageList();
		for (StkXfrAct_Chk01_DtlGiR dtl : dtlL) {
			// ロット管理区分が「ロット管理しない」品目に対して、NULL文字以外のロットＮＯが指定されている場合
			MAM_ITM_R itm = srchItm(dtl.itm_cd(), dtl.itm_sub1(), dtl.itm_sub2(),
					dtl.itm_sub3());
			if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(itm.sublot_mng_typ())) {
				if (!isNull(nullValToNull(dtl.sublot_no()))) {
					msgList.add(new MCMessage(dtl, StkXfrAct_Chk01_DtlGiR.$sublot_no,
							MSBEL0068,
							toDispItm(dtl.itm_cd(), dtl.itm_sub1(), dtl.itm_sub2(),
									dtl.itm_sub3()),
							itm.sublot_mng_typ(), dtl.sublot_no()));
				}
			}
		}
		return msgList;
	}

	/**
	 * 明細_在庫取引先チェック
	 * @param dtlL
	 */
	protected MCMessageList chkBp(MCList<StkXfrAct_Chk01_DtlGiR> dtlL) {
		MCMessageList msgList = new MCMessageList();
		for (StkXfrAct_Chk01_DtlGiR dtl : dtlL) {
			// 在庫識別区分が「自社在庫」の在庫に対して、NULL文字以外の在庫取引先CDが指定されている場合
			if (MSC_STK_ID_TYP.isCOSTK(dtl.stk_id_typ())) {
				if (!isNull(nullValToNull(dtl.stk_bp_cd()))) {
					msgList.add(new MCMessage(dtl, StkXfrAct_Chk01_DtlGiR.$stk_bp_cd,
							MSBEL0069, toDispItm(dtl.itm_cd(), dtl.itm_sub1(),
									dtl.itm_sub2(), dtl.itm_sub3()),
							dtl.stk_id_typ(), dtl.stk_bp_cd()));
				}
			}
		}
		return msgList;
	}

	/**
	 * 明細_在庫着荷先チェック
	 * @param hdrR
	 * @param dtlL
	 */
	protected MCMessageList chkStkArrvBp(StkXfrAct_Chk01_HdrR hdrR, MCList<StkXfrAct_Chk01_DtlGiR> dtlL) {
		MCMessageList msgList = new MCMessageList();
		for (StkXfrAct_Chk01_DtlGiR dtl : dtlL) {
			// 自社場所かつ自社在庫かつ確定ＮＯなしで在庫着荷先が指定されている場合
			if (isNull(hdrR.sppl_cd())
					&& MSC_STK_ID_TYP.isCOSTK(dtl.stk_id_typ())
					&& (isNull(dtl.fix_no_typ()) || MSC_FIX_NO_TYP.isNON(dtl.fix_no_typ()))
					&& !isNullOrNullVal(dtl.stk_arrv_bp_cd())) {
				msgList.add(new MCMessage(dtl, StkXfrAct_Chk01_DtlGiR.$stk_arrv_bp_cd,
						MSBEL0331));
			}
		}
		return msgList;
	}

	/**
	 * 明細_確定NOチェック
	 * @param dtlL
	 */
	protected MCMessageList chkFixNo(MCList<StkXfrAct_Chk01_DtlGiR> dtlL) {
		MCMessageList msgList = new MCMessageList();
		for (StkXfrAct_Chk01_DtlGiR dtl : dtlL) {
			// 確定NO区分が「なし」に対して、NULL文字以外の確定NOが指定されている場合
			if (MSC_FIX_NO_TYP.isNON(dtl.fix_no_typ())) {
				if (!isNull(nullValToNull(dtl.fix_no()))) {
					msgList.add(new MCMessage(dtl, StkXfrAct_Chk01_DtlGiR.$fix_no,
							MSBEL0173, dtl.fix_no_typ(), dtl.fix_no()));
				}
			}
			if (isNull(dtl.fix_no_typ())) {
				// 確定ＮＯ区分及び確定ＮＯが未設定の場合は補完
				dtl.fix_no_typ(MSC_FIX_NO_TYP.NON.value());
				dtl.fix_no(MAC_STR.NULL_VAL.value());
			}
		}
		return msgList;
	}

	/**
	 * ロット作成チェック
	 * @param dtlL
	 */
	protected MCMessageList chkCrtLot(MCList<StkXfrAct_Chk01_DtlGiR> dtlL) {
		MCMessageList msgList = new MCMessageList();
		for (StkXfrAct_Chk01_DtlGiR dtl : dtlL) {
			// ロット入力不可チェック
			MAM_ITM_R itmR = srchItm(dtl.itm_cd(), dtl.itm_sub1(), dtl.itm_sub2(), dtl.itm_sub3());
			if (itmR.not_new_lot_flg() && dtl.crt_lot_flg()) {
				msgList.add(new MCMessage(dtl, null, MSBEL0311, toDispGUIIndex(dtl)));
			}
		}
		return msgList;
	}

	/**
	 * 明細チェック
	 * @param hdrR
	 * @param dtlLU
	 * @param dtlLD
	 */
	protected MCMessageList chkDtl(StkXfrAct_Chk01_HdrR hdrR,
			MCList<StkXfrAct_Chk01_DtlGiR> dtlGiL,
			MCList<StkXfrAct_Chk01_DtlGiR> dtlGrL) {
		MCMessageList msgList = new MCMessageList();

		// 振替対象比率チェック
		msgList.addAll(checkRowCount(hdrR, dtlGiL, dtlGrL));

		// 資産管理区分チェック
		msgList.addAll(checkAssetMngＴyp(hdrR, dtlGiL, dtlGrL));

		// 振替内容の同一チェック
		msgList.addAll(checkSame(hdrR, dtlGiL, dtlGrL));

		// 変更不可情報の振替チェック
		msgList.addAll(checkSameVal(hdrR, dtlGiL, dtlGrL));

		// 基準単位数チェック
		msgList.add(checkQty(hdrR, dtlGiL, dtlGrL));

		return msgList;
	}

	protected void callChkSvc(MCList<StkXfrAct_Chk01_HdrR> hdr,
			MCList<StkXfrAct_Chk01_DtlGiR> dtl) {
		//締め処理ユーティリティー
		MSBIL_ClService.Cl_Chk03 cc = MSBIL_ClService.crtCl_Chk03();

		for (StkXfrAct_Chk01_HdrR hdrR : hdr) {
			MCList<StkXfrAct_Chk01_DtlGiR> dtlL = dtl.subList(
					StkXfrAct_Chk01_DtlGiR.$hdr_dtl_peg_no, hdrR.hdr_dtl_peg_no());
			// ロット重複チェック
			MSBFL_LotService.Lot_Chk02 lc02 = MSBFL_LotService.crtLot_Chk02();
			// ロット存在チェック
			MSBFL_LotService.Lot_Chk03 lc03 = MSBFL_LotService.crtLot_Chk03();
			// 諸口品チェック
			MABCL_SundryItmRegService.SundryItm_Chk01 sc = MABCL_SundryItmRegService
					.crtSundryItm_Chk01();

			for (StkXfrAct_Chk01_DtlGiR dtlR : dtlL) {
				if (dtlR.crt_lot_flg()) {
					// ロット作成FLGｔがtrueの場合、ロット重複チェック呼出
					Lot_Chk02_CndR lcCnd = lc02.createLot_Chk02_CndR();
					copy(lcCnd, dtlR, createMap_Lot_Chk02_CndR_StkXfrAct_Chk01_DtlGiR());
					lc02.up0().add(lcCnd);
				}
				else {
					// ロット作成FLGｔがfalseの場合、ロット存在チェック呼出
					Lot_Chk03_CndR lcCnd = lc03.createLot_Chk03_CndR();
					copy(lcCnd, dtlR, createMap_Lot_Chk03_CndR_StkXfrAct_Chk01_DtlGiR());
					lc03.up0().add(lcCnd);
				}

				// 諸口品チェックサービス呼び出し 
				if (dtlR.sundry_itm_flg()) {
					SundryItm_Chk01_DtlR scCnd = sc.createSundryItm_Chk01_DtlR();
					copy(scCnd, dtlR,
							createMap_SundryItm_Chk01_DtlR_StkXfrAct_Chk01_DtlGiR());
					sc.up0().add(scCnd);
				}
			}
			lc02.exec();
			copyErrFlg(dtlL, lc02.down0());
			lc03.exec();
			copyErrFlg(dtlL, lc03.down0());
			sc.exec();
			copyErrFlg(dtlL, sc.down0());

			// 締め処理ユーティリティー呼び出し
			MCList<Cl_Chk03_CndR> ccCnd = cc.createCl_Chk03_CndL();
			addAll(ccCnd, dtlL, hdrR, createMap_Cl_Chk03_CndR_StkXfrAct_Chk01_DtlGiR());
			cc.up0().addAll(ccCnd);
		}
		cc.exec();
		copyErrFlg(hdr, cc.down0());
	}

	/**
	 * 締日チェックサービス
	 */
	protected void callClChk03(MCList<StkXfrAct_Chk01_HdrR> hdrL) {
		// 締め処理ユーティリティー
		MSBIL_ClService.Cl_Chk03 cc = MSBIL_ClService.crtCl_Chk03();

		MCList<MST_STK_XFR_ACT_R> stkXfrActL = MCList.create(MST_STK_XFR_ACT_R.class);
		for (StkXfrAct_Chk01_HdrR hdrR : hdrL) {
			MST_STK_XFR_ACT_R stkXfrActR = MST_STK_XFR_ACT_R.create();
			stkXfrActR.stk_xfr_act_no(hdrR.stk_xfr_act_no());
			stkXfrActL.add(stkXfrActR);
		}
		dbWkInsert("MSBEL6500_MSW_STK_XFR_ACT_I01", stkXfrActL, MST_STK_XFR_ACT_R.create("T"));
		
		MCList<MST_STK_XFR_ACT_D_R> stkXfrActDL = MCList.create(MST_STK_XFR_ACT_D_R.class);
		MST_STK_XFR_ACT_D_R stkXfrActDR = MST_STK_XFR_ACT_D_R.create("T");
		MCQueryApiBuilder stkXfrActDL_bldr = MCQueryApiBuilder.create(stkXfrActDR);
		MSW_STK_XFR_ACT_KEY_R stkXfrActKeyR = MSW_STK_XFR_ACT_KEY_R.create("W");
		stkXfrActDL_bldr.addInnerJoin(stkXfrActKeyR, bracket(stkXfrActDR.stk_xfr_act_no.eq(stkXfrActKeyR.stk_xfr_act_no)));
		dbSelect("MSBEL6500_MST_STK_XFR_ACT_D_S02", stkXfrActDL, stkXfrActDL_bldr);

		for (StkXfrAct_Chk01_HdrR hdrR : hdrL) {
			MCList<MST_STK_XFR_ACT_D_R> subL = stkXfrActDL.subList(MST_STK_XFR_ACT_D_R.$stk_xfr_act_no, hdrR.stk_xfr_act_no());
			for (MST_STK_XFR_ACT_D_R r : subL) {
				// 締め処理ユーティリティー呼び出し
				Cl_Chk03_CndR ccCnd = cc.createCl_Chk03_CndR();
				ccCnd.stk_cls_chk_flg(true);
				ccCnd.peg_no(hdrR.peg_no());
				ccCnd.can_ac_dt(hdrR.can_ac_dt());
				ccCnd.old_loc_cd(hdrR.loc_cd());
				ccCnd.old_itm_cd(r.itm_cd());
				ccCnd.old_itm_sub1(r.itm_sub1());
				ccCnd.old_itm_sub2(r.itm_sub2());
				ccCnd.old_itm_sub3(r.itm_sub3());
				cc.up0().add(ccCnd);
			}
		}
		cc.exec();
		copyErrFlg(hdrL, cc.down0());
	}

	/**
	 * 振替対象比率チェック
	 */
	protected MCMessageList checkRowCount(StkXfrAct_Chk01_HdrR hdrR,
			MCList<StkXfrAct_Chk01_DtlGiR> dtlGiL,
			MCList<StkXfrAct_Chk01_DtlGiR> dtlGrL) {
		MCMessageList msgList = new MCMessageList();

		// 出庫情報複数、入庫情報複数の振替の場合
		if (dtlGiL.size() > 1 && dtlGrL.size() > 1) {
			msgList.add(
					new MCMessage(hdrR, null, MSBEL0070, dtlGiL.size(), dtlGrL.size()));
		}
		return msgList;
	}

	/**
	 * 資産管理区分チェック
	 */
	protected MCMessageList checkAssetMngＴyp(StkXfrAct_Chk01_HdrR hdrR,
			MCList<StkXfrAct_Chk01_DtlGiR> dtlGiL,
			MCList<StkXfrAct_Chk01_DtlGiR> dtlGrL) {
		MCMessageList msgList = new MCMessageList();

		//品目振替は資産管理区分が変わる品目間の振替は許さない
		if (MAC_TRD_PTN_TYP.isXFR_ITM(hdrR.trd_ptn_typ())) {
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCList<MAM_ITM_R> itm = MCList.create(MAM_ITM_R.class);
			MCQueryApiBuilder itm_bldr = MCQueryApiBuilder.create(t);
			itm.addAllByName(dtlGiL);
			itm.addAllByName(dtlGrL);
			itm_bldr.setSelect(t.itm_cd, t.asset_mng_typ);
			dbSelectKey("MSBEL6500_MAM_ITM_S01", itm, itm_bldr, itm);

			// 資産管理対象品目と非管理対象品目が混在する場合
			if (itm.groupBy(MAM_ITM_R.$asset_mng_typ)
					.count(MAM_ITM_R.$asset_mng_typ) != 1) {
				msgList.add(new MCMessage(hdrR, null, MSBEL0071));
			}
		}
		return msgList;
	}

	/**
	 * 振替内容の同一チェック
	 */
	protected MCMessageList checkSame(StkXfrAct_Chk01_HdrR hdrR,
			MCList<StkXfrAct_Chk01_DtlGiR> dtlGiL,
			MCList<StkXfrAct_Chk01_DtlGiR> dtlGrL) {
		MCMessageList msgList = new MCMessageList();

		if (dtlGiL.size() == 1) {
			for (StkXfrAct_Chk01_DtlGiR grR : dtlGrL) {
				if (isColSame(grR, dtlGiL.get(0), soDtlStkKey())) {
					msgList.add(new MCMessage(grR, null, MSBEL0072, toDispGUIIndex(grR)));
				}
			}
			if (MAC_TRD_PTN_TYP.isXFR_ITM(hdrR.trd_ptn_typ())) {
				// 品目振替で同一の品目ＣＤがないかのチェック１（入庫複数）
				msgList.addAll(checkSameItm(dtlGiL.get(0), dtlGrL));
			}
		}
		else {
			if (dtlGrL.size() == 1) {
				StkXfrAct_Chk01_DtlGiR grR = dtlGrL.get(0);
				for (StkXfrAct_Chk01_DtlGiR giR : dtlGiL) {
					if (isColSame(giR, grR, soDtlStkKey())) {
						// 入庫が１レコードの場合なので１つでもチェックに掛かれば十分
						msgList.add(
								new MCMessage(grR, null, MSBEL0072, toDispGUIIndex(grR)));
						break;
					}
				}
				if (MAC_TRD_PTN_TYP.isXFR_ITM(hdrR.trd_ptn_typ())) {
					// 品目振替で同一の品目ＣＤがないかのチェック２（出庫複数）
					msgList.addAll(checkSameItm(dtlGrL.get(0), dtlGiL));
				}
			}
		}
		return msgList;
	}

	/**
	 * {@link StkXfrAct_Chk01_DtlGiR}の中の在庫のキー項目を返す
	 * @return
	 */
	protected String[] soDtlStkKey() {
		return new String[] {
				StkXfrAct_Chk01_DtlGiR.$itm_cd, StkXfrAct_Chk01_DtlGiR.$itm_sub1,
				StkXfrAct_Chk01_DtlGiR.$itm_sub2, StkXfrAct_Chk01_DtlGiR.$itm_sub3,
				StkXfrAct_Chk01_DtlGiR.$str_ln_cd, StkXfrAct_Chk01_DtlGiR.$stk_arrv_bp_cd,
				StkXfrAct_Chk01_DtlGiR.$lot_no, StkXfrAct_Chk01_DtlGiR.$sublot_no,
				StkXfrAct_Chk01_DtlGiR.$sno1, StkXfrAct_Chk01_DtlGiR.$sno2,
				StkXfrAct_Chk01_DtlGiR.$sno3, StkXfrAct_Chk01_DtlGiR.$sno4,
				StkXfrAct_Chk01_DtlGiR.$fix_no_typ, StkXfrAct_Chk01_DtlGiR.$fix_no,
				StkXfrAct_Chk01_DtlGiR.$trd_unit_cd, StkXfrAct_Chk01_DtlGiR.$gd_cd,
				StkXfrAct_Chk01_DtlGiR.$quality_typ, StkXfrAct_Chk01_DtlGiR.$stk_id_typ,
				StkXfrAct_Chk01_DtlGiR.$stk_bp_cd,
		};
	}

	/**
	 * 同一品目の振替チェック
	 */
	protected MCMessageList checkSameItm(StkXfrAct_Chk01_DtlGiR orgRow,
			MCList<StkXfrAct_Chk01_DtlGiR> tarList) {
		MCMessageList msgList = new MCMessageList();

		String[] itmCols = new String[] {
				StkXfrAct_Chk01_DtlGiR.$itm_cd, StkXfrAct_Chk01_DtlGiR.$itm_sub1,
				StkXfrAct_Chk01_DtlGiR.$itm_sub2, StkXfrAct_Chk01_DtlGiR.$itm_sub3
		};
		for (StkXfrAct_Chk01_DtlGiR row : tarList) {
			//  同一品目の振替の場合
			if (isColSame(row, orgRow, itmCols)) {
				msgList.add(new MCMessage(row, null, MSBEL0073, toDispItm(row.itm_cd(), row.itm_sub1(), row.itm_sub2(), row.itm_sub3())));
			}
		}
		return msgList;
	}

	/**
	 * 荷姿情報を設定する。
	 * @param dtlL 設定対象リスト
	 */
	protected void setPackData(MCList<StkXfrAct_Chk01_DtlGiR> dtlL) {
		for (StkXfrAct_Chk01_DtlGiR r : dtlL) {
			// 取引単位が荷姿の場合、荷姿単位として設定
			if (r.pack_flg()) {
				r.pack_unit_cd(r.trd_unit_cd());
				r.pack_unit_qty(r.trd_unit_qty());
			}
			else {
				// 上記以外は基準単位を似姿単位として設定
				r.pack_unit_cd(r.base_unit_cd());
				r.pack_unit_qty(r.base_unit_qty());
			}
		}
	}

	/**
	 * 基準単位数の合計が等しいかチェック
	 */
	protected MCMessage checkQty(StkXfrAct_Chk01_HdrR hdrR,
			MCList<StkXfrAct_Chk01_DtlGiR> dtlGiL,
			MCList<StkXfrAct_Chk01_DtlGiR> dtlGrL) {
		// 取引パタン区分が「品目振替」の場合をチェック対象外。
		if (MAC_TRD_PTN_TYP.isXFR_ITM(hdrR.trd_ptn_typ())) {
			return null;
		}

		MCNumber giSum = sumQty(dtlGiL);
		MCNumber grSum = sumQty(dtlGrL);
		// 出庫情報の「基準単位数量」の合計と入庫情報の「基準単位数量」の合計が異なっている場合
		if (!grSum.eq(giSum)) {
			return new MCMessage(hdrR, null, MSBEL0074, giSum, grSum);
		}
		return null;
	}

	/**
	 * 基準数量合計を計算する。但し削除行は合算対象から外す
	 */
	protected MCNumber sumQty(MCList<StkXfrAct_Chk01_DtlGiR> list) {
		// 前提：削除行以外に関係ない行は存在しない
		MCList<StkXfrAct_Chk01_DtlGiR> listForSum = exceptDelete(list);
		return nvl(listForSum.sum(StkXfrAct_Chk01_DtlGiR.$base_unit_qty), MCNumber.ZERO);
	}

	/**
	 * 削除以外のステータス行のみを返す
	 */
	protected MCList<StkXfrAct_Chk01_DtlGiR> exceptDelete(
			MCList<StkXfrAct_Chk01_DtlGiR> list) {
		return list.subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));
	}

	/**
	 * 変更不可情報を変更しようとしていないかのチェック
	 */
	protected MCMessageList checkSameVal(StkXfrAct_Chk01_HdrR hdrR,
			MCList<StkXfrAct_Chk01_DtlGiR> dtlGiL,
			MCList<StkXfrAct_Chk01_DtlGiR> dtlGrL) {
		MCMessageList msgList = new MCMessageList();

		MCList<StkXfrAct_Chk01_DtlGiR> allList = MCList
				.create(StkXfrAct_Chk01_DtlGiR.class);
		allList.addAll(dtlGiL);
		allList.addAll(dtlGrL);

		for (String col : getContColList(hdrR.trd_ptn_typ())) {
			if (allList.groupBy(col).count(col) > 1) {
				String label = getLabel(allList.get(0), col);
				//　次の項目の値が１種類となるように選択してください。
				msgList.add(new MCMessage(hdrR, null, MSBEL0075, label));
			}
		}
		return msgList;
	}

	/**
	 * 取引パタン区分に応じた変更できない在庫キーの配列を返す
	 */
	protected ArrayList<String> getContColList(String trdPtnTyp) {
		ArrayList<String> uniqueColList = new ArrayList<String>();
		// 在庫のキー項目から、取引パタン区分に応じた変更可能項目を除外する
		for (String name : soDtlStkKey()) {
			if (MAC_TRD_PTN_TYP.isXFR_ITM(trdPtnTyp)) {
				if (isSame(name, StkXfrAct_Chk01_DtlGiR.$itm_cd)) continue;
				if (isSame(name, StkXfrAct_Chk01_DtlGiR.$itm_sub1)) continue;
				if (isSame(name, StkXfrAct_Chk01_DtlGiR.$itm_sub2)) continue;
				if (isSame(name, StkXfrAct_Chk01_DtlGiR.$itm_sub3)) continue;
				if (isSame(name, StkXfrAct_Chk01_DtlGiR.$lot_no)) continue;
				if (isSame(name, StkXfrAct_Chk01_DtlGiR.$sublot_no)) continue;
				if (isSame(name, StkXfrAct_Chk01_DtlGiR.$sno1)) continue;
				if (isSame(name, StkXfrAct_Chk01_DtlGiR.$sno2)) continue;
				if (isSame(name, StkXfrAct_Chk01_DtlGiR.$sno3)) continue;
				if (isSame(name, StkXfrAct_Chk01_DtlGiR.$sno4)) continue;
				if (isSame(name, StkXfrAct_Chk01_DtlGiR.$pack_unit_cd)) continue;
				if (isSame(name, StkXfrAct_Chk01_DtlGiR.$trd_unit_cd)) continue;
			}
			if (MAC_TRD_PTN_TYP.isXFR_LOT_SNO(trdPtnTyp)) {
				if (isSame(name, StkXfrAct_Chk01_DtlGiR.$lot_no)) continue;
				if (isSame(name, StkXfrAct_Chk01_DtlGiR.$sublot_no)) continue;
				if (isSame(name, StkXfrAct_Chk01_DtlGiR.$sno1)) continue;
				if (isSame(name, StkXfrAct_Chk01_DtlGiR.$sno2)) continue;
				if (isSame(name, StkXfrAct_Chk01_DtlGiR.$sno3)) continue;
				if (isSame(name, StkXfrAct_Chk01_DtlGiR.$sno4)) continue;
			}
			if (MAC_TRD_PTN_TYP.isXFR_GRD(trdPtnTyp)) {
				if (isSame(name, StkXfrAct_Chk01_DtlGiR.$gd_cd)) continue;
				if (isSame(name, StkXfrAct_Chk01_DtlGiR.$quality_typ)) continue;
			}
			if (MAC_TRD_PTN_TYP.isXFR_PACK(trdPtnTyp)) {
				if (isSame(name, StkXfrAct_Chk01_DtlGiR.$trd_unit_cd)) continue;
			}
			uniqueColList.add(name);
		}
		return uniqueColList;
	}
// チェック処理(ここまで)　=========================================================================

	/**
	 * StkXfrAct_Ins01オペレーション.<p>
	 *
	 * 「品目ＣＤ」「ロット・手配ＮＯ」「良品：格付ＣＤ」「荷姿」の振替実績を登録します。<br>
	 */
	public class StkXfrAct_Ins01 extends MSBEL_StkXfrActRegService_MC_A.StkXfrAct_Ins01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			//前処理
			preProc(up1(), up2());

			// 更新処理
			for (StkXfrAct_Chk01_HdrR hdr : up0()) {
				prcC(hdr, getDtlL(hdr, up1()), getDtlL(hdr, up2()));
			}
			thisExec();

			// 下り電文設定
			retHdr(down0(), up0());
			retDtl(down1(), up1());
			retDtl(down2(), up2());
		}
	}

	/**
	 * StkXfrAct_Upd01オペレーション.<p>
	 *
	 * 「品目ＣＤ」「ロット・手配ＮＯ」「良品：格付ＣＤ」「荷姿」の振替実績を訂正します。<br>
	 */
	public class StkXfrAct_Upd01 extends MSBEL_StkXfrActRegService_MC_A.StkXfrAct_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			//前処理
			preProc(up1(), up2());

			// 更新処理
			for (StkXfrAct_Chk01_HdrR hdr : up0()) {
				prcCMD(hdr, getDtlL(hdr, up1()), getDtlL(hdr, up2()));
			}
			thisExec();

			// 下り電文設定
			retHdr(down0(), up0());
			// 下り電文設定（明細）
			retDtl(down1(), up1());
			retDtl(down2(), up2());
		}
	}

	/**
	 * StkXfrAct_Del01オペレーション.<p>
	 *
	 * 「品目ＣＤ」「ロット・手配ＮＯ」「良品：格付ＣＤ」「荷姿」の振替実績を取り消します。<br>
	 */
	public class StkXfrAct_Del01 extends MSBEL_StkXfrActRegService_MC_A.StkXfrAct_Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			//前処理
			preProc(null, null);

			// 更新処理
			for (StkXfrAct_Chk01_HdrR hdr : up0()) {
				prcD(hdr);
			}
			thisExec();

			// 下り電文設定
			retHdr(down0(), up0());
		}
	}

	/**
	 * 前処理
	 */
	protected void preProc(MCList<StkXfrAct_Chk01_DtlGiR> list1,
			MCList<StkXfrAct_Chk01_DtlGiR> list2) {
		_ioL = MCList.create(IoAct_Ins01_DtlR.class);
		_suL = MCList.create(SundryItm_Upd01_DtlR.class);

		_srpHdrL = MCList.create(ShipRprt_Upd01_HdrR.class);
		_srpDtlL = MCList.create(ShipRprt_Upd01_DtlR.class);

		_actH = MST_STK_XFR_ACT_R.create();
		_insStkXfrL = MCList.create(MST_STK_XFR_ACT_R.class);
		_insStkXfrDL = MCList.create(MST_STK_XFR_ACT_D_R.class);
		_updStkXfrL = MCList.create(MST_STK_XFR_ACT_R.class);
		_updStkXfrDL = MCList.create(MST_STK_XFR_ACT_D_R.class);
		_tsUpdStkXfrL = MCList.create(MST_STK_XFR_ACT_R.class);
		_delStkXfrL = MCList.create(MST_STK_XFR_ACT_R.class);
		_delStkXfrDL = MCList.create(MST_STK_XFR_ACT_D_R.class);

		if (isNull(list1) || isNull(list2)) {
			return;
		}

		// 積送品区分、在庫検査区分に固定値を設定
		for (StkXfrAct_Chk01_DtlGiR dtlR : list1) {
			dtlR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
			dtlR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
		}
		for (StkXfrAct_Chk01_DtlGiR dtlR : list2) {
			dtlR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
			dtlR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
		}

		// 発番システム区分のNOを発番する場合は、事前にキャッシュ（doSeqCache）を実行してから
		// getStrSeqでＮＯを取得する（通信回数削減のため）
		int cacheSize = list1.subList(StkXfrAct_Chk01_DtlGiR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value()).size();
		cacheSize = cacheSize + list2.subList(StkXfrAct_Chk01_DtlGiR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value()).size();
		doSeqCache(MSC_NUM_SYS_TYP.SXFRACTD, cacheSize);
	}

	/**
	 * 登録・更新・削除を実施
	 */
	protected void thisExec() {
		// サービス呼出
		callSvc();

		// 登録
		dbInsert("MSBEL6500_MST_STK_XFR_ACT_I01", _insStkXfrL, MCQueryApiBuilder.create(MST_STK_XFR_ACT_R.create("T")));
		
		dbInsert("MSBEL6500_MST_STK_XFR_ACT_D_I01", _insStkXfrDL, MCQueryApiBuilder.create(MST_STK_XFR_ACT_D_R.create("T")));

		// 更新
		dbUpdateKey("MSBEL6500_MST_STK_XFR_ACT_U01", _updStkXfrL, MCQueryApiBuilder.create(MST_STK_XFR_ACT_R.create("T")));
		
		dbTsUpdateKey("MSBEL6500_MST_STK_XFR_ACT_U02", _tsUpdStkXfrL, MCQueryApiBuilder.create(MST_STK_XFR_ACT_R.create("T")).getBaseDbc());
		
		dbUpdateKey("MSBEL6500_MST_STK_XFR_ACT_D_U01", _updStkXfrDL, MCQueryApiBuilder.create(MST_STK_XFR_ACT_D_R.create("T")));

		// 削除
		dbDeleteKey("MSBEL6500_MST_STK_XFR_ACT_D01", _delStkXfrL, MCQueryApiBuilder.create(MST_STK_XFR_ACT_R.create("T")));

		dbDeleteKey("MSBEL6500_MST_STK_XFR_ACT_D_D02", _delStkXfrDL, MCQueryApiBuilder.create(MST_STK_XFR_ACT_D_R.create("T")));
	}

	/**
	 * 新規登録処理
	 */
	protected void prcC(StkXfrAct_Chk01_HdrR hdrR, MCList<StkXfrAct_Chk01_DtlGiR> dtlGiL,
			MCList<StkXfrAct_Chk01_DtlGiR> dtlGrL) {
		// 在庫振替実績ヘッダ新規登録
		insHdr(hdrR);

		// 新規登録 (明細)
		int giDispSeq = 1;
		for (StkXfrAct_Chk01_DtlGiR dtlR : dtlGiL) {
			dtlR.stk_xfr_d().io_typ(MSC_IO_TYP.GI.value());
			dtlR.disp_seq(giDispSeq);
			giDispSeq++;

			doPrcC(hdrR, dtlR);
		}
		int grDispSeq = 1;
		for (StkXfrAct_Chk01_DtlGiR dtlR : dtlGrL) {
			dtlR.stk_xfr_d().io_typ(MSC_IO_TYP.GR.value());
			dtlR.disp_seq(grDispSeq);
			grDispSeq++;

			doPrcC(hdrR, dtlR);
		}
	}

	/**
	 * 更新処理
	 */
	protected void prcCMD(StkXfrAct_Chk01_HdrR hdrR,
			MCList<StkXfrAct_Chk01_DtlGiR> dtlGiL,
			MCList<StkXfrAct_Chk01_DtlGiR> dtlGrL) {
		// 在庫振替実績ヘッダ更新
		updHdr(hdrR);

		// 更新（明細）
		int giDispSeq = 1;
		for (StkXfrAct_Chk01_DtlGiR dtlR : dtlGiL) {
			dtlR.stk_xfr_d().io_typ(MSC_IO_TYP.GI.value());
			// 新規
			if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
				dtlR.disp_seq(giDispSeq);
				giDispSeq++;
				doPrcC(hdrR, dtlR);
			}
			// 更新
			else if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
				dtlR.disp_seq(giDispSeq);
				giDispSeq++;
				doPrcM(hdrR, dtlR);
			}
			// 削除
			else if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
				doPrcD(hdrR, dtlR);
			}
		}
		int grDispSeq = 1;
		for (StkXfrAct_Chk01_DtlGiR dtlR : dtlGrL) {
			dtlR.stk_xfr_d().io_typ(MSC_IO_TYP.GR.value());
			// 新規
			if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
				dtlR.disp_seq(grDispSeq);
				grDispSeq++;
				doPrcC(hdrR, dtlR);
			}
			// 更新
			else if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
				dtlR.disp_seq(grDispSeq);
				grDispSeq++;
				doPrcM(hdrR, dtlR);
			}
			// 削除
			else if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
				doPrcD(hdrR, dtlR);
			}
		}
	}

	/**
	 * 削除処理
	 */
	protected void prcD(StkXfrAct_Chk01_HdrR hdrR) {
		// 在庫振替実績ヘッダ削除
		delHdr(hdrR);

		// 削除（明細）
		MCList<MST_STK_XFR_ACT_D_R> delL = MCList.create(MST_STK_XFR_ACT_D_R.class);
		MST_STK_XFR_ACT_D_R t = MST_STK_XFR_ACT_D_R.create("T");
		MCQueryApiBuilder delL_bldr = MCQueryApiBuilder.create(t);

		delL_bldr.setWhere(t.stk_xfr_act_no.eq(bind("stk_xfr_act_no")), hdrR);
		dbSelect("MSBEL6500_MST_STK_XFR_ACT_D_S01", delL, delL_bldr);
		_delStkXfrDL.addAll(delL);

		//出荷帳票発行サービスのヘッダリスト作成（削除用）
		makeSrpHdr_D(hdrR);
	}

	/**
	 * 在庫振替実績ヘッダ新規登録
	 */
	protected void insHdr(StkXfrAct_Chk01_HdrR hdrR) {
		// 在庫振替実績ＮＯの設定
		setHdrNum(hdrR);

		// 新規登録 (在庫振替実績ヘッダ)
		_insStkXfrL.add(hdrR.stk_xfr());

		// 出荷帳票発行サービスのヘッダリスト作成
		makeSrpHdr_I(hdrR);
	}

	/**
	 * 在庫振替実績ヘッダ更新
	 */
	protected void updHdr(StkXfrAct_Chk01_HdrR hdrR) {
		if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())) {
			_updStkXfrL.add(hdrR.stk_xfr());
		}
		else {
			// 更新情報のみ更新
			_tsUpdStkXfrL.add(hdrR.stk_xfr());
		}

		// 出荷帳票発行サービスのヘッダリスト作成
		makeSrpHdr_U(hdrR);
	}

	/**
	 * 在庫振替実績ヘッダ削除
	 */
	protected void delHdr(StkXfrAct_Chk01_HdrR hdrR) {
		_delStkXfrL.add(hdrR.stk_xfr());

		// 受払実績取消リスト作成
		makeTranList_D(hdrR);
	}

	/**
	 * サービス呼出
	 */
	protected void callSvc() {
		callSiUpd();
		callIoBrkr();
		callShipRprtPrnt();
	}

	/**
	 * 受払実績作成サービス呼出
	 */
	protected void callIoBrkr() {
		if (_ioL.isEmpty()) {
			return;
		}
		MSBEL_IoActService.IoAct_Ins01 ioIns = MSBEL_IoActService.crtIoAct_Ins01();
		ioIns.up0().addAll(_ioL);
		ioIns.exec();

		MSBEL_IoActService.IoAct_Upd01 ioUpd = MSBEL_IoActService.crtIoAct_Upd01();
		ioUpd.exec();

	}

	/**
	 * 出荷帳票発行サービス呼出
	 */
	protected void callShipRprtPrnt() {
		if (_srpHdrL.isEmpty()) {
			return;
		}
		MSBEL_ShipRprtPrntService.ShipRprt_Upd01 srp = MSBEL_ShipRprtPrntService
				.crtShipRprt_Upd01();
		srp.up0().addAll(_srpHdrL);
		srp.up1().addAll(_srpDtlL);
		srp.exec();
	}

	/**
	 * 諸口品登録サービス呼出
	 */
	protected void callSiUpd() {
		if (_suL.isEmpty()) {
			return;
		}
		MABCL_SundryItmRegService.SundryItm_Upd01 siUpd = MABCL_SundryItmRegService
				.crtSundryItm_Upd01();
		siUpd.up0().addAll(_suL);
		siUpd.exec();
	}

	/**
	 * 在庫振替実績ＮＯの設定
	 * @param row
	 */
	protected void setHdrNum(StkXfrAct_Chk01_HdrR row) {
		ElmArgsR elm = ElmArgsR.create();
		elm.dpt_cd(row.act_dpt_cd());
		elm.co_cd(mcframe.serverCore.sys.MCSys.user.coCD());
		elm.wg_cd(row.wg_cd());
		elm.dt(row.ac_dt());
		elm.trd_cd(row.trd_cd());
		elm.str(isNull(row.trd_rmrks()) ? null 
				: row.trd_rmrks().substring(0, Integer.min(row.trd_rmrks().length(), 20)));
		String stk_xfr_act_no = getNum(MAC_NUM_BIZ_TYP.STKXACT, elm);
		row.stk_xfr_act_no(stk_xfr_act_no);

	}

	/**
	 * 在庫振替実績明細ＮＯ発番
	 */
	protected void setActDNo(StkXfrAct_Chk01_DtlGiR dtlR) {
		dtlR.stk_xfr_act_d_no(getStrSeq(MSC_NUM_SYS_TYP.SXFRACTD));
	}

	/**
	 * 新規登録（明細）
	 */
	protected void doPrcC(StkXfrAct_Chk01_HdrR hdrR, StkXfrAct_Chk01_DtlGiR dtlR) {
		// 在庫振替実績明細更新
		setActDNo(dtlR);
		dtlR.stk_xfr_act_no(hdrR.stk_xfr_act_no());
		_insStkXfrDL.add(dtlR.stk_xfr_d());

		// 諸口品更新リスト作成
		makeSundryItmList(dtlR);

		// 受払実績更新リスト作成
		makeTranList_I(hdrR, dtlR);

		// 出荷帳票発行サービスの明細リスト作成
		makeSrpDtl(hdrR, dtlR);
	}

	/**
	 * 更新（明細）
	 */
	protected void doPrcM(StkXfrAct_Chk01_HdrR hdrR, StkXfrAct_Chk01_DtlGiR dtlR) {
		// 在庫振替実績明細更新
		dtlR.stk_xfr_act_no(hdrR.stk_xfr_act_no());
		_updStkXfrDL.add(dtlR.stk_xfr_d());

		// 諸口品更新リスト作成
		makeSundryItmList(dtlR);

		// 受払実績更新リスト作成
		makeTranList_U(hdrR, dtlR);

		// 出荷帳票発行サービスの明細リスト作成
		makeSrpDtl(hdrR, dtlR);
	}

	/**
	 * 削除（明細）
	 */
	protected void doPrcD(StkXfrAct_Chk01_HdrR hdrR, StkXfrAct_Chk01_DtlGiR dtlR) {
		// 在庫振替実績明細削除
		dtlR.stk_xfr_act_no(hdrR.stk_xfr_act_no());
		_delStkXfrDL.add(dtlR.stk_xfr_d());

		// 受払実績更新リスト作成
		makeTranList_D(hdrR, dtlR);
	}

	/**
	 * 受払実績更新リスト作成（新規用）
	 */
	protected void makeTranList_I(StkXfrAct_Chk01_HdrR hdrR,
			StkXfrAct_Chk01_DtlGiR dtlR) {
		IoAct_Ins01_DtlR ioRow = IoAct_Ins01_DtlR.create();
		copy(ioRow, dtlR, hdrR, createMap_IoAct_Ins01_DtlR_StkXfrAct_Chk01_DtlGiR());
		_ioL.add(ioRow);
	}

	/**
	 * 受払実績更新リスト作成（更新用）
	 */
	protected void makeTranList_U(StkXfrAct_Chk01_HdrR hdrR,
			StkXfrAct_Chk01_DtlGiR dtlR) {
		IoAct_Ins01_DtlR ioRow = IoAct_Ins01_DtlR.create();
		copy(ioRow, dtlR, hdrR, createMap_IoAct_Ins01_DtlR_StkXfrAct_Chk01_DtlGiR());
		_ioL.add(ioRow);
	}

	/**
	 * 受払実績更新リスト作成（削除用）
	 */
	protected void makeTranList_D(StkXfrAct_Chk01_HdrR hdrR,
			StkXfrAct_Chk01_DtlGiR dtlR) {
		IoAct_Ins01_DtlR ioRow = IoAct_Ins01_DtlR.create();
		ioRow.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
		ioRow.can_ac_dt(hdrR.can_ac_dt());
		ioRow.act_no(hdrR.stk_xfr_act_no());
		ioRow.act_d_no(dtlR.stk_xfr_act_d_no());
		ioRow.trn_typ(MSC_TRN_TYP.STK_XFR.value());
		_ioL.add(ioRow);
	}

	/**
	 * 受払実績更新リスト作成（ヘッダ削除用）
	 */
	protected void makeTranList_D(StkXfrAct_Chk01_HdrR hdrR) {
		IoAct_Ins01_DtlR ioRow = IoAct_Ins01_DtlR.create();
		ioRow.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
		ioRow.can_ac_dt(hdrR.can_ac_dt());
		ioRow.act_no(hdrR.stk_xfr_act_no());
		ioRow.trn_typ(MSC_TRN_TYP.STK_XFR.value());
		_ioL.add(ioRow);
	}

	/**
	 * 出荷帳票発行サービスのヘッダリスト作成（新規用）
	 */
	protected void makeSrpHdr_I(StkXfrAct_Chk01_HdrR hdrR) {
		ShipRprt_Upd01_HdrR srpHdrRow = ShipRprt_Upd01_HdrR.create();
		copy(srpHdrRow, hdrR, createMap_ShipRprt_Upd01_HdrR_StkXfrAct_Chk01_HdrR());
		_srpHdrL.add(srpHdrRow);
	}

	/**
	 * 出荷帳票発行サービスのヘッダリスト作成（更新用）
	 */
	protected void makeSrpHdr_U(StkXfrAct_Chk01_HdrR hdrR) {
		ShipRprt_Upd01_HdrR srpHdrRow = ShipRprt_Upd01_HdrR.create();
		copy(srpHdrRow, hdrR, createMap_ShipRprt_Upd01_HdrR_StkXfrAct_Chk01_HdrR());
		_srpHdrL.add(srpHdrRow);
	}

	/**
	 * 出荷帳票発行サービスのヘッダリスト作成（削除用）
	 */
	protected void makeSrpHdr_D(StkXfrAct_Chk01_HdrR hdrR) {
		ShipRprt_Upd01_HdrR srpHdrRow = ShipRprt_Upd01_HdrR.create();
		srpHdrRow.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
		srpHdrRow.can_ac_dt(hdrR.can_ac_dt());
		srpHdrRow.dlv_slip_act_no(hdrR.stk_xfr_act_no());
		srpHdrRow.trn_typ(MSC_TRN_TYP.STK_XFR.value());
		srpHdrRow.dlv_slip_prnt_flg(hdrR.prnt_flg());
		_srpHdrL.add(srpHdrRow);
	}

	/**
	 * 出荷帳票発行サービスの明細リスト作成
	 */
	protected void makeSrpDtl(StkXfrAct_Chk01_HdrR hdrR, StkXfrAct_Chk01_DtlGiR dtlR) {
		ShipRprt_Upd01_DtlR srpDtlRow = ShipRprt_Upd01_DtlR.create();
		copy(srpDtlRow, dtlR, createMap_ShipRprt_Upd01_DtlR_StkXfrAct_Chk01_DtlGiR());
		_srpDtlL.add(srpDtlRow);
	}

	/**
	 * 諸口品更新リスト作成
	 */
	protected void makeSundryItmList(StkXfrAct_Chk01_DtlGiR dtlR) {
		if (!dtlR.sundry_itm_flg()) return;
		if (!MSC_IO_TYP.isGR(dtlR.stk_xfr_d().io_typ())) return;

		SundryItm_Upd01_DtlR suRow = mcframe.serverMABC.MABCL5010.SundryItm_Upd01_DtlR
				.create();
		copy(suRow, dtlR, createMap_SundryItm_Upd01_DtlR_StkXfrAct_Chk01_DtlGiR());
		_suL.add(suRow);
	}

	/**
	 * 下り電文
	 * @param destL
	 * @param srcL
	 */
	protected void retHdr(MCList<StkXfrAct_Chk01_HdrR> destL,
			MCList<StkXfrAct_Chk01_HdrR> srcL) {
		for (StkXfrAct_Chk01_HdrR src : srcL) {
			StkXfrAct_Chk01_HdrR dest = destL.createRow();
			dest.peg_no(src.peg_no());
			dest.hdr_dtl_peg_no(src.hdr_dtl_peg_no());
			dest.stk_xfr_act_no(src.stk_xfr_act_no());
			dest.setAttributes(src);
			destL.add(dest);
		}
	}

	/**
	 * 下り電文（明細）
	 */
	protected void retDtl(MCList<StkXfrAct_Chk01_DtlGiR> destL,
			MCList<StkXfrAct_Chk01_DtlGiR> srcL) {
		for (StkXfrAct_Chk01_DtlGiR src : srcL) {
			StkXfrAct_Chk01_DtlGiR dest = destL.createRow();
			dest.peg_no(src.peg_no());
			dest.hdr_dtl_peg_no(src.hdr_dtl_peg_no());
			dest.stk_xfr_act_no(src.stk_xfr_act_no());
			dest.stk_xfr_act_d_no(src.stk_xfr_act_d_no());
			dest.setAttributes(src);
			dest.lot_no(src.lot_no());
			dest.sublot_no(src.sublot_no());
			destL.add(dest);
		}
	}

	/**
	 * ヘッダ情報に紐付く明細情報の配列を返します。
	 *  紐付け用カラム ： ヘッダ明細紐付
	 * @param hdr　ヘッダ情報
	 * @param dtl 明細情報
	 * @return　ヘッダ情報に紐付く明細情報
	 */
	protected MCList<StkXfrAct_Chk01_DtlGiR> getDtlL(StkXfrAct_Chk01_HdrR hdr,
			MCList<StkXfrAct_Chk01_DtlGiR> dtl) {
		String[] keys = new String[] {
				StkXfrAct_Chk01_DtlGiR.$hdr_dtl_peg_no
		};
		Comparable<?>[] vals = new Comparable[] {
				hdr.hdr_dtl_peg_no()
		};

		return dtl.subList(keys, vals);
	}

	/**
	 * 品目マスタ・検索
	 * @param itm_cd
	 * @return
	 */
	protected MAM_ITM_R srchItm(String itm_cd, String itm_sub1, String itm_sub2,
			String itm_sub3) {
		if (getItmCache() == null) {
			getItmCache().putCache(bindCols,
					createItmR(itm_cd, itm_sub1, itm_sub2, itm_sub3));
		}
		return getItmCache().getEx(itm_cd, itm_sub1, itm_sub2, itm_sub3);
	}

	// チェック処理でキャッシュを初期化するメソッド
	protected void _initItmCache(MCList<StkXfrAct_Chk01_DtlGiR> dtlL) {
		_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(MCQueryApiBuilder.create(MAM_ITM_R.create("T")), dtlL, bindCols);
	}

	/**
	 * DBコンテナキャッシュに渡すための品目マスタコンテナを返す。
	 * <p>
	 */
	protected MAM_ITM_R createItmR(String itm_cd, String itm_sub1, String itm_sub2,
			String itm_sub3) {
		MAM_ITM_R t = MAM_ITM_R.create("T");
		MCQueryApiBuilder itm_bldr = MCQueryApiBuilder.create(t);
		itm_bldr.setSelect(t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3, t.sno1_mng_typ, t.sno2_mng_typ, t.sno3_mng_typ, t.sno4_mng_typ, t.lot_mng_typ, t.sublot_mng_typ, t.asset_mng_typ);
		
		MAM_ITM_R itm = MAM_ITM_R.create();
		itm.itm_cd(itm_cd);
		itm.itm_sub1(itm_sub1);
		itm.itm_sub2(itm_sub2);
		itm.itm_sub3(itm_sub3);
		dbSelectKey("MSBEL6500_MAM_ITM_S02", itm, itm_bldr, itm);
		return itm;
	}

	/**
	 * 納品書のキャッシュ
	 */
	protected MCList<MST_DLV_SLIP_R> _cacheDlvSlipL = null;
	protected MCIndexKey _idxDlvSlipL = null;
	protected void doDlvSlipCache(MCList<?> hdrL) {
		MST_DLV_SLIP_R t = MST_DLV_SLIP_R.create("T");
		_cacheDlvSlipL = MCList.create(MST_DLV_SLIP_R.class);
		MCQueryApiBuilder cacheDlvSlipL_bldr = MCQueryApiBuilder.create(t);
		cacheDlvSlipL_bldr.setSelect(t.dlv_slip_no, t.dlv_slip_act_no);
		cacheDlvSlipL_bldr.setWhere(t.dlv_slip_act_no.eq(bind("stk_xfr_act_no")));
		cacheDlvSlipL_bldr.addWhereWithAnd(t.trn_typ.eq(value(MSC_TRN_TYP.STK_XFR.value())));
		cacheDlvSlipL_bldr.addWhereWithAnd(t.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
		dbSelect("MSBEL6500_MST_DLV_SLIP_S01", _cacheDlvSlipL, cacheDlvSlipL_bldr, hdrL);
		_idxDlvSlipL = _cacheDlvSlipL.createIndex(MST_DLV_SLIP_R.$dlv_slip_act_no);
	}
	protected MST_DLV_SLIP_R getDlvSlipR(String stk_xfr_act_no) {
		MST_DLV_SLIP_R ret = _cacheDlvSlipL.getFirst(_idxDlvSlipL, stk_xfr_act_no);
		if (ret == null) {
			return MST_DLV_SLIP_R.create();
		}
		else {
			return ret;
		}
	}

	//　mapper
	protected Map_Lot_Chk02_CndR_StkXfrAct_Chk01_DtlGiR<Lot_Chk02_CndR, StkXfrAct_Chk01_DtlGiR> createMap_Lot_Chk02_CndR_StkXfrAct_Chk01_DtlGiR() {
		return new Map_Lot_Chk02_CndR_StkXfrAct_Chk01_DtlGiR<Lot_Chk02_CndR, StkXfrAct_Chk01_DtlGiR>();
	}

	public class Map_Lot_Chk02_CndR_StkXfrAct_Chk01_DtlGiR<D extends Lot_Chk02_CndR, S extends StkXfrAct_Chk01_DtlGiR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Lot_Chk02_CndR.$peg_no, StkXfrAct_Chk01_DtlGiR.$peg_no);
			addColumnPathMap(Lot_Chk02_CndR.$itm_cd, StkXfrAct_Chk01_DtlGiR.$itm_cd);
			addColumnPathMap(Lot_Chk02_CndR.$itm_sub1, StkXfrAct_Chk01_DtlGiR.$itm_sub1);
			addColumnPathMap(Lot_Chk02_CndR.$itm_sub2, StkXfrAct_Chk01_DtlGiR.$itm_sub2);
			addColumnPathMap(Lot_Chk02_CndR.$itm_sub3, StkXfrAct_Chk01_DtlGiR.$itm_sub3);
			addColumnPathMap(Lot_Chk02_CndR.$lot_no, StkXfrAct_Chk01_DtlGiR.$lot_no);
			addColumnPathMap(Lot_Chk02_CndR.$sublot_no,
					StkXfrAct_Chk01_DtlGiR.$sublot_no);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			MAM_ITM_R itm = srchItm(src.itm_cd(), src.itm_sub1(), src.itm_sub2(),
					src.itm_sub3());
			dest.lot_mng_typ(itm.lot_mng_typ());
			dest.sublot_mng_typ(itm.sublot_mng_typ());

		}
	}

	protected Map_Lot_Chk03_CndR_StkXfrAct_Chk01_DtlGiR<Lot_Chk03_CndR, StkXfrAct_Chk01_DtlGiR> createMap_Lot_Chk03_CndR_StkXfrAct_Chk01_DtlGiR() {
		return new Map_Lot_Chk03_CndR_StkXfrAct_Chk01_DtlGiR<Lot_Chk03_CndR, StkXfrAct_Chk01_DtlGiR>();
	}

	public class Map_Lot_Chk03_CndR_StkXfrAct_Chk01_DtlGiR<D extends Lot_Chk03_CndR, S extends StkXfrAct_Chk01_DtlGiR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Lot_Chk03_CndR.$peg_no, StkXfrAct_Chk01_DtlGiR.$peg_no);
			addColumnPathMap(Lot_Chk03_CndR.$itm_cd, StkXfrAct_Chk01_DtlGiR.$itm_cd);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub1, StkXfrAct_Chk01_DtlGiR.$itm_sub1);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub2, StkXfrAct_Chk01_DtlGiR.$itm_sub2);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub3, StkXfrAct_Chk01_DtlGiR.$itm_sub3);
			addColumnPathMap(Lot_Chk03_CndR.$lot_no, StkXfrAct_Chk01_DtlGiR.$lot_no);
			addColumnPathMap(Lot_Chk03_CndR.$sublot_no,
					StkXfrAct_Chk01_DtlGiR.$sublot_no);
		}
	}

	protected Map_SundryItm_Chk01_DtlR_StkXfrAct_Chk01_DtlGiR<SundryItm_Chk01_DtlR, StkXfrAct_Chk01_DtlGiR> createMap_SundryItm_Chk01_DtlR_StkXfrAct_Chk01_DtlGiR() {
		return new Map_SundryItm_Chk01_DtlR_StkXfrAct_Chk01_DtlGiR<SundryItm_Chk01_DtlR, StkXfrAct_Chk01_DtlGiR>();
	}

	public class Map_SundryItm_Chk01_DtlR_StkXfrAct_Chk01_DtlGiR<D extends SundryItm_Chk01_DtlR, S extends StkXfrAct_Chk01_DtlGiR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SundryItm_Chk01_DtlR.$peg_no,
					StkXfrAct_Chk01_DtlGiR.$peg_no);
			addColumnPathMap(SundryItm_Chk01_DtlR.$data_crud_typ,
					StkXfrAct_Chk01_DtlGiR.$data_crud_typ);
			addColumnPathMap(SundryItm_Chk01_DtlR.$itm_cd,
					StkXfrAct_Chk01_DtlGiR.$itm_cd);
			addColumnPathMap(SundryItm_Chk01_DtlR.$itm_sub1,
					StkXfrAct_Chk01_DtlGiR.$itm_sub1);
			addColumnPathMap(SundryItm_Chk01_DtlR.$itm_sub2,
					StkXfrAct_Chk01_DtlGiR.$itm_sub2);
			addColumnPathMap(SundryItm_Chk01_DtlR.$itm_sub3,
					StkXfrAct_Chk01_DtlGiR.$itm_sub3);
			addColumnPathMap(SundryItm_Chk01_DtlR.$sno1, StkXfrAct_Chk01_DtlGiR.$sno1);
			addColumnPathMap(SundryItm_Chk01_DtlR.$sno2, StkXfrAct_Chk01_DtlGiR.$sno2);
			addColumnPathMap(SundryItm_Chk01_DtlR.$sno3, StkXfrAct_Chk01_DtlGiR.$sno3);
			addColumnPathMap(SundryItm_Chk01_DtlR.$sno4, StkXfrAct_Chk01_DtlGiR.$sno4);
			addColumnPathMap(SundryItm_Chk01_DtlR.$itm_nm,
					StkXfrAct_Chk01_DtlGiR.$itm_nm);
			addColumnPathMap(SundryItm_Chk01_DtlR.$err_flg,
					StkXfrAct_Chk01_DtlGiR.$err_flg);
		}
	}

	protected Map_Cl_Chk03_CndR_StkXfrAct_Chk01_DtlGiR<Cl_Chk03_CndR, StkXfrAct_Chk01_DtlGiR, StkXfrAct_Chk01_HdrR> createMap_Cl_Chk03_CndR_StkXfrAct_Chk01_DtlGiR() {
		return new Map_Cl_Chk03_CndR_StkXfrAct_Chk01_DtlGiR<Cl_Chk03_CndR, StkXfrAct_Chk01_DtlGiR, StkXfrAct_Chk01_HdrR>();
	}

	public class Map_Cl_Chk03_CndR_StkXfrAct_Chk01_DtlGiR<D extends Cl_Chk03_CndR, S extends StkXfrAct_Chk01_DtlGiR, W extends StkXfrAct_Chk01_HdrR>
			extends FXUCC_RowMapperWith<D, S, W> {
		protected W _stkXfrAct_Chk01_HdrR;

		@Override
		public void setWith(W _stkXfrAct_Chk01_HdrR) {
			this._stkXfrAct_Chk01_HdrR = _stkXfrAct_Chk01_HdrR;
		}

		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Cl_Chk03_CndR.$peg_no, StkXfrAct_Chk01_DtlGiR.$peg_no);
			addColumnPathMap(Cl_Chk03_CndR.$itm_cd, StkXfrAct_Chk01_DtlGiR.$itm_cd);
			addColumnPathMap(Cl_Chk03_CndR.$itm_sub1, StkXfrAct_Chk01_DtlGiR.$itm_sub1);
			addColumnPathMap(Cl_Chk03_CndR.$itm_sub2, StkXfrAct_Chk01_DtlGiR.$itm_sub2);
			addColumnPathMap(Cl_Chk03_CndR.$itm_sub3, StkXfrAct_Chk01_DtlGiR.$itm_sub3);
			addColumnPathMap(Cl_Chk03_CndR.$old_itm_cd, StkXfrAct_Chk01_DtlGiR.$itm_cd);
			addColumnPathMap(Cl_Chk03_CndR.$old_itm_sub1, StkXfrAct_Chk01_DtlGiR.$itm_sub1);
			addColumnPathMap(Cl_Chk03_CndR.$old_itm_sub2, StkXfrAct_Chk01_DtlGiR.$itm_sub2);
			addColumnPathMap(Cl_Chk03_CndR.$old_itm_sub3, StkXfrAct_Chk01_DtlGiR.$itm_sub3);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			if (MAC_DATA_CRUD_TYP.isCRT(_stkXfrAct_Chk01_HdrR.data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD(_stkXfrAct_Chk01_HdrR.data_crud_typ())) {
				dest.ac_dt(_stkXfrAct_Chk01_HdrR.ac_dt());
				dest.loc_cd(_stkXfrAct_Chk01_HdrR.loc_cd());
			}
			if (MAC_DATA_CRUD_TYP.isDEL(_stkXfrAct_Chk01_HdrR.data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD(_stkXfrAct_Chk01_HdrR.data_crud_typ())) {
				dest.can_ac_dt(_stkXfrAct_Chk01_HdrR.can_ac_dt());
				dest.old_loc_cd(_stkXfrAct_Chk01_HdrR.loc_cd());
			}
			dest.sls_cls_chk_flg(false);
			dest.rcv_cls_chk_flg(false);
			dest.purc_cls_chk_flg(false);
			dest.pay_cls_chk_flg(false);
			dest.stk_cls_chk_flg(true);
			dest.io_lmt_skip_flg(false);
			dest.bp_cd(null);
		}
	}

	protected Map_IoAct_Ins01_DtlR_StkXfrAct_Chk01_DtlGiR<IoAct_Ins01_DtlR, StkXfrAct_Chk01_DtlGiR, StkXfrAct_Chk01_HdrR> createMap_IoAct_Ins01_DtlR_StkXfrAct_Chk01_DtlGiR() {
		return new Map_IoAct_Ins01_DtlR_StkXfrAct_Chk01_DtlGiR<IoAct_Ins01_DtlR, StkXfrAct_Chk01_DtlGiR, StkXfrAct_Chk01_HdrR>();
	}

	public class Map_IoAct_Ins01_DtlR_StkXfrAct_Chk01_DtlGiR<D extends IoAct_Ins01_DtlR, S extends StkXfrAct_Chk01_DtlGiR, W extends StkXfrAct_Chk01_HdrR>
			extends FXUCC_RowMapperWith<D, S, W> {
		protected W _stkXfrAct_Chk01_HdrR;

		@Override
		public void setWith(W _stkXfrAct_Chk01_HdrR) {
			this._stkXfrAct_Chk01_HdrR = _stkXfrAct_Chk01_HdrR;
		}

		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(IoAct_Ins01_DtlR.$data_crud_typ,
					StkXfrAct_Chk01_DtlGiR.$data_crud_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$act_d_no,
					StkXfrAct_Chk01_DtlGiR.$stk_xfr_act_d_no);
			addColumnPathMap(IoAct_Ins01_DtlR.$itm_cd, StkXfrAct_Chk01_DtlGiR.$itm_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$itm_sub1,
					StkXfrAct_Chk01_DtlGiR.$itm_sub1);
			addColumnPathMap(IoAct_Ins01_DtlR.$itm_sub2,
					StkXfrAct_Chk01_DtlGiR.$itm_sub2);
			addColumnPathMap(IoAct_Ins01_DtlR.$itm_sub3,
					StkXfrAct_Chk01_DtlGiR.$itm_sub3);
			addColumnPathMap(IoAct_Ins01_DtlR.$itm_nm, StkXfrAct_Chk01_DtlGiR.$itm_nm);
			addColumnPathMap(IoAct_Ins01_DtlR.$sundry_itm_flg,
					StkXfrAct_Chk01_DtlGiR.$sundry_itm_flg);
			addColumnPathMap(IoAct_Ins01_DtlR.$stk_mng_typ,
					StkXfrAct_Chk01_DtlGiR.$stk_mng_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$gi_str_ln_cd,
					StkXfrAct_Chk01_DtlGiR.$str_ln_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$gr_str_ln_cd,
					StkXfrAct_Chk01_DtlGiR.$str_ln_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$stk_arrv_bp_cd,
					StkXfrAct_Chk01_DtlGiR.$stk_arrv_bp_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$lot_no, StkXfrAct_Chk01_DtlGiR.$lot_no);
			addColumnPathMap(IoAct_Ins01_DtlR.$sublot_no,
					StkXfrAct_Chk01_DtlGiR.$sublot_no);
			addColumnPathMap(IoAct_Ins01_DtlR.$sno1_mng_typ,
					StkXfrAct_Chk01_DtlGiR.$sno1_mng_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$sno2_mng_typ,
					StkXfrAct_Chk01_DtlGiR.$sno2_mng_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$sno3_mng_typ,
					StkXfrAct_Chk01_DtlGiR.$sno3_mng_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$sno4_mng_typ,
					StkXfrAct_Chk01_DtlGiR.$sno4_mng_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$sno1, StkXfrAct_Chk01_DtlGiR.$sno1);
			addColumnPathMap(IoAct_Ins01_DtlR.$sno2, StkXfrAct_Chk01_DtlGiR.$sno2);
			addColumnPathMap(IoAct_Ins01_DtlR.$sno3, StkXfrAct_Chk01_DtlGiR.$sno3);
			addColumnPathMap(IoAct_Ins01_DtlR.$sno4, StkXfrAct_Chk01_DtlGiR.$sno4);
			addColumnPathMap(IoAct_Ins01_DtlR.$fix_no_typ,
					StkXfrAct_Chk01_DtlGiR.$fix_no_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$fix_no, StkXfrAct_Chk01_DtlGiR.$fix_no);
			addColumnPathMap(IoAct_Ins01_DtlR.$gi_gd_cd, StkXfrAct_Chk01_DtlGiR.$gd_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$gr_gd_cd, StkXfrAct_Chk01_DtlGiR.$gd_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$quality_typ,
					StkXfrAct_Chk01_DtlGiR.$quality_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$stk_id_typ,
					StkXfrAct_Chk01_DtlGiR.$stk_id_typ);
			addColumnPathMap(IoAct_Ins01_DtlR.$stk_bp_cd,
					StkXfrAct_Chk01_DtlGiR.$stk_bp_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$trd_unit_qty,
					StkXfrAct_Chk01_DtlGiR.$trd_unit_qty);
			addColumnPathMap(IoAct_Ins01_DtlR.$trd_unit_cd,
					StkXfrAct_Chk01_DtlGiR.$trd_unit_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$pack_unit_qty,
					StkXfrAct_Chk01_DtlGiR.$pack_unit_qty);
			addColumnPathMap(IoAct_Ins01_DtlR.$pack_unit_cd,
					StkXfrAct_Chk01_DtlGiR.$pack_unit_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$base_unit_qty,
					StkXfrAct_Chk01_DtlGiR.$base_unit_qty);
			addColumnPathMap(IoAct_Ins01_DtlR.$base_unit_cd,
					StkXfrAct_Chk01_DtlGiR.$base_unit_cd);
			addColumnPathMap(IoAct_Ins01_DtlR.$trd_d_rmrks,
					StkXfrAct_Chk01_DtlGiR.$trd_d_rmrks);
			addColumnPathMap(IoAct_Ins01_DtlR.$io_typ, StkXfrAct_Chk01_DtlGiR.$io_typ);

		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.ac_dt(_stkXfrAct_Chk01_HdrR.ac_dt());
			dest.can_ac_dt(_stkXfrAct_Chk01_HdrR.can_ac_dt());
			dest.act_tm(_stkXfrAct_Chk01_HdrR.stk_xfr_act_tm());
			dest.act_no(_stkXfrAct_Chk01_HdrR.stk_xfr_act_no());
			dest.trd_cd(_stkXfrAct_Chk01_HdrR.trd_cd());
			dest.trd_ptn_typ(_stkXfrAct_Chk01_HdrR.trd_ptn_typ());
			dest.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
			dest.trn_typ(MSC_TRN_TYP.STK_XFR.value());
			dest.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
			dest.rsn_cd(_stkXfrAct_Chk01_HdrR.stk_xfr_rsn_cd());
			if (!MAC_STR.isNULL_VAL(src.stk_arrv_bp_cd())) {
				if (isNull(_stkXfrAct_Chk01_HdrR.sppl_cd())) {
					dest.dlv_cd(src.stk_arrv_bp_cd());
				}
				else {
					dest.sppl_cd(src.stk_arrv_bp_cd());
				}
			}

			if (MSC_IO_TYP.isGI(src.stk_xfr_d().io_typ())) {
				dest.gi_wg_cd(_stkXfrAct_Chk01_HdrR.wg_cd());
				dest.gi_loc_cd(_stkXfrAct_Chk01_HdrR.loc_cd());
			}
			else if (MSC_IO_TYP.isGR(src.stk_xfr_d().io_typ())) {
				dest.gr_wg_cd(_stkXfrAct_Chk01_HdrR.wg_cd());
				dest.gr_loc_cd(_stkXfrAct_Chk01_HdrR.loc_cd());
			}
			dest.act_usr_cd(_stkXfrAct_Chk01_HdrR.act_usr_cd());
			dest.act_dpt_cd(_stkXfrAct_Chk01_HdrR.act_dpt_cd());
			dest.trd_rmrks(_stkXfrAct_Chk01_HdrR.trd_rmrks());
		}
	}

	protected Map_SundryItm_Upd01_DtlR_StkXfrAct_Chk01_DtlGiR<SundryItm_Upd01_DtlR, StkXfrAct_Chk01_DtlGiR> createMap_SundryItm_Upd01_DtlR_StkXfrAct_Chk01_DtlGiR() {
		return new Map_SundryItm_Upd01_DtlR_StkXfrAct_Chk01_DtlGiR<SundryItm_Upd01_DtlR, StkXfrAct_Chk01_DtlGiR>();
	}

	public class Map_SundryItm_Upd01_DtlR_StkXfrAct_Chk01_DtlGiR<D extends SundryItm_Upd01_DtlR, S extends StkXfrAct_Chk01_DtlGiR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SundryItm_Upd01_DtlR.$itm_cd,
					StkXfrAct_Chk01_DtlGiR.$itm_cd);
			addColumnPathMap(SundryItm_Upd01_DtlR.$itm_sub1,
					StkXfrAct_Chk01_DtlGiR.$itm_sub1);
			addColumnPathMap(SundryItm_Upd01_DtlR.$itm_sub2,
					StkXfrAct_Chk01_DtlGiR.$itm_sub2);
			addColumnPathMap(SundryItm_Upd01_DtlR.$itm_sub3,
					StkXfrAct_Chk01_DtlGiR.$itm_sub3);
			addColumnPathMap(SundryItm_Upd01_DtlR.$sno1, StkXfrAct_Chk01_DtlGiR.$sno1);
			addColumnPathMap(SundryItm_Upd01_DtlR.$sno2, StkXfrAct_Chk01_DtlGiR.$sno2);
			addColumnPathMap(SundryItm_Upd01_DtlR.$sno3, StkXfrAct_Chk01_DtlGiR.$sno3);
			addColumnPathMap(SundryItm_Upd01_DtlR.$sno4, StkXfrAct_Chk01_DtlGiR.$sno4);
			addColumnPathMap(SundryItm_Upd01_DtlR.$itm_nm,
					StkXfrAct_Chk01_DtlGiR.$itm_nm);

		}
	}

	protected Map_ShipRprt_Upd01_HdrR_StkXfrAct_Chk01_HdrR<ShipRprt_Upd01_HdrR, StkXfrAct_Chk01_HdrR> createMap_ShipRprt_Upd01_HdrR_StkXfrAct_Chk01_HdrR() {
		return new Map_ShipRprt_Upd01_HdrR_StkXfrAct_Chk01_HdrR<ShipRprt_Upd01_HdrR, StkXfrAct_Chk01_HdrR>();
	}

	public class Map_ShipRprt_Upd01_HdrR_StkXfrAct_Chk01_HdrR<D extends ShipRprt_Upd01_HdrR, S extends StkXfrAct_Chk01_HdrR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipRprt_Upd01_HdrR.$hdr_peg_no,
					StkXfrAct_Chk01_HdrR.$hdr_dtl_peg_no);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$data_crud_typ, StkXfrAct_Chk01_HdrR.$data_crud_typ);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$ac_dt, StkXfrAct_Chk01_HdrR.$ac_dt);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$can_ac_dt,
					StkXfrAct_Chk01_HdrR.$can_ac_dt);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_slip_act_no,
					StkXfrAct_Chk01_HdrR.$stk_xfr_act_no);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dpt_cd,
					StkXfrAct_Chk01_HdrR.$act_dpt_cd);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$usr_cd,
					StkXfrAct_Chk01_HdrR.$act_usr_cd);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$ship_tm,
					StkXfrAct_Chk01_HdrR.$stk_xfr_act_tm);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$trd_cd, StkXfrAct_Chk01_HdrR.$trd_cd);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$trd_ptn_typ,
					StkXfrAct_Chk01_HdrR.$trd_ptn_typ);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$xfr_loc_cd,
					StkXfrAct_Chk01_HdrR.$loc_cd);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$wg_cd, StkXfrAct_Chk01_HdrR.$wg_cd);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$trd_rmrks,
					StkXfrAct_Chk01_HdrR.$trd_rmrks);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$dlv_slip_prnt_flg,
					StkXfrAct_Chk01_HdrR.$prnt_flg);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$sub_char1,
					StkXfrAct_Chk01_HdrR.$sub_char1);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$sub_char2,
					StkXfrAct_Chk01_HdrR.$sub_char2);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$sub_char3,
					StkXfrAct_Chk01_HdrR.$sub_char3);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.trn_typ(MSC_TRN_TYP.STK_XFR.value());
			dest.pri_prnt_flg(false);
			dest.split_flg(false);
			dest.adjst_slip_flg(false);
			dest.dlv_slip_prnt_flg(src.prnt_flg());
		}
	}

	protected Map_ShipRprt_Upd01_DtlR_StkXfrAct_Chk01_DtlGiR<ShipRprt_Upd01_DtlR, StkXfrAct_Chk01_DtlGiR> createMap_ShipRprt_Upd01_DtlR_StkXfrAct_Chk01_DtlGiR() {
		return new Map_ShipRprt_Upd01_DtlR_StkXfrAct_Chk01_DtlGiR<ShipRprt_Upd01_DtlR, StkXfrAct_Chk01_DtlGiR>();
	}

	public class Map_ShipRprt_Upd01_DtlR_StkXfrAct_Chk01_DtlGiR<D extends ShipRprt_Upd01_DtlR, S extends StkXfrAct_Chk01_DtlGiR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipRprt_Upd01_DtlR.$hdr_peg_no,
					StkXfrAct_Chk01_DtlGiR.$hdr_dtl_peg_no);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$dtl_uniq_no,
					StkXfrAct_Chk01_DtlGiR.$stk_xfr_act_d_no);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$dlv_slip_no, StkXfrAct_Chk01_DtlGiR.$dlv_slip_no);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_cd, StkXfrAct_Chk01_DtlGiR.$itm_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_sub1,
					StkXfrAct_Chk01_DtlGiR.$itm_sub1);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_sub2,
					StkXfrAct_Chk01_DtlGiR.$itm_sub2);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_sub3,
					StkXfrAct_Chk01_DtlGiR.$itm_sub3);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_nm, StkXfrAct_Chk01_DtlGiR.$itm_nm);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sundry_itm_flg,
					StkXfrAct_Chk01_DtlGiR.$sundry_itm_flg);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sno1, StkXfrAct_Chk01_DtlGiR.$sno1);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sno2, StkXfrAct_Chk01_DtlGiR.$sno2);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sno3, StkXfrAct_Chk01_DtlGiR.$sno3);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sno4, StkXfrAct_Chk01_DtlGiR.$sno4);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$lot_no, StkXfrAct_Chk01_DtlGiR.$lot_no);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sublot_no,
					StkXfrAct_Chk01_DtlGiR.$sublot_no);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$str_ln_cd,
					StkXfrAct_Chk01_DtlGiR.$str_ln_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$stk_arrv_bp_cd,
					StkXfrAct_Chk01_DtlGiR.$stk_arrv_bp_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$gd_cd, StkXfrAct_Chk01_DtlGiR.$gd_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$quality_typ,
					StkXfrAct_Chk01_DtlGiR.$quality_typ);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$stk_insp_typ,
					StkXfrAct_Chk01_DtlGiR.$stk_insp_typ);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$stk_id_typ,
					StkXfrAct_Chk01_DtlGiR.$stk_id_typ);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$stk_bp_cd,
					StkXfrAct_Chk01_DtlGiR.$stk_bp_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$fix_no_typ,
					StkXfrAct_Chk01_DtlGiR.$fix_no_typ);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$fix_no, StkXfrAct_Chk01_DtlGiR.$fix_no);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$trd_unit_qty,
					StkXfrAct_Chk01_DtlGiR.$trd_unit_qty);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$trd_unit_cd,
					StkXfrAct_Chk01_DtlGiR.$trd_unit_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$base_unit_qty,
					StkXfrAct_Chk01_DtlGiR.$base_unit_qty);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$base_unit_cd,
					StkXfrAct_Chk01_DtlGiR.$base_unit_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$trd_d_rmrks,
					StkXfrAct_Chk01_DtlGiR.$trd_d_rmrks);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$io_typ, StkXfrAct_Chk01_DtlGiR.$io_typ);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sub_char1,
					StkXfrAct_Chk01_DtlGiR.$sub_char1);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sub_char2,
					StkXfrAct_Chk01_DtlGiR.$sub_char2);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sub_char3,
					StkXfrAct_Chk01_DtlGiR.$sub_char3);
		}
	}

	//FMCB CUSTOM END
}