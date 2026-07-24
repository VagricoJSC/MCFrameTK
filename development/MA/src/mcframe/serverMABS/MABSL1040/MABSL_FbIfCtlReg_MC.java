package mcframe.serverMABS.MABSL1040;

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
import mcframe.serverMABS.MABSL1040.*; // このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.*;
import java.util.List;
import java.util.ArrayList;
//FMCB CUSTOM_IMPORT END

/**
 * "MABSL_FbIfCtlReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABSL_FbIfCtlReg_MC extends MABSL_FbIfCtlReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * FbIfCtl_DelChk01オペレーション.<p>
	 *
	 * ＦＢ ＩＦ制御マスタの削除前のチェックを行います。<br>
	 */
	public class FbIfCtl_DelChk01 extends MABSL_FbIfCtlReg_MC_A.FbIfCtl_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * FbIfCtl_Del01オペレーション.<p>
	 *
	 * ＦＢ ＩＦ制御マスタの削除を行います。<br>
	 */
	public class FbIfCtl_Del01 extends MABSL_FbIfCtlReg_MC_A.FbIfCtl_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * Srch01オペレーション.<p>
	 *
	 * ＦＢ ＩＦ制御マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABSL_FbIfCtlReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_FB_IF_CTL_R) {
				dbcCustomizeSub(builder);
			}
		}

		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			// 取引先無しFLG
			if (up0().bp_cd_null_flg()) {
				MAM_FB_IF_CTL_R t =  MAM_FB_IF_CTL_R.create(builder.getBaseDbcAlias());
				builder.addWhereWithAnd(t.bp_cd_null_flg.eq(value(true)));
			}
			
			MAM_BP_R bp1 = MAM_BP_R.create(MAM_FB_IF_CTL_R.$BP1);
			if (!isNull(up0().bp_grp_nm1())) {
				MAM_BP_GRP_R bg1 = MAM_BP_GRP_R.create("BG1");
				builder.addLeftOuterJoin(bg1, bp1.bp_grp_cd1.eq(bg1.bp_grp_cd)
						.and(bg1.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP1.value()))));
				builder.addWhereWithCutOffAnd(bg1.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm1)));
			}
			if (!isNull(up0().bp_grp_nm2())) {
				MAM_BP_GRP_R bg2 = MAM_BP_GRP_R.create("BG2");
				builder.addLeftOuterJoin(bg2, bp1.bp_grp_cd2.eq(bg2.bp_grp_cd)
						.and(bg2.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP2.value()))));
				builder.addWhereWithCutOffAnd(bg2.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm2)));
			}
			if (!isNull(up0().bp_grp_nm3())) {
				MAM_BP_GRP_R bg3 = MAM_BP_GRP_R.create("BG3");
				builder.addLeftOuterJoin(bg3, bp1.bp_grp_cd3.eq(bg3.bp_grp_cd)
						.and(bg3.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP3.value()))));
				builder.addWhereWithCutOffAnd(bg3.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm3)));
			}
			if (!isNull(up0().bp_grp_nm4())) {
				MAM_BP_GRP_R bg4 = MAM_BP_GRP_R.create("BG4");
				builder.addLeftOuterJoin(bg4, bp1.bp_grp_cd4.eq(bg4.bp_grp_cd)
						.and(bg4.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP4.value()))));
				builder.addWhereWithCutOffAnd(bg4.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm4)));
			}
			if (!isNull(up0().bp_grp_nm5())) {
				MAM_BP_GRP_R bg5 = MAM_BP_GRP_R.create("BG5");
				builder.addLeftOuterJoin(bg5, bp1.bp_grp_cd5.eq(bg5.bp_grp_cd)
						.and(bg5.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP5.value()))));
				builder.addWhereWithCutOffAnd(bg5.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm5)));
			}
			if (!isNull(up0().bp_grp_nm6())) {
				MAM_BP_GRP_R bg6 = MAM_BP_GRP_R.create("BG6");
				builder.addLeftOuterJoin(bg6, bp1.bp_grp_cd6.eq(bg6.bp_grp_cd)
						.and(bg6.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP6.value()))));
				builder.addWhereWithCutOffAnd(bg6.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm6)));
			}
			if (!isNull(up0().bp_grp_nm7())) {
				MAM_BP_GRP_R bg7 = MAM_BP_GRP_R.create("BG7");
				builder.addLeftOuterJoin(bg7, bp1.bp_grp_cd7.eq(bg7.bp_grp_cd)
						.and(bg7.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP7.value()))));
				builder.addWhereWithCutOffAnd(bg7.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm7)));
			}
			if (!isNull(up0().bp_grp_nm8())) {
				MAM_BP_GRP_R bg8 = MAM_BP_GRP_R.create("BG8");
				builder.addLeftOuterJoin(bg8, bp1.bp_grp_cd8.eq(bg8.bp_grp_cd)
						.and(bg8.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP8.value()))));
				builder.addWhereWithCutOffAnd(bg8.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm8)));
			}
			if (!isNull(up0().bp_grp_nm9())) {
				MAM_BP_GRP_R bg9 = MAM_BP_GRP_R.create("BG9");
				builder.addLeftOuterJoin(bg9, bp1.bp_grp_cd9.eq(bg9.bp_grp_cd)
						.and(bg9.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP9.value()))));
				builder.addWhereWithCutOffAnd(bg9.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm9)));
			}
			if (!isNull(up0().bp_grp_nm10())) {
				MAM_BP_GRP_R bg10 = MAM_BP_GRP_R.create("BG10");
				builder.addLeftOuterJoin(bg10, bp1.bp_grp_cd10.eq(bg10.bp_grp_cd)
						.and(bg10.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP10.value()))));
				builder.addWhereWithCutOffAnd(bg10.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm10)));
			}

				builder.addWhereWithCutOffAnd(bp1.bp_grp_cd1.like(bind(Srch01_CndR.$bp_grp_cd1)));
				builder.addWhereWithCutOffAnd(bp1.bp_grp_cd2.like(bind(Srch01_CndR.$bp_grp_cd2)));
				builder.addWhereWithCutOffAnd(bp1.bp_grp_cd3.like(bind(Srch01_CndR.$bp_grp_cd3)));
				builder.addWhereWithCutOffAnd(bp1.bp_grp_cd4.like(bind(Srch01_CndR.$bp_grp_cd4)));
				builder.addWhereWithCutOffAnd(bp1.bp_grp_cd5.like(bind(Srch01_CndR.$bp_grp_cd5)));
				builder.addWhereWithCutOffAnd(bp1.bp_grp_cd6.like(bind(Srch01_CndR.$bp_grp_cd6)));
				builder.addWhereWithCutOffAnd(bp1.bp_grp_cd7.like(bind(Srch01_CndR.$bp_grp_cd7)));
				builder.addWhereWithCutOffAnd(bp1.bp_grp_cd8.like(bind(Srch01_CndR.$bp_grp_cd8)));
				builder.addWhereWithCutOffAnd(bp1.bp_grp_cd9.like(bind(Srch01_CndR.$bp_grp_cd9)));
				builder.addWhereWithCutOffAnd(bp1.bp_grp_cd10.like(bind(Srch01_CndR.$bp_grp_cd10)));
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * ＦＢ ＩＦ制御マスタの削除を行います。<br>
	 */
	public class Del01 extends MABSL_FbIfCtlReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 登録対象の補正を行います。<br>
	 */
	public class Sprt01 extends MABSL_FbIfCtlReg_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * FbIfCtl_UpdChk01オペレーション.<p>
	 *
	 * ＦＢ ＩＦ制御マスタの登録前のチェックを行います。<br>
	 */
	public class FbIfCtl_UpdChk01 extends MABSL_FbIfCtlReg_MC_A.FbIfCtl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected IfValidater getConstExistValidater(String col, MCAppConst[] constArr) {
			// ＩＦ処理区分がＦＢ関連の処理かどうをチェックする
			List<MAC_IF_PROC_TYP> l = new ArrayList<MAC_IF_PROC_TYP>();
			for (MAC_IF_PROC_TYP ifProcTyp : MAC_IF_PROC_TYP.array()) {
				if (ifProcTyp.is_fb()) {
					l.add(ifProcTyp);
				}
			}
			if (isSame(col, FbIfCtl_UpdChk01_DtlR.$if_proc_typ)) {
				return new FXUCL_ConstValidater(
						(MCAppConst[]) l.toArray(new MCAppConst[0]));
			}
			return super.getConstExistValidater(col, constArr);
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for (FbIfCtl_UpdChk01_DtlR r : up0()) {
				if (r.del_flg()) {
					continue;
				}
				if (r.getBooleanNE("err_flg")) {
					continue;
				}

				// 固有チェック
				if (!isNull(r.ar_sttl_typ()) && !(MAC_AR_STTL_TYP.isCASH(r.ar_sttl_typ())
						|| MAC_AR_STTL_TYP.isBANK(r.ar_sttl_typ())
						|| MAC_AR_STTL_TYP.isNOTE(r.ar_sttl_typ()))) {
					msgList.add(new MCMessage(r, FbIfCtl_UpdChk01_DtlR.$ar_sttl_typ,
							MABSL0522, toDispGUIIndex(r)));
				}

				if (!MAC_AR_STTL_TYP.isBANK(r.ar_sttl_typ()) && !isNull(r.bank_cd())) {
					msgList.add(new MCMessage(r, FbIfCtl_UpdChk01_DtlR.$ar_sttl_typ,
							MABSL0523, toDispGUIIndex(r)));
				}

				if (!MAC_AR_STTL_TYP.isBANK(r.ar_sttl_typ()) && !isNull(r.bank_ac_cd())) {
					msgList.add(new MCMessage(r, FbIfCtl_UpdChk01_DtlR.$ar_sttl_typ,
							MABSL0524, toDispGUIIndex(r)));
				}

				if (!isNull(r.bp_cd()) && r.bp_cd_null_flg()) {
					msgList.add(new MCMessage(r, FbIfCtl_UpdChk01_DtlR.$bp_cd,
							MABSL0525, toDispGUIIndex(r)));
				}
				
			}
			return msgList;
		}
	}

	/**
	 * FbIfCtl_Upd01オペレーション.<p>
	 *
	 * ＦＢ ＩＦ制御マスタの登録を行います。<br>
	 */
	public class FbIfCtl_Upd01 extends MABSL_FbIfCtlReg_MC_A.FbIfCtl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * ＦＢ ＩＦ制御マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABSL_FbIfCtlReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}