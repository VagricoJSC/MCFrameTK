package mcframe.serverMSBE.MSBEL6400;

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
import mcframe.serverMAUC.MAUCL5020.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL6400.*; // このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import static mcframe.serverMSUC.MSUCL0070.MSUCL_StkUtil.*;

import mcframe.serverMABC.MABCL5010.*;
import mcframe.serverMSBD.MSBDL5190.*;
import mcframe.serverMSBE.MSBEL5010.*;
import mcframe.serverMSBE.MSBEL5020.*;
import mcframe.serverMSBF.MSBFL5210.*;
import mcframe.serverMSBI.MSBIL5010.*;
import mcframe.serverMSBE.MSBEL5550.*;
import java.util.HashMap;
import java.util.List;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_AcXfrActRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_AcXfrActRegService_MC extends MSBEL_AcXfrActRegService_MC_A{
	//FMCB CUSTOM START
///// キャッシュ関連
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
		cacheDlvSlipL_bldr.setWhere(t.dlv_slip_act_no.eq(bind("acxfr_act_no")));
		cacheDlvSlipL_bldr.addWhereWithAnd(t.trn_typ.eq(value(MSC_TRN_TYP.ACXFR.value())));
		dbSelect("MSBEL6400_MST_DLV_SLIP_S01", _cacheDlvSlipL, cacheDlvSlipL_bldr, hdrL);
		_idxDlvSlipL = _cacheDlvSlipL.createIndex(MST_DLV_SLIP_R.$dlv_slip_act_no);
	}
	protected MST_DLV_SLIP_R getDlvSlipR(String acxfr_act_no) {
		MST_DLV_SLIP_R ret = _cacheDlvSlipL.getFirst(_idxDlvSlipL, acxfr_act_no);
		if (ret == null) {
			return MST_DLV_SLIP_R.create();
		}
		else {
			return ret;
		}
	}

	protected FXUCL_MCDbcCache<MAM_LOC_R> _locCache = null;
	protected void doLocCache(MCList<?> dtlL) {
		_locCache = new FXUCL_MCDbcCache<MAM_LOC_R>(MCQueryApiBuilder.create(MAM_LOC_R.create("T")), dtlL, MAM_LOC_R.$loc_cd);
	}

	protected static final Class<MSBEL_AcXfrActRegService> CLAZZ = MSBEL_AcXfrActRegService.class;

	protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _itmUnitCache = null;
	protected static void initItmUnitCache(MCList<? extends MCRow> bindL) {
		object(CLAZZ)._initItmUnitCache(bindL);
	}
	protected void _initItmUnitCache(MCList<? extends MCRow> bindL) {
		MAVM_ITM_UNIT_R t = MAVM_ITM_UNIT_R.create("T");
		MCQueryApiBuilder itmUnitL_bldr = MCQueryApiBuilder.create(t);
		itmUnitL_bldr.setSelect(t.conv_base_qty, t.conv_qty, t.dec_place, t.rnd_typ, t.pack_flg);
		_itmUnitCache = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(itmUnitL_bldr, bindL, "itm_cd",
				"itm_sub1", "itm_sub2", "itm_sub3", "trd_unit_cd");
	}
	protected static FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> getItmUnitCache() {
		if (object(CLAZZ)._itmUnitCache == null) {
			initItmUnitCache(MCList.create(MCRow.class));
		}
		return object(CLAZZ)._itmUnitCache;
	}

	protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache = null;
	protected void _initItmCache(MCList<?> dtlL) {
		_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(MCQueryApiBuilder.create(MAM_ITM_R.create("T")), dtlL,
				MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
	}
	protected static void initItmCache(MCList<?> dtlL) {
		object(CLAZZ)._initItmCache(dtlL);
	}
	protected static FXUCL_MCDbcCache<MAM_ITM_R> getItmCache() {
		if (object(CLAZZ)._itmCache == null) {
			initItmCache(MCList.create(MCRow.class));
		}
		return object(CLAZZ)._itmCache;
	}
	protected static MAM_ITM_R getItm(String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3) {
		return getItmCache().get(itm_cd, itm_sub1, itm_sub2, itm_sub3);
	}

	protected String _acxfrActNo = null;

	protected int _dtlSize = 0;

	protected HashMap<MCNumber, String> _acxfrActNoMap = new HashMap<MCNumber, String>();

	protected HashMap<MCNumber, MCNumber> _acxfrActNoRevMap = new HashMap<MCNumber, MCNumber>();

	protected HashMap<String, String> _insIoActHdrMap = new HashMap<String, String>();

	protected HashMap<String, String> _insIoActDtlMap = new HashMap<String, String>();

	protected HashMap<String, String> _insIoSchdMap = new HashMap<String, String>();

	// 諸口品更新対象データ
	protected MCList<SundryItm_Upd01_DtlR> _sundryItmL = MCList
			.create(SundryItm_Upd01_DtlR.class);

	// 登録対象明細、訂正対象明細、削除対象明細、取消対象明細のレコードを一時的に格納する
	MCList<MST_ACXFR_ACT_D_R> _createActDL = MCList.create(MST_ACXFR_ACT_D_R.class);

	MCList<MST_ACXFR_ACT_D_R> _modifyActDL = MCList.create(MST_ACXFR_ACT_D_R.class);

	MCList<MST_ACXFR_ACT_D_R> _deleteActDL = MCList.create(MST_ACXFR_ACT_D_R.class);

	MCList<MST_ACXFR_ACT_D_R> _cancelActDL = MCList.create(MST_ACXFR_ACT_D_R.class);

	// 登録、訂正、取消後に取得した明細レコードを格納する
	MCList<MST_ACXFR_ACT_D_R> _afterModifyActDL = MCList.create(MST_ACXFR_ACT_D_R.class);

	MST_ACXFR_ACT_R _actR = MST_ACXFR_ACT_R.create();

	MCList<MST_ACXFR_ACT_D_R> _actDL = MCList.create(MST_ACXFR_ACT_D_R.class);

	MST_ACXFR_INST_R _instR = MST_ACXFR_INST_R.create();

	MCList<MST_ACXFR_INST_D_R> _instDL = MCList.create(MST_ACXFR_INST_D_R.class);

	MCList<MST_ACXFR_SCHD_R> _schdL = MCList.create(MST_ACXFR_SCHD_R.class);

	MCList<AcXfrAct_Chk01_DtlR> _vmiL = MCList.create(AcXfrAct_Chk01_DtlR.class);

	/**
	 * AcXfrAct_Chk01オペレーション.
	 * <p>
	 *
	 * 他勘定振替実績を登録する前に、チェックを実行します。<br>
	 */
	public class AcXfrAct_Chk01 extends MSBEL_AcXfrActRegService_MC_A.AcXfrAct_Chk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			MCMessageList msgL = new MCMessageList();

			prepare(up0(), up1());
			msgL.addAll(chk());

			MCMessagePool.addAll(msgL);
			setErrFlg(msgL);
			setErrToRtnStsTyp();

			setDown();
		}

		/**
		 * チェック
		 */
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();
			MCList<AcXfrAct_Chk01_HdrR> noErrL = getChkList(up0());

			for (AcXfrAct_Chk01_HdrR hdrR : noErrL) {
				MCList<AcXfrAct_Chk01_DtlR> dtlL = up1()
						.subList(AcXfrAct_Chk01_HdrR.$hdr_dtl_peg, hdrR.hdr_dtl_peg());

				msgL.addAll(checkAprvSts(dtlL));
				msgL.addAll(checkSub(hdrR, dtlL));

				callClChk03(hdrR, dtlL); // 締日チェック
				callSundryItmChk01(hdrR, dtlL); // 諸口品チェック
				callLotServiceChkItm(dtlL); // ロットサービスチェック（品目）
				callLotServiceChkBdItm(dtlL); // ロットサービスチェック（負担品目）
				callVmiChk01InsUpd(hdrR, dtlL); // VMI計上前チェック
			}
			return msgL;
		}

		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
		}
	}

	/**
	 * AcXfrAct_Chk02オペレーション.
	 * <p>
	 *
	 * 他勘定振替実績を訂正する前に、チェックを実行します。<br>
	 */
	public class AcXfrAct_Chk02 extends MSBEL_AcXfrActRegService_MC_A.AcXfrAct_Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			MCMessageList msgL = new MCMessageList();

			prepare(up0(), up1());
			msgL.addAll(chk());

			MCMessagePool.addAll(msgL);
			setErrFlg(msgL);
			setErrToRtnStsTyp();

			setDown();
		}

		/**
		 * チェック
		 */
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();
			MCList<AcXfrAct_Chk01_HdrR> noErrL = getChkList(up0());

			for (AcXfrAct_Chk01_HdrR hdrR : noErrL) {
				MCList<AcXfrAct_Chk01_DtlR> dtlL = up1()
						.subList(AcXfrAct_Chk01_HdrR.$hdr_dtl_peg, hdrR.hdr_dtl_peg());

				msgL.addAll(checkAprvSts(dtlL));
				msgL.addAll(checkSub(hdrR, dtlL));

				msgL.addAll(checkMamItmChk02(dtlL)); // 品目マスタの存在チェック

				callClChk03(hdrR, dtlL); // 締日チェック
				callSundryItmChk01(hdrR, dtlL); // 諸口品チェック
				callLotServiceChkItm(dtlL); // ロットサービスチェック（品目）
				callLotServiceChkBdItm(dtlL); // ロットサービスチェック（負担品目）
				callVmiChk01InsUpd(hdrR, dtlL); // VMI計上前チェック
			}
			return msgL;
		}

		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
		}

		/**
		 * 品目マスタの存在チェック<p>
		 * 行削除、かつ他勘定振替指図ありのレコードに対して、品目マスタの存在チェックをする
		 * @param dtlL 明細行リスト
		 * @return msgL エラーメッセージを格納したリスト
		 */
		protected MCMessageList checkMamItmChk02(MCList<AcXfrAct_Chk01_DtlR> dtlL) {
			MCMessageList msgL = new MCMessageList();

			for (AcXfrAct_Chk01_DtlR dtlR : dtlL) {
				MAM_ITM_R itmR = getItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3());
				if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ()) && !isNull(dtlR.acxfr_inst_d_no()) && itmR.isEmpty()) {
					msgL.add(new MCMessage(dtlR, null, MAUAL0277
							, toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3())
							, toDispGUIIndex(dtlR)));
				}
			}
			return msgL;
		}
	}

	/**
	 * AcXfrAct_Chk03オペレーション.<p>
	 *
	 * 他勘定振替実績を取消する前に、チェックを実行します。<br>
	 */
	public class AcXfrAct_Chk03 extends MSBEL_AcXfrActRegService_MC_A.AcXfrAct_Chk03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			MCMessageList msgL = new MCMessageList();

			prepareDel(up0(), up1());
			msgL.addAll(chk());

			MCMessagePool.addAll(msgL);
			setErrFlg(msgL);
			setErrToRtnStsTyp();

			setDown();
		}

		/**
		 * チェック
		 */
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();
			MCList<AcXfrAct_Chk03_HdrR> noErrL = getChkList(up0());

			for (AcXfrAct_Chk03_HdrR hdrR : noErrL) {
				MCList<AcXfrAct_Chk03_DtlR> dtlL = up1()
						.subList(AcXfrAct_Chk01_HdrR.$hdr_dtl_peg, hdrR.hdr_dtl_peg());

				msgL.addAll(checkMamItmChk03(dtlL)); // 品目マスタの存在チェック

				callClChk03(hdrR, dtlL); // 締日チェック
				callVmiChk01Del(hdrR, dtlL); // VMI計上前チェック
			}
			return msgL;
		}

		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
		}

		/**
		 * 品目マスタの存在チェック<p>
		 * 他勘定振替指図ありのレコードに対して、品目マスタの存在チェックをする
		 * @param dtlL 明細行リスト
		 * @return msgL エラーメッセージを格納したリスト
		 */
		protected MCMessageList checkMamItmChk03(MCList<AcXfrAct_Chk03_DtlR> dtlL) {
			MCMessageList msgL = new MCMessageList();

			for (AcXfrAct_Chk03_DtlR dtlR : dtlL) {
				MAM_ITM_R itmR = getItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3());
				if (!isNull(dtlR.acxfr_inst_d_no()) && itmR.isEmpty()) {
					msgL.add(new MCMessage(dtlR, null, MAUAL0277
							, toDispItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3())
							, toDispGUIIndex(dtlR)));
				}
			}
			return msgL;
		}
	}

	/**
	 * 承認状況をチェックする。
	 * @param dtlL
	 */
	protected MCMessageList checkAprvSts(MCList<AcXfrAct_Chk01_DtlR> dtlL) {
		MCMessageList msgL = new MCMessageList();

		for (AcXfrAct_Chk01_DtlR dtlR : dtlL) {
			if (isNull(dtlR.acxfr_schd_no())) {
				continue;
			}

			if (!MAC_APRV_STS_TYP.isACPT(dtlR.aprv_sts_typ())) {
				msgL.add(new MCMessage(dtlR, AcXfrAct_Chk01_DtlR.$acxfr_schd_no,
						MSBEL0059, dtlR.acxfr_schd_no()));
			}
		}

		return msgL;
	}

	protected MCMessageList checkSub(AcXfrAct_Chk01_HdrR hdrR, MCList<AcXfrAct_Chk01_DtlR> dtlL) {
		MCMessageList msgL = new MCMessageList();

		for (AcXfrAct_Chk01_DtlR r : dtlL) {
			if (MAC_TRD_PTN_TYP.isSTK_OTH_GR(hdrR.trd_ptn_typ())) {
				// 組み合わせチェック
				if (!chkStkPtn(r)) {
					msgL.add(new MCMessage(r, null, MSBEL0309, toDispGUIIndex(r)));
					r.err_flg(true);
				}

				// ロット入力不可チェック
				MAM_ITM_R itmR = getItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				if (itmR.not_new_lot_flg() && r.crt_lot_flg()) {
					msgL.add(new MCMessage(r, null, MSBEL0311, toDispGUIIndex(r)));
				}
			}
			// 承認済みの他勘定予定に対しては数量増加はできない
			if (MAC_APRV_STS_TYP.isACPT(r.aprv_sts_typ())) {
				if (r.base_unit_qty().gt(r.schd_base_unit_qty())) {
					msgL.add(new MCMessage(r, AcXfrAct_Chk01_DtlR.$trd_unit_qty, MSBEL0310, toDispGUIIndex(r)));
					r.err_flg(true);
				}
			}
		}
		return msgL;
	}

	/**
	 * 登録・訂正に呼び出す締日チェックＳＶ
	 * @param hdrR
	 * @param dtlL
	 */
	protected void callClChk03(AcXfrAct_Chk01_HdrR hdrR,
			MCList<AcXfrAct_Chk01_DtlR> dtlL) {
		MSBIL_ClService.Cl_Chk03 ope = MSBIL_ClService.crtCl_Chk03();

		for (AcXfrAct_Chk01_DtlR dtlR : dtlL) {
			Cl_Chk03_CndR cndR = Cl_Chk03_CndR.create();

			cndR.peg_no(dtlR.peg_no());
			cndR.ac_dt(hdrR.ac_dt());
			cndR.stk_cls_chk_flg(true);
			cndR.loc_cd(hdrR.loc_cd());
			cndR.itm_cd(dtlR.itm_cd());
			cndR.itm_sub1(dtlR.itm_sub1());
			cndR.itm_sub2(dtlR.itm_sub2());
			cndR.itm_sub3(dtlR.itm_sub3());
			cndR.can_ac_dt(hdrR.can_ac_dt());
			cndR.old_loc_cd(hdrR.loc_cd());
			cndR.old_itm_cd(dtlR.itm_cd());
			cndR.old_itm_sub1(dtlR.itm_sub1());
			cndR.old_itm_sub2(dtlR.itm_sub2());
			cndR.old_itm_sub3(dtlR.itm_sub3());
			
			cndR.setAttributes(dtlR);

			ope.up0().add(cndR);
		}

		ope.exec();

		copyErrFlg(dtlL, ope.down0());
	}

	/**
	 * 取消時に呼び出す締日チェックＳＶ
	 * @param hdrR
	 * @param dtlL
	 */
	protected void callClChk03(AcXfrAct_Chk03_HdrR hdrR,
			MCList<AcXfrAct_Chk03_DtlR> dtlL) {
		MSBIL_ClService.Cl_Chk03 ope = MSBIL_ClService.crtCl_Chk03();

		for (AcXfrAct_Chk03_DtlR dtlR : dtlL) {
			Cl_Chk03_CndR cndR = Cl_Chk03_CndR.create();

			cndR.peg_no(dtlR.peg_no());
			cndR.can_ac_dt(hdrR.can_ac_dt());
			cndR.stk_cls_chk_flg(true);
			cndR.old_loc_cd(hdrR.loc_cd());
			cndR.old_itm_cd(dtlR.itm_cd());
			cndR.old_itm_sub1(dtlR.itm_sub1());
			cndR.old_itm_sub2(dtlR.itm_sub2());
			cndR.old_itm_sub3(dtlR.itm_sub3());

			cndR.setAttributes(dtlR);

			ope.up0().add(cndR);
		}

		ope.exec();

		copyErrFlg(dtlL, ope.down0());
	}

	protected void callSundryItmChk01(MCList<AcXfrAct_Chk01_DtlR> dtlL) {
		MCList<AcXfrAct_Chk01_DtlR> tgtL = dtlL
				.subList(AcXfrAct_Chk01_DtlR.$sundry_itm_flg, true);

		if (tgtL.isEmpty()) {
			return;
		}

		MABCL_SundryItmRegService.SundryItm_Chk01 ope = MABCL_SundryItmRegService
				.crtSundryItm_Chk01();

		addAll(ope.up0(), tgtL, createMap_SundryItm_Chk01_DtlR_AcXfrAct_Chk01_DtlR());
		ope.exec();

		copyErrFlg(tgtL, ope.down0());
	}
	protected void callSundryItmChk01(AcXfrAct_Chk01_HdrR hdrR, MCList<AcXfrAct_Chk01_DtlR> dtlL) {
		MCList<SundryItm_Chk01_DtlR> siL = MCList.create(SundryItm_Chk01_DtlR.class);

		for (AcXfrAct_Chk01_DtlR r : dtlL) {
			if (MAC_TRD_PTN_TYP.isSTK_OTH_GR(hdrR.trd_ptn_typ())) {
				// 諸口品の場合、品名が諸口品マスタと矛盾しないこと（削除以外）
				if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) && r.sundry_itm_flg()) {
					SundryItm_Chk01_DtlR siR = SundryItm_Chk01_DtlR.create();
					copy(siR, r, createMap_SundryItm_Chk01_DtlR_AcXfrAct_Chk01_DtlR());
					siL.add(siR);
				}
			}
		}
		// 諸口品チェック
		if (!siL.isEmpty()) {
			MABCL_SundryItmRegService.SundryItm_Chk01 o = MABCL_SundryItmRegService.crtSundryItm_Chk01();
			o.up0().setAll(siL);
			o.exec();
			copyErrFlg(dtlL, o.down0());
		}

	}

	protected void callLotServiceChkItm(MCList<AcXfrAct_Chk01_DtlR> dtlL) {
		callLotServiceChk02(dtlL);
		callLotServiceChk03(dtlL);
	}

	protected void callLotServiceChk02(MCList<AcXfrAct_Chk01_DtlR> dtlL) {
		MCList<AcXfrAct_Chk01_DtlR> tgtL = dtlL.subList(AcXfrAct_Chk01_DtlR.$crt_lot_flg,
				true);

		if (tgtL.isEmpty()) {
			return;
		}

		MSBFL_LotService.Lot_Chk02 ope = MSBFL_LotService.crtLot_Chk02();

		addAll(ope.up0(), tgtL, createMap_Lot_Chk02_CndR_AcXfrAct_Chk01_DtlR());
		ope.exec();

		copyErrFlg(tgtL, ope.down0());
	}

	protected void callLotServiceChk03(MCList<AcXfrAct_Chk01_DtlR> dtlL) {
		MCList<AcXfrAct_Chk01_DtlR> tgtL = dtlL.subList(AcXfrAct_Chk01_DtlR.$crt_lot_flg,
				false);

		if (tgtL.isEmpty()) {
			return;
		}

		MSBFL_LotService.Lot_Chk03 ope = MSBFL_LotService.crtLot_Chk03();

		addAll(ope.up0(), tgtL, createMap_Lot_Chk03_CndR_AcXfrAct_Chk01_DtlR());
		ope.exec();

		copyErrFlg(tgtL, ope.down0());
	}

	protected void callLotServiceChkBdItm(MCList<AcXfrAct_Chk01_DtlR> dtlL) {
		MCList<AcXfrAct_Chk01_DtlR> tgtL = dtlL.subList(r -> !isNull(r.bd_lot_no()) && !isNull(r.bd_itm_cd()));

		if (tgtL.isEmpty()) {
			return;
		}

		MSBFL_LotService.Lot_Chk03 ope = MSBFL_LotService.crtLot_Chk03();

		addAll(ope.up0(), tgtL, createMap_Lot_Chk03_CndR_AcXfrAct_Chk01_DtlR_Bd());
		ope.exec();

		copyErrFlg(tgtL, ope.down0());
	}

	protected void callVmiChk01InsUpd(AcXfrAct_Chk01_HdrR hdrR,
			MCList<AcXfrAct_Chk01_DtlR> dtlL) {
		if (MAC_TRD_PTN_TYP.isSCRP(hdrR.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isSTK_OTH_GR(hdrR.trd_ptn_typ())) {
			return;
		}
		MCList<AcXfrAct_Chk01_DtlR> tgtL = dtlL
				.subList(r -> MSC_STK_ID_TYP.isRNT_RCV(r.stk_id_typ()));

		if (tgtL.isEmpty()) {
			return;
		}

		MSBDL_VmiService.Vmi_Chk01 ope = MSBDL_VmiService.crtVmi_Chk01();

		addAll(ope.up0(), tgtL, createMap_Vmi_Chk01_DtlR_AcXfrAct_Chk01_DtlR());
		vmiUpCustom(hdrR, ope.up0());

		ope.exec();

		String[] destCols = new String[] {
				AcXfrAct_Chk01_DtlR.$vmi_interim_flg, AcXfrAct_Chk01_DtlR.$vmi_upri
		};
		String[] srcCols = new String[] {
				Vmi_Chk01_DtlR.$interim_flg, Vmi_Chk01_DtlR.$trd_cur_upri
		};
		copyByPegNo(tgtL, destCols, ope.down0(), srcCols);
		copyErrFlg(tgtL, ope.down0());
	}

	protected void callVmiChk01Del(AcXfrAct_Chk03_HdrR hdrR, MCList<AcXfrAct_Chk03_DtlR> dtlL) {
		if (MAC_TRD_PTN_TYP.isSCRP(hdrR.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isSTK_OTH_GR(hdrR.trd_ptn_typ())) {
			return;
		}
		MCList<AcXfrAct_Chk03_DtlR> tgtL = dtlL
				.subList(r -> MSC_STK_ID_TYP.isRNT_RCV(r.stk_id_typ()));

		if (tgtL.isEmpty()) {
			return;
		}

		MSBDL_VmiService.Vmi_Chk01 ope = MSBDL_VmiService.crtVmi_Chk01();

		addAll(ope.up0(), tgtL, createMap_Vmi_Chk01_DtlR_AcXfrAct_Chk03_DtlR());
		vmiUpCustom(hdrR, ope.up0());
		ope.exec();

		copyErrFlg(tgtL, ope.down0());
	}

	/**
	 * AcXfrAct_Ins01オペレーション.
	 * <p>
	 *
	 * 他勘定振替実績を新規登録する。<br>
	 */
	public class AcXfrAct_Ins01 extends MSBEL_AcXfrActRegService_MC_A.AcXfrAct_Ins01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			prepare(up0(), up1());
			execOpe();
			preCallRevDataIns01();
			setDown();
		}

		protected void execOpe() {
			for (AcXfrAct_Chk01_HdrR hdrR : up0()) {
				MCList<AcXfrAct_Chk01_DtlR> dtlL = up1()
						.subList(AcXfrAct_Chk01_DtlR.$hdr_dtl_peg, hdrR.hdr_dtl_peg());

				clearList();
				beforeExec(hdrR, dtlL);
				execIns(hdrR, dtlL);
				afterExec(hdrR, dtlL);
			}
		}

		/**
		 * 他勘定振替実績更新前処理
		 */
		protected void beforeExec(AcXfrAct_Chk01_HdrR hdrR, MCList<AcXfrAct_Chk01_DtlR> dtlL) {
			// 更新前のトランザクション取得
			getTransactionData(hdrR, dtlL);
		}

		protected void getTransactionData(AcXfrAct_Chk01_HdrR hdrR,
				MCList<AcXfrAct_Chk01_DtlR> dtlL) {
			getInstHdr(hdrR.acxfr_inst_no());
			getInstDtl(dtlL);
			getSchd(dtlL);
		}

		protected void execIns(AcXfrAct_Chk01_HdrR hdrR,
				MCList<AcXfrAct_Chk01_DtlR> dtlL) {
			insActHdr(hdrR);

			setAcXfrActNoMap(hdrR);

			// 新規登録 (明細)
			for (AcXfrAct_Chk01_DtlR dtlR : dtlL) {
				dtlCreate(hdrR, dtlR);
			}

			dbInsertEx("MSBEL6400_MST_ACXFR_ACT_D_I01", _createActDL, MCQueryApiBuilder.create(MST_ACXFR_ACT_D_R.create("T")));
		}

		/**
		 * 他勘定振替実績更新後処理
		 */
		protected void afterExec(AcXfrAct_Chk01_HdrR hdrR, MCList<AcXfrAct_Chk01_DtlR> dtlL) {
			// 更新後の実績トランザクション取得
			getActDtlAfterModify(dtlL);

			// 指図更新
			updInst(dtlL);

			// 予定更新
			updSchd(dtlL);

			// サービス呼び出し
			callService(hdrR, dtlL);
		}

		protected void callService(AcXfrAct_Chk01_HdrR hdrR,
				MCList<AcXfrAct_Chk01_DtlR> dtlL) {
			callIoSchdServiceDel01(hdrR, dtlL);
			callIoSchdServiceIns01(hdrR, dtlL);
			callVmiUpd01(hdrR);
			callIoActIns01(hdrR, dtlL);
			callIoActUpd01();
			callSundryItmUpd01(hdrR, dtlL);
			callShipRprtPrntSrv(hdrR, dtlL);
		}

		protected void callIoActIns01(AcXfrAct_Chk01_HdrR hdrR,
				MCList<AcXfrAct_Chk01_DtlR> dtlL) {
			MSBEL_IoActService.IoAct_Ins01 ope = MSBEL_IoActService.crtIoAct_Ins01();

			_insIoActHdrMap.clear();
			_insIoActDtlMap.clear();
			setIoActAcXfrActHdrInsMap(hdrR);
			setIoActAcXfrActDtlInsMap(hdrR);

			for (AcXfrAct_Chk01_DtlR dtlR : dtlL) {
				IoAct_Ins01_DtlR actR = IoAct_Ins01_DtlR.create();

				actR.setValues(_insIoActHdrMap, hdrR);
				actR.setValues(_insIoActDtlMap, dtlR);

				chkNullVall(actR);
				actR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				actR.trn_typ(MSC_TRN_TYP.ACXFR.value());

				if (!MAC_TRD_PTN_TYP.isSCRP(hdrR.trd_ptn_typ()) && !MAC_TRD_PTN_TYP.isSTK_OTH_GR(hdrR.trd_ptn_typ()) && MSC_STK_ID_TYP.isRNT_RCV(dtlR.stk_id_typ())) {
					actR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
					actR.stk_bp_cd(MAC_STR.NULL_VAL.value());
				}

				MAM_ITM_R itmR = getItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3());
				actR.sno1_mng_typ(itmR.sno1_mng_typ());
				actR.sno2_mng_typ(itmR.sno2_mng_typ());
				actR.sno3_mng_typ(itmR.sno3_mng_typ());
				actR.sno4_mng_typ(itmR.sno4_mng_typ());

				ope.up0().add(actR);
			}

			ope.exec();
		}

		/**
		 * 出荷帳票発行サービスを呼び出し、納品伝票を新規登録する。
		 */
		protected void callShipRprtPrntSrv(AcXfrAct_Chk01_HdrR hdrR,
				MCList<AcXfrAct_Chk01_DtlR> dtlL) {
			MSBEL_ShipRprtPrntService.ShipRprt_Upd01 o = MSBEL_ShipRprtPrntService
					.crtShipRprt_Upd01();

			ShipRprt_Upd01_HdrR prtHdrR = ShipRprt_Upd01_HdrR.create();
			copy(prtHdrR, hdrR, createMap_ShipRprt_Upd01_HdrR_AcXfrAct_Chk01_HdrR());
			prtHdrR.hdr_peg_no(1);
			prtHdrR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());

			o.up0().add(prtHdrR);

			addAll(o.up1(), dtlL, createMap_ShipRprt_Upd01_DtlR_AcXfrAct_Chk01_DtlR());
			o.up1().setValue(ShipRprt_Upd01_DtlR.$hdr_peg_no, prtHdrR.hdr_peg_no());

			o.exec();
		}

		protected void setDown() {
			for (AcXfrAct_Chk01_HdrR hdrR : up0()) {
				rtrnHdr(hdrR, down0());
				rtrnDtl(up1(), down1());
			}
		}
		
		protected void preCallRevDataIns01() {
			MCList<MST_ACXFR_ACT_R> wkL = MCList.create(MST_ACXFR_ACT_R.class);
			for (AcXfrAct_Chk01_HdrR r : up0()) {
				MST_ACXFR_ACT_R wkR = MST_ACXFR_ACT_R.create();
				wkR.acxfr_act_no(r.acxfr_act_no());
				wkL.add(wkR);
			}
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_ACXFR_ACT_R.create("T"));
			dbWkDelete("MSBEL6400_MSW_ACXFR_ACT_D01", wkL_bldr.getBaseDbc());
			MCQueryApiBuilder wkL2_bldr = MCQueryApiBuilder.create(MST_ACXFR_ACT_R.create("T"));
			MCList<MST_ACXFR_ACT_R> wkL2 = wkL.groupBy(wkL2_bldr.getBaseDbc().getKeyColumn());
			dbWkInsert("MSBEL6400_MSW_ACXFR_ACT_I01", wkL2, wkL2_bldr.getBaseDbc());
			
			MCList<MST_ACXFR_ACT_R> hdrL = MCList.create(MST_ACXFR_ACT_R.class);
			MST_ACXFR_ACT_R t2 = MST_ACXFR_ACT_R.create("T2");
			MSW_ACXFR_ACT_KEY_R w = MSW_ACXFR_ACT_KEY_R.create("W");
			MCQueryApiBuilder hdrL_bldr = MCQueryApiBuilder.create(t2);
			hdrL_bldr.setSelect(t2.acxfr_act_no, t2.acxfr_act_rev);
			hdrL_bldr.addInnerJoin(w, bracket( t2.acxfr_act_no.eq(w.acxfr_act_no)));
			dbSelect("MSBEL6400_MST_ACXFR_ACT_S01", hdrL, hdrL_bldr);
			
			callRevDataIns01(hdrL);
		}

	}

	/**
	 * AcXfrAct_Upd01オペレーション.
	 * <p>
	 *
	 * 登録済みの他勘定振替実績を更新する。<br>
	 */
	public class AcXfrAct_Upd01 extends MSBEL_AcXfrActRegService_MC_A.AcXfrAct_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			prepare(up0(), up1());
			execOpe();
			preCallRevDataIns01();
			setDown();
		}

		protected void execOpe() {
			for (AcXfrAct_Chk01_HdrR hdrR : up0()) {
				MCList<AcXfrAct_Chk01_DtlR> dtlL = up1()
						.subList(AcXfrAct_Chk01_DtlR.$acxfr_act_no, hdrR.acxfr_act_no());

				clearList();
				beforeExec(hdrR, dtlL);
				execInsUpdDel(hdrR, dtlL);
				afterExec(hdrR, dtlL);
			}
		}

		/**
		 * 他勘定振替実績更新前処理
		 */
		protected void beforeExec(AcXfrAct_Chk01_HdrR hdrR, MCList<AcXfrAct_Chk01_DtlR> dtlL) {
			// 更新前のトランザクション取得
			getTransactionData(hdrR, dtlL);
		}

		protected void getTransactionData(AcXfrAct_Chk01_HdrR hdrR,
				MCList<AcXfrAct_Chk01_DtlR> dtlL) {
			getActHdr(hdrR.acxfr_act_no());
			getActDtl(hdrR.acxfr_act_no());
			getInstHdr(hdrR.acxfr_inst_no());
			getInstDtl(dtlL);
			getSchd(dtlL);
		}

		protected void execInsUpdDel(AcXfrAct_Chk01_HdrR hdrR,
				MCList<AcXfrAct_Chk01_DtlR> dtlL) {
			updActHdr(hdrR);

			setAcXfrActNoMap(hdrR);

			for (AcXfrAct_Chk01_DtlR dtlR : dtlL) {
				// 新規
				if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
					dtlCreate(hdrR, dtlR);
				}
				// 更新
				else if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
					dtlModify(hdrR, dtlR);
				}
				// 削除
				else if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
					dtlDelete(hdrR, dtlR);
				}
			}

			MCQueryApiBuilder modifyActDL_bldr = MCQueryApiBuilder.create(MST_ACXFR_ACT_D_R.create("T"));
			MST_ACXFR_ACT_D_R t3 = MST_ACXFR_ACT_D_R.create("T3");
			MCQueryApiBuilder deleteActDL_bldr = MCQueryApiBuilder.create(t3);
			dbInsertEx("MSBEL6400_MST_ACXFR_ACT_D_I02", _createActDL, MCQueryApiBuilder.create(MST_ACXFR_ACT_D_R.create("T")));
			modifyActDL_bldr.removeSet(MST_ACXFR_ACT_D_R.$wms_flg, MST_ACXFR_ACT_D_R.$ext_sys_cd, MST_ACXFR_ACT_D_R.$ext_acxfr_act_no);
			dbUpdateKey("MSBEL6400_MST_ACXFR_ACT_D_U01", _modifyActDL, modifyActDL_bldr);
			deleteActDL_bldr.setSet(t3.can_flg);
			dbUpdateKey("MSBEL6400_MST_ACXFR_ACT_D_U02", _deleteActDL, deleteActDL_bldr);
		}

		/**
		 * 他勘定振替実績更新後処理
		 */
		protected void afterExec(AcXfrAct_Chk01_HdrR hdrR, MCList<AcXfrAct_Chk01_DtlR> dtlL) {
			// 更新後の実績トランザクション取得
			getActDtlAfterModify(dtlL);

			// 指図更新
			updInst(dtlL);

			// 予定更新
			updSchd(dtlL);

			// サービス呼び出し
			callService(hdrR, dtlL);
		}

		protected void callService(AcXfrAct_Chk01_HdrR hdrR,
				MCList<AcXfrAct_Chk01_DtlR> dtlL) {
			callIoSchdServiceDel01(hdrR, dtlL);
			callIoSchdServiceIns01(hdrR, dtlL);
			callVmiUpd01(hdrR);
			callIoActIns01(hdrR, dtlL);
			callIoActUpd01();
			callSundryItmUpd01(hdrR, dtlL);
			callShipRprtPrntSrv(hdrR, dtlL);
		}

		protected void callIoActIns01(AcXfrAct_Chk01_HdrR hdrR,
				MCList<AcXfrAct_Chk01_DtlR> dtlL) {
			MSBEL_IoActService.IoAct_Ins01 ope = MSBEL_IoActService.crtIoAct_Ins01();

			_insIoActHdrMap.clear();
			_insIoActDtlMap.clear();

			setIoActAcXfrActHdrUpdMap(hdrR);

			for (AcXfrAct_Chk01_DtlR dtlR : dtlL
					.subList(AcXfrAct_Chk01_DtlR.$hdr_dtl_peg, hdrR.hdr_dtl_peg())) {
				IoAct_Ins01_DtlR actR = IoAct_Ins01_DtlR.create();

				if (MAC_DATA_CRUD_TYP.isCRT(dtlR.data_crud_typ())) {
					setIoActAcXfrActDtlInsMap(hdrR);
					actR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(dtlR.data_crud_typ())) {
					setIoActAcXfrActDtlUpdMap(hdrR);
					actR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
					setIoActAcXfrActDtlDelMap();
					actR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}

				actR.setValues(_insIoActHdrMap, hdrR);
				actR.setValues(_insIoActDtlMap, dtlR);

				chkNullVall(actR);
				actR.trn_typ(MSC_TRN_TYP.ACXFR.value());

				if (!MAC_TRD_PTN_TYP.isSCRP(hdrR.trd_ptn_typ()) && !MAC_TRD_PTN_TYP.isSTK_OTH_GR(hdrR.trd_ptn_typ()) && MSC_STK_ID_TYP.isRNT_RCV(dtlR.stk_id_typ())) {
					actR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
					actR.stk_bp_cd(MAC_STR.NULL_VAL.value());
				}

				MAM_ITM_R itmR = getItm(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3());
				actR.sno1_mng_typ(itmR.sno1_mng_typ());
				actR.sno2_mng_typ(itmR.sno2_mng_typ());
				actR.sno3_mng_typ(itmR.sno3_mng_typ());
				actR.sno4_mng_typ(itmR.sno4_mng_typ());

				ope.up0().add(actR);
			}

			ope.exec();
		}

		/**
		 * 出荷帳票発行サービスを呼び出し、納品伝票を更新する。
		 */
		protected void callShipRprtPrntSrv(AcXfrAct_Chk01_HdrR hdrR,
				MCList<AcXfrAct_Chk01_DtlR> dtlL) {
			// 行削除された行は納品伝票の対象外
			MCList<AcXfrAct_Chk01_DtlR> tgtL = dtlL.subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));

			MSBEL_ShipRprtPrntService.ShipRprt_Upd01 o = MSBEL_ShipRprtPrntService
					.crtShipRprt_Upd01();

			ShipRprt_Upd01_HdrR prtHdrR = ShipRprt_Upd01_HdrR.create();
			copy(prtHdrR, hdrR, createMap_ShipRprt_Upd01_HdrR_AcXfrAct_Chk01_HdrR());
			prtHdrR.hdr_peg_no(1);
			prtHdrR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());

			o.up0().add(prtHdrR);

			addAll(o.up1(), tgtL, createMap_ShipRprt_Upd01_DtlR_AcXfrAct_Chk01_DtlR());
			o.up1().setValue(ShipRprt_Upd01_DtlR.$hdr_peg_no, prtHdrR.hdr_peg_no());

			o.exec();
		}

		protected void setDown() {
			for (AcXfrAct_Chk01_HdrR hdrR : up0()) {
				rtrnHdr(hdrR, down0());
				rtrnDtl(up1(), down1());
			}
		}
		
		protected void preCallRevDataIns01() {
			MCList<MST_ACXFR_ACT_R> wkL = MCList.create(MST_ACXFR_ACT_R.class);

			for (AcXfrAct_Chk01_HdrR r : up0()) {
				MST_ACXFR_ACT_R wkR = MST_ACXFR_ACT_R.create();
				wkR.acxfr_act_no(r.acxfr_act_no());
				wkL.add(wkR);
			}
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_ACXFR_ACT_R.create("T"));
			dbWkDelete("MSBEL6400_MSW_ACXFR_ACT_D02", wkL_bldr.getBaseDbc());
			MCQueryApiBuilder wkL2_bldr = MCQueryApiBuilder.create(MST_ACXFR_ACT_R.create("T"));
			MCList<MST_ACXFR_ACT_R> wkL2 = wkL.groupBy(wkL2_bldr.getBaseDbc().getKeyColumn());
			dbWkInsert("MSBEL6400_MSW_ACXFR_ACT_I02", wkL2, wkL2_bldr.getBaseDbc());
			
			MCList<MST_ACXFR_ACT_R> hdrL = MCList.create(MST_ACXFR_ACT_R.class);
			MST_ACXFR_ACT_R t2 = MST_ACXFR_ACT_R.create("T2");
			MSW_ACXFR_ACT_KEY_R w = MSW_ACXFR_ACT_KEY_R.create("W");
			MCQueryApiBuilder hdrL_bldr = MCQueryApiBuilder.create(t2);
			hdrL_bldr.setSelect(t2.acxfr_act_no, t2.acxfr_act_rev);
			hdrL_bldr.addInnerJoin(w, bracket( t2.acxfr_act_no.eq(w.acxfr_act_no)));
			dbSelect("MSBEL6400_MST_ACXFR_ACT_S02", hdrL, hdrL_bldr);
			
			callRevDataIns01(hdrL);
		}
	}

	/**
	 * AcXfrAct_Del01オペレーション.<p>
	 *
	 * 登録済みの他勘定振替実績を取消する。<br>
	 */
	public class AcXfrAct_Del01 extends MSBEL_AcXfrActRegService_MC_A.AcXfrAct_Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			prepareDel(up0(), up1());
			execOpe();
			preCallRevDataIns01();
			setDown();
		}

		protected void execOpe() {
			for (AcXfrAct_Chk03_HdrR hdrR : up0()) {
				MCList<AcXfrAct_Chk03_DtlR> dtlL = up1()
						.subList(AcXfrAct_Chk03_DtlR.$acxfr_act_no, hdrR.acxfr_act_no());

				clearList();
				beforeExec(hdrR, dtlL);
				execCancel(hdrR, dtlL);
				afterExec(hdrR, dtlL);
			}
		}

		/**
		 * 他勘定振替実績更新前処理
		 */
		protected void beforeExec(AcXfrAct_Chk03_HdrR hdrR, MCList<AcXfrAct_Chk03_DtlR> dtlL) {
			// 更新前のトランザクション取得
			getTransactionData(hdrR, dtlL);
		}

		protected void getTransactionData(AcXfrAct_Chk03_HdrR hdrR,
				MCList<AcXfrAct_Chk03_DtlR> dtlL) {
			getActHdr(hdrR.acxfr_act_no());
			getActDtl(hdrR.acxfr_act_no());
			getInstHdr(hdrR.acxfr_inst_no());
			getInstDtl(dtlL);
			getSchd(dtlL);
		}

		protected void execCancel(AcXfrAct_Chk03_HdrR hdrR,
				MCList<AcXfrAct_Chk03_DtlR> dtlL) {
			cancelActHdr(hdrR);

			// 取消（明細）
			for (AcXfrAct_Chk03_DtlR dtlR : dtlL) {
				dtlCancel(dtlR);
			}

			MST_ACXFR_ACT_D_R t = MST_ACXFR_ACT_D_R.create("T");
			MCQueryApiBuilder cancelActDL_bldr = MCQueryApiBuilder.create(t);
			cancelActDL_bldr.setSet(t.can_flg);
			dbUpdateKey("MSBEL6400_MST_ACXFR_ACT_D_U03", _cancelActDL, cancelActDL_bldr);
		}

		/**
		 * 他勘定振替実績更新後処理
		 */
		protected void afterExec(AcXfrAct_Chk03_HdrR hdrR, MCList<AcXfrAct_Chk03_DtlR> dtlL) {
			// 更新後の実績トランザクション取得
			getActDtlAfterModify(dtlL);

			// 指図更新
			updInst(dtlL);

			// 予定更新
			updSchd(dtlL);

			// サービス呼び出し
			callService(hdrR, dtlL);
		}

		protected void callService(AcXfrAct_Chk03_HdrR hdrR,
				MCList<AcXfrAct_Chk03_DtlR> dtlL) {
			callIoSchdServiceDel01(hdrR, dtlL);
			callIoSchdServiceIns01(hdrR, dtlL);
			callVmiDel01(hdrR, dtlL);
			callIoActIns01(hdrR);
			callIoActUpd01();
			callShipRprtPrntSrvDel(hdrR);
		}

		protected void callVmiDel01(AcXfrAct_Chk03_HdrR hdrR, MCList<AcXfrAct_Chk03_DtlR> dtlL) {
			if (MAC_TRD_PTN_TYP.isSCRP(hdrR.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isSTK_OTH_GR(hdrR.trd_ptn_typ())) {
				return;
			}
			MCList<AcXfrAct_Chk03_DtlR> tgtL = dtlL
					.subList(r -> MSC_STK_ID_TYP.isRNT_RCV(r.stk_id_typ()));

			if (tgtL.isEmpty()) {
				return;
			}

			MSBDL_VmiService.Vmi_Upd01 ope = MSBDL_VmiService.crtVmi_Upd01();

			addAll(ope.up0(), tgtL, createMap_Vmi_Chk01_DtlR_AcXfrAct_Chk03_DtlR());
			vmiUpCustom(hdrR, ope.up0());
			ope.exec();
		}

		protected void callIoActIns01(AcXfrAct_Chk03_HdrR hdrR) {
			MSBEL_IoActService.IoAct_Ins01 ope = MSBEL_IoActService.crtIoAct_Ins01();

				IoAct_Ins01_DtlR actR = IoAct_Ins01_DtlR.create();

				_insIoActHdrMap.clear();
				setIoActAcXfrActDelMap();

				actR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				actR.trn_typ(MSC_TRN_TYP.ACXFR.value());
				actR.setValues(_insIoActHdrMap, hdrR);

				ope.up0().add(actR);

			ope.exec();
		}

		/**
		 * 出荷帳票発行サービスを呼び出し、納品伝票を取り消す。
		 */
		protected void callShipRprtPrntSrvDel(AcXfrAct_Chk03_HdrR hdrR) {
			MSBEL_ShipRprtPrntService.ShipRprt_Upd01 o = MSBEL_ShipRprtPrntService
					.crtShipRprt_Upd01();

			ShipRprt_Upd01_HdrR prtHdrR = ShipRprt_Upd01_HdrR.create();
			prtHdrR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			prtHdrR.can_ac_dt(hdrR.can_ac_dt());
			prtHdrR.trn_typ(MSC_TRN_TYP.ACXFR.value());
			prtHdrR.dlv_slip_no(hdrR.dlv_slip_no());
			prtHdrR.dlv_slip_act_no(hdrR.acxfr_act_no());
			prtHdrR.dlv_slip_prnt_flg(hdrR.prnt_flg());

			o.up0().add(prtHdrR);
			o.exec();
		}

		protected void setDown() {
			// なにもなし
		}
		
		protected void preCallRevDataIns01() {
			MCList<MST_ACXFR_ACT_R> wkL = MCList.create(MST_ACXFR_ACT_R.class);
			for (AcXfrAct_Chk03_HdrR r : up0()) {
				MST_ACXFR_ACT_R wkR = MST_ACXFR_ACT_R.create();
				wkR.acxfr_act_no(r.acxfr_act_no());
				wkL.add(wkR);
			}
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_ACXFR_ACT_R.create("T"));
			dbWkDelete("MSBEL6400_MSW_ACXFR_ACT_D03", wkL_bldr.getBaseDbc());
			MCQueryApiBuilder wkL2_bldr = MCQueryApiBuilder.create(MST_ACXFR_ACT_R.create("T"));
			MCList<MST_ACXFR_ACT_R> wkL2 = wkL.groupBy(wkL2_bldr.getBaseDbc().getKeyColumn());
			dbWkInsert("MSBEL6400_MSW_ACXFR_ACT_I03", wkL2, wkL2_bldr.getBaseDbc());
			
			MCList<MST_ACXFR_ACT_R> hdrL = MCList.create(MST_ACXFR_ACT_R.class);
			MST_ACXFR_ACT_R t2 = MST_ACXFR_ACT_R.create("T2");
			MCQueryApiBuilder hdrL_bldr = MCQueryApiBuilder.create(t2);
			MSW_ACXFR_ACT_KEY_R w = MSW_ACXFR_ACT_KEY_R.create("W");
			hdrL_bldr.setSelect(t2.acxfr_act_no, t2.acxfr_act_rev);
			hdrL_bldr.addInnerJoin(w, bracket( t2.acxfr_act_no.eq(w.acxfr_act_no)));
			dbSelect("MSBEL6400_MST_ACXFR_ACT_S03", hdrL, hdrL_bldr);
			
			callRevDataIns01(hdrL);
		}
	}

	protected void prepare(MCList<AcXfrAct_Chk01_HdrR> hdrL,
			MCList<AcXfrAct_Chk01_DtlR> dtlL) {
		_dtlSize = dtlL.size();

		_acxfrActNo = null;

		setDispSeq(dtlL);

		cmplAcXfrAct(hdrL, dtlL);

		initItmUnitCache(dtlL);
		initItmCache(dtlL);
		doLocCache(hdrL);
	}

	protected void cmplAcXfrAct(MCList<AcXfrAct_Chk01_HdrR> hdrL,
			MCList<AcXfrAct_Chk01_DtlR> dtlL) {
		doDlvSlipCache(hdrL);
		MCIndexKey hdrDtlIdx = dtlL.createIndex(AcXfrAct_Chk01_DtlR.$hdr_dtl_peg);
		for (AcXfrAct_Chk01_HdrR hdrR : hdrL) {
			if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())) {
				MCList<AcXfrAct_Chk01_DtlR> subDtlL = dtlL.subList(hdrDtlIdx,
						hdrR.hdr_dtl_peg());
				MST_DLV_SLIP_R dlvR = getDlvSlipR(hdrR.acxfr_act_no());
				hdrR.dlv_slip_no(dlvR.dlv_slip_no());
				for (AcXfrAct_Chk01_DtlR dtlR : subDtlL) {
					// 納品書関連は、複数件あっても同じ値が設定されているので先頭行の値を取得する
					if (!MAC_DATA_CRUD_TYP.isDEL(dtlR.data_crud_typ())) {
						dtlR.dlv_slip_no(dlvR.dlv_slip_no());
					}
				}
			}
		}
	}

	protected void prepareDel(MCList<AcXfrAct_Chk03_HdrR> hdrL,
			MCList<AcXfrAct_Chk03_DtlR> dtlL) {
		_dtlSize = 0;

		_acxfrActNo = null;

		initItmUnitCache(dtlL);
		initItmCache(dtlL);
	}

	protected void clearList() {
		_createActDL.clear();
		_modifyActDL.clear();
		_deleteActDL.clear();
		_cancelActDL.clear();
		_afterModifyActDL.clear();

		_actR.clear();
		_actDL.clear();
		_instR.clear();
		_instDL.clear();
		_schdL.clear();
	}

	protected void getActHdr(String acxfr_act_no) {
		if (isNull(acxfr_act_no)) {
			return;
		}

		dbSelectKey("MSBEL6400_MST_ACXFR_ACT_S04", _actR, MCQueryApiBuilder.create(MST_ACXFR_ACT_R.create("T")), acxfr_act_no);
	}

	protected void getActDtl(String acxfr_act_no) {
		MST_ACXFR_ACT_D_R t = MST_ACXFR_ACT_D_R.create("T");
		MCQueryApiBuilder actDL_bldr = MCQueryApiBuilder.create(t);
		if (isNull(acxfr_act_no)) {
			return;
		}

		actDL_bldr.addWhereWithAnd(t.acxfr_act_no.eq(bind("1")), acxfr_act_no);
		actDL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
		dbSelect("MSBEL6400_MST_ACXFR_ACT_D_S01", _actDL, actDL_bldr);
	}

	protected void getInstHdr(String acxfr_inst_no) {
		if (isNull(acxfr_inst_no)) {
			return;
		}

		dbSelectKey("MSBEL6400_MST_ACXFR_INST_S01", _instR, MCQueryApiBuilder.create(MST_ACXFR_INST_R.create("T")), acxfr_inst_no);
	}

	protected void getInstDtl(MCList<? extends MCRow> dtlL) {
		MCList<? extends MCRow> subL = dtlL.subList(r -> !isNull(r.getStringNE("acxfr_inst_d_no")));
		if (subL.isEmpty()) {
			return;
		}
		
		dbSelectKey("MSBEL6400_MST_ACXFR_INST_D_S01", _instDL, MCQueryApiBuilder.create(MST_ACXFR_INST_D_R.create("T")), subL.groupBy("acxfr_inst_d_no"));
	}

	protected void getSchd(MCList<? extends MCRow> dtlL) {
		MCList<? extends MCRow> subL = dtlL.subList(r -> !isNull(r.getStringNE("acxfr_schd_no")) && isNull(r.getStringNE("acxfr_inst_d_no")));
		if (subL.isEmpty()) {
			return;
		}

		dbSelectKey("MSBEL6400_MST_ACXFR_SCHD_S01", _schdL, MCQueryApiBuilder.create(MST_ACXFR_SCHD_R.create("T")), subL.groupBy("acxfr_schd_no"));
	}

	protected void insActHdr(AcXfrAct_Chk01_HdrR hdrR) {
		MST_ACXFR_ACT_R actR = MST_ACXFR_ACT_R.create();

		setActNo(hdrR);
		copy(actR, hdrR, createMap_MST_ACXFR_ACT_R_AcXfrAct_Chk01_HdrR());
		dbInsertEx("MSBEL6400_MST_ACXFR_ACT_I04", actR, MCQueryApiBuilder.create(MST_ACXFR_ACT_R.create("T")));
	}

	protected void setActNo(AcXfrAct_Chk01_HdrR hdrR) {
		ElmArgsR args = ElmArgsR.create();
		args.dpt_cd(hdrR.act_dpt_cd());
		args.co_cd(getCo().co_cd());
		args.wg_cd(hdrR.wg_cd());
		args.trd_cd(hdrR.trd_cd());
		args.str(isNull(hdrR.trd_rmrks()) ? null 
				: hdrR.trd_rmrks().substring(0, Integer.min(hdrR.trd_rmrks().length(), 20)));
		args.dt(hdrR.ac_dt());
		String hNo = getNum(MAC_NUM_BIZ_TYP.ACXACT, args);

		_acxfrActNo = hNo;
		hdrR.acxfr_act_no(_acxfrActNo);
		hdrR.acxfr_act_rev(MCNumber.ONE);
	}

	protected void setAcXfrActNoMap(AcXfrAct_Chk01_HdrR hdrR) {
		_acxfrActNoMap.put(hdrR.hdr_dtl_peg(), hdrR.acxfr_act_no());
		_acxfrActNoRevMap.put(hdrR.hdr_dtl_peg(), hdrR.acxfr_act_rev());
	}

	protected void updActHdr(AcXfrAct_Chk01_HdrR hdrR) {
		MST_ACXFR_ACT_R actH = MST_ACXFR_ACT_R.create();

		copy(actH, hdrR, createMap_MST_ACXFR_ACT_R_AcXfrAct_Chk01_HdrR());
		actH.acxfr_act_rev(_actR.acxfr_act_rev().add(MCNumber.ONE));
		dbUpdateKey("MSBEL6400_MST_ACXFR_ACT_U01", actH, MCQueryApiBuilder.create(MST_ACXFR_ACT_R.create("T")));
	}

	protected void cancelActHdr(AcXfrAct_Chk03_HdrR hdrR) {
		MST_ACXFR_ACT_R t = MST_ACXFR_ACT_R.create("T");
		MST_ACXFR_ACT_R actH = MST_ACXFR_ACT_R.create();
		MCQueryApiBuilder actH_bldr = MCQueryApiBuilder.create(t);

		actH.acxfr_act_no(hdrR.acxfr_act_no());
		actH.can_flg(true);

		actH_bldr.setSet(t.can_flg);
		dbUpdateKey("MSBEL6400_MST_ACXFR_ACT_U02", actH, actH_bldr);
	}

	protected void dtlCreate(AcXfrAct_Chk01_HdrR hdrR, AcXfrAct_Chk01_DtlR dtlR) {
		MST_ACXFR_ACT_D_R actDR = MST_ACXFR_ACT_D_R.create();

		setActDNo(dtlR);
		setVmiRegL(hdrR, dtlR);
		copy(actDR, dtlR, createMap_MST_ACXFR_ACT_D_R_AcXfrAct_Chk01_DtlR());
		_createActDL.add(actDR);
	}

	protected void setActDNo(AcXfrAct_Chk01_DtlR dtlR) {
		doSeqCache(MSC_NUM_SYS_TYP.ACXACTD, _dtlSize);
		String dNo = getStrSeq(MSC_NUM_SYS_TYP.ACXACTD);

		if (isNull(dtlR.acxfr_act_no())) {
			dtlR.acxfr_act_no(_acxfrActNo);
			dtlR.acxfr_act_rev(MCNumber.ONE);
		}

		dtlR.acxfr_act_d_no(dNo);
	}

	protected void dtlModify(AcXfrAct_Chk01_HdrR hdrR, AcXfrAct_Chk01_DtlR dtlR) {
		MST_ACXFR_ACT_D_R actDR = MST_ACXFR_ACT_D_R.create();

		setVmiRegL(hdrR, dtlR);
		copy(actDR, dtlR, createMap_MST_ACXFR_ACT_D_R_AcXfrAct_Chk01_DtlR());
		_modifyActDL.add(actDR);
	}

	protected void dtlDelete(AcXfrAct_Chk01_HdrR hdrR, AcXfrAct_Chk01_DtlR dtlR) {
		MST_ACXFR_ACT_D_R delR = MST_ACXFR_ACT_D_R.create();

		setVmiRegL(hdrR, dtlR);

		// 他勘定振替実績明細の削除
		delR.acxfr_act_d_no(dtlR.acxfr_act_d_no());
		delR.can_flg(true);
		_deleteActDL.add(delR);
	}

	protected void dtlCancel(AcXfrAct_Chk03_DtlR dtlR) {
		MST_ACXFR_ACT_D_R actDR = MST_ACXFR_ACT_D_R.create();

		actDR.acxfr_act_d_no(dtlR.acxfr_act_d_no());
		actDR.can_flg(true);
		_cancelActDL.add(actDR);
	}

	protected void setVmiRegL(AcXfrAct_Chk01_HdrR hdrR, AcXfrAct_Chk01_DtlR dtlR) {
		if (MAC_TRD_PTN_TYP.isSCRP(hdrR.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isSTK_OTH_GR(hdrR.trd_ptn_typ())) {
			return;
		}
		if (!MSC_STK_ID_TYP.isRNT_RCV(dtlR.stk_id_typ())) {
			return;
		}

		_vmiL.add(dtlR);
	}

	protected void callVmiUpd01(AcXfrAct_Chk01_HdrR hdrR) {
		if (_vmiL.isEmpty()) {
			return;
		}
		MSBDL_VmiService.Vmi_Upd01 ope = MSBDL_VmiService.crtVmi_Upd01();

		addAll(ope.up0(), _vmiL, createMap_Vmi_Chk01_DtlR_AcXfrAct_Chk01_DtlR());
		vmiUpCustom(hdrR, ope.up0());
		ope.exec();
	}

	protected void vmiUpCustom(MCRow hdrR, MCList<Vmi_Chk01_DtlR> dtlL) {
		vmiUpCustom(dtlL);
		if (MAC_DATA_CRUD_TYP.isCRT(hdrR.getStringNE("data_crud_typ"))) {
			dtlL.setDate(Vmi_Chk01_DtlR.$purc_dt, hdrR.getDateNE("acxfr_act_tm"));
			dtlL.setDate(Vmi_Chk01_DtlR.$ac_dt, hdrR.getDateNE("ac_dt"));
		}
		else if (MAC_DATA_CRUD_TYP.isUPD(hdrR.getStringNE("data_crud_typ"))) {
			dtlL.setDate(Vmi_Chk01_DtlR.$purc_dt, hdrR.getDateNE("acxfr_act_tm"));
			dtlL.setDate(Vmi_Chk01_DtlR.$ac_dt, hdrR.getDateNE("ac_dt"));
			dtlL.setDate(Vmi_Chk01_DtlR.$can_ac_dt, hdrR.getDateNE("can_ac_dt"));
		}
		else if (MAC_DATA_CRUD_TYP.isDEL(hdrR.getStringNE("data_crud_typ"))) {
			dtlL.setDate(Vmi_Chk01_DtlR.$can_ac_dt, hdrR.getDateNE("can_ac_dt"));
		}
	}

	protected void vmiUpCustom(MCList<Vmi_Chk01_DtlR> dtlL) {
		dtlL.setString(Vmi_Chk01_DtlR.$purc_src_typ, MSC_PURC_SRC_TYP.ACXFR.value());
	}

	/**
	 * 修正後の実績明細を検索する
	 */
	protected void getActDtlAfterModify(MCList<? extends MCRow> bindL) {
		MST_ACXFR_ACT_D_R t = MST_ACXFR_ACT_D_R.create("T");
		MCQueryApiBuilder afterModifyActDL_bldr = MCQueryApiBuilder.create(t);
		afterModifyActDL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
		afterModifyActDL_bldr.addWhereWithAnd(bracket( t.acxfr_inst_d_no.eq(bind("acxfr_inst_d_no")) .or(t.acxfr_schd_no.eq(bind("acxfr_schd_no")))));
		dbSelect("MSBEL6400_MST_ACXFR_ACT_D_S02", _afterModifyActDL, afterModifyActDL_bldr, bindL.groupBy("acxfr_inst_d_no", "acxfr_schd_no"));
	}

	/**
	 * 他勘定振替指図を更新する
	 */
	protected void updInst(MCList<? extends MCRow> dtlL) {
		MST_ACXFR_INST_R t1 = MST_ACXFR_INST_R.create("T1");
		MCQueryApiBuilder instR_bldr = MCQueryApiBuilder.create(t1);
		MST_ACXFR_INST_D_R t2 = MST_ACXFR_INST_D_R.create("T2");
		MCQueryApiBuilder instDL_bldr = MCQueryApiBuilder.create(t2);
		
		if (_instDL.isEmpty()) {
			return;
		}

		for (MST_ACXFR_INST_D_R instDR : _instDL) {
			MCRow dtlR = dtlL.getFirst("acxfr_inst_d_no", instDR.acxfr_inst_d_no());
			instDR.abort_flg(dtlR.getBooleanNE("abort_flg"));
		}

		setPrStsTypOfInst();
		dbTsUpdateKey("MSBEL6400_MST_ACXFR_INST_U01", _instR, instR_bldr.getBaseDbc());
		instDL_bldr.setSet(t2.pr_sts_typ, t2.abort_flg);
		dbUpdateKey("MSBEL6400_MST_ACXFR_INST_D_U01", _instDL, instDL_bldr);
	}

	protected void setPrStsTypOfInst() {
		for (MST_ACXFR_INST_D_R instDR : _instDL) {
			MCList<MST_ACXFR_ACT_D_R> actL = _afterModifyActDL.subList(
					MST_ACXFR_INST_D_R.$acxfr_inst_d_no, instDR.acxfr_inst_d_no());

			if (actL.isEmpty()) {
				instDR.pr_sts_typ(MSC_PR_STS_TYP.INST.value());
			}
			else {
				MCNumber act_qty = actL.sum(MST_ACXFR_ACT_D_R.$base_unit_qty);

				if (act_qty.gte(instDR.base_unit_qty())) {
					instDR.pr_sts_typ(MSC_PR_STS_TYP.COMP.value());
				}
				else {
					instDR.pr_sts_typ(MSC_PR_STS_TYP.PART_COMP.value());
				}
			}
		}
	}

	/**
	 * 他勘定振替予定を更新する
	 */
	protected void updSchd(MCList<? extends MCRow> dtlL) {
		MST_ACXFR_SCHD_R t = MST_ACXFR_SCHD_R.create("T");
		MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
		
		if (_schdL.isEmpty()) {
			return;
		}

		for (MST_ACXFR_SCHD_R schdR : _schdL) {
			MCRow dtlR = dtlL.getFirst("acxfr_schd_no", schdR.acxfr_schd_no());
			schdR.abort_flg(dtlR.getBooleanNE("abort_flg"));
		}

		setPrStsTypOfSchd();
		schdL_bldr.setSet(t.pr_sts_typ, t.abort_flg);
		dbUpdateKey("MSBEL6400_MST_ACXFR_SCHD_U01", _schdL, schdL_bldr);
	}

	protected void setPrStsTypOfSchd() {
		for (MST_ACXFR_SCHD_R schdR : _schdL) {
			MCList<MST_ACXFR_ACT_D_R> actL = _afterModifyActDL.subList(
					MST_ACXFR_SCHD_R.$acxfr_schd_no, schdR.acxfr_schd_no());

			if (actL.isEmpty()) {
				MST_ACXFR_INST_D_R instR = _instDL.getFirst(MST_ACXFR_INST_D_R.$acxfr_schd_no, schdR.acxfr_schd_no());
				if (isNull(instR)) {
					schdR.pr_sts_typ(MSC_PR_STS_TYP.NOT_INST.value());
				}
				else {
					schdR.pr_sts_typ(MSC_PR_STS_TYP.INST.value());
				}
			}
			else {
				MCNumber act_qty = actL.sum(MST_ACXFR_ACT_D_R.$base_unit_qty);

				if (act_qty.gte(schdR.base_unit_qty())) {
					schdR.pr_sts_typ(MSC_PR_STS_TYP.COMP.value());
				}
				else {
					schdR.pr_sts_typ(MSC_PR_STS_TYP.PART_COMP.value());
				}
			}
		}
	}

	/**
	 * 受払予定の削除
	 * @param hdrR
	 * @param dtlL
	 */
	protected void callIoSchdServiceDel01(MCRow hdrR, MCList<? extends MCRow> dtlL) {
		MSBEL_IoSchdService.IoSchd_Del01 ope = MSBEL_IoSchdService.crtIoSchd_Del01();

		HashMap<String, String> delIoSchdMap = new HashMap<String, String>();

		for (MCRow dtlR : dtlL) {
			// 受払予定NO
			if (!isNull(dtlR.getStringNE("acxfr_inst_d_no"))) {
				delIoSchdMap.put(MSW_IO_SCHD_DEL_R.$io_schd_no,
						AcXfrAct_Chk01_DtlR.$acxfr_inst_d_no);
			}
			else if (!isNull(dtlR.getStringNE("acxfr_schd_no"))) {
				delIoSchdMap.put(MSW_IO_SCHD_DEL_R.$io_schd_no,
						AcXfrAct_Chk01_DtlR.$acxfr_schd_no);
			}
			else {
				continue;
			}

			MSW_IO_SCHD_DEL_R ioR = MSW_IO_SCHD_DEL_R.create();
			ioR.setValues(delIoSchdMap, dtlR);

			// 受払予定状況区分
			if (!isNull(dtlR.getStringNE("acxfr_inst_d_no"))) {
				ioR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.ORD.value());
			}
			else if (!isNull(dtlR.getStringNE("acxfr_schd_no"))) {
				ioR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value());
			}

			// 受払予定区分
			if (MAC_TRD_PTN_TYP.isSTK_OTH_GR(hdrR.getStringNE("trd_ptn_typ"))) {
				ioR.io_schd_typ(MSC_IO_SCHD_TYP.ACXFR_GR.value());
			}
			else if (MAC_TRD_PTN_TYP.isSTK_OTH_GI(hdrR.getStringNE("trd_ptn_typ"))) {
				ioR.io_schd_typ(MSC_IO_SCHD_TYP.ACXFR_GI.value());
			}
			else if (MAC_TRD_PTN_TYP.isSCRP(hdrR.getStringNE("trd_ptn_typ"))) {
				ioR.io_schd_typ(MSC_IO_SCHD_TYP.SCRP.value());
			}

			ope.up0().add(ioR);
		}

		ope.up0().setAll(
			ope.up0().groupBy(
				MSW_IO_SCHD_DEL_R.$io_schd_typ,
				MSW_IO_SCHD_DEL_R.$io_schd_sts_typ,
				MSW_IO_SCHD_DEL_R.$io_schd_no
			));
		ope.exec();
	}

	/**
	 * 受払予定の作成（残数）
	 * @param hdrR
	 * @param dtlL
	 */
	protected void callIoSchdServiceIns01(MCRow hdrR, MCList<? extends MCRow> dtlL) {
		MSBEL_IoSchdService.IoSchd_Ins01 ope = MSBEL_IoSchdService.crtIoSchd_Ins01();

		setIoSchdAcXfrActDtlInsMap(hdrR);
		// 作成済みを管理
		HashMap<String, String> instMap = new HashMap<>(), schdMap = new HashMap<>(); 

		for (MCRow dtlR : dtlL) {
			String acxfr_inst_d_no = dtlR.getStringNE("acxfr_inst_d_no");
			String acxfr_schd_no = dtlR.getStringNE("acxfr_schd_no");

			if (dtlR.getBooleanNE("abort_flg")) {
				// 打ち切りの場合は作成しない
				continue;
			}

			// 受払予定NO
			if (!isNull(acxfr_inst_d_no)) {
				_insIoSchdMap.put(MSW_IO_SCHD_DEL_R.$io_schd_no,
						AcXfrAct_Chk01_DtlR.$acxfr_inst_d_no);
			}
			else if (!isNull(acxfr_schd_no)) {
				_insIoSchdMap.put(MSW_IO_SCHD_DEL_R.$io_schd_no,
						AcXfrAct_Chk01_DtlR.$acxfr_schd_no);
			}
			else {
				continue;
			}

			IoSchd_Ins01_DtlR ioR = IoSchd_Ins01_DtlR.create();
			ioR.setValues(_insIoSchdMap, dtlR);

			if (!isNull(acxfr_inst_d_no)) {
				if (instMap.containsKey(acxfr_inst_d_no)) {
					// 作成済み
					continue;
				}

				// 受払予定状況区分
				ioR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.ORD.value());

				// 受払予定日付
				MST_ACXFR_INST_D_R instDR = _instDL.getFirst(
						MST_ACXFR_INST_D_R.$acxfr_inst_d_no, acxfr_inst_d_no);
				if (instDR.alloc_flg()) {
					ioR.alloc_scope_typ(MAC_ALLOC_SCOPE_TYP.LOC.value());
					ioR.alloc_flg(true);
				}

				ioR.schd_dt(instDR.acxfr_schd_dt());
				ioR.lot_no(instDR.lot_no());
				ioR.sublot_no(instDR.sublot_no());

				// 数量（残数）
				MCNumber diffQty = MCNumber.ZERO;
				MCList<MST_ACXFR_ACT_D_R> actL = _afterModifyActDL.subList(
						MST_ACXFR_INST_D_R.$acxfr_inst_d_no, acxfr_inst_d_no);

				if (actL.isEmpty()) {
					// 更新後の実績がない（削除）
					diffQty = instDR.base_unit_qty();
				}
				else {
					MCNumber act_qty = actL.sum(MST_ACXFR_INST_D_R.$base_unit_qty);
					diffQty = instDR.base_unit_qty().subtract(act_qty);
				}

				if (diffQty.lte(MCNumber.ZERO)) {
					continue;
				}
				else {
					ioR.base_unit_qty(diffQty);

					MAVM_ITM_UNIT_R unitR = getItmUnitCache().getEx(instDR.itm_cd(), instDR.itm_sub1(), instDR.itm_sub2(), instDR.itm_sub3(), instDR.trd_unit_cd());
					MCNumber trd_q = rvrsBaseUnitConv(diffQty, unitR.conv_base_qty(), unitR.conv_qty(), unitR.dec_place(), unitR.rnd_typ(), true);
					if (isNull(trd_q)) {
						ioR.trd_unit_qty(diffQty);
						ioR.trd_unit_cd(instDR.base_unit_cd());
					}
					else {
						ioR.trd_unit_qty(trd_q);
						ioR.trd_unit_cd(instDR.trd_unit_cd());
					}
				}
				instMap.put(acxfr_inst_d_no, null);
			}
			else if (!isNull(acxfr_schd_no)) {
				if (schdMap.containsKey(acxfr_schd_no)) {
					// 作成済み
					continue;
				}

				// 受払予定状況区分
				ioR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value());

				// 受払予定日付
				MST_ACXFR_SCHD_R schdR = _schdL.getFirst(
						MST_ACXFR_SCHD_R.$acxfr_schd_no, acxfr_schd_no);

				ioR.schd_dt(schdR.acxfr_schd_dt());
				ioR.lot_no(schdR.lot_no());
				ioR.sublot_no(schdR.sublot_no());

				// 数量（残数）
				MCNumber diffQty = MCNumber.ZERO;
				MCList<MST_ACXFR_ACT_D_R> actL = _afterModifyActDL.subList(
						MST_ACXFR_INST_D_R.$acxfr_schd_no, acxfr_schd_no);

				if (actL.isEmpty()) {
					// 更新後の実績がない（削除）
					diffQty = schdR.base_unit_qty();
				}
				else {
					MCNumber act_qty = actL.sum(MST_ACXFR_INST_D_R.$base_unit_qty);
					diffQty = schdR.base_unit_qty().subtract(act_qty);
				}

				if (diffQty.lte(MCNumber.ZERO)) {
					continue;
				}
				else {
					ioR.base_unit_qty(diffQty);

					MAVM_ITM_UNIT_R unitR = getItmUnitCache().getEx(schdR.itm_cd(), schdR.itm_sub1(), schdR.itm_sub2(), schdR.itm_sub3(), schdR.trd_unit_cd());
					MCNumber trd_q = rvrsBaseUnitConv(diffQty, unitR.conv_base_qty(), unitR.conv_qty(), unitR.dec_place(), unitR.rnd_typ(), true);
					if (isNull(trd_q)) {
						ioR.trd_unit_qty(diffQty);
						ioR.trd_unit_cd(schdR.base_unit_cd());
					}
					else {
						ioR.trd_unit_qty(trd_q);
						ioR.trd_unit_cd(schdR.trd_unit_cd());
					}
				}
				schdMap.put(acxfr_schd_no, null);
			}

			// 受払予定区分
			if (MAC_TRD_PTN_TYP.isSTK_OTH_GR(hdrR.getStringNE("trd_ptn_typ"))) {
				ioR.io_schd_typ(MSC_IO_SCHD_TYP.ACXFR_GR.value());
			}
			else if (MAC_TRD_PTN_TYP.isSTK_OTH_GI(hdrR.getStringNE("trd_ptn_typ"))) {
				ioR.io_schd_typ(MSC_IO_SCHD_TYP.ACXFR_GI.value());
			}
			else if (MAC_TRD_PTN_TYP.isSCRP(hdrR.getStringNE("trd_ptn_typ"))) {
				ioR.io_schd_typ(MSC_IO_SCHD_TYP.SCRP.value());
			}

			ope.up0().add(ioR);
		}

		ope.exec();
	}

	protected void callIoActUpd01() {
		MSBEL_IoActService.IoAct_Upd01 ope = MSBEL_IoActService.crtIoAct_Upd01();

		ope.exec();
	}
	
	protected void callRevDataIns01(MCList<MST_ACXFR_ACT_R> hdrL) {
		MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
		for (MST_ACXFR_ACT_R hdrR : hdrL) {
			RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
			opeR.rev_data_src_no(hdrR.acxfr_act_no());
			opeR.rev_no(hdrR.acxfr_act_rev());
			opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_ACXFR_ACT.value());
			ope.up0().add(opeR);
		}
		ope.exec();
	}

	/**
	 * 諸口品登録サービス呼出
	 */
	protected void callSundryItmUpd01(AcXfrAct_Chk01_HdrR hdrR,
			MCList<AcXfrAct_Chk01_DtlR> dtlL) {

		for (AcXfrAct_Chk01_DtlR dtlR : dtlL) {
			if (!dtlR.sundry_itm_flg()) {
				continue;
			}
			SundryItm_Upd01_DtlR sundryItmRow = mcframe.serverMABC.MABCL5010.SundryItm_Upd01_DtlR
					.create();
			copy(sundryItmRow, dtlR,
					createMap_SundryItm_Upd01_DtlR_StkXfrAct_Chk01_DtlGiR());
			_sundryItmL.add(sundryItmRow);
		}

		if (_sundryItmL.isEmpty()) {
			return;
		}

		MABCL_SundryItmRegService.SundryItm_Upd01 sundryItmUpd = MABCL_SundryItmRegService
				.crtSundryItm_Upd01();
		sundryItmUpd.up0().addAll(_sundryItmL);
		sundryItmUpd.exec();
	}

	protected void chkNullVall(IoAct_Ins01_DtlR actR) {
		if (MAC_STR.isNULL_VAL(actR.dlv_cd())) {
			actR.dlv_cd(null);
		}
		if (MAC_STR.isNULL_VAL(actR.sppl_cd())) {
			actR.sppl_cd(null);
		}
	}

	protected void setIoActAcXfrActHdrInsMap(AcXfrAct_Chk01_HdrR hdrR) {
		setIoActAcXfrActHdrInsUpdCommonMap(hdrR);
	}

	protected void setIoActAcXfrActHdrUpdMap(AcXfrAct_Chk01_HdrR hdrR) {
		setIoActAcXfrActHdrInsUpdCommonMap(hdrR);

		_insIoActHdrMap.put(IoAct_Ins01_DtlR.$ac_dt, AcXfrAct_Chk01_HdrR.$ac_dt);
		_insIoActHdrMap.put(IoAct_Ins01_DtlR.$can_ac_dt, AcXfrAct_Chk01_HdrR.$can_ac_dt);
	}

	protected void setIoActAcXfrActDtlInsMap(AcXfrAct_Chk01_HdrR hdrR) {
		setIoActAcXfrActDtlInsUpdCommonMap(hdrR);
	}

	protected void setIoActAcXfrActDtlUpdMap(AcXfrAct_Chk01_HdrR hdrR) {
		setIoActAcXfrActDtlInsUpdCommonMap(hdrR);
	}

	protected void setIoActAcXfrActHdrInsUpdCommonMap(AcXfrAct_Chk01_HdrR hdrR) {
		_insIoActHdrMap.put(IoAct_Ins01_DtlR.$act_no, AcXfrAct_Chk01_HdrR.$acxfr_act_no);
		_insIoActHdrMap.put(IoAct_Ins01_DtlR.$act_rev_no,
				AcXfrAct_Chk01_HdrR.$acxfr_act_rev);
		_insIoActHdrMap.put(IoAct_Ins01_DtlR.$ac_dt, AcXfrAct_Chk01_HdrR.$ac_dt);
		_insIoActHdrMap.put(IoAct_Ins01_DtlR.$act_tm, AcXfrAct_Chk01_HdrR.$acxfr_act_tm);
		_insIoActHdrMap.put(IoAct_Ins01_DtlR.$trd_cd, AcXfrAct_Chk01_HdrR.$trd_cd);
		_insIoActHdrMap.put(IoAct_Ins01_DtlR.$trd_ptn_typ,
				AcXfrAct_Chk01_HdrR.$trd_ptn_typ);
		_insIoActHdrMap.put(IoAct_Ins01_DtlR.$act_dpt_cd,
				AcXfrAct_Chk01_HdrR.$act_dpt_cd);
		_insIoActHdrMap.put(IoAct_Ins01_DtlR.$act_usr_cd,
				AcXfrAct_Chk01_HdrR.$act_usr_cd);
		_insIoActHdrMap.put(IoAct_Ins01_DtlR.$trd_rmrks, AcXfrAct_Chk01_HdrR.$trd_rmrks);

		if (MAC_TRD_PTN_TYP.isSTK_OTH_GI(hdrR.trd_ptn_typ())) {
			_insIoActHdrMap.put(IoAct_Ins01_DtlR.$gi_wg_cd, AcXfrAct_Chk01_HdrR.$wg_cd);
			_insIoActHdrMap.put(IoAct_Ins01_DtlR.$gi_loc_cd, AcXfrAct_Chk01_HdrR.$loc_cd);
		}
		else if (MAC_TRD_PTN_TYP.isSTK_OTH_GR(hdrR.trd_ptn_typ())) {
			_insIoActHdrMap.put(IoAct_Ins01_DtlR.$gr_wg_cd, AcXfrAct_Chk01_HdrR.$wg_cd);
			_insIoActHdrMap.put(IoAct_Ins01_DtlR.$gr_loc_cd, AcXfrAct_Chk01_HdrR.$loc_cd);
		}
		else {
			_insIoActHdrMap.put(IoAct_Ins01_DtlR.$gi_wg_cd, AcXfrAct_Chk01_HdrR.$wg_cd);
			_insIoActHdrMap.put(IoAct_Ins01_DtlR.$gi_loc_cd, AcXfrAct_Chk01_HdrR.$loc_cd);
		}
	}

	protected void setIoActAcXfrActDtlInsUpdCommonMap(AcXfrAct_Chk01_HdrR hdrR) {
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$act_d_no,
				AcXfrAct_Chk01_DtlR.$acxfr_act_d_no);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$rsn_cd, AcXfrAct_Chk01_DtlR.$rsn_cd);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$bd_dpt_cd, AcXfrAct_Chk01_DtlR.$bd_dpt_cd);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$itm_cd, AcXfrAct_Chk01_DtlR.$itm_cd);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$itm_sub1, AcXfrAct_Chk01_DtlR.$itm_sub1);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$itm_sub2, AcXfrAct_Chk01_DtlR.$itm_sub2);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$itm_sub3, AcXfrAct_Chk01_DtlR.$itm_sub3);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$itm_nm, AcXfrAct_Chk01_DtlR.$itm_nm);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$stk_mng_typ,
				AcXfrAct_Chk01_DtlR.$stk_mng_typ);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$sundry_itm_flg,
				AcXfrAct_Chk01_DtlR.$sundry_itm_flg);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$stk_arrv_bp_cd,
				AcXfrAct_Chk01_DtlR.$stk_arrv_bp_cd);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$lot_no, AcXfrAct_Chk01_DtlR.$lot_no);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$sublot_no, AcXfrAct_Chk01_DtlR.$sublot_no);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$sno1, AcXfrAct_Chk01_DtlR.$sno1);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$sno2, AcXfrAct_Chk01_DtlR.$sno2);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$sno3, AcXfrAct_Chk01_DtlR.$sno3);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$sno4, AcXfrAct_Chk01_DtlR.$sno4);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$in_xfr_typ,
				AcXfrAct_Chk01_DtlR.$in_xfr_typ);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$quality_typ,
				AcXfrAct_Chk01_DtlR.$quality_typ);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$stk_insp_typ,
				AcXfrAct_Chk01_DtlR.$stk_insp_typ);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$stk_id_typ,
				AcXfrAct_Chk01_DtlR.$stk_id_typ);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$stk_bp_cd, AcXfrAct_Chk01_DtlR.$stk_bp_cd);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$trd_unit_qty,
				AcXfrAct_Chk01_DtlR.$trd_unit_qty);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$trd_unit_cd,
				AcXfrAct_Chk01_DtlR.$trd_unit_cd);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$pack_unit_qty,
				AcXfrAct_Chk01_DtlR.$pack_unit_qty);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$pack_unit_cd,
				AcXfrAct_Chk01_DtlR.$pack_unit_cd);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$base_unit_qty,
				AcXfrAct_Chk01_DtlR.$base_unit_qty);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$base_unit_cd,
				AcXfrAct_Chk01_DtlR.$base_unit_cd);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$bd_ctg_cd, AcXfrAct_Chk01_DtlR.$bd_ctg_cd);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$bd_bp_cd, AcXfrAct_Chk01_DtlR.$bd_bp_cd);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$bd_oper_cd,
				AcXfrAct_Chk01_DtlR.$bd_oper_cd);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$bd_loc_cd, AcXfrAct_Chk01_DtlR.$bd_loc_cd);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$par_itm_cd, AcXfrAct_Chk01_DtlR.$bd_itm_cd);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$par_itm_sub1,
				AcXfrAct_Chk01_DtlR.$bd_itm_sub1);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$par_itm_sub2,
				AcXfrAct_Chk01_DtlR.$bd_itm_sub2);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$par_itm_sub3,
				AcXfrAct_Chk01_DtlR.$bd_itm_sub3);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$par_lot_no, AcXfrAct_Chk01_DtlR.$bd_lot_no);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$par_sublot_no,
				AcXfrAct_Chk01_DtlR.$bd_sublot_no);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$par_sno1, AcXfrAct_Chk01_DtlR.$bd_sno1);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$par_sno2, AcXfrAct_Chk01_DtlR.$bd_sno2);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$par_sno3, AcXfrAct_Chk01_DtlR.$bd_sno3);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$par_sno4, AcXfrAct_Chk01_DtlR.$bd_sno4);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$trd_d_rmrks,
				AcXfrAct_Chk01_DtlR.$trd_d_rmrks);

		if (isNull(_locCache.get(hdrR.loc_cd()).sppl_cd())) {
			_insIoActDtlMap.put(IoAct_Ins01_DtlR.$dlv_cd,
					AcXfrAct_Chk01_DtlR.$stk_arrv_bp_cd);
		}
		else {
			_insIoActDtlMap.put(IoAct_Ins01_DtlR.$sppl_cd,
					AcXfrAct_Chk01_DtlR.$stk_arrv_bp_cd);
		}

		if (MAC_TRD_PTN_TYP.isSTK_OTH_GI(hdrR.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isSCRP(hdrR.trd_ptn_typ())) {
			_insIoActDtlMap.put(IoAct_Ins01_DtlR.$fix_no_typ,
					AcXfrAct_Chk01_DtlR.$fix_no_typ);
			_insIoActDtlMap.put(IoAct_Ins01_DtlR.$fix_no, AcXfrAct_Chk01_DtlR.$fix_no);
			_insIoActDtlMap.put(IoAct_Ins01_DtlR.$gi_gd_cd, AcXfrAct_Chk01_DtlR.$gd_cd);
			_insIoActDtlMap.put(IoAct_Ins01_DtlR.$gi_str_ln_cd,
					AcXfrAct_Chk01_DtlR.$str_ln_cd);
		}
		else if (MAC_TRD_PTN_TYP.isSTK_OTH_GR(hdrR.trd_ptn_typ())) {
			_insIoActDtlMap.put(IoAct_Ins01_DtlR.$gr_gd_cd, AcXfrAct_Chk01_DtlR.$gd_cd);
			_insIoActDtlMap.put(IoAct_Ins01_DtlR.$gr_str_ln_cd,
					AcXfrAct_Chk01_DtlR.$str_ln_cd);
		}
		else {
			_insIoActDtlMap.put(IoAct_Ins01_DtlR.$gi_gd_cd, AcXfrAct_Chk01_DtlR.$gd_cd);
			_insIoActDtlMap.put(IoAct_Ins01_DtlR.$gi_str_ln_cd,
					AcXfrAct_Chk01_DtlR.$str_ln_cd);
		}
	}

	protected void setIoActAcXfrActDtlDelMap() {
		_insIoActHdrMap.put(IoAct_Ins01_DtlR.$can_ac_dt, AcXfrAct_Chk01_HdrR.$can_ac_dt);
		_insIoActHdrMap.put(IoAct_Ins01_DtlR.$act_no, AcXfrAct_Chk01_HdrR.$acxfr_act_no);
		_insIoActDtlMap.put(IoAct_Ins01_DtlR.$act_d_no,
				AcXfrAct_Chk01_DtlR.$acxfr_act_d_no);
	}

	protected void setIoActAcXfrActDelMap() {
		_insIoActHdrMap.put(IoAct_Ins01_DtlR.$can_ac_dt, AcXfrAct_Chk03_HdrR.$can_ac_dt);
		_insIoActHdrMap.put(IoAct_Ins01_DtlR.$act_no, AcXfrAct_Chk03_HdrR.$acxfr_act_no);
	}

	/**
	 * 受払予定作成時に渡すカラムのマッピング情報を設定する<br>
	 * 手動設定する必要があるカラムについては、本処理では設定しない
	 * @param up0
	 */
	protected void setIoSchdAcXfrActDtlInsMap(MCRow row) {
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$io_schd_pr_no,
				AcXfrAct_Chk01_DtlR.$io_schd_pr_no);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$itm_cd, AcXfrAct_Chk01_DtlR.$itm_cd);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$itm_sub1, AcXfrAct_Chk01_DtlR.$itm_sub1);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$itm_sub2, AcXfrAct_Chk01_DtlR.$itm_sub2);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$itm_sub3, AcXfrAct_Chk01_DtlR.$itm_sub3);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$ver_no, AcXfrAct_Chk01_DtlR.$ver_no);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$loc_cd, AcXfrAct_Chk01_DtlR.$loc_cd);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$str_ln_cd, AcXfrAct_Chk01_DtlR.$str_ln_cd);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$stk_arrv_bp_cd,
				AcXfrAct_Chk01_DtlR.$stk_arrv_bp_cd);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$lot_no, AcXfrAct_Chk01_DtlR.$lot_no);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$sublot_no, AcXfrAct_Chk01_DtlR.$sublot_no);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$sno1, AcXfrAct_Chk01_DtlR.$sno1);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$sno2, AcXfrAct_Chk01_DtlR.$sno2);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$sno3, AcXfrAct_Chk01_DtlR.$sno3);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$sno4, AcXfrAct_Chk01_DtlR.$sno4);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$base_unit_cd,
				AcXfrAct_Chk01_DtlR.$base_unit_cd);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$gd_cd, AcXfrAct_Chk01_DtlR.$gd_cd);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$quality_typ,
				AcXfrAct_Chk01_DtlR.$quality_typ);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$stk_insp_typ,
				AcXfrAct_Chk01_DtlR.$stk_insp_typ);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$stk_id_typ, AcXfrAct_Chk01_DtlR.$stk_id_typ);
		_insIoSchdMap.put(IoSchd_Ins01_DtlR.$stk_bp_cd, AcXfrAct_Chk01_DtlR.$stk_bp_cd);

		if (MAC_TRD_PTN_TYP
				.isSTK_OTH_GI(row.getStringNE(AcXfrAct_Chk01_DtlR.$trd_ptn_typ))
				|| (MAC_TRD_PTN_TYP
						.isSCRP(row.getStringNE(AcXfrAct_Chk01_DtlR.$trd_ptn_typ)))) {
			_insIoSchdMap.put(IoSchd_Ins01_DtlR.$rsn_cd, AcXfrAct_Chk01_DtlR.$rsn_cd);
		}
	}

	protected void rtrnHdr(AcXfrAct_Chk01_HdrR hdrR, MCList<AcXfrAct_Chk01_HdrR> hdrL) {
		AcXfrAct_Chk01_HdrR down0R = AcXfrAct_Chk01_HdrR.create();

		down0R.hdr_dtl_peg(hdrR.hdr_dtl_peg());
		down0R.acxfr_act_no(_acxfrActNoMap.get(hdrR.hdr_dtl_peg()));
		down0R.acxfr_act_rev(_acxfrActNoRevMap.get(hdrR.hdr_dtl_peg()));
		hdrL.add(down0R);
	}

	protected void rtrnDtl(MCList<AcXfrAct_Chk01_DtlR> upL,
			MCList<AcXfrAct_Chk01_DtlR> downL) {
		downL.addAll(upL);
	}

	protected Map_MST_ACXFR_ACT_R_AcXfrAct_Chk01_HdrR<MST_ACXFR_ACT_R, AcXfrAct_Chk01_HdrR> createMap_MST_ACXFR_ACT_R_AcXfrAct_Chk01_HdrR() {
		return new Map_MST_ACXFR_ACT_R_AcXfrAct_Chk01_HdrR<MST_ACXFR_ACT_R, AcXfrAct_Chk01_HdrR>();
	}

	public class Map_MST_ACXFR_ACT_R_AcXfrAct_Chk01_HdrR<D extends MST_ACXFR_ACT_R, S extends AcXfrAct_Chk01_HdrR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_ACXFR_ACT_R.$acxfr_act_no,
					AcXfrAct_Chk01_HdrR.$acxfr_act_no);
			addColumnPathMap(MST_ACXFR_ACT_R.$acxfr_act_rev,
					AcXfrAct_Chk01_HdrR.$acxfr_act_rev);
			addColumnPathMap(MST_ACXFR_ACT_R.$trd_cd, AcXfrAct_Chk01_HdrR.$trd_cd);
			addColumnPathMap(MST_ACXFR_ACT_R.$trd_ptn_typ,
					AcXfrAct_Chk01_HdrR.$trd_ptn_typ);
			addColumnPathMap(MST_ACXFR_ACT_R.$acxfr_inst_no,
					AcXfrAct_Chk01_HdrR.$acxfr_inst_no);
			addColumnPathMap(MST_ACXFR_ACT_R.$loc_cd, AcXfrAct_Chk01_HdrR.$loc_cd);
			addColumnPathMap(MST_ACXFR_ACT_R.$wg_cd, AcXfrAct_Chk01_HdrR.$wg_cd);
			addColumnPathMap(MST_ACXFR_ACT_R.$ac_dt, AcXfrAct_Chk01_HdrR.$ac_dt);
			addColumnPathMap(MST_ACXFR_ACT_R.$acxfr_act_tm,
					AcXfrAct_Chk01_HdrR.$acxfr_act_tm);
			addColumnPathMap(MST_ACXFR_ACT_R.$act_dpt_cd,
					AcXfrAct_Chk01_HdrR.$act_dpt_cd);
			addColumnPathMap(MST_ACXFR_ACT_R.$act_usr_cd,
					AcXfrAct_Chk01_HdrR.$act_usr_cd);
			addColumnPathMap(MST_ACXFR_ACT_R.$prnt_flg, AcXfrAct_Chk01_HdrR.$prnt_flg);
			addColumnPathMap(MST_ACXFR_ACT_R.$trd_rmrks, AcXfrAct_Chk01_HdrR.$trd_rmrks);
			addColumnPathMap(MST_ACXFR_ACT_R.$intr_rmrks,
					AcXfrAct_Chk01_HdrR.$intr_rmrks);
			addColumnPathMap(MST_ACXFR_ACT_R.$sub_char1, AcXfrAct_Chk01_HdrR.$sub_char1);
			addColumnPathMap(MST_ACXFR_ACT_R.$sub_char2, AcXfrAct_Chk01_HdrR.$sub_char2);
			addColumnPathMap(MST_ACXFR_ACT_R.$sub_char3, AcXfrAct_Chk01_HdrR.$sub_char3);

		}
	}

	protected Map_MST_ACXFR_ACT_D_R_AcXfrAct_Chk01_DtlR<MST_ACXFR_ACT_D_R, AcXfrAct_Chk01_DtlR> createMap_MST_ACXFR_ACT_D_R_AcXfrAct_Chk01_DtlR() {
		return new Map_MST_ACXFR_ACT_D_R_AcXfrAct_Chk01_DtlR<MST_ACXFR_ACT_D_R, AcXfrAct_Chk01_DtlR>();
	}

	public class Map_MST_ACXFR_ACT_D_R_AcXfrAct_Chk01_DtlR<D extends MST_ACXFR_ACT_D_R, S extends AcXfrAct_Chk01_DtlR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_ACXFR_ACT_D_R.$acxfr_act_d_no,
					AcXfrAct_Chk01_DtlR.$acxfr_act_d_no);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$acxfr_act_no,
					AcXfrAct_Chk01_DtlR.$acxfr_act_no);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$acxfr_act_rev,
					AcXfrAct_Chk01_DtlR.$acxfr_act_rev);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$acxfr_schd_no,
					AcXfrAct_Chk01_DtlR.$acxfr_schd_no);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$acxfr_inst_d_no,
					AcXfrAct_Chk01_DtlR.$acxfr_inst_d_no);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$rsn_cd, AcXfrAct_Chk01_DtlR.$rsn_cd);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$bd_dpt_cd,
					AcXfrAct_Chk01_DtlR.$bd_dpt_cd);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$itm_cd, AcXfrAct_Chk01_DtlR.$itm_cd);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$itm_sub1, AcXfrAct_Chk01_DtlR.$itm_sub1);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$itm_sub2, AcXfrAct_Chk01_DtlR.$itm_sub2);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$itm_sub3, AcXfrAct_Chk01_DtlR.$itm_sub3);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$str_ln_cd,
					AcXfrAct_Chk01_DtlR.$str_ln_cd);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$stk_arrv_bp_cd,
					AcXfrAct_Chk01_DtlR.$stk_arrv_bp_cd);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$lot_no, AcXfrAct_Chk01_DtlR.$lot_no);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$sublot_no,
					AcXfrAct_Chk01_DtlR.$sublot_no);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$sno1, AcXfrAct_Chk01_DtlR.$sno1);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$sno2, AcXfrAct_Chk01_DtlR.$sno2);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$sno3, AcXfrAct_Chk01_DtlR.$sno3);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$sno4, AcXfrAct_Chk01_DtlR.$sno4);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$fix_no_typ,
					AcXfrAct_Chk01_DtlR.$fix_no_typ);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$fix_no, AcXfrAct_Chk01_DtlR.$fix_no);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$gd_cd, AcXfrAct_Chk01_DtlR.$gd_cd);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$in_xfr_typ,
					AcXfrAct_Chk01_DtlR.$in_xfr_typ);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$quality_typ,
					AcXfrAct_Chk01_DtlR.$quality_typ);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$stk_insp_typ,
					AcXfrAct_Chk01_DtlR.$stk_insp_typ);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$stk_id_typ,
					AcXfrAct_Chk01_DtlR.$stk_id_typ);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$stk_bp_cd,
					AcXfrAct_Chk01_DtlR.$stk_bp_cd);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$trd_unit_qty,
					AcXfrAct_Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$trd_unit_cd,
					AcXfrAct_Chk01_DtlR.$trd_unit_cd);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$pack_unit_qty,
					AcXfrAct_Chk01_DtlR.$pack_unit_qty);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$pack_unit_cd,
					AcXfrAct_Chk01_DtlR.$pack_unit_cd);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$base_unit_qty,
					AcXfrAct_Chk01_DtlR.$base_unit_qty);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$base_unit_cd,
					AcXfrAct_Chk01_DtlR.$base_unit_cd);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$bd_loc_cd,
					AcXfrAct_Chk01_DtlR.$bd_loc_cd);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$bd_ctg_cd,
					AcXfrAct_Chk01_DtlR.$bd_ctg_cd);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$bd_oper_cd,
					AcXfrAct_Chk01_DtlR.$bd_oper_cd);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$bd_bp_cd, AcXfrAct_Chk01_DtlR.$bd_bp_cd);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$bd_itm_cd,
					AcXfrAct_Chk01_DtlR.$bd_itm_cd);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$bd_itm_sub1,
					AcXfrAct_Chk01_DtlR.$bd_itm_sub1);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$bd_itm_sub2,
					AcXfrAct_Chk01_DtlR.$bd_itm_sub2);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$bd_itm_sub3,
					AcXfrAct_Chk01_DtlR.$bd_itm_sub3);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$bd_lot_no,
					AcXfrAct_Chk01_DtlR.$bd_lot_no);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$bd_sublot_no,
					AcXfrAct_Chk01_DtlR.$bd_sublot_no);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$bd_sno1, AcXfrAct_Chk01_DtlR.$bd_sno1);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$bd_sno2, AcXfrAct_Chk01_DtlR.$bd_sno2);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$bd_sno3, AcXfrAct_Chk01_DtlR.$bd_sno3);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$bd_sno4, AcXfrAct_Chk01_DtlR.$bd_sno4);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$io_schd_pr_no,
					AcXfrAct_Chk01_DtlR.$io_schd_pr_no);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$dspsl_no, AcXfrAct_Chk01_DtlR.$dspsl_no);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$aprv_flg, AcXfrAct_Chk01_DtlR.$aprv_flg);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$aprv_no, AcXfrAct_Chk01_DtlR.$aprv_no);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$trd_d_rmrks,
					AcXfrAct_Chk01_DtlR.$trd_d_rmrks);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$intr_d_rmrks,
					AcXfrAct_Chk01_DtlR.$intr_d_rmrks);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$disp_seq, AcXfrAct_Chk01_DtlR.$disp_seq);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$sub_char1,
					AcXfrAct_Chk01_DtlR.$sub_char1);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$sub_char2,
					AcXfrAct_Chk01_DtlR.$sub_char2);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$sub_char3,
					AcXfrAct_Chk01_DtlR.$sub_char3);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$wms_flg, AcXfrAct_Chk01_DtlR.$wms_flg);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$ext_acxfr_act_no, AcXfrAct_Chk01_DtlR.$ext_acxfr_act_no);
			addColumnPathMap(MST_ACXFR_ACT_D_R.$ext_sys_cd, AcXfrAct_Chk01_DtlR.$ext_sys_cd);

		}
	}

	protected Map_Lot_Chk02_CndR_AcXfrAct_Chk01_DtlR<Lot_Chk02_CndR, AcXfrAct_Chk01_DtlR> createMap_Lot_Chk02_CndR_AcXfrAct_Chk01_DtlR() {
		return new Map_Lot_Chk02_CndR_AcXfrAct_Chk01_DtlR<Lot_Chk02_CndR, AcXfrAct_Chk01_DtlR>();
	}

	public class Map_Lot_Chk02_CndR_AcXfrAct_Chk01_DtlR<D extends Lot_Chk02_CndR, S extends AcXfrAct_Chk01_DtlR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Lot_Chk02_CndR.$peg_no, AcXfrAct_Chk01_DtlR.$peg_no);
			addColumnPathMap(Lot_Chk02_CndR.$itm_cd, AcXfrAct_Chk01_DtlR.$itm_cd);
			addColumnPathMap(Lot_Chk02_CndR.$itm_sub1, AcXfrAct_Chk01_DtlR.$itm_sub1);
			addColumnPathMap(Lot_Chk02_CndR.$itm_sub2, AcXfrAct_Chk01_DtlR.$itm_sub2);
			addColumnPathMap(Lot_Chk02_CndR.$itm_sub3, AcXfrAct_Chk01_DtlR.$itm_sub3);
			addColumnPathMap(Lot_Chk02_CndR.$lot_no, AcXfrAct_Chk01_DtlR.$lot_no);
			addColumnPathMap(Lot_Chk02_CndR.$sublot_no, AcXfrAct_Chk01_DtlR.$sublot_no);
			addColumnPathMap(Lot_Chk02_CndR.$err_flg, AcXfrAct_Chk01_DtlR.$err_flg);

		}
	}

	protected Map_Lot_Chk03_CndR_AcXfrAct_Chk01_DtlR<Lot_Chk03_CndR, AcXfrAct_Chk01_DtlR> createMap_Lot_Chk03_CndR_AcXfrAct_Chk01_DtlR() {
		return new Map_Lot_Chk03_CndR_AcXfrAct_Chk01_DtlR<Lot_Chk03_CndR, AcXfrAct_Chk01_DtlR>();
	}

	public class Map_Lot_Chk03_CndR_AcXfrAct_Chk01_DtlR<D extends Lot_Chk03_CndR, S extends AcXfrAct_Chk01_DtlR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Lot_Chk03_CndR.$peg_no, AcXfrAct_Chk01_DtlR.$peg_no);
			addColumnPathMap(Lot_Chk03_CndR.$itm_cd, AcXfrAct_Chk01_DtlR.$itm_cd);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub1, AcXfrAct_Chk01_DtlR.$itm_sub1);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub2, AcXfrAct_Chk01_DtlR.$itm_sub2);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub3, AcXfrAct_Chk01_DtlR.$itm_sub3);
			addColumnPathMap(Lot_Chk03_CndR.$lot_no, AcXfrAct_Chk01_DtlR.$lot_no);
			addColumnPathMap(Lot_Chk03_CndR.$sublot_no, AcXfrAct_Chk01_DtlR.$sublot_no);
			addColumnPathMap(Lot_Chk03_CndR.$stk_insp_typ,
					AcXfrAct_Chk01_DtlR.$stk_insp_typ);
			addColumnPathMap(Lot_Chk03_CndR.$quality_typ,
					AcXfrAct_Chk01_DtlR.$quality_typ);
			addColumnPathMap(Lot_Chk03_CndR.$err_flg, AcXfrAct_Chk01_DtlR.$err_flg);

		}
	}

	protected Map_Lot_Chk03_CndR_AcXfrAct_Chk01_DtlR_Bd<Lot_Chk03_CndR, AcXfrAct_Chk01_DtlR> createMap_Lot_Chk03_CndR_AcXfrAct_Chk01_DtlR_Bd() {
		return new Map_Lot_Chk03_CndR_AcXfrAct_Chk01_DtlR_Bd<Lot_Chk03_CndR, AcXfrAct_Chk01_DtlR>();
	}

	public class Map_Lot_Chk03_CndR_AcXfrAct_Chk01_DtlR_Bd<D extends Lot_Chk03_CndR, S extends AcXfrAct_Chk01_DtlR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Lot_Chk03_CndR.$peg_no, AcXfrAct_Chk01_DtlR.$peg_no);
			addColumnPathMap(Lot_Chk03_CndR.$itm_cd, AcXfrAct_Chk01_DtlR.$bd_itm_cd);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub1, AcXfrAct_Chk01_DtlR.$bd_itm_sub1);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub2, AcXfrAct_Chk01_DtlR.$bd_itm_sub2);
			addColumnPathMap(Lot_Chk03_CndR.$itm_sub3, AcXfrAct_Chk01_DtlR.$bd_itm_sub3);
			addColumnPathMap(Lot_Chk03_CndR.$lot_no, AcXfrAct_Chk01_DtlR.$bd_lot_no);
			addColumnPathMap(Lot_Chk03_CndR.$sublot_no,
					AcXfrAct_Chk01_DtlR.$bd_sublot_no);
			addColumnPathMap(Lot_Chk03_CndR.$err_flg, AcXfrAct_Chk01_DtlR.$err_flg);

		}
	}

	protected Map_SundryItm_Chk01_DtlR_AcXfrAct_Chk01_DtlR<SundryItm_Chk01_DtlR, AcXfrAct_Chk01_DtlR> createMap_SundryItm_Chk01_DtlR_AcXfrAct_Chk01_DtlR() {
		return new Map_SundryItm_Chk01_DtlR_AcXfrAct_Chk01_DtlR<SundryItm_Chk01_DtlR, AcXfrAct_Chk01_DtlR>();
	}

	public class Map_SundryItm_Chk01_DtlR_AcXfrAct_Chk01_DtlR<D extends SundryItm_Chk01_DtlR, S extends AcXfrAct_Chk01_DtlR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SundryItm_Chk01_DtlR.$peg_no, AcXfrAct_Chk01_DtlR.$peg_no);
			addColumnPathMap(SundryItm_Chk01_DtlR.$data_crud_typ,
					AcXfrAct_Chk01_DtlR.$data_crud_typ);
			addColumnPathMap(SundryItm_Chk01_DtlR.$itm_cd, AcXfrAct_Chk01_DtlR.$itm_cd);
			addColumnPathMap(SundryItm_Chk01_DtlR.$itm_sub1,
					AcXfrAct_Chk01_DtlR.$itm_sub1);
			addColumnPathMap(SundryItm_Chk01_DtlR.$itm_sub2,
					AcXfrAct_Chk01_DtlR.$itm_sub2);
			addColumnPathMap(SundryItm_Chk01_DtlR.$itm_sub3,
					AcXfrAct_Chk01_DtlR.$itm_sub3);
			addColumnPathMap(SundryItm_Chk01_DtlR.$sno1, AcXfrAct_Chk01_DtlR.$sno1);
			addColumnPathMap(SundryItm_Chk01_DtlR.$sno2, AcXfrAct_Chk01_DtlR.$sno2);
			addColumnPathMap(SundryItm_Chk01_DtlR.$sno3, AcXfrAct_Chk01_DtlR.$sno3);
			addColumnPathMap(SundryItm_Chk01_DtlR.$sno4, AcXfrAct_Chk01_DtlR.$sno4);
			addColumnPathMap(SundryItm_Chk01_DtlR.$itm_nm, AcXfrAct_Chk01_DtlR.$itm_nm);
			addColumnPathMap(SundryItm_Chk01_DtlR.$err_flg, AcXfrAct_Chk01_DtlR.$err_flg);

		}
	}

	protected Map_SundryItm_Upd01_DtlR_StkXfrAct_Chk01_DtlGiR<SundryItm_Upd01_DtlR, AcXfrAct_Chk01_DtlR> createMap_SundryItm_Upd01_DtlR_StkXfrAct_Chk01_DtlGiR() {
		return new Map_SundryItm_Upd01_DtlR_StkXfrAct_Chk01_DtlGiR<SundryItm_Upd01_DtlR, AcXfrAct_Chk01_DtlR>();
	}

	public class Map_SundryItm_Upd01_DtlR_StkXfrAct_Chk01_DtlGiR<D extends SundryItm_Upd01_DtlR, S extends AcXfrAct_Chk01_DtlR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SundryItm_Upd01_DtlR.$itm_cd, AcXfrAct_Chk01_DtlR.$itm_cd);
			addColumnPathMap(SundryItm_Upd01_DtlR.$itm_sub1,
					AcXfrAct_Chk01_DtlR.$itm_sub1);
			addColumnPathMap(SundryItm_Upd01_DtlR.$itm_sub2,
					AcXfrAct_Chk01_DtlR.$itm_sub2);
			addColumnPathMap(SundryItm_Upd01_DtlR.$itm_sub3,
					AcXfrAct_Chk01_DtlR.$itm_sub3);
			addColumnPathMap(SundryItm_Upd01_DtlR.$sno1, AcXfrAct_Chk01_DtlR.$sno1);
			addColumnPathMap(SundryItm_Upd01_DtlR.$sno2, AcXfrAct_Chk01_DtlR.$sno2);
			addColumnPathMap(SundryItm_Upd01_DtlR.$sno3, AcXfrAct_Chk01_DtlR.$sno3);
			addColumnPathMap(SundryItm_Upd01_DtlR.$sno4, AcXfrAct_Chk01_DtlR.$sno4);
			addColumnPathMap(SundryItm_Upd01_DtlR.$itm_nm, AcXfrAct_Chk01_DtlR.$itm_nm);

		}
	}

	protected Map_Vmi_Chk01_DtlR_AcXfrAct_Chk01_DtlR<Vmi_Chk01_DtlR, AcXfrAct_Chk01_DtlR> createMap_Vmi_Chk01_DtlR_AcXfrAct_Chk01_DtlR() {
		return new Map_Vmi_Chk01_DtlR_AcXfrAct_Chk01_DtlR<Vmi_Chk01_DtlR, AcXfrAct_Chk01_DtlR>();
	}

	public class Map_Vmi_Chk01_DtlR_AcXfrAct_Chk01_DtlR<D extends Vmi_Chk01_DtlR, S extends AcXfrAct_Chk01_DtlR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Vmi_Chk01_DtlR.$peg_no, AcXfrAct_Chk01_DtlR.$peg_no);
			addColumnPathMap(Vmi_Chk01_DtlR.$data_crud_typ,
					AcXfrAct_Chk01_DtlR.$data_crud_typ);
			addColumnPathMap(Vmi_Chk01_DtlR.$stk_bp_cd, AcXfrAct_Chk01_DtlR.$stk_bp_cd);
			addColumnPathMap(Vmi_Chk01_DtlR.$itm_cd, AcXfrAct_Chk01_DtlR.$itm_cd);
			addColumnPathMap(Vmi_Chk01_DtlR.$itm_sub1, AcXfrAct_Chk01_DtlR.$itm_sub1);
			addColumnPathMap(Vmi_Chk01_DtlR.$itm_sub2, AcXfrAct_Chk01_DtlR.$itm_sub2);
			addColumnPathMap(Vmi_Chk01_DtlR.$itm_sub3, AcXfrAct_Chk01_DtlR.$itm_sub3);
			addColumnPathMap(Vmi_Chk01_DtlR.$itm_nm, AcXfrAct_Chk01_DtlR.$itm_nm);
			addColumnPathMap(Vmi_Chk01_DtlR.$trd_unit_cd,
					AcXfrAct_Chk01_DtlR.$trd_unit_cd);
			addColumnPathMap(Vmi_Chk01_DtlR.$trd_unit_qty,
					AcXfrAct_Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(Vmi_Chk01_DtlR.$base_unit_cd,
					AcXfrAct_Chk01_DtlR.$base_unit_cd);
			addColumnPathMap(Vmi_Chk01_DtlR.$base_unit_qty,
					AcXfrAct_Chk01_DtlR.$base_unit_qty);
			addColumnPathMap(Vmi_Chk01_DtlR.$gd_cd, AcXfrAct_Chk01_DtlR.$gd_cd);
			addColumnPathMap(Vmi_Chk01_DtlR.$sno1, AcXfrAct_Chk01_DtlR.$sno1);
			addColumnPathMap(Vmi_Chk01_DtlR.$sno2, AcXfrAct_Chk01_DtlR.$sno2);
			addColumnPathMap(Vmi_Chk01_DtlR.$sno3, AcXfrAct_Chk01_DtlR.$sno3);
			addColumnPathMap(Vmi_Chk01_DtlR.$sno4, AcXfrAct_Chk01_DtlR.$sno4);
			addColumnPathMap(Vmi_Chk01_DtlR.$loc_cd, AcXfrAct_Chk01_DtlR.$loc_cd);
			addColumnPathMap(Vmi_Chk01_DtlR.$str_ln_cd, AcXfrAct_Chk01_DtlR.$str_ln_cd);
			addColumnPathMap(Vmi_Chk01_DtlR.$lot_no, AcXfrAct_Chk01_DtlR.$lot_no);
			addColumnPathMap(Vmi_Chk01_DtlR.$sublot_no, AcXfrAct_Chk01_DtlR.$sublot_no);
			addColumnPathMap(Vmi_Chk01_DtlR.$quality_typ,
					AcXfrAct_Chk01_DtlR.$quality_typ);
			addColumnPathMap(Vmi_Chk01_DtlR.$stk_insp_typ,
					AcXfrAct_Chk01_DtlR.$stk_insp_typ);

			addColumnPathMap(Vmi_Chk01_DtlR.$purc_src_no,
					AcXfrAct_Chk01_DtlR.$acxfr_act_d_no);
			addColumnPathMap(Vmi_Chk01_DtlR.$interim_flg,
					AcXfrAct_Chk01_DtlR.$vmi_interim_flg);
			addColumnPathMap(Vmi_Chk01_DtlR.$trd_cur_upri, AcXfrAct_Chk01_DtlR.$vmi_upri);

		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			dest.interim_flg(src.vmi_interim_flg());
			dest.trd_cur_upri(src.vmi_upri());
		}
	}

	protected Map_Vmi_Chk01_DtlR_AcXfrAct_Chk03_DtlR<Vmi_Chk01_DtlR, AcXfrAct_Chk03_DtlR> createMap_Vmi_Chk01_DtlR_AcXfrAct_Chk03_DtlR() {
		return new Map_Vmi_Chk01_DtlR_AcXfrAct_Chk03_DtlR<Vmi_Chk01_DtlR, AcXfrAct_Chk03_DtlR>();
	}

	public class Map_Vmi_Chk01_DtlR_AcXfrAct_Chk03_DtlR<D extends Vmi_Chk01_DtlR, S extends AcXfrAct_Chk03_DtlR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Vmi_Chk01_DtlR.$peg_no, AcXfrAct_Chk03_DtlR.$peg_no);
			addColumnPathMap(Vmi_Chk01_DtlR.$data_crud_typ,
					AcXfrAct_Chk03_DtlR.$data_crud_typ);
			addColumnPathMap(Vmi_Chk01_DtlR.$purc_src_no,
					AcXfrAct_Chk01_DtlR.$acxfr_act_d_no);

		}
	}

	protected Map_ShipRprt_Upd01_HdrR_AcXfrAct_Chk01_HdrR<ShipRprt_Upd01_HdrR, AcXfrAct_Chk01_HdrR> createMap_ShipRprt_Upd01_HdrR_AcXfrAct_Chk01_HdrR() {
		return new Map_ShipRprt_Upd01_HdrR_AcXfrAct_Chk01_HdrR<ShipRprt_Upd01_HdrR, AcXfrAct_Chk01_HdrR>();
	}

	public class Map_ShipRprt_Upd01_HdrR_AcXfrAct_Chk01_HdrR<D extends ShipRprt_Upd01_HdrR, S extends AcXfrAct_Chk01_HdrR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipRprt_Upd01_HdrR.$ac_dt, AcXfrAct_Chk01_HdrR.$ac_dt);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$trd_cd, AcXfrAct_Chk01_HdrR.$trd_cd);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$trd_ptn_typ,
					AcXfrAct_Chk01_HdrR.$trd_ptn_typ);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$wg_cd, AcXfrAct_Chk01_HdrR.$wg_cd);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$trd_rmrks,
					AcXfrAct_Chk01_HdrR.$trd_rmrks);
			addColumnPathMap(ShipRprt_Upd01_HdrR.$can_ac_dt,
					AcXfrAct_Chk01_HdrR.$can_ac_dt);

		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			dest.trn_typ(MSC_TRN_TYP.ACXFR.value());
			dest.dlv_slip_act_no(src.acxfr_act_no());
			dest.dpt_cd(src.act_dpt_cd());
			dest.usr_cd(src.act_usr_cd());
			dest.xfr_loc_cd(src.loc_cd());
			dest.dlv_slip_prnt_flg(src.prnt_flg());
		}
	}

	protected Map_ShipRprt_Upd01_DtlR_AcXfrAct_Chk01_DtlR<ShipRprt_Upd01_DtlR, AcXfrAct_Chk01_DtlR> createMap_ShipRprt_Upd01_DtlR_AcXfrAct_Chk01_DtlR() {
		return new Map_ShipRprt_Upd01_DtlR_AcXfrAct_Chk01_DtlR<ShipRprt_Upd01_DtlR, AcXfrAct_Chk01_DtlR>();
	}

	public class Map_ShipRprt_Upd01_DtlR_AcXfrAct_Chk01_DtlR<D extends ShipRprt_Upd01_DtlR, S extends AcXfrAct_Chk01_DtlR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_cd, AcXfrAct_Chk01_DtlR.$itm_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_sub1,
					AcXfrAct_Chk01_DtlR.$itm_sub1);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_sub2,
					AcXfrAct_Chk01_DtlR.$itm_sub2);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$itm_sub3,
					AcXfrAct_Chk01_DtlR.$itm_sub3);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sundry_itm_flg,
					AcXfrAct_Chk01_DtlR.$sundry_itm_flg);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sno1, AcXfrAct_Chk01_DtlR.$sno1);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sno2, AcXfrAct_Chk01_DtlR.$sno2);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sno3, AcXfrAct_Chk01_DtlR.$sno3);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sno4, AcXfrAct_Chk01_DtlR.$sno4);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$lot_no, AcXfrAct_Chk01_DtlR.$lot_no);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$sublot_no,
					AcXfrAct_Chk01_DtlR.$sublot_no);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$str_ln_cd,
					AcXfrAct_Chk01_DtlR.$str_ln_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$stk_arrv_bp_cd,
					AcXfrAct_Chk01_DtlR.$stk_arrv_bp_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$gd_cd, AcXfrAct_Chk01_DtlR.$gd_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$quality_typ,
					AcXfrAct_Chk01_DtlR.$quality_typ);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$stk_insp_typ,
					AcXfrAct_Chk01_DtlR.$stk_insp_typ);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$stk_id_typ,
					AcXfrAct_Chk01_DtlR.$stk_id_typ);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$stk_bp_cd,
					AcXfrAct_Chk01_DtlR.$stk_bp_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$fix_no_typ,
					AcXfrAct_Chk01_DtlR.$fix_no_typ);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$fix_no, AcXfrAct_Chk01_DtlR.$fix_no);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$trd_unit_qty,
					AcXfrAct_Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$trd_unit_cd,
					AcXfrAct_Chk01_DtlR.$trd_unit_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$base_unit_qty,
					AcXfrAct_Chk01_DtlR.$base_unit_qty);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$base_unit_cd,
					AcXfrAct_Chk01_DtlR.$base_unit_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$rsn_cd, AcXfrAct_Chk01_DtlR.$rsn_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$bd_dpt_cd,
					AcXfrAct_Chk01_DtlR.$bd_dpt_cd);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$trd_d_rmrks,
					AcXfrAct_Chk01_DtlR.$trd_d_rmrks);
			addColumnPathMap(ShipRprt_Upd01_DtlR.$dlv_slip_no,
					AcXfrAct_Chk01_DtlR.$dlv_slip_no);

		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			dest.dtl_uniq_no(src.acxfr_act_d_no());
			if (MAC_TRD_PTN_TYP.isSTK_OTH_GR(src.trd_ptn_typ())) {
				dest.io_typ(MSC_IO_TYP.GR.value());
			}
			else {
				dest.io_typ(MSC_IO_TYP.GI.value());
			}
		}

	}
	/**
	 * AcXfrAct_RevUpd01オペレーション.<p>
	 *
	 * 他勘定振替実績改訂履歴テーブルを更新する。改訂履歴データ更新用の共通処理（MAUCL5020）から呼び出される。<br>
	 */
	public class AcXfrAct_RevUpd01 extends MSBEL_AcXfrActRegService_MC_A.AcXfrAct_RevUpd01 {

		MCList<MST_ACXFR_ACT_R> _hCurrentL = MCList.create(MST_ACXFR_ACT_R.class);
		MST_ACXFR_ACT_R t1 = MST_ACXFR_ACT_R.create("T1");
		MCQueryApiBuilder _hCurrentL_bldr = MCQueryApiBuilder.create(t1);
		MCList<MST_ACXFR_ACT_D_R> _dCurrentL = MCList.create(MST_ACXFR_ACT_D_R.class);
		MST_ACXFR_ACT_D_R t2 = MST_ACXFR_ACT_D_R.create("T2");
		MCQueryApiBuilder _dCurrentL_bldr = MCQueryApiBuilder.create(t2);
		MCList<MST_ACXFR_ACT_P_R> _hRevL = MCList.create(MST_ACXFR_ACT_P_R.class);
		MST_ACXFR_ACT_P_R t3 = MST_ACXFR_ACT_P_R.create("T3");
		MCQueryApiBuilder _hRevL_bldr = MCQueryApiBuilder.create(t3);
		MCList<MST_ACXFR_ACT_D_P_R> _dRevL = MCList.create(MST_ACXFR_ACT_D_P_R.class);
		MST_ACXFR_ACT_D_P_R t4 = MST_ACXFR_ACT_D_P_R.create("T4");
		MCQueryApiBuilder _dRevL_bldr = MCQueryApiBuilder.create(t4);
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			wkInsert();
			selectCurrentAndRev();
			revisionInsOrUpd();
		}
		
		/**
		 * 上り電文の項目を本体・改訂履歴ヘッダーのワークテーブルに設定
		 */
		protected void wkInsert() {
			MCList<MST_ACXFR_ACT_R> wkL = MCList.create(MST_ACXFR_ACT_R.class);
			for (RevData_Upd01_DtlR r : up0()) {
				MST_ACXFR_ACT_R wkR = MST_ACXFR_ACT_R.create();
				wkR.acxfr_act_no(r.rev_data_src_no());
				wkL.add(wkR);
			}
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_ACXFR_ACT_R.create("T"));
			dbWkDelete("MSBEL6400_MSW_ACXFR_ACT_D04", wkL_bldr.getBaseDbc());
			MCQueryApiBuilder wkL2_bldr = MCQueryApiBuilder.create(MST_ACXFR_ACT_R.create("T"));
			MCList<MST_ACXFR_ACT_R> wkL2 = wkL.groupBy(wkL2_bldr.getBaseDbc().getKeyColumn());

			dbWkInsert("MSBEL6400_MSW_ACXFR_ACT_I01", wkL2, wkL2_bldr.getBaseDbc());
			
			MCList<MST_ACXFR_ACT_P_R> wkpL = MCList.create(MST_ACXFR_ACT_P_R.class);
			for (RevData_Upd01_DtlR r : up0()) {
				MST_ACXFR_ACT_P_R wkpR = MST_ACXFR_ACT_P_R.create();
				wkpR.acxfr_act_no(r.rev_data_src_no());
				wkpR.acxfr_act_rev(r.rev_no());
				wkpL.add(wkpR);
			}
			MCQueryApiBuilder wkpL_bldr = MCQueryApiBuilder.create(MST_ACXFR_ACT_P_R.create("T"));
			dbWkDelete("MSBEL6400_MSW_ACXFR_ACT_P_D01", wkpL_bldr.getBaseDbc());
			MCQueryApiBuilder wkpL2_bldr = MCQueryApiBuilder.create(MST_ACXFR_ACT_P_R.create("T"));
			MCList<MST_ACXFR_ACT_P_R> wkpL2 = wkpL.groupBy(wkpL2_bldr.getBaseDbc().getKeyColumn());
			dbWkInsert("MSBEL6400_MSW_ACXFR_ACT_P_I01", wkpL2, wkpL2_bldr.getBaseDbc());
		}
		
		/**
		 * 本体テーブルと改訂履歴テーブルからリストを取得
		 */
		protected void selectCurrentAndRev() {
			MSW_ACXFR_ACT_KEY_R w1 = MSW_ACXFR_ACT_KEY_R.create("W1");
			MSW_ACXFR_ACT_KEY_R w2 = MSW_ACXFR_ACT_KEY_R.create("W2");
			_hCurrentL_bldr.addInnerJoin(w1, bracket( t1.acxfr_act_no.eq(w1.acxfr_act_no)));
			dbSelect("MSBEL6400_MST_ACXFR_ACT_S05", _hCurrentL, _hCurrentL_bldr);
			_dCurrentL_bldr.addInnerJoin(w2, bracket( t2.acxfr_act_no.eq(w2.acxfr_act_no)));
			dbSelect("MSBEL6400_MST_ACXFR_ACT_D_S03", _dCurrentL, _dCurrentL_bldr);

			MSW_ACXFR_ACT_P_KEY_R w3 = MSW_ACXFR_ACT_P_KEY_R.create("W3");
			MSW_ACXFR_ACT_KEY_R w4 = MSW_ACXFR_ACT_KEY_R.create("W4");
			_hRevL_bldr.addInnerJoin(w3, bracket( t3.acxfr_act_no.eq(w3.acxfr_act_no) .and(t3.acxfr_act_rev.eq(w3.acxfr_act_rev))));
			dbSelect("MSBEL6400_MST_ACXFR_ACT_P_S01", _hRevL, _hRevL_bldr);
			_dRevL_bldr.addInnerJoin(w4, bracket( t4.acxfr_act_no.eq(w4.acxfr_act_no)));
			dbSelect("MSBEL6400_MST_ACXFR_ACT_D_P_S01", _dRevL, _dRevL_bldr);
		}
		
		/**
		 * 本番テーブルのデータを元に、改訂履歴テーブルを追加又は更新する。
		 */
		protected void revisionInsOrUpd() {
			// ヘッダーの改訂履歴テーブルを追加又は更新する。
			MCIndexKey hRevIdx = _hRevL.createIndex(MST_ACXFR_ACT_P_R.$acxfr_act_no, MST_ACXFR_ACT_P_R.$acxfr_act_rev);
			MCList<MST_ACXFR_ACT_P_R> hUpd = MCList.create(MST_ACXFR_ACT_P_R.class);
			MST_ACXFR_ACT_P_R t1 = MST_ACXFR_ACT_P_R.create("T1");
			MCQueryApiBuilder hUpd_bldr = MCQueryApiBuilder.create(t1);
			MCList<MST_ACXFR_ACT_P_R> hIns = MCList.create(MST_ACXFR_ACT_P_R.class);
			MST_ACXFR_ACT_P_R t2 = MST_ACXFR_ACT_P_R.create("T2");
			MCQueryApiBuilder hIns_bldr = MCQueryApiBuilder.create(t2);
			for (MST_ACXFR_ACT_R hcurrentR : _hCurrentL) {
				
				MST_ACXFR_ACT_P_R tempRevR = MST_ACXFR_ACT_P_R.create();
				tempRevR.setByName(hcurrentR);
				if (_hRevL == null || isNull(_hRevL.getFirst(hRevIdx, hcurrentR.acxfr_act_no(), hcurrentR.acxfr_act_rev()))) {
					hIns.add(tempRevR);
				}
				else {
					hUpd.add(tempRevR);
				}
			}
			if (!isNull(hIns)) {
				dbInsert("MSBEL6400_MST_ACXFR_ACT_P_I01", hIns, hIns_bldr);
			}
			if (!isNull(hUpd)) {
				hUpd_bldr.removeSet(hUpd_bldr.getBaseDbc().getKeyColumn());
				dbUpdateKey("MSBEL6400_MST_ACXFR_ACT_P_U01", hUpd, hUpd_bldr);
			}
			
			// 明細の改訂履歴テーブルを追加又は更新する。
			MCIndexKey dRevIdx = _dRevL.createIndex(MST_ACXFR_ACT_D_P_R.$acxfr_act_d_no, MST_ACXFR_ACT_D_P_R.$acxfr_act_rev);
			MCIndexKey hCurrentRevIdx = _hCurrentL.createIndex(MST_ACXFR_ACT_R.$acxfr_act_no);
			MCList<MST_ACXFR_ACT_D_P_R> dUpd = MCList.create(MST_ACXFR_ACT_D_P_R.class);
			MST_ACXFR_ACT_D_P_R t3 = MST_ACXFR_ACT_D_P_R.create("T3");
			MCQueryApiBuilder dUpd_bldr = MCQueryApiBuilder.create(t3);
			MCList<MST_ACXFR_ACT_D_P_R> dIns = MCList.create(MST_ACXFR_ACT_D_P_R.class);
			MST_ACXFR_ACT_D_P_R t4 = MST_ACXFR_ACT_D_P_R.create("T4");
			MCQueryApiBuilder dIns_bldr = MCQueryApiBuilder.create(t4);
			for (MST_ACXFR_ACT_D_R dcurrentR : _dCurrentL) {
				MST_ACXFR_ACT_D_P_R tempRevR = MST_ACXFR_ACT_D_P_R.create();
				tempRevR.setByName(dcurrentR);
				
				// 最新改訂番号を取得するため、明細に該当するヘッダを取得
				MST_ACXFR_ACT_R tempHr = _hCurrentL.getFirst(hCurrentRevIdx, tempRevR.acxfr_act_no());
				tempRevR.acxfr_act_rev(tempHr.acxfr_act_rev());
				
				if (_dRevL == null ||isNull(_dRevL.getFirst(dRevIdx, tempRevR.acxfr_act_d_no(), tempRevR.acxfr_act_rev()))) {
					dIns.add(tempRevR);
				}
				else {
					dUpd.add(tempRevR);
				}
				
			}
			
			if (!isNull(dIns)) {
				dbInsert("MSBEL6400_MST_ACXFR_ACT_D_P_I01", dIns, dIns_bldr);
			}
			if (!isNull(dUpd)) {
				dUpd_bldr.removeSet(dUpd_bldr.getBaseDbc().getKeyColumn());
				dbUpdateKey("MSBEL6400_MST_ACXFR_ACT_D_P_U01", dUpd, dUpd_bldr);
			}
		}
	}

	//FMCB CUSTOM END
}