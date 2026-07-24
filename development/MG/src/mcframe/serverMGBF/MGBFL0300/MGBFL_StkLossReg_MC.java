package mcframe.serverMGBF.MGBFL0300;

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
import mcframe.serverMGBF.MGBFL0300.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMGBF.MGBFL0300.Query.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBFL_StkLossReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBFL_StkLossReg_MC extends MGBFL_StkLossReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 在庫評価損を検索する。<br>
	 */
	public class Srch01 extends MGBFL_StkLossReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			editUp();
			makeWk();
			srch();
		}

		protected void editUp() {
			up0().addStringColumn("dummy_string", MAC_STR.NULL_VAL.value());
			up0().addStringColumn("amt_rnd_typ", getCoParm().amt_rnd_typ());
			up0().addNumberColumn("amt_dec_place", getCoParm().amt_dec_place());
			up0().addStringColumn("no_bp_flg_str", toTrueStr(up0().no_bp_flg()));
			up0().addStringColumn("unsumming_flg_str", toTrueStr(up0().unsumming_flg() && !up0().summed_flg()));
			up0().addStringColumn("summed_flg_str", toTrueStr(!up0().unsumming_flg() && up0().summed_flg()));
		}

		protected void makeWk() {
			String procId = "MGPA_STK_EVAL$P_SET_WORK";
			execProc(createSqlId(LOGIC_ID, procId, "01"), procId, up0(), null, ":calc_grp_cd, :stk_eval_cd, :ym");
		}

		protected void srch() {
			MAM_STK_EVAL_R dbc = MAM_STK_EVAL_R.create();
			MAM_STK_EVAL_R t = MAM_STK_EVAL_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.lump_rate_flg, t.upri_set_typ);
			dbSelectKey("MGBFL0300_MAM_STK_EVAL_S01", dbc, dbc_bldr, up0());
			up0().addStringColumn(MAM_STK_EVAL_R.$upri_set_typ, dbc.upri_set_typ());
			up0().addStringColumn("upri_set_typ_std", MAC_UPRI_SET_TYP.STD.value());

			MCQueryPlan sql = null;
			if (dbc.lump_rate_flg()) {
				sql = MGBFL0300_MGT_ACC_TOP_S02();
			}
			else {
				sql = MGBFL0300_MGT_ACC_TOP_S01();
			}
			executeQuery(down0(), sql, up0());
		}

		@Override
		protected void editListMain() {
			super.editListMain();

			if (down0().isEmpty()) {
				return ;
			}

			for (Srch01_RsltR r : down0()) {
				if (r.stk_amt() == null) {
					r.stk_amt(0);
				}
				if (r.eval_amt() == null) {
					r.eval_amt(0);
				}
				
				r.stk_unit(calcUnit(r.stk_amt(), r.qty(), Srch01_RsltR.stk_unit_META.scale()));
				r.eval_unit(calcUnit(r.eval_amt(), r.qty(), Srch01_RsltR.eval_unit_META.scale()));


				r.new_stk_amt(r.stk_amt().lt(r.eval_amt()) ? r.stk_amt() : r.eval_amt());
				r.loss(r.stk_amt().subtract(r.new_stk_amt()));
			}
			MCGroupByPolicy policy = new MCGroupByPolicy();
			policy.sum(_sumColNames);
			Srch01_RsltR sumRow = down0().groupBy(policy).get(0);
			sumRow.sum_flg(true);
			for (String nm : _sumColNames) {
				if(isNull(sumRow.getValueNE(nm))) {
					sumRow.setValue(nm, MCNumber.ZERO);
				}
			}
			down0().add(sumRow);
		}

		protected String[] _sumColNames = {
				Srch01_RsltR.$stk_amt, Srch01_RsltR.$eval_amt, Srch01_RsltR.$new_stk_amt, Srch01_RsltR.$loss,
				Srch01_RsltR.$summed_loss
		};
	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 在庫評価損を登録する前のチェックを行う。<br>
	 */
	public class Chk01 extends MGBFL_StkLossReg_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			msgL.addAll(lockAndCheckBase());
			return msgL;
		}

		/** ロック、更新カウンタチェック、更新前データDACチェック */
		protected MCMessageList lockAndCheckBase() {
			MCMessageList msgL = new MCMessageList();

			for (Chk01_RsltR r : up0()) {
				// DACチェック
				msgL.addAll(checkWritableWgCdDac(r, MGT_PLN_SLS_R.$wg_cd));
			}
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			String procId = "MGPA_CALC_FIX$P_CHK_FIX";
			execProc(createSqlId(LOGIC_ID, procId, "01"), procId, up0().get(0), null, ":calc_grp_cd, :ym");

			MGT_STK_LOSS_R dbc = MGT_STK_LOSS_R.create();
			MGT_STK_LOSS_R t = MGT_STK_LOSS_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setDistinct();
			dbc_bldr.setSelect(t.calc_no);
			dbc_bldr.setWhere(t.calc_grp_cd.eq(bind("calc_grp_cd")));
			dbc_bldr.addWhereWithAnd(t.ym.eq(bind("ym")));
			dbc_bldr.addWhereWithAnd(t.calc_no.neq(bind("calc_no")));
			if (dbSelect("MGBFL0300_MGT_STK_LOSS_S01", dbc, dbc_bldr, up0().get(0)) > 0) {
				throw new MCAppException(MGBFL0001, dbc.calc_no());
			}
			return msgL;
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 在庫評価損を登録する。<br>
	 */
	public class Upd01 extends MGBFL_StkLossReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk01();
			throwUpdErr();
			insLoss();
		}

		protected void editUp() {
			setPegNo(up0());
		}

		protected void callThisChk01() {
			MGBFL_StkLossReg.Chk01 ope = MGBFL_StkLossReg.crtChk01();
			ope.up0().setAll(up0());
			ope.exec();
		}

		protected void insLoss() {
			try {
				executeBatchUpdate(MGBFL0300_MGT_STK_LOSS_I01(), null, up0());
			} catch (MCException ex){
				if (isDupValOnIndex(ex)) {
					throw new MCAppException(ex, msgExclusionErrUpd());
				}
				throw ex ;
			}
		}
	}

	//FMCB CUSTOM END
}