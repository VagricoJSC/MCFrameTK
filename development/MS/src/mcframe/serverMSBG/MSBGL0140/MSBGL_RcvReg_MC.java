package mcframe.serverMSBG.MSBGL0140;

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
import mcframe.serverMSBG.MSBGL0140.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBG.MSBGL0140.Query.*;
import static mcframe.commonCore.container.MCRow.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_Cache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverMSBG.MSBGL5110.*;
import mcframe.serverMSBG.MSBGL5050.*;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBGL_RcvReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBGL_RcvReg_MC extends MSBGL_RcvReg_MC_A{
	//FMCB CUSTOM START
	
	/**
	* 更新前入金情報のキャッシュ
	*/
	protected static final Class<MSBGL_RcvReg> CLAZZ = MSBGL_RcvReg.class;
	protected FXUCL_MCDbcCache<MST_RCV_R> _orgRcvCache = null;

	// チェック処理でキャッシュを初期化する
	protected static void initOrgRcvCache(MST_RCV_R rcvR, MST_RCV_R t,  MCQueryApiBuilder rcvR_bldr) {
		object(CLAZZ)._initOrgRcvCache(rcvR, t, rcvR_bldr);
	}
	
	protected void _initOrgRcvCache(MST_RCV_R rcvR, MST_RCV_R t, MCQueryApiBuilder rcvR_bldr) {
		_orgRcvCache = new FXUCL_MCDbcCache<MST_RCV_R>(rcvR_bldr);
	}
	
	protected static MST_RCV_R getOrgRcvCache(String rcvNo) {
		return object(CLAZZ)._orgRcvCache.get(rcvNo);
	}
	
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 入金を検索する<br>
	 */
	public class Srch01 extends MSBGL_RcvReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			executeQuery(down0(), MSBGL0140_MST_RCV_S01(), up0());
			
			
			if (down0().isEmpty()) {
				return;
			}
			// データ区分が「3:入金登録」以外の場合は、エラー
			if (!MSC_RCV_DAT_TYP.isRCV(down0().dat_typ())) {
				throw new MCAppException(up0(), null, MSBGL0003);
			}			
			// 分割元入金ＮＯがNULL以外の場合は、エラー
			if (!isNull(down0().div_src_rcv_no())) {
				throw new MCAppException(up0(), null, MSBGL0004);
			}
			
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 入金を登録・訂正する前のチェックをする<br>
	 */
	public class Chk01 extends MSBGL_RcvReg_MC_A.Chk01 {
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
			msgL.addAll(chkRcv());
			return msgL;
		}
		
		/**
		 * 入金のロック、更新カウンタチェック
		 * 
		 * @return
		 */
		protected MCMessageList chkRcv() {
			MCMessageList msgL = new MCMessageList();
			
			// 更新の場合のみチェックする。。
			if (isNull(up0().rcv_no())) {
				return msgL;
			}

			MST_RCV_R rcvR = MST_RCV_R.create();
			MST_RCV_R t = MST_RCV_R.create("T");
			MCQueryApiBuilder rcvR_bldr = MCQueryApiBuilder.create(t);
			setOrgRcvCnd(rcvR, t, rcvR_bldr);

			dbSelectKeyForUpdateNoWait("MSBGL0140_MST_RCV_S01", rcvR, rcvR_bldr, up0()); // MST_RCVをロックする
			msgL.addAll(checkUpdCntrNE(up0(), HdrR.$rcv_upd_cntr, rcvR));
			
			if (!isNull(rcvR) && !isNull(rcvR.note_mng_no())) {
				
				MST_NOTE_R noteR = MST_NOTE_R.create();
				
				MST_NOTE_R t1 = MST_NOTE_R.create("T1");
				MCQueryApiBuilder noteR_bldr = MCQueryApiBuilder.create(t1);
				noteR_bldr.setSelect(t1.getKeyColumn$());
				
				dbSelectKeyForUpdateNoWait("MSBGL0140_MST_NOTE_S01", noteR, noteR_bldr, rcvR); // MST_NOTEをロックする
			}

			// 更新前入金情報をキャッシュ
			initOrgRcvCache(rcvR, t, rcvR_bldr);
			return msgL;
		}
		
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<HdrR> notErrL = getChkList(up0());
			if (notErrL.isEmpty()) {
				return msgL;
			}
			
			HdrR notErrR = notErrL.get(0);
			// DACチェック
			msgL.addAll(checkWritableDptCdDac(notErrR, HdrR.$rcv_dpt_cd));
			
			// 更新の場合は変更前のＤＡＣチェックも行う。
			if (!isNull(notErrR.rcv_no())) {
				msgL.addAll(checkWritableDptCdDac(getOrgRcvCache(notErrR.rcv_no()), MST_RCV_R.$rcv_dpt_cd));
			}
			
			msgL.addAll(chkOther(notErrR));
			msgL.addAll(checkSub(notErrR));
			return msgL;
		}
		
		
		/**
		 * 条件付必須チェック
		 * @param hR
		 * @return
		 */
		protected MCMessageList chkReq(HdrR hR) {
			MCMessageList msgL = new MCMessageList();
			// 入金区分が「手形」のとき、必須の手形項目が設定されていない場合、エラー
			if (MAC_AR_STTL_TYP.isNOTE(hR.rcv_typ())) {
				msgL.addAll(check(up0(), HdrR.$note_no, new FXUCL_RequiredValidater()));
				msgL.addAll(check(up0(), HdrR.$note_typ, new FXUCL_RequiredValidater()));
				msgL.addAll(check(up0(), HdrR.$draw_dt, new FXUCL_RequiredValidater()));
				msgL.addAll(check(up0(), HdrR.$due_dt, new FXUCL_RequiredValidater()));
				msgL.addAll(check(up0(), HdrR.$draw_bank_cd, new FXUCL_RequiredValidater()));
				msgL.addAll(check(up0(), HdrR.$drawer_nm, new FXUCL_RequiredValidater()));
				msgL.addAll(check(up0(), HdrR.$draw_branch_cd, new FXUCL_RequiredValidater()));
			}
			
			return msgL;
		}		
		
		/**
		 * 固有チェック
		 * @param hR
		 * @return
		 */
		protected MCMessageList chkOther(HdrR hR) {
			MCMessageList msgL = new MCMessageList();
							
			// 入金情報のステータスチェック
			if (!isNull(up0().rcv_no())) {
				msgL.addAll(chkRcvSts(getOrgRcvCache(up0().rcv_no())));
			}

			// 入金方法チェック
			msgL.addAll(chkRcvMtd(up0()));
			
			// 自動入金消込対象ＦＬＧチェック
			msgL.addAll(chkRcvAutoAppl(up0()));
		
			
			return msgL;
		}
		
		/**
		 * 入金方法チェック<BR>
		 * 
		 * @param hR
		 * @return
		 */
		protected MCMessageList chkRcvMtd(HdrR hR) {
			MCMessageList msgL = new MCMessageList();
			// 入金区分が「現金」「振込」「手形」以外の場合、エラー
			if (!(MAC_AR_STTL_TYP.isBANK(hR.rcv_typ())
					|| MAC_AR_STTL_TYP.isCASH(hR.rcv_typ()) 
					|| MAC_AR_STTL_TYP.isNOTE(hR.rcv_typ()))) {
				msgL.add(new MCMessage(MSBGL0011, hR.rcv_mtd_cd()));
			}
			
			// 入金区分が「現金」「手形」のとき、口座ＣＤか振込人名に入力があった場合、エラー
			if (MAC_AR_STTL_TYP.isCASH(hR.rcv_typ()) 
					|| MAC_AR_STTL_TYP.isNOTE(hR.rcv_typ())) {
				if (!isNull(hR.bank_ac_cd()) || !isNull(hR.xfr_psn())) {
					msgL.add(new MCMessage(MSBGL0012));
				}
			}	
			
			// 入金区分が「振込」のとき、口座ＣＤがNULLの場合、エラー
			if (MAC_AR_STTL_TYP.isBANK(hR.rcv_typ()) && isNull(hR.bank_ac_cd())) {
				msgL.add(new MCMessage(MSBGL0013));
			}
			
			// 入金区分が「手形」以外のとき、手形項目が指定されていた場合、エラー
			if (!MAC_AR_STTL_TYP.isNOTE(hR.rcv_typ())) {
				if (!isNull(hR.note_no())
						|| !isNull(hR.note_typ())
						|| !isNull(hR.draw_dt())
						|| !isNull(hR.due_dt())
						|| !isNull(hR.endrsr())
						|| !isNull(hR.accptr())
						|| !isNull(hR.note_rsn_cd())
						|| !isNull(hR.drawer_nm())
						|| !isNull(hR.draw_bank_cd())
						|| !isNull(hR.draw_branch_cd())
						|| !isNull(hR.note_sub_char1())
						|| !isNull(hR.note_sub_char2())
						|| !isNull(hR.note_sub_char3())) {
					msgL.add(new MCMessage(MSBGL0016));
				}
			}
			
			// 入金区分が「手形」かつ手形区分が「為替手形」のとき、引受人が設定されていない場合、エラー
			if (MAC_AR_STTL_TYP.isNOTE(hR.rcv_typ()) && MAC_NOTE_TYP.isXCHNG(hR.note_typ())) {
				if (isNull(hR.accptr())) {
					msgL.add(new MCMessage(MSBGL0018));
				}
			}
			
			
			return msgL;
		}
		
		/**
		 * 自動入金消込対象ＦＬＧチェック<BR>
		 * 
		 * @param hR
		 * @return
		 */
		protected MCMessageList chkRcvAutoAppl(HdrR hR) {
			MCMessageList msgL = new MCMessageList();
			
			// 入金自動消込ＦＬＧがオンのとき、自動消込基準日が指定されていない場合、エラー
			if (up0().rcv_auto_appl_tgt_flg()) {
				if (isNull(up0().auto_appl_basis_dt())) {
					msgL.add(new MCMessage(MSBGL0015));
				}
			}
			// 入金自動消込ＦＬＧがオフのとき、振込手数料、自動消込基準日が指定されていた場合、エラー
			if (!up0().rcv_auto_appl_tgt_flg()) {
				if (!isNull(up0().com_paid()) || !isNull(up0().auto_appl_basis_dt())) {
					msgL.add(new MCMessage(MSBGL0014));
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
		protected MCMessageList checkSub(HdrR hR) {
			
			MCMessageList msgL = new MCMessageList();
			MCList<HdrR> notErrL = getChkList(up0());

			msgL.addAll(checkDecPlace(notErrL, HdrR.$amt_dec_place, HdrR.$rcv_amt));
			msgL.addAll(checkDecPlace(notErrL, HdrR.$amt_dec_place, HdrR.$com_paid));

			return msgL;
		}
		
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			copyall(down0(), up0());
		}
	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 入金を登録する<br>
	 */
	public class Ins01 extends MSBGL_RcvReg_MC_A.Ins01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// チェック処理
			editUp();
			callThisChk01(up0());
			throwUpdErr();
			
			// 入金情報登録
			MST_RCV_R rcvR = insRcv();
			
			// 手形情報登録
			up0().note_mng_no(rcvR.note_mng_no());
			insNote();
			
			// 下り電文設定
			down0().rcv_no(rcvR.rcv_no());
			down0().dat_typ(rcvR.dat_typ());
			
			// 手形ＩＦ
			ifNote(rcvR, false);
			
			// 印刷
			if (up0().opn_flg()) {
				prnt(rcvR, false);
			}
			
		}
		
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(HdrR.$peg_no, up0());
			
			// Chk01で更新用必須チェックの対応にならないよう新規ステータスにする。
			up0().setStatus(Status.CREATE);
		}
		
		/**
		 * 入金情報登録
		 * 
		 * @return
		 */
		protected MST_RCV_R insRcv() {
			MST_RCV_R rcvR = MST_RCV_R.create();
			MCQueryApiBuilder rcvR_bldr = MCQueryApiBuilder.create(MST_RCV_R.create("T"));
			copy(rcvR, up0(), createMap_MST_RCV_R_HdrR(null));
			dbInsert("MSBGL0140_MST_RCV_I01", rcvR, rcvR_bldr);

			return rcvR;
		}
		
		/**
		 * 手形情報を登録する
		 * 
		 */
		protected void insNote() {
			if (isNoteIns(null, up0())) {
				MST_NOTE_R noteR = MST_NOTE_R.create();
				MCQueryApiBuilder noteR_bldr = MCQueryApiBuilder.create(MST_NOTE_R.create("T"));
				copy(noteR, up0(), createMap_MST_NOTE_R_HdrR());
				dbInsert("MSBGL0140_MST_NOTE_I01", noteR, noteR_bldr);
			}
		}
		
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 入金を訂正する<br>
	 */
	public class Upd01 extends MSBGL_RcvReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// チェック処理
			editUp();
			callThisChk01(up0());
			throwUpdErr();
			
			// 更新前入金情報取得
			MST_RCV_R orgRcvR = getOrgRcvCache(up0().rcv_no());
				
			// 手形ＩＦ（更新前）
			ifNote(orgRcvR, true);
		
			// 入金情報更新
			MST_RCV_R rcvR = updRcv(orgRcvR);
			
			// 手形情報登録
			up0().note_mng_no(rcvR.note_mng_no());
			updNote(orgRcvR);
			
			// 手形ＩＦ
			ifNote(rcvR, false);
			
			// 印刷
			if (up0().opn_flg()) {
				prnt(rcvR, false);
			}				
		}
		
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(HdrR.$peg_no, up0());
		}
		
		/**
		 * 入金情報更新
		 * 
		 * @return
		 */
		protected MST_RCV_R updRcv(MST_RCV_R orgR) {
			MST_RCV_R rcvR = MST_RCV_R.create();
			MCQueryApiBuilder rcvR_bldr = MCQueryApiBuilder.create(MST_RCV_R.create("T"));
			copy(rcvR, up0(), createMap_MST_RCV_R_HdrR(orgR));
			rcvR_bldr.removeSet(MST_RCV_R.$fb_flg, MST_RCV_R.$ext_sys_cd,MST_RCV_R.$ext_rcv_no);
			dbUpdateKey("MSBGL0140_MST_RCV_U01", rcvR, rcvR_bldr);

			return rcvR;
		}
		
		 /** 手形情報を新規追加・更新する
		 * 
		 * @param orgR 更新前の入金情報
		 */
		protected void updNote(MST_RCV_R orgR) {
			// 削除
			if (isNoteDel(orgR, up0())) {
				MST_NOTE_R t = MST_NOTE_R.create("T");

				execDbDeleteKey("MSBGL0140_MST_NOTE_D01", t, orgR);
			}
			else {
				// 手形情報の作成
				MST_NOTE_R noteR = MST_NOTE_R.create();
				copy(noteR, up0(), createMap_MST_NOTE_R_HdrR());
				MCQueryApiBuilder noteR_bldr = MCQueryApiBuilder.create(MST_NOTE_R.create("T"));
				// 新規作成
				if (isNoteIns(orgR, up0())) {
					dbInsert("MSBGL0140_MST_NOTE_I02", noteR, noteR_bldr);
				}
				// 更新
				else if (isNoteUpd(orgR, up0())) {
					dbUpdateKey("MSBGL0140_MST_NOTE_U01", noteR, noteR_bldr);
				}
			}
		}
	}
	
	/**
	 * チェック処理を実行する
	 */
	protected void callThisChk01(HdrR hR) {
		MSBGL_RcvReg.Chk01 ope = MSBGL_RcvReg.crtChk01();
		copyall(ope.up0(), hR);
		ope.exec();
		copyall(hR, ope.down0());
	}
	
	/**
	 * 手形ＩＦ処理を実行する
	 * 
	 * @param rcvR ＩＦする入金ＩＤを含むコンテナ
	 * @param isDel 削除時にtrueを設定する
	 */
	protected void ifNote(MST_RCV_R rcvR, boolean isDel) {
		
		if (isNull(rcvR.note_mng_no())) {
			return;
		}
		
		MSBGL_NoteIfService.NoteIf_Ins01 ope = MSBGL_NoteIfService.crtNoteIf_Ins01();
		NoteIf_Ins01_CndR noteR = NoteIf_Ins01_CndR.create();

		noteR.note_mng_no(rcvR.note_mng_no());
		noteR.del_flg(isDel);
		ope.up0().add(noteR);
		ope.exec();
	}

	/**
	 * 入金管理票を印刷する
	 * 
	 * @param r 印刷する入金ＩＤ（rcv_id）を含むコンテナ
	 * @param isDel 削除の場合true、発行済ＦＬＧがＯＮであれば発行する。
	 */
	protected void prnt(MCRow r, boolean isDel) {
		
		MSBGL_ArSlipPrntService.ArSlip_Prnt02 ope = MSBGL_ArSlipPrntService.crtArSlip_Prnt02();
		ArSlip_Prnt02_HdrR arSlipR = ArSlip_Prnt02_HdrR.create();

		arSlipR.rcv_no(r.getString("rcv_no"));
		arSlipR.del_flg(isDel);
		ope.up0().add(arSlipR);
		ope.exec();	
		
	
	}
	
	/**
	 * 手形の新規作成かどうかを判断する
	 * 
	 * @param orgR 変更前の情報
	 * @param newR 変更後の情報
	 * @return 手形の新規作成の場合にtrue
	 */
	protected boolean isNoteIns(MST_RCV_R orgR, HdrR newR) {
		// 変更前が手形でなく、変更後に手形の場合
		if ((isNull(orgR) || !MAC_AR_STTL_TYP.isNOTE(orgR.rcv_typ()))
				&& MAC_AR_STTL_TYP.isNOTE(newR.rcv_typ())) {
			return true;
		}
		return false;
	}
	
	/**
	 * 手形の更新かどうかを判断する
	 * 
	 * @param orgR 変更前の情報
	 * @param newR 変更後の情報
	 * @return 手形の新規作成の場合にtrue
	 */
	protected boolean isNoteUpd(MST_RCV_R orgR, HdrR newR) {
		if (isNull(orgR)) {
			return false;
		}
		// 変更前が手形で、変更後も手形の場合
		if (MAC_AR_STTL_TYP.isNOTE(orgR.rcv_typ()) && MAC_AR_STTL_TYP.isNOTE(newR.rcv_typ())) {
			return true;
		}
		return false;
	}
	
	/**
	 * 手形の削除かどうかを判断する
	 * 
	 * @param orgR 変更前の情報
	 * @param newR 変更後の情報
	 * @return 手形の削除の場合にtrue
	 */
	protected boolean isNoteDel(MST_RCV_R orgR, HdrR newR) {	
		if (isNull(orgR)) {
			return false;
		}
		// 変更前が手形で、変更後に手形でない場合
		if (MAC_AR_STTL_TYP.isNOTE(orgR.rcv_typ()) && !MAC_AR_STTL_TYP.isNOTE(newR.rcv_typ())) {
			return true;
		}
		return false;
	}

	
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 入金を取り消す前のチェックをする<br>
	 */
	public class Chk02 extends MSBGL_RcvReg_MC_A.Chk02 {
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
			msgL.addAll(chkRcv());
			
			return msgL;
		}
		
		/**
		 * 入金のロック、更新カウンタチェック
		 * 
		 * @return
		 */
		protected MCMessageList chkRcv() {
			MCMessageList msgL = new MCMessageList();
			
			// 更新の場合のみチェックする。。
			if (isNull(up0().rcv_no())) {
				return msgL;
			}

			MST_RCV_R rcvR = MST_RCV_R.create();
			MST_RCV_R t = MST_RCV_R.create("T");
			MCQueryApiBuilder rcvR_bldr = MCQueryApiBuilder.create(t);
			setOrgRcvCnd(rcvR, t, rcvR_bldr);

			dbSelectKeyForUpdateNoWait("MSBGL0140_MST_RCV_S02", rcvR, rcvR_bldr, up0()); // MST_RCVをロックする
			msgL.addAll(checkUpdCntrNE(up0(), HdrR.$rcv_upd_cntr, rcvR));
			
			if (!isNull(rcvR) && !isNull(rcvR.note_mng_no())) {
				
				MST_NOTE_R noteR = MST_NOTE_R.create();
				
				MST_NOTE_R t1 = MST_NOTE_R.create("T1");
				MCQueryApiBuilder noteR_bldr = MCQueryApiBuilder.create(t1);
				noteR_bldr.setSelect(t1.getKeyColumn$());
				
				dbSelectKeyForUpdateNoWait("MSBGL0140_MST_NOTE_S02", noteR, noteR_bldr, rcvR); // MST_NOTEをロックする
			}
			
			// 更新前入金情報をキャッシュ
			initOrgRcvCache(rcvR, t, rcvR_bldr);
			
			return msgL;
		}
		
		
		@Override
		protected MCMessageList doServerCheckSub() {
			
			MCMessageList msgL = super.doServerCheckSub();
			
			MCList<Chk02_HdrR> notErrL = getChkList(up0());
			if (notErrL.isEmpty()) {
				return msgL;
			}
			
			Chk02_HdrR notErrR = notErrL.get(0);
			// DACチェック
			msgL.addAll(checkWritableDptCdDac(notErrR, MST_RCV_R.$rcv_dpt_cd));
			
			if (!isNull(notErrR.rcv_no())) {
				msgL.addAll(checkWritableDptCdDac(getOrgRcvCache(notErrR.rcv_no()), MST_RCV_R.$rcv_dpt_cd));
			}
					
			msgL.addAll(chkOther(notErrR));
			
			return msgL;
		}
		
		/**
		 * 固有チェック
		 * @param hR
		 * @return
		 */
		protected MCMessageList chkOther(Chk02_HdrR hR) {
			MCMessageList msgL = new MCMessageList();
						
			// 入金情報のステータスチェック
			msgL.addAll(chkRcvSts(getOrgRcvCache(hR.rcv_no())));

			return msgL;
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			copyall(down0(), up0());
		}
		
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 入金を取り消す<br>
	 */
	public class Del01 extends MSBGL_RcvReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// チェック処理
			editUp();
			callThisChk02(up0());
			throwCanErr();
			
			// 更新前入金情報取得
			MST_RCV_R orgRcvR = getOrgRcvCache(up0().rcv_no());
				
			// 手形ＩＦ（更新前）
			ifNote(orgRcvR, true);
		
			// 印刷
			
			if(up0().prnt_flg() == true){
				prnt(up0(), true);
			}
			
			
			// 入金情報削除
			delRcv(orgRcvR);
			
			// 手形情報削除
			delNote(orgRcvR);
			
		}
		
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(HdrR.$peg_no, up0());
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk02(Chk02_HdrR hR) {
			MSBGL_RcvReg.Chk02 ope = MSBGL_RcvReg.crtChk02();
			copyall(ope.up0(), hR);
			ope.exec();
			copyall(hR, ope.down0());
		}
		
		/**
		 * 入金情報削除
		 * 
		 * @return
		 */
		protected void delRcv(MST_RCV_R orgR) {
			MST_RCV_R t = MST_RCV_R.create("T");

			execDbDeleteKey("MSBGL0140_MST_RCV_D01", t, orgR);
		}
		
		/**
		 * 手形情報削除
		 * 
		 * @return
		 */
		protected void delNote(MST_RCV_R orgR) {

			if (!MAC_AR_STTL_TYP.isNOTE(orgR.rcv_typ())) {
				return;
			}
			MST_NOTE_R t = MST_NOTE_R.create("T");

			execDbDeleteKey("MSBGL0140_MST_NOTE_D02", t, orgR);
		}
	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 入金管理票を印刷する<br>
	 */
	public class Prnt01 extends MSBGL_RcvReg_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
	
			prnt(up0(), false);
	
		}
	}
	
	/**
	 * 入金情報取得のための条件を設定する
	 * 
	 * @param rcvR 設定対象のDBC
	 */
	protected void setOrgRcvCnd(MST_RCV_R rcvR, MST_RCV_R t, MCQueryApiBuilder rcvR_bldr) {
		MST_NOTE_R note1 = MST_NOTE_R.create("NOTE1");

		rcvR_bldr.setSelect(t.rcv_no);
		rcvR_bldr.addSelect(t.seq_no);
		rcvR_bldr.addSelect(t.rcv_dpt_cd);
		rcvR_bldr.addSelect(t.rcv_typ);
		rcvR_bldr.addSelect(t.rcv_proc_amt);
		rcvR_bldr.addSelect(t.prnt_flg);
		rcvR_bldr.addSelect(t.upd_cntr);
		rcvR_bldr.addSelect(note1.note_no);
		rcvR_bldr.addSelect(note1.note_mng_no);
		rcvR_bldr.addLeftOuterJoin(note1, note1.note_mng_no.eq(t.note_mng_no));
		rcvR_bldr.setLockTable(t.rcv_no);

		rcvR_bldr.setOrderByAsc(t.rcv_no);
	}
	
	/**
	 * 入金情報のステータスチェック<BR>
	 * 
	 * @param hR
	 * @return
	 */
	protected MCMessageList chkRcvSts(MST_RCV_R rcvR) {
		MCMessageList msgL = new MCMessageList();
		
		if (isNull(rcvR)) {
			return msgL;
		}
		
		if (rcvR.div_flg()) {
			msgL.add(new MCMessage(MSBGL0007));
		}
		else if (rcvR.rcv_proc_amt().isPositive()) {
			msgL.add(new MCMessage(MSBGL0051));
		}

		return msgL;
	}
	
	// Mapper
	protected Map_MST_RCV_R_HdrR<MST_RCV_R,HdrR> createMap_MST_RCV_R_HdrR(MST_RCV_R orgRcvR) {
		return new Map_MST_RCV_R_HdrR<MST_RCV_R, HdrR>(orgRcvR);
	}

	public class Map_MST_RCV_R_HdrR<D extends MST_RCV_R, S extends HdrR> extends MCRowMapper<D,S>{
		
		protected MST_RCV_R _orgRcvR;
		
		public Map_MST_RCV_R_HdrR(MST_RCV_R orgRcvR) {
			_orgRcvR = orgRcvR;
		}
		
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_RCV_R.$rcst_cd, HdrR.$rcst_cd);
			addColumnPathMap(MST_RCV_R.$bcst_cd, HdrR.$bcst_cd);
			addColumnPathMap(MST_RCV_R.$bill_dpt_cd, HdrR.$bill_dpt_cd);
			addColumnPathMap(MST_RCV_R.$rcv_dpt_cd, HdrR.$rcv_dpt_cd);
			addColumnPathMap(MST_RCV_R.$wg_cd, HdrR.$wg_cd);
			addColumnPathMap(MST_RCV_R.$rcv_usr_cd, HdrR.$rcv_usr_cd);
			addColumnPathMap(MST_RCV_R.$rcv_dt, HdrR.$rcv_dt);
			addColumnPathMap(MST_RCV_R.$rcv_mtd_cd, HdrR.$rcv_mtd_cd);
			addColumnPathMap(MST_RCV_R.$rcv_typ, HdrR.$rcv_typ);
			addColumnPathMap(MST_RCV_R.$bank_ac_cd, HdrR.$bank_ac_cd);
			addColumnPathMap(MST_RCV_R.$xfr_psn, HdrR.$xfr_psn);
			addColumnPathMap(MST_RCV_R.$trd_cur_cd, HdrR.$trd_cur_cd);
			addColumnPathMap(MST_RCV_R.$xrate, HdrR.$xrate);
			addColumnPathMap(MST_RCV_R.$rcv_rmrks, HdrR.$rcv_rmrks);
			addColumnPathMap(MST_RCV_R.$rcv_amt, HdrR.$rcv_amt);
			addColumnPathMap(MST_RCV_R.$com_paid, HdrR.$com_paid);
			addColumnPathMap(MST_RCV_R.$auto_appl_basis_dt, HdrR.$auto_appl_basis_dt);
			addColumnPathMap(MST_RCV_R.$rcv_auto_appl_tgt_flg, HdrR.$rcv_auto_appl_tgt_flg);
			addColumnPathMap(MST_RCV_R.$sub_char1, HdrR.$rcv_sub_char1);
			addColumnPathMap(MST_RCV_R.$sub_char2, HdrR.$rcv_sub_char2);
			addColumnPathMap(MST_RCV_R.$sub_char3, HdrR.$rcv_sub_char3);
		}
		
		@Override
		public void valueCopy(D dest, S src) {
			dest.rcv_no(getRcvNo(_orgRcvR, src));
			dest.note_mng_no(getNoteMngNo(_orgRcvR, src));
			dest.dat_typ(MSC_RCV_DAT_TYP.RCV.value());
			dest.base_cur_cd(getCo().base_cur_cd());
			dest.xrate_cd(getCo().sls_xrate_cd());
			dest.rcv_proc_amt(MCNumber.ZERO);
			dest.not_proc_bal(src.rcv_amt());
			dest.bill_setoff_amt(MCNumber.ZERO);
			if (src.rcv_auto_appl_tgt_flg()) {
				dest.auto_appl_sts_typ(MSC_AUTO_APPL_STS_TYP.NOT_EXE.value());
			}
			else {
				dest.auto_appl_sts_typ(MSC_AUTO_APPL_STS_TYP.EXCLD.value());
			}
			dest.prnt_flg(src.opn_flg());
			dest.seq_no(getSeqNo(_orgRcvR));
		}
	}
	
	// Mapper
	protected Map_MST_NOTE_R_HdrR<MST_NOTE_R,HdrR> createMap_MST_NOTE_R_HdrR() {
		return new Map_MST_NOTE_R_HdrR<MST_NOTE_R, HdrR>();
	}

	public class Map_MST_NOTE_R_HdrR<D extends MST_NOTE_R, S extends HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_NOTE_R.$note_mng_no, HdrR.$note_mng_no);
			addColumnPathMap(MST_NOTE_R.$note_no, HdrR.$note_no);
			addColumnPathMap(MST_NOTE_R.$note_typ, HdrR.$note_typ);
			addColumnPathMap(MST_NOTE_R.$draw_dt, HdrR.$draw_dt);
			addColumnPathMap(MST_NOTE_R.$due_dt, HdrR.$due_dt);
			addColumnPathMap(MST_NOTE_R.$drawer_nm, HdrR.$drawer_nm);
			addColumnPathMap(MST_NOTE_R.$draw_bank_cd, HdrR.$draw_bank_cd);
			addColumnPathMap(MST_NOTE_R.$draw_branch_cd, HdrR.$draw_branch_cd);
			addColumnPathMap(MST_NOTE_R.$endrsr, HdrR.$endrsr);
			addColumnPathMap(MST_NOTE_R.$accptr, HdrR.$accptr);
			addColumnPathMap(MST_NOTE_R.$note_rsn_cd, HdrR.$note_rsn_cd);
			addColumnPathMap(MST_NOTE_R.$sub_char1, HdrR.$note_sub_char1);
			addColumnPathMap(MST_NOTE_R.$sub_char2, HdrR.$note_sub_char2);
			addColumnPathMap(MST_NOTE_R.$sub_char3, HdrR.$note_sub_char3);

		}
		
		@Override
		public void valueCopy(D dest, S src) {

			dest.note_amt(src.rcv_amt());
			dest.appl_amt(MCNumber.ZERO);
			dest.not_appl_bal(src.rcv_amt());
			dest.susp_amt(MCNumber.ZERO);
			dest.adv_amt(MCNumber.ZERO);
			dest.mat_flg(isMat(src));
		}
		
		/**
		 * 決済済みかどうかを判断する
		 * 
		 * @param src コピー元
		 * @return 決済済みの場合にtrue
		 */
		protected boolean isMat(S src) {
			if (isNull(src.due_dt())) {
				return false;
			}
			// 支払期日が到来している（支払期日 <= 本日）場合は決済済みとする
			return src.due_dt().lte(getToday());
		}
	}
	
	/**
	 * 入金Ｎｏを取得する
	 * @param orgR
	 * @param dptCd
	 * @return
	 */
	protected String getRcvNo(MST_RCV_R orgR, HdrR hR) {
		if (isNull(orgR)) {
			ElmArgsR args = ElmArgsR.create();
			args.co_cd(getCo().co_cd());
			
			args.bp_cd(hR.rcst_cd());
			args.dpt_cd(hR.rcv_dpt_cd());
			args.wg_cd(hR.wg_cd());
			args.dt(hR.rcv_dt());
			
			return getNum(MAC_NUM_BIZ_TYP.RCV, args);
		}
		else {
			return orgR.rcv_no();
		}
	}
	
	/**
	 * 手形管理Ｎｏを取得する
	 * @param orgR
	 * @param hR
	 * @return
	 */
	protected String getNoteMngNo(MST_RCV_R orgR, HdrR hR) {
		if (isNoteIns(orgR, hR)) {
			return getStrSeq(MSC_NUM_SYS_TYP.NOTEMNG);			
		}
		else if (isNoteUpd(orgR, hR)) {
			return orgR.note_mng_no();
		}
		else {
			return null;
		}
	}
	
	/**
	 * シーケンスＮｏを取得する
	 * 
	 * @param orgR 更新前の入金情報
	 * @return シーケンスＮｏ
	 */
	protected MCNumber getSeqNo(MST_RCV_R orgR) {
		// 手形ＩＦ時に削除データは元のseq_noに＋１したデータを渡すため、更新時のseq_noは＋２とする
		if (isNull(orgR)) {
			return MCNumber.ONE;
		}
		else {
			return orgR.seq_no().add(2);
		}
	}

	//FMCB CUSTOM END
}