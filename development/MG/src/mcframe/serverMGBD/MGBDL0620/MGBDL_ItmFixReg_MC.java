package mcframe.serverMGBD.MGBDL0620;

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
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import static mcframe.serverMGUC.MGUCL0020.MGUCL_AppSys.*;
import mcframe.commonMG.constant.*;
import static mcframe.commonMG.notice.MG_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMG.dbc.MGFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMG.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMGBD.MGBDL0620.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMGBD.MGBDL0620.Query.*;
import mcframe.serverFXUC.FXUCL0170.FXUCL_DuplicateValidater;
import mcframe.serverFXUC.FXUCL0170.IfValidater;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBDL_ItmFixReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBDL_ItmFixReg_MC extends MGBDL_ItmFixReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価品目指値情報を検索する<br>
	 */
	public class Srch01 extends MGBDL_ItmFixReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			editUp();
			srch();
		}
		
		protected void editUp() {
			up0().addStringColumn("non_calc_flg_str", toOnOffStr(up0().on_non_calc_flg(), up0().off_non_calc_flg()));
			up0().addBooleanColumn("cmn_wg_flg", up0().cmn_flg() && up0().wg_flg());
			up0().addBooleanColumn("cmn_only_flg", up0().cmn_flg() && !up0().wg_flg());
			up0().addBooleanColumn("wg_only_flg", !up0().cmn_flg() && up0().wg_flg());
		}

		protected void srch() {
			executeQuery(down0(), MGBDL0620_MGT_ITM_FIX_S01(), up0());
		}
	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 原価品目指値情報を削除するために、チェックを行う<br>
	 */
	public class Chk02 extends MGBDL_ItmFixReg_MC_A.Chk02 {
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
			msgL.addAll(chk());
			return msgL;
		}
		
		/**
		 * ロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk02_RsltR> notErrL = getChkList(up0());
			if (notErrL.isEmpty()) {
				return msgL;
			}
			
			MCList<MGT_ITM_FIX_R> selectL = MCList.create(MGT_ITM_FIX_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MGT_ITM_FIX_R.create("T"));
			selectForUpdateNoWaitPkWk("MGBDL0620_MGT_ITM_FIX_S01", selectL, selectL_bldr.getBaseDbc(), notErrL);

			String[] keys = selectL_bldr.getBaseDbc().getKeyColumn();
			MCIndexKey idxkey = selectL.createIndex(keys);
			for (Chk02_RsltR r : notErrL) {

				Comparable<?>[] binds = r.toArray(keys);
				MGT_ITM_FIX_R selectR = selectL.getFirst(idxkey, binds);

				if (isNull(selectR)) {
					msgL.addAll(getRecordNotFoundMsg(getModuleID(), selectL.createRow(), r));
				}
				else {
					selectR.setAttributes(r);
					// 更新カウンタチェック
					msgL.addAll(checkUpdCntrNE(r, Chk02_RsltR.$upd_cntr, selectR));
					if (up1().wg_flg()) {
						// DACチェック
						msgL.addAll(checkWritableWgCdDac(selectR, MGT_ITM_FIX_R.$wg_cd));
					}
				}
			}
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk01_RsltR> notErrL = getChkList(up0());

			msgL.addAll(chkStdFix(notErrL));

			return msgL;
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		@Override
		protected IfValidater getDuplicateValidater(String[] cols) {
			return new FXUCL_DuplicateValidater(true);
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 原価品目指値情報を削除する<br>
	 */
	public class Del01 extends MGBDL_ItmFixReg_MC_A.Del01 {
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
			MCList<Chk02_RsltR> notErrL = getChkList(up0());
			del(notErrL);
		}
		
		/**
		 * 上り電文設定
		 */
		protected void editUp() {
			setPegNo(up0());
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk02() {
			MGBDL_ItmFixReg.Chk02 ope = MGBDL_ItmFixReg.crtChk02();
			ope.up0().setAll(up0());
			MCRow.copyvalue(ope.up1(), up1());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 原価品目指値情報の削除を行う。
		 * @param notErrL エラーのない上り電文
		 */
		protected void del(MCList<Chk02_RsltR> notErrL) {
			if(notErrL.isEmpty()) {
				return;
			}
			MCList<MGT_ITM_FIX_R> dbcL = MCList.create(MGT_ITM_FIX_R.class);
			notErrL.forEach(r -> dbcL.add(r.dbc()));
			dbDeleteKey("MGBDL0620_MGT_ITM_FIX_D01", dbcL, MCQueryApiBuilder.create(MGT_ITM_FIX_R.create("T")));
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 原価品目指値情報を登録・訂正するために、チェックを行う<br>
	 */
	public class Chk01 extends MGBDL_ItmFixReg_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void initUpSub() {
			super.initUpSub();

			if (up1().cmn_flg()) {
				for (Chk01_RsltR r : up0()) {
					r.wg_cd(MAC_STR.NULL_VAL.value());
				}
			}
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			setDown();
		}

		@Override
		protected boolean skipListLogicCheck(MCContainer container, String column) {
			if (up1().cmn_flg()) {
				if (container == up0() && isSame(column, Chk01_RsltR.$wg_cd)) {
					return true;
				}
			}
			return super.skipListLogicCheck(container, column);
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			msgL.addAll(chk());
			return msgL;
		}
		
		/**
		 * ロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			if (notErrL.isEmpty()) {
				return msgL;
			}
			
			MCList<MGT_ITM_FIX_R> selectL = MCList.create(MGT_ITM_FIX_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MGT_ITM_FIX_R.create("T"));
			if (up1().file_imp_flg()) {
				selectPkWk("MGBDL0620_MGT_ITM_FIX_S02", selectL, selectL_bldr.getBaseDbc(), notErrL, false);
			}
			else {
				selectForUpdateNoWaitPkWk("MGBDL0620_MGT_ITM_FIX_S03", selectL, selectL_bldr.getBaseDbc(), notErrL);
			}

			String[] keys = selectL_bldr.getBaseDbc().getKeyColumn();
			MCIndexKey idxkey = selectL.createIndex(keys);
			for (Chk01_RsltR r : notErrL) {

				Comparable<?>[] binds = r.toArray(keys);
				MGT_ITM_FIX_R selectR = selectL.getFirst(idxkey, binds);

				if (isNull(selectR)) {
					if (up1().file_imp_flg()) {
						r.setStatus(MCRow.CREATE);
					}
					else {
						if (r.isStatusModify()) {
							msgL.addAll(getRecordNotFoundMsg(getModuleID(), selectL.createRow(), r));
						}
					}
				}
				else {
					selectR.setAttributes(r);
					// 更新カウンタチェック
					if (up1().file_imp_flg()) {
						r.setStatus(MCRow.MODIFY);
						r.upd_cntr(selectR.upd_cntr());
					}
					else {
						if (r.isStatusModify()) {
							msgL.addAll(checkUpdCntrNE(r, Chk01_RsltR.$upd_cntr, selectR));
						}
						else {
							msgL.addAll(getRecordFoundMsg(getModuleID(), selectL.createRow(), r));
						}
					}
					if (r.isStatusModify()) {
						if (up1().wg_flg()) {
							// DACチェック
							msgL.addAll(checkWritableWgCdDac(selectR, MGT_ITM_FIX_R.$wg_cd));
						}
					}
				}
			}
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			
			msgL.addAll(chkStdFix(notErrL));
			
			for (Chk01_RsltR upR : notErrL){

				// 小数有効桁数チェック
				msgL.addAll(checkDecPlace(upR, Chk01_RsltR.$dec_place, Chk01_RsltR.$base_qty));
				msgL.addAll(checkDecPlace(upR, Chk01_RsltR.$upri_dec_place, Chk01_RsltR.$std_upri));
				
				//固有チェック
				
				if (up1().wg_flg()) {
					// DACチェック
					msgL.addAll(checkWritableWgCdDac(upR, MGT_ITM_FIX_R.$wg_cd));
				}
			}
			return msgL;
		}
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		@Override
		protected IfValidater getDuplicateValidater(String[] cols) {
			return new FXUCL_DuplicateValidater(true);
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 原価品目指値情報を登録、訂正する<br>
	 */
	public class Upd01 extends MGBDL_ItmFixReg_MC_A.Upd01 {
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
			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			upd(notErrL);
		}
		
		/**
		 * 上り電文設定
		 */
		protected void editUp() {
			setPegNo(up0());
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MGBDL_ItmFixReg.Chk01 ope = MGBDL_ItmFixReg.crtChk01();
			ope.up0().setAll(up0());
			MCRow.copyvalue(ope.up1(), up1());
			ope.up1().file_imp_flg(false);
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 原価品目指値情報の登録を行う。
		 * @param notErrL エラーのない上り電文
		 */
		protected void upd(MCList<Chk01_RsltR> notErrL) {
			if(notErrL.isEmpty()) {
				return;
			}
			MCList<MGT_ITM_FIX_R> dbcL = MCList.create(MGT_ITM_FIX_R.class);
			notErrL.forEach(r -> dbcL.add(r.dbc()));
			dbUpdByStatus(dbcL);
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
	}
	/**
	 * Imp01オペレーション.<p>
	 *
	 * ファイルから取り込んだ原価品目指値情報のチェック処理を行う<br>
	 */
	public class Imp01 extends MGBDL_ItmFixReg_MC_A.Imp01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk01();
			setDown();
		}
		
		protected void editUp() {
			setPegNo(up0());
			for (Chk01_RsltR upR : up0()){
				upR.cur_cd(getBaseCur().cur_cd());
			}
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MGBDL_ItmFixReg.Chk01 ope = MGBDL_ItmFixReg.crtChk01();
			ope.up0().setAll(up0());
			MCRow.copyvalue(ope.up1(), up1());
			ope.up1().file_imp_flg(true);
			ope.exec();
			up0().setAll(ope.down0());
		}

		protected void setDown() {
			down0().setAll(up0());
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
	}

	/**
	 * 標準単価確定チェック
	 */
	protected <E extends MCRow> MCMessageList chkStdFix(MCList<E> up) {
		MCMessageList msgList = new MCMessageList();
		if (up.isEmpty()) {
			return msgList;
		}
		
		String[] keys = new String[]{MGT_ITM_FIX_R.$term, MGT_ITM_FIX_R.$calc_ctg_cd,
				MGT_ITM_FIX_R.$wg_cd, MGT_ITM_FIX_R.$itm_cd, MGT_ITM_FIX_R.$itm_sub1, MGT_ITM_FIX_R.$itm_sub2,
				MGT_ITM_FIX_R.$itm_sub3};

		MCList<MGT_ITM_FIX_R> bindL = MCList.create(MGT_ITM_FIX_R.class);
		for (E r : up) {
			if (r instanceof Chk01_RsltR) {
				bindL.add(((Chk01_RsltR) r).dbc());
			}
			else if (r instanceof Chk02_RsltR) {
				bindL.add(((Chk02_RsltR) r).dbc());
			}
		}
		bindL = bindL.groupBy(keys);

		MCQueryApiBuilder bindL_bldr = MCQueryApiBuilder.create(MGT_ITM_FIX_R.create("T"));
		dbWkDelete("MGBDL0620_MGW_ITM_FIX_D01", bindL_bldr.getBaseDbc());
		dbWkInsert("MGBDL0620_MGW_ITM_FIX_I01", bindL, bindL_bldr.getBaseDbc());
		MCList<MGT_ITM_FIX_R> errL = MCList.create(MGT_ITM_FIX_R.class);
		executeQuery(errL, MGBDL0620_MGW_ITM_FIX_KEY_S01());
		dbWkDelete("MGBDL0620_MGW_ITM_FIX_D02", bindL_bldr.getBaseDbc());
		if (errL.isEmpty()) {
			return msgList;
		}

		MCIndexKey idxkey = up.createIndex(keys);
		for (MGT_ITM_FIX_R r : errL) {
			Comparable<?>[] binds = r.toArray(keys);
			for (E row : up.subList(idxkey, binds)) {
				msgList.add(new MCMessage(row, null, MGBDL0021,
						toYMString(r.term()), r.calc_ctg_cd(), r.wg_cd(), toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
						toDispGUIIndex(row)));
			}
		}
		return msgList;
	}

	//FMCB CUSTOM END
}