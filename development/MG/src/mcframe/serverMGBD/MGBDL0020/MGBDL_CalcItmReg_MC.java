package mcframe.serverMGBD.MGBDL0020;

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
import mcframe.serverMGBD.MGBDL0020.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMGBD.MGBDL0020.Query.*;
import mcframe.serverCore.sys.MCSys;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBDL_CalcItmReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBDL_CalcItmReg_MC extends MGBDL_CalcItmReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 品目指定原価計算実行前のチェックをする。<br>
	 */
	public class Chk01 extends MGBDL_CalcItmReg_MC_A.Chk01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList ml =  super.doServerCheckSub();
			ml.addAll(checkSub());
			return ml;
		}

		protected MCMessageList checkSub() {
			MGT_ARG_USR_R t = MGT_ARG_USR_R.create("T");
			MCMessageList ml =  new MCMessageList();
			if (0 < execDbCount("MGBDL0020_MGT_ARG_USR_S01", t,
					value(0).eq(value(0))
						.and(t.calc_grp_cd.eq(bind("1"))),
					up0().get(0).calc_grp_cd())) {
				ml.add(new MCMessage(MGBDL0008));
			}
			return ml;
		}

	}

	/**
	 * Ins01オペレーション.<p>
	 *
	 * 計算対象品目を指定して原価計算を実行する。<br>
	 */
	public class Ins01 extends MGBDL_CalcItmReg_MC_A.Ins01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callThisChk();
			throwUpdErr();
			editUp();
			ins();
		}

		/**
		 * チェック実行
		 */
		protected void callThisChk() {
			MGBDL_CalcItmReg.Chk01 ope = MGBDL_CalcItmReg.crtChk01();
			ope.up0().addAll(up0());
			ope.exec();
		}

		protected void editUp() {
			up0().forEach(r -> {
				r.usr_cd(MCSys.user.ID());
			});
		}

		protected void ins() {
			MGT_USR_ITM_R t = MGT_USR_ITM_R.create("T");

			execDbDelete("MGBDL0020_MGT_USR_ITM_D01", t,
					value(0).eq(value(0))
						.and(t.usr_cd.eq(bind("1")))
						.and(t.calc_grp_cd.eq(bind("2"))),
					MCSys.user.ID(), up0().get(0).calc_grp_cd());

			MCList<MGT_USR_ITM_R> insL = MCList.create(MGT_USR_ITM_R.class);
			up0().forEach(r -> {
				insL.add(r);
			});
			dbInsertEx("MGBDL0020_MGT_USR_ITM_I01", insL, MCQueryApiBuilder.create(t));
		}

	}

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 計算対象品目への登録候補となる品目を検索する。<br>
	 */
	public class Srch01 extends MGBDL_CalcItmReg_MC_A.Srch01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			editUp();
			callProc();
			srch();
			editDown();
		}

		protected void editUp() {
			setGrpFlg(up0(), "itm_grp");
			up0().addStringColumn("wk_calc_ctg_typ", MAC_CALC_CTG_TYP.CALC_ITM.value());

			MAM_CALC_GRP_R dbc = MAM_CALC_GRP_R.create();
			dbSelectKey("MGBDL0020_MAM_CALC_GRP_S01", dbc, MCQueryApiBuilder.create(MAM_CALC_GRP_R.create("T")), up0().calc_grp_cd());
			up0().setStringNE("RUNTIME_WG_CD", dbc.runtime_wg_cd());
		}

		protected void callProc() {
			String procId = "MGPA_CALC_CTG$P_SET_WORK";
			execProc(createSqlId(LOGIC_ID, procId, "01"), procId, up0(), null, ":calc_grp_cd, :wk_calc_ctg_typ");
		}

		protected void srch() {
			executeQuery(down0(), MGBDL0020_MGT_ITM_S01(), up0());
		}

		protected void editDown() {
			down0().forEach(r -> {
				r.calc_grp_cd(up0().calc_grp_cd());
			});
		}

	}

	//FMCB CUSTOM END
}