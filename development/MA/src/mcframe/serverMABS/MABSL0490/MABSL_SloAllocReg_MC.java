package mcframe.serverMABS.MABSL0490;

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
import mcframe.serverMABS.MABSL0490.*; // このimportはFrameManagerの自動生成で追加されました。

import mcframe.serverFXUC.FXUCL0170.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MABSL_SloAllocReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABSL_SloAllocReg_MC extends MABSL_SloAllocReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * SloAlloc_UpdChk01オペレーション.<p>
	 *
	 * 受注引当マスタの登録前のチェックを行います。<br>
	 */
	public class SloAlloc_UpdChk01 extends MABSL_SloAllocReg_MC_A.SloAlloc_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();

			msgLst.addAll(checkWritableWgCdDac(
					up0().subList(r -> !MAC_STR.isNULL_VAL(r.wg_cd())),
					SloAlloc_UpdChk01_DtlR.$wg_cd));

			return msgLst;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();

			for (SloAlloc_UpdChk01_DtlR r : up0()) {
				if (r.del_flg()) {
					continue;
				}
				if (r.getBooleanNE("err_flg")) {
					continue ;
				}

				if (MAC_ALLOC_SCOPE_TYP.isALLOC_GRP(r.alloc_scope_typ())) {
					msgList.addAll(check(r, SloAlloc_UpdChk01_DtlR.$alloc_grp_cd,
							new FXUCL_RequiredValidater()));
				}
				else if (MAC_ALLOC_SCOPE_TYP.isLOC(r.alloc_scope_typ())) {
					if (!isNull(r.loc_cd()) && !isNull(r.alloc_grp_cd())
						|| !isNull(r.lg_grp_cd()) && !isNull(r.alloc_grp_cd())) {
						msgList.add(new MCMessage(r, SloAlloc_UpdChk01_DtlR.$alloc_grp_cd,
								MABSL0171, toDispGUIIndex(r)));
					}
				}

				if (!isNull(r.lg_grp_cd())
						&& !isSame(r.lg_grp_cd(), r.ship_loc_lg_grp_cd())) {
					msgList.add(new MCMessage(r, SloAlloc_UpdChk01_DtlR.$lg_grp_cd,
							MABSL0160, toDispGUIIndex(r)));
				}
				if (!isNull(r.alloc_grp_cd())
						&& !isSame(r.alloc_grp_cd(), r.ship_loc_alloc_grp_cd())) {
					msgList.add(new MCMessage(r, SloAlloc_UpdChk01_DtlR.$alloc_grp_cd,
							MABSL0161, toDispGUIIndex(r)));
				}
				if (!isNull(r.loc_cd()) && !isSame(r.loc_cd(), r.ship_loc_cd())) {
					msgList.add(new MCMessage(r, SloAlloc_UpdChk01_DtlR.$loc_cd,
							MABSL0162, toDispGUIIndex(r)));
				}
				if (!isNull(r.loc_cd())
						&& (!isNull(r.lg_grp_cd()) || !isNull(r.alloc_grp_cd()))) {
					msgList.add(new MCMessage(r, SloAlloc_UpdChk01_DtlR.$loc_cd,
							MABSL0170, toDispGUIIndex(r)));
				}
			}
			return msgList;
		}
	}

	/**
	 * SloAlloc_Upd01オペレーション.<p>
	 *
	 * 受注引当マスタの登録を行います。<br>
	 */
	public class SloAlloc_Upd01 extends MABSL_SloAllocReg_MC_A.SloAlloc_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void afterUpdate(MCList<R> dbc) {
			super.afterUpdate(dbc);

			for (R r : dbc) {
				if (dbc.createRow() instanceof MAM_SLO_ALLOC__R) {
					checkDefFlg((MAM_SLO_ALLOC__R) r);
				}
			}
		}

		/**
		 * 同一物流Ｇ・品目出荷Ｇ・ＷＧでデフォルトＦＬＧ＝ＯＮは1件のみチェック
		 */
		protected void checkDefFlg(MAM_SLO_ALLOC__R r) {
			if (!r.def_flg() || r.del_flg()) {
				return;
			}

			MAM_SLO_ALLOC__R t = MAM_SLO_ALLOC__R.create("T");
			int i = execDbCount("MABSL0490_MAM_SLO_ALLOC__S01", t,
					t.to_lg_grp_cd.eq(bind("to_lg_grp_cd"))
							.and(t.itm_ship_grp_cd.eq(bind("itm_ship_grp_cd")))
							.and(t.wg_cd.eq(bind("wg_cd")))
							.and(t.def_flg.eq(value(true)))
							.and(t.del_flg.eq(value(false))),
					r);

			if (i > 1) {
				getMsgList().add(new MCMessage(r, MAM_SLO_ALLOC__R.$def_flg, MABSL0169,
						r.to_lg_grp_cd(), r.itm_ship_grp_cd(), r.wg_cd(),
						toDispGUIIndex(r)));
			}
		}
	}

	/**
	 * SloAlloc_DelChk01オペレーション.<p>
	 *
	 * 受注引当マスタの削除前のチェックを行います。<br>
	 */
	public class SloAlloc_DelChk01 extends MABSL_SloAllocReg_MC_A.SloAlloc_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();

			msgLst.addAll(checkWritableWgCdDac(
					up0().subList(r -> !MAC_STR.isNULL_VAL(r.wg_cd())),
					SloAlloc_DelChk01_DtlR.$wg_cd));

			return msgLst;
		}
	}

	/**
	 * SloAlloc_Del01オペレーション.<p>
	 *
	 * 受注引当マスタの削除を行います。<br>
	 */
	public class SloAlloc_Del01 extends MABSL_SloAllocReg_MC_A.SloAlloc_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 受注引当マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABSL_SloAllocReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {

			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_SLO_ALLOC__R) {
				dbcCustomizeSub(builder);
			}
		}

		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			MAVM_RD_WG_R S1WG2 = MAVM_RD_WG_R.create("WG2");
			MAM_SLO_ALLOC__R t = MAM_SLO_ALLOC__R.create(builder.getBaseDbcAlias());
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
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 受注引当マスタの登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABSL_SloAllocReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 受注引当マスタの削除を行います。<br>
	 */
	public class Del01 extends MABSL_SloAllocReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}