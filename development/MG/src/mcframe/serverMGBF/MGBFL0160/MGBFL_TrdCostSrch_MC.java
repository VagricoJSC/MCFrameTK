package mcframe.serverMGBF.MGBFL0160;

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
import mcframe.serverMGBF.MGBFL0160.*;	// このimportはFrameManagerの自動生成で追加されました。
import java.util.ArrayList;
import static mcframe.serverMGBF.MGBFL0160.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBFL_TrdCostSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBFL_TrdCostSrch_MC extends MGBFL_TrdCostSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 振替原価を検索する<br>
	 */
	public class Srch01 extends MGBFL_TrdCostSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			srch();
		}

		protected void srch() {
			addDynamicBind(up0(), down0());
			executeQuery(down0(), MGBFL0160_MGT_ACC_TRD_S01(), up0());

			if (down0().size() == 0) {
				return;
			}

			afterSrch();
		}

		protected void afterSrch() {
			editRslt();
			addSumRow();
		}

		protected void editRslt() {
			for (Srch01_RsltR r : down0()) {
				r.srched_flg(false);
			}
		}

		protected void addSumRow() {
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

		// 集計対象のカラム名
		protected String[] _sumColNames = null;

		/**
		 * 集計対象のカラム名の配列を作成
		 */
		protected String[] getSumColNames() {
			if (_sumColNames == null) {
				_sumColNames = new String[getExpnsAllColNames().size() + 1];
				for (int i = 0; i < getExpnsAllColNames().size(); i++) {
					_sumColNames[i] = createColumnNm(i, getSumColScale());
				}
				_sumColNames[getExpnsAllColNames().size()] = Srch01_RsltR.$ttl;
			}
			return _sumColNames;
		}
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 振替原価を検索する<br>
	 */
	public class Srch02 extends MGBFL_TrdCostSrch_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			srch();
		}

		protected void srch() {
			// 上り電文は必ず１行
			addDynamicBind(up0().get(0), down0());
			executeQuery(down0(), MGBFL0160_MGT_ACC_SML_COST_S01(), up0().get(0));
			addDynamicBind(up0().get(0), down1());
			executeQuery(down1(), MGBFL0160_MGT_ACC_SML_COST_S02(), up0().get(0));

			afterSrch();
		}

		protected void afterSrch() {
			if (down0().size() > 0) {
				calcUpri(down0());
				addSumRow(down0());
			}

			if (down1().size() > 0) {
				calcUpri(down1());
				addSumRow(down1());
			}
		}

		/**
		 * 単価を計算する
		 */
		protected void calcUpri(MCList<Srch02_OutDtlR> dispList) {
			for (Srch02_OutDtlR r : dispList) {
				if (isNullOr(r.qty(), r.ttl())) {
					continue;
				}

				if (!MCNumber.ZERO.eq(r.qty())) {
					r.upri(calcUnit(r.ttl(), r.qty(), Srch02_OutDtlR.upri_META.scale()));
				}
				else {
					r.upri(MCNumber.ZERO);
				}
			}
		}

		/** 
		 * 合計行を追加する
		 */
		protected void addSumRow(MCList<Srch02_OutDtlR> list) {
			MCGroupByPolicy policy = new MCGroupByPolicy();
			policy.sum(getSumColNames());
			Srch02_OutDtlR sumRow = list.groupBy(policy).get(0);

			for (String nm : getSumColNames()) {
				if (isNull(sumRow.getValueNE(nm))) {
					sumRow.setValue(nm, MCNumber.ZERO);
				}
			}

			list.add(setTtlRowValues(sumRow));
		}

		/**
		 * 画面で選択行を変更した際、合計行をキャッシュから抽出するために必要な値を設定する
		 */
		protected Srch02_OutDtlR setTtlRowValues(Srch02_OutDtlR ttl) {
			// 必ず１行
			Srch01_RsltR up0 = up0().get(0);

			ttl.ym(up0.ym());
			ttl.trd_grp(up0.trd_grp());
			ttl.calc_grp_cd(up0.calc_grp_cd());
			ttl.calc_no(up0.calc_no());

			return ttl;
		}

		// 集計対象のカラム名
		protected String[] _sumColNames = null;

		/**
		 * 集計対象のカラム名の配列を作成
		 */
		protected String[] getSumColNames() {
			if (_sumColNames == null) {
				_sumColNames = new String[getExpnsAllColNames().size() + 1];
				for (int i = 0; i < getExpnsAllColNames().size(); i++) {
					_sumColNames[i] = createColumnNm(i, getSumColScale());
				}
				_sumColNames[getExpnsAllColNames().size()] = Srch02_OutDtlR.$ttl;
			}
			return _sumColNames;
		}
	}

	@Override
	protected ArrayList<String> getValidExpnsTyp() {
		ArrayList<String> list = new ArrayList<String>();
		list.add(MAC_EXPNS_TYP.PROD.value());
		list.add(MAC_EXPNS_TYP.SPPL.value());
		return list;
	}

	//FMCB CUSTOM END
}