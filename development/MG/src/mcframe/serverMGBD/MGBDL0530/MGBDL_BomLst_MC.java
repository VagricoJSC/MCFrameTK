package mcframe.serverMGBD.MGBDL0530;

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
import mcframe.serverMGBD.MGBDL0530.*; // このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMGBD.MGBDL0530.Query.*;
import mcframe.serverFXUC.FXUCL0170.FXUCL_DuplicateValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverFXUC.FXUCL0170.IfValidater;
import static mcframe.commonFX.notice.FX_Msg.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBDL_BomLst"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBDL_BomLst_MC extends MGBDL_BomLst_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価ＢＯＭ情報を検索する<br>
	 */
	public class Srch01 extends MGBDL_BomLst_MC_A.Srch01 {
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
			up0().addStringColumn("non_calc_flg_str",
					toOnOffStr(up0().on_non_calc_flg(), up0().off_non_calc_flg()));
			up0().addBooleanColumn("cmn_wg_flg", up0().cmn_flg() && up0().wg_flg());
			up0().addBooleanColumn("cmn_only_flg", up0().cmn_flg() && !up0().wg_flg());
			up0().addBooleanColumn("wg_only_flg", !up0().cmn_flg() && up0().wg_flg());
			up0().addStringColumn("no_alt_grp_flg_str",
					toTrueStr(up0().no_alt_grp_flg()));
			up0().addStringColumn("no_expns_flg_str", toTrueStr(up0().no_expns_flg()));
		}

		protected void srch() {
			executeQuery(down0(), MGBDL0530_MGT_BOM_S01(), up0());
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 原価ＢＯＭ情報を登録・訂正するために、チェックを行う<br>
	 */
	public class Chk01 extends MGBDL_BomLst_MC_A.Chk01 {
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

			MCList<MGT_BOM_R> selectL = MCList.create(MGT_BOM_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MGT_BOM_R.create("T"));
			if (up1().file_imp_flg()) {
				selectPkWk("MGBDL0530_MGT_BOM_S01", selectL, selectL_bldr.getBaseDbc(), notErrL, false);
			}
			else {
				selectForUpdateNoWaitPkWk("MGBDL0530_MGT_BOM_S02", selectL, selectL_bldr.getBaseDbc(), notErrL);
			}

			String[] keys = selectL_bldr.getBaseDbc().getKeyColumn();
			MCIndexKey idxkey = selectL.createIndex(keys);
			for (Chk01_RsltR r : notErrL) {

				Comparable<?>[] binds = r.toArray(keys);
				MGT_BOM_R selectR = selectL.getFirst(idxkey, binds);

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
							msgL.addAll(
									checkUpdCntrNE(r, Chk01_RsltR.$upd_cntr, selectR));
						}
						else {
							msgL.addAll(getRecordFoundMsg(getModuleID(), selectL.createRow(), r));
						}
					}
					if (r.isStatusModify()) {
						if (up1().wg_flg()) {
							// DACチェック
							msgL.addAll(checkWritableWgCdDac(selectR, MGT_BOM_R.$wg_cd));
						}
					}
				}
				setDefault(r);
			}
			return msgL;
		}

		protected void setDefault(Chk01_RsltR r) {
			if (isNull(r.fxd_chd_rqmt_qty())) {
				r.fxd_chd_rqmt_qty(MCNumber.ZERO);
			}
			if (isNull(r.chd_min_qty())) {
				r.chd_min_qty(MCNumber.ZERO);
			}
			if (isNull(r.chd_batch_qty())) {
				r.chd_batch_qty(MCNumber.ZERO);
			}
			if (isNull(r.chd_base_qty())) {
				r.chd_base_qty(r.chd_rqmt_qty());
			}
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk01_RsltR> notErrL = getChkList(up0());

			msgL.addAll(chkStdFix(notErrL));

			for (Chk01_RsltR upR : notErrL) {

				// 条件付必須チェック
				if (!isNull(upR.alt_grp_cd())) {
					msgL.addAll(check(upR, Chk01_RsltR.$alt_itm_ratio,
							new FXUCL_RequiredValidater()));
				}
				if (!isNull(upR.oper_cd())) {
					msgL.addAll(check(upR, Chk01_RsltR.$oper_seq,
							new FXUCL_RequiredValidater()));
				}

				// 小数有効桁数チェック
				msgL.addAll(checkDecPlace(upR, Chk01_RsltR.$par_dec_place,
						Chk01_RsltR.$par_rqmt_qty));
				msgL.addAll(checkDecPlace(upR, Chk01_RsltR.$chd_dec_place,
						Chk01_RsltR.$chd_rqmt_qty));
				msgL.addAll(checkDecPlace(upR, Chk01_RsltR.$chd_dec_place,
						Chk01_RsltR.$chd_base_qty));
				msgL.addAll(checkDecPlace(upR, Chk01_RsltR.$chd_dec_place,
						Chk01_RsltR.$fxd_chd_rqmt_qty));
				msgL.addAll(checkDecPlace(upR, Chk01_RsltR.$chd_dec_place,
						Chk01_RsltR.$chd_min_qty));
				msgL.addAll(checkDecPlace(upR, Chk01_RsltR.$chd_dec_place,
						Chk01_RsltR.$chd_batch_qty));

				// 個別チェック
				if (!isNull(upR.chd_itm_cd())
						&& isSame(upR.par_itm_cd(), upR.chd_itm_cd())
						&& isSame(upR.par_itm_sub1(), upR.chd_itm_sub1())
						&& isSame(upR.par_itm_sub2(), upR.chd_itm_sub2())
						&& isSame(upR.par_itm_sub3(), upR.chd_itm_sub3())) {
					msgL.add(new MCMessage(upR, null, MGBDL0044,
							toDispItm(upR.par_itm_cd(), upR.par_itm_sub1(),
									upR.par_itm_sub2(), upR.par_itm_sub3()),
							toDispGUIIndex(upR)));
				}

				if (up1().wg_flg()) {
					// DACチェック
					msgL.addAll(checkWritableWgCdDac(upR, Chk01_RsltR.$wg_cd));
				}
			}

			return msgL;
		}

		@Override
		protected IfValidater getReqValidater(String col) {
			if (isSame(col, Chk01_RsltR.$oper_seq)) {
				return new MAUDL_RequiredValidater_Status(
						r -> !isNull(((Chk01_RsltR) r).oper_cd()));
			}
			if (isSame(col, Chk01_RsltR.$alt_itm_ratio)) {
				return new MAUDL_RequiredValidater_Status(
						r -> !isNull(((Chk01_RsltR) r).alt_grp_cd()));
			}
			return super.getReqValidater(col);
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
	 * Chk02オペレーション.<p>
	 *
	 * 原価ＢＯＭ情報を削除するために、チェックを行う<br>
	 */
	public class Chk02 extends MGBDL_BomLst_MC_A.Chk02 {
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

			MCList<MGT_BOM_R> selectL = MCList.create(MGT_BOM_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MGT_BOM_R.create("T"));
			selectForUpdateNoWaitPkWk("MGBDL0530_MGT_BOM_S03", selectL, selectL_bldr.getBaseDbc(), notErrL);

			String[] keys = selectL_bldr.getBaseDbc().getKeyColumn();
			MCIndexKey idxkey = selectL.createIndex(keys);
			for (Chk02_RsltR r : notErrL) {

				Comparable<?>[] binds = r.toArray(keys);
				MGT_BOM_R selectR = selectL.getFirst(idxkey, binds);

				if (isNull(selectR)) {
					msgL.addAll(getRecordNotFoundMsg(getModuleID(), selectL.createRow(), r));
				}
				else {
					selectR.setAttributes(r);
					// 更新カウンタチェック
					msgL.addAll(checkUpdCntrNE(r, Chk02_RsltR.$upd_cntr, selectR));
					if (up1().wg_flg()) {
						// DACチェック
						msgL.addAll(checkWritableWgCdDac(selectR, MGT_BOM_R.$wg_cd));
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
	 * Upd01オペレーション.<p>
	 *
	 * 原価ＢＯＭ情報を登録、訂正する<br>
	 */
	public class Upd01 extends MGBDL_BomLst_MC_A.Upd01 {
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
			MGBDL_BomLst.Chk01 ope = MGBDL_BomLst.crtChk01();
			ope.up0().setAll(up0());
			MCRow.copyvalue(ope.up1(), up1());
			ope.up1().file_imp_flg(false);
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 原価ＢＯＭ情報の登録を行う。
		 * @param notErrL エラーのない上り電文
		 */
		protected void upd(MCList<Chk01_RsltR> notErrL) {
			if (notErrL.isEmpty()) {
				return;
			}
			MCList<MGT_BOM_R> dbcL = MCList.create(MGT_BOM_R.class);
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
	 * Del01オペレーション.<p>
	 *
	 * 原価ＢＯＭ情報を削除する<br>
	 */
	public class Del01 extends MGBDL_BomLst_MC_A.Del01 {
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
			MGBDL_BomLst.Chk02 ope = MGBDL_BomLst.crtChk02();
			ope.up0().setAll(up0());
			MCRow.copyvalue(ope.up1(), up1());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 原価ＢＯＭ情報の削除を行う。
		 * @param notErrL エラーのない上り電文
		 */
		protected void del(MCList<Chk02_RsltR> notErrL) {
			if (notErrL.isEmpty()) {
				return;
			}
			MCList<MGT_BOM_R> dbcL = MCList.create(MGT_BOM_R.class);
			notErrL.forEach(r -> dbcL.add(r.dbc()));
			dbDeleteKey("MGBDL0530_MGT_BOM_D01", dbcL, MCQueryApiBuilder.create(MGT_BOM_R.create("T")));
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
	 * ファイルから取り込んだ原価ＢＯＭ情報のチェック処理を行う<br>
	 */
	public class Imp01 extends MGBDL_BomLst_MC_A.Imp01 {
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
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MGBDL_BomLst.Chk01 ope = MGBDL_BomLst.crtChk01();
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

		String[] keys = new String[] {
				MGT_BOM_R.$term, MGT_BOM_R.$calc_ctg_cd, MGT_BOM_R.$wg_cd,
				MGT_BOM_R.$par_itm_cd, MGT_BOM_R.$par_itm_sub1, MGT_BOM_R.$par_itm_sub2,
				MGT_BOM_R.$par_itm_sub3
		};

		MCList<MGT_BOM_R> bindL = MCList.create(MGT_BOM_R.class);
		for (E r : up) {
			if (r instanceof Chk01_RsltR) {
				bindL.add(((Chk01_RsltR) r).dbc());
			}
			else if (r instanceof Chk02_RsltR) {
				bindL.add(((Chk02_RsltR) r).dbc());
			}
			else if (r instanceof Chk03_RsltR) {
				bindL.add(((Chk03_RsltR) r).dbc());
			}
		}
		bindL = bindL.groupBy(keys);

		MCQueryApiBuilder bindL_bldr = MCQueryApiBuilder.create(MGT_BOM_R.create("T"));
		dbWkDelete("MGBDL0530_MGW_BOM_D01", bindL_bldr.getBaseDbc());
		dbWkInsert("MGBDL0530_MGW_BOM_I01", bindL, bindL_bldr.getBaseDbc());
		MCList<MGT_BOM_R> errL = MCList.create(MGT_BOM_R.class);
		executeQuery(errL, MGBDL0530_MGW_BOM_KEY_S01());
		dbWkDelete("MGBDL0530_MGW_BOM_D02", bindL_bldr.getBaseDbc());
		if (errL.isEmpty()) {
			return msgList;
		}

		MCIndexKey idxkey = up.createIndex(keys);
		for (MGT_BOM_R r : errL) {
			Comparable<?>[] binds = r.toArray(keys);
			for (E row : up.subList(idxkey, binds)) {
				msgList.add(new MCMessage(row, null, MGBDL0021, toYMString(r.term()),
						r.calc_ctg_cd(),
						r.wg_cd(), toDispItm(r.par_itm_cd(), r.par_itm_sub1(),
								r.par_itm_sub2(), r.par_itm_sub3()),
						toDispGUIIndex(row)));
			}
		}
		return msgList;
	}

	/**
	 * Chk03オペレーション.<p>
	 *
	 * 原価ＢＯＭ情報を置換するために、チェックを行う<br>
	 */
	public class Chk03 extends MGBDL_BomLst_MC_A.Chk03 {
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

			if (!isNull(up0().par_itm_cd()) && !isNull(up0().chd_itm_cd())) {
				if (isSame(up0().par_itm_cd(), up0().chd_itm_cd())
						&& isSame(up0().par_itm_sub1(), up0().chd_itm_sub1())
						&& isSame(up0().par_itm_sub2(), up0().chd_itm_sub2())
						&& isSame(up0().par_itm_sub3(), up0().chd_itm_sub3())) {
					msgL.add(new MCMessage(up0(), Chk03_CndR.$par_itm_cd, MGBDL0047,
							toDispItm(up0().par_itm_cd(), up0().par_itm_sub1(),
									up0().par_itm_sub2(), up0().par_itm_sub3())));
					return msgL;
				}
			}

			MCList<Chk03_RsltR> notErrL = getChkList(up1());
			if (notErrL.isEmpty()) {
				return msgL;
			}

			MCList<MGT_BOM_R> selectL = MCList.create(MGT_BOM_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MGT_BOM_R.create("T"));
			selectForUpdateNoWaitPkWk("MGBDL0530_MGT_BOM_S04", selectL, selectL_bldr.getBaseDbc(), notErrL);

			String[] keys = selectL_bldr.getBaseDbc().getKeyColumn();
			MCIndexKey idxkey = selectL.createIndex(keys);
			for (Chk03_RsltR r : notErrL) {

				Comparable<?>[] binds = r.toArray(keys);
				MGT_BOM_R selectR = selectL.getFirst(idxkey, binds);

				if (isNull(selectR)) {
					msgL.addAll(getRecordNotFoundMsg(getModuleID(), selectL.createRow(), r));
				}
				else {
					selectR.setAttributes(r);
					// 更新カウンタチェック
					msgL.addAll(checkUpdCntrNE(r, Chk03_RsltR.$upd_cntr, selectR));

					if (up2().wg_flg()) {
						// DACチェック
						msgL.addAll(checkWritableWgCdDac(selectR, MGT_BOM_R.$wg_cd));
					}
				}
			}

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk03_RsltR> notErrL = getChkList(up1());

			msgL.addAll(chkStdFix(notErrL));

			makeUpdData(notErrL);

			MCList<Chk03_RsltR> tmpL = MCList.create(Chk03_RsltR.class);

			for (Chk03_RsltR r : notErrL) {
				Chk03_RsltR tmpR = Chk03_RsltR.create();
				MCRow.copyall(tmpR, r);
				tmpR.par_itm_cd(r.new_par_itm_cd());
				tmpR.par_itm_sub1(r.new_par_itm_sub1());
				tmpR.par_itm_sub2(r.new_par_itm_sub2());
				tmpR.par_itm_sub3(r.new_par_itm_sub3());
				tmpR.bom_ptn(r.new_bom_ptn());
				tmpR.oper_cd(r.oper_cd());
				tmpR.oper_seq(r.oper_seq());
				tmpR.chd_itm_cd(r.new_chd_itm_cd());
				tmpR.chd_itm_sub1(r.new_chd_itm_sub1());
				tmpR.chd_itm_sub2(r.new_chd_itm_sub2());
				tmpR.chd_itm_sub3(r.new_chd_itm_sub3());
				tmpR.alt_grp_cd(r.alt_grp_cd());
				tmpR.expns_cd(r.expns_cd());
				tmpR.term(r.term());
				tmpR.calc_ctg_cd(r.calc_ctg_cd());
				tmpR.wg_cd(r.wg_cd());
				tmpL.add(tmpR);

				if (!(isSame(tmpR.par_itm_cd(), r.par_itm_cd())
						&& isSame(tmpR.par_itm_sub1(), r.par_itm_sub1())
						&& isSame(tmpR.par_itm_sub2(), r.par_itm_sub2())
						&& isSame(tmpR.par_itm_sub3(), r.par_itm_sub3())
						&& isSame(tmpR.bom_ptn(), r.bom_ptn())
						&& isSame(tmpR.chd_itm_cd(), r.chd_itm_cd())
						&& isSame(tmpR.chd_itm_sub1(), r.chd_itm_sub1())
						&& isSame(tmpR.chd_itm_sub2(), r.chd_itm_sub2())
						&& isSame(tmpR.chd_itm_sub3(), r.chd_itm_sub3()))) {

					MCList<MGT_BOM_R> selectL = MCList.create(MGT_BOM_R.class);
					MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MGT_BOM_R.create("T"));
					dbSelectKey("MGBDL0530_MGT_BOM_S05", selectL, selectL_bldr, tmpR);

					// 置換後のデータが既に存在していないか
					if (!isNull(selectL)) {
						msgL.add(new MCMessage(r, null, MGBDL0049,
								getKeyInfoMsgLabel(tmpR, selectL_bldr.getBaseDbc().getKeyColumn())));
					}
				}

				if (isSame(r.new_par_itm_cd(), r.new_chd_itm_cd())
						&& isSame(r.new_par_itm_sub1(), r.new_chd_itm_sub1())
						&& isSame(r.new_par_itm_sub2(), r.new_chd_itm_sub2())
						&& isSame(r.new_par_itm_sub3(), r.new_chd_itm_sub3())) {
					msgL.add(new MCMessage(r, null, MGBDL0048,
							toDispItm(r.new_par_itm_cd(), r.new_par_itm_sub1(),
									r.new_par_itm_sub2(), r.new_par_itm_sub3()),
							toDispGUIIndex(r)));
				}
			}

			MCIndexKey idxkey = tmpL.createIndex(Chk03_RsltR.$par_itm_cd,
					Chk03_RsltR.$par_itm_sub1, Chk03_RsltR.$par_itm_sub2,
					Chk03_RsltR.$par_itm_sub3, Chk03_RsltR.$bom_ptn, Chk03_RsltR.$oper_cd,
					Chk03_RsltR.$oper_seq, Chk03_RsltR.$chd_itm_cd,
					Chk03_RsltR.$chd_itm_sub1, Chk03_RsltR.$chd_itm_sub2,
					Chk03_RsltR.$chd_itm_sub3, Chk03_RsltR.$alt_grp_cd,
					Chk03_RsltR.$expns_cd, Chk03_RsltR.$term, Chk03_RsltR.$calc_ctg_cd,
					Chk03_RsltR.$wg_cd);

			// 選択した行のキーが置換後に同一になっていないか
			for (Chk03_RsltR tmpR : tmpL) {
				MCList<Chk03_RsltR> subL = tmpL.subList(idxkey, tmpR.par_itm_cd(),
						tmpR.par_itm_sub1(), tmpR.par_itm_sub2(), tmpR.par_itm_sub3(),
						tmpR.bom_ptn(), tmpR.oper_cd(), tmpR.oper_seq(),
						tmpR.chd_itm_cd(), tmpR.chd_itm_sub1(), tmpR.chd_itm_sub2(),
						tmpR.chd_itm_sub3(), tmpR.alt_grp_cd(), tmpR.expns_cd(),
						tmpR.term(), tmpR.calc_ctg_cd(), tmpR.wg_cd());
				if (subL.size() > 1) {
					int dupI = -1;
					for (Chk03_RsltR dupR : subL) {
						if (tmpR.getGUIIndex() != dupR.getGUIIndex()) {
							dupI = dupR.getGUIIndex();
							break;
						}
					}
					int i = tmpR.getGUIIndex();
					tmpR.setGUIIndex(-1);
					msgL.add(new MCMessage(tmpR, null, FXUCC0031,
							getKeyInfoMsgLabel(tmpR,
									MGT_BOM_R.create().getKeyColumn()),
							i + 1, dupI + 1));
					tmpR.setGUIIndex(i);
				}
			}

			return msgL;
		}

		protected void makeUpdData(MCList<Chk03_RsltR> notErrL) {
			for (Chk03_RsltR r : notErrL) {
				// 親・子品目情報の設定および小数部有効桁数に応じ各数量の桁数を編集
				if (!isNull(up0().par_dec_place())) {
					r.new_par_itm_cd(up0().par_itm_cd());
					r.new_par_itm_sub1(up0().par_itm_sub1());
					r.new_par_itm_sub2(up0().par_itm_sub2());
					r.new_par_itm_sub3(up0().par_itm_sub3());
					r.par_rqmt_qty(r.par_rqmt_qty().divide(1,
							up0().par_dec_place().intValue(), MAC_RND_TYP.RNDUP.toMC()));
				}
				else {
					r.new_par_itm_cd(r.par_itm_cd());
					r.new_par_itm_sub1(r.par_itm_sub1());
					r.new_par_itm_sub2(r.par_itm_sub2());
					r.new_par_itm_sub3(r.par_itm_sub3());
				}
				if (!isNull(up0().chd_dec_place())) {
					r.new_chd_itm_cd(up0().chd_itm_cd());
					r.new_chd_itm_sub1(up0().chd_itm_sub1());
					r.new_chd_itm_sub2(up0().chd_itm_sub2());
					r.new_chd_itm_sub3(up0().chd_itm_sub3());
					r.chd_rqmt_qty(r.chd_rqmt_qty().divide(1,
							up0().chd_dec_place().intValue(), MAC_RND_TYP.RNDUP.toMC()));
					r.chd_base_qty(r.chd_base_qty().divide(1,
							up0().chd_dec_place().intValue(), MAC_RND_TYP.RNDUP.toMC()));
					r.fxd_chd_rqmt_qty(r.fxd_chd_rqmt_qty().divide(1,
							up0().chd_dec_place().intValue(), MAC_RND_TYP.RNDUP.toMC()));
					r.chd_min_qty(r.chd_min_qty().divide(1,
							up0().chd_dec_place().intValue(), MAC_RND_TYP.RNDUP.toMC()));
					r.chd_batch_qty(r.chd_batch_qty().divide(1,
							up0().chd_dec_place().intValue(), MAC_RND_TYP.RNDUP.toMC()));
				}
				else {
					r.new_chd_itm_cd(r.chd_itm_cd());
					r.new_chd_itm_sub1(r.chd_itm_sub1());
					r.new_chd_itm_sub2(r.chd_itm_sub2());
					r.new_chd_itm_sub3(r.chd_itm_sub3());
				}
				// 構成パタン
				if (!isNull(up0().bom_ptn())) {
					r.new_bom_ptn(up0().bom_ptn());
				}
				else {
					r.new_bom_ptn(r.bom_ptn());
				}

				if (isNull(r.oper_cd())) {
					r.addStringColumn("no_oper_cd_str", "1");
				}
				if (isNull(r.oper_seq())) {
					r.addStringColumn("no_oper_seq_str", "1");
				}
				if (isNull(r.alt_grp_cd())) {
					r.addStringColumn("no_alt_grp_cd_str", "1");
				}
				if (isNull(r.expns_cd())) {
					r.addStringColumn("no_expns_cd_str", "1");
				}
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down1().setAll(up1());
		}

		@Override
		protected IfValidater getDuplicateValidater(String[] cols) {
			return new FXUCL_DuplicateValidater(true);
		}
	}

	/**
	 * Cnv01オペレーション.<p>
	 *
	 * 原価ＢＯＭ情報を置換する<br>
	 */
	public class Cnv01 extends MGBDL_BomLst_MC_A.Cnv01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up1());
			}
			catch (Exception e) {
				handleEx(e, up1());
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk03();
			MCList<Chk03_RsltR> notErrL = getChkList(up1());
			upd(notErrL);
		}

		/**
		 * 上り電文設定
		 */
		protected void editUp() {
			setPegNo(up1());
		}

		/**
		 * 原価ＢＯＭ情報の更新を行う。
		 * @param notErrL エラーのない上り電文
		 */
		protected void upd(MCList<Chk03_RsltR> notErrL) {
			if (notErrL.isEmpty()) {
				return;
			}
			executeBatchUpdate(MGBDL0530_MGT_BOM_U01(), null, notErrL);
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up1());
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up1().size());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk03() {
			MGBDL_BomLst.Chk03 ope = MGBDL_BomLst.crtChk03();
			MCRow.copyvalue(ope.up0(), up0());
			ope.up1().setAll(up1());
			MCRow.copyvalue(ope.up2(), up2());
			ope.exec();
			MCRow.copyvalue(up0(), ope.down0());
			up1().setAll(ope.down1());
		}
	}

	//FMCB CUSTOM END
}