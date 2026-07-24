package mcframe.serverMABG.MABGL0060;

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
import mcframe.serverMABG.MABGL0060.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverCore.sys.MCSys;
//FMCB CUSTOM_IMPORT END

/**
 * "MABGL_GrpCtgReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABGL_GrpCtgReg_MC extends MABGL_GrpCtgReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * GrpCtg_UpdChk01オペレーション.<p>
	 *
	 * 計算グループカテゴリマスタの登録前のチェックを行います。<br>
	 */
	public class GrpCtg_UpdChk01 extends MABGL_GrpCtgReg_MC_A.GrpCtg_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * GrpCtg_Upd01オペレーション.<p>
	 *
	 * 計算グループカテゴリマスタの登録を行います。<br>
	 */
	public class GrpCtg_Upd01 extends MABGL_GrpCtgReg_MC_A.GrpCtg_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void afterUpdate(MCList<R> dbc) {
			super.afterUpdate(dbc);

			for (R r : dbc) {
				if (r instanceof MAM_GRP_CTG_R) {
					// 既存レコード存在チェック
					checkExists((MAM_GRP_CTG_R) r);
				}
			}
		}

		/**
		 * 同一計算Ｇ・計算カテゴリ区分・優先順位で重複していないかチェックします。
		 * @param r ＤＢコンテナ
		 */
		protected void checkExists(MAM_GRP_CTG_R r) {

			if (r.isStatusCreate() || r.isStatusModify()) {
				MAM_GRP_CTG_R t = MAM_GRP_CTG_R.create("T");
				int i = execDbCount("MABGL0060_MAM_GRP_CTG_S01", t,
						t.calc_grp_cd.eq(bind("calc_grp_cd"))
						.and(t.calc_ctg_typ.eq(bind("calc_ctg_typ")))
						.and(t.ctg_prio.eq(bind("ctg_prio"))), r);

				if (i > 1) {
					getMsgList().add(new MCMessage(r, null, MABGL0032, r.calc_grp_cd(), r.ctg_prio(),
							MAC_CALC_CTG_TYP.get(r.calc_ctg_typ()).name(MCSys.user.locale())));
				}
			}
		}
	}
	/**
	 * GrpCtg_DelChk01オペレーション.<p>
	 *
	 * 計算グループカテゴリマスタの削除前のチェックを行います。<br>
	 */
	public class GrpCtg_DelChk01 extends MABGL_GrpCtgReg_MC_A.GrpCtg_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * GrpCtg_Del01オペレーション.<p>
	 *
	 * 計算グループカテゴリマスタの削除を行います。<br>
	 */
	public class GrpCtg_Del01 extends MABGL_GrpCtgReg_MC_A.GrpCtg_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 計算グループカテゴリマスタの検索を行います。<br>
	 */
	public class Srch01 extends MABGL_GrpCtgReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_GRP_CTG_R) {
				dbcCustomizeSub(builder);
			}
		}
		/**
		 * 計算グループマスタに登録されている計算グループＣＤのみ検索するためのSQL編集
		 * 
		 * @param dbc
		 */
		protected <R extends MCDBContainer> void dbcCustomizeSub(MCQueryApiBuilder builder) {
			MAM_CALC_GRP_R calc_grp1 = MAM_CALC_GRP_R.create(MAM_GRP_CTG_R.$CALC_GRP1);
			builder.addWhereWithCutOffAnd(calc_grp1.calc_grp_cd.isNotNull());
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 計算グループカテゴリマスタの登録を行います。<br>
	 */
	public class Upd01 extends MABGL_GrpCtgReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 計算グループカテゴリマスタの削除を行います。<br>
	 */
	public class Del01 extends MABGL_GrpCtgReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}