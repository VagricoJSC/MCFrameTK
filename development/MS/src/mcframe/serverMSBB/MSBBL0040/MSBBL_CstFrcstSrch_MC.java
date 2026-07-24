package mcframe.serverMSBB.MSBBL0040;

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
import static mcframe.serverMSBB.MSBBL0040.Query.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBL_CstFrcstSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBL_CstFrcstSrch_MC extends MSBBL_CstFrcstSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 顧客期間内示ヘッダ、顧客期間内示明細を検索する<br>
	 */
	public class Srch01 extends MSBBL_CstFrcstSrch_MC_A.Srch01 {
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			
			editCnd();
			srchCstFrcst();
			if (down0().size() == 0) {
				return;
			}
		}
		
		/**
		 * 検索条件を加工する
		 */
		protected void editCnd() {
			
			if (up0().fix_t_flg() && !up0().fix_f_flg()) {
				up0().addStringColumn("fix_flg_str", MCBooleanUtil.booleanToDBString(true));
			}
			else if (!up0().fix_t_flg() && up0().fix_f_flg()) {
				up0().addStringColumn("fix_flg_str", MCBooleanUtil.booleanToDBString(false));
			}
			
			if (up0().except_frcst_stop_flg()) {
				up0().addStringColumn("frcst_stop_flg_str", MCBooleanUtil.booleanToDBString(false));
			}
		}
		
		@Override
		protected void editListMain() {
			if (isSame(up0().mode(), "0")) {
				srchOtherDtl();
			}
		}
		
		/**
		 * 顧客内示ヘッダ・明細を検索する
		 */
		protected void srchCstFrcst(){
			MCQueryPlan cstFrcstHSql= null;
			
			// 明細
			if (isSame(up0().mode(), "0")) {
				cstFrcstHSql = MSBBL0040_MST_CST_FRCST_D_S01();
			}
			// ヘッダ
			else if (isSame(up0().mode(), "1")) {
				cstFrcstHSql = MSBBL0040_MST_CST_FRCST_H_S01();
			}
			searchForDL(cstFrcstHSql, up0(), down0());
		}

		/**
		 * 前回内示・月次販売計画数・受注数を取得
		 */
		protected void srchOtherDtl(){
			setWk();
			mergeList(getPreFrcstL(), getmlySlsPlnL(), getsloQtyL(), getmlyFrcstSumQtyL());
		}
		
		/**
		 * 顧客期間内示ヘッダ・明細キーワークテーブルを挿入する
		 */
		protected void setWk(){
			
			//顧客内示明細キーを作成する
			MCList<MST_CST_FRCST_D_R> dbcL = MCList.create(MST_CST_FRCST_D_R.class);
			for (Srch01_RsltR r : down0().groupBy(Srch01_RsltR.$cst_frcst_d_no)) {
				MST_CST_FRCST_D_R dbc = MST_CST_FRCST_D_R.create();
				dbc.cst_frcst_d_no(r.cst_frcst_d_no());
				dbcL.add(dbc);
			}
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MST_CST_FRCST_D_R.create("T"));
			dbWkDelete("MSBBL0040_MSW_CST_FRCST_D_D01", dbcL_bldr.getBaseDbc());
			dbWkInsert("MSBBL0040_MSW_CST_FRCST_D_I01", dbcL, dbcL_bldr.getBaseDbc());

			//顧客内示ヘッダキーを作成する
			MCList<MST_CST_FRCST_H_R> hdbcL = MCList.create(MST_CST_FRCST_H_R.class);
			for (Srch01_RsltR r : down0().groupBy(Srch01_RsltR.$cst_frcst_no)) {
				MST_CST_FRCST_H_R hdbc = MST_CST_FRCST_H_R.create();
				hdbc.cst_frcst_no(r.cst_frcst_no());
				hdbcL.add(hdbc);
			}
			MCQueryApiBuilder hdbcL_bldr = MCQueryApiBuilder.create(MST_CST_FRCST_H_R.create("T"));
			dbWkDelete("MSBBL0040_MSW_CST_FRCST_H_D01", hdbcL_bldr.getBaseDbc());
			dbWkInsert("MSBBL0040_MSW_CST_FRCST_H_I01", hdbcL, hdbcL_bldr.getBaseDbc());
		}
		/**
		 * 前回顧客期間内示情報を取得する
		 * @return
		 */
		protected MCList<Srch01_RsltR> getPreFrcstL(){
			MCList<Srch01_RsltR> preFrcstL = MCList.create(Srch01_RsltR.class);

			executeQuery(preFrcstL, MSBBL0040_MST_CST_FRCST_D_S02());

			return preFrcstL;
		}
		
		/**
		 * 月次販売計画数量を取得する
		 * @return
		 */
		protected MCList<Srch01_RsltR> getmlySlsPlnL(){
			MCList<Srch01_RsltR> mlySlsPlnL = MCList.create(Srch01_RsltR.class);

			executeQuery(mlySlsPlnL, MSBBL0040_MST_SPLN_SUM_ITM_NEW_S01());

			return mlySlsPlnL;
		}
		
		/**
		 * 受注数量を取得する
		 */
		protected MCList<Srch01_RsltR> getsloQtyL(){
			MCList<Srch01_RsltR> sloQtyL = MCList.create(Srch01_RsltR.class);

			executeQuery(sloQtyL, MSBBL0040_MST_SLO_D_S01());

			return sloQtyL;
		}
		
		/**
		 * 月次正味内示数量を取得する
		 */
		protected MCList<Srch01_RsltR> getmlyFrcstSumQtyL(){
			MCList<Srch01_RsltR> mlyFrcstSumQtyL = MCList.create(Srch01_RsltR.class);
			
			executeQuery(mlyFrcstSumQtyL, MSBBL0040_MST_FRCST_SUM_S01());
			
			return mlyFrcstSumQtyL;
		}
		
		/**
		 * 前回内示情報・月次販売計画・受注数量・月次正味内示数量をリストへ設定する
		 * @param preFrcstL
		 * @param mlySlsPlnL
		 * @param sloQtyL
		 */
		protected void mergeList(MCList<Srch01_RsltR> preFrcstL,
				MCList<Srch01_RsltR> mlySlsPlnL,
				MCList<Srch01_RsltR> sloQtyL,
				MCList<Srch01_RsltR> mlyFrcstSumQtyL){
			
			MCIndexKey preFrcstKey = preFrcstL.createIndex(Srch01_RsltR.$cst_frcst_d_no);
			MCIndexKey mlySlsPlnKey = mlySlsPlnL.createIndex(Srch01_RsltR.$cst_frcst_d_no);
			MCIndexKey sloQtyKey = sloQtyL.createIndex(Srch01_RsltR.$cst_frcst_d_no);
			MCIndexKey mlyFrcstSumQtyKey = mlyFrcstSumQtyL.createIndex(Srch01_RsltR.$cst_frcst_d_no);
			
			for (Srch01_RsltR row : down0()){
				
				Srch01_RsltR preFrcstR = preFrcstL.getFirst(preFrcstKey, row.cst_frcst_d_no());
				
				if (!isNull(preFrcstR)) {
					row.last_qty(preFrcstR.last_qty());
					row.last_cst_frcst_prnt_dt(preFrcstR.last_cst_frcst_prnt_dt());
					row.last_rcpt_dt(preFrcstR.last_rcpt_dt());
				}
				
				Srch01_RsltR mlySlsPlnR = mlySlsPlnL.getFirst(mlySlsPlnKey, row.cst_frcst_d_no());
				if (!isNull(mlySlsPlnR)) {
					row.spln_qty(mlySlsPlnR.spln_qty());
				}
	
				Srch01_RsltR sloQtyR = sloQtyL.getFirst(sloQtyKey, row.cst_frcst_d_no());
				if (!isNull(sloQtyR)) {
					row.slo_qty(sloQtyR.slo_qty());
				}
				
				Srch01_RsltR mlyFrcstSumQtyR = mlyFrcstSumQtyL.getFirst(mlyFrcstSumQtyKey, row.cst_frcst_d_no());
				if (!isNull(mlyFrcstSumQtyR)) {
					row.mly_net_frcst_qty(mlyFrcstSumQtyR.mly_net_frcst_qty());
				}
			}
		}
	}

	//FMCB CUSTOM END
}