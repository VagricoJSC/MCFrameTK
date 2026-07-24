package mcframe.serverMSBC.MSBCB0020;

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
import mcframe.serverMSBC.MSBCL5050.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCB_PrcdMrpExecute"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCB_PrcdMrpExecute_MC extends MSBCB_PrcdMrpExecute_MC_A{
	//FMCB CUSTOM START

	/**
	 * PrcdMrpExecute_Upd01オペレーション.<p>
	 *
	 * 先行手配用所要量計算処理を実行するバッチです。<br>
	 */
	public class PrcdMrpExecute_Upd01 extends MSBCB_PrcdMrpExecute_MC_A.PrcdMrpExecute_Upd01 {

		/** 例外発生ＦＬＧ **/
		protected boolean _exceptionFlg;

		@Override
		protected void call() {
			super.call();
		}

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

		/** 所要量計算サービスを実行する。 */
		protected void execMain() {
			_exceptionFlg = false;

			MSBCL_MrpExecService.MRP_Upd01 ope = MSBCL_MrpExecService.crtMRP_Upd01();
			Mrp_Upd01_DtlR upR = Mrp_Upd01_DtlR.create();
			copy(upR, up0(), createMap_Mrp_Upd01_DtlR_PrcdMrp_CndR());
			ope.up0().add(upR);

			ope.exec();
		}

		/** バッチログを初期化する。 */
		protected void initLogger() {
			getConcurrentLogger();
		}

		/** 開始ログを出力する。 */
		protected void writeStartLog() {
			logger().writeStartLog(MSBCL0106);
			pushStartLog(logger());
		}

		/** 終了ログを出力する。 */
		protected void writeEndLog() {
			if (_exceptionFlg) {
				logger().writeProcessLog(MAUDL0009);
				MCMessagePool.add(MAUDL0009);
				pushErrorLog(logger());
			}
			logger().writeEndLog(MSBCL0107);
			pushEndLog(logger());
            logger().close();
		}

		/** 例外発生時の処理を行う。 */
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

		protected Map_Mrp_Upd01_DtlR_PrcdMrp_CndR <Mrp_Upd01_DtlR,PrcdMrp_CndR> createMap_Mrp_Upd01_DtlR_PrcdMrp_CndR () {
			return new Map_Mrp_Upd01_DtlR_PrcdMrp_CndR <Mrp_Upd01_DtlR, PrcdMrp_CndR>();
		}

		public class Map_Mrp_Upd01_DtlR_PrcdMrp_CndR <D extends Mrp_Upd01_DtlR, S extends PrcdMrp_CndR> extends MCRowMapper<D,S>{

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Mrp_Upd01_DtlR.$wg_cd, PrcdMrp_CndR.$wg_cd);
				addColumnPathMap(Mrp_Upd01_DtlR.$gi_schd_fr, PrcdMrp_CndR.$gi_schd_fr);
				addColumnPathMap(Mrp_Upd01_DtlR.$irqmt_fr, PrcdMrp_CndR.$irqmt_fr);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.mrp_typ(MSC_MRP_TYP.PRCD.value());//ＭＲＰ区分：先行手配
				dest.sch_flg(false);
			}
		}
	}

	//FMCB CUSTOM END
}