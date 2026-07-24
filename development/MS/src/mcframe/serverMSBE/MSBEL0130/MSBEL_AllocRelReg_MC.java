package mcframe.serverMSBE.MSBEL0130;

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
import mcframe.serverMSBE.MSBEL0130.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL5500.MSBEL_ShipSchdService;
import mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd06_DtlR;
import static mcframe.serverMSBE.MSBEL0130.Query.*;
import mcframe.serverMSBB.MSBBL6080.MSBBL_SloStsRegService;
import mcframe.serverMSBB.MSBBL6080.SloSts_DtlR;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_AllocRelReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_AllocRelReg_MC extends MSBEL_AllocRelReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * AllocRelReg_Upd01オペレーション.<p>
	 *
	 * 受注または移送から作成された出荷予定の在庫引当を解除する。<br>
	 */
	public class Upd01 extends MSBEL_AllocRelReg_MC_A.Upd01 {
		
		MSBEL_AllocRelReg.Chk01 _chk01Ope = null;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			callThisChk01();
			
			throwUpdErr();
			
			callShipSchdServiceUpd06();
			
			callSloStsRegServiceIns01();
		}
		
		/**
		 * 引当解除前チェック処理を呼び出す。
		 */
		protected void callThisChk01() {
			
			_chk01Ope = MSBEL_AllocRelReg.crtChk01();
			_chk01Ope.up0().setAll(up0());
			setPegNo(_chk01Ope.up0());
			
			_chk01Ope.exec();
			
			up0().setAll(_chk01Ope.down0());
		}
		
		/**
		 * 出荷予定サービスの更新（引当解除）処理を呼び出す。
		 */
		protected void callShipSchdServiceUpd06() {
			
			MSBEL_ShipSchdService.ShipSchd_Upd06 upd06Serv = MSBEL_ShipSchdService.crtShipSchd_Upd06();
			addAll(upd06Serv.up0(), _chk01Ope.down0(), createMap_ShipSchd_Upd06_DtlR_DtlR());
		    
			upd06Serv.exec();
		}
		
		/**
		 * 受注状況更新サービスの受注状況登録処理を呼び出す。
		 */
		protected void callSloStsRegServiceIns01() {
			
			MSBBL_SloStsRegService.SloSts_Ins01 ins01Serv = MSBBL_SloStsRegService.crtSloSts_Ins01();
			
			SloSts_DtlR upR = null;
			for (DtlR dtlR : _chk01Ope.down0()) {
				
				if (!isNull(dtlR.slo_d_no())) {
					
					upR = SloSts_DtlR.create();
					copy(upR, dtlR, createMap_SloSts_DtlR_DtlR());
					ins01Serv.up0().add(upR);
				}
			}
			
			ins01Serv.exec();
		}
	}
	
	/**
	 * AllocRelReg_Srch01オペレーション.<p>
	 *
	 * 引当解除対象となる出荷予定を検索する。<br>
	 */
	public class Srch01 extends MSBEL_AllocRelReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			
			getShipAlloc();
		}
		
		/**
		 * 引当済の出荷引当状況情報を取得する。
		 */
		protected void getShipAlloc() {

			MCQueryPlan sql = MSBEL0130_MST_SHIP_PR_S01();
			executeQuery(down0(), sql, up0());
		}
	}
	
	/**
	 * AllocRelReg_Chk01オペレーション.<p>
	 *
	 * 引当解除前チェック処理を実行する。<br>
	 */
	public class Chk01 extends MSBEL_AllocRelReg_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			if (!hasErr()) {
				
				callShipSchdServiceChk06();
			}
			
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			
			MCMessageList msgL = super.doServerCheckBase();

			msgL.addAll(lockAndCheckBase());

			return msgL;
		}

		/**
		 * 更新カウンタチェック、ＤＡＣチェックを行う。
		 * @return　エラーメッセージリスト
		 */
		protected MCMessageList lockAndCheckBase() {

			MCMessageList msgL = new MCMessageList();
			
			//ワークテーブルのデータを作成する
			MCList<MST_SHIP_ALLOC_STS_R> wkL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			for (DtlR shipAllocR : up0()) {
				MST_SHIP_ALLOC_STS_R wkR = MST_SHIP_ALLOC_STS_R.create();
				wkR.ship_alloc_sts_no(shipAllocR.ship_alloc_sts_no());
				wkL.add(wkR);
			}
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_SHIP_ALLOC_STS_R.create("T"));
			dbWkDelete("MSBEL0130_MSW_SHIP_ALLOC_STS_D01", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBEL0130_MSW_SHIP_ALLOC_STS_I01", wkL, wkL_bldr.getBaseDbc());
			
			MCList<MST_SHIP_PR_R> shipPrL = MCList.create(MST_SHIP_PR_R.class);
			MST_SHIP_PR_R t1 = MST_SHIP_PR_R.create("T");
			MST_SHIP_SCHD_R t2 = MST_SHIP_SCHD_R.create("T2");
			MST_SHIP_ALLOC_STS_R t3 = MST_SHIP_ALLOC_STS_R.create("T3");
			MCQueryApiBuilder shipPrL_bldr = MCQueryApiBuilder.create(t1);
			MSW_SHIP_ALLOC_STS_KEY_R S1W = MSW_SHIP_ALLOC_STS_KEY_R.create("W");
			
			shipPrL_bldr.setSelect(t1.ship_pr_no, t1.alloc_grp_cd, t1.ship_lg_grp_cd, t1.loc_cd, t1.slo_d_no, t1.upd_cntr);
			shipPrL_bldr.addSelect(t2.ship_fr_lg_grp_cd);
			shipPrL_bldr.addSelect(t3.ship_loc_cd);
			shipPrL_bldr.addSelect(t3.pack_unit_qty);
			shipPrL_bldr.addSelect(t3.pack_unit_cd);
			shipPrL_bldr.addSelect(t3.ship_alloc_sts_no);
			shipPrL_bldr.addLeftOuterJoin(t2, bracket( t1.ship_pr_no.eq(t2.ship_pr_no)));
			shipPrL_bldr.addLeftOuterJoin(t3, bracket( t2.ship_schd_no.eq(t3.ship_schd_no)));
			shipPrL_bldr.addWhereWithAnd(exists(subQuery().select(value(1)).from(S1W)
					.where(t3.ship_alloc_sts_no.eq(S1W.ship_alloc_sts_no))));
			shipPrL_bldr.setLockTable(t1.ship_pr_no);
			shipPrL_bldr.setOrderByAsc(shipPrL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectForUpdateNoWait("MSBEL0130_MST_SHIP_PR_S01", shipPrL, shipPrL_bldr);
			
			//ワークテーブルのデータを削除する
			dbWkDelete("MSBEL0130_MSW_SHIP_ALLOC_STS_D02", wkL_bldr.getBaseDbc());
			
			MCIndexKey idxkey = shipPrL.createIndex(DtlR.$ship_alloc_sts_no);

			MST_SHIP_PR_R shipPrR = null;
			
			for (DtlR dtlR : up0()) {
			
				shipPrR = shipPrL.getFirst(idxkey, dtlR.ship_alloc_sts_no());
				
				msgL.addAll(checkUpdCntrNE(dtlR, DtlR.$ship_pr_upd_cntr, shipPrR));		
				
				if (!isNull(shipPrR)) {
					
					shipPrR.setAttributes(dtlR);
					
					if (!isNull(shipPrR.loc_cd())) {
						
						msgL.addAll(checkWritableLocCdDac(shipPrR, MST_SHIP_PR_R.$loc_cd));
					}
					else if (!isNull(shipPrR.ship_lg_grp_cd())) {
						
						msgL.addAll(checkWritableLgGrpCdDac(shipPrR, MST_SHIP_PR_R.$ship_lg_grp_cd));
					}
					else if (!isNull(shipPrR.alloc_grp_cd())) {
						msgL.addAll(checkWritableAlcGrpCdDac(shipPrR, MST_SHIP_PR_R.$alloc_grp_cd));
					}
					
					dtlR.ship_pr_no(shipPrR.ship_pr_no());
					dtlR.alloc_grp_cd(shipPrR.alloc_grp_cd());
					dtlR.slo_d_no(shipPrR.slo_d_no());
					dtlR.ship_fr_lg_grp_cd(shipPrR.getStringNE("ship_fr_lg_grp_cd"));
					dtlR.ship_loc_cd(shipPrR.getStringNE("ship_loc_cd"));
					dtlR.pack_unit_qty(shipPrR.getNumberNE("pack_unit_qty"));
					dtlR.pack_unit_cd(shipPrR.getStringNE("pack_unit_cd"));
				}
			}

			return msgL;
		}
		
		/**
		 * 出荷予定サービスの更新（引当解除）前チェック処理を呼び出す。
		 */
		protected void callShipSchdServiceChk06() {
			
			MSBEL_ShipSchdService.ShipSchd_Chk06 chk06Serv = MSBEL_ShipSchdService.crtShipSchd_Chk06();
			
			addAll(chk06Serv.up0(), up0(), createMap_ShipSchd_Upd06_DtlR_DtlR());
		    
			chk06Serv.exec();
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			
			down0().setAll(up0());
		}
	}
	
	protected Map_ShipSchd_Upd06_DtlR_DtlR<ShipSchd_Upd06_DtlR,DtlR> createMap_ShipSchd_Upd06_DtlR_DtlR() {
		return new Map_ShipSchd_Upd06_DtlR_DtlR<ShipSchd_Upd06_DtlR, DtlR>();
	}

	public class Map_ShipSchd_Upd06_DtlR_DtlR<D extends ShipSchd_Upd06_DtlR, S extends DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			
			addColumnPathMap(ShipSchd_Upd06_DtlR.$peg_no, DtlR.$peg_no);
			addColumnPathMap(ShipSchd_Upd06_DtlR.$ship_alloc_sts_no, DtlR.$ship_alloc_sts_no);
			addColumnPathMap(ShipSchd_Upd06_DtlR.$alloc_rel_qty, DtlR.$alloc_rel_qty);
		}
	}
	
	protected Map_SloSts_DtlR_DtlR<SloSts_DtlR,DtlR> createMap_SloSts_DtlR_DtlR() {
		return new Map_SloSts_DtlR_DtlR<SloSts_DtlR, DtlR>();
	}

	public class Map_SloSts_DtlR_DtlR<D extends SloSts_DtlR, S extends DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			
			addColumnPathMap(SloSts_DtlR.$slo_d_no, DtlR.$slo_d_no);
			addColumnPathMap(SloSts_DtlR.$alloc_grp_cd, DtlR.$alloc_grp_cd);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			dest.ship_lg_grp_cd(src.ship_fr_lg_grp_cd());
			dest.unit_cd(src.pack_unit_cd());
			dest.qty(src.alloc_rel_qty().multiply(-1));
			dest.loc_cd(src.ship_loc_cd());
			dest.slo_sts_typ(MSC_SLO_STS_TYP.ALLOC_REL.value());
		}
	}

	//FMCB CUSTOM END
}