package mcframe.serverMABG.MABGL0350;

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
import mcframe.serverMABG.MABGL0350.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABGL_CostIoReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABGL_CostIoReg_MC extends MABGL_CostIoReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * CostIo_UpdChk01オペレーション.<p>
	 *
	 * 原価個別受払表マスタを登録する前のチェック処理を行います。<br>
	 */
	public class CostIo_UpdChk01 extends MABGL_CostIoReg_MC_A.CostIo_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CostIo_Upd01オペレーション.<p>
	 *
	 * 原価個別受払表マスタの登録処理を行います。<br>
	 */
	public class CostIo_Upd01 extends MABGL_CostIoReg_MC_A.CostIo_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CostIoLcl_UpdChk01オペレーション.<p>
	 *
	 * 原価個別受払表マスタ(ロケール別情報)を登録する前のチェック処理を行います。<br>
	 */
	public class CostIoLcl_UpdChk01 extends MABGL_CostIoReg_MC_A.CostIoLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CostIoLcl_Upd01オペレーション.<p>
	 *
	 * 原価個別受払表マスタ(ロケール別情報)の登録処理を行います。<br>
	 */
	public class CostIoLcl_Upd01 extends MABGL_CostIoReg_MC_A.CostIoLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CostIo_DelChk01オペレーション.<p>
	 *
	 * 原価個別受払表マスタ、原価個別受払表マスタ(ロケール別情報)の削除前のチェックを行います。<br>
	 */
	public class CostIo_DelChk01 extends MABGL_CostIoReg_MC_A.CostIo_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CostIo_Del01オペレーション.<p>
	 *
	 * 原価個別受払表マスタ、原価個別受払表マスタ(ロケール別情報)の削除を行います。<br>
	 */
	public class CostIo_Del01 extends MABGL_CostIoReg_MC_A.CostIo_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価個別受払表マスタ、原価個別受払表マスタ(ロケール別情報)の検索を行います。<br>
	 */
	public class Srch01 extends MABGL_CostIoReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(
				MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if(builder.getBaseDbc() instanceof MAM_COST_IO_R) {
				dbcCustomizeSub(builder);
			}
		}

		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			
			MAM_ITM_GRP_R ig1 = MAM_ITM_GRP_R.create("IG1");
			MAM_ITM_GRP_R ig2 = MAM_ITM_GRP_R.create("IG2");
			MAM_ITM_GRP_R ig3 = MAM_ITM_GRP_R.create("IG3");
			MAM_ITM_GRP_R ig4 = MAM_ITM_GRP_R.create("IG4");
			MAM_ITM_GRP_R ig5 = MAM_ITM_GRP_R.create("IG5");
			MAM_ITM_GRP_R ig6 = MAM_ITM_GRP_R.create("IG6");
			MAM_ITM_GRP_R ig7 = MAM_ITM_GRP_R.create("IG7");
			MAM_ITM_GRP_R ig8 = MAM_ITM_GRP_R.create("IG8");
			MAM_ITM_GRP_R ig9 = MAM_ITM_GRP_R.create("IG9");
			MAM_ITM_GRP_R ig10 = MAM_ITM_GRP_R.create("IG10");

			builder.addSelect(ig1.itm_grp_nm.as("itm_grp_nm1"));
			builder.addSelect(ig2.itm_grp_nm.as("itm_grp_nm2"));
			builder.addSelect(ig3.itm_grp_nm.as("itm_grp_nm3"));
			builder.addSelect(ig4.itm_grp_nm.as("itm_grp_nm4"));
			builder.addSelect(ig5.itm_grp_nm.as("itm_grp_nm5"));
			builder.addSelect(ig6.itm_grp_nm.as("itm_grp_nm6"));
			builder.addSelect(ig7.itm_grp_nm.as("itm_grp_nm7"));
			builder.addSelect(ig8.itm_grp_nm.as("itm_grp_nm8"));
			builder.addSelect(ig9.itm_grp_nm.as("itm_grp_nm9"));
			builder.addSelect(ig10.itm_grp_nm.as("itm_grp_nm10"));
			
			MAM_COST_IO_R t = MAM_COST_IO_R.create(builder.getBaseDbcAlias());
			builder.addLeftOuterJoin(ig1, t.itm_grp_cd1.eq(ig1.itm_grp_cd)
					.and(ig1.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP1.value()))));
			builder.addLeftOuterJoin(ig2, t.itm_grp_cd2.eq(ig2.itm_grp_cd)
					.and(ig2.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP2.value()))));
			builder.addLeftOuterJoin(ig3, t.itm_grp_cd3.eq(ig3.itm_grp_cd)
					.and(ig3.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP3.value()))));
			builder.addLeftOuterJoin(ig4, t.itm_grp_cd4.eq(ig4.itm_grp_cd)
					.and(ig4.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP4.value()))));
			builder.addLeftOuterJoin(ig5, t.itm_grp_cd5.eq(ig5.itm_grp_cd)
					.and(ig5.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP5.value()))));
			builder.addLeftOuterJoin(ig6, t.itm_grp_cd6.eq(ig6.itm_grp_cd)
					.and(ig6.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP6.value()))));
			builder.addLeftOuterJoin(ig7, t.itm_grp_cd7.eq(ig7.itm_grp_cd)
					.and(ig7.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP7.value()))));
			builder.addLeftOuterJoin(ig8, t.itm_grp_cd8.eq(ig8.itm_grp_cd)
					.and(ig8.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP8.value()))));
			builder.addLeftOuterJoin(ig9, t.itm_grp_cd9.eq(ig9.itm_grp_cd)
					.and(ig9.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP9.value()))));
			builder.addLeftOuterJoin(ig10, t.itm_grp_cd10.eq(ig10.itm_grp_cd)
					.and(ig10.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP10.value()))));
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 原価個別受払表マスタ、原価個別受払表マスタ(ロケール別情報)の登録を行います。<br>
	 */
	public class Upd01 extends MABGL_CostIoReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 原価個別受払表マスタ、原価個別受払表マスタ(ロケール別情報)の削除を行います。<br>
	 */
	public class Del01 extends MABGL_CostIoReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}