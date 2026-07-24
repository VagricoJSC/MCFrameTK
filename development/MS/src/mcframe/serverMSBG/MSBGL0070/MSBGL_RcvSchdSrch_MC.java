package mcframe.serverMSBG.MSBGL0070;

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
import mcframe.serverMB.dbc.*;
import mcframe.serverMS.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMS.dbc.MSBAFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.serverMSBG.MSBGL0070.Query.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBGL_RcvSchdSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBGL_RcvSchdSrch_MC extends MSBGL_RcvSchdSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 入金予定情報の検索を行います。<br>
	 */
	public class Srch01 extends MSBGL_RcvSchdSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		/**
		 *  グルーピング用配列
		 */
		protected String[] _grpCols;
		protected String[] _grpColsForSrch;

		/**
		 * グルーピング用配列作成
		 * @param grpColsList
		 */
		protected void setGrpList() {
			_grpCols = new String[]{
				Srch01_RsltR.$bill_dpt_cd,
				Srch01_RsltR.$bill_dpt_nm,
				Srch01_RsltR.$wg_cd,
				Srch01_RsltR.$wg_nm,
				Srch01_RsltR.$bcst_cd,
				Srch01_RsltR.$bcst_nm,
				Srch01_RsltR.$bill_ym,
				Srch01_RsltR.$bill_cl_day,
				Srch01_RsltR.$bill_dt,
				Srch01_RsltR.$trd_cur_cd,
				Srch01_RsltR.$trd_cur_nm,
				Srch01_RsltR.$bill_no,
				Srch01_RsltR.$iv_no,
				Srch01_RsltR.$wrk_no,
				Srch01_RsltR.$wrk_nm,
				Srch01_RsltR.$rcst_cd,
				Srch01_RsltR.$rcv_schd_adjst_flg,
				Srch01_RsltR.$adjst_flg,
				Srch01_RsltR.$rcst_nm};
			_grpColsForSrch = new String[]{
				Srch01_RsltR.$bill_dpt_cd,
				Srch01_RsltR.$bill_dpt_nm,
				Srch01_RsltR.$wg_cd,
				Srch01_RsltR.$bcst_cd,
				Srch01_RsltR.$bill_ym,
				Srch01_RsltR.$bill_dt,
				Srch01_RsltR.$trd_cur_cd,
				Srch01_RsltR.$bill_no,
				Srch01_RsltR.$iv_no,
				Srch01_RsltR.$wrk_no};
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			setGrpList();

			setUpTmpCol(up0());

			MCQueryPlan sql = MSBGL0070_MST_BILL_S01();
			searchForDL(sql, up0(), down0(), _grpColsForSrch);
		}

		/**
		 * 検索条件に対する一時カラムを設定する
		 * @param up
		 */
		protected void setUpTmpCol(Srch01_CndR up) {
			// 入金予定調整
			if (up.not_adjst_flg() && !up.adjst_flg()) {
				up.addStringColumn("ADJST_FLG_STR", toFalseStr(up.adjst_flg()));
			} else if (!up.not_adjst_flg() && up.adjst_flg()) {
				up.addStringColumn("ADJST_FLG_STR", toTrueStr(up.adjst_flg()));
			}

			// 入金予定調整対象のみ
			up.addStringColumn("RCV_SCHD_ADJST_FLG_STR", toTrueStr(up.rcv_schd_adjst_flg()));
		}

		/**
		 *  グループ化された下り電文
		 */
		protected MCList<Srch01_RsltR> _down0Group;

		/**
		 * 下り電文を明示的にソート<BR>
		 * ※ 呼出タイミングによって 結果が変わる可能性があるため、
		 *   editListMain呼び出し直後に呼ぶこと。
		 */
		protected void groupSortDown0() {

			// down0をgroupByし、ソート
			_down0Group = down0().groupBy(_grpCols);
			// 検索SQLと同じ条件でソート
			_down0Group.sort(_grpColsForSrch);
		}

		@Override
		protected void editListMain() {
			super.editListMain();

			for(Srch01_RsltR r : down0()){
				nullValToNull(r, Srch01_RsltR.$bill_ym);
			}
			groupSortDown0();

			MCList<Srch01_RsltR> rsltL = down0().createInstance();
			MCIndexKey ik = down0().createIndex(_grpCols);

			for (Srch01_RsltR r : _down0Group) {
				MCList<Srch01_RsltR> down0SubL  = down0().createInstance();
				down0SubL.addAll(down0().subList(ik, r.toArray(_grpCols)));

				// 明細行作成
				MCList<Srch01_RsltR> subL = createSubList(down0SubL);

				// ヘッダ行作成・追加
				r.rcv_schd_amt(down0SubL.sum(Srch01_RsltR.$rcv_schd_amt));
				r.rcv_act_amt(down0SubL.sum(Srch01_RsltR.$rcv_act_amt));
				if (!isNull(r.rcv_schd_amt()) && !isNull(r.rcv_act_amt())) {
					r.not_appl_bal(r.rcv_schd_amt().subtract(r.rcv_act_amt()));
				}
				rsltL.add(r);

				//内訳表示ＦＬＧで明細行を追加するか決める
				if (up0().dtl_flg()) {
					rsltL.addAll(subL);
					rsltL.add(); //空行を追加
				}
			}

			down0().setAll(rsltL);
		}

		/**
		 * 金額と遅延の設定
		 */
		protected MCList<Srch01_RsltR> createSubList(MCList<Srch01_RsltR> down0SubL) {

			// 金額挿入済み明細行
			MCList<Srch01_RsltR> amtRsltL = down0().createInstance();

			// 遅延挿入済み明細行
			MCList<Srch01_RsltR> delayRsltL = down0().createInstance();

			// 予定残高
			MCNumber notApplBal = MCNumber.ZERO;

			// 遅延確認基準日
			MCDate rfrncDt = up0().rfrnc_dt();

			// 遅延発生日
			MCDate delayStartDt = null;

			// 遅延解消日
			MCDate delayEndDt = null;

			// 予定残高算出 & 遅延の発生する日付保持
			for (Srch01_RsltR amtR : down0SubL) {

				notApplBal = MCNumber.sum(notApplBal, amtR.rcv_schd_amt()).subtract(amtR.rcv_act_amt());

				amtR.not_appl_bal(notApplBal);

				// 遅延確認基準日に日付がある && 現在の行が基準日より前である
				if (!isNull(rfrncDt) && amtR.schd_act_rcv_dt().lt(rfrncDt)) {
					// 予定残高が0より大きい行の日付
					if (notApplBal.gt(0)) {
						delayStartDt = amtR.schd_act_rcv_dt();
					}
					// 予定残高が0以下である行の日付
					if (notApplBal.lte(0)) {
						delayEndDt = amtR.schd_act_rcv_dt();
					}
				}
				//入金予定額、入金実績額、予定残高のいずれかが０でない場合、下り電文に設定する。
				if(!amtR.rcv_schd_amt().isZero() || !amtR.rcv_act_amt().isZero() || !amtR.not_appl_bal().isZero()){
					amtRsltL.add(amtR);
				}
			}
			// 遅延の設定
			// (予定残高が0より大きい行の日付だけを保持している) || （予定残高が0より大きい行の日付 ≧ 予定残高が0以下である行の日付を保持している） 
			if ((isNull(delayEndDt) && !isNull(delayStartDt)) || (!isNull(delayEndDt) && !isNull(delayStartDt) && delayStartDt.gte(delayEndDt))) {

				for (Srch01_RsltR delayR : amtRsltL) {
					// 現在行の予定/実績日が遅延発生日に該当する && 現在行の予定残高が0より大きい
					if (delayR.schd_act_rcv_dt().lte(delayStartDt) && delayR.not_appl_bal().gt(0)) {
						delayR.delay(MSC_DLY_MRK.CIRCLE.name());
					}

					delayRsltL.add(delayR);
				}
				// 遅延挿入済み明細行を返す
				return delayRsltL;
			}
			// 遅延該当行が無い場合、金額挿入済み明細行を返す
			else {
				return amtRsltL;
			}
		}
	}

	//FMCB CUSTOM END
}