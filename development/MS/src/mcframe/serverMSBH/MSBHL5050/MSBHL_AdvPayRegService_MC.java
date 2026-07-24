package mcframe.serverMSBH.MSBHL5050;

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
import mcframe.serverMSBH.MSBHL5050.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_Cache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil;
import mcframe.serverMAUC.MAUCL1110.MAUCL_DptUtil;
import mcframe.serverMSBG.MSBGL5080.*;
import mcframe.serverMSBH.MSBHL5070.*;
import mcframe.serverMSBI.MSBIL5010.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBHL_AdvPayRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBHL_AdvPayRegService_MC extends MSBHL_AdvPayRegService_MC_A{
	//FMCB CUSTOM START
	/**
	 * このクラス（スレッドセーフ対応用）
	 */
	protected static final Class<MSBHL_AdvPayRegService> CLAZZ = MSBHL_AdvPayRegService.class;

	/**
	 * 更新対象の前渡金実績のキャッシュ
	 */
	protected FXUCL_Cache<MST_ADV_PAY_ACT_R> _advPayActCache = null;
	
	/**
	 * 更新対象の支払手形のキャッシュ
	 */
	protected FXUCL_Cache<MCList<MST_PAY_NOTE_R>> _payNoteCache = null;

	/**
	 * 前渡金実績、支払手形のロック・キャッシュを行う。
	 * @param hdrL
	 */
	protected static void initPayCache(MCList<AdvPay_Chk01_HdrR> hdrL) {
		object(CLAZZ)._initPayCache(hdrL);
	}
	
	protected void _initPayCache(MCList<AdvPay_Chk01_HdrR> hdrL) {

		// 前渡金実績
		MCList<MST_ADV_PAY_ACT_R> advPayActL = MCList.create(MST_ADV_PAY_ACT_R.class);
		MCQueryApiBuilder advPayActL_bldr = MCQueryApiBuilder.create(MST_ADV_PAY_ACT_R.create("T"));
		dbSelectKeyForUpdateNoWait("MSBHL5050_MST_ADV_PAY_ACT_S01", advPayActL, advPayActL_bldr, hdrL);

		if (_advPayActCache == null) {
			_advPayActCache = new FXUCL_Cache<MST_ADV_PAY_ACT_R>();
			_advPayActCache.setFixMaxCacheSize(-1);
		}
		
		for (MST_ADV_PAY_ACT_R r : advPayActL) {
			Comparable<?>[] key = r.toArray(MST_ADV_PAY_ACT_R.$adv_pay_act_no,
					MST_ADV_PAY_ACT_R.$adv_pay_act_seq);
			_advPayActCache.putCache(key, r);
		}

		// 支払手形
		MCList<MST_PAY_NOTE_R> payNoteL = MCList.create(MST_PAY_NOTE_R.class);
		MST_PAY_NOTE_R t1 = MST_PAY_NOTE_R.create("T1");
		MCQueryApiBuilder payNoteL_bldr = MCQueryApiBuilder.create(t1);
		payNoteL_bldr.setWhere(t1.adv_pay_act_no.eq(bind("adv_pay_act_no"))
				.and(t1.adv_pay_act_seq.eq(bind("adv_pay_act_seq"))));
		dbSelectForUpdateNoWait("MSBHL5050_MST_PAY_NOTE_S01", payNoteL, payNoteL_bldr, hdrL);

		if (_payNoteCache == null) {
			_payNoteCache = new FXUCL_Cache<MCList<MST_PAY_NOTE_R>>();
			_payNoteCache.setFixMaxCacheSize(-1);
		}
		
		String[] payNoteKeys = {
				MST_PAY_NOTE_R.$adv_pay_act_no, MST_PAY_NOTE_R.$adv_pay_act_seq
		};
		for (MCList<MST_PAY_NOTE_R> l : payNoteL.groupList(payNoteKeys)) {
			Comparable<?>[] key = l.get(0).toArray(payNoteKeys);
			_payNoteCache.putCache(key, l);
		}
	}
	
	/**
	 * 指定された前渡金実績ＮＯ、前渡金実績連番に対応する支払手形を取得する。
	 * @param advPayActNo 前渡金実績ＮＯ
	 * @param advPayActSeq 前渡金実績連番
	 * @return 支払手形
	 */
	protected static MST_PAY_NOTE_R getCachePayNoteR(String advPayActNo, MCNumber advPayActSeq) {
		return object(CLAZZ)._getPayNoteR(advPayActNo, advPayActSeq);
	}
	
	protected MST_PAY_NOTE_R _getPayNoteR(String advPayActNo, MCNumber advPayActSeq) {
		
		MCList<MST_PAY_NOTE_R> l = _getPayNoteL(advPayActNo, advPayActSeq);
		if (l != null && !l.isEmpty()) {
			return l.get(0);
		}
		
		return null;
	}
	
	protected MCList<MST_PAY_NOTE_R> _getPayNoteL(String advPayActNo, MCNumber advPayActSeq) {
		Comparable<?>[] key = {advPayActNo, advPayActSeq};
		return _payNoteCache.getCache(key);
	}
	
	/**
	 * 指定された前渡金実績ＮＯ、前渡金実績連番に対応する前渡金実績を取得する。
	 * @param advPayActNo 前渡金実績ＮＯ
	 * @param advPayActSeq 前渡金実績連番
	 * @return 前渡金実績
	 */
	protected static MST_ADV_PAY_ACT_R getCacheAdvActPayR(String advPayActNo, MCNumber advPayActSeq) {
		return object(CLAZZ)._getAdvActPayR(advPayActNo, advPayActSeq);
	}
	
	protected MST_ADV_PAY_ACT_R _getAdvActPayR(String advPayActNo, MCNumber advPayActSeq) {
		Comparable<?>[] key = {advPayActNo, advPayActSeq};
		return _advPayActCache.getCache(key);
	}
	
	/**
	 * AdvPay_Chk01オペレーション.<p>
	 *
	 * 前渡金の登録・更新が可能かチェックをする。<br>
	 */
	public class AdvPay_Chk01 extends MSBHL_AdvPayRegService_MC_A.AdvPay_Chk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			callClServiceChk03(up0());
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			initPayCache(up0());

			msgL.addAll(chkUpdCntr(up0()));
			msgL.addAll(chkBefDac(up0()));

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheck() {
			MCMessageList msgL = super.doServerCheck();

			msgL.addAll(chkReq());

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<AdvPay_Chk01_HdrR> chkL = getChkList(up0());

			if (!isNull(chkL)) {
				msgL.addAll(chkDecPlace(chkL));
				msgL.addAll(chkDac(chkL));
				msgL.addAll(chkNoteDays(chkL));
				msgL.addAll(chkPaySchd(chkL));
			}

			return msgL;
		}
		
		/**
		 * 条件付き必須チェックを行う。
		 * @return
		 */
		protected MCMessageList chkReq() {
			MCMessageList msgL = new MCMessageList();

			for (AdvPay_Chk01_HdrR r : up0()) {
				// 債務決済区分＝'1'（預金）または手数料債務決済区分＝'2'（預金（手数料））
				if (MAC_AP_STTL_TYP.isACNT(r.ap_sttl_typ()) 
						|| MAC_AP_STTL_TYP.isACNT_COM_PAID(r.com_paid_ap_sttl_typ())) {
					msgL.addAll(check(r, AdvPay_Chk01_HdrR.$bank_ac_cd, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, AdvPay_Chk01_HdrR.$pay_bank_ac_cd, new FXUCL_RequiredValidater()));
				}

				// 手数料債務決済区分≠NULL
				if (!isNull(r.com_paid_ap_sttl_typ())) {
					msgL.addAll(check(r, AdvPay_Chk01_HdrR.$trd_cur_com_paid, new FXUCL_RequiredValidater()));
					if (MAC_AP_STTL_TYP.isACNT_COM_PAID(r.com_paid_ap_sttl_typ()) || MAC_AP_STTL_TYP.isCASH_COM_PAID(r.com_paid_ap_sttl_typ())) {
						msgL.addAll(check(r, AdvPay_Chk01_HdrR.$trd_cur_com_paid_tax_cd, new FXUCL_RequiredValidater()));
					}
				}

				// 債務決済区分＝'5'（手形）
				if (MAC_AP_STTL_TYP.isNOTE(r.ap_sttl_typ())) {
					msgL.addAll(check(r, AdvPay_Chk01_HdrR.$note_no, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, AdvPay_Chk01_HdrR.$note_typ, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, AdvPay_Chk01_HdrR.$draw_dt, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, AdvPay_Chk01_HdrR.$drawer_nm, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, AdvPay_Chk01_HdrR.$draw_bank_cd, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, AdvPay_Chk01_HdrR.$draw_branch_cd, new FXUCL_RequiredValidater()));

					// 手形区分が為替手形の場合
					if (MAC_NOTE_TYP.isXCHNG(r.note_typ())) {
						msgL.addAll(check(r, AdvPay_Chk01_HdrR.$accptr, new FXUCL_RequiredValidater()));
					}

					// 債務決済区分＝'5'（手形）かつ手形サイトが指定されていない
					if (isNull(r.note_days())) {
						msgL.addAll(check(r, AdvPay_Chk01_HdrR.$due_dt, new FXUCL_RequiredValidater()));
					}
					// 債務決済区分＝'5'（手形）かつ支払期日が指定されていない
					else if (isNull(r.due_dt())) {
						msgL.addAll(check(r, AdvPay_Chk01_HdrR.$note_days, new FXUCL_RequiredValidater()));
					}
				}
			}

			return msgL;
		}

		/**
		 * 小数部有効桁数チェックを行う。
		 * @param chkL
		 * @return
		 */
		protected MCMessageList chkDecPlace(MCList<AdvPay_Chk01_HdrR> chkL) {
			MCMessageList msgL = new MCMessageList();
			
			for (AdvPay_Chk01_HdrR r : chkL) {
				msgL.addAll(checkDecPlace(r, r.trd_cur_amt_dec_place().intValue(), AdvPay_Chk01_HdrR.$trd_cur_amt));
				// 手数料債務決済区分≠NULL
				if (!isNull(r.com_paid_ap_sttl_typ())) {
					msgL.addAll(checkDecPlace(r, r.trd_cur_amt_dec_place().intValue(), AdvPay_Chk01_HdrR.$trd_cur_com_paid));
				}
			}
			
			return msgL;
		}

		/**
		 * DACチェックを行う。
		 * @param chkL
		 * @return
		 */
		protected MCMessageList chkDac(MCList<AdvPay_Chk01_HdrR> chkL) {
			MCMessageList msgL = new MCMessageList();

			for (AdvPay_Chk01_HdrR r : chkL) {
				MCMessageList payDptMsgL = checkWritableDptCdDac(r, AdvPay_Chk01_HdrR.$pay_dpt_cd);
				MCMessageList bspplDptMsgL = checkWritableDptCdDac(r, AdvPay_Chk01_HdrR.$bsppl_dpt_cd);

				// 支払部門、支払予定管理先担当部門両方のDACチェックでエラーした場合のみ、エラーメッセージに追加する
				if (!payDptMsgL.isEmpty() && !bspplDptMsgL.isEmpty()) {
					msgL.addAll(payDptMsgL);
					msgL.addAll(bspplDptMsgL);
				}
			}

			return msgL;
		}

		/**
		 * 支払予定が登録済かどうかのチェックを行う。
		 * @param chkL
		 * @return
		 */
		protected MCMessageList chkPaySchd(MCList<AdvPay_Chk01_HdrR> chkL) {
			MCMessageList msgL = new MCMessageList();
			
			for (AdvPay_Chk01_HdrR r : chkL) {
				
				if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					MST_ADV_PAY_ACT_R tblR = getCacheAdvActPayR(r.adv_pay_act_no(), r.adv_pay_act_seq());
					if (tblR.trd_cur_setoff_schd_amt().isPositive()) {
						// 取引通貨相殺予定額>0の場合は支払予定登録済とみなし、エラー
						msgL.add(new MCMessage(r, null, MSBHL0040, r.adv_pay_act_no(), toDispGUIIndex(r)));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 手形サイト上限チェックを行う。
		 * @param chkL
		 * @return
		 */
		protected MCMessageList chkNoteDays(MCList<AdvPay_Chk01_HdrR> chkL) {
			MCMessageList msgL = new MCMessageList();
			
			// 取引先マスタの取得
			MCList<MAM_BP_R> bpL = MCList.create(MAM_BP_R.class);
			MAM_BP_R t = MAM_BP_R.create("T");
			MCQueryApiBuilder bpL_bldr = MCQueryApiBuilder.create(t);
			bpL_bldr.setSelect(t.bp_cd, t.note_days);
			bpL_bldr.setWhere(t.bp_cd.eq(bind("psppl_cd")));
			dbSelect("MSBHL5050_MAM_BP_S01", bpL, bpL_bldr, chkL);
			MCIndexKey bpKey = bpL.createIndex(MAM_BP_R.$bp_cd);
			
			for (AdvPay_Chk01_HdrR r : chkL) {
				MAM_BP_R bpR = bpL.getFirst(bpKey, r.psppl_cd());
				if (isNull(bpR)) {
					continue;
				}
				
				if (!isNull(bpR.note_days()) && !isNull(r.note_days())
						&& r.note_days().gt(bpR.note_days())) {
					msgL.add(new MCMessage(r, null, MSBHL0036, r.psppl_cd(),
							toYMDString(r.draw_dt()), toYMDString(r.due_dt()),
							MCNumber.valueOf(r.due_dt().diffDay(r.draw_dt())),
							bpR.note_days(), toDispGUIIndex(r)));
				}
			}
			
			return msgL;
		}

		/**
		 * 下り電文を設定します。
		 */
		protected void setDown() {
			for (AdvPay_Chk01_HdrR r : up0()) {
				compByDrawDt(r);
				compPayNoteMngNo(r);
			}
			down0().addAll(up0());
		}

		/**
		 * 振出日から手形サイト、支払期日を補完します。
		 * @param r
		 */
		protected void compByDrawDt(AdvPay_Chk01_HdrR r) {
			if (!MAC_AP_STTL_TYP.isNOTE(r.ap_sttl_typ())) {
				return;
			}
			if (isNull(r.due_dt()) && !isNull(r.note_days())) {
				// 支払期日=振出日+手形サイト
				r.due_dt(r.draw_dt().addDay(r.note_days()));
			}
			
			if (isNull(r.note_days()) && !isNull(r.due_dt())) {
				// 手形サイト=支払期日-振出日
				r.note_days(r.draw_dt().diffDay(r.due_dt()));
			}
		}
		
		/**
		 * 前渡金の更新時、支払手形の情報を補完します。
		 * @param r
		 */
		protected void compPayNoteMngNo(AdvPay_Chk01_HdrR r) {
			if (!MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
				return;
			}
			
			MST_ADV_PAY_ACT_R advPayActR = getCacheAdvActPayR(r.adv_pay_act_no(), r.adv_pay_act_seq());

			if (MAC_AP_STTL_TYP.isNOTE(advPayActR.ap_sttl_typ())) {
				// 更新前の債務決済区分が「手形」の場合
				MST_PAY_NOTE_R payNoteR = getCachePayNoteR(r.adv_pay_act_no(), r.adv_pay_act_seq());
				r.pay_note_mng_no(payNoteR.pay_note_mng_no());

				if (MAC_AP_STTL_TYP.isNOTE(r.ap_sttl_typ())) {
					// 更新後の債務決済区分が「手形」の場合、更新（手形→手形）
					r.note_data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				else {
					// 更新後の債務決済区分が「手形」以外の場合、削除（手形→手形以外）
					r.note_data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
			}
			else {
				// 更新前の債務決済区分が「手形」以外の場合
				r.pay_note_mng_no(null);
				
				if (MAC_AP_STTL_TYP.isNOTE(r.ap_sttl_typ())) {
					// 更新後の債務決済区分が「手形」の場合、新規（手形以外→手形）
					r.note_data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else {
					// 更新後の債務決済区分が「手形」以外の場合、null（手形以外→手形以外）
					r.note_data_crud_typ(null);
				}
			}
		}
		
	}
	
	/**
	 * 更新カウンタチェック
	 * @param hdrL
	 * @return
	 */
	protected MCMessageList chkUpdCntr(MCList<AdvPay_Chk01_HdrR> hdrL) {
		MCMessageList msgL = new MCMessageList();

		for (AdvPay_Chk01_HdrR r : hdrL) {
			if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
				continue;
			}
	
			MST_ADV_PAY_ACT_R tblR = getCacheAdvActPayR(r.adv_pay_act_no(), r.adv_pay_act_seq());
			msgL.addAll(checkUpdCntrNE(r, AdvPay_Chk01_HdrR.$adv_pay_upd_cntr, tblR));
		}

		return msgL;
	}
	
	/**
	 * 更新前データのDACチェック
	 * @param hdrL
	 * @return
	 */
	protected MCMessageList chkBefDac(MCList<AdvPay_Chk01_HdrR> hdrL) {
		MCMessageList msgL = new MCMessageList();

		for (AdvPay_Chk01_HdrR r : hdrL) {
			if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
				continue;
			}
			
			MST_ADV_PAY_ACT_R tblR = getCacheAdvActPayR(r.adv_pay_act_no(), r.adv_pay_act_seq());

			MCMessageList payDptMsgL = new MCMessageList();
			if (isNull(r.pay_dpt_cd()) || !isSame(r.pay_dpt_cd(), tblR.pay_dpt_cd())) {
				payDptMsgL = checkWritableDptCdDac(tblR, MST_ADV_PAY_ACT_R.$pay_dpt_cd);
			}

			MCMessageList bspplDptMsgL = new MCMessageList();
			if (isNull(r.bsppl_dpt_cd()) || !isSame(r.bsppl_dpt_cd(), tblR.bsppl_dpt_cd())) {
				bspplDptMsgL = checkWritableDptCdDac(tblR, MST_ADV_PAY_ACT_R.$bsppl_dpt_cd);
			}
			
			// 支払部門、支払予定管理先担当部門両方のDACチェックでエラーした場合のみ、エラーメッセージに追加する
			// ※片方のDACチェックでエラーとならなければOKとする。仮に更新前後の値が同じでチェックが行われなかった場合、更新後の値のDACチェックでエラーとなる
			if (!payDptMsgL.isEmpty() && !bspplDptMsgL.isEmpty()) {
				msgL.addAll(payDptMsgL);
				msgL.addAll(bspplDptMsgL);
			}
		}

		return msgL;
	}
	
	/**
	 * 締処理提供サービスの締日チェックを実行する。
	 */
	protected void callClServiceChk03(MCList<AdvPay_Chk01_HdrR> hdrL) {
		MCList<AdvPay_Chk01_HdrR> chkL = getChkList(hdrL);
		MSBIL_ClService.Cl_Chk03 ope = MSBIL_ClService.crtCl_Chk03();

		for (AdvPay_Chk01_HdrR r : chkL) {
			Cl_Chk03_CndR up0R = Cl_Chk03_CndR.create();
			up0R.peg_no(r.peg_no());
			up0R.ac_dt(r.ac_dt());
			up0R.can_ac_dt(r.can_ac_dt());
			up0R.pay_cls_chk_flg(true);
			ope.up0().add(up0R);
		}

		if (!ope.up0().isEmpty()) {
			ope.exec();
		}
		copyErrFlg(chkL, ope.down0());
	}
	
	/**
	 * AdvPay_Chk02オペレーション.<p>
	 *
	 * 前渡金の削除が可能かチェックをする。<br>
	 */
	public class AdvPay_Chk02 extends MSBHL_AdvPayRegService_MC_A.AdvPay_Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			callClServiceChk03(up0());
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			initPayCache(up0());

			msgL.addAll(chkUpdCntr(up0()));
			msgL.addAll(chkBefDac(up0()));

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<AdvPay_Chk01_HdrR> chkL = getChkList(up0());

			if (!isNull(chkL)) {
				msgL.addAll(chkPaySchd(chkL));
			}

			return msgL;
		}
		
		/**
		 * 支払予定が登録済かどうかのチェックを行う。
		 * @param chkL
		 * @return
		 */
		protected MCMessageList chkPaySchd(MCList<AdvPay_Chk01_HdrR> chkL) {
			MCMessageList msgL = new MCMessageList();
			
			for (AdvPay_Chk01_HdrR r : chkL) {
				
				MST_ADV_PAY_ACT_R tblR = getCacheAdvActPayR(r.adv_pay_act_no(), r.adv_pay_act_seq());
				if (tblR.trd_cur_setoff_schd_amt().isPositive()) {
					// 取引通貨相殺予定額>0の場合は支払予定登録済とみなし、エラー
					msgL.add(new MCMessage(r, null, MSBHL0041, r.adv_pay_act_no(), toDispGUIIndex(r)));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 下り電文を設定します。
		 */
		protected void setDown() {
			for (AdvPay_Chk01_HdrR r : up0()) {
				compPayNoteMngNo(r);
			}
			down0().addAll(up0());
		}

		/**
		 * 支払手形の情報を補完します。
		 * @param r
		 */
		protected void compPayNoteMngNo(AdvPay_Chk01_HdrR r) {
			MST_ADV_PAY_ACT_R advPayActR = getCacheAdvActPayR(r.adv_pay_act_no(), r.adv_pay_act_seq());

			if (MAC_AP_STTL_TYP.isNOTE(advPayActR.ap_sttl_typ())) {
				// 削除前の債務決済区分が「手形」の場合
				MST_PAY_NOTE_R payNoteR = getCachePayNoteR(r.adv_pay_act_no(), r.adv_pay_act_seq());
				r.pay_note_mng_no(payNoteR.pay_note_mng_no());
			}
		}
		
	}

	/**
	 * AdvPay_Ins01オペレーション.<p>
	 *
	 * 前渡金実績、支払手形を登録する。<br>
	 */
	public class AdvPay_Ins01 extends MSBHL_AdvPayRegService_MC_A.AdvPay_Ins01 {

		MCList<MST_ADV_PAY_ACT_R> _apaL;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			insAdvPayAct();
			insPayNote();
			callCredServiceUpd02(_apaL);
			callPayActIfCrtServiceIns01(_apaL);
			setDown();
		}
		
		/**
		 * 前渡金実績を新規登録する。
		 */
		protected void insAdvPayAct() {
			_apaL = MCList.create(MST_ADV_PAY_ACT_R.class);

			for (AdvPay_Chk01_HdrR r : up0()) {
				r.adv_pay_act_no(getAdvPayActNo(r));
				r.adv_pay_act_seq(MCNumber.ONE);
				r.adv_pay_act_rev(MCNumber.ONE);
				r.slip_sts_typ(MAC_SLIP_STS_TYP.CRT.value());
				editInsUpdAdvPayAct(r);
				_apaL.add(r.apa());
			}

			MCQueryApiBuilder apaL_bldr = MCQueryApiBuilder.create(MST_ADV_PAY_ACT_R.create("T"));
			dbInsertEx("MSBHL5050_MST_ADV_PAY_ACT_I01", _apaL, apaL_bldr);
		}

		/**
		 * 支払手形を新規登録する。
		 */
		protected void insPayNote() {
			MCList<MST_PAY_NOTE_R> pnL = MCList.create(MST_PAY_NOTE_R.class);

			for (AdvPay_Chk01_HdrR r : up0()) {
				if (!MAC_AP_STTL_TYP.isNOTE(r.ap_sttl_typ())) {
					continue;
				}
				
				editNewPayNote(r);
				pnL.add(r.pn());
			}

			MCQueryApiBuilder pnL_bldr = MCQueryApiBuilder.create(MST_PAY_NOTE_R.create("T"));
			if (!pnL.isEmpty()) {
				dbInsertEx("MSBHL5050_MST_PAY_NOTE_I01", pnL, pnL_bldr);
			}
		}

		/**
		 * 前渡金実績ＮＯ（支払実績ＮＯ）を発番する。
		 * @param r 上り電文
		 * @return 前渡金実績ＮＯ
		 */
		protected String getAdvPayActNo(AdvPay_Chk01_HdrR r) {
			ElmArgsR argsR = ElmArgsR.create();

			argsR.dpt_cd(r.pay_dpt_cd());
			argsR.co_cd(getCo().co_cd());
			argsR.bp_cd(r.psppl_cd());
			argsR.wg_cd(r.wg_cd());
			argsR.dt(r.ac_dt());

			return getNum(MAC_NUM_BIZ_TYP.PAYACT, argsR);
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			down0().addAll(up0());
		}
	}

	/**
	 * AdvPay_Upd01オペレーション.<p>
	 *
	 * 前渡金実績、支払手形を更新する。<br>
	 */
	public class AdvPay_Upd01 extends MSBHL_AdvPayRegService_MC_A.AdvPay_Upd01 {

		MCList<MST_ADV_PAY_ACT_R> _apaL;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			updAdvPayAct();
			updPayNote();
			callCredServiceUpd02(_apaL);
			callPayActIfCrtServiceIns01(_apaL);
			setDown();
		}
		
		protected void editUp() {
			convDptCd(up0());
		}
		
		/**
		 * 前渡金実績を更新する。
		 */
		protected void updAdvPayAct() {

			MCList<MST_ADV_PAY_ACT_R> insL = MCList.create(MST_ADV_PAY_ACT_R.class);
			MCList<MST_ADV_PAY_ACT_R> updL = MCList.create(MST_ADV_PAY_ACT_R.class);
			_apaL = MCList.create(MST_ADV_PAY_ACT_R.class);
			
			for (AdvPay_Chk01_HdrR r : up0()) {
				
				MST_ADV_PAY_ACT_R srcR = getCacheAdvActPayR(r.adv_pay_act_no(),
						r.adv_pay_act_seq());
				
				// 支払手形のキャッシュ取得時に使用するため、元の前渡金実績連番を保持しておく
				r.bef_adv_pay_act_seq(r.adv_pay_act_seq());

				// 無効伝票
				MST_ADV_PAY_ACT_R disR = srcR.clone();
				editDisAdvPayAct(disR);
				updL.add(disR);

				// 取消伝票
				MST_ADV_PAY_ACT_R canR = srcR.clone();
				editCanAdvPayAct(r, canR, srcR);
				insL.add(canR);
				_apaL.add(canR);

				// 新規伝票
				editCrtAdvPayAct(r, srcR);
				insL.add(r.apa());
				_apaL.add(r.apa());
			}
			
			MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(MST_ADV_PAY_ACT_R.create("T"));
			dbUpdateKey("MSBHL5050_MST_ADV_PAY_ACT_U01", updL, updL_bldr);
			MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_ADV_PAY_ACT_R.create("T"));
			dbInsertEx("MSBHL5050_MST_ADV_PAY_ACT_I02", insL, insL_bldr);
		}
		
		/**
		 * 前渡金実績の新規伝票を編集する。
		 * @param r
		 * @param srcR
		 */
		protected void editCrtAdvPayAct(AdvPay_Chk01_HdrR r, MST_ADV_PAY_ACT_R srcR) {
			r.adv_pay_act_seq(srcR.adv_pay_act_seq().add(2));
			r.adv_pay_act_rev(srcR.adv_pay_act_rev().add(1));
			r.slip_sts_typ(MAC_SLIP_STS_TYP.CRT.value());
			editInsUpdAdvPayAct(r);
		}

		/**
		 * 支払手形を更新する。
		 */
		protected void updPayNote() {

			MCList<MST_PAY_NOTE_R> insL = MCList.create(MST_PAY_NOTE_R.class);
			MCList<MST_PAY_NOTE_R> updL = MCList.create(MST_PAY_NOTE_R.class);

			for (AdvPay_Chk01_HdrR r : up0()) {

				if (isNull(r.note_data_crud_typ())) {
					continue;
				}
				
				if (MAC_DATA_CRUD_TYP.isCRT(r.note_data_crud_typ())) {
					editNewPayNote(r);
					insL.add(r.pn());
				}
				else {
					MST_PAY_NOTE_R srcR = getCachePayNoteR(r.adv_pay_act_no(),
							r.bef_adv_pay_act_seq());
					
					// 無効伝票
					MST_PAY_NOTE_R disR = srcR.clone();
					editDisPayNote(disR);
					updL.add(disR);
					
					// 取消伝票
					MST_PAY_NOTE_R canR = srcR.clone();
					editCanPayNote(r, canR, srcR);
					insL.add(canR);
					
					if (MAC_DATA_CRUD_TYP.isUPD(r.note_data_crud_typ())) {
						// 新規伝票
						editCrtPayNote(r, srcR);
						insL.add(r.pn());
					}
				}
			}
			
			MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(MST_PAY_NOTE_R.create("T"));
			if (!updL.isEmpty()) {
				dbUpdateKey("MSBHL5050_MST_PAY_NOTE_U01", updL, updL_bldr);
			}
			MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_PAY_NOTE_R.create("T"));
			if (!insL.isEmpty()) {
				dbInsertEx("MSBHL5050_MST_PAY_NOTE_I02", insL, insL_bldr);
			}
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			down0().addAll(up0());
		}
	}

	/**
	 * AdvPay_Del01オペレーション.<p>
	 *
	 * 前渡金実績、支払手形を削除する。<br>
	 */
	public class AdvPay_Del01 extends MSBHL_AdvPayRegService_MC_A.AdvPay_Del01 {

		MCList<MST_ADV_PAY_ACT_R> _apaL;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			delAdvPayAct();
			delPayNote();
			callCredServiceUpd02(_apaL);
			callPayActIfCrtServiceIns01(_apaL);
		}
		
		protected void editUp() {
			convDptCd(up0());
		}
		
		/**
		 * 前渡金実績を削除する。
		 */
		protected void delAdvPayAct() {

			MCList<MST_ADV_PAY_ACT_R> insL = MCList.create(MST_ADV_PAY_ACT_R.class);
			MCList<MST_ADV_PAY_ACT_R> updL = MCList.create(MST_ADV_PAY_ACT_R.class);
			_apaL = MCList.create(MST_ADV_PAY_ACT_R.class);
			
			for (AdvPay_Chk01_HdrR r : up0()) {
				
				MST_ADV_PAY_ACT_R srcR = getCacheAdvActPayR(r.adv_pay_act_no(),
						r.adv_pay_act_seq());

				// 支払手形のキャッシュ取得時に使用するため、元の前渡金実績連番を保持しておく
				r.bef_adv_pay_act_seq(r.adv_pay_act_seq());
				// 支払手形の取消が必要かどうか判断するため、テーブルの債務決済方法を保持しておく
				r.ap_sttl_typ(srcR.ap_sttl_typ());
				
				// 無効伝票
				MST_ADV_PAY_ACT_R disR = srcR.clone();
				editDisAdvPayAct(disR);
				updL.add(disR);
				
				// 取消伝票
				MST_ADV_PAY_ACT_R canR = srcR.clone();
				editCanAdvPayAct(r, canR, srcR);
				insL.add(canR);
				_apaL.add(canR);
			}
			
			MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(MST_ADV_PAY_ACT_R.create("T"));
			dbUpdateKey("MSBHL5050_MST_ADV_PAY_ACT_U02", updL, updL_bldr);
			MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_ADV_PAY_ACT_R.create("T"));
			dbInsertEx("MSBHL5050_MST_ADV_PAY_ACT_I03", insL, insL_bldr);
		}
		
		/**
		 * 支払手形を削除する。
		 */
		protected void delPayNote() {

			MCList<MST_PAY_NOTE_R> insL = MCList.create(MST_PAY_NOTE_R.class);
			MCList<MST_PAY_NOTE_R> updL = MCList.create(MST_PAY_NOTE_R.class);

			for (AdvPay_Chk01_HdrR r : up0()) {
				if (!MAC_AP_STTL_TYP.isNOTE(r.ap_sttl_typ())) {
					continue;
				}
				
				MST_PAY_NOTE_R srcR = getCachePayNoteR(r.adv_pay_act_no(), r.bef_adv_pay_act_seq());
				
				// 無効伝票
				MST_PAY_NOTE_R disR = srcR.clone();
				editDisPayNote(disR);
				updL.add(disR);
				
				// 取消伝票
				MST_PAY_NOTE_R canR = srcR.clone();
				editCanPayNote(r, canR, srcR);
				insL.add(canR);
			}
			
			if (!updL.isEmpty()) {
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(MST_PAY_NOTE_R.create("T"));
				dbUpdateKey("MSBHL5050_MST_PAY_NOTE_U02", updL, updL_bldr);
				MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_PAY_NOTE_R.create("T"));
				dbInsertEx("MSBHL5050_MST_PAY_NOTE_I03", insL, insL_bldr);
			}
		}
	}
	
	/**
	 * 部門ＣＤを変換する。
	 */
	protected void convDptCd(MCList<AdvPay_Chk01_HdrR> hdrL) {
		
		MCList<AdvPay_Chk01_HdrR> convL = MCList.create(AdvPay_Chk01_HdrR.class);

		for (AdvPay_Chk01_HdrR r : hdrL) {
			MST_ADV_PAY_ACT_R srcR = getCacheAdvActPayR(r.adv_pay_act_no(), r.adv_pay_act_seq());
			if (!isSame(r.can_ac_dt(), srcR.ac_dt())) {
				AdvPay_Chk01_HdrR convR = r.clone();
				convR.bd_dpt_cd(srcR.bd_dpt_cd());
				convR.bsppl_dpt_cd(srcR.bsppl_dpt_cd());
				convR.pay_dpt_cd(srcR.pay_dpt_cd());
				convR.setStringNE(MAUCL_DptUtil.getCrtColumn(MST_ADV_PAY_ACT_R.$bd_dpt_cd), r.bd_dpt_cd());
				convR.setStringNE(MAUCL_DptUtil.getCrtColumn(MST_ADV_PAY_ACT_R.$bsppl_dpt_cd), r.bsppl_dpt_cd());
				convR.setStringNE(MAUCL_DptUtil.getCrtColumn(MST_ADV_PAY_ACT_R.$pay_dpt_cd), r.pay_dpt_cd());
				convR.setDateNE("dis_ac_dt", srcR.ac_dt());
				convR.slip_sts_typ(MAC_SLIP_STS_TYP.CAN.value());
				convL.add(convR);
			}
		}
		
		if (convL.isEmpty()) {
			return;
		}
		
		String[] hdrKeys = new String[] { MST_ADV_PAY_ACT_R.$pay_dpt_cd, MST_ADV_PAY_ACT_R.$bd_dpt_cd, MST_ADV_PAY_ACT_R.$bsppl_dpt_cd, };
		MAUCL_DptUtil.setCanDpt(convL, hdrKeys, null);
		
		// 変換後の支払部門でＷＧを補完する。
		
		MAM_DPT_R t =MAM_DPT_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		FXUCL_MCDbcCacheStEnd<MAM_DPT_R> cache = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(dbc_bldr, convL, MST_ADV_PAY_ACT_R.$pay_dpt_cd);
		
		for (AdvPay_Chk01_HdrR r : convL) {
			r.wg_cd(cache.get(r.can_ac_dt(), r.pay_dpt_cd()).wg_cd());
		}
		
		// 変換後の部門ＣＤを上り電文に設定する
		String[] dest = {AdvPay_Chk01_HdrR.$conv_pay_dpt_cd, AdvPay_Chk01_HdrR.$conv_bd_dpt_cd, AdvPay_Chk01_HdrR.$conv_bsppl_dpt_cd, AdvPay_Chk01_HdrR.$conv_wg_cd};
		String[] src = {AdvPay_Chk01_HdrR.$pay_dpt_cd, AdvPay_Chk01_HdrR.$bd_dpt_cd, AdvPay_Chk01_HdrR.$bsppl_dpt_cd, AdvPay_Chk01_HdrR.$wg_cd};
		copyByPegNo(hdrL, dest, convL, src);
	}
	
	/**
	 * 前渡金実績の日付・金額項目を編集する。
	 * @param r 上り電文
	 */
	protected void editInsUpdAdvPayAct(AdvPay_Chk01_HdrR r) {
		r.ac_ym(getAcYm(r.ac_dt()));
		r.base_cur_cd(getCo().base_cur_cd());
		r.xrate_cd(getCo().purc_xrate_cd());
		if (isNull(r.trd_cur_com_paid())) {
			r.trd_cur_com_paid(MCNumber.ZERO);
		}
		if (!isNull(r.trd_cur_com_paid())) {
			r.trd_cur_com_paid_tax_amt(MAUCL_AmtUtil.getIncTaxAmt(r.trd_cur_com_paid(),
					r.trd_cur_com_paid_tax_rate(), r.trd_cur_amt_dec_place(),
					getCo().com_paid_tax_rnd_typ()));
			r.trd_cur_exc_com_paid(
					r.trd_cur_com_paid().subtract(r.trd_cur_com_paid_tax_amt()));
		}
		if (MAC_AP_STTL_TYP.isSETOFF(r.com_paid_ap_sttl_typ())) {
			r.trd_cur_setoff_tgt_amt(r.trd_cur_amt().add(r.trd_cur_com_paid()));
		}
		else {
			r.trd_cur_setoff_tgt_amt(r.trd_cur_amt());
		}
		r.trd_cur_setoff_schd_amt(MCNumber.ZERO);
		r.trd_cur_setoff_act_amt(MCNumber.ZERO);
		r.trd_cur_not_proc_bal(r.trd_cur_setoff_tgt_amt());
		r.base_cur_amt(convToBaseCur(r.trd_cur_amt(), r.xrate(),
				getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ()));
		if (!isNull(r.trd_cur_com_paid())) {
			r.base_cur_com_paid(convToBaseCur(r.trd_cur_com_paid(), r.xrate(),
					getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ()));
			r.base_cur_exc_com_paid(convToBaseCur(r.trd_cur_exc_com_paid(), r.xrate(),
					getBaseCur().amt_dec_place(), getCo().xrate_rnd_typ()));
			r.base_cur_com_paid_tax_amt(
					r.base_cur_com_paid().subtract(r.base_cur_exc_com_paid()));
			if (MAC_AP_STTL_TYP.isSETOFF(r.com_paid_ap_sttl_typ())) {
				r.base_cur_setoff_tgt_amt(r.base_cur_amt().add(r.base_cur_com_paid()));
			}
			else {
				r.base_cur_setoff_tgt_amt(r.base_cur_amt());
			}
		}
	}

	/**
	 * 前渡金実績の無効伝票を編集する。
	 * @param srcR
	 */
	protected void editDisAdvPayAct(MST_ADV_PAY_ACT_R srcR) {
		srcR.slip_sts_typ(MAC_SLIP_STS_TYP.DIS.value());
	}
	
	/**
	 * 前渡金実績の取消伝票を編集する。
	 * @param r
	 * @param canR
	 * @param srcR
	 */
	protected void editCanAdvPayAct(AdvPay_Chk01_HdrR r, MST_ADV_PAY_ACT_R canR, MST_ADV_PAY_ACT_R srcR) {

		canR.adv_pay_act_seq(srcR.adv_pay_act_seq().add(1));
		canR.adv_pay_act_rev(srcR.adv_pay_act_rev());

		// 取消伝票の前渡金実績連番を保持しておく（支払手形の取消伝票に設定するため）
		r.can_adv_pay_act_seq(canR.adv_pay_act_seq());
		
		canR.slip_sts_typ(MAC_SLIP_STS_TYP.CAN.value());
		canR.ac_dt(r.can_ac_dt());
		canR.ac_ym(getAcYm(r.can_ac_dt()));
		canR.trd_cur_amt(srcR.trd_cur_amt().negate());
		
		// 部門が変換されている場合は設定する
		if (!isNull(r.conv_bd_dpt_cd())) {
			canR.bd_dpt_cd(r.conv_bd_dpt_cd());
		}
		if (!isNull(r.conv_bsppl_dpt_cd())) {
			canR.bsppl_dpt_cd(r.conv_bsppl_dpt_cd());
		}
		if (!isNull(r.conv_pay_dpt_cd())) {
			canR.pay_dpt_cd(r.conv_pay_dpt_cd());
		}
		if (!isNull(r.conv_wg_cd())) {
			canR.wg_cd(r.conv_wg_cd());
		}
		
		if (!isNull(srcR.trd_cur_com_paid())) {
			canR.trd_cur_com_paid(srcR.trd_cur_com_paid().negate());
		}
		if (!isNull(srcR.trd_cur_com_paid_tax_amt())) {
			canR.trd_cur_com_paid_tax_amt(srcR.trd_cur_com_paid_tax_amt().negate());
		}
		if (!isNull(srcR.trd_cur_exc_com_paid())) {
			canR.trd_cur_exc_com_paid(srcR.trd_cur_exc_com_paid().negate());
		}
		canR.trd_cur_setoff_tgt_amt(srcR.trd_cur_setoff_tgt_amt().negate());
		canR.trd_cur_setoff_schd_amt(srcR.trd_cur_setoff_schd_amt().negate());
		canR.trd_cur_setoff_act_amt(srcR.trd_cur_setoff_act_amt().negate());
		canR.trd_cur_not_proc_bal(srcR.trd_cur_not_proc_bal().negate());
		canR.base_cur_amt(srcR.base_cur_amt().negate());
		if (!isNull(srcR.base_cur_com_paid())) {
			canR.base_cur_com_paid(srcR.base_cur_com_paid().negate());
		}
		if (!isNull(srcR.base_cur_com_paid_tax_amt())) {
			canR.base_cur_com_paid_tax_amt(srcR.base_cur_com_paid_tax_amt().negate());
		}
		if (!isNull(srcR.base_cur_exc_com_paid())) {
			canR.base_cur_exc_com_paid(srcR.base_cur_exc_com_paid().negate());
		}
		canR.base_cur_setoff_tgt_amt(srcR.base_cur_setoff_tgt_amt().negate());
		canR.pay_chk_mng_no(null);
	}

	/**
	 * 支払手形の金額項目を編集する。
	 * @param r
	 */
	protected void editInsUpdPayNote(AdvPay_Chk01_HdrR r) {
		r.note_amt(r.trd_cur_amt());
		r.cur_cd(r.trd_cur_cd());
		r.note_adv_pay_act_no(r.adv_pay_act_no());
		r.note_adv_pay_act_seq(r.adv_pay_act_seq());
	}
	
	/**
	 * 支払手形の新規伝票（新規登録時の伝票）を編集する。
	 */
	protected void editNewPayNote(AdvPay_Chk01_HdrR r) {
		r.pay_note_mng_no(getStrSeq(MSC_NUM_SYS_TYP.PAYNOTEMNG));
		r.pay_note_mng_seq(MCNumber.ONE);
		r.note_slip_sts_typ(MAC_SLIP_STS_TYP.CRT.value());
		editInsUpdPayNote(r);
	}

	/**
	 * 支払手形の無効伝票を編集する。
	 * @param srcR
	 */
	protected void editDisPayNote(MST_PAY_NOTE_R srcR) {
		srcR.slip_sts_typ(MAC_SLIP_STS_TYP.DIS.value());
	}
	
	/**
	 * 支払手形の取消伝票を編集する。
	 * @param r
	 * @param canR
	 * @param srcR
	 */
	protected void editCanPayNote(AdvPay_Chk01_HdrR r, MST_PAY_NOTE_R canR, MST_PAY_NOTE_R srcR) {

		canR.pay_note_mng_seq(srcR.pay_note_mng_seq().add(1));
		canR.adv_pay_act_seq(r.can_adv_pay_act_seq());
		canR.slip_sts_typ(MAC_SLIP_STS_TYP.CAN.value());
		canR.note_amt(srcR.note_amt().negate());
	}
		
	/**
	 * 支払手形の新規伝票（訂正時の伝票）を編集する。
	 */
	protected void editCrtPayNote(AdvPay_Chk01_HdrR r, MST_PAY_NOTE_R srcR) {
		r.pay_note_mng_seq(srcR.pay_note_mng_seq().add(2));
		r.note_slip_sts_typ(MAC_SLIP_STS_TYP.CRT.value());
		editInsUpdPayNote(r);
	}

	/**
	 * 前渡金実績テーブルを元に与信更新サービスを実行する。
	 * @param advPayActL 前渡金実績テーブル
	 */
	protected void callCredServiceUpd02(MCList<MST_ADV_PAY_ACT_R> advPayActL) {

		if (advPayActL.isEmpty()) {
			return;
		}
		
		MCList<Cred_Upd02_CndR> credL = MCList.create(Cred_Upd02_CndR.class);

		for (MST_ADV_PAY_ACT_R advPayActR : advPayActL) {
			Cred_Upd02_CndR credR = Cred_Upd02_CndR.create();
			credR.bsppl_cd(advPayActR.bsppl_cd());
			credR.cur_cd(advPayActR.trd_cur_cd());
			credR.amt(advPayActR.trd_cur_setoff_tgt_amt());
			credL.add(credR);
		}

		MCGroupByPolicy policy = new MCGroupByPolicy(Cred_Upd02_CndR.$bsppl_cd, Cred_Upd02_CndR.$cur_cd);
		policy.sum(Cred_Upd02_CndR.$amt);

		MSBGL_CredService.Cred_Upd02 ope = MSBGL_CredService.crtCred_Upd02();
		ope.up0().addAll(credL.groupBy(policy));
		ope.exec();
	}
		
	/**
	 * 支払実績ＩＦ作成サービスを実行する。
	 */
	protected void callPayActIfCrtServiceIns01(MCList<MST_ADV_PAY_ACT_R> advPayActL) {
			
		MSBHL_PayActIfCrtService.PayActIfCrt_Ins01 ope = MSBHL_PayActIfCrtService.crtPayActIfCrt_Ins01();

		MCList<PayActIfCrt_Ins01_CndR> payActIfL = MCList.create(PayActIfCrt_Ins01_CndR.class);
		for (MST_ADV_PAY_ACT_R advPayActR : advPayActL) {
			PayActIfCrt_Ins01_CndR upR = PayActIfCrt_Ins01_CndR.create();
			upR.adv_pay_act_no(advPayActR.adv_pay_act_no());
			upR.adv_pay_act_seq(advPayActR.adv_pay_act_seq());
			payActIfL.add(upR);
		}

		if (!payActIfL.isEmpty()) {
			ope.up0().addAll(payActIfL);
			ope.exec();
		}
	}

	protected Map_PayActIfCrt_Ins01_CndR_AdvPay_Chk01_HdrR<PayActIfCrt_Ins01_CndR,AdvPay_Chk01_HdrR> createMap_PayActIfCrt_Ins01_CndR_AdvPay_Chk01_HdrR() {
		return new Map_PayActIfCrt_Ins01_CndR_AdvPay_Chk01_HdrR<PayActIfCrt_Ins01_CndR, AdvPay_Chk01_HdrR>();
	}

	public class Map_PayActIfCrt_Ins01_CndR_AdvPay_Chk01_HdrR<D extends PayActIfCrt_Ins01_CndR, S extends AdvPay_Chk01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(PayActIfCrt_Ins01_CndR.$adv_pay_act_no, AdvPay_Chk01_HdrR.$adv_pay_act_no);
			addColumnPathMap(PayActIfCrt_Ins01_CndR.$adv_pay_act_seq, AdvPay_Chk01_HdrR.$adv_pay_act_seq);
		}
	}

	//FMCB CUSTOM END
}