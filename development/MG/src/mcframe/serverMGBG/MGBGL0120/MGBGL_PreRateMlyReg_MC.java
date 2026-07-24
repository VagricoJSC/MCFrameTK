package mcframe.serverMGBG.MGBGL0120;

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
import mcframe.serverMGBG.MGBGL0120.*;	// このimportはFrameManagerの自動生成で追加されました。

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import mcframe.serverFXUC.FXUCL0170.*;
import static mcframe.serverMGBG.MGBGL0120.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBGL_PreRateMlyReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBGL_PreRateMlyReg_MC extends MGBGL_PreRateMlyReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 一次配賦月次比率を検索する<br>
	 */
	public class Srch01 extends MGBGL_PreRateMlyReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			srch();
		}

		protected void srch() {
			executeQuery(down0(), MGBGL0120_MGT_PRE_RATE_MLY_S01(), up0());
		}
	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 一次配賦月次比率を登録・更新するために、チェックを行う<br>
	 */
	public class Chk01 extends MGBGL_PreRateMlyReg_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void initUpSub() {
			super.initUpSub();
			for(Chk01_RsltR r : up0()) {
				if(isNull(r.itm_cd())) {
					r.itm_sub1(null);
					r.itm_sub2(null);
					r.itm_sub3(null);
				}

				// リストロジックチェック用ＩＮ項目設定
				if (getTermInfoYM(r.ym()) != null) {
					r.term(getTermInfoYM(r.ym()).term());
				}
			}
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

			MCList<Chk01_RsltR> notErrUpdL = up0().subList(r -> !r.err_flg());
			if (notErrUpdL.isEmpty()) {
				return msgL;
			}
			
			MCList<MGT_PRE_RATE_MLY_R> selectL = MCList.create(MGT_PRE_RATE_MLY_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MGT_PRE_RATE_MLY_R.create("T"));
			selectForUpdateNoWaitPkWk("MGBGL0120_MGT_PRE_RATE_MLY_S01", selectL, selectL_bldr.getBaseDbc(), notErrUpdL);

			String[] keys = selectL_bldr.getBaseDbc().getKeyColumn();
			MCIndexKey idxkey = selectL.createIndex(keys);
			for (Chk01_RsltR r : notErrUpdL) {

				Comparable<?>[] binds = r.toArray(keys);
				MGT_PRE_RATE_MLY_R selectR = selectL.getFirst(idxkey, binds);

				if (!isNull(selectR)) {
					msgL.addAll(getRecordFoundMsg(getModuleID(), selectL.createRow(), r));
				}
			}
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			if (notErrL.isEmpty()) {
				return msgL;
			}

			String[] cols = getTarCols(notErrL.get(0));
			if (cols.length == 0) {
				if (notErrL.size() > 1) {
					msgL.add(new MCMessage(MGBGL0003));
				}
			}
			else {
				msgL.addAll(check(notErrL, cols, getAtLeastOneValidater(cols)));
				msgL.addAll(check(notErrL, cols, getDuplicateValidater(cols)));
			}

			for (Chk01_RsltR upR : notErrL){
				// DACチェック
				msgL.addAll(checkWritableWgCdDac(upR, Chk01_RsltR.$wg_cd));
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
	 * Chk02オペレーション.<p>
	 *
	 * 一次配賦月次比率を更新するために、チェックを行う<br>
	 */
	public class Chk02 extends MGBGL_PreRateMlyReg_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void initUpSub() {
			super.initUpSub();
			for(Chk02_RsltR r : up0()) {
				if(isNull(r.itm_cd())) {
					r.itm_sub1(null);
					r.itm_sub2(null);
					r.itm_sub3(null);
				}

				// リストロジックチェック用ＩＮ項目設定
				if (MAC_SA_TYP.isACT(r.sa_typ())) {
					r.act_mly_flg_str("1");
				}
				else if (MAC_SA_TYP.isPLN(r.sa_typ())) {
					r.pln_mly_flg_str("1");
				}
			}
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

			MCList<Chk02_RsltR> notErrUpdL = up0().subList(r -> !r.err_flg());
			if (notErrUpdL.isEmpty()) {
				return msgL;
			}
			
			MCList<MGT_PRE_RATE_MLY_R> selectL = MCList.create(MGT_PRE_RATE_MLY_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MGT_PRE_RATE_MLY_R.create("T"));
			selectForUpdateNoWaitPkWk("MGBGL0120_MGT_PRE_RATE_MLY_S02", selectL, selectL_bldr.getBaseDbc(), notErrUpdL);

			String[] keys = selectL_bldr.getBaseDbc().getKeyColumn();
			MCIndexKey idxkey = selectL.createIndex(keys);
			for (Chk02_RsltR r : notErrUpdL) {

				Comparable<?>[] binds = r.toArray(keys);
				MGT_PRE_RATE_MLY_R selectR = selectL.getFirst(idxkey, binds);

				if (isNull(selectR)) {
					if (r.isStatusModify()) {
						msgL.addAll(getRecordNotFoundMsg(getModuleID(), selectL.createRow(), r));
					}
				}
				else {
					if (r.isStatusCreate()) {
						msgL.addAll(getRecordFoundMsg(getModuleID(), selectL.createRow(), r));
					}
					else {
						selectR.setAttributes(r);
						// 更新カウンタチェック
						msgL.addAll(checkUpdCntrNE(r, Chk02_RsltR.$upd_cntr, selectR));
						// DACチェック
						msgL.addAll(checkWritableWgCdDac(selectR, MGT_PRE_RATE_MLY_R.$wg_cd));
					}
				}
			}
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk02_RsltR> notErrL = getChkList(up0());
			if (notErrL.isEmpty()) {
				return msgL;
			}

			String[] cols = getTarCols(notErrL.get(0));
			if (cols.length == 0) {
				if (notErrL.subList(r -> r.isStatusCreate()).size() > 0) {
					msgL.add(new MCMessage(MGBGL0003));
				}
			}
			else {
				msgL.addAll(check(notErrL, cols, getAtLeastOneValidater(cols)));
				msgL.addAll(check(notErrL, cols, getDuplicateValidater(cols)));
			}

			for (Chk02_RsltR upR : notErrL){
				// DACチェック
				msgL.addAll(checkWritableWgCdDac(upR, Chk02_RsltR.$wg_cd));
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
	 * 一次配賦月次比率を削除するために、チェックを行う<br>
	 */
	public class Chk03 extends MGBGL_PreRateMlyReg_MC_A.Chk03 {
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

			MCList<Chk03_RsltR> notErrL = getChkList(up0());
			if (notErrL.isEmpty()) {
				return msgL;
			}
			
			MCList<MGT_PRE_RATE_MLY_R> selectL = MCList.create(MGT_PRE_RATE_MLY_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MGT_PRE_RATE_MLY_R.create("T"));
			selectForUpdateNoWaitPkWk("MGBGL0120_MGT_PRE_RATE_MLY_S03", selectL, selectL_bldr.getBaseDbc(), notErrL);

			String[] keys = selectL_bldr.getBaseDbc().getKeyColumn();
			MCIndexKey idxkey = selectL.createIndex(keys);
			for (Chk03_RsltR r : notErrL) {

				Comparable<?>[] binds = r.toArray(keys);
				MGT_PRE_RATE_MLY_R selectR = selectL.getFirst(idxkey, binds);

				if (isNull(selectR)) {
					msgL.addAll(getRecordNotFoundMsg(getModuleID(), selectL.createRow(), r));
				}
				else {
					selectR.setAttributes(r);
					// 更新カウンタチェック
					msgL.addAll(checkUpdCntrNE(r, Chk03_RsltR.$upd_cntr, selectR));
					// DACチェック
					msgL.addAll(checkWritableWgCdDac(selectR, MGT_PRE_RATE_MLY_R.$wg_cd));
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
	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 一次配賦月次比率を登録する<br>
	 */
	public class Ins01 extends MGBGL_PreRateMlyReg_MC_A.Ins01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk01();
			throwUpdErr();
			upd();
		}

		protected void editUp() {
			setPegNo(up0());
		}

		protected void callThisChk01() {
			MGBGL_PreRateMlyReg.Chk01 ope = MGBGL_PreRateMlyReg.crtChk01();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		protected void upd() {
			if(up0().isEmpty()) {
				return;
			}
			MCList<MGT_PRE_RATE_MLY_R> dbcL = MCList.create(MGT_PRE_RATE_MLY_R.class);
			up0().forEach(r -> dbcL.add(r.dbc()));
			dbUpdByStatus(dbcL);
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 一次配賦月次比率を更新する<br>
	 */
	public class Upd01 extends MGBGL_PreRateMlyReg_MC_A.Upd01 {
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
			upd(notErrL);
		}

		protected void editUp() {
			setPegNo(up0());
		}

		protected void callThisChk02() {
			MGBGL_PreRateMlyReg.Chk02 ope = MGBGL_PreRateMlyReg.crtChk02();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		protected void upd(MCList<Chk02_RsltR> notErrL) {
			if(notErrL.isEmpty()) {
				return;
			}
			MCList<MGT_PRE_RATE_MLY_R> dbcL = MCList.create(MGT_PRE_RATE_MLY_R.class);
			notErrL.forEach(r -> dbcL.add(r.dbc()));
			dbUpdByStatus(dbcL);
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
	 * Del01オペレーション.<p>
	 *
	 * 一次配賦月次比率を削除する<br>
	 */
	public class Del01 extends MGBGL_PreRateMlyReg_MC_A.Del01 {
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
			callThisChk03();
			MCList<Chk03_RsltR> notErrL = getChkList(up0());
			del(notErrL);
		}

		protected void editUp() {
			setPegNo(up0());
		}

		protected void callThisChk03() {
			MGBGL_PreRateMlyReg.Chk03 ope = MGBGL_PreRateMlyReg.crtChk03();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		protected void del(MCList<Chk03_RsltR> notErrL) {
			if(notErrL.isEmpty()) {
				return;
			}
			MCList<MGT_PRE_RATE_MLY_R> dbcL = MCList.create(MGT_PRE_RATE_MLY_R.class);
			notErrL.forEach(r -> dbcL.add(r.dbc()));
			dbDeleteKey("MGBGL0120_MGT_PRE_RATE_MLY_D01", dbcL, MCQueryApiBuilder.create(MGT_PRE_RATE_MLY_R.create("T")));
		}
		
		protected void setDown() {
			down0().setAll(up0());
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
	}

	// -----------------------------------------------
	// Common
	protected String[] getTarCols(MCConstRow bind) {
		List<String> l = new ArrayList<String>();
		MAM_PRE_ALC_PTN_R ptn = getPreAlcPtnR(bind);
		for (Map.Entry<String, String> e : bind.getExtMap("SHOW").entrySet()) {
			if (MAC_PRE_ALC_TYP.isTARGET(ptn.getString(e.getValue()))) {
				l.add(e.getKey());
			}
		}
		return l.toArray(new String[]{});
	}
	protected MAM_PRE_ALC_PTN_R getPreAlcPtnR(MCRow bind) {
		MAM_PRE_ALC_RATE_R dbc = MAM_PRE_ALC_RATE_R.create();
		if (dbSelectKey("MGBGL0120_MAM_PRE_ALC_RATE_S01",
				dbc, MCQueryApiBuilder.create(MAM_PRE_ALC_RATE_R.create("T")), bind) == 0) {
			return null;
		}
		MAM_PRE_ALC_PTN_R ptn = MAM_PRE_ALC_PTN_R.create();
		dbSelectKey("MGBGL0120_MAM_PRE_ALC_PTN_S01",
				ptn, MCQueryApiBuilder.create(MAM_PRE_ALC_PTN_R.create("T")), dbc);
		return ptn;
	}

	//FMCB CUSTOM END
}