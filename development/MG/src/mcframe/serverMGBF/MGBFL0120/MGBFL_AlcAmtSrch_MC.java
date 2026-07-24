package mcframe.serverMGBF.MGBFL0120;

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
import static mcframe.serverMGBF.MGBFL0120.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBFL_AlcAmtSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBFL_AlcAmtSrch_MC extends MGBFL_AlcAmtSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 配賦額の一覧を検索します。<br>
	 */
	public class Srch01 extends MGBFL_AlcAmtSrch_MC_A.Srch01 {
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
			up0().addStringColumn("amt_zero_flg_str", toFalseStr(up0().amt_zero_flg()));

			up0().addStringColumn("no_ac_rsn_flg_str", toTrueStr(up0().no_ac_rsn_flg()));
			up0().addStringColumn("no_po_no_flg_str", toTrueStr(up0().no_po_no_flg()));
			up0().addStringColumn("no_slo_no_flg_str", toTrueStr(up0().no_slo_no_flg()));
			up0().addStringColumn("no_iv_no_flg_str", toTrueStr(up0().no_iv_no_flg()));
			up0().addStringColumn("no_bp_flg_str", toTrueStr(up0().no_bp_flg()));
		}

		protected void srch() {
			executeQuery(down0(), MGBFL0120_MGT_ALC_CALC_RATE_S01(), up0());
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			editList0();
		}

		protected void editList0() {
			if (down0().isEmpty()) {
				return ;
			}

			MCGroupByPolicy policy = new MCGroupByPolicy();
			policy.sum(Srch01_RsltR.$alc_amt, Srch01_RsltR.$adj_amt);
			Srch01_RsltR sumR = down0().groupBy(policy).get(0);

			policy.addKey(Srch01_RsltR.$expns_cd, Srch01_RsltR.$expns_nm);
			MCList<Srch01_RsltR> expnsL = down0().groupBy(policy);
			MCIndexKey expnsKey = expnsL.createIndex(Srch01_RsltR.$expns_cd);

			policy = new MCGroupByPolicy();
			policy.addKey(Srch01_RsltR.$expns_grp_cd, Srch01_RsltR.$expns_grp_nm);
			policy.sum(Srch01_RsltR.$alc_amt, Srch01_RsltR.$adj_amt);
			MCList<Srch01_RsltR> expnsGL = down0().groupBy(policy);
			MCIndexKey expnsGKey = expnsGL.createIndex(Srch01_RsltR.$expns_grp_cd);

			MCList<Srch01_RsltR> newL = down0().createInstance();
			
			String expns = down0().get(0).expns_cd(), expnsGrp = down0().get(0).expns_grp_cd();
			for (int i = 0; i < down0().size(); i++) {
				Srch01_RsltR r = down0().get(i);
				if (!isSame(expns, r.expns_cd())) {
					newL.add(expnsL.getFirst(expnsKey, expns));
				}
				if (!isSame(expnsGrp, r.expns_grp_cd())) {
					newL.add(expnsGL.getFirst(expnsGKey, expnsGrp));
				}
				newL.add(r);
				expns = r.expns_cd();
				expnsGrp = r.expns_grp_cd();

				if (i == down0().size()-1) {
					newL.add(expnsL.getFirst(expnsKey, expns));
					newL.add(expnsGL.getFirst(expnsGKey, expnsGrp));
				}
			}

			newL.add(sumR);
			down0().setAll(newL);
		}
	}

	//FMCB CUSTOM END
}