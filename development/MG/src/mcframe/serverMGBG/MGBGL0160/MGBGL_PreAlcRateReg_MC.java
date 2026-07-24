package mcframe.serverMGBG.MGBGL0160;

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
import mcframe.serverMGBG.MGBGL0160.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMGBG.MGBGL0160.Query.*;
import mcframe.serverMGBG.MGBGL5200.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.autoCommitDBTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBGL_PreAlcRateReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBGL_PreAlcRateReg_MC extends MGBGL_PreAlcRateReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 一次配賦基準カテゴリマスタを検索する。<br>
	 */
	public class Srch01 extends MGBGL_PreAlcRateReg_MC_A.Srch01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			editUp();
			srch();
		}

		protected void editUp(){
			up0().no_exist_flg_str(toTrueStr(up0().no_exist_flg()));
			up0().pln_mly_flg_str(toTrueStr(MAC_SA_TYP.isPLN(up0().sa_typ())));
			up0().act_mly_flg_str(toTrueStr(MAC_SA_TYP.isACT(up0().sa_typ())));
		}

		protected void srch(){
			insWork();
			executeQuery(down0(), MGBGL0160_MAM_PRE_ALC_CTG_S01(), up0());
			delWork();
		}

		protected void insWork() {
			delWork();

			MCList<MGT_PRE_RATE_MLY_R> wgL = MCList.create(MGT_PRE_RATE_MLY_R.class);
			for (MCDate date = up0().tgt_ym_fr(); date
					.lte(up0().tgt_ym_to()); date = date.addMonth(1)) {
				MGT_PRE_RATE_MLY_R x = MGT_PRE_RATE_MLY_R.create();
				x.ym(date);
				wgL.add(x);
			}

			MCQueryApiBuilder wgL_bldr = MCQueryApiBuilder.create(MGT_PRE_RATE_MLY_R.create("T"));
			dbWkInsert("MGBGL5200_MGW_PRE_RATE_MLY_KEY_I01", wgL, wgL_bldr.getBaseDbc());
		}

		protected void delWork() {
			dbWkDelete("MGBGL5200_MGW_PRE_RATE_MLY_KEY_D01", MCQueryApiBuilder.create(MGT_PRE_RATE_MLY_R.create("T")).getBaseDbc());
		}

		@Override
		protected boolean isDelFlgCtl() {
			return true;
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 比率情報を作成するために、チェックを行う。<br>
	 */
	public class Chk01 extends MGBGL_PreAlcRateReg_MC_A.Chk01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk01_DtlR> notErrL = getChkList(up0());

			for (Chk01_DtlR upR : notErrL){
				// DACチェック
				msgL.addAll(checkWritableWgCdDac(upR, Chk01_DtlR.$wg_cd));
			}

			return msgL;
		}

	}

	/**
	 * Ins01オペレーション.<p>
	 *
	 * 比率情報を作成する。<br>
	 */
	public class Ins01 extends MGBGL_PreAlcRateReg_MC_A.Ins01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				initBatchLogger(autoCommitDBTran());
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
			callThisChk();
			throwErr(msgOpeErr());
			callInsSrv();
		}

		/**
		 * チェック実行
		 */
		protected void callThisChk() {
			MGBGL_PreAlcRateReg.Chk01 ope = MGBGL_PreAlcRateReg.crtChk01();
			ope.up0().setAll(up0());
			ope.exec();
		}

		/**
		 * サービス実行
		 */
		protected void callInsSrv() {
			MGBGL_PreAlcRateService.PreAlcRate_Upd01 ope = MGBGL_PreAlcRateService.crtPreAlcRate_Upd01();
			setAll(ope.up0(), up0(), createMap_PreAlcRate_Chk01_DtlR_Chk01_DtlR());
			ope.exec();
		}

		protected Map_PreAlcRate_Chk01_DtlR_Chk01_DtlR<PreAlcRate_Chk01_DtlR, Chk01_DtlR> createMap_PreAlcRate_Chk01_DtlR_Chk01_DtlR() {
			return new Map_PreAlcRate_Chk01_DtlR_Chk01_DtlR<PreAlcRate_Chk01_DtlR, Chk01_DtlR>();
		}

		public class Map_PreAlcRate_Chk01_DtlR_Chk01_DtlR<D extends PreAlcRate_Chk01_DtlR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PreAlcRate_Chk01_DtlR.$sa_typ, Chk01_DtlR.$sa_typ);
				addColumnPathMap(PreAlcRate_Chk01_DtlR.$ym, Chk01_DtlR.$ym);
				addColumnPathMap(PreAlcRate_Chk01_DtlR.$ym_fr, Chk01_DtlR.$ym_fr);
				addColumnPathMap(PreAlcRate_Chk01_DtlR.$ym_to, Chk01_DtlR.$ym_to);
				addColumnPathMap(PreAlcRate_Chk01_DtlR.$calc_ctg_cd, Chk01_DtlR.$calc_ctg_cd);
				addColumnPathMap(PreAlcRate_Chk01_DtlR.$pre_alc_rate_cd, Chk01_DtlR.$pre_alc_rate_cd);
				addColumnPathMap(PreAlcRate_Chk01_DtlR.$wg_cd, Chk01_DtlR.$wg_cd);
			}
		}

	}

	//FMCB CUSTOM END
}