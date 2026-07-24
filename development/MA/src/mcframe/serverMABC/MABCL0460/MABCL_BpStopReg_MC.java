package mcframe.serverMABC.MABCL0460;

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
import mcframe.serverMABC.MABCL0460.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_BpStopReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_BpStopReg_MC extends MABCL_BpStopReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * BpStop_DelChk01オペレーション.<p>
	 *
	 * 取引先禁止マスタの削除前のチェックを行います。<br>
	 */
	public class BpStop_DelChk01 extends MABCL_BpStopReg_MC_A.BpStop_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
	}
	/**
	 * BpStop_Del01オペレーション.<p>
	 *
	 * 取引先禁止マスタの削除を行います。<br>
	 */
	public class BpStop_Del01 extends MABCL_BpStopReg_MC_A.BpStop_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 取引先禁止マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_BpStopReg_MC_A.Srch01 {
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if(builder.getBaseDbc() instanceof MAM_BP_STOP_R){
				dbcCustomizeSub(builder);
			}
		}
		
		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {

			// 受注　許可
			MAM_BP_STOP_R t = MAM_BP_STOP_R.create(builder.getBaseDbcAlias());

			if (up0().slo_stop_f_flg()) {
				builder.addWhereWithAnd(t.slo_stop_dt.isNull());
			}
			else if (up0().slo_stop_t_flg()) {
				builder.addWhereWithAnd(t.slo_stop_dt.isNotNull());
			}
			builder.addWhereWithCutOffAnd(
					t.slo_stop_dt.gte(bind(Srch01_CndR.$slo_stop_dt_fr)));
			builder.addWhereWithCutOffAnd(
					t.slo_stop_dt.lte(bind(Srch01_CndR.$slo_stop_dt_to)));
			// 発注　許可
			if (up0().po_stop_f_flg()) {
				builder.addWhereWithAnd(t.po_stop_dt.isNull());
			}
			else if (up0().po_stop_t_flg()) {
				builder.addWhereWithAnd(t.po_stop_dt.isNotNull());
			}
			builder.addWhereWithCutOffAnd(
					t.po_stop_dt.gte(bind(Srch01_CndR.$po_stop_dt_fr)));
			builder.addWhereWithCutOffAnd(
					t.po_stop_dt.lte(bind(Srch01_CndR.$po_stop_dt_to)));
			// 売上・出荷　許可
			if (up0().sls_stop_f_flg()) {
				builder.addWhereWithAnd(t.sls_stop_dt.isNull());
			}
			else if (up0().sls_stop_t_flg()) {
				builder.addWhereWithAnd(t.sls_stop_dt.isNotNull());
			}
			builder.addWhereWithCutOffAnd(
					t.sls_stop_dt.gte(bind(Srch01_CndR.$sls_stop_dt_fr)));
			builder.addWhereWithCutOffAnd(
					t.sls_stop_dt.lte(bind(Srch01_CndR.$sls_stop_dt_to)));
			// 仕入・入荷　許可
			if (up0().purc_stop_f_flg()) {
				builder.addWhereWithAnd(t.purc_stop_dt.isNull());
			}
			else if (up0().purc_stop_t_flg()) {
				builder.addWhereWithAnd(t.purc_stop_dt.isNotNull());
			}
			builder.addWhereWithCutOffAnd(
					t.purc_stop_dt.gte(bind(Srch01_CndR.$purc_stop_dt_fr)));
			builder.addWhereWithCutOffAnd(
					t.purc_stop_dt.lte(bind(Srch01_CndR.$purc_stop_dt_to)));
			// 所要・オーダ　許可
			if (up0().order_stop_f_flg()) {
				builder.addWhereWithAnd(t.order_stop_dt.isNull());
			}
			else if (up0().order_stop_t_flg()) {
				builder.addWhereWithAnd(t.order_stop_dt.isNotNull());
			}
			builder.addWhereWithCutOffAnd(
					t.order_stop_dt.gte(bind(Srch01_CndR.$order_stop_dt_fr)));
			builder.addWhereWithCutOffAnd(
					t.order_stop_dt.lte(bind(Srch01_CndR.$order_stop_dt_to)));
			// 製造指図　許可
			if (up0().mfg_inst_stop_f_flg()) {
				builder.addWhereWithAnd(t.mfg_inst_stop_dt.isNull());
			}
			else if (up0().mfg_inst_stop_t_flg()) {
				builder.addWhereWithAnd(t.mfg_inst_stop_dt.isNotNull());
			}
			builder.addWhereWithCutOffAnd(
					t.mfg_inst_stop_dt.gte(bind(Srch01_CndR.$mfg_inst_stop_dt_fr)));
			builder.addWhereWithCutOffAnd(
					t.mfg_inst_stop_dt.lte(bind(Srch01_CndR.$mfg_inst_stop_dt_to)));
			// 出荷指図　許可
			if (up0().ship_inst_stop_f_flg()) {
				builder.addWhereWithAnd(t.ship_inst_stop_dt.isNull());
			}
			else if (up0().ship_inst_stop_t_flg()) {
				builder.addWhereWithAnd(t.ship_inst_stop_dt.isNotNull());
			}
			builder.addWhereWithCutOffAnd(
					t.ship_inst_stop_dt.gte(bind(Srch01_CndR.$ship_inst_stop_dt_fr)));
			builder.addWhereWithCutOffAnd(
					t.ship_inst_stop_dt.lte(bind(Srch01_CndR.$ship_inst_stop_dt_to)));
			// 移送・移動　許可
			if (up0().xfr_stop_f_flg()) {
				builder.addWhereWithAnd(t.xfr_stop_dt.isNull());
			}
			else if (up0().xfr_stop_t_flg()) {
				builder.addWhereWithAnd(t.xfr_stop_dt.isNotNull());
			}
			builder.addWhereWithCutOffAnd(
					t.xfr_stop_dt.gte(bind(Srch01_CndR.$xfr_stop_dt_fr)));
			builder.addWhereWithCutOffAnd(
					t.xfr_stop_dt.lte(bind(Srch01_CndR.$xfr_stop_dt_to)));
			// 取引先分類
			MAM_BP_R bp1 = MAM_BP_R.create(MAM_BP_STOP_R.$BP1);
			if (!isNull(up0().bp_grp_nm1())) {
				MAM_BP_GRP_R bg1 = MAM_BP_GRP_R.create("BG1");
				builder.addLeftOuterJoin(bg1, bp1.bp_grp_cd1.eq(bg1.bp_grp_cd)
						.and(bg1.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP1.value()))));
				builder.addWhereWithCutOffAnd(
						bg1.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm1)));
			}
			if (!isNull(up0().bp_grp_nm2())) {
				MAM_BP_GRP_R bg2 = MAM_BP_GRP_R.create("BG2");
				builder.addLeftOuterJoin(bg2, bp1.bp_grp_cd2.eq(bg2.bp_grp_cd)
						.and(bg2.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP2.value()))));
				builder.addWhereWithCutOffAnd(
						bg2.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm2)));
			}
			if (!isNull(up0().bp_grp_nm3())) {
				MAM_BP_GRP_R bg3 = MAM_BP_GRP_R.create("BG3");
				builder.addLeftOuterJoin(bg3, bp1.bp_grp_cd3.eq(bg3.bp_grp_cd)
						.and(bg3.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP3.value()))));
				builder.addWhereWithCutOffAnd(
						bg3.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm3)));
			}
			if (!isNull(up0().bp_grp_nm4())) {
				MAM_BP_GRP_R bg4 = MAM_BP_GRP_R.create("BG4");
				builder.addLeftOuterJoin(bg4, bp1.bp_grp_cd4.eq(bg4.bp_grp_cd)
						.and(bg4.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP4.value()))));
				builder.addWhereWithCutOffAnd(
						bg4.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm4)));
			}
			if (!isNull(up0().bp_grp_nm5())) {
				MAM_BP_GRP_R bg5 = MAM_BP_GRP_R.create("BG5");
				builder.addLeftOuterJoin(bg5, bp1.bp_grp_cd5.eq(bg5.bp_grp_cd)
						.and(bg5.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP5.value()))));
				builder.addWhereWithCutOffAnd(
						bg5.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm5)));
			}
			if (!isNull(up0().bp_grp_nm6())) {
				MAM_BP_GRP_R bg6 = MAM_BP_GRP_R.create("BG6");
				builder.addLeftOuterJoin(bg6, bp1.bp_grp_cd6.eq(bg6.bp_grp_cd)
						.and(bg6.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP6.value()))));
				builder.addWhereWithCutOffAnd(
						bg6.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm6)));
			}
			if (!isNull(up0().bp_grp_nm7())) {
				MAM_BP_GRP_R bg7 = MAM_BP_GRP_R.create("BG7");
				builder.addLeftOuterJoin(bg7, bp1.bp_grp_cd7.eq(bg7.bp_grp_cd)
						.and(bg7.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP7.value()))));
				builder.addWhereWithCutOffAnd(
						bg7.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm7)));
			}
			if (!isNull(up0().bp_grp_nm8())) {
				MAM_BP_GRP_R bg8 = MAM_BP_GRP_R.create("BG8");
				builder.addLeftOuterJoin(bg8, bp1.bp_grp_cd8.eq(bg8.bp_grp_cd)
						.and(bg8.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP8.value()))));
				builder.addWhereWithCutOffAnd(
						bg8.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm8)));
			}
			if (!isNull(up0().bp_grp_nm9())) {
				MAM_BP_GRP_R bg9 = MAM_BP_GRP_R.create("BG9");
				builder.addLeftOuterJoin(bg9, bp1.bp_grp_cd9.eq(bg9.bp_grp_cd)
						.and(bg9.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP9.value()))));
				builder.addWhereWithCutOffAnd(
						bg9.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm9)));
			}
			if (!isNull(up0().bp_grp_nm10())) {
				MAM_BP_GRP_R bg10 = MAM_BP_GRP_R.create("BG10");
				builder.addLeftOuterJoin(bg10, bp1.bp_grp_cd10.eq(bg10.bp_grp_cd)
						.and(bg10.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP10.value()))));
				builder.addWhereWithCutOffAnd(
						bg10.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm10)));
			}

			builder.addWhereWithCutOffAnd(
					bp1.bp_grp_cd1.like(bind(Srch01_CndR.$bp_grp_cd1)));
			builder.addWhereWithCutOffAnd(
					bp1.bp_grp_cd2.like(bind(Srch01_CndR.$bp_grp_cd2)));
			builder.addWhereWithCutOffAnd(
					bp1.bp_grp_cd3.like(bind(Srch01_CndR.$bp_grp_cd3)));
			builder.addWhereWithCutOffAnd(
					bp1.bp_grp_cd4.like(bind(Srch01_CndR.$bp_grp_cd4)));
			builder.addWhereWithCutOffAnd(
					bp1.bp_grp_cd5.like(bind(Srch01_CndR.$bp_grp_cd5)));
			builder.addWhereWithCutOffAnd(
					bp1.bp_grp_cd6.like(bind(Srch01_CndR.$bp_grp_cd6)));
			builder.addWhereWithCutOffAnd(
					bp1.bp_grp_cd7.like(bind(Srch01_CndR.$bp_grp_cd7)));
			builder.addWhereWithCutOffAnd(
					bp1.bp_grp_cd8.like(bind(Srch01_CndR.$bp_grp_cd8)));
			builder.addWhereWithCutOffAnd(
					bp1.bp_grp_cd9.like(bind(Srch01_CndR.$bp_grp_cd9)));
			builder.addWhereWithCutOffAnd(
					bp1.bp_grp_cd10.like(bind(Srch01_CndR.$bp_grp_cd10)));
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 取引先禁止マスタの削除を行います。<br>
	 */
	public class Del01 extends MABCL_BpStopReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * BpStop_UpdChk01オペレーション.<p>
	 *
	 * 取引先禁止マスタの登録前のチェックを行います。<br>
	 */
	public class BpStop_UpdChk01 extends MABCL_BpStopReg_MC_A.BpStop_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * BpStop_Upd01オペレーション.<p>
	 *
	 * 取引先禁止マスタの登録を行います。<br>
	 */
	public class BpStop_Upd01 extends MABCL_BpStopReg_MC_A.BpStop_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 取引先禁止マスタの登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABCL_BpStopReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}