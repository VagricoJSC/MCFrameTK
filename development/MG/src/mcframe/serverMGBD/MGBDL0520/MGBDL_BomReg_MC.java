package mcframe.serverMGBD.MGBDL0520;

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
import mcframe.serverMGBD.MGBDL0520.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.FXUCL_DuplicateValidater;
import mcframe.serverFXUC.FXUCL0170.IfValidater;
import static mcframe.serverMGBD.MGBDL0520.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBDL_BomReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBDL_BomReg_MC extends MGBDL_BomReg_MC_A{
	//FMCB CUSTOM START
	
	protected static final String OPE_INS = "0";

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 品目工程情報を検索する<br>
	 */
	public class Srch01 extends MGBDL_BomReg_MC_A.Srch01 {
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
			if (up0().cmn_flg()) {
				up0().wg_cd(MAC_STR.NULL_VAL.value());
			}
		}
		
		protected void srch() {
			executeQuery(down0(), MGBDL0520_MGT_BOM_S01(), up0());
		}
	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 原価ＢＯＭ情報を登録・訂正するために、チェックを行う<br>
	 */
	public class Chk01 extends MGBDL_BomReg_MC_A.Chk01 {
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
			
			checkParentExists(msgL);
			
			MCList<MGT_BOM_R> selectL = MCList.create(MGT_BOM_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MGT_BOM_R.create("T"));
			selectForUpdateNoWaitPkWk("MGBDL0520_MGT_BOM_S01", selectL, selectL_bldr.getBaseDbc(), notErrL);

			String[] keys = selectL_bldr.getBaseDbc().getKeyColumn();
			MCIndexKey idxkey = selectL.createIndex(keys);
			for (Chk01_RsltR r : notErrL) {

				Comparable<?>[] binds = r.toArray(keys);
				MGT_BOM_R selectR = selectL.getFirst(idxkey, binds);

				if (isNull(selectR)) {
					if (r.isStatusModify()) {
						msgL.addAll(getRecordNotFoundMsg(getModuleID(), selectL.createRow(), r));
					}
				}
				else {
					selectR.setAttributes(r);
					if (r.isStatusModify()) {
						msgL.addAll(checkUpdCntrNE(r, Chk01_RsltR.$upd_cntr, selectR));
					}
					else {
						msgL.addAll(getRecordFoundMsg(getModuleID(), selectL.createRow(), r));
					}
					if (r.isStatusModify()) {
						if (up1().wg_flg()) {
							// DACチェック
							msgL.addAll(checkWritableWgCdDac(selectR, MGT_BOM_R.$wg_cd));
						}
					}
				}
			}
			return msgL;
		}
		
		protected void checkParentExists(MCMessageList msgList) {
			if (!isSame(up1().ope(), OPE_INS)) {
				return ;
			}
			
			Chk01_RsltR r = up0().get(0);

			MGT_BOM_R t = MGT_BOM_R.create("T");

			int i = execDbCount("MGBDL0520_MGT_BOM_S02", t,
					t.par_itm_cd.eq(bind("par_itm_cd"))
							.and(t.par_itm_sub1.eq(bind("par_itm_sub1")))
							.and(t.par_itm_sub2.eq(bind("par_itm_sub2")))
							.and(t.par_itm_sub3.eq(bind("par_itm_sub3")))
							.and(t.wg_cd.eq(bind("wg_cd")))
							.and(t.term.eq(bind("term")))
							.and(t.calc_ctg_cd.eq(bind("calc_ctg_cd")))
							.and(t.bom_ptn.eq(bind("bom_ptn"))),
					r);
			if (i > 0) {
				msgList.add(new MCMessage(MGBDL0045,
						r.calc_ctg_cd(), r.wg_cd(), r.term(), 
						toDispItm(r.par_itm_cd(), r.par_itm_sub1(), r.par_itm_sub2(), r.par_itm_sub3()),
						r.bom_ptn()));
			}

		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk01_RsltR> notErrL = getChkList(up0());

			msgL.addAll(chkStdFix(notErrL));
			msgL.addAll(chkParChdDuplicate(notErrL));

			for (Chk01_RsltR upR : notErrL){

				// 小数有効桁数チェック
				msgL.addAll(checkDecPlace(upR, Chk01_RsltR.$par_dec_place, Chk01_RsltR.$par_rqmt_qty));
				msgL.addAll(checkDecPlace(upR, Chk01_RsltR.$chd_dec_place, Chk01_RsltR.$chd_rqmt_qty));
				msgL.addAll(checkDecPlace(upR, Chk01_RsltR.$chd_dec_place, Chk01_RsltR.$chd_base_qty));
				msgL.addAll(checkDecPlace(upR, Chk01_RsltR.$chd_dec_place, Chk01_RsltR.$fxd_chd_rqmt_qty));
				msgL.addAll(checkDecPlace(upR, Chk01_RsltR.$chd_dec_place, Chk01_RsltR.$chd_min_qty));
				msgL.addAll(checkDecPlace(upR, Chk01_RsltR.$chd_dec_place, Chk01_RsltR.$chd_batch_qty));
				
				if (up1().wg_flg()) {
					// DACチェック
					msgL.addAll(checkWritableWgCdDac(upR, Chk01_RsltR.$wg_cd));
				}
			}

			return msgL;
		}

		@Override
		protected IfValidater getDuplicateValidater(String[] cols) {
			return new FXUCL_DuplicateValidater(true);
		}

		@Override
		protected IfValidater getReqValidater(String col) {
			if (isSame(col, Chk01_RsltR.$oper_seq)) {
				return new MAUDL_RequiredValidater_Status(r -> !isNull(((Chk01_RsltR)r).oper_cd()));
			}
			if (isSame(col, Chk01_RsltR.$alt_itm_ratio)) {
				return new MAUDL_RequiredValidater_Status(r -> !isNull(((Chk01_RsltR)r).alt_grp_cd()));
			}
			return super.getReqValidater(col);
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			setDown();
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
	 * 原価ＢＯＭ情報を削除するために、チェックを行う<br>
	 */
	public class Chk02 extends MGBDL_BomReg_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void initUpSub() {
			super.initUpSub();

			if (up1().cmn_flg()) {
				for (Chk02_RsltR r : up0()) {
					r.wg_cd(MAC_STR.NULL_VAL.value());
				}
			}
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
			selectForUpdateNoWaitPkWk("MGBDL0520_MGT_BOM_S03", selectL, selectL_bldr.getBaseDbc(), notErrL);

			String[] keys = selectL_bldr.getBaseDbc().getKeyColumn();
			MCIndexKey idxkey = selectL.createIndex(keys);
			for (Chk02_RsltR r : notErrL) {

				Comparable<?>[] binds = r.dbc().toArray(keys);
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
			msgL.addAll(chkParChdDuplicate(notErrL));

			return msgL;
		}

		@Override
		protected IfValidater getDuplicateValidater(String[] cols) {
			return new FXUCL_DuplicateValidater(true);
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			setDown();
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 原価ＢＯＭ情報を訂正する<br>
	 */
	public class Upd01 extends MGBDL_BomReg_MC_A.Upd01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				if (!isSame(up1().ope(), OPE_INS)) {
					handleEx(e, up0());
				}
				else {
					throw e;
				}
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk01();
			if (isSame(up1().ope(), OPE_INS)) {
				throwUpdErr();
			}
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
			MGBDL_BomReg.Chk01 ope = MGBDL_BomReg.crtChk01();
			ope.up0().setAll(up0());
			MCRow.copyvalue(ope.up1(), up1());
			ope.exec();
		}

		/**
		 * 原価ＢＯＭ情報の登録を行う。
		 * @param notErrL エラーのない上り電文
		 */
		protected void upd(MCList<Chk01_RsltR> notErrL) {
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
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 原価ＢＯＭ情報を削除する<br>
	 */
	public class Del01 extends MGBDL_BomReg_MC_A.Del01 {
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
			MGBDL_BomReg.Chk02 ope = MGBDL_BomReg.crtChk02();
			ope.up0().setAll(up0());
			MCRow.copyvalue(ope.up1(), up1());
			ope.exec();
		}

		/**
		 * 原価ＢＯＭ情報の削除を行う。
		 * @param notErrL エラーのない上り電文
		 */
		protected void del(MCList<Chk02_RsltR> notErrL) {
			if(notErrL.isEmpty()) {
				return;
			}
			MCList<MGT_BOM_R> dbcL = MCList.create(MGT_BOM_R.class);
			notErrL.forEach(r -> dbcL.add(r.dbc()));
			dbDeleteKey("MGBDL0520_MGT_BOM_D01", dbcL, MCQueryApiBuilder.create(MGT_BOM_R.create("T")));
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}

	/**
	 * 親品目と子品目の重複チェック
	 */
	protected <E extends MCRow> MCMessageList chkParChdDuplicate(MCList<E> up) {
		MCMessageList msgList = new MCMessageList();
		for (E upR : up) {
			MGT_BOM_R row = upR instanceof Chk01_RsltR ? ((Chk01_RsltR)upR).dbc() : ((Chk02_RsltR)upR).dbc();
			if (!isNullOr(row.chd_itm_cd(), row.chd_itm_sub1(), row.chd_itm_sub2(),
					row.chd_itm_sub3())) {
				if (isSame(row.chd_itm_cd(), row.par_itm_cd())
						&& isSame(row.chd_itm_sub1(), row.par_itm_sub1())
						&& isSame(row.chd_itm_sub2(), row.par_itm_sub2())
						&& isSame(row.chd_itm_sub3(), row.par_itm_sub3())) {
					msgList.add(new MCMessage(upR, null, MGBDD0033, toDispItm(row.par_itm_cd(),
							row.par_itm_sub1(), row.par_itm_sub2(), row.par_itm_sub3())));
				}
			}
		}
		return msgList;
	}

	/**
	 * 標準単価確定チェック
	 */
	protected <E extends MCRow> MCMessageList chkStdFix(MCList<E> up) {
		MCMessageList msgList = new MCMessageList();
		if (up.isEmpty()) {
			return msgList;
		}
		
		String[] keys = new String[]{MGT_BOM_R.$term, MGT_BOM_R.$calc_ctg_cd,
				MGT_BOM_R.$wg_cd, MGT_BOM_R.$par_itm_cd, MGT_BOM_R.$par_itm_sub1, MGT_BOM_R.$par_itm_sub2,
				MGT_BOM_R.$par_itm_sub3};

		MCList<MGT_BOM_R> bindL = MCList.create(MGT_BOM_R.class);
		for (E r : up) {
			if (r instanceof Chk01_RsltR) {
				bindL.add(((Chk01_RsltR) r).dbc());
			}
			else if (r instanceof Chk02_RsltR) {
				bindL.add(((Chk02_RsltR) r).dbc());
			}
		}
		bindL = bindL.groupBy(keys);

		MCQueryApiBuilder bindL_bldr = MCQueryApiBuilder.create(MGT_BOM_R.create("T"));
		dbWkDelete("MGBDL0520_MGW_BOM_D01", bindL_bldr.getBaseDbc());
		dbWkInsert("MGBDL0520_MGW_BOM_I01", bindL, bindL_bldr.getBaseDbc());
		MCList<MGT_BOM_R> errL = MCList.create(MGT_BOM_R.class);
		executeQuery(errL, MGBDL0520_MGW_BOM_KEY_S01());
		dbWkDelete("MGBDL0520_MGW_BOM_D02", bindL_bldr.getBaseDbc());
		if (errL.isEmpty()) {
			return msgList;
		}

		MCIndexKey idxkey = up.createIndex(keys);
		for (MGT_BOM_R r : errL) {
			Comparable<?>[] binds = r.toArray(keys);
			for (E row : up.subList(idxkey, binds)) {
				msgList.add(new MCMessage(row, null, MGBDL0021,
						toYMString(r.term()), r.calc_ctg_cd(), r.wg_cd(), toDispItm(r.par_itm_cd(), r.par_itm_sub1(), r.par_itm_sub2(), r.par_itm_sub3()),
						toDispGUIIndex(row)));
			}
		}
		return msgList;
	}

	//FMCB CUSTOM END
}