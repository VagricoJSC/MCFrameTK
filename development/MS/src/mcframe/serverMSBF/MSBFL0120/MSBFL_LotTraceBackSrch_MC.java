package mcframe.serverMSBF.MSBFL0120;

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
import mcframe.serverMSBF.MSBFL5200.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MSBFL_LotTraceBackSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBFL_LotTraceBackSrch_MC extends MSBFL_LotTraceBackSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * ロットトレース入庫情報・出庫情報を検索する<br>
	 */
	public class Srch01 extends MSBFL_LotTraceBackSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			editUp();
			MSBFL_LotTraceService.LotTrace_Srch02 o = MSBFL_LotTraceService.crtLotTrace_Srch02();
			o.up0().add(up0());

			o.exec();

			down0().addAll(o.down0());
		}
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			if (MAC_STR.isNULL_VAL(up0().sublot_no())) {
				MAM_ITM_R itmR = MAM_ITM_R.create();
				MAM_ITM_R t = MAM_ITM_R.create("T");
				MCQueryApiBuilder itmR_bldr = MCQueryApiBuilder.create(t);
				itmR_bldr.setSelect(t.sublot_mng_typ);
				dbSelectKey("MSBFL0120_MAM_ITM_S01", itmR, itmR_bldr, up0());
				if (MAC_SUBLOT_MNG_TYP.isSTK(itmR.sublot_mng_typ())) {
					up0().sublot_no(null);
				}
			}
		}
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * ロットトレース入庫情報、ロットトレース出庫情報、承認情報、判定情報を検索する<br>
	 */
	public class Srch02 extends MSBFL_LotTraceBackSrch_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			MSBFL_LotTraceService.LotTrace_Srch01 o = MSBFL_LotTraceService.crtLotTrace_Srch01();
			// 原因調査の場合は出庫情報で親ロットを条件とする。
			// ただし、階層の最上位の場合には親ロットは存在しないため親ロットを条件としない。
			if (!isTopHrrchy()) up0().out_use_par_lot_flg(true);
			o.up0().add(up0());

			o.exec();

			down0().addAll(o.down0());
			down1().addAll(o.down1());
			down2().addAll(o.down2());
		}

		/**
		 * 階層の最上位かどうかを返す。
		 * @return
		 */
		protected boolean isTopHrrchy() {
			return isNullOr(up0().par_itm_cd(), up0().par_itm_sub1(), up0().par_itm_sub2(),
					up0().par_itm_sub3(), up0().par_lot_no(), up0().par_sublot_no(),
					up0().par_sno1(), up0().par_sno2(), up0().par_sno3(), up0().par_sno4());
		}
	}

	//FMCB CUSTOM END
}