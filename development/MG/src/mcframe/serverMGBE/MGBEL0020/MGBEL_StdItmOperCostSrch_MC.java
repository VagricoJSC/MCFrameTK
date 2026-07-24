package mcframe.serverMGBE.MGBEL0020;

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
import static mcframe.serverMGBE.MGBEL0020.Query.*;
import java.util.ArrayList;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBEL_StdItmOperCostSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBEL_StdItmOperCostSrch_MC extends MGBEL_StdItmOperCostSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 標準品目工程原価の検索を行います。<br>
	 */
	public class Srch01 extends MGBEL_StdItmOperCostSrch_MC_A.Srch01 {

		// 集計対象のカラム名
		protected String[] _sumColNames = null;

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
			addDynamicBind(up0(), down0());
			executeQuery(down0(), MGBEL0020_STD_ITM_OPER_COST_S01(), up0());
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			calcTtl();
		}

		protected void calcTtl() {
			// 合計を求める
			for (Srch01_RsltR r : down0()) {
				r.all_ttl(nvl(sum(r.std_mfg_cost(), r.ttl()), MCNumber.ZERO));
			}

			setSumColNames();

			// ＷＧ・品目・場所単位で小計を挟み込む
			MCList<Srch01_RsltR> rslt = MCList.create(Srch01_RsltR.class);
			MCList<Srch01_RsltR>[] listArray = down0().groupList(
					Srch01_RsltR.$wg_cd,
					Srch01_RsltR.$itm_typ,
					Srch01_RsltR.$itm_typ_d_cd,
					Srch01_RsltR.$itm_jnl_cd,
					Srch01_RsltR.$itm_cd,
					Srch01_RsltR.$itm_sub1,
					Srch01_RsltR.$itm_sub2,
					Srch01_RsltR.$itm_sub3,
					Srch01_RsltR.$loc_cd);
			
			for (MCList<Srch01_RsltR> list : listArray) {
				rslt.addAll(list);
				MCGroupByPolicy policy = new MCGroupByPolicy();
				policy.sum(_sumColNames);
				Srch01_RsltR sumRow = list.groupBy(policy).get(0);
				Srch01_RsltR r = list.get(0);
				sumRow.wg_cd(r.wg_cd());
				sumRow.wg_nm(r.wg_nm());
				sumRow.itm_cd(r.itm_cd());
				sumRow.itm_sub1(r.itm_sub1());
				sumRow.itm_sub2(r.itm_sub2());
				sumRow.itm_sub3(r.itm_sub3());
				sumRow.itm_nm(r.itm_nm());
				sumRow.itm_typ(r.itm_typ());
				sumRow.itm_typ_nm(r.itm_typ_nm());
				sumRow.itm_typ_d_cd(r.itm_typ_d_cd());
				sumRow.itm_typ_d_nm(r.itm_typ_d_nm());
				sumRow.itm_jnl_cd(r.itm_jnl_cd());
				sumRow.itm_jnl_nm(r.itm_jnl_nm());
				sumRow.loc_cd(r.loc_cd());
				sumRow.loc_nm(r.loc_nm());
				sumRow.column_id(-1);

				for (String nm : _sumColNames) {
					if (isNull(sumRow.getValueNE(nm))) {
						sumRow.setValue(nm, MCNumber.ZERO);
					}
				}
				rslt.add(sumRow);

				for (int i = 0; i < list.size(); i++) {
					list.get(i).column_id(i);
				}
			}

			down0().setAll(rslt);
		}

		/**
		 * 集計対象のカラム名の配列を作成
		 */
		protected void setSumColNames() {
			_sumColNames = new String[getExpnsAllColNames().size() + 6];
			for (int i = 0; i < getExpnsAllColNames().size(); i++) {
				_sumColNames[i] = createColumnNm(i, getSumColScale());
			}
			_sumColNames[getExpnsAllColNames().size()] = Srch01_RsltR.$ttl;
			_sumColNames[getExpnsAllColNames().size() + 1] = Srch01_RsltR.$std_mfg_cost;
			_sumColNames[getExpnsAllColNames().size() + 2] = Srch01_RsltR.$the_mfg_cost;
			_sumColNames[getExpnsAllColNames().size() + 3] = Srch01_RsltR.$all_ttl;
			_sumColNames[getExpnsAllColNames().size() + 4] = Srch01_RsltR.$var_cost;
			_sumColNames[getExpnsAllColNames().size() + 5] = Srch01_RsltR.$fxd_cost;
		}
	}

	@Override
	protected ArrayList<String> getValidExpnsTyp() {
		ArrayList<String> list = new ArrayList<String>();
		list.add(MAC_EXPNS_TYP.PROD.value());
		return list;
	}

	@Override
	protected String[] getSumTgtCols() {
		String[] stringArray = {
			"T.std_cost"
		};
		return stringArray;
	}

	//FMCB CUSTOM END
}