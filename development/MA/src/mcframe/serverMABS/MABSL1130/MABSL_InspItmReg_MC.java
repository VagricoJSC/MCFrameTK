package mcframe.serverMABS.MABSL1130;

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

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMABS.MABSL0350.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL1130.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL0170.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL0180.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL0190.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABSL_InspItmReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABSL_InspItmReg_MC extends MABSL_InspItmReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 購買品関連の検索を行います。<br>
	 */
	public class Srch01 extends MABSL_InspItmReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(
				MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);

			if (builder.getBaseDbc() instanceof MAM_ITM__R) {
				dbcCustomizeItm(builder, rslt);
			}
		}

		protected <R extends MCDBContainer> void dbcCustomizeItm(MCQueryApiBuilder builder, MCList<R> rslt) {
			MAM_UNIT_R unit1 = MAM_UNIT_R.create("UNIT1");
			MAM_ITM_TYP_D_R itd1 = MAM_ITM_TYP_D_R.create("ITD1");
			MAM_ITM__R t = MAM_ITM__R.create(builder.getBaseDbcAlias());

			builder.addLeftOuterJoin(unit1, unit1.unit_cd.eq(t.unit_cd));
			builder.addLeftOuterJoin(itd1, itd1.itm_typ.eq(t.itm_typ)
					.and(itd1.itm_typ_d_cd.eq(t.itm_typ_d_cd)));
			builder.addSelect(unit1.unit_nm);
			builder.addSelect(itd1.def_insp_aprv_flg);
			builder.addSelect(itd1.def_insp_aprv_role_cd);
			rslt.addBooleanColumn("def_insp_aprv_flg");

		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 購買品関連の登録を行います。<br>
	 */
	public class Upd01 extends MABSL_InspItmReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected <R extends MCDBContainer> void updDbcCustomize(MCQueryApiBuilder builder, MCList<R> rslt) {
			super.updDbcCustomize(builder, rslt);

			if (builder.getBaseDbc() instanceof MAM_ITM_COM_R) {
				updDbcCustomizeItm(builder, rslt);
			}
		}
		protected <R extends MCDBContainer> void updDbcCustomizeItm(MCQueryApiBuilder builder, MCList<R> rslt) {
			MAM_ITM_COM_R t = MAM_ITM_COM_R.create(builder.getBaseDbcAlias());

			// 検査設定済ＦＬＧのみ更新
			builder.setSet(t.insp_input_flg);
			// キーの会社ＣＤはここで設定
			rslt.setString(MAM_ITM_COM_R.$co_cd, getCo().co_cd());

		}
	}

	//FMCB CUSTOM END
}