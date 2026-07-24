package mcframe.serverMSBG.MSBGL5180;

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
import mcframe.serverMSBG.MSBGL5180.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBG.MSBGL5110.MSBGL_NoteIfService;
import mcframe.serverMSBG.MSBGL5110.NoteIf_Ins01_CndR;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBGL_RcvRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBGL_RcvRegService_MC extends MSBGL_RcvRegService_MC_A{
	//FMCB CUSTOM START
	
	//入金情報
	protected MCList<MST_RCV_R> _rcvL;
	protected MST_RCV_R _t;
	protected MCQueryApiBuilder _rcvL_bldr;
	
	protected MCIndexKey _idxKey = null;
	
	/**
	 * Rcv_Chk01オペレーション.<p>
	 * 入金を登録・訂正する前のチェックをする<br>
	 */
	public class Rcv_Chk01 extends MSBGL_RcvRegService_MC_A.Rcv_Chk01 {
		
		/**
		 * 決済方法マスタのキャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_STTL_R> _sttlCache = null;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			createCacheForUpd(up0());
			chkOther();
			setDown();
		}
		
		/**
		 * 固有チェック
		 * @return
		 */
		protected void chkOther() {
			crtSttlCache(up0());
			
			for (Chk01_HdrR r : up0()) {
				// 入金情報のステータスチェック
				if (!isNull(r.rcv_no())) {
					chkRcvSts(getRcvCache(r.rcv_no()), r);
				}
				
				// 入金方法チェック
				chkRcvMtd(r);
				
				// 自動入金消込対象ＦＬＧチェック
				chkRcvAutoAppl(r);
				
				//為替レートチェック
				chkXrate(r);
			}
		}
		
		/**
		 * 入金情報のステータスチェック<BR>
		 * @param rcvR
		 * @param r
		 */
		protected void chkRcvSts(MST_RCV_R rcvR, Chk01_HdrR r) {
			MCMessageList msgL = new MCMessageList();
			
			if (isNull(rcvR)) {
				return;
			}
			
			if (rcvR.div_flg()) {
				r.err_flg(true);
				msgL.add(new MCMessage(r, null, MSBGL0007));
			}
			else if (rcvR.rcv_proc_amt().isPositive()) {
				r.err_flg(true);
				msgL.add(new MCMessage(r, null, MSBGL0051));
			}
			MCMessagePool.addAll(msgL);
		}
		
		/**
		 * 入金方法チェック<BR>
		 * @param r
		 * @return
		 */
		protected void chkRcvMtd(Chk01_HdrR r) {
			MCMessageList msgL = new MCMessageList();
			
			r.rcv_typ((getSttl(r).ar_sttl_typ()));
			
			// 債権決済区分が「現金」「振込」「手形」以外のときはエラー
			if (!(MAC_AR_STTL_TYP.isCASH(r.rcv_typ())
					|| MAC_AR_STTL_TYP.isBANK(r.rcv_typ()) 
					|| MAC_AR_STTL_TYP.isNOTE(r.rcv_typ()))) {
				r.err_flg(true);
				msgL.add(new MCMessage(r, Chk01_HdrR.$rcv_mtd_cd, MSBGL0301, r.rcv_mtd_cd()));
			}
			
			// 債権決済区分が「現金」「手形」のとき、口座ＣＤか振込人名に入力があればエラー
			if (MAC_AR_STTL_TYP.isCASH(r.rcv_typ())
					|| MAC_AR_STTL_TYP.isNOTE(r.rcv_typ())) {
				if (!isNull(r.bank_ac_cd()) || !isNull(r.xfr_psn())) {
					r.err_flg(true);
					msgL.add(new MCMessage(r, null, MSBGL0302));
				}
			}	
			
			// 債権決済区分が「振込」のとき、口座ＣＤがNULLであればエラー
			if (MAC_AR_STTL_TYP.isBANK(r.rcv_typ()) && isNull(r.bank_ac_cd())) {
				r.err_flg(true);
				msgL.add(new MCMessage(r, Chk01_HdrR.$bank_ac_cd, MSBGL0303));
			}
			
			// 債権決済区分が「手形」以外のとき、手形項目が指定されていればエラー
			if (!MAC_AR_STTL_TYP.isNOTE(r.rcv_typ())) {
				if (!isNull(r.note_no())
						|| !isNull(r.note_typ())
						|| !isNull(r.draw_dt())
						|| !isNull(r.due_dt())
						|| !isNull(r.endrsr())
						|| !isNull(r.accptr())
						|| !isNull(r.note_rsn_cd())
						|| !isNull(r.drawer_nm())
						|| !isNull(r.draw_bank_cd())
						|| !isNull(r.draw_branch_cd())
						|| !isNull(r.note_sub_char1())
						|| !isNull(r.note_sub_char2())
						|| !isNull(r.note_sub_char3())) {
					r.err_flg(true);
					msgL.add(new MCMessage(r, null, MSBGL0304));
				}
			}
			
			// 債権決済区分が「手形」のとき、必須の手形項目が設定されていなければエラー
			if (MAC_AR_STTL_TYP.isNOTE(r.rcv_typ())) {
				MCMessageList msg = new MCMessageList();
				msg.addAll(check(r, Chk01_HdrR.$note_no, new FXUCL_RequiredValidater()));
				msg.addAll(check(r, Chk01_HdrR.$note_typ, new FXUCL_RequiredValidater()));
				msg.addAll(check(r, Chk01_HdrR.$draw_dt, new FXUCL_RequiredValidater()));
				msg.addAll(check(r, Chk01_HdrR.$due_dt, new FXUCL_RequiredValidater()));
				msg.addAll(check(r, Chk01_HdrR.$draw_bank_cd, new FXUCL_RequiredValidater()));
				msg.addAll(check(r, Chk01_HdrR.$drawer_nm, new FXUCL_RequiredValidater()));
				msg.addAll(check(r, Chk01_HdrR.$draw_branch_cd, new FXUCL_RequiredValidater()));
				if (!msg.isEmpty()) {
					r.err_flg(true);
					msgL.addAll(msg);
				}
			}
			
			// 債権決済区分が「手形」かつ手形区分が「為替手形」のとき、引受人が設定されていなければエラー
			if (MAC_AR_STTL_TYP.isNOTE(r.rcv_typ()) && MAC_NOTE_TYP.isXCHNG(r.note_typ())) {
				if (isNull(r.accptr())) {
					r.err_flg(true);
					msgL.add(new MCMessage(r, Chk01_HdrR.$accptr, MSBGL0305));
				}
			}
			MCMessagePool.addAll(msgL);
		}
		
		/**
		 * 自動入金消込対象ＦＬＧチェック<BR>
		 * @param r
		 * @return
		 */
		protected void chkRcvAutoAppl(Chk01_HdrR r) {
			MCMessageList msgL = new MCMessageList();
			
			// 入金自動消込ＦＬＧがオンのとき、自動消込基準日が指定されていなければエラー
			if (r.rcv_auto_appl_tgt_flg()) {
				if (isNull(r.auto_appl_basis_dt())) {
					r.err_flg(true);
					msgL.add(new MCMessage(r, Chk01_HdrR.$auto_appl_basis_dt, MSBGL0015));
				}
			}
			// 入金自動消込ＦＬＧがオフのとき、振込手数料、自動消込基準日が指定されていればエラー
			if (!r.rcv_auto_appl_tgt_flg()) {
				if (!isNull(r.com_paid()) || !isNull(r.auto_appl_basis_dt())) {
					r.err_flg(true);
					msgL.add(new MCMessage(r, null, MSBGL0014));
				}
			}
			MCMessagePool.addAll(msgL);
		}
		
		/**
		 * 為替レートチェック
		 * @param r
		 * @return
		 */
		protected void chkXrate(Chk01_HdrR r) {
			MCMessageList msgL = new MCMessageList();
			
			if (isSame(r.trd_cur_cd(), getCo().base_cur_cd()) && !isNull(r.xrate()) && !MCNumber.ONE.eq(r.xrate())) {
				r.err_flg(true);
				msgL.add(new MCMessage(r, Chk01_HdrR.$xrate, MSBGL0300, r.xrate())); 
			}	
			MCMessagePool.addAll(msgL);
		}
		
		/**
		 * 更新前入金情報のキャッシュ
		 * @return
		 */
		protected void createCacheForUpd(MCList<Chk01_HdrR> mcList) {
			_rcvL = MCList.create(MST_RCV_R.class);
			_t = MST_RCV_R.create("T");
			_rcvL_bldr = MCQueryApiBuilder.create(_t);
			dbSelectKey("MSBGL5180_MST_RCV_S01",
					_rcvL, _rcvL_bldr, mcList.subList(r -> !isNull(r.rcv_no())));
			_idxKey = _rcvL.createIndex(MST_RCV_R.$rcv_no);
		}
		
		protected MST_RCV_R getRcvCache(String rcv_no) {
			return _rcvL.getFirst(_idxKey, rcv_no);
		}
		
		/**
		 * 決済方法マスタのキャッシュを作成する。
		 * @param _noErrL 
		 */
		protected void crtSttlCache(MCList<Chk01_HdrR> up0) {
			MAM_STTL_R t = MAM_STTL_R.create("T");
			MCQueryApiBuilder sttlL_bldr = MCQueryApiBuilder.create(t);
			_sttlCache = new FXUCL_MCDbcCache<MAM_STTL_R>(
				sttlL_bldr, 
				up0, 
				Chk01_HdrR.$rcv_mtd_cd
			);
		}
		
		/**
		 * キャッシュから決済方法マスタを取得する。
		 * @return 債権決済区分
		 */
		protected MAM_STTL_R getSttl(Chk01_HdrR r) {
			return _sttlCache.get(r.rcv_mtd_cd());
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().addAll(up0());
		}
	}
	
	/**
	 * Rcv_Ins01オペレーション.<p>
	 * 入金を登録する<br>
	 */
	public class Rcv_Ins01 extends MSBGL_RcvRegService_MC_A.Rcv_Ins01 {
		
		MCList<Chk01_HdrR> _notErrL;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			// チェック処理
			setNotErr();
			
			// 入金情報登録
			MCList<MST_RCV_R> rcvL = insRcv();
			
			// 手形情報登録
			insNote();
			
			// 下り電文設定
			setDown();
			
			// 手形ＩＦ
			ifNote(rcvL, false);
		}
		
		/**
		 * エラーＦＬＧがオフの行をセットする
		 * @return 
		 */
		protected void setNotErr() {
			_notErrL = getChkList(up0());
		}
		
		/**
		 * 入金情報登録
		 * @return
		 */
		protected MCList<MST_RCV_R> insRcv() {
			MCList<MST_RCV_R> rcvL = MCList.create(MST_RCV_R.class);
			setRcvNo();
			setNoteMngNo();

			for (Chk01_HdrR r : _notErrL) {
				MST_RCV_R rcvR = MST_RCV_R.create();
				copy(rcvR, r, createMap_MST_RCV_R_Chk01_HdrR(null));
				r.note_mng_no(rcvR.note_mng_no());
				rcvL.add(rcvR);
			}
			MCQueryApiBuilder rcvL_bldr = MCQueryApiBuilder.create(MST_RCV_R.create("T"));
			dbInsert("MSBGL5180_MST_RCV_I01", rcvL, rcvL_bldr);
			return rcvL;
		}
		
		/**
		 * 手形情報を登録する
		 */
		protected void insNote() {
			MCList<MST_NOTE_R> noteL = MCList.create(MST_NOTE_R.class);
			for (Chk01_HdrR r : _notErrL) {
				if (isNoteIns(null, r)) {
					MST_NOTE_R noteR = MST_NOTE_R.create();
					copy(noteR, r, createMap_MST_NOTE_R_Chk01_HdrR());
					noteL.add(noteR);
				}
			}
			MCQueryApiBuilder noteL_bldr = MCQueryApiBuilder.create(MST_NOTE_R.create("T"));
			dbInsert("MSBGL5180_MST_NOTE_I01", noteL, noteL_bldr);
		}
		
		/**
		 * 入金ＮＯを発番・設定する
		 */
		protected void setRcvNo() {
			MCList<ElmArgsR> argL = MCList.create(ElmArgsR.create());
			for (Chk01_HdrR r : _notErrL) {
				ElmArgsR arg = ElmArgsR.create();
				arg.peg_no(r.peg_no());
				arg.dpt_cd(r.rcv_dpt_cd());
				arg.co_cd(getCo().co_cd());
				arg.bp_cd(r.rcst_cd());
				arg.wg_cd(r.wg_cd());
				arg.dt(nvl(r.rcv_dt(), getToday()));
				argL.add(arg);
			}
			if (!argL.isEmpty()) {
				setNum(MAC_NUM_BIZ_TYP.RCV, argL);
				String[] srcCols = {ElmArgsR.$new_no};
				String[] destCols = {MST_RCV_R.$rcv_no};
				copyByPegNo(_notErrL, destCols, argL, srcCols);
			}
		}
		
		/**
		 * 手形管理ＮＯを発番する
		 */
		protected void setNoteMngNo() {
			int cacheSize = 0;
			for (Chk01_HdrR r : _notErrL) {
				if (MAC_AR_STTL_TYP.isNOTE(r.rcv_typ())) {
					cacheSize++;
				}
			}
			doSeqCache(MSC_NUM_SYS_TYP.NOTEMNG, cacheSize);
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().addAll(up0());
		}
	}
	
	/**
	 * Rcv_Upd01オペレーション.<p>
	 * 入金を訂正する<br>
	 */
	public class Rcv_Upd01 extends MSBGL_RcvRegService_MC_A.Rcv_Upd01 {
		
		MCList<Chk01_HdrR> _noErrL;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			// チェック処理
			setNotErr();
			createCacheForUpd(_noErrL);
			
			// 手形ＩＦ（更新前）
			MCList<MST_RCV_R> rcvL = getUpdRcv();
			ifNote(rcvL, true);
			
			// 入金情報更新
			rcvL = updRcv();
			
			// 手形情報登録
			updNote();
			
			// 手形ＩＦ
			ifNote(rcvL, false);
		}
		
		/**
		 * エラーＦＬＧがオフの行をセットする
		 * @return 
		 */
		protected void setNotErr() {
			_noErrL = getChkList(up0());
		}
		
		protected MCList<MST_RCV_R> getUpdRcv() {
			MCList<MST_RCV_R> rcvL = MCList.create(MST_RCV_R.class);
			for (Chk01_HdrR r : _noErrL) {
				MST_RCV_R rcvR = getRcvCache(r.rcv_no());
				rcvL.add(rcvR);
			}
			return rcvL;
		}
		
		protected MST_RCV_R getRcvCache(String rcv_no) {
			return _rcvL.getFirst(_idxKey, rcv_no);
		}
		
		/**
		 * 入金情報更新
		 * @return
		 */
		protected MCList<MST_RCV_R> updRcv() {
			MCList<MST_RCV_R> rcvL = MCList.create(MST_RCV_R.class);
			setNoteMngNo();
			for (Chk01_HdrR r : _noErrL) {
				MST_RCV_R orgR = getRcvCache(r.rcv_no());
				MST_RCV_R rcvR = MST_RCV_R.create();
				copy(rcvR, r, createMap_MST_RCV_R_Chk01_HdrR(orgR));
				r.note_mng_no(rcvR.note_mng_no());
				rcvL.add(rcvR);
			}
			MCQueryApiBuilder rcvL_bldr = MCQueryApiBuilder.create(MST_RCV_R.create("T"));
			dbUpdateKey("MSBGL5180_MST_RCV_U01", rcvL, rcvL_bldr);
			return rcvL;
		}
		
		 /** 手形情報を新規追加・更新する
		 * @param orgR 更新前の入金情報
		 */
		protected void updNote() {
			MCList<MST_RCV_R> noteDel = MCList.create(MST_RCV_R.class);
			MCList<MST_NOTE_R> noteIns = MCList.create(MST_NOTE_R.class);
			MCList<MST_NOTE_R> noteUpd = MCList.create(MST_NOTE_R.class);

			for (Chk01_HdrR r : _noErrL) {
				MST_RCV_R orgR = getRcvCache(r.rcv_no());
				// 削除
				if (isNoteDel(orgR, r)) {
					noteDel.add(orgR);
				}
				else {
					// 手形情報の作成
					MST_NOTE_R noteR = MST_NOTE_R.create();
					copy(noteR, r, createMap_MST_NOTE_R_Chk01_HdrR());

					// 新規作成の場合
					if (isNoteIns(orgR, r)) {
						noteIns.add(noteR);
					}
					// 更新の場合
					else if (isNoteUpd(orgR, r)) {
						noteUpd.add(noteR);
					}
				}
			}
			MST_NOTE_R t = MST_NOTE_R.create("T");
			execDbDeleteKey("MSBGL5180_MST_NOTE_D01", t, noteDel);
			
			MCQueryApiBuilder noteIns_bldr = MCQueryApiBuilder.create(MST_NOTE_R.create("T"));
			dbInsert("MSBGL5180_MST_NOTE_I02", noteIns, noteIns_bldr);
			
			MCQueryApiBuilder noteUpd_bldr = MCQueryApiBuilder.create(MST_NOTE_R.create("T"));
			dbUpdateKey("MSBGL5180_MST_NOTE_U01", noteUpd, noteUpd_bldr);

		}
		
		/**
		 * 更新前入金情報のキャッシュ
		 * @return
		 */
		protected void createCacheForUpd(MCList<Chk01_HdrR> mcList) {
			_rcvL = MCList.create(MST_RCV_R.class);
			_t = MST_RCV_R.create("T");
			_rcvL_bldr = MCQueryApiBuilder.create(_t);
			dbSelectKey("MSBGL5180_MST_RCV_S02",
					_rcvL, _rcvL_bldr, mcList.subList(r -> !isNull(r.rcv_no())));
			_idxKey = _rcvL.createIndex(MST_RCV_R.$rcv_no);
		}
		
		/**
		 * 手形管理ＮＯを発番する
		 */
		protected void setNoteMngNo() {
			int cacheSize = 0;
			for (Chk01_HdrR r : _noErrL) {
				if (MAC_AR_STTL_TYP.isNOTE(r.rcv_typ())) {
					cacheSize++;
				}
			}
			doSeqCache(MSC_NUM_SYS_TYP.NOTEMNG, cacheSize);
		}
	}
	
	/**
	 * 手形ＩＦ処理を実行する
	 * @param rcvL ＩＦする入金ＩＤを含むコンテナ
	 * @param isDel 削除時にtrueを設定する
	 */
	protected void ifNote(MCList<MST_RCV_R> rcvL, boolean isDel) {
		MSBGL_NoteIfService.NoteIf_Ins01 ope = MSBGL_NoteIfService.crtNoteIf_Ins01();
		for (MST_RCV_R r : rcvL) {
			if (isNull(r.note_mng_no())) {
				continue;
			}
			
			NoteIf_Ins01_CndR noteR = NoteIf_Ins01_CndR.create();
			
			noteR.note_mng_no(r.note_mng_no());
			noteR.del_flg(isDel);
			ope.up0().add(noteR);
		}
		ope.exec();
	}
	
	/**
	 * 手形の新規作成かどうかを判断する
	 * @param orgR 変更前の情報
	 * @param newR 変更後の情報
	 * @return 手形の新規作成の場合にtrue
	 */
	protected boolean isNoteIns(MST_RCV_R orgR, Chk01_HdrR newR) {
		// 変更前が手形でなく、変更後に手形の場合
		if ((isNull(orgR) || !MAC_AR_STTL_TYP.isNOTE(orgR.rcv_typ()))
				&& MAC_AR_STTL_TYP.isNOTE(newR.rcv_typ())) {
			return true;
		}
		return false;
	}
	
	/**
	 * 手形の更新かどうかを判断する
	 * @param orgR 変更前の情報
	 * @param newR 変更後の情報
	 * @return 手形の新規作成の場合にtrue
	 */
	protected boolean isNoteUpd(MST_RCV_R orgR, Chk01_HdrR newR) {
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
	 * @param orgR 変更前の情報
	 * @param newR 変更後の情報
	 * @return 手形の削除の場合にtrue
	 */
	protected boolean isNoteDel(MST_RCV_R orgR, Chk01_HdrR newR) {	
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
	 * Rcv_Chk02オペレーション.<p>
	 * 入金を取り消す前のチェックをする<br>
	 */
	public class Rcv_Chk02 extends MSBGL_RcvRegService_MC_A.Rcv_Chk02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			createCacheForDel(up0());
			chkOther();
			setDown();
		}
		
		/**
		 * 固有チェック
		 * @param hR
		 * @return
		 */
		protected void chkOther() {
			for (Chk02_HdrR r : up0()) {
				chkRcvSts(getRcvCache(r.rcv_no()), r);
			}
		}
		
		/**
		 * 入金情報のステータスチェック<BR>
		 * @param rcvR
		 * @param r
		 */
		protected void chkRcvSts(MST_RCV_R rcvR,  Chk02_HdrR r) {
			MCMessageList msgL = new MCMessageList();
			
			if (isNull(rcvR)) {
				return;
			}
			
			if (rcvR.div_flg()) {
				r.err_flg(true);
				msgL.add(new MCMessage(r, null, MSBGL0007));
			}
			else if (rcvR.rcv_proc_amt().isPositive()) {
				r.err_flg(true);
				msgL.add(new MCMessage(r, null, MSBGL0051));
			}
			MCMessagePool.addAll(msgL);
		}
		
		/**
		 * 削除前入金情報のキャッシュ
		 * @return
		 */
		protected void createCacheForDel(MCList<Chk02_HdrR> up0) {
			_rcvL = MCList.create(MST_RCV_R.class);
			_t = MST_RCV_R.create("T");
			_rcvL_bldr = MCQueryApiBuilder.create(_t);
			dbSelectKey("MSBGL5180_MST_RCV_S03",
					_rcvL, _rcvL_bldr, up0.subList(r -> !isNull(r.rcv_no())));
			_idxKey = _rcvL.createIndex(MST_RCV_R.$rcv_no);
		}
		
		protected MST_RCV_R getRcvCache(String rcv_no) {
			return _rcvL.getFirst(_idxKey, rcv_no);
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().addAll(up0());
		}
	}
	
	/**
	 * Rcv_Del01オペレーション.<p>
	 *
	 * 入金を取り消す<br>
	 */
	public class Rcv_Del01 extends MSBGL_RcvRegService_MC_A.Rcv_Del01 {
		
		MCList<Chk02_HdrR>_noErrL;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			// チェック処理
			setNotErr();
			createCacheForDel(_noErrL);
			
			// 手形ＩＦ（更新前）
			MCList<MST_RCV_R> rcvL = getDelRcv();
			ifNote(rcvL, true);
			
			// 入金情報削除
			delRcv(rcvL);
			
			// 手形情報削除
			delNote(rcvL);
		}
		
		protected MCList<MST_RCV_R> getDelRcv() {
			MCList<MST_RCV_R> rcvL = MCList.create(MST_RCV_R.class);
			for (Chk02_HdrR r : _noErrL) {
				MST_RCV_R rcvR = getRcvCache(r.rcv_no());
				rcvL.add(rcvR);
			}
			return rcvL;
		}
		/**
		 * エラーＦＬＧがオフの行をセットする
		 * @return 
		 */
		protected void setNotErr() {
			_noErrL = getChkList(up0());
		}
		
		protected MST_RCV_R getRcvCache(String rcv_no) {
			return _rcvL.getFirst(_idxKey, rcv_no);
		}
		
		/**
		 * 入金情報削除
		 * 
		 * @return
		 */
		
		protected void delRcv(MCList<MST_RCV_R> rcvL) {
			MST_RCV_R t = MST_RCV_R.create("T");
			execDbDelete("MSBGL5180_MST_RCV_D01",
					t, t.rcv_no.eq(bind("rcv_no")), rcvL);
		}
		
		/**
		 * 手形情報削除
		 * @return
		 */
	
		protected void delNote(MCList<MST_RCV_R> rcvL) {
			MST_NOTE_R t = MST_NOTE_R.create("T");
			MCList<MST_RCV_R> hdrL = MCList.create(MST_RCV_R.class);
			for (MST_RCV_R r : rcvL) {
				if (!MAC_AR_STTL_TYP.isNOTE(r.rcv_typ())) {
					continue;
				}
				hdrL.add(r);
			}
			execDbDelete("MSBGL5180_MST_NOTE_D02",
					t, t.note_mng_no.eq(bind("note_mng_no")),
					hdrL);
		}

		
		/**
		 * 削除前入金情報のキャッシュ
		 * @return
		 */
		protected void createCacheForDel(MCList<Chk02_HdrR> up0) {
			_rcvL = MCList.create(MST_RCV_R.class);
			_t = MST_RCV_R.create("T");
			_rcvL_bldr = MCQueryApiBuilder.create(_t);
			dbSelectKey("MSBGL5180_MST_RCV_S04",
					_rcvL, _rcvL_bldr, up0.subList(r -> !isNull(r.rcv_no())));
			_idxKey = _rcvL.createIndex(MST_RCV_R.$rcv_no);
		}
	}
	
	// Mapper
	protected Map_MST_RCV_R_Chk01_HdrR<MST_RCV_R, Chk01_HdrR> createMap_MST_RCV_R_Chk01_HdrR(MST_RCV_R orgRcvR) {
		return new Map_MST_RCV_R_Chk01_HdrR<MST_RCV_R, Chk01_HdrR>(orgRcvR);
	}
	
	public class Map_MST_RCV_R_Chk01_HdrR<D extends MST_RCV_R, S extends Chk01_HdrR> extends MCRowMapper<D,S>{
		
		protected MST_RCV_R _orgRcvR;
		
		public Map_MST_RCV_R_Chk01_HdrR(MST_RCV_R orgRcvR) {
			_orgRcvR = orgRcvR;
		}
		
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_RCV_R.$rcst_cd, Chk01_HdrR.$rcst_cd);
			addColumnPathMap(MST_RCV_R.$bcst_cd, Chk01_HdrR.$bcst_cd);
			addColumnPathMap(MST_RCV_R.$bill_dpt_cd, Chk01_HdrR.$bill_dpt_cd);
			addColumnPathMap(MST_RCV_R.$rcv_dpt_cd, Chk01_HdrR.$rcv_dpt_cd);
			addColumnPathMap(MST_RCV_R.$wg_cd, Chk01_HdrR.$wg_cd);
			addColumnPathMap(MST_RCV_R.$rcv_usr_cd, Chk01_HdrR.$rcv_usr_cd);
			addColumnPathMap(MST_RCV_R.$rcv_dt, Chk01_HdrR.$rcv_dt);
			addColumnPathMap(MST_RCV_R.$rcv_mtd_cd, Chk01_HdrR.$rcv_mtd_cd);
			addColumnPathMap(MST_RCV_R.$rcv_typ, Chk01_HdrR.$rcv_typ);
			addColumnPathMap(MST_RCV_R.$bank_ac_cd, Chk01_HdrR.$bank_ac_cd);
			addColumnPathMap(MST_RCV_R.$xfr_psn, Chk01_HdrR.$xfr_psn);
			addColumnPathMap(MST_RCV_R.$trd_cur_cd, Chk01_HdrR.$trd_cur_cd);
			addColumnPathMap(MST_RCV_R.$xrate, Chk01_HdrR.$xrate);
			addColumnPathMap(MST_RCV_R.$rcv_rmrks, Chk01_HdrR.$rcv_rmrks);
			addColumnPathMap(MST_RCV_R.$rcv_amt, Chk01_HdrR.$rcv_amt);
			addColumnPathMap(MST_RCV_R.$com_paid, Chk01_HdrR.$com_paid);
			addColumnPathMap(MST_RCV_R.$auto_appl_basis_dt, Chk01_HdrR.$auto_appl_basis_dt);
			addColumnPathMap(MST_RCV_R.$rcv_auto_appl_tgt_flg, Chk01_HdrR.$rcv_auto_appl_tgt_flg);
			addColumnPathMap(MST_RCV_R.$prnt_flg, Chk01_HdrR.$prnt_flg);
			addColumnPathMap(MST_RCV_R.$sub_char1, Chk01_HdrR.$rcv_sub_char1);
			addColumnPathMap(MST_RCV_R.$sub_char2, Chk01_HdrR.$rcv_sub_char2);
			addColumnPathMap(MST_RCV_R.$sub_char3, Chk01_HdrR.$rcv_sub_char3);
			addColumnPathMap(MST_RCV_R.$ext_sys_cd, Chk01_HdrR.$ext_sys_cd);
			addColumnPathMap(MST_RCV_R.$ext_rcv_no, Chk01_HdrR.$ext_rcv_no);
			addColumnPathMap(MST_RCV_R.$fb_flg, Chk01_HdrR.$fb_flg);
		}
		
		@Override
		public void valueCopy(D dest, S src) {
			dest.rcv_no(isNull(_orgRcvR) ? src.rcv_no() : _orgRcvR.rcv_no());
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
			dest.seq_no(getSeqNo(_orgRcvR));
		}
	}
	
	// Mapper
	protected Map_MST_NOTE_R_Chk01_HdrR<MST_NOTE_R, Chk01_HdrR> createMap_MST_NOTE_R_Chk01_HdrR() {
		return new Map_MST_NOTE_R_Chk01_HdrR<MST_NOTE_R, Chk01_HdrR>();
	}

	public class Map_MST_NOTE_R_Chk01_HdrR<D extends MST_NOTE_R, S extends Chk01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_NOTE_R.$note_mng_no, Chk01_HdrR.$note_mng_no);
			addColumnPathMap(MST_NOTE_R.$note_no, Chk01_HdrR.$note_no);
			addColumnPathMap(MST_NOTE_R.$note_typ, Chk01_HdrR.$note_typ);
			addColumnPathMap(MST_NOTE_R.$draw_dt, Chk01_HdrR.$draw_dt);
			addColumnPathMap(MST_NOTE_R.$due_dt, Chk01_HdrR.$due_dt);
			addColumnPathMap(MST_NOTE_R.$drawer_nm, Chk01_HdrR.$drawer_nm);
			addColumnPathMap(MST_NOTE_R.$draw_bank_cd, Chk01_HdrR.$draw_bank_cd);
			addColumnPathMap(MST_NOTE_R.$draw_branch_cd, Chk01_HdrR.$draw_branch_cd);
			addColumnPathMap(MST_NOTE_R.$endrsr, Chk01_HdrR.$endrsr);
			addColumnPathMap(MST_NOTE_R.$accptr, Chk01_HdrR.$accptr);
			addColumnPathMap(MST_NOTE_R.$note_rsn_cd, Chk01_HdrR.$note_rsn_cd);
			addColumnPathMap(MST_NOTE_R.$sub_char1, Chk01_HdrR.$note_sub_char1);
			addColumnPathMap(MST_NOTE_R.$sub_char2, Chk01_HdrR.$note_sub_char2);
			addColumnPathMap(MST_NOTE_R.$sub_char3, Chk01_HdrR.$note_sub_char3);
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
	 * 手形管理Ｎｏを取得する
	 * @param orgR
	 * @param hR
	 * @return
	 */
	protected String getNoteMngNo(MST_RCV_R orgR, Chk01_HdrR hR) {
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