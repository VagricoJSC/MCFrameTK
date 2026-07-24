package mcframe.serverMGBF.MGBFL0170;

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
import static mcframe.serverMGBF.MGBFL0170.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBFL_StkRsltInspSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBFL_StkRsltInspSrch_MC extends MGBFL_StkRsltInspSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価計算結果で算出された月末在庫数データと外部システムからインターフェースされた在庫実績情報を比較する。<br>
	 */
	public class Srch01 extends MGBFL_StkRsltInspSrch_MC_A.Srch01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			editUp();
			execCalcCtg();
			srch();
			calc();
		}

		protected void editUp() {
			up0().addStringColumn("no_bp_flg_str", toTrueStr(up0().no_bp_flg()));
			// 他社資産以外＝ＯＮのときは資産区分＝１，２
			up0().addStringColumn("asst_cnd", toTrueStr(up0().except_other_flg()));
			up0().addStringColumn("wk_calc_ctg_typ", MAC_CALC_CTG_TYP.END_STK.value());

			MAM_CALC_GRP_R dbc = MAM_CALC_GRP_R.create();
			dbSelectKey("MGBFL0170_MAM_CALC_GRP_S01", dbc, MCQueryApiBuilder.create(MAM_CALC_GRP_R.create("T")), up0().calc_grp_cd());
			up0().setStringNE("runtime_wg_cd", dbc.runtime_wg_cd());
		}

		protected void execCalcCtg() {
			try {
				String procId = "MGPA_CALC_CTG$P_SET_WORK";
				execProc(createSqlId(LOGIC_ID, procId, "01"), procId, up0(), null, ":calc_grp_cd, :wk_calc_ctg_typ");
			}
			catch (Exception e) {
				throw new MCAppException(e);
			}
		}

		protected void srch() {
			MCList<Srch01_RsltR> list = MCList.create(Srch01_RsltR.class);
			MCList<Srch01_RsltR> addedList = MCList.create(Srch01_RsltR.class);
			executeQuery(down0(), MGBFL0170_MGT_ACC_TOP_S01(), up0());
			executeQuery(list, MGBFL0170_MGT_ACT_STK_S01(), up0());
			String[] keys = getKey();
			MCIndexKey idx = down0().createIndex(keys);

			for (Srch01_RsltR act : list) {

				Comparable<?>[] vals = act.toArray(keys);

				Srch01_RsltR acc = down0().getFirst(idx, vals);
				if (acc == null) {
					addedList.add(act);
				}
				else {
					acc.act_qty(act.act_qty());
				}
			}

			down0().addAll(addedList);
		}

		protected String[] getKey() {
			String[] keys = new String[] {
					Srch01_RsltR.$wg_cd,
					Srch01_RsltR.$mng_dpt_cd,
					Srch01_RsltR.$itm_cd,
					Srch01_RsltR.$itm_sub1,
					Srch01_RsltR.$itm_sub2,
					Srch01_RsltR.$itm_sub3,
					Srch01_RsltR.$itm_nm,
					Srch01_RsltR.$lot_no,
					Srch01_RsltR.$sublot_no,
					Srch01_RsltR.$sno1,
					Srch01_RsltR.$sno2,
					Srch01_RsltR.$sno3,
					Srch01_RsltR.$sno4,
					Srch01_RsltR.$bp_cd,
					Srch01_RsltR.$asst_typ
			};

			return keys;
		}

		// 数量差を計算する。
		protected void calc() {
			MCList<Srch01_RsltR> newList = MCList.create(Srch01_RsltR.class);

			for (Srch01_RsltR r : down0()) {
				r.diff_qty(r.act_qty().subtract(r.calc_qty()));
				if (isNull(r.diff_qty())) {
					r.diff_qty(MCNumber.ZERO);
				}
				if (up0().except_diff_zero_flg()) {
					if (!r.diff_qty().isZero()) {
						newList.add(r);
					}
				}
				else {
					newList.add(r);
				}
			}

			down0().setAll(newList);
		}

	}

	//FMCB CUSTOM END
}