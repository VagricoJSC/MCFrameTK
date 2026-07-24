package mcframe.serverMSBB.MSBBL6250;

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
import mcframe.serverMSBB.MSBBL6010.MSBBL_SlsActService;
import mcframe.serverMSBB.MSBBL6010.SlsAct_Upd03_AprvR;
import mcframe.serverMSBB.MSBBL6080.MSBBL_SloStsRegService;
import mcframe.serverMSBB.MSBBL6080.SloSts_DtlR;
import mcframe.serverMSBE.MSBEL5500.MSBEL_ShipSchdService;
import mcframe.serverMSBE.MSBEL5500.ShipSchd_DtlR;
import static mcframe.serverMSBB.MSBBL6250.Query.*;
import mcframe.serverMAUC.MAUCL5020.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBL_SlsAprvAfterService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBL_SlsAprvAfterService_MC extends MSBBL_SlsAprvAfterService_MC_A{
	//FMCB CUSTOM START

	/**
	 * SlsAprvAfter_Upd01オペレーション.<p>
	 *
	 * 見積に対して、承認もしくは承認取消が行われた際の処理を実施する。<br>
	 */
	public class SlsAprvAfter_Upd01 extends MSBBL_SlsAprvAfterService_MC_A.SlsAprvAfter_Upd01 {
		
		/**
		 * 見積更新対象リスト
		 */
		protected MCList<MST_QTN_R> _qtnL = null;
		protected MST_QTN_R t = null;
		protected MCQueryApiBuilder _qtnL_bldr = null;
				
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			// メッセージ退避
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(MCMessagePool.getMessageList());
			MCMessagePool.clear();
			
			lockQtn();
			
			if (hasErrMsg()) {
				callThrowUpdErr(msgL);
			}
			
			updAprvStsTyp();
			
			// 退避したメッセージを戻す
			msgL.addAll(MCMessagePool.getMessageList());
			MCMessagePool.clear();
			MCMessagePool.addAll(msgL);
		}
		
		/**
		 * 見積ヘッダをロックする。
		 */
		protected void lockQtn() {

			MCMessageList msgL = new MCMessageList();

			_qtnL = MCList.create(MST_QTN_R.class);
			t = MST_QTN_R.create("T");
			_qtnL_bldr = MCQueryApiBuilder.create(t);
			_qtnL_bldr.setSelect(t.qtn_no, t.qtn_rev);

			MCList<MST_QTN_R> bindL = MCList.create(MST_QTN_R.class);
			MST_QTN_R bindR = null;
			for (AprvAfter_Upd01_CndR aprvAfterR : up0()) {

				bindR = MST_QTN_R.create();
				bindR.qtn_no(aprvAfterR.aprv_src_no1());
				bindR.qtn_rev(MCNumber.valueOf(aprvAfterR.aprv_src_no2()));
				bindL.add(bindR);
			}

			dbSelectKeyForUpdateNoWait("MSBBL6250_MST_QTN_S01", _qtnL, _qtnL_bldr, bindL);

			MCIndexKey idxkey = _qtnL.createIndex(MST_QTN_R.$qtn_no, MST_QTN_R.$qtn_rev);

			for (AprvAfter_Upd01_CndR aprvAfterR : up0()) {

				MST_QTN_R qtnR = _qtnL.getFirst(idxkey, aprvAfterR.aprv_src_no1(),
						MCNumber.valueOf(aprvAfterR.aprv_src_no2()));
				if (!isNull(qtnR) && !qtnR.isEmpty()) {
					qtnR.aprv_sts_typ(aprvAfterR.aprv_sts_typ());
				}
				else {
					msgL.addAll(getRecordNotFoundMsg(getModuleID(), _qtnL_bldr.getBaseDbc().tableName(),
							_qtnL_bldr.getBaseDbc().getKeyColumn(),
							_qtnL.toArray(_qtnL_bldr.getBaseDbc().getKeyColumn()), aprvAfterR));
				}
			}
			
			if (!msgL.isEmpty()) {
				
				MCMessagePool.addAll(msgL); 
			}
		}
		
		/**
		 * 承認状況区分を更新する。
		 */
		protected void updAprvStsTyp() {

			if (!isNull(_qtnL) && !_qtnL.isEmpty()) {
				
				_qtnL_bldr.setSet(t.aprv_sts_typ);
				
				dbUpdateKey("MSBBL6250_MST_QTN_U01", _qtnL, _qtnL_bldr);
			}
		}
	}
	
	/**
	 * SlsAprvAfter_Upd02オペレーション.<p>
	 *
	 * 受注に対して、承認もしくは承認取消が行われた際の処理を実施する。<br>
	 */
	public class SlsAprvAfter_Upd02 extends MSBBL_SlsAprvAfterService_MC_A.SlsAprvAfter_Upd02 {
		
		/**
		 * 受注更新対象リスト
		 */
		protected MCList<MST_SLO_R> _sloL = null;
		protected MST_SLO_R t = null;
		protected MCQueryApiBuilder _sloL_bldr = null;
		/**
		 * 出荷予定対象リスト
		 */
		MCList<SlsAprvAfter_Upd02_ShipSchdR> _shipSchdL = null;
		
		/**
		 * 後続サービス実行フラグ
		 */
		protected boolean _execAfterServiceFlg = false;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			// メッセージ退避
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(MCMessagePool.getMessageList());
			MCMessagePool.clear();
			
			lockSlo();
			
			if (hasErrMsg()) {
				callThrowUpdErr(msgL);
			}
			
			updAprvStsTyp();
			
			crtSloWk();
			
			callShipSchdServiceChk02();
			
			if (hasErrMsg()) {
				callThrowUpdErr(msgL);
			}
			
			callShipSchdServiceUpd02();
			
			callSloStsRegServiceIns01();

			// 改訂履歴データ更新サービス呼出（受注改訂履歴テーブル更新）
			callRevDataServiceIns01();
			
			// 退避したメッセージを戻す
			msgL.addAll(MCMessagePool.getMessageList());
			MCMessagePool.clear();
			MCMessagePool.addAll(msgL);
		}
		
		/**
		 * 受注ヘッダをロックする。
		 */
		protected void lockSlo() {

			MCMessageList msgL = new MCMessageList();
			
			_sloL = MCList.create(MST_SLO_R.class);
			t = MST_SLO_R.create("T");
			_sloL_bldr = MCQueryApiBuilder.create(t);
			_sloL_bldr.setSelect(t.slo_no, t.slo_rev);
			
			MCList<MST_SLO_R> bindL = MCList.create(MST_SLO_R.class);
			MST_SLO_R bindR = null;
			for (AprvAfter_Upd01_CndR aprvAfterR : up0()) {
				
				bindR = MST_SLO_R.create();
				bindR.slo_no(aprvAfterR.aprv_src_no1());
				bindL.add(bindR);
			}
			
			dbSelectKeyForUpdateNoWait("MSBBL6250_MST_SLO_S01", _sloL, _sloL_bldr, bindL);
			
			MCIndexKey idxkey = _sloL.createIndex(MST_SLO_R.$slo_no);
			
			for (AprvAfter_Upd01_CndR aprvAfterR : up0()) {
				
				MST_SLO_R sloR = _sloL.getFirst(idxkey, aprvAfterR.aprv_src_no1());
				if (!isNull(sloR) && !sloR.isEmpty()) {
					sloR.aprv_sts_typ(aprvAfterR.aprv_sts_typ());
				}
				else {
					msgL.addAll(getRecordNotFoundMsg(
							getModuleID(), 
							_sloL_bldr.getBaseDbc().tableName(), 
							_sloL_bldr.getBaseDbc().getKeyColumn(), 
							_sloL.toArray(_sloL_bldr.getBaseDbc().getKeyColumn()), 
							aprvAfterR));
				}
			}
			
			if (!msgL.isEmpty()) {
				
				MCMessagePool.addAll(msgL); 
			}
		}
		
		/**
		 * 承認状況区分を更新する。
		 */
		protected void updAprvStsTyp() {

			if (!isNull(_sloL) && !_sloL.isEmpty()) {

				_sloL_bldr.setSet(t.aprv_sts_typ);

				dbUpdateKey("MSBBL6250_MST_SLO_U01", _sloL, _sloL_bldr);
			}
		}

		/**
		 * 受注ワークテーブルを作成する。<br>
		 * 受注承認または受注承認取消の受注情報をワークテーブルに登録する。
		 */
		protected void crtSloWk() {

			MCList<MST_SLO_R> insL = MCList.create(MST_SLO_R.class);
			
			MST_SLO_R insR = null;
			for (AprvAfter_Upd01_CndR aprvAfterR : up0()) {
				
				if (needExecAfterService(aprvAfterR)) {
					
					insR = MST_SLO_R.create();
					insR.slo_no(aprvAfterR.aprv_src_no1());
					
					insL.add(insR);
					
					_execAfterServiceFlg = true;
				}
			}
			
			if (_execAfterServiceFlg) {
				MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_SLO_R.create("T"));
				dbWkDelete("MSBBL6250_MSW_SLO_D01", insL_bldr.getBaseDbc());
				dbWkInsert("MSBBL6250_MSW_SLO_I01", insL, insL_bldr.getBaseDbc());
			}
		}
		
		/**
		 * 出荷予定サービスの更新（出荷予定）前チェックを呼び出す。
		 */
		protected void callShipSchdServiceChk02() {
			
			if (!_execAfterServiceFlg) {
				return;
			}

			MSBEL_ShipSchdService.ShipSchd_Chk02 ope =  MSBEL_ShipSchdService.crtShipSchd_Chk02();
			
			_shipSchdL = MCList.create(SlsAprvAfter_Upd02_ShipSchdR.class);
			executeQuery(_shipSchdL, MSBBL6250_MST_SHIP_PR_S01());
			
			setPegNo(_shipSchdL);
			
			setAll(ope.up0(), _shipSchdL, createMap_ShipSchd_DtlR_SlsAprvAfter_Upd02_ShipSchdR());
			
			if (!ope.up0().isEmpty()) {
				
				ope.exec();
			}
		}
		
		/**
		 * 出荷予定サービスの更新（出荷予定を呼び出す。
		 */
		protected void callShipSchdServiceUpd02() {
			
			if (!_execAfterServiceFlg) {
				return;
			}

			MSBEL_ShipSchdService.ShipSchd_Upd02 ope = MSBEL_ShipSchdService.crtShipSchd_Upd02();
			
			setAll(ope.up1(), _shipSchdL, createMap_ShipSchd_DtlR_SlsAprvAfter_Upd02_ShipSchdR());
			
			if (!ope.up1().isEmpty()) {
				
				ope.exec();
			}
		}
		
		/**
		 * 受注状況更新サービスの受注状況登録処理を呼び出す。<br>
		 * 受注状況に「受注承認」/「受注承認取消」を登録する。<br>
		 */
		protected void callSloStsRegServiceIns01() {
			
			if (!_execAfterServiceFlg) {
				return;
			}
			
			MCList<MST_SLO_D_R> sloDL = MCList.create(MST_SLO_D_R.class);
			
			executeQuery(sloDL, MSBBL6250_MST_SLO_S01());
			
			MSBBL_SloStsRegService.SloSts_Ins01 ope = MSBBL_SloStsRegService.crtSloSts_Ins01();
			
			SloSts_DtlR upR = null;
			for (MST_SLO_D_R sloDR : sloDL) {
				
				upR = SloSts_DtlR.create();
				upR.slo_d_no(sloDR.slo_d_no());
				
				AprvAfter_Upd01_CndR aprvAfterR = up0().getFirst(AprvAfter_Upd01_CndR.$aprv_src_no1, sloDR.slo_no());
				
				if (!isNull(aprvAfterR) && !aprvAfterR.isEmpty()) {
					
					if (isSloAprv(aprvAfterR)) {
						upR.slo_sts_typ(MSC_SLO_STS_TYP.SLO_APRV.value());
					}
					else if (isSloAprvCan(aprvAfterR)) {
						upR.slo_sts_typ(MSC_SLO_STS_TYP.SLO_APRV_CAN.value());
					}
				}
				
				ope.up0().add(upR);
			}
			
			ope.exec();
		}

		/**
		 * 改訂履歴データ更新サービスの改訂履歴データ更新リスト登録処理を呼び出す。
		 * 受注改訂履歴テーブルを更新する。
		 */
		protected void callRevDataServiceIns01() {
			MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
			for (MST_SLO_R r : _sloL) {
				RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
				opeR.rev_data_src_no(r.slo_no());
				opeR.rev_no(r.slo_rev());
				opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_SLO.value());
				ope.up0().add(opeR);
			}
			ope.exec();
		}

		/**
		 * 後続のサービスを実行するかどうか。
		 * @param aprvAfterR 承認結果
		 * @return　最終承認済以外→最終承認済、または最終承認済→最終承認済以外の場合はtrue
		 */
		protected boolean needExecAfterService(AprvAfter_Upd01_CndR aprvAfterR) {
			
			if (isSloAprv(aprvAfterR) || isSloAprvCan(aprvAfterR)) {
				
				return true;
			}
			
			return false;
		}
		
		/**
		 * 受注承認かどうか。<br>
		 * 最終承認済以外→最終承認済
		 * @param aprvAfterR
		 * @return 受注承認の場合はtrue
		 */
		protected boolean isSloAprv(AprvAfter_Upd01_CndR aprvAfterR) {
			
			if (!MAC_APRV_STS_TYP.isACPT(aprvAfterR.old_aprv_sts_typ()) && MAC_APRV_STS_TYP.isACPT(aprvAfterR.aprv_sts_typ())) {
				return true;
			}
			
			return false;
		}
		
		/**
		 * 受注承認取消かどうか。<br>
		 * 最終承認済→最終承認済以外
		 * @param aprvAfterR
		 * @return 受注承認取消の場合はtrue
		 */
		protected boolean isSloAprvCan(AprvAfter_Upd01_CndR aprvAfterR) {
			
			if (MAC_APRV_STS_TYP.isACPT(aprvAfterR.old_aprv_sts_typ()) && !MAC_APRV_STS_TYP.isACPT(aprvAfterR.aprv_sts_typ())) {
				return true;
			}
			
			return false;
		}
	}
	
	/**
	 * SlsAprvAfter_Upd03オペレーション.<p>
	 *
	 * 売上値引に対して、承認もしくは承認取消が行われた際の処理を実施する。<br>
	 */
	public class SlsAprvAfter_Upd03 extends MSBBL_SlsAprvAfterService_MC_A.SlsAprvAfter_Upd03 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			callSlsActServiceUpd03();
		}
		
		/**
		 * 売上実績サービスの登録（承認用）を呼び出す。
		 */
		protected void callSlsActServiceUpd03() {

			MSBBL_SlsActService.SlsAct_Upd03 ope = MSBBL_SlsActService.crtSlsAct_Upd03();
			
			addAll(ope.up0(), up0(), createMap_SlsAct_Upd03_AprvR_AprvAfter_Upd01_CndR());
			
			ope.exec();
		}
	}
	
	/**
	 * メッセージを退避し、例外をスローする。
	 * @param msgL
	 */
	protected void callThrowUpdErr(MCMessageList msgL) {
		msgL.addAll(MCMessagePool.getMessageList());
		MCMessagePool.clear();
		
		MCAppException ex = new MCAppException(msgUpdErr());
		ex.addCauseMessageList(msgL);
		throw ex;
	}
	
	protected Map_SlsAct_Upd03_AprvR_AprvAfter_Upd01_CndR<SlsAct_Upd03_AprvR,AprvAfter_Upd01_CndR> createMap_SlsAct_Upd03_AprvR_AprvAfter_Upd01_CndR() {
		return new Map_SlsAct_Upd03_AprvR_AprvAfter_Upd01_CndR<SlsAct_Upd03_AprvR, AprvAfter_Upd01_CndR>();
	}

	public class Map_SlsAct_Upd03_AprvR_AprvAfter_Upd01_CndR<D extends SlsAct_Upd03_AprvR, S extends AprvAfter_Upd01_CndR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SlsAct_Upd03_AprvR.$aprv_sts_typ, AprvAfter_Upd01_CndR.$aprv_sts_typ);
			addColumnPathMap(SlsAct_Upd03_AprvR.$sls_act_no, AprvAfter_Upd01_CndR.$aprv_src_no1);

		}
	}
	
	protected Map_ShipSchd_DtlR_SlsAprvAfter_Upd02_ShipSchdR<ShipSchd_DtlR,SlsAprvAfter_Upd02_ShipSchdR> createMap_ShipSchd_DtlR_SlsAprvAfter_Upd02_ShipSchdR() {
		return new Map_ShipSchd_DtlR_SlsAprvAfter_Upd02_ShipSchdR<ShipSchd_DtlR, SlsAprvAfter_Upd02_ShipSchdR>();
	}

	public class Map_ShipSchd_DtlR_SlsAprvAfter_Upd02_ShipSchdR<D extends ShipSchd_DtlR, S extends SlsAprvAfter_Upd02_ShipSchdR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipSchd_DtlR.$peg_no, SlsAprvAfter_Upd02_ShipSchdR.$peg_no);
			addColumnPathMap(ShipSchd_DtlR.$ship_schd_no, SlsAprvAfter_Upd02_ShipSchdR.$ship_schd_no);
			addColumnPathMap(ShipSchd_DtlR.$ship_pr_no, SlsAprvAfter_Upd02_ShipSchdR.$ship_pr_no);
			addColumnPathMap(ShipSchd_DtlR.$not_dt_calc_flg, SlsAprvAfter_Upd02_ShipSchdR.$not_dt_calc_flg);

		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			dest.ship_judge_flg(true);
			dest.iv_chk_skip_flg(true);
		}
	}

	//FMCB CUSTOM END
}