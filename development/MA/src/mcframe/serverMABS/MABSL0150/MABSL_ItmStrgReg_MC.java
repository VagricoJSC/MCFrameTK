package mcframe.serverMABS.MABSL0150;

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
import mcframe.serverMABS.MABSL0150.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABSL_ItmStrgReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABSL_ItmStrgReg_MC extends MABSL_ItmStrgReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * ItmStrg_UpdChk01オペレーション.<p>
	 *
	 * 標準単価マスタの登録前のチェックを行います。<br>
	 */
	public class ItmStrg_UpdChk01 extends MABSL_ItmStrgReg_MC_A.ItmStrg_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();
			
			msgLst.addAll(checkWritableLocCdDac(
					up0().subList(r -> !MAC_STR.isNULL_VAL(r.loc_cd())),
					ItmStrg_UpdChk01_DtlR.$loc_cd));
			
			return msgLst;
		}
	}
	/**
	 * ItmStrg_Upd01オペレーション.<p>
	 *
	 * 標準単価マスタの登録を行います。<br>
	 */
	public class ItmStrg_Upd01 extends MABSL_ItmStrgReg_MC_A.ItmStrg_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ItmStrg_DelChk01オペレーション.<p>
	 *
	 * 標準単価マスタの削除前のチェックを行います。<br>
	 */
	public class ItmStrg_DelChk01 extends MABSL_ItmStrgReg_MC_A.ItmStrg_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();
			
			msgLst.addAll(checkWritableLocCdDac(
					up0().subList(r -> !MAC_STR.isNULL_VAL(r.loc_cd())),
					ItmStrg_DelChk01_DtlR.$loc_cd));
			
			return msgLst;
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 標準単価マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABSL_ItmStrgReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 標準単価マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABSL_ItmStrgReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_ITM_STRG_R) {
				dbcCustomizeSub(builder);
			}
		}
		
		/**
		 * 品目分類と結合するためのSQL編集
		 * 
		 * @param dbc
		 */
		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {

			MAM_WG_R wg1 = MAM_WG_R.create("WG1");
			MAM_LOC_GRP_R locgrp1 = MAM_LOC_GRP_R.create("LOCGRP1");
			MAM_LOC_R loc1 = MAM_LOC_R.create(MAM_ITM_STRG_R.$LOC1);

			builder.addSelect(loc1.wg_cd);
			builder.addSelect(wg1.wg_nm);
			builder.addSelect(loc1.loc_grp_cd);
			builder.addSelect(locgrp1.loc_grp_nm);

			/* DAC対応 */
			MAM_ITM_STRG_R t = MAM_ITM_STRG_R.create(builder.getBaseDbcAlias());
			MAVM_RD_LOC_R S1RD_LOC1 = MAVM_RD_LOC_R.create("RD_LOC1");
			builder.addWhereWithAnd(exists(subQuery().select(S1RD_LOC1.prAll())
					.from(S1RD_LOC1).where(t.loc_cd.eq(S1RD_LOC1.loc_cd))));

			// ＷＧ、工場・物流倉庫、格納先製造場所Ｇ
			MAM_SITE_R site1 = MAM_SITE_R.create("SITE1");
			builder.addWhereWithCutOffAnd(loc1.wg_cd.like(bind(Srch01_CndR.$wg_cd)));
			builder.addLeftOuterJoin(wg1, loc1.wg_cd.eq(wg1.wg_cd));
			builder.addWhereWithCutOffAnd(wg1.wg_nm.like(bind(Srch01_CndR.$wg_nm)));
			builder.addWhereWithCutOffAnd(loc1.site_cd.like(bind(Srch01_CndR.$site_cd)));
			if (!isNull(up0().site_nm())) {
				builder.addLeftOuterJoin(site1, loc1.site_cd.eq(site1.site_cd));
				builder.addWhereWithCutOffAnd(
						site1.site_nm.like(bind(Srch01_CndR.$site_nm)));
			}
			builder.addWhereWithCutOffAnd(
					loc1.loc_grp_cd.like(bind(Srch01_CndR.$loc_grp_cd)));
			builder.addLeftOuterJoin(locgrp1, loc1.loc_grp_cd.eq(locgrp1.loc_grp_cd));
			builder.addWhereWithCutOffAnd(
					locgrp1.loc_grp_nm.like(bind(Srch01_CndR.$loc_grp_nm)));

			MAM_ITM__R itm1 = MAM_ITM__R.create(MAM_ITM_STRG_R.$ITM1);
			// 品目区分、品目区分詳細
			MAM_ITM_TYP_D_R itmtypd1 = MAM_ITM_TYP_D_R.create("ITMTYPD1");
			builder.addSelect(itm1.itm_typ);
			builder.addSelect(itm1.itm_typ_d_cd);
			builder.addSelect(itmtypd1.itm_typ_d_nm);
			builder.addWhereWithCutOffAnd(itm1.itm_typ.like(bind(Srch01_CndR.$itm_typ)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_typ_d_cd.like(bind(Srch01_CndR.$itm_typ_d_cd)));
			builder.addLeftOuterJoin(itmtypd1, itm1.itm_typ.eq(itmtypd1.itm_typ)
					.and(itm1.itm_typ_d_cd.eq(itmtypd1.itm_typ_d_cd)));
			builder.addWhereWithCutOffAnd(
					itmtypd1.itm_typ_d_nm.like(bind(Srch01_CndR.$itm_typ_d_nm)));

			// 品目分類
			if (!isNull(up0().itm_grp_nm1())) {
				MAM_ITM_GRP_R ig1 = MAM_ITM_GRP_R.create("IG1");
				builder.addLeftOuterJoin(ig1, itm1.itm_grp_cd1.eq(ig1.itm_grp_cd)
						.and(ig1.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP1.value()))));
				builder.addWhereWithCutOffAnd(
						ig1.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm1)));
			}
			if (!isNull(up0().itm_grp_nm2())) {
				MAM_ITM_GRP_R ig2 = MAM_ITM_GRP_R.create("IG2");
				builder.addLeftOuterJoin(ig2, itm1.itm_grp_cd2.eq(ig2.itm_grp_cd)
						.and(ig2.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP2.value()))));
				builder.addWhereWithCutOffAnd(
						ig2.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm2)));
			}
			if (!isNull(up0().itm_grp_nm3())) {
				MAM_ITM_GRP_R ig3 = MAM_ITM_GRP_R.create("IG3");
				builder.addLeftOuterJoin(ig3, itm1.itm_grp_cd3.eq(ig3.itm_grp_cd)
						.and(ig3.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP3.value()))));
				builder.addWhereWithCutOffAnd(
						ig3.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm3)));
			}
			if (!isNull(up0().itm_grp_nm4())) {
				MAM_ITM_GRP_R ig4 = MAM_ITM_GRP_R.create("IG4");
				builder.addLeftOuterJoin(ig4, itm1.itm_grp_cd4.eq(ig4.itm_grp_cd)
						.and(ig4.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP4.value()))));
				builder.addWhereWithCutOffAnd(
						ig4.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm4)));
			}
			if (!isNull(up0().itm_grp_nm5())) {
				MAM_ITM_GRP_R ig5 = MAM_ITM_GRP_R.create("IG5");
				builder.addLeftOuterJoin(ig5, itm1.itm_grp_cd5.eq(ig5.itm_grp_cd)
						.and(ig5.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP5.value()))));
				builder.addWhereWithCutOffAnd(
						ig5.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm5)));
			}
			if (!isNull(up0().itm_grp_nm6())) {
				MAM_ITM_GRP_R ig6 = MAM_ITM_GRP_R.create("IG6");
				builder.addLeftOuterJoin(ig6, itm1.itm_grp_cd6.eq(ig6.itm_grp_cd)
						.and(ig6.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP6.value()))));
				builder.addWhereWithCutOffAnd(
						ig6.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm6)));
			}
			if (!isNull(up0().itm_grp_nm7())) {
				MAM_ITM_GRP_R ig7 = MAM_ITM_GRP_R.create("IG7");
				builder.addLeftOuterJoin(ig7, itm1.itm_grp_cd7.eq(ig7.itm_grp_cd)
						.and(ig7.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP7.value()))));
				builder.addWhereWithCutOffAnd(
						ig7.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm7)));
			}
			if (!isNull(up0().itm_grp_nm8())) {
				MAM_ITM_GRP_R ig8 = MAM_ITM_GRP_R.create("IG8");
				builder.addLeftOuterJoin(ig8, itm1.itm_grp_cd8.eq(ig8.itm_grp_cd)
						.and(ig8.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP8.value()))));
				builder.addWhereWithCutOffAnd(
						ig8.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm8)));
			}
			if (!isNull(up0().itm_grp_nm9())) {
				MAM_ITM_GRP_R ig9 = MAM_ITM_GRP_R.create("IG9");
				builder.addLeftOuterJoin(ig9, itm1.itm_grp_cd9.eq(ig9.itm_grp_cd)
						.and(ig9.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP9.value()))));
				builder.addWhereWithCutOffAnd(
						ig9.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm9)));
			}
			if (!isNull(up0().itm_grp_nm10())) {
				MAM_ITM_GRP_R ig10 = MAM_ITM_GRP_R.create("IG10");
				builder.addLeftOuterJoin(ig10, itm1.itm_grp_cd10.eq(ig10.itm_grp_cd)
						.and(ig10.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP10.value()))));
				builder.addWhereWithCutOffAnd(
						ig10.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm10)));
			}

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
		}
		/*
		@Override
		protected void down_SELECT_c0_0(Srch01_RsltR r_dest, MAM_ITM_STRG__R r_src) {
			super.down_SELECT_c0_0(r_dest, r_src);
			
			r_dest.wg_cd(r_src.getStringNE("wg_cd"));
			r_dest.wg_nm(r_src.getStringNE("wg_nm"));
			r_dest.loc_grp_cd(r_src.getStringNE("loc_grp_cd"));
			r_dest.loc_grp_nm(r_src.getStringNE("loc_grp_nm"));
			r_dest.itm_typ(r_src.getStringNE("itm_typ"));
			r_dest.itm_typ_d_cd(r_src.getStringNE("itm_typ_d_cd"));
			r_dest.itm_typ_d_nm(r_src.getStringNE("itm_typ_d_nm"));
		}*/
	}
	/**
	 * ItmStrg_Del01オペレーション.<p>
	 *
	 * 品目格納先マスタの削除を行います。<br>
	 */
	public class ItmStrg_Del01 extends MABSL_ItmStrgReg_MC_A.ItmStrg_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 品目格納先マスタの削除を行います。<br>
	 */
	public class Del01 extends MABSL_ItmStrgReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}