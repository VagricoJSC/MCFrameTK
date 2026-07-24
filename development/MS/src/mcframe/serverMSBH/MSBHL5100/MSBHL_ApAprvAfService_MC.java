package mcframe.serverMSBH.MSBHL5100;

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
import mcframe.serverMBBA.MBBAL5020.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBH.MSBHL5060.*;
import mcframe.serverMSBH.MSBHL5030.*;
import static mcframe.serverMSBH.MSBHL5100.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBHL_ApAprvAfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBHL_ApAprvAfService_MC extends MSBHL_ApAprvAfService_MC_A{
	//FMCB CUSTOM START

	protected MCList<MST_PAY_CHK_R> _lockPayChkL = null;

	protected MCIndexKey _payChkKey = null;
	
	protected MCList<MST_AP_APPL_SCHD_R> _apApplSchdL;

	/**
	 * ApAprvAf_Upd01オペレーション.<p>
	 *
	 * 債務データ承認後に実行する処理を行う。<br>
	 */
	public class ApAprvAf_Upd01 extends MSBHL_ApAprvAfService_MC_A.ApAprvAf_Upd01 {
		
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {

			if (up0().isEmpty()) {
				return;
			}
			// 支払照合ヘッダをロック
			lockPayChk(up0());
			// 支払照合ヘッダの承認状況区分更新
			updPayChkAprv();
			// 支払実績データ作成
			callPaySchdRegSv();
			// ワークを作成し、対象の支払予定データを取得する。
			setPayChkData();
			// 支払予定IFサービス更新
			callPaySchdIfSrv();
		}
		
		/**
		 * 支払照合ヘッダをロック
		 * 
		 * @param cndL
		 */
		protected void lockPayChk(MCList<AprvAfter_Upd01_CndR> cndL) {
			// 支払照合ヘッダをロック
			_lockPayChkL = MCList.create(MST_PAY_CHK_R.class);
			MST_PAY_CHK_R t = MST_PAY_CHK_R.create("T");
			MCQueryApiBuilder lockPayChkL_bldr = MCQueryApiBuilder.create(t);
			lockPayChkL_bldr.setSelect(t.pay_chk_no);
			lockPayChkL_bldr.addSelect(t.pay_chk_mng_no);
			lockPayChkL_bldr.setWhere(t.pay_chk_no.eq(bind("aprv_src_no1")));
			dbSelectForUpdateNoWait("MSBHL5100_MST_PAY_CHK_S01",
					_lockPayChkL, lockPayChkL_bldr, cndL.groupBy(AprvAfter_Upd01_CndR.$aprv_src_no1));
			_payChkKey = _lockPayChkL.createIndex(MST_PAY_CHK_R.$pay_chk_no);
		}
		protected MST_PAY_CHK_R getLockPayChkR(AprvAfter_Upd01_CndR r) {
			return _lockPayChkL.getFirst(_payChkKey, r.aprv_src_no1());
		}

		/**
		 * 支払照合ヘッダの承認状況区分を更新する
		 */
		protected void updPayChkAprv() {
			MCList<MST_PAY_CHK_R> payChkL = MCList.create(MST_PAY_CHK_R.class);
			MST_PAY_CHK_R t = MST_PAY_CHK_R.create("T");
			MCQueryApiBuilder payChkL_bldr = MCQueryApiBuilder.create(t);
			MCMessageList msgL = new MCMessageList();
			for (AprvAfter_Upd01_CndR r : up0()) {
				MST_PAY_CHK_R payChkR = getLockPayChkR(r);
				//　ロックしたデータから上り電文の支払照合NOのデータが取れない場合、エラーとする。
				if (isNull(payChkR)) {
					msgL.addAll(getRecordNotFoundMsg(getModuleID(), payChkL_bldr.getBaseDbc().tableName(),
							payChkL_bldr.getBaseDbc().getKeyColumn(),
							payChkL.toArray(payChkL_bldr.getBaseDbc().getKeyColumn()), r));
					
				}
				else {
					payChkR.aprv_sts_typ(r.aprv_sts_typ());
					payChkL.add(payChkR);
				}	
			}
			// エラーがある場合、throwUpdErrを実行
			if (!msgL.isEmpty()) {	
				MCMessagePool.addAll(msgL); 
				throwUpdErr();
			}
			// 承認状況区分を更新
			payChkL_bldr.setSet(t.aprv_sts_typ);
			payChkL_bldr.setWhere(t.pay_chk_no.eq(bindEx("pay_chk_no")));
			dbUpdate("MSBHL5100_MST_PAY_CHK_U01", payChkL, payChkL_bldr);
		}
		
		/**
		 * ワークを作成し、対象の買掛消込予定データを取得する。
		 * 
		 */
		protected void setPayChkData() {
			// 変数の初期化
			MCList<MST_PAY_CHK_R> bind = MCList.create(MST_PAY_CHK_R.class);
			_apApplSchdL = MCList.create(MST_AP_APPL_SCHD_R.class);
			// ワークを作成する。
			for (AprvAfter_Upd01_CndR r : up0()) {
				bind.add().pay_chk_mng_no(r.aprv_src_no2());
			}

			MCQueryApiBuilder bind_bldr = MCQueryApiBuilder.create(MST_PAY_CHK_R.create("T"));
			dbWkDelete("MSBHL5100_MSW_PAY_CHK_D01", bind_bldr.getBaseDbc());
			dbWkInsert("MSBHL5100_MSW_PAY_CHK_I01", bind, bind_bldr.getBaseDbc());
			// 対象の買掛消込予定情報を検索
			executeQuery(_apApplSchdL, MSBHL5100_MST_AP_APPL_SCHD_S01());
			// ワーク削除
			dbWkDelete("MSBHL5100_MSW_PAY_CHK_D02", bind_bldr.getBaseDbc());
		}
		
		/**
		 * 支払予定IFサービスを呼出す
		 */
		protected void callPaySchdIfSrv() {
			
			MSBHL_PaySchdIfCrtService.PaySchdIfCrt_Ins01 o = MSBHL_PaySchdIfCrtService.crtPaySchdIfCrt_Ins01();
			for(MST_AP_APPL_SCHD_R apApplSchdR : _apApplSchdL) {
				// 支払照合管理NOに紐づく買掛消込予定NOを設定する。
				PaySchdIfCrt_Ins01_CndR r = o.createPaySchdIfCrt_Ins01_CndR();
				r.ap_appl_schd_no(apApplSchdR.ap_appl_schd_no());
				o.up0().add(r);
			}
			if (!o.up0().isEmpty()) {
				// 支払予定IFサービスを呼び出す。
				o.exec();
			}
		}
		
		/**
		 * 支払実績を登録する
		 */
		protected void callPaySchdRegSv() {
			// 支払予定登録サービスを介して、支払実績サービスを実行する
			// 最終承認済以外→最終承認済と最終承認済→最終承認済以外のパターンのみ処理を実行する。
			MSBHL_PaySchdRegService.PaySchd_Upd02 o = MSBHL_PaySchdRegService.crtPaySchd_Upd02();	
			int idx = 0;
			for (AprvAfter_Upd01_CndR r : up0()) {
				if(MAC_APRV_STS_TYP.isACPT(r.aprv_sts_typ()) && !MAC_APRV_STS_TYP.isACPT(r.old_aprv_sts_typ())) {
					// 最終承認済以外→最終承認済
					// 新規の買掛金相殺情報を設定する。
					PaySchd_HdrR hdrR = o.createPaySchd_HdrR();
					hdrR.hdr_peg_no(idx);
					hdrR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					MST_PAY_CHK_R payChkR = getLockPayChkR(r);
					hdrR.pay_chk_mng_no(payChkR.pay_chk_mng_no());
					o.up0().add(hdrR);
				}
				else if(!MAC_APRV_STS_TYP.isACPT(r.aprv_sts_typ()) && MAC_APRV_STS_TYP.isACPT(r.old_aprv_sts_typ())) {
					// 最終承認済→最終承認済以外
					// 取消の買掛金相殺情報を設定する。
					PaySchd_HdrR hdrR = o.createPaySchd_HdrR();
					hdrR.hdr_peg_no(idx);
					hdrR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					MST_PAY_CHK_R payChkR = getLockPayChkR(r);
					hdrR.pay_chk_mng_no(payChkR.pay_chk_mng_no());
					o.up0().add(hdrR);
				}
				idx++;
			}
			if(!o.up0().isEmpty()){
				o.exec();
			}			
		}
		
	}

	//FMCB CUSTOM END
}