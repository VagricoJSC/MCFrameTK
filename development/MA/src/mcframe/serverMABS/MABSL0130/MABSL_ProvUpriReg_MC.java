package mcframe.serverMABS.MABSL0130;

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
import mcframe.serverMABS.MABSL0130.*;	// このimportはFrameManagerの自動生成で追加されました。

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.IdentityHashMap;

import mcframe.commonCore.sys.MCFactory;
import mcframe.commonCore.util.MCCollectionUtil;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverFXBA.FXBAL0060.FXBAL_MCRLUtil;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverMAUC.MAUCL6010.MAUCL_StEndUtil;
//FMCB CUSTOM_IMPORT END

/**
 * "MABSL_ProvUpriReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABSL_ProvUpriReg_MC extends MABSL_ProvUpriReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * オブジェクト共有用のクラス
	 */
	protected static final Class<MABSL_ProvUpriReg> CLAZZ =
			MABSL_ProvUpriReg.class;

	// ************************************************************

	protected Srch01_CndR cond;

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 支給単価マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABSL_ProvUpriReg_MC_A.Srch01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void condCustomize(MCRow cond) {
			super.condCustomize(cond);
			if (cond != null) {
				condCustomizeSub((Srch01_CndR) cond);
			}
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (rslt.createRow() instanceof MAM_PROV_UPRI__R) {
				dbcCustomizeSub(builder, rslt);
			}
		}

		@Override
		protected <R extends MCDBContainer> void afterSelect(MCList<R> rslt) {
			super.afterSelect(rslt);
			if (rslt.createRow() instanceof MAM_PROV_UPRI__R) {
				afterSelectSub(rslt);
			}
		}
	}

	/**
	 * Aprv_Srch01オペレーション.<p>
	 *
	 * 支給単価マスタ（申請）の検索を行います。<br>
	 */
	public class Aprv_Srch01 extends MABSL_ProvUpriReg_MC_A.Aprv_Srch01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void condCustomize(MCRow cond) {
			super.condCustomize(cond);
			if (cond != null) {
				condCustomizeSub((Srch01_CndR) cond);
			}
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (rslt.createRow() instanceof MAM_PROV_UPRI_APL_R) {
				dbcCustomizeSub(builder, rslt);
				dbcCustomizeSubAprv(builder, rslt);
			}
		}

		@Override
		protected <R extends MCDBContainer> void afterSelect(MCList<R> rslt) {
			super.afterSelect(rslt);
			if (rslt.createRow() instanceof MAM_PROV_UPRI_APL_R) {
				afterSelectSub(rslt);
			}
		}
	}

	protected void condCustomizeSub(Srch01_CndR cond) {
		this.cond = cond;
	}

	protected <R extends MCDBContainer> void dbcCustomizeSub(MCQueryApiBuilder builder,
			MCList<R> rslt) {
		if (isSrchPar()) {
			dbcCustomizeParitm();
		}
		dbcCustomizeCommon(builder, rslt);

		MCDBContainer t = builder.getBaseDbc();
		MAVM_RD_WG_R S1WG2 = MAVM_RD_WG_R.create("WG2");
		
		if (cond.cmn_flg() == cond.wg_flg()) {
			builder.addWhereWithAnd(MCQueryApiBuilder
					.makeEq(t.getColumn$("wg_cd"), value(MAC_STR.NULL_VAL.value()))
					.or(exists(subQuery().select(S1WG2.prAll()).from(S1WG2)
							.where(value(0).eq(value(0))
									.and(MCQueryApiBuilder.makeEq(t.getColumn$("wg_cd"), S1WG2.wg_cd))))));
		}
		else if (cond.cmn_flg()) {
			builder.addWhereWithAnd(MCQueryApiBuilder.makeEq(t.getColumn$("wg_cd"),
					value(MAC_STR.NULL_VAL.value())));
		}
		else if (cond.wg_flg()) {
			builder.addWhereWithAnd(exists(subQuery().select(S1WG2.prAll()).from(S1WG2)
					.where(value(0).eq(value(0))
							.and(MCQueryApiBuilder.makeEq(t.getColumn$("wg_cd"), S1WG2.wg_cd)))));
		}

		MAM_ITM__R itm1 = MAM_ITM__R.create("ITM1");
		MAM_ITM_TYP_D_R itmtypd1 = MAM_ITM_TYP_D_R.create("ITMTYPD1");
		builder.addWhereWithCutOffAnd(itm1.itm_typ.like(bind(Srch01_CndR.$itm_typ)));
		builder.addWhereWithCutOffAnd(
				itm1.itm_typ_d_cd.like(bind(Srch01_CndR.$itm_typ_d_cd)));
		builder.addWhereWithCutOffAnd(
				itmtypd1.itm_typ_d_nm.like(bind(Srch01_CndR.$itm_typ_d_nm)));

		MAM_BP_R bp1 = MAM_BP_R.create("BP1");
		MAM_CNTRY_R cntry1 = MAM_CNTRY_R.create("CNTRY1");
		MAM_AREA_R area1 = MAM_AREA_R.create("AREA1");
		builder.addLeftOuterJoin(cntry1, bp1.cntry_cd.eq(cntry1.cntry_cd));
		builder.addLeftOuterJoin(area1, bp1.area_cd.eq(area1.area_cd));
		builder.addWhereWithCutOffAnd(
				bp1.cntry_cd.like(bind(Srch01_CndR.$prsppl_cntry_cd)));
		builder.addWhereWithCutOffAnd(
				cntry1.cntry_nm.like(bind(Srch01_CndR.$prsppl_cntry_nm)));
		if (cond.prsppl_foreign_flg()) {
			builder.addWhereWithAnd(bp1.cntry_cd.neq(bind("1")), getCo().cntry_cd());
		}
		builder.addWhereWithCutOffAnd(
				bp1.area_cd.like(bind(Srch01_CndR.$prsppl_area_cd)));
		builder.addWhereWithCutOffAnd(
				area1.area_nm.like(bind(Srch01_CndR.$prsppl_area_nm)));

		builder.addWhereWithCutOffAnd(
				itm1.itm_grp_cd1.like(bind(Srch01_CndR.$itm_grp_cd1)));
		builder.addWhereWithCutOffAnd(
				itm1.itm_grp_cd2.like(bind(Srch01_CndR.$itm_grp_cd2)));
		builder.addWhereWithCutOffAnd(
				itm1.itm_grp_cd3.like(bind(Srch01_CndR.$itm_grp_cd3)));
		builder.addWhereWithCutOffAnd(
				itm1.itm_grp_cd4.like(bind(Srch01_CndR.$itm_grp_cd4)));
		builder.addWhereWithCutOffAnd(
				itm1.itm_grp_cd5.like(bind(Srch01_CndR.$itm_grp_cd5)));
		builder.addWhereWithCutOffAnd(
				itm1.itm_grp_cd6.like(bind(Srch01_CndR.$itm_grp_cd6)));
		builder.addWhereWithCutOffAnd(
				itm1.itm_grp_cd7.like(bind(Srch01_CndR.$itm_grp_cd7)));
		builder.addWhereWithCutOffAnd(
				itm1.itm_grp_cd8.like(bind(Srch01_CndR.$itm_grp_cd8)));
		builder.addWhereWithCutOffAnd(
				itm1.itm_grp_cd9.like(bind(Srch01_CndR.$itm_grp_cd9)));
		builder.addWhereWithCutOffAnd(
				itm1.itm_grp_cd10.like(bind(Srch01_CndR.$itm_grp_cd10)));
		if (!isNull(cond.itm_grp_nm1())) {
			MAM_ITM_GRP_R ig1 = MAM_ITM_GRP_R.create("IG1");
			builder.addLeftOuterJoin(ig1, itm1.itm_grp_cd1.eq(ig1.itm_grp_cd)
					.and(ig1.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP1.value()))));
			builder.addWhereWithCutOffAnd(
					ig1.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm1)));
		}
		if (!isNull(cond.itm_grp_nm2())) {
			MAM_ITM_GRP_R ig2 = MAM_ITM_GRP_R.create("IG2");
			builder.addLeftOuterJoin(ig2, itm1.itm_grp_cd2.eq(ig2.itm_grp_cd)
					.and(ig2.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP2.value()))));
			builder.addWhereWithCutOffAnd(
					ig2.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm2)));
		}
		if (!isNull(cond.itm_grp_nm3())) {
			MAM_ITM_GRP_R ig3 = MAM_ITM_GRP_R.create("IG3");
			builder.addLeftOuterJoin(ig3, itm1.itm_grp_cd3.eq(ig3.itm_grp_cd)
					.and(ig3.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP3.value()))));
			builder.addWhereWithCutOffAnd(
					ig3.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm3)));
		}
		if (!isNull(cond.itm_grp_nm4())) {
			MAM_ITM_GRP_R ig4 = MAM_ITM_GRP_R.create("IG4");
			builder.addLeftOuterJoin(ig4, itm1.itm_grp_cd4.eq(ig4.itm_grp_cd)
					.and(ig4.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP4.value()))));
			builder.addWhereWithCutOffAnd(
					ig4.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm4)));
		}
		if (!isNull(cond.itm_grp_nm5())) {
			MAM_ITM_GRP_R ig5 = MAM_ITM_GRP_R.create("IG5");
			builder.addLeftOuterJoin(ig5, itm1.itm_grp_cd5.eq(ig5.itm_grp_cd)
					.and(ig5.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP5.value()))));
			builder.addWhereWithCutOffAnd(
					ig5.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm5)));
		}
		if (!isNull(cond.itm_grp_nm6())) {
			MAM_ITM_GRP_R ig6 = MAM_ITM_GRP_R.create("IG6");
			builder.addLeftOuterJoin(ig6, itm1.itm_grp_cd6.eq(ig6.itm_grp_cd)
					.and(ig6.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP6.value()))));
			builder.addWhereWithCutOffAnd(
					ig6.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm6)));
		}
		if (!isNull(cond.itm_grp_nm7())) {
			MAM_ITM_GRP_R ig7 = MAM_ITM_GRP_R.create("IG7");
			builder.addLeftOuterJoin(ig7, itm1.itm_grp_cd7.eq(ig7.itm_grp_cd)
					.and(ig7.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP7.value()))));
			builder.addWhereWithCutOffAnd(
					ig7.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm7)));
		}
		if (!isNull(cond.itm_grp_nm8())) {
			MAM_ITM_GRP_R ig8 = MAM_ITM_GRP_R.create("IG8");
			builder.addLeftOuterJoin(ig8, itm1.itm_grp_cd8.eq(ig8.itm_grp_cd)
					.and(ig8.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP8.value()))));
			builder.addWhereWithCutOffAnd(
					ig8.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm8)));
		}
		if (!isNull(cond.itm_grp_nm9())) {
			MAM_ITM_GRP_R ig9 = MAM_ITM_GRP_R.create("IG9");
			builder.addLeftOuterJoin(ig9, itm1.itm_grp_cd9.eq(ig9.itm_grp_cd)
					.and(ig9.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP9.value()))));
			builder.addWhereWithCutOffAnd(
					ig9.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm9)));
		}
		if (!isNull(cond.itm_grp_nm10())) {
			MAM_ITM_GRP_R ig10 = MAM_ITM_GRP_R.create("IG10");
			builder.addLeftOuterJoin(ig10, itm1.itm_grp_cd10.eq(ig10.itm_grp_cd)
					.and(ig10.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP10.value()))));
			builder.addWhereWithCutOffAnd(
					ig10.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm10)));
		}

		builder.addWhereWithCutOffAnd(
				bp1.bp_grp_cd1.like(bind(Srch01_CndR.$prsppl_grp_cd1)));
		builder.addWhereWithCutOffAnd(
				bp1.bp_grp_cd2.like(bind(Srch01_CndR.$prsppl_grp_cd2)));
		builder.addWhereWithCutOffAnd(
				bp1.bp_grp_cd3.like(bind(Srch01_CndR.$prsppl_grp_cd3)));
		builder.addWhereWithCutOffAnd(
				bp1.bp_grp_cd4.like(bind(Srch01_CndR.$prsppl_grp_cd4)));
		builder.addWhereWithCutOffAnd(
				bp1.bp_grp_cd5.like(bind(Srch01_CndR.$prsppl_grp_cd5)));
		builder.addWhereWithCutOffAnd(
				bp1.bp_grp_cd6.like(bind(Srch01_CndR.$prsppl_grp_cd6)));
		builder.addWhereWithCutOffAnd(
				bp1.bp_grp_cd7.like(bind(Srch01_CndR.$prsppl_grp_cd7)));
		builder.addWhereWithCutOffAnd(
				bp1.bp_grp_cd8.like(bind(Srch01_CndR.$prsppl_grp_cd8)));
		builder.addWhereWithCutOffAnd(
				bp1.bp_grp_cd9.like(bind(Srch01_CndR.$prsppl_grp_cd9)));
		builder.addWhereWithCutOffAnd(
				bp1.bp_grp_cd10.like(bind(Srch01_CndR.$prsppl_grp_cd10)));
		if (!isNull(cond.prsppl_grp_nm1())) {
			MAM_BP_GRP_R bg1 = MAM_BP_GRP_R.create("BG1");
			builder.addLeftOuterJoin(bg1, bp1.bp_grp_cd1.eq(bg1.bp_grp_cd)
					.and(bg1.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP1.value()))));
			builder.addWhereWithCutOffAnd(
					bg1.bp_grp_nm.like(bind(Srch01_CndR.$prsppl_grp_nm1)));
		}
		if (!isNull(cond.prsppl_grp_nm2())) {
			MAM_BP_GRP_R bg2 = MAM_BP_GRP_R.create("BG2");
			builder.addLeftOuterJoin(bg2, bp1.bp_grp_cd2.eq(bg2.bp_grp_cd)
					.and(bg2.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP2.value()))));
			builder.addWhereWithCutOffAnd(
					bg2.bp_grp_nm.like(bind(Srch01_CndR.$prsppl_grp_nm2)));
		}
		if (!isNull(cond.prsppl_grp_nm3())) {
			MAM_BP_GRP_R bg3 = MAM_BP_GRP_R.create("BG3");
			builder.addLeftOuterJoin(bg3, bp1.bp_grp_cd3.eq(bg3.bp_grp_cd)
					.and(bg3.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP3.value()))));
			builder.addWhereWithCutOffAnd(
					bg3.bp_grp_nm.like(bind(Srch01_CndR.$prsppl_grp_nm3)));
		}
		if (!isNull(cond.prsppl_grp_nm4())) {
			MAM_BP_GRP_R bg4 = MAM_BP_GRP_R.create("BG4");
			builder.addLeftOuterJoin(bg4, bp1.bp_grp_cd4.eq(bg4.bp_grp_cd)
					.and(bg4.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP4.value()))));
			builder.addWhereWithCutOffAnd(
					bg4.bp_grp_nm.like(bind(Srch01_CndR.$prsppl_grp_nm4)));
		}
		if (!isNull(cond.prsppl_grp_nm5())) {
			MAM_BP_GRP_R bg5 = MAM_BP_GRP_R.create("BG5");
			builder.addLeftOuterJoin(bg5, bp1.bp_grp_cd5.eq(bg5.bp_grp_cd)
					.and(bg5.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP5.value()))));
			builder.addWhereWithCutOffAnd(
					bg5.bp_grp_nm.like(bind(Srch01_CndR.$prsppl_grp_nm5)));
		}
		if (!isNull(cond.prsppl_grp_nm6())) {
			MAM_BP_GRP_R bg6 = MAM_BP_GRP_R.create("BG6");
			builder.addLeftOuterJoin(bg6, bp1.bp_grp_cd6.eq(bg6.bp_grp_cd)
					.and(bg6.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP6.value()))));
			builder.addWhereWithCutOffAnd(
					bg6.bp_grp_nm.like(bind(Srch01_CndR.$prsppl_grp_nm6)));
		}
		if (!isNull(cond.prsppl_grp_nm7())) {
			MAM_BP_GRP_R bg7 = MAM_BP_GRP_R.create("BG7");
			builder.addLeftOuterJoin(bg7, bp1.bp_grp_cd7.eq(bg7.bp_grp_cd)
					.and(bg7.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP7.value()))));
			builder.addWhereWithCutOffAnd(
					bg7.bp_grp_nm.like(bind(Srch01_CndR.$prsppl_grp_nm7)));
		}
		if (!isNull(cond.prsppl_grp_nm8())) {
			MAM_BP_GRP_R bg8 = MAM_BP_GRP_R.create("BG8");
			builder.addLeftOuterJoin(bg8, bp1.bp_grp_cd8.eq(bg8.bp_grp_cd)
					.and(bg8.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP8.value()))));
			builder.addWhereWithCutOffAnd(
					bg8.bp_grp_nm.like(bind(Srch01_CndR.$prsppl_grp_nm8)));
		}
		if (!isNull(cond.prsppl_grp_nm9())) {
			MAM_BP_GRP_R bg9 = MAM_BP_GRP_R.create("BG9");
			builder.addLeftOuterJoin(bg9, bp1.bp_grp_cd9.eq(bg9.bp_grp_cd)
					.and(bg9.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP9.value()))));
			builder.addWhereWithCutOffAnd(
					bg9.bp_grp_nm.like(bind(Srch01_CndR.$prsppl_grp_nm9)));
		}
		if (!isNull(cond.prsppl_grp_nm10())) {
			MAM_BP_GRP_R bg10 = MAM_BP_GRP_R.create("BG10");
			builder.addLeftOuterJoin(bg10, bp1.bp_grp_cd10.eq(bg10.bp_grp_cd)
					.and(bg10.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP10.value()))));
			builder.addWhereWithCutOffAnd(
					bg10.bp_grp_nm.like(bind(Srch01_CndR.$prsppl_grp_nm10)));
		}
		if (isSrchPar()) {
			MAW_ITM_KEY_R w = MAW_ITM_KEY_R.create("W");
			builder.addInnerJoin(w, bracket(MCQueryApiBuilder
					.makeEq(w.itm_cd, t.getColumn$("itm_cd"))
					.and(MCQueryApiBuilder.makeEq(w.itm_sub1, t.getColumn$("itm_sub1")))
					.and(MCQueryApiBuilder.makeEq(w.itm_sub2, t.getColumn$("itm_sub2")))
					.and(MCQueryApiBuilder.makeEq(w.itm_sub3, t.getColumn$("itm_sub3")))));
		}
	}

	protected <R extends MCDBContainer> void dbcCustomizeCommon(MCQueryApiBuilder builder,
			MCList<R> rslt) {

		MCDBContainer t = builder.getBaseDbc();

		MAM_BP_R bp1 = MAM_BP_R.create("BP1");
		MAM_CUR_R cur1 = MAM_CUR_R.create("CUR1");
		MAM_ITM__R itm1 = MAM_ITM__R.create("ITM1");
		MAM_ITM_TYP_D_R itmtypd1 = MAM_ITM_TYP_D_R.create("ITMTYPD1");

		builder.addSelect(itm1.itm_typ);
		builder.addSelect(itm1.itm_typ_d_cd);
		builder.addSelect(itmtypd1.itm_typ_d_nm);
		builder.addSelect(itm1.asset_mng_typ);
		rslt.addBooleanColumn(Srch01_RsltR.$onr_prsppl_flg);
		builder.addSelect(bp1.onr_prsppl_flg);
		builder.addSelect(cur1.upri_dec_place);
		builder.addSelect(decode((MCStringPermColumn) t.getColumn$("prov_typ"),
				value(MAC_PROV_TYP.ONR_PROV.value()),
				MAPA_TAX$F_GET_PROV_TAX_CD((MCStringPermColumn) t.getColumn$("itm_cd"),
						(MCStringPermColumn) t.getColumn$("itm_sub1"),
						(MCStringPermColumn) t.getColumn$("itm_sub2"),
						(MCStringPermColumn) t.getColumn$("itm_sub3"),
						(MCStringPermColumn) t.getColumn$("prsppl_cd"),
						(MCDatePermColumn) t.getColumn$("st_dt")),
				nullValue()).as(Srch01_RsltR.$prov_tax_cd));
		builder.addLeftOuterJoin(itmtypd1, itm1.itm_typ.eq(itmtypd1.itm_typ)
				.and(itm1.itm_typ_d_cd.eq(itmtypd1.itm_typ_d_cd)));
	}

	protected <R extends MCDBContainer> void dbcCustomizeSubAprv(MCQueryApiBuilder builder,
			MCList<R> rslt) {
		dbcCustomizeAprvCommon(builder, rslt);
		
		MAVT_APRV_R aprv1 = MAVT_APRV_R.create("APRV1");
		MAM_USR_R usr1 = MAM_USR_R.create("USR1");
		MAM_DPT_R dpt1 = MAM_DPT_R.create("DPT1");

		builder.addWhereWithCutOffAnd(aprv1.aprv_sts_typ.like(bind(Srch01_CndR.$aprv_sts_typ)));
		builder.addWhereWithCutOffAnd(aprv1.master_dt.gte(bind(Srch01_CndR.$apl_dt_fr)));
		builder.addWhereWithCutOffAnd(aprv1.master_dt.lte(bind(Srch01_CndR.$apl_dt_to)));
		builder.addWhereWithCutOffAnd(aprv1.biz_usr_cd.like(bind(Srch01_CndR.$apl_usr_cd)));
		builder.addWhereWithCutOffAnd(usr1.usr_nm.like(bind(Srch01_CndR.$apl_usr_nm)));
		builder.addWhereWithCutOffAnd(aprv1.src_dpt_cd.like(bind(Srch01_CndR.$apl_dpt_cd)));
		builder.addWhereWithCutOffAnd(dpt1.dpt_nm.like(bind(Srch01_CndR.$apl_dpt_nm)));
	}

	protected <R extends MCDBContainer> void dbcCustomizeAprvCommon(MCQueryApiBuilder builder,
			MCList<R> rslt) {
		
		MCDBContainer t = builder.getBaseDbc();
		
		MAVT_APRV_R aprv1 = MAVT_APRV_R.create("APRV1");
		MAM_USR_R usr1 = MAM_USR_R.create("USR1");
		MAM_DPT_R dpt1 = MAM_DPT_R.create("DPT1");

		builder.addSelect(aprv1.master_dt.as("apl_dt"));
		builder.addSelect(aprv1.biz_usr_cd.as("apl_usr_cd"));
		builder.addSelect(usr1.usr_nm.as("apl_usr_nm"));
		builder.addSelect(aprv1.src_dpt_cd.as("apl_dpt_cd"));
		builder.addSelect(dpt1.dpt_nm.as("apl_dpt_nm"));
		builder.addSelect(aprv1.aprv_sts_typ);
		builder.addLeftOuterJoin(aprv1, MCQueryApiBuilder.makeEq(t.getColumn$("aprv_no"), aprv1.aprv_no)
				.and(aprv1.can_flg.eq(value(false))));
		builder.addLeftOuterJoin(usr1, aprv1.biz_usr_cd.eq(usr1.usr_cd));
		builder.addLeftOuterJoin(dpt1, aprv1.src_dpt_cd.eq(dpt1.dpt_cd)
				.and(aprv1.master_dt.between(dpt1.st_dt, dpt1.end_dt)));
	}

	protected <R extends MCDBContainer> void afterSelectSub(MCList<R> rslt) {
		MAM_TAX_R t = MAM_TAX_R.create("T");
		MCQueryApiBuilder taxL_bldr = MCQueryApiBuilder.create(t);
		taxL_bldr.setSelect(t.tax_nm);
		FXUCL_MCDbcCache<MAM_TAX_R> taxCache = new FXUCL_MCDbcCache<>(taxL_bldr, rslt,
				"prov_tax_cd");
		for (R r : rslt) {
			r.setValueNE("prov_tax_nm",
					taxCache.get(r.getString("prov_tax_cd")).tax_nm());
		}
		if (isSrchPar()) {
			delItmWk();
		}
	}
	/**
	 * 親品目の項目が検索対象か判定
	 */
	protected boolean isSrchPar() {
		if (!isNull(cond) && !isNullAnd(cond.par_base_dt(), cond.par_itm_typ(), cond.par_itm_typ_d_cd(),
				cond.par_itm_typ_d_nm(), cond.par_itm_cd(), cond.par_itm_sub1(),
				cond.par_itm_sub2(), cond.par_itm_sub3(), cond.par_itm_nm(),
				cond.bom_ptn(), cond.par_itm_grp_cd1(), cond.par_itm_grp_cd2(),
				cond.par_itm_grp_cd3(), cond.par_itm_grp_cd4(), cond.par_itm_grp_cd5(),
				cond.par_itm_grp_cd6(), cond.par_itm_grp_cd7(), cond.par_itm_grp_cd8(),
				cond.par_itm_grp_cd9(), cond.par_itm_grp_cd10(), cond.par_itm_grp_nm1(),
				cond.par_itm_grp_nm2(), cond.par_itm_grp_nm3(), cond.par_itm_grp_nm4(),
				cond.par_itm_grp_nm5(), cond.par_itm_grp_nm6(), cond.par_itm_grp_nm7(),
				cond.par_itm_grp_nm8(), cond.par_itm_grp_nm9(), cond.par_itm_grp_nm10())) {
			return true;
		}
		return false;
	}

	/**
	 * 親品目検索
	 */
	protected <R extends MCDBContainer> void dbcCustomizeParitm() {
		MCList<MAW_BOM_EX_R> itmL = MCList.create(MAW_BOM_EX_R.class);
		MCList<MAM_BOM_R> bomL = MCList.create(MAM_BOM_R.class);
		MAM_ITM__R itm1 = MAM_ITM__R.create("ITM1");
		MAM_ITM_TYP_D_R itmtypd1 = MAM_ITM_TYP_D_R.create("ITMTYPD1");
		MAM_BOM_R t = MAM_BOM_R.create("T");
		MCQueryApiBuilder bomL_bldr = MCQueryApiBuilder.create(t);
		
		bomL_bldr.setDistinct();
		bomL_bldr.setSelect(t.par_itm_cd.as("itm_cd"),
				t.par_itm_sub1.as("itm_sub1"),
				t.par_itm_sub2.as("itm_sub2"),
				t.par_itm_sub3.as("itm_sub3"),
				t.bom_ptn,
				t.wg_cd);
		
		bomL_bldr.addLeftOuterJoin(itm1, t.par_itm_cd.eq(itm1.itm_cd)
				.and(t.par_itm_sub1.eq(itm1.itm_sub1))
				.and(t.par_itm_sub2.eq(itm1.itm_sub2))
				.and(t.par_itm_sub3.eq(itm1.itm_sub3)));
		bomL_bldr.addLeftOuterJoin(itmtypd1, itm1.itm_typ.eq(itmtypd1.itm_typ)
				.and(itm1.itm_typ_d_cd.eq(itmtypd1.itm_typ_d_cd)));
		
		bomL_bldr.addWhereWithCutOffAnd(itm1.itm_typ.like(bind(Srch01_CndR.$par_itm_typ)));
		bomL_bldr.addWhereWithCutOffAnd(itm1.itm_typ_d_cd.like(bind(Srch01_CndR.$par_itm_typ_d_cd)));
		bomL_bldr.addWhereWithCutOffAnd(itmtypd1.itm_typ_d_nm.like(bind(Srch01_CndR.$par_itm_typ_d_nm)));
		
		bomL_bldr.addWhereWithCutOffAnd(t.par_itm_cd.eq(bind(Srch01_CndR.$par_itm_cd)));
		bomL_bldr.addWhereWithCutOffAnd(t.par_itm_sub1.eq(bind(Srch01_CndR.$par_itm_sub1)));
		bomL_bldr.addWhereWithCutOffAnd(t.par_itm_sub2.eq(bind(Srch01_CndR.$par_itm_sub2)));
		bomL_bldr.addWhereWithCutOffAnd(t.par_itm_sub3.eq(bind(Srch01_CndR.$par_itm_sub3)));
		bomL_bldr.addWhereWithCutOffAnd(t.bom_ptn.eq(bind(Srch01_CndR.$bom_ptn)));
		bomL_bldr.addWhereWithCutOffAnd(t.wg_cd.eq(bind(Srch01_CndR.$par_wg_cd))
				.or(t.wg_cd.eq(value(MAC_STR.NULL_VAL.value()))));
		
		bomL_bldr.addWhereWithCutOffAnd(bracket(itm1.itm_nm.like(bind(Srch01_CndR.$par_itm_nm))));
		bomL_bldr.addWhereWithCutOffAnd(bracket(itm1.itm_grp_cd1.like(bind(Srch01_CndR.$par_itm_grp_cd1))));
		bomL_bldr.addWhereWithCutOffAnd(bracket(itm1.itm_grp_cd2.like(bind(Srch01_CndR.$par_itm_grp_cd2))));
		bomL_bldr.addWhereWithCutOffAnd(bracket(itm1.itm_grp_cd3.like(bind(Srch01_CndR.$par_itm_grp_cd3))));
		bomL_bldr.addWhereWithCutOffAnd(bracket(itm1.itm_grp_cd4.like(bind(Srch01_CndR.$par_itm_grp_cd4))));
		bomL_bldr.addWhereWithCutOffAnd(bracket(itm1.itm_grp_cd5.like(bind(Srch01_CndR.$par_itm_grp_cd5))));
		bomL_bldr.addWhereWithCutOffAnd(bracket(itm1.itm_grp_cd6.like(bind(Srch01_CndR.$par_itm_grp_cd6))));
		bomL_bldr.addWhereWithCutOffAnd(bracket(itm1.itm_grp_cd7.like(bind(Srch01_CndR.$par_itm_grp_cd7))));
		bomL_bldr.addWhereWithCutOffAnd(bracket(itm1.itm_grp_cd8.like(bind(Srch01_CndR.$par_itm_grp_cd8))));
		bomL_bldr.addWhereWithCutOffAnd(bracket(itm1.itm_grp_cd9.like(bind(Srch01_CndR.$par_itm_grp_cd9))));
		bomL_bldr.addWhereWithCutOffAnd(bracket(itm1.itm_grp_cd10.like(bind(Srch01_CndR.$par_itm_grp_cd10))));
		
		if (!isNull(cond.par_itm_grp_nm1())) {
			MAM_ITM_GRP_R ig1 = MAM_ITM_GRP_R.create("IG1");
			bomL_bldr.addLeftOuterJoin(ig1, bracket(itm1.itm_grp_cd1.eq(ig1.itm_grp_cd)
					.and(ig1.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP1.value())))));
			bomL_bldr.addWhereWithCutOffAnd(bracket(ig1.itm_grp_nm.like(bind(Srch01_CndR.$par_itm_grp_nm1))));
		}
		if (!isNull(cond.par_itm_grp_nm2())) {
			MAM_ITM_GRP_R ig2 = MAM_ITM_GRP_R.create("IG2");
			bomL_bldr.addLeftOuterJoin(ig2, bracket(itm1.itm_grp_cd2.eq(ig2.itm_grp_cd)
					.and(ig2.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP2.value())))));
			bomL_bldr.addWhereWithCutOffAnd(bracket(ig2.itm_grp_nm.like(bind(Srch01_CndR.$par_itm_grp_nm2))));
		}
		if (!isNull(cond.par_itm_grp_nm3())) {
			MAM_ITM_GRP_R ig3 = MAM_ITM_GRP_R.create("IG3");
			bomL_bldr.addLeftOuterJoin(ig3, bracket(itm1.itm_grp_cd3.eq(ig3.itm_grp_cd)
					.and(ig3.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP3.value())))));
			bomL_bldr.addWhereWithCutOffAnd(bracket(ig3.itm_grp_nm.like(bind(Srch01_CndR.$par_itm_grp_nm3))));
		}
		if (!isNull(cond.par_itm_grp_nm4())) {
			MAM_ITM_GRP_R ig4 = MAM_ITM_GRP_R.create("IG4");
			bomL_bldr.addLeftOuterJoin(ig4, bracket(itm1.itm_grp_cd4.eq(ig4.itm_grp_cd)
					.and(ig4.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP4.value())))));
			bomL_bldr.addWhereWithCutOffAnd(bracket(ig4.itm_grp_nm.like(bind(Srch01_CndR.$par_itm_grp_nm4))));
		}
		if (!isNull(cond.par_itm_grp_nm5())) {
			MAM_ITM_GRP_R ig5 = MAM_ITM_GRP_R.create("IG5");
			bomL_bldr.addLeftOuterJoin(ig5, bracket(itm1.itm_grp_cd5.eq(ig5.itm_grp_cd)
					.and(ig5.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP5.value())))));
			bomL_bldr.addWhereWithCutOffAnd(bracket(ig5.itm_grp_nm.like(bind(Srch01_CndR.$par_itm_grp_nm5))));
		}
		if (!isNull(cond.par_itm_grp_nm6())) {
			MAM_ITM_GRP_R ig6 = MAM_ITM_GRP_R.create("IG6");
			bomL_bldr.addLeftOuterJoin(ig6, bracket(itm1.itm_grp_cd6.eq(ig6.itm_grp_cd)
					.and(ig6.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP6.value())))));
			bomL_bldr.addWhereWithCutOffAnd(bracket(ig6.itm_grp_nm.like(bind(Srch01_CndR.$par_itm_grp_nm6))));
		}
		if (!isNull(cond.par_itm_grp_nm7())) {
			MAM_ITM_GRP_R ig7 = MAM_ITM_GRP_R.create("IG7");
			bomL_bldr.addLeftOuterJoin(ig7, bracket(itm1.itm_grp_cd7.eq(ig7.itm_grp_cd)
					.and(ig7.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP7.value())))));
			bomL_bldr.addWhereWithCutOffAnd(bracket(ig7.itm_grp_nm.like(bind(Srch01_CndR.$par_itm_grp_nm7))));
		}
		if (!isNull(cond.par_itm_grp_nm8())) {
			MAM_ITM_GRP_R ig8 = MAM_ITM_GRP_R.create("IG8");
			bomL_bldr.addLeftOuterJoin(ig8, bracket(itm1.itm_grp_cd8.eq(ig8.itm_grp_cd)
					.and(ig8.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP8.value())))));
			bomL_bldr.addWhereWithCutOffAnd(bracket(ig8.itm_grp_nm.like(bind(Srch01_CndR.$par_itm_grp_nm8))));
		}
		if (!isNull(cond.par_itm_grp_nm9())) {
			MAM_ITM_GRP_R ig9 = MAM_ITM_GRP_R.create("IG9");
			bomL_bldr.addLeftOuterJoin(ig9, bracket(itm1.itm_grp_cd9.eq(ig9.itm_grp_cd)
					.and(ig9.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP9.value())))));
			bomL_bldr.addWhereWithCutOffAnd(bracket(ig9.itm_grp_nm.like(bind(Srch01_CndR.$par_itm_grp_nm9))));
		}
		if (!isNull(cond.par_itm_grp_nm10())) {
			MAM_ITM_GRP_R ig10 = MAM_ITM_GRP_R.create("IG10");
			bomL_bldr.addLeftOuterJoin(ig10, bracket(itm1.itm_grp_cd10.eq(ig10.itm_grp_cd)
					.and(ig10.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP10.value())))));
			bomL_bldr.addWhereWithCutOffAnd(bracket(ig10.itm_grp_nm.like(bind(Srch01_CndR.$par_itm_grp_nm10))));
		}
		
		dbSelect("MABSL0130_MAM_BOM_S01", bomL, bomL_bldr, cond);
		
		for (MAM_BOM_R bomR : bomL) {
			if (isNull(cond.par_base_dt())) {
				bomR.addDateColumn("DT", getToday());
			}
			else {
				bomR.addDateColumn("DT", cond.par_base_dt());
			}
			bomR.addBooleanColumn("PH_EX_FLG", true);
			bomR.addBooleanColumn("BOM_PTN_FLG", false);
			bomR.addNumberColumn("MAX_HRRCHY", MCNumber.valueOf(1));
			bomR.addBooleanColumn("MFG_FLG", false);
			bomR.addNumberColumn("BASE_UNIT_QTY", null);
			bomR.addBooleanColumn("ALL_SNO_FLG", true);
			
			String procId = "MAPA_BOM$P_INS_BOM_EX";
			execProc(createSqlId(LOGIC_ID, procId, "01"), procId, bomR, null,
					":ITM_CD, :ITM_SUB1, :ITM_SUB2, :ITM_SUB3, "
							+ ":BOM_PTN, :WG_CD, :DT, "
							+ ":PH_EX_FLG, :BOM_PTN_FLG, :MAX_HRRCHY, "
							+ ":SNO1, :SNO2, :SNO3, :SNO4, "
							+ ":MFG_FLG, :BASE_UNIT_QTY, :ALL_SNO_FLG");
			
			MCList<MAW_BOM_EX_R> bomExL = MCList.create(MAW_BOM_EX_R.class);
			MAW_BOM_EX_R bomEx = MAW_BOM_EX_R.create("BOM_EX");
			MCQueryApiBuilder bomExL_bldr = MCQueryApiBuilder.create(bomEx);
			bomExL_bldr.addWhereWithAnd(bomEx.bom_lvl.neq(value(0)));
			dbSelect("MABSL0130_MAW_BOM_EX_S01", bomExL, bomExL_bldr);
			
			itmL.addAll(bomExL);
		}
		
		String[] keys = new String[] {
				MAW_BOM_EX_R.$itm_cd, MAW_BOM_EX_R.$itm_sub1,
				MAW_BOM_EX_R.$itm_sub2, MAW_BOM_EX_R.$itm_sub3};
		insItmWk(itmL.groupBy(keys));
	}

	/**
	 * 品目マスタの主キーワークテーブル作成
	 */
	protected void insItmWk(MCList<? extends MCRow> bindL) {
		MAW_ITM_KEY_R S0T = MAW_ITM_KEY_R.create("T");
		
		delItmWk();
		
		MCInsert q1 = sql("MABSL0130_MAW_ITM_KEY_I01")
			.insert(S0T)
			.columns(
				S0T.itm_cd,
				S0T.itm_sub1,
				S0T.itm_sub2,
				S0T.itm_sub3
			)
			.values(
				bind("itm_cd"),
				bind("itm_sub1"),
				bind("itm_sub2"),
				bind("itm_sub3")
			);
		q1.executeBatchUpdate(bindL);
	}

	/**
	 * 品目マスタの主キーワークテーブル削除
	 */
	protected void delItmWk() {
		dbWkDelete("MABSL0130_MAW_ITM_KEY_D01", MAM_ITM_R.create());
	}

	// ************************************************************

	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 登録対象の補正を行います。<br>
	 */
	public class Sprt01 extends MABSL_ProvUpriReg_MC_A.Sprt01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			dbcCustomizeCommon(builder, rslt);
		}

		@Override
		protected void insAndDelToKeyUpd(MCQueryApiBuilder builder, MCList<MCDBContainer> d, IdentityHashMap<MCRow, MCMessageList> rowToMsg) {
			super.insAndDelToKeyUpd(builder, d, rowToMsg);
			d.addStringColumn("prov_tax_cd");
			afterSelectSub(d);
		}

	}

	// ************************************************************

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 支給単価マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABSL_ProvUpriReg_MC_A.Upd01 {

		@Override
		protected void call() {
			super.call();
		}

	}

	/**
	 * ProvUpri_UpdChk01オペレーション.<p>
	 *
	 * 支給単価マスタの登録前のチェックを行います。<br>
	 */
	public class ProvUpri_UpdChk01 extends MABSL_ProvUpriReg_MC_A.ProvUpri_UpdChk01 {

		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();
			
			msgLst.addAll(checkWritableWgCdDac(
					up0().subList(r -> !MAC_STR.isNULL_VAL(r.wg_cd())),
					ProvUpri_UpdChk01_DtlR.$wg_cd));
			
			return msgLst;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();

			selectUpriApl(up0());
			
			for (ProvUpri_UpdChk01_DtlR upR : up0()) {
				if (existsUpriApl(upR)) {
					msgList.add(new MCMessage(upR, null, MABSL0024, toDispGUIIndex(upR)));
					continue;
				}

				if (upR.del_flg()) {
					continue ;
				}

				if (upR.getBooleanNE("err_flg")) {
					continue;
				}

				if (MAC_PROV_TYP.isFFR_PROV(upR.prov_typ())) {
					msgList.add(new MCMessage(upR, ProvUpri_UpdChk01_DtlR.$prov_typ, MABSL0166, toDispGUIIndex(upR)));
				}
				else if (!MAC_PROV_TYP.isSS(upR.prov_typ())) {
					if (!upR.onr_prsppl_flg() || MAC_ASSET_MNG_TYP.isNOT_MNG(upR.asset_mng_typ())) {
						msgList.add(new MCMessage(upR, ProvUpri_UpdChk01_DtlR.$prov_typ, MABSL0167, toDispGUIIndex(upR)));
					}
				}
				
				msgList.addAll(checkDecPlace(upR, ProvUpri_UpdChk01_DtlR.$upri_dec_place, ProvUpri_UpdChk01_DtlR.$upri));
				if (!isNull(upR.upri_bf())){
					msgList.addAll(checkDecPlace(upR, ProvUpri_UpdChk01_DtlR.$upri_dec_place, ProvUpri_UpdChk01_DtlR.$upri_bf));
				}
				if (!isNull(upR.sub_upri1())){
					msgList.addAll(checkDecPlace(upR, ProvUpri_UpdChk01_DtlR.$upri_dec_place, ProvUpri_UpdChk01_DtlR.$sub_upri1));
				}
				if (!isNull(upR.sub_upri2())){
					msgList.addAll(checkDecPlace(upR, ProvUpri_UpdChk01_DtlR.$upri_dec_place, ProvUpri_UpdChk01_DtlR.$sub_upri2));
				}
				if (!isNull(upR.sub_upri3())){
					msgList.addAll(checkDecPlace(upR, ProvUpri_UpdChk01_DtlR.$upri_dec_place, ProvUpri_UpdChk01_DtlR.$sub_upri3));
				}
			}

			return msgList;
		}
	}

	/**
	 * ProvUpri_Upd01オペレーション.<p>
	 *
	 * 支給単価マスタの登録を行います。<br>
	 */
	public class ProvUpri_Upd01 extends MABSL_ProvUpriReg_MC_A.ProvUpri_Upd01 {

		@Override
		protected void call() {
			super.call();
		}

	}

	// ************************************************************

	/**
	 * Del01オペレーション.<p>
	 *
	 * 支給単価マスタの削除を行います。<br>
	 */
	public class Del01 extends MABSL_ProvUpriReg_MC_A.Del01 {

		@Override
		protected void call() {
			super.call();
		}

	}

	/**
	 * ProvUpri_DelChk01オペレーション.<p>
	 *
	 * 支給単価マスタの削除前のチェックを行います。<br>
	 */
	public class ProvUpri_DelChk01 extends MABSL_ProvUpriReg_MC_A.ProvUpri_DelChk01 {

		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();
			
			msgLst.addAll(checkWritableWgCdDac(
					up0().subList(r -> !MAC_STR.isNULL_VAL(r.wg_cd())),
					ProvUpri_DelChk01_DtlR.$wg_cd));
			
			return msgLst;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();

			selectUpriApl(up0());

			for (ProvUpri_DelChk01_DtlR upR : up0()) {
				if (existsUpriApl(upR)) {
					msgList.add(new MCMessage(upR, null, MABSL0028, toDispGUIIndex(upR)));
				}
			}
			return msgList;
		}
	}

	/**
	 * ProvUpri_Del01オペレーション.<p>
	 *
	 * 支給単価マスタの削除を行います。<br>
	 */
	public class ProvUpri_Del01 extends MABSL_ProvUpriReg_MC_A.ProvUpri_Del01 {

		@Override
		protected void call() {
			super.call();
		}

	}

	// ************************************************************

	protected ProvUpri_Aprv_UpdChk01_Dtl2R aplR;

	protected Map<List<Comparable<?>>, MAVT_APRV_R> aprvMap;

	protected MCOperation aprvUpdChkOpe;

	protected static ProvUpri_Aprv_UpdChk01_Dtl2R getAplR() {
		return object(CLAZZ)._getAplR();
	}

	protected ProvUpri_Aprv_UpdChk01_Dtl2R _getAplR() {
		if (aplR == null) {
			aplR = ProvUpri_Aprv_UpdChk01_Dtl2R.create();
		}
		return aplR;
	}

	protected static Map<List<Comparable<?>>, MAVT_APRV_R> getAprvMap() {
		return object(CLAZZ)._getAprvMap();
	}

	protected Map<List<Comparable<?>>, MAVT_APRV_R> _getAprvMap() {
		if (aprvMap == null) {
			aprvMap = new HashMap<>();
		}
		return aprvMap;
	}

	protected static void setAprvUpdChkOpe(MCOperation ope) {
		object(CLAZZ)._setAprvUpdChkOpe(ope);
	}

	protected void _setAprvUpdChkOpe(MCOperation ope) {
		aprvUpdChkOpe = ope;
	}

	protected static MCOperation getAprvUpdChkOpe() {
		return object(CLAZZ)._getAprvUpdChkOpe();
	}

	protected MCOperation _getAprvUpdChkOpe() {
		return aprvUpdChkOpe;
	}

	/**
	 * Aprv_Upd01オペレーション.<p>
	 *
	 * 支給単価マスタ（申請）の登録を行います。<br>
	 */
	public class Aprv_Upd01 extends MABSL_ProvUpriReg_MC_A.Aprv_Upd01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void up() {
			if (isApl()) {
				upApl();
			}
			super.up();
		}

		protected boolean isApl() {
			return up1().isStatusModify();
		}

		protected void upApl() {
			editUpApl();
			issueAplNo();
		}

		protected void editUpApl() {
			for (ProvUpri_Aprv_UpdChk01_DtlR up0R : up0()) {
				if (up0R.isStatusModify()) {
					up0R.st_dt_bf(up0R.st_dt_key());
					up0R.setStatus(MCRow.Status.CREATE);
				}
			}
		}

		protected void issueAplNo() {
			ElmArgsR elm = ElmArgsR.create();
			elm.co_cd(getCo().co_cd());
			elm.dt(getToday());
			String aplNo = getNum(MAC_NUM_BIZ_TYP.APRVAPL, elm);
			getAplR().apl_no(aplNo);
			up0().setString(ProvUpri_Aprv_UpdChk01_DtlR.$apl_no, aplNo);
		}

		@Override
		protected void down() {
			crtDown();
			super.down();
		}

		protected void crtDown() {
			MCRow.copyvalue(down0(), getAplR());
		}

	}

	/**
	 * ProvUpri_Aprv_UpdChk01オペレーション.<p>
	 *
	 * 支給単価マスタ（申請）の登録前のチェックを行います。<br>
	 */
	public class ProvUpri_Aprv_UpdChk01 extends MABSL_ProvUpriReg_MC_A.ProvUpri_Aprv_UpdChk01 {

		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();
			
			msgLst.addAll(checkWritableWgCdDac(
					up0().subList(r -> !MAC_STR.isNULL_VAL(r.wg_cd())),
					ProvUpri_UpdChk01_DtlR.$wg_cd));
			
			return msgLst;
		}

		/** チェック対象リスト（削除フラグ＝オフ、エラーフラグ＝オフ）*/
		MCList<ProvUpri_Aprv_UpdChk01_DtlR> _up0;

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			_up0 = up0().subList(r -> !r.del_flg() && !r.getBooleanNE("err_flg"));

			if (isApl()) {
				msgL.addAll(chkApl());
			}
			else {
				msgL.addAll(chkModApl());
			}
			return msgL;
		}

		protected boolean isApl() {
			return up1().isStatusModify();
		}

		protected MCMessageList chkApl() {
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(chkProvTyp());
			msgL.addAll(chkUpri());
			crtAprvChkApl();
			msgL.addAll(callAprvChk());
			return msgL;
		}

		protected MCMessageList chkModApl() {
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(chkProvTyp());
			msgL.addAll(chkUpri());
			msgL.addAll(chkAprvInfo());
			crtAprvChkModApl();
			msgL.addAll(callAprvChk());
			return msgL;
		}

		protected MCMessageList chkProvTyp() {
			MCMessageList msgL = new MCMessageList();
			for (ProvUpri_Aprv_UpdChk01_DtlR up0R : _up0) {
				if (MAC_PROV_TYP.isFFR_PROV(up0R.prov_typ())) {
					msgL.add(new MCMessage(
							up0R, ProvUpri_Aprv_UpdChk01_DtlR.$prov_typ,
							MABSL0166, toDispGUIIndex(up0R)));
				}
				else if (!MAC_PROV_TYP.isSS(up0R.prov_typ())) {
					if (!up0R.onr_prsppl_flg() || MAC_ASSET_MNG_TYP.isNOT_MNG(up0R.asset_mng_typ())) {
						msgL.add(new MCMessage(
								up0R, ProvUpri_Aprv_UpdChk01_DtlR.$prov_typ,
								MABSL0167, toDispGUIIndex(up0R)));
					}
				}
			}
			return msgL;
		}

		protected MCMessageList chkUpri() {
			MCMessageList msgL = new MCMessageList();
			for (ProvUpri_Aprv_UpdChk01_DtlR upR : _up0) {
				msgL.addAll(checkDecPlace(upR, ProvUpri_Aprv_UpdChk01_DtlR.$upri_dec_place, ProvUpri_Aprv_UpdChk01_DtlR.$upri));
				if (!isNull(upR.upri_bf())){
					msgL.addAll(checkDecPlace(upR, ProvUpri_Aprv_UpdChk01_DtlR.$upri_dec_place, ProvUpri_Aprv_UpdChk01_DtlR.$upri_bf));
				}
				if (!isNull(upR.sub_upri1())){
					msgL.addAll(checkDecPlace(upR, ProvUpri_Aprv_UpdChk01_DtlR.$upri_dec_place, ProvUpri_Aprv_UpdChk01_DtlR.$sub_upri1));
				}
				if (!isNull(upR.sub_upri2())){
					msgL.addAll(checkDecPlace(upR, ProvUpri_Aprv_UpdChk01_DtlR.$upri_dec_place, ProvUpri_Aprv_UpdChk01_DtlR.$sub_upri2));
				}
				if (!isNull(upR.sub_upri3())){
					msgL.addAll(checkDecPlace(upR, ProvUpri_Aprv_UpdChk01_DtlR.$upri_dec_place, ProvUpri_Aprv_UpdChk01_DtlR.$sub_upri3));
				}
			}
			return msgL;
		}

		protected <T extends MCRow> void crtAprvChkApl() {
			setAprvUpdChkOpe(createOperation(
					"MB", "MBBAL5010", "Aprv_Chk01", MCOperation.class));
			MCList<T> up0L = (MCList<T>) getAprvUpdChkOpe().up(0);
			T up0R = up0L.createRow();
			up0R.setString("biz_usr_cd", up1().apl_usr_cd());
			up0R.setDate("master_dt", up1().apl_dt());
			up0R.setString("aprv_func_typ",
					MAC_APRV_FUNC_TYP.MST_PROV_UPRI.value());
			up0R.setString("src_dpt_cd", up1().apl_dpt_cd());
			up0R.setString("aprv_src_no1", getAplR().apl_no());
			up0R.setNumber("peg_no", 0);
			up0L.add(up0R);
		}

		protected <S extends MCRow, T extends MCRow> MCMessageList
				callAprvChk() {
			MCMessageList msgL = new MCMessageList();
			if (getAprvUpdChkOpe() == null) {
				return msgL;
			}
			getAprvUpdChkOpe().exec();
			MCList<S> up0L = (MCList<S>) getAprvUpdChkOpe().up(0);
			MCList<T> down0L = (MCList<T>) getAprvUpdChkOpe().down(0);
			for (S up0R : up0L) {
				T down0R = down0L.getFirst(
						"peg_no", up0R.getNumber("peg_no"));
				if (down0R == null) {
					msgL.add(new MCMessage(MABSL0131,
							up0R.getString("aprv_src_no1")));
				}
			}
			return msgL;
		}

		protected MCMessageList chkAprvInfo() {
			MCMessageList msgL = new MCMessageList();
			String aplNoCol = ProvUpri_Aprv_UpdChk01_DtlR.$apl_no;
			String aprvNoCol = ProvUpri_Aprv_UpdChk01_DtlR.$aprv_no;
			MCList<ProvUpri_Aprv_UpdChk01_DtlR> noL =
					_up0.groupBy(aplNoCol, aprvNoCol).subList(
					r -> r.apl_no() != null && r.aprv_no() != null);
			MCIndexKey aplNoidxkey = noL.createIndex(aplNoCol);
			MCIndexKey aprvNoidxkey = noL.createIndex(aprvNoCol);
			for (ProvUpri_Aprv_UpdChk01_DtlR up0R : _up0) {
				String aplNo = up0R.apl_no();
				String aprvNo = up0R.aprv_no();
				MCList<ProvUpri_Aprv_UpdChk01_DtlR> aplNoL =
						noL.subList(aplNoidxkey, aplNo);
				MCList<ProvUpri_Aprv_UpdChk01_DtlR> aprvNoL =
						noL.subList(aprvNoidxkey, aprvNo);
				if (aplNoL.size() > 1) {
					String aprvNos =
							String.join(", ", aplNoL.getString(aprvNoCol));
					msgL.add(new MCMessage(up0R, null, MABSL0132,
							aplNo, aprvNos));
				}
				if (aprvNoL.size() > 1) {
					String aplNos =
							String.join(", ", aprvNoL.getString(aplNoCol));
					msgL.add(new MCMessage(up0R, null, MABSL0132,
							aplNos, aprvNo));
				}
			}
			if (!msgL.isEmpty()) {
				return msgL;
			}
			MCList<MAVT_APRV_R> aprvL = MCList.create(MAVT_APRV_R.class);
			MAVT_APRV_R t = MAVT_APRV_R.create("T");
			MCQueryApiBuilder aprvL_bldr = MCQueryApiBuilder.create(t);
			aprvL_bldr.addWhereWithAnd(t.aprv_no.eq(bind("aprv_no")));
			aprvL_bldr.addWhereWithAnd(t.can_flg.eq(bind("1")), "0");
			dbSelectForUpdateNoWait("MABSL0130_MAVT_APRV_S01", aprvL, aprvL_bldr, noL);
			
			for (MAVT_APRV_R aprvR : aprvL) {
				ProvUpri_Aprv_UpdChk01_DtlR noR =
						noL.getFirst(aprvNoidxkey, aprvR.aprv_no());
				if (noR != null) {
					putInMap(getAprvMap(), aprvR, noR.apl_no());
				}
			}
			List<String> aplL = noL.getString(aplNoCol);
			MCList<ProvUpri_Aprv_UpdChk01_DtlR>[] up0GLArr =
					_up0.groupList(aplNoCol);
			for (MCList<ProvUpri_Aprv_UpdChk01_DtlR> up0GL : up0GLArr) {
				String aplNo = up0GL.get(0).apl_no();
				if (!aplL.contains(aplNo)) {
					continue;
				}
				MAVT_APRV_R aprvR = getFrMap(getAprvMap(), aplNo);
				if (aprvR == null) {
					for (ProvUpri_Aprv_UpdChk01_DtlR up0GR : up0GL) {
						msgL.add(new MCMessage(up0GR, null, MABSL0133,
								aplNo));
					}
					continue;
				}
				if (!aplNo.equals(aprvR.getString("aprv_src_no1"))) {
					for (ProvUpri_Aprv_UpdChk01_DtlR up0GR : up0GL) {
						msgL.add(new MCMessage(up0GR, null, MABSL0134,
								aplNo, aprvR.getString("aprv_no"),
								aprvR.getString("aprv_src_no1")));
					}
				}
			}
			return msgL;
		}

		protected <T extends MCRow> void crtAprvChkModApl() {
			setAprvUpdChkOpe(createOperation(
					"MB", "MBBAL5010", "Aprv_Chk01", MCOperation.class));
			MCList<T> up0L = (MCList<T>) getAprvUpdChkOpe().up(0);
			int pegNo = 0;
			for (Entry<List<Comparable<?>>, MAVT_APRV_R> e :
					getAprvMap().entrySet()) {
				MAVT_APRV_R aprvR = e.getValue();
				if (aprvR == null) {
					continue;
				}
				T up0R = up0L.createRow();
				up0R.setString("aprv_no", aprvR.getString("aprv_no"));
				up0R.setString("biz_usr_cd", aprvR.getString("biz_usr_cd"));
				up0R.setDate("master_dt", aprvR.getDate("master_dt"));
				up0R.setString("aprv_func_typ",
						MAC_APRV_FUNC_TYP.MST_PROV_UPRI.value());
				up0R.setString("src_dpt_cd", aprvR.getString("src_dpt_cd"));
				up0R.setString("aprv_src_no1",
						aprvR.getString("aprv_src_no1"));
				up0R.setNumber("peg_no", pegNo++);
				up0L.add(up0R);
			}
		}

	}

	/**
	 * ProvUpri_Aprv_Upd01オペレーション.<p>
	 *
	 * 支給単価マスタ（申請）の登録を行います。<br>
	 */
	public class ProvUpri_Aprv_Upd01 extends MABSL_ProvUpriReg_MC_A.ProvUpri_Aprv_Upd01 {

		protected MCOperation updOpe;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void
				beforeUpdate(MCList<R> rslt) {
			if (rslt.createRow() instanceof MAM_PROV_UPRI_APL_R) {
				MCList<MAM_PROV_UPRI_APL_R> rsltL = (MCList<MAM_PROV_UPRI_APL_R>) rslt;
				beforeUpdateSub(rsltL);
			}
			super.beforeUpdate(rslt);
		}

		protected void beforeUpdateSub(MCList<MAM_PROV_UPRI_APL_R> rsltL) {
			if (isApl()) {
				beforeUpdateApl(rsltL);
			}
			else {
				beforeUpdateModApl(rsltL);
			}
		}

		protected boolean isApl() {
			return up1().isStatusModify();
		}

		protected void beforeUpdateApl(MCList<MAM_PROV_UPRI_APL_R> rsltL) {
			crtAprvUpd();
			callAprvUpd();
			editRegApl(rsltL);
		}

		protected void beforeUpdateModApl(MCList<MAM_PROV_UPRI_APL_R> rsltL) {
			crtAprvUpd();
			callAprvUpd();
		}

		protected <T extends MCRow> void crtAprvUpd() {
			if (getAprvUpdChkOpe() == null) {
				return;
			}
			updOpe = createOperation(
					"MB", "MBBAL5010", "Aprv_Upd01", MCOperation.class);
			MCList<T> up0L = (MCList<T>) updOpe.up(0);
			up0L.addAll((MCList<T>) getAprvUpdChkOpe().up(0));
		}

		protected <S extends MCRow, T extends MCRow> void callAprvUpd() {
			if (updOpe == null) {
				return;
			}
			updOpe.exec();
			MCList<S> up0L = (MCList<S>) updOpe.up(0);
			MCList<T> down0L = (MCList<T>) updOpe.down(0);
			for (S up0R : up0L) {
				T down0R = down0L.getFirst(
						"peg_no", up0R.getNumber("peg_no"));
				if (down0R == null) {
					getMsgList().add(new MCMessage(MABSL0131,
							up0R.getString("aprv_src_no1")));
					continue;
				}
				if (!down0R.getBoolean("aprv_flg")) {
					getMsgList().add(new MCMessage(MABSL0135,
							up0R.getString("src_dpt_cd")));
				}
			}
		}

		protected <T extends MCRow> void editRegApl(MCList<MAM_PROV_UPRI_APL_R> rsltL) {
			if (rsltL == null || updOpe == null) {
				return;
			}
			MCList<T> down0L = (MCList<T>) updOpe.down(0);
			T down0R = down0L.get(0);
			String aprvNo = down0R.getString("aprv_no");
			getAplR().aprv_no(aprvNo);
			rsltL.setString(
					ProvUpri_Aprv_UpdChk01_DtlR.$apl_no, getAplR().apl_no());
			rsltL.setString(
					ProvUpri_Aprv_UpdChk01_DtlR.$aprv_no, aprvNo);
			rsltL.setString(
					ProvUpri_Aprv_UpdChk01_DtlR.$mst_apl_memo,
					up1().mst_apl_memo());
		}

		@Override
		protected <R extends MCDBContainer> void checkStEndDtValid(MCList<R> rslt) {
			if (rslt.createRow() instanceof MAM_PROV_UPRI_APL_R) {
				MCList<MAM_PROV_UPRI_APL_R> rsltL = (MCList<MAM_PROV_UPRI_APL_R>) rslt;
				checkStEndDtValidSub(rsltL);
			}
			else {
				super.checkStEndDtValid(rslt);
			}
		}

		protected <R extends MCRow> void checkStEndDtValidSub(MCList<MAM_PROV_UPRI_APL_R> dbcL) {
			MCList<MAM_PROV_UPRI_APL_R> tgtL =
					dbcL.subList(MCRow.Status.CREATE, MCRow.Status.MODIFY);
			if (tgtL.isEmpty()) {
				return;
			}

			// 正式単価マスタ期間重複チェック用
			MCList<MAM_PROV_UPRI__R> chkL1 = MCList.create(MAM_PROV_UPRI__R.class);
			MAM_PROV_UPRI__R t1 = MAM_PROV_UPRI__R.create("T");
			MCQueryApiBuilder chkL1_bldr = MCQueryApiBuilder.create(t1);
			String[] baseKey = MCCollectionUtil.remove(
					chkL1.createRow().getKeyColumn(), new String[0], MAM_PROV_UPRI__R.$st_dt);
			chkL1_bldr.setWhere(createWhere(t1, baseKey));
			chkL1_bldr.addWhereWithAnd(
					bracket(t1.st_dt.between(bind("st_dt"), bind("end_dt"))
							.or(bind("st_dt").between(t1.st_dt, t1.end_dt))));

			// 申請単価マスタ期間重複チェック用
			baseKey = MCCollectionUtil.remove(
					dbcL.createRow().getKeyColumn(), new String[0], MAM_PROV_UPRI_APL_R.$st_dt, MAM_PROV_UPRI_APL_R.$apl_no);
			List<String> aprvStsL = new ArrayList<>();
			aprvStsL.add(MAC_APRV_STS_TYP.OPN.value());
			aprvStsL.add(MAC_APRV_STS_TYP.FIX.value());

			for (MAM_PROV_UPRI_APL_R tgtR : tgtL) {
				// 申請単価マスタ（申請）期間重複チェック
				MCList<MAM_PROV_UPRI_APL_R> chkL2 = dbcL.createInstance();
				MAM_PROV_UPRI_APL_R t2 = MAM_PROV_UPRI_APL_R.create("T");
				MCQueryApiBuilder chkL2_bldr = MCQueryApiBuilder.create(t2);
				MAVT_APRV_R aprv1 = MAVT_APRV_R.create("APRV1");
				chkL2_bldr.addSelect(aprv1.aprv_no_seq);
				chkL2_bldr.addWhereWithAnd(createWhere(t2, baseKey));
				chkL2_bldr.addWhereWithAnd(
						bracket(t2.st_dt.between(bind("st_dt"), bind("end_dt"))
								.or(bind("st_dt").between(t2.st_dt, t2.end_dt))));
				chkL2_bldr.addLeftOuterJoin(aprv1, bracket(t2.aprv_no.eq(aprv1.aprv_no)
						.and(aprv1.can_flg.eq(value(false)))));
				chkL2_bldr.addWhereInWithAnd(aprv1.aprv_sts_typ, aprvStsL);
				chkL2_bldr.setLockTable(t2.apl_no);
				dbSelectForUpdate("MABSL0130_MAM_PROV_UPRI_APL_S01", chkL2, chkL2_bldr, tgtR);
				MCIndexKey idxkey = chkL2.createIndex(MAM_PURC_UPRI_APL_R.$st_dt);
				
				lockAprv(chkL2);
				
				int x = chkL2.subList(idxkey, tgtR.st_dt()).size();
				if (x > 1) {
					getMsgList().add(new MCMessage(tgtR, null, MABSL0175, toDispGUIIndex(tgtR)));
				}
				if (chkL2.size() - x > 0) {
					getMsgList().add(new MCMessage(tgtR, null, MABSL0174, toDispGUIIndex(tgtR)));
				}
			}
		}
		protected void lockAprv(MCList<MAM_PROV_UPRI_APL_R> selectL) {
			MCList<MAVT_APRV_R> bindL = MCList.create(MAVT_APRV_R.class);
			for (MAM_PROV_UPRI_APL_R selR : selectL) {
				String aprvNo = selR.getStringNE(MAVT_APRV_R.$aprv_no);
				MCNumber aprvNoSeq = selR.getNumberNE(MAVT_APRV_R.$aprv_no_seq);
				if (!isNull(aprvNo) && !isNull(aprvNoSeq)) {
					MAVT_APRV_R tmp = MAVT_APRV_R.create();
					tmp.aprv_no(aprvNo);
					tmp.aprv_no_seq(aprvNoSeq);
					bindL.add(tmp);
				}
			}
			if (!bindL.isEmpty()) {
				MAVT_APRV_R t = MAVT_APRV_R.create("T");
				MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
				builder.setSelect(t.aprv_no, t.aprv_no_seq);
				builder.setOrderByAsc(t.aprv_no, t.aprv_no_seq);
				dbSelectKeyForUpdateNoFetch("MABSL0130_MAVT_APRV_S02", builder, bindL);
			}
		}
	}

	// ************************************************************

	protected MCOperation aprvDelChkOpe;

	protected static void setAprvDelChkOpe(MCOperation ope) {
		object(CLAZZ)._setAprvDelChkOpe(ope);
	}

	protected void _setAprvDelChkOpe(MCOperation ope) {
		aprvDelChkOpe = ope;
	}

	protected static MCOperation getAprvDelChkOpe() {
		return object(CLAZZ)._getAprvDelChkOpe();
	}

	protected MCOperation _getAprvDelChkOpe() {
		return aprvDelChkOpe;
	}

	/**
	 * Aprv_Del01オペレーション.<p>
	 *
	 * 支給単価マスタ（申請）の削除を行います。<br>
	 */
	public class Aprv_Del01 extends MABSL_ProvUpriReg_MC_A.Aprv_Del01 {

		@Override
		protected void call() {
			super.call();
		}

	}

	/**
	 * ProvUpri_Aprv_DelChk01オペレーション.<p>
	 *
	 * 支給単価マスタ（申請）の削除前のチェックを行います。<br>
	 */
	public class ProvUpri_Aprv_DelChk01 extends MABSL_ProvUpriReg_MC_A.ProvUpri_Aprv_DelChk01 {

		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();
			
			msgLst.addAll(checkWritableWgCdDac(
					up0().subList(r -> !MAC_STR.isNULL_VAL(r.wg_cd())),
					ProvUpri_Aprv_DelChk01_DtlR.$wg_cd));
			
			return msgLst;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			msgL.addAll(chkAprvInfo());
			crtAprvChk();
			msgL.addAll(callAprvUpdChk());
			msgL.addAll(callAprvDelChk());
			return msgL;
		}

		protected MCMessageList chkAprvInfo() {
			MCMessageList msgL = new MCMessageList();
			String aplNoCol = ProvUpri_Aprv_DelChk01_DtlR.$apl_no;
			String aprvNoCol = ProvUpri_Aprv_DelChk01_DtlR.$aprv_no;
			MCList<ProvUpri_Aprv_DelChk01_DtlR> noL =
					up0().groupBy(aplNoCol, aprvNoCol).subList(
					r -> r.apl_no() != null && r.aprv_no() != null);
			MCIndexKey aplNoidxkey = noL.createIndex(aplNoCol);
			MCIndexKey aprvNoidxkey = noL.createIndex(aprvNoCol);
			for (ProvUpri_Aprv_DelChk01_DtlR up0R : up0()) {
				String aplNo = up0R.apl_no();
				String aprvNo = up0R.aprv_no();
				MCList<ProvUpri_Aprv_DelChk01_DtlR> aplNoL =
						noL.subList(aplNoidxkey, aplNo);
				MCList<ProvUpri_Aprv_DelChk01_DtlR> aprvNoL =
						noL.subList(aprvNoidxkey, aprvNo);
				if (aplNoL.size() > 1) {
					String aprvNos =
							String.join(", ", aplNoL.getString(aprvNoCol));
					msgL.add(new MCMessage(up0R, null, MABSL0132,
							aplNo, aprvNos));
				}
				if (aprvNoL.size() > 1) {
					String aplNos =
							String.join(", ", aprvNoL.getString(aplNoCol));
					msgL.add(new MCMessage(up0R, null, MABSL0132,
							aplNos, aprvNo));
				}
			}
			if (!msgL.isEmpty()) {
				return msgL;
			}
			
			MCList<MAVT_APRV_R> aprvL = MCList.create(MAVT_APRV_R.class);
			MAVT_APRV_R t = MAVT_APRV_R.create("T");
			MCQueryApiBuilder aprvL_bldr = MCQueryApiBuilder.create(t);
			aprvL_bldr.addWhereWithAnd(t.aprv_no.eq(bind("aprv_no")));
			aprvL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelectForUpdateNoWait("MABSL0130_MAVT_APRV_S03", aprvL, aprvL_bldr, noL);
			
			for (MAVT_APRV_R aprvR : aprvL) {
				ProvUpri_Aprv_DelChk01_DtlR noR =
						noL.getFirst(aprvNoidxkey, aprvR.getString("aprv_no"));
				if (noR != null) {
					putInMap(getAprvMap(), aprvR, noR.apl_no());
				}
			}
			List<String> aplL = noL.getString(aplNoCol);
			MCList<ProvUpri_Aprv_DelChk01_DtlR>[] up0GLArr =
					up0().groupList(aplNoCol);
			for (MCList<ProvUpri_Aprv_DelChk01_DtlR> up0GL : up0GLArr) {
				String aplNo = up0GL.get(0).apl_no();
				if (!aplL.contains(aplNo)) {
					continue;
				}
				MAVT_APRV_R aprvR = getFrMap(getAprvMap(), aplNo);
				if (aprvR == null) {
					for (ProvUpri_Aprv_DelChk01_DtlR up0GR : up0GL) {
						msgL.add(new MCMessage(up0GR, null, MABSL0133,
								aplNo));
					}
					continue;
				}
				if (!aplNo.equals(aprvR.getString("aprv_src_no1"))) {
					for (ProvUpri_Aprv_DelChk01_DtlR up0GR : up0GL) {
						msgL.add(new MCMessage(up0GR, null, MABSL0134,
								aplNo, aprvR.getString("aprv_no"),
								aprvR.getString("aprv_src_no1")));
					}
				}
			}
			return msgL;
		}

		protected void crtAprvChk() {
			String aplNoCol = ProvUpri_Aprv_DelChk01_DtlR.$apl_no;
			List<String> aplNoL =
					up0().groupBy(aplNoCol).getString(aplNoCol);
			Map<String, Integer> cntMap = getCntMap(aplNoL);
			List<ProvUpri_Aprv_DelChk01_DtlR>[] aplNoGLArr =
					up0().groupList(aplNoCol);
			int pegNo = 0;
			for (List<ProvUpri_Aprv_DelChk01_DtlR> aplNoGL : aplNoGLArr) {
				int orgSize = cntMap.get(aplNoGL.get(0).apl_no());
				int updSize = aplNoGL.size();
				if (orgSize > updSize) {
					crtAprvUpdChk(aplNoGL, pegNo++);
				}
				else {
					crtAprvDelChk(aplNoGL, pegNo++);
				}
			}
		}

		protected <T extends MCRow> void crtAprvUpdChk(
				List<ProvUpri_Aprv_DelChk01_DtlR> aplNoGL, int pegNo) {
			if (aplNoGL == null || aplNoGL.isEmpty()) {
				return;
			}
			MAVT_APRV_R aprvR = getFrMap(getAprvMap(), aplNoGL.get(0).apl_no());
			if (aprvR == null) {
				return;
			}
			if (getAprvUpdChkOpe() == null) {
				setAprvUpdChkOpe(createOperation(
						"MB", "MBBAL5010", "Aprv_Chk01", MCOperation.class));
			}
			MCList<T> up0L = (MCList<T>) getAprvUpdChkOpe().up(0);
			T up0R = up0L.createRow();
			up0R.setString("aprv_no", aprvR.getString("aprv_no"));
			up0R.setString("biz_usr_cd", aprvR.getString("biz_usr_cd"));
			up0R.setDate("master_dt", aprvR.getDate("master_dt"));
			up0R.setString("aprv_func_typ",
					MAC_APRV_FUNC_TYP.MST_PROV_UPRI.value());
			up0R.setString("src_dpt_cd", aprvR.getString("src_dpt_cd"));
			up0R.setString("aprv_src_no1", aprvR.getString("aprv_src_no1"));
			up0R.setNumber("peg_no", pegNo);
			up0L.add(up0R);
		}

		protected <T extends MCRow> void crtAprvDelChk(
				List<ProvUpri_Aprv_DelChk01_DtlR> aplNoGL, int pegNo) {
			if (aplNoGL == null || aplNoGL.isEmpty()) {
				return;
			}
			MAVT_APRV_R aprvR = getFrMap(getAprvMap(), aplNoGL.get(0).apl_no());
			if (aprvR == null) {
				return;
			}
			if (getAprvDelChkOpe() == null) {
				setAprvDelChkOpe(createOperation(
						"MB", "MBBAL5010", "Aprv_Chk04", MCOperation.class));
			}
			MCList<T> up0L = (MCList<T>) getAprvDelChkOpe().up(0);
			T up0R = up0L.createRow();
			up0R.setString("aprv_no", aprvR.getString("aprv_no"));
			up0R.setNumber("peg_no", pegNo);
			// メッセージ用
			up0R.setStringNE("aprv_src_no1", aplNoGL.get(0).apl_no());
			up0L.add(up0R);
		}

		protected <S extends MCRow, T extends MCRow> MCMessageList
				callAprvUpdChk() {
			MCMessageList msgL = new MCMessageList();
			if (getAprvUpdChkOpe() == null) {
				return msgL;
			}
			getAprvUpdChkOpe().exec();
			MCList<S> up0L = (MCList<S>) getAprvUpdChkOpe().up(0);
			MCList<T> down0L = (MCList<T>) getAprvUpdChkOpe().down(0);
			for (S up0R : up0L) {
				T down0R = down0L.getFirst(
						"peg_no", up0R.getNumber("peg_no"));
				if (down0R == null) {
					msgL.add(new MCMessage(MABSL0131,
							up0R.getString("aprv_src_no1")));
				}
			}
			return msgL;
		}

		protected <S extends MCRow, T extends MCRow> MCMessageList
				callAprvDelChk() {
			MCMessageList msgL = new MCMessageList();
			if (getAprvDelChkOpe() == null) {
				return msgL;
			}
			getAprvDelChkOpe().exec();
			MCList<S> up0L = (MCList<S>) getAprvDelChkOpe().up(0);
			MCList<T> down0L = (MCList<T>) getAprvDelChkOpe().down(0);
			for (S up0R : up0L) {
				T down0R = down0L.getFirst(
						"peg_no", up0R.getNumber("peg_no"));
				if (down0R == null) {
					msgL.add(new MCMessage(MABSL0131,
							up0R.getString("aprv_src_no1")));
				}
			}
			return msgL;
		}

	}

	/**
	 * ProvUpri_Aprv_Del01オペレーション.<p>
	 *
	 * 支給単価マスタ（申請）の削除を行います。<br>
	 */
	public class ProvUpri_Aprv_Del01 extends MABSL_ProvUpriReg_MC_A.ProvUpri_Aprv_Del01 {

		protected MCOperation updOpe;

		protected MCOperation delOpe;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void beforeUpdate(MCList<R> rslt) {
			if (rslt.createRow() instanceof MAM_PROV_UPRI_APL_R) {
				MCList<MAM_PROV_UPRI_APL_R> rsltL = (MCList<MAM_PROV_UPRI_APL_R>) rslt;
				beforeUpdateSub(rsltL);
			}
			super.beforeUpdate(rslt);
		}

		protected void beforeUpdateSub(MCList<MAM_PROV_UPRI_APL_R> dbcL) {
			crtAprvUpd();
			crtAprvDel();
			callAprvUpd();
			callAprvDel();
		}

		protected <T extends MCRow> void crtAprvUpd() {
			if (getAprvUpdChkOpe() == null) {
				return;
			}
			updOpe = createOperation(
					"MB", "MBBAL5010", "Aprv_Upd01", MCOperation.class);
			MCList<T> up0L = (MCList<T>) updOpe.up(0);
			up0L.addAll((MCList<T>) getAprvUpdChkOpe().up(0));
		}

		protected <T extends MCRow> void crtAprvDel() {
			if (getAprvDelChkOpe() == null) {
				return;
			}
			delOpe = createOperation(
					"MB", "MBBAL5010", "Aprv_Del01", MCOperation.class);
			MCList<T> up0L = (MCList<T>) delOpe.up(0);
			up0L.addAll((MCList<T>) getAprvDelChkOpe().up(0));
		}

		protected <S extends MCRow, T extends MCRow> void callAprvUpd() {
			if (updOpe == null) {
				return;
			}
			updOpe.exec();
			MCList<S> up0L = (MCList<S>) updOpe.up(0);
			MCList<T> down0L = (MCList<T>) updOpe.down(0);
			for (S up0R : up0L) {
				T down0R = down0L.getFirst(
						"peg_no", up0R.getNumber("peg_no"));
				if (down0R == null) {
					getMsgList().add(new MCMessage(MABSL0131,
							up0R.getString("aprv_src_no1")));
					continue;
				}
				if (!down0R.getBoolean("aprv_flg")) {
					getMsgList().add(new MCMessage(MABSL0135,
							up0R.getString("src_dpt_cd")));
				}
			}
		}

		protected <S extends MCRow, T extends MCRow> void callAprvDel() {
			if (delOpe == null) {
				return;
			}
			delOpe.exec();
		}

	}

	// ************************************************************

	/**
	 * AprvAfter_Upd01オペレーション.<p>
	 *
	 * 支給単価マスタ（申請）の後処理を行います。<br>
	 */
	public class AprvAfter_Upd01 extends MABSL_ProvUpriReg_MC_A.AprvAfter_Upd01 {

		protected MCOperation chkOpe;
		protected MCOperation updOpe;

		@Override
		protected void call() {
			setDelFlgCtl(false);
			try {
				regUpri();
				regApl();
			}
			finally {
				setDelFlgCtl(true);
			}
			crtAprvChk();
			callAprvChk();
			throwUpdErr();
			crtAprvUpd();
			callAprvUpd();
		}
		
		/**	
		 * 論理削除フラグ制御のオン・オフを設定します。<p>	
		 * @param flg 論理削除フラグ制御のオン・オフ<p>	
		 */
		protected void setDelFlgCtl(boolean flg) {
			MCRow r = MCRow.create();
			r.setStringNE("del_flg_ctl", MCBooleanUtil.booleanToDBString(flg));
			String procid = "MAPA_CONTEXT$SET_DEL_FLG_CTL";
			execProc(createSqlId(LOGIC_ID, procid, "01"), procid, r, ":del_flg_ctl");
		}

		protected void regUpri() {
			MCList<AprvAfter_Upd01_DtlR> acptL = up0().subList(
					r -> MAC_APRV_STS_TYP.isACPT(r.aprv_sts_typ()));
			
			MCList<MAM_PROV_UPRI_APL_R> aplL = MCList.create(MAM_PROV_UPRI_APL_R.class);
			MAM_PROV_UPRI_APL_R t = MAM_PROV_UPRI_APL_R.create("T");
			MCQueryApiBuilder aplL_bldr = MCQueryApiBuilder.create(t);
			aplL_bldr.addWhereWithAnd(t.apl_no.eq(bind(MAM_PROV_UPRI_APL_R.$apl_no)));
			for (AprvAfter_Upd01_DtlR acptR : acptL) {
				MAM_PROV_UPRI_APL_R aplR = aplL.createRow();
				aplR.apl_no(acptR.aprv_src_no1());
				aplL.add(aplR);
			}
			dbSelectForUpdateNoWait("MABSL0130_MAM_PROV_UPRI_APL_S02", aplL, aplL_bldr, aplL);
			regUpri(aplL);
		}

		protected void regUpri(MCList<MAM_PROV_UPRI_APL_R> aplL) {
			if (isNull(aplL)) {
				return;
			}
			MCList<MAM_PROV_UPRI_APL_R> updAplL = aplL.subList(r -> r.st_dt_bf() != null);
			MCList<MAM_PROV_UPRI__R> updUpriL = MCList.create(MAM_PROV_UPRI__R.class);
			cpyApl(updUpriL, updAplL);
			updUpri(updUpriL);
			MCList<MAM_PROV_UPRI_APL_R> insAplL = aplL.subList(r -> r.st_dt_bf() == null);
			MCList<MAM_PROV_UPRI__R> insUpriL = MCList.create(MAM_PROV_UPRI__R.class);
			cpyApl(insUpriL, insAplL);
			insUpri(insUpriL);
			MCList<MAM_PROV_UPRI__R> vldUpriL = MCList.create(MAM_PROV_UPRI__R.class);
			vldUpriL.addAll(updUpriL);
			vldUpriL.addAll(insUpriL);
			vldUpri(vldUpriL);
		}

		protected void cpyApl(MCList<MAM_PROV_UPRI__R> upriL,
				MCList<MAM_PROV_UPRI_APL_R> aplL) {
			if (upriL == null || aplL == null) {
				return;
			}
			for (MAM_PROV_UPRI_APL_R aplR : aplL) {
				MAM_PROV_UPRI__R upriR = upriL.createRow();
				upriR.itm_cd(aplR.itm_cd());
				upriR.itm_sub1(aplR.itm_sub1());
				upriR.itm_sub2(aplR.itm_sub2());
				upriR.itm_sub3(aplR.itm_sub3());
				upriR.prsppl_cd(aplR.prsppl_cd());
				upriR.cur_cd(aplR.cur_cd());
				upriR.wg_cd(aplR.wg_cd());
				upriR.st_dt(aplR.st_dt());
				upriR.end_dt(aplR.end_dt());
				upriR.prov_typ(aplR.prov_typ());
				upriR.upri(aplR.upri());
				upriR.upri_bf(aplR.upri_bf());
				upriR.sub_upri1(aplR.sub_upri1());
				upriR.sub_upri2(aplR.sub_upri2());
				upriR.sub_upri3(aplR.sub_upri3());
				upriR.memo1(aplR.memo1());
				upriR.memo2(aplR.memo2());
				upriR.memo3(aplR.memo3());
				upriR.del_flg(aplR.del_flg());
				upriR.del_usr_id(aplR.del_usr_id());
				upriR.del_usr_nm(aplR.del_usr_nm());
				upriR.del_ts(aplR.del_ts());
				upriR.addDateColumn(
						MAM_PROV_UPRI_APL_R.$st_dt_bf, aplR.st_dt_bf());
				upriR.addStringColumn(
						MAM_PROV_UPRI_APL_R.$aprv_no, aplR.aprv_no());
				upriL.add(upriR);
			}
		}

		protected void updUpri(MCList<MAM_PROV_UPRI__R> upriL) {
			if (upriL == null) {
				return;
			}
			lockUpri(upriL);
			MCQueryApiBuilder upriL_bldr = MCQueryApiBuilder.create(MAM_PROV_UPRI__R.create("T"));
			String[] oldKeyCols = upriL_bldr.getBaseDbc().getKeyColumn();
			for (int i = 0; i < oldKeyCols.length; i++) {
				if (MAM_PROV_UPRI__R.$st_dt.equals(oldKeyCols[i])) {
					oldKeyCols[i] = MAM_PROV_UPRI_APL_R.$st_dt_bf;
				}
			}
			dbUpdateKeyAt("MABSL0130_MAM_PROV_UPRI__U01", upriL, upriL_bldr, oldKeyCols);
		}

		protected void lockUpri(MCList<MAM_PROV_UPRI__R> upriL) {
			if (upriL == null) {
				return;
			}
			MCList<MAM_PROV_UPRI__R> lockL = upriL.clone();
			
			for (MAM_PROV_UPRI__R lockR : lockL) {
				MCDate stDtKey =
						lockR.getDate(MAM_PROV_UPRI_APL_R.$st_dt_bf);
				lockR.st_dt(stDtKey);
			}
			MCQueryApiBuilder lockL_bldr = MCQueryApiBuilder.create(MAM_PROV_UPRI__R.create("T"));
			int i = dbSelectKeyForUpdateNoWait("MABSL0130_MAM_PROV_UPRI__S01", lockL, lockL_bldr, lockL);
			if (!isSame(i, upriL.size())) {
				MCAppException ex =
						new MCAppException(new MCMessage(MABSL0012, upriL.get(0).getString(MAM_PROV_UPRI_APL_R.$aprv_no)));
				throw ex;
			}
		}

		protected void insUpri(MCList<MAM_PROV_UPRI__R> upriL) {
			if (upriL == null) {
				return;
			}
			MCQueryApiBuilder upriL_bldr = MCQueryApiBuilder.create(MAM_PROV_UPRI__R.create("T"));
			dbInsertEx("MABSL0130_MAM_PROV_UPRI__I01", upriL, upriL_bldr);
		}

		protected void vldUpri(MCList<MAM_PROV_UPRI__R> upriL) {
			if (isNull(upriL)) {
				return;
			}
			MCMessageList msgL = new MCMessageList();
			MAM_PROV_UPRI__R protoR = MAM_PROV_UPRI__R.create();
			String[] baseKey = MAUCL_StEndUtil.getBaseKey(protoR);
			// 対象の無い更新申請を除いてチェックする。
			MCList<MAM_PROV_UPRI__R> chkL = upriL.createInstance();
			MAM_PROV_UPRI__R t = MAM_PROV_UPRI__R.create("T");
			MCQueryApiBuilder chkL_bldr = MCQueryApiBuilder.create(t);
			dbSelectKey("MABSL0130_MAM_PROV_UPRI__S02", chkL, chkL_bldr, upriL);
			for (MAM_PROV_UPRI__R chkR : chkL) {
				MAUCL_StEndUtil.checkStEndDtValid(chkR, baseKey, msgL);
			}
			if (!msgL.isEmpty()) {
				MCAppException ex =
						new MCAppException(FXBAL_MCRLUtil.getHeaderMsgId());
				ex.setCauseMessageList(msgL);
				throw ex;
			}
		}

		protected void regApl() {
			MCList<AprvAfter_Upd01_DtlR> acptL = up0().subList(
					r -> MAC_APRV_STS_TYP.isACPT(r.aprv_sts_typ()));
			lockApl(acptL);
			updApl(acptL);
		}

		protected void lockApl(MCList<AprvAfter_Upd01_DtlR> dtlL) {
			if (dtlL == null) {
				return;
			}
			MCList<MAM_PROV_UPRI_APL_R> lockL = MCList.create(MAM_PROV_UPRI_APL_R.class);
			MAM_PROV_UPRI_APL_R t = MAM_PROV_UPRI_APL_R.create("T");
			MCQueryApiBuilder lockL_bldr = MCQueryApiBuilder.create(t);
			lockL_bldr.addWhereWithAnd(t.apl_no.eq(bind(MAM_PROV_UPRI_APL_R.$apl_no)));
			dbSelectForUpdateNoWait("MABSL0130_MAM_PROV_UPRI_APL_S03", lockL, lockL_bldr, dtlL);
		}

		protected void updApl(MCList<AprvAfter_Upd01_DtlR> dtlL) {
			if (dtlL == null) {
				return;
			}
			MCList<MAM_PROV_UPRI_APL_R> aplL = MCList.create(MAM_PROV_UPRI_APL_R.class);
			for (AprvAfter_Upd01_DtlR dtlR : dtlL) {
				MAM_PROV_UPRI_APL_R aplR = MAM_PROV_UPRI_APL_R.create();
				aplR.apl_no(dtlR.aprv_src_no1());
				aplR.ref_flg(true);
				aplL.add(aplR);
			}
			MAM_PROV_UPRI_APL_R t = MAM_PROV_UPRI_APL_R.create("T");
			execDbUpdate("MABSL0130_MAM_PROV_UPRI_APL_U01", t, aplL,
					t.apl_no.eq(bindEx(MAM_PROV_UPRI_APL_R.$apl_no)), t.ref_flg);
		}

		protected <T extends MCRow> void crtAprvChk() {
			chkOpe = createOperation(
					"MB", "MBBAL5010", "Aprv_Chk02", MCOperation.class);
			MCList<T> aprvUp0L = (MCList<T>) chkOpe.up(0);
			setPegNo(up0());
			for (AprvAfter_Upd01_DtlR up0R : up0().subList(r -> MAC_APRV_STS_TYP.isACPT(r.aprv_sts_typ()))) {
				T aprvUp0R = aprvUp0L.createRow();
				aprvUp0R.setString("aprv_no", up0R.aprv_no());
				aprvUp0R.setNumber("peg_no", up0R.peg_no());
				aprvUp0L.add(aprvUp0R);
			}
		}
		protected void callAprvChk() {
			if (chkOpe == null) {
				return;
			}
			chkOpe.exec();
		}

		protected void crtAprvUpd() {
			for (AprvAfter_Upd01_DtlR up0R : up0()) {
				String sts = up0R.aprv_sts_typ();
				if (MAC_APRV_STS_TYP.isACPT(sts)) {
					crtAprvUpd(up0R);
				}
			}
		}

		protected <T extends MCRow> void crtAprvUpd(
				AprvAfter_Upd01_DtlR up0R) {
			if (updOpe == null) {
				updOpe = createOperation(
						"MB", "MBBAL5010", "Aprv_Upd02", MCOperation.class);
			}
			MCList<T> aprvUp0L = (MCList<T>) updOpe.up(0);
			T aprvUp0R = aprvUp0L.createRow();
			aprvUp0R.setString("aprv_no", up0R.aprv_no());
			aprvUp0L.add(aprvUp0R);
		}

		protected void callAprvUpd() {
			if (updOpe == null) {
				return;
			}
			updOpe.exec();
		}

	}

	// ************************************************************

	protected <V> void putInMap(Map<List<Comparable<?>>, MAVT_APRV_R> map,
			MAVT_APRV_R aprvR, String string) {
		if (map == null || string == null) {
			return;
		}
		map.put(Arrays.asList(string), aprvR);
	}

	protected <V> V getFrMap(Map<List<Comparable<?>>, V> map,
			Comparable<?>... keys) {
		if (map == null || keys == null) {
			return null;
		}
		return map.get(Arrays.asList(keys));
	}

	protected Map<String, Integer> getCntMap(List<String> aplNoL) {
		Map<String, Integer> ret = new HashMap<>();
		if (aplNoL == null || aplNoL.isEmpty()) {
			return ret;
		}
		
		MCList<MAM_PROV_UPRI_APL_R> aplL = MCList.create(MAM_PROV_UPRI_APL_R.class);
		MAM_PROV_UPRI_APL_R t = MAM_PROV_UPRI_APL_R.create("T");
		MCQueryApiBuilder aplL_bldr = MCQueryApiBuilder.create(t);
		aplL_bldr.addWhereWithAnd(t.apl_no.eq(bind(MAM_PROV_UPRI_APL_R.$apl_no)));
		
		for (String aplNo : aplNoL) {
			if (aplNo == null) {
				continue;
			}
			MAM_PROV_UPRI_APL_R aplR = aplL.createRow();
			aplR.apl_no(aplNo);
			aplL.add(aplR);
		}
		dbSelectForUpdateNoWait("MABSL0130_MAM_PROV_UPRI_APL_S04", aplL, aplL_bldr, aplL);
		MCList<MAM_PROV_UPRI_APL_R>[] aplGLArr = aplL.groupList(MAM_PROV_UPRI_APL_R.$apl_no);
		for (MCList<MAM_PROV_UPRI_APL_R> aplGL : aplGLArr) {
			ret.put(aplGL.get(0).apl_no(), aplGL.size());
		}
		for (String aplNo : aplNoL) {
			if (ret.get(aplNo) == null) {
				ret.put(aplNo, 0);
			}
		}
		return ret;
	}


	// ************************************************************

	MCList<MAM_PROV_UPRI_APL_R> _upriAplL;
	MCIndexKey _upriAplIdxKey;

	/**
	 * キー項目の配列を返します。
	 * <p>
	 * 1.引数なしの場合：単価マスタ（申請）の適用開始日、申請ＮＯを除いたキー項目の配列<br>
	 * 2.引数ありの場合：1の結果に引数の項目を追加した配列
	 */
	protected String[] getUpriAplKey(String... strArr) {
		String[] baseKey = MCCollectionUtil.remove(MAM_PROV_UPRI_APL_R.create().getKeyColumn(), new String[0],
				MAM_PROV_UPRI_APL_R.$st_dt, MAM_PROV_UPRI_APL_R.$apl_no);
		baseKey = MCCollectionUtil.concat(baseKey, strArr);
		return baseKey;
	}

	/**
	 * 申請データを検索します。
	 * <p>
	 */
	protected <R extends MCRow> void selectUpriApl(MCList<R> up0) {
		_upriAplL = MCList.create(MAM_PROV_UPRI_APL_R.class);

		String[] baseKey = getUpriAplKey();
		List<String> aprvStsL = new ArrayList<>();
		aprvStsL.add(MAC_APRV_STS_TYP.OPN.value());
		aprvStsL.add(MAC_APRV_STS_TYP.FIX.value());

		MAVT_APRV_R aprv1 = MAVT_APRV_R.create("APRV1");
		MAM_PROV_UPRI_APL_R t = MAM_PROV_UPRI_APL_R.create("T");
		MCQueryApiBuilder upriAplL_bldr = MCQueryApiBuilder.create(t);

		upriAplL_bldr.addWhereWithAnd(createWhere(t, baseKey));
		upriAplL_bldr.addWhereWithAnd(t.st_dt_bf.eq(bind("st_dt_key")));
		upriAplL_bldr.addInnerJoin(aprv1,
				bracket(t.aprv_no.eq(aprv1.aprv_no)
						.and(aprv1.can_flg.eq(value(false)))));
		upriAplL_bldr.addWhereInWithAnd(aprv1.aprv_sts_typ, aprvStsL);
		for (R r : up0) {
			if (r.isStatusDelete() && !r.contains(ProvUpri_UpdChk01_DtlR.$st_dt_key)) {
				r.setDateNE(ProvUpri_UpdChk01_DtlR.$st_dt_key,
						r.getDate(ProvUpri_UpdChk01_DtlR.$st_dt));
			}
		}
		dbSelect("MABSL0130_MAM_PROV_UPRI_APL_S05", _upriAplL, upriAplL_bldr,
				up0.subList(MCRow.MODIFY, MCRow.DELETE));
		baseKey = getUpriAplKey(MAM_PROV_UPRI_APL_R.$st_dt_bf);
		_upriAplIdxKey = _upriAplL.createIndex(baseKey);
	}

	/**
	 * 申請データが存在するときtrueを返します。
	 * <p>
	 */
	protected <R extends MCRow> boolean existsUpriApl(R r) {
		if (!r.isStatusModify() && !r.isStatusDelete()) {
			return false;
		}
		String[] baseKey = getUpriAplKey(ProvUpri_UpdChk01_DtlR.$st_dt_key);
		List<Comparable<?>> bind = new ArrayList<Comparable<?>>();
		for (String col : baseKey) {
			bind.add(r.getValue(col));
		}
		return _upriAplL.getFirst(_upriAplIdxKey, bind.toArray(new Comparable[0])) != null;
	}

	//FMCB CUSTOM END
}