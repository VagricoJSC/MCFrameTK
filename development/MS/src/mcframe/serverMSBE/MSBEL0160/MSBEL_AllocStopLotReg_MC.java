package mcframe.serverMSBE.MSBEL0160;

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
import mcframe.serverMSBE.MSBEL0160.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_AllocStopLotReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_AllocStopLotReg_MC extends MSBEL_AllocStopLotReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 引当禁止ロット情報を検索する<br>
	 */
	public class Srch01 extends MSBEL_AllocStopLotReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MST_ALLOC_STOP_LOT_R) {
				dbcCustomizeSub(builder);
			}
		}
		
		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {

			MST_ALLOC_STOP_LOT_R t = MST_ALLOC_STOP_LOT_R.create(builder.getBaseDbcAlias());
			MAM_ITM__R itm1 = MAM_ITM__R.create(MST_ALLOC_STOP_LOT_R.$ITM1);

			MAM_USR_R m2 = MAM_USR_R.create("M2");
			MAM_USR_R m3 = MAM_USR_R.create("M3");
			MAM_ITM_TYP_D_R m4 = MAM_ITM_TYP_D_R.create("M4");
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

			builder.addLeftOuterJoin(m2, m2.usr_cd.eq(t.stop_usr_cd));
			builder.addLeftOuterJoin(m3, m3.usr_cd.eq(t.rel_usr_cd));
			builder.addLeftOuterJoin(m4, m4.itm_typ.eq(itm1.itm_typ)
					.and(m4.itm_typ_d_cd.eq(itm1.itm_typ_d_cd)));

			builder.addSelect(itm1.itm_nm.as("itm_nm"));
			builder.addSelect(m2.usr_nm.as("stop_usr_nm"));
			builder.addSelect(m3.usr_nm.as("rel_usr_nm"));

			builder.addWhereWithCutOffAnd(t.stop_dt.gte(bind("stop_dt_fr")));
			builder.addWhereWithCutOffAnd(t.stop_dt.lte(bind("stop_dt_to")));
			builder.addWhereWithCutOffAnd(t.rel_dt.gte(bind("rel_dt_fr")));
			builder.addWhereWithCutOffAnd(t.rel_dt.lte(bind("rel_dt_to")));
			builder.addWhereWithCutOffAnd(itm1.itm_typ.like(bind(Srch01_CndR.$itm_typ)));
			builder.addWhereWithCutOffAnd(
					itm1.itm_typ_d_cd.like(bind(Srch01_CndR.$itm_typ_d_cd)));
			builder.addWhereWithCutOffAnd(
					m4.itm_typ_d_nm.like(bind(Srch01_CndR.$itm_typ_d_nm)));

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

			if (!isNull(up0().itm_grp_nm1())) {
				builder.addLeftOuterJoin(ig1, itm1.itm_grp_cd1.eq(ig1.itm_grp_cd)
						.and(ig1.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP1.value()))));
				builder.addWhereWithCutOffAnd(
						ig1.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm1)));
			}
			if (!isNull(up0().itm_grp_nm2())) {
				builder.addLeftOuterJoin(ig2, itm1.itm_grp_cd2.eq(ig2.itm_grp_cd)
						.and(ig2.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP2.value()))));
				builder.addWhereWithCutOffAnd(
						ig2.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm2)));
			}
			if (!isNull(up0().itm_grp_nm3())) {
				builder.addLeftOuterJoin(ig3, itm1.itm_grp_cd3.eq(ig3.itm_grp_cd)
						.and(ig3.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP3.value()))));
				builder.addWhereWithCutOffAnd(
						ig3.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm3)));
			}
			if (!isNull(up0().itm_grp_nm4())) {
				builder.addLeftOuterJoin(ig4, itm1.itm_grp_cd4.eq(ig4.itm_grp_cd)
						.and(ig4.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP4.value()))));
				builder.addWhereWithCutOffAnd(
						ig4.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm4)));
			}
			if (!isNull(up0().itm_grp_nm5())) {
				builder.addLeftOuterJoin(ig5, itm1.itm_grp_cd5.eq(ig5.itm_grp_cd)
						.and(ig5.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP5.value()))));
				builder.addWhereWithCutOffAnd(
						ig5.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm5)));
			}
			if (!isNull(up0().itm_grp_nm6())) {
				builder.addLeftOuterJoin(ig6, itm1.itm_grp_cd6.eq(ig6.itm_grp_cd)
						.and(ig6.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP6.value()))));
				builder.addWhereWithCutOffAnd(
						ig6.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm6)));
			}
			if (!isNull(up0().itm_grp_nm7())) {
				builder.addLeftOuterJoin(ig7, itm1.itm_grp_cd7.eq(ig7.itm_grp_cd)
						.and(ig7.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP7.value()))));
				builder.addWhereWithCutOffAnd(
						ig7.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm7)));
			}
			if (!isNull(up0().itm_grp_nm8())) {
				builder.addLeftOuterJoin(ig8, itm1.itm_grp_cd8.eq(ig8.itm_grp_cd)
						.and(ig8.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP8.value()))));
				builder.addWhereWithCutOffAnd(
						ig8.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm8)));
			}
			if (!isNull(up0().itm_grp_nm9())) {
				builder.addLeftOuterJoin(ig9, itm1.itm_grp_cd9.eq(ig9.itm_grp_cd)
						.and(ig9.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP9.value()))));
				builder.addWhereWithCutOffAnd(
						ig9.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm9)));
			}
			if (!isNull(up0().itm_grp_nm10())) {
				builder.addLeftOuterJoin(ig10, itm1.itm_grp_cd10.eq(ig10.itm_grp_cd)
						.and(ig10.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP10.value()))));
				builder.addWhereWithCutOffAnd(
						ig10.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm10)));
			}
		}
		
		@Override
		protected void down_SELECT_c0_0(Srch01_RsltR r_dest, MST_ALLOC_STOP_LOT_R r_src) {
			super.down_SELECT_c0_0(r_dest, r_src);
			r_dest.itm_nm(r_src.getStringNE("itm_nm"));
			r_dest.stop_usr_nm(r_src.getStringNE("stop_usr_nm"));
			r_dest.rel_usr_nm(r_src.getStringNE("rel_usr_nm"));
		}
		
		
	}
	/**
	 * AllocStopLot_UpdChk01オペレーション.<p>
	 *
	 * 引当禁止ロット情報の更新前チェック<br>
	 */
	public class AllocStopLot_UpdChk01 extends MSBEL_AllocStopLotReg_MC_A.AllocStopLot_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
	}
	/**
	 * AllocStopLot_Upd01オペレーション.<p>
	 *
	 * 引当禁止ロット情報を更新する<br>
	 */
	public class AllocStopLot_Upd01 extends MSBEL_AllocStopLotReg_MC_A.AllocStopLot_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AllocStopLot_DelChk01オペレーション.<p>
	 *
	 * 引当禁止ロット情報の削除前チェック<br>
	 */
	public class AllocStopLot_DelChk01 extends MSBEL_AllocStopLotReg_MC_A.AllocStopLot_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AllocStopLot_Del01オペレーション.<p>
	 *
	 * 引当禁止ロット情報を削除する<br>
	 */
	public class AllocStopLot_Del01 extends MSBEL_AllocStopLotReg_MC_A.AllocStopLot_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 引当禁止ロット情報を削除する<br>
	 */
	public class Del01 extends MSBEL_AllocStopLotReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 引当禁止ロット情報を更新する<br>
	 */
	public class Upd01 extends MSBEL_AllocStopLotReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}