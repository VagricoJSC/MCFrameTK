package mcframe.serverMGBB.MGBBL5030;

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
import mcframe.serverMGBB.MGBBL5030.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBBL_ActItmCopyService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBBL_ActItmCopyService_MC extends MGBBL_ActItmCopyService_MC_A{
	//FMCB CUSTOM START

	/**
	 * ActItmCopy_Chk01オペレーション.<p>
	 *
	 * コピー前チェック<br>
	 */
	public class ActItmCopy_Chk01 extends MGBBL_ActItmCopyService_MC_A.ActItmCopy_Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			preProc();
			setDown();
		}

		/**
		 * ＷＫテーブル設定、値補完
		 */
		protected void preProc() {
			setCalcCtgWk();
			setWgWk();
		}
		
		/**
		 * MGW_CALC_CTGにコピー元対象の計算カテゴリを設定する。
		 */
		protected void setCalcCtgWk() {
			MCList<MGW_CALC_CTG_R> wkL = MCList.create(MGW_CALC_CTG_R.class);
			
			for(String ctg : MCStringUtil.arrayValueSplit(up0().act_calc_ctg_cd())){
				MGW_CALC_CTG_R wk = wkL.createRow();
				wk.calc_ctg_cd(ctg);
				wk.ctg_prio(0); //優先順位は何でも良い

				if(isNull(wkL.getFirst(MGW_CALC_CTG_R.$calc_ctg_cd, ctg))){
					wkL.add(wk);
				}
			}

			dbInsertEx("MGBBL5030_MGW_CALC_CTG_I01", wkL, MCQueryApiBuilder.create(MGW_CALC_CTG_R.create("T")));
		}
		
		/**
		 * MGW_WGにコピー元対象のワーキンググループを設定する。
		 */
		protected void setWgWk() {
			MCList<MGW_WG_R> wkL = MCList.create(MGW_WG_R.class);
			
			for(String wg : MCStringUtil.arrayValueSplit(up0().wg_cd())){
				MGW_WG_R wk = wkL.createRow();
				wk.wg_cd(wg);

				if(isNull(wkL.getFirst(MGW_WG_R.$wg_cd, wg))){
					wkL.add(wk);
				}
			}

			execDbDelete("MGBBL5030_MGW_WG_D01", wkL.createRow(), null);
			dbInsertEx("MGBBL5030_MGW_WG_I01", wkL, MCQueryApiBuilder.create(MGW_WG_R.create("T")));
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}
	}
	/**
	 * ActItmCopy_Ins01オペレーション.<p>
	 *
	 * 原価実績品目情報コピー<br>
	 */
	public class ActItmCopy_Ins01 extends MGBBL_ActItmCopyService_MC_A.ActItmCopy_Ins01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				initBatchLogger(dbTran());
				writeStartLogWithLogger(null);
				execMain();
			}
			catch (Exception ex) {
				handleExWithLogger(ex);
			}
			finally {
				writeEndLogWithLogger(null);
			}
		}

		protected void execMain() {
			callThisChk01();
			throwUpdErr();
			callProc();
		}

		protected void callThisChk01() {
			MGBBL_ActItmCopyService.ActItmCopy_Chk01 ope = MGBBL_ActItmCopyService.crtActItmCopy_Chk01();
			MCRow.copyall(ope.up0(), up0());
			ope.exec();
			MCRow.copyall(up0(), ope.down0());
		}

		protected void callProc() {
			String procId = "MGPA_ACT_COPY_ITM_INFO$P_MAIN";
			execProc(createSqlId(LOGIC_ID, procId, "01"), procId, up0(), null, 
					":ym_fr, " +
					":ym_to, " +
					":calc_ctg_cd, " +
					":term, " +
					":itm_flg, " +
					":dtl_flg, " +
					":oper_flg, " +
					":bom_flg, " +
					":wk_flg, " +
					":purc_flg, " +
					":proc_flg, " +
					":prov_flg, " +
					":sls_flg, " +
					":ptn_set_typ");
		}
	}

	//FMCB CUSTOM END
}