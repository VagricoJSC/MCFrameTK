package mcframe.serverMSBG.MSBGB0050;

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
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogger;
import mcframe.serverFXUC.FXUCL0030.*;
import mcframe.serverMAUC.MAUCL0140.*;
import static mcframe.serverMSBG.MSBGB0050.Query.*;
import mcframe.serverMSUC.MSUCL0050.MSUCL_ClUtil;
import mcframe.serverMSBH.MSBHL5110.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBGB_CredAmtCrrct"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBGB_CredAmtCrrct_MC extends MSBGB_CredAmtCrrct_MC_A{
	//FMCB CUSTOM START

	/**
	 * CredAmtCrrct_Upd01オペレーション.<p>
	 *
	 */
	public class CredAmtCrrct_Upd01 extends MSBGB_CredAmtCrrct_MC_A.CredAmtCrrct_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		/** 例外発生ＦＬＧ **/
		protected boolean _exceptionFlg;
		
		@Override
		protected void doIt() {

			try {
				initLogger();
				writeStartLog();
				execMain();
			}
			catch (Exception ex) {
				handleEx(ex);
			}
			finally {
				writeEndLog();
			}
		}

		/**
		 * バッチログを初期化する。
		 */
		protected void initLogger() {
			getLogger();
		}

		/**
		 * 開始ログを出力する。
		 */
		protected void writeStartLog() {
			logger().writeStartLog(MSBGL0115);
			pushStartLog(logger());
		}

		/**
		 * 例外処理
		 *
		 * @param ex
		 */
		protected void handleEx(Exception ex) {
			MCException mcex;
			if (ex instanceof MCException) {
				mcex = (MCException) ex;
			}
			else {
				mcex = new MCException(ex);
			}
			logger().writeProcessLog(mcex);

			_exceptionFlg = true;

			throw mcex;
		}

		/**
		 * 終了ログを出力する。
		 */
		protected void writeEndLog() {
			if (_exceptionFlg) {
				logger().writeProcessLog(MAUDL0009);
				MCMessagePool.add(MAUDL0009);
				pushErrorLog(logger());
			}
			logger().writeEndLog(MSBGL0116);
			pushEndLog(logger());
		}

		/**
		 * バッチ用のメイン処理
		 */
		protected void execMain() {
			
			MST_CRED_R t = MST_CRED_R.create("T");
			MCQueryApiBuilder credL_bldr = MCQueryApiBuilder.create(t);

			MCList<MST_CRED_R> credL = getAllCred();
			execDbDelete("MSBGB0050_MST_CRED_D01", t,
					value(0).eq(value(0)));
			dbInsertEx("MSBGB0050_MST_CRED_I01", credL, credL_bldr);
		}
		
		/**
		 * すべての与信情報を取得する（与信管理先、取引通貨ごと）
		 */
		protected MCList<MST_CRED_R> getAllCred() {
			MCList<MST_CRED_R> credL = MCList.create(MST_CRED_R.class);

			// 売掛の与信
			credL.addAll(getAr());
			credL.addAll(getSlsSchd());
			credL.addAll(getNotMatNote());
			credL.addAll(getAdv());
			// 買掛の与信
			credL.addAll(getAp());
			credL.addAll(getPurcSchd());
			credL.addAll(getAdvPay());
			
			return credL.groupBy(getGroupByPolicy());
		}
		
		/**
		 * 与信管理先、取引通貨ごとの売掛金残高を取得
		 * 
		 * @return 売掛金残高
		 */
		protected MCList<MST_CRED_R> getAr() {
			
			MCList<MST_CRED_R> credL = MCList.create(MST_CRED_R.class);
			MCRow row = MCRow.create();
			row.addDateColumn("ar_cl_ym", MSUCL_ClUtil.getArClYm());
			executeQuery(credL, MSBGB0050_MST_MLY_AR_BAL_S01(), row);
			
			return credL;
		}
		
		/**
		 * 与信管理先、取引通貨ごとの売上予定を取得
		 * 
		 * @return 売上予定
		 */
		protected MCList<MST_CRED_R> getSlsSchd() {
			
			MCList<MST_CRED_R> credL = MCList.create(MST_CRED_R.class);
			executeQuery(credL, MSBGB0050_MST_SLS_SCHD_S01());
			
			return credL;
		}
		
		/**
		 * 与信管理先、取引通貨ごとの未決済手形残高を取得
		 * 
		 * @return 未決済手形残高
		 */
		protected MCList<MST_CRED_R> getNotMatNote() {
			
			MCList<MST_CRED_R> credL = MCList.create(MST_CRED_R.class);
			executeQuery(credL, MSBGB0050_MST_NOTE_S01());
			
			return credL;
		}
		
		/**
		 * 与信管理先、取引通貨ごとの前受金残高を取得
		 * 
		 * @return 前受金残高
		 */
		protected MCList<MST_CRED_R> getAdv() {
			
			MCList<MST_CRED_R> credL = MCList.create(MST_CRED_R.class);
			executeQuery(credL, MSBGB0050_MST_RCV_S01());
			
			return credL;
		}
		
		/**
		 * 与信管理先、取引通貨ごとの買掛金残高を取得
		 * 
		 * @return 買掛金残高
		 */
		protected MCList<MST_CRED_R> getAp() {
			MCList<MST_CRED_R> credL = MCList.create(MST_CRED_R.class);
			
			if (getCo().ap_no_use_flg()) {
				return credL;
			}
			
			MCList<ApBal_Srch01_RsltR> rsltL = callApBalSrch01Srv();

			addAll(credL, rsltL, createMap_MST_CRED_R_ApBal_Srch01_RsltR());

			return credL;
		}

		protected MCList<ApBal_Srch01_RsltR> callApBalSrch01Srv() {
			MSBHL_ApBalService.ApBal_Srch01 ope = MSBHL_ApBalService.crtApBal_Srch01();

			ope.up0().ap_cred_crrct_flg(true);
			ope.up0().group_ap_cred_flg(true);
			ope.up0().group_trd_cur_flg(true);
			ope.up0().ac_ym_fr(getAcYm(getToday()));
			ope.up0().ac_ym_to(getAcYm(getToday()));
			ope.up0().ap_typ(MCStringUtil.arrayValueJoin(getApTypes()));

			ope.exec();
			
			return ope.down0();
		}
		protected String[] getApTypes() {
			// 暫定買掛は買掛金に含めない
			java.util.ArrayList<String> arr = new java.util.ArrayList<>();
			for (MCRow r :  MAC_AP_TYP.exptSubList(
						MAC_AP_TYP.$VALUE,
						new Comparable[]{MAC_AP_TYP.TEMP_AP.value()})) {
				arr.add(r.getStringNE(MAC_AP_TYP.$VALUE));
			}
			return arr.toArray(new String[0]);
		}
		
		protected Map_MST_CRED_R_ApBal_Srch01_RsltR<MST_CRED_R,ApBal_Srch01_RsltR> createMap_MST_CRED_R_ApBal_Srch01_RsltR() {
			return new Map_MST_CRED_R_ApBal_Srch01_RsltR<MST_CRED_R, ApBal_Srch01_RsltR>();
		}

		public class Map_MST_CRED_R_ApBal_Srch01_RsltR<D extends MST_CRED_R, S extends ApBal_Srch01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_CRED_R.$cred_cd, ApBal_Srch01_RsltR.$ap_cred_cd);
				addColumnPathMap(MST_CRED_R.$trd_cur_cd, ApBal_Srch01_RsltR.$trd_cur_cd);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.ar_cred_amt(MCNumber.ZERO);
				dest.cred_amt(src.end_bal().negate());
				dest.ap_cred_amt(src.end_bal().negate());
			}
		}
		
		/**
		 * 与信管理先、取引通貨ごとの仕入予定を取得
		 * 
		 * @return 仕入予定
		 */
		protected MCList<MST_CRED_R> getPurcSchd() {
			
			MCList<MST_CRED_R> credL = MCList.create(MST_CRED_R.class);
			
			if (getCo().ap_no_use_flg()) {
				return credL;
			}
			
			executeQuery(credL, MSBGB0050_MST_PURC_SCHD_S01());

			return credL;
		}
		
		/**
		 * 与信管理先、取引通貨ごとの前渡金残高を取得
		 * 
		 * @return 前渡金残高
		 */
		protected MCList<MST_CRED_R> getAdvPay() {
			
			MCList<MST_CRED_R> credL = MCList.create(MST_CRED_R.class);
			executeQuery(credL, MSBGB0050_MST_ADV_PAY_ACT_S01());

			return credL;
		}
		/**
		 * 集計ポリシーを取得する
		 * 
		 * @return 集計ポリシー
		 */
		protected MCGroupByPolicy getGroupByPolicy() {
			
			MCGroupByPolicy gp = new MCGroupByPolicy(MST_CRED_R.$cred_cd, MST_CRED_R.$trd_cur_cd);
			gp.sum(MST_CRED_R.$cred_amt, MST_CRED_R.$ar_cred_amt, MST_CRED_R.$ap_cred_amt);
			
			return gp;
		}

	}

	//FMCB CUSTOM END
}