package mcframe.serverMABS.MABSL0340;

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
import mcframe.serverMABS.MABSL0340.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABSL_ItmWgReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABSL_ItmWgReg_MC extends MABSL_ItmWgReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * ItmWg_UpdChk01オペレーション.<p>
	 *
	 * 品目マスタ（ＷＧ）の登録前のチェックを行います。<br>
	 */
	public class ItmWg_UpdChk01 extends MABSL_ItmWgReg_MC_A.ItmWg_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();
			
			msgLst.addAll(checkWritableWgCdDac(
					up0().subList(r -> !MAC_STR.isNULL_VAL(r.wg_cd())),
					ItmWg_UpdChk01_DtlR.$wg_cd));
			
			return msgLst;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList =	super.doServerCheckSub();

			for (ItmWg_UpdChk01_DtlR r : up0()) {
				if (r.del_flg()) {
					continue ;
				}
			
				if (!isNull(r.rqmt_rstr_qty())) {
					msgList.addAll(checkDecPlace(r, ItmWg_UpdChk01_DtlR.$dec_place, ItmWg_UpdChk01_DtlR.$rqmt_rstr_qty));
				}
			}
			return msgList;
		}
	}
	/**
	 * ItmWg_Upd01オペレーション.<p>
	 *
	 * 品目マスタ（ＷＧ）の登録を行います。<br>
	 */
	public class ItmWg_Upd01 extends MABSL_ItmWgReg_MC_A.ItmWg_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ItmWg_DelChk01オペレーション.<p>
	 *
	 * 品目マスタ（ＷＧ）の削除前のチェックを行います。<br>
	 */
	public class ItmWg_DelChk01 extends MABSL_ItmWgReg_MC_A.ItmWg_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();
			
			msgLst.addAll(checkWritableWgCdDac(
					up0().subList(r -> !MAC_STR.isNULL_VAL(r.wg_cd())),
					ItmWg_DelChk01_DtlR.$wg_cd));
			
			return msgLst;
		}
	}
	/**
	 * ItmWg_Del01オペレーション.<p>
	 *
	 * 品目マスタ（ＷＧ）の削除を行います。<br>
	 */
	public class ItmWg_Del01 extends MABSL_ItmWgReg_MC_A.ItmWg_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 品目マスタ（ＷＧ）の検索を行います。<br>
	 */
	public class Srch01 extends MABSL_ItmWgReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(
				MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_ITM_WG__R) {
				dbcCustomizeSub(builder, rslt);
			}
		}
		
		protected <R extends MCDBContainer> void dbcCustomizeSub(MCQueryApiBuilder builder, MCList<R> rslt) {
			/* DAC対応 */
			MAVM_RD_WG_R S1RD_WG1 = MAVM_RD_WG_R.create("RD_WG1");
			MAM_ITM_TYP_D_R itmtypd1 = MAM_ITM_TYP_D_R.create("ITMTYPD1");
			MAM_ITM_WG__R t = MAM_ITM_WG__R.create(builder.getBaseDbcAlias());
			MAM_ITM__R itm1 = MAM_ITM__R.create(MAM_ITM_WG__R.$ITM1);
			
			builder.addWhereWithAnd(exists(subQuery().select(S1RD_WG1.prAll())
					.from(S1RD_WG1).where(t.wg_cd.eq(S1RD_WG1.wg_cd))));
			builder.addLeftOuterJoin(itmtypd1, itm1.itm_typ.eq(itmtypd1.itm_typ)
					.and(itm1.itm_typ_d_cd.eq(itmtypd1.itm_typ_d_cd)));
			builder.addWhereWithCutOffAnd(itm1.itm_typ.like(bind(Srch01_CndR.$itm_typ)));
			builder.addWhereWithCutOffAnd(itm1.itm_typ_d_cd.like(bind(Srch01_CndR.$itm_typ_d_cd)));
			builder.addWhereWithCutOffAnd(itmtypd1.itm_typ_d_nm.like(bind(Srch01_CndR.$itm_typ_d_nm)));

			builder.addSelect(itm1.unit_cd.as("unit_cd"));
			builder.addSelect(itm1.dec_place.as("dec_place"));
			builder.addSelect(itm1.itm_typ);
			builder.addSelect(itm1.itm_typ_d_cd);
			builder.addSelect(itmtypd1.itm_typ_d_nm);
			builder.addSelect(itm1.mfg_inst_unit_typ.as("mfg_inst_unit_typ_itm"));
			builder.addSelect(itm1.mrp_proc_typ.as("mrp_proc_typ_itm"));
			builder.addSelect(itm1.rqmt_typ.as("rqmt_typ_itm"));
			builder.addSelect(itm1.prod_pln_typ.as("prod_pln_typ_itm"));
			builder.addSelect(itm1.dmnd_date_div_mons.as("dmnd_date_div_mons_itm"));
			builder.addSelect(itm1.alloc_margin_days.as("alloc_margin_days_itm"));
			builder.addSelect(itm1.mrp_alloc_margin_days.as("mrp_alloc_margin_days_itm"));
			builder.addSelect(itm1.mrp_opn_xfr_days.as("mrp_opn_xfr_days_itm"));

			MAM_WG_R wg1 = MAM_WG_R.create(MAM_ITM_WG__R.$WG1);
			builder.addSelect(wg1.mfg_inst_unit_typ.as("mfg_inst_unit_typ_wg"));
			builder.addSelect(wg1.mrp_proc_typ.as("mrp_proc_typ_wg"));
			builder.addSelect(wg1.rqmt_typ.as("rqmt_typ_wg"));
			builder.addSelect(wg1.prod_pln_typ.as("prod_pln_typ_wg"));
			builder.addSelect(wg1.dmnd_date_div_mons.as("dmnd_date_div_mons_wg"));
			builder.addSelect(wg1.alloc_margin_days.as("alloc_margin_days_wg"));
			builder.addSelect(wg1.mrp_alloc_margin_days.as("mrp_alloc_margin_days_wg"));
			builder.addSelect(wg1.mrp_opn_xfr_days.as("mrp_opn_xfr_days_wg"));

			builder.addSelect(nvl(nvl(itm1.mfg_inst_unit_typ, wg1.mfg_inst_unit_typ),
					value(MAC_MFG_INST_UNIT_TYP.ITM.value()))
							.as("mfg_inst_unit_typ_mst"));
			builder.addSelect(nvl(nvl(itm1.mrp_proc_typ, wg1.mrp_proc_typ),
					value(MAC_MRP_PROC_TYP.RATE.value())).as("mrp_proc_typ_mst"));
			builder.addSelect(nvl(itm1.rqmt_typ, wg1.rqmt_typ).as("rqmt_typ_mst"));
			builder.addSelect(
					nvl(itm1.prod_pln_typ, wg1.prod_pln_typ).as("prod_pln_typ_mst"));
			builder.addSelect(nvl(itm1.dmnd_date_div_mons, wg1.dmnd_date_div_mons)
					.as("dmnd_date_div_mons_mst"));
			builder.addSelect(
					nvl(nvl(itm1.alloc_margin_days, wg1.alloc_margin_days), value(0))
							.as("alloc_margin_days_mst"));
			builder.addSelect(nvl(itm1.mrp_alloc_margin_days, wg1.mrp_alloc_margin_days)
					.as("mrp_alloc_margin_days_mst"));
			builder.addSelect(nvl(itm1.mrp_opn_xfr_days, wg1.mrp_opn_xfr_days)
					.as("mrp_opn_xfr_days_mst"));

			builder.addSelect(itm1.rqmt_rstr_qty.as("rqmt_rstr_qty_mst"));
			builder.addSelect(itm1.inpt_itm_add_flg.as("inpt_itm_add_flg"));
			builder.addSelect(itm1.inpt_itm_del_flg.as("inpt_itm_del_flg"));
			builder.addSelect(itm1.sch_flg.as("sch_flg"));
			rslt.addBooleanColumn("inpt_itm_add_flg");
			rslt.addBooleanColumn("inpt_itm_del_flg");
			rslt.addBooleanColumn("sch_flg");

			if (!isNull(up0().itm_grp_nm1())) {
				MAM_ITM_GRP_R ig1 = MAM_ITM_GRP_R.create("IG1");
				builder.addLeftOuterJoin(ig1, itm1.itm_grp_cd1.eq(ig1.itm_grp_cd)
						.and(ig1.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP1.value()))));
				builder.addWhereWithCutOffAnd(ig1.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm1)));
			}
			if (!isNull(up0().itm_grp_nm2())) {
				MAM_ITM_GRP_R ig2 = MAM_ITM_GRP_R.create("IG2");
				builder.addLeftOuterJoin(ig2, itm1.itm_grp_cd2.eq(ig2.itm_grp_cd)
						.and(ig2.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP2.value()))));
				builder.addWhereWithCutOffAnd(ig2.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm2)));
			}
			if (!isNull(up0().itm_grp_nm3())) {
				MAM_ITM_GRP_R ig3 = MAM_ITM_GRP_R.create("IG3");
				builder.addLeftOuterJoin(ig3, itm1.itm_grp_cd3.eq(ig3.itm_grp_cd)
						.and(ig3.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP3.value()))));
				builder.addWhereWithCutOffAnd(ig3.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm3)));
			}
			if (!isNull(up0().itm_grp_nm4())) {
				MAM_ITM_GRP_R ig4 = MAM_ITM_GRP_R.create("IG4");
				builder.addLeftOuterJoin(ig4, itm1.itm_grp_cd4.eq(ig4.itm_grp_cd)
						.and(ig4.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP4.value()))));
				builder.addWhereWithCutOffAnd(ig4.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm4)));
			}
			if (!isNull(up0().itm_grp_nm5())) {
				MAM_ITM_GRP_R ig5 = MAM_ITM_GRP_R.create("IG5");
				builder.addLeftOuterJoin(ig5, itm1.itm_grp_cd5.eq(ig5.itm_grp_cd)
						.and(ig5.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP5.value()))));
				builder.addWhereWithCutOffAnd(ig5.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm5)));
			}
			if (!isNull(up0().itm_grp_nm6())) {
				MAM_ITM_GRP_R ig6 = MAM_ITM_GRP_R.create("IG6");
				builder.addLeftOuterJoin(ig6, itm1.itm_grp_cd6.eq(ig6.itm_grp_cd)
						.and(ig6.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP6.value()))));
				builder.addWhereWithCutOffAnd(ig6.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm6)));
			}
			if (!isNull(up0().itm_grp_nm7())) {
				MAM_ITM_GRP_R ig7 = MAM_ITM_GRP_R.create("IG7");
				builder.addLeftOuterJoin(ig7, itm1.itm_grp_cd7.eq(ig7.itm_grp_cd)
						.and(ig7.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP7.value()))));
				builder.addWhereWithCutOffAnd(ig7.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm7)));
			}
			if (!isNull(up0().itm_grp_nm8())) {
				MAM_ITM_GRP_R ig8 = MAM_ITM_GRP_R.create("IG8");
				builder.addLeftOuterJoin(ig8, itm1.itm_grp_cd8.eq(ig8.itm_grp_cd)
						.and(ig8.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP8.value()))));
				builder.addWhereWithCutOffAnd(ig8.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm8)));
			}
			if (!isNull(up0().itm_grp_nm9())) {
				MAM_ITM_GRP_R ig9 = MAM_ITM_GRP_R.create("IG9");
				builder.addLeftOuterJoin(ig9, itm1.itm_grp_cd9.eq(ig9.itm_grp_cd)
						.and(ig9.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP9.value()))));
				builder.addWhereWithCutOffAnd(ig9.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm9)));
			}
			if (!isNull(up0().itm_grp_nm10())) {
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
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 品目マスタ（ＷＧ）の登録を行います。<br>
	 */
	public class Upd01 extends MABSL_ItmWgReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 品目マスタ（ＷＧ）の削除を行います。<br>
	 */
	public class Del01 extends MABSL_ItmWgReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}