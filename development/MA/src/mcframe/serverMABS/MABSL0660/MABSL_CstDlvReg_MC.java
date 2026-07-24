package mcframe.serverMABS.MABSL0660;

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
import mcframe.serverMABS.MABSL0660.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABSL_CstDlvReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABSL_CstDlvReg_MC extends MABSL_CstDlvReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * CstDlv_UpdChk01オペレーション.<p>
	 *
	 * 得意先納品先マスタの登録前のチェックを行います。<br>
	 */
	public class CstDlv_UpdChk01 extends MABSL_CstDlvReg_MC_A.CstDlv_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CstDlv_Upd01オペレーション.<p>
	 *
	 * 得意先納品先マスタの登録を行います。<br>
	 */
	public class CstDlv_Upd01 extends MABSL_CstDlvReg_MC_A.CstDlv_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CstDlv_DelChk01オペレーション.<p>
	 *
	 * 得意先納品先マスタの削除前のチェックを行います。<br>
	 */
	public class CstDlv_DelChk01 extends MABSL_CstDlvReg_MC_A.CstDlv_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CstDlv_Del01オペレーション.<p>
	 *
	 * 得意先納品先マスタの削除を行います。<br>
	 */
	public class CstDlv_Del01 extends MABSL_CstDlvReg_MC_A.CstDlv_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 得意先納品先マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABSL_CstDlvReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_CST_DLV_R) {
				dbcCustomizeSub(builder);
			}
		}
		
		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {


				MAM_BP_R bp1 = MAM_BP_R.create(MAM_CST_DLV_R.$BP1);
				MAM_BP_R bp2 = MAM_BP_R.create(MAM_CST_DLV_R.$BP2);
							
				if(!isNull(up0().cst_grp_nm1())) {
					MAM_BP_GRP_R cstbg1 = MAM_BP_GRP_R.create("CSTBG1");
					builder.addLeftOuterJoin(cstbg1, bp1.bp_grp_cd1.eq(cstbg1.bp_grp_cd)
							.and(cstbg1.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP1.value()))));
					builder.addWhereWithCutOffAnd(cstbg1.bp_grp_nm.like(bind(Srch01_CndR.$cst_grp_nm1)));
				}
				if(!isNull(up0().cst_grp_nm2())) {
					MAM_BP_GRP_R cstbg2 = MAM_BP_GRP_R.create("CSTBG2");
					builder.addLeftOuterJoin(cstbg2, bp1.bp_grp_cd2.eq(cstbg2.bp_grp_cd)
							.and(cstbg2.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP2.value()))));
					builder.addWhereWithCutOffAnd(cstbg2.bp_grp_nm.like(bind(Srch01_CndR.$cst_grp_nm2)));
				}
				if(!isNull(up0().cst_grp_nm3())) {
					MAM_BP_GRP_R cstbg3 = MAM_BP_GRP_R.create("CSTBG3");
					builder.addLeftOuterJoin(cstbg3, bp1.bp_grp_cd3.eq(cstbg3.bp_grp_cd)
							.and(cstbg3.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP3.value()))));
					builder.addWhereWithCutOffAnd(cstbg3.bp_grp_nm.like(bind(Srch01_CndR.$cst_grp_nm3)));
				}
				if(!isNull(up0().cst_grp_nm4())) {
					MAM_BP_GRP_R cstbg4 = MAM_BP_GRP_R.create("CSTBG4");
					builder.addLeftOuterJoin(cstbg4, bp1.bp_grp_cd4.eq(cstbg4.bp_grp_cd)
							.and(cstbg4.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP4.value()))));
					builder.addWhereWithCutOffAnd(cstbg4.bp_grp_nm.like(bind(Srch01_CndR.$cst_grp_nm4)));
				}
				if(!isNull(up0().cst_grp_nm5())) {
					MAM_BP_GRP_R cstbg5 = MAM_BP_GRP_R.create("CSTBG5");
					builder.addLeftOuterJoin(cstbg5, bp1.bp_grp_cd5.eq(cstbg5.bp_grp_cd)
							.and(cstbg5.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP5.value()))));
					builder.addWhereWithCutOffAnd(cstbg5.bp_grp_nm.like(bind(Srch01_CndR.$cst_grp_nm5)));
				}
				if(!isNull(up0().cst_grp_nm6())) {
					MAM_BP_GRP_R cstbg6 = MAM_BP_GRP_R.create("CSTBG6");
					builder.addLeftOuterJoin(cstbg6, bp1.bp_grp_cd6.eq(cstbg6.bp_grp_cd)
							.and(cstbg6.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP6.value()))));
					builder.addWhereWithCutOffAnd(cstbg6.bp_grp_nm.like(bind(Srch01_CndR.$cst_grp_nm6)));
				}
				if(!isNull(up0().cst_grp_nm7())) {
					MAM_BP_GRP_R cstbg7 = MAM_BP_GRP_R.create("CSTBG7");
					builder.addLeftOuterJoin(cstbg7, bp1.bp_grp_cd7.eq(cstbg7.bp_grp_cd)
							.and(cstbg7.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP7.value()))));
					builder.addWhereWithCutOffAnd(cstbg7.bp_grp_nm.like(bind(Srch01_CndR.$cst_grp_nm7)));
				}
				if(!isNull(up0().cst_grp_nm8())) {
					MAM_BP_GRP_R cstbg8 = MAM_BP_GRP_R.create("CSTBG8");
					builder.addLeftOuterJoin(cstbg8, bp1.bp_grp_cd8.eq(cstbg8.bp_grp_cd)
							.and(cstbg8.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP8.value()))));
					builder.addWhereWithCutOffAnd(cstbg8.bp_grp_nm.like(bind(Srch01_CndR.$cst_grp_nm8)));
				}
				if(!isNull(up0().cst_grp_nm9())) {
					MAM_BP_GRP_R cstbg9 = MAM_BP_GRP_R.create("CSTBG9");
					builder.addLeftOuterJoin(cstbg9, bp1.bp_grp_cd9.eq(cstbg9.bp_grp_cd)
							.and(cstbg9.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP9.value()))));
					builder.addWhereWithCutOffAnd(cstbg9.bp_grp_nm.like(bind(Srch01_CndR.$cst_grp_nm9)));
				}
				if(!isNull(up0().cst_grp_nm10())) {
					MAM_BP_GRP_R cstbg10 = MAM_BP_GRP_R.create("CSTBG10");
					builder.addLeftOuterJoin(cstbg10, bp1.bp_grp_cd10.eq(cstbg10.bp_grp_cd)
							.and(cstbg10.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP10.value()))));
					builder.addWhereWithCutOffAnd(cstbg10.bp_grp_nm.like(bind(Srch01_CndR.$cst_grp_nm10)));
				}

				if(!isNull(up0().dlv_grp_nm1())) {
					MAM_BP_GRP_R dlvbg1 = MAM_BP_GRP_R.create("DLVBG1");
					builder.addLeftOuterJoin(dlvbg1, bp2.bp_grp_cd1.eq(dlvbg1.bp_grp_cd)
							.and(dlvbg1.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP1.value()))));
					builder.addWhereWithCutOffAnd(dlvbg1.bp_grp_nm.like(bind(Srch01_CndR.$dlv_grp_nm1)));
				}
				if(!isNull(up0().dlv_grp_nm2())) {
					MAM_BP_GRP_R dlvbg2 = MAM_BP_GRP_R.create("DLVBG2");
					builder.addLeftOuterJoin(dlvbg2, bp2.bp_grp_cd2.eq(dlvbg2.bp_grp_cd)
							.and(dlvbg2.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP2.value()))));
					builder.addWhereWithCutOffAnd(dlvbg2.bp_grp_nm.like(bind(Srch01_CndR.$dlv_grp_nm2)));
				}
				if(!isNull(up0().dlv_grp_nm3())) {
					MAM_BP_GRP_R dlvbg3 = MAM_BP_GRP_R.create("DLVBG3");
					builder.addLeftOuterJoin(dlvbg3, bp2.bp_grp_cd3.eq(dlvbg3.bp_grp_cd)
							.and(dlvbg3.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP3.value()))));
					builder.addWhereWithCutOffAnd(dlvbg3.bp_grp_nm.like(bind(Srch01_CndR.$dlv_grp_nm3)));
				}
				if(!isNull(up0().dlv_grp_nm4())) {
					MAM_BP_GRP_R dlvbg4 = MAM_BP_GRP_R.create("DLVBG4");
					builder.addLeftOuterJoin(dlvbg4, bp2.bp_grp_cd4.eq(dlvbg4.bp_grp_cd)
							.and(dlvbg4.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP4.value()))));
					builder.addWhereWithCutOffAnd(dlvbg4.bp_grp_nm.like(bind(Srch01_CndR.$dlv_grp_nm4)));
				}
				if(!isNull(up0().dlv_grp_nm5())) {
					MAM_BP_GRP_R dlvbg5 = MAM_BP_GRP_R.create("DLVBG5");
					builder.addLeftOuterJoin(dlvbg5, bp2.bp_grp_cd5.eq(dlvbg5.bp_grp_cd)
							.and(dlvbg5.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP5.value()))));
					builder.addWhereWithCutOffAnd(dlvbg5.bp_grp_nm.like(bind(Srch01_CndR.$dlv_grp_nm5)));
				}
				if(!isNull(up0().dlv_grp_nm6())) {
					MAM_BP_GRP_R dlvbg6 = MAM_BP_GRP_R.create("DLVBG6");
					builder.addLeftOuterJoin(dlvbg6, bp2.bp_grp_cd6.eq(dlvbg6.bp_grp_cd)
							.and(dlvbg6.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP6.value()))));
					builder.addWhereWithCutOffAnd(dlvbg6.bp_grp_nm.like(bind(Srch01_CndR.$dlv_grp_nm6)));
				}
				if(!isNull(up0().dlv_grp_nm7())) {
					MAM_BP_GRP_R dlvbg7 = MAM_BP_GRP_R.create("DLVBG7");
					builder.addLeftOuterJoin(dlvbg7, bp2.bp_grp_cd7.eq(dlvbg7.bp_grp_cd)
							.and(dlvbg7.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP7.value()))));
					builder.addWhereWithCutOffAnd(dlvbg7.bp_grp_nm.like(bind(Srch01_CndR.$dlv_grp_nm7)));
				}
				if(!isNull(up0().dlv_grp_nm8())) {
					MAM_BP_GRP_R dlvbg8 = MAM_BP_GRP_R.create("DLVBG8");
					builder.addLeftOuterJoin(dlvbg8, bp2.bp_grp_cd8.eq(dlvbg8.bp_grp_cd)
							.and(dlvbg8.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP8.value()))));
					builder.addWhereWithCutOffAnd(dlvbg8.bp_grp_nm.like(bind(Srch01_CndR.$dlv_grp_nm8)));
				}
				if(!isNull(up0().dlv_grp_nm9())) {
					MAM_BP_GRP_R dlvbg9 = MAM_BP_GRP_R.create("DLVBG9");
					builder.addLeftOuterJoin(dlvbg9, bp2.bp_grp_cd9.eq(dlvbg9.bp_grp_cd)
							.and(dlvbg9.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP9.value()))));
					builder.addWhereWithCutOffAnd(dlvbg9.bp_grp_nm.like(bind(Srch01_CndR.$dlv_grp_nm9)));
				}
				if(!isNull(up0().dlv_grp_nm10())) {
					MAM_BP_GRP_R dlvbg10 = MAM_BP_GRP_R.create("DLVBG10");
					builder.addLeftOuterJoin(dlvbg10, bp2.bp_grp_cd10.eq(dlvbg10.bp_grp_cd)
							.and(dlvbg10.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP10.value()))));
					builder.addWhereWithCutOffAnd(dlvbg10.bp_grp_nm.like(bind(Srch01_CndR.$dlv_grp_nm10)));
				}

				builder.addWhereWithCutOffAnd(bp1.bp_grp_cd1.like(bind(Srch01_CndR.$cst_grp_cd1)));
				builder.addWhereWithCutOffAnd(bp1.bp_grp_cd2.like(bind(Srch01_CndR.$cst_grp_cd2)));
				builder.addWhereWithCutOffAnd(bp1.bp_grp_cd3.like(bind(Srch01_CndR.$cst_grp_cd3)));
				builder.addWhereWithCutOffAnd(bp1.bp_grp_cd4.like(bind(Srch01_CndR.$cst_grp_cd4)));
				builder.addWhereWithCutOffAnd(bp1.bp_grp_cd5.like(bind(Srch01_CndR.$cst_grp_cd5)));
				builder.addWhereWithCutOffAnd(bp1.bp_grp_cd6.like(bind(Srch01_CndR.$cst_grp_cd6)));
				builder.addWhereWithCutOffAnd(bp1.bp_grp_cd7.like(bind(Srch01_CndR.$cst_grp_cd7)));
				builder.addWhereWithCutOffAnd(bp1.bp_grp_cd8.like(bind(Srch01_CndR.$cst_grp_cd8)));
				builder.addWhereWithCutOffAnd(bp1.bp_grp_cd9.like(bind(Srch01_CndR.$cst_grp_cd9)));
				builder.addWhereWithCutOffAnd(bp1.bp_grp_cd10.like(bind(Srch01_CndR.$cst_grp_cd10)));

				builder.addWhereWithCutOffAnd(bp2.bp_grp_cd1.like(bind(Srch01_CndR.$dlv_grp_cd1)));
				builder.addWhereWithCutOffAnd(bp2.bp_grp_cd2.like(bind(Srch01_CndR.$dlv_grp_cd2)));
				builder.addWhereWithCutOffAnd(bp2.bp_grp_cd3.like(bind(Srch01_CndR.$dlv_grp_cd3)));
				builder.addWhereWithCutOffAnd(bp2.bp_grp_cd4.like(bind(Srch01_CndR.$dlv_grp_cd4)));
				builder.addWhereWithCutOffAnd(bp2.bp_grp_cd5.like(bind(Srch01_CndR.$dlv_grp_cd5)));
				builder.addWhereWithCutOffAnd(bp2.bp_grp_cd6.like(bind(Srch01_CndR.$dlv_grp_cd6)));
				builder.addWhereWithCutOffAnd(bp2.bp_grp_cd7.like(bind(Srch01_CndR.$dlv_grp_cd7)));
				builder.addWhereWithCutOffAnd(bp2.bp_grp_cd8.like(bind(Srch01_CndR.$dlv_grp_cd8)));
				builder.addWhereWithCutOffAnd(bp2.bp_grp_cd9.like(bind(Srch01_CndR.$dlv_grp_cd9)));
				builder.addWhereWithCutOffAnd(bp2.bp_grp_cd10.like(bind(Srch01_CndR.$dlv_grp_cd10)));
			}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 得意先納品先マスタの登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABSL_CstDlvReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 得意先納品先マスタの削除を行います。<br>
	 */
	public class Del01 extends MABSL_CstDlvReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}