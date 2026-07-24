package mcframe.serverMGBG.MGBGL5100;

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
import mcframe.serverMGBG.MGBGL5100.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMGBG.MGBGL5100.Query.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBGL_PlnAlcService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBGL_PlnAlcService_MC extends MGBGL_PlnAlcService_MC_A{
	//FMCB CUSTOM START

	/**
	 * PlnAlc_Chk01オペレーション.<p>
	 *
	 * 配賦費用計画作成前チェック<br>
	 */
	public class PlnAlc_Chk01 extends MGBGL_PlnAlcService_MC_A.PlnAlc_Chk01 {

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

			MGT_PLN_ALC_AMT_R t = MGT_PLN_ALC_AMT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			createPlnAlcAmt(dbc_bldr, t);
			dbc_bldr.addWhereWithAnd(t.pre_alc_fin_flg.eq(value(true)));
			dbc_bldr.setSelect(count(value(1)).as("cnt"));
			dbc_bldr.clearOrderBy();

			MCRow result = MCRow.create();
			result.addNumberColumn("cnt");
			dbc_bldr.buildSelect("MGBGL5100_MGT_PLN_ALC_AMT_S01").executeQuery(up0(), result);

			int count = result.getNumberNE("cnt").intValue();
			if(count > 0) {
				msgL.add(new MCMessage(MGBGL0001));
			}
			return msgL;
		}

		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}

	}
	/**
	 * PlnAlc_Upd01オペレーション.<p>
	 *
	 * 配賦費用計画を作成する。<br>
	 */
	public class PlnAlc_Upd01 extends MGBGL_PlnAlcService_MC_A.PlnAlc_Upd01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				initBatchLogger(dbTran());
				writeStartLogWithLogger(null);
				execMain();
			}
			catch (Exception ex) {
				handleExWithLogger(ex);
			}
			finally {
				writeEndLogWithLogger(null);
			}
		}

		protected void execMain(){
			insWork();
			main();
			delWork();
		}

		protected void main() {
			MGT_PLN_ALC_AMT_R t = MGT_PLN_ALC_AMT_R.create("T");
			MCQueryApiBuilder plnAlcAmtR_bldr = MCQueryApiBuilder.create(t);
			createPlnAlcAmt(plnAlcAmtR_bldr, t);

			// ロック、チェック、削除、挿入を行う
			lock(plnAlcAmtR_bldr, t);
			callThisChk01();
			throwUpdErr();
			del(plnAlcAmtR_bldr, t);
			ins();
		}

		protected void insWork() {
			delWork();

			MCList<MAM_WG_R> wgL = MCList.create(MAM_WG_R.class);
			if (isNull(up0().wg_cd())) {
				MCList<MAM_WG_R> wgL2 = MCList.create(MAM_WG_R.class);
				executeQuery(wgL2, MGBGL5100_MAM_WG_S01(), up0());
				for(MAM_WG_R wgR : wgL2) {
					MAM_WG_R x = MAM_WG_R.create();
					x.wg_cd(wgR.wg_cd());
					wgL.add(x);
				}
			}
			else {
				for (String wg : MCStringUtil.arrayValueSplit(up0().wg_cd())) {
					MAM_WG_R x = MAM_WG_R.create();
					x.wg_cd(wg);
					wgL.add(x);
				}
			}

			MCQueryApiBuilder wgL_bldr = MCQueryApiBuilder.create(MAM_WG_R.create("T"));
			dbWkInsert("MGBGL5100_MAW_WG_KEY_I01", wgL, wgL_bldr.getBaseDbc());
		}

		protected void delWork() {
			dbWkDelete("MGBGL5100_MAW_WG_KEY_D01", MCQueryApiBuilder.create(MAM_WG_R.create("T")).getBaseDbc());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MGBGL_PlnAlcService.PlnAlc_Chk01 o = MGBGL_PlnAlcService.crtPlnAlc_Chk01();
			MCRow.copyall(o.up0(), up0());
			o.exec();
			MCRow.copyall(up0(), o.down0());
		}

		protected void lock(MCQueryApiBuilder dbc_bldr, MGT_PLN_ALC_AMT_R t) {
			dbSelectForUpdateNoWaitNoFetch("MGBGL5100_MGT_PLN_ALC_AMT_S02", dbc_bldr, up0());
		}

		protected void del(MCQueryApiBuilder dbc_bldr, MGT_PLN_ALC_AMT_R t) {
			dbc_bldr.buildDelete("MGBGL5100_MGT_PLN_ALC_AMT_D01").executeUpdate(up0());
		}

		protected void ins() {
			executeUpdate(MGBGL5100_MGT_PLN_ALC_AMT_I01(), up0());
		}
	
	}

	protected void createPlnAlcAmt(MCQueryApiBuilder dbc_bldr, MGT_PLN_ALC_AMT_R t) {
		MAW_WG_KEY_R S1_WG = MAW_WG_KEY_R.create("W");
		dbc_bldr.setSelect(dbc_bldr.getBaseDbc().getKeyColumn$());
		dbc_bldr.addWhereWithAnd(t.calc_ctg_cd.eq(bind("calc_ctg_cd_to")));
		dbc_bldr.addWhereWithAnd(t.ym.between(bind("ym_fr"), bind("ym_to")));
		dbc_bldr.addWhereWithAnd(t.alc_rec_typ.eq(value(MGC_ALC_REC_TYP.AC_IMP.value())));
		dbc_bldr.addWhereWithAnd(exists(subQuery().select(value(1)).from(S1_WG).where(S1_WG.wg_cd.eq(t.wg_cd))));
		dbc_bldr.setOrderByAsc(dbc_bldr.getBaseDbc().getKeyColumn$());
	}

	//FMCB CUSTOM END
}