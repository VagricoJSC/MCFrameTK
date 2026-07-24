package mcframe.serverMGBD.MGBDL0500;

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
import mcframe.serverMGBD.MGBDL0500.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMGBD.MGBDL0500.Query.*;

import mcframe.serverFXUC.FXUCL0170.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverCore.mcjdbc.MCCursor;
import mcframe.serverCore.resource.MCConst;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBDL_ItmReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBDL_ItmReg_MC extends MGBDL_ItmReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価品目情報を検索する<br>
	 */
	public class Srch01 extends MGBDL_ItmReg_MC_A.Srch01 {
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
			up0().addStringColumn("fix_flg_str", toOnOffStr(up0().on_fix_flg(), up0().off_fix_flg()));
			setGrpFlg(up0(), "itm_grp");
			up0().addStringColumn("del_flg_str", toOnOffStr(up0().on_del_flg(), up0().off_del_flg()));
		}

		protected void srch() {
			executeQuery(down0(), MGBDL0500_MGT_ITM_S01(), up0());
		}
	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 原価品目情報を登録・訂正するために、チェックを行う<br>
	 */
	public class Chk01 extends MGBDL_ItmReg_MC_A.Chk01 {
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

			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			if (notErrL.isEmpty()) {
				return msgL;
			}
			
			MCList<MGT_ITM_R> selectL = MCList.create(MGT_ITM_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MGT_ITM_R.create("T"));
			if (up1().file_imp_flg()) {
				selectPkWk("MGBDL0500_MGT_ITM_S01", selectL, selectL_bldr.getBaseDbc(), notErrL, false, MGT_ITM_R.$fix_flg);
			}
			else {
				selectForUpdateNoWaitPkWk("MGBDL0500_MGT_ITM_S02", selectL, selectL_bldr.getBaseDbc(), notErrL, MGT_ITM_R.$fix_flg);
			}

			String[] keys = selectL.createRow().getKeyColumn();
			MCIndexKey idxkey = selectL.createIndex(keys);
			for (Chk01_RsltR r : notErrL) {

				Comparable<?>[] binds = r.toArray(keys);
				MGT_ITM_R selectR = selectL.getFirst(idxkey, binds);

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
						// 個別チェック
						if (selectR.fix_flg()) {
							msgL.add(new MCMessage(r, null, MGBDL0043,
									toYMString(r.term()), toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
									toDispGUIIndex(r)));
						}
						
						// DACチェック
						msgL.addAll(checkWritableWgCdDac(selectR, MGT_ITM_R.$wg_cd));
					}
				}
			}
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk01_RsltR> notErrL = getChkList(up0());

			for (Chk01_RsltR upR : notErrL){

				// 小数有効桁数チェック
				msgL.addAll(checkDecPlace(upR, Chk01_RsltR.$dec_place, Chk01_RsltR.$std_qty));
				
				// DACチェック
				msgL.addAll(checkWritableWgCdDac(upR, MGT_ITM_R.$wg_cd));
			}

			return msgL;
		}
		@Override
		protected <E extends MCConstRow> MCMessageList doSvrChkListLogicMain(
				MCNumber paramIndex, MCList<E> chkTarL, String chkTarCol,
				String listLogicId, String listIn, String listInBase, String listOut,
				String listOutBase) {
			
			if (isSame(chkTarCol, Chk01_RsltR.$itm_sub3)) {
				chkTarL.removeAll(chkTarL.subList(e -> e.getBooleanNE(MGT_ITM_R.$non_calc_flg)));
				if (chkTarL.isEmpty()) {
					return new MCMessageList();
				}
			}
			return super.doSvrChkListLogicMain(paramIndex, chkTarL, chkTarCol,
					listLogicId, listIn, listInBase, listOut, listOutBase);
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
	 * 原価品目情報を削除するために、チェックを行う<br>
	 */
	public class Chk02 extends MGBDL_ItmReg_MC_A.Chk02 {
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
			
			MCList<MGT_ITM_R> selectL = MCList.create(MGT_ITM_R.class);
			selectForUpdateNoWaitPkWk("MGBDL0500_MGT_ITM_S03",
					selectL, MCQueryApiBuilder.create(MGT_ITM_R.create("T")).getBaseDbc(), notErrL);

			String[] keys = selectL.createRow().getKeyColumn();
			MCIndexKey idxkey = selectL.createIndex(keys);
			for (Chk02_RsltR r : notErrL) {

				Comparable<?>[] binds = r.toArray(keys);
				MGT_ITM_R selectR = selectL.getFirst(idxkey, binds);

				if (isNull(selectR)) {
					msgL.addAll(getRecordNotFoundMsg(getModuleID(), selectL.createRow(), r));
				}
				else {
					selectR.setAttributes(r);
					// 更新カウンタチェック
					msgL.addAll(checkUpdCntrNE(r, Chk02_RsltR.$upd_cntr, selectR));
					// DACチェック
					msgL.addAll(checkWritableWgCdDac(selectR, MGT_ITM_DTL_R.$wg_cd));
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
	 * Chk03オペレーション.<p>
	 *
	 * 品目詳細マスタ（品目マスタ）を元に原価品目情報を登録するために、チェックを行う<br>
	 */
	public class Chk03 extends MGBDL_ItmReg_MC_A.Chk03 {
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
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			msgL.addAll(checkSub());
			return msgL;
		}

		protected MCMessageList checkSub() {
			MCMessageList msgL = new MCMessageList();
			if(!hasErrFlgOn(up0())) {
				// 計算パタンチェック 
				up0().addStringColumn("with_del_flg_str", toFalseStr(up0().with_del_flg()));
				up0().addStringColumn("fix_flg_str", toTrueStr(!up0().ins_only_flg()));
				up0().addStringColumn("all_wg_flg", toTrueStr(isNull(up0().wg_cd())));
				up0().addStringColumn("release_flg_str", toTrueStr(!up0().with_no_release_flg()));
				checkCalcPtn(MGBDL0500_MAM_ITM_DTL_S01(), MGBDL0038, msgL);
				checkCalcPtn(MGBDL0500_MAM_BOM_S01(), MGBDL0068, msgL);
				checkCalcPtn(MGBDL0500_MAM_ITM_SRCH_S01(), MGBDL0070, msgL);

				// DACチェック 
				if (up0().runtime_wg_flg()) {
					msgL.addAll(checkWritableWgCdDac(up0(), Chk03_InsR.$runtime_wg_cd));
				}
				else {
					String[] wgs = MCStringUtil.arrayValueSplit(up0().wg_cd());
					Chk03_InsR up0 = up0().clone();
					for (String wg : wgs) {
						up0.wg_cd(wg);
						msgL.addAll(checkWritableWgCdDac(up0, Chk03_InsR.$wg_cd));
					}
				}
			}
			return msgL;
		}

		protected void checkCalcPtn(MCQueryPlan sqlId, String msgId, MCMessageList msgL) {
			MCList<Chk03_RsltR> itmList = MCList.create(Chk03_RsltR.class);
			MCList<Chk03_RsltR> tmpList = MCList.create(Chk03_RsltR.class);
			String[] wgs = MCStringUtil.arrayValueSplit(up0().wg_cd());
			Chk03_InsR up0 = up0().clone();

			if (up0().runtime_wg_flg()) {
				executeQuery(itmList, sqlId, up0());
			}
			else {
				for (String wg : wgs) {
					up0.wg_cd(wg);
					up0.runtime_wg_cd(wg);
					executeQuery(tmpList, sqlId, up0);
					itmList.addAll(tmpList);
					if (itmList.size() > 100) {
						break;
					}
				}
			}
			for (Chk03_RsltR r : itmList) {
				if (isNull(r.calc_ptn_cd())) {
					MCMessage msg = new MCMessage(msgId, toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()));
					msgL.add(msg);
				}
			}
		}
		@Override
		protected MCMessageList doSvrChkValue(MCList<? extends MCConstRow> up) {
			MCMessageList msgL = super.doSvrChkValue(up);
			if (!up.isEmpty() && up.get(0) == up0()) {
				// 実行時ＷＧの必須チェック（システムパラメータ：DEF_WG_CDのため、実装仕様書に必須チェックの設定ができないので個別チェック）
				if(up0().runtime_wg_flg()) {
					msgL.addAll(check(up0(), Chk03_InsR.$runtime_wg_cd, new FXUCL_RequiredValidater()));
				}
			}
			return msgL;
		}

		@Override
		protected IfValidater getScaleAndLengthValidater(String col) {
			return new FXUCL_ScaleAndLengthValidater(r -> 1==0); // 桁数チェックは行わない
		}

		@Override
		protected IfValidater getReqValidater(String col) {
			if (isSame(col, Chk03_InsR.$wg_cd)) {
				return new MAUDL_RequiredValidater_Status(
						r -> !r.getBooleanNE(Chk03_InsR.$runtime_wg_flg));
			}
			return super.getReqValidater(col);
		}

		@Override
		protected <E extends MCConstRow> MCMessageList doSvrChkListLogicMain(
				MCNumber paramIndex, MCList<E> chkTarL, String chkTarCol,
				String listLogicId, String listIn, String listInBase, String listOut,
				String listOutBase) {
			if (isSame(chkTarCol, Chk03_InsR.$wg_cd)) {
				MCList<E> newTarL = chkTarL.createInstance();
				for (E r : chkTarL) {
					String wgCd = r.getStringNE(Chk03_InsR.$wg_cd);
					if (isNull(wgCd)) {
						continue ;
					}
					String[] wgs = MCStringUtil.arrayValueSplit(wgCd);
					for (String wg : wgs) {
						E newTarR = (E)r.clone();
						newTarR.setString(Chk03_InsR.$wg_cd, wg);
						newTarL.add(newTarR);
					}
				}
				return super.doSvrChkListLogicMain(paramIndex, newTarL, chkTarCol,
						listLogicId, listIn, listInBase, listOut, listOutBase);
			}
			return super.doSvrChkListLogicMain(paramIndex, chkTarL, chkTarCol,
					listLogicId, listIn, listInBase, listOut, listOutBase);
		}

		/** 下り電文設定 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 原価品目情報を登録、訂正する<br>
	 */
	public class Upd01 extends MGBDL_ItmReg_MC_A.Upd01 {
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
			MGBDL_ItmReg.Chk01 ope = MGBDL_ItmReg.crtChk01();
			ope.up0().setAll(up0());
			ope.up1().file_imp_flg(false);
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 原価品目情報の登録を行う。
		 * @param notErrL エラーのない上り電文
		 */
		protected void upd(MCList<Chk01_RsltR> notErrL) {
			if(notErrL.isEmpty()) {
				return;
			}
			MCList<MGT_ITM_R> dbcL = MCList.create(MGT_ITM_R.class);
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
	 * 原価品目情報を削除する<br>
	 */
	public class Del01 extends MGBDL_ItmReg_MC_A.Del01 {
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
			MGBDL_ItmReg.Chk02 ope = MGBDL_ItmReg.crtChk02();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 原価品目情報の削除を行う。
		 * @param notErrL エラーのない上り電文
		 */
		protected void del(MCList<Chk02_RsltR> notErrL) {
			if(notErrL.isEmpty()) {
				return;
			}
			MCList<MGT_ITM_R> dbcL = MCList.create(MGT_ITM_R.class);
			notErrL.forEach(r -> dbcL.add(r.dbc()));
			dbDeleteKey("MGBDL0500_MGT_ITM_D01", dbcL, MCQueryApiBuilder.create(MGT_ITM_R.create("T")));
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
	 * Ins01オペレーション.<p>
	 *
	 * 品目詳細マスタ（品目マスタ）を元に原価品目情報を登録する<br>
	 */
	public class Ins01 extends MGBDL_ItmReg_MC_A.Ins01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			
			// チェック処理
			callThisChk03();

			// エラーがあれば例外throw
			throwUpdErr();

			// 取込実行
			copyCalcItm();
		}

		/** チェック処理を実行する */
		protected void callThisChk03() {
			MGBDL_ItmReg.Chk03 ope = MGBDL_ItmReg.crtChk03();
			MCRow.copyall(ope.up0(), up0());

			ope.exec();

			MCRow.copyvalue(up0(), ope.down0());
		}

		protected void copyCalcItm() {
			String[] wgs = MCStringUtil.arrayValueSplit(up0().wg_cd());
			Chk03_InsR up0 = up0().clone();
			int cnt = 0;

			if (up0().runtime_wg_flg()) {
				cnt = updItm(up0());
			}
			else {
				for (String wg : wgs) {
					up0.wg_cd(wg);
					up0.runtime_wg_cd(wg);
					cnt += updItm(up0);
				}
			}
			if (cnt == 0) {
				MCMessagePool.add(new MCMessage(MGBDL0069));
			}
		}
		protected int updItm(Chk03_InsR up0) {
			int updCnt = 0;

			MCCursor<MGT_ITM_R> cur = openCursor(MGT_ITM_R.class,
					MGBDL0500_MAM_ITM_SRCH_S02(), up0, null, getFetchSize());

			while (cur.dbFetch() > 0) {
				MCList<MGT_ITM_R> regL = cur.getList();
				regL.addBooleanColumn("upd_flg", false);
				MCIndexKey idxRegL = regL.createIndex(
						MGT_ITM_R.$itm_cd,
						MGT_ITM_R.$itm_sub1,
						MGT_ITM_R.$itm_sub2,
						MGT_ITM_R.$itm_sub3,
						MGT_ITM_R.$term,
						MGT_ITM_R.$calc_ctg_cd,
						MGT_ITM_R.$wg_cd);
				
				MCQueryApiBuilder builder = MCQueryApiBuilder.create(MGT_ITM_R.create("T"));
				dbWkDelete("MGBDL0500_MGW_ITM_D01", builder.getBaseDbc());
				dbWkInsert("MGBDL0500_MGW_ITM_I01", regL, builder.getBaseDbc());
				
				MCList<MGT_ITM_R> updL = MCList.create(MGT_ITM_R.class);
				executeQuery(updL, MGBDL0500_MGT_ITM_S02());
				dbWkDelete("MGBDL0500_MGW_ITM_D02", builder.getBaseDbc());
				
				for (MGT_ITM_R updR : updL) {
					MGT_ITM_R regR = regL.getFirst(idxRegL, 
							updR.itm_cd()
							,updR.itm_sub1()
							,updR.itm_sub2()
							,updR.itm_sub3()
							,updR.term()
							,updR.calc_ctg_cd()
							,updR.wg_cd());
					regR.setBoolean("upd_flg", true);
					updR.calc_ptn_cd(regR.calc_ptn_cd());
					updR.std_qty(regR.std_qty());
					updR.cmn_upri_flg(false);
					updR.fix_flg(false);
					updR.non_calc_flg(false);
				}
				if (!updL.isEmpty()) {
					MGT_ITM_R upd = MGT_ITM_R.create("T");
					MCQueryApiBuilder updBuilder = MCQueryApiBuilder.create(upd);
					updBuilder.setSet(upd.calc_ptn_cd);
					updBuilder.addSet(upd.std_qty);
					updBuilder.addSet(upd.cmn_upri_flg);
					updBuilder.addSet(upd.fix_flg);
					updBuilder.addSet(upd.non_calc_flg);
					dbUpdateKey("MGBDL0500_MGT_ITM_U01", updL, updBuilder);
					updCnt = updCnt+updL.size();
				}

				MCList<MGT_ITM_R> insL = MCList.create(MGT_ITM_R.class);
				for (MGT_ITM_R regR : regL.subList("upd_flg", false)) {
					MGT_ITM_R insR = MGT_ITM_R.create();
					insR.itm_cd(regR.itm_cd());
					insR.itm_sub1(regR.itm_sub1());
					insR.itm_sub2(regR.itm_sub2());
					insR.itm_sub3(regR.itm_sub3());
					insR.term(regR.term());
					insR.calc_ctg_cd(regR.calc_ctg_cd());
					insR.wg_cd(regR.wg_cd());
					insR.calc_ptn_cd(regR.calc_ptn_cd());
					insR.std_qty(regR.std_qty());
					insL.add(insR);
				}
				if (!insL.isEmpty()) {
					dbInsert("MGBDL0500_MGT_ITM_I01", insL, MCQueryApiBuilder.create(MGT_ITM_R.create("T")));
					updCnt = updCnt+insL.size();
				}
			}
			return updCnt;
		}

		protected int getFetchSize() {
			int fetchSize = MCConst.app.getInteger("MG.MGBDL0500.fetch_size", 5000);
			if (fetchSize <= 0) {
				fetchSize = 5000;
			}
			return fetchSize;
		}
	}
	/**
	 * Imp01オペレーション.<p>
	 *
	 * ファイルから取り込んだ原価品目情報のチェック処理を行う<br>
	 */
	public class Imp01 extends MGBDL_ItmReg_MC_A.Imp01 {
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
			MGBDL_ItmReg.Chk01 ope = MGBDL_ItmReg.crtChk01();
			ope.up0().setAll(up0());
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

	//FMCB CUSTOM END
}