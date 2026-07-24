package mcframe.serverMGBF.MGBFL0310;

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
import mcframe.serverMG.dbc.*;
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
import mcframe.serverMGBF.MGBFL0310.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMGBF.MGBFL0310.Query.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBFL_StkLossSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBFL_StkLossSrch_MC extends MGBFL_StkLossSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 在庫評価損を検索する。<br>
	 */
	public class Srch01 extends MGBFL_StkLossSrch_MC_A.Srch01 {
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
			up0().addStringColumn("no_bp_flg_str", toTrueStr(up0().no_bp_flg()));
		}

		protected void srch() {
			executeQuery(down0(), MGBFL0310_MGT_STK_LOSS_S01(), up0());
		}
	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 在庫評価損を削除する前のチェックを行う。<br>
	 */
	public class Chk01 extends MGBFL_StkLossSrch_MC_A.Chk01 {
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
			if (!up0().isEmpty()) {
				execProcComm(up0().get(0));
			}
			msgL.addAll(lockAndCheckBase());
			return msgL;
		}

		protected MCMessageList lockAndCheckBase() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_RsltR> chkL = getChkList(up0());
			if (chkL.isEmpty()) {
				return msgL;
			}

			MCList<MGT_STK_LOSS_R> selectL = MCList.create(MGT_STK_LOSS_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MGT_STK_LOSS_R.create("T"));
			selectForUpdateNoWaitPkWk("MGBFL0310_MGT_STK_LOSS_S01", selectL, selectL_bldr.getBaseDbc(), chkL);

			String[] keys = selectL_bldr.getBaseDbc().getKeyColumn();
			MCIndexKey idxkey = selectL.createIndex(keys);

			for (Chk01_RsltR r : chkL) {
				Comparable<?>[] binds = r.toArray(keys);
				MGT_STK_LOSS_R selectR = selectL.getFirst(idxkey, binds);
				if (isNull(selectR)) {
					msgL.addAll(getRecordNotFoundMsg(getModuleID(), selectL.createRow(), r));
				}
				else {
					// 排他対象テーブルではないので更新カウンタのチェックはしない
					selectR.setAttributes(r);
					msgL.addAll(checkWritableWgCdDac(selectR, MGT_STK_LOSS_R.$wg_cd));
				}
			}
			return msgL;
		}

		protected void setDown() {
			down0().setAll(up0());
		}
	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 在庫評価損を一括で削除する前のチェックを行う。<br>
	 */
	public class Chk02 extends MGBFL_StkLossSrch_MC_A.Chk02 {
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
			execProcComm(up0());
			msgL.addAll(checkBase());
			return msgL;
		}

		protected MCMessageList checkBase() {
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(checkWritableWgCdDac(up0(), Chk02_CndR.$wg_cd));
			return msgL;
		}

		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 在庫評価損を削除する。<br>
	 */
	public class Del01 extends MGBFL_StkLossSrch_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk01();
			throwDelErr();
			del();
		}

		protected void editUp() {
			setPegNo(up0());
		}

		protected void callThisChk01() {
			MGBFL_StkLossSrch.Chk01 ope = MGBFL_StkLossSrch.crtChk01();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		protected void del() {
			MCList<MGT_STK_LOSS_R> dbcL = MCList.create(MGT_STK_LOSS_R.class);
			up0().forEach(r -> dbcL.add(r.dbc()));
			dbDeleteKey("MGBFL0310_MGT_STK_LOSS_D01", dbcL, MCQueryApiBuilder.create(MGT_STK_LOSS_R.create("T")));
		}
	}
	/**
	 * Del02オペレーション.<p>
	 *
	 * 在庫評価損を一括で削除する。<br>
	 */
	public class Del02 extends MGBFL_StkLossSrch_MC_A.Del02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk02();
			throwDelErr();
			lockAndDel();
		}

		protected void editUp() {
			String defWgCd = getSysParm("DEF_WG_CD");
			if (!isNullOrNullVal(defWgCd)) {
				up0().wg_cd(defWgCd) ;
			}
		}

		protected void callThisChk02() {
			MGBFL_StkLossSrch.Chk02 ope = MGBFL_StkLossSrch.crtChk02();
			MCRow.copyall(ope.up0(), up0());
			ope.exec();
		}

		protected void lockAndDel() {
			MGT_STK_LOSS_R t = MGT_STK_LOSS_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			createDbcForDel(t, dbc_bldr);
			dbSelectForUpdateNoWaitNoFetch("MGBFL0310_MGT_STK_LOSS_S02", dbc_bldr, up0());
			dbc_bldr.buildDelete("MGBFL0310_MGT_STK_LOSS_D02").executeUpdate(up0());
		}

		protected void createDbcForDel(MGT_STK_LOSS_R t, MCQueryApiBuilder dbc_bldr) {
			dbc_bldr.setSelect(dbc_bldr.getBaseDbc().getKeyColumn$());
			dbc_bldr.addWhereWithAnd(t.calc_no.eq(bind("calc_no")));
			dbc_bldr.addWhereWithAnd(t.calc_grp_cd.eq(bind("calc_grp_cd")));
			dbc_bldr.addWhereWithAnd(t.ym.eq(bind("ym")));
			dbc_bldr.addWhereWithAnd(t.wg_cd.eq(bind("wg_cd")));
			dbc_bldr.addWhereWithCutOffAnd(t.mng_dpt_cd.like(bind("mng_dpt_cd")));
			dbc_bldr.addWhereWithCutOffAnd(t.stk_eval_cd.like(bind("stk_eval_cd")));
			dbc_bldr.addOrderByAsc(dbc_bldr.getBaseDbc().getKeyColumn$());
		}
	}

	// ////////////////////////////////////////////////////////////////////////
	// Chk01/Chk02 Common
	protected void execProcComm(MCRow r) {
		String procId = "MGPA_CALC_FIX$P_CHK_FIX";
		execProc(createSqlId(LOGIC_ID, procId, "01"), procId, r, null, ":calc_grp_cd, :ym");
	}

	//FMCB CUSTOM END
}