package mcframe.serverMGBB.MGBBL0230;

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
import static mcframe.serverMGBB.MGBBL0230.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBBL_StStkDiffSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBBL_StStkDiffSrch_MC extends MGBBL_StStkDiffSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 月初在庫改定差異を検索する<br>
	 */
	public class Srch01 extends MGBBL_StStkDiffSrch_MC_A.Srch01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			srch();
		}

		protected void srch() {
			MCList<Srch01_QtyR> list = MCList.create(Srch01_QtyR.class);
			executeQuery(list, MGBBL0230_MGT_ST_STK_S01(), up0());
			if (0 == list.size()) {
				return;
			}

			addDynamicBind(up0(), down0());
			executeQuery(down0(), MGBBL0230_MGT_ST_STK_S02(), up0());
			if (0 == down0().size()) {
				return;
			}

			// 後処理
			afterSrch(list);
		}

		// 後処理
		protected void afterSrch(MCList<Srch01_QtyR> list) {
			// 数量取得用のキー、インデックス設定
			String[] keys = (String[])getDispIndexKeys(MCList.create(Srch01_QtyR.class), up0()).toArray(new String[0]);
			MCIndexKey idx = list.createIndex(keys);
				for (Srch01_RsltR r : down0()) {
				// 数量・単価・単価差異の設定
				Srch01_QtyR qtyR = list.getFirst(idx, r.toArray(keys));
				if (qtyR == null) {
					r.qty(0);
					r.bf_amt_upri(0);
					r.af_amt_upri(0);
					r.diff_amt_upri(0);
				}
				else {
					if (!isNullOr(r.bf_amt(), r.bf_amt())) {
						r.qty(qtyR.qty());
						r.bf_amt_upri(calcUnit(r.bf_amt(), r.qty(), Srch01_RsltR.bf_amt_META.scale()));
						r.af_amt_upri(calcUnit(r.af_amt(), r.qty(), Srch01_RsltR.af_amt_META.scale()));
						r.diff_amt_upri(r.af_amt_upri().subtract(r.bf_amt_upri()));
					}
				}
			}
			list.clear();

			// 合計行挿入
			MCGroupByPolicy policy = new MCGroupByPolicy();
			policy.sum(getSumColNames());
			Srch01_RsltR sumRow = down0().groupBy(policy).get(0);
			for (String nm : getSumColNames()) {
				if (isNull(sumRow.getValueNE(nm))) {
					sumRow.setValue(nm, MCNumber.ZERO);
				}
			}
			down0().add(sumRow);
		}
	}
	@Override
	protected java.util.ArrayList<String> getValidExpnsTyp() {
		java.util.ArrayList<String> list = new java.util.ArrayList<String>();
		list.add(MAC_EXPNS_TYP.PROD.value());
		return list;
	}

	/**
	 * 集計対象項目を取得
	 * <P>
	 * 集計対象項目を変更する場合、このメソッドをオーバーライドする
	 */
	@Override
	protected String[] getSumTgtCols() {
		String[] stringArray = {
			"T.diff_amt"
		};
		return stringArray;
	}

	// 集計対象のカラム名
	protected String[] _sumColNames = null;
	/**
	 * 集計対象のカラム名の配列を作成
	 */
	protected String[] getSumColNames() {
		if (_sumColNames == null) {
			_sumColNames = new String[getExpnsAllColNames().size() + 5];
			for (int i = 0; i < getExpnsAllColNames().size(); i++) {
				_sumColNames[i] = createColumnNm(i, getSumColScale());
			}
			_sumColNames[getExpnsAllColNames().size()] = Srch01_RsltR.$af_amt;
			_sumColNames[getExpnsAllColNames().size() + 1] = Srch01_RsltR.$bf_amt;
			_sumColNames[getExpnsAllColNames().size() + 2] = Srch01_RsltR.$ttl;
			_sumColNames[getExpnsAllColNames().size() + 3] = Srch01_RsltR.$var;
			_sumColNames[getExpnsAllColNames().size() + 4] = Srch01_RsltR.$fxd;
		}
		return _sumColNames;
	}

	//FMCB CUSTOM END
}