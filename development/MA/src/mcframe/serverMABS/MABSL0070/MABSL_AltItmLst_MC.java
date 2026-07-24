package mcframe.serverMABS.MABSL0070;

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
import mcframe.serverMABS.MABSL0070.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL0080.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MABSL_AltItmLst"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABSL_AltItmLst_MC extends MABSL_AltItmLst_MC_A{
	//FMCB CUSTOM START

	/**
	 * AltItmLst_DelChk01オペレーション.<p>
	 *
	 * 代替品目マスタを削除する前のチェックを行う<br>
	 */
	public class AltItmLst_DelChk01 extends MABSL_AltItmLst_MC_A.AltItmLst_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();
			
			msgLst.addAll(checkWritableWgCdDac(
					up0().subList(r -> !MAC_STR.isNULL_VAL(r.wg_cd())),
					AltItmLst_DelChk01_DtlR.$wg_cd));
			
			return msgLst;
		}
	}
	/**
	 * AltItmLst_Del01オペレーション.<p>
	 *
	 * 代替品目マスタを削除する<br>
	 */
	public class AltItmLst_Del01 extends MABSL_AltItmLst_MC_A.AltItmLst_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索処理を行う<br>
	 */
	public class Srch01 extends MABSL_AltItmLst_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_ALT_ITM_R) {
				dbcCustomizeSub(builder, rslt);
			}
		}

		protected <R extends MCDBContainer> void dbcCustomizeSub(
				MCQueryApiBuilder builder, MCList<R> rslt) {
			dbcCustomizeCommon(builder, rslt);

			MAM_ALT_ITM_R t = MAM_ALT_ITM_R.create(builder.getBaseDbcAlias());
			MAM_ITM__R itm1 = MAM_ITM__R.create(MAM_ALT_ITM_R.$ITM1);
			MAVM_RD_WG_R S1WG2 = MAVM_RD_WG_R.create("WG2");
			if (up0().cmn_flg() == up0().wg_flg()) {
				builder.addWhereWithAnd(t.wg_cd.eq(value(MAC_STR.NULL_VAL.value()))
						.or(exists(subQuery().select(S1WG2.prAll()).from(S1WG2)
								.where(value(0).eq(value(0))
										.and(t.wg_cd.eq(S1WG2.wg_cd))))));
			}
			else if (up0().cmn_flg()) {
				builder.addWhereWithAnd(t.wg_cd.eq(value(MAC_STR.NULL_VAL.value())));
			}
			else if (up0().wg_flg()) {
				builder.addWhereWithAnd(
						exists(subQuery().select(S1WG2.prAll()).from(S1WG2)
								.where(value(0).eq(value(0))
										.and(t.wg_cd.eq(S1WG2.wg_cd)))));
			}

			if (!isNull(up0().chd_itm_grp_nm1())) {
				MAM_ITM_GRP_R ig11 = MAM_ITM_GRP_R.create("IG11");
				builder.addLeftOuterJoin(ig11, itm1.itm_grp_cd1.eq(ig11.itm_grp_cd)
						.and(ig11.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP1.value()))));
				builder.addWhereWithCutOffAnd(
						ig11.itm_grp_nm.like(bind(Srch01_CndR.$chd_itm_grp_nm1)));
			}
			if (!isNull(up0().chd_itm_grp_nm2())) {
				MAM_ITM_GRP_R ig12 = MAM_ITM_GRP_R.create("IG12");
				builder.addLeftOuterJoin(ig12, itm1.itm_grp_cd2.eq(ig12.itm_grp_cd)
						.and(ig12.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP2.value()))));
				builder.addWhereWithCutOffAnd(
						ig12.itm_grp_nm.like(bind(Srch01_CndR.$chd_itm_grp_nm2)));
			}
			if (!isNull(up0().chd_itm_grp_nm3())) {
				MAM_ITM_GRP_R ig13 = MAM_ITM_GRP_R.create("IG13");
				builder.addLeftOuterJoin(ig13, itm1.itm_grp_cd3.eq(ig13.itm_grp_cd)
						.and(ig13.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP3.value()))));
				builder.addWhereWithCutOffAnd(
						ig13.itm_grp_nm.like(bind(Srch01_CndR.$chd_itm_grp_nm3)));
			}
			if (!isNull(up0().chd_itm_grp_nm4())) {
				MAM_ITM_GRP_R ig14 = MAM_ITM_GRP_R.create("IG14");
				builder.addLeftOuterJoin(ig14, itm1.itm_grp_cd4.eq(ig14.itm_grp_cd)
						.and(ig14.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP4.value()))));
				builder.addWhereWithCutOffAnd(
						ig14.itm_grp_nm.like(bind(Srch01_CndR.$chd_itm_grp_nm4)));
			}
			if (!isNull(up0().chd_itm_grp_nm5())) {
				MAM_ITM_GRP_R ig15 = MAM_ITM_GRP_R.create("IG15");
				builder.addLeftOuterJoin(ig15, itm1.itm_grp_cd5.eq(ig15.itm_grp_cd)
						.and(ig15.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP5.value()))));
				builder.addWhereWithCutOffAnd(
						ig15.itm_grp_nm.like(bind(Srch01_CndR.$chd_itm_grp_nm5)));
			}
			if (!isNull(up0().chd_itm_grp_nm6())) {
				MAM_ITM_GRP_R ig16 = MAM_ITM_GRP_R.create("IG16");
				builder.addLeftOuterJoin(ig16, itm1.itm_grp_cd6.eq(ig16.itm_grp_cd)
						.and(ig16.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP6.value()))));
				builder.addWhereWithCutOffAnd(
						ig16.itm_grp_nm.like(bind(Srch01_CndR.$chd_itm_grp_nm6)));
			}
			if (!isNull(up0().chd_itm_grp_nm7())) {
				MAM_ITM_GRP_R ig17 = MAM_ITM_GRP_R.create("IG17");
				builder.addLeftOuterJoin(ig17, itm1.itm_grp_cd7.eq(ig17.itm_grp_cd)
						.and(ig17.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP7.value()))));
				builder.addWhereWithCutOffAnd(
						ig17.itm_grp_nm.like(bind(Srch01_CndR.$chd_itm_grp_nm7)));
			}
			if (!isNull(up0().chd_itm_grp_nm8())) {
				MAM_ITM_GRP_R ig18 = MAM_ITM_GRP_R.create("IG18");
				builder.addLeftOuterJoin(ig18, itm1.itm_grp_cd8.eq(ig18.itm_grp_cd)
						.and(ig18.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP8.value()))));
				builder.addWhereWithCutOffAnd(
						ig18.itm_grp_nm.like(bind(Srch01_CndR.$chd_itm_grp_nm8)));
			}
			if (!isNull(up0().chd_itm_grp_nm9())) {
				MAM_ITM_GRP_R ig19 = MAM_ITM_GRP_R.create("IG19");
				builder.addLeftOuterJoin(ig19, itm1.itm_grp_cd9.eq(ig19.itm_grp_cd)
						.and(ig19.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP9.value()))));
				builder.addWhereWithCutOffAnd(
						ig19.itm_grp_nm.like(bind(Srch01_CndR.$chd_itm_grp_nm9)));
			}
			if (!isNull(up0().chd_itm_grp_nm10())) {
				MAM_ITM_GRP_R ig20 = MAM_ITM_GRP_R.create("IG20");
				builder.addLeftOuterJoin(ig20, itm1.itm_grp_cd10.eq(ig20.itm_grp_cd)
						.and(ig20.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP10.value()))));
				builder.addWhereWithCutOffAnd(
						ig20.itm_grp_nm.like(bind(Srch01_CndR.$chd_itm_grp_nm10)));
			}

			builder.addWhereWithCutOffAnd(
					itm1.itm_grp_cd1.like(bind(Srch01_CndR.$chd_itm_grp_cd1)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_grp_cd2.like(bind(Srch01_CndR.$chd_itm_grp_cd2)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_grp_cd3.like(bind(Srch01_CndR.$chd_itm_grp_cd3)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_grp_cd4.like(bind(Srch01_CndR.$chd_itm_grp_cd4)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_grp_cd5.like(bind(Srch01_CndR.$chd_itm_grp_cd5)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_grp_cd6.like(bind(Srch01_CndR.$chd_itm_grp_cd6)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_grp_cd7.like(bind(Srch01_CndR.$chd_itm_grp_cd7)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_grp_cd8.like(bind(Srch01_CndR.$chd_itm_grp_cd8)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_grp_cd9.like(bind(Srch01_CndR.$chd_itm_grp_cd9)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_grp_cd10.like(bind(Srch01_CndR.$chd_itm_grp_cd10)));
		}
	}

	protected <R extends MCDBContainer> void dbcCustomizeCommon(MCQueryApiBuilder builder,
			MCList<R> rslt) {
		MAM_WG_R wg1 = MAM_WG_R.create("WG1");
		MAM_ITM_TYP_D_R itmtypd1 = MAM_ITM_TYP_D_R.create("ITMTYPD1");
		MAM_ALT_GRP__R alt_grp1 = MAM_ALT_GRP__R.create(MAM_ALT_ITM_R.$ALT_GRP1);
		MAM_ITM__R itm1 = MAM_ITM__R.create(MAM_ALT_ITM_R.$ITM1);

		// Select
		builder.addSelect(alt_grp1.alt_itm_typ);
		builder.addSelect(wg1.wg_nm);
		builder.addSelect(itm1.unit_cd);
		builder.addSelect(itm1.dec_place);
		builder.addSelect(itm1.itm_typ);
		builder.addSelect(itm1.itm_typ_d_cd);
		builder.addSelect(itmtypd1.itm_typ_d_nm);
		builder.addSelect(itm1.ver_flg);
		rslt.addBooleanColumn("ver_flg");
		builder.addSelect(itm1.cont_fctr_flg);
		rslt.addBooleanColumn("cont_fctr_flg");

		// Join
		MAM_ALT_ITM_R t = MAM_ALT_ITM_R.create(builder.getBaseDbcAlias());
		builder.addLeftOuterJoin(wg1, t.wg_cd.eq(wg1.wg_cd));
		builder.addLeftOuterJoin(itmtypd1, itm1.itm_typ.eq(itmtypd1.itm_typ)
				.and(itm1.itm_typ_d_cd.eq(itmtypd1.itm_typ_d_cd)));
	}
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 登録対象の補正を行います。<br>
	 */
	public class Sprt01 extends MABSL_AltItmLst_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			dbcCustomizeCommon(builder, rslt);
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 登録処理を行う<br>
	 */
	public class Upd01 extends MABSL_AltItmLst_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 削除処理を行う<br>
	 */
	public class Del01 extends MABSL_AltItmLst_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}