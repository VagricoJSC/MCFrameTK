package mcframe.serverMABG.MABGL0610;

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
import mcframe.serverMABG.MABGL0610.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABGL_CostItmOutReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABGL_CostItmOutReg_MC extends MABGL_CostItmOutReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * CostItmOut_UpdChk01オペレーション.<p>
	 *
	 * 原価対象外品目マスタの登録前のチェックを行います。<br>
	 */
	public class CostItmOut_UpdChk01 extends MABGL_CostItmOutReg_MC_A.CostItmOut_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CostItmOut_Upd01オペレーション.<p>
	 *
	 * 原価対象外品目マスタの登録を行います。<br>
	 */
	public class CostItmOut_Upd01 extends MABGL_CostItmOutReg_MC_A.CostItmOut_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CostItmOut_DelChk01オペレーション.<p>
	 *
	 * 原価対象外品目マスタの削除前のチェックを行います。<br>
	 */
	public class CostItmOut_DelChk01 extends MABGL_CostItmOutReg_MC_A.CostItmOut_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CostItmOut_Del01オペレーション.<p>
	 *
	 * 原価対象外品目マスタの削除を行います。<br>
	 */
	public class CostItmOut_Del01 extends MABGL_CostItmOutReg_MC_A.CostItmOut_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価対象外品目マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABGL_CostItmOutReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_COST_ITM_OUT_R) {
				dbcCustomizeSub(builder);
				editDmlItmGrpTyp(builder);
			}
		}

		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			MAM_COST_ITM_OUT_R t = MAM_COST_ITM_OUT_R.create(builder.getBaseDbcAlias());
			MAM_ITM__R itm1 = MAM_ITM__R.create(MAM_COST_ITM_OUT_R.$ITM1);

			/*年月の検索条件をwhere句に追加*/
			builder.addWhereWithCutOffAnd(t.ym.gte(bind(Srch01_CndR.$ym_fr)));
			builder.addWhereWithCutOffAnd(t.ym.lte(bind(Srch01_CndR.$ym_to)));

			/*品目仕訳名の検索条件を追加*/
			if (!isNull(up0().itm_jnl_cd()) || !isNull(up0().itm_jnl_nm())) {
				MAM_ITM_JNL_R itm_jnl1 = MAM_ITM_JNL_R.create("ITM_JNL1");
				builder.addLeftOuterJoin(itm_jnl1, itm1.itm_jnl_cd.eq(itm_jnl1.itm_jnl_cd));
				builder.addWhereWithCutOffAnd(itm_jnl1.itm_jnl_cd.like(bind(Srch01_CndR.$itm_jnl_cd)));
				builder.addWhereWithCutOffAnd(itm_jnl1.itm_jnl_nm.like(bind(Srch01_CndR.$itm_jnl_nm)));
			}

			/*会計品目分類名の検索条件を追加*/
			if (!isNull(up0().ac_itm_grp_cd()) || !isNull(up0().ac_itm_grp_nm())) {
				MAM_AC_ITM_GRP_R ac_itm_grp1 = MAM_AC_ITM_GRP_R.create("AC_ITM_GRP1");
				builder.addLeftOuterJoin(ac_itm_grp1, itm1.ac_itm_grp_cd.eq(ac_itm_grp1.ac_itm_grp_cd));
				builder.addWhereWithCutOffAnd(ac_itm_grp1.ac_itm_grp_cd.like(bind(Srch01_CndR.$ac_itm_grp_cd)));
				builder.addWhereWithCutOffAnd(ac_itm_grp1.ac_itm_grp_nm.like(bind(Srch01_CndR.$ac_itm_grp_nm)));
			}
		}

		protected void editDmlItmGrpTyp(MCQueryApiBuilder builder) {
			MAM_ITM__R itm1 = MAM_ITM__R.create(MAM_COST_ITM_OUT_R.$ITM1);

			if(!isNull(up0().itm_grp_nm1())) {
				MAM_ITM_GRP_R ig1 = MAM_ITM_GRP_R.create("IG1");
				builder.addLeftOuterJoin(ig1, itm1.itm_grp_cd1.eq(ig1.itm_grp_cd)
						.and(ig1.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP1.value()))));
				builder.addWhereWithCutOffAnd(ig1.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm1)));
			}
			if(!isNull(up0().itm_grp_nm2())) {
				MAM_ITM_GRP_R ig2 = MAM_ITM_GRP_R.create("IG2");
				builder.addLeftOuterJoin(ig2, itm1.itm_grp_cd2.eq(ig2.itm_grp_cd)
						.and(ig2.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP2.value()))));
				builder.addWhereWithCutOffAnd(ig2.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm2)));
			}
			if(!isNull(up0().itm_grp_nm3())) {
				MAM_ITM_GRP_R ig3 = MAM_ITM_GRP_R.create("IG3");
				builder.addLeftOuterJoin(ig3, itm1.itm_grp_cd3.eq(ig3.itm_grp_cd)
						.and(ig3.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP3.value()))));
				builder.addWhereWithCutOffAnd(ig3.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm3)));
			}
			if(!isNull(up0().itm_grp_nm4())) {
				MAM_ITM_GRP_R ig4 = MAM_ITM_GRP_R.create("IG4");
				builder.addLeftOuterJoin(ig4, itm1.itm_grp_cd4.eq(ig4.itm_grp_cd)
						.and(ig4.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP4.value()))));
				builder.addWhereWithCutOffAnd(ig4.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm4)));
			}
			if(!isNull(up0().itm_grp_nm5())) {
				MAM_ITM_GRP_R ig5 = MAM_ITM_GRP_R.create("IG5");
				builder.addLeftOuterJoin(ig5, itm1.itm_grp_cd5.eq(ig5.itm_grp_cd)
						.and(ig5.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP5.value()))));
				builder.addWhereWithCutOffAnd(ig5.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm5)));
			}
			if(!isNull(up0().itm_grp_nm6())) {
				MAM_ITM_GRP_R ig6 = MAM_ITM_GRP_R.create("IG6");
				builder.addLeftOuterJoin(ig6, itm1.itm_grp_cd6.eq(ig6.itm_grp_cd)
						.and(ig6.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP6.value()))));
				builder.addWhereWithCutOffAnd(ig6.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm6)));
			}
			if(!isNull(up0().itm_grp_nm7())) {
				MAM_ITM_GRP_R ig7 = MAM_ITM_GRP_R.create("IG7");
				builder.addLeftOuterJoin(ig7, itm1.itm_grp_cd7.eq(ig7.itm_grp_cd)
						.and(ig7.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP7.value()))));
				builder.addWhereWithCutOffAnd(ig7.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm7)));
			}
			if(!isNull(up0().itm_grp_nm8())) {
				MAM_ITM_GRP_R ig8 = MAM_ITM_GRP_R.create("IG8");
				builder.addLeftOuterJoin(ig8, itm1.itm_grp_cd8.eq(ig8.itm_grp_cd)
						.and(ig8.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP8.value()))));
				builder.addWhereWithCutOffAnd(ig8.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm8)));
			}
			if(!isNull(up0().itm_grp_nm9())) {
				MAM_ITM_GRP_R ig9 = MAM_ITM_GRP_R.create("IG9");
				builder.addLeftOuterJoin(ig9, itm1.itm_grp_cd9.eq(ig9.itm_grp_cd)
						.and(ig9.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP9.value()))));
				builder.addWhereWithCutOffAnd(ig9.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm9)));
			}
			if(!isNull(up0().itm_grp_nm10())) {
				MAM_ITM_GRP_R ig10 = MAM_ITM_GRP_R.create("IG10");
				builder.addLeftOuterJoin(ig10, itm1.itm_grp_cd10.eq(ig10.itm_grp_cd)
						.and(ig10.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP10.value()))));
				builder.addWhereWithCutOffAnd(ig10.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm10)));
			}

			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd1.like(bind(Srch01_CndR.$itm_grp_cd1)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd2.like(bind(Srch01_CndR.$itm_grp_cd2)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd3.like(bind(Srch01_CndR.$itm_grp_cd3)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd4.like(bind(Srch01_CndR.$itm_grp_cd4)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd5.like(bind(Srch01_CndR.$itm_grp_cd5)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd6.like(bind(Srch01_CndR.$itm_grp_cd6)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd7.like(bind(Srch01_CndR.$itm_grp_cd7)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd8.like(bind(Srch01_CndR.$itm_grp_cd8)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd9.like(bind(Srch01_CndR.$itm_grp_cd9)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd10.like(bind(Srch01_CndR.$itm_grp_cd10)));

			// 品目区分と品目区分詳細
			MAM_ITM_TYP_D_R itm_typ_d1 = MAM_ITM_TYP_D_R.create("ITM_TYP_D1");
			builder.addSelect(itm1.itm_typ);
			builder.addSelect(itm1.itm_typ_d_cd);
			builder.addSelect(itm_typ_d1.itm_typ_d_nm);
			builder.addLeftOuterJoin(itm_typ_d1, itm1.itm_typ.eq(itm_typ_d1.itm_typ)
					.and(itm1.itm_typ_d_cd.eq(itm_typ_d1.itm_typ_d_cd)));
			builder.addWhereWithCutOffAnd(itm1.itm_typ.like(bind(Srch01_CndR.$itm_typ)));
			builder.addWhereWithCutOffAnd(itm1.itm_typ_d_cd.like(bind(Srch01_CndR.$itm_typ_d_cd)));			
			builder.addWhereWithCutOffAnd(itm_typ_d1.itm_typ_d_nm.like(bind(Srch01_CndR.$itm_typ_d_nm)));
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 原価対象外品目マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABGL_CostItmOutReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 原価対象外品目マスタの削除を行います。<br>
	 */
	public class Del01 extends MABGL_CostItmOutReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}