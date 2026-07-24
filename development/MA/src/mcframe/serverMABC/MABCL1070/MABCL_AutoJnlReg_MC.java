package mcframe.serverMABC.MABCL1070;

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
import mcframe.serverMABC.MABCL1070.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.commonCore.container.MCRow.Status.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_AutoJnlReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_AutoJnlReg_MC extends MABCL_AutoJnlReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * AutoJnl_UpdChk01オペレーション.<p>
	 *
	 * 自動仕訳マスタの登録前のチェックを行います。<br>
	 */
	public class AutoJnl_UpdChk01 extends MABCL_AutoJnlReg_MC_A.AutoJnl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AutoJnl_Upd01オペレーション.<p>
	 *
	 * 自動仕訳マスタの登録を行います。<br>
	 */
	public class AutoJnl_Upd01 extends MABCL_AutoJnlReg_MC_A.AutoJnl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void checkStEndDtValid(MCList<R> dbc) {
			//適用開始日はKeyではないため空で上書き
		}

		@Override
		protected <R extends MCDBContainer> void afterUpdate(MCList<R> dbc) {
			super.afterUpdate(dbc);

			for (R r : dbc) {
				if (r instanceof MAM_AUTO_JNL_R) {
					checkDefaultFlg((MAM_AUTO_JNL_R) r);
				}
			}
		}

		/**
		 * 同一会計伝票区分・自動仕訳キー・自動仕訳Ｇ、かつ有効期間内でデフォルトＦＬＧ＝ＯＮは1件のみチェック
		 */
		protected void checkDefaultFlg(MAM_AUTO_JNL_R r) {
			if (!r.default_flg() || r.del_flg()) {
				return;
			}
			MAM_AUTO_JNL_R t = MAM_AUTO_JNL_R.create("T");
			int i = 0;
			if (isNull(r.auto_jnl_key_cd())) {
				i = execDbCount("MABCL1070_MAM_AUTO_JNL_S01", t,
						t.ac_slip_typ.eq(bind("ac_slip_typ"))
								.and(t.auto_jnl_key_cd.isNull())
								.and(t.auto_jnl_grp.eq(bind("auto_jnl_grp")))
								.and(t.jnl_ptn_cd.neq(bind("jnl_ptn_cd")))
								.and(t.default_flg.eq(value(true)))
								.and(t.del_flg.eq(value(false)))
								.and(t.st_dt.between(bind("st_dt"), bind("end_dt"))
										.or(bind("st_dt").between(t.st_dt, t.end_dt))),
						r);
			}
			else {
				i = execDbCount("MABCL1070_MAM_AUTO_JNL_S02", t,
						t.ac_slip_typ.eq(bind("ac_slip_typ"))
								.and(t.auto_jnl_key_cd.eq(bind("auto_jnl_key_cd")))
								.and(t.auto_jnl_grp.eq(bind("auto_jnl_grp")))
								.and(t.jnl_ptn_cd.neq(bind("jnl_ptn_cd")))
								.and(t.default_flg.eq(value(true)))
								.and(t.del_flg.eq(value(false)))
								.and(t.st_dt.between(bind("st_dt"), bind("end_dt"))
										.or(bind("st_dt").between(t.st_dt, t.end_dt))),
						r);
			}

			if (i > 0) {
				getMsgList().add(new MCMessage(r, MAM_AUTO_JNL_R.$default_flg, MABCL0002, r.ac_slip_typ(),
						r.auto_jnl_key_cd(), r.auto_jnl_grp(), toDispGUIIndex(r)));
			}
		}
	}
	/**
	 * AutoJnl_DelChk01オペレーション.<p>
	 *
	 * 自動仕訳マスタの削除前のチェックを行います。<br>
	 */
	public class AutoJnl_DelChk01 extends MABCL_AutoJnlReg_MC_A.AutoJnl_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AutoJnl_Del01オペレーション.<p>
	 *
	 * 自動仕訳マスタの削除を行います。<br>
	 */
	public class AutoJnl_Del01 extends MABCL_AutoJnlReg_MC_A.AutoJnl_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 自動仕訳マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_AutoJnlReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			dbcCustomizeSub(builder);
		}

		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			MAM_AUTO_JNL_R t = MAM_AUTO_JNL_R.create(builder.getBaseDbcAlias()); 
			/*適用日及び適用最終日をwhere句に追加しています。*/
			builder.addWhereWithCutOffAnd(t.st_dt.gte(bind(Srch01_CndR.$st_dt_fr)));
			builder.addWhereWithCutOffAnd(t.st_dt.lte(bind(Srch01_CndR.$st_dt_to)));
			builder.addWhereWithCutOffAnd(t.end_dt.gte(bind(Srch01_CndR.$end_dt_fr)));
			builder.addWhereWithCutOffAnd(t.end_dt.lte(bind(Srch01_CndR.$end_dt_to)));
			
			if(up0().no_auto_jnl_key_flg()){
			builder.addWhereWithAnd(t.auto_jnl_key_cd.isNull());
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 自動仕訳マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABCL_AutoJnlReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 自動仕訳マスタの削除を行います。<br>
	 */
	public class Del01 extends MABCL_AutoJnlReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}